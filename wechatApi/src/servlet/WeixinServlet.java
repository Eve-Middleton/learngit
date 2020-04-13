package servlet;

import java.io.IOException;
import java.io.PrintWriter;
import java.util.Date;
import java.util.HashMap;
import java.util.Map;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import org.dom4j.DocumentException;

import po.InvokingApi;
import po.JsonText;
import po.TextMessage;
import util.CheckUtil;
import util.MessageUtil;

public class WeixinServlet extends HttpServlet {
	protected void doGet(HttpServletRequest req, HttpServletResponse resp)
			throws ServletException, IOException {
		// doPost(req, resp);
		// 微信服务器GET请求携带的四个参数
		// signature：微信加密签名，signature结合了开发者填写的token参数和请求中的timestamp参数、nonce参数
		String signature = req.getParameter("signature");// 注意括号里加双引号！！！
		// timestamp：时间戳
		String timestamp = req.getParameter("timestamp");
		// nonce：随机数
		String nonce = req.getParameter("nonce");
		// echostr：随机字符串
		String echostr = req.getParameter("echostr");

		// 调用CheckUtil类的checkSignature方法校验，真则返回echostr值
		PrintWriter out = resp.getWriter();
		if (CheckUtil.checkSignature(signature, timestamp, nonce)) {
			out.println(echostr);
		}
	}

	@Override
	protected void doPost(HttpServletRequest req, HttpServletResponse resp)
			throws ServletException, IOException {
		req.setCharacterEncoding("UTF-8");
		resp.setCharacterEncoding("UTF-8");
		PrintWriter out = resp.getWriter();
		try {
			Map<String, String> map = MessageUtil.xmlToMap(req);
			String fromUserName = map.get("FromUserName");
			String toUserName = map.get("ToUserName");
			String msgType = map.get("MsgType");
			String content = map.get("Content");// 用户发送的值

			String message = null;
			if (MessageUtil.message_text.equals(msgType)) {
				TextMessage text = new TextMessage();
				text.setFromUserName(toUserName);
				text.setToUserName(fromUserName);
				text.setMsgType(MessageUtil.message_text);
				text.setCreateTime(new Date().getTime());
				// HTTP请求
				String pathUrl = "http://149.129.113.103/wkapi.php";
				InvokingApi invokingApi = new InvokingApi();
				Map<String, Object> amap = new HashMap<String, Object>();
				amap.put("tm", content);
				String strjson = invokingApi.doPostOrGet(pathUrl, amap);
				System.out.println("返回json" + strjson);
				// JSON格式转成Map集合
				JsonText js = new JsonText();
				Map queMap = js.jsonText(strjson);

				StringBuilder returnque = new StringBuilder();
				returnque.append("\ue145").append(queMap.get("tm") + "\n");
				returnque.append("\ue03f").append(queMap.get("answer") + "\n");
				returnque.append("\ue145").append(queMap.get("asktm") + "\n");
				returnque.append("\ue03f").append(
						queMap.get("aksanswer") + "\n");
				returnque.append("\ue10f").append(queMap.get("option") + "\n");
				System.out.println(returnque);
				text.setContent("您的查询结果：--->\n" + returnque);

				message = MessageUtil.textMessageToXml(text);
			}
			out.print(message);
		} catch (DocumentException e) {
			e.printStackTrace();
		} finally {
			out.close();
		}

	}
}
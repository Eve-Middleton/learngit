package po;

import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;
import java.util.Map.Entry;

import com.alibaba.fastjson.*;

public class JsonText {

	// 将 Json 字符串. 格式化为 java对象.
	public Map jsonText(String json) {
		JSONObject obj = JSON.parseObject(json);
		// map对象
		Map<String, Object> data = new HashMap<String, Object>();
		// 循环转换
		Iterator it = obj.entrySet().iterator();
		while (it.hasNext()) {
			Map.Entry<String, Object> entry = (Entry<String, Object>) it.next();
			data.put(entry.getKey(), entry.getValue());
		}
		return data;
	}
}

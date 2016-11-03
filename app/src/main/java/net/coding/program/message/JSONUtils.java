package net.coding.program.message;

import com.alibaba.fastjson.JSON;
import com.alibaba.fastjson.JSONObject;

/**
 * Json解析工具包
 */
public class JSONUtils {

	public static <T> T getData(String key, String jsonString, Class<T> cls) {
		return JSON.parseObject(getJSONString(key, jsonString), cls);
	}

	public static <T> T getData(String jsonString, Class<T> cls){
		return JSONObject.parseObject(jsonString, cls);
	}

	public static String getJSONString(String key, String jsonStringString) {
		return JSONObject.parseObject(jsonStringString).getString(key);
	}
}
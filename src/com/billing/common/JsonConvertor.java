package com.billing.common;

import org.apache.commons.lang3.StringUtils;

import net.sf.ezmorph.object.DateMorpher;
import net.sf.json.JSONObject;
import net.sf.json.JSONSerializer;
import net.sf.json.JsonConfig;
import net.sf.json.util.JSONUtils;

public class JsonConvertor {
	public static <T> T convertToObject(String jsonString, Class<T> clazz) {
	    if (StringUtils.isEmpty(jsonString)) {
	      return null;
	    }
	    JsonConfig jsonConfig = new JsonConfig();
	    jsonConfig.setRootClass(clazz);
	    JSONUtils.getMorpherRegistry().registerMorpher(new DateMorpher(new String[] {"MM/dd/yyyy", "MM/dd/yyyy HH:mm:ss"}));
	    JSONObject jsonObject = (JSONObject) JSONSerializer.toJSON(jsonString);
	    return (T) JSONSerializer.toJava(jsonObject, jsonConfig);
    }
}

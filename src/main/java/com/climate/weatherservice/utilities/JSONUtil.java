package com.climate.weatherservice.utilities;

import com.fasterxml.jackson.core.JsonProcessingException;
import com.fasterxml.jackson.databind.JavaType;
import com.fasterxml.jackson.databind.ObjectMapper;

public class JSONUtil {

    private static ObjectMapper oMapper;

    static {
        oMapper = new ObjectMapper();
    }

    public static String convertJavaToJson(Object obj) {
        String resultAsJson = "";

        try {
            resultAsJson = oMapper.writeValueAsString(obj);
        } catch (JsonProcessingException e) {
            e.printStackTrace();
        }

        return resultAsJson;
    }

    public static <T> T convertJsonToJavaObj(String jsonString, Class<T> cls) {
        T resultAsJavaObject = null;
        try {
            resultAsJavaObject = oMapper.readValue(jsonString, cls);
        } catch (JsonProcessingException e) {
            e.printStackTrace();
        }

        return resultAsJavaObject;
    }
}

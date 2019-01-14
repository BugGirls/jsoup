package com.hndt.util;

import com.alibaba.fastjson.JSON;
import com.alibaba.fastjson.JSONObject;

import java.util.List;
import java.util.Map;

/**
 * FastJson 数据转换工具
 *
 * @author Hystar
 * @date 2018/10/15 0015
 */
public class JsonUtil {

    /**
     * Object 对象转换成JSON 字符串
     *
     * @param object
     * @return
     */
    public static String objectToJson(Object object) {
        return JSON.toJSONString(object);
    }

    /**
     * 转换为数组
     *
     * @param text
     * @param <T>
     * @return
     */
    public static <T> Object[] toArray(String text) {
        return toArray(text, null);
    }

    /**
     * 转换为数组
     *
     * @param text
     * @param clazz
     * @param <T>
     * @return
     */
    public static <T> Object[] toArray(String text, Class<T> clazz) {
        return JSON.parseArray(text, clazz).toArray();
    }

    /**
     * 转换为List
     *
     * @param text
     * @param clazz
     * @param <T>
     * @return
     */
    public static <T> List<T> toList(String text, Class<T> clazz) {
        return JSON.parseArray(text, clazz);
    }

    /**
     * 将string 转化为序列化的json 字符串
     *
     * @param text
     * @return
     */
    public static Object textToJson(String text) {
        Object objectJson = JSON.parse(text);
        return objectJson;
    }

    /**
     * JSON 字符串转化为map
     *
     * @param s
     * @return
     */
    public static <K, V> Map<K, V> stringToMap(String s) {
        Map<K, V> m = (Map<K, V>) JSONObject.parseObject(s);
        return m;
    }

    /**
     * 转换JSON 字符串为Object 对象
     *
     * @param jsonData
     * @param clazz
     * @return
     */
    public static Object jsonToObject(String jsonData, Class<?> clazz) {
        return JSONObject.parseObject(jsonData, clazz);
    }

    /**
     * Json 字符串转换为Object 对象
     *
     * @param text
     * @return
     */
    public static Object jsonToObject(String text) {
        return JSON.parse(text);
    }

    /**
     * 将map 转化为string
     *
     * @param m
     * @return
     */
    public static <K, V> String mapToString(Map<K, V> m) {
        String s = JSONObject.toJSONString(m);
        return s;
    }
}

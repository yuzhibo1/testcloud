package com.example.springmybatis2.utils;

import com.fasterxml.jackson.core.type.TypeReference;
import com.fasterxml.jackson.databind.JavaType;
import com.fasterxml.jackson.databind.ObjectMapper;

import java.util.List;
import java.util.Map;

/**
 * @ClassName(类名) : MatchString
 * @Description(描述) : TODO
 * @author(作者) ：lenovo
 * @date (开发日期)      ：2018/12/12
 */
public class JacksonUtil {
    public static ObjectMapper objectMapper;


    /**
     *
     * @Description(功能描述)    :  将JSON字符串转换为JavaBean
     * @author(作者)             ：  曹轩
     * @date (开发日期)          :  2016-4-1 下午4:24:20
     * @param jsonStr
     * @param valueType
     * @return  T
     */
    public static <T> T jsonToObject(String jsonStr, Class<T> valueType) {
        if (objectMapper == null) {
            objectMapper = new ObjectMapper();
        }
        try {
            return objectMapper.readValue(jsonStr, valueType);
        } catch (Exception e) {
            e.printStackTrace();
        }
        return null;
    }


    /**
     *
     * @Description(功能描述)    :  JavaBean转Json
     * @author(作者)             ：  曹轩
     * @date (开发日期)          :  2016-4-1 下午4:26:39
     * @param object
     * @return  String
     */
    public static String ObjectToJson(Object object) {
        if (objectMapper == null) {
            objectMapper = new ObjectMapper();
        }
        try {
            return objectMapper.writeValueAsString(object);
        } catch (Exception e) {
            e.printStackTrace();
        }
        return null;
    }

    /**
     *
     * @Description(功能描述)    :  json转map
     * @author(作者)             ：  曹轩
     * @date (开发日期)          :  2016-4-5 上午9:40:11
     * @exception                :
     * @param json
     * @return  Map<String,Object>
     */
    public static Map<String, Object> jsonToMap(String json){
        if (objectMapper == null) {
            objectMapper = new ObjectMapper();
        }
        try {
            return objectMapper.readValue(json, new TypeReference<Map<String, Object>>() {
            });
        } catch (Exception e) {
            e.printStackTrace();
        }
        return null;
    }

    /**
     *
     * @Description(功能描述)    :  map转json
     * @author(作者)             ：  曹轩
     * @date (开发日期)          :  2016-4-7 下午1:12:38
     * @exception                :
     * @param map
     * @return  String
     */
    public static String mapToJson(Map<String, Object> map){
        if (objectMapper == null) {
            objectMapper = new ObjectMapper();
        }
        try {
            return objectMapper.writeValueAsString(map);
        } catch (Exception e) {
            e.printStackTrace();
        }
        return null;
    }

    /**
     *
     * @Description(功能描述)    :  json转list
     * @author(作者)             ：  曹轩
     * @param <T>
     * @date (开发日期)          :  2016-5-30 下午1:00:45
     * @exception                :
     * @param json
     * @param collectionClass
     * @param elementClasses
     * @return  List<?>
     */
    @SuppressWarnings("unchecked")
    public static <T> List<T> jsonToCollection(String json, Class<?> collectionClass, Class<T> elementClasses){
        if (objectMapper == null) {
            objectMapper = new ObjectMapper();
        }
        JavaType javaType = getCollectionType(collectionClass, elementClasses);
        List<T> list =null;
        try {
            list = (List<T>)objectMapper.readValue(json, javaType);
        } catch (Exception e) {
            e.printStackTrace();
        }
        return list ;
    }

    /**
     *
     * @Description(功能描述)    :  获取泛型的Collection Type
     * @author(作者)             ：  曹轩
     * @date (开发日期)          :  2016-5-30 下午12:58:52
     * @exception                :
     * @param collectionClass
     * @param elementClasses
     * @return  JavaType
     */
    @SuppressWarnings("deprecation")
    private static JavaType getCollectionType(Class<?> collectionClass, Class<?>... elementClasses) {
        if (objectMapper == null) {
            objectMapper = new ObjectMapper();
        }
        return  objectMapper.getTypeFactory().constructParametricType(collectionClass, elementClasses);
    }
}

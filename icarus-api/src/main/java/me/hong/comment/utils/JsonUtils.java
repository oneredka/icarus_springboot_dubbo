package me.hong.comment.utils;

import com.fasterxml.jackson.databind.JavaType;

public class JsonUtils {
    private static final JsonMapper mapper = new JsonMapper();
    private static final JsonMapper nonEmptyMapper = JsonMapper.nonEmptyMapper();
    private static final JsonMapper nonNullMapper = JsonMapper.nonNullMapper();

    public static String toJson(Object object) {
        return mapper.toJson(object);
    }

    public static String toJsonNonEmpty(Object object) {
        return nonEmptyMapper.toJson(object);
    }

    public static String toJsonNonNull(Object object) {
        return nonNullMapper.toJson(object);
    }

    public static <T> T fromJson(String jsonString, Class<T> clazz) {
        return mapper.fromJson(jsonString, clazz);
    }

    public static <T> T fromJson(String jsonString, JavaType javaType) {
        return mapper.fromJson(jsonString, javaType);
    }

    public static <T> T fromJson(String jsonString, Class<?> collectionClass, Class<?>... elementClasses) {
        return mapper.fromJson(jsonString, mapper.createCollectionType(collectionClass, elementClasses));
    }
}

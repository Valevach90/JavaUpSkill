package org.example.util;

import com.google.gson.*;

import java.lang.reflect.Type;

public final class InterfaceSerializerJSON<T> implements JsonSerializer<T>, JsonDeserializer<T> {

    private final Class<T> implementationClass;

    private InterfaceSerializerJSON(final Class<T> implementationClass) {
        this.implementationClass = implementationClass;
    }

    public static <T> InterfaceSerializerJSON<T> interfaceSerializer(final Class<T> implementationClass) {
        return new InterfaceSerializerJSON<>(implementationClass);
    }

    @Override
    public JsonElement serialize(final T value, final Type type, final JsonSerializationContext context) {
        final Type targetType = value != null
                ? value.getClass()
                : type;
        return context.serialize(value, targetType);
    }

    @Override
    public T deserialize(final JsonElement jsonElement, final Type typeOfT, final JsonDeserializationContext context) {
        return context.deserialize(jsonElement, implementationClass);
    }

}


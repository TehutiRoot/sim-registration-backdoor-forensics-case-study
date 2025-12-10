package com.fasterxml.jackson.databind.util;

import ch.qos.logback.core.CoreConstants;
import com.fasterxml.jackson.core.JsonGenerator;
import com.fasterxml.jackson.core.JsonpCharacterEscapes;
import com.fasterxml.jackson.databind.BeanProperty;
import com.fasterxml.jackson.databind.JavaType;
import com.fasterxml.jackson.databind.JsonSerializable;
import com.fasterxml.jackson.databind.SerializerProvider;
import com.fasterxml.jackson.databind.jsontype.TypeSerializer;
import java.io.IOException;

/* loaded from: classes3.dex */
public class JSONPObject implements JsonSerializable {
    protected final String _function;
    protected final JavaType _serializationType;
    protected final Object _value;

    public JSONPObject(String str, Object obj) {
        this(str, obj, null);
    }

    public String getFunction() {
        return this._function;
    }

    public JavaType getSerializationType() {
        return this._serializationType;
    }

    public Object getValue() {
        return this._value;
    }

    @Override // com.fasterxml.jackson.databind.JsonSerializable
    public void serialize(JsonGenerator jsonGenerator, SerializerProvider serializerProvider) throws IOException {
        boolean z;
        jsonGenerator.writeRaw(this._function);
        jsonGenerator.writeRaw(CoreConstants.LEFT_PARENTHESIS_CHAR);
        if (this._value == null) {
            serializerProvider.defaultSerializeNull(jsonGenerator);
        } else {
            if (jsonGenerator.getCharacterEscapes() == null) {
                z = true;
            } else {
                z = false;
            }
            if (z) {
                jsonGenerator.setCharacterEscapes(JsonpCharacterEscapes.instance());
            }
            try {
                JavaType javaType = this._serializationType;
                if (javaType != null) {
                    serializerProvider.findTypedValueSerializer(javaType, true, (BeanProperty) null).serialize(this._value, jsonGenerator, serializerProvider);
                } else {
                    serializerProvider.findTypedValueSerializer(this._value.getClass(), true, (BeanProperty) null).serialize(this._value, jsonGenerator, serializerProvider);
                }
                if (z) {
                    jsonGenerator.setCharacterEscapes(null);
                }
            } catch (Throwable th2) {
                if (z) {
                    jsonGenerator.setCharacterEscapes(null);
                }
                throw th2;
            }
        }
        jsonGenerator.writeRaw(CoreConstants.RIGHT_PARENTHESIS_CHAR);
    }

    @Override // com.fasterxml.jackson.databind.JsonSerializable
    public void serializeWithType(JsonGenerator jsonGenerator, SerializerProvider serializerProvider, TypeSerializer typeSerializer) throws IOException {
        serialize(jsonGenerator, serializerProvider);
    }

    public JSONPObject(String str, Object obj, JavaType javaType) {
        this._function = str;
        this._value = obj;
        this._serializationType = javaType;
    }
}
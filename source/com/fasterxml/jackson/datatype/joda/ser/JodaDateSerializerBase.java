package com.fasterxml.jackson.datatype.joda.ser;

import androidx.constraintlayout.core.motion.utils.TypedValues;
import com.fasterxml.jackson.annotation.JsonFormat;
import com.fasterxml.jackson.core.JsonGenerator;
import com.fasterxml.jackson.core.JsonParser;
import com.fasterxml.jackson.databind.BeanProperty;
import com.fasterxml.jackson.databind.JavaType;
import com.fasterxml.jackson.databind.JsonMappingException;
import com.fasterxml.jackson.databind.JsonNode;
import com.fasterxml.jackson.databind.JsonSerializer;
import com.fasterxml.jackson.databind.SerializationFeature;
import com.fasterxml.jackson.databind.SerializerProvider;
import com.fasterxml.jackson.databind.jsonFormatVisitors.JsonArrayFormatVisitor;
import com.fasterxml.jackson.databind.jsonFormatVisitors.JsonFormatTypes;
import com.fasterxml.jackson.databind.jsonFormatVisitors.JsonFormatVisitorWrapper;
import com.fasterxml.jackson.databind.jsonFormatVisitors.JsonIntegerFormatVisitor;
import com.fasterxml.jackson.databind.jsonFormatVisitors.JsonStringFormatVisitor;
import com.fasterxml.jackson.databind.jsonFormatVisitors.JsonValueFormat;
import com.fasterxml.jackson.databind.jsontype.TypeSerializer;
import com.fasterxml.jackson.databind.ser.ContextualSerializer;
import com.fasterxml.jackson.datatype.joda.cfg.JacksonJodaDateFormat;
import java.io.IOException;
import java.lang.reflect.Type;

/* loaded from: classes3.dex */
public abstract class JodaDateSerializerBase<T> extends JodaSerializerBase<T> implements ContextualSerializer {
    protected static final int FORMAT_ARRAY = 3;
    protected static final int FORMAT_STRING = 1;
    protected static final int FORMAT_TIMESTAMP = 2;
    private static final long serialVersionUID = 1;
    protected final int _defaultNumericShape;
    protected final SerializationFeature _featureForNumeric;
    protected final JacksonJodaDateFormat _format;
    protected final int _shapeOverride;

    public JodaDateSerializerBase(Class<T> cls, JacksonJodaDateFormat jacksonJodaDateFormat, SerializationFeature serializationFeature, int i, int i2) {
        super(cls);
        this._format = jacksonJodaDateFormat;
        this._featureForNumeric = serializationFeature;
        this._defaultNumericShape = i;
        this._shapeOverride = i2;
    }

    public int _serializationShape(SerializerProvider serializerProvider) {
        int i = this._shapeOverride;
        if (i == 0) {
            if (this._format.useTimestamp(serializerProvider, this._featureForNumeric)) {
                return this._defaultNumericShape;
            }
            return 1;
        }
        return i;
    }

    @Override // com.fasterxml.jackson.databind.ser.std.StdSerializer, com.fasterxml.jackson.databind.JsonSerializer, com.fasterxml.jackson.databind.jsonFormatVisitors.JsonFormatVisitable
    public void acceptJsonFormatVisitor(JsonFormatVisitorWrapper jsonFormatVisitorWrapper, JavaType javaType) throws JsonMappingException {
        int _serializationShape = _serializationShape(jsonFormatVisitorWrapper.getProvider());
        if (_serializationShape != 2) {
            if (_serializationShape != 3) {
                JsonStringFormatVisitor expectStringFormat = jsonFormatVisitorWrapper.expectStringFormat(javaType);
                if (expectStringFormat != null) {
                    expectStringFormat.format(JsonValueFormat.DATE_TIME);
                    return;
                }
                return;
            }
            JsonArrayFormatVisitor expectArrayFormat = jsonFormatVisitorWrapper.expectArrayFormat(javaType);
            if (expectArrayFormat != null) {
                expectArrayFormat.itemsFormat(JsonFormatTypes.INTEGER);
                return;
            }
            return;
        }
        JsonIntegerFormatVisitor expectIntegerFormat = jsonFormatVisitorWrapper.expectIntegerFormat(javaType);
        if (expectIntegerFormat != null) {
            expectIntegerFormat.numberType(JsonParser.NumberType.LONG);
            expectIntegerFormat.format(JsonValueFormat.UTC_MILLISEC);
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // com.fasterxml.jackson.databind.ser.ContextualSerializer
    public JsonSerializer<?> createContextual(SerializerProvider serializerProvider, BeanProperty beanProperty) throws JsonMappingException {
        Boolean bool;
        int i;
        JsonFormat.Value findFormatOverrides = findFormatOverrides(serializerProvider, beanProperty, handledType());
        if (findFormatOverrides != null) {
            JacksonJodaDateFormat jacksonJodaDateFormat = this._format;
            JsonFormat.Shape shape = findFormatOverrides.getShape();
            if (shape.isNumeric()) {
                bool = Boolean.TRUE;
                i = 2;
            } else if (shape == JsonFormat.Shape.STRING) {
                bool = Boolean.FALSE;
                i = 1;
            } else if (shape == JsonFormat.Shape.ARRAY) {
                bool = Boolean.TRUE;
                i = 3;
            } else {
                bool = null;
                i = 0;
            }
            if (bool != null) {
                jacksonJodaDateFormat = jacksonJodaDateFormat.withUseTimestamp(bool);
            }
            JacksonJodaDateFormat with = jacksonJodaDateFormat.with(findFormatOverrides);
            if (with != this._format || i != this._shapeOverride) {
                return withFormat(with, i);
            }
        }
        return this;
    }

    @Override // com.fasterxml.jackson.databind.ser.std.StdSerializer, com.fasterxml.jackson.databind.jsonschema.SchemaAware
    public JsonNode getSchema(SerializerProvider serializerProvider, Type type) {
        int _serializationShape = _serializationShape(serializerProvider);
        if (_serializationShape != 2) {
            if (_serializationShape != 3) {
                return createSchemaNode(TypedValues.Custom.S_STRING, true);
            }
            return createSchemaNode("number", true);
        }
        return createSchemaNode("array", true);
    }

    @Override // com.fasterxml.jackson.databind.JsonSerializer
    public boolean isEmpty(SerializerProvider serializerProvider, T t) {
        return t == null;
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // com.fasterxml.jackson.datatype.joda.ser.JodaSerializerBase, com.fasterxml.jackson.databind.JsonSerializer
    public /* bridge */ /* synthetic */ void serializeWithType(Object obj, JsonGenerator jsonGenerator, SerializerProvider serializerProvider, TypeSerializer typeSerializer) throws IOException {
        super.serializeWithType(obj, jsonGenerator, serializerProvider, typeSerializer);
    }

    public abstract JodaDateSerializerBase<T> withFormat(JacksonJodaDateFormat jacksonJodaDateFormat, int i);

    public boolean writeWithZoneId(SerializerProvider serializerProvider) {
        return this._format.shouldWriteWithZoneId(serializerProvider);
    }
}

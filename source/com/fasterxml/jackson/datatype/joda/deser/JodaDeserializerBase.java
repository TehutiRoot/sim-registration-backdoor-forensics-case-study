package com.fasterxml.jackson.datatype.joda.deser;

import com.fasterxml.jackson.core.JsonParser;
import com.fasterxml.jackson.databind.DeserializationContext;
import com.fasterxml.jackson.databind.deser.std.StdScalarDeserializer;
import com.fasterxml.jackson.databind.jsontype.TypeDeserializer;
import java.io.IOException;

/* loaded from: classes3.dex */
abstract class JodaDeserializerBase<T> extends StdScalarDeserializer<T> {
    public JodaDeserializerBase(Class<?> cls) {
        super(cls);
    }

    public T _handleNotNumberOrString(JsonParser jsonParser, DeserializationContext deserializationContext) throws IOException {
        return (T) deserializationContext.handleUnexpectedToken(handledType(), jsonParser.getCurrentToken(), jsonParser, "expected JSON Number or String", new Object[0]);
    }

    @Override // com.fasterxml.jackson.databind.deser.std.StdScalarDeserializer, com.fasterxml.jackson.databind.deser.std.StdDeserializer, com.fasterxml.jackson.databind.JsonDeserializer
    public Object deserializeWithType(JsonParser jsonParser, DeserializationContext deserializationContext, TypeDeserializer typeDeserializer) throws IOException {
        return typeDeserializer.deserializeTypedFromAny(jsonParser, deserializationContext);
    }

    public JodaDeserializerBase(JodaDeserializerBase<?> jodaDeserializerBase) {
        super(jodaDeserializerBase);
    }
}

package com.fasterxml.jackson.datatype.joda.deser;

import com.fasterxml.jackson.annotation.JsonFormat;
import com.fasterxml.jackson.core.JsonParser;
import com.fasterxml.jackson.databind.BeanProperty;
import com.fasterxml.jackson.databind.DeserializationContext;
import com.fasterxml.jackson.databind.JsonDeserializer;
import com.fasterxml.jackson.databind.JsonMappingException;
import com.fasterxml.jackson.databind.deser.ContextualDeserializer;
import com.fasterxml.jackson.databind.jsontype.TypeDeserializer;
import com.fasterxml.jackson.datatype.joda.cfg.JacksonJodaDateFormat;
import java.io.IOException;

/* loaded from: classes3.dex */
public abstract class JodaDateDeserializerBase<T> extends JodaDeserializerBase<T> implements ContextualDeserializer {
    private static final long serialVersionUID = 1;
    protected final JacksonJodaDateFormat _format;

    public JodaDateDeserializerBase(Class<?> cls, JacksonJodaDateFormat jacksonJodaDateFormat) {
        super(cls);
        this._format = jacksonJodaDateFormat;
    }

    @Override // com.fasterxml.jackson.datatype.joda.deser.JodaDeserializerBase
    public /* bridge */ /* synthetic */ Object _handleNotNumberOrString(JsonParser jsonParser, DeserializationContext deserializationContext) throws IOException {
        return super._handleNotNumberOrString(jsonParser, deserializationContext);
    }

    @Override // com.fasterxml.jackson.databind.deser.ContextualDeserializer
    public JsonDeserializer<?> createContextual(DeserializationContext deserializationContext, BeanProperty beanProperty) throws JsonMappingException {
        Boolean bool;
        JsonFormat.Value findFormatOverrides = findFormatOverrides(deserializationContext, beanProperty, handledType());
        if (findFormatOverrides != null) {
            JacksonJodaDateFormat jacksonJodaDateFormat = this._format;
            if (findFormatOverrides.getShape().isNumeric()) {
                bool = Boolean.TRUE;
            } else if (findFormatOverrides.getShape() == JsonFormat.Shape.STRING) {
                bool = Boolean.FALSE;
            } else if (findFormatOverrides.getShape() == JsonFormat.Shape.ARRAY) {
                bool = Boolean.TRUE;
            } else {
                bool = null;
            }
            if (bool != null) {
                jacksonJodaDateFormat = jacksonJodaDateFormat.withUseTimestamp(bool);
            }
            JacksonJodaDateFormat with = jacksonJodaDateFormat.with(findFormatOverrides);
            if (with != this._format) {
                return withFormat(with);
            }
        }
        return this;
    }

    @Override // com.fasterxml.jackson.datatype.joda.deser.JodaDeserializerBase, com.fasterxml.jackson.databind.deser.std.StdScalarDeserializer, com.fasterxml.jackson.databind.deser.std.StdDeserializer, com.fasterxml.jackson.databind.JsonDeserializer
    public /* bridge */ /* synthetic */ Object deserializeWithType(JsonParser jsonParser, DeserializationContext deserializationContext, TypeDeserializer typeDeserializer) throws IOException {
        return super.deserializeWithType(jsonParser, deserializationContext, typeDeserializer);
    }

    public abstract JodaDateDeserializerBase<?> withFormat(JacksonJodaDateFormat jacksonJodaDateFormat);
}

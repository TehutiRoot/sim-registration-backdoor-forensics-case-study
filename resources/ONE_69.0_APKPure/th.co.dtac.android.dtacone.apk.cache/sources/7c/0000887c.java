package com.fasterxml.jackson.datatype.joda.deser;

import com.fasterxml.jackson.core.JsonParser;
import com.fasterxml.jackson.core.JsonToken;
import com.fasterxml.jackson.databind.DeserializationContext;
import com.fasterxml.jackson.databind.jsontype.TypeDeserializer;
import java.io.IOException;
import org.joda.time.DateTimeZone;

/* loaded from: classes3.dex */
public class DateTimeZoneDeserializer extends JodaDeserializerBase<DateTimeZone> {
    private static final long serialVersionUID = 1;

    public DateTimeZoneDeserializer() {
        super(DateTimeZone.class);
    }

    @Override // com.fasterxml.jackson.datatype.joda.deser.JodaDeserializerBase, com.fasterxml.jackson.databind.deser.std.StdScalarDeserializer, com.fasterxml.jackson.databind.deser.std.StdDeserializer, com.fasterxml.jackson.databind.JsonDeserializer
    public /* bridge */ /* synthetic */ Object deserializeWithType(JsonParser jsonParser, DeserializationContext deserializationContext, TypeDeserializer typeDeserializer) throws IOException {
        return super.deserializeWithType(jsonParser, deserializationContext, typeDeserializer);
    }

    @Override // com.fasterxml.jackson.databind.JsonDeserializer
    public DateTimeZone deserialize(JsonParser jsonParser, DeserializationContext deserializationContext) throws IOException {
        JsonToken currentToken = jsonParser.getCurrentToken();
        if (currentToken == JsonToken.VALUE_NUMBER_INT) {
            return DateTimeZone.forOffsetHours(jsonParser.getIntValue());
        }
        if (currentToken == JsonToken.VALUE_STRING) {
            return DateTimeZone.forID(jsonParser.getText().trim());
        }
        return _handleNotNumberOrString(jsonParser, deserializationContext);
    }
}
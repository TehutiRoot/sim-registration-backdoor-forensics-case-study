package com.fasterxml.jackson.datatype.joda.deser;

import com.fasterxml.jackson.core.JsonParser;
import com.fasterxml.jackson.core.JsonToken;
import com.fasterxml.jackson.databind.DeserializationContext;
import com.fasterxml.jackson.datatype.joda.cfg.FormatConfig;
import com.fasterxml.jackson.datatype.joda.cfg.JacksonJodaDateFormat;
import java.io.IOException;
import org.joda.time.DateTimeZone;
import org.joda.time.LocalDate;

/* loaded from: classes3.dex */
public class LocalDateDeserializer extends JodaDateDeserializerBase<LocalDate> {
    private static final long serialVersionUID = 1;

    public LocalDateDeserializer() {
        this(FormatConfig.DEFAULT_LOCAL_DATEONLY_FORMAT);
    }

    @Override // com.fasterxml.jackson.datatype.joda.deser.JodaDateDeserializerBase
    public JodaDateDeserializerBase<?> withFormat(JacksonJodaDateFormat jacksonJodaDateFormat) {
        return new LocalDateDeserializer(jacksonJodaDateFormat);
    }

    public LocalDateDeserializer(JacksonJodaDateFormat jacksonJodaDateFormat) {
        super(LocalDate.class, jacksonJodaDateFormat);
    }

    @Override // com.fasterxml.jackson.databind.JsonDeserializer
    public LocalDate deserialize(JsonParser jsonParser, DeserializationContext deserializationContext) throws IOException {
        int currentTokenId = jsonParser.getCurrentTokenId();
        if (currentTokenId != 3) {
            if (currentTokenId != 6) {
                if (currentTokenId != 7) {
                    return (LocalDate) deserializationContext.handleUnexpectedToken(handledType(), jsonParser.getCurrentToken(), jsonParser, "expected String, Number or JSON Array", new Object[0]);
                }
                return new LocalDate(jsonParser.getLongValue(), this._format.isTimezoneExplicit() ? this._format.getTimeZone() : DateTimeZone.forTimeZone(deserializationContext.getTimeZone()));
            }
            String trim = jsonParser.getText().trim();
            if (trim.length() == 0) {
                return null;
            }
            return this._format.createParser(deserializationContext).parseLocalDate(trim);
        }
        int nextIntValue = jsonParser.nextIntValue(-1);
        if (nextIntValue == -1) {
            nextIntValue = _parseIntPrimitive(jsonParser, deserializationContext);
        }
        int nextIntValue2 = jsonParser.nextIntValue(-1);
        if (nextIntValue2 == -1) {
            nextIntValue2 = _parseIntPrimitive(jsonParser, deserializationContext);
        }
        int nextIntValue3 = jsonParser.nextIntValue(-1);
        if (nextIntValue3 == -1) {
            nextIntValue3 = _parseIntPrimitive(jsonParser, deserializationContext);
        }
        JsonToken nextToken = jsonParser.nextToken();
        JsonToken jsonToken = JsonToken.END_ARRAY;
        if (nextToken == jsonToken) {
            return new LocalDate(nextIntValue, nextIntValue2, nextIntValue3);
        }
        throw deserializationContext.wrongTokenException(jsonParser, handledType(), jsonToken, "after LocalDate ints");
    }
}

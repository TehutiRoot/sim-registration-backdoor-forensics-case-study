package com.fasterxml.jackson.datatype.joda.deser;

import com.fasterxml.jackson.core.JsonParser;
import com.fasterxml.jackson.core.JsonToken;
import com.fasterxml.jackson.databind.DeserializationContext;
import com.fasterxml.jackson.datatype.joda.cfg.FormatConfig;
import com.fasterxml.jackson.datatype.joda.cfg.JacksonJodaDateFormat;
import java.io.IOException;
import org.joda.time.DateTimeZone;
import org.joda.time.LocalDateTime;

/* loaded from: classes3.dex */
public class LocalDateTimeDeserializer extends JodaDateDeserializerBase<LocalDateTime> {
    private static final long serialVersionUID = 1;

    public LocalDateTimeDeserializer() {
        this(FormatConfig.DEFAULT_LOCAL_DATETIME_PARSER);
    }

    @Override // com.fasterxml.jackson.datatype.joda.deser.JodaDateDeserializerBase
    public JodaDateDeserializerBase<?> withFormat(JacksonJodaDateFormat jacksonJodaDateFormat) {
        return new LocalDateTimeDeserializer(jacksonJodaDateFormat);
    }

    public LocalDateTimeDeserializer(JacksonJodaDateFormat jacksonJodaDateFormat) {
        super(LocalDateTime.class, jacksonJodaDateFormat);
    }

    @Override // com.fasterxml.jackson.databind.JsonDeserializer
    public LocalDateTime deserialize(JsonParser jsonParser, DeserializationContext deserializationContext) throws IOException {
        int i;
        int currentTokenId = jsonParser.getCurrentTokenId();
        LocalDateTime localDateTime = null;
        if (currentTokenId != 3) {
            if (currentTokenId != 6) {
                if (currentTokenId != 7) {
                    return (LocalDateTime) deserializationContext.handleUnexpectedToken(handledType(), jsonParser.getCurrentToken(), jsonParser, "expected String, Number or JSON Array", new Object[0]);
                }
                return new LocalDateTime(jsonParser.getLongValue(), this._format.isTimezoneExplicit() ? this._format.getTimeZone() : DateTimeZone.forTimeZone(deserializationContext.getTimeZone()));
            }
            String trim = jsonParser.getText().trim();
            if (trim.length() == 0) {
                return null;
            }
            return this._format.createParser(deserializationContext).parseLocalDateTime(trim);
        }
        JsonToken nextToken = jsonParser.nextToken();
        if (nextToken.isNumeric()) {
            int intValue = jsonParser.getIntValue();
            nextToken = jsonParser.nextToken();
            if (nextToken.isNumeric()) {
                int intValue2 = jsonParser.getIntValue();
                nextToken = jsonParser.nextToken();
                if (nextToken.isNumeric()) {
                    int intValue3 = jsonParser.getIntValue();
                    nextToken = jsonParser.nextToken();
                    if (nextToken.isNumeric()) {
                        int intValue4 = jsonParser.getIntValue();
                        nextToken = jsonParser.nextToken();
                        if (nextToken.isNumeric()) {
                            int intValue5 = jsonParser.getIntValue();
                            nextToken = jsonParser.nextToken();
                            if (nextToken.isNumeric()) {
                                int intValue6 = jsonParser.getIntValue();
                                nextToken = jsonParser.nextToken();
                                if (nextToken.isNumeric()) {
                                    int intValue7 = jsonParser.getIntValue();
                                    nextToken = jsonParser.nextToken();
                                    i = intValue7;
                                } else {
                                    i = 0;
                                }
                                localDateTime = new LocalDateTime(intValue, intValue2, intValue3, intValue4, intValue5, intValue6, i);
                            }
                        }
                    }
                }
            }
        }
        JsonToken jsonToken = JsonToken.END_ARRAY;
        if (nextToken == jsonToken) {
            return localDateTime;
        }
        throw deserializationContext.wrongTokenException(jsonParser, handledType(), jsonToken, "after LocalDateTime ints");
    }
}

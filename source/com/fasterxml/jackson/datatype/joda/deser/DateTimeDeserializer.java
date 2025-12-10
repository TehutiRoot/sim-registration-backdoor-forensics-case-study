package com.fasterxml.jackson.datatype.joda.deser;

import com.fasterxml.jackson.core.JsonParser;
import com.fasterxml.jackson.core.JsonToken;
import com.fasterxml.jackson.databind.DeserializationContext;
import com.fasterxml.jackson.databind.JsonDeserializer;
import com.fasterxml.jackson.datatype.joda.cfg.FormatConfig;
import com.fasterxml.jackson.datatype.joda.cfg.JacksonJodaDateFormat;
import java.io.IOException;
import org.joda.time.DateTime;
import org.joda.time.DateTimeZone;
import org.joda.time.ReadableInstant;

/* loaded from: classes3.dex */
public class DateTimeDeserializer extends JodaDateDeserializerBase<ReadableInstant> {
    private static final long serialVersionUID = 1;

    public DateTimeDeserializer(Class<?> cls, JacksonJodaDateFormat jacksonJodaDateFormat) {
        super(cls, jacksonJodaDateFormat);
    }

    public static <T extends ReadableInstant> JsonDeserializer<T> forType(Class<T> cls) {
        return new DateTimeDeserializer(cls, FormatConfig.DEFAULT_DATETIME_PARSER);
    }

    @Override // com.fasterxml.jackson.datatype.joda.deser.JodaDateDeserializerBase
    public JodaDateDeserializerBase<?> withFormat(JacksonJodaDateFormat jacksonJodaDateFormat) {
        return new DateTimeDeserializer(this._valueClass, jacksonJodaDateFormat);
    }

    @Override // com.fasterxml.jackson.databind.JsonDeserializer
    public ReadableInstant deserialize(JsonParser jsonParser, DeserializationContext deserializationContext) throws IOException {
        String substring;
        JsonToken currentToken = jsonParser.getCurrentToken();
        if (currentToken == JsonToken.VALUE_NUMBER_INT) {
            return new DateTime(jsonParser.getLongValue(), this._format.isTimezoneExplicit() ? this._format.getTimeZone() : DateTimeZone.forTimeZone(deserializationContext.getTimeZone()));
        } else if (currentToken == JsonToken.VALUE_STRING) {
            String trim = jsonParser.getText().trim();
            DateTimeZone dateTimeZone = null;
            if (trim.length() == 0) {
                return null;
            }
            int indexOf = trim.indexOf(91);
            if (indexOf > 0) {
                int lastIndexOf = trim.lastIndexOf(93);
                if (lastIndexOf < indexOf) {
                    substring = trim.substring(indexOf + 1);
                } else {
                    substring = trim.substring(indexOf + 1, lastIndexOf);
                }
                try {
                    dateTimeZone = DateTimeZone.forID(substring);
                } catch (IllegalArgumentException unused) {
                    deserializationContext.reportInputMismatch(handledType(), "Unknown DateTimeZone id '%s'", substring);
                }
                DateTime parseDateTime = this._format.createParser(deserializationContext).withZone(dateTimeZone).parseDateTime(trim.substring(0, indexOf));
                return this._format.shouldAdjustToContextTimeZone(deserializationContext) ? parseDateTime.withZone(this._format.getTimeZone()) : parseDateTime;
            }
            return this._format.createParser(deserializationContext).parseDateTime(trim);
        } else {
            return (ReadableInstant) _handleNotNumberOrString(jsonParser, deserializationContext);
        }
    }
}

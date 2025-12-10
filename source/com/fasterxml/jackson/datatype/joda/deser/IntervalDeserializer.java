package com.fasterxml.jackson.datatype.joda.deser;

import com.fasterxml.jackson.core.JsonParser;
import com.fasterxml.jackson.core.JsonToken;
import com.fasterxml.jackson.databind.DeserializationContext;
import com.fasterxml.jackson.datatype.joda.cfg.FormatConfig;
import com.fasterxml.jackson.datatype.joda.cfg.JacksonJodaDateFormat;
import java.io.IOException;
import org.joda.time.DateTimeZone;
import org.joda.time.Interval;

/* loaded from: classes3.dex */
public class IntervalDeserializer extends JodaDateDeserializerBase<Interval> {
    private static final long serialVersionUID = 1;

    public IntervalDeserializer() {
        this(FormatConfig.DEFAULT_DATETIME_PARSER);
    }

    @Override // com.fasterxml.jackson.datatype.joda.deser.JodaDateDeserializerBase
    public JodaDateDeserializerBase<?> withFormat(JacksonJodaDateFormat jacksonJodaDateFormat) {
        return new IntervalDeserializer(jacksonJodaDateFormat);
    }

    public IntervalDeserializer(JacksonJodaDateFormat jacksonJodaDateFormat) {
        super(Interval.class, jacksonJodaDateFormat);
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r0v0 */
    /* JADX WARN: Type inference failed for: r0v2 */
    /* JADX WARN: Type inference failed for: r0v4, types: [boolean] */
    /* JADX WARN: Type inference failed for: r10v13 */
    /* JADX WARN: Type inference failed for: r10v2, types: [java.lang.String] */
    /* JADX WARN: Type inference failed for: r10v4 */
    /* JADX WARN: Type inference failed for: r10v8, types: [org.joda.time.Interval, org.joda.time.base.BaseInterval, org.joda.time.base.AbstractInterval] */
    /* JADX WARN: Type inference failed for: r11v0, types: [com.fasterxml.jackson.databind.DeserializationContext] */
    /* JADX WARN: Type inference failed for: r5v1, types: [java.lang.Object[]] */
    @Override // com.fasterxml.jackson.databind.JsonDeserializer
    public Interval deserialize(JsonParser jsonParser, DeserializationContext deserializationContext) throws IOException {
        ?? r0 = 1;
        if (!jsonParser.hasToken(JsonToken.VALUE_STRING)) {
            return (Interval) deserializationContext.handleUnexpectedToken(handledType(), jsonParser.getCurrentToken(), jsonParser, "expected JSON String", new Object[0]);
        }
        Interval trim = jsonParser.getText().trim();
        int indexOf = trim.indexOf(47, 1);
        boolean z = indexOf > 0;
        if (!z) {
            indexOf = trim.indexOf(45, 1);
        }
        if (indexOf >= 0) {
            String substring = trim.substring(0, indexOf);
            try {
                if (z) {
                    trim = Interval.parse(trim);
                } else {
                    long longValue = Long.valueOf(substring).longValue();
                    substring = trim.substring(indexOf + 1);
                    trim = new Interval(longValue, Long.valueOf(substring).longValue());
                }
                r0 = this._format.isTimezoneExplicit();
                DateTimeZone timeZone = r0 != 0 ? this._format.getTimeZone() : DateTimeZone.forTimeZone(deserializationContext.getTimeZone());
                return (timeZone == null || timeZone.equals(trim.getStart().getZone())) ? trim : new Interval(trim.getStartMillis(), trim.getEndMillis(), timeZone);
            } catch (NumberFormatException unused) {
                Class<?> handledType = handledType();
                ?? r5 = new Object[2];
                r5[0] = substring;
                r5[r0] = trim;
                return (Interval) deserializationContext.handleWeirdStringValue(handledType, substring, "Failed to parse number from '%s' (full source String '%s')", r5);
            }
        }
        throw deserializationContext.weirdStringException(trim, handledType(), "no slash or hyphen found to separate start, end");
    }
}

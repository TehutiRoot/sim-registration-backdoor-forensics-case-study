package com.fasterxml.jackson.datatype.joda.deser;

import com.fasterxml.jackson.core.JsonParser;
import com.fasterxml.jackson.core.JsonToken;
import com.fasterxml.jackson.databind.DeserializationContext;
import com.fasterxml.jackson.datatype.joda.cfg.FormatConfig;
import com.fasterxml.jackson.datatype.joda.cfg.JacksonJodaDateFormat;
import java.io.IOException;
import org.joda.time.DateMidnight;
import org.joda.time.DateTimeZone;
import org.joda.time.LocalDate;

@Deprecated
/* loaded from: classes3.dex */
public class DateMidnightDeserializer extends JodaDateDeserializerBase<DateMidnight> {
    private static final long serialVersionUID = 1;

    /* renamed from: com.fasterxml.jackson.datatype.joda.deser.DateMidnightDeserializer$a */
    /* loaded from: classes3.dex */
    public static /* synthetic */ class C6148a {

        /* renamed from: a */
        public static final /* synthetic */ int[] f43483a;

        static {
            int[] iArr = new int[JsonToken.values().length];
            f43483a = iArr;
            try {
                iArr[JsonToken.VALUE_NUMBER_INT.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                f43483a[JsonToken.VALUE_STRING.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
        }
    }

    public DateMidnightDeserializer() {
        this(FormatConfig.DEFAULT_DATEONLY_FORMAT);
    }

    @Override // com.fasterxml.jackson.datatype.joda.deser.JodaDateDeserializerBase
    public JodaDateDeserializerBase<?> withFormat(JacksonJodaDateFormat jacksonJodaDateFormat) {
        return new DateMidnightDeserializer(jacksonJodaDateFormat);
    }

    public DateMidnightDeserializer(JacksonJodaDateFormat jacksonJodaDateFormat) {
        super(DateMidnight.class, jacksonJodaDateFormat);
    }

    @Override // com.fasterxml.jackson.databind.JsonDeserializer
    public DateMidnight deserialize(JsonParser jsonParser, DeserializationContext deserializationContext) throws IOException {
        LocalDate parseLocalDate;
        if (jsonParser.isExpectedStartArrayToken()) {
            jsonParser.nextToken();
            int intValue = jsonParser.getIntValue();
            jsonParser.nextToken();
            int intValue2 = jsonParser.getIntValue();
            jsonParser.nextToken();
            int intValue3 = jsonParser.getIntValue();
            JsonToken nextToken = jsonParser.nextToken();
            JsonToken jsonToken = JsonToken.END_ARRAY;
            if (nextToken == jsonToken) {
                return new DateMidnight(intValue, intValue2, intValue3, this._format.isTimezoneExplicit() ? this._format.getTimeZone() : DateTimeZone.forTimeZone(deserializationContext.getTimeZone()));
            }
            throw deserializationContext.wrongTokenException(jsonParser, jsonToken, "after DateMidnight ints");
        }
        int i = C6148a.f43483a[jsonParser.getCurrentToken().ordinal()];
        if (i != 1) {
            if (i == 2) {
                String trim = jsonParser.getText().trim();
                if (trim.length() == 0 || (parseLocalDate = this._format.createParser(deserializationContext).parseLocalDate(trim)) == null) {
                    return null;
                }
                return parseLocalDate.toDateMidnight();
            }
            throw deserializationContext.wrongTokenException(jsonParser, JsonToken.START_ARRAY, "expected JSON Array, Number or String");
        }
        return new DateMidnight(jsonParser.getLongValue());
    }
}

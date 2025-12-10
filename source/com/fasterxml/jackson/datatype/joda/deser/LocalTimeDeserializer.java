package com.fasterxml.jackson.datatype.joda.deser;

import com.fasterxml.jackson.core.JsonParser;
import com.fasterxml.jackson.core.JsonToken;
import com.fasterxml.jackson.databind.DeserializationContext;
import com.fasterxml.jackson.datatype.joda.cfg.FormatConfig;
import com.fasterxml.jackson.datatype.joda.cfg.JacksonJodaDateFormat;
import java.io.IOException;
import org.joda.time.LocalTime;

/* loaded from: classes3.dex */
public class LocalTimeDeserializer extends JodaDateDeserializerBase<LocalTime> {
    private static final long serialVersionUID = 1;

    /* renamed from: com.fasterxml.jackson.datatype.joda.deser.LocalTimeDeserializer$a */
    /* loaded from: classes3.dex */
    public static /* synthetic */ class C6149a {

        /* renamed from: a */
        public static final /* synthetic */ int[] f43484a;

        static {
            int[] iArr = new int[JsonToken.values().length];
            f43484a = iArr;
            try {
                iArr[JsonToken.START_ARRAY.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                f43484a[JsonToken.VALUE_NUMBER_INT.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            try {
                f43484a[JsonToken.VALUE_STRING.ordinal()] = 3;
            } catch (NoSuchFieldError unused3) {
            }
        }
    }

    public LocalTimeDeserializer() {
        this(FormatConfig.DEFAULT_LOCAL_TIMEONLY_PARSER);
    }

    @Override // com.fasterxml.jackson.datatype.joda.deser.JodaDateDeserializerBase
    public JodaDateDeserializerBase<?> withFormat(JacksonJodaDateFormat jacksonJodaDateFormat) {
        return new LocalTimeDeserializer(jacksonJodaDateFormat);
    }

    public LocalTimeDeserializer(JacksonJodaDateFormat jacksonJodaDateFormat) {
        super(LocalTime.class, jacksonJodaDateFormat);
    }

    @Override // com.fasterxml.jackson.databind.JsonDeserializer
    public LocalTime deserialize(JsonParser jsonParser, DeserializationContext deserializationContext) throws IOException {
        int i = C6149a.f43484a[jsonParser.getCurrentToken().ordinal()];
        int i2 = 0;
        if (i != 1) {
            if (i == 2) {
                return new LocalTime(jsonParser.getLongValue());
            }
            if (i == 3) {
                String trim = jsonParser.getText().trim();
                if (trim.length() == 0) {
                    return null;
                }
                return this._format.createParser(deserializationContext).parseLocalTime(trim);
            }
        } else if (jsonParser.isExpectedStartArrayToken()) {
            jsonParser.nextToken();
            int intValue = jsonParser.getIntValue();
            jsonParser.nextToken();
            int intValue2 = jsonParser.getIntValue();
            jsonParser.nextToken();
            int intValue3 = jsonParser.getIntValue();
            jsonParser.nextToken();
            JsonToken currentToken = jsonParser.getCurrentToken();
            JsonToken jsonToken = JsonToken.END_ARRAY;
            if (currentToken != jsonToken) {
                i2 = jsonParser.getIntValue();
                jsonParser.nextToken();
            }
            if (jsonParser.getCurrentToken() == jsonToken) {
                return new LocalTime(intValue, intValue2, intValue3, i2);
            }
            throw deserializationContext.wrongTokenException(jsonParser, handledType(), jsonToken, "after LocalTime ints");
        }
        return (LocalTime) deserializationContext.handleUnexpectedToken(handledType(), jsonParser.getCurrentToken(), jsonParser, "expected JSON Array, String or Number", new Object[0]);
    }
}

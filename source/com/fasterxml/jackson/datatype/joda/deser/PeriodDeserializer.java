package com.fasterxml.jackson.datatype.joda.deser;

import com.fasterxml.jackson.core.JsonParser;
import com.fasterxml.jackson.core.JsonToken;
import com.fasterxml.jackson.databind.DeserializationContext;
import com.fasterxml.jackson.databind.JsonNode;
import com.fasterxml.jackson.databind.jsontype.TypeDeserializer;
import com.fasterxml.jackson.datatype.joda.cfg.FormatConfig;
import com.fasterxml.jackson.datatype.joda.cfg.JacksonJodaPeriodFormat;
import java.io.IOException;
import org.joda.time.Days;
import org.joda.time.Hours;
import org.joda.time.Minutes;
import org.joda.time.Months;
import org.joda.time.Period;
import org.joda.time.ReadablePeriod;
import org.joda.time.Seconds;
import org.joda.time.Weeks;
import org.joda.time.Years;

/* loaded from: classes3.dex */
public class PeriodDeserializer extends JodaDeserializerBase<ReadablePeriod> {
    private static final long serialVersionUID = 1;
    private final JacksonJodaPeriodFormat _format;
    private final boolean _requireFullPeriod;

    public PeriodDeserializer() {
        this(true);
    }

    @Override // com.fasterxml.jackson.datatype.joda.deser.JodaDeserializerBase, com.fasterxml.jackson.databind.deser.std.StdScalarDeserializer, com.fasterxml.jackson.databind.deser.std.StdDeserializer, com.fasterxml.jackson.databind.JsonDeserializer
    public /* bridge */ /* synthetic */ Object deserializeWithType(JsonParser jsonParser, DeserializationContext deserializationContext, TypeDeserializer typeDeserializer) throws IOException {
        return super.deserializeWithType(jsonParser, deserializationContext, typeDeserializer);
    }

    public PeriodDeserializer(boolean z) {
        super(z ? Period.class : ReadablePeriod.class);
        this._format = FormatConfig.DEFAULT_PERIOD_FORMAT;
        this._requireFullPeriod = z;
    }

    @Override // com.fasterxml.jackson.databind.JsonDeserializer
    public ReadablePeriod deserialize(JsonParser jsonParser, DeserializationContext deserializationContext) throws IOException {
        JsonToken currentToken = jsonParser.getCurrentToken();
        ReadablePeriod readablePeriod = null;
        if (currentToken == JsonToken.VALUE_STRING) {
            String trim = jsonParser.getText().trim();
            if (trim.isEmpty()) {
                return null;
            }
            return this._format.parsePeriod(deserializationContext, trim);
        } else if (currentToken == JsonToken.VALUE_NUMBER_INT) {
            return new Period(jsonParser.getLongValue());
        } else {
            if (currentToken != JsonToken.START_OBJECT && currentToken != JsonToken.FIELD_NAME) {
                return (ReadablePeriod) deserializationContext.handleUnexpectedToken(handledType(), currentToken, jsonParser, "expected JSON Number, String or Object", new Object[0]);
            }
            JsonNode jsonNode = (JsonNode) jsonParser.readValueAsTree();
            String asText = jsonNode.path("fieldType").path("name").asText();
            String asText2 = jsonNode.path("periodType").path("name").asText();
            int asInt = jsonNode.path(asText).asInt();
            if (asText2.equals("Seconds")) {
                readablePeriod = Seconds.seconds(asInt);
            } else if (asText2.equals("Minutes")) {
                readablePeriod = Minutes.minutes(asInt);
            } else if (asText2.equals("Hours")) {
                readablePeriod = Hours.hours(asInt);
            } else if (asText2.equals("Days")) {
                readablePeriod = Days.days(asInt);
            } else if (asText2.equals("Weeks")) {
                readablePeriod = Weeks.weeks(asInt);
            } else if (asText2.equals("Months")) {
                readablePeriod = Months.months(asInt);
            } else if (asText2.equals("Years")) {
                readablePeriod = Years.years(asInt);
            } else {
                deserializationContext.reportInputMismatch(handledType(), "Don't know how to deserialize %s using periodName '%s'", handledType().getName(), asText2);
            }
            return this._requireFullPeriod ? readablePeriod.toPeriod() : readablePeriod;
        }
    }
}

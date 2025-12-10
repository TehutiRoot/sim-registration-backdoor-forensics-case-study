package com.fasterxml.jackson.datatype.joda.deser;

import com.fasterxml.jackson.core.JsonParser;
import com.fasterxml.jackson.databind.DeserializationContext;
import com.fasterxml.jackson.databind.DeserializationFeature;
import com.fasterxml.jackson.databind.jsontype.TypeDeserializer;
import com.fasterxml.jackson.datatype.joda.cfg.FormatConfig;
import com.fasterxml.jackson.datatype.joda.cfg.JacksonJodaPeriodFormat;
import java.io.IOException;
import org.joda.time.Duration;

/* loaded from: classes3.dex */
public class DurationDeserializer extends JodaDeserializerBase<Duration> {
    private static final long serialVersionUID = 1;
    protected final JacksonJodaPeriodFormat _format;

    public DurationDeserializer() {
        this(FormatConfig.DEFAULT_PERIOD_FORMAT);
    }

    public Duration _deserialize(DeserializationContext deserializationContext, String str) throws IOException {
        if (str.length() == 0 && deserializationContext.isEnabled(DeserializationFeature.ACCEPT_EMPTY_STRING_AS_NULL_OBJECT)) {
            return null;
        }
        return Duration.parse(str);
    }

    @Override // com.fasterxml.jackson.datatype.joda.deser.JodaDeserializerBase, com.fasterxml.jackson.databind.deser.std.StdScalarDeserializer, com.fasterxml.jackson.databind.deser.std.StdDeserializer, com.fasterxml.jackson.databind.JsonDeserializer
    public /* bridge */ /* synthetic */ Object deserializeWithType(JsonParser jsonParser, DeserializationContext deserializationContext, TypeDeserializer typeDeserializer) throws IOException {
        return super.deserializeWithType(jsonParser, deserializationContext, typeDeserializer);
    }

    public DurationDeserializer(JacksonJodaPeriodFormat jacksonJodaPeriodFormat) {
        super(Duration.class);
        this._format = jacksonJodaPeriodFormat;
    }

    @Override // com.fasterxml.jackson.databind.JsonDeserializer
    public Duration deserialize(JsonParser jsonParser, DeserializationContext deserializationContext) throws IOException {
        int currentTokenId = jsonParser.getCurrentTokenId();
        if (currentTokenId != 6) {
            if (currentTokenId != 7) {
                return _handleNotNumberOrString(jsonParser, deserializationContext);
            }
            return new Duration(jsonParser.getLongValue());
        }
        return this._format.parsePeriod(deserializationContext, jsonParser.getText().trim()).toStandardDuration();
    }
}
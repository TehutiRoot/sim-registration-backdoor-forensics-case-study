package com.fasterxml.jackson.datatype.joda.ser;

import com.fasterxml.jackson.core.JsonGenerator;
import com.fasterxml.jackson.databind.SerializationFeature;
import com.fasterxml.jackson.databind.SerializerProvider;
import com.fasterxml.jackson.datatype.joda.cfg.FormatConfig;
import com.fasterxml.jackson.datatype.joda.cfg.JacksonJodaDateFormat;
import java.io.IOException;
import org.joda.time.DateTimeZone;
import org.joda.time.LocalDateTime;

/* loaded from: classes3.dex */
public class LocalDateTimeSerializer extends JodaDateSerializerBase<LocalDateTime> {
    private static final long serialVersionUID = 1;

    public LocalDateTimeSerializer() {
        this(FormatConfig.DEFAULT_LOCAL_DATETIME_PRINTER, 0);
    }

    public LocalDateTimeSerializer(JacksonJodaDateFormat jacksonJodaDateFormat, int i) {
        super(LocalDateTime.class, jacksonJodaDateFormat, SerializationFeature.WRITE_DATES_AS_TIMESTAMPS, 3, i);
    }

    @Override // com.fasterxml.jackson.databind.ser.std.StdSerializer, com.fasterxml.jackson.databind.JsonSerializer
    public void serialize(LocalDateTime localDateTime, JsonGenerator jsonGenerator, SerializerProvider serializerProvider) throws IOException {
        int _serializationShape = _serializationShape(serializerProvider);
        if (_serializationShape == 1) {
            jsonGenerator.writeString(this._format.createFormatter(serializerProvider).print(localDateTime));
        } else if (_serializationShape == 2) {
            jsonGenerator.writeNumber(localDateTime.toDateTime(this._format.isTimezoneExplicit() ? this._format.getTimeZone() : DateTimeZone.forTimeZone(serializerProvider.getTimeZone())).getMillis());
        } else if (_serializationShape != 3) {
        } else {
            jsonGenerator.writeStartArray();
            jsonGenerator.writeNumber(localDateTime.year().get());
            jsonGenerator.writeNumber(localDateTime.monthOfYear().get());
            jsonGenerator.writeNumber(localDateTime.dayOfMonth().get());
            jsonGenerator.writeNumber(localDateTime.hourOfDay().get());
            jsonGenerator.writeNumber(localDateTime.minuteOfHour().get());
            jsonGenerator.writeNumber(localDateTime.secondOfMinute().get());
            jsonGenerator.writeNumber(localDateTime.millisOfSecond().get());
            jsonGenerator.writeEndArray();
        }
    }

    @Override // com.fasterxml.jackson.datatype.joda.ser.JodaDateSerializerBase
    public JodaDateSerializerBase<LocalDateTime> withFormat(JacksonJodaDateFormat jacksonJodaDateFormat, int i) {
        return new LocalDateTimeSerializer(jacksonJodaDateFormat, i);
    }
}

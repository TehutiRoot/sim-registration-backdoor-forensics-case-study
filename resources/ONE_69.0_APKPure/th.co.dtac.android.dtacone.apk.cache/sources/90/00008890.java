package com.fasterxml.jackson.datatype.joda.ser;

import com.fasterxml.jackson.core.JsonGenerator;
import com.fasterxml.jackson.databind.SerializationFeature;
import com.fasterxml.jackson.databind.SerializerProvider;
import com.fasterxml.jackson.datatype.joda.cfg.FormatConfig;
import com.fasterxml.jackson.datatype.joda.cfg.JacksonJodaDateFormat;
import java.io.IOException;
import org.joda.time.DateMidnight;

@Deprecated
/* loaded from: classes3.dex */
public class DateMidnightSerializer extends JodaDateSerializerBase<DateMidnight> {
    private static final long serialVersionUID = 1;

    public DateMidnightSerializer() {
        this(FormatConfig.DEFAULT_LOCAL_DATEONLY_FORMAT, 0);
    }

    public DateMidnightSerializer(JacksonJodaDateFormat jacksonJodaDateFormat, int i) {
        super(DateMidnight.class, jacksonJodaDateFormat, SerializationFeature.WRITE_DATES_AS_TIMESTAMPS, 3, i);
    }

    @Override // com.fasterxml.jackson.datatype.joda.ser.JodaDateSerializerBase, com.fasterxml.jackson.databind.JsonSerializer
    public boolean isEmpty(SerializerProvider serializerProvider, DateMidnight dateMidnight) {
        return dateMidnight.getMillis() == 0;
    }

    @Override // com.fasterxml.jackson.databind.ser.std.StdSerializer, com.fasterxml.jackson.databind.JsonSerializer
    public void serialize(DateMidnight dateMidnight, JsonGenerator jsonGenerator, SerializerProvider serializerProvider) throws IOException {
        int _serializationShape = _serializationShape(serializerProvider);
        if (_serializationShape == 1) {
            jsonGenerator.writeString(this._format.createFormatterWithLocale(serializerProvider).print(dateMidnight));
        } else if (_serializationShape == 2) {
            jsonGenerator.writeNumber(dateMidnight.getMillis());
        } else if (_serializationShape != 3) {
        } else {
            jsonGenerator.writeStartArray();
            jsonGenerator.writeNumber(dateMidnight.year().get());
            jsonGenerator.writeNumber(dateMidnight.monthOfYear().get());
            jsonGenerator.writeNumber(dateMidnight.dayOfMonth().get());
            jsonGenerator.writeEndArray();
        }
    }

    @Override // com.fasterxml.jackson.datatype.joda.ser.JodaDateSerializerBase
    /* renamed from: withFormat */
    public JodaDateSerializerBase<DateMidnight> withFormat2(JacksonJodaDateFormat jacksonJodaDateFormat, int i) {
        return new DateMidnightSerializer(jacksonJodaDateFormat, i);
    }
}
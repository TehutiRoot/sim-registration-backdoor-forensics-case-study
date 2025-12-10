package com.fasterxml.jackson.datatype.joda.deser.key;

import com.fasterxml.jackson.databind.DeserializationContext;
import java.io.IOException;
import org.joda.time.LocalDate;
import org.joda.time.format.DateTimeFormatter;
import org.joda.time.format.ISODateTimeFormat;

/* loaded from: classes3.dex */
public class LocalDateKeyDeserializer extends JodaKeyDeserializer {
    private static final DateTimeFormatter parser = ISODateTimeFormat.localDateParser();
    private static final long serialVersionUID = 1;

    @Override // com.fasterxml.jackson.datatype.joda.deser.key.JodaKeyDeserializer
    public LocalDate deserialize(String str, DeserializationContext deserializationContext) throws IOException {
        return parser.parseLocalDate(str);
    }
}

package com.fasterxml.jackson.datatype.joda.deser.key;

import com.fasterxml.jackson.databind.DeserializationContext;
import java.io.IOException;
import org.joda.time.LocalTime;
import org.joda.time.format.DateTimeFormatter;
import org.joda.time.format.ISODateTimeFormat;

/* loaded from: classes3.dex */
public class LocalTimeKeyDeserializer extends JodaKeyDeserializer {
    private static final DateTimeFormatter parser = ISODateTimeFormat.localTimeParser();
    private static final long serialVersionUID = 1;

    @Override // com.fasterxml.jackson.datatype.joda.deser.key.JodaKeyDeserializer
    public LocalTime deserialize(String str, DeserializationContext deserializationContext) throws IOException {
        return parser.parseLocalTime(str);
    }
}

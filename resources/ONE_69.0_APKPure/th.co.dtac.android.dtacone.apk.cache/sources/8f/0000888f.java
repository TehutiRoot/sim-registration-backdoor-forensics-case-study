package com.fasterxml.jackson.datatype.joda.deser.key;

import com.fasterxml.jackson.databind.DeserializationContext;
import java.io.IOException;

/* loaded from: classes3.dex */
public class PeriodKeyDeserializer extends JodaKeyDeserializer {
    private static final long serialVersionUID = 1;

    @Override // com.fasterxml.jackson.datatype.joda.deser.key.JodaKeyDeserializer
    public Object deserialize(String str, DeserializationContext deserializationContext) throws IOException {
        return JodaKeyDeserializer.PERIOD_FORMAT.parsePeriod(deserializationContext, str);
    }
}
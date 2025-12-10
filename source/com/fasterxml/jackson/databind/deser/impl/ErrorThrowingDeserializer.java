package com.fasterxml.jackson.databind.deser.impl;

import com.fasterxml.jackson.core.JsonParser;
import com.fasterxml.jackson.databind.DeserializationContext;
import com.fasterxml.jackson.databind.JsonDeserializer;
import java.io.IOException;

/* loaded from: classes3.dex */
public class ErrorThrowingDeserializer extends JsonDeserializer<Object> {

    /* renamed from: a */
    public final Error f43286a;

    public ErrorThrowingDeserializer(NoClassDefFoundError noClassDefFoundError) {
        this.f43286a = noClassDefFoundError;
    }

    @Override // com.fasterxml.jackson.databind.JsonDeserializer
    public Object deserialize(JsonParser jsonParser, DeserializationContext deserializationContext) throws IOException {
        throw this.f43286a;
    }
}

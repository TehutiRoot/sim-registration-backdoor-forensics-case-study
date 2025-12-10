package com.google.api.client.json.gson;

import com.google.api.client.json.JsonFactory;
import com.google.api.client.json.JsonGenerator;
import com.google.gson.stream.JsonWriter;
import java.math.BigDecimal;
import java.math.BigInteger;

/* loaded from: classes4.dex */
public class GsonGenerator extends JsonGenerator {

    /* renamed from: a */
    public final JsonWriter f52205a;

    /* renamed from: b */
    public final GsonFactory f52206b;

    /* loaded from: classes4.dex */
    public static final class StringNumber extends Number {
        private static final long serialVersionUID = 1;
        private final String encodedValue;

        public StringNumber(String str) {
            this.encodedValue = str;
        }

        @Override // java.lang.Number
        public double doubleValue() {
            return 0.0d;
        }

        @Override // java.lang.Number
        public float floatValue() {
            return 0.0f;
        }

        @Override // java.lang.Number
        public int intValue() {
            return 0;
        }

        @Override // java.lang.Number
        public long longValue() {
            return 0L;
        }

        public String toString() {
            return this.encodedValue;
        }
    }

    public GsonGenerator(GsonFactory gsonFactory, JsonWriter jsonWriter) {
        this.f52206b = gsonFactory;
        this.f52205a = jsonWriter;
        jsonWriter.setLenient(true);
    }

    @Override // com.google.api.client.json.JsonGenerator, java.io.Closeable, java.lang.AutoCloseable
    public void close() {
        this.f52205a.close();
    }

    @Override // com.google.api.client.json.JsonGenerator
    public void enablePrettyPrint() {
        this.f52205a.setIndent("  ");
    }

    @Override // com.google.api.client.json.JsonGenerator, java.io.Flushable
    public void flush() {
        this.f52205a.flush();
    }

    @Override // com.google.api.client.json.JsonGenerator
    public JsonFactory getFactory() {
        return this.f52206b;
    }

    @Override // com.google.api.client.json.JsonGenerator
    public void writeBoolean(boolean z) {
        this.f52205a.value(z);
    }

    @Override // com.google.api.client.json.JsonGenerator
    public void writeEndArray() {
        this.f52205a.endArray();
    }

    @Override // com.google.api.client.json.JsonGenerator
    public void writeEndObject() {
        this.f52205a.endObject();
    }

    @Override // com.google.api.client.json.JsonGenerator
    public void writeFieldName(String str) {
        this.f52205a.name(str);
    }

    @Override // com.google.api.client.json.JsonGenerator
    public void writeNull() {
        this.f52205a.nullValue();
    }

    @Override // com.google.api.client.json.JsonGenerator
    public void writeNumber(int i) {
        this.f52205a.value(i);
    }

    @Override // com.google.api.client.json.JsonGenerator
    public void writeStartArray() {
        this.f52205a.beginArray();
    }

    @Override // com.google.api.client.json.JsonGenerator
    public void writeStartObject() {
        this.f52205a.beginObject();
    }

    @Override // com.google.api.client.json.JsonGenerator
    public void writeString(String str) {
        this.f52205a.value(str);
    }

    @Override // com.google.api.client.json.JsonGenerator
    public void writeNumber(long j) {
        this.f52205a.value(j);
    }

    @Override // com.google.api.client.json.JsonGenerator
    public void writeNumber(BigInteger bigInteger) {
        this.f52205a.value(bigInteger);
    }

    @Override // com.google.api.client.json.JsonGenerator
    public void writeNumber(double d) {
        this.f52205a.value(d);
    }

    @Override // com.google.api.client.json.JsonGenerator
    public void writeNumber(float f) {
        this.f52205a.value(f);
    }

    @Override // com.google.api.client.json.JsonGenerator
    public void writeNumber(BigDecimal bigDecimal) {
        this.f52205a.value(bigDecimal);
    }

    @Override // com.google.api.client.json.JsonGenerator
    public void writeNumber(String str) {
        this.f52205a.value(new StringNumber(str));
    }
}
package com.google.api.client.json.gson;

import com.google.api.client.json.JsonFactory;
import com.google.api.client.json.JsonGenerator;
import com.google.gson.stream.JsonWriter;
import java.math.BigDecimal;
import java.math.BigInteger;

/* loaded from: classes4.dex */
public class GsonGenerator extends JsonGenerator {

    /* renamed from: a */
    public final JsonWriter f52193a;

    /* renamed from: b */
    public final GsonFactory f52194b;

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
        this.f52194b = gsonFactory;
        this.f52193a = jsonWriter;
        jsonWriter.setLenient(true);
    }

    @Override // com.google.api.client.json.JsonGenerator, java.io.Closeable, java.lang.AutoCloseable
    public void close() {
        this.f52193a.close();
    }

    @Override // com.google.api.client.json.JsonGenerator
    public void enablePrettyPrint() {
        this.f52193a.setIndent("  ");
    }

    @Override // com.google.api.client.json.JsonGenerator, java.io.Flushable
    public void flush() {
        this.f52193a.flush();
    }

    @Override // com.google.api.client.json.JsonGenerator
    public JsonFactory getFactory() {
        return this.f52194b;
    }

    @Override // com.google.api.client.json.JsonGenerator
    public void writeBoolean(boolean z) {
        this.f52193a.value(z);
    }

    @Override // com.google.api.client.json.JsonGenerator
    public void writeEndArray() {
        this.f52193a.endArray();
    }

    @Override // com.google.api.client.json.JsonGenerator
    public void writeEndObject() {
        this.f52193a.endObject();
    }

    @Override // com.google.api.client.json.JsonGenerator
    public void writeFieldName(String str) {
        this.f52193a.name(str);
    }

    @Override // com.google.api.client.json.JsonGenerator
    public void writeNull() {
        this.f52193a.nullValue();
    }

    @Override // com.google.api.client.json.JsonGenerator
    public void writeNumber(int i) {
        this.f52193a.value(i);
    }

    @Override // com.google.api.client.json.JsonGenerator
    public void writeStartArray() {
        this.f52193a.beginArray();
    }

    @Override // com.google.api.client.json.JsonGenerator
    public void writeStartObject() {
        this.f52193a.beginObject();
    }

    @Override // com.google.api.client.json.JsonGenerator
    public void writeString(String str) {
        this.f52193a.value(str);
    }

    @Override // com.google.api.client.json.JsonGenerator
    public void writeNumber(long j) {
        this.f52193a.value(j);
    }

    @Override // com.google.api.client.json.JsonGenerator
    public void writeNumber(BigInteger bigInteger) {
        this.f52193a.value(bigInteger);
    }

    @Override // com.google.api.client.json.JsonGenerator
    public void writeNumber(double d) {
        this.f52193a.value(d);
    }

    @Override // com.google.api.client.json.JsonGenerator
    public void writeNumber(float f) {
        this.f52193a.value(f);
    }

    @Override // com.google.api.client.json.JsonGenerator
    public void writeNumber(BigDecimal bigDecimal) {
        this.f52193a.value(bigDecimal);
    }

    @Override // com.google.api.client.json.JsonGenerator
    public void writeNumber(String str) {
        this.f52193a.value(new StringNumber(str));
    }
}

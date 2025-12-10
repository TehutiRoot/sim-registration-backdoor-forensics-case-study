package com.google.gson.internal.bind;

import com.google.errorprone.annotations.CanIgnoreReturnValue;
import com.google.gson.JsonArray;
import com.google.gson.JsonElement;
import com.google.gson.JsonNull;
import com.google.gson.JsonObject;
import com.google.gson.JsonPrimitive;
import com.google.gson.stream.JsonWriter;
import java.io.IOException;
import java.io.Writer;
import java.util.ArrayList;
import java.util.List;
import java.util.Objects;

/* loaded from: classes4.dex */
public final class JsonTreeWriter extends JsonWriter {

    /* renamed from: r */
    public static final Writer f56768r = new C8739a();

    /* renamed from: s */
    public static final JsonPrimitive f56769s = new JsonPrimitive("closed");

    /* renamed from: o */
    public final List f56770o;

    /* renamed from: p */
    public String f56771p;

    /* renamed from: q */
    public JsonElement f56772q;

    /* renamed from: com.google.gson.internal.bind.JsonTreeWriter$a */
    /* loaded from: classes4.dex */
    public class C8739a extends Writer {
        @Override // java.io.Writer, java.io.Closeable, java.lang.AutoCloseable
        public void close() {
            throw new AssertionError();
        }

        @Override // java.io.Writer, java.io.Flushable
        public void flush() {
            throw new AssertionError();
        }

        @Override // java.io.Writer
        public void write(char[] cArr, int i, int i2) {
            throw new AssertionError();
        }
    }

    public JsonTreeWriter() {
        super(f56768r);
        this.f56770o = new ArrayList();
        this.f56772q = JsonNull.INSTANCE;
    }

    @Override // com.google.gson.stream.JsonWriter
    @CanIgnoreReturnValue
    public JsonWriter beginArray() throws IOException {
        JsonArray jsonArray = new JsonArray();
        m37518q(jsonArray);
        this.f56770o.add(jsonArray);
        return this;
    }

    @Override // com.google.gson.stream.JsonWriter
    @CanIgnoreReturnValue
    public JsonWriter beginObject() throws IOException {
        JsonObject jsonObject = new JsonObject();
        m37518q(jsonObject);
        this.f56770o.add(jsonObject);
        return this;
    }

    @Override // com.google.gson.stream.JsonWriter, java.io.Closeable, java.lang.AutoCloseable
    public void close() throws IOException {
        if (this.f56770o.isEmpty()) {
            this.f56770o.add(f56769s);
            return;
        }
        throw new IOException("Incomplete document");
    }

    @Override // com.google.gson.stream.JsonWriter
    @CanIgnoreReturnValue
    public JsonWriter endArray() throws IOException {
        if (!this.f56770o.isEmpty() && this.f56771p == null) {
            if (m37519p() instanceof JsonArray) {
                List list = this.f56770o;
                list.remove(list.size() - 1);
                return this;
            }
            throw new IllegalStateException();
        }
        throw new IllegalStateException();
    }

    @Override // com.google.gson.stream.JsonWriter
    @CanIgnoreReturnValue
    public JsonWriter endObject() throws IOException {
        if (!this.f56770o.isEmpty() && this.f56771p == null) {
            if (m37519p() instanceof JsonObject) {
                List list = this.f56770o;
                list.remove(list.size() - 1);
                return this;
            }
            throw new IllegalStateException();
        }
        throw new IllegalStateException();
    }

    @Override // com.google.gson.stream.JsonWriter, java.io.Flushable
    public void flush() throws IOException {
    }

    public JsonElement get() {
        if (this.f56770o.isEmpty()) {
            return this.f56772q;
        }
        throw new IllegalStateException("Expected one JSON element but was " + this.f56770o);
    }

    @Override // com.google.gson.stream.JsonWriter
    public JsonWriter jsonValue(String str) throws IOException {
        throw new UnsupportedOperationException();
    }

    @Override // com.google.gson.stream.JsonWriter
    @CanIgnoreReturnValue
    public JsonWriter name(String str) throws IOException {
        Objects.requireNonNull(str, "name == null");
        if (!this.f56770o.isEmpty() && this.f56771p == null) {
            if (m37519p() instanceof JsonObject) {
                this.f56771p = str;
                return this;
            }
            throw new IllegalStateException("Please begin an object before writing a name.");
        }
        throw new IllegalStateException("Did not expect a name");
    }

    @Override // com.google.gson.stream.JsonWriter
    @CanIgnoreReturnValue
    public JsonWriter nullValue() throws IOException {
        m37518q(JsonNull.INSTANCE);
        return this;
    }

    /* renamed from: p */
    public final JsonElement m37519p() {
        List list = this.f56770o;
        return (JsonElement) list.get(list.size() - 1);
    }

    /* renamed from: q */
    public final void m37518q(JsonElement jsonElement) {
        if (this.f56771p != null) {
            if (!jsonElement.isJsonNull() || getSerializeNulls()) {
                ((JsonObject) m37519p()).add(this.f56771p, jsonElement);
            }
            this.f56771p = null;
        } else if (this.f56770o.isEmpty()) {
            this.f56772q = jsonElement;
        } else {
            JsonElement m37519p = m37519p();
            if (m37519p instanceof JsonArray) {
                ((JsonArray) m37519p).add(jsonElement);
                return;
            }
            throw new IllegalStateException();
        }
    }

    @Override // com.google.gson.stream.JsonWriter
    @CanIgnoreReturnValue
    public JsonWriter value(String str) throws IOException {
        if (str == null) {
            return nullValue();
        }
        m37518q(new JsonPrimitive(str));
        return this;
    }

    @Override // com.google.gson.stream.JsonWriter
    @CanIgnoreReturnValue
    public JsonWriter value(boolean z) throws IOException {
        m37518q(new JsonPrimitive(Boolean.valueOf(z)));
        return this;
    }

    @Override // com.google.gson.stream.JsonWriter
    @CanIgnoreReturnValue
    public JsonWriter value(Boolean bool) throws IOException {
        if (bool == null) {
            return nullValue();
        }
        m37518q(new JsonPrimitive(bool));
        return this;
    }

    @Override // com.google.gson.stream.JsonWriter
    @CanIgnoreReturnValue
    public JsonWriter value(float f) throws IOException {
        if (!isLenient() && (Float.isNaN(f) || Float.isInfinite(f))) {
            throw new IllegalArgumentException("JSON forbids NaN and infinities: " + f);
        }
        m37518q(new JsonPrimitive(Float.valueOf(f)));
        return this;
    }

    @Override // com.google.gson.stream.JsonWriter
    @CanIgnoreReturnValue
    public JsonWriter value(double d) throws IOException {
        if (!isLenient() && (Double.isNaN(d) || Double.isInfinite(d))) {
            throw new IllegalArgumentException("JSON forbids NaN and infinities: " + d);
        }
        m37518q(new JsonPrimitive(Double.valueOf(d)));
        return this;
    }

    @Override // com.google.gson.stream.JsonWriter
    @CanIgnoreReturnValue
    public JsonWriter value(long j) throws IOException {
        m37518q(new JsonPrimitive(Long.valueOf(j)));
        return this;
    }

    @Override // com.google.gson.stream.JsonWriter
    @CanIgnoreReturnValue
    public JsonWriter value(Number number) throws IOException {
        if (number == null) {
            return nullValue();
        }
        if (!isLenient()) {
            double doubleValue = number.doubleValue();
            if (Double.isNaN(doubleValue) || Double.isInfinite(doubleValue)) {
                throw new IllegalArgumentException("JSON forbids NaN and infinities: " + number);
            }
        }
        m37518q(new JsonPrimitive(number));
        return this;
    }
}

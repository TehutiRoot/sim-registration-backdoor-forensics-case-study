package com.google.gson.internal;

import com.google.gson.JsonElement;
import com.google.gson.JsonIOException;
import com.google.gson.JsonNull;
import com.google.gson.JsonParseException;
import com.google.gson.JsonSyntaxException;
import com.google.gson.internal.bind.TypeAdapters;
import com.google.gson.stream.JsonReader;
import com.google.gson.stream.JsonWriter;
import com.google.gson.stream.MalformedJsonException;
import java.io.EOFException;
import java.io.IOException;
import java.io.Writer;
import java.util.Objects;

/* loaded from: classes4.dex */
public final class Streams {
    public static JsonElement parse(JsonReader jsonReader) throws JsonParseException {
        boolean z;
        try {
            try {
                jsonReader.peek();
                z = false;
            } catch (MalformedJsonException e) {
                throw new JsonSyntaxException(e);
            } catch (IOException e2) {
                throw new JsonIOException(e2);
            } catch (NumberFormatException e3) {
                throw new JsonSyntaxException(e3);
            }
        } catch (EOFException e4) {
            e = e4;
            z = true;
        }
        try {
            return TypeAdapters.JSON_ELEMENT.read(jsonReader);
        } catch (EOFException e5) {
            e = e5;
            if (z) {
                return JsonNull.INSTANCE;
            }
            throw new JsonSyntaxException(e);
        }
    }

    public static void write(JsonElement jsonElement, JsonWriter jsonWriter) throws IOException {
        TypeAdapters.JSON_ELEMENT.write(jsonWriter, jsonElement);
    }

    public static Writer writerForAppendable(Appendable appendable) {
        if (appendable instanceof Writer) {
            return (Writer) appendable;
        }
        return new C8727b(appendable);
    }

    /* renamed from: com.google.gson.internal.Streams$b */
    /* loaded from: classes4.dex */
    public static final class C8727b extends Writer {

        /* renamed from: a */
        public final Appendable f56746a;

        /* renamed from: b */
        public final C8728a f56747b = new C8728a();

        /* renamed from: com.google.gson.internal.Streams$b$a */
        /* loaded from: classes4.dex */
        public static class C8728a implements CharSequence {

            /* renamed from: a */
            public char[] f56748a;

            /* renamed from: b */
            public String f56749b;

            public C8728a() {
            }

            /* renamed from: a */
            public void m37536a(char[] cArr) {
                this.f56748a = cArr;
                this.f56749b = null;
            }

            @Override // java.lang.CharSequence
            public char charAt(int i) {
                return this.f56748a[i];
            }

            @Override // java.lang.CharSequence
            public int length() {
                return this.f56748a.length;
            }

            @Override // java.lang.CharSequence
            public CharSequence subSequence(int i, int i2) {
                return new String(this.f56748a, i, i2 - i);
            }

            @Override // java.lang.CharSequence
            public String toString() {
                if (this.f56749b == null) {
                    this.f56749b = new String(this.f56748a);
                }
                return this.f56749b;
            }
        }

        public C8727b(Appendable appendable) {
            this.f56746a = appendable;
        }

        @Override // java.io.Writer, java.io.Closeable, java.lang.AutoCloseable
        public void close() {
        }

        @Override // java.io.Writer, java.io.Flushable
        public void flush() {
        }

        @Override // java.io.Writer
        public void write(char[] cArr, int i, int i2) {
            this.f56747b.m37536a(cArr);
            this.f56746a.append(this.f56747b, i, i2 + i);
        }

        @Override // java.io.Writer, java.lang.Appendable
        public Writer append(CharSequence charSequence) {
            this.f56746a.append(charSequence);
            return this;
        }

        @Override // java.io.Writer
        public void write(int i) {
            this.f56746a.append((char) i);
        }

        @Override // java.io.Writer, java.lang.Appendable
        public Writer append(CharSequence charSequence, int i, int i2) {
            this.f56746a.append(charSequence, i, i2);
            return this;
        }

        @Override // java.io.Writer
        public void write(String str, int i, int i2) {
            Objects.requireNonNull(str);
            this.f56746a.append(str, i, i2 + i);
        }
    }
}

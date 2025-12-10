package com.google.api.client.json;

import java.io.ByteArrayOutputStream;
import java.io.IOException;
import java.io.InputStream;
import java.io.OutputStream;
import java.io.Reader;
import java.io.Writer;
import java.nio.charset.Charset;
import java.nio.charset.StandardCharsets;

/* loaded from: classes4.dex */
public abstract class JsonFactory {
    /* renamed from: a */
    public final ByteArrayOutputStream m41733a(Object obj, boolean z) {
        ByteArrayOutputStream byteArrayOutputStream = new ByteArrayOutputStream();
        JsonGenerator createJsonGenerator = createJsonGenerator(byteArrayOutputStream, StandardCharsets.UTF_8);
        if (z) {
            createJsonGenerator.enablePrettyPrint();
        }
        createJsonGenerator.serialize(obj);
        createJsonGenerator.flush();
        return byteArrayOutputStream;
    }

    /* renamed from: b */
    public final String m41732b(Object obj, boolean z) {
        return m41733a(obj, z).toString("UTF-8");
    }

    public abstract JsonGenerator createJsonGenerator(OutputStream outputStream, Charset charset) throws IOException;

    public abstract JsonGenerator createJsonGenerator(Writer writer) throws IOException;

    public final JsonObjectParser createJsonObjectParser() {
        return new JsonObjectParser(this);
    }

    public abstract JsonParser createJsonParser(InputStream inputStream) throws IOException;

    public abstract JsonParser createJsonParser(InputStream inputStream, Charset charset) throws IOException;

    public abstract JsonParser createJsonParser(Reader reader) throws IOException;

    public abstract JsonParser createJsonParser(String str) throws IOException;

    public final <T> T fromInputStream(InputStream inputStream, Class<T> cls) throws IOException {
        return (T) createJsonParser(inputStream).parseAndClose((Class<Object>) cls);
    }

    public final <T> T fromReader(Reader reader, Class<T> cls) throws IOException {
        return (T) createJsonParser(reader).parseAndClose((Class<Object>) cls);
    }

    public final <T> T fromString(String str, Class<T> cls) throws IOException {
        return (T) createJsonParser(str).parse((Class<Object>) cls);
    }

    public final byte[] toByteArray(Object obj) throws IOException {
        return m41733a(obj, false).toByteArray();
    }

    public final String toPrettyString(Object obj) throws IOException {
        return m41732b(obj, true);
    }

    public final String toString(Object obj) throws IOException {
        return m41732b(obj, false);
    }

    public final <T> T fromInputStream(InputStream inputStream, Charset charset, Class<T> cls) throws IOException {
        return (T) createJsonParser(inputStream, charset).parseAndClose((Class<Object>) cls);
    }
}

package com.google.api.client.json.gson;

import com.google.api.client.json.JsonFactory;
import com.google.api.client.json.JsonGenerator;
import com.google.api.client.json.JsonParser;
import com.google.api.client.util.Beta;
import com.google.gson.stream.JsonReader;
import com.google.gson.stream.JsonWriter;
import java.io.InputStream;
import java.io.InputStreamReader;
import java.io.OutputStream;
import java.io.OutputStreamWriter;
import java.io.Reader;
import java.io.StringReader;
import java.io.Writer;
import java.nio.charset.Charset;
import java.nio.charset.StandardCharsets;

/* loaded from: classes4.dex */
public class GsonFactory extends JsonFactory {

    /* renamed from: a */
    public boolean f52190a;

    /* loaded from: classes4.dex */
    public static final class Builder {

        /* renamed from: a */
        public boolean f52191a;

        public GsonFactory build() {
            return new GsonFactory(this);
        }

        public Builder setReadLeniency(boolean z) {
            this.f52191a = z;
            return this;
        }

        public Builder() {
            this.f52191a = false;
        }
    }

    /* renamed from: com.google.api.client.json.gson.GsonFactory$b */
    /* loaded from: classes4.dex */
    public static class C7301b {

        /* renamed from: a */
        public static final GsonFactory f52192a = new GsonFactory();
    }

    public static Builder builder() {
        return new Builder();
    }

    @Beta
    public static GsonFactory getDefaultInstance() {
        return C7301b.f52192a;
    }

    /* renamed from: c */
    public boolean m41722c() {
        return this.f52190a;
    }

    @Override // com.google.api.client.json.JsonFactory
    public JsonGenerator createJsonGenerator(OutputStream outputStream, Charset charset) {
        return createJsonGenerator(new OutputStreamWriter(outputStream, charset));
    }

    @Override // com.google.api.client.json.JsonFactory
    public JsonParser createJsonParser(InputStream inputStream) {
        return createJsonParser(new InputStreamReader(inputStream, StandardCharsets.UTF_8));
    }

    public GsonFactory() {
        this.f52190a = false;
    }

    @Override // com.google.api.client.json.JsonFactory
    public JsonGenerator createJsonGenerator(Writer writer) {
        return new GsonGenerator(this, new JsonWriter(writer));
    }

    @Override // com.google.api.client.json.JsonFactory
    public JsonParser createJsonParser(InputStream inputStream, Charset charset) {
        if (charset == null) {
            return createJsonParser(inputStream);
        }
        return createJsonParser(new InputStreamReader(inputStream, charset));
    }

    public GsonFactory(Builder builder) {
        this.f52190a = false;
        this.f52190a = builder.f52191a;
    }

    @Override // com.google.api.client.json.JsonFactory
    public JsonParser createJsonParser(String str) {
        return createJsonParser(new StringReader(str));
    }

    @Override // com.google.api.client.json.JsonFactory
    public JsonParser createJsonParser(Reader reader) {
        return new C20156h70(this, new JsonReader(reader));
    }
}

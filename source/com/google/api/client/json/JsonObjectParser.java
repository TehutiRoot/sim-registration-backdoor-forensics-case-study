package com.google.api.client.json;

import com.google.api.client.util.ObjectParser;
import com.google.api.client.util.Preconditions;
import com.google.api.client.util.Sets;
import java.io.IOException;
import java.io.InputStream;
import java.io.Reader;
import java.lang.reflect.Type;
import java.nio.charset.Charset;
import java.util.Collection;
import java.util.Collections;
import java.util.HashSet;
import java.util.Set;

/* loaded from: classes4.dex */
public class JsonObjectParser implements ObjectParser {

    /* renamed from: a */
    public final JsonFactory f52183a;

    /* renamed from: b */
    public final Set f52184b;

    /* loaded from: classes4.dex */
    public static class Builder {

        /* renamed from: a */
        public final JsonFactory f52185a;

        /* renamed from: b */
        public Collection f52186b = Sets.newHashSet();

        public Builder(JsonFactory jsonFactory) {
            this.f52185a = (JsonFactory) Preconditions.checkNotNull(jsonFactory);
        }

        public JsonObjectParser build() {
            return new JsonObjectParser(this);
        }

        public final JsonFactory getJsonFactory() {
            return this.f52185a;
        }

        public final Collection<String> getWrapperKeys() {
            return this.f52186b;
        }

        public Builder setWrapperKeys(Collection<String> collection) {
            this.f52186b = collection;
            return this;
        }
    }

    public JsonObjectParser(JsonFactory jsonFactory) {
        this(new Builder(jsonFactory));
    }

    /* renamed from: a */
    public final void m41730a(JsonParser jsonParser) {
        boolean z;
        if (this.f52184b.isEmpty()) {
            return;
        }
        try {
            if (jsonParser.skipToKey(this.f52184b) != null && jsonParser.getCurrentToken() != JsonToken.END_OBJECT) {
                z = true;
            } else {
                z = false;
            }
            Preconditions.checkArgument(z, "wrapper key(s) not found: %s", this.f52184b);
        } catch (Throwable th2) {
            jsonParser.close();
            throw th2;
        }
    }

    public final JsonFactory getJsonFactory() {
        return this.f52183a;
    }

    public Set<String> getWrapperKeys() {
        return Collections.unmodifiableSet(this.f52184b);
    }

    @Override // com.google.api.client.util.ObjectParser
    public <T> T parseAndClose(InputStream inputStream, Charset charset, Class<T> cls) throws IOException {
        return (T) parseAndClose(inputStream, charset, (Type) cls);
    }

    public JsonObjectParser(Builder builder) {
        this.f52183a = builder.f52185a;
        this.f52184b = new HashSet(builder.f52186b);
    }

    @Override // com.google.api.client.util.ObjectParser
    public Object parseAndClose(InputStream inputStream, Charset charset, Type type) throws IOException {
        JsonParser createJsonParser = this.f52183a.createJsonParser(inputStream, charset);
        m41730a(createJsonParser);
        return createJsonParser.parse(type, true);
    }

    @Override // com.google.api.client.util.ObjectParser
    public <T> T parseAndClose(Reader reader, Class<T> cls) throws IOException {
        return (T) parseAndClose(reader, (Type) cls);
    }

    @Override // com.google.api.client.util.ObjectParser
    public Object parseAndClose(Reader reader, Type type) throws IOException {
        JsonParser createJsonParser = this.f52183a.createJsonParser(reader);
        m41730a(createJsonParser);
        return createJsonParser.parse(type, true);
    }
}

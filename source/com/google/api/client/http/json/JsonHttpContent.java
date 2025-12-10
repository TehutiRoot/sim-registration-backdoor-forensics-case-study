package com.google.api.client.http.json;

import com.google.api.client.http.AbstractHttpContent;
import com.google.api.client.http.HttpMediaType;
import com.google.api.client.json.Json;
import com.google.api.client.json.JsonFactory;
import com.google.api.client.json.JsonGenerator;
import com.google.api.client.util.Preconditions;
import java.io.IOException;
import java.io.OutputStream;

/* loaded from: classes4.dex */
public class JsonHttpContent extends AbstractHttpContent {

    /* renamed from: c */
    public final Object f52179c;

    /* renamed from: d */
    public final JsonFactory f52180d;

    /* renamed from: e */
    public String f52181e;

    public JsonHttpContent(JsonFactory jsonFactory, Object obj) {
        super(Json.MEDIA_TYPE);
        this.f52180d = (JsonFactory) Preconditions.checkNotNull(jsonFactory);
        this.f52179c = Preconditions.checkNotNull(obj);
    }

    public final Object getData() {
        return this.f52179c;
    }

    public final JsonFactory getJsonFactory() {
        return this.f52180d;
    }

    public final String getWrapperKey() {
        return this.f52181e;
    }

    public JsonHttpContent setWrapperKey(String str) {
        this.f52181e = str;
        return this;
    }

    @Override // com.google.api.client.http.HttpContent, com.google.api.client.util.StreamingContent
    public void writeTo(OutputStream outputStream) throws IOException {
        JsonGenerator createJsonGenerator = this.f52180d.createJsonGenerator(outputStream, getCharset());
        if (this.f52181e != null) {
            createJsonGenerator.writeStartObject();
            createJsonGenerator.writeFieldName(this.f52181e);
        }
        createJsonGenerator.serialize(this.f52179c);
        if (this.f52181e != null) {
            createJsonGenerator.writeEndObject();
        }
        createJsonGenerator.flush();
    }

    @Override // com.google.api.client.http.AbstractHttpContent
    public JsonHttpContent setMediaType(HttpMediaType httpMediaType) {
        super.setMediaType(httpMediaType);
        return this;
    }
}

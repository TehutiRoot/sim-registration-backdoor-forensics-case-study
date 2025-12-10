package com.google.api.client.http;

import com.google.api.client.util.Data;
import com.google.api.client.util.FieldInfo;
import com.google.api.client.util.Preconditions;
import com.google.api.client.util.Types;
import com.google.api.client.util.escape.CharEscapers;
import java.io.BufferedWriter;
import java.io.IOException;
import java.io.OutputStream;
import java.io.OutputStreamWriter;
import java.io.Writer;
import java.util.HashMap;
import java.util.Map;

/* loaded from: classes4.dex */
public class UrlEncodedContent extends AbstractHttpContent {

    /* renamed from: c */
    public Object f52160c;

    /* renamed from: d */
    public boolean f52161d;

    public UrlEncodedContent(Object obj) {
        super(UrlEncodedParser.MEDIA_TYPE);
        setData(obj);
        this.f52161d = false;
    }

    /* renamed from: a */
    public static boolean m41740a(boolean z, Writer writer, String str, Object obj, boolean z2) {
        String obj2;
        String escapeUri;
        if (obj != null && !Data.isNull(obj)) {
            if (z) {
                z = false;
            } else {
                writer.write("&");
            }
            writer.write(str);
            if (obj instanceof Enum) {
                obj2 = FieldInfo.m41701of((Enum) obj).getName();
            } else {
                obj2 = obj.toString();
            }
            if (z2) {
                escapeUri = CharEscapers.escapeUriPath(obj2);
            } else {
                escapeUri = CharEscapers.escapeUri(obj2);
            }
            if (escapeUri.length() != 0) {
                writer.write("=");
                writer.write(escapeUri);
            }
        }
        return z;
    }

    public static UrlEncodedContent getContent(HttpRequest httpRequest) {
        HttpContent content = httpRequest.getContent();
        if (content != null) {
            return (UrlEncodedContent) content;
        }
        UrlEncodedContent urlEncodedContent = new UrlEncodedContent(new HashMap());
        httpRequest.setContent(urlEncodedContent);
        return urlEncodedContent;
    }

    public final Object getData() {
        return this.f52160c;
    }

    public UrlEncodedContent setData(Object obj) {
        this.f52160c = Preconditions.checkNotNull(obj);
        return this;
    }

    @Override // com.google.api.client.http.HttpContent, com.google.api.client.util.StreamingContent
    public void writeTo(OutputStream outputStream) throws IOException {
        BufferedWriter bufferedWriter = new BufferedWriter(new OutputStreamWriter(outputStream, getCharset()));
        boolean z = true;
        for (Map.Entry<String, Object> entry : Data.mapOf(this.f52160c).entrySet()) {
            Object value = entry.getValue();
            if (value != null) {
                String escapeUri = CharEscapers.escapeUri(entry.getKey());
                Class<?> cls = value.getClass();
                if (!(value instanceof Iterable) && !cls.isArray()) {
                    z = m41740a(z, bufferedWriter, escapeUri, value, this.f52161d);
                } else {
                    for (Object obj : Types.iterableOf(value)) {
                        z = m41740a(z, bufferedWriter, escapeUri, obj, this.f52161d);
                    }
                }
            }
        }
        bufferedWriter.flush();
    }

    @Override // com.google.api.client.http.AbstractHttpContent
    public UrlEncodedContent setMediaType(HttpMediaType httpMediaType) {
        super.setMediaType(httpMediaType);
        return this;
    }

    public UrlEncodedContent(Object obj, boolean z) {
        super(UrlEncodedParser.MEDIA_TYPE);
        setData(obj);
        this.f52161d = z;
    }
}

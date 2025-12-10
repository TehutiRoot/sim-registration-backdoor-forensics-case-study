package com.google.api.client.testing.http;

import com.google.api.client.http.HttpMediaType;
import com.google.api.client.http.LowLevelHttpRequest;
import com.google.api.client.http.LowLevelHttpResponse;
import com.google.api.client.util.Beta;
import com.google.api.client.util.IOUtils;
import java.io.ByteArrayInputStream;
import java.io.ByteArrayOutputStream;
import java.io.IOException;
import java.nio.charset.Charset;
import java.nio.charset.StandardCharsets;
import java.util.ArrayList;
import java.util.Collections;
import java.util.HashMap;
import java.util.List;
import java.util.Locale;
import java.util.Map;
import java.util.zip.GZIPInputStream;

@Beta
/* loaded from: classes4.dex */
public class MockLowLevelHttpRequest extends LowLevelHttpRequest {

    /* renamed from: e */
    public String f52238e;

    /* renamed from: f */
    public final Map f52239f = new HashMap();

    /* renamed from: g */
    public MockLowLevelHttpResponse f52240g = new MockLowLevelHttpResponse();

    public MockLowLevelHttpRequest() {
    }

    @Override // com.google.api.client.http.LowLevelHttpRequest
    public void addHeader(String str, String str2) throws IOException {
        String lowerCase = str.toLowerCase(Locale.US);
        List list = (List) this.f52239f.get(lowerCase);
        if (list == null) {
            list = new ArrayList();
            this.f52239f.put(lowerCase, list);
        }
        list.add(str2);
    }

    @Override // com.google.api.client.http.LowLevelHttpRequest
    public LowLevelHttpResponse execute() throws IOException {
        return this.f52240g;
    }

    public String getContentAsString() throws IOException {
        HttpMediaType httpMediaType;
        Charset charset;
        if (getStreamingContent() == null) {
            return "";
        }
        ByteArrayOutputStream byteArrayOutputStream = new ByteArrayOutputStream();
        getStreamingContent().writeTo(byteArrayOutputStream);
        String contentEncoding = getContentEncoding();
        if (contentEncoding != null && contentEncoding.contains("gzip")) {
            GZIPInputStream gZIPInputStream = new GZIPInputStream(new ByteArrayInputStream(byteArrayOutputStream.toByteArray()));
            byteArrayOutputStream = new ByteArrayOutputStream();
            IOUtils.copy(gZIPInputStream, byteArrayOutputStream);
        }
        String contentType = getContentType();
        if (contentType != null) {
            httpMediaType = new HttpMediaType(contentType);
        } else {
            httpMediaType = null;
        }
        if (httpMediaType != null && httpMediaType.getCharsetParameter() != null) {
            charset = httpMediaType.getCharsetParameter();
        } else {
            charset = StandardCharsets.ISO_8859_1;
        }
        return byteArrayOutputStream.toString(charset.name());
    }

    public String getFirstHeaderValue(String str) {
        List list = (List) this.f52239f.get(str.toLowerCase(Locale.US));
        if (list == null) {
            return null;
        }
        return (String) list.get(0);
    }

    public List<String> getHeaderValues(String str) {
        List list = (List) this.f52239f.get(str.toLowerCase(Locale.US));
        if (list == null) {
            return Collections.emptyList();
        }
        return Collections.unmodifiableList(list);
    }

    public Map<String, List<String>> getHeaders() {
        return Collections.unmodifiableMap(this.f52239f);
    }

    public MockLowLevelHttpResponse getResponse() {
        return this.f52240g;
    }

    public String getUrl() {
        return this.f52238e;
    }

    public MockLowLevelHttpRequest setResponse(MockLowLevelHttpResponse mockLowLevelHttpResponse) {
        this.f52240g = mockLowLevelHttpResponse;
        return this;
    }

    public MockLowLevelHttpRequest setUrl(String str) {
        this.f52238e = str;
        return this;
    }

    public MockLowLevelHttpRequest(String str) {
        this.f52238e = str;
    }
}

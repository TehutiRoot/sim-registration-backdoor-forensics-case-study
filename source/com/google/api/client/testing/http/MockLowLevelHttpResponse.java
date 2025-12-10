package com.google.api.client.testing.http;

import com.google.api.client.http.LowLevelHttpResponse;
import com.google.api.client.testing.util.TestableByteArrayInputStream;
import com.google.api.client.util.Beta;
import com.google.api.client.util.Preconditions;
import com.google.api.client.util.StringUtils;
import java.io.IOException;
import java.io.InputStream;
import java.util.ArrayList;
import java.util.List;

@Beta
/* loaded from: classes4.dex */
public class MockLowLevelHttpResponse extends LowLevelHttpResponse {

    /* renamed from: a */
    public InputStream f52241a;

    /* renamed from: b */
    public String f52242b;

    /* renamed from: d */
    public String f52244d;

    /* renamed from: g */
    public String f52247g;

    /* renamed from: i */
    public boolean f52249i;

    /* renamed from: c */
    public int f52243c = 200;

    /* renamed from: e */
    public List f52245e = new ArrayList();

    /* renamed from: f */
    public List f52246f = new ArrayList();

    /* renamed from: h */
    public long f52248h = -1;

    public MockLowLevelHttpResponse addHeader(String str, String str2) {
        this.f52245e.add(Preconditions.checkNotNull(str));
        this.f52246f.add(Preconditions.checkNotNull(str2));
        return this;
    }

    @Override // com.google.api.client.http.LowLevelHttpResponse
    public void disconnect() throws IOException {
        this.f52249i = true;
        super.disconnect();
    }

    @Override // com.google.api.client.http.LowLevelHttpResponse
    public InputStream getContent() throws IOException {
        return this.f52241a;
    }

    @Override // com.google.api.client.http.LowLevelHttpResponse
    public String getContentEncoding() {
        return this.f52247g;
    }

    @Override // com.google.api.client.http.LowLevelHttpResponse
    public long getContentLength() {
        return this.f52248h;
    }

    @Override // com.google.api.client.http.LowLevelHttpResponse
    public final String getContentType() {
        return this.f52242b;
    }

    @Override // com.google.api.client.http.LowLevelHttpResponse
    public int getHeaderCount() {
        return this.f52245e.size();
    }

    @Override // com.google.api.client.http.LowLevelHttpResponse
    public String getHeaderName(int i) {
        return (String) this.f52245e.get(i);
    }

    public final List<String> getHeaderNames() {
        return this.f52245e;
    }

    @Override // com.google.api.client.http.LowLevelHttpResponse
    public String getHeaderValue(int i) {
        return (String) this.f52246f.get(i);
    }

    public final List<String> getHeaderValues() {
        return this.f52246f;
    }

    @Override // com.google.api.client.http.LowLevelHttpResponse
    public String getReasonPhrase() {
        return this.f52244d;
    }

    @Override // com.google.api.client.http.LowLevelHttpResponse
    public int getStatusCode() {
        return this.f52243c;
    }

    @Override // com.google.api.client.http.LowLevelHttpResponse
    public String getStatusLine() {
        StringBuilder sb = new StringBuilder();
        sb.append(this.f52243c);
        String str = this.f52244d;
        if (str != null) {
            sb.append(str);
        }
        return sb.toString();
    }

    public boolean isDisconnected() {
        return this.f52249i;
    }

    public MockLowLevelHttpResponse setContent(String str) {
        if (str == null) {
            return setZeroContent();
        }
        return setContent(StringUtils.getBytesUtf8(str));
    }

    public MockLowLevelHttpResponse setContentEncoding(String str) {
        this.f52247g = str;
        return this;
    }

    public MockLowLevelHttpResponse setContentLength(long j) {
        boolean z;
        this.f52248h = j;
        if (j >= -1) {
            z = true;
        } else {
            z = false;
        }
        Preconditions.checkArgument(z);
        return this;
    }

    public MockLowLevelHttpResponse setContentType(String str) {
        this.f52242b = str;
        return this;
    }

    public MockLowLevelHttpResponse setHeaderNames(List<String> list) {
        this.f52245e = (List) Preconditions.checkNotNull(list);
        return this;
    }

    public MockLowLevelHttpResponse setHeaderValues(List<String> list) {
        this.f52246f = (List) Preconditions.checkNotNull(list);
        return this;
    }

    public MockLowLevelHttpResponse setReasonPhrase(String str) {
        this.f52244d = str;
        return this;
    }

    public MockLowLevelHttpResponse setStatusCode(int i) {
        this.f52243c = i;
        return this;
    }

    public MockLowLevelHttpResponse setZeroContent() {
        this.f52241a = null;
        setContentLength(0L);
        return this;
    }

    public MockLowLevelHttpResponse setContent(byte[] bArr) {
        if (bArr == null) {
            return setZeroContent();
        }
        this.f52241a = new TestableByteArrayInputStream(bArr);
        setContentLength(bArr.length);
        return this;
    }

    public MockLowLevelHttpResponse setContent(InputStream inputStream) {
        this.f52241a = inputStream;
        return this;
    }
}

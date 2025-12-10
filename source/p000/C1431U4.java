package p000;

import com.google.api.client.http.LowLevelHttpResponse;
import java.io.InputStream;
import org.apache.http.Header;
import org.apache.http.HttpEntity;
import org.apache.http.HttpResponse;
import org.apache.http.StatusLine;
import org.apache.http.client.methods.HttpRequestBase;

/* renamed from: U4 */
/* loaded from: classes4.dex */
public final class C1431U4 extends LowLevelHttpResponse {

    /* renamed from: a */
    public final HttpRequestBase f6198a;

    /* renamed from: b */
    public final HttpResponse f6199b;

    /* renamed from: c */
    public final Header[] f6200c;

    public C1431U4(HttpRequestBase httpRequestBase, HttpResponse httpResponse) {
        this.f6198a = httpRequestBase;
        this.f6199b = httpResponse;
        this.f6200c = httpResponse.getAllHeaders();
    }

    @Override // com.google.api.client.http.LowLevelHttpResponse
    public void disconnect() {
        this.f6198a.abort();
    }

    @Override // com.google.api.client.http.LowLevelHttpResponse
    public InputStream getContent() {
        HttpEntity entity = this.f6199b.getEntity();
        if (entity == null) {
            return null;
        }
        return entity.getContent();
    }

    @Override // com.google.api.client.http.LowLevelHttpResponse
    public String getContentEncoding() {
        Header contentEncoding;
        HttpEntity entity = this.f6199b.getEntity();
        if (entity != null && (contentEncoding = entity.getContentEncoding()) != null) {
            return contentEncoding.getValue();
        }
        return null;
    }

    @Override // com.google.api.client.http.LowLevelHttpResponse
    public long getContentLength() {
        HttpEntity entity = this.f6199b.getEntity();
        if (entity == null) {
            return -1L;
        }
        return entity.getContentLength();
    }

    @Override // com.google.api.client.http.LowLevelHttpResponse
    public String getContentType() {
        Header contentType;
        HttpEntity entity = this.f6199b.getEntity();
        if (entity != null && (contentType = entity.getContentType()) != null) {
            return contentType.getValue();
        }
        return null;
    }

    @Override // com.google.api.client.http.LowLevelHttpResponse
    public int getHeaderCount() {
        return this.f6200c.length;
    }

    @Override // com.google.api.client.http.LowLevelHttpResponse
    public String getHeaderName(int i) {
        return this.f6200c[i].getName();
    }

    @Override // com.google.api.client.http.LowLevelHttpResponse
    public String getHeaderValue(int i) {
        return this.f6200c[i].getValue();
    }

    @Override // com.google.api.client.http.LowLevelHttpResponse
    public String getReasonPhrase() {
        StatusLine statusLine = this.f6199b.getStatusLine();
        if (statusLine == null) {
            return null;
        }
        return statusLine.getReasonPhrase();
    }

    @Override // com.google.api.client.http.LowLevelHttpResponse
    public int getStatusCode() {
        StatusLine statusLine = this.f6199b.getStatusLine();
        if (statusLine == null) {
            return 0;
        }
        return statusLine.getStatusCode();
    }

    @Override // com.google.api.client.http.LowLevelHttpResponse
    public String getStatusLine() {
        StatusLine statusLine = this.f6199b.getStatusLine();
        if (statusLine == null) {
            return null;
        }
        return statusLine.toString();
    }
}

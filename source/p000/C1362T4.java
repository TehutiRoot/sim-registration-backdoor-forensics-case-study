package p000;

import com.google.api.client.http.LowLevelHttpResponse;
import java.io.InputStream;
import org.apache.http.Header;
import org.apache.http.HttpEntity;
import org.apache.http.HttpResponse;
import org.apache.http.StatusLine;
import org.apache.http.client.methods.HttpRequestBase;

/* renamed from: T4 */
/* loaded from: classes4.dex */
public final class C1362T4 extends LowLevelHttpResponse {

    /* renamed from: a */
    public final HttpRequestBase f5915a;

    /* renamed from: b */
    public final HttpResponse f5916b;

    /* renamed from: c */
    public final Header[] f5917c;

    public C1362T4(HttpRequestBase httpRequestBase, HttpResponse httpResponse) {
        this.f5915a = httpRequestBase;
        this.f5916b = httpResponse;
        this.f5917c = httpResponse.getAllHeaders();
    }

    @Override // com.google.api.client.http.LowLevelHttpResponse
    public void disconnect() {
        this.f5915a.abort();
    }

    @Override // com.google.api.client.http.LowLevelHttpResponse
    public InputStream getContent() {
        HttpEntity entity = this.f5916b.getEntity();
        if (entity == null) {
            return null;
        }
        return entity.getContent();
    }

    @Override // com.google.api.client.http.LowLevelHttpResponse
    public String getContentEncoding() {
        Header contentEncoding;
        HttpEntity entity = this.f5916b.getEntity();
        if (entity != null && (contentEncoding = entity.getContentEncoding()) != null) {
            return contentEncoding.getValue();
        }
        return null;
    }

    @Override // com.google.api.client.http.LowLevelHttpResponse
    public long getContentLength() {
        HttpEntity entity = this.f5916b.getEntity();
        if (entity == null) {
            return -1L;
        }
        return entity.getContentLength();
    }

    @Override // com.google.api.client.http.LowLevelHttpResponse
    public String getContentType() {
        Header contentType;
        HttpEntity entity = this.f5916b.getEntity();
        if (entity != null && (contentType = entity.getContentType()) != null) {
            return contentType.getValue();
        }
        return null;
    }

    @Override // com.google.api.client.http.LowLevelHttpResponse
    public int getHeaderCount() {
        return this.f5917c.length;
    }

    @Override // com.google.api.client.http.LowLevelHttpResponse
    public String getHeaderName(int i) {
        return this.f5917c[i].getName();
    }

    @Override // com.google.api.client.http.LowLevelHttpResponse
    public String getHeaderValue(int i) {
        return this.f5917c[i].getValue();
    }

    @Override // com.google.api.client.http.LowLevelHttpResponse
    public String getReasonPhrase() {
        StatusLine statusLine = this.f5916b.getStatusLine();
        if (statusLine == null) {
            return null;
        }
        return statusLine.getReasonPhrase();
    }

    @Override // com.google.api.client.http.LowLevelHttpResponse
    public int getStatusCode() {
        StatusLine statusLine = this.f5916b.getStatusLine();
        if (statusLine == null) {
            return 0;
        }
        return statusLine.getStatusCode();
    }

    @Override // com.google.api.client.http.LowLevelHttpResponse
    public String getStatusLine() {
        StatusLine statusLine = this.f5916b.getStatusLine();
        if (statusLine == null) {
            return null;
        }
        return statusLine.toString();
    }
}

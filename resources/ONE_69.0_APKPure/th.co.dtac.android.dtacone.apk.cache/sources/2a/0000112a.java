package p000;

import com.google.api.client.http.LowLevelHttpRequest;
import com.google.api.client.http.LowLevelHttpResponse;
import com.google.api.client.util.Preconditions;
import org.apache.http.HttpEntityEnclosingRequest;
import org.apache.http.client.HttpClient;
import org.apache.http.client.methods.HttpRequestBase;
import org.apache.http.conn.params.ConnManagerParams;
import org.apache.http.params.HttpConnectionParams;
import org.apache.http.params.HttpParams;

/* renamed from: S4 */
/* loaded from: classes4.dex */
public final class C1268S4 extends LowLevelHttpRequest {

    /* renamed from: e */
    public final HttpClient f5724e;

    /* renamed from: f */
    public final HttpRequestBase f5725f;

    public C1268S4(HttpClient httpClient, HttpRequestBase httpRequestBase) {
        this.f5724e = httpClient;
        this.f5725f = httpRequestBase;
    }

    @Override // com.google.api.client.http.LowLevelHttpRequest
    public void addHeader(String str, String str2) {
        this.f5725f.addHeader(str, str2);
    }

    @Override // com.google.api.client.http.LowLevelHttpRequest
    public LowLevelHttpResponse execute() {
        if (getStreamingContent() != null) {
            HttpRequestBase httpRequestBase = this.f5725f;
            Preconditions.checkState(httpRequestBase instanceof HttpEntityEnclosingRequest, "Apache HTTP client does not support %s requests with content.", httpRequestBase.getRequestLine().getMethod());
            C0145Bx c0145Bx = new C0145Bx(getContentLength(), getStreamingContent());
            c0145Bx.setContentEncoding(getContentEncoding());
            c0145Bx.setContentType(getContentType());
            if (getContentLength() == -1) {
                c0145Bx.setChunked(true);
            }
            ((HttpEntityEnclosingRequest) this.f5725f).setEntity(c0145Bx);
        }
        HttpRequestBase httpRequestBase2 = this.f5725f;
        return new C1413U4(httpRequestBase2, this.f5724e.execute(httpRequestBase2));
    }

    @Override // com.google.api.client.http.LowLevelHttpRequest
    public void setTimeout(int i, int i2) {
        HttpParams params = this.f5725f.getParams();
        ConnManagerParams.setTimeout(params, i);
        HttpConnectionParams.setConnectionTimeout(params, i);
        HttpConnectionParams.setSoTimeout(params, i2);
    }
}
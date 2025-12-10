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
public final class C1288S4 extends LowLevelHttpRequest {

    /* renamed from: e */
    public final HttpClient f5507e;

    /* renamed from: f */
    public final HttpRequestBase f5508f;

    public C1288S4(HttpClient httpClient, HttpRequestBase httpRequestBase) {
        this.f5507e = httpClient;
        this.f5508f = httpRequestBase;
    }

    @Override // com.google.api.client.http.LowLevelHttpRequest
    public void addHeader(String str, String str2) {
        this.f5508f.addHeader(str, str2);
    }

    @Override // com.google.api.client.http.LowLevelHttpRequest
    public LowLevelHttpResponse execute() {
        if (getStreamingContent() != null) {
            HttpRequestBase httpRequestBase = this.f5508f;
            Preconditions.checkState(httpRequestBase instanceof HttpEntityEnclosingRequest, "Apache HTTP client does not support %s requests with content.", httpRequestBase.getRequestLine().getMethod());
            C0145Bx c0145Bx = new C0145Bx(getContentLength(), getStreamingContent());
            c0145Bx.setContentEncoding(getContentEncoding());
            c0145Bx.setContentType(getContentType());
            if (getContentLength() == -1) {
                c0145Bx.setChunked(true);
            }
            ((HttpEntityEnclosingRequest) this.f5508f).setEntity(c0145Bx);
        }
        HttpRequestBase httpRequestBase2 = this.f5508f;
        return new C1431U4(httpRequestBase2, this.f5507e.execute(httpRequestBase2));
    }

    @Override // com.google.api.client.http.LowLevelHttpRequest
    public void setTimeout(int i, int i2) {
        HttpParams params = this.f5508f.getParams();
        ConnManagerParams.setTimeout(params, i);
        HttpConnectionParams.setConnectionTimeout(params, i);
        HttpConnectionParams.setSoTimeout(params, i2);
    }
}

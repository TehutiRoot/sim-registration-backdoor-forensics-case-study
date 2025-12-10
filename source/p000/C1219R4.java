package p000;

import com.google.api.client.http.LowLevelHttpRequest;
import com.google.api.client.http.LowLevelHttpResponse;
import com.google.api.client.util.Preconditions;
import org.apache.http.HttpEntityEnclosingRequest;
import org.apache.http.client.HttpClient;
import org.apache.http.client.config.RequestConfig;
import org.apache.http.client.methods.HttpRequestBase;

/* renamed from: R4 */
/* loaded from: classes4.dex */
public final class C1219R4 extends LowLevelHttpRequest {

    /* renamed from: e */
    public final HttpClient f5257e;

    /* renamed from: f */
    public final HttpRequestBase f5258f;

    /* renamed from: g */
    public RequestConfig.Builder f5259g = RequestConfig.custom().setRedirectsEnabled(false).setNormalizeUri(false).setStaleConnectionCheckEnabled(false);

    public C1219R4(HttpClient httpClient, HttpRequestBase httpRequestBase) {
        this.f5257e = httpClient;
        this.f5258f = httpRequestBase;
    }

    @Override // com.google.api.client.http.LowLevelHttpRequest
    public void addHeader(String str, String str2) {
        this.f5258f.addHeader(str, str2);
    }

    @Override // com.google.api.client.http.LowLevelHttpRequest
    public LowLevelHttpResponse execute() {
        if (getStreamingContent() != null) {
            HttpRequestBase httpRequestBase = this.f5258f;
            Preconditions.checkState(httpRequestBase instanceof HttpEntityEnclosingRequest, "Apache HTTP client does not support %s requests with content.", httpRequestBase.getRequestLine().getMethod());
            C0064Ax c0064Ax = new C0064Ax(getContentLength(), getStreamingContent());
            c0064Ax.setContentEncoding(getContentEncoding());
            c0064Ax.setContentType(getContentType());
            if (getContentLength() == -1) {
                c0064Ax.setChunked(true);
            }
            ((HttpEntityEnclosingRequest) this.f5258f).setEntity(c0064Ax);
        }
        this.f5258f.setConfig(this.f5259g.build());
        HttpRequestBase httpRequestBase2 = this.f5258f;
        return new C1362T4(httpRequestBase2, this.f5257e.execute(httpRequestBase2));
    }

    @Override // com.google.api.client.http.LowLevelHttpRequest
    public void setTimeout(int i, int i2) {
        this.f5259g.setConnectTimeout(i).setSocketTimeout(i2);
    }
}

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
public final class C1197R4 extends LowLevelHttpRequest {

    /* renamed from: e */
    public final HttpClient f5390e;

    /* renamed from: f */
    public final HttpRequestBase f5391f;

    /* renamed from: g */
    public RequestConfig.Builder f5392g = RequestConfig.custom().setRedirectsEnabled(false).setNormalizeUri(false).setStaleConnectionCheckEnabled(false);

    public C1197R4(HttpClient httpClient, HttpRequestBase httpRequestBase) {
        this.f5390e = httpClient;
        this.f5391f = httpRequestBase;
    }

    @Override // com.google.api.client.http.LowLevelHttpRequest
    public void addHeader(String str, String str2) {
        this.f5391f.addHeader(str, str2);
    }

    @Override // com.google.api.client.http.LowLevelHttpRequest
    public LowLevelHttpResponse execute() {
        if (getStreamingContent() != null) {
            HttpRequestBase httpRequestBase = this.f5391f;
            Preconditions.checkState(httpRequestBase instanceof HttpEntityEnclosingRequest, "Apache HTTP client does not support %s requests with content.", httpRequestBase.getRequestLine().getMethod());
            C0066Ax c0066Ax = new C0066Ax(getContentLength(), getStreamingContent());
            c0066Ax.setContentEncoding(getContentEncoding());
            c0066Ax.setContentType(getContentType());
            if (getContentLength() == -1) {
                c0066Ax.setChunked(true);
            }
            ((HttpEntityEnclosingRequest) this.f5391f).setEntity(c0066Ax);
        }
        this.f5391f.setConfig(this.f5392g.build());
        HttpRequestBase httpRequestBase2 = this.f5391f;
        return new C1344T4(httpRequestBase2, this.f5390e.execute(httpRequestBase2));
    }

    @Override // com.google.api.client.http.LowLevelHttpRequest
    public void setTimeout(int i, int i2) {
        this.f5392g.setConnectTimeout(i).setSocketTimeout(i2);
    }
}
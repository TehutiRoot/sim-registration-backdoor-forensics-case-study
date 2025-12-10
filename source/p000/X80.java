package p000;

import com.google.api.client.util.Preconditions;
import java.net.URI;
import org.apache.http.client.methods.HttpEntityEnclosingRequestBase;

/* renamed from: X80 */
/* loaded from: classes4.dex */
public final class X80 extends HttpEntityEnclosingRequestBase {

    /* renamed from: f */
    public final String f7395f;

    public X80(String str, String str2) {
        this.f7395f = (String) Preconditions.checkNotNull(str);
        setURI(URI.create(str2));
    }

    @Override // org.apache.http.client.methods.HttpRequestBase, org.apache.http.client.methods.HttpUriRequest
    public String getMethod() {
        return this.f7395f;
    }
}

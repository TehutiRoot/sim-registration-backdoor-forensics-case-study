package p000;

import com.google.api.client.util.Preconditions;
import java.net.URI;
import org.apache.http.client.methods.HttpEntityEnclosingRequestBase;

/* renamed from: Y80 */
/* loaded from: classes4.dex */
public final class Y80 extends HttpEntityEnclosingRequestBase {

    /* renamed from: f */
    public final String f7691f;

    public Y80(String str, String str2) {
        this.f7691f = (String) Preconditions.checkNotNull(str);
        setURI(URI.create(str2));
    }

    @Override // org.apache.http.client.methods.HttpRequestBase, org.apache.http.client.methods.HttpUriRequest
    public String getMethod() {
        return this.f7691f;
    }
}

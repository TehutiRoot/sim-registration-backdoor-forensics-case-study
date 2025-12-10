package p000;

import com.google.api.client.util.Preconditions;
import java.net.URI;
import org.apache.http.client.methods.HttpEntityEnclosingRequestBase;

/* renamed from: d90  reason: case insensitive filesystem */
/* loaded from: classes4.dex */
public final class C19523d90 extends HttpEntityEnclosingRequestBase {

    /* renamed from: f */
    public final String f61121f;

    public C19523d90(String str, String str2) {
        this.f61121f = (String) Preconditions.checkNotNull(str);
        setURI(URI.create(str2));
    }

    @Override // org.apache.http.client.methods.HttpRequestBase, org.apache.http.client.methods.HttpUriRequest
    public String getMethod() {
        return this.f61121f;
    }
}
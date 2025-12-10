package p000;

import com.google.android.gms.auth.api.proxy.ProxyApi;
import com.google.android.gms.auth.api.proxy.ProxyResponse;
import com.google.android.gms.common.api.Status;

/* renamed from: Yc2  reason: case insensitive filesystem */
/* loaded from: classes3.dex */
public final class C18805Yc2 implements ProxyApi.ProxyResult {

    /* renamed from: a */
    public Status f7798a;

    /* renamed from: b */
    public ProxyResponse f7799b;

    public C18805Yc2(ProxyResponse proxyResponse) {
        this.f7799b = proxyResponse;
        this.f7798a = Status.RESULT_SUCCESS;
    }

    @Override // com.google.android.gms.auth.api.proxy.ProxyApi.ProxyResult
    public final ProxyResponse getResponse() {
        return this.f7799b;
    }

    @Override // com.google.android.gms.common.api.Result
    public final Status getStatus() {
        return this.f7798a;
    }

    public C18805Yc2(Status status) {
        this.f7798a = status;
    }
}

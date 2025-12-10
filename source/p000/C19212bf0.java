package p000;

import com.google.firebase.iid.InstanceIdResult;

/* renamed from: bf0  reason: case insensitive filesystem */
/* loaded from: classes4.dex */
public final class C19212bf0 implements InstanceIdResult {

    /* renamed from: a */
    public final String f39104a;

    /* renamed from: b */
    public final String f39105b;

    public C19212bf0(String str, String str2) {
        this.f39104a = str;
        this.f39105b = str2;
    }

    @Override // com.google.firebase.iid.InstanceIdResult
    public String getId() {
        return this.f39104a;
    }

    @Override // com.google.firebase.iid.InstanceIdResult
    public String getToken() {
        return this.f39105b;
    }
}

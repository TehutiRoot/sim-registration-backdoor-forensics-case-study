package p000;

import com.google.firebase.iid.InstanceIdResult;

/* renamed from: hf0  reason: case insensitive filesystem */
/* loaded from: classes4.dex */
public final class C20298hf0 implements InstanceIdResult {

    /* renamed from: a */
    public final String f62571a;

    /* renamed from: b */
    public final String f62572b;

    public C20298hf0(String str, String str2) {
        this.f62571a = str;
        this.f62572b = str2;
    }

    @Override // com.google.firebase.iid.InstanceIdResult
    public String getId() {
        return this.f62571a;
    }

    @Override // com.google.firebase.iid.InstanceIdResult
    public String getToken() {
        return this.f62572b;
    }
}
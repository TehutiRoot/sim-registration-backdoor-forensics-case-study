package p000;

import com.google.android.gms.auth.api.proxy.AuthApiStatusCodes;
import com.google.android.gms.common.api.Status;
import com.google.android.gms.internal.auth.zzaj;
import com.google.android.gms.internal.auth.zzax;

/* renamed from: Sc2  reason: case insensitive filesystem */
/* loaded from: classes3.dex */
public final class BinderC18421Sc2 extends zzaj {

    /* renamed from: a */
    public final /* synthetic */ C18037Mc2 f5656a;

    public BinderC18421Sc2(C18037Mc2 c18037Mc2) {
        this.f5656a = c18037Mc2;
    }

    @Override // com.google.android.gms.internal.auth.zzaj, com.google.android.gms.internal.auth.zzal
    public final void zzb(String str) {
        if (str != null) {
            this.f5656a.setResult((C18037Mc2) new zzax(str));
        } else {
            this.f5656a.setResult((C18037Mc2) AbstractC21785qc2.m23466e(new Status(AuthApiStatusCodes.AUTH_APP_CERT_ERROR)));
        }
    }
}

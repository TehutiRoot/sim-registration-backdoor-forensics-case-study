package p000;

import com.google.android.gms.common.api.Result;
import com.google.android.gms.common.api.Status;

/* renamed from: GJ2 */
/* loaded from: classes3.dex */
public final class GJ2 implements Result {

    /* renamed from: a */
    public final Status f1944a;

    public GJ2(Status status) {
        this.f1944a = status;
    }

    @Override // com.google.android.gms.common.api.Result
    public final Status getStatus() {
        return this.f1944a;
    }
}
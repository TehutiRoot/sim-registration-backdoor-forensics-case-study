package p000;

import com.google.android.gms.common.api.Result;
import com.google.android.gms.common.api.Status;

/* renamed from: JI2 */
/* loaded from: classes3.dex */
public final class JI2 implements Result {

    /* renamed from: a */
    public final Status f2761a;

    public JI2(Status status) {
        this.f2761a = status;
    }

    @Override // com.google.android.gms.common.api.Result
    public final Status getStatus() {
        return this.f2761a;
    }
}

package p000;

import com.google.android.gms.common.api.Status;
import com.google.android.gms.common.api.internal.BaseImplementation;
import com.google.android.gms.common.internal.service.zaa;

/* renamed from: R82 */
/* loaded from: classes3.dex */
public final class R82 extends zaa {

    /* renamed from: a */
    public final BaseImplementation.ResultHolder f5279a;

    public R82(BaseImplementation.ResultHolder resultHolder) {
        this.f5279a = resultHolder;
    }

    @Override // com.google.android.gms.common.internal.service.zaa, com.google.android.gms.common.internal.service.zak
    public final void zab(int i) {
        this.f5279a.setResult(new Status(i));
    }
}

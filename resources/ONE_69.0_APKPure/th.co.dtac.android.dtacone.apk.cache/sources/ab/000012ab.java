package p000;

import com.google.android.gms.common.api.internal.BaseImplementation;
import com.google.android.gms.common.internal.Preconditions;
import com.google.android.gms.internal.location.zzap;
import com.google.android.gms.location.LocationSettingsResult;

/* renamed from: Te2  reason: case insensitive filesystem */
/* loaded from: classes3.dex */
public final class BinderC18533Te2 extends zzap {

    /* renamed from: a */
    public final BaseImplementation.ResultHolder f6382a;

    public BinderC18533Te2(BaseImplementation.ResultHolder resultHolder) {
        boolean z;
        if (resultHolder != null) {
            z = true;
        } else {
            z = false;
        }
        Preconditions.checkArgument(z, "listener can't be null.");
        this.f6382a = resultHolder;
    }

    @Override // com.google.android.gms.internal.location.zzaq
    public final void zzb(LocationSettingsResult locationSettingsResult) {
        this.f6382a.setResult(locationSettingsResult);
    }
}
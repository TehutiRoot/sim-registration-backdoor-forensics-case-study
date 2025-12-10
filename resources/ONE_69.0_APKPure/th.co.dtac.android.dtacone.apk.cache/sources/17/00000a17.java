package p000;

import android.app.PendingIntent;
import com.google.android.gms.common.api.Status;
import com.google.android.gms.common.api.internal.BaseImplementation;
import com.google.android.gms.common.internal.Preconditions;
import com.google.android.gms.internal.location.zzaj;

/* renamed from: Ke2  reason: case insensitive filesystem */
/* loaded from: classes3.dex */
public final class BinderC17948Ke2 extends zzaj {

    /* renamed from: a */
    public final BaseImplementation.ResultHolder f3370a;

    public BinderC17948Ke2(BaseImplementation.ResultHolder resultHolder) {
        boolean z;
        if (resultHolder != null) {
            z = true;
        } else {
            z = false;
        }
        Preconditions.checkArgument(z, "listener can't be null.");
        this.f3370a = resultHolder;
    }

    /* renamed from: a */
    public final void m67692a(int i) {
        BaseImplementation.ResultHolder resultHolder = this.f3370a;
        if (i != 0 && (i < 1000 || i >= 1006)) {
            i = 13;
        }
        resultHolder.setResult(new Status(i));
    }

    @Override // com.google.android.gms.internal.location.zzak
    public final void zzb(int i, String[] strArr) {
        m67692a(i);
    }

    @Override // com.google.android.gms.internal.location.zzak
    public final void zzc(int i, PendingIntent pendingIntent) {
        m67692a(i);
    }

    @Override // com.google.android.gms.internal.location.zzak
    public final void zzd(int i, String[] strArr) {
        m67692a(i);
    }
}
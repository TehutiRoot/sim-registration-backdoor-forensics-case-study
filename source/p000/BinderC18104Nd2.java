package p000;

import android.app.PendingIntent;
import com.google.android.gms.common.api.Status;
import com.google.android.gms.common.api.internal.BaseImplementation;
import com.google.android.gms.common.internal.Preconditions;
import com.google.android.gms.internal.location.zzaj;

/* renamed from: Nd2  reason: case insensitive filesystem */
/* loaded from: classes3.dex */
public final class BinderC18104Nd2 extends zzaj {

    /* renamed from: a */
    public final BaseImplementation.ResultHolder f4156a;

    public BinderC18104Nd2(BaseImplementation.ResultHolder resultHolder) {
        boolean z;
        if (resultHolder != null) {
            z = true;
        } else {
            z = false;
        }
        Preconditions.checkArgument(z, "listener can't be null.");
        this.f4156a = resultHolder;
    }

    /* renamed from: a */
    public final void m67207a(int i) {
        BaseImplementation.ResultHolder resultHolder = this.f4156a;
        if (i != 0 && (i < 1000 || i >= 1006)) {
            i = 13;
        }
        resultHolder.setResult(new Status(i));
    }

    @Override // com.google.android.gms.internal.location.zzak
    public final void zzb(int i, String[] strArr) {
        m67207a(i);
    }

    @Override // com.google.android.gms.internal.location.zzak
    public final void zzc(int i, PendingIntent pendingIntent) {
        m67207a(i);
    }

    @Override // com.google.android.gms.internal.location.zzak
    public final void zzd(int i, String[] strArr) {
        m67207a(i);
    }
}

package p000;

import com.google.android.gms.common.api.internal.ListenerHolder;
import com.google.android.gms.location.LocationAvailability;
import com.google.android.gms.location.LocationResult;
import com.google.android.gms.location.zzbh;

/* renamed from: ed2  reason: case insensitive filesystem */
/* loaded from: classes3.dex */
public final class BinderC19724ed2 extends zzbh {

    /* renamed from: a */
    public final ListenerHolder f61546a;

    public BinderC19724ed2(ListenerHolder listenerHolder) {
        this.f61546a = listenerHolder;
    }

    public final synchronized void zzc() {
        this.f61546a.clear();
    }

    @Override // com.google.android.gms.location.zzbi
    public final void zzd(LocationAvailability locationAvailability) {
        this.f61546a.notifyListener(new C18869Zc2(this, locationAvailability));
    }

    @Override // com.google.android.gms.location.zzbi
    public final void zze(LocationResult locationResult) {
        this.f61546a.notifyListener(new C18549Uc2(this, locationResult));
    }
}

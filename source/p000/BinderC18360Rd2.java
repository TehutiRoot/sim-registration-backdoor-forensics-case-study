package p000;

import android.location.Location;
import com.google.android.gms.common.api.internal.ListenerHolder;
import com.google.android.gms.location.zzbk;

/* renamed from: Rd2  reason: case insensitive filesystem */
/* loaded from: classes3.dex */
public final class BinderC18360Rd2 extends zzbk {

    /* renamed from: a */
    public final ListenerHolder f5378a;

    public BinderC18360Rd2(ListenerHolder listenerHolder) {
        this.f5378a = listenerHolder;
    }

    public final synchronized void zzc() {
        this.f5378a.clear();
    }

    @Override // com.google.android.gms.location.zzbl
    public final synchronized void zzd(Location location) {
        this.f5378a.notifyListener(new C18296Qd2(this, location));
    }
}

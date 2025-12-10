package p000;

import android.location.Location;
import com.google.android.gms.common.api.internal.ListenerHolder;
import com.google.android.gms.location.LocationListener;

/* renamed from: Qd2  reason: case insensitive filesystem */
/* loaded from: classes3.dex */
public final class C18296Qd2 implements ListenerHolder.Notifier {

    /* renamed from: a */
    public final /* synthetic */ Location f5106a;

    public C18296Qd2(BinderC18360Rd2 binderC18360Rd2, Location location) {
        this.f5106a = location;
    }

    @Override // com.google.android.gms.common.api.internal.ListenerHolder.Notifier
    public final /* bridge */ /* synthetic */ void notifyListener(Object obj) {
        ((LocationListener) obj).onLocationChanged(this.f5106a);
    }

    @Override // com.google.android.gms.common.api.internal.ListenerHolder.Notifier
    public final void onNotifyListenerFailed() {
    }
}

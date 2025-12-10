package p000;

import android.location.Location;
import com.google.android.gms.common.api.internal.ListenerHolder;
import com.google.android.gms.location.LocationListener;

/* renamed from: Ne2  reason: case insensitive filesystem */
/* loaded from: classes3.dex */
public final class C18143Ne2 implements ListenerHolder.Notifier {

    /* renamed from: a */
    public final /* synthetic */ Location f4220a;

    public C18143Ne2(BinderC18208Oe2 binderC18208Oe2, Location location) {
        this.f4220a = location;
    }

    @Override // com.google.android.gms.common.api.internal.ListenerHolder.Notifier
    public final /* bridge */ /* synthetic */ void notifyListener(Object obj) {
        ((LocationListener) obj).onLocationChanged(this.f4220a);
    }

    @Override // com.google.android.gms.common.api.internal.ListenerHolder.Notifier
    public final void onNotifyListenerFailed() {
    }
}
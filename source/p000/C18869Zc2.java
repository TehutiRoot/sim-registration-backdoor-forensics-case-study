package p000;

import com.google.android.gms.common.api.internal.ListenerHolder;
import com.google.android.gms.location.LocationAvailability;
import com.google.android.gms.location.LocationCallback;

/* renamed from: Zc2  reason: case insensitive filesystem */
/* loaded from: classes3.dex */
public final class C18869Zc2 implements ListenerHolder.Notifier {

    /* renamed from: a */
    public final /* synthetic */ LocationAvailability f8078a;

    public C18869Zc2(BinderC19724ed2 binderC19724ed2, LocationAvailability locationAvailability) {
        this.f8078a = locationAvailability;
    }

    @Override // com.google.android.gms.common.api.internal.ListenerHolder.Notifier
    public final /* synthetic */ void notifyListener(Object obj) {
        ((LocationCallback) obj).onLocationAvailability(this.f8078a);
    }

    @Override // com.google.android.gms.common.api.internal.ListenerHolder.Notifier
    public final void onNotifyListenerFailed() {
    }
}

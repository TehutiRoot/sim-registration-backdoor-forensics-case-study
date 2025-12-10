package p000;

import com.google.android.gms.common.api.internal.ListenerHolder;
import com.google.android.gms.location.LocationAvailability;
import com.google.android.gms.location.LocationCallback;

/* renamed from: Wd2  reason: case insensitive filesystem */
/* loaded from: classes3.dex */
public final class C18725Wd2 implements ListenerHolder.Notifier {

    /* renamed from: a */
    public final /* synthetic */ LocationAvailability f7333a;

    public C18725Wd2(BinderC19259be2 binderC19259be2, LocationAvailability locationAvailability) {
        this.f7333a = locationAvailability;
    }

    @Override // com.google.android.gms.common.api.internal.ListenerHolder.Notifier
    public final /* synthetic */ void notifyListener(Object obj) {
        ((LocationCallback) obj).onLocationAvailability(this.f7333a);
    }

    @Override // com.google.android.gms.common.api.internal.ListenerHolder.Notifier
    public final void onNotifyListenerFailed() {
    }
}
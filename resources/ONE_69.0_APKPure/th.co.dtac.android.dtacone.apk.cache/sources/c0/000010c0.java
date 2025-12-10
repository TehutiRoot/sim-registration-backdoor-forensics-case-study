package p000;

import com.google.android.gms.common.api.internal.ListenerHolder;
import com.google.android.gms.location.LocationCallback;
import com.google.android.gms.location.LocationResult;

/* renamed from: Rd2  reason: case insensitive filesystem */
/* loaded from: classes3.dex */
public final class C18400Rd2 implements ListenerHolder.Notifier {

    /* renamed from: a */
    public final /* synthetic */ LocationResult f5578a;

    public C18400Rd2(BinderC19259be2 binderC19259be2, LocationResult locationResult) {
        this.f5578a = locationResult;
    }

    @Override // com.google.android.gms.common.api.internal.ListenerHolder.Notifier
    public final /* synthetic */ void notifyListener(Object obj) {
        ((LocationCallback) obj).onLocationResult(this.f5578a);
    }

    @Override // com.google.android.gms.common.api.internal.ListenerHolder.Notifier
    public final void onNotifyListenerFailed() {
    }
}
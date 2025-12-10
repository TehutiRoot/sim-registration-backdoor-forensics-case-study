package p000;

import com.google.android.gms.common.api.internal.ListenerHolder;
import com.google.android.gms.location.LocationCallback;
import com.google.android.gms.location.LocationResult;

/* renamed from: Uc2  reason: case insensitive filesystem */
/* loaded from: classes3.dex */
public final class C18549Uc2 implements ListenerHolder.Notifier {

    /* renamed from: a */
    public final /* synthetic */ LocationResult f6381a;

    public C18549Uc2(BinderC19724ed2 binderC19724ed2, LocationResult locationResult) {
        this.f6381a = locationResult;
    }

    @Override // com.google.android.gms.common.api.internal.ListenerHolder.Notifier
    public final /* synthetic */ void notifyListener(Object obj) {
        ((LocationCallback) obj).onLocationResult(this.f6381a);
    }

    @Override // com.google.android.gms.common.api.internal.ListenerHolder.Notifier
    public final void onNotifyListenerFailed() {
    }
}

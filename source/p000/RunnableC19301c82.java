package p000;

import android.content.Context;
import com.google.android.gms.common.GoogleApiAvailabilityLight;
import com.google.android.gms.common.api.internal.zaaw;

/* renamed from: c82  reason: case insensitive filesystem */
/* loaded from: classes3.dex */
public final class RunnableC19301c82 implements Runnable {

    /* renamed from: a */
    public final /* synthetic */ zaaw f39343a;

    public RunnableC19301c82(zaaw zaawVar) {
        this.f39343a = zaawVar;
    }

    @Override // java.lang.Runnable
    public final void run() {
        GoogleApiAvailabilityLight googleApiAvailabilityLight;
        Context context;
        zaaw zaawVar = this.f39343a;
        googleApiAvailabilityLight = zaawVar.f44846d;
        context = zaawVar.f44845c;
        googleApiAvailabilityLight.cancelAvailabilityErrorNotifications(context);
    }
}

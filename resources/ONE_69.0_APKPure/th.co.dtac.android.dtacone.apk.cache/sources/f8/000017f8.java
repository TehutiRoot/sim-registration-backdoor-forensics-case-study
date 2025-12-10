package p000;

import android.content.Context;
import com.google.android.gms.common.GoogleApiAvailabilityLight;
import com.google.android.gms.common.api.internal.zaaw;

/* renamed from: Z82 */
/* loaded from: classes3.dex */
public final class Z82 implements Runnable {

    /* renamed from: a */
    public final /* synthetic */ zaaw f8105a;

    public Z82(zaaw zaawVar) {
        this.f8105a = zaawVar;
    }

    @Override // java.lang.Runnable
    public final void run() {
        GoogleApiAvailabilityLight googleApiAvailabilityLight;
        Context context;
        zaaw zaawVar = this.f8105a;
        googleApiAvailabilityLight = zaawVar.f44858d;
        context = zaawVar.f44857c;
        googleApiAvailabilityLight.cancelAvailabilityErrorNotifications(context);
    }
}
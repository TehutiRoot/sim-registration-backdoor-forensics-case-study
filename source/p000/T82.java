package p000;

import android.content.Context;
import android.os.Message;
import android.util.Log;
import com.google.android.gms.common.GoogleApiAvailability;
import com.google.android.gms.internal.base.zau;

/* renamed from: T82 */
/* loaded from: classes3.dex */
public final class T82 extends zau {

    /* renamed from: b */
    public final Context f5939b;

    /* renamed from: c */
    public final /* synthetic */ GoogleApiAvailability f5940c;

    /* JADX WARN: Illegal instructions before constructor call */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public T82(com.google.android.gms.common.GoogleApiAvailability r1, android.content.Context r2) {
        /*
            r0 = this;
            r0.f5940c = r1
            android.os.Looper r1 = android.os.Looper.myLooper()
            if (r1 != 0) goto Ld
            android.os.Looper r1 = android.os.Looper.getMainLooper()
            goto L11
        Ld:
            android.os.Looper r1 = android.os.Looper.myLooper()
        L11:
            r0.<init>(r1)
            android.content.Context r1 = r2.getApplicationContext()
            r0.f5939b = r1
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: p000.T82.<init>(com.google.android.gms.common.GoogleApiAvailability, android.content.Context):void");
    }

    @Override // android.os.Handler
    public final void handleMessage(Message message) {
        int i = message.what;
        if (i != 1) {
            Log.w("GoogleApiAvailability", "Don't know how to handle this message: " + i);
            return;
        }
        GoogleApiAvailability googleApiAvailability = this.f5940c;
        int isGooglePlayServicesAvailable = googleApiAvailability.isGooglePlayServicesAvailable(this.f5939b);
        if (googleApiAvailability.isUserResolvableError(isGooglePlayServicesAvailable)) {
            this.f5940c.showErrorNotification(this.f5939b, isGooglePlayServicesAvailable);
        }
    }
}

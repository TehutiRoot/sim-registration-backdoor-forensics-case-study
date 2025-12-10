package p000;

import android.content.Context;
import android.content.Intent;
import android.content.IntentFilter;
import androidx.core.app.NotificationCompat;
import com.google.firebase.crashlytics.internal.Logger;

/* renamed from: Za */
/* loaded from: classes4.dex */
public class C1813Za {

    /* renamed from: a */
    public final Float f8202a;

    /* renamed from: b */
    public final boolean f8203b;

    public C1813Za(Float f, boolean z) {
        this.f8203b = z;
        this.f8202a = f;
    }

    /* renamed from: a */
    public static C1813Za m65220a(Context context) {
        boolean z = false;
        Float f = null;
        try {
            Intent registerReceiver = context.registerReceiver(null, new IntentFilter("android.intent.action.BATTERY_CHANGED"));
            if (registerReceiver != null) {
                z = m65216e(registerReceiver);
                f = m65217d(registerReceiver);
            }
        } catch (IllegalStateException e) {
            Logger.getLogger().m39129e("An error occurred getting battery state.", e);
        }
        return new C1813Za(f, z);
    }

    /* renamed from: d */
    public static Float m65217d(Intent intent) {
        int intExtra = intent.getIntExtra("level", -1);
        int intExtra2 = intent.getIntExtra("scale", -1);
        if (intExtra != -1 && intExtra2 != -1) {
            return Float.valueOf(intExtra / intExtra2);
        }
        return null;
    }

    /* renamed from: e */
    public static boolean m65216e(Intent intent) {
        int intExtra = intent.getIntExtra(NotificationCompat.CATEGORY_STATUS, -1);
        if (intExtra == -1) {
            return false;
        }
        if (intExtra != 2 && intExtra != 5) {
            return false;
        }
        return true;
    }

    /* renamed from: b */
    public Float m65219b() {
        return this.f8202a;
    }

    /* renamed from: c */
    public int m65218c() {
        Float f;
        if (this.f8203b && (f = this.f8202a) != null) {
            if (f.floatValue() < 0.99d) {
                return 2;
            }
            return 3;
        }
        return 1;
    }
}
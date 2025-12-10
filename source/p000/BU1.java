package p000;

import android.content.BroadcastReceiver;
import android.content.Context;
import android.content.Intent;
import android.content.IntentFilter;
import android.net.ConnectivityManager;
import android.net.NetworkInfo;
import android.os.Build;
import android.os.PowerManager;
import android.util.Log;
import com.google.firebase.messaging.Constants;
import java.io.IOException;

/* renamed from: BU1 */
/* loaded from: classes4.dex */
public class BU1 implements Runnable {

    /* renamed from: f */
    public static final Object f408f = new Object();

    /* renamed from: g */
    public static Boolean f409g;

    /* renamed from: h */
    public static Boolean f410h;

    /* renamed from: a */
    public final Context f411a;

    /* renamed from: b */
    public final C22003rs0 f412b;

    /* renamed from: c */
    public final PowerManager.WakeLock f413c;

    /* renamed from: d */
    public final AU1 f414d;

    /* renamed from: e */
    public final long f415e;

    /* renamed from: BU1$a */
    /* loaded from: classes4.dex */
    public class C0107a extends BroadcastReceiver {

        /* renamed from: a */
        public BU1 f416a;

        public C0107a(BU1 bu1) {
            this.f416a = bu1;
        }

        /* renamed from: a */
        public void m68902a() {
            BU1.m68903l();
            BU1.this.f411a.registerReceiver(this, new IntentFilter("android.net.conn.CONNECTIVITY_CHANGE"));
        }

        @Override // android.content.BroadcastReceiver
        public synchronized void onReceive(Context context, Intent intent) {
            BU1 bu1 = this.f416a;
            if (bu1 == null) {
                return;
            }
            if (bu1.m68904k()) {
                BU1.m68903l();
                this.f416a.f414d.m69081m(this.f416a, 0L);
                context.unregisterReceiver(this);
                this.f416a = null;
            }
        }
    }

    public BU1(AU1 au1, Context context, C22003rs0 c22003rs0, long j) {
        this.f414d = au1;
        this.f411a = context;
        this.f415e = j;
        this.f412b = c22003rs0;
        this.f413c = ((PowerManager) context.getSystemService("power")).newWakeLock(1, Constants.FCM_WAKE_LOCK);
    }

    /* renamed from: f */
    public static String m68908f(String str) {
        return "Missing Permission: " + str + ". This permission should normally be included by the manifest merger, but may needed to be manually added to your manifest";
    }

    /* renamed from: g */
    public static boolean m68907g(Context context) {
        boolean booleanValue;
        boolean booleanValue2;
        synchronized (f408f) {
            try {
                Boolean bool = f410h;
                if (bool == null) {
                    booleanValue = m68906i(context, "android.permission.ACCESS_NETWORK_STATE", bool);
                } else {
                    booleanValue = bool.booleanValue();
                }
                Boolean valueOf = Boolean.valueOf(booleanValue);
                f410h = valueOf;
                booleanValue2 = valueOf.booleanValue();
            } catch (Throwable th2) {
                throw th2;
            }
        }
        return booleanValue2;
    }

    /* renamed from: i */
    public static boolean m68906i(Context context, String str, Boolean bool) {
        boolean z;
        if (bool != null) {
            return bool.booleanValue();
        }
        if (context.checkCallingOrSelfPermission(str) == 0) {
            z = true;
        } else {
            z = false;
        }
        if (!z && Log.isLoggable(Constants.TAG, 3)) {
            m68908f(str);
        }
        return z;
    }

    /* renamed from: j */
    public static boolean m68905j(Context context) {
        boolean booleanValue;
        boolean booleanValue2;
        synchronized (f408f) {
            try {
                Boolean bool = f409g;
                if (bool == null) {
                    booleanValue = m68906i(context, "android.permission.WAKE_LOCK", bool);
                } else {
                    booleanValue = bool.booleanValue();
                }
                Boolean valueOf = Boolean.valueOf(booleanValue);
                f409g = valueOf;
                booleanValue2 = valueOf.booleanValue();
            } catch (Throwable th2) {
                throw th2;
            }
        }
        return booleanValue2;
    }

    /* renamed from: l */
    public static boolean m68903l() {
        if (!Log.isLoggable(Constants.TAG, 3) && (Build.VERSION.SDK_INT != 23 || !Log.isLoggable(Constants.TAG, 3))) {
            return false;
        }
        return true;
    }

    /* renamed from: k */
    public final synchronized boolean m68904k() {
        NetworkInfo networkInfo;
        boolean z;
        try {
            ConnectivityManager connectivityManager = (ConnectivityManager) this.f411a.getSystemService("connectivity");
            if (connectivityManager != null) {
                networkInfo = connectivityManager.getActiveNetworkInfo();
            } else {
                networkInfo = null;
            }
            if (networkInfo != null) {
                if (networkInfo.isConnected()) {
                    z = true;
                }
            }
            z = false;
        } catch (Throwable th2) {
            throw th2;
        }
        return z;
    }

    @Override // java.lang.Runnable
    public void run() {
        if (m68905j(this.f411a)) {
            this.f413c.acquire(Constants.WAKE_LOCK_ACQUIRE_TIMEOUT_MILLIS);
        }
        try {
            try {
                this.f414d.m69079o(true);
            } catch (IOException e) {
                StringBuilder sb = new StringBuilder();
                sb.append("Failed to sync topics. Won't retry sync. ");
                sb.append(e.getMessage());
                this.f414d.m69079o(false);
                if (!m68905j(this.f411a)) {
                    return;
                }
            }
            if (!this.f412b.m23246g()) {
                this.f414d.m69079o(false);
                if (m68905j(this.f411a)) {
                    try {
                        this.f413c.release();
                    } catch (RuntimeException unused) {
                    }
                }
            } else if (m68907g(this.f411a) && !m68904k()) {
                new C0107a(this).m68902a();
                if (m68905j(this.f411a)) {
                    try {
                        this.f413c.release();
                    } catch (RuntimeException unused2) {
                    }
                }
            } else {
                if (this.f414d.m69075s()) {
                    this.f414d.m69079o(false);
                } else {
                    this.f414d.m69074t(this.f415e);
                }
                if (!m68905j(this.f411a)) {
                    return;
                }
                try {
                    this.f413c.release();
                } catch (RuntimeException unused3) {
                }
            }
        } catch (Throwable th2) {
            if (m68905j(this.f411a)) {
                try {
                    this.f413c.release();
                } catch (RuntimeException unused4) {
                }
            }
            throw th2;
        }
    }
}

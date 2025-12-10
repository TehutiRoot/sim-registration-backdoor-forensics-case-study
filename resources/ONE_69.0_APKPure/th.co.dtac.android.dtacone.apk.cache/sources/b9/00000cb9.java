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
import com.google.android.gms.common.util.concurrent.NamedThreadFactory;
import com.google.firebase.messaging.Constants;
import com.google.firebase.messaging.FirebaseMessaging;
import com.google.firebase.messaging.ServiceStarter;
import java.io.IOException;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.LinkedBlockingQueue;
import java.util.concurrent.ThreadPoolExecutor;
import java.util.concurrent.TimeUnit;

/* renamed from: NQ1 */
/* loaded from: classes4.dex */
public class NQ1 implements Runnable {

    /* renamed from: a */
    public final long f4166a;

    /* renamed from: b */
    public final PowerManager.WakeLock f4167b;

    /* renamed from: c */
    public final FirebaseMessaging f4168c;

    /* renamed from: d */
    public ExecutorService f4169d = new ThreadPoolExecutor(0, 1, 30, TimeUnit.SECONDS, new LinkedBlockingQueue(), new NamedThreadFactory("firebase-iid-executor"));

    /* renamed from: NQ1$a */
    /* loaded from: classes4.dex */
    public static class C0932a extends BroadcastReceiver {

        /* renamed from: a */
        public NQ1 f4170a;

        public C0932a(NQ1 nq1) {
            this.f4170a = nq1;
        }

        /* renamed from: a */
        public void m67240a() {
            NQ1.m67243c();
            this.f4170a.m67244b().registerReceiver(this, new IntentFilter("android.net.conn.CONNECTIVITY_CHANGE"));
        }

        @Override // android.content.BroadcastReceiver
        public void onReceive(Context context, Intent intent) {
            NQ1 nq1 = this.f4170a;
            if (nq1 == null || !nq1.m67242d()) {
                return;
            }
            NQ1.m67243c();
            this.f4170a.f4168c.m38502r(this.f4170a, 0L);
            this.f4170a.m67244b().unregisterReceiver(this);
            this.f4170a = null;
        }
    }

    public NQ1(FirebaseMessaging firebaseMessaging, long j) {
        this.f4168c = firebaseMessaging;
        this.f4166a = j;
        PowerManager.WakeLock newWakeLock = ((PowerManager) m67244b().getSystemService("power")).newWakeLock(1, "fiid-sync");
        this.f4167b = newWakeLock;
        newWakeLock.setReferenceCounted(false);
    }

    /* renamed from: c */
    public static boolean m67243c() {
        if (!Log.isLoggable(Constants.TAG, 3) && (Build.VERSION.SDK_INT != 23 || !Log.isLoggable(Constants.TAG, 3))) {
            return false;
        }
        return true;
    }

    /* renamed from: b */
    public Context m67244b() {
        return this.f4168c.m38501s();
    }

    /* renamed from: d */
    public boolean m67242d() {
        NetworkInfo networkInfo;
        ConnectivityManager connectivityManager = (ConnectivityManager) m67244b().getSystemService("connectivity");
        if (connectivityManager != null) {
            networkInfo = connectivityManager.getActiveNetworkInfo();
        } else {
            networkInfo = null;
        }
        if (networkInfo != null && networkInfo.isConnected()) {
            return true;
        }
        return false;
    }

    /* renamed from: f */
    public boolean m67241f() {
        try {
            if (this.f4168c.m38503q() == null) {
                return false;
            }
            Log.isLoggable(Constants.TAG, 3);
            return true;
        } catch (IOException e) {
            if (C60.m69004i(e.getMessage())) {
                Log.w(Constants.TAG, "Token retrieval failed: " + e.getMessage() + ". Will retry token retrieval");
                return false;
            } else if (e.getMessage() == null) {
                Log.w(Constants.TAG, "Token retrieval failed without exception message. Will retry token retrieval");
                return false;
            } else {
                throw e;
            }
        } catch (SecurityException unused) {
            Log.w(Constants.TAG, "Token retrieval failed with SecurityException. Will retry token retrieval");
            return false;
        }
    }

    @Override // java.lang.Runnable
    public void run() {
        if (ServiceStarter.m38440b().m38437e(m67244b())) {
            this.f4167b.acquire();
        }
        try {
            try {
                this.f4168c.m38525O(true);
            } catch (IOException e) {
                StringBuilder sb = new StringBuilder();
                sb.append("Topic sync or token retrieval failed on hard failure exceptions: ");
                sb.append(e.getMessage());
                sb.append(". Won't retry the operation.");
                this.f4168c.m38525O(false);
                if (!ServiceStarter.m38440b().m38437e(m67244b())) {
                    return;
                }
            }
            if (!this.f4168c.m38494z()) {
                this.f4168c.m38525O(false);
                if (ServiceStarter.m38440b().m38437e(m67244b())) {
                    this.f4167b.release();
                }
            } else if (ServiceStarter.m38440b().m38438d(m67244b()) && !m67242d()) {
                new C0932a(this).m67240a();
                if (ServiceStarter.m38440b().m38437e(m67244b())) {
                    this.f4167b.release();
                }
            } else {
                if (m67241f()) {
                    this.f4168c.m38525O(false);
                } else {
                    this.f4168c.m38521S(this.f4166a);
                }
                if (!ServiceStarter.m38440b().m38437e(m67244b())) {
                    return;
                }
                this.f4167b.release();
            }
        } catch (Throwable th2) {
            if (ServiceStarter.m38440b().m38437e(m67244b())) {
                this.f4167b.release();
            }
            throw th2;
        }
    }
}
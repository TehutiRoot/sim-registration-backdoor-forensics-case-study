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

/* renamed from: QP1 */
/* loaded from: classes4.dex */
public class QP1 implements Runnable {

    /* renamed from: a */
    public final long f5053a;

    /* renamed from: b */
    public final PowerManager.WakeLock f5054b;

    /* renamed from: c */
    public final FirebaseMessaging f5055c;

    /* renamed from: d */
    public ExecutorService f5056d = new ThreadPoolExecutor(0, 1, 30, TimeUnit.SECONDS, new LinkedBlockingQueue(), new NamedThreadFactory("firebase-iid-executor"));

    /* renamed from: QP1$a */
    /* loaded from: classes4.dex */
    public static class C1176a extends BroadcastReceiver {

        /* renamed from: a */
        public QP1 f5057a;

        public C1176a(QP1 qp1) {
            this.f5057a = qp1;
        }

        /* renamed from: a */
        public void m66600a() {
            QP1.m66603c();
            this.f5057a.m66604b().registerReceiver(this, new IntentFilter("android.net.conn.CONNECTIVITY_CHANGE"));
        }

        @Override // android.content.BroadcastReceiver
        public void onReceive(Context context, Intent intent) {
            QP1 qp1 = this.f5057a;
            if (qp1 == null || !qp1.m66602d()) {
                return;
            }
            QP1.m66603c();
            this.f5057a.f5055c.m38510r(this.f5057a, 0L);
            this.f5057a.m66604b().unregisterReceiver(this);
            this.f5057a = null;
        }
    }

    public QP1(FirebaseMessaging firebaseMessaging, long j) {
        this.f5055c = firebaseMessaging;
        this.f5053a = j;
        PowerManager.WakeLock newWakeLock = ((PowerManager) m66604b().getSystemService("power")).newWakeLock(1, "fiid-sync");
        this.f5054b = newWakeLock;
        newWakeLock.setReferenceCounted(false);
    }

    /* renamed from: c */
    public static boolean m66603c() {
        if (!Log.isLoggable(Constants.TAG, 3) && (Build.VERSION.SDK_INT != 23 || !Log.isLoggable(Constants.TAG, 3))) {
            return false;
        }
        return true;
    }

    /* renamed from: b */
    public Context m66604b() {
        return this.f5055c.m38509s();
    }

    /* renamed from: d */
    public boolean m66602d() {
        NetworkInfo networkInfo;
        ConnectivityManager connectivityManager = (ConnectivityManager) m66604b().getSystemService("connectivity");
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
    public boolean m66601f() {
        try {
            if (this.f5055c.m38511q() == null) {
                return false;
            }
            Log.isLoggable(Constants.TAG, 3);
            return true;
        } catch (IOException e) {
            if (C22733w60.m912i(e.getMessage())) {
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
        if (ServiceStarter.m38448b().m38445e(m66604b())) {
            this.f5054b.acquire();
        }
        try {
            try {
                this.f5055c.m38533O(true);
            } catch (IOException e) {
                StringBuilder sb = new StringBuilder();
                sb.append("Topic sync or token retrieval failed on hard failure exceptions: ");
                sb.append(e.getMessage());
                sb.append(". Won't retry the operation.");
                this.f5055c.m38533O(false);
                if (!ServiceStarter.m38448b().m38445e(m66604b())) {
                    return;
                }
            }
            if (!this.f5055c.m38502z()) {
                this.f5055c.m38533O(false);
                if (ServiceStarter.m38448b().m38445e(m66604b())) {
                    this.f5054b.release();
                }
            } else if (ServiceStarter.m38448b().m38446d(m66604b()) && !m66602d()) {
                new C1176a(this).m66600a();
                if (ServiceStarter.m38448b().m38445e(m66604b())) {
                    this.f5054b.release();
                }
            } else {
                if (m66601f()) {
                    this.f5055c.m38533O(false);
                } else {
                    this.f5055c.m38529S(this.f5053a);
                }
                if (!ServiceStarter.m38448b().m38445e(m66604b())) {
                    return;
                }
                this.f5054b.release();
            }
        } catch (Throwable th2) {
            if (ServiceStarter.m38448b().m38445e(m66604b())) {
                this.f5054b.release();
            }
            throw th2;
        }
    }
}

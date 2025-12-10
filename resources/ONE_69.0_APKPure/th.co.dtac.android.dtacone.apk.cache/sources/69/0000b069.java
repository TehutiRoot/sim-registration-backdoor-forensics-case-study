package com.google.firebase.iid;

import android.content.BroadcastReceiver;
import android.content.Context;
import android.content.Intent;
import android.content.IntentFilter;
import android.net.ConnectivityManager;
import android.net.NetworkInfo;
import android.os.PowerManager;
import android.util.Log;
import java.io.IOException;
import java.util.concurrent.ExecutorService;

/* renamed from: com.google.firebase.iid.c */
/* loaded from: classes4.dex */
public class RunnableC8498c implements Runnable {

    /* renamed from: a */
    public final long f55501a;

    /* renamed from: b */
    public final PowerManager.WakeLock f55502b;

    /* renamed from: c */
    public final FirebaseInstanceId f55503c;

    /* renamed from: d */
    public ExecutorService f55504d = AbstractC22094s10.m22910b();

    /* renamed from: com.google.firebase.iid.c$a */
    /* loaded from: classes4.dex */
    public static class C8499a extends BroadcastReceiver {

        /* renamed from: a */
        public RunnableC8498c f55505a;

        public C8499a(RunnableC8498c runnableC8498c) {
            this.f55505a = runnableC8498c;
        }

        /* renamed from: a */
        public void m38648a() {
            FirebaseInstanceId.m38697n();
            this.f55505a.m38651b().registerReceiver(this, new IntentFilter("android.net.conn.CONNECTIVITY_CHANGE"));
        }

        @Override // android.content.BroadcastReceiver
        public void onReceive(Context context, Intent intent) {
            RunnableC8498c runnableC8498c = this.f55505a;
            if (runnableC8498c == null || !runnableC8498c.m38650c()) {
                return;
            }
            FirebaseInstanceId.m38697n();
            this.f55505a.f55503c.m38705f(this.f55505a, 0L);
            this.f55505a.m38651b().unregisterReceiver(this);
            this.f55505a = null;
        }
    }

    public RunnableC8498c(FirebaseInstanceId firebaseInstanceId, long j) {
        this.f55503c = firebaseInstanceId;
        this.f55501a = j;
        PowerManager.WakeLock newWakeLock = ((PowerManager) m38651b().getSystemService("power")).newWakeLock(1, "fiid-sync");
        this.f55502b = newWakeLock;
        newWakeLock.setReferenceCounted(false);
    }

    /* renamed from: b */
    public Context m38651b() {
        return this.f55503c.m38704g().getApplicationContext();
    }

    /* renamed from: c */
    public boolean m38650c() {
        NetworkInfo networkInfo;
        ConnectivityManager connectivityManager = (ConnectivityManager) m38651b().getSystemService("connectivity");
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

    /* renamed from: d */
    public boolean m38649d() {
        if (!this.f55503c.m38711B(this.f55503c.m38699l())) {
            return true;
        }
        try {
            if (this.f55503c.m38707d() == null) {
                return false;
            }
            Log.isLoggable("FirebaseInstanceId", 3);
            return true;
        } catch (IOException e) {
            if (GmsRpc.m38679e(e.getMessage())) {
                String message = e.getMessage();
                StringBuilder sb = new StringBuilder(String.valueOf(message).length() + 52);
                sb.append("Token retrieval failed: ");
                sb.append(message);
                sb.append(". Will retry token retrieval");
                Log.w("FirebaseInstanceId", sb.toString());
                return false;
            } else if (e.getMessage() == null) {
                Log.w("FirebaseInstanceId", "Token retrieval failed without exception message. Will retry token retrieval");
                return false;
            } else {
                throw e;
            }
        } catch (SecurityException unused) {
            Log.w("FirebaseInstanceId", "Token retrieval failed with SecurityException. Will retry token retrieval");
            return false;
        }
    }

    @Override // java.lang.Runnable
    public void run() {
        if (ServiceStarter.getInstance().m38671b(m38651b())) {
            this.f55502b.acquire();
        }
        try {
            try {
                this.f55503c.m38687x(true);
                if (!this.f55503c.isGmsCorePresent()) {
                    this.f55503c.m38687x(false);
                    if (!ServiceStarter.getInstance().m38671b(m38651b())) {
                        return;
                    }
                } else if (ServiceStarter.getInstance().m38672a(m38651b()) && !m38650c()) {
                    new C8499a(this).m38648a();
                    if (!ServiceStarter.getInstance().m38671b(m38651b())) {
                        return;
                    }
                } else {
                    if (m38649d()) {
                        this.f55503c.m38687x(false);
                    } else {
                        this.f55503c.m38712A(this.f55501a);
                    }
                    if (!ServiceStarter.getInstance().m38671b(m38651b())) {
                        return;
                    }
                }
            } catch (IOException e) {
                String message = e.getMessage();
                StringBuilder sb = new StringBuilder(String.valueOf(message).length() + 93);
                sb.append("Topic sync or token retrieval failed on hard failure exceptions: ");
                sb.append(message);
                sb.append(". Won't retry the operation.");
                this.f55503c.m38687x(false);
                if (!ServiceStarter.getInstance().m38671b(m38651b())) {
                    return;
                }
            }
            this.f55502b.release();
        } catch (Throwable th2) {
            if (ServiceStarter.getInstance().m38671b(m38651b())) {
                this.f55502b.release();
            }
            throw th2;
        }
    }
}
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
public class RunnableC8509c implements Runnable {

    /* renamed from: a */
    public final long f55489a;

    /* renamed from: b */
    public final PowerManager.WakeLock f55490b;

    /* renamed from: c */
    public final FirebaseInstanceId f55491c;

    /* renamed from: d */
    public ExecutorService f55492d = AbstractC21342o10.m25976b();

    /* renamed from: com.google.firebase.iid.c$a */
    /* loaded from: classes4.dex */
    public static class C8510a extends BroadcastReceiver {

        /* renamed from: a */
        public RunnableC8509c f55493a;

        public C8510a(RunnableC8509c runnableC8509c) {
            this.f55493a = runnableC8509c;
        }

        /* renamed from: a */
        public void m38656a() {
            FirebaseInstanceId.m38705n();
            this.f55493a.m38659b().registerReceiver(this, new IntentFilter("android.net.conn.CONNECTIVITY_CHANGE"));
        }

        @Override // android.content.BroadcastReceiver
        public void onReceive(Context context, Intent intent) {
            RunnableC8509c runnableC8509c = this.f55493a;
            if (runnableC8509c == null || !runnableC8509c.m38658c()) {
                return;
            }
            FirebaseInstanceId.m38705n();
            this.f55493a.f55491c.m38713f(this.f55493a, 0L);
            this.f55493a.m38659b().unregisterReceiver(this);
            this.f55493a = null;
        }
    }

    public RunnableC8509c(FirebaseInstanceId firebaseInstanceId, long j) {
        this.f55491c = firebaseInstanceId;
        this.f55489a = j;
        PowerManager.WakeLock newWakeLock = ((PowerManager) m38659b().getSystemService("power")).newWakeLock(1, "fiid-sync");
        this.f55490b = newWakeLock;
        newWakeLock.setReferenceCounted(false);
    }

    /* renamed from: b */
    public Context m38659b() {
        return this.f55491c.m38712g().getApplicationContext();
    }

    /* renamed from: c */
    public boolean m38658c() {
        NetworkInfo networkInfo;
        ConnectivityManager connectivityManager = (ConnectivityManager) m38659b().getSystemService("connectivity");
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
    public boolean m38657d() {
        if (!this.f55491c.m38719B(this.f55491c.m38707l())) {
            return true;
        }
        try {
            if (this.f55491c.m38715d() == null) {
                return false;
            }
            Log.isLoggable("FirebaseInstanceId", 3);
            return true;
        } catch (IOException e) {
            if (GmsRpc.m38687e(e.getMessage())) {
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
        if (ServiceStarter.getInstance().m38679b(m38659b())) {
            this.f55490b.acquire();
        }
        try {
            try {
                this.f55491c.m38695x(true);
                if (!this.f55491c.isGmsCorePresent()) {
                    this.f55491c.m38695x(false);
                    if (!ServiceStarter.getInstance().m38679b(m38659b())) {
                        return;
                    }
                } else if (ServiceStarter.getInstance().m38680a(m38659b()) && !m38658c()) {
                    new C8510a(this).m38656a();
                    if (!ServiceStarter.getInstance().m38679b(m38659b())) {
                        return;
                    }
                } else {
                    if (m38657d()) {
                        this.f55491c.m38695x(false);
                    } else {
                        this.f55491c.m38720A(this.f55489a);
                    }
                    if (!ServiceStarter.getInstance().m38679b(m38659b())) {
                        return;
                    }
                }
            } catch (IOException e) {
                String message = e.getMessage();
                StringBuilder sb = new StringBuilder(String.valueOf(message).length() + 93);
                sb.append("Topic sync or token retrieval failed on hard failure exceptions: ");
                sb.append(message);
                sb.append(". Won't retry the operation.");
                this.f55491c.m38695x(false);
                if (!ServiceStarter.getInstance().m38679b(m38659b())) {
                    return;
                }
            }
            this.f55490b.release();
        } catch (Throwable th2) {
            if (ServiceStarter.getInstance().m38679b(m38659b())) {
                this.f55490b.release();
            }
            throw th2;
        }
    }
}

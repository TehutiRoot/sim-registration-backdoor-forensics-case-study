package com.bumptech.glide.manager;

import android.content.BroadcastReceiver;
import android.content.Context;
import android.content.Intent;
import android.content.IntentFilter;
import android.net.ConnectivityManager;
import android.net.Network;
import android.net.NetworkInfo;
import android.os.AsyncTask;
import android.os.Build;
import android.util.Log;
import com.bumptech.glide.manager.ConnectivityMonitor;
import com.bumptech.glide.util.GlideSuppliers;
import com.bumptech.glide.util.Util;
import java.util.ArrayList;
import java.util.HashSet;
import java.util.Set;
import java.util.concurrent.Executor;

/* renamed from: com.bumptech.glide.manager.c */
/* loaded from: classes3.dex */
public final class C5903c {

    /* renamed from: d */
    public static volatile C5903c f42492d;

    /* renamed from: a */
    public final InterfaceC5906c f42493a;

    /* renamed from: b */
    public final Set f42494b = new HashSet();

    /* renamed from: c */
    public boolean f42495c;

    /* renamed from: com.bumptech.glide.manager.c$a */
    /* loaded from: classes3.dex */
    public class C5904a implements GlideSuppliers.GlideSupplier {

        /* renamed from: a */
        public final /* synthetic */ Context f42496a;

        public C5904a(Context context) {
            this.f42496a = context;
        }

        @Override // com.bumptech.glide.util.GlideSuppliers.GlideSupplier
        /* renamed from: a */
        public ConnectivityManager get() {
            return (ConnectivityManager) this.f42496a.getSystemService("connectivity");
        }
    }

    /* renamed from: com.bumptech.glide.manager.c$b */
    /* loaded from: classes3.dex */
    public class C5905b implements ConnectivityMonitor.ConnectivityListener {
        public C5905b() {
        }

        @Override // com.bumptech.glide.manager.ConnectivityMonitor.ConnectivityListener
        public void onConnectivityChanged(boolean z) {
            ArrayList<ConnectivityMonitor.ConnectivityListener> arrayList;
            Util.assertMainThread();
            synchronized (C5903c.this) {
                arrayList = new ArrayList(C5903c.this.f42494b);
            }
            for (ConnectivityMonitor.ConnectivityListener connectivityListener : arrayList) {
                connectivityListener.onConnectivityChanged(z);
            }
        }
    }

    /* renamed from: com.bumptech.glide.manager.c$c */
    /* loaded from: classes3.dex */
    public interface InterfaceC5906c {
        /* renamed from: a */
        boolean mo50089a();

        void unregister();
    }

    /* renamed from: com.bumptech.glide.manager.c$d */
    /* loaded from: classes3.dex */
    public static final class C5907d implements InterfaceC5906c {

        /* renamed from: a */
        public boolean f42499a;

        /* renamed from: b */
        public final ConnectivityMonitor.ConnectivityListener f42500b;

        /* renamed from: c */
        public final GlideSuppliers.GlideSupplier f42501c;

        /* renamed from: d */
        public final ConnectivityManager.NetworkCallback f42502d = new C5908a();

        /* renamed from: com.bumptech.glide.manager.c$d$a */
        /* loaded from: classes3.dex */
        public class C5908a extends ConnectivityManager.NetworkCallback {

            /* renamed from: com.bumptech.glide.manager.c$d$a$a */
            /* loaded from: classes3.dex */
            public class RunnableC5909a implements Runnable {

                /* renamed from: a */
                public final /* synthetic */ boolean f42504a;

                public RunnableC5909a(boolean z) {
                    this.f42504a = z;
                }

                @Override // java.lang.Runnable
                public void run() {
                    C5908a.this.m50091a(this.f42504a);
                }
            }

            public C5908a() {
            }

            /* renamed from: a */
            public void m50091a(boolean z) {
                Util.assertMainThread();
                C5907d c5907d = C5907d.this;
                boolean z2 = c5907d.f42499a;
                c5907d.f42499a = z;
                if (z2 != z) {
                    c5907d.f42500b.onConnectivityChanged(z);
                }
            }

            /* renamed from: b */
            public final void m50090b(boolean z) {
                Util.postOnUiThread(new RunnableC5909a(z));
            }

            @Override // android.net.ConnectivityManager.NetworkCallback
            public void onAvailable(Network network) {
                m50090b(true);
            }

            @Override // android.net.ConnectivityManager.NetworkCallback
            public void onLost(Network network) {
                m50090b(false);
            }
        }

        public C5907d(GlideSuppliers.GlideSupplier glideSupplier, ConnectivityMonitor.ConnectivityListener connectivityListener) {
            this.f42501c = glideSupplier;
            this.f42500b = connectivityListener;
        }

        @Override // com.bumptech.glide.manager.C5903c.InterfaceC5906c
        /* renamed from: a */
        public boolean mo50089a() {
            Network activeNetwork;
            boolean z;
            activeNetwork = ((ConnectivityManager) this.f42501c.get()).getActiveNetwork();
            if (activeNetwork != null) {
                z = true;
            } else {
                z = false;
            }
            this.f42499a = z;
            try {
                ((ConnectivityManager) this.f42501c.get()).registerDefaultNetworkCallback(this.f42502d);
                return true;
            } catch (RuntimeException e) {
                if (Log.isLoggable("ConnectivityMonitor", 5)) {
                    Log.w("ConnectivityMonitor", "Failed to register callback", e);
                }
                return false;
            }
        }

        @Override // com.bumptech.glide.manager.C5903c.InterfaceC5906c
        public void unregister() {
            ((ConnectivityManager) this.f42501c.get()).unregisterNetworkCallback(this.f42502d);
        }
    }

    /* renamed from: com.bumptech.glide.manager.c$e */
    /* loaded from: classes3.dex */
    public static final class C5910e implements InterfaceC5906c {

        /* renamed from: g */
        public static final Executor f42506g = AsyncTask.SERIAL_EXECUTOR;

        /* renamed from: a */
        public final Context f42507a;

        /* renamed from: b */
        public final ConnectivityMonitor.ConnectivityListener f42508b;

        /* renamed from: c */
        public final GlideSuppliers.GlideSupplier f42509c;

        /* renamed from: d */
        public volatile boolean f42510d;

        /* renamed from: e */
        public volatile boolean f42511e;

        /* renamed from: f */
        public final BroadcastReceiver f42512f = new C5911a();

        /* renamed from: com.bumptech.glide.manager.c$e$a */
        /* loaded from: classes3.dex */
        public class C5911a extends BroadcastReceiver {
            public C5911a() {
            }

            @Override // android.content.BroadcastReceiver
            public void onReceive(Context context, Intent intent) {
                C5910e.this.m50086d();
            }
        }

        /* renamed from: com.bumptech.glide.manager.c$e$b */
        /* loaded from: classes3.dex */
        public class RunnableC5912b implements Runnable {
            public RunnableC5912b() {
            }

            @Override // java.lang.Runnable
            public void run() {
                C5910e c5910e = C5910e.this;
                c5910e.f42510d = c5910e.m50088b();
                try {
                    C5910e c5910e2 = C5910e.this;
                    c5910e2.f42507a.registerReceiver(c5910e2.f42512f, new IntentFilter("android.net.conn.CONNECTIVITY_CHANGE"));
                    C5910e.this.f42511e = true;
                } catch (SecurityException e) {
                    if (Log.isLoggable("ConnectivityMonitor", 5)) {
                        Log.w("ConnectivityMonitor", "Failed to register", e);
                    }
                    C5910e.this.f42511e = false;
                }
            }
        }

        /* renamed from: com.bumptech.glide.manager.c$e$c */
        /* loaded from: classes3.dex */
        public class RunnableC5913c implements Runnable {
            public RunnableC5913c() {
            }

            @Override // java.lang.Runnable
            public void run() {
                if (!C5910e.this.f42511e) {
                    return;
                }
                C5910e.this.f42511e = false;
                C5910e c5910e = C5910e.this;
                c5910e.f42507a.unregisterReceiver(c5910e.f42512f);
            }
        }

        /* renamed from: com.bumptech.glide.manager.c$e$d */
        /* loaded from: classes3.dex */
        public class RunnableC5914d implements Runnable {
            public RunnableC5914d() {
            }

            @Override // java.lang.Runnable
            public void run() {
                boolean z = C5910e.this.f42510d;
                C5910e c5910e = C5910e.this;
                c5910e.f42510d = c5910e.m50088b();
                if (z != C5910e.this.f42510d) {
                    if (Log.isLoggable("ConnectivityMonitor", 3)) {
                        StringBuilder sb = new StringBuilder();
                        sb.append("connectivity changed, isConnected: ");
                        sb.append(C5910e.this.f42510d);
                    }
                    C5910e c5910e2 = C5910e.this;
                    c5910e2.m50087c(c5910e2.f42510d);
                }
            }
        }

        /* renamed from: com.bumptech.glide.manager.c$e$e */
        /* loaded from: classes3.dex */
        public class RunnableC5915e implements Runnable {

            /* renamed from: a */
            public final /* synthetic */ boolean f42517a;

            public RunnableC5915e(boolean z) {
                this.f42517a = z;
            }

            @Override // java.lang.Runnable
            public void run() {
                C5910e.this.f42508b.onConnectivityChanged(this.f42517a);
            }
        }

        public C5910e(Context context, GlideSuppliers.GlideSupplier glideSupplier, ConnectivityMonitor.ConnectivityListener connectivityListener) {
            this.f42507a = context.getApplicationContext();
            this.f42509c = glideSupplier;
            this.f42508b = connectivityListener;
        }

        @Override // com.bumptech.glide.manager.C5903c.InterfaceC5906c
        /* renamed from: a */
        public boolean mo50089a() {
            f42506g.execute(new RunnableC5912b());
            return true;
        }

        /* renamed from: b */
        public boolean m50088b() {
            try {
                NetworkInfo activeNetworkInfo = ((ConnectivityManager) this.f42509c.get()).getActiveNetworkInfo();
                if (activeNetworkInfo != null && activeNetworkInfo.isConnected()) {
                    return true;
                }
                return false;
            } catch (RuntimeException e) {
                if (Log.isLoggable("ConnectivityMonitor", 5)) {
                    Log.w("ConnectivityMonitor", "Failed to determine connectivity status when connectivity changed", e);
                }
                return true;
            }
        }

        /* renamed from: c */
        public void m50087c(boolean z) {
            Util.postOnUiThread(new RunnableC5915e(z));
        }

        /* renamed from: d */
        public void m50086d() {
            f42506g.execute(new RunnableC5914d());
        }

        @Override // com.bumptech.glide.manager.C5903c.InterfaceC5906c
        public void unregister() {
            f42506g.execute(new RunnableC5913c());
        }
    }

    public C5903c(Context context) {
        InterfaceC5906c c5910e;
        GlideSuppliers.GlideSupplier memorize = GlideSuppliers.memorize(new C5904a(context));
        C5905b c5905b = new C5905b();
        if (Build.VERSION.SDK_INT >= 24) {
            c5910e = new C5907d(memorize, c5905b);
        } else {
            c5910e = new C5910e(context, memorize, c5905b);
        }
        this.f42493a = c5910e;
    }

    /* renamed from: a */
    public static C5903c m50097a(Context context) {
        if (f42492d == null) {
            synchronized (C5903c.class) {
                try {
                    if (f42492d == null) {
                        f42492d = new C5903c(context.getApplicationContext());
                    }
                } finally {
                }
            }
        }
        return f42492d;
    }

    /* renamed from: b */
    public final void m50096b() {
        if (!this.f42495c && !this.f42494b.isEmpty()) {
            this.f42495c = this.f42493a.mo50089a();
        }
    }

    /* renamed from: c */
    public final void m50095c() {
        if (this.f42495c && this.f42494b.isEmpty()) {
            this.f42493a.unregister();
            this.f42495c = false;
        }
    }

    /* renamed from: d */
    public synchronized void m50094d(ConnectivityMonitor.ConnectivityListener connectivityListener) {
        this.f42494b.add(connectivityListener);
        m50096b();
    }

    /* renamed from: e */
    public synchronized void m50093e(ConnectivityMonitor.ConnectivityListener connectivityListener) {
        this.f42494b.remove(connectivityListener);
        m50095c();
    }
}

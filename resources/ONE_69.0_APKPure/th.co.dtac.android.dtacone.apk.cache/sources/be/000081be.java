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
public final class C5892c {

    /* renamed from: d */
    public static volatile C5892c f42504d;

    /* renamed from: a */
    public final InterfaceC5895c f42505a;

    /* renamed from: b */
    public final Set f42506b = new HashSet();

    /* renamed from: c */
    public boolean f42507c;

    /* renamed from: com.bumptech.glide.manager.c$a */
    /* loaded from: classes3.dex */
    public class C5893a implements GlideSuppliers.GlideSupplier {

        /* renamed from: a */
        public final /* synthetic */ Context f42508a;

        public C5893a(Context context) {
            this.f42508a = context;
        }

        @Override // com.bumptech.glide.util.GlideSuppliers.GlideSupplier
        /* renamed from: a */
        public ConnectivityManager get() {
            return (ConnectivityManager) this.f42508a.getSystemService("connectivity");
        }
    }

    /* renamed from: com.bumptech.glide.manager.c$b */
    /* loaded from: classes3.dex */
    public class C5894b implements ConnectivityMonitor.ConnectivityListener {
        public C5894b() {
        }

        @Override // com.bumptech.glide.manager.ConnectivityMonitor.ConnectivityListener
        public void onConnectivityChanged(boolean z) {
            ArrayList<ConnectivityMonitor.ConnectivityListener> arrayList;
            Util.assertMainThread();
            synchronized (C5892c.this) {
                arrayList = new ArrayList(C5892c.this.f42506b);
            }
            for (ConnectivityMonitor.ConnectivityListener connectivityListener : arrayList) {
                connectivityListener.onConnectivityChanged(z);
            }
        }
    }

    /* renamed from: com.bumptech.glide.manager.c$c */
    /* loaded from: classes3.dex */
    public interface InterfaceC5895c {
        /* renamed from: a */
        boolean mo50086a();

        void unregister();
    }

    /* renamed from: com.bumptech.glide.manager.c$d */
    /* loaded from: classes3.dex */
    public static final class C5896d implements InterfaceC5895c {

        /* renamed from: a */
        public boolean f42511a;

        /* renamed from: b */
        public final ConnectivityMonitor.ConnectivityListener f42512b;

        /* renamed from: c */
        public final GlideSuppliers.GlideSupplier f42513c;

        /* renamed from: d */
        public final ConnectivityManager.NetworkCallback f42514d = new C5897a();

        /* renamed from: com.bumptech.glide.manager.c$d$a */
        /* loaded from: classes3.dex */
        public class C5897a extends ConnectivityManager.NetworkCallback {

            /* renamed from: com.bumptech.glide.manager.c$d$a$a */
            /* loaded from: classes3.dex */
            public class RunnableC5898a implements Runnable {

                /* renamed from: a */
                public final /* synthetic */ boolean f42516a;

                public RunnableC5898a(boolean z) {
                    this.f42516a = z;
                }

                @Override // java.lang.Runnable
                public void run() {
                    C5897a.this.m50088a(this.f42516a);
                }
            }

            public C5897a() {
            }

            /* renamed from: a */
            public void m50088a(boolean z) {
                Util.assertMainThread();
                C5896d c5896d = C5896d.this;
                boolean z2 = c5896d.f42511a;
                c5896d.f42511a = z;
                if (z2 != z) {
                    c5896d.f42512b.onConnectivityChanged(z);
                }
            }

            /* renamed from: b */
            public final void m50087b(boolean z) {
                Util.postOnUiThread(new RunnableC5898a(z));
            }

            @Override // android.net.ConnectivityManager.NetworkCallback
            public void onAvailable(Network network) {
                m50087b(true);
            }

            @Override // android.net.ConnectivityManager.NetworkCallback
            public void onLost(Network network) {
                m50087b(false);
            }
        }

        public C5896d(GlideSuppliers.GlideSupplier glideSupplier, ConnectivityMonitor.ConnectivityListener connectivityListener) {
            this.f42513c = glideSupplier;
            this.f42512b = connectivityListener;
        }

        @Override // com.bumptech.glide.manager.C5892c.InterfaceC5895c
        /* renamed from: a */
        public boolean mo50086a() {
            Network activeNetwork;
            boolean z;
            activeNetwork = ((ConnectivityManager) this.f42513c.get()).getActiveNetwork();
            if (activeNetwork != null) {
                z = true;
            } else {
                z = false;
            }
            this.f42511a = z;
            try {
                ((ConnectivityManager) this.f42513c.get()).registerDefaultNetworkCallback(this.f42514d);
                return true;
            } catch (RuntimeException e) {
                if (Log.isLoggable("ConnectivityMonitor", 5)) {
                    Log.w("ConnectivityMonitor", "Failed to register callback", e);
                }
                return false;
            }
        }

        @Override // com.bumptech.glide.manager.C5892c.InterfaceC5895c
        public void unregister() {
            ((ConnectivityManager) this.f42513c.get()).unregisterNetworkCallback(this.f42514d);
        }
    }

    /* renamed from: com.bumptech.glide.manager.c$e */
    /* loaded from: classes3.dex */
    public static final class C5899e implements InterfaceC5895c {

        /* renamed from: g */
        public static final Executor f42518g = AsyncTask.SERIAL_EXECUTOR;

        /* renamed from: a */
        public final Context f42519a;

        /* renamed from: b */
        public final ConnectivityMonitor.ConnectivityListener f42520b;

        /* renamed from: c */
        public final GlideSuppliers.GlideSupplier f42521c;

        /* renamed from: d */
        public volatile boolean f42522d;

        /* renamed from: e */
        public volatile boolean f42523e;

        /* renamed from: f */
        public final BroadcastReceiver f42524f = new C5900a();

        /* renamed from: com.bumptech.glide.manager.c$e$a */
        /* loaded from: classes3.dex */
        public class C5900a extends BroadcastReceiver {
            public C5900a() {
            }

            @Override // android.content.BroadcastReceiver
            public void onReceive(Context context, Intent intent) {
                C5899e.this.m50083d();
            }
        }

        /* renamed from: com.bumptech.glide.manager.c$e$b */
        /* loaded from: classes3.dex */
        public class RunnableC5901b implements Runnable {
            public RunnableC5901b() {
            }

            @Override // java.lang.Runnable
            public void run() {
                C5899e c5899e = C5899e.this;
                c5899e.f42522d = c5899e.m50085b();
                try {
                    C5899e c5899e2 = C5899e.this;
                    c5899e2.f42519a.registerReceiver(c5899e2.f42524f, new IntentFilter("android.net.conn.CONNECTIVITY_CHANGE"));
                    C5899e.this.f42523e = true;
                } catch (SecurityException e) {
                    if (Log.isLoggable("ConnectivityMonitor", 5)) {
                        Log.w("ConnectivityMonitor", "Failed to register", e);
                    }
                    C5899e.this.f42523e = false;
                }
            }
        }

        /* renamed from: com.bumptech.glide.manager.c$e$c */
        /* loaded from: classes3.dex */
        public class RunnableC5902c implements Runnable {
            public RunnableC5902c() {
            }

            @Override // java.lang.Runnable
            public void run() {
                if (!C5899e.this.f42523e) {
                    return;
                }
                C5899e.this.f42523e = false;
                C5899e c5899e = C5899e.this;
                c5899e.f42519a.unregisterReceiver(c5899e.f42524f);
            }
        }

        /* renamed from: com.bumptech.glide.manager.c$e$d */
        /* loaded from: classes3.dex */
        public class RunnableC5903d implements Runnable {
            public RunnableC5903d() {
            }

            @Override // java.lang.Runnable
            public void run() {
                boolean z = C5899e.this.f42522d;
                C5899e c5899e = C5899e.this;
                c5899e.f42522d = c5899e.m50085b();
                if (z != C5899e.this.f42522d) {
                    if (Log.isLoggable("ConnectivityMonitor", 3)) {
                        StringBuilder sb = new StringBuilder();
                        sb.append("connectivity changed, isConnected: ");
                        sb.append(C5899e.this.f42522d);
                    }
                    C5899e c5899e2 = C5899e.this;
                    c5899e2.m50084c(c5899e2.f42522d);
                }
            }
        }

        /* renamed from: com.bumptech.glide.manager.c$e$e */
        /* loaded from: classes3.dex */
        public class RunnableC5904e implements Runnable {

            /* renamed from: a */
            public final /* synthetic */ boolean f42529a;

            public RunnableC5904e(boolean z) {
                this.f42529a = z;
            }

            @Override // java.lang.Runnable
            public void run() {
                C5899e.this.f42520b.onConnectivityChanged(this.f42529a);
            }
        }

        public C5899e(Context context, GlideSuppliers.GlideSupplier glideSupplier, ConnectivityMonitor.ConnectivityListener connectivityListener) {
            this.f42519a = context.getApplicationContext();
            this.f42521c = glideSupplier;
            this.f42520b = connectivityListener;
        }

        @Override // com.bumptech.glide.manager.C5892c.InterfaceC5895c
        /* renamed from: a */
        public boolean mo50086a() {
            f42518g.execute(new RunnableC5901b());
            return true;
        }

        /* renamed from: b */
        public boolean m50085b() {
            try {
                NetworkInfo activeNetworkInfo = ((ConnectivityManager) this.f42521c.get()).getActiveNetworkInfo();
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
        public void m50084c(boolean z) {
            Util.postOnUiThread(new RunnableC5904e(z));
        }

        /* renamed from: d */
        public void m50083d() {
            f42518g.execute(new RunnableC5903d());
        }

        @Override // com.bumptech.glide.manager.C5892c.InterfaceC5895c
        public void unregister() {
            f42518g.execute(new RunnableC5902c());
        }
    }

    public C5892c(Context context) {
        InterfaceC5895c c5899e;
        GlideSuppliers.GlideSupplier memorize = GlideSuppliers.memorize(new C5893a(context));
        C5894b c5894b = new C5894b();
        if (Build.VERSION.SDK_INT >= 24) {
            c5899e = new C5896d(memorize, c5894b);
        } else {
            c5899e = new C5899e(context, memorize, c5894b);
        }
        this.f42505a = c5899e;
    }

    /* renamed from: a */
    public static C5892c m50094a(Context context) {
        if (f42504d == null) {
            synchronized (C5892c.class) {
                try {
                    if (f42504d == null) {
                        f42504d = new C5892c(context.getApplicationContext());
                    }
                } finally {
                }
            }
        }
        return f42504d;
    }

    /* renamed from: b */
    public final void m50093b() {
        if (!this.f42507c && !this.f42506b.isEmpty()) {
            this.f42507c = this.f42505a.mo50086a();
        }
    }

    /* renamed from: c */
    public final void m50092c() {
        if (this.f42507c && this.f42506b.isEmpty()) {
            this.f42505a.unregister();
            this.f42507c = false;
        }
    }

    /* renamed from: d */
    public synchronized void m50091d(ConnectivityMonitor.ConnectivityListener connectivityListener) {
        this.f42506b.add(connectivityListener);
        m50093b();
    }

    /* renamed from: e */
    public synchronized void m50090e(ConnectivityMonitor.ConnectivityListener connectivityListener) {
        this.f42506b.remove(connectivityListener);
        m50092c();
    }
}
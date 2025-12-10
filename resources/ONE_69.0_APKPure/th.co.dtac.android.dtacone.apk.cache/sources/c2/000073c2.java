package androidx.recyclerview.widget;

import android.os.AsyncTask;
import android.os.Handler;
import android.os.Looper;
import androidx.recyclerview.widget.ThreadUtil;
import androidx.recyclerview.widget.TileList;
import java.util.concurrent.Executor;
import java.util.concurrent.atomic.AtomicBoolean;

/* renamed from: androidx.recyclerview.widget.g */
/* loaded from: classes2.dex */
public class C4946g implements ThreadUtil {

    /* renamed from: androidx.recyclerview.widget.g$a */
    /* loaded from: classes2.dex */
    public class C4947a implements ThreadUtil.MainThreadCallback {

        /* renamed from: a */
        public final C4951c f37285a = new C4951c();

        /* renamed from: b */
        public final Handler f37286b = new Handler(Looper.getMainLooper());

        /* renamed from: c */
        public Runnable f37287c = new RunnableC4948a();

        /* renamed from: d */
        public final /* synthetic */ ThreadUtil.MainThreadCallback f37288d;

        /* renamed from: androidx.recyclerview.widget.g$a$a */
        /* loaded from: classes2.dex */
        public class RunnableC4948a implements Runnable {
            public RunnableC4948a() {
            }

            @Override // java.lang.Runnable
            public void run() {
                C4952d m52946a = C4947a.this.f37285a.m52946a();
                while (m52946a != null) {
                    int i = m52946a.f37303b;
                    if (i != 1) {
                        if (i != 2) {
                            if (i != 3) {
                                StringBuilder sb = new StringBuilder();
                                sb.append("Unsupported message, what=");
                                sb.append(m52946a.f37303b);
                            } else {
                                C4947a.this.f37288d.removeTile(m52946a.f37304c, m52946a.f37305d);
                            }
                        } else {
                            C4947a.this.f37288d.addTile(m52946a.f37304c, (TileList.Tile) m52946a.f37309h);
                        }
                    } else {
                        C4947a.this.f37288d.updateItemCount(m52946a.f37304c, m52946a.f37305d);
                    }
                    m52946a = C4947a.this.f37285a.m52946a();
                }
            }
        }

        public C4947a(ThreadUtil.MainThreadCallback mainThreadCallback) {
            this.f37288d = mainThreadCallback;
        }

        /* renamed from: a */
        public final void m52950a(C4952d c4952d) {
            this.f37285a.m52944c(c4952d);
            this.f37286b.post(this.f37287c);
        }

        @Override // androidx.recyclerview.widget.ThreadUtil.MainThreadCallback
        public void addTile(int i, TileList.Tile tile) {
            m52950a(C4952d.m52940c(2, i, tile));
        }

        @Override // androidx.recyclerview.widget.ThreadUtil.MainThreadCallback
        public void removeTile(int i, int i2) {
            m52950a(C4952d.m52942a(3, i, i2));
        }

        @Override // androidx.recyclerview.widget.ThreadUtil.MainThreadCallback
        public void updateItemCount(int i, int i2) {
            m52950a(C4952d.m52942a(1, i, i2));
        }
    }

    /* renamed from: androidx.recyclerview.widget.g$b */
    /* loaded from: classes2.dex */
    public class C4949b implements ThreadUtil.BackgroundCallback {

        /* renamed from: a */
        public final C4951c f37291a = new C4951c();

        /* renamed from: b */
        public final Executor f37292b = AsyncTask.THREAD_POOL_EXECUTOR;

        /* renamed from: c */
        public AtomicBoolean f37293c = new AtomicBoolean(false);

        /* renamed from: d */
        public Runnable f37294d = new RunnableC4950a();

        /* renamed from: e */
        public final /* synthetic */ ThreadUtil.BackgroundCallback f37295e;

        /* renamed from: androidx.recyclerview.widget.g$b$a */
        /* loaded from: classes2.dex */
        public class RunnableC4950a implements Runnable {
            public RunnableC4950a() {
            }

            @Override // java.lang.Runnable
            public void run() {
                while (true) {
                    C4952d m52946a = C4949b.this.f37291a.m52946a();
                    if (m52946a == null) {
                        C4949b.this.f37293c.set(false);
                        return;
                    }
                    int i = m52946a.f37303b;
                    if (i != 1) {
                        if (i != 2) {
                            if (i != 3) {
                                if (i != 4) {
                                    StringBuilder sb = new StringBuilder();
                                    sb.append("Unsupported message, what=");
                                    sb.append(m52946a.f37303b);
                                } else {
                                    C4949b.this.f37295e.recycleTile((TileList.Tile) m52946a.f37309h);
                                }
                            } else {
                                C4949b.this.f37295e.loadTile(m52946a.f37304c, m52946a.f37305d);
                            }
                        } else {
                            C4949b.this.f37291a.m52945b(2);
                            C4949b.this.f37291a.m52945b(3);
                            C4949b.this.f37295e.updateRange(m52946a.f37304c, m52946a.f37305d, m52946a.f37306e, m52946a.f37307f, m52946a.f37308g);
                        }
                    } else {
                        C4949b.this.f37291a.m52945b(1);
                        C4949b.this.f37295e.refresh(m52946a.f37304c);
                    }
                }
            }
        }

        public C4949b(ThreadUtil.BackgroundCallback backgroundCallback) {
            this.f37295e = backgroundCallback;
        }

        /* renamed from: a */
        public final void m52949a() {
            if (this.f37293c.compareAndSet(false, true)) {
                this.f37292b.execute(this.f37294d);
            }
        }

        /* renamed from: b */
        public final void m52948b(C4952d c4952d) {
            this.f37291a.m52944c(c4952d);
            m52949a();
        }

        /* renamed from: c */
        public final void m52947c(C4952d c4952d) {
            this.f37291a.m52943d(c4952d);
            m52949a();
        }

        @Override // androidx.recyclerview.widget.ThreadUtil.BackgroundCallback
        public void loadTile(int i, int i2) {
            m52948b(C4952d.m52942a(3, i, i2));
        }

        @Override // androidx.recyclerview.widget.ThreadUtil.BackgroundCallback
        public void recycleTile(TileList.Tile tile) {
            m52948b(C4952d.m52940c(4, 0, tile));
        }

        @Override // androidx.recyclerview.widget.ThreadUtil.BackgroundCallback
        public void refresh(int i) {
            m52947c(C4952d.m52940c(1, i, null));
        }

        @Override // androidx.recyclerview.widget.ThreadUtil.BackgroundCallback
        public void updateRange(int i, int i2, int i3, int i4, int i5) {
            m52947c(C4952d.m52941b(2, i, i2, i3, i4, i5, null));
        }
    }

    /* renamed from: androidx.recyclerview.widget.g$c */
    /* loaded from: classes2.dex */
    public static class C4951c {

        /* renamed from: a */
        public C4952d f37298a;

        /* renamed from: b */
        public final Object f37299b = new Object();

        /* renamed from: a */
        public C4952d m52946a() {
            synchronized (this.f37299b) {
                try {
                    C4952d c4952d = this.f37298a;
                    if (c4952d == null) {
                        return null;
                    }
                    this.f37298a = c4952d.f37302a;
                    return c4952d;
                } catch (Throwable th2) {
                    throw th2;
                }
            }
        }

        /* renamed from: b */
        public void m52945b(int i) {
            C4952d c4952d;
            synchronized (this.f37299b) {
                while (true) {
                    try {
                        c4952d = this.f37298a;
                        if (c4952d == null || c4952d.f37303b != i) {
                            break;
                        }
                        this.f37298a = c4952d.f37302a;
                        c4952d.m52939d();
                    } finally {
                    }
                }
                if (c4952d != null) {
                    C4952d c4952d2 = c4952d.f37302a;
                    while (c4952d2 != null) {
                        C4952d c4952d3 = c4952d2.f37302a;
                        if (c4952d2.f37303b == i) {
                            c4952d.f37302a = c4952d3;
                            c4952d2.m52939d();
                        } else {
                            c4952d = c4952d2;
                        }
                        c4952d2 = c4952d3;
                    }
                }
            }
        }

        /* renamed from: c */
        public void m52944c(C4952d c4952d) {
            synchronized (this.f37299b) {
                try {
                    C4952d c4952d2 = this.f37298a;
                    if (c4952d2 == null) {
                        this.f37298a = c4952d;
                        return;
                    }
                    while (true) {
                        C4952d c4952d3 = c4952d2.f37302a;
                        if (c4952d3 != null) {
                            c4952d2 = c4952d3;
                        } else {
                            c4952d2.f37302a = c4952d;
                            return;
                        }
                    }
                } catch (Throwable th2) {
                    throw th2;
                }
            }
        }

        /* renamed from: d */
        public void m52943d(C4952d c4952d) {
            synchronized (this.f37299b) {
                c4952d.f37302a = this.f37298a;
                this.f37298a = c4952d;
            }
        }
    }

    /* renamed from: androidx.recyclerview.widget.g$d */
    /* loaded from: classes2.dex */
    public static class C4952d {

        /* renamed from: i */
        public static C4952d f37300i;

        /* renamed from: j */
        public static final Object f37301j = new Object();

        /* renamed from: a */
        public C4952d f37302a;

        /* renamed from: b */
        public int f37303b;

        /* renamed from: c */
        public int f37304c;

        /* renamed from: d */
        public int f37305d;

        /* renamed from: e */
        public int f37306e;

        /* renamed from: f */
        public int f37307f;

        /* renamed from: g */
        public int f37308g;

        /* renamed from: h */
        public Object f37309h;

        /* renamed from: a */
        public static C4952d m52942a(int i, int i2, int i3) {
            return m52941b(i, i2, i3, 0, 0, 0, null);
        }

        /* renamed from: b */
        public static C4952d m52941b(int i, int i2, int i3, int i4, int i5, int i6, Object obj) {
            C4952d c4952d;
            synchronized (f37301j) {
                try {
                    c4952d = f37300i;
                    if (c4952d == null) {
                        c4952d = new C4952d();
                    } else {
                        f37300i = c4952d.f37302a;
                        c4952d.f37302a = null;
                    }
                    c4952d.f37303b = i;
                    c4952d.f37304c = i2;
                    c4952d.f37305d = i3;
                    c4952d.f37306e = i4;
                    c4952d.f37307f = i5;
                    c4952d.f37308g = i6;
                    c4952d.f37309h = obj;
                } catch (Throwable th2) {
                    throw th2;
                }
            }
            return c4952d;
        }

        /* renamed from: c */
        public static C4952d m52940c(int i, int i2, Object obj) {
            return m52941b(i, i2, 0, 0, 0, 0, obj);
        }

        /* renamed from: d */
        public void m52939d() {
            this.f37302a = null;
            this.f37308g = 0;
            this.f37307f = 0;
            this.f37306e = 0;
            this.f37305d = 0;
            this.f37304c = 0;
            this.f37303b = 0;
            this.f37309h = null;
            synchronized (f37301j) {
                try {
                    C4952d c4952d = f37300i;
                    if (c4952d != null) {
                        this.f37302a = c4952d;
                    }
                    f37300i = this;
                } catch (Throwable th2) {
                    throw th2;
                }
            }
        }
    }

    @Override // androidx.recyclerview.widget.ThreadUtil
    /* renamed from: a */
    public ThreadUtil.MainThreadCallback mo52952a(ThreadUtil.MainThreadCallback mainThreadCallback) {
        return new C4947a(mainThreadCallback);
    }

    @Override // androidx.recyclerview.widget.ThreadUtil
    /* renamed from: b */
    public ThreadUtil.BackgroundCallback mo52951b(ThreadUtil.BackgroundCallback backgroundCallback) {
        return new C4949b(backgroundCallback);
    }
}
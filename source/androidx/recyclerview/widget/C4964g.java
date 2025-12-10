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
public class C4964g implements ThreadUtil {

    /* renamed from: androidx.recyclerview.widget.g$a */
    /* loaded from: classes2.dex */
    public class C4965a implements ThreadUtil.MainThreadCallback {

        /* renamed from: a */
        public final C4969c f37197a = new C4969c();

        /* renamed from: b */
        public final Handler f37198b = new Handler(Looper.getMainLooper());

        /* renamed from: c */
        public Runnable f37199c = new RunnableC4966a();

        /* renamed from: d */
        public final /* synthetic */ ThreadUtil.MainThreadCallback f37200d;

        /* renamed from: androidx.recyclerview.widget.g$a$a */
        /* loaded from: classes2.dex */
        public class RunnableC4966a implements Runnable {
            public RunnableC4966a() {
            }

            @Override // java.lang.Runnable
            public void run() {
                C4970d m52995a = C4965a.this.f37197a.m52995a();
                while (m52995a != null) {
                    int i = m52995a.f37215b;
                    if (i != 1) {
                        if (i != 2) {
                            if (i != 3) {
                                StringBuilder sb = new StringBuilder();
                                sb.append("Unsupported message, what=");
                                sb.append(m52995a.f37215b);
                            } else {
                                C4965a.this.f37200d.removeTile(m52995a.f37216c, m52995a.f37217d);
                            }
                        } else {
                            C4965a.this.f37200d.addTile(m52995a.f37216c, (TileList.Tile) m52995a.f37221h);
                        }
                    } else {
                        C4965a.this.f37200d.updateItemCount(m52995a.f37216c, m52995a.f37217d);
                    }
                    m52995a = C4965a.this.f37197a.m52995a();
                }
            }
        }

        public C4965a(ThreadUtil.MainThreadCallback mainThreadCallback) {
            this.f37200d = mainThreadCallback;
        }

        /* renamed from: a */
        public final void m52999a(C4970d c4970d) {
            this.f37197a.m52993c(c4970d);
            this.f37198b.post(this.f37199c);
        }

        @Override // androidx.recyclerview.widget.ThreadUtil.MainThreadCallback
        public void addTile(int i, TileList.Tile tile) {
            m52999a(C4970d.m52989c(2, i, tile));
        }

        @Override // androidx.recyclerview.widget.ThreadUtil.MainThreadCallback
        public void removeTile(int i, int i2) {
            m52999a(C4970d.m52991a(3, i, i2));
        }

        @Override // androidx.recyclerview.widget.ThreadUtil.MainThreadCallback
        public void updateItemCount(int i, int i2) {
            m52999a(C4970d.m52991a(1, i, i2));
        }
    }

    /* renamed from: androidx.recyclerview.widget.g$b */
    /* loaded from: classes2.dex */
    public class C4967b implements ThreadUtil.BackgroundCallback {

        /* renamed from: a */
        public final C4969c f37203a = new C4969c();

        /* renamed from: b */
        public final Executor f37204b = AsyncTask.THREAD_POOL_EXECUTOR;

        /* renamed from: c */
        public AtomicBoolean f37205c = new AtomicBoolean(false);

        /* renamed from: d */
        public Runnable f37206d = new RunnableC4968a();

        /* renamed from: e */
        public final /* synthetic */ ThreadUtil.BackgroundCallback f37207e;

        /* renamed from: androidx.recyclerview.widget.g$b$a */
        /* loaded from: classes2.dex */
        public class RunnableC4968a implements Runnable {
            public RunnableC4968a() {
            }

            @Override // java.lang.Runnable
            public void run() {
                while (true) {
                    C4970d m52995a = C4967b.this.f37203a.m52995a();
                    if (m52995a == null) {
                        C4967b.this.f37205c.set(false);
                        return;
                    }
                    int i = m52995a.f37215b;
                    if (i != 1) {
                        if (i != 2) {
                            if (i != 3) {
                                if (i != 4) {
                                    StringBuilder sb = new StringBuilder();
                                    sb.append("Unsupported message, what=");
                                    sb.append(m52995a.f37215b);
                                } else {
                                    C4967b.this.f37207e.recycleTile((TileList.Tile) m52995a.f37221h);
                                }
                            } else {
                                C4967b.this.f37207e.loadTile(m52995a.f37216c, m52995a.f37217d);
                            }
                        } else {
                            C4967b.this.f37203a.m52994b(2);
                            C4967b.this.f37203a.m52994b(3);
                            C4967b.this.f37207e.updateRange(m52995a.f37216c, m52995a.f37217d, m52995a.f37218e, m52995a.f37219f, m52995a.f37220g);
                        }
                    } else {
                        C4967b.this.f37203a.m52994b(1);
                        C4967b.this.f37207e.refresh(m52995a.f37216c);
                    }
                }
            }
        }

        public C4967b(ThreadUtil.BackgroundCallback backgroundCallback) {
            this.f37207e = backgroundCallback;
        }

        /* renamed from: a */
        public final void m52998a() {
            if (this.f37205c.compareAndSet(false, true)) {
                this.f37204b.execute(this.f37206d);
            }
        }

        /* renamed from: b */
        public final void m52997b(C4970d c4970d) {
            this.f37203a.m52993c(c4970d);
            m52998a();
        }

        /* renamed from: c */
        public final void m52996c(C4970d c4970d) {
            this.f37203a.m52992d(c4970d);
            m52998a();
        }

        @Override // androidx.recyclerview.widget.ThreadUtil.BackgroundCallback
        public void loadTile(int i, int i2) {
            m52997b(C4970d.m52991a(3, i, i2));
        }

        @Override // androidx.recyclerview.widget.ThreadUtil.BackgroundCallback
        public void recycleTile(TileList.Tile tile) {
            m52997b(C4970d.m52989c(4, 0, tile));
        }

        @Override // androidx.recyclerview.widget.ThreadUtil.BackgroundCallback
        public void refresh(int i) {
            m52996c(C4970d.m52989c(1, i, null));
        }

        @Override // androidx.recyclerview.widget.ThreadUtil.BackgroundCallback
        public void updateRange(int i, int i2, int i3, int i4, int i5) {
            m52996c(C4970d.m52990b(2, i, i2, i3, i4, i5, null));
        }
    }

    /* renamed from: androidx.recyclerview.widget.g$c */
    /* loaded from: classes2.dex */
    public static class C4969c {

        /* renamed from: a */
        public C4970d f37210a;

        /* renamed from: b */
        public final Object f37211b = new Object();

        /* renamed from: a */
        public C4970d m52995a() {
            synchronized (this.f37211b) {
                try {
                    C4970d c4970d = this.f37210a;
                    if (c4970d == null) {
                        return null;
                    }
                    this.f37210a = c4970d.f37214a;
                    return c4970d;
                } catch (Throwable th2) {
                    throw th2;
                }
            }
        }

        /* renamed from: b */
        public void m52994b(int i) {
            C4970d c4970d;
            synchronized (this.f37211b) {
                while (true) {
                    try {
                        c4970d = this.f37210a;
                        if (c4970d == null || c4970d.f37215b != i) {
                            break;
                        }
                        this.f37210a = c4970d.f37214a;
                        c4970d.m52988d();
                    } finally {
                    }
                }
                if (c4970d != null) {
                    C4970d c4970d2 = c4970d.f37214a;
                    while (c4970d2 != null) {
                        C4970d c4970d3 = c4970d2.f37214a;
                        if (c4970d2.f37215b == i) {
                            c4970d.f37214a = c4970d3;
                            c4970d2.m52988d();
                        } else {
                            c4970d = c4970d2;
                        }
                        c4970d2 = c4970d3;
                    }
                }
            }
        }

        /* renamed from: c */
        public void m52993c(C4970d c4970d) {
            synchronized (this.f37211b) {
                try {
                    C4970d c4970d2 = this.f37210a;
                    if (c4970d2 == null) {
                        this.f37210a = c4970d;
                        return;
                    }
                    while (true) {
                        C4970d c4970d3 = c4970d2.f37214a;
                        if (c4970d3 != null) {
                            c4970d2 = c4970d3;
                        } else {
                            c4970d2.f37214a = c4970d;
                            return;
                        }
                    }
                } catch (Throwable th2) {
                    throw th2;
                }
            }
        }

        /* renamed from: d */
        public void m52992d(C4970d c4970d) {
            synchronized (this.f37211b) {
                c4970d.f37214a = this.f37210a;
                this.f37210a = c4970d;
            }
        }
    }

    /* renamed from: androidx.recyclerview.widget.g$d */
    /* loaded from: classes2.dex */
    public static class C4970d {

        /* renamed from: i */
        public static C4970d f37212i;

        /* renamed from: j */
        public static final Object f37213j = new Object();

        /* renamed from: a */
        public C4970d f37214a;

        /* renamed from: b */
        public int f37215b;

        /* renamed from: c */
        public int f37216c;

        /* renamed from: d */
        public int f37217d;

        /* renamed from: e */
        public int f37218e;

        /* renamed from: f */
        public int f37219f;

        /* renamed from: g */
        public int f37220g;

        /* renamed from: h */
        public Object f37221h;

        /* renamed from: a */
        public static C4970d m52991a(int i, int i2, int i3) {
            return m52990b(i, i2, i3, 0, 0, 0, null);
        }

        /* renamed from: b */
        public static C4970d m52990b(int i, int i2, int i3, int i4, int i5, int i6, Object obj) {
            C4970d c4970d;
            synchronized (f37213j) {
                try {
                    c4970d = f37212i;
                    if (c4970d == null) {
                        c4970d = new C4970d();
                    } else {
                        f37212i = c4970d.f37214a;
                        c4970d.f37214a = null;
                    }
                    c4970d.f37215b = i;
                    c4970d.f37216c = i2;
                    c4970d.f37217d = i3;
                    c4970d.f37218e = i4;
                    c4970d.f37219f = i5;
                    c4970d.f37220g = i6;
                    c4970d.f37221h = obj;
                } catch (Throwable th2) {
                    throw th2;
                }
            }
            return c4970d;
        }

        /* renamed from: c */
        public static C4970d m52989c(int i, int i2, Object obj) {
            return m52990b(i, i2, 0, 0, 0, 0, obj);
        }

        /* renamed from: d */
        public void m52988d() {
            this.f37214a = null;
            this.f37220g = 0;
            this.f37219f = 0;
            this.f37218e = 0;
            this.f37217d = 0;
            this.f37216c = 0;
            this.f37215b = 0;
            this.f37221h = null;
            synchronized (f37213j) {
                try {
                    C4970d c4970d = f37212i;
                    if (c4970d != null) {
                        this.f37214a = c4970d;
                    }
                    f37212i = this;
                } catch (Throwable th2) {
                    throw th2;
                }
            }
        }
    }

    @Override // androidx.recyclerview.widget.ThreadUtil
    /* renamed from: a */
    public ThreadUtil.MainThreadCallback mo53001a(ThreadUtil.MainThreadCallback mainThreadCallback) {
        return new C4965a(mainThreadCallback);
    }

    @Override // androidx.recyclerview.widget.ThreadUtil
    /* renamed from: b */
    public ThreadUtil.BackgroundCallback mo53000b(ThreadUtil.BackgroundCallback backgroundCallback) {
        return new C4967b(backgroundCallback);
    }
}

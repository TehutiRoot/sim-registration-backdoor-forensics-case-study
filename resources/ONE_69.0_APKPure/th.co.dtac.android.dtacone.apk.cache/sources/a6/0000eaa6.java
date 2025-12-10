package p000;

import androidx.camera.core.impl.utils.executor.CameraXExecutors;
import androidx.camera.core.impl.utils.futures.Futures;
import androidx.concurrent.futures.CallbackToFutureAdapter;
import androidx.core.util.Preconditions;
import com.google.common.util.concurrent.ListenableFuture;
import java.util.ArrayList;
import java.util.List;
import java.util.concurrent.CancellationException;
import java.util.concurrent.ExecutionException;
import java.util.concurrent.Executor;
import java.util.concurrent.Future;
import java.util.concurrent.TimeUnit;
import java.util.concurrent.atomic.AtomicInteger;

/* renamed from: mj0  reason: case insensitive filesystem */
/* loaded from: classes.dex */
public class C21175mj0 implements ListenableFuture {

    /* renamed from: a */
    public List f72105a;

    /* renamed from: b */
    public List f72106b;

    /* renamed from: c */
    public final boolean f72107c;

    /* renamed from: d */
    public final AtomicInteger f72108d;

    /* renamed from: e */
    public final ListenableFuture f72109e = CallbackToFutureAdapter.getFuture(new C12299a());

    /* renamed from: f */
    public CallbackToFutureAdapter.Completer f72110f;

    /* renamed from: mj0$a */
    /* loaded from: classes.dex */
    public class C12299a implements CallbackToFutureAdapter.Resolver {
        public C12299a() {
        }

        @Override // androidx.concurrent.futures.CallbackToFutureAdapter.Resolver
        public Object attachCompleter(CallbackToFutureAdapter.Completer completer) {
            boolean z;
            if (C21175mj0.this.f72110f == null) {
                z = true;
            } else {
                z = false;
            }
            Preconditions.checkState(z, "The result can only set once!");
            C21175mj0.this.f72110f = completer;
            return "ListFuture[" + this + "]";
        }
    }

    /* renamed from: mj0$b */
    /* loaded from: classes.dex */
    public class RunnableC12300b implements Runnable {
        public RunnableC12300b() {
        }

        @Override // java.lang.Runnable
        public void run() {
            C21175mj0 c21175mj0 = C21175mj0.this;
            c21175mj0.f72106b = null;
            c21175mj0.f72105a = null;
        }
    }

    /* renamed from: mj0$c */
    /* loaded from: classes.dex */
    public class RunnableC12301c implements Runnable {

        /* renamed from: a */
        public final /* synthetic */ int f72113a;

        /* renamed from: b */
        public final /* synthetic */ ListenableFuture f72114b;

        public RunnableC12301c(int i, ListenableFuture listenableFuture) {
            this.f72113a = i;
            this.f72114b = listenableFuture;
        }

        @Override // java.lang.Runnable
        public void run() {
            C21175mj0.this.m26582e(this.f72113a, this.f72114b);
        }
    }

    public C21175mj0(List list, boolean z, Executor executor) {
        this.f72105a = (List) Preconditions.checkNotNull(list);
        this.f72106b = new ArrayList(list.size());
        this.f72107c = z;
        this.f72108d = new AtomicInteger(list.size());
        m26583d(executor);
    }

    /* renamed from: a */
    public final void m26586a() {
        List<ListenableFuture> list = this.f72105a;
        if (list != null && !isDone()) {
            for (ListenableFuture listenableFuture : list) {
                while (!listenableFuture.isDone()) {
                    try {
                        listenableFuture.get();
                    } catch (Error e) {
                        throw e;
                    } catch (InterruptedException e2) {
                        throw e2;
                    } catch (Throwable unused) {
                        if (this.f72107c) {
                            return;
                        }
                    }
                }
            }
        }
    }

    @Override // com.google.common.util.concurrent.ListenableFuture
    public void addListener(Runnable runnable, Executor executor) {
        this.f72109e.addListener(runnable, executor);
    }

    @Override // java.util.concurrent.Future
    /* renamed from: b */
    public List get() {
        m26586a();
        return (List) this.f72109e.get();
    }

    @Override // java.util.concurrent.Future
    /* renamed from: c */
    public List get(long j, TimeUnit timeUnit) {
        return (List) this.f72109e.get(j, timeUnit);
    }

    @Override // java.util.concurrent.Future
    public boolean cancel(boolean z) {
        List<ListenableFuture> list = this.f72105a;
        if (list != null) {
            for (ListenableFuture listenableFuture : list) {
                listenableFuture.cancel(z);
            }
        }
        return this.f72109e.cancel(z);
    }

    /* renamed from: d */
    public final void m26583d(Executor executor) {
        addListener(new RunnableC12300b(), CameraXExecutors.directExecutor());
        if (this.f72105a.isEmpty()) {
            this.f72110f.set(new ArrayList(this.f72106b));
            return;
        }
        for (int i = 0; i < this.f72105a.size(); i++) {
            this.f72106b.add(null);
        }
        List list = this.f72105a;
        for (int i2 = 0; i2 < list.size(); i2++) {
            ListenableFuture listenableFuture = (ListenableFuture) list.get(i2);
            listenableFuture.addListener(new RunnableC12301c(i2, listenableFuture), executor);
        }
    }

    /* renamed from: e */
    public void m26582e(int i, Future future) {
        CallbackToFutureAdapter.Completer completer;
        ArrayList arrayList;
        int decrementAndGet;
        List list = this.f72106b;
        if (!isDone() && list != null) {
            boolean z = true;
            try {
                try {
                    try {
                        try {
                            Preconditions.checkState(future.isDone(), "Tried to set value from future which is not done");
                            list.set(i, Futures.getUninterruptibly(future));
                            decrementAndGet = this.f72108d.decrementAndGet();
                            if (decrementAndGet < 0) {
                                z = false;
                            }
                            Preconditions.checkState(z, "Less than 0 remaining futures");
                        } catch (Error e) {
                            this.f72110f.setException(e);
                            int decrementAndGet2 = this.f72108d.decrementAndGet();
                            if (decrementAndGet2 < 0) {
                                z = false;
                            }
                            Preconditions.checkState(z, "Less than 0 remaining futures");
                            if (decrementAndGet2 == 0) {
                                List list2 = this.f72106b;
                                if (list2 != null) {
                                    completer = this.f72110f;
                                    arrayList = new ArrayList(list2);
                                }
                            } else {
                                return;
                            }
                        } catch (CancellationException unused) {
                            if (this.f72107c) {
                                cancel(false);
                            }
                            int decrementAndGet3 = this.f72108d.decrementAndGet();
                            if (decrementAndGet3 < 0) {
                                z = false;
                            }
                            Preconditions.checkState(z, "Less than 0 remaining futures");
                            if (decrementAndGet3 == 0) {
                                List list3 = this.f72106b;
                                if (list3 != null) {
                                    completer = this.f72110f;
                                    arrayList = new ArrayList(list3);
                                }
                            } else {
                                return;
                            }
                        }
                    } catch (ExecutionException e2) {
                        if (this.f72107c) {
                            this.f72110f.setException(e2.getCause());
                        }
                        int decrementAndGet4 = this.f72108d.decrementAndGet();
                        if (decrementAndGet4 < 0) {
                            z = false;
                        }
                        Preconditions.checkState(z, "Less than 0 remaining futures");
                        if (decrementAndGet4 == 0) {
                            List list4 = this.f72106b;
                            if (list4 != null) {
                                completer = this.f72110f;
                                arrayList = new ArrayList(list4);
                            }
                        } else {
                            return;
                        }
                    }
                } catch (RuntimeException e3) {
                    if (this.f72107c) {
                        this.f72110f.setException(e3);
                    }
                    int decrementAndGet5 = this.f72108d.decrementAndGet();
                    if (decrementAndGet5 < 0) {
                        z = false;
                    }
                    Preconditions.checkState(z, "Less than 0 remaining futures");
                    if (decrementAndGet5 == 0) {
                        List list5 = this.f72106b;
                        if (list5 != null) {
                            completer = this.f72110f;
                            arrayList = new ArrayList(list5);
                        }
                    } else {
                        return;
                    }
                }
                if (decrementAndGet == 0) {
                    List list6 = this.f72106b;
                    if (list6 != null) {
                        completer = this.f72110f;
                        arrayList = new ArrayList(list6);
                        completer.set(arrayList);
                        return;
                    }
                    Preconditions.checkState(isDone());
                    return;
                }
                return;
            } catch (Throwable th2) {
                int decrementAndGet6 = this.f72108d.decrementAndGet();
                if (decrementAndGet6 < 0) {
                    z = false;
                }
                Preconditions.checkState(z, "Less than 0 remaining futures");
                if (decrementAndGet6 == 0) {
                    List list7 = this.f72106b;
                    if (list7 != null) {
                        this.f72110f.set(new ArrayList(list7));
                    } else {
                        Preconditions.checkState(isDone());
                    }
                }
                throw th2;
            }
        }
        Preconditions.checkState(this.f72107c, "Future was done before all dependencies completed");
    }

    @Override // java.util.concurrent.Future
    public boolean isCancelled() {
        return this.f72109e.isCancelled();
    }

    @Override // java.util.concurrent.Future
    public boolean isDone() {
        return this.f72109e.isDone();
    }
}
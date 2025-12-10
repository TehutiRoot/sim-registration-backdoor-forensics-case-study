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

/* renamed from: gj0  reason: case insensitive filesystem */
/* loaded from: classes.dex */
public class C20084gj0 implements ListenableFuture {

    /* renamed from: a */
    public List f62241a;

    /* renamed from: b */
    public List f62242b;

    /* renamed from: c */
    public final boolean f62243c;

    /* renamed from: d */
    public final AtomicInteger f62244d;

    /* renamed from: e */
    public final ListenableFuture f62245e = CallbackToFutureAdapter.getFuture(new C10322a());

    /* renamed from: f */
    public CallbackToFutureAdapter.Completer f62246f;

    /* renamed from: gj0$a */
    /* loaded from: classes.dex */
    public class C10322a implements CallbackToFutureAdapter.Resolver {
        public C10322a() {
        }

        @Override // androidx.concurrent.futures.CallbackToFutureAdapter.Resolver
        public Object attachCompleter(CallbackToFutureAdapter.Completer completer) {
            boolean z;
            if (C20084gj0.this.f62246f == null) {
                z = true;
            } else {
                z = false;
            }
            Preconditions.checkState(z, "The result can only set once!");
            C20084gj0.this.f62246f = completer;
            return "ListFuture[" + this + "]";
        }
    }

    /* renamed from: gj0$b */
    /* loaded from: classes.dex */
    public class RunnableC10323b implements Runnable {
        public RunnableC10323b() {
        }

        @Override // java.lang.Runnable
        public void run() {
            C20084gj0 c20084gj0 = C20084gj0.this;
            c20084gj0.f62242b = null;
            c20084gj0.f62241a = null;
        }
    }

    /* renamed from: gj0$c */
    /* loaded from: classes.dex */
    public class RunnableC10324c implements Runnable {

        /* renamed from: a */
        public final /* synthetic */ int f62249a;

        /* renamed from: b */
        public final /* synthetic */ ListenableFuture f62250b;

        public RunnableC10324c(int i, ListenableFuture listenableFuture) {
            this.f62249a = i;
            this.f62250b = listenableFuture;
        }

        @Override // java.lang.Runnable
        public void run() {
            C20084gj0.this.m31050e(this.f62249a, this.f62250b);
        }
    }

    public C20084gj0(List list, boolean z, Executor executor) {
        this.f62241a = (List) Preconditions.checkNotNull(list);
        this.f62242b = new ArrayList(list.size());
        this.f62243c = z;
        this.f62244d = new AtomicInteger(list.size());
        m31051d(executor);
    }

    /* renamed from: a */
    public final void m31054a() {
        List<ListenableFuture> list = this.f62241a;
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
                        if (this.f62243c) {
                            return;
                        }
                    }
                }
            }
        }
    }

    @Override // com.google.common.util.concurrent.ListenableFuture
    public void addListener(Runnable runnable, Executor executor) {
        this.f62245e.addListener(runnable, executor);
    }

    @Override // java.util.concurrent.Future
    /* renamed from: b */
    public List get() {
        m31054a();
        return (List) this.f62245e.get();
    }

    @Override // java.util.concurrent.Future
    /* renamed from: c */
    public List get(long j, TimeUnit timeUnit) {
        return (List) this.f62245e.get(j, timeUnit);
    }

    @Override // java.util.concurrent.Future
    public boolean cancel(boolean z) {
        List<ListenableFuture> list = this.f62241a;
        if (list != null) {
            for (ListenableFuture listenableFuture : list) {
                listenableFuture.cancel(z);
            }
        }
        return this.f62245e.cancel(z);
    }

    /* renamed from: d */
    public final void m31051d(Executor executor) {
        addListener(new RunnableC10323b(), CameraXExecutors.directExecutor());
        if (this.f62241a.isEmpty()) {
            this.f62246f.set(new ArrayList(this.f62242b));
            return;
        }
        for (int i = 0; i < this.f62241a.size(); i++) {
            this.f62242b.add(null);
        }
        List list = this.f62241a;
        for (int i2 = 0; i2 < list.size(); i2++) {
            ListenableFuture listenableFuture = (ListenableFuture) list.get(i2);
            listenableFuture.addListener(new RunnableC10324c(i2, listenableFuture), executor);
        }
    }

    /* renamed from: e */
    public void m31050e(int i, Future future) {
        CallbackToFutureAdapter.Completer completer;
        ArrayList arrayList;
        int decrementAndGet;
        List list = this.f62242b;
        if (!isDone() && list != null) {
            boolean z = true;
            try {
                try {
                    try {
                        try {
                            Preconditions.checkState(future.isDone(), "Tried to set value from future which is not done");
                            list.set(i, Futures.getUninterruptibly(future));
                            decrementAndGet = this.f62244d.decrementAndGet();
                            if (decrementAndGet < 0) {
                                z = false;
                            }
                            Preconditions.checkState(z, "Less than 0 remaining futures");
                        } catch (Error e) {
                            this.f62246f.setException(e);
                            int decrementAndGet2 = this.f62244d.decrementAndGet();
                            if (decrementAndGet2 < 0) {
                                z = false;
                            }
                            Preconditions.checkState(z, "Less than 0 remaining futures");
                            if (decrementAndGet2 == 0) {
                                List list2 = this.f62242b;
                                if (list2 != null) {
                                    completer = this.f62246f;
                                    arrayList = new ArrayList(list2);
                                }
                            } else {
                                return;
                            }
                        } catch (CancellationException unused) {
                            if (this.f62243c) {
                                cancel(false);
                            }
                            int decrementAndGet3 = this.f62244d.decrementAndGet();
                            if (decrementAndGet3 < 0) {
                                z = false;
                            }
                            Preconditions.checkState(z, "Less than 0 remaining futures");
                            if (decrementAndGet3 == 0) {
                                List list3 = this.f62242b;
                                if (list3 != null) {
                                    completer = this.f62246f;
                                    arrayList = new ArrayList(list3);
                                }
                            } else {
                                return;
                            }
                        }
                    } catch (ExecutionException e2) {
                        if (this.f62243c) {
                            this.f62246f.setException(e2.getCause());
                        }
                        int decrementAndGet4 = this.f62244d.decrementAndGet();
                        if (decrementAndGet4 < 0) {
                            z = false;
                        }
                        Preconditions.checkState(z, "Less than 0 remaining futures");
                        if (decrementAndGet4 == 0) {
                            List list4 = this.f62242b;
                            if (list4 != null) {
                                completer = this.f62246f;
                                arrayList = new ArrayList(list4);
                            }
                        } else {
                            return;
                        }
                    }
                } catch (RuntimeException e3) {
                    if (this.f62243c) {
                        this.f62246f.setException(e3);
                    }
                    int decrementAndGet5 = this.f62244d.decrementAndGet();
                    if (decrementAndGet5 < 0) {
                        z = false;
                    }
                    Preconditions.checkState(z, "Less than 0 remaining futures");
                    if (decrementAndGet5 == 0) {
                        List list5 = this.f62242b;
                        if (list5 != null) {
                            completer = this.f62246f;
                            arrayList = new ArrayList(list5);
                        }
                    } else {
                        return;
                    }
                }
                if (decrementAndGet == 0) {
                    List list6 = this.f62242b;
                    if (list6 != null) {
                        completer = this.f62246f;
                        arrayList = new ArrayList(list6);
                        completer.set(arrayList);
                        return;
                    }
                    Preconditions.checkState(isDone());
                    return;
                }
                return;
            } catch (Throwable th2) {
                int decrementAndGet6 = this.f62244d.decrementAndGet();
                if (decrementAndGet6 < 0) {
                    z = false;
                }
                Preconditions.checkState(z, "Less than 0 remaining futures");
                if (decrementAndGet6 == 0) {
                    List list7 = this.f62242b;
                    if (list7 != null) {
                        this.f62246f.set(new ArrayList(list7));
                    } else {
                        Preconditions.checkState(isDone());
                    }
                }
                throw th2;
            }
        }
        Preconditions.checkState(this.f62243c, "Future was done before all dependencies completed");
    }

    @Override // java.util.concurrent.Future
    public boolean isCancelled() {
        return this.f62245e.isCancelled();
    }

    @Override // java.util.concurrent.Future
    public boolean isDone() {
        return this.f62245e.isDone();
    }
}

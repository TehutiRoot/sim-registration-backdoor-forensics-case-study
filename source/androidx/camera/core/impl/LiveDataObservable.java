package androidx.camera.core.impl;

import android.os.SystemClock;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.annotation.RequiresApi;
import androidx.camera.core.impl.LiveDataObservable;
import androidx.camera.core.impl.Observable;
import androidx.camera.core.impl.utils.executor.CameraXExecutors;
import androidx.concurrent.futures.CallbackToFutureAdapter;
import androidx.core.util.Preconditions;
import androidx.lifecycle.LiveData;
import androidx.lifecycle.MutableLiveData;
import androidx.lifecycle.Observer;
import com.google.common.util.concurrent.ListenableFuture;
import java.util.HashMap;
import java.util.Map;
import java.util.concurrent.Executor;
import java.util.concurrent.atomic.AtomicBoolean;

@RequiresApi(21)
/* loaded from: classes.dex */
public final class LiveDataObservable<T> implements Observable<T> {

    /* renamed from: a */
    public final MutableLiveData f11154a = new MutableLiveData();

    /* renamed from: b */
    public final Map f11155b = new HashMap();

    /* loaded from: classes.dex */
    public static final class Result<T> {

        /* renamed from: a */
        public final Object f11156a;

        /* renamed from: b */
        public final Throwable f11157b;

        public Result(Object obj, Throwable th2) {
            this.f11156a = obj;
            this.f11157b = th2;
        }

        /* renamed from: a */
        public static Result m62925a(Throwable th2) {
            return new Result(null, (Throwable) Preconditions.checkNotNull(th2));
        }

        /* renamed from: b */
        public static Result m62924b(Object obj) {
            return new Result(obj, null);
        }

        public boolean completedSuccessfully() {
            if (this.f11157b == null) {
                return true;
            }
            return false;
        }

        @Nullable
        public Throwable getError() {
            return this.f11157b;
        }

        @Nullable
        public T getValue() {
            if (completedSuccessfully()) {
                return (T) this.f11156a;
            }
            throw new IllegalStateException("Result contains an error. Does not contain a value.");
        }

        @NonNull
        public String toString() {
            String str;
            StringBuilder sb = new StringBuilder();
            sb.append("[Result: <");
            if (completedSuccessfully()) {
                str = "Value: " + this.f11156a;
            } else {
                str = "Error: " + this.f11157b;
            }
            sb.append(str);
            sb.append(">]");
            return sb.toString();
        }
    }

    /* renamed from: androidx.camera.core.impl.LiveDataObservable$a */
    /* loaded from: classes.dex */
    public static final class C2506a implements Observer {

        /* renamed from: a */
        public final AtomicBoolean f11158a = new AtomicBoolean(true);

        /* renamed from: b */
        public final Observable.Observer f11159b;

        /* renamed from: c */
        public final Executor f11160c;

        public C2506a(Executor executor, Observable.Observer observer) {
            this.f11160c = executor;
            this.f11159b = observer;
        }

        /* renamed from: a */
        public static /* synthetic */ void m62923a(C2506a c2506a, Result result) {
            c2506a.m62921c(result);
        }

        /* renamed from: b */
        public void m62922b() {
            this.f11158a.set(false);
        }

        /* JADX WARN: Multi-variable type inference failed */
        /* renamed from: c */
        public final /* synthetic */ void m62921c(Result result) {
            if (!this.f11158a.get()) {
                return;
            }
            if (result.completedSuccessfully()) {
                this.f11159b.onNewData(result.getValue());
                return;
            }
            Preconditions.checkNotNull(result.getError());
            this.f11159b.onError(result.getError());
        }

        @Override // androidx.lifecycle.Observer
        /* renamed from: d */
        public void onChanged(final Result result) {
            this.f11160c.execute(new Runnable() { // from class: qj0
                {
                    LiveDataObservable.C2506a.this = this;
                }

                @Override // java.lang.Runnable
                public final void run() {
                    LiveDataObservable.C2506a.m62923a(LiveDataObservable.C2506a.this, result);
                }
            });
        }
    }

    /* renamed from: a */
    public static /* synthetic */ Object m62933a(LiveDataObservable liveDataObservable, CallbackToFutureAdapter.Completer completer) {
        return liveDataObservable.m62927g(completer);
    }

    /* renamed from: b */
    public static /* synthetic */ void m62932b(LiveDataObservable liveDataObservable, C2506a c2506a) {
        liveDataObservable.m62926h(c2506a);
    }

    /* renamed from: c */
    public static /* synthetic */ void m62931c(LiveDataObservable liveDataObservable, CallbackToFutureAdapter.Completer completer) {
        liveDataObservable.m62928f(completer);
    }

    /* renamed from: d */
    public static /* synthetic */ void m62930d(LiveDataObservable liveDataObservable, C2506a c2506a, C2506a c2506a2) {
        liveDataObservable.m62929e(c2506a, c2506a2);
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* renamed from: f */
    public /* synthetic */ void m62928f(CallbackToFutureAdapter.Completer completer) {
        Result result = (Result) this.f11154a.getValue();
        if (result == null) {
            completer.setException(new IllegalStateException("Observable has not yet been initialized with a value."));
        } else if (result.completedSuccessfully()) {
            completer.set(result.getValue());
        } else {
            Preconditions.checkNotNull(result.getError());
            completer.setException(result.getError());
        }
    }

    /* renamed from: g */
    public /* synthetic */ Object m62927g(final CallbackToFutureAdapter.Completer completer) {
        CameraXExecutors.mainThreadExecutor().execute(new Runnable() { // from class: pj0
            {
                LiveDataObservable.this = this;
            }

            @Override // java.lang.Runnable
            public final void run() {
                LiveDataObservable.m62931c(LiveDataObservable.this, completer);
            }
        });
        return this + " [fetch@" + SystemClock.uptimeMillis() + "]";
    }

    @Override // androidx.camera.core.impl.Observable
    public void addObserver(@NonNull Executor executor, @NonNull Observable.Observer<? super T> observer) {
        synchronized (this.f11155b) {
            try {
                final C2506a c2506a = (C2506a) this.f11155b.get(observer);
                if (c2506a != null) {
                    c2506a.m62922b();
                }
                final C2506a c2506a2 = new C2506a(executor, observer);
                this.f11155b.put(observer, c2506a2);
                CameraXExecutors.mainThreadExecutor().execute(new Runnable() { // from class: nj0
                    {
                        LiveDataObservable.this = this;
                    }

                    @Override // java.lang.Runnable
                    public final void run() {
                        LiveDataObservable.m62930d(LiveDataObservable.this, c2506a, c2506a2);
                    }
                });
            } catch (Throwable th2) {
                throw th2;
            }
        }
    }

    /* renamed from: e */
    public final /* synthetic */ void m62929e(C2506a c2506a, C2506a c2506a2) {
        if (c2506a != null) {
            this.f11154a.removeObserver(c2506a);
        }
        this.f11154a.observeForever(c2506a2);
    }

    @Override // androidx.camera.core.impl.Observable
    @NonNull
    public ListenableFuture<T> fetchData() {
        return CallbackToFutureAdapter.getFuture(new CallbackToFutureAdapter.Resolver() { // from class: oj0
            {
                LiveDataObservable.this = this;
            }

            @Override // androidx.concurrent.futures.CallbackToFutureAdapter.Resolver
            public final Object attachCompleter(CallbackToFutureAdapter.Completer completer) {
                return LiveDataObservable.m62933a(LiveDataObservable.this, completer);
            }
        });
    }

    @NonNull
    public LiveData<Result<T>> getLiveData() {
        return this.f11154a;
    }

    /* renamed from: h */
    public final /* synthetic */ void m62926h(C2506a c2506a) {
        this.f11154a.removeObserver(c2506a);
    }

    public void postError(@NonNull Throwable th2) {
        this.f11154a.postValue(Result.m62925a(th2));
    }

    public void postValue(@Nullable T t) {
        this.f11154a.postValue(Result.m62924b(t));
    }

    @Override // androidx.camera.core.impl.Observable
    public void removeObserver(@NonNull Observable.Observer<? super T> observer) {
        synchronized (this.f11155b) {
            try {
                final C2506a c2506a = (C2506a) this.f11155b.remove(observer);
                if (c2506a != null) {
                    c2506a.m62922b();
                    CameraXExecutors.mainThreadExecutor().execute(new Runnable() { // from class: mj0
                        {
                            LiveDataObservable.this = this;
                        }

                        @Override // java.lang.Runnable
                        public final void run() {
                            LiveDataObservable.m62932b(LiveDataObservable.this, c2506a);
                        }
                    });
                }
            } catch (Throwable th2) {
                throw th2;
            }
        }
    }
}

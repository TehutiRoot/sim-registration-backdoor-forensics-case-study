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
    public final MutableLiveData f11242a = new MutableLiveData();

    /* renamed from: b */
    public final Map f11243b = new HashMap();

    /* loaded from: classes.dex */
    public static final class Result<T> {

        /* renamed from: a */
        public final Object f11244a;

        /* renamed from: b */
        public final Throwable f11245b;

        public Result(Object obj, Throwable th2) {
            this.f11244a = obj;
            this.f11245b = th2;
        }

        /* renamed from: a */
        public static Result m62873a(Throwable th2) {
            return new Result(null, (Throwable) Preconditions.checkNotNull(th2));
        }

        /* renamed from: b */
        public static Result m62872b(Object obj) {
            return new Result(obj, null);
        }

        public boolean completedSuccessfully() {
            if (this.f11245b == null) {
                return true;
            }
            return false;
        }

        @Nullable
        public Throwable getError() {
            return this.f11245b;
        }

        @Nullable
        public T getValue() {
            if (completedSuccessfully()) {
                return (T) this.f11244a;
            }
            throw new IllegalStateException("Result contains an error. Does not contain a value.");
        }

        @NonNull
        public String toString() {
            String str;
            StringBuilder sb = new StringBuilder();
            sb.append("[Result: <");
            if (completedSuccessfully()) {
                str = "Value: " + this.f11244a;
            } else {
                str = "Error: " + this.f11245b;
            }
            sb.append(str);
            sb.append(">]");
            return sb.toString();
        }
    }

    /* renamed from: androidx.camera.core.impl.LiveDataObservable$a */
    /* loaded from: classes.dex */
    public static final class C2488a implements Observer {

        /* renamed from: a */
        public final AtomicBoolean f11246a = new AtomicBoolean(true);

        /* renamed from: b */
        public final Observable.Observer f11247b;

        /* renamed from: c */
        public final Executor f11248c;

        public C2488a(Executor executor, Observable.Observer observer) {
            this.f11248c = executor;
            this.f11247b = observer;
        }

        /* renamed from: a */
        public static /* synthetic */ void m62871a(C2488a c2488a, Result result) {
            c2488a.m62869c(result);
        }

        /* renamed from: b */
        public void m62870b() {
            this.f11246a.set(false);
        }

        /* JADX WARN: Multi-variable type inference failed */
        /* renamed from: c */
        public final /* synthetic */ void m62869c(Result result) {
            if (!this.f11246a.get()) {
                return;
            }
            if (result.completedSuccessfully()) {
                this.f11247b.onNewData(result.getValue());
                return;
            }
            Preconditions.checkNotNull(result.getError());
            this.f11247b.onError(result.getError());
        }

        @Override // androidx.lifecycle.Observer
        /* renamed from: d */
        public void onChanged(final Result result) {
            this.f11248c.execute(new Runnable() { // from class: wj0
                @Override // java.lang.Runnable
                public final void run() {
                    LiveDataObservable.C2488a.m62871a(LiveDataObservable.C2488a.this, result);
                }
            });
        }
    }

    /* renamed from: a */
    public static /* synthetic */ Object m62881a(LiveDataObservable liveDataObservable, CallbackToFutureAdapter.Completer completer) {
        return liveDataObservable.m62875g(completer);
    }

    /* renamed from: b */
    public static /* synthetic */ void m62880b(LiveDataObservable liveDataObservable, C2488a c2488a) {
        liveDataObservable.m62874h(c2488a);
    }

    /* renamed from: c */
    public static /* synthetic */ void m62879c(LiveDataObservable liveDataObservable, CallbackToFutureAdapter.Completer completer) {
        liveDataObservable.m62876f(completer);
    }

    /* renamed from: d */
    public static /* synthetic */ void m62878d(LiveDataObservable liveDataObservable, C2488a c2488a, C2488a c2488a2) {
        liveDataObservable.m62877e(c2488a, c2488a2);
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* renamed from: f */
    public /* synthetic */ void m62876f(CallbackToFutureAdapter.Completer completer) {
        Result result = (Result) this.f11242a.getValue();
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
    public /* synthetic */ Object m62875g(final CallbackToFutureAdapter.Completer completer) {
        CameraXExecutors.mainThreadExecutor().execute(new Runnable() { // from class: vj0
            @Override // java.lang.Runnable
            public final void run() {
                LiveDataObservable.m62879c(LiveDataObservable.this, completer);
            }
        });
        return this + " [fetch@" + SystemClock.uptimeMillis() + "]";
    }

    @Override // androidx.camera.core.impl.Observable
    public void addObserver(@NonNull Executor executor, @NonNull Observable.Observer<? super T> observer) {
        synchronized (this.f11243b) {
            try {
                final C2488a c2488a = (C2488a) this.f11243b.get(observer);
                if (c2488a != null) {
                    c2488a.m62870b();
                }
                final C2488a c2488a2 = new C2488a(executor, observer);
                this.f11243b.put(observer, c2488a2);
                CameraXExecutors.mainThreadExecutor().execute(new Runnable() { // from class: tj0
                    @Override // java.lang.Runnable
                    public final void run() {
                        LiveDataObservable.m62878d(LiveDataObservable.this, c2488a, c2488a2);
                    }
                });
            } catch (Throwable th2) {
                throw th2;
            }
        }
    }

    /* renamed from: e */
    public final /* synthetic */ void m62877e(C2488a c2488a, C2488a c2488a2) {
        if (c2488a != null) {
            this.f11242a.removeObserver(c2488a);
        }
        this.f11242a.observeForever(c2488a2);
    }

    @Override // androidx.camera.core.impl.Observable
    @NonNull
    public ListenableFuture<T> fetchData() {
        return CallbackToFutureAdapter.getFuture(new CallbackToFutureAdapter.Resolver() { // from class: uj0
            @Override // androidx.concurrent.futures.CallbackToFutureAdapter.Resolver
            public final Object attachCompleter(CallbackToFutureAdapter.Completer completer) {
                return LiveDataObservable.m62881a(LiveDataObservable.this, completer);
            }
        });
    }

    @NonNull
    public LiveData<Result<T>> getLiveData() {
        return this.f11242a;
    }

    /* renamed from: h */
    public final /* synthetic */ void m62874h(C2488a c2488a) {
        this.f11242a.removeObserver(c2488a);
    }

    public void postError(@NonNull Throwable th2) {
        this.f11242a.postValue(Result.m62873a(th2));
    }

    public void postValue(@Nullable T t) {
        this.f11242a.postValue(Result.m62872b(t));
    }

    @Override // androidx.camera.core.impl.Observable
    public void removeObserver(@NonNull Observable.Observer<? super T> observer) {
        synchronized (this.f11243b) {
            try {
                final C2488a c2488a = (C2488a) this.f11243b.remove(observer);
                if (c2488a != null) {
                    c2488a.m62870b();
                    CameraXExecutors.mainThreadExecutor().execute(new Runnable() { // from class: sj0
                        @Override // java.lang.Runnable
                        public final void run() {
                            LiveDataObservable.m62880b(LiveDataObservable.this, c2488a);
                        }
                    });
                }
            } catch (Throwable th2) {
                throw th2;
            }
        }
    }
}
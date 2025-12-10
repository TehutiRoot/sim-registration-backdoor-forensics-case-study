package androidx.concurrent.futures;

import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import com.google.common.util.concurrent.ListenableFuture;
import java.lang.ref.WeakReference;
import java.util.concurrent.Executor;
import java.util.concurrent.TimeUnit;

/* loaded from: classes2.dex */
public final class CallbackToFutureAdapter {

    /* loaded from: classes2.dex */
    public static final class Completer<T> {

        /* renamed from: a */
        public Object f31977a;

        /* renamed from: b */
        public C3647a f31978b;

        /* renamed from: c */
        public ResolvableFuture f31979c = ResolvableFuture.create();

        /* renamed from: d */
        public boolean f31980d;

        /* renamed from: a */
        public void m58767a() {
            this.f31977a = null;
            this.f31978b = null;
            this.f31979c.set(null);
        }

        public void addCancellationListener(@NonNull Runnable runnable, @NonNull Executor executor) {
            ResolvableFuture resolvableFuture = this.f31979c;
            if (resolvableFuture != null) {
                resolvableFuture.addListener(runnable, executor);
            }
        }

        /* renamed from: b */
        public final void m58766b() {
            this.f31977a = null;
            this.f31978b = null;
            this.f31979c = null;
        }

        public void finalize() {
            ResolvableFuture resolvableFuture;
            C3647a c3647a = this.f31978b;
            if (c3647a != null && !c3647a.isDone()) {
                c3647a.m58763c(new FutureGarbageCollectedException("The completer object was garbage collected - this future would otherwise never complete. The tag was: " + this.f31977a));
            }
            if (!this.f31980d && (resolvableFuture = this.f31979c) != null) {
                resolvableFuture.set(null);
            }
        }

        public boolean set(T t) {
            boolean z = true;
            this.f31980d = true;
            C3647a c3647a = this.f31978b;
            z = (c3647a == null || !c3647a.m58764b(t)) ? false : false;
            if (z) {
                m58766b();
            }
            return z;
        }

        public boolean setCancelled() {
            boolean z = true;
            this.f31980d = true;
            C3647a c3647a = this.f31978b;
            z = (c3647a == null || !c3647a.m58765a(true)) ? false : false;
            if (z) {
                m58766b();
            }
            return z;
        }

        public boolean setException(@NonNull Throwable th2) {
            boolean z = true;
            this.f31980d = true;
            C3647a c3647a = this.f31978b;
            z = (c3647a == null || !c3647a.m58763c(th2)) ? false : false;
            if (z) {
                m58766b();
            }
            return z;
        }
    }

    /* loaded from: classes2.dex */
    public static final class FutureGarbageCollectedException extends Throwable {
        public FutureGarbageCollectedException(String str) {
            super(str);
        }

        @Override // java.lang.Throwable
        public synchronized Throwable fillInStackTrace() {
            return this;
        }
    }

    /* loaded from: classes2.dex */
    public interface Resolver<T> {
        @Nullable
        Object attachCompleter(@NonNull Completer<T> completer) throws Exception;
    }

    /* renamed from: androidx.concurrent.futures.CallbackToFutureAdapter$a */
    /* loaded from: classes2.dex */
    public static final class C3647a implements ListenableFuture {

        /* renamed from: a */
        public final WeakReference f31981a;

        /* renamed from: b */
        public final AbstractResolvableFuture f31982b = new C3648a();

        /* renamed from: androidx.concurrent.futures.CallbackToFutureAdapter$a$a */
        /* loaded from: classes2.dex */
        public class C3648a extends AbstractResolvableFuture {
            public C3648a() {
            }

            @Override // androidx.concurrent.futures.AbstractResolvableFuture
            public String pendingToString() {
                Completer completer = (Completer) C3647a.this.f31981a.get();
                if (completer == null) {
                    return "Completer object has been garbage collected, future will fail soon";
                }
                return "tag=[" + completer.f31977a + "]";
            }
        }

        public C3647a(Completer completer) {
            this.f31981a = new WeakReference(completer);
        }

        /* renamed from: a */
        public boolean m58765a(boolean z) {
            return this.f31982b.cancel(z);
        }

        @Override // com.google.common.util.concurrent.ListenableFuture
        public void addListener(Runnable runnable, Executor executor) {
            this.f31982b.addListener(runnable, executor);
        }

        /* renamed from: b */
        public boolean m58764b(Object obj) {
            return this.f31982b.set(obj);
        }

        /* renamed from: c */
        public boolean m58763c(Throwable th2) {
            return this.f31982b.setException(th2);
        }

        @Override // java.util.concurrent.Future
        public boolean cancel(boolean z) {
            Completer completer = (Completer) this.f31981a.get();
            boolean cancel = this.f31982b.cancel(z);
            if (cancel && completer != null) {
                completer.m58767a();
            }
            return cancel;
        }

        @Override // java.util.concurrent.Future
        public Object get() {
            return this.f31982b.get();
        }

        @Override // java.util.concurrent.Future
        public boolean isCancelled() {
            return this.f31982b.isCancelled();
        }

        @Override // java.util.concurrent.Future
        public boolean isDone() {
            return this.f31982b.isDone();
        }

        public String toString() {
            return this.f31982b.toString();
        }

        @Override // java.util.concurrent.Future
        public Object get(long j, TimeUnit timeUnit) {
            return this.f31982b.get(j, timeUnit);
        }
    }

    @NonNull
    public static <T> ListenableFuture<T> getFuture(@NonNull Resolver<T> resolver) {
        Completer<T> completer = new Completer<>();
        C3647a c3647a = new C3647a(completer);
        completer.f31978b = c3647a;
        completer.f31977a = resolver.getClass();
        try {
            Object attachCompleter = resolver.attachCompleter(completer);
            if (attachCompleter != null) {
                completer.f31977a = attachCompleter;
            }
        } catch (Exception e) {
            c3647a.m58763c(e);
        }
        return c3647a;
    }
}
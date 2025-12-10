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
        public Object f31889a;

        /* renamed from: b */
        public C3665a f31890b;

        /* renamed from: c */
        public ResolvableFuture f31891c = ResolvableFuture.create();

        /* renamed from: d */
        public boolean f31892d;

        /* renamed from: a */
        public void m58817a() {
            this.f31889a = null;
            this.f31890b = null;
            this.f31891c.set(null);
        }

        public void addCancellationListener(@NonNull Runnable runnable, @NonNull Executor executor) {
            ResolvableFuture resolvableFuture = this.f31891c;
            if (resolvableFuture != null) {
                resolvableFuture.addListener(runnable, executor);
            }
        }

        /* renamed from: b */
        public final void m58816b() {
            this.f31889a = null;
            this.f31890b = null;
            this.f31891c = null;
        }

        public void finalize() {
            ResolvableFuture resolvableFuture;
            C3665a c3665a = this.f31890b;
            if (c3665a != null && !c3665a.isDone()) {
                c3665a.m58813c(new FutureGarbageCollectedException("The completer object was garbage collected - this future would otherwise never complete. The tag was: " + this.f31889a));
            }
            if (!this.f31892d && (resolvableFuture = this.f31891c) != null) {
                resolvableFuture.set(null);
            }
        }

        public boolean set(T t) {
            boolean z = true;
            this.f31892d = true;
            C3665a c3665a = this.f31890b;
            z = (c3665a == null || !c3665a.m58814b(t)) ? false : false;
            if (z) {
                m58816b();
            }
            return z;
        }

        public boolean setCancelled() {
            boolean z = true;
            this.f31892d = true;
            C3665a c3665a = this.f31890b;
            z = (c3665a == null || !c3665a.m58815a(true)) ? false : false;
            if (z) {
                m58816b();
            }
            return z;
        }

        public boolean setException(@NonNull Throwable th2) {
            boolean z = true;
            this.f31892d = true;
            C3665a c3665a = this.f31890b;
            z = (c3665a == null || !c3665a.m58813c(th2)) ? false : false;
            if (z) {
                m58816b();
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
    public static final class C3665a implements ListenableFuture {

        /* renamed from: a */
        public final WeakReference f31893a;

        /* renamed from: b */
        public final AbstractResolvableFuture f31894b = new C3666a();

        /* renamed from: androidx.concurrent.futures.CallbackToFutureAdapter$a$a */
        /* loaded from: classes2.dex */
        public class C3666a extends AbstractResolvableFuture {
            public C3666a() {
            }

            @Override // androidx.concurrent.futures.AbstractResolvableFuture
            public String pendingToString() {
                Completer completer = (Completer) C3665a.this.f31893a.get();
                if (completer == null) {
                    return "Completer object has been garbage collected, future will fail soon";
                }
                return "tag=[" + completer.f31889a + "]";
            }
        }

        public C3665a(Completer completer) {
            this.f31893a = new WeakReference(completer);
        }

        /* renamed from: a */
        public boolean m58815a(boolean z) {
            return this.f31894b.cancel(z);
        }

        @Override // com.google.common.util.concurrent.ListenableFuture
        public void addListener(Runnable runnable, Executor executor) {
            this.f31894b.addListener(runnable, executor);
        }

        /* renamed from: b */
        public boolean m58814b(Object obj) {
            return this.f31894b.set(obj);
        }

        /* renamed from: c */
        public boolean m58813c(Throwable th2) {
            return this.f31894b.setException(th2);
        }

        @Override // java.util.concurrent.Future
        public boolean cancel(boolean z) {
            Completer completer = (Completer) this.f31893a.get();
            boolean cancel = this.f31894b.cancel(z);
            if (cancel && completer != null) {
                completer.m58817a();
            }
            return cancel;
        }

        @Override // java.util.concurrent.Future
        public Object get() {
            return this.f31894b.get();
        }

        @Override // java.util.concurrent.Future
        public boolean isCancelled() {
            return this.f31894b.isCancelled();
        }

        @Override // java.util.concurrent.Future
        public boolean isDone() {
            return this.f31894b.isDone();
        }

        public String toString() {
            return this.f31894b.toString();
        }

        @Override // java.util.concurrent.Future
        public Object get(long j, TimeUnit timeUnit) {
            return this.f31894b.get(j, timeUnit);
        }
    }

    @NonNull
    public static <T> ListenableFuture<T> getFuture(@NonNull Resolver<T> resolver) {
        Completer<T> completer = new Completer<>();
        C3665a c3665a = new C3665a(completer);
        completer.f31890b = c3665a;
        completer.f31889a = resolver.getClass();
        try {
            Object attachCompleter = resolver.attachCompleter(completer);
            if (attachCompleter != null) {
                completer.f31889a = attachCompleter;
            }
        } catch (Exception e) {
            c3665a.m58813c(e);
        }
        return c3665a;
    }
}

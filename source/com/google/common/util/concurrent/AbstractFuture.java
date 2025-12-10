package com.google.common.util.concurrent;

import com.google.common.annotations.GwtCompatible;
import com.google.common.base.Preconditions;
import com.google.common.base.Strings;
import com.google.common.util.concurrent.internal.InternalFutureFailureAccess;
import com.google.common.util.concurrent.internal.InternalFutures;
import com.google.errorprone.annotations.CanIgnoreReturnValue;
import com.google.errorprone.annotations.ForOverride;
import com.google.j2objc.annotations.ReflectionSupport;
import com.tom_roush.pdfbox.contentstream.operator.OperatorName;
import com.tom_roush.pdfbox.pdmodel.common.PDPageLabelRange;
import java.lang.reflect.Field;
import java.security.AccessController;
import java.security.PrivilegedActionException;
import java.security.PrivilegedExceptionAction;
import java.util.Locale;
import java.util.Objects;
import java.util.concurrent.CancellationException;
import java.util.concurrent.ExecutionException;
import java.util.concurrent.Executor;
import java.util.concurrent.Future;
import java.util.concurrent.ScheduledFuture;
import java.util.concurrent.TimeUnit;
import java.util.concurrent.TimeoutException;
import java.util.concurrent.atomic.AtomicReferenceFieldUpdater;
import java.util.concurrent.locks.LockSupport;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.annotation.CheckForNull;
import kotlinx.serialization.json.internal.AbstractJsonLexerKt;
import org.apache.commons.cli.HelpFormatter;
import sun.misc.Unsafe;
import th.p047co.dtac.android.dtacone.util.Constant;

@ReflectionSupport(ReflectionSupport.Level.FULL)
@GwtCompatible(emulated = true)
/* loaded from: classes4.dex */
public abstract class AbstractFuture<V> extends InternalFutureFailureAccess implements ListenableFuture<V> {

    /* renamed from: d */
    public static final boolean f54149d;

    /* renamed from: e */
    public static final C23005xi0 f54150e;

    /* renamed from: f */
    public static final AbstractC8180b f54151f;

    /* renamed from: g */
    public static final Object f54152g;

    /* renamed from: a */
    public volatile Object f54153a;

    /* renamed from: b */
    public volatile C8182d f54154b;

    /* renamed from: c */
    public volatile C8190k f54155c;

    /* loaded from: classes4.dex */
    public static final class Failure {

        /* renamed from: b */
        public static final Failure f54156b = new Failure(new Throwable("Failure occurred while trying to finish a future.") { // from class: com.google.common.util.concurrent.AbstractFuture.Failure.1
            @Override // java.lang.Throwable
            public synchronized Throwable fillInStackTrace() {
                return this;
            }
        });

        /* renamed from: a */
        public final Throwable f54157a;

        public Failure(Throwable th2) {
            this.f54157a = (Throwable) Preconditions.checkNotNull(th2);
        }
    }

    /* renamed from: com.google.common.util.concurrent.AbstractFuture$b */
    /* loaded from: classes4.dex */
    public static abstract class AbstractC8180b {
        public AbstractC8180b() {
        }

        /* renamed from: a */
        public abstract boolean mo39667a(AbstractFuture abstractFuture, C8182d c8182d, C8182d c8182d2);

        /* renamed from: b */
        public abstract boolean mo39666b(AbstractFuture abstractFuture, Object obj, Object obj2);

        /* renamed from: c */
        public abstract boolean mo39665c(AbstractFuture abstractFuture, C8190k c8190k, C8190k c8190k2);

        /* renamed from: d */
        public abstract C8182d mo39664d(AbstractFuture abstractFuture, C8182d c8182d);

        /* renamed from: e */
        public abstract C8190k mo39663e(AbstractFuture abstractFuture, C8190k c8190k);

        /* renamed from: f */
        public abstract void mo39662f(C8190k c8190k, C8190k c8190k2);

        /* renamed from: g */
        public abstract void mo39661g(C8190k c8190k, Thread thread);
    }

    /* renamed from: com.google.common.util.concurrent.AbstractFuture$c */
    /* loaded from: classes4.dex */
    public static final class C8181c {

        /* renamed from: c */
        public static final C8181c f54158c;

        /* renamed from: d */
        public static final C8181c f54159d;

        /* renamed from: a */
        public final boolean f54160a;

        /* renamed from: b */
        public final Throwable f54161b;

        static {
            if (AbstractFuture.f54149d) {
                f54159d = null;
                f54158c = null;
                return;
            }
            f54159d = new C8181c(false, null);
            f54158c = new C8181c(true, null);
        }

        public C8181c(boolean z, Throwable th2) {
            this.f54160a = z;
            this.f54161b = th2;
        }
    }

    /* renamed from: com.google.common.util.concurrent.AbstractFuture$e */
    /* loaded from: classes4.dex */
    public static final class C8183e extends AbstractC8180b {

        /* renamed from: a */
        public final AtomicReferenceFieldUpdater f54166a;

        /* renamed from: b */
        public final AtomicReferenceFieldUpdater f54167b;

        /* renamed from: c */
        public final AtomicReferenceFieldUpdater f54168c;

        /* renamed from: d */
        public final AtomicReferenceFieldUpdater f54169d;

        /* renamed from: e */
        public final AtomicReferenceFieldUpdater f54170e;

        public C8183e(AtomicReferenceFieldUpdater atomicReferenceFieldUpdater, AtomicReferenceFieldUpdater atomicReferenceFieldUpdater2, AtomicReferenceFieldUpdater atomicReferenceFieldUpdater3, AtomicReferenceFieldUpdater atomicReferenceFieldUpdater4, AtomicReferenceFieldUpdater atomicReferenceFieldUpdater5) {
            super();
            this.f54166a = atomicReferenceFieldUpdater;
            this.f54167b = atomicReferenceFieldUpdater2;
            this.f54168c = atomicReferenceFieldUpdater3;
            this.f54169d = atomicReferenceFieldUpdater4;
            this.f54170e = atomicReferenceFieldUpdater5;
        }

        @Override // com.google.common.util.concurrent.AbstractFuture.AbstractC8180b
        /* renamed from: a */
        public boolean mo39667a(AbstractFuture abstractFuture, C8182d c8182d, C8182d c8182d2) {
            return AbstractC13055p0.m23740a(this.f54169d, abstractFuture, c8182d, c8182d2);
        }

        @Override // com.google.common.util.concurrent.AbstractFuture.AbstractC8180b
        /* renamed from: b */
        public boolean mo39666b(AbstractFuture abstractFuture, Object obj, Object obj2) {
            return AbstractC13055p0.m23740a(this.f54170e, abstractFuture, obj, obj2);
        }

        @Override // com.google.common.util.concurrent.AbstractFuture.AbstractC8180b
        /* renamed from: c */
        public boolean mo39665c(AbstractFuture abstractFuture, C8190k c8190k, C8190k c8190k2) {
            return AbstractC13055p0.m23740a(this.f54168c, abstractFuture, c8190k, c8190k2);
        }

        @Override // com.google.common.util.concurrent.AbstractFuture.AbstractC8180b
        /* renamed from: d */
        public C8182d mo39664d(AbstractFuture abstractFuture, C8182d c8182d) {
            return (C8182d) this.f54169d.getAndSet(abstractFuture, c8182d);
        }

        @Override // com.google.common.util.concurrent.AbstractFuture.AbstractC8180b
        /* renamed from: e */
        public C8190k mo39663e(AbstractFuture abstractFuture, C8190k c8190k) {
            return (C8190k) this.f54168c.getAndSet(abstractFuture, c8190k);
        }

        @Override // com.google.common.util.concurrent.AbstractFuture.AbstractC8180b
        /* renamed from: f */
        public void mo39662f(C8190k c8190k, C8190k c8190k2) {
            this.f54167b.lazySet(c8190k, c8190k2);
        }

        @Override // com.google.common.util.concurrent.AbstractFuture.AbstractC8180b
        /* renamed from: g */
        public void mo39661g(C8190k c8190k, Thread thread) {
            this.f54166a.lazySet(c8190k, thread);
        }
    }

    /* renamed from: com.google.common.util.concurrent.AbstractFuture$f */
    /* loaded from: classes4.dex */
    public static final class RunnableC8184f implements Runnable {

        /* renamed from: a */
        public final AbstractFuture f54171a;

        /* renamed from: b */
        public final ListenableFuture f54172b;

        public RunnableC8184f(AbstractFuture abstractFuture, ListenableFuture listenableFuture) {
            this.f54171a = abstractFuture;
            this.f54172b = listenableFuture;
        }

        @Override // java.lang.Runnable
        public void run() {
            if (this.f54171a.f54153a == this) {
                if (AbstractFuture.f54151f.mo39666b(this.f54171a, this, AbstractFuture.m39672u(this.f54172b))) {
                    AbstractFuture.m39675r(this.f54171a, false);
                }
            }
        }
    }

    /* renamed from: com.google.common.util.concurrent.AbstractFuture$g */
    /* loaded from: classes4.dex */
    public static final class C8185g extends AbstractC8180b {
        public C8185g() {
            super();
        }

        @Override // com.google.common.util.concurrent.AbstractFuture.AbstractC8180b
        /* renamed from: a */
        public boolean mo39667a(AbstractFuture abstractFuture, C8182d c8182d, C8182d c8182d2) {
            synchronized (abstractFuture) {
                try {
                    if (abstractFuture.f54154b == c8182d) {
                        abstractFuture.f54154b = c8182d2;
                        return true;
                    }
                    return false;
                } catch (Throwable th2) {
                    throw th2;
                }
            }
        }

        @Override // com.google.common.util.concurrent.AbstractFuture.AbstractC8180b
        /* renamed from: b */
        public boolean mo39666b(AbstractFuture abstractFuture, Object obj, Object obj2) {
            synchronized (abstractFuture) {
                try {
                    if (abstractFuture.f54153a == obj) {
                        abstractFuture.f54153a = obj2;
                        return true;
                    }
                    return false;
                } catch (Throwable th2) {
                    throw th2;
                }
            }
        }

        @Override // com.google.common.util.concurrent.AbstractFuture.AbstractC8180b
        /* renamed from: c */
        public boolean mo39665c(AbstractFuture abstractFuture, C8190k c8190k, C8190k c8190k2) {
            synchronized (abstractFuture) {
                try {
                    if (abstractFuture.f54155c == c8190k) {
                        abstractFuture.f54155c = c8190k2;
                        return true;
                    }
                    return false;
                } catch (Throwable th2) {
                    throw th2;
                }
            }
        }

        @Override // com.google.common.util.concurrent.AbstractFuture.AbstractC8180b
        /* renamed from: d */
        public C8182d mo39664d(AbstractFuture abstractFuture, C8182d c8182d) {
            C8182d c8182d2;
            synchronized (abstractFuture) {
                try {
                    c8182d2 = abstractFuture.f54154b;
                    if (c8182d2 != c8182d) {
                        abstractFuture.f54154b = c8182d;
                    }
                } catch (Throwable th2) {
                    throw th2;
                }
            }
            return c8182d2;
        }

        @Override // com.google.common.util.concurrent.AbstractFuture.AbstractC8180b
        /* renamed from: e */
        public C8190k mo39663e(AbstractFuture abstractFuture, C8190k c8190k) {
            C8190k c8190k2;
            synchronized (abstractFuture) {
                try {
                    c8190k2 = abstractFuture.f54155c;
                    if (c8190k2 != c8190k) {
                        abstractFuture.f54155c = c8190k;
                    }
                } catch (Throwable th2) {
                    throw th2;
                }
            }
            return c8190k2;
        }

        @Override // com.google.common.util.concurrent.AbstractFuture.AbstractC8180b
        /* renamed from: f */
        public void mo39662f(C8190k c8190k, C8190k c8190k2) {
            c8190k.f54181b = c8190k2;
        }

        @Override // com.google.common.util.concurrent.AbstractFuture.AbstractC8180b
        /* renamed from: g */
        public void mo39661g(C8190k c8190k, Thread thread) {
            c8190k.f54180a = thread;
        }
    }

    /* renamed from: com.google.common.util.concurrent.AbstractFuture$h */
    /* loaded from: classes4.dex */
    public interface InterfaceC8186h extends ListenableFuture {
    }

    /* renamed from: com.google.common.util.concurrent.AbstractFuture$i */
    /* loaded from: classes4.dex */
    public static abstract class AbstractC8187i extends AbstractFuture implements InterfaceC8186h {
        @Override // com.google.common.util.concurrent.AbstractFuture, com.google.common.util.concurrent.ListenableFuture
        public final void addListener(Runnable runnable, Executor executor) {
            super.addListener(runnable, executor);
        }

        @Override // com.google.common.util.concurrent.AbstractFuture, java.util.concurrent.Future
        @CanIgnoreReturnValue
        public final boolean cancel(boolean z) {
            return super.cancel(z);
        }

        @Override // com.google.common.util.concurrent.AbstractFuture, java.util.concurrent.Future
        @CanIgnoreReturnValue
        public final Object get() throws InterruptedException, ExecutionException {
            return super.get();
        }

        @Override // com.google.common.util.concurrent.AbstractFuture, java.util.concurrent.Future
        public final boolean isCancelled() {
            return super.isCancelled();
        }

        @Override // com.google.common.util.concurrent.AbstractFuture, java.util.concurrent.Future
        public final boolean isDone() {
            return super.isDone();
        }

        @Override // com.google.common.util.concurrent.AbstractFuture, java.util.concurrent.Future
        @CanIgnoreReturnValue
        public final Object get(long j, TimeUnit timeUnit) throws InterruptedException, ExecutionException, TimeoutException {
            return super.get(j, timeUnit);
        }
    }

    /* renamed from: com.google.common.util.concurrent.AbstractFuture$j */
    /* loaded from: classes4.dex */
    public static final class C8188j extends AbstractC8180b {

        /* renamed from: a */
        public static final Unsafe f54173a;

        /* renamed from: b */
        public static final long f54174b;

        /* renamed from: c */
        public static final long f54175c;

        /* renamed from: d */
        public static final long f54176d;

        /* renamed from: e */
        public static final long f54177e;

        /* renamed from: f */
        public static final long f54178f;

        /* renamed from: com.google.common.util.concurrent.AbstractFuture$j$a */
        /* loaded from: classes4.dex */
        public class C8189a implements PrivilegedExceptionAction {
            @Override // java.security.PrivilegedExceptionAction
            /* renamed from: a */
            public Unsafe run() {
                Field[] declaredFields;
                for (Field field : Unsafe.class.getDeclaredFields()) {
                    field.setAccessible(true);
                    Object obj = field.get(null);
                    if (Unsafe.class.isInstance(obj)) {
                        return (Unsafe) Unsafe.class.cast(obj);
                    }
                }
                throw new NoSuchFieldError("the Unsafe");
            }
        }

        static {
            Unsafe unsafe;
            try {
                try {
                    unsafe = Unsafe.getUnsafe();
                } catch (SecurityException unused) {
                    unsafe = (Unsafe) AccessController.doPrivileged(new C8189a());
                }
                try {
                    f54175c = unsafe.objectFieldOffset(AbstractFuture.class.getDeclaredField(OperatorName.CURVE_TO));
                    f54174b = unsafe.objectFieldOffset(AbstractFuture.class.getDeclaredField(OperatorName.CLOSE_FILL_NON_ZERO_AND_STROKE));
                    f54176d = unsafe.objectFieldOffset(AbstractFuture.class.getDeclaredField(PDPageLabelRange.STYLE_LETTERS_LOWER));
                    f54177e = unsafe.objectFieldOffset(C8190k.class.getDeclaredField(PDPageLabelRange.STYLE_LETTERS_LOWER));
                    f54178f = unsafe.objectFieldOffset(C8190k.class.getDeclaredField(OperatorName.CLOSE_FILL_NON_ZERO_AND_STROKE));
                    f54173a = unsafe;
                } catch (NoSuchFieldException e) {
                    throw new RuntimeException(e);
                }
            } catch (PrivilegedActionException e2) {
                throw new RuntimeException("Could not initialize intrinsics", e2.getCause());
            }
        }

        public C8188j() {
            super();
        }

        @Override // com.google.common.util.concurrent.AbstractFuture.AbstractC8180b
        /* renamed from: a */
        public boolean mo39667a(AbstractFuture abstractFuture, C8182d c8182d, C8182d c8182d2) {
            return AbstractC18317Qk2.m66527a(f54173a, abstractFuture, f54174b, c8182d, c8182d2);
        }

        @Override // com.google.common.util.concurrent.AbstractFuture.AbstractC8180b
        /* renamed from: b */
        public boolean mo39666b(AbstractFuture abstractFuture, Object obj, Object obj2) {
            return AbstractC18317Qk2.m66527a(f54173a, abstractFuture, f54176d, obj, obj2);
        }

        @Override // com.google.common.util.concurrent.AbstractFuture.AbstractC8180b
        /* renamed from: c */
        public boolean mo39665c(AbstractFuture abstractFuture, C8190k c8190k, C8190k c8190k2) {
            return AbstractC18317Qk2.m66527a(f54173a, abstractFuture, f54175c, c8190k, c8190k2);
        }

        @Override // com.google.common.util.concurrent.AbstractFuture.AbstractC8180b
        /* renamed from: d */
        public C8182d mo39664d(AbstractFuture abstractFuture, C8182d c8182d) {
            C8182d c8182d2;
            do {
                c8182d2 = abstractFuture.f54154b;
                if (c8182d == c8182d2) {
                    return c8182d2;
                }
            } while (!mo39667a(abstractFuture, c8182d2, c8182d));
            return c8182d2;
        }

        @Override // com.google.common.util.concurrent.AbstractFuture.AbstractC8180b
        /* renamed from: e */
        public C8190k mo39663e(AbstractFuture abstractFuture, C8190k c8190k) {
            C8190k c8190k2;
            do {
                c8190k2 = abstractFuture.f54155c;
                if (c8190k == c8190k2) {
                    return c8190k2;
                }
            } while (!mo39665c(abstractFuture, c8190k2, c8190k));
            return c8190k2;
        }

        @Override // com.google.common.util.concurrent.AbstractFuture.AbstractC8180b
        /* renamed from: f */
        public void mo39662f(C8190k c8190k, C8190k c8190k2) {
            f54173a.putObject(c8190k, f54178f, c8190k2);
        }

        @Override // com.google.common.util.concurrent.AbstractFuture.AbstractC8180b
        /* renamed from: g */
        public void mo39661g(C8190k c8190k, Thread thread) {
            f54173a.putObject(c8190k, f54177e, thread);
        }
    }

    /* renamed from: com.google.common.util.concurrent.AbstractFuture$k */
    /* loaded from: classes4.dex */
    public static final class C8190k {

        /* renamed from: c */
        public static final C8190k f54179c = new C8190k(false);

        /* renamed from: a */
        public volatile Thread f54180a;

        /* renamed from: b */
        public volatile C8190k f54181b;

        public C8190k(boolean z) {
        }

        /* renamed from: a */
        public void m39659a(C8190k c8190k) {
            AbstractFuture.f54151f.mo39662f(this, c8190k);
        }

        /* renamed from: b */
        public void m39658b() {
            Thread thread = this.f54180a;
            if (thread != null) {
                this.f54180a = null;
                LockSupport.unpark(thread);
            }
        }

        public C8190k() {
            AbstractFuture.f54151f.mo39661g(this, Thread.currentThread());
        }
    }

    static {
        boolean z;
        AbstractC8180b c8185g;
        try {
            z = Boolean.parseBoolean(System.getProperty("guava.concurrent.generate_cancellation_cause", "false"));
        } catch (SecurityException unused) {
            z = false;
        }
        f54149d = z;
        f54150e = new C23005xi0(AbstractFuture.class);
        Throwable th2 = null;
        try {
            c8185g = new C8188j();
            e = null;
        } catch (Error | Exception e) {
            e = e;
            try {
                c8185g = new C8183e(AtomicReferenceFieldUpdater.newUpdater(C8190k.class, Thread.class, PDPageLabelRange.STYLE_LETTERS_LOWER), AtomicReferenceFieldUpdater.newUpdater(C8190k.class, C8190k.class, OperatorName.CLOSE_FILL_NON_ZERO_AND_STROKE), AtomicReferenceFieldUpdater.newUpdater(AbstractFuture.class, C8190k.class, OperatorName.CURVE_TO), AtomicReferenceFieldUpdater.newUpdater(AbstractFuture.class, C8182d.class, OperatorName.CLOSE_FILL_NON_ZERO_AND_STROKE), AtomicReferenceFieldUpdater.newUpdater(AbstractFuture.class, Object.class, PDPageLabelRange.STYLE_LETTERS_LOWER));
            } catch (Error | Exception e2) {
                c8185g = new C8185g();
                th2 = e2;
            }
        }
        f54151f = c8185g;
        if (th2 != null) {
            C23005xi0 c23005xi0 = f54150e;
            Logger m405a = c23005xi0.m405a();
            Level level = Level.SEVERE;
            m405a.log(level, "UnsafeAtomicHelper is broken!", e);
            c23005xi0.m405a().log(level, "SafeAtomicHelper is broken!", th2);
        }
        f54152g = new Object();
    }

    /* renamed from: p */
    public static CancellationException m39677p(String str, Throwable th2) {
        CancellationException cancellationException = new CancellationException(str);
        cancellationException.initCause(th2);
        return cancellationException;
    }

    /* renamed from: r */
    public static void m39675r(AbstractFuture abstractFuture, boolean z) {
        C8182d c8182d = null;
        while (true) {
            abstractFuture.m39669x();
            if (z) {
                abstractFuture.interruptTask();
                z = false;
            }
            abstractFuture.afterDone();
            C8182d m39676q = abstractFuture.m39676q(c8182d);
            while (m39676q != null) {
                c8182d = m39676q.f54165c;
                Runnable runnable = m39676q.f54163a;
                Objects.requireNonNull(runnable);
                Runnable runnable2 = runnable;
                if (runnable2 instanceof RunnableC8184f) {
                    RunnableC8184f runnableC8184f = (RunnableC8184f) runnable2;
                    abstractFuture = runnableC8184f.f54171a;
                    if (abstractFuture.f54153a == runnableC8184f) {
                        if (f54151f.mo39666b(abstractFuture, runnableC8184f, m39672u(runnableC8184f.f54172b))) {
                            break;
                        }
                    } else {
                        continue;
                    }
                } else {
                    Executor executor = m39676q.f54164b;
                    Objects.requireNonNull(executor);
                    m39674s(runnable2, executor);
                }
                m39676q = c8182d;
            }
            return;
        }
    }

    /* renamed from: s */
    public static void m39674s(Runnable runnable, Executor executor) {
        try {
            executor.execute(runnable);
        } catch (Exception e) {
            Logger m405a = f54150e.m405a();
            Level level = Level.SEVERE;
            m405a.log(level, "RuntimeException while executing runnable " + runnable + " with executor " + executor, (Throwable) e);
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: u */
    public static Object m39672u(ListenableFuture listenableFuture) {
        Throwable tryInternalFastPathGetFailure;
        if (listenableFuture instanceof InterfaceC8186h) {
            Object obj = ((AbstractFuture) listenableFuture).f54153a;
            if (obj instanceof C8181c) {
                C8181c c8181c = (C8181c) obj;
                if (c8181c.f54160a) {
                    obj = c8181c.f54161b != null ? new C8181c(false, c8181c.f54161b) : C8181c.f54159d;
                }
            }
            Objects.requireNonNull(obj);
            return obj;
        } else if ((listenableFuture instanceof InternalFutureFailureAccess) && (tryInternalFastPathGetFailure = InternalFutures.tryInternalFastPathGetFailure((InternalFutureFailureAccess) listenableFuture)) != null) {
            return new Failure(tryInternalFastPathGetFailure);
        } else {
            boolean isCancelled = listenableFuture.isCancelled();
            if ((!f54149d) & isCancelled) {
                C8181c c8181c2 = C8181c.f54159d;
                Objects.requireNonNull(c8181c2);
                return c8181c2;
            }
            try {
                Object m39671v = m39671v(listenableFuture);
                if (isCancelled) {
                    return new C8181c(false, new IllegalArgumentException("get() did not throw CancellationException, despite reporting isCancelled() == true: " + listenableFuture));
                } else if (m39671v == null) {
                    return f54152g;
                } else {
                    return m39671v;
                }
            } catch (Error e) {
                e = e;
                return new Failure(e);
            } catch (CancellationException e2) {
                if (!isCancelled) {
                    return new Failure(new IllegalArgumentException("get() threw CancellationException, despite reporting isCancelled() == false: " + listenableFuture, e2));
                }
                return new C8181c(false, e2);
            } catch (ExecutionException e3) {
                if (isCancelled) {
                    return new C8181c(false, new IllegalArgumentException("get() did not throw CancellationException, despite reporting isCancelled() == true: " + listenableFuture, e3));
                }
                return new Failure(e3.getCause());
            } catch (Exception e4) {
                e = e4;
                return new Failure(e);
            }
        }
    }

    /* renamed from: v */
    private static Object m39671v(Future future) {
        Object obj;
        boolean z = false;
        while (true) {
            try {
                obj = future.get();
                break;
            } catch (InterruptedException unused) {
                z = true;
            } catch (Throwable th2) {
                if (z) {
                    Thread.currentThread().interrupt();
                }
                throw th2;
            }
        }
        if (z) {
            Thread.currentThread().interrupt();
        }
        return obj;
    }

    public void addListener(Runnable runnable, Executor executor) {
        C8182d c8182d;
        Preconditions.checkNotNull(runnable, "Runnable was null.");
        Preconditions.checkNotNull(executor, "Executor was null.");
        if (!isDone() && (c8182d = this.f54154b) != C8182d.f54162d) {
            C8182d c8182d2 = new C8182d(runnable, executor);
            do {
                c8182d2.f54165c = c8182d;
                if (f54151f.mo39667a(this, c8182d, c8182d2)) {
                    return;
                }
                c8182d = this.f54154b;
            } while (c8182d != C8182d.f54162d);
            m39674s(runnable, executor);
        }
        m39674s(runnable, executor);
    }

    @ForOverride
    public void afterDone() {
    }

    @CanIgnoreReturnValue
    public boolean cancel(boolean z) {
        boolean z2;
        C8181c c8181c;
        boolean z3;
        Object obj = this.f54153a;
        if (obj == null) {
            z2 = true;
        } else {
            z2 = false;
        }
        if (z2 | (obj instanceof RunnableC8184f)) {
            if (f54149d) {
                c8181c = new C8181c(z, new CancellationException("Future.cancel() was called."));
            } else {
                if (z) {
                    c8181c = C8181c.f54158c;
                } else {
                    c8181c = C8181c.f54159d;
                }
                Objects.requireNonNull(c8181c);
            }
            boolean z4 = false;
            AbstractFuture<V> abstractFuture = this;
            while (true) {
                if (f54151f.mo39666b(abstractFuture, obj, c8181c)) {
                    m39675r(abstractFuture, z);
                    if (!(obj instanceof RunnableC8184f)) {
                        return true;
                    }
                    ListenableFuture listenableFuture = ((RunnableC8184f) obj).f54172b;
                    if (listenableFuture instanceof InterfaceC8186h) {
                        abstractFuture = (AbstractFuture) listenableFuture;
                        obj = abstractFuture.f54153a;
                        if (obj == null) {
                            z3 = true;
                        } else {
                            z3 = false;
                        }
                        if (!(z3 | (obj instanceof RunnableC8184f))) {
                            return true;
                        }
                        z4 = true;
                    } else {
                        listenableFuture.cancel(z);
                        return true;
                    }
                } else {
                    obj = abstractFuture.f54153a;
                    if (!(obj instanceof RunnableC8184f)) {
                        return z4;
                    }
                }
            }
        } else {
            return false;
        }
    }

    @CanIgnoreReturnValue
    public V get(long j, TimeUnit timeUnit) throws InterruptedException, TimeoutException, ExecutionException {
        Locale locale;
        long nanos = timeUnit.toNanos(j);
        if (!Thread.interrupted()) {
            Object obj = this.f54153a;
            if ((obj != null) & (!(obj instanceof RunnableC8184f))) {
                return (V) m39673t(obj);
            }
            long nanoTime = nanos > 0 ? System.nanoTime() + nanos : 0L;
            if (nanos >= 1000) {
                C8190k c8190k = this.f54155c;
                if (c8190k != C8190k.f54179c) {
                    C8190k c8190k2 = new C8190k();
                    do {
                        c8190k2.m39659a(c8190k);
                        if (f54151f.mo39665c(this, c8190k, c8190k2)) {
                            do {
                                AbstractC18112Ng1.m67202a(this, nanos);
                                if (!Thread.interrupted()) {
                                    Object obj2 = this.f54153a;
                                    if ((obj2 != null) & (!(obj2 instanceof RunnableC8184f))) {
                                        return (V) m39673t(obj2);
                                    }
                                    nanos = nanoTime - System.nanoTime();
                                } else {
                                    m39668y(c8190k2);
                                    throw new InterruptedException();
                                }
                            } while (nanos >= 1000);
                            m39668y(c8190k2);
                        } else {
                            c8190k = this.f54155c;
                        }
                    } while (c8190k != C8190k.f54179c);
                    Object obj3 = this.f54153a;
                    Objects.requireNonNull(obj3);
                    return (V) m39673t(obj3);
                }
                Object obj32 = this.f54153a;
                Objects.requireNonNull(obj32);
                return (V) m39673t(obj32);
            }
            while (nanos > 0) {
                Object obj4 = this.f54153a;
                if ((obj4 != null) & (!(obj4 instanceof RunnableC8184f))) {
                    return (V) m39673t(obj4);
                }
                if (!Thread.interrupted()) {
                    nanos = nanoTime - System.nanoTime();
                } else {
                    throw new InterruptedException();
                }
            }
            String abstractFuture = toString();
            String lowerCase = timeUnit.toString().toLowerCase(Locale.ROOT);
            String str = "Waited " + j + HelpFormatter.DEFAULT_LONG_OPT_SEPARATOR + timeUnit.toString().toLowerCase(locale);
            if (nanos + 1000 < 0) {
                String str2 = str + " (plus ";
                long j2 = -nanos;
                long convert = timeUnit.convert(j2, TimeUnit.NANOSECONDS);
                long nanos2 = j2 - timeUnit.toNanos(convert);
                int i = (convert > 0L ? 1 : (convert == 0L ? 0 : -1));
                boolean z = i == 0 || nanos2 > 1000;
                if (i > 0) {
                    String str3 = str2 + convert + HelpFormatter.DEFAULT_LONG_OPT_SEPARATOR + lowerCase;
                    if (z) {
                        str3 = str3 + ",";
                    }
                    str2 = str3 + HelpFormatter.DEFAULT_LONG_OPT_SEPARATOR;
                }
                if (z) {
                    str2 = str2 + nanos2 + " nanoseconds ";
                }
                str = str2 + "delay)";
            }
            if (isDone()) {
                throw new TimeoutException(str + " but future completed as timeout expired");
            }
            throw new TimeoutException(str + " for " + abstractFuture);
        }
        throw new InterruptedException();
    }

    public void interruptTask() {
    }

    public boolean isCancelled() {
        return this.f54153a instanceof C8181c;
    }

    public boolean isDone() {
        boolean z;
        Object obj = this.f54153a;
        if (obj != null) {
            z = true;
        } else {
            z = false;
        }
        return (!(obj instanceof RunnableC8184f)) & z;
    }

    /* renamed from: l */
    public final void m39681l(StringBuilder sb) {
        try {
            Object m39671v = m39671v(this);
            sb.append("SUCCESS, result=[");
            m39679n(sb, m39671v);
            sb.append("]");
        } catch (CancellationException unused) {
            sb.append(Constant.QueryTransactionStatus.CANCELLED);
        } catch (ExecutionException e) {
            sb.append("FAILURE, cause=[");
            sb.append(e.getCause());
            sb.append("]");
        } catch (Exception e2) {
            sb.append("UNKNOWN, cause=[");
            sb.append(e2.getClass());
            sb.append(" thrown from get()]");
        }
    }

    /* renamed from: m */
    public final void m39680m(StringBuilder sb) {
        String str;
        int length = sb.length();
        sb.append("PENDING");
        Object obj = this.f54153a;
        if (obj instanceof RunnableC8184f) {
            sb.append(", setFuture=[");
            m39678o(sb, ((RunnableC8184f) obj).f54172b);
            sb.append("]");
        } else {
            try {
                str = Strings.emptyToNull(pendingToString());
            } catch (Exception | StackOverflowError e) {
                str = "Exception thrown from implementation: " + e.getClass();
            }
            if (str != null) {
                sb.append(", info=[");
                sb.append(str);
                sb.append("]");
            }
        }
        if (isDone()) {
            sb.delete(length, sb.length());
            m39681l(sb);
        }
    }

    /* renamed from: n */
    public final void m39679n(StringBuilder sb, Object obj) {
        if (obj == null) {
            sb.append(AbstractJsonLexerKt.NULL);
        } else if (obj == this) {
            sb.append("this future");
        } else {
            sb.append(obj.getClass().getName());
            sb.append("@");
            sb.append(Integer.toHexString(System.identityHashCode(obj)));
        }
    }

    /* renamed from: o */
    public final void m39678o(StringBuilder sb, Object obj) {
        try {
            if (obj == this) {
                sb.append("this future");
            } else {
                sb.append(obj);
            }
        } catch (Exception e) {
            e = e;
            sb.append("Exception thrown from implementation: ");
            sb.append(e.getClass());
        } catch (StackOverflowError e2) {
            e = e2;
            sb.append("Exception thrown from implementation: ");
            sb.append(e.getClass());
        }
    }

    @CheckForNull
    public String pendingToString() {
        if (this instanceof ScheduledFuture) {
            return "remaining delay=[" + ((ScheduledFuture) this).getDelay(TimeUnit.MILLISECONDS) + " ms]";
        }
        return null;
    }

    /* renamed from: q */
    public final C8182d m39676q(C8182d c8182d) {
        C8182d c8182d2 = c8182d;
        C8182d mo39664d = f54151f.mo39664d(this, C8182d.f54162d);
        while (mo39664d != null) {
            C8182d c8182d3 = mo39664d.f54165c;
            mo39664d.f54165c = c8182d2;
            c8182d2 = mo39664d;
            mo39664d = c8182d3;
        }
        return c8182d2;
    }

    @CanIgnoreReturnValue
    public boolean set(V v) {
        if (v == null) {
            v = (V) f54152g;
        }
        if (!f54151f.mo39666b(this, null, v)) {
            return false;
        }
        m39675r(this, false);
        return true;
    }

    @CanIgnoreReturnValue
    public boolean setException(Throwable th2) {
        if (!f54151f.mo39666b(this, null, new Failure((Throwable) Preconditions.checkNotNull(th2)))) {
            return false;
        }
        m39675r(this, false);
        return true;
    }

    @CanIgnoreReturnValue
    public boolean setFuture(ListenableFuture<? extends V> listenableFuture) {
        Failure failure;
        Preconditions.checkNotNull(listenableFuture);
        Object obj = this.f54153a;
        if (obj == null) {
            if (listenableFuture.isDone()) {
                if (!f54151f.mo39666b(this, null, m39672u(listenableFuture))) {
                    return false;
                }
                m39675r(this, false);
                return true;
            }
            RunnableC8184f runnableC8184f = new RunnableC8184f(this, listenableFuture);
            if (f54151f.mo39666b(this, null, runnableC8184f)) {
                try {
                    listenableFuture.addListener(runnableC8184f, DirectExecutor.INSTANCE);
                } catch (Throwable th2) {
                    try {
                        failure = new Failure(th2);
                    } catch (Error | Exception unused) {
                        failure = Failure.f54156b;
                    }
                    f54151f.mo39666b(this, runnableC8184f, failure);
                }
                return true;
            }
            obj = this.f54153a;
        }
        if (obj instanceof C8181c) {
            listenableFuture.cancel(((C8181c) obj).f54160a);
        }
        return false;
    }

    /* renamed from: t */
    public final Object m39673t(Object obj) {
        if (!(obj instanceof C8181c)) {
            if (!(obj instanceof Failure)) {
                if (obj == f54152g) {
                    return AbstractC21568pJ0.m23708b();
                }
                return obj;
            }
            throw new ExecutionException(((Failure) obj).f54157a);
        }
        throw m39677p("Task was cancelled.", ((C8181c) obj).f54161b);
    }

    public String toString() {
        StringBuilder sb = new StringBuilder();
        if (getClass().getName().startsWith("com.google.common.util.concurrent.")) {
            sb.append(getClass().getSimpleName());
        } else {
            sb.append(getClass().getName());
        }
        sb.append('@');
        sb.append(Integer.toHexString(System.identityHashCode(this)));
        sb.append("[status=");
        if (isCancelled()) {
            sb.append(Constant.QueryTransactionStatus.CANCELLED);
        } else if (isDone()) {
            m39681l(sb);
        } else {
            m39680m(sb);
        }
        sb.append("]");
        return sb.toString();
    }

    @Override // com.google.common.util.concurrent.internal.InternalFutureFailureAccess
    @CheckForNull
    public final Throwable tryInternalFastPathGetFailure() {
        if (this instanceof InterfaceC8186h) {
            Object obj = this.f54153a;
            if (obj instanceof Failure) {
                return ((Failure) obj).f54157a;
            }
            return null;
        }
        return null;
    }

    /* renamed from: w */
    public final void m39670w(Future future) {
        boolean z;
        if (future != null) {
            z = true;
        } else {
            z = false;
        }
        if (z & isCancelled()) {
            future.cancel(wasInterrupted());
        }
    }

    public final boolean wasInterrupted() {
        Object obj = this.f54153a;
        if ((obj instanceof C8181c) && ((C8181c) obj).f54160a) {
            return true;
        }
        return false;
    }

    /* renamed from: x */
    public final void m39669x() {
        for (C8190k mo39663e = f54151f.mo39663e(this, C8190k.f54179c); mo39663e != null; mo39663e = mo39663e.f54181b) {
            mo39663e.m39658b();
        }
    }

    /* renamed from: y */
    public final void m39668y(C8190k c8190k) {
        c8190k.f54180a = null;
        while (true) {
            C8190k c8190k2 = this.f54155c;
            if (c8190k2 == C8190k.f54179c) {
                return;
            }
            C8190k c8190k3 = null;
            while (c8190k2 != null) {
                C8190k c8190k4 = c8190k2.f54181b;
                if (c8190k2.f54180a != null) {
                    c8190k3 = c8190k2;
                } else if (c8190k3 != null) {
                    c8190k3.f54181b = c8190k4;
                    if (c8190k3.f54180a == null) {
                        break;
                    }
                } else if (!f54151f.mo39665c(this, c8190k2, c8190k4)) {
                    break;
                }
                c8190k2 = c8190k4;
            }
            return;
        }
    }

    /* renamed from: com.google.common.util.concurrent.AbstractFuture$d */
    /* loaded from: classes4.dex */
    public static final class C8182d {

        /* renamed from: d */
        public static final C8182d f54162d = new C8182d();

        /* renamed from: a */
        public final Runnable f54163a;

        /* renamed from: b */
        public final Executor f54164b;

        /* renamed from: c */
        public C8182d f54165c;

        public C8182d(Runnable runnable, Executor executor) {
            this.f54163a = runnable;
            this.f54164b = executor;
        }

        public C8182d() {
            this.f54163a = null;
            this.f54164b = null;
        }
    }

    @CanIgnoreReturnValue
    public V get() throws InterruptedException, ExecutionException {
        Object obj;
        if (!Thread.interrupted()) {
            Object obj2 = this.f54153a;
            if ((obj2 != null) & (!(obj2 instanceof RunnableC8184f))) {
                return (V) m39673t(obj2);
            }
            C8190k c8190k = this.f54155c;
            if (c8190k != C8190k.f54179c) {
                C8190k c8190k2 = new C8190k();
                do {
                    c8190k2.m39659a(c8190k);
                    if (f54151f.mo39665c(this, c8190k, c8190k2)) {
                        do {
                            LockSupport.park(this);
                            if (!Thread.interrupted()) {
                                obj = this.f54153a;
                            } else {
                                m39668y(c8190k2);
                                throw new InterruptedException();
                            }
                        } while (!((obj != null) & (!(obj instanceof RunnableC8184f))));
                        return (V) m39673t(obj);
                    }
                    c8190k = this.f54155c;
                } while (c8190k != C8190k.f54179c);
                Object obj3 = this.f54153a;
                Objects.requireNonNull(obj3);
                return (V) m39673t(obj3);
            }
            Object obj32 = this.f54153a;
            Objects.requireNonNull(obj32);
            return (V) m39673t(obj32);
        }
        throw new InterruptedException();
    }
}

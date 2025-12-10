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
    public static final boolean f54161d;

    /* renamed from: e */
    public static final C17503Di0 f54162e;

    /* renamed from: f */
    public static final AbstractC8169b f54163f;

    /* renamed from: g */
    public static final Object f54164g;

    /* renamed from: a */
    public volatile Object f54165a;

    /* renamed from: b */
    public volatile C8171d f54166b;

    /* renamed from: c */
    public volatile C8179k f54167c;

    /* loaded from: classes4.dex */
    public static final class Failure {

        /* renamed from: b */
        public static final Failure f54168b = new Failure(new Throwable("Failure occurred while trying to finish a future.") { // from class: com.google.common.util.concurrent.AbstractFuture.Failure.1
            @Override // java.lang.Throwable
            public synchronized Throwable fillInStackTrace() {
                return this;
            }
        });

        /* renamed from: a */
        public final Throwable f54169a;

        public Failure(Throwable th2) {
            this.f54169a = (Throwable) Preconditions.checkNotNull(th2);
        }
    }

    /* renamed from: com.google.common.util.concurrent.AbstractFuture$b */
    /* loaded from: classes4.dex */
    public static abstract class AbstractC8169b {
        public AbstractC8169b() {
        }

        /* renamed from: a */
        public abstract boolean mo39659a(AbstractFuture abstractFuture, C8171d c8171d, C8171d c8171d2);

        /* renamed from: b */
        public abstract boolean mo39658b(AbstractFuture abstractFuture, Object obj, Object obj2);

        /* renamed from: c */
        public abstract boolean mo39657c(AbstractFuture abstractFuture, C8179k c8179k, C8179k c8179k2);

        /* renamed from: d */
        public abstract C8171d mo39656d(AbstractFuture abstractFuture, C8171d c8171d);

        /* renamed from: e */
        public abstract C8179k mo39655e(AbstractFuture abstractFuture, C8179k c8179k);

        /* renamed from: f */
        public abstract void mo39654f(C8179k c8179k, C8179k c8179k2);

        /* renamed from: g */
        public abstract void mo39653g(C8179k c8179k, Thread thread);
    }

    /* renamed from: com.google.common.util.concurrent.AbstractFuture$c */
    /* loaded from: classes4.dex */
    public static final class C8170c {

        /* renamed from: c */
        public static final C8170c f54170c;

        /* renamed from: d */
        public static final C8170c f54171d;

        /* renamed from: a */
        public final boolean f54172a;

        /* renamed from: b */
        public final Throwable f54173b;

        static {
            if (AbstractFuture.f54161d) {
                f54171d = null;
                f54170c = null;
                return;
            }
            f54171d = new C8170c(false, null);
            f54170c = new C8170c(true, null);
        }

        public C8170c(boolean z, Throwable th2) {
            this.f54172a = z;
            this.f54173b = th2;
        }
    }

    /* renamed from: com.google.common.util.concurrent.AbstractFuture$e */
    /* loaded from: classes4.dex */
    public static final class C8172e extends AbstractC8169b {

        /* renamed from: a */
        public final AtomicReferenceFieldUpdater f54178a;

        /* renamed from: b */
        public final AtomicReferenceFieldUpdater f54179b;

        /* renamed from: c */
        public final AtomicReferenceFieldUpdater f54180c;

        /* renamed from: d */
        public final AtomicReferenceFieldUpdater f54181d;

        /* renamed from: e */
        public final AtomicReferenceFieldUpdater f54182e;

        public C8172e(AtomicReferenceFieldUpdater atomicReferenceFieldUpdater, AtomicReferenceFieldUpdater atomicReferenceFieldUpdater2, AtomicReferenceFieldUpdater atomicReferenceFieldUpdater3, AtomicReferenceFieldUpdater atomicReferenceFieldUpdater4, AtomicReferenceFieldUpdater atomicReferenceFieldUpdater5) {
            super();
            this.f54178a = atomicReferenceFieldUpdater;
            this.f54179b = atomicReferenceFieldUpdater2;
            this.f54180c = atomicReferenceFieldUpdater3;
            this.f54181d = atomicReferenceFieldUpdater4;
            this.f54182e = atomicReferenceFieldUpdater5;
        }

        @Override // com.google.common.util.concurrent.AbstractFuture.AbstractC8169b
        /* renamed from: a */
        public boolean mo39659a(AbstractFuture abstractFuture, C8171d c8171d, C8171d c8171d2) {
            return AbstractC13055p0.m23927a(this.f54181d, abstractFuture, c8171d, c8171d2);
        }

        @Override // com.google.common.util.concurrent.AbstractFuture.AbstractC8169b
        /* renamed from: b */
        public boolean mo39658b(AbstractFuture abstractFuture, Object obj, Object obj2) {
            return AbstractC13055p0.m23927a(this.f54182e, abstractFuture, obj, obj2);
        }

        @Override // com.google.common.util.concurrent.AbstractFuture.AbstractC8169b
        /* renamed from: c */
        public boolean mo39657c(AbstractFuture abstractFuture, C8179k c8179k, C8179k c8179k2) {
            return AbstractC13055p0.m23927a(this.f54180c, abstractFuture, c8179k, c8179k2);
        }

        @Override // com.google.common.util.concurrent.AbstractFuture.AbstractC8169b
        /* renamed from: d */
        public C8171d mo39656d(AbstractFuture abstractFuture, C8171d c8171d) {
            return (C8171d) this.f54181d.getAndSet(abstractFuture, c8171d);
        }

        @Override // com.google.common.util.concurrent.AbstractFuture.AbstractC8169b
        /* renamed from: e */
        public C8179k mo39655e(AbstractFuture abstractFuture, C8179k c8179k) {
            return (C8179k) this.f54180c.getAndSet(abstractFuture, c8179k);
        }

        @Override // com.google.common.util.concurrent.AbstractFuture.AbstractC8169b
        /* renamed from: f */
        public void mo39654f(C8179k c8179k, C8179k c8179k2) {
            this.f54179b.lazySet(c8179k, c8179k2);
        }

        @Override // com.google.common.util.concurrent.AbstractFuture.AbstractC8169b
        /* renamed from: g */
        public void mo39653g(C8179k c8179k, Thread thread) {
            this.f54178a.lazySet(c8179k, thread);
        }
    }

    /* renamed from: com.google.common.util.concurrent.AbstractFuture$f */
    /* loaded from: classes4.dex */
    public static final class RunnableC8173f implements Runnable {

        /* renamed from: a */
        public final AbstractFuture f54183a;

        /* renamed from: b */
        public final ListenableFuture f54184b;

        public RunnableC8173f(AbstractFuture abstractFuture, ListenableFuture listenableFuture) {
            this.f54183a = abstractFuture;
            this.f54184b = listenableFuture;
        }

        @Override // java.lang.Runnable
        public void run() {
            if (this.f54183a.f54165a == this) {
                if (AbstractFuture.f54163f.mo39658b(this.f54183a, this, AbstractFuture.m39664u(this.f54184b))) {
                    AbstractFuture.m39667r(this.f54183a, false);
                }
            }
        }
    }

    /* renamed from: com.google.common.util.concurrent.AbstractFuture$g */
    /* loaded from: classes4.dex */
    public static final class C8174g extends AbstractC8169b {
        public C8174g() {
            super();
        }

        @Override // com.google.common.util.concurrent.AbstractFuture.AbstractC8169b
        /* renamed from: a */
        public boolean mo39659a(AbstractFuture abstractFuture, C8171d c8171d, C8171d c8171d2) {
            synchronized (abstractFuture) {
                try {
                    if (abstractFuture.f54166b == c8171d) {
                        abstractFuture.f54166b = c8171d2;
                        return true;
                    }
                    return false;
                } catch (Throwable th2) {
                    throw th2;
                }
            }
        }

        @Override // com.google.common.util.concurrent.AbstractFuture.AbstractC8169b
        /* renamed from: b */
        public boolean mo39658b(AbstractFuture abstractFuture, Object obj, Object obj2) {
            synchronized (abstractFuture) {
                try {
                    if (abstractFuture.f54165a == obj) {
                        abstractFuture.f54165a = obj2;
                        return true;
                    }
                    return false;
                } catch (Throwable th2) {
                    throw th2;
                }
            }
        }

        @Override // com.google.common.util.concurrent.AbstractFuture.AbstractC8169b
        /* renamed from: c */
        public boolean mo39657c(AbstractFuture abstractFuture, C8179k c8179k, C8179k c8179k2) {
            synchronized (abstractFuture) {
                try {
                    if (abstractFuture.f54167c == c8179k) {
                        abstractFuture.f54167c = c8179k2;
                        return true;
                    }
                    return false;
                } catch (Throwable th2) {
                    throw th2;
                }
            }
        }

        @Override // com.google.common.util.concurrent.AbstractFuture.AbstractC8169b
        /* renamed from: d */
        public C8171d mo39656d(AbstractFuture abstractFuture, C8171d c8171d) {
            C8171d c8171d2;
            synchronized (abstractFuture) {
                try {
                    c8171d2 = abstractFuture.f54166b;
                    if (c8171d2 != c8171d) {
                        abstractFuture.f54166b = c8171d;
                    }
                } catch (Throwable th2) {
                    throw th2;
                }
            }
            return c8171d2;
        }

        @Override // com.google.common.util.concurrent.AbstractFuture.AbstractC8169b
        /* renamed from: e */
        public C8179k mo39655e(AbstractFuture abstractFuture, C8179k c8179k) {
            C8179k c8179k2;
            synchronized (abstractFuture) {
                try {
                    c8179k2 = abstractFuture.f54167c;
                    if (c8179k2 != c8179k) {
                        abstractFuture.f54167c = c8179k;
                    }
                } catch (Throwable th2) {
                    throw th2;
                }
            }
            return c8179k2;
        }

        @Override // com.google.common.util.concurrent.AbstractFuture.AbstractC8169b
        /* renamed from: f */
        public void mo39654f(C8179k c8179k, C8179k c8179k2) {
            c8179k.f54193b = c8179k2;
        }

        @Override // com.google.common.util.concurrent.AbstractFuture.AbstractC8169b
        /* renamed from: g */
        public void mo39653g(C8179k c8179k, Thread thread) {
            c8179k.f54192a = thread;
        }
    }

    /* renamed from: com.google.common.util.concurrent.AbstractFuture$h */
    /* loaded from: classes4.dex */
    public interface InterfaceC8175h extends ListenableFuture {
    }

    /* renamed from: com.google.common.util.concurrent.AbstractFuture$i */
    /* loaded from: classes4.dex */
    public static abstract class AbstractC8176i extends AbstractFuture implements InterfaceC8175h {
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
    public static final class C8177j extends AbstractC8169b {

        /* renamed from: a */
        public static final Unsafe f54185a;

        /* renamed from: b */
        public static final long f54186b;

        /* renamed from: c */
        public static final long f54187c;

        /* renamed from: d */
        public static final long f54188d;

        /* renamed from: e */
        public static final long f54189e;

        /* renamed from: f */
        public static final long f54190f;

        /* renamed from: com.google.common.util.concurrent.AbstractFuture$j$a */
        /* loaded from: classes4.dex */
        public class C8178a implements PrivilegedExceptionAction {
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
                    unsafe = (Unsafe) AccessController.doPrivileged(new C8178a());
                }
                try {
                    f54187c = unsafe.objectFieldOffset(AbstractFuture.class.getDeclaredField(OperatorName.CURVE_TO));
                    f54186b = unsafe.objectFieldOffset(AbstractFuture.class.getDeclaredField(OperatorName.CLOSE_FILL_NON_ZERO_AND_STROKE));
                    f54188d = unsafe.objectFieldOffset(AbstractFuture.class.getDeclaredField(PDPageLabelRange.STYLE_LETTERS_LOWER));
                    f54189e = unsafe.objectFieldOffset(C8179k.class.getDeclaredField(PDPageLabelRange.STYLE_LETTERS_LOWER));
                    f54190f = unsafe.objectFieldOffset(C8179k.class.getDeclaredField(OperatorName.CLOSE_FILL_NON_ZERO_AND_STROKE));
                    f54185a = unsafe;
                } catch (NoSuchFieldException e) {
                    throw new RuntimeException(e);
                }
            } catch (PrivilegedActionException e2) {
                throw new RuntimeException("Could not initialize intrinsics", e2.getCause());
            }
        }

        public C8177j() {
            super();
        }

        @Override // com.google.common.util.concurrent.AbstractFuture.AbstractC8169b
        /* renamed from: a */
        public boolean mo39659a(AbstractFuture abstractFuture, C8171d c8171d, C8171d c8171d2) {
            return AbstractC18164Nl2.m67202a(f54185a, abstractFuture, f54186b, c8171d, c8171d2);
        }

        @Override // com.google.common.util.concurrent.AbstractFuture.AbstractC8169b
        /* renamed from: b */
        public boolean mo39658b(AbstractFuture abstractFuture, Object obj, Object obj2) {
            return AbstractC18164Nl2.m67202a(f54185a, abstractFuture, f54188d, obj, obj2);
        }

        @Override // com.google.common.util.concurrent.AbstractFuture.AbstractC8169b
        /* renamed from: c */
        public boolean mo39657c(AbstractFuture abstractFuture, C8179k c8179k, C8179k c8179k2) {
            return AbstractC18164Nl2.m67202a(f54185a, abstractFuture, f54187c, c8179k, c8179k2);
        }

        @Override // com.google.common.util.concurrent.AbstractFuture.AbstractC8169b
        /* renamed from: d */
        public C8171d mo39656d(AbstractFuture abstractFuture, C8171d c8171d) {
            C8171d c8171d2;
            do {
                c8171d2 = abstractFuture.f54166b;
                if (c8171d == c8171d2) {
                    return c8171d2;
                }
            } while (!mo39659a(abstractFuture, c8171d2, c8171d));
            return c8171d2;
        }

        @Override // com.google.common.util.concurrent.AbstractFuture.AbstractC8169b
        /* renamed from: e */
        public C8179k mo39655e(AbstractFuture abstractFuture, C8179k c8179k) {
            C8179k c8179k2;
            do {
                c8179k2 = abstractFuture.f54167c;
                if (c8179k == c8179k2) {
                    return c8179k2;
                }
            } while (!mo39657c(abstractFuture, c8179k2, c8179k));
            return c8179k2;
        }

        @Override // com.google.common.util.concurrent.AbstractFuture.AbstractC8169b
        /* renamed from: f */
        public void mo39654f(C8179k c8179k, C8179k c8179k2) {
            f54185a.putObject(c8179k, f54190f, c8179k2);
        }

        @Override // com.google.common.util.concurrent.AbstractFuture.AbstractC8169b
        /* renamed from: g */
        public void mo39653g(C8179k c8179k, Thread thread) {
            f54185a.putObject(c8179k, f54189e, thread);
        }
    }

    /* renamed from: com.google.common.util.concurrent.AbstractFuture$k */
    /* loaded from: classes4.dex */
    public static final class C8179k {

        /* renamed from: c */
        public static final C8179k f54191c = new C8179k(false);

        /* renamed from: a */
        public volatile Thread f54192a;

        /* renamed from: b */
        public volatile C8179k f54193b;

        public C8179k(boolean z) {
        }

        /* renamed from: a */
        public void m39651a(C8179k c8179k) {
            AbstractFuture.f54163f.mo39654f(this, c8179k);
        }

        /* renamed from: b */
        public void m39650b() {
            Thread thread = this.f54192a;
            if (thread != null) {
                this.f54192a = null;
                LockSupport.unpark(thread);
            }
        }

        public C8179k() {
            AbstractFuture.f54163f.mo39653g(this, Thread.currentThread());
        }
    }

    static {
        boolean z;
        AbstractC8169b c8174g;
        try {
            z = Boolean.parseBoolean(System.getProperty("guava.concurrent.generate_cancellation_cause", "false"));
        } catch (SecurityException unused) {
            z = false;
        }
        f54161d = z;
        f54162e = new C17503Di0(AbstractFuture.class);
        Throwable th2 = null;
        try {
            c8174g = new C8177j();
            e = null;
        } catch (Error | Exception e) {
            e = e;
            try {
                c8174g = new C8172e(AtomicReferenceFieldUpdater.newUpdater(C8179k.class, Thread.class, PDPageLabelRange.STYLE_LETTERS_LOWER), AtomicReferenceFieldUpdater.newUpdater(C8179k.class, C8179k.class, OperatorName.CLOSE_FILL_NON_ZERO_AND_STROKE), AtomicReferenceFieldUpdater.newUpdater(AbstractFuture.class, C8179k.class, OperatorName.CURVE_TO), AtomicReferenceFieldUpdater.newUpdater(AbstractFuture.class, C8171d.class, OperatorName.CLOSE_FILL_NON_ZERO_AND_STROKE), AtomicReferenceFieldUpdater.newUpdater(AbstractFuture.class, Object.class, PDPageLabelRange.STYLE_LETTERS_LOWER));
            } catch (Error | Exception e2) {
                c8174g = new C8174g();
                th2 = e2;
            }
        }
        f54163f = c8174g;
        if (th2 != null) {
            C17503Di0 c17503Di0 = f54162e;
            Logger m68797a = c17503Di0.m68797a();
            Level level = Level.SEVERE;
            m68797a.log(level, "UnsafeAtomicHelper is broken!", e);
            c17503Di0.m68797a().log(level, "SafeAtomicHelper is broken!", th2);
        }
        f54164g = new Object();
    }

    /* renamed from: p */
    public static CancellationException m39669p(String str, Throwable th2) {
        CancellationException cancellationException = new CancellationException(str);
        cancellationException.initCause(th2);
        return cancellationException;
    }

    /* renamed from: r */
    public static void m39667r(AbstractFuture abstractFuture, boolean z) {
        C8171d c8171d = null;
        while (true) {
            abstractFuture.m39661x();
            if (z) {
                abstractFuture.interruptTask();
                z = false;
            }
            abstractFuture.afterDone();
            C8171d m39668q = abstractFuture.m39668q(c8171d);
            while (m39668q != null) {
                c8171d = m39668q.f54177c;
                Runnable runnable = m39668q.f54175a;
                Objects.requireNonNull(runnable);
                Runnable runnable2 = runnable;
                if (runnable2 instanceof RunnableC8173f) {
                    RunnableC8173f runnableC8173f = (RunnableC8173f) runnable2;
                    abstractFuture = runnableC8173f.f54183a;
                    if (abstractFuture.f54165a == runnableC8173f) {
                        if (f54163f.mo39658b(abstractFuture, runnableC8173f, m39664u(runnableC8173f.f54184b))) {
                            break;
                        }
                    } else {
                        continue;
                    }
                } else {
                    Executor executor = m39668q.f54176b;
                    Objects.requireNonNull(executor);
                    m39666s(runnable2, executor);
                }
                m39668q = c8171d;
            }
            return;
        }
    }

    /* renamed from: s */
    public static void m39666s(Runnable runnable, Executor executor) {
        try {
            executor.execute(runnable);
        } catch (Exception e) {
            Logger m68797a = f54162e.m68797a();
            Level level = Level.SEVERE;
            m68797a.log(level, "RuntimeException while executing runnable " + runnable + " with executor " + executor, (Throwable) e);
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: u */
    public static Object m39664u(ListenableFuture listenableFuture) {
        Throwable tryInternalFastPathGetFailure;
        if (listenableFuture instanceof InterfaceC8175h) {
            Object obj = ((AbstractFuture) listenableFuture).f54165a;
            if (obj instanceof C8170c) {
                C8170c c8170c = (C8170c) obj;
                if (c8170c.f54172a) {
                    obj = c8170c.f54173b != null ? new C8170c(false, c8170c.f54173b) : C8170c.f54171d;
                }
            }
            Objects.requireNonNull(obj);
            return obj;
        } else if ((listenableFuture instanceof InternalFutureFailureAccess) && (tryInternalFastPathGetFailure = InternalFutures.tryInternalFastPathGetFailure((InternalFutureFailureAccess) listenableFuture)) != null) {
            return new Failure(tryInternalFastPathGetFailure);
        } else {
            boolean isCancelled = listenableFuture.isCancelled();
            if ((!f54161d) & isCancelled) {
                C8170c c8170c2 = C8170c.f54171d;
                Objects.requireNonNull(c8170c2);
                return c8170c2;
            }
            try {
                Object m39663v = m39663v(listenableFuture);
                if (isCancelled) {
                    return new C8170c(false, new IllegalArgumentException("get() did not throw CancellationException, despite reporting isCancelled() == true: " + listenableFuture));
                } else if (m39663v == null) {
                    return f54164g;
                } else {
                    return m39663v;
                }
            } catch (Error e) {
                e = e;
                return new Failure(e);
            } catch (CancellationException e2) {
                if (!isCancelled) {
                    return new Failure(new IllegalArgumentException("get() threw CancellationException, despite reporting isCancelled() == false: " + listenableFuture, e2));
                }
                return new C8170c(false, e2);
            } catch (ExecutionException e3) {
                if (isCancelled) {
                    return new C8170c(false, new IllegalArgumentException("get() did not throw CancellationException, despite reporting isCancelled() == true: " + listenableFuture, e3));
                }
                return new Failure(e3.getCause());
            } catch (Exception e4) {
                e = e4;
                return new Failure(e);
            }
        }
    }

    /* renamed from: v */
    private static Object m39663v(Future future) {
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
        C8171d c8171d;
        Preconditions.checkNotNull(runnable, "Runnable was null.");
        Preconditions.checkNotNull(executor, "Executor was null.");
        if (!isDone() && (c8171d = this.f54166b) != C8171d.f54174d) {
            C8171d c8171d2 = new C8171d(runnable, executor);
            do {
                c8171d2.f54177c = c8171d;
                if (f54163f.mo39659a(this, c8171d, c8171d2)) {
                    return;
                }
                c8171d = this.f54166b;
            } while (c8171d != C8171d.f54174d);
            m39666s(runnable, executor);
        }
        m39666s(runnable, executor);
    }

    @ForOverride
    public void afterDone() {
    }

    @CanIgnoreReturnValue
    public boolean cancel(boolean z) {
        boolean z2;
        C8170c c8170c;
        boolean z3;
        Object obj = this.f54165a;
        if (obj == null) {
            z2 = true;
        } else {
            z2 = false;
        }
        if (z2 | (obj instanceof RunnableC8173f)) {
            if (f54161d) {
                c8170c = new C8170c(z, new CancellationException("Future.cancel() was called."));
            } else {
                if (z) {
                    c8170c = C8170c.f54170c;
                } else {
                    c8170c = C8170c.f54171d;
                }
                Objects.requireNonNull(c8170c);
            }
            boolean z4 = false;
            AbstractFuture<V> abstractFuture = this;
            while (true) {
                if (f54163f.mo39658b(abstractFuture, obj, c8170c)) {
                    m39667r(abstractFuture, z);
                    if (!(obj instanceof RunnableC8173f)) {
                        return true;
                    }
                    ListenableFuture listenableFuture = ((RunnableC8173f) obj).f54184b;
                    if (listenableFuture instanceof InterfaceC8175h) {
                        abstractFuture = (AbstractFuture) listenableFuture;
                        obj = abstractFuture.f54165a;
                        if (obj == null) {
                            z3 = true;
                        } else {
                            z3 = false;
                        }
                        if (!(z3 | (obj instanceof RunnableC8173f))) {
                            return true;
                        }
                        z4 = true;
                    } else {
                        listenableFuture.cancel(z);
                        return true;
                    }
                } else {
                    obj = abstractFuture.f54165a;
                    if (!(obj instanceof RunnableC8173f)) {
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
            Object obj = this.f54165a;
            if ((obj != null) & (!(obj instanceof RunnableC8173f))) {
                return (V) m39665t(obj);
            }
            long nanoTime = nanos > 0 ? System.nanoTime() + nanos : 0L;
            if (nanos >= 1000) {
                C8179k c8179k = this.f54167c;
                if (c8179k != C8179k.f54191c) {
                    C8179k c8179k2 = new C8179k();
                    do {
                        c8179k2.m39651a(c8179k);
                        if (f54163f.mo39657c(this, c8179k, c8179k2)) {
                            do {
                                AbstractC17956Kh1.m67689a(this, nanos);
                                if (!Thread.interrupted()) {
                                    Object obj2 = this.f54165a;
                                    if ((obj2 != null) & (!(obj2 instanceof RunnableC8173f))) {
                                        return (V) m39665t(obj2);
                                    }
                                    nanos = nanoTime - System.nanoTime();
                                } else {
                                    m39660y(c8179k2);
                                    throw new InterruptedException();
                                }
                            } while (nanos >= 1000);
                            m39660y(c8179k2);
                        } else {
                            c8179k = this.f54167c;
                        }
                    } while (c8179k != C8179k.f54191c);
                    Object obj3 = this.f54165a;
                    Objects.requireNonNull(obj3);
                    return (V) m39665t(obj3);
                }
                Object obj32 = this.f54165a;
                Objects.requireNonNull(obj32);
                return (V) m39665t(obj32);
            }
            while (nanos > 0) {
                Object obj4 = this.f54165a;
                if ((obj4 != null) & (!(obj4 instanceof RunnableC8173f))) {
                    return (V) m39665t(obj4);
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
        return this.f54165a instanceof C8170c;
    }

    public boolean isDone() {
        boolean z;
        Object obj = this.f54165a;
        if (obj != null) {
            z = true;
        } else {
            z = false;
        }
        return (!(obj instanceof RunnableC8173f)) & z;
    }

    /* renamed from: l */
    public final void m39673l(StringBuilder sb) {
        try {
            Object m39663v = m39663v(this);
            sb.append("SUCCESS, result=[");
            m39671n(sb, m39663v);
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
    public final void m39672m(StringBuilder sb) {
        String str;
        int length = sb.length();
        sb.append("PENDING");
        Object obj = this.f54165a;
        if (obj instanceof RunnableC8173f) {
            sb.append(", setFuture=[");
            m39670o(sb, ((RunnableC8173f) obj).f54184b);
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
            m39673l(sb);
        }
    }

    /* renamed from: n */
    public final void m39671n(StringBuilder sb, Object obj) {
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
    public final void m39670o(StringBuilder sb, Object obj) {
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
    public final C8171d m39668q(C8171d c8171d) {
        C8171d c8171d2 = c8171d;
        C8171d mo39656d = f54163f.mo39656d(this, C8171d.f54174d);
        while (mo39656d != null) {
            C8171d c8171d3 = mo39656d.f54177c;
            mo39656d.f54177c = c8171d2;
            c8171d2 = mo39656d;
            mo39656d = c8171d3;
        }
        return c8171d2;
    }

    @CanIgnoreReturnValue
    public boolean set(V v) {
        if (v == null) {
            v = (V) f54164g;
        }
        if (!f54163f.mo39658b(this, null, v)) {
            return false;
        }
        m39667r(this, false);
        return true;
    }

    @CanIgnoreReturnValue
    public boolean setException(Throwable th2) {
        if (!f54163f.mo39658b(this, null, new Failure((Throwable) Preconditions.checkNotNull(th2)))) {
            return false;
        }
        m39667r(this, false);
        return true;
    }

    @CanIgnoreReturnValue
    public boolean setFuture(ListenableFuture<? extends V> listenableFuture) {
        Failure failure;
        Preconditions.checkNotNull(listenableFuture);
        Object obj = this.f54165a;
        if (obj == null) {
            if (listenableFuture.isDone()) {
                if (!f54163f.mo39658b(this, null, m39664u(listenableFuture))) {
                    return false;
                }
                m39667r(this, false);
                return true;
            }
            RunnableC8173f runnableC8173f = new RunnableC8173f(this, listenableFuture);
            if (f54163f.mo39658b(this, null, runnableC8173f)) {
                try {
                    listenableFuture.addListener(runnableC8173f, DirectExecutor.INSTANCE);
                } catch (Throwable th2) {
                    try {
                        failure = new Failure(th2);
                    } catch (Error | Exception unused) {
                        failure = Failure.f54168b;
                    }
                    f54163f.mo39658b(this, runnableC8173f, failure);
                }
                return true;
            }
            obj = this.f54165a;
        }
        if (obj instanceof C8170c) {
            listenableFuture.cancel(((C8170c) obj).f54172a);
        }
        return false;
    }

    /* renamed from: t */
    public final Object m39665t(Object obj) {
        if (!(obj instanceof C8170c)) {
            if (!(obj instanceof Failure)) {
                if (obj == f54164g) {
                    return AbstractC22667vJ0.m932b();
                }
                return obj;
            }
            throw new ExecutionException(((Failure) obj).f54169a);
        }
        throw m39669p("Task was cancelled.", ((C8170c) obj).f54173b);
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
            m39673l(sb);
        } else {
            m39672m(sb);
        }
        sb.append("]");
        return sb.toString();
    }

    @Override // com.google.common.util.concurrent.internal.InternalFutureFailureAccess
    @CheckForNull
    public final Throwable tryInternalFastPathGetFailure() {
        if (this instanceof InterfaceC8175h) {
            Object obj = this.f54165a;
            if (obj instanceof Failure) {
                return ((Failure) obj).f54169a;
            }
            return null;
        }
        return null;
    }

    /* renamed from: w */
    public final void m39662w(Future future) {
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
        Object obj = this.f54165a;
        if ((obj instanceof C8170c) && ((C8170c) obj).f54172a) {
            return true;
        }
        return false;
    }

    /* renamed from: x */
    public final void m39661x() {
        for (C8179k mo39655e = f54163f.mo39655e(this, C8179k.f54191c); mo39655e != null; mo39655e = mo39655e.f54193b) {
            mo39655e.m39650b();
        }
    }

    /* renamed from: y */
    public final void m39660y(C8179k c8179k) {
        c8179k.f54192a = null;
        while (true) {
            C8179k c8179k2 = this.f54167c;
            if (c8179k2 == C8179k.f54191c) {
                return;
            }
            C8179k c8179k3 = null;
            while (c8179k2 != null) {
                C8179k c8179k4 = c8179k2.f54193b;
                if (c8179k2.f54192a != null) {
                    c8179k3 = c8179k2;
                } else if (c8179k3 != null) {
                    c8179k3.f54193b = c8179k4;
                    if (c8179k3.f54192a == null) {
                        break;
                    }
                } else if (!f54163f.mo39657c(this, c8179k2, c8179k4)) {
                    break;
                }
                c8179k2 = c8179k4;
            }
            return;
        }
    }

    /* renamed from: com.google.common.util.concurrent.AbstractFuture$d */
    /* loaded from: classes4.dex */
    public static final class C8171d {

        /* renamed from: d */
        public static final C8171d f54174d = new C8171d();

        /* renamed from: a */
        public final Runnable f54175a;

        /* renamed from: b */
        public final Executor f54176b;

        /* renamed from: c */
        public C8171d f54177c;

        public C8171d(Runnable runnable, Executor executor) {
            this.f54175a = runnable;
            this.f54176b = executor;
        }

        public C8171d() {
            this.f54175a = null;
            this.f54176b = null;
        }
    }

    @CanIgnoreReturnValue
    public V get() throws InterruptedException, ExecutionException {
        Object obj;
        if (!Thread.interrupted()) {
            Object obj2 = this.f54165a;
            if ((obj2 != null) & (!(obj2 instanceof RunnableC8173f))) {
                return (V) m39665t(obj2);
            }
            C8179k c8179k = this.f54167c;
            if (c8179k != C8179k.f54191c) {
                C8179k c8179k2 = new C8179k();
                do {
                    c8179k2.m39651a(c8179k);
                    if (f54163f.mo39657c(this, c8179k, c8179k2)) {
                        do {
                            LockSupport.park(this);
                            if (!Thread.interrupted()) {
                                obj = this.f54165a;
                            } else {
                                m39660y(c8179k2);
                                throw new InterruptedException();
                            }
                        } while (!((obj != null) & (!(obj instanceof RunnableC8173f))));
                        return (V) m39665t(obj);
                    }
                    c8179k = this.f54167c;
                } while (c8179k != C8179k.f54191c);
                Object obj3 = this.f54165a;
                Objects.requireNonNull(obj3);
                return (V) m39665t(obj3);
            }
            Object obj32 = this.f54165a;
            Objects.requireNonNull(obj32);
            return (V) m39665t(obj32);
        }
        throw new InterruptedException();
    }
}
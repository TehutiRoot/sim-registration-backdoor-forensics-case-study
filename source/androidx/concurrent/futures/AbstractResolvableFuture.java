package androidx.concurrent.futures;

import androidx.annotation.Nullable;
import androidx.annotation.RestrictTo;
import com.google.common.util.concurrent.ListenableFuture;
import com.tom_roush.pdfbox.contentstream.operator.OperatorName;
import com.tom_roush.pdfbox.pdmodel.common.PDPageLabelRange;
import java.util.Locale;
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
import org.apache.commons.cli.HelpFormatter;
import th.p047co.dtac.android.dtacone.util.Constant;

@RestrictTo({RestrictTo.Scope.LIBRARY_GROUP_PREFIX})
/* loaded from: classes2.dex */
public abstract class AbstractResolvableFuture<V> implements ListenableFuture<V> {

    /* renamed from: d */
    public static final boolean f31862d = Boolean.parseBoolean(System.getProperty("guava.concurrent.generate_cancellation_cause", "false"));

    /* renamed from: e */
    public static final Logger f31863e = Logger.getLogger(AbstractResolvableFuture.class.getName());

    /* renamed from: f */
    public static final AbstractC3658b f31864f;

    /* renamed from: g */
    public static final Object f31865g;

    /* renamed from: a */
    public volatile Object f31866a;

    /* renamed from: b */
    public volatile C3660d f31867b;

    /* renamed from: c */
    public volatile C3664h f31868c;

    /* loaded from: classes2.dex */
    public static final class Failure {

        /* renamed from: b */
        public static final Failure f31869b = new Failure(new Throwable("Failure occurred while trying to finish a future.") { // from class: androidx.concurrent.futures.AbstractResolvableFuture.Failure.1
            @Override // java.lang.Throwable
            public synchronized Throwable fillInStackTrace() {
                return this;
            }
        });

        /* renamed from: a */
        public final Throwable f31870a;

        public Failure(Throwable th2) {
            this.f31870a = (Throwable) AbstractResolvableFuture.m58834c(th2);
        }
    }

    /* renamed from: androidx.concurrent.futures.AbstractResolvableFuture$b */
    /* loaded from: classes2.dex */
    public static abstract class AbstractC3658b {
        public AbstractC3658b() {
        }

        /* renamed from: a */
        public abstract boolean mo58824a(AbstractResolvableFuture abstractResolvableFuture, C3660d c3660d, C3660d c3660d2);

        /* renamed from: b */
        public abstract boolean mo58823b(AbstractResolvableFuture abstractResolvableFuture, Object obj, Object obj2);

        /* renamed from: c */
        public abstract boolean mo58822c(AbstractResolvableFuture abstractResolvableFuture, C3664h c3664h, C3664h c3664h2);

        /* renamed from: d */
        public abstract void mo58821d(C3664h c3664h, C3664h c3664h2);

        /* renamed from: e */
        public abstract void mo58820e(C3664h c3664h, Thread thread);
    }

    /* renamed from: androidx.concurrent.futures.AbstractResolvableFuture$c */
    /* loaded from: classes2.dex */
    public static final class C3659c {

        /* renamed from: c */
        public static final C3659c f31871c;

        /* renamed from: d */
        public static final C3659c f31872d;

        /* renamed from: a */
        public final boolean f31873a;

        /* renamed from: b */
        public final Throwable f31874b;

        static {
            if (AbstractResolvableFuture.f31862d) {
                f31872d = null;
                f31871c = null;
                return;
            }
            f31872d = new C3659c(false, null);
            f31871c = new C3659c(true, null);
        }

        public C3659c(boolean z, Throwable th2) {
            this.f31873a = z;
            this.f31874b = th2;
        }
    }

    /* renamed from: androidx.concurrent.futures.AbstractResolvableFuture$d */
    /* loaded from: classes2.dex */
    public static final class C3660d {

        /* renamed from: d */
        public static final C3660d f31875d = new C3660d(null, null);

        /* renamed from: a */
        public final Runnable f31876a;

        /* renamed from: b */
        public final Executor f31877b;

        /* renamed from: c */
        public C3660d f31878c;

        public C3660d(Runnable runnable, Executor executor) {
            this.f31876a = runnable;
            this.f31877b = executor;
        }
    }

    /* renamed from: androidx.concurrent.futures.AbstractResolvableFuture$e */
    /* loaded from: classes2.dex */
    public static final class C3661e extends AbstractC3658b {

        /* renamed from: a */
        public final AtomicReferenceFieldUpdater f31879a;

        /* renamed from: b */
        public final AtomicReferenceFieldUpdater f31880b;

        /* renamed from: c */
        public final AtomicReferenceFieldUpdater f31881c;

        /* renamed from: d */
        public final AtomicReferenceFieldUpdater f31882d;

        /* renamed from: e */
        public final AtomicReferenceFieldUpdater f31883e;

        public C3661e(AtomicReferenceFieldUpdater atomicReferenceFieldUpdater, AtomicReferenceFieldUpdater atomicReferenceFieldUpdater2, AtomicReferenceFieldUpdater atomicReferenceFieldUpdater3, AtomicReferenceFieldUpdater atomicReferenceFieldUpdater4, AtomicReferenceFieldUpdater atomicReferenceFieldUpdater5) {
            super();
            this.f31879a = atomicReferenceFieldUpdater;
            this.f31880b = atomicReferenceFieldUpdater2;
            this.f31881c = atomicReferenceFieldUpdater3;
            this.f31882d = atomicReferenceFieldUpdater4;
            this.f31883e = atomicReferenceFieldUpdater5;
        }

        @Override // androidx.concurrent.futures.AbstractResolvableFuture.AbstractC3658b
        /* renamed from: a */
        public boolean mo58824a(AbstractResolvableFuture abstractResolvableFuture, C3660d c3660d, C3660d c3660d2) {
            return AbstractC13055p0.m23740a(this.f31882d, abstractResolvableFuture, c3660d, c3660d2);
        }

        @Override // androidx.concurrent.futures.AbstractResolvableFuture.AbstractC3658b
        /* renamed from: b */
        public boolean mo58823b(AbstractResolvableFuture abstractResolvableFuture, Object obj, Object obj2) {
            return AbstractC13055p0.m23740a(this.f31883e, abstractResolvableFuture, obj, obj2);
        }

        @Override // androidx.concurrent.futures.AbstractResolvableFuture.AbstractC3658b
        /* renamed from: c */
        public boolean mo58822c(AbstractResolvableFuture abstractResolvableFuture, C3664h c3664h, C3664h c3664h2) {
            return AbstractC13055p0.m23740a(this.f31881c, abstractResolvableFuture, c3664h, c3664h2);
        }

        @Override // androidx.concurrent.futures.AbstractResolvableFuture.AbstractC3658b
        /* renamed from: d */
        public void mo58821d(C3664h c3664h, C3664h c3664h2) {
            this.f31880b.lazySet(c3664h, c3664h2);
        }

        @Override // androidx.concurrent.futures.AbstractResolvableFuture.AbstractC3658b
        /* renamed from: e */
        public void mo58820e(C3664h c3664h, Thread thread) {
            this.f31879a.lazySet(c3664h, thread);
        }
    }

    /* renamed from: androidx.concurrent.futures.AbstractResolvableFuture$f */
    /* loaded from: classes2.dex */
    public static final class RunnableC3662f implements Runnable {

        /* renamed from: a */
        public final AbstractResolvableFuture f31884a;

        /* renamed from: b */
        public final ListenableFuture f31885b;

        public RunnableC3662f(AbstractResolvableFuture abstractResolvableFuture, ListenableFuture listenableFuture) {
            this.f31884a = abstractResolvableFuture;
            this.f31885b = listenableFuture;
        }

        @Override // java.lang.Runnable
        public void run() {
            if (this.f31884a.f31866a != this) {
                return;
            }
            if (AbstractResolvableFuture.f31864f.mo58823b(this.f31884a, this, AbstractResolvableFuture.m58829h(this.f31885b))) {
                AbstractResolvableFuture.m58832e(this.f31884a);
            }
        }
    }

    /* renamed from: androidx.concurrent.futures.AbstractResolvableFuture$g */
    /* loaded from: classes2.dex */
    public static final class C3663g extends AbstractC3658b {
        public C3663g() {
            super();
        }

        @Override // androidx.concurrent.futures.AbstractResolvableFuture.AbstractC3658b
        /* renamed from: a */
        public boolean mo58824a(AbstractResolvableFuture abstractResolvableFuture, C3660d c3660d, C3660d c3660d2) {
            synchronized (abstractResolvableFuture) {
                try {
                    if (abstractResolvableFuture.f31867b == c3660d) {
                        abstractResolvableFuture.f31867b = c3660d2;
                        return true;
                    }
                    return false;
                } catch (Throwable th2) {
                    throw th2;
                }
            }
        }

        @Override // androidx.concurrent.futures.AbstractResolvableFuture.AbstractC3658b
        /* renamed from: b */
        public boolean mo58823b(AbstractResolvableFuture abstractResolvableFuture, Object obj, Object obj2) {
            synchronized (abstractResolvableFuture) {
                try {
                    if (abstractResolvableFuture.f31866a == obj) {
                        abstractResolvableFuture.f31866a = obj2;
                        return true;
                    }
                    return false;
                } catch (Throwable th2) {
                    throw th2;
                }
            }
        }

        @Override // androidx.concurrent.futures.AbstractResolvableFuture.AbstractC3658b
        /* renamed from: c */
        public boolean mo58822c(AbstractResolvableFuture abstractResolvableFuture, C3664h c3664h, C3664h c3664h2) {
            synchronized (abstractResolvableFuture) {
                try {
                    if (abstractResolvableFuture.f31868c == c3664h) {
                        abstractResolvableFuture.f31868c = c3664h2;
                        return true;
                    }
                    return false;
                } catch (Throwable th2) {
                    throw th2;
                }
            }
        }

        @Override // androidx.concurrent.futures.AbstractResolvableFuture.AbstractC3658b
        /* renamed from: d */
        public void mo58821d(C3664h c3664h, C3664h c3664h2) {
            c3664h.f31888b = c3664h2;
        }

        @Override // androidx.concurrent.futures.AbstractResolvableFuture.AbstractC3658b
        /* renamed from: e */
        public void mo58820e(C3664h c3664h, Thread thread) {
            c3664h.f31887a = thread;
        }
    }

    /* renamed from: androidx.concurrent.futures.AbstractResolvableFuture$h */
    /* loaded from: classes2.dex */
    public static final class C3664h {

        /* renamed from: c */
        public static final C3664h f31886c = new C3664h(false);

        /* renamed from: a */
        public volatile Thread f31887a;

        /* renamed from: b */
        public volatile C3664h f31888b;

        public C3664h(boolean z) {
        }

        /* renamed from: a */
        public void m58819a(C3664h c3664h) {
            AbstractResolvableFuture.f31864f.mo58821d(this, c3664h);
        }

        /* renamed from: b */
        public void m58818b() {
            Thread thread = this.f31887a;
            if (thread != null) {
                this.f31887a = null;
                LockSupport.unpark(thread);
            }
        }

        public C3664h() {
            AbstractResolvableFuture.f31864f.mo58820e(this, Thread.currentThread());
        }
    }

    static {
        AbstractC3658b c3663g;
        try {
            c3663g = new C3661e(AtomicReferenceFieldUpdater.newUpdater(C3664h.class, Thread.class, PDPageLabelRange.STYLE_LETTERS_LOWER), AtomicReferenceFieldUpdater.newUpdater(C3664h.class, C3664h.class, OperatorName.CLOSE_FILL_NON_ZERO_AND_STROKE), AtomicReferenceFieldUpdater.newUpdater(AbstractResolvableFuture.class, C3664h.class, OperatorName.CURVE_TO), AtomicReferenceFieldUpdater.newUpdater(AbstractResolvableFuture.class, C3660d.class, OperatorName.CLOSE_FILL_NON_ZERO_AND_STROKE), AtomicReferenceFieldUpdater.newUpdater(AbstractResolvableFuture.class, Object.class, PDPageLabelRange.STYLE_LETTERS_LOWER));
            th = null;
        } catch (Throwable th2) {
            th = th2;
            c3663g = new C3663g();
        }
        f31864f = c3663g;
        if (th != null) {
            f31863e.log(Level.SEVERE, "SafeAtomicHelper is broken!", th);
        }
        f31865g = new Object();
    }

    /* renamed from: a */
    private void m58836a(StringBuilder sb) {
        try {
            Object m58828i = m58828i(this);
            sb.append("SUCCESS, result=[");
            sb.append(m58825l(m58828i));
            sb.append("]");
        } catch (CancellationException unused) {
            sb.append(Constant.QueryTransactionStatus.CANCELLED);
        } catch (RuntimeException e) {
            sb.append("UNKNOWN, cause=[");
            sb.append(e.getClass());
            sb.append(" thrown from get()]");
        } catch (ExecutionException e2) {
            sb.append("FAILURE, cause=[");
            sb.append(e2.getCause());
            sb.append("]");
        }
    }

    /* renamed from: b */
    private static CancellationException m58835b(String str, Throwable th2) {
        CancellationException cancellationException = new CancellationException(str);
        cancellationException.initCause(th2);
        return cancellationException;
    }

    /* renamed from: c */
    public static Object m58834c(Object obj) {
        obj.getClass();
        return obj;
    }

    /* renamed from: e */
    public static void m58832e(AbstractResolvableFuture abstractResolvableFuture) {
        C3660d c3660d = null;
        while (true) {
            abstractResolvableFuture.m58827j();
            abstractResolvableFuture.afterDone();
            C3660d m58833d = abstractResolvableFuture.m58833d(c3660d);
            while (m58833d != null) {
                c3660d = m58833d.f31878c;
                Runnable runnable = m58833d.f31876a;
                if (runnable instanceof RunnableC3662f) {
                    RunnableC3662f runnableC3662f = (RunnableC3662f) runnable;
                    abstractResolvableFuture = runnableC3662f.f31884a;
                    if (abstractResolvableFuture.f31866a == runnableC3662f) {
                        if (f31864f.mo58823b(abstractResolvableFuture, runnableC3662f, m58829h(runnableC3662f.f31885b))) {
                            break;
                        }
                    } else {
                        continue;
                    }
                } else {
                    m58831f(runnable, m58833d.f31877b);
                }
                m58833d = c3660d;
            }
            return;
        }
    }

    /* renamed from: f */
    private static void m58831f(Runnable runnable, Executor executor) {
        try {
            executor.execute(runnable);
        } catch (RuntimeException e) {
            Logger logger = f31863e;
            Level level = Level.SEVERE;
            logger.log(level, "RuntimeException while executing runnable " + runnable + " with executor " + executor, (Throwable) e);
        }
    }

    /* renamed from: g */
    private Object m58830g(Object obj) {
        if (!(obj instanceof C3659c)) {
            if (!(obj instanceof Failure)) {
                if (obj == f31865g) {
                    return null;
                }
                return obj;
            }
            throw new ExecutionException(((Failure) obj).f31870a);
        }
        throw m58835b("Task was cancelled.", ((C3659c) obj).f31874b);
    }

    /* renamed from: h */
    public static Object m58829h(ListenableFuture listenableFuture) {
        if (listenableFuture instanceof AbstractResolvableFuture) {
            Object obj = ((AbstractResolvableFuture) listenableFuture).f31866a;
            if (obj instanceof C3659c) {
                C3659c c3659c = (C3659c) obj;
                if (c3659c.f31873a) {
                    if (c3659c.f31874b != null) {
                        return new C3659c(false, c3659c.f31874b);
                    }
                    return C3659c.f31872d;
                }
                return obj;
            }
            return obj;
        }
        boolean isCancelled = listenableFuture.isCancelled();
        if ((!f31862d) & isCancelled) {
            return C3659c.f31872d;
        }
        try {
            Object m58828i = m58828i(listenableFuture);
            if (m58828i == null) {
                return f31865g;
            }
            return m58828i;
        } catch (CancellationException e) {
            if (!isCancelled) {
                return new Failure(new IllegalArgumentException("get() threw CancellationException, despite reporting isCancelled() == false: " + listenableFuture, e));
            }
            return new C3659c(false, e);
        } catch (ExecutionException e2) {
            return new Failure(e2.getCause());
        } catch (Throwable th2) {
            return new Failure(th2);
        }
    }

    /* renamed from: i */
    public static Object m58828i(Future future) {
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

    /* renamed from: j */
    private void m58827j() {
        C3664h c3664h;
        do {
            c3664h = this.f31868c;
        } while (!f31864f.mo58822c(this, c3664h, C3664h.f31886c));
        while (c3664h != null) {
            c3664h.m58818b();
            c3664h = c3664h.f31888b;
        }
    }

    @Override // com.google.common.util.concurrent.ListenableFuture
    public final void addListener(Runnable runnable, Executor executor) {
        m58834c(runnable);
        m58834c(executor);
        C3660d c3660d = this.f31867b;
        if (c3660d != C3660d.f31875d) {
            C3660d c3660d2 = new C3660d(runnable, executor);
            do {
                c3660d2.f31878c = c3660d;
                if (f31864f.mo58824a(this, c3660d, c3660d2)) {
                    return;
                }
                c3660d = this.f31867b;
            } while (c3660d != C3660d.f31875d);
            m58831f(runnable, executor);
        }
        m58831f(runnable, executor);
    }

    public void afterDone() {
    }

    @Override // java.util.concurrent.Future
    public final boolean cancel(boolean z) {
        boolean z2;
        C3659c c3659c;
        boolean z3;
        Object obj = this.f31866a;
        if (obj == null) {
            z2 = true;
        } else {
            z2 = false;
        }
        if (z2 | (obj instanceof RunnableC3662f)) {
            if (f31862d) {
                c3659c = new C3659c(z, new CancellationException("Future.cancel() was called."));
            } else if (z) {
                c3659c = C3659c.f31871c;
            } else {
                c3659c = C3659c.f31872d;
            }
            boolean z4 = false;
            AbstractResolvableFuture<V> abstractResolvableFuture = this;
            while (true) {
                if (f31864f.mo58823b(abstractResolvableFuture, obj, c3659c)) {
                    if (z) {
                        abstractResolvableFuture.interruptTask();
                    }
                    m58832e(abstractResolvableFuture);
                    if (!(obj instanceof RunnableC3662f)) {
                        return true;
                    }
                    ListenableFuture listenableFuture = ((RunnableC3662f) obj).f31885b;
                    if (listenableFuture instanceof AbstractResolvableFuture) {
                        abstractResolvableFuture = (AbstractResolvableFuture) listenableFuture;
                        obj = abstractResolvableFuture.f31866a;
                        if (obj == null) {
                            z3 = true;
                        } else {
                            z3 = false;
                        }
                        if (!(z3 | (obj instanceof RunnableC3662f))) {
                            return true;
                        }
                        z4 = true;
                    } else {
                        listenableFuture.cancel(z);
                        return true;
                    }
                } else {
                    obj = abstractResolvableFuture.f31866a;
                    if (!(obj instanceof RunnableC3662f)) {
                        return z4;
                    }
                }
            }
        } else {
            return false;
        }
    }

    /* renamed from: d */
    public final C3660d m58833d(C3660d c3660d) {
        C3660d c3660d2;
        do {
            c3660d2 = this.f31867b;
        } while (!f31864f.mo58824a(this, c3660d2, C3660d.f31875d));
        C3660d c3660d3 = c3660d;
        C3660d c3660d4 = c3660d2;
        while (c3660d4 != null) {
            C3660d c3660d5 = c3660d4.f31878c;
            c3660d4.f31878c = c3660d3;
            c3660d3 = c3660d4;
            c3660d4 = c3660d5;
        }
        return c3660d3;
    }

    @Override // java.util.concurrent.Future
    public final V get(long j, TimeUnit timeUnit) throws InterruptedException, TimeoutException, ExecutionException {
        Locale locale;
        long nanos = timeUnit.toNanos(j);
        if (!Thread.interrupted()) {
            Object obj = this.f31866a;
            if ((obj != null) & (!(obj instanceof RunnableC3662f))) {
                return (V) m58830g(obj);
            }
            long nanoTime = nanos > 0 ? System.nanoTime() + nanos : 0L;
            if (nanos >= 1000) {
                C3664h c3664h = this.f31868c;
                if (c3664h != C3664h.f31886c) {
                    C3664h c3664h2 = new C3664h();
                    do {
                        c3664h2.m58819a(c3664h);
                        if (f31864f.mo58822c(this, c3664h, c3664h2)) {
                            do {
                                LockSupport.parkNanos(this, nanos);
                                if (!Thread.interrupted()) {
                                    Object obj2 = this.f31866a;
                                    if ((obj2 != null) & (!(obj2 instanceof RunnableC3662f))) {
                                        return (V) m58830g(obj2);
                                    }
                                    nanos = nanoTime - System.nanoTime();
                                } else {
                                    m58826k(c3664h2);
                                    throw new InterruptedException();
                                }
                            } while (nanos >= 1000);
                            m58826k(c3664h2);
                        } else {
                            c3664h = this.f31868c;
                        }
                    } while (c3664h != C3664h.f31886c);
                    return (V) m58830g(this.f31866a);
                }
                return (V) m58830g(this.f31866a);
            }
            while (nanos > 0) {
                Object obj3 = this.f31866a;
                if ((obj3 != null) & (!(obj3 instanceof RunnableC3662f))) {
                    return (V) m58830g(obj3);
                }
                if (!Thread.interrupted()) {
                    nanos = nanoTime - System.nanoTime();
                } else {
                    throw new InterruptedException();
                }
            }
            String abstractResolvableFuture = toString();
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
            throw new TimeoutException(str + " for " + abstractResolvableFuture);
        }
        throw new InterruptedException();
    }

    public void interruptTask() {
    }

    @Override // java.util.concurrent.Future
    public final boolean isCancelled() {
        return this.f31866a instanceof C3659c;
    }

    @Override // java.util.concurrent.Future
    public final boolean isDone() {
        boolean z;
        Object obj = this.f31866a;
        if (obj != null) {
            z = true;
        } else {
            z = false;
        }
        return (!(obj instanceof RunnableC3662f)) & z;
    }

    /* renamed from: k */
    public final void m58826k(C3664h c3664h) {
        c3664h.f31887a = null;
        while (true) {
            C3664h c3664h2 = this.f31868c;
            if (c3664h2 == C3664h.f31886c) {
                return;
            }
            C3664h c3664h3 = null;
            while (c3664h2 != null) {
                C3664h c3664h4 = c3664h2.f31888b;
                if (c3664h2.f31887a != null) {
                    c3664h3 = c3664h2;
                } else if (c3664h3 != null) {
                    c3664h3.f31888b = c3664h4;
                    if (c3664h3.f31887a == null) {
                        break;
                    }
                } else if (!f31864f.mo58822c(this, c3664h2, c3664h4)) {
                    break;
                }
                c3664h2 = c3664h4;
            }
            return;
        }
    }

    /* renamed from: l */
    public final String m58825l(Object obj) {
        if (obj == this) {
            return "this future";
        }
        return String.valueOf(obj);
    }

    @Nullable
    public String pendingToString() {
        Object obj = this.f31866a;
        if (obj instanceof RunnableC3662f) {
            return "setFuture=[" + m58825l(((RunnableC3662f) obj).f31885b) + "]";
        } else if (this instanceof ScheduledFuture) {
            return "remaining delay=[" + ((ScheduledFuture) this).getDelay(TimeUnit.MILLISECONDS) + " ms]";
        } else {
            return null;
        }
    }

    public boolean set(@Nullable V v) {
        if (v == null) {
            v = (V) f31865g;
        }
        if (f31864f.mo58823b(this, null, v)) {
            m58832e(this);
            return true;
        }
        return false;
    }

    public boolean setException(Throwable th2) {
        if (f31864f.mo58823b(this, null, new Failure((Throwable) m58834c(th2)))) {
            m58832e(this);
            return true;
        }
        return false;
    }

    public boolean setFuture(ListenableFuture<? extends V> listenableFuture) {
        Failure failure;
        m58834c(listenableFuture);
        Object obj = this.f31866a;
        if (obj == null) {
            if (listenableFuture.isDone()) {
                if (!f31864f.mo58823b(this, null, m58829h(listenableFuture))) {
                    return false;
                }
                m58832e(this);
                return true;
            }
            RunnableC3662f runnableC3662f = new RunnableC3662f(this, listenableFuture);
            if (f31864f.mo58823b(this, null, runnableC3662f)) {
                try {
                    listenableFuture.addListener(runnableC3662f, DirectExecutor.INSTANCE);
                } catch (Throwable th2) {
                    try {
                        failure = new Failure(th2);
                    } catch (Throwable unused) {
                        failure = Failure.f31869b;
                    }
                    f31864f.mo58823b(this, runnableC3662f, failure);
                }
                return true;
            }
            obj = this.f31866a;
        }
        if (obj instanceof C3659c) {
            listenableFuture.cancel(((C3659c) obj).f31873a);
        }
        return false;
    }

    public String toString() {
        String str;
        StringBuilder sb = new StringBuilder();
        sb.append(super.toString());
        sb.append("[status=");
        if (isCancelled()) {
            sb.append(Constant.QueryTransactionStatus.CANCELLED);
        } else if (isDone()) {
            m58836a(sb);
        } else {
            try {
                str = pendingToString();
            } catch (RuntimeException e) {
                str = "Exception thrown from implementation: " + e.getClass();
            }
            if (str != null && !str.isEmpty()) {
                sb.append("PENDING, info=[");
                sb.append(str);
                sb.append("]");
            } else if (isDone()) {
                m58836a(sb);
            } else {
                sb.append("PENDING");
            }
        }
        sb.append("]");
        return sb.toString();
    }

    public final boolean wasInterrupted() {
        Object obj = this.f31866a;
        if ((obj instanceof C3659c) && ((C3659c) obj).f31873a) {
            return true;
        }
        return false;
    }

    @Override // java.util.concurrent.Future
    public final V get() throws InterruptedException, ExecutionException {
        Object obj;
        if (!Thread.interrupted()) {
            Object obj2 = this.f31866a;
            if ((obj2 != null) & (!(obj2 instanceof RunnableC3662f))) {
                return (V) m58830g(obj2);
            }
            C3664h c3664h = this.f31868c;
            if (c3664h != C3664h.f31886c) {
                C3664h c3664h2 = new C3664h();
                do {
                    c3664h2.m58819a(c3664h);
                    if (f31864f.mo58822c(this, c3664h, c3664h2)) {
                        do {
                            LockSupport.park(this);
                            if (!Thread.interrupted()) {
                                obj = this.f31866a;
                            } else {
                                m58826k(c3664h2);
                                throw new InterruptedException();
                            }
                        } while (!((obj != null) & (!(obj instanceof RunnableC3662f))));
                        return (V) m58830g(obj);
                    }
                    c3664h = this.f31868c;
                } while (c3664h != C3664h.f31886c);
                return (V) m58830g(this.f31866a);
            }
            return (V) m58830g(this.f31866a);
        }
        throw new InterruptedException();
    }
}

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
    public static final boolean f31950d = Boolean.parseBoolean(System.getProperty("guava.concurrent.generate_cancellation_cause", "false"));

    /* renamed from: e */
    public static final Logger f31951e = Logger.getLogger(AbstractResolvableFuture.class.getName());

    /* renamed from: f */
    public static final AbstractC3640b f31952f;

    /* renamed from: g */
    public static final Object f31953g;

    /* renamed from: a */
    public volatile Object f31954a;

    /* renamed from: b */
    public volatile C3642d f31955b;

    /* renamed from: c */
    public volatile C3646h f31956c;

    /* loaded from: classes2.dex */
    public static final class Failure {

        /* renamed from: b */
        public static final Failure f31957b = new Failure(new Throwable("Failure occurred while trying to finish a future.") { // from class: androidx.concurrent.futures.AbstractResolvableFuture.Failure.1
            @Override // java.lang.Throwable
            public synchronized Throwable fillInStackTrace() {
                return this;
            }
        });

        /* renamed from: a */
        public final Throwable f31958a;

        public Failure(Throwable th2) {
            this.f31958a = (Throwable) AbstractResolvableFuture.m58784c(th2);
        }
    }

    /* renamed from: androidx.concurrent.futures.AbstractResolvableFuture$b */
    /* loaded from: classes2.dex */
    public static abstract class AbstractC3640b {
        public AbstractC3640b() {
        }

        /* renamed from: a */
        public abstract boolean mo58774a(AbstractResolvableFuture abstractResolvableFuture, C3642d c3642d, C3642d c3642d2);

        /* renamed from: b */
        public abstract boolean mo58773b(AbstractResolvableFuture abstractResolvableFuture, Object obj, Object obj2);

        /* renamed from: c */
        public abstract boolean mo58772c(AbstractResolvableFuture abstractResolvableFuture, C3646h c3646h, C3646h c3646h2);

        /* renamed from: d */
        public abstract void mo58771d(C3646h c3646h, C3646h c3646h2);

        /* renamed from: e */
        public abstract void mo58770e(C3646h c3646h, Thread thread);
    }

    /* renamed from: androidx.concurrent.futures.AbstractResolvableFuture$c */
    /* loaded from: classes2.dex */
    public static final class C3641c {

        /* renamed from: c */
        public static final C3641c f31959c;

        /* renamed from: d */
        public static final C3641c f31960d;

        /* renamed from: a */
        public final boolean f31961a;

        /* renamed from: b */
        public final Throwable f31962b;

        static {
            if (AbstractResolvableFuture.f31950d) {
                f31960d = null;
                f31959c = null;
                return;
            }
            f31960d = new C3641c(false, null);
            f31959c = new C3641c(true, null);
        }

        public C3641c(boolean z, Throwable th2) {
            this.f31961a = z;
            this.f31962b = th2;
        }
    }

    /* renamed from: androidx.concurrent.futures.AbstractResolvableFuture$d */
    /* loaded from: classes2.dex */
    public static final class C3642d {

        /* renamed from: d */
        public static final C3642d f31963d = new C3642d(null, null);

        /* renamed from: a */
        public final Runnable f31964a;

        /* renamed from: b */
        public final Executor f31965b;

        /* renamed from: c */
        public C3642d f31966c;

        public C3642d(Runnable runnable, Executor executor) {
            this.f31964a = runnable;
            this.f31965b = executor;
        }
    }

    /* renamed from: androidx.concurrent.futures.AbstractResolvableFuture$e */
    /* loaded from: classes2.dex */
    public static final class C3643e extends AbstractC3640b {

        /* renamed from: a */
        public final AtomicReferenceFieldUpdater f31967a;

        /* renamed from: b */
        public final AtomicReferenceFieldUpdater f31968b;

        /* renamed from: c */
        public final AtomicReferenceFieldUpdater f31969c;

        /* renamed from: d */
        public final AtomicReferenceFieldUpdater f31970d;

        /* renamed from: e */
        public final AtomicReferenceFieldUpdater f31971e;

        public C3643e(AtomicReferenceFieldUpdater atomicReferenceFieldUpdater, AtomicReferenceFieldUpdater atomicReferenceFieldUpdater2, AtomicReferenceFieldUpdater atomicReferenceFieldUpdater3, AtomicReferenceFieldUpdater atomicReferenceFieldUpdater4, AtomicReferenceFieldUpdater atomicReferenceFieldUpdater5) {
            super();
            this.f31967a = atomicReferenceFieldUpdater;
            this.f31968b = atomicReferenceFieldUpdater2;
            this.f31969c = atomicReferenceFieldUpdater3;
            this.f31970d = atomicReferenceFieldUpdater4;
            this.f31971e = atomicReferenceFieldUpdater5;
        }

        @Override // androidx.concurrent.futures.AbstractResolvableFuture.AbstractC3640b
        /* renamed from: a */
        public boolean mo58774a(AbstractResolvableFuture abstractResolvableFuture, C3642d c3642d, C3642d c3642d2) {
            return AbstractC13055p0.m23927a(this.f31970d, abstractResolvableFuture, c3642d, c3642d2);
        }

        @Override // androidx.concurrent.futures.AbstractResolvableFuture.AbstractC3640b
        /* renamed from: b */
        public boolean mo58773b(AbstractResolvableFuture abstractResolvableFuture, Object obj, Object obj2) {
            return AbstractC13055p0.m23927a(this.f31971e, abstractResolvableFuture, obj, obj2);
        }

        @Override // androidx.concurrent.futures.AbstractResolvableFuture.AbstractC3640b
        /* renamed from: c */
        public boolean mo58772c(AbstractResolvableFuture abstractResolvableFuture, C3646h c3646h, C3646h c3646h2) {
            return AbstractC13055p0.m23927a(this.f31969c, abstractResolvableFuture, c3646h, c3646h2);
        }

        @Override // androidx.concurrent.futures.AbstractResolvableFuture.AbstractC3640b
        /* renamed from: d */
        public void mo58771d(C3646h c3646h, C3646h c3646h2) {
            this.f31968b.lazySet(c3646h, c3646h2);
        }

        @Override // androidx.concurrent.futures.AbstractResolvableFuture.AbstractC3640b
        /* renamed from: e */
        public void mo58770e(C3646h c3646h, Thread thread) {
            this.f31967a.lazySet(c3646h, thread);
        }
    }

    /* renamed from: androidx.concurrent.futures.AbstractResolvableFuture$f */
    /* loaded from: classes2.dex */
    public static final class RunnableC3644f implements Runnable {

        /* renamed from: a */
        public final AbstractResolvableFuture f31972a;

        /* renamed from: b */
        public final ListenableFuture f31973b;

        public RunnableC3644f(AbstractResolvableFuture abstractResolvableFuture, ListenableFuture listenableFuture) {
            this.f31972a = abstractResolvableFuture;
            this.f31973b = listenableFuture;
        }

        @Override // java.lang.Runnable
        public void run() {
            if (this.f31972a.f31954a != this) {
                return;
            }
            if (AbstractResolvableFuture.f31952f.mo58773b(this.f31972a, this, AbstractResolvableFuture.m58779h(this.f31973b))) {
                AbstractResolvableFuture.m58782e(this.f31972a);
            }
        }
    }

    /* renamed from: androidx.concurrent.futures.AbstractResolvableFuture$g */
    /* loaded from: classes2.dex */
    public static final class C3645g extends AbstractC3640b {
        public C3645g() {
            super();
        }

        @Override // androidx.concurrent.futures.AbstractResolvableFuture.AbstractC3640b
        /* renamed from: a */
        public boolean mo58774a(AbstractResolvableFuture abstractResolvableFuture, C3642d c3642d, C3642d c3642d2) {
            synchronized (abstractResolvableFuture) {
                try {
                    if (abstractResolvableFuture.f31955b == c3642d) {
                        abstractResolvableFuture.f31955b = c3642d2;
                        return true;
                    }
                    return false;
                } catch (Throwable th2) {
                    throw th2;
                }
            }
        }

        @Override // androidx.concurrent.futures.AbstractResolvableFuture.AbstractC3640b
        /* renamed from: b */
        public boolean mo58773b(AbstractResolvableFuture abstractResolvableFuture, Object obj, Object obj2) {
            synchronized (abstractResolvableFuture) {
                try {
                    if (abstractResolvableFuture.f31954a == obj) {
                        abstractResolvableFuture.f31954a = obj2;
                        return true;
                    }
                    return false;
                } catch (Throwable th2) {
                    throw th2;
                }
            }
        }

        @Override // androidx.concurrent.futures.AbstractResolvableFuture.AbstractC3640b
        /* renamed from: c */
        public boolean mo58772c(AbstractResolvableFuture abstractResolvableFuture, C3646h c3646h, C3646h c3646h2) {
            synchronized (abstractResolvableFuture) {
                try {
                    if (abstractResolvableFuture.f31956c == c3646h) {
                        abstractResolvableFuture.f31956c = c3646h2;
                        return true;
                    }
                    return false;
                } catch (Throwable th2) {
                    throw th2;
                }
            }
        }

        @Override // androidx.concurrent.futures.AbstractResolvableFuture.AbstractC3640b
        /* renamed from: d */
        public void mo58771d(C3646h c3646h, C3646h c3646h2) {
            c3646h.f31976b = c3646h2;
        }

        @Override // androidx.concurrent.futures.AbstractResolvableFuture.AbstractC3640b
        /* renamed from: e */
        public void mo58770e(C3646h c3646h, Thread thread) {
            c3646h.f31975a = thread;
        }
    }

    /* renamed from: androidx.concurrent.futures.AbstractResolvableFuture$h */
    /* loaded from: classes2.dex */
    public static final class C3646h {

        /* renamed from: c */
        public static final C3646h f31974c = new C3646h(false);

        /* renamed from: a */
        public volatile Thread f31975a;

        /* renamed from: b */
        public volatile C3646h f31976b;

        public C3646h(boolean z) {
        }

        /* renamed from: a */
        public void m58769a(C3646h c3646h) {
            AbstractResolvableFuture.f31952f.mo58771d(this, c3646h);
        }

        /* renamed from: b */
        public void m58768b() {
            Thread thread = this.f31975a;
            if (thread != null) {
                this.f31975a = null;
                LockSupport.unpark(thread);
            }
        }

        public C3646h() {
            AbstractResolvableFuture.f31952f.mo58770e(this, Thread.currentThread());
        }
    }

    static {
        AbstractC3640b c3645g;
        try {
            c3645g = new C3643e(AtomicReferenceFieldUpdater.newUpdater(C3646h.class, Thread.class, PDPageLabelRange.STYLE_LETTERS_LOWER), AtomicReferenceFieldUpdater.newUpdater(C3646h.class, C3646h.class, OperatorName.CLOSE_FILL_NON_ZERO_AND_STROKE), AtomicReferenceFieldUpdater.newUpdater(AbstractResolvableFuture.class, C3646h.class, OperatorName.CURVE_TO), AtomicReferenceFieldUpdater.newUpdater(AbstractResolvableFuture.class, C3642d.class, OperatorName.CLOSE_FILL_NON_ZERO_AND_STROKE), AtomicReferenceFieldUpdater.newUpdater(AbstractResolvableFuture.class, Object.class, PDPageLabelRange.STYLE_LETTERS_LOWER));
            th = null;
        } catch (Throwable th2) {
            th = th2;
            c3645g = new C3645g();
        }
        f31952f = c3645g;
        if (th != null) {
            f31951e.log(Level.SEVERE, "SafeAtomicHelper is broken!", th);
        }
        f31953g = new Object();
    }

    /* renamed from: a */
    private void m58786a(StringBuilder sb) {
        try {
            Object m58778i = m58778i(this);
            sb.append("SUCCESS, result=[");
            sb.append(m58775l(m58778i));
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
    private static CancellationException m58785b(String str, Throwable th2) {
        CancellationException cancellationException = new CancellationException(str);
        cancellationException.initCause(th2);
        return cancellationException;
    }

    /* renamed from: c */
    public static Object m58784c(Object obj) {
        obj.getClass();
        return obj;
    }

    /* renamed from: e */
    public static void m58782e(AbstractResolvableFuture abstractResolvableFuture) {
        C3642d c3642d = null;
        while (true) {
            abstractResolvableFuture.m58777j();
            abstractResolvableFuture.afterDone();
            C3642d m58783d = abstractResolvableFuture.m58783d(c3642d);
            while (m58783d != null) {
                c3642d = m58783d.f31966c;
                Runnable runnable = m58783d.f31964a;
                if (runnable instanceof RunnableC3644f) {
                    RunnableC3644f runnableC3644f = (RunnableC3644f) runnable;
                    abstractResolvableFuture = runnableC3644f.f31972a;
                    if (abstractResolvableFuture.f31954a == runnableC3644f) {
                        if (f31952f.mo58773b(abstractResolvableFuture, runnableC3644f, m58779h(runnableC3644f.f31973b))) {
                            break;
                        }
                    } else {
                        continue;
                    }
                } else {
                    m58781f(runnable, m58783d.f31965b);
                }
                m58783d = c3642d;
            }
            return;
        }
    }

    /* renamed from: f */
    private static void m58781f(Runnable runnable, Executor executor) {
        try {
            executor.execute(runnable);
        } catch (RuntimeException e) {
            Logger logger = f31951e;
            Level level = Level.SEVERE;
            logger.log(level, "RuntimeException while executing runnable " + runnable + " with executor " + executor, (Throwable) e);
        }
    }

    /* renamed from: g */
    private Object m58780g(Object obj) {
        if (!(obj instanceof C3641c)) {
            if (!(obj instanceof Failure)) {
                if (obj == f31953g) {
                    return null;
                }
                return obj;
            }
            throw new ExecutionException(((Failure) obj).f31958a);
        }
        throw m58785b("Task was cancelled.", ((C3641c) obj).f31962b);
    }

    /* renamed from: h */
    public static Object m58779h(ListenableFuture listenableFuture) {
        if (listenableFuture instanceof AbstractResolvableFuture) {
            Object obj = ((AbstractResolvableFuture) listenableFuture).f31954a;
            if (obj instanceof C3641c) {
                C3641c c3641c = (C3641c) obj;
                if (c3641c.f31961a) {
                    if (c3641c.f31962b != null) {
                        return new C3641c(false, c3641c.f31962b);
                    }
                    return C3641c.f31960d;
                }
                return obj;
            }
            return obj;
        }
        boolean isCancelled = listenableFuture.isCancelled();
        if ((!f31950d) & isCancelled) {
            return C3641c.f31960d;
        }
        try {
            Object m58778i = m58778i(listenableFuture);
            if (m58778i == null) {
                return f31953g;
            }
            return m58778i;
        } catch (CancellationException e) {
            if (!isCancelled) {
                return new Failure(new IllegalArgumentException("get() threw CancellationException, despite reporting isCancelled() == false: " + listenableFuture, e));
            }
            return new C3641c(false, e);
        } catch (ExecutionException e2) {
            return new Failure(e2.getCause());
        } catch (Throwable th2) {
            return new Failure(th2);
        }
    }

    /* renamed from: i */
    public static Object m58778i(Future future) {
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
    private void m58777j() {
        C3646h c3646h;
        do {
            c3646h = this.f31956c;
        } while (!f31952f.mo58772c(this, c3646h, C3646h.f31974c));
        while (c3646h != null) {
            c3646h.m58768b();
            c3646h = c3646h.f31976b;
        }
    }

    @Override // com.google.common.util.concurrent.ListenableFuture
    public final void addListener(Runnable runnable, Executor executor) {
        m58784c(runnable);
        m58784c(executor);
        C3642d c3642d = this.f31955b;
        if (c3642d != C3642d.f31963d) {
            C3642d c3642d2 = new C3642d(runnable, executor);
            do {
                c3642d2.f31966c = c3642d;
                if (f31952f.mo58774a(this, c3642d, c3642d2)) {
                    return;
                }
                c3642d = this.f31955b;
            } while (c3642d != C3642d.f31963d);
            m58781f(runnable, executor);
        }
        m58781f(runnable, executor);
    }

    public void afterDone() {
    }

    @Override // java.util.concurrent.Future
    public final boolean cancel(boolean z) {
        boolean z2;
        C3641c c3641c;
        boolean z3;
        Object obj = this.f31954a;
        if (obj == null) {
            z2 = true;
        } else {
            z2 = false;
        }
        if (z2 | (obj instanceof RunnableC3644f)) {
            if (f31950d) {
                c3641c = new C3641c(z, new CancellationException("Future.cancel() was called."));
            } else if (z) {
                c3641c = C3641c.f31959c;
            } else {
                c3641c = C3641c.f31960d;
            }
            boolean z4 = false;
            AbstractResolvableFuture<V> abstractResolvableFuture = this;
            while (true) {
                if (f31952f.mo58773b(abstractResolvableFuture, obj, c3641c)) {
                    if (z) {
                        abstractResolvableFuture.interruptTask();
                    }
                    m58782e(abstractResolvableFuture);
                    if (!(obj instanceof RunnableC3644f)) {
                        return true;
                    }
                    ListenableFuture listenableFuture = ((RunnableC3644f) obj).f31973b;
                    if (listenableFuture instanceof AbstractResolvableFuture) {
                        abstractResolvableFuture = (AbstractResolvableFuture) listenableFuture;
                        obj = abstractResolvableFuture.f31954a;
                        if (obj == null) {
                            z3 = true;
                        } else {
                            z3 = false;
                        }
                        if (!(z3 | (obj instanceof RunnableC3644f))) {
                            return true;
                        }
                        z4 = true;
                    } else {
                        listenableFuture.cancel(z);
                        return true;
                    }
                } else {
                    obj = abstractResolvableFuture.f31954a;
                    if (!(obj instanceof RunnableC3644f)) {
                        return z4;
                    }
                }
            }
        } else {
            return false;
        }
    }

    /* renamed from: d */
    public final C3642d m58783d(C3642d c3642d) {
        C3642d c3642d2;
        do {
            c3642d2 = this.f31955b;
        } while (!f31952f.mo58774a(this, c3642d2, C3642d.f31963d));
        C3642d c3642d3 = c3642d;
        C3642d c3642d4 = c3642d2;
        while (c3642d4 != null) {
            C3642d c3642d5 = c3642d4.f31966c;
            c3642d4.f31966c = c3642d3;
            c3642d3 = c3642d4;
            c3642d4 = c3642d5;
        }
        return c3642d3;
    }

    @Override // java.util.concurrent.Future
    public final V get(long j, TimeUnit timeUnit) throws InterruptedException, TimeoutException, ExecutionException {
        Locale locale;
        long nanos = timeUnit.toNanos(j);
        if (!Thread.interrupted()) {
            Object obj = this.f31954a;
            if ((obj != null) & (!(obj instanceof RunnableC3644f))) {
                return (V) m58780g(obj);
            }
            long nanoTime = nanos > 0 ? System.nanoTime() + nanos : 0L;
            if (nanos >= 1000) {
                C3646h c3646h = this.f31956c;
                if (c3646h != C3646h.f31974c) {
                    C3646h c3646h2 = new C3646h();
                    do {
                        c3646h2.m58769a(c3646h);
                        if (f31952f.mo58772c(this, c3646h, c3646h2)) {
                            do {
                                LockSupport.parkNanos(this, nanos);
                                if (!Thread.interrupted()) {
                                    Object obj2 = this.f31954a;
                                    if ((obj2 != null) & (!(obj2 instanceof RunnableC3644f))) {
                                        return (V) m58780g(obj2);
                                    }
                                    nanos = nanoTime - System.nanoTime();
                                } else {
                                    m58776k(c3646h2);
                                    throw new InterruptedException();
                                }
                            } while (nanos >= 1000);
                            m58776k(c3646h2);
                        } else {
                            c3646h = this.f31956c;
                        }
                    } while (c3646h != C3646h.f31974c);
                    return (V) m58780g(this.f31954a);
                }
                return (V) m58780g(this.f31954a);
            }
            while (nanos > 0) {
                Object obj3 = this.f31954a;
                if ((obj3 != null) & (!(obj3 instanceof RunnableC3644f))) {
                    return (V) m58780g(obj3);
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
        return this.f31954a instanceof C3641c;
    }

    @Override // java.util.concurrent.Future
    public final boolean isDone() {
        boolean z;
        Object obj = this.f31954a;
        if (obj != null) {
            z = true;
        } else {
            z = false;
        }
        return (!(obj instanceof RunnableC3644f)) & z;
    }

    /* renamed from: k */
    public final void m58776k(C3646h c3646h) {
        c3646h.f31975a = null;
        while (true) {
            C3646h c3646h2 = this.f31956c;
            if (c3646h2 == C3646h.f31974c) {
                return;
            }
            C3646h c3646h3 = null;
            while (c3646h2 != null) {
                C3646h c3646h4 = c3646h2.f31976b;
                if (c3646h2.f31975a != null) {
                    c3646h3 = c3646h2;
                } else if (c3646h3 != null) {
                    c3646h3.f31976b = c3646h4;
                    if (c3646h3.f31975a == null) {
                        break;
                    }
                } else if (!f31952f.mo58772c(this, c3646h2, c3646h4)) {
                    break;
                }
                c3646h2 = c3646h4;
            }
            return;
        }
    }

    /* renamed from: l */
    public final String m58775l(Object obj) {
        if (obj == this) {
            return "this future";
        }
        return String.valueOf(obj);
    }

    @Nullable
    public String pendingToString() {
        Object obj = this.f31954a;
        if (obj instanceof RunnableC3644f) {
            return "setFuture=[" + m58775l(((RunnableC3644f) obj).f31973b) + "]";
        } else if (this instanceof ScheduledFuture) {
            return "remaining delay=[" + ((ScheduledFuture) this).getDelay(TimeUnit.MILLISECONDS) + " ms]";
        } else {
            return null;
        }
    }

    public boolean set(@Nullable V v) {
        if (v == null) {
            v = (V) f31953g;
        }
        if (f31952f.mo58773b(this, null, v)) {
            m58782e(this);
            return true;
        }
        return false;
    }

    public boolean setException(Throwable th2) {
        if (f31952f.mo58773b(this, null, new Failure((Throwable) m58784c(th2)))) {
            m58782e(this);
            return true;
        }
        return false;
    }

    public boolean setFuture(ListenableFuture<? extends V> listenableFuture) {
        Failure failure;
        m58784c(listenableFuture);
        Object obj = this.f31954a;
        if (obj == null) {
            if (listenableFuture.isDone()) {
                if (!f31952f.mo58773b(this, null, m58779h(listenableFuture))) {
                    return false;
                }
                m58782e(this);
                return true;
            }
            RunnableC3644f runnableC3644f = new RunnableC3644f(this, listenableFuture);
            if (f31952f.mo58773b(this, null, runnableC3644f)) {
                try {
                    listenableFuture.addListener(runnableC3644f, DirectExecutor.INSTANCE);
                } catch (Throwable th2) {
                    try {
                        failure = new Failure(th2);
                    } catch (Throwable unused) {
                        failure = Failure.f31957b;
                    }
                    f31952f.mo58773b(this, runnableC3644f, failure);
                }
                return true;
            }
            obj = this.f31954a;
        }
        if (obj instanceof C3641c) {
            listenableFuture.cancel(((C3641c) obj).f31961a);
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
            m58786a(sb);
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
                m58786a(sb);
            } else {
                sb.append("PENDING");
            }
        }
        sb.append("]");
        return sb.toString();
    }

    public final boolean wasInterrupted() {
        Object obj = this.f31954a;
        if ((obj instanceof C3641c) && ((C3641c) obj).f31961a) {
            return true;
        }
        return false;
    }

    @Override // java.util.concurrent.Future
    public final V get() throws InterruptedException, ExecutionException {
        Object obj;
        if (!Thread.interrupted()) {
            Object obj2 = this.f31954a;
            if ((obj2 != null) & (!(obj2 instanceof RunnableC3644f))) {
                return (V) m58780g(obj2);
            }
            C3646h c3646h = this.f31956c;
            if (c3646h != C3646h.f31974c) {
                C3646h c3646h2 = new C3646h();
                do {
                    c3646h2.m58769a(c3646h);
                    if (f31952f.mo58772c(this, c3646h, c3646h2)) {
                        do {
                            LockSupport.park(this);
                            if (!Thread.interrupted()) {
                                obj = this.f31954a;
                            } else {
                                m58776k(c3646h2);
                                throw new InterruptedException();
                            }
                        } while (!((obj != null) & (!(obj instanceof RunnableC3644f))));
                        return (V) m58780g(obj);
                    }
                    c3646h = this.f31956c;
                } while (c3646h != C3646h.f31974c);
                return (V) m58780g(this.f31954a);
            }
            return (V) m58780g(this.f31954a);
        }
        throw new InterruptedException();
    }
}
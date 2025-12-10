package androidx.work.impl.utils.futures;

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

@RestrictTo({RestrictTo.Scope.LIBRARY_GROUP})
/* loaded from: classes.dex */
public abstract class AbstractFuture<V> implements ListenableFuture<V> {

    /* renamed from: d */
    public static final boolean f38866d = Boolean.parseBoolean(System.getProperty("guava.concurrent.generate_cancellation_cause", "false"));

    /* renamed from: e */
    public static final Logger f38867e = Logger.getLogger(AbstractFuture.class.getName());

    /* renamed from: f */
    public static final AbstractC5295b f38868f;

    /* renamed from: g */
    public static final Object f38869g;

    /* renamed from: a */
    public volatile Object f38870a;

    /* renamed from: b */
    public volatile C5297d f38871b;

    /* renamed from: c */
    public volatile C5301h f38872c;

    /* loaded from: classes.dex */
    public static final class Failure {

        /* renamed from: b */
        public static final Failure f38873b = new Failure(new Throwable("Failure occurred while trying to finish a future.") { // from class: androidx.work.impl.utils.futures.AbstractFuture.Failure.1
            @Override // java.lang.Throwable
            public synchronized Throwable fillInStackTrace() {
                return this;
            }
        });

        /* renamed from: a */
        public final Throwable f38874a;

        public Failure(Throwable th2) {
            this.f38874a = (Throwable) AbstractFuture.m52100c(th2);
        }
    }

    /* renamed from: androidx.work.impl.utils.futures.AbstractFuture$b */
    /* loaded from: classes.dex */
    public static abstract class AbstractC5295b {
        public AbstractC5295b() {
        }

        /* renamed from: a */
        public abstract boolean mo52090a(AbstractFuture abstractFuture, C5297d c5297d, C5297d c5297d2);

        /* renamed from: b */
        public abstract boolean mo52089b(AbstractFuture abstractFuture, Object obj, Object obj2);

        /* renamed from: c */
        public abstract boolean mo52088c(AbstractFuture abstractFuture, C5301h c5301h, C5301h c5301h2);

        /* renamed from: d */
        public abstract void mo52087d(C5301h c5301h, C5301h c5301h2);

        /* renamed from: e */
        public abstract void mo52086e(C5301h c5301h, Thread thread);
    }

    /* renamed from: androidx.work.impl.utils.futures.AbstractFuture$c */
    /* loaded from: classes.dex */
    public static final class C5296c {

        /* renamed from: c */
        public static final C5296c f38875c;

        /* renamed from: d */
        public static final C5296c f38876d;

        /* renamed from: a */
        public final boolean f38877a;

        /* renamed from: b */
        public final Throwable f38878b;

        static {
            if (AbstractFuture.f38866d) {
                f38876d = null;
                f38875c = null;
                return;
            }
            f38876d = new C5296c(false, null);
            f38875c = new C5296c(true, null);
        }

        public C5296c(boolean z, Throwable th2) {
            this.f38877a = z;
            this.f38878b = th2;
        }
    }

    /* renamed from: androidx.work.impl.utils.futures.AbstractFuture$d */
    /* loaded from: classes.dex */
    public static final class C5297d {

        /* renamed from: d */
        public static final C5297d f38879d = new C5297d(null, null);

        /* renamed from: a */
        public final Runnable f38880a;

        /* renamed from: b */
        public final Executor f38881b;

        /* renamed from: c */
        public C5297d f38882c;

        public C5297d(Runnable runnable, Executor executor) {
            this.f38880a = runnable;
            this.f38881b = executor;
        }
    }

    /* renamed from: androidx.work.impl.utils.futures.AbstractFuture$e */
    /* loaded from: classes.dex */
    public static final class C5298e extends AbstractC5295b {

        /* renamed from: a */
        public final AtomicReferenceFieldUpdater f38883a;

        /* renamed from: b */
        public final AtomicReferenceFieldUpdater f38884b;

        /* renamed from: c */
        public final AtomicReferenceFieldUpdater f38885c;

        /* renamed from: d */
        public final AtomicReferenceFieldUpdater f38886d;

        /* renamed from: e */
        public final AtomicReferenceFieldUpdater f38887e;

        public C5298e(AtomicReferenceFieldUpdater atomicReferenceFieldUpdater, AtomicReferenceFieldUpdater atomicReferenceFieldUpdater2, AtomicReferenceFieldUpdater atomicReferenceFieldUpdater3, AtomicReferenceFieldUpdater atomicReferenceFieldUpdater4, AtomicReferenceFieldUpdater atomicReferenceFieldUpdater5) {
            super();
            this.f38883a = atomicReferenceFieldUpdater;
            this.f38884b = atomicReferenceFieldUpdater2;
            this.f38885c = atomicReferenceFieldUpdater3;
            this.f38886d = atomicReferenceFieldUpdater4;
            this.f38887e = atomicReferenceFieldUpdater5;
        }

        @Override // androidx.work.impl.utils.futures.AbstractFuture.AbstractC5295b
        /* renamed from: a */
        public boolean mo52090a(AbstractFuture abstractFuture, C5297d c5297d, C5297d c5297d2) {
            return AbstractC13055p0.m23927a(this.f38886d, abstractFuture, c5297d, c5297d2);
        }

        @Override // androidx.work.impl.utils.futures.AbstractFuture.AbstractC5295b
        /* renamed from: b */
        public boolean mo52089b(AbstractFuture abstractFuture, Object obj, Object obj2) {
            return AbstractC13055p0.m23927a(this.f38887e, abstractFuture, obj, obj2);
        }

        @Override // androidx.work.impl.utils.futures.AbstractFuture.AbstractC5295b
        /* renamed from: c */
        public boolean mo52088c(AbstractFuture abstractFuture, C5301h c5301h, C5301h c5301h2) {
            return AbstractC13055p0.m23927a(this.f38885c, abstractFuture, c5301h, c5301h2);
        }

        @Override // androidx.work.impl.utils.futures.AbstractFuture.AbstractC5295b
        /* renamed from: d */
        public void mo52087d(C5301h c5301h, C5301h c5301h2) {
            this.f38884b.lazySet(c5301h, c5301h2);
        }

        @Override // androidx.work.impl.utils.futures.AbstractFuture.AbstractC5295b
        /* renamed from: e */
        public void mo52086e(C5301h c5301h, Thread thread) {
            this.f38883a.lazySet(c5301h, thread);
        }
    }

    /* renamed from: androidx.work.impl.utils.futures.AbstractFuture$f */
    /* loaded from: classes.dex */
    public static final class RunnableC5299f implements Runnable {

        /* renamed from: a */
        public final AbstractFuture f38888a;

        /* renamed from: b */
        public final ListenableFuture f38889b;

        public RunnableC5299f(AbstractFuture abstractFuture, ListenableFuture listenableFuture) {
            this.f38888a = abstractFuture;
            this.f38889b = listenableFuture;
        }

        @Override // java.lang.Runnable
        public void run() {
            if (this.f38888a.f38870a != this) {
                return;
            }
            if (AbstractFuture.f38868f.mo52089b(this.f38888a, this, AbstractFuture.m52095h(this.f38889b))) {
                AbstractFuture.m52098e(this.f38888a);
            }
        }
    }

    /* renamed from: androidx.work.impl.utils.futures.AbstractFuture$g */
    /* loaded from: classes.dex */
    public static final class C5300g extends AbstractC5295b {
        public C5300g() {
            super();
        }

        @Override // androidx.work.impl.utils.futures.AbstractFuture.AbstractC5295b
        /* renamed from: a */
        public boolean mo52090a(AbstractFuture abstractFuture, C5297d c5297d, C5297d c5297d2) {
            synchronized (abstractFuture) {
                try {
                    if (abstractFuture.f38871b == c5297d) {
                        abstractFuture.f38871b = c5297d2;
                        return true;
                    }
                    return false;
                } catch (Throwable th2) {
                    throw th2;
                }
            }
        }

        @Override // androidx.work.impl.utils.futures.AbstractFuture.AbstractC5295b
        /* renamed from: b */
        public boolean mo52089b(AbstractFuture abstractFuture, Object obj, Object obj2) {
            synchronized (abstractFuture) {
                try {
                    if (abstractFuture.f38870a == obj) {
                        abstractFuture.f38870a = obj2;
                        return true;
                    }
                    return false;
                } catch (Throwable th2) {
                    throw th2;
                }
            }
        }

        @Override // androidx.work.impl.utils.futures.AbstractFuture.AbstractC5295b
        /* renamed from: c */
        public boolean mo52088c(AbstractFuture abstractFuture, C5301h c5301h, C5301h c5301h2) {
            synchronized (abstractFuture) {
                try {
                    if (abstractFuture.f38872c == c5301h) {
                        abstractFuture.f38872c = c5301h2;
                        return true;
                    }
                    return false;
                } catch (Throwable th2) {
                    throw th2;
                }
            }
        }

        @Override // androidx.work.impl.utils.futures.AbstractFuture.AbstractC5295b
        /* renamed from: d */
        public void mo52087d(C5301h c5301h, C5301h c5301h2) {
            c5301h.f38892b = c5301h2;
        }

        @Override // androidx.work.impl.utils.futures.AbstractFuture.AbstractC5295b
        /* renamed from: e */
        public void mo52086e(C5301h c5301h, Thread thread) {
            c5301h.f38891a = thread;
        }
    }

    /* renamed from: androidx.work.impl.utils.futures.AbstractFuture$h */
    /* loaded from: classes.dex */
    public static final class C5301h {

        /* renamed from: c */
        public static final C5301h f38890c = new C5301h(false);

        /* renamed from: a */
        public volatile Thread f38891a;

        /* renamed from: b */
        public volatile C5301h f38892b;

        public C5301h(boolean z) {
        }

        /* renamed from: a */
        public void m52085a(C5301h c5301h) {
            AbstractFuture.f38868f.mo52087d(this, c5301h);
        }

        /* renamed from: b */
        public void m52084b() {
            Thread thread = this.f38891a;
            if (thread != null) {
                this.f38891a = null;
                LockSupport.unpark(thread);
            }
        }

        public C5301h() {
            AbstractFuture.f38868f.mo52086e(this, Thread.currentThread());
        }
    }

    static {
        AbstractC5295b c5300g;
        try {
            c5300g = new C5298e(AtomicReferenceFieldUpdater.newUpdater(C5301h.class, Thread.class, PDPageLabelRange.STYLE_LETTERS_LOWER), AtomicReferenceFieldUpdater.newUpdater(C5301h.class, C5301h.class, OperatorName.CLOSE_FILL_NON_ZERO_AND_STROKE), AtomicReferenceFieldUpdater.newUpdater(AbstractFuture.class, C5301h.class, OperatorName.CURVE_TO), AtomicReferenceFieldUpdater.newUpdater(AbstractFuture.class, C5297d.class, OperatorName.CLOSE_FILL_NON_ZERO_AND_STROKE), AtomicReferenceFieldUpdater.newUpdater(AbstractFuture.class, Object.class, PDPageLabelRange.STYLE_LETTERS_LOWER));
            th = null;
        } catch (Throwable th2) {
            th = th2;
            c5300g = new C5300g();
        }
        f38868f = c5300g;
        if (th != null) {
            f38867e.log(Level.SEVERE, "SafeAtomicHelper is broken!", th);
        }
        f38869g = new Object();
    }

    /* renamed from: a */
    private void m52102a(StringBuilder sb) {
        try {
            Object m52094i = m52094i(this);
            sb.append("SUCCESS, result=[");
            sb.append(m52091l(m52094i));
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
    private static CancellationException m52101b(String str, Throwable th2) {
        CancellationException cancellationException = new CancellationException(str);
        cancellationException.initCause(th2);
        return cancellationException;
    }

    /* renamed from: c */
    public static Object m52100c(Object obj) {
        obj.getClass();
        return obj;
    }

    /* renamed from: e */
    public static void m52098e(AbstractFuture abstractFuture) {
        C5297d c5297d = null;
        while (true) {
            abstractFuture.m52093j();
            abstractFuture.afterDone();
            C5297d m52099d = abstractFuture.m52099d(c5297d);
            while (m52099d != null) {
                c5297d = m52099d.f38882c;
                Runnable runnable = m52099d.f38880a;
                if (runnable instanceof RunnableC5299f) {
                    RunnableC5299f runnableC5299f = (RunnableC5299f) runnable;
                    abstractFuture = runnableC5299f.f38888a;
                    if (abstractFuture.f38870a == runnableC5299f) {
                        if (f38868f.mo52089b(abstractFuture, runnableC5299f, m52095h(runnableC5299f.f38889b))) {
                            break;
                        }
                    } else {
                        continue;
                    }
                } else {
                    m52097f(runnable, m52099d.f38881b);
                }
                m52099d = c5297d;
            }
            return;
        }
    }

    /* renamed from: f */
    private static void m52097f(Runnable runnable, Executor executor) {
        try {
            executor.execute(runnable);
        } catch (RuntimeException e) {
            Logger logger = f38867e;
            Level level = Level.SEVERE;
            logger.log(level, "RuntimeException while executing runnable " + runnable + " with executor " + executor, (Throwable) e);
        }
    }

    /* renamed from: g */
    private Object m52096g(Object obj) {
        if (!(obj instanceof C5296c)) {
            if (!(obj instanceof Failure)) {
                if (obj == f38869g) {
                    return null;
                }
                return obj;
            }
            throw new ExecutionException(((Failure) obj).f38874a);
        }
        throw m52101b("Task was cancelled.", ((C5296c) obj).f38878b);
    }

    /* renamed from: h */
    public static Object m52095h(ListenableFuture listenableFuture) {
        if (listenableFuture instanceof AbstractFuture) {
            Object obj = ((AbstractFuture) listenableFuture).f38870a;
            if (obj instanceof C5296c) {
                C5296c c5296c = (C5296c) obj;
                if (c5296c.f38877a) {
                    if (c5296c.f38878b != null) {
                        return new C5296c(false, c5296c.f38878b);
                    }
                    return C5296c.f38876d;
                }
                return obj;
            }
            return obj;
        }
        boolean isCancelled = listenableFuture.isCancelled();
        if ((!f38866d) & isCancelled) {
            return C5296c.f38876d;
        }
        try {
            Object m52094i = m52094i(listenableFuture);
            if (m52094i == null) {
                return f38869g;
            }
            return m52094i;
        } catch (CancellationException e) {
            if (!isCancelled) {
                return new Failure(new IllegalArgumentException("get() threw CancellationException, despite reporting isCancelled() == false: " + listenableFuture, e));
            }
            return new C5296c(false, e);
        } catch (ExecutionException e2) {
            return new Failure(e2.getCause());
        } catch (Throwable th2) {
            return new Failure(th2);
        }
    }

    /* renamed from: i */
    private static Object m52094i(Future future) {
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
    private void m52093j() {
        C5301h c5301h;
        do {
            c5301h = this.f38872c;
        } while (!f38868f.mo52088c(this, c5301h, C5301h.f38890c));
        while (c5301h != null) {
            c5301h.m52084b();
            c5301h = c5301h.f38892b;
        }
    }

    /* renamed from: l */
    private String m52091l(Object obj) {
        if (obj == this) {
            return "this future";
        }
        return String.valueOf(obj);
    }

    @Override // com.google.common.util.concurrent.ListenableFuture
    public final void addListener(Runnable runnable, Executor executor) {
        m52100c(runnable);
        m52100c(executor);
        C5297d c5297d = this.f38871b;
        if (c5297d != C5297d.f38879d) {
            C5297d c5297d2 = new C5297d(runnable, executor);
            do {
                c5297d2.f38882c = c5297d;
                if (f38868f.mo52090a(this, c5297d, c5297d2)) {
                    return;
                }
                c5297d = this.f38871b;
            } while (c5297d != C5297d.f38879d);
            m52097f(runnable, executor);
        }
        m52097f(runnable, executor);
    }

    public void afterDone() {
    }

    @Override // java.util.concurrent.Future
    public final boolean cancel(boolean z) {
        boolean z2;
        C5296c c5296c;
        boolean z3;
        Object obj = this.f38870a;
        if (obj == null) {
            z2 = true;
        } else {
            z2 = false;
        }
        if (z2 | (obj instanceof RunnableC5299f)) {
            if (f38866d) {
                c5296c = new C5296c(z, new CancellationException("Future.cancel() was called."));
            } else if (z) {
                c5296c = C5296c.f38875c;
            } else {
                c5296c = C5296c.f38876d;
            }
            boolean z4 = false;
            AbstractFuture<V> abstractFuture = this;
            while (true) {
                if (f38868f.mo52089b(abstractFuture, obj, c5296c)) {
                    if (z) {
                        abstractFuture.interruptTask();
                    }
                    m52098e(abstractFuture);
                    if (!(obj instanceof RunnableC5299f)) {
                        return true;
                    }
                    ListenableFuture listenableFuture = ((RunnableC5299f) obj).f38889b;
                    if (listenableFuture instanceof AbstractFuture) {
                        abstractFuture = (AbstractFuture) listenableFuture;
                        obj = abstractFuture.f38870a;
                        if (obj == null) {
                            z3 = true;
                        } else {
                            z3 = false;
                        }
                        if (!(z3 | (obj instanceof RunnableC5299f))) {
                            return true;
                        }
                        z4 = true;
                    } else {
                        listenableFuture.cancel(z);
                        return true;
                    }
                } else {
                    obj = abstractFuture.f38870a;
                    if (!(obj instanceof RunnableC5299f)) {
                        return z4;
                    }
                }
            }
        } else {
            return false;
        }
    }

    /* renamed from: d */
    public final C5297d m52099d(C5297d c5297d) {
        C5297d c5297d2;
        do {
            c5297d2 = this.f38871b;
        } while (!f38868f.mo52090a(this, c5297d2, C5297d.f38879d));
        C5297d c5297d3 = c5297d;
        C5297d c5297d4 = c5297d2;
        while (c5297d4 != null) {
            C5297d c5297d5 = c5297d4.f38882c;
            c5297d4.f38882c = c5297d3;
            c5297d3 = c5297d4;
            c5297d4 = c5297d5;
        }
        return c5297d3;
    }

    @Override // java.util.concurrent.Future
    public final V get(long j, TimeUnit timeUnit) throws InterruptedException, TimeoutException, ExecutionException {
        Locale locale;
        long nanos = timeUnit.toNanos(j);
        if (!Thread.interrupted()) {
            Object obj = this.f38870a;
            if ((obj != null) & (!(obj instanceof RunnableC5299f))) {
                return (V) m52096g(obj);
            }
            long nanoTime = nanos > 0 ? System.nanoTime() + nanos : 0L;
            if (nanos >= 1000) {
                C5301h c5301h = this.f38872c;
                if (c5301h != C5301h.f38890c) {
                    C5301h c5301h2 = new C5301h();
                    do {
                        c5301h2.m52085a(c5301h);
                        if (f38868f.mo52088c(this, c5301h, c5301h2)) {
                            do {
                                LockSupport.parkNanos(this, nanos);
                                if (!Thread.interrupted()) {
                                    Object obj2 = this.f38870a;
                                    if ((obj2 != null) & (!(obj2 instanceof RunnableC5299f))) {
                                        return (V) m52096g(obj2);
                                    }
                                    nanos = nanoTime - System.nanoTime();
                                } else {
                                    m52092k(c5301h2);
                                    throw new InterruptedException();
                                }
                            } while (nanos >= 1000);
                            m52092k(c5301h2);
                        } else {
                            c5301h = this.f38872c;
                        }
                    } while (c5301h != C5301h.f38890c);
                    return (V) m52096g(this.f38870a);
                }
                return (V) m52096g(this.f38870a);
            }
            while (nanos > 0) {
                Object obj3 = this.f38870a;
                if ((obj3 != null) & (!(obj3 instanceof RunnableC5299f))) {
                    return (V) m52096g(obj3);
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

    @Override // java.util.concurrent.Future
    public final boolean isCancelled() {
        return this.f38870a instanceof C5296c;
    }

    @Override // java.util.concurrent.Future
    public final boolean isDone() {
        boolean z;
        Object obj = this.f38870a;
        if (obj != null) {
            z = true;
        } else {
            z = false;
        }
        return (!(obj instanceof RunnableC5299f)) & z;
    }

    /* renamed from: k */
    public final void m52092k(C5301h c5301h) {
        c5301h.f38891a = null;
        while (true) {
            C5301h c5301h2 = this.f38872c;
            if (c5301h2 == C5301h.f38890c) {
                return;
            }
            C5301h c5301h3 = null;
            while (c5301h2 != null) {
                C5301h c5301h4 = c5301h2.f38892b;
                if (c5301h2.f38891a != null) {
                    c5301h3 = c5301h2;
                } else if (c5301h3 != null) {
                    c5301h3.f38892b = c5301h4;
                    if (c5301h3.f38891a == null) {
                        break;
                    }
                } else if (!f38868f.mo52088c(this, c5301h2, c5301h4)) {
                    break;
                }
                c5301h2 = c5301h4;
            }
            return;
        }
    }

    @Nullable
    public String pendingToString() {
        Object obj = this.f38870a;
        if (obj instanceof RunnableC5299f) {
            return "setFuture=[" + m52091l(((RunnableC5299f) obj).f38889b) + "]";
        } else if (this instanceof ScheduledFuture) {
            return "remaining delay=[" + ((ScheduledFuture) this).getDelay(TimeUnit.MILLISECONDS) + " ms]";
        } else {
            return null;
        }
    }

    public boolean set(@Nullable V v) {
        if (v == null) {
            v = (V) f38869g;
        }
        if (f38868f.mo52089b(this, null, v)) {
            m52098e(this);
            return true;
        }
        return false;
    }

    public boolean setException(Throwable th2) {
        if (f38868f.mo52089b(this, null, new Failure((Throwable) m52100c(th2)))) {
            m52098e(this);
            return true;
        }
        return false;
    }

    public boolean setFuture(ListenableFuture<? extends V> listenableFuture) {
        Failure failure;
        m52100c(listenableFuture);
        Object obj = this.f38870a;
        if (obj == null) {
            if (listenableFuture.isDone()) {
                if (!f38868f.mo52089b(this, null, m52095h(listenableFuture))) {
                    return false;
                }
                m52098e(this);
                return true;
            }
            RunnableC5299f runnableC5299f = new RunnableC5299f(this, listenableFuture);
            if (f38868f.mo52089b(this, null, runnableC5299f)) {
                try {
                    listenableFuture.addListener(runnableC5299f, DirectExecutor.INSTANCE);
                } catch (Throwable th2) {
                    try {
                        failure = new Failure(th2);
                    } catch (Throwable unused) {
                        failure = Failure.f38873b;
                    }
                    f38868f.mo52089b(this, runnableC5299f, failure);
                }
                return true;
            }
            obj = this.f38870a;
        }
        if (obj instanceof C5296c) {
            listenableFuture.cancel(((C5296c) obj).f38877a);
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
            m52102a(sb);
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
                m52102a(sb);
            } else {
                sb.append("PENDING");
            }
        }
        sb.append("]");
        return sb.toString();
    }

    public final boolean wasInterrupted() {
        Object obj = this.f38870a;
        if ((obj instanceof C5296c) && ((C5296c) obj).f38877a) {
            return true;
        }
        return false;
    }

    @Override // java.util.concurrent.Future
    public final V get() throws InterruptedException, ExecutionException {
        Object obj;
        if (!Thread.interrupted()) {
            Object obj2 = this.f38870a;
            if ((obj2 != null) & (!(obj2 instanceof RunnableC5299f))) {
                return (V) m52096g(obj2);
            }
            C5301h c5301h = this.f38872c;
            if (c5301h != C5301h.f38890c) {
                C5301h c5301h2 = new C5301h();
                do {
                    c5301h2.m52085a(c5301h);
                    if (f38868f.mo52088c(this, c5301h, c5301h2)) {
                        do {
                            LockSupport.park(this);
                            if (!Thread.interrupted()) {
                                obj = this.f38870a;
                            } else {
                                m52092k(c5301h2);
                                throw new InterruptedException();
                            }
                        } while (!((obj != null) & (!(obj instanceof RunnableC5299f))));
                        return (V) m52096g(obj);
                    }
                    c5301h = this.f38872c;
                } while (c5301h != C5301h.f38890c);
                return (V) m52096g(this.f38870a);
            }
            return (V) m52096g(this.f38870a);
        }
        throw new InterruptedException();
    }
}
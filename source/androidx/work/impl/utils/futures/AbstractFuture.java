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
    public static final boolean f38778d = Boolean.parseBoolean(System.getProperty("guava.concurrent.generate_cancellation_cause", "false"));

    /* renamed from: e */
    public static final Logger f38779e = Logger.getLogger(AbstractFuture.class.getName());

    /* renamed from: f */
    public static final AbstractC5313b f38780f;

    /* renamed from: g */
    public static final Object f38781g;

    /* renamed from: a */
    public volatile Object f38782a;

    /* renamed from: b */
    public volatile C5315d f38783b;

    /* renamed from: c */
    public volatile C5319h f38784c;

    /* loaded from: classes.dex */
    public static final class Failure {

        /* renamed from: b */
        public static final Failure f38785b = new Failure(new Throwable("Failure occurred while trying to finish a future.") { // from class: androidx.work.impl.utils.futures.AbstractFuture.Failure.1
            @Override // java.lang.Throwable
            public synchronized Throwable fillInStackTrace() {
                return this;
            }
        });

        /* renamed from: a */
        public final Throwable f38786a;

        public Failure(Throwable th2) {
            this.f38786a = (Throwable) AbstractFuture.m52148c(th2);
        }
    }

    /* renamed from: androidx.work.impl.utils.futures.AbstractFuture$b */
    /* loaded from: classes.dex */
    public static abstract class AbstractC5313b {
        public AbstractC5313b() {
        }

        /* renamed from: a */
        public abstract boolean mo52138a(AbstractFuture abstractFuture, C5315d c5315d, C5315d c5315d2);

        /* renamed from: b */
        public abstract boolean mo52137b(AbstractFuture abstractFuture, Object obj, Object obj2);

        /* renamed from: c */
        public abstract boolean mo52136c(AbstractFuture abstractFuture, C5319h c5319h, C5319h c5319h2);

        /* renamed from: d */
        public abstract void mo52135d(C5319h c5319h, C5319h c5319h2);

        /* renamed from: e */
        public abstract void mo52134e(C5319h c5319h, Thread thread);
    }

    /* renamed from: androidx.work.impl.utils.futures.AbstractFuture$c */
    /* loaded from: classes.dex */
    public static final class C5314c {

        /* renamed from: c */
        public static final C5314c f38787c;

        /* renamed from: d */
        public static final C5314c f38788d;

        /* renamed from: a */
        public final boolean f38789a;

        /* renamed from: b */
        public final Throwable f38790b;

        static {
            if (AbstractFuture.f38778d) {
                f38788d = null;
                f38787c = null;
                return;
            }
            f38788d = new C5314c(false, null);
            f38787c = new C5314c(true, null);
        }

        public C5314c(boolean z, Throwable th2) {
            this.f38789a = z;
            this.f38790b = th2;
        }
    }

    /* renamed from: androidx.work.impl.utils.futures.AbstractFuture$d */
    /* loaded from: classes.dex */
    public static final class C5315d {

        /* renamed from: d */
        public static final C5315d f38791d = new C5315d(null, null);

        /* renamed from: a */
        public final Runnable f38792a;

        /* renamed from: b */
        public final Executor f38793b;

        /* renamed from: c */
        public C5315d f38794c;

        public C5315d(Runnable runnable, Executor executor) {
            this.f38792a = runnable;
            this.f38793b = executor;
        }
    }

    /* renamed from: androidx.work.impl.utils.futures.AbstractFuture$e */
    /* loaded from: classes.dex */
    public static final class C5316e extends AbstractC5313b {

        /* renamed from: a */
        public final AtomicReferenceFieldUpdater f38795a;

        /* renamed from: b */
        public final AtomicReferenceFieldUpdater f38796b;

        /* renamed from: c */
        public final AtomicReferenceFieldUpdater f38797c;

        /* renamed from: d */
        public final AtomicReferenceFieldUpdater f38798d;

        /* renamed from: e */
        public final AtomicReferenceFieldUpdater f38799e;

        public C5316e(AtomicReferenceFieldUpdater atomicReferenceFieldUpdater, AtomicReferenceFieldUpdater atomicReferenceFieldUpdater2, AtomicReferenceFieldUpdater atomicReferenceFieldUpdater3, AtomicReferenceFieldUpdater atomicReferenceFieldUpdater4, AtomicReferenceFieldUpdater atomicReferenceFieldUpdater5) {
            super();
            this.f38795a = atomicReferenceFieldUpdater;
            this.f38796b = atomicReferenceFieldUpdater2;
            this.f38797c = atomicReferenceFieldUpdater3;
            this.f38798d = atomicReferenceFieldUpdater4;
            this.f38799e = atomicReferenceFieldUpdater5;
        }

        @Override // androidx.work.impl.utils.futures.AbstractFuture.AbstractC5313b
        /* renamed from: a */
        public boolean mo52138a(AbstractFuture abstractFuture, C5315d c5315d, C5315d c5315d2) {
            return AbstractC13055p0.m23740a(this.f38798d, abstractFuture, c5315d, c5315d2);
        }

        @Override // androidx.work.impl.utils.futures.AbstractFuture.AbstractC5313b
        /* renamed from: b */
        public boolean mo52137b(AbstractFuture abstractFuture, Object obj, Object obj2) {
            return AbstractC13055p0.m23740a(this.f38799e, abstractFuture, obj, obj2);
        }

        @Override // androidx.work.impl.utils.futures.AbstractFuture.AbstractC5313b
        /* renamed from: c */
        public boolean mo52136c(AbstractFuture abstractFuture, C5319h c5319h, C5319h c5319h2) {
            return AbstractC13055p0.m23740a(this.f38797c, abstractFuture, c5319h, c5319h2);
        }

        @Override // androidx.work.impl.utils.futures.AbstractFuture.AbstractC5313b
        /* renamed from: d */
        public void mo52135d(C5319h c5319h, C5319h c5319h2) {
            this.f38796b.lazySet(c5319h, c5319h2);
        }

        @Override // androidx.work.impl.utils.futures.AbstractFuture.AbstractC5313b
        /* renamed from: e */
        public void mo52134e(C5319h c5319h, Thread thread) {
            this.f38795a.lazySet(c5319h, thread);
        }
    }

    /* renamed from: androidx.work.impl.utils.futures.AbstractFuture$f */
    /* loaded from: classes.dex */
    public static final class RunnableC5317f implements Runnable {

        /* renamed from: a */
        public final AbstractFuture f38800a;

        /* renamed from: b */
        public final ListenableFuture f38801b;

        public RunnableC5317f(AbstractFuture abstractFuture, ListenableFuture listenableFuture) {
            this.f38800a = abstractFuture;
            this.f38801b = listenableFuture;
        }

        @Override // java.lang.Runnable
        public void run() {
            if (this.f38800a.f38782a != this) {
                return;
            }
            if (AbstractFuture.f38780f.mo52137b(this.f38800a, this, AbstractFuture.m52143h(this.f38801b))) {
                AbstractFuture.m52146e(this.f38800a);
            }
        }
    }

    /* renamed from: androidx.work.impl.utils.futures.AbstractFuture$g */
    /* loaded from: classes.dex */
    public static final class C5318g extends AbstractC5313b {
        public C5318g() {
            super();
        }

        @Override // androidx.work.impl.utils.futures.AbstractFuture.AbstractC5313b
        /* renamed from: a */
        public boolean mo52138a(AbstractFuture abstractFuture, C5315d c5315d, C5315d c5315d2) {
            synchronized (abstractFuture) {
                try {
                    if (abstractFuture.f38783b == c5315d) {
                        abstractFuture.f38783b = c5315d2;
                        return true;
                    }
                    return false;
                } catch (Throwable th2) {
                    throw th2;
                }
            }
        }

        @Override // androidx.work.impl.utils.futures.AbstractFuture.AbstractC5313b
        /* renamed from: b */
        public boolean mo52137b(AbstractFuture abstractFuture, Object obj, Object obj2) {
            synchronized (abstractFuture) {
                try {
                    if (abstractFuture.f38782a == obj) {
                        abstractFuture.f38782a = obj2;
                        return true;
                    }
                    return false;
                } catch (Throwable th2) {
                    throw th2;
                }
            }
        }

        @Override // androidx.work.impl.utils.futures.AbstractFuture.AbstractC5313b
        /* renamed from: c */
        public boolean mo52136c(AbstractFuture abstractFuture, C5319h c5319h, C5319h c5319h2) {
            synchronized (abstractFuture) {
                try {
                    if (abstractFuture.f38784c == c5319h) {
                        abstractFuture.f38784c = c5319h2;
                        return true;
                    }
                    return false;
                } catch (Throwable th2) {
                    throw th2;
                }
            }
        }

        @Override // androidx.work.impl.utils.futures.AbstractFuture.AbstractC5313b
        /* renamed from: d */
        public void mo52135d(C5319h c5319h, C5319h c5319h2) {
            c5319h.f38804b = c5319h2;
        }

        @Override // androidx.work.impl.utils.futures.AbstractFuture.AbstractC5313b
        /* renamed from: e */
        public void mo52134e(C5319h c5319h, Thread thread) {
            c5319h.f38803a = thread;
        }
    }

    /* renamed from: androidx.work.impl.utils.futures.AbstractFuture$h */
    /* loaded from: classes.dex */
    public static final class C5319h {

        /* renamed from: c */
        public static final C5319h f38802c = new C5319h(false);

        /* renamed from: a */
        public volatile Thread f38803a;

        /* renamed from: b */
        public volatile C5319h f38804b;

        public C5319h(boolean z) {
        }

        /* renamed from: a */
        public void m52133a(C5319h c5319h) {
            AbstractFuture.f38780f.mo52135d(this, c5319h);
        }

        /* renamed from: b */
        public void m52132b() {
            Thread thread = this.f38803a;
            if (thread != null) {
                this.f38803a = null;
                LockSupport.unpark(thread);
            }
        }

        public C5319h() {
            AbstractFuture.f38780f.mo52134e(this, Thread.currentThread());
        }
    }

    static {
        AbstractC5313b c5318g;
        try {
            c5318g = new C5316e(AtomicReferenceFieldUpdater.newUpdater(C5319h.class, Thread.class, PDPageLabelRange.STYLE_LETTERS_LOWER), AtomicReferenceFieldUpdater.newUpdater(C5319h.class, C5319h.class, OperatorName.CLOSE_FILL_NON_ZERO_AND_STROKE), AtomicReferenceFieldUpdater.newUpdater(AbstractFuture.class, C5319h.class, OperatorName.CURVE_TO), AtomicReferenceFieldUpdater.newUpdater(AbstractFuture.class, C5315d.class, OperatorName.CLOSE_FILL_NON_ZERO_AND_STROKE), AtomicReferenceFieldUpdater.newUpdater(AbstractFuture.class, Object.class, PDPageLabelRange.STYLE_LETTERS_LOWER));
            th = null;
        } catch (Throwable th2) {
            th = th2;
            c5318g = new C5318g();
        }
        f38780f = c5318g;
        if (th != null) {
            f38779e.log(Level.SEVERE, "SafeAtomicHelper is broken!", th);
        }
        f38781g = new Object();
    }

    /* renamed from: a */
    private void m52150a(StringBuilder sb) {
        try {
            Object m52142i = m52142i(this);
            sb.append("SUCCESS, result=[");
            sb.append(m52139l(m52142i));
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
    private static CancellationException m52149b(String str, Throwable th2) {
        CancellationException cancellationException = new CancellationException(str);
        cancellationException.initCause(th2);
        return cancellationException;
    }

    /* renamed from: c */
    public static Object m52148c(Object obj) {
        obj.getClass();
        return obj;
    }

    /* renamed from: e */
    public static void m52146e(AbstractFuture abstractFuture) {
        C5315d c5315d = null;
        while (true) {
            abstractFuture.m52141j();
            abstractFuture.afterDone();
            C5315d m52147d = abstractFuture.m52147d(c5315d);
            while (m52147d != null) {
                c5315d = m52147d.f38794c;
                Runnable runnable = m52147d.f38792a;
                if (runnable instanceof RunnableC5317f) {
                    RunnableC5317f runnableC5317f = (RunnableC5317f) runnable;
                    abstractFuture = runnableC5317f.f38800a;
                    if (abstractFuture.f38782a == runnableC5317f) {
                        if (f38780f.mo52137b(abstractFuture, runnableC5317f, m52143h(runnableC5317f.f38801b))) {
                            break;
                        }
                    } else {
                        continue;
                    }
                } else {
                    m52145f(runnable, m52147d.f38793b);
                }
                m52147d = c5315d;
            }
            return;
        }
    }

    /* renamed from: f */
    private static void m52145f(Runnable runnable, Executor executor) {
        try {
            executor.execute(runnable);
        } catch (RuntimeException e) {
            Logger logger = f38779e;
            Level level = Level.SEVERE;
            logger.log(level, "RuntimeException while executing runnable " + runnable + " with executor " + executor, (Throwable) e);
        }
    }

    /* renamed from: g */
    private Object m52144g(Object obj) {
        if (!(obj instanceof C5314c)) {
            if (!(obj instanceof Failure)) {
                if (obj == f38781g) {
                    return null;
                }
                return obj;
            }
            throw new ExecutionException(((Failure) obj).f38786a);
        }
        throw m52149b("Task was cancelled.", ((C5314c) obj).f38790b);
    }

    /* renamed from: h */
    public static Object m52143h(ListenableFuture listenableFuture) {
        if (listenableFuture instanceof AbstractFuture) {
            Object obj = ((AbstractFuture) listenableFuture).f38782a;
            if (obj instanceof C5314c) {
                C5314c c5314c = (C5314c) obj;
                if (c5314c.f38789a) {
                    if (c5314c.f38790b != null) {
                        return new C5314c(false, c5314c.f38790b);
                    }
                    return C5314c.f38788d;
                }
                return obj;
            }
            return obj;
        }
        boolean isCancelled = listenableFuture.isCancelled();
        if ((!f38778d) & isCancelled) {
            return C5314c.f38788d;
        }
        try {
            Object m52142i = m52142i(listenableFuture);
            if (m52142i == null) {
                return f38781g;
            }
            return m52142i;
        } catch (CancellationException e) {
            if (!isCancelled) {
                return new Failure(new IllegalArgumentException("get() threw CancellationException, despite reporting isCancelled() == false: " + listenableFuture, e));
            }
            return new C5314c(false, e);
        } catch (ExecutionException e2) {
            return new Failure(e2.getCause());
        } catch (Throwable th2) {
            return new Failure(th2);
        }
    }

    /* renamed from: i */
    private static Object m52142i(Future future) {
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
    private void m52141j() {
        C5319h c5319h;
        do {
            c5319h = this.f38784c;
        } while (!f38780f.mo52136c(this, c5319h, C5319h.f38802c));
        while (c5319h != null) {
            c5319h.m52132b();
            c5319h = c5319h.f38804b;
        }
    }

    /* renamed from: l */
    private String m52139l(Object obj) {
        if (obj == this) {
            return "this future";
        }
        return String.valueOf(obj);
    }

    @Override // com.google.common.util.concurrent.ListenableFuture
    public final void addListener(Runnable runnable, Executor executor) {
        m52148c(runnable);
        m52148c(executor);
        C5315d c5315d = this.f38783b;
        if (c5315d != C5315d.f38791d) {
            C5315d c5315d2 = new C5315d(runnable, executor);
            do {
                c5315d2.f38794c = c5315d;
                if (f38780f.mo52138a(this, c5315d, c5315d2)) {
                    return;
                }
                c5315d = this.f38783b;
            } while (c5315d != C5315d.f38791d);
            m52145f(runnable, executor);
        }
        m52145f(runnable, executor);
    }

    public void afterDone() {
    }

    @Override // java.util.concurrent.Future
    public final boolean cancel(boolean z) {
        boolean z2;
        C5314c c5314c;
        boolean z3;
        Object obj = this.f38782a;
        if (obj == null) {
            z2 = true;
        } else {
            z2 = false;
        }
        if (z2 | (obj instanceof RunnableC5317f)) {
            if (f38778d) {
                c5314c = new C5314c(z, new CancellationException("Future.cancel() was called."));
            } else if (z) {
                c5314c = C5314c.f38787c;
            } else {
                c5314c = C5314c.f38788d;
            }
            boolean z4 = false;
            AbstractFuture<V> abstractFuture = this;
            while (true) {
                if (f38780f.mo52137b(abstractFuture, obj, c5314c)) {
                    if (z) {
                        abstractFuture.interruptTask();
                    }
                    m52146e(abstractFuture);
                    if (!(obj instanceof RunnableC5317f)) {
                        return true;
                    }
                    ListenableFuture listenableFuture = ((RunnableC5317f) obj).f38801b;
                    if (listenableFuture instanceof AbstractFuture) {
                        abstractFuture = (AbstractFuture) listenableFuture;
                        obj = abstractFuture.f38782a;
                        if (obj == null) {
                            z3 = true;
                        } else {
                            z3 = false;
                        }
                        if (!(z3 | (obj instanceof RunnableC5317f))) {
                            return true;
                        }
                        z4 = true;
                    } else {
                        listenableFuture.cancel(z);
                        return true;
                    }
                } else {
                    obj = abstractFuture.f38782a;
                    if (!(obj instanceof RunnableC5317f)) {
                        return z4;
                    }
                }
            }
        } else {
            return false;
        }
    }

    /* renamed from: d */
    public final C5315d m52147d(C5315d c5315d) {
        C5315d c5315d2;
        do {
            c5315d2 = this.f38783b;
        } while (!f38780f.mo52138a(this, c5315d2, C5315d.f38791d));
        C5315d c5315d3 = c5315d;
        C5315d c5315d4 = c5315d2;
        while (c5315d4 != null) {
            C5315d c5315d5 = c5315d4.f38794c;
            c5315d4.f38794c = c5315d3;
            c5315d3 = c5315d4;
            c5315d4 = c5315d5;
        }
        return c5315d3;
    }

    @Override // java.util.concurrent.Future
    public final V get(long j, TimeUnit timeUnit) throws InterruptedException, TimeoutException, ExecutionException {
        Locale locale;
        long nanos = timeUnit.toNanos(j);
        if (!Thread.interrupted()) {
            Object obj = this.f38782a;
            if ((obj != null) & (!(obj instanceof RunnableC5317f))) {
                return (V) m52144g(obj);
            }
            long nanoTime = nanos > 0 ? System.nanoTime() + nanos : 0L;
            if (nanos >= 1000) {
                C5319h c5319h = this.f38784c;
                if (c5319h != C5319h.f38802c) {
                    C5319h c5319h2 = new C5319h();
                    do {
                        c5319h2.m52133a(c5319h);
                        if (f38780f.mo52136c(this, c5319h, c5319h2)) {
                            do {
                                LockSupport.parkNanos(this, nanos);
                                if (!Thread.interrupted()) {
                                    Object obj2 = this.f38782a;
                                    if ((obj2 != null) & (!(obj2 instanceof RunnableC5317f))) {
                                        return (V) m52144g(obj2);
                                    }
                                    nanos = nanoTime - System.nanoTime();
                                } else {
                                    m52140k(c5319h2);
                                    throw new InterruptedException();
                                }
                            } while (nanos >= 1000);
                            m52140k(c5319h2);
                        } else {
                            c5319h = this.f38784c;
                        }
                    } while (c5319h != C5319h.f38802c);
                    return (V) m52144g(this.f38782a);
                }
                return (V) m52144g(this.f38782a);
            }
            while (nanos > 0) {
                Object obj3 = this.f38782a;
                if ((obj3 != null) & (!(obj3 instanceof RunnableC5317f))) {
                    return (V) m52144g(obj3);
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
        return this.f38782a instanceof C5314c;
    }

    @Override // java.util.concurrent.Future
    public final boolean isDone() {
        boolean z;
        Object obj = this.f38782a;
        if (obj != null) {
            z = true;
        } else {
            z = false;
        }
        return (!(obj instanceof RunnableC5317f)) & z;
    }

    /* renamed from: k */
    public final void m52140k(C5319h c5319h) {
        c5319h.f38803a = null;
        while (true) {
            C5319h c5319h2 = this.f38784c;
            if (c5319h2 == C5319h.f38802c) {
                return;
            }
            C5319h c5319h3 = null;
            while (c5319h2 != null) {
                C5319h c5319h4 = c5319h2.f38804b;
                if (c5319h2.f38803a != null) {
                    c5319h3 = c5319h2;
                } else if (c5319h3 != null) {
                    c5319h3.f38804b = c5319h4;
                    if (c5319h3.f38803a == null) {
                        break;
                    }
                } else if (!f38780f.mo52136c(this, c5319h2, c5319h4)) {
                    break;
                }
                c5319h2 = c5319h4;
            }
            return;
        }
    }

    @Nullable
    public String pendingToString() {
        Object obj = this.f38782a;
        if (obj instanceof RunnableC5317f) {
            return "setFuture=[" + m52139l(((RunnableC5317f) obj).f38801b) + "]";
        } else if (this instanceof ScheduledFuture) {
            return "remaining delay=[" + ((ScheduledFuture) this).getDelay(TimeUnit.MILLISECONDS) + " ms]";
        } else {
            return null;
        }
    }

    public boolean set(@Nullable V v) {
        if (v == null) {
            v = (V) f38781g;
        }
        if (f38780f.mo52137b(this, null, v)) {
            m52146e(this);
            return true;
        }
        return false;
    }

    public boolean setException(Throwable th2) {
        if (f38780f.mo52137b(this, null, new Failure((Throwable) m52148c(th2)))) {
            m52146e(this);
            return true;
        }
        return false;
    }

    public boolean setFuture(ListenableFuture<? extends V> listenableFuture) {
        Failure failure;
        m52148c(listenableFuture);
        Object obj = this.f38782a;
        if (obj == null) {
            if (listenableFuture.isDone()) {
                if (!f38780f.mo52137b(this, null, m52143h(listenableFuture))) {
                    return false;
                }
                m52146e(this);
                return true;
            }
            RunnableC5317f runnableC5317f = new RunnableC5317f(this, listenableFuture);
            if (f38780f.mo52137b(this, null, runnableC5317f)) {
                try {
                    listenableFuture.addListener(runnableC5317f, DirectExecutor.INSTANCE);
                } catch (Throwable th2) {
                    try {
                        failure = new Failure(th2);
                    } catch (Throwable unused) {
                        failure = Failure.f38785b;
                    }
                    f38780f.mo52137b(this, runnableC5317f, failure);
                }
                return true;
            }
            obj = this.f38782a;
        }
        if (obj instanceof C5314c) {
            listenableFuture.cancel(((C5314c) obj).f38789a);
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
            m52150a(sb);
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
                m52150a(sb);
            } else {
                sb.append("PENDING");
            }
        }
        sb.append("]");
        return sb.toString();
    }

    public final boolean wasInterrupted() {
        Object obj = this.f38782a;
        if ((obj instanceof C5314c) && ((C5314c) obj).f38789a) {
            return true;
        }
        return false;
    }

    @Override // java.util.concurrent.Future
    public final V get() throws InterruptedException, ExecutionException {
        Object obj;
        if (!Thread.interrupted()) {
            Object obj2 = this.f38782a;
            if ((obj2 != null) & (!(obj2 instanceof RunnableC5317f))) {
                return (V) m52144g(obj2);
            }
            C5319h c5319h = this.f38784c;
            if (c5319h != C5319h.f38802c) {
                C5319h c5319h2 = new C5319h();
                do {
                    c5319h2.m52133a(c5319h);
                    if (f38780f.mo52136c(this, c5319h, c5319h2)) {
                        do {
                            LockSupport.park(this);
                            if (!Thread.interrupted()) {
                                obj = this.f38782a;
                            } else {
                                m52140k(c5319h2);
                                throw new InterruptedException();
                            }
                        } while (!((obj != null) & (!(obj instanceof RunnableC5317f))));
                        return (V) m52144g(obj);
                    }
                    c5319h = this.f38784c;
                } while (c5319h != C5319h.f38802c);
                return (V) m52144g(this.f38782a);
            }
            return (V) m52144g(this.f38782a);
        }
        throw new InterruptedException();
    }
}

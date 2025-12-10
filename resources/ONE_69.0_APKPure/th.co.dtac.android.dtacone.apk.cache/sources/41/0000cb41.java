package io.grpc;

import io.grpc.AbstractC10556c;
import java.io.Closeable;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.concurrent.Callable;
import java.util.concurrent.Executor;
import java.util.concurrent.ScheduledExecutorService;
import java.util.concurrent.ScheduledFuture;
import java.util.concurrent.TimeUnit;
import java.util.concurrent.TimeoutException;
import java.util.concurrent.atomic.AtomicReference;
import java.util.logging.Level;
import java.util.logging.Logger;

/* loaded from: classes5.dex */
public class Context {

    /* renamed from: a */
    public final CancellableContext f63195a;

    /* renamed from: b */
    public final AbstractC10556c.InterfaceC10560d f63196b;

    /* renamed from: c */
    public final int f63197c;

    /* renamed from: d */
    public static final Logger f63194d = Logger.getLogger(Context.class.getName());
    public static final Context ROOT = new Context();

    /* loaded from: classes5.dex */
    public static final class CancellableContext extends Context implements Closeable {

        /* renamed from: e */
        public final Deadline f63198e;

        /* renamed from: f */
        public final Context f63199f;

        /* renamed from: g */
        public ArrayList f63200g;

        /* renamed from: h */
        public CancellationListener f63201h;

        /* renamed from: i */
        public Throwable f63202i;

        /* renamed from: j */
        public ScheduledFuture f63203j;

        /* renamed from: k */
        public boolean f63204k;

        /* renamed from: io.grpc.Context$CancellableContext$a */
        /* loaded from: classes5.dex */
        public class C10497a implements CancellationListener {
            public C10497a() {
            }

            @Override // io.grpc.Context.CancellationListener
            public void cancelled(Context context) {
                CancellableContext.this.cancel(context.cancellationCause());
            }
        }

        /* renamed from: io.grpc.Context$CancellableContext$b */
        /* loaded from: classes5.dex */
        public final class RunnableC10498b implements Runnable {
            public RunnableC10498b() {
            }

            @Override // java.lang.Runnable
            public void run() {
                try {
                    CancellableContext.this.cancel(new TimeoutException("context timed out"));
                } catch (Throwable th2) {
                    Context.f63194d.log(Level.SEVERE, "Cancel threw an exception, which should not happen", th2);
                }
            }
        }

        public /* synthetic */ CancellableContext(Context context, RunnableC10499a runnableC10499a) {
            this(context);
        }

        @Override // io.grpc.Context
        public void addListener(CancellationListener cancellationListener, Executor executor) {
            Context.m30791d(cancellationListener, "cancellationListener");
            Context.m30791d(executor, "executor");
            m30785m(new RunnableC10503e(executor, cancellationListener, this));
        }

        @Override // io.grpc.Context
        public Context attach() {
            return this.f63199f.attach();
        }

        public boolean cancel(Throwable th2) {
            ScheduledFuture scheduledFuture;
            boolean z;
            synchronized (this) {
                try {
                    scheduledFuture = null;
                    if (!this.f63204k) {
                        z = true;
                        this.f63204k = true;
                        ScheduledFuture scheduledFuture2 = this.f63203j;
                        if (scheduledFuture2 != null) {
                            this.f63203j = null;
                            scheduledFuture = scheduledFuture2;
                        }
                        this.f63202i = th2;
                    } else {
                        z = false;
                    }
                } catch (Throwable th3) {
                    throw th3;
                }
            }
            if (scheduledFuture != null) {
                scheduledFuture.cancel(false);
            }
            if (z) {
                m30784n();
            }
            return z;
        }

        @Override // io.grpc.Context
        public Throwable cancellationCause() {
            if (isCancelled()) {
                return this.f63202i;
            }
            return null;
        }

        @Override // java.io.Closeable, java.lang.AutoCloseable
        public void close() {
            cancel(null);
        }

        @Override // io.grpc.Context
        public void detach(Context context) {
            this.f63199f.detach(context);
        }

        public void detachAndCancel(Context context, Throwable th2) {
            try {
                detach(context);
            } finally {
                cancel(th2);
            }
        }

        @Override // io.grpc.Context
        public Deadline getDeadline() {
            return this.f63198e;
        }

        @Override // io.grpc.Context
        public boolean isCancelled() {
            synchronized (this) {
                try {
                    if (this.f63204k) {
                        return true;
                    }
                    if (super.isCancelled()) {
                        cancel(super.cancellationCause());
                        return true;
                    }
                    return false;
                } catch (Throwable th2) {
                    throw th2;
                }
            }
        }

        @Override // io.grpc.Context
        @Deprecated
        public boolean isCurrent() {
            return this.f63199f.isCurrent();
        }

        /* renamed from: m */
        public final void m30785m(RunnableC10503e runnableC10503e) {
            synchronized (this) {
                try {
                    if (isCancelled()) {
                        runnableC10503e.m30780b();
                    } else {
                        ArrayList arrayList = this.f63200g;
                        if (arrayList == null) {
                            ArrayList arrayList2 = new ArrayList();
                            this.f63200g = arrayList2;
                            arrayList2.add(runnableC10503e);
                            if (this.f63195a != null) {
                                C10497a c10497a = new C10497a();
                                this.f63201h = c10497a;
                                this.f63195a.m30785m(new RunnableC10503e(DirectExecutor.INSTANCE, c10497a, this));
                            }
                        } else {
                            arrayList.add(runnableC10503e);
                        }
                    }
                } catch (Throwable th2) {
                    throw th2;
                }
            }
        }

        /* renamed from: n */
        public final void m30784n() {
            synchronized (this) {
                try {
                    ArrayList arrayList = this.f63200g;
                    if (arrayList == null) {
                        return;
                    }
                    CancellationListener cancellationListener = this.f63201h;
                    this.f63201h = null;
                    this.f63200g = null;
                    Iterator it = arrayList.iterator();
                    while (it.hasNext()) {
                        RunnableC10503e runnableC10503e = (RunnableC10503e) it.next();
                        if (runnableC10503e.f63218c == this) {
                            runnableC10503e.m30780b();
                        }
                    }
                    Iterator it2 = arrayList.iterator();
                    while (it2.hasNext()) {
                        RunnableC10503e runnableC10503e2 = (RunnableC10503e) it2.next();
                        if (runnableC10503e2.f63218c != this) {
                            runnableC10503e2.m30780b();
                        }
                    }
                    CancellableContext cancellableContext = this.f63195a;
                    if (cancellableContext != null) {
                        cancellableContext.removeListener(cancellationListener);
                    }
                } catch (Throwable th2) {
                    throw th2;
                }
            }
        }

        /* renamed from: o */
        public final void m30783o(CancellationListener cancellationListener, Context context) {
            synchronized (this) {
                try {
                    ArrayList arrayList = this.f63200g;
                    if (arrayList != null) {
                        int size = arrayList.size() - 1;
                        while (true) {
                            if (size < 0) {
                                break;
                            }
                            RunnableC10503e runnableC10503e = (RunnableC10503e) this.f63200g.get(size);
                            if (runnableC10503e.f63217b == cancellationListener && runnableC10503e.f63218c == context) {
                                this.f63200g.remove(size);
                                break;
                            }
                            size--;
                        }
                        if (this.f63200g.isEmpty()) {
                            CancellableContext cancellableContext = this.f63195a;
                            if (cancellableContext != null) {
                                cancellableContext.removeListener(this.f63201h);
                            }
                            this.f63201h = null;
                            this.f63200g = null;
                        }
                    }
                } catch (Throwable th2) {
                    throw th2;
                }
            }
        }

        /* renamed from: p */
        public final void m30782p(Deadline deadline, ScheduledExecutorService scheduledExecutorService) {
            if (!deadline.isExpired()) {
                synchronized (this) {
                    this.f63203j = deadline.runOnExpiration(new RunnableC10498b(), scheduledExecutorService);
                }
                return;
            }
            cancel(new TimeoutException("context timed out"));
        }

        @Override // io.grpc.Context
        public void removeListener(CancellationListener cancellationListener) {
            m30783o(cancellationListener, this);
        }

        public /* synthetic */ CancellableContext(Context context, Deadline deadline, RunnableC10499a runnableC10499a) {
            this(context, deadline);
        }

        public CancellableContext(Context context) {
            super(context, context.f63196b, null);
            this.f63198e = context.getDeadline();
            this.f63199f = new Context(this, this.f63196b, null);
        }

        public CancellableContext(Context context, Deadline deadline) {
            super(context, context.f63196b, null);
            this.f63198e = deadline;
            this.f63199f = new Context(this, this.f63196b, null);
        }
    }

    /* loaded from: classes5.dex */
    public interface CancellationListener {
        void cancelled(Context context);
    }

    /* loaded from: classes5.dex */
    public enum DirectExecutor implements Executor {
        INSTANCE;

        @Override // java.util.concurrent.Executor
        public void execute(Runnable runnable) {
            runnable.run();
        }

        @Override // java.lang.Enum
        public String toString() {
            return "Context.DirectExecutor";
        }
    }

    /* loaded from: classes5.dex */
    public static final class Key<T> {

        /* renamed from: a */
        public final String f63207a;

        /* renamed from: b */
        public final Object f63208b;

        public Key(String str) {
            this(str, null);
        }

        public T get() {
            return get(Context.current());
        }

        public String toString() {
            return this.f63207a;
        }

        public Key(String str, Object obj) {
            this.f63207a = (String) Context.m30791d(str, "name");
            this.f63208b = obj;
        }

        public T get(Context context) {
            T t = (T) AbstractC10556c.m30624a(context.f63196b, this);
            return t == null ? (T) this.f63208b : t;
        }
    }

    /* loaded from: classes5.dex */
    public static abstract class Storage {
        public abstract Context current();

        public abstract void detach(Context context, Context context2);

        public abstract Context doAttach(Context context);
    }

    /* renamed from: io.grpc.Context$a */
    /* loaded from: classes5.dex */
    public class RunnableC10499a implements Runnable {

        /* renamed from: a */
        public final /* synthetic */ Runnable f63209a;

        public RunnableC10499a(Runnable runnable) {
            this.f63209a = runnable;
        }

        @Override // java.lang.Runnable
        public void run() {
            Context attach = Context.this.attach();
            try {
                this.f63209a.run();
            } finally {
                Context.this.detach(attach);
            }
        }
    }

    /* renamed from: io.grpc.Context$b */
    /* loaded from: classes5.dex */
    public final class ExecutorC10500b implements Executor {

        /* renamed from: a */
        public final /* synthetic */ Executor f63211a;

        public ExecutorC10500b(Executor executor) {
            this.f63211a = executor;
        }

        @Override // java.util.concurrent.Executor
        public void execute(Runnable runnable) {
            this.f63211a.execute(Context.current().wrap(runnable));
        }
    }

    /* renamed from: io.grpc.Context$c */
    /* loaded from: classes5.dex */
    public final class ExecutorC10501c implements Executor {

        /* renamed from: a */
        public final /* synthetic */ Executor f63212a;

        public ExecutorC10501c(Executor executor) {
            this.f63212a = executor;
        }

        @Override // java.util.concurrent.Executor
        public void execute(Runnable runnable) {
            this.f63212a.execute(Context.this.wrap(runnable));
        }
    }

    /* renamed from: io.grpc.Context$d */
    /* loaded from: classes5.dex */
    public class CallableC10502d implements Callable {

        /* renamed from: a */
        public final /* synthetic */ Callable f63214a;

        public CallableC10502d(Callable callable) {
            this.f63214a = callable;
        }

        @Override // java.util.concurrent.Callable
        public Object call() {
            Context attach = Context.this.attach();
            try {
                return this.f63214a.call();
            } finally {
                Context.this.detach(attach);
            }
        }
    }

    /* renamed from: io.grpc.Context$e */
    /* loaded from: classes5.dex */
    public static final class RunnableC10503e implements Runnable {

        /* renamed from: a */
        public final Executor f63216a;

        /* renamed from: b */
        public final CancellationListener f63217b;

        /* renamed from: c */
        public final Context f63218c;

        public RunnableC10503e(Executor executor, CancellationListener cancellationListener, Context context) {
            this.f63216a = executor;
            this.f63217b = cancellationListener;
            this.f63218c = context;
        }

        /* renamed from: b */
        public void m30780b() {
            try {
                this.f63216a.execute(this);
            } catch (Throwable th2) {
                Context.f63194d.log(Level.INFO, "Exception notifying context listener", th2);
            }
        }

        @Override // java.lang.Runnable
        public void run() {
            this.f63217b.cancelled(this.f63218c);
        }
    }

    /* renamed from: io.grpc.Context$f */
    /* loaded from: classes5.dex */
    public static final class C10504f {

        /* renamed from: a */
        public static final Storage f63219a;

        static {
            AtomicReference atomicReference = new AtomicReference();
            f63219a = m30779a(atomicReference);
            Throwable th2 = (Throwable) atomicReference.get();
            if (th2 != null) {
                Context.f63194d.log(Level.FINE, "Storage override doesn't exist. Using default", th2);
            }
        }

        /* renamed from: a */
        public static Storage m30779a(AtomicReference atomicReference) {
            try {
                return (Storage) Class.forName("io.grpc.override.ContextStorageOverride").asSubclass(Storage.class).getConstructor(null).newInstance(null);
            } catch (ClassNotFoundException e) {
                atomicReference.set(e);
                return new C10561d();
            } catch (Exception e2) {
                throw new RuntimeException("Storage override failed to initialize", e2);
            }
        }
    }

    public /* synthetic */ Context(Context context, AbstractC10556c.InterfaceC10560d interfaceC10560d, RunnableC10499a runnableC10499a) {
        this(context, interfaceC10560d);
    }

    /* renamed from: b */
    public static CancellableContext m30792b(Context context) {
        if (context instanceof CancellableContext) {
            return (CancellableContext) context;
        }
        return context.f63195a;
    }

    public static Context current() {
        Context current = m30790g().current();
        if (current == null) {
            return ROOT;
        }
        return current;
    }

    public static Executor currentContextExecutor(Executor executor) {
        return new ExecutorC10500b(executor);
    }

    /* renamed from: d */
    public static Object m30791d(Object obj, Object obj2) {
        if (obj != null) {
            return obj;
        }
        throw new NullPointerException(String.valueOf(obj2));
    }

    /* renamed from: g */
    public static Storage m30790g() {
        return C10504f.f63219a;
    }

    /* renamed from: i */
    public static void m30789i(int i) {
        if (i == 1000) {
            f63194d.log(Level.SEVERE, "Context ancestry chain length is abnormally long. This suggests an error in application code. Length exceeded: 1000", (Throwable) new Exception());
        }
    }

    public static <T> Key<T> key(String str) {
        return new Key<>(str);
    }

    public static <T> Key<T> keyWithDefault(String str, T t) {
        return new Key<>(str, t);
    }

    public void addListener(CancellationListener cancellationListener, Executor executor) {
        m30791d(cancellationListener, "cancellationListener");
        m30791d(executor, "executor");
        CancellableContext cancellableContext = this.f63195a;
        if (cancellableContext != null) {
            cancellableContext.m30785m(new RunnableC10503e(executor, cancellationListener, this));
        }
    }

    public Context attach() {
        Context doAttach = m30790g().doAttach(this);
        if (doAttach == null) {
            return ROOT;
        }
        return doAttach;
    }

    public <V> V call(Callable<V> callable) throws Exception {
        Context attach = attach();
        try {
            return callable.call();
        } finally {
            detach(attach);
        }
    }

    public Throwable cancellationCause() {
        CancellableContext cancellableContext = this.f63195a;
        if (cancellableContext == null) {
            return null;
        }
        return cancellableContext.cancellationCause();
    }

    public void detach(Context context) {
        m30791d(context, "toAttach");
        m30790g().detach(this, context);
    }

    public Executor fixedContextExecutor(Executor executor) {
        return new ExecutorC10501c(executor);
    }

    public Context fork() {
        return new Context(this.f63196b, this.f63197c + 1);
    }

    public Deadline getDeadline() {
        CancellableContext cancellableContext = this.f63195a;
        if (cancellableContext == null) {
            return null;
        }
        return cancellableContext.getDeadline();
    }

    public boolean isCancelled() {
        CancellableContext cancellableContext = this.f63195a;
        if (cancellableContext == null) {
            return false;
        }
        return cancellableContext.isCancelled();
    }

    public boolean isCurrent() {
        if (current() == this) {
            return true;
        }
        return false;
    }

    public void removeListener(CancellationListener cancellationListener) {
        CancellableContext cancellableContext = this.f63195a;
        if (cancellableContext != null) {
            cancellableContext.m30783o(cancellationListener, this);
        }
    }

    public void run(Runnable runnable) {
        Context attach = attach();
        try {
            runnable.run();
        } finally {
            detach(attach);
        }
    }

    public CancellableContext withCancellation() {
        return new CancellableContext(this, (RunnableC10499a) null);
    }

    public CancellableContext withDeadline(Deadline deadline, ScheduledExecutorService scheduledExecutorService) {
        boolean z;
        m30791d(deadline, "deadline");
        m30791d(scheduledExecutorService, "scheduler");
        Deadline deadline2 = getDeadline();
        if (deadline2 != null && deadline2.compareTo(deadline) <= 0) {
            deadline = deadline2;
            z = false;
        } else {
            z = true;
        }
        CancellableContext cancellableContext = new CancellableContext(this, deadline, null);
        if (z) {
            cancellableContext.m30782p(deadline, scheduledExecutorService);
        }
        return cancellableContext;
    }

    public CancellableContext withDeadlineAfter(long j, TimeUnit timeUnit, ScheduledExecutorService scheduledExecutorService) {
        return withDeadline(Deadline.after(j, timeUnit), scheduledExecutorService);
    }

    public <V> Context withValue(Key<V> key, V v) {
        return new Context(this, AbstractC10556c.m30623b(this.f63196b, key, v));
    }

    public <V1, V2> Context withValues(Key<V1> key, V1 v1, Key<V2> key2, V2 v2) {
        return new Context(this, AbstractC10556c.m30623b(AbstractC10556c.m30623b(this.f63196b, key, v1), key2, v2));
    }

    public Runnable wrap(Runnable runnable) {
        return new RunnableC10499a(runnable);
    }

    public Context(AbstractC10556c.InterfaceC10560d interfaceC10560d, int i) {
        this.f63195a = null;
        this.f63196b = interfaceC10560d;
        this.f63197c = i;
        m30789i(i);
    }

    public <C> Callable<C> wrap(Callable<C> callable) {
        return new CallableC10502d(callable);
    }

    public <V1, V2, V3> Context withValues(Key<V1> key, V1 v1, Key<V2> key2, V2 v2, Key<V3> key3, V3 v3) {
        return new Context(this, AbstractC10556c.m30623b(AbstractC10556c.m30623b(AbstractC10556c.m30623b(this.f63196b, key, v1), key2, v2), key3, v3));
    }

    public Context(Context context, AbstractC10556c.InterfaceC10560d interfaceC10560d) {
        this.f63195a = m30792b(context);
        this.f63196b = interfaceC10560d;
        int i = context.f63197c + 1;
        this.f63197c = i;
        m30789i(i);
    }

    public <V1, V2, V3, V4> Context withValues(Key<V1> key, V1 v1, Key<V2> key2, V2 v2, Key<V3> key3, V3 v3, Key<V4> key4, V4 v4) {
        return new Context(this, AbstractC10556c.m30623b(AbstractC10556c.m30623b(AbstractC10556c.m30623b(AbstractC10556c.m30623b(this.f63196b, key, v1), key2, v2), key3, v3), key4, v4));
    }

    public Context() {
        this.f63195a = null;
        this.f63196b = null;
        this.f63197c = 0;
        m30789i(0);
    }
}
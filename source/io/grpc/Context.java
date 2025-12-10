package io.grpc;

import io.grpc.AbstractC10569c;
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
    public final CancellableContext f63132a;

    /* renamed from: b */
    public final AbstractC10569c.InterfaceC10573d f63133b;

    /* renamed from: c */
    public final int f63134c;

    /* renamed from: d */
    public static final Logger f63131d = Logger.getLogger(Context.class.getName());
    public static final Context ROOT = new Context();

    /* loaded from: classes5.dex */
    public static final class CancellableContext extends Context implements Closeable {

        /* renamed from: e */
        public final Deadline f63135e;

        /* renamed from: f */
        public final Context f63136f;

        /* renamed from: g */
        public ArrayList f63137g;

        /* renamed from: h */
        public CancellationListener f63138h;

        /* renamed from: i */
        public Throwable f63139i;

        /* renamed from: j */
        public ScheduledFuture f63140j;

        /* renamed from: k */
        public boolean f63141k;

        /* renamed from: io.grpc.Context$CancellableContext$a */
        /* loaded from: classes5.dex */
        public class C10510a implements CancellationListener {
            public C10510a() {
            }

            @Override // io.grpc.Context.CancellationListener
            public void cancelled(Context context) {
                CancellableContext.this.cancel(context.cancellationCause());
            }
        }

        /* renamed from: io.grpc.Context$CancellableContext$b */
        /* loaded from: classes5.dex */
        public final class RunnableC10511b implements Runnable {
            public RunnableC10511b() {
            }

            @Override // java.lang.Runnable
            public void run() {
                try {
                    CancellableContext.this.cancel(new TimeoutException("context timed out"));
                } catch (Throwable th2) {
                    Context.f63131d.log(Level.SEVERE, "Cancel threw an exception, which should not happen", th2);
                }
            }
        }

        public /* synthetic */ CancellableContext(Context context, RunnableC10512a runnableC10512a) {
            this(context);
        }

        @Override // io.grpc.Context
        public void addListener(CancellationListener cancellationListener, Executor executor) {
            Context.m30451d(cancellationListener, "cancellationListener");
            Context.m30451d(executor, "executor");
            m30445m(new RunnableC10516e(executor, cancellationListener, this));
        }

        @Override // io.grpc.Context
        public Context attach() {
            return this.f63136f.attach();
        }

        public boolean cancel(Throwable th2) {
            ScheduledFuture scheduledFuture;
            boolean z;
            synchronized (this) {
                try {
                    scheduledFuture = null;
                    if (!this.f63141k) {
                        z = true;
                        this.f63141k = true;
                        ScheduledFuture scheduledFuture2 = this.f63140j;
                        if (scheduledFuture2 != null) {
                            this.f63140j = null;
                            scheduledFuture = scheduledFuture2;
                        }
                        this.f63139i = th2;
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
                m30444n();
            }
            return z;
        }

        @Override // io.grpc.Context
        public Throwable cancellationCause() {
            if (isCancelled()) {
                return this.f63139i;
            }
            return null;
        }

        @Override // java.io.Closeable, java.lang.AutoCloseable
        public void close() {
            cancel(null);
        }

        @Override // io.grpc.Context
        public void detach(Context context) {
            this.f63136f.detach(context);
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
            return this.f63135e;
        }

        @Override // io.grpc.Context
        public boolean isCancelled() {
            synchronized (this) {
                try {
                    if (this.f63141k) {
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
            return this.f63136f.isCurrent();
        }

        /* renamed from: m */
        public final void m30445m(RunnableC10516e runnableC10516e) {
            synchronized (this) {
                try {
                    if (isCancelled()) {
                        runnableC10516e.m30440b();
                    } else {
                        ArrayList arrayList = this.f63137g;
                        if (arrayList == null) {
                            ArrayList arrayList2 = new ArrayList();
                            this.f63137g = arrayList2;
                            arrayList2.add(runnableC10516e);
                            if (this.f63132a != null) {
                                C10510a c10510a = new C10510a();
                                this.f63138h = c10510a;
                                this.f63132a.m30445m(new RunnableC10516e(DirectExecutor.INSTANCE, c10510a, this));
                            }
                        } else {
                            arrayList.add(runnableC10516e);
                        }
                    }
                } catch (Throwable th2) {
                    throw th2;
                }
            }
        }

        /* renamed from: n */
        public final void m30444n() {
            synchronized (this) {
                try {
                    ArrayList arrayList = this.f63137g;
                    if (arrayList == null) {
                        return;
                    }
                    CancellationListener cancellationListener = this.f63138h;
                    this.f63138h = null;
                    this.f63137g = null;
                    Iterator it = arrayList.iterator();
                    while (it.hasNext()) {
                        RunnableC10516e runnableC10516e = (RunnableC10516e) it.next();
                        if (runnableC10516e.f63155c == this) {
                            runnableC10516e.m30440b();
                        }
                    }
                    Iterator it2 = arrayList.iterator();
                    while (it2.hasNext()) {
                        RunnableC10516e runnableC10516e2 = (RunnableC10516e) it2.next();
                        if (runnableC10516e2.f63155c != this) {
                            runnableC10516e2.m30440b();
                        }
                    }
                    CancellableContext cancellableContext = this.f63132a;
                    if (cancellableContext != null) {
                        cancellableContext.removeListener(cancellationListener);
                    }
                } catch (Throwable th2) {
                    throw th2;
                }
            }
        }

        /* renamed from: o */
        public final void m30443o(CancellationListener cancellationListener, Context context) {
            synchronized (this) {
                try {
                    ArrayList arrayList = this.f63137g;
                    if (arrayList != null) {
                        int size = arrayList.size() - 1;
                        while (true) {
                            if (size < 0) {
                                break;
                            }
                            RunnableC10516e runnableC10516e = (RunnableC10516e) this.f63137g.get(size);
                            if (runnableC10516e.f63154b == cancellationListener && runnableC10516e.f63155c == context) {
                                this.f63137g.remove(size);
                                break;
                            }
                            size--;
                        }
                        if (this.f63137g.isEmpty()) {
                            CancellableContext cancellableContext = this.f63132a;
                            if (cancellableContext != null) {
                                cancellableContext.removeListener(this.f63138h);
                            }
                            this.f63138h = null;
                            this.f63137g = null;
                        }
                    }
                } catch (Throwable th2) {
                    throw th2;
                }
            }
        }

        /* renamed from: p */
        public final void m30442p(Deadline deadline, ScheduledExecutorService scheduledExecutorService) {
            if (!deadline.isExpired()) {
                synchronized (this) {
                    this.f63140j = deadline.runOnExpiration(new RunnableC10511b(), scheduledExecutorService);
                }
                return;
            }
            cancel(new TimeoutException("context timed out"));
        }

        @Override // io.grpc.Context
        public void removeListener(CancellationListener cancellationListener) {
            m30443o(cancellationListener, this);
        }

        public /* synthetic */ CancellableContext(Context context, Deadline deadline, RunnableC10512a runnableC10512a) {
            this(context, deadline);
        }

        public CancellableContext(Context context) {
            super(context, context.f63133b, null);
            this.f63135e = context.getDeadline();
            this.f63136f = new Context(this, this.f63133b, null);
        }

        public CancellableContext(Context context, Deadline deadline) {
            super(context, context.f63133b, null);
            this.f63135e = deadline;
            this.f63136f = new Context(this, this.f63133b, null);
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
        public final String f63144a;

        /* renamed from: b */
        public final Object f63145b;

        public Key(String str) {
            this(str, null);
        }

        public T get() {
            return get(Context.current());
        }

        public String toString() {
            return this.f63144a;
        }

        public Key(String str, Object obj) {
            this.f63144a = (String) Context.m30451d(str, "name");
            this.f63145b = obj;
        }

        public T get(Context context) {
            T t = (T) AbstractC10569c.m30284a(context.f63133b, this);
            return t == null ? (T) this.f63145b : t;
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
    public class RunnableC10512a implements Runnable {

        /* renamed from: a */
        public final /* synthetic */ Runnable f63146a;

        public RunnableC10512a(Runnable runnable) {
            this.f63146a = runnable;
        }

        @Override // java.lang.Runnable
        public void run() {
            Context attach = Context.this.attach();
            try {
                this.f63146a.run();
            } finally {
                Context.this.detach(attach);
            }
        }
    }

    /* renamed from: io.grpc.Context$b */
    /* loaded from: classes5.dex */
    public final class ExecutorC10513b implements Executor {

        /* renamed from: a */
        public final /* synthetic */ Executor f63148a;

        public ExecutorC10513b(Executor executor) {
            this.f63148a = executor;
        }

        @Override // java.util.concurrent.Executor
        public void execute(Runnable runnable) {
            this.f63148a.execute(Context.current().wrap(runnable));
        }
    }

    /* renamed from: io.grpc.Context$c */
    /* loaded from: classes5.dex */
    public final class ExecutorC10514c implements Executor {

        /* renamed from: a */
        public final /* synthetic */ Executor f63149a;

        public ExecutorC10514c(Executor executor) {
            this.f63149a = executor;
        }

        @Override // java.util.concurrent.Executor
        public void execute(Runnable runnable) {
            this.f63149a.execute(Context.this.wrap(runnable));
        }
    }

    /* renamed from: io.grpc.Context$d */
    /* loaded from: classes5.dex */
    public class CallableC10515d implements Callable {

        /* renamed from: a */
        public final /* synthetic */ Callable f63151a;

        public CallableC10515d(Callable callable) {
            this.f63151a = callable;
        }

        @Override // java.util.concurrent.Callable
        public Object call() {
            Context attach = Context.this.attach();
            try {
                return this.f63151a.call();
            } finally {
                Context.this.detach(attach);
            }
        }
    }

    /* renamed from: io.grpc.Context$e */
    /* loaded from: classes5.dex */
    public static final class RunnableC10516e implements Runnable {

        /* renamed from: a */
        public final Executor f63153a;

        /* renamed from: b */
        public final CancellationListener f63154b;

        /* renamed from: c */
        public final Context f63155c;

        public RunnableC10516e(Executor executor, CancellationListener cancellationListener, Context context) {
            this.f63153a = executor;
            this.f63154b = cancellationListener;
            this.f63155c = context;
        }

        /* renamed from: b */
        public void m30440b() {
            try {
                this.f63153a.execute(this);
            } catch (Throwable th2) {
                Context.f63131d.log(Level.INFO, "Exception notifying context listener", th2);
            }
        }

        @Override // java.lang.Runnable
        public void run() {
            this.f63154b.cancelled(this.f63155c);
        }
    }

    /* renamed from: io.grpc.Context$f */
    /* loaded from: classes5.dex */
    public static final class C10517f {

        /* renamed from: a */
        public static final Storage f63156a;

        static {
            AtomicReference atomicReference = new AtomicReference();
            f63156a = m30439a(atomicReference);
            Throwable th2 = (Throwable) atomicReference.get();
            if (th2 != null) {
                Context.f63131d.log(Level.FINE, "Storage override doesn't exist. Using default", th2);
            }
        }

        /* renamed from: a */
        public static Storage m30439a(AtomicReference atomicReference) {
            try {
                return (Storage) Class.forName("io.grpc.override.ContextStorageOverride").asSubclass(Storage.class).getConstructor(null).newInstance(null);
            } catch (ClassNotFoundException e) {
                atomicReference.set(e);
                return new C10574d();
            } catch (Exception e2) {
                throw new RuntimeException("Storage override failed to initialize", e2);
            }
        }
    }

    public /* synthetic */ Context(Context context, AbstractC10569c.InterfaceC10573d interfaceC10573d, RunnableC10512a runnableC10512a) {
        this(context, interfaceC10573d);
    }

    /* renamed from: b */
    public static CancellableContext m30452b(Context context) {
        if (context instanceof CancellableContext) {
            return (CancellableContext) context;
        }
        return context.f63132a;
    }

    public static Context current() {
        Context current = m30450g().current();
        if (current == null) {
            return ROOT;
        }
        return current;
    }

    public static Executor currentContextExecutor(Executor executor) {
        return new ExecutorC10513b(executor);
    }

    /* renamed from: d */
    public static Object m30451d(Object obj, Object obj2) {
        if (obj != null) {
            return obj;
        }
        throw new NullPointerException(String.valueOf(obj2));
    }

    /* renamed from: g */
    public static Storage m30450g() {
        return C10517f.f63156a;
    }

    /* renamed from: i */
    public static void m30449i(int i) {
        if (i == 1000) {
            f63131d.log(Level.SEVERE, "Context ancestry chain length is abnormally long. This suggests an error in application code. Length exceeded: 1000", (Throwable) new Exception());
        }
    }

    public static <T> Key<T> key(String str) {
        return new Key<>(str);
    }

    public static <T> Key<T> keyWithDefault(String str, T t) {
        return new Key<>(str, t);
    }

    public void addListener(CancellationListener cancellationListener, Executor executor) {
        m30451d(cancellationListener, "cancellationListener");
        m30451d(executor, "executor");
        CancellableContext cancellableContext = this.f63132a;
        if (cancellableContext != null) {
            cancellableContext.m30445m(new RunnableC10516e(executor, cancellationListener, this));
        }
    }

    public Context attach() {
        Context doAttach = m30450g().doAttach(this);
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
        CancellableContext cancellableContext = this.f63132a;
        if (cancellableContext == null) {
            return null;
        }
        return cancellableContext.cancellationCause();
    }

    public void detach(Context context) {
        m30451d(context, "toAttach");
        m30450g().detach(this, context);
    }

    public Executor fixedContextExecutor(Executor executor) {
        return new ExecutorC10514c(executor);
    }

    public Context fork() {
        return new Context(this.f63133b, this.f63134c + 1);
    }

    public Deadline getDeadline() {
        CancellableContext cancellableContext = this.f63132a;
        if (cancellableContext == null) {
            return null;
        }
        return cancellableContext.getDeadline();
    }

    public boolean isCancelled() {
        CancellableContext cancellableContext = this.f63132a;
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
        CancellableContext cancellableContext = this.f63132a;
        if (cancellableContext != null) {
            cancellableContext.m30443o(cancellationListener, this);
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
        return new CancellableContext(this, (RunnableC10512a) null);
    }

    public CancellableContext withDeadline(Deadline deadline, ScheduledExecutorService scheduledExecutorService) {
        boolean z;
        m30451d(deadline, "deadline");
        m30451d(scheduledExecutorService, "scheduler");
        Deadline deadline2 = getDeadline();
        if (deadline2 != null && deadline2.compareTo(deadline) <= 0) {
            deadline = deadline2;
            z = false;
        } else {
            z = true;
        }
        CancellableContext cancellableContext = new CancellableContext(this, deadline, null);
        if (z) {
            cancellableContext.m30442p(deadline, scheduledExecutorService);
        }
        return cancellableContext;
    }

    public CancellableContext withDeadlineAfter(long j, TimeUnit timeUnit, ScheduledExecutorService scheduledExecutorService) {
        return withDeadline(Deadline.after(j, timeUnit), scheduledExecutorService);
    }

    public <V> Context withValue(Key<V> key, V v) {
        return new Context(this, AbstractC10569c.m30283b(this.f63133b, key, v));
    }

    public <V1, V2> Context withValues(Key<V1> key, V1 v1, Key<V2> key2, V2 v2) {
        return new Context(this, AbstractC10569c.m30283b(AbstractC10569c.m30283b(this.f63133b, key, v1), key2, v2));
    }

    public Runnable wrap(Runnable runnable) {
        return new RunnableC10512a(runnable);
    }

    public Context(AbstractC10569c.InterfaceC10573d interfaceC10573d, int i) {
        this.f63132a = null;
        this.f63133b = interfaceC10573d;
        this.f63134c = i;
        m30449i(i);
    }

    public <C> Callable<C> wrap(Callable<C> callable) {
        return new CallableC10515d(callable);
    }

    public <V1, V2, V3> Context withValues(Key<V1> key, V1 v1, Key<V2> key2, V2 v2, Key<V3> key3, V3 v3) {
        return new Context(this, AbstractC10569c.m30283b(AbstractC10569c.m30283b(AbstractC10569c.m30283b(this.f63133b, key, v1), key2, v2), key3, v3));
    }

    public Context(Context context, AbstractC10569c.InterfaceC10573d interfaceC10573d) {
        this.f63132a = m30452b(context);
        this.f63133b = interfaceC10573d;
        int i = context.f63134c + 1;
        this.f63134c = i;
        m30449i(i);
    }

    public <V1, V2, V3, V4> Context withValues(Key<V1> key, V1 v1, Key<V2> key2, V2 v2, Key<V3> key3, V3 v3, Key<V4> key4, V4 v4) {
        return new Context(this, AbstractC10569c.m30283b(AbstractC10569c.m30283b(AbstractC10569c.m30283b(AbstractC10569c.m30283b(this.f63133b, key, v1), key2, v2), key3, v3), key4, v4));
    }

    public Context() {
        this.f63132a = null;
        this.f63133b = null;
        this.f63134c = 0;
        m30449i(0);
    }
}

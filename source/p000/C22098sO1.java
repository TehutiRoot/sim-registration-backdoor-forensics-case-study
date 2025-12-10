package p000;

import com.google.common.base.Preconditions;
import com.google.common.eventbus.AllowConcurrentEvents;
import com.google.common.eventbus.EventBus;
import com.google.common.eventbus.SubscriberExceptionContext;
import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;
import java.util.concurrent.Executor;

/* renamed from: sO1 */
/* loaded from: classes4.dex */
public class C22098sO1 {

    /* renamed from: a */
    public EventBus f79765a;

    /* renamed from: b */
    public final Object f79766b;

    /* renamed from: c */
    public final Method f79767c;

    /* renamed from: d */
    public final Executor f79768d;

    /* renamed from: sO1$b */
    /* loaded from: classes4.dex */
    public static final class C13920b extends C22098sO1 {
        @Override // p000.C22098sO1
        /* renamed from: e */
        public void mo22618e(Object obj) {
            synchronized (this) {
                super.mo22618e(obj);
            }
        }

        public C13920b(EventBus eventBus, Object obj, Method method) {
            super(eventBus, obj, method);
        }
    }

    /* renamed from: a */
    public static /* synthetic */ void m22624a(C22098sO1 c22098sO1, Object obj) {
        c22098sO1.m22619g(obj);
    }

    /* renamed from: c */
    public static C22098sO1 m22622c(EventBus eventBus, Object obj, Method method) {
        if (m22620f(method)) {
            return new C22098sO1(eventBus, obj, method);
        }
        return new C13920b(eventBus, obj, method);
    }

    /* renamed from: f */
    public static boolean m22620f(Method method) {
        if (method.getAnnotation(AllowConcurrentEvents.class) != null) {
            return true;
        }
        return false;
    }

    /* renamed from: b */
    public final SubscriberExceptionContext m22623b(Object obj) {
        return new SubscriberExceptionContext(this.f79765a, obj, this.f79766b, this.f79767c);
    }

    /* renamed from: d */
    public final void m22621d(final Object obj) {
        this.f79768d.execute(new Runnable() { // from class: rO1
            {
                C22098sO1.this = this;
            }

            @Override // java.lang.Runnable
            public final void run() {
                C22098sO1.m22624a(C22098sO1.this, obj);
            }
        });
    }

    /* renamed from: e */
    public void mo22618e(Object obj) {
        try {
            this.f79767c.invoke(this.f79766b, Preconditions.checkNotNull(obj));
        } catch (IllegalAccessException e) {
            throw new Error("Method became inaccessible: " + obj, e);
        } catch (IllegalArgumentException e2) {
            throw new Error("Method rejected target/argument: " + obj, e2);
        } catch (InvocationTargetException e3) {
            if (e3.getCause() instanceof Error) {
                throw ((Error) e3.getCause());
            }
            throw e3;
        }
    }

    public final boolean equals(Object obj) {
        if (!(obj instanceof C22098sO1)) {
            return false;
        }
        C22098sO1 c22098sO1 = (C22098sO1) obj;
        if (this.f79766b != c22098sO1.f79766b || !this.f79767c.equals(c22098sO1.f79767c)) {
            return false;
        }
        return true;
    }

    /* renamed from: g */
    public final /* synthetic */ void m22619g(Object obj) {
        try {
            mo22618e(obj);
        } catch (InvocationTargetException e) {
            this.f79765a.m40170b(e.getCause(), m22623b(obj));
        }
    }

    public final int hashCode() {
        return ((this.f79767c.hashCode() + 31) * 31) + System.identityHashCode(this.f79766b);
    }

    public C22098sO1(EventBus eventBus, Object obj, Method method) {
        this.f79765a = eventBus;
        this.f79766b = Preconditions.checkNotNull(obj);
        this.f79767c = method;
        method.setAccessible(true);
        this.f79768d = eventBus.m40171a();
    }
}

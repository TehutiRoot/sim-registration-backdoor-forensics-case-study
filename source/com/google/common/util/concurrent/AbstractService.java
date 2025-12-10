package com.google.common.util.concurrent;

import com.google.common.annotations.GwtIncompatible;
import com.google.common.annotations.J2ktIncompatible;
import com.google.common.base.Preconditions;
import com.google.common.util.concurrent.C8312g;
import com.google.common.util.concurrent.Monitor;
import com.google.common.util.concurrent.Service;
import com.google.errorprone.annotations.CanIgnoreReturnValue;
import com.google.errorprone.annotations.ForOverride;
import java.util.Objects;
import java.util.concurrent.Executor;
import java.util.concurrent.TimeUnit;
import java.util.concurrent.TimeoutException;

@J2ktIncompatible
@GwtIncompatible
/* loaded from: classes4.dex */
public abstract class AbstractService implements Service {

    /* renamed from: h */
    public static final C8312g.InterfaceC8313a f54214h = new C8204a();

    /* renamed from: i */
    public static final C8312g.InterfaceC8313a f54215i = new C8205b();

    /* renamed from: j */
    public static final C8312g.InterfaceC8313a f54216j;

    /* renamed from: k */
    public static final C8312g.InterfaceC8313a f54217k;

    /* renamed from: l */
    public static final C8312g.InterfaceC8313a f54218l;

    /* renamed from: m */
    public static final C8312g.InterfaceC8313a f54219m;

    /* renamed from: n */
    public static final C8312g.InterfaceC8313a f54220n;

    /* renamed from: o */
    public static final C8312g.InterfaceC8313a f54221o;

    /* renamed from: a */
    public final Monitor f54222a = new Monitor();

    /* renamed from: b */
    public final Monitor.Guard f54223b = new C8211h();

    /* renamed from: c */
    public final Monitor.Guard f54224c = new C8212i();

    /* renamed from: d */
    public final Monitor.Guard f54225d = new C8210g();

    /* renamed from: e */
    public final Monitor.Guard f54226e = new C8213j();

    /* renamed from: f */
    public final C8312g f54227f = new C8312g();

    /* renamed from: g */
    public volatile C8214k f54228g = new C8214k(Service.State.NEW);

    /* renamed from: com.google.common.util.concurrent.AbstractService$a */
    /* loaded from: classes4.dex */
    public class C8204a implements C8312g.InterfaceC8313a {
        @Override // com.google.common.util.concurrent.C8312g.InterfaceC8313a
        /* renamed from: a */
        public void call(Service.Listener listener) {
            listener.starting();
        }

        public String toString() {
            return "starting()";
        }
    }

    /* renamed from: com.google.common.util.concurrent.AbstractService$b */
    /* loaded from: classes4.dex */
    public class C8205b implements C8312g.InterfaceC8313a {
        @Override // com.google.common.util.concurrent.C8312g.InterfaceC8313a
        /* renamed from: a */
        public void call(Service.Listener listener) {
            listener.running();
        }

        public String toString() {
            return "running()";
        }
    }

    /* renamed from: com.google.common.util.concurrent.AbstractService$c */
    /* loaded from: classes4.dex */
    public class C8206c implements C8312g.InterfaceC8313a {

        /* renamed from: a */
        public final /* synthetic */ Service.State f54229a;

        public C8206c(Service.State state) {
            this.f54229a = state;
        }

        @Override // com.google.common.util.concurrent.C8312g.InterfaceC8313a
        /* renamed from: a */
        public void call(Service.Listener listener) {
            listener.terminated(this.f54229a);
        }

        public String toString() {
            return "terminated({from = " + this.f54229a + "})";
        }
    }

    /* renamed from: com.google.common.util.concurrent.AbstractService$d */
    /* loaded from: classes4.dex */
    public class C8207d implements C8312g.InterfaceC8313a {

        /* renamed from: a */
        public final /* synthetic */ Service.State f54230a;

        public C8207d(Service.State state) {
            this.f54230a = state;
        }

        @Override // com.google.common.util.concurrent.C8312g.InterfaceC8313a
        /* renamed from: a */
        public void call(Service.Listener listener) {
            listener.stopping(this.f54230a);
        }

        public String toString() {
            return "stopping({from = " + this.f54230a + "})";
        }
    }

    /* renamed from: com.google.common.util.concurrent.AbstractService$e */
    /* loaded from: classes4.dex */
    public class C8208e implements C8312g.InterfaceC8313a {

        /* renamed from: a */
        public final /* synthetic */ Service.State f54231a;

        /* renamed from: b */
        public final /* synthetic */ Throwable f54232b;

        /* renamed from: c */
        public final /* synthetic */ AbstractService f54233c;

        public C8208e(AbstractService abstractService, Service.State state, Throwable th2) {
            this.f54231a = state;
            this.f54232b = th2;
            this.f54233c = abstractService;
        }

        @Override // com.google.common.util.concurrent.C8312g.InterfaceC8313a
        /* renamed from: a */
        public void call(Service.Listener listener) {
            listener.failed(this.f54231a, this.f54232b);
        }

        public String toString() {
            return "failed({from = " + this.f54231a + ", cause = " + this.f54232b + "})";
        }
    }

    /* renamed from: com.google.common.util.concurrent.AbstractService$f */
    /* loaded from: classes4.dex */
    public static /* synthetic */ class C8209f {

        /* renamed from: a */
        public static final /* synthetic */ int[] f54234a;

        static {
            int[] iArr = new int[Service.State.values().length];
            f54234a = iArr;
            try {
                iArr[Service.State.NEW.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                f54234a[Service.State.STARTING.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            try {
                f54234a[Service.State.RUNNING.ordinal()] = 3;
            } catch (NoSuchFieldError unused3) {
            }
            try {
                f54234a[Service.State.STOPPING.ordinal()] = 4;
            } catch (NoSuchFieldError unused4) {
            }
            try {
                f54234a[Service.State.TERMINATED.ordinal()] = 5;
            } catch (NoSuchFieldError unused5) {
            }
            try {
                f54234a[Service.State.FAILED.ordinal()] = 6;
            } catch (NoSuchFieldError unused6) {
            }
        }
    }

    /* renamed from: com.google.common.util.concurrent.AbstractService$g */
    /* loaded from: classes4.dex */
    public final class C8210g extends Monitor.Guard {
        public C8210g() {
            super(AbstractService.this.f54222a);
        }

        @Override // com.google.common.util.concurrent.Monitor.Guard
        public boolean isSatisfied() {
            if (AbstractService.this.state().compareTo(Service.State.RUNNING) >= 0) {
                return true;
            }
            return false;
        }
    }

    /* renamed from: com.google.common.util.concurrent.AbstractService$h */
    /* loaded from: classes4.dex */
    public final class C8211h extends Monitor.Guard {
        public C8211h() {
            super(AbstractService.this.f54222a);
        }

        @Override // com.google.common.util.concurrent.Monitor.Guard
        public boolean isSatisfied() {
            if (AbstractService.this.state() == Service.State.NEW) {
                return true;
            }
            return false;
        }
    }

    /* renamed from: com.google.common.util.concurrent.AbstractService$i */
    /* loaded from: classes4.dex */
    public final class C8212i extends Monitor.Guard {
        public C8212i() {
            super(AbstractService.this.f54222a);
        }

        @Override // com.google.common.util.concurrent.Monitor.Guard
        public boolean isSatisfied() {
            if (AbstractService.this.state().compareTo(Service.State.RUNNING) <= 0) {
                return true;
            }
            return false;
        }
    }

    /* renamed from: com.google.common.util.concurrent.AbstractService$j */
    /* loaded from: classes4.dex */
    public final class C8213j extends Monitor.Guard {
        public C8213j() {
            super(AbstractService.this.f54222a);
        }

        @Override // com.google.common.util.concurrent.Monitor.Guard
        public boolean isSatisfied() {
            if (AbstractService.this.state().compareTo(Service.State.TERMINATED) >= 0) {
                return true;
            }
            return false;
        }
    }

    /* renamed from: com.google.common.util.concurrent.AbstractService$k */
    /* loaded from: classes4.dex */
    public static final class C8214k {

        /* renamed from: a */
        public final Service.State f54239a;

        /* renamed from: b */
        public final boolean f54240b;

        /* renamed from: c */
        public final Throwable f54241c;

        public C8214k(Service.State state) {
            this(state, false, null);
        }

        /* renamed from: a */
        public Service.State m39615a() {
            if (this.f54240b && this.f54239a == Service.State.STARTING) {
                return Service.State.STOPPING;
            }
            return this.f54239a;
        }

        /* renamed from: b */
        public Throwable m39614b() {
            boolean z;
            Service.State state = this.f54239a;
            if (state == Service.State.FAILED) {
                z = true;
            } else {
                z = false;
            }
            Preconditions.checkState(z, "failureCause() is only valid if the service has failed, service is %s", state);
            Throwable th2 = this.f54241c;
            Objects.requireNonNull(th2);
            return th2;
        }

        public C8214k(Service.State state, boolean z, Throwable th2) {
            Preconditions.checkArgument(!z || state == Service.State.STARTING, "shutdownWhenStartupFinishes can only be set if state is STARTING. Got %s instead.", state);
            Preconditions.checkArgument((th2 != null) == (state == Service.State.FAILED), "A failure cause should be set if and only if the state is failed.  Got %s and %s instead.", state, th2);
            this.f54239a = state;
            this.f54240b = z;
            this.f54241c = th2;
        }
    }

    static {
        Service.State state = Service.State.STARTING;
        f54216j = m39622i(state);
        Service.State state2 = Service.State.RUNNING;
        f54217k = m39622i(state2);
        f54218l = m39621j(Service.State.NEW);
        f54219m = m39621j(state);
        f54220n = m39621j(state2);
        f54221o = m39621j(Service.State.STOPPING);
    }

    /* renamed from: i */
    public static C8312g.InterfaceC8313a m39622i(Service.State state) {
        return new C8207d(state);
    }

    /* renamed from: j */
    public static C8312g.InterfaceC8313a m39621j(Service.State state) {
        return new C8206c(state);
    }

    @Override // com.google.common.util.concurrent.Service
    public final void addListener(Service.Listener listener, Executor executor) {
        this.f54227f.m39357b(listener, executor);
    }

    @Override // com.google.common.util.concurrent.Service
    public final void awaitRunning() {
        this.f54222a.enterWhenUninterruptibly(this.f54225d);
        try {
            m39629b(Service.State.RUNNING);
        } finally {
            this.f54222a.leave();
        }
    }

    @Override // com.google.common.util.concurrent.Service
    public final void awaitTerminated() {
        this.f54222a.enterWhenUninterruptibly(this.f54226e);
        try {
            m39629b(Service.State.TERMINATED);
        } finally {
            this.f54222a.leave();
        }
    }

    /* renamed from: b */
    public final void m39629b(Service.State state) {
        Service.State state2 = state();
        if (state2 != state) {
            if (state2 == Service.State.FAILED) {
                throw new IllegalStateException("Expected the service " + this + " to be " + state + ", but the service has FAILED", failureCause());
            }
            throw new IllegalStateException("Expected the service " + this + " to be " + state + ", but was " + state2);
        }
    }

    /* renamed from: c */
    public final void m39628c() {
        if (!this.f54222a.isOccupiedByCurrentThread()) {
            this.f54227f.m39356c();
        }
    }

    /* renamed from: d */
    public final void m39627d(Service.State state, Throwable th2) {
        this.f54227f.m39355d(new C8208e(this, state, th2));
    }

    @ForOverride
    public void doCancelStart() {
    }

    @ForOverride
    public abstract void doStart();

    @ForOverride
    public abstract void doStop();

    /* renamed from: e */
    public final void m39626e() {
        this.f54227f.m39355d(f54215i);
    }

    /* renamed from: f */
    public final void m39625f() {
        this.f54227f.m39355d(f54214h);
    }

    @Override // com.google.common.util.concurrent.Service
    public final Throwable failureCause() {
        return this.f54228g.m39614b();
    }

    /* renamed from: g */
    public final void m39624g(Service.State state) {
        if (state == Service.State.STARTING) {
            this.f54227f.m39355d(f54216j);
        } else if (state == Service.State.RUNNING) {
            this.f54227f.m39355d(f54217k);
        } else {
            throw new AssertionError();
        }
    }

    /* renamed from: h */
    public final void m39623h(Service.State state) {
        switch (C8209f.f54234a[state.ordinal()]) {
            case 1:
                this.f54227f.m39355d(f54218l);
                return;
            case 2:
                this.f54227f.m39355d(f54219m);
                return;
            case 3:
                this.f54227f.m39355d(f54220n);
                return;
            case 4:
                this.f54227f.m39355d(f54221o);
                return;
            case 5:
            case 6:
                throw new AssertionError();
            default:
                return;
        }
    }

    @Override // com.google.common.util.concurrent.Service
    public final boolean isRunning() {
        if (state() == Service.State.RUNNING) {
            return true;
        }
        return false;
    }

    public final void notifyFailed(Throwable th2) {
        Preconditions.checkNotNull(th2);
        this.f54222a.enter();
        try {
            Service.State state = state();
            int i = C8209f.f54234a[state.ordinal()];
            if (i != 1) {
                if (i != 2 && i != 3 && i != 4) {
                    if (i != 5) {
                    }
                } else {
                    this.f54228g = new C8214k(Service.State.FAILED, false, th2);
                    m39627d(state, th2);
                }
                return;
            }
            throw new IllegalStateException("Failed while in state:" + state, th2);
        } finally {
            this.f54222a.leave();
            m39628c();
        }
    }

    public final void notifyStarted() {
        this.f54222a.enter();
        try {
            if (this.f54228g.f54239a == Service.State.STARTING) {
                if (this.f54228g.f54240b) {
                    this.f54228g = new C8214k(Service.State.STOPPING);
                    doStop();
                } else {
                    this.f54228g = new C8214k(Service.State.RUNNING);
                    m39626e();
                }
                this.f54222a.leave();
                m39628c();
                return;
            }
            IllegalStateException illegalStateException = new IllegalStateException("Cannot notifyStarted() when the service is " + this.f54228g.f54239a);
            notifyFailed(illegalStateException);
            throw illegalStateException;
        } catch (Throwable th2) {
            this.f54222a.leave();
            m39628c();
            throw th2;
        }
    }

    public final void notifyStopped() {
        this.f54222a.enter();
        try {
            Service.State state = state();
            switch (C8209f.f54234a[state.ordinal()]) {
                case 1:
                case 5:
                case 6:
                    throw new IllegalStateException("Cannot notifyStopped() when the service is " + state);
                case 2:
                case 3:
                case 4:
                    this.f54228g = new C8214k(Service.State.TERMINATED);
                    m39623h(state);
                    break;
            }
        } finally {
            this.f54222a.leave();
            m39628c();
        }
    }

    @Override // com.google.common.util.concurrent.Service
    @CanIgnoreReturnValue
    public final Service startAsync() {
        if (this.f54222a.enterIf(this.f54223b)) {
            try {
                this.f54228g = new C8214k(Service.State.STARTING);
                m39625f();
                doStart();
            } finally {
                try {
                    return this;
                } finally {
                }
            }
            return this;
        }
        throw new IllegalStateException("Service " + this + " has already been started");
    }

    @Override // com.google.common.util.concurrent.Service
    public final Service.State state() {
        return this.f54228g.m39615a();
    }

    @Override // com.google.common.util.concurrent.Service
    @CanIgnoreReturnValue
    public final Service stopAsync() {
        if (this.f54222a.enterIf(this.f54224c)) {
            try {
                Service.State state = state();
                switch (C8209f.f54234a[state.ordinal()]) {
                    case 1:
                        this.f54228g = new C8214k(Service.State.TERMINATED);
                        m39623h(Service.State.NEW);
                        break;
                    case 2:
                        Service.State state2 = Service.State.STARTING;
                        this.f54228g = new C8214k(state2, true, null);
                        m39624g(state2);
                        doCancelStart();
                        break;
                    case 3:
                        this.f54228g = new C8214k(Service.State.STOPPING);
                        m39624g(Service.State.RUNNING);
                        doStop();
                        break;
                    case 4:
                    case 5:
                    case 6:
                        throw new AssertionError("isStoppable is incorrectly implemented, saw: " + state);
                }
            } finally {
                try {
                } finally {
                }
            }
        }
        return this;
    }

    public String toString() {
        return getClass().getSimpleName() + " [" + state() + "]";
    }

    @Override // com.google.common.util.concurrent.Service
    public final void awaitRunning(long j, TimeUnit timeUnit) throws TimeoutException {
        if (this.f54222a.enterWhenUninterruptibly(this.f54225d, j, timeUnit)) {
            try {
                m39629b(Service.State.RUNNING);
                return;
            } finally {
                this.f54222a.leave();
            }
        }
        throw new TimeoutException("Timed out waiting for " + this + " to reach the RUNNING state.");
    }

    @Override // com.google.common.util.concurrent.Service
    public final void awaitTerminated(long j, TimeUnit timeUnit) throws TimeoutException {
        if (this.f54222a.enterWhenUninterruptibly(this.f54226e, j, timeUnit)) {
            try {
                m39629b(Service.State.TERMINATED);
                return;
            } finally {
                this.f54222a.leave();
            }
        }
        throw new TimeoutException("Timed out waiting for " + this + " to reach a terminal state. Current state: " + state());
    }
}

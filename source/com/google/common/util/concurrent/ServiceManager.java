package com.google.common.util.concurrent;

import com.google.common.annotations.GwtIncompatible;
import com.google.common.annotations.J2ktIncompatible;
import com.google.common.base.Function;
import com.google.common.base.MoreObjects;
import com.google.common.base.Preconditions;
import com.google.common.base.Predicates;
import com.google.common.base.Stopwatch;
import com.google.common.collect.Collections2;
import com.google.common.collect.ImmutableCollection;
import com.google.common.collect.ImmutableList;
import com.google.common.collect.ImmutableMap;
import com.google.common.collect.ImmutableSet;
import com.google.common.collect.ImmutableSetMultimap;
import com.google.common.collect.Lists;
import com.google.common.collect.Maps;
import com.google.common.collect.MultimapBuilder;
import com.google.common.collect.Multimaps;
import com.google.common.collect.Multiset;
import com.google.common.collect.Ordering;
import com.google.common.collect.SetMultimap;
import com.google.common.collect.UnmodifiableIterator;
import com.google.common.util.concurrent.C8312g;
import com.google.common.util.concurrent.Monitor;
import com.google.common.util.concurrent.Service;
import com.google.errorprone.annotations.CanIgnoreReturnValue;
import java.lang.ref.WeakReference;
import java.util.ArrayList;
import java.util.Collections;
import java.util.EnumSet;
import java.util.IdentityHashMap;
import java.util.Map;
import java.util.concurrent.Executor;
import java.util.concurrent.TimeUnit;
import java.util.concurrent.TimeoutException;
import java.util.logging.Level;
import java.util.logging.Logger;

@J2ktIncompatible
@GwtIncompatible
/* loaded from: classes4.dex */
public final class ServiceManager {

    /* renamed from: c */
    public static final C23005xi0 f54395c = new C23005xi0(ServiceManager.class);

    /* renamed from: d */
    public static final C8312g.InterfaceC8313a f54396d = new C8271a();

    /* renamed from: e */
    public static final C8312g.InterfaceC8313a f54397e = new C8272b();

    /* renamed from: a */
    public final C8275e f54398a;

    /* renamed from: b */
    public final ImmutableList f54399b;

    /* loaded from: classes4.dex */
    public static final class EmptyServiceManagerWarning extends Throwable {
        private EmptyServiceManagerWarning() {
        }

        public /* synthetic */ EmptyServiceManagerWarning(C8271a c8271a) {
            this();
        }
    }

    /* loaded from: classes4.dex */
    public static final class FailedService extends Throwable {
        public FailedService(Service service) {
            super(service.toString(), service.failureCause(), false, false);
        }
    }

    /* loaded from: classes4.dex */
    public static abstract class Listener {
        public void failure(Service service) {
        }

        public void healthy() {
        }

        public void stopped() {
        }
    }

    /* renamed from: com.google.common.util.concurrent.ServiceManager$a */
    /* loaded from: classes4.dex */
    public class C8271a implements C8312g.InterfaceC8313a {
        @Override // com.google.common.util.concurrent.C8312g.InterfaceC8313a
        /* renamed from: a */
        public void call(Listener listener) {
            listener.healthy();
        }

        public String toString() {
            return "healthy()";
        }
    }

    /* renamed from: com.google.common.util.concurrent.ServiceManager$b */
    /* loaded from: classes4.dex */
    public class C8272b implements C8312g.InterfaceC8313a {
        @Override // com.google.common.util.concurrent.C8312g.InterfaceC8313a
        /* renamed from: a */
        public void call(Listener listener) {
            listener.stopped();
        }

        public String toString() {
            return "stopped()";
        }
    }

    /* renamed from: com.google.common.util.concurrent.ServiceManager$c */
    /* loaded from: classes4.dex */
    public static final class C8273c extends AbstractService {
        public C8273c() {
        }

        @Override // com.google.common.util.concurrent.AbstractService
        public void doStart() {
            notifyStarted();
        }

        @Override // com.google.common.util.concurrent.AbstractService
        public void doStop() {
            notifyStopped();
        }

        public /* synthetic */ C8273c(C8271a c8271a) {
            this();
        }
    }

    /* renamed from: com.google.common.util.concurrent.ServiceManager$d */
    /* loaded from: classes4.dex */
    public static final class C8274d extends Service.Listener {

        /* renamed from: a */
        public final Service f54400a;

        /* renamed from: b */
        public final WeakReference f54401b;

        public C8274d(Service service, WeakReference weakReference) {
            this.f54400a = service;
            this.f54401b = weakReference;
        }

        @Override // com.google.common.util.concurrent.Service.Listener
        public void failed(Service.State state, Throwable th2) {
            C8275e c8275e = (C8275e) this.f54401b.get();
            if (c8275e != null) {
                boolean z = true;
                boolean z2 = !(this.f54400a instanceof C8273c);
                if (state == Service.State.STARTING) {
                    z = false;
                }
                if (z2 & z) {
                    ServiceManager.f54395c.m405a().log(Level.SEVERE, "Service " + this.f54400a + " has failed in the " + state + " state.", th2);
                }
                c8275e.m39428n(this.f54400a, state, Service.State.FAILED);
            }
        }

        @Override // com.google.common.util.concurrent.Service.Listener
        public void running() {
            C8275e c8275e = (C8275e) this.f54401b.get();
            if (c8275e != null) {
                c8275e.m39428n(this.f54400a, Service.State.STARTING, Service.State.RUNNING);
            }
        }

        @Override // com.google.common.util.concurrent.Service.Listener
        public void starting() {
            C8275e c8275e = (C8275e) this.f54401b.get();
            if (c8275e != null) {
                c8275e.m39428n(this.f54400a, Service.State.NEW, Service.State.STARTING);
                if (!(this.f54400a instanceof C8273c)) {
                    ServiceManager.f54395c.m405a().log(Level.FINE, "Starting {0}.", this.f54400a);
                }
            }
        }

        @Override // com.google.common.util.concurrent.Service.Listener
        public void stopping(Service.State state) {
            C8275e c8275e = (C8275e) this.f54401b.get();
            if (c8275e != null) {
                c8275e.m39428n(this.f54400a, state, Service.State.STOPPING);
            }
        }

        @Override // com.google.common.util.concurrent.Service.Listener
        public void terminated(Service.State state) {
            C8275e c8275e = (C8275e) this.f54401b.get();
            if (c8275e != null) {
                if (!(this.f54400a instanceof C8273c)) {
                    ServiceManager.f54395c.m405a().log(Level.FINE, "Service {0} has terminated. Previous state was: {1}", new Object[]{this.f54400a, state});
                }
                c8275e.m39428n(this.f54400a, state, Service.State.TERMINATED);
            }
        }
    }

    /* renamed from: com.google.common.util.concurrent.ServiceManager$e */
    /* loaded from: classes4.dex */
    public static final class C8275e {

        /* renamed from: a */
        public final Monitor f54402a = new Monitor();

        /* renamed from: b */
        public final SetMultimap f54403b;

        /* renamed from: c */
        public final Multiset f54404c;

        /* renamed from: d */
        public final IdentityHashMap f54405d;

        /* renamed from: e */
        public boolean f54406e;

        /* renamed from: f */
        public boolean f54407f;

        /* renamed from: g */
        public final int f54408g;

        /* renamed from: h */
        public final Monitor.Guard f54409h;

        /* renamed from: i */
        public final Monitor.Guard f54410i;

        /* renamed from: j */
        public final C8312g f54411j;

        /* renamed from: com.google.common.util.concurrent.ServiceManager$e$a */
        /* loaded from: classes4.dex */
        public class C8276a implements Function {
            public C8276a() {
            }

            @Override // com.google.common.base.Function
            /* renamed from: a */
            public Long apply(Map.Entry entry) {
                return (Long) entry.getValue();
            }
        }

        /* renamed from: com.google.common.util.concurrent.ServiceManager$e$b */
        /* loaded from: classes4.dex */
        public class C8277b implements C8312g.InterfaceC8313a {

            /* renamed from: a */
            public final /* synthetic */ Service f54413a;

            /* renamed from: b */
            public final /* synthetic */ C8275e f54414b;

            public C8277b(C8275e c8275e, Service service) {
                this.f54413a = service;
                this.f54414b = c8275e;
            }

            @Override // com.google.common.util.concurrent.C8312g.InterfaceC8313a
            /* renamed from: a */
            public void call(Listener listener) {
                listener.failure(this.f54413a);
            }

            public String toString() {
                return "failed({service=" + this.f54413a + "})";
            }
        }

        /* renamed from: com.google.common.util.concurrent.ServiceManager$e$c */
        /* loaded from: classes4.dex */
        public final class C8278c extends Monitor.Guard {
            public C8278c() {
                super(C8275e.this.f54402a);
            }

            @Override // com.google.common.util.concurrent.Monitor.Guard
            public boolean isSatisfied() {
                int count = C8275e.this.f54404c.count(Service.State.RUNNING);
                C8275e c8275e = C8275e.this;
                if (count != c8275e.f54408g && !c8275e.f54404c.contains(Service.State.STOPPING) && !C8275e.this.f54404c.contains(Service.State.TERMINATED) && !C8275e.this.f54404c.contains(Service.State.FAILED)) {
                    return false;
                }
                return true;
            }
        }

        /* renamed from: com.google.common.util.concurrent.ServiceManager$e$d */
        /* loaded from: classes4.dex */
        public final class C8279d extends Monitor.Guard {
            public C8279d() {
                super(C8275e.this.f54402a);
            }

            @Override // com.google.common.util.concurrent.Monitor.Guard
            public boolean isSatisfied() {
                if (C8275e.this.f54404c.count(Service.State.TERMINATED) + C8275e.this.f54404c.count(Service.State.FAILED) == C8275e.this.f54408g) {
                    return true;
                }
                return false;
            }
        }

        public C8275e(ImmutableCollection immutableCollection) {
            SetMultimap build = MultimapBuilder.enumKeys(Service.State.class).linkedHashSetValues().build();
            this.f54403b = build;
            this.f54404c = build.keys();
            this.f54405d = new IdentityHashMap();
            this.f54409h = new C8278c();
            this.f54410i = new C8279d();
            this.f54411j = new C8312g();
            this.f54408g = immutableCollection.size();
            build.putAll(Service.State.NEW, immutableCollection);
        }

        /* renamed from: a */
        public void m39441a(Listener listener, Executor executor) {
            this.f54411j.m39357b(listener, executor);
        }

        /* renamed from: b */
        public void m39440b() {
            this.f54402a.enterWhenUninterruptibly(this.f54409h);
            try {
                m39436f();
            } finally {
                this.f54402a.leave();
            }
        }

        /* renamed from: c */
        public void m39439c(long j, TimeUnit timeUnit) {
            this.f54402a.enter();
            try {
                if (this.f54402a.waitForUninterruptibly(this.f54409h, j, timeUnit)) {
                    m39436f();
                    return;
                }
                throw new TimeoutException("Timeout waiting for the services to become healthy. The following services have not started: " + Multimaps.filterKeys(this.f54403b, Predicates.m41304in(ImmutableSet.m40929of(Service.State.NEW, Service.State.STARTING))));
            } finally {
                this.f54402a.leave();
            }
        }

        /* renamed from: d */
        public void m39438d() {
            this.f54402a.enterWhenUninterruptibly(this.f54410i);
            this.f54402a.leave();
        }

        /* renamed from: e */
        public void m39437e(long j, TimeUnit timeUnit) {
            this.f54402a.enter();
            try {
                if (this.f54402a.waitForUninterruptibly(this.f54410i, j, timeUnit)) {
                    return;
                }
                throw new TimeoutException("Timeout waiting for the services to stop. The following services have not stopped: " + Multimaps.filterKeys(this.f54403b, Predicates.not(Predicates.m41304in(EnumSet.of(Service.State.TERMINATED, Service.State.FAILED)))));
            } finally {
                this.f54402a.leave();
            }
        }

        /* renamed from: f */
        public void m39436f() {
            Multiset multiset = this.f54404c;
            Service.State state = Service.State.RUNNING;
            if (multiset.count(state) != this.f54408g) {
                IllegalStateException illegalStateException = new IllegalStateException("Expected to be healthy after starting. The following services are not running: " + Multimaps.filterKeys(this.f54403b, Predicates.not(Predicates.equalTo(state))));
                for (Service service : this.f54403b.get((SetMultimap) Service.State.FAILED)) {
                    illegalStateException.addSuppressed(new FailedService(service));
                }
                throw illegalStateException;
            }
        }

        /* renamed from: g */
        public void m39435g() {
            Preconditions.checkState(!this.f54402a.isOccupiedByCurrentThread(), "It is incorrect to execute listeners with the monitor held.");
            this.f54411j.m39356c();
        }

        /* renamed from: h */
        public void m39434h(Service service) {
            this.f54411j.m39355d(new C8277b(this, service));
        }

        /* renamed from: i */
        public void m39433i() {
            this.f54411j.m39355d(ServiceManager.f54396d);
        }

        /* renamed from: j */
        public void m39432j() {
            this.f54411j.m39355d(ServiceManager.f54397e);
        }

        /* renamed from: k */
        public void m39431k() {
            this.f54402a.enter();
            try {
                if (!this.f54407f) {
                    this.f54406e = true;
                    return;
                }
                ArrayList newArrayList = Lists.newArrayList();
                UnmodifiableIterator it = m39430l().values().iterator();
                while (it.hasNext()) {
                    Service service = (Service) it.next();
                    if (service.state() != Service.State.NEW) {
                        newArrayList.add(service);
                    }
                }
                throw new IllegalArgumentException("Services started transitioning asynchronously before the ServiceManager was constructed: " + newArrayList);
            } finally {
                this.f54402a.leave();
            }
        }

        /* renamed from: l */
        public ImmutableSetMultimap m39430l() {
            ImmutableSetMultimap.Builder builder = ImmutableSetMultimap.builder();
            this.f54402a.enter();
            try {
                for (Map.Entry entry : this.f54403b.entries()) {
                    if (!(entry.getValue() instanceof C8273c)) {
                        builder.put(entry);
                    }
                }
                this.f54402a.leave();
                return builder.build();
            } catch (Throwable th2) {
                this.f54402a.leave();
                throw th2;
            }
        }

        /* renamed from: m */
        public ImmutableMap m39429m() {
            this.f54402a.enter();
            try {
                ArrayList newArrayListWithCapacity = Lists.newArrayListWithCapacity(this.f54405d.size());
                for (Map.Entry entry : this.f54405d.entrySet()) {
                    Service service = (Service) entry.getKey();
                    Stopwatch stopwatch = (Stopwatch) entry.getValue();
                    if (!stopwatch.isRunning() && !(service instanceof C8273c)) {
                        newArrayListWithCapacity.add(Maps.immutableEntry(service, Long.valueOf(stopwatch.elapsed(TimeUnit.MILLISECONDS))));
                    }
                }
                this.f54402a.leave();
                Collections.sort(newArrayListWithCapacity, Ordering.natural().onResultOf(new C8276a()));
                return ImmutableMap.copyOf(newArrayListWithCapacity);
            } catch (Throwable th2) {
                this.f54402a.leave();
                throw th2;
            }
        }

        /* renamed from: n */
        public void m39428n(Service service, Service.State state, Service.State state2) {
            boolean z;
            Preconditions.checkNotNull(service);
            if (state != state2) {
                z = true;
            } else {
                z = false;
            }
            Preconditions.checkArgument(z);
            this.f54402a.enter();
            try {
                this.f54407f = true;
                if (!this.f54406e) {
                    this.f54402a.leave();
                    m39435g();
                    return;
                }
                Preconditions.checkState(this.f54403b.remove(state, service), "Service %s not at the expected location in the state map %s", service, state);
                Preconditions.checkState(this.f54403b.put(state2, service), "Service %s in the state map unexpectedly at %s", service, state2);
                Stopwatch stopwatch = (Stopwatch) this.f54405d.get(service);
                if (stopwatch == null) {
                    stopwatch = Stopwatch.createStarted();
                    this.f54405d.put(service, stopwatch);
                }
                Service.State state3 = Service.State.RUNNING;
                if (state2.compareTo(state3) >= 0 && stopwatch.isRunning()) {
                    stopwatch.stop();
                    if (!(service instanceof C8273c)) {
                        ServiceManager.f54395c.m405a().log(Level.FINE, "Started {0} in {1}.", new Object[]{service, stopwatch});
                    }
                }
                Service.State state4 = Service.State.FAILED;
                if (state2 == state4) {
                    m39434h(service);
                }
                if (this.f54404c.count(state3) == this.f54408g) {
                    m39433i();
                } else if (this.f54404c.count(Service.State.TERMINATED) + this.f54404c.count(state4) == this.f54408g) {
                    m39432j();
                }
                this.f54402a.leave();
                m39435g();
            } catch (Throwable th2) {
                this.f54402a.leave();
                m39435g();
                throw th2;
            }
        }

        /* renamed from: o */
        public void m39427o(Service service) {
            this.f54402a.enter();
            try {
                if (((Stopwatch) this.f54405d.get(service)) == null) {
                    this.f54405d.put(service, Stopwatch.createStarted());
                }
            } finally {
                this.f54402a.leave();
            }
        }
    }

    public ServiceManager(Iterable<? extends Service> iterable) {
        boolean z;
        ImmutableList copyOf = ImmutableList.copyOf(iterable);
        if (copyOf.isEmpty()) {
            f54395c.m405a().log(Level.WARNING, "ServiceManager configured with no services.  Is your application configured properly?", (Throwable) new EmptyServiceManagerWarning(null));
            copyOf = ImmutableList.m40997of(new C8273c(null));
        }
        C8275e c8275e = new C8275e(copyOf);
        this.f54398a = c8275e;
        this.f54399b = copyOf;
        WeakReference weakReference = new WeakReference(c8275e);
        UnmodifiableIterator it = copyOf.iterator();
        while (it.hasNext()) {
            Service service = (Service) it.next();
            service.addListener(new C8274d(service, weakReference), MoreExecutors.directExecutor());
            if (service.state() == Service.State.NEW) {
                z = true;
            } else {
                z = false;
            }
            Preconditions.checkArgument(z, "Can only manage NEW services, %s", service);
        }
        this.f54398a.m39431k();
    }

    public void addListener(Listener listener, Executor executor) {
        this.f54398a.m39441a(listener, executor);
    }

    public void awaitHealthy() {
        this.f54398a.m39440b();
    }

    public void awaitStopped() {
        this.f54398a.m39438d();
    }

    public boolean isHealthy() {
        UnmodifiableIterator it = this.f54399b.iterator();
        while (it.hasNext()) {
            if (!((Service) it.next()).isRunning()) {
                return false;
            }
        }
        return true;
    }

    @CanIgnoreReturnValue
    public ServiceManager startAsync() {
        boolean z;
        UnmodifiableIterator it = this.f54399b.iterator();
        while (it.hasNext()) {
            if (((Service) it.next()).state() == Service.State.NEW) {
                z = true;
            } else {
                z = false;
            }
            Preconditions.checkState(z, "Not all services are NEW, cannot start %s", this);
        }
        UnmodifiableIterator it2 = this.f54399b.iterator();
        while (it2.hasNext()) {
            Service service = (Service) it2.next();
            try {
                this.f54398a.m39427o(service);
                service.startAsync();
            } catch (IllegalStateException e) {
                Logger m405a = f54395c.m405a();
                Level level = Level.WARNING;
                m405a.log(level, "Unable to start Service " + service, (Throwable) e);
            }
        }
        return this;
    }

    public ImmutableMap<Service, Long> startupTimes() {
        return this.f54398a.m39429m();
    }

    @CanIgnoreReturnValue
    public ServiceManager stopAsync() {
        UnmodifiableIterator it = this.f54399b.iterator();
        while (it.hasNext()) {
            ((Service) it.next()).stopAsync();
        }
        return this;
    }

    public String toString() {
        return MoreObjects.toStringHelper((Class<?>) ServiceManager.class).add("services", Collections2.filter(this.f54399b, Predicates.not(Predicates.instanceOf(C8273c.class)))).toString();
    }

    public void awaitHealthy(long j, TimeUnit timeUnit) throws TimeoutException {
        this.f54398a.m39439c(j, timeUnit);
    }

    public void awaitStopped(long j, TimeUnit timeUnit) throws TimeoutException {
        this.f54398a.m39437e(j, timeUnit);
    }

    public ImmutableSetMultimap<Service.State, Service> servicesByState() {
        return this.f54398a.m39430l();
    }
}

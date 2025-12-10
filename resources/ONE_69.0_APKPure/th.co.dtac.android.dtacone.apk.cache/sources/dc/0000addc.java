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
import com.google.common.util.concurrent.C8301g;
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
    public static final C17503Di0 f54407c = new C17503Di0(ServiceManager.class);

    /* renamed from: d */
    public static final C8301g.InterfaceC8302a f54408d = new C8260a();

    /* renamed from: e */
    public static final C8301g.InterfaceC8302a f54409e = new C8261b();

    /* renamed from: a */
    public final C8264e f54410a;

    /* renamed from: b */
    public final ImmutableList f54411b;

    /* loaded from: classes4.dex */
    public static final class EmptyServiceManagerWarning extends Throwable {
        private EmptyServiceManagerWarning() {
        }

        public /* synthetic */ EmptyServiceManagerWarning(C8260a c8260a) {
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
    public class C8260a implements C8301g.InterfaceC8302a {
        @Override // com.google.common.util.concurrent.C8301g.InterfaceC8302a
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
    public class C8261b implements C8301g.InterfaceC8302a {
        @Override // com.google.common.util.concurrent.C8301g.InterfaceC8302a
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
    public static final class C8262c extends AbstractService {
        public C8262c() {
        }

        @Override // com.google.common.util.concurrent.AbstractService
        public void doStart() {
            notifyStarted();
        }

        @Override // com.google.common.util.concurrent.AbstractService
        public void doStop() {
            notifyStopped();
        }

        public /* synthetic */ C8262c(C8260a c8260a) {
            this();
        }
    }

    /* renamed from: com.google.common.util.concurrent.ServiceManager$d */
    /* loaded from: classes4.dex */
    public static final class C8263d extends Service.Listener {

        /* renamed from: a */
        public final Service f54412a;

        /* renamed from: b */
        public final WeakReference f54413b;

        public C8263d(Service service, WeakReference weakReference) {
            this.f54412a = service;
            this.f54413b = weakReference;
        }

        @Override // com.google.common.util.concurrent.Service.Listener
        public void failed(Service.State state, Throwable th2) {
            C8264e c8264e = (C8264e) this.f54413b.get();
            if (c8264e != null) {
                boolean z = true;
                boolean z2 = !(this.f54412a instanceof C8262c);
                if (state == Service.State.STARTING) {
                    z = false;
                }
                if (z2 & z) {
                    ServiceManager.f54407c.m68797a().log(Level.SEVERE, "Service " + this.f54412a + " has failed in the " + state + " state.", th2);
                }
                c8264e.m39420n(this.f54412a, state, Service.State.FAILED);
            }
        }

        @Override // com.google.common.util.concurrent.Service.Listener
        public void running() {
            C8264e c8264e = (C8264e) this.f54413b.get();
            if (c8264e != null) {
                c8264e.m39420n(this.f54412a, Service.State.STARTING, Service.State.RUNNING);
            }
        }

        @Override // com.google.common.util.concurrent.Service.Listener
        public void starting() {
            C8264e c8264e = (C8264e) this.f54413b.get();
            if (c8264e != null) {
                c8264e.m39420n(this.f54412a, Service.State.NEW, Service.State.STARTING);
                if (!(this.f54412a instanceof C8262c)) {
                    ServiceManager.f54407c.m68797a().log(Level.FINE, "Starting {0}.", this.f54412a);
                }
            }
        }

        @Override // com.google.common.util.concurrent.Service.Listener
        public void stopping(Service.State state) {
            C8264e c8264e = (C8264e) this.f54413b.get();
            if (c8264e != null) {
                c8264e.m39420n(this.f54412a, state, Service.State.STOPPING);
            }
        }

        @Override // com.google.common.util.concurrent.Service.Listener
        public void terminated(Service.State state) {
            C8264e c8264e = (C8264e) this.f54413b.get();
            if (c8264e != null) {
                if (!(this.f54412a instanceof C8262c)) {
                    ServiceManager.f54407c.m68797a().log(Level.FINE, "Service {0} has terminated. Previous state was: {1}", new Object[]{this.f54412a, state});
                }
                c8264e.m39420n(this.f54412a, state, Service.State.TERMINATED);
            }
        }
    }

    /* renamed from: com.google.common.util.concurrent.ServiceManager$e */
    /* loaded from: classes4.dex */
    public static final class C8264e {

        /* renamed from: a */
        public final Monitor f54414a = new Monitor();

        /* renamed from: b */
        public final SetMultimap f54415b;

        /* renamed from: c */
        public final Multiset f54416c;

        /* renamed from: d */
        public final IdentityHashMap f54417d;

        /* renamed from: e */
        public boolean f54418e;

        /* renamed from: f */
        public boolean f54419f;

        /* renamed from: g */
        public final int f54420g;

        /* renamed from: h */
        public final Monitor.Guard f54421h;

        /* renamed from: i */
        public final Monitor.Guard f54422i;

        /* renamed from: j */
        public final C8301g f54423j;

        /* renamed from: com.google.common.util.concurrent.ServiceManager$e$a */
        /* loaded from: classes4.dex */
        public class C8265a implements Function {
            public C8265a() {
            }

            @Override // com.google.common.base.Function
            /* renamed from: a */
            public Long apply(Map.Entry entry) {
                return (Long) entry.getValue();
            }
        }

        /* renamed from: com.google.common.util.concurrent.ServiceManager$e$b */
        /* loaded from: classes4.dex */
        public class C8266b implements C8301g.InterfaceC8302a {

            /* renamed from: a */
            public final /* synthetic */ Service f54425a;

            /* renamed from: b */
            public final /* synthetic */ C8264e f54426b;

            public C8266b(C8264e c8264e, Service service) {
                this.f54425a = service;
                this.f54426b = c8264e;
            }

            @Override // com.google.common.util.concurrent.C8301g.InterfaceC8302a
            /* renamed from: a */
            public void call(Listener listener) {
                listener.failure(this.f54425a);
            }

            public String toString() {
                return "failed({service=" + this.f54425a + "})";
            }
        }

        /* renamed from: com.google.common.util.concurrent.ServiceManager$e$c */
        /* loaded from: classes4.dex */
        public final class C8267c extends Monitor.Guard {
            public C8267c() {
                super(C8264e.this.f54414a);
            }

            @Override // com.google.common.util.concurrent.Monitor.Guard
            public boolean isSatisfied() {
                int count = C8264e.this.f54416c.count(Service.State.RUNNING);
                C8264e c8264e = C8264e.this;
                if (count != c8264e.f54420g && !c8264e.f54416c.contains(Service.State.STOPPING) && !C8264e.this.f54416c.contains(Service.State.TERMINATED) && !C8264e.this.f54416c.contains(Service.State.FAILED)) {
                    return false;
                }
                return true;
            }
        }

        /* renamed from: com.google.common.util.concurrent.ServiceManager$e$d */
        /* loaded from: classes4.dex */
        public final class C8268d extends Monitor.Guard {
            public C8268d() {
                super(C8264e.this.f54414a);
            }

            @Override // com.google.common.util.concurrent.Monitor.Guard
            public boolean isSatisfied() {
                if (C8264e.this.f54416c.count(Service.State.TERMINATED) + C8264e.this.f54416c.count(Service.State.FAILED) == C8264e.this.f54420g) {
                    return true;
                }
                return false;
            }
        }

        public C8264e(ImmutableCollection immutableCollection) {
            SetMultimap build = MultimapBuilder.enumKeys(Service.State.class).linkedHashSetValues().build();
            this.f54415b = build;
            this.f54416c = build.keys();
            this.f54417d = new IdentityHashMap();
            this.f54421h = new C8267c();
            this.f54422i = new C8268d();
            this.f54423j = new C8301g();
            this.f54420g = immutableCollection.size();
            build.putAll(Service.State.NEW, immutableCollection);
        }

        /* renamed from: a */
        public void m39433a(Listener listener, Executor executor) {
            this.f54423j.m39349b(listener, executor);
        }

        /* renamed from: b */
        public void m39432b() {
            this.f54414a.enterWhenUninterruptibly(this.f54421h);
            try {
                m39428f();
            } finally {
                this.f54414a.leave();
            }
        }

        /* renamed from: c */
        public void m39431c(long j, TimeUnit timeUnit) {
            this.f54414a.enter();
            try {
                if (this.f54414a.waitForUninterruptibly(this.f54421h, j, timeUnit)) {
                    m39428f();
                    return;
                }
                throw new TimeoutException("Timeout waiting for the services to become healthy. The following services have not started: " + Multimaps.filterKeys(this.f54415b, Predicates.m41291in(ImmutableSet.m40918of(Service.State.NEW, Service.State.STARTING))));
            } finally {
                this.f54414a.leave();
            }
        }

        /* renamed from: d */
        public void m39430d() {
            this.f54414a.enterWhenUninterruptibly(this.f54422i);
            this.f54414a.leave();
        }

        /* renamed from: e */
        public void m39429e(long j, TimeUnit timeUnit) {
            this.f54414a.enter();
            try {
                if (this.f54414a.waitForUninterruptibly(this.f54422i, j, timeUnit)) {
                    return;
                }
                throw new TimeoutException("Timeout waiting for the services to stop. The following services have not stopped: " + Multimaps.filterKeys(this.f54415b, Predicates.not(Predicates.m41291in(EnumSet.of(Service.State.TERMINATED, Service.State.FAILED)))));
            } finally {
                this.f54414a.leave();
            }
        }

        /* renamed from: f */
        public void m39428f() {
            Multiset multiset = this.f54416c;
            Service.State state = Service.State.RUNNING;
            if (multiset.count(state) != this.f54420g) {
                IllegalStateException illegalStateException = new IllegalStateException("Expected to be healthy after starting. The following services are not running: " + Multimaps.filterKeys(this.f54415b, Predicates.not(Predicates.equalTo(state))));
                for (Service service : this.f54415b.get((SetMultimap) Service.State.FAILED)) {
                    illegalStateException.addSuppressed(new FailedService(service));
                }
                throw illegalStateException;
            }
        }

        /* renamed from: g */
        public void m39427g() {
            Preconditions.checkState(!this.f54414a.isOccupiedByCurrentThread(), "It is incorrect to execute listeners with the monitor held.");
            this.f54423j.m39348c();
        }

        /* renamed from: h */
        public void m39426h(Service service) {
            this.f54423j.m39347d(new C8266b(this, service));
        }

        /* renamed from: i */
        public void m39425i() {
            this.f54423j.m39347d(ServiceManager.f54408d);
        }

        /* renamed from: j */
        public void m39424j() {
            this.f54423j.m39347d(ServiceManager.f54409e);
        }

        /* renamed from: k */
        public void m39423k() {
            this.f54414a.enter();
            try {
                if (!this.f54419f) {
                    this.f54418e = true;
                    return;
                }
                ArrayList newArrayList = Lists.newArrayList();
                UnmodifiableIterator it = m39422l().values().iterator();
                while (it.hasNext()) {
                    Service service = (Service) it.next();
                    if (service.state() != Service.State.NEW) {
                        newArrayList.add(service);
                    }
                }
                throw new IllegalArgumentException("Services started transitioning asynchronously before the ServiceManager was constructed: " + newArrayList);
            } finally {
                this.f54414a.leave();
            }
        }

        /* renamed from: l */
        public ImmutableSetMultimap m39422l() {
            ImmutableSetMultimap.Builder builder = ImmutableSetMultimap.builder();
            this.f54414a.enter();
            try {
                for (Map.Entry entry : this.f54415b.entries()) {
                    if (!(entry.getValue() instanceof C8262c)) {
                        builder.put(entry);
                    }
                }
                this.f54414a.leave();
                return builder.build();
            } catch (Throwable th2) {
                this.f54414a.leave();
                throw th2;
            }
        }

        /* renamed from: m */
        public ImmutableMap m39421m() {
            this.f54414a.enter();
            try {
                ArrayList newArrayListWithCapacity = Lists.newArrayListWithCapacity(this.f54417d.size());
                for (Map.Entry entry : this.f54417d.entrySet()) {
                    Service service = (Service) entry.getKey();
                    Stopwatch stopwatch = (Stopwatch) entry.getValue();
                    if (!stopwatch.isRunning() && !(service instanceof C8262c)) {
                        newArrayListWithCapacity.add(Maps.immutableEntry(service, Long.valueOf(stopwatch.elapsed(TimeUnit.MILLISECONDS))));
                    }
                }
                this.f54414a.leave();
                Collections.sort(newArrayListWithCapacity, Ordering.natural().onResultOf(new C8265a()));
                return ImmutableMap.copyOf(newArrayListWithCapacity);
            } catch (Throwable th2) {
                this.f54414a.leave();
                throw th2;
            }
        }

        /* renamed from: n */
        public void m39420n(Service service, Service.State state, Service.State state2) {
            boolean z;
            Preconditions.checkNotNull(service);
            if (state != state2) {
                z = true;
            } else {
                z = false;
            }
            Preconditions.checkArgument(z);
            this.f54414a.enter();
            try {
                this.f54419f = true;
                if (!this.f54418e) {
                    this.f54414a.leave();
                    m39427g();
                    return;
                }
                Preconditions.checkState(this.f54415b.remove(state, service), "Service %s not at the expected location in the state map %s", service, state);
                Preconditions.checkState(this.f54415b.put(state2, service), "Service %s in the state map unexpectedly at %s", service, state2);
                Stopwatch stopwatch = (Stopwatch) this.f54417d.get(service);
                if (stopwatch == null) {
                    stopwatch = Stopwatch.createStarted();
                    this.f54417d.put(service, stopwatch);
                }
                Service.State state3 = Service.State.RUNNING;
                if (state2.compareTo(state3) >= 0 && stopwatch.isRunning()) {
                    stopwatch.stop();
                    if (!(service instanceof C8262c)) {
                        ServiceManager.f54407c.m68797a().log(Level.FINE, "Started {0} in {1}.", new Object[]{service, stopwatch});
                    }
                }
                Service.State state4 = Service.State.FAILED;
                if (state2 == state4) {
                    m39426h(service);
                }
                if (this.f54416c.count(state3) == this.f54420g) {
                    m39425i();
                } else if (this.f54416c.count(Service.State.TERMINATED) + this.f54416c.count(state4) == this.f54420g) {
                    m39424j();
                }
                this.f54414a.leave();
                m39427g();
            } catch (Throwable th2) {
                this.f54414a.leave();
                m39427g();
                throw th2;
            }
        }

        /* renamed from: o */
        public void m39419o(Service service) {
            this.f54414a.enter();
            try {
                if (((Stopwatch) this.f54417d.get(service)) == null) {
                    this.f54417d.put(service, Stopwatch.createStarted());
                }
            } finally {
                this.f54414a.leave();
            }
        }
    }

    public ServiceManager(Iterable<? extends Service> iterable) {
        boolean z;
        ImmutableList copyOf = ImmutableList.copyOf(iterable);
        if (copyOf.isEmpty()) {
            f54407c.m68797a().log(Level.WARNING, "ServiceManager configured with no services.  Is your application configured properly?", (Throwable) new EmptyServiceManagerWarning(null));
            copyOf = ImmutableList.m40986of(new C8262c(null));
        }
        C8264e c8264e = new C8264e(copyOf);
        this.f54410a = c8264e;
        this.f54411b = copyOf;
        WeakReference weakReference = new WeakReference(c8264e);
        UnmodifiableIterator it = copyOf.iterator();
        while (it.hasNext()) {
            Service service = (Service) it.next();
            service.addListener(new C8263d(service, weakReference), MoreExecutors.directExecutor());
            if (service.state() == Service.State.NEW) {
                z = true;
            } else {
                z = false;
            }
            Preconditions.checkArgument(z, "Can only manage NEW services, %s", service);
        }
        this.f54410a.m39423k();
    }

    public void addListener(Listener listener, Executor executor) {
        this.f54410a.m39433a(listener, executor);
    }

    public void awaitHealthy() {
        this.f54410a.m39432b();
    }

    public void awaitStopped() {
        this.f54410a.m39430d();
    }

    public boolean isHealthy() {
        UnmodifiableIterator it = this.f54411b.iterator();
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
        UnmodifiableIterator it = this.f54411b.iterator();
        while (it.hasNext()) {
            if (((Service) it.next()).state() == Service.State.NEW) {
                z = true;
            } else {
                z = false;
            }
            Preconditions.checkState(z, "Not all services are NEW, cannot start %s", this);
        }
        UnmodifiableIterator it2 = this.f54411b.iterator();
        while (it2.hasNext()) {
            Service service = (Service) it2.next();
            try {
                this.f54410a.m39419o(service);
                service.startAsync();
            } catch (IllegalStateException e) {
                Logger m68797a = f54407c.m68797a();
                Level level = Level.WARNING;
                m68797a.log(level, "Unable to start Service " + service, (Throwable) e);
            }
        }
        return this;
    }

    public ImmutableMap<Service, Long> startupTimes() {
        return this.f54410a.m39421m();
    }

    @CanIgnoreReturnValue
    public ServiceManager stopAsync() {
        UnmodifiableIterator it = this.f54411b.iterator();
        while (it.hasNext()) {
            ((Service) it.next()).stopAsync();
        }
        return this;
    }

    public String toString() {
        return MoreObjects.toStringHelper((Class<?>) ServiceManager.class).add("services", Collections2.filter(this.f54411b, Predicates.not(Predicates.instanceOf(C8262c.class)))).toString();
    }

    public void awaitHealthy(long j, TimeUnit timeUnit) throws TimeoutException {
        this.f54410a.m39431c(j, timeUnit);
    }

    public void awaitStopped(long j, TimeUnit timeUnit) throws TimeoutException {
        this.f54410a.m39429e(j, timeUnit);
    }

    public ImmutableSetMultimap<Service.State, Service> servicesByState() {
        return this.f54410a.m39422l();
    }
}
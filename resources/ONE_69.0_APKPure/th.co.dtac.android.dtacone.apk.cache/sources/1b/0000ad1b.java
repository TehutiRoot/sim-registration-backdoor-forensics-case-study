package com.google.common.util.concurrent;

import com.google.common.annotations.GwtIncompatible;
import com.google.common.annotations.J2ktIncompatible;
import com.google.common.base.Supplier;
import com.google.common.util.concurrent.AbstractExecutionThreadService;
import com.google.common.util.concurrent.Service;
import com.google.errorprone.annotations.CanIgnoreReturnValue;
import java.util.concurrent.Executor;
import java.util.concurrent.TimeUnit;
import java.util.concurrent.TimeoutException;

@J2ktIncompatible
@GwtIncompatible
/* loaded from: classes4.dex */
public abstract class AbstractExecutionThreadService implements Service {

    /* renamed from: b */
    public static final C17503Di0 f54158b = new C17503Di0(AbstractExecutionThreadService.class);

    /* renamed from: a */
    public final Service f54159a = new C8166a();

    /* renamed from: com.google.common.util.concurrent.AbstractExecutionThreadService$a */
    /* loaded from: classes4.dex */
    public class C8166a extends AbstractService {
        public C8166a() {
            AbstractExecutionThreadService.this = r1;
        }

        /* renamed from: k */
        public static /* synthetic */ String m39686k(C8166a c8166a) {
            return c8166a.m39684m();
        }

        /* renamed from: l */
        public static /* synthetic */ void m39685l(C8166a c8166a) {
            c8166a.m39683n();
        }

        @Override // com.google.common.util.concurrent.AbstractService
        public final void doStart() {
            MoreExecutors.m39466e(AbstractExecutionThreadService.this.executor(), new Supplier() { // from class: F
                @Override // com.google.common.base.Supplier
                public final Object get() {
                    return AbstractExecutionThreadService.C8166a.m39686k(AbstractExecutionThreadService.C8166a.this);
                }
            }).execute(new Runnable() { // from class: G
                @Override // java.lang.Runnable
                public final void run() {
                    AbstractExecutionThreadService.C8166a.m39685l(AbstractExecutionThreadService.C8166a.this);
                }
            });
        }

        @Override // com.google.common.util.concurrent.AbstractService
        public void doStop() {
            AbstractExecutionThreadService.this.triggerShutdown();
        }

        /* renamed from: m */
        public final /* synthetic */ String m39684m() {
            return AbstractExecutionThreadService.this.serviceName();
        }

        /* renamed from: n */
        public final /* synthetic */ void m39683n() {
            try {
                AbstractExecutionThreadService.this.startUp();
                notifyStarted();
                if (isRunning()) {
                    AbstractExecutionThreadService.this.run();
                }
                AbstractExecutionThreadService.this.shutDown();
                notifyStopped();
            } catch (Throwable th2) {
                AbstractC23431zl1.m74b(th2);
                notifyFailed(th2);
            }
        }

        @Override // com.google.common.util.concurrent.AbstractService
        public String toString() {
            return AbstractExecutionThreadService.this.toString();
        }
    }

    /* renamed from: a */
    public static /* synthetic */ void m39689a(AbstractExecutionThreadService abstractExecutionThreadService, Runnable runnable) {
        abstractExecutionThreadService.m39687c(runnable);
    }

    /* renamed from: b */
    public static /* synthetic */ C17503Di0 m39688b() {
        return f54158b;
    }

    @Override // com.google.common.util.concurrent.Service
    public final void addListener(Service.Listener listener, Executor executor) {
        this.f54159a.addListener(listener, executor);
    }

    @Override // com.google.common.util.concurrent.Service
    public final void awaitRunning() {
        this.f54159a.awaitRunning();
    }

    @Override // com.google.common.util.concurrent.Service
    public final void awaitTerminated() {
        this.f54159a.awaitTerminated();
    }

    /* renamed from: c */
    public final /* synthetic */ void m39687c(Runnable runnable) {
        MoreExecutors.m39468c(serviceName(), runnable).start();
    }

    public Executor executor() {
        return new Executor() { // from class: E
            @Override // java.util.concurrent.Executor
            public final void execute(Runnable runnable) {
                AbstractExecutionThreadService.m39689a(AbstractExecutionThreadService.this, runnable);
            }
        };
    }

    @Override // com.google.common.util.concurrent.Service
    public final Throwable failureCause() {
        return this.f54159a.failureCause();
    }

    @Override // com.google.common.util.concurrent.Service
    public final boolean isRunning() {
        return this.f54159a.isRunning();
    }

    public abstract void run() throws Exception;

    public String serviceName() {
        return getClass().getSimpleName();
    }

    public void shutDown() throws Exception {
    }

    @Override // com.google.common.util.concurrent.Service
    @CanIgnoreReturnValue
    public final Service startAsync() {
        this.f54159a.startAsync();
        return this;
    }

    public void startUp() throws Exception {
    }

    @Override // com.google.common.util.concurrent.Service
    public final Service.State state() {
        return this.f54159a.state();
    }

    @Override // com.google.common.util.concurrent.Service
    @CanIgnoreReturnValue
    public final Service stopAsync() {
        this.f54159a.stopAsync();
        return this;
    }

    public String toString() {
        return serviceName() + " [" + state() + "]";
    }

    public void triggerShutdown() {
    }

    @Override // com.google.common.util.concurrent.Service
    public final void awaitRunning(long j, TimeUnit timeUnit) throws TimeoutException {
        this.f54159a.awaitRunning(j, timeUnit);
    }

    @Override // com.google.common.util.concurrent.Service
    public final void awaitTerminated(long j, TimeUnit timeUnit) throws TimeoutException {
        this.f54159a.awaitTerminated(j, timeUnit);
    }
}
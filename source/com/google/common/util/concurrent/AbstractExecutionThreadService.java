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
    public static final C23005xi0 f54146b = new C23005xi0(AbstractExecutionThreadService.class);

    /* renamed from: a */
    public final Service f54147a = new C8177a();

    /* renamed from: com.google.common.util.concurrent.AbstractExecutionThreadService$a */
    /* loaded from: classes4.dex */
    public class C8177a extends AbstractService {
        public C8177a() {
            AbstractExecutionThreadService.this = r1;
        }

        /* renamed from: k */
        public static /* synthetic */ String m39694k(C8177a c8177a) {
            return c8177a.m39692m();
        }

        /* renamed from: l */
        public static /* synthetic */ void m39693l(C8177a c8177a) {
            c8177a.m39691n();
        }

        @Override // com.google.common.util.concurrent.AbstractService
        public final void doStart() {
            MoreExecutors.m39474e(AbstractExecutionThreadService.this.executor(), new Supplier() { // from class: F
                {
                    AbstractExecutionThreadService.C8177a.this = this;
                }

                @Override // com.google.common.base.Supplier
                public final Object get() {
                    return AbstractExecutionThreadService.C8177a.m39694k(AbstractExecutionThreadService.C8177a.this);
                }
            }).execute(new Runnable() { // from class: G
                {
                    AbstractExecutionThreadService.C8177a.this = this;
                }

                @Override // java.lang.Runnable
                public final void run() {
                    AbstractExecutionThreadService.C8177a.m39693l(AbstractExecutionThreadService.C8177a.this);
                }
            });
        }

        @Override // com.google.common.util.concurrent.AbstractService
        public void doStop() {
            AbstractExecutionThreadService.this.triggerShutdown();
        }

        /* renamed from: m */
        public final /* synthetic */ String m39692m() {
            return AbstractExecutionThreadService.this.serviceName();
        }

        /* renamed from: n */
        public final /* synthetic */ void m39691n() {
            try {
                AbstractExecutionThreadService.this.startUp();
                notifyStarted();
                if (isRunning()) {
                    AbstractExecutionThreadService.this.run();
                }
                AbstractExecutionThreadService.this.shutDown();
                notifyStopped();
            } catch (Throwable th2) {
                AbstractC17420Ck1.m68741b(th2);
                notifyFailed(th2);
            }
        }

        @Override // com.google.common.util.concurrent.AbstractService
        public String toString() {
            return AbstractExecutionThreadService.this.toString();
        }
    }

    /* renamed from: a */
    public static /* synthetic */ void m39697a(AbstractExecutionThreadService abstractExecutionThreadService, Runnable runnable) {
        abstractExecutionThreadService.m39695c(runnable);
    }

    /* renamed from: b */
    public static /* synthetic */ C23005xi0 m39696b() {
        return f54146b;
    }

    @Override // com.google.common.util.concurrent.Service
    public final void addListener(Service.Listener listener, Executor executor) {
        this.f54147a.addListener(listener, executor);
    }

    @Override // com.google.common.util.concurrent.Service
    public final void awaitRunning() {
        this.f54147a.awaitRunning();
    }

    @Override // com.google.common.util.concurrent.Service
    public final void awaitTerminated() {
        this.f54147a.awaitTerminated();
    }

    /* renamed from: c */
    public final /* synthetic */ void m39695c(Runnable runnable) {
        MoreExecutors.m39476c(serviceName(), runnable).start();
    }

    public Executor executor() {
        return new Executor() { // from class: E
            {
                AbstractExecutionThreadService.this = this;
            }

            @Override // java.util.concurrent.Executor
            public final void execute(Runnable runnable) {
                AbstractExecutionThreadService.m39697a(AbstractExecutionThreadService.this, runnable);
            }
        };
    }

    @Override // com.google.common.util.concurrent.Service
    public final Throwable failureCause() {
        return this.f54147a.failureCause();
    }

    @Override // com.google.common.util.concurrent.Service
    public final boolean isRunning() {
        return this.f54147a.isRunning();
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
        this.f54147a.startAsync();
        return this;
    }

    public void startUp() throws Exception {
    }

    @Override // com.google.common.util.concurrent.Service
    public final Service.State state() {
        return this.f54147a.state();
    }

    @Override // com.google.common.util.concurrent.Service
    @CanIgnoreReturnValue
    public final Service stopAsync() {
        this.f54147a.stopAsync();
        return this;
    }

    public String toString() {
        return serviceName() + " [" + state() + "]";
    }

    public void triggerShutdown() {
    }

    @Override // com.google.common.util.concurrent.Service
    public final void awaitRunning(long j, TimeUnit timeUnit) throws TimeoutException {
        this.f54147a.awaitRunning(j, timeUnit);
    }

    @Override // com.google.common.util.concurrent.Service
    public final void awaitTerminated(long j, TimeUnit timeUnit) throws TimeoutException {
        this.f54147a.awaitTerminated(j, timeUnit);
    }
}

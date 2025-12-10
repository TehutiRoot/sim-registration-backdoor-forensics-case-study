package com.google.common.util.concurrent;

import com.google.common.annotations.GwtIncompatible;
import com.google.common.annotations.J2ktIncompatible;
import com.google.common.base.Supplier;
import com.google.common.util.concurrent.AbstractIdleService;
import com.google.common.util.concurrent.Service;
import com.google.errorprone.annotations.CanIgnoreReturnValue;
import java.util.concurrent.Executor;
import java.util.concurrent.TimeUnit;
import java.util.concurrent.TimeoutException;
import org.apache.commons.cli.HelpFormatter;

@J2ktIncompatible
@GwtIncompatible
/* loaded from: classes4.dex */
public abstract class AbstractIdleService implements Service {

    /* renamed from: a */
    public final Supplier f54194a = new C8182c();

    /* renamed from: b */
    public final Service f54195b = new C8181b();

    /* renamed from: com.google.common.util.concurrent.AbstractIdleService$b */
    /* loaded from: classes4.dex */
    public final class C8181b extends AbstractService {
        public C8181b() {
            AbstractIdleService.this = r1;
        }

        /* renamed from: k */
        public static /* synthetic */ void m39646k(C8181b c8181b) {
            c8181b.m39643n();
        }

        /* renamed from: l */
        public static /* synthetic */ void m39645l(C8181b c8181b) {
            c8181b.m39644m();
        }

        @Override // com.google.common.util.concurrent.AbstractService
        public final void doStart() {
            MoreExecutors.m39466e(AbstractIdleService.this.executor(), AbstractIdleService.this.f54194a).execute(new Runnable() { // from class: P
                @Override // java.lang.Runnable
                public final void run() {
                    AbstractIdleService.C8181b.m39645l(AbstractIdleService.C8181b.this);
                }
            });
        }

        @Override // com.google.common.util.concurrent.AbstractService
        public final void doStop() {
            MoreExecutors.m39466e(AbstractIdleService.this.executor(), AbstractIdleService.this.f54194a).execute(new Runnable() { // from class: O
                @Override // java.lang.Runnable
                public final void run() {
                    AbstractIdleService.C8181b.m39646k(AbstractIdleService.C8181b.this);
                }
            });
        }

        /* renamed from: m */
        public final /* synthetic */ void m39644m() {
            try {
                AbstractIdleService.this.startUp();
                notifyStarted();
            } catch (Throwable th2) {
                AbstractC23431zl1.m74b(th2);
                notifyFailed(th2);
            }
        }

        /* renamed from: n */
        public final /* synthetic */ void m39643n() {
            try {
                AbstractIdleService.this.shutDown();
                notifyStopped();
            } catch (Throwable th2) {
                AbstractC23431zl1.m74b(th2);
                notifyFailed(th2);
            }
        }

        @Override // com.google.common.util.concurrent.AbstractService
        public String toString() {
            return AbstractIdleService.this.toString();
        }
    }

    /* renamed from: com.google.common.util.concurrent.AbstractIdleService$c */
    /* loaded from: classes4.dex */
    public final class C8182c implements Supplier {
        public C8182c() {
            AbstractIdleService.this = r1;
        }

        @Override // com.google.common.base.Supplier
        /* renamed from: a */
        public String get() {
            return AbstractIdleService.this.serviceName() + HelpFormatter.DEFAULT_LONG_OPT_SEPARATOR + AbstractIdleService.this.state();
        }
    }

    /* renamed from: a */
    public static /* synthetic */ void m39649a(AbstractIdleService abstractIdleService, Runnable runnable) {
        abstractIdleService.m39647c(runnable);
    }

    /* renamed from: c */
    public /* synthetic */ void m39647c(Runnable runnable) {
        MoreExecutors.m39468c((String) this.f54194a.get(), runnable).start();
    }

    @Override // com.google.common.util.concurrent.Service
    public final void addListener(Service.Listener listener, Executor executor) {
        this.f54195b.addListener(listener, executor);
    }

    @Override // com.google.common.util.concurrent.Service
    public final void awaitRunning() {
        this.f54195b.awaitRunning();
    }

    @Override // com.google.common.util.concurrent.Service
    public final void awaitTerminated() {
        this.f54195b.awaitTerminated();
    }

    public Executor executor() {
        return new Executor() { // from class: N
            @Override // java.util.concurrent.Executor
            public final void execute(Runnable runnable) {
                AbstractIdleService.m39649a(AbstractIdleService.this, runnable);
            }
        };
    }

    @Override // com.google.common.util.concurrent.Service
    public final Throwable failureCause() {
        return this.f54195b.failureCause();
    }

    @Override // com.google.common.util.concurrent.Service
    public final boolean isRunning() {
        return this.f54195b.isRunning();
    }

    public String serviceName() {
        return getClass().getSimpleName();
    }

    public abstract void shutDown() throws Exception;

    @Override // com.google.common.util.concurrent.Service
    @CanIgnoreReturnValue
    public final Service startAsync() {
        this.f54195b.startAsync();
        return this;
    }

    public abstract void startUp() throws Exception;

    @Override // com.google.common.util.concurrent.Service
    public final Service.State state() {
        return this.f54195b.state();
    }

    @Override // com.google.common.util.concurrent.Service
    @CanIgnoreReturnValue
    public final Service stopAsync() {
        this.f54195b.stopAsync();
        return this;
    }

    public String toString() {
        return serviceName() + " [" + state() + "]";
    }

    @Override // com.google.common.util.concurrent.Service
    public final void awaitRunning(long j, TimeUnit timeUnit) throws TimeoutException {
        this.f54195b.awaitRunning(j, timeUnit);
    }

    @Override // com.google.common.util.concurrent.Service
    public final void awaitTerminated(long j, TimeUnit timeUnit) throws TimeoutException {
        this.f54195b.awaitTerminated(j, timeUnit);
    }
}
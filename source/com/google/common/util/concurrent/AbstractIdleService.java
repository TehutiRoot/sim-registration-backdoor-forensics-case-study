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
    public final Supplier f54182a = new C8193c();

    /* renamed from: b */
    public final Service f54183b = new C8192b();

    /* renamed from: com.google.common.util.concurrent.AbstractIdleService$b */
    /* loaded from: classes4.dex */
    public final class C8192b extends AbstractService {
        public C8192b() {
            AbstractIdleService.this = r1;
        }

        /* renamed from: k */
        public static /* synthetic */ void m39654k(C8192b c8192b) {
            c8192b.m39651n();
        }

        /* renamed from: l */
        public static /* synthetic */ void m39653l(C8192b c8192b) {
            c8192b.m39652m();
        }

        @Override // com.google.common.util.concurrent.AbstractService
        public final void doStart() {
            MoreExecutors.m39474e(AbstractIdleService.this.executor(), AbstractIdleService.this.f54182a).execute(new Runnable() { // from class: P
                {
                    AbstractIdleService.C8192b.this = this;
                }

                @Override // java.lang.Runnable
                public final void run() {
                    AbstractIdleService.C8192b.m39653l(AbstractIdleService.C8192b.this);
                }
            });
        }

        @Override // com.google.common.util.concurrent.AbstractService
        public final void doStop() {
            MoreExecutors.m39474e(AbstractIdleService.this.executor(), AbstractIdleService.this.f54182a).execute(new Runnable() { // from class: O
                {
                    AbstractIdleService.C8192b.this = this;
                }

                @Override // java.lang.Runnable
                public final void run() {
                    AbstractIdleService.C8192b.m39654k(AbstractIdleService.C8192b.this);
                }
            });
        }

        /* renamed from: m */
        public final /* synthetic */ void m39652m() {
            try {
                AbstractIdleService.this.startUp();
                notifyStarted();
            } catch (Throwable th2) {
                AbstractC17420Ck1.m68741b(th2);
                notifyFailed(th2);
            }
        }

        /* renamed from: n */
        public final /* synthetic */ void m39651n() {
            try {
                AbstractIdleService.this.shutDown();
                notifyStopped();
            } catch (Throwable th2) {
                AbstractC17420Ck1.m68741b(th2);
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
    public final class C8193c implements Supplier {
        public C8193c() {
            AbstractIdleService.this = r1;
        }

        @Override // com.google.common.base.Supplier
        /* renamed from: a */
        public String get() {
            return AbstractIdleService.this.serviceName() + HelpFormatter.DEFAULT_LONG_OPT_SEPARATOR + AbstractIdleService.this.state();
        }
    }

    /* renamed from: a */
    public static /* synthetic */ void m39657a(AbstractIdleService abstractIdleService, Runnable runnable) {
        abstractIdleService.m39655c(runnable);
    }

    /* renamed from: c */
    public /* synthetic */ void m39655c(Runnable runnable) {
        MoreExecutors.m39476c((String) this.f54182a.get(), runnable).start();
    }

    @Override // com.google.common.util.concurrent.Service
    public final void addListener(Service.Listener listener, Executor executor) {
        this.f54183b.addListener(listener, executor);
    }

    @Override // com.google.common.util.concurrent.Service
    public final void awaitRunning() {
        this.f54183b.awaitRunning();
    }

    @Override // com.google.common.util.concurrent.Service
    public final void awaitTerminated() {
        this.f54183b.awaitTerminated();
    }

    public Executor executor() {
        return new Executor() { // from class: N
            {
                AbstractIdleService.this = this;
            }

            @Override // java.util.concurrent.Executor
            public final void execute(Runnable runnable) {
                AbstractIdleService.m39657a(AbstractIdleService.this, runnable);
            }
        };
    }

    @Override // com.google.common.util.concurrent.Service
    public final Throwable failureCause() {
        return this.f54183b.failureCause();
    }

    @Override // com.google.common.util.concurrent.Service
    public final boolean isRunning() {
        return this.f54183b.isRunning();
    }

    public String serviceName() {
        return getClass().getSimpleName();
    }

    public abstract void shutDown() throws Exception;

    @Override // com.google.common.util.concurrent.Service
    @CanIgnoreReturnValue
    public final Service startAsync() {
        this.f54183b.startAsync();
        return this;
    }

    public abstract void startUp() throws Exception;

    @Override // com.google.common.util.concurrent.Service
    public final Service.State state() {
        return this.f54183b.state();
    }

    @Override // com.google.common.util.concurrent.Service
    @CanIgnoreReturnValue
    public final Service stopAsync() {
        this.f54183b.stopAsync();
        return this;
    }

    public String toString() {
        return serviceName() + " [" + state() + "]";
    }

    @Override // com.google.common.util.concurrent.Service
    public final void awaitRunning(long j, TimeUnit timeUnit) throws TimeoutException {
        this.f54183b.awaitRunning(j, timeUnit);
    }

    @Override // com.google.common.util.concurrent.Service
    public final void awaitTerminated(long j, TimeUnit timeUnit) throws TimeoutException {
        this.f54183b.awaitTerminated(j, timeUnit);
    }
}

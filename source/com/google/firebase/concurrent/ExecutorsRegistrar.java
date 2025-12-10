package com.google.firebase.concurrent;

import android.annotation.SuppressLint;
import android.os.Build;
import android.os.StrictMode;
import com.google.firebase.annotations.concurrent.Background;
import com.google.firebase.annotations.concurrent.Blocking;
import com.google.firebase.annotations.concurrent.Lightweight;
import com.google.firebase.annotations.concurrent.UiThread;
import com.google.firebase.components.Component;
import com.google.firebase.components.ComponentContainer;
import com.google.firebase.components.ComponentFactory;
import com.google.firebase.components.ComponentRegistrar;
import com.google.firebase.components.Lazy;
import com.google.firebase.components.Qualified;
import com.google.firebase.concurrent.ExecutorsRegistrar;
import com.google.firebase.inject.Provider;
import java.util.Arrays;
import java.util.List;
import java.util.concurrent.Executor;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;
import java.util.concurrent.ScheduledExecutorService;
import java.util.concurrent.ThreadFactory;

@SuppressLint({"ThreadPoolCreation"})
/* loaded from: classes4.dex */
public class ExecutorsRegistrar implements ComponentRegistrar {

    /* renamed from: a */
    public static final Lazy f54727a = new Lazy(new Provider() { // from class: nT
        @Override // com.google.firebase.inject.Provider
        public final Object get() {
            return ExecutorsRegistrar.m39187f();
        }
    });

    /* renamed from: b */
    public static final Lazy f54728b = new Lazy(new Provider() { // from class: oT
        @Override // com.google.firebase.inject.Provider
        public final Object get() {
            return ExecutorsRegistrar.m39190c();
        }
    });

    /* renamed from: c */
    public static final Lazy f54729c = new Lazy(new Provider() { // from class: pT
        @Override // com.google.firebase.inject.Provider
        public final Object get() {
            return ExecutorsRegistrar.m39185h();
        }
    });

    /* renamed from: d */
    public static final Lazy f54730d = new Lazy(new Provider() { // from class: qT
        @Override // com.google.firebase.inject.Provider
        public final Object get() {
            return ExecutorsRegistrar.m39191b();
        }
    });

    /* renamed from: a */
    public static /* synthetic */ ScheduledExecutorService m39192a(ComponentContainer componentContainer) {
        return m39179n(componentContainer);
    }

    /* renamed from: b */
    public static /* synthetic */ ScheduledExecutorService m39191b() {
        return m39174s();
    }

    /* renamed from: c */
    public static /* synthetic */ ScheduledExecutorService m39190c() {
        return m39176q();
    }

    /* renamed from: d */
    public static /* synthetic */ Executor m39189d(ComponentContainer componentContainer) {
        return UiExecutor.INSTANCE;
    }

    /* renamed from: e */
    public static /* synthetic */ ScheduledExecutorService m39188e(ComponentContainer componentContainer) {
        return m39180m(componentContainer);
    }

    /* renamed from: f */
    public static /* synthetic */ ScheduledExecutorService m39187f() {
        return m39177p();
    }

    /* renamed from: g */
    public static /* synthetic */ ScheduledExecutorService m39186g(ComponentContainer componentContainer) {
        return m39181l(componentContainer);
    }

    /* renamed from: h */
    public static /* synthetic */ ScheduledExecutorService m39185h() {
        return m39175r();
    }

    /* renamed from: i */
    public static StrictMode.ThreadPolicy m39184i() {
        StrictMode.ThreadPolicy.Builder detectNetwork = new StrictMode.ThreadPolicy.Builder().detectNetwork();
        int i = Build.VERSION.SDK_INT;
        if (i >= 23) {
            detectNetwork.detectResourceMismatches();
            if (i >= 26) {
                detectNetwork.detectUnbufferedIo();
            }
        }
        return detectNetwork.penaltyLog().build();
    }

    /* renamed from: j */
    public static ThreadFactory m39183j(String str, int i) {
        return new ThreadFactoryC1152QA(str, i, null);
    }

    /* renamed from: k */
    public static ThreadFactory m39182k(String str, int i, StrictMode.ThreadPolicy threadPolicy) {
        return new ThreadFactoryC1152QA(str, i, threadPolicy);
    }

    /* renamed from: l */
    public static /* synthetic */ ScheduledExecutorService m39181l(ComponentContainer componentContainer) {
        return (ScheduledExecutorService) f54727a.get();
    }

    /* renamed from: m */
    public static /* synthetic */ ScheduledExecutorService m39180m(ComponentContainer componentContainer) {
        return (ScheduledExecutorService) f54729c.get();
    }

    /* renamed from: n */
    public static /* synthetic */ ScheduledExecutorService m39179n(ComponentContainer componentContainer) {
        return (ScheduledExecutorService) f54728b.get();
    }

    /* renamed from: p */
    public static /* synthetic */ ScheduledExecutorService m39177p() {
        return m39172u(Executors.newFixedThreadPool(4, m39182k("Firebase Background", 10, m39184i())));
    }

    /* renamed from: q */
    public static /* synthetic */ ScheduledExecutorService m39176q() {
        return m39172u(Executors.newFixedThreadPool(Math.max(2, Runtime.getRuntime().availableProcessors()), m39182k("Firebase Lite", 0, m39173t())));
    }

    /* renamed from: r */
    public static /* synthetic */ ScheduledExecutorService m39175r() {
        return m39172u(Executors.newCachedThreadPool(m39183j("Firebase Blocking", 11)));
    }

    /* renamed from: s */
    public static /* synthetic */ ScheduledExecutorService m39174s() {
        return Executors.newSingleThreadScheduledExecutor(m39183j("Firebase Scheduler", 0));
    }

    /* renamed from: t */
    public static StrictMode.ThreadPolicy m39173t() {
        return new StrictMode.ThreadPolicy.Builder().detectAll().penaltyLog().build();
    }

    /* renamed from: u */
    public static ScheduledExecutorService m39172u(ExecutorService executorService) {
        return new ScheduledExecutorServiceC1086PF(executorService, (ScheduledExecutorService) f54730d.get());
    }

    @Override // com.google.firebase.components.ComponentRegistrar
    public List<Component<?>> getComponents() {
        return Arrays.asList(Component.builder(Qualified.qualified(Background.class, ScheduledExecutorService.class), Qualified.qualified(Background.class, ExecutorService.class), Qualified.qualified(Background.class, Executor.class)).factory(new ComponentFactory() { // from class: rT
            @Override // com.google.firebase.components.ComponentFactory
            public final Object create(ComponentContainer componentContainer) {
                return ExecutorsRegistrar.m39186g(componentContainer);
            }
        }).build(), Component.builder(Qualified.qualified(Blocking.class, ScheduledExecutorService.class), Qualified.qualified(Blocking.class, ExecutorService.class), Qualified.qualified(Blocking.class, Executor.class)).factory(new ComponentFactory() { // from class: sT
            @Override // com.google.firebase.components.ComponentFactory
            public final Object create(ComponentContainer componentContainer) {
                return ExecutorsRegistrar.m39188e(componentContainer);
            }
        }).build(), Component.builder(Qualified.qualified(Lightweight.class, ScheduledExecutorService.class), Qualified.qualified(Lightweight.class, ExecutorService.class), Qualified.qualified(Lightweight.class, Executor.class)).factory(new ComponentFactory() { // from class: tT
            @Override // com.google.firebase.components.ComponentFactory
            public final Object create(ComponentContainer componentContainer) {
                return ExecutorsRegistrar.m39192a(componentContainer);
            }
        }).build(), Component.builder(Qualified.qualified(UiThread.class, Executor.class)).factory(new ComponentFactory() { // from class: uT
            @Override // com.google.firebase.components.ComponentFactory
            public final Object create(ComponentContainer componentContainer) {
                return ExecutorsRegistrar.m39189d(componentContainer);
            }
        }).build());
    }
}

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
import com.google.firebase.concurrent.UiExecutor;
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
    public static final Lazy f54739a = new Lazy(new Provider() { // from class: rT
        @Override // com.google.firebase.inject.Provider
        public final Object get() {
            return ExecutorsRegistrar.m39179f();
        }
    });

    /* renamed from: b */
    public static final Lazy f54740b = new Lazy(new Provider() { // from class: sT
        @Override // com.google.firebase.inject.Provider
        public final Object get() {
            return ExecutorsRegistrar.m39182c();
        }
    });

    /* renamed from: c */
    public static final Lazy f54741c = new Lazy(new Provider() { // from class: tT
        @Override // com.google.firebase.inject.Provider
        public final Object get() {
            return ExecutorsRegistrar.m39177h();
        }
    });

    /* renamed from: d */
    public static final Lazy f54742d = new Lazy(new Provider() { // from class: uT
        @Override // com.google.firebase.inject.Provider
        public final Object get() {
            return ExecutorsRegistrar.m39183b();
        }
    });

    /* renamed from: b */
    public static /* synthetic */ ScheduledExecutorService m39183b() {
        return m39166s();
    }

    /* renamed from: c */
    public static /* synthetic */ ScheduledExecutorService m39182c() {
        return m39168q();
    }

    /* renamed from: f */
    public static /* synthetic */ ScheduledExecutorService m39179f() {
        return m39169p();
    }

    /* renamed from: h */
    public static /* synthetic */ ScheduledExecutorService m39177h() {
        return m39167r();
    }

    /* renamed from: i */
    public static StrictMode.ThreadPolicy m39176i() {
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
    public static ThreadFactory m39175j(String str, int i) {
        return new ThreadFactoryC1141QA(str, i, null);
    }

    /* renamed from: k */
    public static ThreadFactory m39174k(String str, int i, StrictMode.ThreadPolicy threadPolicy) {
        return new ThreadFactoryC1141QA(str, i, threadPolicy);
    }

    /* renamed from: l */
    public static /* synthetic */ ScheduledExecutorService m39173l(ComponentContainer componentContainer) {
        return (ScheduledExecutorService) f54739a.get();
    }

    /* renamed from: m */
    public static /* synthetic */ ScheduledExecutorService m39172m(ComponentContainer componentContainer) {
        return (ScheduledExecutorService) f54741c.get();
    }

    /* renamed from: n */
    public static /* synthetic */ ScheduledExecutorService m39171n(ComponentContainer componentContainer) {
        return (ScheduledExecutorService) f54740b.get();
    }

    /* renamed from: p */
    public static /* synthetic */ ScheduledExecutorService m39169p() {
        return m39164u(Executors.newFixedThreadPool(4, m39174k("Firebase Background", 10, m39176i())));
    }

    /* renamed from: q */
    public static /* synthetic */ ScheduledExecutorService m39168q() {
        return m39164u(Executors.newFixedThreadPool(Math.max(2, Runtime.getRuntime().availableProcessors()), m39174k("Firebase Lite", 0, m39165t())));
    }

    /* renamed from: r */
    public static /* synthetic */ ScheduledExecutorService m39167r() {
        return m39164u(Executors.newCachedThreadPool(m39175j("Firebase Blocking", 11)));
    }

    /* renamed from: s */
    public static /* synthetic */ ScheduledExecutorService m39166s() {
        return Executors.newSingleThreadScheduledExecutor(m39175j("Firebase Scheduler", 0));
    }

    /* renamed from: t */
    public static StrictMode.ThreadPolicy m39165t() {
        return new StrictMode.ThreadPolicy.Builder().detectAll().penaltyLog().build();
    }

    /* renamed from: u */
    public static ScheduledExecutorService m39164u(ExecutorService executorService) {
        return new ScheduledExecutorServiceC1146QF(executorService, (ScheduledExecutorService) f54742d.get());
    }

    @Override // com.google.firebase.components.ComponentRegistrar
    public List<Component<?>> getComponents() {
        return Arrays.asList(Component.builder(Qualified.qualified(Background.class, ScheduledExecutorService.class), Qualified.qualified(Background.class, ExecutorService.class), Qualified.qualified(Background.class, Executor.class)).factory(new ComponentFactory() { // from class: vT
            @Override // com.google.firebase.components.ComponentFactory
            public final Object create(ComponentContainer componentContainer) {
                ScheduledExecutorService m39173l;
                m39173l = ExecutorsRegistrar.m39173l(componentContainer);
                return m39173l;
            }
        }).build(), Component.builder(Qualified.qualified(Blocking.class, ScheduledExecutorService.class), Qualified.qualified(Blocking.class, ExecutorService.class), Qualified.qualified(Blocking.class, Executor.class)).factory(new ComponentFactory() { // from class: wT
            @Override // com.google.firebase.components.ComponentFactory
            public final Object create(ComponentContainer componentContainer) {
                ScheduledExecutorService m39172m;
                m39172m = ExecutorsRegistrar.m39172m(componentContainer);
                return m39172m;
            }
        }).build(), Component.builder(Qualified.qualified(Lightweight.class, ScheduledExecutorService.class), Qualified.qualified(Lightweight.class, ExecutorService.class), Qualified.qualified(Lightweight.class, Executor.class)).factory(new ComponentFactory() { // from class: xT
            @Override // com.google.firebase.components.ComponentFactory
            public final Object create(ComponentContainer componentContainer) {
                ScheduledExecutorService m39171n;
                m39171n = ExecutorsRegistrar.m39171n(componentContainer);
                return m39171n;
            }
        }).build(), Component.builder(Qualified.qualified(UiThread.class, Executor.class)).factory(new ComponentFactory() { // from class: yT
            @Override // com.google.firebase.components.ComponentFactory
            public final Object create(ComponentContainer componentContainer) {
                Executor executor;
                executor = UiExecutor.INSTANCE;
                return executor;
            }
        }).build());
    }
}
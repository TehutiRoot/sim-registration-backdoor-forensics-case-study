package io.reactivex.android.plugins;

import io.reactivex.Scheduler;
import io.reactivex.exceptions.Exceptions;
import io.reactivex.functions.Function;
import java.util.concurrent.Callable;

/* loaded from: classes5.dex */
public final class RxAndroidPlugins {

    /* renamed from: a */
    public static volatile Function f63874a;

    /* renamed from: b */
    public static volatile Function f63875b;

    /* renamed from: a */
    public static Object m30442a(Function function, Object obj) {
        try {
            return function.apply(obj);
        } catch (Throwable th2) {
            throw Exceptions.propagate(th2);
        }
    }

    /* renamed from: b */
    public static Scheduler m30441b(Function function, Callable callable) {
        Scheduler scheduler = (Scheduler) m30442a(function, callable);
        if (scheduler != null) {
            return scheduler;
        }
        throw new NullPointerException("Scheduler Callable returned null");
    }

    /* renamed from: c */
    public static Scheduler m30440c(Callable callable) {
        try {
            Scheduler scheduler = (Scheduler) callable.call();
            if (scheduler != null) {
                return scheduler;
            }
            throw new NullPointerException("Scheduler Callable returned null");
        } catch (Throwable th2) {
            throw Exceptions.propagate(th2);
        }
    }

    public static Function<Callable<Scheduler>, Scheduler> getInitMainThreadSchedulerHandler() {
        return f63874a;
    }

    public static Function<Scheduler, Scheduler> getOnMainThreadSchedulerHandler() {
        return f63875b;
    }

    public static Scheduler initMainThreadScheduler(Callable<Scheduler> callable) {
        if (callable != null) {
            Function function = f63874a;
            if (function == null) {
                return m30440c(callable);
            }
            return m30441b(function, callable);
        }
        throw new NullPointerException("scheduler == null");
    }

    public static Scheduler onMainThreadScheduler(Scheduler scheduler) {
        if (scheduler != null) {
            Function function = f63875b;
            if (function == null) {
                return scheduler;
            }
            return (Scheduler) m30442a(function, scheduler);
        }
        throw new NullPointerException("scheduler == null");
    }

    public static void reset() {
        setInitMainThreadSchedulerHandler(null);
        setMainThreadSchedulerHandler(null);
    }

    public static void setInitMainThreadSchedulerHandler(Function<Callable<Scheduler>, Scheduler> function) {
        f63874a = function;
    }

    public static void setMainThreadSchedulerHandler(Function<Scheduler, Scheduler> function) {
        f63875b = function;
    }
}
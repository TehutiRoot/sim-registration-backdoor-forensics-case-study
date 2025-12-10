package io.reactivex.android.plugins;

import io.reactivex.Scheduler;
import io.reactivex.exceptions.Exceptions;
import io.reactivex.functions.Function;
import java.util.concurrent.Callable;

/* loaded from: classes5.dex */
public final class RxAndroidPlugins {

    /* renamed from: a */
    public static volatile Function f63811a;

    /* renamed from: b */
    public static volatile Function f63812b;

    /* renamed from: a */
    public static Object m30102a(Function function, Object obj) {
        try {
            return function.apply(obj);
        } catch (Throwable th2) {
            throw Exceptions.propagate(th2);
        }
    }

    /* renamed from: b */
    public static Scheduler m30101b(Function function, Callable callable) {
        Scheduler scheduler = (Scheduler) m30102a(function, callable);
        if (scheduler != null) {
            return scheduler;
        }
        throw new NullPointerException("Scheduler Callable returned null");
    }

    /* renamed from: c */
    public static Scheduler m30100c(Callable callable) {
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
        return f63811a;
    }

    public static Function<Scheduler, Scheduler> getOnMainThreadSchedulerHandler() {
        return f63812b;
    }

    public static Scheduler initMainThreadScheduler(Callable<Scheduler> callable) {
        if (callable != null) {
            Function function = f63811a;
            if (function == null) {
                return m30100c(callable);
            }
            return m30101b(function, callable);
        }
        throw new NullPointerException("scheduler == null");
    }

    public static Scheduler onMainThreadScheduler(Scheduler scheduler) {
        if (scheduler != null) {
            Function function = f63812b;
            if (function == null) {
                return scheduler;
            }
            return (Scheduler) m30102a(function, scheduler);
        }
        throw new NullPointerException("scheduler == null");
    }

    public static void reset() {
        setInitMainThreadSchedulerHandler(null);
        setMainThreadSchedulerHandler(null);
    }

    public static void setInitMainThreadSchedulerHandler(Function<Callable<Scheduler>, Scheduler> function) {
        f63811a = function;
    }

    public static void setMainThreadSchedulerHandler(Function<Scheduler, Scheduler> function) {
        f63812b = function;
    }
}

package p046rx.internal.schedulers;

import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;
import java.util.Iterator;
import java.util.concurrent.ConcurrentHashMap;
import java.util.concurrent.Executors;
import java.util.concurrent.Future;
import java.util.concurrent.ScheduledExecutorService;
import java.util.concurrent.ScheduledThreadPoolExecutor;
import java.util.concurrent.ThreadFactory;
import java.util.concurrent.TimeUnit;
import java.util.concurrent.atomic.AtomicReference;
import p046rx.Scheduler;
import p046rx.Subscription;
import p046rx.exceptions.Exceptions;
import p046rx.functions.Action0;
import p046rx.internal.util.PlatformDependent;
import p046rx.internal.util.RxThreadFactory;
import p046rx.internal.util.SubscriptionList;
import p046rx.plugins.RxJavaHooks;
import p046rx.subscriptions.CompositeSubscription;
import p046rx.subscriptions.Subscriptions;

/* renamed from: rx.internal.schedulers.NewThreadWorker */
/* loaded from: classes7.dex */
public class NewThreadWorker extends Scheduler.Worker implements Subscription {

    /* renamed from: c */
    public static final boolean f79119c;

    /* renamed from: f */
    public static volatile Object f79122f;

    /* renamed from: a */
    public final ScheduledExecutorService f79124a;

    /* renamed from: b */
    public volatile boolean f79125b;

    /* renamed from: g */
    public static final Object f79123g = new Object();

    /* renamed from: d */
    public static final ConcurrentHashMap f79120d = new ConcurrentHashMap();

    /* renamed from: e */
    public static final AtomicReference f79121e = new AtomicReference();
    public static final int PURGE_FREQUENCY = Integer.getInteger("rx.scheduler.jdk6.purge-frequency-millis", 1000).intValue();

    /* renamed from: rx.internal.schedulers.NewThreadWorker$a */
    /* loaded from: classes7.dex */
    public static class RunnableC13744a implements Runnable {
        @Override // java.lang.Runnable
        public void run() {
            NewThreadWorker.m22914b();
        }
    }

    static {
        boolean z;
        boolean z2 = Boolean.getBoolean("rx.scheduler.jdk6.purge-force");
        int androidApiVersion = PlatformDependent.getAndroidApiVersion();
        if (!z2 && (androidApiVersion == 0 || androidApiVersion >= 21)) {
            z = true;
        } else {
            z = false;
        }
        f79119c = z;
    }

    public NewThreadWorker(ThreadFactory threadFactory) {
        ScheduledExecutorService newScheduledThreadPool = Executors.newScheduledThreadPool(1, threadFactory);
        if (!tryEnableCancelPolicy(newScheduledThreadPool) && (newScheduledThreadPool instanceof ScheduledThreadPoolExecutor)) {
            registerExecutor((ScheduledThreadPoolExecutor) newScheduledThreadPool);
        }
        this.f79124a = newScheduledThreadPool;
    }

    /* renamed from: a */
    public static Method m22915a(ScheduledExecutorService scheduledExecutorService) {
        Method[] methods;
        for (Method method : scheduledExecutorService.getClass().getMethods()) {
            if (method.getName().equals("setRemoveOnCancelPolicy")) {
                Class<?>[] parameterTypes = method.getParameterTypes();
                if (parameterTypes.length == 1 && parameterTypes[0] == Boolean.TYPE) {
                    return method;
                }
            }
        }
        return null;
    }

    /* renamed from: b */
    public static void m22914b() {
        try {
            Iterator it = f79120d.keySet().iterator();
            while (it.hasNext()) {
                ScheduledThreadPoolExecutor scheduledThreadPoolExecutor = (ScheduledThreadPoolExecutor) it.next();
                if (!scheduledThreadPoolExecutor.isShutdown()) {
                    scheduledThreadPoolExecutor.purge();
                } else {
                    it.remove();
                }
            }
        } catch (Throwable th2) {
            Exceptions.throwIfFatal(th2);
            RxJavaHooks.onError(th2);
        }
    }

    public static void deregisterExecutor(ScheduledExecutorService scheduledExecutorService) {
        f79120d.remove(scheduledExecutorService);
    }

    public static void registerExecutor(ScheduledThreadPoolExecutor scheduledThreadPoolExecutor) {
        while (true) {
            AtomicReference atomicReference = f79121e;
            if (((ScheduledExecutorService) atomicReference.get()) != null) {
                break;
            }
            ScheduledExecutorService newScheduledThreadPool = Executors.newScheduledThreadPool(1, new RxThreadFactory("RxSchedulerPurge-"));
            if (AbstractC17300An1.m69050a(atomicReference, null, newScheduledThreadPool)) {
                RunnableC13744a runnableC13744a = new RunnableC13744a();
                int i = PURGE_FREQUENCY;
                newScheduledThreadPool.scheduleAtFixedRate(runnableC13744a, i, i, TimeUnit.MILLISECONDS);
                break;
            }
            newScheduledThreadPool.shutdownNow();
        }
        f79120d.putIfAbsent(scheduledThreadPoolExecutor, scheduledThreadPoolExecutor);
    }

    public static boolean tryEnableCancelPolicy(ScheduledExecutorService scheduledExecutorService) {
        Method m22915a;
        if (f79119c) {
            if (scheduledExecutorService instanceof ScheduledThreadPoolExecutor) {
                Object obj = f79122f;
                Object obj2 = f79123g;
                if (obj == obj2) {
                    return false;
                }
                if (obj == null) {
                    m22915a = m22915a(scheduledExecutorService);
                    if (m22915a != null) {
                        obj2 = m22915a;
                    }
                    f79122f = obj2;
                } else {
                    m22915a = (Method) obj;
                }
            } else {
                m22915a = m22915a(scheduledExecutorService);
            }
            if (m22915a != null) {
                try {
                    m22915a.invoke(scheduledExecutorService, Boolean.TRUE);
                    return true;
                } catch (IllegalAccessException e) {
                    RxJavaHooks.onError(e);
                } catch (IllegalArgumentException e2) {
                    RxJavaHooks.onError(e2);
                } catch (InvocationTargetException e3) {
                    RxJavaHooks.onError(e3);
                }
            }
        }
        return false;
    }

    @Override // p046rx.Subscription
    public boolean isUnsubscribed() {
        return this.f79125b;
    }

    @Override // p046rx.Scheduler.Worker
    public Subscription schedule(Action0 action0) {
        return schedule(action0, 0L, null);
    }

    public ScheduledAction scheduleActual(Action0 action0, long j, TimeUnit timeUnit) {
        Future<?> schedule;
        ScheduledAction scheduledAction = new ScheduledAction(RxJavaHooks.onScheduledAction(action0));
        if (j <= 0) {
            schedule = this.f79124a.submit(scheduledAction);
        } else {
            schedule = this.f79124a.schedule(scheduledAction, j, timeUnit);
        }
        scheduledAction.add(schedule);
        return scheduledAction;
    }

    @Override // p046rx.Subscription
    public void unsubscribe() {
        this.f79125b = true;
        this.f79124a.shutdownNow();
        deregisterExecutor(this.f79124a);
    }

    @Override // p046rx.Scheduler.Worker
    public Subscription schedule(Action0 action0, long j, TimeUnit timeUnit) {
        if (this.f79125b) {
            return Subscriptions.unsubscribed();
        }
        return scheduleActual(action0, j, timeUnit);
    }

    public ScheduledAction scheduleActual(Action0 action0, long j, TimeUnit timeUnit, CompositeSubscription compositeSubscription) {
        Future<?> schedule;
        ScheduledAction scheduledAction = new ScheduledAction(RxJavaHooks.onScheduledAction(action0), compositeSubscription);
        compositeSubscription.add(scheduledAction);
        if (j <= 0) {
            schedule = this.f79124a.submit(scheduledAction);
        } else {
            schedule = this.f79124a.schedule(scheduledAction, j, timeUnit);
        }
        scheduledAction.add(schedule);
        return scheduledAction;
    }

    public ScheduledAction scheduleActual(Action0 action0, long j, TimeUnit timeUnit, SubscriptionList subscriptionList) {
        Future<?> schedule;
        ScheduledAction scheduledAction = new ScheduledAction(RxJavaHooks.onScheduledAction(action0), subscriptionList);
        subscriptionList.add(scheduledAction);
        if (j <= 0) {
            schedule = this.f79124a.submit(scheduledAction);
        } else {
            schedule = this.f79124a.schedule(scheduledAction, j, timeUnit);
        }
        scheduledAction.add(schedule);
        return scheduledAction;
    }
}

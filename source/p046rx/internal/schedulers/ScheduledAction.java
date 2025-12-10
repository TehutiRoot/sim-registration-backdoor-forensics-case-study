package p046rx.internal.schedulers;

import java.util.concurrent.Future;
import java.util.concurrent.atomic.AtomicBoolean;
import java.util.concurrent.atomic.AtomicReference;
import p046rx.Subscription;
import p046rx.exceptions.OnErrorNotImplementedException;
import p046rx.functions.Action0;
import p046rx.internal.util.SubscriptionList;
import p046rx.plugins.RxJavaHooks;
import p046rx.subscriptions.CompositeSubscription;

/* renamed from: rx.internal.schedulers.ScheduledAction */
/* loaded from: classes7.dex */
public final class ScheduledAction extends AtomicReference<Thread> implements Runnable, Subscription {
    private static final long serialVersionUID = -3962399486978279857L;
    final Action0 action;
    final SubscriptionList cancel;

    /* renamed from: rx.internal.schedulers.ScheduledAction$Remover */
    /* loaded from: classes7.dex */
    public static final class Remover extends AtomicBoolean implements Subscription {
        private static final long serialVersionUID = 247232374289553518L;
        final CompositeSubscription parent;

        /* renamed from: s */
        final ScheduledAction f79136s;

        public Remover(ScheduledAction scheduledAction, CompositeSubscription compositeSubscription) {
            this.f79136s = scheduledAction;
            this.parent = compositeSubscription;
        }

        @Override // p046rx.Subscription
        public boolean isUnsubscribed() {
            return this.f79136s.isUnsubscribed();
        }

        @Override // p046rx.Subscription
        public void unsubscribe() {
            if (compareAndSet(false, true)) {
                this.parent.remove(this.f79136s);
            }
        }
    }

    /* renamed from: rx.internal.schedulers.ScheduledAction$Remover2 */
    /* loaded from: classes7.dex */
    public static final class Remover2 extends AtomicBoolean implements Subscription {
        private static final long serialVersionUID = 247232374289553518L;
        final SubscriptionList parent;

        /* renamed from: s */
        final ScheduledAction f79137s;

        public Remover2(ScheduledAction scheduledAction, SubscriptionList subscriptionList) {
            this.f79137s = scheduledAction;
            this.parent = subscriptionList;
        }

        @Override // p046rx.Subscription
        public boolean isUnsubscribed() {
            return this.f79137s.isUnsubscribed();
        }

        @Override // p046rx.Subscription
        public void unsubscribe() {
            if (compareAndSet(false, true)) {
                this.parent.remove(this.f79137s);
            }
        }
    }

    /* renamed from: rx.internal.schedulers.ScheduledAction$a */
    /* loaded from: classes7.dex */
    public final class C13746a implements Subscription {

        /* renamed from: a */
        public final Future f79138a;

        public C13746a(Future future) {
            this.f79138a = future;
        }

        @Override // p046rx.Subscription
        public boolean isUnsubscribed() {
            return this.f79138a.isCancelled();
        }

        @Override // p046rx.Subscription
        public void unsubscribe() {
            if (ScheduledAction.this.get() != Thread.currentThread()) {
                this.f79138a.cancel(true);
            } else {
                this.f79138a.cancel(false);
            }
        }
    }

    public ScheduledAction(Action0 action0) {
        this.action = action0;
        this.cancel = new SubscriptionList();
    }

    public void add(Subscription subscription) {
        this.cancel.add(subscription);
    }

    public void addParent(CompositeSubscription compositeSubscription) {
        this.cancel.add(new Remover(this, compositeSubscription));
    }

    @Override // p046rx.Subscription
    public boolean isUnsubscribed() {
        return this.cancel.isUnsubscribed();
    }

    @Override // java.lang.Runnable
    public void run() {
        try {
            try {
                lazySet(Thread.currentThread());
                this.action.call();
            } catch (OnErrorNotImplementedException e) {
                signalError(new IllegalStateException("Exception thrown on Scheduler.Worker thread. Add `onError` handling.", e));
                unsubscribe();
            } catch (Throwable th2) {
                signalError(new IllegalStateException("Fatal Exception thrown on Scheduler.Worker thread.", th2));
                unsubscribe();
            }
            unsubscribe();
        } catch (Throwable th3) {
            unsubscribe();
            throw th3;
        }
    }

    public void signalError(Throwable th2) {
        RxJavaHooks.onError(th2);
        Thread currentThread = Thread.currentThread();
        currentThread.getUncaughtExceptionHandler().uncaughtException(currentThread, th2);
    }

    @Override // p046rx.Subscription
    public void unsubscribe() {
        if (!this.cancel.isUnsubscribed()) {
            this.cancel.unsubscribe();
        }
    }

    public void add(Future<?> future) {
        this.cancel.add(new C13746a(future));
    }

    public void addParent(SubscriptionList subscriptionList) {
        this.cancel.add(new Remover2(this, subscriptionList));
    }

    public ScheduledAction(Action0 action0, CompositeSubscription compositeSubscription) {
        this.action = action0;
        this.cancel = new SubscriptionList(new Remover(this, compositeSubscription));
    }

    public ScheduledAction(Action0 action0, SubscriptionList subscriptionList) {
        this.action = action0;
        this.cancel = new SubscriptionList(new Remover2(this, subscriptionList));
    }
}

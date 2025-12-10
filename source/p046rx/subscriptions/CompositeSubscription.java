package p046rx.subscriptions;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collection;
import java.util.HashSet;
import java.util.Iterator;
import java.util.Set;
import p046rx.Subscription;
import p046rx.exceptions.Exceptions;

/* renamed from: rx.subscriptions.CompositeSubscription */
/* loaded from: classes7.dex */
public final class CompositeSubscription implements Subscription {

    /* renamed from: a */
    public Set f79511a;

    /* renamed from: b */
    public volatile boolean f79512b;

    public CompositeSubscription() {
    }

    /* renamed from: a */
    private static void m22736a(Collection collection) {
        if (collection == null) {
            return;
        }
        Iterator it = collection.iterator();
        ArrayList arrayList = null;
        while (it.hasNext()) {
            try {
                ((Subscription) it.next()).unsubscribe();
            } catch (Throwable th2) {
                if (arrayList == null) {
                    arrayList = new ArrayList();
                }
                arrayList.add(th2);
            }
        }
        Exceptions.throwIfAny(arrayList);
    }

    public void add(Subscription subscription) {
        if (subscription.isUnsubscribed()) {
            return;
        }
        if (!this.f79512b) {
            synchronized (this) {
                try {
                    if (!this.f79512b) {
                        if (this.f79511a == null) {
                            this.f79511a = new HashSet(4);
                        }
                        this.f79511a.add(subscription);
                        return;
                    }
                } finally {
                }
            }
        }
        subscription.unsubscribe();
    }

    public void addAll(Subscription... subscriptionArr) {
        int i = 0;
        if (!this.f79512b) {
            synchronized (this) {
                try {
                    if (!this.f79512b) {
                        if (this.f79511a == null) {
                            this.f79511a = new HashSet(subscriptionArr.length);
                        }
                        int length = subscriptionArr.length;
                        while (i < length) {
                            Subscription subscription = subscriptionArr[i];
                            if (!subscription.isUnsubscribed()) {
                                this.f79511a.add(subscription);
                            }
                            i++;
                        }
                        return;
                    }
                } finally {
                }
            }
        }
        int length2 = subscriptionArr.length;
        while (i < length2) {
            subscriptionArr[i].unsubscribe();
            i++;
        }
    }

    public void clear() {
        Set set;
        if (!this.f79512b) {
            synchronized (this) {
                if (!this.f79512b && (set = this.f79511a) != null) {
                    this.f79511a = null;
                    m22736a(set);
                }
            }
        }
    }

    public boolean hasSubscriptions() {
        Set set;
        boolean z = false;
        if (this.f79512b) {
            return false;
        }
        synchronized (this) {
            try {
                if (!this.f79512b && (set = this.f79511a) != null && !set.isEmpty()) {
                    z = true;
                }
            } finally {
            }
        }
        return z;
    }

    @Override // p046rx.Subscription
    public boolean isUnsubscribed() {
        return this.f79512b;
    }

    public void remove(Subscription subscription) {
        Set set;
        if (!this.f79512b) {
            synchronized (this) {
                if (!this.f79512b && (set = this.f79511a) != null) {
                    boolean remove = set.remove(subscription);
                    if (remove) {
                        subscription.unsubscribe();
                    }
                }
            }
        }
    }

    @Override // p046rx.Subscription
    public void unsubscribe() {
        if (!this.f79512b) {
            synchronized (this) {
                try {
                    if (this.f79512b) {
                        return;
                    }
                    this.f79512b = true;
                    Set set = this.f79511a;
                    this.f79511a = null;
                    m22736a(set);
                } catch (Throwable th2) {
                    throw th2;
                }
            }
        }
    }

    public CompositeSubscription(Subscription... subscriptionArr) {
        this.f79511a = new HashSet(Arrays.asList(subscriptionArr));
    }
}

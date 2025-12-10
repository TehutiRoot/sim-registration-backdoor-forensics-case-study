package p046rx.internal.util;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collection;
import java.util.Iterator;
import java.util.LinkedList;
import java.util.List;
import p046rx.Subscription;
import p046rx.exceptions.Exceptions;

/* renamed from: rx.internal.util.SubscriptionList */
/* loaded from: classes7.dex */
public final class SubscriptionList implements Subscription {

    /* renamed from: a */
    public List f79449a;

    /* renamed from: b */
    public volatile boolean f79450b;

    public SubscriptionList() {
    }

    /* renamed from: a */
    public static void m23055a(Collection collection) {
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
        if (!this.f79450b) {
            synchronized (this) {
                try {
                    if (!this.f79450b) {
                        List list = this.f79449a;
                        if (list == null) {
                            list = new LinkedList();
                            this.f79449a = list;
                        }
                        list.add(subscription);
                        return;
                    }
                } finally {
                }
            }
        }
        subscription.unsubscribe();
    }

    public void clear() {
        List list;
        if (!this.f79450b) {
            synchronized (this) {
                list = this.f79449a;
                this.f79449a = null;
            }
            m23055a(list);
        }
    }

    public boolean hasSubscriptions() {
        List list;
        boolean z = false;
        if (this.f79450b) {
            return false;
        }
        synchronized (this) {
            try {
                if (!this.f79450b && (list = this.f79449a) != null && !list.isEmpty()) {
                    z = true;
                }
            } finally {
            }
        }
        return z;
    }

    @Override // p046rx.Subscription
    public boolean isUnsubscribed() {
        return this.f79450b;
    }

    public void remove(Subscription subscription) {
        if (!this.f79450b) {
            synchronized (this) {
                List list = this.f79449a;
                if (!this.f79450b && list != null) {
                    boolean remove = list.remove(subscription);
                    if (remove) {
                        subscription.unsubscribe();
                    }
                }
            }
        }
    }

    @Override // p046rx.Subscription
    public void unsubscribe() {
        if (!this.f79450b) {
            synchronized (this) {
                try {
                    if (this.f79450b) {
                        return;
                    }
                    this.f79450b = true;
                    List list = this.f79449a;
                    this.f79449a = null;
                    m23055a(list);
                } catch (Throwable th2) {
                    throw th2;
                }
            }
        }
    }

    public SubscriptionList(Subscription... subscriptionArr) {
        this.f79449a = new LinkedList(Arrays.asList(subscriptionArr));
    }

    public SubscriptionList(Subscription subscription) {
        LinkedList linkedList = new LinkedList();
        this.f79449a = linkedList;
        linkedList.add(subscription);
    }
}
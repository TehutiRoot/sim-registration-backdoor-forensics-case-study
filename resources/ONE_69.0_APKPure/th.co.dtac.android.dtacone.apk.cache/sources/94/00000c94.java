package p000;

import io.reactivex.Observer;
import io.reactivex.disposables.Disposable;
import io.reactivex.internal.util.AppendOnlyLinkedArrayList;
import io.reactivex.internal.util.NotificationLite;
import io.reactivex.plugins.RxJavaPlugins;
import io.reactivex.subjects.Subject;

/* renamed from: NG1 */
/* loaded from: classes5.dex */
public final class NG1 extends Subject implements AppendOnlyLinkedArrayList.NonThrowingPredicate {

    /* renamed from: a */
    public final Subject f4123a;

    /* renamed from: b */
    public boolean f4124b;

    /* renamed from: c */
    public AppendOnlyLinkedArrayList f4125c;

    /* renamed from: d */
    public volatile boolean f4126d;

    public NG1(Subject subject) {
        this.f4123a = subject;
    }

    /* renamed from: d */
    public void m67262d() {
        AppendOnlyLinkedArrayList appendOnlyLinkedArrayList;
        while (true) {
            synchronized (this) {
                try {
                    appendOnlyLinkedArrayList = this.f4125c;
                    if (appendOnlyLinkedArrayList == null) {
                        this.f4124b = false;
                        return;
                    }
                    this.f4125c = null;
                } catch (Throwable th2) {
                    throw th2;
                }
            }
            appendOnlyLinkedArrayList.forEachWhile(this);
        }
    }

    @Override // io.reactivex.subjects.Subject
    public Throwable getThrowable() {
        return this.f4123a.getThrowable();
    }

    @Override // io.reactivex.subjects.Subject
    public boolean hasComplete() {
        return this.f4123a.hasComplete();
    }

    @Override // io.reactivex.subjects.Subject
    public boolean hasObservers() {
        return this.f4123a.hasObservers();
    }

    @Override // io.reactivex.subjects.Subject
    public boolean hasThrowable() {
        return this.f4123a.hasThrowable();
    }

    @Override // io.reactivex.Observer
    public void onComplete() {
        if (this.f4126d) {
            return;
        }
        synchronized (this) {
            try {
                if (this.f4126d) {
                    return;
                }
                this.f4126d = true;
                if (this.f4124b) {
                    AppendOnlyLinkedArrayList appendOnlyLinkedArrayList = this.f4125c;
                    if (appendOnlyLinkedArrayList == null) {
                        appendOnlyLinkedArrayList = new AppendOnlyLinkedArrayList(4);
                        this.f4125c = appendOnlyLinkedArrayList;
                    }
                    appendOnlyLinkedArrayList.add(NotificationLite.complete());
                    return;
                }
                this.f4124b = true;
                this.f4123a.onComplete();
            } catch (Throwable th2) {
                throw th2;
            }
        }
    }

    @Override // io.reactivex.Observer
    public void onError(Throwable th2) {
        if (this.f4126d) {
            RxJavaPlugins.onError(th2);
            return;
        }
        synchronized (this) {
            try {
                boolean z = true;
                if (!this.f4126d) {
                    this.f4126d = true;
                    if (this.f4124b) {
                        AppendOnlyLinkedArrayList appendOnlyLinkedArrayList = this.f4125c;
                        if (appendOnlyLinkedArrayList == null) {
                            appendOnlyLinkedArrayList = new AppendOnlyLinkedArrayList(4);
                            this.f4125c = appendOnlyLinkedArrayList;
                        }
                        appendOnlyLinkedArrayList.setFirst(NotificationLite.error(th2));
                        return;
                    }
                    this.f4124b = true;
                    z = false;
                }
                if (z) {
                    RxJavaPlugins.onError(th2);
                } else {
                    this.f4123a.onError(th2);
                }
            } catch (Throwable th3) {
                throw th3;
            }
        }
    }

    @Override // io.reactivex.Observer
    public void onNext(Object obj) {
        if (this.f4126d) {
            return;
        }
        synchronized (this) {
            try {
                if (this.f4126d) {
                    return;
                }
                if (this.f4124b) {
                    AppendOnlyLinkedArrayList appendOnlyLinkedArrayList = this.f4125c;
                    if (appendOnlyLinkedArrayList == null) {
                        appendOnlyLinkedArrayList = new AppendOnlyLinkedArrayList(4);
                        this.f4125c = appendOnlyLinkedArrayList;
                    }
                    appendOnlyLinkedArrayList.add(NotificationLite.next(obj));
                    return;
                }
                this.f4124b = true;
                this.f4123a.onNext(obj);
                m67262d();
            } catch (Throwable th2) {
                throw th2;
            }
        }
    }

    @Override // io.reactivex.Observer
    public void onSubscribe(Disposable disposable) {
        boolean z = true;
        if (!this.f4126d) {
            synchronized (this) {
                try {
                    if (!this.f4126d) {
                        if (this.f4124b) {
                            AppendOnlyLinkedArrayList appendOnlyLinkedArrayList = this.f4125c;
                            if (appendOnlyLinkedArrayList == null) {
                                appendOnlyLinkedArrayList = new AppendOnlyLinkedArrayList(4);
                                this.f4125c = appendOnlyLinkedArrayList;
                            }
                            appendOnlyLinkedArrayList.add(NotificationLite.disposable(disposable));
                            return;
                        }
                        this.f4124b = true;
                        z = false;
                    }
                } finally {
                }
            }
        }
        if (z) {
            disposable.dispose();
            return;
        }
        this.f4123a.onSubscribe(disposable);
        m67262d();
    }

    @Override // io.reactivex.Observable
    public void subscribeActual(Observer observer) {
        this.f4123a.subscribe(observer);
    }

    @Override // io.reactivex.internal.util.AppendOnlyLinkedArrayList.NonThrowingPredicate, io.reactivex.functions.Predicate
    public boolean test(Object obj) {
        return NotificationLite.acceptFull(obj, this.f4123a);
    }
}
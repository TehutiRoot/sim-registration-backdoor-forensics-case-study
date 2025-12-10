package p000;

import io.reactivex.Observer;
import io.reactivex.disposables.Disposable;
import io.reactivex.internal.util.AppendOnlyLinkedArrayList;
import io.reactivex.internal.util.NotificationLite;
import io.reactivex.plugins.RxJavaPlugins;
import io.reactivex.subjects.Subject;

/* renamed from: QF1 */
/* loaded from: classes5.dex */
public final class QF1 extends Subject implements AppendOnlyLinkedArrayList.NonThrowingPredicate {

    /* renamed from: a */
    public final Subject f5014a;

    /* renamed from: b */
    public boolean f5015b;

    /* renamed from: c */
    public AppendOnlyLinkedArrayList f5016c;

    /* renamed from: d */
    public volatile boolean f5017d;

    public QF1(Subject subject) {
        this.f5014a = subject;
    }

    /* renamed from: d */
    public void m66628d() {
        AppendOnlyLinkedArrayList appendOnlyLinkedArrayList;
        while (true) {
            synchronized (this) {
                try {
                    appendOnlyLinkedArrayList = this.f5016c;
                    if (appendOnlyLinkedArrayList == null) {
                        this.f5015b = false;
                        return;
                    }
                    this.f5016c = null;
                } catch (Throwable th2) {
                    throw th2;
                }
            }
            appendOnlyLinkedArrayList.forEachWhile(this);
        }
    }

    @Override // io.reactivex.subjects.Subject
    public Throwable getThrowable() {
        return this.f5014a.getThrowable();
    }

    @Override // io.reactivex.subjects.Subject
    public boolean hasComplete() {
        return this.f5014a.hasComplete();
    }

    @Override // io.reactivex.subjects.Subject
    public boolean hasObservers() {
        return this.f5014a.hasObservers();
    }

    @Override // io.reactivex.subjects.Subject
    public boolean hasThrowable() {
        return this.f5014a.hasThrowable();
    }

    @Override // io.reactivex.Observer
    public void onComplete() {
        if (this.f5017d) {
            return;
        }
        synchronized (this) {
            try {
                if (this.f5017d) {
                    return;
                }
                this.f5017d = true;
                if (this.f5015b) {
                    AppendOnlyLinkedArrayList appendOnlyLinkedArrayList = this.f5016c;
                    if (appendOnlyLinkedArrayList == null) {
                        appendOnlyLinkedArrayList = new AppendOnlyLinkedArrayList(4);
                        this.f5016c = appendOnlyLinkedArrayList;
                    }
                    appendOnlyLinkedArrayList.add(NotificationLite.complete());
                    return;
                }
                this.f5015b = true;
                this.f5014a.onComplete();
            } catch (Throwable th2) {
                throw th2;
            }
        }
    }

    @Override // io.reactivex.Observer
    public void onError(Throwable th2) {
        if (this.f5017d) {
            RxJavaPlugins.onError(th2);
            return;
        }
        synchronized (this) {
            try {
                boolean z = true;
                if (!this.f5017d) {
                    this.f5017d = true;
                    if (this.f5015b) {
                        AppendOnlyLinkedArrayList appendOnlyLinkedArrayList = this.f5016c;
                        if (appendOnlyLinkedArrayList == null) {
                            appendOnlyLinkedArrayList = new AppendOnlyLinkedArrayList(4);
                            this.f5016c = appendOnlyLinkedArrayList;
                        }
                        appendOnlyLinkedArrayList.setFirst(NotificationLite.error(th2));
                        return;
                    }
                    this.f5015b = true;
                    z = false;
                }
                if (z) {
                    RxJavaPlugins.onError(th2);
                } else {
                    this.f5014a.onError(th2);
                }
            } catch (Throwable th3) {
                throw th3;
            }
        }
    }

    @Override // io.reactivex.Observer
    public void onNext(Object obj) {
        if (this.f5017d) {
            return;
        }
        synchronized (this) {
            try {
                if (this.f5017d) {
                    return;
                }
                if (this.f5015b) {
                    AppendOnlyLinkedArrayList appendOnlyLinkedArrayList = this.f5016c;
                    if (appendOnlyLinkedArrayList == null) {
                        appendOnlyLinkedArrayList = new AppendOnlyLinkedArrayList(4);
                        this.f5016c = appendOnlyLinkedArrayList;
                    }
                    appendOnlyLinkedArrayList.add(NotificationLite.next(obj));
                    return;
                }
                this.f5015b = true;
                this.f5014a.onNext(obj);
                m66628d();
            } catch (Throwable th2) {
                throw th2;
            }
        }
    }

    @Override // io.reactivex.Observer
    public void onSubscribe(Disposable disposable) {
        boolean z = true;
        if (!this.f5017d) {
            synchronized (this) {
                try {
                    if (!this.f5017d) {
                        if (this.f5015b) {
                            AppendOnlyLinkedArrayList appendOnlyLinkedArrayList = this.f5016c;
                            if (appendOnlyLinkedArrayList == null) {
                                appendOnlyLinkedArrayList = new AppendOnlyLinkedArrayList(4);
                                this.f5016c = appendOnlyLinkedArrayList;
                            }
                            appendOnlyLinkedArrayList.add(NotificationLite.disposable(disposable));
                            return;
                        }
                        this.f5015b = true;
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
        this.f5014a.onSubscribe(disposable);
        m66628d();
    }

    @Override // io.reactivex.Observable
    public void subscribeActual(Observer observer) {
        this.f5014a.subscribe(observer);
    }

    @Override // io.reactivex.internal.util.AppendOnlyLinkedArrayList.NonThrowingPredicate, io.reactivex.functions.Predicate
    public boolean test(Object obj) {
        return NotificationLite.acceptFull(obj, this.f5014a);
    }
}

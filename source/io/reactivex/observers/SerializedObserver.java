package io.reactivex.observers;

import io.reactivex.Observer;
import io.reactivex.annotations.NonNull;
import io.reactivex.disposables.Disposable;
import io.reactivex.internal.disposables.DisposableHelper;
import io.reactivex.internal.util.AppendOnlyLinkedArrayList;
import io.reactivex.internal.util.NotificationLite;
import io.reactivex.plugins.RxJavaPlugins;

/* loaded from: classes5.dex */
public final class SerializedObserver<T> implements Observer<T>, Disposable {

    /* renamed from: a */
    public final Observer f66149a;

    /* renamed from: b */
    public final boolean f66150b;

    /* renamed from: c */
    public Disposable f66151c;

    /* renamed from: d */
    public boolean f66152d;

    /* renamed from: e */
    public AppendOnlyLinkedArrayList f66153e;

    /* renamed from: f */
    public volatile boolean f66154f;

    public SerializedObserver(@NonNull Observer<? super T> observer) {
        this(observer, false);
    }

    /* renamed from: a */
    public void m29878a() {
        AppendOnlyLinkedArrayList appendOnlyLinkedArrayList;
        do {
            synchronized (this) {
                try {
                    appendOnlyLinkedArrayList = this.f66153e;
                    if (appendOnlyLinkedArrayList == null) {
                        this.f66152d = false;
                        return;
                    }
                    this.f66153e = null;
                } catch (Throwable th2) {
                    throw th2;
                }
            }
        } while (!appendOnlyLinkedArrayList.accept(this.f66149a));
    }

    @Override // io.reactivex.disposables.Disposable
    public void dispose() {
        this.f66151c.dispose();
    }

    @Override // io.reactivex.disposables.Disposable
    public boolean isDisposed() {
        return this.f66151c.isDisposed();
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // io.reactivex.Observer
    public void onComplete() {
        if (this.f66154f) {
            return;
        }
        synchronized (this) {
            try {
                if (this.f66154f) {
                    return;
                }
                if (this.f66152d) {
                    AppendOnlyLinkedArrayList appendOnlyLinkedArrayList = this.f66153e;
                    AppendOnlyLinkedArrayList appendOnlyLinkedArrayList2 = appendOnlyLinkedArrayList;
                    if (appendOnlyLinkedArrayList == null) {
                        AppendOnlyLinkedArrayList appendOnlyLinkedArrayList3 = new AppendOnlyLinkedArrayList(4);
                        this.f66153e = appendOnlyLinkedArrayList3;
                        appendOnlyLinkedArrayList2 = appendOnlyLinkedArrayList3;
                    }
                    appendOnlyLinkedArrayList2.add(NotificationLite.complete());
                    return;
                }
                this.f66154f = true;
                this.f66152d = true;
                this.f66149a.onComplete();
            } catch (Throwable th2) {
                throw th2;
            }
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // io.reactivex.Observer
    public void onError(@NonNull Throwable th2) {
        if (this.f66154f) {
            RxJavaPlugins.onError(th2);
            return;
        }
        synchronized (this) {
            try {
                boolean z = true;
                if (!this.f66154f) {
                    if (this.f66152d) {
                        this.f66154f = true;
                        AppendOnlyLinkedArrayList appendOnlyLinkedArrayList = this.f66153e;
                        AppendOnlyLinkedArrayList appendOnlyLinkedArrayList2 = appendOnlyLinkedArrayList;
                        if (appendOnlyLinkedArrayList == null) {
                            AppendOnlyLinkedArrayList appendOnlyLinkedArrayList3 = new AppendOnlyLinkedArrayList(4);
                            this.f66153e = appendOnlyLinkedArrayList3;
                            appendOnlyLinkedArrayList2 = appendOnlyLinkedArrayList3;
                        }
                        Object error = NotificationLite.error(th2);
                        if (this.f66150b) {
                            appendOnlyLinkedArrayList2.add(error);
                        } else {
                            appendOnlyLinkedArrayList2.setFirst(error);
                        }
                        return;
                    }
                    this.f66154f = true;
                    this.f66152d = true;
                    z = false;
                }
                if (z) {
                    RxJavaPlugins.onError(th2);
                } else {
                    this.f66149a.onError(th2);
                }
            } catch (Throwable th3) {
                throw th3;
            }
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // io.reactivex.Observer
    public void onNext(@NonNull T t) {
        if (this.f66154f) {
            return;
        }
        if (t == null) {
            this.f66151c.dispose();
            onError(new NullPointerException("onNext called with null. Null values are generally not allowed in 2.x operators and sources."));
            return;
        }
        synchronized (this) {
            try {
                if (this.f66154f) {
                    return;
                }
                if (this.f66152d) {
                    AppendOnlyLinkedArrayList appendOnlyLinkedArrayList = this.f66153e;
                    AppendOnlyLinkedArrayList appendOnlyLinkedArrayList2 = appendOnlyLinkedArrayList;
                    if (appendOnlyLinkedArrayList == null) {
                        AppendOnlyLinkedArrayList appendOnlyLinkedArrayList3 = new AppendOnlyLinkedArrayList(4);
                        this.f66153e = appendOnlyLinkedArrayList3;
                        appendOnlyLinkedArrayList2 = appendOnlyLinkedArrayList3;
                    }
                    appendOnlyLinkedArrayList2.add(NotificationLite.next(t));
                    return;
                }
                this.f66152d = true;
                this.f66149a.onNext(t);
                m29878a();
            } catch (Throwable th2) {
                throw th2;
            }
        }
    }

    @Override // io.reactivex.Observer
    public void onSubscribe(@NonNull Disposable disposable) {
        if (DisposableHelper.validate(this.f66151c, disposable)) {
            this.f66151c = disposable;
            this.f66149a.onSubscribe(this);
        }
    }

    public SerializedObserver(@NonNull Observer<? super T> observer, boolean z) {
        this.f66149a = observer;
        this.f66150b = z;
    }
}

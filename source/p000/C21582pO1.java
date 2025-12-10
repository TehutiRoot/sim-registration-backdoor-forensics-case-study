package p000;

import io.reactivex.Observer;
import io.reactivex.disposables.Disposable;
import io.reactivex.plugins.RxJavaPlugins;
import io.reactivex.subjects.Subject;
import p000.C19679eK0;

/* renamed from: pO1  reason: case insensitive filesystem */
/* loaded from: classes5.dex */
public final class C21582pO1 extends Subject {

    /* renamed from: a */
    public final p046rx.subjects.Subject f76581a;

    /* renamed from: b */
    public volatile boolean f76582b;

    /* renamed from: c */
    public Throwable f76583c;

    public C21582pO1(p046rx.subjects.Subject subject) {
        this.f76581a = subject;
    }

    @Override // io.reactivex.subjects.Subject
    public Throwable getThrowable() {
        if (this.f76582b) {
            return this.f76583c;
        }
        return null;
    }

    @Override // io.reactivex.subjects.Subject
    public boolean hasComplete() {
        if (this.f76582b && this.f76583c == null) {
            return true;
        }
        return false;
    }

    @Override // io.reactivex.subjects.Subject
    public boolean hasObservers() {
        return this.f76581a.hasObservers();
    }

    @Override // io.reactivex.subjects.Subject
    public boolean hasThrowable() {
        if (this.f76582b && this.f76583c != null) {
            return true;
        }
        return false;
    }

    @Override // io.reactivex.Observer
    public void onComplete() {
        if (!this.f76582b) {
            this.f76582b = true;
            this.f76581a.onCompleted();
        }
    }

    @Override // io.reactivex.Observer
    public void onError(Throwable th2) {
        if (!this.f76582b) {
            if (th2 == null) {
                th2 = new NullPointerException("Throwable was null");
            }
            this.f76583c = th2;
            this.f76582b = true;
            this.f76581a.onError(th2);
            return;
        }
        RxJavaPlugins.onError(th2);
    }

    @Override // io.reactivex.Observer
    public void onNext(Object obj) {
        if (!this.f76582b) {
            if (obj == null) {
                onError(new NullPointerException());
            } else {
                this.f76581a.onNext(obj);
            }
        }
    }

    @Override // io.reactivex.Observer
    public void onSubscribe(Disposable disposable) {
        if (this.f76582b) {
            disposable.dispose();
        }
    }

    @Override // io.reactivex.Observable
    public void subscribeActual(Observer observer) {
        C19679eK0.C10142a c10142a = new C19679eK0.C10142a(observer);
        observer.onSubscribe(c10142a);
        this.f76581a.unsafeSubscribe(c10142a);
    }
}

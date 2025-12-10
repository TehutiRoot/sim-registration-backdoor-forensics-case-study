package p046rx.observers;

import p046rx.Observer;
import p046rx.exceptions.OnErrorNotImplementedException;
import p046rx.functions.Action0;
import p046rx.functions.Action1;

/* renamed from: rx.observers.Observers */
/* loaded from: classes7.dex */
public final class Observers {

    /* renamed from: a */
    public static final Observer f79564a = new C13827a();

    /* renamed from: rx.observers.Observers$a */
    /* loaded from: classes7.dex */
    public static class C13827a implements Observer {
        @Override // p046rx.Observer
        public final void onCompleted() {
        }

        @Override // p046rx.Observer
        public final void onError(Throwable th2) {
            throw new OnErrorNotImplementedException(th2);
        }

        @Override // p046rx.Observer
        public final void onNext(Object obj) {
        }
    }

    /* renamed from: rx.observers.Observers$b */
    /* loaded from: classes7.dex */
    public static class C13828b implements Observer {

        /* renamed from: a */
        public final /* synthetic */ Action1 f79565a;

        public C13828b(Action1 action1) {
            this.f79565a = action1;
        }

        @Override // p046rx.Observer
        public final void onCompleted() {
        }

        @Override // p046rx.Observer
        public final void onError(Throwable th2) {
            throw new OnErrorNotImplementedException(th2);
        }

        @Override // p046rx.Observer
        public final void onNext(Object obj) {
            this.f79565a.call(obj);
        }
    }

    /* renamed from: rx.observers.Observers$c */
    /* loaded from: classes7.dex */
    public static class C13829c implements Observer {

        /* renamed from: a */
        public final /* synthetic */ Action1 f79566a;

        /* renamed from: b */
        public final /* synthetic */ Action1 f79567b;

        public C13829c(Action1 action1, Action1 action12) {
            this.f79566a = action1;
            this.f79567b = action12;
        }

        @Override // p046rx.Observer
        public final void onCompleted() {
        }

        @Override // p046rx.Observer
        public final void onError(Throwable th2) {
            this.f79566a.call(th2);
        }

        @Override // p046rx.Observer
        public final void onNext(Object obj) {
            this.f79567b.call(obj);
        }
    }

    /* renamed from: rx.observers.Observers$d */
    /* loaded from: classes7.dex */
    public static class C13830d implements Observer {

        /* renamed from: a */
        public final /* synthetic */ Action0 f79568a;

        /* renamed from: b */
        public final /* synthetic */ Action1 f79569b;

        /* renamed from: c */
        public final /* synthetic */ Action1 f79570c;

        public C13830d(Action0 action0, Action1 action1, Action1 action12) {
            this.f79568a = action0;
            this.f79569b = action1;
            this.f79570c = action12;
        }

        @Override // p046rx.Observer
        public final void onCompleted() {
            this.f79568a.call();
        }

        @Override // p046rx.Observer
        public final void onError(Throwable th2) {
            this.f79569b.call(th2);
        }

        @Override // p046rx.Observer
        public final void onNext(Object obj) {
            this.f79570c.call(obj);
        }
    }

    public static <T> Observer<T> create(Action1<? super T> action1) {
        if (action1 != null) {
            return new C13828b(action1);
        }
        throw new IllegalArgumentException("onNext can not be null");
    }

    public static <T> Observer<T> empty() {
        return f79564a;
    }

    public static <T> Observer<T> create(Action1<? super T> action1, Action1<Throwable> action12) {
        if (action1 != null) {
            if (action12 != null) {
                return new C13829c(action12, action1);
            }
            throw new IllegalArgumentException("onError can not be null");
        }
        throw new IllegalArgumentException("onNext can not be null");
    }

    public static <T> Observer<T> create(Action1<? super T> action1, Action1<Throwable> action12, Action0 action0) {
        if (action1 != null) {
            if (action12 != null) {
                if (action0 != null) {
                    return new C13830d(action0, action12, action1);
                }
                throw new IllegalArgumentException("onComplete can not be null");
            }
            throw new IllegalArgumentException("onError can not be null");
        }
        throw new IllegalArgumentException("onNext can not be null");
    }
}
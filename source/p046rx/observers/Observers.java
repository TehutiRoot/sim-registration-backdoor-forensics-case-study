package p046rx.observers;

import p046rx.Observer;
import p046rx.exceptions.OnErrorNotImplementedException;
import p046rx.functions.Action0;
import p046rx.functions.Action1;

/* renamed from: rx.observers.Observers */
/* loaded from: classes7.dex */
public final class Observers {

    /* renamed from: a */
    public static final Observer f79358a = new C13826a();

    /* renamed from: rx.observers.Observers$a */
    /* loaded from: classes7.dex */
    public static class C13826a implements Observer {
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
    public static class C13827b implements Observer {

        /* renamed from: a */
        public final /* synthetic */ Action1 f79359a;

        public C13827b(Action1 action1) {
            this.f79359a = action1;
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
            this.f79359a.call(obj);
        }
    }

    /* renamed from: rx.observers.Observers$c */
    /* loaded from: classes7.dex */
    public static class C13828c implements Observer {

        /* renamed from: a */
        public final /* synthetic */ Action1 f79360a;

        /* renamed from: b */
        public final /* synthetic */ Action1 f79361b;

        public C13828c(Action1 action1, Action1 action12) {
            this.f79360a = action1;
            this.f79361b = action12;
        }

        @Override // p046rx.Observer
        public final void onCompleted() {
        }

        @Override // p046rx.Observer
        public final void onError(Throwable th2) {
            this.f79360a.call(th2);
        }

        @Override // p046rx.Observer
        public final void onNext(Object obj) {
            this.f79361b.call(obj);
        }
    }

    /* renamed from: rx.observers.Observers$d */
    /* loaded from: classes7.dex */
    public static class C13829d implements Observer {

        /* renamed from: a */
        public final /* synthetic */ Action0 f79362a;

        /* renamed from: b */
        public final /* synthetic */ Action1 f79363b;

        /* renamed from: c */
        public final /* synthetic */ Action1 f79364c;

        public C13829d(Action0 action0, Action1 action1, Action1 action12) {
            this.f79362a = action0;
            this.f79363b = action1;
            this.f79364c = action12;
        }

        @Override // p046rx.Observer
        public final void onCompleted() {
            this.f79362a.call();
        }

        @Override // p046rx.Observer
        public final void onError(Throwable th2) {
            this.f79363b.call(th2);
        }

        @Override // p046rx.Observer
        public final void onNext(Object obj) {
            this.f79364c.call(obj);
        }
    }

    public static <T> Observer<T> create(Action1<? super T> action1) {
        if (action1 != null) {
            return new C13827b(action1);
        }
        throw new IllegalArgumentException("onNext can not be null");
    }

    public static <T> Observer<T> empty() {
        return f79358a;
    }

    public static <T> Observer<T> create(Action1<? super T> action1, Action1<Throwable> action12) {
        if (action1 != null) {
            if (action12 != null) {
                return new C13828c(action12, action1);
            }
            throw new IllegalArgumentException("onError can not be null");
        }
        throw new IllegalArgumentException("onNext can not be null");
    }

    public static <T> Observer<T> create(Action1<? super T> action1, Action1<Throwable> action12, Action0 action0) {
        if (action1 != null) {
            if (action12 != null) {
                if (action0 != null) {
                    return new C13829d(action0, action12, action1);
                }
                throw new IllegalArgumentException("onComplete can not be null");
            }
            throw new IllegalArgumentException("onError can not be null");
        }
        throw new IllegalArgumentException("onNext can not be null");
    }
}

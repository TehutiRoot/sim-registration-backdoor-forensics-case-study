package p046rx.observers;

import p046rx.Observer;
import p046rx.Subscriber;
import p046rx.exceptions.OnErrorNotImplementedException;
import p046rx.functions.Action0;
import p046rx.functions.Action1;

/* renamed from: rx.observers.Subscribers */
/* loaded from: classes7.dex */
public final class Subscribers {

    /* renamed from: rx.observers.Subscribers$a */
    /* loaded from: classes7.dex */
    public static class C13831a extends Subscriber {

        /* renamed from: a */
        public final /* synthetic */ Observer f79377a;

        public C13831a(Observer observer) {
            this.f79377a = observer;
        }

        @Override // p046rx.Observer
        public void onCompleted() {
            this.f79377a.onCompleted();
        }

        @Override // p046rx.Observer
        public void onError(Throwable th2) {
            this.f79377a.onError(th2);
        }

        @Override // p046rx.Observer
        public void onNext(Object obj) {
            this.f79377a.onNext(obj);
        }
    }

    /* renamed from: rx.observers.Subscribers$b */
    /* loaded from: classes7.dex */
    public static class C13832b extends Subscriber {

        /* renamed from: a */
        public final /* synthetic */ Action1 f79378a;

        public C13832b(Action1 action1) {
            this.f79378a = action1;
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
            this.f79378a.call(obj);
        }
    }

    /* renamed from: rx.observers.Subscribers$c */
    /* loaded from: classes7.dex */
    public static class C13833c extends Subscriber {

        /* renamed from: a */
        public final /* synthetic */ Action1 f79379a;

        /* renamed from: b */
        public final /* synthetic */ Action1 f79380b;

        public C13833c(Action1 action1, Action1 action12) {
            this.f79379a = action1;
            this.f79380b = action12;
        }

        @Override // p046rx.Observer
        public final void onCompleted() {
        }

        @Override // p046rx.Observer
        public final void onError(Throwable th2) {
            this.f79379a.call(th2);
        }

        @Override // p046rx.Observer
        public final void onNext(Object obj) {
            this.f79380b.call(obj);
        }
    }

    /* renamed from: rx.observers.Subscribers$d */
    /* loaded from: classes7.dex */
    public static class C13834d extends Subscriber {

        /* renamed from: a */
        public final /* synthetic */ Action0 f79381a;

        /* renamed from: b */
        public final /* synthetic */ Action1 f79382b;

        /* renamed from: c */
        public final /* synthetic */ Action1 f79383c;

        public C13834d(Action0 action0, Action1 action1, Action1 action12) {
            this.f79381a = action0;
            this.f79382b = action1;
            this.f79383c = action12;
        }

        @Override // p046rx.Observer
        public final void onCompleted() {
            this.f79381a.call();
        }

        @Override // p046rx.Observer
        public final void onError(Throwable th2) {
            this.f79382b.call(th2);
        }

        @Override // p046rx.Observer
        public final void onNext(Object obj) {
            this.f79383c.call(obj);
        }
    }

    /* renamed from: rx.observers.Subscribers$e */
    /* loaded from: classes7.dex */
    public static class C13835e extends Subscriber {

        /* renamed from: a */
        public final /* synthetic */ Subscriber f79384a;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public C13835e(Subscriber subscriber, Subscriber subscriber2) {
            super(subscriber);
            this.f79384a = subscriber2;
        }

        @Override // p046rx.Observer
        public void onCompleted() {
            this.f79384a.onCompleted();
        }

        @Override // p046rx.Observer
        public void onError(Throwable th2) {
            this.f79384a.onError(th2);
        }

        @Override // p046rx.Observer
        public void onNext(Object obj) {
            this.f79384a.onNext(obj);
        }
    }

    public static <T> Subscriber<T> create(Action1<? super T> action1) {
        if (action1 != null) {
            return new C13832b(action1);
        }
        throw new IllegalArgumentException("onNext can not be null");
    }

    public static <T> Subscriber<T> empty() {
        return from(Observers.empty());
    }

    public static <T> Subscriber<T> from(Observer<? super T> observer) {
        return new C13831a(observer);
    }

    public static <T> Subscriber<T> wrap(Subscriber<? super T> subscriber) {
        return new C13835e(subscriber, subscriber);
    }

    public static <T> Subscriber<T> create(Action1<? super T> action1, Action1<Throwable> action12) {
        if (action1 != null) {
            if (action12 != null) {
                return new C13833c(action12, action1);
            }
            throw new IllegalArgumentException("onError can not be null");
        }
        throw new IllegalArgumentException("onNext can not be null");
    }

    public static <T> Subscriber<T> create(Action1<? super T> action1, Action1<Throwable> action12, Action0 action0) {
        if (action1 != null) {
            if (action12 != null) {
                if (action0 != null) {
                    return new C13834d(action0, action12, action1);
                }
                throw new IllegalArgumentException("onComplete can not be null");
            }
            throw new IllegalArgumentException("onError can not be null");
        }
        throw new IllegalArgumentException("onNext can not be null");
    }
}

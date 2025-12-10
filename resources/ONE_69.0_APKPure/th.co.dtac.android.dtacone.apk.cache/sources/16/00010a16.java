package p046rx.internal.operators;

import java.util.Arrays;
import p046rx.Observable;
import p046rx.Observer;
import p046rx.Subscriber;
import p046rx.exceptions.CompositeException;
import p046rx.exceptions.Exceptions;
import p046rx.plugins.RxJavaHooks;

/* renamed from: rx.internal.operators.OnSubscribeDoOnEach */
/* loaded from: classes7.dex */
public class OnSubscribeDoOnEach<T> implements Observable.OnSubscribe<T> {

    /* renamed from: a */
    public final Observer f78138a;

    /* renamed from: b */
    public final Observable f78139b;

    /* renamed from: rx.internal.operators.OnSubscribeDoOnEach$a */
    /* loaded from: classes7.dex */
    public static final class C13474a extends Subscriber {

        /* renamed from: a */
        public final Subscriber f78140a;

        /* renamed from: b */
        public final Observer f78141b;

        /* renamed from: c */
        public boolean f78142c;

        public C13474a(Subscriber subscriber, Observer observer) {
            super(subscriber);
            this.f78140a = subscriber;
            this.f78141b = observer;
        }

        @Override // p046rx.Observer
        public void onCompleted() {
            if (this.f78142c) {
                return;
            }
            try {
                this.f78141b.onCompleted();
                this.f78142c = true;
                this.f78140a.onCompleted();
            } catch (Throwable th2) {
                Exceptions.throwOrReport(th2, this);
            }
        }

        @Override // p046rx.Observer
        public void onError(Throwable th2) {
            if (this.f78142c) {
                RxJavaHooks.onError(th2);
                return;
            }
            this.f78142c = true;
            try {
                this.f78141b.onError(th2);
                this.f78140a.onError(th2);
            } catch (Throwable th3) {
                Exceptions.throwIfFatal(th3);
                this.f78140a.onError(new CompositeException(Arrays.asList(th2, th3)));
            }
        }

        @Override // p046rx.Observer
        public void onNext(Object obj) {
            if (this.f78142c) {
                return;
            }
            try {
                this.f78141b.onNext(obj);
                this.f78140a.onNext(obj);
            } catch (Throwable th2) {
                Exceptions.throwOrReport(th2, this, obj);
            }
        }
    }

    public OnSubscribeDoOnEach(Observable<T> observable, Observer<? super T> observer) {
        this.f78139b = observable;
        this.f78138a = observer;
    }

    @Override // p046rx.functions.Action1
    public /* bridge */ /* synthetic */ void call(Object obj) {
        call((Subscriber) ((Subscriber) obj));
    }

    public void call(Subscriber<? super T> subscriber) {
        this.f78139b.unsafeSubscribe(new C13474a(subscriber, this.f78138a));
    }
}
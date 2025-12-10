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
    public final Observer f77932a;

    /* renamed from: b */
    public final Observable f77933b;

    /* renamed from: rx.internal.operators.OnSubscribeDoOnEach$a */
    /* loaded from: classes7.dex */
    public static final class C13473a extends Subscriber {

        /* renamed from: a */
        public final Subscriber f77934a;

        /* renamed from: b */
        public final Observer f77935b;

        /* renamed from: c */
        public boolean f77936c;

        public C13473a(Subscriber subscriber, Observer observer) {
            super(subscriber);
            this.f77934a = subscriber;
            this.f77935b = observer;
        }

        @Override // p046rx.Observer
        public void onCompleted() {
            if (this.f77936c) {
                return;
            }
            try {
                this.f77935b.onCompleted();
                this.f77936c = true;
                this.f77934a.onCompleted();
            } catch (Throwable th2) {
                Exceptions.throwOrReport(th2, this);
            }
        }

        @Override // p046rx.Observer
        public void onError(Throwable th2) {
            if (this.f77936c) {
                RxJavaHooks.onError(th2);
                return;
            }
            this.f77936c = true;
            try {
                this.f77935b.onError(th2);
                this.f77934a.onError(th2);
            } catch (Throwable th3) {
                Exceptions.throwIfFatal(th3);
                this.f77934a.onError(new CompositeException(Arrays.asList(th2, th3)));
            }
        }

        @Override // p046rx.Observer
        public void onNext(Object obj) {
            if (this.f77936c) {
                return;
            }
            try {
                this.f77935b.onNext(obj);
                this.f77934a.onNext(obj);
            } catch (Throwable th2) {
                Exceptions.throwOrReport(th2, this, obj);
            }
        }
    }

    public OnSubscribeDoOnEach(Observable<T> observable, Observer<? super T> observer) {
        this.f77933b = observable;
        this.f77932a = observer;
    }

    @Override // p046rx.functions.Action1
    public /* bridge */ /* synthetic */ void call(Object obj) {
        call((Subscriber) ((Subscriber) obj));
    }

    public void call(Subscriber<? super T> subscriber) {
        this.f77933b.unsafeSubscribe(new C13473a(subscriber, this.f77932a));
    }
}

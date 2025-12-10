package p046rx.internal.operators;

import p046rx.Observable;
import p046rx.Subscriber;
import p046rx.exceptions.Exceptions;
import p046rx.functions.Action0;
import p046rx.plugins.RxJavaHooks;

/* renamed from: rx.internal.operators.OperatorDoAfterTerminate */
/* loaded from: classes7.dex */
public final class OperatorDoAfterTerminate<T> implements Observable.Operator<T, T> {

    /* renamed from: a */
    public final Action0 f78544a;

    /* renamed from: rx.internal.operators.OperatorDoAfterTerminate$a */
    /* loaded from: classes7.dex */
    public class C13564a extends Subscriber {

        /* renamed from: a */
        public final /* synthetic */ Subscriber f78545a;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public C13564a(Subscriber subscriber, Subscriber subscriber2) {
            super(subscriber);
            this.f78545a = subscriber2;
        }

        /* renamed from: b */
        public void m23255b() {
            try {
                OperatorDoAfterTerminate.this.f78544a.call();
            } catch (Throwable th2) {
                Exceptions.throwIfFatal(th2);
                RxJavaHooks.onError(th2);
            }
        }

        @Override // p046rx.Observer
        public void onCompleted() {
            try {
                this.f78545a.onCompleted();
            } finally {
                m23255b();
            }
        }

        @Override // p046rx.Observer
        public void onError(Throwable th2) {
            try {
                this.f78545a.onError(th2);
            } finally {
                m23255b();
            }
        }

        @Override // p046rx.Observer
        public void onNext(Object obj) {
            this.f78545a.onNext(obj);
        }
    }

    public OperatorDoAfterTerminate(Action0 action0) {
        if (action0 != null) {
            this.f78544a = action0;
            return;
        }
        throw new NullPointerException("Action can not be null");
    }

    @Override // p046rx.functions.Func1
    public /* bridge */ /* synthetic */ Object call(Object obj) {
        return call((Subscriber) ((Subscriber) obj));
    }

    public Subscriber<? super T> call(Subscriber<? super T> subscriber) {
        return new C13564a(subscriber, subscriber);
    }
}
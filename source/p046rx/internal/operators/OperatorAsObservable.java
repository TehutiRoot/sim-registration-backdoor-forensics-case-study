package p046rx.internal.operators;

import p046rx.Observable;
import p046rx.Subscriber;

/* renamed from: rx.internal.operators.OperatorAsObservable */
/* loaded from: classes7.dex */
public final class OperatorAsObservable<T> implements Observable.Operator<T, T> {

    /* renamed from: rx.internal.operators.OperatorAsObservable$a */
    /* loaded from: classes7.dex */
    public static final class C13530a {

        /* renamed from: a */
        public static final OperatorAsObservable f78215a = new OperatorAsObservable();
    }

    public static <T> OperatorAsObservable<T> instance() {
        return C13530a.f78215a;
    }

    public Subscriber<? super T> call(Subscriber<? super T> subscriber) {
        return subscriber;
    }

    @Override // p046rx.functions.Func1
    public /* bridge */ /* synthetic */ Object call(Object obj) {
        return call((Subscriber) ((Subscriber) obj));
    }
}

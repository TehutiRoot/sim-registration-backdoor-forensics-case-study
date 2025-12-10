package p046rx.internal.operators;

import p046rx.Observable;
import p046rx.functions.Func2;
import p046rx.internal.util.UtilityFunctions;

/* renamed from: rx.internal.operators.OperatorSequenceEqual */
/* loaded from: classes7.dex */
public final class OperatorSequenceEqual {

    /* renamed from: a */
    public static final Object f78858a = new Object();

    /* renamed from: rx.internal.operators.OperatorSequenceEqual$a */
    /* loaded from: classes7.dex */
    public static class C13636a implements Func2 {

        /* renamed from: a */
        public final /* synthetic */ Func2 f78859a;

        public C13636a(Func2 func2) {
            this.f78859a = func2;
        }

        @Override // p046rx.functions.Func2
        /* renamed from: a */
        public Boolean call(Object obj, Object obj2) {
            boolean z;
            Object obj3 = OperatorSequenceEqual.f78858a;
            boolean z2 = false;
            if (obj == obj3) {
                z = true;
            } else {
                z = false;
            }
            if (obj2 == obj3) {
                z2 = true;
            }
            if (z && z2) {
                return Boolean.TRUE;
            }
            if (!z && !z2) {
                return (Boolean) this.f78859a.call(obj, obj2);
            }
            return Boolean.FALSE;
        }
    }

    /* renamed from: a */
    public static Observable m23180a(Observable observable) {
        return Observable.concat(observable, Observable.just(f78858a));
    }

    public static <T> Observable<Boolean> sequenceEqual(Observable<? extends T> observable, Observable<? extends T> observable2, Func2<? super T, ? super T, Boolean> func2) {
        return Observable.zip(m23180a(observable), m23180a(observable2), new C13636a(func2)).all(UtilityFunctions.identity());
    }
}
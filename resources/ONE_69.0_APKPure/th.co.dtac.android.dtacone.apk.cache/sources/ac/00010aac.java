package p046rx.internal.operators;

import java.util.HashSet;
import java.util.Set;
import p046rx.Observable;
import p046rx.Subscriber;
import p046rx.functions.Func1;
import p046rx.internal.util.UtilityFunctions;

/* renamed from: rx.internal.operators.OperatorDistinct */
/* loaded from: classes7.dex */
public final class OperatorDistinct<T, U> implements Observable.Operator<T, T> {

    /* renamed from: a */
    public final Func1 f78532a;

    /* renamed from: rx.internal.operators.OperatorDistinct$a */
    /* loaded from: classes7.dex */
    public class C13560a extends Subscriber {

        /* renamed from: a */
        public Set f78533a;

        /* renamed from: b */
        public final /* synthetic */ Subscriber f78534b;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public C13560a(Subscriber subscriber, Subscriber subscriber2) {
            super(subscriber);
            this.f78534b = subscriber2;
            this.f78533a = new HashSet();
        }

        @Override // p046rx.Observer
        public void onCompleted() {
            this.f78533a = null;
            this.f78534b.onCompleted();
        }

        @Override // p046rx.Observer
        public void onError(Throwable th2) {
            this.f78533a = null;
            this.f78534b.onError(th2);
        }

        @Override // p046rx.Observer
        public void onNext(Object obj) {
            if (this.f78533a.add(OperatorDistinct.this.f78532a.call(obj))) {
                this.f78534b.onNext(obj);
            } else {
                request(1L);
            }
        }
    }

    /* renamed from: rx.internal.operators.OperatorDistinct$b */
    /* loaded from: classes7.dex */
    public static final class C13561b {

        /* renamed from: a */
        public static final OperatorDistinct f78536a = new OperatorDistinct(UtilityFunctions.identity());
    }

    public OperatorDistinct(Func1<? super T, ? extends U> func1) {
        this.f78532a = func1;
    }

    public static <T> OperatorDistinct<T, T> instance() {
        return C13561b.f78536a;
    }

    @Override // p046rx.functions.Func1
    public /* bridge */ /* synthetic */ Object call(Object obj) {
        return call((Subscriber) ((Subscriber) obj));
    }

    public Subscriber<? super T> call(Subscriber<? super T> subscriber) {
        return new C13560a(subscriber, subscriber);
    }
}
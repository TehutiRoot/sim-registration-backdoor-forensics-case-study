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
    public final Func1 f78326a;

    /* renamed from: rx.internal.operators.OperatorDistinct$a */
    /* loaded from: classes7.dex */
    public class C13559a extends Subscriber {

        /* renamed from: a */
        public Set f78327a;

        /* renamed from: b */
        public final /* synthetic */ Subscriber f78328b;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public C13559a(Subscriber subscriber, Subscriber subscriber2) {
            super(subscriber);
            this.f78328b = subscriber2;
            this.f78327a = new HashSet();
        }

        @Override // p046rx.Observer
        public void onCompleted() {
            this.f78327a = null;
            this.f78328b.onCompleted();
        }

        @Override // p046rx.Observer
        public void onError(Throwable th2) {
            this.f78327a = null;
            this.f78328b.onError(th2);
        }

        @Override // p046rx.Observer
        public void onNext(Object obj) {
            if (this.f78327a.add(OperatorDistinct.this.f78326a.call(obj))) {
                this.f78328b.onNext(obj);
            } else {
                request(1L);
            }
        }
    }

    /* renamed from: rx.internal.operators.OperatorDistinct$b */
    /* loaded from: classes7.dex */
    public static final class C13560b {

        /* renamed from: a */
        public static final OperatorDistinct f78330a = new OperatorDistinct(UtilityFunctions.identity());
    }

    public OperatorDistinct(Func1<? super T, ? extends U> func1) {
        this.f78326a = func1;
    }

    public static <T> OperatorDistinct<T, T> instance() {
        return C13560b.f78330a;
    }

    @Override // p046rx.functions.Func1
    public /* bridge */ /* synthetic */ Object call(Object obj) {
        return call((Subscriber) ((Subscriber) obj));
    }

    public Subscriber<? super T> call(Subscriber<? super T> subscriber) {
        return new C13559a(subscriber, subscriber);
    }
}

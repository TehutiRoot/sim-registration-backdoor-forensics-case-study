package p046rx.internal.operators;

import p046rx.Single;
import p046rx.SingleSubscriber;
import p046rx.exceptions.CompositeException;
import p046rx.exceptions.Exceptions;
import p046rx.functions.Action1;

/* renamed from: rx.internal.operators.SingleDoOnEvent */
/* loaded from: classes7.dex */
public final class SingleDoOnEvent<T> implements Single.OnSubscribe<T> {

    /* renamed from: a */
    public final Single f78953a;

    /* renamed from: b */
    public final Action1 f78954b;

    /* renamed from: c */
    public final Action1 f78955c;

    /* renamed from: rx.internal.operators.SingleDoOnEvent$a */
    /* loaded from: classes7.dex */
    public static final class C13707a extends SingleSubscriber {

        /* renamed from: b */
        public final SingleSubscriber f78956b;

        /* renamed from: c */
        public final Action1 f78957c;

        /* renamed from: d */
        public final Action1 f78958d;

        public C13707a(SingleSubscriber singleSubscriber, Action1 action1, Action1 action12) {
            this.f78956b = singleSubscriber;
            this.f78957c = action1;
            this.f78958d = action12;
        }

        @Override // p046rx.SingleSubscriber
        public void onError(Throwable th2) {
            try {
                this.f78958d.call(th2);
                this.f78956b.onError(th2);
            } catch (Throwable th3) {
                Exceptions.throwIfFatal(th3);
                this.f78956b.onError(new CompositeException(th2, th3));
            }
        }

        @Override // p046rx.SingleSubscriber
        public void onSuccess(Object obj) {
            try {
                this.f78957c.call(obj);
                this.f78956b.onSuccess(obj);
            } catch (Throwable th2) {
                Exceptions.throwOrReport(th2, this, obj);
            }
        }
    }

    public SingleDoOnEvent(Single<T> single, Action1<? super T> action1, Action1<Throwable> action12) {
        this.f78953a = single;
        this.f78954b = action1;
        this.f78955c = action12;
    }

    @Override // p046rx.functions.Action1
    public /* bridge */ /* synthetic */ void call(Object obj) {
        call((SingleSubscriber) ((SingleSubscriber) obj));
    }

    public void call(SingleSubscriber<? super T> singleSubscriber) {
        C13707a c13707a = new C13707a(singleSubscriber, this.f78954b, this.f78955c);
        singleSubscriber.add(c13707a);
        this.f78953a.subscribe(c13707a);
    }
}

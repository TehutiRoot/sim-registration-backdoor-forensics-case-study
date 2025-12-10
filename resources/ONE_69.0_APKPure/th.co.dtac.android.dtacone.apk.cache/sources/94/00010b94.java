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
    public final Single f79159a;

    /* renamed from: b */
    public final Action1 f79160b;

    /* renamed from: c */
    public final Action1 f79161c;

    /* renamed from: rx.internal.operators.SingleDoOnEvent$a */
    /* loaded from: classes7.dex */
    public static final class C13708a extends SingleSubscriber {

        /* renamed from: b */
        public final SingleSubscriber f79162b;

        /* renamed from: c */
        public final Action1 f79163c;

        /* renamed from: d */
        public final Action1 f79164d;

        public C13708a(SingleSubscriber singleSubscriber, Action1 action1, Action1 action12) {
            this.f79162b = singleSubscriber;
            this.f79163c = action1;
            this.f79164d = action12;
        }

        @Override // p046rx.SingleSubscriber
        public void onError(Throwable th2) {
            try {
                this.f79164d.call(th2);
                this.f79162b.onError(th2);
            } catch (Throwable th3) {
                Exceptions.throwIfFatal(th3);
                this.f79162b.onError(new CompositeException(th2, th3));
            }
        }

        @Override // p046rx.SingleSubscriber
        public void onSuccess(Object obj) {
            try {
                this.f79163c.call(obj);
                this.f79162b.onSuccess(obj);
            } catch (Throwable th2) {
                Exceptions.throwOrReport(th2, this, obj);
            }
        }
    }

    public SingleDoOnEvent(Single<T> single, Action1<? super T> action1, Action1<Throwable> action12) {
        this.f79159a = single;
        this.f79160b = action1;
        this.f79161c = action12;
    }

    @Override // p046rx.functions.Action1
    public /* bridge */ /* synthetic */ void call(Object obj) {
        call((SingleSubscriber) ((SingleSubscriber) obj));
    }

    public void call(SingleSubscriber<? super T> singleSubscriber) {
        C13708a c13708a = new C13708a(singleSubscriber, this.f79160b, this.f79161c);
        singleSubscriber.add(c13708a);
        this.f79159a.subscribe(c13708a);
    }
}
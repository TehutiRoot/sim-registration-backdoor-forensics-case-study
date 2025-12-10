package p046rx.internal.operators;

import p046rx.Single;
import p046rx.SingleSubscriber;
import p046rx.exceptions.Exceptions;
import p046rx.functions.Func1;

/* renamed from: rx.internal.operators.SingleOperatorOnErrorResumeNext */
/* loaded from: classes7.dex */
public final class SingleOperatorOnErrorResumeNext<T> implements Single.OnSubscribe<T> {

    /* renamed from: a */
    public final Single f79006a;

    /* renamed from: b */
    public final Func1 f79007b;

    /* renamed from: rx.internal.operators.SingleOperatorOnErrorResumeNext$a */
    /* loaded from: classes7.dex */
    public static class C13716a implements Func1 {

        /* renamed from: a */
        public final /* synthetic */ Single f79008a;

        public C13716a(Single single) {
            this.f79008a = single;
        }

        @Override // p046rx.functions.Func1
        /* renamed from: a */
        public Single call(Throwable th2) {
            return this.f79008a;
        }
    }

    /* renamed from: rx.internal.operators.SingleOperatorOnErrorResumeNext$b */
    /* loaded from: classes7.dex */
    public class C13717b extends SingleSubscriber {

        /* renamed from: b */
        public final /* synthetic */ SingleSubscriber f79009b;

        public C13717b(SingleSubscriber singleSubscriber) {
            this.f79009b = singleSubscriber;
        }

        @Override // p046rx.SingleSubscriber
        public void onError(Throwable th2) {
            try {
                ((Single) SingleOperatorOnErrorResumeNext.this.f79007b.call(th2)).subscribe(this.f79009b);
            } catch (Throwable th3) {
                Exceptions.throwOrReport(th3, this.f79009b);
            }
        }

        @Override // p046rx.SingleSubscriber
        public void onSuccess(Object obj) {
            this.f79009b.onSuccess(obj);
        }
    }

    public SingleOperatorOnErrorResumeNext(Single single, Func1 func1) {
        if (single != null) {
            if (func1 != null) {
                this.f79006a = single;
                this.f79007b = func1;
                return;
            }
            throw new NullPointerException("resumeFunctionInCaseOfError must not be null");
        }
        throw new NullPointerException("originalSingle must not be null");
    }

    public static <T> SingleOperatorOnErrorResumeNext<T> withFunction(Single<? extends T> single, Func1<Throwable, ? extends Single<? extends T>> func1) {
        return new SingleOperatorOnErrorResumeNext<>(single, func1);
    }

    public static <T> SingleOperatorOnErrorResumeNext<T> withOther(Single<? extends T> single, Single<? extends T> single2) {
        if (single2 != null) {
            return new SingleOperatorOnErrorResumeNext<>(single, new C13716a(single2));
        }
        throw new NullPointerException("resumeSingleInCaseOfError must not be null");
    }

    @Override // p046rx.functions.Action1
    public /* bridge */ /* synthetic */ void call(Object obj) {
        call((SingleSubscriber) ((SingleSubscriber) obj));
    }

    public void call(SingleSubscriber<? super T> singleSubscriber) {
        C13717b c13717b = new C13717b(singleSubscriber);
        singleSubscriber.add(c13717b);
        this.f79006a.subscribe(c13717b);
    }
}

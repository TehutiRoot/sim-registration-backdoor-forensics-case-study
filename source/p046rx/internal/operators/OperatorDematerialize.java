package p046rx.internal.operators;

import p046rx.Notification;
import p046rx.Observable;
import p046rx.Subscriber;

/* renamed from: rx.internal.operators.OperatorDematerialize */
/* loaded from: classes7.dex */
public final class OperatorDematerialize<T> implements Observable.Operator<T, Notification<T>> {

    /* renamed from: rx.internal.operators.OperatorDematerialize$a */
    /* loaded from: classes7.dex */
    public class C13556a extends Subscriber {

        /* renamed from: a */
        public boolean f78321a;

        /* renamed from: b */
        public final /* synthetic */ Subscriber f78322b;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public C13556a(Subscriber subscriber, Subscriber subscriber2) {
            super(subscriber);
            this.f78322b = subscriber2;
        }

        @Override // p046rx.Observer
        public void onCompleted() {
            if (!this.f78321a) {
                this.f78321a = true;
                this.f78322b.onCompleted();
            }
        }

        @Override // p046rx.Observer
        public void onError(Throwable th2) {
            if (!this.f78321a) {
                this.f78321a = true;
                this.f78322b.onError(th2);
            }
        }

        /* JADX WARN: Multi-variable type inference failed */
        @Override // p046rx.Observer
        public void onNext(Notification notification) {
            int i = C13557b.f78324a[notification.getKind().ordinal()];
            if (i == 1) {
                if (this.f78321a) {
                    return;
                }
                this.f78322b.onNext(notification.getValue());
            } else if (i == 2) {
                onError(notification.getThrowable());
            } else if (i != 3) {
                onError(new IllegalArgumentException("Unsupported notification type: " + notification));
            } else {
                onCompleted();
            }
        }
    }

    /* renamed from: rx.internal.operators.OperatorDematerialize$b */
    /* loaded from: classes7.dex */
    public static /* synthetic */ class C13557b {

        /* renamed from: a */
        public static final /* synthetic */ int[] f78324a;

        static {
            int[] iArr = new int[Notification.Kind.values().length];
            f78324a = iArr;
            try {
                iArr[Notification.Kind.OnNext.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                f78324a[Notification.Kind.OnError.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            try {
                f78324a[Notification.Kind.OnCompleted.ordinal()] = 3;
            } catch (NoSuchFieldError unused3) {
            }
        }
    }

    /* renamed from: rx.internal.operators.OperatorDematerialize$c */
    /* loaded from: classes7.dex */
    public static final class C13558c {

        /* renamed from: a */
        public static final OperatorDematerialize f78325a = new OperatorDematerialize();
    }

    public static OperatorDematerialize instance() {
        return C13558c.f78325a;
    }

    @Override // p046rx.functions.Func1
    public /* bridge */ /* synthetic */ Object call(Object obj) {
        return call((Subscriber) ((Subscriber) obj));
    }

    public Subscriber<? super Notification<T>> call(Subscriber<? super T> subscriber) {
        return new C13556a(subscriber, subscriber);
    }
}

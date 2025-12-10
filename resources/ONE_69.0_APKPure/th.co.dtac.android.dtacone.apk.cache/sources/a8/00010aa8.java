package p046rx.internal.operators;

import p046rx.Notification;
import p046rx.Observable;
import p046rx.Subscriber;

/* renamed from: rx.internal.operators.OperatorDematerialize */
/* loaded from: classes7.dex */
public final class OperatorDematerialize<T> implements Observable.Operator<T, Notification<T>> {

    /* renamed from: rx.internal.operators.OperatorDematerialize$a */
    /* loaded from: classes7.dex */
    public class C13557a extends Subscriber {

        /* renamed from: a */
        public boolean f78527a;

        /* renamed from: b */
        public final /* synthetic */ Subscriber f78528b;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public C13557a(Subscriber subscriber, Subscriber subscriber2) {
            super(subscriber);
            this.f78528b = subscriber2;
        }

        @Override // p046rx.Observer
        public void onCompleted() {
            if (!this.f78527a) {
                this.f78527a = true;
                this.f78528b.onCompleted();
            }
        }

        @Override // p046rx.Observer
        public void onError(Throwable th2) {
            if (!this.f78527a) {
                this.f78527a = true;
                this.f78528b.onError(th2);
            }
        }

        /* JADX WARN: Multi-variable type inference failed */
        @Override // p046rx.Observer
        public void onNext(Notification notification) {
            int i = C13558b.f78530a[notification.getKind().ordinal()];
            if (i == 1) {
                if (this.f78527a) {
                    return;
                }
                this.f78528b.onNext(notification.getValue());
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
    public static /* synthetic */ class C13558b {

        /* renamed from: a */
        public static final /* synthetic */ int[] f78530a;

        static {
            int[] iArr = new int[Notification.Kind.values().length];
            f78530a = iArr;
            try {
                iArr[Notification.Kind.OnNext.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                f78530a[Notification.Kind.OnError.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            try {
                f78530a[Notification.Kind.OnCompleted.ordinal()] = 3;
            } catch (NoSuchFieldError unused3) {
            }
        }
    }

    /* renamed from: rx.internal.operators.OperatorDematerialize$c */
    /* loaded from: classes7.dex */
    public static final class C13559c {

        /* renamed from: a */
        public static final OperatorDematerialize f78531a = new OperatorDematerialize();
    }

    public static OperatorDematerialize instance() {
        return C13559c.f78531a;
    }

    @Override // p046rx.functions.Func1
    public /* bridge */ /* synthetic */ Object call(Object obj) {
        return call((Subscriber) ((Subscriber) obj));
    }

    public Subscriber<? super Notification<T>> call(Subscriber<? super T> subscriber) {
        return new C13557a(subscriber, subscriber);
    }
}
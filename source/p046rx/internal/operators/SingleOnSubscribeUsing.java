package p046rx.internal.operators;

import java.util.Arrays;
import p046rx.Single;
import p046rx.SingleSubscriber;
import p046rx.exceptions.CompositeException;
import p046rx.exceptions.Exceptions;
import p046rx.functions.Action1;
import p046rx.functions.Func0;
import p046rx.functions.Func1;
import p046rx.plugins.RxJavaHooks;

/* renamed from: rx.internal.operators.SingleOnSubscribeUsing */
/* loaded from: classes7.dex */
public final class SingleOnSubscribeUsing<T, Resource> implements Single.OnSubscribe<T> {

    /* renamed from: a */
    public final Func0 f78998a;

    /* renamed from: b */
    public final Func1 f78999b;

    /* renamed from: c */
    public final Action1 f79000c;

    /* renamed from: d */
    public final boolean f79001d;

    /* renamed from: rx.internal.operators.SingleOnSubscribeUsing$a */
    /* loaded from: classes7.dex */
    public class C13715a extends SingleSubscriber {

        /* renamed from: b */
        public final /* synthetic */ Object f79002b;

        /* renamed from: c */
        public final /* synthetic */ SingleSubscriber f79003c;

        public C13715a(Object obj, SingleSubscriber singleSubscriber) {
            this.f79002b = obj;
            this.f79003c = singleSubscriber;
        }

        @Override // p046rx.SingleSubscriber
        public void onError(Throwable th2) {
            SingleOnSubscribeUsing.this.m22928a(this.f79003c, this.f79002b, th2);
        }

        /* JADX WARN: Multi-variable type inference failed */
        @Override // p046rx.SingleSubscriber
        public void onSuccess(Object obj) {
            SingleOnSubscribeUsing singleOnSubscribeUsing = SingleOnSubscribeUsing.this;
            if (singleOnSubscribeUsing.f79001d) {
                try {
                    singleOnSubscribeUsing.f79000c.call(this.f79002b);
                } catch (Throwable th2) {
                    Exceptions.throwIfFatal(th2);
                    this.f79003c.onError(th2);
                    return;
                }
            }
            this.f79003c.onSuccess(obj);
            SingleOnSubscribeUsing singleOnSubscribeUsing2 = SingleOnSubscribeUsing.this;
            if (!singleOnSubscribeUsing2.f79001d) {
                try {
                    singleOnSubscribeUsing2.f79000c.call(this.f79002b);
                } catch (Throwable th3) {
                    Exceptions.throwIfFatal(th3);
                    RxJavaHooks.onError(th3);
                }
            }
        }
    }

    public SingleOnSubscribeUsing(Func0<Resource> func0, Func1<? super Resource, ? extends Single<? extends T>> func1, Action1<? super Resource> action1, boolean z) {
        this.f78998a = func0;
        this.f78999b = func1;
        this.f79000c = action1;
        this.f79001d = z;
    }

    /* renamed from: a */
    public void m22928a(SingleSubscriber singleSubscriber, Object obj, Throwable th2) {
        Exceptions.throwIfFatal(th2);
        if (this.f79001d) {
            try {
                this.f79000c.call(obj);
            } catch (Throwable th3) {
                Exceptions.throwIfFatal(th3);
                th2 = new CompositeException(Arrays.asList(th2, th3));
            }
        }
        singleSubscriber.onError(th2);
        if (!this.f79001d) {
            try {
                this.f79000c.call(obj);
            } catch (Throwable th4) {
                Exceptions.throwIfFatal(th4);
                RxJavaHooks.onError(th4);
            }
        }
    }

    @Override // p046rx.functions.Action1
    public /* bridge */ /* synthetic */ void call(Object obj) {
        call((SingleSubscriber) ((SingleSubscriber) obj));
    }

    /* JADX WARN: Multi-variable type inference failed */
    public void call(SingleSubscriber<? super T> singleSubscriber) {
        try {
            Object call = this.f78998a.call();
            try {
                Single single = (Single) this.f78999b.call(call);
                if (single == null) {
                    m22928a(singleSubscriber, call, new NullPointerException("The single"));
                    return;
                }
                C13715a c13715a = new C13715a(call, singleSubscriber);
                singleSubscriber.add(c13715a);
                single.subscribe(c13715a);
            } catch (Throwable th2) {
                m22928a(singleSubscriber, call, th2);
            }
        } catch (Throwable th3) {
            Exceptions.throwIfFatal(th3);
            singleSubscriber.onError(th3);
        }
    }
}

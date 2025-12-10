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
    public final Func0 f79204a;

    /* renamed from: b */
    public final Func1 f79205b;

    /* renamed from: c */
    public final Action1 f79206c;

    /* renamed from: d */
    public final boolean f79207d;

    /* renamed from: rx.internal.operators.SingleOnSubscribeUsing$a */
    /* loaded from: classes7.dex */
    public class C13716a extends SingleSubscriber {

        /* renamed from: b */
        public final /* synthetic */ Object f79208b;

        /* renamed from: c */
        public final /* synthetic */ SingleSubscriber f79209c;

        public C13716a(Object obj, SingleSubscriber singleSubscriber) {
            this.f79208b = obj;
            this.f79209c = singleSubscriber;
        }

        @Override // p046rx.SingleSubscriber
        public void onError(Throwable th2) {
            SingleOnSubscribeUsing.this.m23116a(this.f79209c, this.f79208b, th2);
        }

        /* JADX WARN: Multi-variable type inference failed */
        @Override // p046rx.SingleSubscriber
        public void onSuccess(Object obj) {
            SingleOnSubscribeUsing singleOnSubscribeUsing = SingleOnSubscribeUsing.this;
            if (singleOnSubscribeUsing.f79207d) {
                try {
                    singleOnSubscribeUsing.f79206c.call(this.f79208b);
                } catch (Throwable th2) {
                    Exceptions.throwIfFatal(th2);
                    this.f79209c.onError(th2);
                    return;
                }
            }
            this.f79209c.onSuccess(obj);
            SingleOnSubscribeUsing singleOnSubscribeUsing2 = SingleOnSubscribeUsing.this;
            if (!singleOnSubscribeUsing2.f79207d) {
                try {
                    singleOnSubscribeUsing2.f79206c.call(this.f79208b);
                } catch (Throwable th3) {
                    Exceptions.throwIfFatal(th3);
                    RxJavaHooks.onError(th3);
                }
            }
        }
    }

    public SingleOnSubscribeUsing(Func0<Resource> func0, Func1<? super Resource, ? extends Single<? extends T>> func1, Action1<? super Resource> action1, boolean z) {
        this.f79204a = func0;
        this.f79205b = func1;
        this.f79206c = action1;
        this.f79207d = z;
    }

    /* renamed from: a */
    public void m23116a(SingleSubscriber singleSubscriber, Object obj, Throwable th2) {
        Exceptions.throwIfFatal(th2);
        if (this.f79207d) {
            try {
                this.f79206c.call(obj);
            } catch (Throwable th3) {
                Exceptions.throwIfFatal(th3);
                th2 = new CompositeException(Arrays.asList(th2, th3));
            }
        }
        singleSubscriber.onError(th2);
        if (!this.f79207d) {
            try {
                this.f79206c.call(obj);
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
            Object call = this.f79204a.call();
            try {
                Single single = (Single) this.f79205b.call(call);
                if (single == null) {
                    m23116a(singleSubscriber, call, new NullPointerException("The single"));
                    return;
                }
                C13716a c13716a = new C13716a(call, singleSubscriber);
                singleSubscriber.add(c13716a);
                single.subscribe(c13716a);
            } catch (Throwable th2) {
                m23116a(singleSubscriber, call, th2);
            }
        } catch (Throwable th3) {
            Exceptions.throwIfFatal(th3);
            singleSubscriber.onError(th3);
        }
    }
}
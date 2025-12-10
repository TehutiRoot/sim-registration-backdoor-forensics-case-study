package p000;

import android.view.MotionEvent;
import android.view.View;
import com.jakewharton.rxbinding3.internal.Preconditions;
import io.reactivex.Observable;
import io.reactivex.Observer;
import io.reactivex.android.MainThreadDisposable;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;

/* renamed from: F22 */
/* loaded from: classes5.dex */
public final class F22 extends Observable {

    /* renamed from: a */
    public final View f1494a;

    /* renamed from: b */
    public final Function1 f1495b;

    /* renamed from: F22$a */
    /* loaded from: classes5.dex */
    public static final class View$OnHoverListenerC0362a extends MainThreadDisposable implements View.OnHoverListener {

        /* renamed from: b */
        public final View f1496b;

        /* renamed from: c */
        public final Function1 f1497c;

        /* renamed from: d */
        public final Observer f1498d;

        public View$OnHoverListenerC0362a(View view, Function1 handled, Observer observer) {
            Intrinsics.checkParameterIsNotNull(view, "view");
            Intrinsics.checkParameterIsNotNull(handled, "handled");
            Intrinsics.checkParameterIsNotNull(observer, "observer");
            this.f1496b = view;
            this.f1497c = handled;
            this.f1498d = observer;
        }

        @Override // io.reactivex.android.MainThreadDisposable
        public void onDispose() {
            this.f1496b.setOnHoverListener(null);
        }

        @Override // android.view.View.OnHoverListener
        public boolean onHover(View v, MotionEvent event) {
            Intrinsics.checkParameterIsNotNull(v, "v");
            Intrinsics.checkParameterIsNotNull(event, "event");
            if (!isDisposed()) {
                try {
                    if (((Boolean) this.f1497c.invoke(event)).booleanValue()) {
                        this.f1498d.onNext(event);
                        return true;
                    }
                    return false;
                } catch (Exception e) {
                    this.f1498d.onError(e);
                    dispose();
                    return false;
                }
            }
            return false;
        }
    }

    public F22(View view, Function1 handled) {
        Intrinsics.checkParameterIsNotNull(view, "view");
        Intrinsics.checkParameterIsNotNull(handled, "handled");
        this.f1494a = view;
        this.f1495b = handled;
    }

    @Override // io.reactivex.Observable
    public void subscribeActual(Observer observer) {
        Intrinsics.checkParameterIsNotNull(observer, "observer");
        if (!Preconditions.checkMainThread(observer)) {
            return;
        }
        View$OnHoverListenerC0362a view$OnHoverListenerC0362a = new View$OnHoverListenerC0362a(this.f1494a, this.f1495b, observer);
        observer.onSubscribe(view$OnHoverListenerC0362a);
        this.f1494a.setOnHoverListener(view$OnHoverListenerC0362a);
    }
}

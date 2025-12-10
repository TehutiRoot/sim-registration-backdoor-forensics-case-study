package p000;

import android.view.MotionEvent;
import android.view.View;
import com.jakewharton.rxbinding3.internal.Preconditions;
import io.reactivex.Observable;
import io.reactivex.Observer;
import io.reactivex.android.MainThreadDisposable;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;

/* renamed from: C32 */
/* loaded from: classes5.dex */
public final class C32 extends Observable {

    /* renamed from: a */
    public final View f636a;

    /* renamed from: b */
    public final Function1 f637b;

    /* renamed from: C32$a */
    /* loaded from: classes5.dex */
    public static final class View$OnHoverListenerC0155a extends MainThreadDisposable implements View.OnHoverListener {

        /* renamed from: b */
        public final View f638b;

        /* renamed from: c */
        public final Function1 f639c;

        /* renamed from: d */
        public final Observer f640d;

        public View$OnHoverListenerC0155a(View view, Function1 handled, Observer observer) {
            Intrinsics.checkParameterIsNotNull(view, "view");
            Intrinsics.checkParameterIsNotNull(handled, "handled");
            Intrinsics.checkParameterIsNotNull(observer, "observer");
            this.f638b = view;
            this.f639c = handled;
            this.f640d = observer;
        }

        @Override // io.reactivex.android.MainThreadDisposable
        public void onDispose() {
            this.f638b.setOnHoverListener(null);
        }

        @Override // android.view.View.OnHoverListener
        public boolean onHover(View v, MotionEvent event) {
            Intrinsics.checkParameterIsNotNull(v, "v");
            Intrinsics.checkParameterIsNotNull(event, "event");
            if (!isDisposed()) {
                try {
                    if (((Boolean) this.f639c.invoke(event)).booleanValue()) {
                        this.f640d.onNext(event);
                        return true;
                    }
                    return false;
                } catch (Exception e) {
                    this.f640d.onError(e);
                    dispose();
                    return false;
                }
            }
            return false;
        }
    }

    public C32(View view, Function1 handled) {
        Intrinsics.checkParameterIsNotNull(view, "view");
        Intrinsics.checkParameterIsNotNull(handled, "handled");
        this.f636a = view;
        this.f637b = handled;
    }

    @Override // io.reactivex.Observable
    public void subscribeActual(Observer observer) {
        Intrinsics.checkParameterIsNotNull(observer, "observer");
        if (!Preconditions.checkMainThread(observer)) {
            return;
        }
        View$OnHoverListenerC0155a view$OnHoverListenerC0155a = new View$OnHoverListenerC0155a(this.f636a, this.f637b, observer);
        observer.onSubscribe(view$OnHoverListenerC0155a);
        this.f636a.setOnHoverListener(view$OnHoverListenerC0155a);
    }
}
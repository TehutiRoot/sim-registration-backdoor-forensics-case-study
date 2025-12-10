package p000;

import android.view.KeyEvent;
import android.view.View;
import com.jakewharton.rxbinding3.internal.Preconditions;
import io.reactivex.Observable;
import io.reactivex.Observer;
import io.reactivex.android.MainThreadDisposable;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;

/* renamed from: H22 */
/* loaded from: classes5.dex */
public final class H22 extends Observable {

    /* renamed from: a */
    public final View f2094a;

    /* renamed from: b */
    public final Function1 f2095b;

    /* renamed from: H22$a */
    /* loaded from: classes5.dex */
    public static final class View$OnKeyListenerC0499a extends MainThreadDisposable implements View.OnKeyListener {

        /* renamed from: b */
        public final View f2096b;

        /* renamed from: c */
        public final Function1 f2097c;

        /* renamed from: d */
        public final Observer f2098d;

        public View$OnKeyListenerC0499a(View view, Function1 handled, Observer observer) {
            Intrinsics.checkParameterIsNotNull(view, "view");
            Intrinsics.checkParameterIsNotNull(handled, "handled");
            Intrinsics.checkParameterIsNotNull(observer, "observer");
            this.f2096b = view;
            this.f2097c = handled;
            this.f2098d = observer;
        }

        @Override // io.reactivex.android.MainThreadDisposable
        public void onDispose() {
            this.f2096b.setOnKeyListener(null);
        }

        @Override // android.view.View.OnKeyListener
        public boolean onKey(View v, int i, KeyEvent event) {
            Intrinsics.checkParameterIsNotNull(v, "v");
            Intrinsics.checkParameterIsNotNull(event, "event");
            if (!isDisposed()) {
                try {
                    if (((Boolean) this.f2097c.invoke(event)).booleanValue()) {
                        this.f2098d.onNext(event);
                        return true;
                    }
                    return false;
                } catch (Exception e) {
                    this.f2098d.onError(e);
                    dispose();
                    return false;
                }
            }
            return false;
        }
    }

    public H22(View view, Function1 handled) {
        Intrinsics.checkParameterIsNotNull(view, "view");
        Intrinsics.checkParameterIsNotNull(handled, "handled");
        this.f2094a = view;
        this.f2095b = handled;
    }

    @Override // io.reactivex.Observable
    public void subscribeActual(Observer observer) {
        Intrinsics.checkParameterIsNotNull(observer, "observer");
        if (!Preconditions.checkMainThread(observer)) {
            return;
        }
        View$OnKeyListenerC0499a view$OnKeyListenerC0499a = new View$OnKeyListenerC0499a(this.f2094a, this.f2095b, observer);
        observer.onSubscribe(view$OnKeyListenerC0499a);
        this.f2094a.setOnKeyListener(view$OnKeyListenerC0499a);
    }
}

package p000;

import android.view.KeyEvent;
import android.view.View;
import com.jakewharton.rxbinding3.internal.Preconditions;
import io.reactivex.Observable;
import io.reactivex.Observer;
import io.reactivex.android.MainThreadDisposable;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;

/* renamed from: E32 */
/* loaded from: classes5.dex */
public final class E32 extends Observable {

    /* renamed from: a */
    public final View f1239a;

    /* renamed from: b */
    public final Function1 f1240b;

    /* renamed from: E32$a */
    /* loaded from: classes5.dex */
    public static final class View$OnKeyListenerC0290a extends MainThreadDisposable implements View.OnKeyListener {

        /* renamed from: b */
        public final View f1241b;

        /* renamed from: c */
        public final Function1 f1242c;

        /* renamed from: d */
        public final Observer f1243d;

        public View$OnKeyListenerC0290a(View view, Function1 handled, Observer observer) {
            Intrinsics.checkParameterIsNotNull(view, "view");
            Intrinsics.checkParameterIsNotNull(handled, "handled");
            Intrinsics.checkParameterIsNotNull(observer, "observer");
            this.f1241b = view;
            this.f1242c = handled;
            this.f1243d = observer;
        }

        @Override // io.reactivex.android.MainThreadDisposable
        public void onDispose() {
            this.f1241b.setOnKeyListener(null);
        }

        @Override // android.view.View.OnKeyListener
        public boolean onKey(View v, int i, KeyEvent event) {
            Intrinsics.checkParameterIsNotNull(v, "v");
            Intrinsics.checkParameterIsNotNull(event, "event");
            if (!isDisposed()) {
                try {
                    if (((Boolean) this.f1242c.invoke(event)).booleanValue()) {
                        this.f1243d.onNext(event);
                        return true;
                    }
                    return false;
                } catch (Exception e) {
                    this.f1243d.onError(e);
                    dispose();
                    return false;
                }
            }
            return false;
        }
    }

    public E32(View view, Function1 handled) {
        Intrinsics.checkParameterIsNotNull(view, "view");
        Intrinsics.checkParameterIsNotNull(handled, "handled");
        this.f1239a = view;
        this.f1240b = handled;
    }

    @Override // io.reactivex.Observable
    public void subscribeActual(Observer observer) {
        Intrinsics.checkParameterIsNotNull(observer, "observer");
        if (!Preconditions.checkMainThread(observer)) {
            return;
        }
        View$OnKeyListenerC0290a view$OnKeyListenerC0290a = new View$OnKeyListenerC0290a(this.f1239a, this.f1240b, observer);
        observer.onSubscribe(view$OnKeyListenerC0290a);
        this.f1239a.setOnKeyListener(view$OnKeyListenerC0290a);
    }
}
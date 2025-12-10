package p000;

import android.view.View;
import com.jakewharton.rxbinding2.internal.Notification;
import com.jakewharton.rxbinding2.internal.Preconditions;
import io.reactivex.Observable;
import io.reactivex.Observer;
import io.reactivex.android.MainThreadDisposable;

/* renamed from: Q22 */
/* loaded from: classes5.dex */
public final class Q22 extends Observable {

    /* renamed from: a */
    public final View f4937a;

    /* renamed from: Q22$a */
    /* loaded from: classes5.dex */
    public static final class View$OnLayoutChangeListenerC1143a extends MainThreadDisposable implements View.OnLayoutChangeListener {

        /* renamed from: b */
        public final View f4938b;

        /* renamed from: c */
        public final Observer f4939c;

        public View$OnLayoutChangeListenerC1143a(View view, Observer observer) {
            this.f4938b = view;
            this.f4939c = observer;
        }

        @Override // io.reactivex.android.MainThreadDisposable
        public void onDispose() {
            this.f4938b.removeOnLayoutChangeListener(this);
        }

        @Override // android.view.View.OnLayoutChangeListener
        public void onLayoutChange(View view, int i, int i2, int i3, int i4, int i5, int i6, int i7, int i8) {
            if (!isDisposed()) {
                this.f4939c.onNext(Notification.INSTANCE);
            }
        }
    }

    public Q22(View view) {
        this.f4937a = view;
    }

    @Override // io.reactivex.Observable
    public void subscribeActual(Observer observer) {
        if (!Preconditions.checkMainThread(observer)) {
            return;
        }
        View$OnLayoutChangeListenerC1143a view$OnLayoutChangeListenerC1143a = new View$OnLayoutChangeListenerC1143a(this.f4937a, observer);
        observer.onSubscribe(view$OnLayoutChangeListenerC1143a);
        this.f4937a.addOnLayoutChangeListener(view$OnLayoutChangeListenerC1143a);
    }
}

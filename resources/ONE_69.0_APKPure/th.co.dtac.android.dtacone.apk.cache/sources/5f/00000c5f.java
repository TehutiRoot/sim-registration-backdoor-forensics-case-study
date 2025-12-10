package p000;

import android.view.View;
import com.jakewharton.rxbinding2.internal.Notification;
import com.jakewharton.rxbinding2.internal.Preconditions;
import io.reactivex.Observable;
import io.reactivex.Observer;
import io.reactivex.android.MainThreadDisposable;

/* renamed from: N32 */
/* loaded from: classes5.dex */
public final class N32 extends Observable {

    /* renamed from: a */
    public final View f4054a;

    /* renamed from: N32$a */
    /* loaded from: classes5.dex */
    public static final class View$OnLayoutChangeListenerC0907a extends MainThreadDisposable implements View.OnLayoutChangeListener {

        /* renamed from: b */
        public final View f4055b;

        /* renamed from: c */
        public final Observer f4056c;

        public View$OnLayoutChangeListenerC0907a(View view, Observer observer) {
            this.f4055b = view;
            this.f4056c = observer;
        }

        @Override // io.reactivex.android.MainThreadDisposable
        public void onDispose() {
            this.f4055b.removeOnLayoutChangeListener(this);
        }

        @Override // android.view.View.OnLayoutChangeListener
        public void onLayoutChange(View view, int i, int i2, int i3, int i4, int i5, int i6, int i7, int i8) {
            if (!isDisposed()) {
                this.f4056c.onNext(Notification.INSTANCE);
            }
        }
    }

    public N32(View view) {
        this.f4054a = view;
    }

    @Override // io.reactivex.Observable
    public void subscribeActual(Observer observer) {
        if (!Preconditions.checkMainThread(observer)) {
            return;
        }
        View$OnLayoutChangeListenerC0907a view$OnLayoutChangeListenerC0907a = new View$OnLayoutChangeListenerC0907a(this.f4054a, observer);
        observer.onSubscribe(view$OnLayoutChangeListenerC0907a);
        this.f4054a.addOnLayoutChangeListener(view$OnLayoutChangeListenerC0907a);
    }
}
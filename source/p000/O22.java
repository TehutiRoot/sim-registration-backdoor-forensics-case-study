package p000;

import android.view.View;
import com.jakewharton.rxbinding2.internal.Preconditions;
import com.jakewharton.rxbinding2.view.ViewLayoutChangeEvent;
import io.reactivex.Observable;
import io.reactivex.Observer;
import io.reactivex.android.MainThreadDisposable;

/* renamed from: O22 */
/* loaded from: classes5.dex */
public final class O22 extends Observable {

    /* renamed from: a */
    public final View f4281a;

    /* renamed from: O22$a */
    /* loaded from: classes5.dex */
    public static final class View$OnLayoutChangeListenerC0987a extends MainThreadDisposable implements View.OnLayoutChangeListener {

        /* renamed from: b */
        public final View f4282b;

        /* renamed from: c */
        public final Observer f4283c;

        public View$OnLayoutChangeListenerC0987a(View view, Observer observer) {
            this.f4282b = view;
            this.f4283c = observer;
        }

        @Override // io.reactivex.android.MainThreadDisposable
        public void onDispose() {
            this.f4282b.removeOnLayoutChangeListener(this);
        }

        @Override // android.view.View.OnLayoutChangeListener
        public void onLayoutChange(View view, int i, int i2, int i3, int i4, int i5, int i6, int i7, int i8) {
            if (!isDisposed()) {
                this.f4283c.onNext(ViewLayoutChangeEvent.create(view, i, i2, i3, i4, i5, i6, i7, i8));
            }
        }
    }

    public O22(View view) {
        this.f4281a = view;
    }

    @Override // io.reactivex.Observable
    public void subscribeActual(Observer observer) {
        if (!Preconditions.checkMainThread(observer)) {
            return;
        }
        View$OnLayoutChangeListenerC0987a view$OnLayoutChangeListenerC0987a = new View$OnLayoutChangeListenerC0987a(this.f4281a, observer);
        observer.onSubscribe(view$OnLayoutChangeListenerC0987a);
        this.f4281a.addOnLayoutChangeListener(view$OnLayoutChangeListenerC0987a);
    }
}

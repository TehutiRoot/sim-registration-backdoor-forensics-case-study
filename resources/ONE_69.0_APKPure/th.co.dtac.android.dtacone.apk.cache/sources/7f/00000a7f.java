package p000;

import android.view.View;
import com.jakewharton.rxbinding2.internal.Preconditions;
import com.jakewharton.rxbinding2.view.ViewLayoutChangeEvent;
import io.reactivex.Observable;
import io.reactivex.Observer;
import io.reactivex.android.MainThreadDisposable;

/* renamed from: L32 */
/* loaded from: classes5.dex */
public final class L32 extends Observable {

    /* renamed from: a */
    public final View f3498a;

    /* renamed from: L32$a */
    /* loaded from: classes5.dex */
    public static final class View$OnLayoutChangeListenerC0773a extends MainThreadDisposable implements View.OnLayoutChangeListener {

        /* renamed from: b */
        public final View f3499b;

        /* renamed from: c */
        public final Observer f3500c;

        public View$OnLayoutChangeListenerC0773a(View view, Observer observer) {
            this.f3499b = view;
            this.f3500c = observer;
        }

        @Override // io.reactivex.android.MainThreadDisposable
        public void onDispose() {
            this.f3499b.removeOnLayoutChangeListener(this);
        }

        @Override // android.view.View.OnLayoutChangeListener
        public void onLayoutChange(View view, int i, int i2, int i3, int i4, int i5, int i6, int i7, int i8) {
            if (!isDisposed()) {
                this.f3500c.onNext(ViewLayoutChangeEvent.create(view, i, i2, i3, i4, i5, i6, i7, i8));
            }
        }
    }

    public L32(View view) {
        this.f3498a = view;
    }

    @Override // io.reactivex.Observable
    public void subscribeActual(Observer observer) {
        if (!Preconditions.checkMainThread(observer)) {
            return;
        }
        View$OnLayoutChangeListenerC0773a view$OnLayoutChangeListenerC0773a = new View$OnLayoutChangeListenerC0773a(this.f3498a, observer);
        observer.onSubscribe(view$OnLayoutChangeListenerC0773a);
        this.f3498a.addOnLayoutChangeListener(view$OnLayoutChangeListenerC0773a);
    }
}
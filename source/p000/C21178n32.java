package p000;

import android.view.View;
import android.view.ViewTreeObserver;
import com.jakewharton.rxbinding2.internal.Notification;
import com.jakewharton.rxbinding2.internal.Preconditions;
import io.reactivex.Observable;
import io.reactivex.Observer;
import io.reactivex.android.MainThreadDisposable;

/* renamed from: n32  reason: case insensitive filesystem */
/* loaded from: classes5.dex */
public final class C21178n32 extends Observable {

    /* renamed from: a */
    public final View f72119a;

    /* renamed from: n32$a */
    /* loaded from: classes5.dex */
    public static final class ViewTreeObserver$OnDrawListenerC12333a extends MainThreadDisposable implements ViewTreeObserver.OnDrawListener {

        /* renamed from: b */
        public final View f72120b;

        /* renamed from: c */
        public final Observer f72121c;

        public ViewTreeObserver$OnDrawListenerC12333a(View view, Observer observer) {
            this.f72120b = view;
            this.f72121c = observer;
        }

        @Override // io.reactivex.android.MainThreadDisposable
        public void onDispose() {
            this.f72120b.getViewTreeObserver().removeOnDrawListener(this);
        }

        @Override // android.view.ViewTreeObserver.OnDrawListener
        public void onDraw() {
            if (!isDisposed()) {
                this.f72121c.onNext(Notification.INSTANCE);
            }
        }
    }

    public C21178n32(View view) {
        this.f72119a = view;
    }

    @Override // io.reactivex.Observable
    public void subscribeActual(Observer observer) {
        if (!Preconditions.checkMainThread(observer)) {
            return;
        }
        ViewTreeObserver$OnDrawListenerC12333a viewTreeObserver$OnDrawListenerC12333a = new ViewTreeObserver$OnDrawListenerC12333a(this.f72119a, observer);
        observer.onSubscribe(viewTreeObserver$OnDrawListenerC12333a);
        this.f72119a.getViewTreeObserver().addOnDrawListener(viewTreeObserver$OnDrawListenerC12333a);
    }
}

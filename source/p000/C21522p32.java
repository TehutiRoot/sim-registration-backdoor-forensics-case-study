package p000;

import android.view.View;
import android.view.ViewTreeObserver;
import com.jakewharton.rxbinding2.internal.Notification;
import com.jakewharton.rxbinding2.internal.Preconditions;
import io.reactivex.Observable;
import io.reactivex.Observer;
import io.reactivex.android.MainThreadDisposable;

/* renamed from: p32  reason: case insensitive filesystem */
/* loaded from: classes5.dex */
public final class C21522p32 extends Observable {

    /* renamed from: a */
    public final View f76465a;

    /* renamed from: p32$a */
    /* loaded from: classes5.dex */
    public static final class ViewTreeObserver$OnGlobalLayoutListenerC13059a extends MainThreadDisposable implements ViewTreeObserver.OnGlobalLayoutListener {

        /* renamed from: b */
        public final View f76466b;

        /* renamed from: c */
        public final Observer f76467c;

        public ViewTreeObserver$OnGlobalLayoutListenerC13059a(View view, Observer observer) {
            this.f76466b = view;
            this.f76467c = observer;
        }

        @Override // io.reactivex.android.MainThreadDisposable
        public void onDispose() {
            this.f76466b.getViewTreeObserver().removeGlobalOnLayoutListener(this);
        }

        @Override // android.view.ViewTreeObserver.OnGlobalLayoutListener
        public void onGlobalLayout() {
            if (!isDisposed()) {
                this.f76467c.onNext(Notification.INSTANCE);
            }
        }
    }

    public C21522p32(View view) {
        this.f76465a = view;
    }

    @Override // io.reactivex.Observable
    public void subscribeActual(Observer observer) {
        if (!Preconditions.checkMainThread(observer)) {
            return;
        }
        ViewTreeObserver$OnGlobalLayoutListenerC13059a viewTreeObserver$OnGlobalLayoutListenerC13059a = new ViewTreeObserver$OnGlobalLayoutListenerC13059a(this.f76465a, observer);
        observer.onSubscribe(viewTreeObserver$OnGlobalLayoutListenerC13059a);
        this.f76465a.getViewTreeObserver().addOnGlobalLayoutListener(viewTreeObserver$OnGlobalLayoutListenerC13059a);
    }
}

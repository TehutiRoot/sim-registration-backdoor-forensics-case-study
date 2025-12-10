package p000;

import android.view.View;
import com.jakewharton.rxbinding2.internal.Preconditions;
import com.jakewharton.rxbinding2.view.ViewScrollChangeEvent;
import io.reactivex.Observable;
import io.reactivex.Observer;
import io.reactivex.android.MainThreadDisposable;

/* renamed from: e32  reason: case insensitive filesystem */
/* loaded from: classes5.dex */
public final class C19630e32 extends Observable {

    /* renamed from: a */
    public final View f61398a;

    /* renamed from: e32$a */
    /* loaded from: classes5.dex */
    public static final class View$OnScrollChangeListenerC10124a extends MainThreadDisposable implements View.OnScrollChangeListener {

        /* renamed from: b */
        public final View f61399b;

        /* renamed from: c */
        public final Observer f61400c;

        public View$OnScrollChangeListenerC10124a(View view, Observer observer) {
            this.f61399b = view;
            this.f61400c = observer;
        }

        @Override // io.reactivex.android.MainThreadDisposable
        public void onDispose() {
            this.f61399b.setOnScrollChangeListener(null);
        }

        @Override // android.view.View.OnScrollChangeListener
        public void onScrollChange(View view, int i, int i2, int i3, int i4) {
            if (!isDisposed()) {
                this.f61400c.onNext(ViewScrollChangeEvent.create(view, i, i2, i3, i4));
            }
        }
    }

    public C19630e32(View view) {
        this.f61398a = view;
    }

    @Override // io.reactivex.Observable
    public void subscribeActual(Observer observer) {
        if (!Preconditions.checkMainThread(observer)) {
            return;
        }
        View$OnScrollChangeListenerC10124a view$OnScrollChangeListenerC10124a = new View$OnScrollChangeListenerC10124a(this.f61398a, observer);
        observer.onSubscribe(view$OnScrollChangeListenerC10124a);
        this.f61398a.setOnScrollChangeListener(view$OnScrollChangeListenerC10124a);
    }
}

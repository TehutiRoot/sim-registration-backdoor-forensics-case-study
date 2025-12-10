package p000;

import android.view.View;
import com.jakewharton.rxbinding2.internal.Preconditions;
import com.jakewharton.rxbinding2.view.ViewScrollChangeEvent;
import io.reactivex.Observable;
import io.reactivex.Observer;
import io.reactivex.android.MainThreadDisposable;

/* renamed from: b42  reason: case insensitive filesystem */
/* loaded from: classes5.dex */
public final class C19164b42 extends Observable {

    /* renamed from: a */
    public final View f38989a;

    /* renamed from: b42$a */
    /* loaded from: classes5.dex */
    public static final class View$OnScrollChangeListenerC5329a extends MainThreadDisposable implements View.OnScrollChangeListener {

        /* renamed from: b */
        public final View f38990b;

        /* renamed from: c */
        public final Observer f38991c;

        public View$OnScrollChangeListenerC5329a(View view, Observer observer) {
            this.f38990b = view;
            this.f38991c = observer;
        }

        @Override // io.reactivex.android.MainThreadDisposable
        public void onDispose() {
            this.f38990b.setOnScrollChangeListener(null);
        }

        @Override // android.view.View.OnScrollChangeListener
        public void onScrollChange(View view, int i, int i2, int i3, int i4) {
            if (!isDisposed()) {
                this.f38991c.onNext(ViewScrollChangeEvent.create(view, i, i2, i3, i4));
            }
        }
    }

    public C19164b42(View view) {
        this.f38989a = view;
    }

    @Override // io.reactivex.Observable
    public void subscribeActual(Observer observer) {
        if (!Preconditions.checkMainThread(observer)) {
            return;
        }
        View$OnScrollChangeListenerC5329a view$OnScrollChangeListenerC5329a = new View$OnScrollChangeListenerC5329a(this.f38989a, observer);
        observer.onSubscribe(view$OnScrollChangeListenerC5329a);
        this.f38989a.setOnScrollChangeListener(view$OnScrollChangeListenerC5329a);
    }
}
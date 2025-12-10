package p000;

import android.view.View;
import com.jakewharton.rxbinding2.internal.Preconditions;
import io.reactivex.Observable;
import io.reactivex.Observer;
import io.reactivex.android.MainThreadDisposable;

/* renamed from: h32  reason: case insensitive filesystem */
/* loaded from: classes5.dex */
public final class C20146h32 extends Observable {

    /* renamed from: a */
    public final View f62387a;

    /* renamed from: h32$a */
    /* loaded from: classes5.dex */
    public static final class View$OnSystemUiVisibilityChangeListenerC10356a extends MainThreadDisposable implements View.OnSystemUiVisibilityChangeListener {

        /* renamed from: b */
        public final View f62388b;

        /* renamed from: c */
        public final Observer f62389c;

        public View$OnSystemUiVisibilityChangeListenerC10356a(View view, Observer observer) {
            this.f62388b = view;
            this.f62389c = observer;
        }

        @Override // io.reactivex.android.MainThreadDisposable
        public void onDispose() {
            this.f62388b.setOnSystemUiVisibilityChangeListener(null);
        }

        @Override // android.view.View.OnSystemUiVisibilityChangeListener
        public void onSystemUiVisibilityChange(int i) {
            if (!isDisposed()) {
                this.f62389c.onNext(Integer.valueOf(i));
            }
        }
    }

    public C20146h32(View view) {
        this.f62387a = view;
    }

    @Override // io.reactivex.Observable
    public void subscribeActual(Observer observer) {
        if (!Preconditions.checkMainThread(observer)) {
            return;
        }
        View$OnSystemUiVisibilityChangeListenerC10356a view$OnSystemUiVisibilityChangeListenerC10356a = new View$OnSystemUiVisibilityChangeListenerC10356a(this.f62387a, observer);
        observer.onSubscribe(view$OnSystemUiVisibilityChangeListenerC10356a);
        this.f62387a.setOnSystemUiVisibilityChangeListener(view$OnSystemUiVisibilityChangeListenerC10356a);
    }
}

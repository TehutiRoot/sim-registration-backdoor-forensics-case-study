package p000;

import android.view.KeyEvent;
import android.view.View;
import com.jakewharton.rxbinding2.internal.Preconditions;
import io.reactivex.Observable;
import io.reactivex.Observer;
import io.reactivex.android.MainThreadDisposable;
import io.reactivex.functions.Predicate;

/* renamed from: D32 */
/* loaded from: classes5.dex */
public final class D32 extends Observable {

    /* renamed from: a */
    public final View f909a;

    /* renamed from: b */
    public final Predicate f910b;

    /* renamed from: D32$a */
    /* loaded from: classes5.dex */
    public static final class View$OnKeyListenerC0220a extends MainThreadDisposable implements View.OnKeyListener {

        /* renamed from: b */
        public final View f911b;

        /* renamed from: c */
        public final Predicate f912c;

        /* renamed from: d */
        public final Observer f913d;

        public View$OnKeyListenerC0220a(View view, Predicate predicate, Observer observer) {
            this.f911b = view;
            this.f912c = predicate;
            this.f913d = observer;
        }

        @Override // io.reactivex.android.MainThreadDisposable
        public void onDispose() {
            this.f911b.setOnKeyListener(null);
        }

        @Override // android.view.View.OnKeyListener
        public boolean onKey(View view, int i, KeyEvent keyEvent) {
            if (!isDisposed()) {
                try {
                    if (this.f912c.test(keyEvent)) {
                        this.f913d.onNext(keyEvent);
                        return true;
                    }
                    return false;
                } catch (Exception e) {
                    this.f913d.onError(e);
                    dispose();
                    return false;
                }
            }
            return false;
        }
    }

    public D32(View view, Predicate predicate) {
        this.f909a = view;
        this.f910b = predicate;
    }

    @Override // io.reactivex.Observable
    public void subscribeActual(Observer observer) {
        if (!Preconditions.checkMainThread(observer)) {
            return;
        }
        View$OnKeyListenerC0220a view$OnKeyListenerC0220a = new View$OnKeyListenerC0220a(this.f909a, this.f910b, observer);
        observer.onSubscribe(view$OnKeyListenerC0220a);
        this.f909a.setOnKeyListener(view$OnKeyListenerC0220a);
    }
}
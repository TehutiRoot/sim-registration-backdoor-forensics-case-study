package p000;

import android.view.KeyEvent;
import android.view.View;
import com.jakewharton.rxbinding2.internal.Preconditions;
import io.reactivex.Observable;
import io.reactivex.Observer;
import io.reactivex.android.MainThreadDisposable;
import io.reactivex.functions.Predicate;

/* renamed from: G22 */
/* loaded from: classes5.dex */
public final class G22 extends Observable {

    /* renamed from: a */
    public final View f1796a;

    /* renamed from: b */
    public final Predicate f1797b;

    /* renamed from: G22$a */
    /* loaded from: classes5.dex */
    public static final class View$OnKeyListenerC0427a extends MainThreadDisposable implements View.OnKeyListener {

        /* renamed from: b */
        public final View f1798b;

        /* renamed from: c */
        public final Predicate f1799c;

        /* renamed from: d */
        public final Observer f1800d;

        public View$OnKeyListenerC0427a(View view, Predicate predicate, Observer observer) {
            this.f1798b = view;
            this.f1799c = predicate;
            this.f1800d = observer;
        }

        @Override // io.reactivex.android.MainThreadDisposable
        public void onDispose() {
            this.f1798b.setOnKeyListener(null);
        }

        @Override // android.view.View.OnKeyListener
        public boolean onKey(View view, int i, KeyEvent keyEvent) {
            if (!isDisposed()) {
                try {
                    if (this.f1799c.test(keyEvent)) {
                        this.f1800d.onNext(keyEvent);
                        return true;
                    }
                    return false;
                } catch (Exception e) {
                    this.f1800d.onError(e);
                    dispose();
                    return false;
                }
            }
            return false;
        }
    }

    public G22(View view, Predicate predicate) {
        this.f1796a = view;
        this.f1797b = predicate;
    }

    @Override // io.reactivex.Observable
    public void subscribeActual(Observer observer) {
        if (!Preconditions.checkMainThread(observer)) {
            return;
        }
        View$OnKeyListenerC0427a view$OnKeyListenerC0427a = new View$OnKeyListenerC0427a(this.f1796a, this.f1797b, observer);
        observer.onSubscribe(view$OnKeyListenerC0427a);
        this.f1796a.setOnKeyListener(view$OnKeyListenerC0427a);
    }
}

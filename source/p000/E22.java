package p000;

import android.view.MotionEvent;
import android.view.View;
import com.jakewharton.rxbinding2.internal.Preconditions;
import io.reactivex.Observable;
import io.reactivex.Observer;
import io.reactivex.android.MainThreadDisposable;
import io.reactivex.functions.Predicate;

/* renamed from: E22 */
/* loaded from: classes5.dex */
public final class E22 extends Observable {

    /* renamed from: a */
    public final View f1195a;

    /* renamed from: b */
    public final Predicate f1196b;

    /* renamed from: E22$a */
    /* loaded from: classes5.dex */
    public static final class View$OnHoverListenerC0295a extends MainThreadDisposable implements View.OnHoverListener {

        /* renamed from: b */
        public final View f1197b;

        /* renamed from: c */
        public final Predicate f1198c;

        /* renamed from: d */
        public final Observer f1199d;

        public View$OnHoverListenerC0295a(View view, Predicate predicate, Observer observer) {
            this.f1197b = view;
            this.f1198c = predicate;
            this.f1199d = observer;
        }

        @Override // io.reactivex.android.MainThreadDisposable
        public void onDispose() {
            this.f1197b.setOnHoverListener(null);
        }

        @Override // android.view.View.OnHoverListener
        public boolean onHover(View view, MotionEvent motionEvent) {
            if (!isDisposed()) {
                try {
                    if (this.f1198c.test(motionEvent)) {
                        this.f1199d.onNext(motionEvent);
                        return true;
                    }
                    return false;
                } catch (Exception e) {
                    this.f1199d.onError(e);
                    dispose();
                    return false;
                }
            }
            return false;
        }
    }

    public E22(View view, Predicate predicate) {
        this.f1195a = view;
        this.f1196b = predicate;
    }

    @Override // io.reactivex.Observable
    public void subscribeActual(Observer observer) {
        if (!Preconditions.checkMainThread(observer)) {
            return;
        }
        View$OnHoverListenerC0295a view$OnHoverListenerC0295a = new View$OnHoverListenerC0295a(this.f1195a, this.f1196b, observer);
        observer.onSubscribe(view$OnHoverListenerC0295a);
        this.f1195a.setOnHoverListener(view$OnHoverListenerC0295a);
    }
}

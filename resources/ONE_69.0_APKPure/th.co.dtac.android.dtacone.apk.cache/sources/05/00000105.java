package p000;

import android.view.MotionEvent;
import android.view.View;
import com.jakewharton.rxbinding2.internal.Preconditions;
import io.reactivex.Observable;
import io.reactivex.Observer;
import io.reactivex.android.MainThreadDisposable;
import io.reactivex.functions.Predicate;

/* renamed from: B32 */
/* loaded from: classes5.dex */
public final class B32 extends Observable {

    /* renamed from: a */
    public final View f309a;

    /* renamed from: b */
    public final Predicate f310b;

    /* renamed from: B32$a */
    /* loaded from: classes5.dex */
    public static final class View$OnHoverListenerC0077a extends MainThreadDisposable implements View.OnHoverListener {

        /* renamed from: b */
        public final View f311b;

        /* renamed from: c */
        public final Predicate f312c;

        /* renamed from: d */
        public final Observer f313d;

        public View$OnHoverListenerC0077a(View view, Predicate predicate, Observer observer) {
            this.f311b = view;
            this.f312c = predicate;
            this.f313d = observer;
        }

        @Override // io.reactivex.android.MainThreadDisposable
        public void onDispose() {
            this.f311b.setOnHoverListener(null);
        }

        @Override // android.view.View.OnHoverListener
        public boolean onHover(View view, MotionEvent motionEvent) {
            if (!isDisposed()) {
                try {
                    if (this.f312c.test(motionEvent)) {
                        this.f313d.onNext(motionEvent);
                        return true;
                    }
                    return false;
                } catch (Exception e) {
                    this.f313d.onError(e);
                    dispose();
                    return false;
                }
            }
            return false;
        }
    }

    public B32(View view, Predicate predicate) {
        this.f309a = view;
        this.f310b = predicate;
    }

    @Override // io.reactivex.Observable
    public void subscribeActual(Observer observer) {
        if (!Preconditions.checkMainThread(observer)) {
            return;
        }
        View$OnHoverListenerC0077a view$OnHoverListenerC0077a = new View$OnHoverListenerC0077a(this.f309a, this.f310b, observer);
        observer.onSubscribe(view$OnHoverListenerC0077a);
        this.f309a.setOnHoverListener(view$OnHoverListenerC0077a);
    }
}
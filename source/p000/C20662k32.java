package p000;

import android.view.MotionEvent;
import android.view.View;
import com.jakewharton.rxbinding2.internal.Preconditions;
import io.reactivex.Observable;
import io.reactivex.Observer;
import io.reactivex.android.MainThreadDisposable;
import io.reactivex.functions.Predicate;

/* renamed from: k32  reason: case insensitive filesystem */
/* loaded from: classes5.dex */
public final class C20662k32 extends Observable {

    /* renamed from: a */
    public final View f67793a;

    /* renamed from: b */
    public final Predicate f67794b;

    /* renamed from: k32$a */
    /* loaded from: classes5.dex */
    public static final class View$OnTouchListenerC11621a extends MainThreadDisposable implements View.OnTouchListener {

        /* renamed from: b */
        public final View f67795b;

        /* renamed from: c */
        public final Predicate f67796c;

        /* renamed from: d */
        public final Observer f67797d;

        public View$OnTouchListenerC11621a(View view, Predicate predicate, Observer observer) {
            this.f67795b = view;
            this.f67796c = predicate;
            this.f67797d = observer;
        }

        @Override // io.reactivex.android.MainThreadDisposable
        public void onDispose() {
            this.f67795b.setOnTouchListener(null);
        }

        @Override // android.view.View.OnTouchListener
        public boolean onTouch(View view, MotionEvent motionEvent) {
            if (!isDisposed()) {
                try {
                    if (this.f67796c.test(motionEvent)) {
                        this.f67797d.onNext(motionEvent);
                        return true;
                    }
                    return false;
                } catch (Exception e) {
                    this.f67797d.onError(e);
                    dispose();
                    return false;
                }
            }
            return false;
        }
    }

    public C20662k32(View view, Predicate predicate) {
        this.f67793a = view;
        this.f67794b = predicate;
    }

    @Override // io.reactivex.Observable
    public void subscribeActual(Observer observer) {
        if (!Preconditions.checkMainThread(observer)) {
            return;
        }
        View$OnTouchListenerC11621a view$OnTouchListenerC11621a = new View$OnTouchListenerC11621a(this.f67793a, this.f67794b, observer);
        observer.onSubscribe(view$OnTouchListenerC11621a);
        this.f67793a.setOnTouchListener(view$OnTouchListenerC11621a);
    }
}

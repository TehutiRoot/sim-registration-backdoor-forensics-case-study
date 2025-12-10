package p000;

import android.view.View;
import android.view.ViewTreeObserver;
import com.jakewharton.rxbinding2.internal.Notification;
import com.jakewharton.rxbinding2.internal.Preconditions;
import io.reactivex.Observable;
import io.reactivex.Observer;
import io.reactivex.android.MainThreadDisposable;
import java.util.concurrent.Callable;

/* renamed from: r32  reason: case insensitive filesystem */
/* loaded from: classes5.dex */
public final class C21866r32 extends Observable {

    /* renamed from: a */
    public final View f77153a;

    /* renamed from: b */
    public final Callable f77154b;

    /* renamed from: r32$a */
    /* loaded from: classes5.dex */
    public static final class ViewTreeObserver$OnPreDrawListenerC13228a extends MainThreadDisposable implements ViewTreeObserver.OnPreDrawListener {

        /* renamed from: b */
        public final View f77155b;

        /* renamed from: c */
        public final Callable f77156c;

        /* renamed from: d */
        public final Observer f77157d;

        public ViewTreeObserver$OnPreDrawListenerC13228a(View view, Callable callable, Observer observer) {
            this.f77155b = view;
            this.f77156c = callable;
            this.f77157d = observer;
        }

        @Override // io.reactivex.android.MainThreadDisposable
        public void onDispose() {
            this.f77155b.getViewTreeObserver().removeOnPreDrawListener(this);
        }

        @Override // android.view.ViewTreeObserver.OnPreDrawListener
        public boolean onPreDraw() {
            if (!isDisposed()) {
                this.f77157d.onNext(Notification.INSTANCE);
                try {
                    return ((Boolean) this.f77156c.call()).booleanValue();
                } catch (Exception e) {
                    this.f77157d.onError(e);
                    dispose();
                    return true;
                }
            }
            return true;
        }
    }

    public C21866r32(View view, Callable callable) {
        this.f77153a = view;
        this.f77154b = callable;
    }

    @Override // io.reactivex.Observable
    public void subscribeActual(Observer observer) {
        if (!Preconditions.checkMainThread(observer)) {
            return;
        }
        ViewTreeObserver$OnPreDrawListenerC13228a viewTreeObserver$OnPreDrawListenerC13228a = new ViewTreeObserver$OnPreDrawListenerC13228a(this.f77153a, this.f77154b, observer);
        observer.onSubscribe(viewTreeObserver$OnPreDrawListenerC13228a);
        this.f77153a.getViewTreeObserver().addOnPreDrawListener(viewTreeObserver$OnPreDrawListenerC13228a);
    }
}

package p000;

import android.view.View;
import android.view.ViewTreeObserver;
import com.jakewharton.rxbinding3.internal.Preconditions;
import io.reactivex.Observable;
import io.reactivex.Observer;
import io.reactivex.android.MainThreadDisposable;
import kotlin.Unit;
import kotlin.jvm.internal.Intrinsics;

/* renamed from: l42  reason: case insensitive filesystem */
/* loaded from: classes5.dex */
public final class C20894l42 extends Observable {

    /* renamed from: a */
    public final View f71579a;

    /* renamed from: l42$a */
    /* loaded from: classes5.dex */
    public static final class ViewTreeObserver$OnDrawListenerC12171a extends MainThreadDisposable implements ViewTreeObserver.OnDrawListener {

        /* renamed from: b */
        public final View f71580b;

        /* renamed from: c */
        public final Observer f71581c;

        public ViewTreeObserver$OnDrawListenerC12171a(View view, Observer observer) {
            Intrinsics.checkParameterIsNotNull(view, "view");
            Intrinsics.checkParameterIsNotNull(observer, "observer");
            this.f71580b = view;
            this.f71581c = observer;
        }

        @Override // io.reactivex.android.MainThreadDisposable
        public void onDispose() {
            this.f71580b.getViewTreeObserver().removeOnDrawListener(this);
        }

        @Override // android.view.ViewTreeObserver.OnDrawListener
        public void onDraw() {
            if (!isDisposed()) {
                this.f71581c.onNext(Unit.INSTANCE);
            }
        }
    }

    public C20894l42(View view) {
        Intrinsics.checkParameterIsNotNull(view, "view");
        this.f71579a = view;
    }

    @Override // io.reactivex.Observable
    public void subscribeActual(Observer observer) {
        Intrinsics.checkParameterIsNotNull(observer, "observer");
        if (!Preconditions.checkMainThread(observer)) {
            return;
        }
        ViewTreeObserver$OnDrawListenerC12171a viewTreeObserver$OnDrawListenerC12171a = new ViewTreeObserver$OnDrawListenerC12171a(this.f71579a, observer);
        observer.onSubscribe(viewTreeObserver$OnDrawListenerC12171a);
        this.f71579a.getViewTreeObserver().addOnDrawListener(viewTreeObserver$OnDrawListenerC12171a);
    }
}
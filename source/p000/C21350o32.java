package p000;

import android.view.View;
import android.view.ViewTreeObserver;
import com.jakewharton.rxbinding3.internal.Preconditions;
import io.reactivex.Observable;
import io.reactivex.Observer;
import io.reactivex.android.MainThreadDisposable;
import kotlin.Unit;
import kotlin.jvm.internal.Intrinsics;

/* renamed from: o32  reason: case insensitive filesystem */
/* loaded from: classes5.dex */
public final class C21350o32 extends Observable {

    /* renamed from: a */
    public final View f72548a;

    /* renamed from: o32$a */
    /* loaded from: classes5.dex */
    public static final class ViewTreeObserver$OnDrawListenerC12415a extends MainThreadDisposable implements ViewTreeObserver.OnDrawListener {

        /* renamed from: b */
        public final View f72549b;

        /* renamed from: c */
        public final Observer f72550c;

        public ViewTreeObserver$OnDrawListenerC12415a(View view, Observer observer) {
            Intrinsics.checkParameterIsNotNull(view, "view");
            Intrinsics.checkParameterIsNotNull(observer, "observer");
            this.f72549b = view;
            this.f72550c = observer;
        }

        @Override // io.reactivex.android.MainThreadDisposable
        public void onDispose() {
            this.f72549b.getViewTreeObserver().removeOnDrawListener(this);
        }

        @Override // android.view.ViewTreeObserver.OnDrawListener
        public void onDraw() {
            if (!isDisposed()) {
                this.f72550c.onNext(Unit.INSTANCE);
            }
        }
    }

    public C21350o32(View view) {
        Intrinsics.checkParameterIsNotNull(view, "view");
        this.f72548a = view;
    }

    @Override // io.reactivex.Observable
    public void subscribeActual(Observer observer) {
        Intrinsics.checkParameterIsNotNull(observer, "observer");
        if (!Preconditions.checkMainThread(observer)) {
            return;
        }
        ViewTreeObserver$OnDrawListenerC12415a viewTreeObserver$OnDrawListenerC12415a = new ViewTreeObserver$OnDrawListenerC12415a(this.f72548a, observer);
        observer.onSubscribe(viewTreeObserver$OnDrawListenerC12415a);
        this.f72548a.getViewTreeObserver().addOnDrawListener(viewTreeObserver$OnDrawListenerC12415a);
    }
}

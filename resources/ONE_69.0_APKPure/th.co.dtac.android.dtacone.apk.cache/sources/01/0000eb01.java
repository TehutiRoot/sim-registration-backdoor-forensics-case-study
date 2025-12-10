package p000;

import android.view.View;
import android.view.ViewTreeObserver;
import com.jakewharton.rxbinding3.internal.Preconditions;
import io.reactivex.Observable;
import io.reactivex.Observer;
import io.reactivex.android.MainThreadDisposable;
import kotlin.Unit;
import kotlin.jvm.internal.Intrinsics;

/* renamed from: n42  reason: case insensitive filesystem */
/* loaded from: classes5.dex */
public final class C21240n42 extends Observable {

    /* renamed from: a */
    public final View f72244a;

    /* renamed from: n42$a */
    /* loaded from: classes5.dex */
    public static final class ViewTreeObserver$OnGlobalLayoutListenerC12325a extends MainThreadDisposable implements ViewTreeObserver.OnGlobalLayoutListener {

        /* renamed from: b */
        public final View f72245b;

        /* renamed from: c */
        public final Observer f72246c;

        public ViewTreeObserver$OnGlobalLayoutListenerC12325a(View view, Observer observer) {
            Intrinsics.checkParameterIsNotNull(view, "view");
            Intrinsics.checkParameterIsNotNull(observer, "observer");
            this.f72245b = view;
            this.f72246c = observer;
        }

        @Override // io.reactivex.android.MainThreadDisposable
        public void onDispose() {
            this.f72245b.getViewTreeObserver().removeGlobalOnLayoutListener(this);
        }

        @Override // android.view.ViewTreeObserver.OnGlobalLayoutListener
        public void onGlobalLayout() {
            if (!isDisposed()) {
                this.f72246c.onNext(Unit.INSTANCE);
            }
        }
    }

    public C21240n42(View view) {
        Intrinsics.checkParameterIsNotNull(view, "view");
        this.f72244a = view;
    }

    @Override // io.reactivex.Observable
    public void subscribeActual(Observer observer) {
        Intrinsics.checkParameterIsNotNull(observer, "observer");
        if (!Preconditions.checkMainThread(observer)) {
            return;
        }
        ViewTreeObserver$OnGlobalLayoutListenerC12325a viewTreeObserver$OnGlobalLayoutListenerC12325a = new ViewTreeObserver$OnGlobalLayoutListenerC12325a(this.f72244a, observer);
        observer.onSubscribe(viewTreeObserver$OnGlobalLayoutListenerC12325a);
        this.f72244a.getViewTreeObserver().addOnGlobalLayoutListener(viewTreeObserver$OnGlobalLayoutListenerC12325a);
    }
}
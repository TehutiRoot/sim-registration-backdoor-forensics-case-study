package p000;

import android.view.View;
import android.view.ViewTreeObserver;
import com.jakewharton.rxbinding3.internal.Preconditions;
import io.reactivex.Observable;
import io.reactivex.Observer;
import io.reactivex.android.MainThreadDisposable;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.Intrinsics;

/* renamed from: p42  reason: case insensitive filesystem */
/* loaded from: classes5.dex */
public final class C21586p42 extends Observable {

    /* renamed from: a */
    public final View f76574a;

    /* renamed from: b */
    public final Function0 f76575b;

    /* renamed from: p42$a */
    /* loaded from: classes5.dex */
    public static final class ViewTreeObserver$OnPreDrawListenerC13061a extends MainThreadDisposable implements ViewTreeObserver.OnPreDrawListener {

        /* renamed from: b */
        public final View f76576b;

        /* renamed from: c */
        public final Function0 f76577c;

        /* renamed from: d */
        public final Observer f76578d;

        public ViewTreeObserver$OnPreDrawListenerC13061a(View view, Function0 proceedDrawingPass, Observer observer) {
            Intrinsics.checkParameterIsNotNull(view, "view");
            Intrinsics.checkParameterIsNotNull(proceedDrawingPass, "proceedDrawingPass");
            Intrinsics.checkParameterIsNotNull(observer, "observer");
            this.f76576b = view;
            this.f76577c = proceedDrawingPass;
            this.f76578d = observer;
        }

        @Override // io.reactivex.android.MainThreadDisposable
        public void onDispose() {
            this.f76576b.getViewTreeObserver().removeOnPreDrawListener(this);
        }

        @Override // android.view.ViewTreeObserver.OnPreDrawListener
        public boolean onPreDraw() {
            if (!isDisposed()) {
                this.f76578d.onNext(Unit.INSTANCE);
                try {
                    return ((Boolean) this.f76577c.invoke()).booleanValue();
                } catch (Exception e) {
                    this.f76578d.onError(e);
                    dispose();
                    return true;
                }
            }
            return true;
        }
    }

    public C21586p42(View view, Function0 proceedDrawingPass) {
        Intrinsics.checkParameterIsNotNull(view, "view");
        Intrinsics.checkParameterIsNotNull(proceedDrawingPass, "proceedDrawingPass");
        this.f76574a = view;
        this.f76575b = proceedDrawingPass;
    }

    @Override // io.reactivex.Observable
    public void subscribeActual(Observer observer) {
        Intrinsics.checkParameterIsNotNull(observer, "observer");
        if (!Preconditions.checkMainThread(observer)) {
            return;
        }
        ViewTreeObserver$OnPreDrawListenerC13061a viewTreeObserver$OnPreDrawListenerC13061a = new ViewTreeObserver$OnPreDrawListenerC13061a(this.f76574a, this.f76575b, observer);
        observer.onSubscribe(viewTreeObserver$OnPreDrawListenerC13061a);
        this.f76574a.getViewTreeObserver().addOnPreDrawListener(viewTreeObserver$OnPreDrawListenerC13061a);
    }
}
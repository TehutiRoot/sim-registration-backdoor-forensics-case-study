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

/* renamed from: s32  reason: case insensitive filesystem */
/* loaded from: classes5.dex */
public final class C22038s32 extends Observable {

    /* renamed from: a */
    public final View f79552a;

    /* renamed from: b */
    public final Function0 f79553b;

    /* renamed from: s32$a */
    /* loaded from: classes5.dex */
    public static final class ViewTreeObserver$OnPreDrawListenerC13889a extends MainThreadDisposable implements ViewTreeObserver.OnPreDrawListener {

        /* renamed from: b */
        public final View f79554b;

        /* renamed from: c */
        public final Function0 f79555c;

        /* renamed from: d */
        public final Observer f79556d;

        public ViewTreeObserver$OnPreDrawListenerC13889a(View view, Function0 proceedDrawingPass, Observer observer) {
            Intrinsics.checkParameterIsNotNull(view, "view");
            Intrinsics.checkParameterIsNotNull(proceedDrawingPass, "proceedDrawingPass");
            Intrinsics.checkParameterIsNotNull(observer, "observer");
            this.f79554b = view;
            this.f79555c = proceedDrawingPass;
            this.f79556d = observer;
        }

        @Override // io.reactivex.android.MainThreadDisposable
        public void onDispose() {
            this.f79554b.getViewTreeObserver().removeOnPreDrawListener(this);
        }

        @Override // android.view.ViewTreeObserver.OnPreDrawListener
        public boolean onPreDraw() {
            if (!isDisposed()) {
                this.f79556d.onNext(Unit.INSTANCE);
                try {
                    return ((Boolean) this.f79555c.invoke()).booleanValue();
                } catch (Exception e) {
                    this.f79556d.onError(e);
                    dispose();
                    return true;
                }
            }
            return true;
        }
    }

    public C22038s32(View view, Function0 proceedDrawingPass) {
        Intrinsics.checkParameterIsNotNull(view, "view");
        Intrinsics.checkParameterIsNotNull(proceedDrawingPass, "proceedDrawingPass");
        this.f79552a = view;
        this.f79553b = proceedDrawingPass;
    }

    @Override // io.reactivex.Observable
    public void subscribeActual(Observer observer) {
        Intrinsics.checkParameterIsNotNull(observer, "observer");
        if (!Preconditions.checkMainThread(observer)) {
            return;
        }
        ViewTreeObserver$OnPreDrawListenerC13889a viewTreeObserver$OnPreDrawListenerC13889a = new ViewTreeObserver$OnPreDrawListenerC13889a(this.f79552a, this.f79553b, observer);
        observer.onSubscribe(viewTreeObserver$OnPreDrawListenerC13889a);
        this.f79552a.getViewTreeObserver().addOnPreDrawListener(viewTreeObserver$OnPreDrawListenerC13889a);
    }
}

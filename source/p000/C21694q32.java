package p000;

import android.view.View;
import android.view.ViewTreeObserver;
import com.jakewharton.rxbinding3.internal.Preconditions;
import io.reactivex.Observable;
import io.reactivex.Observer;
import io.reactivex.android.MainThreadDisposable;
import kotlin.Unit;
import kotlin.jvm.internal.Intrinsics;

/* renamed from: q32  reason: case insensitive filesystem */
/* loaded from: classes5.dex */
public final class C21694q32 extends Observable {

    /* renamed from: a */
    public final View f76847a;

    /* renamed from: q32$a */
    /* loaded from: classes5.dex */
    public static final class ViewTreeObserver$OnGlobalLayoutListenerC13157a extends MainThreadDisposable implements ViewTreeObserver.OnGlobalLayoutListener {

        /* renamed from: b */
        public final View f76848b;

        /* renamed from: c */
        public final Observer f76849c;

        public ViewTreeObserver$OnGlobalLayoutListenerC13157a(View view, Observer observer) {
            Intrinsics.checkParameterIsNotNull(view, "view");
            Intrinsics.checkParameterIsNotNull(observer, "observer");
            this.f76848b = view;
            this.f76849c = observer;
        }

        @Override // io.reactivex.android.MainThreadDisposable
        public void onDispose() {
            this.f76848b.getViewTreeObserver().removeGlobalOnLayoutListener(this);
        }

        @Override // android.view.ViewTreeObserver.OnGlobalLayoutListener
        public void onGlobalLayout() {
            if (!isDisposed()) {
                this.f76849c.onNext(Unit.INSTANCE);
            }
        }
    }

    public C21694q32(View view) {
        Intrinsics.checkParameterIsNotNull(view, "view");
        this.f76847a = view;
    }

    @Override // io.reactivex.Observable
    public void subscribeActual(Observer observer) {
        Intrinsics.checkParameterIsNotNull(observer, "observer");
        if (!Preconditions.checkMainThread(observer)) {
            return;
        }
        ViewTreeObserver$OnGlobalLayoutListenerC13157a viewTreeObserver$OnGlobalLayoutListenerC13157a = new ViewTreeObserver$OnGlobalLayoutListenerC13157a(this.f76847a, observer);
        observer.onSubscribe(viewTreeObserver$OnGlobalLayoutListenerC13157a);
        this.f76847a.getViewTreeObserver().addOnGlobalLayoutListener(viewTreeObserver$OnGlobalLayoutListenerC13157a);
    }
}

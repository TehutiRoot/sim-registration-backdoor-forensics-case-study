package p000;

import android.view.View;
import com.jakewharton.rxbinding3.internal.Preconditions;
import io.reactivex.Observable;
import io.reactivex.Observer;
import io.reactivex.android.MainThreadDisposable;
import kotlin.Unit;
import kotlin.jvm.internal.Intrinsics;

/* renamed from: i22  reason: case insensitive filesystem */
/* loaded from: classes5.dex */
public final class C20315i22 extends Observable {

    /* renamed from: a */
    public final View f62696a;

    /* renamed from: b */
    public final boolean f62697b;

    /* renamed from: i22$a */
    /* loaded from: classes5.dex */
    public static final class View$OnAttachStateChangeListenerC10438a extends MainThreadDisposable implements View.OnAttachStateChangeListener {

        /* renamed from: b */
        public final View f62698b;

        /* renamed from: c */
        public final boolean f62699c;

        /* renamed from: d */
        public final Observer f62700d;

        public View$OnAttachStateChangeListenerC10438a(View view, boolean z, Observer observer) {
            Intrinsics.checkParameterIsNotNull(view, "view");
            Intrinsics.checkParameterIsNotNull(observer, "observer");
            this.f62698b = view;
            this.f62699c = z;
            this.f62700d = observer;
        }

        @Override // io.reactivex.android.MainThreadDisposable
        public void onDispose() {
            this.f62698b.removeOnAttachStateChangeListener(this);
        }

        @Override // android.view.View.OnAttachStateChangeListener
        public void onViewAttachedToWindow(View v) {
            Intrinsics.checkParameterIsNotNull(v, "v");
            if (this.f62699c && !isDisposed()) {
                this.f62700d.onNext(Unit.INSTANCE);
            }
        }

        @Override // android.view.View.OnAttachStateChangeListener
        public void onViewDetachedFromWindow(View v) {
            Intrinsics.checkParameterIsNotNull(v, "v");
            if (!this.f62699c && !isDisposed()) {
                this.f62700d.onNext(Unit.INSTANCE);
            }
        }
    }

    public C20315i22(View view, boolean z) {
        Intrinsics.checkParameterIsNotNull(view, "view");
        this.f62696a = view;
        this.f62697b = z;
    }

    @Override // io.reactivex.Observable
    public void subscribeActual(Observer observer) {
        Intrinsics.checkParameterIsNotNull(observer, "observer");
        if (!Preconditions.checkMainThread(observer)) {
            return;
        }
        View$OnAttachStateChangeListenerC10438a view$OnAttachStateChangeListenerC10438a = new View$OnAttachStateChangeListenerC10438a(this.f62696a, this.f62697b, observer);
        observer.onSubscribe(view$OnAttachStateChangeListenerC10438a);
        this.f62696a.addOnAttachStateChangeListener(view$OnAttachStateChangeListenerC10438a);
    }
}

package p000;

import android.view.View;
import com.jakewharton.rxbinding3.internal.Preconditions;
import io.reactivex.Observable;
import io.reactivex.Observer;
import io.reactivex.android.MainThreadDisposable;
import kotlin.Unit;
import kotlin.jvm.internal.Intrinsics;

/* renamed from: f32  reason: case insensitive filesystem */
/* loaded from: classes5.dex */
public final class C19853f32 extends Observable {

    /* renamed from: a */
    public final View f61761a;

    /* renamed from: b */
    public final boolean f61762b;

    /* renamed from: f32$a */
    /* loaded from: classes5.dex */
    public static final class View$OnAttachStateChangeListenerC10194a extends MainThreadDisposable implements View.OnAttachStateChangeListener {

        /* renamed from: b */
        public final View f61763b;

        /* renamed from: c */
        public final boolean f61764c;

        /* renamed from: d */
        public final Observer f61765d;

        public View$OnAttachStateChangeListenerC10194a(View view, boolean z, Observer observer) {
            Intrinsics.checkParameterIsNotNull(view, "view");
            Intrinsics.checkParameterIsNotNull(observer, "observer");
            this.f61763b = view;
            this.f61764c = z;
            this.f61765d = observer;
        }

        @Override // io.reactivex.android.MainThreadDisposable
        public void onDispose() {
            this.f61763b.removeOnAttachStateChangeListener(this);
        }

        @Override // android.view.View.OnAttachStateChangeListener
        public void onViewAttachedToWindow(View v) {
            Intrinsics.checkParameterIsNotNull(v, "v");
            if (this.f61764c && !isDisposed()) {
                this.f61765d.onNext(Unit.INSTANCE);
            }
        }

        @Override // android.view.View.OnAttachStateChangeListener
        public void onViewDetachedFromWindow(View v) {
            Intrinsics.checkParameterIsNotNull(v, "v");
            if (!this.f61764c && !isDisposed()) {
                this.f61765d.onNext(Unit.INSTANCE);
            }
        }
    }

    public C19853f32(View view, boolean z) {
        Intrinsics.checkParameterIsNotNull(view, "view");
        this.f61761a = view;
        this.f61762b = z;
    }

    @Override // io.reactivex.Observable
    public void subscribeActual(Observer observer) {
        Intrinsics.checkParameterIsNotNull(observer, "observer");
        if (!Preconditions.checkMainThread(observer)) {
            return;
        }
        View$OnAttachStateChangeListenerC10194a view$OnAttachStateChangeListenerC10194a = new View$OnAttachStateChangeListenerC10194a(this.f61761a, this.f61762b, observer);
        observer.onSubscribe(view$OnAttachStateChangeListenerC10194a);
        this.f61761a.addOnAttachStateChangeListener(view$OnAttachStateChangeListenerC10194a);
    }
}
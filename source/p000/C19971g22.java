package p000;

import android.view.View;
import com.jakewharton.rxbinding3.internal.Preconditions;
import com.jakewharton.rxbinding3.view.ViewAttachAttachedEvent;
import com.jakewharton.rxbinding3.view.ViewAttachDetachedEvent;
import io.reactivex.Observable;
import io.reactivex.Observer;
import io.reactivex.android.MainThreadDisposable;
import kotlin.jvm.internal.Intrinsics;

/* renamed from: g22  reason: case insensitive filesystem */
/* loaded from: classes5.dex */
public final class C19971g22 extends Observable {

    /* renamed from: a */
    public final View f62027a;

    /* renamed from: g22$a */
    /* loaded from: classes5.dex */
    public static final class View$OnAttachStateChangeListenerC10269a extends MainThreadDisposable implements View.OnAttachStateChangeListener {

        /* renamed from: b */
        public final View f62028b;

        /* renamed from: c */
        public final Observer f62029c;

        public View$OnAttachStateChangeListenerC10269a(View view, Observer observer) {
            Intrinsics.checkParameterIsNotNull(view, "view");
            Intrinsics.checkParameterIsNotNull(observer, "observer");
            this.f62028b = view;
            this.f62029c = observer;
        }

        @Override // io.reactivex.android.MainThreadDisposable
        public void onDispose() {
            this.f62028b.removeOnAttachStateChangeListener(this);
        }

        @Override // android.view.View.OnAttachStateChangeListener
        public void onViewAttachedToWindow(View v) {
            Intrinsics.checkParameterIsNotNull(v, "v");
            if (!isDisposed()) {
                this.f62029c.onNext(new ViewAttachAttachedEvent(this.f62028b));
            }
        }

        @Override // android.view.View.OnAttachStateChangeListener
        public void onViewDetachedFromWindow(View v) {
            Intrinsics.checkParameterIsNotNull(v, "v");
            if (!isDisposed()) {
                this.f62029c.onNext(new ViewAttachDetachedEvent(this.f62028b));
            }
        }
    }

    public C19971g22(View view) {
        Intrinsics.checkParameterIsNotNull(view, "view");
        this.f62027a = view;
    }

    @Override // io.reactivex.Observable
    public void subscribeActual(Observer observer) {
        Intrinsics.checkParameterIsNotNull(observer, "observer");
        if (!Preconditions.checkMainThread(observer)) {
            return;
        }
        View$OnAttachStateChangeListenerC10269a view$OnAttachStateChangeListenerC10269a = new View$OnAttachStateChangeListenerC10269a(this.f62027a, observer);
        observer.onSubscribe(view$OnAttachStateChangeListenerC10269a);
        this.f62027a.addOnAttachStateChangeListener(view$OnAttachStateChangeListenerC10269a);
    }
}

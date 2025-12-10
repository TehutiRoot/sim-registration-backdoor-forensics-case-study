package p000;

import android.view.View;
import com.jakewharton.rxbinding3.internal.Preconditions;
import com.jakewharton.rxbinding3.view.ViewAttachAttachedEvent;
import com.jakewharton.rxbinding3.view.ViewAttachDetachedEvent;
import io.reactivex.Observable;
import io.reactivex.Observer;
import io.reactivex.android.MainThreadDisposable;
import kotlin.jvm.internal.Intrinsics;

/* renamed from: d32  reason: case insensitive filesystem */
/* loaded from: classes5.dex */
public final class C19507d32 extends Observable {

    /* renamed from: a */
    public final View f61075a;

    /* renamed from: d32$a */
    /* loaded from: classes5.dex */
    public static final class View$OnAttachStateChangeListenerC10034a extends MainThreadDisposable implements View.OnAttachStateChangeListener {

        /* renamed from: b */
        public final View f61076b;

        /* renamed from: c */
        public final Observer f61077c;

        public View$OnAttachStateChangeListenerC10034a(View view, Observer observer) {
            Intrinsics.checkParameterIsNotNull(view, "view");
            Intrinsics.checkParameterIsNotNull(observer, "observer");
            this.f61076b = view;
            this.f61077c = observer;
        }

        @Override // io.reactivex.android.MainThreadDisposable
        public void onDispose() {
            this.f61076b.removeOnAttachStateChangeListener(this);
        }

        @Override // android.view.View.OnAttachStateChangeListener
        public void onViewAttachedToWindow(View v) {
            Intrinsics.checkParameterIsNotNull(v, "v");
            if (!isDisposed()) {
                this.f61077c.onNext(new ViewAttachAttachedEvent(this.f61076b));
            }
        }

        @Override // android.view.View.OnAttachStateChangeListener
        public void onViewDetachedFromWindow(View v) {
            Intrinsics.checkParameterIsNotNull(v, "v");
            if (!isDisposed()) {
                this.f61077c.onNext(new ViewAttachDetachedEvent(this.f61076b));
            }
        }
    }

    public C19507d32(View view) {
        Intrinsics.checkParameterIsNotNull(view, "view");
        this.f61075a = view;
    }

    @Override // io.reactivex.Observable
    public void subscribeActual(Observer observer) {
        Intrinsics.checkParameterIsNotNull(observer, "observer");
        if (!Preconditions.checkMainThread(observer)) {
            return;
        }
        View$OnAttachStateChangeListenerC10034a view$OnAttachStateChangeListenerC10034a = new View$OnAttachStateChangeListenerC10034a(this.f61075a, observer);
        observer.onSubscribe(view$OnAttachStateChangeListenerC10034a);
        this.f61075a.addOnAttachStateChangeListener(view$OnAttachStateChangeListenerC10034a);
    }
}
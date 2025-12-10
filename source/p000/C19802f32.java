package p000;

import android.view.View;
import com.jakewharton.rxbinding3.internal.Preconditions;
import com.jakewharton.rxbinding3.view.ViewScrollChangeEvent;
import io.reactivex.Observable;
import io.reactivex.Observer;
import io.reactivex.android.MainThreadDisposable;
import kotlin.jvm.internal.Intrinsics;

/* renamed from: f32  reason: case insensitive filesystem */
/* loaded from: classes5.dex */
public final class C19802f32 extends Observable {

    /* renamed from: a */
    public final View f61704a;

    /* renamed from: f32$a */
    /* loaded from: classes5.dex */
    public static final class View$OnScrollChangeListenerC10200a extends MainThreadDisposable implements View.OnScrollChangeListener {

        /* renamed from: b */
        public final View f61705b;

        /* renamed from: c */
        public final Observer f61706c;

        public View$OnScrollChangeListenerC10200a(View view, Observer observer) {
            Intrinsics.checkParameterIsNotNull(view, "view");
            Intrinsics.checkParameterIsNotNull(observer, "observer");
            this.f61705b = view;
            this.f61706c = observer;
        }

        @Override // io.reactivex.android.MainThreadDisposable
        public void onDispose() {
            this.f61705b.setOnScrollChangeListener(null);
        }

        @Override // android.view.View.OnScrollChangeListener
        public void onScrollChange(View v, int i, int i2, int i3, int i4) {
            Intrinsics.checkParameterIsNotNull(v, "v");
            if (!isDisposed()) {
                this.f61706c.onNext(new ViewScrollChangeEvent(v, i, i2, i3, i4));
            }
        }
    }

    public C19802f32(View view) {
        Intrinsics.checkParameterIsNotNull(view, "view");
        this.f61704a = view;
    }

    @Override // io.reactivex.Observable
    public void subscribeActual(Observer observer) {
        Intrinsics.checkParameterIsNotNull(observer, "observer");
        if (!Preconditions.checkMainThread(observer)) {
            return;
        }
        View$OnScrollChangeListenerC10200a view$OnScrollChangeListenerC10200a = new View$OnScrollChangeListenerC10200a(this.f61704a, observer);
        observer.onSubscribe(view$OnScrollChangeListenerC10200a);
        this.f61704a.setOnScrollChangeListener(AbstractC19286c32.m51716a(view$OnScrollChangeListenerC10200a));
    }
}

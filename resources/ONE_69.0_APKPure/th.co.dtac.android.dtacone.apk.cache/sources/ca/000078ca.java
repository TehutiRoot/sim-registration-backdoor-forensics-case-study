package p000;

import android.view.View;
import com.jakewharton.rxbinding3.internal.Preconditions;
import com.jakewharton.rxbinding3.view.ViewScrollChangeEvent;
import io.reactivex.Observable;
import io.reactivex.Observer;
import io.reactivex.android.MainThreadDisposable;
import kotlin.jvm.internal.Intrinsics;

/* renamed from: c42  reason: case insensitive filesystem */
/* loaded from: classes5.dex */
public final class C19337c42 extends Observable {

    /* renamed from: a */
    public final View f39309a;

    /* renamed from: c42$a */
    /* loaded from: classes5.dex */
    public static final class View$OnScrollChangeListenerC5401a extends MainThreadDisposable implements View.OnScrollChangeListener {

        /* renamed from: b */
        public final View f39310b;

        /* renamed from: c */
        public final Observer f39311c;

        public View$OnScrollChangeListenerC5401a(View view, Observer observer) {
            Intrinsics.checkParameterIsNotNull(view, "view");
            Intrinsics.checkParameterIsNotNull(observer, "observer");
            this.f39310b = view;
            this.f39311c = observer;
        }

        @Override // io.reactivex.android.MainThreadDisposable
        public void onDispose() {
            this.f39310b.setOnScrollChangeListener(null);
        }

        @Override // android.view.View.OnScrollChangeListener
        public void onScrollChange(View v, int i, int i2, int i3, int i4) {
            Intrinsics.checkParameterIsNotNull(v, "v");
            if (!isDisposed()) {
                this.f39311c.onNext(new ViewScrollChangeEvent(v, i, i2, i3, i4));
            }
        }
    }

    public C19337c42(View view) {
        Intrinsics.checkParameterIsNotNull(view, "view");
        this.f39309a = view;
    }

    @Override // io.reactivex.Observable
    public void subscribeActual(Observer observer) {
        Intrinsics.checkParameterIsNotNull(observer, "observer");
        if (!Preconditions.checkMainThread(observer)) {
            return;
        }
        View$OnScrollChangeListenerC5401a view$OnScrollChangeListenerC5401a = new View$OnScrollChangeListenerC5401a(this.f39309a, observer);
        observer.onSubscribe(view$OnScrollChangeListenerC5401a);
        this.f39309a.setOnScrollChangeListener(Z32.m65263a(view$OnScrollChangeListenerC5401a));
    }
}
package p000;

import android.view.View;
import com.jakewharton.rxbinding3.internal.Preconditions;
import io.reactivex.Observable;
import io.reactivex.Observer;
import io.reactivex.android.MainThreadDisposable;
import kotlin.Unit;
import kotlin.jvm.internal.Intrinsics;

/* renamed from: h32  reason: case insensitive filesystem */
/* loaded from: classes5.dex */
public final class C20199h32 extends Observable {

    /* renamed from: a */
    public final View f62359a;

    /* renamed from: h32$a */
    /* loaded from: classes5.dex */
    public static final class View$OnClickListenerC10337a extends MainThreadDisposable implements View.OnClickListener {

        /* renamed from: b */
        public final View f62360b;

        /* renamed from: c */
        public final Observer f62361c;

        public View$OnClickListenerC10337a(View view, Observer observer) {
            Intrinsics.checkParameterIsNotNull(view, "view");
            Intrinsics.checkParameterIsNotNull(observer, "observer");
            this.f62360b = view;
            this.f62361c = observer;
        }

        @Override // android.view.View.OnClickListener
        public void onClick(View v) {
            Intrinsics.checkParameterIsNotNull(v, "v");
            if (!isDisposed()) {
                this.f62361c.onNext(Unit.INSTANCE);
            }
        }

        @Override // io.reactivex.android.MainThreadDisposable
        public void onDispose() {
            this.f62360b.setOnClickListener(null);
        }
    }

    public C20199h32(View view) {
        Intrinsics.checkParameterIsNotNull(view, "view");
        this.f62359a = view;
    }

    @Override // io.reactivex.Observable
    public void subscribeActual(Observer observer) {
        Intrinsics.checkParameterIsNotNull(observer, "observer");
        if (!Preconditions.checkMainThread(observer)) {
            return;
        }
        View$OnClickListenerC10337a view$OnClickListenerC10337a = new View$OnClickListenerC10337a(this.f62359a, observer);
        observer.onSubscribe(view$OnClickListenerC10337a);
        this.f62359a.setOnClickListener(view$OnClickListenerC10337a);
    }
}
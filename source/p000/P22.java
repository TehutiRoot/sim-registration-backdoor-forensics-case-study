package p000;

import android.view.View;
import com.jakewharton.rxbinding3.internal.Preconditions;
import com.jakewharton.rxbinding3.view.ViewLayoutChangeEvent;
import io.reactivex.Observable;
import io.reactivex.Observer;
import io.reactivex.android.MainThreadDisposable;
import kotlin.jvm.internal.Intrinsics;

/* renamed from: P22 */
/* loaded from: classes5.dex */
public final class P22 extends Observable {

    /* renamed from: a */
    public final View f4625a;

    /* renamed from: P22$a */
    /* loaded from: classes5.dex */
    public static final class View$OnLayoutChangeListenerC1070a extends MainThreadDisposable implements View.OnLayoutChangeListener {

        /* renamed from: b */
        public final View f4626b;

        /* renamed from: c */
        public final Observer f4627c;

        public View$OnLayoutChangeListenerC1070a(View view, Observer observer) {
            Intrinsics.checkParameterIsNotNull(view, "view");
            Intrinsics.checkParameterIsNotNull(observer, "observer");
            this.f4626b = view;
            this.f4627c = observer;
        }

        @Override // io.reactivex.android.MainThreadDisposable
        public void onDispose() {
            this.f4626b.removeOnLayoutChangeListener(this);
        }

        @Override // android.view.View.OnLayoutChangeListener
        public void onLayoutChange(View v, int i, int i2, int i3, int i4, int i5, int i6, int i7, int i8) {
            Intrinsics.checkParameterIsNotNull(v, "v");
            if (!isDisposed()) {
                this.f4627c.onNext(new ViewLayoutChangeEvent(v, i, i2, i3, i4, i5, i6, i7, i8));
            }
        }
    }

    public P22(View view) {
        Intrinsics.checkParameterIsNotNull(view, "view");
        this.f4625a = view;
    }

    @Override // io.reactivex.Observable
    public void subscribeActual(Observer observer) {
        Intrinsics.checkParameterIsNotNull(observer, "observer");
        if (!Preconditions.checkMainThread(observer)) {
            return;
        }
        View$OnLayoutChangeListenerC1070a view$OnLayoutChangeListenerC1070a = new View$OnLayoutChangeListenerC1070a(this.f4625a, observer);
        observer.onSubscribe(view$OnLayoutChangeListenerC1070a);
        this.f4625a.addOnLayoutChangeListener(view$OnLayoutChangeListenerC1070a);
    }
}

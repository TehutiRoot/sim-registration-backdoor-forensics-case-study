package p000;

import android.view.View;
import com.jakewharton.rxbinding3.internal.Preconditions;
import io.reactivex.Observable;
import io.reactivex.Observer;
import io.reactivex.android.MainThreadDisposable;
import kotlin.Unit;
import kotlin.jvm.internal.Intrinsics;

/* renamed from: R22 */
/* loaded from: classes5.dex */
public final class R22 extends Observable {

    /* renamed from: a */
    public final View f5252a;

    /* renamed from: R22$a */
    /* loaded from: classes5.dex */
    public static final class View$OnLayoutChangeListenerC1217a extends MainThreadDisposable implements View.OnLayoutChangeListener {

        /* renamed from: b */
        public final View f5253b;

        /* renamed from: c */
        public final Observer f5254c;

        public View$OnLayoutChangeListenerC1217a(View view, Observer observer) {
            Intrinsics.checkParameterIsNotNull(view, "view");
            Intrinsics.checkParameterIsNotNull(observer, "observer");
            this.f5253b = view;
            this.f5254c = observer;
        }

        @Override // io.reactivex.android.MainThreadDisposable
        public void onDispose() {
            this.f5253b.removeOnLayoutChangeListener(this);
        }

        @Override // android.view.View.OnLayoutChangeListener
        public void onLayoutChange(View v, int i, int i2, int i3, int i4, int i5, int i6, int i7, int i8) {
            Intrinsics.checkParameterIsNotNull(v, "v");
            if (!isDisposed()) {
                this.f5254c.onNext(Unit.INSTANCE);
            }
        }
    }

    public R22(View view) {
        Intrinsics.checkParameterIsNotNull(view, "view");
        this.f5252a = view;
    }

    @Override // io.reactivex.Observable
    public void subscribeActual(Observer observer) {
        Intrinsics.checkParameterIsNotNull(observer, "observer");
        if (!Preconditions.checkMainThread(observer)) {
            return;
        }
        View$OnLayoutChangeListenerC1217a view$OnLayoutChangeListenerC1217a = new View$OnLayoutChangeListenerC1217a(this.f5252a, observer);
        observer.onSubscribe(view$OnLayoutChangeListenerC1217a);
        this.f5252a.addOnLayoutChangeListener(view$OnLayoutChangeListenerC1217a);
    }
}

package p000;

import android.view.View;
import com.jakewharton.rxbinding3.internal.Preconditions;
import io.reactivex.Observable;
import io.reactivex.Observer;
import io.reactivex.android.MainThreadDisposable;
import kotlin.Unit;
import kotlin.jvm.internal.Intrinsics;

/* renamed from: O32 */
/* loaded from: classes5.dex */
public final class O32 extends Observable {

    /* renamed from: a */
    public final View f4352a;

    /* renamed from: O32$a */
    /* loaded from: classes5.dex */
    public static final class View$OnLayoutChangeListenerC0977a extends MainThreadDisposable implements View.OnLayoutChangeListener {

        /* renamed from: b */
        public final View f4353b;

        /* renamed from: c */
        public final Observer f4354c;

        public View$OnLayoutChangeListenerC0977a(View view, Observer observer) {
            Intrinsics.checkParameterIsNotNull(view, "view");
            Intrinsics.checkParameterIsNotNull(observer, "observer");
            this.f4353b = view;
            this.f4354c = observer;
        }

        @Override // io.reactivex.android.MainThreadDisposable
        public void onDispose() {
            this.f4353b.removeOnLayoutChangeListener(this);
        }

        @Override // android.view.View.OnLayoutChangeListener
        public void onLayoutChange(View v, int i, int i2, int i3, int i4, int i5, int i6, int i7, int i8) {
            Intrinsics.checkParameterIsNotNull(v, "v");
            if (!isDisposed()) {
                this.f4354c.onNext(Unit.INSTANCE);
            }
        }
    }

    public O32(View view) {
        Intrinsics.checkParameterIsNotNull(view, "view");
        this.f4352a = view;
    }

    @Override // io.reactivex.Observable
    public void subscribeActual(Observer observer) {
        Intrinsics.checkParameterIsNotNull(observer, "observer");
        if (!Preconditions.checkMainThread(observer)) {
            return;
        }
        View$OnLayoutChangeListenerC0977a view$OnLayoutChangeListenerC0977a = new View$OnLayoutChangeListenerC0977a(this.f4352a, observer);
        observer.onSubscribe(view$OnLayoutChangeListenerC0977a);
        this.f4352a.addOnLayoutChangeListener(view$OnLayoutChangeListenerC0977a);
    }
}
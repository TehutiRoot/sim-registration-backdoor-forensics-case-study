package p000;

import android.view.View;
import com.jakewharton.rxbinding3.internal.Preconditions;
import com.jakewharton.rxbinding3.view.ViewLayoutChangeEvent;
import io.reactivex.Observable;
import io.reactivex.Observer;
import io.reactivex.android.MainThreadDisposable;
import kotlin.jvm.internal.Intrinsics;

/* renamed from: M32 */
/* loaded from: classes5.dex */
public final class M32 extends Observable {

    /* renamed from: a */
    public final View f3796a;

    /* renamed from: M32$a */
    /* loaded from: classes5.dex */
    public static final class View$OnLayoutChangeListenerC0840a extends MainThreadDisposable implements View.OnLayoutChangeListener {

        /* renamed from: b */
        public final View f3797b;

        /* renamed from: c */
        public final Observer f3798c;

        public View$OnLayoutChangeListenerC0840a(View view, Observer observer) {
            Intrinsics.checkParameterIsNotNull(view, "view");
            Intrinsics.checkParameterIsNotNull(observer, "observer");
            this.f3797b = view;
            this.f3798c = observer;
        }

        @Override // io.reactivex.android.MainThreadDisposable
        public void onDispose() {
            this.f3797b.removeOnLayoutChangeListener(this);
        }

        @Override // android.view.View.OnLayoutChangeListener
        public void onLayoutChange(View v, int i, int i2, int i3, int i4, int i5, int i6, int i7, int i8) {
            Intrinsics.checkParameterIsNotNull(v, "v");
            if (!isDisposed()) {
                this.f3798c.onNext(new ViewLayoutChangeEvent(v, i, i2, i3, i4, i5, i6, i7, i8));
            }
        }
    }

    public M32(View view) {
        Intrinsics.checkParameterIsNotNull(view, "view");
        this.f3796a = view;
    }

    @Override // io.reactivex.Observable
    public void subscribeActual(Observer observer) {
        Intrinsics.checkParameterIsNotNull(observer, "observer");
        if (!Preconditions.checkMainThread(observer)) {
            return;
        }
        View$OnLayoutChangeListenerC0840a view$OnLayoutChangeListenerC0840a = new View$OnLayoutChangeListenerC0840a(this.f3796a, observer);
        observer.onSubscribe(view$OnLayoutChangeListenerC0840a);
        this.f3796a.addOnLayoutChangeListener(view$OnLayoutChangeListenerC0840a);
    }
}
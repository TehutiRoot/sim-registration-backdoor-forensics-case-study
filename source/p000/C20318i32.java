package p000;

import android.view.View;
import com.jakewharton.rxbinding3.internal.Preconditions;
import io.reactivex.Observable;
import io.reactivex.Observer;
import io.reactivex.android.MainThreadDisposable;
import kotlin.jvm.internal.Intrinsics;

/* renamed from: i32  reason: case insensitive filesystem */
/* loaded from: classes5.dex */
public final class C20318i32 extends Observable {

    /* renamed from: a */
    public final View f62702a;

    /* renamed from: i32$a */
    /* loaded from: classes5.dex */
    public static final class View$OnSystemUiVisibilityChangeListenerC10440a extends MainThreadDisposable implements View.OnSystemUiVisibilityChangeListener {

        /* renamed from: b */
        public final View f62703b;

        /* renamed from: c */
        public final Observer f62704c;

        public View$OnSystemUiVisibilityChangeListenerC10440a(View view, Observer observer) {
            Intrinsics.checkParameterIsNotNull(view, "view");
            Intrinsics.checkParameterIsNotNull(observer, "observer");
            this.f62703b = view;
            this.f62704c = observer;
        }

        @Override // io.reactivex.android.MainThreadDisposable
        public void onDispose() {
            this.f62703b.setOnSystemUiVisibilityChangeListener(null);
        }

        @Override // android.view.View.OnSystemUiVisibilityChangeListener
        public void onSystemUiVisibilityChange(int i) {
            if (!isDisposed()) {
                this.f62704c.onNext(Integer.valueOf(i));
            }
        }
    }

    public C20318i32(View view) {
        Intrinsics.checkParameterIsNotNull(view, "view");
        this.f62702a = view;
    }

    @Override // io.reactivex.Observable
    public void subscribeActual(Observer observer) {
        Intrinsics.checkParameterIsNotNull(observer, "observer");
        if (!Preconditions.checkMainThread(observer)) {
            return;
        }
        View$OnSystemUiVisibilityChangeListenerC10440a view$OnSystemUiVisibilityChangeListenerC10440a = new View$OnSystemUiVisibilityChangeListenerC10440a(this.f62702a, observer);
        observer.onSubscribe(view$OnSystemUiVisibilityChangeListenerC10440a);
        this.f62702a.setOnSystemUiVisibilityChangeListener(view$OnSystemUiVisibilityChangeListenerC10440a);
    }
}

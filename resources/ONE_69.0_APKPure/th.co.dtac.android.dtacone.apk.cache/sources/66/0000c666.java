package p000;

import android.view.View;
import com.jakewharton.rxbinding3.internal.Preconditions;
import io.reactivex.Observable;
import io.reactivex.Observer;
import io.reactivex.android.MainThreadDisposable;
import kotlin.jvm.internal.Intrinsics;

/* renamed from: f42  reason: case insensitive filesystem */
/* loaded from: classes5.dex */
public final class C19856f42 extends Observable {

    /* renamed from: a */
    public final View f61771a;

    /* renamed from: f42$a */
    /* loaded from: classes5.dex */
    public static final class View$OnSystemUiVisibilityChangeListenerC10196a extends MainThreadDisposable implements View.OnSystemUiVisibilityChangeListener {

        /* renamed from: b */
        public final View f61772b;

        /* renamed from: c */
        public final Observer f61773c;

        public View$OnSystemUiVisibilityChangeListenerC10196a(View view, Observer observer) {
            Intrinsics.checkParameterIsNotNull(view, "view");
            Intrinsics.checkParameterIsNotNull(observer, "observer");
            this.f61772b = view;
            this.f61773c = observer;
        }

        @Override // io.reactivex.android.MainThreadDisposable
        public void onDispose() {
            this.f61772b.setOnSystemUiVisibilityChangeListener(null);
        }

        @Override // android.view.View.OnSystemUiVisibilityChangeListener
        public void onSystemUiVisibilityChange(int i) {
            if (!isDisposed()) {
                this.f61773c.onNext(Integer.valueOf(i));
            }
        }
    }

    public C19856f42(View view) {
        Intrinsics.checkParameterIsNotNull(view, "view");
        this.f61771a = view;
    }

    @Override // io.reactivex.Observable
    public void subscribeActual(Observer observer) {
        Intrinsics.checkParameterIsNotNull(observer, "observer");
        if (!Preconditions.checkMainThread(observer)) {
            return;
        }
        View$OnSystemUiVisibilityChangeListenerC10196a view$OnSystemUiVisibilityChangeListenerC10196a = new View$OnSystemUiVisibilityChangeListenerC10196a(this.f61771a, observer);
        observer.onSubscribe(view$OnSystemUiVisibilityChangeListenerC10196a);
        this.f61771a.setOnSystemUiVisibilityChangeListener(view$OnSystemUiVisibilityChangeListenerC10196a);
    }
}
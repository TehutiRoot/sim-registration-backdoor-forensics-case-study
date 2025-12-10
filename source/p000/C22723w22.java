package p000;

import android.view.View;
import com.jakewharton.rxbinding3.InitialValueObservable;
import io.reactivex.Observer;
import io.reactivex.android.MainThreadDisposable;
import kotlin.jvm.internal.Intrinsics;

/* renamed from: w22  reason: case insensitive filesystem */
/* loaded from: classes5.dex */
public final class C22723w22 extends InitialValueObservable {

    /* renamed from: a */
    public final View f107885a;

    /* renamed from: w22$a */
    /* loaded from: classes5.dex */
    public static final class View$OnFocusChangeListenerC16941a extends MainThreadDisposable implements View.OnFocusChangeListener {

        /* renamed from: b */
        public final View f107886b;

        /* renamed from: c */
        public final Observer f107887c;

        public View$OnFocusChangeListenerC16941a(View view, Observer observer) {
            Intrinsics.checkParameterIsNotNull(view, "view");
            Intrinsics.checkParameterIsNotNull(observer, "observer");
            this.f107886b = view;
            this.f107887c = observer;
        }

        @Override // io.reactivex.android.MainThreadDisposable
        public void onDispose() {
            this.f107886b.setOnFocusChangeListener(null);
        }

        @Override // android.view.View.OnFocusChangeListener
        public void onFocusChange(View v, boolean z) {
            Intrinsics.checkParameterIsNotNull(v, "v");
            if (!isDisposed()) {
                this.f107887c.onNext(Boolean.valueOf(z));
            }
        }
    }

    public C22723w22(View view) {
        Intrinsics.checkParameterIsNotNull(view, "view");
        this.f107885a = view;
    }

    @Override // com.jakewharton.rxbinding3.InitialValueObservable
    /* renamed from: d */
    public Boolean getInitialValue() {
        return Boolean.valueOf(this.f107885a.hasFocus());
    }

    @Override // com.jakewharton.rxbinding3.InitialValueObservable
    public void subscribeListener(Observer observer) {
        Intrinsics.checkParameterIsNotNull(observer, "observer");
        View$OnFocusChangeListenerC16941a view$OnFocusChangeListenerC16941a = new View$OnFocusChangeListenerC16941a(this.f107885a, observer);
        observer.onSubscribe(view$OnFocusChangeListenerC16941a);
        this.f107885a.setOnFocusChangeListener(view$OnFocusChangeListenerC16941a);
    }
}

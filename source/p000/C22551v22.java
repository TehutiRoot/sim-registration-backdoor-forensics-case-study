package p000;

import android.view.View;
import com.jakewharton.rxbinding2.InitialValueObservable;
import io.reactivex.Observer;
import io.reactivex.android.MainThreadDisposable;

/* renamed from: v22  reason: case insensitive filesystem */
/* loaded from: classes5.dex */
public final class C22551v22 extends InitialValueObservable {

    /* renamed from: a */
    public final View f107555a;

    /* renamed from: v22$a */
    /* loaded from: classes5.dex */
    public static final class View$OnFocusChangeListenerC16867a extends MainThreadDisposable implements View.OnFocusChangeListener {

        /* renamed from: b */
        public final View f107556b;

        /* renamed from: c */
        public final Observer f107557c;

        public View$OnFocusChangeListenerC16867a(View view, Observer observer) {
            this.f107556b = view;
            this.f107557c = observer;
        }

        @Override // io.reactivex.android.MainThreadDisposable
        public void onDispose() {
            this.f107556b.setOnFocusChangeListener(null);
        }

        @Override // android.view.View.OnFocusChangeListener
        public void onFocusChange(View view, boolean z) {
            if (!isDisposed()) {
                this.f107557c.onNext(Boolean.valueOf(z));
            }
        }
    }

    public C22551v22(View view) {
        this.f107555a = view;
    }

    @Override // com.jakewharton.rxbinding2.InitialValueObservable
    /* renamed from: d */
    public Boolean getInitialValue() {
        return Boolean.valueOf(this.f107555a.hasFocus());
    }

    @Override // com.jakewharton.rxbinding2.InitialValueObservable
    public void subscribeListener(Observer observer) {
        View$OnFocusChangeListenerC16867a view$OnFocusChangeListenerC16867a = new View$OnFocusChangeListenerC16867a(this.f107555a, observer);
        observer.onSubscribe(view$OnFocusChangeListenerC16867a);
        this.f107555a.setOnFocusChangeListener(view$OnFocusChangeListenerC16867a);
    }
}

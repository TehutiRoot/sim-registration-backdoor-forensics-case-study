package p000;

import android.view.View;
import com.jakewharton.rxbinding3.InitialValueObservable;
import io.reactivex.Observer;
import io.reactivex.android.MainThreadDisposable;
import kotlin.jvm.internal.Intrinsics;

/* renamed from: t32  reason: case insensitive filesystem */
/* loaded from: classes5.dex */
public final class C22275t32 extends InitialValueObservable {

    /* renamed from: a */
    public final View f80078a;

    /* renamed from: t32$a */
    /* loaded from: classes5.dex */
    public static final class View$OnFocusChangeListenerC13957a extends MainThreadDisposable implements View.OnFocusChangeListener {

        /* renamed from: b */
        public final View f80079b;

        /* renamed from: c */
        public final Observer f80080c;

        public View$OnFocusChangeListenerC13957a(View view, Observer observer) {
            Intrinsics.checkParameterIsNotNull(view, "view");
            Intrinsics.checkParameterIsNotNull(observer, "observer");
            this.f80079b = view;
            this.f80080c = observer;
        }

        @Override // io.reactivex.android.MainThreadDisposable
        public void onDispose() {
            this.f80079b.setOnFocusChangeListener(null);
        }

        @Override // android.view.View.OnFocusChangeListener
        public void onFocusChange(View v, boolean z) {
            Intrinsics.checkParameterIsNotNull(v, "v");
            if (!isDisposed()) {
                this.f80080c.onNext(Boolean.valueOf(z));
            }
        }
    }

    public C22275t32(View view) {
        Intrinsics.checkParameterIsNotNull(view, "view");
        this.f80078a = view;
    }

    @Override // com.jakewharton.rxbinding3.InitialValueObservable
    /* renamed from: d */
    public Boolean getInitialValue() {
        return Boolean.valueOf(this.f80078a.hasFocus());
    }

    @Override // com.jakewharton.rxbinding3.InitialValueObservable
    public void subscribeListener(Observer observer) {
        Intrinsics.checkParameterIsNotNull(observer, "observer");
        View$OnFocusChangeListenerC13957a view$OnFocusChangeListenerC13957a = new View$OnFocusChangeListenerC13957a(this.f80078a, observer);
        observer.onSubscribe(view$OnFocusChangeListenerC13957a);
        this.f80078a.setOnFocusChangeListener(view$OnFocusChangeListenerC13957a);
    }
}
package p000;

import android.text.Editable;
import android.text.TextWatcher;
import android.widget.TextView;
import com.jakewharton.rxbinding3.InitialValueObservable;
import io.reactivex.Observer;
import io.reactivex.android.MainThreadDisposable;
import kotlin.jvm.internal.Intrinsics;

/* renamed from: CS1 */
/* loaded from: classes5.dex */
public final class CS1 extends InitialValueObservable {

    /* renamed from: a */
    public final TextView f742a;

    /* renamed from: CS1$a */
    /* loaded from: classes5.dex */
    public static final class C0181a extends MainThreadDisposable implements TextWatcher {

        /* renamed from: b */
        public final TextView f743b;

        /* renamed from: c */
        public final Observer f744c;

        public C0181a(TextView view, Observer observer) {
            Intrinsics.checkParameterIsNotNull(view, "view");
            Intrinsics.checkParameterIsNotNull(observer, "observer");
            this.f743b = view;
            this.f744c = observer;
        }

        @Override // android.text.TextWatcher
        public void afterTextChanged(Editable s) {
            Intrinsics.checkParameterIsNotNull(s, "s");
        }

        @Override // android.text.TextWatcher
        public void beforeTextChanged(CharSequence s, int i, int i2, int i3) {
            Intrinsics.checkParameterIsNotNull(s, "s");
        }

        @Override // io.reactivex.android.MainThreadDisposable
        public void onDispose() {
            this.f743b.removeTextChangedListener(this);
        }

        @Override // android.text.TextWatcher
        public void onTextChanged(CharSequence s, int i, int i2, int i3) {
            Intrinsics.checkParameterIsNotNull(s, "s");
            if (!isDisposed()) {
                this.f744c.onNext(s);
            }
        }
    }

    public CS1(TextView view) {
        Intrinsics.checkParameterIsNotNull(view, "view");
        this.f742a = view;
    }

    @Override // com.jakewharton.rxbinding3.InitialValueObservable
    /* renamed from: d */
    public CharSequence getInitialValue() {
        return this.f742a.getText();
    }

    @Override // com.jakewharton.rxbinding3.InitialValueObservable
    public void subscribeListener(Observer observer) {
        Intrinsics.checkParameterIsNotNull(observer, "observer");
        C0181a c0181a = new C0181a(this.f742a, observer);
        observer.onSubscribe(c0181a);
        this.f742a.addTextChangedListener(c0181a);
    }
}

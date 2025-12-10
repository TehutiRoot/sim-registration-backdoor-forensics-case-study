package p000;

import android.text.Editable;
import android.text.TextWatcher;
import android.widget.TextView;
import com.jakewharton.rxbinding2.InitialValueObservable;
import io.reactivex.Observer;
import io.reactivex.android.MainThreadDisposable;

/* renamed from: AT1 */
/* loaded from: classes5.dex */
public final class AT1 extends InitialValueObservable {

    /* renamed from: a */
    public final TextView f105a;

    public AT1(TextView textView) {
        this.f105a = textView;
    }

    @Override // com.jakewharton.rxbinding2.InitialValueObservable
    /* renamed from: d */
    public CharSequence getInitialValue() {
        return this.f105a.getText();
    }

    @Override // com.jakewharton.rxbinding2.InitialValueObservable
    public void subscribeListener(Observer observer) {
        C0031a c0031a = new C0031a(this.f105a, observer);
        observer.onSubscribe(c0031a);
        this.f105a.addTextChangedListener(c0031a);
    }

    /* renamed from: AT1$a */
    /* loaded from: classes5.dex */
    public static final class C0031a extends MainThreadDisposable implements TextWatcher {

        /* renamed from: b */
        public final TextView f106b;

        /* renamed from: c */
        public final Observer f107c;

        public C0031a(TextView textView, Observer observer) {
            this.f106b = textView;
            this.f107c = observer;
        }

        @Override // io.reactivex.android.MainThreadDisposable
        public void onDispose() {
            this.f106b.removeTextChangedListener(this);
        }

        @Override // android.text.TextWatcher
        public void onTextChanged(CharSequence charSequence, int i, int i2, int i3) {
            if (!isDisposed()) {
                this.f107c.onNext(charSequence);
            }
        }

        @Override // android.text.TextWatcher
        public void afterTextChanged(Editable editable) {
        }

        @Override // android.text.TextWatcher
        public void beforeTextChanged(CharSequence charSequence, int i, int i2, int i3) {
        }
    }
}
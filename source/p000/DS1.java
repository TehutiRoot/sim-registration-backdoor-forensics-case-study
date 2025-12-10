package p000;

import android.text.Editable;
import android.text.TextWatcher;
import android.widget.TextView;
import com.jakewharton.rxbinding2.InitialValueObservable;
import io.reactivex.Observer;
import io.reactivex.android.MainThreadDisposable;

/* renamed from: DS1 */
/* loaded from: classes5.dex */
public final class DS1 extends InitialValueObservable {

    /* renamed from: a */
    public final TextView f999a;

    public DS1(TextView textView) {
        this.f999a = textView;
    }

    @Override // com.jakewharton.rxbinding2.InitialValueObservable
    /* renamed from: d */
    public CharSequence getInitialValue() {
        return this.f999a.getText();
    }

    @Override // com.jakewharton.rxbinding2.InitialValueObservable
    public void subscribeListener(Observer observer) {
        C0251a c0251a = new C0251a(this.f999a, observer);
        observer.onSubscribe(c0251a);
        this.f999a.addTextChangedListener(c0251a);
    }

    /* renamed from: DS1$a */
    /* loaded from: classes5.dex */
    public static final class C0251a extends MainThreadDisposable implements TextWatcher {

        /* renamed from: b */
        public final TextView f1000b;

        /* renamed from: c */
        public final Observer f1001c;

        public C0251a(TextView textView, Observer observer) {
            this.f1000b = textView;
            this.f1001c = observer;
        }

        @Override // io.reactivex.android.MainThreadDisposable
        public void onDispose() {
            this.f1000b.removeTextChangedListener(this);
        }

        @Override // android.text.TextWatcher
        public void onTextChanged(CharSequence charSequence, int i, int i2, int i3) {
            if (!isDisposed()) {
                this.f1001c.onNext(charSequence);
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

package p000;

import android.text.Editable;
import android.text.TextWatcher;
import android.widget.TextView;
import com.jakewharton.rxbinding2.InitialValueObservable;
import com.jakewharton.rxbinding2.widget.TextViewTextChangeEvent;
import io.reactivex.Observer;
import io.reactivex.android.MainThreadDisposable;

/* renamed from: AS1 */
/* loaded from: classes5.dex */
public final class AS1 extends InitialValueObservable {

    /* renamed from: a */
    public final TextView f107a;

    public AS1(TextView textView) {
        this.f107a = textView;
    }

    @Override // com.jakewharton.rxbinding2.InitialValueObservable
    /* renamed from: d */
    public TextViewTextChangeEvent getInitialValue() {
        TextView textView = this.f107a;
        return TextViewTextChangeEvent.create(textView, textView.getText(), 0, 0, 0);
    }

    @Override // com.jakewharton.rxbinding2.InitialValueObservable
    public void subscribeListener(Observer observer) {
        C0032a c0032a = new C0032a(this.f107a, observer);
        observer.onSubscribe(c0032a);
        this.f107a.addTextChangedListener(c0032a);
    }

    /* renamed from: AS1$a */
    /* loaded from: classes5.dex */
    public static final class C0032a extends MainThreadDisposable implements TextWatcher {

        /* renamed from: b */
        public final TextView f108b;

        /* renamed from: c */
        public final Observer f109c;

        public C0032a(TextView textView, Observer observer) {
            this.f108b = textView;
            this.f109c = observer;
        }

        @Override // io.reactivex.android.MainThreadDisposable
        public void onDispose() {
            this.f108b.removeTextChangedListener(this);
        }

        @Override // android.text.TextWatcher
        public void onTextChanged(CharSequence charSequence, int i, int i2, int i3) {
            if (!isDisposed()) {
                this.f109c.onNext(TextViewTextChangeEvent.create(this.f108b, charSequence, i, i2, i3));
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

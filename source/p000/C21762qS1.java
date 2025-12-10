package p000;

import android.text.Editable;
import android.text.TextWatcher;
import android.widget.TextView;
import com.jakewharton.rxbinding2.InitialValueObservable;
import com.jakewharton.rxbinding2.widget.TextViewAfterTextChangeEvent;
import io.reactivex.Observer;
import io.reactivex.android.MainThreadDisposable;

/* renamed from: qS1  reason: case insensitive filesystem */
/* loaded from: classes5.dex */
public final class C21762qS1 extends InitialValueObservable {

    /* renamed from: a */
    public final TextView f76975a;

    public C21762qS1(TextView textView) {
        this.f76975a = textView;
    }

    @Override // com.jakewharton.rxbinding2.InitialValueObservable
    /* renamed from: d */
    public TextViewAfterTextChangeEvent getInitialValue() {
        TextView textView = this.f76975a;
        return TextViewAfterTextChangeEvent.create(textView, textView.getEditableText());
    }

    @Override // com.jakewharton.rxbinding2.InitialValueObservable
    public void subscribeListener(Observer observer) {
        C13184a c13184a = new C13184a(this.f76975a, observer);
        observer.onSubscribe(c13184a);
        this.f76975a.addTextChangedListener(c13184a);
    }

    /* renamed from: qS1$a */
    /* loaded from: classes5.dex */
    public static final class C13184a extends MainThreadDisposable implements TextWatcher {

        /* renamed from: b */
        public final TextView f76976b;

        /* renamed from: c */
        public final Observer f76977c;

        public C13184a(TextView textView, Observer observer) {
            this.f76976b = textView;
            this.f76977c = observer;
        }

        @Override // android.text.TextWatcher
        public void afterTextChanged(Editable editable) {
            this.f76977c.onNext(TextViewAfterTextChangeEvent.create(this.f76976b, editable));
        }

        @Override // io.reactivex.android.MainThreadDisposable
        public void onDispose() {
            this.f76976b.removeTextChangedListener(this);
        }

        @Override // android.text.TextWatcher
        public void beforeTextChanged(CharSequence charSequence, int i, int i2, int i3) {
        }

        @Override // android.text.TextWatcher
        public void onTextChanged(CharSequence charSequence, int i, int i2, int i3) {
        }
    }
}

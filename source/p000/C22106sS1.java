package p000;

import android.text.Editable;
import android.text.TextWatcher;
import android.widget.TextView;
import com.jakewharton.rxbinding2.InitialValueObservable;
import com.jakewharton.rxbinding2.widget.TextViewBeforeTextChangeEvent;
import io.reactivex.Observer;
import io.reactivex.android.MainThreadDisposable;

/* renamed from: sS1  reason: case insensitive filesystem */
/* loaded from: classes5.dex */
public final class C22106sS1 extends InitialValueObservable {

    /* renamed from: a */
    public final TextView f79790a;

    public C22106sS1(TextView textView) {
        this.f79790a = textView;
    }

    @Override // com.jakewharton.rxbinding2.InitialValueObservable
    /* renamed from: d */
    public TextViewBeforeTextChangeEvent getInitialValue() {
        TextView textView = this.f79790a;
        return TextViewBeforeTextChangeEvent.create(textView, textView.getText(), 0, 0, 0);
    }

    @Override // com.jakewharton.rxbinding2.InitialValueObservable
    public void subscribeListener(Observer observer) {
        C13925a c13925a = new C13925a(this.f79790a, observer);
        observer.onSubscribe(c13925a);
        this.f79790a.addTextChangedListener(c13925a);
    }

    /* renamed from: sS1$a */
    /* loaded from: classes5.dex */
    public static final class C13925a extends MainThreadDisposable implements TextWatcher {

        /* renamed from: b */
        public final TextView f79791b;

        /* renamed from: c */
        public final Observer f79792c;

        public C13925a(TextView textView, Observer observer) {
            this.f79791b = textView;
            this.f79792c = observer;
        }

        @Override // android.text.TextWatcher
        public void beforeTextChanged(CharSequence charSequence, int i, int i2, int i3) {
            if (!isDisposed()) {
                this.f79792c.onNext(TextViewBeforeTextChangeEvent.create(this.f79791b, charSequence, i, i2, i3));
            }
        }

        @Override // io.reactivex.android.MainThreadDisposable
        public void onDispose() {
            this.f79791b.removeTextChangedListener(this);
        }

        @Override // android.text.TextWatcher
        public void afterTextChanged(Editable editable) {
        }

        @Override // android.text.TextWatcher
        public void onTextChanged(CharSequence charSequence, int i, int i2, int i3) {
        }
    }
}

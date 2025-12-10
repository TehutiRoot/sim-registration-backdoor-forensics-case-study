package p000;

import android.text.Editable;
import android.text.TextWatcher;
import android.widget.TextView;
import com.jakewharton.rxbinding3.InitialValueObservable;
import com.jakewharton.rxbinding3.widget.TextViewBeforeTextChangeEvent;
import io.reactivex.Observer;
import io.reactivex.android.MainThreadDisposable;
import kotlin.jvm.internal.Intrinsics;

/* renamed from: tS1  reason: case insensitive filesystem */
/* loaded from: classes5.dex */
public final class C22278tS1 extends InitialValueObservable {

    /* renamed from: a */
    public final TextView f80121a;

    /* renamed from: tS1$a */
    /* loaded from: classes5.dex */
    public static final class C14000a extends MainThreadDisposable implements TextWatcher {

        /* renamed from: b */
        public final TextView f80122b;

        /* renamed from: c */
        public final Observer f80123c;

        public C14000a(TextView view, Observer observer) {
            Intrinsics.checkParameterIsNotNull(view, "view");
            Intrinsics.checkParameterIsNotNull(observer, "observer");
            this.f80122b = view;
            this.f80123c = observer;
        }

        @Override // android.text.TextWatcher
        public void afterTextChanged(Editable s) {
            Intrinsics.checkParameterIsNotNull(s, "s");
        }

        @Override // android.text.TextWatcher
        public void beforeTextChanged(CharSequence s, int i, int i2, int i3) {
            Intrinsics.checkParameterIsNotNull(s, "s");
            if (!isDisposed()) {
                this.f80123c.onNext(new TextViewBeforeTextChangeEvent(this.f80122b, s, i, i2, i3));
            }
        }

        @Override // io.reactivex.android.MainThreadDisposable
        public void onDispose() {
            this.f80122b.removeTextChangedListener(this);
        }

        @Override // android.text.TextWatcher
        public void onTextChanged(CharSequence charSequence, int i, int i2, int i3) {
            Intrinsics.checkParameterIsNotNull(charSequence, "charSequence");
        }
    }

    public C22278tS1(TextView view) {
        Intrinsics.checkParameterIsNotNull(view, "view");
        this.f80121a = view;
    }

    @Override // com.jakewharton.rxbinding3.InitialValueObservable
    /* renamed from: d */
    public TextViewBeforeTextChangeEvent getInitialValue() {
        TextView textView = this.f80121a;
        CharSequence text = textView.getText();
        Intrinsics.checkExpressionValueIsNotNull(text, "view.text");
        return new TextViewBeforeTextChangeEvent(textView, text, 0, 0, 0);
    }

    @Override // com.jakewharton.rxbinding3.InitialValueObservable
    public void subscribeListener(Observer observer) {
        Intrinsics.checkParameterIsNotNull(observer, "observer");
        C14000a c14000a = new C14000a(this.f80121a, observer);
        observer.onSubscribe(c14000a);
        this.f80121a.addTextChangedListener(c14000a);
    }
}

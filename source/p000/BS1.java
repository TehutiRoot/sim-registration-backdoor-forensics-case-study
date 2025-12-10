package p000;

import android.text.Editable;
import android.text.TextWatcher;
import android.widget.TextView;
import com.jakewharton.rxbinding3.InitialValueObservable;
import com.jakewharton.rxbinding3.widget.TextViewTextChangeEvent;
import io.reactivex.Observer;
import io.reactivex.android.MainThreadDisposable;
import kotlin.jvm.internal.Intrinsics;

/* renamed from: BS1 */
/* loaded from: classes5.dex */
public final class BS1 extends InitialValueObservable {

    /* renamed from: a */
    public final TextView f398a;

    /* renamed from: BS1$a */
    /* loaded from: classes5.dex */
    public static final class C0104a extends MainThreadDisposable implements TextWatcher {

        /* renamed from: b */
        public final TextView f399b;

        /* renamed from: c */
        public final Observer f400c;

        public C0104a(TextView view, Observer observer) {
            Intrinsics.checkParameterIsNotNull(view, "view");
            Intrinsics.checkParameterIsNotNull(observer, "observer");
            this.f399b = view;
            this.f400c = observer;
        }

        @Override // android.text.TextWatcher
        public void afterTextChanged(Editable editable) {
            Intrinsics.checkParameterIsNotNull(editable, "editable");
        }

        @Override // android.text.TextWatcher
        public void beforeTextChanged(CharSequence s, int i, int i2, int i3) {
            Intrinsics.checkParameterIsNotNull(s, "s");
        }

        @Override // io.reactivex.android.MainThreadDisposable
        public void onDispose() {
            this.f399b.removeTextChangedListener(this);
        }

        @Override // android.text.TextWatcher
        public void onTextChanged(CharSequence s, int i, int i2, int i3) {
            Intrinsics.checkParameterIsNotNull(s, "s");
            if (!isDisposed()) {
                this.f400c.onNext(new TextViewTextChangeEvent(this.f399b, s, i, i2, i3));
            }
        }
    }

    public BS1(TextView view) {
        Intrinsics.checkParameterIsNotNull(view, "view");
        this.f398a = view;
    }

    @Override // com.jakewharton.rxbinding3.InitialValueObservable
    /* renamed from: d */
    public TextViewTextChangeEvent getInitialValue() {
        TextView textView = this.f398a;
        CharSequence text = textView.getText();
        Intrinsics.checkExpressionValueIsNotNull(text, "view.text");
        return new TextViewTextChangeEvent(textView, text, 0, 0, 0);
    }

    @Override // com.jakewharton.rxbinding3.InitialValueObservable
    public void subscribeListener(Observer observer) {
        Intrinsics.checkParameterIsNotNull(observer, "observer");
        C0104a c0104a = new C0104a(this.f398a, observer);
        observer.onSubscribe(c0104a);
        this.f398a.addTextChangedListener(c0104a);
    }
}

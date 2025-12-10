package p000;

import android.text.Editable;
import android.text.TextWatcher;
import android.widget.TextView;
import com.jakewharton.rxbinding3.InitialValueObservable;
import com.jakewharton.rxbinding3.widget.TextViewAfterTextChangeEvent;
import io.reactivex.Observer;
import io.reactivex.android.MainThreadDisposable;
import kotlin.jvm.internal.Intrinsics;

/* renamed from: rS1  reason: case insensitive filesystem */
/* loaded from: classes5.dex */
public final class C21934rS1 extends InitialValueObservable {

    /* renamed from: a */
    public final TextView f77287a;

    /* renamed from: rS1$a */
    /* loaded from: classes5.dex */
    public static final class C13257a extends MainThreadDisposable implements TextWatcher {

        /* renamed from: b */
        public final TextView f77288b;

        /* renamed from: c */
        public final Observer f77289c;

        public C13257a(TextView view, Observer observer) {
            Intrinsics.checkParameterIsNotNull(view, "view");
            Intrinsics.checkParameterIsNotNull(observer, "observer");
            this.f77288b = view;
            this.f77289c = observer;
        }

        @Override // android.text.TextWatcher
        public void afterTextChanged(Editable s) {
            Intrinsics.checkParameterIsNotNull(s, "s");
            this.f77289c.onNext(new TextViewAfterTextChangeEvent(this.f77288b, s));
        }

        @Override // android.text.TextWatcher
        public void beforeTextChanged(CharSequence charSequence, int i, int i2, int i3) {
            Intrinsics.checkParameterIsNotNull(charSequence, "charSequence");
        }

        @Override // io.reactivex.android.MainThreadDisposable
        public void onDispose() {
            this.f77288b.removeTextChangedListener(this);
        }

        @Override // android.text.TextWatcher
        public void onTextChanged(CharSequence charSequence, int i, int i2, int i3) {
            Intrinsics.checkParameterIsNotNull(charSequence, "charSequence");
        }
    }

    public C21934rS1(TextView view) {
        Intrinsics.checkParameterIsNotNull(view, "view");
        this.f77287a = view;
    }

    @Override // com.jakewharton.rxbinding3.InitialValueObservable
    /* renamed from: d */
    public TextViewAfterTextChangeEvent getInitialValue() {
        TextView textView = this.f77287a;
        return new TextViewAfterTextChangeEvent(textView, textView.getEditableText());
    }

    @Override // com.jakewharton.rxbinding3.InitialValueObservable
    public void subscribeListener(Observer observer) {
        Intrinsics.checkParameterIsNotNull(observer, "observer");
        C13257a c13257a = new C13257a(this.f77287a, observer);
        observer.onSubscribe(c13257a);
        this.f77287a.addTextChangedListener(c13257a);
    }
}

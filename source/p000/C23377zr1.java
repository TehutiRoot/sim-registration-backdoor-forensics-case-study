package p000;

import android.widget.RadioGroup;
import com.jakewharton.rxbinding3.InitialValueObservable;
import com.jakewharton.rxbinding3.internal.Preconditions;
import io.reactivex.Observer;
import io.reactivex.android.MainThreadDisposable;
import kotlin.jvm.internal.Intrinsics;

/* renamed from: zr1  reason: case insensitive filesystem */
/* loaded from: classes5.dex */
public final class C23377zr1 extends InitialValueObservable {

    /* renamed from: a */
    public final RadioGroup f109203a;

    /* renamed from: zr1$a */
    /* loaded from: classes5.dex */
    public static final class C17222a extends MainThreadDisposable implements RadioGroup.OnCheckedChangeListener {

        /* renamed from: b */
        public int f109204b;

        /* renamed from: c */
        public final RadioGroup f109205c;

        /* renamed from: d */
        public final Observer f109206d;

        public C17222a(RadioGroup view, Observer observer) {
            Intrinsics.checkParameterIsNotNull(view, "view");
            Intrinsics.checkParameterIsNotNull(observer, "observer");
            this.f109205c = view;
            this.f109206d = observer;
            this.f109204b = -1;
        }

        @Override // android.widget.RadioGroup.OnCheckedChangeListener
        public void onCheckedChanged(RadioGroup radioGroup, int i) {
            Intrinsics.checkParameterIsNotNull(radioGroup, "radioGroup");
            if (!isDisposed() && i != this.f109204b) {
                this.f109204b = i;
                this.f109206d.onNext(Integer.valueOf(i));
            }
        }

        @Override // io.reactivex.android.MainThreadDisposable
        public void onDispose() {
            this.f109205c.setOnCheckedChangeListener(null);
        }
    }

    public C23377zr1(RadioGroup view) {
        Intrinsics.checkParameterIsNotNull(view, "view");
        this.f109203a = view;
    }

    @Override // com.jakewharton.rxbinding3.InitialValueObservable
    /* renamed from: d */
    public Integer getInitialValue() {
        return Integer.valueOf(this.f109203a.getCheckedRadioButtonId());
    }

    @Override // com.jakewharton.rxbinding3.InitialValueObservable
    public void subscribeListener(Observer observer) {
        Intrinsics.checkParameterIsNotNull(observer, "observer");
        if (!Preconditions.checkMainThread(observer)) {
            return;
        }
        C17222a c17222a = new C17222a(this.f109203a, observer);
        this.f109203a.setOnCheckedChangeListener(c17222a);
        observer.onSubscribe(c17222a);
    }
}

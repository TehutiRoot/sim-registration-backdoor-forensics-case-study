package p000;

import android.widget.CompoundButton;
import com.jakewharton.rxbinding2.InitialValueObservable;
import com.jakewharton.rxbinding2.internal.Preconditions;
import io.reactivex.Observer;
import io.reactivex.android.MainThreadDisposable;

/* renamed from: yv */
/* loaded from: classes5.dex */
public final class C17158yv extends InitialValueObservable {

    /* renamed from: a */
    public final CompoundButton f108933a;

    /* renamed from: yv$a */
    /* loaded from: classes5.dex */
    public static final class C17159a extends MainThreadDisposable implements CompoundButton.OnCheckedChangeListener {

        /* renamed from: b */
        public final CompoundButton f108934b;

        /* renamed from: c */
        public final Observer f108935c;

        public C17159a(CompoundButton compoundButton, Observer observer) {
            this.f108934b = compoundButton;
            this.f108935c = observer;
        }

        @Override // android.widget.CompoundButton.OnCheckedChangeListener
        public void onCheckedChanged(CompoundButton compoundButton, boolean z) {
            if (!isDisposed()) {
                this.f108935c.onNext(Boolean.valueOf(z));
            }
        }

        @Override // io.reactivex.android.MainThreadDisposable
        public void onDispose() {
            this.f108934b.setOnCheckedChangeListener(null);
        }
    }

    public C17158yv(CompoundButton compoundButton) {
        this.f108933a = compoundButton;
    }

    @Override // com.jakewharton.rxbinding2.InitialValueObservable
    /* renamed from: d */
    public Boolean getInitialValue() {
        return Boolean.valueOf(this.f108933a.isChecked());
    }

    @Override // com.jakewharton.rxbinding2.InitialValueObservable
    public void subscribeListener(Observer observer) {
        if (!Preconditions.checkMainThread(observer)) {
            return;
        }
        C17159a c17159a = new C17159a(this.f108933a, observer);
        observer.onSubscribe(c17159a);
        this.f108933a.setOnCheckedChangeListener(c17159a);
    }
}

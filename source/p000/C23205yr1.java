package p000;

import android.widget.RadioGroup;
import com.jakewharton.rxbinding2.InitialValueObservable;
import com.jakewharton.rxbinding2.internal.Preconditions;
import io.reactivex.Observer;
import io.reactivex.android.MainThreadDisposable;

/* renamed from: yr1  reason: case insensitive filesystem */
/* loaded from: classes5.dex */
public final class C23205yr1 extends InitialValueObservable {

    /* renamed from: a */
    public final RadioGroup f108884a;

    /* renamed from: yr1$a */
    /* loaded from: classes5.dex */
    public static final class C17154a extends MainThreadDisposable implements RadioGroup.OnCheckedChangeListener {

        /* renamed from: b */
        public final RadioGroup f108885b;

        /* renamed from: c */
        public final Observer f108886c;

        /* renamed from: d */
        public int f108887d = -1;

        public C17154a(RadioGroup radioGroup, Observer observer) {
            this.f108885b = radioGroup;
            this.f108886c = observer;
        }

        @Override // android.widget.RadioGroup.OnCheckedChangeListener
        public void onCheckedChanged(RadioGroup radioGroup, int i) {
            if (!isDisposed() && i != this.f108887d) {
                this.f108887d = i;
                this.f108886c.onNext(Integer.valueOf(i));
            }
        }

        @Override // io.reactivex.android.MainThreadDisposable
        public void onDispose() {
            this.f108885b.setOnCheckedChangeListener(null);
        }
    }

    public C23205yr1(RadioGroup radioGroup) {
        this.f108884a = radioGroup;
    }

    @Override // com.jakewharton.rxbinding2.InitialValueObservable
    /* renamed from: d */
    public Integer getInitialValue() {
        return Integer.valueOf(this.f108884a.getCheckedRadioButtonId());
    }

    @Override // com.jakewharton.rxbinding2.InitialValueObservable
    public void subscribeListener(Observer observer) {
        if (!Preconditions.checkMainThread(observer)) {
            return;
        }
        C17154a c17154a = new C17154a(this.f108884a, observer);
        this.f108884a.setOnCheckedChangeListener(c17154a);
        observer.onSubscribe(c17154a);
    }
}

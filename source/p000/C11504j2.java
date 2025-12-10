package p000;

import android.view.View;
import android.widget.AdapterView;
import com.jakewharton.rxbinding2.InitialValueObservable;
import com.jakewharton.rxbinding2.internal.Preconditions;
import io.reactivex.Observer;
import io.reactivex.android.MainThreadDisposable;

/* renamed from: j2 */
/* loaded from: classes5.dex */
public final class C11504j2 extends InitialValueObservable {

    /* renamed from: a */
    public final AdapterView f67144a;

    /* renamed from: j2$a */
    /* loaded from: classes5.dex */
    public static final class C11505a extends MainThreadDisposable implements AdapterView.OnItemSelectedListener {

        /* renamed from: b */
        public final AdapterView f67145b;

        /* renamed from: c */
        public final Observer f67146c;

        public C11505a(AdapterView adapterView, Observer observer) {
            this.f67145b = adapterView;
            this.f67146c = observer;
        }

        @Override // io.reactivex.android.MainThreadDisposable
        public void onDispose() {
            this.f67145b.setOnItemSelectedListener(null);
        }

        @Override // android.widget.AdapterView.OnItemSelectedListener
        public void onItemSelected(AdapterView adapterView, View view, int i, long j) {
            if (!isDisposed()) {
                this.f67146c.onNext(Integer.valueOf(i));
            }
        }

        @Override // android.widget.AdapterView.OnItemSelectedListener
        public void onNothingSelected(AdapterView adapterView) {
            if (!isDisposed()) {
                this.f67146c.onNext(-1);
            }
        }
    }

    public C11504j2(AdapterView adapterView) {
        this.f67144a = adapterView;
    }

    @Override // com.jakewharton.rxbinding2.InitialValueObservable
    /* renamed from: d */
    public Integer getInitialValue() {
        return Integer.valueOf(this.f67144a.getSelectedItemPosition());
    }

    @Override // com.jakewharton.rxbinding2.InitialValueObservable
    public void subscribeListener(Observer observer) {
        if (!Preconditions.checkMainThread(observer)) {
            return;
        }
        C11505a c11505a = new C11505a(this.f67144a, observer);
        this.f67144a.setOnItemSelectedListener(c11505a);
        observer.onSubscribe(c11505a);
    }
}

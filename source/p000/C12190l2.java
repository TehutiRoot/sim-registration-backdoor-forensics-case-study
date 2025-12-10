package p000;

import android.view.View;
import android.widget.AdapterView;
import com.jakewharton.rxbinding2.InitialValueObservable;
import com.jakewharton.rxbinding2.internal.Preconditions;
import com.jakewharton.rxbinding2.widget.AdapterViewItemSelectionEvent;
import com.jakewharton.rxbinding2.widget.AdapterViewNothingSelectionEvent;
import com.jakewharton.rxbinding2.widget.AdapterViewSelectionEvent;
import io.reactivex.Observer;
import io.reactivex.android.MainThreadDisposable;

/* renamed from: l2 */
/* loaded from: classes5.dex */
public final class C12190l2 extends InitialValueObservable {

    /* renamed from: a */
    public final AdapterView f71517a;

    /* renamed from: l2$a */
    /* loaded from: classes5.dex */
    public static final class C12191a extends MainThreadDisposable implements AdapterView.OnItemSelectedListener {

        /* renamed from: b */
        public final AdapterView f71518b;

        /* renamed from: c */
        public final Observer f71519c;

        public C12191a(AdapterView adapterView, Observer observer) {
            this.f71518b = adapterView;
            this.f71519c = observer;
        }

        @Override // io.reactivex.android.MainThreadDisposable
        public void onDispose() {
            this.f71518b.setOnItemSelectedListener(null);
        }

        @Override // android.widget.AdapterView.OnItemSelectedListener
        public void onItemSelected(AdapterView adapterView, View view, int i, long j) {
            if (!isDisposed()) {
                this.f71519c.onNext(AdapterViewItemSelectionEvent.create(adapterView, view, i, j));
            }
        }

        @Override // android.widget.AdapterView.OnItemSelectedListener
        public void onNothingSelected(AdapterView adapterView) {
            if (!isDisposed()) {
                this.f71519c.onNext(AdapterViewNothingSelectionEvent.create(adapterView));
            }
        }
    }

    public C12190l2(AdapterView adapterView) {
        this.f71517a = adapterView;
    }

    @Override // com.jakewharton.rxbinding2.InitialValueObservable
    /* renamed from: d */
    public AdapterViewSelectionEvent getInitialValue() {
        int selectedItemPosition = this.f71517a.getSelectedItemPosition();
        if (selectedItemPosition == -1) {
            return AdapterViewNothingSelectionEvent.create(this.f71517a);
        }
        return AdapterViewItemSelectionEvent.create(this.f71517a, this.f71517a.getSelectedView(), selectedItemPosition, this.f71517a.getSelectedItemId());
    }

    @Override // com.jakewharton.rxbinding2.InitialValueObservable
    public void subscribeListener(Observer observer) {
        if (!Preconditions.checkMainThread(observer)) {
            return;
        }
        C12191a c12191a = new C12191a(this.f71517a, observer);
        this.f71517a.setOnItemSelectedListener(c12191a);
        observer.onSubscribe(c12191a);
    }
}

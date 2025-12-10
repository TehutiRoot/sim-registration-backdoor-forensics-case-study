package p000;

import android.view.View;
import android.widget.AdapterView;
import android.widget.AutoCompleteTextView;
import com.jakewharton.rxbinding2.internal.Preconditions;
import com.jakewharton.rxbinding2.widget.AdapterViewItemClickEvent;
import io.reactivex.Observable;
import io.reactivex.Observer;
import io.reactivex.android.MainThreadDisposable;

/* renamed from: Z7 */
/* loaded from: classes5.dex */
public final class C1782Z7 extends Observable {

    /* renamed from: a */
    public final AutoCompleteTextView f8095a;

    /* renamed from: Z7$a */
    /* loaded from: classes5.dex */
    public static final class C1783a extends MainThreadDisposable implements AdapterView.OnItemClickListener {

        /* renamed from: b */
        public final AutoCompleteTextView f8096b;

        /* renamed from: c */
        public final Observer f8097c;

        public C1783a(AutoCompleteTextView autoCompleteTextView, Observer observer) {
            this.f8096b = autoCompleteTextView;
            this.f8097c = observer;
        }

        @Override // io.reactivex.android.MainThreadDisposable
        public void onDispose() {
            this.f8096b.setOnItemClickListener(null);
        }

        @Override // android.widget.AdapterView.OnItemClickListener
        public void onItemClick(AdapterView adapterView, View view, int i, long j) {
            if (!isDisposed()) {
                this.f8097c.onNext(AdapterViewItemClickEvent.create(adapterView, view, i, j));
            }
        }
    }

    public C1782Z7(AutoCompleteTextView autoCompleteTextView) {
        this.f8095a = autoCompleteTextView;
    }

    @Override // io.reactivex.Observable
    public void subscribeActual(Observer observer) {
        if (!Preconditions.checkMainThread(observer)) {
            return;
        }
        C1783a c1783a = new C1783a(this.f8095a, observer);
        observer.onSubscribe(c1783a);
        this.f8095a.setOnItemClickListener(c1783a);
    }
}
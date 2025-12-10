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
public final class C1802Z7 extends Observable {

    /* renamed from: a */
    public final AutoCompleteTextView f7955a;

    /* renamed from: Z7$a */
    /* loaded from: classes5.dex */
    public static final class C1803a extends MainThreadDisposable implements AdapterView.OnItemClickListener {

        /* renamed from: b */
        public final AutoCompleteTextView f7956b;

        /* renamed from: c */
        public final Observer f7957c;

        public C1803a(AutoCompleteTextView autoCompleteTextView, Observer observer) {
            this.f7956b = autoCompleteTextView;
            this.f7957c = observer;
        }

        @Override // io.reactivex.android.MainThreadDisposable
        public void onDispose() {
            this.f7956b.setOnItemClickListener(null);
        }

        @Override // android.widget.AdapterView.OnItemClickListener
        public void onItemClick(AdapterView adapterView, View view, int i, long j) {
            if (!isDisposed()) {
                this.f7957c.onNext(AdapterViewItemClickEvent.create(adapterView, view, i, j));
            }
        }
    }

    public C1802Z7(AutoCompleteTextView autoCompleteTextView) {
        this.f7955a = autoCompleteTextView;
    }

    @Override // io.reactivex.Observable
    public void subscribeActual(Observer observer) {
        if (!Preconditions.checkMainThread(observer)) {
            return;
        }
        C1803a c1803a = new C1803a(this.f7955a, observer);
        observer.onSubscribe(c1803a);
        this.f7955a.setOnItemClickListener(c1803a);
    }
}

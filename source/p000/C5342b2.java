package p000;

import android.view.View;
import android.widget.AdapterView;
import com.jakewharton.rxbinding2.internal.Preconditions;
import com.jakewharton.rxbinding2.widget.AdapterViewItemClickEvent;
import io.reactivex.Observable;
import io.reactivex.Observer;
import io.reactivex.android.MainThreadDisposable;

/* renamed from: b2 */
/* loaded from: classes5.dex */
public final class C5342b2 extends Observable {

    /* renamed from: a */
    public final AdapterView f38919a;

    /* renamed from: b2$a */
    /* loaded from: classes5.dex */
    public static final class C5343a extends MainThreadDisposable implements AdapterView.OnItemClickListener {

        /* renamed from: b */
        public final AdapterView f38920b;

        /* renamed from: c */
        public final Observer f38921c;

        public C5343a(AdapterView adapterView, Observer observer) {
            this.f38920b = adapterView;
            this.f38921c = observer;
        }

        @Override // io.reactivex.android.MainThreadDisposable
        public void onDispose() {
            this.f38920b.setOnItemClickListener(null);
        }

        @Override // android.widget.AdapterView.OnItemClickListener
        public void onItemClick(AdapterView adapterView, View view, int i, long j) {
            if (!isDisposed()) {
                this.f38921c.onNext(AdapterViewItemClickEvent.create(adapterView, view, i, j));
            }
        }
    }

    public C5342b2(AdapterView adapterView) {
        this.f38919a = adapterView;
    }

    @Override // io.reactivex.Observable
    public void subscribeActual(Observer observer) {
        if (!Preconditions.checkMainThread(observer)) {
            return;
        }
        C5343a c5343a = new C5343a(this.f38919a, observer);
        observer.onSubscribe(c5343a);
        this.f38919a.setOnItemClickListener(c5343a);
    }
}

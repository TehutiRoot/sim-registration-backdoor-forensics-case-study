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
public final class C5325b2 extends Observable {

    /* renamed from: a */
    public final AdapterView f38981a;

    /* renamed from: b2$a */
    /* loaded from: classes5.dex */
    public static final class C5326a extends MainThreadDisposable implements AdapterView.OnItemClickListener {

        /* renamed from: b */
        public final AdapterView f38982b;

        /* renamed from: c */
        public final Observer f38983c;

        public C5326a(AdapterView adapterView, Observer observer) {
            this.f38982b = adapterView;
            this.f38983c = observer;
        }

        @Override // io.reactivex.android.MainThreadDisposable
        public void onDispose() {
            this.f38982b.setOnItemClickListener(null);
        }

        @Override // android.widget.AdapterView.OnItemClickListener
        public void onItemClick(AdapterView adapterView, View view, int i, long j) {
            if (!isDisposed()) {
                this.f38983c.onNext(AdapterViewItemClickEvent.create(adapterView, view, i, j));
            }
        }
    }

    public C5325b2(AdapterView adapterView) {
        this.f38981a = adapterView;
    }

    @Override // io.reactivex.Observable
    public void subscribeActual(Observer observer) {
        if (!Preconditions.checkMainThread(observer)) {
            return;
        }
        C5326a c5326a = new C5326a(this.f38981a, observer);
        observer.onSubscribe(c5326a);
        this.f38981a.setOnItemClickListener(c5326a);
    }
}
package p000;

import android.view.View;
import android.widget.AdapterView;
import com.jakewharton.rxbinding2.internal.Preconditions;
import io.reactivex.Observable;
import io.reactivex.Observer;
import io.reactivex.android.MainThreadDisposable;

/* renamed from: d2 */
/* loaded from: classes5.dex */
public final class C10043d2 extends Observable {

    /* renamed from: a */
    public final AdapterView f61046a;

    /* renamed from: d2$a */
    /* loaded from: classes5.dex */
    public static final class C10044a extends MainThreadDisposable implements AdapterView.OnItemClickListener {

        /* renamed from: b */
        public final AdapterView f61047b;

        /* renamed from: c */
        public final Observer f61048c;

        public C10044a(AdapterView adapterView, Observer observer) {
            this.f61047b = adapterView;
            this.f61048c = observer;
        }

        @Override // io.reactivex.android.MainThreadDisposable
        public void onDispose() {
            this.f61047b.setOnItemClickListener(null);
        }

        @Override // android.widget.AdapterView.OnItemClickListener
        public void onItemClick(AdapterView adapterView, View view, int i, long j) {
            if (!isDisposed()) {
                this.f61048c.onNext(Integer.valueOf(i));
            }
        }
    }

    public C10043d2(AdapterView adapterView) {
        this.f61046a = adapterView;
    }

    @Override // io.reactivex.Observable
    public void subscribeActual(Observer observer) {
        if (!Preconditions.checkMainThread(observer)) {
            return;
        }
        C10044a c10044a = new C10044a(this.f61046a, observer);
        observer.onSubscribe(c10044a);
        this.f61046a.setOnItemClickListener(c10044a);
    }
}

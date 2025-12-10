package p000;

import android.database.DataSetObserver;
import android.widget.Adapter;
import com.jakewharton.rxbinding2.InitialValueObservable;
import com.jakewharton.rxbinding2.internal.Preconditions;
import io.reactivex.Observer;
import io.reactivex.android.MainThreadDisposable;

/* renamed from: a2 */
/* loaded from: classes5.dex */
public final class C1842a2 extends InitialValueObservable {

    /* renamed from: a */
    public final Adapter f8329a;

    /* renamed from: a2$a */
    /* loaded from: classes5.dex */
    public static final class C1843a extends MainThreadDisposable {

        /* renamed from: b */
        public final Adapter f8330b;

        /* renamed from: c */
        public final DataSetObserver f8331c;

        /* renamed from: a2$a$a */
        /* loaded from: classes5.dex */
        public class C1844a extends DataSetObserver {

            /* renamed from: a */
            public final /* synthetic */ Observer f8332a;

            /* renamed from: b */
            public final /* synthetic */ Adapter f8333b;

            public C1844a(Observer observer, Adapter adapter) {
                this.f8332a = observer;
                this.f8333b = adapter;
            }

            @Override // android.database.DataSetObserver
            public void onChanged() {
                if (!C1843a.this.isDisposed()) {
                    this.f8332a.onNext(this.f8333b);
                }
            }
        }

        public C1843a(Adapter adapter, Observer observer) {
            this.f8330b = adapter;
            this.f8331c = new C1844a(observer, adapter);
        }

        @Override // io.reactivex.android.MainThreadDisposable
        public void onDispose() {
            this.f8330b.unregisterDataSetObserver(this.f8331c);
        }
    }

    public C1842a2(Adapter adapter) {
        this.f8329a = adapter;
    }

    @Override // com.jakewharton.rxbinding2.InitialValueObservable
    /* renamed from: d */
    public Adapter getInitialValue() {
        return this.f8329a;
    }

    @Override // com.jakewharton.rxbinding2.InitialValueObservable
    public void subscribeListener(Observer observer) {
        if (!Preconditions.checkMainThread(observer)) {
            return;
        }
        C1843a c1843a = new C1843a(this.f8329a, observer);
        this.f8329a.registerDataSetObserver(c1843a.f8331c);
        observer.onSubscribe(c1843a);
    }
}
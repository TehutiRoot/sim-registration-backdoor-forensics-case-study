package p000;

import android.database.DataSetObserver;
import android.widget.Adapter;
import com.jakewharton.rxbinding2.InitialValueObservable;
import com.jakewharton.rxbinding2.internal.Preconditions;
import io.reactivex.Observer;
import io.reactivex.android.MainThreadDisposable;

/* renamed from: a2 */
/* loaded from: classes5.dex */
public final class C1864a2 extends InitialValueObservable {

    /* renamed from: a */
    public final Adapter f8210a;

    /* renamed from: a2$a */
    /* loaded from: classes5.dex */
    public static final class C1865a extends MainThreadDisposable {

        /* renamed from: b */
        public final Adapter f8211b;

        /* renamed from: c */
        public final DataSetObserver f8212c;

        /* renamed from: a2$a$a */
        /* loaded from: classes5.dex */
        public class C1866a extends DataSetObserver {

            /* renamed from: a */
            public final /* synthetic */ Observer f8213a;

            /* renamed from: b */
            public final /* synthetic */ Adapter f8214b;

            public C1866a(Observer observer, Adapter adapter) {
                this.f8213a = observer;
                this.f8214b = adapter;
            }

            @Override // android.database.DataSetObserver
            public void onChanged() {
                if (!C1865a.this.isDisposed()) {
                    this.f8213a.onNext(this.f8214b);
                }
            }
        }

        public C1865a(Adapter adapter, Observer observer) {
            this.f8211b = adapter;
            this.f8212c = new C1866a(observer, adapter);
        }

        @Override // io.reactivex.android.MainThreadDisposable
        public void onDispose() {
            this.f8211b.unregisterDataSetObserver(this.f8212c);
        }
    }

    public C1864a2(Adapter adapter) {
        this.f8210a = adapter;
    }

    @Override // com.jakewharton.rxbinding2.InitialValueObservable
    /* renamed from: d */
    public Adapter getInitialValue() {
        return this.f8210a;
    }

    @Override // com.jakewharton.rxbinding2.InitialValueObservable
    public void subscribeListener(Observer observer) {
        if (!Preconditions.checkMainThread(observer)) {
            return;
        }
        C1865a c1865a = new C1865a(this.f8210a, observer);
        this.f8210a.registerDataSetObserver(c1865a.f8212c);
        observer.onSubscribe(c1865a);
    }
}

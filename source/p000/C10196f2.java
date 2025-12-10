package p000;

import android.view.View;
import android.widget.AdapterView;
import com.jakewharton.rxbinding2.internal.Preconditions;
import com.jakewharton.rxbinding2.widget.AdapterViewItemLongClickEvent;
import io.reactivex.Observable;
import io.reactivex.Observer;
import io.reactivex.android.MainThreadDisposable;
import io.reactivex.functions.Predicate;

/* renamed from: f2 */
/* loaded from: classes5.dex */
public final class C10196f2 extends Observable {

    /* renamed from: a */
    public final AdapterView f61692a;

    /* renamed from: b */
    public final Predicate f61693b;

    /* renamed from: f2$a */
    /* loaded from: classes5.dex */
    public static final class C10197a extends MainThreadDisposable implements AdapterView.OnItemLongClickListener {

        /* renamed from: b */
        public final AdapterView f61694b;

        /* renamed from: c */
        public final Observer f61695c;

        /* renamed from: d */
        public final Predicate f61696d;

        public C10197a(AdapterView adapterView, Observer observer, Predicate predicate) {
            this.f61694b = adapterView;
            this.f61695c = observer;
            this.f61696d = predicate;
        }

        @Override // io.reactivex.android.MainThreadDisposable
        public void onDispose() {
            this.f61694b.setOnItemLongClickListener(null);
        }

        @Override // android.widget.AdapterView.OnItemLongClickListener
        public boolean onItemLongClick(AdapterView adapterView, View view, int i, long j) {
            if (!isDisposed()) {
                AdapterViewItemLongClickEvent create = AdapterViewItemLongClickEvent.create(adapterView, view, i, j);
                try {
                    if (this.f61696d.test(create)) {
                        this.f61695c.onNext(create);
                        return true;
                    }
                    return false;
                } catch (Exception e) {
                    this.f61695c.onError(e);
                    dispose();
                    return false;
                }
            }
            return false;
        }
    }

    public C10196f2(AdapterView adapterView, Predicate predicate) {
        this.f61692a = adapterView;
        this.f61693b = predicate;
    }

    @Override // io.reactivex.Observable
    public void subscribeActual(Observer observer) {
        if (!Preconditions.checkMainThread(observer)) {
            return;
        }
        C10197a c10197a = new C10197a(this.f61692a, observer, this.f61693b);
        observer.onSubscribe(c10197a);
        this.f61692a.setOnItemLongClickListener(c10197a);
    }
}

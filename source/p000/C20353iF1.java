package p000;

import android.widget.SearchView;
import com.jakewharton.rxbinding2.InitialValueObservable;
import com.jakewharton.rxbinding2.internal.Preconditions;
import com.jakewharton.rxbinding2.widget.SearchViewQueryTextEvent;
import io.reactivex.Observer;
import io.reactivex.android.MainThreadDisposable;

/* renamed from: iF1  reason: case insensitive filesystem */
/* loaded from: classes5.dex */
public final class C20353iF1 extends InitialValueObservable {

    /* renamed from: a */
    public final SearchView f62750a;

    /* renamed from: iF1$a */
    /* loaded from: classes5.dex */
    public static final class C10454a extends MainThreadDisposable implements SearchView.OnQueryTextListener {

        /* renamed from: b */
        public final SearchView f62751b;

        /* renamed from: c */
        public final Observer f62752c;

        public C10454a(SearchView searchView, Observer observer) {
            this.f62751b = searchView;
            this.f62752c = observer;
        }

        @Override // io.reactivex.android.MainThreadDisposable
        public void onDispose() {
            this.f62751b.setOnQueryTextListener(null);
        }

        @Override // android.widget.SearchView.OnQueryTextListener
        public boolean onQueryTextChange(String str) {
            if (isDisposed()) {
                return false;
            }
            this.f62752c.onNext(SearchViewQueryTextEvent.create(this.f62751b, str, false));
            return true;
        }

        @Override // android.widget.SearchView.OnQueryTextListener
        public boolean onQueryTextSubmit(String str) {
            if (!isDisposed()) {
                this.f62752c.onNext(SearchViewQueryTextEvent.create(this.f62751b, str, true));
                return true;
            }
            return false;
        }
    }

    public C20353iF1(SearchView searchView) {
        this.f62750a = searchView;
    }

    @Override // com.jakewharton.rxbinding2.InitialValueObservable
    /* renamed from: d */
    public SearchViewQueryTextEvent getInitialValue() {
        SearchView searchView = this.f62750a;
        return SearchViewQueryTextEvent.create(searchView, searchView.getQuery(), false);
    }

    @Override // com.jakewharton.rxbinding2.InitialValueObservable
    public void subscribeListener(Observer observer) {
        if (!Preconditions.checkMainThread(observer)) {
            return;
        }
        C10454a c10454a = new C10454a(this.f62750a, observer);
        this.f62750a.setOnQueryTextListener(c10454a);
        observer.onSubscribe(c10454a);
    }
}

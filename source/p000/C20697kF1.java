package p000;

import android.widget.SearchView;
import com.jakewharton.rxbinding2.InitialValueObservable;
import com.jakewharton.rxbinding2.internal.Preconditions;
import io.reactivex.Observer;
import io.reactivex.android.MainThreadDisposable;

/* renamed from: kF1  reason: case insensitive filesystem */
/* loaded from: classes5.dex */
public final class C20697kF1 extends InitialValueObservable {

    /* renamed from: a */
    public final SearchView f67852a;

    /* renamed from: kF1$a */
    /* loaded from: classes5.dex */
    public static final class C11634a extends MainThreadDisposable implements SearchView.OnQueryTextListener {

        /* renamed from: b */
        public final SearchView f67853b;

        /* renamed from: c */
        public final Observer f67854c;

        public C11634a(SearchView searchView, Observer observer) {
            this.f67853b = searchView;
            this.f67854c = observer;
        }

        @Override // io.reactivex.android.MainThreadDisposable
        public void onDispose() {
            this.f67853b.setOnQueryTextListener(null);
        }

        @Override // android.widget.SearchView.OnQueryTextListener
        public boolean onQueryTextChange(String str) {
            if (!isDisposed()) {
                this.f67854c.onNext(str);
                return true;
            }
            return false;
        }

        @Override // android.widget.SearchView.OnQueryTextListener
        public boolean onQueryTextSubmit(String str) {
            return false;
        }
    }

    public C20697kF1(SearchView searchView) {
        this.f67852a = searchView;
    }

    @Override // com.jakewharton.rxbinding2.InitialValueObservable
    /* renamed from: d */
    public CharSequence getInitialValue() {
        return this.f67852a.getQuery();
    }

    @Override // com.jakewharton.rxbinding2.InitialValueObservable
    public void subscribeListener(Observer observer) {
        if (!Preconditions.checkMainThread(observer)) {
            return;
        }
        C11634a c11634a = new C11634a(this.f67852a, observer);
        this.f67852a.setOnQueryTextListener(c11634a);
        observer.onSubscribe(c11634a);
    }
}

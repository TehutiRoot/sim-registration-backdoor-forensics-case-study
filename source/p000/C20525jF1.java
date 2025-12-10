package p000;

import android.widget.SearchView;
import com.jakewharton.rxbinding3.InitialValueObservable;
import com.jakewharton.rxbinding3.internal.Preconditions;
import com.jakewharton.rxbinding3.widget.SearchViewQueryTextEvent;
import io.reactivex.Observer;
import io.reactivex.android.MainThreadDisposable;
import kotlin.jvm.internal.Intrinsics;

/* renamed from: jF1  reason: case insensitive filesystem */
/* loaded from: classes5.dex */
public final class C20525jF1 extends InitialValueObservable {

    /* renamed from: a */
    public final SearchView f67216a;

    /* renamed from: jF1$a */
    /* loaded from: classes5.dex */
    public static final class C11521a extends MainThreadDisposable implements SearchView.OnQueryTextListener {

        /* renamed from: b */
        public final SearchView f67217b;

        /* renamed from: c */
        public final Observer f67218c;

        public C11521a(SearchView view, Observer observer) {
            Intrinsics.checkParameterIsNotNull(view, "view");
            Intrinsics.checkParameterIsNotNull(observer, "observer");
            this.f67217b = view;
            this.f67218c = observer;
        }

        @Override // io.reactivex.android.MainThreadDisposable
        public void onDispose() {
            this.f67217b.setOnQueryTextListener(null);
        }

        @Override // android.widget.SearchView.OnQueryTextListener
        public boolean onQueryTextChange(String s) {
            Intrinsics.checkParameterIsNotNull(s, "s");
            if (isDisposed()) {
                return false;
            }
            this.f67218c.onNext(new SearchViewQueryTextEvent(this.f67217b, s, false));
            return true;
        }

        @Override // android.widget.SearchView.OnQueryTextListener
        public boolean onQueryTextSubmit(String query) {
            Intrinsics.checkParameterIsNotNull(query, "query");
            if (!isDisposed()) {
                this.f67218c.onNext(new SearchViewQueryTextEvent(this.f67217b, query, true));
                return true;
            }
            return false;
        }
    }

    public C20525jF1(SearchView view) {
        Intrinsics.checkParameterIsNotNull(view, "view");
        this.f67216a = view;
    }

    @Override // com.jakewharton.rxbinding3.InitialValueObservable
    /* renamed from: d */
    public SearchViewQueryTextEvent getInitialValue() {
        SearchView searchView = this.f67216a;
        CharSequence query = searchView.getQuery();
        Intrinsics.checkExpressionValueIsNotNull(query, "view.query");
        return new SearchViewQueryTextEvent(searchView, query, false);
    }

    @Override // com.jakewharton.rxbinding3.InitialValueObservable
    public void subscribeListener(Observer observer) {
        Intrinsics.checkParameterIsNotNull(observer, "observer");
        if (!Preconditions.checkMainThread(observer)) {
            return;
        }
        C11521a c11521a = new C11521a(this.f67216a, observer);
        this.f67216a.setOnQueryTextListener(c11521a);
        observer.onSubscribe(c11521a);
    }
}

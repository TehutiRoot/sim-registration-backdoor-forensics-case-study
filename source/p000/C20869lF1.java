package p000;

import android.widget.SearchView;
import com.jakewharton.rxbinding3.InitialValueObservable;
import com.jakewharton.rxbinding3.internal.Preconditions;
import io.reactivex.Observer;
import io.reactivex.android.MainThreadDisposable;
import kotlin.jvm.internal.Intrinsics;

/* renamed from: lF1  reason: case insensitive filesystem */
/* loaded from: classes5.dex */
public final class C20869lF1 extends InitialValueObservable {

    /* renamed from: a */
    public final SearchView f71569a;

    /* renamed from: lF1$a */
    /* loaded from: classes5.dex */
    public static final class C12207a extends MainThreadDisposable implements SearchView.OnQueryTextListener {

        /* renamed from: b */
        public final SearchView f71570b;

        /* renamed from: c */
        public final Observer f71571c;

        public C12207a(SearchView view, Observer observer) {
            Intrinsics.checkParameterIsNotNull(view, "view");
            Intrinsics.checkParameterIsNotNull(observer, "observer");
            this.f71570b = view;
            this.f71571c = observer;
        }

        @Override // io.reactivex.android.MainThreadDisposable
        public void onDispose() {
            this.f71570b.setOnQueryTextListener(null);
        }

        @Override // android.widget.SearchView.OnQueryTextListener
        public boolean onQueryTextChange(String s) {
            Intrinsics.checkParameterIsNotNull(s, "s");
            if (!isDisposed()) {
                this.f71571c.onNext(s);
                return true;
            }
            return false;
        }

        @Override // android.widget.SearchView.OnQueryTextListener
        public boolean onQueryTextSubmit(String query) {
            Intrinsics.checkParameterIsNotNull(query, "query");
            return false;
        }
    }

    public C20869lF1(SearchView view) {
        Intrinsics.checkParameterIsNotNull(view, "view");
        this.f71569a = view;
    }

    @Override // com.jakewharton.rxbinding3.InitialValueObservable
    /* renamed from: d */
    public CharSequence getInitialValue() {
        return this.f71569a.getQuery();
    }

    @Override // com.jakewharton.rxbinding3.InitialValueObservable
    public void subscribeListener(Observer observer) {
        Intrinsics.checkParameterIsNotNull(observer, "observer");
        if (!Preconditions.checkMainThread(observer)) {
            return;
        }
        C12207a c12207a = new C12207a(this.f71569a, observer);
        this.f71569a.setOnQueryTextListener(c12207a);
        observer.onSubscribe(c12207a);
    }
}

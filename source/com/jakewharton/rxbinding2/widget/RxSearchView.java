package com.jakewharton.rxbinding2.widget;

import android.widget.SearchView;
import androidx.annotation.CheckResult;
import androidx.annotation.NonNull;
import com.jakewharton.rxbinding2.InitialValueObservable;
import com.jakewharton.rxbinding2.internal.Preconditions;
import io.reactivex.functions.Consumer;

/* loaded from: classes5.dex */
public final class RxSearchView {

    /* renamed from: com.jakewharton.rxbinding2.widget.RxSearchView$a */
    /* loaded from: classes5.dex */
    public static class C9098a implements Consumer {

        /* renamed from: a */
        public final /* synthetic */ SearchView f58245a;

        /* renamed from: b */
        public final /* synthetic */ boolean f58246b;

        public C9098a(SearchView searchView, boolean z) {
            this.f58245a = searchView;
            this.f58246b = z;
        }

        @Override // io.reactivex.functions.Consumer
        /* renamed from: a */
        public void accept(CharSequence charSequence) {
            this.f58245a.setQuery(charSequence, this.f58246b);
        }
    }

    @NonNull
    @CheckResult
    public static Consumer<? super CharSequence> query(@NonNull SearchView searchView, boolean z) {
        Preconditions.checkNotNull(searchView, "view == null");
        return new C9098a(searchView, z);
    }

    @NonNull
    @CheckResult
    public static InitialValueObservable<SearchViewQueryTextEvent> queryTextChangeEvents(@NonNull SearchView searchView) {
        Preconditions.checkNotNull(searchView, "view == null");
        return new C20353iF1(searchView);
    }

    @NonNull
    @CheckResult
    public static InitialValueObservable<CharSequence> queryTextChanges(@NonNull SearchView searchView) {
        Preconditions.checkNotNull(searchView, "view == null");
        return new C20697kF1(searchView);
    }
}

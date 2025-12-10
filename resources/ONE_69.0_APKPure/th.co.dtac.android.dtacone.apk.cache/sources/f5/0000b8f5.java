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
    public static class C9087a implements Consumer {

        /* renamed from: a */
        public final /* synthetic */ SearchView f58257a;

        /* renamed from: b */
        public final /* synthetic */ boolean f58258b;

        public C9087a(SearchView searchView, boolean z) {
            this.f58257a = searchView;
            this.f58258b = z;
        }

        @Override // io.reactivex.functions.Consumer
        /* renamed from: a */
        public void accept(CharSequence charSequence) {
            this.f58257a.setQuery(charSequence, this.f58258b);
        }
    }

    @NonNull
    @CheckResult
    public static Consumer<? super CharSequence> query(@NonNull SearchView searchView, boolean z) {
        Preconditions.checkNotNull(searchView, "view == null");
        return new C9087a(searchView, z);
    }

    @NonNull
    @CheckResult
    public static InitialValueObservable<SearchViewQueryTextEvent> queryTextChangeEvents(@NonNull SearchView searchView) {
        Preconditions.checkNotNull(searchView, "view == null");
        return new C19891fG1(searchView);
    }

    @NonNull
    @CheckResult
    public static InitialValueObservable<CharSequence> queryTextChanges(@NonNull SearchView searchView) {
        Preconditions.checkNotNull(searchView, "view == null");
        return new C20237hG1(searchView);
    }
}
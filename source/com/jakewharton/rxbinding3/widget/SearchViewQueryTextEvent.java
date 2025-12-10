package com.jakewharton.rxbinding3.widget;

import android.widget.SearchView;
import com.google.android.gms.analytics.ecommerce.Promotion;
import com.tom_roush.pdfbox.contentstream.operator.OperatorName;
import com.tom_roush.pdfbox.pdmodel.common.PDPageLabelRange;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

@Metadata(m28851d1 = {"\u0000,\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\r\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u000b\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u000e\b\u0086\b\u0018\u00002\u00020\u0001B\u001f\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0004\u0012\u0006\u0010\u0007\u001a\u00020\u0006¢\u0006\u0004\b\b\u0010\tJ\u0010\u0010\n\u001a\u00020\u0002HÆ\u0003¢\u0006\u0004\b\n\u0010\u000bJ\u0010\u0010\f\u001a\u00020\u0004HÆ\u0003¢\u0006\u0004\b\f\u0010\rJ\u0010\u0010\u000e\u001a\u00020\u0006HÆ\u0003¢\u0006\u0004\b\u000e\u0010\u000fJ.\u0010\u0010\u001a\u00020\u00002\b\b\u0002\u0010\u0003\u001a\u00020\u00022\b\b\u0002\u0010\u0005\u001a\u00020\u00042\b\b\u0002\u0010\u0007\u001a\u00020\u0006HÆ\u0001¢\u0006\u0004\b\u0010\u0010\u0011J\u0010\u0010\u0013\u001a\u00020\u0012HÖ\u0001¢\u0006\u0004\b\u0013\u0010\u0014J\u0010\u0010\u0016\u001a\u00020\u0015HÖ\u0001¢\u0006\u0004\b\u0016\u0010\u0017J\u001a\u0010\u0019\u001a\u00020\u00062\b\u0010\u0018\u001a\u0004\u0018\u00010\u0001HÖ\u0003¢\u0006\u0004\b\u0019\u0010\u001aR\u0017\u0010\u0003\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u001b\u0010\u001c\u001a\u0004\b\u001d\u0010\u000bR\u0017\u0010\u0005\u001a\u00020\u00048\u0006¢\u0006\f\n\u0004\b\u001e\u0010\u001f\u001a\u0004\b \u0010\rR\u0017\u0010\u0007\u001a\u00020\u00068\u0006¢\u0006\f\n\u0004\b!\u0010\"\u001a\u0004\b\u0007\u0010\u000f¨\u0006#"}, m28850d2 = {"Lcom/jakewharton/rxbinding3/widget/SearchViewQueryTextEvent;", "", "Landroid/widget/SearchView;", Promotion.ACTION_VIEW, "", "queryText", "", "isSubmitted", "<init>", "(Landroid/widget/SearchView;Ljava/lang/CharSequence;Z)V", "component1", "()Landroid/widget/SearchView;", "component2", "()Ljava/lang/CharSequence;", "component3", "()Z", "copy", "(Landroid/widget/SearchView;Ljava/lang/CharSequence;Z)Lcom/jakewharton/rxbinding3/widget/SearchViewQueryTextEvent;", "", "toString", "()Ljava/lang/String;", "", "hashCode", "()I", "other", "equals", "(Ljava/lang/Object;)Z", PDPageLabelRange.STYLE_LETTERS_LOWER, "Landroid/widget/SearchView;", "getView", OperatorName.CLOSE_FILL_NON_ZERO_AND_STROKE, "Ljava/lang/CharSequence;", "getQueryText", OperatorName.CURVE_TO, "Z", "rxbinding_release"}, m28849k = 1, m28848mv = {1, 4, 0})
/* loaded from: classes5.dex */
public final class SearchViewQueryTextEvent {

    /* renamed from: a */
    public final SearchView f58309a;

    /* renamed from: b */
    public final CharSequence f58310b;

    /* renamed from: c */
    public final boolean f58311c;

    public SearchViewQueryTextEvent(@NotNull SearchView view, @NotNull CharSequence queryText, boolean z) {
        Intrinsics.checkParameterIsNotNull(view, "view");
        Intrinsics.checkParameterIsNotNull(queryText, "queryText");
        this.f58309a = view;
        this.f58310b = queryText;
        this.f58311c = z;
    }

    public static /* synthetic */ SearchViewQueryTextEvent copy$default(SearchViewQueryTextEvent searchViewQueryTextEvent, SearchView searchView, CharSequence charSequence, boolean z, int i, Object obj) {
        if ((i & 1) != 0) {
            searchView = searchViewQueryTextEvent.f58309a;
        }
        if ((i & 2) != 0) {
            charSequence = searchViewQueryTextEvent.f58310b;
        }
        if ((i & 4) != 0) {
            z = searchViewQueryTextEvent.f58311c;
        }
        return searchViewQueryTextEvent.copy(searchView, charSequence, z);
    }

    @NotNull
    public final SearchView component1() {
        return this.f58309a;
    }

    @NotNull
    public final CharSequence component2() {
        return this.f58310b;
    }

    public final boolean component3() {
        return this.f58311c;
    }

    @NotNull
    public final SearchViewQueryTextEvent copy(@NotNull SearchView view, @NotNull CharSequence queryText, boolean z) {
        Intrinsics.checkParameterIsNotNull(view, "view");
        Intrinsics.checkParameterIsNotNull(queryText, "queryText");
        return new SearchViewQueryTextEvent(view, queryText, z);
    }

    public boolean equals(@Nullable Object obj) {
        if (this != obj) {
            if (obj instanceof SearchViewQueryTextEvent) {
                SearchViewQueryTextEvent searchViewQueryTextEvent = (SearchViewQueryTextEvent) obj;
                return Intrinsics.areEqual(this.f58309a, searchViewQueryTextEvent.f58309a) && Intrinsics.areEqual(this.f58310b, searchViewQueryTextEvent.f58310b) && this.f58311c == searchViewQueryTextEvent.f58311c;
            }
            return false;
        }
        return true;
    }

    @NotNull
    public final CharSequence getQueryText() {
        return this.f58310b;
    }

    @NotNull
    public final SearchView getView() {
        return this.f58309a;
    }

    /* JADX WARN: Multi-variable type inference failed */
    public int hashCode() {
        SearchView searchView = this.f58309a;
        int hashCode = (searchView != null ? searchView.hashCode() : 0) * 31;
        CharSequence charSequence = this.f58310b;
        int hashCode2 = (hashCode + (charSequence != null ? charSequence.hashCode() : 0)) * 31;
        boolean z = this.f58311c;
        int i = z;
        if (z != 0) {
            i = 1;
        }
        return hashCode2 + i;
    }

    public final boolean isSubmitted() {
        return this.f58311c;
    }

    @NotNull
    public String toString() {
        return "SearchViewQueryTextEvent(view=" + this.f58309a + ", queryText=" + this.f58310b + ", isSubmitted=" + this.f58311c + ")";
    }
}

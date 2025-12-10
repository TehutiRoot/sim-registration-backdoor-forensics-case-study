package p000;

import android.widget.SearchView;
import com.jakewharton.rxbinding2.widget.SearchViewQueryTextEvent;

/* renamed from: W8 */
/* loaded from: classes5.dex */
public final class C1588W8 extends SearchViewQueryTextEvent {

    /* renamed from: a */
    public final SearchView f7133a;

    /* renamed from: b */
    public final CharSequence f7134b;

    /* renamed from: c */
    public final boolean f7135c;

    public C1588W8(SearchView searchView, CharSequence charSequence, boolean z) {
        if (searchView != null) {
            this.f7133a = searchView;
            if (charSequence != null) {
                this.f7134b = charSequence;
                this.f7135c = z;
                return;
            }
            throw new NullPointerException("Null queryText");
        }
        throw new NullPointerException("Null view");
    }

    public boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof SearchViewQueryTextEvent)) {
            return false;
        }
        SearchViewQueryTextEvent searchViewQueryTextEvent = (SearchViewQueryTextEvent) obj;
        if (this.f7133a.equals(searchViewQueryTextEvent.view()) && this.f7134b.equals(searchViewQueryTextEvent.queryText()) && this.f7135c == searchViewQueryTextEvent.isSubmitted()) {
            return true;
        }
        return false;
    }

    public int hashCode() {
        int i;
        int hashCode = (((this.f7133a.hashCode() ^ 1000003) * 1000003) ^ this.f7134b.hashCode()) * 1000003;
        if (this.f7135c) {
            i = 1231;
        } else {
            i = 1237;
        }
        return hashCode ^ i;
    }

    @Override // com.jakewharton.rxbinding2.widget.SearchViewQueryTextEvent
    public boolean isSubmitted() {
        return this.f7135c;
    }

    @Override // com.jakewharton.rxbinding2.widget.SearchViewQueryTextEvent
    public CharSequence queryText() {
        return this.f7134b;
    }

    public String toString() {
        return "SearchViewQueryTextEvent{view=" + this.f7133a + ", queryText=" + ((Object) this.f7134b) + ", isSubmitted=" + this.f7135c + "}";
    }

    @Override // com.jakewharton.rxbinding2.widget.SearchViewQueryTextEvent
    public SearchView view() {
        return this.f7133a;
    }
}

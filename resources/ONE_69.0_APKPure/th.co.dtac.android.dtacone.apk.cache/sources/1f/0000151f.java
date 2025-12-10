package p000;

import android.widget.SearchView;
import com.jakewharton.rxbinding2.widget.SearchViewQueryTextEvent;

/* renamed from: W8 */
/* loaded from: classes5.dex */
public final class C1576W8 extends SearchViewQueryTextEvent {

    /* renamed from: a */
    public final SearchView f7192a;

    /* renamed from: b */
    public final CharSequence f7193b;

    /* renamed from: c */
    public final boolean f7194c;

    public C1576W8(SearchView searchView, CharSequence charSequence, boolean z) {
        if (searchView != null) {
            this.f7192a = searchView;
            if (charSequence != null) {
                this.f7193b = charSequence;
                this.f7194c = z;
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
        if (this.f7192a.equals(searchViewQueryTextEvent.view()) && this.f7193b.equals(searchViewQueryTextEvent.queryText()) && this.f7194c == searchViewQueryTextEvent.isSubmitted()) {
            return true;
        }
        return false;
    }

    public int hashCode() {
        int i;
        int hashCode = (((this.f7192a.hashCode() ^ 1000003) * 1000003) ^ this.f7193b.hashCode()) * 1000003;
        if (this.f7194c) {
            i = 1231;
        } else {
            i = 1237;
        }
        return hashCode ^ i;
    }

    @Override // com.jakewharton.rxbinding2.widget.SearchViewQueryTextEvent
    public boolean isSubmitted() {
        return this.f7194c;
    }

    @Override // com.jakewharton.rxbinding2.widget.SearchViewQueryTextEvent
    public CharSequence queryText() {
        return this.f7193b;
    }

    public String toString() {
        return "SearchViewQueryTextEvent{view=" + this.f7192a + ", queryText=" + ((Object) this.f7193b) + ", isSubmitted=" + this.f7194c + "}";
    }

    @Override // com.jakewharton.rxbinding2.widget.SearchViewQueryTextEvent
    public SearchView view() {
        return this.f7192a;
    }
}
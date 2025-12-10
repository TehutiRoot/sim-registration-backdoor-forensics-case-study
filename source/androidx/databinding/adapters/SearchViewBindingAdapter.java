package androidx.databinding.adapters;

import android.annotation.TargetApi;
import android.widget.SearchView;
import androidx.annotation.RestrictTo;
import androidx.databinding.BindingAdapter;
import androidx.databinding.BindingMethod;
import androidx.databinding.BindingMethods;

@BindingMethods({@BindingMethod(attribute = "android:onQueryTextFocusChange", method = "setOnQueryTextFocusChangeListener", type = SearchView.class), @BindingMethod(attribute = "android:onSearchClick", method = "setOnSearchClickListener", type = SearchView.class), @BindingMethod(attribute = "android:onClose", method = "setOnCloseListener", type = SearchView.class)})
@RestrictTo({RestrictTo.Scope.LIBRARY})
/* loaded from: classes2.dex */
public class SearchViewBindingAdapter {

    @TargetApi(11)
    /* loaded from: classes2.dex */
    public interface OnQueryTextChange {
        boolean onQueryTextChange(String str);
    }

    @TargetApi(11)
    /* loaded from: classes2.dex */
    public interface OnQueryTextSubmit {
        boolean onQueryTextSubmit(String str);
    }

    @TargetApi(11)
    /* loaded from: classes2.dex */
    public interface OnSuggestionClick {
        boolean onSuggestionClick(int i);
    }

    @TargetApi(11)
    /* loaded from: classes2.dex */
    public interface OnSuggestionSelect {
        boolean onSuggestionSelect(int i);
    }

    /* renamed from: androidx.databinding.adapters.SearchViewBindingAdapter$a */
    /* loaded from: classes2.dex */
    public class C4300a implements SearchView.OnQueryTextListener {

        /* renamed from: a */
        public final /* synthetic */ OnQueryTextSubmit f34569a;

        /* renamed from: b */
        public final /* synthetic */ OnQueryTextChange f34570b;

        public C4300a(OnQueryTextSubmit onQueryTextSubmit, OnQueryTextChange onQueryTextChange) {
            this.f34569a = onQueryTextSubmit;
            this.f34570b = onQueryTextChange;
        }

        @Override // android.widget.SearchView.OnQueryTextListener
        public boolean onQueryTextChange(String str) {
            OnQueryTextChange onQueryTextChange = this.f34570b;
            if (onQueryTextChange != null) {
                return onQueryTextChange.onQueryTextChange(str);
            }
            return false;
        }

        @Override // android.widget.SearchView.OnQueryTextListener
        public boolean onQueryTextSubmit(String str) {
            OnQueryTextSubmit onQueryTextSubmit = this.f34569a;
            if (onQueryTextSubmit != null) {
                return onQueryTextSubmit.onQueryTextSubmit(str);
            }
            return false;
        }
    }

    /* renamed from: androidx.databinding.adapters.SearchViewBindingAdapter$b */
    /* loaded from: classes2.dex */
    public class C4301b implements SearchView.OnSuggestionListener {

        /* renamed from: a */
        public final /* synthetic */ OnSuggestionSelect f34571a;

        /* renamed from: b */
        public final /* synthetic */ OnSuggestionClick f34572b;

        public C4301b(OnSuggestionSelect onSuggestionSelect, OnSuggestionClick onSuggestionClick) {
            this.f34571a = onSuggestionSelect;
            this.f34572b = onSuggestionClick;
        }

        @Override // android.widget.SearchView.OnSuggestionListener
        public boolean onSuggestionClick(int i) {
            OnSuggestionClick onSuggestionClick = this.f34572b;
            if (onSuggestionClick != null) {
                return onSuggestionClick.onSuggestionClick(i);
            }
            return false;
        }

        @Override // android.widget.SearchView.OnSuggestionListener
        public boolean onSuggestionSelect(int i) {
            OnSuggestionSelect onSuggestionSelect = this.f34571a;
            if (onSuggestionSelect != null) {
                return onSuggestionSelect.onSuggestionSelect(i);
            }
            return false;
        }
    }

    @BindingAdapter(requireAll = false, value = {"android:onQueryTextSubmit", "android:onQueryTextChange"})
    public static void setOnQueryTextListener(SearchView searchView, OnQueryTextSubmit onQueryTextSubmit, OnQueryTextChange onQueryTextChange) {
        if (onQueryTextSubmit == null && onQueryTextChange == null) {
            searchView.setOnQueryTextListener(null);
        } else {
            searchView.setOnQueryTextListener(new C4300a(onQueryTextSubmit, onQueryTextChange));
        }
    }

    @BindingAdapter(requireAll = false, value = {"android:onSuggestionSelect", "android:onSuggestionClick"})
    public static void setOnSuggestListener(SearchView searchView, OnSuggestionSelect onSuggestionSelect, OnSuggestionClick onSuggestionClick) {
        if (onSuggestionSelect == null && onSuggestionClick == null) {
            searchView.setOnSuggestionListener(null);
        } else {
            searchView.setOnSuggestionListener(new C4301b(onSuggestionSelect, onSuggestionClick));
        }
    }
}

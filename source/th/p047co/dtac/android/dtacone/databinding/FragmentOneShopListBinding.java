package th.p047co.dtac.android.dtacone.databinding;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.LinearLayout;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.recyclerview.widget.RecyclerView;
import androidx.viewbinding.ViewBinding;
import androidx.viewbinding.ViewBindings;
import th.p047co.dtac.android.dtacone.R;
import th.p047co.dtac.android.dtacone.app_one.widget.OneFontTextView;

/* renamed from: th.co.dtac.android.dtacone.databinding.FragmentOneShopListBinding */
/* loaded from: classes7.dex */
public final class FragmentOneShopListBinding implements ViewBinding {

    /* renamed from: a */
    public final LinearLayout f84120a;
    @NonNull
    public final LinearLayout contentLayout;
    @NonNull
    public final LinearLayout layoutSearchBar;
    @NonNull
    public final OneFontTextView oneFontTextView4;
    @NonNull
    public final LinearLayout oneShopList;
    @NonNull
    public final RecyclerView rvShopList;
    @NonNull
    public final OneFontTextView tvSellerNotFound;
    @NonNull
    public final View view9;

    public FragmentOneShopListBinding(LinearLayout linearLayout, LinearLayout linearLayout2, LinearLayout linearLayout3, OneFontTextView oneFontTextView, LinearLayout linearLayout4, RecyclerView recyclerView, OneFontTextView oneFontTextView2, View view) {
        this.f84120a = linearLayout;
        this.contentLayout = linearLayout2;
        this.layoutSearchBar = linearLayout3;
        this.oneFontTextView4 = oneFontTextView;
        this.oneShopList = linearLayout4;
        this.rvShopList = recyclerView;
        this.tvSellerNotFound = oneFontTextView2;
        this.view9 = view;
    }

    @NonNull
    public static FragmentOneShopListBinding bind(@NonNull View view) {
        View findChildViewById;
        int i = R.id.contentLayout;
        LinearLayout linearLayout = (LinearLayout) ViewBindings.findChildViewById(view, i);
        if (linearLayout != null) {
            i = R.id.layoutSearchBar;
            LinearLayout linearLayout2 = (LinearLayout) ViewBindings.findChildViewById(view, i);
            if (linearLayout2 != null) {
                i = R.id.oneFontTextView4;
                OneFontTextView oneFontTextView = (OneFontTextView) ViewBindings.findChildViewById(view, i);
                if (oneFontTextView != null) {
                    LinearLayout linearLayout3 = (LinearLayout) view;
                    i = R.id.rvShopList;
                    RecyclerView recyclerView = (RecyclerView) ViewBindings.findChildViewById(view, i);
                    if (recyclerView != null) {
                        i = R.id.tvSellerNotFound;
                        OneFontTextView oneFontTextView2 = (OneFontTextView) ViewBindings.findChildViewById(view, i);
                        if (oneFontTextView2 != null && (findChildViewById = ViewBindings.findChildViewById(view, (i = R.id.view9))) != null) {
                            return new FragmentOneShopListBinding(linearLayout3, linearLayout, linearLayout2, oneFontTextView, linearLayout3, recyclerView, oneFontTextView2, findChildViewById);
                        }
                    }
                }
            }
        }
        throw new NullPointerException("Missing required view with ID: ".concat(view.getResources().getResourceName(i)));
    }

    @NonNull
    public static FragmentOneShopListBinding inflate(@NonNull LayoutInflater layoutInflater) {
        return inflate(layoutInflater, null, false);
    }

    @NonNull
    public static FragmentOneShopListBinding inflate(@NonNull LayoutInflater layoutInflater, @Nullable ViewGroup viewGroup, boolean z) {
        View inflate = layoutInflater.inflate(R.layout.fragment_one_shop_list, viewGroup, false);
        if (z) {
            viewGroup.addView(inflate);
        }
        return bind(inflate);
    }

    @Override // androidx.viewbinding.ViewBinding
    @NonNull
    public LinearLayout getRoot() {
        return this.f84120a;
    }
}

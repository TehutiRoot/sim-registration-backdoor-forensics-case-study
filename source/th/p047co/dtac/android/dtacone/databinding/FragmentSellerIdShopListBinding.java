package th.p047co.dtac.android.dtacone.databinding;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.LinearLayout;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.coordinatorlayout.widget.CoordinatorLayout;
import androidx.core.widget.NestedScrollView;
import androidx.recyclerview.widget.RecyclerView;
import androidx.viewbinding.ViewBinding;
import androidx.viewbinding.ViewBindings;
import com.google.android.material.appbar.AppBarLayout;
import com.google.android.material.appbar.CollapsingToolbarLayout;
import th.p047co.dtac.android.dtacone.R;
import th.p047co.dtac.android.dtacone.widget.view.DtacFontTextView;

/* renamed from: th.co.dtac.android.dtacone.databinding.FragmentSellerIdShopListBinding */
/* loaded from: classes7.dex */
public final class FragmentSellerIdShopListBinding implements ViewBinding {

    /* renamed from: a */
    public final CoordinatorLayout f84189a;
    @NonNull
    public final AppBarLayout appBarShopList;
    @NonNull
    public final CollapsingToolbarLayout cToolbar;
    @NonNull
    public final LinearLayout contentLayout;
    @NonNull
    public final LinearLayout historyListLayout;
    @NonNull
    public final RecyclerView historyListRecycler;
    @NonNull
    public final NestedScrollView layoutScrollView;
    @NonNull
    public final LinearLayout layoutSearchBar;
    @NonNull
    public final LinearLayout layoutWarning;
    @NonNull
    public final CoordinatorLayout rootLayout;
    @NonNull
    public final LinearLayout searchListLayout;
    @NonNull
    public final RecyclerView searchListRecycler;
    @NonNull
    public final DtacFontTextView tvSearchShopListTitle;
    @NonNull
    public final DtacFontTextView tvWarningDetail;
    @NonNull
    public final DtacFontTextView tvWarningTitle;

    public FragmentSellerIdShopListBinding(CoordinatorLayout coordinatorLayout, AppBarLayout appBarLayout, CollapsingToolbarLayout collapsingToolbarLayout, LinearLayout linearLayout, LinearLayout linearLayout2, RecyclerView recyclerView, NestedScrollView nestedScrollView, LinearLayout linearLayout3, LinearLayout linearLayout4, CoordinatorLayout coordinatorLayout2, LinearLayout linearLayout5, RecyclerView recyclerView2, DtacFontTextView dtacFontTextView, DtacFontTextView dtacFontTextView2, DtacFontTextView dtacFontTextView3) {
        this.f84189a = coordinatorLayout;
        this.appBarShopList = appBarLayout;
        this.cToolbar = collapsingToolbarLayout;
        this.contentLayout = linearLayout;
        this.historyListLayout = linearLayout2;
        this.historyListRecycler = recyclerView;
        this.layoutScrollView = nestedScrollView;
        this.layoutSearchBar = linearLayout3;
        this.layoutWarning = linearLayout4;
        this.rootLayout = coordinatorLayout2;
        this.searchListLayout = linearLayout5;
        this.searchListRecycler = recyclerView2;
        this.tvSearchShopListTitle = dtacFontTextView;
        this.tvWarningDetail = dtacFontTextView2;
        this.tvWarningTitle = dtacFontTextView3;
    }

    @NonNull
    public static FragmentSellerIdShopListBinding bind(@NonNull View view) {
        int i = R.id.appBarShopList;
        AppBarLayout appBarLayout = (AppBarLayout) ViewBindings.findChildViewById(view, i);
        if (appBarLayout != null) {
            i = R.id.cToolbar;
            CollapsingToolbarLayout collapsingToolbarLayout = (CollapsingToolbarLayout) ViewBindings.findChildViewById(view, i);
            if (collapsingToolbarLayout != null) {
                i = R.id.contentLayout;
                LinearLayout linearLayout = (LinearLayout) ViewBindings.findChildViewById(view, i);
                if (linearLayout != null) {
                    i = R.id.historyListLayout;
                    LinearLayout linearLayout2 = (LinearLayout) ViewBindings.findChildViewById(view, i);
                    if (linearLayout2 != null) {
                        i = R.id.historyListRecycler;
                        RecyclerView recyclerView = (RecyclerView) ViewBindings.findChildViewById(view, i);
                        if (recyclerView != null) {
                            i = R.id.layoutScrollView;
                            NestedScrollView nestedScrollView = (NestedScrollView) ViewBindings.findChildViewById(view, i);
                            if (nestedScrollView != null) {
                                i = R.id.layoutSearchBar;
                                LinearLayout linearLayout3 = (LinearLayout) ViewBindings.findChildViewById(view, i);
                                if (linearLayout3 != null) {
                                    i = R.id.layoutWarning;
                                    LinearLayout linearLayout4 = (LinearLayout) ViewBindings.findChildViewById(view, i);
                                    if (linearLayout4 != null) {
                                        CoordinatorLayout coordinatorLayout = (CoordinatorLayout) view;
                                        i = R.id.searchListLayout;
                                        LinearLayout linearLayout5 = (LinearLayout) ViewBindings.findChildViewById(view, i);
                                        if (linearLayout5 != null) {
                                            i = R.id.searchListRecycler;
                                            RecyclerView recyclerView2 = (RecyclerView) ViewBindings.findChildViewById(view, i);
                                            if (recyclerView2 != null) {
                                                i = R.id.tvSearchShopListTitle;
                                                DtacFontTextView dtacFontTextView = (DtacFontTextView) ViewBindings.findChildViewById(view, i);
                                                if (dtacFontTextView != null) {
                                                    i = R.id.tvWarningDetail;
                                                    DtacFontTextView dtacFontTextView2 = (DtacFontTextView) ViewBindings.findChildViewById(view, i);
                                                    if (dtacFontTextView2 != null) {
                                                        i = R.id.tvWarningTitle;
                                                        DtacFontTextView dtacFontTextView3 = (DtacFontTextView) ViewBindings.findChildViewById(view, i);
                                                        if (dtacFontTextView3 != null) {
                                                            return new FragmentSellerIdShopListBinding(coordinatorLayout, appBarLayout, collapsingToolbarLayout, linearLayout, linearLayout2, recyclerView, nestedScrollView, linearLayout3, linearLayout4, coordinatorLayout, linearLayout5, recyclerView2, dtacFontTextView, dtacFontTextView2, dtacFontTextView3);
                                                        }
                                                    }
                                                }
                                            }
                                        }
                                    }
                                }
                            }
                        }
                    }
                }
            }
        }
        throw new NullPointerException("Missing required view with ID: ".concat(view.getResources().getResourceName(i)));
    }

    @NonNull
    public static FragmentSellerIdShopListBinding inflate(@NonNull LayoutInflater layoutInflater) {
        return inflate(layoutInflater, null, false);
    }

    @NonNull
    public static FragmentSellerIdShopListBinding inflate(@NonNull LayoutInflater layoutInflater, @Nullable ViewGroup viewGroup, boolean z) {
        View inflate = layoutInflater.inflate(R.layout.fragment_seller_id_shop_list, viewGroup, false);
        if (z) {
            viewGroup.addView(inflate);
        }
        return bind(inflate);
    }

    @Override // androidx.viewbinding.ViewBinding
    @NonNull
    public CoordinatorLayout getRoot() {
        return this.f84189a;
    }
}

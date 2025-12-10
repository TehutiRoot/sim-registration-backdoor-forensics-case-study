package th.p047co.dtac.android.dtacone.databinding;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.constraintlayout.widget.ConstraintLayout;
import androidx.viewbinding.ViewBinding;
import androidx.viewbinding.ViewBindings;
import th.p047co.dtac.android.dtacone.R;
import th.p047co.dtac.android.dtacone.app_one.widget.OneFontTextView;
import th.p047co.dtac.android.dtacone.app_one.widget.loading.OneSwipeRefresh;

/* renamed from: th.co.dtac.android.dtacone.databinding.FragmentOneDeviceSaleAllPackageBinding */
/* loaded from: classes7.dex */
public final class FragmentOneDeviceSaleAllPackageBinding implements ViewBinding {

    /* renamed from: a */
    public final OneSwipeRefresh f84021a;
    @NonNull
    public final ConstraintLayout barNicenumber;
    @NonNull
    public final ConstraintLayout constraint;
    @NonNull
    public final OneIncludePackageSetBinding incPackageSet;
    @NonNull
    public final OneFontTextView minPriceValue1;
    @NonNull
    public final OneSwipeRefresh swipeRefreshLayout;
    @NonNull
    public final OneFontTextView tvTitle;

    public FragmentOneDeviceSaleAllPackageBinding(OneSwipeRefresh oneSwipeRefresh, ConstraintLayout constraintLayout, ConstraintLayout constraintLayout2, OneIncludePackageSetBinding oneIncludePackageSetBinding, OneFontTextView oneFontTextView, OneSwipeRefresh oneSwipeRefresh2, OneFontTextView oneFontTextView2) {
        this.f84021a = oneSwipeRefresh;
        this.barNicenumber = constraintLayout;
        this.constraint = constraintLayout2;
        this.incPackageSet = oneIncludePackageSetBinding;
        this.minPriceValue1 = oneFontTextView;
        this.swipeRefreshLayout = oneSwipeRefresh2;
        this.tvTitle = oneFontTextView2;
    }

    @NonNull
    public static FragmentOneDeviceSaleAllPackageBinding bind(@NonNull View view) {
        View findChildViewById;
        int i = R.id.bar_nicenumber;
        ConstraintLayout constraintLayout = (ConstraintLayout) ViewBindings.findChildViewById(view, i);
        if (constraintLayout != null) {
            i = R.id.constraint;
            ConstraintLayout constraintLayout2 = (ConstraintLayout) ViewBindings.findChildViewById(view, i);
            if (constraintLayout2 != null && (findChildViewById = ViewBindings.findChildViewById(view, (i = R.id.incPackageSet))) != null) {
                OneIncludePackageSetBinding bind = OneIncludePackageSetBinding.bind(findChildViewById);
                i = R.id.min_price_value1;
                OneFontTextView oneFontTextView = (OneFontTextView) ViewBindings.findChildViewById(view, i);
                if (oneFontTextView != null) {
                    OneSwipeRefresh oneSwipeRefresh = (OneSwipeRefresh) view;
                    i = R.id.tvTitle;
                    OneFontTextView oneFontTextView2 = (OneFontTextView) ViewBindings.findChildViewById(view, i);
                    if (oneFontTextView2 != null) {
                        return new FragmentOneDeviceSaleAllPackageBinding(oneSwipeRefresh, constraintLayout, constraintLayout2, bind, oneFontTextView, oneSwipeRefresh, oneFontTextView2);
                    }
                }
            }
        }
        throw new NullPointerException("Missing required view with ID: ".concat(view.getResources().getResourceName(i)));
    }

    @NonNull
    public static FragmentOneDeviceSaleAllPackageBinding inflate(@NonNull LayoutInflater layoutInflater) {
        return inflate(layoutInflater, null, false);
    }

    @NonNull
    public static FragmentOneDeviceSaleAllPackageBinding inflate(@NonNull LayoutInflater layoutInflater, @Nullable ViewGroup viewGroup, boolean z) {
        View inflate = layoutInflater.inflate(R.layout.fragment_one_device_sale_all_package, viewGroup, false);
        if (z) {
            viewGroup.addView(inflate);
        }
        return bind(inflate);
    }

    @Override // androidx.viewbinding.ViewBinding
    @NonNull
    public OneSwipeRefresh getRoot() {
        return this.f84021a;
    }
}
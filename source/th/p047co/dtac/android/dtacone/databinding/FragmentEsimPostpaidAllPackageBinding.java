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
import th.p047co.dtac.android.dtacone.widget.loading.DtacSwipeRefresh;
import th.p047co.dtac.android.dtacone.widget.view.DtacFontTextView;

/* renamed from: th.co.dtac.android.dtacone.databinding.FragmentEsimPostpaidAllPackageBinding */
/* loaded from: classes7.dex */
public final class FragmentEsimPostpaidAllPackageBinding implements ViewBinding {

    /* renamed from: a */
    public final DtacSwipeRefresh f83725a;
    @NonNull
    public final ConstraintLayout barNicenumber;
    @NonNull
    public final ConstraintLayout constraint;
    @NonNull
    public final ZIncludePackageSetBinding incPackageSet;
    @NonNull
    public final DtacFontTextView minPriceValue1;
    @NonNull
    public final DtacSwipeRefresh swipeRefreshLayout;
    @NonNull
    public final DtacFontTextView tvTitle;

    public FragmentEsimPostpaidAllPackageBinding(DtacSwipeRefresh dtacSwipeRefresh, ConstraintLayout constraintLayout, ConstraintLayout constraintLayout2, ZIncludePackageSetBinding zIncludePackageSetBinding, DtacFontTextView dtacFontTextView, DtacSwipeRefresh dtacSwipeRefresh2, DtacFontTextView dtacFontTextView2) {
        this.f83725a = dtacSwipeRefresh;
        this.barNicenumber = constraintLayout;
        this.constraint = constraintLayout2;
        this.incPackageSet = zIncludePackageSetBinding;
        this.minPriceValue1 = dtacFontTextView;
        this.swipeRefreshLayout = dtacSwipeRefresh2;
        this.tvTitle = dtacFontTextView2;
    }

    @NonNull
    public static FragmentEsimPostpaidAllPackageBinding bind(@NonNull View view) {
        View findChildViewById;
        int i = R.id.bar_nicenumber;
        ConstraintLayout constraintLayout = (ConstraintLayout) ViewBindings.findChildViewById(view, i);
        if (constraintLayout != null) {
            i = R.id.constraint;
            ConstraintLayout constraintLayout2 = (ConstraintLayout) ViewBindings.findChildViewById(view, i);
            if (constraintLayout2 != null && (findChildViewById = ViewBindings.findChildViewById(view, (i = R.id.incPackageSet))) != null) {
                ZIncludePackageSetBinding bind = ZIncludePackageSetBinding.bind(findChildViewById);
                i = R.id.min_price_value1;
                DtacFontTextView dtacFontTextView = (DtacFontTextView) ViewBindings.findChildViewById(view, i);
                if (dtacFontTextView != null) {
                    DtacSwipeRefresh dtacSwipeRefresh = (DtacSwipeRefresh) view;
                    i = R.id.tvTitle;
                    DtacFontTextView dtacFontTextView2 = (DtacFontTextView) ViewBindings.findChildViewById(view, i);
                    if (dtacFontTextView2 != null) {
                        return new FragmentEsimPostpaidAllPackageBinding(dtacSwipeRefresh, constraintLayout, constraintLayout2, bind, dtacFontTextView, dtacSwipeRefresh, dtacFontTextView2);
                    }
                }
            }
        }
        throw new NullPointerException("Missing required view with ID: ".concat(view.getResources().getResourceName(i)));
    }

    @NonNull
    public static FragmentEsimPostpaidAllPackageBinding inflate(@NonNull LayoutInflater layoutInflater) {
        return inflate(layoutInflater, null, false);
    }

    @NonNull
    public static FragmentEsimPostpaidAllPackageBinding inflate(@NonNull LayoutInflater layoutInflater, @Nullable ViewGroup viewGroup, boolean z) {
        View inflate = layoutInflater.inflate(R.layout.fragment_esim_postpaid_all_package, viewGroup, false);
        if (z) {
            viewGroup.addView(inflate);
        }
        return bind(inflate);
    }

    @Override // androidx.viewbinding.ViewBinding
    @NonNull
    public DtacSwipeRefresh getRoot() {
        return this.f83725a;
    }
}

package th.p047co.dtac.android.dtacone.databinding;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.FrameLayout;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.constraintlayout.widget.ConstraintLayout;
import androidx.recyclerview.widget.RecyclerView;
import androidx.viewbinding.ViewBinding;
import androidx.viewbinding.ViewBindings;
import th.p047co.dtac.android.dtacone.R;
import th.p047co.dtac.android.dtacone.widget.loading.DtacSwipeRefresh;
import th.p047co.dtac.android.dtacone.widget.view.DtacFontTextView;

/* renamed from: th.co.dtac.android.dtacone.databinding.FragmentMrtrPostpaidDxPackageBinding */
/* loaded from: classes7.dex */
public final class FragmentMrtrPostpaidDxPackageBinding implements ViewBinding {

    /* renamed from: a */
    public final FrameLayout f83824a;
    @NonNull
    public final ConstraintLayout barNicenumber;
    @NonNull
    public final DtacFontTextView minPriceValue1;
    @NonNull
    public final RecyclerView packageListView;
    @NonNull
    public final DtacSwipeRefresh swipeRefreshLayout;
    @NonNull
    public final DtacFontTextView warningMessage;

    public FragmentMrtrPostpaidDxPackageBinding(FrameLayout frameLayout, ConstraintLayout constraintLayout, DtacFontTextView dtacFontTextView, RecyclerView recyclerView, DtacSwipeRefresh dtacSwipeRefresh, DtacFontTextView dtacFontTextView2) {
        this.f83824a = frameLayout;
        this.barNicenumber = constraintLayout;
        this.minPriceValue1 = dtacFontTextView;
        this.packageListView = recyclerView;
        this.swipeRefreshLayout = dtacSwipeRefresh;
        this.warningMessage = dtacFontTextView2;
    }

    @NonNull
    public static FragmentMrtrPostpaidDxPackageBinding bind(@NonNull View view) {
        int i = R.id.bar_nicenumber;
        ConstraintLayout constraintLayout = (ConstraintLayout) ViewBindings.findChildViewById(view, i);
        if (constraintLayout != null) {
            i = R.id.min_price_value1;
            DtacFontTextView dtacFontTextView = (DtacFontTextView) ViewBindings.findChildViewById(view, i);
            if (dtacFontTextView != null) {
                i = R.id.packageListView;
                RecyclerView recyclerView = (RecyclerView) ViewBindings.findChildViewById(view, i);
                if (recyclerView != null) {
                    i = R.id.swipeRefreshLayout;
                    DtacSwipeRefresh dtacSwipeRefresh = (DtacSwipeRefresh) ViewBindings.findChildViewById(view, i);
                    if (dtacSwipeRefresh != null) {
                        i = R.id.warningMessage;
                        DtacFontTextView dtacFontTextView2 = (DtacFontTextView) ViewBindings.findChildViewById(view, i);
                        if (dtacFontTextView2 != null) {
                            return new FragmentMrtrPostpaidDxPackageBinding((FrameLayout) view, constraintLayout, dtacFontTextView, recyclerView, dtacSwipeRefresh, dtacFontTextView2);
                        }
                    }
                }
            }
        }
        throw new NullPointerException("Missing required view with ID: ".concat(view.getResources().getResourceName(i)));
    }

    @NonNull
    public static FragmentMrtrPostpaidDxPackageBinding inflate(@NonNull LayoutInflater layoutInflater) {
        return inflate(layoutInflater, null, false);
    }

    @NonNull
    public static FragmentMrtrPostpaidDxPackageBinding inflate(@NonNull LayoutInflater layoutInflater, @Nullable ViewGroup viewGroup, boolean z) {
        View inflate = layoutInflater.inflate(R.layout.fragment_mrtr_postpaid_dx_package, viewGroup, false);
        if (z) {
            viewGroup.addView(inflate);
        }
        return bind(inflate);
    }

    @Override // androidx.viewbinding.ViewBinding
    @NonNull
    public FrameLayout getRoot() {
        return this.f83824a;
    }
}

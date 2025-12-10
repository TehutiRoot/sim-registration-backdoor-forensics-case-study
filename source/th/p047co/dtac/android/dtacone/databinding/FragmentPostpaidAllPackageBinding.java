package th.p047co.dtac.android.dtacone.databinding;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.constraintlayout.widget.ConstraintLayout;
import androidx.viewbinding.ViewBinding;
import androidx.viewbinding.ViewBindings;
import com.google.android.material.floatingactionbutton.FloatingActionButton;
import th.p047co.dtac.android.dtacone.R;
import th.p047co.dtac.android.dtacone.widget.view.DtacFontTextView;

/* renamed from: th.co.dtac.android.dtacone.databinding.FragmentPostpaidAllPackageBinding */
/* loaded from: classes7.dex */
public final class FragmentPostpaidAllPackageBinding implements ViewBinding {

    /* renamed from: a */
    public final ConstraintLayout f84141a;
    @NonNull
    public final ConstraintLayout barNicenumber;
    @NonNull
    public final ConstraintLayout constraint;
    @NonNull
    public final FloatingActionButton fabSearch;
    @NonNull
    public final ZIncludePackageSetBinding incPackageSet;
    @NonNull
    public final DtacFontTextView minPriceValue1;
    @NonNull
    public final DtacFontTextView tvTitle;

    public FragmentPostpaidAllPackageBinding(ConstraintLayout constraintLayout, ConstraintLayout constraintLayout2, ConstraintLayout constraintLayout3, FloatingActionButton floatingActionButton, ZIncludePackageSetBinding zIncludePackageSetBinding, DtacFontTextView dtacFontTextView, DtacFontTextView dtacFontTextView2) {
        this.f84141a = constraintLayout;
        this.barNicenumber = constraintLayout2;
        this.constraint = constraintLayout3;
        this.fabSearch = floatingActionButton;
        this.incPackageSet = zIncludePackageSetBinding;
        this.minPriceValue1 = dtacFontTextView;
        this.tvTitle = dtacFontTextView2;
    }

    @NonNull
    public static FragmentPostpaidAllPackageBinding bind(@NonNull View view) {
        View findChildViewById;
        int i = R.id.bar_nicenumber;
        ConstraintLayout constraintLayout = (ConstraintLayout) ViewBindings.findChildViewById(view, i);
        if (constraintLayout != null) {
            ConstraintLayout constraintLayout2 = (ConstraintLayout) view;
            i = R.id.fabSearch;
            FloatingActionButton floatingActionButton = (FloatingActionButton) ViewBindings.findChildViewById(view, i);
            if (floatingActionButton != null && (findChildViewById = ViewBindings.findChildViewById(view, (i = R.id.incPackageSet))) != null) {
                ZIncludePackageSetBinding bind = ZIncludePackageSetBinding.bind(findChildViewById);
                i = R.id.min_price_value1;
                DtacFontTextView dtacFontTextView = (DtacFontTextView) ViewBindings.findChildViewById(view, i);
                if (dtacFontTextView != null) {
                    i = R.id.tvTitle;
                    DtacFontTextView dtacFontTextView2 = (DtacFontTextView) ViewBindings.findChildViewById(view, i);
                    if (dtacFontTextView2 != null) {
                        return new FragmentPostpaidAllPackageBinding(constraintLayout2, constraintLayout, constraintLayout2, floatingActionButton, bind, dtacFontTextView, dtacFontTextView2);
                    }
                }
            }
        }
        throw new NullPointerException("Missing required view with ID: ".concat(view.getResources().getResourceName(i)));
    }

    @NonNull
    public static FragmentPostpaidAllPackageBinding inflate(@NonNull LayoutInflater layoutInflater) {
        return inflate(layoutInflater, null, false);
    }

    @NonNull
    public static FragmentPostpaidAllPackageBinding inflate(@NonNull LayoutInflater layoutInflater, @Nullable ViewGroup viewGroup, boolean z) {
        View inflate = layoutInflater.inflate(R.layout.fragment_postpaid_all_package, viewGroup, false);
        if (z) {
            viewGroup.addView(inflate);
        }
        return bind(inflate);
    }

    @Override // androidx.viewbinding.ViewBinding
    @NonNull
    public ConstraintLayout getRoot() {
        return this.f84141a;
    }
}

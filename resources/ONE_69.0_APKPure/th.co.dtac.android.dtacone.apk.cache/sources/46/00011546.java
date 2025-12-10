package th.p047co.dtac.android.dtacone.databinding;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.LinearLayout;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.constraintlayout.widget.ConstraintLayout;
import androidx.core.widget.NestedScrollView;
import androidx.viewbinding.ViewBinding;
import androidx.viewbinding.ViewBindings;
import th.p047co.dtac.android.dtacone.R;
import th.p047co.dtac.android.dtacone.widget.view.DtacFontTextView;

/* renamed from: th.co.dtac.android.dtacone.databinding.FragmentEsimPostpaidDxDefaultPackageBinding */
/* loaded from: classes7.dex */
public final class FragmentEsimPostpaidDxDefaultPackageBinding implements ViewBinding {

    /* renamed from: a */
    public final NestedScrollView f83828a;
    @NonNull
    public final LinearLayout allPackageBox;
    @NonNull
    public final ConstraintLayout barNicenumber;
    @NonNull
    public final LinearLayout layoutInput;
    @NonNull
    public final DtacFontTextView minPriceValue1;
    @NonNull
    public final DtacFontTextView tvTitle;

    public FragmentEsimPostpaidDxDefaultPackageBinding(NestedScrollView nestedScrollView, LinearLayout linearLayout, ConstraintLayout constraintLayout, LinearLayout linearLayout2, DtacFontTextView dtacFontTextView, DtacFontTextView dtacFontTextView2) {
        this.f83828a = nestedScrollView;
        this.allPackageBox = linearLayout;
        this.barNicenumber = constraintLayout;
        this.layoutInput = linearLayout2;
        this.minPriceValue1 = dtacFontTextView;
        this.tvTitle = dtacFontTextView2;
    }

    @NonNull
    public static FragmentEsimPostpaidDxDefaultPackageBinding bind(@NonNull View view) {
        int i = R.id.allPackageBox;
        LinearLayout linearLayout = (LinearLayout) ViewBindings.findChildViewById(view, i);
        if (linearLayout != null) {
            i = R.id.bar_nicenumber;
            ConstraintLayout constraintLayout = (ConstraintLayout) ViewBindings.findChildViewById(view, i);
            if (constraintLayout != null) {
                i = R.id.layoutInput;
                LinearLayout linearLayout2 = (LinearLayout) ViewBindings.findChildViewById(view, i);
                if (linearLayout2 != null) {
                    i = R.id.min_price_value1;
                    DtacFontTextView dtacFontTextView = (DtacFontTextView) ViewBindings.findChildViewById(view, i);
                    if (dtacFontTextView != null) {
                        i = R.id.tvTitle;
                        DtacFontTextView dtacFontTextView2 = (DtacFontTextView) ViewBindings.findChildViewById(view, i);
                        if (dtacFontTextView2 != null) {
                            return new FragmentEsimPostpaidDxDefaultPackageBinding((NestedScrollView) view, linearLayout, constraintLayout, linearLayout2, dtacFontTextView, dtacFontTextView2);
                        }
                    }
                }
            }
        }
        throw new NullPointerException("Missing required view with ID: ".concat(view.getResources().getResourceName(i)));
    }

    @NonNull
    public static FragmentEsimPostpaidDxDefaultPackageBinding inflate(@NonNull LayoutInflater layoutInflater) {
        return inflate(layoutInflater, null, false);
    }

    @NonNull
    public static FragmentEsimPostpaidDxDefaultPackageBinding inflate(@NonNull LayoutInflater layoutInflater, @Nullable ViewGroup viewGroup, boolean z) {
        View inflate = layoutInflater.inflate(R.layout.fragment_esim_postpaid_dx_default_package, viewGroup, false);
        if (z) {
            viewGroup.addView(inflate);
        }
        return bind(inflate);
    }

    @Override // androidx.viewbinding.ViewBinding
    @NonNull
    public NestedScrollView getRoot() {
        return this.f83828a;
    }
}
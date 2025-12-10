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

/* renamed from: th.co.dtac.android.dtacone.databinding.FragmentMrtrPostpaidDxDefaultPackageBinding */
/* loaded from: classes7.dex */
public final class FragmentMrtrPostpaidDxDefaultPackageBinding implements ViewBinding {

    /* renamed from: a */
    public final NestedScrollView f83921a;
    @NonNull
    public final LinearLayout allPackageBox;
    @NonNull
    public final ConstraintLayout barNicenumber;
    @NonNull
    public final ItemPackageRowAllSelectButtonBinding itemPackage;
    @NonNull
    public final LinearLayout layoutInput;
    @NonNull
    public final DtacFontTextView minPriceValue1;
    @NonNull
    public final DtacFontTextView tvTitle;
    @NonNull
    public final DtacFontTextView tvWarningSpecialPack;

    public FragmentMrtrPostpaidDxDefaultPackageBinding(NestedScrollView nestedScrollView, LinearLayout linearLayout, ConstraintLayout constraintLayout, ItemPackageRowAllSelectButtonBinding itemPackageRowAllSelectButtonBinding, LinearLayout linearLayout2, DtacFontTextView dtacFontTextView, DtacFontTextView dtacFontTextView2, DtacFontTextView dtacFontTextView3) {
        this.f83921a = nestedScrollView;
        this.allPackageBox = linearLayout;
        this.barNicenumber = constraintLayout;
        this.itemPackage = itemPackageRowAllSelectButtonBinding;
        this.layoutInput = linearLayout2;
        this.minPriceValue1 = dtacFontTextView;
        this.tvTitle = dtacFontTextView2;
        this.tvWarningSpecialPack = dtacFontTextView3;
    }

    @NonNull
    public static FragmentMrtrPostpaidDxDefaultPackageBinding bind(@NonNull View view) {
        View findChildViewById;
        int i = R.id.allPackageBox;
        LinearLayout linearLayout = (LinearLayout) ViewBindings.findChildViewById(view, i);
        if (linearLayout != null) {
            i = R.id.bar_nicenumber;
            ConstraintLayout constraintLayout = (ConstraintLayout) ViewBindings.findChildViewById(view, i);
            if (constraintLayout != null && (findChildViewById = ViewBindings.findChildViewById(view, (i = R.id.itemPackage))) != null) {
                ItemPackageRowAllSelectButtonBinding bind = ItemPackageRowAllSelectButtonBinding.bind(findChildViewById);
                i = R.id.layoutInput;
                LinearLayout linearLayout2 = (LinearLayout) ViewBindings.findChildViewById(view, i);
                if (linearLayout2 != null) {
                    i = R.id.min_price_value1;
                    DtacFontTextView dtacFontTextView = (DtacFontTextView) ViewBindings.findChildViewById(view, i);
                    if (dtacFontTextView != null) {
                        i = R.id.tvTitle;
                        DtacFontTextView dtacFontTextView2 = (DtacFontTextView) ViewBindings.findChildViewById(view, i);
                        if (dtacFontTextView2 != null) {
                            i = R.id.tvWarningSpecialPack;
                            DtacFontTextView dtacFontTextView3 = (DtacFontTextView) ViewBindings.findChildViewById(view, i);
                            if (dtacFontTextView3 != null) {
                                return new FragmentMrtrPostpaidDxDefaultPackageBinding((NestedScrollView) view, linearLayout, constraintLayout, bind, linearLayout2, dtacFontTextView, dtacFontTextView2, dtacFontTextView3);
                            }
                        }
                    }
                }
            }
        }
        throw new NullPointerException("Missing required view with ID: ".concat(view.getResources().getResourceName(i)));
    }

    @NonNull
    public static FragmentMrtrPostpaidDxDefaultPackageBinding inflate(@NonNull LayoutInflater layoutInflater) {
        return inflate(layoutInflater, null, false);
    }

    @NonNull
    public static FragmentMrtrPostpaidDxDefaultPackageBinding inflate(@NonNull LayoutInflater layoutInflater, @Nullable ViewGroup viewGroup, boolean z) {
        View inflate = layoutInflater.inflate(R.layout.fragment_mrtr_postpaid_dx_default_package, viewGroup, false);
        if (z) {
            viewGroup.addView(inflate);
        }
        return bind(inflate);
    }

    @Override // androidx.viewbinding.ViewBinding
    @NonNull
    public NestedScrollView getRoot() {
        return this.f83921a;
    }
}
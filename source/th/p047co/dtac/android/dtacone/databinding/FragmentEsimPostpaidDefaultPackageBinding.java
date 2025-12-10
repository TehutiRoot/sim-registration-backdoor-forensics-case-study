package th.p047co.dtac.android.dtacone.databinding;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.LinearLayout;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.constraintlayout.widget.ConstraintLayout;
import androidx.viewbinding.ViewBinding;
import androidx.viewbinding.ViewBindings;
import th.p047co.dtac.android.dtacone.R;
import th.p047co.dtac.android.dtacone.widget.view.DtacFontTextView;

/* renamed from: th.co.dtac.android.dtacone.databinding.FragmentEsimPostpaidDefaultPackageBinding */
/* loaded from: classes7.dex */
public final class FragmentEsimPostpaidDefaultPackageBinding implements ViewBinding {

    /* renamed from: a */
    public final ConstraintLayout f83729a;
    @NonNull
    public final LinearLayout allPackageBox;
    @NonNull
    public final ConstraintLayout barNicenumber;
    @NonNull
    public final ZPostpaidPackageItemRowBinding include;
    @NonNull
    public final DtacFontTextView minPriceValue1;
    @NonNull
    public final DtacFontTextView tvTitle;

    public FragmentEsimPostpaidDefaultPackageBinding(ConstraintLayout constraintLayout, LinearLayout linearLayout, ConstraintLayout constraintLayout2, ZPostpaidPackageItemRowBinding zPostpaidPackageItemRowBinding, DtacFontTextView dtacFontTextView, DtacFontTextView dtacFontTextView2) {
        this.f83729a = constraintLayout;
        this.allPackageBox = linearLayout;
        this.barNicenumber = constraintLayout2;
        this.include = zPostpaidPackageItemRowBinding;
        this.minPriceValue1 = dtacFontTextView;
        this.tvTitle = dtacFontTextView2;
    }

    @NonNull
    public static FragmentEsimPostpaidDefaultPackageBinding bind(@NonNull View view) {
        View findChildViewById;
        int i = R.id.allPackageBox;
        LinearLayout linearLayout = (LinearLayout) ViewBindings.findChildViewById(view, i);
        if (linearLayout != null) {
            i = R.id.bar_nicenumber;
            ConstraintLayout constraintLayout = (ConstraintLayout) ViewBindings.findChildViewById(view, i);
            if (constraintLayout != null && (findChildViewById = ViewBindings.findChildViewById(view, (i = R.id.include))) != null) {
                ZPostpaidPackageItemRowBinding bind = ZPostpaidPackageItemRowBinding.bind(findChildViewById);
                i = R.id.min_price_value1;
                DtacFontTextView dtacFontTextView = (DtacFontTextView) ViewBindings.findChildViewById(view, i);
                if (dtacFontTextView != null) {
                    i = R.id.tvTitle;
                    DtacFontTextView dtacFontTextView2 = (DtacFontTextView) ViewBindings.findChildViewById(view, i);
                    if (dtacFontTextView2 != null) {
                        return new FragmentEsimPostpaidDefaultPackageBinding((ConstraintLayout) view, linearLayout, constraintLayout, bind, dtacFontTextView, dtacFontTextView2);
                    }
                }
            }
        }
        throw new NullPointerException("Missing required view with ID: ".concat(view.getResources().getResourceName(i)));
    }

    @NonNull
    public static FragmentEsimPostpaidDefaultPackageBinding inflate(@NonNull LayoutInflater layoutInflater) {
        return inflate(layoutInflater, null, false);
    }

    @NonNull
    public static FragmentEsimPostpaidDefaultPackageBinding inflate(@NonNull LayoutInflater layoutInflater, @Nullable ViewGroup viewGroup, boolean z) {
        View inflate = layoutInflater.inflate(R.layout.fragment_esim_postpaid_default_package, viewGroup, false);
        if (z) {
            viewGroup.addView(inflate);
        }
        return bind(inflate);
    }

    @Override // androidx.viewbinding.ViewBinding
    @NonNull
    public ConstraintLayout getRoot() {
        return this.f83729a;
    }
}

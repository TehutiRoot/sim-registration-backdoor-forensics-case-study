package th.p047co.dtac.android.dtacone.databinding;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.LinearLayout;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.constraintlayout.widget.ConstraintLayout;
import androidx.viewbinding.ViewBinding;
import androidx.viewbinding.ViewBindings;
import th.p047co.dtac.android.dtacone.R;
import th.p047co.dtac.android.dtacone.widget.BigRadioButton;
import th.p047co.dtac.android.dtacone.widget.BigTabLayout;
import th.p047co.dtac.android.dtacone.widget.view.DtacFontButton;
import th.p047co.dtac.android.dtacone.widget.view.DtacFontTextView;

/* renamed from: th.co.dtac.android.dtacone.databinding.FragmentChangePackSelectPackageBinding */
/* loaded from: classes7.dex */
public final class FragmentChangePackSelectPackageBinding implements ViewBinding {

    /* renamed from: a */
    public final ConstraintLayout f83669a;
    @NonNull
    public final ImageView arrow;
    @NonNull
    public final DtacFontButton confirmChangePackage;
    @NonNull
    public final ImageView iconUpsell;
    @NonNull
    public final ImageView imageView9;
    @NonNull
    public final LinearLayout layoutSelectStartDate;
    @NonNull
    public final BigRadioButton nxclRadio;
    @NonNull
    public final BigRadioButton nxdyRadio;
    @NonNull
    public final DtacFontTextView packageItem;
    @NonNull
    public final DtacFontTextView selectPackageTitle;
    @NonNull
    public final DtacFontTextView selectStartDateTitle;
    @NonNull
    public final ConstraintLayout selectedPackageView;
    @NonNull
    public final ConstraintLayout selectedUpSellPackageView;
    @NonNull
    public final BigTabLayout tabChangePackage;
    @NonNull
    public final DtacFontTextView textViewLocationName;
    @NonNull
    public final DtacFontTextView textViewPackageName;
    @NonNull
    public final DtacFontTextView textViewSelectPackage;

    public FragmentChangePackSelectPackageBinding(ConstraintLayout constraintLayout, ImageView imageView, DtacFontButton dtacFontButton, ImageView imageView2, ImageView imageView3, LinearLayout linearLayout, BigRadioButton bigRadioButton, BigRadioButton bigRadioButton2, DtacFontTextView dtacFontTextView, DtacFontTextView dtacFontTextView2, DtacFontTextView dtacFontTextView3, ConstraintLayout constraintLayout2, ConstraintLayout constraintLayout3, BigTabLayout bigTabLayout, DtacFontTextView dtacFontTextView4, DtacFontTextView dtacFontTextView5, DtacFontTextView dtacFontTextView6) {
        this.f83669a = constraintLayout;
        this.arrow = imageView;
        this.confirmChangePackage = dtacFontButton;
        this.iconUpsell = imageView2;
        this.imageView9 = imageView3;
        this.layoutSelectStartDate = linearLayout;
        this.nxclRadio = bigRadioButton;
        this.nxdyRadio = bigRadioButton2;
        this.packageItem = dtacFontTextView;
        this.selectPackageTitle = dtacFontTextView2;
        this.selectStartDateTitle = dtacFontTextView3;
        this.selectedPackageView = constraintLayout2;
        this.selectedUpSellPackageView = constraintLayout3;
        this.tabChangePackage = bigTabLayout;
        this.textViewLocationName = dtacFontTextView4;
        this.textViewPackageName = dtacFontTextView5;
        this.textViewSelectPackage = dtacFontTextView6;
    }

    @NonNull
    public static FragmentChangePackSelectPackageBinding bind(@NonNull View view) {
        int i = R.id.arrow;
        ImageView imageView = (ImageView) ViewBindings.findChildViewById(view, i);
        if (imageView != null) {
            i = R.id.confirmChangePackage;
            DtacFontButton dtacFontButton = (DtacFontButton) ViewBindings.findChildViewById(view, i);
            if (dtacFontButton != null) {
                i = R.id.iconUpsell;
                ImageView imageView2 = (ImageView) ViewBindings.findChildViewById(view, i);
                if (imageView2 != null) {
                    i = R.id.imageView9;
                    ImageView imageView3 = (ImageView) ViewBindings.findChildViewById(view, i);
                    if (imageView3 != null) {
                        i = R.id.layoutSelectStartDate;
                        LinearLayout linearLayout = (LinearLayout) ViewBindings.findChildViewById(view, i);
                        if (linearLayout != null) {
                            i = R.id.nxclRadio;
                            BigRadioButton bigRadioButton = (BigRadioButton) ViewBindings.findChildViewById(view, i);
                            if (bigRadioButton != null) {
                                i = R.id.nxdyRadio;
                                BigRadioButton bigRadioButton2 = (BigRadioButton) ViewBindings.findChildViewById(view, i);
                                if (bigRadioButton2 != null) {
                                    i = R.id.packageItem;
                                    DtacFontTextView dtacFontTextView = (DtacFontTextView) ViewBindings.findChildViewById(view, i);
                                    if (dtacFontTextView != null) {
                                        i = R.id.selectPackageTitle;
                                        DtacFontTextView dtacFontTextView2 = (DtacFontTextView) ViewBindings.findChildViewById(view, i);
                                        if (dtacFontTextView2 != null) {
                                            i = R.id.selectStartDateTitle;
                                            DtacFontTextView dtacFontTextView3 = (DtacFontTextView) ViewBindings.findChildViewById(view, i);
                                            if (dtacFontTextView3 != null) {
                                                i = R.id.selectedPackageView;
                                                ConstraintLayout constraintLayout = (ConstraintLayout) ViewBindings.findChildViewById(view, i);
                                                if (constraintLayout != null) {
                                                    i = R.id.selectedUpSellPackageView;
                                                    ConstraintLayout constraintLayout2 = (ConstraintLayout) ViewBindings.findChildViewById(view, i);
                                                    if (constraintLayout2 != null) {
                                                        i = R.id.tabChangePackage;
                                                        BigTabLayout bigTabLayout = (BigTabLayout) ViewBindings.findChildViewById(view, i);
                                                        if (bigTabLayout != null) {
                                                            i = R.id.textViewLocationName;
                                                            DtacFontTextView dtacFontTextView4 = (DtacFontTextView) ViewBindings.findChildViewById(view, i);
                                                            if (dtacFontTextView4 != null) {
                                                                i = R.id.textViewPackageName;
                                                                DtacFontTextView dtacFontTextView5 = (DtacFontTextView) ViewBindings.findChildViewById(view, i);
                                                                if (dtacFontTextView5 != null) {
                                                                    i = R.id.textViewSelectPackage;
                                                                    DtacFontTextView dtacFontTextView6 = (DtacFontTextView) ViewBindings.findChildViewById(view, i);
                                                                    if (dtacFontTextView6 != null) {
                                                                        return new FragmentChangePackSelectPackageBinding((ConstraintLayout) view, imageView, dtacFontButton, imageView2, imageView3, linearLayout, bigRadioButton, bigRadioButton2, dtacFontTextView, dtacFontTextView2, dtacFontTextView3, constraintLayout, constraintLayout2, bigTabLayout, dtacFontTextView4, dtacFontTextView5, dtacFontTextView6);
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
                }
            }
        }
        throw new NullPointerException("Missing required view with ID: ".concat(view.getResources().getResourceName(i)));
    }

    @NonNull
    public static FragmentChangePackSelectPackageBinding inflate(@NonNull LayoutInflater layoutInflater) {
        return inflate(layoutInflater, null, false);
    }

    @NonNull
    public static FragmentChangePackSelectPackageBinding inflate(@NonNull LayoutInflater layoutInflater, @Nullable ViewGroup viewGroup, boolean z) {
        View inflate = layoutInflater.inflate(R.layout.fragment_change_pack_select_package, viewGroup, false);
        if (z) {
            viewGroup.addView(inflate);
        }
        return bind(inflate);
    }

    @Override // androidx.viewbinding.ViewBinding
    @NonNull
    public ConstraintLayout getRoot() {
        return this.f83669a;
    }
}

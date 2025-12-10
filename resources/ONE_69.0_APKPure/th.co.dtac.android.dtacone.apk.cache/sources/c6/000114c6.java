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
import th.p047co.dtac.android.dtacone.widget.view.DtacFontButton;
import th.p047co.dtac.android.dtacone.widget.view.DtacFontTextView;

/* renamed from: th.co.dtac.android.dtacone.databinding.BottomSheetFeeBinding */
/* loaded from: classes7.dex */
public final class BottomSheetFeeBinding implements ViewBinding {

    /* renamed from: a */
    public final LinearLayout f83697a;
    @NonNull
    public final LinearLayout bottomSheet;
    @NonNull
    public final DtacFontTextView bottomSheetHeader;
    @NonNull
    public final DtacFontButton buttonFee;
    @NonNull
    public final DtacFontButton buttonFree;
    @NonNull
    public final ConstraintLayout layoutButtonFee;
    @NonNull
    public final DtacFontTextView packageInformation;
    @NonNull
    public final DtacFontTextView packageTitle;

    public BottomSheetFeeBinding(LinearLayout linearLayout, LinearLayout linearLayout2, DtacFontTextView dtacFontTextView, DtacFontButton dtacFontButton, DtacFontButton dtacFontButton2, ConstraintLayout constraintLayout, DtacFontTextView dtacFontTextView2, DtacFontTextView dtacFontTextView3) {
        this.f83697a = linearLayout;
        this.bottomSheet = linearLayout2;
        this.bottomSheetHeader = dtacFontTextView;
        this.buttonFee = dtacFontButton;
        this.buttonFree = dtacFontButton2;
        this.layoutButtonFee = constraintLayout;
        this.packageInformation = dtacFontTextView2;
        this.packageTitle = dtacFontTextView3;
    }

    @NonNull
    public static BottomSheetFeeBinding bind(@NonNull View view) {
        LinearLayout linearLayout = (LinearLayout) view;
        int i = R.id.bottomSheetHeader;
        DtacFontTextView dtacFontTextView = (DtacFontTextView) ViewBindings.findChildViewById(view, i);
        if (dtacFontTextView != null) {
            i = R.id.buttonFee;
            DtacFontButton dtacFontButton = (DtacFontButton) ViewBindings.findChildViewById(view, i);
            if (dtacFontButton != null) {
                i = R.id.buttonFree;
                DtacFontButton dtacFontButton2 = (DtacFontButton) ViewBindings.findChildViewById(view, i);
                if (dtacFontButton2 != null) {
                    i = R.id.layoutButtonFee;
                    ConstraintLayout constraintLayout = (ConstraintLayout) ViewBindings.findChildViewById(view, i);
                    if (constraintLayout != null) {
                        i = R.id.packageInformation;
                        DtacFontTextView dtacFontTextView2 = (DtacFontTextView) ViewBindings.findChildViewById(view, i);
                        if (dtacFontTextView2 != null) {
                            i = R.id.package_title;
                            DtacFontTextView dtacFontTextView3 = (DtacFontTextView) ViewBindings.findChildViewById(view, i);
                            if (dtacFontTextView3 != null) {
                                return new BottomSheetFeeBinding(linearLayout, linearLayout, dtacFontTextView, dtacFontButton, dtacFontButton2, constraintLayout, dtacFontTextView2, dtacFontTextView3);
                            }
                        }
                    }
                }
            }
        }
        throw new NullPointerException("Missing required view with ID: ".concat(view.getResources().getResourceName(i)));
    }

    @NonNull
    public static BottomSheetFeeBinding inflate(@NonNull LayoutInflater layoutInflater) {
        return inflate(layoutInflater, null, false);
    }

    @NonNull
    public static BottomSheetFeeBinding inflate(@NonNull LayoutInflater layoutInflater, @Nullable ViewGroup viewGroup, boolean z) {
        View inflate = layoutInflater.inflate(R.layout.bottom_sheet_fee, viewGroup, false);
        if (z) {
            viewGroup.addView(inflate);
        }
        return bind(inflate);
    }

    @Override // androidx.viewbinding.ViewBinding
    @NonNull
    public LinearLayout getRoot() {
        return this.f83697a;
    }
}
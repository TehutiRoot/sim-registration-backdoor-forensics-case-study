package th.p047co.dtac.android.dtacone.databinding;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.LinearLayout;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.viewbinding.ViewBinding;
import androidx.viewbinding.ViewBindings;
import th.p047co.dtac.android.dtacone.R;
import th.p047co.dtac.android.dtacone.widget.view.DtacFontTextView;

/* renamed from: th.co.dtac.android.dtacone.databinding.EnquiryPackageRowAllBinding */
/* loaded from: classes7.dex */
public final class EnquiryPackageRowAllBinding implements ViewBinding {

    /* renamed from: a */
    public final LinearLayout f83639a;
    @NonNull
    public final DtacFontTextView packageItem;

    public EnquiryPackageRowAllBinding(LinearLayout linearLayout, DtacFontTextView dtacFontTextView) {
        this.f83639a = linearLayout;
        this.packageItem = dtacFontTextView;
    }

    @NonNull
    public static EnquiryPackageRowAllBinding bind(@NonNull View view) {
        int i = R.id.packageItem;
        DtacFontTextView dtacFontTextView = (DtacFontTextView) ViewBindings.findChildViewById(view, i);
        if (dtacFontTextView != null) {
            return new EnquiryPackageRowAllBinding((LinearLayout) view, dtacFontTextView);
        }
        throw new NullPointerException("Missing required view with ID: ".concat(view.getResources().getResourceName(i)));
    }

    @NonNull
    public static EnquiryPackageRowAllBinding inflate(@NonNull LayoutInflater layoutInflater) {
        return inflate(layoutInflater, null, false);
    }

    @NonNull
    public static EnquiryPackageRowAllBinding inflate(@NonNull LayoutInflater layoutInflater, @Nullable ViewGroup viewGroup, boolean z) {
        View inflate = layoutInflater.inflate(R.layout.enquiry_package_row_all, viewGroup, false);
        if (z) {
            viewGroup.addView(inflate);
        }
        return bind(inflate);
    }

    @Override // androidx.viewbinding.ViewBinding
    @NonNull
    public LinearLayout getRoot() {
        return this.f83639a;
    }
}

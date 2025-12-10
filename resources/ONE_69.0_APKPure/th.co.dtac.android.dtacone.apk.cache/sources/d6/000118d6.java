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

/* renamed from: th.co.dtac.android.dtacone.databinding.ZIncludeMrtrHelperPhoneNumberBinding */
/* loaded from: classes7.dex */
public final class ZIncludeMrtrHelperPhoneNumberBinding implements ViewBinding {

    /* renamed from: a */
    public final LinearLayout f84741a;
    @NonNull
    public final DtacFontTextView tvHelper;
    @NonNull
    public final DtacFontTextView tvPhoneNumber;

    public ZIncludeMrtrHelperPhoneNumberBinding(LinearLayout linearLayout, DtacFontTextView dtacFontTextView, DtacFontTextView dtacFontTextView2) {
        this.f84741a = linearLayout;
        this.tvHelper = dtacFontTextView;
        this.tvPhoneNumber = dtacFontTextView2;
    }

    @NonNull
    public static ZIncludeMrtrHelperPhoneNumberBinding bind(@NonNull View view) {
        int i = R.id.tvHelper;
        DtacFontTextView dtacFontTextView = (DtacFontTextView) ViewBindings.findChildViewById(view, i);
        if (dtacFontTextView != null) {
            i = R.id.tvPhoneNumber;
            DtacFontTextView dtacFontTextView2 = (DtacFontTextView) ViewBindings.findChildViewById(view, i);
            if (dtacFontTextView2 != null) {
                return new ZIncludeMrtrHelperPhoneNumberBinding((LinearLayout) view, dtacFontTextView, dtacFontTextView2);
            }
        }
        throw new NullPointerException("Missing required view with ID: ".concat(view.getResources().getResourceName(i)));
    }

    @NonNull
    public static ZIncludeMrtrHelperPhoneNumberBinding inflate(@NonNull LayoutInflater layoutInflater) {
        return inflate(layoutInflater, null, false);
    }

    @NonNull
    public static ZIncludeMrtrHelperPhoneNumberBinding inflate(@NonNull LayoutInflater layoutInflater, @Nullable ViewGroup viewGroup, boolean z) {
        View inflate = layoutInflater.inflate(R.layout.z_include_mrtr_helper_phone_number, viewGroup, false);
        if (z) {
            viewGroup.addView(inflate);
        }
        return bind(inflate);
    }

    @Override // androidx.viewbinding.ViewBinding
    @NonNull
    public LinearLayout getRoot() {
        return this.f84741a;
    }
}
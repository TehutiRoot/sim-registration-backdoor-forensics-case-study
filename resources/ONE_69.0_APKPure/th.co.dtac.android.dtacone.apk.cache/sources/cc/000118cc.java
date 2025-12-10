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

/* renamed from: th.co.dtac.android.dtacone.databinding.ZIncludeHelperPhoneNumberBinding */
/* loaded from: classes7.dex */
public final class ZIncludeHelperPhoneNumberBinding implements ViewBinding {

    /* renamed from: a */
    public final LinearLayout f84731a;
    @NonNull
    public final DtacFontTextView p2postTvPhoneNumber;
    @NonNull
    public final DtacFontTextView tvHelper;

    public ZIncludeHelperPhoneNumberBinding(LinearLayout linearLayout, DtacFontTextView dtacFontTextView, DtacFontTextView dtacFontTextView2) {
        this.f84731a = linearLayout;
        this.p2postTvPhoneNumber = dtacFontTextView;
        this.tvHelper = dtacFontTextView2;
    }

    @NonNull
    public static ZIncludeHelperPhoneNumberBinding bind(@NonNull View view) {
        int i = R.id.p2post_tv_phone_number;
        DtacFontTextView dtacFontTextView = (DtacFontTextView) ViewBindings.findChildViewById(view, i);
        if (dtacFontTextView != null) {
            i = R.id.tvHelper;
            DtacFontTextView dtacFontTextView2 = (DtacFontTextView) ViewBindings.findChildViewById(view, i);
            if (dtacFontTextView2 != null) {
                return new ZIncludeHelperPhoneNumberBinding((LinearLayout) view, dtacFontTextView, dtacFontTextView2);
            }
        }
        throw new NullPointerException("Missing required view with ID: ".concat(view.getResources().getResourceName(i)));
    }

    @NonNull
    public static ZIncludeHelperPhoneNumberBinding inflate(@NonNull LayoutInflater layoutInflater) {
        return inflate(layoutInflater, null, false);
    }

    @NonNull
    public static ZIncludeHelperPhoneNumberBinding inflate(@NonNull LayoutInflater layoutInflater, @Nullable ViewGroup viewGroup, boolean z) {
        View inflate = layoutInflater.inflate(R.layout.z_include_helper_phone_number, viewGroup, false);
        if (z) {
            viewGroup.addView(inflate);
        }
        return bind(inflate);
    }

    @Override // androidx.viewbinding.ViewBinding
    @NonNull
    public LinearLayout getRoot() {
        return this.f84731a;
    }
}
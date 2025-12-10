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

/* renamed from: th.co.dtac.android.dtacone.databinding.ZIncludeRtrProfileBinding */
/* loaded from: classes7.dex */
public final class ZIncludeRtrProfileBinding implements ViewBinding {

    /* renamed from: a */
    public final LinearLayout f84650a;
    @NonNull
    public final ZDividerBinding dividerRtrCode;
    @NonNull
    public final DtacFontTextView tvAddress;
    @NonNull
    public final DtacFontTextView tvAddressLabel;
    @NonNull
    public final DtacFontTextView tvRtrCode;
    @NonNull
    public final DtacFontTextView tvRtrCodeLabel;
    @NonNull
    public final DtacFontTextView tvRtrName;
    @NonNull
    public final DtacFontTextView tvRtrNameLabel;

    public ZIncludeRtrProfileBinding(LinearLayout linearLayout, ZDividerBinding zDividerBinding, DtacFontTextView dtacFontTextView, DtacFontTextView dtacFontTextView2, DtacFontTextView dtacFontTextView3, DtacFontTextView dtacFontTextView4, DtacFontTextView dtacFontTextView5, DtacFontTextView dtacFontTextView6) {
        this.f84650a = linearLayout;
        this.dividerRtrCode = zDividerBinding;
        this.tvAddress = dtacFontTextView;
        this.tvAddressLabel = dtacFontTextView2;
        this.tvRtrCode = dtacFontTextView3;
        this.tvRtrCodeLabel = dtacFontTextView4;
        this.tvRtrName = dtacFontTextView5;
        this.tvRtrNameLabel = dtacFontTextView6;
    }

    @NonNull
    public static ZIncludeRtrProfileBinding bind(@NonNull View view) {
        int i = R.id.dividerRtrCode;
        View findChildViewById = ViewBindings.findChildViewById(view, i);
        if (findChildViewById != null) {
            ZDividerBinding bind = ZDividerBinding.bind(findChildViewById);
            i = R.id.tvAddress;
            DtacFontTextView dtacFontTextView = (DtacFontTextView) ViewBindings.findChildViewById(view, i);
            if (dtacFontTextView != null) {
                i = R.id.tvAddressLabel;
                DtacFontTextView dtacFontTextView2 = (DtacFontTextView) ViewBindings.findChildViewById(view, i);
                if (dtacFontTextView2 != null) {
                    i = R.id.tvRtrCode;
                    DtacFontTextView dtacFontTextView3 = (DtacFontTextView) ViewBindings.findChildViewById(view, i);
                    if (dtacFontTextView3 != null) {
                        i = R.id.tvRtrCodeLabel;
                        DtacFontTextView dtacFontTextView4 = (DtacFontTextView) ViewBindings.findChildViewById(view, i);
                        if (dtacFontTextView4 != null) {
                            i = R.id.tvRtrName;
                            DtacFontTextView dtacFontTextView5 = (DtacFontTextView) ViewBindings.findChildViewById(view, i);
                            if (dtacFontTextView5 != null) {
                                i = R.id.tvRtrNameLabel;
                                DtacFontTextView dtacFontTextView6 = (DtacFontTextView) ViewBindings.findChildViewById(view, i);
                                if (dtacFontTextView6 != null) {
                                    return new ZIncludeRtrProfileBinding((LinearLayout) view, bind, dtacFontTextView, dtacFontTextView2, dtacFontTextView3, dtacFontTextView4, dtacFontTextView5, dtacFontTextView6);
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
    public static ZIncludeRtrProfileBinding inflate(@NonNull LayoutInflater layoutInflater) {
        return inflate(layoutInflater, null, false);
    }

    @NonNull
    public static ZIncludeRtrProfileBinding inflate(@NonNull LayoutInflater layoutInflater, @Nullable ViewGroup viewGroup, boolean z) {
        View inflate = layoutInflater.inflate(R.layout.z_include_rtr_profile, viewGroup, false);
        if (z) {
            viewGroup.addView(inflate);
        }
        return bind(inflate);
    }

    @Override // androidx.viewbinding.ViewBinding
    @NonNull
    public LinearLayout getRoot() {
        return this.f84650a;
    }
}

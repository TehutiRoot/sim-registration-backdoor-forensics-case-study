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

/* renamed from: th.co.dtac.android.dtacone.databinding.ZIncludeRtrProfileContactBinding */
/* loaded from: classes7.dex */
public final class ZIncludeRtrProfileContactBinding implements ViewBinding {

    /* renamed from: a */
    public final LinearLayout f84652a;
    @NonNull
    public final ZDividerBinding dividerAddress;
    @NonNull
    public final ZDividerBinding dividerIdCard;
    @NonNull
    public final DtacFontTextView tvContactName;
    @NonNull
    public final DtacFontTextView tvIdCard;
    @NonNull
    public final DtacFontTextView tvIdLabel;
    @NonNull
    public final DtacFontTextView tvNameLabel;
    @NonNull
    public final DtacFontTextView tvPhoneNumber;
    @NonNull
    public final DtacFontTextView tvPhoneNumberLabel;

    public ZIncludeRtrProfileContactBinding(LinearLayout linearLayout, ZDividerBinding zDividerBinding, ZDividerBinding zDividerBinding2, DtacFontTextView dtacFontTextView, DtacFontTextView dtacFontTextView2, DtacFontTextView dtacFontTextView3, DtacFontTextView dtacFontTextView4, DtacFontTextView dtacFontTextView5, DtacFontTextView dtacFontTextView6) {
        this.f84652a = linearLayout;
        this.dividerAddress = zDividerBinding;
        this.dividerIdCard = zDividerBinding2;
        this.tvContactName = dtacFontTextView;
        this.tvIdCard = dtacFontTextView2;
        this.tvIdLabel = dtacFontTextView3;
        this.tvNameLabel = dtacFontTextView4;
        this.tvPhoneNumber = dtacFontTextView5;
        this.tvPhoneNumberLabel = dtacFontTextView6;
    }

    @NonNull
    public static ZIncludeRtrProfileContactBinding bind(@NonNull View view) {
        int i = R.id.dividerAddress;
        View findChildViewById = ViewBindings.findChildViewById(view, i);
        if (findChildViewById != null) {
            ZDividerBinding bind = ZDividerBinding.bind(findChildViewById);
            i = R.id.dividerIdCard;
            View findChildViewById2 = ViewBindings.findChildViewById(view, i);
            if (findChildViewById2 != null) {
                ZDividerBinding bind2 = ZDividerBinding.bind(findChildViewById2);
                i = R.id.tvContactName;
                DtacFontTextView dtacFontTextView = (DtacFontTextView) ViewBindings.findChildViewById(view, i);
                if (dtacFontTextView != null) {
                    i = R.id.tvIdCard;
                    DtacFontTextView dtacFontTextView2 = (DtacFontTextView) ViewBindings.findChildViewById(view, i);
                    if (dtacFontTextView2 != null) {
                        i = R.id.tvIdLabel;
                        DtacFontTextView dtacFontTextView3 = (DtacFontTextView) ViewBindings.findChildViewById(view, i);
                        if (dtacFontTextView3 != null) {
                            i = R.id.tvNameLabel;
                            DtacFontTextView dtacFontTextView4 = (DtacFontTextView) ViewBindings.findChildViewById(view, i);
                            if (dtacFontTextView4 != null) {
                                i = R.id.tvPhoneNumber;
                                DtacFontTextView dtacFontTextView5 = (DtacFontTextView) ViewBindings.findChildViewById(view, i);
                                if (dtacFontTextView5 != null) {
                                    i = R.id.tvPhoneNumberLabel;
                                    DtacFontTextView dtacFontTextView6 = (DtacFontTextView) ViewBindings.findChildViewById(view, i);
                                    if (dtacFontTextView6 != null) {
                                        return new ZIncludeRtrProfileContactBinding((LinearLayout) view, bind, bind2, dtacFontTextView, dtacFontTextView2, dtacFontTextView3, dtacFontTextView4, dtacFontTextView5, dtacFontTextView6);
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
    public static ZIncludeRtrProfileContactBinding inflate(@NonNull LayoutInflater layoutInflater) {
        return inflate(layoutInflater, null, false);
    }

    @NonNull
    public static ZIncludeRtrProfileContactBinding inflate(@NonNull LayoutInflater layoutInflater, @Nullable ViewGroup viewGroup, boolean z) {
        View inflate = layoutInflater.inflate(R.layout.z_include_rtr_profile_contact, viewGroup, false);
        if (z) {
            viewGroup.addView(inflate);
        }
        return bind(inflate);
    }

    @Override // androidx.viewbinding.ViewBinding
    @NonNull
    public LinearLayout getRoot() {
        return this.f84652a;
    }
}

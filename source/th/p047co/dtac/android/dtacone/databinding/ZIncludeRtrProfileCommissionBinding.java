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

/* renamed from: th.co.dtac.android.dtacone.databinding.ZIncludeRtrProfileCommissionBinding */
/* loaded from: classes7.dex */
public final class ZIncludeRtrProfileCommissionBinding implements ViewBinding {

    /* renamed from: a */
    public final LinearLayout f84651a;
    @NonNull
    public final LinearLayout bankNameBox;
    @NonNull
    public final DtacFontTextView tvBankAccount;
    @NonNull
    public final DtacFontTextView tvBankAccountLabel;
    @NonNull
    public final DtacFontTextView tvBankName;
    @NonNull
    public final DtacFontTextView tvBankNameLabel;
    @NonNull
    public final DtacFontTextView tvCommissionType;
    @NonNull
    public final DtacFontTextView tvCommissionTypeLabel;

    public ZIncludeRtrProfileCommissionBinding(LinearLayout linearLayout, LinearLayout linearLayout2, DtacFontTextView dtacFontTextView, DtacFontTextView dtacFontTextView2, DtacFontTextView dtacFontTextView3, DtacFontTextView dtacFontTextView4, DtacFontTextView dtacFontTextView5, DtacFontTextView dtacFontTextView6) {
        this.f84651a = linearLayout;
        this.bankNameBox = linearLayout2;
        this.tvBankAccount = dtacFontTextView;
        this.tvBankAccountLabel = dtacFontTextView2;
        this.tvBankName = dtacFontTextView3;
        this.tvBankNameLabel = dtacFontTextView4;
        this.tvCommissionType = dtacFontTextView5;
        this.tvCommissionTypeLabel = dtacFontTextView6;
    }

    @NonNull
    public static ZIncludeRtrProfileCommissionBinding bind(@NonNull View view) {
        int i = R.id.bankNameBox;
        LinearLayout linearLayout = (LinearLayout) ViewBindings.findChildViewById(view, i);
        if (linearLayout != null) {
            i = R.id.tvBankAccount;
            DtacFontTextView dtacFontTextView = (DtacFontTextView) ViewBindings.findChildViewById(view, i);
            if (dtacFontTextView != null) {
                i = R.id.tvBankAccountLabel;
                DtacFontTextView dtacFontTextView2 = (DtacFontTextView) ViewBindings.findChildViewById(view, i);
                if (dtacFontTextView2 != null) {
                    i = R.id.tvBankName;
                    DtacFontTextView dtacFontTextView3 = (DtacFontTextView) ViewBindings.findChildViewById(view, i);
                    if (dtacFontTextView3 != null) {
                        i = R.id.tvBankNameLabel;
                        DtacFontTextView dtacFontTextView4 = (DtacFontTextView) ViewBindings.findChildViewById(view, i);
                        if (dtacFontTextView4 != null) {
                            i = R.id.tvCommissionType;
                            DtacFontTextView dtacFontTextView5 = (DtacFontTextView) ViewBindings.findChildViewById(view, i);
                            if (dtacFontTextView5 != null) {
                                i = R.id.tvCommissionTypeLabel;
                                DtacFontTextView dtacFontTextView6 = (DtacFontTextView) ViewBindings.findChildViewById(view, i);
                                if (dtacFontTextView6 != null) {
                                    return new ZIncludeRtrProfileCommissionBinding((LinearLayout) view, linearLayout, dtacFontTextView, dtacFontTextView2, dtacFontTextView3, dtacFontTextView4, dtacFontTextView5, dtacFontTextView6);
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
    public static ZIncludeRtrProfileCommissionBinding inflate(@NonNull LayoutInflater layoutInflater) {
        return inflate(layoutInflater, null, false);
    }

    @NonNull
    public static ZIncludeRtrProfileCommissionBinding inflate(@NonNull LayoutInflater layoutInflater, @Nullable ViewGroup viewGroup, boolean z) {
        View inflate = layoutInflater.inflate(R.layout.z_include_rtr_profile_commission, viewGroup, false);
        if (z) {
            viewGroup.addView(inflate);
        }
        return bind(inflate);
    }

    @Override // androidx.viewbinding.ViewBinding
    @NonNull
    public LinearLayout getRoot() {
        return this.f84651a;
    }
}

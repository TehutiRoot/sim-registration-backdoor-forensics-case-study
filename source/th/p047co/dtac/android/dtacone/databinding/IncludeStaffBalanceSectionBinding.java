package th.p047co.dtac.android.dtacone.databinding;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.RelativeLayout;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.viewbinding.ViewBinding;
import androidx.viewbinding.ViewBindings;
import th.p047co.dtac.android.dtacone.R;
import th.p047co.dtac.android.dtacone.widget.view.DtacFontTextView;

/* renamed from: th.co.dtac.android.dtacone.databinding.IncludeStaffBalanceSectionBinding */
/* loaded from: classes7.dex */
public final class IncludeStaffBalanceSectionBinding implements ViewBinding {

    /* renamed from: a */
    public final RelativeLayout f84293a;
    @NonNull
    public final DtacFontTextView tvAmountLimitTitle;
    @NonNull
    public final DtacFontTextView tvAmountLimitValue;
    @NonNull
    public final DtacFontTextView tvDisplayDateStaffValue;
    @NonNull
    public final DtacFontTextView tvSellAmountTitle;
    @NonNull
    public final DtacFontTextView tvSellAmountValue;
    @NonNull
    public final View vLineSeparate;

    public IncludeStaffBalanceSectionBinding(RelativeLayout relativeLayout, DtacFontTextView dtacFontTextView, DtacFontTextView dtacFontTextView2, DtacFontTextView dtacFontTextView3, DtacFontTextView dtacFontTextView4, DtacFontTextView dtacFontTextView5, View view) {
        this.f84293a = relativeLayout;
        this.tvAmountLimitTitle = dtacFontTextView;
        this.tvAmountLimitValue = dtacFontTextView2;
        this.tvDisplayDateStaffValue = dtacFontTextView3;
        this.tvSellAmountTitle = dtacFontTextView4;
        this.tvSellAmountValue = dtacFontTextView5;
        this.vLineSeparate = view;
    }

    @NonNull
    public static IncludeStaffBalanceSectionBinding bind(@NonNull View view) {
        View findChildViewById;
        int i = R.id.tvAmountLimitTitle;
        DtacFontTextView dtacFontTextView = (DtacFontTextView) ViewBindings.findChildViewById(view, i);
        if (dtacFontTextView != null) {
            i = R.id.tvAmountLimitValue;
            DtacFontTextView dtacFontTextView2 = (DtacFontTextView) ViewBindings.findChildViewById(view, i);
            if (dtacFontTextView2 != null) {
                i = R.id.tvDisplayDateStaffValue;
                DtacFontTextView dtacFontTextView3 = (DtacFontTextView) ViewBindings.findChildViewById(view, i);
                if (dtacFontTextView3 != null) {
                    i = R.id.tvSellAmountTitle;
                    DtacFontTextView dtacFontTextView4 = (DtacFontTextView) ViewBindings.findChildViewById(view, i);
                    if (dtacFontTextView4 != null) {
                        i = R.id.tvSellAmountValue;
                        DtacFontTextView dtacFontTextView5 = (DtacFontTextView) ViewBindings.findChildViewById(view, i);
                        if (dtacFontTextView5 != null && (findChildViewById = ViewBindings.findChildViewById(view, (i = R.id.vLineSeparate))) != null) {
                            return new IncludeStaffBalanceSectionBinding((RelativeLayout) view, dtacFontTextView, dtacFontTextView2, dtacFontTextView3, dtacFontTextView4, dtacFontTextView5, findChildViewById);
                        }
                    }
                }
            }
        }
        throw new NullPointerException("Missing required view with ID: ".concat(view.getResources().getResourceName(i)));
    }

    @NonNull
    public static IncludeStaffBalanceSectionBinding inflate(@NonNull LayoutInflater layoutInflater) {
        return inflate(layoutInflater, null, false);
    }

    @NonNull
    public static IncludeStaffBalanceSectionBinding inflate(@NonNull LayoutInflater layoutInflater, @Nullable ViewGroup viewGroup, boolean z) {
        View inflate = layoutInflater.inflate(R.layout.include_staff_balance_section, viewGroup, false);
        if (z) {
            viewGroup.addView(inflate);
        }
        return bind(inflate);
    }

    @Override // androidx.viewbinding.ViewBinding
    @NonNull
    public RelativeLayout getRoot() {
        return this.f84293a;
    }
}

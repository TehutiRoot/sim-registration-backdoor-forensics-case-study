package th.p047co.dtac.android.dtacone.databinding;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.LinearLayout;
import android.widget.RelativeLayout;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.viewbinding.ViewBinding;
import androidx.viewbinding.ViewBindings;
import th.p047co.dtac.android.dtacone.R;
import th.p047co.dtac.android.dtacone.widget.view.DtacFontTextView;

/* renamed from: th.co.dtac.android.dtacone.databinding.IncludeUserBalanceSectionBinding */
/* loaded from: classes7.dex */
public final class IncludeUserBalanceSectionBinding implements ViewBinding {

    /* renamed from: a */
    public final RelativeLayout f84297a;
    @NonNull
    public final ImageView btnBuyDol;
    @NonNull
    public final DtacFontTextView btnRetryBalance;
    @NonNull
    public final LinearLayout layoutBalanceAmount;
    @NonNull
    public final DtacFontTextView tvCurrentBalanceValue;
    @NonNull
    public final DtacFontTextView tvDisplayDateValue;
    @NonNull
    public final DtacFontTextView tvTotalAmountTitle;

    public IncludeUserBalanceSectionBinding(RelativeLayout relativeLayout, ImageView imageView, DtacFontTextView dtacFontTextView, LinearLayout linearLayout, DtacFontTextView dtacFontTextView2, DtacFontTextView dtacFontTextView3, DtacFontTextView dtacFontTextView4) {
        this.f84297a = relativeLayout;
        this.btnBuyDol = imageView;
        this.btnRetryBalance = dtacFontTextView;
        this.layoutBalanceAmount = linearLayout;
        this.tvCurrentBalanceValue = dtacFontTextView2;
        this.tvDisplayDateValue = dtacFontTextView3;
        this.tvTotalAmountTitle = dtacFontTextView4;
    }

    @NonNull
    public static IncludeUserBalanceSectionBinding bind(@NonNull View view) {
        int i = R.id.btnBuyDol;
        ImageView imageView = (ImageView) ViewBindings.findChildViewById(view, i);
        if (imageView != null) {
            i = R.id.btnRetryBalance;
            DtacFontTextView dtacFontTextView = (DtacFontTextView) ViewBindings.findChildViewById(view, i);
            if (dtacFontTextView != null) {
                i = R.id.layoutBalanceAmount;
                LinearLayout linearLayout = (LinearLayout) ViewBindings.findChildViewById(view, i);
                if (linearLayout != null) {
                    i = R.id.tvCurrentBalanceValue;
                    DtacFontTextView dtacFontTextView2 = (DtacFontTextView) ViewBindings.findChildViewById(view, i);
                    if (dtacFontTextView2 != null) {
                        i = R.id.tvDisplayDateValue;
                        DtacFontTextView dtacFontTextView3 = (DtacFontTextView) ViewBindings.findChildViewById(view, i);
                        if (dtacFontTextView3 != null) {
                            i = R.id.tvTotalAmountTitle;
                            DtacFontTextView dtacFontTextView4 = (DtacFontTextView) ViewBindings.findChildViewById(view, i);
                            if (dtacFontTextView4 != null) {
                                return new IncludeUserBalanceSectionBinding((RelativeLayout) view, imageView, dtacFontTextView, linearLayout, dtacFontTextView2, dtacFontTextView3, dtacFontTextView4);
                            }
                        }
                    }
                }
            }
        }
        throw new NullPointerException("Missing required view with ID: ".concat(view.getResources().getResourceName(i)));
    }

    @NonNull
    public static IncludeUserBalanceSectionBinding inflate(@NonNull LayoutInflater layoutInflater) {
        return inflate(layoutInflater, null, false);
    }

    @NonNull
    public static IncludeUserBalanceSectionBinding inflate(@NonNull LayoutInflater layoutInflater, @Nullable ViewGroup viewGroup, boolean z) {
        View inflate = layoutInflater.inflate(R.layout.include_user_balance_section, viewGroup, false);
        if (z) {
            viewGroup.addView(inflate);
        }
        return bind(inflate);
    }

    @Override // androidx.viewbinding.ViewBinding
    @NonNull
    public RelativeLayout getRoot() {
        return this.f84297a;
    }
}

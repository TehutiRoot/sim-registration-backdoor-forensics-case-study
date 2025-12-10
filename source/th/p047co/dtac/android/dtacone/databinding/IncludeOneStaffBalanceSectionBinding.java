package th.p047co.dtac.android.dtacone.databinding;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.cardview.widget.CardView;
import androidx.constraintlayout.widget.ConstraintLayout;
import androidx.viewbinding.ViewBinding;
import androidx.viewbinding.ViewBindings;
import th.p047co.dtac.android.dtacone.R;
import th.p047co.dtac.android.dtacone.app_one.widget.OneFontTextView;

/* renamed from: th.co.dtac.android.dtacone.databinding.IncludeOneStaffBalanceSectionBinding */
/* loaded from: classes7.dex */
public final class IncludeOneStaffBalanceSectionBinding implements ViewBinding {

    /* renamed from: a */
    public final CardView f84282a;
    @NonNull
    public final ConstraintLayout layoutBalanceStaff;
    @NonNull
    public final OneFontTextView tvAmountLimitTitle;
    @NonNull
    public final OneFontTextView tvAmountLimitValue;
    @NonNull
    public final OneFontTextView tvDisplayDateStaffValue;
    @NonNull
    public final OneFontTextView tvSellAmountTitle;
    @NonNull
    public final OneFontTextView tvSellAmountValue;
    @NonNull
    public final View vLineSeparate;

    public IncludeOneStaffBalanceSectionBinding(CardView cardView, ConstraintLayout constraintLayout, OneFontTextView oneFontTextView, OneFontTextView oneFontTextView2, OneFontTextView oneFontTextView3, OneFontTextView oneFontTextView4, OneFontTextView oneFontTextView5, View view) {
        this.f84282a = cardView;
        this.layoutBalanceStaff = constraintLayout;
        this.tvAmountLimitTitle = oneFontTextView;
        this.tvAmountLimitValue = oneFontTextView2;
        this.tvDisplayDateStaffValue = oneFontTextView3;
        this.tvSellAmountTitle = oneFontTextView4;
        this.tvSellAmountValue = oneFontTextView5;
        this.vLineSeparate = view;
    }

    @NonNull
    public static IncludeOneStaffBalanceSectionBinding bind(@NonNull View view) {
        View findChildViewById;
        int i = R.id.layoutBalanceStaff;
        ConstraintLayout constraintLayout = (ConstraintLayout) ViewBindings.findChildViewById(view, i);
        if (constraintLayout != null) {
            i = R.id.tvAmountLimitTitle;
            OneFontTextView oneFontTextView = (OneFontTextView) ViewBindings.findChildViewById(view, i);
            if (oneFontTextView != null) {
                i = R.id.tvAmountLimitValue;
                OneFontTextView oneFontTextView2 = (OneFontTextView) ViewBindings.findChildViewById(view, i);
                if (oneFontTextView2 != null) {
                    i = R.id.tvDisplayDateStaffValue;
                    OneFontTextView oneFontTextView3 = (OneFontTextView) ViewBindings.findChildViewById(view, i);
                    if (oneFontTextView3 != null) {
                        i = R.id.tvSellAmountTitle;
                        OneFontTextView oneFontTextView4 = (OneFontTextView) ViewBindings.findChildViewById(view, i);
                        if (oneFontTextView4 != null) {
                            i = R.id.tvSellAmountValue;
                            OneFontTextView oneFontTextView5 = (OneFontTextView) ViewBindings.findChildViewById(view, i);
                            if (oneFontTextView5 != null && (findChildViewById = ViewBindings.findChildViewById(view, (i = R.id.vLineSeparate))) != null) {
                                return new IncludeOneStaffBalanceSectionBinding((CardView) view, constraintLayout, oneFontTextView, oneFontTextView2, oneFontTextView3, oneFontTextView4, oneFontTextView5, findChildViewById);
                            }
                        }
                    }
                }
            }
        }
        throw new NullPointerException("Missing required view with ID: ".concat(view.getResources().getResourceName(i)));
    }

    @NonNull
    public static IncludeOneStaffBalanceSectionBinding inflate(@NonNull LayoutInflater layoutInflater) {
        return inflate(layoutInflater, null, false);
    }

    @NonNull
    public static IncludeOneStaffBalanceSectionBinding inflate(@NonNull LayoutInflater layoutInflater, @Nullable ViewGroup viewGroup, boolean z) {
        View inflate = layoutInflater.inflate(R.layout.include_one_staff_balance_section, viewGroup, false);
        if (z) {
            viewGroup.addView(inflate);
        }
        return bind(inflate);
    }

    @Override // androidx.viewbinding.ViewBinding
    @NonNull
    public CardView getRoot() {
        return this.f84282a;
    }
}

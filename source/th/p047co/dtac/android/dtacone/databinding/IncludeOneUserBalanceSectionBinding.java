package th.p047co.dtac.android.dtacone.databinding;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.appcompat.widget.LinearLayoutCompat;
import androidx.cardview.widget.CardView;
import androidx.constraintlayout.widget.ConstraintLayout;
import androidx.viewbinding.ViewBinding;
import androidx.viewbinding.ViewBindings;
import th.p047co.dtac.android.dtacone.R;
import th.p047co.dtac.android.dtacone.app_one.widget.OneFontTextView;

/* renamed from: th.co.dtac.android.dtacone.databinding.IncludeOneUserBalanceSectionBinding */
/* loaded from: classes7.dex */
public final class IncludeOneUserBalanceSectionBinding implements ViewBinding {

    /* renamed from: a */
    public final CardView f84285a;
    @NonNull
    public final ImageView btnBuyDol;
    @NonNull
    public final OneFontTextView btnRetryBalance;
    @NonNull
    public final LinearLayoutCompat layoutBalanceAmount;
    @NonNull
    public final ConstraintLayout layoutCardBalance;
    @NonNull
    public final OneFontTextView tvCurrentBalanceValue;
    @NonNull
    public final OneFontTextView tvDisplayDateValue;
    @NonNull
    public final OneFontTextView tvTotalAmountTitle;

    public IncludeOneUserBalanceSectionBinding(CardView cardView, ImageView imageView, OneFontTextView oneFontTextView, LinearLayoutCompat linearLayoutCompat, ConstraintLayout constraintLayout, OneFontTextView oneFontTextView2, OneFontTextView oneFontTextView3, OneFontTextView oneFontTextView4) {
        this.f84285a = cardView;
        this.btnBuyDol = imageView;
        this.btnRetryBalance = oneFontTextView;
        this.layoutBalanceAmount = linearLayoutCompat;
        this.layoutCardBalance = constraintLayout;
        this.tvCurrentBalanceValue = oneFontTextView2;
        this.tvDisplayDateValue = oneFontTextView3;
        this.tvTotalAmountTitle = oneFontTextView4;
    }

    @NonNull
    public static IncludeOneUserBalanceSectionBinding bind(@NonNull View view) {
        int i = R.id.btnBuyDol;
        ImageView imageView = (ImageView) ViewBindings.findChildViewById(view, i);
        if (imageView != null) {
            i = R.id.btnRetryBalance;
            OneFontTextView oneFontTextView = (OneFontTextView) ViewBindings.findChildViewById(view, i);
            if (oneFontTextView != null) {
                i = R.id.layoutBalanceAmount;
                LinearLayoutCompat linearLayoutCompat = (LinearLayoutCompat) ViewBindings.findChildViewById(view, i);
                if (linearLayoutCompat != null) {
                    i = R.id.layoutCardBalance;
                    ConstraintLayout constraintLayout = (ConstraintLayout) ViewBindings.findChildViewById(view, i);
                    if (constraintLayout != null) {
                        i = R.id.tvCurrentBalanceValue;
                        OneFontTextView oneFontTextView2 = (OneFontTextView) ViewBindings.findChildViewById(view, i);
                        if (oneFontTextView2 != null) {
                            i = R.id.tvDisplayDateValue;
                            OneFontTextView oneFontTextView3 = (OneFontTextView) ViewBindings.findChildViewById(view, i);
                            if (oneFontTextView3 != null) {
                                i = R.id.tvTotalAmountTitle;
                                OneFontTextView oneFontTextView4 = (OneFontTextView) ViewBindings.findChildViewById(view, i);
                                if (oneFontTextView4 != null) {
                                    return new IncludeOneUserBalanceSectionBinding((CardView) view, imageView, oneFontTextView, linearLayoutCompat, constraintLayout, oneFontTextView2, oneFontTextView3, oneFontTextView4);
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
    public static IncludeOneUserBalanceSectionBinding inflate(@NonNull LayoutInflater layoutInflater) {
        return inflate(layoutInflater, null, false);
    }

    @NonNull
    public static IncludeOneUserBalanceSectionBinding inflate(@NonNull LayoutInflater layoutInflater, @Nullable ViewGroup viewGroup, boolean z) {
        View inflate = layoutInflater.inflate(R.layout.include_one_user_balance_section, viewGroup, false);
        if (z) {
            viewGroup.addView(inflate);
        }
        return bind(inflate);
    }

    @Override // androidx.viewbinding.ViewBinding
    @NonNull
    public CardView getRoot() {
        return this.f84285a;
    }
}

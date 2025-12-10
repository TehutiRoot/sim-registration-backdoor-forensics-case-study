package th.p047co.dtac.android.dtacone.databinding;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageButton;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.appcompat.widget.LinearLayoutCompat;
import androidx.constraintlayout.widget.ConstraintLayout;
import androidx.viewbinding.ViewBinding;
import androidx.viewbinding.ViewBindings;
import th.p047co.dtac.android.dtacone.R;
import th.p047co.dtac.android.dtacone.app_one.widget.OneFontTextView;

/* renamed from: th.co.dtac.android.dtacone.databinding.OneBalanceBoxBinding */
/* loaded from: classes7.dex */
public final class OneBalanceBoxBinding implements ViewBinding {

    /* renamed from: a */
    public final ConstraintLayout f84426a;
    @NonNull
    public final ImageButton btnBuyDolShortCut;
    @NonNull
    public final LinearLayoutCompat lnlBottom;
    @NonNull
    public final LinearLayoutCompat lnlMedium;
    @NonNull
    public final LinearLayoutCompat lnlTop;
    @NonNull
    public final ConstraintLayout rootBalance;
    @NonNull
    public final OneFontTextView tvBalance;
    @NonNull
    public final OneFontTextView tvBalanceText;
    @NonNull
    public final OneFontTextView tvBalanceUnit;
    @NonNull
    public final OneFontTextView tvLastUpdate;
    @NonNull
    public final OneFontTextView tvPhoneNumber;
    @NonNull
    public final OneFontTextView tvSimRCount;

    public OneBalanceBoxBinding(ConstraintLayout constraintLayout, ImageButton imageButton, LinearLayoutCompat linearLayoutCompat, LinearLayoutCompat linearLayoutCompat2, LinearLayoutCompat linearLayoutCompat3, ConstraintLayout constraintLayout2, OneFontTextView oneFontTextView, OneFontTextView oneFontTextView2, OneFontTextView oneFontTextView3, OneFontTextView oneFontTextView4, OneFontTextView oneFontTextView5, OneFontTextView oneFontTextView6) {
        this.f84426a = constraintLayout;
        this.btnBuyDolShortCut = imageButton;
        this.lnlBottom = linearLayoutCompat;
        this.lnlMedium = linearLayoutCompat2;
        this.lnlTop = linearLayoutCompat3;
        this.rootBalance = constraintLayout2;
        this.tvBalance = oneFontTextView;
        this.tvBalanceText = oneFontTextView2;
        this.tvBalanceUnit = oneFontTextView3;
        this.tvLastUpdate = oneFontTextView4;
        this.tvPhoneNumber = oneFontTextView5;
        this.tvSimRCount = oneFontTextView6;
    }

    @NonNull
    public static OneBalanceBoxBinding bind(@NonNull View view) {
        int i = R.id.btnBuyDolShortCut;
        ImageButton imageButton = (ImageButton) ViewBindings.findChildViewById(view, i);
        if (imageButton != null) {
            i = R.id.lnl_bottom;
            LinearLayoutCompat linearLayoutCompat = (LinearLayoutCompat) ViewBindings.findChildViewById(view, i);
            if (linearLayoutCompat != null) {
                i = R.id.lnl_medium;
                LinearLayoutCompat linearLayoutCompat2 = (LinearLayoutCompat) ViewBindings.findChildViewById(view, i);
                if (linearLayoutCompat2 != null) {
                    i = R.id.lnl_top;
                    LinearLayoutCompat linearLayoutCompat3 = (LinearLayoutCompat) ViewBindings.findChildViewById(view, i);
                    if (linearLayoutCompat3 != null) {
                        ConstraintLayout constraintLayout = (ConstraintLayout) view;
                        i = R.id.tvBalance;
                        OneFontTextView oneFontTextView = (OneFontTextView) ViewBindings.findChildViewById(view, i);
                        if (oneFontTextView != null) {
                            i = R.id.tvBalanceText;
                            OneFontTextView oneFontTextView2 = (OneFontTextView) ViewBindings.findChildViewById(view, i);
                            if (oneFontTextView2 != null) {
                                i = R.id.tvBalanceUnit;
                                OneFontTextView oneFontTextView3 = (OneFontTextView) ViewBindings.findChildViewById(view, i);
                                if (oneFontTextView3 != null) {
                                    i = R.id.tvLastUpdate;
                                    OneFontTextView oneFontTextView4 = (OneFontTextView) ViewBindings.findChildViewById(view, i);
                                    if (oneFontTextView4 != null) {
                                        i = R.id.tvPhoneNumber;
                                        OneFontTextView oneFontTextView5 = (OneFontTextView) ViewBindings.findChildViewById(view, i);
                                        if (oneFontTextView5 != null) {
                                            i = R.id.tvSimRCount;
                                            OneFontTextView oneFontTextView6 = (OneFontTextView) ViewBindings.findChildViewById(view, i);
                                            if (oneFontTextView6 != null) {
                                                return new OneBalanceBoxBinding(constraintLayout, imageButton, linearLayoutCompat, linearLayoutCompat2, linearLayoutCompat3, constraintLayout, oneFontTextView, oneFontTextView2, oneFontTextView3, oneFontTextView4, oneFontTextView5, oneFontTextView6);
                                            }
                                        }
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
    public static OneBalanceBoxBinding inflate(@NonNull LayoutInflater layoutInflater) {
        return inflate(layoutInflater, null, false);
    }

    @NonNull
    public static OneBalanceBoxBinding inflate(@NonNull LayoutInflater layoutInflater, @Nullable ViewGroup viewGroup, boolean z) {
        View inflate = layoutInflater.inflate(R.layout.one_balance_box, viewGroup, false);
        if (z) {
            viewGroup.addView(inflate);
        }
        return bind(inflate);
    }

    @Override // androidx.viewbinding.ViewBinding
    @NonNull
    public ConstraintLayout getRoot() {
        return this.f84426a;
    }
}

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
import th.p047co.dtac.android.dtacone.app_one.widget.OneFontButton;
import th.p047co.dtac.android.dtacone.app_one.widget.OneFontTextView;

/* renamed from: th.co.dtac.android.dtacone.databinding.FragmentOnePre2PostDialogBinding */
/* loaded from: classes7.dex */
public final class FragmentOnePre2PostDialogBinding implements ViewBinding {

    /* renamed from: a */
    public final CardView f84054a;
    @NonNull
    public final OneFontButton cancelToBuyDeviceButtonButton;
    @NonNull
    public final OneFontButton confirmToBuyDeviceButtonButton;
    @NonNull
    public final OneFontTextView dateTextView;
    @NonNull
    public final OneFontTextView errorCodeTextView;
    @NonNull
    public final OneFontTextView informationDescriptionTextView;
    @NonNull
    public final OneFontTextView informationTitleTextView;
    @NonNull
    public final OneFontTextView selectAmountTextView;
    @NonNull
    public final ConstraintLayout warningLayout;

    public FragmentOnePre2PostDialogBinding(CardView cardView, OneFontButton oneFontButton, OneFontButton oneFontButton2, OneFontTextView oneFontTextView, OneFontTextView oneFontTextView2, OneFontTextView oneFontTextView3, OneFontTextView oneFontTextView4, OneFontTextView oneFontTextView5, ConstraintLayout constraintLayout) {
        this.f84054a = cardView;
        this.cancelToBuyDeviceButtonButton = oneFontButton;
        this.confirmToBuyDeviceButtonButton = oneFontButton2;
        this.dateTextView = oneFontTextView;
        this.errorCodeTextView = oneFontTextView2;
        this.informationDescriptionTextView = oneFontTextView3;
        this.informationTitleTextView = oneFontTextView4;
        this.selectAmountTextView = oneFontTextView5;
        this.warningLayout = constraintLayout;
    }

    @NonNull
    public static FragmentOnePre2PostDialogBinding bind(@NonNull View view) {
        int i = R.id.cancelToBuyDeviceButtonButton;
        OneFontButton oneFontButton = (OneFontButton) ViewBindings.findChildViewById(view, i);
        if (oneFontButton != null) {
            i = R.id.confirmToBuyDeviceButtonButton;
            OneFontButton oneFontButton2 = (OneFontButton) ViewBindings.findChildViewById(view, i);
            if (oneFontButton2 != null) {
                i = R.id.dateTextView;
                OneFontTextView oneFontTextView = (OneFontTextView) ViewBindings.findChildViewById(view, i);
                if (oneFontTextView != null) {
                    i = R.id.errorCodeTextView;
                    OneFontTextView oneFontTextView2 = (OneFontTextView) ViewBindings.findChildViewById(view, i);
                    if (oneFontTextView2 != null) {
                        i = R.id.informationDescriptionTextView;
                        OneFontTextView oneFontTextView3 = (OneFontTextView) ViewBindings.findChildViewById(view, i);
                        if (oneFontTextView3 != null) {
                            i = R.id.informationTitleTextView;
                            OneFontTextView oneFontTextView4 = (OneFontTextView) ViewBindings.findChildViewById(view, i);
                            if (oneFontTextView4 != null) {
                                i = R.id.selectAmountTextView;
                                OneFontTextView oneFontTextView5 = (OneFontTextView) ViewBindings.findChildViewById(view, i);
                                if (oneFontTextView5 != null) {
                                    i = R.id.warningLayout;
                                    ConstraintLayout constraintLayout = (ConstraintLayout) ViewBindings.findChildViewById(view, i);
                                    if (constraintLayout != null) {
                                        return new FragmentOnePre2PostDialogBinding((CardView) view, oneFontButton, oneFontButton2, oneFontTextView, oneFontTextView2, oneFontTextView3, oneFontTextView4, oneFontTextView5, constraintLayout);
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
    public static FragmentOnePre2PostDialogBinding inflate(@NonNull LayoutInflater layoutInflater) {
        return inflate(layoutInflater, null, false);
    }

    @NonNull
    public static FragmentOnePre2PostDialogBinding inflate(@NonNull LayoutInflater layoutInflater, @Nullable ViewGroup viewGroup, boolean z) {
        View inflate = layoutInflater.inflate(R.layout.fragment_one_pre2_post_dialog, viewGroup, false);
        if (z) {
            viewGroup.addView(inflate);
        }
        return bind(inflate);
    }

    @Override // androidx.viewbinding.ViewBinding
    @NonNull
    public CardView getRoot() {
        return this.f84054a;
    }
}

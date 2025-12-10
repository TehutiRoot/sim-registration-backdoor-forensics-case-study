package th.p047co.dtac.android.dtacone.databinding;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.cardview.widget.CardView;
import androidx.constraintlayout.widget.ConstraintLayout;
import androidx.viewbinding.ViewBinding;
import androidx.viewbinding.ViewBindings;
import th.p047co.dtac.android.dtacone.R;
import th.p047co.dtac.android.dtacone.app_one.widget.OneFontButton;
import th.p047co.dtac.android.dtacone.app_one.widget.OneFontTextView;

/* renamed from: th.co.dtac.android.dtacone.databinding.FragmentOnePre2PostChangeIMEIDialogBinding */
/* loaded from: classes7.dex */
public final class FragmentOnePre2PostChangeIMEIDialogBinding implements ViewBinding {

    /* renamed from: a */
    public final CardView f84052a;
    @NonNull
    public final OneFontButton cancelToChangeImeiButton;
    @NonNull
    public final OneFontTextView confirmToChangeIMEITextView;
    @NonNull
    public final OneFontButton confirmToChangeImeiButton;
    @NonNull
    public final ImageView deviceTypeImageView;
    @NonNull
    public final ConstraintLayout deviceTypeInfoLayout;
    @NonNull
    public final OneFontTextView deviceTypeTextView;
    @NonNull
    public final OneFontTextView iMEINumberTextView;
    @NonNull
    public final ConstraintLayout imeiNumberInfoLayout;
    @NonNull
    public final OneFontTextView imeiNumberTitleTextView;
    @NonNull
    public final ConstraintLayout modelInfoLayout;
    @NonNull
    public final OneFontTextView modelNameTextView;
    @NonNull
    public final OneFontTextView modelNameTitleTextView;

    public FragmentOnePre2PostChangeIMEIDialogBinding(CardView cardView, OneFontButton oneFontButton, OneFontTextView oneFontTextView, OneFontButton oneFontButton2, ImageView imageView, ConstraintLayout constraintLayout, OneFontTextView oneFontTextView2, OneFontTextView oneFontTextView3, ConstraintLayout constraintLayout2, OneFontTextView oneFontTextView4, ConstraintLayout constraintLayout3, OneFontTextView oneFontTextView5, OneFontTextView oneFontTextView6) {
        this.f84052a = cardView;
        this.cancelToChangeImeiButton = oneFontButton;
        this.confirmToChangeIMEITextView = oneFontTextView;
        this.confirmToChangeImeiButton = oneFontButton2;
        this.deviceTypeImageView = imageView;
        this.deviceTypeInfoLayout = constraintLayout;
        this.deviceTypeTextView = oneFontTextView2;
        this.iMEINumberTextView = oneFontTextView3;
        this.imeiNumberInfoLayout = constraintLayout2;
        this.imeiNumberTitleTextView = oneFontTextView4;
        this.modelInfoLayout = constraintLayout3;
        this.modelNameTextView = oneFontTextView5;
        this.modelNameTitleTextView = oneFontTextView6;
    }

    @NonNull
    public static FragmentOnePre2PostChangeIMEIDialogBinding bind(@NonNull View view) {
        int i = R.id.cancelToChangeImeiButton;
        OneFontButton oneFontButton = (OneFontButton) ViewBindings.findChildViewById(view, i);
        if (oneFontButton != null) {
            i = R.id.confirmToChangeIMEITextView;
            OneFontTextView oneFontTextView = (OneFontTextView) ViewBindings.findChildViewById(view, i);
            if (oneFontTextView != null) {
                i = R.id.confirmToChangeImeiButton;
                OneFontButton oneFontButton2 = (OneFontButton) ViewBindings.findChildViewById(view, i);
                if (oneFontButton2 != null) {
                    i = R.id.deviceTypeImageView;
                    ImageView imageView = (ImageView) ViewBindings.findChildViewById(view, i);
                    if (imageView != null) {
                        i = R.id.deviceTypeInfoLayout;
                        ConstraintLayout constraintLayout = (ConstraintLayout) ViewBindings.findChildViewById(view, i);
                        if (constraintLayout != null) {
                            i = R.id.deviceTypeTextView;
                            OneFontTextView oneFontTextView2 = (OneFontTextView) ViewBindings.findChildViewById(view, i);
                            if (oneFontTextView2 != null) {
                                i = R.id.iMEINumberTextView;
                                OneFontTextView oneFontTextView3 = (OneFontTextView) ViewBindings.findChildViewById(view, i);
                                if (oneFontTextView3 != null) {
                                    i = R.id.imeiNumberInfoLayout;
                                    ConstraintLayout constraintLayout2 = (ConstraintLayout) ViewBindings.findChildViewById(view, i);
                                    if (constraintLayout2 != null) {
                                        i = R.id.imeiNumberTitleTextView;
                                        OneFontTextView oneFontTextView4 = (OneFontTextView) ViewBindings.findChildViewById(view, i);
                                        if (oneFontTextView4 != null) {
                                            i = R.id.modelInfoLayout;
                                            ConstraintLayout constraintLayout3 = (ConstraintLayout) ViewBindings.findChildViewById(view, i);
                                            if (constraintLayout3 != null) {
                                                i = R.id.modelNameTextView;
                                                OneFontTextView oneFontTextView5 = (OneFontTextView) ViewBindings.findChildViewById(view, i);
                                                if (oneFontTextView5 != null) {
                                                    i = R.id.modelNameTitleTextView;
                                                    OneFontTextView oneFontTextView6 = (OneFontTextView) ViewBindings.findChildViewById(view, i);
                                                    if (oneFontTextView6 != null) {
                                                        return new FragmentOnePre2PostChangeIMEIDialogBinding((CardView) view, oneFontButton, oneFontTextView, oneFontButton2, imageView, constraintLayout, oneFontTextView2, oneFontTextView3, constraintLayout2, oneFontTextView4, constraintLayout3, oneFontTextView5, oneFontTextView6);
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
            }
        }
        throw new NullPointerException("Missing required view with ID: ".concat(view.getResources().getResourceName(i)));
    }

    @NonNull
    public static FragmentOnePre2PostChangeIMEIDialogBinding inflate(@NonNull LayoutInflater layoutInflater) {
        return inflate(layoutInflater, null, false);
    }

    @NonNull
    public static FragmentOnePre2PostChangeIMEIDialogBinding inflate(@NonNull LayoutInflater layoutInflater, @Nullable ViewGroup viewGroup, boolean z) {
        View inflate = layoutInflater.inflate(R.layout.fragment_one_pre2_post_change_i_m_e_i_dialog, viewGroup, false);
        if (z) {
            viewGroup.addView(inflate);
        }
        return bind(inflate);
    }

    @Override // androidx.viewbinding.ViewBinding
    @NonNull
    public CardView getRoot() {
        return this.f84052a;
    }
}

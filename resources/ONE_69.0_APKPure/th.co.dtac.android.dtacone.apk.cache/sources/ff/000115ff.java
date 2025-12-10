package th.p047co.dtac.android.dtacone.databinding;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.cardview.widget.CardView;
import androidx.constraintlayout.widget.ConstraintLayout;
import androidx.core.widget.NestedScrollView;
import androidx.viewbinding.ViewBinding;
import androidx.viewbinding.ViewBindings;
import th.p047co.dtac.android.dtacone.R;
import th.p047co.dtac.android.dtacone.app_one.widget.OneFontButton;
import th.p047co.dtac.android.dtacone.app_one.widget.OneFontTextView;

/* renamed from: th.co.dtac.android.dtacone.databinding.FragmentOneConsentDialogBinding */
/* loaded from: classes7.dex */
public final class FragmentOneConsentDialogBinding implements ViewBinding {

    /* renamed from: a */
    public final CardView f84014a;
    @NonNull
    public final OneFontButton acceptConsentButton;
    @NonNull
    public final ConstraintLayout headerLayout;
    @NonNull
    public final ImageView logoImageView;
    @NonNull
    public final NestedScrollView scrollView;
    @NonNull
    public final OneFontTextView termsAndConditionDetailTextView;
    @NonNull
    public final OneFontTextView termsConditionTextView;

    public FragmentOneConsentDialogBinding(CardView cardView, OneFontButton oneFontButton, ConstraintLayout constraintLayout, ImageView imageView, NestedScrollView nestedScrollView, OneFontTextView oneFontTextView, OneFontTextView oneFontTextView2) {
        this.f84014a = cardView;
        this.acceptConsentButton = oneFontButton;
        this.headerLayout = constraintLayout;
        this.logoImageView = imageView;
        this.scrollView = nestedScrollView;
        this.termsAndConditionDetailTextView = oneFontTextView;
        this.termsConditionTextView = oneFontTextView2;
    }

    @NonNull
    public static FragmentOneConsentDialogBinding bind(@NonNull View view) {
        int i = R.id.acceptConsentButton;
        OneFontButton oneFontButton = (OneFontButton) ViewBindings.findChildViewById(view, i);
        if (oneFontButton != null) {
            i = R.id.headerLayout;
            ConstraintLayout constraintLayout = (ConstraintLayout) ViewBindings.findChildViewById(view, i);
            if (constraintLayout != null) {
                i = R.id.logoImageView;
                ImageView imageView = (ImageView) ViewBindings.findChildViewById(view, i);
                if (imageView != null) {
                    i = R.id.scrollView;
                    NestedScrollView nestedScrollView = (NestedScrollView) ViewBindings.findChildViewById(view, i);
                    if (nestedScrollView != null) {
                        i = R.id.termsAndConditionDetailTextView;
                        OneFontTextView oneFontTextView = (OneFontTextView) ViewBindings.findChildViewById(view, i);
                        if (oneFontTextView != null) {
                            i = R.id.termsConditionTextView;
                            OneFontTextView oneFontTextView2 = (OneFontTextView) ViewBindings.findChildViewById(view, i);
                            if (oneFontTextView2 != null) {
                                return new FragmentOneConsentDialogBinding((CardView) view, oneFontButton, constraintLayout, imageView, nestedScrollView, oneFontTextView, oneFontTextView2);
                            }
                        }
                    }
                }
            }
        }
        throw new NullPointerException("Missing required view with ID: ".concat(view.getResources().getResourceName(i)));
    }

    @NonNull
    public static FragmentOneConsentDialogBinding inflate(@NonNull LayoutInflater layoutInflater) {
        return inflate(layoutInflater, null, false);
    }

    @NonNull
    public static FragmentOneConsentDialogBinding inflate(@NonNull LayoutInflater layoutInflater, @Nullable ViewGroup viewGroup, boolean z) {
        View inflate = layoutInflater.inflate(R.layout.fragment_one_consent_dialog, viewGroup, false);
        if (z) {
            viewGroup.addView(inflate);
        }
        return bind(inflate);
    }

    @Override // androidx.viewbinding.ViewBinding
    @NonNull
    public CardView getRoot() {
        return this.f84014a;
    }
}
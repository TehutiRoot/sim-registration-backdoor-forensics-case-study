package th.p047co.dtac.android.dtacone.databinding;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.appcompat.widget.AppCompatTextView;
import androidx.constraintlayout.widget.ConstraintLayout;
import androidx.viewbinding.ViewBinding;
import androidx.viewbinding.ViewBindings;
import th.p047co.dtac.android.dtacone.R;
import th.p047co.dtac.android.dtacone.app_one.widget.OneFontButton;
import th.p047co.dtac.android.dtacone.app_one.widget.OneFontTextView;

/* renamed from: th.co.dtac.android.dtacone.databinding.FragmentOnePre2PostSuccessBinding */
/* loaded from: classes7.dex */
public final class FragmentOnePre2PostSuccessBinding implements ViewBinding {

    /* renamed from: a */
    public final ConstraintLayout f84170a;
    @NonNull
    public final OneFontButton onePre2PostBackHomeButton;
    @NonNull
    public final OneFontButton onePre2PostGotoDeviceSaleButton;
    @NonNull
    public final ImageView onePre2PostIconSuccessImageView;
    @NonNull
    public final OneFontTextView onePre2PostMobileNumberTextView;
    @NonNull
    public final AppCompatTextView onePre2PostNextStepVerifyTextView;
    @NonNull
    public final OneFontTextView onePre2PostSimSerialTextView;
    @NonNull
    public final OneFontTextView onePre2PostSuccessTextView;
    @NonNull
    public final ImageView onePre2PostVerifyIconImageView;
    @NonNull
    public final OneFontTextView selectNextStepMessageTextView;

    public FragmentOnePre2PostSuccessBinding(ConstraintLayout constraintLayout, OneFontButton oneFontButton, OneFontButton oneFontButton2, ImageView imageView, OneFontTextView oneFontTextView, AppCompatTextView appCompatTextView, OneFontTextView oneFontTextView2, OneFontTextView oneFontTextView3, ImageView imageView2, OneFontTextView oneFontTextView4) {
        this.f84170a = constraintLayout;
        this.onePre2PostBackHomeButton = oneFontButton;
        this.onePre2PostGotoDeviceSaleButton = oneFontButton2;
        this.onePre2PostIconSuccessImageView = imageView;
        this.onePre2PostMobileNumberTextView = oneFontTextView;
        this.onePre2PostNextStepVerifyTextView = appCompatTextView;
        this.onePre2PostSimSerialTextView = oneFontTextView2;
        this.onePre2PostSuccessTextView = oneFontTextView3;
        this.onePre2PostVerifyIconImageView = imageView2;
        this.selectNextStepMessageTextView = oneFontTextView4;
    }

    @NonNull
    public static FragmentOnePre2PostSuccessBinding bind(@NonNull View view) {
        int i = R.id.onePre2PostBackHomeButton;
        OneFontButton oneFontButton = (OneFontButton) ViewBindings.findChildViewById(view, i);
        if (oneFontButton != null) {
            i = R.id.onePre2PostGotoDeviceSaleButton;
            OneFontButton oneFontButton2 = (OneFontButton) ViewBindings.findChildViewById(view, i);
            if (oneFontButton2 != null) {
                i = R.id.onePre2PostIconSuccessImageView;
                ImageView imageView = (ImageView) ViewBindings.findChildViewById(view, i);
                if (imageView != null) {
                    i = R.id.onePre2PostMobileNumberTextView;
                    OneFontTextView oneFontTextView = (OneFontTextView) ViewBindings.findChildViewById(view, i);
                    if (oneFontTextView != null) {
                        i = R.id.onePre2PostNextStepVerifyTextView;
                        AppCompatTextView appCompatTextView = (AppCompatTextView) ViewBindings.findChildViewById(view, i);
                        if (appCompatTextView != null) {
                            i = R.id.onePre2PostSimSerialTextView;
                            OneFontTextView oneFontTextView2 = (OneFontTextView) ViewBindings.findChildViewById(view, i);
                            if (oneFontTextView2 != null) {
                                i = R.id.onePre2PostSuccessTextView;
                                OneFontTextView oneFontTextView3 = (OneFontTextView) ViewBindings.findChildViewById(view, i);
                                if (oneFontTextView3 != null) {
                                    i = R.id.onePre2PostVerifyIconImageView;
                                    ImageView imageView2 = (ImageView) ViewBindings.findChildViewById(view, i);
                                    if (imageView2 != null) {
                                        i = R.id.selectNextStepMessageTextView;
                                        OneFontTextView oneFontTextView4 = (OneFontTextView) ViewBindings.findChildViewById(view, i);
                                        if (oneFontTextView4 != null) {
                                            return new FragmentOnePre2PostSuccessBinding((ConstraintLayout) view, oneFontButton, oneFontButton2, imageView, oneFontTextView, appCompatTextView, oneFontTextView2, oneFontTextView3, imageView2, oneFontTextView4);
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
    public static FragmentOnePre2PostSuccessBinding inflate(@NonNull LayoutInflater layoutInflater) {
        return inflate(layoutInflater, null, false);
    }

    @NonNull
    public static FragmentOnePre2PostSuccessBinding inflate(@NonNull LayoutInflater layoutInflater, @Nullable ViewGroup viewGroup, boolean z) {
        View inflate = layoutInflater.inflate(R.layout.fragment_one_pre2_post_success, viewGroup, false);
        if (z) {
            viewGroup.addView(inflate);
        }
        return bind(inflate);
    }

    @Override // androidx.viewbinding.ViewBinding
    @NonNull
    public ConstraintLayout getRoot() {
        return this.f84170a;
    }
}
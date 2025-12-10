package th.p047co.dtac.android.dtacone.databinding;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.appcompat.widget.AppCompatImageView;
import androidx.constraintlayout.widget.ConstraintLayout;
import androidx.viewbinding.ViewBinding;
import androidx.viewbinding.ViewBindings;
import th.p047co.dtac.android.dtacone.R;
import th.p047co.dtac.android.dtacone.app_one.widget.OneFontTextView;

/* renamed from: th.co.dtac.android.dtacone.databinding.IncludeOneAdditionalImageBinding */
/* loaded from: classes7.dex */
public final class IncludeOneAdditionalImageBinding implements ViewBinding {

    /* renamed from: a */
    public final ConstraintLayout f84257a;
    @NonNull
    public final OneFontTextView onlineRegisterImageNameTitleTextView;
    @NonNull
    public final AppCompatImageView onlineRegisterRetakeIdCardImageView;
    @NonNull
    public final OneFontTextView onlineRegisterRetakeIdCardTextView;
    @NonNull
    public final ConstraintLayout retakeLabelLayout;
    @NonNull
    public final ConstraintLayout retakePhotoLayout;

    public IncludeOneAdditionalImageBinding(ConstraintLayout constraintLayout, OneFontTextView oneFontTextView, AppCompatImageView appCompatImageView, OneFontTextView oneFontTextView2, ConstraintLayout constraintLayout2, ConstraintLayout constraintLayout3) {
        this.f84257a = constraintLayout;
        this.onlineRegisterImageNameTitleTextView = oneFontTextView;
        this.onlineRegisterRetakeIdCardImageView = appCompatImageView;
        this.onlineRegisterRetakeIdCardTextView = oneFontTextView2;
        this.retakeLabelLayout = constraintLayout2;
        this.retakePhotoLayout = constraintLayout3;
    }

    @NonNull
    public static IncludeOneAdditionalImageBinding bind(@NonNull View view) {
        int i = R.id.onlineRegisterImageNameTitleTextView;
        OneFontTextView oneFontTextView = (OneFontTextView) ViewBindings.findChildViewById(view, i);
        if (oneFontTextView != null) {
            i = R.id.onlineRegisterRetakeIdCardImageView;
            AppCompatImageView appCompatImageView = (AppCompatImageView) ViewBindings.findChildViewById(view, i);
            if (appCompatImageView != null) {
                i = R.id.onlineRegisterRetakeIdCardTextView;
                OneFontTextView oneFontTextView2 = (OneFontTextView) ViewBindings.findChildViewById(view, i);
                if (oneFontTextView2 != null) {
                    i = R.id.retakeLabelLayout;
                    ConstraintLayout constraintLayout = (ConstraintLayout) ViewBindings.findChildViewById(view, i);
                    if (constraintLayout != null) {
                        i = R.id.retakePhotoLayout;
                        ConstraintLayout constraintLayout2 = (ConstraintLayout) ViewBindings.findChildViewById(view, i);
                        if (constraintLayout2 != null) {
                            return new IncludeOneAdditionalImageBinding((ConstraintLayout) view, oneFontTextView, appCompatImageView, oneFontTextView2, constraintLayout, constraintLayout2);
                        }
                    }
                }
            }
        }
        throw new NullPointerException("Missing required view with ID: ".concat(view.getResources().getResourceName(i)));
    }

    @NonNull
    public static IncludeOneAdditionalImageBinding inflate(@NonNull LayoutInflater layoutInflater) {
        return inflate(layoutInflater, null, false);
    }

    @NonNull
    public static IncludeOneAdditionalImageBinding inflate(@NonNull LayoutInflater layoutInflater, @Nullable ViewGroup viewGroup, boolean z) {
        View inflate = layoutInflater.inflate(R.layout.include_one_additional_image, viewGroup, false);
        if (z) {
            viewGroup.addView(inflate);
        }
        return bind(inflate);
    }

    @Override // androidx.viewbinding.ViewBinding
    @NonNull
    public ConstraintLayout getRoot() {
        return this.f84257a;
    }
}

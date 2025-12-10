package th.p047co.dtac.android.dtacone.databinding;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.FrameLayout;
import android.widget.LinearLayout;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.constraintlayout.widget.ConstraintLayout;
import androidx.viewbinding.ViewBinding;
import androidx.viewbinding.ViewBindings;
import com.inthecheesefactory.thecheeselibrary.widget.AdjustableImageView;
import th.p047co.dtac.android.dtacone.R;
import th.p047co.dtac.android.dtacone.app_one.widget.OneFontButton;

/* renamed from: th.co.dtac.android.dtacone.databinding.FragmentOneOnlineRegistrationPreviewOptionalImageBinding */
/* loaded from: classes7.dex */
public final class FragmentOneOnlineRegistrationPreviewOptionalImageBinding implements ViewBinding {

    /* renamed from: a */
    public final ConstraintLayout f84001a;
    @NonNull
    public final LinearLayout bottomLayout;
    @NonNull
    public final FrameLayout centerFrameLayout;
    @NonNull
    public final OneFontButton photoOkButton;
    @NonNull
    public final AdjustableImageView previewImageView;
    @NonNull
    public final OneFontButton retakePhotoButton;
    @NonNull
    public final OneTransparentToolbarBinding toolbarLayout;
    @NonNull
    public final FrameLayout topFrameLayout;

    public FragmentOneOnlineRegistrationPreviewOptionalImageBinding(ConstraintLayout constraintLayout, LinearLayout linearLayout, FrameLayout frameLayout, OneFontButton oneFontButton, AdjustableImageView adjustableImageView, OneFontButton oneFontButton2, OneTransparentToolbarBinding oneTransparentToolbarBinding, FrameLayout frameLayout2) {
        this.f84001a = constraintLayout;
        this.bottomLayout = linearLayout;
        this.centerFrameLayout = frameLayout;
        this.photoOkButton = oneFontButton;
        this.previewImageView = adjustableImageView;
        this.retakePhotoButton = oneFontButton2;
        this.toolbarLayout = oneTransparentToolbarBinding;
        this.topFrameLayout = frameLayout2;
    }

    @NonNull
    public static FragmentOneOnlineRegistrationPreviewOptionalImageBinding bind(@NonNull View view) {
        View findChildViewById;
        int i = R.id.bottomLayout;
        LinearLayout linearLayout = (LinearLayout) ViewBindings.findChildViewById(view, i);
        if (linearLayout != null) {
            i = R.id.centerFrameLayout;
            FrameLayout frameLayout = (FrameLayout) ViewBindings.findChildViewById(view, i);
            if (frameLayout != null) {
                i = R.id.photoOkButton;
                OneFontButton oneFontButton = (OneFontButton) ViewBindings.findChildViewById(view, i);
                if (oneFontButton != null) {
                    i = R.id.previewImageView;
                    AdjustableImageView adjustableImageView = (AdjustableImageView) ViewBindings.findChildViewById(view, i);
                    if (adjustableImageView != null) {
                        i = R.id.retakePhotoButton;
                        OneFontButton oneFontButton2 = (OneFontButton) ViewBindings.findChildViewById(view, i);
                        if (oneFontButton2 != null && (findChildViewById = ViewBindings.findChildViewById(view, (i = R.id.toolbarLayout))) != null) {
                            OneTransparentToolbarBinding bind = OneTransparentToolbarBinding.bind(findChildViewById);
                            i = R.id.topFrameLayout;
                            FrameLayout frameLayout2 = (FrameLayout) ViewBindings.findChildViewById(view, i);
                            if (frameLayout2 != null) {
                                return new FragmentOneOnlineRegistrationPreviewOptionalImageBinding((ConstraintLayout) view, linearLayout, frameLayout, oneFontButton, adjustableImageView, oneFontButton2, bind, frameLayout2);
                            }
                        }
                    }
                }
            }
        }
        throw new NullPointerException("Missing required view with ID: ".concat(view.getResources().getResourceName(i)));
    }

    @NonNull
    public static FragmentOneOnlineRegistrationPreviewOptionalImageBinding inflate(@NonNull LayoutInflater layoutInflater) {
        return inflate(layoutInflater, null, false);
    }

    @NonNull
    public static FragmentOneOnlineRegistrationPreviewOptionalImageBinding inflate(@NonNull LayoutInflater layoutInflater, @Nullable ViewGroup viewGroup, boolean z) {
        View inflate = layoutInflater.inflate(R.layout.fragment_one_online_registration_preview_optional_image, viewGroup, false);
        if (z) {
            viewGroup.addView(inflate);
        }
        return bind(inflate);
    }

    @Override // androidx.viewbinding.ViewBinding
    @NonNull
    public ConstraintLayout getRoot() {
        return this.f84001a;
    }
}

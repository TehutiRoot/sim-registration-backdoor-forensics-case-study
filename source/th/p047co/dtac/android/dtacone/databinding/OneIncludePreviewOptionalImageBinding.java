package th.p047co.dtac.android.dtacone.databinding;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.FrameLayout;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.percentlayout.widget.PercentRelativeLayout;
import androidx.viewbinding.ViewBinding;
import androidx.viewbinding.ViewBindings;
import com.inthecheesefactory.thecheeselibrary.widget.AdjustableImageView;
import th.p047co.dtac.android.dtacone.R;
import th.p047co.dtac.android.dtacone.app_one.widget.OneFontButton;

/* renamed from: th.co.dtac.android.dtacone.databinding.OneIncludePreviewOptionalImageBinding */
/* loaded from: classes7.dex */
public final class OneIncludePreviewOptionalImageBinding implements ViewBinding {

    /* renamed from: a */
    public final FrameLayout f84481a;
    @NonNull
    public final PercentRelativeLayout bottom;
    @NonNull
    public final OneFontButton btnPhotoOk;
    @NonNull
    public final OneFontButton btnRetry;
    @NonNull
    public final OneFontButton btnTakeMorePhoto;
    @NonNull
    public final AdjustableImageView ivPreview;

    public OneIncludePreviewOptionalImageBinding(FrameLayout frameLayout, PercentRelativeLayout percentRelativeLayout, OneFontButton oneFontButton, OneFontButton oneFontButton2, OneFontButton oneFontButton3, AdjustableImageView adjustableImageView) {
        this.f84481a = frameLayout;
        this.bottom = percentRelativeLayout;
        this.btnPhotoOk = oneFontButton;
        this.btnRetry = oneFontButton2;
        this.btnTakeMorePhoto = oneFontButton3;
        this.ivPreview = adjustableImageView;
    }

    @NonNull
    public static OneIncludePreviewOptionalImageBinding bind(@NonNull View view) {
        int i = R.id.bottom;
        PercentRelativeLayout percentRelativeLayout = (PercentRelativeLayout) ViewBindings.findChildViewById(view, i);
        if (percentRelativeLayout != null) {
            i = R.id.btnPhotoOk;
            OneFontButton oneFontButton = (OneFontButton) ViewBindings.findChildViewById(view, i);
            if (oneFontButton != null) {
                i = R.id.btnRetry;
                OneFontButton oneFontButton2 = (OneFontButton) ViewBindings.findChildViewById(view, i);
                if (oneFontButton2 != null) {
                    i = R.id.btnTakeMorePhoto;
                    OneFontButton oneFontButton3 = (OneFontButton) ViewBindings.findChildViewById(view, i);
                    if (oneFontButton3 != null) {
                        i = R.id.ivPreview;
                        AdjustableImageView adjustableImageView = (AdjustableImageView) ViewBindings.findChildViewById(view, i);
                        if (adjustableImageView != null) {
                            return new OneIncludePreviewOptionalImageBinding((FrameLayout) view, percentRelativeLayout, oneFontButton, oneFontButton2, oneFontButton3, adjustableImageView);
                        }
                    }
                }
            }
        }
        throw new NullPointerException("Missing required view with ID: ".concat(view.getResources().getResourceName(i)));
    }

    @NonNull
    public static OneIncludePreviewOptionalImageBinding inflate(@NonNull LayoutInflater layoutInflater) {
        return inflate(layoutInflater, null, false);
    }

    @NonNull
    public static OneIncludePreviewOptionalImageBinding inflate(@NonNull LayoutInflater layoutInflater, @Nullable ViewGroup viewGroup, boolean z) {
        View inflate = layoutInflater.inflate(R.layout.one_include_preview_optional_image, viewGroup, false);
        if (z) {
            viewGroup.addView(inflate);
        }
        return bind(inflate);
    }

    @Override // androidx.viewbinding.ViewBinding
    @NonNull
    public FrameLayout getRoot() {
        return this.f84481a;
    }
}

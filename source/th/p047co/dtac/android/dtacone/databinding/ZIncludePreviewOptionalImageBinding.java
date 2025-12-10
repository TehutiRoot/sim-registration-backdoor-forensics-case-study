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
import th.p047co.dtac.android.dtacone.widget.view.DtacFontButton;

/* renamed from: th.co.dtac.android.dtacone.databinding.ZIncludePreviewOptionalImageBinding */
/* loaded from: classes7.dex */
public final class ZIncludePreviewOptionalImageBinding implements ViewBinding {

    /* renamed from: a */
    public final FrameLayout f84645a;
    @NonNull
    public final PercentRelativeLayout bottom;
    @NonNull
    public final DtacFontButton btnPhotoOk;
    @NonNull
    public final DtacFontButton btnRetry;
    @NonNull
    public final DtacFontButton btnTakeMorePhoto;
    @NonNull
    public final AdjustableImageView ivPreview;

    public ZIncludePreviewOptionalImageBinding(FrameLayout frameLayout, PercentRelativeLayout percentRelativeLayout, DtacFontButton dtacFontButton, DtacFontButton dtacFontButton2, DtacFontButton dtacFontButton3, AdjustableImageView adjustableImageView) {
        this.f84645a = frameLayout;
        this.bottom = percentRelativeLayout;
        this.btnPhotoOk = dtacFontButton;
        this.btnRetry = dtacFontButton2;
        this.btnTakeMorePhoto = dtacFontButton3;
        this.ivPreview = adjustableImageView;
    }

    @NonNull
    public static ZIncludePreviewOptionalImageBinding bind(@NonNull View view) {
        int i = R.id.bottom;
        PercentRelativeLayout percentRelativeLayout = (PercentRelativeLayout) ViewBindings.findChildViewById(view, i);
        if (percentRelativeLayout != null) {
            i = R.id.btnPhotoOk;
            DtacFontButton dtacFontButton = (DtacFontButton) ViewBindings.findChildViewById(view, i);
            if (dtacFontButton != null) {
                i = R.id.btnRetry;
                DtacFontButton dtacFontButton2 = (DtacFontButton) ViewBindings.findChildViewById(view, i);
                if (dtacFontButton2 != null) {
                    i = R.id.btnTakeMorePhoto;
                    DtacFontButton dtacFontButton3 = (DtacFontButton) ViewBindings.findChildViewById(view, i);
                    if (dtacFontButton3 != null) {
                        i = R.id.ivPreview;
                        AdjustableImageView adjustableImageView = (AdjustableImageView) ViewBindings.findChildViewById(view, i);
                        if (adjustableImageView != null) {
                            return new ZIncludePreviewOptionalImageBinding((FrameLayout) view, percentRelativeLayout, dtacFontButton, dtacFontButton2, dtacFontButton3, adjustableImageView);
                        }
                    }
                }
            }
        }
        throw new NullPointerException("Missing required view with ID: ".concat(view.getResources().getResourceName(i)));
    }

    @NonNull
    public static ZIncludePreviewOptionalImageBinding inflate(@NonNull LayoutInflater layoutInflater) {
        return inflate(layoutInflater, null, false);
    }

    @NonNull
    public static ZIncludePreviewOptionalImageBinding inflate(@NonNull LayoutInflater layoutInflater, @Nullable ViewGroup viewGroup, boolean z) {
        View inflate = layoutInflater.inflate(R.layout.z_include_preview_optional_image, viewGroup, false);
        if (z) {
            viewGroup.addView(inflate);
        }
        return bind(inflate);
    }

    @Override // androidx.viewbinding.ViewBinding
    @NonNull
    public FrameLayout getRoot() {
        return this.f84645a;
    }
}

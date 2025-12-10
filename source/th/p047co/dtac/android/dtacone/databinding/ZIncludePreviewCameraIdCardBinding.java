package th.p047co.dtac.android.dtacone.databinding;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.FrameLayout;
import android.widget.LinearLayout;
import android.widget.RelativeLayout;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.percentlayout.widget.PercentRelativeLayout;
import androidx.viewbinding.ViewBinding;
import androidx.viewbinding.ViewBindings;
import com.inthecheesefactory.thecheeselibrary.widget.AdjustableImageView;
import th.p047co.dtac.android.dtacone.R;
import th.p047co.dtac.android.dtacone.widget.view.DtacFontButton;

/* renamed from: th.co.dtac.android.dtacone.databinding.ZIncludePreviewCameraIdCardBinding */
/* loaded from: classes7.dex */
public final class ZIncludePreviewCameraIdCardBinding implements ViewBinding {

    /* renamed from: a */
    public final PercentRelativeLayout f84644a;
    @NonNull
    public final RelativeLayout addPhotos;
    @NonNull
    public final LinearLayout bottom;
    @NonNull
    public final DtacFontButton btnPhotoOk;
    @NonNull
    public final DtacFontButton btnRetry;
    @NonNull
    public final DtacFontButton btnTakeMorePhoto;
    @NonNull
    public final AdjustableImageView ivPreview;
    @NonNull
    public final FrameLayout middle;
    @NonNull
    public final FrameLayout top;

    public ZIncludePreviewCameraIdCardBinding(PercentRelativeLayout percentRelativeLayout, RelativeLayout relativeLayout, LinearLayout linearLayout, DtacFontButton dtacFontButton, DtacFontButton dtacFontButton2, DtacFontButton dtacFontButton3, AdjustableImageView adjustableImageView, FrameLayout frameLayout, FrameLayout frameLayout2) {
        this.f84644a = percentRelativeLayout;
        this.addPhotos = relativeLayout;
        this.bottom = linearLayout;
        this.btnPhotoOk = dtacFontButton;
        this.btnRetry = dtacFontButton2;
        this.btnTakeMorePhoto = dtacFontButton3;
        this.ivPreview = adjustableImageView;
        this.middle = frameLayout;
        this.top = frameLayout2;
    }

    @NonNull
    public static ZIncludePreviewCameraIdCardBinding bind(@NonNull View view) {
        int i = R.id.addPhotos;
        RelativeLayout relativeLayout = (RelativeLayout) ViewBindings.findChildViewById(view, i);
        if (relativeLayout != null) {
            i = R.id.bottom;
            LinearLayout linearLayout = (LinearLayout) ViewBindings.findChildViewById(view, i);
            if (linearLayout != null) {
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
                                i = R.id.middle;
                                FrameLayout frameLayout = (FrameLayout) ViewBindings.findChildViewById(view, i);
                                if (frameLayout != null) {
                                    i = R.id.top;
                                    FrameLayout frameLayout2 = (FrameLayout) ViewBindings.findChildViewById(view, i);
                                    if (frameLayout2 != null) {
                                        return new ZIncludePreviewCameraIdCardBinding((PercentRelativeLayout) view, relativeLayout, linearLayout, dtacFontButton, dtacFontButton2, dtacFontButton3, adjustableImageView, frameLayout, frameLayout2);
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
    public static ZIncludePreviewCameraIdCardBinding inflate(@NonNull LayoutInflater layoutInflater) {
        return inflate(layoutInflater, null, false);
    }

    @NonNull
    public static ZIncludePreviewCameraIdCardBinding inflate(@NonNull LayoutInflater layoutInflater, @Nullable ViewGroup viewGroup, boolean z) {
        View inflate = layoutInflater.inflate(R.layout.z_include_preview_camera_id_card, viewGroup, false);
        if (z) {
            viewGroup.addView(inflate);
        }
        return bind(inflate);
    }

    @Override // androidx.viewbinding.ViewBinding
    @NonNull
    public PercentRelativeLayout getRoot() {
        return this.f84644a;
    }
}

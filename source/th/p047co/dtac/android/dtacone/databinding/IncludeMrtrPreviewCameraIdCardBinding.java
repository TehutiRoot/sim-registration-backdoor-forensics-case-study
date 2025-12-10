package th.p047co.dtac.android.dtacone.databinding;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.FrameLayout;
import android.widget.ImageView;
import android.widget.LinearLayout;
import android.widget.RelativeLayout;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.constraintlayout.widget.ConstraintLayout;
import androidx.viewbinding.ViewBinding;
import androidx.viewbinding.ViewBindings;
import th.p047co.dtac.android.dtacone.R;
import th.p047co.dtac.android.dtacone.widget.view.DtacFontButton;
import th.p047co.dtac.android.dtacone.widget.view.DtacFontTextView;

/* renamed from: th.co.dtac.android.dtacone.databinding.IncludeMrtrPreviewCameraIdCardBinding */
/* loaded from: classes7.dex */
public final class IncludeMrtrPreviewCameraIdCardBinding implements ViewBinding {

    /* renamed from: a */
    public final ConstraintLayout f84251a;
    @NonNull
    public final RelativeLayout addPhotos;
    @NonNull
    public final LinearLayout bottom;
    @NonNull
    public final DtacFontButton btnMiddle;
    @NonNull
    public final DtacFontButton btnPhotoOk;
    @NonNull
    public final DtacFontButton btnRetry;
    @NonNull
    public final DtacFontButton btnTakeMorePhoto;
    @NonNull
    public final ImageView ivPreview;
    @NonNull
    public final ImageView ivTag;
    @NonNull
    public final ImageView ivTagAttorney;
    @NonNull
    public final ConstraintLayout layoutButton;
    @NonNull
    public final ConstraintLayout layoutTag;
    @NonNull
    public final FrameLayout middle;
    @NonNull
    public final DtacFontTextView tvCameraHelper;

    public IncludeMrtrPreviewCameraIdCardBinding(ConstraintLayout constraintLayout, RelativeLayout relativeLayout, LinearLayout linearLayout, DtacFontButton dtacFontButton, DtacFontButton dtacFontButton2, DtacFontButton dtacFontButton3, DtacFontButton dtacFontButton4, ImageView imageView, ImageView imageView2, ImageView imageView3, ConstraintLayout constraintLayout2, ConstraintLayout constraintLayout3, FrameLayout frameLayout, DtacFontTextView dtacFontTextView) {
        this.f84251a = constraintLayout;
        this.addPhotos = relativeLayout;
        this.bottom = linearLayout;
        this.btnMiddle = dtacFontButton;
        this.btnPhotoOk = dtacFontButton2;
        this.btnRetry = dtacFontButton3;
        this.btnTakeMorePhoto = dtacFontButton4;
        this.ivPreview = imageView;
        this.ivTag = imageView2;
        this.ivTagAttorney = imageView3;
        this.layoutButton = constraintLayout2;
        this.layoutTag = constraintLayout3;
        this.middle = frameLayout;
        this.tvCameraHelper = dtacFontTextView;
    }

    @NonNull
    public static IncludeMrtrPreviewCameraIdCardBinding bind(@NonNull View view) {
        int i = R.id.addPhotos;
        RelativeLayout relativeLayout = (RelativeLayout) ViewBindings.findChildViewById(view, i);
        if (relativeLayout != null) {
            i = R.id.bottom;
            LinearLayout linearLayout = (LinearLayout) ViewBindings.findChildViewById(view, i);
            if (linearLayout != null) {
                i = R.id.btnMiddle;
                DtacFontButton dtacFontButton = (DtacFontButton) ViewBindings.findChildViewById(view, i);
                if (dtacFontButton != null) {
                    i = R.id.btnPhotoOk;
                    DtacFontButton dtacFontButton2 = (DtacFontButton) ViewBindings.findChildViewById(view, i);
                    if (dtacFontButton2 != null) {
                        i = R.id.btnRetry;
                        DtacFontButton dtacFontButton3 = (DtacFontButton) ViewBindings.findChildViewById(view, i);
                        if (dtacFontButton3 != null) {
                            i = R.id.btnTakeMorePhoto;
                            DtacFontButton dtacFontButton4 = (DtacFontButton) ViewBindings.findChildViewById(view, i);
                            if (dtacFontButton4 != null) {
                                i = R.id.ivPreview;
                                ImageView imageView = (ImageView) ViewBindings.findChildViewById(view, i);
                                if (imageView != null) {
                                    i = R.id.ivTag;
                                    ImageView imageView2 = (ImageView) ViewBindings.findChildViewById(view, i);
                                    if (imageView2 != null) {
                                        i = R.id.ivTagAttorney;
                                        ImageView imageView3 = (ImageView) ViewBindings.findChildViewById(view, i);
                                        if (imageView3 != null) {
                                            i = R.id.layoutButton;
                                            ConstraintLayout constraintLayout = (ConstraintLayout) ViewBindings.findChildViewById(view, i);
                                            if (constraintLayout != null) {
                                                i = R.id.layout_tag;
                                                ConstraintLayout constraintLayout2 = (ConstraintLayout) ViewBindings.findChildViewById(view, i);
                                                if (constraintLayout2 != null) {
                                                    i = R.id.middle;
                                                    FrameLayout frameLayout = (FrameLayout) ViewBindings.findChildViewById(view, i);
                                                    if (frameLayout != null) {
                                                        i = R.id.tvCameraHelper;
                                                        DtacFontTextView dtacFontTextView = (DtacFontTextView) ViewBindings.findChildViewById(view, i);
                                                        if (dtacFontTextView != null) {
                                                            return new IncludeMrtrPreviewCameraIdCardBinding((ConstraintLayout) view, relativeLayout, linearLayout, dtacFontButton, dtacFontButton2, dtacFontButton3, dtacFontButton4, imageView, imageView2, imageView3, constraintLayout, constraintLayout2, frameLayout, dtacFontTextView);
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
        }
        throw new NullPointerException("Missing required view with ID: ".concat(view.getResources().getResourceName(i)));
    }

    @NonNull
    public static IncludeMrtrPreviewCameraIdCardBinding inflate(@NonNull LayoutInflater layoutInflater) {
        return inflate(layoutInflater, null, false);
    }

    @NonNull
    public static IncludeMrtrPreviewCameraIdCardBinding inflate(@NonNull LayoutInflater layoutInflater, @Nullable ViewGroup viewGroup, boolean z) {
        View inflate = layoutInflater.inflate(R.layout.include_mrtr_preview_camera_id_card, viewGroup, false);
        if (z) {
            viewGroup.addView(inflate);
        }
        return bind(inflate);
    }

    @Override // androidx.viewbinding.ViewBinding
    @NonNull
    public ConstraintLayout getRoot() {
        return this.f84251a;
    }
}

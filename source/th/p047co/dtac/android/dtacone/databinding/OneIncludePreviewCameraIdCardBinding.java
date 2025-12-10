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
import th.p047co.dtac.android.dtacone.app_one.widget.OneFontButton;
import th.p047co.dtac.android.dtacone.app_one.widget.OneFontTextView;

/* renamed from: th.co.dtac.android.dtacone.databinding.OneIncludePreviewCameraIdCardBinding */
/* loaded from: classes7.dex */
public final class OneIncludePreviewCameraIdCardBinding implements ViewBinding {

    /* renamed from: a */
    public final PercentRelativeLayout f84480a;
    @NonNull
    public final RelativeLayout addPhotos;
    @NonNull
    public final LinearLayout bottom;
    @NonNull
    public final OneFontButton btnPhotoOk;
    @NonNull
    public final OneFontButton btnRetry;
    @NonNull
    public final OneFontTextView btnTakeMorePhoto;
    @NonNull
    public final AdjustableImageView ivPreview;
    @NonNull
    public final FrameLayout middle;
    @NonNull
    public final FrameLayout top;

    public OneIncludePreviewCameraIdCardBinding(PercentRelativeLayout percentRelativeLayout, RelativeLayout relativeLayout, LinearLayout linearLayout, OneFontButton oneFontButton, OneFontButton oneFontButton2, OneFontTextView oneFontTextView, AdjustableImageView adjustableImageView, FrameLayout frameLayout, FrameLayout frameLayout2) {
        this.f84480a = percentRelativeLayout;
        this.addPhotos = relativeLayout;
        this.bottom = linearLayout;
        this.btnPhotoOk = oneFontButton;
        this.btnRetry = oneFontButton2;
        this.btnTakeMorePhoto = oneFontTextView;
        this.ivPreview = adjustableImageView;
        this.middle = frameLayout;
        this.top = frameLayout2;
    }

    @NonNull
    public static OneIncludePreviewCameraIdCardBinding bind(@NonNull View view) {
        int i = R.id.addPhotos;
        RelativeLayout relativeLayout = (RelativeLayout) ViewBindings.findChildViewById(view, i);
        if (relativeLayout != null) {
            i = R.id.bottom;
            LinearLayout linearLayout = (LinearLayout) ViewBindings.findChildViewById(view, i);
            if (linearLayout != null) {
                i = R.id.btnPhotoOk;
                OneFontButton oneFontButton = (OneFontButton) ViewBindings.findChildViewById(view, i);
                if (oneFontButton != null) {
                    i = R.id.btnRetry;
                    OneFontButton oneFontButton2 = (OneFontButton) ViewBindings.findChildViewById(view, i);
                    if (oneFontButton2 != null) {
                        i = R.id.btnTakeMorePhoto;
                        OneFontTextView oneFontTextView = (OneFontTextView) ViewBindings.findChildViewById(view, i);
                        if (oneFontTextView != null) {
                            i = R.id.ivPreview;
                            AdjustableImageView adjustableImageView = (AdjustableImageView) ViewBindings.findChildViewById(view, i);
                            if (adjustableImageView != null) {
                                i = R.id.middle;
                                FrameLayout frameLayout = (FrameLayout) ViewBindings.findChildViewById(view, i);
                                if (frameLayout != null) {
                                    i = R.id.top;
                                    FrameLayout frameLayout2 = (FrameLayout) ViewBindings.findChildViewById(view, i);
                                    if (frameLayout2 != null) {
                                        return new OneIncludePreviewCameraIdCardBinding((PercentRelativeLayout) view, relativeLayout, linearLayout, oneFontButton, oneFontButton2, oneFontTextView, adjustableImageView, frameLayout, frameLayout2);
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
    public static OneIncludePreviewCameraIdCardBinding inflate(@NonNull LayoutInflater layoutInflater) {
        return inflate(layoutInflater, null, false);
    }

    @NonNull
    public static OneIncludePreviewCameraIdCardBinding inflate(@NonNull LayoutInflater layoutInflater, @Nullable ViewGroup viewGroup, boolean z) {
        View inflate = layoutInflater.inflate(R.layout.one_include_preview_camera_id_card, viewGroup, false);
        if (z) {
            viewGroup.addView(inflate);
        }
        return bind(inflate);
    }

    @Override // androidx.viewbinding.ViewBinding
    @NonNull
    public PercentRelativeLayout getRoot() {
        return this.f84480a;
    }
}

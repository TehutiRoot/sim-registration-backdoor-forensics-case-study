package th.p047co.dtac.android.dtacone.databinding;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.RelativeLayout;
import androidx.annotation.NonNull;
import androidx.constraintlayout.widget.ConstraintLayout;
import androidx.constraintlayout.widget.Guideline;
import androidx.viewbinding.ViewBinding;
import androidx.viewbinding.ViewBindings;
import com.google.android.cameraview.CameraView;
import th.p047co.dtac.android.dtacone.R;
import th.p047co.dtac.android.dtacone.app_one.widget.OneFontButton;
import th.p047co.dtac.android.dtacone.app_one.widget.OneFontTextView;
import th.p047co.dtac.android.dtacone.widget.view.DtacTouchView;
import th.p047co.dtac.android.dtacone.widget.view.ViewFinderView;

/* renamed from: th.co.dtac.android.dtacone.databinding.OneIncludeMrtrCameraViewBinding */
/* loaded from: classes7.dex */
public final class OneIncludeMrtrCameraViewBinding implements ViewBinding {
    @NonNull
    public final ConstraintLayout LayoutMessageInfoLower;

    /* renamed from: a */
    public final View f84582a;
    @NonNull
    public final Guideline onlineRegisterBottomGuideline;
    @NonNull
    public final OneFontTextView onlineRegisterCameraHelperTextView;
    @NonNull
    public final CameraView onlineRegisterCameraView;
    @NonNull
    public final ImageView onlineRegisterIdCardImageView;
    @NonNull
    public final ImageView onlineRegisterMassageInfoImageView;
    @NonNull
    public final OneFontTextView onlineRegisterMassageInfoTextView;
    @NonNull
    public final OneFontButton onlineRegisterTakePhotoButton;
    @NonNull
    public final RelativeLayout onlineRegisterTakePhotoLayout;
    @NonNull
    public final Guideline onlineRegisterTopGuideline;
    @NonNull
    public final ViewFinderView onlineRegisterViewFinderView;
    @NonNull
    public final DtacTouchView onlineRegisterViewFocus;

    public OneIncludeMrtrCameraViewBinding(View view, ConstraintLayout constraintLayout, Guideline guideline, OneFontTextView oneFontTextView, CameraView cameraView, ImageView imageView, ImageView imageView2, OneFontTextView oneFontTextView2, OneFontButton oneFontButton, RelativeLayout relativeLayout, Guideline guideline2, ViewFinderView viewFinderView, DtacTouchView dtacTouchView) {
        this.f84582a = view;
        this.LayoutMessageInfoLower = constraintLayout;
        this.onlineRegisterBottomGuideline = guideline;
        this.onlineRegisterCameraHelperTextView = oneFontTextView;
        this.onlineRegisterCameraView = cameraView;
        this.onlineRegisterIdCardImageView = imageView;
        this.onlineRegisterMassageInfoImageView = imageView2;
        this.onlineRegisterMassageInfoTextView = oneFontTextView2;
        this.onlineRegisterTakePhotoButton = oneFontButton;
        this.onlineRegisterTakePhotoLayout = relativeLayout;
        this.onlineRegisterTopGuideline = guideline2;
        this.onlineRegisterViewFinderView = viewFinderView;
        this.onlineRegisterViewFocus = dtacTouchView;
    }

    @NonNull
    public static OneIncludeMrtrCameraViewBinding bind(@NonNull View view) {
        int i = R.id.LayoutMessageInfoLower;
        ConstraintLayout constraintLayout = (ConstraintLayout) ViewBindings.findChildViewById(view, i);
        if (constraintLayout != null) {
            i = R.id.onlineRegisterBottomGuideline;
            Guideline guideline = (Guideline) ViewBindings.findChildViewById(view, i);
            if (guideline != null) {
                i = R.id.onlineRegisterCameraHelperTextView;
                OneFontTextView oneFontTextView = (OneFontTextView) ViewBindings.findChildViewById(view, i);
                if (oneFontTextView != null) {
                    i = R.id.onlineRegisterCameraView;
                    CameraView cameraView = (CameraView) ViewBindings.findChildViewById(view, i);
                    if (cameraView != null) {
                        i = R.id.onlineRegisterIdCardImageView;
                        ImageView imageView = (ImageView) ViewBindings.findChildViewById(view, i);
                        if (imageView != null) {
                            i = R.id.onlineRegisterMassageInfoImageView;
                            ImageView imageView2 = (ImageView) ViewBindings.findChildViewById(view, i);
                            if (imageView2 != null) {
                                i = R.id.onlineRegisterMassageInfoTextView;
                                OneFontTextView oneFontTextView2 = (OneFontTextView) ViewBindings.findChildViewById(view, i);
                                if (oneFontTextView2 != null) {
                                    i = R.id.onlineRegisterTakePhotoButton;
                                    OneFontButton oneFontButton = (OneFontButton) ViewBindings.findChildViewById(view, i);
                                    if (oneFontButton != null) {
                                        i = R.id.onlineRegisterTakePhotoLayout;
                                        RelativeLayout relativeLayout = (RelativeLayout) ViewBindings.findChildViewById(view, i);
                                        if (relativeLayout != null) {
                                            i = R.id.onlineRegisterTopGuideline;
                                            Guideline guideline2 = (Guideline) ViewBindings.findChildViewById(view, i);
                                            if (guideline2 != null) {
                                                i = R.id.onlineRegisterViewFinderView;
                                                ViewFinderView viewFinderView = (ViewFinderView) ViewBindings.findChildViewById(view, i);
                                                if (viewFinderView != null) {
                                                    i = R.id.onlineRegisterViewFocus;
                                                    DtacTouchView dtacTouchView = (DtacTouchView) ViewBindings.findChildViewById(view, i);
                                                    if (dtacTouchView != null) {
                                                        return new OneIncludeMrtrCameraViewBinding(view, constraintLayout, guideline, oneFontTextView, cameraView, imageView, imageView2, oneFontTextView2, oneFontButton, relativeLayout, guideline2, viewFinderView, dtacTouchView);
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
    public static OneIncludeMrtrCameraViewBinding inflate(@NonNull LayoutInflater layoutInflater, @NonNull ViewGroup viewGroup) {
        if (viewGroup != null) {
            layoutInflater.inflate(R.layout.one_include_mrtr_camera_view, viewGroup);
            return bind(viewGroup);
        }
        throw new NullPointerException("parent");
    }

    @Override // androidx.viewbinding.ViewBinding
    @NonNull
    public View getRoot() {
        return this.f84582a;
    }
}
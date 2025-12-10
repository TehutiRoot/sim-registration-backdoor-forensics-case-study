package th.p047co.dtac.android.dtacone.databinding;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.RelativeLayout;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.constraintlayout.widget.ConstraintLayout;
import androidx.coordinatorlayout.widget.CoordinatorLayout;
import androidx.viewbinding.ViewBinding;
import androidx.viewbinding.ViewBindings;
import com.google.android.cameraview.CameraView;
import th.p047co.dtac.android.dtacone.R;
import th.p047co.dtac.android.dtacone.app_one.widget.OneFontTextView;
import th.p047co.dtac.android.dtacone.widget.view.DtacTouchView;
import th.p047co.dtac.android.dtacone.widget.view.ViewFinderView;

/* renamed from: th.co.dtac.android.dtacone.databinding.OneIncludeNewCameraViewBinding */
/* loaded from: classes7.dex */
public final class OneIncludeNewCameraViewBinding implements ViewBinding {
    @NonNull
    public final ConstraintLayout LayoutMessageInfoLower;

    /* renamed from: a */
    public final CoordinatorLayout f84474a;
    @NonNull
    public final RelativeLayout bottom;
    @NonNull
    public final CameraView cameraview;
    @NonNull
    public final ImageView imageView31;
    @NonNull
    public final ImageView imageView32;
    @NonNull
    public final OneIncludeCameraButtonBinding incCameraButton;
    @NonNull
    public final ImageView ivTag;
    @NonNull
    public final ImageView ivTagAttorney;
    @NonNull
    public final ConstraintLayout layoutInfo;
    @NonNull
    public final ConstraintLayout layoutMessageInfo;
    @NonNull
    public final ConstraintLayout layoutTag;
    @NonNull
    public final View top;
    @NonNull
    public final OneFontTextView tvCameraHelper;
    @NonNull
    public final OneFontTextView tvMessageInfo;
    @NonNull
    public final OneFontTextView tvMessageInfoLower;
    @NonNull
    public final ViewFinderView viewFinderView;
    @NonNull
    public final DtacTouchView viewFocus;

    public OneIncludeNewCameraViewBinding(CoordinatorLayout coordinatorLayout, ConstraintLayout constraintLayout, RelativeLayout relativeLayout, CameraView cameraView, ImageView imageView, ImageView imageView2, OneIncludeCameraButtonBinding oneIncludeCameraButtonBinding, ImageView imageView3, ImageView imageView4, ConstraintLayout constraintLayout2, ConstraintLayout constraintLayout3, ConstraintLayout constraintLayout4, View view, OneFontTextView oneFontTextView, OneFontTextView oneFontTextView2, OneFontTextView oneFontTextView3, ViewFinderView viewFinderView, DtacTouchView dtacTouchView) {
        this.f84474a = coordinatorLayout;
        this.LayoutMessageInfoLower = constraintLayout;
        this.bottom = relativeLayout;
        this.cameraview = cameraView;
        this.imageView31 = imageView;
        this.imageView32 = imageView2;
        this.incCameraButton = oneIncludeCameraButtonBinding;
        this.ivTag = imageView3;
        this.ivTagAttorney = imageView4;
        this.layoutInfo = constraintLayout2;
        this.layoutMessageInfo = constraintLayout3;
        this.layoutTag = constraintLayout4;
        this.top = view;
        this.tvCameraHelper = oneFontTextView;
        this.tvMessageInfo = oneFontTextView2;
        this.tvMessageInfoLower = oneFontTextView3;
        this.viewFinderView = viewFinderView;
        this.viewFocus = dtacTouchView;
    }

    @NonNull
    public static OneIncludeNewCameraViewBinding bind(@NonNull View view) {
        View findChildViewById;
        View findChildViewById2;
        int i = R.id.LayoutMessageInfoLower;
        ConstraintLayout constraintLayout = (ConstraintLayout) ViewBindings.findChildViewById(view, i);
        if (constraintLayout != null) {
            i = R.id.bottom;
            RelativeLayout relativeLayout = (RelativeLayout) ViewBindings.findChildViewById(view, i);
            if (relativeLayout != null) {
                i = R.id.cameraview;
                CameraView cameraView = (CameraView) ViewBindings.findChildViewById(view, i);
                if (cameraView != null) {
                    i = R.id.imageView31;
                    ImageView imageView = (ImageView) ViewBindings.findChildViewById(view, i);
                    if (imageView != null) {
                        i = R.id.imageView32;
                        ImageView imageView2 = (ImageView) ViewBindings.findChildViewById(view, i);
                        if (imageView2 != null && (findChildViewById = ViewBindings.findChildViewById(view, (i = R.id.incCameraButton))) != null) {
                            OneIncludeCameraButtonBinding bind = OneIncludeCameraButtonBinding.bind(findChildViewById);
                            i = R.id.ivTag;
                            ImageView imageView3 = (ImageView) ViewBindings.findChildViewById(view, i);
                            if (imageView3 != null) {
                                i = R.id.ivTagAttorney;
                                ImageView imageView4 = (ImageView) ViewBindings.findChildViewById(view, i);
                                if (imageView4 != null) {
                                    i = R.id.layoutInfo;
                                    ConstraintLayout constraintLayout2 = (ConstraintLayout) ViewBindings.findChildViewById(view, i);
                                    if (constraintLayout2 != null) {
                                        i = R.id.layoutMessageInfo;
                                        ConstraintLayout constraintLayout3 = (ConstraintLayout) ViewBindings.findChildViewById(view, i);
                                        if (constraintLayout3 != null) {
                                            i = R.id.layout_tag;
                                            ConstraintLayout constraintLayout4 = (ConstraintLayout) ViewBindings.findChildViewById(view, i);
                                            if (constraintLayout4 != null && (findChildViewById2 = ViewBindings.findChildViewById(view, (i = R.id.top))) != null) {
                                                i = R.id.tvCameraHelper;
                                                OneFontTextView oneFontTextView = (OneFontTextView) ViewBindings.findChildViewById(view, i);
                                                if (oneFontTextView != null) {
                                                    i = R.id.tvMessageInfo;
                                                    OneFontTextView oneFontTextView2 = (OneFontTextView) ViewBindings.findChildViewById(view, i);
                                                    if (oneFontTextView2 != null) {
                                                        i = R.id.tvMessageInfoLower;
                                                        OneFontTextView oneFontTextView3 = (OneFontTextView) ViewBindings.findChildViewById(view, i);
                                                        if (oneFontTextView3 != null) {
                                                            i = R.id.viewFinderView;
                                                            ViewFinderView viewFinderView = (ViewFinderView) ViewBindings.findChildViewById(view, i);
                                                            if (viewFinderView != null) {
                                                                i = R.id.viewFocus;
                                                                DtacTouchView dtacTouchView = (DtacTouchView) ViewBindings.findChildViewById(view, i);
                                                                if (dtacTouchView != null) {
                                                                    return new OneIncludeNewCameraViewBinding((CoordinatorLayout) view, constraintLayout, relativeLayout, cameraView, imageView, imageView2, bind, imageView3, imageView4, constraintLayout2, constraintLayout3, constraintLayout4, findChildViewById2, oneFontTextView, oneFontTextView2, oneFontTextView3, viewFinderView, dtacTouchView);
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
            }
        }
        throw new NullPointerException("Missing required view with ID: ".concat(view.getResources().getResourceName(i)));
    }

    @NonNull
    public static OneIncludeNewCameraViewBinding inflate(@NonNull LayoutInflater layoutInflater) {
        return inflate(layoutInflater, null, false);
    }

    @NonNull
    public static OneIncludeNewCameraViewBinding inflate(@NonNull LayoutInflater layoutInflater, @Nullable ViewGroup viewGroup, boolean z) {
        View inflate = layoutInflater.inflate(R.layout.one_include_new_camera_view, viewGroup, false);
        if (z) {
            viewGroup.addView(inflate);
        }
        return bind(inflate);
    }

    @Override // androidx.viewbinding.ViewBinding
    @NonNull
    public CoordinatorLayout getRoot() {
        return this.f84474a;
    }
}

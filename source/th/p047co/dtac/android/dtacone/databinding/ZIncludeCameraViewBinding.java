package th.p047co.dtac.android.dtacone.databinding;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageButton;
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
import th.p047co.dtac.android.dtacone.widget.view.DtacFontTextView;
import th.p047co.dtac.android.dtacone.widget.view.DtacTouchView;
import th.p047co.dtac.android.dtacone.widget.view.ViewFinderView;

/* renamed from: th.co.dtac.android.dtacone.databinding.ZIncludeCameraViewBinding */
/* loaded from: classes7.dex */
public final class ZIncludeCameraViewBinding implements ViewBinding {

    /* renamed from: a */
    public final CoordinatorLayout f84618a;
    @NonNull
    public final RelativeLayout bottom;
    @NonNull
    public final ImageButton btnSwitchReader;
    @NonNull
    public final DtacFontTextView cameraViewTitle;
    @NonNull
    public final CameraView cameraview;
    @NonNull
    public final DtacFontTextView dtacFontTextView53;
    @NonNull
    public final ImageView imageView31;
    @NonNull
    public final ZIncludeCameraButtonBinding incCameraButton;
    @NonNull
    public final ConstraintLayout messageInfo;
    @NonNull
    public final View top;
    @NonNull
    public final ViewFinderView viewFinderView;
    @NonNull
    public final DtacTouchView viewFocus;

    public ZIncludeCameraViewBinding(CoordinatorLayout coordinatorLayout, RelativeLayout relativeLayout, ImageButton imageButton, DtacFontTextView dtacFontTextView, CameraView cameraView, DtacFontTextView dtacFontTextView2, ImageView imageView, ZIncludeCameraButtonBinding zIncludeCameraButtonBinding, ConstraintLayout constraintLayout, View view, ViewFinderView viewFinderView, DtacTouchView dtacTouchView) {
        this.f84618a = coordinatorLayout;
        this.bottom = relativeLayout;
        this.btnSwitchReader = imageButton;
        this.cameraViewTitle = dtacFontTextView;
        this.cameraview = cameraView;
        this.dtacFontTextView53 = dtacFontTextView2;
        this.imageView31 = imageView;
        this.incCameraButton = zIncludeCameraButtonBinding;
        this.messageInfo = constraintLayout;
        this.top = view;
        this.viewFinderView = viewFinderView;
        this.viewFocus = dtacTouchView;
    }

    @NonNull
    public static ZIncludeCameraViewBinding bind(@NonNull View view) {
        View findChildViewById;
        View findChildViewById2;
        int i = R.id.bottom;
        RelativeLayout relativeLayout = (RelativeLayout) ViewBindings.findChildViewById(view, i);
        if (relativeLayout != null) {
            i = R.id.btnSwitchReader;
            ImageButton imageButton = (ImageButton) ViewBindings.findChildViewById(view, i);
            if (imageButton != null) {
                i = R.id.camera_view_title;
                DtacFontTextView dtacFontTextView = (DtacFontTextView) ViewBindings.findChildViewById(view, i);
                if (dtacFontTextView != null) {
                    i = R.id.cameraview;
                    CameraView cameraView = (CameraView) ViewBindings.findChildViewById(view, i);
                    if (cameraView != null) {
                        i = R.id.dtacFontTextView53;
                        DtacFontTextView dtacFontTextView2 = (DtacFontTextView) ViewBindings.findChildViewById(view, i);
                        if (dtacFontTextView2 != null) {
                            i = R.id.imageView31;
                            ImageView imageView = (ImageView) ViewBindings.findChildViewById(view, i);
                            if (imageView != null && (findChildViewById = ViewBindings.findChildViewById(view, (i = R.id.incCameraButton))) != null) {
                                ZIncludeCameraButtonBinding bind = ZIncludeCameraButtonBinding.bind(findChildViewById);
                                i = R.id.messageInfo;
                                ConstraintLayout constraintLayout = (ConstraintLayout) ViewBindings.findChildViewById(view, i);
                                if (constraintLayout != null && (findChildViewById2 = ViewBindings.findChildViewById(view, (i = R.id.top))) != null) {
                                    i = R.id.viewFinderView;
                                    ViewFinderView viewFinderView = (ViewFinderView) ViewBindings.findChildViewById(view, i);
                                    if (viewFinderView != null) {
                                        i = R.id.viewFocus;
                                        DtacTouchView dtacTouchView = (DtacTouchView) ViewBindings.findChildViewById(view, i);
                                        if (dtacTouchView != null) {
                                            return new ZIncludeCameraViewBinding((CoordinatorLayout) view, relativeLayout, imageButton, dtacFontTextView, cameraView, dtacFontTextView2, imageView, bind, constraintLayout, findChildViewById2, viewFinderView, dtacTouchView);
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
    public static ZIncludeCameraViewBinding inflate(@NonNull LayoutInflater layoutInflater) {
        return inflate(layoutInflater, null, false);
    }

    @NonNull
    public static ZIncludeCameraViewBinding inflate(@NonNull LayoutInflater layoutInflater, @Nullable ViewGroup viewGroup, boolean z) {
        View inflate = layoutInflater.inflate(R.layout.z_include_camera_view, viewGroup, false);
        if (z) {
            viewGroup.addView(inflate);
        }
        return bind(inflate);
    }

    @Override // androidx.viewbinding.ViewBinding
    @NonNull
    public CoordinatorLayout getRoot() {
        return this.f84618a;
    }
}

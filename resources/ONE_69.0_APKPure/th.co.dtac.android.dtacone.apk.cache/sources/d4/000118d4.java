package th.p047co.dtac.android.dtacone.databinding;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.RelativeLayout;
import androidx.annotation.NonNull;
import androidx.constraintlayout.widget.ConstraintLayout;
import androidx.viewbinding.ViewBinding;
import androidx.viewbinding.ViewBindings;
import com.google.android.cameraview.CameraView;
import th.p047co.dtac.android.dtacone.R;
import th.p047co.dtac.android.dtacone.widget.view.DtacFontTextView;
import th.p047co.dtac.android.dtacone.widget.view.DtacTouchView;

/* renamed from: th.co.dtac.android.dtacone.databinding.ZIncludeMrtrCameraViewBinding */
/* loaded from: classes7.dex */
public final class ZIncludeMrtrCameraViewBinding implements ViewBinding {
    @NonNull
    public final ConstraintLayout LayoutMessageInfoLower;

    /* renamed from: a */
    public final View f84739a;
    @NonNull
    public final RelativeLayout bottom;
    @NonNull
    public final CameraView cameraview;
    @NonNull
    public final ImageView imageView32;
    @NonNull
    public final ImageView ivTag;
    @NonNull
    public final ConstraintLayout layoutCamera;
    @NonNull
    public final DtacFontTextView tvCameraHelper;
    @NonNull
    public final DtacFontTextView tvMessageInfoLower;
    @NonNull
    public final DtacTouchView viewFocus;

    public ZIncludeMrtrCameraViewBinding(View view, ConstraintLayout constraintLayout, RelativeLayout relativeLayout, CameraView cameraView, ImageView imageView, ImageView imageView2, ConstraintLayout constraintLayout2, DtacFontTextView dtacFontTextView, DtacFontTextView dtacFontTextView2, DtacTouchView dtacTouchView) {
        this.f84739a = view;
        this.LayoutMessageInfoLower = constraintLayout;
        this.bottom = relativeLayout;
        this.cameraview = cameraView;
        this.imageView32 = imageView;
        this.ivTag = imageView2;
        this.layoutCamera = constraintLayout2;
        this.tvCameraHelper = dtacFontTextView;
        this.tvMessageInfoLower = dtacFontTextView2;
        this.viewFocus = dtacTouchView;
    }

    @NonNull
    public static ZIncludeMrtrCameraViewBinding bind(@NonNull View view) {
        int i = R.id.LayoutMessageInfoLower;
        ConstraintLayout constraintLayout = (ConstraintLayout) ViewBindings.findChildViewById(view, i);
        if (constraintLayout != null) {
            i = R.id.bottom;
            RelativeLayout relativeLayout = (RelativeLayout) ViewBindings.findChildViewById(view, i);
            if (relativeLayout != null) {
                i = R.id.cameraview;
                CameraView cameraView = (CameraView) ViewBindings.findChildViewById(view, i);
                if (cameraView != null) {
                    i = R.id.imageView32;
                    ImageView imageView = (ImageView) ViewBindings.findChildViewById(view, i);
                    if (imageView != null) {
                        i = R.id.ivTag;
                        ImageView imageView2 = (ImageView) ViewBindings.findChildViewById(view, i);
                        if (imageView2 != null) {
                            i = R.id.layoutCamera;
                            ConstraintLayout constraintLayout2 = (ConstraintLayout) ViewBindings.findChildViewById(view, i);
                            if (constraintLayout2 != null) {
                                i = R.id.tvCameraHelper;
                                DtacFontTextView dtacFontTextView = (DtacFontTextView) ViewBindings.findChildViewById(view, i);
                                if (dtacFontTextView != null) {
                                    i = R.id.tvMessageInfoLower;
                                    DtacFontTextView dtacFontTextView2 = (DtacFontTextView) ViewBindings.findChildViewById(view, i);
                                    if (dtacFontTextView2 != null) {
                                        i = R.id.viewFocus;
                                        DtacTouchView dtacTouchView = (DtacTouchView) ViewBindings.findChildViewById(view, i);
                                        if (dtacTouchView != null) {
                                            return new ZIncludeMrtrCameraViewBinding(view, constraintLayout, relativeLayout, cameraView, imageView, imageView2, constraintLayout2, dtacFontTextView, dtacFontTextView2, dtacTouchView);
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
    public static ZIncludeMrtrCameraViewBinding inflate(@NonNull LayoutInflater layoutInflater, @NonNull ViewGroup viewGroup) {
        if (viewGroup != null) {
            layoutInflater.inflate(R.layout.z_include_mrtr_camera_view, viewGroup);
            return bind(viewGroup);
        }
        throw new NullPointerException("parent");
    }

    @Override // androidx.viewbinding.ViewBinding
    @NonNull
    public View getRoot() {
        return this.f84739a;
    }
}
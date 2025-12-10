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
import androidx.percentlayout.widget.PercentRelativeLayout;
import androidx.viewbinding.ViewBinding;
import androidx.viewbinding.ViewBindings;
import com.google.android.cameraview.CameraView;
import th.p047co.dtac.android.dtacone.R;
import th.p047co.dtac.android.dtacone.widget.view.DtacFontTextView;
import th.p047co.dtac.android.dtacone.widget.view.DtacTouchView;
import th.p047co.dtac.android.dtacone.widget.view.ViewFinderView;

/* renamed from: th.co.dtac.android.dtacone.databinding.ActivityFaceCameraBinding */
/* loaded from: classes7.dex */
public final class ActivityFaceCameraBinding implements ViewBinding {

    /* renamed from: a */
    public final CoordinatorLayout f83515a;
    @NonNull
    public final RelativeLayout bottom;
    @NonNull
    public final CameraView cameraview;
    @NonNull
    public final CoordinatorLayout container;
    @NonNull
    public final PercentRelativeLayout containerPercent;
    @NonNull
    public final ImageView imageView31;
    @NonNull
    public final ZIncludeCameraButtonBinding incCamButton;
    @NonNull
    public final ConstraintLayout messageInfo;
    @NonNull
    public final View top;
    @NonNull
    public final DtacFontTextView tvFaceCameraTitle;
    @NonNull
    public final DtacFontTextView tvMessageInfo;
    @NonNull
    public final ViewFinderView viewFinderView;
    @NonNull
    public final DtacTouchView viewFocus;

    public ActivityFaceCameraBinding(CoordinatorLayout coordinatorLayout, RelativeLayout relativeLayout, CameraView cameraView, CoordinatorLayout coordinatorLayout2, PercentRelativeLayout percentRelativeLayout, ImageView imageView, ZIncludeCameraButtonBinding zIncludeCameraButtonBinding, ConstraintLayout constraintLayout, View view, DtacFontTextView dtacFontTextView, DtacFontTextView dtacFontTextView2, ViewFinderView viewFinderView, DtacTouchView dtacTouchView) {
        this.f83515a = coordinatorLayout;
        this.bottom = relativeLayout;
        this.cameraview = cameraView;
        this.container = coordinatorLayout2;
        this.containerPercent = percentRelativeLayout;
        this.imageView31 = imageView;
        this.incCamButton = zIncludeCameraButtonBinding;
        this.messageInfo = constraintLayout;
        this.top = view;
        this.tvFaceCameraTitle = dtacFontTextView;
        this.tvMessageInfo = dtacFontTextView2;
        this.viewFinderView = viewFinderView;
        this.viewFocus = dtacTouchView;
    }

    @NonNull
    public static ActivityFaceCameraBinding bind(@NonNull View view) {
        View findChildViewById;
        View findChildViewById2;
        int i = R.id.bottom;
        RelativeLayout relativeLayout = (RelativeLayout) ViewBindings.findChildViewById(view, i);
        if (relativeLayout != null) {
            i = R.id.cameraview;
            CameraView cameraView = (CameraView) ViewBindings.findChildViewById(view, i);
            if (cameraView != null) {
                CoordinatorLayout coordinatorLayout = (CoordinatorLayout) view;
                i = R.id.containerPercent;
                PercentRelativeLayout percentRelativeLayout = (PercentRelativeLayout) ViewBindings.findChildViewById(view, i);
                if (percentRelativeLayout != null) {
                    i = R.id.imageView31;
                    ImageView imageView = (ImageView) ViewBindings.findChildViewById(view, i);
                    if (imageView != null && (findChildViewById = ViewBindings.findChildViewById(view, (i = R.id.incCamButton))) != null) {
                        ZIncludeCameraButtonBinding bind = ZIncludeCameraButtonBinding.bind(findChildViewById);
                        i = R.id.messageInfo;
                        ConstraintLayout constraintLayout = (ConstraintLayout) ViewBindings.findChildViewById(view, i);
                        if (constraintLayout != null && (findChildViewById2 = ViewBindings.findChildViewById(view, (i = R.id.top))) != null) {
                            i = R.id.tvFaceCameraTitle;
                            DtacFontTextView dtacFontTextView = (DtacFontTextView) ViewBindings.findChildViewById(view, i);
                            if (dtacFontTextView != null) {
                                i = R.id.tvMessageInfo;
                                DtacFontTextView dtacFontTextView2 = (DtacFontTextView) ViewBindings.findChildViewById(view, i);
                                if (dtacFontTextView2 != null) {
                                    i = R.id.viewFinderView;
                                    ViewFinderView viewFinderView = (ViewFinderView) ViewBindings.findChildViewById(view, i);
                                    if (viewFinderView != null) {
                                        i = R.id.viewFocus;
                                        DtacTouchView dtacTouchView = (DtacTouchView) ViewBindings.findChildViewById(view, i);
                                        if (dtacTouchView != null) {
                                            return new ActivityFaceCameraBinding(coordinatorLayout, relativeLayout, cameraView, coordinatorLayout, percentRelativeLayout, imageView, bind, constraintLayout, findChildViewById2, dtacFontTextView, dtacFontTextView2, viewFinderView, dtacTouchView);
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
    public static ActivityFaceCameraBinding inflate(@NonNull LayoutInflater layoutInflater) {
        return inflate(layoutInflater, null, false);
    }

    @NonNull
    public static ActivityFaceCameraBinding inflate(@NonNull LayoutInflater layoutInflater, @Nullable ViewGroup viewGroup, boolean z) {
        View inflate = layoutInflater.inflate(R.layout.activity_face_camera, viewGroup, false);
        if (z) {
            viewGroup.addView(inflate);
        }
        return bind(inflate);
    }

    @Override // androidx.viewbinding.ViewBinding
    @NonNull
    public CoordinatorLayout getRoot() {
        return this.f83515a;
    }
}

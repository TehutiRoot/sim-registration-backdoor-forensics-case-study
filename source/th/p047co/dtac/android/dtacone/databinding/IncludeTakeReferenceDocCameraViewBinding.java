package th.p047co.dtac.android.dtacone.databinding;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.RelativeLayout;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.coordinatorlayout.widget.CoordinatorLayout;
import androidx.viewbinding.ViewBinding;
import androidx.viewbinding.ViewBindings;
import com.google.android.cameraview.CameraView;
import th.p047co.dtac.android.dtacone.R;
import th.p047co.dtac.android.dtacone.widget.view.DtacTouchView;
import th.p047co.dtac.android.dtacone.widget.view.ViewFinderView;

/* renamed from: th.co.dtac.android.dtacone.databinding.IncludeTakeReferenceDocCameraViewBinding */
/* loaded from: classes7.dex */
public final class IncludeTakeReferenceDocCameraViewBinding implements ViewBinding {

    /* renamed from: a */
    public final CoordinatorLayout f84296a;
    @NonNull
    public final RelativeLayout bottom;
    @NonNull
    public final CameraView cameraview;
    @NonNull
    public final OneIncludeCameraButtonBinding incCameraButton;
    @NonNull
    public final ViewFinderView viewFinderView;
    @NonNull
    public final DtacTouchView viewFocus;

    public IncludeTakeReferenceDocCameraViewBinding(CoordinatorLayout coordinatorLayout, RelativeLayout relativeLayout, CameraView cameraView, OneIncludeCameraButtonBinding oneIncludeCameraButtonBinding, ViewFinderView viewFinderView, DtacTouchView dtacTouchView) {
        this.f84296a = coordinatorLayout;
        this.bottom = relativeLayout;
        this.cameraview = cameraView;
        this.incCameraButton = oneIncludeCameraButtonBinding;
        this.viewFinderView = viewFinderView;
        this.viewFocus = dtacTouchView;
    }

    @NonNull
    public static IncludeTakeReferenceDocCameraViewBinding bind(@NonNull View view) {
        View findChildViewById;
        int i = R.id.bottom;
        RelativeLayout relativeLayout = (RelativeLayout) ViewBindings.findChildViewById(view, i);
        if (relativeLayout != null) {
            i = R.id.cameraview;
            CameraView cameraView = (CameraView) ViewBindings.findChildViewById(view, i);
            if (cameraView != null && (findChildViewById = ViewBindings.findChildViewById(view, (i = R.id.incCameraButton))) != null) {
                OneIncludeCameraButtonBinding bind = OneIncludeCameraButtonBinding.bind(findChildViewById);
                i = R.id.viewFinderView;
                ViewFinderView viewFinderView = (ViewFinderView) ViewBindings.findChildViewById(view, i);
                if (viewFinderView != null) {
                    i = R.id.viewFocus;
                    DtacTouchView dtacTouchView = (DtacTouchView) ViewBindings.findChildViewById(view, i);
                    if (dtacTouchView != null) {
                        return new IncludeTakeReferenceDocCameraViewBinding((CoordinatorLayout) view, relativeLayout, cameraView, bind, viewFinderView, dtacTouchView);
                    }
                }
            }
        }
        throw new NullPointerException("Missing required view with ID: ".concat(view.getResources().getResourceName(i)));
    }

    @NonNull
    public static IncludeTakeReferenceDocCameraViewBinding inflate(@NonNull LayoutInflater layoutInflater) {
        return inflate(layoutInflater, null, false);
    }

    @NonNull
    public static IncludeTakeReferenceDocCameraViewBinding inflate(@NonNull LayoutInflater layoutInflater, @Nullable ViewGroup viewGroup, boolean z) {
        View inflate = layoutInflater.inflate(R.layout.include_take_reference_doc_camera_view, viewGroup, false);
        if (z) {
            viewGroup.addView(inflate);
        }
        return bind(inflate);
    }

    @Override // androidx.viewbinding.ViewBinding
    @NonNull
    public CoordinatorLayout getRoot() {
        return this.f84296a;
    }
}

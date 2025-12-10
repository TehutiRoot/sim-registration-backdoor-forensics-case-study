package th.p047co.dtac.android.dtacone.databinding;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.RelativeLayout;
import androidx.annotation.NonNull;
import androidx.viewbinding.ViewBinding;
import androidx.viewbinding.ViewBindings;
import com.google.android.cameraview.CameraView;
import th.p047co.dtac.android.dtacone.R;
import th.p047co.dtac.android.dtacone.widget.view.DtacTouchView;
import th.p047co.dtac.android.dtacone.widget.view.ViewFinderView;

/* renamed from: th.co.dtac.android.dtacone.databinding.IncludeOneTakeReferenceDocCameraViewBinding */
/* loaded from: classes7.dex */
public final class IncludeOneTakeReferenceDocCameraViewBinding implements ViewBinding {

    /* renamed from: a */
    public final View f84387a;
    @NonNull
    public final RelativeLayout bottom;
    @NonNull
    public final CameraView cameraview;
    @NonNull
    public final ViewFinderView viewFinderView;
    @NonNull
    public final DtacTouchView viewFocus;

    public IncludeOneTakeReferenceDocCameraViewBinding(View view, RelativeLayout relativeLayout, CameraView cameraView, ViewFinderView viewFinderView, DtacTouchView dtacTouchView) {
        this.f84387a = view;
        this.bottom = relativeLayout;
        this.cameraview = cameraView;
        this.viewFinderView = viewFinderView;
        this.viewFocus = dtacTouchView;
    }

    @NonNull
    public static IncludeOneTakeReferenceDocCameraViewBinding bind(@NonNull View view) {
        int i = R.id.bottom;
        RelativeLayout relativeLayout = (RelativeLayout) ViewBindings.findChildViewById(view, i);
        if (relativeLayout != null) {
            i = R.id.cameraview;
            CameraView cameraView = (CameraView) ViewBindings.findChildViewById(view, i);
            if (cameraView != null) {
                i = R.id.viewFinderView;
                ViewFinderView viewFinderView = (ViewFinderView) ViewBindings.findChildViewById(view, i);
                if (viewFinderView != null) {
                    i = R.id.viewFocus;
                    DtacTouchView dtacTouchView = (DtacTouchView) ViewBindings.findChildViewById(view, i);
                    if (dtacTouchView != null) {
                        return new IncludeOneTakeReferenceDocCameraViewBinding(view, relativeLayout, cameraView, viewFinderView, dtacTouchView);
                    }
                }
            }
        }
        throw new NullPointerException("Missing required view with ID: ".concat(view.getResources().getResourceName(i)));
    }

    @NonNull
    public static IncludeOneTakeReferenceDocCameraViewBinding inflate(@NonNull LayoutInflater layoutInflater, @NonNull ViewGroup viewGroup) {
        if (viewGroup != null) {
            layoutInflater.inflate(R.layout.include_one_take_reference_doc_camera_view, viewGroup);
            return bind(viewGroup);
        }
        throw new NullPointerException("parent");
    }

    @Override // androidx.viewbinding.ViewBinding
    @NonNull
    public View getRoot() {
        return this.f84387a;
    }
}
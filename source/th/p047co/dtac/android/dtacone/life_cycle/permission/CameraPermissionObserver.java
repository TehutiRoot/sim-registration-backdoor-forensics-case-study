package th.p047co.dtac.android.dtacone.life_cycle.permission;

import android.app.Activity;
import androidx.compose.runtime.internal.StabilityInferred;
import androidx.lifecycle.Lifecycle;
import androidx.lifecycle.LifecycleObserver;
import androidx.lifecycle.OnLifecycleEvent;
import com.tom_roush.pdfbox.contentstream.operator.OperatorName;
import com.tom_roush.pdfbox.pdmodel.common.PDPageLabelRange;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import th.p047co.dtac.android.dtacone.R;
import th.p047co.dtac.android.dtacone.life_cycle.camera.CameraLifecycle;
import th.p047co.dtac.android.dtacone.manager.PermissionManager;
import th.p047co.dtac.android.dtacone.presenter.runtime_permission.CameraPermissionPresenter;
import th.p047co.dtac.android.dtacone.widget.view.DtacToast;

@StabilityInferred(parameters = 0)
@Metadata(m28851d1 = {"\u0000(\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u0002\n\u0002\b\u000e\b\u0007\u0018\u00002\u00020\u00012\u00020\u0002B!\u0012\u0006\u0010\u0004\u001a\u00020\u0003\u0012\u0006\u0010\u0006\u001a\u00020\u0005\u0012\b\u0010\b\u001a\u0004\u0018\u00010\u0007¢\u0006\u0004\b\t\u0010\nJ\u000f\u0010\f\u001a\u00020\u000bH\u0016¢\u0006\u0004\b\f\u0010\rJ\u000f\u0010\u000e\u001a\u00020\u000bH\u0016¢\u0006\u0004\b\u000e\u0010\rJ\u000f\u0010\u000f\u001a\u00020\u000bH\u0007¢\u0006\u0004\b\u000f\u0010\rJ\u000f\u0010\u0010\u001a\u00020\u000bH\u0007¢\u0006\u0004\b\u0010\u0010\rJ\u000f\u0010\u0011\u001a\u00020\u000bH\u0007¢\u0006\u0004\b\u0011\u0010\rJ\u000f\u0010\u0012\u001a\u00020\u000bH\u0007¢\u0006\u0004\b\u0012\u0010\rR\u0014\u0010\u0004\u001a\u00020\u00038\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0013\u0010\u0014R\u0014\u0010\u0006\u001a\u00020\u00058\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0015\u0010\u0016R\u0016\u0010\b\u001a\u0004\u0018\u00010\u00078\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0017\u0010\u0018¨\u0006\u0019"}, m28850d2 = {"Lth/co/dtac/android/dtacone/life_cycle/permission/CameraPermissionObserver;", "Landroidx/lifecycle/LifecycleObserver;", "Lth/co/dtac/android/dtacone/presenter/runtime_permission/CameraPermissionPresenter$View;", "Lth/co/dtac/android/dtacone/presenter/runtime_permission/CameraPermissionPresenter;", "cameraPermissionPresenter", "Lth/co/dtac/android/dtacone/life_cycle/camera/CameraLifecycle;", "cameraLifecycle", "Landroid/app/Activity;", "activity", "<init>", "(Lth/co/dtac/android/dtacone/presenter/runtime_permission/CameraPermissionPresenter;Lth/co/dtac/android/dtacone/life_cycle/camera/CameraLifecycle;Landroid/app/Activity;)V", "", "onPermissionCameraGranted", "()V", "onPermissionCameraDenied", "onAttachView", "onStartCamera", "onStopCamera", "onCleanPresenter", PDPageLabelRange.STYLE_LETTERS_LOWER, "Lth/co/dtac/android/dtacone/presenter/runtime_permission/CameraPermissionPresenter;", OperatorName.CLOSE_FILL_NON_ZERO_AND_STROKE, "Lth/co/dtac/android/dtacone/life_cycle/camera/CameraLifecycle;", OperatorName.CURVE_TO, "Landroid/app/Activity;", "app_prodRelease"}, m28849k = 1, m28848mv = {1, 8, 0})
/* renamed from: th.co.dtac.android.dtacone.life_cycle.permission.CameraPermissionObserver */
/* loaded from: classes7.dex */
public final class CameraPermissionObserver implements LifecycleObserver, CameraPermissionPresenter.View {
    public static final int $stable = 8;

    /* renamed from: a */
    public final CameraPermissionPresenter f84775a;

    /* renamed from: b */
    public final CameraLifecycle f84776b;

    /* renamed from: c */
    public final Activity f84777c;

    public CameraPermissionObserver(@NotNull CameraPermissionPresenter cameraPermissionPresenter, @NotNull CameraLifecycle cameraLifecycle, @Nullable Activity activity) {
        Intrinsics.checkNotNullParameter(cameraPermissionPresenter, "cameraPermissionPresenter");
        Intrinsics.checkNotNullParameter(cameraLifecycle, "cameraLifecycle");
        this.f84775a = cameraPermissionPresenter;
        this.f84776b = cameraLifecycle;
        this.f84777c = activity;
    }

    @OnLifecycleEvent(Lifecycle.Event.ON_CREATE)
    public final void onAttachView() {
        this.f84775a.attachView(this);
        if (PermissionManager.hasNotCameraPermission()) {
            this.f84775a.askForCameraPermission();
        }
    }

    @OnLifecycleEvent(Lifecycle.Event.ON_DESTROY)
    public final void onCleanPresenter() {
        this.f84775a.onDestroy();
    }

    @Override // th.p047co.dtac.android.dtacone.presenter.runtime_permission.CameraPermissionPresenter.View
    public void onPermissionCameraDenied() {
        if (this.f84777c != null) {
            DtacToast dtacToast = new DtacToast();
            Activity activity = this.f84777c;
            dtacToast.createToast(activity, activity.getString(R.string.dtac_request_camera_permission)).show();
        }
    }

    @Override // th.p047co.dtac.android.dtacone.presenter.runtime_permission.CameraPermissionPresenter.View
    public void onPermissionCameraGranted() {
    }

    @OnLifecycleEvent(Lifecycle.Event.ON_RESUME)
    public final void onStartCamera() {
        if (!PermissionManager.hasNotCameraPermission()) {
            this.f84776b.onStartCamera();
        }
    }

    @OnLifecycleEvent(Lifecycle.Event.ON_PAUSE)
    public final void onStopCamera() {
        if (!PermissionManager.hasNotCameraPermission()) {
            this.f84776b.onStopCamera();
        }
    }
}

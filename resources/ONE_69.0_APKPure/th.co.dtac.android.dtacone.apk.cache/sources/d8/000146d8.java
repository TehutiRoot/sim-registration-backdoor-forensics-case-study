package th.p047co.dtac.android.dtacone.view.callback;

import androidx.compose.runtime.internal.StabilityInferred;
import com.google.android.cameraview.CameraView;
import com.tom_roush.pdfbox.pdmodel.common.PDPageLabelRange;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

@StabilityInferred(parameters = 0)
@Metadata(m29143d1 = {"\u0000\u0018\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0006\b\u0007\u0018\u00002\u00020\u0001B\u000f\u0012\u0006\u0010\u0003\u001a\u00020\u0002¢\u0006\u0004\b\u0004\u0010\u0005R\u0017\u0010\u000b\u001a\u00020\u00068\u0006¢\u0006\f\n\u0004\b\u0007\u0010\b\u001a\u0004\b\t\u0010\n¨\u0006\f"}, m29142d2 = {"Lth/co/dtac/android/dtacone/view/callback/CameraCallback;", "", "Lth/co/dtac/android/dtacone/view/callback/ICamera;", "camera", "<init>", "(Lth/co/dtac/android/dtacone/view/callback/ICamera;)V", "Lcom/google/android/cameraview/CameraView$Callback;", PDPageLabelRange.STYLE_LETTERS_LOWER, "Lcom/google/android/cameraview/CameraView$Callback;", "getCameraCallback", "()Lcom/google/android/cameraview/CameraView$Callback;", "cameraCallback", "app_prodRelease"}, m29141k = 1, m29140mv = {1, 8, 0})
/* renamed from: th.co.dtac.android.dtacone.view.callback.CameraCallback */
/* loaded from: classes10.dex */
public final class CameraCallback {
    public static final int $stable = 8;

    /* renamed from: a */
    public final CameraView.Callback f98590a;

    public CameraCallback(@NotNull final ICamera camera) {
        Intrinsics.checkNotNullParameter(camera, "camera");
        this.f98590a = new CameraView.Callback() { // from class: th.co.dtac.android.dtacone.view.callback.CameraCallback$cameraCallback$1
            @Override // com.google.android.cameraview.CameraView.Callback
            public void onCameraClosed(@NotNull CameraView cameraView) {
                Intrinsics.checkNotNullParameter(cameraView, "cameraView");
            }

            @Override // com.google.android.cameraview.CameraView.Callback
            public void onCameraOpened(@NotNull CameraView cameraView) {
                Intrinsics.checkNotNullParameter(cameraView, "cameraView");
            }

            @Override // com.google.android.cameraview.CameraView.Callback
            public void onPictureTaken(@NotNull CameraView cameraView, @Nullable byte[] bArr) {
                Intrinsics.checkNotNullParameter(cameraView, "cameraView");
                if (bArr != null) {
                    ICamera.this.onCameraTaken(bArr);
                }
            }
        };
    }

    @NotNull
    public final CameraView.Callback getCameraCallback() {
        return this.f98590a;
    }
}
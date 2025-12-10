package th.p047co.dtac.android.dtacone.view.fragment.take_photo.camera;

import androidx.compose.runtime.internal.StabilityInferred;
import com.google.firebase.remoteconfig.RemoteConfigConstants;
import com.tom_roush.pdfbox.pdmodel.common.PDPageLabelRange;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

@StabilityInferred(parameters = 0)
@Metadata(m29143d1 = {"\u0000(\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0003\n\u0002\u0010\u000b\n\u0002\b\u0007\b\u0087\b\u0018\u00002\u00020\u0001B\u000f\u0012\u0006\u0010\u0003\u001a\u00020\u0002¢\u0006\u0004\b\u0004\u0010\u0005J\u0010\u0010\u0006\u001a\u00020\u0002HÆ\u0003¢\u0006\u0004\b\u0006\u0010\u0007J\u001a\u0010\b\u001a\u00020\u00002\b\b\u0002\u0010\u0003\u001a\u00020\u0002HÆ\u0001¢\u0006\u0004\b\b\u0010\tJ\u0010\u0010\u000b\u001a\u00020\nHÖ\u0001¢\u0006\u0004\b\u000b\u0010\fJ\u0010\u0010\u000e\u001a\u00020\rHÖ\u0001¢\u0006\u0004\b\u000e\u0010\u000fJ\u001a\u0010\u0012\u001a\u00020\u00112\b\u0010\u0010\u001a\u0004\u0018\u00010\u0001HÖ\u0003¢\u0006\u0004\b\u0012\u0010\u0013R\"\u0010\u0003\u001a\u00020\u00028\u0006@\u0006X\u0086\u000e¢\u0006\u0012\n\u0004\b\u0014\u0010\u0015\u001a\u0004\b\u0016\u0010\u0007\"\u0004\b\u0017\u0010\u0005¨\u0006\u0018"}, m29142d2 = {"Lth/co/dtac/android/dtacone/view/fragment/take_photo/camera/FaceRecognitionPhotoState;", "", "Lth/co/dtac/android/dtacone/view/fragment/take_photo/camera/CameraState;", RemoteConfigConstants.ResponseFieldKey.STATE, "<init>", "(Lth/co/dtac/android/dtacone/view/fragment/take_photo/camera/CameraState;)V", "component1", "()Lth/co/dtac/android/dtacone/view/fragment/take_photo/camera/CameraState;", "copy", "(Lth/co/dtac/android/dtacone/view/fragment/take_photo/camera/CameraState;)Lth/co/dtac/android/dtacone/view/fragment/take_photo/camera/FaceRecognitionPhotoState;", "", "toString", "()Ljava/lang/String;", "", "hashCode", "()I", "other", "", "equals", "(Ljava/lang/Object;)Z", PDPageLabelRange.STYLE_LETTERS_LOWER, "Lth/co/dtac/android/dtacone/view/fragment/take_photo/camera/CameraState;", "getState", "setState", "app_prodRelease"}, m29141k = 1, m29140mv = {1, 8, 0})
/* renamed from: th.co.dtac.android.dtacone.view.fragment.take_photo.camera.FaceRecognitionPhotoState */
/* loaded from: classes9.dex */
public final class FaceRecognitionPhotoState {
    public static final int $stable = 8;

    /* renamed from: a */
    public CameraState f104938a;

    public FaceRecognitionPhotoState(@NotNull CameraState state) {
        Intrinsics.checkNotNullParameter(state, "state");
        this.f104938a = state;
    }

    public static /* synthetic */ FaceRecognitionPhotoState copy$default(FaceRecognitionPhotoState faceRecognitionPhotoState, CameraState cameraState, int i, Object obj) {
        if ((i & 1) != 0) {
            cameraState = faceRecognitionPhotoState.f104938a;
        }
        return faceRecognitionPhotoState.copy(cameraState);
    }

    @NotNull
    public final CameraState component1() {
        return this.f104938a;
    }

    @NotNull
    public final FaceRecognitionPhotoState copy(@NotNull CameraState state) {
        Intrinsics.checkNotNullParameter(state, "state");
        return new FaceRecognitionPhotoState(state);
    }

    public boolean equals(@Nullable Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof FaceRecognitionPhotoState) && this.f104938a == ((FaceRecognitionPhotoState) obj).f104938a;
    }

    @NotNull
    public final CameraState getState() {
        return this.f104938a;
    }

    public int hashCode() {
        return this.f104938a.hashCode();
    }

    public final void setState(@NotNull CameraState cameraState) {
        Intrinsics.checkNotNullParameter(cameraState, "<set-?>");
        this.f104938a = cameraState;
    }

    @NotNull
    public String toString() {
        CameraState cameraState = this.f104938a;
        return "FaceRecognitionPhotoState(state=" + cameraState + ")";
    }
}
package th.p047co.dtac.android.dtacone.model.bitmap;

import android.graphics.Bitmap;
import androidx.compose.runtime.internal.StabilityInferred;
import com.google.firebase.remoteconfig.RemoteConfigConstants;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import th.p047co.dtac.android.dtacone.viewmodel.face_recognition.detection.FaceDetectionViewModel;

@StabilityInferred(parameters = 0)
@Metadata(m28851d1 = {"\u0000\u0018\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0006\b\u0007\u0018\u00002\u00020\u0001B\u0015\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0005¢\u0006\u0002\u0010\u0006R\u0011\u0010\u0004\u001a\u00020\u0005¢\u0006\b\n\u0000\u001a\u0004\b\u0007\u0010\bR\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\t\u0010\n¨\u0006\u000b"}, m28850d2 = {"Lth/co/dtac/android/dtacone/model/bitmap/FaceDetectedBitmap;", "", RemoteConfigConstants.ResponseFieldKey.STATE, "Lth/co/dtac/android/dtacone/viewmodel/face_recognition/detection/FaceDetectionViewModel$STATE_DETECT;", "bitmap", "Landroid/graphics/Bitmap;", "(Lth/co/dtac/android/dtacone/viewmodel/face_recognition/detection/FaceDetectionViewModel$STATE_DETECT;Landroid/graphics/Bitmap;)V", "getBitmap", "()Landroid/graphics/Bitmap;", "getState", "()Lth/co/dtac/android/dtacone/viewmodel/face_recognition/detection/FaceDetectionViewModel$STATE_DETECT;", "app_prodRelease"}, m28849k = 1, m28848mv = {1, 8, 0}, m28846xi = 48)
/* renamed from: th.co.dtac.android.dtacone.model.bitmap.FaceDetectedBitmap */
/* loaded from: classes8.dex */
public final class FaceDetectedBitmap {
    public static final int $stable = 8;
    @NotNull
    private final Bitmap bitmap;
    @NotNull
    private final FaceDetectionViewModel.STATE_DETECT state;

    public FaceDetectedBitmap(@NotNull FaceDetectionViewModel.STATE_DETECT state, @NotNull Bitmap bitmap) {
        Intrinsics.checkNotNullParameter(state, "state");
        Intrinsics.checkNotNullParameter(bitmap, "bitmap");
        this.state = state;
        this.bitmap = bitmap;
    }

    @NotNull
    public final Bitmap getBitmap() {
        return this.bitmap;
    }

    @NotNull
    public final FaceDetectionViewModel.STATE_DETECT getState() {
        return this.state;
    }
}

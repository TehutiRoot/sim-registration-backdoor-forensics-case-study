package androidx.camera.core.processing;

import android.graphics.Bitmap;
import android.graphics.Matrix;
import android.graphics.Rect;
import android.util.Size;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.annotation.RequiresApi;
import androidx.camera.core.ImageProxy;
import androidx.camera.core.impl.CameraCaptureResult;
import androidx.camera.core.impl.utils.Exif;
import androidx.camera.core.impl.utils.TransformUtils;
import androidx.core.util.Preconditions;
import com.google.auto.value.AutoValue;

@AutoValue
@RequiresApi(api = 21)
/* loaded from: classes.dex */
public abstract class Packet<T> {
    @NonNull
    /* renamed from: of */
    public static Packet<Bitmap> m62705of(@NonNull Bitmap bitmap, @NonNull Exif exif, @NonNull Rect rect, int i, @NonNull Matrix matrix, @NonNull CameraCaptureResult cameraCaptureResult) {
        return new C0719K8(bitmap, exif, 42, new Size(bitmap.getWidth(), bitmap.getHeight()), rect, i, matrix, cameraCaptureResult);
    }

    @NonNull
    public abstract CameraCaptureResult getCameraCaptureResult();

    @NonNull
    public abstract Rect getCropRect();

    @NonNull
    public abstract T getData();

    @Nullable
    public abstract Exif getExif();

    public abstract int getFormat();

    public abstract int getRotationDegrees();

    @NonNull
    public abstract Matrix getSensorToBufferTransform();

    @NonNull
    public abstract Size getSize();

    public boolean hasCropping() {
        return TransformUtils.hasCropping(getCropRect(), getSize());
    }

    @NonNull
    /* renamed from: of */
    public static Packet<ImageProxy> m62704of(@NonNull ImageProxy imageProxy, @Nullable Exif exif, @NonNull Rect rect, int i, @NonNull Matrix matrix, @NonNull CameraCaptureResult cameraCaptureResult) {
        return m62703of(imageProxy, exif, new Size(imageProxy.getWidth(), imageProxy.getHeight()), rect, i, matrix, cameraCaptureResult);
    }

    @NonNull
    /* renamed from: of */
    public static Packet<ImageProxy> m62703of(@NonNull ImageProxy imageProxy, @Nullable Exif exif, @NonNull Size size, @NonNull Rect rect, int i, @NonNull Matrix matrix, @NonNull CameraCaptureResult cameraCaptureResult) {
        if (imageProxy.getFormat() == 256) {
            Preconditions.checkNotNull(exif, "JPEG image must have Exif.");
        }
        return new C0719K8(imageProxy, exif, imageProxy.getFormat(), size, rect, i, matrix, cameraCaptureResult);
    }

    @NonNull
    /* renamed from: of */
    public static Packet<byte[]> m62702of(@NonNull byte[] bArr, @NonNull Exif exif, int i, @NonNull Size size, @NonNull Rect rect, int i2, @NonNull Matrix matrix, @NonNull CameraCaptureResult cameraCaptureResult) {
        return new C0719K8(bArr, exif, i, size, rect, i2, matrix, cameraCaptureResult);
    }
}

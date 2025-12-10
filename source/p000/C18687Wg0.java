package p000;

import android.graphics.Bitmap;
import android.graphics.BitmapFactory;
import android.graphics.BitmapRegionDecoder;
import android.graphics.Rect;
import androidx.camera.core.ImageCaptureException;
import androidx.camera.core.impl.utils.Exif;
import androidx.camera.core.impl.utils.TransformUtils;
import androidx.camera.core.processing.Operation;
import androidx.camera.core.processing.Packet;
import java.io.IOException;
import java.util.Objects;

/* renamed from: Wg0  reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C18687Wg0 implements Operation {
    @Override // androidx.camera.core.processing.Operation
    /* renamed from: a */
    public Packet apply(Packet packet) {
        Rect cropRect = packet.getCropRect();
        Bitmap m65582b = m65582b((byte[]) packet.getData(), cropRect);
        Exif exif = packet.getExif();
        Objects.requireNonNull(exif);
        return Packet.m62705of(m65582b, exif, new Rect(0, 0, m65582b.getWidth(), m65582b.getHeight()), packet.getRotationDegrees(), TransformUtils.updateSensorToBufferTransform(packet.getSensorToBufferTransform(), cropRect), packet.getCameraCaptureResult());
    }

    /* renamed from: b */
    public final Bitmap m65582b(byte[] bArr, Rect rect) {
        try {
            return BitmapRegionDecoder.newInstance(bArr, 0, bArr.length, false).decodeRegion(rect, new BitmapFactory.Options());
        } catch (IOException e) {
            throw new ImageCaptureException(1, "Failed to decode JPEG.", e);
        }
    }
}

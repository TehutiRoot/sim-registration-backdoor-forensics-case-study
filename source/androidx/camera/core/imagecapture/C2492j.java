package androidx.camera.core.imagecapture;

import android.graphics.Rect;
import android.util.Size;
import androidx.camera.core.ImageCaptureException;
import androidx.camera.core.ImageProxy;
import androidx.camera.core.impl.Quirks;
import androidx.camera.core.impl.utils.Exif;
import androidx.camera.core.impl.utils.TransformUtils;
import androidx.camera.core.internal.compat.workaround.JpegMetadataCorrector;
import androidx.camera.core.internal.utils.ImageUtil;
import androidx.camera.core.processing.Operation;
import androidx.camera.core.processing.Packet;
import java.io.ByteArrayInputStream;
import java.io.IOException;
import java.util.Objects;

/* renamed from: androidx.camera.core.imagecapture.j */
/* loaded from: classes.dex */
public final class C2492j implements Operation {

    /* renamed from: a */
    public final JpegMetadataCorrector f11076a;

    /* renamed from: androidx.camera.core.imagecapture.j$a */
    /* loaded from: classes.dex */
    public static abstract class AbstractC2493a {
        /* renamed from: c */
        public static AbstractC2493a m63021c(Packet packet, int i) {
            return new C2481d(packet, i);
        }

        /* renamed from: a */
        public abstract int mo63023a();

        /* renamed from: b */
        public abstract Packet mo63022b();
    }

    public C2492j(Quirks quirks) {
        this.f11076a = new JpegMetadataCorrector(quirks);
    }

    /* renamed from: b */
    public static Exif m63026b(byte[] bArr) {
        try {
            return Exif.createFromInputStream(new ByteArrayInputStream(bArr));
        } catch (IOException e) {
            throw new ImageCaptureException(0, "Failed to extract Exif from YUV-generated JPEG", e);
        }
    }

    @Override // androidx.camera.core.processing.Operation
    /* renamed from: a */
    public Packet apply(AbstractC2493a abstractC2493a) {
        Packet m63024d;
        try {
            int format = abstractC2493a.mo63022b().getFormat();
            if (format != 35) {
                if (format == 256) {
                    m63024d = m63025c(abstractC2493a);
                } else {
                    throw new IllegalArgumentException("Unexpected format: " + format);
                }
            } else {
                m63024d = m63024d(abstractC2493a);
            }
            return m63024d;
        } finally {
            ((ImageProxy) abstractC2493a.mo63022b().getData()).close();
        }
    }

    /* renamed from: c */
    public final Packet m63025c(AbstractC2493a abstractC2493a) {
        Packet mo63022b = abstractC2493a.mo63022b();
        byte[] jpegImageToJpegByteArray = this.f11076a.jpegImageToJpegByteArray((ImageProxy) mo63022b.getData());
        Exif exif = mo63022b.getExif();
        Objects.requireNonNull(exif);
        return Packet.m62702of(jpegImageToJpegByteArray, exif, 256, mo63022b.getSize(), mo63022b.getCropRect(), mo63022b.getRotationDegrees(), mo63022b.getSensorToBufferTransform(), mo63022b.getCameraCaptureResult());
    }

    /* renamed from: d */
    public final Packet m63024d(AbstractC2493a abstractC2493a) {
        Packet mo63022b = abstractC2493a.mo63022b();
        ImageProxy imageProxy = (ImageProxy) mo63022b.getData();
        Rect cropRect = mo63022b.getCropRect();
        try {
            byte[] yuvImageToJpegByteArray = ImageUtil.yuvImageToJpegByteArray(imageProxy, cropRect, abstractC2493a.mo63023a(), mo63022b.getRotationDegrees());
            return Packet.m62702of(yuvImageToJpegByteArray, m63026b(yuvImageToJpegByteArray), 256, new Size(cropRect.width(), cropRect.height()), new Rect(0, 0, cropRect.width(), cropRect.height()), mo63022b.getRotationDegrees(), TransformUtils.updateSensorToBufferTransform(mo63022b.getSensorToBufferTransform(), cropRect), mo63022b.getCameraCaptureResult());
        } catch (ImageUtil.CodecFailedException e) {
            throw new ImageCaptureException(1, "Failed to encode the image to JPEG.", e);
        }
    }
}

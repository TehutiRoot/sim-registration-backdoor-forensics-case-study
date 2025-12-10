package androidx.camera.core.imagecapture;

import android.graphics.Matrix;
import android.graphics.Rect;
import android.graphics.RectF;
import android.util.Size;
import androidx.camera.core.ImageCaptureException;
import androidx.camera.core.ImageProxy;
import androidx.camera.core.imagecapture.ProcessingNode;
import androidx.camera.core.impl.CameraCaptureResult;
import androidx.camera.core.impl.utils.Exif;
import androidx.camera.core.impl.utils.TransformUtils;
import androidx.camera.core.internal.CameraCaptureResultImageInfo;
import androidx.camera.core.processing.Operation;
import androidx.camera.core.processing.Packet;
import androidx.core.util.Preconditions;
import java.io.IOException;

/* renamed from: androidx.camera.core.imagecapture.l */
/* loaded from: classes.dex */
public final class C2496l implements Operation {
    /* renamed from: b */
    public static Packet m63001b(C21132mo1 c21132mo1, Exif exif, ImageProxy imageProxy) {
        return Packet.m62704of(imageProxy, exif, c21132mo1.m26203b(), c21132mo1.m26200e(), c21132mo1.m26199f(), m62999d(imageProxy));
    }

    /* renamed from: c */
    public static Packet m63000c(C21132mo1 c21132mo1, Exif exif, ImageProxy imageProxy) {
        Size size = new Size(imageProxy.getWidth(), imageProxy.getHeight());
        int m26200e = c21132mo1.m26200e() - exif.getRotation();
        Size m62998e = m62998e(m26200e, size);
        Matrix rectToRect = TransformUtils.getRectToRect(new RectF(0.0f, 0.0f, size.getWidth(), size.getHeight()), new RectF(0.0f, 0.0f, m62998e.getWidth(), m62998e.getHeight()), m26200e);
        return Packet.m62703of(imageProxy, exif, m62998e, m62997f(c21132mo1.m26203b(), rectToRect), exif.getRotation(), m62996g(c21132mo1.m26199f(), rectToRect), m62999d(imageProxy));
    }

    /* renamed from: d */
    public static CameraCaptureResult m62999d(ImageProxy imageProxy) {
        return ((CameraCaptureResultImageInfo) imageProxy.getImageInfo()).getCameraCaptureResult();
    }

    /* renamed from: e */
    public static Size m62998e(int i, Size size) {
        if (TransformUtils.is90or270(TransformUtils.within360(i))) {
            return new Size(size.getHeight(), size.getWidth());
        }
        return size;
    }

    /* renamed from: f */
    public static Rect m62997f(Rect rect, Matrix matrix) {
        RectF rectF = new RectF(rect);
        matrix.mapRect(rectF);
        rectF.sort();
        Rect rect2 = new Rect();
        rectF.round(rect2);
        return rect2;
    }

    /* renamed from: g */
    public static Matrix m62996g(Matrix matrix, Matrix matrix2) {
        Matrix matrix3 = new Matrix(matrix);
        matrix3.postConcat(matrix2);
        return matrix3;
    }

    @Override // androidx.camera.core.processing.Operation
    /* renamed from: a */
    public Packet apply(ProcessingNode.AbstractC2473b abstractC2473b) {
        Exif createFromImageProxy;
        ImageProxy mo63065a = abstractC2473b.mo63065a();
        C21132mo1 mo63064b = abstractC2473b.mo63064b();
        if (mo63065a.getFormat() == 256) {
            try {
                createFromImageProxy = Exif.createFromImageProxy(mo63065a);
                mo63065a.getPlanes()[0].getBuffer().rewind();
            } catch (IOException e) {
                throw new ImageCaptureException(1, "Failed to extract EXIF data.", e);
            }
        } else {
            createFromImageProxy = null;
        }
        if (ImagePipeline.f11001g.shouldUseExifOrientation(mo63065a)) {
            Preconditions.checkNotNull(createFromImageProxy, "JPEG image must have exif.");
            return m63000c(mo63064b, createFromImageProxy, mo63065a);
        }
        return m63001b(mo63064b, createFromImageProxy, mo63065a);
    }
}

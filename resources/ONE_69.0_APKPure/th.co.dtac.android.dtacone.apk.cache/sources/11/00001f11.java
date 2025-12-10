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
public final class C2478l implements Operation {
    /* renamed from: b */
    public static Packet m62949b(C20675jp1 c20675jp1, Exif exif, ImageProxy imageProxy) {
        return Packet.m62652of(imageProxy, exif, c20675jp1.m29340b(), c20675jp1.m29337e(), c20675jp1.m29336f(), m62947d(imageProxy));
    }

    /* renamed from: c */
    public static Packet m62948c(C20675jp1 c20675jp1, Exif exif, ImageProxy imageProxy) {
        Size size = new Size(imageProxy.getWidth(), imageProxy.getHeight());
        int m29337e = c20675jp1.m29337e() - exif.getRotation();
        Size m62946e = m62946e(m29337e, size);
        Matrix rectToRect = TransformUtils.getRectToRect(new RectF(0.0f, 0.0f, size.getWidth(), size.getHeight()), new RectF(0.0f, 0.0f, m62946e.getWidth(), m62946e.getHeight()), m29337e);
        return Packet.m62651of(imageProxy, exif, m62946e, m62945f(c20675jp1.m29340b(), rectToRect), exif.getRotation(), m62944g(c20675jp1.m29336f(), rectToRect), m62947d(imageProxy));
    }

    /* renamed from: d */
    public static CameraCaptureResult m62947d(ImageProxy imageProxy) {
        return ((CameraCaptureResultImageInfo) imageProxy.getImageInfo()).getCameraCaptureResult();
    }

    /* renamed from: e */
    public static Size m62946e(int i, Size size) {
        if (TransformUtils.is90or270(TransformUtils.within360(i))) {
            return new Size(size.getHeight(), size.getWidth());
        }
        return size;
    }

    /* renamed from: f */
    public static Rect m62945f(Rect rect, Matrix matrix) {
        RectF rectF = new RectF(rect);
        matrix.mapRect(rectF);
        rectF.sort();
        Rect rect2 = new Rect();
        rectF.round(rect2);
        return rect2;
    }

    /* renamed from: g */
    public static Matrix m62944g(Matrix matrix, Matrix matrix2) {
        Matrix matrix3 = new Matrix(matrix);
        matrix3.postConcat(matrix2);
        return matrix3;
    }

    @Override // androidx.camera.core.processing.Operation
    /* renamed from: a */
    public Packet apply(ProcessingNode.AbstractC2455b abstractC2455b) {
        Exif createFromImageProxy;
        ImageProxy mo63013a = abstractC2455b.mo63013a();
        C20675jp1 mo63012b = abstractC2455b.mo63012b();
        if (mo63013a.getFormat() == 256) {
            try {
                createFromImageProxy = Exif.createFromImageProxy(mo63013a);
                mo63013a.getPlanes()[0].getBuffer().rewind();
            } catch (IOException e) {
                throw new ImageCaptureException(1, "Failed to extract EXIF data.", e);
            }
        } else {
            createFromImageProxy = null;
        }
        if (ImagePipeline.f11089g.shouldUseExifOrientation(mo63013a)) {
            Preconditions.checkNotNull(createFromImageProxy, "JPEG image must have exif.");
            return m62948c(mo63012b, createFromImageProxy, mo63013a);
        }
        return m62949b(mo63012b, createFromImageProxy, mo63013a);
    }
}
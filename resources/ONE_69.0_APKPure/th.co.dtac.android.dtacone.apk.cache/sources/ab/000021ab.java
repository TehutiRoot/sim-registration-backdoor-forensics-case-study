package androidx.camera.view.transform;

import android.graphics.Matrix;
import android.graphics.RectF;
import androidx.annotation.NonNull;
import androidx.annotation.RequiresApi;
import androidx.camera.core.ImageProxy;
import androidx.camera.core.impl.utils.TransformUtils;
import androidx.camera.view.TransformExperimental;

@RequiresApi(21)
@TransformExperimental
/* loaded from: classes.dex */
public final class ImageProxyTransformFactory {

    /* renamed from: a */
    public boolean f12329a;

    /* renamed from: b */
    public boolean f12330b;

    /* renamed from: b */
    public static RectF m61732b(RectF rectF, int i) {
        if (TransformUtils.is90or270(i)) {
            return new RectF(0.0f, 0.0f, rectF.height(), rectF.width());
        }
        return new RectF(0.0f, 0.0f, rectF.width(), rectF.height());
    }

    /* renamed from: a */
    public final RectF m61733a(ImageProxy imageProxy) {
        if (this.f12329a) {
            return new RectF(imageProxy.getCropRect());
        }
        return new RectF(0.0f, 0.0f, imageProxy.getWidth(), imageProxy.getHeight());
    }

    /* renamed from: c */
    public final int m61731c(ImageProxy imageProxy) {
        if (this.f12330b) {
            return imageProxy.getImageInfo().getRotationDegrees();
        }
        return 0;
    }

    @NonNull
    public OutputTransform getOutputTransform(@NonNull ImageProxy imageProxy) {
        int m61731c = m61731c(imageProxy);
        RectF m61733a = m61733a(imageProxy);
        Matrix rectToRect = TransformUtils.getRectToRect(m61733a, m61732b(m61733a, m61731c), m61731c);
        rectToRect.preConcat(TransformUtils.getNormalizedToBuffer(imageProxy.getCropRect()));
        return new OutputTransform(rectToRect, TransformUtils.rectToSize(imageProxy.getCropRect()));
    }

    public boolean isUsingCropRect() {
        return this.f12329a;
    }

    public boolean isUsingRotationDegrees() {
        return this.f12330b;
    }

    public void setUsingCropRect(boolean z) {
        this.f12329a = z;
    }

    public void setUsingRotationDegrees(boolean z) {
        this.f12330b = z;
    }
}
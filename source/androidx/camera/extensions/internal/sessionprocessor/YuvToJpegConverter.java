package androidx.camera.extensions.internal.sessionprocessor;

import android.view.Surface;
import androidx.camera.core.ImageProcessingUtil;
import androidx.camera.core.ImageProxy;
import androidx.camera.core.Logger;
import androidx.core.util.Preconditions;

/* loaded from: classes.dex */
public class YuvToJpegConverter {

    /* renamed from: a */
    public final Surface f11578a;

    /* renamed from: b */
    public volatile int f11579b;

    /* renamed from: c */
    public volatile int f11580c = 0;

    /* loaded from: classes.dex */
    public static class ConversionFailedException extends Exception {
        public ConversionFailedException(String str) {
            super(str);
        }

        public ConversionFailedException(String str, Throwable th2) {
            super(str, th2);
        }
    }

    public YuvToJpegConverter(int i, Surface surface) {
        this.f11579b = i;
        this.f11578a = surface;
    }

    /* renamed from: a */
    public void m62569a(int i) {
        this.f11579b = i;
    }

    /* renamed from: b */
    public void m62568b(int i) {
        this.f11580c = i;
    }

    /* renamed from: c */
    public void m62567c(ImageProxy imageProxy) {
        boolean z;
        if (imageProxy.getFormat() == 35) {
            z = true;
        } else {
            z = false;
        }
        Preconditions.checkState(z, "Input image is not expected YUV_420_888 image format");
        try {
            try {
                if (ImageProcessingUtil.convertYuvToJpegBytesIntoSurface(imageProxy, this.f11579b, this.f11580c, this.f11578a)) {
                    return;
                }
                throw new ConversionFailedException("Failed to process YUV -> JPEG");
            } catch (Exception e) {
                Logger.m63227e("YuvToJpegConverter", "Failed to process YUV -> JPEG", e);
                throw new ConversionFailedException("Failed to process YUV -> JPEG", e);
            }
        } finally {
            imageProxy.close();
        }
    }
}

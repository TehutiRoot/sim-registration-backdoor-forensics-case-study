package androidx.camera.core;

import android.view.Surface;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.annotation.RequiresApi;
import androidx.annotation.RestrictTo;
import androidx.annotation.VisibleForTesting;
import androidx.camera.core.ForwardingImageProxy;
import androidx.camera.core.ImageProxy;
import androidx.camera.core.SafeCloseImageReaderProxy;
import androidx.camera.core.impl.ImageReaderProxy;
import java.util.concurrent.Executor;

@RequiresApi(21)
@RestrictTo({RestrictTo.Scope.LIBRARY_GROUP})
/* loaded from: classes.dex */
public class SafeCloseImageReaderProxy implements ImageReaderProxy {

    /* renamed from: d */
    public final ImageReaderProxy f10880d;

    /* renamed from: e */
    public final Surface f10881e;

    /* renamed from: f */
    public ForwardingImageProxy.OnImageCloseListener f10882f;

    /* renamed from: a */
    public final Object f10877a = new Object();

    /* renamed from: b */
    public int f10878b = 0;

    /* renamed from: c */
    public boolean f10879c = false;

    /* renamed from: g */
    public final ForwardingImageProxy.OnImageCloseListener f10883g = new ForwardingImageProxy.OnImageCloseListener() { // from class: gD1
        @Override // androidx.camera.core.ForwardingImageProxy.OnImageCloseListener
        public final void onImageClose(ImageProxy imageProxy) {
            SafeCloseImageReaderProxy.m63193b(SafeCloseImageReaderProxy.this, imageProxy);
        }
    };

    public SafeCloseImageReaderProxy(@NonNull ImageReaderProxy imageReaderProxy) {
        this.f10880d = imageReaderProxy;
        this.f10881e = imageReaderProxy.getSurface();
    }

    /* renamed from: a */
    public static /* synthetic */ void m63194a(SafeCloseImageReaderProxy safeCloseImageReaderProxy, ImageReaderProxy.OnImageAvailableListener onImageAvailableListener, ImageReaderProxy imageReaderProxy) {
        safeCloseImageReaderProxy.m63191d(onImageAvailableListener, imageReaderProxy);
    }

    /* renamed from: b */
    public static /* synthetic */ void m63193b(SafeCloseImageReaderProxy safeCloseImageReaderProxy, ImageProxy imageProxy) {
        safeCloseImageReaderProxy.m63192c(imageProxy);
    }

    @Override // androidx.camera.core.impl.ImageReaderProxy
    @Nullable
    public ImageProxy acquireLatestImage() {
        ImageProxy m63190e;
        synchronized (this.f10877a) {
            m63190e = m63190e(this.f10880d.acquireLatestImage());
        }
        return m63190e;
    }

    @Override // androidx.camera.core.impl.ImageReaderProxy
    @Nullable
    public ImageProxy acquireNextImage() {
        ImageProxy m63190e;
        synchronized (this.f10877a) {
            m63190e = m63190e(this.f10880d.acquireNextImage());
        }
        return m63190e;
    }

    /* renamed from: c */
    public final /* synthetic */ void m63192c(ImageProxy imageProxy) {
        ForwardingImageProxy.OnImageCloseListener onImageCloseListener;
        synchronized (this.f10877a) {
            try {
                int i = this.f10878b - 1;
                this.f10878b = i;
                if (this.f10879c && i == 0) {
                    close();
                }
                onImageCloseListener = this.f10882f;
            } catch (Throwable th2) {
                throw th2;
            }
        }
        if (onImageCloseListener != null) {
            onImageCloseListener.onImageClose(imageProxy);
        }
    }

    @Override // androidx.camera.core.impl.ImageReaderProxy
    public void clearOnImageAvailableListener() {
        synchronized (this.f10877a) {
            this.f10880d.clearOnImageAvailableListener();
        }
    }

    @Override // androidx.camera.core.impl.ImageReaderProxy
    public void close() {
        synchronized (this.f10877a) {
            try {
                Surface surface = this.f10881e;
                if (surface != null) {
                    surface.release();
                }
                this.f10880d.close();
            } catch (Throwable th2) {
                throw th2;
            }
        }
    }

    /* renamed from: d */
    public final /* synthetic */ void m63191d(ImageReaderProxy.OnImageAvailableListener onImageAvailableListener, ImageReaderProxy imageReaderProxy) {
        onImageAvailableListener.onImageAvailable(this);
    }

    /* renamed from: e */
    public final ImageProxy m63190e(ImageProxy imageProxy) {
        if (imageProxy != null) {
            this.f10878b++;
            EJ1 ej1 = new EJ1(imageProxy);
            ej1.addOnImageCloseListener(this.f10883g);
            return ej1;
        }
        return null;
    }

    public int getCapacity() {
        int maxImages;
        synchronized (this.f10877a) {
            maxImages = this.f10880d.getMaxImages() - this.f10878b;
        }
        return maxImages;
    }

    @Override // androidx.camera.core.impl.ImageReaderProxy
    public int getHeight() {
        int height;
        synchronized (this.f10877a) {
            height = this.f10880d.getHeight();
        }
        return height;
    }

    @Override // androidx.camera.core.impl.ImageReaderProxy
    public int getImageFormat() {
        int imageFormat;
        synchronized (this.f10877a) {
            imageFormat = this.f10880d.getImageFormat();
        }
        return imageFormat;
    }

    @NonNull
    @VisibleForTesting
    public ImageReaderProxy getImageReaderProxy() {
        ImageReaderProxy imageReaderProxy;
        synchronized (this.f10877a) {
            imageReaderProxy = this.f10880d;
        }
        return imageReaderProxy;
    }

    @Override // androidx.camera.core.impl.ImageReaderProxy
    public int getMaxImages() {
        int maxImages;
        synchronized (this.f10877a) {
            maxImages = this.f10880d.getMaxImages();
        }
        return maxImages;
    }

    @Override // androidx.camera.core.impl.ImageReaderProxy
    @Nullable
    public Surface getSurface() {
        Surface surface;
        synchronized (this.f10877a) {
            surface = this.f10880d.getSurface();
        }
        return surface;
    }

    @Override // androidx.camera.core.impl.ImageReaderProxy
    public int getWidth() {
        int width;
        synchronized (this.f10877a) {
            width = this.f10880d.getWidth();
        }
        return width;
    }

    @VisibleForTesting
    public boolean isClosed() {
        boolean z;
        synchronized (this.f10877a) {
            z = this.f10879c;
        }
        return z;
    }

    public void safeClose() {
        synchronized (this.f10877a) {
            try {
                this.f10879c = true;
                this.f10880d.clearOnImageAvailableListener();
                if (this.f10878b == 0) {
                    close();
                }
            } catch (Throwable th2) {
                throw th2;
            }
        }
    }

    @Override // androidx.camera.core.impl.ImageReaderProxy
    public void setOnImageAvailableListener(@NonNull final ImageReaderProxy.OnImageAvailableListener onImageAvailableListener, @NonNull Executor executor) {
        synchronized (this.f10877a) {
            this.f10880d.setOnImageAvailableListener(new ImageReaderProxy.OnImageAvailableListener() { // from class: fD1
                {
                    SafeCloseImageReaderProxy.this = this;
                }

                @Override // androidx.camera.core.impl.ImageReaderProxy.OnImageAvailableListener
                public final void onImageAvailable(ImageReaderProxy imageReaderProxy) {
                    SafeCloseImageReaderProxy.m63194a(SafeCloseImageReaderProxy.this, onImageAvailableListener, imageReaderProxy);
                }
            }, executor);
        }
    }

    public void setOnImageCloseListener(@NonNull ForwardingImageProxy.OnImageCloseListener onImageCloseListener) {
        synchronized (this.f10877a) {
            this.f10882f = onImageCloseListener;
        }
    }
}

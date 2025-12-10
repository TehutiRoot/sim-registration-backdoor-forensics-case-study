package p000;

import android.media.Image;
import android.media.ImageReader;
import android.view.Surface;
import androidx.camera.core.C2458a;
import androidx.camera.core.ImageProxy;
import androidx.camera.core.impl.ImageReaderProxy;
import androidx.camera.core.impl.utils.MainThreadAsyncHandler;
import java.util.concurrent.Executor;

/* renamed from: f4 */
/* loaded from: classes.dex */
public class C10201f4 implements ImageReaderProxy {

    /* renamed from: a */
    public final ImageReader f61707a;

    /* renamed from: b */
    public final Object f61708b = new Object();

    /* renamed from: c */
    public boolean f61709c = true;

    public C10201f4(ImageReader imageReader) {
        this.f61707a = imageReader;
    }

    /* renamed from: a */
    public static /* synthetic */ void m31360a(C10201f4 c10201f4, Executor executor, ImageReaderProxy.OnImageAvailableListener onImageAvailableListener, ImageReader imageReader) {
        c10201f4.m31356e(executor, onImageAvailableListener, imageReader);
    }

    /* renamed from: b */
    public static /* synthetic */ void m31359b(C10201f4 c10201f4, ImageReaderProxy.OnImageAvailableListener onImageAvailableListener) {
        c10201f4.m31357d(onImageAvailableListener);
    }

    @Override // androidx.camera.core.impl.ImageReaderProxy
    public ImageProxy acquireLatestImage() {
        Image image;
        synchronized (this.f61708b) {
            try {
                image = this.f61707a.acquireLatestImage();
            } catch (RuntimeException e) {
                if (m31358c(e)) {
                    image = null;
                } else {
                    throw e;
                }
            }
            if (image == null) {
                return null;
            }
            return new C2458a(image);
        }
    }

    @Override // androidx.camera.core.impl.ImageReaderProxy
    public ImageProxy acquireNextImage() {
        Image image;
        synchronized (this.f61708b) {
            try {
                image = this.f61707a.acquireNextImage();
            } catch (RuntimeException e) {
                if (m31358c(e)) {
                    image = null;
                } else {
                    throw e;
                }
            }
            if (image == null) {
                return null;
            }
            return new C2458a(image);
        }
    }

    /* renamed from: c */
    public final boolean m31358c(RuntimeException runtimeException) {
        return "ImageReaderContext is not initialized".equals(runtimeException.getMessage());
    }

    @Override // androidx.camera.core.impl.ImageReaderProxy
    public void clearOnImageAvailableListener() {
        synchronized (this.f61708b) {
            this.f61709c = true;
            this.f61707a.setOnImageAvailableListener(null, null);
        }
    }

    @Override // androidx.camera.core.impl.ImageReaderProxy
    public void close() {
        synchronized (this.f61708b) {
            this.f61707a.close();
        }
    }

    /* renamed from: d */
    public final /* synthetic */ void m31357d(ImageReaderProxy.OnImageAvailableListener onImageAvailableListener) {
        onImageAvailableListener.onImageAvailable(this);
    }

    /* renamed from: e */
    public final /* synthetic */ void m31356e(Executor executor, final ImageReaderProxy.OnImageAvailableListener onImageAvailableListener, ImageReader imageReader) {
        synchronized (this.f61708b) {
            try {
                if (!this.f61709c) {
                    executor.execute(new Runnable() { // from class: e4
                        {
                            C10201f4.this = this;
                        }

                        @Override // java.lang.Runnable
                        public final void run() {
                            C10201f4.m31359b(C10201f4.this, onImageAvailableListener);
                        }
                    });
                }
            } catch (Throwable th2) {
                throw th2;
            }
        }
    }

    @Override // androidx.camera.core.impl.ImageReaderProxy
    public int getHeight() {
        int height;
        synchronized (this.f61708b) {
            height = this.f61707a.getHeight();
        }
        return height;
    }

    @Override // androidx.camera.core.impl.ImageReaderProxy
    public int getImageFormat() {
        int imageFormat;
        synchronized (this.f61708b) {
            imageFormat = this.f61707a.getImageFormat();
        }
        return imageFormat;
    }

    @Override // androidx.camera.core.impl.ImageReaderProxy
    public int getMaxImages() {
        int maxImages;
        synchronized (this.f61708b) {
            maxImages = this.f61707a.getMaxImages();
        }
        return maxImages;
    }

    @Override // androidx.camera.core.impl.ImageReaderProxy
    public Surface getSurface() {
        Surface surface;
        synchronized (this.f61708b) {
            surface = this.f61707a.getSurface();
        }
        return surface;
    }

    @Override // androidx.camera.core.impl.ImageReaderProxy
    public int getWidth() {
        int width;
        synchronized (this.f61708b) {
            width = this.f61707a.getWidth();
        }
        return width;
    }

    @Override // androidx.camera.core.impl.ImageReaderProxy
    public void setOnImageAvailableListener(final ImageReaderProxy.OnImageAvailableListener onImageAvailableListener, final Executor executor) {
        synchronized (this.f61708b) {
            this.f61709c = false;
            this.f61707a.setOnImageAvailableListener(new ImageReader.OnImageAvailableListener() { // from class: d4
                {
                    C10201f4.this = this;
                }

                @Override // android.media.ImageReader.OnImageAvailableListener
                public final void onImageAvailable(ImageReader imageReader) {
                    C10201f4.m31360a(C10201f4.this, executor, onImageAvailableListener, imageReader);
                }
            }, MainThreadAsyncHandler.getInstance());
        }
    }
}

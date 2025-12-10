package androidx.camera.core;

import android.media.ImageReader;
import android.util.LongSparseArray;
import android.view.Surface;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.annotation.RequiresApi;
import androidx.annotation.RestrictTo;
import androidx.camera.core.ForwardingImageProxy;
import androidx.camera.core.MetadataImageReader;
import androidx.camera.core.impl.CameraCaptureCallback;
import androidx.camera.core.impl.CameraCaptureResult;
import androidx.camera.core.impl.ImageReaderProxy;
import androidx.camera.core.internal.CameraCaptureResultImageInfo;
import androidx.core.util.Preconditions;
import java.util.ArrayList;
import java.util.List;
import java.util.concurrent.Executor;

@RequiresApi(21)
@RestrictTo({RestrictTo.Scope.LIBRARY_GROUP})
/* loaded from: classes.dex */
public class MetadataImageReader implements ImageReaderProxy, ForwardingImageProxy.OnImageCloseListener {

    /* renamed from: a */
    public final Object f10846a;

    /* renamed from: b */
    public CameraCaptureCallback f10847b;

    /* renamed from: c */
    public int f10848c;

    /* renamed from: d */
    public ImageReaderProxy.OnImageAvailableListener f10849d;

    /* renamed from: e */
    public boolean f10850e;

    /* renamed from: f */
    public final ImageReaderProxy f10851f;

    /* renamed from: g */
    public ImageReaderProxy.OnImageAvailableListener f10852g;

    /* renamed from: h */
    public Executor f10853h;

    /* renamed from: i */
    public final LongSparseArray f10854i;

    /* renamed from: j */
    public final LongSparseArray f10855j;

    /* renamed from: k */
    public int f10856k;

    /* renamed from: l */
    public final List f10857l;

    /* renamed from: m */
    public final List f10858m;

    /* renamed from: androidx.camera.core.MetadataImageReader$a */
    /* loaded from: classes.dex */
    public class C2448a extends CameraCaptureCallback {
        public C2448a() {
            MetadataImageReader.this = r1;
        }

        @Override // androidx.camera.core.impl.CameraCaptureCallback
        public void onCaptureCompleted(CameraCaptureResult cameraCaptureResult) {
            super.onCaptureCompleted(cameraCaptureResult);
            MetadataImageReader.this.m63211k(cameraCaptureResult);
        }
    }

    public MetadataImageReader(int i, int i2, int i3, int i4) {
        this(m63219c(i, i2, i3, i4));
    }

    /* renamed from: a */
    public static /* synthetic */ void m63221a(MetadataImageReader metadataImageReader, ImageReaderProxy.OnImageAvailableListener onImageAvailableListener) {
        metadataImageReader.m63215g(onImageAvailableListener);
    }

    /* renamed from: b */
    public static /* synthetic */ void m63220b(MetadataImageReader metadataImageReader, ImageReaderProxy imageReaderProxy) {
        metadataImageReader.m63214h(imageReaderProxy);
    }

    /* renamed from: c */
    public static ImageReaderProxy m63219c(int i, int i2, int i3, int i4) {
        return new C10201f4(ImageReader.newInstance(i, i2, i3, i4));
    }

    @Override // androidx.camera.core.impl.ImageReaderProxy
    @Nullable
    public ImageProxy acquireLatestImage() {
        synchronized (this.f10846a) {
            try {
                if (this.f10857l.isEmpty()) {
                    return null;
                }
                if (this.f10856k < this.f10857l.size()) {
                    ArrayList<ImageProxy> arrayList = new ArrayList();
                    for (int i = 0; i < this.f10857l.size() - 1; i++) {
                        if (!this.f10858m.contains(this.f10857l.get(i))) {
                            arrayList.add((ImageProxy) this.f10857l.get(i));
                        }
                    }
                    for (ImageProxy imageProxy : arrayList) {
                        imageProxy.close();
                    }
                    int size = this.f10857l.size();
                    List list = this.f10857l;
                    this.f10856k = size;
                    ImageProxy imageProxy2 = (ImageProxy) list.get(size - 1);
                    this.f10858m.add(imageProxy2);
                    return imageProxy2;
                }
                throw new IllegalStateException("Maximum image number reached.");
            } catch (Throwable th2) {
                throw th2;
            }
        }
    }

    @Override // androidx.camera.core.impl.ImageReaderProxy
    @Nullable
    public ImageProxy acquireNextImage() {
        synchronized (this.f10846a) {
            try {
                if (this.f10857l.isEmpty()) {
                    return null;
                }
                if (this.f10856k < this.f10857l.size()) {
                    List list = this.f10857l;
                    int i = this.f10856k;
                    this.f10856k = i + 1;
                    ImageProxy imageProxy = (ImageProxy) list.get(i);
                    this.f10858m.add(imageProxy);
                    return imageProxy;
                }
                throw new IllegalStateException("Maximum image number reached.");
            } catch (Throwable th2) {
                throw th2;
            }
        }
    }

    @Override // androidx.camera.core.impl.ImageReaderProxy
    public void clearOnImageAvailableListener() {
        synchronized (this.f10846a) {
            this.f10851f.clearOnImageAvailableListener();
            this.f10852g = null;
            this.f10853h = null;
            this.f10848c = 0;
        }
    }

    @Override // androidx.camera.core.impl.ImageReaderProxy
    public void close() {
        synchronized (this.f10846a) {
            try {
                if (this.f10850e) {
                    return;
                }
                for (ImageProxy imageProxy : new ArrayList(this.f10857l)) {
                    imageProxy.close();
                }
                this.f10857l.clear();
                this.f10851f.close();
                this.f10850e = true;
            } catch (Throwable th2) {
                throw th2;
            }
        }
    }

    /* renamed from: d */
    public final void m63218d(ImageProxy imageProxy) {
        synchronized (this.f10846a) {
            try {
                int indexOf = this.f10857l.indexOf(imageProxy);
                if (indexOf >= 0) {
                    this.f10857l.remove(indexOf);
                    int i = this.f10856k;
                    if (indexOf <= i) {
                        this.f10856k = i - 1;
                    }
                }
                this.f10858m.remove(imageProxy);
                if (this.f10848c > 0) {
                    m63216f(this.f10851f);
                }
            } catch (Throwable th2) {
                throw th2;
            }
        }
    }

    /* renamed from: e */
    public final void m63217e(SettableImageProxy settableImageProxy) {
        final ImageReaderProxy.OnImageAvailableListener onImageAvailableListener;
        Executor executor;
        synchronized (this.f10846a) {
            try {
                if (this.f10857l.size() < getMaxImages()) {
                    settableImageProxy.addOnImageCloseListener(this);
                    this.f10857l.add(settableImageProxy);
                    onImageAvailableListener = this.f10852g;
                    executor = this.f10853h;
                } else {
                    Logger.m63230d("TAG", "Maximum image number reached.");
                    settableImageProxy.close();
                    onImageAvailableListener = null;
                    executor = null;
                }
            } catch (Throwable th2) {
                throw th2;
            }
        }
        if (onImageAvailableListener != null) {
            if (executor != null) {
                executor.execute(new Runnable() { // from class: us0
                    {
                        MetadataImageReader.this = this;
                    }

                    @Override // java.lang.Runnable
                    public final void run() {
                        MetadataImageReader.m63221a(MetadataImageReader.this, onImageAvailableListener);
                    }
                });
            } else {
                onImageAvailableListener.onImageAvailable(this);
            }
        }
    }

    /* renamed from: f */
    public void m63216f(ImageReaderProxy imageReaderProxy) {
        ImageProxy imageProxy;
        synchronized (this.f10846a) {
            try {
                if (this.f10850e) {
                    return;
                }
                int size = this.f10855j.size() + this.f10857l.size();
                if (size >= imageReaderProxy.getMaxImages()) {
                    Logger.m63230d("MetadataImageReader", "Skip to acquire the next image because the acquired image count has reached the max images count.");
                    return;
                }
                do {
                    try {
                        imageProxy = imageReaderProxy.acquireNextImage();
                        if (imageProxy != null) {
                            this.f10848c--;
                            size++;
                            this.f10855j.put(imageProxy.getImageInfo().getTimestamp(), imageProxy);
                            m63213i();
                        }
                    } catch (IllegalStateException e) {
                        Logger.m63229d("MetadataImageReader", "Failed to acquire next image.", e);
                        imageProxy = null;
                    }
                    if (imageProxy == null || this.f10848c <= 0) {
                        break;
                    }
                } while (size < imageReaderProxy.getMaxImages());
            } catch (Throwable th2) {
                throw th2;
            }
        }
    }

    /* renamed from: g */
    public final /* synthetic */ void m63215g(ImageReaderProxy.OnImageAvailableListener onImageAvailableListener) {
        onImageAvailableListener.onImageAvailable(this);
    }

    @NonNull
    public CameraCaptureCallback getCameraCaptureCallback() {
        return this.f10847b;
    }

    @Override // androidx.camera.core.impl.ImageReaderProxy
    public int getHeight() {
        int height;
        synchronized (this.f10846a) {
            height = this.f10851f.getHeight();
        }
        return height;
    }

    @Override // androidx.camera.core.impl.ImageReaderProxy
    public int getImageFormat() {
        int imageFormat;
        synchronized (this.f10846a) {
            imageFormat = this.f10851f.getImageFormat();
        }
        return imageFormat;
    }

    @Override // androidx.camera.core.impl.ImageReaderProxy
    public int getMaxImages() {
        int maxImages;
        synchronized (this.f10846a) {
            maxImages = this.f10851f.getMaxImages();
        }
        return maxImages;
    }

    @Override // androidx.camera.core.impl.ImageReaderProxy
    @Nullable
    public Surface getSurface() {
        Surface surface;
        synchronized (this.f10846a) {
            surface = this.f10851f.getSurface();
        }
        return surface;
    }

    @Override // androidx.camera.core.impl.ImageReaderProxy
    public int getWidth() {
        int width;
        synchronized (this.f10846a) {
            width = this.f10851f.getWidth();
        }
        return width;
    }

    /* renamed from: h */
    public final /* synthetic */ void m63214h(ImageReaderProxy imageReaderProxy) {
        synchronized (this.f10846a) {
            this.f10848c++;
        }
        m63216f(imageReaderProxy);
    }

    /* renamed from: i */
    public final void m63213i() {
        synchronized (this.f10846a) {
            try {
                for (int size = this.f10854i.size() - 1; size >= 0; size--) {
                    ImageInfo imageInfo = (ImageInfo) this.f10854i.valueAt(size);
                    long timestamp = imageInfo.getTimestamp();
                    ImageProxy imageProxy = (ImageProxy) this.f10855j.get(timestamp);
                    if (imageProxy != null) {
                        this.f10855j.remove(timestamp);
                        this.f10854i.removeAt(size);
                        m63217e(new SettableImageProxy(imageProxy, imageInfo));
                    }
                }
                m63212j();
            } catch (Throwable th2) {
                throw th2;
            }
        }
    }

    /* renamed from: j */
    public final void m63212j() {
        synchronized (this.f10846a) {
            try {
                if (this.f10855j.size() != 0 && this.f10854i.size() != 0) {
                    long keyAt = this.f10855j.keyAt(0);
                    Long valueOf = Long.valueOf(keyAt);
                    long keyAt2 = this.f10854i.keyAt(0);
                    Preconditions.checkArgument(!Long.valueOf(keyAt2).equals(valueOf));
                    if (keyAt2 > keyAt) {
                        for (int size = this.f10855j.size() - 1; size >= 0; size--) {
                            if (this.f10855j.keyAt(size) < keyAt2) {
                                ((ImageProxy) this.f10855j.valueAt(size)).close();
                                this.f10855j.removeAt(size);
                            }
                        }
                    } else {
                        for (int size2 = this.f10854i.size() - 1; size2 >= 0; size2--) {
                            if (this.f10854i.keyAt(size2) < keyAt) {
                                this.f10854i.removeAt(size2);
                            }
                        }
                    }
                }
            } finally {
            }
        }
    }

    /* renamed from: k */
    public void m63211k(CameraCaptureResult cameraCaptureResult) {
        synchronized (this.f10846a) {
            try {
                if (this.f10850e) {
                    return;
                }
                this.f10854i.put(cameraCaptureResult.getTimestamp(), new CameraCaptureResultImageInfo(cameraCaptureResult));
                m63213i();
            } catch (Throwable th2) {
                throw th2;
            }
        }
    }

    @Override // androidx.camera.core.ForwardingImageProxy.OnImageCloseListener
    public void onImageClose(@NonNull ImageProxy imageProxy) {
        synchronized (this.f10846a) {
            m63218d(imageProxy);
        }
    }

    @Override // androidx.camera.core.impl.ImageReaderProxy
    public void setOnImageAvailableListener(@NonNull ImageReaderProxy.OnImageAvailableListener onImageAvailableListener, @NonNull Executor executor) {
        synchronized (this.f10846a) {
            this.f10852g = (ImageReaderProxy.OnImageAvailableListener) Preconditions.checkNotNull(onImageAvailableListener);
            this.f10853h = (Executor) Preconditions.checkNotNull(executor);
            this.f10851f.setOnImageAvailableListener(this.f10849d, executor);
        }
    }

    public MetadataImageReader(ImageReaderProxy imageReaderProxy) {
        this.f10846a = new Object();
        this.f10847b = new C2448a();
        this.f10848c = 0;
        this.f10849d = new ImageReaderProxy.OnImageAvailableListener() { // from class: ts0
            {
                MetadataImageReader.this = this;
            }

            @Override // androidx.camera.core.impl.ImageReaderProxy.OnImageAvailableListener
            public final void onImageAvailable(ImageReaderProxy imageReaderProxy2) {
                MetadataImageReader.m63220b(MetadataImageReader.this, imageReaderProxy2);
            }
        };
        this.f10850e = false;
        this.f10854i = new LongSparseArray();
        this.f10855j = new LongSparseArray();
        this.f10858m = new ArrayList();
        this.f10851f = imageReaderProxy;
        this.f10856k = 0;
        this.f10857l = new ArrayList(getMaxImages());
    }
}

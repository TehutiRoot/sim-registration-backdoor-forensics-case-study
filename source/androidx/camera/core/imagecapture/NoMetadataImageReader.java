package androidx.camera.core.imagecapture;

import android.util.Pair;
import android.util.Size;
import android.view.Surface;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.annotation.RequiresApi;
import androidx.camera.core.ImageProxy;
import androidx.camera.core.SettableImageProxy;
import androidx.camera.core.imagecapture.NoMetadataImageReader;
import androidx.camera.core.impl.ImageReaderProxy;
import androidx.camera.core.impl.TagBundle;
import androidx.camera.core.internal.CameraCaptureResultImageInfo;
import androidx.camera.core.streamsharing.VirtualCameraCaptureResult;
import androidx.core.util.Preconditions;
import java.util.concurrent.Executor;

@RequiresApi(api = 21)
/* loaded from: classes.dex */
public class NoMetadataImageReader implements ImageReaderProxy {

    /* renamed from: a */
    public final ImageReaderProxy f11008a;

    /* renamed from: b */
    public C21132mo1 f11009b;

    public NoMetadataImageReader(ImageReaderProxy imageReaderProxy) {
        this.f11008a = imageReaderProxy;
    }

    /* renamed from: a */
    public static /* synthetic */ void m63112a(NoMetadataImageReader noMetadataImageReader, ImageReaderProxy.OnImageAvailableListener onImageAvailableListener, ImageReaderProxy imageReaderProxy) {
        noMetadataImageReader.m63109d(onImageAvailableListener, imageReaderProxy);
    }

    @Override // androidx.camera.core.impl.ImageReaderProxy
    @Nullable
    public ImageProxy acquireLatestImage() {
        return m63110c(this.f11008a.acquireLatestImage());
    }

    @Override // androidx.camera.core.impl.ImageReaderProxy
    @Nullable
    public ImageProxy acquireNextImage() {
        return m63110c(this.f11008a.acquireNextImage());
    }

    /* renamed from: b */
    public void m63111b(C21132mo1 c21132mo1) {
        boolean z;
        if (this.f11009b == null) {
            z = true;
        } else {
            z = false;
        }
        Preconditions.checkState(z, "Pending request should be null");
        this.f11009b = c21132mo1;
    }

    /* renamed from: c */
    public final ImageProxy m63110c(ImageProxy imageProxy) {
        boolean z;
        if (imageProxy == null) {
            return null;
        }
        if (this.f11009b != null) {
            z = true;
        } else {
            z = false;
        }
        Preconditions.checkState(z, "Pending request should not be null");
        TagBundle create = TagBundle.create(new Pair(this.f11009b.m26197h(), this.f11009b.m26198g().get(0)));
        this.f11009b = null;
        return new SettableImageProxy(imageProxy, new Size(imageProxy.getWidth(), imageProxy.getHeight()), new CameraCaptureResultImageInfo(new VirtualCameraCaptureResult(create, imageProxy.getImageInfo().getTimestamp())));
    }

    @Override // androidx.camera.core.impl.ImageReaderProxy
    public void clearOnImageAvailableListener() {
        this.f11008a.clearOnImageAvailableListener();
    }

    @Override // androidx.camera.core.impl.ImageReaderProxy
    public void close() {
        this.f11008a.close();
    }

    /* renamed from: d */
    public final /* synthetic */ void m63109d(ImageReaderProxy.OnImageAvailableListener onImageAvailableListener, ImageReaderProxy imageReaderProxy) {
        onImageAvailableListener.onImageAvailable(this);
    }

    @Override // androidx.camera.core.impl.ImageReaderProxy
    public int getHeight() {
        return this.f11008a.getHeight();
    }

    @Override // androidx.camera.core.impl.ImageReaderProxy
    public int getImageFormat() {
        return this.f11008a.getImageFormat();
    }

    @Override // androidx.camera.core.impl.ImageReaderProxy
    public int getMaxImages() {
        return this.f11008a.getMaxImages();
    }

    @Override // androidx.camera.core.impl.ImageReaderProxy
    @Nullable
    public Surface getSurface() {
        return this.f11008a.getSurface();
    }

    @Override // androidx.camera.core.impl.ImageReaderProxy
    public int getWidth() {
        return this.f11008a.getWidth();
    }

    @Override // androidx.camera.core.impl.ImageReaderProxy
    public void setOnImageAvailableListener(@NonNull final ImageReaderProxy.OnImageAvailableListener onImageAvailableListener, @NonNull Executor executor) {
        this.f11008a.setOnImageAvailableListener(new ImageReaderProxy.OnImageAvailableListener() { // from class: HI0
            {
                NoMetadataImageReader.this = this;
            }

            @Override // androidx.camera.core.impl.ImageReaderProxy.OnImageAvailableListener
            public final void onImageAvailable(ImageReaderProxy imageReaderProxy) {
                NoMetadataImageReader.m63112a(NoMetadataImageReader.this, onImageAvailableListener, imageReaderProxy);
            }
        }, executor);
    }
}

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
    public final ImageReaderProxy f11096a;

    /* renamed from: b */
    public C20675jp1 f11097b;

    public NoMetadataImageReader(ImageReaderProxy imageReaderProxy) {
        this.f11096a = imageReaderProxy;
    }

    /* renamed from: a */
    public static /* synthetic */ void m63060a(NoMetadataImageReader noMetadataImageReader, ImageReaderProxy.OnImageAvailableListener onImageAvailableListener, ImageReaderProxy imageReaderProxy) {
        noMetadataImageReader.m63057d(onImageAvailableListener, imageReaderProxy);
    }

    @Override // androidx.camera.core.impl.ImageReaderProxy
    @Nullable
    public ImageProxy acquireLatestImage() {
        return m63058c(this.f11096a.acquireLatestImage());
    }

    @Override // androidx.camera.core.impl.ImageReaderProxy
    @Nullable
    public ImageProxy acquireNextImage() {
        return m63058c(this.f11096a.acquireNextImage());
    }

    /* renamed from: b */
    public void m63059b(C20675jp1 c20675jp1) {
        boolean z;
        if (this.f11097b == null) {
            z = true;
        } else {
            z = false;
        }
        Preconditions.checkState(z, "Pending request should be null");
        this.f11097b = c20675jp1;
    }

    /* renamed from: c */
    public final ImageProxy m63058c(ImageProxy imageProxy) {
        boolean z;
        if (imageProxy == null) {
            return null;
        }
        if (this.f11097b != null) {
            z = true;
        } else {
            z = false;
        }
        Preconditions.checkState(z, "Pending request should not be null");
        TagBundle create = TagBundle.create(new Pair(this.f11097b.m29334h(), this.f11097b.m29335g().get(0)));
        this.f11097b = null;
        return new SettableImageProxy(imageProxy, new Size(imageProxy.getWidth(), imageProxy.getHeight()), new CameraCaptureResultImageInfo(new VirtualCameraCaptureResult(create, imageProxy.getImageInfo().getTimestamp())));
    }

    @Override // androidx.camera.core.impl.ImageReaderProxy
    public void clearOnImageAvailableListener() {
        this.f11096a.clearOnImageAvailableListener();
    }

    @Override // androidx.camera.core.impl.ImageReaderProxy
    public void close() {
        this.f11096a.close();
    }

    /* renamed from: d */
    public final /* synthetic */ void m63057d(ImageReaderProxy.OnImageAvailableListener onImageAvailableListener, ImageReaderProxy imageReaderProxy) {
        onImageAvailableListener.onImageAvailable(this);
    }

    @Override // androidx.camera.core.impl.ImageReaderProxy
    public int getHeight() {
        return this.f11096a.getHeight();
    }

    @Override // androidx.camera.core.impl.ImageReaderProxy
    public int getImageFormat() {
        return this.f11096a.getImageFormat();
    }

    @Override // androidx.camera.core.impl.ImageReaderProxy
    public int getMaxImages() {
        return this.f11096a.getMaxImages();
    }

    @Override // androidx.camera.core.impl.ImageReaderProxy
    @Nullable
    public Surface getSurface() {
        return this.f11096a.getSurface();
    }

    @Override // androidx.camera.core.impl.ImageReaderProxy
    public int getWidth() {
        return this.f11096a.getWidth();
    }

    @Override // androidx.camera.core.impl.ImageReaderProxy
    public void setOnImageAvailableListener(@NonNull final ImageReaderProxy.OnImageAvailableListener onImageAvailableListener, @NonNull Executor executor) {
        this.f11096a.setOnImageAvailableListener(new ImageReaderProxy.OnImageAvailableListener() { // from class: NI0
            @Override // androidx.camera.core.impl.ImageReaderProxy.OnImageAvailableListener
            public final void onImageAvailable(ImageReaderProxy imageReaderProxy) {
                NoMetadataImageReader.m63060a(NoMetadataImageReader.this, onImageAvailableListener, imageReaderProxy);
            }
        }, executor);
    }
}
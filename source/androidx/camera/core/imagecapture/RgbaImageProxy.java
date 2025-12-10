package androidx.camera.core.imagecapture;

import android.graphics.Bitmap;
import android.graphics.Matrix;
import android.graphics.Rect;
import android.media.Image;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.annotation.RequiresApi;
import androidx.annotation.RestrictTo;
import androidx.camera.core.ExperimentalGetImage;
import androidx.camera.core.ImageInfo;
import androidx.camera.core.ImageProxy;
import androidx.camera.core.impl.TagBundle;
import androidx.camera.core.impl.utils.ExifData;
import androidx.camera.core.internal.utils.ImageUtil;
import androidx.camera.core.processing.Packet;
import androidx.core.util.Preconditions;
import java.nio.ByteBuffer;
import java.util.Objects;

@RequiresApi(api = 21)
@RestrictTo({RestrictTo.Scope.LIBRARY_GROUP})
/* loaded from: classes.dex */
public final class RgbaImageProxy implements ImageProxy {

    /* renamed from: a */
    public final Object f11023a;

    /* renamed from: b */
    public final int f11024b;

    /* renamed from: c */
    public final int f11025c;

    /* renamed from: d */
    public final Rect f11026d;

    /* renamed from: e */
    public ImageProxy.PlaneProxy[] f11027e;

    /* renamed from: f */
    public final ImageInfo f11028f;

    /* renamed from: androidx.camera.core.imagecapture.RgbaImageProxy$a */
    /* loaded from: classes.dex */
    public class C2474a implements ImageProxy.PlaneProxy {

        /* renamed from: a */
        public final /* synthetic */ int f11029a;

        /* renamed from: b */
        public final /* synthetic */ int f11030b;

        /* renamed from: c */
        public final /* synthetic */ ByteBuffer f11031c;

        public C2474a(int i, int i2, ByteBuffer byteBuffer) {
            this.f11029a = i;
            this.f11030b = i2;
            this.f11031c = byteBuffer;
        }

        @Override // androidx.camera.core.ImageProxy.PlaneProxy
        public ByteBuffer getBuffer() {
            return this.f11031c;
        }

        @Override // androidx.camera.core.ImageProxy.PlaneProxy
        public int getPixelStride() {
            return this.f11030b;
        }

        @Override // androidx.camera.core.ImageProxy.PlaneProxy
        public int getRowStride() {
            return this.f11029a;
        }
    }

    /* renamed from: androidx.camera.core.imagecapture.RgbaImageProxy$b */
    /* loaded from: classes.dex */
    public class C2475b implements ImageInfo {

        /* renamed from: a */
        public final /* synthetic */ long f11032a;

        /* renamed from: b */
        public final /* synthetic */ int f11033b;

        /* renamed from: c */
        public final /* synthetic */ Matrix f11034c;

        public C2475b(long j, int i, Matrix matrix) {
            this.f11032a = j;
            this.f11033b = i;
            this.f11034c = matrix;
        }

        @Override // androidx.camera.core.ImageInfo
        public int getRotationDegrees() {
            return this.f11033b;
        }

        @Override // androidx.camera.core.ImageInfo
        public Matrix getSensorToBufferTransformMatrix() {
            return new Matrix(this.f11034c);
        }

        @Override // androidx.camera.core.ImageInfo
        public TagBundle getTagBundle() {
            throw new UnsupportedOperationException("Custom ImageProxy does not contain TagBundle");
        }

        @Override // androidx.camera.core.ImageInfo
        public long getTimestamp() {
            return this.f11032a;
        }

        @Override // androidx.camera.core.ImageInfo
        public void populateExifData(ExifData.Builder builder) {
            throw new UnsupportedOperationException("Custom ImageProxy does not contain Exif data.");
        }
    }

    public RgbaImageProxy(@NonNull Packet<Bitmap> packet) {
        this(packet.getData(), packet.getCropRect(), packet.getRotationDegrees(), packet.getSensorToBufferTransform(), packet.getCameraCaptureResult().getTimestamp());
    }

    /* renamed from: d */
    public static ImageInfo m63090d(long j, int i, Matrix matrix) {
        return new C2475b(j, i, matrix);
    }

    /* renamed from: g */
    public static ImageProxy.PlaneProxy m63089g(ByteBuffer byteBuffer, int i, int i2) {
        return new C2474a(i, i2, byteBuffer);
    }

    /* renamed from: b */
    public final void m63091b() {
        boolean z;
        synchronized (this.f11023a) {
            if (this.f11027e != null) {
                z = true;
            } else {
                z = false;
            }
            Preconditions.checkState(z, "The image is closed.");
        }
    }

    @Override // androidx.camera.core.ImageProxy, java.lang.AutoCloseable
    public void close() {
        synchronized (this.f11023a) {
            m63091b();
            this.f11027e = null;
        }
    }

    @NonNull
    public Bitmap createBitmap() {
        Bitmap createBitmapFromPlane;
        synchronized (this.f11023a) {
            m63091b();
            createBitmapFromPlane = ImageUtil.createBitmapFromPlane(getPlanes(), getWidth(), getHeight());
        }
        return createBitmapFromPlane;
    }

    @Override // androidx.camera.core.ImageProxy
    @NonNull
    public Rect getCropRect() {
        Rect rect;
        synchronized (this.f11023a) {
            m63091b();
            rect = this.f11026d;
        }
        return rect;
    }

    @Override // androidx.camera.core.ImageProxy
    public int getFormat() {
        synchronized (this.f11023a) {
            m63091b();
        }
        return 1;
    }

    @Override // androidx.camera.core.ImageProxy
    public int getHeight() {
        int i;
        synchronized (this.f11023a) {
            m63091b();
            i = this.f11025c;
        }
        return i;
    }

    @Override // androidx.camera.core.ImageProxy
    @Nullable
    @ExperimentalGetImage
    public Image getImage() {
        synchronized (this.f11023a) {
            m63091b();
        }
        return null;
    }

    @Override // androidx.camera.core.ImageProxy
    @NonNull
    public ImageInfo getImageInfo() {
        ImageInfo imageInfo;
        synchronized (this.f11023a) {
            m63091b();
            imageInfo = this.f11028f;
        }
        return imageInfo;
    }

    @Override // androidx.camera.core.ImageProxy
    @NonNull
    public ImageProxy.PlaneProxy[] getPlanes() {
        ImageProxy.PlaneProxy[] planeProxyArr;
        synchronized (this.f11023a) {
            m63091b();
            ImageProxy.PlaneProxy[] planeProxyArr2 = this.f11027e;
            Objects.requireNonNull(planeProxyArr2);
            planeProxyArr = planeProxyArr2;
        }
        return planeProxyArr;
    }

    @Override // androidx.camera.core.ImageProxy
    public int getWidth() {
        int i;
        synchronized (this.f11023a) {
            m63091b();
            i = this.f11024b;
        }
        return i;
    }

    @Override // androidx.camera.core.ImageProxy
    public void setCropRect(@Nullable Rect rect) {
        synchronized (this.f11023a) {
            try {
                m63091b();
                if (rect != null) {
                    this.f11026d.set(rect);
                }
            } catch (Throwable th2) {
                throw th2;
            }
        }
    }

    @Override // androidx.camera.core.ImageProxy
    public /* synthetic */ Bitmap toBitmap() {
        return AbstractC21098md0.m26246a(this);
    }

    public RgbaImageProxy(@NonNull Bitmap bitmap, @NonNull Rect rect, int i, @NonNull Matrix matrix, long j) {
        this(ImageUtil.createDirectByteBuffer(bitmap), 4, bitmap.getWidth(), bitmap.getHeight(), rect, i, matrix, j);
    }

    public RgbaImageProxy(@NonNull ByteBuffer byteBuffer, int i, int i2, int i3, @NonNull Rect rect, int i4, @NonNull Matrix matrix, long j) {
        this.f11023a = new Object();
        this.f11024b = i2;
        this.f11025c = i3;
        this.f11026d = rect;
        this.f11028f = m63090d(j, i4, matrix);
        byteBuffer.rewind();
        this.f11027e = new ImageProxy.PlaneProxy[]{m63089g(byteBuffer, i2 * i, i)};
    }
}

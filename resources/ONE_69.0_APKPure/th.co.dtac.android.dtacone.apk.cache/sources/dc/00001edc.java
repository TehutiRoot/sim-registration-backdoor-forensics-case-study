package androidx.camera.core;

import android.graphics.Bitmap;
import android.graphics.Matrix;
import android.graphics.Rect;
import android.media.Image;
import androidx.camera.core.ImageProxy;
import androidx.camera.core.impl.TagBundle;
import java.nio.ByteBuffer;

/* renamed from: androidx.camera.core.a */
/* loaded from: classes.dex */
public final class C2440a implements ImageProxy {

    /* renamed from: a */
    public final Image f11036a;

    /* renamed from: b */
    public final C2441a[] f11037b;

    /* renamed from: c */
    public final ImageInfo f11038c;

    /* renamed from: androidx.camera.core.a$a */
    /* loaded from: classes.dex */
    public static final class C2441a implements ImageProxy.PlaneProxy {

        /* renamed from: a */
        public final Image.Plane f11039a;

        public C2441a(Image.Plane plane) {
            this.f11039a = plane;
        }

        @Override // androidx.camera.core.ImageProxy.PlaneProxy
        public ByteBuffer getBuffer() {
            return this.f11039a.getBuffer();
        }

        @Override // androidx.camera.core.ImageProxy.PlaneProxy
        public int getPixelStride() {
            return this.f11039a.getPixelStride();
        }

        @Override // androidx.camera.core.ImageProxy.PlaneProxy
        public int getRowStride() {
            return this.f11039a.getRowStride();
        }
    }

    public C2440a(Image image) {
        this.f11036a = image;
        Image.Plane[] planes = image.getPlanes();
        if (planes != null) {
            this.f11037b = new C2441a[planes.length];
            for (int i = 0; i < planes.length; i++) {
                this.f11037b[i] = new C2441a(planes[i]);
            }
        } else {
            this.f11037b = new C2441a[0];
        }
        this.f11038c = ImmutableImageInfo.create(TagBundle.emptyBundle(), image.getTimestamp(), 0, new Matrix());
    }

    @Override // androidx.camera.core.ImageProxy, java.lang.AutoCloseable
    public void close() {
        this.f11036a.close();
    }

    @Override // androidx.camera.core.ImageProxy
    public Rect getCropRect() {
        return this.f11036a.getCropRect();
    }

    @Override // androidx.camera.core.ImageProxy
    public int getFormat() {
        return this.f11036a.getFormat();
    }

    @Override // androidx.camera.core.ImageProxy
    public int getHeight() {
        return this.f11036a.getHeight();
    }

    @Override // androidx.camera.core.ImageProxy
    public Image getImage() {
        return this.f11036a;
    }

    @Override // androidx.camera.core.ImageProxy
    public ImageInfo getImageInfo() {
        return this.f11038c;
    }

    @Override // androidx.camera.core.ImageProxy
    public ImageProxy.PlaneProxy[] getPlanes() {
        return this.f11037b;
    }

    @Override // androidx.camera.core.ImageProxy
    public int getWidth() {
        return this.f11036a.getWidth();
    }

    @Override // androidx.camera.core.ImageProxy
    public void setCropRect(Rect rect) {
        this.f11036a.setCropRect(rect);
    }

    @Override // androidx.camera.core.ImageProxy
    public /* synthetic */ Bitmap toBitmap() {
        return AbstractC22195sd0.m22796a(this);
    }
}
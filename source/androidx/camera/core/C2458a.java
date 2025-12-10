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
public final class C2458a implements ImageProxy {

    /* renamed from: a */
    public final Image f10948a;

    /* renamed from: b */
    public final C2459a[] f10949b;

    /* renamed from: c */
    public final ImageInfo f10950c;

    /* renamed from: androidx.camera.core.a$a */
    /* loaded from: classes.dex */
    public static final class C2459a implements ImageProxy.PlaneProxy {

        /* renamed from: a */
        public final Image.Plane f10951a;

        public C2459a(Image.Plane plane) {
            this.f10951a = plane;
        }

        @Override // androidx.camera.core.ImageProxy.PlaneProxy
        public ByteBuffer getBuffer() {
            return this.f10951a.getBuffer();
        }

        @Override // androidx.camera.core.ImageProxy.PlaneProxy
        public int getPixelStride() {
            return this.f10951a.getPixelStride();
        }

        @Override // androidx.camera.core.ImageProxy.PlaneProxy
        public int getRowStride() {
            return this.f10951a.getRowStride();
        }
    }

    public C2458a(Image image) {
        this.f10948a = image;
        Image.Plane[] planes = image.getPlanes();
        if (planes != null) {
            this.f10949b = new C2459a[planes.length];
            for (int i = 0; i < planes.length; i++) {
                this.f10949b[i] = new C2459a(planes[i]);
            }
        } else {
            this.f10949b = new C2459a[0];
        }
        this.f10950c = ImmutableImageInfo.create(TagBundle.emptyBundle(), image.getTimestamp(), 0, new Matrix());
    }

    @Override // androidx.camera.core.ImageProxy, java.lang.AutoCloseable
    public void close() {
        this.f10948a.close();
    }

    @Override // androidx.camera.core.ImageProxy
    public Rect getCropRect() {
        return this.f10948a.getCropRect();
    }

    @Override // androidx.camera.core.ImageProxy
    public int getFormat() {
        return this.f10948a.getFormat();
    }

    @Override // androidx.camera.core.ImageProxy
    public int getHeight() {
        return this.f10948a.getHeight();
    }

    @Override // androidx.camera.core.ImageProxy
    public Image getImage() {
        return this.f10948a;
    }

    @Override // androidx.camera.core.ImageProxy
    public ImageInfo getImageInfo() {
        return this.f10950c;
    }

    @Override // androidx.camera.core.ImageProxy
    public ImageProxy.PlaneProxy[] getPlanes() {
        return this.f10949b;
    }

    @Override // androidx.camera.core.ImageProxy
    public int getWidth() {
        return this.f10948a.getWidth();
    }

    @Override // androidx.camera.core.ImageProxy
    public void setCropRect(Rect rect) {
        this.f10948a.setCropRect(rect);
    }

    @Override // androidx.camera.core.ImageProxy
    public /* synthetic */ Bitmap toBitmap() {
        return AbstractC21098md0.m26246a(this);
    }
}

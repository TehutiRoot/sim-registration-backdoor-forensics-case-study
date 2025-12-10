package androidx.camera.core;

import android.graphics.Rect;
import android.util.Size;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.annotation.RequiresApi;
import androidx.annotation.RestrictTo;

@RequiresApi(21)
@RestrictTo({RestrictTo.Scope.LIBRARY_GROUP})
/* loaded from: classes.dex */
public final class SettableImageProxy extends ForwardingImageProxy {

    /* renamed from: c */
    public final Object f10972c;

    /* renamed from: d */
    public final ImageInfo f10973d;

    /* renamed from: e */
    public Rect f10974e;

    /* renamed from: f */
    public final int f10975f;

    /* renamed from: g */
    public final int f10976g;

    public SettableImageProxy(ImageProxy imageProxy, ImageInfo imageInfo) {
        this(imageProxy, null, imageInfo);
    }

    @Override // androidx.camera.core.ForwardingImageProxy, androidx.camera.core.ImageProxy
    @NonNull
    public Rect getCropRect() {
        synchronized (this.f10972c) {
            try {
                if (this.f10974e == null) {
                    return new Rect(0, 0, getWidth(), getHeight());
                }
                return new Rect(this.f10974e);
            } catch (Throwable th2) {
                throw th2;
            }
        }
    }

    @Override // androidx.camera.core.ForwardingImageProxy, androidx.camera.core.ImageProxy
    public int getHeight() {
        return this.f10976g;
    }

    @Override // androidx.camera.core.ForwardingImageProxy, androidx.camera.core.ImageProxy
    @NonNull
    public ImageInfo getImageInfo() {
        return this.f10973d;
    }

    @Override // androidx.camera.core.ForwardingImageProxy, androidx.camera.core.ImageProxy
    public int getWidth() {
        return this.f10975f;
    }

    @Override // androidx.camera.core.ForwardingImageProxy, androidx.camera.core.ImageProxy
    public void setCropRect(@Nullable Rect rect) {
        if (rect != null) {
            Rect rect2 = new Rect(rect);
            if (!rect2.intersect(0, 0, getWidth(), getHeight())) {
                rect2.setEmpty();
            }
            rect = rect2;
        }
        synchronized (this.f10972c) {
            this.f10974e = rect;
        }
    }

    public SettableImageProxy(@NonNull ImageProxy imageProxy, @Nullable Size size, @NonNull ImageInfo imageInfo) {
        super(imageProxy);
        this.f10972c = new Object();
        if (size == null) {
            this.f10975f = super.getWidth();
            this.f10976g = super.getHeight();
        } else {
            this.f10975f = size.getWidth();
            this.f10976g = size.getHeight();
        }
        this.f10973d = imageInfo;
    }
}
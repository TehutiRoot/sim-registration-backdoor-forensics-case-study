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
    public final Object f10884c;

    /* renamed from: d */
    public final ImageInfo f10885d;

    /* renamed from: e */
    public Rect f10886e;

    /* renamed from: f */
    public final int f10887f;

    /* renamed from: g */
    public final int f10888g;

    public SettableImageProxy(ImageProxy imageProxy, ImageInfo imageInfo) {
        this(imageProxy, null, imageInfo);
    }

    @Override // androidx.camera.core.ForwardingImageProxy, androidx.camera.core.ImageProxy
    @NonNull
    public Rect getCropRect() {
        synchronized (this.f10884c) {
            try {
                if (this.f10886e == null) {
                    return new Rect(0, 0, getWidth(), getHeight());
                }
                return new Rect(this.f10886e);
            } catch (Throwable th2) {
                throw th2;
            }
        }
    }

    @Override // androidx.camera.core.ForwardingImageProxy, androidx.camera.core.ImageProxy
    public int getHeight() {
        return this.f10888g;
    }

    @Override // androidx.camera.core.ForwardingImageProxy, androidx.camera.core.ImageProxy
    @NonNull
    public ImageInfo getImageInfo() {
        return this.f10885d;
    }

    @Override // androidx.camera.core.ForwardingImageProxy, androidx.camera.core.ImageProxy
    public int getWidth() {
        return this.f10887f;
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
        synchronized (this.f10884c) {
            this.f10886e = rect;
        }
    }

    public SettableImageProxy(@NonNull ImageProxy imageProxy, @Nullable Size size, @NonNull ImageInfo imageInfo) {
        super(imageProxy);
        this.f10884c = new Object();
        if (size == null) {
            this.f10887f = super.getWidth();
            this.f10888g = super.getHeight();
        } else {
            this.f10887f = size.getWidth();
            this.f10888g = size.getHeight();
        }
        this.f10885d = imageInfo;
    }
}

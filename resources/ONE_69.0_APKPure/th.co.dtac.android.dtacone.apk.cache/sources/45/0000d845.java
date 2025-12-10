package jp.wasabeef.glide.transformations.gpu;

import android.graphics.PointF;
import androidx.annotation.NonNull;
import com.bumptech.glide.load.Key;
import java.security.MessageDigest;
import jp.co.cyberagent.android.gpuimage.filter.GPUImageSwirlFilter;

/* loaded from: classes5.dex */
public class SwirlFilterTransformation extends GPUFilterTransformation {

    /* renamed from: c */
    public float f67784c;

    /* renamed from: d */
    public float f67785d;

    /* renamed from: e */
    public PointF f67786e;

    public SwirlFilterTransformation() {
        this(0.5f, 1.0f, new PointF(0.5f, 0.5f));
    }

    @Override // jp.wasabeef.glide.transformations.gpu.GPUFilterTransformation, jp.wasabeef.glide.transformations.BitmapTransformation, com.bumptech.glide.load.Key
    public boolean equals(Object obj) {
        if (obj instanceof SwirlFilterTransformation) {
            SwirlFilterTransformation swirlFilterTransformation = (SwirlFilterTransformation) obj;
            float f = swirlFilterTransformation.f67784c;
            float f2 = this.f67784c;
            if (f == f2 && swirlFilterTransformation.f67785d == f2) {
                PointF pointF = swirlFilterTransformation.f67786e;
                PointF pointF2 = this.f67786e;
                if (pointF.equals(pointF2.x, pointF2.y)) {
                    return true;
                }
            }
        }
        return false;
    }

    @Override // jp.wasabeef.glide.transformations.gpu.GPUFilterTransformation, jp.wasabeef.glide.transformations.BitmapTransformation, com.bumptech.glide.load.Key
    public int hashCode() {
        return (-981084566) + ((int) (this.f67784c * 1000.0f)) + ((int) (this.f67785d * 10.0f)) + this.f67786e.hashCode();
    }

    @Override // jp.wasabeef.glide.transformations.gpu.GPUFilterTransformation
    public String toString() {
        return "SwirlFilterTransformation(radius=" + this.f67784c + ",angle=" + this.f67785d + ",center=" + this.f67786e.toString() + ")";
    }

    @Override // jp.wasabeef.glide.transformations.gpu.GPUFilterTransformation, jp.wasabeef.glide.transformations.BitmapTransformation, com.bumptech.glide.load.Key
    public void updateDiskCacheKey(@NonNull MessageDigest messageDigest) {
        messageDigest.update(("jp.wasabeef.glide.transformations.gpu.SwirlFilterTransformation.1" + this.f67784c + this.f67785d + this.f67786e.hashCode()).getBytes(Key.CHARSET));
    }

    public SwirlFilterTransformation(float f, float f2, PointF pointF) {
        super(new GPUImageSwirlFilter());
        this.f67784c = f;
        this.f67785d = f2;
        this.f67786e = pointF;
        GPUImageSwirlFilter gPUImageSwirlFilter = (GPUImageSwirlFilter) getFilter();
        gPUImageSwirlFilter.setRadius(this.f67784c);
        gPUImageSwirlFilter.setAngle(this.f67785d);
        gPUImageSwirlFilter.setCenter(this.f67786e);
    }
}
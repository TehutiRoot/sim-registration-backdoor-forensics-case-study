package jp.wasabeef.glide.transformations.gpu;

import android.graphics.PointF;
import androidx.annotation.NonNull;
import com.bumptech.glide.load.Key;
import java.security.MessageDigest;
import jp.co.cyberagent.android.gpuimage.filter.GPUImageSwirlFilter;

/* loaded from: classes5.dex */
public class SwirlFilterTransformation extends GPUFilterTransformation {

    /* renamed from: c */
    public float f67727c;

    /* renamed from: d */
    public float f67728d;

    /* renamed from: e */
    public PointF f67729e;

    public SwirlFilterTransformation() {
        this(0.5f, 1.0f, new PointF(0.5f, 0.5f));
    }

    @Override // jp.wasabeef.glide.transformations.gpu.GPUFilterTransformation, jp.wasabeef.glide.transformations.BitmapTransformation, com.bumptech.glide.load.Key
    public boolean equals(Object obj) {
        if (obj instanceof SwirlFilterTransformation) {
            SwirlFilterTransformation swirlFilterTransformation = (SwirlFilterTransformation) obj;
            float f = swirlFilterTransformation.f67727c;
            float f2 = this.f67727c;
            if (f == f2 && swirlFilterTransformation.f67728d == f2) {
                PointF pointF = swirlFilterTransformation.f67729e;
                PointF pointF2 = this.f67729e;
                if (pointF.equals(pointF2.x, pointF2.y)) {
                    return true;
                }
            }
        }
        return false;
    }

    @Override // jp.wasabeef.glide.transformations.gpu.GPUFilterTransformation, jp.wasabeef.glide.transformations.BitmapTransformation, com.bumptech.glide.load.Key
    public int hashCode() {
        return (-981084566) + ((int) (this.f67727c * 1000.0f)) + ((int) (this.f67728d * 10.0f)) + this.f67729e.hashCode();
    }

    @Override // jp.wasabeef.glide.transformations.gpu.GPUFilterTransformation
    public String toString() {
        return "SwirlFilterTransformation(radius=" + this.f67727c + ",angle=" + this.f67728d + ",center=" + this.f67729e.toString() + ")";
    }

    @Override // jp.wasabeef.glide.transformations.gpu.GPUFilterTransformation, jp.wasabeef.glide.transformations.BitmapTransformation, com.bumptech.glide.load.Key
    public void updateDiskCacheKey(@NonNull MessageDigest messageDigest) {
        messageDigest.update(("jp.wasabeef.glide.transformations.gpu.SwirlFilterTransformation.1" + this.f67727c + this.f67728d + this.f67729e.hashCode()).getBytes(Key.CHARSET));
    }

    public SwirlFilterTransformation(float f, float f2, PointF pointF) {
        super(new GPUImageSwirlFilter());
        this.f67727c = f;
        this.f67728d = f2;
        this.f67729e = pointF;
        GPUImageSwirlFilter gPUImageSwirlFilter = (GPUImageSwirlFilter) getFilter();
        gPUImageSwirlFilter.setRadius(this.f67727c);
        gPUImageSwirlFilter.setAngle(this.f67728d);
        gPUImageSwirlFilter.setCenter(this.f67729e);
    }
}

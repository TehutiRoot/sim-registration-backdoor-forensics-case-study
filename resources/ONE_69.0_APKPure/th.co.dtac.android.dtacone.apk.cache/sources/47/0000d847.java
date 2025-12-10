package jp.wasabeef.glide.transformations.gpu;

import android.graphics.PointF;
import androidx.annotation.NonNull;
import com.bumptech.glide.load.Key;
import java.security.MessageDigest;
import java.util.Arrays;
import jp.co.cyberagent.android.gpuimage.filter.GPUImageVignetteFilter;

/* loaded from: classes5.dex */
public class VignetteFilterTransformation extends GPUFilterTransformation {

    /* renamed from: c */
    public PointF f67789c;

    /* renamed from: d */
    public float[] f67790d;

    /* renamed from: e */
    public float f67791e;

    /* renamed from: f */
    public float f67792f;

    public VignetteFilterTransformation() {
        this(new PointF(0.5f, 0.5f), new float[]{0.0f, 0.0f, 0.0f}, 0.0f, 0.75f);
    }

    @Override // jp.wasabeef.glide.transformations.gpu.GPUFilterTransformation, jp.wasabeef.glide.transformations.BitmapTransformation, com.bumptech.glide.load.Key
    public boolean equals(Object obj) {
        if (obj instanceof VignetteFilterTransformation) {
            VignetteFilterTransformation vignetteFilterTransformation = (VignetteFilterTransformation) obj;
            PointF pointF = vignetteFilterTransformation.f67789c;
            PointF pointF2 = this.f67789c;
            if (pointF.equals(pointF2.x, pointF2.y) && Arrays.equals(vignetteFilterTransformation.f67790d, this.f67790d) && vignetteFilterTransformation.f67791e == this.f67791e && vignetteFilterTransformation.f67792f == this.f67792f) {
                return true;
            }
        }
        return false;
    }

    @Override // jp.wasabeef.glide.transformations.gpu.GPUFilterTransformation, jp.wasabeef.glide.transformations.BitmapTransformation, com.bumptech.glide.load.Key
    public int hashCode() {
        return 1874002103 + this.f67789c.hashCode() + Arrays.hashCode(this.f67790d) + ((int) (this.f67791e * 100.0f)) + ((int) (this.f67792f * 10.0f));
    }

    @Override // jp.wasabeef.glide.transformations.gpu.GPUFilterTransformation
    public String toString() {
        return "VignetteFilterTransformation(center=" + this.f67789c.toString() + ",color=" + Arrays.toString(this.f67790d) + ",start=" + this.f67791e + ",end=" + this.f67792f + ")";
    }

    @Override // jp.wasabeef.glide.transformations.gpu.GPUFilterTransformation, jp.wasabeef.glide.transformations.BitmapTransformation, com.bumptech.glide.load.Key
    public void updateDiskCacheKey(@NonNull MessageDigest messageDigest) {
        messageDigest.update(("jp.wasabeef.glide.transformations.gpu.VignetteFilterTransformation.1" + this.f67789c + Arrays.hashCode(this.f67790d) + this.f67791e + this.f67792f).getBytes(Key.CHARSET));
    }

    public VignetteFilterTransformation(PointF pointF, float[] fArr, float f, float f2) {
        super(new GPUImageVignetteFilter());
        this.f67789c = pointF;
        this.f67790d = fArr;
        this.f67791e = f;
        this.f67792f = f2;
        GPUImageVignetteFilter gPUImageVignetteFilter = (GPUImageVignetteFilter) getFilter();
        gPUImageVignetteFilter.setVignetteCenter(this.f67789c);
        gPUImageVignetteFilter.setVignetteColor(this.f67790d);
        gPUImageVignetteFilter.setVignetteStart(this.f67791e);
        gPUImageVignetteFilter.setVignetteEnd(this.f67792f);
    }
}
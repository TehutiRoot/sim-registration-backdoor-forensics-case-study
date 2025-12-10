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
    public PointF f67732c;

    /* renamed from: d */
    public float[] f67733d;

    /* renamed from: e */
    public float f67734e;

    /* renamed from: f */
    public float f67735f;

    public VignetteFilterTransformation() {
        this(new PointF(0.5f, 0.5f), new float[]{0.0f, 0.0f, 0.0f}, 0.0f, 0.75f);
    }

    @Override // jp.wasabeef.glide.transformations.gpu.GPUFilterTransformation, jp.wasabeef.glide.transformations.BitmapTransformation, com.bumptech.glide.load.Key
    public boolean equals(Object obj) {
        if (obj instanceof VignetteFilterTransformation) {
            VignetteFilterTransformation vignetteFilterTransformation = (VignetteFilterTransformation) obj;
            PointF pointF = vignetteFilterTransformation.f67732c;
            PointF pointF2 = this.f67732c;
            if (pointF.equals(pointF2.x, pointF2.y) && Arrays.equals(vignetteFilterTransformation.f67733d, this.f67733d) && vignetteFilterTransformation.f67734e == this.f67734e && vignetteFilterTransformation.f67735f == this.f67735f) {
                return true;
            }
        }
        return false;
    }

    @Override // jp.wasabeef.glide.transformations.gpu.GPUFilterTransformation, jp.wasabeef.glide.transformations.BitmapTransformation, com.bumptech.glide.load.Key
    public int hashCode() {
        return 1874002103 + this.f67732c.hashCode() + Arrays.hashCode(this.f67733d) + ((int) (this.f67734e * 100.0f)) + ((int) (this.f67735f * 10.0f));
    }

    @Override // jp.wasabeef.glide.transformations.gpu.GPUFilterTransformation
    public String toString() {
        return "VignetteFilterTransformation(center=" + this.f67732c.toString() + ",color=" + Arrays.toString(this.f67733d) + ",start=" + this.f67734e + ",end=" + this.f67735f + ")";
    }

    @Override // jp.wasabeef.glide.transformations.gpu.GPUFilterTransformation, jp.wasabeef.glide.transformations.BitmapTransformation, com.bumptech.glide.load.Key
    public void updateDiskCacheKey(@NonNull MessageDigest messageDigest) {
        messageDigest.update(("jp.wasabeef.glide.transformations.gpu.VignetteFilterTransformation.1" + this.f67732c + Arrays.hashCode(this.f67733d) + this.f67734e + this.f67735f).getBytes(Key.CHARSET));
    }

    public VignetteFilterTransformation(PointF pointF, float[] fArr, float f, float f2) {
        super(new GPUImageVignetteFilter());
        this.f67732c = pointF;
        this.f67733d = fArr;
        this.f67734e = f;
        this.f67735f = f2;
        GPUImageVignetteFilter gPUImageVignetteFilter = (GPUImageVignetteFilter) getFilter();
        gPUImageVignetteFilter.setVignetteCenter(this.f67732c);
        gPUImageVignetteFilter.setVignetteColor(this.f67733d);
        gPUImageVignetteFilter.setVignetteStart(this.f67734e);
        gPUImageVignetteFilter.setVignetteEnd(this.f67735f);
    }
}

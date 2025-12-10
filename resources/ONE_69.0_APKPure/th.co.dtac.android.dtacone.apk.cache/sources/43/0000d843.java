package jp.wasabeef.glide.transformations.gpu;

import androidx.annotation.NonNull;
import com.bumptech.glide.load.Key;
import java.security.MessageDigest;
import jp.co.cyberagent.android.gpuimage.filter.GPUImageSepiaToneFilter;

/* loaded from: classes5.dex */
public class SepiaFilterTransformation extends GPUFilterTransformation {

    /* renamed from: c */
    public float f67783c;

    public SepiaFilterTransformation() {
        this(1.0f);
    }

    @Override // jp.wasabeef.glide.transformations.gpu.GPUFilterTransformation, jp.wasabeef.glide.transformations.BitmapTransformation, com.bumptech.glide.load.Key
    public boolean equals(Object obj) {
        return obj instanceof SepiaFilterTransformation;
    }

    @Override // jp.wasabeef.glide.transformations.gpu.GPUFilterTransformation, jp.wasabeef.glide.transformations.BitmapTransformation, com.bumptech.glide.load.Key
    public int hashCode() {
        return 895516065 + ((int) (this.f67783c * 10.0f));
    }

    @Override // jp.wasabeef.glide.transformations.gpu.GPUFilterTransformation
    public String toString() {
        return "SepiaFilterTransformation(intensity=" + this.f67783c + ")";
    }

    @Override // jp.wasabeef.glide.transformations.gpu.GPUFilterTransformation, jp.wasabeef.glide.transformations.BitmapTransformation, com.bumptech.glide.load.Key
    public void updateDiskCacheKey(@NonNull MessageDigest messageDigest) {
        messageDigest.update(("jp.wasabeef.glide.transformations.gpu.SepiaFilterTransformation.1" + this.f67783c).getBytes(Key.CHARSET));
    }

    public SepiaFilterTransformation(float f) {
        super(new GPUImageSepiaToneFilter());
        this.f67783c = f;
        ((GPUImageSepiaToneFilter) getFilter()).setIntensity(this.f67783c);
    }
}
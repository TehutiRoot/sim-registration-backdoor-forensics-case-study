package jp.wasabeef.glide.transformations.gpu;

import androidx.annotation.NonNull;
import com.bumptech.glide.load.Key;
import java.security.MessageDigest;
import jp.co.cyberagent.android.gpuimage.filter.GPUImageToonFilter;

/* loaded from: classes5.dex */
public class ToonFilterTransformation extends GPUFilterTransformation {

    /* renamed from: c */
    public float f67730c;

    /* renamed from: d */
    public float f67731d;

    public ToonFilterTransformation() {
        this(0.2f, 10.0f);
    }

    @Override // jp.wasabeef.glide.transformations.gpu.GPUFilterTransformation, jp.wasabeef.glide.transformations.BitmapTransformation, com.bumptech.glide.load.Key
    public boolean equals(Object obj) {
        if (obj instanceof ToonFilterTransformation) {
            ToonFilterTransformation toonFilterTransformation = (ToonFilterTransformation) obj;
            if (toonFilterTransformation.f67730c == this.f67730c && toonFilterTransformation.f67731d == this.f67731d) {
                return true;
            }
        }
        return false;
    }

    @Override // jp.wasabeef.glide.transformations.gpu.GPUFilterTransformation, jp.wasabeef.glide.transformations.BitmapTransformation, com.bumptech.glide.load.Key
    public int hashCode() {
        return 1209810327 + ((int) (this.f67730c * 1000.0f)) + ((int) (this.f67731d * 10.0f));
    }

    @Override // jp.wasabeef.glide.transformations.gpu.GPUFilterTransformation
    public String toString() {
        return "ToonFilterTransformation(threshold=" + this.f67730c + ",quantizationLevels=" + this.f67731d + ")";
    }

    @Override // jp.wasabeef.glide.transformations.gpu.GPUFilterTransformation, jp.wasabeef.glide.transformations.BitmapTransformation, com.bumptech.glide.load.Key
    public void updateDiskCacheKey(@NonNull MessageDigest messageDigest) {
        messageDigest.update(("jp.wasabeef.glide.transformations.gpu.ToonFilterTransformation.1" + this.f67730c + this.f67731d).getBytes(Key.CHARSET));
    }

    public ToonFilterTransformation(float f, float f2) {
        super(new GPUImageToonFilter());
        this.f67730c = f;
        this.f67731d = f2;
        GPUImageToonFilter gPUImageToonFilter = (GPUImageToonFilter) getFilter();
        gPUImageToonFilter.setThreshold(this.f67730c);
        gPUImageToonFilter.setQuantizationLevels(this.f67731d);
    }
}

package jp.wasabeef.glide.transformations.gpu;

import android.content.Context;
import android.graphics.Bitmap;
import androidx.annotation.NonNull;
import com.bumptech.glide.load.Key;
import com.bumptech.glide.load.engine.bitmap_recycle.BitmapPool;
import java.security.MessageDigest;
import jp.co.cyberagent.android.gpuimage.filter.GPUImageFilter;
import jp.p022co.cyberagent.android.gpuimage.GPUImage;
import jp.wasabeef.glide.transformations.BitmapTransformation;

/* loaded from: classes5.dex */
public class GPUFilterTransformation extends BitmapTransformation {

    /* renamed from: b */
    public static final byte[] f67722b = "jp.wasabeef.glide.transformations.gpu.GPUFilterTransformation.1".getBytes(Key.CHARSET);

    /* renamed from: a */
    public GPUImageFilter f67723a;

    public GPUFilterTransformation(GPUImageFilter gPUImageFilter) {
        this.f67723a = gPUImageFilter;
    }

    @Override // jp.wasabeef.glide.transformations.BitmapTransformation, com.bumptech.glide.load.Key
    public boolean equals(Object obj) {
        return obj instanceof GPUFilterTransformation;
    }

    public <T> T getFilter() {
        return (T) this.f67723a;
    }

    @Override // jp.wasabeef.glide.transformations.BitmapTransformation, com.bumptech.glide.load.Key
    public int hashCode() {
        return 1751294359;
    }

    public String toString() {
        return getClass().getSimpleName();
    }

    @Override // jp.wasabeef.glide.transformations.BitmapTransformation
    public Bitmap transform(@NonNull Context context, @NonNull BitmapPool bitmapPool, @NonNull Bitmap bitmap, int i, int i2) {
        GPUImage gPUImage = new GPUImage(context);
        gPUImage.setImage(bitmap);
        gPUImage.setFilter(this.f67723a);
        return gPUImage.getBitmapWithFilterApplied();
    }

    @Override // jp.wasabeef.glide.transformations.BitmapTransformation, com.bumptech.glide.load.Key
    public void updateDiskCacheKey(@NonNull MessageDigest messageDigest) {
        messageDigest.update(f67722b);
    }
}

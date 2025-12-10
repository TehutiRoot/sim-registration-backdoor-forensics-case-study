package com.bumptech.glide.load.resource.bitmap;

import android.content.Context;
import android.graphics.Bitmap;
import android.graphics.drawable.BitmapDrawable;
import android.graphics.drawable.Drawable;
import androidx.annotation.NonNull;
import com.bumptech.glide.Glide;
import com.bumptech.glide.load.Transformation;
import com.bumptech.glide.load.engine.Resource;
import com.bumptech.glide.load.engine.bitmap_recycle.BitmapPool;
import java.security.MessageDigest;

/* loaded from: classes3.dex */
public class DrawableTransformation implements Transformation<Drawable> {

    /* renamed from: a */
    public final Transformation f42329a;

    /* renamed from: b */
    public final boolean f42330b;

    public DrawableTransformation(Transformation<Bitmap> transformation, boolean z) {
        this.f42329a = transformation;
        this.f42330b = z;
    }

    /* renamed from: a */
    public final Resource m50211a(Context context, Resource resource) {
        return LazyBitmapDrawableResource.obtain(context.getResources(), resource);
    }

    public Transformation<BitmapDrawable> asBitmapDrawable() {
        return this;
    }

    @Override // com.bumptech.glide.load.Key
    public boolean equals(Object obj) {
        if (obj instanceof DrawableTransformation) {
            return this.f42329a.equals(((DrawableTransformation) obj).f42329a);
        }
        return false;
    }

    @Override // com.bumptech.glide.load.Key
    public int hashCode() {
        return this.f42329a.hashCode();
    }

    @Override // com.bumptech.glide.load.Transformation
    @NonNull
    public Resource<Drawable> transform(@NonNull Context context, @NonNull Resource<Drawable> resource, int i, int i2) {
        BitmapPool bitmapPool = Glide.get(context).getBitmapPool();
        Drawable drawable = resource.get();
        Resource m23700a = AbstractC13077pK.m23700a(bitmapPool, drawable, i, i2);
        if (m23700a == null) {
            if (!this.f42330b) {
                return resource;
            }
            throw new IllegalArgumentException("Unable to convert " + drawable + " to a Bitmap");
        }
        Resource transform = this.f42329a.transform(context, m23700a, i, i2);
        if (transform.equals(m23700a)) {
            transform.recycle();
            return resource;
        }
        return m50211a(context, transform);
    }

    @Override // com.bumptech.glide.load.Key
    public void updateDiskCacheKey(@NonNull MessageDigest messageDigest) {
        this.f42329a.updateDiskCacheKey(messageDigest);
    }
}

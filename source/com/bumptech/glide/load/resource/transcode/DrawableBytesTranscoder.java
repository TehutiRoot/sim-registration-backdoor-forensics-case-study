package com.bumptech.glide.load.resource.transcode;

import android.graphics.Bitmap;
import android.graphics.drawable.BitmapDrawable;
import android.graphics.drawable.Drawable;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import com.bumptech.glide.load.Options;
import com.bumptech.glide.load.engine.Resource;
import com.bumptech.glide.load.engine.bitmap_recycle.BitmapPool;
import com.bumptech.glide.load.resource.bitmap.BitmapResource;
import com.bumptech.glide.load.resource.gif.GifDrawable;

/* loaded from: classes3.dex */
public final class DrawableBytesTranscoder implements ResourceTranscoder<Drawable, byte[]> {

    /* renamed from: a */
    public final BitmapPool f42465a;

    /* renamed from: b */
    public final ResourceTranscoder f42466b;

    /* renamed from: c */
    public final ResourceTranscoder f42467c;

    public DrawableBytesTranscoder(@NonNull BitmapPool bitmapPool, @NonNull ResourceTranscoder<Bitmap, byte[]> resourceTranscoder, @NonNull ResourceTranscoder<GifDrawable, byte[]> resourceTranscoder2) {
        this.f42465a = bitmapPool;
        this.f42466b = resourceTranscoder;
        this.f42467c = resourceTranscoder2;
    }

    /* renamed from: a */
    public static Resource m50111a(Resource resource) {
        return resource;
    }

    @Override // com.bumptech.glide.load.resource.transcode.ResourceTranscoder
    @Nullable
    public Resource<byte[]> transcode(@NonNull Resource<Drawable> resource, @NonNull Options options) {
        Drawable drawable = resource.get();
        if (drawable instanceof BitmapDrawable) {
            return this.f42466b.transcode(BitmapResource.obtain(((BitmapDrawable) drawable).getBitmap(), this.f42465a), options);
        }
        if (drawable instanceof GifDrawable) {
            return this.f42467c.transcode(m50111a(resource), options);
        }
        return null;
    }
}

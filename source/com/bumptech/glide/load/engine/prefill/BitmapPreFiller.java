package com.bumptech.glide.load.engine.prefill;

import android.graphics.Bitmap;
import com.bumptech.glide.load.DecodeFormat;
import com.bumptech.glide.load.engine.bitmap_recycle.BitmapPool;
import com.bumptech.glide.load.engine.cache.MemoryCache;
import com.bumptech.glide.load.engine.prefill.PreFillType;
import com.bumptech.glide.util.Util;
import java.util.HashMap;

/* loaded from: classes3.dex */
public final class BitmapPreFiller {

    /* renamed from: a */
    public final MemoryCache f42149a;

    /* renamed from: b */
    public final BitmapPool f42150b;

    /* renamed from: c */
    public final DecodeFormat f42151c;

    /* renamed from: d */
    public RunnableC14010tb f42152d;

    public BitmapPreFiller(MemoryCache memoryCache, BitmapPool bitmapPool, DecodeFormat decodeFormat) {
        this.f42149a = memoryCache;
        this.f42150b = bitmapPool;
        this.f42151c = decodeFormat;
    }

    /* renamed from: b */
    public static int m50317b(PreFillType preFillType) {
        return Util.getBitmapByteSize(preFillType.m50313d(), preFillType.m50315b(), preFillType.m50316a());
    }

    /* renamed from: a */
    public C17551El1 m50318a(PreFillType... preFillTypeArr) {
        long maxSize = (this.f42149a.getMaxSize() - this.f42149a.getCurrentSize()) + this.f42150b.getMaxSize();
        int i = 0;
        for (PreFillType preFillType : preFillTypeArr) {
            i += preFillType.m50314c();
        }
        float f = ((float) maxSize) / i;
        HashMap hashMap = new HashMap();
        for (PreFillType preFillType2 : preFillTypeArr) {
            hashMap.put(preFillType2, Integer.valueOf(Math.round(preFillType2.m50314c() * f) / m50317b(preFillType2)));
        }
        return new C17551El1(hashMap);
    }

    public void preFill(PreFillType.Builder... builderArr) {
        Bitmap.Config config;
        RunnableC14010tb runnableC14010tb = this.f42152d;
        if (runnableC14010tb != null) {
            runnableC14010tb.m22393b();
        }
        PreFillType[] preFillTypeArr = new PreFillType[builderArr.length];
        for (int i = 0; i < builderArr.length; i++) {
            PreFillType.Builder builder = builderArr[i];
            if (builder.m50311b() == null) {
                if (this.f42151c == DecodeFormat.PREFER_ARGB_8888) {
                    config = Bitmap.Config.ARGB_8888;
                } else {
                    config = Bitmap.Config.RGB_565;
                }
                builder.setConfig(config);
            }
            preFillTypeArr[i] = builder.m50312a();
        }
        RunnableC14010tb runnableC14010tb2 = new RunnableC14010tb(this.f42150b, this.f42149a, m50318a(preFillTypeArr));
        this.f42152d = runnableC14010tb2;
        Util.postOnUiThread(runnableC14010tb2);
    }
}

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
    public final MemoryCache f42161a;

    /* renamed from: b */
    public final BitmapPool f42162b;

    /* renamed from: c */
    public final DecodeFormat f42163c;

    /* renamed from: d */
    public RunnableC13998tb f42164d;

    public BitmapPreFiller(MemoryCache memoryCache, BitmapPool bitmapPool, DecodeFormat decodeFormat) {
        this.f42161a = memoryCache;
        this.f42162b = bitmapPool;
        this.f42163c = decodeFormat;
    }

    /* renamed from: b */
    public static int m50314b(PreFillType preFillType) {
        return Util.getBitmapByteSize(preFillType.m50310d(), preFillType.m50312b(), preFillType.m50313a());
    }

    /* renamed from: a */
    public C17386Bm1 m50315a(PreFillType... preFillTypeArr) {
        long maxSize = (this.f42161a.getMaxSize() - this.f42161a.getCurrentSize()) + this.f42162b.getMaxSize();
        int i = 0;
        for (PreFillType preFillType : preFillTypeArr) {
            i += preFillType.m50311c();
        }
        float f = ((float) maxSize) / i;
        HashMap hashMap = new HashMap();
        for (PreFillType preFillType2 : preFillTypeArr) {
            hashMap.put(preFillType2, Integer.valueOf(Math.round(preFillType2.m50311c() * f) / m50314b(preFillType2)));
        }
        return new C17386Bm1(hashMap);
    }

    public void preFill(PreFillType.Builder... builderArr) {
        Bitmap.Config config;
        RunnableC13998tb runnableC13998tb = this.f42164d;
        if (runnableC13998tb != null) {
            runnableC13998tb.m22588b();
        }
        PreFillType[] preFillTypeArr = new PreFillType[builderArr.length];
        for (int i = 0; i < builderArr.length; i++) {
            PreFillType.Builder builder = builderArr[i];
            if (builder.m50308b() == null) {
                if (this.f42163c == DecodeFormat.PREFER_ARGB_8888) {
                    config = Bitmap.Config.ARGB_8888;
                } else {
                    config = Bitmap.Config.RGB_565;
                }
                builder.setConfig(config);
            }
            preFillTypeArr[i] = builder.m50309a();
        }
        RunnableC13998tb runnableC13998tb2 = new RunnableC13998tb(this.f42162b, this.f42161a, m50315a(preFillTypeArr));
        this.f42164d = runnableC13998tb2;
        Util.postOnUiThread(runnableC13998tb2);
    }
}
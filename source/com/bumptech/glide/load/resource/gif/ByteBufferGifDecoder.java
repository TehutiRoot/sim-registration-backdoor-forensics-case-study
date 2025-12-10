package com.bumptech.glide.load.resource.gif;

import android.content.Context;
import android.graphics.Bitmap;
import android.util.Log;
import androidx.annotation.NonNull;
import com.bumptech.glide.Glide;
import com.bumptech.glide.gifdecoder.GifDecoder;
import com.bumptech.glide.gifdecoder.GifHeader;
import com.bumptech.glide.gifdecoder.GifHeaderParser;
import com.bumptech.glide.gifdecoder.StandardGifDecoder;
import com.bumptech.glide.load.DecodeFormat;
import com.bumptech.glide.load.ImageHeaderParser;
import com.bumptech.glide.load.ImageHeaderParserUtils;
import com.bumptech.glide.load.Options;
import com.bumptech.glide.load.ResourceDecoder;
import com.bumptech.glide.load.engine.bitmap_recycle.ArrayPool;
import com.bumptech.glide.load.engine.bitmap_recycle.BitmapPool;
import com.bumptech.glide.load.resource.UnitTransformation;
import com.bumptech.glide.util.LogTime;
import com.bumptech.glide.util.Util;
import java.io.IOException;
import java.nio.ByteBuffer;
import java.util.List;
import java.util.Queue;

/* loaded from: classes3.dex */
public class ByteBufferGifDecoder implements ResourceDecoder<ByteBuffer, GifDrawable> {

    /* renamed from: f */
    public static final C5891a f42412f = new C5891a();

    /* renamed from: g */
    public static final C5892b f42413g = new C5892b();

    /* renamed from: a */
    public final Context f42414a;

    /* renamed from: b */
    public final List f42415b;

    /* renamed from: c */
    public final C5892b f42416c;

    /* renamed from: d */
    public final C5891a f42417d;

    /* renamed from: e */
    public final GifBitmapProvider f42418e;

    /* renamed from: com.bumptech.glide.load.resource.gif.ByteBufferGifDecoder$a */
    /* loaded from: classes3.dex */
    public static class C5891a {
        /* renamed from: a */
        public GifDecoder m50145a(GifDecoder.BitmapProvider bitmapProvider, GifHeader gifHeader, ByteBuffer byteBuffer, int i) {
            return new StandardGifDecoder(bitmapProvider, gifHeader, byteBuffer, i);
        }
    }

    /* renamed from: com.bumptech.glide.load.resource.gif.ByteBufferGifDecoder$b */
    /* loaded from: classes3.dex */
    public static class C5892b {

        /* renamed from: a */
        public final Queue f42419a = Util.createQueue(0);

        /* renamed from: a */
        public synchronized GifHeaderParser m50144a(ByteBuffer byteBuffer) {
            GifHeaderParser gifHeaderParser;
            try {
                gifHeaderParser = (GifHeaderParser) this.f42419a.poll();
                if (gifHeaderParser == null) {
                    gifHeaderParser = new GifHeaderParser();
                }
            } catch (Throwable th2) {
                throw th2;
            }
            return gifHeaderParser.setData(byteBuffer);
        }

        /* renamed from: b */
        public synchronized void m50143b(GifHeaderParser gifHeaderParser) {
            gifHeaderParser.clear();
            this.f42419a.offer(gifHeaderParser);
        }
    }

    public ByteBufferGifDecoder(Context context) {
        this(context, Glide.get(context).getRegistry().getImageHeaderParsers(), Glide.get(context).getBitmapPool(), Glide.get(context).getArrayPool());
    }

    /* renamed from: b */
    public static int m50146b(GifHeader gifHeader, int i, int i2) {
        int highestOneBit;
        int min = Math.min(gifHeader.getHeight() / i2, gifHeader.getWidth() / i);
        if (min == 0) {
            highestOneBit = 0;
        } else {
            highestOneBit = Integer.highestOneBit(min);
        }
        int max = Math.max(1, highestOneBit);
        if (Log.isLoggable("BufferGifDecoder", 2) && max > 1) {
            StringBuilder sb = new StringBuilder();
            sb.append("Downsampling GIF, sampleSize: ");
            sb.append(max);
            sb.append(", target dimens: [");
            sb.append(i);
            sb.append("x");
            sb.append(i2);
            sb.append("], actual dimens: [");
            sb.append(gifHeader.getWidth());
            sb.append("x");
            sb.append(gifHeader.getHeight());
            sb.append("]");
        }
        return max;
    }

    /* renamed from: a */
    public final GifDrawableResource m50147a(ByteBuffer byteBuffer, int i, int i2, GifHeaderParser gifHeaderParser, Options options) {
        Bitmap.Config config;
        long logTime = LogTime.getLogTime();
        try {
            GifHeader parseHeader = gifHeaderParser.parseHeader();
            if (parseHeader.getNumFrames() > 0 && parseHeader.getStatus() == 0) {
                if (options.get(GifOptions.DECODE_FORMAT) == DecodeFormat.PREFER_RGB_565) {
                    config = Bitmap.Config.RGB_565;
                } else {
                    config = Bitmap.Config.ARGB_8888;
                }
                GifDecoder m50145a = this.f42417d.m50145a(this.f42418e, parseHeader, byteBuffer, m50146b(parseHeader, i, i2));
                m50145a.setDefaultBitmapConfig(config);
                m50145a.advance();
                Bitmap nextFrame = m50145a.getNextFrame();
                if (nextFrame == null) {
                    if (Log.isLoggable("BufferGifDecoder", 2)) {
                        StringBuilder sb = new StringBuilder();
                        sb.append("Decoded GIF from stream in ");
                        sb.append(LogTime.getElapsedMillis(logTime));
                    }
                    return null;
                }
                GifDrawableResource gifDrawableResource = new GifDrawableResource(new GifDrawable(this.f42414a, m50145a, UnitTransformation.get(), i, i2, nextFrame));
                if (Log.isLoggable("BufferGifDecoder", 2)) {
                    StringBuilder sb2 = new StringBuilder();
                    sb2.append("Decoded GIF from stream in ");
                    sb2.append(LogTime.getElapsedMillis(logTime));
                }
                return gifDrawableResource;
            }
            return null;
        } finally {
            if (Log.isLoggable("BufferGifDecoder", 2)) {
                StringBuilder sb3 = new StringBuilder();
                sb3.append("Decoded GIF from stream in ");
                sb3.append(LogTime.getElapsedMillis(logTime));
            }
        }
    }

    @Override // com.bumptech.glide.load.ResourceDecoder
    public GifDrawableResource decode(@NonNull ByteBuffer byteBuffer, int i, int i2, @NonNull Options options) {
        GifHeaderParser m50144a = this.f42416c.m50144a(byteBuffer);
        try {
            return m50147a(byteBuffer, i, i2, m50144a, options);
        } finally {
            this.f42416c.m50143b(m50144a);
        }
    }

    @Override // com.bumptech.glide.load.ResourceDecoder
    public boolean handles(@NonNull ByteBuffer byteBuffer, @NonNull Options options) throws IOException {
        return !((Boolean) options.get(GifOptions.DISABLE_ANIMATION)).booleanValue() && ImageHeaderParserUtils.getType(this.f42415b, byteBuffer) == ImageHeaderParser.ImageType.GIF;
    }

    public ByteBufferGifDecoder(Context context, List<ImageHeaderParser> list, BitmapPool bitmapPool, ArrayPool arrayPool) {
        this(context, list, bitmapPool, arrayPool, f42413g, f42412f);
    }

    public ByteBufferGifDecoder(Context context, List list, BitmapPool bitmapPool, ArrayPool arrayPool, C5892b c5892b, C5891a c5891a) {
        this.f42414a = context.getApplicationContext();
        this.f42415b = list;
        this.f42417d = c5891a;
        this.f42418e = new GifBitmapProvider(bitmapPool, arrayPool);
        this.f42416c = c5892b;
    }
}

package com.bumptech.glide.load.resource.drawable;

import android.graphics.Bitmap;
import android.graphics.ImageDecoder;
import android.graphics.drawable.AnimatedImageDrawable;
import android.graphics.drawable.Drawable;
import android.os.Build;
import androidx.annotation.RequiresApi;
import com.bumptech.glide.load.ImageHeaderParser;
import com.bumptech.glide.load.ImageHeaderParserUtils;
import com.bumptech.glide.load.Options;
import com.bumptech.glide.load.ResourceDecoder;
import com.bumptech.glide.load.engine.Resource;
import com.bumptech.glide.load.engine.bitmap_recycle.ArrayPool;
import com.bumptech.glide.load.resource.DefaultOnHeaderDecodedListener;
import com.bumptech.glide.util.ByteBufferUtil;
import com.bumptech.glide.util.Util;
import java.io.IOException;
import java.io.InputStream;
import java.nio.ByteBuffer;
import java.util.List;

@RequiresApi(28)
/* loaded from: classes3.dex */
public final class AnimatedImageDecoder {

    /* renamed from: a */
    public final List f42400a;

    /* renamed from: b */
    public final ArrayPool f42401b;

    /* renamed from: com.bumptech.glide.load.resource.drawable.AnimatedImageDecoder$a */
    /* loaded from: classes3.dex */
    public static final class C5885a implements Resource {

        /* renamed from: a */
        public final AnimatedImageDrawable f42402a;

        public C5885a(AnimatedImageDrawable animatedImageDrawable) {
            this.f42402a = animatedImageDrawable;
        }

        @Override // com.bumptech.glide.load.engine.Resource
        /* renamed from: a */
        public AnimatedImageDrawable get() {
            return this.f42402a;
        }

        @Override // com.bumptech.glide.load.engine.Resource
        public Class getResourceClass() {
            return Drawable.class;
        }

        @Override // com.bumptech.glide.load.engine.Resource
        public int getSize() {
            int intrinsicWidth;
            int intrinsicHeight;
            intrinsicWidth = this.f42402a.getIntrinsicWidth();
            intrinsicHeight = this.f42402a.getIntrinsicHeight();
            return intrinsicWidth * intrinsicHeight * Util.getBytesPerPixel(Bitmap.Config.ARGB_8888) * 2;
        }

        @Override // com.bumptech.glide.load.engine.Resource
        public void recycle() {
            this.f42402a.stop();
            this.f42402a.clearAnimationCallbacks();
        }
    }

    /* renamed from: com.bumptech.glide.load.resource.drawable.AnimatedImageDecoder$b */
    /* loaded from: classes3.dex */
    public static final class C5886b implements ResourceDecoder {

        /* renamed from: a */
        public final AnimatedImageDecoder f42403a;

        public C5886b(AnimatedImageDecoder animatedImageDecoder) {
            this.f42403a = animatedImageDecoder;
        }

        @Override // com.bumptech.glide.load.ResourceDecoder
        /* renamed from: a */
        public Resource decode(ByteBuffer byteBuffer, int i, int i2, Options options) {
            ImageDecoder.Source createSource;
            createSource = ImageDecoder.createSource(byteBuffer);
            return this.f42403a.m50172a(createSource, i, i2, options);
        }

        @Override // com.bumptech.glide.load.ResourceDecoder
        /* renamed from: b */
        public boolean handles(ByteBuffer byteBuffer, Options options) {
            return this.f42403a.m50170c(byteBuffer);
        }
    }

    /* renamed from: com.bumptech.glide.load.resource.drawable.AnimatedImageDecoder$c */
    /* loaded from: classes3.dex */
    public static final class C5887c implements ResourceDecoder {

        /* renamed from: a */
        public final AnimatedImageDecoder f42404a;

        public C5887c(AnimatedImageDecoder animatedImageDecoder) {
            this.f42404a = animatedImageDecoder;
        }

        @Override // com.bumptech.glide.load.ResourceDecoder
        /* renamed from: a */
        public Resource decode(InputStream inputStream, int i, int i2, Options options) {
            ImageDecoder.Source createSource;
            createSource = ImageDecoder.createSource(ByteBufferUtil.fromStream(inputStream));
            return this.f42404a.m50172a(createSource, i, i2, options);
        }

        @Override // com.bumptech.glide.load.ResourceDecoder
        /* renamed from: b */
        public boolean handles(InputStream inputStream, Options options) {
            return this.f42404a.m50171b(inputStream);
        }
    }

    public AnimatedImageDecoder(List list, ArrayPool arrayPool) {
        this.f42400a = list;
        this.f42401b = arrayPool;
    }

    public static ResourceDecoder<ByteBuffer, Drawable> byteBufferDecoder(List<ImageHeaderParser> list, ArrayPool arrayPool) {
        return new C5886b(new AnimatedImageDecoder(list, arrayPool));
    }

    public static ResourceDecoder<InputStream, Drawable> streamDecoder(List<ImageHeaderParser> list, ArrayPool arrayPool) {
        return new C5887c(new AnimatedImageDecoder(list, arrayPool));
    }

    /* renamed from: a */
    public Resource m50172a(ImageDecoder.Source source, int i, int i2, Options options) {
        Drawable decodeDrawable;
        decodeDrawable = ImageDecoder.decodeDrawable(source, new DefaultOnHeaderDecodedListener(i, i2, options));
        if (AbstractC17096y4.m346a(decodeDrawable)) {
            return new C5885a(AbstractC17170z4.m137a(decodeDrawable));
        }
        throw new IOException("Received unexpected drawable type for animated image, failing: " + decodeDrawable);
    }

    /* renamed from: b */
    public boolean m50171b(InputStream inputStream) {
        return m50169d(ImageHeaderParserUtils.getType(this.f42400a, inputStream, this.f42401b));
    }

    /* renamed from: c */
    public boolean m50170c(ByteBuffer byteBuffer) {
        return m50169d(ImageHeaderParserUtils.getType(this.f42400a, byteBuffer));
    }

    /* renamed from: d */
    public final boolean m50169d(ImageHeaderParser.ImageType imageType) {
        if (imageType != ImageHeaderParser.ImageType.ANIMATED_WEBP && (Build.VERSION.SDK_INT < 31 || imageType != ImageHeaderParser.ImageType.ANIMATED_AVIF)) {
            return false;
        }
        return true;
    }
}

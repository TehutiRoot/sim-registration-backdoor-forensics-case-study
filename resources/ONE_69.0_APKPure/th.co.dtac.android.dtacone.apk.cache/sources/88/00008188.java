package com.bumptech.glide.load.resource.drawable;

import android.graphics.Bitmap;
import android.graphics.ImageDecoder;
import android.graphics.drawable.AnimatedImageDrawable;
import android.graphics.drawable.Drawable;
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
@Deprecated
/* loaded from: classes3.dex */
public final class AnimatedWebpDecoder {

    /* renamed from: a */
    public final List f42417a;

    /* renamed from: b */
    public final ArrayPool f42418b;

    /* renamed from: com.bumptech.glide.load.resource.drawable.AnimatedWebpDecoder$a */
    /* loaded from: classes3.dex */
    public static final class C5877a implements Resource {

        /* renamed from: a */
        public final AnimatedImageDrawable f42419a;

        public C5877a(AnimatedImageDrawable animatedImageDrawable) {
            this.f42419a = animatedImageDrawable;
        }

        @Override // com.bumptech.glide.load.engine.Resource
        /* renamed from: a */
        public AnimatedImageDrawable get() {
            return this.f42419a;
        }

        @Override // com.bumptech.glide.load.engine.Resource
        public Class getResourceClass() {
            return Drawable.class;
        }

        @Override // com.bumptech.glide.load.engine.Resource
        public int getSize() {
            int intrinsicWidth;
            int intrinsicHeight;
            intrinsicWidth = this.f42419a.getIntrinsicWidth();
            intrinsicHeight = this.f42419a.getIntrinsicHeight();
            return intrinsicWidth * intrinsicHeight * Util.getBytesPerPixel(Bitmap.Config.ARGB_8888) * 2;
        }

        @Override // com.bumptech.glide.load.engine.Resource
        public void recycle() {
            this.f42419a.stop();
            this.f42419a.clearAnimationCallbacks();
        }
    }

    /* renamed from: com.bumptech.glide.load.resource.drawable.AnimatedWebpDecoder$b */
    /* loaded from: classes3.dex */
    public static final class C5878b implements ResourceDecoder {

        /* renamed from: a */
        public final AnimatedWebpDecoder f42420a;

        public C5878b(AnimatedWebpDecoder animatedWebpDecoder) {
            this.f42420a = animatedWebpDecoder;
        }

        @Override // com.bumptech.glide.load.ResourceDecoder
        /* renamed from: a */
        public Resource decode(ByteBuffer byteBuffer, int i, int i2, Options options) {
            ImageDecoder.Source createSource;
            createSource = ImageDecoder.createSource(byteBuffer);
            return this.f42420a.m50160a(createSource, i, i2, options);
        }

        @Override // com.bumptech.glide.load.ResourceDecoder
        /* renamed from: b */
        public boolean handles(ByteBuffer byteBuffer, Options options) {
            return this.f42420a.m50158c(byteBuffer);
        }
    }

    /* renamed from: com.bumptech.glide.load.resource.drawable.AnimatedWebpDecoder$c */
    /* loaded from: classes3.dex */
    public static final class C5879c implements ResourceDecoder {

        /* renamed from: a */
        public final AnimatedWebpDecoder f42421a;

        public C5879c(AnimatedWebpDecoder animatedWebpDecoder) {
            this.f42421a = animatedWebpDecoder;
        }

        @Override // com.bumptech.glide.load.ResourceDecoder
        /* renamed from: a */
        public Resource decode(InputStream inputStream, int i, int i2, Options options) {
            ImageDecoder.Source createSource;
            createSource = ImageDecoder.createSource(ByteBufferUtil.fromStream(inputStream));
            return this.f42421a.m50160a(createSource, i, i2, options);
        }

        @Override // com.bumptech.glide.load.ResourceDecoder
        /* renamed from: b */
        public boolean handles(InputStream inputStream, Options options) {
            return this.f42421a.m50159b(inputStream);
        }
    }

    public AnimatedWebpDecoder(List list, ArrayPool arrayPool) {
        this.f42417a = list;
        this.f42418b = arrayPool;
    }

    public static ResourceDecoder<ByteBuffer, Drawable> byteBufferDecoder(List<ImageHeaderParser> list, ArrayPool arrayPool) {
        return new C5878b(new AnimatedWebpDecoder(list, arrayPool));
    }

    public static ResourceDecoder<InputStream, Drawable> streamDecoder(List<ImageHeaderParser> list, ArrayPool arrayPool) {
        return new C5879c(new AnimatedWebpDecoder(list, arrayPool));
    }

    /* renamed from: a */
    public Resource m50160a(ImageDecoder.Source source, int i, int i2, Options options) {
        Drawable decodeDrawable;
        decodeDrawable = ImageDecoder.decodeDrawable(source, new DefaultOnHeaderDecodedListener(i, i2, options));
        if (AbstractC17098y4.m431a(decodeDrawable)) {
            return new C5877a(AbstractC17182z4.m207a(decodeDrawable));
        }
        throw new IOException("Received unexpected drawable type for animated webp, failing: " + decodeDrawable);
    }

    /* renamed from: b */
    public boolean m50159b(InputStream inputStream) {
        return m50157d(ImageHeaderParserUtils.getType(this.f42417a, inputStream, this.f42418b));
    }

    /* renamed from: c */
    public boolean m50158c(ByteBuffer byteBuffer) {
        return m50157d(ImageHeaderParserUtils.getType(this.f42417a, byteBuffer));
    }

    /* renamed from: d */
    public final boolean m50157d(ImageHeaderParser.ImageType imageType) {
        if (imageType == ImageHeaderParser.ImageType.ANIMATED_WEBP) {
            return true;
        }
        return false;
    }
}
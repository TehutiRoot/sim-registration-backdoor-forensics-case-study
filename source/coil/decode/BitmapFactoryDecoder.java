package coil.decode;

import android.graphics.Bitmap;
import android.graphics.BitmapFactory;
import android.graphics.drawable.BitmapDrawable;
import android.os.Build;
import coil.ImageLoader;
import coil.decode.Decoder;
import coil.decode.ImageSource;
import coil.fetch.SourceResult;
import coil.request.Options;
import coil.size.Scale;
import coil.size.Size;
import coil.size.Sizes;
import coil.util.Bitmaps;
import coil.util.Utils;
import com.tom_roush.pdfbox.contentstream.operator.OperatorName;
import com.tom_roush.pdfbox.pdmodel.common.PDPageLabelRange;
import kotlin.Deprecated;
import kotlin.DeprecationLevel;
import kotlin.Metadata;
import kotlin.SinceKotlin;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.SourceDebugExtension;
import kotlin.p023io.CloseableKt;
import kotlin.ranges.AbstractC11719c;
import kotlinx.coroutines.sync.Semaphore;
import kotlinx.coroutines.sync.SemaphoreKt;
import okio.Buffer;
import okio.BufferedSource;
import okio.ForwardingSource;
import okio.Okio;
import okio.Source;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

@Metadata(m28851d1 = {"\u0000@\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u000b\u0018\u0000 \u001f2\u00020\u0001:\u0003\u001f\u0017 B+\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0004\u0012\b\b\u0002\u0010\u0007\u001a\u00020\u0006\u0012\b\b\u0002\u0010\t\u001a\u00020\b¢\u0006\u0004\b\n\u0010\u000bB\u0019\b\u0017\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0004¢\u0006\u0004\b\n\u0010\fB#\b\u0017\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0004\u0012\b\b\u0002\u0010\u0007\u001a\u00020\u0006¢\u0006\u0004\b\n\u0010\rJ\u0013\u0010\u000f\u001a\u00020\u000eH\u0096@ø\u0001\u0000¢\u0006\u0004\b\u000f\u0010\u0010J\u0013\u0010\u0012\u001a\u00020\u000e*\u00020\u0011H\u0002¢\u0006\u0004\b\u0012\u0010\u0013J\u001b\u0010\u0017\u001a\u00020\u0016*\u00020\u00112\u0006\u0010\u0015\u001a\u00020\u0014H\u0002¢\u0006\u0004\b\u0017\u0010\u0018J\u001b\u0010\u0019\u001a\u00020\u0016*\u00020\u00112\u0006\u0010\u0015\u001a\u00020\u0014H\u0002¢\u0006\u0004\b\u0019\u0010\u0018R\u0014\u0010\u0003\u001a\u00020\u00028\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0017\u0010\u001aR\u0014\u0010\u0005\u001a\u00020\u00048\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0019\u0010\u001bR\u0014\u0010\u0007\u001a\u00020\u00068\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0012\u0010\u001cR\u0014\u0010\t\u001a\u00020\b8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u001d\u0010\u001e\u0082\u0002\u0004\n\u0002\b\u0019¨\u0006!"}, m28850d2 = {"Lcoil/decode/BitmapFactoryDecoder;", "Lcoil/decode/Decoder;", "Lcoil/decode/ImageSource;", "source", "Lcoil/request/Options;", "options", "Lkotlinx/coroutines/sync/Semaphore;", "parallelismLock", "Lcoil/decode/ExifOrientationPolicy;", "exifOrientationPolicy", "<init>", "(Lcoil/decode/ImageSource;Lcoil/request/Options;Lkotlinx/coroutines/sync/Semaphore;Lcoil/decode/ExifOrientationPolicy;)V", "(Lcoil/decode/ImageSource;Lcoil/request/Options;)V", "(Lcoil/decode/ImageSource;Lcoil/request/Options;Lkotlinx/coroutines/sync/Semaphore;)V", "Lcoil/decode/DecodeResult;", "decode", "(Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "Landroid/graphics/BitmapFactory$Options;", OperatorName.CURVE_TO, "(Landroid/graphics/BitmapFactory$Options;)Lcoil/decode/DecodeResult;", "Lcoil/decode/ExifData;", "exifData", "", PDPageLabelRange.STYLE_LETTERS_LOWER, "(Landroid/graphics/BitmapFactory$Options;Lcoil/decode/ExifData;)V", OperatorName.CLOSE_FILL_NON_ZERO_AND_STROKE, "Lcoil/decode/ImageSource;", "Lcoil/request/Options;", "Lkotlinx/coroutines/sync/Semaphore;", "d", "Lcoil/decode/ExifOrientationPolicy;", "Companion", "Factory", "coil-base_release"}, m28849k = 1, m28848mv = {1, 8, 0})
@SourceDebugExtension({"SMAP\nBitmapFactoryDecoder.kt\nKotlin\n*S Kotlin\n*F\n+ 1 BitmapFactoryDecoder.kt\ncoil/decode/BitmapFactoryDecoder\n+ 2 Semaphore.kt\nkotlinx/coroutines/sync/SemaphoreKt\n+ 3 fake.kt\nkotlin/jvm/internal/FakeKt\n+ 4 Bitmaps.kt\ncoil/util/-Bitmaps\n+ 5 BitmapDrawable.kt\nandroidx/core/graphics/drawable/BitmapDrawableKt\n+ 6 Utils.kt\ncoil/util/-Utils\n*L\n1#1,227:1\n82#2,9:228\n1#3:237\n45#4:238\n28#5:239\n219#6:240\n223#6:241\n*S KotlinDebug\n*F\n+ 1 BitmapFactoryDecoder.kt\ncoil/decode/BitmapFactoryDecoder\n*L\n45#1:228,9\n92#1:238\n92#1:239\n144#1:240\n145#1:241\n*E\n"})
/* loaded from: classes3.dex */
public final class BitmapFactoryDecoder implements Decoder {
    @NotNull
    public static final Companion Companion = new Companion(null);
    public static final int DEFAULT_MAX_PARALLELISM = 4;

    /* renamed from: a */
    public final ImageSource f40474a;

    /* renamed from: b */
    public final Options f40475b;

    /* renamed from: c */
    public final Semaphore f40476c;

    /* renamed from: d */
    public final ExifOrientationPolicy f40477d;

    @Metadata(m28851d1 = {"\u0000\u0012\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\b\n\u0000\b\u0080\u0003\u0018\u00002\u00020\u0001B\u0007\b\u0002¢\u0006\u0002\u0010\u0002R\u000e\u0010\u0003\u001a\u00020\u0004X\u0080T¢\u0006\u0002\n\u0000¨\u0006\u0005"}, m28850d2 = {"Lcoil/decode/BitmapFactoryDecoder$Companion;", "", "()V", "DEFAULT_MAX_PARALLELISM", "", "coil-base_release"}, m28849k = 1, m28848mv = {1, 8, 0}, m28846xi = 48)
    /* loaded from: classes3.dex */
    public static final class Companion {
        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        public Companion() {
        }
    }

    /* renamed from: coil.decode.BitmapFactoryDecoder$a */
    /* loaded from: classes3.dex */
    public static final class C5649a extends ForwardingSource {

        /* renamed from: a */
        public Exception f40480a;

        public C5649a(Source source) {
            super(source);
        }

        /* renamed from: b */
        public final Exception m51106b() {
            return this.f40480a;
        }

        @Override // okio.ForwardingSource, okio.Source
        public long read(Buffer buffer, long j) {
            try {
                return super.read(buffer, j);
            } catch (Exception e) {
                this.f40480a = e;
                throw e;
            }
        }
    }

    public BitmapFactoryDecoder(@NotNull ImageSource imageSource, @NotNull Options options, @NotNull Semaphore semaphore, @NotNull ExifOrientationPolicy exifOrientationPolicy) {
        this.f40474a = imageSource;
        this.f40475b = options;
        this.f40476c = semaphore;
        this.f40477d = exifOrientationPolicy;
    }

    /* renamed from: a */
    public final void m51109a(BitmapFactory.Options options, ExifData exifData) {
        Bitmap.Config config;
        Bitmap.Config config2;
        Bitmap.Config config3;
        Bitmap.Config config4 = this.f40475b.getConfig();
        if (exifData.isFlipped() || ExifUtilsKt.isRotated(exifData)) {
            config4 = Bitmaps.toSoftware(config4);
        }
        if (this.f40475b.getAllowRgb565() && config4 == Bitmap.Config.ARGB_8888 && Intrinsics.areEqual(options.outMimeType, Utils.MIME_TYPE_JPEG)) {
            config4 = Bitmap.Config.RGB_565;
        }
        if (Build.VERSION.SDK_INT >= 26) {
            config = options.outConfig;
            config2 = Bitmap.Config.RGBA_F16;
            if (config == config2) {
                config3 = Bitmap.Config.HARDWARE;
                if (config4 != config3) {
                    config4 = Bitmap.Config.RGBA_F16;
                }
            }
        }
        options.inPreferredConfig = config4;
    }

    /* renamed from: b */
    public final void m51108b(BitmapFactory.Options options, ExifData exifData) {
        int i;
        int i2;
        int px;
        int px2;
        ImageSource.Metadata metadata = this.f40474a.getMetadata();
        if ((metadata instanceof ResourceMetadata) && Sizes.isOriginal(this.f40475b.getSize())) {
            options.inSampleSize = 1;
            options.inScaled = true;
            options.inDensity = ((ResourceMetadata) metadata).getDensity();
            options.inTargetDensity = this.f40475b.getContext().getResources().getDisplayMetrics().densityDpi;
            return;
        }
        boolean z = false;
        if (options.outWidth > 0 && options.outHeight > 0) {
            if (ExifUtilsKt.isSwapped(exifData)) {
                i = options.outHeight;
            } else {
                i = options.outWidth;
            }
            if (ExifUtilsKt.isSwapped(exifData)) {
                i2 = options.outWidth;
            } else {
                i2 = options.outHeight;
            }
            Size size = this.f40475b.getSize();
            Scale scale = this.f40475b.getScale();
            if (Sizes.isOriginal(size)) {
                px = i;
            } else {
                px = Utils.toPx(size.getWidth(), scale);
            }
            Size size2 = this.f40475b.getSize();
            Scale scale2 = this.f40475b.getScale();
            if (Sizes.isOriginal(size2)) {
                px2 = i2;
            } else {
                px2 = Utils.toPx(size2.getHeight(), scale2);
            }
            int calculateInSampleSize = DecodeUtils.calculateInSampleSize(i, i2, px, px2, this.f40475b.getScale());
            options.inSampleSize = calculateInSampleSize;
            double computeSizeMultiplier = DecodeUtils.computeSizeMultiplier(i / calculateInSampleSize, i2 / calculateInSampleSize, px, px2, this.f40475b.getScale());
            if (this.f40475b.getAllowInexactSize()) {
                computeSizeMultiplier = AbstractC11719c.coerceAtMost(computeSizeMultiplier, 1.0d);
            }
            if (computeSizeMultiplier == 1.0d) {
                z = true;
            }
            boolean z2 = !z;
            options.inScaled = z2;
            if (z2) {
                if (computeSizeMultiplier > 1.0d) {
                    options.inDensity = AbstractC21140mr0.roundToInt(Integer.MAX_VALUE / computeSizeMultiplier);
                    options.inTargetDensity = Integer.MAX_VALUE;
                    return;
                }
                options.inDensity = Integer.MAX_VALUE;
                options.inTargetDensity = AbstractC21140mr0.roundToInt(Integer.MAX_VALUE * computeSizeMultiplier);
                return;
            }
            return;
        }
        options.inSampleSize = 1;
        options.inScaled = false;
    }

    /* renamed from: c */
    public final DecodeResult m51107c(BitmapFactory.Options options) {
        C5649a c5649a = new C5649a(this.f40474a.source());
        BufferedSource buffer = Okio.buffer(c5649a);
        boolean z = true;
        options.inJustDecodeBounds = true;
        BitmapFactory.decodeStream(buffer.peek().inputStream(), null, options);
        Exception m51106b = c5649a.m51106b();
        if (m51106b == null) {
            options.inJustDecodeBounds = false;
            ExifUtils exifUtils = ExifUtils.INSTANCE;
            ExifData exifData = exifUtils.getExifData(options.outMimeType, buffer, this.f40477d);
            Exception m51106b2 = c5649a.m51106b();
            if (m51106b2 == null) {
                options.inMutable = false;
                if (Build.VERSION.SDK_INT >= 26 && this.f40475b.getColorSpace() != null) {
                    options.inPreferredColorSpace = this.f40475b.getColorSpace();
                }
                options.inPremultiplied = this.f40475b.getPremultipliedAlpha();
                m51109a(options, exifData);
                m51108b(options, exifData);
                try {
                    Bitmap decodeStream = BitmapFactory.decodeStream(buffer.inputStream(), null, options);
                    CloseableKt.closeFinally(buffer, null);
                    Exception m51106b3 = c5649a.m51106b();
                    if (m51106b3 == null) {
                        if (decodeStream != null) {
                            decodeStream.setDensity(this.f40475b.getContext().getResources().getDisplayMetrics().densityDpi);
                            BitmapDrawable bitmapDrawable = new BitmapDrawable(this.f40475b.getContext().getResources(), exifUtils.reverseTransformations(decodeStream, exifData));
                            if (options.inSampleSize <= 1 && !options.inScaled) {
                                z = false;
                            }
                            return new DecodeResult(bitmapDrawable, z);
                        }
                        throw new IllegalStateException("BitmapFactory returned a null bitmap. Often this means BitmapFactory could not decode the image data read from the input source (e.g. network, disk, or memory) as it's not encoded as a valid image format.".toString());
                    }
                    throw m51106b3;
                } finally {
                }
            } else {
                throw m51106b2;
            }
        } else {
            throw m51106b;
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:10:0x0024  */
    /* JADX WARN: Removed duplicated region for block: B:20:0x0047  */
    /* JADX WARN: Removed duplicated region for block: B:26:0x006c A[RETURN] */
    /* JADX WARN: Removed duplicated region for block: B:27:0x006d  */
    @Override // coil.decode.Decoder
    @org.jetbrains.annotations.Nullable
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public java.lang.Object decode(@org.jetbrains.annotations.NotNull kotlin.coroutines.Continuation<? super coil.decode.DecodeResult> r8) {
        /*
            r7 = this;
            boolean r0 = r8 instanceof coil.decode.BitmapFactoryDecoder$decode$1
            if (r0 == 0) goto L13
            r0 = r8
            coil.decode.BitmapFactoryDecoder$decode$1 r0 = (coil.decode.BitmapFactoryDecoder$decode$1) r0
            int r1 = r0.label
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L13
            int r1 = r1 - r2
            r0.label = r1
            goto L18
        L13:
            coil.decode.BitmapFactoryDecoder$decode$1 r0 = new coil.decode.BitmapFactoryDecoder$decode$1
            r0.<init>(r7, r8)
        L18:
            java.lang.Object r8 = r0.result
            java.lang.Object r1 = p000.AbstractC18812Yf0.getCOROUTINE_SUSPENDED()
            int r2 = r0.label
            r3 = 2
            r4 = 1
            if (r2 == 0) goto L47
            if (r2 == r4) goto L3a
            if (r2 != r3) goto L32
            java.lang.Object r0 = r0.L$0
            kotlinx.coroutines.sync.Semaphore r0 = (kotlinx.coroutines.sync.Semaphore) r0
            kotlin.ResultKt.throwOnFailure(r8)     // Catch: java.lang.Throwable -> L30
            goto L70
        L30:
            r8 = move-exception
            goto L7a
        L32:
            java.lang.IllegalStateException r8 = new java.lang.IllegalStateException
            java.lang.String r0 = "call to 'resume' before 'invoke' with coroutine"
            r8.<init>(r0)
            throw r8
        L3a:
            java.lang.Object r2 = r0.L$1
            kotlinx.coroutines.sync.Semaphore r2 = (kotlinx.coroutines.sync.Semaphore) r2
            java.lang.Object r5 = r0.L$0
            coil.decode.BitmapFactoryDecoder r5 = (coil.decode.BitmapFactoryDecoder) r5
            kotlin.ResultKt.throwOnFailure(r8)
            r8 = r2
            goto L5a
        L47:
            kotlin.ResultKt.throwOnFailure(r8)
            kotlinx.coroutines.sync.Semaphore r8 = r7.f40476c
            r0.L$0 = r7
            r0.L$1 = r8
            r0.label = r4
            java.lang.Object r2 = r8.acquire(r0)
            if (r2 != r1) goto L59
            return r1
        L59:
            r5 = r7
        L5a:
            coil.decode.BitmapFactoryDecoder$decode$2$1 r2 = new coil.decode.BitmapFactoryDecoder$decode$2$1     // Catch: java.lang.Throwable -> L76
            r2.<init>(r5)     // Catch: java.lang.Throwable -> L76
            r0.L$0 = r8     // Catch: java.lang.Throwable -> L76
            r5 = 0
            r0.L$1 = r5     // Catch: java.lang.Throwable -> L76
            r0.label = r3     // Catch: java.lang.Throwable -> L76
            java.lang.Object r0 = kotlinx.coroutines.InterruptibleKt.runInterruptible$default(r5, r2, r0, r4, r5)     // Catch: java.lang.Throwable -> L76
            if (r0 != r1) goto L6d
            return r1
        L6d:
            r6 = r0
            r0 = r8
            r8 = r6
        L70:
            coil.decode.DecodeResult r8 = (coil.decode.DecodeResult) r8     // Catch: java.lang.Throwable -> L30
            r0.release()
            return r8
        L76:
            r0 = move-exception
            r6 = r0
            r0 = r8
            r8 = r6
        L7a:
            r0.release()
            throw r8
        */
        throw new UnsupportedOperationException("Method not decompiled: coil.decode.BitmapFactoryDecoder.decode(kotlin.coroutines.Continuation):java.lang.Object");
    }

    @Metadata(m28851d1 = {"\u0000F\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\b\u0004\u0018\u00002\u00020\u0001B\u001b\u0012\b\b\u0002\u0010\u0003\u001a\u00020\u0002\u0012\b\b\u0002\u0010\u0005\u001a\u00020\u0004¢\u0006\u0004\b\u0006\u0010\u0007B\t\b\u0017¢\u0006\u0004\b\u0006\u0010\bB\u0013\b\u0017\u0012\b\b\u0002\u0010\u0003\u001a\u00020\u0002¢\u0006\u0004\b\u0006\u0010\tJ'\u0010\u0011\u001a\u00020\u00102\u0006\u0010\u000b\u001a\u00020\n2\u0006\u0010\r\u001a\u00020\f2\u0006\u0010\u000f\u001a\u00020\u000eH\u0016¢\u0006\u0004\b\u0011\u0010\u0012J\u001a\u0010\u0016\u001a\u00020\u00152\b\u0010\u0014\u001a\u0004\u0018\u00010\u0013H\u0096\u0002¢\u0006\u0004\b\u0016\u0010\u0017J\u000f\u0010\u0018\u001a\u00020\u0002H\u0016¢\u0006\u0004\b\u0018\u0010\u0019R\u0014\u0010\u0005\u001a\u00020\u00048\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u001a\u0010\u001bR\u0014\u0010\u001f\u001a\u00020\u001c8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u001d\u0010\u001e¨\u0006 "}, m28850d2 = {"Lcoil/decode/BitmapFactoryDecoder$Factory;", "Lcoil/decode/Decoder$Factory;", "", "maxParallelism", "Lcoil/decode/ExifOrientationPolicy;", "exifOrientationPolicy", "<init>", "(ILcoil/decode/ExifOrientationPolicy;)V", "()V", "(I)V", "Lcoil/fetch/SourceResult;", "result", "Lcoil/request/Options;", "options", "Lcoil/ImageLoader;", "imageLoader", "Lcoil/decode/Decoder;", "create", "(Lcoil/fetch/SourceResult;Lcoil/request/Options;Lcoil/ImageLoader;)Lcoil/decode/Decoder;", "", "other", "", "equals", "(Ljava/lang/Object;)Z", "hashCode", "()I", PDPageLabelRange.STYLE_LETTERS_LOWER, "Lcoil/decode/ExifOrientationPolicy;", "Lkotlinx/coroutines/sync/Semaphore;", OperatorName.CLOSE_FILL_NON_ZERO_AND_STROKE, "Lkotlinx/coroutines/sync/Semaphore;", "parallelismLock", "coil-base_release"}, m28849k = 1, m28848mv = {1, 8, 0})
    /* loaded from: classes3.dex */
    public static final class Factory implements Decoder.Factory {

        /* renamed from: a */
        public final ExifOrientationPolicy f40478a;

        /* renamed from: b */
        public final Semaphore f40479b;

        public Factory(int i, @NotNull ExifOrientationPolicy exifOrientationPolicy) {
            this.f40478a = exifOrientationPolicy;
            this.f40479b = SemaphoreKt.Semaphore$default(i, 0, 2, null);
        }

        @Override // coil.decode.Decoder.Factory
        @NotNull
        public Decoder create(@NotNull SourceResult sourceResult, @NotNull Options options, @NotNull ImageLoader imageLoader) {
            return new BitmapFactoryDecoder(sourceResult.getSource(), options, this.f40479b, this.f40478a);
        }

        public boolean equals(@Nullable Object obj) {
            return obj instanceof Factory;
        }

        public int hashCode() {
            return Factory.class.hashCode();
        }

        public /* synthetic */ Factory(int i, ExifOrientationPolicy exifOrientationPolicy, int i2, DefaultConstructorMarker defaultConstructorMarker) {
            this((i2 & 1) != 0 ? 4 : i, (i2 & 2) != 0 ? ExifOrientationPolicy.RESPECT_PERFORMANCE : exifOrientationPolicy);
        }

        @SinceKotlin(version = "999.9")
        public Factory() {
            this(0, null, 3, null);
        }

        @Deprecated(level = DeprecationLevel.HIDDEN, message = "Kept for binary compatibility.")
        public /* synthetic */ Factory(int i) {
            this(i, null, 2, null);
        }

        public /* synthetic */ Factory(int i, int i2, DefaultConstructorMarker defaultConstructorMarker) {
            this((i2 & 1) != 0 ? 4 : i);
        }
    }

    public /* synthetic */ BitmapFactoryDecoder(ImageSource imageSource, Options options, Semaphore semaphore, ExifOrientationPolicy exifOrientationPolicy, int i, DefaultConstructorMarker defaultConstructorMarker) {
        this(imageSource, options, (i & 4) != 0 ? SemaphoreKt.Semaphore$default(Integer.MAX_VALUE, 0, 2, null) : semaphore, (i & 8) != 0 ? ExifOrientationPolicy.RESPECT_PERFORMANCE : exifOrientationPolicy);
    }

    @Deprecated(level = DeprecationLevel.HIDDEN, message = "Kept for binary compatibility.")
    public /* synthetic */ BitmapFactoryDecoder(ImageSource imageSource, Options options) {
        this(imageSource, options, null, null, 12, null);
    }

    public /* synthetic */ BitmapFactoryDecoder(ImageSource imageSource, Options options, Semaphore semaphore, int i, DefaultConstructorMarker defaultConstructorMarker) {
        this(imageSource, options, (i & 4) != 0 ? SemaphoreKt.Semaphore$default(Integer.MAX_VALUE, 0, 2, null) : semaphore);
    }

    @Deprecated(level = DeprecationLevel.HIDDEN, message = "Kept for binary compatibility.")
    public /* synthetic */ BitmapFactoryDecoder(ImageSource imageSource, Options options, Semaphore semaphore) {
        this(imageSource, options, semaphore, null, 8, null);
    }
}

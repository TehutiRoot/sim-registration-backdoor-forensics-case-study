package com.bumptech.glide.load.resource.bitmap;

import android.graphics.Bitmap;
import android.graphics.BitmapFactory;
import android.graphics.ColorSpace;
import android.os.Build;
import android.os.ParcelFileDescriptor;
import android.util.DisplayMetrics;
import android.util.Log;
import androidx.annotation.RequiresApi;
import com.bumptech.glide.load.DecodeFormat;
import com.bumptech.glide.load.ImageHeaderParser;
import com.bumptech.glide.load.Option;
import com.bumptech.glide.load.Options;
import com.bumptech.glide.load.PreferredColorSpace;
import com.bumptech.glide.load.data.ParcelFileDescriptorRewinder;
import com.bumptech.glide.load.engine.Resource;
import com.bumptech.glide.load.engine.bitmap_recycle.ArrayPool;
import com.bumptech.glide.load.engine.bitmap_recycle.BitmapPool;
import com.bumptech.glide.load.resource.bitmap.DownsampleStrategy;
import com.bumptech.glide.load.resource.bitmap.ImageReader;
import com.bumptech.glide.util.LogTime;
import com.bumptech.glide.util.Preconditions;
import com.bumptech.glide.util.Util;
import java.io.IOException;
import java.io.InputStream;
import java.nio.ByteBuffer;
import java.util.Arrays;
import java.util.Collections;
import java.util.EnumSet;
import java.util.HashSet;
import java.util.List;
import java.util.Queue;
import java.util.Set;

/* loaded from: classes3.dex */
public final class Downsampler {
    public static final Option<Boolean> ALLOW_HARDWARE_CONFIG;
    public static final Option<Boolean> FIX_BITMAP_SIZE_TO_REQUESTED_DIMENSIONS;

    /* renamed from: f */
    public static final Set f42320f;

    /* renamed from: g */
    public static final DecodeCallbacks f42321g;

    /* renamed from: h */
    public static final Set f42322h;

    /* renamed from: i */
    public static final Queue f42323i;

    /* renamed from: a */
    public final BitmapPool f42324a;

    /* renamed from: b */
    public final DisplayMetrics f42325b;

    /* renamed from: c */
    public final ArrayPool f42326c;

    /* renamed from: d */
    public final List f42327d;

    /* renamed from: e */
    public final HardwareConfigState f42328e = HardwareConfigState.getInstance();
    public static final Option<DecodeFormat> DECODE_FORMAT = Option.memory("com.bumptech.glide.load.resource.bitmap.Downsampler.DecodeFormat", DecodeFormat.DEFAULT);
    public static final Option<PreferredColorSpace> PREFERRED_COLOR_SPACE = Option.memory("com.bumptech.glide.load.resource.bitmap.Downsampler.PreferredColorSpace");
    @Deprecated
    public static final Option<DownsampleStrategy> DOWNSAMPLE_STRATEGY = DownsampleStrategy.OPTION;

    /* loaded from: classes3.dex */
    public interface DecodeCallbacks {
        void onDecodeComplete(BitmapPool bitmapPool, Bitmap bitmap) throws IOException;

        void onObtainBounds();
    }

    /* renamed from: com.bumptech.glide.load.resource.bitmap.Downsampler$a */
    /* loaded from: classes3.dex */
    public class C5870a implements DecodeCallbacks {
        @Override // com.bumptech.glide.load.resource.bitmap.Downsampler.DecodeCallbacks
        public void onDecodeComplete(BitmapPool bitmapPool, Bitmap bitmap) {
        }

        @Override // com.bumptech.glide.load.resource.bitmap.Downsampler.DecodeCallbacks
        public void onObtainBounds() {
        }
    }

    static {
        Boolean bool = Boolean.FALSE;
        FIX_BITMAP_SIZE_TO_REQUESTED_DIMENSIONS = Option.memory("com.bumptech.glide.load.resource.bitmap.Downsampler.FixBitmapSize", bool);
        ALLOW_HARDWARE_CONFIG = Option.memory("com.bumptech.glide.load.resource.bitmap.Downsampler.AllowHardwareDecode", bool);
        f42320f = Collections.unmodifiableSet(new HashSet(Arrays.asList("image/vnd.wap.wbmp", "image/x-ico")));
        f42321g = new C5870a();
        f42322h = Collections.unmodifiableSet(EnumSet.of(ImageHeaderParser.ImageType.JPEG, ImageHeaderParser.ImageType.PNG_A, ImageHeaderParser.ImageType.PNG));
        f42323i = Util.createQueue(0);
    }

    public Downsampler(List<ImageHeaderParser> list, DisplayMetrics displayMetrics, BitmapPool bitmapPool, ArrayPool arrayPool) {
        this.f42327d = list;
        this.f42325b = (DisplayMetrics) Preconditions.checkNotNull(displayMetrics);
        this.f42324a = (BitmapPool) Preconditions.checkNotNull(bitmapPool);
        this.f42326c = (ArrayPool) Preconditions.checkNotNull(arrayPool);
    }

    /* renamed from: a */
    public static int m50231a(double d) {
        int m50223i = m50223i(d);
        int m50214r = m50214r(m50223i * d);
        return m50214r((d / (m50214r / m50223i)) * m50214r);
    }

    /* renamed from: c */
    public static void m50229c(ImageHeaderParser.ImageType imageType, ImageReader imageReader, DecodeCallbacks decodeCallbacks, BitmapPool bitmapPool, DownsampleStrategy downsampleStrategy, int i, int i2, int i3, int i4, int i5, BitmapFactory.Options options) {
        int i6;
        int i7;
        int min;
        int i8;
        int floor;
        double floor2;
        int i9;
        if (i2 > 0 && i3 > 0) {
            if (m50220l(i)) {
                i7 = i2;
                i6 = i3;
            } else {
                i6 = i2;
                i7 = i3;
            }
            float scaleFactor = downsampleStrategy.getScaleFactor(i6, i7, i4, i5);
            if (scaleFactor > 0.0f) {
                DownsampleStrategy.SampleSizeRounding sampleSizeRounding = downsampleStrategy.getSampleSizeRounding(i6, i7, i4, i5);
                if (sampleSizeRounding != null) {
                    float f = i6;
                    float f2 = i7;
                    int m50214r = i6 / m50214r(scaleFactor * f);
                    int m50214r2 = i7 / m50214r(scaleFactor * f2);
                    DownsampleStrategy.SampleSizeRounding sampleSizeRounding2 = DownsampleStrategy.SampleSizeRounding.MEMORY;
                    if (sampleSizeRounding == sampleSizeRounding2) {
                        min = Math.max(m50214r, m50214r2);
                    } else {
                        min = Math.min(m50214r, m50214r2);
                    }
                    int i10 = Build.VERSION.SDK_INT;
                    if (i10 > 23 || !f42320f.contains(options.outMimeType)) {
                        int max = Math.max(1, Integer.highestOneBit(min));
                        if (sampleSizeRounding == sampleSizeRounding2 && max < 1.0f / scaleFactor) {
                            max <<= 1;
                        }
                        i8 = max;
                    } else {
                        i8 = 1;
                    }
                    options.inSampleSize = i8;
                    if (imageType == ImageHeaderParser.ImageType.JPEG) {
                        float min2 = Math.min(i8, 8);
                        floor = (int) Math.ceil(f / min2);
                        i9 = (int) Math.ceil(f2 / min2);
                        int i11 = i8 / 8;
                        if (i11 > 0) {
                            floor /= i11;
                            i9 /= i11;
                        }
                    } else {
                        if (imageType != ImageHeaderParser.ImageType.PNG && imageType != ImageHeaderParser.ImageType.PNG_A) {
                            if (imageType.isWebp()) {
                                if (i10 >= 24) {
                                    float f3 = i8;
                                    floor = Math.round(f / f3);
                                    i9 = Math.round(f2 / f3);
                                } else {
                                    float f4 = i8;
                                    floor = (int) Math.floor(f / f4);
                                    floor2 = Math.floor(f2 / f4);
                                }
                            } else if (i6 % i8 == 0 && i7 % i8 == 0) {
                                floor = i6 / i8;
                                i9 = i7 / i8;
                            } else {
                                int[] m50222j = m50222j(imageReader, options, decodeCallbacks, bitmapPool);
                                floor = m50222j[0];
                                i9 = m50222j[1];
                            }
                        } else {
                            float f5 = i8;
                            floor = (int) Math.floor(f / f5);
                            floor2 = Math.floor(f2 / f5);
                        }
                        i9 = (int) floor2;
                    }
                    double scaleFactor2 = downsampleStrategy.getScaleFactor(floor, i9, i4, i5);
                    options.inTargetDensity = m50231a(scaleFactor2);
                    options.inDensity = m50223i(scaleFactor2);
                    if (m50219m(options)) {
                        options.inScaled = true;
                    } else {
                        options.inTargetDensity = 0;
                        options.inDensity = 0;
                    }
                    if (Log.isLoggable("Downsampler", 2)) {
                        StringBuilder sb = new StringBuilder();
                        sb.append("Calculate scaling, source: [");
                        sb.append(i2);
                        sb.append("x");
                        sb.append(i3);
                        sb.append("], degreesToRotate: ");
                        sb.append(i);
                        sb.append(", target: [");
                        sb.append(i4);
                        sb.append("x");
                        sb.append(i5);
                        sb.append("], power of two scaled: [");
                        sb.append(floor);
                        sb.append("x");
                        sb.append(i9);
                        sb.append("], exact scale factor: ");
                        sb.append(scaleFactor);
                        sb.append(", power of 2 sample size: ");
                        sb.append(i8);
                        sb.append(", adjusted scale factor: ");
                        sb.append(scaleFactor2);
                        sb.append(", target density: ");
                        sb.append(options.inTargetDensity);
                        sb.append(", density: ");
                        sb.append(options.inDensity);
                        return;
                    }
                    return;
                }
                throw new IllegalArgumentException("Cannot round with null rounding");
            }
            throw new IllegalArgumentException("Cannot scale with factor: " + scaleFactor + " from: " + downsampleStrategy + ", source: [" + i2 + "x" + i3 + "], target: [" + i4 + "x" + i5 + "]");
        } else if (Log.isLoggable("Downsampler", 3)) {
            StringBuilder sb2 = new StringBuilder();
            sb2.append("Unable to determine dimensions for: ");
            sb2.append(imageType);
            sb2.append(" with target [");
            sb2.append(i4);
            sb2.append("x");
            sb2.append(i5);
            sb2.append("]");
        }
    }

    /* renamed from: f */
    public static Bitmap m50226f(ImageReader imageReader, BitmapFactory.Options options, DecodeCallbacks decodeCallbacks, BitmapPool bitmapPool) {
        if (!options.inJustDecodeBounds) {
            decodeCallbacks.onObtainBounds();
            imageReader.stopGrowingBuffers();
        }
        int i = options.outWidth;
        int i2 = options.outHeight;
        String str = options.outMimeType;
        TransformationUtils.getBitmapDrawableLock().lock();
        try {
            try {
                Bitmap decodeBitmap = imageReader.decodeBitmap(options);
                TransformationUtils.getBitmapDrawableLock().unlock();
                return decodeBitmap;
            } catch (IllegalArgumentException e) {
                IOException m50217o = m50217o(e, i, i2, str, options);
                Log.isLoggable("Downsampler", 3);
                Bitmap bitmap = options.inBitmap;
                if (bitmap != null) {
                    try {
                        bitmapPool.put(bitmap);
                        options.inBitmap = null;
                        Bitmap m50226f = m50226f(imageReader, options, decodeCallbacks, bitmapPool);
                        TransformationUtils.getBitmapDrawableLock().unlock();
                        return m50226f;
                    } catch (IOException unused) {
                        throw m50217o;
                    }
                }
                throw m50217o;
            }
        } catch (Throwable th2) {
            TransformationUtils.getBitmapDrawableLock().unlock();
            throw th2;
        }
    }

    /* renamed from: g */
    public static String m50225g(Bitmap bitmap) {
        if (bitmap == null) {
            return null;
        }
        return "[" + bitmap.getWidth() + "x" + bitmap.getHeight() + "] " + bitmap.getConfig() + (" (" + bitmap.getAllocationByteCount() + ")");
    }

    /* renamed from: h */
    public static synchronized BitmapFactory.Options m50224h() {
        BitmapFactory.Options options;
        synchronized (Downsampler.class) {
            Queue queue = f42323i;
            synchronized (queue) {
                options = (BitmapFactory.Options) queue.poll();
            }
            if (options == null) {
                options = new BitmapFactory.Options();
                m50215q(options);
            }
        }
        return options;
    }

    /* renamed from: i */
    public static int m50223i(double d) {
        if (d > 1.0d) {
            d = 1.0d / d;
        }
        return (int) Math.round(d * 2.147483647E9d);
    }

    /* renamed from: j */
    public static int[] m50222j(ImageReader imageReader, BitmapFactory.Options options, DecodeCallbacks decodeCallbacks, BitmapPool bitmapPool) {
        options.inJustDecodeBounds = true;
        m50226f(imageReader, options, decodeCallbacks, bitmapPool);
        options.inJustDecodeBounds = false;
        return new int[]{options.outWidth, options.outHeight};
    }

    /* renamed from: k */
    public static String m50221k(BitmapFactory.Options options) {
        return m50225g(options.inBitmap);
    }

    /* renamed from: l */
    public static boolean m50220l(int i) {
        return i == 90 || i == 270;
    }

    /* renamed from: m */
    public static boolean m50219m(BitmapFactory.Options options) {
        int i;
        int i2 = options.inTargetDensity;
        if (i2 > 0 && (i = options.inDensity) > 0 && i2 != i) {
            return true;
        }
        return false;
    }

    /* renamed from: n */
    public static void m50218n(int i, int i2, String str, BitmapFactory.Options options, Bitmap bitmap, int i3, int i4, long j) {
        StringBuilder sb = new StringBuilder();
        sb.append("Decoded ");
        sb.append(m50225g(bitmap));
        sb.append(" from [");
        sb.append(i);
        sb.append("x");
        sb.append(i2);
        sb.append("] ");
        sb.append(str);
        sb.append(" with inBitmap ");
        sb.append(m50221k(options));
        sb.append(" for [");
        sb.append(i3);
        sb.append("x");
        sb.append(i4);
        sb.append("], sample size: ");
        sb.append(options.inSampleSize);
        sb.append(", density: ");
        sb.append(options.inDensity);
        sb.append(", target density: ");
        sb.append(options.inTargetDensity);
        sb.append(", thread: ");
        sb.append(Thread.currentThread().getName());
        sb.append(", duration: ");
        sb.append(LogTime.getElapsedMillis(j));
    }

    /* renamed from: o */
    public static IOException m50217o(IllegalArgumentException illegalArgumentException, int i, int i2, String str, BitmapFactory.Options options) {
        return new IOException("Exception decoding bitmap, outWidth: " + i + ", outHeight: " + i2 + ", outMimeType: " + str + ", inBitmap: " + m50221k(options), illegalArgumentException);
    }

    /* renamed from: p */
    public static void m50216p(BitmapFactory.Options options) {
        m50215q(options);
        Queue queue = f42323i;
        synchronized (queue) {
            queue.offer(options);
        }
    }

    /* renamed from: q */
    public static void m50215q(BitmapFactory.Options options) {
        options.inTempStorage = null;
        options.inDither = false;
        options.inScaled = false;
        options.inSampleSize = 1;
        options.inPreferredConfig = null;
        options.inJustDecodeBounds = false;
        options.inDensity = 0;
        options.inTargetDensity = 0;
        if (Build.VERSION.SDK_INT >= 26) {
            options.inPreferredColorSpace = null;
            options.outColorSpace = null;
            options.outConfig = null;
        }
        options.outWidth = 0;
        options.outHeight = 0;
        options.outMimeType = null;
        options.inBitmap = null;
        options.inMutable = true;
    }

    /* renamed from: r */
    public static int m50214r(double d) {
        return (int) (d + 0.5d);
    }

    /* renamed from: s */
    public static void m50213s(BitmapFactory.Options options, BitmapPool bitmapPool, int i, int i2) {
        Bitmap.Config config;
        Bitmap.Config config2;
        if (Build.VERSION.SDK_INT >= 26) {
            Bitmap.Config config3 = options.inPreferredConfig;
            config2 = Bitmap.Config.HARDWARE;
            if (config3 != config2) {
                config = options.outConfig;
            } else {
                return;
            }
        } else {
            config = null;
        }
        if (config == null) {
            config = options.inPreferredConfig;
        }
        options.inBitmap = bitmapPool.getDirty(i, i2, config);
    }

    /* renamed from: b */
    public final void m50230b(ImageReader imageReader, DecodeFormat decodeFormat, boolean z, boolean z2, BitmapFactory.Options options, int i, int i2) {
        boolean z3;
        Bitmap.Config config;
        if (this.f42328e.m50206e(i, i2, options, z, z2)) {
            return;
        }
        if (decodeFormat != DecodeFormat.PREFER_ARGB_8888) {
            try {
                z3 = imageReader.getImageType().hasAlpha();
            } catch (IOException unused) {
                if (Log.isLoggable("Downsampler", 3)) {
                    StringBuilder sb = new StringBuilder();
                    sb.append("Cannot determine whether the image has alpha or not from header, format ");
                    sb.append(decodeFormat);
                }
                z3 = false;
            }
            if (z3) {
                config = Bitmap.Config.ARGB_8888;
            } else {
                config = Bitmap.Config.RGB_565;
            }
            options.inPreferredConfig = config;
            if (config == Bitmap.Config.RGB_565) {
                options.inDither = true;
                return;
            }
            return;
        }
        options.inPreferredConfig = Bitmap.Config.ARGB_8888;
    }

    /* renamed from: d */
    public final Resource m50228d(ImageReader imageReader, int i, int i2, Options options, DecodeCallbacks decodeCallbacks) {
        boolean z;
        byte[] bArr = (byte[]) this.f42326c.get(65536, byte[].class);
        BitmapFactory.Options m50224h = m50224h();
        m50224h.inTempStorage = bArr;
        DecodeFormat decodeFormat = (DecodeFormat) options.get(DECODE_FORMAT);
        PreferredColorSpace preferredColorSpace = (PreferredColorSpace) options.get(PREFERRED_COLOR_SPACE);
        DownsampleStrategy downsampleStrategy = (DownsampleStrategy) options.get(DownsampleStrategy.OPTION);
        boolean booleanValue = ((Boolean) options.get(FIX_BITMAP_SIZE_TO_REQUESTED_DIMENSIONS)).booleanValue();
        Option<Boolean> option = ALLOW_HARDWARE_CONFIG;
        if (options.get(option) != null && ((Boolean) options.get(option)).booleanValue()) {
            z = true;
        } else {
            z = false;
        }
        try {
            return BitmapResource.obtain(m50227e(imageReader, m50224h, downsampleStrategy, decodeFormat, preferredColorSpace, z, i, i2, booleanValue, decodeCallbacks), this.f42324a);
        } finally {
            m50216p(m50224h);
            this.f42326c.put(bArr);
        }
    }

    public Resource<Bitmap> decode(InputStream inputStream, int i, int i2, Options options) throws IOException {
        return decode(inputStream, i, i2, options, f42321g);
    }

    /* renamed from: e */
    public final Bitmap m50227e(ImageReader imageReader, BitmapFactory.Options options, DownsampleStrategy downsampleStrategy, DecodeFormat decodeFormat, PreferredColorSpace preferredColorSpace, boolean z, int i, int i2, boolean z2, DecodeCallbacks decodeCallbacks) {
        int i3;
        int i4;
        int i5;
        String str;
        int i6;
        ColorSpace.Named named;
        ColorSpace colorSpace;
        ColorSpace.Named named2;
        ColorSpace colorSpace2;
        ColorSpace colorSpace3;
        ColorSpace colorSpace4;
        boolean isWideGamut;
        int round;
        int i7;
        int i8;
        long logTime = LogTime.getLogTime();
        int[] m50222j = m50222j(imageReader, options, decodeCallbacks, this.f42324a);
        int i9 = m50222j[0];
        int i10 = m50222j[1];
        String str2 = options.outMimeType;
        boolean z3 = (i9 == -1 || i10 == -1) ? false : z;
        int imageOrientation = imageReader.getImageOrientation();
        int exifOrientationDegrees = TransformationUtils.getExifOrientationDegrees(imageOrientation);
        boolean isExifOrientationRequired = TransformationUtils.isExifOrientationRequired(imageOrientation);
        if (i == Integer.MIN_VALUE) {
            i3 = i2;
            i4 = m50220l(exifOrientationDegrees) ? i10 : i9;
        } else {
            i3 = i2;
            i4 = i;
        }
        if (i3 == Integer.MIN_VALUE) {
            i5 = m50220l(exifOrientationDegrees) ? i9 : i10;
        } else {
            i5 = i3;
        }
        ImageHeaderParser.ImageType imageType = imageReader.getImageType();
        m50229c(imageType, imageReader, decodeCallbacks, this.f42324a, downsampleStrategy, exifOrientationDegrees, i9, i10, i4, i5, options);
        m50230b(imageReader, decodeFormat, z3, isExifOrientationRequired, options, i4, i5);
        int i11 = Build.VERSION.SDK_INT;
        if (m50212t(imageType)) {
            if (i9 < 0 || i10 < 0 || !z2) {
                float f = m50219m(options) ? options.inTargetDensity / options.inDensity : 1.0f;
                int i12 = options.inSampleSize;
                float f2 = i12;
                int round2 = Math.round(((int) Math.ceil(i9 / f2)) * f);
                round = Math.round(((int) Math.ceil(i10 / f2)) * f);
                str = "Downsampler";
                if (Log.isLoggable(str, 2)) {
                    StringBuilder sb = new StringBuilder();
                    sb.append("Calculated target [");
                    sb.append(round2);
                    sb.append("x");
                    sb.append(round);
                    i7 = round2;
                    sb.append("] for source [");
                    sb.append(i9);
                    sb.append("x");
                    sb.append(i10);
                    sb.append("], sampleSize: ");
                    sb.append(i12);
                    sb.append(", targetDensity: ");
                    sb.append(options.inTargetDensity);
                    sb.append(", density: ");
                    sb.append(options.inDensity);
                    sb.append(", density multiplier: ");
                    sb.append(f);
                } else {
                    i7 = round2;
                }
                i8 = i7;
            } else {
                str = "Downsampler";
                i8 = i4;
                round = i5;
            }
            if (i8 > 0 && round > 0) {
                m50213s(options, this.f42324a, i8, round);
            }
        } else {
            str = "Downsampler";
        }
        if (preferredColorSpace != null) {
            if (i11 >= 28) {
                if (preferredColorSpace == PreferredColorSpace.DISPLAY_P3) {
                    colorSpace3 = options.outColorSpace;
                    if (colorSpace3 != null) {
                        colorSpace4 = options.outColorSpace;
                        isWideGamut = colorSpace4.isWideGamut();
                        if (isWideGamut) {
                            named2 = ColorSpace.Named.DISPLAY_P3;
                            colorSpace2 = ColorSpace.get(named2);
                            options.inPreferredColorSpace = colorSpace2;
                        }
                    }
                }
                named2 = ColorSpace.Named.SRGB;
                colorSpace2 = ColorSpace.get(named2);
                options.inPreferredColorSpace = colorSpace2;
            } else if (i11 >= 26) {
                named = ColorSpace.Named.SRGB;
                colorSpace = ColorSpace.get(named);
                options.inPreferredColorSpace = colorSpace;
            }
        }
        Bitmap m50226f = m50226f(imageReader, options, decodeCallbacks, this.f42324a);
        decodeCallbacks.onDecodeComplete(this.f42324a, m50226f);
        if (Log.isLoggable(str, 2)) {
            i6 = imageOrientation;
            m50218n(i9, i10, str2, options, m50226f, i, i2, logTime);
        } else {
            i6 = imageOrientation;
        }
        if (m50226f != null) {
            m50226f.setDensity(this.f42325b.densityDpi);
            Bitmap rotateImageExif = TransformationUtils.rotateImageExif(this.f42324a, m50226f, i6);
            if (m50226f.equals(rotateImageExif)) {
                return rotateImageExif;
            }
            this.f42324a.put(m50226f);
            return rotateImageExif;
        }
        return null;
    }

    public boolean handles(InputStream inputStream) {
        return true;
    }

    /* renamed from: t */
    public final boolean m50212t(ImageHeaderParser.ImageType imageType) {
        return true;
    }

    public Resource<Bitmap> decode(ByteBuffer byteBuffer, int i, int i2, Options options) throws IOException {
        return m50228d(new ImageReader.ByteBufferReader(byteBuffer, this.f42327d, this.f42326c), i, i2, options, f42321g);
    }

    public boolean handles(ByteBuffer byteBuffer) {
        return true;
    }

    public Resource<Bitmap> decode(InputStream inputStream, int i, int i2, Options options, DecodeCallbacks decodeCallbacks) throws IOException {
        return m50228d(new ImageReader.InputStreamImageReader(inputStream, this.f42327d, this.f42326c), i, i2, options, decodeCallbacks);
    }

    public boolean handles(ParcelFileDescriptor parcelFileDescriptor) {
        return ParcelFileDescriptorRewinder.isSupported();
    }

    @RequiresApi(21)
    public Resource<Bitmap> decode(ParcelFileDescriptor parcelFileDescriptor, int i, int i2, Options options) throws IOException {
        return m50228d(new ImageReader.ParcelFileDescriptorImageReader(parcelFileDescriptor, this.f42327d, this.f42326c), i, i2, options, f42321g);
    }
}

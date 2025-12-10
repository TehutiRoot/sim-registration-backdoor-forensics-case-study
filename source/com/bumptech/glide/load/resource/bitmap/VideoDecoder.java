package com.bumptech.glide.load.resource.bitmap;

import android.content.res.AssetFileDescriptor;
import android.graphics.Bitmap;
import android.graphics.Matrix;
import android.media.MediaDataSource;
import android.media.MediaExtractor;
import android.media.MediaMetadataRetriever;
import android.os.Build;
import android.os.ParcelFileDescriptor;
import android.util.Log;
import androidx.annotation.NonNull;
import androidx.annotation.RequiresApi;
import com.bumptech.glide.load.Option;
import com.bumptech.glide.load.Options;
import com.bumptech.glide.load.ResourceDecoder;
import com.bumptech.glide.load.engine.Resource;
import com.bumptech.glide.load.engine.bitmap_recycle.BitmapPool;
import java.io.IOException;
import java.nio.ByteBuffer;
import java.security.MessageDigest;
import java.util.Arrays;
import java.util.Collections;
import java.util.List;

/* loaded from: classes3.dex */
public class VideoDecoder<T> implements ResourceDecoder<T, Bitmap> {
    public static final long DEFAULT_FRAME = -1;

    /* renamed from: a */
    public final InterfaceC5882e f42391a;

    /* renamed from: b */
    public final BitmapPool f42392b;

    /* renamed from: c */
    public final C5883f f42393c;
    public static final Option<Long> TARGET_FRAME = Option.disk("com.bumptech.glide.load.resource.bitmap.VideoBitmapDecode.TargetFrame", -1L, new C5877a());
    public static final Option<Integer> FRAME_OPTION = Option.disk("com.bumptech.glide.load.resource.bitmap.VideoBitmapDecode.FrameOption", 2, new C5878b());

    /* renamed from: d */
    public static final C5883f f42389d = new C5883f();

    /* renamed from: e */
    public static final List f42390e = Collections.unmodifiableList(Arrays.asList("TP1A", "TD1A.220804.031"));

    /* loaded from: classes3.dex */
    public static final class VideoDecoderException extends RuntimeException {
        private static final long serialVersionUID = -2556382523004027815L;

        public VideoDecoderException() {
            super("MediaMetadataRetriever failed to retrieve a frame without throwing, check the adb logs for .*MetadataRetriever.* prior to this exception for details");
        }
    }

    /* renamed from: com.bumptech.glide.load.resource.bitmap.VideoDecoder$a */
    /* loaded from: classes3.dex */
    public class C5877a implements Option.CacheKeyUpdater {

        /* renamed from: a */
        public final ByteBuffer f42394a = ByteBuffer.allocate(8);

        @Override // com.bumptech.glide.load.Option.CacheKeyUpdater
        /* renamed from: a */
        public void update(byte[] bArr, Long l, MessageDigest messageDigest) {
            messageDigest.update(bArr);
            synchronized (this.f42394a) {
                this.f42394a.position(0);
                messageDigest.update(this.f42394a.putLong(l.longValue()).array());
            }
        }
    }

    /* renamed from: com.bumptech.glide.load.resource.bitmap.VideoDecoder$b */
    /* loaded from: classes3.dex */
    public class C5878b implements Option.CacheKeyUpdater {

        /* renamed from: a */
        public final ByteBuffer f42395a = ByteBuffer.allocate(4);

        @Override // com.bumptech.glide.load.Option.CacheKeyUpdater
        /* renamed from: a */
        public void update(byte[] bArr, Integer num, MessageDigest messageDigest) {
            if (num == null) {
                return;
            }
            messageDigest.update(bArr);
            synchronized (this.f42395a) {
                this.f42395a.position(0);
                messageDigest.update(this.f42395a.putInt(num.intValue()).array());
            }
        }
    }

    /* renamed from: com.bumptech.glide.load.resource.bitmap.VideoDecoder$c */
    /* loaded from: classes3.dex */
    public static final class C5879c implements InterfaceC5882e {
        public C5879c() {
        }

        @Override // com.bumptech.glide.load.resource.bitmap.VideoDecoder.InterfaceC5882e
        /* renamed from: c */
        public void mo50176a(MediaExtractor mediaExtractor, AssetFileDescriptor assetFileDescriptor) {
            mediaExtractor.setDataSource(assetFileDescriptor.getFileDescriptor(), assetFileDescriptor.getStartOffset(), assetFileDescriptor.getLength());
        }

        @Override // com.bumptech.glide.load.resource.bitmap.VideoDecoder.InterfaceC5882e
        /* renamed from: d */
        public void mo50175b(MediaMetadataRetriever mediaMetadataRetriever, AssetFileDescriptor assetFileDescriptor) {
            mediaMetadataRetriever.setDataSource(assetFileDescriptor.getFileDescriptor(), assetFileDescriptor.getStartOffset(), assetFileDescriptor.getLength());
        }

        public /* synthetic */ C5879c(C5877a c5877a) {
            this();
        }
    }

    /* renamed from: com.bumptech.glide.load.resource.bitmap.VideoDecoder$d */
    /* loaded from: classes3.dex */
    public static final class C5880d implements InterfaceC5882e {

        /* renamed from: com.bumptech.glide.load.resource.bitmap.VideoDecoder$d$a */
        /* loaded from: classes3.dex */
        public class C5881a extends MediaDataSource {

            /* renamed from: a */
            public final /* synthetic */ ByteBuffer f42396a;

            public C5881a(ByteBuffer byteBuffer) {
                this.f42396a = byteBuffer;
            }

            @Override // java.io.Closeable, java.lang.AutoCloseable
            public void close() {
            }

            @Override // android.media.MediaDataSource
            public long getSize() {
                return this.f42396a.limit();
            }

            @Override // android.media.MediaDataSource
            public int readAt(long j, byte[] bArr, int i, int i2) {
                if (j >= this.f42396a.limit()) {
                    return -1;
                }
                this.f42396a.position((int) j);
                int min = Math.min(i2, this.f42396a.remaining());
                this.f42396a.get(bArr, i, min);
                return min;
            }
        }

        /* renamed from: c */
        public final MediaDataSource m50180c(ByteBuffer byteBuffer) {
            return new C5881a(byteBuffer);
        }

        @Override // com.bumptech.glide.load.resource.bitmap.VideoDecoder.InterfaceC5882e
        /* renamed from: d */
        public void mo50176a(MediaExtractor mediaExtractor, ByteBuffer byteBuffer) {
            mediaExtractor.setDataSource(m50180c(byteBuffer));
        }

        @Override // com.bumptech.glide.load.resource.bitmap.VideoDecoder.InterfaceC5882e
        /* renamed from: e */
        public void mo50175b(MediaMetadataRetriever mediaMetadataRetriever, ByteBuffer byteBuffer) {
            mediaMetadataRetriever.setDataSource(m50180c(byteBuffer));
        }
    }

    /* renamed from: com.bumptech.glide.load.resource.bitmap.VideoDecoder$e */
    /* loaded from: classes3.dex */
    public interface InterfaceC5882e {
        /* renamed from: a */
        void mo50176a(MediaExtractor mediaExtractor, Object obj);

        /* renamed from: b */
        void mo50175b(MediaMetadataRetriever mediaMetadataRetriever, Object obj);
    }

    /* renamed from: com.bumptech.glide.load.resource.bitmap.VideoDecoder$f */
    /* loaded from: classes3.dex */
    public static class C5883f {
        /* renamed from: a */
        public MediaMetadataRetriever m50177a() {
            return new MediaMetadataRetriever();
        }
    }

    /* renamed from: com.bumptech.glide.load.resource.bitmap.VideoDecoder$g */
    /* loaded from: classes3.dex */
    public static final class C5884g implements InterfaceC5882e {
        @Override // com.bumptech.glide.load.resource.bitmap.VideoDecoder.InterfaceC5882e
        /* renamed from: c */
        public void mo50176a(MediaExtractor mediaExtractor, ParcelFileDescriptor parcelFileDescriptor) {
            mediaExtractor.setDataSource(parcelFileDescriptor.getFileDescriptor());
        }

        @Override // com.bumptech.glide.load.resource.bitmap.VideoDecoder.InterfaceC5882e
        /* renamed from: d */
        public void mo50175b(MediaMetadataRetriever mediaMetadataRetriever, ParcelFileDescriptor parcelFileDescriptor) {
            mediaMetadataRetriever.setDataSource(parcelFileDescriptor.getFileDescriptor());
        }
    }

    public VideoDecoder(BitmapPool bitmapPool, InterfaceC5882e interfaceC5882e) {
        this(bitmapPool, interfaceC5882e, f42389d);
    }

    /* renamed from: a */
    public static Bitmap m50192a(MediaMetadataRetriever mediaMetadataRetriever, Bitmap bitmap) {
        if (!m50187f()) {
            return bitmap;
        }
        try {
            if (m50188e(mediaMetadataRetriever)) {
                if (Math.abs(Integer.parseInt(mediaMetadataRetriever.extractMetadata(24))) == 180) {
                    Log.isLoggable("VideoDecoder", 3);
                    Matrix matrix = new Matrix();
                    matrix.postRotate(180.0f, bitmap.getWidth() / 2.0f, bitmap.getHeight() / 2.0f);
                    return Bitmap.createBitmap(bitmap, 0, 0, bitmap.getWidth(), bitmap.getHeight(), matrix, true);
                }
            }
        } catch (NumberFormatException unused) {
            Log.isLoggable("VideoDecoder", 3);
        }
        return bitmap;
    }

    @RequiresApi(16)
    public static ResourceDecoder<AssetFileDescriptor, Bitmap> asset(BitmapPool bitmapPool) {
        return new VideoDecoder(bitmapPool, new C5879c(null));
    }

    @RequiresApi(api = 23)
    public static ResourceDecoder<ByteBuffer, Bitmap> byteBuffer(BitmapPool bitmapPool) {
        return new VideoDecoder(bitmapPool, new C5880d());
    }

    /* renamed from: c */
    public static Bitmap m50190c(MediaMetadataRetriever mediaMetadataRetriever, long j, int i) {
        return mediaMetadataRetriever.getFrameAtTime(j, i);
    }

    /* renamed from: d */
    public static Bitmap m50189d(MediaMetadataRetriever mediaMetadataRetriever, long j, int i, int i2, int i3, DownsampleStrategy downsampleStrategy) {
        Bitmap scaledFrameAtTime;
        try {
            int parseInt = Integer.parseInt(mediaMetadataRetriever.extractMetadata(18));
            int parseInt2 = Integer.parseInt(mediaMetadataRetriever.extractMetadata(19));
            int parseInt3 = Integer.parseInt(mediaMetadataRetriever.extractMetadata(24));
            if (parseInt3 == 90 || parseInt3 == 270) {
                parseInt2 = parseInt;
                parseInt = parseInt2;
            }
            float scaleFactor = downsampleStrategy.getScaleFactor(parseInt, parseInt2, i2, i3);
            scaledFrameAtTime = mediaMetadataRetriever.getScaledFrameAtTime(j, i, Math.round(parseInt * scaleFactor), Math.round(scaleFactor * parseInt2));
            return scaledFrameAtTime;
        } catch (Throwable unused) {
            Log.isLoggable("VideoDecoder", 3);
            return null;
        }
    }

    /* renamed from: e */
    public static boolean m50188e(MediaMetadataRetriever mediaMetadataRetriever) {
        String extractMetadata = mediaMetadataRetriever.extractMetadata(36);
        String extractMetadata2 = mediaMetadataRetriever.extractMetadata(35);
        int parseInt = Integer.parseInt(extractMetadata);
        int parseInt2 = Integer.parseInt(extractMetadata2);
        if ((parseInt == 7 || parseInt == 6) && parseInt2 == 6) {
            return true;
        }
        return false;
    }

    /* renamed from: f */
    public static boolean m50187f() {
        if (Build.MODEL.startsWith("Pixel") && Build.VERSION.SDK_INT == 33) {
            return m50186g();
        }
        int i = Build.VERSION.SDK_INT;
        if (i >= 30 && i < 33) {
            return true;
        }
        return false;
    }

    /* renamed from: g */
    public static boolean m50186g() {
        for (String str : f42390e) {
            if (Build.ID.startsWith(str)) {
                return true;
            }
        }
        return false;
    }

    public static ResourceDecoder<ParcelFileDescriptor, Bitmap> parcel(BitmapPool bitmapPool) {
        return new VideoDecoder(bitmapPool, new C5884g());
    }

    /* renamed from: b */
    public final Bitmap m50191b(Object obj, MediaMetadataRetriever mediaMetadataRetriever, long j, int i, int i2, int i3, DownsampleStrategy downsampleStrategy) {
        Bitmap bitmap;
        if (!m50185h(obj, mediaMetadataRetriever)) {
            if (Build.VERSION.SDK_INT >= 27 && i2 != Integer.MIN_VALUE && i3 != Integer.MIN_VALUE && downsampleStrategy != DownsampleStrategy.NONE) {
                bitmap = m50189d(mediaMetadataRetriever, j, i, i2, i3, downsampleStrategy);
            } else {
                bitmap = null;
            }
            if (bitmap == null) {
                bitmap = m50190c(mediaMetadataRetriever, j, i);
            }
            Bitmap m50192a = m50192a(mediaMetadataRetriever, bitmap);
            if (m50192a != null) {
                return m50192a;
            }
            throw new VideoDecoderException();
        }
        throw new IllegalStateException("Cannot decode VP8 video on CrOS.");
    }

    @Override // com.bumptech.glide.load.ResourceDecoder
    public Resource<Bitmap> decode(@NonNull T t, int i, int i2, @NonNull Options options) throws IOException {
        long longValue = ((Long) options.get(TARGET_FRAME)).longValue();
        if (longValue < 0 && longValue != -1) {
            throw new IllegalArgumentException("Requested frame must be non-negative, or DEFAULT_FRAME, given: " + longValue);
        }
        Integer num = (Integer) options.get(FRAME_OPTION);
        if (num == null) {
            num = 2;
        }
        DownsampleStrategy downsampleStrategy = (DownsampleStrategy) options.get(DownsampleStrategy.OPTION);
        if (downsampleStrategy == null) {
            downsampleStrategy = DownsampleStrategy.DEFAULT;
        }
        DownsampleStrategy downsampleStrategy2 = downsampleStrategy;
        MediaMetadataRetriever m50177a = this.f42393c.m50177a();
        try {
            this.f42391a.mo50175b(m50177a, t);
            return BitmapResource.obtain(m50191b(t, m50177a, longValue, num.intValue(), i, i2, downsampleStrategy2), this.f42392b);
        } finally {
            if (Build.VERSION.SDK_INT >= 29) {
                m50177a.release();
            } else {
                m50177a.release();
            }
        }
    }

    /* renamed from: h */
    public final boolean m50185h(Object obj, MediaMetadataRetriever mediaMetadataRetriever) {
        String str = Build.DEVICE;
        if (str == null || !str.matches(".+_cheets|cheets_.+")) {
            return false;
        }
        MediaExtractor mediaExtractor = null;
        if (!"video/webm".equals(mediaMetadataRetriever.extractMetadata(12))) {
            return false;
        }
        MediaExtractor mediaExtractor2 = new MediaExtractor();
        try {
            this.f42391a.mo50176a(mediaExtractor2, obj);
            int trackCount = mediaExtractor2.getTrackCount();
            for (int i = 0; i < trackCount; i++) {
                if ("video/x-vnd.on2.vp8".equals(mediaExtractor2.getTrackFormat(i).getString("mime"))) {
                    mediaExtractor2.release();
                    return true;
                }
            }
            mediaExtractor2.release();
        } catch (Throwable unused) {
            mediaExtractor = mediaExtractor2;
            try {
                Log.isLoggable("VideoDecoder", 3);
                return false;
            } finally {
                if (mediaExtractor != null) {
                    mediaExtractor.release();
                }
            }
        }
        return false;
    }

    @Override // com.bumptech.glide.load.ResourceDecoder
    public boolean handles(@NonNull T t, @NonNull Options options) {
        return true;
    }

    public VideoDecoder(BitmapPool bitmapPool, InterfaceC5882e interfaceC5882e, C5883f c5883f) {
        this.f42392b = bitmapPool;
        this.f42391a = interfaceC5882e;
        this.f42393c = c5883f;
    }
}

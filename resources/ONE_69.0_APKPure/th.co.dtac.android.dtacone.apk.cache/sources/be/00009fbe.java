package com.google.android.gms.vision;

import android.graphics.Bitmap;
import android.graphics.Color;
import android.media.Image;
import androidx.annotation.RecentlyNonNull;
import androidx.annotation.RecentlyNullable;
import androidx.annotation.RequiresApi;
import com.google.android.gms.common.annotation.KeepForSdk;
import java.nio.ByteBuffer;

/* loaded from: classes4.dex */
public class Frame {
    public static final int ROTATION_0 = 0;
    public static final int ROTATION_180 = 2;
    public static final int ROTATION_270 = 3;
    public static final int ROTATION_90 = 1;

    /* renamed from: a */
    public final Metadata f48646a;

    /* renamed from: b */
    public ByteBuffer f48647b;

    /* renamed from: c */
    public C6767a f48648c;

    /* renamed from: d */
    public Bitmap f48649d;

    /* loaded from: classes4.dex */
    public static class Builder {

        /* renamed from: a */
        public final Frame f48650a = new Frame();

        @RecentlyNonNull
        public Frame build() {
            if (this.f48650a.f48647b == null && this.f48650a.f48649d == null && this.f48650a.f48648c == null) {
                throw new IllegalStateException("Missing image data.  Call either setBitmap or setImageData to specify the image");
            }
            return this.f48650a;
        }

        @RecentlyNonNull
        public Builder setBitmap(@RecentlyNonNull Bitmap bitmap) {
            int width = bitmap.getWidth();
            int height = bitmap.getHeight();
            this.f48650a.f48649d = bitmap;
            Metadata metadata = this.f48650a.getMetadata();
            metadata.f48651a = width;
            metadata.f48652b = height;
            return this;
        }

        @RecentlyNonNull
        public Builder setId(int i) {
            this.f48650a.getMetadata().f48653c = i;
            return this;
        }

        @RecentlyNonNull
        public Builder setImageData(@RecentlyNonNull ByteBuffer byteBuffer, int i, int i2, int i3) {
            if (byteBuffer != null) {
                if (byteBuffer.capacity() >= i * i2) {
                    if (i3 == 16 || i3 == 17 || i3 == 842094169) {
                        this.f48650a.f48647b = byteBuffer;
                        Metadata metadata = this.f48650a.getMetadata();
                        metadata.f48651a = i;
                        metadata.f48652b = i2;
                        metadata.f48656f = i3;
                        return this;
                    }
                    StringBuilder sb = new StringBuilder(37);
                    sb.append("Unsupported image format: ");
                    sb.append(i3);
                    throw new IllegalArgumentException(sb.toString());
                }
                throw new IllegalArgumentException("Invalid image data size.");
            }
            throw new IllegalArgumentException("Null image data supplied.");
        }

        @RecentlyNonNull
        @RequiresApi(19)
        @KeepForSdk
        public Builder setPlanes(@RecentlyNonNull Image.Plane[] planeArr, int i, int i2, int i3) {
            if (planeArr != null) {
                if (planeArr.length == 3) {
                    if (planeArr[0].getBuffer().capacity() >= i * i2) {
                        this.f48650a.f48648c = new C6767a(planeArr);
                        Metadata metadata = this.f48650a.getMetadata();
                        metadata.f48651a = i;
                        metadata.f48652b = i2;
                        metadata.f48656f = i3;
                        return this;
                    }
                    throw new IllegalArgumentException("Invalid image data size.");
                }
                throw new IllegalArgumentException("Only android.graphics.ImageFormat#YUV_420_888 is supported which should have 3 planes.");
            }
            throw new IllegalArgumentException("Null image data supplied.");
        }

        @RecentlyNonNull
        public Builder setRotation(int i) {
            this.f48650a.getMetadata().f48655e = i;
            return this;
        }

        @RecentlyNonNull
        public Builder setTimestampMillis(long j) {
            this.f48650a.getMetadata().f48654d = j;
            return this;
        }
    }

    /* renamed from: com.google.android.gms.vision.Frame$a */
    /* loaded from: classes4.dex */
    public static class C6767a {

        /* renamed from: a */
        public final Image.Plane[] f48657a;

        public C6767a(Image.Plane[] planeArr) {
            this.f48657a = planeArr;
        }

        /* renamed from: a */
        public final Image.Plane[] m45997a() {
            return this.f48657a;
        }
    }

    public Frame() {
        this.f48646a = new Metadata();
        this.f48647b = null;
        this.f48648c = null;
        this.f48649d = null;
    }

    @RecentlyNullable
    public Bitmap getBitmap() {
        return this.f48649d;
    }

    @RecentlyNullable
    public ByteBuffer getGrayscaleImageData() {
        Bitmap bitmap = this.f48649d;
        if (bitmap != null) {
            if (bitmap == null) {
                return null;
            }
            int width = bitmap.getWidth();
            int height = this.f48649d.getHeight();
            int i = width * height;
            int[] iArr = new int[i];
            this.f48649d.getPixels(iArr, 0, width, 0, 0, width, height);
            byte[] bArr = new byte[i];
            for (int i2 = 0; i2 < i; i2++) {
                bArr[i2] = (byte) ((Color.red(iArr[i2]) * 0.299f) + (Color.green(iArr[i2]) * 0.587f) + (Color.blue(iArr[i2]) * 0.114f));
            }
            return ByteBuffer.wrap(bArr);
        }
        return this.f48647b;
    }

    @RecentlyNonNull
    public Metadata getMetadata() {
        return this.f48646a;
    }

    @RecentlyNullable
    @RequiresApi(19)
    @KeepForSdk
    public Image.Plane[] getPlanes() {
        C6767a c6767a = this.f48648c;
        if (c6767a == null) {
            return null;
        }
        return c6767a.m45997a();
    }

    /* loaded from: classes4.dex */
    public static class Metadata {

        /* renamed from: a */
        public int f48651a;

        /* renamed from: b */
        public int f48652b;

        /* renamed from: c */
        public int f48653c;

        /* renamed from: d */
        public long f48654d;

        /* renamed from: e */
        public int f48655e;

        /* renamed from: f */
        public int f48656f;

        public Metadata() {
            this.f48656f = -1;
        }

        public int getFormat() {
            return this.f48656f;
        }

        public int getHeight() {
            return this.f48652b;
        }

        public int getId() {
            return this.f48653c;
        }

        public int getRotation() {
            return this.f48655e;
        }

        public long getTimestampMillis() {
            return this.f48654d;
        }

        public int getWidth() {
            return this.f48651a;
        }

        public final void zza() {
            if (this.f48655e % 2 != 0) {
                int i = this.f48651a;
                this.f48651a = this.f48652b;
                this.f48652b = i;
            }
            this.f48655e = 0;
        }

        public Metadata(@RecentlyNonNull Metadata metadata) {
            this.f48656f = -1;
            this.f48651a = metadata.getWidth();
            this.f48652b = metadata.getHeight();
            this.f48653c = metadata.getId();
            this.f48654d = metadata.getTimestampMillis();
            this.f48655e = metadata.getRotation();
            this.f48656f = metadata.getFormat();
        }
    }
}
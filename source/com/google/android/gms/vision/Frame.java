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
    public final Metadata f48634a;

    /* renamed from: b */
    public ByteBuffer f48635b;

    /* renamed from: c */
    public C6778a f48636c;

    /* renamed from: d */
    public Bitmap f48637d;

    /* loaded from: classes4.dex */
    public static class Builder {

        /* renamed from: a */
        public final Frame f48638a = new Frame();

        @RecentlyNonNull
        public Frame build() {
            if (this.f48638a.f48635b == null && this.f48638a.f48637d == null && this.f48638a.f48636c == null) {
                throw new IllegalStateException("Missing image data.  Call either setBitmap or setImageData to specify the image");
            }
            return this.f48638a;
        }

        @RecentlyNonNull
        public Builder setBitmap(@RecentlyNonNull Bitmap bitmap) {
            int width = bitmap.getWidth();
            int height = bitmap.getHeight();
            this.f48638a.f48637d = bitmap;
            Metadata metadata = this.f48638a.getMetadata();
            metadata.f48639a = width;
            metadata.f48640b = height;
            return this;
        }

        @RecentlyNonNull
        public Builder setId(int i) {
            this.f48638a.getMetadata().f48641c = i;
            return this;
        }

        @RecentlyNonNull
        public Builder setImageData(@RecentlyNonNull ByteBuffer byteBuffer, int i, int i2, int i3) {
            if (byteBuffer != null) {
                if (byteBuffer.capacity() >= i * i2) {
                    if (i3 == 16 || i3 == 17 || i3 == 842094169) {
                        this.f48638a.f48635b = byteBuffer;
                        Metadata metadata = this.f48638a.getMetadata();
                        metadata.f48639a = i;
                        metadata.f48640b = i2;
                        metadata.f48644f = i3;
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
                        this.f48638a.f48636c = new C6778a(planeArr);
                        Metadata metadata = this.f48638a.getMetadata();
                        metadata.f48639a = i;
                        metadata.f48640b = i2;
                        metadata.f48644f = i3;
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
            this.f48638a.getMetadata().f48643e = i;
            return this;
        }

        @RecentlyNonNull
        public Builder setTimestampMillis(long j) {
            this.f48638a.getMetadata().f48642d = j;
            return this;
        }
    }

    /* renamed from: com.google.android.gms.vision.Frame$a */
    /* loaded from: classes4.dex */
    public static class C6778a {

        /* renamed from: a */
        public final Image.Plane[] f48645a;

        public C6778a(Image.Plane[] planeArr) {
            this.f48645a = planeArr;
        }

        /* renamed from: a */
        public final Image.Plane[] m46012a() {
            return this.f48645a;
        }
    }

    public Frame() {
        this.f48634a = new Metadata();
        this.f48635b = null;
        this.f48636c = null;
        this.f48637d = null;
    }

    @RecentlyNullable
    public Bitmap getBitmap() {
        return this.f48637d;
    }

    @RecentlyNullable
    public ByteBuffer getGrayscaleImageData() {
        Bitmap bitmap = this.f48637d;
        if (bitmap != null) {
            if (bitmap == null) {
                return null;
            }
            int width = bitmap.getWidth();
            int height = this.f48637d.getHeight();
            int i = width * height;
            int[] iArr = new int[i];
            this.f48637d.getPixels(iArr, 0, width, 0, 0, width, height);
            byte[] bArr = new byte[i];
            for (int i2 = 0; i2 < i; i2++) {
                bArr[i2] = (byte) ((Color.red(iArr[i2]) * 0.299f) + (Color.green(iArr[i2]) * 0.587f) + (Color.blue(iArr[i2]) * 0.114f));
            }
            return ByteBuffer.wrap(bArr);
        }
        return this.f48635b;
    }

    @RecentlyNonNull
    public Metadata getMetadata() {
        return this.f48634a;
    }

    @RecentlyNullable
    @RequiresApi(19)
    @KeepForSdk
    public Image.Plane[] getPlanes() {
        C6778a c6778a = this.f48636c;
        if (c6778a == null) {
            return null;
        }
        return c6778a.m46012a();
    }

    /* loaded from: classes4.dex */
    public static class Metadata {

        /* renamed from: a */
        public int f48639a;

        /* renamed from: b */
        public int f48640b;

        /* renamed from: c */
        public int f48641c;

        /* renamed from: d */
        public long f48642d;

        /* renamed from: e */
        public int f48643e;

        /* renamed from: f */
        public int f48644f;

        public Metadata() {
            this.f48644f = -1;
        }

        public int getFormat() {
            return this.f48644f;
        }

        public int getHeight() {
            return this.f48640b;
        }

        public int getId() {
            return this.f48641c;
        }

        public int getRotation() {
            return this.f48643e;
        }

        public long getTimestampMillis() {
            return this.f48642d;
        }

        public int getWidth() {
            return this.f48639a;
        }

        public final void zza() {
            if (this.f48643e % 2 != 0) {
                int i = this.f48639a;
                this.f48639a = this.f48640b;
                this.f48640b = i;
            }
            this.f48643e = 0;
        }

        public Metadata(@RecentlyNonNull Metadata metadata) {
            this.f48644f = -1;
            this.f48639a = metadata.getWidth();
            this.f48640b = metadata.getHeight();
            this.f48641c = metadata.getId();
            this.f48642d = metadata.getTimestampMillis();
            this.f48643e = metadata.getRotation();
            this.f48644f = metadata.getFormat();
        }
    }
}

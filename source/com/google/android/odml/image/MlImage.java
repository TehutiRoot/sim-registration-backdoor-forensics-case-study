package com.google.android.odml.image;

import android.graphics.Rect;
import androidx.annotation.NonNull;
import java.io.Closeable;
import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;
import java.util.Collections;
import java.util.List;

/* loaded from: classes4.dex */
public class MlImage implements Closeable {
    public static final int IMAGE_FORMAT_ALPHA = 8;
    public static final int IMAGE_FORMAT_JPEG = 9;
    public static final int IMAGE_FORMAT_NV12 = 3;
    public static final int IMAGE_FORMAT_NV21 = 4;
    public static final int IMAGE_FORMAT_RGB = 2;
    public static final int IMAGE_FORMAT_RGBA = 1;
    public static final int IMAGE_FORMAT_UNKNOWN = 0;
    public static final int IMAGE_FORMAT_YUV_420_888 = 7;
    public static final int IMAGE_FORMAT_YV12 = 5;
    public static final int IMAGE_FORMAT_YV21 = 6;
    public static final int STORAGE_TYPE_BITMAP = 1;
    public static final int STORAGE_TYPE_BYTEBUFFER = 2;
    public static final int STORAGE_TYPE_MEDIA_IMAGE = 3;

    /* renamed from: a */
    public final Sp2 f51591a;

    /* renamed from: b */
    public final int f51592b;

    /* renamed from: c */
    public final Rect f51593c;

    /* renamed from: d */
    public final int f51594d;

    /* renamed from: e */
    public final int f51595e;

    /* renamed from: f */
    public int f51596f;

    @Retention(RetentionPolicy.SOURCE)
    /* loaded from: classes4.dex */
    public @interface ImageFormat {
    }

    /* loaded from: classes4.dex */
    public static final class Internal {

        /* renamed from: a */
        public final MlImage f51597a;

        public /* synthetic */ Internal(MlImage mlImage, AbstractC20478iz2 abstractC20478iz2) {
            this.f51597a = mlImage;
        }

        public void acquire() {
            this.f51597a.m43415i();
        }
    }

    @Retention(RetentionPolicy.SOURCE)
    /* loaded from: classes4.dex */
    public @interface StorageType {
    }

    public MlImage(Sp2 sp2, int i, Rect rect, long j, int i2, int i3) {
        this.f51591a = sp2;
        this.f51592b = i;
        Rect rect2 = new Rect();
        this.f51593c = rect2;
        rect2.set(rect);
        this.f51594d = i2;
        this.f51595e = i3;
        this.f51596f = 1;
    }

    /* renamed from: g */
    public static void m43416g(int i) {
        if (i != 0 && i != 90 && i != 180 && i != 270) {
            StringBuilder sb = new StringBuilder(68);
            sb.append("Rotation value ");
            sb.append(i);
            sb.append(" is not valid. Use only 0, 90, 180 or 270.");
            throw new IllegalArgumentException(sb.toString());
        }
    }

    /* renamed from: b */
    public final Sp2 m43418b() {
        return this.f51591a;
    }

    @Override // java.io.Closeable, java.lang.AutoCloseable
    public synchronized void close() {
        int i = this.f51596f - 1;
        this.f51596f = i;
        if (i == 0) {
            this.f51591a.zzc();
        }
    }

    @NonNull
    public List<ImageProperties> getContainedImageProperties() {
        return Collections.singletonList(this.f51591a.zzb());
    }

    public int getHeight() {
        return this.f51595e;
    }

    @NonNull
    public Internal getInternal() {
        return new Internal(this, null);
    }

    public int getRotation() {
        return this.f51592b;
    }

    public int getWidth() {
        return this.f51594d;
    }

    /* renamed from: i */
    public final synchronized void m43415i() {
        this.f51596f++;
    }
}

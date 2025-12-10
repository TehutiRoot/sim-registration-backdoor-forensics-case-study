package com.google.firebase.p015ml.vision.common;

import android.annotation.TargetApi;
import android.content.Context;
import android.graphics.Bitmap;
import android.graphics.BitmapFactory;
import android.graphics.Matrix;
import android.media.Image;
import android.net.Uri;
import android.os.SystemClock;
import android.util.Pair;
import androidx.annotation.NonNull;
import androidx.annotation.RequiresApi;
import com.google.android.gms.common.internal.Preconditions;
import com.google.android.gms.internal.firebase_ml.zzsk;
import com.google.android.gms.internal.firebase_ml.zzsl;
import com.google.android.gms.vision.Frame;
import com.google.firebase.p015ml.vision.common.FirebaseVisionImageMetadata;
import java.io.IOException;
import java.nio.ByteBuffer;
import javax.annotation.concurrent.Immutable;
import th.p047co.dtac.android.dtacone.util.bitmap.BitmapUtil;

@Immutable
/* renamed from: com.google.firebase.ml.vision.common.FirebaseVisionImage */
/* loaded from: classes4.dex */
public class FirebaseVisionImage {

    /* renamed from: g */
    public static final zzsk f55918g = zzsk.zzra();

    /* renamed from: a */
    public volatile Bitmap f55919a;

    /* renamed from: b */
    public volatile ByteBuffer f55920b;

    /* renamed from: c */
    public volatile FirebaseVisionImageMetadata f55921c;

    /* renamed from: d */
    public volatile Frame f55922d;

    /* renamed from: e */
    public volatile byte[] f55923e;

    /* renamed from: f */
    public final long f55924f;

    public FirebaseVisionImage(ByteBuffer byteBuffer, FirebaseVisionImageMetadata firebaseVisionImageMetadata) {
        this.f55924f = SystemClock.elapsedRealtime();
        this.f55920b = (ByteBuffer) Preconditions.checkNotNull(byteBuffer);
        this.f55921c = (FirebaseVisionImageMetadata) Preconditions.checkNotNull(firebaseVisionImageMetadata);
    }

    /* renamed from: a */
    public static Bitmap m38342a(Bitmap bitmap, int i) {
        int i2;
        if (i != 0) {
            if (i != 1) {
                if (i != 2) {
                    if (i == 3) {
                        i2 = BitmapUtil.IMAGE_270_DEGREE;
                    } else {
                        StringBuilder sb = new StringBuilder(29);
                        sb.append("Invalid rotation: ");
                        sb.append(i);
                        throw new IllegalArgumentException(sb.toString());
                    }
                } else {
                    i2 = BitmapUtil.IMAGE_180_DEGREE;
                }
            } else {
                i2 = 90;
            }
        } else {
            i2 = 0;
        }
        if (i2 == 0) {
            return bitmap;
        }
        Matrix matrix = new Matrix();
        matrix.postRotate(i2);
        return Bitmap.createBitmap(bitmap, 0, 0, bitmap.getWidth(), bitmap.getHeight(), matrix, true);
    }

    @NonNull
    public static FirebaseVisionImage fromBitmap(@NonNull Bitmap bitmap) {
        return new FirebaseVisionImage(bitmap);
    }

    @NonNull
    public static FirebaseVisionImage fromByteArray(@NonNull byte[] bArr, @NonNull FirebaseVisionImageMetadata firebaseVisionImageMetadata) {
        return new FirebaseVisionImage(bArr, firebaseVisionImageMetadata);
    }

    @NonNull
    public static FirebaseVisionImage fromByteBuffer(@NonNull ByteBuffer byteBuffer, @NonNull FirebaseVisionImageMetadata firebaseVisionImageMetadata) {
        return new FirebaseVisionImage(byteBuffer, firebaseVisionImageMetadata);
    }

    @NonNull
    public static FirebaseVisionImage fromFilePath(@NonNull Context context, @NonNull Uri uri) throws IOException {
        Preconditions.checkNotNull(context, "Please provide a valid Context");
        Preconditions.checkNotNull(uri, "Please provide a valid imageUri");
        zzsl.zzrb();
        return new FirebaseVisionImage(zzsl.zza(context.getContentResolver(), uri));
    }

    @NonNull
    @RequiresApi(19)
    @TargetApi(19)
    public static FirebaseVisionImage fromMediaImage(@NonNull Image image, @FirebaseVisionImageMetadata.Rotation int i) {
        boolean z;
        Preconditions.checkNotNull(image, "Please provide a valid image");
        if (image.getFormat() != 256 && image.getFormat() != 35) {
            z = false;
        } else {
            z = true;
        }
        Preconditions.checkArgument(z, "Only JPEG and YUV_420_888 are supported now");
        Image.Plane[] planes = image.getPlanes();
        if (image.getFormat() == 256) {
            if (planes != null && planes.length == 1) {
                ByteBuffer buffer = planes[0].getBuffer();
                int remaining = buffer.remaining();
                byte[] bArr = new byte[remaining];
                buffer.get(bArr);
                if (i == 0) {
                    return new FirebaseVisionImage(bArr);
                }
                return new FirebaseVisionImage(m38342a(BitmapFactory.decodeByteArray(bArr, 0, remaining), i));
            }
            throw new IllegalArgumentException("Unexpected image format, JPEG should have exactly 1 image plane");
        }
        return new FirebaseVisionImage(zzsk.zza(planes, image.getWidth(), image.getHeight()), new FirebaseVisionImageMetadata.Builder().setFormat(17).setWidth(image.getWidth()).setHeight(image.getHeight()).setRotation(i).build());
    }

    /* renamed from: b */
    public final byte[] m38341b(boolean z) {
        if (this.f55923e != null) {
            return this.f55923e;
        }
        synchronized (this) {
            try {
                if (this.f55923e != null) {
                    return this.f55923e;
                } else if (this.f55920b != null && (!z || this.f55921c.getRotation() == 0)) {
                    byte[] zza = zzsk.zza(this.f55920b);
                    int format = this.f55921c.getFormat();
                    if (format != 17) {
                        if (format == 842094169) {
                            zza = zzsk.zzf(zza);
                        } else {
                            throw new IllegalStateException("Must be one of: IMAGE_FORMAT_NV21, IMAGE_FORMAT_YV12");
                        }
                    }
                    byte[] zza2 = zzsk.zza(zza, this.f55921c.getWidth(), this.f55921c.getHeight());
                    if (this.f55921c.getRotation() == 0) {
                        this.f55923e = zza2;
                    }
                    return zza2;
                } else {
                    byte[] zza3 = zzsk.zza(m38340c());
                    this.f55923e = zza3;
                    return zza3;
                }
            } catch (Throwable th2) {
                throw th2;
            }
        }
    }

    /* renamed from: c */
    public final Bitmap m38340c() {
        if (this.f55919a != null) {
            return this.f55919a;
        }
        synchronized (this) {
            try {
                if (this.f55919a == null) {
                    byte[] m38341b = m38341b(false);
                    Bitmap decodeByteArray = BitmapFactory.decodeByteArray(m38341b, 0, m38341b.length);
                    if (this.f55921c != null) {
                        decodeByteArray = m38342a(decodeByteArray, this.f55921c.getRotation());
                    }
                    this.f55919a = decodeByteArray;
                }
            } catch (Throwable th2) {
                throw th2;
            }
        }
        return this.f55919a;
    }

    @NonNull
    public Bitmap getBitmap() {
        return m38340c();
    }

    public final synchronized Frame zza(boolean z, boolean z2) {
        boolean z3;
        int i = 1;
        if (z && z2) {
            z3 = false;
        } else {
            z3 = true;
        }
        try {
            Preconditions.checkArgument(z3, "Can't restrict to bitmap-only and NV21 byte buffer-only");
            if (this.f55922d == null) {
                Frame.Builder builder = new Frame.Builder();
                if (this.f55920b != null && !z) {
                    int i2 = 842094169;
                    if (z2 && this.f55921c.getFormat() != 17) {
                        if (this.f55921c.getFormat() == 842094169) {
                            this.f55920b = ByteBuffer.wrap(zzsk.zzf(zzsk.zza(this.f55920b)));
                            this.f55921c = new FirebaseVisionImageMetadata.Builder().setFormat(17).setWidth(this.f55921c.getWidth()).setHeight(this.f55921c.getHeight()).setRotation(this.f55921c.getRotation()).build();
                        } else {
                            throw new IllegalStateException("Must be one of: IMAGE_FORMAT_NV21, IMAGE_FORMAT_YV12");
                        }
                    }
                    ByteBuffer byteBuffer = this.f55920b;
                    int width = this.f55921c.getWidth();
                    int height = this.f55921c.getHeight();
                    int format = this.f55921c.getFormat();
                    if (format != 17) {
                        if (format != 842094169) {
                            i2 = 0;
                        }
                    } else {
                        i2 = 17;
                    }
                    builder.setImageData(byteBuffer, width, height, i2);
                    int rotation = this.f55921c.getRotation();
                    if (rotation != 0) {
                        if (rotation != 1) {
                            i = 2;
                            if (rotation != 2) {
                                i = 3;
                                if (rotation != 3) {
                                    StringBuilder sb = new StringBuilder(29);
                                    sb.append("Invalid rotation: ");
                                    sb.append(rotation);
                                    throw new IllegalArgumentException(sb.toString());
                                }
                            }
                        }
                    } else {
                        i = 0;
                    }
                    builder.setRotation(i);
                } else {
                    builder.setBitmap(m38340c());
                }
                builder.setTimestampMillis(this.f55924f);
                this.f55922d = builder.build();
            }
        } catch (Throwable th2) {
            throw th2;
        }
        return this.f55922d;
    }

    public final Pair<byte[], Float> zze(int i, int i2) {
        int width;
        int height;
        byte[] m38341b;
        boolean z;
        if (this.f55921c != null) {
            if (this.f55921c.getRotation() != 1 && this.f55921c.getRotation() != 3) {
                z = false;
            } else {
                z = true;
            }
            FirebaseVisionImageMetadata firebaseVisionImageMetadata = this.f55921c;
            if (z) {
                width = firebaseVisionImageMetadata.getHeight();
            } else {
                width = firebaseVisionImageMetadata.getWidth();
            }
            if (z) {
                height = this.f55921c.getWidth();
            } else {
                height = this.f55921c.getHeight();
            }
        } else {
            width = m38340c().getWidth();
            height = m38340c().getHeight();
        }
        float min = Math.min(i / width, i2 / height);
        if (min < 1.0f) {
            Bitmap m38340c = m38340c();
            Matrix matrix = new Matrix();
            matrix.postScale(min, min);
            m38341b = zzsk.zza(Bitmap.createBitmap(m38340c, 0, 0, this.f55919a.getWidth(), this.f55919a.getHeight(), matrix, true));
        } else {
            m38341b = m38341b(true);
            min = 1.0f;
        }
        return Pair.create(m38341b, Float.valueOf(min));
    }

    public final void zzqy() {
        if (this.f55920b != null) {
            ByteBuffer byteBuffer = this.f55920b;
            ByteBuffer allocate = ByteBuffer.allocate(byteBuffer.capacity());
            byteBuffer.rewind();
            allocate.put(byteBuffer);
            byteBuffer.rewind();
            allocate.flip();
            this.f55920b = allocate;
        }
    }

    public FirebaseVisionImage(byte[] bArr, FirebaseVisionImageMetadata firebaseVisionImageMetadata) {
        this(ByteBuffer.wrap((byte[]) Preconditions.checkNotNull(bArr)), firebaseVisionImageMetadata);
    }

    public FirebaseVisionImage(Bitmap bitmap) {
        this.f55924f = SystemClock.elapsedRealtime();
        this.f55919a = (Bitmap) Preconditions.checkNotNull(bitmap);
    }

    public FirebaseVisionImage(byte[] bArr) {
        this.f55924f = SystemClock.elapsedRealtime();
        this.f55923e = (byte[]) Preconditions.checkNotNull(bArr);
    }
}

package com.google.mlkit.vision.common.internal;

import android.graphics.Bitmap;
import android.graphics.Matrix;
import android.media.Image;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import com.google.android.gms.common.annotation.KeepForSdk;
import com.google.android.gms.common.internal.GmsLogger;
import com.google.android.gms.common.internal.Preconditions;
import com.google.android.gms.dynamic.IObjectWrapper;
import com.google.android.gms.dynamic.ObjectWrapper;
import com.google.mlkit.common.MlKitException;
import com.google.mlkit.vision.common.InputImage;
import java.nio.ByteBuffer;

@KeepForSdk
/* loaded from: classes4.dex */
public class ImageUtils {

    /* renamed from: a */
    public static final GmsLogger f57103a = new GmsLogger("MLKitImageUtils", "");

    /* renamed from: b */
    public static final ImageUtils f57104b = new ImageUtils();

    @NonNull
    @KeepForSdk
    public static ImageUtils getInstance() {
        return f57104b;
    }

    @NonNull
    @KeepForSdk
    public IObjectWrapper getImageDataWrapper(@NonNull InputImage inputImage) throws MlKitException {
        int format = inputImage.getFormat();
        if (format != -1) {
            if (format != 17) {
                if (format != 35) {
                    if (format != 842094169) {
                        int format2 = inputImage.getFormat();
                        throw new MlKitException("Unsupported image format: " + format2, 3);
                    }
                } else {
                    return ObjectWrapper.wrap(inputImage.getMediaImage());
                }
            }
            return ObjectWrapper.wrap((ByteBuffer) Preconditions.checkNotNull(inputImage.getByteBuffer()));
        }
        return ObjectWrapper.wrap((Bitmap) Preconditions.checkNotNull(inputImage.getBitmapInternal()));
    }

    @KeepForSdk
    public int getMobileVisionImageFormat(@NonNull InputImage inputImage) {
        return inputImage.getFormat();
    }

    @KeepForSdk
    public int getMobileVisionImageSize(@NonNull InputImage inputImage) {
        if (inputImage.getFormat() == -1) {
            return ((Bitmap) Preconditions.checkNotNull(inputImage.getBitmapInternal())).getAllocationByteCount();
        }
        if (inputImage.getFormat() != 17 && inputImage.getFormat() != 842094169) {
            if (inputImage.getFormat() != 35) {
                return 0;
            }
            return (((Image.Plane[]) Preconditions.checkNotNull(inputImage.getPlanes()))[0].getBuffer().limit() * 3) / 2;
        }
        return ((ByteBuffer) Preconditions.checkNotNull(inputImage.getByteBuffer())).limit();
    }

    @Nullable
    @KeepForSdk
    public Matrix getUprightRotationMatrix(int i, int i2, int i3) {
        int i4;
        if (i3 == 0) {
            return null;
        }
        Matrix matrix = new Matrix();
        matrix.postTranslate((-i) / 2.0f, (-i2) / 2.0f);
        matrix.postRotate(i3 * 90);
        int i5 = i3 % 2;
        if (i5 != 0) {
            i4 = i2;
        } else {
            i4 = i;
        }
        if (i5 == 0) {
            i = i2;
        }
        matrix.postTranslate(i4 / 2.0f, i / 2.0f);
        return matrix;
    }

    /* JADX WARN: Removed duplicated region for block: B:100:0x0089  */
    /* JADX WARN: Removed duplicated region for block: B:101:0x008b A[Catch: FileNotFoundException -> 0x0026, TryCatch #4 {FileNotFoundException -> 0x0026, blocks: (B:66:0x0006, B:68:0x000c, B:70:0x0019, B:98:0x0071, B:99:0x0086, B:110:0x00b7, B:112:0x00c1, B:101:0x008b, B:102:0x008f, B:103:0x0096, B:104:0x009a, B:105:0x00a1, B:106:0x00a5, B:108:0x00ac, B:97:0x006b, B:94:0x0059, B:114:0x00c6, B:115:0x00cd), top: B:121:0x0006 }] */
    /* JADX WARN: Removed duplicated region for block: B:102:0x008f A[Catch: FileNotFoundException -> 0x0026, TryCatch #4 {FileNotFoundException -> 0x0026, blocks: (B:66:0x0006, B:68:0x000c, B:70:0x0019, B:98:0x0071, B:99:0x0086, B:110:0x00b7, B:112:0x00c1, B:101:0x008b, B:102:0x008f, B:103:0x0096, B:104:0x009a, B:105:0x00a1, B:106:0x00a5, B:108:0x00ac, B:97:0x006b, B:94:0x0059, B:114:0x00c6, B:115:0x00cd), top: B:121:0x0006 }] */
    /* JADX WARN: Removed duplicated region for block: B:103:0x0096 A[Catch: FileNotFoundException -> 0x0026, TryCatch #4 {FileNotFoundException -> 0x0026, blocks: (B:66:0x0006, B:68:0x000c, B:70:0x0019, B:98:0x0071, B:99:0x0086, B:110:0x00b7, B:112:0x00c1, B:101:0x008b, B:102:0x008f, B:103:0x0096, B:104:0x009a, B:105:0x00a1, B:106:0x00a5, B:108:0x00ac, B:97:0x006b, B:94:0x0059, B:114:0x00c6, B:115:0x00cd), top: B:121:0x0006 }] */
    /* JADX WARN: Removed duplicated region for block: B:104:0x009a A[Catch: FileNotFoundException -> 0x0026, TryCatch #4 {FileNotFoundException -> 0x0026, blocks: (B:66:0x0006, B:68:0x000c, B:70:0x0019, B:98:0x0071, B:99:0x0086, B:110:0x00b7, B:112:0x00c1, B:101:0x008b, B:102:0x008f, B:103:0x0096, B:104:0x009a, B:105:0x00a1, B:106:0x00a5, B:108:0x00ac, B:97:0x006b, B:94:0x0059, B:114:0x00c6, B:115:0x00cd), top: B:121:0x0006 }] */
    /* JADX WARN: Removed duplicated region for block: B:105:0x00a1 A[Catch: FileNotFoundException -> 0x0026, TryCatch #4 {FileNotFoundException -> 0x0026, blocks: (B:66:0x0006, B:68:0x000c, B:70:0x0019, B:98:0x0071, B:99:0x0086, B:110:0x00b7, B:112:0x00c1, B:101:0x008b, B:102:0x008f, B:103:0x0096, B:104:0x009a, B:105:0x00a1, B:106:0x00a5, B:108:0x00ac, B:97:0x006b, B:94:0x0059, B:114:0x00c6, B:115:0x00cd), top: B:121:0x0006 }] */
    /* JADX WARN: Removed duplicated region for block: B:106:0x00a5 A[Catch: FileNotFoundException -> 0x0026, TryCatch #4 {FileNotFoundException -> 0x0026, blocks: (B:66:0x0006, B:68:0x000c, B:70:0x0019, B:98:0x0071, B:99:0x0086, B:110:0x00b7, B:112:0x00c1, B:101:0x008b, B:102:0x008f, B:103:0x0096, B:104:0x009a, B:105:0x00a1, B:106:0x00a5, B:108:0x00ac, B:97:0x006b, B:94:0x0059, B:114:0x00c6, B:115:0x00cd), top: B:121:0x0006 }] */
    /* JADX WARN: Removed duplicated region for block: B:108:0x00ac A[Catch: FileNotFoundException -> 0x0026, TryCatch #4 {FileNotFoundException -> 0x0026, blocks: (B:66:0x0006, B:68:0x000c, B:70:0x0019, B:98:0x0071, B:99:0x0086, B:110:0x00b7, B:112:0x00c1, B:101:0x008b, B:102:0x008f, B:103:0x0096, B:104:0x009a, B:105:0x00a1, B:106:0x00a5, B:108:0x00ac, B:97:0x006b, B:94:0x0059, B:114:0x00c6, B:115:0x00cd), top: B:121:0x0006 }] */
    /* JADX WARN: Removed duplicated region for block: B:96:0x006a  */
    /* JADX WARN: Removed duplicated region for block: B:97:0x006b A[Catch: FileNotFoundException -> 0x0026, TryCatch #4 {FileNotFoundException -> 0x0026, blocks: (B:66:0x0006, B:68:0x000c, B:70:0x0019, B:98:0x0071, B:99:0x0086, B:110:0x00b7, B:112:0x00c1, B:101:0x008b, B:102:0x008f, B:103:0x0096, B:104:0x009a, B:105:0x00a1, B:106:0x00a5, B:108:0x00ac, B:97:0x006b, B:94:0x0059, B:114:0x00c6, B:115:0x00cd), top: B:121:0x0006 }] */
    @androidx.annotation.NonNull
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final android.graphics.Bitmap zza(@androidx.annotation.NonNull android.content.ContentResolver r13, @androidx.annotation.NonNull android.net.Uri r14) throws java.io.IOException {
        /*
            Method dump skipped, instructions count: 240
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.mlkit.vision.common.internal.ImageUtils.zza(android.content.ContentResolver, android.net.Uri):android.graphics.Bitmap");
    }
}

package com.google.android.gms.internal.firebase_ml;

import com.google.android.gms.common.internal.GmsLogger;

/* loaded from: classes3.dex */
public final class zzsl {

    /* renamed from: a */
    public static final GmsLogger f46040a = new GmsLogger("MLKitImageUtils", "");

    /* renamed from: b */
    public static zzsl f46041b = new zzsl();

    /* JADX WARN: Removed duplicated region for block: B:26:0x0061 A[RETURN] */
    /* JADX WARN: Removed duplicated region for block: B:27:0x0062  */
    /* renamed from: a */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public static int m47493a(android.content.ContentResolver r5, android.net.Uri r6) {
        /*
            java.lang.String r0 = r6.getScheme()
            java.lang.String r1 = "content"
            boolean r0 = r1.equals(r0)
            r1 = 0
            if (r0 != 0) goto L1a
            java.lang.String r0 = "file"
            java.lang.String r2 = r6.getScheme()
            boolean r0 = r0.equals(r2)
            if (r0 != 0) goto L1a
            return r1
        L1a:
            r0 = 0
            java.io.InputStream r5 = r5.openInputStream(r6)     // Catch: java.io.IOException -> L39
            androidx.exifinterface.media.ExifInterface r2 = new androidx.exifinterface.media.ExifInterface     // Catch: java.lang.Throwable -> L2d
            r2.<init>(r5)     // Catch: java.lang.Throwable -> L2d
            if (r5 == 0) goto L5f
            r5.close()     // Catch: java.io.IOException -> L2a
            goto L5f
        L2a:
            r5 = move-exception
            r0 = r2
            goto L3c
        L2d:
            r2 = move-exception
            if (r5 == 0) goto L3b
            r5.close()     // Catch: java.lang.Throwable -> L34
            goto L3b
        L34:
            r5 = move-exception
            com.google.android.gms.internal.firebase_ml.zznf.zza(r2, r5)     // Catch: java.io.IOException -> L39
            goto L3b
        L39:
            r5 = move-exception
            goto L3c
        L3b:
            throw r2     // Catch: java.io.IOException -> L39
        L3c:
            com.google.android.gms.common.internal.GmsLogger r2 = com.google.android.gms.internal.firebase_ml.zzsl.f46040a
            java.lang.String r6 = java.lang.String.valueOf(r6)
            int r3 = r6.length()
            int r3 = r3 + 48
            java.lang.StringBuilder r4 = new java.lang.StringBuilder
            r4.<init>(r3)
            java.lang.String r3 = "failed to open file to read rotation meta data: "
            r4.append(r3)
            r4.append(r6)
            java.lang.String r6 = r4.toString()
            java.lang.String r3 = "MLKitImageUtils"
            r2.m48402e(r3, r6, r5)
            r2 = r0
        L5f:
            if (r2 != 0) goto L62
            return r1
        L62:
            java.lang.String r5 = "Orientation"
            r6 = 1
            int r5 = r2.getAttributeInt(r5, r6)
            return r5
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.gms.internal.firebase_ml.zzsl.m47493a(android.content.ContentResolver, android.net.Uri):int");
    }

    /* JADX WARN: Removed duplicated region for block: B:17:0x0051 A[Catch: FileNotFoundException -> 0x0027, TryCatch #0 {FileNotFoundException -> 0x0027, blocks: (B:2:0x0000, B:3:0x001d, B:17:0x0051, B:19:0x005b, B:6:0x0023, B:9:0x0029, B:10:0x0030, B:11:0x0034, B:12:0x003b, B:13:0x003f, B:15:0x0046), top: B:24:0x0000 }] */
    /* JADX WARN: Removed duplicated region for block: B:26:? A[ADDED_TO_REGION, RETURN, SYNTHETIC] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public static android.graphics.Bitmap zza(android.content.ContentResolver r8, android.net.Uri r9) throws java.io.IOException {
        /*
            android.graphics.Bitmap r7 = android.provider.MediaStore.Images.Media.getBitmap(r8, r9)     // Catch: java.io.FileNotFoundException -> L27
            int r8 = m47493a(r8, r9)     // Catch: java.io.FileNotFoundException -> L27
            android.graphics.Matrix r0 = new android.graphics.Matrix     // Catch: java.io.FileNotFoundException -> L27
            r0.<init>()     // Catch: java.io.FileNotFoundException -> L27
            int r3 = r7.getWidth()     // Catch: java.io.FileNotFoundException -> L27
            int r4 = r7.getHeight()     // Catch: java.io.FileNotFoundException -> L27
            r1 = 1119092736(0x42b40000, float:90.0)
            r2 = -1028390912(0xffffffffc2b40000, float:-90.0)
            r5 = 1065353216(0x3f800000, float:1.0)
            r6 = -1082130432(0xffffffffbf800000, float:-1.0)
            switch(r8) {
                case 2: goto L46;
                case 3: goto L3f;
                case 4: goto L3b;
                case 5: goto L34;
                case 6: goto L30;
                case 7: goto L29;
                case 8: goto L23;
                default: goto L20;
            }     // Catch: java.io.FileNotFoundException -> L27
        L20:
            r8 = 0
        L21:
            r5 = r8
            goto L4f
        L23:
            r0.postRotate(r2)     // Catch: java.io.FileNotFoundException -> L27
            goto L44
        L27:
            r8 = move-exception
            goto L60
        L29:
            r0.postRotate(r2)     // Catch: java.io.FileNotFoundException -> L27
            r0.postScale(r6, r5)     // Catch: java.io.FileNotFoundException -> L27
            goto L44
        L30:
            r0.postRotate(r1)     // Catch: java.io.FileNotFoundException -> L27
            goto L44
        L34:
            r0.postRotate(r1)     // Catch: java.io.FileNotFoundException -> L27
            r0.postScale(r6, r5)     // Catch: java.io.FileNotFoundException -> L27
            goto L44
        L3b:
            r0.postScale(r5, r6)     // Catch: java.io.FileNotFoundException -> L27
            goto L44
        L3f:
            r8 = 1127481344(0x43340000, float:180.0)
            r0.postRotate(r8)     // Catch: java.io.FileNotFoundException -> L27
        L44:
            r5 = r0
            goto L4f
        L46:
            android.graphics.Matrix r8 = new android.graphics.Matrix     // Catch: java.io.FileNotFoundException -> L27
            r8.<init>()     // Catch: java.io.FileNotFoundException -> L27
            r8.postScale(r6, r5)     // Catch: java.io.FileNotFoundException -> L27
            goto L21
        L4f:
            if (r5 == 0) goto L5f
            r2 = 0
            r6 = 1
            r1 = 0
            r0 = r7
            android.graphics.Bitmap r8 = android.graphics.Bitmap.createBitmap(r0, r1, r2, r3, r4, r5, r6)     // Catch: java.io.FileNotFoundException -> L27
            if (r7 == r8) goto L5f
            r7.recycle()     // Catch: java.io.FileNotFoundException -> L27
            r7 = r8
        L5f:
            return r7
        L60:
            com.google.android.gms.common.internal.GmsLogger r0 = com.google.android.gms.internal.firebase_ml.zzsl.f46040a
            java.lang.String r9 = java.lang.String.valueOf(r9)
            int r1 = r9.length()
            int r1 = r1 + 21
            java.lang.StringBuilder r2 = new java.lang.StringBuilder
            r2.<init>(r1)
            java.lang.String r1 = "Could not open file: "
            r2.append(r1)
            r2.append(r9)
            java.lang.String r9 = r2.toString()
            java.lang.String r1 = "MLKitImageUtils"
            r0.m48402e(r1, r9, r8)
            throw r8
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.gms.internal.firebase_ml.zzsl.zza(android.content.ContentResolver, android.net.Uri):android.graphics.Bitmap");
    }

    public static zzsl zzrb() {
        return f46041b;
    }
}
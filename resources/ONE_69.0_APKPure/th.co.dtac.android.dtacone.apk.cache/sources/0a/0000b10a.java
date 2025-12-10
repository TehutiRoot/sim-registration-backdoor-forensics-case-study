package com.google.firebase.p015ml.common.internal.modeldownload;

import com.google.android.gms.common.internal.GmsLogger;
import com.google.android.gms.common.internal.Preconditions;
import java.io.File;
import java.io.IOException;

/* renamed from: com.google.firebase.ml.common.internal.modeldownload.zzaj */
/* loaded from: classes4.dex */
public final class zzaj {

    /* renamed from: b */
    public static final GmsLogger f55772b = new GmsLogger("RemoteModelUtils", "");

    /* renamed from: a */
    public final zzp f55773a;

    public zzaj(zzp zzpVar) {
        Preconditions.checkNotNull(zzpVar);
        this.f55773a = zzpVar;
    }

    /* renamed from: a */
    public static boolean m38387a(File file, String str) {
        String str2;
        String str3;
        String str4;
        try {
            str3 = m38385c(file);
        } catch (IOException unused) {
            GmsLogger gmsLogger = f55772b;
            String valueOf = String.valueOf(file.getAbsolutePath());
            if (valueOf.length() != 0) {
                str2 = "Failed to close the tmp FileInputStream: ".concat(valueOf);
            } else {
                str2 = new String("Failed to close the tmp FileInputStream: ");
            }
            gmsLogger.m48405d("RemoteModelUtils", str2);
            str3 = "";
        }
        GmsLogger gmsLogger2 = f55772b;
        String valueOf2 = String.valueOf(str3);
        if (valueOf2.length() != 0) {
            str4 = "Calculated hash value is: ".concat(valueOf2);
        } else {
            str4 = new String("Calculated hash value is: ");
        }
        gmsLogger2.m48405d("RemoteModelUtils", str4);
        return str.equals(str3);
    }

    /* JADX WARN: Not initialized variable reg: 3, insn: 0x001f: MOVE  (r1 I:??[OBJECT, ARRAY]) = (r3 I:??[OBJECT, ARRAY]), block:B:10:0x001f */
    /* JADX WARN: Removed duplicated region for block: B:37:0x007d  */
    /* renamed from: c */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public static java.lang.String m38385c(java.io.File r8) {
        /*
            java.lang.String r0 = "RemoteModelUtils"
            r1 = 0
            java.lang.String r2 = "SHA-256"
            java.security.MessageDigest r2 = java.security.MessageDigest.getInstance(r2)     // Catch: java.lang.Throwable -> L4f java.io.IOException -> L51 java.io.FileNotFoundException -> L5f java.security.NoSuchAlgorithmException -> L6d
            java.io.FileInputStream r3 = new java.io.FileInputStream     // Catch: java.lang.Throwable -> L4f java.io.IOException -> L51 java.io.FileNotFoundException -> L5f java.security.NoSuchAlgorithmException -> L6d
            r3.<init>(r8)     // Catch: java.lang.Throwable -> L4f java.io.IOException -> L51 java.io.FileNotFoundException -> L5f java.security.NoSuchAlgorithmException -> L6d
            r8 = 1024(0x400, float:1.435E-42)
            byte[] r8 = new byte[r8]     // Catch: java.lang.Throwable -> L1e java.io.IOException -> L52 java.io.FileNotFoundException -> L60 java.security.NoSuchAlgorithmException -> L6e
        L12:
            int r4 = r3.read(r8)     // Catch: java.lang.Throwable -> L1e java.io.IOException -> L52 java.io.FileNotFoundException -> L60 java.security.NoSuchAlgorithmException -> L6e
            r5 = -1
            r6 = 0
            if (r4 == r5) goto L21
            r2.update(r8, r6, r4)     // Catch: java.lang.Throwable -> L1e java.io.IOException -> L52 java.io.FileNotFoundException -> L60 java.security.NoSuchAlgorithmException -> L6e
            goto L12
        L1e:
            r8 = move-exception
            r1 = r3
            goto L7b
        L21:
            byte[] r8 = r2.digest()     // Catch: java.lang.Throwable -> L1e java.io.IOException -> L52 java.io.FileNotFoundException -> L60 java.security.NoSuchAlgorithmException -> L6e
            java.lang.StringBuilder r2 = new java.lang.StringBuilder     // Catch: java.lang.Throwable -> L1e java.io.IOException -> L52 java.io.FileNotFoundException -> L60 java.security.NoSuchAlgorithmException -> L6e
            r2.<init>()     // Catch: java.lang.Throwable -> L1e java.io.IOException -> L52 java.io.FileNotFoundException -> L60 java.security.NoSuchAlgorithmException -> L6e
        L2a:
            int r4 = r8.length     // Catch: java.lang.Throwable -> L1e java.io.IOException -> L52 java.io.FileNotFoundException -> L60 java.security.NoSuchAlgorithmException -> L6e
            if (r6 >= r4) goto L47
            r4 = r8[r6]     // Catch: java.lang.Throwable -> L1e java.io.IOException -> L52 java.io.FileNotFoundException -> L60 java.security.NoSuchAlgorithmException -> L6e
            r4 = r4 & 255(0xff, float:3.57E-43)
            java.lang.String r4 = java.lang.Integer.toHexString(r4)     // Catch: java.lang.Throwable -> L1e java.io.IOException -> L52 java.io.FileNotFoundException -> L60 java.security.NoSuchAlgorithmException -> L6e
            int r5 = r4.length()     // Catch: java.lang.Throwable -> L1e java.io.IOException -> L52 java.io.FileNotFoundException -> L60 java.security.NoSuchAlgorithmException -> L6e
            r7 = 1
            if (r5 != r7) goto L41
            r5 = 48
            r2.append(r5)     // Catch: java.lang.Throwable -> L1e java.io.IOException -> L52 java.io.FileNotFoundException -> L60 java.security.NoSuchAlgorithmException -> L6e
        L41:
            r2.append(r4)     // Catch: java.lang.Throwable -> L1e java.io.IOException -> L52 java.io.FileNotFoundException -> L60 java.security.NoSuchAlgorithmException -> L6e
            int r6 = r6 + 1
            goto L2a
        L47:
            java.lang.String r8 = r2.toString()     // Catch: java.lang.Throwable -> L1e java.io.IOException -> L52 java.io.FileNotFoundException -> L60 java.security.NoSuchAlgorithmException -> L6e
            r3.close()
            return r8
        L4f:
            r8 = move-exception
            goto L7b
        L51:
            r3 = r1
        L52:
            com.google.android.gms.common.internal.GmsLogger r8 = com.google.firebase.p015ml.common.internal.modeldownload.zzaj.f55772b     // Catch: java.lang.Throwable -> L1e
            java.lang.String r2 = "Cannot read the temp file for SHA-256 check"
            r8.m48403e(r0, r2)     // Catch: java.lang.Throwable -> L1e
            if (r3 == 0) goto L7a
            r3.close()
            goto L7a
        L5f:
            r3 = r1
        L60:
            com.google.android.gms.common.internal.GmsLogger r8 = com.google.firebase.p015ml.common.internal.modeldownload.zzaj.f55772b     // Catch: java.lang.Throwable -> L1e
            java.lang.String r2 = "Temp file is not found"
            r8.m48403e(r0, r2)     // Catch: java.lang.Throwable -> L1e
            if (r3 == 0) goto L7a
            r3.close()
            goto L7a
        L6d:
            r3 = r1
        L6e:
            com.google.android.gms.common.internal.GmsLogger r8 = com.google.firebase.p015ml.common.internal.modeldownload.zzaj.f55772b     // Catch: java.lang.Throwable -> L1e
            java.lang.String r2 = "Do not have SHA-256 algorithm"
            r8.m48403e(r0, r2)     // Catch: java.lang.Throwable -> L1e
            if (r3 == 0) goto L7a
            r3.close()
        L7a:
            return r1
        L7b:
            if (r1 == 0) goto L80
            r1.close()
        L80:
            throw r8
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.firebase.p015ml.common.internal.modeldownload.zzaj.m38385c(java.io.File):java.lang.String");
    }

    /* renamed from: b */
    public final zzs m38386b(File file, zzy zzyVar) {
        return this.f55773a.zza(file, zzyVar);
    }
}
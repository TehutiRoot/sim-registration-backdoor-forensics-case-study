package com.zxy.tiny.core;

import android.graphics.Bitmap;
import android.graphics.BitmapFactory;
import android.net.Uri;
import android.os.Build;
import android.text.TextUtils;
import android.util.TypedValue;
import com.zxy.libjpegturbo.JpegTurboCompressor;
import com.zxy.tiny.Tiny;
import com.zxy.tiny.common.CompressResult;
import com.zxy.tiny.common.Conditions;
import com.zxy.tiny.common.UriUtil;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.InputStream;

/* loaded from: classes5.dex */
public class FileCompressor {

    /* renamed from: com.zxy.tiny.core.FileCompressor$a */
    /* loaded from: classes5.dex */
    public static final class C10022a {
        /* renamed from: a */
        public static boolean m31970a(Bitmap bitmap, String str, int i, Bitmap.CompressFormat compressFormat) {
            FileOutputStream fileOutputStream;
            FileOutputStream fileOutputStream2 = null;
            try {
                fileOutputStream = new FileOutputStream(str);
            } catch (Throwable th2) {
                th = th2;
            }
            try {
                boolean compress = bitmap.compress(compressFormat, i, fileOutputStream);
                try {
                    fileOutputStream.close();
                } catch (IOException e) {
                    e.printStackTrace();
                }
                return compress;
            } catch (Throwable th3) {
                th = th3;
                fileOutputStream2 = fileOutputStream;
                if (fileOutputStream2 != null) {
                    try {
                        fileOutputStream2.close();
                    } catch (IOException e2) {
                        e2.printStackTrace();
                    }
                }
                throw th;
            }
        }
    }

    /* renamed from: a */
    public static boolean m31971a(Bitmap bitmap, String str, int i) {
        if (bitmap != null && !bitmap.isRecycled()) {
            if (bitmap.hasAlpha()) {
                return C10022a.m31970a(bitmap, str, i, Bitmap.CompressFormat.PNG);
            }
            if (Build.VERSION.SDK_INT < 24) {
                return JpegTurboCompressor.compress(bitmap, str, i);
            }
            return C10022a.m31970a(bitmap, str, i, Bitmap.CompressFormat.JPEG);
        }
        return false;
    }

    public static CompressResult compress(byte[] bArr, Tiny.FileCompressOptions fileCompressOptions, boolean z, boolean z2) {
        if (bArr == null || bArr.length == 0) {
            return null;
        }
        if (fileCompressOptions == null) {
            fileCompressOptions = new Tiny.FileCompressOptions();
        }
        return compress(shouldKeepSampling(bArr, fileCompressOptions), fileCompressOptions, z, z2);
    }

    public static Bitmap shouldKeepSampling(byte[] bArr, Tiny.FileCompressOptions fileCompressOptions) {
        if (bArr == null || bArr.length == 0) {
            return null;
        }
        if (fileCompressOptions == null) {
            fileCompressOptions = new Tiny.FileCompressOptions();
        }
        if (fileCompressOptions.isKeepSampling) {
            BitmapFactory.Options defaultDecodeOptions = CompressKit.getDefaultDecodeOptions();
            defaultDecodeOptions.inPreferredConfig = fileCompressOptions.config;
            return BitmapFactory.decodeByteArray(bArr, 0, bArr.length, defaultDecodeOptions);
        }
        return BitmapCompressor.compress(bArr, (Tiny.BitmapCompressOptions) fileCompressOptions, false);
    }

    /* JADX WARN: Removed duplicated region for block: B:33:0x0069 A[ADDED_TO_REGION] */
    /* JADX WARN: Removed duplicated region for block: B:49:0x0093 A[LOOP:0: B:35:0x0072->B:49:0x0093, LOOP_END] */
    /* JADX WARN: Removed duplicated region for block: B:52:0x00b3  */
    /* JADX WARN: Removed duplicated region for block: B:53:0x00b6  */
    /* JADX WARN: Removed duplicated region for block: B:61:0x0099 A[EDGE_INSN: B:61:0x0099->B:50:0x0099 ?: BREAK  , SYNTHETIC] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public static com.zxy.tiny.common.CompressResult compress(android.graphics.Bitmap r9, com.zxy.tiny.Tiny.FileCompressOptions r10, boolean r11, boolean r12) {
        /*
            r0 = 0
            if (r9 == 0) goto Lbe
            boolean r1 = r9.isRecycled()
            if (r1 == 0) goto Lb
            goto Lbe
        Lb:
            com.zxy.tiny.common.CompressResult r1 = new com.zxy.tiny.common.CompressResult
            r1.<init>()
            if (r10 != 0) goto L17
            com.zxy.tiny.Tiny$FileCompressOptions r10 = new com.zxy.tiny.Tiny$FileCompressOptions
            r10.<init>()
        L17:
            int r2 = r10.quality
            java.lang.String r3 = r10.outfile
            float r4 = r10.size
            java.lang.String r10 = r10.compressDirectory
            if (r2 < 0) goto L25
            r5 = 100
            if (r2 <= r5) goto L27
        L25:
            r2 = 76
        L27:
            boolean r5 = com.zxy.tiny.common.Conditions.isDirectory(r3)
            if (r5 == 0) goto L35
            java.io.File r3 = com.zxy.tiny.core.FileKit.generateCompressOutfileFormatJPEG(r10)
            java.lang.String r3 = r3.getAbsolutePath()
        L35:
            boolean r5 = com.zxy.tiny.common.Conditions.isJpegFormat(r3)
            if (r5 != 0) goto L43
            java.io.File r3 = com.zxy.tiny.core.FileKit.generateCompressOutfileFormatJPEG(r10)
            java.lang.String r3 = r3.getAbsolutePath()
        L43:
            boolean r5 = r9.hasAlpha()
            if (r5 == 0) goto L51
            java.io.File r10 = com.zxy.tiny.core.FileKit.generateCompressOutfileFormatPNG(r10)
            java.lang.String r3 = r10.getAbsolutePath()
        L51:
            boolean r10 = m31971a(r9, r3, r2)     // Catch: java.lang.Exception -> L56 java.io.FileNotFoundException -> L5d
            goto L64
        L56:
            r10 = move-exception
            r1.throwable = r10
            r10.printStackTrace()
            goto L63
        L5d:
            r10 = move-exception
            r1.throwable = r10
            r10.printStackTrace()
        L63:
            r10 = 0
        L64:
            r5 = 0
            int r5 = (r4 > r5 ? 1 : (r4 == r5 ? 0 : -1))
            if (r5 <= 0) goto L99
            if (r10 == 0) goto L99
            long r5 = com.zxy.tiny.core.FileKit.getSizeInBytes(r3)
            float r5 = (float) r5
            r6 = 1149239296(0x44800000, float:1024.0)
        L72:
            float r5 = r5 / r6
            int r5 = (r5 > r4 ? 1 : (r5 == r4 ? 0 : -1))
            if (r5 <= 0) goto L99
            r5 = 25
            if (r2 > r5) goto L7c
            goto L99
        L7c:
            int r2 = r2 + (-5)
            boolean r10 = m31971a(r9, r3, r2)     // Catch: java.lang.Exception -> L83 java.io.FileNotFoundException -> L8a
            goto L90
        L83:
            r5 = move-exception
            r1.throwable = r5
            r5.printStackTrace()
            goto L90
        L8a:
            r5 = move-exception
            r1.throwable = r5
            r5.printStackTrace()
        L90:
            if (r10 != 0) goto L93
            goto L99
        L93:
            long r7 = com.zxy.tiny.core.FileKit.getSizeInBytes(r3)
            float r5 = (float) r7
            goto L72
        L99:
            java.lang.StringBuilder r4 = new java.lang.StringBuilder
            r4.<init>()
            java.lang.String r5 = "compress quality: "
            r4.append(r5)
            r4.append(r2)
            java.lang.String r2 = r4.toString()
            com.zxy.tiny.common.Logger.m31988e(r2)
            r1.outfile = r3
            r1.success = r10
            if (r11 == 0) goto Lb6
            r1.bitmap = r9
            goto Lbd
        Lb6:
            if (r12 == 0) goto Lbd
            r1.bitmap = r0
            r9.recycle()
        Lbd:
            return r1
        Lbe:
            return r0
        */
        throw new UnsupportedOperationException("Method not decompiled: com.zxy.tiny.core.FileCompressor.compress(android.graphics.Bitmap, com.zxy.tiny.Tiny$FileCompressOptions, boolean, boolean):com.zxy.tiny.common.CompressResult");
    }

    public static Bitmap shouldKeepSampling(Bitmap bitmap, Tiny.FileCompressOptions fileCompressOptions) {
        if (bitmap == null || bitmap.isRecycled()) {
            return null;
        }
        if (fileCompressOptions == null) {
            fileCompressOptions = new Tiny.FileCompressOptions();
        }
        return fileCompressOptions.isKeepSampling ? bitmap : BitmapCompressor.compress(bitmap, (Tiny.BitmapCompressOptions) fileCompressOptions, false);
    }

    public static Bitmap shouldKeepSampling(int i, Tiny.FileCompressOptions fileCompressOptions) throws Exception {
        InputStream openRawResource;
        if (fileCompressOptions == null) {
            fileCompressOptions = new Tiny.FileCompressOptions();
        }
        if (fileCompressOptions.isKeepSampling) {
            InputStream inputStream = null;
            try {
                openRawResource = Tiny.getInstance().getApplication().getResources().openRawResource(i, new TypedValue());
            } catch (Throwable th2) {
                th = th2;
            }
            try {
                BitmapFactory.Options defaultDecodeOptions = CompressKit.getDefaultDecodeOptions();
                defaultDecodeOptions.inPreferredConfig = fileCompressOptions.config;
                Bitmap decodeStream = BitmapFactory.decodeStream(openRawResource, null, defaultDecodeOptions);
                if (openRawResource != null) {
                    try {
                        openRawResource.close();
                    } catch (IOException unused) {
                    }
                }
                return decodeStream;
            } catch (Throwable th3) {
                th = th3;
                inputStream = openRawResource;
                if (inputStream != null) {
                    try {
                        inputStream.close();
                    } catch (IOException unused2) {
                    }
                }
                throw th;
            }
        }
        return BitmapCompressor.compress(i, (Tiny.BitmapCompressOptions) fileCompressOptions, false);
    }

    public static Bitmap shouldKeepSampling(Uri uri, Tiny.FileCompressOptions fileCompressOptions) throws Exception {
        FileInputStream fileInputStream = null;
        if (uri == null) {
            return null;
        }
        Bitmap[] bitmapArr = {null};
        if (!UriUtil.isNetworkUri(uri)) {
            if (UriUtil.isLocalContentUri(uri) || UriUtil.isLocalFileUri(uri)) {
                String realPathFromUri = UriUtil.getRealPathFromUri(uri);
                if (TextUtils.isEmpty(realPathFromUri)) {
                    return null;
                }
                if (Conditions.fileIsExist(realPathFromUri) && Conditions.fileCanRead(realPathFromUri)) {
                    try {
                        FileInputStream fileInputStream2 = new FileInputStream(new File(realPathFromUri));
                        try {
                            byte[] transformToByteArray = CompressKit.transformToByteArray(fileInputStream2);
                            if (fileCompressOptions.isKeepSampling) {
                                BitmapFactory.Options defaultDecodeOptions = CompressKit.getDefaultDecodeOptions();
                                defaultDecodeOptions.inPreferredConfig = fileCompressOptions.config;
                                bitmapArr[0] = BitmapFactory.decodeByteArray(transformToByteArray, 0, transformToByteArray.length, defaultDecodeOptions);
                            } else {
                                bitmapArr[0] = BitmapCompressor.compress(transformToByteArray, (Tiny.BitmapCompressOptions) fileCompressOptions, true);
                            }
                            try {
                                fileInputStream2.close();
                            } catch (IOException unused) {
                            }
                        } catch (Throwable th2) {
                            th = th2;
                            fileInputStream = fileInputStream2;
                            if (fileInputStream != null) {
                                try {
                                    fileInputStream.close();
                                } catch (IOException unused2) {
                                }
                            }
                            throw th;
                        }
                    } catch (Throwable th3) {
                        th = th3;
                    }
                }
            }
            return bitmapArr[0];
        }
        throw new UnsupportedOperationException();
    }
}

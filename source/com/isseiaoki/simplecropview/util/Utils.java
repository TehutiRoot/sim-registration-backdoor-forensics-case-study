package com.isseiaoki.simplecropview.util;

import android.annotation.TargetApi;
import android.content.ContentUris;
import android.content.ContentValues;
import android.content.Context;
import android.content.Intent;
import android.database.Cursor;
import android.graphics.Bitmap;
import android.graphics.BitmapFactory;
import android.graphics.Matrix;
import android.media.ExifInterface;
import android.net.Uri;
import android.opengl.GLES10;
import android.os.Build;
import android.os.Environment;
import android.os.ParcelFileDescriptor;
import android.provider.DocumentsContract;
import android.provider.MediaStore;
import android.text.TextUtils;
import com.chuckerteam.chucker.internal.support.ResponseProcessor;
import com.google.firebase.sessions.settings.RemoteSettings;
import com.tom_roush.pdfbox.pdmodel.common.PDPageLabelRange;
import java.io.Closeable;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.InputStream;
import java.util.ArrayList;
import th.p047co.dtac.android.dtacone.util.bitmap.BitmapUtil;

/* loaded from: classes5.dex */
public class Utils {
    public static int sInputImageHeight;
    public static int sInputImageWidth;

    /* loaded from: classes5.dex */
    public static class RawDocumentsHelper {
        public static final String RAW_PREFIX = "raw:";

        public static String getAbsoluteFilePath(String str) {
            return str.substring(4);
        }

        public static String getDocIdForFile(File file) {
            return RAW_PREFIX + file.getAbsolutePath();
        }

        public static boolean isRawDocId(String str) {
            if (str != null && str.startsWith(RAW_PREFIX)) {
                return true;
            }
            return false;
        }
    }

    /* renamed from: a */
    public static File m33774a(Context context, Uri uri) {
        FileInputStream fileInputStream;
        Throwable th2;
        FileOutputStream fileOutputStream;
        if (uri == null) {
            return null;
        }
        String absolutePath = new File(context.getCacheDir(), "tmp").getAbsolutePath();
        try {
            ParcelFileDescriptor openFileDescriptor = context.getContentResolver().openFileDescriptor(uri, PDPageLabelRange.STYLE_ROMAN_LOWER);
            if (openFileDescriptor == null) {
                closeQuietly(null);
                closeQuietly(null);
                return null;
            }
            fileInputStream = new FileInputStream(openFileDescriptor.getFileDescriptor());
            try {
                fileOutputStream = new FileOutputStream(absolutePath);
                try {
                    byte[] bArr = new byte[4096];
                    while (true) {
                        int read = fileInputStream.read(bArr);
                        if (read != -1) {
                            fileOutputStream.write(bArr, 0, read);
                        } else {
                            File file = new File(absolutePath);
                            closeQuietly(fileInputStream);
                            closeQuietly(fileOutputStream);
                            return file;
                        }
                    }
                } catch (IOException unused) {
                    closeQuietly(fileInputStream);
                    closeQuietly(fileOutputStream);
                    return null;
                } catch (Throwable th3) {
                    th2 = th3;
                    closeQuietly(fileInputStream);
                    closeQuietly(fileOutputStream);
                    throw th2;
                }
            } catch (IOException unused2) {
                fileOutputStream = null;
            } catch (Throwable th4) {
                th2 = th4;
                fileOutputStream = null;
            }
        } catch (IOException unused3) {
            fileOutputStream = null;
            fileInputStream = null;
        } catch (Throwable th5) {
            fileInputStream = null;
            th2 = th5;
            fileOutputStream = null;
        }
    }

    public static int calculateInSampleSize(Context context, Uri uri, int i) {
        BitmapFactory.Options options = new BitmapFactory.Options();
        int i2 = 1;
        options.inJustDecodeBounds = true;
        InputStream inputStream = null;
        try {
            InputStream openInputStream = context.getContentResolver().openInputStream(uri);
            try {
                BitmapFactory.decodeStream(openInputStream, null, options);
                closeQuietly(openInputStream);
            } catch (FileNotFoundException unused) {
                inputStream = openInputStream;
                closeQuietly(inputStream);
                sInputImageWidth = options.outWidth;
                sInputImageHeight = options.outHeight;
                while (true) {
                    if (options.outWidth / i2 > i) {
                    }
                    i2 *= 2;
                }
            } catch (Throwable th2) {
                th = th2;
                inputStream = openInputStream;
                closeQuietly(inputStream);
                throw th;
            }
        } catch (FileNotFoundException unused2) {
        } catch (Throwable th3) {
            th = th3;
        }
        sInputImageWidth = options.outWidth;
        sInputImageHeight = options.outHeight;
        while (true) {
            if (options.outWidth / i2 > i && options.outHeight / i2 <= i) {
                return i2;
            }
            i2 *= 2;
        }
    }

    public static void closeQuietly(Closeable closeable) {
        if (closeable == null) {
            return;
        }
        try {
            closeable.close();
        } catch (Throwable unused) {
        }
    }

    public static void copyExifInfo(Context context, Uri uri, Uri uri2, int i, int i2) {
        if (uri != null && uri2 != null) {
            try {
                File fileFromUri = getFileFromUri(context, uri);
                File fileFromUri2 = getFileFromUri(context, uri2);
                if (fileFromUri != null && fileFromUri2 != null) {
                    String absolutePath = fileFromUri.getAbsolutePath();
                    String absolutePath2 = fileFromUri2.getAbsolutePath();
                    ExifInterface exifInterface = new ExifInterface(absolutePath);
                    ArrayList<String> arrayList = new ArrayList();
                    arrayList.add(androidx.exifinterface.media.ExifInterface.TAG_DATETIME);
                    arrayList.add(androidx.exifinterface.media.ExifInterface.TAG_FLASH);
                    arrayList.add(androidx.exifinterface.media.ExifInterface.TAG_FOCAL_LENGTH);
                    arrayList.add(androidx.exifinterface.media.ExifInterface.TAG_GPS_ALTITUDE);
                    arrayList.add(androidx.exifinterface.media.ExifInterface.TAG_GPS_ALTITUDE_REF);
                    arrayList.add(androidx.exifinterface.media.ExifInterface.TAG_GPS_DATESTAMP);
                    arrayList.add(androidx.exifinterface.media.ExifInterface.TAG_GPS_LATITUDE);
                    arrayList.add(androidx.exifinterface.media.ExifInterface.TAG_GPS_LATITUDE_REF);
                    arrayList.add(androidx.exifinterface.media.ExifInterface.TAG_GPS_LONGITUDE);
                    arrayList.add(androidx.exifinterface.media.ExifInterface.TAG_GPS_LONGITUDE_REF);
                    arrayList.add(androidx.exifinterface.media.ExifInterface.TAG_GPS_PROCESSING_METHOD);
                    arrayList.add(androidx.exifinterface.media.ExifInterface.TAG_GPS_TIMESTAMP);
                    arrayList.add(androidx.exifinterface.media.ExifInterface.TAG_MAKE);
                    arrayList.add(androidx.exifinterface.media.ExifInterface.TAG_MODEL);
                    arrayList.add(androidx.exifinterface.media.ExifInterface.TAG_WHITE_BALANCE);
                    int i3 = Build.VERSION.SDK_INT;
                    arrayList.add(androidx.exifinterface.media.ExifInterface.TAG_EXPOSURE_TIME);
                    arrayList.add(androidx.exifinterface.media.ExifInterface.TAG_F_NUMBER);
                    arrayList.add(androidx.exifinterface.media.ExifInterface.TAG_ISO_SPEED_RATINGS);
                    if (i3 >= 23) {
                        arrayList.add(androidx.exifinterface.media.ExifInterface.TAG_DATETIME_DIGITIZED);
                        arrayList.add(androidx.exifinterface.media.ExifInterface.TAG_SUBSEC_TIME);
                        arrayList.add(androidx.exifinterface.media.ExifInterface.TAG_SUBSEC_TIME_DIGITIZED);
                        arrayList.add(androidx.exifinterface.media.ExifInterface.TAG_SUBSEC_TIME_ORIGINAL);
                    }
                    if (i3 >= 24) {
                        arrayList.add(androidx.exifinterface.media.ExifInterface.TAG_F_NUMBER);
                        arrayList.add(androidx.exifinterface.media.ExifInterface.TAG_ISO_SPEED_RATINGS);
                        arrayList.add(androidx.exifinterface.media.ExifInterface.TAG_SUBSEC_TIME_DIGITIZED);
                        arrayList.add(androidx.exifinterface.media.ExifInterface.TAG_SUBSEC_TIME_ORIGINAL);
                    }
                    ExifInterface exifInterface2 = new ExifInterface(absolutePath2);
                    for (String str : arrayList) {
                        String attribute = exifInterface.getAttribute(str);
                        if (!TextUtils.isEmpty(attribute)) {
                            exifInterface2.setAttribute(str, attribute);
                        }
                    }
                    exifInterface2.setAttribute(androidx.exifinterface.media.ExifInterface.TAG_IMAGE_WIDTH, String.valueOf(i));
                    exifInterface2.setAttribute(androidx.exifinterface.media.ExifInterface.TAG_IMAGE_LENGTH, String.valueOf(i2));
                    exifInterface2.setAttribute(androidx.exifinterface.media.ExifInterface.TAG_ORIENTATION, String.valueOf(0));
                    exifInterface2.saveAttributes();
                }
            } catch (IOException e) {
                e.printStackTrace();
            }
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:30:0x0045 A[EXC_TOP_SPLITTER, SYNTHETIC] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public static android.graphics.Bitmap decodeSampledBitmapFromUri(android.content.Context r3, android.net.Uri r4, int r5) {
        /*
            r0 = 0
            android.content.ContentResolver r1 = r3.getContentResolver()     // Catch: java.lang.Throwable -> L32 java.io.FileNotFoundException -> L34
            java.io.InputStream r1 = r1.openInputStream(r4)     // Catch: java.lang.Throwable -> L32 java.io.FileNotFoundException -> L34
            if (r1 == 0) goto L23
            android.graphics.BitmapFactory$Options r2 = new android.graphics.BitmapFactory$Options     // Catch: java.lang.Throwable -> L1e java.io.FileNotFoundException -> L21
            r2.<init>()     // Catch: java.lang.Throwable -> L1e java.io.FileNotFoundException -> L21
            int r3 = calculateInSampleSize(r3, r4, r5)     // Catch: java.lang.Throwable -> L1e java.io.FileNotFoundException -> L21
            r2.inSampleSize = r3     // Catch: java.lang.Throwable -> L1e java.io.FileNotFoundException -> L21
            r3 = 0
            r2.inJustDecodeBounds = r3     // Catch: java.lang.Throwable -> L1e java.io.FileNotFoundException -> L21
            android.graphics.Bitmap r0 = android.graphics.BitmapFactory.decodeStream(r1, r0, r2)     // Catch: java.lang.Throwable -> L1e java.io.FileNotFoundException -> L21
            goto L23
        L1e:
            r3 = move-exception
            r0 = r1
            goto L43
        L21:
            r3 = move-exception
            goto L36
        L23:
            if (r1 == 0) goto L42
            r1.close()     // Catch: java.io.IOException -> L29
            goto L42
        L29:
            r3 = move-exception
            java.lang.String r3 = r3.getMessage()
            com.isseiaoki.simplecropview.util.Logger.m33778e(r3)
            goto L42
        L32:
            r3 = move-exception
            goto L43
        L34:
            r3 = move-exception
            r1 = r0
        L36:
            java.lang.String r3 = r3.getMessage()     // Catch: java.lang.Throwable -> L1e
            com.isseiaoki.simplecropview.util.Logger.m33778e(r3)     // Catch: java.lang.Throwable -> L1e
            if (r1 == 0) goto L42
            r1.close()     // Catch: java.io.IOException -> L29
        L42:
            return r0
        L43:
            if (r0 == 0) goto L51
            r0.close()     // Catch: java.io.IOException -> L49
            goto L51
        L49:
            r4 = move-exception
            java.lang.String r4 = r4.getMessage()
            com.isseiaoki.simplecropview.util.Logger.m33778e(r4)
        L51:
            throw r3
        */
        throw new UnsupportedOperationException("Method not decompiled: com.isseiaoki.simplecropview.util.Utils.decodeSampledBitmapFromUri(android.content.Context, android.net.Uri, int):android.graphics.Bitmap");
    }

    @TargetApi(19)
    public static Uri ensureUriPermission(Context context, Intent intent) {
        Uri data = intent.getData();
        context.getContentResolver().takePersistableUriPermission(data, intent.getFlags() & 1);
        return data;
    }

    public static String getDataColumn(Context context, Uri uri, String str, String[] strArr) {
        int columnIndex;
        Cursor cursor = null;
        try {
            Cursor query = context.getContentResolver().query(uri, new String[]{"_data", "_display_name"}, str, strArr, null);
            if (query != null) {
                try {
                    if (query.moveToFirst()) {
                        if (uri.toString().startsWith("content://com.google.android.gallery3d")) {
                            columnIndex = query.getColumnIndex("_display_name");
                        } else {
                            columnIndex = query.getColumnIndex("_data");
                        }
                        if (columnIndex != -1) {
                            String string = query.getString(columnIndex);
                            query.close();
                            return string;
                        }
                    }
                } catch (Throwable th2) {
                    th = th2;
                    cursor = query;
                    if (cursor != null) {
                        cursor.close();
                    }
                    throw th;
                }
            }
            if (query != null) {
                query.close();
            }
            return null;
        } catch (Throwable th3) {
            th = th3;
        }
    }

    public static int getExifOrientation(Context context, Uri uri) {
        if (uri.getAuthority().toLowerCase().endsWith("media")) {
            return getExifRotation(context, uri);
        }
        return getExifRotation(getFileFromUri(context, uri));
    }

    public static int getExifOrientationFromAngle(int i) {
        int i2 = i % 360;
        if (i2 != 90) {
            if (i2 != 180) {
                if (i2 != 270) {
                    return 1;
                }
                return 8;
            }
            return 3;
        }
        return 6;
    }

    public static int getExifRotation(File file) {
        if (file == null) {
            return 0;
        }
        try {
            return getRotateDegreeFromOrientation(new ExifInterface(file.getAbsolutePath()).getAttributeInt(androidx.exifinterface.media.ExifInterface.TAG_ORIENTATION, 0));
        } catch (IOException e) {
            Logger.m33777e("An error occurred while getting the exif data: " + e.getMessage(), e);
            return 0;
        }
    }

    @TargetApi(19)
    public static File getFileFromUri(Context context, Uri uri) {
        String path;
        Uri uri2;
        String[] split;
        if (DocumentsContract.isDocumentUri(context, uri)) {
            if (isExternalStorageDocument(uri)) {
                if ("primary".equalsIgnoreCase(DocumentsContract.getDocumentId(uri).split(":")[0])) {
                    path = Environment.getExternalStorageDirectory() + RemoteSettings.FORWARD_SLASH_STRING + split[1];
                }
                path = null;
            } else if (isDownloadsDocument(uri)) {
                String documentId = DocumentsContract.getDocumentId(uri);
                if (RawDocumentsHelper.isRawDocId(documentId)) {
                    path = RawDocumentsHelper.getAbsoluteFilePath(documentId);
                } else {
                    path = getDataColumn(context, ContentUris.withAppendedId(Uri.parse("content://downloads/public_downloads"), Long.valueOf(documentId).longValue()), null, null);
                }
            } else if (isMediaDocument(uri)) {
                String[] split2 = DocumentsContract.getDocumentId(uri).split(":");
                String str = split2[0];
                if (ResponseProcessor.CONTENT_TYPE_IMAGE.equals(str)) {
                    uri2 = MediaStore.Images.Media.EXTERNAL_CONTENT_URI;
                } else if ("video".equals(str)) {
                    uri2 = MediaStore.Video.Media.EXTERNAL_CONTENT_URI;
                } else if ("audio".equals(str)) {
                    uri2 = MediaStore.Audio.Media.EXTERNAL_CONTENT_URI;
                } else {
                    uri2 = null;
                }
                path = getDataColumn(context, uri2, "_id=?", new String[]{split2[1]});
            } else {
                if (isGoogleDriveDocument(uri)) {
                    return m33774a(context, uri);
                }
                path = null;
            }
        } else if ("content".equalsIgnoreCase(uri.getScheme())) {
            if (isGooglePhotosUri(uri)) {
                path = uri.getLastPathSegment();
            } else {
                path = getDataColumn(context, uri, null, null);
            }
        } else {
            if ("file".equalsIgnoreCase(uri.getScheme())) {
                path = uri.getPath();
            }
            path = null;
        }
        if (path == null) {
            return null;
        }
        return new File(path);
    }

    public static Matrix getMatrixFromExifOrientation(int i) {
        Matrix matrix = new Matrix();
        switch (i) {
            case 2:
                matrix.postScale(-1.0f, 1.0f);
                break;
            case 3:
                matrix.postRotate(180.0f);
                break;
            case 4:
                matrix.postScale(1.0f, -1.0f);
                break;
            case 5:
                matrix.postRotate(90.0f);
                matrix.postScale(1.0f, -1.0f);
                break;
            case 6:
                matrix.postRotate(90.0f);
                break;
            case 7:
                matrix.postRotate(-90.0f);
                matrix.postScale(1.0f, -1.0f);
                break;
            case 8:
                matrix.postRotate(-90.0f);
                break;
        }
        return matrix;
    }

    public static int getMaxSize() {
        int[] iArr = new int[1];
        GLES10.glGetIntegerv(3379, iArr, 0);
        int i = iArr[0];
        if (i > 0) {
            return Math.min(i, 4096);
        }
        return 2048;
    }

    public static int getRotateDegreeFromOrientation(int i) {
        if (i != 3) {
            if (i != 6) {
                if (i != 8) {
                    return 0;
                }
                return BitmapUtil.IMAGE_270_DEGREE;
            }
            return 90;
        }
        return BitmapUtil.IMAGE_180_DEGREE;
    }

    public static Bitmap getScaledBitmap(Bitmap bitmap, int i, int i2) {
        int width = bitmap.getWidth();
        int height = bitmap.getHeight();
        Matrix matrix = new Matrix();
        matrix.postScale(i / width, i2 / height);
        return Bitmap.createBitmap(bitmap, 0, 0, width, height, matrix, true);
    }

    public static Bitmap getScaledBitmapForHeight(Bitmap bitmap, int i) {
        return getScaledBitmap(bitmap, Math.round(i * (bitmap.getWidth() / bitmap.getHeight())), i);
    }

    public static Bitmap getScaledBitmapForWidth(Bitmap bitmap, int i) {
        return getScaledBitmap(bitmap, i, Math.round(i / (bitmap.getWidth() / bitmap.getHeight())));
    }

    public static boolean isDownloadsDocument(Uri uri) {
        return "com.android.providers.downloads.documents".equals(uri.getAuthority());
    }

    public static boolean isExternalStorageDocument(Uri uri) {
        return "com.android.externalstorage.documents".equals(uri.getAuthority());
    }

    public static boolean isGoogleDriveDocument(Uri uri) {
        return "com.google.android.apps.docs.storage".equals(uri.getAuthority());
    }

    public static boolean isGooglePhotosUri(Uri uri) {
        return "com.google.android.apps.photos.content".equals(uri.getAuthority());
    }

    public static boolean isMediaDocument(Uri uri) {
        return "com.android.providers.media.documents".equals(uri.getAuthority());
    }

    public static void updateGalleryInfo(Context context, Uri uri) {
        if (!"content".equals(uri.getScheme())) {
            return;
        }
        ContentValues contentValues = new ContentValues();
        File fileFromUri = getFileFromUri(context, uri);
        if (fileFromUri != null && fileFromUri.exists()) {
            contentValues.put("_size", Long.valueOf(fileFromUri.length()));
        }
        context.getContentResolver().update(uri, contentValues, null, null);
    }

    /* JADX WARN: Code restructure failed: missing block: B:15:0x002b, code lost:
        r7.close();
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public static int getExifRotation(android.content.Context r8, android.net.Uri r9) {
        /*
            java.lang.String r0 = "orientation"
            java.lang.String[] r3 = new java.lang.String[]{r0}
            r0 = 0
            r7 = 0
            android.content.ContentResolver r1 = r8.getContentResolver()     // Catch: java.lang.Throwable -> L25 java.lang.RuntimeException -> L27
            r5 = 0
            r6 = 0
            r4 = 0
            r2 = r9
            android.database.Cursor r7 = r1.query(r2, r3, r4, r5, r6)     // Catch: java.lang.Throwable -> L25 java.lang.RuntimeException -> L27
            if (r7 == 0) goto L29
            boolean r8 = r7.moveToFirst()     // Catch: java.lang.Throwable -> L25 java.lang.RuntimeException -> L27
            if (r8 != 0) goto L1d
            goto L29
        L1d:
            int r8 = r7.getInt(r0)     // Catch: java.lang.Throwable -> L25 java.lang.RuntimeException -> L27
            r7.close()
            return r8
        L25:
            r8 = move-exception
            goto L2f
        L27:
            goto L35
        L29:
            if (r7 == 0) goto L2e
            r7.close()
        L2e:
            return r0
        L2f:
            if (r7 == 0) goto L34
            r7.close()
        L34:
            throw r8
        L35:
            if (r7 == 0) goto L3a
            r7.close()
        L3a:
            return r0
        */
        throw new UnsupportedOperationException("Method not decompiled: com.isseiaoki.simplecropview.util.Utils.getExifRotation(android.content.Context, android.net.Uri):int");
    }
}

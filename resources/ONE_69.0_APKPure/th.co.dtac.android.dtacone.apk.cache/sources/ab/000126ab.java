package th.p047co.dtac.android.dtacone.util;

import android.net.Uri;

/* renamed from: th.co.dtac.android.dtacone.util.PathUtil */
/* loaded from: classes8.dex */
public class PathUtil {
    /* JADX WARN: Removed duplicated region for block: B:26:0x009f  */
    /* JADX WARN: Removed duplicated region for block: B:31:0x00bd  */
    @android.annotation.SuppressLint({"NewApi"})
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public static java.lang.String getPath(android.content.Context r11, android.net.Uri r12) throws java.net.URISyntaxException {
        /*
            android.content.Context r0 = r11.getApplicationContext()
            boolean r0 = android.provider.DocumentsContract.isDocumentUri(r0, r12)
            r1 = 0
            if (r0 == 0) goto L53
            boolean r0 = isExternalStorageDocument(r12)
            java.lang.String r2 = ":"
            r3 = 1
            if (r0 == 0) goto L37
            java.lang.String r11 = android.provider.DocumentsContract.getDocumentId(r12)
            java.lang.String[] r11 = r11.split(r2)
            java.lang.StringBuilder r12 = new java.lang.StringBuilder
            r12.<init>()
            java.io.File r0 = android.os.Environment.getExternalStorageDirectory()
            r12.append(r0)
            java.lang.String r0 = "/"
            r12.append(r0)
            r11 = r11[r3]
            r12.append(r11)
            java.lang.String r11 = r12.toString()
            return r11
        L37:
            boolean r0 = isDownloadsDocument(r12)
            if (r0 == 0) goto L57
            java.lang.String r12 = android.provider.DocumentsContract.getDocumentId(r12)
            java.lang.String r0 = "content://downloads/public_downloads"
            android.net.Uri r0 = android.net.Uri.parse(r0)
            java.lang.Long r12 = java.lang.Long.valueOf(r12)
            long r2 = r12.longValue()
            android.net.Uri r12 = android.content.ContentUris.withAppendedId(r0, r2)
        L53:
            r6 = r12
            r8 = r1
            r9 = r8
            goto L93
        L57:
            boolean r0 = isMediaDocument(r12)
            if (r0 == 0) goto L53
            java.lang.String r0 = android.provider.DocumentsContract.getDocumentId(r12)
            java.lang.String[] r0 = r0.split(r2)
            r2 = 0
            r4 = r0[r2]
            java.lang.String r5 = "image"
            boolean r5 = r5.equals(r4)
            if (r5 == 0) goto L73
            android.net.Uri r12 = android.provider.MediaStore.Images.Media.EXTERNAL_CONTENT_URI
            goto L88
        L73:
            java.lang.String r5 = "video"
            boolean r5 = r5.equals(r4)
            if (r5 == 0) goto L7e
            android.net.Uri r12 = android.provider.MediaStore.Video.Media.EXTERNAL_CONTENT_URI
            goto L88
        L7e:
            java.lang.String r5 = "audio"
            boolean r4 = r5.equals(r4)
            if (r4 == 0) goto L88
            android.net.Uri r12 = android.provider.MediaStore.Audio.Media.EXTERNAL_CONTENT_URI
        L88:
            java.lang.String[] r4 = new java.lang.String[r3]
            r0 = r0[r3]
            r4[r2] = r0
            java.lang.String r0 = "_id=?"
            r6 = r12
            r8 = r0
            r9 = r4
        L93:
            java.lang.String r12 = r6.getScheme()
            java.lang.String r0 = "content"
            boolean r12 = r0.equalsIgnoreCase(r12)
            if (r12 == 0) goto Lbd
            java.lang.String r12 = "_data"
            java.lang.String[] r7 = new java.lang.String[]{r12}
            android.content.ContentResolver r5 = r11.getContentResolver()     // Catch: java.lang.Exception -> Lce
            r10 = 0
            android.database.Cursor r11 = r5.query(r6, r7, r8, r9, r10)     // Catch: java.lang.Exception -> Lce
            int r12 = r11.getColumnIndexOrThrow(r12)     // Catch: java.lang.Exception -> Lce
            boolean r0 = r11.moveToFirst()     // Catch: java.lang.Exception -> Lce
            if (r0 == 0) goto Lce
            java.lang.String r11 = r11.getString(r12)     // Catch: java.lang.Exception -> Lce
            return r11
        Lbd:
            java.lang.String r11 = "file"
            java.lang.String r12 = r6.getScheme()
            boolean r11 = r11.equalsIgnoreCase(r12)
            if (r11 == 0) goto Lce
            java.lang.String r11 = r6.getPath()
            return r11
        Lce:
            return r1
        */
        throw new UnsupportedOperationException("Method not decompiled: th.p047co.dtac.android.dtacone.util.PathUtil.getPath(android.content.Context, android.net.Uri):java.lang.String");
    }

    public static boolean isDownloadsDocument(Uri uri) {
        return "com.android.providers.downloads.documents".equals(uri.getAuthority());
    }

    public static boolean isExternalStorageDocument(Uri uri) {
        return "com.android.externalstorage.documents".equals(uri.getAuthority());
    }

    public static boolean isMediaDocument(Uri uri) {
        return "com.android.providers.media.documents".equals(uri.getAuthority());
    }
}
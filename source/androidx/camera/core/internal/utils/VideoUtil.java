package androidx.camera.core.internal.utils;

import androidx.annotation.RequiresApi;

@RequiresApi(21)
/* loaded from: classes.dex */
public final class VideoUtil {
    /* JADX WARN: Removed duplicated region for block: B:25:0x0058  */
    @androidx.annotation.Nullable
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public static java.lang.String getAbsolutePathFromUri(@androidx.annotation.NonNull android.content.ContentResolver r8, @androidx.annotation.NonNull android.net.Uri r9) {
        /*
            java.lang.String r0 = "_data"
            r1 = 0
            java.lang.String[] r4 = new java.lang.String[]{r0}     // Catch: java.lang.Throwable -> L2b java.lang.RuntimeException -> L2d
            r6 = 0
            r7 = 0
            r5 = 0
            r2 = r8
            r3 = r9
            android.database.Cursor r1 = r2.query(r3, r4, r5, r6, r7)     // Catch: java.lang.Throwable -> L2b java.lang.RuntimeException -> L2d
            java.lang.Object r8 = androidx.core.util.Preconditions.checkNotNull(r1)     // Catch: java.lang.Throwable -> L2b java.lang.RuntimeException -> L2d
            android.database.Cursor r8 = (android.database.Cursor) r8     // Catch: java.lang.Throwable -> L2b java.lang.RuntimeException -> L2d
            int r0 = r8.getColumnIndexOrThrow(r0)     // Catch: java.lang.Throwable -> L25 java.lang.RuntimeException -> L28
            r8.moveToFirst()     // Catch: java.lang.Throwable -> L25 java.lang.RuntimeException -> L28
            java.lang.String r9 = r8.getString(r0)     // Catch: java.lang.Throwable -> L25 java.lang.RuntimeException -> L28
            r8.close()
            return r9
        L25:
            r9 = move-exception
            r1 = r8
            goto L56
        L28:
            r0 = move-exception
            r1 = r8
            goto L2e
        L2b:
            r9 = move-exception
            goto L56
        L2d:
            r0 = move-exception
        L2e:
            java.lang.String r8 = "VideoUtil"
            java.lang.String r2 = "Failed in getting absolute path for Uri %s with Exception %s"
            java.lang.String r9 = r9.toString()     // Catch: java.lang.Throwable -> L2b
            java.lang.String r0 = r0.toString()     // Catch: java.lang.Throwable -> L2b
            r3 = 2
            java.lang.Object[] r3 = new java.lang.Object[r3]     // Catch: java.lang.Throwable -> L54
            r4 = 0
            r3[r4] = r9     // Catch: java.lang.Throwable -> L54
            r9 = 1
            r3[r9] = r0     // Catch: java.lang.Throwable -> L54
            java.lang.String r9 = java.lang.String.format(r2, r3)     // Catch: java.lang.Throwable -> L2b
            androidx.camera.core.Logger.m63228e(r8, r9)     // Catch: java.lang.Throwable -> L2b
            java.lang.String r8 = ""
            if (r1 == 0) goto L51
            r1.close()
        L51:
            return r8
        L52:
            r9 = r8
            goto L56
        L54:
            r8 = move-exception
            goto L52
        L56:
            if (r1 == 0) goto L5b
            r1.close()
        L5b:
            throw r9
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.camera.core.internal.utils.VideoUtil.getAbsolutePathFromUri(android.content.ContentResolver, android.net.Uri):java.lang.String");
    }
}

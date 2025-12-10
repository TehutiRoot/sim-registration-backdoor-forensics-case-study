package p000;

import android.content.ContentResolver;
import android.content.Context;
import android.database.Cursor;
import android.net.Uri;
import android.provider.DocumentsContract;
import android.text.TextUtils;
import android.util.Log;

/* renamed from: yJ */
/* loaded from: classes2.dex */
public abstract class AbstractC17121yJ {
    /* renamed from: a */
    public static boolean m343a(Context context, Uri uri) {
        if (context.checkCallingOrSelfUriPermission(uri, 1) == 0 && !TextUtils.isEmpty(m337g(context, uri))) {
            return true;
        }
        return false;
    }

    /* renamed from: b */
    public static boolean m342b(Context context, Uri uri) {
        if (context.checkCallingOrSelfUriPermission(uri, 2) != 0) {
            return false;
        }
        String m337g = m337g(context, uri);
        int m330n = m330n(context, uri, "flags", 0);
        if (TextUtils.isEmpty(m337g)) {
            return false;
        }
        if ((m330n & 4) != 0) {
            return true;
        }
        if ("vnd.android.document/directory".equals(m337g) && (m330n & 8) != 0) {
            return true;
        }
        if (TextUtils.isEmpty(m337g) || (m330n & 2) == 0) {
            return false;
        }
        return true;
    }

    /* renamed from: c */
    public static void m341c(AutoCloseable autoCloseable) {
        if (autoCloseable != null) {
            try {
                autoCloseable.close();
            } catch (RuntimeException e) {
                throw e;
            } catch (Exception unused) {
            }
        }
    }

    /* renamed from: d */
    public static boolean m340d(Context context, Uri uri) {
        ContentResolver contentResolver = context.getContentResolver();
        boolean z = false;
        Cursor cursor = null;
        try {
            cursor = contentResolver.query(uri, new String[]{"document_id"}, null, null, null);
            if (cursor.getCount() > 0) {
                z = true;
            }
            return z;
        } catch (Exception e) {
            Log.w("DocumentFile", "Failed query: " + e);
            return false;
        } finally {
            m341c(cursor);
        }
    }

    /* renamed from: e */
    public static long m339e(Context context, Uri uri) {
        return m329o(context, uri, "flags", 0L);
    }

    /* renamed from: f */
    public static String m338f(Context context, Uri uri) {
        return m328p(context, uri, "_display_name", null);
    }

    /* renamed from: g */
    public static String m337g(Context context, Uri uri) {
        return m328p(context, uri, "mime_type", null);
    }

    /* renamed from: h */
    public static String m336h(Context context, Uri uri) {
        String m337g = m337g(context, uri);
        if ("vnd.android.document/directory".equals(m337g)) {
            return null;
        }
        return m337g;
    }

    /* renamed from: i */
    public static boolean m335i(Context context, Uri uri) {
        return "vnd.android.document/directory".equals(m337g(context, uri));
    }

    /* renamed from: j */
    public static boolean m334j(Context context, Uri uri) {
        String m337g = m337g(context, uri);
        if (!"vnd.android.document/directory".equals(m337g) && !TextUtils.isEmpty(m337g)) {
            return true;
        }
        return false;
    }

    /* renamed from: k */
    public static boolean m333k(Context context, Uri uri) {
        if (!DocumentsContract.isDocumentUri(context, uri) || (m339e(context, uri) & 512) == 0) {
            return false;
        }
        return true;
    }

    /* renamed from: l */
    public static long m332l(Context context, Uri uri) {
        return m329o(context, uri, "last_modified", 0L);
    }

    /* renamed from: m */
    public static long m331m(Context context, Uri uri) {
        return m329o(context, uri, "_size", 0L);
    }

    /* renamed from: n */
    public static int m330n(Context context, Uri uri, String str, int i) {
        return (int) m329o(context, uri, str, i);
    }

    /* renamed from: o */
    public static long m329o(Context context, Uri uri, String str, long j) {
        ContentResolver contentResolver = context.getContentResolver();
        Cursor cursor = null;
        try {
            cursor = contentResolver.query(uri, new String[]{str}, null, null, null);
            if (cursor.moveToFirst() && !cursor.isNull(0)) {
                return cursor.getLong(0);
            }
            return j;
        } catch (Exception e) {
            Log.w("DocumentFile", "Failed query: " + e);
            return j;
        } finally {
            m341c(cursor);
        }
    }

    /* renamed from: p */
    public static String m328p(Context context, Uri uri, String str, String str2) {
        ContentResolver contentResolver = context.getContentResolver();
        Cursor cursor = null;
        try {
            cursor = contentResolver.query(uri, new String[]{str}, null, null, null);
            if (cursor.moveToFirst() && !cursor.isNull(0)) {
                return cursor.getString(0);
            }
            return str2;
        } catch (Exception e) {
            Log.w("DocumentFile", "Failed query: " + e);
            return str2;
        } finally {
            m341c(cursor);
        }
    }
}
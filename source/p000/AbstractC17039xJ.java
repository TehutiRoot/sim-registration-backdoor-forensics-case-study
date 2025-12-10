package p000;

import android.content.ContentResolver;
import android.content.Context;
import android.database.Cursor;
import android.net.Uri;
import android.provider.DocumentsContract;
import android.text.TextUtils;
import android.util.Log;

/* renamed from: xJ */
/* loaded from: classes2.dex */
public abstract class AbstractC17039xJ {
    /* renamed from: a */
    public static boolean m556a(Context context, Uri uri) {
        if (context.checkCallingOrSelfUriPermission(uri, 1) == 0 && !TextUtils.isEmpty(m550g(context, uri))) {
            return true;
        }
        return false;
    }

    /* renamed from: b */
    public static boolean m555b(Context context, Uri uri) {
        if (context.checkCallingOrSelfUriPermission(uri, 2) != 0) {
            return false;
        }
        String m550g = m550g(context, uri);
        int m543n = m543n(context, uri, "flags", 0);
        if (TextUtils.isEmpty(m550g)) {
            return false;
        }
        if ((m543n & 4) != 0) {
            return true;
        }
        if ("vnd.android.document/directory".equals(m550g) && (m543n & 8) != 0) {
            return true;
        }
        if (TextUtils.isEmpty(m550g) || (m543n & 2) == 0) {
            return false;
        }
        return true;
    }

    /* renamed from: c */
    public static void m554c(AutoCloseable autoCloseable) {
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
    public static boolean m553d(Context context, Uri uri) {
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
            m554c(cursor);
        }
    }

    /* renamed from: e */
    public static long m552e(Context context, Uri uri) {
        return m542o(context, uri, "flags", 0L);
    }

    /* renamed from: f */
    public static String m551f(Context context, Uri uri) {
        return m541p(context, uri, "_display_name", null);
    }

    /* renamed from: g */
    public static String m550g(Context context, Uri uri) {
        return m541p(context, uri, "mime_type", null);
    }

    /* renamed from: h */
    public static String m549h(Context context, Uri uri) {
        String m550g = m550g(context, uri);
        if ("vnd.android.document/directory".equals(m550g)) {
            return null;
        }
        return m550g;
    }

    /* renamed from: i */
    public static boolean m548i(Context context, Uri uri) {
        return "vnd.android.document/directory".equals(m550g(context, uri));
    }

    /* renamed from: j */
    public static boolean m547j(Context context, Uri uri) {
        String m550g = m550g(context, uri);
        if (!"vnd.android.document/directory".equals(m550g) && !TextUtils.isEmpty(m550g)) {
            return true;
        }
        return false;
    }

    /* renamed from: k */
    public static boolean m546k(Context context, Uri uri) {
        if (!DocumentsContract.isDocumentUri(context, uri) || (m552e(context, uri) & 512) == 0) {
            return false;
        }
        return true;
    }

    /* renamed from: l */
    public static long m545l(Context context, Uri uri) {
        return m542o(context, uri, "last_modified", 0L);
    }

    /* renamed from: m */
    public static long m544m(Context context, Uri uri) {
        return m542o(context, uri, "_size", 0L);
    }

    /* renamed from: n */
    public static int m543n(Context context, Uri uri, String str, int i) {
        return (int) m542o(context, uri, str, i);
    }

    /* renamed from: o */
    public static long m542o(Context context, Uri uri, String str, long j) {
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
            m554c(cursor);
        }
    }

    /* renamed from: p */
    public static String m541p(Context context, Uri uri, String str, String str2) {
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
            m554c(cursor);
        }
    }
}

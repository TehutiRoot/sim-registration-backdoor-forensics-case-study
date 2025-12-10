package com.zxy.tiny.common;

import android.database.Cursor;
import android.net.Uri;
import com.zxy.tiny.Tiny;

/* loaded from: classes5.dex */
public final class UriUtil {
    public static final String DATA_SCHEME = "data";
    public static final String HTTPS_SCHEME = "https";
    public static final String HTTP_SCHEME = "http";
    public static final String LOCAL_ASSET_SCHEME = "asset";
    public static final String LOCAL_CONTENT_SCHEME = "content";
    public static final String LOCAL_FILE_SCHEME = "file";
    public static final String LOCAL_RESOURCE_SCHEME = "res";

    public static String getRealPathFromUri(Uri uri) {
        if (isLocalContentUri(uri)) {
            Cursor query = Tiny.getInstance().getApplication().getContentResolver().query(uri, null, null, null, null);
            if (query == null) {
                return null;
            }
            query.moveToFirst();
            String string = query.getString(query.getColumnIndex("_data"));
            query.close();
            return string;
        } else if (!isLocalFileUri(uri)) {
            return null;
        } else {
            return uri.getPath();
        }
    }

    public static String getSchemeOrNull(Uri uri) {
        if (uri == null) {
            return null;
        }
        return uri.getScheme();
    }

    public static boolean isDataUri(Uri uri) {
        return "data".equals(getSchemeOrNull(uri));
    }

    public static boolean isLocalAssetUri(Uri uri) {
        return LOCAL_ASSET_SCHEME.equals(getSchemeOrNull(uri));
    }

    public static boolean isLocalContentUri(Uri uri) {
        return "content".equals(getSchemeOrNull(uri));
    }

    public static boolean isLocalFileUri(Uri uri) {
        return "file".equals(getSchemeOrNull(uri));
    }

    public static boolean isLocalResourceUri(Uri uri) {
        return LOCAL_RESOURCE_SCHEME.equals(getSchemeOrNull(uri));
    }

    public static boolean isNetworkUri(Uri uri) {
        String schemeOrNull = getSchemeOrNull(uri);
        if (!HTTPS_SCHEME.equals(schemeOrNull) && !"http".equals(schemeOrNull)) {
            return false;
        }
        return true;
    }

    public static Uri parseUriOrNull(String str) {
        if (str != null) {
            return Uri.parse(str);
        }
        return null;
    }
}

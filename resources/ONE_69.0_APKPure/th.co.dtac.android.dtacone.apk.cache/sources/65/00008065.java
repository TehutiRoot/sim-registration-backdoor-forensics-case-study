package com.bumptech.glide.load.data.mediastore;

import android.net.Uri;

/* loaded from: classes3.dex */
public final class MediaStoreUtil {
    /* renamed from: a */
    public static boolean m50487a(Uri uri) {
        return uri.getPathSegments().contains("video");
    }

    public static boolean isAndroidPickerUri(Uri uri) {
        if (isMediaStoreUri(uri) && uri.getPathSegments().contains("picker")) {
            return true;
        }
        return false;
    }

    public static boolean isMediaStoreImageUri(Uri uri) {
        if (isMediaStoreUri(uri) && !m50487a(uri)) {
            return true;
        }
        return false;
    }

    public static boolean isMediaStoreUri(Uri uri) {
        if (uri != null && "content".equals(uri.getScheme()) && "media".equals(uri.getAuthority())) {
            return true;
        }
        return false;
    }

    public static boolean isMediaStoreVideoUri(Uri uri) {
        if (isMediaStoreUri(uri) && m50487a(uri)) {
            return true;
        }
        return false;
    }

    public static boolean isThumbnailSize(int i, int i2) {
        return i != Integer.MIN_VALUE && i2 != Integer.MIN_VALUE && i <= 512 && i2 <= 384;
    }
}
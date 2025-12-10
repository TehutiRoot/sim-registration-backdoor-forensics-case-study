package android.support.p001v4.media;

import android.media.MediaDescription;
import android.net.Uri;

/* renamed from: android.support.v4.media.e */
/* loaded from: classes.dex */
public abstract class AbstractC1963e {

    /* renamed from: android.support.v4.media.e$a */
    /* loaded from: classes.dex */
    public static class C1964a {
        /* renamed from: a */
        public static void m64927a(Object obj, Uri uri) {
            ((MediaDescription.Builder) obj).setMediaUri(uri);
        }
    }

    /* renamed from: a */
    public static Uri m64928a(Object obj) {
        Uri mediaUri;
        mediaUri = ((MediaDescription) obj).getMediaUri();
        return mediaUri;
    }
}

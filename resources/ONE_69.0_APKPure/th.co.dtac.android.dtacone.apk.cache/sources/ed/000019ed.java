package android.support.p001v4.media;

import android.media.MediaDescription;
import android.net.Uri;

/* renamed from: android.support.v4.media.e */
/* loaded from: classes.dex */
public abstract class AbstractC1945e {

    /* renamed from: android.support.v4.media.e$a */
    /* loaded from: classes.dex */
    public static class C1946a {
        /* renamed from: a */
        public static void m64878a(Object obj, Uri uri) {
            ((MediaDescription.Builder) obj).setMediaUri(uri);
        }
    }

    /* renamed from: a */
    public static Uri m64879a(Object obj) {
        Uri mediaUri;
        mediaUri = ((MediaDescription) obj).getMediaUri();
        return mediaUri;
    }
}
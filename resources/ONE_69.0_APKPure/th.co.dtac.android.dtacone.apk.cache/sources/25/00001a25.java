package android.support.p001v4.media.session;

import android.content.Intent;
import android.media.session.MediaSession;
import android.net.Uri;
import android.os.Bundle;
import android.os.ResultReceiver;
import android.support.p001v4.media.session.MediaSessionCompatApi23;
import java.lang.reflect.InvocationTargetException;

/* renamed from: android.support.v4.media.session.MediaSessionCompatApi24 */
/* loaded from: classes.dex */
public abstract class MediaSessionCompatApi24 {

    /* renamed from: android.support.v4.media.session.MediaSessionCompatApi24$Callback */
    /* loaded from: classes.dex */
    public interface Callback extends MediaSessionCompatApi23.Callback {
        @Override // android.support.p001v4.media.session.MediaSessionCompatApi23.Callback, android.support.p001v4.media.session.AbstractC1980a.InterfaceC1981a
        /* synthetic */ void onCommand(String str, Bundle bundle, ResultReceiver resultReceiver);

        @Override // android.support.p001v4.media.session.MediaSessionCompatApi23.Callback, android.support.p001v4.media.session.AbstractC1980a.InterfaceC1981a
        /* synthetic */ void onCustomAction(String str, Bundle bundle);

        @Override // android.support.p001v4.media.session.MediaSessionCompatApi23.Callback, android.support.p001v4.media.session.AbstractC1980a.InterfaceC1981a
        /* synthetic */ void onFastForward();

        @Override // android.support.p001v4.media.session.MediaSessionCompatApi23.Callback, android.support.p001v4.media.session.AbstractC1980a.InterfaceC1981a
        /* synthetic */ boolean onMediaButtonEvent(Intent intent);

        @Override // android.support.p001v4.media.session.MediaSessionCompatApi23.Callback, android.support.p001v4.media.session.AbstractC1980a.InterfaceC1981a
        /* synthetic */ void onPause();

        @Override // android.support.p001v4.media.session.MediaSessionCompatApi23.Callback, android.support.p001v4.media.session.AbstractC1980a.InterfaceC1981a
        /* synthetic */ void onPlay();

        @Override // android.support.p001v4.media.session.MediaSessionCompatApi23.Callback, android.support.p001v4.media.session.AbstractC1980a.InterfaceC1981a
        /* synthetic */ void onPlayFromMediaId(String str, Bundle bundle);

        @Override // android.support.p001v4.media.session.MediaSessionCompatApi23.Callback, android.support.p001v4.media.session.AbstractC1980a.InterfaceC1981a
        /* synthetic */ void onPlayFromSearch(String str, Bundle bundle);

        void onPrepare();

        void onPrepareFromMediaId(String str, Bundle bundle);

        void onPrepareFromSearch(String str, Bundle bundle);

        void onPrepareFromUri(Uri uri, Bundle bundle);

        @Override // android.support.p001v4.media.session.MediaSessionCompatApi23.Callback, android.support.p001v4.media.session.AbstractC1980a.InterfaceC1981a
        /* synthetic */ void onRewind();

        @Override // android.support.p001v4.media.session.MediaSessionCompatApi23.Callback, android.support.p001v4.media.session.AbstractC1980a.InterfaceC1981a
        /* synthetic */ void onSeekTo(long j);

        @Override // android.support.p001v4.media.session.MediaSessionCompatApi23.Callback, android.support.p001v4.media.session.AbstractC1980a.InterfaceC1981a
        /* synthetic */ void onSetRating(Object obj);

        @Override // android.support.p001v4.media.session.MediaSessionCompatApi23.Callback
        /* synthetic */ void onSetRating(Object obj, Bundle bundle);

        @Override // android.support.p001v4.media.session.MediaSessionCompatApi23.Callback, android.support.p001v4.media.session.AbstractC1980a.InterfaceC1981a
        /* synthetic */ void onSkipToNext();

        @Override // android.support.p001v4.media.session.MediaSessionCompatApi23.Callback, android.support.p001v4.media.session.AbstractC1980a.InterfaceC1981a
        /* synthetic */ void onSkipToPrevious();

        @Override // android.support.p001v4.media.session.MediaSessionCompatApi23.Callback, android.support.p001v4.media.session.AbstractC1980a.InterfaceC1981a
        /* synthetic */ void onSkipToQueueItem(long j);

        @Override // android.support.p001v4.media.session.MediaSessionCompatApi23.Callback, android.support.p001v4.media.session.AbstractC1980a.InterfaceC1981a
        /* synthetic */ void onStop();
    }

    /* renamed from: android.support.v4.media.session.MediaSessionCompatApi24$a */
    /* loaded from: classes.dex */
    public static class C1976a extends MediaSessionCompatApi23.C1975a {
        public C1976a(Callback callback) {
            super(callback);
        }

        @Override // android.media.session.MediaSession.Callback
        public void onPrepare() {
            ((Callback) this.f8717a).onPrepare();
        }

        @Override // android.media.session.MediaSession.Callback
        public void onPrepareFromMediaId(String str, Bundle bundle) {
            MediaSessionCompat.ensureClassLoader(bundle);
            ((Callback) this.f8717a).onPrepareFromMediaId(str, bundle);
        }

        @Override // android.media.session.MediaSession.Callback
        public void onPrepareFromSearch(String str, Bundle bundle) {
            MediaSessionCompat.ensureClassLoader(bundle);
            ((Callback) this.f8717a).onPrepareFromSearch(str, bundle);
        }

        @Override // android.media.session.MediaSession.Callback
        public void onPrepareFromUri(Uri uri, Bundle bundle) {
            MediaSessionCompat.ensureClassLoader(bundle);
            ((Callback) this.f8717a).onPrepareFromUri(uri, bundle);
        }
    }

    /* renamed from: a */
    public static Object m64807a(Callback callback) {
        return new C1976a(callback);
    }

    /* renamed from: b */
    public static String m64806b(Object obj) {
        MediaSession mediaSession = (MediaSession) obj;
        try {
            return (String) mediaSession.getClass().getMethod("getCallingPackage", null).invoke(mediaSession, null);
        } catch (IllegalAccessException | NoSuchMethodException | InvocationTargetException unused) {
            return null;
        }
    }
}
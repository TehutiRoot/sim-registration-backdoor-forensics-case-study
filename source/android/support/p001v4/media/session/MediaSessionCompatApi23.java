package android.support.p001v4.media.session;

import android.content.Intent;
import android.net.Uri;
import android.os.Bundle;
import android.os.ResultReceiver;
import android.support.p001v4.media.session.AbstractC1998a;

/* renamed from: android.support.v4.media.session.MediaSessionCompatApi23 */
/* loaded from: classes.dex */
public abstract class MediaSessionCompatApi23 {

    /* renamed from: android.support.v4.media.session.MediaSessionCompatApi23$Callback */
    /* loaded from: classes.dex */
    public interface Callback extends AbstractC1998a.InterfaceC1999a {
        @Override // android.support.p001v4.media.session.AbstractC1998a.InterfaceC1999a
        /* synthetic */ void onCommand(String str, Bundle bundle, ResultReceiver resultReceiver);

        @Override // android.support.p001v4.media.session.AbstractC1998a.InterfaceC1999a
        /* synthetic */ void onCustomAction(String str, Bundle bundle);

        @Override // android.support.p001v4.media.session.AbstractC1998a.InterfaceC1999a
        /* synthetic */ void onFastForward();

        @Override // android.support.p001v4.media.session.AbstractC1998a.InterfaceC1999a
        /* synthetic */ boolean onMediaButtonEvent(Intent intent);

        @Override // android.support.p001v4.media.session.AbstractC1998a.InterfaceC1999a
        /* synthetic */ void onPause();

        @Override // android.support.p001v4.media.session.AbstractC1998a.InterfaceC1999a
        /* synthetic */ void onPlay();

        @Override // android.support.p001v4.media.session.AbstractC1998a.InterfaceC1999a
        /* synthetic */ void onPlayFromMediaId(String str, Bundle bundle);

        @Override // android.support.p001v4.media.session.AbstractC1998a.InterfaceC1999a
        /* synthetic */ void onPlayFromSearch(String str, Bundle bundle);

        void onPlayFromUri(Uri uri, Bundle bundle);

        @Override // android.support.p001v4.media.session.AbstractC1998a.InterfaceC1999a
        /* synthetic */ void onRewind();

        @Override // android.support.p001v4.media.session.AbstractC1998a.InterfaceC1999a
        /* synthetic */ void onSeekTo(long j);

        @Override // android.support.p001v4.media.session.AbstractC1998a.InterfaceC1999a
        /* synthetic */ void onSetRating(Object obj);

        /* synthetic */ void onSetRating(Object obj, Bundle bundle);

        @Override // android.support.p001v4.media.session.AbstractC1998a.InterfaceC1999a
        /* synthetic */ void onSkipToNext();

        @Override // android.support.p001v4.media.session.AbstractC1998a.InterfaceC1999a
        /* synthetic */ void onSkipToPrevious();

        @Override // android.support.p001v4.media.session.AbstractC1998a.InterfaceC1999a
        /* synthetic */ void onSkipToQueueItem(long j);

        @Override // android.support.p001v4.media.session.AbstractC1998a.InterfaceC1999a
        /* synthetic */ void onStop();
    }

    /* renamed from: android.support.v4.media.session.MediaSessionCompatApi23$a */
    /* loaded from: classes.dex */
    public static class C1993a extends AbstractC1998a.C2000b {
        public C1993a(Callback callback) {
            super(callback);
        }

        @Override // android.media.session.MediaSession.Callback
        public void onPlayFromUri(Uri uri, Bundle bundle) {
            MediaSessionCompat.ensureClassLoader(bundle);
            ((Callback) this.f8629a).onPlayFromUri(uri, bundle);
        }
    }

    /* renamed from: a */
    public static Object m64857a(Callback callback) {
        return new C1993a(callback);
    }
}

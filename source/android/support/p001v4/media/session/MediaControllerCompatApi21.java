package android.support.p001v4.media.session;

import android.app.Activity;
import android.app.PendingIntent;
import android.content.Context;
import android.media.AudioAttributes;
import android.media.MediaMetadata;
import android.media.Rating;
import android.media.session.MediaController;
import android.media.session.MediaSession;
import android.media.session.PlaybackState;
import android.os.Bundle;
import android.os.Handler;
import android.os.ResultReceiver;
import android.view.KeyEvent;
import java.util.ArrayList;
import java.util.List;

/* renamed from: android.support.v4.media.session.MediaControllerCompatApi21 */
/* loaded from: classes.dex */
public abstract class MediaControllerCompatApi21 {

    /* renamed from: android.support.v4.media.session.MediaControllerCompatApi21$Callback */
    /* loaded from: classes.dex */
    public interface Callback {
        void onAudioInfoChanged(int i, int i2, int i3, int i4, int i5);

        void onExtrasChanged(Bundle bundle);

        void onMetadataChanged(Object obj);

        void onPlaybackStateChanged(Object obj);

        void onQueueChanged(List<?> list);

        void onQueueTitleChanged(CharSequence charSequence);

        void onSessionDestroyed();

        void onSessionEvent(String str, Bundle bundle);
    }

    /* renamed from: android.support.v4.media.session.MediaControllerCompatApi21$PlaybackInfo */
    /* loaded from: classes.dex */
    public static class PlaybackInfo {
        /* renamed from: a */
        public static int m64886a(AudioAttributes audioAttributes) {
            if ((audioAttributes.getFlags() & 1) == 1) {
                return 7;
            }
            if ((audioAttributes.getFlags() & 4) == 4) {
                return 6;
            }
            int usage = audioAttributes.getUsage();
            if (usage == 13) {
                return 1;
            }
            switch (usage) {
                case 2:
                    return 0;
                case 3:
                    return 8;
                case 4:
                    return 4;
                case 5:
                case 7:
                case 8:
                case 9:
                case 10:
                    return 5;
                case 6:
                    return 2;
                default:
                    return 3;
            }
        }

        public static AudioAttributes getAudioAttributes(Object obj) {
            return ((MediaController.PlaybackInfo) obj).getAudioAttributes();
        }

        public static int getCurrentVolume(Object obj) {
            return ((MediaController.PlaybackInfo) obj).getCurrentVolume();
        }

        public static int getLegacyAudioStream(Object obj) {
            return m64886a(getAudioAttributes(obj));
        }

        public static int getMaxVolume(Object obj) {
            return ((MediaController.PlaybackInfo) obj).getMaxVolume();
        }

        public static int getPlaybackType(Object obj) {
            return ((MediaController.PlaybackInfo) obj).getPlaybackType();
        }

        public static int getVolumeControl(Object obj) {
            return ((MediaController.PlaybackInfo) obj).getVolumeControl();
        }
    }

    /* renamed from: android.support.v4.media.session.MediaControllerCompatApi21$TransportControls */
    /* loaded from: classes.dex */
    public static class TransportControls {
        public static void fastForward(Object obj) {
            ((MediaController.TransportControls) obj).fastForward();
        }

        public static void pause(Object obj) {
            ((MediaController.TransportControls) obj).pause();
        }

        public static void play(Object obj) {
            ((MediaController.TransportControls) obj).play();
        }

        public static void playFromMediaId(Object obj, String str, Bundle bundle) {
            ((MediaController.TransportControls) obj).playFromMediaId(str, bundle);
        }

        public static void playFromSearch(Object obj, String str, Bundle bundle) {
            ((MediaController.TransportControls) obj).playFromSearch(str, bundle);
        }

        public static void rewind(Object obj) {
            ((MediaController.TransportControls) obj).rewind();
        }

        public static void seekTo(Object obj, long j) {
            ((MediaController.TransportControls) obj).seekTo(j);
        }

        public static void sendCustomAction(Object obj, String str, Bundle bundle) {
            ((MediaController.TransportControls) obj).sendCustomAction(str, bundle);
        }

        public static void setRating(Object obj, Object obj2) {
            ((MediaController.TransportControls) obj).setRating((Rating) obj2);
        }

        public static void skipToNext(Object obj) {
            ((MediaController.TransportControls) obj).skipToNext();
        }

        public static void skipToPrevious(Object obj) {
            ((MediaController.TransportControls) obj).skipToPrevious();
        }

        public static void skipToQueueItem(Object obj, long j) {
            ((MediaController.TransportControls) obj).skipToQueueItem(j);
        }

        public static void stop(Object obj) {
            ((MediaController.TransportControls) obj).stop();
        }
    }

    /* renamed from: android.support.v4.media.session.MediaControllerCompatApi21$a */
    /* loaded from: classes.dex */
    public static class C1978a extends MediaController.Callback {

        /* renamed from: a */
        public final Callback f8562a;

        public C1978a(Callback callback) {
            this.f8562a = callback;
        }

        @Override // android.media.session.MediaController.Callback
        public void onAudioInfoChanged(MediaController.PlaybackInfo playbackInfo) {
            this.f8562a.onAudioInfoChanged(playbackInfo.getPlaybackType(), PlaybackInfo.getLegacyAudioStream(playbackInfo), playbackInfo.getVolumeControl(), playbackInfo.getMaxVolume(), playbackInfo.getCurrentVolume());
        }

        @Override // android.media.session.MediaController.Callback
        public void onExtrasChanged(Bundle bundle) {
            MediaSessionCompat.ensureClassLoader(bundle);
            this.f8562a.onExtrasChanged(bundle);
        }

        @Override // android.media.session.MediaController.Callback
        public void onMetadataChanged(MediaMetadata mediaMetadata) {
            this.f8562a.onMetadataChanged(mediaMetadata);
        }

        @Override // android.media.session.MediaController.Callback
        public void onPlaybackStateChanged(PlaybackState playbackState) {
            this.f8562a.onPlaybackStateChanged(playbackState);
        }

        @Override // android.media.session.MediaController.Callback
        public void onQueueChanged(List list) {
            this.f8562a.onQueueChanged(list);
        }

        @Override // android.media.session.MediaController.Callback
        public void onQueueTitleChanged(CharSequence charSequence) {
            this.f8562a.onQueueTitleChanged(charSequence);
        }

        @Override // android.media.session.MediaController.Callback
        public void onSessionDestroyed() {
            this.f8562a.onSessionDestroyed();
        }

        @Override // android.media.session.MediaController.Callback
        public void onSessionEvent(String str, Bundle bundle) {
            MediaSessionCompat.ensureClassLoader(bundle);
            this.f8562a.onSessionEvent(str, bundle);
        }
    }

    /* renamed from: a */
    public static void m64908a(Object obj, int i, int i2) {
        ((MediaController) obj).adjustVolume(i, i2);
    }

    /* renamed from: b */
    public static Object m64907b(Callback callback) {
        return new C1978a(callback);
    }

    /* renamed from: c */
    public static boolean m64906c(Object obj, KeyEvent keyEvent) {
        return ((MediaController) obj).dispatchMediaButtonEvent(keyEvent);
    }

    /* renamed from: d */
    public static Object m64905d(Context context, Object obj) {
        return new MediaController(context, (MediaSession.Token) obj);
    }

    /* renamed from: e */
    public static Bundle m64904e(Object obj) {
        return ((MediaController) obj).getExtras();
    }

    /* renamed from: f */
    public static long m64903f(Object obj) {
        return ((MediaController) obj).getFlags();
    }

    /* renamed from: g */
    public static Object m64902g(Activity activity) {
        return activity.getMediaController();
    }

    /* renamed from: h */
    public static Object m64901h(Object obj) {
        return ((MediaController) obj).getMetadata();
    }

    /* renamed from: i */
    public static String m64900i(Object obj) {
        return ((MediaController) obj).getPackageName();
    }

    /* renamed from: j */
    public static Object m64899j(Object obj) {
        return ((MediaController) obj).getPlaybackInfo();
    }

    /* renamed from: k */
    public static Object m64898k(Object obj) {
        return ((MediaController) obj).getPlaybackState();
    }

    /* renamed from: l */
    public static List m64897l(Object obj) {
        List<MediaSession.QueueItem> queue = ((MediaController) obj).getQueue();
        if (queue == null) {
            return null;
        }
        return new ArrayList(queue);
    }

    /* renamed from: m */
    public static CharSequence m64896m(Object obj) {
        return ((MediaController) obj).getQueueTitle();
    }

    /* renamed from: n */
    public static int m64895n(Object obj) {
        return ((MediaController) obj).getRatingType();
    }

    /* renamed from: o */
    public static PendingIntent m64894o(Object obj) {
        return ((MediaController) obj).getSessionActivity();
    }

    /* renamed from: p */
    public static Object m64893p(Object obj) {
        return ((MediaController) obj).getSessionToken();
    }

    /* renamed from: q */
    public static Object m64892q(Object obj) {
        return ((MediaController) obj).getTransportControls();
    }

    /* renamed from: r */
    public static void m64891r(Object obj, Object obj2, Handler handler) {
        ((MediaController) obj).registerCallback((MediaController.Callback) obj2, handler);
    }

    /* renamed from: s */
    public static void m64890s(Object obj, String str, Bundle bundle, ResultReceiver resultReceiver) {
        ((MediaController) obj).sendCommand(str, bundle, resultReceiver);
    }

    /* renamed from: t */
    public static void m64889t(Activity activity, Object obj) {
        activity.setMediaController((MediaController) obj);
    }

    /* renamed from: u */
    public static void m64888u(Object obj, int i, int i2) {
        ((MediaController) obj).setVolumeTo(i, i2);
    }

    /* renamed from: v */
    public static void m64887v(Object obj, Object obj2) {
        ((MediaController) obj).unregisterCallback((MediaController.Callback) obj2);
    }
}

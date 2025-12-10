package android.support.p001v4.media.session;

import android.app.Activity;
import android.app.PendingIntent;
import android.content.Context;
import android.net.Uri;
import android.os.Build;
import android.os.Bundle;
import android.os.Handler;
import android.os.IBinder;
import android.os.Looper;
import android.os.Message;
import android.os.RemoteException;
import android.os.ResultReceiver;
import android.support.p001v4.media.MediaDescriptionCompat;
import android.support.p001v4.media.MediaMetadataCompat;
import android.support.p001v4.media.RatingCompat;
import android.support.p001v4.media.session.IMediaControllerCallback;
import android.support.p001v4.media.session.IMediaSession;
import android.support.p001v4.media.session.MediaControllerCompatApi21;
import android.support.p001v4.media.session.MediaSessionCompat;
import android.support.p001v4.media.session.PlaybackStateCompat;
import android.text.TextUtils;
import android.util.Log;
import android.view.KeyEvent;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.annotation.RestrictTo;
import androidx.core.app.BundleCompat;
import androidx.core.app.ComponentActivity;
import java.lang.ref.WeakReference;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.HashSet;
import java.util.List;

/* renamed from: android.support.v4.media.session.MediaControllerCompat */
/* loaded from: classes.dex */
public final class MediaControllerCompat {
    @RestrictTo({RestrictTo.Scope.LIBRARY})
    public static final String COMMAND_ADD_QUEUE_ITEM = "android.support.v4.media.session.command.ADD_QUEUE_ITEM";
    @RestrictTo({RestrictTo.Scope.LIBRARY})
    public static final String COMMAND_ADD_QUEUE_ITEM_AT = "android.support.v4.media.session.command.ADD_QUEUE_ITEM_AT";
    @RestrictTo({RestrictTo.Scope.LIBRARY})
    public static final String COMMAND_ARGUMENT_INDEX = "android.support.v4.media.session.command.ARGUMENT_INDEX";
    @RestrictTo({RestrictTo.Scope.LIBRARY})
    public static final String COMMAND_ARGUMENT_MEDIA_DESCRIPTION = "android.support.v4.media.session.command.ARGUMENT_MEDIA_DESCRIPTION";
    @RestrictTo({RestrictTo.Scope.LIBRARY})
    public static final String COMMAND_GET_EXTRA_BINDER = "android.support.v4.media.session.command.GET_EXTRA_BINDER";
    @RestrictTo({RestrictTo.Scope.LIBRARY})
    public static final String COMMAND_REMOVE_QUEUE_ITEM = "android.support.v4.media.session.command.REMOVE_QUEUE_ITEM";
    @RestrictTo({RestrictTo.Scope.LIBRARY})
    public static final String COMMAND_REMOVE_QUEUE_ITEM_AT = "android.support.v4.media.session.command.REMOVE_QUEUE_ITEM_AT";

    /* renamed from: a */
    public final InterfaceC1954b f8627a;

    /* renamed from: b */
    public final MediaSessionCompat.Token f8628b;

    /* renamed from: c */
    public final HashSet f8629c = new HashSet();

    /* renamed from: android.support.v4.media.session.MediaControllerCompat$Callback */
    /* loaded from: classes.dex */
    public static abstract class Callback implements IBinder.DeathRecipient {

        /* renamed from: a */
        public final Object f8630a = MediaControllerCompatApi21.m64858b(new C1950b(this));

        /* renamed from: b */
        public HandlerC1949a f8631b;

        /* renamed from: c */
        public IMediaControllerCallback f8632c;

        /* renamed from: android.support.v4.media.session.MediaControllerCompat$Callback$a */
        /* loaded from: classes.dex */
        public class HandlerC1949a extends Handler {

            /* renamed from: a */
            public boolean f8633a;

            public HandlerC1949a(Looper looper) {
                super(looper);
                this.f8633a = false;
            }

            @Override // android.os.Handler
            public void handleMessage(Message message) {
                if (!this.f8633a) {
                    return;
                }
                switch (message.what) {
                    case 1:
                        Bundle data = message.getData();
                        MediaSessionCompat.ensureClassLoader(data);
                        Callback.this.onSessionEvent((String) message.obj, data);
                        return;
                    case 2:
                        Callback.this.onPlaybackStateChanged((PlaybackStateCompat) message.obj);
                        return;
                    case 3:
                        Callback.this.onMetadataChanged((MediaMetadataCompat) message.obj);
                        return;
                    case 4:
                        Callback.this.onAudioInfoChanged((PlaybackInfo) message.obj);
                        return;
                    case 5:
                        Callback.this.onQueueChanged((List) message.obj);
                        return;
                    case 6:
                        Callback.this.onQueueTitleChanged((CharSequence) message.obj);
                        return;
                    case 7:
                        Bundle bundle = (Bundle) message.obj;
                        MediaSessionCompat.ensureClassLoader(bundle);
                        Callback.this.onExtrasChanged(bundle);
                        return;
                    case 8:
                        Callback.this.onSessionDestroyed();
                        return;
                    case 9:
                        Callback.this.onRepeatModeChanged(((Integer) message.obj).intValue());
                        return;
                    case 10:
                    default:
                        return;
                    case 11:
                        Callback.this.onCaptioningEnabledChanged(((Boolean) message.obj).booleanValue());
                        return;
                    case 12:
                        Callback.this.onShuffleModeChanged(((Integer) message.obj).intValue());
                        return;
                    case 13:
                        Callback.this.onSessionReady();
                        return;
                }
            }
        }

        /* renamed from: android.support.v4.media.session.MediaControllerCompat$Callback$b */
        /* loaded from: classes.dex */
        public static class C1950b implements MediaControllerCompatApi21.Callback {

            /* renamed from: a */
            public final WeakReference f8635a;

            public C1950b(Callback callback) {
                this.f8635a = new WeakReference(callback);
            }

            @Override // android.support.p001v4.media.session.MediaControllerCompatApi21.Callback
            public void onAudioInfoChanged(int i, int i2, int i3, int i4, int i5) {
                Callback callback = (Callback) this.f8635a.get();
                if (callback != null) {
                    callback.onAudioInfoChanged(new PlaybackInfo(i, i2, i3, i4, i5));
                }
            }

            @Override // android.support.p001v4.media.session.MediaControllerCompatApi21.Callback
            public void onExtrasChanged(Bundle bundle) {
                Callback callback = (Callback) this.f8635a.get();
                if (callback != null) {
                    callback.onExtrasChanged(bundle);
                }
            }

            @Override // android.support.p001v4.media.session.MediaControllerCompatApi21.Callback
            public void onMetadataChanged(Object obj) {
                Callback callback = (Callback) this.f8635a.get();
                if (callback != null) {
                    callback.onMetadataChanged(MediaMetadataCompat.fromMediaMetadata(obj));
                }
            }

            @Override // android.support.p001v4.media.session.MediaControllerCompatApi21.Callback
            public void onPlaybackStateChanged(Object obj) {
                Callback callback = (Callback) this.f8635a.get();
                if (callback != null && callback.f8632c == null) {
                    callback.onPlaybackStateChanged(PlaybackStateCompat.fromPlaybackState(obj));
                }
            }

            @Override // android.support.p001v4.media.session.MediaControllerCompatApi21.Callback
            public void onQueueChanged(List list) {
                Callback callback = (Callback) this.f8635a.get();
                if (callback != null) {
                    callback.onQueueChanged(MediaSessionCompat.QueueItem.fromQueueItemList(list));
                }
            }

            @Override // android.support.p001v4.media.session.MediaControllerCompatApi21.Callback
            public void onQueueTitleChanged(CharSequence charSequence) {
                Callback callback = (Callback) this.f8635a.get();
                if (callback != null) {
                    callback.onQueueTitleChanged(charSequence);
                }
            }

            @Override // android.support.p001v4.media.session.MediaControllerCompatApi21.Callback
            public void onSessionDestroyed() {
                Callback callback = (Callback) this.f8635a.get();
                if (callback != null) {
                    callback.onSessionDestroyed();
                }
            }

            @Override // android.support.p001v4.media.session.MediaControllerCompatApi21.Callback
            public void onSessionEvent(String str, Bundle bundle) {
                Callback callback = (Callback) this.f8635a.get();
                if (callback != null) {
                    if (callback.f8632c == null || Build.VERSION.SDK_INT >= 23) {
                        callback.onSessionEvent(str, bundle);
                    }
                }
            }
        }

        /* renamed from: android.support.v4.media.session.MediaControllerCompat$Callback$c */
        /* loaded from: classes.dex */
        public static class BinderC1951c extends IMediaControllerCallback.Stub {

            /* renamed from: a */
            public final WeakReference f8636a;

            public BinderC1951c(Callback callback) {
                this.f8636a = new WeakReference(callback);
            }

            @Override // android.support.p001v4.media.session.IMediaControllerCallback
            public void onCaptioningEnabledChanged(boolean z) {
                Callback callback = (Callback) this.f8636a.get();
                if (callback != null) {
                    callback.m64876a(11, Boolean.valueOf(z), null);
                }
            }

            @Override // android.support.p001v4.media.session.IMediaControllerCallback
            public void onEvent(String str, Bundle bundle) {
                Callback callback = (Callback) this.f8636a.get();
                if (callback != null) {
                    callback.m64876a(1, str, bundle);
                }
            }

            @Override // android.support.p001v4.media.session.IMediaControllerCallback
            public void onPlaybackStateChanged(PlaybackStateCompat playbackStateCompat) {
                Callback callback = (Callback) this.f8636a.get();
                if (callback != null) {
                    callback.m64876a(2, playbackStateCompat, null);
                }
            }

            @Override // android.support.p001v4.media.session.IMediaControllerCallback
            public void onRepeatModeChanged(int i) {
                Callback callback = (Callback) this.f8636a.get();
                if (callback != null) {
                    callback.m64876a(9, Integer.valueOf(i), null);
                }
            }

            @Override // android.support.p001v4.media.session.IMediaControllerCallback
            public void onSessionReady() {
                Callback callback = (Callback) this.f8636a.get();
                if (callback != null) {
                    callback.m64876a(13, null, null);
                }
            }

            @Override // android.support.p001v4.media.session.IMediaControllerCallback
            public void onShuffleModeChanged(int i) {
                Callback callback = (Callback) this.f8636a.get();
                if (callback != null) {
                    callback.m64876a(12, Integer.valueOf(i), null);
                }
            }

            @Override // android.support.p001v4.media.session.IMediaControllerCallback
            public void onShuffleModeChangedRemoved(boolean z) {
            }
        }

        /* renamed from: a */
        public void m64876a(int i, Object obj, Bundle bundle) {
            HandlerC1949a handlerC1949a = this.f8631b;
            if (handlerC1949a != null) {
                Message obtainMessage = handlerC1949a.obtainMessage(i, obj);
                obtainMessage.setData(bundle);
                obtainMessage.sendToTarget();
            }
        }

        /* renamed from: b */
        public void m64875b(Handler handler) {
            if (handler == null) {
                HandlerC1949a handlerC1949a = this.f8631b;
                if (handlerC1949a != null) {
                    handlerC1949a.f8633a = false;
                    handlerC1949a.removeCallbacksAndMessages(null);
                    this.f8631b = null;
                    return;
                }
                return;
            }
            HandlerC1949a handlerC1949a2 = new HandlerC1949a(handler.getLooper());
            this.f8631b = handlerC1949a2;
            handlerC1949a2.f8633a = true;
        }

        @Override // android.os.IBinder.DeathRecipient
        public void binderDied() {
            m64876a(8, null, null);
        }

        @RestrictTo({RestrictTo.Scope.LIBRARY})
        public IMediaControllerCallback getIControllerCallback() {
            return this.f8632c;
        }

        public void onAudioInfoChanged(PlaybackInfo playbackInfo) {
        }

        public void onCaptioningEnabledChanged(boolean z) {
        }

        public void onExtrasChanged(Bundle bundle) {
        }

        public void onMetadataChanged(MediaMetadataCompat mediaMetadataCompat) {
        }

        public void onPlaybackStateChanged(PlaybackStateCompat playbackStateCompat) {
        }

        public void onQueueChanged(List<MediaSessionCompat.QueueItem> list) {
        }

        public void onQueueTitleChanged(CharSequence charSequence) {
        }

        public void onRepeatModeChanged(int i) {
        }

        public void onSessionDestroyed() {
        }

        public void onSessionEvent(String str, Bundle bundle) {
        }

        public void onSessionReady() {
        }

        public void onShuffleModeChanged(int i) {
        }
    }

    /* renamed from: android.support.v4.media.session.MediaControllerCompat$MediaControllerImplApi21 */
    /* loaded from: classes.dex */
    public static class MediaControllerImplApi21 implements InterfaceC1954b {

        /* renamed from: a */
        public final Object f8637a;

        /* renamed from: b */
        public final Object f8638b = new Object();

        /* renamed from: c */
        public final List f8639c = new ArrayList();

        /* renamed from: d */
        public HashMap f8640d = new HashMap();

        /* renamed from: e */
        public final MediaSessionCompat.Token f8641e;

        /* renamed from: android.support.v4.media.session.MediaControllerCompat$MediaControllerImplApi21$ExtraBinderRequestResultReceiver */
        /* loaded from: classes.dex */
        public static class ExtraBinderRequestResultReceiver extends ResultReceiver {

            /* renamed from: a */
            public WeakReference f8642a;

            public ExtraBinderRequestResultReceiver(MediaControllerImplApi21 mediaControllerImplApi21) {
                super(null);
                this.f8642a = new WeakReference(mediaControllerImplApi21);
            }

            @Override // android.os.ResultReceiver
            public void onReceiveResult(int i, Bundle bundle) {
                MediaControllerImplApi21 mediaControllerImplApi21 = (MediaControllerImplApi21) this.f8642a.get();
                if (mediaControllerImplApi21 != null && bundle != null) {
                    synchronized (mediaControllerImplApi21.f8638b) {
                        mediaControllerImplApi21.f8641e.setExtraBinder(IMediaSession.Stub.asInterface(BundleCompat.getBinder(bundle, MediaSessionCompat.KEY_EXTRA_BINDER)));
                        mediaControllerImplApi21.f8641e.setSessionToken2Bundle(bundle.getBundle(MediaSessionCompat.KEY_SESSION_TOKEN2_BUNDLE));
                        mediaControllerImplApi21.m64874m();
                    }
                }
            }
        }

        /* renamed from: android.support.v4.media.session.MediaControllerCompat$MediaControllerImplApi21$a */
        /* loaded from: classes.dex */
        public static class BinderC1952a extends Callback.BinderC1951c {
            public BinderC1952a(Callback callback) {
                super(callback);
            }

            @Override // android.support.p001v4.media.session.IMediaControllerCallback
            public void onExtrasChanged(Bundle bundle) {
                throw new AssertionError();
            }

            @Override // android.support.p001v4.media.session.IMediaControllerCallback
            public void onMetadataChanged(MediaMetadataCompat mediaMetadataCompat) {
                throw new AssertionError();
            }

            @Override // android.support.p001v4.media.session.IMediaControllerCallback
            public void onQueueChanged(List list) {
                throw new AssertionError();
            }

            @Override // android.support.p001v4.media.session.IMediaControllerCallback
            public void onQueueTitleChanged(CharSequence charSequence) {
                throw new AssertionError();
            }

            @Override // android.support.p001v4.media.session.IMediaControllerCallback
            public void onSessionDestroyed() {
                throw new AssertionError();
            }

            @Override // android.support.p001v4.media.session.IMediaControllerCallback
            public void onVolumeInfoChanged(ParcelableVolumeInfo parcelableVolumeInfo) {
                throw new AssertionError();
            }
        }

        public MediaControllerImplApi21(Context context, MediaSessionCompat.Token token) {
            this.f8641e = token;
            Object m64856d = MediaControllerCompatApi21.m64856d(context, token.getToken());
            this.f8637a = m64856d;
            if (m64856d != null) {
                if (token.getExtraBinder() == null) {
                    m64873n();
                    return;
                }
                return;
            }
            throw new RemoteException();
        }

        @Override // android.support.p001v4.media.session.MediaControllerCompat.InterfaceC1954b
        /* renamed from: a */
        public final void mo64871a(Callback callback) {
            MediaControllerCompatApi21.m64838v(this.f8637a, callback.f8630a);
            synchronized (this.f8638b) {
                if (this.f8641e.getExtraBinder() != null) {
                    try {
                        BinderC1952a binderC1952a = (BinderC1952a) this.f8640d.remove(callback);
                        if (binderC1952a != null) {
                            callback.f8632c = null;
                            this.f8641e.getExtraBinder().unregisterCallbackListener(binderC1952a);
                        }
                    } catch (RemoteException unused) {
                    }
                } else {
                    this.f8639c.remove(callback);
                }
            }
        }

        @Override // android.support.p001v4.media.session.MediaControllerCompat.InterfaceC1954b
        public void addQueueItem(MediaDescriptionCompat mediaDescriptionCompat) {
            if ((getFlags() & 4) != 0) {
                Bundle bundle = new Bundle();
                bundle.putParcelable(MediaControllerCompat.COMMAND_ARGUMENT_MEDIA_DESCRIPTION, mediaDescriptionCompat);
                mo64869c(MediaControllerCompat.COMMAND_ADD_QUEUE_ITEM, bundle, null);
                return;
            }
            throw new UnsupportedOperationException("This session doesn't support queue management operations");
        }

        @Override // android.support.p001v4.media.session.MediaControllerCompat.InterfaceC1954b
        /* renamed from: b */
        public void mo64870b(MediaDescriptionCompat mediaDescriptionCompat, int i) {
            if ((getFlags() & 4) != 0) {
                Bundle bundle = new Bundle();
                bundle.putParcelable(MediaControllerCompat.COMMAND_ARGUMENT_MEDIA_DESCRIPTION, mediaDescriptionCompat);
                bundle.putInt(MediaControllerCompat.COMMAND_ARGUMENT_INDEX, i);
                mo64869c(MediaControllerCompat.COMMAND_ADD_QUEUE_ITEM_AT, bundle, null);
                return;
            }
            throw new UnsupportedOperationException("This session doesn't support queue management operations");
        }

        @Override // android.support.p001v4.media.session.MediaControllerCompat.InterfaceC1954b
        /* renamed from: c */
        public void mo64869c(String str, Bundle bundle, ResultReceiver resultReceiver) {
            MediaControllerCompatApi21.m64841s(this.f8637a, str, bundle, resultReceiver);
        }

        @Override // android.support.p001v4.media.session.MediaControllerCompat.InterfaceC1954b
        /* renamed from: d */
        public PendingIntent mo64868d() {
            return MediaControllerCompatApi21.m64845o(this.f8637a);
        }

        @Override // android.support.p001v4.media.session.MediaControllerCompat.InterfaceC1954b
        /* renamed from: e */
        public void mo64867e(int i, int i2) {
            MediaControllerCompatApi21.m64839u(this.f8637a, i, i2);
        }

        @Override // android.support.p001v4.media.session.MediaControllerCompat.InterfaceC1954b
        /* renamed from: f */
        public boolean mo64866f() {
            if (this.f8641e.getExtraBinder() != null) {
                return true;
            }
            return false;
        }

        @Override // android.support.p001v4.media.session.MediaControllerCompat.InterfaceC1954b
        /* renamed from: g */
        public PlaybackInfo mo64865g() {
            Object m64850j = MediaControllerCompatApi21.m64850j(this.f8637a);
            if (m64850j != null) {
                return new PlaybackInfo(MediaControllerCompatApi21.PlaybackInfo.getPlaybackType(m64850j), MediaControllerCompatApi21.PlaybackInfo.getLegacyAudioStream(m64850j), MediaControllerCompatApi21.PlaybackInfo.getVolumeControl(m64850j), MediaControllerCompatApi21.PlaybackInfo.getMaxVolume(m64850j), MediaControllerCompatApi21.PlaybackInfo.getCurrentVolume(m64850j));
            }
            return null;
        }

        @Override // android.support.p001v4.media.session.MediaControllerCompat.InterfaceC1954b
        public Bundle getExtras() {
            return MediaControllerCompatApi21.m64855e(this.f8637a);
        }

        @Override // android.support.p001v4.media.session.MediaControllerCompat.InterfaceC1954b
        public long getFlags() {
            return MediaControllerCompatApi21.m64854f(this.f8637a);
        }

        @Override // android.support.p001v4.media.session.MediaControllerCompat.InterfaceC1954b
        public MediaMetadataCompat getMetadata() {
            Object m64852h = MediaControllerCompatApi21.m64852h(this.f8637a);
            if (m64852h != null) {
                return MediaMetadataCompat.fromMediaMetadata(m64852h);
            }
            return null;
        }

        @Override // android.support.p001v4.media.session.MediaControllerCompat.InterfaceC1954b
        public String getPackageName() {
            return MediaControllerCompatApi21.m64851i(this.f8637a);
        }

        @Override // android.support.p001v4.media.session.MediaControllerCompat.InterfaceC1954b
        public PlaybackStateCompat getPlaybackState() {
            if (this.f8641e.getExtraBinder() != null) {
                try {
                    return this.f8641e.getExtraBinder().getPlaybackState();
                } catch (RemoteException unused) {
                }
            }
            Object m64849k = MediaControllerCompatApi21.m64849k(this.f8637a);
            if (m64849k != null) {
                return PlaybackStateCompat.fromPlaybackState(m64849k);
            }
            return null;
        }

        @Override // android.support.p001v4.media.session.MediaControllerCompat.InterfaceC1954b
        public List getQueue() {
            List m64848l = MediaControllerCompatApi21.m64848l(this.f8637a);
            if (m64848l != null) {
                return MediaSessionCompat.QueueItem.fromQueueItemList(m64848l);
            }
            return null;
        }

        @Override // android.support.p001v4.media.session.MediaControllerCompat.InterfaceC1954b
        public CharSequence getQueueTitle() {
            return MediaControllerCompatApi21.m64847m(this.f8637a);
        }

        @Override // android.support.p001v4.media.session.MediaControllerCompat.InterfaceC1954b
        public int getRatingType() {
            if (Build.VERSION.SDK_INT < 22 && this.f8641e.getExtraBinder() != null) {
                try {
                    return this.f8641e.getExtraBinder().getRatingType();
                } catch (RemoteException unused) {
                }
            }
            return MediaControllerCompatApi21.m64846n(this.f8637a);
        }

        @Override // android.support.p001v4.media.session.MediaControllerCompat.InterfaceC1954b
        public int getRepeatMode() {
            if (this.f8641e.getExtraBinder() != null) {
                try {
                    return this.f8641e.getExtraBinder().getRepeatMode();
                } catch (RemoteException unused) {
                    return -1;
                }
            }
            return -1;
        }

        @Override // android.support.p001v4.media.session.MediaControllerCompat.InterfaceC1954b
        public int getShuffleMode() {
            if (this.f8641e.getExtraBinder() != null) {
                try {
                    return this.f8641e.getExtraBinder().getShuffleMode();
                } catch (RemoteException unused) {
                    return -1;
                }
            }
            return -1;
        }

        @Override // android.support.p001v4.media.session.MediaControllerCompat.InterfaceC1954b
        /* renamed from: h */
        public TransportControls mo64860h() {
            Object m64843q = MediaControllerCompatApi21.m64843q(this.f8637a);
            if (m64843q != null) {
                return new C1957e(m64843q);
            }
            return null;
        }

        @Override // android.support.p001v4.media.session.MediaControllerCompat.InterfaceC1954b
        /* renamed from: i */
        public void mo64864i(int i, int i2) {
            MediaControllerCompatApi21.m64859a(this.f8637a, i, i2);
        }

        @Override // android.support.p001v4.media.session.MediaControllerCompat.InterfaceC1954b
        public boolean isCaptioningEnabled() {
            if (this.f8641e.getExtraBinder() != null) {
                try {
                    return this.f8641e.getExtraBinder().isCaptioningEnabled();
                } catch (RemoteException unused) {
                    return false;
                }
            }
            return false;
        }

        @Override // android.support.p001v4.media.session.MediaControllerCompat.InterfaceC1954b
        /* renamed from: j */
        public boolean mo64863j(KeyEvent keyEvent) {
            return MediaControllerCompatApi21.m64857c(this.f8637a, keyEvent);
        }

        @Override // android.support.p001v4.media.session.MediaControllerCompat.InterfaceC1954b
        /* renamed from: k */
        public Object mo64862k() {
            return this.f8637a;
        }

        @Override // android.support.p001v4.media.session.MediaControllerCompat.InterfaceC1954b
        /* renamed from: l */
        public final void mo64861l(Callback callback, Handler handler) {
            MediaControllerCompatApi21.m64842r(this.f8637a, callback.f8630a, handler);
            synchronized (this.f8638b) {
                if (this.f8641e.getExtraBinder() != null) {
                    BinderC1952a binderC1952a = new BinderC1952a(callback);
                    this.f8640d.put(callback, binderC1952a);
                    callback.f8632c = binderC1952a;
                    try {
                        this.f8641e.getExtraBinder().registerCallbackListener(binderC1952a);
                        callback.m64876a(13, null, null);
                    } catch (RemoteException unused) {
                    }
                } else {
                    callback.f8632c = null;
                    this.f8639c.add(callback);
                }
            }
        }

        /* renamed from: m */
        public void m64874m() {
            if (this.f8641e.getExtraBinder() == null) {
                return;
            }
            for (Callback callback : this.f8639c) {
                BinderC1952a binderC1952a = new BinderC1952a(callback);
                this.f8640d.put(callback, binderC1952a);
                callback.f8632c = binderC1952a;
                try {
                    this.f8641e.getExtraBinder().registerCallbackListener(binderC1952a);
                    callback.m64876a(13, null, null);
                } catch (RemoteException unused) {
                }
            }
            this.f8639c.clear();
        }

        /* renamed from: n */
        public final void m64873n() {
            mo64869c(MediaControllerCompat.COMMAND_GET_EXTRA_BINDER, null, new ExtraBinderRequestResultReceiver(this));
        }

        @Override // android.support.p001v4.media.session.MediaControllerCompat.InterfaceC1954b
        public void removeQueueItem(MediaDescriptionCompat mediaDescriptionCompat) {
            if ((getFlags() & 4) != 0) {
                Bundle bundle = new Bundle();
                bundle.putParcelable(MediaControllerCompat.COMMAND_ARGUMENT_MEDIA_DESCRIPTION, mediaDescriptionCompat);
                mo64869c(MediaControllerCompat.COMMAND_REMOVE_QUEUE_ITEM, bundle, null);
                return;
            }
            throw new UnsupportedOperationException("This session doesn't support queue management operations");
        }
    }

    /* renamed from: android.support.v4.media.session.MediaControllerCompat$PlaybackInfo */
    /* loaded from: classes.dex */
    public static final class PlaybackInfo {
        public static final int PLAYBACK_TYPE_LOCAL = 1;
        public static final int PLAYBACK_TYPE_REMOTE = 2;

        /* renamed from: a */
        public final int f8643a;

        /* renamed from: b */
        public final int f8644b;

        /* renamed from: c */
        public final int f8645c;

        /* renamed from: d */
        public final int f8646d;

        /* renamed from: e */
        public final int f8647e;

        public PlaybackInfo(int i, int i2, int i3, int i4, int i5) {
            this.f8643a = i;
            this.f8644b = i2;
            this.f8645c = i3;
            this.f8646d = i4;
            this.f8647e = i5;
        }

        public int getAudioStream() {
            return this.f8644b;
        }

        public int getCurrentVolume() {
            return this.f8647e;
        }

        public int getMaxVolume() {
            return this.f8646d;
        }

        public int getPlaybackType() {
            return this.f8643a;
        }

        public int getVolumeControl() {
            return this.f8645c;
        }
    }

    /* renamed from: android.support.v4.media.session.MediaControllerCompat$TransportControls */
    /* loaded from: classes.dex */
    public static abstract class TransportControls {
        public static final String EXTRA_LEGACY_STREAM_TYPE = "android.media.session.extra.LEGACY_STREAM_TYPE";

        public abstract void fastForward();

        public abstract void pause();

        public abstract void play();

        public abstract void playFromMediaId(String str, Bundle bundle);

        public abstract void playFromSearch(String str, Bundle bundle);

        public abstract void playFromUri(Uri uri, Bundle bundle);

        public abstract void prepare();

        public abstract void prepareFromMediaId(String str, Bundle bundle);

        public abstract void prepareFromSearch(String str, Bundle bundle);

        public abstract void prepareFromUri(Uri uri, Bundle bundle);

        public abstract void rewind();

        public abstract void seekTo(long j);

        public abstract void sendCustomAction(PlaybackStateCompat.CustomAction customAction, Bundle bundle);

        public abstract void sendCustomAction(String str, Bundle bundle);

        public abstract void setCaptioningEnabled(boolean z);

        public abstract void setRating(RatingCompat ratingCompat);

        public abstract void setRating(RatingCompat ratingCompat, Bundle bundle);

        public abstract void setRepeatMode(int i);

        public abstract void setShuffleMode(int i);

        public abstract void skipToNext();

        public abstract void skipToPrevious();

        public abstract void skipToQueueItem(long j);

        public abstract void stop();
    }

    /* renamed from: android.support.v4.media.session.MediaControllerCompat$a */
    /* loaded from: classes.dex */
    public static class C1953a extends ComponentActivity.ExtraData {

        /* renamed from: a */
        public final MediaControllerCompat f8648a;

        public C1953a(MediaControllerCompat mediaControllerCompat) {
            this.f8648a = mediaControllerCompat;
        }

        /* renamed from: a */
        public MediaControllerCompat m64872a() {
            return this.f8648a;
        }
    }

    /* renamed from: android.support.v4.media.session.MediaControllerCompat$b */
    /* loaded from: classes.dex */
    public interface InterfaceC1954b {
        /* renamed from: a */
        void mo64871a(Callback callback);

        void addQueueItem(MediaDescriptionCompat mediaDescriptionCompat);

        /* renamed from: b */
        void mo64870b(MediaDescriptionCompat mediaDescriptionCompat, int i);

        /* renamed from: c */
        void mo64869c(String str, Bundle bundle, ResultReceiver resultReceiver);

        /* renamed from: d */
        PendingIntent mo64868d();

        /* renamed from: e */
        void mo64867e(int i, int i2);

        /* renamed from: f */
        boolean mo64866f();

        /* renamed from: g */
        PlaybackInfo mo64865g();

        Bundle getExtras();

        long getFlags();

        MediaMetadataCompat getMetadata();

        String getPackageName();

        PlaybackStateCompat getPlaybackState();

        List getQueue();

        CharSequence getQueueTitle();

        int getRatingType();

        int getRepeatMode();

        int getShuffleMode();

        /* renamed from: h */
        TransportControls mo64860h();

        /* renamed from: i */
        void mo64864i(int i, int i2);

        boolean isCaptioningEnabled();

        /* renamed from: j */
        boolean mo64863j(KeyEvent keyEvent);

        /* renamed from: k */
        Object mo64862k();

        /* renamed from: l */
        void mo64861l(Callback callback, Handler handler);

        void removeQueueItem(MediaDescriptionCompat mediaDescriptionCompat);
    }

    /* renamed from: android.support.v4.media.session.MediaControllerCompat$c */
    /* loaded from: classes.dex */
    public static class C1955c extends MediaControllerImplApi21 {
        public C1955c(Context context, MediaSessionCompat.Token token) {
            super(context, token);
        }

        @Override // android.support.p001v4.media.session.MediaControllerCompat.MediaControllerImplApi21, android.support.p001v4.media.session.MediaControllerCompat.InterfaceC1954b
        /* renamed from: h */
        public TransportControls mo64860h() {
            Object m64843q = MediaControllerCompatApi21.m64843q(this.f8637a);
            if (m64843q != null) {
                return new C1958f(m64843q);
            }
            return null;
        }
    }

    /* renamed from: android.support.v4.media.session.MediaControllerCompat$d */
    /* loaded from: classes.dex */
    public static class C1956d extends C1955c {
        public C1956d(Context context, MediaSessionCompat.Token token) {
            super(context, token);
        }

        @Override // android.support.p001v4.media.session.MediaControllerCompat.C1955c, android.support.p001v4.media.session.MediaControllerCompat.MediaControllerImplApi21, android.support.p001v4.media.session.MediaControllerCompat.InterfaceC1954b
        /* renamed from: h */
        public TransportControls mo64860h() {
            Object m64843q = MediaControllerCompatApi21.m64843q(this.f8637a);
            if (m64843q != null) {
                return new C1959g(m64843q);
            }
            return null;
        }
    }

    /* renamed from: android.support.v4.media.session.MediaControllerCompat$f */
    /* loaded from: classes.dex */
    public static class C1958f extends C1957e {
        public C1958f(Object obj) {
            super(obj);
        }

        @Override // android.support.p001v4.media.session.MediaControllerCompat.C1957e, android.support.p001v4.media.session.MediaControllerCompat.TransportControls
        public void playFromUri(Uri uri, Bundle bundle) {
            MediaControllerCompatApi23$TransportControls.playFromUri(this.f8649a, uri, bundle);
        }
    }

    /* renamed from: android.support.v4.media.session.MediaControllerCompat$g */
    /* loaded from: classes.dex */
    public static class C1959g extends C1958f {
        public C1959g(Object obj) {
            super(obj);
        }

        @Override // android.support.p001v4.media.session.MediaControllerCompat.C1957e, android.support.p001v4.media.session.MediaControllerCompat.TransportControls
        public void prepare() {
            MediaControllerCompatApi24$TransportControls.prepare(this.f8649a);
        }

        @Override // android.support.p001v4.media.session.MediaControllerCompat.C1957e, android.support.p001v4.media.session.MediaControllerCompat.TransportControls
        public void prepareFromMediaId(String str, Bundle bundle) {
            MediaControllerCompatApi24$TransportControls.prepareFromMediaId(this.f8649a, str, bundle);
        }

        @Override // android.support.p001v4.media.session.MediaControllerCompat.C1957e, android.support.p001v4.media.session.MediaControllerCompat.TransportControls
        public void prepareFromSearch(String str, Bundle bundle) {
            MediaControllerCompatApi24$TransportControls.prepareFromSearch(this.f8649a, str, bundle);
        }

        @Override // android.support.p001v4.media.session.MediaControllerCompat.C1957e, android.support.p001v4.media.session.MediaControllerCompat.TransportControls
        public void prepareFromUri(Uri uri, Bundle bundle) {
            MediaControllerCompatApi24$TransportControls.prepareFromUri(this.f8649a, uri, bundle);
        }
    }

    public MediaControllerCompat(Context context, @NonNull MediaSessionCompat mediaSessionCompat) {
        InterfaceC1954b interfaceC1954b;
        if (mediaSessionCompat != null) {
            MediaSessionCompat.Token sessionToken = mediaSessionCompat.getSessionToken();
            this.f8628b = sessionToken;
            try {
                int i = Build.VERSION.SDK_INT;
                if (i >= 24) {
                    interfaceC1954b = new C1956d(context, sessionToken);
                } else if (i >= 23) {
                    interfaceC1954b = new C1955c(context, sessionToken);
                } else {
                    interfaceC1954b = new MediaControllerImplApi21(context, sessionToken);
                }
            } catch (RemoteException e) {
                Log.w("MediaControllerCompat", "Failed to create MediaControllerImpl.", e);
                interfaceC1954b = null;
            }
            this.f8627a = interfaceC1954b;
            return;
        }
        throw new IllegalArgumentException("session must not be null");
    }

    /* renamed from: a */
    public static void m64877a(String str, Bundle bundle) {
        if (str == null) {
            return;
        }
        if (str.equals(MediaSessionCompat.ACTION_FOLLOW) || str.equals(MediaSessionCompat.ACTION_UNFOLLOW)) {
            if (bundle != null && bundle.containsKey(MediaSessionCompat.ARGUMENT_MEDIA_ATTRIBUTE)) {
                return;
            }
            throw new IllegalArgumentException("An extra field android.support.v4.media.session.ARGUMENT_MEDIA_ATTRIBUTE is required for this action " + str + ".");
        }
    }

    public static MediaControllerCompat getMediaController(@NonNull Activity activity) {
        if (activity instanceof ComponentActivity) {
            C1953a c1953a = (C1953a) ((ComponentActivity) activity).getExtraData(C1953a.class);
            if (c1953a != null) {
                return c1953a.m64872a();
            }
            return null;
        }
        Object m64853g = MediaControllerCompatApi21.m64853g(activity);
        if (m64853g == null) {
            return null;
        }
        try {
            return new MediaControllerCompat(activity, MediaSessionCompat.Token.fromToken(MediaControllerCompatApi21.m64844p(m64853g)));
        } catch (RemoteException unused) {
            return null;
        }
    }

    public static void setMediaController(@NonNull Activity activity, MediaControllerCompat mediaControllerCompat) {
        Object obj;
        if (activity instanceof ComponentActivity) {
            ((ComponentActivity) activity).putExtraData(new C1953a(mediaControllerCompat));
        }
        if (mediaControllerCompat != null) {
            obj = MediaControllerCompatApi21.m64856d(activity, mediaControllerCompat.getSessionToken().getToken());
        } else {
            obj = null;
        }
        MediaControllerCompatApi21.m64840t(activity, obj);
    }

    public void addQueueItem(MediaDescriptionCompat mediaDescriptionCompat) {
        this.f8627a.addQueueItem(mediaDescriptionCompat);
    }

    public void adjustVolume(int i, int i2) {
        this.f8627a.mo64864i(i, i2);
    }

    public boolean dispatchMediaButtonEvent(KeyEvent keyEvent) {
        if (keyEvent != null) {
            return this.f8627a.mo64863j(keyEvent);
        }
        throw new IllegalArgumentException("KeyEvent may not be null");
    }

    public Bundle getExtras() {
        return this.f8627a.getExtras();
    }

    public long getFlags() {
        return this.f8627a.getFlags();
    }

    public MediaMetadataCompat getMetadata() {
        return this.f8627a.getMetadata();
    }

    public String getPackageName() {
        return this.f8627a.getPackageName();
    }

    public PlaybackInfo getPlaybackInfo() {
        return this.f8627a.mo64865g();
    }

    public PlaybackStateCompat getPlaybackState() {
        return this.f8627a.getPlaybackState();
    }

    public List<MediaSessionCompat.QueueItem> getQueue() {
        return this.f8627a.getQueue();
    }

    public CharSequence getQueueTitle() {
        return this.f8627a.getQueueTitle();
    }

    public int getRatingType() {
        return this.f8627a.getRatingType();
    }

    public int getRepeatMode() {
        return this.f8627a.getRepeatMode();
    }

    public PendingIntent getSessionActivity() {
        return this.f8627a.mo64868d();
    }

    public MediaSessionCompat.Token getSessionToken() {
        return this.f8628b;
    }

    @Nullable
    @RestrictTo({RestrictTo.Scope.LIBRARY_GROUP})
    public Bundle getSessionToken2Bundle() {
        return this.f8628b.getSessionToken2Bundle();
    }

    public int getShuffleMode() {
        return this.f8627a.getShuffleMode();
    }

    public TransportControls getTransportControls() {
        return this.f8627a.mo64860h();
    }

    public boolean isCaptioningEnabled() {
        return this.f8627a.isCaptioningEnabled();
    }

    public boolean isSessionReady() {
        return this.f8627a.mo64866f();
    }

    public void registerCallback(@NonNull Callback callback) {
        registerCallback(callback, null);
    }

    public void removeQueueItem(MediaDescriptionCompat mediaDescriptionCompat) {
        this.f8627a.removeQueueItem(mediaDescriptionCompat);
    }

    @Deprecated
    public void removeQueueItemAt(int i) {
        MediaSessionCompat.QueueItem queueItem;
        List<MediaSessionCompat.QueueItem> queue = getQueue();
        if (queue != null && i >= 0 && i < queue.size() && (queueItem = queue.get(i)) != null) {
            removeQueueItem(queueItem.getDescription());
        }
    }

    public void sendCommand(@NonNull String str, Bundle bundle, ResultReceiver resultReceiver) {
        if (!TextUtils.isEmpty(str)) {
            this.f8627a.mo64869c(str, bundle, resultReceiver);
            return;
        }
        throw new IllegalArgumentException("command must neither be null nor empty");
    }

    public void setVolumeTo(int i, int i2) {
        this.f8627a.mo64867e(i, i2);
    }

    public void unregisterCallback(@NonNull Callback callback) {
        if (callback != null) {
            try {
                this.f8629c.remove(callback);
                this.f8627a.mo64871a(callback);
                return;
            } finally {
                callback.m64875b(null);
            }
        }
        throw new IllegalArgumentException("callback must not be null");
    }

    public void addQueueItem(MediaDescriptionCompat mediaDescriptionCompat, int i) {
        this.f8627a.mo64870b(mediaDescriptionCompat, i);
    }

    public void registerCallback(@NonNull Callback callback, Handler handler) {
        if (callback != null) {
            if (handler == null) {
                handler = new Handler();
            }
            callback.m64875b(handler);
            this.f8627a.mo64861l(callback, handler);
            this.f8629c.add(callback);
            return;
        }
        throw new IllegalArgumentException("callback must not be null");
    }

    /* renamed from: android.support.v4.media.session.MediaControllerCompat$e */
    /* loaded from: classes.dex */
    public static class C1957e extends TransportControls {

        /* renamed from: a */
        public final Object f8649a;

        public C1957e(Object obj) {
            this.f8649a = obj;
        }

        @Override // android.support.p001v4.media.session.MediaControllerCompat.TransportControls
        public void fastForward() {
            MediaControllerCompatApi21.TransportControls.fastForward(this.f8649a);
        }

        @Override // android.support.p001v4.media.session.MediaControllerCompat.TransportControls
        public void pause() {
            MediaControllerCompatApi21.TransportControls.pause(this.f8649a);
        }

        @Override // android.support.p001v4.media.session.MediaControllerCompat.TransportControls
        public void play() {
            MediaControllerCompatApi21.TransportControls.play(this.f8649a);
        }

        @Override // android.support.p001v4.media.session.MediaControllerCompat.TransportControls
        public void playFromMediaId(String str, Bundle bundle) {
            MediaControllerCompatApi21.TransportControls.playFromMediaId(this.f8649a, str, bundle);
        }

        @Override // android.support.p001v4.media.session.MediaControllerCompat.TransportControls
        public void playFromSearch(String str, Bundle bundle) {
            MediaControllerCompatApi21.TransportControls.playFromSearch(this.f8649a, str, bundle);
        }

        @Override // android.support.p001v4.media.session.MediaControllerCompat.TransportControls
        public void playFromUri(Uri uri, Bundle bundle) {
            if (uri != null && !Uri.EMPTY.equals(uri)) {
                Bundle bundle2 = new Bundle();
                bundle2.putParcelable(MediaSessionCompat.ACTION_ARGUMENT_URI, uri);
                bundle2.putBundle(MediaSessionCompat.ACTION_ARGUMENT_EXTRAS, bundle);
                sendCustomAction(MediaSessionCompat.ACTION_PLAY_FROM_URI, bundle2);
                return;
            }
            throw new IllegalArgumentException("You must specify a non-empty Uri for playFromUri.");
        }

        @Override // android.support.p001v4.media.session.MediaControllerCompat.TransportControls
        public void prepare() {
            sendCustomAction(MediaSessionCompat.ACTION_PREPARE, (Bundle) null);
        }

        @Override // android.support.p001v4.media.session.MediaControllerCompat.TransportControls
        public void prepareFromMediaId(String str, Bundle bundle) {
            Bundle bundle2 = new Bundle();
            bundle2.putString(MediaSessionCompat.ACTION_ARGUMENT_MEDIA_ID, str);
            bundle2.putBundle(MediaSessionCompat.ACTION_ARGUMENT_EXTRAS, bundle);
            sendCustomAction(MediaSessionCompat.ACTION_PREPARE_FROM_MEDIA_ID, bundle2);
        }

        @Override // android.support.p001v4.media.session.MediaControllerCompat.TransportControls
        public void prepareFromSearch(String str, Bundle bundle) {
            Bundle bundle2 = new Bundle();
            bundle2.putString(MediaSessionCompat.ACTION_ARGUMENT_QUERY, str);
            bundle2.putBundle(MediaSessionCompat.ACTION_ARGUMENT_EXTRAS, bundle);
            sendCustomAction(MediaSessionCompat.ACTION_PREPARE_FROM_SEARCH, bundle2);
        }

        @Override // android.support.p001v4.media.session.MediaControllerCompat.TransportControls
        public void prepareFromUri(Uri uri, Bundle bundle) {
            Bundle bundle2 = new Bundle();
            bundle2.putParcelable(MediaSessionCompat.ACTION_ARGUMENT_URI, uri);
            bundle2.putBundle(MediaSessionCompat.ACTION_ARGUMENT_EXTRAS, bundle);
            sendCustomAction(MediaSessionCompat.ACTION_PREPARE_FROM_URI, bundle2);
        }

        @Override // android.support.p001v4.media.session.MediaControllerCompat.TransportControls
        public void rewind() {
            MediaControllerCompatApi21.TransportControls.rewind(this.f8649a);
        }

        @Override // android.support.p001v4.media.session.MediaControllerCompat.TransportControls
        public void seekTo(long j) {
            MediaControllerCompatApi21.TransportControls.seekTo(this.f8649a, j);
        }

        @Override // android.support.p001v4.media.session.MediaControllerCompat.TransportControls
        public void sendCustomAction(PlaybackStateCompat.CustomAction customAction, Bundle bundle) {
            MediaControllerCompat.m64877a(customAction.getAction(), bundle);
            MediaControllerCompatApi21.TransportControls.sendCustomAction(this.f8649a, customAction.getAction(), bundle);
        }

        @Override // android.support.p001v4.media.session.MediaControllerCompat.TransportControls
        public void setCaptioningEnabled(boolean z) {
            Bundle bundle = new Bundle();
            bundle.putBoolean(MediaSessionCompat.ACTION_ARGUMENT_CAPTIONING_ENABLED, z);
            sendCustomAction(MediaSessionCompat.ACTION_SET_CAPTIONING_ENABLED, bundle);
        }

        @Override // android.support.p001v4.media.session.MediaControllerCompat.TransportControls
        public void setRating(RatingCompat ratingCompat) {
            MediaControllerCompatApi21.TransportControls.setRating(this.f8649a, ratingCompat != null ? ratingCompat.getRating() : null);
        }

        @Override // android.support.p001v4.media.session.MediaControllerCompat.TransportControls
        public void setRepeatMode(int i) {
            Bundle bundle = new Bundle();
            bundle.putInt(MediaSessionCompat.ACTION_ARGUMENT_REPEAT_MODE, i);
            sendCustomAction(MediaSessionCompat.ACTION_SET_REPEAT_MODE, bundle);
        }

        @Override // android.support.p001v4.media.session.MediaControllerCompat.TransportControls
        public void setShuffleMode(int i) {
            Bundle bundle = new Bundle();
            bundle.putInt(MediaSessionCompat.ACTION_ARGUMENT_SHUFFLE_MODE, i);
            sendCustomAction(MediaSessionCompat.ACTION_SET_SHUFFLE_MODE, bundle);
        }

        @Override // android.support.p001v4.media.session.MediaControllerCompat.TransportControls
        public void skipToNext() {
            MediaControllerCompatApi21.TransportControls.skipToNext(this.f8649a);
        }

        @Override // android.support.p001v4.media.session.MediaControllerCompat.TransportControls
        public void skipToPrevious() {
            MediaControllerCompatApi21.TransportControls.skipToPrevious(this.f8649a);
        }

        @Override // android.support.p001v4.media.session.MediaControllerCompat.TransportControls
        public void skipToQueueItem(long j) {
            MediaControllerCompatApi21.TransportControls.skipToQueueItem(this.f8649a, j);
        }

        @Override // android.support.p001v4.media.session.MediaControllerCompat.TransportControls
        public void stop() {
            MediaControllerCompatApi21.TransportControls.stop(this.f8649a);
        }

        @Override // android.support.p001v4.media.session.MediaControllerCompat.TransportControls
        public void setRating(RatingCompat ratingCompat, Bundle bundle) {
            Bundle bundle2 = new Bundle();
            bundle2.putParcelable(MediaSessionCompat.ACTION_ARGUMENT_RATING, ratingCompat);
            bundle2.putBundle(MediaSessionCompat.ACTION_ARGUMENT_EXTRAS, bundle);
            sendCustomAction(MediaSessionCompat.ACTION_SET_RATING, bundle2);
        }

        @Override // android.support.p001v4.media.session.MediaControllerCompat.TransportControls
        public void sendCustomAction(String str, Bundle bundle) {
            MediaControllerCompat.m64877a(str, bundle);
            MediaControllerCompatApi21.TransportControls.sendCustomAction(this.f8649a, str, bundle);
        }
    }

    public Object getMediaController() {
        return this.f8627a.mo64862k();
    }

    public MediaControllerCompat(Context context, @NonNull MediaSessionCompat.Token token) throws RemoteException {
        if (token != null) {
            this.f8628b = token;
            int i = Build.VERSION.SDK_INT;
            if (i >= 24) {
                this.f8627a = new C1956d(context, token);
                return;
            } else if (i >= 23) {
                this.f8627a = new C1955c(context, token);
                return;
            } else {
                this.f8627a = new MediaControllerImplApi21(context, token);
                return;
            }
        }
        throw new IllegalArgumentException("sessionToken must not be null");
    }
}
package android.support.p001v4.media.session;

import android.app.PendingIntent;
import android.content.ComponentName;
import android.content.Context;
import android.content.Intent;
import android.media.session.MediaSession;
import android.media.session.MediaSessionManager;
import android.net.Uri;
import android.os.BadParcelableException;
import android.os.Binder;
import android.os.Build;
import android.os.Bundle;
import android.os.Handler;
import android.os.IBinder;
import android.os.Looper;
import android.os.Message;
import android.os.Parcel;
import android.os.Parcelable;
import android.os.RemoteCallbackList;
import android.os.RemoteException;
import android.os.ResultReceiver;
import android.os.SystemClock;
import android.support.p001v4.media.MediaDescriptionCompat;
import android.support.p001v4.media.MediaMetadataCompat;
import android.support.p001v4.media.RatingCompat;
import android.support.p001v4.media.session.AbstractC1998a;
import android.support.p001v4.media.session.IMediaSession;
import android.support.p001v4.media.session.MediaSessionCompatApi23;
import android.support.p001v4.media.session.MediaSessionCompatApi24;
import android.support.p001v4.media.session.PlaybackStateCompat;
import android.text.TextUtils;
import android.util.Log;
import android.util.TypedValue;
import android.view.KeyEvent;
import android.view.ViewConfiguration;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.annotation.RestrictTo;
import androidx.core.app.BundleCompat;
import androidx.media.MediaSessionManager;
import androidx.media.VolumeProviderCompat;
import androidx.media.session.MediaButtonReceiver;
import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;
import java.lang.ref.WeakReference;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

/* renamed from: android.support.v4.media.session.MediaSessionCompat */
/* loaded from: classes.dex */
public class MediaSessionCompat {
    @RestrictTo({RestrictTo.Scope.LIBRARY})
    public static final String ACTION_ARGUMENT_CAPTIONING_ENABLED = "android.support.v4.media.session.action.ARGUMENT_CAPTIONING_ENABLED";
    @RestrictTo({RestrictTo.Scope.LIBRARY})
    public static final String ACTION_ARGUMENT_EXTRAS = "android.support.v4.media.session.action.ARGUMENT_EXTRAS";
    @RestrictTo({RestrictTo.Scope.LIBRARY})
    public static final String ACTION_ARGUMENT_MEDIA_ID = "android.support.v4.media.session.action.ARGUMENT_MEDIA_ID";
    @RestrictTo({RestrictTo.Scope.LIBRARY})
    public static final String ACTION_ARGUMENT_QUERY = "android.support.v4.media.session.action.ARGUMENT_QUERY";
    @RestrictTo({RestrictTo.Scope.LIBRARY})
    public static final String ACTION_ARGUMENT_RATING = "android.support.v4.media.session.action.ARGUMENT_RATING";
    @RestrictTo({RestrictTo.Scope.LIBRARY})
    public static final String ACTION_ARGUMENT_REPEAT_MODE = "android.support.v4.media.session.action.ARGUMENT_REPEAT_MODE";
    @RestrictTo({RestrictTo.Scope.LIBRARY})
    public static final String ACTION_ARGUMENT_SHUFFLE_MODE = "android.support.v4.media.session.action.ARGUMENT_SHUFFLE_MODE";
    @RestrictTo({RestrictTo.Scope.LIBRARY})
    public static final String ACTION_ARGUMENT_URI = "android.support.v4.media.session.action.ARGUMENT_URI";
    public static final String ACTION_FLAG_AS_INAPPROPRIATE = "android.support.v4.media.session.action.FLAG_AS_INAPPROPRIATE";
    public static final String ACTION_FOLLOW = "android.support.v4.media.session.action.FOLLOW";
    @RestrictTo({RestrictTo.Scope.LIBRARY})
    public static final String ACTION_PLAY_FROM_URI = "android.support.v4.media.session.action.PLAY_FROM_URI";
    @RestrictTo({RestrictTo.Scope.LIBRARY})
    public static final String ACTION_PREPARE = "android.support.v4.media.session.action.PREPARE";
    @RestrictTo({RestrictTo.Scope.LIBRARY})
    public static final String ACTION_PREPARE_FROM_MEDIA_ID = "android.support.v4.media.session.action.PREPARE_FROM_MEDIA_ID";
    @RestrictTo({RestrictTo.Scope.LIBRARY})
    public static final String ACTION_PREPARE_FROM_SEARCH = "android.support.v4.media.session.action.PREPARE_FROM_SEARCH";
    @RestrictTo({RestrictTo.Scope.LIBRARY})
    public static final String ACTION_PREPARE_FROM_URI = "android.support.v4.media.session.action.PREPARE_FROM_URI";
    @RestrictTo({RestrictTo.Scope.LIBRARY})
    public static final String ACTION_SET_CAPTIONING_ENABLED = "android.support.v4.media.session.action.SET_CAPTIONING_ENABLED";
    @RestrictTo({RestrictTo.Scope.LIBRARY})
    public static final String ACTION_SET_RATING = "android.support.v4.media.session.action.SET_RATING";
    @RestrictTo({RestrictTo.Scope.LIBRARY})
    public static final String ACTION_SET_REPEAT_MODE = "android.support.v4.media.session.action.SET_REPEAT_MODE";
    @RestrictTo({RestrictTo.Scope.LIBRARY})
    public static final String ACTION_SET_SHUFFLE_MODE = "android.support.v4.media.session.action.SET_SHUFFLE_MODE";
    public static final String ACTION_SKIP_AD = "android.support.v4.media.session.action.SKIP_AD";
    public static final String ACTION_UNFOLLOW = "android.support.v4.media.session.action.UNFOLLOW";
    public static final String ARGUMENT_MEDIA_ATTRIBUTE = "android.support.v4.media.session.ARGUMENT_MEDIA_ATTRIBUTE";
    public static final String ARGUMENT_MEDIA_ATTRIBUTE_VALUE = "android.support.v4.media.session.ARGUMENT_MEDIA_ATTRIBUTE_VALUE";
    public static final int FLAG_HANDLES_MEDIA_BUTTONS = 1;
    public static final int FLAG_HANDLES_QUEUE_COMMANDS = 4;
    public static final int FLAG_HANDLES_TRANSPORT_CONTROLS = 2;
    @RestrictTo({RestrictTo.Scope.LIBRARY})
    public static final String KEY_EXTRA_BINDER = "android.support.v4.media.session.EXTRA_BINDER";
    @RestrictTo({RestrictTo.Scope.LIBRARY_GROUP})
    public static final String KEY_SESSION_TOKEN2_BUNDLE = "android.support.v4.media.session.SESSION_TOKEN2_BUNDLE";
    @RestrictTo({RestrictTo.Scope.LIBRARY_GROUP})
    public static final String KEY_TOKEN = "android.support.v4.media.session.TOKEN";
    public static final int MEDIA_ATTRIBUTE_ALBUM = 1;
    public static final int MEDIA_ATTRIBUTE_ARTIST = 0;
    public static final int MEDIA_ATTRIBUTE_PLAYLIST = 2;

    /* renamed from: d */
    public static int f8563d;

    /* renamed from: a */
    public final InterfaceC1989d f8564a;

    /* renamed from: b */
    public final MediaControllerCompat f8565b;

    /* renamed from: c */
    public final ArrayList f8566c;

    /* renamed from: android.support.v4.media.session.MediaSessionCompat$Callback */
    /* loaded from: classes.dex */
    public static abstract class Callback {

        /* renamed from: a */
        public final Object f8567a;

        /* renamed from: b */
        public WeakReference f8568b;

        /* renamed from: c */
        public HandlerC1979a f8569c = null;

        /* renamed from: d */
        public boolean f8570d;

        /* renamed from: android.support.v4.media.session.MediaSessionCompat$Callback$a */
        /* loaded from: classes.dex */
        public class HandlerC1979a extends Handler {
            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            public HandlerC1979a(Looper looper) {
                super(looper);
                Callback.this = r1;
            }

            @Override // android.os.Handler
            public void handleMessage(Message message) {
                if (message.what == 1) {
                    Callback.this.m64884a((MediaSessionManager.RemoteUserInfo) message.obj);
                }
            }
        }

        /* renamed from: android.support.v4.media.session.MediaSessionCompat$Callback$b */
        /* loaded from: classes.dex */
        public class C1980b implements AbstractC1998a.InterfaceC1999a {
            public C1980b() {
                Callback.this = r1;
            }

            @Override // android.support.p001v4.media.session.AbstractC1998a.InterfaceC1999a
            public void onCommand(String str, Bundle bundle, ResultReceiver resultReceiver) {
                try {
                    QueueItem queueItem = null;
                    IBinder asBinder = null;
                    queueItem = null;
                    if (str.equals(MediaControllerCompat.COMMAND_GET_EXTRA_BINDER)) {
                        C1990e c1990e = (C1990e) Callback.this.f8568b.get();
                        if (c1990e != null) {
                            Bundle bundle2 = new Bundle();
                            Token mo64876a = c1990e.mo64876a();
                            IMediaSession extraBinder = mo64876a.getExtraBinder();
                            if (extraBinder != null) {
                                asBinder = extraBinder.asBinder();
                            }
                            BundleCompat.putBinder(bundle2, MediaSessionCompat.KEY_EXTRA_BINDER, asBinder);
                            bundle2.putBundle(MediaSessionCompat.KEY_SESSION_TOKEN2_BUNDLE, mo64876a.getSessionToken2Bundle());
                            resultReceiver.send(0, bundle2);
                        }
                    } else if (str.equals(MediaControllerCompat.COMMAND_ADD_QUEUE_ITEM)) {
                        Callback.this.onAddQueueItem((MediaDescriptionCompat) bundle.getParcelable(MediaControllerCompat.COMMAND_ARGUMENT_MEDIA_DESCRIPTION));
                    } else if (str.equals(MediaControllerCompat.COMMAND_ADD_QUEUE_ITEM_AT)) {
                        Callback.this.onAddQueueItem((MediaDescriptionCompat) bundle.getParcelable(MediaControllerCompat.COMMAND_ARGUMENT_MEDIA_DESCRIPTION), bundle.getInt(MediaControllerCompat.COMMAND_ARGUMENT_INDEX));
                    } else if (str.equals(MediaControllerCompat.COMMAND_REMOVE_QUEUE_ITEM)) {
                        Callback.this.onRemoveQueueItem((MediaDescriptionCompat) bundle.getParcelable(MediaControllerCompat.COMMAND_ARGUMENT_MEDIA_DESCRIPTION));
                    } else if (str.equals(MediaControllerCompat.COMMAND_REMOVE_QUEUE_ITEM_AT)) {
                        C1990e c1990e2 = (C1990e) Callback.this.f8568b.get();
                        if (c1990e2 != null && c1990e2.f8590f != null) {
                            int i = bundle.getInt(MediaControllerCompat.COMMAND_ARGUMENT_INDEX, -1);
                            if (i >= 0 && i < c1990e2.f8590f.size()) {
                                queueItem = (QueueItem) c1990e2.f8590f.get(i);
                            }
                            if (queueItem != null) {
                                Callback.this.onRemoveQueueItem(queueItem.getDescription());
                            }
                        }
                    } else {
                        Callback.this.onCommand(str, bundle, resultReceiver);
                    }
                } catch (BadParcelableException unused) {
                }
            }

            @Override // android.support.p001v4.media.session.AbstractC1998a.InterfaceC1999a
            public void onCustomAction(String str, Bundle bundle) {
                Bundle bundle2 = bundle.getBundle(MediaSessionCompat.ACTION_ARGUMENT_EXTRAS);
                MediaSessionCompat.ensureClassLoader(bundle2);
                if (str.equals(MediaSessionCompat.ACTION_PLAY_FROM_URI)) {
                    Callback.this.onPlayFromUri((Uri) bundle.getParcelable(MediaSessionCompat.ACTION_ARGUMENT_URI), bundle2);
                } else if (str.equals(MediaSessionCompat.ACTION_PREPARE)) {
                    Callback.this.onPrepare();
                } else if (str.equals(MediaSessionCompat.ACTION_PREPARE_FROM_MEDIA_ID)) {
                    Callback.this.onPrepareFromMediaId(bundle.getString(MediaSessionCompat.ACTION_ARGUMENT_MEDIA_ID), bundle2);
                } else if (str.equals(MediaSessionCompat.ACTION_PREPARE_FROM_SEARCH)) {
                    Callback.this.onPrepareFromSearch(bundle.getString(MediaSessionCompat.ACTION_ARGUMENT_QUERY), bundle2);
                } else if (str.equals(MediaSessionCompat.ACTION_PREPARE_FROM_URI)) {
                    Callback.this.onPrepareFromUri((Uri) bundle.getParcelable(MediaSessionCompat.ACTION_ARGUMENT_URI), bundle2);
                } else if (str.equals(MediaSessionCompat.ACTION_SET_CAPTIONING_ENABLED)) {
                    Callback.this.onSetCaptioningEnabled(bundle.getBoolean(MediaSessionCompat.ACTION_ARGUMENT_CAPTIONING_ENABLED));
                } else if (str.equals(MediaSessionCompat.ACTION_SET_REPEAT_MODE)) {
                    Callback.this.onSetRepeatMode(bundle.getInt(MediaSessionCompat.ACTION_ARGUMENT_REPEAT_MODE));
                } else if (str.equals(MediaSessionCompat.ACTION_SET_SHUFFLE_MODE)) {
                    Callback.this.onSetShuffleMode(bundle.getInt(MediaSessionCompat.ACTION_ARGUMENT_SHUFFLE_MODE));
                } else if (str.equals(MediaSessionCompat.ACTION_SET_RATING)) {
                    Callback.this.onSetRating((RatingCompat) bundle.getParcelable(MediaSessionCompat.ACTION_ARGUMENT_RATING), bundle2);
                } else {
                    Callback.this.onCustomAction(str, bundle);
                }
            }

            @Override // android.support.p001v4.media.session.AbstractC1998a.InterfaceC1999a
            public void onFastForward() {
                Callback.this.onFastForward();
            }

            @Override // android.support.p001v4.media.session.AbstractC1998a.InterfaceC1999a
            public boolean onMediaButtonEvent(Intent intent) {
                return Callback.this.onMediaButtonEvent(intent);
            }

            @Override // android.support.p001v4.media.session.AbstractC1998a.InterfaceC1999a
            public void onPause() {
                Callback.this.onPause();
            }

            @Override // android.support.p001v4.media.session.AbstractC1998a.InterfaceC1999a
            public void onPlay() {
                Callback.this.onPlay();
            }

            @Override // android.support.p001v4.media.session.AbstractC1998a.InterfaceC1999a
            public void onPlayFromMediaId(String str, Bundle bundle) {
                Callback.this.onPlayFromMediaId(str, bundle);
            }

            @Override // android.support.p001v4.media.session.AbstractC1998a.InterfaceC1999a
            public void onPlayFromSearch(String str, Bundle bundle) {
                Callback.this.onPlayFromSearch(str, bundle);
            }

            @Override // android.support.p001v4.media.session.AbstractC1998a.InterfaceC1999a
            public void onRewind() {
                Callback.this.onRewind();
            }

            @Override // android.support.p001v4.media.session.AbstractC1998a.InterfaceC1999a
            public void onSeekTo(long j) {
                Callback.this.onSeekTo(j);
            }

            public void onSetRating(Object obj, Bundle bundle) {
            }

            @Override // android.support.p001v4.media.session.AbstractC1998a.InterfaceC1999a
            public void onSkipToNext() {
                Callback.this.onSkipToNext();
            }

            @Override // android.support.p001v4.media.session.AbstractC1998a.InterfaceC1999a
            public void onSkipToPrevious() {
                Callback.this.onSkipToPrevious();
            }

            @Override // android.support.p001v4.media.session.AbstractC1998a.InterfaceC1999a
            public void onSkipToQueueItem(long j) {
                Callback.this.onSkipToQueueItem(j);
            }

            @Override // android.support.p001v4.media.session.AbstractC1998a.InterfaceC1999a
            public void onStop() {
                Callback.this.onStop();
            }

            @Override // android.support.p001v4.media.session.AbstractC1998a.InterfaceC1999a
            public void onSetRating(Object obj) {
                Callback.this.onSetRating(RatingCompat.fromRating(obj));
            }
        }

        /* renamed from: android.support.v4.media.session.MediaSessionCompat$Callback$c */
        /* loaded from: classes.dex */
        public class C1981c extends C1980b implements MediaSessionCompatApi23.Callback {
            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            public C1981c() {
                super();
                Callback.this = r1;
            }

            @Override // android.support.p001v4.media.session.MediaSessionCompatApi23.Callback
            public void onPlayFromUri(Uri uri, Bundle bundle) {
                Callback.this.onPlayFromUri(uri, bundle);
            }
        }

        /* renamed from: android.support.v4.media.session.MediaSessionCompat$Callback$d */
        /* loaded from: classes.dex */
        public class C1982d extends C1981c implements MediaSessionCompatApi24.Callback {
            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            public C1982d() {
                super();
                Callback.this = r1;
            }

            @Override // android.support.p001v4.media.session.MediaSessionCompatApi24.Callback
            public void onPrepare() {
                Callback.this.onPrepare();
            }

            @Override // android.support.p001v4.media.session.MediaSessionCompatApi24.Callback
            public void onPrepareFromMediaId(String str, Bundle bundle) {
                Callback.this.onPrepareFromMediaId(str, bundle);
            }

            @Override // android.support.p001v4.media.session.MediaSessionCompatApi24.Callback
            public void onPrepareFromSearch(String str, Bundle bundle) {
                Callback.this.onPrepareFromSearch(str, bundle);
            }

            @Override // android.support.p001v4.media.session.MediaSessionCompatApi24.Callback
            public void onPrepareFromUri(Uri uri, Bundle bundle) {
                Callback.this.onPrepareFromUri(uri, bundle);
            }
        }

        public Callback() {
            int i = Build.VERSION.SDK_INT;
            if (i >= 24) {
                this.f8567a = MediaSessionCompatApi24.m64856a(new C1982d());
            } else if (i >= 23) {
                this.f8567a = MediaSessionCompatApi23.m64857a(new C1981c());
            } else {
                this.f8567a = AbstractC1998a.m64848a(new C1980b());
            }
        }

        /* renamed from: a */
        public void m64884a(MediaSessionManager.RemoteUserInfo remoteUserInfo) {
            long actions;
            boolean z;
            boolean z2;
            if (!this.f8570d) {
                return;
            }
            boolean z3 = false;
            this.f8570d = false;
            this.f8569c.removeMessages(1);
            InterfaceC1989d interfaceC1989d = (InterfaceC1989d) this.f8568b.get();
            if (interfaceC1989d == null) {
                return;
            }
            PlaybackStateCompat playbackState = interfaceC1989d.getPlaybackState();
            if (playbackState == null) {
                actions = 0;
            } else {
                actions = playbackState.getActions();
            }
            if (playbackState != null && playbackState.getState() == 3) {
                z = true;
            } else {
                z = false;
            }
            if ((516 & actions) != 0) {
                z2 = true;
            } else {
                z2 = false;
            }
            if ((actions & 514) != 0) {
                z3 = true;
            }
            interfaceC1989d.mo64859l(remoteUserInfo);
            if (z && z3) {
                onPause();
            } else if (!z && z2) {
                onPlay();
            }
            interfaceC1989d.mo64859l(null);
        }

        /* renamed from: b */
        public void m64883b(InterfaceC1989d interfaceC1989d, Handler handler) {
            this.f8568b = new WeakReference(interfaceC1989d);
            HandlerC1979a handlerC1979a = this.f8569c;
            if (handlerC1979a != null) {
                handlerC1979a.removeCallbacksAndMessages(null);
            }
            this.f8569c = new HandlerC1979a(handler.getLooper());
        }

        public void onAddQueueItem(MediaDescriptionCompat mediaDescriptionCompat) {
        }

        public void onCommand(String str, Bundle bundle, ResultReceiver resultReceiver) {
        }

        public void onCustomAction(String str, Bundle bundle) {
        }

        public void onFastForward() {
        }

        public boolean onMediaButtonEvent(Intent intent) {
            InterfaceC1989d interfaceC1989d;
            KeyEvent keyEvent;
            long actions;
            if (Build.VERSION.SDK_INT >= 27 || (interfaceC1989d = (InterfaceC1989d) this.f8568b.get()) == null || this.f8569c == null || (keyEvent = (KeyEvent) intent.getParcelableExtra("android.intent.extra.KEY_EVENT")) == null || keyEvent.getAction() != 0) {
                return false;
            }
            MediaSessionManager.RemoteUserInfo mo64858s = interfaceC1989d.mo64858s();
            int keyCode = keyEvent.getKeyCode();
            if (keyCode != 79 && keyCode != 85) {
                m64884a(mo64858s);
                return false;
            }
            if (keyEvent.getRepeatCount() > 0) {
                m64884a(mo64858s);
            } else if (this.f8570d) {
                this.f8569c.removeMessages(1);
                this.f8570d = false;
                PlaybackStateCompat playbackState = interfaceC1989d.getPlaybackState();
                if (playbackState == null) {
                    actions = 0;
                } else {
                    actions = playbackState.getActions();
                }
                if ((actions & 32) != 0) {
                    onSkipToNext();
                }
            } else {
                this.f8570d = true;
                HandlerC1979a handlerC1979a = this.f8569c;
                handlerC1979a.sendMessageDelayed(handlerC1979a.obtainMessage(1, mo64858s), ViewConfiguration.getDoubleTapTimeout());
            }
            return true;
        }

        public void onPause() {
        }

        public void onPlay() {
        }

        public void onPlayFromMediaId(String str, Bundle bundle) {
        }

        public void onPlayFromSearch(String str, Bundle bundle) {
        }

        public void onPlayFromUri(Uri uri, Bundle bundle) {
        }

        public void onPrepare() {
        }

        public void onPrepareFromMediaId(String str, Bundle bundle) {
        }

        public void onPrepareFromSearch(String str, Bundle bundle) {
        }

        public void onPrepareFromUri(Uri uri, Bundle bundle) {
        }

        public void onRemoveQueueItem(MediaDescriptionCompat mediaDescriptionCompat) {
        }

        @Deprecated
        public void onRemoveQueueItemAt(int i) {
        }

        public void onRewind() {
        }

        public void onSeekTo(long j) {
        }

        public void onSetCaptioningEnabled(boolean z) {
        }

        public void onSetRating(RatingCompat ratingCompat) {
        }

        public void onSetRepeatMode(int i) {
        }

        public void onSetShuffleMode(int i) {
        }

        public void onSkipToNext() {
        }

        public void onSkipToPrevious() {
        }

        public void onSkipToQueueItem(long j) {
        }

        public void onStop() {
        }

        public void onAddQueueItem(MediaDescriptionCompat mediaDescriptionCompat, int i) {
        }

        public void onSetRating(RatingCompat ratingCompat, Bundle bundle) {
        }
    }

    /* renamed from: android.support.v4.media.session.MediaSessionCompat$OnActiveChangeListener */
    /* loaded from: classes.dex */
    public interface OnActiveChangeListener {
        void onActiveChanged();
    }

    /* renamed from: android.support.v4.media.session.MediaSessionCompat$QueueItem */
    /* loaded from: classes.dex */
    public static final class QueueItem implements Parcelable {
        public static final Parcelable.Creator<QueueItem> CREATOR = new C1983a();
        public static final int UNKNOWN_ID = -1;

        /* renamed from: a */
        public final MediaDescriptionCompat f8575a;

        /* renamed from: b */
        public final long f8576b;

        /* renamed from: c */
        public Object f8577c;

        /* renamed from: android.support.v4.media.session.MediaSessionCompat$QueueItem$a */
        /* loaded from: classes.dex */
        public static class C1983a implements Parcelable.Creator {
            @Override // android.os.Parcelable.Creator
            /* renamed from: a */
            public QueueItem createFromParcel(Parcel parcel) {
                return new QueueItem(parcel);
            }

            @Override // android.os.Parcelable.Creator
            /* renamed from: b */
            public QueueItem[] newArray(int i) {
                return new QueueItem[i];
            }
        }

        public QueueItem(MediaDescriptionCompat mediaDescriptionCompat, long j) {
            this(null, mediaDescriptionCompat, j);
        }

        public static QueueItem fromQueueItem(Object obj) {
            if (obj != null) {
                return new QueueItem(obj, MediaDescriptionCompat.fromMediaDescription(AbstractC1998a.C2001c.m64826b(obj)), AbstractC1998a.C2001c.m64825c(obj));
            }
            return null;
        }

        public static List<QueueItem> fromQueueItemList(List<?> list) {
            if (list != null) {
                ArrayList arrayList = new ArrayList();
                Iterator<?> it = list.iterator();
                while (it.hasNext()) {
                    arrayList.add(fromQueueItem(it.next()));
                }
                return arrayList;
            }
            return null;
        }

        @Override // android.os.Parcelable
        public int describeContents() {
            return 0;
        }

        public MediaDescriptionCompat getDescription() {
            return this.f8575a;
        }

        public long getQueueId() {
            return this.f8576b;
        }

        public Object getQueueItem() {
            Object obj = this.f8577c;
            if (obj == null) {
                Object m64827a = AbstractC1998a.C2001c.m64827a(this.f8575a.getMediaDescription(), this.f8576b);
                this.f8577c = m64827a;
                return m64827a;
            }
            return obj;
        }

        public String toString() {
            return "MediaSession.QueueItem {Description=" + this.f8575a + ", Id=" + this.f8576b + " }";
        }

        @Override // android.os.Parcelable
        public void writeToParcel(Parcel parcel, int i) {
            this.f8575a.writeToParcel(parcel, i);
            parcel.writeLong(this.f8576b);
        }

        public QueueItem(Object obj, MediaDescriptionCompat mediaDescriptionCompat, long j) {
            if (mediaDescriptionCompat == null) {
                throw new IllegalArgumentException("Description cannot be null.");
            }
            if (j != -1) {
                this.f8575a = mediaDescriptionCompat;
                this.f8576b = j;
                this.f8577c = obj;
                return;
            }
            throw new IllegalArgumentException("Id cannot be QueueItem.UNKNOWN_ID");
        }

        public QueueItem(Parcel parcel) {
            this.f8575a = MediaDescriptionCompat.CREATOR.createFromParcel(parcel);
            this.f8576b = parcel.readLong();
        }
    }

    @Retention(RetentionPolicy.SOURCE)
    @RestrictTo({RestrictTo.Scope.LIBRARY_GROUP})
    /* renamed from: android.support.v4.media.session.MediaSessionCompat$SessionFlags */
    /* loaded from: classes.dex */
    public @interface SessionFlags {
    }

    /* renamed from: android.support.v4.media.session.MediaSessionCompat$Token */
    /* loaded from: classes.dex */
    public static final class Token implements Parcelable {
        public static final Parcelable.Creator<Token> CREATOR = new C1985a();

        /* renamed from: a */
        public final Object f8579a;

        /* renamed from: b */
        public IMediaSession f8580b;

        /* renamed from: c */
        public Bundle f8581c;

        /* renamed from: android.support.v4.media.session.MediaSessionCompat$Token$a */
        /* loaded from: classes.dex */
        public static class C1985a implements Parcelable.Creator {
            @Override // android.os.Parcelable.Creator
            /* renamed from: a */
            public Token createFromParcel(Parcel parcel) {
                return new Token(parcel.readParcelable(null));
            }

            @Override // android.os.Parcelable.Creator
            /* renamed from: b */
            public Token[] newArray(int i) {
                return new Token[i];
            }
        }

        public Token(Object obj) {
            this(obj, null, null);
        }

        @RestrictTo({RestrictTo.Scope.LIBRARY_GROUP})
        public static Token fromBundle(Bundle bundle) {
            if (bundle == null) {
                return null;
            }
            IMediaSession asInterface = IMediaSession.Stub.asInterface(BundleCompat.getBinder(bundle, MediaSessionCompat.KEY_EXTRA_BINDER));
            Bundle bundle2 = bundle.getBundle(MediaSessionCompat.KEY_SESSION_TOKEN2_BUNDLE);
            Token token = (Token) bundle.getParcelable(MediaSessionCompat.KEY_TOKEN);
            if (token == null) {
                return null;
            }
            return new Token(token.f8579a, asInterface, bundle2);
        }

        public static Token fromToken(Object obj) {
            return fromToken(obj, null);
        }

        @Override // android.os.Parcelable
        public int describeContents() {
            return 0;
        }

        public boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof Token)) {
                return false;
            }
            Token token = (Token) obj;
            Object obj2 = this.f8579a;
            if (obj2 == null) {
                if (token.f8579a == null) {
                    return true;
                }
                return false;
            }
            Object obj3 = token.f8579a;
            if (obj3 == null) {
                return false;
            }
            return obj2.equals(obj3);
        }

        @RestrictTo({RestrictTo.Scope.LIBRARY_GROUP})
        public IMediaSession getExtraBinder() {
            return this.f8580b;
        }

        @RestrictTo({RestrictTo.Scope.LIBRARY_GROUP})
        public Bundle getSessionToken2Bundle() {
            return this.f8581c;
        }

        public Object getToken() {
            return this.f8579a;
        }

        public int hashCode() {
            Object obj = this.f8579a;
            if (obj == null) {
                return 0;
            }
            return obj.hashCode();
        }

        @RestrictTo({RestrictTo.Scope.LIBRARY_GROUP})
        public void setExtraBinder(IMediaSession iMediaSession) {
            this.f8580b = iMediaSession;
        }

        @RestrictTo({RestrictTo.Scope.LIBRARY_GROUP})
        public void setSessionToken2Bundle(Bundle bundle) {
            this.f8581c = bundle;
        }

        @RestrictTo({RestrictTo.Scope.LIBRARY_GROUP})
        public Bundle toBundle() {
            Bundle bundle = new Bundle();
            bundle.putParcelable(MediaSessionCompat.KEY_TOKEN, this);
            IMediaSession iMediaSession = this.f8580b;
            if (iMediaSession != null) {
                BundleCompat.putBinder(bundle, MediaSessionCompat.KEY_EXTRA_BINDER, iMediaSession.asBinder());
            }
            Bundle bundle2 = this.f8581c;
            if (bundle2 != null) {
                bundle.putBundle(MediaSessionCompat.KEY_SESSION_TOKEN2_BUNDLE, bundle2);
            }
            return bundle;
        }

        @Override // android.os.Parcelable
        public void writeToParcel(Parcel parcel, int i) {
            parcel.writeParcelable((Parcelable) this.f8579a, i);
        }

        public Token(Object obj, IMediaSession iMediaSession) {
            this(obj, iMediaSession, null);
        }

        @RestrictTo({RestrictTo.Scope.LIBRARY_GROUP})
        public static Token fromToken(Object obj, IMediaSession iMediaSession) {
            if (obj != null) {
                return new Token(AbstractC1998a.m64828u(obj), iMediaSession);
            }
            return null;
        }

        public Token(Object obj, IMediaSession iMediaSession, Bundle bundle) {
            this.f8579a = obj;
            this.f8580b = iMediaSession;
            this.f8581c = bundle;
        }
    }

    /* renamed from: android.support.v4.media.session.MediaSessionCompat$a */
    /* loaded from: classes.dex */
    public class C1986a extends Callback {
        public C1986a() {
            MediaSessionCompat.this = r1;
        }
    }

    /* renamed from: android.support.v4.media.session.MediaSessionCompat$b */
    /* loaded from: classes.dex */
    public class C1987b extends Callback {
        public C1987b() {
            MediaSessionCompat.this = r1;
        }
    }

    /* renamed from: android.support.v4.media.session.MediaSessionCompat$c */
    /* loaded from: classes.dex */
    public class C1988c extends Callback {
        public C1988c() {
            MediaSessionCompat.this = r1;
        }
    }

    /* renamed from: android.support.v4.media.session.MediaSessionCompat$d */
    /* loaded from: classes.dex */
    public interface InterfaceC1989d {
        /* renamed from: a */
        Token mo64876a();

        /* renamed from: b */
        void mo64875b(int i);

        /* renamed from: c */
        void mo64874c(String str, Bundle bundle);

        /* renamed from: d */
        void mo64873d(Callback callback, Handler handler);

        /* renamed from: e */
        void mo64872e(int i);

        /* renamed from: f */
        void mo64871f(PlaybackStateCompat playbackStateCompat);

        /* renamed from: g */
        String mo64870g();

        PlaybackStateCompat getPlaybackState();

        /* renamed from: h */
        void mo64869h(int i);

        /* renamed from: i */
        void mo64868i(PendingIntent pendingIntent);

        boolean isActive();

        /* renamed from: j */
        Object mo64867j();

        /* renamed from: k */
        void mo64866k(boolean z);

        /* renamed from: l */
        void mo64859l(MediaSessionManager.RemoteUserInfo remoteUserInfo);

        /* renamed from: m */
        void mo64865m(VolumeProviderCompat volumeProviderCompat);

        /* renamed from: n */
        void mo64864n(CharSequence charSequence);

        /* renamed from: o */
        void mo64863o(MediaMetadataCompat mediaMetadataCompat);

        /* renamed from: p */
        void mo64862p(List list);

        /* renamed from: q */
        void mo64861q(PendingIntent pendingIntent);

        /* renamed from: r */
        Object mo64860r();

        void release();

        /* renamed from: s */
        MediaSessionManager.RemoteUserInfo mo64858s();

        void setCaptioningEnabled(boolean z);

        void setExtras(Bundle bundle);

        void setRepeatMode(int i);

        void setShuffleMode(int i);
    }

    /* renamed from: android.support.v4.media.session.MediaSessionCompat$f */
    /* loaded from: classes.dex */
    public static class C1992f extends C1990e {
        public C1992f(Context context, String str, Bundle bundle) {
            super(context, str, bundle);
        }

        @Override // android.support.p001v4.media.session.MediaSessionCompat.C1990e, android.support.p001v4.media.session.MediaSessionCompat.InterfaceC1989d
        /* renamed from: l */
        public void mo64859l(MediaSessionManager.RemoteUserInfo remoteUserInfo) {
        }

        @Override // android.support.p001v4.media.session.MediaSessionCompat.C1990e, android.support.p001v4.media.session.MediaSessionCompat.InterfaceC1989d
        /* renamed from: s */
        public final MediaSessionManager.RemoteUserInfo mo64858s() {
            MediaSessionManager.RemoteUserInfo currentControllerInfo;
            currentControllerInfo = ((MediaSession) this.f8585a).getCurrentControllerInfo();
            return new MediaSessionManager.RemoteUserInfo(currentControllerInfo);
        }
    }

    public MediaSessionCompat(Context context, String str) {
        this(context, str, null, null);
    }

    /* renamed from: a */
    public static PlaybackStateCompat m64885a(PlaybackStateCompat playbackStateCompat, MediaMetadataCompat mediaMetadataCompat) {
        long lastPositionUpdateTime;
        long j;
        if (playbackStateCompat != null) {
            long j2 = -1;
            if (playbackStateCompat.getPosition() != -1) {
                if (playbackStateCompat.getState() == 3 || playbackStateCompat.getState() == 4 || playbackStateCompat.getState() == 5) {
                    if (playbackStateCompat.getLastPositionUpdateTime() > 0) {
                        long elapsedRealtime = SystemClock.elapsedRealtime();
                        long playbackSpeed = (playbackStateCompat.getPlaybackSpeed() * ((float) (elapsedRealtime - lastPositionUpdateTime))) + playbackStateCompat.getPosition();
                        if (mediaMetadataCompat != null && mediaMetadataCompat.containsKey(MediaMetadataCompat.METADATA_KEY_DURATION)) {
                            j2 = mediaMetadataCompat.getLong(MediaMetadataCompat.METADATA_KEY_DURATION);
                        }
                        if (j2 >= 0 && playbackSpeed > j2) {
                            j = j2;
                        } else if (playbackSpeed < 0) {
                            j = 0;
                        } else {
                            j = playbackSpeed;
                        }
                        return new PlaybackStateCompat.Builder(playbackStateCompat).setState(playbackStateCompat.getState(), j, playbackStateCompat.getPlaybackSpeed(), elapsedRealtime).build();
                    }
                    return playbackStateCompat;
                }
                return playbackStateCompat;
            }
            return playbackStateCompat;
        }
        return playbackStateCompat;
    }

    @RestrictTo({RestrictTo.Scope.LIBRARY_GROUP})
    public static void ensureClassLoader(@Nullable Bundle bundle) {
        if (bundle != null) {
            bundle.setClassLoader(MediaSessionCompat.class.getClassLoader());
        }
    }

    public static MediaSessionCompat fromMediaSession(Context context, Object obj) {
        if (context != null && obj != null) {
            return new MediaSessionCompat(context, new C1990e(obj));
        }
        return null;
    }

    public void addOnActiveChangeListener(OnActiveChangeListener onActiveChangeListener) {
        if (onActiveChangeListener != null) {
            this.f8566c.add(onActiveChangeListener);
            return;
        }
        throw new IllegalArgumentException("Listener may not be null");
    }

    @RestrictTo({RestrictTo.Scope.LIBRARY_GROUP})
    public String getCallingPackage() {
        return this.f8564a.mo64870g();
    }

    public MediaControllerCompat getController() {
        return this.f8565b;
    }

    @NonNull
    public final MediaSessionManager.RemoteUserInfo getCurrentControllerInfo() {
        return this.f8564a.mo64858s();
    }

    public Object getMediaSession() {
        return this.f8564a.mo64860r();
    }

    public Object getRemoteControlClient() {
        return this.f8564a.mo64867j();
    }

    public Token getSessionToken() {
        return this.f8564a.mo64876a();
    }

    public boolean isActive() {
        return this.f8564a.isActive();
    }

    public void release() {
        this.f8564a.release();
    }

    public void removeOnActiveChangeListener(OnActiveChangeListener onActiveChangeListener) {
        if (onActiveChangeListener != null) {
            this.f8566c.remove(onActiveChangeListener);
            return;
        }
        throw new IllegalArgumentException("Listener may not be null");
    }

    public void sendSessionEvent(String str, Bundle bundle) {
        if (!TextUtils.isEmpty(str)) {
            this.f8564a.mo64874c(str, bundle);
            return;
        }
        throw new IllegalArgumentException("event cannot be null or empty");
    }

    public void setActive(boolean z) {
        this.f8564a.mo64866k(z);
        Iterator it = this.f8566c.iterator();
        while (it.hasNext()) {
            ((OnActiveChangeListener) it.next()).onActiveChanged();
        }
    }

    public void setCallback(Callback callback) {
        setCallback(callback, null);
    }

    public void setCaptioningEnabled(boolean z) {
        this.f8564a.setCaptioningEnabled(z);
    }

    public void setExtras(Bundle bundle) {
        this.f8564a.setExtras(bundle);
    }

    public void setFlags(int i) {
        this.f8564a.mo64875b(i);
    }

    public void setMediaButtonReceiver(PendingIntent pendingIntent) {
        this.f8564a.mo64868i(pendingIntent);
    }

    public void setMetadata(MediaMetadataCompat mediaMetadataCompat) {
        this.f8564a.mo64863o(mediaMetadataCompat);
    }

    public void setPlaybackState(PlaybackStateCompat playbackStateCompat) {
        this.f8564a.mo64871f(playbackStateCompat);
    }

    public void setPlaybackToLocal(int i) {
        this.f8564a.mo64869h(i);
    }

    public void setPlaybackToRemote(VolumeProviderCompat volumeProviderCompat) {
        if (volumeProviderCompat != null) {
            this.f8564a.mo64865m(volumeProviderCompat);
            return;
        }
        throw new IllegalArgumentException("volumeProvider may not be null!");
    }

    public void setQueue(List<QueueItem> list) {
        this.f8564a.mo64862p(list);
    }

    public void setQueueTitle(CharSequence charSequence) {
        this.f8564a.mo64864n(charSequence);
    }

    public void setRatingType(int i) {
        this.f8564a.mo64872e(i);
    }

    public void setRepeatMode(int i) {
        this.f8564a.setRepeatMode(i);
    }

    public void setSessionActivity(PendingIntent pendingIntent) {
        this.f8564a.mo64861q(pendingIntent);
    }

    public void setShuffleMode(int i) {
        this.f8564a.setShuffleMode(i);
    }

    @RestrictTo({RestrictTo.Scope.LIBRARY})
    /* renamed from: android.support.v4.media.session.MediaSessionCompat$ResultReceiverWrapper */
    /* loaded from: classes.dex */
    public static final class ResultReceiverWrapper implements Parcelable {
        public static final Parcelable.Creator<ResultReceiverWrapper> CREATOR = new C1984a();

        /* renamed from: a */
        public ResultReceiver f8578a;

        /* renamed from: android.support.v4.media.session.MediaSessionCompat$ResultReceiverWrapper$a */
        /* loaded from: classes.dex */
        public static class C1984a implements Parcelable.Creator {
            @Override // android.os.Parcelable.Creator
            /* renamed from: a */
            public ResultReceiverWrapper createFromParcel(Parcel parcel) {
                return new ResultReceiverWrapper(parcel);
            }

            @Override // android.os.Parcelable.Creator
            /* renamed from: b */
            public ResultReceiverWrapper[] newArray(int i) {
                return new ResultReceiverWrapper[i];
            }
        }

        public ResultReceiverWrapper(ResultReceiver resultReceiver) {
            this.f8578a = resultReceiver;
        }

        @Override // android.os.Parcelable
        public int describeContents() {
            return 0;
        }

        @Override // android.os.Parcelable
        public void writeToParcel(Parcel parcel, int i) {
            this.f8578a.writeToParcel(parcel, i);
        }

        public ResultReceiverWrapper(Parcel parcel) {
            this.f8578a = (ResultReceiver) ResultReceiver.CREATOR.createFromParcel(parcel);
        }
    }

    public MediaSessionCompat(Context context, String str, ComponentName componentName, PendingIntent pendingIntent) {
        this(context, str, componentName, pendingIntent, null);
    }

    public void setCallback(Callback callback, Handler handler) {
        if (callback == null) {
            this.f8564a.mo64873d(null, null);
            return;
        }
        InterfaceC1989d interfaceC1989d = this.f8564a;
        if (handler == null) {
            handler = new Handler();
        }
        interfaceC1989d.mo64873d(callback, handler);
    }

    @RestrictTo({RestrictTo.Scope.LIBRARY_GROUP})
    public MediaSessionCompat(Context context, String str, Bundle bundle) {
        this(context, str, null, null, bundle);
    }

    public MediaSessionCompat(Context context, String str, ComponentName componentName, PendingIntent pendingIntent, Bundle bundle) {
        this.f8566c = new ArrayList();
        if (context != null) {
            if (!TextUtils.isEmpty(str)) {
                if (componentName == null && (componentName = MediaButtonReceiver.getMediaButtonReceiverComponent(context)) == null) {
                    Log.w("MediaSessionCompat", "Couldn't find a unique registered media button receiver in the given context.");
                }
                if (componentName != null && pendingIntent == null) {
                    Intent intent = new Intent("android.intent.action.MEDIA_BUTTON");
                    intent.setComponent(componentName);
                    pendingIntent = PendingIntent.getBroadcast(context, 0, intent, 0);
                }
                if (Build.VERSION.SDK_INT >= 28) {
                    C1992f c1992f = new C1992f(context, str, bundle);
                    this.f8564a = c1992f;
                    setCallback(new C1986a());
                    c1992f.mo64868i(pendingIntent);
                } else {
                    C1990e c1990e = new C1990e(context, str, bundle);
                    this.f8564a = c1990e;
                    setCallback(new C1987b());
                    c1990e.mo64868i(pendingIntent);
                }
                this.f8565b = new MediaControllerCompat(context, this);
                if (f8563d == 0) {
                    f8563d = (int) (TypedValue.applyDimension(1, 320.0f, context.getResources().getDisplayMetrics()) + 0.5f);
                    return;
                }
                return;
            }
            throw new IllegalArgumentException("tag must not be null or empty");
        }
        throw new IllegalArgumentException("context must not be null");
    }

    /* renamed from: android.support.v4.media.session.MediaSessionCompat$e */
    /* loaded from: classes.dex */
    public static class C1990e implements InterfaceC1989d {

        /* renamed from: a */
        public final Object f8585a;

        /* renamed from: b */
        public final Token f8586b;

        /* renamed from: c */
        public boolean f8587c = false;

        /* renamed from: d */
        public final RemoteCallbackList f8588d = new RemoteCallbackList();

        /* renamed from: e */
        public PlaybackStateCompat f8589e;

        /* renamed from: f */
        public List f8590f;

        /* renamed from: g */
        public MediaMetadataCompat f8591g;

        /* renamed from: h */
        public int f8592h;

        /* renamed from: i */
        public boolean f8593i;

        /* renamed from: j */
        public int f8594j;

        /* renamed from: k */
        public int f8595k;

        /* renamed from: android.support.v4.media.session.MediaSessionCompat$e$a */
        /* loaded from: classes.dex */
        public class BinderC1991a extends IMediaSession.Stub {
            public BinderC1991a() {
                C1990e.this = r1;
            }

            @Override // android.support.p001v4.media.session.IMediaSession
            public void addQueueItem(MediaDescriptionCompat mediaDescriptionCompat) {
                throw new AssertionError();
            }

            @Override // android.support.p001v4.media.session.IMediaSession
            public void addQueueItemAt(MediaDescriptionCompat mediaDescriptionCompat, int i) {
                throw new AssertionError();
            }

            @Override // android.support.p001v4.media.session.IMediaSession
            public void adjustVolume(int i, int i2, String str) {
                throw new AssertionError();
            }

            @Override // android.support.p001v4.media.session.IMediaSession
            public void fastForward() {
                throw new AssertionError();
            }

            @Override // android.support.p001v4.media.session.IMediaSession
            public Bundle getExtras() {
                throw new AssertionError();
            }

            @Override // android.support.p001v4.media.session.IMediaSession
            public long getFlags() {
                throw new AssertionError();
            }

            @Override // android.support.p001v4.media.session.IMediaSession
            public PendingIntent getLaunchPendingIntent() {
                throw new AssertionError();
            }

            @Override // android.support.p001v4.media.session.IMediaSession
            public MediaMetadataCompat getMetadata() {
                throw new AssertionError();
            }

            @Override // android.support.p001v4.media.session.IMediaSession
            public String getPackageName() {
                throw new AssertionError();
            }

            @Override // android.support.p001v4.media.session.IMediaSession
            public PlaybackStateCompat getPlaybackState() {
                C1990e c1990e = C1990e.this;
                return MediaSessionCompat.m64885a(c1990e.f8589e, c1990e.f8591g);
            }

            @Override // android.support.p001v4.media.session.IMediaSession
            public List getQueue() {
                return null;
            }

            @Override // android.support.p001v4.media.session.IMediaSession
            public CharSequence getQueueTitle() {
                throw new AssertionError();
            }

            @Override // android.support.p001v4.media.session.IMediaSession
            public int getRatingType() {
                return C1990e.this.f8592h;
            }

            @Override // android.support.p001v4.media.session.IMediaSession
            public int getRepeatMode() {
                return C1990e.this.f8594j;
            }

            @Override // android.support.p001v4.media.session.IMediaSession
            public int getShuffleMode() {
                return C1990e.this.f8595k;
            }

            @Override // android.support.p001v4.media.session.IMediaSession
            public String getTag() {
                throw new AssertionError();
            }

            @Override // android.support.p001v4.media.session.IMediaSession
            public ParcelableVolumeInfo getVolumeAttributes() {
                throw new AssertionError();
            }

            @Override // android.support.p001v4.media.session.IMediaSession
            public boolean isCaptioningEnabled() {
                return C1990e.this.f8593i;
            }

            @Override // android.support.p001v4.media.session.IMediaSession
            public boolean isShuffleModeEnabledRemoved() {
                return false;
            }

            @Override // android.support.p001v4.media.session.IMediaSession
            public boolean isTransportControlEnabled() {
                throw new AssertionError();
            }

            @Override // android.support.p001v4.media.session.IMediaSession
            public void next() {
                throw new AssertionError();
            }

            @Override // android.support.p001v4.media.session.IMediaSession
            public void pause() {
                throw new AssertionError();
            }

            @Override // android.support.p001v4.media.session.IMediaSession
            public void play() {
                throw new AssertionError();
            }

            @Override // android.support.p001v4.media.session.IMediaSession
            public void playFromMediaId(String str, Bundle bundle) {
                throw new AssertionError();
            }

            @Override // android.support.p001v4.media.session.IMediaSession
            public void playFromSearch(String str, Bundle bundle) {
                throw new AssertionError();
            }

            @Override // android.support.p001v4.media.session.IMediaSession
            public void playFromUri(Uri uri, Bundle bundle) {
                throw new AssertionError();
            }

            @Override // android.support.p001v4.media.session.IMediaSession
            public void prepare() {
                throw new AssertionError();
            }

            @Override // android.support.p001v4.media.session.IMediaSession
            public void prepareFromMediaId(String str, Bundle bundle) {
                throw new AssertionError();
            }

            @Override // android.support.p001v4.media.session.IMediaSession
            public void prepareFromSearch(String str, Bundle bundle) {
                throw new AssertionError();
            }

            @Override // android.support.p001v4.media.session.IMediaSession
            public void prepareFromUri(Uri uri, Bundle bundle) {
                throw new AssertionError();
            }

            @Override // android.support.p001v4.media.session.IMediaSession
            public void previous() {
                throw new AssertionError();
            }

            @Override // android.support.p001v4.media.session.IMediaSession
            public void rate(RatingCompat ratingCompat) {
                throw new AssertionError();
            }

            @Override // android.support.p001v4.media.session.IMediaSession
            public void rateWithExtras(RatingCompat ratingCompat, Bundle bundle) {
                throw new AssertionError();
            }

            @Override // android.support.p001v4.media.session.IMediaSession
            public void registerCallbackListener(IMediaControllerCallback iMediaControllerCallback) {
                C1990e c1990e = C1990e.this;
                if (!c1990e.f8587c) {
                    String mo64870g = c1990e.mo64870g();
                    if (mo64870g == null) {
                        mo64870g = MediaSessionManager.RemoteUserInfo.LEGACY_CONTROLLER;
                    }
                    C1990e.this.f8588d.register(iMediaControllerCallback, new MediaSessionManager.RemoteUserInfo(mo64870g, Binder.getCallingPid(), Binder.getCallingUid()));
                }
            }

            @Override // android.support.p001v4.media.session.IMediaSession
            public void removeQueueItem(MediaDescriptionCompat mediaDescriptionCompat) {
                throw new AssertionError();
            }

            @Override // android.support.p001v4.media.session.IMediaSession
            public void removeQueueItemAt(int i) {
                throw new AssertionError();
            }

            @Override // android.support.p001v4.media.session.IMediaSession
            public void rewind() {
                throw new AssertionError();
            }

            @Override // android.support.p001v4.media.session.IMediaSession
            public void seekTo(long j) {
                throw new AssertionError();
            }

            @Override // android.support.p001v4.media.session.IMediaSession
            public void sendCommand(String str, Bundle bundle, ResultReceiverWrapper resultReceiverWrapper) {
                throw new AssertionError();
            }

            @Override // android.support.p001v4.media.session.IMediaSession
            public void sendCustomAction(String str, Bundle bundle) {
                throw new AssertionError();
            }

            @Override // android.support.p001v4.media.session.IMediaSession
            public boolean sendMediaButton(KeyEvent keyEvent) {
                throw new AssertionError();
            }

            @Override // android.support.p001v4.media.session.IMediaSession
            public void setCaptioningEnabled(boolean z) {
                throw new AssertionError();
            }

            @Override // android.support.p001v4.media.session.IMediaSession
            public void setRepeatMode(int i) {
                throw new AssertionError();
            }

            @Override // android.support.p001v4.media.session.IMediaSession
            public void setShuffleMode(int i) {
                throw new AssertionError();
            }

            @Override // android.support.p001v4.media.session.IMediaSession
            public void setShuffleModeEnabledRemoved(boolean z) {
            }

            @Override // android.support.p001v4.media.session.IMediaSession
            public void setVolumeTo(int i, int i2, String str) {
                throw new AssertionError();
            }

            @Override // android.support.p001v4.media.session.IMediaSession
            public void skipToQueueItem(long j) {
                throw new AssertionError();
            }

            @Override // android.support.p001v4.media.session.IMediaSession
            public void stop() {
                throw new AssertionError();
            }

            @Override // android.support.p001v4.media.session.IMediaSession
            public void unregisterCallbackListener(IMediaControllerCallback iMediaControllerCallback) {
                C1990e.this.f8588d.unregister(iMediaControllerCallback);
            }
        }

        public C1990e(Context context, String str, Bundle bundle) {
            Object m64847b = AbstractC1998a.m64847b(context, str);
            this.f8585a = m64847b;
            this.f8586b = new Token(AbstractC1998a.m64846c(m64847b), new BinderC1991a(), bundle);
        }

        @Override // android.support.p001v4.media.session.MediaSessionCompat.InterfaceC1989d
        /* renamed from: a */
        public Token mo64876a() {
            return this.f8586b;
        }

        @Override // android.support.p001v4.media.session.MediaSessionCompat.InterfaceC1989d
        /* renamed from: b */
        public void mo64875b(int i) {
            AbstractC1998a.m64838k(this.f8585a, i);
        }

        @Override // android.support.p001v4.media.session.MediaSessionCompat.InterfaceC1989d
        /* renamed from: c */
        public void mo64874c(String str, Bundle bundle) {
            if (Build.VERSION.SDK_INT < 23) {
                for (int beginBroadcast = this.f8588d.beginBroadcast() - 1; beginBroadcast >= 0; beginBroadcast--) {
                    try {
                        ((IMediaControllerCallback) this.f8588d.getBroadcastItem(beginBroadcast)).onEvent(str, bundle);
                    } catch (RemoteException unused) {
                    }
                }
                this.f8588d.finishBroadcast();
            }
            AbstractC1998a.m64842g(this.f8585a, str, bundle);
        }

        @Override // android.support.p001v4.media.session.MediaSessionCompat.InterfaceC1989d
        /* renamed from: d */
        public void mo64873d(Callback callback, Handler handler) {
            Object obj;
            Object obj2 = this.f8585a;
            if (callback == null) {
                obj = null;
            } else {
                obj = callback.f8567a;
            }
            AbstractC1998a.m64840i(obj2, obj, handler);
            if (callback != null) {
                callback.m64883b(this, handler);
            }
        }

        @Override // android.support.p001v4.media.session.MediaSessionCompat.InterfaceC1989d
        /* renamed from: e */
        public void mo64872e(int i) {
            if (Build.VERSION.SDK_INT < 22) {
                this.f8592h = i;
            } else {
                AbstractC18075Mr0.m67282a(this.f8585a, i);
            }
        }

        @Override // android.support.p001v4.media.session.MediaSessionCompat.InterfaceC1989d
        /* renamed from: f */
        public void mo64871f(PlaybackStateCompat playbackStateCompat) {
            Object playbackState;
            this.f8589e = playbackStateCompat;
            for (int beginBroadcast = this.f8588d.beginBroadcast() - 1; beginBroadcast >= 0; beginBroadcast--) {
                try {
                    ((IMediaControllerCallback) this.f8588d.getBroadcastItem(beginBroadcast)).onPlaybackStateChanged(playbackStateCompat);
                } catch (RemoteException unused) {
                }
            }
            this.f8588d.finishBroadcast();
            Object obj = this.f8585a;
            if (playbackStateCompat == null) {
                playbackState = null;
            } else {
                playbackState = playbackStateCompat.getPlaybackState();
            }
            AbstractC1998a.m64835n(obj, playbackState);
        }

        @Override // android.support.p001v4.media.session.MediaSessionCompat.InterfaceC1989d
        /* renamed from: g */
        public String mo64870g() {
            if (Build.VERSION.SDK_INT < 24) {
                return null;
            }
            return MediaSessionCompatApi24.m64855b(this.f8585a);
        }

        @Override // android.support.p001v4.media.session.MediaSessionCompat.InterfaceC1989d
        public PlaybackStateCompat getPlaybackState() {
            return this.f8589e;
        }

        @Override // android.support.p001v4.media.session.MediaSessionCompat.InterfaceC1989d
        /* renamed from: h */
        public void mo64869h(int i) {
            AbstractC1998a.m64834o(this.f8585a, i);
        }

        @Override // android.support.p001v4.media.session.MediaSessionCompat.InterfaceC1989d
        /* renamed from: i */
        public void mo64868i(PendingIntent pendingIntent) {
            AbstractC1998a.m64837l(this.f8585a, pendingIntent);
        }

        @Override // android.support.p001v4.media.session.MediaSessionCompat.InterfaceC1989d
        public boolean isActive() {
            return AbstractC1998a.m64844e(this.f8585a);
        }

        @Override // android.support.p001v4.media.session.MediaSessionCompat.InterfaceC1989d
        /* renamed from: j */
        public Object mo64867j() {
            return null;
        }

        @Override // android.support.p001v4.media.session.MediaSessionCompat.InterfaceC1989d
        /* renamed from: k */
        public void mo64866k(boolean z) {
            AbstractC1998a.m64841h(this.f8585a, z);
        }

        @Override // android.support.p001v4.media.session.MediaSessionCompat.InterfaceC1989d
        /* renamed from: l */
        public void mo64859l(MediaSessionManager.RemoteUserInfo remoteUserInfo) {
        }

        @Override // android.support.p001v4.media.session.MediaSessionCompat.InterfaceC1989d
        /* renamed from: m */
        public void mo64865m(VolumeProviderCompat volumeProviderCompat) {
            AbstractC1998a.m64833p(this.f8585a, volumeProviderCompat.getVolumeProvider());
        }

        @Override // android.support.p001v4.media.session.MediaSessionCompat.InterfaceC1989d
        /* renamed from: n */
        public void mo64864n(CharSequence charSequence) {
            AbstractC1998a.m64831r(this.f8585a, charSequence);
        }

        @Override // android.support.p001v4.media.session.MediaSessionCompat.InterfaceC1989d
        /* renamed from: o */
        public void mo64863o(MediaMetadataCompat mediaMetadataCompat) {
            Object mediaMetadata;
            this.f8591g = mediaMetadataCompat;
            Object obj = this.f8585a;
            if (mediaMetadataCompat == null) {
                mediaMetadata = null;
            } else {
                mediaMetadata = mediaMetadataCompat.getMediaMetadata();
            }
            AbstractC1998a.m64836m(obj, mediaMetadata);
        }

        @Override // android.support.p001v4.media.session.MediaSessionCompat.InterfaceC1989d
        /* renamed from: p */
        public void mo64862p(List list) {
            ArrayList arrayList;
            this.f8590f = list;
            if (list != null) {
                arrayList = new ArrayList();
                Iterator it = list.iterator();
                while (it.hasNext()) {
                    arrayList.add(((QueueItem) it.next()).getQueueItem());
                }
            } else {
                arrayList = null;
            }
            AbstractC1998a.m64832q(this.f8585a, arrayList);
        }

        @Override // android.support.p001v4.media.session.MediaSessionCompat.InterfaceC1989d
        /* renamed from: q */
        public void mo64861q(PendingIntent pendingIntent) {
            AbstractC1998a.m64830s(this.f8585a, pendingIntent);
        }

        @Override // android.support.p001v4.media.session.MediaSessionCompat.InterfaceC1989d
        /* renamed from: r */
        public Object mo64860r() {
            return this.f8585a;
        }

        @Override // android.support.p001v4.media.session.MediaSessionCompat.InterfaceC1989d
        public void release() {
            this.f8587c = true;
            AbstractC1998a.m64843f(this.f8585a);
        }

        @Override // android.support.p001v4.media.session.MediaSessionCompat.InterfaceC1989d
        /* renamed from: s */
        public MediaSessionManager.RemoteUserInfo mo64858s() {
            return null;
        }

        @Override // android.support.p001v4.media.session.MediaSessionCompat.InterfaceC1989d
        public void setCaptioningEnabled(boolean z) {
            if (this.f8593i != z) {
                this.f8593i = z;
                for (int beginBroadcast = this.f8588d.beginBroadcast() - 1; beginBroadcast >= 0; beginBroadcast--) {
                    try {
                        ((IMediaControllerCallback) this.f8588d.getBroadcastItem(beginBroadcast)).onCaptioningEnabledChanged(z);
                    } catch (RemoteException unused) {
                    }
                }
                this.f8588d.finishBroadcast();
            }
        }

        @Override // android.support.p001v4.media.session.MediaSessionCompat.InterfaceC1989d
        public void setExtras(Bundle bundle) {
            AbstractC1998a.m64839j(this.f8585a, bundle);
        }

        @Override // android.support.p001v4.media.session.MediaSessionCompat.InterfaceC1989d
        public void setRepeatMode(int i) {
            if (this.f8594j != i) {
                this.f8594j = i;
                for (int beginBroadcast = this.f8588d.beginBroadcast() - 1; beginBroadcast >= 0; beginBroadcast--) {
                    try {
                        ((IMediaControllerCallback) this.f8588d.getBroadcastItem(beginBroadcast)).onRepeatModeChanged(i);
                    } catch (RemoteException unused) {
                    }
                }
                this.f8588d.finishBroadcast();
            }
        }

        @Override // android.support.p001v4.media.session.MediaSessionCompat.InterfaceC1989d
        public void setShuffleMode(int i) {
            if (this.f8595k != i) {
                this.f8595k = i;
                for (int beginBroadcast = this.f8588d.beginBroadcast() - 1; beginBroadcast >= 0; beginBroadcast--) {
                    try {
                        ((IMediaControllerCallback) this.f8588d.getBroadcastItem(beginBroadcast)).onShuffleModeChanged(i);
                    } catch (RemoteException unused) {
                    }
                }
                this.f8588d.finishBroadcast();
            }
        }

        public C1990e(Object obj) {
            Object m64829t = AbstractC1998a.m64829t(obj);
            this.f8585a = m64829t;
            this.f8586b = new Token(AbstractC1998a.m64846c(m64829t), new BinderC1991a());
        }
    }

    public MediaSessionCompat(Context context, InterfaceC1989d interfaceC1989d) {
        this.f8566c = new ArrayList();
        this.f8564a = interfaceC1989d;
        if (!AbstractC1998a.m64845d(interfaceC1989d.mo64860r())) {
            setCallback(new C1988c());
        }
        this.f8565b = new MediaControllerCompat(context, this);
    }
}

package android.support.p001v4.media.session;

import android.os.Build;
import android.os.Bundle;
import android.os.Parcel;
import android.os.Parcelable;
import android.os.SystemClock;
import android.support.p001v4.media.session.AbstractC2002b;
import android.text.TextUtils;
import androidx.annotation.Nullable;
import androidx.annotation.RestrictTo;
import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;
import java.util.ArrayList;
import java.util.List;
import okhttp3.internal.p026ws.WebSocketProtocol;

/* renamed from: android.support.v4.media.session.PlaybackStateCompat */
/* loaded from: classes.dex */
public final class PlaybackStateCompat implements Parcelable {
    public static final long ACTION_FAST_FORWARD = 64;
    public static final long ACTION_PAUSE = 2;
    public static final long ACTION_PLAY = 4;
    public static final long ACTION_PLAY_FROM_MEDIA_ID = 1024;
    public static final long ACTION_PLAY_FROM_SEARCH = 2048;
    public static final long ACTION_PLAY_FROM_URI = 8192;
    public static final long ACTION_PLAY_PAUSE = 512;
    public static final long ACTION_PREPARE = 16384;
    public static final long ACTION_PREPARE_FROM_MEDIA_ID = 32768;
    public static final long ACTION_PREPARE_FROM_SEARCH = 65536;
    public static final long ACTION_PREPARE_FROM_URI = 131072;
    public static final long ACTION_REWIND = 8;
    public static final long ACTION_SEEK_TO = 256;
    public static final long ACTION_SET_CAPTIONING_ENABLED = 1048576;
    public static final long ACTION_SET_RATING = 128;
    public static final long ACTION_SET_REPEAT_MODE = 262144;
    public static final long ACTION_SET_SHUFFLE_MODE = 2097152;
    @Deprecated
    public static final long ACTION_SET_SHUFFLE_MODE_ENABLED = 524288;
    public static final long ACTION_SKIP_TO_NEXT = 32;
    public static final long ACTION_SKIP_TO_PREVIOUS = 16;
    public static final long ACTION_SKIP_TO_QUEUE_ITEM = 4096;
    public static final long ACTION_STOP = 1;
    public static final Parcelable.Creator<PlaybackStateCompat> CREATOR = new C1997a();
    public static final int ERROR_CODE_ACTION_ABORTED = 10;
    public static final int ERROR_CODE_APP_ERROR = 1;
    public static final int ERROR_CODE_AUTHENTICATION_EXPIRED = 3;
    public static final int ERROR_CODE_CONCURRENT_STREAM_LIMIT = 5;
    public static final int ERROR_CODE_CONTENT_ALREADY_PLAYING = 8;
    public static final int ERROR_CODE_END_OF_QUEUE = 11;
    public static final int ERROR_CODE_NOT_AVAILABLE_IN_REGION = 7;
    public static final int ERROR_CODE_NOT_SUPPORTED = 2;
    public static final int ERROR_CODE_PARENTAL_CONTROL_RESTRICTED = 6;
    public static final int ERROR_CODE_PREMIUM_ACCOUNT_REQUIRED = 4;
    public static final int ERROR_CODE_SKIP_LIMIT_REACHED = 9;
    public static final int ERROR_CODE_UNKNOWN_ERROR = 0;
    public static final long PLAYBACK_POSITION_UNKNOWN = -1;
    public static final int REPEAT_MODE_ALL = 2;
    public static final int REPEAT_MODE_GROUP = 3;
    public static final int REPEAT_MODE_INVALID = -1;
    public static final int REPEAT_MODE_NONE = 0;
    public static final int REPEAT_MODE_ONE = 1;
    public static final int SHUFFLE_MODE_ALL = 1;
    public static final int SHUFFLE_MODE_GROUP = 2;
    public static final int SHUFFLE_MODE_INVALID = -1;
    public static final int SHUFFLE_MODE_NONE = 0;
    public static final int STATE_BUFFERING = 6;
    public static final int STATE_CONNECTING = 8;
    public static final int STATE_ERROR = 7;
    public static final int STATE_FAST_FORWARDING = 4;
    public static final int STATE_NONE = 0;
    public static final int STATE_PAUSED = 2;
    public static final int STATE_PLAYING = 3;
    public static final int STATE_REWINDING = 5;
    public static final int STATE_SKIPPING_TO_NEXT = 10;
    public static final int STATE_SKIPPING_TO_PREVIOUS = 9;
    public static final int STATE_SKIPPING_TO_QUEUE_ITEM = 11;
    public static final int STATE_STOPPED = 1;

    /* renamed from: a */
    public final int f8597a;

    /* renamed from: b */
    public final long f8598b;

    /* renamed from: c */
    public final long f8599c;

    /* renamed from: d */
    public final float f8600d;

    /* renamed from: e */
    public final long f8601e;

    /* renamed from: f */
    public final int f8602f;

    /* renamed from: g */
    public final CharSequence f8603g;

    /* renamed from: h */
    public final long f8604h;

    /* renamed from: i */
    public List f8605i;

    /* renamed from: j */
    public final long f8606j;

    /* renamed from: k */
    public final Bundle f8607k;

    /* renamed from: l */
    public Object f8608l;

    @Retention(RetentionPolicy.SOURCE)
    @RestrictTo({RestrictTo.Scope.LIBRARY_GROUP})
    /* renamed from: android.support.v4.media.session.PlaybackStateCompat$Actions */
    /* loaded from: classes.dex */
    public @interface Actions {
    }

    /* renamed from: android.support.v4.media.session.PlaybackStateCompat$Builder */
    /* loaded from: classes.dex */
    public static final class Builder {

        /* renamed from: a */
        public final List f8609a;

        /* renamed from: b */
        public int f8610b;

        /* renamed from: c */
        public long f8611c;

        /* renamed from: d */
        public long f8612d;

        /* renamed from: e */
        public float f8613e;

        /* renamed from: f */
        public long f8614f;

        /* renamed from: g */
        public int f8615g;

        /* renamed from: h */
        public CharSequence f8616h;

        /* renamed from: i */
        public long f8617i;

        /* renamed from: j */
        public long f8618j;

        /* renamed from: k */
        public Bundle f8619k;

        public Builder() {
            this.f8609a = new ArrayList();
            this.f8618j = -1L;
        }

        public Builder addCustomAction(String str, String str2, int i) {
            return addCustomAction(new CustomAction(str, str2, i, null));
        }

        public PlaybackStateCompat build() {
            return new PlaybackStateCompat(this.f8610b, this.f8611c, this.f8612d, this.f8613e, this.f8614f, this.f8615g, this.f8616h, this.f8617i, this.f8609a, this.f8618j, this.f8619k);
        }

        public Builder setActions(long j) {
            this.f8614f = j;
            return this;
        }

        public Builder setActiveQueueItemId(long j) {
            this.f8618j = j;
            return this;
        }

        public Builder setBufferedPosition(long j) {
            this.f8612d = j;
            return this;
        }

        public Builder setErrorMessage(CharSequence charSequence) {
            this.f8616h = charSequence;
            return this;
        }

        public Builder setExtras(Bundle bundle) {
            this.f8619k = bundle;
            return this;
        }

        public Builder setState(int i, long j, float f) {
            return setState(i, j, f, SystemClock.elapsedRealtime());
        }

        public Builder addCustomAction(CustomAction customAction) {
            if (customAction != null) {
                this.f8609a.add(customAction);
                return this;
            }
            throw new IllegalArgumentException("You may not add a null CustomAction to PlaybackStateCompat.");
        }

        public Builder setErrorMessage(int i, CharSequence charSequence) {
            this.f8615g = i;
            this.f8616h = charSequence;
            return this;
        }

        public Builder setState(int i, long j, float f, long j2) {
            this.f8610b = i;
            this.f8611c = j;
            this.f8617i = j2;
            this.f8613e = f;
            return this;
        }

        public Builder(PlaybackStateCompat playbackStateCompat) {
            ArrayList arrayList = new ArrayList();
            this.f8609a = arrayList;
            this.f8618j = -1L;
            this.f8610b = playbackStateCompat.f8597a;
            this.f8611c = playbackStateCompat.f8598b;
            this.f8613e = playbackStateCompat.f8600d;
            this.f8617i = playbackStateCompat.f8604h;
            this.f8612d = playbackStateCompat.f8599c;
            this.f8614f = playbackStateCompat.f8601e;
            this.f8615g = playbackStateCompat.f8602f;
            this.f8616h = playbackStateCompat.f8603g;
            List list = playbackStateCompat.f8605i;
            if (list != null) {
                arrayList.addAll(list);
            }
            this.f8618j = playbackStateCompat.f8606j;
            this.f8619k = playbackStateCompat.f8607k;
        }
    }

    @Retention(RetentionPolicy.SOURCE)
    @RestrictTo({RestrictTo.Scope.LIBRARY_GROUP})
    /* renamed from: android.support.v4.media.session.PlaybackStateCompat$ErrorCode */
    /* loaded from: classes.dex */
    public @interface ErrorCode {
    }

    @Retention(RetentionPolicy.SOURCE)
    @RestrictTo({RestrictTo.Scope.LIBRARY_GROUP})
    /* renamed from: android.support.v4.media.session.PlaybackStateCompat$MediaKeyAction */
    /* loaded from: classes.dex */
    public @interface MediaKeyAction {
    }

    @Retention(RetentionPolicy.SOURCE)
    @RestrictTo({RestrictTo.Scope.LIBRARY_GROUP})
    /* renamed from: android.support.v4.media.session.PlaybackStateCompat$RepeatMode */
    /* loaded from: classes.dex */
    public @interface RepeatMode {
    }

    @Retention(RetentionPolicy.SOURCE)
    @RestrictTo({RestrictTo.Scope.LIBRARY_GROUP})
    /* renamed from: android.support.v4.media.session.PlaybackStateCompat$ShuffleMode */
    /* loaded from: classes.dex */
    public @interface ShuffleMode {
    }

    @Retention(RetentionPolicy.SOURCE)
    @RestrictTo({RestrictTo.Scope.LIBRARY_GROUP})
    /* renamed from: android.support.v4.media.session.PlaybackStateCompat$State */
    /* loaded from: classes.dex */
    public @interface State {
    }

    /* renamed from: android.support.v4.media.session.PlaybackStateCompat$a */
    /* loaded from: classes.dex */
    public static class C1997a implements Parcelable.Creator {
        @Override // android.os.Parcelable.Creator
        /* renamed from: a */
        public PlaybackStateCompat createFromParcel(Parcel parcel) {
            return new PlaybackStateCompat(parcel);
        }

        @Override // android.os.Parcelable.Creator
        /* renamed from: b */
        public PlaybackStateCompat[] newArray(int i) {
            return new PlaybackStateCompat[i];
        }
    }

    public PlaybackStateCompat(int i, long j, long j2, float f, long j3, int i2, CharSequence charSequence, long j4, List list, long j5, Bundle bundle) {
        this.f8597a = i;
        this.f8598b = j;
        this.f8599c = j2;
        this.f8600d = f;
        this.f8601e = j3;
        this.f8602f = i2;
        this.f8603g = charSequence;
        this.f8604h = j4;
        this.f8605i = new ArrayList(list);
        this.f8606j = j5;
        this.f8607k = bundle;
    }

    public static PlaybackStateCompat fromPlaybackState(Object obj) {
        ArrayList arrayList;
        Bundle bundle = null;
        if (obj == null) {
            return null;
        }
        List<Object> m64821d = AbstractC2002b.m64821d(obj);
        if (m64821d != null) {
            ArrayList arrayList2 = new ArrayList(m64821d.size());
            for (Object obj2 : m64821d) {
                arrayList2.add(CustomAction.fromCustomAction(obj2));
            }
            arrayList = arrayList2;
        } else {
            arrayList = null;
        }
        if (Build.VERSION.SDK_INT >= 22) {
            bundle = AbstractC17868Jk1.m67685a(obj);
        }
        PlaybackStateCompat playbackStateCompat = new PlaybackStateCompat(AbstractC2002b.m64816i(obj), AbstractC2002b.m64817h(obj), AbstractC2002b.m64822c(obj), AbstractC2002b.m64818g(obj), AbstractC2002b.m64824a(obj), 0, AbstractC2002b.m64820e(obj), AbstractC2002b.m64819f(obj), arrayList, AbstractC2002b.m64823b(obj), bundle);
        playbackStateCompat.f8608l = obj;
        return playbackStateCompat;
    }

    public static int toKeyCode(long j) {
        if (j == 4) {
            return WebSocketProtocol.PAYLOAD_SHORT;
        }
        if (j == 2) {
            return 127;
        }
        if (j == 32) {
            return 87;
        }
        if (j == 16) {
            return 88;
        }
        if (j == 1) {
            return 86;
        }
        if (j == 64) {
            return 90;
        }
        if (j == 8) {
            return 89;
        }
        return j == 512 ? 85 : 0;
    }

    @Override // android.os.Parcelable
    public int describeContents() {
        return 0;
    }

    public long getActions() {
        return this.f8601e;
    }

    public long getActiveQueueItemId() {
        return this.f8606j;
    }

    public long getBufferedPosition() {
        return this.f8599c;
    }

    @RestrictTo({RestrictTo.Scope.LIBRARY_GROUP})
    public long getCurrentPosition(Long l) {
        long elapsedRealtime;
        long j = this.f8598b;
        float f = this.f8600d;
        if (l != null) {
            elapsedRealtime = l.longValue();
        } else {
            elapsedRealtime = SystemClock.elapsedRealtime() - this.f8604h;
        }
        return Math.max(0L, j + (f * ((float) elapsedRealtime)));
    }

    public List<CustomAction> getCustomActions() {
        return this.f8605i;
    }

    public int getErrorCode() {
        return this.f8602f;
    }

    public CharSequence getErrorMessage() {
        return this.f8603g;
    }

    @Nullable
    public Bundle getExtras() {
        return this.f8607k;
    }

    public long getLastPositionUpdateTime() {
        return this.f8604h;
    }

    public float getPlaybackSpeed() {
        return this.f8600d;
    }

    public Object getPlaybackState() {
        ArrayList arrayList;
        if (this.f8608l == null) {
            if (this.f8605i != null) {
                arrayList = new ArrayList(this.f8605i.size());
                for (CustomAction customAction : this.f8605i) {
                    arrayList.add(customAction.getCustomAction());
                }
            } else {
                arrayList = null;
            }
            ArrayList arrayList2 = arrayList;
            if (Build.VERSION.SDK_INT >= 22) {
                this.f8608l = AbstractC17868Jk1.m67684b(this.f8597a, this.f8598b, this.f8599c, this.f8600d, this.f8601e, this.f8603g, this.f8604h, arrayList2, this.f8606j, this.f8607k);
            } else {
                this.f8608l = AbstractC2002b.m64815j(this.f8597a, this.f8598b, this.f8599c, this.f8600d, this.f8601e, this.f8603g, this.f8604h, arrayList2, this.f8606j);
            }
        }
        return this.f8608l;
    }

    public long getPosition() {
        return this.f8598b;
    }

    public int getState() {
        return this.f8597a;
    }

    public String toString() {
        return "PlaybackState {state=" + this.f8597a + ", position=" + this.f8598b + ", buffered position=" + this.f8599c + ", speed=" + this.f8600d + ", updated=" + this.f8604h + ", actions=" + this.f8601e + ", error code=" + this.f8602f + ", error message=" + this.f8603g + ", custom actions=" + this.f8605i + ", active item id=" + this.f8606j + "}";
    }

    @Override // android.os.Parcelable
    public void writeToParcel(Parcel parcel, int i) {
        parcel.writeInt(this.f8597a);
        parcel.writeLong(this.f8598b);
        parcel.writeFloat(this.f8600d);
        parcel.writeLong(this.f8604h);
        parcel.writeLong(this.f8599c);
        parcel.writeLong(this.f8601e);
        TextUtils.writeToParcel(this.f8603g, parcel, i);
        parcel.writeTypedList(this.f8605i);
        parcel.writeLong(this.f8606j);
        parcel.writeBundle(this.f8607k);
        parcel.writeInt(this.f8602f);
    }

    /* renamed from: android.support.v4.media.session.PlaybackStateCompat$CustomAction */
    /* loaded from: classes.dex */
    public static final class CustomAction implements Parcelable {
        public static final Parcelable.Creator<CustomAction> CREATOR = new C1996a();

        /* renamed from: a */
        public final String f8620a;

        /* renamed from: b */
        public final CharSequence f8621b;

        /* renamed from: c */
        public final int f8622c;

        /* renamed from: d */
        public final Bundle f8623d;

        /* renamed from: e */
        public Object f8624e;

        /* renamed from: android.support.v4.media.session.PlaybackStateCompat$CustomAction$Builder */
        /* loaded from: classes.dex */
        public static final class Builder {

            /* renamed from: a */
            public final String f8625a;

            /* renamed from: b */
            public final CharSequence f8626b;

            /* renamed from: c */
            public final int f8627c;

            /* renamed from: d */
            public Bundle f8628d;

            public Builder(String str, CharSequence charSequence, int i) {
                if (!TextUtils.isEmpty(str)) {
                    if (!TextUtils.isEmpty(charSequence)) {
                        if (i != 0) {
                            this.f8625a = str;
                            this.f8626b = charSequence;
                            this.f8627c = i;
                            return;
                        }
                        throw new IllegalArgumentException("You must specify an icon resource id to build a CustomAction.");
                    }
                    throw new IllegalArgumentException("You must specify a name to build a CustomAction.");
                }
                throw new IllegalArgumentException("You must specify an action to build a CustomAction.");
            }

            public CustomAction build() {
                return new CustomAction(this.f8625a, this.f8626b, this.f8627c, this.f8628d);
            }

            public Builder setExtras(Bundle bundle) {
                this.f8628d = bundle;
                return this;
            }
        }

        /* renamed from: android.support.v4.media.session.PlaybackStateCompat$CustomAction$a */
        /* loaded from: classes.dex */
        public static class C1996a implements Parcelable.Creator {
            @Override // android.os.Parcelable.Creator
            /* renamed from: a */
            public CustomAction createFromParcel(Parcel parcel) {
                return new CustomAction(parcel);
            }

            @Override // android.os.Parcelable.Creator
            /* renamed from: b */
            public CustomAction[] newArray(int i) {
                return new CustomAction[i];
            }
        }

        public CustomAction(String str, CharSequence charSequence, int i, Bundle bundle) {
            this.f8620a = str;
            this.f8621b = charSequence;
            this.f8622c = i;
            this.f8623d = bundle;
        }

        public static CustomAction fromCustomAction(Object obj) {
            if (obj != null) {
                CustomAction customAction = new CustomAction(AbstractC2002b.C2003a.m64814a(obj), AbstractC2002b.C2003a.m64811d(obj), AbstractC2002b.C2003a.m64812c(obj), AbstractC2002b.C2003a.m64813b(obj));
                customAction.f8624e = obj;
                return customAction;
            }
            return null;
        }

        @Override // android.os.Parcelable
        public int describeContents() {
            return 0;
        }

        public String getAction() {
            return this.f8620a;
        }

        public Object getCustomAction() {
            Object obj = this.f8624e;
            if (obj == null) {
                Object m64810e = AbstractC2002b.C2003a.m64810e(this.f8620a, this.f8621b, this.f8622c, this.f8623d);
                this.f8624e = m64810e;
                return m64810e;
            }
            return obj;
        }

        public Bundle getExtras() {
            return this.f8623d;
        }

        public int getIcon() {
            return this.f8622c;
        }

        public CharSequence getName() {
            return this.f8621b;
        }

        public String toString() {
            return "Action:mName='" + ((Object) this.f8621b) + ", mIcon=" + this.f8622c + ", mExtras=" + this.f8623d;
        }

        @Override // android.os.Parcelable
        public void writeToParcel(Parcel parcel, int i) {
            parcel.writeString(this.f8620a);
            TextUtils.writeToParcel(this.f8621b, parcel, i);
            parcel.writeInt(this.f8622c);
            parcel.writeBundle(this.f8623d);
        }

        public CustomAction(Parcel parcel) {
            this.f8620a = parcel.readString();
            this.f8621b = (CharSequence) TextUtils.CHAR_SEQUENCE_CREATOR.createFromParcel(parcel);
            this.f8622c = parcel.readInt();
            this.f8623d = parcel.readBundle(MediaSessionCompat.class.getClassLoader());
        }
    }

    public PlaybackStateCompat(Parcel parcel) {
        this.f8597a = parcel.readInt();
        this.f8598b = parcel.readLong();
        this.f8600d = parcel.readFloat();
        this.f8604h = parcel.readLong();
        this.f8599c = parcel.readLong();
        this.f8601e = parcel.readLong();
        this.f8603g = (CharSequence) TextUtils.CHAR_SEQUENCE_CREATOR.createFromParcel(parcel);
        this.f8605i = parcel.createTypedArrayList(CustomAction.CREATOR);
        this.f8606j = parcel.readLong();
        this.f8607k = parcel.readBundle(MediaSessionCompat.class.getClassLoader());
        this.f8602f = parcel.readInt();
    }
}

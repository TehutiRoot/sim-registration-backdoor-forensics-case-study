package androidx.media;

import android.media.AudioAttributes;
import android.os.Build;
import android.os.Bundle;
import android.util.SparseIntArray;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.annotation.RestrictTo;
import androidx.versionedparcelable.VersionedParcelable;
import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;

/* loaded from: classes2.dex */
public class AudioAttributesCompat implements VersionedParcelable {
    public static final int CONTENT_TYPE_MOVIE = 3;
    public static final int CONTENT_TYPE_MUSIC = 2;
    public static final int CONTENT_TYPE_SONIFICATION = 4;
    public static final int CONTENT_TYPE_SPEECH = 1;
    public static final int CONTENT_TYPE_UNKNOWN = 0;
    public static final int FLAG_AUDIBILITY_ENFORCED = 1;
    public static final int FLAG_HW_AV_SYNC = 16;
    public static final int USAGE_ALARM = 4;
    public static final int USAGE_ASSISTANCE_ACCESSIBILITY = 11;
    public static final int USAGE_ASSISTANCE_NAVIGATION_GUIDANCE = 12;
    public static final int USAGE_ASSISTANCE_SONIFICATION = 13;
    public static final int USAGE_ASSISTANT = 16;
    public static final int USAGE_GAME = 14;
    public static final int USAGE_MEDIA = 1;
    public static final int USAGE_NOTIFICATION = 5;
    public static final int USAGE_NOTIFICATION_COMMUNICATION_DELAYED = 9;
    public static final int USAGE_NOTIFICATION_COMMUNICATION_INSTANT = 8;
    public static final int USAGE_NOTIFICATION_COMMUNICATION_REQUEST = 7;
    public static final int USAGE_NOTIFICATION_EVENT = 10;
    public static final int USAGE_NOTIFICATION_RINGTONE = 6;
    public static final int USAGE_UNKNOWN = 0;
    public static final int USAGE_VOICE_COMMUNICATION = 2;
    public static final int USAGE_VOICE_COMMUNICATION_SIGNALLING = 3;

    /* renamed from: b */
    public static final SparseIntArray f36096b;

    /* renamed from: c */
    public static boolean f36097c;

    /* renamed from: d */
    public static final int[] f36098d;

    /* renamed from: a */
    public AudioAttributesImpl f36099a;

    @Retention(RetentionPolicy.SOURCE)
    @RestrictTo({RestrictTo.Scope.LIBRARY_GROUP})
    /* loaded from: classes2.dex */
    public @interface AttributeContentType {
    }

    @Retention(RetentionPolicy.SOURCE)
    @RestrictTo({RestrictTo.Scope.LIBRARY_GROUP})
    /* loaded from: classes2.dex */
    public @interface AttributeUsage {
    }

    static {
        SparseIntArray sparseIntArray = new SparseIntArray();
        f36096b = sparseIntArray;
        sparseIntArray.put(5, 1);
        sparseIntArray.put(6, 2);
        sparseIntArray.put(7, 2);
        sparseIntArray.put(8, 1);
        sparseIntArray.put(9, 1);
        sparseIntArray.put(10, 1);
        f36098d = new int[]{0, 1, 2, 3, 4, 5, 6, 7, 8, 9, 10, 11, 12, 13, 14, 16};
    }

    public AudioAttributesCompat() {
    }

    /* renamed from: c */
    public static int m53978c(boolean z, int i, int i2) {
        if ((i & 1) == 1) {
            if (z) {
                return 1;
            }
            return 7;
        } else if ((i & 4) == 4) {
            if (z) {
                return 0;
            }
            return 6;
        } else {
            switch (i2) {
                case 0:
                    if (!z) {
                        return 3;
                    }
                    return Integer.MIN_VALUE;
                case 1:
                case 12:
                case 14:
                case 16:
                    return 3;
                case 2:
                    return 0;
                case 3:
                    if (z) {
                        return 0;
                    }
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
                case 11:
                    return 10;
                case 13:
                    return 1;
                case 15:
                default:
                    if (!z) {
                        return 3;
                    }
                    throw new IllegalArgumentException("Unknown usage value " + i2 + " in audio attributes");
            }
        }
    }

    /* renamed from: d */
    public static int m53977d(int i) {
        switch (i) {
            case 0:
                return 2;
            case 1:
            case 7:
                return 13;
            case 2:
                return 6;
            case 3:
                return 1;
            case 4:
                return 4;
            case 5:
                return 5;
            case 6:
                return 2;
            case 8:
                return 3;
            case 9:
            default:
                return 0;
            case 10:
                return 11;
        }
    }

    /* renamed from: e */
    public static String m53976e(int i) {
        switch (i) {
            case 0:
                return "USAGE_UNKNOWN";
            case 1:
                return "USAGE_MEDIA";
            case 2:
                return "USAGE_VOICE_COMMUNICATION";
            case 3:
                return "USAGE_VOICE_COMMUNICATION_SIGNALLING";
            case 4:
                return "USAGE_ALARM";
            case 5:
                return "USAGE_NOTIFICATION";
            case 6:
                return "USAGE_NOTIFICATION_RINGTONE";
            case 7:
                return "USAGE_NOTIFICATION_COMMUNICATION_REQUEST";
            case 8:
                return "USAGE_NOTIFICATION_COMMUNICATION_INSTANT";
            case 9:
                return "USAGE_NOTIFICATION_COMMUNICATION_DELAYED";
            case 10:
                return "USAGE_NOTIFICATION_EVENT";
            case 11:
                return "USAGE_ASSISTANCE_ACCESSIBILITY";
            case 12:
                return "USAGE_ASSISTANCE_NAVIGATION_GUIDANCE";
            case 13:
                return "USAGE_ASSISTANCE_SONIFICATION";
            case 14:
                return "USAGE_GAME";
            case 15:
            default:
                return "unknown usage " + i;
            case 16:
                return "USAGE_ASSISTANT";
        }
    }

    @RestrictTo({RestrictTo.Scope.LIBRARY_GROUP})
    public static AudioAttributesCompat fromBundle(Bundle bundle) {
        AudioAttributesImpl m53974c = AudioAttributesImplApi21.m53974c(bundle);
        if (m53974c == null) {
            return null;
        }
        return new AudioAttributesCompat(m53974c);
    }

    @RestrictTo({RestrictTo.Scope.LIBRARY_GROUP})
    public static void setForceLegacyBehavior(boolean z) {
        f36097c = z;
    }

    @Nullable
    public static AudioAttributesCompat wrap(@NonNull Object obj) {
        if (!f36097c) {
            AudioAttributesImplApi21 audioAttributesImplApi21 = new AudioAttributesImplApi21((AudioAttributes) obj);
            AudioAttributesCompat audioAttributesCompat = new AudioAttributesCompat();
            audioAttributesCompat.f36099a = audioAttributesImplApi21;
            return audioAttributesCompat;
        }
        return null;
    }

    /* renamed from: a */
    public int m53979a() {
        return this.f36099a.mo53972a();
    }

    public boolean equals(Object obj) {
        if (!(obj instanceof AudioAttributesCompat)) {
            return false;
        }
        AudioAttributesCompat audioAttributesCompat = (AudioAttributesCompat) obj;
        AudioAttributesImpl audioAttributesImpl = this.f36099a;
        if (audioAttributesImpl == null) {
            if (audioAttributesCompat.f36099a != null) {
                return false;
            }
            return true;
        }
        return audioAttributesImpl.equals(audioAttributesCompat.f36099a);
    }

    public int getContentType() {
        return this.f36099a.getContentType();
    }

    public int getFlags() {
        return this.f36099a.getFlags();
    }

    public int getLegacyStreamType() {
        return this.f36099a.getLegacyStreamType();
    }

    public int getUsage() {
        return this.f36099a.getUsage();
    }

    public int getVolumeControlStream() {
        return this.f36099a.getVolumeControlStream();
    }

    public int hashCode() {
        return this.f36099a.hashCode();
    }

    @NonNull
    @RestrictTo({RestrictTo.Scope.LIBRARY_GROUP})
    public Bundle toBundle() {
        return this.f36099a.toBundle();
    }

    public String toString() {
        return this.f36099a.toString();
    }

    @Nullable
    public Object unwrap() {
        return this.f36099a.mo53971b();
    }

    public AudioAttributesCompat(AudioAttributesImpl audioAttributesImpl) {
        this.f36099a = audioAttributesImpl;
    }

    /* loaded from: classes2.dex */
    public static class Builder {

        /* renamed from: a */
        public int f36100a;

        /* renamed from: b */
        public int f36101b;

        /* renamed from: c */
        public int f36102c;

        /* renamed from: d */
        public int f36103d;

        public Builder() {
            this.f36100a = 0;
            this.f36101b = 0;
            this.f36102c = 0;
            this.f36103d = -1;
        }

        /* JADX WARN: Can't fix incorrect switch cases order, some code will duplicate */
        /* renamed from: a */
        public Builder m53975a(int i) {
            switch (i) {
                case 0:
                    this.f36101b = 1;
                    break;
                case 1:
                    this.f36101b = 4;
                    break;
                case 2:
                    this.f36101b = 4;
                    break;
                case 3:
                    this.f36101b = 2;
                    break;
                case 4:
                    this.f36101b = 4;
                    break;
                case 5:
                    this.f36101b = 4;
                    break;
                case 6:
                    this.f36101b = 1;
                    this.f36102c |= 4;
                    break;
                case 7:
                    this.f36102c = 1 | this.f36102c;
                    this.f36101b = 4;
                    break;
                case 8:
                    this.f36101b = 4;
                    break;
                case 9:
                    this.f36101b = 4;
                    break;
                case 10:
                    this.f36101b = 1;
                    break;
                default:
                    StringBuilder sb = new StringBuilder();
                    sb.append("Invalid stream type ");
                    sb.append(i);
                    sb.append(" for AudioAttributesCompat");
                    break;
            }
            this.f36100a = AudioAttributesCompat.m53977d(i);
            return this;
        }

        public AudioAttributesCompat build() {
            AudioAttributesImpl audioAttributesImplBase;
            if (!AudioAttributesCompat.f36097c) {
                AudioAttributes.Builder usage = new AudioAttributes.Builder().setContentType(this.f36101b).setFlags(this.f36102c).setUsage(this.f36100a);
                int i = this.f36103d;
                if (i != -1) {
                    usage.setLegacyStreamType(i);
                }
                audioAttributesImplBase = new AudioAttributesImplApi21(usage.build(), this.f36103d);
            } else {
                audioAttributesImplBase = new AudioAttributesImplBase(this.f36101b, this.f36102c, this.f36100a, this.f36103d);
            }
            return new AudioAttributesCompat(audioAttributesImplBase);
        }

        public Builder setContentType(int i) {
            if (i != 0 && i != 1 && i != 2 && i != 3 && i != 4) {
                this.f36100a = 0;
            } else {
                this.f36101b = i;
            }
            return this;
        }

        public Builder setFlags(int i) {
            this.f36102c = (i & 1023) | this.f36102c;
            return this;
        }

        public Builder setLegacyStreamType(int i) {
            if (i != 10) {
                this.f36103d = i;
                return m53975a(i);
            }
            throw new IllegalArgumentException("STREAM_ACCESSIBILITY is not a legacy stream type that was used for audio playback");
        }

        public Builder setUsage(int i) {
            switch (i) {
                case 0:
                case 1:
                case 2:
                case 3:
                case 4:
                case 5:
                case 6:
                case 7:
                case 8:
                case 9:
                case 10:
                case 11:
                case 12:
                case 13:
                case 14:
                case 15:
                    this.f36100a = i;
                    break;
                case 16:
                    if (!AudioAttributesCompat.f36097c && Build.VERSION.SDK_INT > 25) {
                        this.f36100a = i;
                        break;
                    } else {
                        this.f36100a = 12;
                        break;
                    }
                default:
                    this.f36100a = 0;
                    break;
            }
            return this;
        }

        public Builder(AudioAttributesCompat audioAttributesCompat) {
            this.f36100a = 0;
            this.f36101b = 0;
            this.f36102c = 0;
            this.f36103d = -1;
            this.f36100a = audioAttributesCompat.getUsage();
            this.f36101b = audioAttributesCompat.getContentType();
            this.f36102c = audioAttributesCompat.getFlags();
            this.f36103d = audioAttributesCompat.m53979a();
        }
    }
}
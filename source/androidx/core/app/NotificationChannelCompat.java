package androidx.core.app;

import android.app.Notification;
import android.app.NotificationChannel;
import android.media.AudioAttributes;
import android.net.Uri;
import android.os.Build;
import android.provider.Settings;
import androidx.annotation.DoNotInline;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.core.util.Preconditions;

/* loaded from: classes2.dex */
public class NotificationChannelCompat {
    public static final String DEFAULT_CHANNEL_ID = "miscellaneous";

    /* renamed from: a */
    public final String f33488a;

    /* renamed from: b */
    public CharSequence f33489b;

    /* renamed from: c */
    public int f33490c;

    /* renamed from: d */
    public String f33491d;

    /* renamed from: e */
    public String f33492e;

    /* renamed from: f */
    public boolean f33493f;

    /* renamed from: g */
    public Uri f33494g;

    /* renamed from: h */
    public AudioAttributes f33495h;

    /* renamed from: i */
    public boolean f33496i;

    /* renamed from: j */
    public int f33497j;

    /* renamed from: k */
    public boolean f33498k;

    /* renamed from: l */
    public long[] f33499l;

    /* renamed from: m */
    public String f33500m;

    /* renamed from: n */
    public String f33501n;

    /* renamed from: o */
    public boolean f33502o;

    /* renamed from: p */
    public int f33503p;

    /* renamed from: q */
    public boolean f33504q;

    /* renamed from: r */
    public boolean f33505r;

    /* loaded from: classes2.dex */
    public static class Builder {

        /* renamed from: a */
        public final NotificationChannelCompat f33506a;

        public Builder(@NonNull String str, int i) {
            this.f33506a = new NotificationChannelCompat(str, i);
        }

        @NonNull
        public NotificationChannelCompat build() {
            return this.f33506a;
        }

        @NonNull
        public Builder setConversationId(@NonNull String str, @NonNull String str2) {
            if (Build.VERSION.SDK_INT >= 30) {
                NotificationChannelCompat notificationChannelCompat = this.f33506a;
                notificationChannelCompat.f33500m = str;
                notificationChannelCompat.f33501n = str2;
            }
            return this;
        }

        @NonNull
        public Builder setDescription(@Nullable String str) {
            this.f33506a.f33491d = str;
            return this;
        }

        @NonNull
        public Builder setGroup(@Nullable String str) {
            this.f33506a.f33492e = str;
            return this;
        }

        @NonNull
        public Builder setImportance(int i) {
            this.f33506a.f33490c = i;
            return this;
        }

        @NonNull
        public Builder setLightColor(int i) {
            this.f33506a.f33497j = i;
            return this;
        }

        @NonNull
        public Builder setLightsEnabled(boolean z) {
            this.f33506a.f33496i = z;
            return this;
        }

        @NonNull
        public Builder setName(@Nullable CharSequence charSequence) {
            this.f33506a.f33489b = charSequence;
            return this;
        }

        @NonNull
        public Builder setShowBadge(boolean z) {
            this.f33506a.f33493f = z;
            return this;
        }

        @NonNull
        public Builder setSound(@Nullable Uri uri, @Nullable AudioAttributes audioAttributes) {
            NotificationChannelCompat notificationChannelCompat = this.f33506a;
            notificationChannelCompat.f33494g = uri;
            notificationChannelCompat.f33495h = audioAttributes;
            return this;
        }

        @NonNull
        public Builder setVibrationEnabled(boolean z) {
            this.f33506a.f33498k = z;
            return this;
        }

        @NonNull
        public Builder setVibrationPattern(@Nullable long[] jArr) {
            boolean z;
            NotificationChannelCompat notificationChannelCompat = this.f33506a;
            if (jArr != null && jArr.length > 0) {
                z = true;
            } else {
                z = false;
            }
            notificationChannelCompat.f33498k = z;
            notificationChannelCompat.f33499l = jArr;
            return this;
        }
    }

    /* renamed from: androidx.core.app.NotificationChannelCompat$a */
    /* loaded from: classes2.dex */
    public static class C3853a {
        @DoNotInline
        /* renamed from: a */
        public static boolean m57897a(NotificationChannel notificationChannel) {
            return notificationChannel.canBypassDnd();
        }

        @DoNotInline
        /* renamed from: b */
        public static boolean m57896b(NotificationChannel notificationChannel) {
            return notificationChannel.canShowBadge();
        }

        @DoNotInline
        /* renamed from: c */
        public static NotificationChannel m57895c(String str, CharSequence charSequence, int i) {
            return new NotificationChannel(str, charSequence, i);
        }

        @DoNotInline
        /* renamed from: d */
        public static void m57894d(NotificationChannel notificationChannel, boolean z) {
            notificationChannel.enableLights(z);
        }

        @DoNotInline
        /* renamed from: e */
        public static void m57893e(NotificationChannel notificationChannel, boolean z) {
            notificationChannel.enableVibration(z);
        }

        @DoNotInline
        /* renamed from: f */
        public static AudioAttributes m57892f(NotificationChannel notificationChannel) {
            return notificationChannel.getAudioAttributes();
        }

        @DoNotInline
        /* renamed from: g */
        public static String m57891g(NotificationChannel notificationChannel) {
            return notificationChannel.getDescription();
        }

        @DoNotInline
        /* renamed from: h */
        public static String m57890h(NotificationChannel notificationChannel) {
            return notificationChannel.getGroup();
        }

        @DoNotInline
        /* renamed from: i */
        public static String m57889i(NotificationChannel notificationChannel) {
            return notificationChannel.getId();
        }

        @DoNotInline
        /* renamed from: j */
        public static int m57888j(NotificationChannel notificationChannel) {
            return notificationChannel.getImportance();
        }

        @DoNotInline
        /* renamed from: k */
        public static int m57887k(NotificationChannel notificationChannel) {
            return notificationChannel.getLightColor();
        }

        @DoNotInline
        /* renamed from: l */
        public static int m57886l(NotificationChannel notificationChannel) {
            return notificationChannel.getLockscreenVisibility();
        }

        @DoNotInline
        /* renamed from: m */
        public static CharSequence m57885m(NotificationChannel notificationChannel) {
            return notificationChannel.getName();
        }

        @DoNotInline
        /* renamed from: n */
        public static Uri m57884n(NotificationChannel notificationChannel) {
            return notificationChannel.getSound();
        }

        @DoNotInline
        /* renamed from: o */
        public static long[] m57883o(NotificationChannel notificationChannel) {
            return notificationChannel.getVibrationPattern();
        }

        @DoNotInline
        /* renamed from: p */
        public static void m57882p(NotificationChannel notificationChannel, String str) {
            notificationChannel.setDescription(str);
        }

        @DoNotInline
        /* renamed from: q */
        public static void m57881q(NotificationChannel notificationChannel, String str) {
            notificationChannel.setGroup(str);
        }

        @DoNotInline
        /* renamed from: r */
        public static void m57880r(NotificationChannel notificationChannel, int i) {
            notificationChannel.setLightColor(i);
        }

        @DoNotInline
        /* renamed from: s */
        public static void m57879s(NotificationChannel notificationChannel, boolean z) {
            notificationChannel.setShowBadge(z);
        }

        @DoNotInline
        /* renamed from: t */
        public static void m57878t(NotificationChannel notificationChannel, Uri uri, AudioAttributes audioAttributes) {
            notificationChannel.setSound(uri, audioAttributes);
        }

        @DoNotInline
        /* renamed from: u */
        public static void m57877u(NotificationChannel notificationChannel, long[] jArr) {
            notificationChannel.setVibrationPattern(jArr);
        }

        @DoNotInline
        /* renamed from: v */
        public static boolean m57876v(NotificationChannel notificationChannel) {
            return notificationChannel.shouldShowLights();
        }

        @DoNotInline
        /* renamed from: w */
        public static boolean m57875w(NotificationChannel notificationChannel) {
            return notificationChannel.shouldVibrate();
        }
    }

    /* renamed from: androidx.core.app.NotificationChannelCompat$b */
    /* loaded from: classes2.dex */
    public static class C3854b {
        @DoNotInline
        /* renamed from: a */
        public static boolean m57874a(NotificationChannel notificationChannel) {
            return notificationChannel.canBubble();
        }
    }

    /* renamed from: androidx.core.app.NotificationChannelCompat$c */
    /* loaded from: classes2.dex */
    public static class C3855c {
        @DoNotInline
        /* renamed from: a */
        public static String m57873a(NotificationChannel notificationChannel) {
            return notificationChannel.getConversationId();
        }

        @DoNotInline
        /* renamed from: b */
        public static String m57872b(NotificationChannel notificationChannel) {
            return notificationChannel.getParentChannelId();
        }

        @DoNotInline
        /* renamed from: c */
        public static boolean m57871c(NotificationChannel notificationChannel) {
            return notificationChannel.isImportantConversation();
        }

        @DoNotInline
        /* renamed from: d */
        public static void m57870d(NotificationChannel notificationChannel, String str, String str2) {
            notificationChannel.setConversationId(str, str2);
        }
    }

    public NotificationChannelCompat(String str, int i) {
        this.f33493f = true;
        this.f33494g = Settings.System.DEFAULT_NOTIFICATION_URI;
        this.f33497j = 0;
        this.f33488a = (String) Preconditions.checkNotNull(str);
        this.f33490c = i;
        this.f33495h = Notification.AUDIO_ATTRIBUTES_DEFAULT;
    }

    /* renamed from: a */
    public NotificationChannel m57898a() {
        String str;
        String str2;
        int i = Build.VERSION.SDK_INT;
        if (i < 26) {
            return null;
        }
        NotificationChannel m57895c = C3853a.m57895c(this.f33488a, this.f33489b, this.f33490c);
        C3853a.m57882p(m57895c, this.f33491d);
        C3853a.m57881q(m57895c, this.f33492e);
        C3853a.m57879s(m57895c, this.f33493f);
        C3853a.m57878t(m57895c, this.f33494g, this.f33495h);
        C3853a.m57894d(m57895c, this.f33496i);
        C3853a.m57880r(m57895c, this.f33497j);
        C3853a.m57877u(m57895c, this.f33499l);
        C3853a.m57893e(m57895c, this.f33498k);
        if (i >= 30 && (str = this.f33500m) != null && (str2 = this.f33501n) != null) {
            C3855c.m57870d(m57895c, str, str2);
        }
        return m57895c;
    }

    public boolean canBubble() {
        return this.f33504q;
    }

    public boolean canBypassDnd() {
        return this.f33502o;
    }

    public boolean canShowBadge() {
        return this.f33493f;
    }

    @Nullable
    public AudioAttributes getAudioAttributes() {
        return this.f33495h;
    }

    @Nullable
    public String getConversationId() {
        return this.f33501n;
    }

    @Nullable
    public String getDescription() {
        return this.f33491d;
    }

    @Nullable
    public String getGroup() {
        return this.f33492e;
    }

    @NonNull
    public String getId() {
        return this.f33488a;
    }

    public int getImportance() {
        return this.f33490c;
    }

    public int getLightColor() {
        return this.f33497j;
    }

    public int getLockscreenVisibility() {
        return this.f33503p;
    }

    @Nullable
    public CharSequence getName() {
        return this.f33489b;
    }

    @Nullable
    public String getParentChannelId() {
        return this.f33500m;
    }

    @Nullable
    public Uri getSound() {
        return this.f33494g;
    }

    @Nullable
    public long[] getVibrationPattern() {
        return this.f33499l;
    }

    public boolean isImportantConversation() {
        return this.f33505r;
    }

    public boolean shouldShowLights() {
        return this.f33496i;
    }

    public boolean shouldVibrate() {
        return this.f33498k;
    }

    @NonNull
    public Builder toBuilder() {
        return new Builder(this.f33488a, this.f33490c).setName(this.f33489b).setDescription(this.f33491d).setGroup(this.f33492e).setShowBadge(this.f33493f).setSound(this.f33494g, this.f33495h).setLightsEnabled(this.f33496i).setLightColor(this.f33497j).setVibrationEnabled(this.f33498k).setVibrationPattern(this.f33499l).setConversationId(this.f33500m, this.f33501n);
    }

    public NotificationChannelCompat(NotificationChannel notificationChannel) {
        this(C3853a.m57889i(notificationChannel), C3853a.m57888j(notificationChannel));
        this.f33489b = C3853a.m57885m(notificationChannel);
        this.f33491d = C3853a.m57891g(notificationChannel);
        this.f33492e = C3853a.m57890h(notificationChannel);
        this.f33493f = C3853a.m57896b(notificationChannel);
        this.f33494g = C3853a.m57884n(notificationChannel);
        this.f33495h = C3853a.m57892f(notificationChannel);
        this.f33496i = C3853a.m57876v(notificationChannel);
        this.f33497j = C3853a.m57887k(notificationChannel);
        this.f33498k = C3853a.m57875w(notificationChannel);
        this.f33499l = C3853a.m57883o(notificationChannel);
        int i = Build.VERSION.SDK_INT;
        if (i >= 30) {
            this.f33500m = C3855c.m57872b(notificationChannel);
            this.f33501n = C3855c.m57873a(notificationChannel);
        }
        this.f33502o = C3853a.m57897a(notificationChannel);
        this.f33503p = C3853a.m57886l(notificationChannel);
        if (i >= 29) {
            this.f33504q = C3854b.m57874a(notificationChannel);
        }
        if (i >= 30) {
            this.f33505r = C3855c.m57871c(notificationChannel);
        }
    }
}

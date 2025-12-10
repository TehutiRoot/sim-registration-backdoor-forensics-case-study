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
    public final String f33576a;

    /* renamed from: b */
    public CharSequence f33577b;

    /* renamed from: c */
    public int f33578c;

    /* renamed from: d */
    public String f33579d;

    /* renamed from: e */
    public String f33580e;

    /* renamed from: f */
    public boolean f33581f;

    /* renamed from: g */
    public Uri f33582g;

    /* renamed from: h */
    public AudioAttributes f33583h;

    /* renamed from: i */
    public boolean f33584i;

    /* renamed from: j */
    public int f33585j;

    /* renamed from: k */
    public boolean f33586k;

    /* renamed from: l */
    public long[] f33587l;

    /* renamed from: m */
    public String f33588m;

    /* renamed from: n */
    public String f33589n;

    /* renamed from: o */
    public boolean f33590o;

    /* renamed from: p */
    public int f33591p;

    /* renamed from: q */
    public boolean f33592q;

    /* renamed from: r */
    public boolean f33593r;

    /* loaded from: classes2.dex */
    public static class Builder {

        /* renamed from: a */
        public final NotificationChannelCompat f33594a;

        public Builder(@NonNull String str, int i) {
            this.f33594a = new NotificationChannelCompat(str, i);
        }

        @NonNull
        public NotificationChannelCompat build() {
            return this.f33594a;
        }

        @NonNull
        public Builder setConversationId(@NonNull String str, @NonNull String str2) {
            if (Build.VERSION.SDK_INT >= 30) {
                NotificationChannelCompat notificationChannelCompat = this.f33594a;
                notificationChannelCompat.f33588m = str;
                notificationChannelCompat.f33589n = str2;
            }
            return this;
        }

        @NonNull
        public Builder setDescription(@Nullable String str) {
            this.f33594a.f33579d = str;
            return this;
        }

        @NonNull
        public Builder setGroup(@Nullable String str) {
            this.f33594a.f33580e = str;
            return this;
        }

        @NonNull
        public Builder setImportance(int i) {
            this.f33594a.f33578c = i;
            return this;
        }

        @NonNull
        public Builder setLightColor(int i) {
            this.f33594a.f33585j = i;
            return this;
        }

        @NonNull
        public Builder setLightsEnabled(boolean z) {
            this.f33594a.f33584i = z;
            return this;
        }

        @NonNull
        public Builder setName(@Nullable CharSequence charSequence) {
            this.f33594a.f33577b = charSequence;
            return this;
        }

        @NonNull
        public Builder setShowBadge(boolean z) {
            this.f33594a.f33581f = z;
            return this;
        }

        @NonNull
        public Builder setSound(@Nullable Uri uri, @Nullable AudioAttributes audioAttributes) {
            NotificationChannelCompat notificationChannelCompat = this.f33594a;
            notificationChannelCompat.f33582g = uri;
            notificationChannelCompat.f33583h = audioAttributes;
            return this;
        }

        @NonNull
        public Builder setVibrationEnabled(boolean z) {
            this.f33594a.f33586k = z;
            return this;
        }

        @NonNull
        public Builder setVibrationPattern(@Nullable long[] jArr) {
            boolean z;
            NotificationChannelCompat notificationChannelCompat = this.f33594a;
            if (jArr != null && jArr.length > 0) {
                z = true;
            } else {
                z = false;
            }
            notificationChannelCompat.f33586k = z;
            notificationChannelCompat.f33587l = jArr;
            return this;
        }
    }

    /* renamed from: androidx.core.app.NotificationChannelCompat$a */
    /* loaded from: classes2.dex */
    public static class C3835a {
        @DoNotInline
        /* renamed from: a */
        public static boolean m57847a(NotificationChannel notificationChannel) {
            return notificationChannel.canBypassDnd();
        }

        @DoNotInline
        /* renamed from: b */
        public static boolean m57846b(NotificationChannel notificationChannel) {
            return notificationChannel.canShowBadge();
        }

        @DoNotInline
        /* renamed from: c */
        public static NotificationChannel m57845c(String str, CharSequence charSequence, int i) {
            return new NotificationChannel(str, charSequence, i);
        }

        @DoNotInline
        /* renamed from: d */
        public static void m57844d(NotificationChannel notificationChannel, boolean z) {
            notificationChannel.enableLights(z);
        }

        @DoNotInline
        /* renamed from: e */
        public static void m57843e(NotificationChannel notificationChannel, boolean z) {
            notificationChannel.enableVibration(z);
        }

        @DoNotInline
        /* renamed from: f */
        public static AudioAttributes m57842f(NotificationChannel notificationChannel) {
            return notificationChannel.getAudioAttributes();
        }

        @DoNotInline
        /* renamed from: g */
        public static String m57841g(NotificationChannel notificationChannel) {
            return notificationChannel.getDescription();
        }

        @DoNotInline
        /* renamed from: h */
        public static String m57840h(NotificationChannel notificationChannel) {
            return notificationChannel.getGroup();
        }

        @DoNotInline
        /* renamed from: i */
        public static String m57839i(NotificationChannel notificationChannel) {
            return notificationChannel.getId();
        }

        @DoNotInline
        /* renamed from: j */
        public static int m57838j(NotificationChannel notificationChannel) {
            return notificationChannel.getImportance();
        }

        @DoNotInline
        /* renamed from: k */
        public static int m57837k(NotificationChannel notificationChannel) {
            return notificationChannel.getLightColor();
        }

        @DoNotInline
        /* renamed from: l */
        public static int m57836l(NotificationChannel notificationChannel) {
            return notificationChannel.getLockscreenVisibility();
        }

        @DoNotInline
        /* renamed from: m */
        public static CharSequence m57835m(NotificationChannel notificationChannel) {
            return notificationChannel.getName();
        }

        @DoNotInline
        /* renamed from: n */
        public static Uri m57834n(NotificationChannel notificationChannel) {
            return notificationChannel.getSound();
        }

        @DoNotInline
        /* renamed from: o */
        public static long[] m57833o(NotificationChannel notificationChannel) {
            return notificationChannel.getVibrationPattern();
        }

        @DoNotInline
        /* renamed from: p */
        public static void m57832p(NotificationChannel notificationChannel, String str) {
            notificationChannel.setDescription(str);
        }

        @DoNotInline
        /* renamed from: q */
        public static void m57831q(NotificationChannel notificationChannel, String str) {
            notificationChannel.setGroup(str);
        }

        @DoNotInline
        /* renamed from: r */
        public static void m57830r(NotificationChannel notificationChannel, int i) {
            notificationChannel.setLightColor(i);
        }

        @DoNotInline
        /* renamed from: s */
        public static void m57829s(NotificationChannel notificationChannel, boolean z) {
            notificationChannel.setShowBadge(z);
        }

        @DoNotInline
        /* renamed from: t */
        public static void m57828t(NotificationChannel notificationChannel, Uri uri, AudioAttributes audioAttributes) {
            notificationChannel.setSound(uri, audioAttributes);
        }

        @DoNotInline
        /* renamed from: u */
        public static void m57827u(NotificationChannel notificationChannel, long[] jArr) {
            notificationChannel.setVibrationPattern(jArr);
        }

        @DoNotInline
        /* renamed from: v */
        public static boolean m57826v(NotificationChannel notificationChannel) {
            return notificationChannel.shouldShowLights();
        }

        @DoNotInline
        /* renamed from: w */
        public static boolean m57825w(NotificationChannel notificationChannel) {
            return notificationChannel.shouldVibrate();
        }
    }

    /* renamed from: androidx.core.app.NotificationChannelCompat$b */
    /* loaded from: classes2.dex */
    public static class C3836b {
        @DoNotInline
        /* renamed from: a */
        public static boolean m57824a(NotificationChannel notificationChannel) {
            return notificationChannel.canBubble();
        }
    }

    /* renamed from: androidx.core.app.NotificationChannelCompat$c */
    /* loaded from: classes2.dex */
    public static class C3837c {
        @DoNotInline
        /* renamed from: a */
        public static String m57823a(NotificationChannel notificationChannel) {
            return notificationChannel.getConversationId();
        }

        @DoNotInline
        /* renamed from: b */
        public static String m57822b(NotificationChannel notificationChannel) {
            return notificationChannel.getParentChannelId();
        }

        @DoNotInline
        /* renamed from: c */
        public static boolean m57821c(NotificationChannel notificationChannel) {
            return notificationChannel.isImportantConversation();
        }

        @DoNotInline
        /* renamed from: d */
        public static void m57820d(NotificationChannel notificationChannel, String str, String str2) {
            notificationChannel.setConversationId(str, str2);
        }
    }

    public NotificationChannelCompat(String str, int i) {
        this.f33581f = true;
        this.f33582g = Settings.System.DEFAULT_NOTIFICATION_URI;
        this.f33585j = 0;
        this.f33576a = (String) Preconditions.checkNotNull(str);
        this.f33578c = i;
        this.f33583h = Notification.AUDIO_ATTRIBUTES_DEFAULT;
    }

    /* renamed from: a */
    public NotificationChannel m57848a() {
        String str;
        String str2;
        int i = Build.VERSION.SDK_INT;
        if (i < 26) {
            return null;
        }
        NotificationChannel m57845c = C3835a.m57845c(this.f33576a, this.f33577b, this.f33578c);
        C3835a.m57832p(m57845c, this.f33579d);
        C3835a.m57831q(m57845c, this.f33580e);
        C3835a.m57829s(m57845c, this.f33581f);
        C3835a.m57828t(m57845c, this.f33582g, this.f33583h);
        C3835a.m57844d(m57845c, this.f33584i);
        C3835a.m57830r(m57845c, this.f33585j);
        C3835a.m57827u(m57845c, this.f33587l);
        C3835a.m57843e(m57845c, this.f33586k);
        if (i >= 30 && (str = this.f33588m) != null && (str2 = this.f33589n) != null) {
            C3837c.m57820d(m57845c, str, str2);
        }
        return m57845c;
    }

    public boolean canBubble() {
        return this.f33592q;
    }

    public boolean canBypassDnd() {
        return this.f33590o;
    }

    public boolean canShowBadge() {
        return this.f33581f;
    }

    @Nullable
    public AudioAttributes getAudioAttributes() {
        return this.f33583h;
    }

    @Nullable
    public String getConversationId() {
        return this.f33589n;
    }

    @Nullable
    public String getDescription() {
        return this.f33579d;
    }

    @Nullable
    public String getGroup() {
        return this.f33580e;
    }

    @NonNull
    public String getId() {
        return this.f33576a;
    }

    public int getImportance() {
        return this.f33578c;
    }

    public int getLightColor() {
        return this.f33585j;
    }

    public int getLockscreenVisibility() {
        return this.f33591p;
    }

    @Nullable
    public CharSequence getName() {
        return this.f33577b;
    }

    @Nullable
    public String getParentChannelId() {
        return this.f33588m;
    }

    @Nullable
    public Uri getSound() {
        return this.f33582g;
    }

    @Nullable
    public long[] getVibrationPattern() {
        return this.f33587l;
    }

    public boolean isImportantConversation() {
        return this.f33593r;
    }

    public boolean shouldShowLights() {
        return this.f33584i;
    }

    public boolean shouldVibrate() {
        return this.f33586k;
    }

    @NonNull
    public Builder toBuilder() {
        return new Builder(this.f33576a, this.f33578c).setName(this.f33577b).setDescription(this.f33579d).setGroup(this.f33580e).setShowBadge(this.f33581f).setSound(this.f33582g, this.f33583h).setLightsEnabled(this.f33584i).setLightColor(this.f33585j).setVibrationEnabled(this.f33586k).setVibrationPattern(this.f33587l).setConversationId(this.f33588m, this.f33589n);
    }

    public NotificationChannelCompat(NotificationChannel notificationChannel) {
        this(C3835a.m57839i(notificationChannel), C3835a.m57838j(notificationChannel));
        this.f33577b = C3835a.m57835m(notificationChannel);
        this.f33579d = C3835a.m57841g(notificationChannel);
        this.f33580e = C3835a.m57840h(notificationChannel);
        this.f33581f = C3835a.m57846b(notificationChannel);
        this.f33582g = C3835a.m57834n(notificationChannel);
        this.f33583h = C3835a.m57842f(notificationChannel);
        this.f33584i = C3835a.m57826v(notificationChannel);
        this.f33585j = C3835a.m57837k(notificationChannel);
        this.f33586k = C3835a.m57825w(notificationChannel);
        this.f33587l = C3835a.m57833o(notificationChannel);
        int i = Build.VERSION.SDK_INT;
        if (i >= 30) {
            this.f33588m = C3837c.m57822b(notificationChannel);
            this.f33589n = C3837c.m57823a(notificationChannel);
        }
        this.f33590o = C3835a.m57847a(notificationChannel);
        this.f33591p = C3835a.m57836l(notificationChannel);
        if (i >= 29) {
            this.f33592q = C3836b.m57824a(notificationChannel);
        }
        if (i >= 30) {
            this.f33593r = C3837c.m57821c(notificationChannel);
        }
    }
}
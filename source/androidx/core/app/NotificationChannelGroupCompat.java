package androidx.core.app;

import android.app.NotificationChannel;
import android.app.NotificationChannelGroup;
import android.os.Build;
import androidx.annotation.DoNotInline;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.core.util.Preconditions;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

/* loaded from: classes2.dex */
public class NotificationChannelGroupCompat {

    /* renamed from: a */
    public final String f33507a;

    /* renamed from: b */
    public CharSequence f33508b;

    /* renamed from: c */
    public String f33509c;

    /* renamed from: d */
    public boolean f33510d;

    /* renamed from: e */
    public List f33511e;

    /* loaded from: classes2.dex */
    public static class Builder {

        /* renamed from: a */
        public final NotificationChannelGroupCompat f33512a;

        public Builder(@NonNull String str) {
            this.f33512a = new NotificationChannelGroupCompat(str);
        }

        @NonNull
        public NotificationChannelGroupCompat build() {
            return this.f33512a;
        }

        @NonNull
        public Builder setDescription(@Nullable String str) {
            this.f33512a.f33509c = str;
            return this;
        }

        @NonNull
        public Builder setName(@Nullable CharSequence charSequence) {
            this.f33512a.f33508b = charSequence;
            return this;
        }
    }

    /* renamed from: androidx.core.app.NotificationChannelGroupCompat$a */
    /* loaded from: classes2.dex */
    public static class C3856a {
        @DoNotInline
        /* renamed from: a */
        public static NotificationChannelGroup m57867a(String str, CharSequence charSequence) {
            return new NotificationChannelGroup(str, charSequence);
        }

        @DoNotInline
        /* renamed from: b */
        public static List<NotificationChannel> m57866b(NotificationChannelGroup notificationChannelGroup) {
            return notificationChannelGroup.getChannels();
        }

        @DoNotInline
        /* renamed from: c */
        public static String m57865c(NotificationChannel notificationChannel) {
            return notificationChannel.getGroup();
        }

        @DoNotInline
        /* renamed from: d */
        public static String m57864d(NotificationChannelGroup notificationChannelGroup) {
            return notificationChannelGroup.getId();
        }

        @DoNotInline
        /* renamed from: e */
        public static CharSequence m57863e(NotificationChannelGroup notificationChannelGroup) {
            return notificationChannelGroup.getName();
        }
    }

    /* renamed from: androidx.core.app.NotificationChannelGroupCompat$b */
    /* loaded from: classes2.dex */
    public static class C3857b {
        @DoNotInline
        /* renamed from: a */
        public static String m57862a(NotificationChannelGroup notificationChannelGroup) {
            return notificationChannelGroup.getDescription();
        }

        @DoNotInline
        /* renamed from: b */
        public static boolean m57861b(NotificationChannelGroup notificationChannelGroup) {
            return notificationChannelGroup.isBlocked();
        }

        @DoNotInline
        /* renamed from: c */
        public static void m57860c(NotificationChannelGroup notificationChannelGroup, String str) {
            notificationChannelGroup.setDescription(str);
        }
    }

    public NotificationChannelGroupCompat(String str) {
        this.f33511e = Collections.emptyList();
        this.f33507a = (String) Preconditions.checkNotNull(str);
    }

    /* renamed from: a */
    public final List m57869a(List list) {
        ArrayList arrayList = new ArrayList();
        for (Object obj : list) {
            NotificationChannel m65874a = VI0.m65874a(obj);
            if (this.f33507a.equals(C3856a.m57865c(m65874a))) {
                arrayList.add(new NotificationChannelCompat(m65874a));
            }
        }
        return arrayList;
    }

    /* renamed from: b */
    public NotificationChannelGroup m57868b() {
        int i = Build.VERSION.SDK_INT;
        if (i < 26) {
            return null;
        }
        NotificationChannelGroup m57867a = C3856a.m57867a(this.f33507a, this.f33508b);
        if (i >= 28) {
            C3857b.m57860c(m57867a, this.f33509c);
        }
        return m57867a;
    }

    @NonNull
    public List<NotificationChannelCompat> getChannels() {
        return this.f33511e;
    }

    @Nullable
    public String getDescription() {
        return this.f33509c;
    }

    @NonNull
    public String getId() {
        return this.f33507a;
    }

    @Nullable
    public CharSequence getName() {
        return this.f33508b;
    }

    public boolean isBlocked() {
        return this.f33510d;
    }

    @NonNull
    public Builder toBuilder() {
        return new Builder(this.f33507a).setName(this.f33508b).setDescription(this.f33509c);
    }

    public NotificationChannelGroupCompat(NotificationChannelGroup notificationChannelGroup) {
        this(notificationChannelGroup, Collections.emptyList());
    }

    public NotificationChannelGroupCompat(NotificationChannelGroup notificationChannelGroup, List list) {
        this(C3856a.m57864d(notificationChannelGroup));
        this.f33508b = C3856a.m57863e(notificationChannelGroup);
        int i = Build.VERSION.SDK_INT;
        if (i >= 28) {
            this.f33509c = C3857b.m57862a(notificationChannelGroup);
        }
        if (i >= 28) {
            this.f33510d = C3857b.m57861b(notificationChannelGroup);
            this.f33511e = m57869a(C3856a.m57866b(notificationChannelGroup));
            return;
        }
        this.f33511e = m57869a(list);
    }
}

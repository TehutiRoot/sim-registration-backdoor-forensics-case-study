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
    public final String f33595a;

    /* renamed from: b */
    public CharSequence f33596b;

    /* renamed from: c */
    public String f33597c;

    /* renamed from: d */
    public boolean f33598d;

    /* renamed from: e */
    public List f33599e;

    /* loaded from: classes2.dex */
    public static class Builder {

        /* renamed from: a */
        public final NotificationChannelGroupCompat f33600a;

        public Builder(@NonNull String str) {
            this.f33600a = new NotificationChannelGroupCompat(str);
        }

        @NonNull
        public NotificationChannelGroupCompat build() {
            return this.f33600a;
        }

        @NonNull
        public Builder setDescription(@Nullable String str) {
            this.f33600a.f33597c = str;
            return this;
        }

        @NonNull
        public Builder setName(@Nullable CharSequence charSequence) {
            this.f33600a.f33596b = charSequence;
            return this;
        }
    }

    /* renamed from: androidx.core.app.NotificationChannelGroupCompat$a */
    /* loaded from: classes2.dex */
    public static class C3838a {
        @DoNotInline
        /* renamed from: a */
        public static NotificationChannelGroup m57817a(String str, CharSequence charSequence) {
            return new NotificationChannelGroup(str, charSequence);
        }

        @DoNotInline
        /* renamed from: b */
        public static List<NotificationChannel> m57816b(NotificationChannelGroup notificationChannelGroup) {
            return notificationChannelGroup.getChannels();
        }

        @DoNotInline
        /* renamed from: c */
        public static String m57815c(NotificationChannel notificationChannel) {
            return notificationChannel.getGroup();
        }

        @DoNotInline
        /* renamed from: d */
        public static String m57814d(NotificationChannelGroup notificationChannelGroup) {
            return notificationChannelGroup.getId();
        }

        @DoNotInline
        /* renamed from: e */
        public static CharSequence m57813e(NotificationChannelGroup notificationChannelGroup) {
            return notificationChannelGroup.getName();
        }
    }

    /* renamed from: androidx.core.app.NotificationChannelGroupCompat$b */
    /* loaded from: classes2.dex */
    public static class C3839b {
        @DoNotInline
        /* renamed from: a */
        public static String m57812a(NotificationChannelGroup notificationChannelGroup) {
            return notificationChannelGroup.getDescription();
        }

        @DoNotInline
        /* renamed from: b */
        public static boolean m57811b(NotificationChannelGroup notificationChannelGroup) {
            return notificationChannelGroup.isBlocked();
        }

        @DoNotInline
        /* renamed from: c */
        public static void m57810c(NotificationChannelGroup notificationChannelGroup, String str) {
            notificationChannelGroup.setDescription(str);
        }
    }

    public NotificationChannelGroupCompat(String str) {
        this.f33599e = Collections.emptyList();
        this.f33595a = (String) Preconditions.checkNotNull(str);
    }

    /* renamed from: a */
    public final List m57819a(List list) {
        ArrayList arrayList = new ArrayList();
        for (Object obj : list) {
            NotificationChannel m51962a = AbstractC19207bJ0.m51962a(obj);
            if (this.f33595a.equals(C3838a.m57815c(m51962a))) {
                arrayList.add(new NotificationChannelCompat(m51962a));
            }
        }
        return arrayList;
    }

    /* renamed from: b */
    public NotificationChannelGroup m57818b() {
        int i = Build.VERSION.SDK_INT;
        if (i < 26) {
            return null;
        }
        NotificationChannelGroup m57817a = C3838a.m57817a(this.f33595a, this.f33596b);
        if (i >= 28) {
            C3839b.m57810c(m57817a, this.f33597c);
        }
        return m57817a;
    }

    @NonNull
    public List<NotificationChannelCompat> getChannels() {
        return this.f33599e;
    }

    @Nullable
    public String getDescription() {
        return this.f33597c;
    }

    @NonNull
    public String getId() {
        return this.f33595a;
    }

    @Nullable
    public CharSequence getName() {
        return this.f33596b;
    }

    public boolean isBlocked() {
        return this.f33598d;
    }

    @NonNull
    public Builder toBuilder() {
        return new Builder(this.f33595a).setName(this.f33596b).setDescription(this.f33597c);
    }

    public NotificationChannelGroupCompat(NotificationChannelGroup notificationChannelGroup) {
        this(notificationChannelGroup, Collections.emptyList());
    }

    public NotificationChannelGroupCompat(NotificationChannelGroup notificationChannelGroup, List list) {
        this(C3838a.m57814d(notificationChannelGroup));
        this.f33596b = C3838a.m57813e(notificationChannelGroup);
        int i = Build.VERSION.SDK_INT;
        if (i >= 28) {
            this.f33597c = C3839b.m57812a(notificationChannelGroup);
        }
        if (i >= 28) {
            this.f33598d = C3839b.m57811b(notificationChannelGroup);
            this.f33599e = m57819a(C3838a.m57816b(notificationChannelGroup));
            return;
        }
        this.f33599e = m57819a(list);
    }
}
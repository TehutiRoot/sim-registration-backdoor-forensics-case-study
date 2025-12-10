package androidx.core.app;

import android.app.Notification;
import android.app.PendingIntent;
import android.content.Context;
import android.content.LocusId;
import android.graphics.drawable.Icon;
import android.media.AudioAttributes;
import android.net.Uri;
import android.os.Build;
import android.os.Bundle;
import android.text.TextUtils;
import android.widget.RemoteViews;
import androidx.annotation.DoNotInline;
import androidx.collection.ArraySet;
import androidx.core.app.NotificationCompat;
import androidx.core.content.LocusIdCompat;
import androidx.core.graphics.drawable.IconCompat;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

/* renamed from: androidx.core.app.a */
/* loaded from: classes2.dex */
public class C3929a implements NotificationBuilderWithBuilderAccessor {

    /* renamed from: a */
    public final Context f33722a;

    /* renamed from: b */
    public final Notification.Builder f33723b;

    /* renamed from: c */
    public final NotificationCompat.Builder f33724c;

    /* renamed from: d */
    public RemoteViews f33725d;

    /* renamed from: e */
    public RemoteViews f33726e;

    /* renamed from: f */
    public final List f33727f = new ArrayList();

    /* renamed from: g */
    public final Bundle f33728g = new Bundle();

    /* renamed from: h */
    public int f33729h;

    /* renamed from: i */
    public RemoteViews f33730i;

    /* renamed from: androidx.core.app.a$a */
    /* loaded from: classes2.dex */
    public static class C3930a {
        @DoNotInline
        /* renamed from: a */
        public static Notification m57610a(Notification.Builder builder) {
            return builder.build();
        }

        @DoNotInline
        /* renamed from: b */
        public static Notification.Builder m57609b(Notification.Builder builder, int i) {
            return builder.setPriority(i);
        }

        @DoNotInline
        /* renamed from: c */
        public static Notification.Builder m57608c(Notification.Builder builder, CharSequence charSequence) {
            return builder.setSubText(charSequence);
        }

        @DoNotInline
        /* renamed from: d */
        public static Notification.Builder m57607d(Notification.Builder builder, boolean z) {
            return builder.setUsesChronometer(z);
        }
    }

    /* renamed from: androidx.core.app.a$b */
    /* loaded from: classes2.dex */
    public static class C3931b {
        @DoNotInline
        /* renamed from: a */
        public static Notification.Builder m57606a(Notification.Builder builder, boolean z) {
            return builder.setShowWhen(z);
        }
    }

    /* renamed from: androidx.core.app.a$c */
    /* loaded from: classes2.dex */
    public static class C3932c {
        @DoNotInline
        /* renamed from: a */
        public static Notification.Builder m57605a(Notification.Builder builder, Bundle bundle) {
            return builder.setExtras(bundle);
        }
    }

    /* renamed from: androidx.core.app.a$d */
    /* loaded from: classes2.dex */
    public static class C3933d {
        @DoNotInline
        /* renamed from: a */
        public static Notification.Builder m57604a(Notification.Builder builder, Notification.Action action) {
            return builder.addAction(action);
        }

        @DoNotInline
        /* renamed from: b */
        public static Notification.Action.Builder m57603b(Notification.Action.Builder builder, Bundle bundle) {
            return builder.addExtras(bundle);
        }

        @DoNotInline
        /* renamed from: c */
        public static Notification.Action.Builder m57602c(Notification.Action.Builder builder, android.app.RemoteInput remoteInput) {
            return builder.addRemoteInput(remoteInput);
        }

        @DoNotInline
        /* renamed from: d */
        public static Notification.Action m57601d(Notification.Action.Builder builder) {
            return builder.build();
        }

        @DoNotInline
        /* renamed from: e */
        public static Notification.Action.Builder m57600e(int i, CharSequence charSequence, PendingIntent pendingIntent) {
            return new Notification.Action.Builder(i, charSequence, pendingIntent);
        }

        @DoNotInline
        /* renamed from: f */
        public static String m57599f(Notification notification) {
            return notification.getGroup();
        }

        @DoNotInline
        /* renamed from: g */
        public static Notification.Builder m57598g(Notification.Builder builder, String str) {
            return builder.setGroup(str);
        }

        @DoNotInline
        /* renamed from: h */
        public static Notification.Builder m57597h(Notification.Builder builder, boolean z) {
            return builder.setGroupSummary(z);
        }

        @DoNotInline
        /* renamed from: i */
        public static Notification.Builder m57596i(Notification.Builder builder, boolean z) {
            return builder.setLocalOnly(z);
        }

        @DoNotInline
        /* renamed from: j */
        public static Notification.Builder m57595j(Notification.Builder builder, String str) {
            return builder.setSortKey(str);
        }
    }

    /* renamed from: androidx.core.app.a$e */
    /* loaded from: classes2.dex */
    public static class C3934e {
        @DoNotInline
        /* renamed from: a */
        public static Notification.Builder m57594a(Notification.Builder builder, String str) {
            return builder.addPerson(str);
        }

        @DoNotInline
        /* renamed from: b */
        public static Notification.Builder m57593b(Notification.Builder builder, String str) {
            return builder.setCategory(str);
        }

        @DoNotInline
        /* renamed from: c */
        public static Notification.Builder m57592c(Notification.Builder builder, int i) {
            return builder.setColor(i);
        }

        @DoNotInline
        /* renamed from: d */
        public static Notification.Builder m57591d(Notification.Builder builder, Notification notification) {
            return builder.setPublicVersion(notification);
        }

        @DoNotInline
        /* renamed from: e */
        public static Notification.Builder m57590e(Notification.Builder builder, Uri uri, Object obj) {
            return builder.setSound(uri, (AudioAttributes) obj);
        }

        @DoNotInline
        /* renamed from: f */
        public static Notification.Builder m57589f(Notification.Builder builder, int i) {
            return builder.setVisibility(i);
        }
    }

    /* renamed from: androidx.core.app.a$f */
    /* loaded from: classes2.dex */
    public static class C3935f {
        @DoNotInline
        /* renamed from: a */
        public static Notification.Action.Builder m57588a(Icon icon, CharSequence charSequence, PendingIntent pendingIntent) {
            return new Notification.Action.Builder(icon, charSequence, pendingIntent);
        }

        @DoNotInline
        /* renamed from: b */
        public static Notification.Builder m57587b(Notification.Builder builder, Object obj) {
            return builder.setSmallIcon((Icon) obj);
        }
    }

    /* renamed from: androidx.core.app.a$g */
    /* loaded from: classes2.dex */
    public static class C3936g {
        @DoNotInline
        /* renamed from: a */
        public static Notification.Action.Builder m57586a(Notification.Action.Builder builder, boolean z) {
            return builder.setAllowGeneratedReplies(z);
        }

        @DoNotInline
        /* renamed from: b */
        public static Notification.Builder m57585b(Notification.Builder builder, RemoteViews remoteViews) {
            return builder.setCustomBigContentView(remoteViews);
        }

        @DoNotInline
        /* renamed from: c */
        public static Notification.Builder m57584c(Notification.Builder builder, RemoteViews remoteViews) {
            return builder.setCustomContentView(remoteViews);
        }

        @DoNotInline
        /* renamed from: d */
        public static Notification.Builder m57583d(Notification.Builder builder, RemoteViews remoteViews) {
            return builder.setCustomHeadsUpContentView(remoteViews);
        }

        @DoNotInline
        /* renamed from: e */
        public static Notification.Builder m57582e(Notification.Builder builder, CharSequence[] charSequenceArr) {
            return builder.setRemoteInputHistory(charSequenceArr);
        }
    }

    /* renamed from: androidx.core.app.a$h */
    /* loaded from: classes2.dex */
    public static class C3937h {
        @DoNotInline
        /* renamed from: a */
        public static Notification.Builder m57581a(Context context, String str) {
            return new Notification.Builder(context, str);
        }

        @DoNotInline
        /* renamed from: b */
        public static Notification.Builder m57580b(Notification.Builder builder, int i) {
            return builder.setBadgeIconType(i);
        }

        @DoNotInline
        /* renamed from: c */
        public static Notification.Builder m57579c(Notification.Builder builder, boolean z) {
            return builder.setColorized(z);
        }

        @DoNotInline
        /* renamed from: d */
        public static Notification.Builder m57578d(Notification.Builder builder, int i) {
            return builder.setGroupAlertBehavior(i);
        }

        @DoNotInline
        /* renamed from: e */
        public static Notification.Builder m57577e(Notification.Builder builder, CharSequence charSequence) {
            return builder.setSettingsText(charSequence);
        }

        @DoNotInline
        /* renamed from: f */
        public static Notification.Builder m57576f(Notification.Builder builder, String str) {
            return builder.setShortcutId(str);
        }

        @DoNotInline
        /* renamed from: g */
        public static Notification.Builder m57575g(Notification.Builder builder, long j) {
            return builder.setTimeoutAfter(j);
        }
    }

    /* renamed from: androidx.core.app.a$i */
    /* loaded from: classes2.dex */
    public static class C3938i {
        @DoNotInline
        /* renamed from: a */
        public static Notification.Builder m57574a(Notification.Builder builder, android.app.Person person) {
            return builder.addPerson(person);
        }

        @DoNotInline
        /* renamed from: b */
        public static Notification.Action.Builder m57573b(Notification.Action.Builder builder, int i) {
            return builder.setSemanticAction(i);
        }
    }

    /* renamed from: androidx.core.app.a$j */
    /* loaded from: classes2.dex */
    public static class C3939j {
        @DoNotInline
        /* renamed from: a */
        public static Notification.Builder m57572a(Notification.Builder builder, boolean z) {
            return builder.setAllowSystemGeneratedContextualActions(z);
        }

        @DoNotInline
        /* renamed from: b */
        public static Notification.Builder m57571b(Notification.Builder builder, Notification.BubbleMetadata bubbleMetadata) {
            return builder.setBubbleMetadata(bubbleMetadata);
        }

        @DoNotInline
        /* renamed from: c */
        public static Notification.Action.Builder m57570c(Notification.Action.Builder builder, boolean z) {
            return builder.setContextual(z);
        }

        @DoNotInline
        /* renamed from: d */
        public static Notification.Builder m57569d(Notification.Builder builder, Object obj) {
            return builder.setLocusId((LocusId) obj);
        }
    }

    /* renamed from: androidx.core.app.a$k */
    /* loaded from: classes2.dex */
    public static class C3940k {
        @DoNotInline
        /* renamed from: a */
        public static Notification.Action.Builder m57568a(Notification.Action.Builder builder, boolean z) {
            return builder.setAuthenticationRequired(z);
        }

        @DoNotInline
        /* renamed from: b */
        public static Notification.Builder m57567b(Notification.Builder builder, int i) {
            return builder.setForegroundServiceBehavior(i);
        }
    }

    public C3929a(NotificationCompat.Builder builder) {
        boolean z;
        boolean z2;
        boolean z3;
        boolean z4;
        List<String> list;
        int i;
        Object obj;
        this.f33724c = builder;
        Context context = builder.mContext;
        this.f33722a = context;
        if (Build.VERSION.SDK_INT >= 26) {
            this.f33723b = C3937h.m57581a(context, builder.f33564I);
        } else {
            this.f33723b = new Notification.Builder(builder.mContext);
        }
        Notification notification = builder.f33573R;
        Notification.Builder lights = this.f33723b.setWhen(notification.when).setSmallIcon(notification.icon, notification.iconLevel).setContent(notification.contentView).setTicker(notification.tickerText, builder.f33581f).setVibrate(notification.vibrate).setLights(notification.ledARGB, notification.ledOnMS, notification.ledOffMS);
        if ((notification.flags & 2) != 0) {
            z = true;
        } else {
            z = false;
        }
        Notification.Builder ongoing = lights.setOngoing(z);
        if ((notification.flags & 8) != 0) {
            z2 = true;
        } else {
            z2 = false;
        }
        Notification.Builder onlyAlertOnce = ongoing.setOnlyAlertOnce(z2);
        if ((notification.flags & 16) != 0) {
            z3 = true;
        } else {
            z3 = false;
        }
        Notification.Builder deleteIntent = onlyAlertOnce.setAutoCancel(z3).setDefaults(notification.defaults).setContentTitle(builder.f33577b).setContentText(builder.f33578c).setContentInfo(builder.f33583h).setContentIntent(builder.f33579d).setDeleteIntent(notification.deleteIntent);
        PendingIntent pendingIntent = builder.f33580e;
        if ((notification.flags & 128) != 0) {
            z4 = true;
        } else {
            z4 = false;
        }
        deleteIntent.setFullScreenIntent(pendingIntent, z4).setLargeIcon(builder.f33582g).setNumber(builder.f33584i).setProgress(builder.f33593r, builder.f33594s, builder.f33595t);
        C3930a.m57609b(C3930a.m57607d(C3930a.m57608c(this.f33723b, builder.f33590o), builder.f33587l), builder.f33585j);
        Iterator<NotificationCompat.Action> it = builder.mActions.iterator();
        while (it.hasNext()) {
            m57617a(it.next());
        }
        Bundle bundle = builder.f33557B;
        if (bundle != null) {
            this.f33728g.putAll(bundle);
        }
        int i2 = Build.VERSION.SDK_INT;
        this.f33725d = builder.f33561F;
        this.f33726e = builder.f33562G;
        C3931b.m57606a(this.f33723b, builder.f33586k);
        C3933d.m57596i(this.f33723b, builder.f33599x);
        C3933d.m57598g(this.f33723b, builder.f33596u);
        C3933d.m57595j(this.f33723b, builder.f33598w);
        C3933d.m57597h(this.f33723b, builder.f33597v);
        this.f33729h = builder.f33569N;
        C3934e.m57593b(this.f33723b, builder.f33556A);
        C3934e.m57592c(this.f33723b, builder.f33558C);
        C3934e.m57589f(this.f33723b, builder.f33559D);
        C3934e.m57591d(this.f33723b, builder.f33560E);
        C3934e.m57590e(this.f33723b, notification.sound, notification.audioAttributes);
        if (i2 < 28) {
            list = m57614d(m57612f(builder.mPersonList), builder.mPeople);
        } else {
            list = builder.mPeople;
        }
        if (list != null && !list.isEmpty()) {
            for (String str : list) {
                C3934e.m57594a(this.f33723b, str);
            }
        }
        this.f33730i = builder.f33563H;
        if (builder.f33576a.size() > 0) {
            Bundle bundle2 = builder.getExtras().getBundle("android.car.EXTENSIONS");
            bundle2 = bundle2 == null ? new Bundle() : bundle2;
            Bundle bundle3 = new Bundle(bundle2);
            Bundle bundle4 = new Bundle();
            for (int i3 = 0; i3 < builder.f33576a.size(); i3++) {
                bundle4.putBundle(Integer.toString(i3), AbstractC3941b.m57562e((NotificationCompat.Action) builder.f33576a.get(i3)));
            }
            bundle2.putBundle("invisible_actions", bundle4);
            bundle3.putBundle("invisible_actions", bundle4);
            builder.getExtras().putBundle("android.car.EXTENSIONS", bundle2);
            this.f33728g.putBundle("android.car.EXTENSIONS", bundle3);
        }
        int i4 = Build.VERSION.SDK_INT;
        if (i4 >= 23 && (obj = builder.f33575T) != null) {
            C3935f.m57587b(this.f33723b, obj);
        }
        if (i4 >= 24) {
            C3932c.m57605a(this.f33723b, builder.f33557B);
            C3936g.m57582e(this.f33723b, builder.f33592q);
            RemoteViews remoteViews = builder.f33561F;
            if (remoteViews != null) {
                C3936g.m57584c(this.f33723b, remoteViews);
            }
            RemoteViews remoteViews2 = builder.f33562G;
            if (remoteViews2 != null) {
                C3936g.m57585b(this.f33723b, remoteViews2);
            }
            RemoteViews remoteViews3 = builder.f33563H;
            if (remoteViews3 != null) {
                C3936g.m57583d(this.f33723b, remoteViews3);
            }
        }
        if (i4 >= 26) {
            C3937h.m57580b(this.f33723b, builder.f33565J);
            C3937h.m57577e(this.f33723b, builder.f33591p);
            C3937h.m57576f(this.f33723b, builder.f33566K);
            C3937h.m57575g(this.f33723b, builder.f33568M);
            C3937h.m57578d(this.f33723b, builder.f33569N);
            if (builder.f33601z) {
                C3937h.m57579c(this.f33723b, builder.f33600y);
            }
            if (!TextUtils.isEmpty(builder.f33564I)) {
                this.f33723b.setSound(null).setDefaults(0).setLights(0, 0, 0).setVibrate(null);
            }
        }
        if (i4 >= 28) {
            Iterator<Person> it2 = builder.mPersonList.iterator();
            while (it2.hasNext()) {
                C3938i.m57574a(this.f33723b, it2.next().toAndroidPerson());
            }
        }
        int i5 = Build.VERSION.SDK_INT;
        if (i5 >= 29) {
            C3939j.m57572a(this.f33723b, builder.f33571P);
            C3939j.m57571b(this.f33723b, NotificationCompat.BubbleMetadata.toPlatform(builder.f33572Q));
            LocusIdCompat locusIdCompat = builder.f33567L;
            if (locusIdCompat != null) {
                C3939j.m57569d(this.f33723b, locusIdCompat.toLocusId());
            }
        }
        if (i5 >= 31 && (i = builder.f33570O) != 0) {
            C3940k.m57567b(this.f33723b, i);
        }
        if (builder.f33574S) {
            if (this.f33724c.f33597v) {
                this.f33729h = 2;
            } else {
                this.f33729h = 1;
            }
            this.f33723b.setVibrate(null);
            this.f33723b.setSound(null);
            int i6 = notification.defaults & (-4);
            notification.defaults = i6;
            this.f33723b.setDefaults(i6);
            if (i5 >= 26) {
                if (TextUtils.isEmpty(this.f33724c.f33596u)) {
                    C3933d.m57598g(this.f33723b, NotificationCompat.GROUP_KEY_SILENT);
                }
                C3937h.m57578d(this.f33723b, this.f33729h);
            }
        }
    }

    /* renamed from: d */
    public static List m57614d(List list, List list2) {
        if (list == null) {
            return list2;
        }
        if (list2 == null) {
            return list;
        }
        ArraySet arraySet = new ArraySet(list.size() + list2.size());
        arraySet.addAll(list);
        arraySet.addAll(list2);
        return new ArrayList(arraySet);
    }

    /* renamed from: f */
    public static List m57612f(List list) {
        if (list == null) {
            return null;
        }
        ArrayList arrayList = new ArrayList(list.size());
        Iterator it = list.iterator();
        while (it.hasNext()) {
            arrayList.add(((Person) it.next()).resolveToLegacyUri());
        }
        return arrayList;
    }

    /* renamed from: a */
    public final void m57617a(NotificationCompat.Action action) {
        int i;
        Notification.Action.Builder m57600e;
        Bundle bundle;
        Icon icon;
        int i2 = Build.VERSION.SDK_INT;
        IconCompat iconCompat = action.getIconCompat();
        if (i2 >= 23) {
            if (iconCompat != null) {
                icon = iconCompat.toIcon();
            } else {
                icon = null;
            }
            m57600e = C3935f.m57588a(icon, action.getTitle(), action.getActionIntent());
        } else {
            if (iconCompat != null) {
                i = iconCompat.getResId();
            } else {
                i = 0;
            }
            m57600e = C3933d.m57600e(i, action.getTitle(), action.getActionIntent());
        }
        if (action.getRemoteInputs() != null) {
            for (android.app.RemoteInput remoteInput : RemoteInput.m57646b(action.getRemoteInputs())) {
                C3933d.m57602c(m57600e, remoteInput);
            }
        }
        if (action.getExtras() != null) {
            bundle = new Bundle(action.getExtras());
        } else {
            bundle = new Bundle();
        }
        bundle.putBoolean("android.support.allowGeneratedReplies", action.getAllowGeneratedReplies());
        int i3 = Build.VERSION.SDK_INT;
        if (i3 >= 24) {
            C3936g.m57586a(m57600e, action.getAllowGeneratedReplies());
        }
        bundle.putInt("android.support.action.semanticAction", action.getSemanticAction());
        if (i3 >= 28) {
            C3938i.m57573b(m57600e, action.getSemanticAction());
        }
        if (i3 >= 29) {
            C3939j.m57570c(m57600e, action.isContextual());
        }
        if (i3 >= 31) {
            C3940k.m57568a(m57600e, action.isAuthenticationRequired());
        }
        bundle.putBoolean("android.support.action.showsUserInterface", action.getShowsUserInterface());
        C3933d.m57603b(m57600e, bundle);
        C3933d.m57604a(this.f33723b, C3933d.m57601d(m57600e));
    }

    /* renamed from: b */
    public Notification m57616b() {
        RemoteViews remoteViews;
        Bundle extras;
        RemoteViews makeHeadsUpContentView;
        RemoteViews makeBigContentView;
        NotificationCompat.Style style = this.f33724c.f33589n;
        if (style != null) {
            style.apply(this);
        }
        if (style != null) {
            remoteViews = style.makeContentView(this);
        } else {
            remoteViews = null;
        }
        Notification m57615c = m57615c();
        if (remoteViews != null) {
            m57615c.contentView = remoteViews;
        } else {
            RemoteViews remoteViews2 = this.f33724c.f33561F;
            if (remoteViews2 != null) {
                m57615c.contentView = remoteViews2;
            }
        }
        if (style != null && (makeBigContentView = style.makeBigContentView(this)) != null) {
            m57615c.bigContentView = makeBigContentView;
        }
        if (style != null && (makeHeadsUpContentView = this.f33724c.f33589n.makeHeadsUpContentView(this)) != null) {
            m57615c.headsUpContentView = makeHeadsUpContentView;
        }
        if (style != null && (extras = NotificationCompat.getExtras(m57615c)) != null) {
            style.addCompatExtras(extras);
        }
        return m57615c;
    }

    /* renamed from: c */
    public Notification m57615c() {
        int i = Build.VERSION.SDK_INT;
        if (i >= 26) {
            return C3930a.m57610a(this.f33723b);
        }
        if (i >= 24) {
            Notification m57610a = C3930a.m57610a(this.f33723b);
            if (this.f33729h != 0) {
                if (C3933d.m57599f(m57610a) != null && (m57610a.flags & 512) != 0 && this.f33729h == 2) {
                    m57611g(m57610a);
                }
                if (C3933d.m57599f(m57610a) != null && (m57610a.flags & 512) == 0 && this.f33729h == 1) {
                    m57611g(m57610a);
                }
            }
            return m57610a;
        }
        C3932c.m57605a(this.f33723b, this.f33728g);
        Notification m57610a2 = C3930a.m57610a(this.f33723b);
        RemoteViews remoteViews = this.f33725d;
        if (remoteViews != null) {
            m57610a2.contentView = remoteViews;
        }
        RemoteViews remoteViews2 = this.f33726e;
        if (remoteViews2 != null) {
            m57610a2.bigContentView = remoteViews2;
        }
        RemoteViews remoteViews3 = this.f33730i;
        if (remoteViews3 != null) {
            m57610a2.headsUpContentView = remoteViews3;
        }
        if (this.f33729h != 0) {
            if (C3933d.m57599f(m57610a2) != null && (m57610a2.flags & 512) != 0 && this.f33729h == 2) {
                m57611g(m57610a2);
            }
            if (C3933d.m57599f(m57610a2) != null && (m57610a2.flags & 512) == 0 && this.f33729h == 1) {
                m57611g(m57610a2);
            }
        }
        return m57610a2;
    }

    /* renamed from: e */
    public Context m57613e() {
        return this.f33722a;
    }

    /* renamed from: g */
    public final void m57611g(Notification notification) {
        notification.sound = null;
        notification.vibrate = null;
        notification.defaults &= -4;
    }

    @Override // androidx.core.app.NotificationBuilderWithBuilderAccessor
    public Notification.Builder getBuilder() {
        return this.f33723b;
    }
}

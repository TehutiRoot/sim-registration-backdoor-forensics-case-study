package androidx.core.app;

import android.app.AppOpsManager;
import android.app.Notification;
import android.app.NotificationChannel;
import android.app.NotificationChannelGroup;
import android.app.NotificationManager;
import android.content.ComponentName;
import android.content.Context;
import android.content.Intent;
import android.content.ServiceConnection;
import android.content.pm.ApplicationInfo;
import android.content.pm.ResolveInfo;
import android.content.pm.ServiceInfo;
import android.os.Build;
import android.os.Bundle;
import android.os.DeadObjectException;
import android.os.Handler;
import android.os.HandlerThread;
import android.os.IBinder;
import android.os.Message;
import android.os.RemoteException;
import android.provider.Settings;
import android.support.p001v4.app.INotificationSideChannel;
import android.util.Log;
import androidx.annotation.DoNotInline;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.annotation.RequiresPermission;
import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;
import java.util.ArrayDeque;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Collections;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.Set;

/* loaded from: classes2.dex */
public final class NotificationManagerCompat {
    public static final String ACTION_BIND_SIDE_CHANNEL = "android.support.BIND_NOTIFICATION_SIDE_CHANNEL";
    public static final String EXTRA_USE_SIDE_CHANNEL = "android.support.useSideChannel";
    public static final int IMPORTANCE_DEFAULT = 3;
    public static final int IMPORTANCE_HIGH = 4;
    public static final int IMPORTANCE_LOW = 2;
    public static final int IMPORTANCE_MAX = 5;
    public static final int IMPORTANCE_MIN = 1;
    public static final int IMPORTANCE_NONE = 0;
    public static final int IMPORTANCE_UNSPECIFIED = -1000;

    /* renamed from: d */
    public static String f33657d;

    /* renamed from: g */
    public static ServiceConnectionC3912g f33660g;

    /* renamed from: a */
    public final Context f33661a;

    /* renamed from: b */
    public final NotificationManager f33662b;

    /* renamed from: c */
    public static final Object f33656c = new Object();

    /* renamed from: e */
    public static Set f33658e = new HashSet();

    /* renamed from: f */
    public static final Object f33659f = new Object();

    /* renamed from: androidx.core.app.NotificationManagerCompat$a */
    /* loaded from: classes2.dex */
    public static class C3906a {
        @DoNotInline
        /* renamed from: a */
        public static boolean m57691a(NotificationManager notificationManager) {
            return notificationManager.areNotificationsEnabled();
        }

        @DoNotInline
        /* renamed from: b */
        public static int m57690b(NotificationManager notificationManager) {
            return notificationManager.getImportance();
        }
    }

    /* renamed from: androidx.core.app.NotificationManagerCompat$b */
    /* loaded from: classes2.dex */
    public static class C3907b {
        @DoNotInline
        /* renamed from: a */
        public static void m57689a(NotificationManager notificationManager, NotificationChannel notificationChannel) {
            notificationManager.createNotificationChannel(notificationChannel);
        }

        @DoNotInline
        /* renamed from: b */
        public static void m57688b(NotificationManager notificationManager, NotificationChannelGroup notificationChannelGroup) {
            notificationManager.createNotificationChannelGroup(notificationChannelGroup);
        }

        @DoNotInline
        /* renamed from: c */
        public static void m57687c(NotificationManager notificationManager, List<NotificationChannelGroup> list) {
            notificationManager.createNotificationChannelGroups(list);
        }

        @DoNotInline
        /* renamed from: d */
        public static void m57686d(NotificationManager notificationManager, List<NotificationChannel> list) {
            notificationManager.createNotificationChannels(list);
        }

        @DoNotInline
        /* renamed from: e */
        public static void m57685e(NotificationManager notificationManager, String str) {
            notificationManager.deleteNotificationChannel(str);
        }

        @DoNotInline
        /* renamed from: f */
        public static void m57684f(NotificationManager notificationManager, String str) {
            notificationManager.deleteNotificationChannelGroup(str);
        }

        @DoNotInline
        /* renamed from: g */
        public static String m57683g(NotificationChannel notificationChannel) {
            return notificationChannel.getId();
        }

        @DoNotInline
        /* renamed from: h */
        public static String m57682h(NotificationChannelGroup notificationChannelGroup) {
            return notificationChannelGroup.getId();
        }

        @DoNotInline
        /* renamed from: i */
        public static NotificationChannel m57681i(NotificationManager notificationManager, String str) {
            return notificationManager.getNotificationChannel(str);
        }

        @DoNotInline
        /* renamed from: j */
        public static List<NotificationChannelGroup> m57680j(NotificationManager notificationManager) {
            return notificationManager.getNotificationChannelGroups();
        }

        @DoNotInline
        /* renamed from: k */
        public static List<NotificationChannel> m57679k(NotificationManager notificationManager) {
            return notificationManager.getNotificationChannels();
        }
    }

    /* renamed from: androidx.core.app.NotificationManagerCompat$c */
    /* loaded from: classes2.dex */
    public static class C3908c {
        @DoNotInline
        /* renamed from: a */
        public static NotificationChannelGroup m57678a(NotificationManager notificationManager, String str) {
            return notificationManager.getNotificationChannelGroup(str);
        }
    }

    /* renamed from: androidx.core.app.NotificationManagerCompat$d */
    /* loaded from: classes2.dex */
    public static class C3909d {
        @DoNotInline
        /* renamed from: a */
        public static NotificationChannel m57677a(NotificationManager notificationManager, String str, String str2) {
            return notificationManager.getNotificationChannel(str, str2);
        }

        @DoNotInline
        /* renamed from: b */
        public static String m57676b(NotificationChannel notificationChannel) {
            return notificationChannel.getParentChannelId();
        }
    }

    /* renamed from: androidx.core.app.NotificationManagerCompat$e */
    /* loaded from: classes2.dex */
    public static class C3910e implements InterfaceC3914h {

        /* renamed from: a */
        public final String f33663a;

        /* renamed from: b */
        public final int f33664b;

        /* renamed from: c */
        public final String f33665c;

        /* renamed from: d */
        public final Notification f33666d;

        public C3910e(String str, int i, String str2, Notification notification) {
            this.f33663a = str;
            this.f33664b = i;
            this.f33665c = str2;
            this.f33666d = notification;
        }

        @Override // androidx.core.app.NotificationManagerCompat.InterfaceC3914h
        /* renamed from: a */
        public void mo57665a(INotificationSideChannel iNotificationSideChannel) {
            iNotificationSideChannel.notify(this.f33663a, this.f33664b, this.f33665c, this.f33666d);
        }

        public String toString() {
            return "NotifyTask[packageName:" + this.f33663a + ", id:" + this.f33664b + ", tag:" + this.f33665c + "]";
        }
    }

    /* renamed from: androidx.core.app.NotificationManagerCompat$f */
    /* loaded from: classes2.dex */
    public static class C3911f {

        /* renamed from: a */
        public final ComponentName f33667a;

        /* renamed from: b */
        public final IBinder f33668b;

        public C3911f(ComponentName componentName, IBinder iBinder) {
            this.f33667a = componentName;
            this.f33668b = iBinder;
        }
    }

    /* renamed from: androidx.core.app.NotificationManagerCompat$g */
    /* loaded from: classes2.dex */
    public static class ServiceConnectionC3912g implements Handler.Callback, ServiceConnection {

        /* renamed from: a */
        public final Context f33669a;

        /* renamed from: b */
        public final HandlerThread f33670b;

        /* renamed from: c */
        public final Handler f33671c;

        /* renamed from: d */
        public final Map f33672d = new HashMap();

        /* renamed from: e */
        public Set f33673e = new HashSet();

        /* renamed from: androidx.core.app.NotificationManagerCompat$g$a */
        /* loaded from: classes2.dex */
        public static class C3913a {

            /* renamed from: a */
            public final ComponentName f33674a;

            /* renamed from: c */
            public INotificationSideChannel f33676c;

            /* renamed from: b */
            public boolean f33675b = false;

            /* renamed from: d */
            public ArrayDeque f33677d = new ArrayDeque();

            /* renamed from: e */
            public int f33678e = 0;

            public C3913a(ComponentName componentName) {
                this.f33674a = componentName;
            }
        }

        public ServiceConnectionC3912g(Context context) {
            this.f33669a = context;
            HandlerThread handlerThread = new HandlerThread("NotificationManagerCompat");
            this.f33670b = handlerThread;
            handlerThread.start();
            this.f33671c = new Handler(handlerThread.getLooper(), this);
        }

        /* renamed from: a */
        public final boolean m57675a(C3913a c3913a) {
            if (c3913a.f33675b) {
                return true;
            }
            boolean bindService = this.f33669a.bindService(new Intent(NotificationManagerCompat.ACTION_BIND_SIDE_CHANNEL).setComponent(c3913a.f33674a), this, 33);
            c3913a.f33675b = bindService;
            if (bindService) {
                c3913a.f33678e = 0;
            } else {
                Log.w("NotifManCompat", "Unable to bind to listener " + c3913a.f33674a);
                this.f33669a.unbindService(this);
            }
            return c3913a.f33675b;
        }

        /* renamed from: b */
        public final void m57674b(C3913a c3913a) {
            if (c3913a.f33675b) {
                this.f33669a.unbindService(this);
                c3913a.f33675b = false;
            }
            c3913a.f33676c = null;
        }

        /* renamed from: c */
        public final void m57673c(InterfaceC3914h interfaceC3914h) {
            m57666j();
            for (C3913a c3913a : this.f33672d.values()) {
                c3913a.f33677d.add(interfaceC3914h);
                m57669g(c3913a);
            }
        }

        /* renamed from: d */
        public final void m57672d(ComponentName componentName) {
            C3913a c3913a = (C3913a) this.f33672d.get(componentName);
            if (c3913a != null) {
                m57669g(c3913a);
            }
        }

        /* renamed from: e */
        public final void m57671e(ComponentName componentName, IBinder iBinder) {
            C3913a c3913a = (C3913a) this.f33672d.get(componentName);
            if (c3913a != null) {
                c3913a.f33676c = INotificationSideChannel.Stub.asInterface(iBinder);
                c3913a.f33678e = 0;
                m57669g(c3913a);
            }
        }

        /* renamed from: f */
        public final void m57670f(ComponentName componentName) {
            C3913a c3913a = (C3913a) this.f33672d.get(componentName);
            if (c3913a != null) {
                m57674b(c3913a);
            }
        }

        /* renamed from: g */
        public final void m57669g(C3913a c3913a) {
            if (Log.isLoggable("NotifManCompat", 3)) {
                StringBuilder sb = new StringBuilder();
                sb.append("Processing component ");
                sb.append(c3913a.f33674a);
                sb.append(", ");
                sb.append(c3913a.f33677d.size());
                sb.append(" queued tasks");
            }
            if (c3913a.f33677d.isEmpty()) {
                return;
            }
            if (m57675a(c3913a) && c3913a.f33676c != null) {
                while (true) {
                    InterfaceC3914h interfaceC3914h = (InterfaceC3914h) c3913a.f33677d.peek();
                    if (interfaceC3914h == null) {
                        break;
                    }
                    try {
                        if (Log.isLoggable("NotifManCompat", 3)) {
                            StringBuilder sb2 = new StringBuilder();
                            sb2.append("Sending task ");
                            sb2.append(interfaceC3914h);
                        }
                        interfaceC3914h.mo57665a(c3913a.f33676c);
                        c3913a.f33677d.remove();
                    } catch (DeadObjectException unused) {
                        if (Log.isLoggable("NotifManCompat", 3)) {
                            StringBuilder sb3 = new StringBuilder();
                            sb3.append("Remote service has died: ");
                            sb3.append(c3913a.f33674a);
                        }
                    } catch (RemoteException e) {
                        Log.w("NotifManCompat", "RemoteException communicating with " + c3913a.f33674a, e);
                    }
                }
                if (!c3913a.f33677d.isEmpty()) {
                    m57667i(c3913a);
                    return;
                }
                return;
            }
            m57667i(c3913a);
        }

        /* renamed from: h */
        public void m57668h(InterfaceC3914h interfaceC3914h) {
            this.f33671c.obtainMessage(0, interfaceC3914h).sendToTarget();
        }

        @Override // android.os.Handler.Callback
        public boolean handleMessage(Message message) {
            int i = message.what;
            if (i != 0) {
                if (i != 1) {
                    if (i != 2) {
                        if (i != 3) {
                            return false;
                        }
                        m57672d((ComponentName) message.obj);
                        return true;
                    }
                    m57670f((ComponentName) message.obj);
                    return true;
                }
                C3911f c3911f = (C3911f) message.obj;
                m57671e(c3911f.f33667a, c3911f.f33668b);
                return true;
            }
            m57673c((InterfaceC3914h) message.obj);
            return true;
        }

        /* renamed from: i */
        public final void m57667i(C3913a c3913a) {
            if (this.f33671c.hasMessages(3, c3913a.f33674a)) {
                return;
            }
            int i = c3913a.f33678e;
            int i2 = i + 1;
            c3913a.f33678e = i2;
            if (i2 > 6) {
                Log.w("NotifManCompat", "Giving up on delivering " + c3913a.f33677d.size() + " tasks to " + c3913a.f33674a + " after " + c3913a.f33678e + " retries");
                c3913a.f33677d.clear();
                return;
            }
            int i3 = (1 << i) * 1000;
            if (Log.isLoggable("NotifManCompat", 3)) {
                StringBuilder sb = new StringBuilder();
                sb.append("Scheduling retry for ");
                sb.append(i3);
                sb.append(" ms");
            }
            this.f33671c.sendMessageDelayed(this.f33671c.obtainMessage(3, c3913a.f33674a), i3);
        }

        /* renamed from: j */
        public final void m57666j() {
            Set<String> enabledListenerPackages = NotificationManagerCompat.getEnabledListenerPackages(this.f33669a);
            if (enabledListenerPackages.equals(this.f33673e)) {
                return;
            }
            this.f33673e = enabledListenerPackages;
            List<ResolveInfo> queryIntentServices = this.f33669a.getPackageManager().queryIntentServices(new Intent().setAction(NotificationManagerCompat.ACTION_BIND_SIDE_CHANNEL), 0);
            HashSet<ComponentName> hashSet = new HashSet();
            for (ResolveInfo resolveInfo : queryIntentServices) {
                if (enabledListenerPackages.contains(resolveInfo.serviceInfo.packageName)) {
                    ServiceInfo serviceInfo = resolveInfo.serviceInfo;
                    ComponentName componentName = new ComponentName(serviceInfo.packageName, serviceInfo.name);
                    if (resolveInfo.serviceInfo.permission != null) {
                        Log.w("NotifManCompat", "Permission present on component " + componentName + ", not adding listener record.");
                    } else {
                        hashSet.add(componentName);
                    }
                }
            }
            for (ComponentName componentName2 : hashSet) {
                if (!this.f33672d.containsKey(componentName2)) {
                    if (Log.isLoggable("NotifManCompat", 3)) {
                        StringBuilder sb = new StringBuilder();
                        sb.append("Adding listener record for ");
                        sb.append(componentName2);
                    }
                    this.f33672d.put(componentName2, new C3913a(componentName2));
                }
            }
            Iterator it = this.f33672d.entrySet().iterator();
            while (it.hasNext()) {
                Map.Entry entry = (Map.Entry) it.next();
                if (!hashSet.contains(entry.getKey())) {
                    if (Log.isLoggable("NotifManCompat", 3)) {
                        StringBuilder sb2 = new StringBuilder();
                        sb2.append("Removing listener record for ");
                        sb2.append(entry.getKey());
                    }
                    m57674b((C3913a) entry.getValue());
                    it.remove();
                }
            }
        }

        @Override // android.content.ServiceConnection
        public void onServiceConnected(ComponentName componentName, IBinder iBinder) {
            if (Log.isLoggable("NotifManCompat", 3)) {
                StringBuilder sb = new StringBuilder();
                sb.append("Connected to service ");
                sb.append(componentName);
            }
            this.f33671c.obtainMessage(1, new C3911f(componentName, iBinder)).sendToTarget();
        }

        @Override // android.content.ServiceConnection
        public void onServiceDisconnected(ComponentName componentName) {
            if (Log.isLoggable("NotifManCompat", 3)) {
                StringBuilder sb = new StringBuilder();
                sb.append("Disconnected from service ");
                sb.append(componentName);
            }
            this.f33671c.obtainMessage(2, componentName).sendToTarget();
        }
    }

    /* renamed from: androidx.core.app.NotificationManagerCompat$h */
    /* loaded from: classes2.dex */
    public interface InterfaceC3914h {
        /* renamed from: a */
        void mo57665a(INotificationSideChannel iNotificationSideChannel);
    }

    public NotificationManagerCompat(Context context) {
        this.f33661a = context;
        this.f33662b = (NotificationManager) context.getSystemService("notification");
    }

    /* renamed from: b */
    public static boolean m57692b(Notification notification) {
        Bundle extras = NotificationCompat.getExtras(notification);
        if (extras != null && extras.getBoolean(EXTRA_USE_SIDE_CHANNEL)) {
            return true;
        }
        return false;
    }

    @NonNull
    public static NotificationManagerCompat from(@NonNull Context context) {
        return new NotificationManagerCompat(context);
    }

    @NonNull
    public static Set<String> getEnabledListenerPackages(@NonNull Context context) {
        Set<String> set;
        String string = Settings.Secure.getString(context.getContentResolver(), "enabled_notification_listeners");
        synchronized (f33656c) {
            if (string != null) {
                try {
                    if (!string.equals(f33657d)) {
                        String[] split = string.split(":", -1);
                        HashSet hashSet = new HashSet(split.length);
                        for (String str : split) {
                            ComponentName unflattenFromString = ComponentName.unflattenFromString(str);
                            if (unflattenFromString != null) {
                                hashSet.add(unflattenFromString.getPackageName());
                            }
                        }
                        f33658e = hashSet;
                        f33657d = string;
                    }
                } catch (Throwable th2) {
                    throw th2;
                }
            }
            set = f33658e;
        }
        return set;
    }

    /* renamed from: a */
    public final void m57693a(InterfaceC3914h interfaceC3914h) {
        synchronized (f33659f) {
            try {
                if (f33660g == null) {
                    f33660g = new ServiceConnectionC3912g(this.f33661a.getApplicationContext());
                }
                f33660g.m57668h(interfaceC3914h);
            } catch (Throwable th2) {
                throw th2;
            }
        }
    }

    public boolean areNotificationsEnabled() {
        if (Build.VERSION.SDK_INT >= 24) {
            return C3906a.m57691a(this.f33662b);
        }
        AppOpsManager appOpsManager = (AppOpsManager) this.f33661a.getSystemService("appops");
        ApplicationInfo applicationInfo = this.f33661a.getApplicationInfo();
        String packageName = this.f33661a.getApplicationContext().getPackageName();
        int i = applicationInfo.uid;
        try {
            Class<?> cls = Class.forName(AppOpsManager.class.getName());
            Class<?> cls2 = Integer.TYPE;
            Method method = cls.getMethod("checkOpNoThrow", cls2, cls2, String.class);
            Integer num = (Integer) cls.getDeclaredField("OP_POST_NOTIFICATION").get(Integer.class);
            num.intValue();
            if (((Integer) method.invoke(appOpsManager, num, Integer.valueOf(i), packageName)).intValue() != 0) {
                return false;
            }
            return true;
        } catch (ClassNotFoundException | IllegalAccessException | NoSuchFieldException | NoSuchMethodException | RuntimeException | InvocationTargetException unused) {
            return true;
        }
    }

    public void cancel(int i) {
        cancel(null, i);
    }

    public void cancelAll() {
        this.f33662b.cancelAll();
    }

    public void createNotificationChannel(@NonNull NotificationChannel notificationChannel) {
        if (Build.VERSION.SDK_INT >= 26) {
            C3907b.m57689a(this.f33662b, notificationChannel);
        }
    }

    public void createNotificationChannelGroup(@NonNull NotificationChannelGroup notificationChannelGroup) {
        if (Build.VERSION.SDK_INT >= 26) {
            C3907b.m57688b(this.f33662b, notificationChannelGroup);
        }
    }

    public void createNotificationChannelGroups(@NonNull List<NotificationChannelGroup> list) {
        if (Build.VERSION.SDK_INT >= 26) {
            C3907b.m57687c(this.f33662b, list);
        }
    }

    public void createNotificationChannelGroupsCompat(@NonNull List<NotificationChannelGroupCompat> list) {
        if (Build.VERSION.SDK_INT >= 26 && !list.isEmpty()) {
            ArrayList arrayList = new ArrayList(list.size());
            for (NotificationChannelGroupCompat notificationChannelGroupCompat : list) {
                arrayList.add(notificationChannelGroupCompat.m57868b());
            }
            C3907b.m57687c(this.f33662b, arrayList);
        }
    }

    public void createNotificationChannels(@NonNull List<NotificationChannel> list) {
        if (Build.VERSION.SDK_INT >= 26) {
            C3907b.m57686d(this.f33662b, list);
        }
    }

    public void createNotificationChannelsCompat(@NonNull List<NotificationChannelCompat> list) {
        if (Build.VERSION.SDK_INT >= 26 && !list.isEmpty()) {
            ArrayList arrayList = new ArrayList(list.size());
            for (NotificationChannelCompat notificationChannelCompat : list) {
                arrayList.add(notificationChannelCompat.m57898a());
            }
            C3907b.m57686d(this.f33662b, arrayList);
        }
    }

    public void deleteNotificationChannel(@NonNull String str) {
        if (Build.VERSION.SDK_INT >= 26) {
            C3907b.m57685e(this.f33662b, str);
        }
    }

    public void deleteNotificationChannelGroup(@NonNull String str) {
        if (Build.VERSION.SDK_INT >= 26) {
            C3907b.m57684f(this.f33662b, str);
        }
    }

    public void deleteUnlistedNotificationChannels(@NonNull Collection<String> collection) {
        if (Build.VERSION.SDK_INT >= 26) {
            for (NotificationChannel notificationChannel : C3907b.m57679k(this.f33662b)) {
                NotificationChannel m65874a = VI0.m65874a(notificationChannel);
                if (!collection.contains(C3907b.m57683g(m65874a)) && (Build.VERSION.SDK_INT < 30 || !collection.contains(C3909d.m57676b(m65874a)))) {
                    C3907b.m57685e(this.f33662b, C3907b.m57683g(m65874a));
                }
            }
        }
    }

    public int getImportance() {
        if (Build.VERSION.SDK_INT >= 24) {
            return C3906a.m57690b(this.f33662b);
        }
        return IMPORTANCE_UNSPECIFIED;
    }

    @Nullable
    public NotificationChannel getNotificationChannel(@NonNull String str) {
        if (Build.VERSION.SDK_INT >= 26) {
            return C3907b.m57681i(this.f33662b, str);
        }
        return null;
    }

    @Nullable
    public NotificationChannelCompat getNotificationChannelCompat(@NonNull String str) {
        NotificationChannel notificationChannel;
        if (Build.VERSION.SDK_INT < 26 || (notificationChannel = getNotificationChannel(str)) == null) {
            return null;
        }
        return new NotificationChannelCompat(notificationChannel);
    }

    @Nullable
    public NotificationChannelGroup getNotificationChannelGroup(@NonNull String str) {
        int i = Build.VERSION.SDK_INT;
        if (i >= 28) {
            return C3908c.m57678a(this.f33662b, str);
        }
        if (i >= 26) {
            for (NotificationChannelGroup notificationChannelGroup : getNotificationChannelGroups()) {
                NotificationChannelGroup m30894a = AbstractC20192hJ0.m30894a(notificationChannelGroup);
                if (C3907b.m57682h(m30894a).equals(str)) {
                    return m30894a;
                }
            }
        }
        return null;
    }

    @Nullable
    public NotificationChannelGroupCompat getNotificationChannelGroupCompat(@NonNull String str) {
        NotificationChannelGroup notificationChannelGroup;
        int i = Build.VERSION.SDK_INT;
        if (i >= 28) {
            NotificationChannelGroup notificationChannelGroup2 = getNotificationChannelGroup(str);
            if (notificationChannelGroup2 != null) {
                return new NotificationChannelGroupCompat(notificationChannelGroup2);
            }
            return null;
        } else if (i >= 26 && (notificationChannelGroup = getNotificationChannelGroup(str)) != null) {
            return new NotificationChannelGroupCompat(notificationChannelGroup, getNotificationChannels());
        } else {
            return null;
        }
    }

    @NonNull
    public List<NotificationChannelGroup> getNotificationChannelGroups() {
        if (Build.VERSION.SDK_INT >= 26) {
            return C3907b.m57680j(this.f33662b);
        }
        return Collections.emptyList();
    }

    @NonNull
    public List<NotificationChannelGroupCompat> getNotificationChannelGroupsCompat() {
        List<NotificationChannel> notificationChannels;
        int i = Build.VERSION.SDK_INT;
        if (i >= 26) {
            List<NotificationChannelGroup> notificationChannelGroups = getNotificationChannelGroups();
            if (!notificationChannelGroups.isEmpty()) {
                if (i >= 28) {
                    notificationChannels = Collections.emptyList();
                } else {
                    notificationChannels = getNotificationChannels();
                }
                ArrayList arrayList = new ArrayList(notificationChannelGroups.size());
                for (NotificationChannelGroup notificationChannelGroup : notificationChannelGroups) {
                    NotificationChannelGroup m30894a = AbstractC20192hJ0.m30894a(notificationChannelGroup);
                    if (Build.VERSION.SDK_INT >= 28) {
                        arrayList.add(new NotificationChannelGroupCompat(m30894a));
                    } else {
                        arrayList.add(new NotificationChannelGroupCompat(m30894a, notificationChannels));
                    }
                }
                return arrayList;
            }
        }
        return Collections.emptyList();
    }

    @NonNull
    public List<NotificationChannel> getNotificationChannels() {
        if (Build.VERSION.SDK_INT >= 26) {
            return C3907b.m57679k(this.f33662b);
        }
        return Collections.emptyList();
    }

    @NonNull
    public List<NotificationChannelCompat> getNotificationChannelsCompat() {
        if (Build.VERSION.SDK_INT >= 26) {
            List<NotificationChannel> notificationChannels = getNotificationChannels();
            if (!notificationChannels.isEmpty()) {
                ArrayList arrayList = new ArrayList(notificationChannels.size());
                for (NotificationChannel notificationChannel : notificationChannels) {
                    arrayList.add(new NotificationChannelCompat(VI0.m65874a(notificationChannel)));
                }
                return arrayList;
            }
        }
        return Collections.emptyList();
    }

    @RequiresPermission("android.permission.POST_NOTIFICATIONS")
    public void notify(int i, @NonNull Notification notification) {
        notify(null, i, notification);
    }

    public void cancel(@Nullable String str, int i) {
        this.f33662b.cancel(str, i);
    }

    @RequiresPermission("android.permission.POST_NOTIFICATIONS")
    public void notify(@Nullable String str, int i, @NonNull Notification notification) {
        if (m57692b(notification)) {
            m57693a(new C3910e(this.f33661a.getPackageName(), i, str, notification));
            this.f33662b.cancel(str, i);
            return;
        }
        this.f33662b.notify(str, i, notification);
    }

    public void createNotificationChannel(@NonNull NotificationChannelCompat notificationChannelCompat) {
        createNotificationChannel(notificationChannelCompat.m57898a());
    }

    public void createNotificationChannelGroup(@NonNull NotificationChannelGroupCompat notificationChannelGroupCompat) {
        createNotificationChannelGroup(notificationChannelGroupCompat.m57868b());
    }

    @Nullable
    public NotificationChannel getNotificationChannel(@NonNull String str, @NonNull String str2) {
        if (Build.VERSION.SDK_INT >= 30) {
            return C3909d.m57677a(this.f33662b, str, str2);
        }
        return getNotificationChannel(str);
    }

    @Nullable
    public NotificationChannelCompat getNotificationChannelCompat(@NonNull String str, @NonNull String str2) {
        NotificationChannel notificationChannel;
        if (Build.VERSION.SDK_INT < 26 || (notificationChannel = getNotificationChannel(str, str2)) == null) {
            return null;
        }
        return new NotificationChannelCompat(notificationChannel);
    }
}

package androidx.core.content.p004pm;

import android.app.ActivityManager;
import android.content.BroadcastReceiver;
import android.content.Context;
import android.content.Intent;
import android.content.IntentSender;
import android.content.pm.ActivityInfo;
import android.content.pm.PackageManager;
import android.content.pm.ResolveInfo;
import android.content.pm.ShortcutInfo;
import android.content.pm.ShortcutManager;
import android.graphics.Bitmap;
import android.graphics.BitmapFactory;
import android.os.Build;
import android.os.Bundle;
import android.util.DisplayMetrics;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.annotation.RestrictTo;
import androidx.core.content.p004pm.ShortcutInfoCompat;
import androidx.core.content.p004pm.ShortcutInfoCompatSaver;
import androidx.core.graphics.drawable.IconCompat;
import androidx.core.util.Preconditions;
import java.io.InputStream;
import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.Iterator;
import java.util.List;
import java.util.Objects;

/* renamed from: androidx.core.content.pm.ShortcutManagerCompat */
/* loaded from: classes2.dex */
public class ShortcutManagerCompat {
    public static final String EXTRA_SHORTCUT_ID = "android.intent.extra.shortcut.ID";
    public static final int FLAG_MATCH_CACHED = 8;
    public static final int FLAG_MATCH_DYNAMIC = 2;
    public static final int FLAG_MATCH_MANIFEST = 1;
    public static final int FLAG_MATCH_PINNED = 4;

    /* renamed from: a */
    public static volatile ShortcutInfoCompatSaver f33816a;

    /* renamed from: b */
    public static volatile List f33817b;

    @Retention(RetentionPolicy.SOURCE)
    @RestrictTo({RestrictTo.Scope.LIBRARY_GROUP_PREFIX})
    /* renamed from: androidx.core.content.pm.ShortcutManagerCompat$ShortcutMatchFlags */
    /* loaded from: classes2.dex */
    public @interface ShortcutMatchFlags {
    }

    /* renamed from: androidx.core.content.pm.ShortcutManagerCompat$a */
    /* loaded from: classes2.dex */
    public class C3972a extends BroadcastReceiver {

        /* renamed from: a */
        public final /* synthetic */ IntentSender f33818a;

        public C3972a(IntentSender intentSender) {
            this.f33818a = intentSender;
        }

        @Override // android.content.BroadcastReceiver
        public void onReceive(Context context, Intent intent) {
            try {
                this.f33818a.sendIntent(context, 0, null, null, null);
            } catch (IntentSender.SendIntentException unused) {
            }
        }
    }

    /* renamed from: androidx.core.content.pm.ShortcutManagerCompat$b */
    /* loaded from: classes2.dex */
    public static class C3973b {
        /* renamed from: a */
        public static String m57431a(List list) {
            Iterator it = list.iterator();
            int i = -1;
            String str = null;
            while (it.hasNext()) {
                ShortcutInfo shortcutInfo = (ShortcutInfo) it.next();
                if (shortcutInfo.getRank() > i) {
                    str = shortcutInfo.getId();
                    i = shortcutInfo.getRank();
                }
            }
            return str;
        }
    }

    /* renamed from: a */
    public static boolean m57438a(Context context, ShortcutInfoCompat shortcutInfoCompat) {
        Bitmap decodeStream;
        IconCompat createWithBitmap;
        IconCompat iconCompat = shortcutInfoCompat.f33793i;
        if (iconCompat == null) {
            return false;
        }
        int i = iconCompat.mType;
        if (i != 6 && i != 4) {
            return true;
        }
        InputStream uriInputStream = iconCompat.getUriInputStream(context);
        if (uriInputStream == null || (decodeStream = BitmapFactory.decodeStream(uriInputStream)) == null) {
            return false;
        }
        if (i == 6) {
            createWithBitmap = IconCompat.createWithAdaptiveBitmap(decodeStream);
        } else {
            createWithBitmap = IconCompat.createWithBitmap(decodeStream);
        }
        shortcutInfoCompat.f33793i = createWithBitmap;
        return true;
    }

    public static boolean addDynamicShortcuts(@NonNull Context context, @NonNull List<ShortcutInfoCompat> list) {
        Object systemService;
        boolean addDynamicShortcuts;
        List<ShortcutInfoCompat> m57432g = m57432g(list, 1);
        int i = Build.VERSION.SDK_INT;
        if (i <= 29) {
            m57437b(context, m57432g);
        }
        if (i >= 25) {
            ArrayList arrayList = new ArrayList();
            for (ShortcutInfoCompat shortcutInfoCompat : m57432g) {
                arrayList.add(shortcutInfoCompat.toShortcutInfo());
            }
            systemService = context.getSystemService(AbstractC20878lI1.m26528a());
            addDynamicShortcuts = AbstractC22770wI1.m875a(systemService).addDynamicShortcuts(arrayList);
            if (!addDynamicShortcuts) {
                return false;
            }
        }
        m57433f(context).addShortcuts(m57432g);
        for (ShortcutInfoChangeListener shortcutInfoChangeListener : m57434e(context)) {
            shortcutInfoChangeListener.onShortcutAdded(list);
        }
        return true;
    }

    /* renamed from: b */
    public static void m57437b(Context context, List list) {
        for (ShortcutInfoCompat shortcutInfoCompat : new ArrayList(list)) {
            if (!m57438a(context, shortcutInfoCompat)) {
                list.remove(shortcutInfoCompat);
            }
        }
    }

    /* renamed from: c */
    public static int m57436c(Context context, boolean z) {
        boolean z2;
        int i;
        float f;
        ActivityManager activityManager = (ActivityManager) context.getSystemService("activity");
        if (activityManager != null && !activityManager.isLowRamDevice()) {
            z2 = false;
        } else {
            z2 = true;
        }
        if (z2) {
            i = 48;
        } else {
            i = 96;
        }
        int max = Math.max(1, i);
        DisplayMetrics displayMetrics = context.getResources().getDisplayMetrics();
        if (z) {
            f = displayMetrics.xdpi;
        } else {
            f = displayMetrics.ydpi;
        }
        return (int) (max * (f / 160.0f));
    }

    @NonNull
    public static Intent createShortcutResultIntent(@NonNull Context context, @NonNull ShortcutInfoCompat shortcutInfoCompat) {
        Intent intent;
        Object systemService;
        if (Build.VERSION.SDK_INT >= 26) {
            systemService = context.getSystemService(AbstractC20878lI1.m26528a());
            intent = AbstractC22770wI1.m875a(systemService).createShortcutResultIntent(shortcutInfoCompat.toShortcutInfo());
        } else {
            intent = null;
        }
        if (intent == null) {
            intent = new Intent();
        }
        return shortcutInfoCompat.m57445a(intent);
    }

    /* renamed from: d */
    public static String m57435d(List list) {
        Iterator it = list.iterator();
        int i = -1;
        String str = null;
        while (it.hasNext()) {
            ShortcutInfoCompat shortcutInfoCompat = (ShortcutInfoCompat) it.next();
            if (shortcutInfoCompat.getRank() > i) {
                str = shortcutInfoCompat.getId();
                i = shortcutInfoCompat.getRank();
            }
        }
        return str;
    }

    public static void disableShortcuts(@NonNull Context context, @NonNull List<String> list, @Nullable CharSequence charSequence) {
        Object systemService;
        if (Build.VERSION.SDK_INT >= 25) {
            systemService = context.getSystemService(AbstractC20878lI1.m26528a());
            AbstractC22770wI1.m875a(systemService).disableShortcuts(list, charSequence);
        }
        m57433f(context).removeShortcuts(list);
        for (ShortcutInfoChangeListener shortcutInfoChangeListener : m57434e(context)) {
            shortcutInfoChangeListener.onShortcutRemoved(list);
        }
    }

    /* renamed from: e */
    public static List m57434e(Context context) {
        Bundle bundle;
        String string;
        if (f33817b == null) {
            ArrayList arrayList = new ArrayList();
            PackageManager packageManager = context.getPackageManager();
            Intent intent = new Intent("androidx.core.content.pm.SHORTCUT_LISTENER");
            intent.setPackage(context.getPackageName());
            for (ResolveInfo resolveInfo : packageManager.queryIntentActivities(intent, 128)) {
                ActivityInfo activityInfo = resolveInfo.activityInfo;
                if (activityInfo != null && (bundle = activityInfo.metaData) != null && (string = bundle.getString("androidx.core.content.pm.shortcut_listener_impl")) != null) {
                    try {
                        arrayList.add((ShortcutInfoChangeListener) Class.forName(string, false, ShortcutManagerCompat.class.getClassLoader()).getMethod("getInstance", Context.class).invoke(null, context));
                    } catch (Exception unused) {
                    }
                }
            }
            if (f33817b == null) {
                f33817b = arrayList;
            }
        }
        return f33817b;
    }

    public static void enableShortcuts(@NonNull Context context, @NonNull List<ShortcutInfoCompat> list) {
        Object systemService;
        List<ShortcutInfoCompat> m57432g = m57432g(list, 1);
        if (Build.VERSION.SDK_INT >= 25) {
            ArrayList arrayList = new ArrayList(list.size());
            for (ShortcutInfoCompat shortcutInfoCompat : m57432g) {
                arrayList.add(shortcutInfoCompat.f33786b);
            }
            systemService = context.getSystemService(AbstractC20878lI1.m26528a());
            AbstractC22770wI1.m875a(systemService).enableShortcuts(arrayList);
        }
        m57433f(context).addShortcuts(m57432g);
        for (ShortcutInfoChangeListener shortcutInfoChangeListener : m57434e(context)) {
            shortcutInfoChangeListener.onShortcutAdded(list);
        }
    }

    /* renamed from: f */
    public static ShortcutInfoCompatSaver m57433f(Context context) {
        if (f33816a == null) {
            if (Build.VERSION.SDK_INT >= 23) {
                try {
                    f33816a = (ShortcutInfoCompatSaver) Class.forName("androidx.sharetarget.ShortcutInfoCompatSaverImpl", false, ShortcutManagerCompat.class.getClassLoader()).getMethod("getInstance", Context.class).invoke(null, context);
                } catch (Exception unused) {
                }
            }
            if (f33816a == null) {
                f33816a = new ShortcutInfoCompatSaver.NoopImpl();
            }
        }
        return f33816a;
    }

    /* renamed from: g */
    public static List m57432g(List list, int i) {
        Objects.requireNonNull(list);
        if (Build.VERSION.SDK_INT > 32) {
            return list;
        }
        ArrayList arrayList = new ArrayList(list);
        Iterator it = list.iterator();
        while (it.hasNext()) {
            ShortcutInfoCompat shortcutInfoCompat = (ShortcutInfoCompat) it.next();
            if (shortcutInfoCompat.isExcludedFromSurfaces(i)) {
                arrayList.remove(shortcutInfoCompat);
            }
        }
        return arrayList;
    }

    @NonNull
    public static List<ShortcutInfoCompat> getDynamicShortcuts(@NonNull Context context) {
        Object systemService;
        List<Object> dynamicShortcuts;
        if (Build.VERSION.SDK_INT >= 25) {
            systemService = context.getSystemService(AbstractC20878lI1.m26528a());
            dynamicShortcuts = AbstractC22770wI1.m875a(systemService).getDynamicShortcuts();
            ArrayList arrayList = new ArrayList(dynamicShortcuts.size());
            for (Object obj : dynamicShortcuts) {
                arrayList.add(new ShortcutInfoCompat.Builder(context, DH1.m68669a(obj)).build());
            }
            return arrayList;
        }
        try {
            return m57433f(context).getShortcuts();
        } catch (Exception unused) {
            return new ArrayList();
        }
    }

    public static int getIconMaxHeight(@NonNull Context context) {
        Object systemService;
        int iconMaxHeight;
        Preconditions.checkNotNull(context);
        if (Build.VERSION.SDK_INT >= 25) {
            systemService = context.getSystemService(AbstractC20878lI1.m26528a());
            iconMaxHeight = AbstractC22770wI1.m875a(systemService).getIconMaxHeight();
            return iconMaxHeight;
        }
        return m57436c(context, false);
    }

    public static int getIconMaxWidth(@NonNull Context context) {
        Object systemService;
        int iconMaxWidth;
        Preconditions.checkNotNull(context);
        if (Build.VERSION.SDK_INT >= 25) {
            systemService = context.getSystemService(AbstractC20878lI1.m26528a());
            iconMaxWidth = AbstractC22770wI1.m875a(systemService).getIconMaxWidth();
            return iconMaxWidth;
        }
        return m57436c(context, true);
    }

    public static int getMaxShortcutCountPerActivity(@NonNull Context context) {
        Object systemService;
        int maxShortcutCountPerActivity;
        Preconditions.checkNotNull(context);
        if (Build.VERSION.SDK_INT >= 25) {
            systemService = context.getSystemService(AbstractC20878lI1.m26528a());
            maxShortcutCountPerActivity = AbstractC22770wI1.m875a(systemService).getMaxShortcutCountPerActivity();
            return maxShortcutCountPerActivity;
        }
        return 5;
    }

    @NonNull
    public static List<ShortcutInfoCompat> getShortcuts(@NonNull Context context, int i) {
        Object systemService;
        List pinnedShortcuts;
        List dynamicShortcuts;
        List manifestShortcuts;
        Object systemService2;
        List shortcuts;
        int i2 = Build.VERSION.SDK_INT;
        if (i2 >= 30) {
            systemService2 = context.getSystemService(AbstractC20878lI1.m26528a());
            shortcuts = AbstractC22770wI1.m875a(systemService2).getShortcuts(i);
            return ShortcutInfoCompat.m57443c(context, shortcuts);
        } else if (i2 >= 25) {
            systemService = context.getSystemService(AbstractC20878lI1.m26528a());
            ShortcutManager m875a = AbstractC22770wI1.m875a(systemService);
            ArrayList arrayList = new ArrayList();
            if ((i & 1) != 0) {
                manifestShortcuts = m875a.getManifestShortcuts();
                arrayList.addAll(manifestShortcuts);
            }
            if ((i & 2) != 0) {
                dynamicShortcuts = m875a.getDynamicShortcuts();
                arrayList.addAll(dynamicShortcuts);
            }
            if ((i & 4) != 0) {
                pinnedShortcuts = m875a.getPinnedShortcuts();
                arrayList.addAll(pinnedShortcuts);
            }
            return ShortcutInfoCompat.m57443c(context, arrayList);
        } else {
            if ((i & 2) != 0) {
                try {
                    return m57433f(context).getShortcuts();
                } catch (Exception unused) {
                }
            }
            return Collections.emptyList();
        }
    }

    public static boolean isRateLimitingActive(@NonNull Context context) {
        Object systemService;
        boolean isRateLimitingActive;
        Preconditions.checkNotNull(context);
        if (Build.VERSION.SDK_INT >= 25) {
            systemService = context.getSystemService(AbstractC20878lI1.m26528a());
            isRateLimitingActive = AbstractC22770wI1.m875a(systemService).isRateLimitingActive();
            return isRateLimitingActive;
        } else if (getShortcuts(context, 3).size() == getMaxShortcutCountPerActivity(context)) {
            return true;
        } else {
            return false;
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:12:0x003a  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public static boolean isRequestPinShortcutSupported(@androidx.annotation.NonNull android.content.Context r4) {
        /*
            int r0 = android.os.Build.VERSION.SDK_INT
            r1 = 26
            if (r0 < r1) goto L17
            java.lang.Class r0 = p000.AbstractC20878lI1.m26528a()
            java.lang.Object r4 = p000.AbstractC1867a3.m65127a(r4, r0)
            android.content.pm.ShortcutManager r4 = p000.AbstractC22770wI1.m875a(r4)
            boolean r4 = p000.AbstractC21394oI1.m25937a(r4)
            return r4
        L17:
            java.lang.String r0 = "com.android.launcher.permission.INSTALL_SHORTCUT"
            int r1 = androidx.core.content.ContextCompat.checkSelfPermission(r4, r0)
            r2 = 0
            if (r1 == 0) goto L21
            return r2
        L21:
            android.content.pm.PackageManager r4 = r4.getPackageManager()
            android.content.Intent r1 = new android.content.Intent
            java.lang.String r3 = "com.android.launcher.action.INSTALL_SHORTCUT"
            r1.<init>(r3)
            java.util.List r4 = r4.queryBroadcastReceivers(r1, r2)
            java.util.Iterator r4 = r4.iterator()
        L34:
            boolean r1 = r4.hasNext()
            if (r1 == 0) goto L52
            java.lang.Object r1 = r4.next()
            android.content.pm.ResolveInfo r1 = (android.content.pm.ResolveInfo) r1
            android.content.pm.ActivityInfo r1 = r1.activityInfo
            java.lang.String r1 = r1.permission
            boolean r3 = android.text.TextUtils.isEmpty(r1)
            if (r3 != 0) goto L50
            boolean r1 = r0.equals(r1)
            if (r1 == 0) goto L34
        L50:
            r4 = 1
            return r4
        L52:
            return r2
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.core.content.p004pm.ShortcutManagerCompat.isRequestPinShortcutSupported(android.content.Context):boolean");
    }

    public static boolean pushDynamicShortcut(@NonNull Context context, @NonNull ShortcutInfoCompat shortcutInfoCompat) {
        Object systemService;
        boolean isRateLimitingActive;
        List dynamicShortcuts;
        Object systemService2;
        Preconditions.checkNotNull(context);
        Preconditions.checkNotNull(shortcutInfoCompat);
        int i = Build.VERSION.SDK_INT;
        if (i <= 32 && shortcutInfoCompat.isExcludedFromSurfaces(1)) {
            for (ShortcutInfoChangeListener shortcutInfoChangeListener : m57434e(context)) {
                shortcutInfoChangeListener.onShortcutAdded(Collections.singletonList(shortcutInfoCompat));
            }
            return true;
        }
        int maxShortcutCountPerActivity = getMaxShortcutCountPerActivity(context);
        if (maxShortcutCountPerActivity == 0) {
            return false;
        }
        if (i <= 29) {
            m57438a(context, shortcutInfoCompat);
        }
        if (i >= 30) {
            systemService2 = context.getSystemService(AbstractC20878lI1.m26528a());
            AbstractC22770wI1.m875a(systemService2).pushDynamicShortcut(shortcutInfoCompat.toShortcutInfo());
        } else if (i >= 25) {
            systemService = context.getSystemService(AbstractC20878lI1.m26528a());
            ShortcutManager m875a = AbstractC22770wI1.m875a(systemService);
            isRateLimitingActive = m875a.isRateLimitingActive();
            if (isRateLimitingActive) {
                return false;
            }
            dynamicShortcuts = m875a.getDynamicShortcuts();
            if (dynamicShortcuts.size() >= maxShortcutCountPerActivity) {
                m875a.removeDynamicShortcuts(Arrays.asList(C3973b.m57431a(dynamicShortcuts)));
            }
            m875a.addDynamicShortcuts(Arrays.asList(shortcutInfoCompat.toShortcutInfo()));
        }
        ShortcutInfoCompatSaver m57433f = m57433f(context);
        try {
            List<ShortcutInfoCompat> shortcuts = m57433f.getShortcuts();
            if (shortcuts.size() >= maxShortcutCountPerActivity) {
                m57433f.removeShortcuts(Arrays.asList(m57435d(shortcuts)));
            }
            m57433f.addShortcuts(Arrays.asList(shortcutInfoCompat));
            for (ShortcutInfoChangeListener shortcutInfoChangeListener2 : m57434e(context)) {
                shortcutInfoChangeListener2.onShortcutAdded(Collections.singletonList(shortcutInfoCompat));
            }
            reportShortcutUsed(context, shortcutInfoCompat.getId());
            return true;
        } catch (Exception unused) {
            for (ShortcutInfoChangeListener shortcutInfoChangeListener3 : m57434e(context)) {
                shortcutInfoChangeListener3.onShortcutAdded(Collections.singletonList(shortcutInfoCompat));
            }
            reportShortcutUsed(context, shortcutInfoCompat.getId());
            return false;
        } catch (Throwable th2) {
            for (ShortcutInfoChangeListener shortcutInfoChangeListener4 : m57434e(context)) {
                shortcutInfoChangeListener4.onShortcutAdded(Collections.singletonList(shortcutInfoCompat));
            }
            reportShortcutUsed(context, shortcutInfoCompat.getId());
            throw th2;
        }
    }

    public static void removeAllDynamicShortcuts(@NonNull Context context) {
        Object systemService;
        if (Build.VERSION.SDK_INT >= 25) {
            systemService = context.getSystemService(AbstractC20878lI1.m26528a());
            AbstractC22770wI1.m875a(systemService).removeAllDynamicShortcuts();
        }
        m57433f(context).removeAllShortcuts();
        for (ShortcutInfoChangeListener shortcutInfoChangeListener : m57434e(context)) {
            shortcutInfoChangeListener.onAllShortcutsRemoved();
        }
    }

    public static void removeDynamicShortcuts(@NonNull Context context, @NonNull List<String> list) {
        Object systemService;
        if (Build.VERSION.SDK_INT >= 25) {
            systemService = context.getSystemService(AbstractC20878lI1.m26528a());
            AbstractC22770wI1.m875a(systemService).removeDynamicShortcuts(list);
        }
        m57433f(context).removeShortcuts(list);
        for (ShortcutInfoChangeListener shortcutInfoChangeListener : m57434e(context)) {
            shortcutInfoChangeListener.onShortcutRemoved(list);
        }
    }

    public static void removeLongLivedShortcuts(@NonNull Context context, @NonNull List<String> list) {
        Object systemService;
        if (Build.VERSION.SDK_INT >= 30) {
            systemService = context.getSystemService(AbstractC20878lI1.m26528a());
            AbstractC22770wI1.m875a(systemService).removeLongLivedShortcuts(list);
            m57433f(context).removeShortcuts(list);
            for (ShortcutInfoChangeListener shortcutInfoChangeListener : m57434e(context)) {
                shortcutInfoChangeListener.onShortcutRemoved(list);
            }
            return;
        }
        removeDynamicShortcuts(context, list);
    }

    public static void reportShortcutUsed(@NonNull Context context, @NonNull String str) {
        Object systemService;
        Preconditions.checkNotNull(context);
        Preconditions.checkNotNull(str);
        if (Build.VERSION.SDK_INT >= 25) {
            systemService = context.getSystemService(AbstractC20878lI1.m26528a());
            AbstractC22770wI1.m875a(systemService).reportShortcutUsed(str);
        }
        for (ShortcutInfoChangeListener shortcutInfoChangeListener : m57434e(context)) {
            shortcutInfoChangeListener.onShortcutUsageReported(Collections.singletonList(str));
        }
    }

    public static boolean requestPinShortcut(@NonNull Context context, @NonNull ShortcutInfoCompat shortcutInfoCompat, @Nullable IntentSender intentSender) {
        Object systemService;
        boolean requestPinShortcut;
        int i = Build.VERSION.SDK_INT;
        if (i <= 32 && shortcutInfoCompat.isExcludedFromSurfaces(1)) {
            return false;
        }
        if (i >= 26) {
            systemService = context.getSystemService(AbstractC20878lI1.m26528a());
            requestPinShortcut = AbstractC22770wI1.m875a(systemService).requestPinShortcut(shortcutInfoCompat.toShortcutInfo(), intentSender);
            return requestPinShortcut;
        } else if (!isRequestPinShortcutSupported(context)) {
            return false;
        } else {
            Intent m57445a = shortcutInfoCompat.m57445a(new Intent("com.android.launcher.action.INSTALL_SHORTCUT"));
            if (intentSender == null) {
                context.sendBroadcast(m57445a);
                return true;
            }
            context.sendOrderedBroadcast(m57445a, null, new C3972a(intentSender), null, -1, null, null);
            return true;
        }
    }

    public static boolean setDynamicShortcuts(@NonNull Context context, @NonNull List<ShortcutInfoCompat> list) {
        Object systemService;
        boolean dynamicShortcuts;
        Preconditions.checkNotNull(context);
        Preconditions.checkNotNull(list);
        List<ShortcutInfoCompat> m57432g = m57432g(list, 1);
        if (Build.VERSION.SDK_INT >= 25) {
            ArrayList arrayList = new ArrayList(m57432g.size());
            for (ShortcutInfoCompat shortcutInfoCompat : m57432g) {
                arrayList.add(shortcutInfoCompat.toShortcutInfo());
            }
            systemService = context.getSystemService(AbstractC20878lI1.m26528a());
            dynamicShortcuts = AbstractC22770wI1.m875a(systemService).setDynamicShortcuts(arrayList);
            if (!dynamicShortcuts) {
                return false;
            }
        }
        m57433f(context).removeAllShortcuts();
        m57433f(context).addShortcuts(m57432g);
        for (ShortcutInfoChangeListener shortcutInfoChangeListener : m57434e(context)) {
            shortcutInfoChangeListener.onAllShortcutsRemoved();
            shortcutInfoChangeListener.onShortcutAdded(list);
        }
        return true;
    }

    public static boolean updateShortcuts(@NonNull Context context, @NonNull List<ShortcutInfoCompat> list) {
        Object systemService;
        boolean updateShortcuts;
        List<ShortcutInfoCompat> m57432g = m57432g(list, 1);
        int i = Build.VERSION.SDK_INT;
        if (i <= 29) {
            m57437b(context, m57432g);
        }
        if (i >= 25) {
            ArrayList arrayList = new ArrayList();
            for (ShortcutInfoCompat shortcutInfoCompat : m57432g) {
                arrayList.add(shortcutInfoCompat.toShortcutInfo());
            }
            systemService = context.getSystemService(AbstractC20878lI1.m26528a());
            updateShortcuts = AbstractC22770wI1.m875a(systemService).updateShortcuts(arrayList);
            if (!updateShortcuts) {
                return false;
            }
        }
        m57433f(context).addShortcuts(m57432g);
        for (ShortcutInfoChangeListener shortcutInfoChangeListener : m57434e(context)) {
            shortcutInfoChangeListener.onShortcutUpdated(list);
        }
        return true;
    }
}

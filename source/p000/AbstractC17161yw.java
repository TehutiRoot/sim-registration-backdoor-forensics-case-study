package p000;

import android.content.Context;
import android.content.Intent;
import android.content.pm.ActivityInfo;
import android.content.pm.PackageManager;
import android.content.pm.ResolveInfo;
import com.google.android.gms.common.GooglePlayServicesUtil;
import com.mixpanel.android.takeoverinapp.TakeoverInAppActivity;
import com.mixpanel.android.util.MPLog;
import java.util.HashSet;
import java.util.List;
import java.util.Set;

/* renamed from: yw */
/* loaded from: classes5.dex */
public abstract class AbstractC17161yw {

    /* renamed from: a */
    public static String f108941a = "MixpanelAPI.ConfigurationChecker";

    /* renamed from: b */
    public static Boolean f108942b;

    /* renamed from: a */
    public static boolean m161a(Context context) {
        PackageManager packageManager = context.getPackageManager();
        String packageName = context.getPackageName();
        if (packageManager != null && packageName != null) {
            if (packageManager.checkPermission("android.permission.INTERNET", packageName) != 0) {
                MPLog.m33451w(f108941a, "Package does not have permission android.permission.INTERNET - Mixpanel will not work at all!");
                MPLog.m33455i(f108941a, "You can fix this by adding the following to your AndroidManifest.xml file:\n<uses-permission android:name=\"android.permission.INTERNET\" />");
                return false;
            }
            return true;
        }
        MPLog.m33451w(f108941a, "Can't check configuration when using a Context with null packageManager or packageName");
        return false;
    }

    /* renamed from: b */
    public static boolean m160b(Context context) {
        boolean z;
        boolean z2;
        PackageManager packageManager = context.getPackageManager();
        String packageName = context.getPackageName();
        if (packageManager != null && packageName != null) {
            String str = packageName + ".permission.C2D_MESSAGE";
            try {
                packageManager.getPermissionInfo(str, 128);
                if (packageManager.checkPermission("com.google.android.c2dm.permission.RECEIVE", packageName) != 0) {
                    MPLog.m33451w(f108941a, "Package does not have permission com.google.android.c2dm.permission.RECEIVE");
                    MPLog.m33455i(f108941a, "You can fix this by adding the following to your AndroidManifest.xml file:\n<uses-permission android:name=\"com.google.android.c2dm.permission.RECEIVE\" />");
                    return false;
                } else if (packageManager.checkPermission("android.permission.INTERNET", packageName) != 0) {
                    MPLog.m33451w(f108941a, "Package does not have permission android.permission.INTERNET");
                    MPLog.m33455i(f108941a, "You can fix this by adding the following to your AndroidManifest.xml file:\n<uses-permission android:name=\"android.permission.INTERNET\" />");
                    return false;
                } else if (packageManager.checkPermission("android.permission.WAKE_LOCK", packageName) != 0) {
                    MPLog.m33451w(f108941a, "Package does not have permission android.permission.WAKE_LOCK");
                    MPLog.m33455i(f108941a, "You can fix this by adding the following to your AndroidManifest.xml file:\n<uses-permission android:name=\"android.permission.WAKE_LOCK\" />");
                    return false;
                } else {
                    try {
                        ActivityInfo[] activityInfoArr = packageManager.getPackageInfo(packageName, 2).receivers;
                        if (activityInfoArr != null && activityInfoArr.length != 0) {
                            HashSet hashSet = new HashSet();
                            for (ActivityInfo activityInfo : activityInfoArr) {
                                if ("com.google.android.c2dm.permission.SEND".equals(activityInfo.permission)) {
                                    hashSet.add(activityInfo.name);
                                }
                            }
                            if (hashSet.isEmpty()) {
                                MPLog.m33451w(f108941a, "No receiver allowed to receive com.google.android.c2dm.permission.SEND");
                                MPLog.m33455i(f108941a, "You can fix by pasting the following into the <application> tag in your AndroidManifest.xml:\n" + m157e(packageName));
                                return false;
                            } else if (!m159c(context, hashSet, "com.google.android.c2dm.intent.RECEIVE")) {
                                return false;
                            } else {
                                try {
                                    String str2 = GooglePlayServicesUtil.GMS_ERROR_DIALOG;
                                    z = true;
                                } catch (ClassNotFoundException unused) {
                                    MPLog.m33451w(f108941a, "Google Play Services aren't included in your build- push notifications won't work on Lollipop/API 21 or greater");
                                    MPLog.m33455i(f108941a, "You can fix this by adding com.google.android.gms:play-services as a dependency of your gradle or maven project");
                                    z = false;
                                }
                                if (!m159c(context, hashSet, "com.google.android.c2dm.intent.REGISTRATION")) {
                                    MPLog.m33455i(f108941a, "(You can still receive push notifications on Lollipop/API 21 or greater with this configuration)");
                                    z2 = false;
                                } else {
                                    z2 = true;
                                }
                                if (z || z2) {
                                    return true;
                                }
                                return false;
                            }
                        }
                        MPLog.m33451w(f108941a, "No receiver for package " + packageName);
                        MPLog.m33455i(f108941a, "You can fix this with the following into your <application> tag:\n" + m157e(packageName));
                        return false;
                    } catch (PackageManager.NameNotFoundException unused2) {
                        MPLog.m33451w(f108941a, "Could not get receivers for package " + packageName);
                        return false;
                    }
                }
            } catch (PackageManager.NameNotFoundException unused3) {
                MPLog.m33451w(f108941a, "Application does not define permission " + str);
                MPLog.m33455i(f108941a, "You will need to add the following lines to your application manifest:\n<permission android:name=\"" + packageName + ".permission.C2D_MESSAGE\" android:protectionLevel=\"signature\" />\n<uses-permission android:name=\"" + packageName + ".permission.C2D_MESSAGE\" />");
                return false;
            }
        }
        MPLog.m33451w(f108941a, "Can't check configuration when using a Context with null packageManager or packageName");
        return false;
    }

    /* renamed from: c */
    public static boolean m159c(Context context, Set set, String str) {
        PackageManager packageManager = context.getPackageManager();
        String packageName = context.getPackageName();
        Intent intent = new Intent(str);
        intent.setPackage(packageName);
        List<ResolveInfo> queryBroadcastReceivers = packageManager.queryBroadcastReceivers(intent, 128);
        if (queryBroadcastReceivers.isEmpty()) {
            String str2 = f108941a;
            MPLog.m33451w(str2, "No receivers for action " + str);
            String str3 = f108941a;
            MPLog.m33455i(str3, "You can fix by pasting the following into the <application> tag in your AndroidManifest.xml:\n" + m157e(packageName));
            return false;
        }
        for (ResolveInfo resolveInfo : queryBroadcastReceivers) {
            String str4 = resolveInfo.activityInfo.name;
            if (!set.contains(str4)) {
                String str5 = f108941a;
                MPLog.m33451w(str5, "Receiver " + str4 + " is not set with permission com.google.android.c2dm.permission.SEND");
                MPLog.m33455i(f108941a, "Please add the attribute 'android:permission=\"com.google.android.c2dm.permission.SEND\"' to your <receiver> tag");
                return false;
            }
        }
        return true;
    }

    /* renamed from: d */
    public static boolean m158d(Context context) {
        if (f108942b == null) {
            Intent intent = new Intent(context, TakeoverInAppActivity.class);
            intent.addFlags(268435456);
            intent.addFlags(131072);
            if (context.getPackageManager().queryIntentActivities(intent, 0).size() == 0) {
                String str = f108941a;
                MPLog.m33451w(str, TakeoverInAppActivity.class.getName() + " is not registered as an activity in your application, so takeover in-apps can't be shown.");
                MPLog.m33455i(f108941a, "Please add the child tag <activity android:name=\"com.mixpanel.android.takeoverinapp.TakeoverInAppActivity\" /> to your <application> tag.");
                Boolean bool = Boolean.FALSE;
                f108942b = bool;
                return bool.booleanValue();
            }
            f108942b = Boolean.TRUE;
        }
        return f108942b.booleanValue();
    }

    /* renamed from: e */
    public static String m157e(String str) {
        return "<receiver android:name=\"com.mixpanel.android.mpmetrics.GCMReceiver\"\n          android:permission=\"com.google.android.c2dm.permission.SEND\" >\n    <intent-filter>\n       <action android:name=\"com.google.android.c2dm.intent.RECEIVE\" />\n       <action android:name=\"com.google.android.c2dm.intent.REGISTRATION\" />\n       <category android:name=\"" + str + "\" />\n    </intent-filter>\n</receiver>";
    }
}

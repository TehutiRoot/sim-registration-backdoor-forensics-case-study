package com.netcetera.threeds.sdk.infrastructure;

import android.annotation.SuppressLint;
import android.content.Context;
import android.content.Intent;
import android.content.pm.PackageManager;
import android.content.pm.ResolveInfo;
import android.graphics.Color;
import android.net.Uri;
import android.os.Process;
import android.text.TextUtils;
import android.view.MotionEvent;
import android.view.View;
import android.view.ViewConfiguration;
import com.tom_roush.fontbox.ttf.WGL4Names;
import java.util.HashSet;
import java.util.List;
import th.p047co.dtac.android.dtacone.view.activity.CameraActivity;

/* loaded from: classes5.dex */
public class setPaintFlags extends setLinkTextColor {
    private static final String ThreeDS2ServiceInstance;
    private static int get = 1;
    private static int valueOf;
    public static int values;

    static {
        valueOf();
        Object[] objArr = new Object[1];
        valueOf(MotionEvent.axisFromString("") + 4, 17 - (ViewConfiguration.getMaximumFlingVelocity() >> 16), "\u0005\u0011\u000f\n\u0016\u0016\u0012ￜ\uffd1\uffd1\t\u0011\u0011\t\u000e\u0007\uffd0", 258 - TextUtils.getOffsetBefore("", 0), false, objArr);
        ThreeDS2ServiceInstance = ((String) objArr[0]).intern();
        int i = get + 119;
        valueOf = i % 128;
        if (i % 2 != 0) {
            throw null;
        }
    }

    public setPaintFlags(String str) {
        super(str);
    }

    public static void valueOf() {
        values = 164;
    }

    @Override // com.netcetera.threeds.sdk.infrastructure.setLinkTextColor
    public void ThreeDS2Service(Context context, Intent intent) {
        valueOf = (get + 97) % 128;
        intent.setPackage(values(intent, context));
        int i = get + 109;
        valueOf = i % 128;
        if (i % 2 == 0) {
            return;
        }
        throw null;
    }

    @SuppressLint({"QueryPermissionsNeeded"})
    public String values(Intent intent, Context context) {
        PackageManager packageManager = context.getPackageManager();
        Object[] objArr = new Object[1];
        valueOf(24 - (Process.getElapsedCpuTime() > 0L ? 1 : (Process.getElapsedCpuTime() == 0L ? 0 : -1)), 26 - TextUtils.getOffsetBefore("", 0), "\ufff7ￏ\u000f\u0010\n\u0015\u0004\u0002ￏ\u0015\u000f\u0006\u0015\u000f\nￏ\u0005\n\u0010\u0013\u0005\u000f\u0002\ufff8￦￪", 260 - (ViewConfiguration.getGlobalActionKeyTimeout() > 0L ? 1 : (ViewConfiguration.getGlobalActionKeyTimeout() == 0L ? 0 : -1)), true, objArr);
        String intern = ((String) objArr[0]).intern();
        Object[] objArr2 = new Object[1];
        valueOf((ViewConfiguration.getMaximumDrawingCacheSize() >> 24) + 3, 17 - Color.blue(0), "\u0005\u0011\u000f\n\u0016\u0016\u0012ￜ\uffd1\uffd1\t\u0011\u0011\t\u000e\u0007\uffd0", View.getDefaultSize(0, 0) + WGL4Names.NUMBER_OF_MAC_GLYPHS, false, objArr2);
        String valueOf2 = valueOf(packageManager.queryIntentActivities(new Intent(intern, Uri.parse(((String) objArr2[0]).intern())), 65536), packageManager.queryIntentActivities(intent, 65536));
        get = (valueOf + CameraActivity.REQUEST_CODE) % 128;
        return valueOf2;
    }

    private String valueOf(List<ResolveInfo> list, List<ResolveInfo> list2) {
        HashSet hashSet = new HashSet();
        HashSet hashSet2 = new HashSet();
        for (ResolveInfo resolveInfo : list) {
            valueOf = (get + 15) % 128;
            hashSet.add(resolveInfo.activityInfo.packageName);
            valueOf = (get + 111) % 128;
        }
        get = (valueOf + 95) % 128;
        for (ResolveInfo resolveInfo2 : list2) {
            hashSet2.add(resolveInfo2.activityInfo.packageName);
        }
        hashSet2.removeAll(hashSet);
        if (!hashSet2.isEmpty()) {
            return (String) hashSet2.iterator().next();
        }
        return "";
    }

    /* JADX WARN: Code restructure failed: missing block: B:0:?, code lost:
        r8 = r8;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    private static void valueOf(int r6, int r7, java.lang.String r8, int r9, boolean r10, java.lang.Object[] r11) {
        /*
            if (r8 == 0) goto L6
            char[] r8 = r8.toCharArray()
        L6:
            char[] r8 = (char[]) r8
            java.lang.Object r0 = com.netcetera.threeds.sdk.infrastructure.apiKey.get
            monitor-enter(r0)
            char[] r1 = new char[r7]     // Catch: java.lang.Throwable -> L2f
            r2 = 0
            com.netcetera.threeds.sdk.infrastructure.apiKey.ThreeDS2ServiceInstance = r2     // Catch: java.lang.Throwable -> L2f
        L10:
            int r3 = com.netcetera.threeds.sdk.infrastructure.apiKey.ThreeDS2ServiceInstance     // Catch: java.lang.Throwable -> L2f
            if (r3 >= r7) goto L31
            char r3 = r8[r3]     // Catch: java.lang.Throwable -> L2f
            com.netcetera.threeds.sdk.infrastructure.apiKey.valueOf = r3     // Catch: java.lang.Throwable -> L2f
            int r3 = com.netcetera.threeds.sdk.infrastructure.apiKey.ThreeDS2ServiceInstance     // Catch: java.lang.Throwable -> L2f
            int r4 = com.netcetera.threeds.sdk.infrastructure.apiKey.valueOf     // Catch: java.lang.Throwable -> L2f
            int r4 = r4 + r9
            char r4 = (char) r4     // Catch: java.lang.Throwable -> L2f
            r1[r3] = r4     // Catch: java.lang.Throwable -> L2f
            int r3 = com.netcetera.threeds.sdk.infrastructure.apiKey.ThreeDS2ServiceInstance     // Catch: java.lang.Throwable -> L2f
            char r4 = r1[r3]     // Catch: java.lang.Throwable -> L2f
            int r5 = com.netcetera.threeds.sdk.infrastructure.setPaintFlags.values     // Catch: java.lang.Throwable -> L2f
            int r4 = r4 - r5
            char r4 = (char) r4     // Catch: java.lang.Throwable -> L2f
            r1[r3] = r4     // Catch: java.lang.Throwable -> L2f
            int r3 = r3 + 1
            com.netcetera.threeds.sdk.infrastructure.apiKey.ThreeDS2ServiceInstance = r3     // Catch: java.lang.Throwable -> L2f
            goto L10
        L2f:
            r6 = move-exception
            goto L69
        L31:
            if (r6 <= 0) goto L48
            com.netcetera.threeds.sdk.infrastructure.apiKey.values = r6     // Catch: java.lang.Throwable -> L2f
            char[] r6 = new char[r7]     // Catch: java.lang.Throwable -> L2f
            java.lang.System.arraycopy(r1, r2, r6, r2, r7)     // Catch: java.lang.Throwable -> L2f
            int r8 = com.netcetera.threeds.sdk.infrastructure.apiKey.values     // Catch: java.lang.Throwable -> L2f
            int r9 = r7 - r8
            java.lang.System.arraycopy(r6, r2, r1, r9, r8)     // Catch: java.lang.Throwable -> L2f
            int r8 = com.netcetera.threeds.sdk.infrastructure.apiKey.values     // Catch: java.lang.Throwable -> L2f
            int r9 = r7 - r8
            java.lang.System.arraycopy(r6, r8, r1, r2, r9)     // Catch: java.lang.Throwable -> L2f
        L48:
            if (r10 == 0) goto L60
            char[] r6 = new char[r7]     // Catch: java.lang.Throwable -> L2f
            com.netcetera.threeds.sdk.infrastructure.apiKey.ThreeDS2ServiceInstance = r2     // Catch: java.lang.Throwable -> L2f
        L4e:
            int r8 = com.netcetera.threeds.sdk.infrastructure.apiKey.ThreeDS2ServiceInstance     // Catch: java.lang.Throwable -> L2f
            if (r8 >= r7) goto L5f
            int r9 = r7 - r8
            int r9 = r9 + (-1)
            char r9 = r1[r9]     // Catch: java.lang.Throwable -> L2f
            r6[r8] = r9     // Catch: java.lang.Throwable -> L2f
            int r8 = r8 + 1
            com.netcetera.threeds.sdk.infrastructure.apiKey.ThreeDS2ServiceInstance = r8     // Catch: java.lang.Throwable -> L2f
            goto L4e
        L5f:
            r1 = r6
        L60:
            java.lang.String r6 = new java.lang.String     // Catch: java.lang.Throwable -> L2f
            r6.<init>(r1)     // Catch: java.lang.Throwable -> L2f
            monitor-exit(r0)     // Catch: java.lang.Throwable -> L2f
            r11[r2] = r6
            return
        L69:
            monitor-exit(r0)
            throw r6
        */
        throw new UnsupportedOperationException("Method not decompiled: com.netcetera.threeds.sdk.infrastructure.setPaintFlags.valueOf(int, int, java.lang.String, int, boolean, java.lang.Object[]):void");
    }
}

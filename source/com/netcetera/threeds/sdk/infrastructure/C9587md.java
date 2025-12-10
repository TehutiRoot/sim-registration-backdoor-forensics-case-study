package com.netcetera.threeds.sdk.infrastructure;

import android.app.Activity;
import android.graphics.Color;
import android.os.SystemClock;
import android.text.AndroidCharacter;
import android.text.TextUtils;
import android.view.KeyEvent;
import android.view.MotionEvent;
import android.view.View;
import android.view.ViewConfiguration;
import android.widget.ExpandableListView;
import androidx.appcompat.app.AppCompatActivity;

/* renamed from: com.netcetera.threeds.sdk.infrastructure.md */
/* loaded from: classes5.dex */
public class C9587md implements InterfaceC9588me<Activity> {
    private static int get = 0;
    private static int getSDKVersion = 1;
    public static int valueOf = 167;
    private final InterfaceC9588me<Activity> ThreeDS2Service;
    private final InterfaceC9652ns ThreeDS2ServiceInstance = C9653nt.ThreeDS2ServiceInstance(InterfaceC9588me.class);
    private final InterfaceC9588me<AppCompatActivity> values;

    public C9587md(InterfaceC9588me<Activity> interfaceC9588me, InterfaceC9588me<AppCompatActivity> interfaceC9588me2) {
        this.ThreeDS2Service = interfaceC9588me;
        this.values = interfaceC9588me2;
    }

    private boolean ThreeDS2Service(Activity activity) {
        boolean z = false;
        Object[] objArr = new Object[1];
        ThreeDS2Service(18 - (ExpandableListView.getPackedPositionForChild(0, 0) > 0L ? 1 : (ExpandableListView.getPackedPositionForChild(0, 0) == 0L ? 0 : -1)), (ViewConfiguration.getMinimumFlingVelocity() >> 16) + 40, "ￊ\u0010�\f\t\u000b\uffff\f\f�ￊ\u0014\u0000\u0005\u000b\u000e\u0000\n�\u0015\u0010\u0005\u0012\u0005\u0010\uffff\uffdd\u0010�\f\t\u000b\uffdf\f\f\uffddￊ\f\f�", 267 - Color.blue(0), true, objArr);
        if (C9600mq.ThreeDS2Service(((String) objArr[0]).intern()) && (activity instanceof AppCompatActivity)) {
            getSDKVersion = (get + 65) % 128;
            z = true;
        }
        get = (getSDKVersion + 55) % 128;
        return z;
    }

    public static InterfaceC9588me<Activity> values() {
        C9587md c9587md = new C9587md(new C9586mc(), new C9589mf());
        get = (getSDKVersion + 99) % 128;
        return c9587md;
    }

    @Override // com.netcetera.threeds.sdk.infrastructure.InterfaceC9588me
    public void ThreeDS2ServiceInstance(Activity activity, InterfaceC9602ms interfaceC9602ms) {
        get = (getSDKVersion + 101) % 128;
        if (!ThreeDS2Service(activity)) {
            InterfaceC9652ns interfaceC9652ns = this.ThreeDS2ServiceInstance;
            Object[] objArr = new Object[1];
            ThreeDS2Service(24 - TextUtils.lastIndexOf("", '0', 0, 0), AndroidCharacter.getMirror('0') + '@', "\uffc0\u0013\t\uffc0\u0019\u0014\t\u0016\t\u0014\u0003\u0001\uffc0\u0004\u0005\u0004\t\u0016\u000f\u0012\u0010\uffc0\u0005\b\ufff4\u0019\u0014\t\u0016\t\u0014\u0003￡ￎ\u0010\u0010\u0001ￎ\u0004\t\u000f\u0012\u0004\u000e\u0001\uffc0\u0019\u0003\u0001\u0007\u0005\f\uffc0\u0007\u000e\t\u0013\u0015\uffc0ￌ\u0019\u0014\t\u0016\t\u0014\u0003￡\u0014\u0001\u0010\r\u000f￣\u0010\u0010￡ￎ\u0010\u0010\u0001ￎ\u0014\u0001\u0010\r\u000f\u0003\u0010\u0010\u0001ￎ\u0018\u0004\t\u000f\u0012\u0004\u000e\u0001\uffc0\u0005\u0010\u0019\u0014\uffc0\u0006\u000f\uffc0\u0014\u000f\u000e", View.getDefaultSize(0, 0) + 263, true, objArr);
            interfaceC9652ns.valueOf(((String) objArr[0]).intern());
            this.ThreeDS2Service.ThreeDS2ServiceInstance(activity, interfaceC9602ms);
            return;
        }
        int i = get + 111;
        getSDKVersion = i % 128;
        if (i % 2 == 0) {
            MotionEvent.axisFromString("");
            SystemClock.currentThreadTimeMillis();
            View.combineMeasuredStates(1, 0);
            this.values.ThreeDS2ServiceInstance((AppCompatActivity) activity, interfaceC9602ms);
            return;
        }
        MotionEvent.axisFromString("");
        SystemClock.currentThreadTimeMillis();
        View.combineMeasuredStates(0, 0);
        this.values.ThreeDS2ServiceInstance((AppCompatActivity) activity, interfaceC9602ms);
    }

    /* JADX WARN: Code restructure failed: missing block: B:0:?, code lost:
        r8 = r8;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    private static void ThreeDS2Service(int r6, int r7, java.lang.String r8, int r9, boolean r10, java.lang.Object[] r11) {
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
            int r5 = com.netcetera.threeds.sdk.infrastructure.C9587md.valueOf     // Catch: java.lang.Throwable -> L2f
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
        throw new UnsupportedOperationException("Method not decompiled: com.netcetera.threeds.sdk.infrastructure.C9587md.ThreeDS2Service(int, int, java.lang.String, int, boolean, java.lang.Object[]):void");
    }

    @Override // com.netcetera.threeds.sdk.infrastructure.InterfaceC9588me
    public boolean ThreeDS2ServiceInstance(Activity activity) {
        boolean ThreeDS2ServiceInstance;
        if (!ThreeDS2Service(activity)) {
            InterfaceC9652ns interfaceC9652ns = this.ThreeDS2ServiceInstance;
            Object[] objArr = new Object[1];
            ThreeDS2Service(25 - View.MeasureSpec.makeMeasureSpec(0, 0), 111 - (ExpandableListView.getPackedPositionForChild(0, 0) > 0L ? 1 : (ExpandableListView.getPackedPositionForChild(0, 0) == 0L ? 0 : -1)), "\uffc0\u0013\t\uffc0\u0019\u0014\t\u0016\t\u0014\u0003\u0001\uffc0\u0004\u0005\u0004\t\u0016\u000f\u0012\u0010\uffc0\u0005\b\ufff4\u0019\u0014\t\u0016\t\u0014\u0003￡ￎ\u0010\u0010\u0001ￎ\u0004\t\u000f\u0012\u0004\u000e\u0001\uffc0\u0019\u0003\u0001\u0007\u0005\f\uffc0\u0007\u000e\t\u0013\u0015\uffc0ￌ\u0019\u0014\t\u0016\t\u0014\u0003￡\u0014\u0001\u0010\r\u000f￣\u0010\u0010￡ￎ\u0010\u0010\u0001ￎ\u0014\u0001\u0010\r\u000f\u0003\u0010\u0010\u0001ￎ\u0018\u0004\t\u000f\u0012\u0004\u000e\u0001\uffc0\u0005\u0010\u0019\u0014\uffc0\u0006\u000f\uffc0\u0014\u000f\u000e", ((byte) KeyEvent.getModifierMetaStateMask()) + 264, true, objArr);
            interfaceC9652ns.valueOf(((String) objArr[0]).intern());
            return this.ThreeDS2Service.ThreeDS2ServiceInstance(activity);
        }
        int i = get + 119;
        getSDKVersion = i % 128;
        if (i % 2 == 0) {
            ViewConfiguration.getKeyRepeatTimeout();
            ViewConfiguration.getMinimumFlingVelocity();
            ExpandableListView.getPackedPositionForGroup(1);
            ThreeDS2ServiceInstance = this.values.ThreeDS2ServiceInstance((AppCompatActivity) activity);
        } else {
            ViewConfiguration.getKeyRepeatTimeout();
            ViewConfiguration.getMinimumFlingVelocity();
            ExpandableListView.getPackedPositionForGroup(0);
            ThreeDS2ServiceInstance = this.values.ThreeDS2ServiceInstance((AppCompatActivity) activity);
        }
        get = (getSDKVersion + 37) % 128;
        return ThreeDS2ServiceInstance;
    }
}

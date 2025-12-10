package com.mixpanel.android.mpmetrics;

import android.content.Context;
import com.mixpanel.android.util.MPLog;
import com.mixpanel.android.viewcrawler.UpdatesFromMixpanel;
import java.util.HashSet;
import java.util.LinkedList;
import java.util.List;
import java.util.Set;
import org.json.JSONArray;

/* loaded from: classes5.dex */
public class DecideMessages {

    /* renamed from: k */
    public static final Set f58495k = new HashSet();

    /* renamed from: b */
    public final String f58497b;

    /* renamed from: c */
    public final Set f58498c;

    /* renamed from: e */
    public final OnNewResultsListener f58500e;

    /* renamed from: f */
    public final UpdatesFromMixpanel f58501f;

    /* renamed from: h */
    public Boolean f58503h;

    /* renamed from: i */
    public Context f58504i;

    /* renamed from: a */
    public String f58496a = null;

    /* renamed from: d */
    public final List f58499d = new LinkedList();

    /* renamed from: g */
    public JSONArray f58502g = null;

    /* renamed from: j */
    public Set f58505j = new HashSet();

    /* loaded from: classes5.dex */
    public interface OnNewResultsListener {
        void onNewConnectIntegrations();

        void onNewResults();
    }

    public DecideMessages(Context context, String str, OnNewResultsListener onNewResultsListener, UpdatesFromMixpanel updatesFromMixpanel, HashSet hashSet) {
        this.f58504i = context;
        this.f58497b = str;
        this.f58500e = onNewResultsListener;
        this.f58501f = updatesFromMixpanel;
        this.f58498c = new HashSet(hashSet);
    }

    /* renamed from: a */
    public synchronized String m33659a() {
        return this.f58496a;
    }

    /* renamed from: b */
    public synchronized Set m33658b() {
        return this.f58505j;
    }

    /* JADX WARN: Code restructure failed: missing block: B:10:0x0022, code lost:
        r2.f58499d.remove(r0);
     */
    /* JADX WARN: Code restructure failed: missing block: B:8:0x0018, code lost:
        r3 = (com.mixpanel.android.mpmetrics.InAppNotification) r2.f58499d.get(r0);
     */
    /* JADX WARN: Code restructure failed: missing block: B:9:0x0020, code lost:
        if (r4 != false) goto L14;
     */
    /* renamed from: c */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public synchronized com.mixpanel.android.mpmetrics.InAppNotification m33657c(int r3, boolean r4) {
        /*
            r2 = this;
            monitor-enter(r2)
            r0 = 0
        L2:
            java.util.List r1 = r2.f58499d     // Catch: java.lang.Throwable -> L28
            int r1 = r1.size()     // Catch: java.lang.Throwable -> L28
            if (r0 >= r1) goto L2d
            java.util.List r1 = r2.f58499d     // Catch: java.lang.Throwable -> L28
            java.lang.Object r1 = r1.get(r0)     // Catch: java.lang.Throwable -> L28
            com.mixpanel.android.mpmetrics.InAppNotification r1 = (com.mixpanel.android.mpmetrics.InAppNotification) r1     // Catch: java.lang.Throwable -> L28
            int r1 = r1.getId()     // Catch: java.lang.Throwable -> L28
            if (r1 != r3) goto L2a
            java.util.List r3 = r2.f58499d     // Catch: java.lang.Throwable -> L28
            java.lang.Object r3 = r3.get(r0)     // Catch: java.lang.Throwable -> L28
            com.mixpanel.android.mpmetrics.InAppNotification r3 = (com.mixpanel.android.mpmetrics.InAppNotification) r3     // Catch: java.lang.Throwable -> L28
            if (r4 != 0) goto L2e
            java.util.List r4 = r2.f58499d     // Catch: java.lang.Throwable -> L28
            r4.remove(r0)     // Catch: java.lang.Throwable -> L28
            goto L2e
        L28:
            r3 = move-exception
            goto L30
        L2a:
            int r0 = r0 + 1
            goto L2
        L2d:
            r3 = 0
        L2e:
            monitor-exit(r2)
            return r3
        L30:
            monitor-exit(r2)     // Catch: java.lang.Throwable -> L28
            throw r3
        */
        throw new UnsupportedOperationException("Method not decompiled: com.mixpanel.android.mpmetrics.DecideMessages.m33657c(int, boolean):com.mixpanel.android.mpmetrics.InAppNotification");
    }

    /* renamed from: d */
    public synchronized InAppNotification m33656d(boolean z) {
        if (this.f58499d.isEmpty()) {
            MPLog.m33453v("MixpanelAPI.DecideUpdts", "No unseen notifications exist, none will be returned.");
            return null;
        }
        InAppNotification inAppNotification = (InAppNotification) this.f58499d.remove(0);
        if (z) {
            this.f58499d.add(inAppNotification);
        } else {
            MPLog.m33453v("MixpanelAPI.DecideUpdts", "Recording notification " + inAppNotification + " as seen.");
        }
        return inAppNotification;
    }

    /* renamed from: e */
    public String m33655e() {
        return this.f58497b;
    }

    /* renamed from: f */
    public synchronized JSONArray m33654f() {
        return this.f58502g;
    }

    /* JADX WARN: Code restructure failed: missing block: B:8:0x0011, code lost:
        if (r0.length() > 0) goto L14;
     */
    /* renamed from: g */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public synchronized boolean m33653g() {
        /*
            r1 = this;
            monitor-enter(r1)
            java.util.List r0 = r1.f58499d     // Catch: java.lang.Throwable -> L14
            boolean r0 = r0.isEmpty()     // Catch: java.lang.Throwable -> L14
            if (r0 == 0) goto L18
            org.json.JSONArray r0 = r1.f58502g     // Catch: java.lang.Throwable -> L14
            if (r0 == 0) goto L16
            int r0 = r0.length()     // Catch: java.lang.Throwable -> L14
            if (r0 <= 0) goto L16
            goto L18
        L14:
            r0 = move-exception
            goto L1b
        L16:
            r0 = 0
            goto L19
        L18:
            r0 = 1
        L19:
            monitor-exit(r1)
            return r0
        L1b:
            monitor-exit(r1)     // Catch: java.lang.Throwable -> L14
            throw r0
        */
        throw new UnsupportedOperationException("Method not decompiled: com.mixpanel.android.mpmetrics.DecideMessages.m33653g():boolean");
    }

    /* renamed from: h */
    public Boolean m33652h() {
        return this.f58503h;
    }

    /* renamed from: i */
    public synchronized void m33651i(InAppNotification inAppNotification) {
        if (!MPConfig.DEBUG) {
            this.f58499d.add(inAppNotification);
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:65:0x00f7 A[EXC_TOP_SPLITTER, SYNTHETIC] */
    /* renamed from: j */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public synchronized void m33650j(java.util.List r9, org.json.JSONArray r10, org.json.JSONArray r11, boolean r12, org.json.JSONArray r13) {
        /*
            Method dump skipped, instructions count: 373
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: com.mixpanel.android.mpmetrics.DecideMessages.m33650j(java.util.List, org.json.JSONArray, org.json.JSONArray, boolean, org.json.JSONArray):void");
    }

    /* renamed from: k */
    public synchronized void m33649k(String str) {
        try {
            String str2 = this.f58496a;
            if (str2 != null) {
                if (!str2.equals(str)) {
                }
                this.f58496a = str;
            }
            this.f58499d.clear();
            this.f58496a = str;
        } catch (Throwable th2) {
            throw th2;
        }
    }

    /* renamed from: l */
    public boolean m33648l() {
        if (m33652h() == null) {
            return true;
        }
        return m33652h().booleanValue();
    }
}

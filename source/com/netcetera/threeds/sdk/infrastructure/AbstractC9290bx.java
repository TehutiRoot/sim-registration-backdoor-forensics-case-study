package com.netcetera.threeds.sdk.infrastructure;

import android.annotation.SuppressLint;
import android.content.Context;
import android.content.res.Resources;
import android.graphics.ImageFormat;
import android.text.TextUtils;
import android.view.View;
import android.view.ViewConfiguration;
import android.view.ViewGroup;
import android.widget.ScrollView;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

/* renamed from: com.netcetera.threeds.sdk.infrastructure.bx */
/* loaded from: classes5.dex */
public abstract class AbstractC9290bx implements getOrDefault {
    public static char ThreeDS2Service = 56258;
    public static char ThreeDS2ServiceInstance = 25941;
    public static char get = 57146;
    private static int onCompleted = 0;
    private static int onError = 1;
    public static char valueOf = 1433;
    private ViewGroup ThreeDS2Service$InitializationCallback;
    private final Context getSDKInfo;
    private ScrollView getSDKVersion;
    protected final InterfaceC9652ns values = C9653nt.ThreeDS2ServiceInstance(AbstractC9290bx.class);
    private final List<contains> cleanup = new ArrayList();
    private final List<InterfaceC9367elements> initialize = new ArrayList();
    private final C9347dw getWarnings = new C9347dw();

    public AbstractC9290bx(Context context) {
        this.getSDKInfo = context;
    }

    @Override // com.netcetera.threeds.sdk.infrastructure.getOrDefault
    public final View ThreeDS2Service() {
        if (this.getSDKVersion == null) {
            onCompleted = (onError + 49) % 128;
            valueOf();
            onError = (onCompleted + 3) % 128;
        }
        return this.getSDKVersion;
    }

    public abstract void ThreeDS2ServiceInstance(Context context);

    @Override // com.netcetera.threeds.sdk.infrastructure.getOrDefault
    public void ThreeDS2ServiceInstance(InterfaceC9370eo interfaceC9370eo) {
        int i = onCompleted + 1;
        onError = i % 128;
        if (i % 2 != 0) {
            for (contains containsVar : this.cleanup) {
                onError = (onCompleted + 79) % 128;
                if (!(!(containsVar instanceof save))) {
                    ((save) containsVar).valueOf(interfaceC9370eo);
                }
            }
            return;
        }
        this.cleanup.iterator();
        throw null;
    }

    public abstract ViewGroup get(Context context);

    @Override // com.netcetera.threeds.sdk.infrastructure.getOrDefault
    public void get(getServices getservices) {
        Iterator<contains> it = this.cleanup.iterator();
        while (!(!it.hasNext())) {
            onCompleted = (onError + 47) % 128;
            contains next = it.next();
            if (next instanceof containsValue) {
                int i = onCompleted + 51;
                onError = i % 128;
                int i2 = i % 2;
                ((containsValue) next).values(getservices);
                if (i2 == 0) {
                    int i3 = 10 / 0;
                }
                onCompleted = (onError + 61) % 128;
            }
        }
    }

    @Override // com.netcetera.threeds.sdk.infrastructure.getOrDefault
    public void valueOf(InterfaceC9311compute interfaceC9311compute, setAllCaps setallcaps) {
        if (this.getSDKVersion == null) {
            onCompleted = (onError + 33) % 128;
            valueOf();
        }
        this.getWarnings.get(interfaceC9311compute);
        onError = (onCompleted + 111) % 128;
        for (contains containsVar : this.cleanup) {
            containsVar.valueOf(setallcaps);
        }
    }

    @Override // com.netcetera.threeds.sdk.infrastructure.getOrDefault
    public void values() {
        onError = (onCompleted + 97) % 128;
        onCompleted = (onError + 95) % 128;
        for (contains containsVar : this.cleanup) {
            if (!(!(containsVar instanceof containsValue))) {
                ((containsValue) containsVar).valueOf();
            }
        }
    }

    public final void ThreeDS2Service(InterfaceC9367elements interfaceC9367elements) {
        int i = onCompleted + 69;
        onError = i % 128;
        if (i % 2 != 0) {
            this.initialize.add(interfaceC9367elements);
        } else {
            this.initialize.add(interfaceC9367elements);
            throw null;
        }
    }

    @Override // com.netcetera.threeds.sdk.infrastructure.InterfaceC9367elements
    public keys get(keys keysVar) {
        onCompleted = (onError + 83) % 128;
        Iterator<InterfaceC9367elements> it = this.initialize.iterator();
        onCompleted = (onError + 63) % 128;
        while (it.hasNext()) {
            int i = onCompleted + 11;
            onError = i % 128;
            if (i % 2 != 0) {
                keysVar = it.next().get(keysVar);
            } else {
                it.next().get(keysVar);
                throw null;
            }
        }
        int i2 = onError + 119;
        onCompleted = i2 % 128;
        if (i2 % 2 == 0) {
            return keysVar;
        }
        throw null;
    }

    @Override // com.netcetera.threeds.sdk.infrastructure.getOrDefault
    public void values(InterfaceC9373er interfaceC9373er) {
        Iterator<contains> it = this.cleanup.iterator();
        while (it.hasNext()) {
            int i = onError + 113;
            onCompleted = i % 128;
            if (i % 2 == 0) {
                contains next = it.next();
                if (next instanceof save) {
                    ((save) next).values(interfaceC9373er);
                    onError = (onCompleted + 99) % 128;
                }
                onError = (onCompleted + 103) % 128;
            } else {
                boolean z = it.next() instanceof save;
                throw null;
            }
        }
    }

    private void valueOf() {
        this.getSDKVersion = new ScrollView(this.getSDKInfo);
        ViewGroup.LayoutParams layoutParams = new ViewGroup.LayoutParams(-1, -1);
        this.getSDKVersion.setFillViewport(true);
        this.getSDKVersion.setLayoutParams(layoutParams);
        ScrollView scrollView = this.getSDKVersion;
        Object[] objArr = new Object[1];
        values("\ue28d\ue1f5\udd5c⚆娕⼜눲嚸킼烎\u05ca䛒\ue131\uf4d5ꦃ\u2dd7㚟ﳝ㞏㰶", 18 - ImageFormat.getBitsPerPixel(0), objArr);
        valueOf(scrollView, ((String) objArr[0]).intern());
        ViewGroup viewGroup = get(this.getSDKInfo);
        this.ThreeDS2Service$InitializationCallback = viewGroup;
        this.getSDKVersion.addView(viewGroup);
        ThreeDS2ServiceInstance(this.getSDKInfo);
        onCompleted = (onError + 31) % 128;
    }

    public final void values(contains containsVar) {
        onCompleted = (onError + 39) % 128;
        this.ThreeDS2Service$InitializationCallback.addView(containsVar.ThreeDS2Service());
        this.cleanup.add(containsVar);
        int i = onCompleted + 77;
        onError = i % 128;
        if (i % 2 == 0) {
            throw null;
        }
    }

    @SuppressLint({"DiscouragedApi"})
    private void valueOf(View view, String str) {
        onError = (onCompleted + 111) % 128;
        try {
            Resources resources = this.getSDKInfo.getResources();
            Object[] objArr = new Object[1];
            values("\ue7ed㯋", (ViewConfiguration.getWindowTouchSlop() >> 8) + 2, objArr);
            view.setId(resources.getIdentifier(str, ((String) objArr[0]).intern(), this.getSDKInfo.getPackageName()));
        } catch (Throwable th2) {
            InterfaceC9652ns interfaceC9652ns = this.values;
            Object[] objArr2 = new Object[1];
            values("謐\uf212팻㤇娕⼜䎅ろ暭넪鳘憪幗秬鑐丝ରձ䎅ろ暭넪傣眽妫떂\ue7ed㯋瞠㙛헆ⱙᒉ⏲䒨띭⺮ꯉ鐺㞱㞁곣", TextUtils.lastIndexOf("", '0') + 42, objArr2);
            interfaceC9652ns.valueOf(String.format(((String) objArr2[0]).intern(), str, th2.getMessage()));
        }
        onError = (onCompleted + 63) % 128;
    }

    public final void values(keys keysVar) {
        int i = onError + 41;
        onCompleted = i % 128;
        if (i % 2 != 0) {
            this.getWarnings.ThreeDS2Service(keysVar);
            throw null;
        }
        this.getWarnings.ThreeDS2Service(keysVar);
        int i2 = onCompleted + 61;
        onError = i2 % 128;
        if (i2 % 2 == 0) {
            throw null;
        }
    }

    /* JADX WARN: Code restructure failed: missing block: B:0:?, code lost:
        r12 = r12;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    private static void values(java.lang.String r12, int r13, java.lang.Object[] r14) {
        /*
            if (r12 == 0) goto L6
            char[] r12 = r12.toCharArray()
        L6:
            char[] r12 = (char[]) r12
            java.lang.Object r0 = com.netcetera.threeds.sdk.infrastructure.onCompleted.valueOf
            monitor-enter(r0)
            int r1 = r12.length     // Catch: java.lang.Throwable -> L5b
            char[] r1 = new char[r1]     // Catch: java.lang.Throwable -> L5b
            r2 = 0
            com.netcetera.threeds.sdk.infrastructure.onCompleted.values = r2     // Catch: java.lang.Throwable -> L5b
            r3 = 2
            char[] r3 = new char[r3]     // Catch: java.lang.Throwable -> L5b
        L14:
            int r4 = com.netcetera.threeds.sdk.infrastructure.onCompleted.values     // Catch: java.lang.Throwable -> L5b
            int r5 = r12.length     // Catch: java.lang.Throwable -> L5b
            if (r4 >= r5) goto L6e
            char r5 = r12[r4]     // Catch: java.lang.Throwable -> L5b
            r3[r2] = r5     // Catch: java.lang.Throwable -> L5b
            int r4 = r4 + 1
            char r4 = r12[r4]     // Catch: java.lang.Throwable -> L5b
            r5 = 1
            r3[r5] = r4     // Catch: java.lang.Throwable -> L5b
            r4 = 58224(0xe370, float:8.1589E-41)
            r6 = 0
        L28:
            r7 = 16
            if (r6 >= r7) goto L5d
            char r7 = r3[r5]     // Catch: java.lang.Throwable -> L5b
            char r8 = r3[r2]     // Catch: java.lang.Throwable -> L5b
            int r9 = r8 + r4
            int r10 = r8 << 4
            char r11 = com.netcetera.threeds.sdk.infrastructure.AbstractC9290bx.ThreeDS2Service     // Catch: java.lang.Throwable -> L5b
            int r10 = r10 + r11
            r9 = r9 ^ r10
            int r10 = r8 >>> 5
            char r11 = com.netcetera.threeds.sdk.infrastructure.AbstractC9290bx.ThreeDS2ServiceInstance     // Catch: java.lang.Throwable -> L5b
            int r10 = r10 + r11
            r9 = r9 ^ r10
            int r7 = r7 - r9
            char r7 = (char) r7     // Catch: java.lang.Throwable -> L5b
            r3[r5] = r7     // Catch: java.lang.Throwable -> L5b
            int r9 = r7 + r4
            int r10 = r7 << 4
            char r11 = com.netcetera.threeds.sdk.infrastructure.AbstractC9290bx.valueOf     // Catch: java.lang.Throwable -> L5b
            int r10 = r10 + r11
            r9 = r9 ^ r10
            int r7 = r7 >>> 5
            char r10 = com.netcetera.threeds.sdk.infrastructure.AbstractC9290bx.get     // Catch: java.lang.Throwable -> L5b
            int r7 = r7 + r10
            r7 = r7 ^ r9
            int r8 = r8 - r7
            char r7 = (char) r8     // Catch: java.lang.Throwable -> L5b
            r3[r2] = r7     // Catch: java.lang.Throwable -> L5b
            r7 = 40503(0x9e37, float:5.6757E-41)
            int r4 = r4 - r7
            int r6 = r6 + 1
            goto L28
        L5b:
            r12 = move-exception
            goto L77
        L5d:
            int r4 = com.netcetera.threeds.sdk.infrastructure.onCompleted.values     // Catch: java.lang.Throwable -> L5b
            char r6 = r3[r2]     // Catch: java.lang.Throwable -> L5b
            r1[r4] = r6     // Catch: java.lang.Throwable -> L5b
            int r6 = r4 + 1
            char r5 = r3[r5]     // Catch: java.lang.Throwable -> L5b
            r1[r6] = r5     // Catch: java.lang.Throwable -> L5b
            int r4 = r4 + 2
            com.netcetera.threeds.sdk.infrastructure.onCompleted.values = r4     // Catch: java.lang.Throwable -> L5b
            goto L14
        L6e:
            java.lang.String r12 = new java.lang.String     // Catch: java.lang.Throwable -> L5b
            r12.<init>(r1, r2, r13)     // Catch: java.lang.Throwable -> L5b
            monitor-exit(r0)     // Catch: java.lang.Throwable -> L5b
            r14[r2] = r12
            return
        L77:
            monitor-exit(r0)
            throw r12
        */
        throw new UnsupportedOperationException("Method not decompiled: com.netcetera.threeds.sdk.infrastructure.AbstractC9290bx.values(java.lang.String, int, java.lang.Object[]):void");
    }
}

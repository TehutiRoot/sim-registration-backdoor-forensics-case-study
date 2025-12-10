package com.netcetera.threeds.sdk.infrastructure;

import android.content.Intent;
import android.graphics.drawable.Drawable;
import android.os.Build;
import android.os.Bundle;
import android.text.TextUtils;
import android.view.Gravity;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewConfiguration;
import android.view.ViewGroup;
import android.widget.FrameLayout;
import com.netcetera.threeds.sdk.infrastructure.getServices;
import java.io.Serializable;

/* renamed from: com.netcetera.threeds.sdk.infrastructure.ca */
/* loaded from: classes5.dex */
public abstract class AbstractC9294ca extends AbstractC9599mp implements merge {
    public static char ThreeDS2Service = 0;
    private static final String ThreeDS2ServiceInstance;
    private static int cleanup = 0;
    public static int get = 0;
    private static int getSDKInfo = 1;
    public static long values;
    final C9296cc valueOf;

    static {
        get();
        Object[] objArr = new Object[1];
        ThreeDS2Service(Drawable.resolveOpacity(0, 0), (char) (TextUtils.getOffsetBefore("", 0) + 29895), "翇\u17ea輎\ue3a5䍌︊\u1f5a頮猵ӣ\uf2f0ꌛ쐿\u1ad7鐙䒜", "믧쀯잫若", "쓑ᢶ젬䔪", objArr);
        ThreeDS2ServiceInstance = ((String) objArr[0]).intern();
        int i = cleanup + 105;
        getSDKInfo = i % 128;
        if (i % 2 == 0) {
            throw null;
        }
    }

    public AbstractC9294ca(C9296cc c9296cc) {
        this.valueOf = c9296cc;
    }

    public static void get() {
        get = 0;
        ThreeDS2Service = (char) 0;
        values = 4984016029357622481L;
    }

    @Override // com.netcetera.threeds.sdk.infrastructure.merge
    public void ThreeDS2Service() {
        getSDKInfo = (cleanup + 93) % 128;
        this.valueOf.get();
        int i = getSDKInfo + 55;
        cleanup = i % 128;
        if (i % 2 != 0) {
            throw null;
        }
    }

    @Override // com.netcetera.threeds.sdk.infrastructure.merge
    public void ThreeDS2ServiceInstance() {
        cleanup = (getSDKInfo + 93) % 128;
        this.valueOf.ThreeDS2ServiceInstance();
        int i = cleanup + 55;
        getSDKInfo = i % 128;
        if (i % 2 != 0) {
            return;
        }
        throw null;
    }

    @Override // com.netcetera.threeds.sdk.infrastructure.AbstractC9599mp, com.netcetera.threeds.sdk.infrastructure.InterfaceC9602ms
    public void valueOf(boolean z) {
        if (!z) {
            getServices.get getVar = new getServices.get();
            Intent cleanup2 = getSDKInfo().cleanup();
            if (cleanup2 != null) {
                int i = getSDKInfo + 51;
                cleanup = i % 128;
                if (i % 2 == 0) {
                    getVar.get(cleanup2);
                } else {
                    getVar.get(cleanup2);
                    throw null;
                }
            }
            this.valueOf.valueOf(getVar.ThreeDS2Service());
            cleanup = (getSDKInfo + 43) % 128;
        }
    }

    @Override // com.netcetera.threeds.sdk.infrastructure.AbstractC9599mp, com.netcetera.threeds.sdk.infrastructure.InterfaceC9602ms
    public void values(Bundle bundle, boolean z) {
        int i = getSDKInfo + 19;
        cleanup = i % 128;
        if (i % 2 == 0) {
            if (!z) {
                C9372eq c9372eq = new C9372eq();
                this.valueOf.values(c9372eq);
                Object[] objArr = new Object[1];
                ThreeDS2Service(TextUtils.getOffsetAfter("", 0), (char) (29895 - (ViewConfiguration.getPressedStateDuration() >> 16)), "翇\u17ea輎\ue3a5䍌︊\u1f5a頮猵ӣ\uf2f0ꌛ쐿\u1ad7鐙䒜", "믧쀯잫若", "쓑ᢶ젬䔪", objArr);
                bundle.putSerializable(((String) objArr[0]).intern(), c9372eq);
            }
            cleanup = (getSDKInfo + 99) % 128;
            return;
        }
        throw null;
    }

    /* JADX WARN: Code restructure failed: missing block: B:0:?, code lost:
        r12 = r12;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    private static void ThreeDS2Service(int r8, char r9, java.lang.String r10, java.lang.String r11, java.lang.String r12, java.lang.Object[] r13) {
        /*
            if (r12 == 0) goto L6
            char[] r12 = r12.toCharArray()
        L6:
            char[] r12 = (char[]) r12
            if (r11 == 0) goto Le
            char[] r11 = r11.toCharArray()
        Le:
            char[] r11 = (char[]) r11
            if (r10 == 0) goto L16
            char[] r10 = r10.toCharArray()
        L16:
            char[] r10 = (char[]) r10
            java.lang.Object r0 = com.netcetera.threeds.sdk.infrastructure.cleanup.get
            monitor-enter(r0)
            java.lang.Object r11 = r11.clone()     // Catch: java.lang.Throwable -> L7c
            char[] r11 = (char[]) r11     // Catch: java.lang.Throwable -> L7c
            java.lang.Object r12 = r12.clone()     // Catch: java.lang.Throwable -> L7c
            char[] r12 = (char[]) r12     // Catch: java.lang.Throwable -> L7c
            r1 = 0
            char r2 = r11[r1]     // Catch: java.lang.Throwable -> L7c
            r9 = r9 ^ r2
            char r9 = (char) r9     // Catch: java.lang.Throwable -> L7c
            r11[r1] = r9     // Catch: java.lang.Throwable -> L7c
            r9 = 2
            char r2 = r12[r9]     // Catch: java.lang.Throwable -> L7c
            char r8 = (char) r8     // Catch: java.lang.Throwable -> L7c
            int r2 = r2 + r8
            char r8 = (char) r2     // Catch: java.lang.Throwable -> L7c
            r12[r9] = r8     // Catch: java.lang.Throwable -> L7c
            int r8 = r10.length     // Catch: java.lang.Throwable -> L7c
            char[] r9 = new char[r8]     // Catch: java.lang.Throwable -> L7c
            com.netcetera.threeds.sdk.infrastructure.cleanup.ThreeDS2ServiceInstance = r1     // Catch: java.lang.Throwable -> L7c
        L3b:
            int r2 = com.netcetera.threeds.sdk.infrastructure.cleanup.ThreeDS2ServiceInstance     // Catch: java.lang.Throwable -> L7c
            if (r2 >= r8) goto L7e
            int r3 = r2 + 2
            int r3 = r3 % 4
            int r4 = r2 + 3
            int r4 = r4 % 4
            int r2 = r2 % 4
            char r2 = r11[r2]     // Catch: java.lang.Throwable -> L7c
            int r2 = r2 * 32718
            char r3 = r12[r3]     // Catch: java.lang.Throwable -> L7c
            int r2 = r2 + r3
            r5 = 65535(0xffff, float:9.1834E-41)
            int r2 = r2 % r5
            char r2 = (char) r2     // Catch: java.lang.Throwable -> L7c
            com.netcetera.threeds.sdk.infrastructure.cleanup.values = r2     // Catch: java.lang.Throwable -> L7c
            char r6 = r11[r4]     // Catch: java.lang.Throwable -> L7c
            int r6 = r6 * 32718
            int r6 = r6 + r3
            int r6 = r6 / r5
            char r3 = (char) r6     // Catch: java.lang.Throwable -> L7c
            r12[r4] = r3     // Catch: java.lang.Throwable -> L7c
            r11[r4] = r2     // Catch: java.lang.Throwable -> L7c
            int r3 = com.netcetera.threeds.sdk.infrastructure.cleanup.ThreeDS2ServiceInstance     // Catch: java.lang.Throwable -> L7c
            char r4 = r10[r3]     // Catch: java.lang.Throwable -> L7c
            r2 = r2 ^ r4
            long r4 = (long) r2     // Catch: java.lang.Throwable -> L7c
            long r6 = com.netcetera.threeds.sdk.infrastructure.AbstractC9294ca.values     // Catch: java.lang.Throwable -> L7c
            long r4 = r4 ^ r6
            int r2 = com.netcetera.threeds.sdk.infrastructure.AbstractC9294ca.get     // Catch: java.lang.Throwable -> L7c
            long r6 = (long) r2     // Catch: java.lang.Throwable -> L7c
            long r4 = r4 ^ r6
            char r2 = com.netcetera.threeds.sdk.infrastructure.AbstractC9294ca.ThreeDS2Service     // Catch: java.lang.Throwable -> L7c
            long r6 = (long) r2     // Catch: java.lang.Throwable -> L7c
            long r4 = r4 ^ r6
            int r2 = (int) r4     // Catch: java.lang.Throwable -> L7c
            char r2 = (char) r2     // Catch: java.lang.Throwable -> L7c
            r9[r3] = r2     // Catch: java.lang.Throwable -> L7c
            int r3 = r3 + 1
            com.netcetera.threeds.sdk.infrastructure.cleanup.ThreeDS2ServiceInstance = r3     // Catch: java.lang.Throwable -> L7c
            goto L3b
        L7c:
            r8 = move-exception
            goto L87
        L7e:
            java.lang.String r8 = new java.lang.String     // Catch: java.lang.Throwable -> L7c
            r8.<init>(r9)     // Catch: java.lang.Throwable -> L7c
            monitor-exit(r0)     // Catch: java.lang.Throwable -> L7c
            r13[r1] = r8
            return
        L87:
            monitor-exit(r0)
            throw r8
        */
        throw new UnsupportedOperationException("Method not decompiled: com.netcetera.threeds.sdk.infrastructure.AbstractC9294ca.ThreeDS2Service(int, char, java.lang.String, java.lang.String, java.lang.String, java.lang.Object[]):void");
    }

    @Override // com.netcetera.threeds.sdk.infrastructure.AbstractC9599mp, com.netcetera.threeds.sdk.infrastructure.InterfaceC9602ms
    public View get(LayoutInflater layoutInflater, ViewGroup viewGroup, Bundle bundle, boolean z) {
        if (z) {
            View view = super.get(layoutInflater, viewGroup, bundle, true);
            getSDKInfo = (cleanup + 103) % 128;
            return view;
        }
        FrameLayout valueOf = this.valueOf.valueOf(layoutInflater.getContext());
        cleanup = (getSDKInfo + 83) % 128;
        return valueOf;
    }

    @Override // com.netcetera.threeds.sdk.infrastructure.AbstractC9599mp, com.netcetera.threeds.sdk.infrastructure.InterfaceC9602ms
    public void get(Bundle bundle, boolean z) {
        Serializable serializable;
        C9372eq c9372eq;
        Object obj;
        getSDKInfo = (cleanup + 25) % 128;
        if (bundle == null || !(!z)) {
            return;
        }
        if (Build.VERSION.SDK_INT < 33) {
            int i = cleanup + 59;
            getSDKInfo = i % 128;
            if (i % 2 == 0) {
                Object[] objArr = new Object[1];
                ThreeDS2Service(ViewConfiguration.getMaximumFlingVelocity() / 100, (char) (10263 >> TextUtils.lastIndexOf("", '9')), "翇\u17ea輎\ue3a5䍌︊\u1f5a頮猵ӣ\uf2f0ꌛ쐿\u1ad7鐙䒜", "믧쀯잫若", "쓑ᢶ젬䔪", objArr);
                obj = objArr[0];
            } else {
                Object[] objArr2 = new Object[1];
                ThreeDS2Service(ViewConfiguration.getMaximumFlingVelocity() >> 16, (char) (TextUtils.lastIndexOf("", '0') + 29896), "翇\u17ea輎\ue3a5䍌︊\u1f5a頮猵ӣ\uf2f0ꌛ쐿\u1ad7鐙䒜", "믧쀯잫若", "쓑ᢶ젬䔪", objArr2);
                obj = objArr2[0];
            }
            c9372eq = (C9372eq) bundle.getSerializable(((String) obj).intern());
        } else {
            Object[] objArr3 = new Object[1];
            ThreeDS2Service(Gravity.getAbsoluteGravity(0, 0), (char) ((ViewConfiguration.getGlobalActionKeyTimeout() > 0L ? 1 : (ViewConfiguration.getGlobalActionKeyTimeout() == 0L ? 0 : -1)) + 29894), "翇\u17ea輎\ue3a5䍌︊\u1f5a頮猵ӣ\uf2f0ꌛ쐿\u1ad7鐙䒜", "믧쀯잫若", "쓑ᢶ젬䔪", objArr3);
            serializable = bundle.getSerializable(((String) objArr3[0]).intern(), C9372eq.class);
            c9372eq = (C9372eq) serializable;
        }
        if (c9372eq != null) {
            this.valueOf.ThreeDS2ServiceInstance(c9372eq);
        }
    }

    @Override // com.netcetera.threeds.sdk.infrastructure.AbstractC9599mp, com.netcetera.threeds.sdk.infrastructure.InterfaceC9602ms
    public void values(boolean z) {
        int i = getSDKInfo + 67;
        cleanup = i % 128;
        if (i % 2 != 0) {
            throw null;
        }
        if (z) {
            return;
        }
        this.valueOf.cleanup();
        getSDKInfo = (cleanup + 35) % 128;
    }

    @Override // com.netcetera.threeds.sdk.infrastructure.merge
    public void get(setAllCaps setallcaps) {
        cleanup = (getSDKInfo + 37) % 128;
        getSDKInfo().valueOf();
        this.valueOf.get(setallcaps);
        int i = cleanup + 47;
        getSDKInfo = i % 128;
        if (i % 2 == 0) {
            int i2 = 33 / 0;
        }
    }

    @Override // com.netcetera.threeds.sdk.infrastructure.merge
    public void values() {
        int i = getSDKInfo + 43;
        cleanup = i % 128;
        if (i % 2 == 0) {
            getSDKInfo().values();
        } else {
            getSDKInfo().values();
            throw null;
        }
    }

    @Override // com.netcetera.threeds.sdk.infrastructure.merge
    public void get(InterfaceC9311compute interfaceC9311compute) {
        int i = cleanup + 23;
        getSDKInfo = i % 128;
        if (i % 2 == 0) {
            this.valueOf.get(interfaceC9311compute);
            int i2 = 45 / 0;
        } else {
            this.valueOf.get(interfaceC9311compute);
        }
        int i3 = cleanup + 49;
        getSDKInfo = i3 % 128;
        if (i3 % 2 == 0) {
            int i4 = 59 / 0;
        }
    }

    @Override // com.netcetera.threeds.sdk.infrastructure.AbstractC9599mp, com.netcetera.threeds.sdk.infrastructure.InterfaceC9602ms
    public void get(boolean z) {
        cleanup = (getSDKInfo + 121) % 128;
        this.valueOf.values();
        int i = cleanup + 37;
        getSDKInfo = i % 128;
        if (i % 2 == 0) {
            throw null;
        }
    }
}

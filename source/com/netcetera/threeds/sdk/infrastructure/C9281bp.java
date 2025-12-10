package com.netcetera.threeds.sdk.infrastructure;

import android.content.Context;
import android.widget.CheckBox;
import kotlin.text.Typography;

/* renamed from: com.netcetera.threeds.sdk.infrastructure.bp */
/* loaded from: classes5.dex */
public class C9281bp extends storeToXML {
    private static int ThreeDS2Service = 0;
    private static int get = 1;
    public static char[] valueOf = {'s', 221, 198, 198, 218, 216, 216, 209, 204, 205, 210, 223, Typography.times, Typography.times, 220, 221, 220, 220, 199, 201, 225, 220, 200, 206, 225, 226, 225, 209, ':', 'v', 'n', 'l', 'i', 'g', 'j', 'j', 'k', 'd', 'i', 's', 'n', 'j', 'e', 'i', 's', 't', 's', 's', 'i', 'd', 'o', 'j', 'b', 'f', 'j', 'i', 'h', 'l', 'f', 'd', 'e'};

    public C9281bp(Context context, InterfaceC9511jo interfaceC9511jo) {
        super(context, interfaceC9511jo);
    }

    /* JADX WARN: Code restructure failed: missing block: B:0:?, code lost:
        r12 = r12;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    private static void ThreeDS2Service(java.lang.String r12, int[] r13, boolean r14, java.lang.Object[] r15) {
        /*
            if (r12 == 0) goto L8
            java.lang.String r0 = "ISO-8859-1"
            byte[] r12 = r12.getBytes(r0)
        L8:
            byte[] r12 = (byte[]) r12
            java.lang.Object r0 = com.netcetera.threeds.sdk.infrastructure.ConfigurationBuilder.values
            monitor-enter(r0)
            r1 = 0
            r2 = r13[r1]     // Catch: java.lang.Throwable -> L38
            r3 = 1
            r4 = r13[r3]     // Catch: java.lang.Throwable -> L38
            r5 = 2
            r6 = r13[r5]     // Catch: java.lang.Throwable -> L38
            r7 = 3
            r7 = r13[r7]     // Catch: java.lang.Throwable -> L38
            char[] r8 = com.netcetera.threeds.sdk.infrastructure.C9281bp.valueOf     // Catch: java.lang.Throwable -> L38
            char[] r9 = new char[r4]     // Catch: java.lang.Throwable -> L38
            java.lang.System.arraycopy(r8, r2, r9, r1, r4)     // Catch: java.lang.Throwable -> L38
            if (r12 == 0) goto L49
            char[] r2 = new char[r4]     // Catch: java.lang.Throwable -> L38
            com.netcetera.threeds.sdk.infrastructure.ConfigurationBuilder.ThreeDS2Service = r1     // Catch: java.lang.Throwable -> L38
            r8 = 0
        L27:
            int r10 = com.netcetera.threeds.sdk.infrastructure.ConfigurationBuilder.ThreeDS2Service     // Catch: java.lang.Throwable -> L38
            if (r10 >= r4) goto L48
            r11 = r12[r10]     // Catch: java.lang.Throwable -> L38
            if (r11 != r3) goto L3a
            char r11 = r9[r10]     // Catch: java.lang.Throwable -> L38
            int r11 = r11 << r3
            int r11 = r11 + r3
            int r11 = r11 - r8
            char r8 = (char) r11     // Catch: java.lang.Throwable -> L38
            r2[r10] = r8     // Catch: java.lang.Throwable -> L38
            goto L41
        L38:
            r12 = move-exception
            goto L8d
        L3a:
            char r11 = r9[r10]     // Catch: java.lang.Throwable -> L38
            int r11 = r11 << r3
            int r11 = r11 - r8
            char r8 = (char) r11     // Catch: java.lang.Throwable -> L38
            r2[r10] = r8     // Catch: java.lang.Throwable -> L38
        L41:
            char r8 = r2[r10]     // Catch: java.lang.Throwable -> L38
            int r10 = r10 + 1
            com.netcetera.threeds.sdk.infrastructure.ConfigurationBuilder.ThreeDS2Service = r10     // Catch: java.lang.Throwable -> L38
            goto L27
        L48:
            r9 = r2
        L49:
            if (r7 <= 0) goto L58
            char[] r12 = new char[r4]     // Catch: java.lang.Throwable -> L38
            java.lang.System.arraycopy(r9, r1, r12, r1, r4)     // Catch: java.lang.Throwable -> L38
            int r2 = r4 - r7
            java.lang.System.arraycopy(r12, r1, r9, r2, r7)     // Catch: java.lang.Throwable -> L38
            java.lang.System.arraycopy(r12, r7, r9, r1, r2)     // Catch: java.lang.Throwable -> L38
        L58:
            if (r14 == 0) goto L6f
            char[] r12 = new char[r4]     // Catch: java.lang.Throwable -> L38
            com.netcetera.threeds.sdk.infrastructure.ConfigurationBuilder.ThreeDS2Service = r1     // Catch: java.lang.Throwable -> L38
        L5e:
            int r14 = com.netcetera.threeds.sdk.infrastructure.ConfigurationBuilder.ThreeDS2Service     // Catch: java.lang.Throwable -> L38
            if (r14 >= r4) goto L6e
            int r2 = r4 - r14
            int r2 = r2 - r3
            char r2 = r9[r2]     // Catch: java.lang.Throwable -> L38
            r12[r14] = r2     // Catch: java.lang.Throwable -> L38
            int r14 = r14 + 1
            com.netcetera.threeds.sdk.infrastructure.ConfigurationBuilder.ThreeDS2Service = r14     // Catch: java.lang.Throwable -> L38
            goto L5e
        L6e:
            r9 = r12
        L6f:
            if (r6 <= 0) goto L84
            com.netcetera.threeds.sdk.infrastructure.ConfigurationBuilder.ThreeDS2Service = r1     // Catch: java.lang.Throwable -> L38
        L73:
            int r12 = com.netcetera.threeds.sdk.infrastructure.ConfigurationBuilder.ThreeDS2Service     // Catch: java.lang.Throwable -> L38
            if (r12 >= r4) goto L84
            char r14 = r9[r12]     // Catch: java.lang.Throwable -> L38
            r2 = r13[r5]     // Catch: java.lang.Throwable -> L38
            int r14 = r14 - r2
            char r14 = (char) r14     // Catch: java.lang.Throwable -> L38
            r9[r12] = r14     // Catch: java.lang.Throwable -> L38
            int r12 = r12 + 1
            com.netcetera.threeds.sdk.infrastructure.ConfigurationBuilder.ThreeDS2Service = r12     // Catch: java.lang.Throwable -> L38
            goto L73
        L84:
            java.lang.String r12 = new java.lang.String     // Catch: java.lang.Throwable -> L38
            r12.<init>(r9)     // Catch: java.lang.Throwable -> L38
            monitor-exit(r0)     // Catch: java.lang.Throwable -> L38
            r15[r1] = r12
            return
        L8d:
            monitor-exit(r0)
            throw r12
        */
        throw new UnsupportedOperationException("Method not decompiled: com.netcetera.threeds.sdk.infrastructure.C9281bp.ThreeDS2Service(java.lang.String, int[], boolean, java.lang.Object[]):void");
    }

    @Override // com.netcetera.threeds.sdk.infrastructure.storeToXML
    public keys ThreeDS2ServiceInstance(keys keysVar) {
        C9369en c9369en = new C9369en(keysVar, replaceAll.ThreeDS2Service);
        get = (ThreeDS2Service + 33) % 128;
        return c9369en;
    }

    @Override // com.netcetera.threeds.sdk.infrastructure.storeToXML, com.netcetera.threeds.sdk.infrastructure.InterfaceC9367elements
    public /* bridge */ /* synthetic */ keys get(keys keysVar) {
        get = (ThreeDS2Service + 61) % 128;
        keys keysVar2 = super.get(keysVar);
        ThreeDS2Service = (get + 65) % 128;
        return keysVar2;
    }

    @Override // com.netcetera.threeds.sdk.infrastructure.storeToXML, com.netcetera.threeds.sdk.infrastructure.save
    public /* synthetic */ void valueOf(InterfaceC9370eo interfaceC9370eo) {
        int i = get + 5;
        ThreeDS2Service = i % 128;
        int i2 = i % 2;
        super.valueOf(interfaceC9370eo);
        if (i2 != 0) {
            throw null;
        }
    }

    @Override // com.netcetera.threeds.sdk.infrastructure.storeToXML, com.netcetera.threeds.sdk.infrastructure.save
    public /* bridge */ /* synthetic */ void values(InterfaceC9373er interfaceC9373er) {
        get = (ThreeDS2Service + 45) % 128;
        super.values(interfaceC9373er);
        get = (ThreeDS2Service + 25) % 128;
    }

    @Override // com.netcetera.threeds.sdk.infrastructure.storeToXML
    public String ThreeDS2ServiceInstance() {
        Object obj;
        int i = get + 29;
        ThreeDS2Service = i % 128;
        if (i % 2 != 0) {
            Object[] objArr = new Object[1];
            ThreeDS2Service("\u0001\u0000\u0000\u0000\u0001\u0001\u0001\u0001\u0000\u0000\u0001\u0000\u0001\u0001\u0001\u0001\u0001\u0000\u0000\u0001\u0001\u0000\u0001\u0000\u0001\u0000\u0001\u0000", new int[]{0, 28, 110, 0}, false, objArr);
            obj = objArr[0];
        } else {
            Object[] objArr2 = new Object[1];
            ThreeDS2Service("\u0001\u0000\u0000\u0000\u0001\u0001\u0001\u0001\u0000\u0000\u0001\u0000\u0001\u0001\u0001\u0001\u0001\u0000\u0000\u0001\u0001\u0000\u0001\u0000\u0001\u0000\u0001\u0000", new int[]{0, 28, 110, 0}, true, objArr2);
            obj = objArr2[0];
        }
        String intern = ((String) obj).intern();
        get = (ThreeDS2Service + 29) % 128;
        return intern;
    }

    @Override // com.netcetera.threeds.sdk.infrastructure.storeToXML
    public String get(setAllCaps setallcaps) {
        ThreeDS2Service = (get + 13) % 128;
        String schemeName = setallcaps.getSchemeName();
        ThreeDS2Service = (get + 109) % 128;
        return schemeName;
    }

    @Override // com.netcetera.threeds.sdk.infrastructure.storeToXML, com.netcetera.threeds.sdk.infrastructure.contains
    public /* synthetic */ void valueOf(setAllCaps setallcaps) {
        int i = get + 11;
        ThreeDS2Service = i % 128;
        int i2 = i % 2;
        super.valueOf(setallcaps);
        if (i2 != 0) {
            throw null;
        }
        get = (ThreeDS2Service + 63) % 128;
    }

    @Override // com.netcetera.threeds.sdk.infrastructure.storeToXML
    public keys values(keys keysVar) {
        C9369en c9369en = new C9369en(keysVar, replaceAll.ThreeDS2ServiceInstance);
        get = (ThreeDS2Service + 3) % 128;
        return c9369en;
    }

    @Override // com.netcetera.threeds.sdk.infrastructure.storeToXML
    public void ThreeDS2ServiceInstance(CheckBox checkBox) {
        ThreeDS2Service = (get + 49) % 128;
        Object[] objArr = new Object[1];
        ThreeDS2Service("\u0000\u0000\u0001\u0001\u0001\u0000\u0001\u0000\u0001\u0000\u0001\u0001\u0000\u0001\u0001\u0001\u0001\u0000\u0001\u0000\u0001\u0000\u0000\u0000\u0000\u0000\u0001\u0001\u0001\u0000\u0001\u0001\u0001", new int[]{28, 33, 0, 0}, true, objArr);
        values(checkBox, ((String) objArr[0]).intern());
        int i = get + 33;
        ThreeDS2Service = i % 128;
        if (i % 2 != 0) {
            throw null;
        }
    }
}

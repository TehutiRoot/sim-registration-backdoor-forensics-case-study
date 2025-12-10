package com.netcetera.threeds.sdk.infrastructure;

import android.content.Context;
import th.p047co.dtac.android.dtacone.util.MapLocation;

/* renamed from: com.netcetera.threeds.sdk.infrastructure.az */
/* loaded from: classes5.dex */
public class C9250az extends AbstractC9249ay implements containsValue, save {
    private static int ConfigParameters = 0;
    private static int addParam = 1;
    private static final String getWarnings;
    public static char[] initialize;
    private boolean ThreeDS2Service$InitializationCallback;
    private String createTransaction;
    private boolean onCompleted;
    private boolean onError;

    static {
        getSDKInfo();
        Object[] objArr = new Object[1];
        ThreeDS2ServiceInstance("\u0000\u0000\u0001\u0000\u0001\u0001\u0001\u0000\u0001\u0001\u0001\u0001\u0001\u0000\u0001\u0001\u0000\u0001\u0001\u0001\u0000\u0000\u0001\u0001\u0001", new int[]{0, 25, MapLocation.REQUEST_LOCATION, 15}, false, objArr);
        getWarnings = ((String) objArr[0]).intern();
        ConfigParameters = (addParam + 117) % 128;
    }

    public C9250az(Context context, C9239ap c9239ap) {
        super(context, c9239ap);
        this.ThreeDS2Service$InitializationCallback = false;
        this.onCompleted = false;
        this.onError = false;
    }

    public static C9250az ThreeDS2Service(Context context) {
        C9250az c9250az = new C9250az(context, new C9239ap());
        addParam = (ConfigParameters + 93) % 128;
        return c9250az;
    }

    /* JADX WARN: Code restructure failed: missing block: B:0:?, code lost:
        r12 = r12;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    private static void ThreeDS2ServiceInstance(java.lang.String r12, int[] r13, boolean r14, java.lang.Object[] r15) {
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
            char[] r8 = com.netcetera.threeds.sdk.infrastructure.C9250az.initialize     // Catch: java.lang.Throwable -> L38
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
        throw new UnsupportedOperationException("Method not decompiled: com.netcetera.threeds.sdk.infrastructure.C9250az.ThreeDS2ServiceInstance(java.lang.String, int[], boolean, java.lang.Object[]):void");
    }

    public static void getSDKInfo() {
        initialize = new char[]{150, 282, 281, 299, 301, 309, 309, 307, 309, 302, 301, 289, 290, 305, 305, 306, 309, 311, 307, 295, 294, 293, 298, 305, 305};
    }

    @Override // com.netcetera.threeds.sdk.infrastructure.AbstractC9249ay, com.netcetera.threeds.sdk.infrastructure.contains
    public void valueOf(setAllCaps setallcaps) {
        ConfigParameters = (addParam + 13) % 128;
        super.valueOf(setallcaps);
        this.createTransaction = get().get(setallcaps.onCompleted());
        int i = ConfigParameters + 5;
        addParam = i % 128;
        if (i % 2 == 0) {
            throw null;
        }
    }

    @Override // com.netcetera.threeds.sdk.infrastructure.containsValue
    public void values(getServices getservices) {
        if (this.ThreeDS2Service$InitializationCallback) {
            this.onError = true;
        }
        if (!this.onCompleted) {
            addParam = (ConfigParameters + 91) % 128;
            if (C9658om.values((CharSequence) this.createTransaction) || !this.onError) {
                return;
            }
            int i = ConfigParameters + 9;
            addParam = i % 128;
            if (i % 2 == 0) {
                values(this.createTransaction);
                this.onCompleted = false;
                return;
            }
            values(this.createTransaction);
            this.onCompleted = true;
        }
    }

    @Override // com.netcetera.threeds.sdk.infrastructure.containsValue
    public void valueOf() {
        int i = (addParam + 97) % 128;
        ConfigParameters = i;
        this.ThreeDS2Service$InitializationCallback = true;
        int i2 = i + 119;
        addParam = i2 % 128;
        if (i2 % 2 == 0) {
            throw null;
        }
    }

    @Override // com.netcetera.threeds.sdk.infrastructure.save
    public void valueOf(InterfaceC9359eo interfaceC9359eo) {
        ConfigParameters = (addParam + 99) % 128;
        Object[] objArr = new Object[1];
        ThreeDS2ServiceInstance("\u0000\u0000\u0001\u0000\u0001\u0001\u0001\u0000\u0001\u0001\u0001\u0001\u0001\u0000\u0001\u0001\u0000\u0001\u0001\u0001\u0000\u0000\u0001\u0001\u0001", new int[]{0, 25, MapLocation.REQUEST_LOCATION, 15}, false, objArr);
        interfaceC9359eo.values(((String) objArr[0]).intern(), this.onError);
        int i = addParam + 79;
        ConfigParameters = i % 128;
        if (i % 2 != 0) {
            throw null;
        }
    }

    @Override // com.netcetera.threeds.sdk.infrastructure.save
    public void values(InterfaceC9362er interfaceC9362er) {
        Object obj;
        int i = ConfigParameters + 83;
        addParam = i % 128;
        if (i % 2 == 0) {
            Object[] objArr = new Object[1];
            ThreeDS2ServiceInstance("\u0000\u0000\u0001\u0000\u0001\u0001\u0001\u0000\u0001\u0001\u0001\u0001\u0001\u0000\u0001\u0001\u0000\u0001\u0001\u0001\u0000\u0000\u0001\u0001\u0001", new int[]{0, 25, MapLocation.REQUEST_LOCATION, 15}, false, objArr);
            obj = objArr[0];
        } else {
            Object[] objArr2 = new Object[1];
            ThreeDS2ServiceInstance("\u0000\u0000\u0001\u0000\u0001\u0001\u0001\u0000\u0001\u0001\u0001\u0001\u0001\u0000\u0001\u0001\u0000\u0001\u0001\u0001\u0000\u0000\u0001\u0001\u0001", new int[]{0, 25, MapLocation.REQUEST_LOCATION, 15}, false, objArr2);
            obj = objArr2[0];
        }
        this.onError = interfaceC9362er.get(((String) obj).intern(), false).booleanValue();
        addParam = (ConfigParameters + 101) % 128;
    }
}
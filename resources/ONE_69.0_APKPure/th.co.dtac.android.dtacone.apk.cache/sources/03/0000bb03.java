package com.netcetera.threeds.sdk.infrastructure;

import android.content.Context;
import android.media.AudioTrack;
import android.text.TextUtils;
import android.util.TypedValue;

/* renamed from: com.netcetera.threeds.sdk.infrastructure.ag */
/* loaded from: classes5.dex */
public class C9229ag extends AbstractC9228af implements containsValue, save {
    private static int createTransaction = 0;
    private static final String getWarnings;
    private static int onError = 1;
    public static long values;
    private boolean ConfigParameters;
    private boolean ThreeDS2Service$InitializationCallback;
    private setAllCaps initialize;
    private boolean onCompleted;

    static {
        get();
        Object[] objArr = new Object[1];
        ThreeDS2Service("劝勨祖継䲏䖐崵傳䁤櫓圎緾矉含抚湣攼䆘\u0df5ᣮᢑ㋖Ὅԁช", (TypedValue.complexToFraction(0, 0.0f, 0.0f) > 0.0f ? 1 : (TypedValue.complexToFraction(0, 0.0f, 0.0f) == 0.0f ? 0 : -1)), objArr);
        getWarnings = ((String) objArr[0]).intern();
        int i = createTransaction + 105;
        onError = i % 128;
        if (i % 2 == 0) {
            throw null;
        }
    }

    public C9229ag(Context context, InterfaceC9500jo interfaceC9500jo, C9226ad c9226ad, setProperty setproperty) {
        super(context, interfaceC9500jo, c9226ad, setproperty);
        this.onCompleted = false;
        this.ConfigParameters = false;
    }

    /* JADX WARN: Code restructure failed: missing block: B:0:?, code lost:
        r8 = r8;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    private static void ThreeDS2Service(java.lang.String r8, int r9, java.lang.Object[] r10) {
        /*
            if (r8 == 0) goto L6
            char[] r8 = r8.toCharArray()
        L6:
            char[] r8 = (char[]) r8
            java.lang.Object r0 = com.netcetera.threeds.sdk.infrastructure.getWarnings.valueOf
            monitor-enter(r0)
            long r1 = com.netcetera.threeds.sdk.infrastructure.C9229ag.values     // Catch: java.lang.Throwable -> L3a
            char[] r8 = com.netcetera.threeds.sdk.infrastructure.getWarnings.ThreeDS2Service(r1, r8, r9)     // Catch: java.lang.Throwable -> L3a
            r9 = 4
            com.netcetera.threeds.sdk.infrastructure.getWarnings.values = r9     // Catch: java.lang.Throwable -> L3a
        L14:
            int r1 = com.netcetera.threeds.sdk.infrastructure.getWarnings.values     // Catch: java.lang.Throwable -> L3a
            int r2 = r8.length     // Catch: java.lang.Throwable -> L3a
            if (r1 >= r2) goto L3c
            int r1 = r1 + (-4)
            com.netcetera.threeds.sdk.infrastructure.getWarnings.ThreeDS2ServiceInstance = r1     // Catch: java.lang.Throwable -> L3a
            int r1 = com.netcetera.threeds.sdk.infrastructure.getWarnings.values     // Catch: java.lang.Throwable -> L3a
            char r2 = r8[r1]     // Catch: java.lang.Throwable -> L3a
            int r3 = r1 % 4
            char r3 = r8[r3]     // Catch: java.lang.Throwable -> L3a
            r2 = r2 ^ r3
            long r2 = (long) r2     // Catch: java.lang.Throwable -> L3a
            int r4 = com.netcetera.threeds.sdk.infrastructure.getWarnings.ThreeDS2ServiceInstance     // Catch: java.lang.Throwable -> L3a
            long r4 = (long) r4     // Catch: java.lang.Throwable -> L3a
            long r6 = com.netcetera.threeds.sdk.infrastructure.C9229ag.values     // Catch: java.lang.Throwable -> L3a
            long r4 = r4 * r6
            long r2 = r2 ^ r4
            int r3 = (int) r2     // Catch: java.lang.Throwable -> L3a
            char r2 = (char) r3     // Catch: java.lang.Throwable -> L3a
            r8[r1] = r2     // Catch: java.lang.Throwable -> L3a
            int r1 = com.netcetera.threeds.sdk.infrastructure.getWarnings.values     // Catch: java.lang.Throwable -> L3a
            int r1 = r1 + 1
            com.netcetera.threeds.sdk.infrastructure.getWarnings.values = r1     // Catch: java.lang.Throwable -> L3a
            goto L14
        L3a:
            r8 = move-exception
            goto L48
        L3c:
            java.lang.String r1 = new java.lang.String     // Catch: java.lang.Throwable -> L3a
            int r2 = r8.length     // Catch: java.lang.Throwable -> L3a
            int r2 = r2 - r9
            r1.<init>(r8, r9, r2)     // Catch: java.lang.Throwable -> L3a
            monitor-exit(r0)     // Catch: java.lang.Throwable -> L3a
            r8 = 0
            r10[r8] = r1
            return
        L48:
            monitor-exit(r0)
            throw r8
        */
        throw new UnsupportedOperationException("Method not decompiled: com.netcetera.threeds.sdk.infrastructure.C9229ag.ThreeDS2Service(java.lang.String, int, java.lang.Object[]):void");
    }

    public static void get() {
        values = -7176480658850184026L;
    }

    private void getSDKVersion() {
        setAllCaps setallcaps;
        int i = createTransaction;
        int i2 = i + 21;
        onError = i2 % 128;
        if (i2 % 2 != 0) {
            if (!this.onCompleted && (setallcaps = this.initialize) != null && this.ConfigParameters) {
                int i3 = i + 89;
                onError = i3 % 128;
                if (i3 % 2 == 0) {
                    get(setallcaps.ThreeDS2Service$InitializationCallback(), this.initialize.onError());
                    this.onCompleted = false;
                    return;
                }
                get(setallcaps.ThreeDS2Service$InitializationCallback(), this.initialize.onError());
                this.onCompleted = true;
                return;
            }
            return;
        }
        throw null;
    }

    public static AbstractC9228af values(Context context, InterfaceC9500jo interfaceC9500jo, setProperty setproperty) {
        C9229ag c9229ag = new C9229ag(context, interfaceC9500jo, new C9226ad(), setproperty);
        onError = (createTransaction + 37) % 128;
        return c9229ag;
    }

    @Override // com.netcetera.threeds.sdk.infrastructure.AbstractC9228af, com.netcetera.threeds.sdk.infrastructure.contains
    public void valueOf(setAllCaps setallcaps) {
        int i = onError + 89;
        createTransaction = i % 128;
        if (i % 2 == 0) {
            super.valueOf(setallcaps);
            this.initialize = setallcaps;
            return;
        }
        super.valueOf(setallcaps);
        this.initialize = setallcaps;
        throw null;
    }

    private void get(String str, getLocalizedMessage getlocalizedmessage) {
        int i = onError + 111;
        createTransaction = i % 128;
        if (i % 2 != 0) {
            values();
            int i2 = 82 / 0;
            if (getLocalizedMessage.valueOf != getlocalizedmessage) {
                return;
            }
        } else {
            values();
            if (getLocalizedMessage.valueOf != getlocalizedmessage) {
                return;
            }
        }
        if (C9658om.ThreeDS2ServiceInstance(str)) {
            int i3 = onError + 59;
            createTransaction = i3 % 128;
            if (i3 % 2 == 0) {
                valueOf(str);
                ThreeDS2Service(getVersion.values);
                return;
            }
            valueOf(str);
            ThreeDS2Service(getVersion.values);
            throw null;
        }
    }

    @Override // com.netcetera.threeds.sdk.infrastructure.containsValue
    public void values(getServices getservices) {
        if (this.ThreeDS2Service$InitializationCallback) {
            createTransaction = (onError + 95) % 128;
            this.ConfigParameters = true;
        }
        getSDKVersion();
        createTransaction = (onError + 63) % 128;
    }

    @Override // com.netcetera.threeds.sdk.infrastructure.containsValue
    public void valueOf() {
        int i = createTransaction + 35;
        int i2 = i % 128;
        onError = i2;
        this.ThreeDS2Service$InitializationCallback = i % 2 != 0;
        int i3 = i2 + 99;
        createTransaction = i3 % 128;
        if (i3 % 2 != 0) {
            throw null;
        }
    }

    @Override // com.netcetera.threeds.sdk.infrastructure.save
    public void valueOf(InterfaceC9359eo interfaceC9359eo) {
        Object obj;
        int i = onError + 57;
        createTransaction = i % 128;
        if (i % 2 != 0) {
            Object[] objArr = new Object[1];
            ThreeDS2Service("劝勨祖継䲏䖐崵傳䁤櫓圎緾矉含抚湣攼䆘\u0df5ᣮᢑ㋖Ὅԁช", TextUtils.getOffsetAfter("", 0), objArr);
            obj = objArr[0];
        } else {
            Object[] objArr2 = new Object[1];
            ThreeDS2Service("劝勨祖継䲏䖐崵傳䁤櫓圎緾矉含抚湣攼䆘\u0df5ᣮᢑ㋖Ὅԁช", TextUtils.getOffsetAfter("", 0), objArr2);
            obj = objArr2[0];
        }
        interfaceC9359eo.values(((String) obj).intern(), this.ConfigParameters);
        int i2 = onError + 77;
        createTransaction = i2 % 128;
        if (i2 % 2 != 0) {
            int i3 = 88 / 0;
        }
    }

    @Override // com.netcetera.threeds.sdk.infrastructure.save
    public void values(InterfaceC9362er interfaceC9362er) {
        Boolean bool;
        int i = onError + 95;
        createTransaction = i % 128;
        if (i % 2 != 0) {
            Object[] objArr = new Object[1];
            ThreeDS2Service("劝勨祖継䲏䖐崵傳䁤櫓圎緾矉含抚湣攼䆘\u0df5ᣮᢑ㋖Ὅԁช", (AudioTrack.getMinVolume() > 1.0f ? 1 : (AudioTrack.getMinVolume() == 1.0f ? 0 : -1)), objArr);
            bool = interfaceC9362er.get(((String) objArr[0]).intern(), true);
        } else {
            Object[] objArr2 = new Object[1];
            ThreeDS2Service("劝勨祖継䲏䖐崵傳䁤櫓圎緾矉含抚湣攼䆘\u0df5ᣮᢑ㋖Ὅԁช", (AudioTrack.getMinVolume() > 0.0f ? 1 : (AudioTrack.getMinVolume() == 0.0f ? 0 : -1)), objArr2);
            bool = interfaceC9362er.get(((String) objArr2[0]).intern(), false);
        }
        this.ConfigParameters = bool.booleanValue();
        int i2 = onError + 77;
        createTransaction = i2 % 128;
        if (i2 % 2 != 0) {
            throw null;
        }
    }
}
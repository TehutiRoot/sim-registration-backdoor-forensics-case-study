package com.netcetera.threeds.sdk.infrastructure;

import android.content.Context;
import android.media.AudioTrack;
import android.view.View;
import android.widget.CheckBox;

/* renamed from: com.netcetera.threeds.sdk.infrastructure.al */
/* loaded from: classes5.dex */
public class C9234al extends storeToXML {
    public static long ThreeDS2Service = 9011076704917796986L;
    private static int get = 0;
    private static int values = 1;

    public C9234al(Context context, InterfaceC9500jo interfaceC9500jo) {
        super(context, interfaceC9500jo);
    }

    @Override // com.netcetera.threeds.sdk.infrastructure.storeToXML
    public keys ThreeDS2ServiceInstance(keys keysVar) {
        C9292ci c9292ci = new C9292ci(keysVar, putAll.values);
        get = (values + 77) % 128;
        return c9292ci;
    }

    @Override // com.netcetera.threeds.sdk.infrastructure.storeToXML, com.netcetera.threeds.sdk.infrastructure.InterfaceC9356elements
    public /* synthetic */ keys get(keys keysVar) {
        int i = values + 85;
        get = i % 128;
        if (i % 2 != 0) {
            super.get(keysVar);
            throw null;
        }
        keys keysVar2 = super.get(keysVar);
        int i2 = get + 111;
        values = i2 % 128;
        if (i2 % 2 != 0) {
            return keysVar2;
        }
        throw null;
    }

    @Override // com.netcetera.threeds.sdk.infrastructure.storeToXML, com.netcetera.threeds.sdk.infrastructure.save
    public /* synthetic */ void valueOf(InterfaceC9359eo interfaceC9359eo) {
        int i = values + 121;
        get = i % 128;
        int i2 = i % 2;
        super.valueOf(interfaceC9359eo);
        if (i2 != 0) {
            throw null;
        }
        get = (values + 119) % 128;
    }

    @Override // com.netcetera.threeds.sdk.infrastructure.storeToXML, com.netcetera.threeds.sdk.infrastructure.save
    public /* bridge */ /* synthetic */ void values(InterfaceC9362er interfaceC9362er) {
        get = (values + 81) % 128;
        super.values(interfaceC9362er);
        int i = get + 121;
        values = i % 128;
        if (i % 2 == 0) {
            throw null;
        }
    }

    @Override // com.netcetera.threeds.sdk.infrastructure.storeToXML
    public String ThreeDS2ServiceInstance() {
        values = (get + 27) % 128;
        Object[] objArr = new Object[1];
        values("\uf552\uf516觍뇒披\ue124ᓙሩ䠣鏊䂷쌜㛬痣⚄╳傍垼Ӫݨ犂䦸\uead3祈鲴⮻저媼빱\u0a53긬벉\ud86f\uec54谀麜", 1 - (AudioTrack.getMaxVolume() > 0.0f ? 1 : (AudioTrack.getMaxVolume() == 0.0f ? 0 : -1)), objArr);
        String intern = ((String) objArr[0]).intern();
        int i = values + 103;
        get = i % 128;
        if (i % 2 != 0) {
            int i2 = 75 / 0;
        }
        return intern;
    }

    @Override // com.netcetera.threeds.sdk.infrastructure.storeToXML
    public String get(setAllCaps setallcaps) {
        values = (get + 71) % 128;
        String schemeLogo = setallcaps.getSchemeLogo();
        get = (values + 35) % 128;
        return schemeLogo;
    }

    @Override // com.netcetera.threeds.sdk.infrastructure.storeToXML, com.netcetera.threeds.sdk.infrastructure.contains
    public /* bridge */ /* synthetic */ void valueOf(setAllCaps setallcaps) {
        get = (values + 119) % 128;
        super.valueOf(setallcaps);
        int i = values + 117;
        get = i % 128;
        if (i % 2 != 0) {
            throw null;
        }
    }

    @Override // com.netcetera.threeds.sdk.infrastructure.storeToXML
    public keys values(keys keysVar) {
        C9292ci c9292ci = new C9292ci(keysVar, putAll.ThreeDS2Service);
        int i = values + 69;
        get = i % 128;
        if (i % 2 == 0) {
            return c9292ci;
        }
        throw null;
    }

    /* JADX WARN: Code restructure failed: missing block: B:0:?, code lost:
        r8 = r8;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    private static void values(java.lang.String r8, int r9, java.lang.Object[] r10) {
        /*
            if (r8 == 0) goto L6
            char[] r8 = r8.toCharArray()
        L6:
            char[] r8 = (char[]) r8
            java.lang.Object r0 = com.netcetera.threeds.sdk.infrastructure.getWarnings.valueOf
            monitor-enter(r0)
            long r1 = com.netcetera.threeds.sdk.infrastructure.C9234al.ThreeDS2Service     // Catch: java.lang.Throwable -> L3a
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
            long r6 = com.netcetera.threeds.sdk.infrastructure.C9234al.ThreeDS2Service     // Catch: java.lang.Throwable -> L3a
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
        throw new UnsupportedOperationException("Method not decompiled: com.netcetera.threeds.sdk.infrastructure.C9234al.values(java.lang.String, int, java.lang.Object[]):void");
    }

    @Override // com.netcetera.threeds.sdk.infrastructure.storeToXML
    public void ThreeDS2ServiceInstance(CheckBox checkBox) {
        Object obj;
        int i = get + 21;
        values = i % 128;
        if (i % 2 == 0) {
            Object[] objArr = new Object[1];
            values("죕좶焚䤈뀉\ue840⥑삜䅂欝鈮쩳ୠ贏\uf42dⰕ洲꽌확ฒ伜녣㡭瀓ꄿ퍱\u1a8e叐菌\uf29e粟뗃\ue5e4ᒦ庶韫쟊㛔䃍璉㦉", View.MeasureSpec.getMode(0), objArr);
            obj = objArr[0];
        } else {
            Object[] objArr2 = new Object[1];
            values("죕좶焚䤈뀉\ue840⥑삜䅂欝鈮쩳ୠ贏\uf42dⰕ洲꽌확ฒ伜녣㡭瀓ꄿ퍱\u1a8e叐菌\uf29e粟뗃\ue5e4ᒦ庶韫쟊㛔䃍璉㦉", View.MeasureSpec.getMode(0), objArr2);
            obj = objArr2[0];
        }
        values(checkBox, ((String) obj).intern());
    }
}
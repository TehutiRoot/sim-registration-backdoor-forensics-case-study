package com.netcetera.threeds.sdk.infrastructure;

import android.text.TextUtils;
import com.netcetera.threeds.sdk.api.p018ui.logic.UiCustomization;
import com.netcetera.threeds.sdk.infrastructure.setId;
import java.util.HashMap;
import java.util.Map;

/* renamed from: com.netcetera.threeds.sdk.infrastructure.ju */
/* loaded from: classes5.dex */
public class C9517ju {
    private static int ThreeDS2Service = 0;
    public static long ThreeDS2ServiceInstance = -4677452913228388849L;
    private static int values = 1;

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
            long r1 = com.netcetera.threeds.sdk.infrastructure.C9517ju.ThreeDS2ServiceInstance     // Catch: java.lang.Throwable -> L3a
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
            long r6 = com.netcetera.threeds.sdk.infrastructure.C9517ju.ThreeDS2ServiceInstance     // Catch: java.lang.Throwable -> L3a
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
        throw new UnsupportedOperationException("Method not decompiled: com.netcetera.threeds.sdk.infrastructure.C9517ju.ThreeDS2Service(java.lang.String, int, java.lang.Object[]):void");
    }

    private <T> T get(T t) {
        ThreeDS2Service = (values + 115) % 128;
        try {
            T t2 = (T) C9617nf.get(t);
            int i = values + 33;
            ThreeDS2Service = i % 128;
            if (i % 2 == 0) {
                return t2;
            }
            throw null;
        } catch (setId e) {
            setId.get getVar = setId.get(e.ThreeDS2Service());
            Object[] objArr = new Object[1];
            ThreeDS2Service("Ꮃ攎ꙋ豉Ᏽ荠樼㸈诪ᬡ숱왔⎤玩媾溞\udb62쮬㋭\uf6cd獣⎕謠鼱\ueaef먕换❼芴ሗﮨ쿼㩸櫛厩埍툺슢⯀\uf837䧛╊耜聩\ue191봈ᡉ⢥饈ᗃ\uf0d7", 1 - TextUtils.getTrimmedLength(""), objArr);
            throw getVar.get(((String) objArr[0]).intern()).values(e).valueOf();
        }
    }

    public com.netcetera.threeds.sdk.api.p018ui.logic.UiCustomization values(com.netcetera.threeds.sdk.api.p018ui.logic.UiCustomization uiCustomization) throws setId {
        com.netcetera.threeds.sdk.api.p018ui.logic.UiCustomization uiCustomization2 = (com.netcetera.threeds.sdk.api.p018ui.logic.UiCustomization) C9664oh.ThreeDS2Service((com.netcetera.threeds.sdk.api.p018ui.logic.UiCustomization) get(uiCustomization), new com.netcetera.threeds.sdk.api.p018ui.logic.UiCustomization());
        ThreeDS2Service = (values + 71) % 128;
        return uiCustomization2;
    }

    public Map<UiCustomization.UiCustomizationType, com.netcetera.threeds.sdk.api.p018ui.logic.UiCustomization> values(Map<UiCustomization.UiCustomizationType, com.netcetera.threeds.sdk.api.p018ui.logic.UiCustomization> map) throws setId {
        ThreeDS2Service = (values + 101) % 128;
        if (map != null && !map.isEmpty()) {
            UiCustomization.UiCustomizationType uiCustomizationType = UiCustomization.UiCustomizationType.DEFAULT;
            if (!map.containsKey(uiCustomizationType)) {
                map.put(uiCustomizationType, new com.netcetera.threeds.sdk.api.p018ui.logic.UiCustomization());
            }
            UiCustomization.UiCustomizationType uiCustomizationType2 = UiCustomization.UiCustomizationType.DARK;
            if (!map.containsKey(uiCustomizationType2)) {
                map.put(uiCustomizationType2, new com.netcetera.threeds.sdk.api.p018ui.logic.UiCustomization());
            }
            UiCustomization.UiCustomizationType uiCustomizationType3 = UiCustomization.UiCustomizationType.MONOCHROME;
            if (!map.containsKey(uiCustomizationType3)) {
                map.put(uiCustomizationType3, new com.netcetera.threeds.sdk.api.p018ui.logic.UiCustomization());
                ThreeDS2Service = (values + 73) % 128;
            }
            return (Map) get(map);
        }
        HashMap<UiCustomization.UiCustomizationType, com.netcetera.threeds.sdk.api.p018ui.logic.UiCustomization> hashMap = new HashMap<UiCustomization.UiCustomizationType, com.netcetera.threeds.sdk.api.p018ui.logic.UiCustomization>() { // from class: com.netcetera.threeds.sdk.infrastructure.ju.2
            {
                put(UiCustomization.UiCustomizationType.DEFAULT, new com.netcetera.threeds.sdk.api.p018ui.logic.UiCustomization());
                put(UiCustomization.UiCustomizationType.DARK, new com.netcetera.threeds.sdk.api.p018ui.logic.UiCustomization());
            }
        };
        int i = values + 113;
        ThreeDS2Service = i % 128;
        if (i % 2 == 0) {
            return hashMap;
        }
        throw null;
    }
}

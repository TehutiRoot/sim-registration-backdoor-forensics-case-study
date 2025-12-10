package com.netcetera.threeds.sdk.infrastructure;

/* renamed from: com.netcetera.threeds.sdk.infrastructure.ap */
/* loaded from: classes5.dex */
public class C9250ap {
    public static char ThreeDS2Service = 59005;
    private static int ThreeDS2ServiceInstance = 0;
    public static char get = 15476;
    private static int getWarnings = 1;
    public static char valueOf = 13311;
    public static char values = 6830;

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
            char r11 = com.netcetera.threeds.sdk.infrastructure.C9250ap.get     // Catch: java.lang.Throwable -> L5b
            int r10 = r10 + r11
            r9 = r9 ^ r10
            int r10 = r8 >>> 5
            char r11 = com.netcetera.threeds.sdk.infrastructure.C9250ap.valueOf     // Catch: java.lang.Throwable -> L5b
            int r10 = r10 + r11
            r9 = r9 ^ r10
            int r7 = r7 - r9
            char r7 = (char) r7     // Catch: java.lang.Throwable -> L5b
            r3[r5] = r7     // Catch: java.lang.Throwable -> L5b
            int r9 = r7 + r4
            int r10 = r7 << 4
            char r11 = com.netcetera.threeds.sdk.infrastructure.C9250ap.values     // Catch: java.lang.Throwable -> L5b
            int r10 = r10 + r11
            r9 = r9 ^ r10
            int r7 = r7 >>> 5
            char r10 = com.netcetera.threeds.sdk.infrastructure.C9250ap.ThreeDS2Service     // Catch: java.lang.Throwable -> L5b
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
        throw new UnsupportedOperationException("Method not decompiled: com.netcetera.threeds.sdk.infrastructure.C9250ap.values(java.lang.String, int, java.lang.Object[]):void");
    }

    /* JADX WARN: Code restructure failed: missing block: B:10:0x0025, code lost:
        return r8;
     */
    /* JADX WARN: Code restructure failed: missing block: B:11:0x0026, code lost:
        r2 = new java.lang.Object[1];
        values("ᖊ䥠ꩋ韬稜ˬ鰇진甛ﱘ⾤荴쉚瓟", (android.os.SystemClock.elapsedRealtime() > 0 ? 1 : (android.os.SystemClock.elapsedRealtime() == 0 ? 0 : -1)) + 13, r2);
        r8 = r8.replaceAll(((java.lang.String) r2[0]).intern(), "");
        r3 = new java.lang.Object[1];
        values("ᖊ䥠絩ﲯ亇섊惟輝\uf2ae릁፲⨺ᷩ\ud9bbò䘇㵟瀪件\uecdaήᶃ曅Ð\udad1\uf7c6쳪ⲃិ౪鏣洚\ua7da\uea6bិ౪枌ἰףⓝិ౪㊣蝐韫腢⠩燖\udc89떤倈ዾꤹ들ㅤ\ue3d4륯思\ued35吹倈ዾ揽傺鏣洚ិ౪ᷩ\ud9bbò䘇ᷥ㌞僫ᅩ", (android.view.ViewConfiguration.getEdgeSlop() >> 16) + 75, r3);
        r2 = ((java.lang.String) r3[0]).intern();
        r4 = new java.lang.Object[1];
        values("嘪濾榰䰒릂怊뫁襼⩃앸", (android.view.ViewConfiguration.getScrollFriction() > 0.0f ? 1 : (android.view.ViewConfiguration.getScrollFriction() == 0.0f ? 0 : -1)) + 8, r4);
        r8 = r8.replaceAll(r2, ((java.lang.String) r4[0]).intern());
        r3 = new java.lang.Object[1];
        values("ᖊ䥠絩ﲯ亇섊惟輝\uf2ae릁፲⨺ᷩ\ud9bbò䘇喖♢靇榵ិ౪\ue142弉ꏓᮚήᶃិ౪羅쟥숈ꆰិ౪稌䰦ꏪ《庙쮿뗴敋뗴敋῟萣ة橕؎ᬯ뗴敋\udd4f꺀\ueaeb件蝬ꞛܬ㗟挬멺숈ꆰ륯思㿴場餼✸吊頱ꤹ들쳪ⲃិ౪\u0fe1Ꞇ糇\ue9eb㪫廂讶牠\ud830锤㸍︘鱗这ꦟ䛄\ue37cⱍ腎䝖捜\udf03ᆚ椥犡叐閚證吊頱ិ౪㊣蝐鏣洚ិ౪ᷩ\ud9bbò䘇ᷥ㌞僫ᅩ", 125 - android.graphics.Color.blue(0), r3);
        r2 = ((java.lang.String) r3[0]).intern();
        r0 = new java.lang.Object[1];
        values("嘪濾隲Ჰᷰ䒤ꍡᄑ㢶뤱赎ڃ鷳\uf38e\ueaa5졠竅꜃鱗这ꦟ䛄\ue37cⱍ㥛羣\udd4f꺀\ueaeb件蝬ꞛܬ㗟\ue3c8䤣礧羛哞㶮", 39 - android.view.View.resolveSizeAndState(0, 0, 0), r0);
     */
    /* JADX WARN: Code restructure failed: missing block: B:12:0x00a7, code lost:
        return r8.replaceAll(r2, ((java.lang.String) r0[0]).intern());
     */
    /* JADX WARN: Code restructure failed: missing block: B:5:0x0014, code lost:
        if (com.netcetera.threeds.sdk.infrastructure.C9669om.values((java.lang.CharSequence) r8) != false) goto L8;
     */
    /* JADX WARN: Code restructure failed: missing block: B:8:0x001b, code lost:
        if (com.netcetera.threeds.sdk.infrastructure.C9669om.values((java.lang.CharSequence) r8) != false) goto L8;
     */
    /* JADX WARN: Code restructure failed: missing block: B:9:0x001d, code lost:
        com.netcetera.threeds.sdk.infrastructure.C9250ap.ThreeDS2ServiceInstance = (com.netcetera.threeds.sdk.infrastructure.C9250ap.getWarnings + 57) % 128;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public java.lang.String get(java.lang.String r8) {
        /*
            r7 = this;
            int r0 = com.netcetera.threeds.sdk.infrastructure.C9250ap.getWarnings
            int r0 = r0 + 71
            int r1 = r0 % 128
            com.netcetera.threeds.sdk.infrastructure.C9250ap.ThreeDS2ServiceInstance = r1
            int r0 = r0 % 2
            r1 = 0
            if (r0 == 0) goto L17
            boolean r0 = com.netcetera.threeds.sdk.infrastructure.C9669om.values(r8)
            r2 = 20
            int r2 = r2 / r1
            if (r0 == 0) goto L26
            goto L1d
        L17:
            boolean r0 = com.netcetera.threeds.sdk.infrastructure.C9669om.values(r8)
            if (r0 == 0) goto L26
        L1d:
            int r0 = com.netcetera.threeds.sdk.infrastructure.C9250ap.getWarnings
            int r0 = r0 + 57
            int r0 = r0 % 128
            com.netcetera.threeds.sdk.infrastructure.C9250ap.ThreeDS2ServiceInstance = r0
            return r8
        L26:
            long r2 = android.os.SystemClock.elapsedRealtime()
            r4 = 0
            r0 = 1
            int r6 = (r2 > r4 ? 1 : (r2 == r4 ? 0 : -1))
            int r6 = r6 + 13
            java.lang.Object[] r2 = new java.lang.Object[r0]
            java.lang.String r3 = "ᖊ䥠ꩋ韬稜ˬ鰇진甛ﱘ⾤荴쉚瓟"
            values(r3, r6, r2)
            r2 = r2[r1]
            java.lang.String r2 = (java.lang.String) r2
            java.lang.String r2 = r2.intern()
            java.lang.String r3 = ""
            java.lang.String r8 = r8.replaceAll(r2, r3)
            int r2 = android.view.ViewConfiguration.getEdgeSlop()
            int r2 = r2 >> 16
            int r2 = r2 + 75
            java.lang.Object[] r3 = new java.lang.Object[r0]
            java.lang.String r4 = "ᖊ䥠絩ﲯ亇섊惟輝\uf2ae릁፲⨺ᷩ\ud9bbò䘇㵟瀪件\uecdaήᶃ曅Ð\udad1\uf7c6쳪ⲃិ౪鏣洚\ua7da\uea6bិ౪枌ἰףⓝិ౪㊣蝐韫腢⠩燖\udc89떤倈ዾꤹ들ㅤ\ue3d4륯思\ued35吹倈ዾ揽傺鏣洚ិ౪ᷩ\ud9bbò䘇ᷥ㌞僫ᅩ"
            values(r4, r2, r3)
            r2 = r3[r1]
            java.lang.String r2 = (java.lang.String) r2
            java.lang.String r2 = r2.intern()
            float r3 = android.view.ViewConfiguration.getScrollFriction()
            r4 = 0
            int r3 = (r3 > r4 ? 1 : (r3 == r4 ? 0 : -1))
            int r3 = r3 + 8
            java.lang.Object[] r4 = new java.lang.Object[r0]
            java.lang.String r5 = "嘪濾榰䰒릂怊뫁襼⩃앸"
            values(r5, r3, r4)
            r3 = r4[r1]
            java.lang.String r3 = (java.lang.String) r3
            java.lang.String r3 = r3.intern()
            java.lang.String r8 = r8.replaceAll(r2, r3)
            int r2 = android.graphics.Color.blue(r1)
            int r2 = 125 - r2
            java.lang.Object[] r3 = new java.lang.Object[r0]
            java.lang.String r4 = "ᖊ䥠絩ﲯ亇섊惟輝\uf2ae릁፲⨺ᷩ\ud9bbò䘇喖♢靇榵ិ౪\ue142弉ꏓᮚήᶃិ౪羅쟥숈ꆰិ౪稌䰦ꏪ《庙쮿뗴敋뗴敋῟萣ة橕؎ᬯ뗴敋\udd4f꺀\ueaeb件蝬ꞛܬ㗟挬멺숈ꆰ륯思㿴場餼✸吊頱ꤹ들쳪ⲃិ౪\u0fe1Ꞇ糇\ue9eb㪫廂讶牠\ud830锤㸍︘鱗这ꦟ䛄\ue37cⱍ腎䝖捜\udf03ᆚ椥犡叐閚證吊頱ិ౪㊣蝐鏣洚ិ౪ᷩ\ud9bbò䘇ᷥ㌞僫ᅩ"
            values(r4, r2, r3)
            r2 = r3[r1]
            java.lang.String r2 = (java.lang.String) r2
            java.lang.String r2 = r2.intern()
            int r3 = android.view.View.resolveSizeAndState(r1, r1, r1)
            int r3 = 39 - r3
            java.lang.Object[] r0 = new java.lang.Object[r0]
            java.lang.String r4 = "嘪濾隲Ჰᷰ䒤ꍡᄑ㢶뤱赎ڃ鷳\uf38e\ueaa5졠竅꜃鱗这ꦟ䛄\ue37cⱍ㥛羣\udd4f꺀\ueaeb件蝬ꞛܬ㗟\ue3c8䤣礧羛哞㶮"
            values(r4, r3, r0)
            r0 = r0[r1]
            java.lang.String r0 = (java.lang.String) r0
            java.lang.String r0 = r0.intern()
            java.lang.String r8 = r8.replaceAll(r2, r0)
            return r8
        */
        throw new UnsupportedOperationException("Method not decompiled: com.netcetera.threeds.sdk.infrastructure.C9250ap.get(java.lang.String):java.lang.String");
    }
}

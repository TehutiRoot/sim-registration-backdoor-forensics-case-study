package com.netcetera.threeds.sdk.infrastructure;

import android.text.TextUtils;
import android.view.KeyEvent;
import android.view.View;
import android.view.ViewConfiguration;
import java.io.DataOutputStream;
import java.io.File;
import java.io.IOException;

/* loaded from: classes5.dex */
public final class configureScheme {
    private static int ThreeDS2Service = 1;
    private static int get = 0;
    private static long valueOf = -6833353940995634097L;

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
            java.lang.Object r0 = com.netcetera.threeds.sdk.infrastructure.getParamValue.ThreeDS2ServiceInstance
            monitor-enter(r0)
            long r1 = com.netcetera.threeds.sdk.infrastructure.configureScheme.valueOf     // Catch: java.lang.Throwable -> L3a
            char[] r8 = com.netcetera.threeds.sdk.infrastructure.getParamValue.valueOf(r1, r8, r9)     // Catch: java.lang.Throwable -> L3a
            r9 = 4
            com.netcetera.threeds.sdk.infrastructure.getParamValue.get = r9     // Catch: java.lang.Throwable -> L3a
        L14:
            int r1 = com.netcetera.threeds.sdk.infrastructure.getParamValue.get     // Catch: java.lang.Throwable -> L3a
            int r2 = r8.length     // Catch: java.lang.Throwable -> L3a
            if (r1 >= r2) goto L3c
            int r1 = r1 + (-4)
            com.netcetera.threeds.sdk.infrastructure.getParamValue.valueOf = r1     // Catch: java.lang.Throwable -> L3a
            int r1 = com.netcetera.threeds.sdk.infrastructure.getParamValue.get     // Catch: java.lang.Throwable -> L3a
            char r2 = r8[r1]     // Catch: java.lang.Throwable -> L3a
            int r3 = r1 % 4
            char r3 = r8[r3]     // Catch: java.lang.Throwable -> L3a
            r2 = r2 ^ r3
            long r2 = (long) r2     // Catch: java.lang.Throwable -> L3a
            int r4 = com.netcetera.threeds.sdk.infrastructure.getParamValue.valueOf     // Catch: java.lang.Throwable -> L3a
            long r4 = (long) r4     // Catch: java.lang.Throwable -> L3a
            long r6 = com.netcetera.threeds.sdk.infrastructure.configureScheme.valueOf     // Catch: java.lang.Throwable -> L3a
            long r4 = r4 * r6
            long r2 = r2 ^ r4
            int r3 = (int) r2     // Catch: java.lang.Throwable -> L3a
            char r2 = (char) r3     // Catch: java.lang.Throwable -> L3a
            r8[r1] = r2     // Catch: java.lang.Throwable -> L3a
            int r1 = com.netcetera.threeds.sdk.infrastructure.getParamValue.get     // Catch: java.lang.Throwable -> L3a
            int r1 = r1 + 1
            com.netcetera.threeds.sdk.infrastructure.getParamValue.get = r1     // Catch: java.lang.Throwable -> L3a
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
        throw new UnsupportedOperationException("Method not decompiled: com.netcetera.threeds.sdk.infrastructure.configureScheme.ThreeDS2Service(java.lang.String, int, java.lang.Object[]):void");
    }

    public static String ThreeDS2ServiceInstance(String str) throws IOException {
        try {
            Runtime runtime = Runtime.getRuntime();
            Object[] objArr = new Object[1];
            ThreeDS2Service("畫쬼磎\uda9b甘䜛", TextUtils.indexOf("", "", 0) + 1, objArr);
            Process exec = runtime.exec((String) objArr[0], (String[]) null, (File) null);
            getSchemeId getschemeid = new getSchemeId(exec.getInputStream());
            getSchemeId getschemeid2 = new getSchemeId(exec.getErrorStream());
            DataOutputStream dataOutputStream = new DataOutputStream(exec.getOutputStream());
            getschemeid.start();
            getschemeid2.start();
            StringBuilder sb = new StringBuilder();
            sb.append(str);
            Object[] objArr2 = new Object[1];
            ThreeDS2Service("捑\uf472鲁\uf89d捛", 1 - KeyEvent.normalizeMetaState(0), objArr2);
            sb.append((String) objArr2[0]);
            String obj = sb.toString();
            Object[] objArr3 = new Object[1];
            ThreeDS2Service("\uef3b狊⫔⯇\uef6eﻑ㈌輇\ude3f", View.resolveSize(0, 0) + 1, objArr3);
            dataOutputStream.write(obj.getBytes((String) objArr3[0]));
            dataOutputStream.flush();
            Object[] objArr4 = new Object[1];
            ThreeDS2Service("ꈛ軥\uffdf︸ꉾ˒\ue728媡錭", 1 - (ViewConfiguration.getKeyRepeatDelay() >> 16), objArr4);
            Object[] objArr5 = new Object[1];
            ThreeDS2Service("\uef3b狊⫔⯇\uef6eﻑ㈌輇\ude3f", 1 - (ViewConfiguration.getScrollDefaultDelay() >> 16), objArr5);
            dataOutputStream.write(((String) objArr4[0]).getBytes((String) objArr5[0]));
            dataOutputStream.flush();
            ThreeDS2Service = (get + 105) % 128;
            try {
                exec.waitFor();
                try {
                    dataOutputStream.close();
                    ThreeDS2Service = (get + 51) % 128;
                } catch (IOException unused) {
                }
                getschemeid.join(100L);
                getschemeid2.join(10L);
                try {
                    exec.destroy();
                } catch (Exception unused2) {
                }
                StringBuilder sb2 = new StringBuilder();
                sb2.append(getschemeid.values());
                sb2.append(getschemeid2.values());
                return sb2.toString();
            } catch (InterruptedException e) {
                throw e;
            }
        } catch (Exception unused3) {
            Object[] objArr6 = new Object[1];
            ThreeDS2Service("ᓺ앞ꂻ㙔ᒼ䥰롌鋕▣碱\ue941\ue009盭⮹\udbceㅃ蜫\ue53cಝຐ퀪鐀紕忹\ue2a4䝊긒괨㏡皚\ue093", (ViewConfiguration.getScrollFriction() > 0.0f ? 1 : (ViewConfiguration.getScrollFriction() == 0.0f ? 0 : -1)), objArr6);
            throw new IOException((String) objArr6[0]);
        }
    }
}

package com.netcetera.threeds.sdk.infrastructure;

import android.content.ActivityNotFoundException;
import android.content.Context;
import android.content.Intent;
import android.net.Uri;
import android.os.Process;
import android.text.TextUtils;
import android.view.ViewConfiguration;
import com.netcetera.threeds.sdk.infrastructure.setLinksClickable;

/* loaded from: classes5.dex */
abstract class setLinkTextColor implements setLinksClickable {
    public static long ThreeDS2Service = -5879935187906506673L;
    private static int ThreeDS2ServiceInstance = 0;
    private static int get = 1;
    private final String valueOf;
    private final InterfaceC9652ns values = C9653nt.ThreeDS2ServiceInstance(setLinksClickable.class);

    public setLinkTextColor(String str) {
        this.valueOf = str;
    }

    public abstract void ThreeDS2Service(Context context, Intent intent);

    public void valueOf(Context context, Intent intent, setLinksClickable.valueOf valueof) {
        int i = ThreeDS2ServiceInstance + 29;
        get = i % 128;
        try {
            if (i % 2 == 0) {
                intent.setFlags(268435456);
                context.startActivity(intent);
                int i2 = 69 / 0;
            } else {
                intent.setFlags(268435456);
                context.startActivity(intent);
            }
        } catch (ActivityNotFoundException e) {
            InterfaceC9652ns interfaceC9652ns = this.values;
            Object[] objArr = new Object[1];
            values("倁쯯柱荃㼃嬴\uf6f9\u128f蹔⩩䘭\ue1c3ᶔ릢픽焈\uecd0\u0885꒯쁶籃韕㏧꾺쭂杘茽㻵嫋\uf653ች踻⧁䗀\ue17eᵭ뤱퓥炅\uecb6ࡂꐚ\udfd5", (Process.myTid() >> 22) + 39887, objArr);
            interfaceC9652ns.ThreeDS2Service(((String) objArr[0]).intern(), e);
            valueof.get();
        }
    }

    @Override // com.netcetera.threeds.sdk.infrastructure.setLinksClickable
    public final void values(Context context, setLinksClickable.valueOf valueof) {
        Uri parse = Uri.parse(this.valueOf);
        Object[] objArr = new Object[1];
        values("倮⋂뗭\u0894鮬湉\ue179瑔윾姚⳥뿫㊅薼᠋\ueb63縜\uf128䏐훹ꦝ㳾辛ɣ镂栳", 29410 - TextUtils.lastIndexOf("", '0', 0), objArr);
        Intent intent = new Intent(((String) objArr[0]).intern(), parse);
        try {
            Intent intent2 = new Intent(intent);
            ThreeDS2Service(context, intent2);
            context.startActivity(intent2);
        } catch (ActivityNotFoundException unused) {
            InterfaceC9652ns interfaceC9652ns = this.values;
            Object[] objArr2 = new Object[1];
            values("倉\u181f쁄袰烮㣞\ue149ꥬᆨ\ud9d6臉䨵㉶臭ꊂ櫸퍿魁䍲ம\uf3bb밫搉ⱘ钻峯Ӗ촅땧綫▞\uedce噁Ḿ욟躙盟㼨\ue770꽑ញ\udff1补瀃㡊\ue0a6꣩႐\ud919腏䦱㇠慄ꈋ橺튣髗䋊\u0b34\uf371뭝掁⯹", 18481 - (ViewConfiguration.getScrollDefaultDelay() >> 16), objArr2);
            interfaceC9652ns.valueOf(((String) objArr2[0]).intern());
            valueOf(context, new Intent(intent), valueof);
        }
        int i = get + 37;
        ThreeDS2ServiceInstance = i % 128;
        if (i % 2 != 0) {
            int i2 = 84 / 0;
        }
    }

    /* JADX WARN: Code restructure failed: missing block: B:0:?, code lost:
        r7 = r7;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    private static void values(java.lang.String r7, int r8, java.lang.Object[] r9) {
        /*
            if (r7 == 0) goto L6
            char[] r7 = r7.toCharArray()
        L6:
            char[] r7 = (char[]) r7
            java.lang.Object r0 = com.netcetera.threeds.sdk.infrastructure.initialize.values
            monitor-enter(r0)
            com.netcetera.threeds.sdk.infrastructure.initialize.ThreeDS2Service = r8     // Catch: java.lang.Throwable -> L2e
            int r8 = r7.length     // Catch: java.lang.Throwable -> L2e
            char[] r8 = new char[r8]     // Catch: java.lang.Throwable -> L2e
            r1 = 0
            com.netcetera.threeds.sdk.infrastructure.initialize.ThreeDS2ServiceInstance = r1     // Catch: java.lang.Throwable -> L2e
        L13:
            int r2 = com.netcetera.threeds.sdk.infrastructure.initialize.ThreeDS2ServiceInstance     // Catch: java.lang.Throwable -> L2e
            int r3 = r7.length     // Catch: java.lang.Throwable -> L2e
            if (r2 >= r3) goto L30
            char r3 = r7[r2]     // Catch: java.lang.Throwable -> L2e
            int r4 = com.netcetera.threeds.sdk.infrastructure.initialize.ThreeDS2Service     // Catch: java.lang.Throwable -> L2e
            int r4 = r4 * r2
            r3 = r3 ^ r4
            long r3 = (long) r3     // Catch: java.lang.Throwable -> L2e
            long r5 = com.netcetera.threeds.sdk.infrastructure.setLinkTextColor.ThreeDS2Service     // Catch: java.lang.Throwable -> L2e
            long r3 = r3 ^ r5
            int r4 = (int) r3     // Catch: java.lang.Throwable -> L2e
            char r3 = (char) r4     // Catch: java.lang.Throwable -> L2e
            r8[r2] = r3     // Catch: java.lang.Throwable -> L2e
            int r2 = com.netcetera.threeds.sdk.infrastructure.initialize.ThreeDS2ServiceInstance     // Catch: java.lang.Throwable -> L2e
            int r2 = r2 + 1
            com.netcetera.threeds.sdk.infrastructure.initialize.ThreeDS2ServiceInstance = r2     // Catch: java.lang.Throwable -> L2e
            goto L13
        L2e:
            r7 = move-exception
            goto L39
        L30:
            java.lang.String r7 = new java.lang.String     // Catch: java.lang.Throwable -> L2e
            r7.<init>(r8)     // Catch: java.lang.Throwable -> L2e
            monitor-exit(r0)     // Catch: java.lang.Throwable -> L2e
            r9[r1] = r7
            return
        L39:
            monitor-exit(r0)
            throw r7
        */
        throw new UnsupportedOperationException("Method not decompiled: com.netcetera.threeds.sdk.infrastructure.setLinkTextColor.values(java.lang.String, int, java.lang.Object[]):void");
    }
}

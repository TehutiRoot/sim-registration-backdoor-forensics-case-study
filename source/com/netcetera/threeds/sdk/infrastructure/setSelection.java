package com.netcetera.threeds.sdk.infrastructure;

import android.content.Context;
import android.graphics.Color;
import android.graphics.ImageFormat;
import android.media.AudioTrack;
import android.text.TextUtils;
import android.view.View;
import com.google.android.gms.common.GoogleApiAvailability;
import com.google.android.gms.common.GooglePlayServicesNotAvailableException;
import com.google.android.gms.common.GooglePlayServicesRepairableException;
import com.google.android.gms.security.ProviderInstaller;

/* loaded from: classes5.dex */
public class setSelection {
    public static long ThreeDS2Service = 6561163157502947571L;
    private static int ThreeDS2ServiceInstance = 1;
    private static int values;
    private final InterfaceC9652ns valueOf = C9653nt.ThreeDS2ServiceInstance(setSelection.class);

    /* JADX WARN: Code restructure failed: missing block: B:0:?, code lost:
        r7 = r7;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    private static void ThreeDS2Service(java.lang.String r7, int r8, java.lang.Object[] r9) {
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
            long r5 = com.netcetera.threeds.sdk.infrastructure.setSelection.ThreeDS2Service     // Catch: java.lang.Throwable -> L2e
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
        throw new UnsupportedOperationException("Method not decompiled: com.netcetera.threeds.sdk.infrastructure.setSelection.ThreeDS2Service(java.lang.String, int, java.lang.Object[]):void");
    }

    private boolean ThreeDS2ServiceInstance(Context context) {
        int i = ThreeDS2ServiceInstance + 85;
        values = i % 128;
        if (i % 2 == 0) {
            if (GoogleApiAvailability.getInstance().isGooglePlayServicesAvailable(context) != 0) {
                return false;
            }
            int i2 = ThreeDS2ServiceInstance + 89;
            values = i2 % 128;
            if (i2 % 2 == 0) {
                return true;
            }
            throw null;
        }
        GoogleApiAvailability.getInstance().isGooglePlayServicesAvailable(context);
        throw null;
    }

    private boolean valueOf() {
        Object[] objArr = new Object[1];
        ThreeDS2Service("\uf090섭鏼旎㙐ࣩ\udabaꭃ紗侯7툉ꓑ番䜯ᧃ\ueb8a뱖躯䂷ᅊ\ue305뗫虷堄⫗ﭤ촷鿁凐∊\uf4f3욼靅椝㮥ౖ\ude16郜慅㌭\u05cb힐ꠤ竾䲌ᵔ\uefe0ꆪ牦䐘", (-16764495) - Color.rgb(0, 0, 0), objArr);
        if (!C9600mq.ThreeDS2Service(((String) objArr[0]).intern())) {
            return false;
        }
        values = (ThreeDS2ServiceInstance + 115) % 128;
        Object[] objArr2 = new Object[1];
        ThreeDS2Service("\uf090滳챀⮐褨\ue8b7䘆ꖝϧ慱삋㹗鶩הּ媓렝ᙪ痈팓㊩進ྛ浗쭹⫾衇\ue7c0䔴꒾Ȕ憈\udfac㵃鳎諸妨뜆᚜瓬퉨㇢꽚ຶ氢쮆⤜蝭\ue6f7䑑", 40558 - ImageFormat.getBitsPerPixel(0), objArr2);
        if (!C9600mq.ThreeDS2Service(((String) objArr2[0]).intern())) {
            return false;
        }
        ThreeDS2ServiceInstance = (values + 41) % 128;
        return true;
    }

    public void values(Context context) throws setId {
        if (!valueOf()) {
            int i = ThreeDS2ServiceInstance + 21;
            values = i % 128;
            if (i % 2 != 0) {
                InterfaceC9652ns interfaceC9652ns = this.valueOf;
                Object[] objArr = new Object[1];
                ThreeDS2Service("\uf0b4㬅枮鉟\udefb५㕅憌걗\ud8f3Ͱ佀箌ꙓ틟ᵲ䤊疹ꁔ\uecdbᜧ䌚辰먼\ue6ceᅬ崝覵됡\ue0c5⭤坔莺츹嬨╵儞鶝젶\uf4d5㽵欕韅쉠ໜ㥷旣醊\udc2c\u08ce㌱翽ꮗ혺˔䵘秮ꗂ퀭᳘䝊玦뾎\uea31ᛐ䅟跳릑\ue423Ⴗ嬅蟬뎉︽⪿啉臻춓\uf81f⓪", 52121 / TextUtils.getOffsetAfter("", 1), objArr);
                interfaceC9652ns.valueOf(((String) objArr[0]).intern());
                return;
            }
            InterfaceC9652ns interfaceC9652ns2 = this.valueOf;
            Object[] objArr2 = new Object[1];
            ThreeDS2Service("\uf0b4㬅枮鉟\udefb५㕅憌걗\ud8f3Ͱ佀箌ꙓ틟ᵲ䤊疹ꁔ\uecdbᜧ䌚辰먼\ue6ceᅬ崝覵됡\ue0c5⭤坔莺츹嬨╵儞鶝젶\uf4d5㽵欕韅쉠ໜ㥷旣醊\udc2c\u08ce㌱翽ꮗ혺˔䵘秮ꗂ퀭᳘䝊玦뾎\uea31ᛐ䅟跳릑\ue423Ⴗ嬅蟬뎉︽⪿啉臻춓\uf81f⓪", TextUtils.getOffsetAfter("", 0) + 52121, objArr2);
            interfaceC9652ns2.valueOf(((String) objArr2[0]).intern());
        } else if (!ThreeDS2ServiceInstance(context)) {
            ThreeDS2ServiceInstance = (values + 81) % 128;
            InterfaceC9652ns interfaceC9652ns3 = this.valueOf;
            Object[] objArr3 = new Object[1];
            ThreeDS2Service("\uf0b4ﻗ\uec0a\uda75즳럡ꔑ钮苇瀱繤淪嬤䥙㢛⛠ᐪɫ\uf1d0１\ued0f\udcb5쫳렫\ua7db闎茂煮惧滭屏䮇㧺✴ᕤӐ\uf213\ue041\ueff1\uddf1쬥뫐\ua8c9阂葲珼懭潓底䳁㨶⡧១", 3659 - (AudioTrack.getMinVolume() > 0.0f ? 1 : (AudioTrack.getMinVolume() == 0.0f ? 0 : -1)), objArr3);
            interfaceC9652ns3.valueOf(((String) objArr3[0]).intern());
        } else {
            try {
                AudioTrack.getMaxVolume();
                ProviderInstaller.installIfNeeded(context);
                View.getDefaultSize(0, 0);
                ThreeDS2ServiceInstance = (values + 85) % 128;
            } catch (GooglePlayServicesNotAvailableException e) {
                throw setForegroundGravity.get3DSServerTransactionID.valueOf(e);
            } catch (GooglePlayServicesRepairableException e2) {
                throw setForegroundGravity.getAcsRefNumber.valueOf(e2);
            } catch (RuntimeException e3) {
                throw setForegroundGravity.setAcsSignedContent.valueOf(e3);
            }
        }
    }
}

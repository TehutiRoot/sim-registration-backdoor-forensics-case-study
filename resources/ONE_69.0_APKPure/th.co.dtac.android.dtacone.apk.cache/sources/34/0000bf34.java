package com.netcetera.threeds.sdk.infrastructure;

import android.graphics.Color;
import android.os.SystemClock;
import android.telephony.cdma.CdmaCellLocation;
import android.text.TextUtils;
import android.view.Gravity;
import android.view.MotionEvent;
import android.view.ViewConfiguration;
import ch.qos.logback.core.CoreConstants;

/* loaded from: classes5.dex */
public class setSubtitleTextAppearance implements setCustomInsertionActionModeCallback {
    public static long ThreeDS2Service = -2238843402381709959L;
    public static int ThreeDS2ServiceInstance = 0;
    private static int getParamValue = 0;
    private static int removeParam = 1;
    public static char valueOf = 0;
    public static long values = -2534667809835405343L;
    private final String ConfigParameters;
    private final entrySet ThreeDS2Service$InitializationCallback;
    private final String cleanup;
    private final keySet createTransaction;
    private final keySet get;
    private final String getSDKInfo;
    private final String getSDKVersion;
    private final String getWarnings;
    private final put initialize;
    private final String onCompleted;
    private final remove onError;

    public setSubtitleTextAppearance(keySet keyset, String str, String str2, put putVar, String str3, String str4, entrySet entryset, remove removeVar, String str5, String str6, keySet keyset2) {
        this.get = keyset;
        this.getWarnings = str;
        this.cleanup = str2;
        this.initialize = putVar;
        this.getSDKInfo = str3;
        this.getSDKVersion = str4;
        this.ThreeDS2Service$InitializationCallback = entryset;
        this.onError = removeVar;
        this.onCompleted = str5;
        this.ConfigParameters = str6;
        this.createTransaction = keyset2;
    }

    @Override // com.netcetera.threeds.sdk.infrastructure.setCustomInsertionActionModeCallback
    public remove SchemeConfiguration$Builder() {
        remove removeVar;
        int i = getParamValue + 33;
        int i2 = i % 128;
        removeParam = i2;
        if (i % 2 == 0) {
            removeVar = this.onError;
            int i3 = 10 / 0;
        } else {
            removeVar = this.onError;
        }
        getParamValue = (i2 + 89) % 128;
        return removeVar;
    }

    @Override // com.netcetera.threeds.sdk.infrastructure.setExtractedText
    public put ThreeDS2Service() {
        int i = getParamValue;
        put putVar = this.initialize;
        int i2 = i + 115;
        removeParam = i2 % 128;
        if (i2 % 2 != 0) {
            return putVar;
        }
        throw null;
    }

    @Override // com.netcetera.threeds.sdk.infrastructure.setExtractedText
    public String ThreeDS2ServiceInstance() {
        String str;
        int i = getParamValue;
        int i2 = i + 17;
        removeParam = i2 % 128;
        if (i2 % 2 == 0) {
            str = this.cleanup;
            int i3 = 49 / 0;
        } else {
            str = this.cleanup;
        }
        int i4 = i + 71;
        removeParam = i4 % 128;
        if (i4 % 2 != 0) {
            return str;
        }
        throw null;
    }

    @Override // com.netcetera.threeds.sdk.infrastructure.setExtractedText
    public keySet get() {
        int i = (removeParam + 7) % 128;
        getParamValue = i;
        keySet keyset = this.get;
        removeParam = (i + 97) % 128;
        return keyset;
    }

    @Override // com.netcetera.threeds.sdk.infrastructure.setCustomInsertionActionModeCallback
    public entrySet getSchemeEncryptionPublicKey() {
        int i = (getParamValue + 81) % 128;
        removeParam = i;
        entrySet entryset = this.ThreeDS2Service$InitializationCallback;
        int i2 = i + 37;
        getParamValue = i2 % 128;
        if (i2 % 2 != 0) {
            int i3 = 75 / 0;
        }
        return entryset;
    }

    @Override // com.netcetera.threeds.sdk.infrastructure.setCustomInsertionActionModeCallback
    public String getSchemeEncryptionPublicKeyId() {
        int i = removeParam;
        String str = this.getSDKVersion;
        int i2 = i + 19;
        getParamValue = i2 % 128;
        if (i2 % 2 == 0) {
            return str;
        }
        throw null;
    }

    @Override // com.netcetera.threeds.sdk.infrastructure.setCustomInsertionActionModeCallback
    public String ids() {
        int i = getParamValue + 121;
        int i2 = i % 128;
        removeParam = i2;
        if (i % 2 != 0) {
            String str = this.ConfigParameters;
            getParamValue = (i2 + 31) % 128;
            return str;
        }
        throw null;
    }

    @Override // com.netcetera.threeds.sdk.infrastructure.setCustomInsertionActionModeCallback
    public String logo() {
        int i = (removeParam + 53) % 128;
        getParamValue = i;
        String str = this.onCompleted;
        int i2 = i + 105;
        removeParam = i2 % 128;
        if (i2 % 2 != 0) {
            return str;
        }
        throw null;
    }

    @Override // com.netcetera.threeds.sdk.infrastructure.setCustomInsertionActionModeCallback
    public keySet logoDark() {
        int i = (getParamValue + 83) % 128;
        removeParam = i;
        keySet keyset = this.createTransaction;
        int i2 = i + 107;
        getParamValue = i2 % 128;
        if (i2 % 2 == 0) {
            return keyset;
        }
        throw null;
    }

    public String toString() {
        Object[] objArr = new Object[1];
        ThreeDS2ServiceInstance(TextUtils.getOffsetAfter("", 0), (char) (TextUtils.lastIndexOf("", '0', 0) + 47229), "⢰扐⺙䅟ࣘｨᡪ鼬⧜阡帒Чգ淥䭲䐪⛣梹\ue178䡽Ⴎⴇ┢冖舸꯷", "ꆛ茸籏嶸", "굹镏߉\ue0ee", objArr);
        StringBuilder sb = new StringBuilder(((String) objArr[0]).intern());
        Object[] objArr2 = new Object[1];
        ThreeDS2ServiceInstance(MotionEvent.axisFromString("") + 1, (char) ((-1) - MotionEvent.axisFromString("")), "麎먎筙\ue4f1ી薓遱家患帢䠉瘹", "쭥裍㯈ᖩ", "굹镏߉\ue0ee", objArr2);
        sb.append(((String) objArr2[0]).intern());
        sb.append(this.get);
        Object[] objArr3 = new Object[1];
        values("㼚㼶ྸⱑ⢹ꁹ珧❲胬콹泄\ue811䁁軃굈ꦫǠ乱\ueddb椉셸෩\u2e5b⪲苇쵈溌\uea62", 1 - (ViewConfiguration.getEdgeSlop() >> 16), objArr3);
        sb.append(((String) objArr3[0]).intern());
        sb.append(this.getWarnings);
        sb.append(CoreConstants.SINGLE_QUOTE_CHAR);
        Object[] objArr4 = new Object[1];
        ThreeDS2ServiceInstance((-1) - TextUtils.indexOf((CharSequence) "", '0', 0, 0), (char) (24007 - (SystemClock.elapsedRealtimeNanos() > 0L ? 1 : (SystemClock.elapsedRealtimeNanos() == 0L ? 0 : -1))), "ᔭㄭ䒡ࣘ辮w浯ၟ悮烑逜떝唿㿹", "\ue60eꉺ웞\u0e5d", "굹镏߉\ue0ee", objArr4);
        sb.append(((String) objArr4[0]).intern());
        sb.append(this.cleanup);
        sb.append(CoreConstants.SINGLE_QUOTE_CHAR);
        Object[] objArr5 = new Object[1];
        values("噠噌莂낟砼ⱃ\uef30矺\ue997䍕\uf017뢺⤍˼㆟藍梟쉇焑㦻ꡍ", -TextUtils.lastIndexOf("", '0'), objArr5);
        sb.append(((String) objArr5[0]).intern());
        sb.append(this.initialize);
        Object[] objArr6 = new Object[1];
        ThreeDS2ServiceInstance(Gravity.getAbsoluteGravity(0, 0), (char) (5132 - (CdmaCellLocation.convertQuartSecToDecDegrees(0) > 0.0d ? 1 : (CdmaCellLocation.convertQuartSecToDecDegrees(0) == 0.0d ? 0 : -1))), "胹⣳⺯航能돼迡獮༈ﮦꙖ镭ǹ뇫", "ၤߺ೦℔", "굹镏߉\ue0ee", objArr6);
        sb.append(((String) objArr6[0]).intern());
        sb.append(this.getSDKInfo);
        sb.append(CoreConstants.SINGLE_QUOTE_CHAR);
        Object[] objArr7 = new Object[1];
        ThreeDS2ServiceInstance(Color.rgb(0, 0, 0) - 681469358, (char) (TextUtils.getTrimmedLength("") + 36449), "⸕⸞⸊拊\ue3a9앱룚뿊餇弛ꍔ휊ᢴ", "刊憚懖얎", "굹镏߉\ue0ee", objArr7);
        sb.append(((String) objArr7[0]).intern());
        sb.append(this.getSDKVersion);
        sb.append(CoreConstants.SINGLE_QUOTE_CHAR);
        Object[] objArr8 = new Object[1];
        values("设讒쪳Ṟꄮ敲䇹껿㑈\u0a78廍憛\uf4d9䯿齖\u2069", (ViewConfiguration.getDoubleTapTimeout() >> 16) + 1, objArr8);
        sb.append(((String) objArr8[0]).intern());
        sb.append(this.ThreeDS2Service$InitializationCallback);
        Object[] objArr9 = new Object[1];
        values("⿃\u2fefꅮ\ue36f\uf81dຯ볈\uf7cc逵憥ꏼ㢨傤\u202b扲礈ᄡ\ue0a7⋨릗퇮", (CdmaCellLocation.convertQuartSecToDecDegrees(0) > 0.0d ? 1 : (CdmaCellLocation.convertQuartSecToDecDegrees(0) == 0.0d ? 0 : -1)) + 1, objArr9);
        sb.append(((String) objArr9[0]).intern());
        sb.append(this.onError);
        Object[] objArr10 = new Object[1];
        ThreeDS2ServiceInstance(TextUtils.getTrimmedLength(""), (char) (1 - (SystemClock.uptimeMillis() > 0L ? 1 : (SystemClock.uptimeMillis() == 0L ? 0 : -1))), "脅듛찞\uda84\ue018錄썵搏\ud8ae損\uefa8\ud82cꡡ\uf843逶㻡ᆊەꈚଜ", "܅ሧ瞥㠷", "굹镏߉\ue0ee", objArr10);
        sb.append(((String) objArr10[0]).intern());
        sb.append(this.onCompleted);
        sb.append(CoreConstants.SINGLE_QUOTE_CHAR);
        Object[] objArr11 = new Object[1];
        ThreeDS2ServiceInstance(1091564172 - (ViewConfiguration.getTouchSlop() >> 8), (char) ((ViewConfiguration.getKeyRepeatTimeout() >> 16) + 36954), "\udc35馇랻뛄夜㱜铓\uf791壪\ue780洭₰\uefe7索濲", "賺\u0ff2婁钐", "굹镏߉\ue0ee", objArr11);
        sb.append(((String) objArr11[0]).intern());
        sb.append(this.ConfigParameters);
        sb.append(CoreConstants.SINGLE_QUOTE_CHAR);
        Object[] objArr12 = new Object[1];
        ThreeDS2ServiceInstance(1732011233 - (ViewConfiguration.getMaximumFlingVelocity() >> 16), (char) ((ViewConfiguration.getJumpTapTimeout() >> 16) + 43768), "來Јひ漦鎲굍\ue5a4ò扄㱡쭈ꆅᕪಱ\uf516╻\uee30憀손", "\ue1c8㱤\uf867궪", "굹镏߉\ue0ee", objArr12);
        sb.append(((String) objArr12[0]).intern());
        sb.append(this.createTransaction);
        sb.append('}');
        String sb2 = sb.toString();
        getParamValue = (removeParam + 59) % 128;
        return sb2;
    }

    @Override // com.netcetera.threeds.sdk.infrastructure.setExtractedText
    public String valueOf() {
        int i = getParamValue + 79;
        removeParam = i % 128;
        if (i % 2 != 0) {
            return this.getWarnings;
        }
        throw null;
    }

    @Override // com.netcetera.threeds.sdk.infrastructure.setExtractedText
    public String values() {
        int i = removeParam + 29;
        getParamValue = i % 128;
        if (i % 2 == 0) {
            return this.getSDKInfo;
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
    private static void ThreeDS2ServiceInstance(int r8, char r9, java.lang.String r10, java.lang.String r11, java.lang.String r12, java.lang.Object[] r13) {
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
            long r6 = com.netcetera.threeds.sdk.infrastructure.setSubtitleTextAppearance.ThreeDS2Service     // Catch: java.lang.Throwable -> L7c
            long r4 = r4 ^ r6
            int r2 = com.netcetera.threeds.sdk.infrastructure.setSubtitleTextAppearance.ThreeDS2ServiceInstance     // Catch: java.lang.Throwable -> L7c
            long r6 = (long) r2     // Catch: java.lang.Throwable -> L7c
            long r4 = r4 ^ r6
            char r2 = com.netcetera.threeds.sdk.infrastructure.setSubtitleTextAppearance.valueOf     // Catch: java.lang.Throwable -> L7c
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
        throw new UnsupportedOperationException("Method not decompiled: com.netcetera.threeds.sdk.infrastructure.setSubtitleTextAppearance.ThreeDS2ServiceInstance(int, char, java.lang.String, java.lang.String, java.lang.String, java.lang.Object[]):void");
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
            long r1 = com.netcetera.threeds.sdk.infrastructure.setSubtitleTextAppearance.values     // Catch: java.lang.Throwable -> L3a
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
            long r6 = com.netcetera.threeds.sdk.infrastructure.setSubtitleTextAppearance.values     // Catch: java.lang.Throwable -> L3a
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
        throw new UnsupportedOperationException("Method not decompiled: com.netcetera.threeds.sdk.infrastructure.setSubtitleTextAppearance.values(java.lang.String, int, java.lang.Object[]):void");
    }
}
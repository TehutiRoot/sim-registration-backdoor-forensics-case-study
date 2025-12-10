package com.netcetera.threeds.sdk.infrastructure;

import android.text.TextUtils;
import android.view.ViewConfiguration;
import ch.qos.logback.core.CoreConstants;
import kotlin.text.Typography;
import kotlinx.serialization.json.internal.AbstractJsonLexerKt;
import org.bouncycastle.pqc.math.linearalgebra.Matrix;

/* JADX WARN: Enum visitor error
jadx.core.utils.exceptions.JadxRuntimeException: Init of enum values uses external variables
	at jadx.core.dex.visitors.EnumVisitor.createEnumFieldByConstructor(EnumVisitor.java:444)
	at jadx.core.dex.visitors.EnumVisitor.processEnumFieldByRegister(EnumVisitor.java:391)
	at jadx.core.dex.visitors.EnumVisitor.extractEnumFieldsFromFilledArray(EnumVisitor.java:320)
	at jadx.core.dex.visitors.EnumVisitor.extractEnumFieldsFromInsn(EnumVisitor.java:258)
	at jadx.core.dex.visitors.EnumVisitor.convertToEnum(EnumVisitor.java:151)
	at jadx.core.dex.visitors.EnumVisitor.visit(EnumVisitor.java:100)
 */
/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* loaded from: classes5.dex */
public final class getLocalizedMessage implements printStackTrace {
    private static final /* synthetic */ getLocalizedMessage[] ConfigParameters;
    public static final getLocalizedMessage ThreeDS2Service;
    public static final getLocalizedMessage ThreeDS2ServiceInstance;
    private static int addParam = 1;
    public static char cleanup;
    public static char[] createTransaction;
    public static final getLocalizedMessage get;
    public static final getLocalizedMessage getSDKInfo;
    public static char getSDKVersion;
    public static final getLocalizedMessage getWarnings;
    public static char initialize;
    private static int onCompleted;
    public static char onError;
    public static final getLocalizedMessage valueOf;
    public static final getLocalizedMessage values;
    private String ThreeDS2Service$InitializationCallback;

    static {
        ThreeDS2ServiceInstance();
        Object[] objArr = new Object[1];
        valueOf("곧쒦ꛥ⬼", TextUtils.lastIndexOf("", '0', 0) + 5, objArr);
        String intern = ((String) objArr[0]).intern();
        Object[] objArr2 = new Object[1];
        get("\u0001\u0001", new int[]{0, 2, 48, 1}, false, objArr2);
        getLocalizedMessage getlocalizedmessage = new getLocalizedMessage(intern, 0, ((String) objArr2[0]).intern());
        values = getlocalizedmessage;
        Object[] objArr3 = new Object[1];
        get("\u0001\u0000\u0001\u0001\u0001\u0001\u0000\u0000\u0000\u0001\u0001\u0000\u0001", new int[]{2, 13, 0, 0}, false, objArr3);
        String intern2 = ((String) objArr3[0]).intern();
        Object[] objArr4 = new Object[1];
        valueOf("쬧ە", (ViewConfiguration.getEdgeSlop() >> 16) + 2, objArr4);
        getLocalizedMessage getlocalizedmessage2 = new getLocalizedMessage(intern2, 1, ((String) objArr4[0]).intern());
        get = getlocalizedmessage2;
        Object[] objArr5 = new Object[1];
        valueOf("\uf723䠌\ud81a糤唄籧Ꝙ讒㒽閅鰹뾧", 12 - (ViewConfiguration.getPressedStateDuration() >> 16), objArr5);
        String intern3 = ((String) objArr5[0]).intern();
        Object[] objArr6 = new Object[1];
        get("\u0000\u0001", new int[]{15, 2, 0, 0}, false, objArr6);
        getLocalizedMessage getlocalizedmessage3 = new getLocalizedMessage(intern3, 2, ((String) objArr6[0]).intern());
        ThreeDS2Service = getlocalizedmessage3;
        Object[] objArr7 = new Object[1];
        get("\u0000\u0000\u0001", new int[]{17, 3, 45, 2}, true, objArr7);
        String intern4 = ((String) objArr7[0]).intern();
        Object[] objArr8 = new Object[1];
        get("\u0001\u0000", new int[]{20, 2, 141, 2}, true, objArr8);
        getLocalizedMessage getlocalizedmessage4 = new getLocalizedMessage(intern4, 3, ((String) objArr8[0]).intern());
        valueOf = getlocalizedmessage4;
        Object[] objArr9 = new Object[1];
        valueOf("긦क़見䊩", 4 - TextUtils.getOffsetBefore("", 0), objArr9);
        String intern5 = ((String) objArr9[0]).intern();
        Object[] objArr10 = new Object[1];
        valueOf("宐倨", TextUtils.getOffsetBefore("", 0) + 2, objArr10);
        getLocalizedMessage getlocalizedmessage5 = new getLocalizedMessage(intern5, 4, ((String) objArr10[0]).intern());
        ThreeDS2ServiceInstance = getlocalizedmessage5;
        Object[] objArr11 = new Object[1];
        get("\u0001\u0000\u0000\u0001\u0000\u0000\u0001\u0001", new int[]{22, 8, 0, 4}, false, objArr11);
        String intern6 = ((String) objArr11[0]).intern();
        Object[] objArr12 = new Object[1];
        valueOf("橹ᮎ", (ViewConfiguration.getFadingEdgeLength() >> 16) + 2, objArr12);
        getLocalizedMessage getlocalizedmessage6 = new getLocalizedMessage(intern6, 5, ((String) objArr12[0]).intern());
        getWarnings = getlocalizedmessage6;
        Object[] objArr13 = new Object[1];
        get("\u0001\u0000\u0001\u0000", new int[]{30, 4, 0, 1}, true, objArr13);
        String intern7 = ((String) objArr13[0]).intern();
        Object[] objArr14 = new Object[1];
        get("\u0000\u0001", new int[]{34, 2, 194, 0}, false, objArr14);
        getLocalizedMessage getlocalizedmessage7 = new getLocalizedMessage(intern7, 6, ((String) objArr14[0]).intern());
        getSDKInfo = getlocalizedmessage7;
        ConfigParameters = new getLocalizedMessage[]{getlocalizedmessage, getlocalizedmessage2, getlocalizedmessage3, getlocalizedmessage4, getlocalizedmessage5, getlocalizedmessage6, getlocalizedmessage7};
        int i = addParam + 111;
        onCompleted = i % 128;
        if (i % 2 != 0) {
            int i2 = 68 / 0;
        }
    }

    private getLocalizedMessage(String str, int i, String str2) {
        this.ThreeDS2Service$InitializationCallback = str2;
    }

    public static void ThreeDS2ServiceInstance() {
        getSDKVersion = (char) 57725;
        initialize = (char) 11989;
        onError = (char) 20209;
        cleanup = (char) 8156;
        createTransaction = new char[]{'0', '`', CoreConstants.RIGHT_PARENTHESIS_CHAR, 'N', 'K', 'J', 'I', 'H', Matrix.MATRIX_TYPE_RANDOM_REGULAR, 'Y', Matrix.MATRIX_TYPE_RANDOM_LT, 'H', 'H', 'D', 'K', 24, '1', Typography.greater, '|', AbstractJsonLexerKt.UNICODE_ESC, '`', 191, '/', 'W', 'O', 'H', 'E', 'N', 'P', Matrix.MATRIX_TYPE_RANDOM_LT, '$', Matrix.MATRIX_TYPE_RANDOM_LT, 'J', 'J', 'y', 245};
    }

    /* JADX WARN: Code restructure failed: missing block: B:0:?, code lost:
        r12 = r12;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    private static void get(java.lang.String r12, int[] r13, boolean r14, java.lang.Object[] r15) {
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
            char[] r8 = com.netcetera.threeds.sdk.infrastructure.getLocalizedMessage.createTransaction     // Catch: java.lang.Throwable -> L38
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
        throw new UnsupportedOperationException("Method not decompiled: com.netcetera.threeds.sdk.infrastructure.getLocalizedMessage.get(java.lang.String, int[], boolean, java.lang.Object[]):void");
    }

    public static getLocalizedMessage valueOf(String str) {
        onCompleted = (addParam + 13) % 128;
        getLocalizedMessage getlocalizedmessage = (getLocalizedMessage) Enum.valueOf(getLocalizedMessage.class, str);
        int i = onCompleted + 107;
        addParam = i % 128;
        if (i % 2 != 0) {
            return getlocalizedmessage;
        }
        throw null;
    }

    public static getLocalizedMessage[] values() {
        addParam = (onCompleted + 121) % 128;
        getLocalizedMessage[] getlocalizedmessageArr = (getLocalizedMessage[]) ConfigParameters.clone();
        int i = addParam + 33;
        onCompleted = i % 128;
        if (i % 2 == 0) {
            return getlocalizedmessageArr;
        }
        throw null;
    }

    @Override // com.netcetera.threeds.sdk.infrastructure.printStackTrace
    public String ThreeDS2Service() {
        int i = addParam;
        String str = this.ThreeDS2Service$InitializationCallback;
        onCompleted = (i + 103) % 128;
        return str;
    }

    /* JADX WARN: Code restructure failed: missing block: B:0:?, code lost:
        r12 = r12;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    private static void valueOf(java.lang.String r12, int r13, java.lang.Object[] r14) {
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
            char r11 = com.netcetera.threeds.sdk.infrastructure.getLocalizedMessage.cleanup     // Catch: java.lang.Throwable -> L5b
            int r10 = r10 + r11
            r9 = r9 ^ r10
            int r10 = r8 >>> 5
            char r11 = com.netcetera.threeds.sdk.infrastructure.getLocalizedMessage.onError     // Catch: java.lang.Throwable -> L5b
            int r10 = r10 + r11
            r9 = r9 ^ r10
            int r7 = r7 - r9
            char r7 = (char) r7     // Catch: java.lang.Throwable -> L5b
            r3[r5] = r7     // Catch: java.lang.Throwable -> L5b
            int r9 = r7 + r4
            int r10 = r7 << 4
            char r11 = com.netcetera.threeds.sdk.infrastructure.getLocalizedMessage.getSDKVersion     // Catch: java.lang.Throwable -> L5b
            int r10 = r10 + r11
            r9 = r9 ^ r10
            int r7 = r7 >>> 5
            char r10 = com.netcetera.threeds.sdk.infrastructure.getLocalizedMessage.initialize     // Catch: java.lang.Throwable -> L5b
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
        throw new UnsupportedOperationException("Method not decompiled: com.netcetera.threeds.sdk.infrastructure.getLocalizedMessage.valueOf(java.lang.String, int, java.lang.Object[]):void");
    }
}

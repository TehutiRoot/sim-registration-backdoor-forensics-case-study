package com.netcetera.threeds.sdk.infrastructure;

import android.graphics.Color;
import android.graphics.ImageFormat;
import android.graphics.drawable.Drawable;
import android.os.Process;
import android.os.SystemClock;
import android.text.AndroidCharacter;
import android.text.TextUtils;
import android.util.TypedValue;
import android.view.Gravity;
import android.view.KeyEvent;
import android.view.MotionEvent;
import android.view.View;
import android.view.ViewConfiguration;
import android.widget.ExpandableListView;
import ch.qos.logback.core.net.SyslogConstants;
import kotlinx.serialization.json.internal.AbstractJsonLexerKt;
import org.bouncycastle.pqc.math.linearalgebra.Matrix;

/* loaded from: classes5.dex */
public final class wait {
    public static final String CertificateInfo;
    public static final String CertificateInfo$CertificateType;
    public static final String ConfigParameters;
    public static final String ConfigurationBuilder;
    public static final String InvalidInputException;
    public static final String SDKAlreadyInitializedException;
    public static int[] SDKInfo = null;
    public static final String SDKNotInitializedException;
    public static final String SDKRuntimeException;
    public static final String SchemeConfiguration;
    public static final String SchemeConfiguration$Builder;
    public static final String ThreeDS2Service;
    public static final String ThreeDS2Service$InitializationCallback;
    public static final String ThreeDS2ServiceInstance;
    public static final String addParam;
    public static final String amexConfiguration;
    public static final String apiKey;
    public static final String build;
    public static final String cbConfiguration;
    public static final String cleanup;
    public static final String configureScheme;
    public static final String createTransaction;
    public static final String dinersSchemeConfiguration;
    public static final String eftposConfiguration;
    public static final String encryptionPublicKey;
    public static final String encryptionPublicKeyFromAssetCertificate;
    public static final String get;
    public static final String getCertPrefix;
    public static final String getErrorCode;
    public static long getExpiryDate = 0;
    public static final String getName;
    public static final String getParamValue;
    private static int getRootCertificates = 0;
    public static final String getSDKInfo;
    public static String getSDKVersion = null;
    private static int getSchemeConfigurations = 1;
    public static final String getSchemeEncryptionPublicKey;
    public static final String getSchemeEncryptionPublicKeyId;
    public static final String getSchemeId;
    public static final String getSchemeLogo;
    public static final String getSchemeLogoDark;
    public static final String getSchemeName;
    public static final String getSchemePublicRootKeys;
    public static final String getType;
    public static final String getWarnings;
    public static final String ids;
    public static final String initialize;
    public static final String jcbConfiguration;
    public static final String logo;
    public static final String logoDark;
    public static final String mastercardSchemeConfiguration;
    public static final String newSchemeConfiguration;
    public static final String onCompleted;
    public static final String onError;
    public static final String removeParam;
    public static final String restrictedParameters;
    public static final String rootPublicKey;
    public static final String rootPublicKeyFromAssetCertificate;
    public static final String toString;
    public static final String unionSchemeConfiguration;
    public static final String valueOf;
    public static final String values;
    public static final String visaSchemeConfiguration;

    /* loaded from: classes5.dex */
    public static final class values {
        private static int ConfigParameters = 0;
        private static int ConfigurationBuilder = 1;
        public static final String ThreeDS2Service;
        public static int ThreeDS2Service$InitializationCallback;
        public static final String ThreeDS2ServiceInstance;
        public static String cleanup;
        public static char createTransaction;
        public static final String get;
        public static final String getSDKInfo;
        public static final String getSDKVersion;
        public static final String getWarnings;
        public static final String initialize;
        public static long onCompleted;
        public static char[] onError;
        public static final String valueOf;
        public static final String values;

        static {
            valueOf();
            Object[] objArr = new Object[1];
            get("\u0000\u0001\u0001\u0001\u0000\u0001\u0001\u0000\u0000\u0000\u0001\u0001\u0001\u0000\u0001", new int[]{0, 15, 0, 2}, true, objArr);
            getSDKVersion = ((String) objArr[0]).intern();
            Object[] objArr2 = new Object[1];
            get(null, new int[]{15, 7, SyslogConstants.LOG_LOCAL3, 2}, true, objArr2);
            getWarnings = ((String) objArr2[0]).intern();
            Object[] objArr3 = new Object[1];
            get("\u0001\u0000\u0001\u0001\u0001\u0000\u0001\u0001\u0001\u0000\u0001\u0001\u0001\u0001\u0000\u0001\u0000\u0000\u0001\u0000\u0000\u0000\u0000\u0000\u0001", new int[]{22, 25, 0, 1}, false, objArr3);
            getSDKInfo = ((String) objArr3[0]).intern();
            Object[] objArr4 = new Object[1];
            get("\u0001\u0000\u0000\u0001\u0001\u0001\u0000\u0001\u0000\u0001\u0001", new int[]{47, 11, 0, 1}, true, objArr4);
            initialize = ((String) objArr4[0]).intern();
            Object[] objArr5 = new Object[1];
            ThreeDS2Service(17385 - AndroidCharacter.getMirror('0'), (char) ExpandableListView.getPackedPositionGroup(0L), "ⲓ晼ꎪﯾ븊瘫\u2e65趨\u0bde", "릱ὃ멖㥴", "\u0000\u0000\u0000\u0000", objArr5);
            values = ((String) objArr5[0]).intern();
            Object[] objArr6 = new Object[1];
            ThreeDS2Service(ViewConfiguration.getMaximumDrawingCacheSize() >> 24, (char) Drawable.resolveOpacity(0, 0), "紤琌É릃ᯧ逎睃䀕峲\udbf6䤭暋", "눶◓鴞ꝲ", "\u0000\u0000\u0000\u0000", objArr6);
            ThreeDS2ServiceInstance = ((String) objArr6[0]).intern();
            Object[] objArr7 = new Object[1];
            ThreeDS2Service((ExpandableListView.getPackedPositionForGroup(0) > 0L ? 1 : (ExpandableListView.getPackedPositionForGroup(0) == 0L ? 0 : -1)), (char) (TextUtils.indexOf((CharSequence) "", '0', 0) + 1), "璉ꝙ诮\ue753螦凉狂პ✯\uaac4舘脟", "\udbb8ᑈ\ud8e8砲", "\u0000\u0000\u0000\u0000", objArr7);
            ThreeDS2Service = ((String) objArr7[0]).intern();
            Object[] objArr8 = new Object[1];
            ThreeDS2Service(Color.green(0) - 1221961070, (char) TextUtils.getCapsMode("", 0, 0), "\ueaa2\ue936綮묆꤉䔴뷱\uf15d킟㔄嶞", "鈈⩚螷鸗", "\u0000\u0000\u0000\u0000", objArr8);
            get = ((String) objArr8[0]).intern();
            Object[] objArr9 = new Object[1];
            get("\u0001\u0001\u0001\u0001\u0000\u0001\u0001\u0001\u0000\u0001\u0001\u0001\u0001", new int[]{58, 13, 10, 0}, false, objArr9);
            valueOf = ((String) objArr9[0]).intern();
            Object[] objArr10 = new Object[1];
            get("\u0001\u0001\u0000\u0001\u0001\u0001\u0000", new int[]{71, 7, 194, 2}, false, objArr10);
            cleanup = ((String) objArr10[0]).intern();
            ConfigurationBuilder = (ConfigParameters + 87) % 128;
        }

        /* JADX WARN: Code restructure failed: missing block: B:0:?, code lost:
            r12 = r12;
         */
        /*
            Code decompiled incorrectly, please refer to instructions dump.
            To view partially-correct code enable 'Show inconsistent code' option in preferences
        */
        private static void ThreeDS2Service(int r8, char r9, java.lang.String r10, java.lang.String r11, java.lang.String r12, java.lang.Object[] r13) {
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
                long r6 = com.netcetera.threeds.sdk.infrastructure.wait.values.onCompleted     // Catch: java.lang.Throwable -> L7c
                long r4 = r4 ^ r6
                int r2 = com.netcetera.threeds.sdk.infrastructure.wait.values.ThreeDS2Service$InitializationCallback     // Catch: java.lang.Throwable -> L7c
                long r6 = (long) r2     // Catch: java.lang.Throwable -> L7c
                long r4 = r4 ^ r6
                char r2 = com.netcetera.threeds.sdk.infrastructure.wait.values.createTransaction     // Catch: java.lang.Throwable -> L7c
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
            throw new UnsupportedOperationException("Method not decompiled: com.netcetera.threeds.sdk.infrastructure.wait.values.ThreeDS2Service(int, char, java.lang.String, java.lang.String, java.lang.String, java.lang.Object[]):void");
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
                char[] r8 = com.netcetera.threeds.sdk.infrastructure.wait.values.onError     // Catch: java.lang.Throwable -> L38
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
            throw new UnsupportedOperationException("Method not decompiled: com.netcetera.threeds.sdk.infrastructure.wait.values.get(java.lang.String, int[], boolean, java.lang.Object[]):void");
        }

        public static void valueOf() {
            onError = new char[]{'4', 'e', 'g', 'h', 'd', 'h', 'g', Matrix.MATRIX_TYPE_RANDOM_REGULAR, 'T', 'f', 'j', 'i', 'h', 'l', 'f', 252, 249, 249, 268, 249, 220, 252, '3', 'e', 'e', 'd', 'f', 'l', 'h', 'i', 'j', 'f', 'T', Matrix.MATRIX_TYPE_RANDOM_REGULAR, 'j', 'j', 'S', 'Y', 'q', 's', AbstractJsonLexerKt.UNICODE_ESC, 'c', 'W', 'j', 'o', 'j', 'k', '7', 'j', 'm', 'q', 'k', 'n', 'q', 'n', 'Y', Matrix.MATRIX_TYPE_RANDOM_REGULAR, 'h', '6', 'o', 'n', 'p', 'v', 'r', 's', 't', 'p', '^', '\\', 't', 't', 152, 304, 308, 303, 301, 308, 304};
            ThreeDS2Service$InitializationCallback = 0;
            createTransaction = (char) 63271;
            onCompleted = 0L;
        }
    }

    static {
        get();
        Object[] objArr = new Object[1];
        ThreeDS2Service("뷱蜼졦ම囚鯯\udd05♗殺곢\uf1f2㬵", ((byte) KeyEvent.getModifierMetaStateMask()) + 15054, objArr);
        getType = ((String) objArr[0]).intern();
        Object[] objArr2 = new Object[1];
        ThreeDS2Service("뷽ꇿ藭\ue9e9췖㇖ᗆ秆嶳䆎ꖠ覙\uedb1톄㖄\u197c", (ViewConfiguration.getScrollFriction() > 0.0f ? 1 : (ViewConfiguration.getScrollFriction() == 0.0f ? 0 : -1)) + 7176, objArr2);
        getCertPrefix = ((String) objArr2[0]).intern();
        Object[] objArr3 = new Object[1];
        ThreeDS2Service("뷺缄㠖\uf50a똁猀Ⱖ\ue90eꨈ服\u2001\udd05鸍嬩ᐍ턛鈏伴ࠞ씇蘀䌌", 49919 - (ViewConfiguration.getScrollDefaultDelay() >> 16), objArr3);
        CertificateInfo$CertificateType = ((String) objArr3[0]).intern();
        Object[] objArr4 = new Object[1];
        ThreeDS2Service("뷪\uf2c1⎱偪腞㘳曹韖쒂畏\uaa3d\udb05\u0be3뢒\ue986ṉ似ﰚ", MotionEvent.axisFromString("") + 20270, objArr4);
        getName = ((String) objArr4[0]).intern();
        Object[] objArr5 = new Object[1];
        values(new int[]{1765426515, 1732075708, 123064142, 2024665132, 2063938888, 739363139, 1407189963, 627400420, 1030105731, 877323446, -1172688485, -1652294175}, (ViewConfiguration.getMaximumDrawingCacheSize() >> 24) + 21, objArr5);
        getErrorCode = ((String) objArr5[0]).intern();
        Object[] objArr6 = new Object[1];
        values(new int[]{693725436, -620221807, 187734397, 1426863340, 1875949288, 2115278667, 1030105731, 877323446, -1172688485, -1652294175}, 17 - (ViewConfiguration.getKeyRepeatDelay() >> 16), objArr6);
        CertificateInfo = ((String) objArr6[0]).intern();
        Object[] objArr7 = new Object[1];
        ThreeDS2Service("뷪怖ط\u244c쩮\ue878躤겠動烨᛬㔚\udb25屢齵뵹掊", 56807 - TextUtils.getOffsetBefore("", 0), objArr7);
        SDKNotInitializedException = ((String) objArr7[0]).intern();
        Object[] objArr8 = new Object[1];
        values(new int[]{-940309001, 2097197732, -172587882, -1234611961, -1646847973, -553409265, 771568361, -504988351, 1039170934, -1373619440}, (TypedValue.complexToFraction(0, 0.0f, 0.0f) > 0.0f ? 1 : (TypedValue.complexToFraction(0, 0.0f, 0.0f) == 0.0f ? 0 : -1)) + 17, objArr8);
        SDKRuntimeException = ((String) objArr8[0]).intern();
        Object[] objArr9 = new Object[1];
        ThreeDS2Service("뷷좇圖\udd94栁\uf6a2紺讫ᙏ鳟⭍뇦㱆䫴텾専\uea82", 30072 - (SystemClock.elapsedRealtime() > 0L ? 1 : (SystemClock.elapsedRealtime() == 0L ? 0 : -1)), objArr9);
        toString = ((String) objArr9[0]).intern();
        Object[] objArr10 = new Object[1];
        ThreeDS2Service("뷪\ue30b\u0016ꄌ옏末萣┧䨓\ueb0aࠉꤤ츱漳谧ⴿ刏\uf323ဤ넌혈眓", 24317 - (ViewConfiguration.getKeyRepeatDelay() >> 16), objArr10);
        rootPublicKeyFromAssetCertificate = ((String) objArr10[0]).intern();
        Object[] objArr11 = new Object[1];
        ThreeDS2Service("뷩ݗ좥鈴坴ᣝ\ue237Ɬ棳㉏\uf7a0", 47776 - TextUtils.indexOf((CharSequence) "", '0'), objArr11);
        rootPublicKey = ((String) objArr11[0]).intern();
        Object[] objArr12 = new Object[1];
        values(new int[]{1501515235, 846919821, 1022702244, -124213274, 797639830, -1858163877}, 11 - TextUtils.indexOf((CharSequence) "", '0', 0, 0), objArr12);
        SDKAlreadyInitializedException = ((String) objArr12[0]).intern();
        Object[] objArr13 = new Object[1];
        values(new int[]{-556671413, -800824057, -329314336, 1896206542, 1860444484, 104017841, -1690890957, 896117301, -1844326975, -1528165622, -1477290642, -320922909}, (ViewConfiguration.getFadingEdgeLength() >> 16) + 21, objArr13);
        encryptionPublicKeyFromAssetCertificate = ((String) objArr13[0]).intern();
        Object[] objArr14 = new Object[1];
        values(new int[]{-556671413, -800824057, -329314336, 1896206542, 1860444484, 104017841, 1470308270, -2066424640, 1632198091, 789564139}, (ViewConfiguration.getMinimumFlingVelocity() >> 16) + 20, objArr14);
        InvalidInputException = ((String) objArr14[0]).intern();
        Object[] objArr15 = new Object[1];
        ThreeDS2Service("뷭䅌䒲䠆佫助嘵啺壒尩捽曝樾榌泟瀶瞚章繏綕Þь\u0ba6\u0efaቚ", Color.alpha(0) + 64679, objArr15);
        logoDark = ((String) objArr15[0]).intern();
        Object[] objArr16 = new Object[1];
        ThreeDS2Service("뷬緢㷟ﶰ붔綇㵁ﵟ봰紐㴖ﳠ볓粯㲩ﲆ뱠类㰽ﰧ및翿", Color.red(0) + 49177, objArr16);
        ids = ((String) objArr16[0]).intern();
        Object[] objArr17 = new Object[1];
        ThreeDS2Service("뷮愲ѩ⭮캃\ueda2郁", ExpandableListView.getPackedPositionGroup(0L) + 56543, objArr17);
        SchemeConfiguration$Builder = ((String) objArr17[0]).intern();
        Object[] objArr18 = new Object[1];
        ThreeDS2Service("뷱茖쀲Ũ䙭蝳쒀֦䫈说죽฿伫豇쵙ቻ", Gravity.getAbsoluteGravity(0, 0) + 16103, objArr18);
        logo = ((String) objArr18[0]).intern();
        Object[] objArr19 = new Object[1];
        values(new int[]{1079508865, 615664340, 1603163644, 1630161776, 110289546, -1646793306}, (TypedValue.complexToFloat(0) > 0.0f ? 1 : (TypedValue.complexToFloat(0) == 0.0f ? 0 : -1)) + 12, objArr19);
        encryptionPublicKey = ((String) objArr19[0]).intern();
        Object[] objArr20 = new Object[1];
        values(new int[]{1079508865, 615664340, 2020681951, -2097624737, 1715236935, -407241343}, 11 - TextUtils.indexOf("", "", 0, 0), objArr20);
        getSchemeLogo = ((String) objArr20[0]).intern();
        Object[] objArr21 = new Object[1];
        ThreeDS2Service("뷱쇀䖞쥌䴪턛哭\ud89b屚", 31841 - AndroidCharacter.getMirror('0'), objArr21);
        getSchemePublicRootKeys = ((String) objArr21[0]).intern();
        Object[] objArr22 = new Object[1];
        values(new int[]{-1107224713, 1902860264, -352412126, -958926355, 1010672555, 546874050}, (ViewConfiguration.getKeyRepeatDelay() >> 16) + 11, objArr22);
        getSchemeLogoDark = ((String) objArr22[0]).intern();
        Object[] objArr23 = new Object[1];
        ThreeDS2Service("뷻䒩佰嘒壌捱樍泙瞀縶Üஞቒᓩ", 63871 - AndroidCharacter.getMirror('0'), objArr23);
        getSchemeEncryptionPublicKey = ((String) objArr23[0]).intern();
        Object[] objArr24 = new Object[1];
        ThreeDS2Service("뷻蘱쩀\u0e7a劬雉\udaddἑ捀Ꝿ\uebb4⿂珨됐\uf830", (SystemClock.elapsedRealtime() > 0L ? 1 : (SystemClock.elapsedRealtime() == 0L ? 0 : -1)) + 15318, objArr24);
        getSchemeEncryptionPublicKeyId = ((String) objArr24[0]).intern();
        Object[] objArr25 = new Object[1];
        values(new int[]{-940309001, 2097197732, -172587882, -1234611961, -1975687110, 1619287779, 718298349, -640320225, -2060771442, 677241911}, 18 - Process.getGidForName(""), objArr25);
        newSchemeConfiguration = ((String) objArr25[0]).intern();
        Object[] objArr26 = new Object[1];
        ThreeDS2Service("뷽윛䠥촵噆\udb5a屾\ue182檓\uef82炲\uf5d7续菃ԍ踅ጺ鑪ᥚꉭ❳ꢌⶡ뚡㯉볉", 31469 - Gravity.getAbsoluteGravity(0, 0), objArr26);
        getSchemeName = ((String) objArr26[0]).intern();
        Object[] objArr27 = new Object[1];
        values(new int[]{-940309001, 2097197732, -172587882, -1234611961, 1230652931, 854365858, 1030105731, 877323446, -1172688485, -1652294175}, 17 - (KeyEvent.getMaxKeyCode() >> 16), objArr27);
        cbConfiguration = ((String) objArr27[0]).intern();
        Object[] objArr28 = new Object[1];
        values(new int[]{-940309001, 2097197732, -172587882, -1234611961, 1230652931, 854365858, 119935453, -699198322, 1203321553, 1169506464}, ImageFormat.getBitsPerPixel(0) + 19, objArr28);
        eftposConfiguration = ((String) objArr28[0]).intern();
        Object[] objArr29 = new Object[1];
        values(new int[]{-940309001, 2097197732, -172587882, -1234611961, 1230652931, 854365858, 1372370317, -1443393138, 1527681516, -1824727736}, 19 - (TypedValue.complexToFraction(0, 0.0f, 0.0f) > 0.0f ? 1 : (TypedValue.complexToFraction(0, 0.0f, 0.0f) == 0.0f ? 0 : -1)), objArr29);
        getSchemeId = ((String) objArr29[0]).intern();
        Object[] objArr30 = new Object[1];
        ThreeDS2Service("뷽앗䲽퐑彶\ue6de渶\uf19e磳聲\u0bba錁᩠鷊┒겞㟶뽻욻丂", 30881 - (ViewConfiguration.getKeyRepeatDelay() >> 16), objArr30);
        unionSchemeConfiguration = ((String) objArr30[0]).intern();
        Object[] objArr31 = new Object[1];
        values(new int[]{-940309001, 2097197732, -172587882, -1234611961, 702718636, -2027617146, -1261905857, -81874337, 477379054, -1110887196}, ExpandableListView.getPackedPositionGroup(0L) + 17, objArr31);
        jcbConfiguration = ((String) objArr31[0]).intern();
        Object[] objArr32 = new Object[1];
        ThreeDS2Service("뷽蕑첱ᐇ彮ꚸ\uee1aㅨ磃䀀譼틗ᨃ嶋ꓚ\uec38", 14503 - View.getDefaultSize(0, 0), objArr32);
        visaSchemeConfiguration = ((String) objArr32[0]).intern();
        Object[] objArr33 = new Object[1];
        ThreeDS2Service("뷿홢櫓６ᎋ\ua7d1㡝䲷\ue103", (ViewConfiguration.getScrollBarFadeDuration() >> 16) + 27551, objArr33);
        amexConfiguration = ((String) objArr33[0]).intern();
        Object[] objArr34 = new Object[1];
        values(new int[]{-1826046720, -986796534, -2078144324, 583298075, -1084918322, -1317065456, 1263977596, 181028666}, (ViewConfiguration.getDoubleTapTimeout() >> 16) + 14, objArr34);
        dinersSchemeConfiguration = ((String) objArr34[0]).intern();
        Object[] objArr35 = new Object[1];
        ThreeDS2Service("뷿鈚\ue223㉣ɖ剐ꊸ", 12263 - (Process.myTid() >> 22), objArr35);
        build = ((String) objArr35[0]).intern();
        Object[] objArr36 = new Object[1];
        values(new int[]{-475463798, -624981621, 1033889968, -1436804858, 233227114, 1154878032}, 11 - View.MeasureSpec.getSize(0), objArr36);
        restrictedParameters = ((String) objArr36[0]).intern();
        Object[] objArr37 = new Object[1];
        ThreeDS2Service("뷭⪕錫箐\ue04d䣀ㅪ駣ڃ\uef0b垛㰯꓅ർ", (Process.myPid() >> 22) + 38767, objArr37);
        mastercardSchemeConfiguration = ((String) objArr37[0]).intern();
        Object[] objArr38 = new Object[1];
        values(new int[]{1937528555, 640556392, -1155987804, -690057751, 318772358, 274567143, -1827613407, -246958230}, 14 - Color.blue(0), objArr38);
        configureScheme = ((String) objArr38[0]).intern();
        Object[] objArr39 = new Object[1];
        ThreeDS2Service("뷽쑧仝텁家\ue22e撖\uef0e煳\ufbc4ɛ蓈༢醯᠕ꊕⓧ꽐㇂렔스䔟", Gravity.getAbsoluteGravity(0, 0) + 31121, objArr39);
        SchemeConfiguration = ((String) objArr39[0]).intern();
        Object[] objArr40 = new Object[1];
        ThreeDS2Service("뷳磲㟿\uf2f6\ua9db擔⏍\udee4閮傻ྡ쪓膁벂箏㙷", (ExpandableListView.getPackedPositionForChild(0, 0) > 0L ? 1 : (ExpandableListView.getPackedPositionForChild(0, 0) == 0L ? 0 : -1)) + 50442, objArr40);
        getParamValue = ((String) objArr40[0]).intern();
        Object[] objArr41 = new Object[1];
        values(new int[]{264504495, 1897530011, -1526734219, 1579550642, -2047155636, -908318979, -2118809217, -1550970296}, 16 - KeyEvent.keyCodeFromString(""), objArr41);
        ConfigurationBuilder = ((String) objArr41[0]).intern();
        Object[] objArr42 = new Object[1];
        ThreeDS2Service("뷻Ճ첲韼彐⚱\ue9e1넣碇쏐謤", View.getDefaultSize(0, 0) + 47279, objArr42);
        apiKey = ((String) objArr42[0]).intern();
        Object[] objArr43 = new Object[1];
        ThreeDS2Service("뷻陏\ueaaa㼘፠柵렩貘\ue0e5㕗\u09a9巯뙎誰\udf1b㍽", 11170 - (ExpandableListView.getPackedPositionForChild(0, 0) > 0L ? 1 : (ExpandableListView.getPackedPositionForChild(0, 0) == 0L ? 0 : -1)), objArr43);
        addParam = ((String) objArr43[0]).intern();
        Object[] objArr44 = new Object[1];
        ThreeDS2Service("뷻\ue217Țꈀ숀戺舓∮䈶\ue222Ⱦꈲ숴払", Color.alpha(0) + 24571, objArr44);
        removeParam = ((String) objArr44[0]).intern();
        Object[] objArr45 = new Object[1];
        values(new int[]{264504495, 1897530011, -107526306, 180646100, 670517801, -2105380853}, 9 - Color.alpha(0), objArr45);
        ThreeDS2Service$InitializationCallback = ((String) objArr45[0]).intern();
        Object[] objArr46 = new Object[1];
        values(new int[]{1755390457, 1527573737, 363316311, 86982454, 1875292117, 1686738296}, 8 - TextUtils.lastIndexOf("", '0'), objArr46);
        ConfigParameters = ((String) objArr46[0]).intern();
        Object[] objArr47 = new Object[1];
        ThreeDS2Service("뷽풇漝膡ᠶ닎앖忮\uf673ऩꎛ㨀䲼\ue757秂選", 26993 - (ViewConfiguration.getFadingEdgeLength() >> 16), objArr47);
        onError = ((String) objArr47[0]).intern();
        Object[] objArr48 = new Object[1];
        ThreeDS2Service("뷽\udf1f砭镉㙖卶\uec86দꪳ쟧惐\ufdd0Ἶ렏핁癍鍯Ⲣ䦒\ueaa1ߘꃺ", 25321 - Color.green(0), objArr48);
        onCompleted = ((String) objArr48[0]).intern();
        Object[] objArr49 = new Object[1];
        values(new int[]{-940309001, 2097197732, -172587882, -1234611961, -669561039, 1612808723, -887745957, 2016965236, 75702265, -700995005, -1955709755, -602398557}, 21 - TextUtils.getOffsetBefore("", 0), objArr49);
        createTransaction = ((String) objArr49[0]).intern();
        Object[] objArr50 = new Object[1];
        ThreeDS2Service("뷽㓧꿝⛁馶Ⴎ讖ʎ\uf573汃\ue755幑턳䠆쌞먕⳼Ᶎ", (ViewConfiguration.getTapTimeout() >> 16) + 35089, objArr50);
        getWarnings = ((String) objArr50[0]).intern();
        Object[] objArr51 = new Object[1];
        values(new int[]{1400278289, -1527733208, -1285105430, -74054964, 377513758, -1617131864}, 11 - (KeyEvent.getMaxKeyCode() >> 16), objArr51);
        cleanup = ((String) objArr51[0]).intern();
        Object[] objArr52 = new Object[1];
        ThreeDS2Service("뷬ᖆ\ued17䒌ᰄ\uf78b伳⚝︗冗⤐肤堬㎠謭", View.MeasureSpec.getMode(0) + 43133, objArr52);
        getSDKInfo = ((String) objArr52[0]).intern();
        Object[] objArr53 = new Object[1];
        values(new int[]{-940309001, 2097197732, -172587882, -1234611961, 314387990, -1669101572, -760921461, -1119771579}, 15 - TextUtils.getCapsMode("", 0, 0), objArr53);
        initialize = ((String) objArr53[0]).intern();
        Object[] objArr54 = new Object[1];
        values(new int[]{1101486973, 971657698, 1102538376, -802717376, -865540509, -447233198}, 11 - ExpandableListView.getPackedPositionGroup(0L), objArr54);
        ThreeDS2ServiceInstance = ((String) objArr54[0]).intern();
        Object[] objArr55 = new Object[1];
        values(new int[]{1101486973, 971657698, 1229144788, -258230895, -2019725206, -1015956320, -1628799199, 1785829650}, 14 - Color.blue(0), objArr55);
        get = ((String) objArr55[0]).intern();
        Object[] objArr56 = new Object[1];
        ThreeDS2Service("뷭槵ᗫ쇧\uedd0馴䖪熄ᶯ쥝", 54288 - (Process.getElapsedCpuTime() > 0L ? 1 : (Process.getElapsedCpuTime() == 0L ? 0 : -1)), objArr56);
        values = ((String) objArr56[0]).intern();
        Object[] objArr57 = new Object[1];
        values(new int[]{-528472534, -855438714, 923671526, 1143132991, 1358492133, -830940087}, View.getDefaultSize(0, 0) + 10, objArr57);
        valueOf = ((String) objArr57[0]).intern();
        Object[] objArr58 = new Object[1];
        ThreeDS2Service("뷪鄽\ue47a㮚໗戭넏葀\udba3⻏Ȇ兂ꑨﮅ컶√煀䒖鮑\ueecb", TextUtils.getTrimmedLength("") + 11467, objArr58);
        ThreeDS2Service = ((String) objArr58[0]).intern();
        Object[] objArr59 = new Object[1];
        values(new int[]{-298617265, 1246966187, -1469520946, -1588222631, 988885717, -1180787919, -186460307, 1188859167, 1379611409, 1392683017, 2142881125, 257997096}, 21 - ExpandableListView.getPackedPositionGroup(0L), objArr59);
        getSDKVersion = ((String) objArr59[0]).intern();
        getSchemeConfigurations = (getRootCertificates + 15) % 128;
    }

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
            long r5 = com.netcetera.threeds.sdk.infrastructure.wait.getExpiryDate     // Catch: java.lang.Throwable -> L2e
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
        throw new UnsupportedOperationException("Method not decompiled: com.netcetera.threeds.sdk.infrastructure.wait.ThreeDS2Service(java.lang.String, int, java.lang.Object[]):void");
    }

    public static void get() {
        getExpiryDate = -8488449693571039842L;
        SDKInfo = new int[]{-1513013364, -462573823, 1524786313, -1907689471, -1599683913, -1402609355, 2050016518, 1209463502, -744562170, 918643609, 58438295, -235699724, -1045600128, -1377103036, -340943244, -156193334, -1376864876, -1407501842};
    }

    private static void values(int[] iArr, int i, Object[] objArr) {
        String str;
        synchronized (onError.ThreeDS2ServiceInstance) {
            try {
                char[] cArr = new char[4];
                char[] cArr2 = new char[iArr.length << 1];
                int[] iArr2 = (int[]) SDKInfo.clone();
                onError.valueOf = 0;
                while (true) {
                    int i2 = onError.valueOf;
                    if (i2 < iArr.length) {
                        int i3 = iArr[i2];
                        char c = (char) (i3 >> 16);
                        cArr[0] = c;
                        char c2 = (char) i3;
                        cArr[1] = c2;
                        int i4 = iArr[i2 + 1];
                        char c3 = (char) (i4 >> 16);
                        cArr[2] = c3;
                        char c4 = (char) i4;
                        cArr[3] = c4;
                        onError.values = (c << 16) + c2;
                        onError.ThreeDS2Service = (c3 << 16) + c4;
                        onError.valueOf(iArr2);
                        for (int i5 = 0; i5 < 16; i5++) {
                            int i6 = onError.values ^ iArr2[i5];
                            onError.values = i6;
                            onError.ThreeDS2Service = onError.ThreeDS2Service(i6) ^ onError.ThreeDS2Service;
                            int i7 = onError.values;
                            onError.values = onError.ThreeDS2Service;
                            onError.ThreeDS2Service = i7;
                        }
                        int i8 = onError.values;
                        onError.values = onError.ThreeDS2Service;
                        onError.ThreeDS2Service = i8;
                        onError.ThreeDS2Service = i8 ^ iArr2[16];
                        onError.values ^= iArr2[17];
                        int i9 = onError.values;
                        cArr[0] = (char) (i9 >>> 16);
                        cArr[1] = (char) i9;
                        int i10 = onError.ThreeDS2Service;
                        cArr[2] = (char) (i10 >>> 16);
                        cArr[3] = (char) i10;
                        onError.valueOf(iArr2);
                        int i11 = onError.valueOf;
                        int i12 = i11 << 1;
                        cArr2[i12] = cArr[0];
                        cArr2[i12 + 1] = cArr[1];
                        cArr2[i12 + 2] = cArr[2];
                        cArr2[i12 + 3] = cArr[3];
                        onError.valueOf = i11 + 2;
                    } else {
                        str = new String(cArr2, 0, i);
                    }
                }
            } catch (Throwable th2) {
                throw th2;
            }
        }
        objArr[0] = str;
    }
}

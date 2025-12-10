package com.netcetera.threeds.sdk.infrastructure;

import android.content.Context;
import android.graphics.Color;
import android.graphics.ImageFormat;
import android.graphics.drawable.Drawable;
import android.os.Build;
import android.text.TextUtils;
import android.util.TypedValue;
import android.view.KeyEvent;
import android.view.View;
import android.view.ViewConfiguration;
import ch.qos.logback.core.CoreConstants;
import com.netcetera.threeds.sdk.infrastructure.getSchemeLogoDark;
import java.io.BufferedReader;
import java.io.File;
import java.io.FileReader;
import java.io.IOException;
import java.math.BigInteger;
import java.security.MessageDigest;
import java.security.NoSuchAlgorithmException;
import java.util.Arrays;
import java.util.HashSet;
import java.util.Set;
import kotlin.text.Typography;
import org.bouncycastle.pqc.math.linearalgebra.Matrix;

/* loaded from: classes5.dex */
abstract class getSchemeLogo {
    private static BigInteger ConfigParameters = null;
    private static final getSchemeLogoDark.ThreeDS2Service ConfigurationBuilder;
    private static int SchemeConfiguration = 0;
    private static BigInteger ThreeDS2Service = null;
    private static final getSchemeLogoDark.ThreeDS2Service ThreeDS2Service$InitializationCallback;
    private static BigInteger ThreeDS2ServiceInstance = null;
    private static int[] addParam = null;
    private static String apiKey = null;
    private static char[] build = null;
    private static BigInteger cleanup = null;
    private static BigInteger createTransaction = null;
    static BigInteger get = null;
    private static final getSchemeLogoDark.ThreeDS2Service getParamValue;
    private static BigInteger getSDKInfo = null;
    private static BigInteger getSDKVersion = null;
    private static BigInteger getWarnings = null;
    private static BigInteger initialize = null;
    private static int mastercardSchemeConfiguration = 1;
    private static final String[] onCompleted;
    private static String onError;
    private static Set<BigInteger> removeParam;
    static BigInteger valueOf;
    static BigInteger values;

    static {
        values();
        Object[] objArr = new Object[1];
        values(new int[]{1520936198, 39317645, -1360133046, -1201586122, -2067631633, 728100733, 890831735, 1033351285, -908549621, 956502085, -534786436, -408554589, -746271703, -1307863462, 557903365, 2143974989}, KeyEvent.getDeadChar(0, 0) + 32, objArr);
        get = new BigInteger((String) objArr[0], 16);
        Object[] objArr2 = new Object[1];
        ThreeDS2ServiceInstance(false, new int[]{22, 32, 0, 7}, "\u0000\u0000\u0000\u0000\u0000\u0001\u0001\u0001\u0000\u0000\u0001\u0001\u0000\u0000\u0001\u0000\u0000\u0000\u0001\u0001\u0000\u0001\u0000\u0001\u0001\u0001\u0001\u0000\u0000\u0000\u0000\u0001", objArr2);
        ThreeDS2ServiceInstance = new BigInteger((String) objArr2[0], 16);
        Object[] objArr3 = new Object[1];
        values(new int[]{1375159571, -1684361560, -723990642, 2110262951, 1259835993, 676109318, -1343156033, 711753495, 1269829430, -964586442, -465420881, -460655909, 1516129718, 2086193063, -811675298, 1438856492}, (ViewConfiguration.getFadingEdgeLength() >> 16) + 32, objArr3);
        ThreeDS2Service = new BigInteger((String) objArr3[0], 16);
        Object[] objArr4 = new Object[1];
        values(new int[]{-84302728, 231337527, 2088997168, 1048017095, -790296326, -1988370807, 274297029, 1583048286, 824013652, 1891262197, 1832848915, -1956330023, 1813158633, 634073095, 1756427784, 205040965}, 33 - (ViewConfiguration.getZoomControlsTimeout() > 0L ? 1 : (ViewConfiguration.getZoomControlsTimeout() == 0L ? 0 : -1)), objArr4);
        cleanup = new BigInteger((String) objArr4[0], 16);
        Object[] objArr5 = new Object[1];
        ThreeDS2ServiceInstance(true, new int[]{54, 32, 80, 0}, "\u0001\u0000\u0000\u0000\u0000\u0001\u0000\u0000\u0000\u0001\u0001\u0000\u0001\u0001\u0000\u0001\u0000\u0000\u0000\u0001\u0001\u0000\u0001\u0000\u0000\u0000\u0000\u0000\u0001\u0001\u0001\u0001", objArr5);
        initialize = new BigInteger((String) objArr5[0], 16);
        Object[] objArr6 = new Object[1];
        values(new int[]{-568637810, 904205385, 698169536, 563270669, 369678856, -1211969139, 771890648, 2025424964, 1165524304, -266509448, -694711240, -323387931, 1689179460, 1042734698, 779808050, -594026322}, ImageFormat.getBitsPerPixel(0) + 33, objArr6);
        getSDKVersion = new BigInteger((String) objArr6[0], 16);
        Object[] objArr7 = new Object[1];
        ThreeDS2ServiceInstance(false, new int[]{86, 32, 181, 2}, "\u0001\u0000\u0001\u0000\u0000\u0001\u0001\u0001\u0001\u0000\u0001\u0001\u0001\u0001\u0001\u0001\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0001\u0000\u0001", objArr7);
        getSDKInfo = new BigInteger((String) objArr7[0], 16);
        Object[] objArr8 = new Object[1];
        values(new int[]{-1118207802, 1409240816, -1697670397, -1723095603, -1233310587, -1748302236, -1085013053, 1245185282, -1392826909, -1768455620, 1825385869, -628192659, -1176400456, 160361115, 1078388938, -27822648}, 32 - (TypedValue.complexToFloat(0) > 0.0f ? 1 : (TypedValue.complexToFloat(0) == 0.0f ? 0 : -1)), objArr8);
        getWarnings = new BigInteger((String) objArr8[0], 16);
        Object[] objArr9 = new Object[1];
        values(new int[]{1168641887, -1850146837, 1345501128, 1917637950, 497468269, 1245749476, 1993635824, -75747439, 938492545, 490141410, -1110519503, -42305196, 1440258336, -984258258, -1516366956, 443030092}, View.resolveSizeAndState(0, 0, 0) + 32, objArr9);
        createTransaction = new BigInteger((String) objArr9[0], 16);
        Object[] objArr10 = new Object[1];
        ThreeDS2ServiceInstance(false, new int[]{118, 32, 80, 0}, "\u0000\u0000\u0000\u0000\u0000\u0001\u0001\u0000\u0000\u0000\u0001\u0001\u0001\u0000\u0000\u0001\u0001\u0000\u0000\u0000\u0001\u0001\u0000\u0000\u0001\u0001\u0001\u0001\u0000\u0001\u0000\u0000", objArr10);
        ConfigParameters = new BigInteger((String) objArr10[0], 16);
        Object[] objArr11 = new Object[1];
        values(new int[]{893034849, -1682887741, -1710404738, -715959427, 975543178, -1013292972, -1018892542, 543719080, 1000860545, -81114259, 1073848086, -599021657, -1469229606, 1611335717, -1856760872, 210474651}, View.MeasureSpec.getMode(0) + 32, objArr11);
        valueOf = new BigInteger((String) objArr11[0], 16);
        Object[] objArr12 = new Object[1];
        ThreeDS2ServiceInstance(true, new int[]{150, 32, 46, 15}, null, objArr12);
        values = new BigInteger((String) objArr12[0], 16);
        Object[] objArr13 = new Object[1];
        ThreeDS2ServiceInstance(false, new int[]{182, 13, 0, 0}, "\u0000\u0001\u0001\u0000\u0001\u0000\u0001\u0000\u0000\u0000\u0001\u0000\u0001", objArr13);
        Object[] objArr14 = new Object[1];
        values(new int[]{1996168497, 2020225120, 2038048473, 1544707459, -913871385, 1862655545, 1673034200, 1895691128}, 16 - Drawable.resolveOpacity(0, 0), objArr14);
        Object[] objArr15 = new Object[1];
        values(new int[]{1996168497, 2020225120, 2038048473, 1544707459, -1137636627, 1326874747, 1627296593, 195442878, -942643312, -1509920910}, TextUtils.getTrimmedLength("") + 17, objArr15);
        Object[] objArr16 = new Object[1];
        ThreeDS2ServiceInstance(false, new int[]{195, 23, 53, 20}, "\u0001\u0000\u0001\u0001\u0001\u0000\u0001\u0000\u0001\u0000\u0001\u0001\u0001\u0001\u0000\u0001\u0001\u0001\u0001\u0001\u0000\u0001\u0001", objArr16);
        Object[] objArr17 = new Object[1];
        ThreeDS2ServiceInstance(false, new int[]{218, 30, 0, 2}, "\u0001\u0001\u0000\u0001\u0001\u0000\u0000\u0001\u0001\u0001\u0000\u0001\u0000\u0001\u0000\u0000\u0001\u0001\u0000\u0001\u0001\u0000\u0001\u0001\u0001\u0001\u0000\u0001\u0001\u0001", objArr17);
        onCompleted = new String[]{(String) objArr13[0], (String) objArr14[0], (String) objArr15[0], (String) objArr16[0], (String) objArr17[0]};
        onError = null;
        ThreeDS2Service$InitializationCallback = new getSchemeLogoDark.ThreeDS2Service();
        apiKey = null;
        getParamValue = new getSchemeLogoDark.ThreeDS2Service();
        removeParam = null;
        ConfigurationBuilder = new getSchemeLogoDark.ThreeDS2Service();
        mastercardSchemeConfiguration = (SchemeConfiguration + 83) % 128;
    }

    public static Set<BigInteger> ThreeDS2Service(Context context, getSchemeLogoDark.ThreeDS2Service threeDS2Service) {
        Object[] objArr;
        BufferedReader bufferedReader;
        synchronized (getSchemeLogo.class) {
            if (removeParam == null) {
                removeParam = new HashSet();
                try {
                    objArr = new Object[1];
                    values(new int[]{1349623568, 764843590, -6294335, -910700375, -993664506, 1824770942, -1987866151, -315730452, -1120417489, 745051137}, 18 - (ViewConfiguration.getScrollBarSize() >> 8), objArr);
                } catch (IOException | Exception unused) {
                }
                try {
                    bufferedReader = new BufferedReader(new FileReader(getSchemeLogoDark.values((String) objArr[0], ConfigurationBuilder)));
                    while (true) {
                        try {
                            byte[] valueOf2 = valueOf(bufferedReader.readLine());
                            if (valueOf2 == null) {
                                break;
                            }
                            removeParam.add(new BigInteger(1, valueOf2));
                        } catch (Throwable th2) {
                            th = th2;
                            if (bufferedReader != null) {
                                try {
                                    bufferedReader.close();
                                } catch (IOException unused2) {
                                }
                            }
                            throw th;
                        }
                    }
                    bufferedReader.close();
                    if (removeParam.isEmpty()) {
                        int i = 0;
                        while (true) {
                            String[] strArr = onCompleted;
                            if (i >= strArr.length) {
                                break;
                            }
                            String values2 = getSchemeLogoDark.values(context, strArr[i], ConfigurationBuilder);
                            if (!TextUtils.isEmpty(values2)) {
                                StringBuilder sb = new StringBuilder();
                                sb.append(strArr[i]);
                                Object[] objArr2 = new Object[1];
                                ThreeDS2ServiceInstance(true, new int[]{0, 1, 0, 0}, "\u0001", objArr2);
                                sb.append((String) objArr2[0]);
                                sb.append(values2);
                                removeParam.add(new BigInteger(1, valueOf(sb.toString())));
                            }
                            i++;
                        }
                    }
                    removeParam.retainAll(Arrays.asList(get, ThreeDS2ServiceInstance, getSDKVersion, valueOf, values, ThreeDS2Service, cleanup, initialize, getSDKInfo, createTransaction, getWarnings, ConfigParameters));
                } catch (Throwable th3) {
                    th = th3;
                    bufferedReader = null;
                }
            }
        }
        if (threeDS2Service != null) {
            threeDS2Service.get(ConfigurationBuilder);
        }
        return removeParam;
    }

    public static String ThreeDS2ServiceInstance(getSchemeLogoDark.ThreeDS2Service threeDS2Service) {
        String[] list;
        String obj;
        synchronized (getSchemeLogo.class) {
            try {
                if (apiKey == null) {
                    Object[] objArr = new Object[1];
                    ThreeDS2ServiceInstance(false, new int[]{3, 5, 178, 4}, "\u0000\u0000\u0001\u0000\u0000", objArr);
                    for (String str : new File((String) objArr[0]).list()) {
                        Object[] objArr2 = new Object[1];
                        ThreeDS2ServiceInstance(false, new int[]{8, 6, 0, 0}, "\u0001\u0001\u0001\u0000\u0000\u0000", objArr2);
                        if (str.matches((String) objArr2[0])) {
                            StringBuilder sb = new StringBuilder();
                            Object[] objArr3 = new Object[1];
                            values(new int[]{-1737744024, -1870539145, -434357062, 1928223171}, 6 - TextUtils.getTrimmedLength(""), objArr3);
                            sb.append((String) objArr3[0]);
                            sb.append(str);
                            Object[] objArr4 = new Object[1];
                            values(new int[]{514900972, -322969136, -836616544, -1746804920}, Color.green(0) + 8, objArr4);
                            sb.append((String) objArr4[0]);
                            String obj2 = sb.toString();
                            Object[] objArr5 = new Object[1];
                            ThreeDS2ServiceInstance(false, new int[]{14, 1, 78, 0}, "\u0000", objArr5);
                            String ThreeDS2Service2 = getSchemeLogoDark.ThreeDS2Service(obj2, (String) objArr5[0], getParamValue);
                            StringBuilder sb2 = new StringBuilder();
                            sb2.append(apiKey);
                            if (TextUtils.isEmpty(ThreeDS2Service2)) {
                                obj = "";
                            } else {
                                StringBuilder sb3 = new StringBuilder();
                                sb3.append(ThreeDS2Service2);
                                Object[] objArr6 = new Object[1];
                                ThreeDS2ServiceInstance(true, new int[]{15, 1, 185, 1}, "\u0001", objArr6);
                                sb3.append((String) objArr6[0]);
                                obj = sb3.toString();
                            }
                            sb2.append(obj);
                            apiKey = sb2.toString();
                        }
                    }
                }
            } catch (Throwable th2) {
                throw th2;
            }
        }
        if (threeDS2Service != null) {
            threeDS2Service.get(getParamValue);
        }
        return apiKey;
    }

    private static byte[] valueOf(String str) {
        mastercardSchemeConfiguration = (SchemeConfiguration + 23) % 128;
        try {
            Object[] objArr = new Object[1];
            values(new int[]{1313273908, -1328432994}, 4 - (ViewConfiguration.getZoomControlsTimeout() > 0L ? 1 : (ViewConfiguration.getZoomControlsTimeout() == 0L ? 0 : -1)), objArr);
            String str2 = (String) objArr[0];
            mastercardSchemeConfiguration = (SchemeConfiguration + 113) % 128;
            Object[] objArr2 = {str2};
            Object[] objArr3 = new Object[1];
            values(new int[]{-1037494422, 2023505185, -1544591862, 1667120275, 1823512775, -1064734086, 1884887833, 1209855728, -758472879, -1693108689, -74603198, 1507286993, -2013917004, 1075036349}, TextUtils.lastIndexOf("", '0', 0, 0) + 28, objArr3);
            Class<?> cls = Class.forName((String) objArr3[0]);
            Object[] objArr4 = new Object[1];
            values(new int[]{1736710361, -1695060143, 1294201105, -1055309929, 1156664462, 549680585}, TextUtils.indexOf((CharSequence) "", '0', 0) + 12, objArr4);
            MessageDigest messageDigest = (MessageDigest) cls.getMethod((String) objArr4[0], String.class).invoke(null, objArr2);
            messageDigest.update(str.getBytes());
            SchemeConfiguration = (mastercardSchemeConfiguration + 101) % 128;
            Object[] objArr5 = new Object[1];
            values(new int[]{-1037494422, 2023505185, -1544591862, 1667120275, 1823512775, -1064734086, 1884887833, 1209855728, -758472879, -1693108689, -74603198, 1507286993, -2013917004, 1075036349}, 27 - TextUtils.getOffsetAfter("", 0), objArr5);
            Class<?> cls2 = Class.forName((String) objArr5[0]);
            Object[] objArr6 = new Object[1];
            ThreeDS2ServiceInstance(false, new int[]{16, 6, 0, 1}, "\u0000\u0000\u0001\u0000\u0000\u0000", objArr6);
            return (byte[]) cls2.getMethod((String) objArr6[0], null).invoke(messageDigest, null);
        } catch (NoSuchAlgorithmException unused) {
            return new byte[0];
        }
    }

    public static void values() {
        addParam = new int[]{2017220606, -871361466, 1496999558, -1011519662, 2098536809, -320762679, -1446657625, 2019726964, 196143381, -1190700318, -1655438606, -1724419110, -1897861336, 214521101, -483883205, 2131024397, -970306784, 1933050166};
        build = new char[]{30, 'r', 229, 145, 291, 290, 283, 251, '-', 'E', '.', '3', 'K', 'D', CoreConstants.SINGLE_QUOTE_CHAR, 'a', ':', 'l', 'f', 'h', 'f', 'l', 27, '6', '7', 'M', 'b', 'c', 'c', 'I', '5', '6', '5', '6', 'K', 'a', 'c', 'd', 'b', 'K', '4', '3', Matrix.MATRIX_TYPE_RANDOM_LT, Matrix.MATRIX_TYPE_RANDOM_LT, '6', 'M', 'K', '2', '3', '8', '7', '3', '2', Matrix.MATRIX_TYPE_RANDOM_LT, 'Y', 155, 133, 132, 133, 133, 133, 159, 159, 157, 178, 155, 155, 180, 156, 133, 157, 157, 157, 155, 135, 158, 154, 156, 181, 180, 157, 135, 133, 132, 134, 157, 'r', 230, 234, 258, 256, 256, 256, 234, 232, 231, 232, 233, 233, 257, 282, 260, 238, 258, 255, 257, 282, 259, 236, 257, 258, 258, 255, 232, 233, 233, 233, 233, '@', 155, 159, 136, 133, 154, 157, 136, 132, 130, 130, 129, 131, 157, 157, 130, 130, 155, 154, 131, 154, 155, 133, 133, 132, 133, 131, 153, 156, 155, 153, 129, 'c', 146, 'c', 143, 148, 'e', 146, 'e', 'f', 'd', 'f', 146, 143, 'g', 'a', 'a', 146, 144, 'a', 147, 'd', 'f', 'c', 'b', 'c', 143, 'd', 'b', 146, '`', 'c', '`', '9', 'p', 'N', 'H', 'k', 'o', 'j', 'h', 'I', 'K', 'k', 'q', 's', Matrix.MATRIX_TYPE_RANDOM_REGULAR, 166, 165, 158, 161, 161, Typography.nbsp, 134, 130, 156, 156, 166, Typography.cent, 152, 151, Typography.nbsp, Typography.copyright, 168, Typography.nbsp, Typography.nbsp, Typography.section, 165, 131, '2', 'k', 'r', 'p', 'N', 'O', 'q', 'p', 'i', 'l', 'l', 'k', 'Q', 'P', 'v', 'v', 's', 'l', 'i', 'M', 'M', 'g', 'g', 'q', 'm', 'c', 'b', 'k', 't', 's'};
    }

    private static void values(int[] iArr, int i, Object[] objArr) {
        String str;
        synchronized (rootPublicKey.ThreeDS2Service) {
            try {
                char[] cArr = new char[4];
                char[] cArr2 = new char[iArr.length * 2];
                int[] iArr2 = (int[]) addParam.clone();
                rootPublicKey.valueOf = 0;
                while (true) {
                    int i2 = rootPublicKey.valueOf;
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
                        rootPublicKey.ThreeDS2ServiceInstance = (c << 16) + c2;
                        rootPublicKey.values = (c3 << 16) + c4;
                        rootPublicKey.get(iArr2);
                        for (int i5 = 0; i5 < 16; i5++) {
                            int i6 = rootPublicKey.ThreeDS2ServiceInstance ^ iArr2[i5];
                            rootPublicKey.ThreeDS2ServiceInstance = i6;
                            rootPublicKey.values = rootPublicKey.ThreeDS2Service(i6) ^ rootPublicKey.values;
                            int i7 = rootPublicKey.ThreeDS2ServiceInstance;
                            rootPublicKey.ThreeDS2ServiceInstance = rootPublicKey.values;
                            rootPublicKey.values = i7;
                        }
                        int i8 = rootPublicKey.ThreeDS2ServiceInstance;
                        rootPublicKey.ThreeDS2ServiceInstance = rootPublicKey.values;
                        rootPublicKey.values = i8;
                        rootPublicKey.values = i8 ^ iArr2[16];
                        rootPublicKey.ThreeDS2ServiceInstance ^= iArr2[17];
                        int i9 = rootPublicKey.ThreeDS2ServiceInstance;
                        cArr[0] = (char) (i9 >>> 16);
                        cArr[1] = (char) i9;
                        int i10 = rootPublicKey.values;
                        cArr[2] = (char) (i10 >>> 16);
                        cArr[3] = (char) i10;
                        rootPublicKey.get(iArr2);
                        int i11 = rootPublicKey.valueOf;
                        int i12 = i11 * 2;
                        cArr2[i12] = cArr[0];
                        cArr2[i12 + 1] = cArr[1];
                        cArr2[i12 + 2] = cArr[2];
                        cArr2[i12 + 3] = cArr[3];
                        rootPublicKey.valueOf = i11 + 2;
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

    /* JADX WARN: Code restructure failed: missing block: B:0:?, code lost:
        r14 = r14;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    private static void ThreeDS2ServiceInstance(boolean r12, int[] r13, java.lang.String r14, java.lang.Object[] r15) {
        /*
            if (r14 == 0) goto L8
            java.lang.String r0 = "ISO-8859-1"
            byte[] r14 = r14.getBytes(r0)
        L8:
            byte[] r14 = (byte[]) r14
            java.lang.Object r0 = com.netcetera.threeds.sdk.infrastructure.amexConfiguration.ThreeDS2ServiceInstance
            monitor-enter(r0)
            r1 = 0
            r2 = r13[r1]     // Catch: java.lang.Throwable -> L39
            r3 = 1
            r4 = r13[r3]     // Catch: java.lang.Throwable -> L39
            r5 = 2
            r6 = r13[r5]     // Catch: java.lang.Throwable -> L39
            r7 = 3
            r7 = r13[r7]     // Catch: java.lang.Throwable -> L39
            char[] r8 = com.netcetera.threeds.sdk.infrastructure.getSchemeLogo.build     // Catch: java.lang.Throwable -> L39
            char[] r9 = new char[r4]     // Catch: java.lang.Throwable -> L39
            java.lang.System.arraycopy(r8, r2, r9, r1, r4)     // Catch: java.lang.Throwable -> L39
            if (r14 == 0) goto L4b
            char[] r2 = new char[r4]     // Catch: java.lang.Throwable -> L39
            com.netcetera.threeds.sdk.infrastructure.amexConfiguration.get = r1     // Catch: java.lang.Throwable -> L39
            r8 = 0
        L27:
            int r10 = com.netcetera.threeds.sdk.infrastructure.amexConfiguration.get     // Catch: java.lang.Throwable -> L39
            if (r10 >= r4) goto L4a
            r11 = r14[r10]     // Catch: java.lang.Throwable -> L39
            if (r11 != r3) goto L3b
            char r11 = r9[r10]     // Catch: java.lang.Throwable -> L39
            int r11 = r11 * 2
            int r11 = r11 + r3
            int r11 = r11 - r8
            char r8 = (char) r11     // Catch: java.lang.Throwable -> L39
            r2[r10] = r8     // Catch: java.lang.Throwable -> L39
            goto L43
        L39:
            r12 = move-exception
            goto L8f
        L3b:
            char r11 = r9[r10]     // Catch: java.lang.Throwable -> L39
            int r11 = r11 * 2
            int r11 = r11 - r8
            char r8 = (char) r11     // Catch: java.lang.Throwable -> L39
            r2[r10] = r8     // Catch: java.lang.Throwable -> L39
        L43:
            char r8 = r2[r10]     // Catch: java.lang.Throwable -> L39
            int r10 = r10 + 1
            com.netcetera.threeds.sdk.infrastructure.amexConfiguration.get = r10     // Catch: java.lang.Throwable -> L39
            goto L27
        L4a:
            r9 = r2
        L4b:
            if (r7 <= 0) goto L5a
            char[] r14 = new char[r4]     // Catch: java.lang.Throwable -> L39
            java.lang.System.arraycopy(r9, r1, r14, r1, r4)     // Catch: java.lang.Throwable -> L39
            int r2 = r4 - r7
            java.lang.System.arraycopy(r14, r1, r9, r2, r7)     // Catch: java.lang.Throwable -> L39
            java.lang.System.arraycopy(r14, r7, r9, r1, r2)     // Catch: java.lang.Throwable -> L39
        L5a:
            if (r12 == 0) goto L71
            char[] r12 = new char[r4]     // Catch: java.lang.Throwable -> L39
            com.netcetera.threeds.sdk.infrastructure.amexConfiguration.get = r1     // Catch: java.lang.Throwable -> L39
        L60:
            int r14 = com.netcetera.threeds.sdk.infrastructure.amexConfiguration.get     // Catch: java.lang.Throwable -> L39
            if (r14 >= r4) goto L70
            int r2 = r4 - r14
            int r2 = r2 - r3
            char r2 = r9[r2]     // Catch: java.lang.Throwable -> L39
            r12[r14] = r2     // Catch: java.lang.Throwable -> L39
            int r14 = r14 + 1
            com.netcetera.threeds.sdk.infrastructure.amexConfiguration.get = r14     // Catch: java.lang.Throwable -> L39
            goto L60
        L70:
            r9 = r12
        L71:
            if (r6 <= 0) goto L86
            com.netcetera.threeds.sdk.infrastructure.amexConfiguration.get = r1     // Catch: java.lang.Throwable -> L39
        L75:
            int r12 = com.netcetera.threeds.sdk.infrastructure.amexConfiguration.get     // Catch: java.lang.Throwable -> L39
            if (r12 >= r4) goto L86
            char r14 = r9[r12]     // Catch: java.lang.Throwable -> L39
            r2 = r13[r5]     // Catch: java.lang.Throwable -> L39
            int r14 = r14 - r2
            char r14 = (char) r14     // Catch: java.lang.Throwable -> L39
            r9[r12] = r14     // Catch: java.lang.Throwable -> L39
            int r12 = r12 + 1
            com.netcetera.threeds.sdk.infrastructure.amexConfiguration.get = r12     // Catch: java.lang.Throwable -> L39
            goto L75
        L86:
            java.lang.String r12 = new java.lang.String     // Catch: java.lang.Throwable -> L39
            r12.<init>(r9)     // Catch: java.lang.Throwable -> L39
            monitor-exit(r0)     // Catch: java.lang.Throwable -> L39
            r15[r1] = r12
            return
        L8f:
            monitor-exit(r0)
            throw r12
        */
        throw new UnsupportedOperationException("Method not decompiled: com.netcetera.threeds.sdk.infrastructure.getSchemeLogo.ThreeDS2ServiceInstance(boolean, int[], java.lang.String, java.lang.Object[]):void");
    }

    public static String ThreeDS2Service(getSchemeLogoDark.ThreeDS2Service threeDS2Service) throws Exception {
        synchronized (getSchemeLogo.class) {
            try {
                if (onError == null && Build.VERSION.SDK_INT < 26) {
                    Object[] objArr = new Object[1];
                    ThreeDS2ServiceInstance(true, new int[]{1, 2, 116, 1}, "\u0000\u0001", objArr);
                    onError = getSchemeLogoDark.ThreeDS2Service((String) objArr[0], -1L, ThreeDS2Service$InitializationCallback);
                }
            } catch (Throwable th2) {
                throw th2;
            }
        }
        if (threeDS2Service != null) {
            threeDS2Service.get(ThreeDS2Service$InitializationCallback);
        }
        return onError;
    }
}

package com.netcetera.threeds.sdk.infrastructure;

import java.nio.ByteBuffer;
import java.nio.charset.CharacterCodingException;
import java.nio.charset.Charset;
import kotlin.text.Typography;
import org.bouncycastle.pqc.math.linearalgebra.Matrix;

/* loaded from: classes5.dex */
public class newSchemeConfiguration {
    private static int ThreeDS2Service = 0;
    private static char[] ThreeDS2ServiceInstance = {'a', 188, 195, Typography.times, 222, Typography.less, 134, Typography.amp, Matrix.MATRIX_TYPE_RANDOM_REGULAR, 'Y', 'm'};
    private static int valueOf = 1;

    public static String ThreeDS2Service(byte[] bArr) {
        StringBuilder sb = new StringBuilder();
        ThreeDS2Service = (valueOf + 25) % 128;
        int i = 0;
        while (i < bArr.length) {
            ThreeDS2Service = (valueOf + 63) % 128;
            byte b = bArr[i];
            if (valueOf(b)) {
                int min = Math.min(get(b) + 1, bArr.length - i);
                byte[] bArr2 = new byte[min];
                System.arraycopy(bArr, i, bArr2, 0, min);
                try {
                    Object[] objArr = new Object[1];
                    valueOf("\u0000\u0001\u0001\u0000\u0001", new int[]{0, 5, 138, 0}, true, objArr);
                    sb.append((CharSequence) Charset.forName((String) objArr[0]).newDecoder().decode(ByteBuffer.wrap(bArr2)));
                    i += min;
                } catch (CharacterCodingException unused) {
                    sb.append(ThreeDS2Service(bArr2[0]));
                    int i2 = 1;
                    for (int i3 = 1; i3 < min; i3++) {
                        int i4 = valueOf + 49;
                        ThreeDS2Service = i4 % 128;
                        if (i4 % 2 == 0) {
                            byte b2 = bArr2[i3];
                            if (!(!valueOf(b2))) {
                                break;
                            }
                            sb.append(ThreeDS2Service(b2));
                            i2++;
                        } else {
                            valueOf(bArr2[i3]);
                            throw null;
                        }
                    }
                    i += i2;
                }
            } else {
                sb.append(ThreeDS2Service(b));
                i++;
            }
        }
        return sb.toString();
    }

    private static int get(byte b) {
        valueOf = (ThreeDS2Service + 125) % 128;
        if (ThreeDS2Service(b, 7) == 0) {
            return 0;
        }
        if (ThreeDS2Service(b, 7) == 1) {
            valueOf = (ThreeDS2Service + 57) % 128;
            if (ThreeDS2Service(b, 6) == 1) {
                int i = ThreeDS2Service + 33;
                valueOf = i % 128;
                if (i % 2 != 0 ? ThreeDS2Service(b, 5) == 0 : ThreeDS2Service(b, 2) == 0) {
                    ThreeDS2Service = (valueOf + 61) % 128;
                    return 1;
                }
            }
        }
        if (ThreeDS2Service(b, 7) == 1) {
            int i2 = valueOf + 103;
            ThreeDS2Service = i2 % 128;
            if (i2 % 2 == 0 ? ThreeDS2Service(b, 6) == 1 : ThreeDS2Service(b, 50) == 0) {
                if (ThreeDS2Service(b, 5) == 1 && ThreeDS2Service(b, 4) == 0) {
                    return 2;
                }
            }
        }
        if (ThreeDS2Service(b, 7) == 1 && ThreeDS2Service(b, 6) == 1 && ThreeDS2Service(b, 5) == 1) {
            valueOf = (ThreeDS2Service + 55) % 128;
            if (ThreeDS2Service(b, 4) == 1) {
                ThreeDS2Service = (valueOf + 91) % 128;
                if (ThreeDS2Service(b, 3) == 0) {
                    ThreeDS2Service = (valueOf + 15) % 128;
                    return 3;
                }
                return -1;
            }
            return -1;
        }
        return -1;
    }

    private static boolean valueOf(byte b) {
        int i = valueOf + 91;
        ThreeDS2Service = i % 128;
        int i2 = i % 2;
        int i3 = get(b);
        if (i2 != 0) {
            if (i3 != -1) {
                return true;
            }
        } else if (i3 != -1) {
            return true;
        }
        int i4 = ThreeDS2Service + 65;
        valueOf = i4 % 128;
        if (i4 % 2 != 0) {
            return false;
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
    private static void valueOf(java.lang.String r12, int[] r13, boolean r14, java.lang.Object[] r15) {
        /*
            if (r12 == 0) goto L8
            java.lang.String r0 = "ISO-8859-1"
            byte[] r12 = r12.getBytes(r0)
        L8:
            byte[] r12 = (byte[]) r12
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
            char[] r8 = com.netcetera.threeds.sdk.infrastructure.newSchemeConfiguration.ThreeDS2ServiceInstance     // Catch: java.lang.Throwable -> L39
            char[] r9 = new char[r4]     // Catch: java.lang.Throwable -> L39
            java.lang.System.arraycopy(r8, r2, r9, r1, r4)     // Catch: java.lang.Throwable -> L39
            if (r12 == 0) goto L4b
            char[] r2 = new char[r4]     // Catch: java.lang.Throwable -> L39
            com.netcetera.threeds.sdk.infrastructure.amexConfiguration.get = r1     // Catch: java.lang.Throwable -> L39
            r8 = 0
        L27:
            int r10 = com.netcetera.threeds.sdk.infrastructure.amexConfiguration.get     // Catch: java.lang.Throwable -> L39
            if (r10 >= r4) goto L4a
            r11 = r12[r10]     // Catch: java.lang.Throwable -> L39
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
            char[] r12 = new char[r4]     // Catch: java.lang.Throwable -> L39
            java.lang.System.arraycopy(r9, r1, r12, r1, r4)     // Catch: java.lang.Throwable -> L39
            int r2 = r4 - r7
            java.lang.System.arraycopy(r12, r1, r9, r2, r7)     // Catch: java.lang.Throwable -> L39
            java.lang.System.arraycopy(r12, r7, r9, r1, r2)     // Catch: java.lang.Throwable -> L39
        L5a:
            if (r14 == 0) goto L71
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
        throw new UnsupportedOperationException("Method not decompiled: com.netcetera.threeds.sdk.infrastructure.newSchemeConfiguration.valueOf(java.lang.String, int[], boolean, java.lang.Object[]):void");
    }

    private static int ThreeDS2Service(byte b, int i) {
        int i2 = valueOf;
        int i3 = i2 + 95;
        ThreeDS2Service = i3 % 128;
        int i4 = i3 % 2 != 0 ? (b + i) | 1 : (b >> i) & 1;
        ThreeDS2Service = (i2 + 117) % 128;
        return i4;
    }

    private static String ThreeDS2Service(byte b) {
        StringBuilder sb = new StringBuilder();
        Object[] objArr = new Object[1];
        valueOf("\u0000\u0000", new int[]{5, 2, 28, 2}, false, objArr);
        sb.append((String) objArr[0]);
        Object[] objArr2 = new Object[1];
        valueOf("\u0001\u0001\u0000\u0000", new int[]{7, 4, 40, 4}, false, objArr2);
        sb.append(String.format((String) objArr2[0], Byte.valueOf(b)));
        String obj = sb.toString();
        valueOf = (ThreeDS2Service + 5) % 128;
        return obj;
    }
}
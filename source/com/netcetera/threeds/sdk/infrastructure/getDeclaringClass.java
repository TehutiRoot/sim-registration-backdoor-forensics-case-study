package com.netcetera.threeds.sdk.infrastructure;

import android.graphics.Color;
import android.os.Process;
import android.text.TextUtils;
import android.view.ViewConfiguration;
import kotlinx.serialization.json.internal.AbstractJsonLexerKt;

/* loaded from: classes5.dex */
public final class getDeclaringClass {
    private static int ThreeDS2ServiceInstance = 0;
    private static int values = 1;

    public static /* synthetic */ boolean ThreeDS2Service(C9651nr c9651nr, String str, String[] strArr, Boolean bool) {
        int i = values;
        int i2 = i & 117;
        int i3 = (i | 117) & (~i2);
        int i4 = -(-(i2 << 1));
        ThreeDS2ServiceInstance = ((i3 ^ i4) + ((i3 & i4) << 1)) % 128;
        boolean valueOf = valueOf(c9651nr, str, strArr, bool);
        int i5 = ThreeDS2ServiceInstance + 89;
        values = i5 % 128;
        if (i5 % 2 != 0) {
            return valueOf;
        }
        throw null;
    }

    public static notifyAll ThreeDS2ServiceInstance() {
        notifyAll notifyall = ThreeDS2Service().get(new notifyAll() { // from class: com.netcetera.threeds.sdk.infrastructure.getDeclaringClass.5
            private static int ThreeDS2Service = 0;
            public static char[] ThreeDS2ServiceInstance = {'2', 'i', AbstractJsonLexerKt.BEGIN_LIST, AbstractJsonLexerKt.BEGIN_LIST, 'n', 'l', 'n', 'l', 'h', 'n', 'n', 'n', 'Y', 'T', 'f', 'j', 'i', 'h', 'l', 'f', 'd', 'e'};
            private static int get = 1;

            @Override // com.netcetera.threeds.sdk.infrastructure.notifyAll
            public boolean values(C9651nr c9651nr, String str, boolean z) {
                ThreeDS2Service = (get + 7) % 128;
                Object[] objArr = new Object[1];
                values("\u0000\u0000\u0001\u0001\u0001\u0000\u0001\u0001\u0001\u0000\u0001\u0000\u0000\u0000\u0000\u0001\u0001\u0001\u0000\u0001\u0001\u0001", new int[]{0, 22, 0, 0}, true, objArr);
                boolean ThreeDS2Service2 = getDeclaringClass.ThreeDS2Service(c9651nr, ((String) objArr[0]).intern(), new String[]{getSuppressed.values.ThreeDS2Service()}, Boolean.valueOf(z));
                ThreeDS2Service = (get + 115) % 128;
                return ThreeDS2Service2;
            }

            /* JADX WARN: Code restructure failed: missing block: B:0:?, code lost:
                r12 = r12;
             */
            /*
                Code decompiled incorrectly, please refer to instructions dump.
                To view partially-correct code enable 'Show inconsistent code' option in preferences
            */
            private static void values(java.lang.String r12, int[] r13, boolean r14, java.lang.Object[] r15) {
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
                    char[] r8 = com.netcetera.threeds.sdk.infrastructure.getDeclaringClass.C94155.ThreeDS2ServiceInstance     // Catch: java.lang.Throwable -> L38
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
                throw new UnsupportedOperationException("Method not decompiled: com.netcetera.threeds.sdk.infrastructure.getDeclaringClass.C94155.values(java.lang.String, int[], boolean, java.lang.Object[]):void");
            }
        });
        int i = ThreeDS2ServiceInstance;
        values = (((i ^ 74) + ((i & 74) << 1)) - 1) % 128;
        return notifyall;
    }

    public static notifyAll get() {
        notifyAll notifyall = new notifyAll() { // from class: com.netcetera.threeds.sdk.infrastructure.getDeclaringClass.2
            private static int get = 0;
            private static int valueOf = 1;

            @Override // com.netcetera.threeds.sdk.infrastructure.notifyAll
            public boolean values(C9651nr c9651nr, String str, boolean z) {
                boolean z2;
                int i = valueOf;
                int i2 = i & 113;
                int i3 = (i ^ 113) | i2;
                int i4 = ((i2 | i3) << 1) - (i2 ^ i3);
                get = i4 % 128;
                if (i4 % 2 != 0) {
                    z2 = false;
                } else {
                    z2 = true;
                }
                int i5 = i & 75;
                int i6 = ((i | 75) & (~i5)) + (i5 << 1);
                get = i6 % 128;
                if (i6 % 2 != 0) {
                    int i7 = 21 / 0;
                }
                return z2;
            }
        };
        int i = values;
        int i2 = (((i | 100) << 1) - (i ^ 100)) - 1;
        ThreeDS2ServiceInstance = i2 % 128;
        if (i2 % 2 == 0) {
            return notifyall;
        }
        throw null;
    }

    public static notifyAll valueOf() {
        notifyAll notifyall = ThreeDS2Service().get(new notifyAll() { // from class: com.netcetera.threeds.sdk.infrastructure.getDeclaringClass.3
            public static int ThreeDS2ServiceInstance = 103;
            private static int get = 0;
            private static int valueOf = 1;

            /* JADX WARN: Code restructure failed: missing block: B:0:?, code lost:
                r8 = r8;
             */
            /*
                Code decompiled incorrectly, please refer to instructions dump.
                To view partially-correct code enable 'Show inconsistent code' option in preferences
            */
            private static void valueOf(int r6, int r7, java.lang.String r8, int r9, boolean r10, java.lang.Object[] r11) {
                /*
                    if (r8 == 0) goto L6
                    char[] r8 = r8.toCharArray()
                L6:
                    char[] r8 = (char[]) r8
                    java.lang.Object r0 = com.netcetera.threeds.sdk.infrastructure.apiKey.get
                    monitor-enter(r0)
                    char[] r1 = new char[r7]     // Catch: java.lang.Throwable -> L2f
                    r2 = 0
                    com.netcetera.threeds.sdk.infrastructure.apiKey.ThreeDS2ServiceInstance = r2     // Catch: java.lang.Throwable -> L2f
                L10:
                    int r3 = com.netcetera.threeds.sdk.infrastructure.apiKey.ThreeDS2ServiceInstance     // Catch: java.lang.Throwable -> L2f
                    if (r3 >= r7) goto L31
                    char r3 = r8[r3]     // Catch: java.lang.Throwable -> L2f
                    com.netcetera.threeds.sdk.infrastructure.apiKey.valueOf = r3     // Catch: java.lang.Throwable -> L2f
                    int r3 = com.netcetera.threeds.sdk.infrastructure.apiKey.ThreeDS2ServiceInstance     // Catch: java.lang.Throwable -> L2f
                    int r4 = com.netcetera.threeds.sdk.infrastructure.apiKey.valueOf     // Catch: java.lang.Throwable -> L2f
                    int r4 = r4 + r9
                    char r4 = (char) r4     // Catch: java.lang.Throwable -> L2f
                    r1[r3] = r4     // Catch: java.lang.Throwable -> L2f
                    int r3 = com.netcetera.threeds.sdk.infrastructure.apiKey.ThreeDS2ServiceInstance     // Catch: java.lang.Throwable -> L2f
                    char r4 = r1[r3]     // Catch: java.lang.Throwable -> L2f
                    int r5 = com.netcetera.threeds.sdk.infrastructure.getDeclaringClass.C94133.ThreeDS2ServiceInstance     // Catch: java.lang.Throwable -> L2f
                    int r4 = r4 - r5
                    char r4 = (char) r4     // Catch: java.lang.Throwable -> L2f
                    r1[r3] = r4     // Catch: java.lang.Throwable -> L2f
                    int r3 = r3 + 1
                    com.netcetera.threeds.sdk.infrastructure.apiKey.ThreeDS2ServiceInstance = r3     // Catch: java.lang.Throwable -> L2f
                    goto L10
                L2f:
                    r6 = move-exception
                    goto L69
                L31:
                    if (r6 <= 0) goto L48
                    com.netcetera.threeds.sdk.infrastructure.apiKey.values = r6     // Catch: java.lang.Throwable -> L2f
                    char[] r6 = new char[r7]     // Catch: java.lang.Throwable -> L2f
                    java.lang.System.arraycopy(r1, r2, r6, r2, r7)     // Catch: java.lang.Throwable -> L2f
                    int r8 = com.netcetera.threeds.sdk.infrastructure.apiKey.values     // Catch: java.lang.Throwable -> L2f
                    int r9 = r7 - r8
                    java.lang.System.arraycopy(r6, r2, r1, r9, r8)     // Catch: java.lang.Throwable -> L2f
                    int r8 = com.netcetera.threeds.sdk.infrastructure.apiKey.values     // Catch: java.lang.Throwable -> L2f
                    int r9 = r7 - r8
                    java.lang.System.arraycopy(r6, r8, r1, r2, r9)     // Catch: java.lang.Throwable -> L2f
                L48:
                    if (r10 == 0) goto L60
                    char[] r6 = new char[r7]     // Catch: java.lang.Throwable -> L2f
                    com.netcetera.threeds.sdk.infrastructure.apiKey.ThreeDS2ServiceInstance = r2     // Catch: java.lang.Throwable -> L2f
                L4e:
                    int r8 = com.netcetera.threeds.sdk.infrastructure.apiKey.ThreeDS2ServiceInstance     // Catch: java.lang.Throwable -> L2f
                    if (r8 >= r7) goto L5f
                    int r9 = r7 - r8
                    int r9 = r9 + (-1)
                    char r9 = r1[r9]     // Catch: java.lang.Throwable -> L2f
                    r6[r8] = r9     // Catch: java.lang.Throwable -> L2f
                    int r8 = r8 + 1
                    com.netcetera.threeds.sdk.infrastructure.apiKey.ThreeDS2ServiceInstance = r8     // Catch: java.lang.Throwable -> L2f
                    goto L4e
                L5f:
                    r1 = r6
                L60:
                    java.lang.String r6 = new java.lang.String     // Catch: java.lang.Throwable -> L2f
                    r6.<init>(r1)     // Catch: java.lang.Throwable -> L2f
                    monitor-exit(r0)     // Catch: java.lang.Throwable -> L2f
                    r11[r2] = r6
                    return
                L69:
                    monitor-exit(r0)
                    throw r6
                */
                throw new UnsupportedOperationException("Method not decompiled: com.netcetera.threeds.sdk.infrastructure.getDeclaringClass.C94133.valueOf(int, int, java.lang.String, int, boolean, java.lang.Object[]):void");
            }

            @Override // com.netcetera.threeds.sdk.infrastructure.notifyAll
            public boolean values(C9651nr c9651nr, String str, boolean z) {
                get = (valueOf + 99) % 128;
                Object[] objArr = new Object[1];
                valueOf(Color.red(0) + 9, TextUtils.indexOf((CharSequence) "", '0') + 23, "\u0006\uffff\u000e\u0003\t\b￣\b\ufffe�\u0002\ufffb\u0006\u0006\uffff\b\u0001\uffff\uffdd\t\u0007\n", 206 - (Process.getElapsedCpuTime() > 0L ? 1 : (Process.getElapsedCpuTime() == 0L ? 0 : -1)), false, objArr);
                boolean ThreeDS2Service = getDeclaringClass.ThreeDS2Service(c9651nr, ((String) objArr[0]).intern(), new String[]{getSuppressed.ThreeDS2Service.ThreeDS2Service()}, Boolean.valueOf(z));
                int i = valueOf + 93;
                get = i % 128;
                if (i % 2 == 0) {
                    return ThreeDS2Service;
                }
                throw null;
            }
        });
        int i = ThreeDS2ServiceInstance;
        int i2 = (i & 77) + (i | 77);
        values = i2 % 128;
        if (i2 % 2 != 0) {
            return notifyall;
        }
        throw null;
    }

    public static notifyAll values() {
        notifyAll notifyall = new notifyAll() { // from class: com.netcetera.threeds.sdk.infrastructure.getDeclaringClass.9
            private static int valueOf = 1;
            private static int values;

            @Override // com.netcetera.threeds.sdk.infrastructure.notifyAll
            public boolean values(C9651nr c9651nr, String str, boolean z) {
                int i = values;
                int i2 = i & 35;
                valueOf = (i2 + ((i ^ 35) | i2)) % 128;
                if (!z) {
                    boolean warnings = c9651nr.getWarnings(str);
                    int i3 = values + 79;
                    valueOf = i3 % 128;
                    if (i3 % 2 != 0) {
                        return warnings;
                    }
                    throw null;
                }
                valueOf = (((i | 73) << 1) - (i ^ 73)) % 128;
                boolean valueOf2 = C9669om.valueOf(c9651nr.values(str));
                valueOf = (values + 53) % 128;
                return valueOf2;
            }
        };
        ThreeDS2ServiceInstance = ((-2) - (~(values + 14))) % 128;
        return notifyall;
    }

    public static notifyAll ThreeDS2Service() {
        notifyAll notifyall = new notifyAll() { // from class: com.netcetera.threeds.sdk.infrastructure.getDeclaringClass.1
            private static int ThreeDS2Service = 1;
            public static long ThreeDS2ServiceInstance = 5295208192462177830L;
            private static int values;

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
                    long r5 = com.netcetera.threeds.sdk.infrastructure.getDeclaringClass.C94101.ThreeDS2ServiceInstance     // Catch: java.lang.Throwable -> L2e
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
                throw new UnsupportedOperationException("Method not decompiled: com.netcetera.threeds.sdk.infrastructure.getDeclaringClass.C94101.ThreeDS2Service(java.lang.String, int, java.lang.Object[]):void");
            }

            @Override // com.netcetera.threeds.sdk.infrastructure.notifyAll
            public boolean values(C9651nr c9651nr, String str, boolean z) {
                int i = ThreeDS2Service + 37;
                values = i % 128;
                int i2 = i % 2;
                long globalActionKeyTimeout = ViewConfiguration.getGlobalActionKeyTimeout();
                if (i2 != 0) {
                    Object[] objArr = new Object[1];
                    ThreeDS2Service("䙋˨켃衔哫ᄖ\uda41ꛟ指ⱕ\ue8ed", 2599 - (globalActionKeyTimeout > 0L ? 1 : (globalActionKeyTimeout == 0L ? 0 : -1)), objArr);
                    String intern = ((String) objArr[0]).intern();
                    String[] strArr = new String[0];
                    strArr[1] = keySet.ThreeDS2ServiceInstance.ThreeDS2Service();
                    return getDeclaringClass.ThreeDS2Service(c9651nr, intern, strArr, Boolean.valueOf(z));
                }
                Object[] objArr2 = new Object[1];
                ThreeDS2Service("䙋˨켃衔哫ᄖ\uda41ꛟ指ⱕ\ue8ed", 17580 - (globalActionKeyTimeout > 0L ? 1 : (globalActionKeyTimeout == 0L ? 0 : -1)), objArr2);
                return getDeclaringClass.ThreeDS2Service(c9651nr, ((String) objArr2[0]).intern(), new String[]{keySet.ThreeDS2ServiceInstance.ThreeDS2Service()}, Boolean.valueOf(z));
            }
        };
        int i = ThreeDS2ServiceInstance;
        int i2 = ((i & 4) + (i | 4)) - 1;
        values = i2 % 128;
        if (i2 % 2 != 0) {
            return notifyall;
        }
        throw null;
    }

    public static notifyAll get(final String str, final String... strArr) {
        notifyAll notifyall = new notifyAll() { // from class: com.netcetera.threeds.sdk.infrastructure.getDeclaringClass.6
            private static int valueOf = 1;
            private static int values;

            @Override // com.netcetera.threeds.sdk.infrastructure.notifyAll
            public boolean values(C9651nr c9651nr, String str2, boolean z) {
                int i = values;
                int i2 = i & 99;
                int i3 = -(-(i | 99));
                int i4 = (i2 ^ i3) + ((i3 & i2) << 1);
                valueOf = i4 % 128;
                int i5 = i4 % 2;
                String str3 = str;
                if (i5 != 0) {
                    boolean ThreeDS2Service = getDeclaringClass.ThreeDS2Service(c9651nr, str3, strArr, Boolean.valueOf(z));
                    int i6 = values;
                    int i7 = i6 & 75;
                    int i8 = i7 + ((i6 ^ 75) | i7);
                    valueOf = i8 % 128;
                    if (i8 % 2 == 0) {
                        int i9 = 1 / 0;
                    }
                    return ThreeDS2Service;
                }
                getDeclaringClass.ThreeDS2Service(c9651nr, str3, strArr, Boolean.valueOf(z));
                throw null;
            }
        };
        int i = values;
        int i2 = i & 61;
        int i3 = i2 + ((i ^ 61) | i2);
        ThreeDS2ServiceInstance = i3 % 128;
        if (i3 % 2 == 0) {
            return notifyall;
        }
        throw null;
    }

    public static notifyAll valueOf(final String... strArr) {
        notifyAll notifyall = new notifyAll() { // from class: com.netcetera.threeds.sdk.infrastructure.getDeclaringClass.4
            private static int ThreeDS2ServiceInstance = 0;
            public static int[] get = {504222554, 367479846, 2055901492, 1358833670, 213794144, -2046925368, -1306563982, 1507706982, -902348711, -64690770, -2121533345, -847337117, 24776503, -173743340, -530289074, 633858135, -987441018, 920993117};
            private static int values = 1;

            private static void get(int[] iArr, int i, Object[] objArr) {
                String str;
                synchronized (onError.ThreeDS2ServiceInstance) {
                    try {
                        char[] cArr = new char[4];
                        char[] cArr2 = new char[iArr.length << 1];
                        int[] iArr2 = (int[]) get.clone();
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

            @Override // com.netcetera.threeds.sdk.infrastructure.notifyAll
            public boolean values(C9651nr c9651nr, String str, boolean z) {
                int i = ThreeDS2ServiceInstance + 95;
                values = i % 128;
                int[] iArr = {246133542, -612080868, 1786626540, -1587624552, 907413366, 14289267};
                if (i % 2 == 0) {
                    Object[] objArr = new Object[1];
                    get(iArr, TextUtils.indexOf("", "", 1) + 8, objArr);
                    return getDeclaringClass.ThreeDS2Service(c9651nr, ((String) objArr[0]).intern(), strArr, Boolean.valueOf(z));
                }
                Object[] objArr2 = new Object[1];
                get(iArr, TextUtils.indexOf("", "", 0) + 9, objArr2);
                return getDeclaringClass.ThreeDS2Service(c9651nr, ((String) objArr2[0]).intern(), strArr, Boolean.valueOf(z));
            }
        };
        int i = ThreeDS2ServiceInstance;
        int i2 = ((i & 20) + (i | 20)) - 1;
        values = i2 % 128;
        if (i2 % 2 != 0) {
            return notifyall;
        }
        throw null;
    }

    public static notifyAll ThreeDS2Service(final String str) {
        notifyAll notifyall = new notifyAll() { // from class: com.netcetera.threeds.sdk.infrastructure.getDeclaringClass.8
            private static int get = 0;
            private static int valueOf = 1;

            @Override // com.netcetera.threeds.sdk.infrastructure.notifyAll
            public boolean values(C9651nr c9651nr, String str2, boolean z) {
                int i = valueOf;
                int i2 = i & 79;
                int i3 = (i ^ 79) | i2;
                get = ((i2 ^ i3) + ((i3 & i2) << 1)) % 128;
                boolean warnings = c9651nr.getWarnings(str);
                int i4 = valueOf;
                int i5 = i4 & 7;
                int i6 = -(-((i4 ^ 7) | i5));
                int i7 = (i5 & i6) + (i6 | i5);
                get = i7 % 128;
                if (i7 % 2 == 0) {
                    return warnings;
                }
                throw null;
            }
        };
        int i = ThreeDS2ServiceInstance;
        int i2 = ((((i ^ 27) | (i & 27)) << 1) - (~(-(((~i) & 27) | (i & (-28)))))) - 1;
        values = i2 % 128;
        if (i2 % 2 == 0) {
            int i3 = 40 / 0;
        }
        return notifyall;
    }

    public static notifyAll valueOf(final String str) {
        notifyAll notifyall = new notifyAll() { // from class: com.netcetera.threeds.sdk.infrastructure.getDeclaringClass.10
            private static int valueOf = 1;
            private static int values;

            /* JADX WARN: Code restructure failed: missing block: B:10:0x0030, code lost:
                if ((r4 % 2) == 0) goto L7;
             */
            /* JADX WARN: Code restructure failed: missing block: B:12:0x0033, code lost:
                r5 = true;
             */
            /* JADX WARN: Code restructure failed: missing block: B:13:0x0034, code lost:
                com.netcetera.threeds.sdk.infrastructure.getDeclaringClass.C941110.valueOf = ((((r3 | 88) << 1) - (r3 ^ 88)) - 1) % 128;
             */
            /* JADX WARN: Code restructure failed: missing block: B:14:0x0040, code lost:
                r3 = com.netcetera.threeds.sdk.infrastructure.getDeclaringClass.C941110.values;
                r1 = r3 & 39;
                r4 = ((r3 ^ 39) | r1) << 1;
                r3 = -((r3 | 39) & (~r1));
                com.netcetera.threeds.sdk.infrastructure.getDeclaringClass.C941110.valueOf = ((r4 & r3) + (r3 | r4)) % 128;
             */
            /* JADX WARN: Code restructure failed: missing block: B:5:0x0018, code lost:
                if ((!r3.getWarnings(r1)) != true) goto L12;
             */
            /* JADX WARN: Code restructure failed: missing block: B:8:0x0021, code lost:
                if (r3.getWarnings(r1) == false) goto L5;
             */
            /* JADX WARN: Code restructure failed: missing block: B:9:0x0023, code lost:
                r3 = com.netcetera.threeds.sdk.infrastructure.getDeclaringClass.C941110.valueOf;
                r4 = (r3 & 61) + (r3 | 61);
                r3 = r4 % 128;
                com.netcetera.threeds.sdk.infrastructure.getDeclaringClass.C941110.values = r3;
             */
            @Override // com.netcetera.threeds.sdk.infrastructure.notifyAll
            /*
                Code decompiled incorrectly, please refer to instructions dump.
                To view partially-correct code enable 'Show inconsistent code' option in preferences
            */
            public boolean values(com.netcetera.threeds.sdk.infrastructure.C9651nr r3, java.lang.String r4, boolean r5) {
                /*
                    r2 = this;
                    int r4 = com.netcetera.threeds.sdk.infrastructure.getDeclaringClass.C941110.values
                    int r4 = r4 + 51
                    int r5 = r4 % 128
                    com.netcetera.threeds.sdk.infrastructure.getDeclaringClass.C941110.valueOf = r5
                    int r4 = r4 % 2
                    r5 = 0
                    r0 = 1
                    if (r4 != 0) goto L1b
                    java.lang.String r4 = r1
                    boolean r3 = r3.getWarnings(r4)
                    r4 = 49
                    int r4 = r4 / r5
                    r3 = r3 ^ r0
                    if (r3 == r0) goto L23
                    goto L40
                L1b:
                    java.lang.String r4 = r1
                    boolean r3 = r3.getWarnings(r4)
                    if (r3 != 0) goto L40
                L23:
                    int r3 = com.netcetera.threeds.sdk.infrastructure.getDeclaringClass.C941110.valueOf
                    r4 = r3 & 61
                    r3 = r3 | 61
                    int r4 = r4 + r3
                    int r3 = r4 % 128
                    com.netcetera.threeds.sdk.infrastructure.getDeclaringClass.C941110.values = r3
                    int r4 = r4 % 2
                    if (r4 == 0) goto L33
                    goto L34
                L33:
                    r5 = 1
                L34:
                    r4 = r3 | 88
                    int r4 = r4 << r0
                    r3 = r3 ^ 88
                    int r4 = r4 - r3
                    int r4 = r4 - r0
                    int r4 = r4 % 128
                    com.netcetera.threeds.sdk.infrastructure.getDeclaringClass.C941110.valueOf = r4
                    goto L55
                L40:
                    int r3 = com.netcetera.threeds.sdk.infrastructure.getDeclaringClass.C941110.values
                    r4 = r3 ^ 39
                    r1 = r3 & 39
                    r4 = r4 | r1
                    int r4 = r4 << r0
                    int r1 = ~r1
                    r3 = r3 | 39
                    r3 = r3 & r1
                    int r3 = -r3
                    r1 = r4 & r3
                    r3 = r3 | r4
                    int r1 = r1 + r3
                    int r1 = r1 % 128
                    com.netcetera.threeds.sdk.infrastructure.getDeclaringClass.C941110.valueOf = r1
                L55:
                    int r3 = com.netcetera.threeds.sdk.infrastructure.getDeclaringClass.C941110.values
                    r4 = r3 & (-30)
                    int r1 = ~r3
                    r1 = r1 & 29
                    r4 = r4 | r1
                    r3 = r3 & 29
                    int r3 = r3 << r0
                    int r4 = r4 + r3
                    int r4 = r4 % 128
                    com.netcetera.threeds.sdk.infrastructure.getDeclaringClass.C941110.valueOf = r4
                    return r5
                */
                throw new UnsupportedOperationException("Method not decompiled: com.netcetera.threeds.sdk.infrastructure.getDeclaringClass.C941110.values(com.netcetera.threeds.sdk.infrastructure.nr, java.lang.String, boolean):boolean");
            }
        };
        int i = ThreeDS2ServiceInstance;
        values = (((i | 97) << 1) - (i ^ 97)) % 128;
        return notifyall;
    }

    private static boolean valueOf(C9651nr c9651nr, String str, String[] strArr, Boolean bool) {
        int i = values;
        int i2 = ((i & 7) - (~(i | 7))) - 1;
        ThreeDS2ServiceInstance = i2 % 128;
        if (i2 % 2 == 0) {
            String values2 = c9651nr.values(str);
            if (values2 != null) {
                boolean z = C9615nd.get(strArr, values2, bool.booleanValue());
                int i3 = values;
                int i4 = i3 & 109;
                ThreeDS2ServiceInstance = (((i3 | 109) & (~i4)) + (i4 << 1)) % 128;
                return z;
            }
            int i5 = values;
            int i6 = ((((i5 ^ 97) | (i5 & 97)) << 1) - (~(-(((~i5) & 97) | (i5 & (-98)))))) - 1;
            ThreeDS2ServiceInstance = i6 % 128;
            if (i6 % 2 == 0) {
                return false;
            }
            throw null;
        }
        c9651nr.values(str);
        throw null;
    }
}

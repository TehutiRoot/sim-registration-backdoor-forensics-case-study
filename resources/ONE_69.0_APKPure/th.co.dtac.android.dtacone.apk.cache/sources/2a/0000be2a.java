package com.netcetera.threeds.sdk.infrastructure;

import android.graphics.Color;
import android.media.AudioTrack;
import android.os.SystemClock;
import android.text.TextUtils;
import android.util.TypedValue;
import android.view.KeyEvent;
import android.view.ViewConfiguration;
import android.widget.ExpandableListView;

/* loaded from: classes5.dex */
public interface setFastScrollEnabled {

    /* JADX WARN: Enum visitor error
    jadx.core.utils.exceptions.JadxRuntimeException: Init of enum get uses external variables
    	at jadx.core.dex.visitors.EnumVisitor.createEnumFieldByConstructor(EnumVisitor.java:444)
    	at jadx.core.dex.visitors.EnumVisitor.processEnumFieldByRegister(EnumVisitor.java:391)
    	at jadx.core.dex.visitors.EnumVisitor.extractEnumFieldsFromFilledArray(EnumVisitor.java:320)
    	at jadx.core.dex.visitors.EnumVisitor.extractEnumFieldsFromInsn(EnumVisitor.java:258)
    	at jadx.core.dex.visitors.EnumVisitor.convertToEnum(EnumVisitor.java:151)
    	at jadx.core.dex.visitors.EnumVisitor.visit(EnumVisitor.java:100)
     */
    /* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
    /* loaded from: classes5.dex */
    public static final class ThreeDS2ServiceInstance {
        public static final ThreeDS2ServiceInstance ThreeDS2Service;
        public static long ThreeDS2ServiceInstance = 0;
        public static final ThreeDS2ServiceInstance get;
        private static int getSDKInfo = 0;
        private static int getSDKVersion = 1;
        private static final /* synthetic */ ThreeDS2ServiceInstance[] valueOf;
        private final String values;

        static {
            ThreeDS2ServiceInstance();
            Object[] objArr = new Object[1];
            valueOf("⊡⋥咷㣺꽋襃菡㞜吜", (SystemClock.uptimeMillis() > 0L ? 1 : (SystemClock.uptimeMillis() == 0L ? 0 : -1)) - 1, objArr);
            String intern = ((String) objArr[0]).intern();
            Object[] objArr2 = new Object[1];
            valueOf("谝谬ﺱㇴ맔⌽誅", Color.blue(0), objArr2);
            ThreeDS2ServiceInstance threeDS2ServiceInstance = new ThreeDS2ServiceInstance(intern, 0, ((String) objArr2[0]).intern());
            get = threeDS2ServiceInstance;
            Object[] objArr3 = new Object[1];
            valueOf("䓱䒵䞮鐫효驚⼰乿㉏", KeyEvent.getDeadChar(0, 0), objArr3);
            String intern2 = ((String) objArr3[0]).intern();
            Object[] objArr4 = new Object[1];
            valueOf("乕乤ܔູ珣\uda98뗋", ViewConfiguration.getTapTimeout() >> 16, objArr4);
            ThreeDS2ServiceInstance threeDS2ServiceInstance2 = new ThreeDS2ServiceInstance(intern2, 1, ((String) objArr4[0]).intern());
            ThreeDS2Service = threeDS2ServiceInstance2;
            valueOf = new ThreeDS2ServiceInstance[]{threeDS2ServiceInstance, threeDS2ServiceInstance2};
            int i = getSDKInfo + 95;
            getSDKVersion = i % 128;
            if (i % 2 != 0) {
                return;
            }
            throw null;
        }

        private ThreeDS2ServiceInstance(String str, int i, String str2) {
            this.values = str2;
        }

        public static void ThreeDS2ServiceInstance() {
            ThreeDS2ServiceInstance = 3350524797862337954L;
        }

        public static ThreeDS2ServiceInstance valueOf(String str) {
            getSDKVersion = (getSDKInfo + 57) % 128;
            ThreeDS2ServiceInstance threeDS2ServiceInstance = (ThreeDS2ServiceInstance) Enum.valueOf(ThreeDS2ServiceInstance.class, str);
            int i = getSDKVersion + 33;
            getSDKInfo = i % 128;
            if (i % 2 != 0) {
                int i2 = 59 / 0;
            }
            return threeDS2ServiceInstance;
        }

        public static ThreeDS2ServiceInstance[] values() {
            getSDKInfo = (getSDKVersion + 31) % 128;
            ThreeDS2ServiceInstance[] threeDS2ServiceInstanceArr = (ThreeDS2ServiceInstance[]) valueOf.clone();
            getSDKInfo = (getSDKVersion + 43) % 128;
            return threeDS2ServiceInstanceArr;
        }

        public String valueOf() {
            int i = getSDKInfo + 115;
            getSDKVersion = i % 128;
            if (i % 2 == 0) {
                int i2 = 24 / 0;
                return this.values;
            }
            return this.values;
        }

        /* JADX WARN: Code restructure failed: missing block: B:0:?, code lost:
            r8 = r8;
         */
        /*
            Code decompiled incorrectly, please refer to instructions dump.
            To view partially-correct code enable 'Show inconsistent code' option in preferences
        */
        private static void valueOf(java.lang.String r8, int r9, java.lang.Object[] r10) {
            /*
                if (r8 == 0) goto L6
                char[] r8 = r8.toCharArray()
            L6:
                char[] r8 = (char[]) r8
                java.lang.Object r0 = com.netcetera.threeds.sdk.infrastructure.getWarnings.valueOf
                monitor-enter(r0)
                long r1 = com.netcetera.threeds.sdk.infrastructure.setFastScrollEnabled.ThreeDS2ServiceInstance.ThreeDS2ServiceInstance     // Catch: java.lang.Throwable -> L3a
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
                long r6 = com.netcetera.threeds.sdk.infrastructure.setFastScrollEnabled.ThreeDS2ServiceInstance.ThreeDS2ServiceInstance     // Catch: java.lang.Throwable -> L3a
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
            throw new UnsupportedOperationException("Method not decompiled: com.netcetera.threeds.sdk.infrastructure.setFastScrollEnabled.ThreeDS2ServiceInstance.valueOf(java.lang.String, int, java.lang.Object[]):void");
        }
    }

    /* JADX WARN: Enum visitor error
    jadx.core.utils.exceptions.JadxRuntimeException: Init of enum valueOf uses external variables
    	at jadx.core.dex.visitors.EnumVisitor.createEnumFieldByConstructor(EnumVisitor.java:444)
    	at jadx.core.dex.visitors.EnumVisitor.processEnumFieldByRegister(EnumVisitor.java:391)
    	at jadx.core.dex.visitors.EnumVisitor.extractEnumFieldsFromFilledArray(EnumVisitor.java:320)
    	at jadx.core.dex.visitors.EnumVisitor.extractEnumFieldsFromInsn(EnumVisitor.java:258)
    	at jadx.core.dex.visitors.EnumVisitor.convertToEnum(EnumVisitor.java:151)
    	at jadx.core.dex.visitors.EnumVisitor.visit(EnumVisitor.java:100)
     */
    /* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
    /* loaded from: classes5.dex */
    public static final class valueOf {
        public static int ThreeDS2Service = 0;
        public static final valueOf ThreeDS2ServiceInstance;
        public static final valueOf get;
        private static int getSDKInfo = 0;
        public static char getSDKVersion = 0;
        private static int getWarnings = 1;
        private static final /* synthetic */ valueOf[] initialize;
        public static final valueOf valueOf;
        public static long values;
        private final String cleanup;

        static {
            ThreeDS2ServiceInstance();
            Object[] objArr = new Object[1];
            get(KeyEvent.normalizeMetaState(0), (char) (26826 - (SystemClock.uptimeMillis() > 0L ? 1 : (SystemClock.uptimeMillis() == 0L ? 0 : -1))), "\uf2d9岉쁎컔", "\ue1d4瓫쥋쁨", "ᠳ뽭\uedf2탄", objArr);
            String intern = ((String) objArr[0]).intern();
            Object[] objArr2 = new Object[1];
            get(TextUtils.lastIndexOf("", '0', 0) + 461898506, (char) (62559 - (SystemClock.elapsedRealtimeNanos() > 0L ? 1 : (SystemClock.elapsedRealtimeNanos() == 0L ? 0 : -1))), "餺梩퐌\udef8簔", "ो蠃帛竴", "ᠳ뽭\uedf2탄", objArr2);
            valueOf valueof = new valueOf(intern, 0, ((String) objArr2[0]).intern());
            valueOf = valueof;
            Object[] objArr3 = new Object[1];
            get(1 - (ViewConfiguration.getScrollFriction() > 0.0f ? 1 : (ViewConfiguration.getScrollFriction() == 0.0f ? 0 : -1)), (char) ((ViewConfiguration.getMaximumFlingVelocity() >> 16) + 55891), "\uf0ff絆\ue80d䰟", "\uec3a鱝厞䋚", "ᠳ뽭\uedf2탄", objArr3);
            String intern2 = ((String) objArr3[0]).intern();
            Object[] objArr4 = new Object[1];
            get(86020437 - (TypedValue.complexToFraction(0, 0.0f, 0.0f) > 0.0f ? 1 : (TypedValue.complexToFraction(0, 0.0f, 0.0f) == 0.0f ? 0 : -1)), (char) (17149 - TextUtils.lastIndexOf("", '0')), "鄗䞝畝陻ὼ", "嗭ₑ︅坂", "ᠳ뽭\uedf2탄", objArr4);
            valueOf valueof2 = new valueOf(intern2, 1, ((String) objArr4[0]).intern());
            ThreeDS2ServiceInstance = valueof2;
            Object[] objArr5 = new Object[1];
            get(Color.blue(0), (char) ((AudioTrack.getMinVolume() > 0.0f ? 1 : (AudioTrack.getMinVolume() == 0.0f ? 0 : -1)) + 14541), "搦ᅐ괳\ue056", "엒Ｄ췂븸", "ᠳ뽭\uedf2탄", objArr5);
            String intern3 = ((String) objArr5[0]).intern();
            Object[] objArr6 = new Object[1];
            get(1721257972 - (TypedValue.complexToFraction(0, 0.0f, 0.0f) > 0.0f ? 1 : (TypedValue.complexToFraction(0, 0.0f, 0.0f) == 0.0f ? 0 : -1)), (char) (ExpandableListView.getPackedPositionChild(0L) + 24936), "앷搼呂憓\uab27", "\uf430顏杦\udf61", "ᠳ뽭\uedf2탄", objArr6);
            valueOf valueof3 = new valueOf(intern3, 2, ((String) objArr6[0]).intern());
            get = valueof3;
            initialize = new valueOf[]{valueof, valueof2, valueof3};
            getWarnings = (getSDKInfo + 85) % 128;
        }

        private valueOf(String str, int i, String str2) {
            this.cleanup = str2;
        }

        public static void ThreeDS2ServiceInstance() {
            ThreeDS2Service = 0;
            getSDKVersion = (char) 0;
            values = -3403333791535785933L;
        }

        /* JADX WARN: Code restructure failed: missing block: B:0:?, code lost:
            r12 = r12;
         */
        /*
            Code decompiled incorrectly, please refer to instructions dump.
            To view partially-correct code enable 'Show inconsistent code' option in preferences
        */
        private static void get(int r8, char r9, java.lang.String r10, java.lang.String r11, java.lang.String r12, java.lang.Object[] r13) {
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
                long r6 = com.netcetera.threeds.sdk.infrastructure.setFastScrollEnabled.valueOf.values     // Catch: java.lang.Throwable -> L7c
                long r4 = r4 ^ r6
                int r2 = com.netcetera.threeds.sdk.infrastructure.setFastScrollEnabled.valueOf.ThreeDS2Service     // Catch: java.lang.Throwable -> L7c
                long r6 = (long) r2     // Catch: java.lang.Throwable -> L7c
                long r4 = r4 ^ r6
                char r2 = com.netcetera.threeds.sdk.infrastructure.setFastScrollEnabled.valueOf.getSDKVersion     // Catch: java.lang.Throwable -> L7c
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
            throw new UnsupportedOperationException("Method not decompiled: com.netcetera.threeds.sdk.infrastructure.setFastScrollEnabled.valueOf.get(int, char, java.lang.String, java.lang.String, java.lang.String, java.lang.Object[]):void");
        }

        public static valueOf valueOf(String str) {
            getSDKInfo = (getWarnings + 35) % 128;
            valueOf valueof = (valueOf) Enum.valueOf(valueOf.class, str);
            int i = getSDKInfo + 45;
            getWarnings = i % 128;
            if (i % 2 == 0) {
                int i2 = 94 / 0;
            }
            return valueof;
        }

        public static valueOf[] values() {
            valueOf[] valueofArr;
            int i = getSDKInfo + 93;
            getWarnings = i % 128;
            if (i % 2 == 0) {
                valueofArr = (valueOf[]) initialize.clone();
                int i2 = 81 / 0;
            } else {
                valueofArr = (valueOf[]) initialize.clone();
            }
            getSDKInfo = (getWarnings + 11) % 128;
            return valueofArr;
        }

        public String ThreeDS2Service() {
            int i = (getSDKInfo + 21) % 128;
            getWarnings = i;
            String str = this.cleanup;
            int i2 = i + 41;
            getSDKInfo = i2 % 128;
            if (i2 % 2 != 0) {
                int i3 = 97 / 0;
            }
            return str;
        }
    }

    valueOf ThreeDS2ServiceInstance();

    valueOf valueOf(String str);

    ThreeDS2ServiceInstance values();
}
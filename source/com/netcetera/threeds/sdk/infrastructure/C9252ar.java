package com.netcetera.threeds.sdk.infrastructure;

import android.content.Context;
import android.graphics.Color;
import android.media.AudioTrack;
import android.os.SystemClock;
import android.text.TextUtils;
import android.view.MotionEvent;
import android.view.View;
import android.view.ViewConfiguration;
import android.widget.LinearLayout;
import android.widget.TextView;
import kotlin.text.Typography;
import kotlinx.serialization.json.internal.AbstractJsonLexerKt;

/* renamed from: com.netcetera.threeds.sdk.infrastructure.ar */
/* loaded from: classes5.dex */
public class C9252ar extends AbstractC9758w<LinearLayout> implements save {
    private static final String ConfigParameters;
    public static int ThreeDS2Service = 0;
    private static final String ThreeDS2ServiceInstance;
    private static int addParam = 0;
    public static char get = 0;
    private static int getParamValue = 1;
    private static final String getWarnings;
    private static final String initialize;
    public static long valueOf;
    public static char[] values;
    private boolean ConfigurationBuilder;
    private final setProperty ThreeDS2Service$InitializationCallback;
    private TextView apiKey;
    private final InterfaceC9511jo createTransaction;
    private TextView onCompleted;
    private final valueOf onError;
    private TextView removeParam;

    /* renamed from: com.netcetera.threeds.sdk.infrastructure.ar$3 */
    /* loaded from: classes5.dex */
    public static /* synthetic */ class C92533 {
        private static int ThreeDS2ServiceInstance = 0;
        private static int get = 1;
        static final /* synthetic */ int[] values;

        static {
            int[] iArr = new int[valueOf.values().length];
            values = iArr;
            try {
                iArr[valueOf.ThreeDS2Service.ordinal()] = 1;
                int i = get;
                int i2 = i ^ 121;
                ThreeDS2ServiceInstance = ((((i & 121) | i2) << 1) - i2) % 128;
            } catch (NoSuchFieldError unused) {
            }
            try {
                values[valueOf.valueOf.ordinal()] = 2;
                int i3 = ThreeDS2ServiceInstance;
                get = (((i3 & 110) + (i3 | 110)) - 1) % 128;
            } catch (NoSuchFieldError unused2) {
            }
            int i4 = get;
            int i5 = i4 & 87;
            int i6 = -(-(i4 | 87));
            int i7 = (i5 ^ i6) + ((i6 & i5) << 1);
            ThreeDS2ServiceInstance = i7 % 128;
            if (i7 % 2 != 0) {
                int i8 = 32 / 0;
            }
        }
    }

    /* JADX WARN: Enum visitor error
    jadx.core.utils.exceptions.JadxRuntimeException: Init of enum ThreeDS2Service uses external variables
    	at jadx.core.dex.visitors.EnumVisitor.createEnumFieldByConstructor(EnumVisitor.java:444)
    	at jadx.core.dex.visitors.EnumVisitor.processEnumFieldByRegister(EnumVisitor.java:391)
    	at jadx.core.dex.visitors.EnumVisitor.extractEnumFieldsFromFilledArray(EnumVisitor.java:320)
    	at jadx.core.dex.visitors.EnumVisitor.extractEnumFieldsFromInsn(EnumVisitor.java:258)
    	at jadx.core.dex.visitors.EnumVisitor.convertToEnum(EnumVisitor.java:151)
    	at jadx.core.dex.visitors.EnumVisitor.visit(EnumVisitor.java:100)
     */
    /* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
    /* renamed from: com.netcetera.threeds.sdk.infrastructure.ar$valueOf */
    /* loaded from: classes5.dex */
    public static final class valueOf {
        public static final valueOf ThreeDS2Service;
        public static char ThreeDS2ServiceInstance = 0;
        public static char get = 0;
        public static char getSDKInfo = 0;
        private static int getSDKVersion = 1;
        private static int getWarnings;
        private static final /* synthetic */ valueOf[] initialize;
        public static final valueOf valueOf;
        public static char values;

        static {
            ThreeDS2ServiceInstance();
            Object[] objArr = new Object[1];
            valueOf("쨒䏷鳥\uef7e♥ꢮ贠쌏", (ViewConfiguration.getJumpTapTimeout() >> 16) + 7, objArr);
            valueOf valueof = new valueOf(((String) objArr[0]).intern(), 0);
            ThreeDS2Service = valueof;
            Object[] objArr2 = new Object[1];
            valueOf("\u20c8산壄獲ﰖ鋸㱤爩競征", MotionEvent.axisFromString("") + 11, objArr2);
            valueOf valueof2 = new valueOf(((String) objArr2[0]).intern(), 1);
            valueOf = valueof2;
            initialize = new valueOf[]{valueof, valueof2};
            int i = getWarnings + 69;
            getSDKVersion = i % 128;
            if (i % 2 == 0) {
                int i2 = 87 / 0;
            }
        }

        private valueOf(String str, int i) {
        }

        public static void ThreeDS2ServiceInstance() {
            values = (char) 27734;
            ThreeDS2ServiceInstance = (char) 9923;
            getSDKInfo = (char) 31738;
            get = (char) 39297;
        }

        public static valueOf valueOf(String str) {
            getSDKVersion = (getWarnings + 43) % 128;
            valueOf valueof = (valueOf) Enum.valueOf(valueOf.class, str);
            getSDKVersion = (getWarnings + 55) % 128;
            return valueof;
        }

        public static valueOf[] values() {
            int i = getWarnings + 63;
            getSDKVersion = i % 128;
            if (i % 2 != 0) {
                valueOf[] valueofArr = (valueOf[]) initialize.clone();
                int i2 = getSDKVersion + 33;
                getWarnings = i2 % 128;
                if (i2 % 2 != 0) {
                    int i3 = 70 / 0;
                }
                return valueofArr;
            }
            initialize.clone();
            throw null;
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
                char r11 = com.netcetera.threeds.sdk.infrastructure.C9252ar.valueOf.get     // Catch: java.lang.Throwable -> L5b
                int r10 = r10 + r11
                r9 = r9 ^ r10
                int r10 = r8 >>> 5
                char r11 = com.netcetera.threeds.sdk.infrastructure.C9252ar.valueOf.getSDKInfo     // Catch: java.lang.Throwable -> L5b
                int r10 = r10 + r11
                r9 = r9 ^ r10
                int r7 = r7 - r9
                char r7 = (char) r7     // Catch: java.lang.Throwable -> L5b
                r3[r5] = r7     // Catch: java.lang.Throwable -> L5b
                int r9 = r7 + r4
                int r10 = r7 << 4
                char r11 = com.netcetera.threeds.sdk.infrastructure.C9252ar.valueOf.values     // Catch: java.lang.Throwable -> L5b
                int r10 = r10 + r11
                r9 = r9 ^ r10
                int r7 = r7 >>> 5
                char r10 = com.netcetera.threeds.sdk.infrastructure.C9252ar.valueOf.ThreeDS2ServiceInstance     // Catch: java.lang.Throwable -> L5b
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
            throw new UnsupportedOperationException("Method not decompiled: com.netcetera.threeds.sdk.infrastructure.C9252ar.valueOf.valueOf(java.lang.String, int, java.lang.Object[]):void");
        }
    }

    static {
        ThreeDS2ServiceInstance();
        Object[] objArr = new Object[1];
        valueOf("\u0000", new int[]{188, 1, 96, 0}, true, objArr);
        ConfigParameters = ((String) objArr[0]).intern();
        Object[] objArr2 = new Object[1];
        ThreeDS2ServiceInstance(1222723090 - Color.green(0), (char) (1234 - (ViewConfiguration.getScrollBarFadeDuration() >> 16)), "ꐃ", "\u1249\ue146퉈꜄", "絜㢴牟娥", objArr2);
        initialize = ((String) objArr2[0]).intern();
        Object[] objArr3 = new Object[1];
        valueOf("\u0001\u0001\u0001\u0000\u0001\u0000\u0001\u0000\u0001\u0001\u0000\u0001\u0001\u0001\u0001\u0001\u0000\u0000\u0000\u0000\u0000\u0001\u0000\u0001\u0001", new int[]{163, 25, 1, 20}, false, objArr3);
        getWarnings = ((String) objArr3[0]).intern();
        Object[] objArr4 = new Object[1];
        valueOf("\u0000\u0000\u0000\u0000\u0000\u0001\u0001\u0001\u0001\u0001\u0000\u0001\u0001\u0000\u0001\u0000\u0001\u0000\u0001\u0000\u0001\u0001", new int[]{141, 22, 77, 0}, true, objArr4);
        ThreeDS2ServiceInstance = ((String) objArr4[0]).intern();
        int i = getParamValue + 119;
        addParam = i % 128;
        if (i % 2 != 0) {
            throw null;
        }
    }

    public C9252ar(Context context, valueOf valueof, InterfaceC9511jo interfaceC9511jo, setProperty setproperty) {
        super(context);
        this.createTransaction = interfaceC9511jo;
        this.onError = valueof;
        this.ThreeDS2Service$InitializationCallback = setproperty;
        this.ConfigurationBuilder = false;
    }

    public static void ThreeDS2ServiceInstance() {
        ThreeDS2Service = 0;
        get = (char) 0;
        valueOf = 6495723790850620764L;
        values = new char[]{'6', 'h', 'c', 'a', 'f', 'e', 'g', 'j', 'j', 'k', 'd', 'l', 'p', 'o', 'k', 'd', 'o', 'j', 'b', 'f', 'j', 'i', 'h', 'l', 'f', 'd', 'e', '/', 'g', 'j', 'j', 'k', 'd', 'l', 'p', 'o', 'k', 'd', 'o', 'j', 'b', 'f', 'j', 'i', 'h', 'l', 'f', 'd', 'e', 'k', 'v', 'n', 'l', '6', 'f', 'a', 'c', 'h', 'g', 'e', 'd', 'f', 'l', 'h', 'i', 'j', 'f', 'b', 'j', 'o', 'd', 'b', 'n', 't', 'h', 'g', 'i', 'a', 'd', 'k', 'j', 'j', 'g', Typography.nbsp, 155, 171, 173, 164, 168, 151, Typography.section, 158, 166, 161, 151, 156, 166, 153, 168, Typography.degree, 157, 151, 161, 173, 151, 157, 159, 166, 157, 164, 164, 153, '1', 'e', 'd', 'f', 'l', 'h', 'i', 'j', 'f', 'b', 'j', 'o', 'd', 'b', 'n', 't', 'h', 'g', 'i', 'a', 'd', 'k', 'j', 'j', 'g', 'i', 'l', 'n', 'v', 'c', 188, 165, 172, 193, 193, Typography.middleDot, Typography.middleDot, Typography.degree, 168, Typography.paragraph, 180, 181, 193, 171, Typography.section, Typography.middleDot, Typography.middleDot, 168, Typography.registered, Typography.half, 172, '2', 'W', '\\', 'k', 'k', AbstractJsonLexerKt.BEGIN_LIST, '_', AbstractJsonLexerKt.UNICODE_ESC, 'i', 'h', 'j', '\\', 'd', 'k', 'k', AbstractJsonLexerKt.UNICODE_ESC, AbstractJsonLexerKt.UNICODE_ESC, '`', 'Y', 'p', '`', '_', AbstractJsonLexerKt.UNICODE_ESC, 'i', 'h', 4409};
    }

    public static /* synthetic */ void valueOf(C9252ar c9252ar, View view) {
        addParam = (getParamValue + 63) % 128;
        c9252ar.get(view);
        addParam = (getParamValue + 65) % 128;
    }

    @Override // com.netcetera.threeds.sdk.infrastructure.AbstractC9758w
    public /* synthetic */ LinearLayout get(Context context) {
        getParamValue = (addParam + 17) % 128;
        LinearLayout values2 = values(context);
        getParamValue = (addParam + 95) % 128;
        return values2;
    }

    public LinearLayout values(Context context) {
        LinearLayout linearLayout = new LinearLayout(context);
        linearLayout.setLayoutParams(new LinearLayout.LayoutParams(-1, -2));
        linearLayout.setGravity(16);
        linearLayout.setOrientation(1);
        LinearLayout.LayoutParams layoutParams = new LinearLayout.LayoutParams(-1, -2);
        LinearLayout linearLayout2 = new LinearLayout(context);
        linearLayout2.setLayoutParams(layoutParams);
        linearLayout2.setOrientation(0);
        linearLayout2.setMinimumHeight(C9375et.getSDKInfo);
        linearLayout2.setGravity(16);
        LinearLayout.LayoutParams layoutParams2 = new LinearLayout.LayoutParams(-1, -2, 1.0f);
        TextView textView = new TextView(context);
        this.onCompleted = textView;
        textView.setLayoutParams(layoutParams2);
        TextView textView2 = this.onCompleted;
        int i = C9375et.getWarnings;
        int i2 = C9375et.ThreeDS2ServiceInstance;
        textView2.setPadding(i, i2, i, i2);
        LinearLayout.LayoutParams layoutParams3 = new LinearLayout.LayoutParams(-2, -2);
        TextView textView3 = new TextView(context);
        this.removeParam = textView3;
        Object[] objArr = new Object[1];
        ThreeDS2ServiceInstance((AudioTrack.getMaxVolume() > 0.0f ? 1 : (AudioTrack.getMaxVolume() == 0.0f ? 0 : -1)) + 1222723089, (char) (1234 - (ViewConfiguration.getFadingEdgeLength() >> 16)), "ꐃ", "\u1249\ue146퉈꜄", "絜㢴牟娥", objArr);
        textView3.setText(((String) objArr[0]).intern());
        TextView textView4 = this.removeParam;
        Object[] objArr2 = new Object[1];
        ThreeDS2ServiceInstance((-1454559052) - (ViewConfiguration.getTapTimeout() >> 16), (char) (3698 - TextUtils.indexOf((CharSequence) "", '0', 0, 0)), "\ue43e", "됭䴰玩崎", "絜㢴牟娥", objArr2);
        textView4.setContentDescription(((String) objArr2[0]).intern());
        this.removeParam.setTypeface(null, 1);
        this.removeParam.setLayoutParams(layoutParams3);
        this.removeParam.setPadding(i, i2, i, i2);
        linearLayout2.addView(this.onCompleted);
        linearLayout2.addView(this.removeParam);
        TextView textView5 = new TextView(context);
        this.apiKey = textView5;
        textView5.setTextSize(0, this.onCompleted.getTextSize() * 0.9f);
        this.apiKey.setPadding(i, 0, i, i2);
        linearLayout2.setOnClickListener(new View$OnClickListenerC9249ao(this));
        linearLayout.addView(linearLayout2);
        linearLayout.addView(this.apiKey);
        int i3 = C92533.values[this.onError.ordinal()];
        if (i3 == 1) {
            View view = this.onCompleted;
            Object[] objArr3 = new Object[1];
            valueOf("\u0000\u0001\u0001\u0001\u0001\u0001\u0000\u0001\u0000\u0001\u0000\u0000\u0001\u0001\u0000\u0000\u0000\u0000\u0000\u0000\u0001\u0001\u0001\u0000\u0001\u0001\u0001", new int[]{0, 27, 0, 0}, true, objArr3);
            values(view, ((String) objArr3[0]).intern());
            Object[] objArr4 = new Object[1];
            ThreeDS2ServiceInstance(Color.blue(0), (char) (52157 - (SystemClock.elapsedRealtimeNanos() > 0L ? 1 : (SystemClock.elapsedRealtimeNanos() == 0L ? 0 : -1))), "椘␏匶츎\ue06b\udfdcﻞ哾✬념삚⮎澥莜巽뺽ឺ佞퀒邹峟왵턄멵䨷먾", "ꔾㆭ볳\ue8cb", "絜㢴牟娥", objArr4);
            values(linearLayout2, ((String) objArr4[0]).intern());
            View view2 = this.apiKey;
            Object[] objArr5 = new Object[1];
            valueOf("\u0001\u0000\u0001\u0000\u0001\u0000\u0000\u0001\u0001\u0000\u0000\u0000\u0000\u0000\u0000\u0001\u0001\u0001\u0000\u0001\u0001\u0001\u0001\u0000\u0001\u0001", new int[]{27, 26, 0, 22}, true, objArr5);
            values(view2, ((String) objArr5[0]).intern());
        } else if (i3 == 2) {
            View view3 = this.onCompleted;
            Object[] objArr6 = new Object[1];
            valueOf("\u0000\u0001\u0001\u0001\u0001\u0001\u0001\u0001\u0001\u0000\u0001\u0001\u0001\u0000\u0000\u0000\u0000\u0000\u0000\u0001\u0000\u0001\u0001\u0000\u0001\u0000\u0001\u0000\u0001\u0000", new int[]{53, 30, 0, 5}, false, objArr6);
            values(view3, ((String) objArr6[0]).intern());
            Object[] objArr7 = new Object[1];
            valueOf(null, new int[]{83, 29, 56, 2}, true, objArr7);
            values(linearLayout2, ((String) objArr7[0]).intern());
            View view4 = this.apiKey;
            Object[] objArr8 = new Object[1];
            valueOf("\u0001\u0001\u0001\u0001\u0000\u0001\u0001\u0001\u0000\u0000\u0000\u0000\u0000\u0000\u0001\u0000\u0001\u0001\u0000\u0001\u0000\u0001\u0000\u0001\u0000\u0001\u0001\u0001\u0000", new int[]{112, 29, 0, 0}, false, objArr8);
            values(view4, ((String) objArr8[0]).intern());
        }
        C9377ev.values(this.onCompleted, this.createTransaction);
        C9377ev.values(this.removeParam, this.createTransaction);
        C9377ev.values(this.apiKey, this.createTransaction);
        get();
        int i4 = addParam + 9;
        getParamValue = i4 % 128;
        if (i4 % 2 != 0) {
            return linearLayout;
        }
        throw null;
    }

    public static C9252ar ThreeDS2ServiceInstance(Context context, InterfaceC9511jo interfaceC9511jo, setProperty setproperty) {
        C9252ar c9252ar = new C9252ar(context, valueOf.ThreeDS2Service, interfaceC9511jo, setproperty);
        int i = getParamValue + 101;
        addParam = i % 128;
        if (i % 2 == 0) {
            return c9252ar;
        }
        throw null;
    }

    private /* synthetic */ void get(View view) {
        boolean z;
        int i = addParam;
        int i2 = i + 23;
        getParamValue = i2 % 128;
        if (i2 % 2 != 0) {
            if (this.ConfigurationBuilder) {
                z = false;
            } else {
                getParamValue = (i + 95) % 128;
                z = true;
            }
            this.ConfigurationBuilder = z;
            get();
            return;
        }
        throw null;
    }

    public static C9252ar valueOf(Context context, InterfaceC9511jo interfaceC9511jo, setProperty setproperty) {
        C9252ar c9252ar = new C9252ar(context, valueOf.valueOf, interfaceC9511jo, setproperty);
        getParamValue = (addParam + 1) % 128;
        return c9252ar;
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
            long r6 = com.netcetera.threeds.sdk.infrastructure.C9252ar.valueOf     // Catch: java.lang.Throwable -> L7c
            long r4 = r4 ^ r6
            int r2 = com.netcetera.threeds.sdk.infrastructure.C9252ar.ThreeDS2Service     // Catch: java.lang.Throwable -> L7c
            long r6 = (long) r2     // Catch: java.lang.Throwable -> L7c
            long r4 = r4 ^ r6
            char r2 = com.netcetera.threeds.sdk.infrastructure.C9252ar.get     // Catch: java.lang.Throwable -> L7c
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
        throw new UnsupportedOperationException("Method not decompiled: com.netcetera.threeds.sdk.infrastructure.C9252ar.ThreeDS2ServiceInstance(int, char, java.lang.String, java.lang.String, java.lang.String, java.lang.Object[]):void");
    }

    /* JADX WARN: Code restructure failed: missing block: B:10:0x0032, code lost:
        if (r0 != 2) goto L7;
     */
    /* JADX WARN: Code restructure failed: missing block: B:12:0x0035, code lost:
        values(r5.configureScheme(), r5.restrictedParameters());
        com.netcetera.threeds.sdk.infrastructure.C9252ar.getParamValue = (com.netcetera.threeds.sdk.infrastructure.C9252ar.addParam + 91) % 128;
     */
    /* JADX WARN: Code restructure failed: missing block: B:6:0x0020, code lost:
        if (r0 != 2) goto L7;
     */
    @Override // com.netcetera.threeds.sdk.infrastructure.contains
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public void valueOf(com.netcetera.threeds.sdk.infrastructure.setAllCaps r5) {
        /*
            r4 = this;
            int r0 = com.netcetera.threeds.sdk.infrastructure.C9252ar.addParam
            int r0 = r0 + 103
            int r1 = r0 % 128
            com.netcetera.threeds.sdk.infrastructure.C9252ar.getParamValue = r1
            r1 = 2
            int r0 = r0 % r1
            r2 = 1
            if (r0 != 0) goto L23
            r4.values()
            int[] r0 = com.netcetera.threeds.sdk.infrastructure.C9252ar.C92533.values
            com.netcetera.threeds.sdk.infrastructure.ar$valueOf r3 = r4.onError
            int r3 = r3.ordinal()
            r0 = r0[r3]
            r3 = 50
            int r3 = r3 / 0
            if (r0 == r2) goto L49
            if (r0 == r1) goto L35
            goto L54
        L23:
            r4.values()
            int[] r0 = com.netcetera.threeds.sdk.infrastructure.C9252ar.C92533.values
            com.netcetera.threeds.sdk.infrastructure.ar$valueOf r3 = r4.onError
            int r3 = r3.ordinal()
            r0 = r0[r3]
            if (r0 == r2) goto L49
            if (r0 == r1) goto L35
            goto L54
        L35:
            java.lang.String r0 = r5.configureScheme()
            java.lang.String r5 = r5.restrictedParameters()
            r4.values(r0, r5)
            int r5 = com.netcetera.threeds.sdk.infrastructure.C9252ar.addParam
            int r5 = r5 + 91
            int r5 = r5 % 128
            com.netcetera.threeds.sdk.infrastructure.C9252ar.getParamValue = r5
            goto L54
        L49:
            java.lang.String r0 = r5.newSchemeConfiguration()
            java.lang.String r5 = r5.getSchemeId()
            r4.values(r0, r5)
        L54:
            int r5 = com.netcetera.threeds.sdk.infrastructure.C9252ar.addParam
            int r5 = r5 + 21
            int r0 = r5 % 128
            com.netcetera.threeds.sdk.infrastructure.C9252ar.getParamValue = r0
            int r5 = r5 % r1
            if (r5 == 0) goto L60
            return
        L60:
            r5 = 0
            throw r5
        */
        throw new UnsupportedOperationException("Method not decompiled: com.netcetera.threeds.sdk.infrastructure.C9252ar.valueOf(com.netcetera.threeds.sdk.infrastructure.setAllCaps):void");
    }

    private void get() {
        if (this.ConfigurationBuilder) {
            addParam = (getParamValue + 87) % 128;
            this.apiKey.setVisibility(0);
            TextView textView = this.removeParam;
            Object[] objArr = new Object[1];
            valueOf("\u0000", new int[]{188, 1, 96, 0}, true, objArr);
            textView.setText(((String) objArr[0]).intern());
        } else {
            this.apiKey.setVisibility(8);
            TextView textView2 = this.removeParam;
            Object[] objArr2 = new Object[1];
            ThreeDS2ServiceInstance((ViewConfiguration.getScrollBarFadeDuration() >> 16) + 1222723090, (char) (1235 - (ViewConfiguration.getScrollFriction() > 0.0f ? 1 : (ViewConfiguration.getScrollFriction() == 0.0f ? 0 : -1))), "ꐃ", "\u1249\ue146퉈꜄", "絜㢴牟娥", objArr2);
            textView2.setText(((String) objArr2[0]).intern());
        }
        addParam = (getParamValue + 57) % 128;
    }

    @Override // com.netcetera.threeds.sdk.infrastructure.save
    public void valueOf(InterfaceC9370eo interfaceC9370eo) {
        int i = C92533.values[this.onError.ordinal()];
        if (i == 1) {
            Object[] objArr = new Object[1];
            valueOf("\u0000\u0000\u0000\u0000\u0000\u0001\u0001\u0001\u0001\u0001\u0000\u0001\u0001\u0000\u0001\u0000\u0001\u0000\u0001\u0000\u0001\u0001", new int[]{141, 22, 77, 0}, true, objArr);
            interfaceC9370eo.values(((String) objArr[0]).intern(), this.ConfigurationBuilder);
            addParam = (getParamValue + 29) % 128;
        } else if (i != 2) {
        } else {
            Object[] objArr2 = new Object[1];
            valueOf("\u0001\u0001\u0001\u0000\u0001\u0000\u0001\u0000\u0001\u0001\u0000\u0001\u0001\u0001\u0001\u0001\u0000\u0000\u0000\u0000\u0000\u0001\u0000\u0001\u0001", new int[]{163, 25, 1, 20}, false, objArr2);
            interfaceC9370eo.values(((String) objArr2[0]).intern(), this.ConfigurationBuilder);
            addParam = (getParamValue + 115) % 128;
        }
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
            char[] r8 = com.netcetera.threeds.sdk.infrastructure.C9252ar.values     // Catch: java.lang.Throwable -> L38
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
        throw new UnsupportedOperationException("Method not decompiled: com.netcetera.threeds.sdk.infrastructure.C9252ar.valueOf(java.lang.String, int[], boolean, java.lang.Object[]):void");
    }

    @Override // com.netcetera.threeds.sdk.infrastructure.save
    public void values(InterfaceC9373er interfaceC9373er) {
        addParam = (getParamValue + 59) % 128;
        values();
        int i = C92533.values[this.onError.ordinal()];
        if (i == 1) {
            Object[] objArr = new Object[1];
            valueOf("\u0000\u0000\u0000\u0000\u0000\u0001\u0001\u0001\u0001\u0001\u0000\u0001\u0001\u0000\u0001\u0000\u0001\u0000\u0001\u0000\u0001\u0001", new int[]{141, 22, 77, 0}, true, objArr);
            this.ConfigurationBuilder = interfaceC9373er.get(((String) objArr[0]).intern(), false).booleanValue();
        } else if (i == 2) {
            Object[] objArr2 = new Object[1];
            valueOf("\u0001\u0001\u0001\u0000\u0001\u0000\u0001\u0000\u0001\u0001\u0000\u0001\u0001\u0001\u0001\u0001\u0000\u0000\u0000\u0000\u0000\u0001\u0000\u0001\u0001", new int[]{163, 25, 1, 20}, false, objArr2);
            this.ConfigurationBuilder = interfaceC9373er.get(((String) objArr2[0]).intern(), false).booleanValue();
            addParam = (getParamValue + 57) % 128;
        }
        get();
    }

    private void values(String str, String str2) {
        LinearLayout ThreeDS2Service2;
        int i;
        getParamValue = (addParam + 125) % 128;
        if (C9669om.get(str, str2)) {
            int i2 = getParamValue + 105;
            addParam = i2 % 128;
            if (i2 % 2 != 0) {
                ThreeDS2Service2 = ThreeDS2Service();
                i = 79;
            } else {
                ThreeDS2Service2 = ThreeDS2Service();
                i = 8;
            }
            ThreeDS2Service2.setVisibility(i);
            return;
        }
        ThreeDS2Service().setVisibility(0);
        this.onCompleted.setText(str);
        this.ThreeDS2Service$InitializationCallback.get(this.apiKey, str2);
    }
}

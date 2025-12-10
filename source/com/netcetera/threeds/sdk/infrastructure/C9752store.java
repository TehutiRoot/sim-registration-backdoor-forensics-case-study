package com.netcetera.threeds.sdk.infrastructure;

import android.content.Context;
import android.graphics.Color;
import android.graphics.ImageFormat;
import android.graphics.PointF;
import android.os.Process;
import android.telephony.cdma.CdmaCellLocation;
import android.text.TextUtils;
import android.view.Gravity;
import android.view.View;
import android.view.ViewConfiguration;
import android.view.ViewGroup;
import android.view.inputmethod.InputMethodManager;
import android.widget.Button;
import android.widget.ExpandableListView;
import android.widget.LinearLayout;
import com.netcetera.threeds.sdk.api.p018ui.logic.UiCustomization;

/* renamed from: com.netcetera.threeds.sdk.infrastructure.store */
/* loaded from: classes5.dex */
public class C9752store extends AbstractC9758w<Button> {
    private static int ConfigParameters = 0;
    public static long ThreeDS2ServiceInstance = 3831333721130754490L;
    private static int onCompleted = 1;
    public static long valueOf = -2297093255330325658L;
    private final get ThreeDS2Service;
    private final writeReplace get;
    private final String getWarnings;
    private forEach initialize;
    private final InterfaceC9507jk values;

    /* renamed from: com.netcetera.threeds.sdk.infrastructure.store$2 */
    /* loaded from: classes5.dex */
    public static /* synthetic */ class C97532 {
        private static int ThreeDS2ServiceInstance = 1;
        static final /* synthetic */ int[] get;
        private static int values;

        static {
            int[] iArr = new int[get.values().length];
            get = iArr;
            try {
                iArr[get.ThreeDS2Service.ordinal()] = 1;
                ThreeDS2ServiceInstance = (values + 9) % 128;
            } catch (NoSuchFieldError unused) {
            }
            try {
                get[get.ThreeDS2ServiceInstance.ordinal()] = 2;
                values = ((-2) - (~(ThreeDS2ServiceInstance + 42))) % 128;
            } catch (NoSuchFieldError unused2) {
            }
            try {
                get[get.values.ordinal()] = 3;
                int i = values;
                int i2 = i & 27;
                int i3 = (i ^ 27) | i2;
                ThreeDS2ServiceInstance = (((i2 | i3) << 1) - (i3 ^ i2)) % 128;
            } catch (NoSuchFieldError unused3) {
            }
            try {
                get[get.valueOf.ordinal()] = 4;
                int i4 = ThreeDS2ServiceInstance;
                int i5 = i4 & 7;
                values = (i5 + ((i4 ^ 7) | i5)) % 128;
            } catch (NoSuchFieldError unused4) {
            }
            try {
                get[get.get.ordinal()] = 5;
                int i6 = ThreeDS2ServiceInstance;
                int i7 = i6 & 91;
                int i8 = (i6 | 91) & (~i7);
                int i9 = i7 << 1;
                values = (((i8 | i9) << 1) - (i8 ^ i9)) % 128;
            } catch (NoSuchFieldError unused5) {
            }
            try {
                get[get.getWarnings.ordinal()] = 6;
                int i10 = values;
                int i11 = i10 | 103;
                ThreeDS2ServiceInstance = ((i11 << 1) - ((~(i10 & 103)) & i11)) % 128;
            } catch (NoSuchFieldError unused6) {
            }
            try {
                get[get.initialize.ordinal()] = 7;
                int i12 = ThreeDS2ServiceInstance;
                int i13 = i12 & 43;
                values = (((i12 | 43) & (~i13)) + (i13 << 1)) % 128;
            } catch (NoSuchFieldError unused7) {
            }
            int i14 = values;
            int i15 = (i14 & 101) + (i14 | 101);
            ThreeDS2ServiceInstance = i15 % 128;
            if (i15 % 2 != 0) {
                return;
            }
            throw null;
        }
    }

    /* JADX WARN: Enum visitor error
    jadx.core.utils.exceptions.JadxRuntimeException: Init of enum ThreeDS2ServiceInstance uses external variables
    	at jadx.core.dex.visitors.EnumVisitor.createEnumFieldByConstructor(EnumVisitor.java:444)
    	at jadx.core.dex.visitors.EnumVisitor.processEnumFieldByRegister(EnumVisitor.java:391)
    	at jadx.core.dex.visitors.EnumVisitor.extractEnumFieldsFromFilledArray(EnumVisitor.java:320)
    	at jadx.core.dex.visitors.EnumVisitor.extractEnumFieldsFromInsn(EnumVisitor.java:258)
    	at jadx.core.dex.visitors.EnumVisitor.convertToEnum(EnumVisitor.java:151)
    	at jadx.core.dex.visitors.EnumVisitor.visit(EnumVisitor.java:100)
     */
    /* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
    /* renamed from: com.netcetera.threeds.sdk.infrastructure.store$get */
    /* loaded from: classes5.dex */
    public static final class get {
        public static final get ThreeDS2Service;
        public static final get ThreeDS2ServiceInstance;
        public static int[] cleanup = null;
        public static final get get;
        private static int getSDKInfo = 0;
        private static final /* synthetic */ get[] getSDKVersion;
        public static final get getWarnings;
        public static final get initialize;
        private static int onError = 1;
        public static final get valueOf;
        public static final get values;

        static {
            get();
            Object[] objArr = new Object[1];
            ThreeDS2Service(new int[]{484460886, 1413142961, 1421273765, -1395597231}, 6 - (ViewConfiguration.getScrollDefaultDelay() >> 16), objArr);
            get getVar = new get(((String) objArr[0]).intern(), 0);
            ThreeDS2ServiceInstance = getVar;
            Object[] objArr2 = new Object[1];
            ThreeDS2Service(new int[]{-1467368445, 108822733}, 3 - View.resolveSize(0, 0), objArr2);
            get getVar2 = new get(((String) objArr2[0]).intern(), 1);
            ThreeDS2Service = getVar2;
            Object[] objArr3 = new Object[1];
            ThreeDS2Service(new int[]{-1891850038, -1345795366, 65556160, -829378409}, (Process.myPid() >> 22) + 6, objArr3);
            get getVar3 = new get(((String) objArr3[0]).intern(), 2);
            values = getVar3;
            Object[] objArr4 = new Object[1];
            ThreeDS2Service(new int[]{-1452083770, -1316073922}, Gravity.getAbsoluteGravity(0, 0) + 4, objArr4);
            get getVar4 = new get(((String) objArr4[0]).intern(), 3);
            valueOf = getVar4;
            Object[] objArr5 = new Object[1];
            ThreeDS2Service(new int[]{1496514143, 1452114790}, ExpandableListView.getPackedPositionChild(0L) + 5, objArr5);
            get getVar5 = new get(((String) objArr5[0]).intern(), 4);
            get = getVar5;
            Object[] objArr6 = new Object[1];
            ThreeDS2Service(new int[]{942480975, 788655776, 1222605177, -1547047733, -1668087492, 1423810273}, 12 - TextUtils.indexOf("", "", 0, 0), objArr6);
            get getVar6 = new get(((String) objArr6[0]).intern(), 5);
            getWarnings = getVar6;
            Object[] objArr7 = new Object[1];
            ThreeDS2Service(new int[]{-1443816887, 1408459805, 1542307896, 195344527, 1755225206, -1826298769, -1195255208, -1438086439, -392571826, 692317306}, 17 - TextUtils.indexOf("", "", 0), objArr7);
            get getVar7 = new get(((String) objArr7[0]).intern(), 6);
            initialize = getVar7;
            getSDKVersion = new get[]{getVar, getVar2, getVar3, getVar4, getVar5, getVar6, getVar7};
            getSDKInfo = (onError + 107) % 128;
        }

        private get(String str, int i) {
        }

        private static void ThreeDS2Service(int[] iArr, int i, Object[] objArr) {
            String str;
            synchronized (onError.ThreeDS2ServiceInstance) {
                try {
                    char[] cArr = new char[4];
                    char[] cArr2 = new char[iArr.length << 1];
                    int[] iArr2 = (int[]) cleanup.clone();
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

        public static void get() {
            cleanup = new int[]{-1960386975, -200823130, -1298635718, 1573254036, 1148602061, -881971864, -1360073172, 905119175, 1968730256, -1694474908, -207877358, 419704743, -1687717626, -772683452, 452096763, -725739105, 116547026, 814522314};
        }

        public static get valueOf(String str) {
            getSDKInfo = (onError + 65) % 128;
            get getVar = (get) Enum.valueOf(get.class, str);
            int i = onError + 97;
            getSDKInfo = i % 128;
            if (i % 2 == 0) {
                return getVar;
            }
            throw null;
        }

        public static get[] values() {
            get[] getVarArr;
            int i = onError + 11;
            getSDKInfo = i % 128;
            if (i % 2 != 0) {
                getVarArr = (get[]) getSDKVersion.clone();
                int i2 = 55 / 0;
            } else {
                getVarArr = (get[]) getSDKVersion.clone();
            }
            onError = (getSDKInfo + 119) % 128;
            return getVarArr;
        }
    }

    public C9752store(Context context, writeReplace writereplace, InterfaceC9507jk interfaceC9507jk, get getVar, String str) {
        super(context);
        this.get = writereplace;
        this.values = interfaceC9507jk;
        this.ThreeDS2Service = getVar;
        this.getWarnings = str;
    }

    public static C9752store ThreeDS2Service(Context context, InterfaceC9515js interfaceC9515js) {
        InterfaceC9507jk ThreeDS2ServiceInstance2 = interfaceC9515js.ThreeDS2ServiceInstance(UiCustomization.ButtonType.ADD_CH);
        get getVar = get.initialize;
        Object[] objArr = new Object[1];
        values("듓뒰玴ቦ蛭\ue98b䗸㉗魳쳉࿊悸륦ᱡ铉﹞‴薥ᶼ畎꼟ຂ骉豩ᘼ瞓⁛ଞ鷇\uf8faꥃ舻Ӫ懄㙑ᤣ", ImageFormat.getBitsPerPixel(0) + 1, objArr);
        C9752store c9752store = new C9752store(context, null, ThreeDS2ServiceInstance2, getVar, ((String) objArr[0]).intern());
        int i = onCompleted + 21;
        ConfigParameters = i % 128;
        if (i % 2 != 0) {
            int i2 = 80 / 0;
        }
        return c9752store;
    }

    public static /* synthetic */ void ThreeDS2ServiceInstance(C9752store c9752store, View view) {
        int i = ConfigParameters + 97;
        onCompleted = i % 128;
        int i2 = i % 2;
        c9752store.ThreeDS2ServiceInstance(view);
        if (i2 == 0) {
            throw null;
        }
    }

    public static C9752store valueOf(Context context, writeReplace writereplace, InterfaceC9515js interfaceC9515js) {
        InterfaceC9507jk ThreeDS2ServiceInstance2 = interfaceC9515js.ThreeDS2ServiceInstance(UiCustomization.ButtonType.NEXT);
        get getVar = get.valueOf;
        Object[] objArr = new Object[1];
        ThreeDS2Service("ᬅꥵ翱౻틦杤㗪臭裛嵪\ue3dd끆䛽ପ\ud9a9渱㲻설鞴␘\uea9b뼄䶀ሃꂋ甋㭬짶鹱⳨\uf178蟪呩\u1ad3꽯緛ɋ탃敁⮷", (ViewConfiguration.getKeyRepeatTimeout() >> 16) + 45691, objArr);
        C9752store c9752store = new C9752store(context, writereplace, ThreeDS2ServiceInstance2, getVar, ((String) objArr[0]).intern());
        int i = onCompleted + 115;
        ConfigParameters = i % 128;
        if (i % 2 == 0) {
            return c9752store;
        }
        throw null;
    }

    public static C9752store values(Context context, InterfaceC9515js interfaceC9515js) {
        InterfaceC9507jk ThreeDS2ServiceInstance2 = interfaceC9515js.ThreeDS2ServiceInstance(UiCustomization.ButtonType.CONTINUE);
        get getVar = get.get;
        Object[] objArr = new Object[1];
        ThreeDS2Service("ᬅ耡ⵙ쪇瞶᳨렒╈쉻澞ᓅ뀊崍𤋮枚ು꧹唦\uf24b齴Ҥꇉ䴅\uea31靻㲔\ud9ff䛿\ue223轗㒁톻", Color.alpha(0) + 39727, objArr);
        C9752store c9752store = new C9752store(context, null, ThreeDS2ServiceInstance2, getVar, ((String) objArr[0]).intern());
        int i = ConfigParameters + 77;
        onCompleted = i % 128;
        if (i % 2 != 0) {
            return c9752store;
        }
        throw null;
    }

    @Override // com.netcetera.threeds.sdk.infrastructure.AbstractC9758w
    public /* synthetic */ Button get(Context context) {
        ConfigParameters = (onCompleted + 75) % 128;
        Button ThreeDS2Service = ThreeDS2Service(context);
        onCompleted = (ConfigParameters + 15) % 128;
        return ThreeDS2Service;
    }

    public static C9752store ThreeDS2ServiceInstance(Context context, writeReplace writereplace, InterfaceC9515js interfaceC9515js) {
        InterfaceC9507jk ThreeDS2ServiceInstance2 = interfaceC9515js.ThreeDS2ServiceInstance(UiCustomization.ButtonType.SUBMIT);
        get getVar = get.values;
        Object[] objArr = new Object[1];
        ThreeDS2Service("ᬅꥵ翱౻틦杤㗪臭裛嵪\ue3dd끆䛽ପ\ud9a9渱㲻설鞴␘\uea9b뼄䶀ሃꂋ甋㭬짶鹱⳨\uf178蟪呩\u1ad3꽯緛ɋ탃敁⮷", Color.blue(0) + 45691, objArr);
        C9752store c9752store = new C9752store(context, writereplace, ThreeDS2ServiceInstance2, getVar, ((String) objArr[0]).intern());
        int i = ConfigParameters + 13;
        onCompleted = i % 128;
        if (i % 2 == 0) {
            int i2 = 13 / 0;
        }
        return c9752store;
    }

    public static C9752store get(Context context, InterfaceC9515js interfaceC9515js) {
        InterfaceC9507jk ThreeDS2ServiceInstance2 = interfaceC9515js.ThreeDS2ServiceInstance(UiCustomization.ButtonType.CONTINUE);
        get getVar = get.ThreeDS2Service;
        Object[] objArr = new Object[1];
        ThreeDS2Service("ᬅ鐱չ뚷⟶휸䁲\uf1b8拻ሎ荥㲺귍崺칻羵\ue8c9頪१몥⯾\udb24呢얺盫\ue61e靬¢뇠℠퉨", 36671 - Color.red(0), objArr);
        C9752store c9752store = new C9752store(context, null, ThreeDS2ServiceInstance2, getVar, ((String) objArr[0]).intern());
        int i = onCompleted + 89;
        ConfigParameters = i % 128;
        if (i % 2 == 0) {
            return c9752store;
        }
        throw null;
    }

    public static C9752store valueOf(Context context, InterfaceC9515js interfaceC9515js) {
        InterfaceC9507jk ThreeDS2ServiceInstance2 = interfaceC9515js.ThreeDS2ServiceInstance(UiCustomization.ButtonType.OPEN_OOB_APP);
        get getVar = get.getWarnings;
        Object[] objArr = new Object[1];
        ThreeDS2Service("ᬅ\ue15f\uefa5\uf5f9\uf24e\uf896웮쌶즋ퟠ\udc39\uda74ꃵ괔ꭧ놻븩葦芤輕镭鎯駱晃沛櫣", 64081 - (PointF.length(0.0f, 0.0f) > 0.0f ? 1 : (PointF.length(0.0f, 0.0f) == 0.0f ? 0 : -1)), objArr);
        C9752store c9752store = new C9752store(context, null, ThreeDS2ServiceInstance2, getVar, ((String) objArr[0]).intern());
        onCompleted = (ConfigParameters + 75) % 128;
        return c9752store;
    }

    public Button ThreeDS2Service(Context context) {
        Button button = new Button(context);
        button.setVisibility(8);
        button.setTransformationMethod(null);
        LinearLayout.LayoutParams layoutParams = new LinearLayout.LayoutParams(-1, -2);
        int i = C9375et.ThreeDS2Service;
        layoutParams.setMargins(0, i, 0, i);
        button.setLayoutParams(layoutParams);
        button.setMinHeight(C9375et.getSDKInfo);
        button.setOnClickListener(new stringPropertyNames(this));
        valueOf(button);
        onCompleted = (ConfigParameters + 45) % 128;
        return button;
    }

    public void values(forEach foreach) {
        int i = (onCompleted + 43) % 128;
        ConfigParameters = i;
        this.initialize = foreach;
        onCompleted = (i + 75) % 128;
    }

    public static C9752store ThreeDS2ServiceInstance(Context context, InterfaceC9515js interfaceC9515js) {
        InterfaceC9507jk ThreeDS2ServiceInstance2 = interfaceC9515js.ThreeDS2ServiceInstance(UiCustomization.ButtonType.RESEND);
        get getVar = get.ThreeDS2ServiceInstance;
        Object[] objArr = new Object[1];
        values("镍键룰\ud922逸\ue917匭Ꮙ倷챕\u191f怤飸휥舜ﻂƪ仰\u0b64痀躈엄豝賄㞬볜㚷\u0b8c뱏㎷뾨芿╼ꪍ\u208fᦌꉡ\u206bꧻ遞⬉", Gravity.getAbsoluteGravity(0, 0), objArr);
        C9752store c9752store = new C9752store(context, null, ThreeDS2ServiceInstance2, getVar, ((String) objArr[0]).intern());
        ConfigParameters = (onCompleted + 43) % 128;
        return c9752store;
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
            long r1 = com.netcetera.threeds.sdk.infrastructure.C9752store.ThreeDS2ServiceInstance     // Catch: java.lang.Throwable -> L3a
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
            long r6 = com.netcetera.threeds.sdk.infrastructure.C9752store.ThreeDS2ServiceInstance     // Catch: java.lang.Throwable -> L3a
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
        throw new UnsupportedOperationException("Method not decompiled: com.netcetera.threeds.sdk.infrastructure.C9752store.values(java.lang.String, int, java.lang.Object[]):void");
    }

    @Override // com.netcetera.threeds.sdk.infrastructure.contains
    public void valueOf(setAllCaps setallcaps) {
        String visaSchemeConfiguration;
        values();
        switch (C97532.get[this.ThreeDS2Service.ordinal()]) {
            case 1:
                visaSchemeConfiguration = setallcaps.visaSchemeConfiguration();
                break;
            case 2:
                visaSchemeConfiguration = setallcaps.amexConfiguration();
                break;
            case 3:
            case 4:
                visaSchemeConfiguration = setallcaps.dinersSchemeConfiguration();
                onCompleted = (ConfigParameters + 43) % 128;
                break;
            case 5:
                visaSchemeConfiguration = setallcaps.eftposConfiguration();
                break;
            case 6:
                visaSchemeConfiguration = setallcaps.jcbConfiguration();
                break;
            case 7:
                visaSchemeConfiguration = setallcaps.getSchemePublicRootKeys();
                break;
            default:
                Object[] objArr = new Object[1];
                values("I\u0000碤ᥰ糒詵뿐蛍遯꼺\uf5e8̌\u0dfb\u175b滠鶰钞躸\ue7dcᚨᮐ֎悡", (PointF.length(0.0f, 0.0f) > 0.0f ? 1 : (PointF.length(0.0f, 0.0f) == 0.0f ? 0 : -1)), objArr);
                throw new IllegalStateException(((String) objArr[0]).intern());
        }
        if (!C9669om.values((CharSequence) visaSchemeConfiguration)) {
            ThreeDS2Service().setVisibility(0);
            ThreeDS2Service().setText(visaSchemeConfiguration);
            values(ThreeDS2Service(), this.getWarnings);
            return;
        }
        ConfigParameters = (onCompleted + 25) % 128;
        ThreeDS2Service().setVisibility(8);
        ((ViewGroup) ThreeDS2Service().getParent()).setVisibility(8);
    }

    private void ThreeDS2ServiceInstance(View view) {
        ConfigParameters = (onCompleted + 29) % 128;
        Context context = view.getContext();
        Object[] objArr = new Object[1];
        values("ꈱꉘ먀\udbd4ᗂᅽ훆⒭勽㐦鳷顕꾕헢߭ڼ", ViewConfiguration.getEdgeSlop() >> 16, objArr);
        ((InputMethodManager) context.getSystemService(((String) objArr[0]).intern())).hideSoftInputFromWindow(view.getRootView().getWindowToken(), 0);
        if (this.initialize == null) {
            return;
        }
        switch (C97532.get[this.ThreeDS2Service.ordinal()]) {
            case 1:
            case 6:
            case 7:
                this.initialize.ThreeDS2ServiceInstance(null);
                break;
            case 2:
                forEach foreach = this.initialize;
                Object[] objArr2 = new Object[1];
                values("쭳쬪戰㕷\ue1cd", Color.green(0), objArr2);
                foreach.ThreeDS2ServiceInstance(new C9273bi(((String) objArr2[0]).intern()));
                break;
            case 3:
            case 4:
                this.initialize.ThreeDS2ServiceInstance(this.get.get());
                break;
            case 5:
                forEach foreach2 = this.initialize;
                Object[] objArr3 = new Object[1];
                ThreeDS2Service("ᬒꎇ樵㊺", 47251 - (CdmaCellLocation.convertQuartSecToDecDegrees(0) > 0.0d ? 1 : (CdmaCellLocation.convertQuartSecToDecDegrees(0) == 0.0d ? 0 : -1)), objArr3);
                foreach2.ThreeDS2ServiceInstance(new C9273bi(((String) objArr3[0]).intern()));
                break;
        }
        ConfigParameters = (onCompleted + 81) % 128;
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
            long r5 = com.netcetera.threeds.sdk.infrastructure.C9752store.valueOf     // Catch: java.lang.Throwable -> L2e
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
        throw new UnsupportedOperationException("Method not decompiled: com.netcetera.threeds.sdk.infrastructure.C9752store.ThreeDS2Service(java.lang.String, int, java.lang.Object[]):void");
    }

    private void valueOf(Button button) {
        int i = ConfigParameters + 13;
        onCompleted = i % 128;
        if (i % 2 != 0) {
            C9377ev.values(button, (InterfaceC9514jr) this.values);
            C9377ev.values(button, this.values);
            return;
        }
        C9377ev.values(button, (InterfaceC9514jr) this.values);
        C9377ev.values(button, this.values);
        throw null;
    }
}

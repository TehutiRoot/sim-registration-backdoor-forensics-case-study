package com.netcetera.threeds.sdk.infrastructure;

import android.content.Context;
import android.view.ViewGroup;
import android.widget.CheckBox;
import android.widget.CompoundButton;
import android.widget.FrameLayout;
import androidx.appcompat.app.AppCompatDelegate;
import ch.qos.logback.core.CoreConstants;
import org.bouncycastle.pqc.math.linearalgebra.Matrix;

/* loaded from: classes5.dex */
abstract class storeToXML extends AbstractC9758w<FrameLayout> implements InterfaceC9367elements, save {
    private static int ThreeDS2ServiceInstance = 0;
    private static int initialize = 1;
    private values ThreeDS2Service;
    private final InterfaceC9511jo get;
    private FrameLayout valueOf;
    private CheckBox values;

    /* renamed from: com.netcetera.threeds.sdk.infrastructure.storeToXML$5 */
    /* loaded from: classes5.dex */
    public static /* synthetic */ class C97545 {
        private static int ThreeDS2ServiceInstance = 0;
        private static int get = 1;
        static final /* synthetic */ int[] valueOf;

        static {
            int[] iArr = new int[values.values().length];
            valueOf = iArr;
            try {
                iArr[values.values.ordinal()] = 1;
                int i = ThreeDS2ServiceInstance;
                int i2 = i & 115;
                int i3 = (i ^ 115) | i2;
                get = ((i2 & i3) + (i3 | i2)) % 128;
            } catch (NoSuchFieldError unused) {
            }
            try {
                valueOf[values.valueOf.ordinal()] = 2;
                int i4 = ThreeDS2ServiceInstance;
                int i5 = i4 | 5;
                int i6 = i5 << 1;
                int i7 = -((~(i4 & 5)) & i5);
                get = ((i6 ^ i7) + ((i7 & i6) << 1)) % 128;
            } catch (NoSuchFieldError unused2) {
            }
            try {
                valueOf[values.ThreeDS2Service.ordinal()] = 3;
                int i8 = ThreeDS2ServiceInstance;
                get = ((-2) - (~((i8 & AppCompatDelegate.FEATURE_SUPPORT_ACTION_BAR) + (i8 | AppCompatDelegate.FEATURE_SUPPORT_ACTION_BAR)))) % 128;
            } catch (NoSuchFieldError unused3) {
            }
            int i9 = get;
            ThreeDS2ServiceInstance = (((i9 & (-6)) | ((~i9) & 5)) + ((i9 & 5) << 1)) % 128;
        }
    }

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
    public static final class values {
        public static final values ThreeDS2Service;
        public static char[] ThreeDS2ServiceInstance = null;
        private static final /* synthetic */ values[] get;
        private static int getSDKVersion = 1;
        private static int initialize;
        public static final values valueOf;
        public static final values values;

        static {
            valueOf();
            Object[] objArr = new Object[1];
            values("\u0001\u0000\u0000", new int[]{0, 3, 0, 0}, false, objArr);
            values valuesVar = new values(((String) objArr[0]).intern(), 0);
            values = valuesVar;
            Object[] objArr2 = new Object[1];
            values("\u0000\u0001", new int[]{3, 2, 76, 0}, false, objArr2);
            values valuesVar2 = new values(((String) objArr2[0]).intern(), 1);
            valueOf = valuesVar2;
            Object[] objArr3 = new Object[1];
            values("\u0000\u0001\u0001\u0001", new int[]{5, 4, 4, 0}, false, objArr3);
            values valuesVar3 = new values(((String) objArr3[0]).intern(), 2);
            ThreeDS2Service = valuesVar3;
            get = new values[]{valuesVar, valuesVar2, valuesVar3};
            int i = initialize + 5;
            getSDKVersion = i % 128;
            if (i % 2 == 0) {
                int i2 = 85 / 0;
            }
        }

        private values(String str, int i) {
        }

        public static void valueOf() {
            ThreeDS2ServiceInstance = new char[]{',', 'O', Matrix.MATRIX_TYPE_RANDOM_LT, 'M', 154, CoreConstants.RIGHT_PARENTHESIS_CHAR, Matrix.MATRIX_TYPE_RANDOM_REGULAR, Matrix.MATRIX_TYPE_RANDOM_REGULAR, 'M'};
        }

        public static values[] values() {
            int i = initialize + 1;
            getSDKVersion = i % 128;
            if (i % 2 != 0) {
                return (values[]) get.clone();
            }
            get.clone();
            throw null;
        }

        public static values valueOf(String str) {
            initialize = (getSDKVersion + 25) % 128;
            values valuesVar = (values) Enum.valueOf(values.class, str);
            int i = initialize + 85;
            getSDKVersion = i % 128;
            if (i % 2 != 0) {
                return valuesVar;
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
                char[] r8 = com.netcetera.threeds.sdk.infrastructure.storeToXML.values.ThreeDS2ServiceInstance     // Catch: java.lang.Throwable -> L38
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
            throw new UnsupportedOperationException("Method not decompiled: com.netcetera.threeds.sdk.infrastructure.storeToXML.values.values(java.lang.String, int[], boolean, java.lang.Object[]):void");
        }
    }

    public storeToXML(Context context, InterfaceC9511jo interfaceC9511jo) {
        super(context);
        this.ThreeDS2Service = values.ThreeDS2Service;
        this.get = interfaceC9511jo;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public /* synthetic */ void valueOf(CompoundButton compoundButton, boolean z) {
        int i = initialize;
        int i2 = ((i | 11) << 1) - (i ^ 11);
        ThreeDS2ServiceInstance = i2 % 128;
        int i3 = i2 % 2;
        values(z);
        if (i3 != 0) {
            throw null;
        }
    }

    public abstract keys ThreeDS2ServiceInstance(keys keysVar);

    public abstract String ThreeDS2ServiceInstance();

    public abstract void ThreeDS2ServiceInstance(CheckBox checkBox);

    public abstract String get(setAllCaps setallcaps);

    public FrameLayout values(Context context) {
        this.valueOf = new FrameLayout(context);
        this.valueOf.setLayoutParams(new ViewGroup.LayoutParams(-1, -2));
        FrameLayout frameLayout = this.valueOf;
        int i = C9375et.getWarnings;
        int i2 = C9375et.ThreeDS2Service;
        frameLayout.setPadding(i, i2, i, i2);
        CheckBox checkBox = new CheckBox(context);
        this.values = checkBox;
        checkBox.setPadding(C9375et.ThreeDS2ServiceInstance, i2, 0, i2);
        this.values.setMinHeight(C9375et.getSDKInfo);
        this.values.setOnCheckedChangeListener(new loadFromXML(this));
        ThreeDS2ServiceInstance(this.values);
        C9377ev.values(this.values, this.get);
        this.valueOf.addView(this.values);
        this.valueOf.setVisibility(8);
        FrameLayout frameLayout2 = this.valueOf;
        int i3 = ThreeDS2ServiceInstance;
        initialize = (((((i3 ^ 29) | (i3 & 29)) << 1) - (~(-(((~i3) & 29) | (i3 & (-30)))))) - 1) % 128;
        return frameLayout2;
    }

    public abstract keys values(keys keysVar);

    @Override // com.netcetera.threeds.sdk.infrastructure.AbstractC9758w
    public /* synthetic */ FrameLayout get(Context context) {
        int i = ThreeDS2ServiceInstance;
        int i2 = ((i ^ 91) | (i & 91)) << 1;
        int i3 = -(((~i) & 91) | (i & (-92)));
        int i4 = (i2 ^ i3) + ((i3 & i2) << 1);
        initialize = i4 % 128;
        if (i4 % 2 == 0) {
            values(context);
            throw null;
        }
        FrameLayout values2 = values(context);
        int i5 = initialize;
        int i6 = i5 & 55;
        int i7 = ((i5 | 55) & (~i6)) + (i6 << 1);
        ThreeDS2ServiceInstance = i7 % 128;
        if (i7 % 2 != 0) {
            int i8 = 10 / 0;
        }
        return values2;
    }

    @Override // com.netcetera.threeds.sdk.infrastructure.contains
    public void valueOf(setAllCaps setallcaps) {
        int i = initialize + 2;
        ThreeDS2ServiceInstance = ((~i) + (i << 1)) % 128;
        values();
        String str = get(setallcaps);
        if (C9669om.valueOf(str)) {
            int i2 = initialize;
            int i3 = i2 & 109;
            ThreeDS2ServiceInstance = ((i3 - (~(-(-((i2 ^ 109) | i3))))) - 1) % 128;
            this.valueOf.setVisibility(0);
            this.values.setText(str);
            values(this.values.isChecked());
            int i4 = initialize;
            int i5 = i4 & 37;
            int i6 = ((i4 ^ 37) | i5) << 1;
            int i7 = -((i4 | 37) & (~i5));
            ThreeDS2ServiceInstance = (((i6 | i7) << 1) - (i7 ^ i6)) % 128;
        }
        int i8 = initialize;
        int i9 = i8 & 63;
        ThreeDS2ServiceInstance = ((((i8 | 63) & (~i9)) - (~(i9 << 1))) - 1) % 128;
    }

    public keys get(keys keysVar) {
        ThreeDS2ServiceInstance = (initialize + 69) % 128;
        int i = C97545.valueOf[this.ThreeDS2Service.ordinal()];
        if (i == 1) {
            keys ThreeDS2ServiceInstance2 = ThreeDS2ServiceInstance(keysVar);
            int i2 = ThreeDS2ServiceInstance;
            int i3 = i2 & 23;
            initialize = (i3 + ((i2 ^ 23) | i3)) % 128;
            return ThreeDS2ServiceInstance2;
        } else if (i != 2) {
            int i4 = ThreeDS2ServiceInstance;
            int i5 = i4 & 49;
            int i6 = (i5 - (~((i4 ^ 49) | i5))) - 1;
            initialize = i6 % 128;
            if (i6 % 2 == 0) {
                int i7 = 56 / 0;
            }
            return keysVar;
        } else {
            keys values2 = values(keysVar);
            int i8 = ThreeDS2ServiceInstance;
            int i9 = i8 & 43;
            initialize = (i9 + ((i8 ^ 43) | i9)) % 128;
            return values2;
        }
    }

    public void valueOf(InterfaceC9370eo interfaceC9370eo) {
        initialize = (ThreeDS2ServiceInstance + 101) % 128;
        String ThreeDS2ServiceInstance2 = ThreeDS2ServiceInstance();
        boolean z = true;
        if (this.ThreeDS2Service == values.values) {
            int i = (initialize + 109) % 128;
            ThreeDS2ServiceInstance = i;
            int i2 = i ^ 79;
            int i3 = ((i & 79) | i2) << 1;
            int i4 = -i2;
            initialize = ((i3 & i4) + (i3 | i4)) % 128;
        } else {
            int i5 = ThreeDS2ServiceInstance;
            initialize = (((i5 & (-56)) | ((~i5) & 55)) + ((i5 & 55) << 1)) % 128;
            z = false;
        }
        interfaceC9370eo.values(ThreeDS2ServiceInstance2, z);
        int i6 = ThreeDS2ServiceInstance;
        int i7 = i6 & 47;
        initialize = (i7 + ((i6 ^ 47) | i7)) % 128;
    }

    public void values(InterfaceC9373er interfaceC9373er) {
        int i = initialize;
        ThreeDS2ServiceInstance = ((i ^ 65) + ((i & 65) << 1)) % 128;
        values();
        if (interfaceC9373er.get(ThreeDS2ServiceInstance(), false).booleanValue()) {
            int i2 = ThreeDS2ServiceInstance;
            initialize = ((((i2 ^ 93) | (i2 & 93)) << 1) - (((~i2) & 93) | (i2 & (-94)))) % 128;
            this.values.setChecked(true);
            int i3 = ThreeDS2ServiceInstance;
            initialize = ((((i3 & (-84)) | ((~i3) & 83)) - (~(-(-((i3 & 83) << 1))))) - 1) % 128;
        }
        int i4 = ThreeDS2ServiceInstance;
        int i5 = i4 ^ 81;
        int i6 = -(-((i4 & 81) << 1));
        initialize = (((i5 | i6) << 1) - (i6 ^ i5)) % 128;
    }

    private void values(boolean z) {
        values valuesVar;
        int i = initialize;
        int i2 = ((i ^ 71) | (i & 71)) << 1;
        int i3 = -(((~i) & 71) | (i & (-72)));
        int i4 = ((i2 & i3) + (i3 | i2)) % 128;
        ThreeDS2ServiceInstance = i4;
        if (this.values != null) {
            int i5 = i4 & 91;
            int i6 = -(-((i4 ^ 91) | i5));
            initialize = (((i5 | i6) << 1) - (i5 ^ i6)) % 128;
            if (z) {
                int i7 = i4 ^ 51;
                int i8 = ((i4 & 51) | i7) << 1;
                int i9 = -i7;
                initialize = ((i8 & i9) + (i9 | i8)) % 128;
                valuesVar = values.values;
                int i10 = initialize;
                ThreeDS2ServiceInstance = ((-2) - (~((i10 ^ 94) + ((i10 & 94) << 1)))) % 128;
            } else {
                valuesVar = values.valueOf;
                int i11 = ThreeDS2ServiceInstance;
                int i12 = i11 & 37;
                initialize = ((i12 - (~((i11 ^ 37) | i12))) - 1) % 128;
            }
            this.ThreeDS2Service = valuesVar;
            int i13 = ThreeDS2ServiceInstance;
            int i14 = i13 & 103;
            int i15 = ((i13 ^ 103) | i14) << 1;
            int i16 = -((i13 | 103) & (~i14));
            initialize = ((i15 ^ i16) + ((i16 & i15) << 1)) % 128;
        }
        int i17 = initialize;
        int i18 = (i17 & 73) + (i17 | 73);
        ThreeDS2ServiceInstance = i18 % 128;
        if (i18 % 2 != 0) {
            throw null;
        }
    }
}

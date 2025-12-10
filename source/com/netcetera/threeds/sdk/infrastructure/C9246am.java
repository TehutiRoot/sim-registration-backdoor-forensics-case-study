package com.netcetera.threeds.sdk.infrastructure;

import android.content.Context;
import android.graphics.Color;
import android.os.Build;
import android.text.InputFilter;
import android.view.KeyEvent;
import android.view.View;
import android.view.ViewConfiguration;
import android.widget.LinearLayout;
import android.widget.TextView;
import androidx.appcompat.app.AppCompatDelegate;
import androidx.core.view.GravityCompat;
import kotlin.text.Typography;
import kotlinx.serialization.json.internal.AbstractJsonLexerKt;
import org.bouncycastle.pqc.math.linearalgebra.Matrix;

/* renamed from: com.netcetera.threeds.sdk.infrastructure.am */
/* loaded from: classes5.dex */
public class C9246am extends AbstractC9758w<LinearLayout> implements save {
    private static int ConfigurationBuilder = 1;
    public static char[] ThreeDS2Service;
    private static final String ThreeDS2ServiceInstance;
    private static int addParam;
    private static final String get;
    private static final String getWarnings;
    private static final String values;
    private final String ConfigParameters;
    private final InterfaceC9511jo ThreeDS2Service$InitializationCallback;
    private TextView createTransaction;
    private final values initialize;
    private final View$OnTouchListenerC9242ai onCompleted;
    private final String onError;
    protected LinearLayout valueOf;

    /* renamed from: com.netcetera.threeds.sdk.infrastructure.am$1 */
    /* loaded from: classes5.dex */
    public static /* synthetic */ class C92471 {
        private static int ThreeDS2Service = 0;
        private static int ThreeDS2ServiceInstance = 1;
        static final /* synthetic */ int[] get;
        static final /* synthetic */ int[] valueOf;

        static {
            int[] iArr = new int[setStackTrace.values().length];
            valueOf = iArr;
            try {
                iArr[setStackTrace.valueOf.ordinal()] = 1;
                int i = ThreeDS2Service;
                int i2 = i & 101;
                ThreeDS2ServiceInstance = (((i | 101) & (~i2)) + (i2 << 1)) % 128;
            } catch (NoSuchFieldError unused) {
            }
            try {
                valueOf[setStackTrace.ThreeDS2ServiceInstance.ordinal()] = 2;
                int i3 = ThreeDS2Service;
                ThreeDS2ServiceInstance = (((i3 & (-62)) | ((~i3) & 61)) + ((i3 & 61) << 1)) % 128;
            } catch (NoSuchFieldError unused2) {
            }
            int[] iArr2 = new int[values.values().length];
            get = iArr2;
            try {
                iArr2[values.values.ordinal()] = 1;
                int i4 = ThreeDS2Service;
                int i5 = i4 ^ 29;
                ThreeDS2ServiceInstance = ((((i4 & 29) | i5) << 1) - i5) % 128;
            } catch (NoSuchFieldError unused3) {
            }
            try {
                get[values.ThreeDS2ServiceInstance.ordinal()] = 2;
                int i6 = ThreeDS2ServiceInstance;
                ThreeDS2Service = ((i6 & 53) + (i6 | 53)) % 128;
            } catch (NoSuchFieldError unused4) {
            }
            int i7 = ThreeDS2ServiceInstance;
            int i8 = (i7 & AppCompatDelegate.FEATURE_SUPPORT_ACTION_BAR) + (i7 | AppCompatDelegate.FEATURE_SUPPORT_ACTION_BAR);
            ThreeDS2Service = ((~i8) + (i8 << 1)) % 128;
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
    /* renamed from: com.netcetera.threeds.sdk.infrastructure.am$values */
    /* loaded from: classes5.dex */
    public static final class values {
        private static final /* synthetic */ values[] ThreeDS2Service;
        public static final values ThreeDS2ServiceInstance;
        public static int get = 0;
        private static int initialize = 1;
        private static int valueOf;
        public static final values values;

        static {
            valueOf();
            Object[] objArr = new Object[1];
            valueOf(View.MeasureSpec.getMode(0) + 2, (ViewConfiguration.getKeyRepeatDelay() >> 16) + 7, "\u0000\ufff3\ufff6\uffff\u0000\u0010\t", 114 - (ViewConfiguration.getMinimumFlingVelocity() >> 16), true, objArr);
            values valuesVar = new values(((String) objArr[0]).intern(), 0);
            values = valuesVar;
            Object[] objArr2 = new Object[1];
            valueOf(7 - KeyEvent.keyCodeFromString(""), 7 - Color.green(0), "\ufff0�\u0006\r\u0002\u0005�", (ViewConfiguration.getEdgeSlop() >> 16) + 117, false, objArr2);
            values valuesVar2 = new values(((String) objArr2[0]).intern(), 1);
            ThreeDS2ServiceInstance = valuesVar2;
            ThreeDS2Service = new values[]{valuesVar, valuesVar2};
            valueOf = (initialize + 31) % 128;
        }

        private values(String str, int i) {
        }

        public static void valueOf() {
            get = 35;
        }

        public static values[] values() {
            values[] valuesVarArr;
            int i = initialize + 91;
            valueOf = i % 128;
            if (i % 2 != 0) {
                valuesVarArr = (values[]) ThreeDS2Service.clone();
                int i2 = 71 / 0;
            } else {
                valuesVarArr = (values[]) ThreeDS2Service.clone();
            }
            int i3 = valueOf + 107;
            initialize = i3 % 128;
            if (i3 % 2 != 0) {
                return valuesVarArr;
            }
            throw null;
        }

        public static values valueOf(String str) {
            int i = initialize + 15;
            valueOf = i % 128;
            if (i % 2 != 0) {
                Enum.valueOf(values.class, str);
                throw null;
            }
            values valuesVar = (values) Enum.valueOf(values.class, str);
            int i2 = initialize + 7;
            valueOf = i2 % 128;
            if (i2 % 2 == 0) {
                return valuesVar;
            }
            throw null;
        }

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
                int r5 = com.netcetera.threeds.sdk.infrastructure.C9246am.values.get     // Catch: java.lang.Throwable -> L2f
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
            throw new UnsupportedOperationException("Method not decompiled: com.netcetera.threeds.sdk.infrastructure.C9246am.values.valueOf(int, int, java.lang.String, int, boolean, java.lang.Object[]):void");
        }
    }

    static {
        valueOf();
        Object[] objArr = new Object[1];
        valueOf("\u0000\u0001\u0000\u0000\u0000\u0000\u0001\u0000", new int[]{177, 8, 100, 0}, false, objArr);
        getWarnings = ((String) objArr[0]).intern();
        Object[] objArr2 = new Object[1];
        valueOf("\u0001\u0000\u0000\u0000\u0001\u0000\u0001\u0000\u0001\u0001", new int[]{167, 10, 0, 0}, false, objArr2);
        ThreeDS2ServiceInstance = ((String) objArr2[0]).intern();
        Object[] objArr3 = new Object[1];
        valueOf("\u0001\u0000\u0000\u0001\u0001\u0001\u0001\u0001\u0000\u0000\u0001\u0000\u0000\u0001\u0001\u0000\u0000\u0000\u0001\u0001\u0001\u0001\u0000\u0000\u0001\u0000\u0001\u0001\u0001\u0001\u0001\u0000", new int[]{74, 32, 0, 11}, true, objArr3);
        get = ((String) objArr3[0]).intern();
        Object[] objArr4 = new Object[1];
        valueOf("\u0000\u0001\u0000\u0000\u0001\u0001\u0001\u0001\u0000\u0000\u0000\u0000\u0001\u0001\u0000\u0001\u0000\u0000\u0001\u0001\u0001\u0001\u0001\u0000\u0000\u0000\u0000\u0001\u0001\u0001\u0001\u0001", new int[]{0, 32, 0, 14}, false, objArr4);
        values = ((String) objArr4[0]).intern();
        int i = addParam + 121;
        ConfigurationBuilder = i % 128;
        if (i % 2 == 0) {
            int i2 = 72 / 0;
        }
    }

    public C9246am(Context context, InterfaceC9511jo interfaceC9511jo, values valuesVar, View$OnTouchListenerC9242ai view$OnTouchListenerC9242ai, String str, String str2) {
        super(context);
        this.ThreeDS2Service$InitializationCallback = interfaceC9511jo;
        this.initialize = valuesVar;
        this.onCompleted = view$OnTouchListenerC9242ai;
        this.ConfigParameters = str;
        this.onError = str2;
    }

    public static C9246am ThreeDS2ServiceInstance(Context context, InterfaceC9511jo interfaceC9511jo, InterfaceC9513jq interfaceC9513jq) {
        View$OnTouchListenerC9242ai view$OnTouchListenerC9242ai = View$OnTouchListenerC9242ai.get(context, interfaceC9513jq);
        values valuesVar = values.ThreeDS2ServiceInstance;
        Object[] objArr = new Object[1];
        valueOf("\u0001\u0000\u0000\u0001\u0001\u0001\u0001\u0001\u0000\u0000\u0001\u0000\u0000\u0001\u0001\u0000\u0000\u0000\u0001\u0001\u0001\u0001\u0000\u0000\u0001\u0000\u0001\u0001\u0001\u0001\u0001\u0000", new int[]{74, 32, 0, 11}, true, objArr);
        String intern = ((String) objArr[0]).intern();
        Object[] objArr2 = new Object[1];
        valueOf("\u0000\u0000\u0001\u0000\u0001\u0001\u0001\u0001\u0001\u0001\u0000\u0000\u0001\u0001\u0001\u0001\u0001\u0001\u0001\u0001\u0001\u0000\u0001\u0001\u0001\u0000\u0000\u0000\u0000\u0000\u0000\u0001\u0001\u0001\u0000\u0001\u0001\u0001\u0000\u0000\u0000\u0001", new int[]{106, 42, 36, 17}, false, objArr2);
        C9246am c9246am = new C9246am(context, interfaceC9511jo, valuesVar, view$OnTouchListenerC9242ai, intern, ((String) objArr2[0]).intern());
        addParam = (ConfigurationBuilder + 71) % 128;
        return c9246am;
    }

    public static void valueOf() {
        ThreeDS2Service = new char[]{':', 'd', '_', '^', 'c', 'j', 'j', 'l', 'X', 'X', 'o', 'd', '^', 'i', Matrix.MATRIX_TYPE_RANDOM_UT, 'Y', 'q', 's', AbstractJsonLexerKt.UNICODE_ESC, AbstractJsonLexerKt.END_LIST, 'X', 's', 'f', '_', 'V', 'Y', 'n', 'n', 'o', 'n', 'i', 'i', '1', 'e', 'd', 'f', 'l', 'h', 'i', 'j', 'f', 'b', 'j', 'o', 'd', 'a', 'e', 'd', 'f', 'l', 'h', 'i', 'j', 'f', 'b', 'b', 'i', 'q', 's', AbstractJsonLexerKt.UNICODE_ESC, 'l', '`', 'h', 's', 'k', 'g', 'n', 'i', 'b', 'e', 'f', 'a', 'c', 'h', '!', 'V', '_', 'f', 's', 'X', AbstractJsonLexerKt.END_LIST, AbstractJsonLexerKt.UNICODE_ESC, 's', 'q', 'Y', Matrix.MATRIX_TYPE_ZERO, 's', 'e', 'f', 'o', 'X', 'X', 'l', 'j', 'j', 'c', '^', '_', 'd', 'q', 'i', 'i', 'n', 'o', 'n', 'n', Matrix.MATRIX_TYPE_RANDOM_LT, 151, 153, 144, 132, 140, 151, 143, 141, 153, 151, 139, 137, 138, 133, 135, 140, 139, 137, 136, 138, 144, 140, 141, 142, 138, 134, 142, 147, 136, 133, 137, 136, 138, 144, 140, 141, 142, 138, 134, 134, 141, 217, 133, 211, 212, 217, 217, 218, 199, 133, 201, 206, 209, 198, 219, 211, Typography.registered, 202, 213, 222, '9', 'p', 'p', 'a', 'Q', Matrix.MATRIX_TYPE_RANDOM_REGULAR, 'I', 'Y', 'i', 'd', 'j', 204, 206, Typography.times, 217, Typography.times, 212, 207};
    }

    @Override // com.netcetera.threeds.sdk.infrastructure.AbstractC9758w
    public /* synthetic */ LinearLayout get(Context context) {
        ConfigurationBuilder = (addParam + 3) % 128;
        LinearLayout values2 = values(context);
        addParam = (ConfigurationBuilder + 51) % 128;
        return values2;
    }

    public LinearLayout values(Context context) {
        this.valueOf = new LinearLayout(context);
        LinearLayout.LayoutParams layoutParams = new LinearLayout.LayoutParams(-1, -2);
        layoutParams.setMargins(0, 0, 0, 0);
        this.valueOf.setLayoutParams(layoutParams);
        this.valueOf.setGravity(1);
        this.valueOf.setOrientation(1);
        LinearLayout.LayoutParams layoutParams2 = new LinearLayout.LayoutParams(-1, -2);
        TextView textView = new TextView(context);
        this.createTransaction = textView;
        textView.setLayoutParams(layoutParams2);
        this.createTransaction.setGravity(GravityCompat.START);
        this.createTransaction.setVisibility(8);
        TextView textView2 = this.createTransaction;
        int i = C9375et.ThreeDS2ServiceInstance;
        textView2.setPadding(0, i, 0, i);
        values(this.createTransaction, this.onError);
        this.valueOf.addView(this.createTransaction);
        this.valueOf.addView(this.onCompleted.ThreeDS2Service());
        C9377ev.valueOf(this.createTransaction, this.ThreeDS2Service$InitializationCallback, 1);
        LinearLayout linearLayout = this.valueOf;
        ConfigurationBuilder = (addParam + 87) % 128;
        return linearLayout;
    }

    public static C9246am get(Context context, InterfaceC9511jo interfaceC9511jo, InterfaceC9513jq interfaceC9513jq) {
        View$OnTouchListenerC9242ai valueOf = View$OnTouchListenerC9242ai.valueOf(context, interfaceC9513jq);
        values valuesVar = values.values;
        Object[] objArr = new Object[1];
        valueOf("\u0000\u0001\u0000\u0000\u0001\u0001\u0001\u0001\u0000\u0000\u0000\u0000\u0001\u0001\u0000\u0001\u0000\u0000\u0001\u0001\u0001\u0001\u0001\u0000\u0000\u0000\u0000\u0001\u0001\u0001\u0001\u0001", new int[]{0, 32, 0, 14}, false, objArr);
        String intern = ((String) objArr[0]).intern();
        Object[] objArr2 = new Object[1];
        valueOf("\u0001\u0001\u0001\u0001\u0000\u0001\u0001\u0001\u0000\u0000\u0000\u0000\u0000\u0000\u0001\u0001\u0001\u0000\u0001\u0001\u0001\u0000\u0000\u0000\u0001\u0000\u0000\u0001\u0000\u0001\u0001\u0001\u0001\u0000\u0001\u0001\u0000\u0001\u0001\u0001\u0001\u0001", new int[]{32, 42, 0, 0}, false, objArr2);
        C9246am c9246am = new C9246am(context, interfaceC9511jo, valuesVar, valueOf, intern, ((String) objArr2[0]).intern());
        int i = ConfigurationBuilder + 89;
        addParam = i % 128;
        if (i % 2 != 0) {
            int i2 = 21 / 0;
        }
        return c9246am;
    }

    @Override // com.netcetera.threeds.sdk.infrastructure.save
    public void valueOf(InterfaceC9370eo interfaceC9370eo) {
        int i = addParam + 81;
        ConfigurationBuilder = i % 128;
        if (i % 2 != 0) {
            interfaceC9370eo.values(this.ConfigParameters, String.valueOf(this.onCompleted.ThreeDS2Service().getText()));
            this.onCompleted.valueOf(interfaceC9370eo);
            return;
        }
        interfaceC9370eo.values(this.ConfigParameters, String.valueOf(this.onCompleted.ThreeDS2Service().getText()));
        this.onCompleted.valueOf(interfaceC9370eo);
        throw null;
    }

    public String get() {
        int i = addParam + 35;
        ConfigurationBuilder = i % 128;
        if (i % 2 != 0) {
            if (this.onCompleted.ThreeDS2Service() != null) {
                ConfigurationBuilder = (addParam + 71) % 128;
                this.onCompleted.ThreeDS2Service().setEnabled(false);
                return this.onCompleted.ThreeDS2Service().getText().toString();
            }
            addParam = (ConfigurationBuilder + 3) % 128;
            return null;
        }
        this.onCompleted.ThreeDS2Service();
        throw null;
    }

    @Override // com.netcetera.threeds.sdk.infrastructure.contains
    public void valueOf(setAllCaps setallcaps) {
        setIncludeFontPadding removeParam;
        values();
        int i = C92471.get[this.initialize.ordinal()];
        if (i == 1) {
            removeParam = setallcaps.removeParam();
        } else if (i == 2) {
            removeParam = setallcaps.apiKey();
        } else {
            Object[] objArr = new Object[1];
            valueOf(null, new int[]{148, 19, 101, 16}, true, objArr);
            throw new IllegalStateException(((String) objArr[0]).intern());
        }
        if (!(!removeParam.getSDKVersion())) {
            get(removeParam.valueOf());
            if (fillInStackTrace.valueOf.equals(removeParam.values())) {
                this.onCompleted.ThreeDS2Service().setInputType(2);
            }
            if (getInfo.ThreeDS2Service.equals(removeParam.cleanup())) {
                this.onCompleted.get();
            }
            if (!(!clear.ThreeDS2ServiceInstance.equals(removeParam.getSDKInfo()))) {
                this.onCompleted.ThreeDS2ServiceInstance();
                addParam = (ConfigurationBuilder + 1) % 128;
            }
            if (Build.VERSION.SDK_INT >= 26) {
                addParam = (ConfigurationBuilder + 117) % 128;
                if (!addSuppressed.get.equals(removeParam.ThreeDS2Service())) {
                    this.onCompleted.ThreeDS2Service().setImportantForAutofill(2);
                } else {
                    addParam = (ConfigurationBuilder + 97) % 128;
                    int i2 = C92471.valueOf[removeParam.ThreeDS2ServiceInstance().ordinal()];
                    if (i2 == 1) {
                        Object[] objArr2 = new Object[1];
                        valueOf("\u0001\u0000\u0000\u0000\u0001\u0000\u0001\u0000\u0001\u0001", new int[]{167, 10, 0, 0}, false, objArr2);
                        this.onCompleted.ThreeDS2Service().setAutofillHints(new String[]{((String) objArr2[0]).intern()});
                        this.onCompleted.ThreeDS2Service().setImportantForAutofill(1);
                        addParam = (ConfigurationBuilder + 97) % 128;
                    } else if (i2 == 2) {
                        Object[] objArr3 = new Object[1];
                        valueOf("\u0000\u0001\u0000\u0000\u0000\u0000\u0001\u0000", new int[]{177, 8, 100, 0}, false, objArr3);
                        this.onCompleted.ThreeDS2Service().setAutofillHints(new String[]{((String) objArr3[0]).intern()});
                        this.onCompleted.ThreeDS2Service().setImportantForAutofill(1);
                    }
                }
            }
            if (removeParam.get() != null) {
                this.onCompleted.ThreeDS2Service().setFilters(new InputFilter[]{new InputFilter.LengthFilter(removeParam.get().intValue())});
                return;
            }
            return;
        }
        this.valueOf.setVisibility(8);
    }

    private void get(String str) {
        if (C9669om.values((CharSequence) str)) {
            this.createTransaction.setVisibility(8);
            return;
        }
        addParam = (ConfigurationBuilder + 99) % 128;
        this.createTransaction.setText(str);
        this.createTransaction.setVisibility(0);
        ConfigurationBuilder = (addParam + 37) % 128;
    }

    @Override // com.netcetera.threeds.sdk.infrastructure.save
    public void values(InterfaceC9373er interfaceC9373er) {
        ConfigurationBuilder = (addParam + 69) % 128;
        values();
        this.onCompleted.values(interfaceC9373er);
        String valueOf = interfaceC9373er.valueOf(this.ConfigParameters, null);
        if (C9669om.ThreeDS2ServiceInstance(valueOf)) {
            int i = addParam + 29;
            ConfigurationBuilder = i % 128;
            if (i % 2 != 0) {
                this.onCompleted.ThreeDS2Service().setText(valueOf);
                return;
            }
            this.onCompleted.ThreeDS2Service().setText(valueOf);
            int i2 = 72 / 0;
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
            char[] r8 = com.netcetera.threeds.sdk.infrastructure.C9246am.ThreeDS2Service     // Catch: java.lang.Throwable -> L38
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
        throw new UnsupportedOperationException("Method not decompiled: com.netcetera.threeds.sdk.infrastructure.C9246am.valueOf(java.lang.String, int[], boolean, java.lang.Object[]):void");
    }
}

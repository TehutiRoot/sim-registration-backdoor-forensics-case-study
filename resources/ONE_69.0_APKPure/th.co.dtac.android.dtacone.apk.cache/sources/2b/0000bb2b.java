package com.netcetera.threeds.sdk.infrastructure;

import android.content.Context;
import android.graphics.drawable.Drawable;
import android.os.Process;
import android.text.TextUtils;
import android.util.TypedValue;
import android.view.KeyEvent;
import android.view.View;
import android.view.ViewConfiguration;
import android.widget.CompoundButton;
import android.widget.ExpandableListView;
import android.widget.LinearLayout;
import android.widget.RadioButton;
import android.widget.RadioGroup;
import java.util.ArrayList;
import java.util.List;

/* renamed from: com.netcetera.threeds.sdk.infrastructure.bj */
/* loaded from: classes5.dex */
public class C9263bj extends AbstractC9747w<LinearLayout> implements save, writeReplace {
    public static char ThreeDS2Service = 0;
    private static final ArrayList<String> ThreeDS2ServiceInstance;
    private static int createTransaction = 1;
    public static char[] get;
    private static int getWarnings;
    private static final String values;
    private RadioGroup initialize;
    private final InterfaceC9500jo valueOf;

    static {
        valueOf();
        Object[] objArr = new Object[1];
        get(Drawable.resolveOpacity(0, 0) + 38, "\u0011\u0013\u0002\b\u0016\u0011\u0018\u0005\u0003\u0011\u0016\u000b\r\u0000\u0014\u0018\u0015\u0007\u000f\u0017\u0003\f\u0016\u0004\u0002\r\u0002\u0017\b\u0010\u0011\u0015\u0002\u0015\u000e\u0011\n\u0007", (byte) (87 - (ViewConfiguration.getMinimumFlingVelocity() >> 16)), objArr);
        values = ((String) objArr[0]).intern();
        ThreeDS2ServiceInstance = new ArrayList<String>() { // from class: com.netcetera.threeds.sdk.infrastructure.bj.3
            public static boolean ThreeDS2Service = true;
            public static boolean get = true;
            public static char[] valueOf = {252, 257, 250, 261, 254, 263, 256, 248, 270, 258, 268, 269, 255, 264, 201, 202, 203, 204, 205, 206, 207, 208};
            public static int values = 153;

            {
                Object[] objArr2 = new Object[1];
                get(View.MeasureSpec.makeMeasureSpec(0, 0) + 127, null, null, "\u008f\u0088\u008e\u008d\u0086\u008a\u0088\u008c\u0081\u0085\u0084\u0085\u008b\u0088\u0085\u0087\u0086\u0085\u0084\u0084\u0083\u0082\u0081\u0088\u008a\u0089\u0088\u0085\u0087\u0086\u0085\u0084\u0084\u0083\u0082\u0081", objArr2);
                add(((String) objArr2[0]).intern());
                Object[] objArr3 = new Object[1];
                get(Process.getGidForName("") + 128, null, null, "\u0090\u0088\u008e\u008d\u0086\u008a\u0088\u008c\u0081\u0085\u0084\u0085\u008b\u0088\u0085\u0087\u0086\u0085\u0084\u0084\u0083\u0082\u0081\u0088\u008a\u0089\u0088\u0085\u0087\u0086\u0085\u0084\u0084\u0083\u0082\u0081", objArr3);
                add(((String) objArr3[0]).intern());
                Object[] objArr4 = new Object[1];
                get(127 - (ViewConfiguration.getKeyRepeatTimeout() >> 16), null, null, "\u0091\u0088\u008e\u008d\u0086\u008a\u0088\u008c\u0081\u0085\u0084\u0085\u008b\u0088\u0085\u0087\u0086\u0085\u0084\u0084\u0083\u0082\u0081\u0088\u008a\u0089\u0088\u0085\u0087\u0086\u0085\u0084\u0084\u0083\u0082\u0081", objArr4);
                add(((String) objArr4[0]).intern());
                Object[] objArr5 = new Object[1];
                get(127 - (TypedValue.complexToFloat(0) > 0.0f ? 1 : (TypedValue.complexToFloat(0) == 0.0f ? 0 : -1)), null, null, "\u0092\u0088\u008e\u008d\u0086\u008a\u0088\u008c\u0081\u0085\u0084\u0085\u008b\u0088\u0085\u0087\u0086\u0085\u0084\u0084\u0083\u0082\u0081\u0088\u008a\u0089\u0088\u0085\u0087\u0086\u0085\u0084\u0084\u0083\u0082\u0081", objArr5);
                add(((String) objArr5[0]).intern());
                Object[] objArr6 = new Object[1];
                get(ExpandableListView.getPackedPositionChild(0L) + 128, null, null, "\u0093\u0088\u008e\u008d\u0086\u008a\u0088\u008c\u0081\u0085\u0084\u0085\u008b\u0088\u0085\u0087\u0086\u0085\u0084\u0084\u0083\u0082\u0081\u0088\u008a\u0089\u0088\u0085\u0087\u0086\u0085\u0084\u0084\u0083\u0082\u0081", objArr6);
                add(((String) objArr6[0]).intern());
                Object[] objArr7 = new Object[1];
                get(127 - View.resolveSizeAndState(0, 0, 0), null, null, "\u0094\u0088\u008e\u008d\u0086\u008a\u0088\u008c\u0081\u0085\u0084\u0085\u008b\u0088\u0085\u0087\u0086\u0085\u0084\u0084\u0083\u0082\u0081\u0088\u008a\u0089\u0088\u0085\u0087\u0086\u0085\u0084\u0084\u0083\u0082\u0081", objArr7);
                add(((String) objArr7[0]).intern());
                Object[] objArr8 = new Object[1];
                get(Process.getGidForName("") + 128, null, null, "\u0095\u0088\u008e\u008d\u0086\u008a\u0088\u008c\u0081\u0085\u0084\u0085\u008b\u0088\u0085\u0087\u0086\u0085\u0084\u0084\u0083\u0082\u0081\u0088\u008a\u0089\u0088\u0085\u0087\u0086\u0085\u0084\u0084\u0083\u0082\u0081", objArr8);
                add(((String) objArr8[0]).intern());
                Object[] objArr9 = new Object[1];
                get(127 - TextUtils.getCapsMode("", 0, 0), null, null, "\u0096\u0088\u008e\u008d\u0086\u008a\u0088\u008c\u0081\u0085\u0084\u0085\u008b\u0088\u0085\u0087\u0086\u0085\u0084\u0084\u0083\u0082\u0081\u0088\u008a\u0089\u0088\u0085\u0087\u0086\u0085\u0084\u0084\u0083\u0082\u0081", objArr9);
                add(((String) objArr9[0]).intern());
            }

            /* JADX WARN: Code restructure failed: missing block: B:0:?, code lost:
                r9 = r9;
             */
            /*
                Code decompiled incorrectly, please refer to instructions dump.
                To view partially-correct code enable 'Show inconsistent code' option in preferences
            */
            private static void get(int r6, int[] r7, java.lang.String r8, java.lang.String r9, java.lang.Object[] r10) {
                /*
                    if (r9 == 0) goto L8
                    java.lang.String r0 = "ISO-8859-1"
                    byte[] r9 = r9.getBytes(r0)
                L8:
                    byte[] r9 = (byte[]) r9
                    if (r8 == 0) goto L10
                    char[] r8 = r8.toCharArray()
                L10:
                    char[] r8 = (char[]) r8
                    java.lang.Object r0 = com.netcetera.threeds.sdk.infrastructure.ThreeDS2Service.InitializationCallback.values
                    monitor-enter(r0)
                    char[] r1 = com.netcetera.threeds.sdk.infrastructure.C9263bj.C92643.valueOf     // Catch: java.lang.Throwable -> L42
                    int r2 = com.netcetera.threeds.sdk.infrastructure.C9263bj.C92643.values     // Catch: java.lang.Throwable -> L42
                    boolean r3 = com.netcetera.threeds.sdk.infrastructure.C9263bj.C92643.get     // Catch: java.lang.Throwable -> L42
                    r4 = 0
                    if (r3 == 0) goto L4d
                    int r7 = r9.length     // Catch: java.lang.Throwable -> L42
                    com.netcetera.threeds.sdk.infrastructure.ThreeDS2Service.InitializationCallback.ThreeDS2Service = r7     // Catch: java.lang.Throwable -> L42
                    char[] r7 = new char[r7]     // Catch: java.lang.Throwable -> L42
                    com.netcetera.threeds.sdk.infrastructure.ThreeDS2Service.InitializationCallback.ThreeDS2ServiceInstance = r4     // Catch: java.lang.Throwable -> L42
                L25:
                    int r8 = com.netcetera.threeds.sdk.infrastructure.ThreeDS2Service.InitializationCallback.ThreeDS2ServiceInstance     // Catch: java.lang.Throwable -> L42
                    int r3 = com.netcetera.threeds.sdk.infrastructure.ThreeDS2Service.InitializationCallback.ThreeDS2Service     // Catch: java.lang.Throwable -> L42
                    if (r8 >= r3) goto L44
                    int r8 = com.netcetera.threeds.sdk.infrastructure.ThreeDS2Service.InitializationCallback.ThreeDS2ServiceInstance     // Catch: java.lang.Throwable -> L42
                    int r3 = com.netcetera.threeds.sdk.infrastructure.ThreeDS2Service.InitializationCallback.ThreeDS2Service     // Catch: java.lang.Throwable -> L42
                    int r3 = r3 + (-1)
                    int r5 = com.netcetera.threeds.sdk.infrastructure.ThreeDS2Service.InitializationCallback.ThreeDS2ServiceInstance     // Catch: java.lang.Throwable -> L42
                    int r3 = r3 - r5
                    r3 = r9[r3]     // Catch: java.lang.Throwable -> L42
                    int r3 = r3 + r6
                    char r3 = r1[r3]     // Catch: java.lang.Throwable -> L42
                    int r3 = r3 - r2
                    char r3 = (char) r3     // Catch: java.lang.Throwable -> L42
                    r7[r8] = r3     // Catch: java.lang.Throwable -> L42
                    int r5 = r5 + 1
                    com.netcetera.threeds.sdk.infrastructure.ThreeDS2Service.InitializationCallback.ThreeDS2ServiceInstance = r5     // Catch: java.lang.Throwable -> L42
                    goto L25
                L42:
                    r6 = move-exception
                    goto Lab
                L44:
                    java.lang.String r6 = new java.lang.String     // Catch: java.lang.Throwable -> L42
                    r6.<init>(r7)     // Catch: java.lang.Throwable -> L42
                    monitor-exit(r0)     // Catch: java.lang.Throwable -> L42
                    r10[r4] = r6
                    return
                L4d:
                    boolean r9 = com.netcetera.threeds.sdk.infrastructure.C9263bj.C92643.ThreeDS2Service     // Catch: java.lang.Throwable -> L42
                    if (r9 == 0) goto L7e
                    int r7 = r8.length     // Catch: java.lang.Throwable -> L42
                    com.netcetera.threeds.sdk.infrastructure.ThreeDS2Service.InitializationCallback.ThreeDS2Service = r7     // Catch: java.lang.Throwable -> L42
                    char[] r7 = new char[r7]     // Catch: java.lang.Throwable -> L42
                    com.netcetera.threeds.sdk.infrastructure.ThreeDS2Service.InitializationCallback.ThreeDS2ServiceInstance = r4     // Catch: java.lang.Throwable -> L42
                L58:
                    int r9 = com.netcetera.threeds.sdk.infrastructure.ThreeDS2Service.InitializationCallback.ThreeDS2ServiceInstance     // Catch: java.lang.Throwable -> L42
                    int r3 = com.netcetera.threeds.sdk.infrastructure.ThreeDS2Service.InitializationCallback.ThreeDS2Service     // Catch: java.lang.Throwable -> L42
                    if (r9 >= r3) goto L75
                    int r9 = com.netcetera.threeds.sdk.infrastructure.ThreeDS2Service.InitializationCallback.ThreeDS2ServiceInstance     // Catch: java.lang.Throwable -> L42
                    int r3 = com.netcetera.threeds.sdk.infrastructure.ThreeDS2Service.InitializationCallback.ThreeDS2Service     // Catch: java.lang.Throwable -> L42
                    int r3 = r3 + (-1)
                    int r5 = com.netcetera.threeds.sdk.infrastructure.ThreeDS2Service.InitializationCallback.ThreeDS2ServiceInstance     // Catch: java.lang.Throwable -> L42
                    int r3 = r3 - r5
                    char r3 = r8[r3]     // Catch: java.lang.Throwable -> L42
                    int r3 = r3 - r6
                    char r3 = r1[r3]     // Catch: java.lang.Throwable -> L42
                    int r3 = r3 - r2
                    char r3 = (char) r3     // Catch: java.lang.Throwable -> L42
                    r7[r9] = r3     // Catch: java.lang.Throwable -> L42
                    int r5 = r5 + 1
                    com.netcetera.threeds.sdk.infrastructure.ThreeDS2Service.InitializationCallback.ThreeDS2ServiceInstance = r5     // Catch: java.lang.Throwable -> L42
                    goto L58
                L75:
                    java.lang.String r6 = new java.lang.String     // Catch: java.lang.Throwable -> L42
                    r6.<init>(r7)     // Catch: java.lang.Throwable -> L42
                    monitor-exit(r0)     // Catch: java.lang.Throwable -> L42
                    r10[r4] = r6
                    return
                L7e:
                    int r8 = r7.length     // Catch: java.lang.Throwable -> L42
                    com.netcetera.threeds.sdk.infrastructure.ThreeDS2Service.InitializationCallback.ThreeDS2Service = r8     // Catch: java.lang.Throwable -> L42
                    char[] r8 = new char[r8]     // Catch: java.lang.Throwable -> L42
                    com.netcetera.threeds.sdk.infrastructure.ThreeDS2Service.InitializationCallback.ThreeDS2ServiceInstance = r4     // Catch: java.lang.Throwable -> L42
                L85:
                    int r9 = com.netcetera.threeds.sdk.infrastructure.ThreeDS2Service.InitializationCallback.ThreeDS2ServiceInstance     // Catch: java.lang.Throwable -> L42
                    int r3 = com.netcetera.threeds.sdk.infrastructure.ThreeDS2Service.InitializationCallback.ThreeDS2Service     // Catch: java.lang.Throwable -> L42
                    if (r9 >= r3) goto La2
                    int r9 = com.netcetera.threeds.sdk.infrastructure.ThreeDS2Service.InitializationCallback.ThreeDS2ServiceInstance     // Catch: java.lang.Throwable -> L42
                    int r3 = com.netcetera.threeds.sdk.infrastructure.ThreeDS2Service.InitializationCallback.ThreeDS2Service     // Catch: java.lang.Throwable -> L42
                    int r3 = r3 + (-1)
                    int r5 = com.netcetera.threeds.sdk.infrastructure.ThreeDS2Service.InitializationCallback.ThreeDS2ServiceInstance     // Catch: java.lang.Throwable -> L42
                    int r3 = r3 - r5
                    r3 = r7[r3]     // Catch: java.lang.Throwable -> L42
                    int r3 = r3 - r6
                    char r3 = r1[r3]     // Catch: java.lang.Throwable -> L42
                    int r3 = r3 - r2
                    char r3 = (char) r3     // Catch: java.lang.Throwable -> L42
                    r8[r9] = r3     // Catch: java.lang.Throwable -> L42
                    int r5 = r5 + 1
                    com.netcetera.threeds.sdk.infrastructure.ThreeDS2Service.InitializationCallback.ThreeDS2ServiceInstance = r5     // Catch: java.lang.Throwable -> L42
                    goto L85
                La2:
                    java.lang.String r6 = new java.lang.String     // Catch: java.lang.Throwable -> L42
                    r6.<init>(r8)     // Catch: java.lang.Throwable -> L42
                    monitor-exit(r0)     // Catch: java.lang.Throwable -> L42
                    r10[r4] = r6
                    return
                Lab:
                    monitor-exit(r0)
                    throw r6
                */
                throw new UnsupportedOperationException("Method not decompiled: com.netcetera.threeds.sdk.infrastructure.C9263bj.C92643.get(int, int[], java.lang.String, java.lang.String, java.lang.Object[]):void");
            }
        };
        int i = createTransaction + 81;
        getWarnings = i % 128;
        if (i % 2 != 0) {
            int i2 = 66 / 0;
        }
    }

    public C9263bj(Context context, InterfaceC9500jo interfaceC9500jo) {
        super(context);
        this.valueOf = interfaceC9500jo;
    }

    public static void valueOf() {
        get = new char[]{5, 13819, 13813, 13812, 3, 13795, 13775, 13821, 2, 13810, 13779, 1, 13823, 13815, 4, 6, 13769, 13814, 13811, 13777, 13785, 13817, 13806, 13807, 13802};
        ThreeDS2Service = (char) 5;
    }

    public LinearLayout ThreeDS2ServiceInstance(Context context) {
        LinearLayout linearLayout = new LinearLayout(context);
        LinearLayout.LayoutParams layoutParams = new LinearLayout.LayoutParams(-1, -2);
        int i = C9364et.getWarnings;
        linearLayout.setPadding(i, C9364et.ThreeDS2Service, i, 0);
        linearLayout.setLayoutParams(layoutParams);
        linearLayout.setOrientation(1);
        RadioGroup radioGroup = new RadioGroup(context);
        this.initialize = radioGroup;
        radioGroup.setLayoutParams(C9367ex.valueOf());
        linearLayout.addView(this.initialize);
        getWarnings = (createTransaction + 85) % 128;
        return linearLayout;
    }

    @Override // com.netcetera.threeds.sdk.infrastructure.AbstractC9747w
    public /* synthetic */ LinearLayout get(Context context) {
        getWarnings = (createTransaction + 75) % 128;
        LinearLayout ThreeDS2ServiceInstance2 = ThreeDS2ServiceInstance(context);
        int i = createTransaction + 49;
        getWarnings = i % 128;
        if (i % 2 == 0) {
            return ThreeDS2ServiceInstance2;
        }
        throw null;
    }

    @Override // com.netcetera.threeds.sdk.infrastructure.save
    public void values(InterfaceC9362er interfaceC9362er) {
        CompoundButton compoundButton;
        values();
        Object[] objArr = new Object[1];
        get(View.MeasureSpec.getMode(0) + 38, "\u0011\u0013\u0002\b\u0016\u0011\u0018\u0005\u0003\u0011\u0016\u000b\r\u0000\u0014\u0018\u0015\u0007\u000f\u0017\u0003\f\u0016\u0004\u0002\r\u0002\u0017\b\u0010\u0011\u0015\u0002\u0015\u000e\u0011\n\u0007", (byte) (KeyEvent.normalizeMetaState(0) + 87), objArr);
        int intValue = interfaceC9362er.get(((String) objArr[0]).intern(), -1).intValue();
        if (intValue != -1 && (compoundButton = (CompoundButton) this.initialize.getChildAt(intValue)) != null) {
            getWarnings = (createTransaction + 101) % 128;
            compoundButton.setChecked(true);
            createTransaction = (getWarnings + 25) % 128;
        }
    }

    private /* synthetic */ void get(setCursorVisible setcursorvisible, CompoundButton compoundButton, boolean z) {
        getWarnings = (createTransaction + 95) % 128;
        if (compoundButton.isChecked()) {
            createTransaction = (getWarnings + 75) % 128;
            get(setcursorvisible.ThreeDS2Service());
            createTransaction = (getWarnings + 75) % 128;
        }
    }

    public static /* synthetic */ void valueOf(C9263bj c9263bj, setCursorVisible setcursorvisible, CompoundButton compoundButton, boolean z) {
        int i = createTransaction + 109;
        getWarnings = i % 128;
        int i2 = i % 2;
        c9263bj.get(setcursorvisible, compoundButton, z);
        if (i2 != 0) {
            int i3 = 84 / 0;
        }
        int i4 = createTransaction + 85;
        getWarnings = i4 % 128;
        if (i4 % 2 != 0) {
            throw null;
        }
    }

    @Override // com.netcetera.threeds.sdk.infrastructure.contains
    public void valueOf(setAllCaps setallcaps) {
        createTransaction = (getWarnings + 119) % 128;
        values();
        List<setCursorVisible> SchemeConfiguration = setallcaps.SchemeConfiguration();
        this.initialize.removeAllViews();
        if (SchemeConfiguration != null && !SchemeConfiguration.isEmpty()) {
            for (int i = 0; i < SchemeConfiguration.size(); i++) {
                setCursorVisible setcursorvisible = SchemeConfiguration.get(i);
                RadioButton radioButton = new RadioButton(this.initialize.getContext());
                radioButton.setText(setcursorvisible.ThreeDS2ServiceInstance());
                int i2 = C9364et.ThreeDS2ServiceInstance;
                radioButton.setPadding(0, i2, 0, i2);
                radioButton.setMinHeight(C9364et.getSDKInfo);
                radioButton.setOnCheckedChangeListener(new C9265bk(this, setcursorvisible));
                ArrayList<String> arrayList = ThreeDS2ServiceInstance;
                if (i < arrayList.size()) {
                    values(radioButton, arrayList.get(i));
                }
                C9366ev.values(radioButton, this.valueOf);
                this.initialize.addView(radioButton);
            }
            return;
        }
        int i3 = getWarnings + 85;
        createTransaction = i3 % 128;
        if (i3 % 2 == 0) {
            throw null;
        }
    }

    private void get(String str) {
        getWarnings = (createTransaction + 99) % 128;
        ThreeDS2Service().setTag(str);
        int i = createTransaction + 79;
        getWarnings = i % 128;
        if (i % 2 != 0) {
            throw null;
        }
    }

    @Override // com.netcetera.threeds.sdk.infrastructure.writeReplace
    public isEmpty get() {
        values();
        C9262bi c9262bi = new C9262bi((String) ThreeDS2Service().getTag());
        getWarnings = (createTransaction + 115) % 128;
        return c9262bi;
    }

    /* JADX WARN: Code restructure failed: missing block: B:0:?, code lost:
        r11 = r11;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    private static void get(int r10, java.lang.String r11, byte r12, java.lang.Object[] r13) {
        /*
            Method dump skipped, instructions count: 252
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: com.netcetera.threeds.sdk.infrastructure.C9263bj.get(int, java.lang.String, byte, java.lang.Object[]):void");
    }

    @Override // com.netcetera.threeds.sdk.infrastructure.save
    public void valueOf(InterfaceC9359eo interfaceC9359eo) {
        int i = getWarnings + 125;
        createTransaction = i % 128;
        int i2 = i % 2 == 0 ? 1 : 0;
        while (true) {
            if (i2 >= this.initialize.getChildCount()) {
                i2 = -1;
                break;
            }
            int i3 = getWarnings + 29;
            createTransaction = i3 % 128;
            if (i3 % 2 != 0) {
                if (((CompoundButton) this.initialize.getChildAt(i2)).isChecked()) {
                    break;
                }
                i2++;
                createTransaction = (getWarnings + 3) % 128;
            } else {
                ((CompoundButton) this.initialize.getChildAt(i2)).isChecked();
                throw null;
            }
        }
        Object[] objArr = new Object[1];
        get(38 - View.getDefaultSize(0, 0), "\u0011\u0013\u0002\b\u0016\u0011\u0018\u0005\u0003\u0011\u0016\u000b\r\u0000\u0014\u0018\u0015\u0007\u000f\u0017\u0003\f\u0016\u0004\u0002\r\u0002\u0017\b\u0010\u0011\u0015\u0002\u0015\u000e\u0011\n\u0007", (byte) ((KeyEvent.getMaxKeyCode() >> 16) + 87), objArr);
        interfaceC9359eo.values(((String) objArr[0]).intern(), i2);
    }
}
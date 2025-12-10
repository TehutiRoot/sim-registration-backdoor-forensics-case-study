package com.netcetera.threeds.sdk.infrastructure;

import android.content.Context;
import android.graphics.Color;
import android.os.SystemClock;
import android.text.TextUtils;
import android.view.MotionEvent;
import android.view.View;
import android.view.ViewConfiguration;
import android.widget.CheckBox;
import android.widget.CompoundButton;
import android.widget.ExpandableListView;
import android.widget.LinearLayout;
import java.util.ArrayList;
import java.util.HashSet;
import java.util.List;
import java.util.Set;

/* renamed from: com.netcetera.threeds.sdk.infrastructure.bf */
/* loaded from: classes5.dex */
public class C9258bf extends AbstractC9747w<LinearLayout> implements save, writeReplace {
    private static int ConfigParameters = 1;
    public static int ThreeDS2Service;
    public static boolean ThreeDS2ServiceInstance;
    public static char[] get;
    private static final ArrayList<String> getWarnings;
    private static int onCompleted;
    public static boolean valueOf;
    private static final String values;
    private final Set<String> ThreeDS2Service$InitializationCallback;
    private final Set<String> createTransaction;
    private final InterfaceC9500jo initialize;
    private LinearLayout onError;

    static {
        ThreeDS2ServiceInstance();
        Object[] objArr = new Object[1];
        valueOf((ViewConfiguration.getMaximumDrawingCacheSize() >> 24) + 127, null, null, "\u0094\u008b\u0093\u008b\u0085\u0092\u0085\u0091\u0086\u008f\u0085\u008d\u008b\u008d\u0089\u008e\u0090\u0089\u0087\u0086\u008f\u0085\u0083\u008e\u008d\u008c\u008b\u008a\u0086\u0089\u0088\u0087\u0086\u0085\u0084\u0083\u0082", objArr);
        values = ((String) objArr[0]).intern();
        getWarnings = new ArrayList<String>() { // from class: com.netcetera.threeds.sdk.infrastructure.bf.5
            public static long ThreeDS2ServiceInstance = 588900820142697762L;

            {
                Object[] objArr2 = new Object[1];
                valueOf("漃潠⟐沒\ue5c5誚㚷\ue2cf\udbe7䘟戰幌ٶㆽ꾳闚狄\ued09ᬦ셚뵏壾䂓㰭\ue9ccᑿ谡殸呖쿮旅ꜰ胏뭕┇ኵ쬥盝鉉乓", ExpandableListView.getPackedPositionGroup(0L), objArr2);
                add(((String) objArr2[0]).intern());
                Object[] objArr3 = new Object[1];
                valueOf("똓뙰륞Ⰿ륛ᐔ瘪빑˷\ud891⊭˒\udf66꼳\uef2e쥄ꯔ率宻鷄摟왰\u000e悳ボ諱첼㜦赆兠뤞ﮮ姟◛斚丫ስ\ue853틔ዌ", (SystemClock.uptimeMillis() > 0L ? 1 : (SystemClock.uptimeMillis() == 0L ? 0 : -1)) - 1, objArr3);
                add(((String) objArr3[0]).intern());
                Object[] objArr4 = new Object[1];
                valueOf("ꐲꑑ\uebaf\udb9d곁䛥膸ꯋზ詠픿ᝈ쵇ﷂᢼ\udcde맵ⅶ갩衞百钁\uf79c甩⋽\ud800㬮⊼齧Α二\uee34䯾眪鈈宱\u0014몢╆ݕ", Color.green(0), objArr4);
                add(((String) objArr4[0]).intern());
                Object[] objArr5 = new Object[1];
                valueOf("☬♏횹굫\uea54篳\uf74e\ued5e鋈띶ꏉ凝余샔湊驋㯫ᱠ\udadf컋\uf460ꦗ腪㎼ꃣ\ue516䷘搩ᵹ㺇㡺ꢡ짠䨼\ue4feᴤ舊螴厰䇁", TextUtils.indexOf("", "", 0, 0), objArr5);
                add(((String) objArr5[0]).intern());
                Object[] objArr6 = new Object[1];
                valueOf("靧霄⋘豳秊辒홖ﺟ⎃䌗苑䈜︒㒵佒覊誠\ue801\ufbc7\udd0a䔫巶ꁲ⁽ᆨᅷ泀矨갲쫦ᥢ뭠碫빝엦\u0ee5㍁珕犨切", View.combineMeasuredStates(0, 0), objArr6);
                add(((String) objArr6[0]).intern());
                Object[] objArr7 = new Object[1];
                valueOf("뢾룝ᮼ鈞ꞏ뛶젻ꂅౚ穳鲼ᰆ퇋ෑ儿힐ꕹ텥\ue5aa茐櫲撒븟繧㹱⠓犭⧲菫\uf382\u070f\ue57a坲蜹\udb8b僿Ი䪱泅జ", MotionEvent.axisFromString("") + 1, objArr7);
                add(((String) objArr7[0]).intern());
                Object[] objArr8 = new Object[1];
                valueOf("籫簈頻⬅㣾㕱焠㿴좏林▧荷ᔞ蹖\ue824䣡憬勢岱ᱡ긧\ue715܄\ue116瘝ꮔ쮶뚃䜾瀅블程鎧Ҿ抐쾎\ud84d줶헞鍮", (SystemClock.elapsedRealtime() > 0L ? 1 : (SystemClock.elapsedRealtime() == 0L ? 0 : -1)) - 1, objArr8);
                add(((String) objArr8[0]).intern());
                Object[] objArr9 = new Object[1];
                valueOf("崊嵩\ue72cꏖᥜ䩦麟Ṗ\ue9ee蛣굴ꋕ㑿\uf141惷楃䃍ⷵ푢㷃轆頂迗살\udbc5풃䍥霡晟༒㛇宩닆箩\uea43\uee2c郎똡崍닍", (-1) - (ExpandableListView.getPackedPositionForChild(0, 0) > 0L ? 1 : (ExpandableListView.getPackedPositionForChild(0, 0) == 0L ? 0 : -1)), objArr9);
                add(((String) objArr9[0]).intern());
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
                    long r1 = com.netcetera.threeds.sdk.infrastructure.C9258bf.C92595.ThreeDS2ServiceInstance     // Catch: java.lang.Throwable -> L3a
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
                    long r6 = com.netcetera.threeds.sdk.infrastructure.C9258bf.C92595.ThreeDS2ServiceInstance     // Catch: java.lang.Throwable -> L3a
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
                throw new UnsupportedOperationException("Method not decompiled: com.netcetera.threeds.sdk.infrastructure.C9258bf.C92595.valueOf(java.lang.String, int, java.lang.Object[]):void");
            }
        };
        ConfigParameters = (onCompleted + 95) % 128;
    }

    public C9258bf(Context context, InterfaceC9500jo interfaceC9500jo) {
        super(context);
        this.initialize = interfaceC9500jo;
        this.ThreeDS2Service$InitializationCallback = new HashSet();
        this.createTransaction = new HashSet();
    }

    public static /* synthetic */ void ThreeDS2Service(C9258bf c9258bf, String[] strArr, int i, String[] strArr2, CompoundButton compoundButton, boolean z) {
        int i2 = ConfigParameters + 67;
        onCompleted = i2 % 128;
        int i3 = i2 % 2;
        c9258bf.ThreeDS2Service(strArr, i, strArr2, compoundButton, z);
        if (i3 != 0) {
            int i4 = 82 / 0;
        }
        int i5 = onCompleted + 21;
        ConfigParameters = i5 % 128;
        if (i5 % 2 == 0) {
            throw null;
        }
    }

    public static void ThreeDS2ServiceInstance() {
        valueOf = true;
        get = new char[]{260, 293, 333, 324, 332, 321, 283, 320, 327, 315, 317, 289, 326, 328, 301, 325, 299, 313, 291, 337};
        ThreeDS2ServiceInstance = true;
        ThreeDS2Service = 216;
    }

    @Override // com.netcetera.threeds.sdk.infrastructure.AbstractC9747w
    public /* synthetic */ LinearLayout get(Context context) {
        ConfigParameters = (onCompleted + 111) % 128;
        LinearLayout ThreeDS2Service2 = ThreeDS2Service(context);
        int i = onCompleted + 125;
        ConfigParameters = i % 128;
        if (i % 2 == 0) {
            int i2 = 16 / 0;
        }
        return ThreeDS2Service2;
    }

    @Override // com.netcetera.threeds.sdk.infrastructure.contains
    public void valueOf(setAllCaps setallcaps) {
        onCompleted = (ConfigParameters + 17) % 128;
        values();
        List<setCursorVisible> SchemeConfiguration = setallcaps.SchemeConfiguration();
        this.ThreeDS2Service$InitializationCallback.clear();
        this.onError.removeAllViews();
        if (SchemeConfiguration != null) {
            int i = ConfigParameters + 71;
            onCompleted = i % 128;
            if (i % 2 != 0) {
                int i2 = 86 / 0;
                if (SchemeConfiguration.isEmpty()) {
                    return;
                }
            } else if (SchemeConfiguration.isEmpty()) {
                return;
            }
            int size = SchemeConfiguration.size();
            String[] strArr = new String[size];
            String[] strArr2 = new String[SchemeConfiguration.size()];
            for (int i3 = 0; i3 < SchemeConfiguration.size(); i3++) {
                strArr[i3] = SchemeConfiguration.get(i3).ThreeDS2ServiceInstance();
                strArr2[i3] = SchemeConfiguration.get(i3).ThreeDS2Service();
            }
            for (int i4 = 0; i4 < size; i4++) {
                CheckBox checkBox = new CheckBox(this.onError.getContext());
                int i5 = C9364et.ThreeDS2ServiceInstance;
                checkBox.setPadding(0, i5, 0, i5);
                checkBox.setMinHeight(C9364et.getSDKInfo);
                checkBox.setText(strArr[i4]);
                checkBox.setOnCheckedChangeListener(new C9260bg(this, strArr2, i4, strArr));
                ArrayList<String> arrayList = getWarnings;
                if (i4 < arrayList.size()) {
                    values(checkBox, arrayList.get(i4));
                }
                C9366ev.values(checkBox, this.initialize);
                this.onError.addView(checkBox);
            }
        }
    }

    @Override // com.netcetera.threeds.sdk.infrastructure.save
    public void values(InterfaceC9362er interfaceC9362er) {
        values();
        Object[] objArr = new Object[1];
        valueOf(127 - (ViewConfiguration.getTouchSlop() >> 8), null, null, "\u0094\u008b\u0093\u008b\u0085\u0092\u0085\u0091\u0086\u008f\u0085\u008d\u008b\u008d\u0089\u008e\u0090\u0089\u0087\u0086\u008f\u0085\u0083\u008e\u008d\u008c\u008b\u008a\u0086\u0089\u0088\u0087\u0086\u0085\u0084\u0083\u0082", objArr);
        List<String> list = interfaceC9362er.get(((String) objArr[0]).intern(), new ArrayList());
        if (list.isEmpty()) {
            return;
        }
        for (int i = 0; i < this.onError.getChildCount(); i++) {
            onCompleted = (ConfigParameters + 101) % 128;
            CheckBox checkBox = (CheckBox) this.onError.getChildAt(i);
            for (String str : list) {
                ConfigParameters = (onCompleted + 21) % 128;
                if (C9658om.valueOf(str, checkBox.getText())) {
                    int i2 = onCompleted + 125;
                    ConfigParameters = i2 % 128;
                    if (i2 % 2 == 0) {
                        checkBox.setChecked(false);
                    } else {
                        checkBox.setChecked(true);
                    }
                }
            }
        }
    }

    private /* synthetic */ void ThreeDS2Service(String[] strArr, int i, String[] strArr2, CompoundButton compoundButton, boolean z) {
        onCompleted = (ConfigParameters + 95) % 128;
        if (compoundButton.isChecked()) {
            this.ThreeDS2Service$InitializationCallback.add(strArr[i]);
            this.createTransaction.add(strArr2[i]);
            onCompleted = (ConfigParameters + 29) % 128;
            return;
        }
        this.ThreeDS2Service$InitializationCallback.remove(strArr[i]);
        this.createTransaction.remove(strArr2[i]);
    }

    /* JADX WARN: Code restructure failed: missing block: B:5:0x0018, code lost:
        if (r6.ThreeDS2Service$InitializationCallback.isEmpty() == false) goto L8;
     */
    /* JADX WARN: Code restructure failed: missing block: B:8:0x0021, code lost:
        if (r6.ThreeDS2Service$InitializationCallback.isEmpty() == false) goto L8;
     */
    /* JADX WARN: Code restructure failed: missing block: B:9:0x0023, code lost:
        r0 = new java.util.ArrayList(r6.ThreeDS2Service$InitializationCallback);
        java.util.Collections.sort(r0);
        r3 = new java.lang.Object[1];
        valueOf((android.view.ViewConfiguration.getDoubleTapTimeout() >> 16) + 127, null, null, "\u0081", r3);
        r2 = com.netcetera.threeds.sdk.infrastructure.C9658om.values(r0, ((java.lang.String) r3[0]).intern());
        com.netcetera.threeds.sdk.infrastructure.C9258bf.onCompleted = (com.netcetera.threeds.sdk.infrastructure.C9258bf.ConfigParameters + 57) % 128;
     */
    @Override // com.netcetera.threeds.sdk.infrastructure.writeReplace
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public com.netcetera.threeds.sdk.infrastructure.isEmpty get() {
        /*
            r6 = this;
            int r0 = com.netcetera.threeds.sdk.infrastructure.C9258bf.ConfigParameters
            int r0 = r0 + 7
            int r1 = r0 % 128
            com.netcetera.threeds.sdk.infrastructure.C9258bf.onCompleted = r1
            int r0 = r0 % 2
            r1 = 0
            java.lang.String r2 = ""
            if (r0 == 0) goto L1b
            java.util.Set<java.lang.String> r0 = r6.ThreeDS2Service$InitializationCallback
            boolean r0 = r0.isEmpty()
            r3 = 79
            int r3 = r3 / r1
            if (r0 != 0) goto L52
            goto L23
        L1b:
            java.util.Set<java.lang.String> r0 = r6.ThreeDS2Service$InitializationCallback
            boolean r0 = r0.isEmpty()
            if (r0 != 0) goto L52
        L23:
            java.util.ArrayList r0 = new java.util.ArrayList
            java.util.Set<java.lang.String> r2 = r6.ThreeDS2Service$InitializationCallback
            r0.<init>(r2)
            java.util.Collections.sort(r0)
            int r2 = android.view.ViewConfiguration.getDoubleTapTimeout()
            int r2 = r2 >> 16
            int r2 = r2 + 127
            r3 = 1
            java.lang.Object[] r3 = new java.lang.Object[r3]
            java.lang.String r4 = "\u0081"
            r5 = 0
            valueOf(r2, r5, r5, r4, r3)
            r1 = r3[r1]
            java.lang.String r1 = (java.lang.String) r1
            java.lang.String r1 = r1.intern()
            java.lang.String r2 = com.netcetera.threeds.sdk.infrastructure.C9658om.values(r0, r1)
            int r0 = com.netcetera.threeds.sdk.infrastructure.C9258bf.ConfigParameters
            int r0 = r0 + 57
            int r0 = r0 % 128
            com.netcetera.threeds.sdk.infrastructure.C9258bf.onCompleted = r0
        L52:
            com.netcetera.threeds.sdk.infrastructure.bi r0 = new com.netcetera.threeds.sdk.infrastructure.bi
            r0.<init>(r2)
            return r0
        */
        throw new UnsupportedOperationException("Method not decompiled: com.netcetera.threeds.sdk.infrastructure.C9258bf.get():com.netcetera.threeds.sdk.infrastructure.isEmpty");
    }

    public LinearLayout ThreeDS2Service(Context context) {
        LinearLayout linearLayout = new LinearLayout(context);
        LinearLayout.LayoutParams layoutParams = new LinearLayout.LayoutParams(-1, -2);
        linearLayout.setOrientation(1);
        int i = C9364et.getWarnings;
        linearLayout.setPadding(i, C9364et.ThreeDS2Service, i, 0);
        linearLayout.setLayoutParams(layoutParams);
        LinearLayout linearLayout2 = new LinearLayout(context);
        this.onError = linearLayout2;
        linearLayout2.setLayoutParams(C9367ex.valueOf());
        this.onError.setOrientation(1);
        linearLayout.addView(this.onError);
        onCompleted = (ConfigParameters + 121) % 128;
        return linearLayout;
    }

    @Override // com.netcetera.threeds.sdk.infrastructure.save
    public void valueOf(InterfaceC9359eo interfaceC9359eo) {
        int i = onCompleted + 9;
        ConfigParameters = i % 128;
        if (i % 2 != 0) {
            if (this.createTransaction.isEmpty()) {
                return;
            }
            Object[] objArr = new Object[1];
            valueOf(126 - TextUtils.lastIndexOf("", '0'), null, null, "\u0094\u008b\u0093\u008b\u0085\u0092\u0085\u0091\u0086\u008f\u0085\u008d\u008b\u008d\u0089\u008e\u0090\u0089\u0087\u0086\u008f\u0085\u0083\u008e\u008d\u008c\u008b\u008a\u0086\u0089\u0088\u0087\u0086\u0085\u0084\u0083\u0082", objArr);
            interfaceC9359eo.ThreeDS2Service(((String) objArr[0]).intern(), new ArrayList(this.createTransaction));
            int i2 = onCompleted + 35;
            ConfigParameters = i2 % 128;
            if (i2 % 2 == 0) {
                throw null;
            }
            return;
        }
        this.createTransaction.isEmpty();
        throw null;
    }

    /* JADX WARN: Code restructure failed: missing block: B:0:?, code lost:
        r9 = r9;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    private static void valueOf(int r6, int[] r7, java.lang.String r8, java.lang.String r9, java.lang.Object[] r10) {
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
            char[] r1 = com.netcetera.threeds.sdk.infrastructure.C9258bf.get     // Catch: java.lang.Throwable -> L42
            int r2 = com.netcetera.threeds.sdk.infrastructure.C9258bf.ThreeDS2Service     // Catch: java.lang.Throwable -> L42
            boolean r3 = com.netcetera.threeds.sdk.infrastructure.C9258bf.valueOf     // Catch: java.lang.Throwable -> L42
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
            boolean r9 = com.netcetera.threeds.sdk.infrastructure.C9258bf.ThreeDS2ServiceInstance     // Catch: java.lang.Throwable -> L42
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
        throw new UnsupportedOperationException("Method not decompiled: com.netcetera.threeds.sdk.infrastructure.C9258bf.valueOf(int, int[], java.lang.String, java.lang.String, java.lang.Object[]):void");
    }
}
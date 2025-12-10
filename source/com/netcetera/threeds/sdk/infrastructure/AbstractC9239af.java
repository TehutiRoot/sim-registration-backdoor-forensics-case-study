package com.netcetera.threeds.sdk.infrastructure;

import android.content.Context;
import android.os.Process;
import android.view.KeyEvent;
import android.view.ViewConfiguration;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.LinearLayout;
import android.widget.TextView;
import androidx.core.view.GravityCompat;

/* renamed from: com.netcetera.threeds.sdk.infrastructure.af */
/* loaded from: classes5.dex */
public abstract class AbstractC9239af extends AbstractC9758w<LinearLayout> {
    private static int ConfigurationBuilder = 0;
    public static char ThreeDS2Service = 0;
    public static char ThreeDS2ServiceInstance = 0;
    private static int addParam = 1;
    public static char get;
    public static char valueOf;
    private static final int values;
    private final C9237ad ConfigParameters;
    private final InterfaceC9511jo ThreeDS2Service$InitializationCallback;
    private boolean apiKey;
    private TextView createTransaction;
    private TextView getWarnings;
    private TextView initialize;
    private final setProperty onCompleted;
    private ImageView onError;

    static {
        ThreeDS2ServiceInstance();
        values = C9624nm.valueOf(48);
        addParam = (ConfigurationBuilder + 81) % 128;
    }

    public AbstractC9239af(Context context, InterfaceC9511jo interfaceC9511jo, C9237ad c9237ad, setProperty setproperty) {
        super(context);
        this.apiKey = true;
        this.ThreeDS2Service$InitializationCallback = interfaceC9511jo;
        this.ConfigParameters = c9237ad;
        this.onCompleted = setproperty;
    }

    public static void ThreeDS2ServiceInstance() {
        get = (char) 270;
        valueOf = (char) 32975;
        ThreeDS2Service = (char) 34606;
        ThreeDS2ServiceInstance = (char) 26762;
    }

    /* JADX WARN: Code restructure failed: missing block: B:10:0x0022, code lost:
        com.netcetera.threeds.sdk.infrastructure.AbstractC9239af.addParam = (com.netcetera.threeds.sdk.infrastructure.AbstractC9239af.ConfigurationBuilder + 117) % 128;
     */
    /* JADX WARN: Code restructure failed: missing block: B:11:0x002a, code lost:
        return false;
     */
    /* JADX WARN: Code restructure failed: missing block: B:12:?, code lost:
        return true;
     */
    /* JADX WARN: Code restructure failed: missing block: B:5:0x0012, code lost:
        if (com.netcetera.threeds.sdk.infrastructure.getVersion.valueOf == r4) goto L8;
     */
    /* JADX WARN: Code restructure failed: missing block: B:8:0x0017, code lost:
        if (com.netcetera.threeds.sdk.infrastructure.getVersion.valueOf == r4) goto L8;
     */
    /* JADX WARN: Code restructure failed: missing block: B:9:0x0019, code lost:
        com.netcetera.threeds.sdk.infrastructure.AbstractC9239af.ConfigurationBuilder = (com.netcetera.threeds.sdk.infrastructure.AbstractC9239af.addParam + 1) % 128;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    private boolean values(com.netcetera.threeds.sdk.infrastructure.getVersion r4) {
        /*
            r3 = this;
            int r0 = com.netcetera.threeds.sdk.infrastructure.AbstractC9239af.addParam
            int r0 = r0 + 41
            int r1 = r0 % 128
            com.netcetera.threeds.sdk.infrastructure.AbstractC9239af.ConfigurationBuilder = r1
            int r0 = r0 % 2
            r1 = 0
            if (r0 == 0) goto L15
            com.netcetera.threeds.sdk.infrastructure.getVersion r0 = com.netcetera.threeds.sdk.infrastructure.getVersion.valueOf
            r2 = 20
            int r2 = r2 / r1
            if (r0 != r4) goto L22
            goto L19
        L15:
            com.netcetera.threeds.sdk.infrastructure.getVersion r0 = com.netcetera.threeds.sdk.infrastructure.getVersion.valueOf
            if (r0 != r4) goto L22
        L19:
            int r4 = com.netcetera.threeds.sdk.infrastructure.AbstractC9239af.addParam
            r1 = 1
            int r4 = r4 + r1
            int r4 = r4 % 128
            com.netcetera.threeds.sdk.infrastructure.AbstractC9239af.ConfigurationBuilder = r4
            goto L2a
        L22:
            int r4 = com.netcetera.threeds.sdk.infrastructure.AbstractC9239af.ConfigurationBuilder
            int r4 = r4 + 117
            int r4 = r4 % 128
            com.netcetera.threeds.sdk.infrastructure.AbstractC9239af.addParam = r4
        L2a:
            return r1
        */
        throw new UnsupportedOperationException("Method not decompiled: com.netcetera.threeds.sdk.infrastructure.AbstractC9239af.values(com.netcetera.threeds.sdk.infrastructure.getVersion):boolean");
    }

    public final LinearLayout ThreeDS2Service(Context context) {
        LinearLayout linearLayout = new LinearLayout(context);
        ViewGroup.LayoutParams layoutParams = new ViewGroup.LayoutParams(-1, -2);
        linearLayout.setFocusable(true);
        linearLayout.setLayoutParams(layoutParams);
        linearLayout.setGravity(1);
        linearLayout.setOrientation(1);
        int i = C9375et.getWarnings;
        int i2 = C9375et.ThreeDS2ServiceInstance;
        linearLayout.setPadding(i, i2, i, C9375et.ThreeDS2Service);
        LinearLayout.LayoutParams layoutParams2 = new LinearLayout.LayoutParams(-1, -2);
        TextView textView = new TextView(context);
        this.getWarnings = textView;
        textView.setLayoutParams(layoutParams2);
        this.getWarnings.setGravity(GravityCompat.START);
        TextView textView2 = this.getWarnings;
        int i3 = C9375et.values;
        textView2.setPadding(0, i3, 0, i3);
        this.getWarnings.setTextColor(-16777216);
        TextView textView3 = this.getWarnings;
        Object[] objArr = new Object[1];
        valueOf("큱⎲\ud85d\uf829꼑復ﵓ뇷䯉೨䨚\uf291\u0e62\uf113丝峷霑巺‡匒ຬ臜ᛮ\uda6a褔碵ጔ쾕\uf4a3㽘\udb46顮꤄孮", 34 - (Process.myTid() >> 22), objArr);
        values(textView3, ((String) objArr[0]).intern());
        LinearLayout linearLayout2 = new LinearLayout(context);
        linearLayout2.setOrientation(0);
        linearLayout2.setLayoutParams(new LinearLayout.LayoutParams(-1, -2));
        linearLayout2.setGravity(48);
        linearLayout2.setPadding(0, i2, 0, i2);
        this.onError = new ImageView(context);
        int i4 = values;
        LinearLayout.LayoutParams layoutParams3 = new LinearLayout.LayoutParams(i4, i4);
        layoutParams3.bottomMargin = i2;
        layoutParams3.topMargin = i2;
        layoutParams3.rightMargin = i3;
        this.onError.setLayoutParams(layoutParams3);
        this.onError.setVisibility(8);
        ImageView imageView = this.onError;
        Object[] objArr2 = new Object[1];
        valueOf("큱⎲\ud85d\uf829꼑復ﵓ뇷䯉೨䨚\uf291\u0e62\uf113丝峷霑巺‡匒ຬ臜ᛮ\uda6a褔碵ጔ쾕嬨隳랽븚鐂媂픱꺃⪑Ꮷﵓ뇷", 39 - ((byte) KeyEvent.getModifierMetaStateMask()), objArr2);
        values(imageView, ((String) objArr2[0]).intern());
        LinearLayout.LayoutParams layoutParams4 = new LinearLayout.LayoutParams(0, -2);
        layoutParams4.weight = 1.0f;
        TextView textView4 = new TextView(context);
        this.initialize = textView4;
        textView4.setLayoutParams(layoutParams4);
        this.initialize.setGravity(GravityCompat.START);
        this.initialize.setPadding(0, i2, 0, i2);
        this.initialize.setTextColor(-16777216);
        TextView textView5 = this.initialize;
        Object[] objArr3 = new Object[1];
        valueOf("큱⎲\ud85d\uf829꼑復ﵓ뇷䯉೨䨚\uf291\u0e62\uf113丝峷霑巺‡匒ຬ臜ᛮ\uda6a褔碵ጔ쾕嬨隳랽븚", (ViewConfiguration.getMaximumDrawingCacheSize() >> 24) + 32, objArr3);
        values(textView5, ((String) objArr3[0]).intern());
        linearLayout2.addView(this.onError);
        linearLayout2.addView(this.initialize);
        LinearLayout.LayoutParams layoutParams5 = new LinearLayout.LayoutParams(-1, -2);
        TextView textView6 = new TextView(context);
        this.createTransaction = textView6;
        textView6.setLayoutParams(layoutParams5);
        this.createTransaction.setGravity(GravityCompat.START);
        this.createTransaction.setVisibility(8);
        this.createTransaction.setPadding(0, i2, 0, 0);
        TextView textView7 = this.createTransaction;
        Object[] objArr4 = new Object[1];
        valueOf("큱⎲\ud85d\uf829꼑復ﵓ뇷䯉೨䨚\uf291\u0e62\uf113丝峷霑巺‡匒ຬ臜ᛮ\uda6a褔碵ጔ쾕㪋\uecdd衊늙욗筇", 33 - (ViewConfiguration.getKeyRepeatTimeout() >> 16), objArr4);
        values(textView7, ((String) objArr4[0]).intern());
        linearLayout.addView(this.getWarnings);
        linearLayout.addView(linearLayout2);
        linearLayout.addView(this.createTransaction);
        C9377ev.get(this.getWarnings, this.ThreeDS2Service$InitializationCallback);
        C9377ev.values(this.initialize, this.ThreeDS2Service$InitializationCallback);
        C9377ev.valueOf(this.createTransaction, this.ThreeDS2Service$InitializationCallback, 1);
        int i5 = addParam + 89;
        ConfigurationBuilder = i5 % 128;
        if (i5 % 2 == 0) {
            return linearLayout;
        }
        throw null;
    }

    @Override // com.netcetera.threeds.sdk.infrastructure.AbstractC9758w
    public /* synthetic */ LinearLayout get(Context context) {
        addParam = (ConfigurationBuilder + 59) % 128;
        LinearLayout ThreeDS2Service2 = ThreeDS2Service(context);
        ConfigurationBuilder = (addParam + 47) % 128;
        return ThreeDS2Service2;
    }

    public final void valueOf(String str) {
        int i = addParam + 83;
        ConfigurationBuilder = i % 128;
        if (i % 2 == 0) {
            this.onCompleted.get(this.initialize, str);
            return;
        }
        this.onCompleted.get(this.initialize, str);
        int i2 = 42 / 0;
    }

    public void get(boolean z) {
        int i = (addParam + 73) % 128;
        ConfigurationBuilder = i;
        this.apiKey = z;
        addParam = (i + 111) % 128;
    }

    @Override // com.netcetera.threeds.sdk.infrastructure.contains
    public void valueOf(setAllCaps setallcaps) {
        ConfigurationBuilder = (addParam + 89) % 128;
        values();
        this.getWarnings.setText(setallcaps.getParamValue());
        valueOf(setallcaps.ConfigurationBuilder());
        ThreeDS2Service(setallcaps.addParam());
        ThreeDS2Service(setallcaps.build());
        ConfigurationBuilder = (addParam + 9) % 128;
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
            char r11 = com.netcetera.threeds.sdk.infrastructure.AbstractC9239af.ThreeDS2ServiceInstance     // Catch: java.lang.Throwable -> L5b
            int r10 = r10 + r11
            r9 = r9 ^ r10
            int r10 = r8 >>> 5
            char r11 = com.netcetera.threeds.sdk.infrastructure.AbstractC9239af.ThreeDS2Service     // Catch: java.lang.Throwable -> L5b
            int r10 = r10 + r11
            r9 = r9 ^ r10
            int r7 = r7 - r9
            char r7 = (char) r7     // Catch: java.lang.Throwable -> L5b
            r3[r5] = r7     // Catch: java.lang.Throwable -> L5b
            int r9 = r7 + r4
            int r10 = r7 << 4
            char r11 = com.netcetera.threeds.sdk.infrastructure.AbstractC9239af.get     // Catch: java.lang.Throwable -> L5b
            int r10 = r10 + r11
            r9 = r9 ^ r10
            int r7 = r7 >>> 5
            char r10 = com.netcetera.threeds.sdk.infrastructure.AbstractC9239af.valueOf     // Catch: java.lang.Throwable -> L5b
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
        throw new UnsupportedOperationException("Method not decompiled: com.netcetera.threeds.sdk.infrastructure.AbstractC9239af.valueOf(java.lang.String, int, java.lang.Object[]):void");
    }

    public final void ThreeDS2Service(getVersion getversion) {
        addParam = (ConfigurationBuilder + 67) % 128;
        if (values(getversion)) {
            ConfigurationBuilder = (addParam + 71) % 128;
            this.onError.setVisibility(0);
            this.onError.setImageBitmap(this.ConfigParameters.ThreeDS2ServiceInstance());
            return;
        }
        this.onError.setVisibility(8);
        addParam = (ConfigurationBuilder + 17) % 128;
    }

    private void ThreeDS2Service(String str) {
        ConfigurationBuilder = (addParam + 107) % 128;
        if (!(!this.apiKey) && !C9669om.values((CharSequence) str)) {
            addParam = (ConfigurationBuilder + 27) % 128;
            this.createTransaction.setText(str);
            this.createTransaction.setVisibility(0);
            return;
        }
        this.createTransaction.setVisibility(8);
    }
}

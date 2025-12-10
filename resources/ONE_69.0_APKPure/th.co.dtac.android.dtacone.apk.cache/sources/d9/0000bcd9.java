package com.netcetera.threeds.sdk.infrastructure;

import android.content.Context;
import android.graphics.ImageFormat;
import android.view.View;
import android.view.ViewConfiguration;
import android.widget.Button;
import android.widget.LinearLayout;
import android.widget.TextView;
import android.widget.Toolbar;
import ch.qos.logback.core.net.SyslogConstants;

/* renamed from: com.netcetera.threeds.sdk.infrastructure.list */
/* loaded from: classes5.dex */
public class C9553list extends AbstractC9747w<Toolbar> {
    private static int ConfigParameters = 0;
    public static boolean ThreeDS2Service = false;
    private static final int ThreeDS2ServiceInstance;
    private static int createTransaction = 1;
    public static int get;
    private static final int getWarnings;
    public static boolean valueOf;
    public static char[] values;
    private final InterfaceC9501jp initialize;
    private final InterfaceC9496jk onCompleted;
    private forEach onError;

    static {
        get();
        ThreeDS2ServiceInstance = C9613nm.valueOf(56);
        getWarnings = C9613nm.valueOf(4);
        int i = createTransaction + 109;
        ConfigParameters = i % 128;
        if (i % 2 != 0) {
            int i2 = 30 / 0;
        }
    }

    public C9553list(Context context, InterfaceC9501jp interfaceC9501jp, InterfaceC9496jk interfaceC9496jk) {
        super(context);
        this.initialize = interfaceC9501jp;
        this.onCompleted = interfaceC9496jk;
    }

    public static void get() {
        ThreeDS2Service = true;
        values = new char[]{243, 248, 241, 252, 245, 254, 247, 239, 261, 249, 211, 244};
        valueOf = true;
        get = SyslogConstants.LOG_LOCAL2;
    }

    public static /* synthetic */ void values(C9553list c9553list, View view) {
        ConfigParameters = (createTransaction + 19) % 128;
        c9553list.valueOf(view);
        createTransaction = (ConfigParameters + 101) % 128;
    }

    public Toolbar ThreeDS2Service(Context context) {
        Toolbar toolbar = new Toolbar(context);
        toolbar.setElevation(getWarnings);
        toolbar.setContentInsetsAbsolute(0, 0);
        LinearLayout.LayoutParams layoutParams = new LinearLayout.LayoutParams(-1, -2);
        LinearLayout linearLayout = new LinearLayout(context);
        linearLayout.setLayoutParams(layoutParams);
        linearLayout.setOrientation(0);
        linearLayout.setMinimumHeight(ThreeDS2ServiceInstance);
        linearLayout.setVerticalGravity(17);
        LinearLayout.LayoutParams layoutParams2 = new LinearLayout.LayoutParams(0, -2, 1.0f);
        TextView textView = new TextView(context);
        textView.setGravity(8388627);
        int i = C9364et.values;
        int i2 = C9364et.ThreeDS2ServiceInstance;
        textView.setPadding(i, i2, i, i2);
        textView.setLayoutParams(layoutParams2);
        Button button = new Button(context);
        button.setTransformationMethod(null);
        button.setStateListAnimator(null);
        button.setText(this.initialize.values());
        button.setOnClickListener(new View$OnClickListenerC9745u(this));
        Object[] objArr = new Object[1];
        valueOf(ImageFormat.getBitsPerPixel(0) + 128, null, null, "\u0084\u0085\u0081\u0086\u0083\u0081\u0088\u008a\u0089\u0088\u0085\u0087\u0086\u0085\u0084\u0084\u0083\u0082\u0081", objArr);
        values(button, ((String) objArr[0]).intern());
        linearLayout.addView(textView);
        linearLayout.addView(button);
        toolbar.addView(linearLayout);
        C9366ev.values(textView, this.initialize);
        textView.setText(this.initialize.ThreeDS2Service());
        C9366ev.values(button, (InterfaceC9503jr) this.onCompleted);
        C9366ev.values(button, this.onCompleted);
        ConfigParameters = (createTransaction + 31) % 128;
        return toolbar;
    }

    @Override // com.netcetera.threeds.sdk.infrastructure.contains
    public void valueOf(setAllCaps setallcaps) {
        createTransaction = (ConfigParameters + 101) % 128;
    }

    private /* synthetic */ void valueOf(View view) {
        forEach foreach = this.onError;
        Object[] objArr = new Object[1];
        valueOf(127 - (ViewConfiguration.getLongPressTimeout() >> 16), null, null, "\u008c\u0085\u0084\u0085\u0081\u0086\u0083\u008b", objArr);
        foreach.ThreeDS2ServiceInstance(new C9262bi(((String) objArr[0]).intern()));
        int i = ConfigParameters + 21;
        createTransaction = i % 128;
        if (i % 2 == 0) {
            throw null;
        }
    }

    @Override // com.netcetera.threeds.sdk.infrastructure.AbstractC9747w
    public /* synthetic */ Toolbar get(Context context) {
        createTransaction = (ConfigParameters + 55) % 128;
        Toolbar ThreeDS2Service2 = ThreeDS2Service(context);
        createTransaction = (ConfigParameters + 17) % 128;
        return ThreeDS2Service2;
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
            char[] r1 = com.netcetera.threeds.sdk.infrastructure.C9553list.values     // Catch: java.lang.Throwable -> L42
            int r2 = com.netcetera.threeds.sdk.infrastructure.C9553list.get     // Catch: java.lang.Throwable -> L42
            boolean r3 = com.netcetera.threeds.sdk.infrastructure.C9553list.ThreeDS2Service     // Catch: java.lang.Throwable -> L42
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
            boolean r9 = com.netcetera.threeds.sdk.infrastructure.C9553list.valueOf     // Catch: java.lang.Throwable -> L42
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
        throw new UnsupportedOperationException("Method not decompiled: com.netcetera.threeds.sdk.infrastructure.C9553list.valueOf(int, int[], java.lang.String, java.lang.String, java.lang.Object[]):void");
    }

    public void get(forEach foreach) {
        int i = ConfigParameters + 105;
        int i2 = i % 128;
        createTransaction = i2;
        int i3 = i % 2;
        this.onError = foreach;
        if (i3 == 0) {
            throw null;
        }
        ConfigParameters = (i2 + 51) % 128;
    }
}
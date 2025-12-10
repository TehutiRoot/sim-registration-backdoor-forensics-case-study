package com.netcetera.threeds.sdk.infrastructure;

import android.content.Context;
import android.graphics.Color;
import android.media.AudioTrack;
import android.os.Process;
import android.os.SystemClock;
import android.text.InputFilter;
import android.text.TextUtils;
import android.view.KeyEvent;
import android.view.View;
import android.view.ViewConfiguration;
import android.view.ViewGroup;
import android.widget.EditText;
import android.widget.LinearLayout;
import com.facebook.stetho.dumpapp.Framer;

/* renamed from: com.netcetera.threeds.sdk.infrastructure.bl */
/* loaded from: classes5.dex */
public class C9266bl extends AbstractC9747w<LinearLayout> implements save, writeReplace {
    public static byte[] ThreeDS2Service = null;
    private static int ThreeDS2Service$InitializationCallback = 1;
    public static short[] ThreeDS2ServiceInstance;
    public static int get;
    private static final String getWarnings;
    private static int onCompleted;
    public static int valueOf;
    public static int values;
    private final String ConfigParameters;
    private EditText initialize;
    private final InterfaceC9502jq onError;

    static {
        ThreeDS2ServiceInstance();
        Object[] objArr = new Object[1];
        valueOf((byte) (Color.green(0) + 119), (short) KeyEvent.normalizeMetaState(0), (-534942747) - (ViewConfiguration.getMaximumDrawingCacheSize() >> 24), 3 - TextUtils.indexOf((CharSequence) "", '0', 0, 0), (-399027064) + (AudioTrack.getMaxVolume() > 0.0f ? 1 : (AudioTrack.getMaxVolume() == 0.0f ? 0 : -1)), objArr);
        getWarnings = ((String) objArr[0]).intern();
        ThreeDS2Service$InitializationCallback = (onCompleted + 69) % 128;
    }

    public C9266bl(Context context, InterfaceC9502jq interfaceC9502jq, String str) {
        super(context);
        this.onError = interfaceC9502jq;
        this.ConfigParameters = str;
    }

    public static void ThreeDS2ServiceInstance() {
        values = 399027147;
        ThreeDS2Service = new byte[]{-38, 32, 39, 32, 47, -61, 51, 39, -33, 39, -36, 40, -61, 34, -37, 35, 44, 35, -33, -37, -36, 44, -36, 37, 46, -36, 32, Framer.ENTER_FRAME_PREFIX, -45, -47, 51, -33, -37, -36, 44, -36, 37, 46, -36, 32, 99, 109, -111, -122, 100, -102, 86, -99, 99, -106, 113, 126, Byte.MIN_VALUE, -120, -120, 116, -119, 91, -83, 99, -106, -120, 114, 117, 82, -94, -117, 100, 102, 0, 0};
        get = 26;
        valueOf = 534942787;
    }

    @Override // com.netcetera.threeds.sdk.infrastructure.AbstractC9747w
    public /* synthetic */ LinearLayout get(Context context) {
        int i = onCompleted + 65;
        ThreeDS2Service$InitializationCallback = i % 128;
        int i2 = i % 2;
        LinearLayout values2 = values(context);
        if (i2 == 0) {
            int i3 = 34 / 0;
        }
        int i4 = onCompleted + 1;
        ThreeDS2Service$InitializationCallback = i4 % 128;
        if (i4 % 2 == 0) {
            int i5 = 15 / 0;
        }
        return values2;
    }

    @Override // com.netcetera.threeds.sdk.infrastructure.contains
    public void valueOf(setAllCaps setallcaps) {
        int i = ThreeDS2Service$InitializationCallback + 7;
        onCompleted = i % 128;
        if (i % 2 != 0) {
            values();
            int i2 = 28 / 0;
            if (!setBackInvokedCallbackEnabled.ThreeDS2ServiceInstance(setallcaps)) {
                return;
            }
        } else {
            values();
            if (!setBackInvokedCallbackEnabled.ThreeDS2ServiceInstance(setallcaps)) {
                return;
            }
        }
        this.initialize.setInputType(129);
        ThreeDS2Service$InitializationCallback = (onCompleted + 25) % 128;
    }

    public LinearLayout values(Context context) {
        LinearLayout linearLayout = new LinearLayout(context);
        linearLayout.setLayoutParams(new ViewGroup.LayoutParams(-1, -2));
        linearLayout.setOrientation(1);
        int i = C9364et.getWarnings;
        linearLayout.setPadding(i, C9364et.ThreeDS2Service, i, 0);
        EditText editText = new EditText(context);
        this.initialize = editText;
        editText.setLayoutParams(C9367ex.valueOf());
        EditText editText2 = this.initialize;
        int i2 = C9364et.values;
        editText2.setPadding(i2, 0, i2, 0);
        this.initialize.setSingleLine(true);
        this.initialize.setFilters(new InputFilter[]{new InputFilter.LengthFilter(45)});
        this.initialize.setMinHeight(C9364et.getSDKInfo);
        this.initialize.setInputType(524432);
        EditText editText3 = this.initialize;
        Object[] objArr = new Object[1];
        valueOf((byte) (37 - (Process.myTid() >> 22)), (short) View.resolveSize(0, 0), (Process.getElapsedCpuTime() > 0L ? 1 : (Process.getElapsedCpuTime() == 0L ? 0 : -1)) - 534942788, (ViewConfiguration.getMinimumFlingVelocity() >> 16) + 15, (-399027048) - (ViewConfiguration.getTouchSlop() >> 8), objArr);
        values(editText3, ((String) objArr[0]).intern());
        linearLayout.addView(this.initialize);
        C9366ev.get(this.initialize, this.onError);
        onCompleted = (ThreeDS2Service$InitializationCallback + 25) % 128;
        return linearLayout;
    }

    public static C9266bl ThreeDS2ServiceInstance(Context context, InterfaceC9502jq interfaceC9502jq) {
        Object[] objArr = new Object[1];
        valueOf((byte) ((ViewConfiguration.getScrollBarSize() >> 8) + 37), (short) ((SystemClock.uptimeMillis() > 0L ? 1 : (SystemClock.uptimeMillis() == 0L ? 0 : -1)) - 1), (AudioTrack.getMinVolume() > 0.0f ? 1 : (AudioTrack.getMinVolume() == 0.0f ? 0 : -1)) - 534942787, (ViewConfiguration.getMinimumFlingVelocity() >> 16) + 15, (-399027048) - Color.blue(0), objArr);
        C9266bl c9266bl = new C9266bl(context, interfaceC9502jq, ((String) objArr[0]).intern());
        int i = onCompleted + 103;
        ThreeDS2Service$InitializationCallback = i % 128;
        if (i % 2 != 0) {
            return c9266bl;
        }
        throw null;
    }

    /* JADX WARN: Code restructure failed: missing block: B:10:0x0037, code lost:
        if ((r2 % 2) != 0) goto L10;
     */
    /* JADX WARN: Code restructure failed: missing block: B:11:0x0039, code lost:
        return r0;
     */
    /* JADX WARN: Code restructure failed: missing block: B:12:0x003a, code lost:
        throw null;
     */
    /* JADX WARN: Code restructure failed: missing block: B:13:0x003b, code lost:
        return null;
     */
    /* JADX WARN: Code restructure failed: missing block: B:5:0x0012, code lost:
        if (r4.initialize != null) goto L7;
     */
    /* JADX WARN: Code restructure failed: missing block: B:8:0x0017, code lost:
        if (r4.initialize != null) goto L7;
     */
    /* JADX WARN: Code restructure failed: missing block: B:9:0x0019, code lost:
        r4.initialize.setEnabled(false);
        r0 = new com.netcetera.threeds.sdk.infrastructure.C9262bi(r4.initialize.getText().toString());
        r2 = com.netcetera.threeds.sdk.infrastructure.C9266bl.ThreeDS2Service$InitializationCallback + 31;
        com.netcetera.threeds.sdk.infrastructure.C9266bl.onCompleted = r2 % 128;
     */
    @Override // com.netcetera.threeds.sdk.infrastructure.writeReplace
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public com.netcetera.threeds.sdk.infrastructure.isEmpty get() {
        /*
            r4 = this;
            int r0 = com.netcetera.threeds.sdk.infrastructure.C9266bl.onCompleted
            int r0 = r0 + 19
            int r1 = r0 % 128
            com.netcetera.threeds.sdk.infrastructure.C9266bl.ThreeDS2Service$InitializationCallback = r1
            int r0 = r0 % 2
            r1 = 0
            r2 = 0
            if (r0 != 0) goto L15
            android.widget.EditText r0 = r4.initialize
            int r3 = r2 / r2
            if (r0 == 0) goto L3b
            goto L19
        L15:
            android.widget.EditText r0 = r4.initialize
            if (r0 == 0) goto L3b
        L19:
            android.widget.EditText r0 = r4.initialize
            r0.setEnabled(r2)
            com.netcetera.threeds.sdk.infrastructure.bi r0 = new com.netcetera.threeds.sdk.infrastructure.bi
            android.widget.EditText r2 = r4.initialize
            android.text.Editable r2 = r2.getText()
            java.lang.String r2 = r2.toString()
            r0.<init>(r2)
            int r2 = com.netcetera.threeds.sdk.infrastructure.C9266bl.ThreeDS2Service$InitializationCallback
            int r2 = r2 + 31
            int r3 = r2 % 128
            com.netcetera.threeds.sdk.infrastructure.C9266bl.onCompleted = r3
            int r2 = r2 % 2
            if (r2 != 0) goto L3a
            return r0
        L3a:
            throw r1
        L3b:
            return r1
        */
        throw new UnsupportedOperationException("Method not decompiled: com.netcetera.threeds.sdk.infrastructure.C9266bl.get():com.netcetera.threeds.sdk.infrastructure.isEmpty");
    }

    @Override // com.netcetera.threeds.sdk.infrastructure.save
    public void valueOf(InterfaceC9359eo interfaceC9359eo) {
        ThreeDS2Service$InitializationCallback = (onCompleted + 33) % 128;
        String valueOf2 = String.valueOf(this.initialize.getText());
        Object[] objArr = new Object[1];
        valueOf((byte) ((SystemClock.elapsedRealtime() > 0L ? 1 : (SystemClock.elapsedRealtime() == 0L ? 0 : -1)) + 118), (short) TextUtils.getCapsMode("", 0, 0), (-534942747) - Color.green(0), 4 - (ViewConfiguration.getTouchSlop() >> 8), (-399027063) - TextUtils.indexOf("", "", 0), objArr);
        interfaceC9359eo.values(((String) objArr[0]).intern(), valueOf2);
        int i = ThreeDS2Service$InitializationCallback + 97;
        onCompleted = i % 128;
        if (i % 2 != 0) {
            throw null;
        }
    }

    private static void valueOf(byte b, short s, int i, int i2, int i3, Object[] objArr) {
        String obj;
        synchronized (createTransaction.ThreeDS2ServiceInstance) {
            try {
                StringBuilder sb = new StringBuilder();
                int i4 = get;
                int i5 = i2 + i4;
                int i6 = i5 == -1 ? 1 : 0;
                if (i6 != 0) {
                    byte[] bArr = ThreeDS2Service;
                    if (bArr != null) {
                        i5 = (byte) (bArr[valueOf + i] + i4);
                    } else {
                        i5 = (short) (ThreeDS2ServiceInstance[valueOf + i] + i4);
                    }
                }
                if (i5 > 0) {
                    createTransaction.values = ((i + i5) - 2) + valueOf + i6;
                    char c = (char) (i3 + values);
                    createTransaction.get = c;
                    sb.append(c);
                    createTransaction.valueOf = createTransaction.get;
                    createTransaction.ThreeDS2Service = 1;
                    while (createTransaction.ThreeDS2Service < i5) {
                        byte[] bArr2 = ThreeDS2Service;
                        if (bArr2 != null) {
                            int i7 = createTransaction.values;
                            createTransaction.values = i7 - 1;
                            createTransaction.get = (char) (createTransaction.valueOf + (((byte) (bArr2[i7] + s)) ^ b));
                        } else {
                            short[] sArr = ThreeDS2ServiceInstance;
                            int i8 = createTransaction.values;
                            createTransaction.values = i8 - 1;
                            createTransaction.get = (char) (createTransaction.valueOf + (((short) (sArr[i8] + s)) ^ b));
                        }
                        sb.append(createTransaction.get);
                        createTransaction.valueOf = createTransaction.get;
                        createTransaction.ThreeDS2Service++;
                    }
                }
                obj = sb.toString();
            } catch (Throwable th2) {
                throw th2;
            }
        }
        objArr[0] = obj;
    }

    @Override // com.netcetera.threeds.sdk.infrastructure.save
    public void values(InterfaceC9362er interfaceC9362er) {
        onCompleted = (ThreeDS2Service$InitializationCallback + 41) % 128;
        values();
        Object[] objArr = new Object[1];
        valueOf((byte) (119 - (ViewConfiguration.getFadingEdgeLength() >> 16)), (short) (ViewConfiguration.getKeyRepeatTimeout() >> 16), (-534942746) - (Process.getElapsedCpuTime() > 0L ? 1 : (Process.getElapsedCpuTime() == 0L ? 0 : -1)), (KeyEvent.getMaxKeyCode() >> 16) + 4, (-399027063) - (ViewConfiguration.getTapTimeout() >> 16), objArr);
        String valueOf2 = interfaceC9362er.valueOf(((String) objArr[0]).intern(), null);
        if (C9658om.ThreeDS2ServiceInstance(valueOf2)) {
            onCompleted = (ThreeDS2Service$InitializationCallback + 67) % 128;
            this.initialize.setText(valueOf2);
        }
    }
}
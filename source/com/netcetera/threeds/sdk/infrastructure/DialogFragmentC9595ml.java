package com.netcetera.threeds.sdk.infrastructure;

import android.app.Activity;
import android.app.Dialog;
import android.app.DialogFragment;
import android.content.DialogInterface;
import android.content.Intent;
import android.content.res.Resources;
import android.os.Bundle;
import android.os.SystemClock;
import android.telephony.cdma.CdmaCellLocation;
import android.text.TextUtils;
import android.view.KeyEvent;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewConfiguration;
import android.view.ViewGroup;
import android.view.Window;

/* renamed from: com.netcetera.threeds.sdk.infrastructure.ml */
/* loaded from: classes5.dex */
public class DialogFragmentC9595ml extends DialogFragment implements InterfaceC9516jt {
    private static int ThreeDS2Service$InitializationCallback = 0;
    public static long get = 0;
    private static int onError = 1;
    public static char valueOf = 0;
    public static int values = -1677608149;
    private final InterfaceC9652ns ThreeDS2Service = C9653nt.ThreeDS2ServiceInstance(DialogFragmentC9595ml.class);
    private boolean ThreeDS2ServiceInstance;
    private InterfaceC9590mg cleanup;
    private boolean getSDKInfo;
    private InterfaceC9602ms getSDKVersion;
    private boolean getWarnings;
    private boolean initialize;

    private void ConfigParameters() {
        Dialog dialog = getDialog();
        if (dialog != null) {
            ThreeDS2Service$InitializationCallback = (onError + 103) % 128;
            if (this.initialize) {
                dialog.show();
                onError = (ThreeDS2Service$InitializationCallback + 93) % 128;
                return;
            }
            dialog.hide();
        }
    }

    public void ThreeDS2Service(InterfaceC9602ms interfaceC9602ms) {
        int i = (onError + 111) % 128;
        ThreeDS2Service$InitializationCallback = i;
        this.getSDKVersion = interfaceC9602ms;
        int i2 = i + 29;
        onError = i2 % 128;
        if (i2 % 2 == 0) {
            throw null;
        }
    }

    @Override // com.netcetera.threeds.sdk.infrastructure.InterfaceC9516jt
    public void ThreeDS2ServiceInstance() {
        int i = onError;
        ThreeDS2Service$InitializationCallback = (i + 77) % 128;
        if (!(!this.initialize)) {
            ThreeDS2Service$InitializationCallback = (i + 59) % 128;
            this.initialize = false;
            ConfigParameters();
        }
    }

    @Override // com.netcetera.threeds.sdk.infrastructure.InterfaceC9516jt
    public Intent cleanup() {
        onError = (ThreeDS2Service$InitializationCallback + 111) % 128;
        if (getActivity() == null) {
            return null;
        }
        int i = onError + 125;
        ThreeDS2Service$InitializationCallback = i % 128;
        if (i % 2 == 0) {
            return getActivity().getIntent();
        }
        getActivity().getIntent();
        throw null;
    }

    @Override // com.netcetera.threeds.sdk.infrastructure.InterfaceC9516jt
    public boolean get() {
        int i = (onError + 87) % 128;
        ThreeDS2Service$InitializationCallback = i;
        boolean z = this.initialize;
        onError = (i + 67) % 128;
        return z;
    }

    public void getSDKInfo() {
        onError = (ThreeDS2Service$InitializationCallback + 7) % 128;
        dismiss();
        setShowsDialog(false);
        ThreeDS2Service$InitializationCallback = (onError + 23) % 128;
    }

    public boolean getSDKVersion() {
        int i = ThreeDS2Service$InitializationCallback + 113;
        onError = i % 128;
        if (i % 2 == 0) {
            int i2 = 34 / 0;
            return this.getSDKInfo;
        }
        return this.getSDKInfo;
    }

    public void getWarnings() {
        Dialog dialog = getDialog();
        if (dialog != null) {
            ThreeDS2Service$InitializationCallback = (onError + 115) % 128;
            if (getRetainInstance()) {
                dialog.setDismissMessage(null);
                ThreeDS2Service$InitializationCallback = (onError + 69) % 128;
            }
        }
    }

    public void initialize() {
        int i = onError;
        this.getSDKInfo = true;
        int i2 = i + 29;
        ThreeDS2Service$InitializationCallback = i2 % 128;
        if (i2 % 2 != 0) {
            int i3 = 9 / 0;
        }
    }

    @Override // android.app.DialogFragment, android.app.Fragment
    public final void onActivityCreated(Bundle bundle) {
        int i = ThreeDS2Service$InitializationCallback + 53;
        onError = i % 128;
        if (i % 2 == 0) {
            super.onActivityCreated(bundle);
            int i2 = 88 / 0;
            if (!getSDKVersion()) {
                return;
            }
        } else {
            super.onActivityCreated(bundle);
            if (!getSDKVersion()) {
                return;
            }
        }
        this.getSDKVersion.get(bundle, this.getWarnings);
        ThreeDS2Service$InitializationCallback = (onError + 71) % 128;
    }

    @Override // android.app.DialogFragment, android.app.Fragment
    public final void onCreate(Bundle bundle) {
        int i = onError + 51;
        ThreeDS2Service$InitializationCallback = i % 128;
        if (i % 2 != 0) {
            super.onCreate(bundle);
            setRetainInstance(false);
            setCancelable(false);
            return;
        }
        super.onCreate(bundle);
        setRetainInstance(true);
        setCancelable(false);
    }

    @Override // android.app.DialogFragment
    public final Dialog onCreateDialog(Bundle bundle) {
        Activity activity = getActivity();
        Resources resources = getActivity().getResources();
        Object[] objArr = new Object[1];
        ThreeDS2ServiceInstance(1 - (SystemClock.elapsedRealtimeNanos() > 0L ? 1 : (SystemClock.elapsedRealtimeNanos() == 0L ? 0 : -1)), (char) ((ViewConfiguration.getZoomControlsTimeout() > 0L ? 1 : (ViewConfiguration.getZoomControlsTimeout() == 0L ? 0 : -1)) - 1), "❖\udaa9ſ㢧繨矎ऱޱ褗\ue5e6\ue1c9ⶐ럌뒈㡒筸ͣᗕ敓ᴫꖊ厊随䁎", "憱濒撨ȥ", "\u0000\u0000\u0000\u0000", objArr);
        String intern = ((String) objArr[0]).intern();
        Object[] objArr2 = new Object[1];
        ThreeDS2ServiceInstance((ViewConfiguration.getGlobalActionKeyTimeout() > 0L ? 1 : (ViewConfiguration.getGlobalActionKeyTimeout() == 0L ? 0 : -1)) + 108083530, (char) (21935 - (CdmaCellLocation.convertQuartSecToDecDegrees(0) > 0.0d ? 1 : (CdmaCellLocation.convertQuartSecToDecDegrees(0) == 0.0d ? 0 : -1))), "\udd83\u09da豯湞\ue9c9", "䮳焹꼆\u2e55", "\u0000\u0000\u0000\u0000", objArr2);
        Dialog dialog = new Dialog(activity, resources.getIdentifier(intern, ((String) objArr2[0]).intern(), getActivity().getPackageName()));
        Window window = dialog.getWindow();
        if (window == null) {
            InterfaceC9652ns interfaceC9652ns = this.ThreeDS2Service;
            Object[] objArr3 = new Object[1];
            ThreeDS2ServiceInstance((-204019816) - TextUtils.getOffsetAfter("", 0), (char) KeyEvent.getDeadChar(0, 0), "숅흮̑쯚㎆⍢吣儠\uf315뺙䏺䃬\ue9b0㟙\ue3ce쬯橻㍵뀒ឧ士ͻ\uefa3仑鐀뜺\ue0de⫋ꃫ柬\ue033犵⟉携\ud942", "頴훧\ue3f3\uf44e", "\u0000\u0000\u0000\u0000", objArr3);
            interfaceC9652ns.valueOf(((String) objArr3[0]).intern());
            ThreeDS2Service$InitializationCallback = (onError + 107) % 128;
        } else if (!(!getSDKVersion())) {
            onError = (ThreeDS2Service$InitializationCallback + 115) % 128;
            this.cleanup.ThreeDS2ServiceInstance(window);
        }
        return dialog;
    }

    @Override // android.app.Fragment
    public final View onCreateView(LayoutInflater layoutInflater, ViewGroup viewGroup, Bundle bundle) {
        onError = (ThreeDS2Service$InitializationCallback + 119) % 128;
        if (!(!getSDKVersion())) {
            onError = (ThreeDS2Service$InitializationCallback + 1) % 128;
            View view = this.getSDKVersion.get(layoutInflater, viewGroup, bundle, this.getWarnings);
            ThreeDS2Service$InitializationCallback = (onError + 39) % 128;
            return view;
        }
        ThreeDS2Service$InitializationCallback = (onError + 53) % 128;
        return null;
    }

    @Override // android.app.Fragment
    public final void onDestroy() {
        int i = onError + 69;
        ThreeDS2Service$InitializationCallback = i % 128;
        int i2 = i % 2;
        super.onDestroy();
        if (i2 == 0) {
            int i3 = ThreeDS2Service$InitializationCallback + 59;
            onError = i3 % 128;
            if (i3 % 2 != 0) {
                return;
            }
            throw null;
        }
        throw null;
    }

    @Override // android.app.DialogFragment, android.app.Fragment
    public final void onDestroyView() {
        ThreeDS2Service$InitializationCallback = (onError + 13) % 128;
        getWarnings();
        if (getSDKVersion()) {
            onError = (ThreeDS2Service$InitializationCallback + 7) % 128;
            this.getSDKVersion.get(this.getWarnings);
            onError = (ThreeDS2Service$InitializationCallback + 5) % 128;
        }
        super.onDestroyView();
        onError = (ThreeDS2Service$InitializationCallback + 99) % 128;
    }

    @Override // android.app.DialogFragment, android.content.DialogInterface.OnDismissListener
    public void onDismiss(DialogInterface dialogInterface) {
        int i = ThreeDS2Service$InitializationCallback + 47;
        onError = i % 128;
        if (i % 2 != 0) {
            getSDKVersion();
            super.onDismiss(dialogInterface);
            onError = (ThreeDS2Service$InitializationCallback + 5) % 128;
            return;
        }
        getSDKVersion();
        super.onDismiss(dialogInterface);
        throw null;
    }

    @Override // android.app.Fragment
    public final void onPause() {
        this.ThreeDS2ServiceInstance = false;
        if (getSDKVersion()) {
            this.getSDKVersion.values(this.getWarnings);
            onError = (ThreeDS2Service$InitializationCallback + 109) % 128;
        }
        super.onPause();
        onError = (ThreeDS2Service$InitializationCallback + 75) % 128;
    }

    /* JADX WARN: Code restructure failed: missing block: B:10:0x002e, code lost:
        if (r3.getWarnings == false) goto L6;
     */
    /* JADX WARN: Code restructure failed: missing block: B:11:0x0030, code lost:
        r0 = com.netcetera.threeds.sdk.infrastructure.DialogFragmentC9595ml.onError + 69;
        com.netcetera.threeds.sdk.infrastructure.DialogFragmentC9595ml.ThreeDS2Service$InitializationCallback = r0 % 128;
     */
    /* JADX WARN: Code restructure failed: missing block: B:12:0x003a, code lost:
        if ((r0 % 2) != 0) goto L16;
     */
    /* JADX WARN: Code restructure failed: missing block: B:13:0x003c, code lost:
        getSDKInfo();
     */
    /* JADX WARN: Code restructure failed: missing block: B:14:0x0040, code lost:
        getSDKInfo();
     */
    /* JADX WARN: Code restructure failed: missing block: B:15:0x0043, code lost:
        throw null;
     */
    /* JADX WARN: Code restructure failed: missing block: B:16:0x0044, code lost:
        getSDKInfo();
     */
    /* JADX WARN: Code restructure failed: missing block: B:5:0x0017, code lost:
        if (getSDKVersion() != false) goto L11;
     */
    /* JADX WARN: Code restructure failed: missing block: B:8:0x0023, code lost:
        if (getSDKVersion() != false) goto L11;
     */
    /* JADX WARN: Code restructure failed: missing block: B:9:0x0025, code lost:
        r3.getSDKVersion.valueOf(r3.getWarnings);
     */
    @Override // android.app.Fragment
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final void onResume() {
        /*
            r3 = this;
            int r0 = com.netcetera.threeds.sdk.infrastructure.DialogFragmentC9595ml.ThreeDS2Service$InitializationCallback
            int r0 = r0 + 41
            int r1 = r0 % 128
            com.netcetera.threeds.sdk.infrastructure.DialogFragmentC9595ml.onError = r1
            int r0 = r0 % 2
            r1 = 0
            r2 = 1
            if (r0 != 0) goto L1a
            super.onResume()
            r3.ThreeDS2ServiceInstance = r2
            boolean r0 = r3.getSDKVersion()
            if (r0 == 0) goto L44
            goto L25
        L1a:
            super.onResume()
            r3.ThreeDS2ServiceInstance = r2
            boolean r0 = r3.getSDKVersion()
            if (r0 == 0) goto L44
        L25:
            com.netcetera.threeds.sdk.infrastructure.ms r0 = r3.getSDKVersion
            boolean r2 = r3.getWarnings
            r0.valueOf(r2)
            boolean r0 = r3.getWarnings
            if (r0 == 0) goto L47
            int r0 = com.netcetera.threeds.sdk.infrastructure.DialogFragmentC9595ml.onError
            int r0 = r0 + 69
            int r2 = r0 % 128
            com.netcetera.threeds.sdk.infrastructure.DialogFragmentC9595ml.ThreeDS2Service$InitializationCallback = r2
            int r0 = r0 % 2
            if (r0 != 0) goto L40
            r3.getSDKInfo()
            goto L47
        L40:
            r3.getSDKInfo()
            throw r1
        L44:
            r3.getSDKInfo()
        L47:
            int r0 = com.netcetera.threeds.sdk.infrastructure.DialogFragmentC9595ml.onError
            int r0 = r0 + 41
            int r2 = r0 % 128
            com.netcetera.threeds.sdk.infrastructure.DialogFragmentC9595ml.ThreeDS2Service$InitializationCallback = r2
            int r0 = r0 % 2
            if (r0 != 0) goto L54
            return
        L54:
            throw r1
        */
        throw new UnsupportedOperationException("Method not decompiled: com.netcetera.threeds.sdk.infrastructure.DialogFragmentC9595ml.onResume():void");
    }

    @Override // android.app.DialogFragment, android.app.Fragment
    public void onSaveInstanceState(Bundle bundle) {
        int i = onError + 35;
        ThreeDS2Service$InitializationCallback = i % 128;
        if (i % 2 == 0) {
            if (getSDKVersion()) {
                this.getSDKVersion.values(bundle, this.getWarnings);
                onError = (ThreeDS2Service$InitializationCallback + 85) % 128;
            }
            super.onSaveInstanceState(bundle);
            return;
        }
        getSDKVersion();
        throw null;
    }

    @Override // android.app.DialogFragment, android.app.Fragment
    public final void onStart() {
        onError = (ThreeDS2Service$InitializationCallback + 87) % 128;
        super.onStart();
        if (getSDKVersion()) {
            int i = onError + 7;
            ThreeDS2Service$InitializationCallback = i % 128;
            if (i % 2 != 0) {
                ConfigParameters();
                this.getSDKVersion.ThreeDS2ServiceInstance(this.getWarnings);
                int i2 = 43 / 0;
            } else {
                ConfigParameters();
                this.getSDKVersion.ThreeDS2ServiceInstance(this.getWarnings);
            }
        }
        int i3 = ThreeDS2Service$InitializationCallback + 23;
        onError = i3 % 128;
        if (i3 % 2 != 0) {
            return;
        }
        throw null;
    }

    @Override // android.app.DialogFragment, android.app.Fragment
    public final void onStop() {
        int i = ThreeDS2Service$InitializationCallback + 117;
        onError = i % 128;
        if (i % 2 != 0) {
            getSDKVersion();
            super.onStop();
            onError = (ThreeDS2Service$InitializationCallback + 29) % 128;
            return;
        }
        getSDKVersion();
        super.onStop();
        throw null;
    }

    @Override // com.netcetera.threeds.sdk.infrastructure.InterfaceC9516jt
    public void valueOf() {
        int i = onError + 63;
        ThreeDS2Service$InitializationCallback = i % 128;
        if (i % 2 != 0) {
            int i2 = 10 / 0;
            if (this.initialize) {
                return;
            }
        } else if (this.initialize) {
            return;
        }
        this.initialize = true;
        ConfigParameters();
        onError = (ThreeDS2Service$InitializationCallback + 53) % 128;
    }

    @Override // com.netcetera.threeds.sdk.infrastructure.InterfaceC9516jt
    public void values() {
        this.getWarnings = true;
        if (this.ThreeDS2ServiceInstance) {
            ThreeDS2Service$InitializationCallback = (onError + 119) % 128;
            getSDKInfo();
        }
        onError = (ThreeDS2Service$InitializationCallback + 83) % 128;
    }

    public void ThreeDS2Service(InterfaceC9590mg interfaceC9590mg) {
        int i = (ThreeDS2Service$InitializationCallback + 81) % 128;
        onError = i;
        this.cleanup = interfaceC9590mg;
        int i2 = i + 103;
        ThreeDS2Service$InitializationCallback = i2 % 128;
        if (i2 % 2 != 0) {
            throw null;
        }
    }

    @Override // com.netcetera.threeds.sdk.infrastructure.InterfaceC9516jt
    public Dialog ThreeDS2Service() {
        int i = ThreeDS2Service$InitializationCallback + 81;
        onError = i % 128;
        if (i % 2 != 0) {
            return getDialog();
        }
        getDialog();
        throw null;
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
            long r6 = com.netcetera.threeds.sdk.infrastructure.DialogFragmentC9595ml.get     // Catch: java.lang.Throwable -> L7c
            long r4 = r4 ^ r6
            int r2 = com.netcetera.threeds.sdk.infrastructure.DialogFragmentC9595ml.values     // Catch: java.lang.Throwable -> L7c
            long r6 = (long) r2     // Catch: java.lang.Throwable -> L7c
            long r4 = r4 ^ r6
            char r2 = com.netcetera.threeds.sdk.infrastructure.DialogFragmentC9595ml.valueOf     // Catch: java.lang.Throwable -> L7c
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
        throw new UnsupportedOperationException("Method not decompiled: com.netcetera.threeds.sdk.infrastructure.DialogFragmentC9595ml.ThreeDS2ServiceInstance(int, char, java.lang.String, java.lang.String, java.lang.String, java.lang.Object[]):void");
    }
}

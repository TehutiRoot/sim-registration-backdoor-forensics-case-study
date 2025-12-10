package com.netcetera.threeds.sdk.infrastructure;

import android.app.Dialog;
import android.content.DialogInterface;
import android.content.Intent;
import android.content.res.Resources;
import android.os.Bundle;
import android.os.Process;
import android.os.SystemClock;
import android.text.TextUtils;
import android.util.TypedValue;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewConfiguration;
import android.view.ViewGroup;
import android.view.Window;
import android.widget.ExpandableListView;
import androidx.annotation.NonNull;
import androidx.fragment.app.DialogFragment;
import androidx.fragment.app.FragmentActivity;
import th.p047co.dtac.android.dtacone.view.activity.CameraActivity;

/* renamed from: com.netcetera.threeds.sdk.infrastructure.mt */
/* loaded from: classes5.dex */
public class C9603mt extends DialogFragment implements InterfaceC9516jt {
    public static int get = 141;
    private static int getSDKInfo = 1;
    private static int initialize;
    private final InterfaceC9652ns ThreeDS2Service = C9653nt.ThreeDS2ServiceInstance(DialogFragmentC9595ml.class);
    private boolean ThreeDS2ServiceInstance;
    private boolean cleanup;
    private InterfaceC9602ms getSDKVersion;
    private InterfaceC9590mg getWarnings;
    private boolean valueOf;
    private boolean values;

    private void ThreeDS2Service$InitializationCallback() {
        int i = initialize + 23;
        getSDKInfo = i % 128;
        if (i % 2 != 0) {
            Dialog dialog = getDialog();
            if (dialog != null) {
                if (this.cleanup) {
                    getSDKInfo = (initialize + 23) % 128;
                    dialog.show();
                    return;
                }
                dialog.hide();
                return;
            }
            return;
        }
        getDialog();
        throw null;
    }

    @Override // com.netcetera.threeds.sdk.infrastructure.InterfaceC9516jt
    public Dialog ThreeDS2Service() {
        Dialog dialog;
        int i = initialize + 93;
        getSDKInfo = i % 128;
        if (i % 2 == 0) {
            dialog = getDialog();
            int i2 = 79 / 0;
        } else {
            dialog = getDialog();
        }
        initialize = (getSDKInfo + 51) % 128;
        return dialog;
    }

    public void ThreeDS2ServiceInstance(InterfaceC9602ms interfaceC9602ms) {
        int i = (getSDKInfo + 93) % 128;
        initialize = i;
        this.getSDKVersion = interfaceC9602ms;
        getSDKInfo = (i + 113) % 128;
    }

    @Override // com.netcetera.threeds.sdk.infrastructure.InterfaceC9516jt
    public Intent cleanup() {
        int i = getSDKInfo + CameraActivity.REQUEST_CODE;
        initialize = i % 128;
        if (i % 2 != 0) {
            int i2 = 53 / 0;
            return requireActivity().getIntent();
        }
        return requireActivity().getIntent();
    }

    @Override // com.netcetera.threeds.sdk.infrastructure.InterfaceC9516jt
    public boolean get() {
        int i = initialize;
        boolean z = this.cleanup;
        int i2 = i + 89;
        getSDKInfo = i2 % 128;
        if (i2 % 2 != 0) {
            return z;
        }
        throw null;
    }

    public void getSDKInfo() {
        initialize = (getSDKInfo + 83) % 128;
        Dialog dialog = getDialog();
        if (dialog != null && getRetainInstance()) {
            int i = initialize + 55;
            getSDKInfo = i % 128;
            int i2 = i % 2;
            dialog.setDismissMessage(null);
            if (i2 == 0) {
                int i3 = 78 / 0;
            }
        }
        int i4 = getSDKInfo + 119;
        initialize = i4 % 128;
        if (i4 % 2 == 0) {
            return;
        }
        throw null;
    }

    public boolean getSDKVersion() {
        int i = initialize;
        int i2 = i + 23;
        getSDKInfo = i2 % 128;
        if (i2 % 2 != 0) {
            boolean z = this.values;
            int i3 = i + 121;
            getSDKInfo = i3 % 128;
            if (i3 % 2 != 0) {
                return z;
            }
            throw null;
        }
        throw null;
    }

    public void getWarnings() {
        getSDKInfo = (initialize + 39) % 128;
        dismiss();
        setShowsDialog(false);
        getSDKInfo = (initialize + 75) % 128;
    }

    public void initialize() {
        int i = getSDKInfo;
        int i2 = i + 79;
        initialize = i2 % 128;
        if (i2 % 2 != 0) {
            this.values = false;
        } else {
            this.values = true;
        }
        int i3 = i + 7;
        initialize = i3 % 128;
        if (i3 % 2 != 0) {
            int i4 = 30 / 0;
        }
    }

    @Override // androidx.fragment.app.DialogFragment, androidx.fragment.app.Fragment
    public final void onActivityCreated(Bundle bundle) {
        super.onActivityCreated(bundle);
        if (!(!getSDKVersion())) {
            getSDKInfo = (initialize + 57) % 128;
            this.getSDKVersion.get(bundle, this.valueOf);
        }
        getSDKInfo = (initialize + 29) % 128;
    }

    @Override // androidx.fragment.app.DialogFragment, androidx.fragment.app.Fragment
    public final void onCreate(Bundle bundle) {
        getSDKInfo = (initialize + 29) % 128;
        super.onCreate(bundle);
        setRetainInstance(true);
        setCancelable(false);
        initialize = (getSDKInfo + 61) % 128;
    }

    @Override // androidx.fragment.app.DialogFragment
    public final Dialog onCreateDialog(Bundle bundle) {
        InterfaceC9652ns interfaceC9652ns;
        Object obj;
        FragmentActivity requireActivity = requireActivity();
        Resources resources = requireActivity().getResources();
        Object[] objArr = new Object[1];
        get(2 - View.resolveSize(0, 0), TextUtils.indexOf((CharSequence) "", '0', 0, 0) + 25, "\f\u0004￭\u0002\u0000\ufff3\u0007\u0011\u0004\u0004￣\u0012\ufff2\u0003\n￣\b\u0000\u000b\u000e\u0006\ufff3\u0007\u0004", 238 - ExpandableListView.getPackedPositionGroup(0L), false, objArr);
        String intern = ((String) objArr[0]).intern();
        Object[] objArr2 = new Object[1];
        get(View.resolveSizeAndState(0, 0, 0) + 3, 5 - (TypedValue.complexToFraction(0, 0.0f, 0.0f) > 0.0f ? 1 : (TypedValue.complexToFraction(0, 0.0f, 0.0f) == 0.0f ? 0 : -1)), "\t\u0004\u0003\ufff5￼", 254 - (SystemClock.elapsedRealtimeNanos() > 0L ? 1 : (SystemClock.elapsedRealtimeNanos() == 0L ? 0 : -1)), true, objArr2);
        Dialog dialog = new Dialog(requireActivity, resources.getIdentifier(intern, ((String) objArr2[0]).intern(), requireActivity().getPackageName()));
        Window window = dialog.getWindow();
        if (window == null) {
            int i = getSDKInfo + 79;
            initialize = i % 128;
            if (i % 2 != 0) {
                interfaceC9652ns = this.ThreeDS2Service;
                Object[] objArr3 = new Object[1];
                get(31 % (ViewConfiguration.getWindowTouchSlop() >> 33), 93 >>> TextUtils.indexOf((CharSequence) "", '.'), "ￚￇ\f\u000f\u001bￇ\f\u0019\u001c\u000e\u0010\r\u0015\u0016\nￇ\u001b\u0016\u0015\u0015\b￪\u001e\u0016\u000b\u0015\u0010\u001eￇ\ufff2￫\ufffaￇ\ufffa￫", (Process.myPid() * 73) + 31054, true, objArr3);
                obj = objArr3[0];
            } else {
                interfaceC9652ns = this.ThreeDS2Service;
                Object[] objArr4 = new Object[1];
                get(22 - (ViewConfiguration.getWindowTouchSlop() >> 8), TextUtils.indexOf((CharSequence) "", '0') + 36, "ￚￇ\f\u000f\u001bￇ\f\u0019\u001c\u000e\u0010\r\u0015\u0016\nￇ\u001b\u0016\u0015\u0015\b￪\u001e\u0016\u000b\u0015\u0010\u001eￇ\ufff2￫\ufffaￇ\ufffa￫", (Process.myPid() >> 22) + 230, true, objArr4);
                obj = objArr4[0];
            }
            interfaceC9652ns.valueOf(((String) obj).intern());
        } else if (getSDKVersion()) {
            int i2 = initialize + 69;
            getSDKInfo = i2 % 128;
            if (i2 % 2 != 0) {
                this.getWarnings.ThreeDS2ServiceInstance(window);
            } else {
                this.getWarnings.ThreeDS2ServiceInstance(window);
                throw null;
            }
        }
        return dialog;
    }

    @Override // androidx.fragment.app.Fragment
    public final View onCreateView(@NonNull LayoutInflater layoutInflater, ViewGroup viewGroup, Bundle bundle) {
        initialize = (getSDKInfo + 125) % 128;
        if (!getSDKVersion()) {
            initialize = (getSDKInfo + 17) % 128;
            return null;
        }
        int i = initialize + 89;
        getSDKInfo = i % 128;
        if (i % 2 == 0) {
            View view = this.getSDKVersion.get(layoutInflater, viewGroup, bundle, this.valueOf);
            int i2 = 77 / 0;
            return view;
        }
        return this.getSDKVersion.get(layoutInflater, viewGroup, bundle, this.valueOf);
    }

    @Override // androidx.fragment.app.Fragment
    public final void onDestroy() {
        getSDKInfo = (initialize + 125) % 128;
        super.onDestroy();
        int i = initialize + 95;
        getSDKInfo = i % 128;
        if (i % 2 != 0) {
            return;
        }
        throw null;
    }

    @Override // androidx.fragment.app.DialogFragment, androidx.fragment.app.Fragment
    public final void onDestroyView() {
        getSDKInfo();
        if (getSDKVersion()) {
            int i = getSDKInfo + 39;
            initialize = i % 128;
            if (i % 2 == 0) {
                this.getSDKVersion.get(this.valueOf);
            } else {
                this.getSDKVersion.get(this.valueOf);
                throw null;
            }
        }
        super.onDestroyView();
        initialize = (getSDKInfo + 33) % 128;
    }

    @Override // androidx.fragment.app.DialogFragment, android.content.DialogInterface.OnDismissListener
    public void onDismiss(@NonNull DialogInterface dialogInterface) {
        int i = initialize + 55;
        getSDKInfo = i % 128;
        if (i % 2 != 0) {
            getSDKVersion();
            super.onDismiss(dialogInterface);
            initialize = (getSDKInfo + 65) % 128;
            return;
        }
        getSDKVersion();
        super.onDismiss(dialogInterface);
        throw null;
    }

    @Override // androidx.fragment.app.Fragment
    public final void onPause() {
        getSDKInfo = (initialize + CameraActivity.REQUEST_CODE) % 128;
        this.ThreeDS2ServiceInstance = false;
        if (!(!getSDKVersion())) {
            int i = initialize + 71;
            getSDKInfo = i % 128;
            if (i % 2 != 0) {
                this.getSDKVersion.values(this.valueOf);
            } else {
                this.getSDKVersion.values(this.valueOf);
                throw null;
            }
        }
        super.onPause();
        int i2 = initialize + 7;
        getSDKInfo = i2 % 128;
        if (i2 % 2 != 0) {
            return;
        }
        throw null;
    }

    @Override // androidx.fragment.app.Fragment
    public final void onResume() {
        super.onResume();
        this.ThreeDS2ServiceInstance = true;
        if (!(!getSDKVersion())) {
            getSDKInfo = (initialize + 99) % 128;
            this.getSDKVersion.valueOf(this.valueOf);
            if (!(!this.valueOf)) {
                int i = initialize + 75;
                getSDKInfo = i % 128;
                if (i % 2 != 0) {
                    getWarnings();
                    return;
                } else {
                    getWarnings();
                    throw null;
                }
            }
            return;
        }
        getWarnings();
    }

    /* JADX WARN: Code restructure failed: missing block: B:10:0x0020, code lost:
        com.netcetera.threeds.sdk.infrastructure.C9603mt.getSDKInfo = (com.netcetera.threeds.sdk.infrastructure.C9603mt.initialize + 77) % 128;
        r2.getSDKVersion.values(r3, r2.valueOf);
     */
    /* JADX WARN: Code restructure failed: missing block: B:5:0x0014, code lost:
        if (getSDKVersion() != false) goto L8;
     */
    /* JADX WARN: Code restructure failed: missing block: B:8:0x001d, code lost:
        if ((!getSDKVersion()) != false) goto L5;
     */
    @Override // androidx.fragment.app.DialogFragment, androidx.fragment.app.Fragment
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public void onSaveInstanceState(@androidx.annotation.NonNull android.os.Bundle r3) {
        /*
            r2 = this;
            int r0 = com.netcetera.threeds.sdk.infrastructure.C9603mt.getSDKInfo
            int r0 = r0 + 33
            int r1 = r0 % 128
            com.netcetera.threeds.sdk.infrastructure.C9603mt.initialize = r1
            int r0 = r0 % 2
            if (r0 == 0) goto L17
            boolean r0 = r2.getSDKVersion()
            r1 = 96
            int r1 = r1 / 0
            if (r0 == 0) goto L2f
            goto L20
        L17:
            boolean r0 = r2.getSDKVersion()
            r0 = r0 ^ 1
            if (r0 == 0) goto L20
            goto L2f
        L20:
            int r0 = com.netcetera.threeds.sdk.infrastructure.C9603mt.initialize
            int r0 = r0 + 77
            int r0 = r0 % 128
            com.netcetera.threeds.sdk.infrastructure.C9603mt.getSDKInfo = r0
            com.netcetera.threeds.sdk.infrastructure.ms r0 = r2.getSDKVersion
            boolean r1 = r2.valueOf
            r0.values(r3, r1)
        L2f:
            super.onSaveInstanceState(r3)
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: com.netcetera.threeds.sdk.infrastructure.C9603mt.onSaveInstanceState(android.os.Bundle):void");
    }

    @Override // androidx.fragment.app.DialogFragment, androidx.fragment.app.Fragment
    public final void onStart() {
        int i = initialize + 17;
        getSDKInfo = i % 128;
        if (i % 2 != 0) {
            super.onStart();
            if (getSDKVersion()) {
                int i2 = initialize + 49;
                getSDKInfo = i2 % 128;
                if (i2 % 2 == 0) {
                    ThreeDS2Service$InitializationCallback();
                    this.getSDKVersion.ThreeDS2ServiceInstance(this.valueOf);
                    int i3 = 10 / 0;
                    return;
                }
                ThreeDS2Service$InitializationCallback();
                this.getSDKVersion.ThreeDS2ServiceInstance(this.valueOf);
                return;
            }
            return;
        }
        super.onStart();
        getSDKVersion();
        throw null;
    }

    @Override // androidx.fragment.app.DialogFragment, androidx.fragment.app.Fragment
    public final void onStop() {
        getSDKInfo = (initialize + 125) % 128;
        getSDKVersion();
        super.onStop();
        initialize = (getSDKInfo + 117) % 128;
    }

    public void valueOf(InterfaceC9590mg interfaceC9590mg) {
        int i = getSDKInfo + 107;
        initialize = i % 128;
        int i2 = i % 2;
        this.getWarnings = interfaceC9590mg;
        if (i2 != 0) {
            throw null;
        }
    }

    /* JADX WARN: Code restructure failed: missing block: B:5:0x0010, code lost:
        if (r3.ThreeDS2ServiceInstance != false) goto L11;
     */
    /* JADX WARN: Code restructure failed: missing block: B:8:0x0017, code lost:
        if (r3.ThreeDS2ServiceInstance != false) goto L11;
     */
    /* JADX WARN: Code restructure failed: missing block: B:9:0x0019, code lost:
        getWarnings();
     */
    @Override // com.netcetera.threeds.sdk.infrastructure.InterfaceC9516jt
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public void values() {
        /*
            r3 = this;
            int r0 = com.netcetera.threeds.sdk.infrastructure.C9603mt.initialize
            r1 = 1
            int r0 = r0 + r1
            int r2 = r0 % 128
            com.netcetera.threeds.sdk.infrastructure.C9603mt.getSDKInfo = r2
            int r0 = r0 % 2
            if (r0 != 0) goto L13
            r3.valueOf = r1
            boolean r0 = r3.ThreeDS2ServiceInstance
            if (r0 == 0) goto L1c
            goto L19
        L13:
            r3.valueOf = r1
            boolean r0 = r3.ThreeDS2ServiceInstance
            if (r0 == 0) goto L1c
        L19:
            r3.getWarnings()
        L1c:
            int r0 = com.netcetera.threeds.sdk.infrastructure.C9603mt.getSDKInfo
            int r0 = r0 + 71
            int r1 = r0 % 128
            com.netcetera.threeds.sdk.infrastructure.C9603mt.initialize = r1
            int r0 = r0 % 2
            if (r0 != 0) goto L29
            return
        L29:
            r0 = 0
            throw r0
        */
        throw new UnsupportedOperationException("Method not decompiled: com.netcetera.threeds.sdk.infrastructure.C9603mt.values():void");
    }

    /* JADX WARN: Code restructure failed: missing block: B:0:?, code lost:
        r8 = r8;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    private static void get(int r6, int r7, java.lang.String r8, int r9, boolean r10, java.lang.Object[] r11) {
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
            int r5 = com.netcetera.threeds.sdk.infrastructure.C9603mt.get     // Catch: java.lang.Throwable -> L2f
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
        throw new UnsupportedOperationException("Method not decompiled: com.netcetera.threeds.sdk.infrastructure.C9603mt.get(int, int, java.lang.String, int, boolean, java.lang.Object[]):void");
    }

    @Override // com.netcetera.threeds.sdk.infrastructure.InterfaceC9516jt
    public void ThreeDS2ServiceInstance() {
        if (this.cleanup) {
            this.cleanup = false;
            ThreeDS2Service$InitializationCallback();
            getSDKInfo = (initialize + 83) % 128;
        }
        getSDKInfo = (initialize + 105) % 128;
    }

    @Override // com.netcetera.threeds.sdk.infrastructure.InterfaceC9516jt
    public void valueOf() {
        int i = initialize + 73;
        getSDKInfo = i % 128;
        if (i % 2 != 0) {
            if (!this.cleanup) {
                this.cleanup = true;
                ThreeDS2Service$InitializationCallback();
            }
            int i2 = initialize + 69;
            getSDKInfo = i2 % 128;
            if (i2 % 2 == 0) {
                throw null;
            }
            return;
        }
        throw null;
    }
}

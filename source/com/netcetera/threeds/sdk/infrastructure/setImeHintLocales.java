package com.netcetera.threeds.sdk.infrastructure;

import com.netcetera.threeds.sdk.infrastructure.setTextKeepState;
import th.p047co.dtac.android.dtacone.view.activity.CameraActivity;

/* loaded from: classes5.dex */
public class setImeHintLocales implements setTextKeepState {
    private static int ThreeDS2ServiceInstance = 1;
    private static int valueOf;
    private final C9619nh get;

    /* renamed from: com.netcetera.threeds.sdk.infrastructure.setImeHintLocales$1 */
    /* loaded from: classes5.dex */
    public class C97431 implements setTextKeepState.get {
        private static int get = 0;
        private static int valueOf = 1;
        final /* synthetic */ setTitleMargin values;

        public C97431(setTitleMargin settitlemargin) {
            this.values = settitlemargin;
        }

        /* JADX INFO: Access modifiers changed from: private */
        public static /* synthetic */ String get(setTitleMargin settitlemargin) {
            int i = get;
            valueOf = ((i ^ 103) + ((i & 103) << 1)) % 128;
            String warnings = settitlemargin.get().getWarnings();
            valueOf = ((-2) - (~(get + 44))) % 128;
            return warnings;
        }

        /* JADX INFO: Access modifiers changed from: private */
        public static /* synthetic */ String valueOf(setTitleMargin settitlemargin) {
            int i = valueOf;
            get = (((i & 36) + (i | 36)) - 1) % 128;
            String sDKInfo = settitlemargin.get().getSDKInfo();
            int i2 = get;
            int i3 = (i2 & (-114)) | ((~i2) & 113);
            int i4 = (i2 & 113) << 1;
            int i5 = (i3 & i4) + (i4 | i3);
            valueOf = i5 % 128;
            if (i5 % 2 == 0) {
                int i6 = 35 / 0;
            }
            return sDKInfo;
        }

        @Override // com.netcetera.threeds.sdk.infrastructure.setTextKeepState.get
        public String ThreeDS2ServiceInstance() {
            int i = get;
            valueOf = ((i & 9) + (i | 9)) % 128;
            String ThreeDS2Service = setImeHintLocales.ThreeDS2Service(setImeHintLocales.this, setImeHintLocales.ThreeDS2Service(setImeHintLocales.this, this.values, setOnEditorActionListener.ThreeDS2ServiceInstance));
            int i2 = get + 45;
            valueOf = i2 % 128;
            if (i2 % 2 == 0) {
                int i3 = 4 / 0;
            }
            return ThreeDS2Service;
        }

        @Override // com.netcetera.threeds.sdk.infrastructure.setTextKeepState.get
        public String valueOf() {
            int i = valueOf;
            int i2 = i & 5;
            int i3 = ((((i ^ 5) | i2) << 1) - (~(-((i | 5) & (~i2))))) - 1;
            get = i3 % 128;
            if (i3 % 2 == 0) {
                return setImeHintLocales.ThreeDS2Service(setImeHintLocales.this, setImeHintLocales.ThreeDS2Service(setImeHintLocales.this, this.values, setError.ThreeDS2Service));
            }
            setImeHintLocales.ThreeDS2Service(setImeHintLocales.this, setImeHintLocales.ThreeDS2Service(setImeHintLocales.this, this.values, setError.ThreeDS2Service));
            throw null;
        }
    }

    public setImeHintLocales(C9619nh c9619nh) {
        this.get = c9619nh;
    }

    public static /* synthetic */ String ThreeDS2Service(setImeHintLocales setimehintlocales, setTitleMargin settitlemargin, InterfaceC9626no interfaceC9626no) {
        int i = ThreeDS2ServiceInstance;
        int i2 = i & 13;
        int i3 = -(-((i ^ 13) | i2));
        int i4 = (i2 ^ i3) + ((i3 & i2) << 1);
        valueOf = i4 % 128;
        int i5 = i4 % 2;
        String values = setimehintlocales.values(settitlemargin, interfaceC9626no);
        if (i5 != 0) {
            int i6 = 51 / 0;
        }
        return values;
    }

    private String get(String str) {
        int i = valueOf;
        int i2 = i & 31;
        int i3 = (i | 31) & (~i2);
        int i4 = -(-(i2 << 1));
        ThreeDS2ServiceInstance = (((i3 | i4) << 1) - (i3 ^ i4)) % 128;
        if (C9669om.ThreeDS2ServiceInstance(str)) {
            int i5 = ThreeDS2ServiceInstance;
            int i6 = i5 & 71;
            int i7 = -(-(i5 | 71));
            valueOf = (((i6 | i7) << 1) - (i7 ^ i6)) % 128;
            str = this.get.ThreeDS2Service(str);
            valueOf = (ThreeDS2ServiceInstance + 7) % 128;
        }
        int i8 = ThreeDS2ServiceInstance;
        valueOf = ((((i8 | 4) << 1) - (i8 ^ 4)) - 1) % 128;
        return str;
    }

    public static setTextKeepState values() {
        setImeHintLocales setimehintlocales = new setImeHintLocales(new C9619nh());
        int i = ThreeDS2ServiceInstance;
        int i2 = ((i & (-124)) | ((~i) & CameraActivity.REQUEST_CODE)) + ((i & CameraActivity.REQUEST_CODE) << 1);
        valueOf = i2 % 128;
        if (i2 % 2 != 0) {
            int i3 = 70 / 0;
        }
        return setimehintlocales;
    }

    public static /* synthetic */ String ThreeDS2Service(setImeHintLocales setimehintlocales, String str) {
        int i = ThreeDS2ServiceInstance;
        int i2 = i & 115;
        int i3 = i2 + ((i ^ 115) | i2);
        valueOf = i3 % 128;
        int i4 = i3 % 2;
        String str2 = setimehintlocales.get(str);
        if (i4 != 0) {
            int i5 = 45 / 0;
        }
        return str2;
    }

    private String values(setTitleMargin settitlemargin, InterfaceC9626no<setTitleMargin, String> interfaceC9626no) {
        int i = valueOf;
        int i2 = i ^ CameraActivity.REQUEST_CODE;
        int i3 = i & CameraActivity.REQUEST_CODE;
        ThreeDS2ServiceInstance = (((i2 | i3) << 1) - ((~i3) & (i | CameraActivity.REQUEST_CODE))) % 128;
        if (settitlemargin != null) {
            int i4 = i & 33;
            int i5 = i4 + ((i ^ 33) | i4);
            ThreeDS2ServiceInstance = i5 % 128;
            if (i5 % 2 == 0) {
                settitlemargin.get();
                throw null;
            } else if (settitlemargin.get() != null) {
                String ThreeDS2ServiceInstance2 = interfaceC9626no.ThreeDS2ServiceInstance(settitlemargin);
                int i6 = valueOf;
                int i7 = (((i6 & (-98)) | ((~i6) & 97)) - (~(-(-((i6 & 97) << 1))))) - 1;
                ThreeDS2ServiceInstance = i7 % 128;
                if (i7 % 2 != 0) {
                    return ThreeDS2ServiceInstance2;
                }
                throw null;
            }
        }
        int i8 = valueOf;
        int i9 = (i8 ^ 59) + ((i8 & 59) << 1);
        ThreeDS2ServiceInstance = i9 % 128;
        if (i9 % 2 != 0) {
            return null;
        }
        throw null;
    }

    @Override // com.netcetera.threeds.sdk.infrastructure.setTextKeepState
    public setTextKeepState.get ThreeDS2Service(setTitleMargin settitlemargin) {
        C97431 c97431 = new C97431(settitlemargin);
        int i = ThreeDS2ServiceInstance;
        int i2 = ((i ^ 117) | (i & 117)) << 1;
        int i3 = -(((~i) & 117) | (i & (-118)));
        int i4 = ((i2 | i3) << 1) - (i3 ^ i2);
        valueOf = i4 % 128;
        if (i4 % 2 == 0) {
            return c97431;
        }
        throw null;
    }
}

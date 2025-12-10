package com.netcetera.threeds.sdk.infrastructure;

import com.netcetera.threeds.sdk.api.p018ui.logic.ButtonCustomization;
import com.netcetera.threeds.sdk.api.p018ui.logic.UiCustomization;
import okhttp3.internal.p026ws.WebSocketProtocol;

/* renamed from: com.netcetera.threeds.sdk.infrastructure.kj */
/* loaded from: classes5.dex */
public class C9535kj extends AbstractC9537kk {
    private static int ThreeDS2Service = 1;
    private static int valueOf;

    public static /* synthetic */ InterfaceC9513jq ThreeDS2Service(C9535kj c9535kj, com.netcetera.threeds.sdk.api.p018ui.logic.TextBoxCustomization textBoxCustomization) {
        int i = valueOf;
        int i2 = i & 49;
        int i3 = (i ^ 49) | i2;
        int i4 = ((i2 | i3) << 1) - (i3 ^ i2);
        ThreeDS2Service = i4 % 128;
        if (i4 % 2 != 0) {
            return c9535kj.valueOf(textBoxCustomization);
        }
        c9535kj.valueOf(textBoxCustomization);
        throw null;
    }

    public static /* synthetic */ InterfaceC9507jk get(C9535kj c9535kj, ButtonCustomization buttonCustomization) {
        int i = valueOf;
        ThreeDS2Service = ((i & 79) + (i | 79)) % 128;
        InterfaceC9507jk interfaceC9507jk = c9535kj.get(buttonCustomization);
        int i2 = valueOf;
        int i3 = i2 ^ 109;
        int i4 = (((i2 & 109) | i3) << 1) - i3;
        ThreeDS2Service = i4 % 128;
        if (i4 % 2 != 0) {
            return interfaceC9507jk;
        }
        throw null;
    }

    public static /* synthetic */ InterfaceC9511jo valueOf(C9535kj c9535kj, com.netcetera.threeds.sdk.api.p018ui.logic.LabelCustomization labelCustomization) {
        int i = ThreeDS2Service;
        valueOf = ((((i | 44) << 1) - (i ^ 44)) - 1) % 128;
        InterfaceC9511jo ThreeDS2Service2 = c9535kj.ThreeDS2Service(labelCustomization);
        int i2 = ThreeDS2Service;
        int i3 = i2 & 69;
        int i4 = (i2 | 69) & (~i3);
        int i5 = i3 << 1;
        valueOf = ((i4 ^ i5) + ((i4 & i5) << 1)) % 128;
        return ThreeDS2Service2;
    }

    @Override // com.netcetera.threeds.sdk.infrastructure.AbstractC9537kk
    public /* bridge */ /* synthetic */ InterfaceC9515js values(com.netcetera.threeds.sdk.api.p018ui.logic.UiCustomization uiCustomization, UiCustomization.UiCustomizationType uiCustomizationType) {
        int i = valueOf + 41;
        ThreeDS2Service = i % 128;
        int i2 = i % 2;
        InterfaceC9515js values = super.values(uiCustomization, uiCustomizationType);
        if (i2 == 0) {
            int i3 = 93 / 0;
        }
        int i4 = ThreeDS2Service;
        valueOf = (((i4 & 115) - (~(i4 | 115))) - 1) % 128;
        return values;
    }

    private InterfaceC9511jo ThreeDS2Service(com.netcetera.threeds.sdk.api.p018ui.logic.LabelCustomization labelCustomization) {
        C9576lt c9576lt;
        int i;
        int i2 = valueOf;
        int i3 = i2 & 105;
        int i4 = (i2 | 105) & (~i3);
        int i5 = -(-(i3 << 1));
        int i6 = ((i4 & i5) + (i4 | i5)) % 128;
        ThreeDS2Service = i6;
        if (labelCustomization != null) {
            c9576lt = new C9576lt(labelCustomization);
            int i7 = ThreeDS2Service;
            int i8 = (i7 | 109) << 1;
            int i9 = -(i7 ^ 109);
            int i10 = ((i8 | i9) << 1) - (i9 ^ i8);
            valueOf = i10 % 128;
            i = i10 % 2 != 0 ? 61 : 66;
            return c9576lt;
        }
        int i11 = i6 & 117;
        int i12 = i11 + ((i6 ^ 117) | i11);
        valueOf = i12 % 128;
        c9576lt = null;
        if (i12 % 2 == 0) {
            return null;
        }
        int i13 = i / 0;
        return c9576lt;
    }

    public static /* synthetic */ InterfaceC9512jp get(C9535kj c9535kj, com.netcetera.threeds.sdk.api.p018ui.logic.ToolbarCustomization toolbarCustomization) {
        int i = ThreeDS2Service;
        int i2 = i & 109;
        int i3 = (i | 109) & (~i2);
        int i4 = i2 << 1;
        int i5 = (i3 ^ i4) + ((i3 & i4) << 1);
        valueOf = i5 % 128;
        if (i5 % 2 == 0) {
            return c9535kj.get(toolbarCustomization);
        }
        c9535kj.get(toolbarCustomization);
        throw null;
    }

    @Override // com.netcetera.threeds.sdk.infrastructure.AbstractC9537kk
    public InterfaceC9515js valueOf(final com.netcetera.threeds.sdk.api.p018ui.logic.UiCustomization uiCustomization) {
        InterfaceC9515js interfaceC9515js = new InterfaceC9515js() { // from class: com.netcetera.threeds.sdk.infrastructure.kj.1
            private static int get = 0;
            private static int valueOf = 1;

            @Override // com.netcetera.threeds.sdk.infrastructure.InterfaceC9515js
            public InterfaceC9511jo ThreeDS2Service() {
                int i = valueOf;
                int i2 = (i & (-118)) | ((~i) & 117);
                int i3 = (i & 117) << 1;
                get = (((i2 | i3) << 1) - (i3 ^ i2)) % 128;
                InterfaceC9511jo valueOf2 = C9535kj.valueOf(C9535kj.this, uiCustomization.getLabelCustomization());
                int i4 = get + 97;
                valueOf = i4 % 128;
                if (i4 % 2 != 0) {
                    return valueOf2;
                }
                throw null;
            }

            @Override // com.netcetera.threeds.sdk.infrastructure.InterfaceC9515js
            public InterfaceC9512jp ThreeDS2ServiceInstance() {
                int i = valueOf;
                int i2 = (i ^ 103) + ((i & 103) << 1);
                get = i2 % 128;
                int i3 = i2 % 2;
                C9535kj c9535kj = C9535kj.this;
                if (i3 != 0) {
                    C9535kj.get(c9535kj, uiCustomization.getToolbarCustomization());
                    throw null;
                }
                InterfaceC9512jp interfaceC9512jp = C9535kj.get(c9535kj, uiCustomization.getToolbarCustomization());
                int i4 = valueOf;
                get = (((i4 & 42) + (i4 | 42)) - 1) % 128;
                return interfaceC9512jp;
            }

            @Override // com.netcetera.threeds.sdk.infrastructure.InterfaceC9515js
            public InterfaceC9520jw get() {
                InterfaceC9520jw interfaceC9520jw;
                int i = get;
                int i2 = (i ^ 97) + ((i & 97) << 1);
                valueOf = i2 % 128;
                int i3 = i2 % 2;
                C9535kj c9535kj = C9535kj.this;
                if (i3 == 0) {
                    interfaceC9520jw = C9535kj.get(c9535kj, uiCustomization.getViewCustomization());
                    int i4 = 43 / 0;
                } else {
                    interfaceC9520jw = C9535kj.get(c9535kj, uiCustomization.getViewCustomization());
                }
                int i5 = get;
                int i6 = i5 & 29;
                valueOf = ((((i5 | 29) & (~i6)) - (~(i6 << 1))) - 1) % 128;
                return interfaceC9520jw;
            }

            @Override // com.netcetera.threeds.sdk.infrastructure.InterfaceC9515js
            public InterfaceC9513jq values() {
                InterfaceC9513jq ThreeDS2Service2;
                int i = valueOf;
                int i2 = (-2) - (~((i ^ 54) + ((i & 54) << 1)));
                get = i2 % 128;
                if (i2 % 2 != 0) {
                    ThreeDS2Service2 = C9535kj.ThreeDS2Service(C9535kj.this, uiCustomization.getTextBoxCustomization());
                    int i3 = 30 / 0;
                } else {
                    ThreeDS2Service2 = C9535kj.ThreeDS2Service(C9535kj.this, uiCustomization.getTextBoxCustomization());
                }
                int i4 = get;
                int i5 = (i4 & 9) + (i4 | 9);
                valueOf = i5 % 128;
                if (i5 % 2 != 0) {
                    return ThreeDS2Service2;
                }
                throw null;
            }

            @Override // com.netcetera.threeds.sdk.infrastructure.InterfaceC9515js
            public InterfaceC9507jk ThreeDS2ServiceInstance(UiCustomization.ButtonType buttonType) {
                int i = (-2) - (~(valueOf + WebSocketProtocol.PAYLOAD_SHORT));
                get = i % 128;
                if (i % 2 == 0) {
                    InterfaceC9507jk interfaceC9507jk = C9535kj.get(C9535kj.this, uiCustomization.getButtonCustomization(buttonType));
                    int i2 = valueOf;
                    int i3 = i2 & 23;
                    int i4 = -(-((i2 ^ 23) | i3));
                    get = ((i3 ^ i4) + ((i4 & i3) << 1)) % 128;
                    return interfaceC9507jk;
                }
                C9535kj.get(C9535kj.this, uiCustomization.getButtonCustomization(buttonType));
                throw null;
            }
        };
        int i = ThreeDS2Service;
        valueOf = ((i & 93) + (i | 93)) % 128;
        return interfaceC9515js;
    }

    public static /* synthetic */ InterfaceC9520jw get(C9535kj c9535kj, com.netcetera.threeds.sdk.api.p018ui.logic.ViewCustomization viewCustomization) {
        int i = valueOf + 75;
        ThreeDS2Service = i % 128;
        int i2 = i % 2;
        InterfaceC9520jw ThreeDS2Service2 = c9535kj.ThreeDS2Service(viewCustomization);
        if (i2 == 0) {
            int i3 = 94 / 0;
        }
        return ThreeDS2Service2;
    }

    private InterfaceC9513jq valueOf(com.netcetera.threeds.sdk.api.p018ui.logic.TextBoxCustomization textBoxCustomization) {
        int i = valueOf;
        int i2 = i ^ 79;
        int i3 = ((i & 79) | i2) << 1;
        int i4 = -i2;
        int i5 = (i3 ^ i4) + ((i4 & i3) << 1);
        ThreeDS2Service = i5 % 128;
        if (i5 % 2 != 0) {
            if (textBoxCustomization != null) {
                C9581ly c9581ly = new C9581ly(textBoxCustomization);
                int i6 = ThreeDS2Service;
                valueOf = (((((i6 ^ 41) | (i6 & 41)) << 1) - (~(-(((~i6) & 41) | (i6 & (-42)))))) - 1) % 128;
                return c9581ly;
            }
            int i7 = (((i | 62) << 1) - (i ^ 62)) - 1;
            ThreeDS2Service = i7 % 128;
            if (i7 % 2 != 0) {
                return null;
            }
            throw null;
        }
        throw null;
    }

    private InterfaceC9512jp get(com.netcetera.threeds.sdk.api.p018ui.logic.ToolbarCustomization toolbarCustomization) {
        int i = ThreeDS2Service;
        int i2 = (((i ^ 83) | (i & 83)) << 1) - ((i & (-84)) | ((~i) & 83));
        valueOf = i2 % 128;
        if (i2 % 2 == 0) {
            if (toolbarCustomization == null) {
                valueOf = ((i & 51) + (i | 51)) % 128;
                return null;
            }
            C9579lw c9579lw = new C9579lw(toolbarCustomization);
            int i3 = ThreeDS2Service;
            valueOf = ((i3 ^ 31) + ((i3 & 31) << 1)) % 128;
            return c9579lw;
        }
        throw null;
    }

    /* JADX WARN: Code restructure failed: missing block: B:10:0x0023, code lost:
        r4 = r0 & 125;
        r0 = (r0 | 125) & (~r4);
        r4 = r4 << 1;
        r1 = (r0 ^ r4) + ((r4 & r0) << 1);
        com.netcetera.threeds.sdk.infrastructure.C9535kj.valueOf = r1 % 128;
     */
    /* JADX WARN: Code restructure failed: missing block: B:11:0x0038, code lost:
        if ((r1 % 2) != 0) goto L9;
     */
    /* JADX WARN: Code restructure failed: missing block: B:12:0x003a, code lost:
        return null;
     */
    /* JADX WARN: Code restructure failed: missing block: B:13:0x003b, code lost:
        throw null;
     */
    /* JADX WARN: Code restructure failed: missing block: B:5:0x0010, code lost:
        if (r4 != null) goto L10;
     */
    /* JADX WARN: Code restructure failed: missing block: B:7:0x0013, code lost:
        if (r4 != null) goto L10;
     */
    /* JADX WARN: Code restructure failed: missing block: B:8:0x0015, code lost:
        r0 = new com.netcetera.threeds.sdk.infrastructure.C9584ma(r4);
        com.netcetera.threeds.sdk.infrastructure.C9535kj.ThreeDS2Service = (com.netcetera.threeds.sdk.infrastructure.C9535kj.valueOf + th.p047co.dtac.android.dtacone.view.activity.CameraActivity.REQUEST_CODE) % 128;
     */
    /* JADX WARN: Code restructure failed: missing block: B:9:0x0022, code lost:
        return r0;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    private com.netcetera.threeds.sdk.infrastructure.InterfaceC9520jw ThreeDS2Service(com.netcetera.threeds.sdk.api.p018ui.logic.ViewCustomization r4) {
        /*
            r3 = this;
            int r0 = com.netcetera.threeds.sdk.infrastructure.C9535kj.ThreeDS2Service
            int r1 = r0 + 65
            int r2 = r1 % 128
            com.netcetera.threeds.sdk.infrastructure.C9535kj.valueOf = r2
            int r1 = r1 % 2
            if (r1 == 0) goto L13
            r1 = 25
            int r1 = r1 / 0
            if (r4 == 0) goto L23
            goto L15
        L13:
            if (r4 == 0) goto L23
        L15:
            com.netcetera.threeds.sdk.infrastructure.ma r0 = new com.netcetera.threeds.sdk.infrastructure.ma
            r0.<init>(r4)
            int r4 = com.netcetera.threeds.sdk.infrastructure.C9535kj.valueOf
            int r4 = r4 + 123
            int r4 = r4 % 128
            com.netcetera.threeds.sdk.infrastructure.C9535kj.ThreeDS2Service = r4
            return r0
        L23:
            r4 = r0 & 125(0x7d, float:1.75E-43)
            int r1 = ~r4
            r0 = r0 | 125(0x7d, float:1.75E-43)
            r0 = r0 & r1
            int r4 = r4 << 1
            r1 = r0 ^ r4
            r4 = r4 & r0
            int r4 = r4 << 1
            int r1 = r1 + r4
            int r4 = r1 % 128
            com.netcetera.threeds.sdk.infrastructure.C9535kj.valueOf = r4
            int r1 = r1 % 2
            r4 = 0
            if (r1 != 0) goto L3b
            return r4
        L3b:
            throw r4
        */
        throw new UnsupportedOperationException("Method not decompiled: com.netcetera.threeds.sdk.infrastructure.C9535kj.ThreeDS2Service(com.netcetera.threeds.sdk.api.ui.logic.ViewCustomization):com.netcetera.threeds.sdk.infrastructure.jw");
    }

    /* JADX WARN: Code restructure failed: missing block: B:10:0x0038, code lost:
        return r0;
     */
    /* JADX WARN: Code restructure failed: missing block: B:11:0x0039, code lost:
        throw null;
     */
    /* JADX WARN: Code restructure failed: missing block: B:12:0x003a, code lost:
        r5 = r0 & 107;
        r5 = r5 + ((r0 ^ 107) | r5);
        com.netcetera.threeds.sdk.infrastructure.C9535kj.valueOf = r5 % 128;
     */
    /* JADX WARN: Code restructure failed: missing block: B:13:0x0046, code lost:
        if ((r5 % 2) != 0) goto L9;
     */
    /* JADX WARN: Code restructure failed: missing block: B:14:0x0048, code lost:
        return null;
     */
    /* JADX WARN: Code restructure failed: missing block: B:15:0x0049, code lost:
        throw null;
     */
    /* JADX WARN: Code restructure failed: missing block: B:5:0x001b, code lost:
        if (r5 != null) goto L10;
     */
    /* JADX WARN: Code restructure failed: missing block: B:7:0x001e, code lost:
        if (r5 != null) goto L10;
     */
    /* JADX WARN: Code restructure failed: missing block: B:8:0x0020, code lost:
        r0 = new com.netcetera.threeds.sdk.infrastructure.C9578lv(r5);
        r5 = com.netcetera.threeds.sdk.infrastructure.C9535kj.valueOf;
        r2 = (((r5 | 20) << 1) - (r5 ^ 20)) - 1;
        com.netcetera.threeds.sdk.infrastructure.C9535kj.ThreeDS2Service = r2 % 128;
     */
    /* JADX WARN: Code restructure failed: missing block: B:9:0x0036, code lost:
        if ((r2 % 2) == 0) goto L13;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    private com.netcetera.threeds.sdk.infrastructure.InterfaceC9507jk get(com.netcetera.threeds.sdk.api.p018ui.logic.ButtonCustomization r5) {
        /*
            r4 = this;
            int r0 = com.netcetera.threeds.sdk.infrastructure.C9535kj.ThreeDS2Service
            r1 = r0 & 25
            int r2 = ~r1
            r3 = r0 | 25
            r2 = r2 & r3
            int r1 = r1 << 1
            r3 = r2 & r1
            r1 = r1 | r2
            int r3 = r3 + r1
            int r1 = r3 % 128
            com.netcetera.threeds.sdk.infrastructure.C9535kj.valueOf = r1
            int r3 = r3 % 2
            r1 = 0
            if (r3 == 0) goto L1e
            r2 = 49
            int r2 = r2 / 0
            if (r5 == 0) goto L3a
            goto L20
        L1e:
            if (r5 == 0) goto L3a
        L20:
            com.netcetera.threeds.sdk.infrastructure.lv r0 = new com.netcetera.threeds.sdk.infrastructure.lv
            r0.<init>(r5)
            int r5 = com.netcetera.threeds.sdk.infrastructure.C9535kj.valueOf
            r2 = r5 | 20
            int r2 = r2 << 1
            r5 = r5 ^ 20
            int r2 = r2 - r5
            int r2 = r2 + (-1)
            int r5 = r2 % 128
            com.netcetera.threeds.sdk.infrastructure.C9535kj.ThreeDS2Service = r5
            int r2 = r2 % 2
            if (r2 == 0) goto L39
            return r0
        L39:
            throw r1
        L3a:
            r5 = r0 & 107(0x6b, float:1.5E-43)
            r0 = r0 ^ 107(0x6b, float:1.5E-43)
            r0 = r0 | r5
            int r5 = r5 + r0
            int r0 = r5 % 128
            com.netcetera.threeds.sdk.infrastructure.C9535kj.valueOf = r0
            int r5 = r5 % 2
            if (r5 != 0) goto L49
            return r1
        L49:
            throw r1
        */
        throw new UnsupportedOperationException("Method not decompiled: com.netcetera.threeds.sdk.infrastructure.C9535kj.get(com.netcetera.threeds.sdk.api.ui.logic.ButtonCustomization):com.netcetera.threeds.sdk.infrastructure.jk");
    }
}

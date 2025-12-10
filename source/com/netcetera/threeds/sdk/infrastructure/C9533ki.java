package com.netcetera.threeds.sdk.infrastructure;

import com.netcetera.threeds.sdk.api.p018ui.logic.ButtonCustomization;
import com.netcetera.threeds.sdk.api.p018ui.logic.UiCustomization;

/* renamed from: com.netcetera.threeds.sdk.infrastructure.ki */
/* loaded from: classes5.dex */
public class C9533ki extends AbstractC9537kk {
    private static int valueOf = 1;
    private static int values;

    public static /* synthetic */ InterfaceC9511jo ThreeDS2Service(C9533ki c9533ki, com.netcetera.threeds.sdk.api.p018ui.logic.LabelCustomization labelCustomization) {
        int i = valueOf;
        int i2 = (i ^ 35) + ((i & 35) << 1);
        values = i2 % 128;
        if (i2 % 2 != 0) {
            c9533ki.valueOf(labelCustomization);
            throw null;
        }
        InterfaceC9511jo valueOf2 = c9533ki.valueOf(labelCustomization);
        valueOf = (values + 91) % 128;
        return valueOf2;
    }

    public static /* synthetic */ InterfaceC9507jk get(C9533ki c9533ki, ButtonCustomization buttonCustomization) {
        int i = values;
        valueOf = ((i ^ 79) + ((i & 79) << 1)) % 128;
        InterfaceC9507jk valueOf2 = c9533ki.valueOf(buttonCustomization);
        int i2 = valueOf;
        int i3 = i2 ^ 93;
        int i4 = ((((i2 & 93) | i3) << 1) - (~(-i3))) - 1;
        values = i4 % 128;
        if (i4 % 2 == 0) {
            return valueOf2;
        }
        throw null;
    }

    public static /* synthetic */ InterfaceC9513jq valueOf(C9533ki c9533ki, com.netcetera.threeds.sdk.api.p018ui.logic.TextBoxCustomization textBoxCustomization) {
        int i = values;
        int i2 = (i & 119) + (i | 119);
        valueOf = i2 % 128;
        if (i2 % 2 != 0) {
            return c9533ki.values(textBoxCustomization);
        }
        c9533ki.values(textBoxCustomization);
        throw null;
    }

    public static /* synthetic */ InterfaceC9512jp values(C9533ki c9533ki, com.netcetera.threeds.sdk.api.p018ui.logic.ToolbarCustomization toolbarCustomization) {
        int i = valueOf;
        int i2 = i & 93;
        int i3 = (i ^ 93) | i2;
        values = (((i2 | i3) << 1) - (i3 ^ i2)) % 128;
        InterfaceC9512jp valueOf2 = c9533ki.valueOf(toolbarCustomization);
        int i4 = valueOf;
        int i5 = (((i4 ^ 43) | (i4 & 43)) << 1) - (((~i4) & 43) | (i4 & (-44)));
        values = i5 % 128;
        if (i5 % 2 == 0) {
            return valueOf2;
        }
        throw null;
    }

    public static /* synthetic */ InterfaceC9520jw ThreeDS2Service(C9533ki c9533ki, com.netcetera.threeds.sdk.api.p018ui.logic.ViewCustomization viewCustomization) {
        int i = values;
        int i2 = (((i | 102) << 1) - (i ^ 102)) - 1;
        valueOf = i2 % 128;
        int i3 = i2 % 2;
        InterfaceC9520jw values2 = c9533ki.values(viewCustomization);
        if (i3 == 0) {
            int i4 = 31 / 0;
        }
        int i5 = values;
        int i6 = ((i5 ^ 43) | (i5 & 43)) << 1;
        int i7 = -(((~i5) & 43) | (i5 & (-44)));
        int i8 = (i6 & i7) + (i7 | i6);
        valueOf = i8 % 128;
        if (i8 % 2 != 0) {
            return values2;
        }
        throw null;
    }

    @Override // com.netcetera.threeds.sdk.infrastructure.AbstractC9537kk
    public InterfaceC9515js valueOf(final com.netcetera.threeds.sdk.api.p018ui.logic.UiCustomization uiCustomization) {
        InterfaceC9515js interfaceC9515js = new InterfaceC9515js() { // from class: com.netcetera.threeds.sdk.infrastructure.ki.1
            private static int get = 1;
            private static int valueOf;

            @Override // com.netcetera.threeds.sdk.infrastructure.InterfaceC9515js
            public InterfaceC9511jo ThreeDS2Service() {
                int i = valueOf;
                int i2 = (i & 103) + (i | 103);
                get = i2 % 128;
                int i3 = i2 % 2;
                C9533ki c9533ki = C9533ki.this;
                if (i3 != 0) {
                    InterfaceC9511jo ThreeDS2Service = C9533ki.ThreeDS2Service(c9533ki, uiCustomization.getLabelCustomization());
                    int i4 = get;
                    valueOf = ((-2) - (~(((i4 | 12) << 1) - (i4 ^ 12)))) % 128;
                    return ThreeDS2Service;
                }
                C9533ki.ThreeDS2Service(c9533ki, uiCustomization.getLabelCustomization());
                throw null;
            }

            @Override // com.netcetera.threeds.sdk.infrastructure.InterfaceC9515js
            public InterfaceC9512jp ThreeDS2ServiceInstance() {
                int i = get;
                int i2 = ((i ^ 63) | (i & 63)) << 1;
                int i3 = -(((~i) & 63) | (i & (-64)));
                int i4 = (i2 ^ i3) + ((i3 & i2) << 1);
                valueOf = i4 % 128;
                int i5 = i4 % 2;
                C9533ki c9533ki = C9533ki.this;
                com.netcetera.threeds.sdk.api.p018ui.logic.ToolbarCustomization toolbarCustomization = uiCustomization.getToolbarCustomization();
                if (i5 == 0) {
                    return C9533ki.values(c9533ki, toolbarCustomization);
                }
                C9533ki.values(c9533ki, toolbarCustomization);
                throw null;
            }

            @Override // com.netcetera.threeds.sdk.infrastructure.InterfaceC9515js
            public InterfaceC9520jw get() {
                int i = valueOf;
                int i2 = i & 25;
                int i3 = (((i ^ 25) | i2) << 1) - ((i | 25) & (~i2));
                get = i3 % 128;
                if (i3 % 2 != 0) {
                    InterfaceC9520jw ThreeDS2Service = C9533ki.ThreeDS2Service(C9533ki.this, uiCustomization.getViewCustomization());
                    int i4 = valueOf;
                    int i5 = ((i4 & (-54)) | ((~i4) & 53)) + ((i4 & 53) << 1);
                    get = i5 % 128;
                    if (i5 % 2 != 0) {
                        return ThreeDS2Service;
                    }
                    throw null;
                }
                C9533ki.ThreeDS2Service(C9533ki.this, uiCustomization.getViewCustomization());
                throw null;
            }

            @Override // com.netcetera.threeds.sdk.infrastructure.InterfaceC9515js
            public InterfaceC9513jq values() {
                int i = get;
                valueOf = (((i ^ 42) + ((i & 42) << 1)) - 1) % 128;
                InterfaceC9513jq valueOf2 = C9533ki.valueOf(C9533ki.this, uiCustomization.getTextBoxCustomization());
                int i2 = valueOf;
                int i3 = ((((i2 ^ 47) | (i2 & 47)) << 1) - (~(-(((~i2) & 47) | (i2 & (-48)))))) - 1;
                get = i3 % 128;
                if (i3 % 2 == 0) {
                    int i4 = 68 / 0;
                }
                return valueOf2;
            }

            @Override // com.netcetera.threeds.sdk.infrastructure.InterfaceC9515js
            public InterfaceC9507jk ThreeDS2ServiceInstance(UiCustomization.ButtonType buttonType) {
                int i = valueOf;
                get = (((i & 54) + (i | 54)) - 1) % 128;
                InterfaceC9507jk interfaceC9507jk = C9533ki.get(C9533ki.this, uiCustomization.getButtonCustomization(buttonType));
                int i2 = get;
                int i3 = i2 & 31;
                int i4 = (i2 | 31) & (~i3);
                int i5 = i3 << 1;
                valueOf = ((i4 & i5) + (i4 | i5)) % 128;
                return interfaceC9507jk;
            }
        };
        int i = valueOf;
        values = ((i ^ 95) + ((i & 95) << 1)) % 128;
        return interfaceC9515js;
    }

    @Override // com.netcetera.threeds.sdk.infrastructure.AbstractC9537kk
    public /* synthetic */ InterfaceC9515js values(com.netcetera.threeds.sdk.api.p018ui.logic.UiCustomization uiCustomization, UiCustomization.UiCustomizationType uiCustomizationType) {
        int i = valueOf + 99;
        values = i % 128;
        if (i % 2 != 0) {
            super.values(uiCustomization, uiCustomizationType);
            throw null;
        }
        InterfaceC9515js values2 = super.values(uiCustomization, uiCustomizationType);
        valueOf = (values + 83) % 128;
        return values2;
    }

    private InterfaceC9512jp valueOf(com.netcetera.threeds.sdk.api.p018ui.logic.ToolbarCustomization toolbarCustomization) {
        int i = values;
        int i2 = i & 55;
        int i3 = -(-((i ^ 55) | i2));
        int i4 = ((i2 ^ i3) + ((i3 & i2) << 1)) % 128;
        valueOf = i4;
        if (toolbarCustomization != null) {
            C9577lu c9577lu = new C9577lu(toolbarCustomization);
            values = (valueOf + 47) % 128;
            return c9577lu;
        }
        int i5 = i4 & 71;
        int i6 = i4 | 71;
        values = ((i5 & i6) + (i5 | i6)) % 128;
        return null;
    }

    private InterfaceC9513jq values(com.netcetera.threeds.sdk.api.p018ui.logic.TextBoxCustomization textBoxCustomization) {
        int i = valueOf;
        int i2 = i + 91;
        values = i2 % 128;
        if (i2 % 2 == 0) {
            if (textBoxCustomization != null) {
                C9575ls c9575ls = new C9575ls(textBoxCustomization);
                int i3 = valueOf;
                int i4 = i3 & 91;
                int i5 = i4 + ((i3 ^ 91) | i4);
                values = i5 % 128;
                if (i5 % 2 != 0) {
                    int i6 = 38 / 0;
                }
                return c9575ls;
            }
            int i7 = (((i ^ 111) | (i & 111)) << 1) - (((~i) & 111) | (i & (-112)));
            values = i7 % 128;
            if (i7 % 2 == 0) {
                return null;
            }
            throw null;
        }
        throw null;
    }

    private InterfaceC9511jo valueOf(com.netcetera.threeds.sdk.api.p018ui.logic.LabelCustomization labelCustomization) {
        int i = valueOf;
        values = (i + 103) % 128;
        if (labelCustomization == null) {
            values = (((i | 95) << 1) - (i ^ 95)) % 128;
            return null;
        }
        C9568lm c9568lm = new C9568lm(labelCustomization);
        int i2 = valueOf;
        int i3 = ((i2 ^ 63) | (i2 & 63)) << 1;
        int i4 = -(((~i2) & 63) | (i2 & (-64)));
        values = ((i3 ^ i4) + ((i4 & i3) << 1)) % 128;
        return c9568lm;
    }

    private InterfaceC9520jw values(com.netcetera.threeds.sdk.api.p018ui.logic.ViewCustomization viewCustomization) {
        int i = values;
        int i2 = ((i | 22) << 1) - (i ^ 22);
        valueOf = ((~i2) + (i2 << 1)) % 128;
        if (viewCustomization != null) {
            C9574lr c9574lr = new C9574lr(viewCustomization);
            int i3 = valueOf;
            values = ((((i3 | 5) << 1) - (~(-(((~i3) & 5) | (i3 & (-6)))))) - 1) % 128;
            return c9574lr;
        }
        int i4 = i + 125;
        valueOf = i4 % 128;
        if (i4 % 2 == 0) {
            int i5 = 57 / 0;
        }
        return null;
    }

    private InterfaceC9507jk valueOf(ButtonCustomization buttonCustomization) {
        int i = values;
        int i2 = i + 29;
        valueOf = i2 % 128;
        if (i2 % 2 != 0) {
            if (buttonCustomization != null) {
                C9569ln c9569ln = new C9569ln(buttonCustomization);
                int i3 = valueOf;
                int i4 = i3 ^ 65;
                int i5 = (i3 & 65) << 1;
                values = ((i4 & i5) + (i5 | i4)) % 128;
                return c9569ln;
            }
            int i6 = i & 59;
            int i7 = (i | 59) & (~i6);
            int i8 = i6 << 1;
            int i9 = ((i7 | i8) << 1) - (i8 ^ i7);
            valueOf = i9 % 128;
            if (i9 % 2 != 0) {
                return null;
            }
            throw null;
        }
        throw null;
    }
}

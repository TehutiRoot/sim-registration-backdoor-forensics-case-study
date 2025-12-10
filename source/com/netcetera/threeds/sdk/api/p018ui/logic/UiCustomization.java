package com.netcetera.threeds.sdk.api.p018ui.logic;

import com.netcetera.threeds.sdk.api.exceptions.InvalidInputException;
import com.netcetera.threeds.sdk.infrastructure.C9621nj;
import com.netcetera.threeds.sdk.infrastructure.C9653nt;
import com.netcetera.threeds.sdk.infrastructure.C9669om;
import com.netcetera.threeds.sdk.infrastructure.InterfaceC9652ns;
import java.io.Serializable;
import java.util.HashMap;
import java.util.Map;

/* renamed from: com.netcetera.threeds.sdk.api.ui.logic.UiCustomization */
/* loaded from: classes5.dex */
public final class UiCustomization implements Serializable {
    private static int getSDKInfo = 1;
    private static int getSDKVersion;
    private LabelCustomization ThreeDS2Service;
    private ViewCustomization cleanup;
    private ToolbarCustomization valueOf;
    private TextBoxCustomization values;
    private final InterfaceC9652ns ThreeDS2ServiceInstance = C9653nt.ThreeDS2ServiceInstance(UiCustomization.class);
    private final Map<String, ButtonCustomization> get = new HashMap();

    /* renamed from: com.netcetera.threeds.sdk.api.ui.logic.UiCustomization$ButtonType */
    /* loaded from: classes5.dex */
    public enum ButtonType {
        SUBMIT,
        CONTINUE,
        NEXT,
        CANCEL,
        RESEND,
        OPEN_OOB_APP,
        ADD_CH;
        
        private static int values = 1;
        private static int valueOf = (values + 61) % 128;

        public static ButtonType valueOf(String str) {
            values = (valueOf + 33) % 128;
            ButtonType buttonType = (ButtonType) Enum.valueOf(ButtonType.class, str);
            int i = values + 41;
            valueOf = i % 128;
            if (i % 2 != 0) {
                int i2 = 43 / 0;
            }
            return buttonType;
        }

        /* renamed from: values  reason: to resolve conflict with enum method */
        public static ButtonType[] valuesCustom() {
            int i = valueOf + 111;
            values = i % 128;
            if (i % 2 != 0) {
                return (ButtonType[]) values().clone();
            }
            values().clone();
            throw null;
        }
    }

    /* renamed from: com.netcetera.threeds.sdk.api.ui.logic.UiCustomization$UiCustomizationType */
    /* loaded from: classes5.dex */
    public enum UiCustomizationType {
        DEFAULT,
        DARK,
        MONOCHROME;
        
        private static int values;
        private static int ThreeDS2Service = (values + 119) % 128;

        public static UiCustomizationType valueOf(String str) {
            int i = ThreeDS2Service + 31;
            values = i % 128;
            int i2 = i % 2;
            UiCustomizationType uiCustomizationType = (UiCustomizationType) Enum.valueOf(UiCustomizationType.class, str);
            if (i2 != 0) {
                int i3 = 1 / 0;
            }
            int i4 = ThreeDS2Service + 113;
            values = i4 % 128;
            if (i4 % 2 == 0) {
                return uiCustomizationType;
            }
            throw null;
        }

        /* renamed from: values  reason: to resolve conflict with enum method */
        public static UiCustomizationType[] valuesCustom() {
            int i = ThreeDS2Service + 111;
            values = i % 128;
            if (i % 2 == 0) {
                UiCustomizationType[] uiCustomizationTypeArr = (UiCustomizationType[]) values().clone();
                int i2 = ThreeDS2Service + 47;
                values = i2 % 128;
                if (i2 % 2 == 0) {
                    return uiCustomizationTypeArr;
                }
                throw null;
            }
            values().clone();
            throw null;
        }
    }

    public ButtonCustomization getButtonCustomization(ButtonType buttonType) {
        int i = getSDKInfo;
        getSDKVersion = (i + 95) % 128;
        if (buttonType == null) {
            getSDKVersion = (i + 39) % 128;
            return null;
        }
        ButtonCustomization buttonCustomization = getButtonCustomization(buttonType.name());
        getSDKVersion = (getSDKInfo + 73) % 128;
        return buttonCustomization;
    }

    @Deprecated
    public boolean getDarkModeSupported() {
        getSDKVersion = (getSDKInfo + 7) % 128;
        this.ThreeDS2ServiceInstance.valueOf("Removed option to opt in to dark mode support for the Netcetera Android 3DS SDK.As a result, this method should no longer be used and will be removed in the next iteration of the SDK");
        getSDKInfo = (getSDKVersion + 33) % 128;
        return true;
    }

    public LabelCustomization getLabelCustomization() {
        int i = getSDKInfo;
        LabelCustomization labelCustomization = this.ThreeDS2Service;
        getSDKVersion = (i + 11) % 128;
        return labelCustomization;
    }

    public TextBoxCustomization getTextBoxCustomization() throws InvalidInputException {
        int i = getSDKInfo;
        int i2 = i + 27;
        getSDKVersion = i2 % 128;
        if (i2 % 2 == 0) {
            TextBoxCustomization textBoxCustomization = this.values;
            getSDKVersion = (i + 21) % 128;
            return textBoxCustomization;
        }
        throw null;
    }

    public ToolbarCustomization getToolbarCustomization() {
        int i = getSDKInfo + 55;
        int i2 = i % 128;
        getSDKVersion = i2;
        if (i % 2 == 0) {
            ToolbarCustomization toolbarCustomization = this.valueOf;
            int i3 = i2 + 51;
            getSDKInfo = i3 % 128;
            if (i3 % 2 != 0) {
                return toolbarCustomization;
            }
            throw null;
        }
        throw null;
    }

    public ViewCustomization getViewCustomization() {
        int i = getSDKVersion + 69;
        int i2 = i % 128;
        getSDKInfo = i2;
        if (i % 2 != 0) {
            ViewCustomization viewCustomization = this.cleanup;
            getSDKVersion = (i2 + 5) % 128;
            return viewCustomization;
        }
        throw null;
    }

    public void setButtonCustomization(ButtonCustomization buttonCustomization, ButtonType buttonType) throws InvalidInputException {
        int i = getSDKInfo + 83;
        getSDKVersion = i % 128;
        if (i % 2 != 0) {
            C9621nj.ThreeDS2Service(buttonCustomization, "buttonCustomization ");
            C9621nj.ThreeDS2Service(buttonType, "buttonType");
            setButtonCustomization(buttonCustomization, buttonType.name());
            int i2 = 56 / 0;
        } else {
            C9621nj.ThreeDS2Service(buttonCustomization, "buttonCustomization ");
            C9621nj.ThreeDS2Service(buttonType, "buttonType");
            setButtonCustomization(buttonCustomization, buttonType.name());
        }
        getSDKVersion = (getSDKInfo + 9) % 128;
    }

    public void setLabelCustomization(LabelCustomization labelCustomization) throws InvalidInputException {
        int i = getSDKInfo + 51;
        getSDKVersion = i % 128;
        if (i % 2 != 0) {
            C9621nj.ThreeDS2Service(labelCustomization, "labelCustomization");
            this.ThreeDS2Service = labelCustomization;
            int i2 = 58 / 0;
            return;
        }
        C9621nj.ThreeDS2Service(labelCustomization, "labelCustomization");
        this.ThreeDS2Service = labelCustomization;
    }

    public void setTextBoxCustomization(TextBoxCustomization textBoxCustomization) throws InvalidInputException {
        getSDKInfo = (getSDKVersion + 85) % 128;
        C9621nj.ThreeDS2Service(textBoxCustomization, "textBoxCustomization ");
        this.values = textBoxCustomization;
        int i = getSDKInfo + 45;
        getSDKVersion = i % 128;
        if (i % 2 != 0) {
            int i2 = 74 / 0;
        }
    }

    public void setToolbarCustomization(ToolbarCustomization toolbarCustomization) throws InvalidInputException {
        int i = getSDKInfo + 47;
        getSDKVersion = i % 128;
        if (i % 2 == 0) {
            C9621nj.ThreeDS2Service(toolbarCustomization, "toolbarCustomization");
            this.valueOf = toolbarCustomization;
            return;
        }
        C9621nj.ThreeDS2Service(toolbarCustomization, "toolbarCustomization");
        this.valueOf = toolbarCustomization;
        throw null;
    }

    public void setViewCustomization(ViewCustomization viewCustomization) throws InvalidInputException {
        getSDKInfo = (getSDKVersion + 65) % 128;
        C9621nj.ThreeDS2Service(viewCustomization, "viewCustomization");
        this.cleanup = viewCustomization;
        int i = getSDKInfo + 35;
        getSDKVersion = i % 128;
        if (i % 2 == 0) {
            return;
        }
        throw null;
    }

    @Deprecated
    public void supportDarkMode(boolean z) {
        int i = getSDKInfo + 99;
        getSDKVersion = i % 128;
        if (i % 2 == 0) {
            this.ThreeDS2ServiceInstance.valueOf("Removed option to opt in to dark mode support for the Netcetera Android 3DS SDK.As a result, this method should no longer be used and will be removed in the next iteration of the SDK");
        } else {
            this.ThreeDS2ServiceInstance.valueOf("Removed option to opt in to dark mode support for the Netcetera Android 3DS SDK.As a result, this method should no longer be used and will be removed in the next iteration of the SDK");
            throw null;
        }
    }

    public ButtonCustomization getButtonCustomization(String str) {
        getSDKInfo = (getSDKVersion + 13) % 128;
        ButtonCustomization buttonCustomization = this.get.get(C9669om.values(str));
        getSDKInfo = (getSDKVersion + 125) % 128;
        return buttonCustomization;
    }

    public void setButtonCustomization(ButtonCustomization buttonCustomization, String str) throws InvalidInputException {
        getSDKVersion = (getSDKInfo + 103) % 128;
        C9621nj.ThreeDS2Service(buttonCustomization, "buttonCustomization");
        C9621nj.ThreeDS2ServiceInstance(str, "customButtonType");
        this.get.put(C9669om.values(str), buttonCustomization);
        getSDKVersion = (getSDKInfo + 9) % 128;
    }
}

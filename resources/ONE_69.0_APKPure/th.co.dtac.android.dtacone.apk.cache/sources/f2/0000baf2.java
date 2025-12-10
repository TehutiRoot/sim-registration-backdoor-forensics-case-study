package com.netcetera.threeds.sdk.infrastructure;

import com.netcetera.threeds.sdk.infrastructure.setDarkTextColor;

/* JADX INFO: Access modifiers changed from: package-private */
/* loaded from: classes5.dex */
public class UiCustomization implements setDarkTextColor.valueOf {
    private final setDarkTextColor ThreeDS2ServiceInstance;

    /* JADX INFO: Access modifiers changed from: package-private */
    /* loaded from: classes5.dex */
    public class ButtonType implements setDarkTextColor.valueOf {
        private final setDarkTextColor ThreeDS2ServiceInstance;

        public ButtonType(setDarkTextColor setdarktextcolor) {
            this.ThreeDS2ServiceInstance = setdarktextcolor;
        }

        @Override // com.netcetera.threeds.sdk.infrastructure.setDarkTextColor.valueOf
        public getHeadingTextColor values() {
            return setDarkTextColor.getSchemeLogoDark(this.ThreeDS2ServiceInstance);
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* loaded from: classes5.dex */
    public class UiCustomizationType implements setDarkTextColor.valueOf {
        private final setDarkTextColor.ThreeDS2Service get;
        private final setDarkTextColor valueOf;

        public UiCustomizationType(setDarkTextColor setdarktextcolor, setDarkTextColor.ThreeDS2Service threeDS2Service) {
            this.valueOf = setdarktextcolor;
            this.get = threeDS2Service;
        }

        @Override // com.netcetera.threeds.sdk.infrastructure.setDarkTextColor.valueOf
        public getHeadingTextColor values() {
            return setDarkTextColor.cleanup(this.valueOf, this.get);
        }
    }

    public UiCustomization(setDarkTextColor setdarktextcolor) {
        this.ThreeDS2ServiceInstance = setdarktextcolor;
    }

    @Override // com.netcetera.threeds.sdk.infrastructure.setDarkTextColor.valueOf
    public getHeadingTextColor values() {
        return setDarkTextColor.getRootCertificates(this.ThreeDS2ServiceInstance);
    }
}
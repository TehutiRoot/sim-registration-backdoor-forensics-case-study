package com.netcetera.threeds.sdk.infrastructure;

import com.netcetera.threeds.sdk.infrastructure.setDarkTextColor;
import com.netcetera.threeds.sdk.infrastructure.setFastScrollEnabled;

/* JADX INFO: Access modifiers changed from: package-private */
/* loaded from: classes5.dex */
public class setVerticalScrollbarTrackDrawable implements setDarkTextColor.valueOf {
    private final setDarkTextColor ThreeDS2Service;
    private final setFastScrollEnabled.valueOf valueOf;

    public setVerticalScrollbarTrackDrawable(setDarkTextColor setdarktextcolor, setFastScrollEnabled.valueOf valueof) {
        this.ThreeDS2Service = setdarktextcolor;
        this.valueOf = valueof;
    }

    @Override // com.netcetera.threeds.sdk.infrastructure.setDarkTextColor.valueOf
    public getHeadingTextColor values() {
        return setDarkTextColor.ThreeDS2Service(this.ThreeDS2Service, this.valueOf);
    }
}

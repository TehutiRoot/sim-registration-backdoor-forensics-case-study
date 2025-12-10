package com.netcetera.threeds.sdk.infrastructure;

/* renamed from: com.netcetera.threeds.sdk.infrastructure.ma */
/* loaded from: classes5.dex */
public class C9573ma implements InterfaceC9509jw {
    private static int valueOf = 1;
    private static int values;
    private final com.netcetera.threeds.sdk.api.p018ui.logic.ViewCustomization get;

    public C9573ma(com.netcetera.threeds.sdk.api.p018ui.logic.ViewCustomization viewCustomization) {
        this.get = viewCustomization;
    }

    @Override // com.netcetera.threeds.sdk.infrastructure.InterfaceC9509jw
    public String ThreeDS2ServiceInstance() {
        int i = values;
        int i2 = i & 81;
        int i3 = -(-((i ^ 81) | i2));
        int i4 = ((i2 | i3) << 1) - (i3 ^ i2);
        valueOf = i4 % 128;
        int i5 = i4 % 2;
        String challengeViewBackgroundColor = this.get.getChallengeViewBackgroundColor();
        if (i5 == 0) {
            int i6 = 61 / 0;
        }
        return challengeViewBackgroundColor;
    }

    @Override // com.netcetera.threeds.sdk.infrastructure.InterfaceC9509jw
    public String values() {
        int i = values + 79;
        valueOf = i % 128;
        if (i % 2 != 0) {
            return this.get.getProgressViewBackgroundColor();
        }
        this.get.getProgressViewBackgroundColor();
        throw null;
    }
}
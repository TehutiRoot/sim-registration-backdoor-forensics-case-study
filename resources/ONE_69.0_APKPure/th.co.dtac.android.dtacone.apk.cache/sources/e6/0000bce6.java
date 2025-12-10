package com.netcetera.threeds.sdk.infrastructure;

/* renamed from: com.netcetera.threeds.sdk.infrastructure.lr */
/* loaded from: classes5.dex */
public class C9563lr implements InterfaceC9509jw {
    private static int ThreeDS2Service = 0;
    private static int get = 1;
    private final com.netcetera.threeds.sdk.api.p018ui.logic.ViewCustomization valueOf;

    public C9563lr(com.netcetera.threeds.sdk.api.p018ui.logic.ViewCustomization viewCustomization) {
        this.valueOf = viewCustomization;
    }

    @Override // com.netcetera.threeds.sdk.infrastructure.InterfaceC9509jw
    public String ThreeDS2ServiceInstance() {
        int i = ThreeDS2Service;
        int i2 = (i ^ 101) + ((i & 101) << 1);
        get = i2 % 128;
        int i3 = i2 % 2;
        com.netcetera.threeds.sdk.api.p018ui.logic.ViewCustomization viewCustomization = this.valueOf;
        if (i3 != 0) {
            return viewCustomization.getChallengeViewBackgroundColor();
        }
        viewCustomization.getChallengeViewBackgroundColor();
        throw null;
    }

    @Override // com.netcetera.threeds.sdk.infrastructure.InterfaceC9509jw
    public String values() {
        int i = get;
        int i2 = (i ^ 54) + ((i & 54) << 1);
        int i3 = (~i2) + (i2 << 1);
        ThreeDS2Service = i3 % 128;
        if (i3 % 2 == 0) {
            return this.valueOf.getProgressViewBackgroundColor();
        }
        this.valueOf.getProgressViewBackgroundColor();
        throw null;
    }
}
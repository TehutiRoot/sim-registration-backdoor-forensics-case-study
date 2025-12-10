package com.netcetera.threeds.sdk.infrastructure;

import com.netcetera.threeds.sdk.infrastructure.setFastScrollEnabled;

/* loaded from: classes5.dex */
public class setShowSoftInputOnFocus {
    private static int cleanup = 1;
    private static int getSDKVersion;
    private final String ThreeDS2Service;
    private final com.netcetera.threeds.sdk.api.transaction.challenge.ChallengeStatusReceiver ThreeDS2ServiceInstance;
    private final setFastScrollEnabled.valueOf getWarnings;
    private final setOnCapturedPointerListener valueOf;
    private final InterfaceC9652ns get = C9653nt.ThreeDS2ServiceInstance(setShowSoftInputOnFocus.class);
    private final String values = "";

    public setShowSoftInputOnFocus(setOnCapturedPointerListener setoncapturedpointerlistener, com.netcetera.threeds.sdk.api.transaction.challenge.ChallengeStatusReceiver challengeStatusReceiver, String str, setFastScrollEnabled.valueOf valueof) {
        this.valueOf = setoncapturedpointerlistener;
        this.ThreeDS2ServiceInstance = challengeStatusReceiver;
        this.ThreeDS2Service = str;
        this.getWarnings = valueof;
    }

    public static setShowSoftInputOnFocus ThreeDS2Service(com.netcetera.threeds.sdk.api.transaction.challenge.ChallengeStatusReceiver challengeStatusReceiver, String str, setFastScrollEnabled.valueOf valueof) {
        setShowSoftInputOnFocus setshowsoftinputonfocus = new setShowSoftInputOnFocus(new setOnCapturedPointerListener(new setScrollCaptureHint()), challengeStatusReceiver, str, valueof);
        int i = cleanup + 55;
        getSDKVersion = i % 128;
        if (i % 2 != 0) {
            int i2 = 94 / 0;
        }
        return setshowsoftinputonfocus;
    }

    private String get(String str) {
        int i = getSDKVersion;
        int i2 = i & 75;
        int i3 = i | 75;
        cleanup = ((i2 & i3) + (i3 | i2)) % 128;
        String str2 = (String) C9669om.ThreeDS2Service(str, "");
        int i4 = cleanup;
        int i5 = (i4 ^ 89) + ((i4 & 89) << 1);
        getSDKVersion = i5 % 128;
        if (i5 % 2 != 0) {
            int i6 = 51 / 0;
        }
        return str2;
    }

    public void ThreeDS2ServiceInstance(com.netcetera.threeds.sdk.api.transaction.challenge.events.RuntimeErrorEvent runtimeErrorEvent) {
        int i = getSDKVersion;
        int i2 = i & 3;
        cleanup = (i2 + ((i ^ 3) | i2)) % 128;
        this.get.valueOf(runtimeErrorEvent.getErrorMessage());
        this.ThreeDS2ServiceInstance.runtimeError(runtimeErrorEvent);
        int i3 = getSDKVersion;
        int i4 = i3 & 77;
        int i5 = ((i3 ^ 77) | i4) << 1;
        int i6 = -((i3 | 77) & (~i4));
        cleanup = ((i5 ^ i6) + ((i6 & i5) << 1)) % 128;
    }

    public void valueOf(setCustomInsertionActionModeCallback setcustominsertionactionmodecallback) {
        String valueOf = valueOf(setcustominsertionactionmodecallback.getSchemeEncryptionPublicKey());
        String valueOf2 = valueOf(setcustominsertionactionmodecallback.SchemeConfiguration$Builder());
        String valueOf3 = valueOf(setcustominsertionactionmodecallback.logoDark());
        this.ThreeDS2ServiceInstance.protocolError(new com.netcetera.threeds.sdk.api.transaction.challenge.events.ProtocolErrorEvent(this.ThreeDS2Service, new com.netcetera.threeds.sdk.api.transaction.challenge.ErrorMessage(this.ThreeDS2Service, valueOf, get(setcustominsertionactionmodecallback.logo()), get(setcustominsertionactionmodecallback.ids()), valueOf2, valueOf3, this.getWarnings.ThreeDS2Service())));
        int i = getSDKVersion;
        int i2 = i & 103;
        int i3 = (i ^ 103) | i2;
        int i4 = (i2 & i3) + (i3 | i2);
        cleanup = i4 % 128;
        if (i4 % 2 == 0) {
            int i5 = 23 / 0;
        }
    }

    public void values() {
        int i = getSDKVersion;
        cleanup = ((i & 67) + (i | 67)) % 128;
        this.ThreeDS2ServiceInstance.timedout();
        int i2 = getSDKVersion;
        int i3 = ((i2 | 115) << 1) - (i2 ^ 115);
        cleanup = i3 % 128;
        if (i3 % 2 == 0) {
            int i4 = 95 / 0;
        }
    }

    public void ThreeDS2Service(setPopupTheme setpopuptheme) {
        this.ThreeDS2ServiceInstance.completed(new com.netcetera.threeds.sdk.api.transaction.challenge.events.CompletionEvent(this.ThreeDS2Service, setpopuptheme.getSchemeLogoDark().ThreeDS2Service()));
        int i = cleanup;
        int i2 = (i ^ 15) + ((i & 15) << 1);
        getSDKVersion = i2 % 128;
        if (i2 % 2 != 0) {
            throw null;
        }
    }

    public void ThreeDS2Service() {
        int i = cleanup;
        int i2 = i & 11;
        int i3 = (i ^ 11) | i2;
        int i4 = (i2 ^ i3) + ((i3 & i2) << 1);
        getSDKVersion = i4 % 128;
        int i5 = i4 % 2;
        this.ThreeDS2ServiceInstance.cancelled();
        if (i5 != 0) {
            throw null;
        }
    }

    public void ThreeDS2Service(setId setid) {
        int i = cleanup;
        int i2 = (i ^ 54) + ((i & 54) << 1);
        getSDKVersion = ((~i2) + (i2 << 1)) % 128;
        com.netcetera.threeds.sdk.api.transaction.challenge.events.RuntimeErrorEvent values = this.valueOf.values(setid);
        this.get.ThreeDS2Service(values.getErrorMessage(), setid.getCause());
        this.ThreeDS2ServiceInstance.runtimeError(values);
        int i3 = cleanup;
        getSDKVersion = ((i3 & 73) + (i3 | 73)) % 128;
    }

    private String valueOf(printStackTrace printstacktrace) {
        String str;
        int i = cleanup;
        int i2 = i & 53;
        int i3 = -(-((i ^ 53) | i2));
        getSDKVersion = ((i2 ^ i3) + ((i2 & i3) << 1)) % 128;
        if (printstacktrace != null) {
            int i4 = i & 113;
            int i5 = (i ^ 113) | i4;
            getSDKVersion = ((i4 & i5) + (i5 | i4)) % 128;
            str = printstacktrace.ThreeDS2Service();
            int i6 = getSDKVersion;
            int i7 = i6 & 39;
            cleanup = ((((i6 | 39) & (~i7)) - (~(-(-(i7 << 1))))) - 1) % 128;
        } else {
            getSDKVersion = ((i & 35) + (i | 35)) % 128;
            str = "";
        }
        int i8 = getSDKVersion;
        cleanup = ((((i8 | 90) << 1) - (i8 ^ 90)) - 1) % 128;
        return str;
    }
}

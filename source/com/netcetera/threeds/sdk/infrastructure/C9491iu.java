package com.netcetera.threeds.sdk.infrastructure;

import android.app.Activity;
import com.netcetera.threeds.sdk.api.transaction.Transaction;
import com.netcetera.threeds.sdk.infrastructure.setTitleMarginEnd;
import java.security.KeyPair;

/* renamed from: com.netcetera.threeds.sdk.infrastructure.iu */
/* loaded from: classes5.dex */
public final class C9491iu implements com.netcetera.threeds.sdk.api.transaction.Transaction {
    private static int ThreeDS2Service$InitializationCallback = 0;
    private static int createTransaction = 1;
    private setLineBreakStyle ConfigParameters;
    private final String ThreeDS2Service;
    private final setLetterSpacing ThreeDS2ServiceInstance;
    private C9502jf cleanup;
    private final getTextFontSize get;
    private final C9613nb getSDKInfo;
    private C9611na getSDKVersion;
    private final InterfaceC9398fv getWarnings;
    private InterfaceC9500jd initialize;
    private final C9480ii valueOf;
    private final KeyPair values;

    public C9491iu(getTextFontSize gettextfontsize, setLetterSpacing setletterspacing, String str, InterfaceC9398fv interfaceC9398fv, KeyPair keyPair, C9480ii c9480ii, C9502jf c9502jf, C9611na c9611na, InterfaceC9500jd interfaceC9500jd, C9613nb c9613nb) {
        this.get = gettextfontsize;
        this.ThreeDS2ServiceInstance = setletterspacing;
        this.ThreeDS2Service = str;
        this.getWarnings = interfaceC9398fv;
        this.values = keyPair;
        this.valueOf = c9480ii;
        this.cleanup = c9502jf;
        this.getSDKVersion = c9611na;
        this.initialize = interfaceC9500jd;
        this.getSDKInfo = c9613nb;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public /* synthetic */ void ThreeDS2Service(Activity activity, com.netcetera.threeds.sdk.api.transaction.challenge.ChallengeParameters challengeParameters, com.netcetera.threeds.sdk.api.transaction.challenge.ChallengeStatusReceiver challengeStatusReceiver, int i) throws Exception {
        int i2;
        int i3 = createTransaction & 43;
        ThreeDS2Service$InitializationCallback = ((i3 - (~(-(-((i2 ^ 43) | i3))))) - 1) % 128;
        this.getSDKVersion.ThreeDS2Service();
        this.cleanup.ThreeDS2Service(activity);
        C9480ii c9480ii = this.valueOf;
        C9502jf c9502jf = this.cleanup;
        C9613nb c9613nb = this.getSDKInfo;
        InterfaceC9500jd interfaceC9500jd = this.initialize;
        setLineBreakStyle values = c9480ii.values(activity, challengeParameters, challengeStatusReceiver, i, c9502jf, c9613nb, interfaceC9500jd, interfaceC9500jd);
        this.ConfigParameters = values;
        values.values();
        int i4 = ThreeDS2Service$InitializationCallback;
        int i5 = (((i4 | 18) << 1) - (i4 ^ 18)) - 1;
        createTransaction = i5 % 128;
        if (i5 % 2 != 0) {
            return;
        }
        throw null;
    }

    @Override // com.netcetera.threeds.sdk.api.transaction.Transaction
    public void close() {
        int i = createTransaction;
        int i2 = i & 57;
        int i3 = (i | 57) & (~i2);
        int i4 = -(-(i2 << 1));
        int i5 = (i3 ^ i4) + ((i3 & i4) << 1);
        ThreeDS2Service$InitializationCallback = i5 % 128;
        if (i5 % 2 == 0) {
            this.getSDKVersion.ThreeDS2ServiceInstance();
            this.cleanup.get();
            this.getSDKVersion = null;
            this.cleanup = null;
            int i6 = createTransaction + 61;
            ThreeDS2Service$InitializationCallback = i6 % 128;
            if (i6 % 2 == 0) {
                return;
            }
            throw null;
        }
        this.getSDKVersion.ThreeDS2ServiceInstance();
        this.cleanup.get();
        this.getSDKVersion = null;
        this.cleanup = null;
        throw null;
    }

    @Override // com.netcetera.threeds.sdk.api.transaction.Transaction
    public void doChallenge(Activity activity, com.netcetera.threeds.sdk.api.transaction.challenge.ChallengeParameters challengeParameters, com.netcetera.threeds.sdk.api.transaction.challenge.ChallengeStatusReceiver challengeStatusReceiver, int i) {
        setNestedScrollingEnabled.valueOf(challengeStatusReceiver).ThreeDS2Service(new C9492iv(this, activity, challengeParameters, challengeStatusReceiver, i));
        int i2 = ThreeDS2Service$InitializationCallback;
        int i3 = i2 ^ 117;
        createTransaction = ((((i2 & 117) | i3) << 1) - i3) % 128;
    }

    @Override // com.netcetera.threeds.sdk.api.transaction.Transaction
    public com.netcetera.threeds.sdk.api.transaction.AuthenticationRequestParameters getAuthenticationRequestParameters() throws com.netcetera.threeds.sdk.api.exceptions.SDKRuntimeException {
        int i = ThreeDS2Service$InitializationCallback;
        int i2 = i & 17;
        int i3 = ((i | 17) & (~i2)) + (i2 << 1);
        createTransaction = i3 % 128;
        if (i3 % 2 == 0) {
            int i4 = 98 / 0;
            return this.ThreeDS2ServiceInstance.get(this.get, this.ThreeDS2Service, this.values, this.getWarnings.ThreeDS2Service());
        }
        return this.ThreeDS2ServiceInstance.get(this.get, this.ThreeDS2Service, this.values, this.getWarnings.ThreeDS2Service());
    }

    @Override // com.netcetera.threeds.sdk.api.transaction.Transaction
    public com.netcetera.threeds.sdk.api.p018ui.ProgressView getProgressView(Activity activity) {
        this.cleanup.ThreeDS2Service(activity);
        C9506jj c9506jj = new C9506jj(this.cleanup, this.getSDKVersion);
        int i = createTransaction;
        int i2 = i & 95;
        int i3 = i2 + ((i ^ 95) | i2);
        ThreeDS2Service$InitializationCallback = i3 % 128;
        if (i3 % 2 == 0) {
            return c9506jj;
        }
        throw null;
    }

    @Override // com.netcetera.threeds.sdk.api.transaction.Transaction
    public void useBridgingExtension(Transaction.BridgingMessageExtensionVersion bridgingMessageExtensionVersion) {
        int i = ThreeDS2Service$InitializationCallback;
        int i2 = i | 109;
        createTransaction = (((i2 << 1) - (~(-((~(i & 109)) & i2)))) - 1) % 128;
        this.initialize.values(setTitleMarginEnd.ThreeDS2Service.get(bridgingMessageExtensionVersion.getValue()));
        int i3 = createTransaction;
        int i4 = i3 & 17;
        int i5 = -(-((i3 ^ 17) | i4));
        ThreeDS2Service$InitializationCallback = ((i4 ^ i5) + ((i5 & i4) << 1)) % 128;
    }
}

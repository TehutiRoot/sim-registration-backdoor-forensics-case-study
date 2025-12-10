package com.netcetera.threeds.sdk.infrastructure;

import android.app.Activity;
import com.netcetera.threeds.sdk.infrastructure.setSelected;

/* renamed from: com.netcetera.threeds.sdk.infrastructure.iv */
/* loaded from: classes5.dex */
class C9481iv implements setSelected.ThreeDS2Service {
    private final com.netcetera.threeds.sdk.api.transaction.challenge.ChallengeStatusReceiver ThreeDS2Service;
    private final Activity ThreeDS2ServiceInstance;
    private final C9480iu get;
    private final com.netcetera.threeds.sdk.api.transaction.challenge.ChallengeParameters valueOf;
    private final int values;

    public C9481iv(C9480iu c9480iu, Activity activity, com.netcetera.threeds.sdk.api.transaction.challenge.ChallengeParameters challengeParameters, com.netcetera.threeds.sdk.api.transaction.challenge.ChallengeStatusReceiver challengeStatusReceiver, int i) {
        this.get = c9480iu;
        this.ThreeDS2ServiceInstance = activity;
        this.valueOf = challengeParameters;
        this.ThreeDS2Service = challengeStatusReceiver;
        this.values = i;
    }

    @Override // com.netcetera.threeds.sdk.infrastructure.setSelected.ThreeDS2Service
    public void values() {
        this.get.ThreeDS2Service(this.ThreeDS2ServiceInstance, this.valueOf, this.ThreeDS2Service, this.values);
    }
}
package com.netcetera.threeds.sdk.infrastructure;

import android.view.KeyEvent;
import android.view.View;
import java.util.HashSet;
import java.util.Iterator;
import java.util.List;
import java.util.Set;

/* loaded from: classes5.dex */
public class completed implements ChallengeParameters {
    public static int ThreeDS2Service = 0;
    public static char ThreeDS2ServiceInstance = 25540;
    private static int getSDKVersion = 1;
    private static int initialize;
    public static long values;
    private final List<ChallengeParameters> get;
    private final InterfaceC9641ns valueOf = C9642nt.ThreeDS2ServiceInstance(completed.class);

    public completed(List<ChallengeParameters> list) {
        this.get = list;
    }

    @Override // com.netcetera.threeds.sdk.infrastructure.ChallengeParameters
    public getTransactionStatus ThreeDS2Service(String str, String str2) throws setId {
        getSDKVersion = (initialize + 57) % 128;
        getTransactionStatus gettransactionstatus = null;
        for (ChallengeParameters challengeParameters : this.get) {
            try {
                gettransactionstatus = getThreeDSRequestorAppURL.ThreeDS2ServiceInstance(gettransactionstatus, challengeParameters.ThreeDS2Service(str, str2));
                initialize = (getSDKVersion + 69) % 128;
            } catch (setId unused) {
                View.MeasureSpec.getSize(0);
                KeyEvent.getDeadChar(0, 0);
            }
        }
        if (gettransactionstatus != null) {
            int i = getSDKVersion + 19;
            initialize = i % 128;
            if (i % 2 == 0) {
                if (gettransactionstatus.getSDKVersion()) {
                    return gettransactionstatus;
                }
            } else {
                gettransactionstatus.getSDKVersion();
                throw null;
            }
        }
        throw setForegroundGravity.SDKNotInitializedException.valueOf(str);
    }

    @Override // com.netcetera.threeds.sdk.infrastructure.ChallengeParameters
    public Set<String> ThreeDS2ServiceInstance(String str) {
        HashSet hashSet = new HashSet();
        Iterator<ChallengeParameters> it = this.get.iterator();
        while (it.hasNext()) {
            int i = initialize + 25;
            getSDKVersion = i % 128;
            if (i % 2 != 0) {
                hashSet.addAll(it.next().ThreeDS2ServiceInstance(str));
            } else {
                hashSet.addAll(it.next().ThreeDS2ServiceInstance(str));
                throw null;
            }
        }
        getSDKVersion = (initialize + 5) % 128;
        return hashSet;
    }
}
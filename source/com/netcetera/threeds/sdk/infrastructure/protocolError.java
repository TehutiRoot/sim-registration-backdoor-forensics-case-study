package com.netcetera.threeds.sdk.infrastructure;

import java.util.List;
import java.util.Set;

/* loaded from: classes5.dex */
public final class protocolError implements ChallengeParameters {
    private static int getSDKInfo = 0;
    private static int initialize = 1;
    private final showProgress ThreeDS2Service;
    private final String ThreeDS2ServiceInstance;
    private final Set<String> get;
    private final hideProgress getSDKVersion;
    private final hideProgress valueOf;
    private final List<String> values;

    public protocolError(String str, Set<String> set, List<String> list, showProgress showprogress, hideProgress hideprogress, hideProgress hideprogress2) {
        this.ThreeDS2ServiceInstance = str;
        this.get = set;
        this.values = list;
        this.ThreeDS2Service = showprogress;
        this.valueOf = hideprogress;
        this.getSDKVersion = hideprogress2;
    }

    public static protocolError valueOf(String str, Set<String> set, List<String> list, showProgress showprogress, hideProgress hideprogress, hideProgress hideprogress2) {
        protocolError protocolerror = new protocolError(str, set, list, showprogress, hideprogress, hideprogress2);
        int i = getSDKInfo;
        int i2 = ((i | 40) << 1) - (i ^ 40);
        int i3 = (~i2) + (i2 << 1);
        initialize = i3 % 128;
        if (i3 % 2 == 0) {
            int i4 = 53 / 0;
        }
        return protocolerror;
    }

    @Override // com.netcetera.threeds.sdk.infrastructure.ChallengeParameters
    public getTransactionStatus ThreeDS2Service(String str, String str2) throws setId {
        int i = getSDKInfo;
        int i2 = i ^ 61;
        int i3 = -(-((i & 61) << 1));
        initialize = (((i2 | i3) << 1) - (i3 ^ i2)) % 128;
        if (this.get.contains(str)) {
            getTransactionStatus gettransactionstatus = new getTransactionStatus(this.ThreeDS2ServiceInstance, this.values, this.ThreeDS2Service, this.valueOf, this.getSDKVersion);
            int i4 = initialize;
            int i5 = i4 & 33;
            getSDKInfo = (i5 + ((i4 ^ 33) | i5)) % 128;
            return gettransactionstatus;
        }
        throw setForegroundGravity.CertificateInfo.valueOf(str);
    }

    @Override // com.netcetera.threeds.sdk.infrastructure.ChallengeParameters
    public Set<String> ThreeDS2ServiceInstance(String str) {
        int i = initialize;
        int i2 = ((i & 119) + (i | 119)) % 128;
        getSDKInfo = i2;
        Set<String> set = this.get;
        initialize = (i2 + 61) % 128;
        return set;
    }
}

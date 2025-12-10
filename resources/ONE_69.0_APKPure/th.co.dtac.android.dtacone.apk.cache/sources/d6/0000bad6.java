package com.netcetera.threeds.sdk.infrastructure;

/* loaded from: classes5.dex */
public class ChallengeStatusReceiver implements close {
    private static int get = 0;
    private static int getSDKVersion = 1;
    private final RuntimeErrorEvent ThreeDS2Service;
    private final setAcsRefNumber ThreeDS2ServiceInstance;
    private final ChallengeParameters valueOf;
    private final C9571lz values;

    public ChallengeStatusReceiver(setAcsRefNumber setacsrefnumber, RuntimeErrorEvent runtimeErrorEvent, ChallengeParameters challengeParameters, C9571lz c9571lz) {
        this.ThreeDS2ServiceInstance = setacsrefnumber;
        this.ThreeDS2Service = runtimeErrorEvent;
        this.valueOf = challengeParameters;
        this.values = c9571lz;
    }

    public static close values(setAcsRefNumber setacsrefnumber, ChallengeParameters challengeParameters, C9571lz c9571lz) {
        ChallengeStatusReceiver challengeStatusReceiver = new ChallengeStatusReceiver(setacsrefnumber, timedout.valueOf(), challengeParameters, c9571lz);
        int i = getSDKVersion;
        int i2 = (i & 11) + (i | 11);
        get = i2 % 128;
        if (i2 % 2 == 0) {
            return challengeStatusReceiver;
        }
        throw null;
    }

    /* JADX WARN: Code restructure failed: missing block: B:10:0x007b, code lost:
        r0 = com.netcetera.threeds.sdk.infrastructure.ChallengeStatusReceiver.get + 30;
        com.netcetera.threeds.sdk.infrastructure.ChallengeStatusReceiver.getSDKVersion = ((~r0) + (r0 << 1)) % 128;
        r0 = null;
     */
    /* JADX WARN: Code restructure failed: missing block: B:5:0x003a, code lost:
        if (r0.valueOf() != false) goto L20;
     */
    /* JADX WARN: Code restructure failed: missing block: B:8:0x0059, code lost:
        if (r0.valueOf() != false) goto L20;
     */
    /* JADX WARN: Code restructure failed: missing block: B:9:0x005b, code lost:
        r0 = r6.ThreeDS2ServiceInstance.values(r0.get());
        r1 = com.netcetera.threeds.sdk.infrastructure.ChallengeStatusReceiver.getSDKVersion;
        r2 = r1 | 125;
        r3 = r2 << 1;
        r1 = -((~(r1 & 125)) & r2);
        com.netcetera.threeds.sdk.infrastructure.ChallengeStatusReceiver.get = ((r3 ^ r1) + ((r1 & r3) << 1)) % 128;
     */
    @Override // com.netcetera.threeds.sdk.infrastructure.close
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public com.netcetera.threeds.sdk.infrastructure.ProtocolErrorEvent ThreeDS2Service(java.lang.String r7, java.lang.String r8) throws com.netcetera.threeds.sdk.infrastructure.setId {
        /*
            Method dump skipped, instructions count: 291
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: com.netcetera.threeds.sdk.infrastructure.ChallengeStatusReceiver.ThreeDS2Service(java.lang.String, java.lang.String):com.netcetera.threeds.sdk.infrastructure.ProtocolErrorEvent");
    }
}
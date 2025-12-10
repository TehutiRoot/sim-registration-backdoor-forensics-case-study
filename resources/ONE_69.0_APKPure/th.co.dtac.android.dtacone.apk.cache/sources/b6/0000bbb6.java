package com.netcetera.threeds.sdk.infrastructure;

import android.app.Activity;
import android.graphics.drawable.Drawable;
import android.os.Process;
import android.text.TextUtils;
import android.view.ViewConfiguration;
import com.netcetera.threeds.sdk.infrastructure.setSelected;

/* renamed from: com.netcetera.threeds.sdk.infrastructure.fb */
/* loaded from: classes5.dex */
public class C9370fb implements setSelected.ThreeDS2Service {
    private final com.netcetera.threeds.sdk.api.transaction.challenge.ChallengeStatusReceiver ThreeDS2Service;
    private final com.netcetera.threeds.sdk.api.transaction.Transaction ThreeDS2ServiceInstance$5f2d72c8;
    private final int get;
    private final Activity valueOf;
    private final com.netcetera.threeds.sdk.api.transaction.challenge.ChallengeParameters values;

    public C9370fb(com.netcetera.threeds.sdk.api.transaction.Transaction transaction, Activity activity, com.netcetera.threeds.sdk.api.transaction.challenge.ChallengeParameters challengeParameters, com.netcetera.threeds.sdk.api.transaction.challenge.ChallengeStatusReceiver challengeStatusReceiver, int i) {
        this.ThreeDS2ServiceInstance$5f2d72c8 = transaction;
        this.valueOf = activity;
        this.values = challengeParameters;
        this.ThreeDS2Service = challengeStatusReceiver;
        this.get = i;
    }

    @Override // com.netcetera.threeds.sdk.infrastructure.setSelected.ThreeDS2Service
    public void values() {
        try {
            ((Class) setFirstBaselineToTopHeight.ThreeDS2ServiceInstance(375 - TextUtils.indexOf("", ""), (char) (54750 - (ViewConfiguration.getDoubleTapTimeout() >> 16)), 47 - TextUtils.indexOf((CharSequence) "", '0', 0, 0))).getDeclaredMethod("ThreeDS2ServiceInstance", (Class) setFirstBaselineToTopHeight.ThreeDS2ServiceInstance(((Process.getThreadPriority(0) + 20) >> 6) + 375, (char) (54750 - Drawable.resolveOpacity(0, 0)), 48 - TextUtils.getOffsetAfter("", 0)), Activity.class, com.netcetera.threeds.sdk.api.transaction.challenge.ChallengeParameters.class, com.netcetera.threeds.sdk.api.transaction.challenge.ChallengeStatusReceiver.class, Integer.TYPE).invoke(null, this.ThreeDS2ServiceInstance$5f2d72c8, this.valueOf, this.values, this.ThreeDS2Service, Integer.valueOf(this.get));
        } catch (Throwable th2) {
            Throwable cause = th2.getCause();
            if (cause == null) {
                throw th2;
            }
            throw cause;
        }
    }
}
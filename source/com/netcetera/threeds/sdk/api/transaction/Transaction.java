package com.netcetera.threeds.sdk.api.transaction;

import android.app.Activity;
import com.netcetera.threeds.sdk.api.exceptions.InvalidInputException;
import com.netcetera.threeds.sdk.api.exceptions.SDKRuntimeException;
import com.netcetera.threeds.sdk.api.p018ui.ProgressView;
import com.netcetera.threeds.sdk.api.transaction.challenge.ChallengeParameters;
import com.netcetera.threeds.sdk.api.transaction.challenge.ChallengeStatusReceiver;

/* loaded from: classes5.dex */
public interface Transaction {

    /* loaded from: classes5.dex */
    public enum BridgingMessageExtensionVersion {
        V10("1.0"),
        V20("2.0");
        
        private static int get = 1;
        private static int values;
        private final String value;

        static {
            int i = get + 3;
            values = i % 128;
            if (i % 2 == 0) {
                return;
            }
            throw null;
        }

        BridgingMessageExtensionVersion(String str) {
            this.value = str;
        }

        public static BridgingMessageExtensionVersion valueOf(String str) {
            get = (values + 15) % 128;
            BridgingMessageExtensionVersion bridgingMessageExtensionVersion = (BridgingMessageExtensionVersion) Enum.valueOf(BridgingMessageExtensionVersion.class, str);
            values = (get + 49) % 128;
            return bridgingMessageExtensionVersion;
        }

        /* renamed from: values  reason: to resolve conflict with enum method */
        public static BridgingMessageExtensionVersion[] valuesCustom() {
            int i = get + 103;
            values = i % 128;
            if (i % 2 == 0) {
                BridgingMessageExtensionVersion[] bridgingMessageExtensionVersionArr = (BridgingMessageExtensionVersion[]) values().clone();
                get = (values + 95) % 128;
                return bridgingMessageExtensionVersionArr;
            }
            values().clone();
            throw null;
        }

        public String getValue() {
            int i = get;
            String str = this.value;
            int i2 = i + 77;
            values = i2 % 128;
            if (i2 % 2 != 0) {
                int i3 = 29 / 0;
            }
            return str;
        }
    }

    void close() throws SDKRuntimeException;

    void doChallenge(Activity activity, ChallengeParameters challengeParameters, ChallengeStatusReceiver challengeStatusReceiver, int i) throws InvalidInputException, SDKRuntimeException;

    AuthenticationRequestParameters getAuthenticationRequestParameters() throws SDKRuntimeException;

    ProgressView getProgressView(Activity activity) throws InvalidInputException, SDKRuntimeException;

    void useBridgingExtension(BridgingMessageExtensionVersion bridgingMessageExtensionVersion);
}

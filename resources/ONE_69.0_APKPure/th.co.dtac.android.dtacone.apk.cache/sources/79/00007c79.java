package co.omise.android.p009ui;

import kotlin.Metadata;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import th.p047co.dtac.android.dtacone.util.Constant;

@Metadata(m29143d1 = {"\u0000\u0012\n\u0002\u0018\u0002\n\u0002\u0010\u0010\n\u0000\n\u0002\u0010\u000e\n\u0002\b\f\b\u0086\u0001\u0018\u00002\b\u0012\u0004\u0012\u00020\u00000\u0001B\u000f\b\u0002\u0012\u0006\u0010\u0002\u001a\u00020\u0003¢\u0006\u0002\u0010\u0004J\u0010\u0010\u0007\u001a\u00020\u00032\b\u0010\b\u001a\u0004\u0018\u00010\u0003R\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0005\u0010\u0006j\u0002\b\tj\u0002\b\nj\u0002\b\u000bj\u0002\b\fj\u0002\b\rj\u0002\b\u000e¨\u0006\u000f"}, m29142d2 = {"Lco/omise/android/ui/ChallengeStatus;", "", "value", "", "(Ljava/lang/String;ILjava/lang/String;)V", "getValue", "()Ljava/lang/String;", "includeUnknownTransactionStatusWithError", "transactionStatus", "RUNTIME_ERROR", "PROTOCOL_ERROR", Constant.QueryTransactionStatus.FAILED, "TIMED_OUT", Constant.QueryTransactionStatus.CANCELLED, "COMPLETED_WITH_UNKNOWN_STATUS", "sdk_productionRelease"}, m29141k = 1, m29140mv = {1, 7, 1}, m29138xi = 48)
/* renamed from: co.omise.android.ui.ChallengeStatus */
/* loaded from: classes3.dex */
public enum ChallengeStatus {
    RUNTIME_ERROR("Challenge runtime error"),
    PROTOCOL_ERROR("Challenge protocol error"),
    FAILED("Challenge failed"),
    TIMED_OUT("Challenge timed out"),
    CANCELLED("Challenge cancelled"),
    COMPLETED_WITH_UNKNOWN_STATUS("Challenge completed with unknown status");
    
    @NotNull
    private final String value;

    ChallengeStatus(String str) {
        this.value = str;
    }

    @NotNull
    public final String getValue() {
        return this.value;
    }

    @NotNull
    public final String includeUnknownTransactionStatusWithError(@Nullable String str) {
        return "Challenge completed with unknown status: " + str;
    }
}
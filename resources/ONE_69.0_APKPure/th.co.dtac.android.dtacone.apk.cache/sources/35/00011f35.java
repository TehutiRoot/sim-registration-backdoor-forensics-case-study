package th.p047co.dtac.android.dtacone.model.mrtr_postpaid.registration;

import androidx.compose.runtime.internal.StabilityInferred;
import com.google.gson.annotations.SerializedName;
import kotlin.Metadata;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

@StabilityInferred(parameters = 0)
@Metadata(m29143d1 = {"\u0000&\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\t\n\u0002\b\u0010\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000e\n\u0000\b\u0087\b\u0018\u00002\u00020\u0001B\u001d\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0003\u0012\u0006\u0010\u0005\u001a\u00020\u0003¢\u0006\u0002\u0010\u0006J\t\u0010\u000f\u001a\u00020\u0003HÆ\u0003J\t\u0010\u0010\u001a\u00020\u0003HÆ\u0003J\t\u0010\u0011\u001a\u00020\u0003HÆ\u0003J'\u0010\u0012\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u00032\b\b\u0002\u0010\u0004\u001a\u00020\u00032\b\b\u0002\u0010\u0005\u001a\u00020\u0003HÆ\u0001J\u0013\u0010\u0013\u001a\u00020\u00142\b\u0010\u0015\u001a\u0004\u0018\u00010\u0001HÖ\u0003J\t\u0010\u0016\u001a\u00020\u0017HÖ\u0001J\t\u0010\u0018\u001a\u00020\u0019HÖ\u0001R\u001e\u0010\u0005\u001a\u00020\u00038\u0006@\u0006X\u0087\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u0007\u0010\b\"\u0004\b\t\u0010\nR\u001e\u0010\u0002\u001a\u00020\u00038\u0006@\u0006X\u0087\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u000b\u0010\b\"\u0004\b\f\u0010\nR\u001e\u0010\u0004\u001a\u00020\u00038\u0006@\u0006X\u0087\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\r\u0010\b\"\u0004\b\u000e\u0010\n¨\u0006\u001a"}, m29142d2 = {"Lth/co/dtac/android/dtacone/model/mrtr_postpaid/registration/NiceNumber;", "", "contractPeriod", "", "penaltyRate", "advancedPayment", "(JJJ)V", "getAdvancedPayment", "()J", "setAdvancedPayment", "(J)V", "getContractPeriod", "setContractPeriod", "getPenaltyRate", "setPenaltyRate", "component1", "component2", "component3", "copy", "equals", "", "other", "hashCode", "", "toString", "", "app_prodRelease"}, m29141k = 1, m29140mv = {1, 8, 0}, m29138xi = 48)
/* renamed from: th.co.dtac.android.dtacone.model.mrtr_postpaid.registration.NiceNumber */
/* loaded from: classes8.dex */
public final class NiceNumber {
    public static final int $stable = 8;
    @SerializedName("advancedPayment")
    private long advancedPayment;
    @SerializedName("contractPeriod")
    private long contractPeriod;
    @SerializedName("penaltyRate")
    private long penaltyRate;

    public NiceNumber(long j, long j2, long j3) {
        this.contractPeriod = j;
        this.penaltyRate = j2;
        this.advancedPayment = j3;
    }

    public static /* synthetic */ NiceNumber copy$default(NiceNumber niceNumber, long j, long j2, long j3, int i, Object obj) {
        if ((i & 1) != 0) {
            j = niceNumber.contractPeriod;
        }
        long j4 = j;
        if ((i & 2) != 0) {
            j2 = niceNumber.penaltyRate;
        }
        long j5 = j2;
        if ((i & 4) != 0) {
            j3 = niceNumber.advancedPayment;
        }
        return niceNumber.copy(j4, j5, j3);
    }

    public final long component1() {
        return this.contractPeriod;
    }

    public final long component2() {
        return this.penaltyRate;
    }

    public final long component3() {
        return this.advancedPayment;
    }

    @NotNull
    public final NiceNumber copy(long j, long j2, long j3) {
        return new NiceNumber(j, j2, j3);
    }

    public boolean equals(@Nullable Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj instanceof NiceNumber) {
            NiceNumber niceNumber = (NiceNumber) obj;
            return this.contractPeriod == niceNumber.contractPeriod && this.penaltyRate == niceNumber.penaltyRate && this.advancedPayment == niceNumber.advancedPayment;
        }
        return false;
    }

    public final long getAdvancedPayment() {
        return this.advancedPayment;
    }

    public final long getContractPeriod() {
        return this.contractPeriod;
    }

    public final long getPenaltyRate() {
        return this.penaltyRate;
    }

    public int hashCode() {
        return (((AbstractC17631Fh1.m68395a(this.contractPeriod) * 31) + AbstractC17631Fh1.m68395a(this.penaltyRate)) * 31) + AbstractC17631Fh1.m68395a(this.advancedPayment);
    }

    public final void setAdvancedPayment(long j) {
        this.advancedPayment = j;
    }

    public final void setContractPeriod(long j) {
        this.contractPeriod = j;
    }

    public final void setPenaltyRate(long j) {
        this.penaltyRate = j;
    }

    @NotNull
    public String toString() {
        long j = this.contractPeriod;
        long j2 = this.penaltyRate;
        long j3 = this.advancedPayment;
        return "NiceNumber(contractPeriod=" + j + ", penaltyRate=" + j2 + ", advancedPayment=" + j3 + ")";
    }
}
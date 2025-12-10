package th.p047co.dtac.android.dtacone.model.blacklist;

import androidx.compose.runtime.internal.StabilityInferred;
import com.google.gson.annotations.SerializedName;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

@StabilityInferred(parameters = 0)
@Metadata(m29143d1 = {"\u0000\"\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000e\n\u0002\b\f\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\b\u0087\b\u0018\u00002\u00020\u0001B\u001d\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0003\u0012\u0006\u0010\u0005\u001a\u00020\u0003¢\u0006\u0002\u0010\u0006J\t\u0010\u000b\u001a\u00020\u0003HÆ\u0003J\t\u0010\f\u001a\u00020\u0003HÆ\u0003J\t\u0010\r\u001a\u00020\u0003HÆ\u0003J'\u0010\u000e\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u00032\b\b\u0002\u0010\u0004\u001a\u00020\u00032\b\b\u0002\u0010\u0005\u001a\u00020\u0003HÆ\u0001J\u0013\u0010\u000f\u001a\u00020\u00102\b\u0010\u0011\u001a\u0004\u0018\u00010\u0001HÖ\u0003J\t\u0010\u0012\u001a\u00020\u0013HÖ\u0001J\t\u0010\u0014\u001a\u00020\u0003HÖ\u0001R\u0016\u0010\u0004\u001a\u00020\u00038\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u0007\u0010\bR\u0016\u0010\u0005\u001a\u00020\u00038\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b\t\u0010\bR\u0016\u0010\u0002\u001a\u00020\u00038\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b\n\u0010\b¨\u0006\u0015"}, m29142d2 = {"Lth/co/dtac/android/dtacone/model/blacklist/ExtraAdvanceMasterInformation;", "", "sequence", "", "displayRankingPrice", "extraAdvancePayment", "(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)V", "getDisplayRankingPrice", "()Ljava/lang/String;", "getExtraAdvancePayment", "getSequence", "component1", "component2", "component3", "copy", "equals", "", "other", "hashCode", "", "toString", "app_prodRelease"}, m29141k = 1, m29140mv = {1, 8, 0}, m29138xi = 48)
/* renamed from: th.co.dtac.android.dtacone.model.blacklist.ExtraAdvanceMasterInformation */
/* loaded from: classes8.dex */
public final class ExtraAdvanceMasterInformation {
    public static final int $stable = 0;
    @SerializedName("displayRankingPrice")
    @NotNull
    private final String displayRankingPrice;
    @SerializedName("extraAdvancePayment")
    @NotNull
    private final String extraAdvancePayment;
    @SerializedName("sequence")
    @NotNull
    private final String sequence;

    public ExtraAdvanceMasterInformation(@NotNull String sequence, @NotNull String displayRankingPrice, @NotNull String extraAdvancePayment) {
        Intrinsics.checkNotNullParameter(sequence, "sequence");
        Intrinsics.checkNotNullParameter(displayRankingPrice, "displayRankingPrice");
        Intrinsics.checkNotNullParameter(extraAdvancePayment, "extraAdvancePayment");
        this.sequence = sequence;
        this.displayRankingPrice = displayRankingPrice;
        this.extraAdvancePayment = extraAdvancePayment;
    }

    public static /* synthetic */ ExtraAdvanceMasterInformation copy$default(ExtraAdvanceMasterInformation extraAdvanceMasterInformation, String str, String str2, String str3, int i, Object obj) {
        if ((i & 1) != 0) {
            str = extraAdvanceMasterInformation.sequence;
        }
        if ((i & 2) != 0) {
            str2 = extraAdvanceMasterInformation.displayRankingPrice;
        }
        if ((i & 4) != 0) {
            str3 = extraAdvanceMasterInformation.extraAdvancePayment;
        }
        return extraAdvanceMasterInformation.copy(str, str2, str3);
    }

    @NotNull
    public final String component1() {
        return this.sequence;
    }

    @NotNull
    public final String component2() {
        return this.displayRankingPrice;
    }

    @NotNull
    public final String component3() {
        return this.extraAdvancePayment;
    }

    @NotNull
    public final ExtraAdvanceMasterInformation copy(@NotNull String sequence, @NotNull String displayRankingPrice, @NotNull String extraAdvancePayment) {
        Intrinsics.checkNotNullParameter(sequence, "sequence");
        Intrinsics.checkNotNullParameter(displayRankingPrice, "displayRankingPrice");
        Intrinsics.checkNotNullParameter(extraAdvancePayment, "extraAdvancePayment");
        return new ExtraAdvanceMasterInformation(sequence, displayRankingPrice, extraAdvancePayment);
    }

    public boolean equals(@Nullable Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj instanceof ExtraAdvanceMasterInformation) {
            ExtraAdvanceMasterInformation extraAdvanceMasterInformation = (ExtraAdvanceMasterInformation) obj;
            return Intrinsics.areEqual(this.sequence, extraAdvanceMasterInformation.sequence) && Intrinsics.areEqual(this.displayRankingPrice, extraAdvanceMasterInformation.displayRankingPrice) && Intrinsics.areEqual(this.extraAdvancePayment, extraAdvanceMasterInformation.extraAdvancePayment);
        }
        return false;
    }

    @NotNull
    public final String getDisplayRankingPrice() {
        return this.displayRankingPrice;
    }

    @NotNull
    public final String getExtraAdvancePayment() {
        return this.extraAdvancePayment;
    }

    @NotNull
    public final String getSequence() {
        return this.sequence;
    }

    public int hashCode() {
        return (((this.sequence.hashCode() * 31) + this.displayRankingPrice.hashCode()) * 31) + this.extraAdvancePayment.hashCode();
    }

    @NotNull
    public String toString() {
        String str = this.sequence;
        String str2 = this.displayRankingPrice;
        String str3 = this.extraAdvancePayment;
        return "ExtraAdvanceMasterInformation(sequence=" + str + ", displayRankingPrice=" + str2 + ", extraAdvancePayment=" + str3 + ")";
    }
}
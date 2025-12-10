package th.p047co.dtac.android.dtacone.model.appOne.mnp.response;

import androidx.compose.runtime.internal.StabilityInferred;
import com.google.gson.annotations.SerializedName;
import kotlin.Metadata;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

@StabilityInferred(parameters = 0)
@Metadata(m29143d1 = {"\u0000&\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0002\b\f\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000e\n\u0000\b\u0087\b\u0018\u00002\u00020\u0001B)\u0012\n\b\u0002\u0010\u0002\u001a\u0004\u0018\u00010\u0003\u0012\n\b\u0002\u0010\u0004\u001a\u0004\u0018\u00010\u0003\u0012\n\b\u0002\u0010\u0005\u001a\u0004\u0018\u00010\u0003¢\u0006\u0002\u0010\u0006J\u000b\u0010\u000b\u001a\u0004\u0018\u00010\u0003HÆ\u0003J\u000b\u0010\f\u001a\u0004\u0018\u00010\u0003HÆ\u0003J\u000b\u0010\r\u001a\u0004\u0018\u00010\u0003HÆ\u0003J-\u0010\u000e\u001a\u00020\u00002\n\b\u0002\u0010\u0002\u001a\u0004\u0018\u00010\u00032\n\b\u0002\u0010\u0004\u001a\u0004\u0018\u00010\u00032\n\b\u0002\u0010\u0005\u001a\u0004\u0018\u00010\u0003HÆ\u0001J\u0013\u0010\u000f\u001a\u00020\u00102\b\u0010\u0011\u001a\u0004\u0018\u00010\u0001HÖ\u0003J\t\u0010\u0012\u001a\u00020\u0013HÖ\u0001J\t\u0010\u0014\u001a\u00020\u0015HÖ\u0001R\u0018\u0010\u0002\u001a\u0004\u0018\u00010\u00038\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u0007\u0010\bR\u0018\u0010\u0005\u001a\u0004\u0018\u00010\u00038\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b\t\u0010\bR\u0018\u0010\u0004\u001a\u0004\u0018\u00010\u00038\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b\n\u0010\b¨\u0006\u0016"}, m29142d2 = {"Lth/co/dtac/android/dtacone/model/appOne/mnp/response/MnpCustomerPreVerifyData;", "", "preVerify", "Lth/co/dtac/android/dtacone/model/appOne/mnp/response/Result;", "validateID", "reserveMsisdn", "(Lth/co/dtac/android/dtacone/model/appOne/mnp/response/Result;Lth/co/dtac/android/dtacone/model/appOne/mnp/response/Result;Lth/co/dtac/android/dtacone/model/appOne/mnp/response/Result;)V", "getPreVerify", "()Lth/co/dtac/android/dtacone/model/appOne/mnp/response/Result;", "getReserveMsisdn", "getValidateID", "component1", "component2", "component3", "copy", "equals", "", "other", "hashCode", "", "toString", "", "app_prodRelease"}, m29141k = 1, m29140mv = {1, 8, 0}, m29138xi = 48)
/* renamed from: th.co.dtac.android.dtacone.model.appOne.mnp.response.MnpCustomerPreVerifyData */
/* loaded from: classes8.dex */
public final class MnpCustomerPreVerifyData {
    public static final int $stable = 8;
    @SerializedName("preverify")
    @Nullable
    private final Result preVerify;
    @SerializedName("reserveMsisdn")
    @Nullable
    private final Result reserveMsisdn;
    @SerializedName("validateID")
    @Nullable
    private final Result validateID;

    public MnpCustomerPreVerifyData() {
        this(null, null, null, 7, null);
    }

    public static /* synthetic */ MnpCustomerPreVerifyData copy$default(MnpCustomerPreVerifyData mnpCustomerPreVerifyData, Result result, Result result2, Result result3, int i, Object obj) {
        if ((i & 1) != 0) {
            result = mnpCustomerPreVerifyData.preVerify;
        }
        if ((i & 2) != 0) {
            result2 = mnpCustomerPreVerifyData.validateID;
        }
        if ((i & 4) != 0) {
            result3 = mnpCustomerPreVerifyData.reserveMsisdn;
        }
        return mnpCustomerPreVerifyData.copy(result, result2, result3);
    }

    @Nullable
    public final Result component1() {
        return this.preVerify;
    }

    @Nullable
    public final Result component2() {
        return this.validateID;
    }

    @Nullable
    public final Result component3() {
        return this.reserveMsisdn;
    }

    @NotNull
    public final MnpCustomerPreVerifyData copy(@Nullable Result result, @Nullable Result result2, @Nullable Result result3) {
        return new MnpCustomerPreVerifyData(result, result2, result3);
    }

    public boolean equals(@Nullable Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj instanceof MnpCustomerPreVerifyData) {
            MnpCustomerPreVerifyData mnpCustomerPreVerifyData = (MnpCustomerPreVerifyData) obj;
            return Intrinsics.areEqual(this.preVerify, mnpCustomerPreVerifyData.preVerify) && Intrinsics.areEqual(this.validateID, mnpCustomerPreVerifyData.validateID) && Intrinsics.areEqual(this.reserveMsisdn, mnpCustomerPreVerifyData.reserveMsisdn);
        }
        return false;
    }

    @Nullable
    public final Result getPreVerify() {
        return this.preVerify;
    }

    @Nullable
    public final Result getReserveMsisdn() {
        return this.reserveMsisdn;
    }

    @Nullable
    public final Result getValidateID() {
        return this.validateID;
    }

    public int hashCode() {
        Result result = this.preVerify;
        int hashCode = (result == null ? 0 : result.hashCode()) * 31;
        Result result2 = this.validateID;
        int hashCode2 = (hashCode + (result2 == null ? 0 : result2.hashCode())) * 31;
        Result result3 = this.reserveMsisdn;
        return hashCode2 + (result3 != null ? result3.hashCode() : 0);
    }

    @NotNull
    public String toString() {
        Result result = this.preVerify;
        Result result2 = this.validateID;
        Result result3 = this.reserveMsisdn;
        return "MnpCustomerPreVerifyData(preVerify=" + result + ", validateID=" + result2 + ", reserveMsisdn=" + result3 + ")";
    }

    public MnpCustomerPreVerifyData(@Nullable Result result, @Nullable Result result2, @Nullable Result result3) {
        this.preVerify = result;
        this.validateID = result2;
        this.reserveMsisdn = result3;
    }

    public /* synthetic */ MnpCustomerPreVerifyData(Result result, Result result2, Result result3, int i, DefaultConstructorMarker defaultConstructorMarker) {
        this((i & 1) != 0 ? null : result, (i & 2) != 0 ? null : result2, (i & 4) != 0 ? null : result3);
    }
}
package th.p047co.dtac.android.dtacone.model.customerenquiry;

import androidx.compose.runtime.internal.StabilityInferred;
import com.google.gson.annotations.SerializedName;
import kotlin.Metadata;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import th.p047co.dtac.android.dtacone.util.Constant;

@StabilityInferred(parameters = 0)
@Metadata(m28851d1 = {"\u0000\"\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0007\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\b\u0087\b\u0018\u00002\u00020\u0001B\u000f\u0012\b\b\u0002\u0010\u0002\u001a\u00020\u0003¢\u0006\u0002\u0010\u0004J\t\u0010\b\u001a\u00020\u0003HÆ\u0003J\u0013\u0010\t\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u0003HÆ\u0001J\u0013\u0010\n\u001a\u00020\u000b2\b\u0010\f\u001a\u0004\u0018\u00010\u0001HÖ\u0003J\t\u0010\r\u001a\u00020\u000eHÖ\u0001J\t\u0010\u000f\u001a\u00020\u0003HÖ\u0001R\u001e\u0010\u0002\u001a\u00020\u00038\u0006@\u0006X\u0087\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u0005\u0010\u0006\"\u0004\b\u0007\u0010\u0004¨\u0006\u0010"}, m28850d2 = {"Lth/co/dtac/android/dtacone/model/customerenquiry/CUSTOMERIDENTIFIER;", "", Constant.OnePostpaidVerifyKey.MSISDN, "", "(Ljava/lang/String;)V", "getMSISDN", "()Ljava/lang/String;", "setMSISDN", "component1", "copy", "equals", "", "other", "hashCode", "", "toString", "app_prodRelease"}, m28849k = 1, m28848mv = {1, 8, 0}, m28846xi = 48)
/* renamed from: th.co.dtac.android.dtacone.model.customerenquiry.CUSTOMERIDENTIFIER */
/* loaded from: classes8.dex */
public final class CUSTOMERIDENTIFIER {
    public static final int $stable = 8;
    @SerializedName("msisdn")
    @NotNull
    private String MSISDN;

    public CUSTOMERIDENTIFIER() {
        this(null, 1, null);
    }

    public static /* synthetic */ CUSTOMERIDENTIFIER copy$default(CUSTOMERIDENTIFIER customeridentifier, String str, int i, Object obj) {
        if ((i & 1) != 0) {
            str = customeridentifier.MSISDN;
        }
        return customeridentifier.copy(str);
    }

    @NotNull
    public final String component1() {
        return this.MSISDN;
    }

    @NotNull
    public final CUSTOMERIDENTIFIER copy(@NotNull String MSISDN) {
        Intrinsics.checkNotNullParameter(MSISDN, "MSISDN");
        return new CUSTOMERIDENTIFIER(MSISDN);
    }

    public boolean equals(@Nullable Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof CUSTOMERIDENTIFIER) && Intrinsics.areEqual(this.MSISDN, ((CUSTOMERIDENTIFIER) obj).MSISDN);
    }

    @NotNull
    public final String getMSISDN() {
        return this.MSISDN;
    }

    public int hashCode() {
        return this.MSISDN.hashCode();
    }

    public final void setMSISDN(@NotNull String str) {
        Intrinsics.checkNotNullParameter(str, "<set-?>");
        this.MSISDN = str;
    }

    @NotNull
    public String toString() {
        String str = this.MSISDN;
        return "CUSTOMERIDENTIFIER(MSISDN=" + str + ")";
    }

    public CUSTOMERIDENTIFIER(@NotNull String MSISDN) {
        Intrinsics.checkNotNullParameter(MSISDN, "MSISDN");
        this.MSISDN = MSISDN;
    }

    public /* synthetic */ CUSTOMERIDENTIFIER(String str, int i, DefaultConstructorMarker defaultConstructorMarker) {
        this((i & 1) != 0 ? "" : str);
    }
}

package th.p047co.dtac.android.dtacone.model.appOne.tol.tolPackage;

import androidx.compose.runtime.internal.StabilityInferred;
import com.google.gson.annotations.SerializedName;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

@StabilityInferred(parameters = 0)
@Metadata(m28851d1 = {"\u0000\"\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0006\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\b\u0087\b\u0018\u00002\u00020\u0001B\r\u0012\u0006\u0010\u0002\u001a\u00020\u0003¢\u0006\u0002\u0010\u0004J\t\u0010\u0007\u001a\u00020\u0003HÆ\u0003J\u0013\u0010\b\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u0003HÆ\u0001J\u0013\u0010\t\u001a\u00020\n2\b\u0010\u000b\u001a\u0004\u0018\u00010\u0001HÖ\u0003J\t\u0010\f\u001a\u00020\rHÖ\u0001J\t\u0010\u000e\u001a\u00020\u0003HÖ\u0001R\u0016\u0010\u0002\u001a\u00020\u00038\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u0005\u0010\u0006¨\u0006\u000f"}, m28850d2 = {"Lth/co/dtac/android/dtacone/model/appOne/tol/tolPackage/Marketing;", "", "marketingCode", "", "(Ljava/lang/String;)V", "getMarketingCode", "()Ljava/lang/String;", "component1", "copy", "equals", "", "other", "hashCode", "", "toString", "app_prodRelease"}, m28849k = 1, m28848mv = {1, 8, 0}, m28846xi = 48)
/* renamed from: th.co.dtac.android.dtacone.model.appOne.tol.tolPackage.Marketing */
/* loaded from: classes8.dex */
public final class Marketing {
    public static final int $stable = 0;
    @SerializedName("marketingCode")
    @NotNull
    private final String marketingCode;

    public Marketing(@NotNull String marketingCode) {
        Intrinsics.checkNotNullParameter(marketingCode, "marketingCode");
        this.marketingCode = marketingCode;
    }

    public static /* synthetic */ Marketing copy$default(Marketing marketing, String str, int i, Object obj) {
        if ((i & 1) != 0) {
            str = marketing.marketingCode;
        }
        return marketing.copy(str);
    }

    @NotNull
    public final String component1() {
        return this.marketingCode;
    }

    @NotNull
    public final Marketing copy(@NotNull String marketingCode) {
        Intrinsics.checkNotNullParameter(marketingCode, "marketingCode");
        return new Marketing(marketingCode);
    }

    public boolean equals(@Nullable Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof Marketing) && Intrinsics.areEqual(this.marketingCode, ((Marketing) obj).marketingCode);
    }

    @NotNull
    public final String getMarketingCode() {
        return this.marketingCode;
    }

    public int hashCode() {
        return this.marketingCode.hashCode();
    }

    @NotNull
    public String toString() {
        String str = this.marketingCode;
        return "Marketing(marketingCode=" + str + ")";
    }
}

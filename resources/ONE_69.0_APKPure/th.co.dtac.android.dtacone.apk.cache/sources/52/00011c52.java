package th.p047co.dtac.android.dtacone.model.appOne.tol.gis;

import androidx.compose.runtime.internal.StabilityInferred;
import androidx.core.app.NotificationCompat;
import com.google.gson.annotations.SerializedName;
import kotlin.Metadata;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

@StabilityInferred(parameters = 0)
@Metadata(m29143d1 = {"\u0000\"\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0012\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\b\u0087\b\u0018\u00002\u00020\u0001B7\u0012\b\b\u0002\u0010\u0002\u001a\u00020\u0003\u0012\b\b\u0002\u0010\u0004\u001a\u00020\u0003\u0012\b\b\u0002\u0010\u0005\u001a\u00020\u0003\u0012\b\b\u0002\u0010\u0006\u001a\u00020\u0003\u0012\b\b\u0002\u0010\u0007\u001a\u00020\u0003¢\u0006\u0002\u0010\bJ\t\u0010\u000f\u001a\u00020\u0003HÆ\u0003J\t\u0010\u0010\u001a\u00020\u0003HÆ\u0003J\t\u0010\u0011\u001a\u00020\u0003HÆ\u0003J\t\u0010\u0012\u001a\u00020\u0003HÆ\u0003J\t\u0010\u0013\u001a\u00020\u0003HÆ\u0003J;\u0010\u0014\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u00032\b\b\u0002\u0010\u0004\u001a\u00020\u00032\b\b\u0002\u0010\u0005\u001a\u00020\u00032\b\b\u0002\u0010\u0006\u001a\u00020\u00032\b\b\u0002\u0010\u0007\u001a\u00020\u0003HÆ\u0001J\u0013\u0010\u0015\u001a\u00020\u00162\b\u0010\u0017\u001a\u0004\u0018\u00010\u0001HÖ\u0003J\t\u0010\u0018\u001a\u00020\u0019HÖ\u0001J\t\u0010\u001a\u001a\u00020\u0003HÖ\u0001R\u0016\u0010\u0006\u001a\u00020\u00038\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b\t\u0010\nR\u0016\u0010\u0004\u001a\u00020\u00038\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u000b\u0010\nR\u0016\u0010\u0005\u001a\u00020\u00038\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b\f\u0010\nR\u0016\u0010\u0002\u001a\u00020\u00038\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b\r\u0010\nR\u0016\u0010\u0007\u001a\u00020\u00038\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u000e\u0010\n¨\u0006\u001b"}, m29142d2 = {"Lth/co/dtac/android/dtacone/model/appOne/tol/gis/GisAuthenticationData;", "", NotificationCompat.CATEGORY_STATUS, "", "resultCode", "resultDesc", "refID", "token", "(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)V", "getRefID", "()Ljava/lang/String;", "getResultCode", "getResultDesc", "getStatus", "getToken", "component1", "component2", "component3", "component4", "component5", "copy", "equals", "", "other", "hashCode", "", "toString", "app_prodRelease"}, m29141k = 1, m29140mv = {1, 8, 0}, m29138xi = 48)
/* renamed from: th.co.dtac.android.dtacone.model.appOne.tol.gis.GisAuthenticationData */
/* loaded from: classes8.dex */
public final class GisAuthenticationData {
    public static final int $stable = 0;
    @SerializedName("refID")
    @NotNull
    private final String refID;
    @SerializedName("resultCode")
    @NotNull
    private final String resultCode;
    @SerializedName("resultDesc")
    @NotNull
    private final String resultDesc;
    @SerializedName(NotificationCompat.CATEGORY_STATUS)
    @NotNull
    private final String status;
    @SerializedName("token")
    @NotNull
    private final String token;

    public GisAuthenticationData() {
        this(null, null, null, null, null, 31, null);
    }

    public static /* synthetic */ GisAuthenticationData copy$default(GisAuthenticationData gisAuthenticationData, String str, String str2, String str3, String str4, String str5, int i, Object obj) {
        if ((i & 1) != 0) {
            str = gisAuthenticationData.status;
        }
        if ((i & 2) != 0) {
            str2 = gisAuthenticationData.resultCode;
        }
        String str6 = str2;
        if ((i & 4) != 0) {
            str3 = gisAuthenticationData.resultDesc;
        }
        String str7 = str3;
        if ((i & 8) != 0) {
            str4 = gisAuthenticationData.refID;
        }
        String str8 = str4;
        if ((i & 16) != 0) {
            str5 = gisAuthenticationData.token;
        }
        return gisAuthenticationData.copy(str, str6, str7, str8, str5);
    }

    @NotNull
    public final String component1() {
        return this.status;
    }

    @NotNull
    public final String component2() {
        return this.resultCode;
    }

    @NotNull
    public final String component3() {
        return this.resultDesc;
    }

    @NotNull
    public final String component4() {
        return this.refID;
    }

    @NotNull
    public final String component5() {
        return this.token;
    }

    @NotNull
    public final GisAuthenticationData copy(@NotNull String status, @NotNull String resultCode, @NotNull String resultDesc, @NotNull String refID, @NotNull String token) {
        Intrinsics.checkNotNullParameter(status, "status");
        Intrinsics.checkNotNullParameter(resultCode, "resultCode");
        Intrinsics.checkNotNullParameter(resultDesc, "resultDesc");
        Intrinsics.checkNotNullParameter(refID, "refID");
        Intrinsics.checkNotNullParameter(token, "token");
        return new GisAuthenticationData(status, resultCode, resultDesc, refID, token);
    }

    public boolean equals(@Nullable Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj instanceof GisAuthenticationData) {
            GisAuthenticationData gisAuthenticationData = (GisAuthenticationData) obj;
            return Intrinsics.areEqual(this.status, gisAuthenticationData.status) && Intrinsics.areEqual(this.resultCode, gisAuthenticationData.resultCode) && Intrinsics.areEqual(this.resultDesc, gisAuthenticationData.resultDesc) && Intrinsics.areEqual(this.refID, gisAuthenticationData.refID) && Intrinsics.areEqual(this.token, gisAuthenticationData.token);
        }
        return false;
    }

    @NotNull
    public final String getRefID() {
        return this.refID;
    }

    @NotNull
    public final String getResultCode() {
        return this.resultCode;
    }

    @NotNull
    public final String getResultDesc() {
        return this.resultDesc;
    }

    @NotNull
    public final String getStatus() {
        return this.status;
    }

    @NotNull
    public final String getToken() {
        return this.token;
    }

    public int hashCode() {
        return (((((((this.status.hashCode() * 31) + this.resultCode.hashCode()) * 31) + this.resultDesc.hashCode()) * 31) + this.refID.hashCode()) * 31) + this.token.hashCode();
    }

    @NotNull
    public String toString() {
        String str = this.status;
        String str2 = this.resultCode;
        String str3 = this.resultDesc;
        String str4 = this.refID;
        String str5 = this.token;
        return "GisAuthenticationData(status=" + str + ", resultCode=" + str2 + ", resultDesc=" + str3 + ", refID=" + str4 + ", token=" + str5 + ")";
    }

    public GisAuthenticationData(@NotNull String status, @NotNull String resultCode, @NotNull String resultDesc, @NotNull String refID, @NotNull String token) {
        Intrinsics.checkNotNullParameter(status, "status");
        Intrinsics.checkNotNullParameter(resultCode, "resultCode");
        Intrinsics.checkNotNullParameter(resultDesc, "resultDesc");
        Intrinsics.checkNotNullParameter(refID, "refID");
        Intrinsics.checkNotNullParameter(token, "token");
        this.status = status;
        this.resultCode = resultCode;
        this.resultDesc = resultDesc;
        this.refID = refID;
        this.token = token;
    }

    public /* synthetic */ GisAuthenticationData(String str, String str2, String str3, String str4, String str5, int i, DefaultConstructorMarker defaultConstructorMarker) {
        this((i & 1) != 0 ? "" : str, (i & 2) != 0 ? "" : str2, (i & 4) != 0 ? "" : str3, (i & 8) != 0 ? "" : str4, (i & 16) != 0 ? "" : str5);
    }
}
package th.p047co.dtac.android.dtacone.model.device_sale;

import androidx.compose.runtime.internal.StabilityInferred;
import com.google.gson.annotations.SerializedName;
import kotlin.Metadata;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

@StabilityInferred(parameters = 0)
@Metadata(m29143d1 = {"\u0000\"\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u000f\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\b\u0087\b\u0018\u00002\u00020\u0001B5\u0012\n\b\u0002\u0010\u0002\u001a\u0004\u0018\u00010\u0003\u0012\n\b\u0002\u0010\u0004\u001a\u0004\u0018\u00010\u0003\u0012\n\b\u0002\u0010\u0005\u001a\u0004\u0018\u00010\u0003\u0012\n\b\u0002\u0010\u0006\u001a\u0004\u0018\u00010\u0003¢\u0006\u0002\u0010\u0007J\u000b\u0010\r\u001a\u0004\u0018\u00010\u0003HÆ\u0003J\u000b\u0010\u000e\u001a\u0004\u0018\u00010\u0003HÆ\u0003J\u000b\u0010\u000f\u001a\u0004\u0018\u00010\u0003HÆ\u0003J\u000b\u0010\u0010\u001a\u0004\u0018\u00010\u0003HÆ\u0003J9\u0010\u0011\u001a\u00020\u00002\n\b\u0002\u0010\u0002\u001a\u0004\u0018\u00010\u00032\n\b\u0002\u0010\u0004\u001a\u0004\u0018\u00010\u00032\n\b\u0002\u0010\u0005\u001a\u0004\u0018\u00010\u00032\n\b\u0002\u0010\u0006\u001a\u0004\u0018\u00010\u0003HÆ\u0001J\u0013\u0010\u0012\u001a\u00020\u00132\b\u0010\u0014\u001a\u0004\u0018\u00010\u0001HÖ\u0003J\t\u0010\u0015\u001a\u00020\u0016HÖ\u0001J\t\u0010\u0017\u001a\u00020\u0003HÖ\u0001R\u0018\u0010\u0002\u001a\u0004\u0018\u00010\u00038\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b\b\u0010\tR\u0018\u0010\u0004\u001a\u0004\u0018\u00010\u00038\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b\n\u0010\tR\u0018\u0010\u0005\u001a\u0004\u0018\u00010\u00038\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u000b\u0010\tR\u0018\u0010\u0006\u001a\u0004\u0018\u00010\u00038\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b\f\u0010\t¨\u0006\u0018"}, m29142d2 = {"Lth/co/dtac/android/dtacone/model/device_sale/AddOverruleRequest;", "", "idCardNumber", "", "userCode", "userFormatType", "userLan", "(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)V", "getIdCardNumber", "()Ljava/lang/String;", "getUserCode", "getUserFormatType", "getUserLan", "component1", "component2", "component3", "component4", "copy", "equals", "", "other", "hashCode", "", "toString", "app_prodRelease"}, m29141k = 1, m29140mv = {1, 8, 0}, m29138xi = 48)
/* renamed from: th.co.dtac.android.dtacone.model.device_sale.AddOverruleRequest */
/* loaded from: classes8.dex */
public final class AddOverruleRequest {
    public static final int $stable = 0;
    @SerializedName("idCardNumber")
    @Nullable
    private final String idCardNumber;
    @SerializedName("userCode")
    @Nullable
    private final String userCode;
    @SerializedName("userFormatType")
    @Nullable
    private final String userFormatType;
    @SerializedName("userLan")
    @Nullable
    private final String userLan;

    public AddOverruleRequest() {
        this(null, null, null, null, 15, null);
    }

    public static /* synthetic */ AddOverruleRequest copy$default(AddOverruleRequest addOverruleRequest, String str, String str2, String str3, String str4, int i, Object obj) {
        if ((i & 1) != 0) {
            str = addOverruleRequest.idCardNumber;
        }
        if ((i & 2) != 0) {
            str2 = addOverruleRequest.userCode;
        }
        if ((i & 4) != 0) {
            str3 = addOverruleRequest.userFormatType;
        }
        if ((i & 8) != 0) {
            str4 = addOverruleRequest.userLan;
        }
        return addOverruleRequest.copy(str, str2, str3, str4);
    }

    @Nullable
    public final String component1() {
        return this.idCardNumber;
    }

    @Nullable
    public final String component2() {
        return this.userCode;
    }

    @Nullable
    public final String component3() {
        return this.userFormatType;
    }

    @Nullable
    public final String component4() {
        return this.userLan;
    }

    @NotNull
    public final AddOverruleRequest copy(@Nullable String str, @Nullable String str2, @Nullable String str3, @Nullable String str4) {
        return new AddOverruleRequest(str, str2, str3, str4);
    }

    public boolean equals(@Nullable Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj instanceof AddOverruleRequest) {
            AddOverruleRequest addOverruleRequest = (AddOverruleRequest) obj;
            return Intrinsics.areEqual(this.idCardNumber, addOverruleRequest.idCardNumber) && Intrinsics.areEqual(this.userCode, addOverruleRequest.userCode) && Intrinsics.areEqual(this.userFormatType, addOverruleRequest.userFormatType) && Intrinsics.areEqual(this.userLan, addOverruleRequest.userLan);
        }
        return false;
    }

    @Nullable
    public final String getIdCardNumber() {
        return this.idCardNumber;
    }

    @Nullable
    public final String getUserCode() {
        return this.userCode;
    }

    @Nullable
    public final String getUserFormatType() {
        return this.userFormatType;
    }

    @Nullable
    public final String getUserLan() {
        return this.userLan;
    }

    public int hashCode() {
        String str = this.idCardNumber;
        int hashCode = (str == null ? 0 : str.hashCode()) * 31;
        String str2 = this.userCode;
        int hashCode2 = (hashCode + (str2 == null ? 0 : str2.hashCode())) * 31;
        String str3 = this.userFormatType;
        int hashCode3 = (hashCode2 + (str3 == null ? 0 : str3.hashCode())) * 31;
        String str4 = this.userLan;
        return hashCode3 + (str4 != null ? str4.hashCode() : 0);
    }

    @NotNull
    public String toString() {
        String str = this.idCardNumber;
        String str2 = this.userCode;
        String str3 = this.userFormatType;
        String str4 = this.userLan;
        return "AddOverruleRequest(idCardNumber=" + str + ", userCode=" + str2 + ", userFormatType=" + str3 + ", userLan=" + str4 + ")";
    }

    public AddOverruleRequest(@Nullable String str, @Nullable String str2, @Nullable String str3, @Nullable String str4) {
        this.idCardNumber = str;
        this.userCode = str2;
        this.userFormatType = str3;
        this.userLan = str4;
    }

    public /* synthetic */ AddOverruleRequest(String str, String str2, String str3, String str4, int i, DefaultConstructorMarker defaultConstructorMarker) {
        this((i & 1) != 0 ? null : str, (i & 2) != 0 ? null : str2, (i & 4) != 0 ? null : str3, (i & 8) != 0 ? null : str4);
    }
}
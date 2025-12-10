package th.p047co.dtac.android.dtacone.model.appOne.mnp.request;

import androidx.compose.runtime.internal.StabilityInferred;
import com.google.gson.annotations.SerializedName;
import kotlin.Metadata;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

@StabilityInferred(parameters = 0)
@Metadata(m28851d1 = {"\u0000\"\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000e\n\u0002\b\f\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\b\u0087\b\u0018\u00002\u00020\u0001B)\u0012\n\b\u0002\u0010\u0002\u001a\u0004\u0018\u00010\u0003\u0012\n\b\u0002\u0010\u0004\u001a\u0004\u0018\u00010\u0003\u0012\n\b\u0002\u0010\u0005\u001a\u0004\u0018\u00010\u0003¢\u0006\u0002\u0010\u0006J\u000b\u0010\u000b\u001a\u0004\u0018\u00010\u0003HÆ\u0003J\u000b\u0010\f\u001a\u0004\u0018\u00010\u0003HÆ\u0003J\u000b\u0010\r\u001a\u0004\u0018\u00010\u0003HÆ\u0003J-\u0010\u000e\u001a\u00020\u00002\n\b\u0002\u0010\u0002\u001a\u0004\u0018\u00010\u00032\n\b\u0002\u0010\u0004\u001a\u0004\u0018\u00010\u00032\n\b\u0002\u0010\u0005\u001a\u0004\u0018\u00010\u0003HÆ\u0001J\u0013\u0010\u000f\u001a\u00020\u00102\b\u0010\u0011\u001a\u0004\u0018\u00010\u0001HÖ\u0003J\t\u0010\u0012\u001a\u00020\u0013HÖ\u0001J\t\u0010\u0014\u001a\u00020\u0003HÖ\u0001R\u0018\u0010\u0002\u001a\u0004\u0018\u00010\u00038\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u0007\u0010\bR\u0018\u0010\u0004\u001a\u0004\u0018\u00010\u00038\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b\t\u0010\bR\u0018\u0010\u0005\u001a\u0004\u0018\u00010\u00038\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b\n\u0010\b¨\u0006\u0015"}, m28850d2 = {"Lth/co/dtac/android/dtacone/model/appOne/mnp/request/OneMnpCustomerPreVerifyRequest;", "", "flow", "", "identityNumber", "identityType", "(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)V", "getFlow", "()Ljava/lang/String;", "getIdentityNumber", "getIdentityType", "component1", "component2", "component3", "copy", "equals", "", "other", "hashCode", "", "toString", "app_prodRelease"}, m28849k = 1, m28848mv = {1, 8, 0}, m28846xi = 48)
/* renamed from: th.co.dtac.android.dtacone.model.appOne.mnp.request.OneMnpCustomerPreVerifyRequest */
/* loaded from: classes8.dex */
public final class OneMnpCustomerPreVerifyRequest {
    public static final int $stable = 0;
    @SerializedName("flow")
    @Nullable
    private final String flow;
    @SerializedName("identityNumber")
    @Nullable
    private final String identityNumber;
    @SerializedName("identityType")
    @Nullable
    private final String identityType;

    public OneMnpCustomerPreVerifyRequest() {
        this(null, null, null, 7, null);
    }

    public static /* synthetic */ OneMnpCustomerPreVerifyRequest copy$default(OneMnpCustomerPreVerifyRequest oneMnpCustomerPreVerifyRequest, String str, String str2, String str3, int i, Object obj) {
        if ((i & 1) != 0) {
            str = oneMnpCustomerPreVerifyRequest.flow;
        }
        if ((i & 2) != 0) {
            str2 = oneMnpCustomerPreVerifyRequest.identityNumber;
        }
        if ((i & 4) != 0) {
            str3 = oneMnpCustomerPreVerifyRequest.identityType;
        }
        return oneMnpCustomerPreVerifyRequest.copy(str, str2, str3);
    }

    @Nullable
    public final String component1() {
        return this.flow;
    }

    @Nullable
    public final String component2() {
        return this.identityNumber;
    }

    @Nullable
    public final String component3() {
        return this.identityType;
    }

    @NotNull
    public final OneMnpCustomerPreVerifyRequest copy(@Nullable String str, @Nullable String str2, @Nullable String str3) {
        return new OneMnpCustomerPreVerifyRequest(str, str2, str3);
    }

    public boolean equals(@Nullable Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj instanceof OneMnpCustomerPreVerifyRequest) {
            OneMnpCustomerPreVerifyRequest oneMnpCustomerPreVerifyRequest = (OneMnpCustomerPreVerifyRequest) obj;
            return Intrinsics.areEqual(this.flow, oneMnpCustomerPreVerifyRequest.flow) && Intrinsics.areEqual(this.identityNumber, oneMnpCustomerPreVerifyRequest.identityNumber) && Intrinsics.areEqual(this.identityType, oneMnpCustomerPreVerifyRequest.identityType);
        }
        return false;
    }

    @Nullable
    public final String getFlow() {
        return this.flow;
    }

    @Nullable
    public final String getIdentityNumber() {
        return this.identityNumber;
    }

    @Nullable
    public final String getIdentityType() {
        return this.identityType;
    }

    public int hashCode() {
        String str = this.flow;
        int hashCode = (str == null ? 0 : str.hashCode()) * 31;
        String str2 = this.identityNumber;
        int hashCode2 = (hashCode + (str2 == null ? 0 : str2.hashCode())) * 31;
        String str3 = this.identityType;
        return hashCode2 + (str3 != null ? str3.hashCode() : 0);
    }

    @NotNull
    public String toString() {
        String str = this.flow;
        String str2 = this.identityNumber;
        String str3 = this.identityType;
        return "OneMnpCustomerPreVerifyRequest(flow=" + str + ", identityNumber=" + str2 + ", identityType=" + str3 + ")";
    }

    public OneMnpCustomerPreVerifyRequest(@Nullable String str, @Nullable String str2, @Nullable String str3) {
        this.flow = str;
        this.identityNumber = str2;
        this.identityType = str3;
    }

    public /* synthetic */ OneMnpCustomerPreVerifyRequest(String str, String str2, String str3, int i, DefaultConstructorMarker defaultConstructorMarker) {
        this((i & 1) != 0 ? null : str, (i & 2) != 0 ? null : str2, (i & 4) != 0 ? null : str3);
    }
}

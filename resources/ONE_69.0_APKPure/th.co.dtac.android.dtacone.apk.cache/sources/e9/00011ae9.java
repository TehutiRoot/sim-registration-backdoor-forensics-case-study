package th.p047co.dtac.android.dtacone.model.appOne.onlineRegister.request;

import androidx.compose.runtime.internal.StabilityInferred;
import com.google.gson.annotations.SerializedName;
import kotlin.Metadata;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

@StabilityInferred(parameters = 0)
@Metadata(m29143d1 = {"\u0000\"\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0010\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\b\u0087\b\u0018\u00002\u00020\u0001B)\u0012\n\b\u0002\u0010\u0002\u001a\u0004\u0018\u00010\u0003\u0012\n\b\u0002\u0010\u0004\u001a\u0004\u0018\u00010\u0003\u0012\n\b\u0002\u0010\u0005\u001a\u0004\u0018\u00010\u0003¢\u0006\u0002\u0010\u0006J\u000b\u0010\u000f\u001a\u0004\u0018\u00010\u0003HÆ\u0003J\u000b\u0010\u0010\u001a\u0004\u0018\u00010\u0003HÆ\u0003J\u000b\u0010\u0011\u001a\u0004\u0018\u00010\u0003HÆ\u0003J-\u0010\u0012\u001a\u00020\u00002\n\b\u0002\u0010\u0002\u001a\u0004\u0018\u00010\u00032\n\b\u0002\u0010\u0004\u001a\u0004\u0018\u00010\u00032\n\b\u0002\u0010\u0005\u001a\u0004\u0018\u00010\u0003HÆ\u0001J\u0013\u0010\u0013\u001a\u00020\u00142\b\u0010\u0015\u001a\u0004\u0018\u00010\u0001HÖ\u0003J\t\u0010\u0016\u001a\u00020\u0017HÖ\u0001J\t\u0010\u0018\u001a\u00020\u0003HÖ\u0001R \u0010\u0004\u001a\u0004\u0018\u00010\u00038\u0006@\u0006X\u0087\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u0007\u0010\b\"\u0004\b\t\u0010\nR \u0010\u0005\u001a\u0004\u0018\u00010\u00038\u0006@\u0006X\u0087\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u000b\u0010\b\"\u0004\b\f\u0010\nR \u0010\u0002\u001a\u0004\u0018\u00010\u00038\u0006@\u0006X\u0087\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\r\u0010\b\"\u0004\b\u000e\u0010\n¨\u0006\u0019"}, m29142d2 = {"Lth/co/dtac/android/dtacone/model/appOne/onlineRegister/request/PartnerErefillSim;", "", "userLname", "", "simMsisdn", "userFname", "(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)V", "getSimMsisdn", "()Ljava/lang/String;", "setSimMsisdn", "(Ljava/lang/String;)V", "getUserFname", "setUserFname", "getUserLname", "setUserLname", "component1", "component2", "component3", "copy", "equals", "", "other", "hashCode", "", "toString", "app_prodRelease"}, m29141k = 1, m29140mv = {1, 8, 0}, m29138xi = 48)
/* renamed from: th.co.dtac.android.dtacone.model.appOne.onlineRegister.request.PartnerErefillSim */
/* loaded from: classes8.dex */
public final class PartnerErefillSim {
    public static final int $stable = 8;
    @SerializedName("simMsisdn")
    @Nullable
    private String simMsisdn;
    @SerializedName("userFname")
    @Nullable
    private String userFname;
    @SerializedName("userLname")
    @Nullable
    private String userLname;

    public PartnerErefillSim() {
        this(null, null, null, 7, null);
    }

    public static /* synthetic */ PartnerErefillSim copy$default(PartnerErefillSim partnerErefillSim, String str, String str2, String str3, int i, Object obj) {
        if ((i & 1) != 0) {
            str = partnerErefillSim.userLname;
        }
        if ((i & 2) != 0) {
            str2 = partnerErefillSim.simMsisdn;
        }
        if ((i & 4) != 0) {
            str3 = partnerErefillSim.userFname;
        }
        return partnerErefillSim.copy(str, str2, str3);
    }

    @Nullable
    public final String component1() {
        return this.userLname;
    }

    @Nullable
    public final String component2() {
        return this.simMsisdn;
    }

    @Nullable
    public final String component3() {
        return this.userFname;
    }

    @NotNull
    public final PartnerErefillSim copy(@Nullable String str, @Nullable String str2, @Nullable String str3) {
        return new PartnerErefillSim(str, str2, str3);
    }

    public boolean equals(@Nullable Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj instanceof PartnerErefillSim) {
            PartnerErefillSim partnerErefillSim = (PartnerErefillSim) obj;
            return Intrinsics.areEqual(this.userLname, partnerErefillSim.userLname) && Intrinsics.areEqual(this.simMsisdn, partnerErefillSim.simMsisdn) && Intrinsics.areEqual(this.userFname, partnerErefillSim.userFname);
        }
        return false;
    }

    @Nullable
    public final String getSimMsisdn() {
        return this.simMsisdn;
    }

    @Nullable
    public final String getUserFname() {
        return this.userFname;
    }

    @Nullable
    public final String getUserLname() {
        return this.userLname;
    }

    public int hashCode() {
        String str = this.userLname;
        int hashCode = (str == null ? 0 : str.hashCode()) * 31;
        String str2 = this.simMsisdn;
        int hashCode2 = (hashCode + (str2 == null ? 0 : str2.hashCode())) * 31;
        String str3 = this.userFname;
        return hashCode2 + (str3 != null ? str3.hashCode() : 0);
    }

    public final void setSimMsisdn(@Nullable String str) {
        this.simMsisdn = str;
    }

    public final void setUserFname(@Nullable String str) {
        this.userFname = str;
    }

    public final void setUserLname(@Nullable String str) {
        this.userLname = str;
    }

    @NotNull
    public String toString() {
        String str = this.userLname;
        String str2 = this.simMsisdn;
        String str3 = this.userFname;
        return "PartnerErefillSim(userLname=" + str + ", simMsisdn=" + str2 + ", userFname=" + str3 + ")";
    }

    public PartnerErefillSim(@Nullable String str, @Nullable String str2, @Nullable String str3) {
        this.userLname = str;
        this.simMsisdn = str2;
        this.userFname = str3;
    }

    public /* synthetic */ PartnerErefillSim(String str, String str2, String str3, int i, DefaultConstructorMarker defaultConstructorMarker) {
        this((i & 1) != 0 ? null : str, (i & 2) != 0 ? null : str2, (i & 4) != 0 ? null : str3);
    }
}
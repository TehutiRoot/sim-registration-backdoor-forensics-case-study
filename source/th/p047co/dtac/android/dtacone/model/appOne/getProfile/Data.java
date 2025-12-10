package th.p047co.dtac.android.dtacone.model.appOne.getProfile;

import androidx.compose.runtime.internal.StabilityInferred;
import com.google.gson.annotations.SerializedName;
import kotlin.Metadata;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

@StabilityInferred(parameters = 0)
@Metadata(m28851d1 = {"\u0000&\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0014\n\u0002\u0010\u000b\n\u0002\b\u0004\b\u0087\b\u0018\u00002\u00020\u0001BA\u0012\n\b\u0002\u0010\u0002\u001a\u0004\u0018\u00010\u0003\u0012\n\b\u0002\u0010\u0004\u001a\u0004\u0018\u00010\u0005\u0012\n\b\u0002\u0010\u0006\u001a\u0004\u0018\u00010\u0007\u0012\n\b\u0002\u0010\b\u001a\u0004\u0018\u00010\u0003\u0012\n\b\u0002\u0010\t\u001a\u0004\u0018\u00010\u0007¢\u0006\u0002\u0010\nJ\u000b\u0010\u0014\u001a\u0004\u0018\u00010\u0003HÆ\u0003J\u0010\u0010\u0015\u001a\u0004\u0018\u00010\u0005HÆ\u0003¢\u0006\u0002\u0010\u000eJ\u000b\u0010\u0016\u001a\u0004\u0018\u00010\u0007HÆ\u0003J\u000b\u0010\u0017\u001a\u0004\u0018\u00010\u0003HÆ\u0003J\u000b\u0010\u0018\u001a\u0004\u0018\u00010\u0007HÆ\u0003JJ\u0010\u0019\u001a\u00020\u00002\n\b\u0002\u0010\u0002\u001a\u0004\u0018\u00010\u00032\n\b\u0002\u0010\u0004\u001a\u0004\u0018\u00010\u00052\n\b\u0002\u0010\u0006\u001a\u0004\u0018\u00010\u00072\n\b\u0002\u0010\b\u001a\u0004\u0018\u00010\u00032\n\b\u0002\u0010\t\u001a\u0004\u0018\u00010\u0007HÆ\u0001¢\u0006\u0002\u0010\u001aJ\u0013\u0010\u001b\u001a\u00020\u001c2\b\u0010\u001d\u001a\u0004\u0018\u00010\u0001HÖ\u0003J\t\u0010\u001e\u001a\u00020\u0005HÖ\u0001J\t\u0010\u001f\u001a\u00020\u0007HÖ\u0001R\u0018\u0010\b\u001a\u0004\u0018\u00010\u00038\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u000b\u0010\fR\u001a\u0010\u0004\u001a\u0004\u0018\u00010\u00058\u0006X\u0087\u0004¢\u0006\n\n\u0002\u0010\u000f\u001a\u0004\b\r\u0010\u000eR\u0018\u0010\t\u001a\u0004\u0018\u00010\u00078\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u0010\u0010\u0011R\u0018\u0010\u0002\u001a\u0004\u0018\u00010\u00038\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u0012\u0010\fR\u0018\u0010\u0006\u001a\u0004\u0018\u00010\u00078\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u0013\u0010\u0011¨\u0006 "}, m28850d2 = {"Lth/co/dtac/android/dtacone/model/appOne/getProfile/Data;", "", "trueCompany", "Lth/co/dtac/android/dtacone/model/appOne/getProfile/Company;", "id", "", "userType", "", "dtacCompany", "promoterId", "(Lth/co/dtac/android/dtacone/model/appOne/getProfile/Company;Ljava/lang/Integer;Ljava/lang/String;Lth/co/dtac/android/dtacone/model/appOne/getProfile/Company;Ljava/lang/String;)V", "getDtacCompany", "()Lth/co/dtac/android/dtacone/model/appOne/getProfile/Company;", "getId", "()Ljava/lang/Integer;", "Ljava/lang/Integer;", "getPromoterId", "()Ljava/lang/String;", "getTrueCompany", "getUserType", "component1", "component2", "component3", "component4", "component5", "copy", "(Lth/co/dtac/android/dtacone/model/appOne/getProfile/Company;Ljava/lang/Integer;Ljava/lang/String;Lth/co/dtac/android/dtacone/model/appOne/getProfile/Company;Ljava/lang/String;)Lth/co/dtac/android/dtacone/model/appOne/getProfile/Data;", "equals", "", "other", "hashCode", "toString", "app_prodRelease"}, m28849k = 1, m28848mv = {1, 8, 0}, m28846xi = 48)
/* renamed from: th.co.dtac.android.dtacone.model.appOne.getProfile.Data */
/* loaded from: classes8.dex */
public final class Data {
    public static final int $stable = 8;
    @SerializedName("dtac")
    @Nullable
    private final Company dtacCompany;
    @SerializedName("id")
    @Nullable

    /* renamed from: id */
    private final Integer f85051id;
    @SerializedName("promoterId")
    @Nullable
    private final String promoterId;
    @SerializedName("true")
    @Nullable
    private final Company trueCompany;
    @SerializedName("userType")
    @Nullable
    private final String userType;

    public Data() {
        this(null, null, null, null, null, 31, null);
    }

    public static /* synthetic */ Data copy$default(Data data, Company company, Integer num, String str, Company company2, String str2, int i, Object obj) {
        if ((i & 1) != 0) {
            company = data.trueCompany;
        }
        if ((i & 2) != 0) {
            num = data.f85051id;
        }
        Integer num2 = num;
        if ((i & 4) != 0) {
            str = data.userType;
        }
        String str3 = str;
        if ((i & 8) != 0) {
            company2 = data.dtacCompany;
        }
        Company company3 = company2;
        if ((i & 16) != 0) {
            str2 = data.promoterId;
        }
        return data.copy(company, num2, str3, company3, str2);
    }

    @Nullable
    public final Company component1() {
        return this.trueCompany;
    }

    @Nullable
    public final Integer component2() {
        return this.f85051id;
    }

    @Nullable
    public final String component3() {
        return this.userType;
    }

    @Nullable
    public final Company component4() {
        return this.dtacCompany;
    }

    @Nullable
    public final String component5() {
        return this.promoterId;
    }

    @NotNull
    public final Data copy(@Nullable Company company, @Nullable Integer num, @Nullable String str, @Nullable Company company2, @Nullable String str2) {
        return new Data(company, num, str, company2, str2);
    }

    public boolean equals(@Nullable Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj instanceof Data) {
            Data data = (Data) obj;
            return Intrinsics.areEqual(this.trueCompany, data.trueCompany) && Intrinsics.areEqual(this.f85051id, data.f85051id) && Intrinsics.areEqual(this.userType, data.userType) && Intrinsics.areEqual(this.dtacCompany, data.dtacCompany) && Intrinsics.areEqual(this.promoterId, data.promoterId);
        }
        return false;
    }

    @Nullable
    public final Company getDtacCompany() {
        return this.dtacCompany;
    }

    @Nullable
    public final Integer getId() {
        return this.f85051id;
    }

    @Nullable
    public final String getPromoterId() {
        return this.promoterId;
    }

    @Nullable
    public final Company getTrueCompany() {
        return this.trueCompany;
    }

    @Nullable
    public final String getUserType() {
        return this.userType;
    }

    public int hashCode() {
        Company company = this.trueCompany;
        int hashCode = (company == null ? 0 : company.hashCode()) * 31;
        Integer num = this.f85051id;
        int hashCode2 = (hashCode + (num == null ? 0 : num.hashCode())) * 31;
        String str = this.userType;
        int hashCode3 = (hashCode2 + (str == null ? 0 : str.hashCode())) * 31;
        Company company2 = this.dtacCompany;
        int hashCode4 = (hashCode3 + (company2 == null ? 0 : company2.hashCode())) * 31;
        String str2 = this.promoterId;
        return hashCode4 + (str2 != null ? str2.hashCode() : 0);
    }

    @NotNull
    public String toString() {
        Company company = this.trueCompany;
        Integer num = this.f85051id;
        String str = this.userType;
        Company company2 = this.dtacCompany;
        String str2 = this.promoterId;
        return "Data(trueCompany=" + company + ", id=" + num + ", userType=" + str + ", dtacCompany=" + company2 + ", promoterId=" + str2 + ")";
    }

    public Data(@Nullable Company company, @Nullable Integer num, @Nullable String str, @Nullable Company company2, @Nullable String str2) {
        this.trueCompany = company;
        this.f85051id = num;
        this.userType = str;
        this.dtacCompany = company2;
        this.promoterId = str2;
    }

    public /* synthetic */ Data(Company company, Integer num, String str, Company company2, String str2, int i, DefaultConstructorMarker defaultConstructorMarker) {
        this((i & 1) != 0 ? null : company, (i & 2) != 0 ? null : num, (i & 4) != 0 ? null : str, (i & 8) != 0 ? null : company2, (i & 16) != 0 ? null : str2);
    }
}

package th.p047co.dtac.android.dtacone.model.postpaid.save_postpaid;

import androidx.compose.runtime.internal.StabilityInferred;
import com.google.firebase.remoteconfig.RemoteConfigConstants;
import com.google.gson.annotations.SerializedName;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

@StabilityInferred(parameters = 0)
@Metadata(m29143d1 = {"\u0000\u0012\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0018\b\u0007\u0018\u00002\u00020\u0001Bo\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0003\u0012\b\u0010\u0005\u001a\u0004\u0018\u00010\u0003\u0012\b\u0010\u0006\u001a\u0004\u0018\u00010\u0003\u0012\b\u0010\u0007\u001a\u0004\u0018\u00010\u0003\u0012\b\u0010\b\u001a\u0004\u0018\u00010\u0003\u0012\b\u0010\t\u001a\u0004\u0018\u00010\u0003\u0012\b\u0010\n\u001a\u0004\u0018\u00010\u0003\u0012\b\u0010\u000b\u001a\u0004\u0018\u00010\u0003\u0012\b\u0010\f\u001a\u0004\u0018\u00010\u0003\u0012\b\u0010\r\u001a\u0004\u0018\u00010\u0003¢\u0006\u0002\u0010\u000eR\u0016\u0010\u0002\u001a\u00020\u00038\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u000f\u0010\u0010R\u0018\u0010\u0006\u001a\u0004\u0018\u00010\u00038\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u0011\u0010\u0010R\u0018\u0010\n\u001a\u0004\u0018\u00010\u00038\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u0012\u0010\u0010R\u0018\u0010\u000b\u001a\u0004\u0018\u00010\u00038\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u0013\u0010\u0010R\u0018\u0010\b\u001a\u0004\u0018\u00010\u00038\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u0014\u0010\u0010R\u0018\u0010\t\u001a\u0004\u0018\u00010\u00038\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u0015\u0010\u0010R\u0016\u0010\u0004\u001a\u00020\u00038\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u0016\u0010\u0010R\u0018\u0010\u0005\u001a\u0004\u0018\u00010\u00038\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u0017\u0010\u0010R\u0018\u0010\f\u001a\u0004\u0018\u00010\u00038\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u0018\u0010\u0010R\u0018\u0010\r\u001a\u0004\u0018\u00010\u00038\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u0019\u0010\u0010R\u0018\u0010\u0007\u001a\u0004\u0018\u00010\u00038\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u001a\u0010\u0010¨\u0006\u001b"}, m29142d2 = {"Lth/co/dtac/android/dtacone/model/postpaid/save_postpaid/SaveLegalAddress;", "", RemoteConfigConstants.RequestFieldKey.COUNTRY_CODE, "", "provinceCode", "provinceName", "district", "subDistrict", "postCode", "postCodeSeqn", "houseNo", "moo", "road", "soi", "(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)V", "getCountryCode", "()Ljava/lang/String;", "getDistrict", "getHouseNo", "getMoo", "getPostCode", "getPostCodeSeqn", "getProvinceCode", "getProvinceName", "getRoad", "getSoi", "getSubDistrict", "app_prodRelease"}, m29141k = 1, m29140mv = {1, 8, 0}, m29138xi = 48)
/* renamed from: th.co.dtac.android.dtacone.model.postpaid.save_postpaid.SaveLegalAddress */
/* loaded from: classes8.dex */
public final class SaveLegalAddress {
    public static final int $stable = 0;
    @SerializedName(RemoteConfigConstants.RequestFieldKey.COUNTRY_CODE)
    @NotNull
    private final String countryCode;
    @SerializedName("district")
    @Nullable
    private final String district;
    @SerializedName("houseNo")
    @Nullable
    private final String houseNo;
    @SerializedName("moo")
    @Nullable
    private final String moo;
    @SerializedName("postCode")
    @Nullable
    private final String postCode;
    @SerializedName("postCodeSeqn")
    @Nullable
    private final String postCodeSeqn;
    @SerializedName("provinceCode")
    @NotNull
    private final String provinceCode;
    @SerializedName("provinceName")
    @Nullable
    private final String provinceName;
    @SerializedName("road")
    @Nullable
    private final String road;
    @SerializedName("soi")
    @Nullable
    private final String soi;
    @SerializedName("subDistrict")
    @Nullable
    private final String subDistrict;

    public SaveLegalAddress(@NotNull String countryCode, @NotNull String provinceCode, @Nullable String str, @Nullable String str2, @Nullable String str3, @Nullable String str4, @Nullable String str5, @Nullable String str6, @Nullable String str7, @Nullable String str8, @Nullable String str9) {
        Intrinsics.checkNotNullParameter(countryCode, "countryCode");
        Intrinsics.checkNotNullParameter(provinceCode, "provinceCode");
        this.countryCode = countryCode;
        this.provinceCode = provinceCode;
        this.provinceName = str;
        this.district = str2;
        this.subDistrict = str3;
        this.postCode = str4;
        this.postCodeSeqn = str5;
        this.houseNo = str6;
        this.moo = str7;
        this.road = str8;
        this.soi = str9;
    }

    @NotNull
    public final String getCountryCode() {
        return this.countryCode;
    }

    @Nullable
    public final String getDistrict() {
        return this.district;
    }

    @Nullable
    public final String getHouseNo() {
        return this.houseNo;
    }

    @Nullable
    public final String getMoo() {
        return this.moo;
    }

    @Nullable
    public final String getPostCode() {
        return this.postCode;
    }

    @Nullable
    public final String getPostCodeSeqn() {
        return this.postCodeSeqn;
    }

    @NotNull
    public final String getProvinceCode() {
        return this.provinceCode;
    }

    @Nullable
    public final String getProvinceName() {
        return this.provinceName;
    }

    @Nullable
    public final String getRoad() {
        return this.road;
    }

    @Nullable
    public final String getSoi() {
        return this.soi;
    }

    @Nullable
    public final String getSubDistrict() {
        return this.subDistrict;
    }
}
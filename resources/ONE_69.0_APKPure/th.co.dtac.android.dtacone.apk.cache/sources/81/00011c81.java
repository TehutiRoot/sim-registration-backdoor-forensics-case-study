package th.p047co.dtac.android.dtacone.model.appOne.tol.tolPackage;

import androidx.compose.runtime.internal.StabilityInferred;
import com.google.gson.annotations.SerializedName;
import java.util.Date;
import java.util.List;
import kotlin.Metadata;
import kotlin.collections.CollectionsKt__CollectionsKt;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import th.p047co.dtac.android.dtacone.extension.format.DateFormatExtKt;
import th.p047co.dtac.android.dtacone.util.Constant;

@StabilityInferred(parameters = 0)
@Metadata(m29143d1 = {"\u00002\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0004\n\u0002\u0010 \n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0014\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0003\b\u0087\b\u0018\u0000 %2\u00020\u0001:\u0001%BQ\u0012\b\b\u0002\u0010\u0002\u001a\u00020\u0003\u0012\b\b\u0002\u0010\u0004\u001a\u00020\u0003\u0012\b\b\u0002\u0010\u0005\u001a\u00020\u0003\u0012\b\b\u0002\u0010\u0006\u001a\u00020\u0003\u0012\u000e\b\u0002\u0010\u0007\u001a\b\u0012\u0004\u0012\u00020\u00030\b\u0012\b\b\u0002\u0010\t\u001a\u00020\u0003\u0012\b\b\u0002\u0010\n\u001a\u00020\u000b¢\u0006\u0002\u0010\fJ\t\u0010\u0017\u001a\u00020\u0003HÆ\u0003J\t\u0010\u0018\u001a\u00020\u0003HÆ\u0003J\t\u0010\u0019\u001a\u00020\u0003HÆ\u0003J\t\u0010\u001a\u001a\u00020\u0003HÆ\u0003J\u000f\u0010\u001b\u001a\b\u0012\u0004\u0012\u00020\u00030\bHÆ\u0003J\t\u0010\u001c\u001a\u00020\u0003HÆ\u0003J\t\u0010\u001d\u001a\u00020\u000bHÆ\u0003JU\u0010\u001e\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u00032\b\b\u0002\u0010\u0004\u001a\u00020\u00032\b\b\u0002\u0010\u0005\u001a\u00020\u00032\b\b\u0002\u0010\u0006\u001a\u00020\u00032\u000e\b\u0002\u0010\u0007\u001a\b\u0012\u0004\u0012\u00020\u00030\b2\b\b\u0002\u0010\t\u001a\u00020\u00032\b\b\u0002\u0010\n\u001a\u00020\u000bHÆ\u0001J\u0013\u0010\u001f\u001a\u00020 2\b\u0010!\u001a\u0004\u0018\u00010\u0001HÖ\u0003J\t\u0010\"\u001a\u00020#HÖ\u0001J\t\u0010$\u001a\u00020\u0003HÖ\u0001R\u0016\u0010\u0004\u001a\u00020\u00038\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b\r\u0010\u000eR\u0016\u0010\u0002\u001a\u00020\u00038\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u000f\u0010\u000eR\u0016\u0010\n\u001a\u00020\u000b8\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u0010\u0010\u0011R\u0016\u0010\u0005\u001a\u00020\u00038\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u0012\u0010\u000eR\u001c\u0010\u0007\u001a\b\u0012\u0004\u0012\u00020\u00030\b8\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u0013\u0010\u0014R\u0016\u0010\t\u001a\u00020\u00038\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u0015\u0010\u000eR\u0016\u0010\u0006\u001a\u00020\u00038\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u0016\u0010\u000e¨\u0006&"}, m29142d2 = {"Lth/co/dtac/android/dtacone/model/appOne/tol/tolPackage/CampaignResponse;", "", "codeType", "", "code", "desc", "systemMessage", "replaceMessage", "", "responseDateTime", "data", "Lth/co/dtac/android/dtacone/model/appOne/tol/tolPackage/CampaignData;", "(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/util/List;Ljava/lang/String;Lth/co/dtac/android/dtacone/model/appOne/tol/tolPackage/CampaignData;)V", "getCode", "()Ljava/lang/String;", "getCodeType", "getData", "()Lth/co/dtac/android/dtacone/model/appOne/tol/tolPackage/CampaignData;", "getDesc", "getReplaceMessage", "()Ljava/util/List;", "getResponseDateTime", "getSystemMessage", "component1", "component2", "component3", "component4", "component5", "component6", "component7", "copy", "equals", "", "other", "hashCode", "", "toString", "Companion", "app_prodRelease"}, m29141k = 1, m29140mv = {1, 8, 0}, m29138xi = 48)
/* renamed from: th.co.dtac.android.dtacone.model.appOne.tol.tolPackage.CampaignResponse */
/* loaded from: classes8.dex */
public final class CampaignResponse {
    @SerializedName("code")
    @NotNull
    private final String code;
    @SerializedName("codeType")
    @NotNull
    private final String codeType;
    @SerializedName("data")
    @NotNull
    private final CampaignData data;
    @SerializedName("desc")
    @NotNull
    private final String desc;
    @SerializedName("replaceMessage")
    @NotNull
    private final List<String> replaceMessage;
    @SerializedName("responseDateTime")
    @NotNull
    private final String responseDateTime;
    @SerializedName("systemMessage")
    @NotNull
    private final String systemMessage;
    @NotNull
    public static final Companion Companion = new Companion(null);
    public static final int $stable = 8;

    @Metadata(m29143d1 = {"\u0000\u0012\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\b\u0086\u0003\u0018\u00002\u00020\u0001B\u0007\b\u0002¢\u0006\u0002\u0010\u0002J\u0006\u0010\u0003\u001a\u00020\u0004¨\u0006\u0005"}, m29142d2 = {"Lth/co/dtac/android/dtacone/model/appOne/tol/tolPackage/CampaignResponse$Companion;", "", "()V", "mock", "Lth/co/dtac/android/dtacone/model/appOne/tol/tolPackage/CampaignResponse;", "app_prodRelease"}, m29141k = 1, m29140mv = {1, 8, 0}, m29138xi = 48)
    /* renamed from: th.co.dtac.android.dtacone.model.appOne.tol.tolPackage.CampaignResponse$Companion */
    /* loaded from: classes8.dex */
    public static final class Companion {
        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        @NotNull
        public final CampaignResponse mock() {
            List listOf = CollectionsKt__CollectionsKt.listOf((Object[]) new Campaign[]{new Campaign("2", "Gbps", 2097152, "Counter-CVG-4POTT-B01-C12", "Counter-True Smart Choice (4POTT) - Contract 12 Month", "HSI_FTTH_4POTT_200M", "TOLENTRY", "Internet Service Contract Period (CONTRACT)", 890, "HSI_FTTH_4POTT_200M_TAOKAE-CVG-4POTT-B01-C12", CollectionsKt__CollectionsKt.listOf((Object[]) new CampaignContract[]{new CampaignContract("INSTALL002", "TOL - Installation Fee 12 months", 12, "HSI_FTTH_4POTT_200M_REP3-CVG-4POTT-B01-C12", "INSTALLATION"), new CampaignContract("ENTRY00002", "TOL - Entry fee contract 12 months", 12, "HSI_FTTH_4POTT_200M_TAOKAE-CVG-4POTT-B01-C12", "ENTRY")}), "FTOT13-200", "FTOT13-200 - HappyHome 2019 200/50Mbps 4POTT TMV30G", "HSI_FTTH_4POTT_200M_HAPPYHOME-CVG-4POTT-B01-C12"), new Campaign("1", "Gbps", 1048576, "Counter-CVG-4POTT-B01-C12", "Counter-True Smart Choice (4POTT) - Contract 12 Month", "HSI_FTTH_4POTT_200M", "TOLENTRY", "Internet Service Contract Period (CONTRACT)", 890, "HSI_FTTH_4POTT_200M_TAOKAE-CVG-4POTT-B01-C12", CollectionsKt__CollectionsKt.listOf((Object[]) new CampaignContract[]{new CampaignContract("INSTALL002", "TOL - Installation Fee 12 months", 12, "HSI_FTTH_4POTT_200M_REP3-CVG-4POTT-B01-C12", "INSTALLATION"), new CampaignContract("ENTRY00002", "TOL - Entry fee contract 12 months", 12, "HSI_FTTH_4POTT_200M_TAOKAE-CVG-4POTT-B01-C12", "ENTRY")}), "FTOT13-200", "FTOT13-200 - HappyHome 2019 200/50Mbps 4POTT TMV30G", "HSI_FTTH_4POTT_200M_HAPPYHOME-CVG-4POTT-B01-C12"), new Campaign(Constant.SERVER_ERROR_CODE, "Mbps", 512000, "Counter-CVG-4POTT-B01-C12", "Counter-True Smart Choice (4POTT) - Contract 12 Month", "HSI_FTTH_4POTT_200M", "TOLENTRY450", "Internet Service Contract Period (CONTRACT)_450B", 450, "HSI_FTTH_4POTT_200M_TAOKAE-CVG-4POTT-B02-C14", CollectionsKt__CollectionsKt.listOf((Object[]) new CampaignContract[]{new CampaignContract("INSTALL002", "TOL - Installation Fee 12 months", 12, "HSI_FTTH_4POTT_200M_REP3-CVG-4POTT-B01-C12", "INSTALLATION"), new CampaignContract("ENTRY00002", "TOL - Entry fee contract 12 months", 12, "HSI_FTTH_4POTT_200M_TAOKAE-CVG-4POTT-B01-C12", "ENTRY")}), "FTOT13-200", "FTOT13-200 - HappyHome 2019 200/50Mbps 4POTT TMV30G", "HSI_FTTH_4POTT_200M_HAPPYHOME-CVG-4POTT-B01-C12")});
            return new CampaignResponse("S", "200", "", "", CollectionsKt__CollectionsKt.emptyList(), DateFormatExtKt.toJsonString(new Date()), new CampaignData("TI", Integer.valueOf(listOf.size()), listOf));
        }

        private Companion() {
        }
    }

    public CampaignResponse() {
        this(null, null, null, null, null, null, null, 127, null);
    }

    public static /* synthetic */ CampaignResponse copy$default(CampaignResponse campaignResponse, String str, String str2, String str3, String str4, List list, String str5, CampaignData campaignData, int i, Object obj) {
        if ((i & 1) != 0) {
            str = campaignResponse.codeType;
        }
        if ((i & 2) != 0) {
            str2 = campaignResponse.code;
        }
        String str6 = str2;
        if ((i & 4) != 0) {
            str3 = campaignResponse.desc;
        }
        String str7 = str3;
        if ((i & 8) != 0) {
            str4 = campaignResponse.systemMessage;
        }
        String str8 = str4;
        List<String> list2 = list;
        if ((i & 16) != 0) {
            list2 = campaignResponse.replaceMessage;
        }
        List list3 = list2;
        if ((i & 32) != 0) {
            str5 = campaignResponse.responseDateTime;
        }
        String str9 = str5;
        if ((i & 64) != 0) {
            campaignData = campaignResponse.data;
        }
        return campaignResponse.copy(str, str6, str7, str8, list3, str9, campaignData);
    }

    @NotNull
    public final String component1() {
        return this.codeType;
    }

    @NotNull
    public final String component2() {
        return this.code;
    }

    @NotNull
    public final String component3() {
        return this.desc;
    }

    @NotNull
    public final String component4() {
        return this.systemMessage;
    }

    @NotNull
    public final List<String> component5() {
        return this.replaceMessage;
    }

    @NotNull
    public final String component6() {
        return this.responseDateTime;
    }

    @NotNull
    public final CampaignData component7() {
        return this.data;
    }

    @NotNull
    public final CampaignResponse copy(@NotNull String codeType, @NotNull String code, @NotNull String desc, @NotNull String systemMessage, @NotNull List<String> replaceMessage, @NotNull String responseDateTime, @NotNull CampaignData data) {
        Intrinsics.checkNotNullParameter(codeType, "codeType");
        Intrinsics.checkNotNullParameter(code, "code");
        Intrinsics.checkNotNullParameter(desc, "desc");
        Intrinsics.checkNotNullParameter(systemMessage, "systemMessage");
        Intrinsics.checkNotNullParameter(replaceMessage, "replaceMessage");
        Intrinsics.checkNotNullParameter(responseDateTime, "responseDateTime");
        Intrinsics.checkNotNullParameter(data, "data");
        return new CampaignResponse(codeType, code, desc, systemMessage, replaceMessage, responseDateTime, data);
    }

    public boolean equals(@Nullable Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj instanceof CampaignResponse) {
            CampaignResponse campaignResponse = (CampaignResponse) obj;
            return Intrinsics.areEqual(this.codeType, campaignResponse.codeType) && Intrinsics.areEqual(this.code, campaignResponse.code) && Intrinsics.areEqual(this.desc, campaignResponse.desc) && Intrinsics.areEqual(this.systemMessage, campaignResponse.systemMessage) && Intrinsics.areEqual(this.replaceMessage, campaignResponse.replaceMessage) && Intrinsics.areEqual(this.responseDateTime, campaignResponse.responseDateTime) && Intrinsics.areEqual(this.data, campaignResponse.data);
        }
        return false;
    }

    @NotNull
    public final String getCode() {
        return this.code;
    }

    @NotNull
    public final String getCodeType() {
        return this.codeType;
    }

    @NotNull
    public final CampaignData getData() {
        return this.data;
    }

    @NotNull
    public final String getDesc() {
        return this.desc;
    }

    @NotNull
    public final List<String> getReplaceMessage() {
        return this.replaceMessage;
    }

    @NotNull
    public final String getResponseDateTime() {
        return this.responseDateTime;
    }

    @NotNull
    public final String getSystemMessage() {
        return this.systemMessage;
    }

    public int hashCode() {
        return (((((((((((this.codeType.hashCode() * 31) + this.code.hashCode()) * 31) + this.desc.hashCode()) * 31) + this.systemMessage.hashCode()) * 31) + this.replaceMessage.hashCode()) * 31) + this.responseDateTime.hashCode()) * 31) + this.data.hashCode();
    }

    @NotNull
    public String toString() {
        String str = this.codeType;
        String str2 = this.code;
        String str3 = this.desc;
        String str4 = this.systemMessage;
        List<String> list = this.replaceMessage;
        String str5 = this.responseDateTime;
        CampaignData campaignData = this.data;
        return "CampaignResponse(codeType=" + str + ", code=" + str2 + ", desc=" + str3 + ", systemMessage=" + str4 + ", replaceMessage=" + list + ", responseDateTime=" + str5 + ", data=" + campaignData + ")";
    }

    public CampaignResponse(@NotNull String codeType, @NotNull String code, @NotNull String desc, @NotNull String systemMessage, @NotNull List<String> replaceMessage, @NotNull String responseDateTime, @NotNull CampaignData data) {
        Intrinsics.checkNotNullParameter(codeType, "codeType");
        Intrinsics.checkNotNullParameter(code, "code");
        Intrinsics.checkNotNullParameter(desc, "desc");
        Intrinsics.checkNotNullParameter(systemMessage, "systemMessage");
        Intrinsics.checkNotNullParameter(replaceMessage, "replaceMessage");
        Intrinsics.checkNotNullParameter(responseDateTime, "responseDateTime");
        Intrinsics.checkNotNullParameter(data, "data");
        this.codeType = codeType;
        this.code = code;
        this.desc = desc;
        this.systemMessage = systemMessage;
        this.replaceMessage = replaceMessage;
        this.responseDateTime = responseDateTime;
        this.data = data;
    }

    public /* synthetic */ CampaignResponse(String str, String str2, String str3, String str4, List list, String str5, CampaignData campaignData, int i, DefaultConstructorMarker defaultConstructorMarker) {
        this((i & 1) != 0 ? "" : str, (i & 2) != 0 ? "" : str2, (i & 4) != 0 ? "" : str3, (i & 8) != 0 ? "" : str4, (i & 16) != 0 ? CollectionsKt__CollectionsKt.emptyList() : list, (i & 32) == 0 ? str5 : "", (i & 64) != 0 ? new CampaignData(null, null, null, 7, null) : campaignData);
    }
}
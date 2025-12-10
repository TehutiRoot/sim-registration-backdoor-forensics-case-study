package th.p047co.dtac.android.dtacone.model.appOne.tol.wsso;

import android.os.Parcel;
import android.os.Parcelable;
import androidx.compose.runtime.internal.StabilityInferred;
import com.google.gson.annotations.SerializedName;
import java.util.List;
import kotlin.Metadata;
import kotlin.collections.CollectionsKt__CollectionsKt;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import org.apache.commons.cli.HelpFormatter;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import th.p047co.dtac.android.dtacone.util.Constant;

@StabilityInferred(parameters = 0)
@Metadata(m28851d1 = {"\u0000D\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010 \n\u0002\b\u0015\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0010\u0002\n\u0002\b\u0005\b\u0087\b\u0018\u0000 .2\u00020\u0001:\u0002./B\u0011\b\u0016\u0012\b\u0010\u0002\u001a\u0004\u0018\u00010\u0003¢\u0006\u0002\u0010\u0004B_\u0012\n\b\u0002\u0010\u0005\u001a\u0004\u0018\u00010\u0006\u0012\n\b\u0002\u0010\u0007\u001a\u0004\u0018\u00010\u0006\u0012\n\b\u0002\u0010\b\u001a\u0004\u0018\u00010\u0006\u0012\n\b\u0002\u0010\t\u001a\u0004\u0018\u00010\u0006\u0012\n\b\u0002\u0010\n\u001a\u0004\u0018\u00010\u000b\u0012\u0010\b\u0002\u0010\f\u001a\n\u0012\u0004\u0012\u00020\u0006\u0018\u00010\r\u0012\n\b\u0002\u0010\u000e\u001a\u0004\u0018\u00010\u0006¢\u0006\u0002\u0010\u000fJ\u000b\u0010\u001a\u001a\u0004\u0018\u00010\u0006HÆ\u0003J\u000b\u0010\u001b\u001a\u0004\u0018\u00010\u0006HÆ\u0003J\u000b\u0010\u001c\u001a\u0004\u0018\u00010\u0006HÆ\u0003J\u000b\u0010\u001d\u001a\u0004\u0018\u00010\u0006HÆ\u0003J\u000b\u0010\u001e\u001a\u0004\u0018\u00010\u000bHÆ\u0003J\u0011\u0010\u001f\u001a\n\u0012\u0004\u0012\u00020\u0006\u0018\u00010\rHÆ\u0003J\u000b\u0010 \u001a\u0004\u0018\u00010\u0006HÆ\u0003Jc\u0010!\u001a\u00020\u00002\n\b\u0002\u0010\u0005\u001a\u0004\u0018\u00010\u00062\n\b\u0002\u0010\u0007\u001a\u0004\u0018\u00010\u00062\n\b\u0002\u0010\b\u001a\u0004\u0018\u00010\u00062\n\b\u0002\u0010\t\u001a\u0004\u0018\u00010\u00062\n\b\u0002\u0010\n\u001a\u0004\u0018\u00010\u000b2\u0010\b\u0002\u0010\f\u001a\n\u0012\u0004\u0012\u00020\u0006\u0018\u00010\r2\n\b\u0002\u0010\u000e\u001a\u0004\u0018\u00010\u0006HÆ\u0001J\b\u0010\"\u001a\u00020#H\u0016J\u0013\u0010$\u001a\u00020%2\b\u0010&\u001a\u0004\u0018\u00010'HÖ\u0003J\t\u0010(\u001a\u00020#HÖ\u0001J\t\u0010)\u001a\u00020\u0006HÖ\u0001J\u0018\u0010*\u001a\u00020+2\u0006\u0010,\u001a\u00020\u00032\u0006\u0010-\u001a\u00020#H\u0016R\u0018\u0010\u0007\u001a\u0004\u0018\u00010\u00068\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u0010\u0010\u0011R\u0018\u0010\b\u001a\u0004\u0018\u00010\u00068\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u0012\u0010\u0011R\u0018\u0010\n\u001a\u0004\u0018\u00010\u000b8\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u0013\u0010\u0014R\u0018\u0010\u000e\u001a\u0004\u0018\u00010\u00068\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u0015\u0010\u0011R\u001e\u0010\f\u001a\n\u0012\u0004\u0012\u00020\u0006\u0018\u00010\r8\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u0016\u0010\u0017R\u0018\u0010\t\u001a\u0004\u0018\u00010\u00068\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u0018\u0010\u0011R\u0018\u0010\u0005\u001a\u0004\u0018\u00010\u00068\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u0019\u0010\u0011¨\u00060"}, m28850d2 = {"Lth/co/dtac/android/dtacone/model/appOne/tol/wsso/WssoResponse;", "Landroid/os/Parcelable;", "parcel", "Landroid/os/Parcel;", "(Landroid/os/Parcel;)V", "systemMessage", "", "code", "codeType", "responseDateTime", "data", "Lth/co/dtac/android/dtacone/model/appOne/tol/wsso/WssoResponse$Data;", "replaceMessage", "", "desc", "(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Lth/co/dtac/android/dtacone/model/appOne/tol/wsso/WssoResponse$Data;Ljava/util/List;Ljava/lang/String;)V", "getCode", "()Ljava/lang/String;", "getCodeType", "getData", "()Lth/co/dtac/android/dtacone/model/appOne/tol/wsso/WssoResponse$Data;", "getDesc", "getReplaceMessage", "()Ljava/util/List;", "getResponseDateTime", "getSystemMessage", "component1", "component2", "component3", "component4", "component5", "component6", "component7", "copy", "describeContents", "", "equals", "", "other", "", "hashCode", "toString", "writeToParcel", "", "dest", "flags", "CREATOR", Constant.BenefitName.Data, "app_prodRelease"}, m28849k = 1, m28848mv = {1, 8, 0}, m28846xi = 48)
/* renamed from: th.co.dtac.android.dtacone.model.appOne.tol.wsso.WssoResponse */
/* loaded from: classes8.dex */
public final class WssoResponse implements Parcelable {
    @SerializedName("code")
    @Nullable
    private final String code;
    @SerializedName("codeType")
    @Nullable
    private final String codeType;
    @SerializedName("data")
    @Nullable
    private final Data data;
    @SerializedName("desc")
    @Nullable
    private final String desc;
    @SerializedName("replaceMessage")
    @Nullable
    private final List<String> replaceMessage;
    @SerializedName("responseDateTime")
    @Nullable
    private final String responseDateTime;
    @SerializedName("systemMessage")
    @Nullable
    private final String systemMessage;
    @NotNull
    public static final CREATOR CREATOR = new CREATOR(null);
    public static final int $stable = 8;

    @Metadata(m28851d1 = {"\u0000&\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0011\n\u0000\n\u0002\u0010\b\n\u0002\b\u0002\b\u0086\u0003\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001B\u0007\b\u0002¢\u0006\u0002\u0010\u0003J\u0014\u0010\u0004\u001a\u0004\u0018\u00010\u00022\b\u0010\u0005\u001a\u0004\u0018\u00010\u0006H\u0016J\u0006\u0010\u0007\u001a\u00020\u0002J!\u0010\b\u001a\u000e\u0012\b\b\u0001\u0012\u0004\u0018\u00010\u0002\u0018\u00010\t2\u0006\u0010\n\u001a\u00020\u000bH\u0016¢\u0006\u0002\u0010\f¨\u0006\r"}, m28850d2 = {"Lth/co/dtac/android/dtacone/model/appOne/tol/wsso/WssoResponse$CREATOR;", "Landroid/os/Parcelable$Creator;", "Lth/co/dtac/android/dtacone/model/appOne/tol/wsso/WssoResponse;", "()V", "createFromParcel", "source", "Landroid/os/Parcel;", "mock", "newArray", "", "size", "", "(I)[Lth/co/dtac/android/dtacone/model/appOne/tol/wsso/WssoResponse;", "app_prodRelease"}, m28849k = 1, m28848mv = {1, 8, 0}, m28846xi = 48)
    /* renamed from: th.co.dtac.android.dtacone.model.appOne.tol.wsso.WssoResponse$CREATOR */
    /* loaded from: classes8.dex */
    public static final class CREATOR implements Parcelable.Creator<WssoResponse> {
        public /* synthetic */ CREATOR(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        @NotNull
        public final WssoResponse mock() {
            return new WssoResponse("", "200", "S", "2021-08-26 15:00:00", Data.CREATOR.mock(), CollectionsKt__CollectionsKt.emptyList(), "Success");
        }

        private CREATOR() {
        }

        @Override // android.os.Parcelable.Creator
        @Nullable
        public WssoResponse createFromParcel(@Nullable Parcel parcel) {
            return new WssoResponse(parcel);
        }

        @Override // android.os.Parcelable.Creator
        @Nullable
        public WssoResponse[] newArray(int i) {
            return new WssoResponse[i];
        }
    }

    @StabilityInferred(parameters = 0)
    @Metadata(m28851d1 = {"\u0000@\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0003\n\u0002\u0010 \n\u0002\b\u001b\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0010\u0002\n\u0002\b\u0004\b\u0087\b\u0018\u0000 22\u00020\u0001:\u00012B\u0011\b\u0016\u0012\b\u0010\u0002\u001a\u0004\u0018\u00010\u0003¢\u0006\u0002\u0010\u0004Bk\u0012\n\b\u0002\u0010\u0005\u001a\u0004\u0018\u00010\u0006\u0012\n\b\u0002\u0010\u0007\u001a\u0004\u0018\u00010\b\u0012\n\b\u0002\u0010\t\u001a\u0004\u0018\u00010\b\u0012\n\b\u0002\u0010\n\u001a\u0004\u0018\u00010\b\u0012\u0010\b\u0002\u0010\u000b\u001a\n\u0012\u0004\u0012\u00020\b\u0018\u00010\f\u0012\n\b\u0002\u0010\r\u001a\u0004\u0018\u00010\b\u0012\n\b\u0002\u0010\u000e\u001a\u0004\u0018\u00010\b\u0012\n\b\u0002\u0010\u000f\u001a\u0004\u0018\u00010\b¢\u0006\u0002\u0010\u0010J\u0010\u0010\u001d\u001a\u0004\u0018\u00010\u0006HÆ\u0003¢\u0006\u0002\u0010\u0012J\u000b\u0010\u001e\u001a\u0004\u0018\u00010\bHÆ\u0003J\u000b\u0010\u001f\u001a\u0004\u0018\u00010\bHÆ\u0003J\u000b\u0010 \u001a\u0004\u0018\u00010\bHÆ\u0003J\u0011\u0010!\u001a\n\u0012\u0004\u0012\u00020\b\u0018\u00010\fHÆ\u0003J\u000b\u0010\"\u001a\u0004\u0018\u00010\bHÆ\u0003J\u000b\u0010#\u001a\u0004\u0018\u00010\bHÆ\u0003J\u000b\u0010$\u001a\u0004\u0018\u00010\bHÆ\u0003Jt\u0010%\u001a\u00020\u00002\n\b\u0002\u0010\u0005\u001a\u0004\u0018\u00010\u00062\n\b\u0002\u0010\u0007\u001a\u0004\u0018\u00010\b2\n\b\u0002\u0010\t\u001a\u0004\u0018\u00010\b2\n\b\u0002\u0010\n\u001a\u0004\u0018\u00010\b2\u0010\b\u0002\u0010\u000b\u001a\n\u0012\u0004\u0012\u00020\b\u0018\u00010\f2\n\b\u0002\u0010\r\u001a\u0004\u0018\u00010\b2\n\b\u0002\u0010\u000e\u001a\u0004\u0018\u00010\b2\n\b\u0002\u0010\u000f\u001a\u0004\u0018\u00010\bHÆ\u0001¢\u0006\u0002\u0010&J\b\u0010'\u001a\u00020(H\u0016J\u0013\u0010)\u001a\u00020\u00062\b\u0010*\u001a\u0004\u0018\u00010+HÖ\u0003J\t\u0010,\u001a\u00020(HÖ\u0001J\t\u0010-\u001a\u00020\bHÖ\u0001J\u0018\u0010.\u001a\u00020/2\u0006\u00100\u001a\u00020\u00032\u0006\u00101\u001a\u00020(H\u0016R\u001a\u0010\u0005\u001a\u0004\u0018\u00010\u00068\u0006X\u0087\u0004¢\u0006\n\n\u0002\u0010\u0013\u001a\u0004\b\u0011\u0010\u0012R\u0018\u0010\r\u001a\u0004\u0018\u00010\b8\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u0014\u0010\u0015R\u0018\u0010\u000e\u001a\u0004\u0018\u00010\b8\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u0016\u0010\u0015R\u0018\u0010\u000f\u001a\u0004\u0018\u00010\b8\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u0017\u0010\u0015R\u0018\u0010\t\u001a\u0004\u0018\u00010\b8\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u0018\u0010\u0015R\u0018\u0010\n\u001a\u0004\u0018\u00010\b8\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u0019\u0010\u0015R\u001e\u0010\u000b\u001a\n\u0012\u0004\u0012\u00020\b\u0018\u00010\f8\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u001a\u0010\u001bR\u0018\u0010\u0007\u001a\u0004\u0018\u00010\b8\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u001c\u0010\u0015¨\u00063"}, m28850d2 = {"Lth/co/dtac/android/dtacone/model/appOne/tol/wsso/WssoResponse$Data;", "Landroid/os/Parcelable;", "parcel", "Landroid/os/Parcel;", "(Landroid/os/Parcel;)V", "smartSearchFlag", "", "wssoShopCode", "", "wssoSaleCode", "wssoSaleGroup", "wssoSaleRole", "", "wssoChannelAlias", "wssoName", "wssoPartnerType", "(Ljava/lang/Boolean;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/util/List;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)V", "getSmartSearchFlag", "()Ljava/lang/Boolean;", "Ljava/lang/Boolean;", "getWssoChannelAlias", "()Ljava/lang/String;", "getWssoName", "getWssoPartnerType", "getWssoSaleCode", "getWssoSaleGroup", "getWssoSaleRole", "()Ljava/util/List;", "getWssoShopCode", "component1", "component2", "component3", "component4", "component5", "component6", "component7", "component8", "copy", "(Ljava/lang/Boolean;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/util/List;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)Lth/co/dtac/android/dtacone/model/appOne/tol/wsso/WssoResponse$Data;", "describeContents", "", "equals", "other", "", "hashCode", "toString", "writeToParcel", "", "dest", "flags", "CREATOR", "app_prodRelease"}, m28849k = 1, m28848mv = {1, 8, 0}, m28846xi = 48)
    /* renamed from: th.co.dtac.android.dtacone.model.appOne.tol.wsso.WssoResponse$Data */
    /* loaded from: classes8.dex */
    public static final class Data implements Parcelable {
        @SerializedName("smartSearchFlag")
        @Nullable
        private final Boolean smartSearchFlag;
        @SerializedName("wssoChannelAlias")
        @Nullable
        private final String wssoChannelAlias;
        @SerializedName("wssoName")
        @Nullable
        private final String wssoName;
        @SerializedName("wssoPartnerType")
        @Nullable
        private final String wssoPartnerType;
        @SerializedName("wssoSaleCode")
        @Nullable
        private final String wssoSaleCode;
        @SerializedName("wssoSaleGroup")
        @Nullable
        private final String wssoSaleGroup;
        @SerializedName("wssoSaleRole")
        @Nullable
        private final List<String> wssoSaleRole;
        @SerializedName("wssoShopCode")
        @Nullable
        private final String wssoShopCode;
        @NotNull
        public static final CREATOR CREATOR = new CREATOR(null);
        public static final int $stable = 8;

        @Metadata(m28851d1 = {"\u0000&\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0011\n\u0000\n\u0002\u0010\b\n\u0002\b\u0002\b\u0086\u0003\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001B\u0007\b\u0002¢\u0006\u0002\u0010\u0003J\u0014\u0010\u0004\u001a\u0004\u0018\u00010\u00022\b\u0010\u0005\u001a\u0004\u0018\u00010\u0006H\u0016J\u0006\u0010\u0007\u001a\u00020\u0002J!\u0010\b\u001a\u000e\u0012\b\b\u0001\u0012\u0004\u0018\u00010\u0002\u0018\u00010\t2\u0006\u0010\n\u001a\u00020\u000bH\u0016¢\u0006\u0002\u0010\f¨\u0006\r"}, m28850d2 = {"Lth/co/dtac/android/dtacone/model/appOne/tol/wsso/WssoResponse$Data$CREATOR;", "Landroid/os/Parcelable$Creator;", "Lth/co/dtac/android/dtacone/model/appOne/tol/wsso/WssoResponse$Data;", "()V", "createFromParcel", "source", "Landroid/os/Parcel;", "mock", "newArray", "", "size", "", "(I)[Lth/co/dtac/android/dtacone/model/appOne/tol/wsso/WssoResponse$Data;", "app_prodRelease"}, m28849k = 1, m28848mv = {1, 8, 0}, m28846xi = 48)
        /* renamed from: th.co.dtac.android.dtacone.model.appOne.tol.wsso.WssoResponse$Data$CREATOR */
        /* loaded from: classes8.dex */
        public static final class CREATOR implements Parcelable.Creator<Data> {
            public /* synthetic */ CREATOR(DefaultConstructorMarker defaultConstructorMarker) {
                this();
            }

            @NotNull
            public final Data mock() {
                return new Data(Boolean.TRUE, "10053014", "39119722", "DL2", CollectionsKt__CollectionsKt.listOf((Object[]) new String[]{HelpFormatter.DEFAULT_OPT_PREFIX, "R-NAS-NONSHOP-SALE"}), "RPS", "นางสาว อรอนงค์ องอาจ", "762");
            }

            private CREATOR() {
            }

            @Override // android.os.Parcelable.Creator
            @Nullable
            public Data createFromParcel(@Nullable Parcel parcel) {
                return new Data(parcel);
            }

            @Override // android.os.Parcelable.Creator
            @Nullable
            public Data[] newArray(int i) {
                return new Data[i];
            }
        }

        public Data() {
            this(null, null, null, null, null, null, null, null, 255, null);
        }

        @Nullable
        public final Boolean component1() {
            return this.smartSearchFlag;
        }

        @Nullable
        public final String component2() {
            return this.wssoShopCode;
        }

        @Nullable
        public final String component3() {
            return this.wssoSaleCode;
        }

        @Nullable
        public final String component4() {
            return this.wssoSaleGroup;
        }

        @Nullable
        public final List<String> component5() {
            return this.wssoSaleRole;
        }

        @Nullable
        public final String component6() {
            return this.wssoChannelAlias;
        }

        @Nullable
        public final String component7() {
            return this.wssoName;
        }

        @Nullable
        public final String component8() {
            return this.wssoPartnerType;
        }

        @NotNull
        public final Data copy(@Nullable Boolean bool, @Nullable String str, @Nullable String str2, @Nullable String str3, @Nullable List<String> list, @Nullable String str4, @Nullable String str5, @Nullable String str6) {
            return new Data(bool, str, str2, str3, list, str4, str5, str6);
        }

        @Override // android.os.Parcelable
        public int describeContents() {
            return 0;
        }

        public boolean equals(@Nullable Object obj) {
            if (this == obj) {
                return true;
            }
            if (obj instanceof Data) {
                Data data = (Data) obj;
                return Intrinsics.areEqual(this.smartSearchFlag, data.smartSearchFlag) && Intrinsics.areEqual(this.wssoShopCode, data.wssoShopCode) && Intrinsics.areEqual(this.wssoSaleCode, data.wssoSaleCode) && Intrinsics.areEqual(this.wssoSaleGroup, data.wssoSaleGroup) && Intrinsics.areEqual(this.wssoSaleRole, data.wssoSaleRole) && Intrinsics.areEqual(this.wssoChannelAlias, data.wssoChannelAlias) && Intrinsics.areEqual(this.wssoName, data.wssoName) && Intrinsics.areEqual(this.wssoPartnerType, data.wssoPartnerType);
            }
            return false;
        }

        @Nullable
        public final Boolean getSmartSearchFlag() {
            return this.smartSearchFlag;
        }

        @Nullable
        public final String getWssoChannelAlias() {
            return this.wssoChannelAlias;
        }

        @Nullable
        public final String getWssoName() {
            return this.wssoName;
        }

        @Nullable
        public final String getWssoPartnerType() {
            return this.wssoPartnerType;
        }

        @Nullable
        public final String getWssoSaleCode() {
            return this.wssoSaleCode;
        }

        @Nullable
        public final String getWssoSaleGroup() {
            return this.wssoSaleGroup;
        }

        @Nullable
        public final List<String> getWssoSaleRole() {
            return this.wssoSaleRole;
        }

        @Nullable
        public final String getWssoShopCode() {
            return this.wssoShopCode;
        }

        public int hashCode() {
            Boolean bool = this.smartSearchFlag;
            int hashCode = (bool == null ? 0 : bool.hashCode()) * 31;
            String str = this.wssoShopCode;
            int hashCode2 = (hashCode + (str == null ? 0 : str.hashCode())) * 31;
            String str2 = this.wssoSaleCode;
            int hashCode3 = (hashCode2 + (str2 == null ? 0 : str2.hashCode())) * 31;
            String str3 = this.wssoSaleGroup;
            int hashCode4 = (hashCode3 + (str3 == null ? 0 : str3.hashCode())) * 31;
            List<String> list = this.wssoSaleRole;
            int hashCode5 = (hashCode4 + (list == null ? 0 : list.hashCode())) * 31;
            String str4 = this.wssoChannelAlias;
            int hashCode6 = (hashCode5 + (str4 == null ? 0 : str4.hashCode())) * 31;
            String str5 = this.wssoName;
            int hashCode7 = (hashCode6 + (str5 == null ? 0 : str5.hashCode())) * 31;
            String str6 = this.wssoPartnerType;
            return hashCode7 + (str6 != null ? str6.hashCode() : 0);
        }

        @NotNull
        public String toString() {
            Boolean bool = this.smartSearchFlag;
            String str = this.wssoShopCode;
            String str2 = this.wssoSaleCode;
            String str3 = this.wssoSaleGroup;
            List<String> list = this.wssoSaleRole;
            String str4 = this.wssoChannelAlias;
            String str5 = this.wssoName;
            String str6 = this.wssoPartnerType;
            return "Data(smartSearchFlag=" + bool + ", wssoShopCode=" + str + ", wssoSaleCode=" + str2 + ", wssoSaleGroup=" + str3 + ", wssoSaleRole=" + list + ", wssoChannelAlias=" + str4 + ", wssoName=" + str5 + ", wssoPartnerType=" + str6 + ")";
        }

        @Override // android.os.Parcelable
        public void writeToParcel(@NotNull Parcel dest, int i) {
            Intrinsics.checkNotNullParameter(dest, "dest");
            dest.writeByte(Intrinsics.areEqual(this.smartSearchFlag, Boolean.TRUE) ? (byte) 1 : (byte) 0);
            dest.writeString(this.wssoShopCode);
            dest.writeString(this.wssoSaleCode);
            dest.writeString(this.wssoSaleGroup);
            dest.writeStringList(this.wssoSaleRole);
            dest.writeString(this.wssoChannelAlias);
            dest.writeString(this.wssoName);
            dest.writeString(this.wssoPartnerType);
        }

        public Data(@Nullable Boolean bool, @Nullable String str, @Nullable String str2, @Nullable String str3, @Nullable List<String> list, @Nullable String str4, @Nullable String str5, @Nullable String str6) {
            this.smartSearchFlag = bool;
            this.wssoShopCode = str;
            this.wssoSaleCode = str2;
            this.wssoSaleGroup = str3;
            this.wssoSaleRole = list;
            this.wssoChannelAlias = str4;
            this.wssoName = str5;
            this.wssoPartnerType = str6;
        }

        public /* synthetic */ Data(Boolean bool, String str, String str2, String str3, List list, String str4, String str5, String str6, int i, DefaultConstructorMarker defaultConstructorMarker) {
            this((i & 1) != 0 ? null : bool, (i & 2) != 0 ? null : str, (i & 4) != 0 ? null : str2, (i & 8) != 0 ? null : str3, (i & 16) != 0 ? null : list, (i & 32) != 0 ? null : str4, (i & 64) != 0 ? null : str5, (i & 128) == 0 ? str6 : null);
        }

        /* JADX WARN: Illegal instructions before constructor call */
        /*
            Code decompiled incorrectly, please refer to instructions dump.
            To view partially-correct code enable 'Show inconsistent code' option in preferences
        */
        public Data(@org.jetbrains.annotations.Nullable android.os.Parcel r11) {
            /*
                r10 = this;
                r0 = 0
                r1 = 1
                if (r11 == 0) goto Lb
                byte r2 = r11.readByte()
                if (r2 != 0) goto Lb
                r0 = 1
            Lb:
                r0 = r0 ^ r1
                java.lang.Boolean r2 = java.lang.Boolean.valueOf(r0)
                r0 = 0
                if (r11 == 0) goto L19
                java.lang.String r1 = r11.readString()
                r3 = r1
                goto L1a
            L19:
                r3 = r0
            L1a:
                if (r11 == 0) goto L22
                java.lang.String r1 = r11.readString()
                r4 = r1
                goto L23
            L22:
                r4 = r0
            L23:
                if (r11 == 0) goto L2b
                java.lang.String r1 = r11.readString()
                r5 = r1
                goto L2c
            L2b:
                r5 = r0
            L2c:
                if (r11 == 0) goto L34
                java.util.ArrayList r1 = r11.createStringArrayList()
                r6 = r1
                goto L35
            L34:
                r6 = r0
            L35:
                if (r11 == 0) goto L3d
                java.lang.String r1 = r11.readString()
                r7 = r1
                goto L3e
            L3d:
                r7 = r0
            L3e:
                if (r11 == 0) goto L46
                java.lang.String r1 = r11.readString()
                r8 = r1
                goto L47
            L46:
                r8 = r0
            L47:
                if (r11 == 0) goto L4f
                java.lang.String r11 = r11.readString()
                r9 = r11
                goto L50
            L4f:
                r9 = r0
            L50:
                r1 = r10
                r1.<init>(r2, r3, r4, r5, r6, r7, r8, r9)
                return
            */
            throw new UnsupportedOperationException("Method not decompiled: th.p047co.dtac.android.dtacone.model.appOne.tol.wsso.WssoResponse.Data.<init>(android.os.Parcel):void");
        }
    }

    public WssoResponse() {
        this(null, null, null, null, null, null, null, 127, null);
    }

    public static /* synthetic */ WssoResponse copy$default(WssoResponse wssoResponse, String str, String str2, String str3, String str4, Data data, List list, String str5, int i, Object obj) {
        if ((i & 1) != 0) {
            str = wssoResponse.systemMessage;
        }
        if ((i & 2) != 0) {
            str2 = wssoResponse.code;
        }
        String str6 = str2;
        if ((i & 4) != 0) {
            str3 = wssoResponse.codeType;
        }
        String str7 = str3;
        if ((i & 8) != 0) {
            str4 = wssoResponse.responseDateTime;
        }
        String str8 = str4;
        if ((i & 16) != 0) {
            data = wssoResponse.data;
        }
        Data data2 = data;
        List<String> list2 = list;
        if ((i & 32) != 0) {
            list2 = wssoResponse.replaceMessage;
        }
        List list3 = list2;
        if ((i & 64) != 0) {
            str5 = wssoResponse.desc;
        }
        return wssoResponse.copy(str, str6, str7, str8, data2, list3, str5);
    }

    @Nullable
    public final String component1() {
        return this.systemMessage;
    }

    @Nullable
    public final String component2() {
        return this.code;
    }

    @Nullable
    public final String component3() {
        return this.codeType;
    }

    @Nullable
    public final String component4() {
        return this.responseDateTime;
    }

    @Nullable
    public final Data component5() {
        return this.data;
    }

    @Nullable
    public final List<String> component6() {
        return this.replaceMessage;
    }

    @Nullable
    public final String component7() {
        return this.desc;
    }

    @NotNull
    public final WssoResponse copy(@Nullable String str, @Nullable String str2, @Nullable String str3, @Nullable String str4, @Nullable Data data, @Nullable List<String> list, @Nullable String str5) {
        return new WssoResponse(str, str2, str3, str4, data, list, str5);
    }

    @Override // android.os.Parcelable
    public int describeContents() {
        return 0;
    }

    public boolean equals(@Nullable Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj instanceof WssoResponse) {
            WssoResponse wssoResponse = (WssoResponse) obj;
            return Intrinsics.areEqual(this.systemMessage, wssoResponse.systemMessage) && Intrinsics.areEqual(this.code, wssoResponse.code) && Intrinsics.areEqual(this.codeType, wssoResponse.codeType) && Intrinsics.areEqual(this.responseDateTime, wssoResponse.responseDateTime) && Intrinsics.areEqual(this.data, wssoResponse.data) && Intrinsics.areEqual(this.replaceMessage, wssoResponse.replaceMessage) && Intrinsics.areEqual(this.desc, wssoResponse.desc);
        }
        return false;
    }

    @Nullable
    public final String getCode() {
        return this.code;
    }

    @Nullable
    public final String getCodeType() {
        return this.codeType;
    }

    @Nullable
    public final Data getData() {
        return this.data;
    }

    @Nullable
    public final String getDesc() {
        return this.desc;
    }

    @Nullable
    public final List<String> getReplaceMessage() {
        return this.replaceMessage;
    }

    @Nullable
    public final String getResponseDateTime() {
        return this.responseDateTime;
    }

    @Nullable
    public final String getSystemMessage() {
        return this.systemMessage;
    }

    public int hashCode() {
        String str = this.systemMessage;
        int hashCode = (str == null ? 0 : str.hashCode()) * 31;
        String str2 = this.code;
        int hashCode2 = (hashCode + (str2 == null ? 0 : str2.hashCode())) * 31;
        String str3 = this.codeType;
        int hashCode3 = (hashCode2 + (str3 == null ? 0 : str3.hashCode())) * 31;
        String str4 = this.responseDateTime;
        int hashCode4 = (hashCode3 + (str4 == null ? 0 : str4.hashCode())) * 31;
        Data data = this.data;
        int hashCode5 = (hashCode4 + (data == null ? 0 : data.hashCode())) * 31;
        List<String> list = this.replaceMessage;
        int hashCode6 = (hashCode5 + (list == null ? 0 : list.hashCode())) * 31;
        String str5 = this.desc;
        return hashCode6 + (str5 != null ? str5.hashCode() : 0);
    }

    @NotNull
    public String toString() {
        String str = this.systemMessage;
        String str2 = this.code;
        String str3 = this.codeType;
        String str4 = this.responseDateTime;
        Data data = this.data;
        List<String> list = this.replaceMessage;
        String str5 = this.desc;
        return "WssoResponse(systemMessage=" + str + ", code=" + str2 + ", codeType=" + str3 + ", responseDateTime=" + str4 + ", data=" + data + ", replaceMessage=" + list + ", desc=" + str5 + ")";
    }

    @Override // android.os.Parcelable
    public void writeToParcel(@NotNull Parcel dest, int i) {
        Intrinsics.checkNotNullParameter(dest, "dest");
        dest.writeString(this.systemMessage);
        dest.writeString(this.code);
        dest.writeString(this.codeType);
        dest.writeString(this.responseDateTime);
        dest.writeParcelable(this.data, i);
        dest.writeStringList(this.replaceMessage);
        dest.writeString(this.desc);
    }

    public WssoResponse(@Nullable String str, @Nullable String str2, @Nullable String str3, @Nullable String str4, @Nullable Data data, @Nullable List<String> list, @Nullable String str5) {
        this.systemMessage = str;
        this.code = str2;
        this.codeType = str3;
        this.responseDateTime = str4;
        this.data = data;
        this.replaceMessage = list;
        this.desc = str5;
    }

    public /* synthetic */ WssoResponse(String str, String str2, String str3, String str4, Data data, List list, String str5, int i, DefaultConstructorMarker defaultConstructorMarker) {
        this((i & 1) != 0 ? null : str, (i & 2) != 0 ? null : str2, (i & 4) != 0 ? null : str3, (i & 8) != 0 ? null : str4, (i & 16) != 0 ? null : data, (i & 32) != 0 ? null : list, (i & 64) != 0 ? null : str5);
    }

    public WssoResponse(@Nullable Parcel parcel) {
        this(parcel != null ? parcel.readString() : null, parcel != null ? parcel.readString() : null, parcel != null ? parcel.readString() : null, parcel != null ? parcel.readString() : null, parcel != null ? (Data) parcel.readParcelable(Data.class.getClassLoader()) : null, parcel != null ? parcel.createStringArrayList() : null, parcel != null ? parcel.readString() : null);
    }
}

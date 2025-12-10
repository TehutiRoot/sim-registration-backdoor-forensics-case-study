package th.p047co.dtac.android.dtacone.model.stv;

import androidx.compose.runtime.internal.StabilityInferred;
import com.google.firebase.analytics.FirebaseAnalytics;
import com.google.gson.annotations.SerializedName;
import kotlin.Metadata;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import org.bouncycastle.i18n.MessageBundle;
import org.jetbrains.annotations.NotNull;

@StabilityInferred(parameters = 0)
@Metadata(m29143d1 = {"\u0000(\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000e\n\u0002\b\t\n\u0002\u0010\u0011\n\u0002\b\u0007\n\u0002\u0010\u0007\n\u0000\n\u0002\u0010\b\n\u0002\b\u001f\b\u0007\u0018\u00002\u00020\u0001BÙ\u0001\u0012\b\b\u0002\u0010\u0002\u001a\u00020\u0003\u0012\b\b\u0002\u0010\u0004\u001a\u00020\u0003\u0012\b\b\u0002\u0010\u0005\u001a\u00020\u0003\u0012\b\b\u0002\u0010\u0006\u001a\u00020\u0003\u0012\b\b\u0002\u0010\u0007\u001a\u00020\u0003\u0012\b\b\u0002\u0010\b\u001a\u00020\u0003\u0012\b\b\u0002\u0010\t\u001a\u00020\u0003\u0012\b\b\u0002\u0010\n\u001a\u00020\u0003\u0012\b\b\u0002\u0010\u000b\u001a\u00020\u0003\u0012\u000e\b\u0002\u0010\f\u001a\b\u0012\u0004\u0012\u00020\u00030\r\u0012\b\b\u0002\u0010\u000e\u001a\u00020\u0003\u0012\b\b\u0002\u0010\u000f\u001a\u00020\u0003\u0012\b\b\u0002\u0010\u0010\u001a\u00020\u0003\u0012\b\b\u0002\u0010\u0011\u001a\u00020\u0003\u0012\b\b\u0002\u0010\u0012\u001a\u00020\u0003\u0012\b\b\u0002\u0010\u0013\u001a\u00020\u0003\u0012\u0006\u0010\u0014\u001a\u00020\u0015\u0012\u0006\u0010\u0016\u001a\u00020\u0017\u0012\b\b\u0002\u0010\u0018\u001a\u00020\u0003\u0012\b\b\u0002\u0010\u0019\u001a\u00020\u0003\u0012\b\b\u0002\u0010\u001a\u001a\u00020\u0003¢\u0006\u0002\u0010\u001bR\u0016\u0010\u0018\u001a\u00020\u00038\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u001c\u0010\u001dR\u0016\u0010\u0002\u001a\u00020\u00038\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u001e\u0010\u001dR\u0016\u0010\u0012\u001a\u00020\u00038\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u001f\u0010\u001dR\u0016\u0010\u0013\u001a\u00020\u00038\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b \u0010\u001dR\u0016\u0010\u0014\u001a\u00020\u00158\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b!\u0010\"R\u0016\u0010\t\u001a\u00020\u00038\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b#\u0010\u001dR\u001e\u0010\f\u001a\b\u0012\u0004\u0012\u00020\u00030\r8\u0006X\u0087\u0004¢\u0006\n\n\u0002\u0010&\u001a\u0004\b$\u0010%R\u0016\u0010\u0005\u001a\u00020\u00038\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b'\u0010\u001dR\u0016\u0010\u000b\u001a\u00020\u00038\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b(\u0010\u001dR\u0016\u0010\u000e\u001a\u00020\u00038\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b)\u0010\u001dR\u0016\u0010\u0019\u001a\u00020\u00038\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b*\u0010\u001dR\u0016\u0010\n\u001a\u00020\u00038\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b+\u0010\u001dR\u0016\u0010\u0011\u001a\u00020\u00038\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b,\u0010\u001dR\u0016\u0010\u0010\u001a\u00020\u00038\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b-\u0010\u001dR\u0016\u0010\u001a\u001a\u00020\u00038\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b.\u0010\u001dR\u0016\u0010\u0016\u001a\u00020\u00178\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b/\u00100R\u0016\u0010\b\u001a\u00020\u00038\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b1\u0010\u001dR\u0016\u0010\u0006\u001a\u00020\u00038\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b2\u0010\u001dR\u0016\u0010\u0007\u001a\u00020\u00038\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b3\u0010\u001dR\u0016\u0010\u0004\u001a\u00020\u00038\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b4\u0010\u001dR\u0016\u0010\u000f\u001a\u00020\u00038\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b5\u0010\u001d¨\u00066"}, m29142d2 = {"Lth/co/dtac/android/dtacone/model/stv/StvRecommendPackage;", "", "code", "", "ussdCode", "flowId", "type", "typeImage", MessageBundle.TITLE_ENTRY, "descriptionTitle", "packageGroupType", "name", "descriptions", "", "net", "validity", "priceLabel", FirebaseAnalytics.Param.PRICE, "commission", "commissionColor", "commissionValue", "", "seq", "", "campaignID", "offerPOID", "requesterLocation", "(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;[Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;FILjava/lang/String;Ljava/lang/String;Ljava/lang/String;)V", "getCampaignID", "()Ljava/lang/String;", "getCode", "getCommission", "getCommissionColor", "getCommissionValue", "()F", "getDescriptionTitle", "getDescriptions", "()[Ljava/lang/String;", "[Ljava/lang/String;", "getFlowId", "getName", "getNet", "getOfferPOID", "getPackageGroupType", "getPrice", "getPriceLabel", "getRequesterLocation", "getSeq", "()I", "getTitle", "getType", "getTypeImage", "getUssdCode", "getValidity", "app_prodRelease"}, m29141k = 1, m29140mv = {1, 8, 0}, m29138xi = 48)
/* renamed from: th.co.dtac.android.dtacone.model.stv.StvRecommendPackage */
/* loaded from: classes8.dex */
public final class StvRecommendPackage {
    public static final int $stable = 8;
    @SerializedName("campaignID")
    @NotNull
    private final String campaignID;
    @SerializedName("code")
    @NotNull
    private final String code;
    @SerializedName("commission")
    @NotNull
    private final String commission;
    @SerializedName("commissionColor")
    @NotNull
    private final String commissionColor;
    @SerializedName("commissionValue")
    private final float commissionValue;
    @SerializedName("descriptionTitle")
    @NotNull
    private final String descriptionTitle;
    @SerializedName("descriptions")
    @NotNull
    private final String[] descriptions;
    @SerializedName("flowId")
    @NotNull
    private final String flowId;
    @SerializedName("name")
    @NotNull
    private final String name;
    @SerializedName("net")
    @NotNull

    /* renamed from: net  reason: collision with root package name */
    private final String f109825net;
    @SerializedName("offerPOID")
    @NotNull
    private final String offerPOID;
    @SerializedName("packageGroupType")
    @NotNull
    private final String packageGroupType;
    @SerializedName(FirebaseAnalytics.Param.PRICE)
    @NotNull
    private final String price;
    @SerializedName("priceLabel")
    @NotNull
    private final String priceLabel;
    @SerializedName("requesterLocation")
    @NotNull
    private final String requesterLocation;
    @SerializedName("seq")
    private final int seq;
    @SerializedName(MessageBundle.TITLE_ENTRY)
    @NotNull
    private final String title;
    @SerializedName("type")
    @NotNull
    private final String type;
    @SerializedName("typeImage")
    @NotNull
    private final String typeImage;
    @SerializedName("ussdCode")
    @NotNull
    private final String ussdCode;
    @SerializedName("validity")
    @NotNull
    private final String validity;

    public StvRecommendPackage(@NotNull String code, @NotNull String ussdCode, @NotNull String flowId, @NotNull String type, @NotNull String typeImage, @NotNull String title, @NotNull String descriptionTitle, @NotNull String packageGroupType, @NotNull String name, @NotNull String[] descriptions, @NotNull String net2, @NotNull String validity, @NotNull String priceLabel, @NotNull String price, @NotNull String commission, @NotNull String commissionColor, float f, int i, @NotNull String campaignID, @NotNull String offerPOID, @NotNull String requesterLocation) {
        Intrinsics.checkNotNullParameter(code, "code");
        Intrinsics.checkNotNullParameter(ussdCode, "ussdCode");
        Intrinsics.checkNotNullParameter(flowId, "flowId");
        Intrinsics.checkNotNullParameter(type, "type");
        Intrinsics.checkNotNullParameter(typeImage, "typeImage");
        Intrinsics.checkNotNullParameter(title, "title");
        Intrinsics.checkNotNullParameter(descriptionTitle, "descriptionTitle");
        Intrinsics.checkNotNullParameter(packageGroupType, "packageGroupType");
        Intrinsics.checkNotNullParameter(name, "name");
        Intrinsics.checkNotNullParameter(descriptions, "descriptions");
        Intrinsics.checkNotNullParameter(net2, "net");
        Intrinsics.checkNotNullParameter(validity, "validity");
        Intrinsics.checkNotNullParameter(priceLabel, "priceLabel");
        Intrinsics.checkNotNullParameter(price, "price");
        Intrinsics.checkNotNullParameter(commission, "commission");
        Intrinsics.checkNotNullParameter(commissionColor, "commissionColor");
        Intrinsics.checkNotNullParameter(campaignID, "campaignID");
        Intrinsics.checkNotNullParameter(offerPOID, "offerPOID");
        Intrinsics.checkNotNullParameter(requesterLocation, "requesterLocation");
        this.code = code;
        this.ussdCode = ussdCode;
        this.flowId = flowId;
        this.type = type;
        this.typeImage = typeImage;
        this.title = title;
        this.descriptionTitle = descriptionTitle;
        this.packageGroupType = packageGroupType;
        this.name = name;
        this.descriptions = descriptions;
        this.f109825net = net2;
        this.validity = validity;
        this.priceLabel = priceLabel;
        this.price = price;
        this.commission = commission;
        this.commissionColor = commissionColor;
        this.commissionValue = f;
        this.seq = i;
        this.campaignID = campaignID;
        this.offerPOID = offerPOID;
        this.requesterLocation = requesterLocation;
    }

    @NotNull
    public final String getCampaignID() {
        return this.campaignID;
    }

    @NotNull
    public final String getCode() {
        return this.code;
    }

    @NotNull
    public final String getCommission() {
        return this.commission;
    }

    @NotNull
    public final String getCommissionColor() {
        return this.commissionColor;
    }

    public final float getCommissionValue() {
        return this.commissionValue;
    }

    @NotNull
    public final String getDescriptionTitle() {
        return this.descriptionTitle;
    }

    @NotNull
    public final String[] getDescriptions() {
        return this.descriptions;
    }

    @NotNull
    public final String getFlowId() {
        return this.flowId;
    }

    @NotNull
    public final String getName() {
        return this.name;
    }

    @NotNull
    public final String getNet() {
        return this.f109825net;
    }

    @NotNull
    public final String getOfferPOID() {
        return this.offerPOID;
    }

    @NotNull
    public final String getPackageGroupType() {
        return this.packageGroupType;
    }

    @NotNull
    public final String getPrice() {
        return this.price;
    }

    @NotNull
    public final String getPriceLabel() {
        return this.priceLabel;
    }

    @NotNull
    public final String getRequesterLocation() {
        return this.requesterLocation;
    }

    public final int getSeq() {
        return this.seq;
    }

    @NotNull
    public final String getTitle() {
        return this.title;
    }

    @NotNull
    public final String getType() {
        return this.type;
    }

    @NotNull
    public final String getTypeImage() {
        return this.typeImage;
    }

    @NotNull
    public final String getUssdCode() {
        return this.ussdCode;
    }

    @NotNull
    public final String getValidity() {
        return this.validity;
    }

    public /* synthetic */ StvRecommendPackage(String str, String str2, String str3, String str4, String str5, String str6, String str7, String str8, String str9, String[] strArr, String str10, String str11, String str12, String str13, String str14, String str15, float f, int i, String str16, String str17, String str18, int i2, DefaultConstructorMarker defaultConstructorMarker) {
        this((i2 & 1) != 0 ? "" : str, (i2 & 2) != 0 ? "" : str2, (i2 & 4) != 0 ? "" : str3, (i2 & 8) != 0 ? "" : str4, (i2 & 16) != 0 ? "" : str5, (i2 & 32) != 0 ? "" : str6, (i2 & 64) != 0 ? "" : str7, (i2 & 128) != 0 ? "" : str8, (i2 & 256) != 0 ? "" : str9, (i2 & 512) != 0 ? new String[0] : strArr, (i2 & 1024) != 0 ? "" : str10, (i2 & 2048) != 0 ? "" : str11, (i2 & 4096) != 0 ? "" : str12, (i2 & 8192) != 0 ? "" : str13, (i2 & 16384) != 0 ? "" : str14, (32768 & i2) != 0 ? "#178729" : str15, f, i, (262144 & i2) != 0 ? "" : str16, (524288 & i2) != 0 ? "" : str17, (i2 & 1048576) != 0 ? "" : str18);
    }
}
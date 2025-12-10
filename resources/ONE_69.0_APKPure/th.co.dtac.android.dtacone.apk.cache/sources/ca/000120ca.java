package th.p047co.dtac.android.dtacone.model.topup.offer;

import android.os.Parcel;
import android.os.Parcelable;
import androidx.compose.runtime.internal.StabilityInferred;
import androidx.core.view.ViewCompat;
import com.google.gson.annotations.SerializedName;
import kotlin.Metadata;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import org.bouncycastle.i18n.MessageBundle;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import th.p047co.dtac.android.dtacone.model.customerenquiry.RequestKt;
import th.p047co.dtac.android.dtacone.model.stv.StvPackageCollection;

@StabilityInferred(parameters = 0)
@Metadata(m29143d1 = {"\u0000@\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0010\b\n\u0002\bH\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0010\u0002\n\u0002\b\u0003\b\u0087\b\u0018\u0000 c2\u00020\u0001:\u0001cB\u000f\b\u0016\u0012\u0006\u0010\u0002\u001a\u00020\u0003¢\u0006\u0002\u0010\u0004B\u009d\u0002\u0012\n\b\u0002\u0010\u0005\u001a\u0004\u0018\u00010\u0006\u0012\n\b\u0002\u0010\u0007\u001a\u0004\u0018\u00010\u0006\u0012\n\b\u0002\u0010\b\u001a\u0004\u0018\u00010\u0006\u0012\n\b\u0002\u0010\t\u001a\u0004\u0018\u00010\n\u0012\n\b\u0002\u0010\u000b\u001a\u0004\u0018\u00010\u0006\u0012\n\b\u0002\u0010\f\u001a\u0004\u0018\u00010\u0006\u0012\n\b\u0002\u0010\r\u001a\u0004\u0018\u00010\u0006\u0012\n\b\u0002\u0010\u000e\u001a\u0004\u0018\u00010\u0006\u0012\n\b\u0002\u0010\u000f\u001a\u0004\u0018\u00010\u0006\u0012\n\b\u0002\u0010\u0010\u001a\u0004\u0018\u00010\u0006\u0012\n\b\u0002\u0010\u0011\u001a\u0004\u0018\u00010\u0012\u0012\n\b\u0002\u0010\u0013\u001a\u0004\u0018\u00010\u0006\u0012\n\b\u0002\u0010\u0014\u001a\u0004\u0018\u00010\u0006\u0012\n\b\u0002\u0010\u0015\u001a\u0004\u0018\u00010\u0006\u0012\n\b\u0002\u0010\u0016\u001a\u0004\u0018\u00010\u0006\u0012\n\b\u0002\u0010\u0017\u001a\u0004\u0018\u00010\u0006\u0012\n\b\u0002\u0010\u0018\u001a\u0004\u0018\u00010\u0006\u0012\n\b\u0002\u0010\u0019\u001a\u0004\u0018\u00010\u0006\u0012\n\b\u0002\u0010\u001a\u001a\u0004\u0018\u00010\u0006\u0012\n\b\u0002\u0010\u001b\u001a\u0004\u0018\u00010\u0006\u0012\b\b\u0002\u0010\u001c\u001a\u00020\u0006\u0012\b\b\u0002\u0010\u001d\u001a\u00020\u0006\u0012\b\b\u0002\u0010\u001e\u001a\u00020\u0006\u0012\b\b\u0002\u0010\u001f\u001a\u00020\u0006¢\u0006\u0002\u0010 J\u000b\u0010?\u001a\u0004\u0018\u00010\u0006HÆ\u0003J\u000b\u0010@\u001a\u0004\u0018\u00010\u0006HÆ\u0003J\u0010\u0010A\u001a\u0004\u0018\u00010\u0012HÆ\u0003¢\u0006\u0002\u0010(J\u000b\u0010B\u001a\u0004\u0018\u00010\u0006HÆ\u0003J\u000b\u0010C\u001a\u0004\u0018\u00010\u0006HÆ\u0003J\u000b\u0010D\u001a\u0004\u0018\u00010\u0006HÆ\u0003J\u000b\u0010E\u001a\u0004\u0018\u00010\u0006HÆ\u0003J\u000b\u0010F\u001a\u0004\u0018\u00010\u0006HÆ\u0003J\u000b\u0010G\u001a\u0004\u0018\u00010\u0006HÆ\u0003J\u000b\u0010H\u001a\u0004\u0018\u00010\u0006HÆ\u0003J\u000b\u0010I\u001a\u0004\u0018\u00010\u0006HÆ\u0003J\u000b\u0010J\u001a\u0004\u0018\u00010\u0006HÆ\u0003J\u000b\u0010K\u001a\u0004\u0018\u00010\u0006HÆ\u0003J\t\u0010L\u001a\u00020\u0006HÆ\u0003J\t\u0010M\u001a\u00020\u0006HÆ\u0003J\t\u0010N\u001a\u00020\u0006HÆ\u0003J\t\u0010O\u001a\u00020\u0006HÆ\u0003J\u000b\u0010P\u001a\u0004\u0018\u00010\u0006HÆ\u0003J\u000b\u0010Q\u001a\u0004\u0018\u00010\nHÆ\u0003J\u000b\u0010R\u001a\u0004\u0018\u00010\u0006HÆ\u0003J\u000b\u0010S\u001a\u0004\u0018\u00010\u0006HÆ\u0003J\u000b\u0010T\u001a\u0004\u0018\u00010\u0006HÆ\u0003J\u000b\u0010U\u001a\u0004\u0018\u00010\u0006HÆ\u0003J\u000b\u0010V\u001a\u0004\u0018\u00010\u0006HÆ\u0003J¦\u0002\u0010W\u001a\u00020\u00002\n\b\u0002\u0010\u0005\u001a\u0004\u0018\u00010\u00062\n\b\u0002\u0010\u0007\u001a\u0004\u0018\u00010\u00062\n\b\u0002\u0010\b\u001a\u0004\u0018\u00010\u00062\n\b\u0002\u0010\t\u001a\u0004\u0018\u00010\n2\n\b\u0002\u0010\u000b\u001a\u0004\u0018\u00010\u00062\n\b\u0002\u0010\f\u001a\u0004\u0018\u00010\u00062\n\b\u0002\u0010\r\u001a\u0004\u0018\u00010\u00062\n\b\u0002\u0010\u000e\u001a\u0004\u0018\u00010\u00062\n\b\u0002\u0010\u000f\u001a\u0004\u0018\u00010\u00062\n\b\u0002\u0010\u0010\u001a\u0004\u0018\u00010\u00062\n\b\u0002\u0010\u0011\u001a\u0004\u0018\u00010\u00122\n\b\u0002\u0010\u0013\u001a\u0004\u0018\u00010\u00062\n\b\u0002\u0010\u0014\u001a\u0004\u0018\u00010\u00062\n\b\u0002\u0010\u0015\u001a\u0004\u0018\u00010\u00062\n\b\u0002\u0010\u0016\u001a\u0004\u0018\u00010\u00062\n\b\u0002\u0010\u0017\u001a\u0004\u0018\u00010\u00062\n\b\u0002\u0010\u0018\u001a\u0004\u0018\u00010\u00062\n\b\u0002\u0010\u0019\u001a\u0004\u0018\u00010\u00062\n\b\u0002\u0010\u001a\u001a\u0004\u0018\u00010\u00062\n\b\u0002\u0010\u001b\u001a\u0004\u0018\u00010\u00062\b\b\u0002\u0010\u001c\u001a\u00020\u00062\b\b\u0002\u0010\u001d\u001a\u00020\u00062\b\b\u0002\u0010\u001e\u001a\u00020\u00062\b\b\u0002\u0010\u001f\u001a\u00020\u0006HÆ\u0001¢\u0006\u0002\u0010XJ\b\u0010Y\u001a\u00020\u0012H\u0016J\u0013\u0010Z\u001a\u00020[2\b\u0010\\\u001a\u0004\u0018\u00010]HÖ\u0003J\t\u0010^\u001a\u00020\u0012HÖ\u0001J\t\u0010_\u001a\u00020\u0006HÖ\u0001J\u0018\u0010`\u001a\u00020a2\u0006\u0010\u0002\u001a\u00020\u00032\u0006\u0010b\u001a\u00020\u0012H\u0016R\u0016\u0010\u001c\u001a\u00020\u00068\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b!\u0010\"R\u0018\u0010\u0015\u001a\u0004\u0018\u00010\u00068\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b#\u0010\"R\u001a\u0010\u001f\u001a\u00020\u0006X\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b$\u0010\"\"\u0004\b%\u0010&R\u001a\u0010\u0011\u001a\u0004\u0018\u00010\u00128\u0006X\u0087\u0004¢\u0006\n\n\u0002\u0010)\u001a\u0004\b'\u0010(R\u0018\u0010\u000b\u001a\u0004\u0018\u00010\u00068\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b*\u0010\"R\u0018\u0010\u0016\u001a\u0004\u0018\u00010\u00068\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b+\u0010\"R\u0018\u0010\u0010\u001a\u0004\u0018\u00010\u00068\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b,\u0010\"R\u0018\u0010\u000e\u001a\u0004\u0018\u00010\u00068\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b-\u0010\"R\u0018\u0010\u000f\u001a\u0004\u0018\u00010\u00068\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b.\u0010\"R\u0018\u0010\u0014\u001a\u0004\u0018\u00010\u00068\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b/\u0010\"R\u0018\u0010\u0013\u001a\u0004\u0018\u00010\u00068\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b0\u0010\"R\u0018\u0010\b\u001a\u0004\u0018\u00010\u00068\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b1\u0010\"R\u0018\u0010\u0007\u001a\u0004\u0018\u00010\u00068\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b2\u0010\"R\u0016\u0010\u001d\u001a\u00020\u00068\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b3\u0010\"R\u0018\u0010\t\u001a\u0004\u0018\u00010\n8\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b4\u00105R\u0018\u0010\u0017\u001a\u0004\u0018\u00010\u00068\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b6\u0010\"R\u0018\u0010\u001b\u001a\u0004\u0018\u00010\u00068\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b7\u0010\"R\u0018\u0010\u0019\u001a\u0004\u0018\u00010\u00068\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b8\u0010\"R\u0018\u0010\u0018\u001a\u0004\u0018\u00010\u00068\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b9\u0010\"R\u0016\u0010\u001e\u001a\u00020\u00068\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b:\u0010\"R\u0018\u0010\u001a\u001a\u0004\u0018\u00010\u00068\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b;\u0010\"R\u0018\u0010\u0005\u001a\u0004\u0018\u00010\u00068\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b<\u0010\"R\u0018\u0010\f\u001a\u0004\u0018\u00010\u00068\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b=\u0010\"R\u0018\u0010\r\u001a\u0004\u0018\u00010\u00068\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b>\u0010\"¨\u0006d"}, m29142d2 = {"Lth/co/dtac/android/dtacone/model/topup/offer/TopupOfferResponse;", "Landroid/os/Parcelable;", "parcel", "Landroid/os/Parcel;", "(Landroid/os/Parcel;)V", MessageBundle.TITLE_ENTRY, "", "offerName", "offerDetailTitle", "offerPackage", "Lth/co/dtac/android/dtacone/model/stv/StvPackageCollection;", "offerDetailButtonTitle", "transactionId", "transactionType", "offerDetailSubTitle1", "offerDetailSubTitle2", "offerDetailStrikeThroughValue", "offerAmount", "", "offerDetailSubValue2", "offerDetailSubValue1", "flowId", "offerDetailButtonValue", "offerTitle", "requesterId", "requesterChannel", "requesterZone", "requesterApplication", "campaignID", "offerPOID", "requesterLocation", "msisdn", "(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Lth/co/dtac/android/dtacone/model/stv/StvPackageCollection;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/Integer;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)V", "getCampaignID", "()Ljava/lang/String;", "getFlowId", "getMsisdn", "setMsisdn", "(Ljava/lang/String;)V", "getOfferAmount", "()Ljava/lang/Integer;", "Ljava/lang/Integer;", "getOfferDetailButtonTitle", "getOfferDetailButtonValue", "getOfferDetailStrikeThroughValue", "getOfferDetailSubTitle1", "getOfferDetailSubTitle2", "getOfferDetailSubValue1", "getOfferDetailSubValue2", "getOfferDetailTitle", "getOfferName", "getOfferPOID", "getOfferPackage", "()Lth/co/dtac/android/dtacone/model/stv/StvPackageCollection;", "getOfferTitle", "getRequesterApplication", "getRequesterChannel", "getRequesterId", "getRequesterLocation", "getRequesterZone", "getTitle", "getTransactionId", "getTransactionType", "component1", "component10", "component11", "component12", "component13", "component14", "component15", "component16", "component17", "component18", "component19", "component2", "component20", "component21", "component22", "component23", "component24", "component3", "component4", "component5", "component6", "component7", "component8", "component9", "copy", "(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Lth/co/dtac/android/dtacone/model/stv/StvPackageCollection;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/Integer;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)Lth/co/dtac/android/dtacone/model/topup/offer/TopupOfferResponse;", "describeContents", "equals", "", "other", "", "hashCode", "toString", "writeToParcel", "", "flags", "CREATOR", "app_prodRelease"}, m29141k = 1, m29140mv = {1, 8, 0}, m29138xi = 48)
/* renamed from: th.co.dtac.android.dtacone.model.topup.offer.TopupOfferResponse */
/* loaded from: classes8.dex */
public final class TopupOfferResponse implements Parcelable {
    @SerializedName("campaignID")
    @NotNull
    private final String campaignID;
    @SerializedName("flowId")
    @Nullable
    private final String flowId;
    @NotNull
    private transient String msisdn;
    @SerializedName("offerAmount")
    @Nullable
    private final Integer offerAmount;
    @SerializedName("offerDetailButtonTitle")
    @Nullable
    private final String offerDetailButtonTitle;
    @SerializedName("offerDetailButtonValue")
    @Nullable
    private final String offerDetailButtonValue;
    @SerializedName("offerDetailStrikeThroughValue")
    @Nullable
    private final String offerDetailStrikeThroughValue;
    @SerializedName("offerDetailSubTitle1")
    @Nullable
    private final String offerDetailSubTitle1;
    @SerializedName("offerDetailSubTitle2")
    @Nullable
    private final String offerDetailSubTitle2;
    @SerializedName("offerDetailSubValue1")
    @Nullable
    private final String offerDetailSubValue1;
    @SerializedName("offerDetailSubValue2")
    @Nullable
    private final String offerDetailSubValue2;
    @SerializedName("offerDetailTitle")
    @Nullable
    private final String offerDetailTitle;
    @SerializedName("offerName")
    @Nullable
    private final String offerName;
    @SerializedName("offerPOID")
    @NotNull
    private final String offerPOID;
    @SerializedName("package")
    @Nullable
    private final StvPackageCollection offerPackage;
    @SerializedName("offerTitle")
    @Nullable
    private final String offerTitle;
    @SerializedName("requesterApplication")
    @Nullable
    private final String requesterApplication;
    @SerializedName("requesterChannel")
    @Nullable
    private final String requesterChannel;
    @SerializedName("requesterId")
    @Nullable
    private final String requesterId;
    @SerializedName("requesterLocation")
    @NotNull
    private final String requesterLocation;
    @SerializedName("requesterZone")
    @Nullable
    private final String requesterZone;
    @SerializedName(MessageBundle.TITLE_ENTRY)
    @Nullable
    private final String title;
    @SerializedName("transactionId")
    @Nullable
    private final String transactionId;
    @SerializedName("transactionType")
    @Nullable
    private final String transactionType;
    @NotNull
    public static final CREATOR CREATOR = new CREATOR(null);
    public static final int $stable = 8;

    @Metadata(m29143d1 = {"\u0000$\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0011\n\u0000\n\u0002\u0010\b\n\u0002\b\u0002\b\u0086\u0003\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001B\u0007\b\u0002¢\u0006\u0002\u0010\u0003J\u0010\u0010\u0004\u001a\u00020\u00022\u0006\u0010\u0005\u001a\u00020\u0006H\u0016J\u001d\u0010\u0007\u001a\n\u0012\u0006\u0012\u0004\u0018\u00010\u00020\b2\u0006\u0010\t\u001a\u00020\nH\u0016¢\u0006\u0002\u0010\u000b¨\u0006\f"}, m29142d2 = {"Lth/co/dtac/android/dtacone/model/topup/offer/TopupOfferResponse$CREATOR;", "Landroid/os/Parcelable$Creator;", "Lth/co/dtac/android/dtacone/model/topup/offer/TopupOfferResponse;", "()V", "createFromParcel", "parcel", "Landroid/os/Parcel;", "newArray", "", "size", "", "(I)[Lth/co/dtac/android/dtacone/model/topup/offer/TopupOfferResponse;", "app_prodRelease"}, m29141k = 1, m29140mv = {1, 8, 0}, m29138xi = 48)
    /* renamed from: th.co.dtac.android.dtacone.model.topup.offer.TopupOfferResponse$CREATOR */
    /* loaded from: classes8.dex */
    public static final class CREATOR implements Parcelable.Creator<TopupOfferResponse> {
        public /* synthetic */ CREATOR(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        private CREATOR() {
        }

        @Override // android.os.Parcelable.Creator
        @NotNull
        public TopupOfferResponse createFromParcel(@NotNull Parcel parcel) {
            Intrinsics.checkNotNullParameter(parcel, "parcel");
            return new TopupOfferResponse(parcel);
        }

        @Override // android.os.Parcelable.Creator
        @NotNull
        public TopupOfferResponse[] newArray(int i) {
            return new TopupOfferResponse[i];
        }
    }

    public TopupOfferResponse() {
        this(null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, ViewCompat.MEASURED_SIZE_MASK, null);
    }

    @Nullable
    public final String component1() {
        return this.title;
    }

    @Nullable
    public final String component10() {
        return this.offerDetailStrikeThroughValue;
    }

    @Nullable
    public final Integer component11() {
        return this.offerAmount;
    }

    @Nullable
    public final String component12() {
        return this.offerDetailSubValue2;
    }

    @Nullable
    public final String component13() {
        return this.offerDetailSubValue1;
    }

    @Nullable
    public final String component14() {
        return this.flowId;
    }

    @Nullable
    public final String component15() {
        return this.offerDetailButtonValue;
    }

    @Nullable
    public final String component16() {
        return this.offerTitle;
    }

    @Nullable
    public final String component17() {
        return this.requesterId;
    }

    @Nullable
    public final String component18() {
        return this.requesterChannel;
    }

    @Nullable
    public final String component19() {
        return this.requesterZone;
    }

    @Nullable
    public final String component2() {
        return this.offerName;
    }

    @Nullable
    public final String component20() {
        return this.requesterApplication;
    }

    @NotNull
    public final String component21() {
        return this.campaignID;
    }

    @NotNull
    public final String component22() {
        return this.offerPOID;
    }

    @NotNull
    public final String component23() {
        return this.requesterLocation;
    }

    @NotNull
    public final String component24() {
        return this.msisdn;
    }

    @Nullable
    public final String component3() {
        return this.offerDetailTitle;
    }

    @Nullable
    public final StvPackageCollection component4() {
        return this.offerPackage;
    }

    @Nullable
    public final String component5() {
        return this.offerDetailButtonTitle;
    }

    @Nullable
    public final String component6() {
        return this.transactionId;
    }

    @Nullable
    public final String component7() {
        return this.transactionType;
    }

    @Nullable
    public final String component8() {
        return this.offerDetailSubTitle1;
    }

    @Nullable
    public final String component9() {
        return this.offerDetailSubTitle2;
    }

    @NotNull
    public final TopupOfferResponse copy(@Nullable String str, @Nullable String str2, @Nullable String str3, @Nullable StvPackageCollection stvPackageCollection, @Nullable String str4, @Nullable String str5, @Nullable String str6, @Nullable String str7, @Nullable String str8, @Nullable String str9, @Nullable Integer num, @Nullable String str10, @Nullable String str11, @Nullable String str12, @Nullable String str13, @Nullable String str14, @Nullable String str15, @Nullable String str16, @Nullable String str17, @Nullable String str18, @NotNull String campaignID, @NotNull String offerPOID, @NotNull String requesterLocation, @NotNull String msisdn) {
        Intrinsics.checkNotNullParameter(campaignID, "campaignID");
        Intrinsics.checkNotNullParameter(offerPOID, "offerPOID");
        Intrinsics.checkNotNullParameter(requesterLocation, "requesterLocation");
        Intrinsics.checkNotNullParameter(msisdn, "msisdn");
        return new TopupOfferResponse(str, str2, str3, stvPackageCollection, str4, str5, str6, str7, str8, str9, num, str10, str11, str12, str13, str14, str15, str16, str17, str18, campaignID, offerPOID, requesterLocation, msisdn);
    }

    @Override // android.os.Parcelable
    public int describeContents() {
        return 0;
    }

    public boolean equals(@Nullable Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj instanceof TopupOfferResponse) {
            TopupOfferResponse topupOfferResponse = (TopupOfferResponse) obj;
            return Intrinsics.areEqual(this.title, topupOfferResponse.title) && Intrinsics.areEqual(this.offerName, topupOfferResponse.offerName) && Intrinsics.areEqual(this.offerDetailTitle, topupOfferResponse.offerDetailTitle) && Intrinsics.areEqual(this.offerPackage, topupOfferResponse.offerPackage) && Intrinsics.areEqual(this.offerDetailButtonTitle, topupOfferResponse.offerDetailButtonTitle) && Intrinsics.areEqual(this.transactionId, topupOfferResponse.transactionId) && Intrinsics.areEqual(this.transactionType, topupOfferResponse.transactionType) && Intrinsics.areEqual(this.offerDetailSubTitle1, topupOfferResponse.offerDetailSubTitle1) && Intrinsics.areEqual(this.offerDetailSubTitle2, topupOfferResponse.offerDetailSubTitle2) && Intrinsics.areEqual(this.offerDetailStrikeThroughValue, topupOfferResponse.offerDetailStrikeThroughValue) && Intrinsics.areEqual(this.offerAmount, topupOfferResponse.offerAmount) && Intrinsics.areEqual(this.offerDetailSubValue2, topupOfferResponse.offerDetailSubValue2) && Intrinsics.areEqual(this.offerDetailSubValue1, topupOfferResponse.offerDetailSubValue1) && Intrinsics.areEqual(this.flowId, topupOfferResponse.flowId) && Intrinsics.areEqual(this.offerDetailButtonValue, topupOfferResponse.offerDetailButtonValue) && Intrinsics.areEqual(this.offerTitle, topupOfferResponse.offerTitle) && Intrinsics.areEqual(this.requesterId, topupOfferResponse.requesterId) && Intrinsics.areEqual(this.requesterChannel, topupOfferResponse.requesterChannel) && Intrinsics.areEqual(this.requesterZone, topupOfferResponse.requesterZone) && Intrinsics.areEqual(this.requesterApplication, topupOfferResponse.requesterApplication) && Intrinsics.areEqual(this.campaignID, topupOfferResponse.campaignID) && Intrinsics.areEqual(this.offerPOID, topupOfferResponse.offerPOID) && Intrinsics.areEqual(this.requesterLocation, topupOfferResponse.requesterLocation) && Intrinsics.areEqual(this.msisdn, topupOfferResponse.msisdn);
        }
        return false;
    }

    @NotNull
    public final String getCampaignID() {
        return this.campaignID;
    }

    @Nullable
    public final String getFlowId() {
        return this.flowId;
    }

    @NotNull
    public final String getMsisdn() {
        return this.msisdn;
    }

    @Nullable
    public final Integer getOfferAmount() {
        return this.offerAmount;
    }

    @Nullable
    public final String getOfferDetailButtonTitle() {
        return this.offerDetailButtonTitle;
    }

    @Nullable
    public final String getOfferDetailButtonValue() {
        return this.offerDetailButtonValue;
    }

    @Nullable
    public final String getOfferDetailStrikeThroughValue() {
        return this.offerDetailStrikeThroughValue;
    }

    @Nullable
    public final String getOfferDetailSubTitle1() {
        return this.offerDetailSubTitle1;
    }

    @Nullable
    public final String getOfferDetailSubTitle2() {
        return this.offerDetailSubTitle2;
    }

    @Nullable
    public final String getOfferDetailSubValue1() {
        return this.offerDetailSubValue1;
    }

    @Nullable
    public final String getOfferDetailSubValue2() {
        return this.offerDetailSubValue2;
    }

    @Nullable
    public final String getOfferDetailTitle() {
        return this.offerDetailTitle;
    }

    @Nullable
    public final String getOfferName() {
        return this.offerName;
    }

    @NotNull
    public final String getOfferPOID() {
        return this.offerPOID;
    }

    @Nullable
    public final StvPackageCollection getOfferPackage() {
        return this.offerPackage;
    }

    @Nullable
    public final String getOfferTitle() {
        return this.offerTitle;
    }

    @Nullable
    public final String getRequesterApplication() {
        return this.requesterApplication;
    }

    @Nullable
    public final String getRequesterChannel() {
        return this.requesterChannel;
    }

    @Nullable
    public final String getRequesterId() {
        return this.requesterId;
    }

    @NotNull
    public final String getRequesterLocation() {
        return this.requesterLocation;
    }

    @Nullable
    public final String getRequesterZone() {
        return this.requesterZone;
    }

    @Nullable
    public final String getTitle() {
        return this.title;
    }

    @Nullable
    public final String getTransactionId() {
        return this.transactionId;
    }

    @Nullable
    public final String getTransactionType() {
        return this.transactionType;
    }

    public int hashCode() {
        String str = this.title;
        int hashCode = (str == null ? 0 : str.hashCode()) * 31;
        String str2 = this.offerName;
        int hashCode2 = (hashCode + (str2 == null ? 0 : str2.hashCode())) * 31;
        String str3 = this.offerDetailTitle;
        int hashCode3 = (hashCode2 + (str3 == null ? 0 : str3.hashCode())) * 31;
        StvPackageCollection stvPackageCollection = this.offerPackage;
        int hashCode4 = (hashCode3 + (stvPackageCollection == null ? 0 : stvPackageCollection.hashCode())) * 31;
        String str4 = this.offerDetailButtonTitle;
        int hashCode5 = (hashCode4 + (str4 == null ? 0 : str4.hashCode())) * 31;
        String str5 = this.transactionId;
        int hashCode6 = (hashCode5 + (str5 == null ? 0 : str5.hashCode())) * 31;
        String str6 = this.transactionType;
        int hashCode7 = (hashCode6 + (str6 == null ? 0 : str6.hashCode())) * 31;
        String str7 = this.offerDetailSubTitle1;
        int hashCode8 = (hashCode7 + (str7 == null ? 0 : str7.hashCode())) * 31;
        String str8 = this.offerDetailSubTitle2;
        int hashCode9 = (hashCode8 + (str8 == null ? 0 : str8.hashCode())) * 31;
        String str9 = this.offerDetailStrikeThroughValue;
        int hashCode10 = (hashCode9 + (str9 == null ? 0 : str9.hashCode())) * 31;
        Integer num = this.offerAmount;
        int hashCode11 = (hashCode10 + (num == null ? 0 : num.hashCode())) * 31;
        String str10 = this.offerDetailSubValue2;
        int hashCode12 = (hashCode11 + (str10 == null ? 0 : str10.hashCode())) * 31;
        String str11 = this.offerDetailSubValue1;
        int hashCode13 = (hashCode12 + (str11 == null ? 0 : str11.hashCode())) * 31;
        String str12 = this.flowId;
        int hashCode14 = (hashCode13 + (str12 == null ? 0 : str12.hashCode())) * 31;
        String str13 = this.offerDetailButtonValue;
        int hashCode15 = (hashCode14 + (str13 == null ? 0 : str13.hashCode())) * 31;
        String str14 = this.offerTitle;
        int hashCode16 = (hashCode15 + (str14 == null ? 0 : str14.hashCode())) * 31;
        String str15 = this.requesterId;
        int hashCode17 = (hashCode16 + (str15 == null ? 0 : str15.hashCode())) * 31;
        String str16 = this.requesterChannel;
        int hashCode18 = (hashCode17 + (str16 == null ? 0 : str16.hashCode())) * 31;
        String str17 = this.requesterZone;
        int hashCode19 = (hashCode18 + (str17 == null ? 0 : str17.hashCode())) * 31;
        String str18 = this.requesterApplication;
        return ((((((((hashCode19 + (str18 != null ? str18.hashCode() : 0)) * 31) + this.campaignID.hashCode()) * 31) + this.offerPOID.hashCode()) * 31) + this.requesterLocation.hashCode()) * 31) + this.msisdn.hashCode();
    }

    public final void setMsisdn(@NotNull String str) {
        Intrinsics.checkNotNullParameter(str, "<set-?>");
        this.msisdn = str;
    }

    @NotNull
    public String toString() {
        String str = this.title;
        String str2 = this.offerName;
        String str3 = this.offerDetailTitle;
        StvPackageCollection stvPackageCollection = this.offerPackage;
        String str4 = this.offerDetailButtonTitle;
        String str5 = this.transactionId;
        String str6 = this.transactionType;
        String str7 = this.offerDetailSubTitle1;
        String str8 = this.offerDetailSubTitle2;
        String str9 = this.offerDetailStrikeThroughValue;
        Integer num = this.offerAmount;
        String str10 = this.offerDetailSubValue2;
        String str11 = this.offerDetailSubValue1;
        String str12 = this.flowId;
        String str13 = this.offerDetailButtonValue;
        String str14 = this.offerTitle;
        String str15 = this.requesterId;
        String str16 = this.requesterChannel;
        String str17 = this.requesterZone;
        String str18 = this.requesterApplication;
        String str19 = this.campaignID;
        String str20 = this.offerPOID;
        String str21 = this.requesterLocation;
        String str22 = this.msisdn;
        return "TopupOfferResponse(title=" + str + ", offerName=" + str2 + ", offerDetailTitle=" + str3 + ", offerPackage=" + stvPackageCollection + ", offerDetailButtonTitle=" + str4 + ", transactionId=" + str5 + ", transactionType=" + str6 + ", offerDetailSubTitle1=" + str7 + ", offerDetailSubTitle2=" + str8 + ", offerDetailStrikeThroughValue=" + str9 + ", offerAmount=" + num + ", offerDetailSubValue2=" + str10 + ", offerDetailSubValue1=" + str11 + ", flowId=" + str12 + ", offerDetailButtonValue=" + str13 + ", offerTitle=" + str14 + ", requesterId=" + str15 + ", requesterChannel=" + str16 + ", requesterZone=" + str17 + ", requesterApplication=" + str18 + ", campaignID=" + str19 + ", offerPOID=" + str20 + ", requesterLocation=" + str21 + ", msisdn=" + str22 + ")";
    }

    @Override // android.os.Parcelable
    public void writeToParcel(@NotNull Parcel parcel, int i) {
        Intrinsics.checkNotNullParameter(parcel, "parcel");
        parcel.writeString(this.title);
        parcel.writeString(this.offerName);
        parcel.writeString(this.offerDetailTitle);
        parcel.writeParcelable(this.offerPackage, i);
        parcel.writeString(this.offerDetailButtonTitle);
        parcel.writeString(this.transactionId);
        parcel.writeString(this.transactionType);
        parcel.writeString(this.offerDetailSubTitle1);
        parcel.writeString(this.offerDetailSubTitle2);
        parcel.writeString(this.offerDetailStrikeThroughValue);
        parcel.writeValue(this.offerAmount);
        parcel.writeString(this.offerDetailSubValue2);
        parcel.writeString(this.offerDetailSubValue1);
        parcel.writeString(this.flowId);
        parcel.writeString(this.offerDetailButtonValue);
        parcel.writeString(this.offerTitle);
        parcel.writeString(this.requesterId);
        parcel.writeString(this.requesterChannel);
        parcel.writeString(this.requesterZone);
        parcel.writeString(this.requesterApplication);
        parcel.writeString(this.campaignID);
        parcel.writeString(this.offerPOID);
        parcel.writeString(this.requesterLocation);
        parcel.writeString(this.msisdn);
    }

    public TopupOfferResponse(@Nullable String str, @Nullable String str2, @Nullable String str3, @Nullable StvPackageCollection stvPackageCollection, @Nullable String str4, @Nullable String str5, @Nullable String str6, @Nullable String str7, @Nullable String str8, @Nullable String str9, @Nullable Integer num, @Nullable String str10, @Nullable String str11, @Nullable String str12, @Nullable String str13, @Nullable String str14, @Nullable String str15, @Nullable String str16, @Nullable String str17, @Nullable String str18, @NotNull String campaignID, @NotNull String offerPOID, @NotNull String requesterLocation, @NotNull String msisdn) {
        Intrinsics.checkNotNullParameter(campaignID, "campaignID");
        Intrinsics.checkNotNullParameter(offerPOID, "offerPOID");
        Intrinsics.checkNotNullParameter(requesterLocation, "requesterLocation");
        Intrinsics.checkNotNullParameter(msisdn, "msisdn");
        this.title = str;
        this.offerName = str2;
        this.offerDetailTitle = str3;
        this.offerPackage = stvPackageCollection;
        this.offerDetailButtonTitle = str4;
        this.transactionId = str5;
        this.transactionType = str6;
        this.offerDetailSubTitle1 = str7;
        this.offerDetailSubTitle2 = str8;
        this.offerDetailStrikeThroughValue = str9;
        this.offerAmount = num;
        this.offerDetailSubValue2 = str10;
        this.offerDetailSubValue1 = str11;
        this.flowId = str12;
        this.offerDetailButtonValue = str13;
        this.offerTitle = str14;
        this.requesterId = str15;
        this.requesterChannel = str16;
        this.requesterZone = str17;
        this.requesterApplication = str18;
        this.campaignID = campaignID;
        this.offerPOID = offerPOID;
        this.requesterLocation = requesterLocation;
        this.msisdn = msisdn;
    }

    public /* synthetic */ TopupOfferResponse(String str, String str2, String str3, StvPackageCollection stvPackageCollection, String str4, String str5, String str6, String str7, String str8, String str9, Integer num, String str10, String str11, String str12, String str13, String str14, String str15, String str16, String str17, String str18, String str19, String str20, String str21, String str22, int i, DefaultConstructorMarker defaultConstructorMarker) {
        this((i & 1) != 0 ? null : str, (i & 2) != 0 ? null : str2, (i & 4) != 0 ? null : str3, (i & 8) != 0 ? null : stvPackageCollection, (i & 16) != 0 ? null : str4, (i & 32) != 0 ? null : str5, (i & 64) != 0 ? null : str6, (i & 128) != 0 ? null : str7, (i & 256) != 0 ? null : str8, (i & 512) != 0 ? null : str9, (i & 1024) != 0 ? null : num, (i & 2048) != 0 ? null : str10, (i & 4096) != 0 ? null : str11, (i & 8192) != 0 ? null : str12, (i & 16384) != 0 ? null : str13, (i & 32768) != 0 ? null : str14, (i & 65536) != 0 ? "" : str15, (i & 131072) != 0 ? "" : str16, (i & 262144) != 0 ? "" : str17, (i & 524288) != 0 ? RequestKt.REQUESTER_APPLICATION : str18, (i & 1048576) != 0 ? "" : str19, (i & 2097152) != 0 ? "" : str20, (i & 4194304) != 0 ? "" : str21, (i & 8388608) == 0 ? str22 : "");
    }

    /* JADX WARN: Illegal instructions before constructor call */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public TopupOfferResponse(@org.jetbrains.annotations.NotNull android.os.Parcel r28) {
        /*
            r27 = this;
            r0 = r28
            java.lang.String r1 = "parcel"
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(r0, r1)
            java.lang.String r3 = r28.readString()
            java.lang.String r4 = r28.readString()
            java.lang.String r5 = r28.readString()
            java.lang.Class<th.co.dtac.android.dtacone.model.stv.StvPackageCollection> r1 = th.p047co.dtac.android.dtacone.model.stv.StvPackageCollection.class
            java.lang.ClassLoader r1 = r1.getClassLoader()
            android.os.Parcelable r1 = r0.readParcelable(r1)
            r6 = r1
            th.co.dtac.android.dtacone.model.stv.StvPackageCollection r6 = (th.p047co.dtac.android.dtacone.model.stv.StvPackageCollection) r6
            java.lang.String r7 = r28.readString()
            java.lang.String r8 = r28.readString()
            java.lang.String r9 = r28.readString()
            java.lang.String r10 = r28.readString()
            java.lang.String r11 = r28.readString()
            java.lang.String r12 = r28.readString()
            java.lang.Class r1 = java.lang.Integer.TYPE
            java.lang.ClassLoader r1 = r1.getClassLoader()
            java.lang.Object r1 = r0.readValue(r1)
            boolean r2 = r1 instanceof java.lang.Integer
            if (r2 == 0) goto L4a
            java.lang.Integer r1 = (java.lang.Integer) r1
        L48:
            r13 = r1
            goto L4c
        L4a:
            r1 = 0
            goto L48
        L4c:
            java.lang.String r14 = r28.readString()
            java.lang.String r15 = r28.readString()
            java.lang.String r16 = r28.readString()
            java.lang.String r17 = r28.readString()
            java.lang.String r18 = r28.readString()
            java.lang.String r19 = r28.readString()
            java.lang.String r20 = r28.readString()
            java.lang.String r21 = r28.readString()
            java.lang.String r22 = r28.readString()
            java.lang.String r1 = r28.readString()
            r23 = r1
            kotlin.jvm.internal.Intrinsics.checkNotNull(r1)
            java.lang.String r1 = r28.readString()
            r24 = r1
            kotlin.jvm.internal.Intrinsics.checkNotNull(r1)
            java.lang.String r1 = r28.readString()
            r25 = r1
            kotlin.jvm.internal.Intrinsics.checkNotNull(r1)
            java.lang.String r0 = r28.readString()
            r26 = r0
            kotlin.jvm.internal.Intrinsics.checkNotNull(r0)
            r2 = r27
            r2.<init>(r3, r4, r5, r6, r7, r8, r9, r10, r11, r12, r13, r14, r15, r16, r17, r18, r19, r20, r21, r22, r23, r24, r25, r26)
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: th.p047co.dtac.android.dtacone.model.topup.offer.TopupOfferResponse.<init>(android.os.Parcel):void");
    }
}
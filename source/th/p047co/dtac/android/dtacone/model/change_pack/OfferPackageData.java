package th.p047co.dtac.android.dtacone.model.change_pack;

import android.os.Parcel;
import android.os.Parcelable;
import androidx.compose.runtime.internal.StabilityInferred;
import java.util.List;
import kotlin.Metadata;
import kotlin.jvm.JvmField;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import th.p047co.dtac.android.dtacone.model.customerenquiry.Offer;
import th.p047co.dtac.android.dtacone.view.fragment.mrtr_prepaid_registration.family_sim.InputPostpaidFamilySimSubscriberFragment;

@StabilityInferred(parameters = 0)
@Metadata(m28851d1 = {"\u0000B\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010 \n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0018\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0010\u0002\n\u0002\b\u0004\b\u0087\b\u0018\u0000 .2\u00020\u0001:\u0001.B\u000f\b\u0016\u0012\u0006\u0010\u0002\u001a\u00020\u0003¢\u0006\u0002\u0010\u0004BQ\u0012\b\u0010\u0005\u001a\u0004\u0018\u00010\u0006\u0012\u000e\u0010\u0007\u001a\n\u0012\u0004\u0012\u00020\u0006\u0018\u00010\b\u0012\b\u0010\t\u001a\u0004\u0018\u00010\n\u0012\b\u0010\u000b\u001a\u0004\u0018\u00010\n\u0012\b\u0010\f\u001a\u0004\u0018\u00010\n\u0012\b\u0010\r\u001a\u0004\u0018\u00010\n\u0012\b\u0010\u000e\u001a\u0004\u0018\u00010\n¢\u0006\u0002\u0010\u000fJ\u000b\u0010\u001a\u001a\u0004\u0018\u00010\u0006HÆ\u0003J\u0011\u0010\u001b\u001a\n\u0012\u0004\u0012\u00020\u0006\u0018\u00010\bHÆ\u0003J\u000b\u0010\u001c\u001a\u0004\u0018\u00010\nHÆ\u0003J\u000b\u0010\u001d\u001a\u0004\u0018\u00010\nHÆ\u0003J\u000b\u0010\u001e\u001a\u0004\u0018\u00010\nHÆ\u0003J\u000b\u0010\u001f\u001a\u0004\u0018\u00010\nHÆ\u0003J\u000b\u0010 \u001a\u0004\u0018\u00010\nHÆ\u0003Jc\u0010!\u001a\u00020\u00002\n\b\u0002\u0010\u0005\u001a\u0004\u0018\u00010\u00062\u0010\b\u0002\u0010\u0007\u001a\n\u0012\u0004\u0012\u00020\u0006\u0018\u00010\b2\n\b\u0002\u0010\t\u001a\u0004\u0018\u00010\n2\n\b\u0002\u0010\u000b\u001a\u0004\u0018\u00010\n2\n\b\u0002\u0010\f\u001a\u0004\u0018\u00010\n2\n\b\u0002\u0010\r\u001a\u0004\u0018\u00010\n2\n\b\u0002\u0010\u000e\u001a\u0004\u0018\u00010\nHÆ\u0001J\b\u0010\"\u001a\u00020#H\u0016J\u0013\u0010$\u001a\u00020%2\b\u0010&\u001a\u0004\u0018\u00010'HÖ\u0003J\t\u0010(\u001a\u00020#HÖ\u0001J\t\u0010)\u001a\u00020\nHÖ\u0001J\u0018\u0010*\u001a\u00020+2\u0006\u0010,\u001a\u00020\u00032\u0006\u0010-\u001a\u00020#H\u0016R\u0019\u0010\u0007\u001a\n\u0012\u0004\u0012\u00020\u0006\u0018\u00010\b¢\u0006\b\n\u0000\u001a\u0004\b\u0010\u0010\u0011R\u0013\u0010\f\u001a\u0004\u0018\u00010\n¢\u0006\b\n\u0000\u001a\u0004\b\u0012\u0010\u0013R\u0013\u0010\r\u001a\u0004\u0018\u00010\n¢\u0006\b\n\u0000\u001a\u0004\b\u0014\u0010\u0013R\u0013\u0010\u000b\u001a\u0004\u0018\u00010\n¢\u0006\b\n\u0000\u001a\u0004\b\u0015\u0010\u0013R\u0013\u0010\u000e\u001a\u0004\u0018\u00010\n¢\u0006\b\n\u0000\u001a\u0004\b\u0016\u0010\u0013R\u0013\u0010\u0005\u001a\u0004\u0018\u00010\u0006¢\u0006\b\n\u0000\u001a\u0004\b\u0017\u0010\u0018R\u0013\u0010\t\u001a\u0004\u0018\u00010\n¢\u0006\b\n\u0000\u001a\u0004\b\u0019\u0010\u0013¨\u0006/"}, m28850d2 = {"Lth/co/dtac/android/dtacone/model/change_pack/OfferPackageData;", "Landroid/os/Parcelable;", "source", "Landroid/os/Parcel;", "(Landroid/os/Parcel;)V", "selectedOffer", "Lth/co/dtac/android/dtacone/model/customerenquiry/Offer;", "offers", "", InputPostpaidFamilySimSubscriberFragment.SUB_NUM, "", "requesterId", "requesterApplication", "requesterChannel", "requesterZone", "(Lth/co/dtac/android/dtacone/model/customerenquiry/Offer;Ljava/util/List;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)V", "getOffers", "()Ljava/util/List;", "getRequesterApplication", "()Ljava/lang/String;", "getRequesterChannel", "getRequesterId", "getRequesterZone", "getSelectedOffer", "()Lth/co/dtac/android/dtacone/model/customerenquiry/Offer;", "getSubscriberNumber", "component1", "component2", "component3", "component4", "component5", "component6", "component7", "copy", "describeContents", "", "equals", "", "other", "", "hashCode", "toString", "writeToParcel", "", "dest", "flags", "Companion", "app_prodRelease"}, m28849k = 1, m28848mv = {1, 8, 0}, m28846xi = 48)
/* renamed from: th.co.dtac.android.dtacone.model.change_pack.OfferPackageData */
/* loaded from: classes8.dex */
public final class OfferPackageData implements Parcelable {
    @Nullable
    private final List<Offer> offers;
    @Nullable
    private final String requesterApplication;
    @Nullable
    private final String requesterChannel;
    @Nullable
    private final String requesterId;
    @Nullable
    private final String requesterZone;
    @Nullable
    private final Offer selectedOffer;
    @Nullable
    private final String subscriberNumber;
    @NotNull
    public static final Companion Companion = new Companion(null);
    public static final int $stable = 8;
    @JvmField
    @NotNull
    public static final Parcelable.Creator<OfferPackageData> CREATOR = new Parcelable.Creator<OfferPackageData>() { // from class: th.co.dtac.android.dtacone.model.change_pack.OfferPackageData$Companion$CREATOR$1
        @Override // android.os.Parcelable.Creator
        @NotNull
        public OfferPackageData createFromParcel(@NotNull Parcel source) {
            Intrinsics.checkNotNullParameter(source, "source");
            return new OfferPackageData(source);
        }

        @Override // android.os.Parcelable.Creator
        @NotNull
        public OfferPackageData[] newArray(int i) {
            return new OfferPackageData[i];
        }
    };

    @Metadata(m28851d1 = {"\u0000\u0016\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0086\u0003\u0018\u00002\u00020\u0001B\u0007\b\u0002¢\u0006\u0002\u0010\u0002R\u0016\u0010\u0003\u001a\b\u0012\u0004\u0012\u00020\u00050\u00048\u0006X\u0087\u0004¢\u0006\u0002\n\u0000¨\u0006\u0006"}, m28850d2 = {"Lth/co/dtac/android/dtacone/model/change_pack/OfferPackageData$Companion;", "", "()V", "CREATOR", "Landroid/os/Parcelable$Creator;", "Lth/co/dtac/android/dtacone/model/change_pack/OfferPackageData;", "app_prodRelease"}, m28849k = 1, m28848mv = {1, 8, 0}, m28846xi = 48)
    /* renamed from: th.co.dtac.android.dtacone.model.change_pack.OfferPackageData$Companion */
    /* loaded from: classes8.dex */
    public static final class Companion {
        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        private Companion() {
        }
    }

    public OfferPackageData(@Nullable Offer offer, @Nullable List<Offer> list, @Nullable String str, @Nullable String str2, @Nullable String str3, @Nullable String str4, @Nullable String str5) {
        this.selectedOffer = offer;
        this.offers = list;
        this.subscriberNumber = str;
        this.requesterId = str2;
        this.requesterApplication = str3;
        this.requesterChannel = str4;
        this.requesterZone = str5;
    }

    public static /* synthetic */ OfferPackageData copy$default(OfferPackageData offerPackageData, Offer offer, List list, String str, String str2, String str3, String str4, String str5, int i, Object obj) {
        if ((i & 1) != 0) {
            offer = offerPackageData.selectedOffer;
        }
        List<Offer> list2 = list;
        if ((i & 2) != 0) {
            list2 = offerPackageData.offers;
        }
        List list3 = list2;
        if ((i & 4) != 0) {
            str = offerPackageData.subscriberNumber;
        }
        String str6 = str;
        if ((i & 8) != 0) {
            str2 = offerPackageData.requesterId;
        }
        String str7 = str2;
        if ((i & 16) != 0) {
            str3 = offerPackageData.requesterApplication;
        }
        String str8 = str3;
        if ((i & 32) != 0) {
            str4 = offerPackageData.requesterChannel;
        }
        String str9 = str4;
        if ((i & 64) != 0) {
            str5 = offerPackageData.requesterZone;
        }
        return offerPackageData.copy(offer, list3, str6, str7, str8, str9, str5);
    }

    @Nullable
    public final Offer component1() {
        return this.selectedOffer;
    }

    @Nullable
    public final List<Offer> component2() {
        return this.offers;
    }

    @Nullable
    public final String component3() {
        return this.subscriberNumber;
    }

    @Nullable
    public final String component4() {
        return this.requesterId;
    }

    @Nullable
    public final String component5() {
        return this.requesterApplication;
    }

    @Nullable
    public final String component6() {
        return this.requesterChannel;
    }

    @Nullable
    public final String component7() {
        return this.requesterZone;
    }

    @NotNull
    public final OfferPackageData copy(@Nullable Offer offer, @Nullable List<Offer> list, @Nullable String str, @Nullable String str2, @Nullable String str3, @Nullable String str4, @Nullable String str5) {
        return new OfferPackageData(offer, list, str, str2, str3, str4, str5);
    }

    @Override // android.os.Parcelable
    public int describeContents() {
        return 0;
    }

    public boolean equals(@Nullable Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj instanceof OfferPackageData) {
            OfferPackageData offerPackageData = (OfferPackageData) obj;
            return Intrinsics.areEqual(this.selectedOffer, offerPackageData.selectedOffer) && Intrinsics.areEqual(this.offers, offerPackageData.offers) && Intrinsics.areEqual(this.subscriberNumber, offerPackageData.subscriberNumber) && Intrinsics.areEqual(this.requesterId, offerPackageData.requesterId) && Intrinsics.areEqual(this.requesterApplication, offerPackageData.requesterApplication) && Intrinsics.areEqual(this.requesterChannel, offerPackageData.requesterChannel) && Intrinsics.areEqual(this.requesterZone, offerPackageData.requesterZone);
        }
        return false;
    }

    @Nullable
    public final List<Offer> getOffers() {
        return this.offers;
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

    @Nullable
    public final String getRequesterZone() {
        return this.requesterZone;
    }

    @Nullable
    public final Offer getSelectedOffer() {
        return this.selectedOffer;
    }

    @Nullable
    public final String getSubscriberNumber() {
        return this.subscriberNumber;
    }

    public int hashCode() {
        Offer offer = this.selectedOffer;
        int hashCode = (offer == null ? 0 : offer.hashCode()) * 31;
        List<Offer> list = this.offers;
        int hashCode2 = (hashCode + (list == null ? 0 : list.hashCode())) * 31;
        String str = this.subscriberNumber;
        int hashCode3 = (hashCode2 + (str == null ? 0 : str.hashCode())) * 31;
        String str2 = this.requesterId;
        int hashCode4 = (hashCode3 + (str2 == null ? 0 : str2.hashCode())) * 31;
        String str3 = this.requesterApplication;
        int hashCode5 = (hashCode4 + (str3 == null ? 0 : str3.hashCode())) * 31;
        String str4 = this.requesterChannel;
        int hashCode6 = (hashCode5 + (str4 == null ? 0 : str4.hashCode())) * 31;
        String str5 = this.requesterZone;
        return hashCode6 + (str5 != null ? str5.hashCode() : 0);
    }

    @NotNull
    public String toString() {
        Offer offer = this.selectedOffer;
        List<Offer> list = this.offers;
        String str = this.subscriberNumber;
        String str2 = this.requesterId;
        String str3 = this.requesterApplication;
        String str4 = this.requesterChannel;
        String str5 = this.requesterZone;
        return "OfferPackageData(selectedOffer=" + offer + ", offers=" + list + ", subscriberNumber=" + str + ", requesterId=" + str2 + ", requesterApplication=" + str3 + ", requesterChannel=" + str4 + ", requesterZone=" + str5 + ")";
    }

    @Override // android.os.Parcelable
    public void writeToParcel(@NotNull Parcel dest, int i) {
        Intrinsics.checkNotNullParameter(dest, "dest");
        dest.writeParcelable(this.selectedOffer, 0);
        dest.writeTypedList(this.offers);
        dest.writeString(this.subscriberNumber);
        dest.writeString(this.requesterId);
        dest.writeString(this.requesterApplication);
        dest.writeString(this.requesterChannel);
        dest.writeString(this.requesterZone);
    }

    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    public OfferPackageData(@NotNull Parcel source) {
        this((Offer) source.readParcelable(Offer.class.getClassLoader()), source.createTypedArrayList(Offer.CREATOR), source.readString(), source.readString(), source.readString(), source.readString(), source.readString());
        Intrinsics.checkNotNullParameter(source, "source");
    }
}

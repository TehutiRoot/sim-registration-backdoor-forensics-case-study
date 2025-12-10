package th.p047co.dtac.android.dtacone.app_one.model.stv;

import android.os.Parcel;
import android.os.Parcelable;
import androidx.compose.runtime.internal.StabilityInferred;
import com.google.gson.annotations.SerializedName;
import com.tom_roush.pdfbox.contentstream.operator.OperatorName;
import com.tom_roush.pdfbox.pdmodel.common.PDPageLabelRange;
import kotlin.Metadata;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import kotlinx.android.parcel.Parcelize;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import th.p047co.dtac.android.dtacone.view.fragment.mrtr_prepaid_registration.family_sim.InputPostpaidFamilySimSubscriberFragment;

@StabilityInferred(parameters = 0)
@Parcelize
@Metadata(m29143d1 = {"\u0000J\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0003\n\u0002\u0010\u0007\n\u0002\b\u0014\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0002\n\u0002\b\u0019\b\u0087\b\u0018\u00002\u00020\u0001:\u0002BCBg\u0012\n\b\u0002\u0010\u0003\u001a\u0004\u0018\u00010\u0002\u0012\n\b\u0002\u0010\u0005\u001a\u0004\u0018\u00010\u0004\u0012\n\b\u0002\u0010\u0007\u001a\u0004\u0018\u00010\u0006\u0012\n\b\u0002\u0010\b\u001a\u0004\u0018\u00010\u0006\u0012\n\b\u0002\u0010\t\u001a\u0004\u0018\u00010\u0006\u0012\n\b\u0002\u0010\u000b\u001a\u0004\u0018\u00010\n\u0012\n\b\u0002\u0010\f\u001a\u0004\u0018\u00010\u0006\u0012\n\b\u0002\u0010\r\u001a\u0004\u0018\u00010\u0006¢\u0006\u0004\b\u000e\u0010\u000fJ\u0012\u0010\u0010\u001a\u0004\u0018\u00010\u0002HÆ\u0003¢\u0006\u0004\b\u0010\u0010\u0011J\u0012\u0010\u0012\u001a\u0004\u0018\u00010\u0004HÆ\u0003¢\u0006\u0004\b\u0012\u0010\u0013J\u0012\u0010\u0014\u001a\u0004\u0018\u00010\u0006HÆ\u0003¢\u0006\u0004\b\u0014\u0010\u0015J\u0012\u0010\u0016\u001a\u0004\u0018\u00010\u0006HÆ\u0003¢\u0006\u0004\b\u0016\u0010\u0015J\u0012\u0010\u0017\u001a\u0004\u0018\u00010\u0006HÆ\u0003¢\u0006\u0004\b\u0017\u0010\u0015J\u0012\u0010\u0018\u001a\u0004\u0018\u00010\nHÆ\u0003¢\u0006\u0004\b\u0018\u0010\u0019J\u0012\u0010\u001a\u001a\u0004\u0018\u00010\u0006HÆ\u0003¢\u0006\u0004\b\u001a\u0010\u0015J\u0012\u0010\u001b\u001a\u0004\u0018\u00010\u0006HÆ\u0003¢\u0006\u0004\b\u001b\u0010\u0015Jp\u0010\u001c\u001a\u00020\u00002\n\b\u0002\u0010\u0003\u001a\u0004\u0018\u00010\u00022\n\b\u0002\u0010\u0005\u001a\u0004\u0018\u00010\u00042\n\b\u0002\u0010\u0007\u001a\u0004\u0018\u00010\u00062\n\b\u0002\u0010\b\u001a\u0004\u0018\u00010\u00062\n\b\u0002\u0010\t\u001a\u0004\u0018\u00010\u00062\n\b\u0002\u0010\u000b\u001a\u0004\u0018\u00010\n2\n\b\u0002\u0010\f\u001a\u0004\u0018\u00010\u00062\n\b\u0002\u0010\r\u001a\u0004\u0018\u00010\u0006HÆ\u0001¢\u0006\u0004\b\u001c\u0010\u001dJ\u0010\u0010\u001e\u001a\u00020\u0006HÖ\u0001¢\u0006\u0004\b\u001e\u0010\u0015J\u0010\u0010 \u001a\u00020\u001fHÖ\u0001¢\u0006\u0004\b \u0010!J\u001a\u0010%\u001a\u00020$2\b\u0010#\u001a\u0004\u0018\u00010\"HÖ\u0003¢\u0006\u0004\b%\u0010&J\u0010\u0010'\u001a\u00020\u001fHÖ\u0001¢\u0006\u0004\b'\u0010!J \u0010,\u001a\u00020+2\u0006\u0010)\u001a\u00020(2\u0006\u0010*\u001a\u00020\u001fHÖ\u0001¢\u0006\u0004\b,\u0010-R\u001c\u0010\u0003\u001a\u0004\u0018\u00010\u00028\u0006X\u0087\u0004¢\u0006\f\n\u0004\b.\u0010/\u001a\u0004\b0\u0010\u0011R\u001c\u0010\u0005\u001a\u0004\u0018\u00010\u00048\u0006X\u0087\u0004¢\u0006\f\n\u0004\b1\u00102\u001a\u0004\b3\u0010\u0013R\u001c\u0010\u0007\u001a\u0004\u0018\u00010\u00068\u0006X\u0087\u0004¢\u0006\f\n\u0004\b4\u00105\u001a\u0004\b6\u0010\u0015R\u001c\u0010\b\u001a\u0004\u0018\u00010\u00068\u0006X\u0087\u0004¢\u0006\f\n\u0004\b7\u00105\u001a\u0004\b8\u0010\u0015R\u001c\u0010\t\u001a\u0004\u0018\u00010\u00068\u0006X\u0087\u0004¢\u0006\f\n\u0004\b9\u00105\u001a\u0004\b:\u0010\u0015R\u001c\u0010\u000b\u001a\u0004\u0018\u00010\n8\u0006X\u0087\u0004¢\u0006\f\n\u0004\b;\u0010<\u001a\u0004\b=\u0010\u0019R\u001c\u0010\f\u001a\u0004\u0018\u00010\u00068\u0006X\u0087\u0004¢\u0006\f\n\u0004\b>\u00105\u001a\u0004\b?\u0010\u0015R\u001c\u0010\r\u001a\u0004\u0018\u00010\u00068\u0006X\u0087\u0004¢\u0006\f\n\u0004\b@\u00105\u001a\u0004\bA\u0010\u0015¨\u0006D"}, m29142d2 = {"Lth/co/dtac/android/dtacone/app_one/model/stv/OneSTVProsermRequest;", "Landroid/os/Parcelable;", "Lth/co/dtac/android/dtacone/app_one/model/stv/OneSTVProsermRequest$Offer;", "offer", "Lth/co/dtac/android/dtacone/app_one/model/stv/OneSTVProsermRequest$Proserm;", "proserm", "", "packageCode", InputPostpaidFamilySimSubscriberFragment.SUB_NUM, "ussdServiceCode", "", "commissionValue", "confirmMultiTrans", "pin", "<init>", "(Lth/co/dtac/android/dtacone/app_one/model/stv/OneSTVProsermRequest$Offer;Lth/co/dtac/android/dtacone/app_one/model/stv/OneSTVProsermRequest$Proserm;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/Float;Ljava/lang/String;Ljava/lang/String;)V", "component1", "()Lth/co/dtac/android/dtacone/app_one/model/stv/OneSTVProsermRequest$Offer;", "component2", "()Lth/co/dtac/android/dtacone/app_one/model/stv/OneSTVProsermRequest$Proserm;", "component3", "()Ljava/lang/String;", "component4", "component5", "component6", "()Ljava/lang/Float;", "component7", "component8", "copy", "(Lth/co/dtac/android/dtacone/app_one/model/stv/OneSTVProsermRequest$Offer;Lth/co/dtac/android/dtacone/app_one/model/stv/OneSTVProsermRequest$Proserm;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/Float;Ljava/lang/String;Ljava/lang/String;)Lth/co/dtac/android/dtacone/app_one/model/stv/OneSTVProsermRequest;", "toString", "", "hashCode", "()I", "", "other", "", "equals", "(Ljava/lang/Object;)Z", "describeContents", "Landroid/os/Parcel;", "parcel", "flags", "", "writeToParcel", "(Landroid/os/Parcel;I)V", PDPageLabelRange.STYLE_LETTERS_LOWER, "Lth/co/dtac/android/dtacone/app_one/model/stv/OneSTVProsermRequest$Offer;", "getOffer", OperatorName.CLOSE_FILL_NON_ZERO_AND_STROKE, "Lth/co/dtac/android/dtacone/app_one/model/stv/OneSTVProsermRequest$Proserm;", "getProserm", OperatorName.CURVE_TO, "Ljava/lang/String;", "getPackageCode", "d", "getSubscriberNumber", "e", "getUssdServiceCode", OperatorName.FILL_NON_ZERO, "Ljava/lang/Float;", "getCommissionValue", OperatorName.NON_STROKING_GRAY, "getConfirmMultiTrans", OperatorName.CLOSE_PATH, "getPin", "Offer", "Proserm", "app_prodRelease"}, m29141k = 1, m29140mv = {1, 8, 0})
/* renamed from: th.co.dtac.android.dtacone.app_one.model.stv.OneSTVProsermRequest */
/* loaded from: classes7.dex */
public final class OneSTVProsermRequest implements Parcelable {
    public static final int $stable = 0;
    @NotNull
    public static final Parcelable.Creator<OneSTVProsermRequest> CREATOR = new Creator();
    @SerializedName("offer")
    @Nullable

    /* renamed from: a */
    private final Offer f82218a;
    @SerializedName("proserm")
    @Nullable

    /* renamed from: b */
    private final Proserm f82219b;
    @SerializedName("packageCode")
    @Nullable

    /* renamed from: c */
    private final String f82220c;
    @SerializedName(InputPostpaidFamilySimSubscriberFragment.SUB_NUM)
    @Nullable

    /* renamed from: d */
    private final String f82221d;
    @SerializedName("ussdServiceCode")
    @Nullable

    /* renamed from: e */
    private final String f82222e;
    @SerializedName("commissionValue")
    @Nullable

    /* renamed from: f */
    private final Float f82223f;
    @SerializedName("confirmMultiTrans")
    @Nullable

    /* renamed from: g */
    private final String f82224g;
    @SerializedName("pin")
    @Nullable

    /* renamed from: h */
    private final String f82225h;

    @Metadata(m29141k = 3, m29140mv = {1, 8, 0}, m29138xi = 48)
    /* renamed from: th.co.dtac.android.dtacone.app_one.model.stv.OneSTVProsermRequest$Creator */
    /* loaded from: classes7.dex */
    public static final class Creator implements Parcelable.Creator<OneSTVProsermRequest> {
        @Override // android.os.Parcelable.Creator
        @NotNull
        public final OneSTVProsermRequest createFromParcel(@NotNull Parcel parcel) {
            Intrinsics.checkNotNullParameter(parcel, "parcel");
            return new OneSTVProsermRequest(parcel.readInt() == 0 ? null : Offer.CREATOR.createFromParcel(parcel), parcel.readInt() == 0 ? null : Proserm.CREATOR.createFromParcel(parcel), parcel.readString(), parcel.readString(), parcel.readString(), parcel.readInt() == 0 ? null : Float.valueOf(parcel.readFloat()), parcel.readString(), parcel.readString());
        }

        @Override // android.os.Parcelable.Creator
        @NotNull
        public final OneSTVProsermRequest[] newArray(int i) {
            return new OneSTVProsermRequest[i];
        }
    }

    @StabilityInferred(parameters = 0)
    @Parcelize
    @Metadata(m29143d1 = {"\u00006\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\b\f\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0002\n\u0002\b\n\b\u0087\b\u0018\u00002\u00020\u0001B+\u0012\n\b\u0002\u0010\u0003\u001a\u0004\u0018\u00010\u0002\u0012\n\b\u0002\u0010\u0004\u001a\u0004\u0018\u00010\u0002\u0012\n\b\u0002\u0010\u0005\u001a\u0004\u0018\u00010\u0002¢\u0006\u0004\b\u0006\u0010\u0007J\u0012\u0010\b\u001a\u0004\u0018\u00010\u0002HÆ\u0003¢\u0006\u0004\b\b\u0010\tJ\u0012\u0010\n\u001a\u0004\u0018\u00010\u0002HÆ\u0003¢\u0006\u0004\b\n\u0010\tJ\u0012\u0010\u000b\u001a\u0004\u0018\u00010\u0002HÆ\u0003¢\u0006\u0004\b\u000b\u0010\tJ4\u0010\f\u001a\u00020\u00002\n\b\u0002\u0010\u0003\u001a\u0004\u0018\u00010\u00022\n\b\u0002\u0010\u0004\u001a\u0004\u0018\u00010\u00022\n\b\u0002\u0010\u0005\u001a\u0004\u0018\u00010\u0002HÆ\u0001¢\u0006\u0004\b\f\u0010\rJ\u0010\u0010\u000e\u001a\u00020\u0002HÖ\u0001¢\u0006\u0004\b\u000e\u0010\tJ\u0010\u0010\u0010\u001a\u00020\u000fHÖ\u0001¢\u0006\u0004\b\u0010\u0010\u0011J\u001a\u0010\u0015\u001a\u00020\u00142\b\u0010\u0013\u001a\u0004\u0018\u00010\u0012HÖ\u0003¢\u0006\u0004\b\u0015\u0010\u0016J\u0010\u0010\u0017\u001a\u00020\u000fHÖ\u0001¢\u0006\u0004\b\u0017\u0010\u0011J \u0010\u001c\u001a\u00020\u001b2\u0006\u0010\u0019\u001a\u00020\u00182\u0006\u0010\u001a\u001a\u00020\u000fHÖ\u0001¢\u0006\u0004\b\u001c\u0010\u001dR\u001c\u0010\u0003\u001a\u0004\u0018\u00010\u00028\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\u001e\u0010\u001f\u001a\u0004\b \u0010\tR\u001c\u0010\u0004\u001a\u0004\u0018\u00010\u00028\u0006X\u0087\u0004¢\u0006\f\n\u0004\b!\u0010\u001f\u001a\u0004\b\"\u0010\tR\u001c\u0010\u0005\u001a\u0004\u0018\u00010\u00028\u0006X\u0087\u0004¢\u0006\f\n\u0004\b#\u0010\u001f\u001a\u0004\b$\u0010\t¨\u0006%"}, m29142d2 = {"Lth/co/dtac/android/dtacone/app_one/model/stv/OneSTVProsermRequest$Offer;", "Landroid/os/Parcelable;", "", "offerType", "flowId", "transactionId", "<init>", "(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)V", "component1", "()Ljava/lang/String;", "component2", "component3", "copy", "(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)Lth/co/dtac/android/dtacone/app_one/model/stv/OneSTVProsermRequest$Offer;", "toString", "", "hashCode", "()I", "", "other", "", "equals", "(Ljava/lang/Object;)Z", "describeContents", "Landroid/os/Parcel;", "parcel", "flags", "", "writeToParcel", "(Landroid/os/Parcel;I)V", PDPageLabelRange.STYLE_LETTERS_LOWER, "Ljava/lang/String;", "getOfferType", OperatorName.CLOSE_FILL_NON_ZERO_AND_STROKE, "getFlowId", OperatorName.CURVE_TO, "getTransactionId", "app_prodRelease"}, m29141k = 1, m29140mv = {1, 8, 0})
    /* renamed from: th.co.dtac.android.dtacone.app_one.model.stv.OneSTVProsermRequest$Offer */
    /* loaded from: classes7.dex */
    public static final class Offer implements Parcelable {
        public static final int $stable = 0;
        @NotNull
        public static final Parcelable.Creator<Offer> CREATOR = new Creator();
        @SerializedName("offerType")
        @Nullable

        /* renamed from: a */
        private final String f82226a;
        @SerializedName("flowId")
        @Nullable

        /* renamed from: b */
        private final String f82227b;
        @SerializedName("transactionId")
        @Nullable

        /* renamed from: c */
        private final String f82228c;

        @Metadata(m29141k = 3, m29140mv = {1, 8, 0}, m29138xi = 48)
        /* renamed from: th.co.dtac.android.dtacone.app_one.model.stv.OneSTVProsermRequest$Offer$Creator */
        /* loaded from: classes7.dex */
        public static final class Creator implements Parcelable.Creator<Offer> {
            @Override // android.os.Parcelable.Creator
            @NotNull
            public final Offer createFromParcel(@NotNull Parcel parcel) {
                Intrinsics.checkNotNullParameter(parcel, "parcel");
                return new Offer(parcel.readString(), parcel.readString(), parcel.readString());
            }

            @Override // android.os.Parcelable.Creator
            @NotNull
            public final Offer[] newArray(int i) {
                return new Offer[i];
            }
        }

        public Offer() {
            this(null, null, null, 7, null);
        }

        public static /* synthetic */ Offer copy$default(Offer offer, String str, String str2, String str3, int i, Object obj) {
            if ((i & 1) != 0) {
                str = offer.f82226a;
            }
            if ((i & 2) != 0) {
                str2 = offer.f82227b;
            }
            if ((i & 4) != 0) {
                str3 = offer.f82228c;
            }
            return offer.copy(str, str2, str3);
        }

        @Nullable
        public final String component1() {
            return this.f82226a;
        }

        @Nullable
        public final String component2() {
            return this.f82227b;
        }

        @Nullable
        public final String component3() {
            return this.f82228c;
        }

        @NotNull
        public final Offer copy(@Nullable String str, @Nullable String str2, @Nullable String str3) {
            return new Offer(str, str2, str3);
        }

        @Override // android.os.Parcelable
        public int describeContents() {
            return 0;
        }

        public boolean equals(@Nullable Object obj) {
            if (this == obj) {
                return true;
            }
            if (obj instanceof Offer) {
                Offer offer = (Offer) obj;
                return Intrinsics.areEqual(this.f82226a, offer.f82226a) && Intrinsics.areEqual(this.f82227b, offer.f82227b) && Intrinsics.areEqual(this.f82228c, offer.f82228c);
            }
            return false;
        }

        @Nullable
        public final String getFlowId() {
            return this.f82227b;
        }

        @Nullable
        public final String getOfferType() {
            return this.f82226a;
        }

        @Nullable
        public final String getTransactionId() {
            return this.f82228c;
        }

        public int hashCode() {
            String str = this.f82226a;
            int hashCode = (str == null ? 0 : str.hashCode()) * 31;
            String str2 = this.f82227b;
            int hashCode2 = (hashCode + (str2 == null ? 0 : str2.hashCode())) * 31;
            String str3 = this.f82228c;
            return hashCode2 + (str3 != null ? str3.hashCode() : 0);
        }

        @NotNull
        public String toString() {
            String str = this.f82226a;
            String str2 = this.f82227b;
            String str3 = this.f82228c;
            return "Offer(offerType=" + str + ", flowId=" + str2 + ", transactionId=" + str3 + ")";
        }

        @Override // android.os.Parcelable
        public void writeToParcel(@NotNull Parcel out, int i) {
            Intrinsics.checkNotNullParameter(out, "out");
            out.writeString(this.f82226a);
            out.writeString(this.f82227b);
            out.writeString(this.f82228c);
        }

        public Offer(@Nullable String str, @Nullable String str2, @Nullable String str3) {
            this.f82226a = str;
            this.f82227b = str2;
            this.f82228c = str3;
        }

        public /* synthetic */ Offer(String str, String str2, String str3, int i, DefaultConstructorMarker defaultConstructorMarker) {
            this((i & 1) != 0 ? null : str, (i & 2) != 0 ? null : str2, (i & 4) != 0 ? null : str3);
        }
    }

    @StabilityInferred(parameters = 0)
    @Parcelize
    @Metadata(m29143d1 = {"\u00006\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\b\f\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0002\n\u0002\b\n\b\u0087\b\u0018\u00002\u00020\u0001B+\u0012\n\b\u0002\u0010\u0003\u001a\u0004\u0018\u00010\u0002\u0012\n\b\u0002\u0010\u0004\u001a\u0004\u0018\u00010\u0002\u0012\n\b\u0002\u0010\u0005\u001a\u0004\u0018\u00010\u0002¢\u0006\u0004\b\u0006\u0010\u0007J\u0012\u0010\b\u001a\u0004\u0018\u00010\u0002HÆ\u0003¢\u0006\u0004\b\b\u0010\tJ\u0012\u0010\n\u001a\u0004\u0018\u00010\u0002HÆ\u0003¢\u0006\u0004\b\n\u0010\tJ\u0012\u0010\u000b\u001a\u0004\u0018\u00010\u0002HÆ\u0003¢\u0006\u0004\b\u000b\u0010\tJ4\u0010\f\u001a\u00020\u00002\n\b\u0002\u0010\u0003\u001a\u0004\u0018\u00010\u00022\n\b\u0002\u0010\u0004\u001a\u0004\u0018\u00010\u00022\n\b\u0002\u0010\u0005\u001a\u0004\u0018\u00010\u0002HÆ\u0001¢\u0006\u0004\b\f\u0010\rJ\u0010\u0010\u000e\u001a\u00020\u0002HÖ\u0001¢\u0006\u0004\b\u000e\u0010\tJ\u0010\u0010\u0010\u001a\u00020\u000fHÖ\u0001¢\u0006\u0004\b\u0010\u0010\u0011J\u001a\u0010\u0015\u001a\u00020\u00142\b\u0010\u0013\u001a\u0004\u0018\u00010\u0012HÖ\u0003¢\u0006\u0004\b\u0015\u0010\u0016J\u0010\u0010\u0017\u001a\u00020\u000fHÖ\u0001¢\u0006\u0004\b\u0017\u0010\u0011J \u0010\u001c\u001a\u00020\u001b2\u0006\u0010\u0019\u001a\u00020\u00182\u0006\u0010\u001a\u001a\u00020\u000fHÖ\u0001¢\u0006\u0004\b\u001c\u0010\u001dR\u001c\u0010\u0003\u001a\u0004\u0018\u00010\u00028\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\u001e\u0010\u001f\u001a\u0004\b \u0010\tR\u001c\u0010\u0004\u001a\u0004\u0018\u00010\u00028\u0006X\u0087\u0004¢\u0006\f\n\u0004\b!\u0010\u001f\u001a\u0004\b\"\u0010\tR\u001c\u0010\u0005\u001a\u0004\u0018\u00010\u00028\u0006X\u0087\u0004¢\u0006\f\n\u0004\b#\u0010\u001f\u001a\u0004\b$\u0010\t¨\u0006%"}, m29142d2 = {"Lth/co/dtac/android/dtacone/app_one/model/stv/OneSTVProsermRequest$Proserm;", "Landroid/os/Parcelable;", "", "type", "flowId", "transactionIdSift", "<init>", "(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)V", "component1", "()Ljava/lang/String;", "component2", "component3", "copy", "(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)Lth/co/dtac/android/dtacone/app_one/model/stv/OneSTVProsermRequest$Proserm;", "toString", "", "hashCode", "()I", "", "other", "", "equals", "(Ljava/lang/Object;)Z", "describeContents", "Landroid/os/Parcel;", "parcel", "flags", "", "writeToParcel", "(Landroid/os/Parcel;I)V", PDPageLabelRange.STYLE_LETTERS_LOWER, "Ljava/lang/String;", "getType", OperatorName.CLOSE_FILL_NON_ZERO_AND_STROKE, "getFlowId", OperatorName.CURVE_TO, "getTransactionIdSift", "app_prodRelease"}, m29141k = 1, m29140mv = {1, 8, 0})
    /* renamed from: th.co.dtac.android.dtacone.app_one.model.stv.OneSTVProsermRequest$Proserm */
    /* loaded from: classes7.dex */
    public static final class Proserm implements Parcelable {
        public static final int $stable = 0;
        @NotNull
        public static final Parcelable.Creator<Proserm> CREATOR = new Creator();
        @SerializedName("type")
        @Nullable

        /* renamed from: a */
        private final String f82229a;
        @SerializedName("flowId")
        @Nullable

        /* renamed from: b */
        private final String f82230b;
        @SerializedName("transactionIdSift")
        @Nullable

        /* renamed from: c */
        private final String f82231c;

        @Metadata(m29141k = 3, m29140mv = {1, 8, 0}, m29138xi = 48)
        /* renamed from: th.co.dtac.android.dtacone.app_one.model.stv.OneSTVProsermRequest$Proserm$Creator */
        /* loaded from: classes7.dex */
        public static final class Creator implements Parcelable.Creator<Proserm> {
            @Override // android.os.Parcelable.Creator
            @NotNull
            public final Proserm createFromParcel(@NotNull Parcel parcel) {
                Intrinsics.checkNotNullParameter(parcel, "parcel");
                return new Proserm(parcel.readString(), parcel.readString(), parcel.readString());
            }

            @Override // android.os.Parcelable.Creator
            @NotNull
            public final Proserm[] newArray(int i) {
                return new Proserm[i];
            }
        }

        public Proserm() {
            this(null, null, null, 7, null);
        }

        public static /* synthetic */ Proserm copy$default(Proserm proserm, String str, String str2, String str3, int i, Object obj) {
            if ((i & 1) != 0) {
                str = proserm.f82229a;
            }
            if ((i & 2) != 0) {
                str2 = proserm.f82230b;
            }
            if ((i & 4) != 0) {
                str3 = proserm.f82231c;
            }
            return proserm.copy(str, str2, str3);
        }

        @Nullable
        public final String component1() {
            return this.f82229a;
        }

        @Nullable
        public final String component2() {
            return this.f82230b;
        }

        @Nullable
        public final String component3() {
            return this.f82231c;
        }

        @NotNull
        public final Proserm copy(@Nullable String str, @Nullable String str2, @Nullable String str3) {
            return new Proserm(str, str2, str3);
        }

        @Override // android.os.Parcelable
        public int describeContents() {
            return 0;
        }

        public boolean equals(@Nullable Object obj) {
            if (this == obj) {
                return true;
            }
            if (obj instanceof Proserm) {
                Proserm proserm = (Proserm) obj;
                return Intrinsics.areEqual(this.f82229a, proserm.f82229a) && Intrinsics.areEqual(this.f82230b, proserm.f82230b) && Intrinsics.areEqual(this.f82231c, proserm.f82231c);
            }
            return false;
        }

        @Nullable
        public final String getFlowId() {
            return this.f82230b;
        }

        @Nullable
        public final String getTransactionIdSift() {
            return this.f82231c;
        }

        @Nullable
        public final String getType() {
            return this.f82229a;
        }

        public int hashCode() {
            String str = this.f82229a;
            int hashCode = (str == null ? 0 : str.hashCode()) * 31;
            String str2 = this.f82230b;
            int hashCode2 = (hashCode + (str2 == null ? 0 : str2.hashCode())) * 31;
            String str3 = this.f82231c;
            return hashCode2 + (str3 != null ? str3.hashCode() : 0);
        }

        @NotNull
        public String toString() {
            String str = this.f82229a;
            String str2 = this.f82230b;
            String str3 = this.f82231c;
            return "Proserm(type=" + str + ", flowId=" + str2 + ", transactionIdSift=" + str3 + ")";
        }

        @Override // android.os.Parcelable
        public void writeToParcel(@NotNull Parcel out, int i) {
            Intrinsics.checkNotNullParameter(out, "out");
            out.writeString(this.f82229a);
            out.writeString(this.f82230b);
            out.writeString(this.f82231c);
        }

        public Proserm(@Nullable String str, @Nullable String str2, @Nullable String str3) {
            this.f82229a = str;
            this.f82230b = str2;
            this.f82231c = str3;
        }

        public /* synthetic */ Proserm(String str, String str2, String str3, int i, DefaultConstructorMarker defaultConstructorMarker) {
            this((i & 1) != 0 ? null : str, (i & 2) != 0 ? null : str2, (i & 4) != 0 ? null : str3);
        }
    }

    public OneSTVProsermRequest() {
        this(null, null, null, null, null, null, null, null, 255, null);
    }

    @Nullable
    public final Offer component1() {
        return this.f82218a;
    }

    @Nullable
    public final Proserm component2() {
        return this.f82219b;
    }

    @Nullable
    public final String component3() {
        return this.f82220c;
    }

    @Nullable
    public final String component4() {
        return this.f82221d;
    }

    @Nullable
    public final String component5() {
        return this.f82222e;
    }

    @Nullable
    public final Float component6() {
        return this.f82223f;
    }

    @Nullable
    public final String component7() {
        return this.f82224g;
    }

    @Nullable
    public final String component8() {
        return this.f82225h;
    }

    @NotNull
    public final OneSTVProsermRequest copy(@Nullable Offer offer, @Nullable Proserm proserm, @Nullable String str, @Nullable String str2, @Nullable String str3, @Nullable Float f, @Nullable String str4, @Nullable String str5) {
        return new OneSTVProsermRequest(offer, proserm, str, str2, str3, f, str4, str5);
    }

    @Override // android.os.Parcelable
    public int describeContents() {
        return 0;
    }

    public boolean equals(@Nullable Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj instanceof OneSTVProsermRequest) {
            OneSTVProsermRequest oneSTVProsermRequest = (OneSTVProsermRequest) obj;
            return Intrinsics.areEqual(this.f82218a, oneSTVProsermRequest.f82218a) && Intrinsics.areEqual(this.f82219b, oneSTVProsermRequest.f82219b) && Intrinsics.areEqual(this.f82220c, oneSTVProsermRequest.f82220c) && Intrinsics.areEqual(this.f82221d, oneSTVProsermRequest.f82221d) && Intrinsics.areEqual(this.f82222e, oneSTVProsermRequest.f82222e) && Intrinsics.areEqual((Object) this.f82223f, (Object) oneSTVProsermRequest.f82223f) && Intrinsics.areEqual(this.f82224g, oneSTVProsermRequest.f82224g) && Intrinsics.areEqual(this.f82225h, oneSTVProsermRequest.f82225h);
        }
        return false;
    }

    @Nullable
    public final Float getCommissionValue() {
        return this.f82223f;
    }

    @Nullable
    public final String getConfirmMultiTrans() {
        return this.f82224g;
    }

    @Nullable
    public final Offer getOffer() {
        return this.f82218a;
    }

    @Nullable
    public final String getPackageCode() {
        return this.f82220c;
    }

    @Nullable
    public final String getPin() {
        return this.f82225h;
    }

    @Nullable
    public final Proserm getProserm() {
        return this.f82219b;
    }

    @Nullable
    public final String getSubscriberNumber() {
        return this.f82221d;
    }

    @Nullable
    public final String getUssdServiceCode() {
        return this.f82222e;
    }

    public int hashCode() {
        Offer offer = this.f82218a;
        int hashCode = (offer == null ? 0 : offer.hashCode()) * 31;
        Proserm proserm = this.f82219b;
        int hashCode2 = (hashCode + (proserm == null ? 0 : proserm.hashCode())) * 31;
        String str = this.f82220c;
        int hashCode3 = (hashCode2 + (str == null ? 0 : str.hashCode())) * 31;
        String str2 = this.f82221d;
        int hashCode4 = (hashCode3 + (str2 == null ? 0 : str2.hashCode())) * 31;
        String str3 = this.f82222e;
        int hashCode5 = (hashCode4 + (str3 == null ? 0 : str3.hashCode())) * 31;
        Float f = this.f82223f;
        int hashCode6 = (hashCode5 + (f == null ? 0 : f.hashCode())) * 31;
        String str4 = this.f82224g;
        int hashCode7 = (hashCode6 + (str4 == null ? 0 : str4.hashCode())) * 31;
        String str5 = this.f82225h;
        return hashCode7 + (str5 != null ? str5.hashCode() : 0);
    }

    @NotNull
    public String toString() {
        Offer offer = this.f82218a;
        Proserm proserm = this.f82219b;
        String str = this.f82220c;
        String str2 = this.f82221d;
        String str3 = this.f82222e;
        Float f = this.f82223f;
        String str4 = this.f82224g;
        String str5 = this.f82225h;
        return "OneSTVProsermRequest(offer=" + offer + ", proserm=" + proserm + ", packageCode=" + str + ", subscriberNumber=" + str2 + ", ussdServiceCode=" + str3 + ", commissionValue=" + f + ", confirmMultiTrans=" + str4 + ", pin=" + str5 + ")";
    }

    @Override // android.os.Parcelable
    public void writeToParcel(@NotNull Parcel out, int i) {
        Intrinsics.checkNotNullParameter(out, "out");
        Offer offer = this.f82218a;
        if (offer == null) {
            out.writeInt(0);
        } else {
            out.writeInt(1);
            offer.writeToParcel(out, i);
        }
        Proserm proserm = this.f82219b;
        if (proserm == null) {
            out.writeInt(0);
        } else {
            out.writeInt(1);
            proserm.writeToParcel(out, i);
        }
        out.writeString(this.f82220c);
        out.writeString(this.f82221d);
        out.writeString(this.f82222e);
        Float f = this.f82223f;
        if (f == null) {
            out.writeInt(0);
        } else {
            out.writeInt(1);
            out.writeFloat(f.floatValue());
        }
        out.writeString(this.f82224g);
        out.writeString(this.f82225h);
    }

    public OneSTVProsermRequest(@Nullable Offer offer, @Nullable Proserm proserm, @Nullable String str, @Nullable String str2, @Nullable String str3, @Nullable Float f, @Nullable String str4, @Nullable String str5) {
        this.f82218a = offer;
        this.f82219b = proserm;
        this.f82220c = str;
        this.f82221d = str2;
        this.f82222e = str3;
        this.f82223f = f;
        this.f82224g = str4;
        this.f82225h = str5;
    }

    public /* synthetic */ OneSTVProsermRequest(Offer offer, Proserm proserm, String str, String str2, String str3, Float f, String str4, String str5, int i, DefaultConstructorMarker defaultConstructorMarker) {
        this((i & 1) != 0 ? null : offer, (i & 2) != 0 ? null : proserm, (i & 4) != 0 ? null : str, (i & 8) != 0 ? null : str2, (i & 16) != 0 ? null : str3, (i & 32) != 0 ? null : f, (i & 64) != 0 ? null : str4, (i & 128) == 0 ? str5 : null);
    }
}
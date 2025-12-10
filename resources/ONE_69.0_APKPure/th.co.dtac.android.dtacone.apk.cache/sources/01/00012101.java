package th.p047co.dtac.android.dtacone.model.updateprepaid;

import android.os.Parcel;
import android.os.Parcelable;
import androidx.compose.runtime.internal.StabilityInferred;
import com.google.gson.annotations.SerializedName;
import kotlin.Metadata;
import kotlin.jvm.JvmField;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import th.p047co.dtac.android.dtacone.model.updateprepaid.UpdatePrepaidVerifyOtpResponseCollection;
import th.p047co.dtac.android.dtacone.view.fragment.mrtr_prepaid_registration.family_sim.InputPostpaidFamilySimSubscriberFragment;

@StabilityInferred(parameters = 0)
@Metadata(m29143d1 = {"\u0000<\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0011\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0010\u0002\n\u0002\b\u0005\b\u0087\b\u0018\u0000 %2\u00020\u0001:\u0002%&B\u000f\b\u0016\u0012\u0006\u0010\u0002\u001a\u00020\u0003¢\u0006\u0002\u0010\u0004B#\u0012\b\u0010\u0005\u001a\u0004\u0018\u00010\u0006\u0012\b\u0010\u0007\u001a\u0004\u0018\u00010\b\u0012\b\u0010\t\u001a\u0004\u0018\u00010\u0006¢\u0006\u0002\u0010\nJ\u000b\u0010\u0015\u001a\u0004\u0018\u00010\u0006HÆ\u0003J\u000b\u0010\u0016\u001a\u0004\u0018\u00010\bHÆ\u0003J\u000b\u0010\u0017\u001a\u0004\u0018\u00010\u0006HÆ\u0003J-\u0010\u0018\u001a\u00020\u00002\n\b\u0002\u0010\u0005\u001a\u0004\u0018\u00010\u00062\n\b\u0002\u0010\u0007\u001a\u0004\u0018\u00010\b2\n\b\u0002\u0010\t\u001a\u0004\u0018\u00010\u0006HÆ\u0001J\b\u0010\u0019\u001a\u00020\u001aH\u0016J\u0013\u0010\u001b\u001a\u00020\u001c2\b\u0010\u001d\u001a\u0004\u0018\u00010\u001eHÖ\u0003J\t\u0010\u001f\u001a\u00020\u001aHÖ\u0001J\t\u0010 \u001a\u00020\u0006HÖ\u0001J\u0018\u0010!\u001a\u00020\"2\u0006\u0010#\u001a\u00020\u00032\u0006\u0010$\u001a\u00020\u001aH\u0016R\u001c\u0010\t\u001a\u0004\u0018\u00010\u0006X\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u000b\u0010\f\"\u0004\b\r\u0010\u000eR \u0010\u0007\u001a\u0004\u0018\u00010\b8\u0006@\u0006X\u0087\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u000f\u0010\u0010\"\u0004\b\u0011\u0010\u0012R \u0010\u0005\u001a\u0004\u0018\u00010\u00068\u0006@\u0006X\u0087\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u0013\u0010\f\"\u0004\b\u0014\u0010\u000e¨\u0006'"}, m29142d2 = {"Lth/co/dtac/android/dtacone/model/updateprepaid/UpdatePrepaidVerifyOtpResponseCollection;", "Landroid/os/Parcelable;", "source", "Landroid/os/Parcel;", "(Landroid/os/Parcel;)V", "transactionId", "", "simCard", "Lth/co/dtac/android/dtacone/model/updateprepaid/UpdatePrepaidVerifyOtpResponseCollection$SimCard;", "otp", "(Ljava/lang/String;Lth/co/dtac/android/dtacone/model/updateprepaid/UpdatePrepaidVerifyOtpResponseCollection$SimCard;Ljava/lang/String;)V", "getOtp", "()Ljava/lang/String;", "setOtp", "(Ljava/lang/String;)V", "getSimCard", "()Lth/co/dtac/android/dtacone/model/updateprepaid/UpdatePrepaidVerifyOtpResponseCollection$SimCard;", "setSimCard", "(Lth/co/dtac/android/dtacone/model/updateprepaid/UpdatePrepaidVerifyOtpResponseCollection$SimCard;)V", "getTransactionId", "setTransactionId", "component1", "component2", "component3", "copy", "describeContents", "", "equals", "", "other", "", "hashCode", "toString", "writeToParcel", "", "dest", "flags", "Companion", "SimCard", "app_prodRelease"}, m29141k = 1, m29140mv = {1, 8, 0}, m29138xi = 48)
/* renamed from: th.co.dtac.android.dtacone.model.updateprepaid.UpdatePrepaidVerifyOtpResponseCollection */
/* loaded from: classes8.dex */
public final class UpdatePrepaidVerifyOtpResponseCollection implements Parcelable {
    @Nullable
    private String otp;
    @SerializedName("simcardData")
    @Nullable
    private SimCard simCard;
    @SerializedName("transactionId")
    @Nullable
    private String transactionId;
    @NotNull
    public static final Companion Companion = new Companion(null);
    public static final int $stable = 8;
    @JvmField
    @NotNull
    public static final Parcelable.Creator<UpdatePrepaidVerifyOtpResponseCollection> CREATOR = new Parcelable.Creator<UpdatePrepaidVerifyOtpResponseCollection>() { // from class: th.co.dtac.android.dtacone.model.updateprepaid.UpdatePrepaidVerifyOtpResponseCollection$Companion$CREATOR$1
        @Override // android.os.Parcelable.Creator
        @NotNull
        public UpdatePrepaidVerifyOtpResponseCollection createFromParcel(@NotNull Parcel source) {
            Intrinsics.checkNotNullParameter(source, "source");
            return new UpdatePrepaidVerifyOtpResponseCollection(source);
        }

        @Override // android.os.Parcelable.Creator
        @NotNull
        public UpdatePrepaidVerifyOtpResponseCollection[] newArray(int i) {
            return new UpdatePrepaidVerifyOtpResponseCollection[i];
        }
    };

    @Metadata(m29143d1 = {"\u0000\u0016\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0086\u0003\u0018\u00002\u00020\u0001B\u0007\b\u0002¢\u0006\u0002\u0010\u0002R\u0016\u0010\u0003\u001a\b\u0012\u0004\u0012\u00020\u00050\u00048\u0006X\u0087\u0004¢\u0006\u0002\n\u0000¨\u0006\u0006"}, m29142d2 = {"Lth/co/dtac/android/dtacone/model/updateprepaid/UpdatePrepaidVerifyOtpResponseCollection$Companion;", "", "()V", "CREATOR", "Landroid/os/Parcelable$Creator;", "Lth/co/dtac/android/dtacone/model/updateprepaid/UpdatePrepaidVerifyOtpResponseCollection;", "app_prodRelease"}, m29141k = 1, m29140mv = {1, 8, 0}, m29138xi = 48)
    /* renamed from: th.co.dtac.android.dtacone.model.updateprepaid.UpdatePrepaidVerifyOtpResponseCollection$Companion */
    /* loaded from: classes8.dex */
    public static final class Companion {
        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        private Companion() {
        }
    }

    public UpdatePrepaidVerifyOtpResponseCollection(@Nullable String str, @Nullable SimCard simCard, @Nullable String str2) {
        this.transactionId = str;
        this.simCard = simCard;
        this.otp = str2;
    }

    public static /* synthetic */ UpdatePrepaidVerifyOtpResponseCollection copy$default(UpdatePrepaidVerifyOtpResponseCollection updatePrepaidVerifyOtpResponseCollection, String str, SimCard simCard, String str2, int i, Object obj) {
        if ((i & 1) != 0) {
            str = updatePrepaidVerifyOtpResponseCollection.transactionId;
        }
        if ((i & 2) != 0) {
            simCard = updatePrepaidVerifyOtpResponseCollection.simCard;
        }
        if ((i & 4) != 0) {
            str2 = updatePrepaidVerifyOtpResponseCollection.otp;
        }
        return updatePrepaidVerifyOtpResponseCollection.copy(str, simCard, str2);
    }

    @Nullable
    public final String component1() {
        return this.transactionId;
    }

    @Nullable
    public final SimCard component2() {
        return this.simCard;
    }

    @Nullable
    public final String component3() {
        return this.otp;
    }

    @NotNull
    public final UpdatePrepaidVerifyOtpResponseCollection copy(@Nullable String str, @Nullable SimCard simCard, @Nullable String str2) {
        return new UpdatePrepaidVerifyOtpResponseCollection(str, simCard, str2);
    }

    @Override // android.os.Parcelable
    public int describeContents() {
        return 0;
    }

    public boolean equals(@Nullable Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj instanceof UpdatePrepaidVerifyOtpResponseCollection) {
            UpdatePrepaidVerifyOtpResponseCollection updatePrepaidVerifyOtpResponseCollection = (UpdatePrepaidVerifyOtpResponseCollection) obj;
            return Intrinsics.areEqual(this.transactionId, updatePrepaidVerifyOtpResponseCollection.transactionId) && Intrinsics.areEqual(this.simCard, updatePrepaidVerifyOtpResponseCollection.simCard) && Intrinsics.areEqual(this.otp, updatePrepaidVerifyOtpResponseCollection.otp);
        }
        return false;
    }

    @Nullable
    public final String getOtp() {
        return this.otp;
    }

    @Nullable
    public final SimCard getSimCard() {
        return this.simCard;
    }

    @Nullable
    public final String getTransactionId() {
        return this.transactionId;
    }

    public int hashCode() {
        String str = this.transactionId;
        int hashCode = (str == null ? 0 : str.hashCode()) * 31;
        SimCard simCard = this.simCard;
        int hashCode2 = (hashCode + (simCard == null ? 0 : simCard.hashCode())) * 31;
        String str2 = this.otp;
        return hashCode2 + (str2 != null ? str2.hashCode() : 0);
    }

    public final void setOtp(@Nullable String str) {
        this.otp = str;
    }

    public final void setSimCard(@Nullable SimCard simCard) {
        this.simCard = simCard;
    }

    public final void setTransactionId(@Nullable String str) {
        this.transactionId = str;
    }

    @NotNull
    public String toString() {
        String str = this.transactionId;
        SimCard simCard = this.simCard;
        String str2 = this.otp;
        return "UpdatePrepaidVerifyOtpResponseCollection(transactionId=" + str + ", simCard=" + simCard + ", otp=" + str2 + ")";
    }

    @Override // android.os.Parcelable
    public void writeToParcel(@NotNull Parcel dest, int i) {
        Intrinsics.checkNotNullParameter(dest, "dest");
        dest.writeString(this.transactionId);
        dest.writeParcelable(this.simCard, 0);
    }

    @StabilityInferred(parameters = 0)
    @Metadata(m29143d1 = {"\u00006\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0010\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0010\u0002\n\u0002\b\u0004\b\u0087\b\u0018\u0000 \"2\u00020\u0001:\u0001\"B\u000f\b\u0016\u0012\u0006\u0010\u0002\u001a\u00020\u0003¢\u0006\u0002\u0010\u0004B#\u0012\b\u0010\u0005\u001a\u0004\u0018\u00010\u0006\u0012\b\u0010\u0007\u001a\u0004\u0018\u00010\u0006\u0012\b\u0010\b\u001a\u0004\u0018\u00010\u0006¢\u0006\u0002\u0010\tJ\u000b\u0010\u0012\u001a\u0004\u0018\u00010\u0006HÆ\u0003J\u000b\u0010\u0013\u001a\u0004\u0018\u00010\u0006HÆ\u0003J\u000b\u0010\u0014\u001a\u0004\u0018\u00010\u0006HÆ\u0003J-\u0010\u0015\u001a\u00020\u00002\n\b\u0002\u0010\u0005\u001a\u0004\u0018\u00010\u00062\n\b\u0002\u0010\u0007\u001a\u0004\u0018\u00010\u00062\n\b\u0002\u0010\b\u001a\u0004\u0018\u00010\u0006HÆ\u0001J\b\u0010\u0016\u001a\u00020\u0017H\u0016J\u0013\u0010\u0018\u001a\u00020\u00192\b\u0010\u001a\u001a\u0004\u0018\u00010\u001bHÖ\u0003J\t\u0010\u001c\u001a\u00020\u0017HÖ\u0001J\t\u0010\u001d\u001a\u00020\u0006HÖ\u0001J\u0018\u0010\u001e\u001a\u00020\u001f2\u0006\u0010 \u001a\u00020\u00032\u0006\u0010!\u001a\u00020\u0017H\u0016R \u0010\b\u001a\u0004\u0018\u00010\u00068\u0006@\u0006X\u0087\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\n\u0010\u000b\"\u0004\b\f\u0010\rR \u0010\u0007\u001a\u0004\u0018\u00010\u00068\u0006@\u0006X\u0087\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u000e\u0010\u000b\"\u0004\b\u000f\u0010\rR \u0010\u0005\u001a\u0004\u0018\u00010\u00068\u0006@\u0006X\u0087\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u0010\u0010\u000b\"\u0004\b\u0011\u0010\r¨\u0006#"}, m29142d2 = {"Lth/co/dtac/android/dtacone/model/updateprepaid/UpdatePrepaidVerifyOtpResponseCollection$SimCard;", "Landroid/os/Parcelable;", "source", "Landroid/os/Parcel;", "(Landroid/os/Parcel;)V", InputPostpaidFamilySimSubscriberFragment.SUB_NUM, "", "simCardNumber", "companyCode", "(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)V", "getCompanyCode", "()Ljava/lang/String;", "setCompanyCode", "(Ljava/lang/String;)V", "getSimCardNumber", "setSimCardNumber", "getSubscriberNumber", "setSubscriberNumber", "component1", "component2", "component3", "copy", "describeContents", "", "equals", "", "other", "", "hashCode", "toString", "writeToParcel", "", "dest", "flags", "Companion", "app_prodRelease"}, m29141k = 1, m29140mv = {1, 8, 0}, m29138xi = 48)
    /* renamed from: th.co.dtac.android.dtacone.model.updateprepaid.UpdatePrepaidVerifyOtpResponseCollection$SimCard */
    /* loaded from: classes8.dex */
    public static final class SimCard implements Parcelable {
        @SerializedName("companyCode")
        @Nullable
        private String companyCode;
        @SerializedName("simcardNumber")
        @Nullable
        private String simCardNumber;
        @SerializedName(InputPostpaidFamilySimSubscriberFragment.SUB_NUM)
        @Nullable
        private String subscriberNumber;
        @NotNull
        public static final Companion Companion = new Companion(null);
        public static final int $stable = 8;
        @JvmField
        @NotNull
        public static final Parcelable.Creator<SimCard> CREATOR = new Parcelable.Creator<SimCard>() { // from class: th.co.dtac.android.dtacone.model.updateprepaid.UpdatePrepaidVerifyOtpResponseCollection$SimCard$Companion$CREATOR$1
            @Override // android.os.Parcelable.Creator
            @NotNull
            public UpdatePrepaidVerifyOtpResponseCollection.SimCard createFromParcel(@NotNull Parcel source) {
                Intrinsics.checkNotNullParameter(source, "source");
                return new UpdatePrepaidVerifyOtpResponseCollection.SimCard(source);
            }

            @Override // android.os.Parcelable.Creator
            @NotNull
            public UpdatePrepaidVerifyOtpResponseCollection.SimCard[] newArray(int i) {
                return new UpdatePrepaidVerifyOtpResponseCollection.SimCard[i];
            }
        };

        @Metadata(m29143d1 = {"\u0000\u0016\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0086\u0003\u0018\u00002\u00020\u0001B\u0007\b\u0002¢\u0006\u0002\u0010\u0002R\u0016\u0010\u0003\u001a\b\u0012\u0004\u0012\u00020\u00050\u00048\u0006X\u0087\u0004¢\u0006\u0002\n\u0000¨\u0006\u0006"}, m29142d2 = {"Lth/co/dtac/android/dtacone/model/updateprepaid/UpdatePrepaidVerifyOtpResponseCollection$SimCard$Companion;", "", "()V", "CREATOR", "Landroid/os/Parcelable$Creator;", "Lth/co/dtac/android/dtacone/model/updateprepaid/UpdatePrepaidVerifyOtpResponseCollection$SimCard;", "app_prodRelease"}, m29141k = 1, m29140mv = {1, 8, 0}, m29138xi = 48)
        /* renamed from: th.co.dtac.android.dtacone.model.updateprepaid.UpdatePrepaidVerifyOtpResponseCollection$SimCard$Companion */
        /* loaded from: classes8.dex */
        public static final class Companion {
            public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
                this();
            }

            private Companion() {
            }
        }

        public SimCard(@Nullable String str, @Nullable String str2, @Nullable String str3) {
            this.subscriberNumber = str;
            this.simCardNumber = str2;
            this.companyCode = str3;
        }

        public static /* synthetic */ SimCard copy$default(SimCard simCard, String str, String str2, String str3, int i, Object obj) {
            if ((i & 1) != 0) {
                str = simCard.subscriberNumber;
            }
            if ((i & 2) != 0) {
                str2 = simCard.simCardNumber;
            }
            if ((i & 4) != 0) {
                str3 = simCard.companyCode;
            }
            return simCard.copy(str, str2, str3);
        }

        @Nullable
        public final String component1() {
            return this.subscriberNumber;
        }

        @Nullable
        public final String component2() {
            return this.simCardNumber;
        }

        @Nullable
        public final String component3() {
            return this.companyCode;
        }

        @NotNull
        public final SimCard copy(@Nullable String str, @Nullable String str2, @Nullable String str3) {
            return new SimCard(str, str2, str3);
        }

        @Override // android.os.Parcelable
        public int describeContents() {
            return 0;
        }

        public boolean equals(@Nullable Object obj) {
            if (this == obj) {
                return true;
            }
            if (obj instanceof SimCard) {
                SimCard simCard = (SimCard) obj;
                return Intrinsics.areEqual(this.subscriberNumber, simCard.subscriberNumber) && Intrinsics.areEqual(this.simCardNumber, simCard.simCardNumber) && Intrinsics.areEqual(this.companyCode, simCard.companyCode);
            }
            return false;
        }

        @Nullable
        public final String getCompanyCode() {
            return this.companyCode;
        }

        @Nullable
        public final String getSimCardNumber() {
            return this.simCardNumber;
        }

        @Nullable
        public final String getSubscriberNumber() {
            return this.subscriberNumber;
        }

        public int hashCode() {
            String str = this.subscriberNumber;
            int hashCode = (str == null ? 0 : str.hashCode()) * 31;
            String str2 = this.simCardNumber;
            int hashCode2 = (hashCode + (str2 == null ? 0 : str2.hashCode())) * 31;
            String str3 = this.companyCode;
            return hashCode2 + (str3 != null ? str3.hashCode() : 0);
        }

        public final void setCompanyCode(@Nullable String str) {
            this.companyCode = str;
        }

        public final void setSimCardNumber(@Nullable String str) {
            this.simCardNumber = str;
        }

        public final void setSubscriberNumber(@Nullable String str) {
            this.subscriberNumber = str;
        }

        @NotNull
        public String toString() {
            String str = this.subscriberNumber;
            String str2 = this.simCardNumber;
            String str3 = this.companyCode;
            return "SimCard(subscriberNumber=" + str + ", simCardNumber=" + str2 + ", companyCode=" + str3 + ")";
        }

        @Override // android.os.Parcelable
        public void writeToParcel(@NotNull Parcel dest, int i) {
            Intrinsics.checkNotNullParameter(dest, "dest");
            dest.writeString(this.subscriberNumber);
            dest.writeString(this.simCardNumber);
            dest.writeString(this.companyCode);
        }

        /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
        public SimCard(@NotNull Parcel source) {
            this(source.readString(), source.readString(), source.readString());
            Intrinsics.checkNotNullParameter(source, "source");
        }
    }

    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    public UpdatePrepaidVerifyOtpResponseCollection(@NotNull Parcel source) {
        this(source.readString(), (SimCard) source.readParcelable(SimCard.class.getClassLoader()), source.readString());
        Intrinsics.checkNotNullParameter(source, "source");
    }
}
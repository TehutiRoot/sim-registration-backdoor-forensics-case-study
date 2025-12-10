package th.p047co.dtac.android.dtacone.model.buy_dol;

import android.os.Parcel;
import android.os.Parcelable;
import androidx.compose.runtime.internal.StabilityInferred;
import com.google.gson.annotations.SerializedName;
import java.util.List;
import kotlin.Metadata;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

@StabilityInferred(parameters = 0)
@Metadata(m29143d1 = {"\u0000@\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\b\t\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0010\u0002\n\u0002\b\u0003\b\u0087\b\u0018\u0000 \u001d2\u00020\u0001:\u0001\u001dB\u000f\b\u0016\u0012\u0006\u0010\u0002\u001a\u00020\u0003¢\u0006\u0002\u0010\u0004B\u001b\u0012\u0006\u0010\u0005\u001a\u00020\u0006\u0012\f\u0010\u0007\u001a\b\u0012\u0004\u0012\u00020\t0\b¢\u0006\u0002\u0010\nJ\t\u0010\u000f\u001a\u00020\u0006HÆ\u0003J\u000f\u0010\u0010\u001a\b\u0012\u0004\u0012\u00020\t0\bHÆ\u0003J#\u0010\u0011\u001a\u00020\u00002\b\b\u0002\u0010\u0005\u001a\u00020\u00062\u000e\b\u0002\u0010\u0007\u001a\b\u0012\u0004\u0012\u00020\t0\bHÆ\u0001J\b\u0010\u0012\u001a\u00020\u0013H\u0016J\u0013\u0010\u0014\u001a\u00020\u00152\b\u0010\u0016\u001a\u0004\u0018\u00010\u0017HÖ\u0003J\t\u0010\u0018\u001a\u00020\u0013HÖ\u0001J\t\u0010\u0019\u001a\u00020\u0006HÖ\u0001J\u0018\u0010\u001a\u001a\u00020\u001b2\u0006\u0010\u0002\u001a\u00020\u00032\u0006\u0010\u001c\u001a\u00020\u0013H\u0016R\u0016\u0010\u0005\u001a\u00020\u00068\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u000b\u0010\fR\u001c\u0010\u0007\u001a\b\u0012\u0004\u0012\u00020\t0\b8\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b\r\u0010\u000e¨\u0006\u001e"}, m29142d2 = {"Lth/co/dtac/android/dtacone/model/buy_dol/BuyDolListCard;", "Landroid/os/Parcelable;", "parcel", "Landroid/os/Parcel;", "(Landroid/os/Parcel;)V", "accountCode", "", "creditCard", "", "Lth/co/dtac/android/dtacone/model/buy_dol/CreditCard;", "(Ljava/lang/String;Ljava/util/List;)V", "getAccountCode", "()Ljava/lang/String;", "getCreditCard", "()Ljava/util/List;", "component1", "component2", "copy", "describeContents", "", "equals", "", "other", "", "hashCode", "toString", "writeToParcel", "", "flags", "CREATOR", "app_prodRelease"}, m29141k = 1, m29140mv = {1, 8, 0}, m29138xi = 48)
/* renamed from: th.co.dtac.android.dtacone.model.buy_dol.BuyDolListCard */
/* loaded from: classes8.dex */
public final class BuyDolListCard implements Parcelable {
    @SerializedName("accountCode")
    @NotNull
    private final String accountCode;
    @SerializedName("creditCards")
    @NotNull
    private final List<CreditCard> creditCard;
    @NotNull
    public static final CREATOR CREATOR = new CREATOR(null);
    public static final int $stable = 8;

    @Metadata(m29143d1 = {"\u0000$\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0011\n\u0000\n\u0002\u0010\b\n\u0002\b\u0002\b\u0086\u0003\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001B\u0007\b\u0002¢\u0006\u0002\u0010\u0003J\u0010\u0010\u0004\u001a\u00020\u00022\u0006\u0010\u0005\u001a\u00020\u0006H\u0016J\u001d\u0010\u0007\u001a\n\u0012\u0006\u0012\u0004\u0018\u00010\u00020\b2\u0006\u0010\t\u001a\u00020\nH\u0016¢\u0006\u0002\u0010\u000b¨\u0006\f"}, m29142d2 = {"Lth/co/dtac/android/dtacone/model/buy_dol/BuyDolListCard$CREATOR;", "Landroid/os/Parcelable$Creator;", "Lth/co/dtac/android/dtacone/model/buy_dol/BuyDolListCard;", "()V", "createFromParcel", "parcel", "Landroid/os/Parcel;", "newArray", "", "size", "", "(I)[Lth/co/dtac/android/dtacone/model/buy_dol/BuyDolListCard;", "app_prodRelease"}, m29141k = 1, m29140mv = {1, 8, 0}, m29138xi = 48)
    /* renamed from: th.co.dtac.android.dtacone.model.buy_dol.BuyDolListCard$CREATOR */
    /* loaded from: classes8.dex */
    public static final class CREATOR implements Parcelable.Creator<BuyDolListCard> {
        public /* synthetic */ CREATOR(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        private CREATOR() {
        }

        @Override // android.os.Parcelable.Creator
        @NotNull
        public BuyDolListCard createFromParcel(@NotNull Parcel parcel) {
            Intrinsics.checkNotNullParameter(parcel, "parcel");
            return new BuyDolListCard(parcel);
        }

        @Override // android.os.Parcelable.Creator
        @NotNull
        public BuyDolListCard[] newArray(int i) {
            return new BuyDolListCard[i];
        }
    }

    public BuyDolListCard(@NotNull String accountCode, @NotNull List<CreditCard> creditCard) {
        Intrinsics.checkNotNullParameter(accountCode, "accountCode");
        Intrinsics.checkNotNullParameter(creditCard, "creditCard");
        this.accountCode = accountCode;
        this.creditCard = creditCard;
    }

    /* JADX WARN: Multi-variable type inference failed */
    public static /* synthetic */ BuyDolListCard copy$default(BuyDolListCard buyDolListCard, String str, List list, int i, Object obj) {
        if ((i & 1) != 0) {
            str = buyDolListCard.accountCode;
        }
        if ((i & 2) != 0) {
            list = buyDolListCard.creditCard;
        }
        return buyDolListCard.copy(str, list);
    }

    @NotNull
    public final String component1() {
        return this.accountCode;
    }

    @NotNull
    public final List<CreditCard> component2() {
        return this.creditCard;
    }

    @NotNull
    public final BuyDolListCard copy(@NotNull String accountCode, @NotNull List<CreditCard> creditCard) {
        Intrinsics.checkNotNullParameter(accountCode, "accountCode");
        Intrinsics.checkNotNullParameter(creditCard, "creditCard");
        return new BuyDolListCard(accountCode, creditCard);
    }

    @Override // android.os.Parcelable
    public int describeContents() {
        return 0;
    }

    public boolean equals(@Nullable Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj instanceof BuyDolListCard) {
            BuyDolListCard buyDolListCard = (BuyDolListCard) obj;
            return Intrinsics.areEqual(this.accountCode, buyDolListCard.accountCode) && Intrinsics.areEqual(this.creditCard, buyDolListCard.creditCard);
        }
        return false;
    }

    @NotNull
    public final String getAccountCode() {
        return this.accountCode;
    }

    @NotNull
    public final List<CreditCard> getCreditCard() {
        return this.creditCard;
    }

    public int hashCode() {
        return (this.accountCode.hashCode() * 31) + this.creditCard.hashCode();
    }

    @NotNull
    public String toString() {
        String str = this.accountCode;
        List<CreditCard> list = this.creditCard;
        return "BuyDolListCard(accountCode=" + str + ", creditCard=" + list + ")";
    }

    @Override // android.os.Parcelable
    public void writeToParcel(@NotNull Parcel parcel, int i) {
        Intrinsics.checkNotNullParameter(parcel, "parcel");
        parcel.writeString(this.accountCode);
        parcel.writeTypedList(this.creditCard);
    }

    /* JADX WARN: Illegal instructions before constructor call */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public BuyDolListCard(@org.jetbrains.annotations.NotNull android.os.Parcel r3) {
        /*
            r2 = this;
            java.lang.String r0 = "parcel"
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(r3, r0)
            java.lang.String r0 = r3.readString()
            if (r0 != 0) goto Ld
            java.lang.String r0 = ""
        Ld:
            th.co.dtac.android.dtacone.model.buy_dol.CreditCard$CREATOR r1 = th.p047co.dtac.android.dtacone.model.buy_dol.CreditCard.CREATOR
            java.util.ArrayList r3 = r3.createTypedArrayList(r1)
            if (r3 != 0) goto L19
            java.util.List r3 = kotlin.collections.CollectionsKt__CollectionsKt.emptyList()
        L19:
            r2.<init>(r0, r3)
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: th.p047co.dtac.android.dtacone.model.buy_dol.BuyDolListCard.<init>(android.os.Parcel):void");
    }
}
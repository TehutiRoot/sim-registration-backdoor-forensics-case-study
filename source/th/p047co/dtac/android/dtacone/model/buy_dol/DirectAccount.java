package th.p047co.dtac.android.dtacone.model.buy_dol;

import android.os.Parcel;
import android.os.Parcelable;
import androidx.compose.runtime.internal.StabilityInferred;
import com.google.gson.annotations.SerializedName;
import kotlin.Metadata;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

@StabilityInferred(parameters = 0)
@Metadata(m28851d1 = {"\u00006\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\f\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0010\u0002\n\u0002\b\u0003\b\u0087\b\u0018\u0000 \u001d2\u00020\u0001:\u0001\u001dB\u000f\b\u0016\u0012\u0006\u0010\u0002\u001a\u00020\u0003¢\u0006\u0002\u0010\u0004B#\u0012\b\u0010\u0005\u001a\u0004\u0018\u00010\u0006\u0012\b\u0010\u0007\u001a\u0004\u0018\u00010\u0006\u0012\b\u0010\b\u001a\u0004\u0018\u00010\u0006¢\u0006\u0002\u0010\tJ\u000b\u0010\u000e\u001a\u0004\u0018\u00010\u0006HÆ\u0003J\u000b\u0010\u000f\u001a\u0004\u0018\u00010\u0006HÆ\u0003J\u000b\u0010\u0010\u001a\u0004\u0018\u00010\u0006HÆ\u0003J-\u0010\u0011\u001a\u00020\u00002\n\b\u0002\u0010\u0005\u001a\u0004\u0018\u00010\u00062\n\b\u0002\u0010\u0007\u001a\u0004\u0018\u00010\u00062\n\b\u0002\u0010\b\u001a\u0004\u0018\u00010\u0006HÆ\u0001J\b\u0010\u0012\u001a\u00020\u0013H\u0016J\u0013\u0010\u0014\u001a\u00020\u00152\b\u0010\u0016\u001a\u0004\u0018\u00010\u0017HÖ\u0003J\t\u0010\u0018\u001a\u00020\u0013HÖ\u0001J\t\u0010\u0019\u001a\u00020\u0006HÖ\u0001J\u0018\u0010\u001a\u001a\u00020\u001b2\u0006\u0010\u0002\u001a\u00020\u00032\u0006\u0010\u001c\u001a\u00020\u0013H\u0016R\u0018\u0010\b\u001a\u0004\u0018\u00010\u00068\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b\n\u0010\u000bR\u0018\u0010\u0007\u001a\u0004\u0018\u00010\u00068\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b\f\u0010\u000bR\u0018\u0010\u0005\u001a\u0004\u0018\u00010\u00068\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b\r\u0010\u000b¨\u0006\u001e"}, m28850d2 = {"Lth/co/dtac/android/dtacone/model/buy_dol/DirectAccount;", "Landroid/os/Parcelable;", "parcel", "Landroid/os/Parcel;", "(Landroid/os/Parcel;)V", "bankCode", "", "aliasBankName", "accountPayment", "(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)V", "getAccountPayment", "()Ljava/lang/String;", "getAliasBankName", "getBankCode", "component1", "component2", "component3", "copy", "describeContents", "", "equals", "", "other", "", "hashCode", "toString", "writeToParcel", "", "flags", "CREATOR", "app_prodRelease"}, m28849k = 1, m28848mv = {1, 8, 0}, m28846xi = 48)
/* renamed from: th.co.dtac.android.dtacone.model.buy_dol.DirectAccount */
/* loaded from: classes8.dex */
public final class DirectAccount implements Parcelable {
    public static final int $stable = 0;
    @NotNull
    public static final CREATOR CREATOR = new CREATOR(null);
    @SerializedName("accountPayment")
    @Nullable
    private final String accountPayment;
    @SerializedName("aliasBankName")
    @Nullable
    private final String aliasBankName;
    @SerializedName("bankCode")
    @Nullable
    private final String bankCode;

    @Metadata(m28851d1 = {"\u0000$\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0011\n\u0000\n\u0002\u0010\b\n\u0002\b\u0002\b\u0086\u0003\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001B\u0007\b\u0002¢\u0006\u0002\u0010\u0003J\u0010\u0010\u0004\u001a\u00020\u00022\u0006\u0010\u0005\u001a\u00020\u0006H\u0016J\u001d\u0010\u0007\u001a\n\u0012\u0006\u0012\u0004\u0018\u00010\u00020\b2\u0006\u0010\t\u001a\u00020\nH\u0016¢\u0006\u0002\u0010\u000b¨\u0006\f"}, m28850d2 = {"Lth/co/dtac/android/dtacone/model/buy_dol/DirectAccount$CREATOR;", "Landroid/os/Parcelable$Creator;", "Lth/co/dtac/android/dtacone/model/buy_dol/DirectAccount;", "()V", "createFromParcel", "parcel", "Landroid/os/Parcel;", "newArray", "", "size", "", "(I)[Lth/co/dtac/android/dtacone/model/buy_dol/DirectAccount;", "app_prodRelease"}, m28849k = 1, m28848mv = {1, 8, 0}, m28846xi = 48)
    /* renamed from: th.co.dtac.android.dtacone.model.buy_dol.DirectAccount$CREATOR */
    /* loaded from: classes8.dex */
    public static final class CREATOR implements Parcelable.Creator<DirectAccount> {
        public /* synthetic */ CREATOR(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        private CREATOR() {
        }

        @Override // android.os.Parcelable.Creator
        @NotNull
        public DirectAccount createFromParcel(@NotNull Parcel parcel) {
            Intrinsics.checkNotNullParameter(parcel, "parcel");
            return new DirectAccount(parcel);
        }

        @Override // android.os.Parcelable.Creator
        @NotNull
        public DirectAccount[] newArray(int i) {
            return new DirectAccount[i];
        }
    }

    public DirectAccount(@Nullable String str, @Nullable String str2, @Nullable String str3) {
        this.bankCode = str;
        this.aliasBankName = str2;
        this.accountPayment = str3;
    }

    public static /* synthetic */ DirectAccount copy$default(DirectAccount directAccount, String str, String str2, String str3, int i, Object obj) {
        if ((i & 1) != 0) {
            str = directAccount.bankCode;
        }
        if ((i & 2) != 0) {
            str2 = directAccount.aliasBankName;
        }
        if ((i & 4) != 0) {
            str3 = directAccount.accountPayment;
        }
        return directAccount.copy(str, str2, str3);
    }

    @Nullable
    public final String component1() {
        return this.bankCode;
    }

    @Nullable
    public final String component2() {
        return this.aliasBankName;
    }

    @Nullable
    public final String component3() {
        return this.accountPayment;
    }

    @NotNull
    public final DirectAccount copy(@Nullable String str, @Nullable String str2, @Nullable String str3) {
        return new DirectAccount(str, str2, str3);
    }

    @Override // android.os.Parcelable
    public int describeContents() {
        return 0;
    }

    public boolean equals(@Nullable Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj instanceof DirectAccount) {
            DirectAccount directAccount = (DirectAccount) obj;
            return Intrinsics.areEqual(this.bankCode, directAccount.bankCode) && Intrinsics.areEqual(this.aliasBankName, directAccount.aliasBankName) && Intrinsics.areEqual(this.accountPayment, directAccount.accountPayment);
        }
        return false;
    }

    @Nullable
    public final String getAccountPayment() {
        return this.accountPayment;
    }

    @Nullable
    public final String getAliasBankName() {
        return this.aliasBankName;
    }

    @Nullable
    public final String getBankCode() {
        return this.bankCode;
    }

    public int hashCode() {
        String str = this.bankCode;
        int hashCode = (str == null ? 0 : str.hashCode()) * 31;
        String str2 = this.aliasBankName;
        int hashCode2 = (hashCode + (str2 == null ? 0 : str2.hashCode())) * 31;
        String str3 = this.accountPayment;
        return hashCode2 + (str3 != null ? str3.hashCode() : 0);
    }

    @NotNull
    public String toString() {
        String str = this.bankCode;
        String str2 = this.aliasBankName;
        String str3 = this.accountPayment;
        return "DirectAccount(bankCode=" + str + ", aliasBankName=" + str2 + ", accountPayment=" + str3 + ")";
    }

    @Override // android.os.Parcelable
    public void writeToParcel(@NotNull Parcel parcel, int i) {
        Intrinsics.checkNotNullParameter(parcel, "parcel");
        parcel.writeString(this.bankCode);
        parcel.writeString(this.aliasBankName);
        parcel.writeString(this.accountPayment);
    }

    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    public DirectAccount(@NotNull Parcel parcel) {
        this(parcel.readString(), parcel.readString(), parcel.readString());
        Intrinsics.checkNotNullParameter(parcel, "parcel");
    }
}

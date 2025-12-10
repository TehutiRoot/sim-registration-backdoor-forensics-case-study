package th.p047co.dtac.android.dtacone.model.buy_dol;

import android.os.Parcel;
import android.os.Parcelable;
import androidx.compose.runtime.internal.StabilityInferred;
import com.google.gson.annotations.SerializedName;
import java.util.ArrayList;
import java.util.List;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import kotlinx.android.parcel.Parcelize;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

@StabilityInferred(parameters = 0)
@Parcelize
@Metadata(m28851d1 = {"\u0000>\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010!\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\b\u0087\b\u0018\u00002\u00020\u0001B\u0015\u0012\u000e\u0010\u0002\u001a\n\u0012\u0004\u0012\u00020\u0004\u0018\u00010\u0003¢\u0006\u0002\u0010\u0005J\u0011\u0010\b\u001a\n\u0012\u0004\u0012\u00020\u0004\u0018\u00010\u0003HÆ\u0003J\u001b\u0010\t\u001a\u00020\u00002\u0010\b\u0002\u0010\u0002\u001a\n\u0012\u0004\u0012\u00020\u0004\u0018\u00010\u0003HÆ\u0001J\t\u0010\n\u001a\u00020\u000bHÖ\u0001J\u0013\u0010\f\u001a\u00020\r2\b\u0010\u000e\u001a\u0004\u0018\u00010\u000fHÖ\u0003J\t\u0010\u0010\u001a\u00020\u000bHÖ\u0001J\t\u0010\u0011\u001a\u00020\u0012HÖ\u0001J\u0019\u0010\u0013\u001a\u00020\u00142\u0006\u0010\u0015\u001a\u00020\u00162\u0006\u0010\u0017\u001a\u00020\u000bHÖ\u0001R\u001e\u0010\u0002\u001a\n\u0012\u0004\u0012\u00020\u0004\u0018\u00010\u00038\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u0006\u0010\u0007¨\u0006\u0018"}, m28850d2 = {"Lth/co/dtac/android/dtacone/model/buy_dol/BuyDolDirectAccounts;", "Landroid/os/Parcelable;", "directAccounts", "", "Lth/co/dtac/android/dtacone/model/buy_dol/DirectAccount;", "(Ljava/util/List;)V", "getDirectAccounts", "()Ljava/util/List;", "component1", "copy", "describeContents", "", "equals", "", "other", "", "hashCode", "toString", "", "writeToParcel", "", "parcel", "Landroid/os/Parcel;", "flags", "app_prodRelease"}, m28849k = 1, m28848mv = {1, 8, 0}, m28846xi = 48)
/* renamed from: th.co.dtac.android.dtacone.model.buy_dol.BuyDolDirectAccounts */
/* loaded from: classes8.dex */
public final class BuyDolDirectAccounts implements Parcelable {
    public static final int $stable = 8;
    @NotNull
    public static final Parcelable.Creator<BuyDolDirectAccounts> CREATOR = new Creator();
    @SerializedName("directAccounts")
    @Nullable
    private final List<DirectAccount> directAccounts;

    @Metadata(m28849k = 3, m28848mv = {1, 8, 0}, m28846xi = 48)
    /* renamed from: th.co.dtac.android.dtacone.model.buy_dol.BuyDolDirectAccounts$Creator */
    /* loaded from: classes8.dex */
    public static final class Creator implements Parcelable.Creator<BuyDolDirectAccounts> {
        @Override // android.os.Parcelable.Creator
        @NotNull
        public final BuyDolDirectAccounts createFromParcel(@NotNull Parcel parcel) {
            ArrayList arrayList;
            Intrinsics.checkNotNullParameter(parcel, "parcel");
            if (parcel.readInt() == 0) {
                arrayList = null;
            } else {
                int readInt = parcel.readInt();
                ArrayList arrayList2 = new ArrayList(readInt);
                for (int i = 0; i != readInt; i++) {
                    arrayList2.add(parcel.readParcelable(BuyDolDirectAccounts.class.getClassLoader()));
                }
                arrayList = arrayList2;
            }
            return new BuyDolDirectAccounts(arrayList);
        }

        @Override // android.os.Parcelable.Creator
        @NotNull
        public final BuyDolDirectAccounts[] newArray(int i) {
            return new BuyDolDirectAccounts[i];
        }
    }

    public BuyDolDirectAccounts(@Nullable List<DirectAccount> list) {
        this.directAccounts = list;
    }

    /* JADX WARN: Multi-variable type inference failed */
    public static /* synthetic */ BuyDolDirectAccounts copy$default(BuyDolDirectAccounts buyDolDirectAccounts, List list, int i, Object obj) {
        if ((i & 1) != 0) {
            list = buyDolDirectAccounts.directAccounts;
        }
        return buyDolDirectAccounts.copy(list);
    }

    @Nullable
    public final List<DirectAccount> component1() {
        return this.directAccounts;
    }

    @NotNull
    public final BuyDolDirectAccounts copy(@Nullable List<DirectAccount> list) {
        return new BuyDolDirectAccounts(list);
    }

    @Override // android.os.Parcelable
    public int describeContents() {
        return 0;
    }

    public boolean equals(@Nullable Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof BuyDolDirectAccounts) && Intrinsics.areEqual(this.directAccounts, ((BuyDolDirectAccounts) obj).directAccounts);
    }

    @Nullable
    public final List<DirectAccount> getDirectAccounts() {
        return this.directAccounts;
    }

    public int hashCode() {
        List<DirectAccount> list = this.directAccounts;
        if (list == null) {
            return 0;
        }
        return list.hashCode();
    }

    @NotNull
    public String toString() {
        List<DirectAccount> list = this.directAccounts;
        return "BuyDolDirectAccounts(directAccounts=" + list + ")";
    }

    @Override // android.os.Parcelable
    public void writeToParcel(@NotNull Parcel out, int i) {
        Intrinsics.checkNotNullParameter(out, "out");
        List<DirectAccount> list = this.directAccounts;
        if (list == null) {
            out.writeInt(0);
            return;
        }
        out.writeInt(1);
        out.writeInt(list.size());
        for (DirectAccount directAccount : list) {
            out.writeParcelable(directAccount, i);
        }
    }
}

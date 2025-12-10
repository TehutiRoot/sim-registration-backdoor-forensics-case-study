package th.p047co.dtac.android.dtacone.model.buy_dol;

import android.os.Parcel;
import android.os.Parcelable;
import androidx.compose.runtime.internal.StabilityInferred;
import kotlin.Metadata;
import kotlin.jvm.JvmField;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import th.p047co.dtac.android.dtacone.model.SimRCollection;

@StabilityInferred(parameters = 0)
@Metadata(m29143d1 = {"\u0000B\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\t\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0004\b\u0087\b\u0018\u0000 \u001e2\u00020\u0001:\u0001\u001eB\u000f\b\u0016\u0012\u0006\u0010\u0002\u001a\u00020\u0003¢\u0006\u0002\u0010\u0004B\u0019\u0012\b\u0010\u0005\u001a\u0004\u0018\u00010\u0006\u0012\b\u0010\u0007\u001a\u0004\u0018\u00010\b¢\u0006\u0002\u0010\tJ\u000b\u0010\u000e\u001a\u0004\u0018\u00010\u0006HÆ\u0003J\u000b\u0010\u000f\u001a\u0004\u0018\u00010\bHÆ\u0003J!\u0010\u0010\u001a\u00020\u00002\n\b\u0002\u0010\u0005\u001a\u0004\u0018\u00010\u00062\n\b\u0002\u0010\u0007\u001a\u0004\u0018\u00010\bHÆ\u0001J\b\u0010\u0011\u001a\u00020\u0012H\u0016J\u0013\u0010\u0013\u001a\u00020\u00142\b\u0010\u0015\u001a\u0004\u0018\u00010\u0016HÖ\u0003J\t\u0010\u0017\u001a\u00020\u0012HÖ\u0001J\t\u0010\u0018\u001a\u00020\u0019HÖ\u0001J\u0018\u0010\u001a\u001a\u00020\u001b2\u0006\u0010\u001c\u001a\u00020\u00032\u0006\u0010\u001d\u001a\u00020\u0012H\u0016R\u0013\u0010\u0007\u001a\u0004\u0018\u00010\b¢\u0006\b\n\u0000\u001a\u0004\b\n\u0010\u000bR\u0013\u0010\u0005\u001a\u0004\u0018\u00010\u0006¢\u0006\b\n\u0000\u001a\u0004\b\f\u0010\r¨\u0006\u001f"}, m29142d2 = {"Lth/co/dtac/android/dtacone/model/buy_dol/BuyDolPriceListSimR;", "Landroid/os/Parcelable;", "source", "Landroid/os/Parcel;", "(Landroid/os/Parcel;)V", "simR", "Lth/co/dtac/android/dtacone/model/SimRCollection;", "priceList", "Lth/co/dtac/android/dtacone/model/buy_dol/BuyDolPriceList;", "(Lth/co/dtac/android/dtacone/model/SimRCollection;Lth/co/dtac/android/dtacone/model/buy_dol/BuyDolPriceList;)V", "getPriceList", "()Lth/co/dtac/android/dtacone/model/buy_dol/BuyDolPriceList;", "getSimR", "()Lth/co/dtac/android/dtacone/model/SimRCollection;", "component1", "component2", "copy", "describeContents", "", "equals", "", "other", "", "hashCode", "toString", "", "writeToParcel", "", "dest", "flags", "Companion", "app_prodRelease"}, m29141k = 1, m29140mv = {1, 8, 0}, m29138xi = 48)
/* renamed from: th.co.dtac.android.dtacone.model.buy_dol.BuyDolPriceListSimR */
/* loaded from: classes8.dex */
public final class BuyDolPriceListSimR implements Parcelable {
    @Nullable
    private final BuyDolPriceList priceList;
    @Nullable
    private final SimRCollection simR;
    @NotNull
    public static final Companion Companion = new Companion(null);
    public static final int $stable = 8;
    @JvmField
    @NotNull
    public static final Parcelable.Creator<BuyDolPriceListSimR> CREATOR = new Parcelable.Creator<BuyDolPriceListSimR>() { // from class: th.co.dtac.android.dtacone.model.buy_dol.BuyDolPriceListSimR$Companion$CREATOR$1
        @Override // android.os.Parcelable.Creator
        @NotNull
        public BuyDolPriceListSimR createFromParcel(@NotNull Parcel source) {
            Intrinsics.checkNotNullParameter(source, "source");
            return new BuyDolPriceListSimR(source);
        }

        @Override // android.os.Parcelable.Creator
        @NotNull
        public BuyDolPriceListSimR[] newArray(int i) {
            return new BuyDolPriceListSimR[i];
        }
    };

    @Metadata(m29143d1 = {"\u0000\u0016\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0086\u0003\u0018\u00002\u00020\u0001B\u0007\b\u0002¢\u0006\u0002\u0010\u0002R\u0016\u0010\u0003\u001a\b\u0012\u0004\u0012\u00020\u00050\u00048\u0006X\u0087\u0004¢\u0006\u0002\n\u0000¨\u0006\u0006"}, m29142d2 = {"Lth/co/dtac/android/dtacone/model/buy_dol/BuyDolPriceListSimR$Companion;", "", "()V", "CREATOR", "Landroid/os/Parcelable$Creator;", "Lth/co/dtac/android/dtacone/model/buy_dol/BuyDolPriceListSimR;", "app_prodRelease"}, m29141k = 1, m29140mv = {1, 8, 0}, m29138xi = 48)
    /* renamed from: th.co.dtac.android.dtacone.model.buy_dol.BuyDolPriceListSimR$Companion */
    /* loaded from: classes8.dex */
    public static final class Companion {
        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        private Companion() {
        }
    }

    public BuyDolPriceListSimR(@Nullable SimRCollection simRCollection, @Nullable BuyDolPriceList buyDolPriceList) {
        this.simR = simRCollection;
        this.priceList = buyDolPriceList;
    }

    public static /* synthetic */ BuyDolPriceListSimR copy$default(BuyDolPriceListSimR buyDolPriceListSimR, SimRCollection simRCollection, BuyDolPriceList buyDolPriceList, int i, Object obj) {
        if ((i & 1) != 0) {
            simRCollection = buyDolPriceListSimR.simR;
        }
        if ((i & 2) != 0) {
            buyDolPriceList = buyDolPriceListSimR.priceList;
        }
        return buyDolPriceListSimR.copy(simRCollection, buyDolPriceList);
    }

    @Nullable
    public final SimRCollection component1() {
        return this.simR;
    }

    @Nullable
    public final BuyDolPriceList component2() {
        return this.priceList;
    }

    @NotNull
    public final BuyDolPriceListSimR copy(@Nullable SimRCollection simRCollection, @Nullable BuyDolPriceList buyDolPriceList) {
        return new BuyDolPriceListSimR(simRCollection, buyDolPriceList);
    }

    @Override // android.os.Parcelable
    public int describeContents() {
        return 0;
    }

    public boolean equals(@Nullable Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj instanceof BuyDolPriceListSimR) {
            BuyDolPriceListSimR buyDolPriceListSimR = (BuyDolPriceListSimR) obj;
            return Intrinsics.areEqual(this.simR, buyDolPriceListSimR.simR) && Intrinsics.areEqual(this.priceList, buyDolPriceListSimR.priceList);
        }
        return false;
    }

    @Nullable
    public final BuyDolPriceList getPriceList() {
        return this.priceList;
    }

    @Nullable
    public final SimRCollection getSimR() {
        return this.simR;
    }

    public int hashCode() {
        SimRCollection simRCollection = this.simR;
        int hashCode = (simRCollection == null ? 0 : simRCollection.hashCode()) * 31;
        BuyDolPriceList buyDolPriceList = this.priceList;
        return hashCode + (buyDolPriceList != null ? buyDolPriceList.hashCode() : 0);
    }

    @NotNull
    public String toString() {
        SimRCollection simRCollection = this.simR;
        BuyDolPriceList buyDolPriceList = this.priceList;
        return "BuyDolPriceListSimR(simR=" + simRCollection + ", priceList=" + buyDolPriceList + ")";
    }

    @Override // android.os.Parcelable
    public void writeToParcel(@NotNull Parcel dest, int i) {
        Intrinsics.checkNotNullParameter(dest, "dest");
        dest.writeParcelable(this.simR, 0);
        dest.writeParcelable(this.priceList, 0);
    }

    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    public BuyDolPriceListSimR(@NotNull Parcel source) {
        this((SimRCollection) source.readParcelable(SimRCollection.class.getClassLoader()), (BuyDolPriceList) source.readParcelable(BuyDolPriceList.class.getClassLoader()));
        Intrinsics.checkNotNullParameter(source, "source");
    }
}
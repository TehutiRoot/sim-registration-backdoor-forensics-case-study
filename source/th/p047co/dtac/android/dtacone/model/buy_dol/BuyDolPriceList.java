package th.p047co.dtac.android.dtacone.model.buy_dol;

import android.os.Parcel;
import android.os.Parcelable;
import androidx.compose.runtime.internal.StabilityInferred;
import com.google.gson.annotations.SerializedName;
import java.util.List;
import kotlin.Metadata;
import kotlin.jvm.JvmField;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import th.p047co.dtac.android.dtacone.model.buy_dol.BuyDolPriceList;

@StabilityInferred(parameters = 0)
@Metadata(m28851d1 = {"\u0000,\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0005\b\u0007\u0018\u0000 \u00112\u00020\u0001:\u0002\u0011\u0012B\u000f\b\u0016\u0012\u0006\u0010\u0002\u001a\u00020\u0003¢\u0006\u0002\u0010\u0004B\u0015\u0012\u000e\u0010\u0005\u001a\n\u0012\u0004\u0012\u00020\u0007\u0018\u00010\u0006¢\u0006\u0002\u0010\bJ\b\u0010\u000b\u001a\u00020\fH\u0016J\u0018\u0010\r\u001a\u00020\u000e2\u0006\u0010\u000f\u001a\u00020\u00032\u0006\u0010\u0010\u001a\u00020\fH\u0016R\u001e\u0010\u0005\u001a\n\u0012\u0004\u0012\u00020\u0007\u0018\u00010\u00068\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b\t\u0010\n¨\u0006\u0013"}, m28850d2 = {"Lth/co/dtac/android/dtacone/model/buy_dol/BuyDolPriceList;", "Landroid/os/Parcelable;", "source", "Landroid/os/Parcel;", "(Landroid/os/Parcel;)V", "prices", "", "Lth/co/dtac/android/dtacone/model/buy_dol/BuyDolPriceList$PriceListData;", "(Ljava/util/List;)V", "getPrices", "()Ljava/util/List;", "describeContents", "", "writeToParcel", "", "dest", "flags", "Companion", "PriceListData", "app_prodRelease"}, m28849k = 1, m28848mv = {1, 8, 0}, m28846xi = 48)
/* renamed from: th.co.dtac.android.dtacone.model.buy_dol.BuyDolPriceList */
/* loaded from: classes8.dex */
public final class BuyDolPriceList implements Parcelable {
    @SerializedName("data")
    @Nullable
    private final List<PriceListData> prices;
    @NotNull
    public static final Companion Companion = new Companion(null);
    public static final int $stable = 8;
    @JvmField
    @NotNull
    public static final Parcelable.Creator<BuyDolPriceList> CREATOR = new Parcelable.Creator<BuyDolPriceList>() { // from class: th.co.dtac.android.dtacone.model.buy_dol.BuyDolPriceList$Companion$CREATOR$1
        @Override // android.os.Parcelable.Creator
        @NotNull
        public BuyDolPriceList createFromParcel(@NotNull Parcel source) {
            Intrinsics.checkNotNullParameter(source, "source");
            return new BuyDolPriceList(source);
        }

        @Override // android.os.Parcelable.Creator
        @NotNull
        public BuyDolPriceList[] newArray(int i) {
            return new BuyDolPriceList[i];
        }
    };

    @Metadata(m28851d1 = {"\u0000\u0016\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0086\u0003\u0018\u00002\u00020\u0001B\u0007\b\u0002¢\u0006\u0002\u0010\u0002R\u0016\u0010\u0003\u001a\b\u0012\u0004\u0012\u00020\u00050\u00048\u0006X\u0087\u0004¢\u0006\u0002\n\u0000¨\u0006\u0006"}, m28850d2 = {"Lth/co/dtac/android/dtacone/model/buy_dol/BuyDolPriceList$Companion;", "", "()V", "CREATOR", "Landroid/os/Parcelable$Creator;", "Lth/co/dtac/android/dtacone/model/buy_dol/BuyDolPriceList;", "app_prodRelease"}, m28849k = 1, m28848mv = {1, 8, 0}, m28846xi = 48)
    /* renamed from: th.co.dtac.android.dtacone.model.buy_dol.BuyDolPriceList$Companion */
    /* loaded from: classes8.dex */
    public static final class Companion {
        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        private Companion() {
        }
    }

    public BuyDolPriceList(@Nullable List<PriceListData> list) {
        this.prices = list;
    }

    @Override // android.os.Parcelable
    public int describeContents() {
        return 0;
    }

    @Nullable
    public final List<PriceListData> getPrices() {
        return this.prices;
    }

    @Override // android.os.Parcelable
    public void writeToParcel(@NotNull Parcel dest, int i) {
        Intrinsics.checkNotNullParameter(dest, "dest");
        dest.writeTypedList(this.prices);
    }

    @StabilityInferred(parameters = 0)
    @Metadata(m28851d1 = {"\u0000(\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u0007\n\u0002\b\t\n\u0002\u0010\u0002\n\u0002\b\u0004\b\u0007\u0018\u0000 \u00152\u00020\u0001:\u0001\u0015B\u000f\b\u0016\u0012\u0006\u0010\u0002\u001a\u00020\u0003¢\u0006\u0002\u0010\u0004B\u001d\u0012\u0006\u0010\u0005\u001a\u00020\u0006\u0012\u0006\u0010\u0007\u001a\u00020\b\u0012\u0006\u0010\t\u001a\u00020\b¢\u0006\u0002\u0010\nJ\b\u0010\u0010\u001a\u00020\u0006H\u0016J\u0018\u0010\u0011\u001a\u00020\u00122\u0006\u0010\u0013\u001a\u00020\u00032\u0006\u0010\u0014\u001a\u00020\u0006H\u0016R\u0016\u0010\u0005\u001a\u00020\u00068\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u000b\u0010\fR\u0016\u0010\u0007\u001a\u00020\b8\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b\r\u0010\u000eR\u0016\u0010\t\u001a\u00020\b8\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u000f\u0010\u000e¨\u0006\u0016"}, m28850d2 = {"Lth/co/dtac/android/dtacone/model/buy_dol/BuyDolPriceList$PriceListData;", "Landroid/os/Parcelable;", "source", "Landroid/os/Parcel;", "(Landroid/os/Parcel;)V", "amount", "", "fee", "", "total", "(IFF)V", "getAmount", "()I", "getFee", "()F", "getTotal", "describeContents", "writeToParcel", "", "dest", "flags", "Companion", "app_prodRelease"}, m28849k = 1, m28848mv = {1, 8, 0}, m28846xi = 48)
    /* renamed from: th.co.dtac.android.dtacone.model.buy_dol.BuyDolPriceList$PriceListData */
    /* loaded from: classes8.dex */
    public static final class PriceListData implements Parcelable {
        public static final int $stable = 0;
        @SerializedName("amount")
        private final int amount;
        @SerializedName("fee")
        private final float fee;
        @SerializedName("total")
        private final float total;
        @NotNull
        public static final Companion Companion = new Companion(null);
        @JvmField
        @NotNull
        public static final Parcelable.Creator<PriceListData> CREATOR = new Parcelable.Creator<PriceListData>() { // from class: th.co.dtac.android.dtacone.model.buy_dol.BuyDolPriceList$PriceListData$Companion$CREATOR$1
            @Override // android.os.Parcelable.Creator
            @NotNull
            public BuyDolPriceList.PriceListData createFromParcel(@NotNull Parcel source) {
                Intrinsics.checkNotNullParameter(source, "source");
                return new BuyDolPriceList.PriceListData(source);
            }

            @Override // android.os.Parcelable.Creator
            @NotNull
            public BuyDolPriceList.PriceListData[] newArray(int i) {
                return new BuyDolPriceList.PriceListData[i];
            }
        };

        @Metadata(m28851d1 = {"\u0000\u0016\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0086\u0003\u0018\u00002\u00020\u0001B\u0007\b\u0002¢\u0006\u0002\u0010\u0002R\u0016\u0010\u0003\u001a\b\u0012\u0004\u0012\u00020\u00050\u00048\u0006X\u0087\u0004¢\u0006\u0002\n\u0000¨\u0006\u0006"}, m28850d2 = {"Lth/co/dtac/android/dtacone/model/buy_dol/BuyDolPriceList$PriceListData$Companion;", "", "()V", "CREATOR", "Landroid/os/Parcelable$Creator;", "Lth/co/dtac/android/dtacone/model/buy_dol/BuyDolPriceList$PriceListData;", "app_prodRelease"}, m28849k = 1, m28848mv = {1, 8, 0}, m28846xi = 48)
        /* renamed from: th.co.dtac.android.dtacone.model.buy_dol.BuyDolPriceList$PriceListData$Companion */
        /* loaded from: classes8.dex */
        public static final class Companion {
            public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
                this();
            }

            private Companion() {
            }
        }

        public PriceListData(int i, float f, float f2) {
            this.amount = i;
            this.fee = f;
            this.total = f2;
        }

        @Override // android.os.Parcelable
        public int describeContents() {
            return 0;
        }

        public final int getAmount() {
            return this.amount;
        }

        public final float getFee() {
            return this.fee;
        }

        public final float getTotal() {
            return this.total;
        }

        @Override // android.os.Parcelable
        public void writeToParcel(@NotNull Parcel dest, int i) {
            Intrinsics.checkNotNullParameter(dest, "dest");
            dest.writeInt(this.amount);
            dest.writeFloat(this.fee);
            dest.writeFloat(this.total);
        }

        /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
        public PriceListData(@NotNull Parcel source) {
            this(source.readInt(), source.readFloat(), source.readFloat());
            Intrinsics.checkNotNullParameter(source, "source");
        }
    }

    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    public BuyDolPriceList(@NotNull Parcel source) {
        this(source.createTypedArrayList(PriceListData.CREATOR));
        Intrinsics.checkNotNullParameter(source, "source");
    }
}

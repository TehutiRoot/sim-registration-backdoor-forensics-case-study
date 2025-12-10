package th.p047co.dtac.android.dtacone.model.blacklist;

import android.os.Parcel;
import android.os.Parcelable;
import androidx.compose.runtime.internal.StabilityInferred;
import com.google.gson.annotations.SerializedName;
import java.util.ArrayList;
import java.util.List;
import kotlin.Metadata;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import kotlinx.android.parcel.Parcelize;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

@StabilityInferred(parameters = 0)
@Parcelize
@Metadata(m28851d1 = {"\u0000>\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0087\b\u0018\u00002\u00020\u0001:\u0001\u0018B\u0017\u0012\u0010\b\u0002\u0010\u0002\u001a\n\u0012\u0004\u0012\u00020\u0004\u0018\u00010\u0003¢\u0006\u0002\u0010\u0005J\u0011\u0010\b\u001a\n\u0012\u0004\u0012\u00020\u0004\u0018\u00010\u0003HÆ\u0003J\u001b\u0010\t\u001a\u00020\u00002\u0010\b\u0002\u0010\u0002\u001a\n\u0012\u0004\u0012\u00020\u0004\u0018\u00010\u0003HÆ\u0001J\t\u0010\n\u001a\u00020\u000bHÖ\u0001J\u0013\u0010\f\u001a\u00020\r2\b\u0010\u000e\u001a\u0004\u0018\u00010\u000fHÖ\u0003J\t\u0010\u0010\u001a\u00020\u000bHÖ\u0001J\t\u0010\u0011\u001a\u00020\u0012HÖ\u0001J\u0019\u0010\u0013\u001a\u00020\u00142\u0006\u0010\u0015\u001a\u00020\u00162\u0006\u0010\u0017\u001a\u00020\u000bHÖ\u0001R\u001e\u0010\u0002\u001a\n\u0012\u0004\u0012\u00020\u0004\u0018\u00010\u00038\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u0006\u0010\u0007¨\u0006\u0019"}, m28850d2 = {"Lth/co/dtac/android/dtacone/model/blacklist/PackagePriceTierResponse;", "Landroid/os/Parcelable;", "extraAdvance", "", "Lth/co/dtac/android/dtacone/model/blacklist/PackagePriceTierResponse$ExtraAdvance;", "(Ljava/util/List;)V", "getExtraAdvance", "()Ljava/util/List;", "component1", "copy", "describeContents", "", "equals", "", "other", "", "hashCode", "toString", "", "writeToParcel", "", "parcel", "Landroid/os/Parcel;", "flags", "ExtraAdvance", "app_prodRelease"}, m28849k = 1, m28848mv = {1, 8, 0}, m28846xi = 48)
/* renamed from: th.co.dtac.android.dtacone.model.blacklist.PackagePriceTierResponse */
/* loaded from: classes8.dex */
public final class PackagePriceTierResponse implements Parcelable {
    public static final int $stable = 8;
    @NotNull
    public static final Parcelable.Creator<PackagePriceTierResponse> CREATOR = new Creator();
    @SerializedName("extraAdvance")
    @Nullable
    private final List<ExtraAdvance> extraAdvance;

    @Metadata(m28849k = 3, m28848mv = {1, 8, 0}, m28846xi = 48)
    /* renamed from: th.co.dtac.android.dtacone.model.blacklist.PackagePriceTierResponse$Creator */
    /* loaded from: classes8.dex */
    public static final class Creator implements Parcelable.Creator<PackagePriceTierResponse> {
        @Override // android.os.Parcelable.Creator
        @NotNull
        public final PackagePriceTierResponse createFromParcel(@NotNull Parcel parcel) {
            ArrayList arrayList;
            Intrinsics.checkNotNullParameter(parcel, "parcel");
            if (parcel.readInt() == 0) {
                arrayList = null;
            } else {
                int readInt = parcel.readInt();
                ArrayList arrayList2 = new ArrayList(readInt);
                for (int i = 0; i != readInt; i++) {
                    arrayList2.add(ExtraAdvance.CREATOR.createFromParcel(parcel));
                }
                arrayList = arrayList2;
            }
            return new PackagePriceTierResponse(arrayList);
        }

        @Override // android.os.Parcelable.Creator
        @NotNull
        public final PackagePriceTierResponse[] newArray(int i) {
            return new PackagePriceTierResponse[i];
        }
    }

    @StabilityInferred(parameters = 0)
    @Parcelize
    @Metadata(m28851d1 = {"\u00004\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u000f\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\b\u0087\b\u0018\u00002\u00020\u0001B%\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0003\u0012\u0006\u0010\u0005\u001a\u00020\u0003\u0012\u0006\u0010\u0006\u001a\u00020\u0003¢\u0006\u0002\u0010\u0007J\t\u0010\r\u001a\u00020\u0003HÆ\u0003J\t\u0010\u000e\u001a\u00020\u0003HÆ\u0003J\t\u0010\u000f\u001a\u00020\u0003HÆ\u0003J\t\u0010\u0010\u001a\u00020\u0003HÆ\u0003J1\u0010\u0011\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u00032\b\b\u0002\u0010\u0004\u001a\u00020\u00032\b\b\u0002\u0010\u0005\u001a\u00020\u00032\b\b\u0002\u0010\u0006\u001a\u00020\u0003HÆ\u0001J\t\u0010\u0012\u001a\u00020\u0013HÖ\u0001J\u0013\u0010\u0014\u001a\u00020\u00152\b\u0010\u0016\u001a\u0004\u0018\u00010\u0017HÖ\u0003J\t\u0010\u0018\u001a\u00020\u0013HÖ\u0001J\t\u0010\u0019\u001a\u00020\u0003HÖ\u0001J\u0019\u0010\u001a\u001a\u00020\u001b2\u0006\u0010\u001c\u001a\u00020\u001d2\u0006\u0010\u001e\u001a\u00020\u0013HÖ\u0001R\u0016\u0010\u0004\u001a\u00020\u00038\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b\b\u0010\tR\u0016\u0010\u0005\u001a\u00020\u00038\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b\n\u0010\tR\u0016\u0010\u0006\u001a\u00020\u00038\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u000b\u0010\tR\u0016\u0010\u0002\u001a\u00020\u00038\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b\f\u0010\t¨\u0006\u001f"}, m28850d2 = {"Lth/co/dtac/android/dtacone/model/blacklist/PackagePriceTierResponse$ExtraAdvance;", "Landroid/os/Parcelable;", "rrpText", "", "extraAdvance1", "extraAdvance2", "invoiceDiscount", "(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)V", "getExtraAdvance1", "()Ljava/lang/String;", "getExtraAdvance2", "getInvoiceDiscount", "getRrpText", "component1", "component2", "component3", "component4", "copy", "describeContents", "", "equals", "", "other", "", "hashCode", "toString", "writeToParcel", "", "parcel", "Landroid/os/Parcel;", "flags", "app_prodRelease"}, m28849k = 1, m28848mv = {1, 8, 0}, m28846xi = 48)
    /* renamed from: th.co.dtac.android.dtacone.model.blacklist.PackagePriceTierResponse$ExtraAdvance */
    /* loaded from: classes8.dex */
    public static final class ExtraAdvance implements Parcelable {
        public static final int $stable = 0;
        @NotNull
        public static final Parcelable.Creator<ExtraAdvance> CREATOR = new Creator();
        @SerializedName("extraAdvance1")
        @NotNull
        private final String extraAdvance1;
        @SerializedName("extraAdvance2")
        @NotNull
        private final String extraAdvance2;
        @SerializedName("invoiceDiscount")
        @NotNull
        private final String invoiceDiscount;
        @SerializedName("rrpText")
        @NotNull
        private final String rrpText;

        @Metadata(m28849k = 3, m28848mv = {1, 8, 0}, m28846xi = 48)
        /* renamed from: th.co.dtac.android.dtacone.model.blacklist.PackagePriceTierResponse$ExtraAdvance$Creator */
        /* loaded from: classes8.dex */
        public static final class Creator implements Parcelable.Creator<ExtraAdvance> {
            @Override // android.os.Parcelable.Creator
            @NotNull
            public final ExtraAdvance createFromParcel(@NotNull Parcel parcel) {
                Intrinsics.checkNotNullParameter(parcel, "parcel");
                return new ExtraAdvance(parcel.readString(), parcel.readString(), parcel.readString(), parcel.readString());
            }

            @Override // android.os.Parcelable.Creator
            @NotNull
            public final ExtraAdvance[] newArray(int i) {
                return new ExtraAdvance[i];
            }
        }

        public ExtraAdvance(@NotNull String rrpText, @NotNull String extraAdvance1, @NotNull String extraAdvance2, @NotNull String invoiceDiscount) {
            Intrinsics.checkNotNullParameter(rrpText, "rrpText");
            Intrinsics.checkNotNullParameter(extraAdvance1, "extraAdvance1");
            Intrinsics.checkNotNullParameter(extraAdvance2, "extraAdvance2");
            Intrinsics.checkNotNullParameter(invoiceDiscount, "invoiceDiscount");
            this.rrpText = rrpText;
            this.extraAdvance1 = extraAdvance1;
            this.extraAdvance2 = extraAdvance2;
            this.invoiceDiscount = invoiceDiscount;
        }

        public static /* synthetic */ ExtraAdvance copy$default(ExtraAdvance extraAdvance, String str, String str2, String str3, String str4, int i, Object obj) {
            if ((i & 1) != 0) {
                str = extraAdvance.rrpText;
            }
            if ((i & 2) != 0) {
                str2 = extraAdvance.extraAdvance1;
            }
            if ((i & 4) != 0) {
                str3 = extraAdvance.extraAdvance2;
            }
            if ((i & 8) != 0) {
                str4 = extraAdvance.invoiceDiscount;
            }
            return extraAdvance.copy(str, str2, str3, str4);
        }

        @NotNull
        public final String component1() {
            return this.rrpText;
        }

        @NotNull
        public final String component2() {
            return this.extraAdvance1;
        }

        @NotNull
        public final String component3() {
            return this.extraAdvance2;
        }

        @NotNull
        public final String component4() {
            return this.invoiceDiscount;
        }

        @NotNull
        public final ExtraAdvance copy(@NotNull String rrpText, @NotNull String extraAdvance1, @NotNull String extraAdvance2, @NotNull String invoiceDiscount) {
            Intrinsics.checkNotNullParameter(rrpText, "rrpText");
            Intrinsics.checkNotNullParameter(extraAdvance1, "extraAdvance1");
            Intrinsics.checkNotNullParameter(extraAdvance2, "extraAdvance2");
            Intrinsics.checkNotNullParameter(invoiceDiscount, "invoiceDiscount");
            return new ExtraAdvance(rrpText, extraAdvance1, extraAdvance2, invoiceDiscount);
        }

        @Override // android.os.Parcelable
        public int describeContents() {
            return 0;
        }

        public boolean equals(@Nullable Object obj) {
            if (this == obj) {
                return true;
            }
            if (obj instanceof ExtraAdvance) {
                ExtraAdvance extraAdvance = (ExtraAdvance) obj;
                return Intrinsics.areEqual(this.rrpText, extraAdvance.rrpText) && Intrinsics.areEqual(this.extraAdvance1, extraAdvance.extraAdvance1) && Intrinsics.areEqual(this.extraAdvance2, extraAdvance.extraAdvance2) && Intrinsics.areEqual(this.invoiceDiscount, extraAdvance.invoiceDiscount);
            }
            return false;
        }

        @NotNull
        public final String getExtraAdvance1() {
            return this.extraAdvance1;
        }

        @NotNull
        public final String getExtraAdvance2() {
            return this.extraAdvance2;
        }

        @NotNull
        public final String getInvoiceDiscount() {
            return this.invoiceDiscount;
        }

        @NotNull
        public final String getRrpText() {
            return this.rrpText;
        }

        public int hashCode() {
            return (((((this.rrpText.hashCode() * 31) + this.extraAdvance1.hashCode()) * 31) + this.extraAdvance2.hashCode()) * 31) + this.invoiceDiscount.hashCode();
        }

        @NotNull
        public String toString() {
            String str = this.rrpText;
            String str2 = this.extraAdvance1;
            String str3 = this.extraAdvance2;
            String str4 = this.invoiceDiscount;
            return "ExtraAdvance(rrpText=" + str + ", extraAdvance1=" + str2 + ", extraAdvance2=" + str3 + ", invoiceDiscount=" + str4 + ")";
        }

        @Override // android.os.Parcelable
        public void writeToParcel(@NotNull Parcel out, int i) {
            Intrinsics.checkNotNullParameter(out, "out");
            out.writeString(this.rrpText);
            out.writeString(this.extraAdvance1);
            out.writeString(this.extraAdvance2);
            out.writeString(this.invoiceDiscount);
        }
    }

    public PackagePriceTierResponse() {
        this(null, 1, null);
    }

    /* JADX WARN: Multi-variable type inference failed */
    public static /* synthetic */ PackagePriceTierResponse copy$default(PackagePriceTierResponse packagePriceTierResponse, List list, int i, Object obj) {
        if ((i & 1) != 0) {
            list = packagePriceTierResponse.extraAdvance;
        }
        return packagePriceTierResponse.copy(list);
    }

    @Nullable
    public final List<ExtraAdvance> component1() {
        return this.extraAdvance;
    }

    @NotNull
    public final PackagePriceTierResponse copy(@Nullable List<ExtraAdvance> list) {
        return new PackagePriceTierResponse(list);
    }

    @Override // android.os.Parcelable
    public int describeContents() {
        return 0;
    }

    public boolean equals(@Nullable Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof PackagePriceTierResponse) && Intrinsics.areEqual(this.extraAdvance, ((PackagePriceTierResponse) obj).extraAdvance);
    }

    @Nullable
    public final List<ExtraAdvance> getExtraAdvance() {
        return this.extraAdvance;
    }

    public int hashCode() {
        List<ExtraAdvance> list = this.extraAdvance;
        if (list == null) {
            return 0;
        }
        return list.hashCode();
    }

    @NotNull
    public String toString() {
        List<ExtraAdvance> list = this.extraAdvance;
        return "PackagePriceTierResponse(extraAdvance=" + list + ")";
    }

    @Override // android.os.Parcelable
    public void writeToParcel(@NotNull Parcel out, int i) {
        Intrinsics.checkNotNullParameter(out, "out");
        List<ExtraAdvance> list = this.extraAdvance;
        if (list == null) {
            out.writeInt(0);
            return;
        }
        out.writeInt(1);
        out.writeInt(list.size());
        for (ExtraAdvance extraAdvance : list) {
            extraAdvance.writeToParcel(out, i);
        }
    }

    public PackagePriceTierResponse(@Nullable List<ExtraAdvance> list) {
        this.extraAdvance = list;
    }

    public /* synthetic */ PackagePriceTierResponse(List list, int i, DefaultConstructorMarker defaultConstructorMarker) {
        this((i & 1) != 0 ? null : list);
    }
}

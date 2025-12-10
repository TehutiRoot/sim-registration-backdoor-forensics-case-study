package th.p047co.dtac.android.dtacone.model.customerenquiry;

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
@Metadata(m28851d1 = {"\u0000>\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\b\f\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\b\u0087\b\u0018\u00002\u00020\u0001B/\u0012\n\b\u0002\u0010\u0002\u001a\u0004\u0018\u00010\u0003\u0012\u0010\b\u0002\u0010\u0004\u001a\n\u0012\u0004\u0012\u00020\u0006\u0018\u00010\u0005\u0012\n\b\u0002\u0010\u0007\u001a\u0004\u0018\u00010\u0003¢\u0006\u0002\u0010\bJ\u000b\u0010\u000e\u001a\u0004\u0018\u00010\u0003HÆ\u0003J\u0011\u0010\u000f\u001a\n\u0012\u0004\u0012\u00020\u0006\u0018\u00010\u0005HÆ\u0003J\u000b\u0010\u0010\u001a\u0004\u0018\u00010\u0003HÆ\u0003J3\u0010\u0011\u001a\u00020\u00002\n\b\u0002\u0010\u0002\u001a\u0004\u0018\u00010\u00032\u0010\b\u0002\u0010\u0004\u001a\n\u0012\u0004\u0012\u00020\u0006\u0018\u00010\u00052\n\b\u0002\u0010\u0007\u001a\u0004\u0018\u00010\u0003HÆ\u0001J\t\u0010\u0012\u001a\u00020\u0013HÖ\u0001J\u0013\u0010\u0014\u001a\u00020\u00152\b\u0010\u0016\u001a\u0004\u0018\u00010\u0017HÖ\u0003J\t\u0010\u0018\u001a\u00020\u0013HÖ\u0001J\t\u0010\u0019\u001a\u00020\u0003HÖ\u0001J\u0019\u0010\u001a\u001a\u00020\u001b2\u0006\u0010\u001c\u001a\u00020\u001d2\u0006\u0010\u001e\u001a\u00020\u0013HÖ\u0001R\u0018\u0010\u0007\u001a\u0004\u0018\u00010\u00038\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b\t\u0010\nR\u001e\u0010\u0004\u001a\n\u0012\u0004\u0012\u00020\u0006\u0018\u00010\u00058\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u000b\u0010\fR\u0018\u0010\u0002\u001a\u0004\u0018\u00010\u00038\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b\r\u0010\n¨\u0006\u001f"}, m28850d2 = {"Lth/co/dtac/android/dtacone/model/customerenquiry/ContractItem;", "Landroid/os/Parcelable;", "subscriberNo", "", "info", "", "Lth/co/dtac/android/dtacone/model/customerenquiry/InfoItem;", "allowExtendFlag", "(Ljava/lang/String;Ljava/util/List;Ljava/lang/String;)V", "getAllowExtendFlag", "()Ljava/lang/String;", "getInfo", "()Ljava/util/List;", "getSubscriberNo", "component1", "component2", "component3", "copy", "describeContents", "", "equals", "", "other", "", "hashCode", "toString", "writeToParcel", "", "parcel", "Landroid/os/Parcel;", "flags", "app_prodRelease"}, m28849k = 1, m28848mv = {1, 8, 0}, m28846xi = 48)
/* renamed from: th.co.dtac.android.dtacone.model.customerenquiry.ContractItem */
/* loaded from: classes8.dex */
public final class ContractItem implements Parcelable {
    public static final int $stable = 8;
    @NotNull
    public static final Parcelable.Creator<ContractItem> CREATOR = new Creator();
    @SerializedName("allowExtendFlag")
    @Nullable
    private final String allowExtendFlag;
    @SerializedName("info")
    @Nullable
    private final List<InfoItem> info;
    @SerializedName("subscriberNo")
    @Nullable
    private final String subscriberNo;

    @Metadata(m28849k = 3, m28848mv = {1, 8, 0}, m28846xi = 48)
    /* renamed from: th.co.dtac.android.dtacone.model.customerenquiry.ContractItem$Creator */
    /* loaded from: classes8.dex */
    public static final class Creator implements Parcelable.Creator<ContractItem> {
        @Override // android.os.Parcelable.Creator
        @NotNull
        public final ContractItem createFromParcel(@NotNull Parcel parcel) {
            ArrayList arrayList;
            Intrinsics.checkNotNullParameter(parcel, "parcel");
            String readString = parcel.readString();
            if (parcel.readInt() == 0) {
                arrayList = null;
            } else {
                int readInt = parcel.readInt();
                ArrayList arrayList2 = new ArrayList(readInt);
                for (int i = 0; i != readInt; i++) {
                    arrayList2.add(InfoItem.CREATOR.createFromParcel(parcel));
                }
                arrayList = arrayList2;
            }
            return new ContractItem(readString, arrayList, parcel.readString());
        }

        @Override // android.os.Parcelable.Creator
        @NotNull
        public final ContractItem[] newArray(int i) {
            return new ContractItem[i];
        }
    }

    public ContractItem() {
        this(null, null, null, 7, null);
    }

    /* JADX WARN: Multi-variable type inference failed */
    public static /* synthetic */ ContractItem copy$default(ContractItem contractItem, String str, List list, String str2, int i, Object obj) {
        if ((i & 1) != 0) {
            str = contractItem.subscriberNo;
        }
        if ((i & 2) != 0) {
            list = contractItem.info;
        }
        if ((i & 4) != 0) {
            str2 = contractItem.allowExtendFlag;
        }
        return contractItem.copy(str, list, str2);
    }

    @Nullable
    public final String component1() {
        return this.subscriberNo;
    }

    @Nullable
    public final List<InfoItem> component2() {
        return this.info;
    }

    @Nullable
    public final String component3() {
        return this.allowExtendFlag;
    }

    @NotNull
    public final ContractItem copy(@Nullable String str, @Nullable List<InfoItem> list, @Nullable String str2) {
        return new ContractItem(str, list, str2);
    }

    @Override // android.os.Parcelable
    public int describeContents() {
        return 0;
    }

    public boolean equals(@Nullable Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj instanceof ContractItem) {
            ContractItem contractItem = (ContractItem) obj;
            return Intrinsics.areEqual(this.subscriberNo, contractItem.subscriberNo) && Intrinsics.areEqual(this.info, contractItem.info) && Intrinsics.areEqual(this.allowExtendFlag, contractItem.allowExtendFlag);
        }
        return false;
    }

    @Nullable
    public final String getAllowExtendFlag() {
        return this.allowExtendFlag;
    }

    @Nullable
    public final List<InfoItem> getInfo() {
        return this.info;
    }

    @Nullable
    public final String getSubscriberNo() {
        return this.subscriberNo;
    }

    public int hashCode() {
        String str = this.subscriberNo;
        int hashCode = (str == null ? 0 : str.hashCode()) * 31;
        List<InfoItem> list = this.info;
        int hashCode2 = (hashCode + (list == null ? 0 : list.hashCode())) * 31;
        String str2 = this.allowExtendFlag;
        return hashCode2 + (str2 != null ? str2.hashCode() : 0);
    }

    @NotNull
    public String toString() {
        String str = this.subscriberNo;
        List<InfoItem> list = this.info;
        String str2 = this.allowExtendFlag;
        return "ContractItem(subscriberNo=" + str + ", info=" + list + ", allowExtendFlag=" + str2 + ")";
    }

    @Override // android.os.Parcelable
    public void writeToParcel(@NotNull Parcel out, int i) {
        Intrinsics.checkNotNullParameter(out, "out");
        out.writeString(this.subscriberNo);
        List<InfoItem> list = this.info;
        if (list == null) {
            out.writeInt(0);
        } else {
            out.writeInt(1);
            out.writeInt(list.size());
            for (InfoItem infoItem : list) {
                infoItem.writeToParcel(out, i);
            }
        }
        out.writeString(this.allowExtendFlag);
    }

    public ContractItem(@Nullable String str, @Nullable List<InfoItem> list, @Nullable String str2) {
        this.subscriberNo = str;
        this.info = list;
        this.allowExtendFlag = str2;
    }

    public /* synthetic */ ContractItem(String str, List list, String str2, int i, DefaultConstructorMarker defaultConstructorMarker) {
        this((i & 1) != 0 ? null : str, (i & 2) != 0 ? null : list, (i & 4) != 0 ? null : str2);
    }
}

package th.p047co.dtac.android.dtacone.model.appOne.campaign.trueCompany;

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
@Metadata(m28851d1 = {"\u0000B\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u000e\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0003\b\u0087\b\u0018\u0000 \"2\u00020\u0001:\u0001\"B\u000f\b\u0016\u0012\u0006\u0010\u0002\u001a\u00020\u0003¢\u0006\u0002\u0010\u0004B5\u0012\u0010\b\u0002\u0010\u0005\u001a\n\u0012\u0004\u0012\u00020\u0007\u0018\u00010\u0006\u0012\u0010\b\u0002\u0010\b\u001a\n\u0012\u0004\u0012\u00020\u0007\u0018\u00010\u0006\u0012\n\b\u0002\u0010\t\u001a\u0004\u0018\u00010\n¢\u0006\u0002\u0010\u000bJ\u0011\u0010\u0012\u001a\n\u0012\u0004\u0012\u00020\u0007\u0018\u00010\u0006HÆ\u0003J\u0011\u0010\u0013\u001a\n\u0012\u0004\u0012\u00020\u0007\u0018\u00010\u0006HÆ\u0003J\u0010\u0010\u0014\u001a\u0004\u0018\u00010\nHÆ\u0003¢\u0006\u0002\u0010\u0010J>\u0010\u0015\u001a\u00020\u00002\u0010\b\u0002\u0010\u0005\u001a\n\u0012\u0004\u0012\u00020\u0007\u0018\u00010\u00062\u0010\b\u0002\u0010\b\u001a\n\u0012\u0004\u0012\u00020\u0007\u0018\u00010\u00062\n\b\u0002\u0010\t\u001a\u0004\u0018\u00010\nHÆ\u0001¢\u0006\u0002\u0010\u0016J\b\u0010\u0017\u001a\u00020\nH\u0016J\u0013\u0010\u0018\u001a\u00020\u00192\b\u0010\u001a\u001a\u0004\u0018\u00010\u001bHÖ\u0003J\t\u0010\u001c\u001a\u00020\nHÖ\u0001J\t\u0010\u001d\u001a\u00020\u001eHÖ\u0001J\u0018\u0010\u001f\u001a\u00020 2\u0006\u0010\u0002\u001a\u00020\u00032\u0006\u0010!\u001a\u00020\nH\u0016R\u001e\u0010\u0005\u001a\n\u0012\u0004\u0012\u00020\u0007\u0018\u00010\u00068\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b\f\u0010\rR\u001e\u0010\b\u001a\n\u0012\u0004\u0012\u00020\u0007\u0018\u00010\u00068\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u000e\u0010\rR\u001a\u0010\t\u001a\u0004\u0018\u00010\n8\u0006X\u0087\u0004¢\u0006\n\n\u0002\u0010\u0011\u001a\u0004\b\u000f\u0010\u0010¨\u0006#"}, m28850d2 = {"Lth/co/dtac/android/dtacone/model/appOne/campaign/trueCompany/DataCampaign;", "Landroid/os/Parcelable;", "parcel", "Landroid/os/Parcel;", "(Landroid/os/Parcel;)V", "alreadyRegister", "", "Lth/co/dtac/android/dtacone/model/appOne/campaign/trueCompany/DataItem;", "notRegister", "totalNotRegisterCampaign", "", "(Ljava/util/List;Ljava/util/List;Ljava/lang/Integer;)V", "getAlreadyRegister", "()Ljava/util/List;", "getNotRegister", "getTotalNotRegisterCampaign", "()Ljava/lang/Integer;", "Ljava/lang/Integer;", "component1", "component2", "component3", "copy", "(Ljava/util/List;Ljava/util/List;Ljava/lang/Integer;)Lth/co/dtac/android/dtacone/model/appOne/campaign/trueCompany/DataCampaign;", "describeContents", "equals", "", "other", "", "hashCode", "toString", "", "writeToParcel", "", "flags", "CREATOR", "app_prodRelease"}, m28849k = 1, m28848mv = {1, 8, 0}, m28846xi = 48)
/* renamed from: th.co.dtac.android.dtacone.model.appOne.campaign.trueCompany.DataCampaign */
/* loaded from: classes8.dex */
public final class DataCampaign implements Parcelable {
    @SerializedName("alreadyRegister")
    @Nullable
    private final List<DataItem> alreadyRegister;
    @SerializedName("notRegister")
    @Nullable
    private final List<DataItem> notRegister;
    @SerializedName("totalNotRegisterCampaign")
    @Nullable
    private final Integer totalNotRegisterCampaign;
    @NotNull
    public static final CREATOR CREATOR = new CREATOR(null);
    public static final int $stable = 8;

    @Metadata(m28851d1 = {"\u0000$\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0011\n\u0000\n\u0002\u0010\b\n\u0002\b\u0002\b\u0086\u0003\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001B\u0007\b\u0002¢\u0006\u0002\u0010\u0003J\u0010\u0010\u0004\u001a\u00020\u00022\u0006\u0010\u0005\u001a\u00020\u0006H\u0016J\u001d\u0010\u0007\u001a\n\u0012\u0006\u0012\u0004\u0018\u00010\u00020\b2\u0006\u0010\t\u001a\u00020\nH\u0016¢\u0006\u0002\u0010\u000b¨\u0006\f"}, m28850d2 = {"Lth/co/dtac/android/dtacone/model/appOne/campaign/trueCompany/DataCampaign$CREATOR;", "Landroid/os/Parcelable$Creator;", "Lth/co/dtac/android/dtacone/model/appOne/campaign/trueCompany/DataCampaign;", "()V", "createFromParcel", "parcel", "Landroid/os/Parcel;", "newArray", "", "size", "", "(I)[Lth/co/dtac/android/dtacone/model/appOne/campaign/trueCompany/DataCampaign;", "app_prodRelease"}, m28849k = 1, m28848mv = {1, 8, 0}, m28846xi = 48)
    /* renamed from: th.co.dtac.android.dtacone.model.appOne.campaign.trueCompany.DataCampaign$CREATOR */
    /* loaded from: classes8.dex */
    public static final class CREATOR implements Parcelable.Creator<DataCampaign> {
        public /* synthetic */ CREATOR(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        private CREATOR() {
        }

        @Override // android.os.Parcelable.Creator
        @NotNull
        public DataCampaign createFromParcel(@NotNull Parcel parcel) {
            Intrinsics.checkNotNullParameter(parcel, "parcel");
            return new DataCampaign(parcel);
        }

        @Override // android.os.Parcelable.Creator
        @NotNull
        public DataCampaign[] newArray(int i) {
            return new DataCampaign[i];
        }
    }

    public DataCampaign() {
        this(null, null, null, 7, null);
    }

    /* JADX WARN: Multi-variable type inference failed */
    public static /* synthetic */ DataCampaign copy$default(DataCampaign dataCampaign, List list, List list2, Integer num, int i, Object obj) {
        if ((i & 1) != 0) {
            list = dataCampaign.alreadyRegister;
        }
        if ((i & 2) != 0) {
            list2 = dataCampaign.notRegister;
        }
        if ((i & 4) != 0) {
            num = dataCampaign.totalNotRegisterCampaign;
        }
        return dataCampaign.copy(list, list2, num);
    }

    @Nullable
    public final List<DataItem> component1() {
        return this.alreadyRegister;
    }

    @Nullable
    public final List<DataItem> component2() {
        return this.notRegister;
    }

    @Nullable
    public final Integer component3() {
        return this.totalNotRegisterCampaign;
    }

    @NotNull
    public final DataCampaign copy(@Nullable List<DataItem> list, @Nullable List<DataItem> list2, @Nullable Integer num) {
        return new DataCampaign(list, list2, num);
    }

    @Override // android.os.Parcelable
    public int describeContents() {
        return 0;
    }

    public boolean equals(@Nullable Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj instanceof DataCampaign) {
            DataCampaign dataCampaign = (DataCampaign) obj;
            return Intrinsics.areEqual(this.alreadyRegister, dataCampaign.alreadyRegister) && Intrinsics.areEqual(this.notRegister, dataCampaign.notRegister) && Intrinsics.areEqual(this.totalNotRegisterCampaign, dataCampaign.totalNotRegisterCampaign);
        }
        return false;
    }

    @Nullable
    public final List<DataItem> getAlreadyRegister() {
        return this.alreadyRegister;
    }

    @Nullable
    public final List<DataItem> getNotRegister() {
        return this.notRegister;
    }

    @Nullable
    public final Integer getTotalNotRegisterCampaign() {
        return this.totalNotRegisterCampaign;
    }

    public int hashCode() {
        List<DataItem> list = this.alreadyRegister;
        int hashCode = (list == null ? 0 : list.hashCode()) * 31;
        List<DataItem> list2 = this.notRegister;
        int hashCode2 = (hashCode + (list2 == null ? 0 : list2.hashCode())) * 31;
        Integer num = this.totalNotRegisterCampaign;
        return hashCode2 + (num != null ? num.hashCode() : 0);
    }

    @NotNull
    public String toString() {
        List<DataItem> list = this.alreadyRegister;
        List<DataItem> list2 = this.notRegister;
        Integer num = this.totalNotRegisterCampaign;
        return "DataCampaign(alreadyRegister=" + list + ", notRegister=" + list2 + ", totalNotRegisterCampaign=" + num + ")";
    }

    @Override // android.os.Parcelable
    public void writeToParcel(@NotNull Parcel parcel, int i) {
        Intrinsics.checkNotNullParameter(parcel, "parcel");
        parcel.writeTypedList(this.alreadyRegister);
        parcel.writeTypedList(this.notRegister);
        parcel.writeValue(this.totalNotRegisterCampaign);
    }

    public DataCampaign(@Nullable List<DataItem> list, @Nullable List<DataItem> list2, @Nullable Integer num) {
        this.alreadyRegister = list;
        this.notRegister = list2;
        this.totalNotRegisterCampaign = num;
    }

    public /* synthetic */ DataCampaign(List list, List list2, Integer num, int i, DefaultConstructorMarker defaultConstructorMarker) {
        this((i & 1) != 0 ? null : list, (i & 2) != 0 ? null : list2, (i & 4) != 0 ? null : num);
    }

    /* JADX WARN: Illegal instructions before constructor call */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public DataCampaign(@org.jetbrains.annotations.NotNull android.os.Parcel r4) {
        /*
            r3 = this;
            java.lang.String r0 = "parcel"
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(r4, r0)
            th.co.dtac.android.dtacone.model.appOne.campaign.trueCompany.DataItem$CREATOR r0 = th.p047co.dtac.android.dtacone.model.appOne.campaign.trueCompany.DataItem.CREATOR
            java.util.ArrayList r1 = r4.createTypedArrayList(r0)
            java.util.ArrayList r0 = r4.createTypedArrayList(r0)
            java.lang.Class r2 = java.lang.Integer.TYPE
            java.lang.ClassLoader r2 = r2.getClassLoader()
            java.lang.Object r4 = r4.readValue(r2)
            boolean r2 = r4 instanceof java.lang.Integer
            if (r2 == 0) goto L20
            java.lang.Integer r4 = (java.lang.Integer) r4
            goto L21
        L20:
            r4 = 0
        L21:
            r3.<init>(r1, r0, r4)
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: th.p047co.dtac.android.dtacone.model.appOne.campaign.trueCompany.DataCampaign.<init>(android.os.Parcel):void");
    }
}

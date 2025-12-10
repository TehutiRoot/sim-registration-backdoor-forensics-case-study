package th.p047co.dtac.android.dtacone.model;

import android.os.Parcel;
import android.os.Parcelable;
import androidx.compose.runtime.internal.StabilityInferred;
import com.google.gson.annotations.SerializedName;
import java.util.List;
import kotlin.Metadata;
import kotlin.jvm.JvmOverloads;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

@StabilityInferred(parameters = 0)
@Metadata(m28851d1 = {"\u0000:\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010 \n\u0002\u0010\u000e\n\u0002\b\u000f\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0010\u0002\n\u0002\b\u0003\b\u0087\b\u0018\u0000 !2\u00020\u0001:\u0001!B\u000f\b\u0016\u0012\u0006\u0010\u0002\u001a\u00020\u0003¢\u0006\u0002\u0010\u0004B/\b\u0007\u0012\u000e\u0010\u0005\u001a\n\u0012\u0004\u0012\u00020\u0007\u0018\u00010\u0006\u0012\n\b\u0002\u0010\b\u001a\u0004\u0018\u00010\u0007\u0012\n\b\u0002\u0010\t\u001a\u0004\u0018\u00010\u0007¢\u0006\u0002\u0010\nJ\u0011\u0010\u0012\u001a\n\u0012\u0004\u0012\u00020\u0007\u0018\u00010\u0006HÆ\u0003J\u000b\u0010\u0013\u001a\u0004\u0018\u00010\u0007HÆ\u0003J\u000b\u0010\u0014\u001a\u0004\u0018\u00010\u0007HÆ\u0003J3\u0010\u0015\u001a\u00020\u00002\u0010\b\u0002\u0010\u0005\u001a\n\u0012\u0004\u0012\u00020\u0007\u0018\u00010\u00062\n\b\u0002\u0010\b\u001a\u0004\u0018\u00010\u00072\n\b\u0002\u0010\t\u001a\u0004\u0018\u00010\u0007HÆ\u0001J\b\u0010\u0016\u001a\u00020\u0017H\u0016J\u0013\u0010\u0018\u001a\u00020\u00192\b\u0010\u001a\u001a\u0004\u0018\u00010\u001bHÖ\u0003J\t\u0010\u001c\u001a\u00020\u0017HÖ\u0001J\t\u0010\u001d\u001a\u00020\u0007HÖ\u0001J\u0018\u0010\u001e\u001a\u00020\u001f2\u0006\u0010\u0002\u001a\u00020\u00032\u0006\u0010 \u001a\u00020\u0017H\u0016R\u0018\u0010\b\u001a\u0004\u0018\u00010\u00078\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u000b\u0010\fR\u0018\u0010\t\u001a\u0004\u0018\u00010\u00078\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b\r\u0010\fR&\u0010\u0005\u001a\n\u0012\u0004\u0012\u00020\u0007\u0018\u00010\u00068\u0006@\u0006X\u0087\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u000e\u0010\u000f\"\u0004\b\u0010\u0010\u0011¨\u0006\""}, m28850d2 = {"Lth/co/dtac/android/dtacone/model/SimRCollection;", "Landroid/os/Parcelable;", "parcel", "Landroid/os/Parcel;", "(Landroid/os/Parcel;)V", "simRList", "", "", "resultCode", "resultMessage", "(Ljava/util/List;Ljava/lang/String;Ljava/lang/String;)V", "getResultCode", "()Ljava/lang/String;", "getResultMessage", "getSimRList", "()Ljava/util/List;", "setSimRList", "(Ljava/util/List;)V", "component1", "component2", "component3", "copy", "describeContents", "", "equals", "", "other", "", "hashCode", "toString", "writeToParcel", "", "flags", "CREATOR", "app_prodRelease"}, m28849k = 1, m28848mv = {1, 8, 0}, m28846xi = 48)
/* renamed from: th.co.dtac.android.dtacone.model.SimRCollection */
/* loaded from: classes8.dex */
public final class SimRCollection implements Parcelable {
    @SerializedName("resultCode")
    @Nullable
    private final String resultCode;
    @SerializedName("resultMessage")
    @Nullable
    private final String resultMessage;
    @SerializedName("simRList")
    @Nullable
    private List<String> simRList;
    @NotNull
    public static final CREATOR CREATOR = new CREATOR(null);
    public static final int $stable = 8;

    @Metadata(m28851d1 = {"\u0000$\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0011\n\u0000\n\u0002\u0010\b\n\u0002\b\u0002\b\u0086\u0003\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001B\u0007\b\u0002¢\u0006\u0002\u0010\u0003J\u0010\u0010\u0004\u001a\u00020\u00022\u0006\u0010\u0005\u001a\u00020\u0006H\u0016J\u001d\u0010\u0007\u001a\n\u0012\u0006\u0012\u0004\u0018\u00010\u00020\b2\u0006\u0010\t\u001a\u00020\nH\u0016¢\u0006\u0002\u0010\u000b¨\u0006\f"}, m28850d2 = {"Lth/co/dtac/android/dtacone/model/SimRCollection$CREATOR;", "Landroid/os/Parcelable$Creator;", "Lth/co/dtac/android/dtacone/model/SimRCollection;", "()V", "createFromParcel", "parcel", "Landroid/os/Parcel;", "newArray", "", "size", "", "(I)[Lth/co/dtac/android/dtacone/model/SimRCollection;", "app_prodRelease"}, m28849k = 1, m28848mv = {1, 8, 0}, m28846xi = 48)
    /* renamed from: th.co.dtac.android.dtacone.model.SimRCollection$CREATOR */
    /* loaded from: classes8.dex */
    public static final class CREATOR implements Parcelable.Creator<SimRCollection> {
        public /* synthetic */ CREATOR(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        private CREATOR() {
        }

        @Override // android.os.Parcelable.Creator
        @NotNull
        public SimRCollection createFromParcel(@NotNull Parcel parcel) {
            Intrinsics.checkNotNullParameter(parcel, "parcel");
            return new SimRCollection(parcel);
        }

        @Override // android.os.Parcelable.Creator
        @NotNull
        public SimRCollection[] newArray(int i) {
            return new SimRCollection[i];
        }
    }

    @JvmOverloads
    public SimRCollection(@Nullable List<String> list) {
        this(list, null, null, 6, null);
    }

    /* JADX WARN: Multi-variable type inference failed */
    public static /* synthetic */ SimRCollection copy$default(SimRCollection simRCollection, List list, String str, String str2, int i, Object obj) {
        if ((i & 1) != 0) {
            list = simRCollection.simRList;
        }
        if ((i & 2) != 0) {
            str = simRCollection.resultCode;
        }
        if ((i & 4) != 0) {
            str2 = simRCollection.resultMessage;
        }
        return simRCollection.copy(list, str, str2);
    }

    @Nullable
    public final List<String> component1() {
        return this.simRList;
    }

    @Nullable
    public final String component2() {
        return this.resultCode;
    }

    @Nullable
    public final String component3() {
        return this.resultMessage;
    }

    @NotNull
    public final SimRCollection copy(@Nullable List<String> list, @Nullable String str, @Nullable String str2) {
        return new SimRCollection(list, str, str2);
    }

    @Override // android.os.Parcelable
    public int describeContents() {
        return 0;
    }

    public boolean equals(@Nullable Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj instanceof SimRCollection) {
            SimRCollection simRCollection = (SimRCollection) obj;
            return Intrinsics.areEqual(this.simRList, simRCollection.simRList) && Intrinsics.areEqual(this.resultCode, simRCollection.resultCode) && Intrinsics.areEqual(this.resultMessage, simRCollection.resultMessage);
        }
        return false;
    }

    @Nullable
    public final String getResultCode() {
        return this.resultCode;
    }

    @Nullable
    public final String getResultMessage() {
        return this.resultMessage;
    }

    @Nullable
    public final List<String> getSimRList() {
        return this.simRList;
    }

    public int hashCode() {
        List<String> list = this.simRList;
        int hashCode = (list == null ? 0 : list.hashCode()) * 31;
        String str = this.resultCode;
        int hashCode2 = (hashCode + (str == null ? 0 : str.hashCode())) * 31;
        String str2 = this.resultMessage;
        return hashCode2 + (str2 != null ? str2.hashCode() : 0);
    }

    public final void setSimRList(@Nullable List<String> list) {
        this.simRList = list;
    }

    @NotNull
    public String toString() {
        List<String> list = this.simRList;
        String str = this.resultCode;
        String str2 = this.resultMessage;
        return "SimRCollection(simRList=" + list + ", resultCode=" + str + ", resultMessage=" + str2 + ")";
    }

    @Override // android.os.Parcelable
    public void writeToParcel(@NotNull Parcel parcel, int i) {
        Intrinsics.checkNotNullParameter(parcel, "parcel");
        parcel.writeStringList(this.simRList);
        parcel.writeString(this.resultCode);
        parcel.writeString(this.resultMessage);
    }

    @JvmOverloads
    public SimRCollection(@Nullable List<String> list, @Nullable String str) {
        this(list, str, null, 4, null);
    }

    @JvmOverloads
    public SimRCollection(@Nullable List<String> list, @Nullable String str, @Nullable String str2) {
        this.simRList = list;
        this.resultCode = str;
        this.resultMessage = str2;
    }

    public /* synthetic */ SimRCollection(List list, String str, String str2, int i, DefaultConstructorMarker defaultConstructorMarker) {
        this(list, (i & 2) != 0 ? "" : str, (i & 4) != 0 ? "" : str2);
    }

    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    public SimRCollection(@NotNull Parcel parcel) {
        this(parcel.createStringArrayList(), parcel.readString(), parcel.readString());
        Intrinsics.checkNotNullParameter(parcel, "parcel");
    }
}

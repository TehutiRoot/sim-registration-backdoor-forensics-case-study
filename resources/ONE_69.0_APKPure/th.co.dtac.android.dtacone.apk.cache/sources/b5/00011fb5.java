package th.p047co.dtac.android.dtacone.model.p2post.submit.omr.request;

import android.os.Parcel;
import android.os.Parcelable;
import androidx.compose.runtime.internal.StabilityInferred;
import com.google.gson.annotations.SerializedName;
import kotlin.Metadata;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import kotlinx.android.parcel.Parcelize;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

@StabilityInferred(parameters = 0)
@Parcelize
@Metadata(m29143d1 = {"\u00006\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0016\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\b\u0087\b\u0018\u00002\u00020\u0001BM\u0012\n\b\u0002\u0010\u0002\u001a\u0004\u0018\u00010\u0003\u0012\n\b\u0002\u0010\u0004\u001a\u0004\u0018\u00010\u0005\u0012\n\b\u0002\u0010\u0006\u001a\u0004\u0018\u00010\u0005\u0012\n\b\u0002\u0010\u0007\u001a\u0004\u0018\u00010\u0005\u0012\n\b\u0002\u0010\b\u001a\u0004\u0018\u00010\u0005\u0012\n\b\u0002\u0010\t\u001a\u0004\u0018\u00010\u0005¢\u0006\u0002\u0010\nJ\u0010\u0010\u0013\u001a\u0004\u0018\u00010\u0003HÆ\u0003¢\u0006\u0002\u0010\u000fJ\u000b\u0010\u0014\u001a\u0004\u0018\u00010\u0005HÆ\u0003J\u000b\u0010\u0015\u001a\u0004\u0018\u00010\u0005HÆ\u0003J\u000b\u0010\u0016\u001a\u0004\u0018\u00010\u0005HÆ\u0003J\u000b\u0010\u0017\u001a\u0004\u0018\u00010\u0005HÆ\u0003J\u000b\u0010\u0018\u001a\u0004\u0018\u00010\u0005HÆ\u0003JV\u0010\u0019\u001a\u00020\u00002\n\b\u0002\u0010\u0002\u001a\u0004\u0018\u00010\u00032\n\b\u0002\u0010\u0004\u001a\u0004\u0018\u00010\u00052\n\b\u0002\u0010\u0006\u001a\u0004\u0018\u00010\u00052\n\b\u0002\u0010\u0007\u001a\u0004\u0018\u00010\u00052\n\b\u0002\u0010\b\u001a\u0004\u0018\u00010\u00052\n\b\u0002\u0010\t\u001a\u0004\u0018\u00010\u0005HÆ\u0001¢\u0006\u0002\u0010\u001aJ\t\u0010\u001b\u001a\u00020\u001cHÖ\u0001J\u0013\u0010\u001d\u001a\u00020\u00032\b\u0010\u001e\u001a\u0004\u0018\u00010\u001fHÖ\u0003J\t\u0010 \u001a\u00020\u001cHÖ\u0001J\t\u0010!\u001a\u00020\u0005HÖ\u0001J\u0019\u0010\"\u001a\u00020#2\u0006\u0010$\u001a\u00020%2\u0006\u0010&\u001a\u00020\u001cHÖ\u0001R\u0018\u0010\u0004\u001a\u0004\u0018\u00010\u00058\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u000b\u0010\fR\u0018\u0010\u0007\u001a\u0004\u0018\u00010\u00058\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b\r\u0010\fR\u0018\u0010\b\u001a\u0004\u0018\u00010\u00058\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u000e\u0010\fR\u001a\u0010\u0002\u001a\u0004\u0018\u00010\u00038\u0006X\u0087\u0004¢\u0006\n\n\u0002\u0010\u0010\u001a\u0004\b\u0002\u0010\u000fR\u0018\u0010\u0006\u001a\u0004\u0018\u00010\u00058\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u0011\u0010\fR\u0018\u0010\t\u001a\u0004\u0018\u00010\u00058\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u0012\u0010\f¨\u0006'"}, m29142d2 = {"Lth/co/dtac/android/dtacone/model/p2post/submit/omr/request/PackageItem;", "Landroid/os/Parcelable;", "isRecommend", "", "code", "", "name", "description", "flowId", "transactionId", "(Ljava/lang/Boolean;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)V", "getCode", "()Ljava/lang/String;", "getDescription", "getFlowId", "()Ljava/lang/Boolean;", "Ljava/lang/Boolean;", "getName", "getTransactionId", "component1", "component2", "component3", "component4", "component5", "component6", "copy", "(Ljava/lang/Boolean;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)Lth/co/dtac/android/dtacone/model/p2post/submit/omr/request/PackageItem;", "describeContents", "", "equals", "other", "", "hashCode", "toString", "writeToParcel", "", "parcel", "Landroid/os/Parcel;", "flags", "app_prodRelease"}, m29141k = 1, m29140mv = {1, 8, 0}, m29138xi = 48)
/* renamed from: th.co.dtac.android.dtacone.model.p2post.submit.omr.request.PackageItem */
/* loaded from: classes8.dex */
public final class PackageItem implements Parcelable {
    public static final int $stable = 0;
    @NotNull
    public static final Parcelable.Creator<PackageItem> CREATOR = new Creator();
    @SerializedName("code")
    @Nullable
    private final String code;
    @SerializedName("description")
    @Nullable
    private final String description;
    @SerializedName("flowId")
    @Nullable
    private final String flowId;
    @SerializedName("isRecommend")
    @Nullable
    private final Boolean isRecommend;
    @SerializedName("name")
    @Nullable
    private final String name;
    @SerializedName("transactionId")
    @Nullable
    private final String transactionId;

    @Metadata(m29141k = 3, m29140mv = {1, 8, 0}, m29138xi = 48)
    /* renamed from: th.co.dtac.android.dtacone.model.p2post.submit.omr.request.PackageItem$Creator */
    /* loaded from: classes8.dex */
    public static final class Creator implements Parcelable.Creator<PackageItem> {
        @Override // android.os.Parcelable.Creator
        @NotNull
        public final PackageItem createFromParcel(@NotNull Parcel parcel) {
            Boolean valueOf;
            Intrinsics.checkNotNullParameter(parcel, "parcel");
            if (parcel.readInt() == 0) {
                valueOf = null;
            } else {
                valueOf = Boolean.valueOf(parcel.readInt() != 0);
            }
            return new PackageItem(valueOf, parcel.readString(), parcel.readString(), parcel.readString(), parcel.readString(), parcel.readString());
        }

        @Override // android.os.Parcelable.Creator
        @NotNull
        public final PackageItem[] newArray(int i) {
            return new PackageItem[i];
        }
    }

    public PackageItem() {
        this(null, null, null, null, null, null, 63, null);
    }

    public static /* synthetic */ PackageItem copy$default(PackageItem packageItem, Boolean bool, String str, String str2, String str3, String str4, String str5, int i, Object obj) {
        if ((i & 1) != 0) {
            bool = packageItem.isRecommend;
        }
        if ((i & 2) != 0) {
            str = packageItem.code;
        }
        String str6 = str;
        if ((i & 4) != 0) {
            str2 = packageItem.name;
        }
        String str7 = str2;
        if ((i & 8) != 0) {
            str3 = packageItem.description;
        }
        String str8 = str3;
        if ((i & 16) != 0) {
            str4 = packageItem.flowId;
        }
        String str9 = str4;
        if ((i & 32) != 0) {
            str5 = packageItem.transactionId;
        }
        return packageItem.copy(bool, str6, str7, str8, str9, str5);
    }

    @Nullable
    public final Boolean component1() {
        return this.isRecommend;
    }

    @Nullable
    public final String component2() {
        return this.code;
    }

    @Nullable
    public final String component3() {
        return this.name;
    }

    @Nullable
    public final String component4() {
        return this.description;
    }

    @Nullable
    public final String component5() {
        return this.flowId;
    }

    @Nullable
    public final String component6() {
        return this.transactionId;
    }

    @NotNull
    public final PackageItem copy(@Nullable Boolean bool, @Nullable String str, @Nullable String str2, @Nullable String str3, @Nullable String str4, @Nullable String str5) {
        return new PackageItem(bool, str, str2, str3, str4, str5);
    }

    @Override // android.os.Parcelable
    public int describeContents() {
        return 0;
    }

    public boolean equals(@Nullable Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj instanceof PackageItem) {
            PackageItem packageItem = (PackageItem) obj;
            return Intrinsics.areEqual(this.isRecommend, packageItem.isRecommend) && Intrinsics.areEqual(this.code, packageItem.code) && Intrinsics.areEqual(this.name, packageItem.name) && Intrinsics.areEqual(this.description, packageItem.description) && Intrinsics.areEqual(this.flowId, packageItem.flowId) && Intrinsics.areEqual(this.transactionId, packageItem.transactionId);
        }
        return false;
    }

    @Nullable
    public final String getCode() {
        return this.code;
    }

    @Nullable
    public final String getDescription() {
        return this.description;
    }

    @Nullable
    public final String getFlowId() {
        return this.flowId;
    }

    @Nullable
    public final String getName() {
        return this.name;
    }

    @Nullable
    public final String getTransactionId() {
        return this.transactionId;
    }

    public int hashCode() {
        Boolean bool = this.isRecommend;
        int hashCode = (bool == null ? 0 : bool.hashCode()) * 31;
        String str = this.code;
        int hashCode2 = (hashCode + (str == null ? 0 : str.hashCode())) * 31;
        String str2 = this.name;
        int hashCode3 = (hashCode2 + (str2 == null ? 0 : str2.hashCode())) * 31;
        String str3 = this.description;
        int hashCode4 = (hashCode3 + (str3 == null ? 0 : str3.hashCode())) * 31;
        String str4 = this.flowId;
        int hashCode5 = (hashCode4 + (str4 == null ? 0 : str4.hashCode())) * 31;
        String str5 = this.transactionId;
        return hashCode5 + (str5 != null ? str5.hashCode() : 0);
    }

    @Nullable
    public final Boolean isRecommend() {
        return this.isRecommend;
    }

    @NotNull
    public String toString() {
        Boolean bool = this.isRecommend;
        String str = this.code;
        String str2 = this.name;
        String str3 = this.description;
        String str4 = this.flowId;
        String str5 = this.transactionId;
        return "PackageItem(isRecommend=" + bool + ", code=" + str + ", name=" + str2 + ", description=" + str3 + ", flowId=" + str4 + ", transactionId=" + str5 + ")";
    }

    @Override // android.os.Parcelable
    public void writeToParcel(@NotNull Parcel out, int i) {
        int i2;
        Intrinsics.checkNotNullParameter(out, "out");
        Boolean bool = this.isRecommend;
        if (bool == null) {
            i2 = 0;
        } else {
            out.writeInt(1);
            i2 = bool.booleanValue();
        }
        out.writeInt(i2);
        out.writeString(this.code);
        out.writeString(this.name);
        out.writeString(this.description);
        out.writeString(this.flowId);
        out.writeString(this.transactionId);
    }

    public PackageItem(@Nullable Boolean bool, @Nullable String str, @Nullable String str2, @Nullable String str3, @Nullable String str4, @Nullable String str5) {
        this.isRecommend = bool;
        this.code = str;
        this.name = str2;
        this.description = str3;
        this.flowId = str4;
        this.transactionId = str5;
    }

    public /* synthetic */ PackageItem(Boolean bool, String str, String str2, String str3, String str4, String str5, int i, DefaultConstructorMarker defaultConstructorMarker) {
        this((i & 1) != 0 ? null : bool, (i & 2) != 0 ? null : str, (i & 4) != 0 ? null : str2, (i & 8) != 0 ? null : str3, (i & 16) != 0 ? null : str4, (i & 32) != 0 ? null : str5);
    }
}
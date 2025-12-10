package th.p047co.dtac.android.dtacone.model.postpaid_registration;

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
@Metadata(m29143d1 = {"\u00006\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\n\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0003\b\u0087\b\u0018\u0000 \u001a2\u00020\u0001:\u0001\u001aB\u000f\b\u0016\u0012\u0006\u0010\u0002\u001a\u00020\u0003¢\u0006\u0002\u0010\u0004B\u0015\u0012\u0006\u0010\u0005\u001a\u00020\u0006\u0012\u0006\u0010\u0007\u001a\u00020\u0006¢\u0006\u0002\u0010\bJ\t\u0010\f\u001a\u00020\u0006HÆ\u0003J\t\u0010\r\u001a\u00020\u0006HÆ\u0003J\u001d\u0010\u000e\u001a\u00020\u00002\b\b\u0002\u0010\u0005\u001a\u00020\u00062\b\b\u0002\u0010\u0007\u001a\u00020\u0006HÆ\u0001J\b\u0010\u000f\u001a\u00020\u0006H\u0016J\u0013\u0010\u0010\u001a\u00020\u00112\b\u0010\u0012\u001a\u0004\u0018\u00010\u0013HÖ\u0003J\t\u0010\u0014\u001a\u00020\u0006HÖ\u0001J\t\u0010\u0015\u001a\u00020\u0016HÖ\u0001J\u0018\u0010\u0017\u001a\u00020\u00182\u0006\u0010\u0002\u001a\u00020\u00032\u0006\u0010\u0019\u001a\u00020\u0006H\u0016R\u0016\u0010\u0007\u001a\u00020\u00068\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b\t\u0010\nR\u0016\u0010\u0005\u001a\u00020\u00068\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u000b\u0010\n¨\u0006\u001b"}, m29142d2 = {"Lth/co/dtac/android/dtacone/model/postpaid_registration/PostpaidSearchPackagePaginate;", "Landroid/os/Parcelable;", "parcel", "Landroid/os/Parcel;", "(Landroid/os/Parcel;)V", "totalItem", "", "itemPerPage", "(II)V", "getItemPerPage", "()I", "getTotalItem", "component1", "component2", "copy", "describeContents", "equals", "", "other", "", "hashCode", "toString", "", "writeToParcel", "", "flags", "CREATOR", "app_prodRelease"}, m29141k = 1, m29140mv = {1, 8, 0}, m29138xi = 48)
/* renamed from: th.co.dtac.android.dtacone.model.postpaid_registration.PostpaidSearchPackagePaginate */
/* loaded from: classes8.dex */
public final class PostpaidSearchPackagePaginate implements Parcelable {
    public static final int $stable = 0;
    @NotNull
    public static final CREATOR CREATOR = new CREATOR(null);
    @SerializedName("itemPerPage")
    private final int itemPerPage;
    @SerializedName("totalItem")
    private final int totalItem;

    @Metadata(m29143d1 = {"\u0000$\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0011\n\u0000\n\u0002\u0010\b\n\u0002\b\u0002\b\u0086\u0003\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001B\u0007\b\u0002¢\u0006\u0002\u0010\u0003J\u0010\u0010\u0004\u001a\u00020\u00022\u0006\u0010\u0005\u001a\u00020\u0006H\u0016J\u001d\u0010\u0007\u001a\n\u0012\u0006\u0012\u0004\u0018\u00010\u00020\b2\u0006\u0010\t\u001a\u00020\nH\u0016¢\u0006\u0002\u0010\u000b¨\u0006\f"}, m29142d2 = {"Lth/co/dtac/android/dtacone/model/postpaid_registration/PostpaidSearchPackagePaginate$CREATOR;", "Landroid/os/Parcelable$Creator;", "Lth/co/dtac/android/dtacone/model/postpaid_registration/PostpaidSearchPackagePaginate;", "()V", "createFromParcel", "parcel", "Landroid/os/Parcel;", "newArray", "", "size", "", "(I)[Lth/co/dtac/android/dtacone/model/postpaid_registration/PostpaidSearchPackagePaginate;", "app_prodRelease"}, m29141k = 1, m29140mv = {1, 8, 0}, m29138xi = 48)
    /* renamed from: th.co.dtac.android.dtacone.model.postpaid_registration.PostpaidSearchPackagePaginate$CREATOR */
    /* loaded from: classes8.dex */
    public static final class CREATOR implements Parcelable.Creator<PostpaidSearchPackagePaginate> {
        public /* synthetic */ CREATOR(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        private CREATOR() {
        }

        @Override // android.os.Parcelable.Creator
        @NotNull
        public PostpaidSearchPackagePaginate createFromParcel(@NotNull Parcel parcel) {
            Intrinsics.checkNotNullParameter(parcel, "parcel");
            return new PostpaidSearchPackagePaginate(parcel);
        }

        @Override // android.os.Parcelable.Creator
        @NotNull
        public PostpaidSearchPackagePaginate[] newArray(int i) {
            return new PostpaidSearchPackagePaginate[i];
        }
    }

    public PostpaidSearchPackagePaginate(int i, int i2) {
        this.totalItem = i;
        this.itemPerPage = i2;
    }

    public static /* synthetic */ PostpaidSearchPackagePaginate copy$default(PostpaidSearchPackagePaginate postpaidSearchPackagePaginate, int i, int i2, int i3, Object obj) {
        if ((i3 & 1) != 0) {
            i = postpaidSearchPackagePaginate.totalItem;
        }
        if ((i3 & 2) != 0) {
            i2 = postpaidSearchPackagePaginate.itemPerPage;
        }
        return postpaidSearchPackagePaginate.copy(i, i2);
    }

    public final int component1() {
        return this.totalItem;
    }

    public final int component2() {
        return this.itemPerPage;
    }

    @NotNull
    public final PostpaidSearchPackagePaginate copy(int i, int i2) {
        return new PostpaidSearchPackagePaginate(i, i2);
    }

    @Override // android.os.Parcelable
    public int describeContents() {
        return 0;
    }

    public boolean equals(@Nullable Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj instanceof PostpaidSearchPackagePaginate) {
            PostpaidSearchPackagePaginate postpaidSearchPackagePaginate = (PostpaidSearchPackagePaginate) obj;
            return this.totalItem == postpaidSearchPackagePaginate.totalItem && this.itemPerPage == postpaidSearchPackagePaginate.itemPerPage;
        }
        return false;
    }

    public final int getItemPerPage() {
        return this.itemPerPage;
    }

    public final int getTotalItem() {
        return this.totalItem;
    }

    public int hashCode() {
        return (this.totalItem * 31) + this.itemPerPage;
    }

    @NotNull
    public String toString() {
        int i = this.totalItem;
        int i2 = this.itemPerPage;
        return "PostpaidSearchPackagePaginate(totalItem=" + i + ", itemPerPage=" + i2 + ")";
    }

    @Override // android.os.Parcelable
    public void writeToParcel(@NotNull Parcel parcel, int i) {
        Intrinsics.checkNotNullParameter(parcel, "parcel");
        parcel.writeInt(this.totalItem);
        parcel.writeInt(this.itemPerPage);
    }

    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    public PostpaidSearchPackagePaginate(@NotNull Parcel parcel) {
        this(parcel.readInt(), parcel.readInt());
        Intrinsics.checkNotNullParameter(parcel, "parcel");
    }
}
package th.p047co.dtac.android.dtacone.model.updateprepaid;

import android.os.Parcel;
import android.os.Parcelable;
import androidx.compose.runtime.internal.StabilityInferred;
import com.google.gson.annotations.SerializedName;
import java.util.List;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import kotlinx.android.parcel.Parcelize;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

@StabilityInferred(parameters = 0)
@Parcelize
@Metadata(m29143d1 = {"\u00008\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010 \n\u0002\u0010\u000e\n\u0002\b\u0007\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\b\u0087\b\u0018\u00002\u00020\u0001B\u0013\u0012\f\u0010\u0002\u001a\b\u0012\u0004\u0012\u00020\u00040\u0003¢\u0006\u0002\u0010\u0005J\u000f\u0010\t\u001a\b\u0012\u0004\u0012\u00020\u00040\u0003HÆ\u0003J\u0019\u0010\n\u001a\u00020\u00002\u000e\b\u0002\u0010\u0002\u001a\b\u0012\u0004\u0012\u00020\u00040\u0003HÆ\u0001J\t\u0010\u000b\u001a\u00020\fHÖ\u0001J\u0013\u0010\r\u001a\u00020\u000e2\b\u0010\u000f\u001a\u0004\u0018\u00010\u0010HÖ\u0003J\t\u0010\u0011\u001a\u00020\fHÖ\u0001J\t\u0010\u0012\u001a\u00020\u0004HÖ\u0001J\u0019\u0010\u0013\u001a\u00020\u00142\u0006\u0010\u0015\u001a\u00020\u00162\u0006\u0010\u0017\u001a\u00020\fHÖ\u0001R$\u0010\u0002\u001a\b\u0012\u0004\u0012\u00020\u00040\u00038\u0006@\u0006X\u0087\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u0006\u0010\u0007\"\u0004\b\b\u0010\u0005¨\u0006\u0018"}, m29142d2 = {"Lth/co/dtac/android/dtacone/model/updateprepaid/UpdatePrepaidOptionalImage;", "Landroid/os/Parcelable;", "optionalImages", "", "", "(Ljava/util/List;)V", "getOptionalImages", "()Ljava/util/List;", "setOptionalImages", "component1", "copy", "describeContents", "", "equals", "", "other", "", "hashCode", "toString", "writeToParcel", "", "parcel", "Landroid/os/Parcel;", "flags", "app_prodRelease"}, m29141k = 1, m29140mv = {1, 8, 0}, m29138xi = 48)
/* renamed from: th.co.dtac.android.dtacone.model.updateprepaid.UpdatePrepaidOptionalImage */
/* loaded from: classes8.dex */
public final class UpdatePrepaidOptionalImage implements Parcelable {
    public static final int $stable = 8;
    @NotNull
    public static final Parcelable.Creator<UpdatePrepaidOptionalImage> CREATOR = new Creator();
    @SerializedName("optionals")
    @NotNull
    private List<String> optionalImages;

    @Metadata(m29141k = 3, m29140mv = {1, 8, 0}, m29138xi = 48)
    /* renamed from: th.co.dtac.android.dtacone.model.updateprepaid.UpdatePrepaidOptionalImage$Creator */
    /* loaded from: classes8.dex */
    public static final class Creator implements Parcelable.Creator<UpdatePrepaidOptionalImage> {
        @Override // android.os.Parcelable.Creator
        @NotNull
        public final UpdatePrepaidOptionalImage createFromParcel(@NotNull Parcel parcel) {
            Intrinsics.checkNotNullParameter(parcel, "parcel");
            return new UpdatePrepaidOptionalImage(parcel.createStringArrayList());
        }

        @Override // android.os.Parcelable.Creator
        @NotNull
        public final UpdatePrepaidOptionalImage[] newArray(int i) {
            return new UpdatePrepaidOptionalImage[i];
        }
    }

    public UpdatePrepaidOptionalImage(@NotNull List<String> optionalImages) {
        Intrinsics.checkNotNullParameter(optionalImages, "optionalImages");
        this.optionalImages = optionalImages;
    }

    /* JADX WARN: Multi-variable type inference failed */
    public static /* synthetic */ UpdatePrepaidOptionalImage copy$default(UpdatePrepaidOptionalImage updatePrepaidOptionalImage, List list, int i, Object obj) {
        if ((i & 1) != 0) {
            list = updatePrepaidOptionalImage.optionalImages;
        }
        return updatePrepaidOptionalImage.copy(list);
    }

    @NotNull
    public final List<String> component1() {
        return this.optionalImages;
    }

    @NotNull
    public final UpdatePrepaidOptionalImage copy(@NotNull List<String> optionalImages) {
        Intrinsics.checkNotNullParameter(optionalImages, "optionalImages");
        return new UpdatePrepaidOptionalImage(optionalImages);
    }

    @Override // android.os.Parcelable
    public int describeContents() {
        return 0;
    }

    public boolean equals(@Nullable Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof UpdatePrepaidOptionalImage) && Intrinsics.areEqual(this.optionalImages, ((UpdatePrepaidOptionalImage) obj).optionalImages);
    }

    @NotNull
    public final List<String> getOptionalImages() {
        return this.optionalImages;
    }

    public int hashCode() {
        return this.optionalImages.hashCode();
    }

    public final void setOptionalImages(@NotNull List<String> list) {
        Intrinsics.checkNotNullParameter(list, "<set-?>");
        this.optionalImages = list;
    }

    @NotNull
    public String toString() {
        List<String> list = this.optionalImages;
        return "UpdatePrepaidOptionalImage(optionalImages=" + list + ")";
    }

    @Override // android.os.Parcelable
    public void writeToParcel(@NotNull Parcel out, int i) {
        Intrinsics.checkNotNullParameter(out, "out");
        out.writeStringList(this.optionalImages);
    }
}
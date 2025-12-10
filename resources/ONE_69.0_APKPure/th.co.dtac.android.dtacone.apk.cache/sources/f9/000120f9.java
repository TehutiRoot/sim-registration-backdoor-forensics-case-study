package th.p047co.dtac.android.dtacone.model.updateprepaid;

import android.os.Parcel;
import android.os.Parcelable;
import androidx.compose.runtime.internal.StabilityInferred;
import kotlin.Metadata;
import kotlin.jvm.JvmField;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import th.p047co.dtac.android.dtacone.model.prepaid.PrepaidPostcodeListCollection;

@StabilityInferred(parameters = 0)
@Metadata(m29143d1 = {"\u00004\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\b\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0004\b\u0007\u0018\u0000 \u00182\u00020\u0001:\u0001\u0018B\u000f\b\u0016\u0012\u0006\u0010\u0002\u001a\u00020\u0003¢\u0006\u0002\u0010\u0004B#\u0012\b\u0010\u0005\u001a\u0004\u0018\u00010\u0006\u0012\b\u0010\u0007\u001a\u0004\u0018\u00010\b\u0012\b\u0010\t\u001a\u0004\u0018\u00010\n¢\u0006\u0002\u0010\u000bJ\b\u0010\u0012\u001a\u00020\u0013H\u0016J\u0018\u0010\u0014\u001a\u00020\u00152\u0006\u0010\u0016\u001a\u00020\u00032\u0006\u0010\u0017\u001a\u00020\u0013H\u0016R\u0013\u0010\u0007\u001a\u0004\u0018\u00010\b¢\u0006\b\n\u0000\u001a\u0004\b\f\u0010\rR\u0013\u0010\u0005\u001a\u0004\u0018\u00010\u0006¢\u0006\b\n\u0000\u001a\u0004\b\u000e\u0010\u000fR\u0013\u0010\t\u001a\u0004\u0018\u00010\n¢\u0006\b\n\u0000\u001a\u0004\b\u0010\u0010\u0011¨\u0006\u0019"}, m29142d2 = {"Lth/co/dtac/android/dtacone/model/updateprepaid/UpdatePrepaidImageFile;", "Landroid/os/Parcelable;", "source", "Landroid/os/Parcel;", "(Landroid/os/Parcel;)V", "optionalImage", "Lth/co/dtac/android/dtacone/model/updateprepaid/UpdatePrepaidOptionalImage;", "imageResponse", "Lth/co/dtac/android/dtacone/model/updateprepaid/UpdateImageResponse;", "postCode", "Lth/co/dtac/android/dtacone/model/prepaid/PrepaidPostcodeListCollection;", "(Lth/co/dtac/android/dtacone/model/updateprepaid/UpdatePrepaidOptionalImage;Lth/co/dtac/android/dtacone/model/updateprepaid/UpdateImageResponse;Lth/co/dtac/android/dtacone/model/prepaid/PrepaidPostcodeListCollection;)V", "getImageResponse", "()Lth/co/dtac/android/dtacone/model/updateprepaid/UpdateImageResponse;", "getOptionalImage", "()Lth/co/dtac/android/dtacone/model/updateprepaid/UpdatePrepaidOptionalImage;", "getPostCode", "()Lth/co/dtac/android/dtacone/model/prepaid/PrepaidPostcodeListCollection;", "describeContents", "", "writeToParcel", "", "dest", "flags", "Companion", "app_prodRelease"}, m29141k = 1, m29140mv = {1, 8, 0}, m29138xi = 48)
/* renamed from: th.co.dtac.android.dtacone.model.updateprepaid.UpdatePrepaidImageFile */
/* loaded from: classes8.dex */
public final class UpdatePrepaidImageFile implements Parcelable {
    @Nullable
    private final UpdateImageResponse imageResponse;
    @Nullable
    private final UpdatePrepaidOptionalImage optionalImage;
    @Nullable
    private final PrepaidPostcodeListCollection postCode;
    @NotNull
    public static final Companion Companion = new Companion(null);
    public static final int $stable = 8;
    @JvmField
    @NotNull
    public static final Parcelable.Creator<UpdatePrepaidImageFile> CREATOR = new Parcelable.Creator<UpdatePrepaidImageFile>() { // from class: th.co.dtac.android.dtacone.model.updateprepaid.UpdatePrepaidImageFile$Companion$CREATOR$1
        @Override // android.os.Parcelable.Creator
        @NotNull
        public UpdatePrepaidImageFile createFromParcel(@NotNull Parcel source) {
            Intrinsics.checkNotNullParameter(source, "source");
            return new UpdatePrepaidImageFile(source);
        }

        @Override // android.os.Parcelable.Creator
        @NotNull
        public UpdatePrepaidImageFile[] newArray(int i) {
            return new UpdatePrepaidImageFile[i];
        }
    };

    @Metadata(m29143d1 = {"\u0000\u0016\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0086\u0003\u0018\u00002\u00020\u0001B\u0007\b\u0002¢\u0006\u0002\u0010\u0002R\u0016\u0010\u0003\u001a\b\u0012\u0004\u0012\u00020\u00050\u00048\u0006X\u0087\u0004¢\u0006\u0002\n\u0000¨\u0006\u0006"}, m29142d2 = {"Lth/co/dtac/android/dtacone/model/updateprepaid/UpdatePrepaidImageFile$Companion;", "", "()V", "CREATOR", "Landroid/os/Parcelable$Creator;", "Lth/co/dtac/android/dtacone/model/updateprepaid/UpdatePrepaidImageFile;", "app_prodRelease"}, m29141k = 1, m29140mv = {1, 8, 0}, m29138xi = 48)
    /* renamed from: th.co.dtac.android.dtacone.model.updateprepaid.UpdatePrepaidImageFile$Companion */
    /* loaded from: classes8.dex */
    public static final class Companion {
        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        private Companion() {
        }
    }

    public UpdatePrepaidImageFile(@Nullable UpdatePrepaidOptionalImage updatePrepaidOptionalImage, @Nullable UpdateImageResponse updateImageResponse, @Nullable PrepaidPostcodeListCollection prepaidPostcodeListCollection) {
        this.optionalImage = updatePrepaidOptionalImage;
        this.imageResponse = updateImageResponse;
        this.postCode = prepaidPostcodeListCollection;
    }

    @Override // android.os.Parcelable
    public int describeContents() {
        return 0;
    }

    @Nullable
    public final UpdateImageResponse getImageResponse() {
        return this.imageResponse;
    }

    @Nullable
    public final UpdatePrepaidOptionalImage getOptionalImage() {
        return this.optionalImage;
    }

    @Nullable
    public final PrepaidPostcodeListCollection getPostCode() {
        return this.postCode;
    }

    @Override // android.os.Parcelable
    public void writeToParcel(@NotNull Parcel dest, int i) {
        Intrinsics.checkNotNullParameter(dest, "dest");
        dest.writeParcelable(this.optionalImage, 0);
        dest.writeParcelable(this.imageResponse, 0);
        dest.writeParcelable(this.postCode, 0);
    }

    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    public UpdatePrepaidImageFile(@NotNull Parcel source) {
        this((UpdatePrepaidOptionalImage) source.readParcelable(UpdatePrepaidOptionalImage.class.getClassLoader()), (UpdateImageResponse) source.readParcelable(UpdateImageResponse.class.getClassLoader()), (PrepaidPostcodeListCollection) source.readParcelable(PrepaidPostcodeListCollection.class.getClassLoader()));
        Intrinsics.checkNotNullParameter(source, "source");
    }
}
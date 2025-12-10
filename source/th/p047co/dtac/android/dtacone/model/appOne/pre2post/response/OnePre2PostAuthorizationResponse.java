package th.p047co.dtac.android.dtacone.model.appOne.pre2post.response;

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
@Metadata(m28851d1 = {"\u0000<\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0003\b\u0087\b\u0018\u0000 \u00182\u00020\u0001:\u0001\u0018B\u000f\b\u0016\u0012\u0006\u0010\u0002\u001a\u00020\u0003¢\u0006\u0002\u0010\u0004B\u000f\u0012\b\u0010\u0005\u001a\u0004\u0018\u00010\u0006¢\u0006\u0002\u0010\u0007J\u000b\u0010\n\u001a\u0004\u0018\u00010\u0006HÆ\u0003J\u0015\u0010\u000b\u001a\u00020\u00002\n\b\u0002\u0010\u0005\u001a\u0004\u0018\u00010\u0006HÆ\u0001J\b\u0010\f\u001a\u00020\rH\u0016J\u0013\u0010\u000e\u001a\u00020\u000f2\b\u0010\u0010\u001a\u0004\u0018\u00010\u0011HÖ\u0003J\t\u0010\u0012\u001a\u00020\rHÖ\u0001J\t\u0010\u0013\u001a\u00020\u0014HÖ\u0001J\u0018\u0010\u0015\u001a\u00020\u00162\u0006\u0010\u0002\u001a\u00020\u00032\u0006\u0010\u0017\u001a\u00020\rH\u0016R\u0018\u0010\u0005\u001a\u0004\u0018\u00010\u00068\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b\b\u0010\t¨\u0006\u0019"}, m28850d2 = {"Lth/co/dtac/android/dtacone/model/appOne/pre2post/response/OnePre2PostAuthorizationResponse;", "Landroid/os/Parcelable;", "parcel", "Landroid/os/Parcel;", "(Landroid/os/Parcel;)V", "onePre2PostAuthorizationResponseData", "Lth/co/dtac/android/dtacone/model/appOne/pre2post/response/OnePre2PostAuthorizationDataResponse;", "(Lth/co/dtac/android/dtacone/model/appOne/pre2post/response/OnePre2PostAuthorizationDataResponse;)V", "getOnePre2PostAuthorizationResponseData", "()Lth/co/dtac/android/dtacone/model/appOne/pre2post/response/OnePre2PostAuthorizationDataResponse;", "component1", "copy", "describeContents", "", "equals", "", "other", "", "hashCode", "toString", "", "writeToParcel", "", "flags", "CREATOR", "app_prodRelease"}, m28849k = 1, m28848mv = {1, 8, 0}, m28846xi = 48)
/* renamed from: th.co.dtac.android.dtacone.model.appOne.pre2post.response.OnePre2PostAuthorizationResponse */
/* loaded from: classes8.dex */
public final class OnePre2PostAuthorizationResponse implements Parcelable {
    @SerializedName("data")
    @Nullable
    private final OnePre2PostAuthorizationDataResponse onePre2PostAuthorizationResponseData;
    @NotNull
    public static final CREATOR CREATOR = new CREATOR(null);
    public static final int $stable = 8;

    @Metadata(m28851d1 = {"\u0000$\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0011\n\u0000\n\u0002\u0010\b\n\u0002\b\u0002\b\u0086\u0003\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001B\u0007\b\u0002¢\u0006\u0002\u0010\u0003J\u0010\u0010\u0004\u001a\u00020\u00022\u0006\u0010\u0005\u001a\u00020\u0006H\u0016J\u001d\u0010\u0007\u001a\n\u0012\u0006\u0012\u0004\u0018\u00010\u00020\b2\u0006\u0010\t\u001a\u00020\nH\u0016¢\u0006\u0002\u0010\u000b¨\u0006\f"}, m28850d2 = {"Lth/co/dtac/android/dtacone/model/appOne/pre2post/response/OnePre2PostAuthorizationResponse$CREATOR;", "Landroid/os/Parcelable$Creator;", "Lth/co/dtac/android/dtacone/model/appOne/pre2post/response/OnePre2PostAuthorizationResponse;", "()V", "createFromParcel", "parcel", "Landroid/os/Parcel;", "newArray", "", "size", "", "(I)[Lth/co/dtac/android/dtacone/model/appOne/pre2post/response/OnePre2PostAuthorizationResponse;", "app_prodRelease"}, m28849k = 1, m28848mv = {1, 8, 0}, m28846xi = 48)
    /* renamed from: th.co.dtac.android.dtacone.model.appOne.pre2post.response.OnePre2PostAuthorizationResponse$CREATOR */
    /* loaded from: classes8.dex */
    public static final class CREATOR implements Parcelable.Creator<OnePre2PostAuthorizationResponse> {
        public /* synthetic */ CREATOR(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        private CREATOR() {
        }

        @Override // android.os.Parcelable.Creator
        @NotNull
        public OnePre2PostAuthorizationResponse createFromParcel(@NotNull Parcel parcel) {
            Intrinsics.checkNotNullParameter(parcel, "parcel");
            return new OnePre2PostAuthorizationResponse(parcel);
        }

        @Override // android.os.Parcelable.Creator
        @NotNull
        public OnePre2PostAuthorizationResponse[] newArray(int i) {
            return new OnePre2PostAuthorizationResponse[i];
        }
    }

    public OnePre2PostAuthorizationResponse(@Nullable OnePre2PostAuthorizationDataResponse onePre2PostAuthorizationDataResponse) {
        this.onePre2PostAuthorizationResponseData = onePre2PostAuthorizationDataResponse;
    }

    public static /* synthetic */ OnePre2PostAuthorizationResponse copy$default(OnePre2PostAuthorizationResponse onePre2PostAuthorizationResponse, OnePre2PostAuthorizationDataResponse onePre2PostAuthorizationDataResponse, int i, Object obj) {
        if ((i & 1) != 0) {
            onePre2PostAuthorizationDataResponse = onePre2PostAuthorizationResponse.onePre2PostAuthorizationResponseData;
        }
        return onePre2PostAuthorizationResponse.copy(onePre2PostAuthorizationDataResponse);
    }

    @Nullable
    public final OnePre2PostAuthorizationDataResponse component1() {
        return this.onePre2PostAuthorizationResponseData;
    }

    @NotNull
    public final OnePre2PostAuthorizationResponse copy(@Nullable OnePre2PostAuthorizationDataResponse onePre2PostAuthorizationDataResponse) {
        return new OnePre2PostAuthorizationResponse(onePre2PostAuthorizationDataResponse);
    }

    @Override // android.os.Parcelable
    public int describeContents() {
        return 0;
    }

    public boolean equals(@Nullable Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof OnePre2PostAuthorizationResponse) && Intrinsics.areEqual(this.onePre2PostAuthorizationResponseData, ((OnePre2PostAuthorizationResponse) obj).onePre2PostAuthorizationResponseData);
    }

    @Nullable
    public final OnePre2PostAuthorizationDataResponse getOnePre2PostAuthorizationResponseData() {
        return this.onePre2PostAuthorizationResponseData;
    }

    public int hashCode() {
        OnePre2PostAuthorizationDataResponse onePre2PostAuthorizationDataResponse = this.onePre2PostAuthorizationResponseData;
        if (onePre2PostAuthorizationDataResponse == null) {
            return 0;
        }
        return onePre2PostAuthorizationDataResponse.hashCode();
    }

    @NotNull
    public String toString() {
        OnePre2PostAuthorizationDataResponse onePre2PostAuthorizationDataResponse = this.onePre2PostAuthorizationResponseData;
        return "OnePre2PostAuthorizationResponse(onePre2PostAuthorizationResponseData=" + onePre2PostAuthorizationDataResponse + ")";
    }

    @Override // android.os.Parcelable
    public void writeToParcel(@NotNull Parcel parcel, int i) {
        Intrinsics.checkNotNullParameter(parcel, "parcel");
        parcel.writeParcelable(this.onePre2PostAuthorizationResponseData, i);
    }

    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    public OnePre2PostAuthorizationResponse(@NotNull Parcel parcel) {
        this((OnePre2PostAuthorizationDataResponse) parcel.readParcelable(OnePre2PostAuthorizationDataResponse.class.getClassLoader()));
        Intrinsics.checkNotNullParameter(parcel, "parcel");
    }
}

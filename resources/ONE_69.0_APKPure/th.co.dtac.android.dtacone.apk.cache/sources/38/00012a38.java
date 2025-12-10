package th.p047co.dtac.android.dtacone.view.appOne.buyDol.model.request;

import android.os.Parcel;
import android.os.Parcelable;
import androidx.compose.runtime.internal.StabilityInferred;
import com.google.gson.annotations.SerializedName;
import com.tom_roush.pdfbox.pdmodel.common.PDPageLabelRange;
import kotlin.Metadata;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

@StabilityInferred(parameters = 0)
@Metadata(m29143d1 = {"\u00004\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u0002\n\u0002\b\n\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0007\b\u0087\b\u0018\u0000 \u001e2\u00020\u0001:\u0001\u001eB\u0011\u0012\b\u0010\u0003\u001a\u0004\u0018\u00010\u0002¢\u0006\u0004\b\u0004\u0010\u0005B\u0011\b\u0016\u0012\u0006\u0010\u0007\u001a\u00020\u0006¢\u0006\u0004\b\u0004\u0010\bJ\u001f\u0010\f\u001a\u00020\u000b2\u0006\u0010\u0007\u001a\u00020\u00062\u0006\u0010\n\u001a\u00020\tH\u0016¢\u0006\u0004\b\f\u0010\rJ\u000f\u0010\u000e\u001a\u00020\tH\u0016¢\u0006\u0004\b\u000e\u0010\u000fJ\u0012\u0010\u0010\u001a\u0004\u0018\u00010\u0002HÆ\u0003¢\u0006\u0004\b\u0010\u0010\u0011J\u001c\u0010\u0012\u001a\u00020\u00002\n\b\u0002\u0010\u0003\u001a\u0004\u0018\u00010\u0002HÆ\u0001¢\u0006\u0004\b\u0012\u0010\u0013J\u0010\u0010\u0014\u001a\u00020\u0002HÖ\u0001¢\u0006\u0004\b\u0014\u0010\u0011J\u0010\u0010\u0015\u001a\u00020\tHÖ\u0001¢\u0006\u0004\b\u0015\u0010\u000fJ\u001a\u0010\u0019\u001a\u00020\u00182\b\u0010\u0017\u001a\u0004\u0018\u00010\u0016HÖ\u0003¢\u0006\u0004\b\u0019\u0010\u001aR\u001c\u0010\u0003\u001a\u0004\u0018\u00010\u00028\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\u001b\u0010\u001c\u001a\u0004\b\u001d\u0010\u0011¨\u0006\u001f"}, m29142d2 = {"Lth/co/dtac/android/dtacone/view/appOne/buyDol/model/request/OneSaveBuyDolDirectAccountRequest;", "Landroid/os/Parcelable;", "", "bankCode", "<init>", "(Ljava/lang/String;)V", "Landroid/os/Parcel;", "parcel", "(Landroid/os/Parcel;)V", "", "flags", "", "writeToParcel", "(Landroid/os/Parcel;I)V", "describeContents", "()I", "component1", "()Ljava/lang/String;", "copy", "(Ljava/lang/String;)Lth/co/dtac/android/dtacone/view/appOne/buyDol/model/request/OneSaveBuyDolDirectAccountRequest;", "toString", "hashCode", "", "other", "", "equals", "(Ljava/lang/Object;)Z", PDPageLabelRange.STYLE_LETTERS_LOWER, "Ljava/lang/String;", "getBankCode", "CREATOR", "app_prodRelease"}, m29141k = 1, m29140mv = {1, 8, 0})
/* renamed from: th.co.dtac.android.dtacone.view.appOne.buyDol.model.request.OneSaveBuyDolDirectAccountRequest */
/* loaded from: classes10.dex */
public final class OneSaveBuyDolDirectAccountRequest implements Parcelable {
    public static final int $stable = 0;
    @NotNull
    public static final CREATOR CREATOR = new CREATOR(null);
    @SerializedName("bankCode")
    @Nullable

    /* renamed from: a */
    private final String f88563a;

    @Metadata(m29143d1 = {"\u0000$\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0011\n\u0000\n\u0002\u0010\b\n\u0002\b\u0002\b\u0086\u0003\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001B\u0007\b\u0002¢\u0006\u0002\u0010\u0003J\u0010\u0010\u0004\u001a\u00020\u00022\u0006\u0010\u0005\u001a\u00020\u0006H\u0016J\u001d\u0010\u0007\u001a\n\u0012\u0006\u0012\u0004\u0018\u00010\u00020\b2\u0006\u0010\t\u001a\u00020\nH\u0016¢\u0006\u0002\u0010\u000b¨\u0006\f"}, m29142d2 = {"Lth/co/dtac/android/dtacone/view/appOne/buyDol/model/request/OneSaveBuyDolDirectAccountRequest$CREATOR;", "Landroid/os/Parcelable$Creator;", "Lth/co/dtac/android/dtacone/view/appOne/buyDol/model/request/OneSaveBuyDolDirectAccountRequest;", "()V", "createFromParcel", "parcel", "Landroid/os/Parcel;", "newArray", "", "size", "", "(I)[Lth/co/dtac/android/dtacone/view/appOne/buyDol/model/request/OneSaveBuyDolDirectAccountRequest;", "app_prodRelease"}, m29141k = 1, m29140mv = {1, 8, 0}, m29138xi = 48)
    /* renamed from: th.co.dtac.android.dtacone.view.appOne.buyDol.model.request.OneSaveBuyDolDirectAccountRequest$CREATOR */
    /* loaded from: classes10.dex */
    public static final class CREATOR implements Parcelable.Creator<OneSaveBuyDolDirectAccountRequest> {
        public /* synthetic */ CREATOR(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        private CREATOR() {
        }

        @Override // android.os.Parcelable.Creator
        @NotNull
        public OneSaveBuyDolDirectAccountRequest createFromParcel(@NotNull Parcel parcel) {
            Intrinsics.checkNotNullParameter(parcel, "parcel");
            return new OneSaveBuyDolDirectAccountRequest(parcel);
        }

        @Override // android.os.Parcelable.Creator
        @NotNull
        public OneSaveBuyDolDirectAccountRequest[] newArray(int i) {
            return new OneSaveBuyDolDirectAccountRequest[i];
        }
    }

    public OneSaveBuyDolDirectAccountRequest(@Nullable String str) {
        this.f88563a = str;
    }

    public static /* synthetic */ OneSaveBuyDolDirectAccountRequest copy$default(OneSaveBuyDolDirectAccountRequest oneSaveBuyDolDirectAccountRequest, String str, int i, Object obj) {
        if ((i & 1) != 0) {
            str = oneSaveBuyDolDirectAccountRequest.f88563a;
        }
        return oneSaveBuyDolDirectAccountRequest.copy(str);
    }

    @Nullable
    public final String component1() {
        return this.f88563a;
    }

    @NotNull
    public final OneSaveBuyDolDirectAccountRequest copy(@Nullable String str) {
        return new OneSaveBuyDolDirectAccountRequest(str);
    }

    @Override // android.os.Parcelable
    public int describeContents() {
        return 0;
    }

    public boolean equals(@Nullable Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof OneSaveBuyDolDirectAccountRequest) && Intrinsics.areEqual(this.f88563a, ((OneSaveBuyDolDirectAccountRequest) obj).f88563a);
    }

    @Nullable
    public final String getBankCode() {
        return this.f88563a;
    }

    public int hashCode() {
        String str = this.f88563a;
        if (str == null) {
            return 0;
        }
        return str.hashCode();
    }

    @NotNull
    public String toString() {
        String str = this.f88563a;
        return "OneSaveBuyDolDirectAccountRequest(bankCode=" + str + ")";
    }

    @Override // android.os.Parcelable
    public void writeToParcel(@NotNull Parcel parcel, int i) {
        Intrinsics.checkNotNullParameter(parcel, "parcel");
        parcel.writeString(this.f88563a);
    }

    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    public OneSaveBuyDolDirectAccountRequest(@NotNull Parcel parcel) {
        this(parcel.readString());
        Intrinsics.checkNotNullParameter(parcel, "parcel");
    }
}
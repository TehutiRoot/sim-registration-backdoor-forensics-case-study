package th.p047co.dtac.android.dtacone.model.buy_dol.token;

import android.os.Parcel;
import android.os.Parcelable;
import androidx.compose.runtime.internal.StabilityInferred;
import kotlin.Metadata;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

@StabilityInferred(parameters = 0)
@Metadata(m29143d1 = {"\u0000(\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\b\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0003\b\u0007\u0018\u0000 \u00132\u00020\u0001:\u0001\u0013B\u000f\b\u0016\u0012\u0006\u0010\u0002\u001a\u00020\u0003¢\u0006\u0002\u0010\u0004B#\u0012\b\u0010\u0005\u001a\u0004\u0018\u00010\u0006\u0012\b\u0010\u0007\u001a\u0004\u0018\u00010\u0006\u0012\b\u0010\b\u001a\u0004\u0018\u00010\u0006¢\u0006\u0002\u0010\tJ\b\u0010\u000e\u001a\u00020\u000fH\u0016J\u0018\u0010\u0010\u001a\u00020\u00112\u0006\u0010\u0002\u001a\u00020\u00032\u0006\u0010\u0012\u001a\u00020\u000fH\u0016R\u0013\u0010\u0005\u001a\u0004\u0018\u00010\u0006¢\u0006\b\n\u0000\u001a\u0004\b\n\u0010\u000bR\u0013\u0010\u0007\u001a\u0004\u0018\u00010\u0006¢\u0006\b\n\u0000\u001a\u0004\b\f\u0010\u000bR\u0013\u0010\b\u001a\u0004\u0018\u00010\u0006¢\u0006\b\n\u0000\u001a\u0004\b\r\u0010\u000b¨\u0006\u0014"}, m29142d2 = {"Lth/co/dtac/android/dtacone/model/buy_dol/token/TokenGroup;", "Landroid/os/Parcelable;", "parcel", "Landroid/os/Parcel;", "(Landroid/os/Parcel;)V", "chargeToken", "Lth/co/dtac/android/dtacone/model/buy_dol/token/TokenResponse;", "feeToken", "saveCardToken", "(Lth/co/dtac/android/dtacone/model/buy_dol/token/TokenResponse;Lth/co/dtac/android/dtacone/model/buy_dol/token/TokenResponse;Lth/co/dtac/android/dtacone/model/buy_dol/token/TokenResponse;)V", "getChargeToken", "()Lth/co/dtac/android/dtacone/model/buy_dol/token/TokenResponse;", "getFeeToken", "getSaveCardToken", "describeContents", "", "writeToParcel", "", "flags", "CREATOR", "app_prodRelease"}, m29141k = 1, m29140mv = {1, 8, 0}, m29138xi = 48)
/* renamed from: th.co.dtac.android.dtacone.model.buy_dol.token.TokenGroup */
/* loaded from: classes8.dex */
public final class TokenGroup implements Parcelable {
    @Nullable
    private final TokenResponse chargeToken;
    @Nullable
    private final TokenResponse feeToken;
    @Nullable
    private final TokenResponse saveCardToken;
    @NotNull
    public static final CREATOR CREATOR = new CREATOR(null);
    public static final int $stable = 8;

    @Metadata(m29143d1 = {"\u0000$\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0011\n\u0000\n\u0002\u0010\b\n\u0002\b\u0002\b\u0086\u0003\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001B\u0007\b\u0002¢\u0006\u0002\u0010\u0003J\u0010\u0010\u0004\u001a\u00020\u00022\u0006\u0010\u0005\u001a\u00020\u0006H\u0016J\u001d\u0010\u0007\u001a\n\u0012\u0006\u0012\u0004\u0018\u00010\u00020\b2\u0006\u0010\t\u001a\u00020\nH\u0016¢\u0006\u0002\u0010\u000b¨\u0006\f"}, m29142d2 = {"Lth/co/dtac/android/dtacone/model/buy_dol/token/TokenGroup$CREATOR;", "Landroid/os/Parcelable$Creator;", "Lth/co/dtac/android/dtacone/model/buy_dol/token/TokenGroup;", "()V", "createFromParcel", "parcel", "Landroid/os/Parcel;", "newArray", "", "size", "", "(I)[Lth/co/dtac/android/dtacone/model/buy_dol/token/TokenGroup;", "app_prodRelease"}, m29141k = 1, m29140mv = {1, 8, 0}, m29138xi = 48)
    /* renamed from: th.co.dtac.android.dtacone.model.buy_dol.token.TokenGroup$CREATOR */
    /* loaded from: classes8.dex */
    public static final class CREATOR implements Parcelable.Creator<TokenGroup> {
        public /* synthetic */ CREATOR(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        private CREATOR() {
        }

        @Override // android.os.Parcelable.Creator
        @NotNull
        public TokenGroup createFromParcel(@NotNull Parcel parcel) {
            Intrinsics.checkNotNullParameter(parcel, "parcel");
            return new TokenGroup(parcel);
        }

        @Override // android.os.Parcelable.Creator
        @NotNull
        public TokenGroup[] newArray(int i) {
            return new TokenGroup[i];
        }
    }

    public TokenGroup(@Nullable TokenResponse tokenResponse, @Nullable TokenResponse tokenResponse2, @Nullable TokenResponse tokenResponse3) {
        this.chargeToken = tokenResponse;
        this.feeToken = tokenResponse2;
        this.saveCardToken = tokenResponse3;
    }

    @Override // android.os.Parcelable
    public int describeContents() {
        return 0;
    }

    @Nullable
    public final TokenResponse getChargeToken() {
        return this.chargeToken;
    }

    @Nullable
    public final TokenResponse getFeeToken() {
        return this.feeToken;
    }

    @Nullable
    public final TokenResponse getSaveCardToken() {
        return this.saveCardToken;
    }

    @Override // android.os.Parcelable
    public void writeToParcel(@NotNull Parcel parcel, int i) {
        Intrinsics.checkNotNullParameter(parcel, "parcel");
        parcel.writeParcelable(this.chargeToken, i);
        parcel.writeParcelable(this.feeToken, i);
        parcel.writeParcelable(this.saveCardToken, i);
    }

    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    public TokenGroup(@NotNull Parcel parcel) {
        this((TokenResponse) parcel.readParcelable(TokenResponse.class.getClassLoader()), (TokenResponse) parcel.readParcelable(TokenResponse.class.getClassLoader()), (TokenResponse) parcel.readParcelable(TokenResponse.class.getClassLoader()));
        Intrinsics.checkNotNullParameter(parcel, "parcel");
    }
}
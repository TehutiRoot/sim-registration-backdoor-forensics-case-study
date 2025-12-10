package th.p047co.dtac.android.dtacone.model.buy_dol.token;

import android.os.Parcel;
import android.os.Parcelable;
import androidx.compose.runtime.internal.StabilityInferred;
import com.google.gson.annotations.SerializedName;
import kotlin.Metadata;
import kotlin.jvm.JvmField;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

@StabilityInferred(parameters = 0)
@Metadata(m28851d1 = {"\u00000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\b\b\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0004\b\u0007\u0018\u0000 \u00172\u00020\u0001:\u0001\u0017B\u0007\b\u0016¢\u0006\u0002\u0010\u0002B\u000f\b\u0016\u0012\u0006\u0010\u0003\u001a\u00020\u0004¢\u0006\u0002\u0010\u0005B\u001b\u0012\b\u0010\u0006\u001a\u0004\u0018\u00010\u0007\u0012\n\b\u0002\u0010\b\u001a\u0004\u0018\u00010\t¢\u0006\u0002\u0010\nJ\b\u0010\u0011\u001a\u00020\u0012H\u0016J\u0018\u0010\u0013\u001a\u00020\u00142\u0006\u0010\u0015\u001a\u00020\u00042\u0006\u0010\u0016\u001a\u00020\u0012H\u0016R\u0018\u0010\b\u001a\u0004\u0018\u00010\t8\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u000b\u0010\fR \u0010\u0006\u001a\u0004\u0018\u00010\u00078\u0006@\u0006X\u0087\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\r\u0010\u000e\"\u0004\b\u000f\u0010\u0010¨\u0006\u0018"}, m28850d2 = {"Lth/co/dtac/android/dtacone/model/buy_dol/token/TokenResponse;", "Landroid/os/Parcelable;", "()V", "source", "Landroid/os/Parcel;", "(Landroid/os/Parcel;)V", "token", "", "cardToken", "Lth/co/dtac/android/dtacone/model/buy_dol/token/CardToken;", "(Ljava/lang/String;Lth/co/dtac/android/dtacone/model/buy_dol/token/CardToken;)V", "getCardToken", "()Lth/co/dtac/android/dtacone/model/buy_dol/token/CardToken;", "getToken", "()Ljava/lang/String;", "setToken", "(Ljava/lang/String;)V", "describeContents", "", "writeToParcel", "", "dest", "flags", "Companion", "app_prodRelease"}, m28849k = 1, m28848mv = {1, 8, 0}, m28846xi = 48)
/* renamed from: th.co.dtac.android.dtacone.model.buy_dol.token.TokenResponse */
/* loaded from: classes8.dex */
public final class TokenResponse implements Parcelable {
    @SerializedName("card")
    @Nullable
    private final CardToken cardToken;
    @SerializedName("id")
    @Nullable
    private String token;
    @NotNull
    public static final Companion Companion = new Companion(null);
    public static final int $stable = 8;
    @JvmField
    @NotNull
    public static final Parcelable.Creator<TokenResponse> CREATOR = new Parcelable.Creator<TokenResponse>() { // from class: th.co.dtac.android.dtacone.model.buy_dol.token.TokenResponse$Companion$CREATOR$1
        @Override // android.os.Parcelable.Creator
        @NotNull
        public TokenResponse createFromParcel(@NotNull Parcel source) {
            Intrinsics.checkNotNullParameter(source, "source");
            return new TokenResponse(source);
        }

        @Override // android.os.Parcelable.Creator
        @NotNull
        public TokenResponse[] newArray(int i) {
            return new TokenResponse[i];
        }
    };

    @Metadata(m28851d1 = {"\u0000\u0016\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0086\u0003\u0018\u00002\u00020\u0001B\u0007\b\u0002¢\u0006\u0002\u0010\u0002R\u0016\u0010\u0003\u001a\b\u0012\u0004\u0012\u00020\u00050\u00048\u0006X\u0087\u0004¢\u0006\u0002\n\u0000¨\u0006\u0006"}, m28850d2 = {"Lth/co/dtac/android/dtacone/model/buy_dol/token/TokenResponse$Companion;", "", "()V", "CREATOR", "Landroid/os/Parcelable$Creator;", "Lth/co/dtac/android/dtacone/model/buy_dol/token/TokenResponse;", "app_prodRelease"}, m28849k = 1, m28848mv = {1, 8, 0}, m28846xi = 48)
    /* renamed from: th.co.dtac.android.dtacone.model.buy_dol.token.TokenResponse$Companion */
    /* loaded from: classes8.dex */
    public static final class Companion {
        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        private Companion() {
        }
    }

    public TokenResponse(@Nullable String str, @Nullable CardToken cardToken) {
        this.token = str;
        this.cardToken = cardToken;
    }

    @Override // android.os.Parcelable
    public int describeContents() {
        return 0;
    }

    @Nullable
    public final CardToken getCardToken() {
        return this.cardToken;
    }

    @Nullable
    public final String getToken() {
        return this.token;
    }

    public final void setToken(@Nullable String str) {
        this.token = str;
    }

    @Override // android.os.Parcelable
    public void writeToParcel(@NotNull Parcel dest, int i) {
        Intrinsics.checkNotNullParameter(dest, "dest");
        dest.writeString(this.token);
        dest.writeParcelable(this.cardToken, 0);
    }

    public /* synthetic */ TokenResponse(String str, CardToken cardToken, int i, DefaultConstructorMarker defaultConstructorMarker) {
        this(str, (i & 2) != 0 ? null : cardToken);
    }

    public TokenResponse() {
        this("", null, 2, null);
    }

    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    public TokenResponse(@NotNull Parcel source) {
        this(source.readString(), (CardToken) source.readParcelable(CardToken.class.getClassLoader()));
        Intrinsics.checkNotNullParameter(source, "source");
    }
}

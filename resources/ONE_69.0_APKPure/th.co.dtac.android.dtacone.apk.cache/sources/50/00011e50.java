package th.p047co.dtac.android.dtacone.model.error;

import android.os.Parcel;
import android.os.Parcelable;
import androidx.autofill.HintConstants;
import androidx.compose.runtime.internal.StabilityInferred;
import com.google.gson.annotations.SerializedName;
import kotlin.Metadata;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

@StabilityInferred(parameters = 0)
@Metadata(m29143d1 = {"\u0000(\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0018\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0003\b\u0007\u0018\u0000 #2\u00020\u0001:\u0001#B\u000f\b\u0016\u0012\u0006\u0010\u0002\u001a\u00020\u0003¢\u0006\u0002\u0010\u0004B\u0017\b\u0016\u0012\u0006\u0010\u0005\u001a\u00020\u0006\u0012\u0006\u0010\u0007\u001a\u00020\u0006¢\u0006\u0002\u0010\bB\u0005¢\u0006\u0002\u0010\tJ\b\u0010\u001e\u001a\u00020\u001fH\u0016J\u0018\u0010 \u001a\u00020!2\u0006\u0010\u0002\u001a\u00020\u00032\u0006\u0010\"\u001a\u00020\u001fH\u0016R \u0010\n\u001a\u0004\u0018\u00010\u00068\u0006@\u0006X\u0087\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u000b\u0010\f\"\u0004\b\r\u0010\u000eR \u0010\u000f\u001a\u0004\u0018\u00010\u00068\u0006@\u0006X\u0087\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u0010\u0010\f\"\u0004\b\u0011\u0010\u000eR \u0010\u0012\u001a\u0004\u0018\u00010\u00068\u0006@\u0006X\u0087\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u0013\u0010\f\"\u0004\b\u0014\u0010\u000eR \u0010\u0015\u001a\u0004\u0018\u00010\u00068\u0006@\u0006X\u0087\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u0016\u0010\f\"\u0004\b\u0017\u0010\u000eR \u0010\u0018\u001a\u0004\u0018\u00010\u00068\u0006@\u0006X\u0087\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u0019\u0010\f\"\u0004\b\u001a\u0010\u000eR\u001c\u0010\u001b\u001a\u0004\u0018\u00010\u0006X\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u001c\u0010\f\"\u0004\b\u001d\u0010\u000e¨\u0006$"}, m29142d2 = {"Lth/co/dtac/android/dtacone/model/error/ErrorCollection;", "Landroid/os/Parcelable;", "parcel", "Landroid/os/Parcel;", "(Landroid/os/Parcel;)V", "code", "", "desc", "(Ljava/lang/String;Ljava/lang/String;)V", "()V", "codeType", "getCodeType", "()Ljava/lang/String;", "setCodeType", "(Ljava/lang/String;)V", "description", "getDescription", "setDescription", "responseDateTime", "getResponseDateTime", "setResponseDateTime", "statusCode", "getStatusCode", "setStatusCode", "systemMessage", "getSystemMessage", "setSystemMessage", HintConstants.AUTOFILL_HINT_USERNAME, "getUsername", "setUsername", "describeContents", "", "writeToParcel", "", "flags", "CREATOR", "app_prodRelease"}, m29141k = 1, m29140mv = {1, 8, 0}, m29138xi = 48)
/* renamed from: th.co.dtac.android.dtacone.model.error.ErrorCollection */
/* loaded from: classes8.dex */
public final class ErrorCollection implements Parcelable {
    @SerializedName("codeType")
    @Nullable
    private String codeType;
    @SerializedName("desc")
    @Nullable
    private String description;
    @SerializedName("responseDateTime")
    @Nullable
    private String responseDateTime;
    @SerializedName("code")
    @Nullable
    private String statusCode;
    @SerializedName("systemMessage")
    @Nullable
    private String systemMessage;
    @Nullable
    private String username;
    @NotNull
    public static final CREATOR CREATOR = new CREATOR(null);
    public static final int $stable = 8;

    @Metadata(m29143d1 = {"\u0000$\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0011\n\u0000\n\u0002\u0010\b\n\u0002\b\u0002\b\u0086\u0003\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001B\u0007\b\u0002¢\u0006\u0002\u0010\u0003J\u0010\u0010\u0004\u001a\u00020\u00022\u0006\u0010\u0005\u001a\u00020\u0006H\u0016J\u001d\u0010\u0007\u001a\n\u0012\u0006\u0012\u0004\u0018\u00010\u00020\b2\u0006\u0010\t\u001a\u00020\nH\u0016¢\u0006\u0002\u0010\u000b¨\u0006\f"}, m29142d2 = {"Lth/co/dtac/android/dtacone/model/error/ErrorCollection$CREATOR;", "Landroid/os/Parcelable$Creator;", "Lth/co/dtac/android/dtacone/model/error/ErrorCollection;", "()V", "createFromParcel", "parcel", "Landroid/os/Parcel;", "newArray", "", "size", "", "(I)[Lth/co/dtac/android/dtacone/model/error/ErrorCollection;", "app_prodRelease"}, m29141k = 1, m29140mv = {1, 8, 0}, m29138xi = 48)
    /* renamed from: th.co.dtac.android.dtacone.model.error.ErrorCollection$CREATOR */
    /* loaded from: classes8.dex */
    public static final class CREATOR implements Parcelable.Creator<ErrorCollection> {
        public /* synthetic */ CREATOR(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        private CREATOR() {
        }

        @Override // android.os.Parcelable.Creator
        @NotNull
        public ErrorCollection createFromParcel(@NotNull Parcel parcel) {
            Intrinsics.checkNotNullParameter(parcel, "parcel");
            return new ErrorCollection(parcel);
        }

        @Override // android.os.Parcelable.Creator
        @NotNull
        public ErrorCollection[] newArray(int i) {
            return new ErrorCollection[i];
        }
    }

    public ErrorCollection() {
    }

    @Override // android.os.Parcelable
    public int describeContents() {
        return 0;
    }

    @Nullable
    public final String getCodeType() {
        return this.codeType;
    }

    @Nullable
    public final String getDescription() {
        return this.description;
    }

    @Nullable
    public final String getResponseDateTime() {
        return this.responseDateTime;
    }

    @Nullable
    public final String getStatusCode() {
        return this.statusCode;
    }

    @Nullable
    public final String getSystemMessage() {
        return this.systemMessage;
    }

    @Nullable
    public final String getUsername() {
        return this.username;
    }

    public final void setCodeType(@Nullable String str) {
        this.codeType = str;
    }

    public final void setDescription(@Nullable String str) {
        this.description = str;
    }

    public final void setResponseDateTime(@Nullable String str) {
        this.responseDateTime = str;
    }

    public final void setStatusCode(@Nullable String str) {
        this.statusCode = str;
    }

    public final void setSystemMessage(@Nullable String str) {
        this.systemMessage = str;
    }

    public final void setUsername(@Nullable String str) {
        this.username = str;
    }

    @Override // android.os.Parcelable
    public void writeToParcel(@NotNull Parcel parcel, int i) {
        Intrinsics.checkNotNullParameter(parcel, "parcel");
        parcel.writeString(this.codeType);
        parcel.writeString(this.statusCode);
        parcel.writeString(this.description);
        parcel.writeString(this.responseDateTime);
        parcel.writeString(this.systemMessage);
        parcel.writeString(this.username);
    }

    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    public ErrorCollection(@NotNull Parcel parcel) {
        this();
        Intrinsics.checkNotNullParameter(parcel, "parcel");
        this.codeType = parcel.readString();
        this.statusCode = parcel.readString();
        this.description = parcel.readString();
        this.responseDateTime = parcel.readString();
        this.systemMessage = parcel.readString();
        this.username = parcel.readString();
    }

    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    public ErrorCollection(@NotNull String code, @NotNull String desc) {
        this();
        Intrinsics.checkNotNullParameter(code, "code");
        Intrinsics.checkNotNullParameter(desc, "desc");
        this.statusCode = code;
        this.description = desc;
    }
}
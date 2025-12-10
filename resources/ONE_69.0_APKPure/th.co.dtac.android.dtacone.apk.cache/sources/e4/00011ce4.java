package th.p047co.dtac.android.dtacone.model.buy_dol;

import android.os.Parcel;
import android.os.Parcelable;
import androidx.compose.runtime.internal.StabilityInferred;
import com.google.android.gms.common.internal.ImagesContract;
import com.google.firebase.analytics.FirebaseAnalytics;
import com.google.gson.annotations.SerializedName;
import kotlin.Metadata;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

@StabilityInferred(parameters = 0)
@Metadata(m29143d1 = {"\u0000>\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\r\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0010\u0002\n\u0002\b\u0004\b\u0087\b\u0018\u0000 \"2\u00020\u0001:\u0002\"#B\u000f\b\u0016\u0012\u0006\u0010\u0002\u001a\u00020\u0003¢\u0006\u0002\u0010\u0004B-\u0012\b\u0010\u0005\u001a\u0004\u0018\u00010\u0006\u0012\b\u0010\u0007\u001a\u0004\u0018\u00010\u0006\u0012\b\u0010\b\u001a\u0004\u0018\u00010\u0006\u0012\b\u0010\t\u001a\u0004\u0018\u00010\n¢\u0006\u0002\u0010\u000bJ\u000b\u0010\u0012\u001a\u0004\u0018\u00010\u0006HÆ\u0003J\u000b\u0010\u0013\u001a\u0004\u0018\u00010\u0006HÆ\u0003J\u000b\u0010\u0014\u001a\u0004\u0018\u00010\u0006HÆ\u0003J\u000b\u0010\u0015\u001a\u0004\u0018\u00010\nHÆ\u0003J9\u0010\u0016\u001a\u00020\u00002\n\b\u0002\u0010\u0005\u001a\u0004\u0018\u00010\u00062\n\b\u0002\u0010\u0007\u001a\u0004\u0018\u00010\u00062\n\b\u0002\u0010\b\u001a\u0004\u0018\u00010\u00062\n\b\u0002\u0010\t\u001a\u0004\u0018\u00010\nHÆ\u0001J\b\u0010\u0017\u001a\u00020\u0018H\u0016J\u0013\u0010\u0019\u001a\u00020\u001a2\b\u0010\u001b\u001a\u0004\u0018\u00010\u001cHÖ\u0003J\t\u0010\u001d\u001a\u00020\u0018HÖ\u0001J\t\u0010\u001e\u001a\u00020\u0006HÖ\u0001J\u0018\u0010\u001f\u001a\u00020 2\u0006\u0010\u0002\u001a\u00020\u00032\u0006\u0010!\u001a\u00020\u0018H\u0016R\u0018\u0010\b\u001a\u0004\u0018\u00010\u00068\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b\f\u0010\rR\u0018\u0010\t\u001a\u0004\u0018\u00010\n8\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u000e\u0010\u000fR\u0018\u0010\u0007\u001a\u0004\u0018\u00010\u00068\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u0010\u0010\rR\u0018\u0010\u0005\u001a\u0004\u0018\u00010\u00068\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u0011\u0010\r¨\u0006$"}, m29142d2 = {"Lth/co/dtac/android/dtacone/model/buy_dol/ResponseSaveBuyDolDirectAccount;", "Landroid/os/Parcelable;", "parcel", "Landroid/os/Parcel;", "(Landroid/os/Parcel;)V", ImagesContract.URL, "", FirebaseAnalytics.Param.METHOD, "bankCode", "body", "Lth/co/dtac/android/dtacone/model/buy_dol/ResponseSaveBuyDolDirectAccount$PostParams;", "(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Lth/co/dtac/android/dtacone/model/buy_dol/ResponseSaveBuyDolDirectAccount$PostParams;)V", "getBankCode", "()Ljava/lang/String;", "getBody", "()Lth/co/dtac/android/dtacone/model/buy_dol/ResponseSaveBuyDolDirectAccount$PostParams;", "getMethod", "getUrl", "component1", "component2", "component3", "component4", "copy", "describeContents", "", "equals", "", "other", "", "hashCode", "toString", "writeToParcel", "", "flags", "CREATOR", "PostParams", "app_prodRelease"}, m29141k = 1, m29140mv = {1, 8, 0}, m29138xi = 48)
/* renamed from: th.co.dtac.android.dtacone.model.buy_dol.ResponseSaveBuyDolDirectAccount */
/* loaded from: classes8.dex */
public final class ResponseSaveBuyDolDirectAccount implements Parcelable {
    public static final int $stable = 0;
    @NotNull
    public static final CREATOR CREATOR = new CREATOR(null);
    @SerializedName("bankCode")
    @Nullable
    private final String bankCode;
    @SerializedName("body")
    @Nullable
    private final PostParams body;
    @SerializedName(FirebaseAnalytics.Param.METHOD)
    @Nullable
    private final String method;
    @SerializedName(ImagesContract.URL)
    @Nullable
    private final String url;

    @Metadata(m29143d1 = {"\u0000$\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0011\n\u0000\n\u0002\u0010\b\n\u0002\b\u0002\b\u0086\u0003\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001B\u0007\b\u0002¢\u0006\u0002\u0010\u0003J\u0010\u0010\u0004\u001a\u00020\u00022\u0006\u0010\u0005\u001a\u00020\u0006H\u0016J\u001d\u0010\u0007\u001a\n\u0012\u0006\u0012\u0004\u0018\u00010\u00020\b2\u0006\u0010\t\u001a\u00020\nH\u0016¢\u0006\u0002\u0010\u000b¨\u0006\f"}, m29142d2 = {"Lth/co/dtac/android/dtacone/model/buy_dol/ResponseSaveBuyDolDirectAccount$CREATOR;", "Landroid/os/Parcelable$Creator;", "Lth/co/dtac/android/dtacone/model/buy_dol/ResponseSaveBuyDolDirectAccount;", "()V", "createFromParcel", "parcel", "Landroid/os/Parcel;", "newArray", "", "size", "", "(I)[Lth/co/dtac/android/dtacone/model/buy_dol/ResponseSaveBuyDolDirectAccount;", "app_prodRelease"}, m29141k = 1, m29140mv = {1, 8, 0}, m29138xi = 48)
    /* renamed from: th.co.dtac.android.dtacone.model.buy_dol.ResponseSaveBuyDolDirectAccount$CREATOR */
    /* loaded from: classes8.dex */
    public static final class CREATOR implements Parcelable.Creator<ResponseSaveBuyDolDirectAccount> {
        public /* synthetic */ CREATOR(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        private CREATOR() {
        }

        @Override // android.os.Parcelable.Creator
        @NotNull
        public ResponseSaveBuyDolDirectAccount createFromParcel(@NotNull Parcel parcel) {
            Intrinsics.checkNotNullParameter(parcel, "parcel");
            return new ResponseSaveBuyDolDirectAccount(parcel);
        }

        @Override // android.os.Parcelable.Creator
        @NotNull
        public ResponseSaveBuyDolDirectAccount[] newArray(int i) {
            return new ResponseSaveBuyDolDirectAccount[i];
        }
    }

    public ResponseSaveBuyDolDirectAccount(@Nullable String str, @Nullable String str2, @Nullable String str3, @Nullable PostParams postParams) {
        this.url = str;
        this.method = str2;
        this.bankCode = str3;
        this.body = postParams;
    }

    public static /* synthetic */ ResponseSaveBuyDolDirectAccount copy$default(ResponseSaveBuyDolDirectAccount responseSaveBuyDolDirectAccount, String str, String str2, String str3, PostParams postParams, int i, Object obj) {
        if ((i & 1) != 0) {
            str = responseSaveBuyDolDirectAccount.url;
        }
        if ((i & 2) != 0) {
            str2 = responseSaveBuyDolDirectAccount.method;
        }
        if ((i & 4) != 0) {
            str3 = responseSaveBuyDolDirectAccount.bankCode;
        }
        if ((i & 8) != 0) {
            postParams = responseSaveBuyDolDirectAccount.body;
        }
        return responseSaveBuyDolDirectAccount.copy(str, str2, str3, postParams);
    }

    @Nullable
    public final String component1() {
        return this.url;
    }

    @Nullable
    public final String component2() {
        return this.method;
    }

    @Nullable
    public final String component3() {
        return this.bankCode;
    }

    @Nullable
    public final PostParams component4() {
        return this.body;
    }

    @NotNull
    public final ResponseSaveBuyDolDirectAccount copy(@Nullable String str, @Nullable String str2, @Nullable String str3, @Nullable PostParams postParams) {
        return new ResponseSaveBuyDolDirectAccount(str, str2, str3, postParams);
    }

    @Override // android.os.Parcelable
    public int describeContents() {
        return 0;
    }

    public boolean equals(@Nullable Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj instanceof ResponseSaveBuyDolDirectAccount) {
            ResponseSaveBuyDolDirectAccount responseSaveBuyDolDirectAccount = (ResponseSaveBuyDolDirectAccount) obj;
            return Intrinsics.areEqual(this.url, responseSaveBuyDolDirectAccount.url) && Intrinsics.areEqual(this.method, responseSaveBuyDolDirectAccount.method) && Intrinsics.areEqual(this.bankCode, responseSaveBuyDolDirectAccount.bankCode) && Intrinsics.areEqual(this.body, responseSaveBuyDolDirectAccount.body);
        }
        return false;
    }

    @Nullable
    public final String getBankCode() {
        return this.bankCode;
    }

    @Nullable
    public final PostParams getBody() {
        return this.body;
    }

    @Nullable
    public final String getMethod() {
        return this.method;
    }

    @Nullable
    public final String getUrl() {
        return this.url;
    }

    public int hashCode() {
        String str = this.url;
        int hashCode = (str == null ? 0 : str.hashCode()) * 31;
        String str2 = this.method;
        int hashCode2 = (hashCode + (str2 == null ? 0 : str2.hashCode())) * 31;
        String str3 = this.bankCode;
        int hashCode3 = (hashCode2 + (str3 == null ? 0 : str3.hashCode())) * 31;
        PostParams postParams = this.body;
        return hashCode3 + (postParams != null ? postParams.hashCode() : 0);
    }

    @NotNull
    public String toString() {
        String str = this.url;
        String str2 = this.method;
        String str3 = this.bankCode;
        PostParams postParams = this.body;
        return "ResponseSaveBuyDolDirectAccount(url=" + str + ", method=" + str2 + ", bankCode=" + str3 + ", body=" + postParams + ")";
    }

    @Override // android.os.Parcelable
    public void writeToParcel(@NotNull Parcel parcel, int i) {
        Intrinsics.checkNotNullParameter(parcel, "parcel");
        parcel.writeString(this.url);
        parcel.writeString(this.method);
        parcel.writeString(this.bankCode);
        parcel.writeParcelable(this.body, i);
    }

    @StabilityInferred(parameters = 0)
    @Metadata(m29143d1 = {"\u00006\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u000f\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0010\u0002\n\u0002\b\u0003\b\u0087\b\u0018\u0000  2\u00020\u0001:\u0001 B\u000f\b\u0016\u0012\u0006\u0010\u0002\u001a\u00020\u0003¢\u0006\u0002\u0010\u0004B-\u0012\b\u0010\u0005\u001a\u0004\u0018\u00010\u0006\u0012\b\u0010\u0007\u001a\u0004\u0018\u00010\u0006\u0012\b\u0010\b\u001a\u0004\u0018\u00010\u0006\u0012\b\u0010\t\u001a\u0004\u0018\u00010\u0006¢\u0006\u0002\u0010\nJ\u000b\u0010\u0010\u001a\u0004\u0018\u00010\u0006HÆ\u0003J\u000b\u0010\u0011\u001a\u0004\u0018\u00010\u0006HÆ\u0003J\u000b\u0010\u0012\u001a\u0004\u0018\u00010\u0006HÆ\u0003J\u000b\u0010\u0013\u001a\u0004\u0018\u00010\u0006HÆ\u0003J9\u0010\u0014\u001a\u00020\u00002\n\b\u0002\u0010\u0005\u001a\u0004\u0018\u00010\u00062\n\b\u0002\u0010\u0007\u001a\u0004\u0018\u00010\u00062\n\b\u0002\u0010\b\u001a\u0004\u0018\u00010\u00062\n\b\u0002\u0010\t\u001a\u0004\u0018\u00010\u0006HÆ\u0001J\b\u0010\u0015\u001a\u00020\u0016H\u0016J\u0013\u0010\u0017\u001a\u00020\u00182\b\u0010\u0019\u001a\u0004\u0018\u00010\u001aHÖ\u0003J\t\u0010\u001b\u001a\u00020\u0016HÖ\u0001J\t\u0010\u001c\u001a\u00020\u0006HÖ\u0001J\u0018\u0010\u001d\u001a\u00020\u001e2\u0006\u0010\u0002\u001a\u00020\u00032\u0006\u0010\u001f\u001a\u00020\u0016H\u0016R\u0018\u0010\t\u001a\u0004\u0018\u00010\u00068\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u000b\u0010\fR\u0018\u0010\b\u001a\u0004\u0018\u00010\u00068\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b\r\u0010\fR\u0018\u0010\u0005\u001a\u0004\u0018\u00010\u00068\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u000e\u0010\fR\u0018\u0010\u0007\u001a\u0004\u0018\u00010\u00068\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u000f\u0010\f¨\u0006!"}, m29142d2 = {"Lth/co/dtac/android/dtacone/model/buy_dol/ResponseSaveBuyDolDirectAccount$PostParams;", "Landroid/os/Parcelable;", "parcel", "Landroid/os/Parcel;", "(Landroid/os/Parcel;)V", "profileId", "", "terminalId", "enctext", "backURL", "(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)V", "getBackURL", "()Ljava/lang/String;", "getEnctext", "getProfileId", "getTerminalId", "component1", "component2", "component3", "component4", "copy", "describeContents", "", "equals", "", "other", "", "hashCode", "toString", "writeToParcel", "", "flags", "CREATOR", "app_prodRelease"}, m29141k = 1, m29140mv = {1, 8, 0}, m29138xi = 48)
    /* renamed from: th.co.dtac.android.dtacone.model.buy_dol.ResponseSaveBuyDolDirectAccount$PostParams */
    /* loaded from: classes8.dex */
    public static final class PostParams implements Parcelable {
        public static final int $stable = 0;
        @NotNull
        public static final CREATOR CREATOR = new CREATOR(null);
        @SerializedName("backURL")
        @Nullable
        private final String backURL;
        @SerializedName("enctext")
        @Nullable
        private final String enctext;
        @SerializedName("profile_id")
        @Nullable
        private final String profileId;
        @SerializedName("terminal_id")
        @Nullable
        private final String terminalId;

        @Metadata(m29143d1 = {"\u0000$\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0011\n\u0000\n\u0002\u0010\b\n\u0002\b\u0002\b\u0086\u0003\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001B\u0007\b\u0002¢\u0006\u0002\u0010\u0003J\u0010\u0010\u0004\u001a\u00020\u00022\u0006\u0010\u0005\u001a\u00020\u0006H\u0016J\u001d\u0010\u0007\u001a\n\u0012\u0006\u0012\u0004\u0018\u00010\u00020\b2\u0006\u0010\t\u001a\u00020\nH\u0016¢\u0006\u0002\u0010\u000b¨\u0006\f"}, m29142d2 = {"Lth/co/dtac/android/dtacone/model/buy_dol/ResponseSaveBuyDolDirectAccount$PostParams$CREATOR;", "Landroid/os/Parcelable$Creator;", "Lth/co/dtac/android/dtacone/model/buy_dol/ResponseSaveBuyDolDirectAccount$PostParams;", "()V", "createFromParcel", "parcel", "Landroid/os/Parcel;", "newArray", "", "size", "", "(I)[Lth/co/dtac/android/dtacone/model/buy_dol/ResponseSaveBuyDolDirectAccount$PostParams;", "app_prodRelease"}, m29141k = 1, m29140mv = {1, 8, 0}, m29138xi = 48)
        /* renamed from: th.co.dtac.android.dtacone.model.buy_dol.ResponseSaveBuyDolDirectAccount$PostParams$CREATOR */
        /* loaded from: classes8.dex */
        public static final class CREATOR implements Parcelable.Creator<PostParams> {
            public /* synthetic */ CREATOR(DefaultConstructorMarker defaultConstructorMarker) {
                this();
            }

            private CREATOR() {
            }

            @Override // android.os.Parcelable.Creator
            @NotNull
            public PostParams createFromParcel(@NotNull Parcel parcel) {
                Intrinsics.checkNotNullParameter(parcel, "parcel");
                return new PostParams(parcel);
            }

            @Override // android.os.Parcelable.Creator
            @NotNull
            public PostParams[] newArray(int i) {
                return new PostParams[i];
            }
        }

        public PostParams(@Nullable String str, @Nullable String str2, @Nullable String str3, @Nullable String str4) {
            this.profileId = str;
            this.terminalId = str2;
            this.enctext = str3;
            this.backURL = str4;
        }

        public static /* synthetic */ PostParams copy$default(PostParams postParams, String str, String str2, String str3, String str4, int i, Object obj) {
            if ((i & 1) != 0) {
                str = postParams.profileId;
            }
            if ((i & 2) != 0) {
                str2 = postParams.terminalId;
            }
            if ((i & 4) != 0) {
                str3 = postParams.enctext;
            }
            if ((i & 8) != 0) {
                str4 = postParams.backURL;
            }
            return postParams.copy(str, str2, str3, str4);
        }

        @Nullable
        public final String component1() {
            return this.profileId;
        }

        @Nullable
        public final String component2() {
            return this.terminalId;
        }

        @Nullable
        public final String component3() {
            return this.enctext;
        }

        @Nullable
        public final String component4() {
            return this.backURL;
        }

        @NotNull
        public final PostParams copy(@Nullable String str, @Nullable String str2, @Nullable String str3, @Nullable String str4) {
            return new PostParams(str, str2, str3, str4);
        }

        @Override // android.os.Parcelable
        public int describeContents() {
            return 0;
        }

        public boolean equals(@Nullable Object obj) {
            if (this == obj) {
                return true;
            }
            if (obj instanceof PostParams) {
                PostParams postParams = (PostParams) obj;
                return Intrinsics.areEqual(this.profileId, postParams.profileId) && Intrinsics.areEqual(this.terminalId, postParams.terminalId) && Intrinsics.areEqual(this.enctext, postParams.enctext) && Intrinsics.areEqual(this.backURL, postParams.backURL);
            }
            return false;
        }

        @Nullable
        public final String getBackURL() {
            return this.backURL;
        }

        @Nullable
        public final String getEnctext() {
            return this.enctext;
        }

        @Nullable
        public final String getProfileId() {
            return this.profileId;
        }

        @Nullable
        public final String getTerminalId() {
            return this.terminalId;
        }

        public int hashCode() {
            String str = this.profileId;
            int hashCode = (str == null ? 0 : str.hashCode()) * 31;
            String str2 = this.terminalId;
            int hashCode2 = (hashCode + (str2 == null ? 0 : str2.hashCode())) * 31;
            String str3 = this.enctext;
            int hashCode3 = (hashCode2 + (str3 == null ? 0 : str3.hashCode())) * 31;
            String str4 = this.backURL;
            return hashCode3 + (str4 != null ? str4.hashCode() : 0);
        }

        @NotNull
        public String toString() {
            String str = this.profileId;
            String str2 = this.terminalId;
            String str3 = this.enctext;
            String str4 = this.backURL;
            return "PostParams(profileId=" + str + ", terminalId=" + str2 + ", enctext=" + str3 + ", backURL=" + str4 + ")";
        }

        @Override // android.os.Parcelable
        public void writeToParcel(@NotNull Parcel parcel, int i) {
            Intrinsics.checkNotNullParameter(parcel, "parcel");
            parcel.writeString(this.profileId);
            parcel.writeString(this.terminalId);
            parcel.writeString(this.enctext);
            parcel.writeString(this.backURL);
        }

        /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
        public PostParams(@NotNull Parcel parcel) {
            this(parcel.readString(), parcel.readString(), parcel.readString(), parcel.readString());
            Intrinsics.checkNotNullParameter(parcel, "parcel");
        }
    }

    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    public ResponseSaveBuyDolDirectAccount(@NotNull Parcel parcel) {
        this(parcel.readString(), parcel.readString(), parcel.readString(), (PostParams) parcel.readParcelable(PostParams.class.getClassLoader()));
        Intrinsics.checkNotNullParameter(parcel, "parcel");
    }
}
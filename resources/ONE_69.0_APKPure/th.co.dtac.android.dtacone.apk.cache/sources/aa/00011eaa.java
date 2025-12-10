package th.p047co.dtac.android.dtacone.model.mixpanel.postpaid;

import android.os.Parcel;
import android.os.Parcelable;
import androidx.compose.runtime.internal.StabilityInferred;
import com.google.firebase.remoteconfig.RemoteConfigConstants;
import kotlin.Metadata;
import kotlin.jvm.JvmField;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

@StabilityInferred(parameters = 0)
@Metadata(m29143d1 = {"\u0000(\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0015\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0004\b\u0007\u0018\u0000 !2\u00020\u0001:\u0001!B\u000f\b\u0016\u0012\u0006\u0010\u0002\u001a\u00020\u0003¢\u0006\u0002\u0010\u0004BM\u0012\n\b\u0002\u0010\u0005\u001a\u0004\u0018\u00010\u0006\u0012\n\b\u0002\u0010\u0007\u001a\u0004\u0018\u00010\u0006\u0012\n\b\u0002\u0010\b\u001a\u0004\u0018\u00010\u0006\u0012\n\b\u0002\u0010\t\u001a\u0004\u0018\u00010\u0006\u0012\n\b\u0002\u0010\n\u001a\u0004\u0018\u00010\u0006\u0012\n\b\u0002\u0010\u000b\u001a\u0004\u0018\u00010\u0006¢\u0006\u0002\u0010\fJ\b\u0010\u001b\u001a\u00020\u001cH\u0016J\u0018\u0010\u001d\u001a\u00020\u001e2\u0006\u0010\u001f\u001a\u00020\u00032\u0006\u0010 \u001a\u00020\u001cH\u0016R\u001c\u0010\b\u001a\u0004\u0018\u00010\u0006X\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\r\u0010\u000e\"\u0004\b\u000f\u0010\u0010R\u001c\u0010\u0007\u001a\u0004\u0018\u00010\u0006X\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u0011\u0010\u000e\"\u0004\b\u0012\u0010\u0010R\u001c\u0010\u0005\u001a\u0004\u0018\u00010\u0006X\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u0013\u0010\u000e\"\u0004\b\u0014\u0010\u0010R\u001c\u0010\n\u001a\u0004\u0018\u00010\u0006X\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u0015\u0010\u000e\"\u0004\b\u0016\u0010\u0010R\u001c\u0010\u000b\u001a\u0004\u0018\u00010\u0006X\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u0017\u0010\u000e\"\u0004\b\u0018\u0010\u0010R\u001c\u0010\t\u001a\u0004\u0018\u00010\u0006X\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u0019\u0010\u000e\"\u0004\b\u001a\u0010\u0010¨\u0006\""}, m29142d2 = {"Lth/co/dtac/android/dtacone/model/mixpanel/postpaid/PostpaidMixpanelData;", "Landroid/os/Parcelable;", "source", "Landroid/os/Parcel;", "(Landroid/os/Parcel;)V", "numberType", "", "idCaptureType", "faceRecognitionState", "portfolio", RemoteConfigConstants.RequestFieldKey.PACKAGE_NAME, "packagePrice", "(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)V", "getFaceRecognitionState", "()Ljava/lang/String;", "setFaceRecognitionState", "(Ljava/lang/String;)V", "getIdCaptureType", "setIdCaptureType", "getNumberType", "setNumberType", "getPackageName", "setPackageName", "getPackagePrice", "setPackagePrice", "getPortfolio", "setPortfolio", "describeContents", "", "writeToParcel", "", "dest", "flags", "Companion", "app_prodRelease"}, m29141k = 1, m29140mv = {1, 8, 0}, m29138xi = 48)
/* renamed from: th.co.dtac.android.dtacone.model.mixpanel.postpaid.PostpaidMixpanelData */
/* loaded from: classes8.dex */
public final class PostpaidMixpanelData implements Parcelable {
    @Nullable
    private String faceRecognitionState;
    @Nullable
    private String idCaptureType;
    @Nullable
    private String numberType;
    @Nullable
    private String packageName;
    @Nullable
    private String packagePrice;
    @Nullable
    private String portfolio;
    @NotNull
    public static final Companion Companion = new Companion(null);
    public static final int $stable = 8;
    @JvmField
    @NotNull
    public static final Parcelable.Creator<PostpaidMixpanelData> CREATOR = new Parcelable.Creator<PostpaidMixpanelData>() { // from class: th.co.dtac.android.dtacone.model.mixpanel.postpaid.PostpaidMixpanelData$Companion$CREATOR$1
        @Override // android.os.Parcelable.Creator
        @NotNull
        public PostpaidMixpanelData createFromParcel(@NotNull Parcel source) {
            Intrinsics.checkNotNullParameter(source, "source");
            return new PostpaidMixpanelData(source);
        }

        @Override // android.os.Parcelable.Creator
        @NotNull
        public PostpaidMixpanelData[] newArray(int i) {
            return new PostpaidMixpanelData[i];
        }
    };

    @Metadata(m29143d1 = {"\u0000\u0016\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0086\u0003\u0018\u00002\u00020\u0001B\u0007\b\u0002¢\u0006\u0002\u0010\u0002R\u0016\u0010\u0003\u001a\b\u0012\u0004\u0012\u00020\u00050\u00048\u0006X\u0087\u0004¢\u0006\u0002\n\u0000¨\u0006\u0006"}, m29142d2 = {"Lth/co/dtac/android/dtacone/model/mixpanel/postpaid/PostpaidMixpanelData$Companion;", "", "()V", "CREATOR", "Landroid/os/Parcelable$Creator;", "Lth/co/dtac/android/dtacone/model/mixpanel/postpaid/PostpaidMixpanelData;", "app_prodRelease"}, m29141k = 1, m29140mv = {1, 8, 0}, m29138xi = 48)
    /* renamed from: th.co.dtac.android.dtacone.model.mixpanel.postpaid.PostpaidMixpanelData$Companion */
    /* loaded from: classes8.dex */
    public static final class Companion {
        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        private Companion() {
        }
    }

    public PostpaidMixpanelData() {
        this(null, null, null, null, null, null, 63, null);
    }

    @Override // android.os.Parcelable
    public int describeContents() {
        return 0;
    }

    @Nullable
    public final String getFaceRecognitionState() {
        return this.faceRecognitionState;
    }

    @Nullable
    public final String getIdCaptureType() {
        return this.idCaptureType;
    }

    @Nullable
    public final String getNumberType() {
        return this.numberType;
    }

    @Nullable
    public final String getPackageName() {
        return this.packageName;
    }

    @Nullable
    public final String getPackagePrice() {
        return this.packagePrice;
    }

    @Nullable
    public final String getPortfolio() {
        return this.portfolio;
    }

    public final void setFaceRecognitionState(@Nullable String str) {
        this.faceRecognitionState = str;
    }

    public final void setIdCaptureType(@Nullable String str) {
        this.idCaptureType = str;
    }

    public final void setNumberType(@Nullable String str) {
        this.numberType = str;
    }

    public final void setPackageName(@Nullable String str) {
        this.packageName = str;
    }

    public final void setPackagePrice(@Nullable String str) {
        this.packagePrice = str;
    }

    public final void setPortfolio(@Nullable String str) {
        this.portfolio = str;
    }

    @Override // android.os.Parcelable
    public void writeToParcel(@NotNull Parcel dest, int i) {
        Intrinsics.checkNotNullParameter(dest, "dest");
        dest.writeString(this.numberType);
        dest.writeString(this.idCaptureType);
        dest.writeString(this.faceRecognitionState);
        dest.writeString(this.portfolio);
        dest.writeString(this.packageName);
        dest.writeString(this.packagePrice);
    }

    public PostpaidMixpanelData(@Nullable String str, @Nullable String str2, @Nullable String str3, @Nullable String str4, @Nullable String str5, @Nullable String str6) {
        this.numberType = str;
        this.idCaptureType = str2;
        this.faceRecognitionState = str3;
        this.portfolio = str4;
        this.packageName = str5;
        this.packagePrice = str6;
    }

    public /* synthetic */ PostpaidMixpanelData(String str, String str2, String str3, String str4, String str5, String str6, int i, DefaultConstructorMarker defaultConstructorMarker) {
        this((i & 1) != 0 ? "" : str, (i & 2) != 0 ? "" : str2, (i & 4) != 0 ? "" : str3, (i & 8) != 0 ? "" : str4, (i & 16) != 0 ? "" : str5, (i & 32) != 0 ? "" : str6);
    }

    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    public PostpaidMixpanelData(@NotNull Parcel source) {
        this(source.readString(), source.readString(), source.readString(), source.readString(), source.readString(), source.readString());
        Intrinsics.checkNotNullParameter(source, "source");
    }
}
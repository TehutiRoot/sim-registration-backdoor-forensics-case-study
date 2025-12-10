package th.p047co.dtac.android.dtacone.model.prepaid;

import android.os.Parcel;
import android.os.Parcelable;
import androidx.compose.runtime.internal.StabilityInferred;
import com.google.gson.annotations.SerializedName;
import kotlin.Metadata;
import kotlin.jvm.JvmField;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import org.bouncycastle.i18n.TextBundle;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

@StabilityInferred(parameters = 0)
@Metadata(m29143d1 = {"\u0000*\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\b\n\u0002\u0010\u0002\n\u0002\b\u0004\b\u0007\u0018\u0000 \u00152\u00020\u0001:\u0001\u0015B\u000f\b\u0016\u0012\u0006\u0010\u0002\u001a\u00020\u0003¢\u0006\u0002\u0010\u0004B!\u0012\b\u0010\u0005\u001a\u0004\u0018\u00010\u0006\u0012\b\u0010\u0007\u001a\u0004\u0018\u00010\u0006\u0012\u0006\u0010\b\u001a\u00020\t¢\u0006\u0002\u0010\nJ\b\u0010\u0010\u001a\u00020\tH\u0016J\u0018\u0010\u0011\u001a\u00020\u00122\u0006\u0010\u0013\u001a\u00020\u00032\u0006\u0010\u0014\u001a\u00020\tH\u0016R\u0016\u0010\b\u001a\u00020\t8\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u000b\u0010\fR\u0018\u0010\u0007\u001a\u0004\u0018\u00010\u00068\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b\r\u0010\u000eR\u0018\u0010\u0005\u001a\u0004\u0018\u00010\u00068\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u000f\u0010\u000e¨\u0006\u0016"}, m29142d2 = {"Lth/co/dtac/android/dtacone/model/prepaid/NumberPowerResponse;", "Landroid/os/Parcelable;", "source", "Landroid/os/Parcel;", "(Landroid/os/Parcel;)V", "type", "", TextBundle.TEXT_ENTRY, "ratingStarLevel", "", "(Ljava/lang/String;Ljava/lang/String;I)V", "getRatingStarLevel", "()I", "getText", "()Ljava/lang/String;", "getType", "describeContents", "writeToParcel", "", "dest", "flags", "Companion", "app_prodRelease"}, m29141k = 1, m29140mv = {1, 8, 0}, m29138xi = 48)
/* renamed from: th.co.dtac.android.dtacone.model.prepaid.NumberPowerResponse */
/* loaded from: classes8.dex */
public final class NumberPowerResponse implements Parcelable {
    public static final int $stable = 0;
    @SerializedName("rating")
    private final int ratingStarLevel;
    @SerializedName(TextBundle.TEXT_ENTRY)
    @Nullable
    private final String text;
    @SerializedName("type")
    @Nullable
    private final String type;
    @NotNull
    public static final Companion Companion = new Companion(null);
    @JvmField
    @NotNull
    public static final Parcelable.Creator<NumberPowerResponse> CREATOR = new Parcelable.Creator<NumberPowerResponse>() { // from class: th.co.dtac.android.dtacone.model.prepaid.NumberPowerResponse$Companion$CREATOR$1
        @Override // android.os.Parcelable.Creator
        @NotNull
        public NumberPowerResponse createFromParcel(@NotNull Parcel source) {
            Intrinsics.checkNotNullParameter(source, "source");
            return new NumberPowerResponse(source);
        }

        @Override // android.os.Parcelable.Creator
        @NotNull
        public NumberPowerResponse[] newArray(int i) {
            return new NumberPowerResponse[i];
        }
    };

    @Metadata(m29143d1 = {"\u0000\u0016\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0086\u0003\u0018\u00002\u00020\u0001B\u0007\b\u0002¢\u0006\u0002\u0010\u0002R\u0016\u0010\u0003\u001a\b\u0012\u0004\u0012\u00020\u00050\u00048\u0006X\u0087\u0004¢\u0006\u0002\n\u0000¨\u0006\u0006"}, m29142d2 = {"Lth/co/dtac/android/dtacone/model/prepaid/NumberPowerResponse$Companion;", "", "()V", "CREATOR", "Landroid/os/Parcelable$Creator;", "Lth/co/dtac/android/dtacone/model/prepaid/NumberPowerResponse;", "app_prodRelease"}, m29141k = 1, m29140mv = {1, 8, 0}, m29138xi = 48)
    /* renamed from: th.co.dtac.android.dtacone.model.prepaid.NumberPowerResponse$Companion */
    /* loaded from: classes8.dex */
    public static final class Companion {
        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        private Companion() {
        }
    }

    public NumberPowerResponse(@Nullable String str, @Nullable String str2, int i) {
        this.type = str;
        this.text = str2;
        this.ratingStarLevel = i;
    }

    @Override // android.os.Parcelable
    public int describeContents() {
        return 0;
    }

    public final int getRatingStarLevel() {
        return this.ratingStarLevel;
    }

    @Nullable
    public final String getText() {
        return this.text;
    }

    @Nullable
    public final String getType() {
        return this.type;
    }

    @Override // android.os.Parcelable
    public void writeToParcel(@NotNull Parcel dest, int i) {
        Intrinsics.checkNotNullParameter(dest, "dest");
        dest.writeString(this.type);
        dest.writeString(this.text);
        dest.writeInt(this.ratingStarLevel);
    }

    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    public NumberPowerResponse(@NotNull Parcel source) {
        this(source.readString(), source.readString(), source.readInt());
        Intrinsics.checkNotNullParameter(source, "source");
    }
}
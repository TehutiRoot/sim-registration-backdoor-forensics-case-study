package th.p047co.dtac.android.dtacone.model.prepaid;

import android.os.Parcel;
import android.os.Parcelable;
import androidx.compose.runtime.internal.StabilityInferred;
import com.google.gson.annotations.SerializedName;
import java.util.List;
import kotlin.Metadata;
import kotlin.jvm.JvmField;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

@StabilityInferred(parameters = 0)
@Metadata(m29143d1 = {"\u00004\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\b\u000b\n\u0002\u0010\u0002\n\u0002\b\u0004\b\u0007\u0018\u0000 \u001b2\u00020\u0001:\u0001\u001bB\u000f\b\u0016\u0012\u0006\u0010\u0002\u001a\u00020\u0003¢\u0006\u0002\u0010\u0004B3\u0012\b\u0010\u0005\u001a\u0004\u0018\u00010\u0006\u0012\b\u0010\u0007\u001a\u0004\u0018\u00010\b\u0012\b\u0010\t\u001a\u0004\u0018\u00010\u0006\u0012\u000e\u0010\n\u001a\n\u0012\u0004\u0012\u00020\f\u0018\u00010\u000b¢\u0006\u0002\u0010\rJ\b\u0010\u0016\u001a\u00020\bH\u0016J\u0018\u0010\u0017\u001a\u00020\u00182\u0006\u0010\u0019\u001a\u00020\u00032\u0006\u0010\u001a\u001a\u00020\bH\u0016R\u0018\u0010\u0005\u001a\u0004\u0018\u00010\u00068\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u000e\u0010\u000fR\u001a\u0010\u0007\u001a\u0004\u0018\u00010\b8\u0006X\u0087\u0004¢\u0006\n\n\u0002\u0010\u0012\u001a\u0004\b\u0010\u0010\u0011R\u0018\u0010\t\u001a\u0004\u0018\u00010\u00068\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u0013\u0010\u000fR\u001e\u0010\n\u001a\n\u0012\u0004\u0012\u00020\f\u0018\u00010\u000b8\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u0014\u0010\u0015¨\u0006\u001c"}, m29142d2 = {"Lth/co/dtac/android/dtacone/model/prepaid/NumberSelectionResponse;", "Landroid/os/Parcelable;", "source", "Landroid/os/Parcel;", "(Landroid/os/Parcel;)V", "number", "", "numberSummation", "", "numberSummationStrength", "powerLevel", "", "Lth/co/dtac/android/dtacone/model/prepaid/NumberPowerResponse;", "(Ljava/lang/String;Ljava/lang/Integer;Ljava/lang/String;Ljava/util/List;)V", "getNumber", "()Ljava/lang/String;", "getNumberSummation", "()Ljava/lang/Integer;", "Ljava/lang/Integer;", "getNumberSummationStrength", "getPowerLevel", "()Ljava/util/List;", "describeContents", "writeToParcel", "", "dest", "flags", "Companion", "app_prodRelease"}, m29141k = 1, m29140mv = {1, 8, 0}, m29138xi = 48)
/* renamed from: th.co.dtac.android.dtacone.model.prepaid.NumberSelectionResponse */
/* loaded from: classes8.dex */
public final class NumberSelectionResponse implements Parcelable {
    @SerializedName("number")
    @Nullable
    private final String number;
    @SerializedName("numberSummation")
    @Nullable
    private final Integer numberSummation;
    @SerializedName("numberSummationStrength")
    @Nullable
    private final String numberSummationStrength;
    @SerializedName("numberSummationPowers")
    @Nullable
    private final List<NumberPowerResponse> powerLevel;
    @NotNull
    public static final Companion Companion = new Companion(null);
    public static final int $stable = 8;
    @JvmField
    @NotNull
    public static final Parcelable.Creator<NumberSelectionResponse> CREATOR = new Parcelable.Creator<NumberSelectionResponse>() { // from class: th.co.dtac.android.dtacone.model.prepaid.NumberSelectionResponse$Companion$CREATOR$1
        @Override // android.os.Parcelable.Creator
        @NotNull
        public NumberSelectionResponse createFromParcel(@NotNull Parcel source) {
            Intrinsics.checkNotNullParameter(source, "source");
            return new NumberSelectionResponse(source);
        }

        @Override // android.os.Parcelable.Creator
        @NotNull
        public NumberSelectionResponse[] newArray(int i) {
            return new NumberSelectionResponse[i];
        }
    };

    @Metadata(m29143d1 = {"\u0000\u0016\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0086\u0003\u0018\u00002\u00020\u0001B\u0007\b\u0002¢\u0006\u0002\u0010\u0002R\u0016\u0010\u0003\u001a\b\u0012\u0004\u0012\u00020\u00050\u00048\u0006X\u0087\u0004¢\u0006\u0002\n\u0000¨\u0006\u0006"}, m29142d2 = {"Lth/co/dtac/android/dtacone/model/prepaid/NumberSelectionResponse$Companion;", "", "()V", "CREATOR", "Landroid/os/Parcelable$Creator;", "Lth/co/dtac/android/dtacone/model/prepaid/NumberSelectionResponse;", "app_prodRelease"}, m29141k = 1, m29140mv = {1, 8, 0}, m29138xi = 48)
    /* renamed from: th.co.dtac.android.dtacone.model.prepaid.NumberSelectionResponse$Companion */
    /* loaded from: classes8.dex */
    public static final class Companion {
        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        private Companion() {
        }
    }

    public NumberSelectionResponse(@Nullable String str, @Nullable Integer num, @Nullable String str2, @Nullable List<NumberPowerResponse> list) {
        this.number = str;
        this.numberSummation = num;
        this.numberSummationStrength = str2;
        this.powerLevel = list;
    }

    @Override // android.os.Parcelable
    public int describeContents() {
        return 0;
    }

    @Nullable
    public final String getNumber() {
        return this.number;
    }

    @Nullable
    public final Integer getNumberSummation() {
        return this.numberSummation;
    }

    @Nullable
    public final String getNumberSummationStrength() {
        return this.numberSummationStrength;
    }

    @Nullable
    public final List<NumberPowerResponse> getPowerLevel() {
        return this.powerLevel;
    }

    @Override // android.os.Parcelable
    public void writeToParcel(@NotNull Parcel dest, int i) {
        Intrinsics.checkNotNullParameter(dest, "dest");
        dest.writeString(this.number);
        dest.writeValue(this.numberSummation);
        dest.writeString(this.numberSummationStrength);
        dest.writeTypedList(this.powerLevel);
    }

    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    public NumberSelectionResponse(@NotNull Parcel source) {
        this(source.readString(), (Integer) source.readValue(Integer.TYPE.getClassLoader()), source.readString(), source.createTypedArrayList(NumberPowerResponse.CREATOR));
        Intrinsics.checkNotNullParameter(source, "source");
    }
}
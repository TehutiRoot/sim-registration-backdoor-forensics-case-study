package th.p047co.dtac.android.dtacone.model.consent;

import android.os.Parcel;
import android.os.Parcelable;
import androidx.compose.runtime.internal.StabilityInferred;
import com.google.gson.annotations.SerializedName;
import java.util.ArrayList;
import java.util.List;
import kotlin.Metadata;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import kotlinx.android.parcel.Parcelize;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

@StabilityInferred(parameters = 0)
@Parcelize
@Metadata(m28851d1 = {"\u0000>\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\b\u0087\b\u0018\u00002\u00020\u0001B\u0017\u0012\u0010\b\u0002\u0010\u0002\u001a\n\u0012\u0004\u0012\u00020\u0004\u0018\u00010\u0003¢\u0006\u0002\u0010\u0005J\u0011\u0010\t\u001a\n\u0012\u0004\u0012\u00020\u0004\u0018\u00010\u0003HÆ\u0003J\u001b\u0010\n\u001a\u00020\u00002\u0010\b\u0002\u0010\u0002\u001a\n\u0012\u0004\u0012\u00020\u0004\u0018\u00010\u0003HÆ\u0001J\t\u0010\u000b\u001a\u00020\fHÖ\u0001J\u0013\u0010\r\u001a\u00020\u000e2\b\u0010\u000f\u001a\u0004\u0018\u00010\u0010HÖ\u0003J\t\u0010\u0011\u001a\u00020\fHÖ\u0001J\t\u0010\u0012\u001a\u00020\u0013HÖ\u0001J\u0019\u0010\u0014\u001a\u00020\u00152\u0006\u0010\u0016\u001a\u00020\u00172\u0006\u0010\u0018\u001a\u00020\fHÖ\u0001R&\u0010\u0002\u001a\n\u0012\u0004\u0012\u00020\u0004\u0018\u00010\u00038\u0006@\u0006X\u0087\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u0006\u0010\u0007\"\u0004\b\b\u0010\u0005¨\u0006\u0019"}, m28850d2 = {"Lth/co/dtac/android/dtacone/model/consent/ConsentNonTelcoResponse;", "Landroid/os/Parcelable;", "consent", "", "Lth/co/dtac/android/dtacone/model/consent/ConsentNonTelco;", "(Ljava/util/List;)V", "getConsent", "()Ljava/util/List;", "setConsent", "component1", "copy", "describeContents", "", "equals", "", "other", "", "hashCode", "toString", "", "writeToParcel", "", "parcel", "Landroid/os/Parcel;", "flags", "app_prodRelease"}, m28849k = 1, m28848mv = {1, 8, 0}, m28846xi = 48)
/* renamed from: th.co.dtac.android.dtacone.model.consent.ConsentNonTelcoResponse */
/* loaded from: classes8.dex */
public final class ConsentNonTelcoResponse implements Parcelable {
    public static final int $stable = 8;
    @NotNull
    public static final Parcelable.Creator<ConsentNonTelcoResponse> CREATOR = new Creator();
    @SerializedName("consent")
    @Nullable
    private List<ConsentNonTelco> consent;

    @Metadata(m28849k = 3, m28848mv = {1, 8, 0}, m28846xi = 48)
    /* renamed from: th.co.dtac.android.dtacone.model.consent.ConsentNonTelcoResponse$Creator */
    /* loaded from: classes8.dex */
    public static final class Creator implements Parcelable.Creator<ConsentNonTelcoResponse> {
        @Override // android.os.Parcelable.Creator
        @NotNull
        public final ConsentNonTelcoResponse createFromParcel(@NotNull Parcel parcel) {
            ArrayList arrayList;
            Intrinsics.checkNotNullParameter(parcel, "parcel");
            if (parcel.readInt() == 0) {
                arrayList = null;
            } else {
                int readInt = parcel.readInt();
                ArrayList arrayList2 = new ArrayList(readInt);
                for (int i = 0; i != readInt; i++) {
                    arrayList2.add(ConsentNonTelco.CREATOR.createFromParcel(parcel));
                }
                arrayList = arrayList2;
            }
            return new ConsentNonTelcoResponse(arrayList);
        }

        @Override // android.os.Parcelable.Creator
        @NotNull
        public final ConsentNonTelcoResponse[] newArray(int i) {
            return new ConsentNonTelcoResponse[i];
        }
    }

    public ConsentNonTelcoResponse() {
        this(null, 1, null);
    }

    /* JADX WARN: Multi-variable type inference failed */
    public static /* synthetic */ ConsentNonTelcoResponse copy$default(ConsentNonTelcoResponse consentNonTelcoResponse, List list, int i, Object obj) {
        if ((i & 1) != 0) {
            list = consentNonTelcoResponse.consent;
        }
        return consentNonTelcoResponse.copy(list);
    }

    @Nullable
    public final List<ConsentNonTelco> component1() {
        return this.consent;
    }

    @NotNull
    public final ConsentNonTelcoResponse copy(@Nullable List<ConsentNonTelco> list) {
        return new ConsentNonTelcoResponse(list);
    }

    @Override // android.os.Parcelable
    public int describeContents() {
        return 0;
    }

    public boolean equals(@Nullable Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof ConsentNonTelcoResponse) && Intrinsics.areEqual(this.consent, ((ConsentNonTelcoResponse) obj).consent);
    }

    @Nullable
    public final List<ConsentNonTelco> getConsent() {
        return this.consent;
    }

    public int hashCode() {
        List<ConsentNonTelco> list = this.consent;
        if (list == null) {
            return 0;
        }
        return list.hashCode();
    }

    public final void setConsent(@Nullable List<ConsentNonTelco> list) {
        this.consent = list;
    }

    @NotNull
    public String toString() {
        List<ConsentNonTelco> list = this.consent;
        return "ConsentNonTelcoResponse(consent=" + list + ")";
    }

    @Override // android.os.Parcelable
    public void writeToParcel(@NotNull Parcel out, int i) {
        Intrinsics.checkNotNullParameter(out, "out");
        List<ConsentNonTelco> list = this.consent;
        if (list == null) {
            out.writeInt(0);
            return;
        }
        out.writeInt(1);
        out.writeInt(list.size());
        for (ConsentNonTelco consentNonTelco : list) {
            consentNonTelco.writeToParcel(out, i);
        }
    }

    public ConsentNonTelcoResponse(@Nullable List<ConsentNonTelco> list) {
        this.consent = list;
    }

    public /* synthetic */ ConsentNonTelcoResponse(List list, int i, DefaultConstructorMarker defaultConstructorMarker) {
        this((i & 1) != 0 ? null : list);
    }
}

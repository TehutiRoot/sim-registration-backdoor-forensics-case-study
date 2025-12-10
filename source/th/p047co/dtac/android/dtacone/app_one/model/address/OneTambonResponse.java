package th.p047co.dtac.android.dtacone.app_one.model.address;

import android.os.Parcel;
import android.os.Parcelable;
import androidx.compose.runtime.internal.StabilityInferred;
import com.google.gson.annotations.SerializedName;
import com.tom_roush.pdfbox.contentstream.operator.OperatorName;
import com.tom_roush.pdfbox.pdmodel.common.PDPageLabelRange;
import kotlin.Metadata;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

@StabilityInferred(parameters = 0)
@Metadata(m28851d1 = {"\u00004\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u0002\n\u0002\b\f\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0002\b\n\b\u0087\b\u0018\u0000 $2\u00020\u0001:\u0001$B\u001f\u0012\n\b\u0002\u0010\u0003\u001a\u0004\u0018\u00010\u0002\u0012\n\b\u0002\u0010\u0005\u001a\u0004\u0018\u00010\u0004¢\u0006\u0004\b\u0006\u0010\u0007B\u0011\b\u0016\u0012\u0006\u0010\t\u001a\u00020\b¢\u0006\u0004\b\u0006\u0010\nJ\u001f\u0010\r\u001a\u00020\f2\u0006\u0010\t\u001a\u00020\b2\u0006\u0010\u000b\u001a\u00020\u0002H\u0016¢\u0006\u0004\b\r\u0010\u000eJ\u000f\u0010\u000f\u001a\u00020\u0002H\u0016¢\u0006\u0004\b\u000f\u0010\u0010J\u0012\u0010\u0011\u001a\u0004\u0018\u00010\u0002HÆ\u0003¢\u0006\u0004\b\u0011\u0010\u0012J\u0012\u0010\u0013\u001a\u0004\u0018\u00010\u0004HÆ\u0003¢\u0006\u0004\b\u0013\u0010\u0014J(\u0010\u0015\u001a\u00020\u00002\n\b\u0002\u0010\u0003\u001a\u0004\u0018\u00010\u00022\n\b\u0002\u0010\u0005\u001a\u0004\u0018\u00010\u0004HÆ\u0001¢\u0006\u0004\b\u0015\u0010\u0016J\u0010\u0010\u0017\u001a\u00020\u0004HÖ\u0001¢\u0006\u0004\b\u0017\u0010\u0014J\u0010\u0010\u0018\u001a\u00020\u0002HÖ\u0001¢\u0006\u0004\b\u0018\u0010\u0010J\u001a\u0010\u001c\u001a\u00020\u001b2\b\u0010\u001a\u001a\u0004\u0018\u00010\u0019HÖ\u0003¢\u0006\u0004\b\u001c\u0010\u001dR\u001c\u0010\u0003\u001a\u0004\u0018\u00010\u00028\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\u001e\u0010\u001f\u001a\u0004\b \u0010\u0012R\u001c\u0010\u0005\u001a\u0004\u0018\u00010\u00048\u0006X\u0087\u0004¢\u0006\f\n\u0004\b!\u0010\"\u001a\u0004\b#\u0010\u0014¨\u0006%"}, m28850d2 = {"Lth/co/dtac/android/dtacone/app_one/model/address/OneTambonResponse;", "Landroid/os/Parcelable;", "", "tambonId", "", "tambonName", "<init>", "(Ljava/lang/Integer;Ljava/lang/String;)V", "Landroid/os/Parcel;", "parcel", "(Landroid/os/Parcel;)V", "flags", "", "writeToParcel", "(Landroid/os/Parcel;I)V", "describeContents", "()I", "component1", "()Ljava/lang/Integer;", "component2", "()Ljava/lang/String;", "copy", "(Ljava/lang/Integer;Ljava/lang/String;)Lth/co/dtac/android/dtacone/app_one/model/address/OneTambonResponse;", "toString", "hashCode", "", "other", "", "equals", "(Ljava/lang/Object;)Z", PDPageLabelRange.STYLE_LETTERS_LOWER, "Ljava/lang/Integer;", "getTambonId", OperatorName.CLOSE_FILL_NON_ZERO_AND_STROKE, "Ljava/lang/String;", "getTambonName", "CREATOR", "app_prodRelease"}, m28849k = 1, m28848mv = {1, 8, 0})
/* renamed from: th.co.dtac.android.dtacone.app_one.model.address.OneTambonResponse */
/* loaded from: classes7.dex */
public final class OneTambonResponse implements Parcelable {
    public static final int $stable = 0;
    @NotNull
    public static final CREATOR CREATOR = new CREATOR(null);
    @SerializedName("tumbonId")
    @Nullable

    /* renamed from: a */
    private final Integer f81592a;
    @SerializedName("tumbonName")
    @Nullable

    /* renamed from: b */
    private final String f81593b;

    @Metadata(m28851d1 = {"\u0000$\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0011\n\u0000\n\u0002\u0010\b\n\u0002\b\u0002\b\u0086\u0003\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001B\u0007\b\u0002¢\u0006\u0002\u0010\u0003J\u0010\u0010\u0004\u001a\u00020\u00022\u0006\u0010\u0005\u001a\u00020\u0006H\u0016J\u001d\u0010\u0007\u001a\n\u0012\u0006\u0012\u0004\u0018\u00010\u00020\b2\u0006\u0010\t\u001a\u00020\nH\u0016¢\u0006\u0002\u0010\u000b¨\u0006\f"}, m28850d2 = {"Lth/co/dtac/android/dtacone/app_one/model/address/OneTambonResponse$CREATOR;", "Landroid/os/Parcelable$Creator;", "Lth/co/dtac/android/dtacone/app_one/model/address/OneTambonResponse;", "()V", "createFromParcel", "parcel", "Landroid/os/Parcel;", "newArray", "", "size", "", "(I)[Lth/co/dtac/android/dtacone/app_one/model/address/OneTambonResponse;", "app_prodRelease"}, m28849k = 1, m28848mv = {1, 8, 0}, m28846xi = 48)
    /* renamed from: th.co.dtac.android.dtacone.app_one.model.address.OneTambonResponse$CREATOR */
    /* loaded from: classes7.dex */
    public static final class CREATOR implements Parcelable.Creator<OneTambonResponse> {
        public /* synthetic */ CREATOR(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        private CREATOR() {
        }

        @Override // android.os.Parcelable.Creator
        @NotNull
        public OneTambonResponse createFromParcel(@NotNull Parcel parcel) {
            Intrinsics.checkNotNullParameter(parcel, "parcel");
            return new OneTambonResponse(parcel);
        }

        @Override // android.os.Parcelable.Creator
        @NotNull
        public OneTambonResponse[] newArray(int i) {
            return new OneTambonResponse[i];
        }
    }

    public OneTambonResponse() {
        this(null, null, 3, null);
    }

    public static /* synthetic */ OneTambonResponse copy$default(OneTambonResponse oneTambonResponse, Integer num, String str, int i, Object obj) {
        if ((i & 1) != 0) {
            num = oneTambonResponse.f81592a;
        }
        if ((i & 2) != 0) {
            str = oneTambonResponse.f81593b;
        }
        return oneTambonResponse.copy(num, str);
    }

    @Nullable
    public final Integer component1() {
        return this.f81592a;
    }

    @Nullable
    public final String component2() {
        return this.f81593b;
    }

    @NotNull
    public final OneTambonResponse copy(@Nullable Integer num, @Nullable String str) {
        return new OneTambonResponse(num, str);
    }

    @Override // android.os.Parcelable
    public int describeContents() {
        return 0;
    }

    public boolean equals(@Nullable Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj instanceof OneTambonResponse) {
            OneTambonResponse oneTambonResponse = (OneTambonResponse) obj;
            return Intrinsics.areEqual(this.f81592a, oneTambonResponse.f81592a) && Intrinsics.areEqual(this.f81593b, oneTambonResponse.f81593b);
        }
        return false;
    }

    @Nullable
    public final Integer getTambonId() {
        return this.f81592a;
    }

    @Nullable
    public final String getTambonName() {
        return this.f81593b;
    }

    public int hashCode() {
        Integer num = this.f81592a;
        int hashCode = (num == null ? 0 : num.hashCode()) * 31;
        String str = this.f81593b;
        return hashCode + (str != null ? str.hashCode() : 0);
    }

    @NotNull
    public String toString() {
        Integer num = this.f81592a;
        String str = this.f81593b;
        return "OneTambonResponse(tambonId=" + num + ", tambonName=" + str + ")";
    }

    @Override // android.os.Parcelable
    public void writeToParcel(@NotNull Parcel parcel, int i) {
        Intrinsics.checkNotNullParameter(parcel, "parcel");
        parcel.writeValue(this.f81592a);
        parcel.writeString(this.f81593b);
    }

    public OneTambonResponse(@Nullable Integer num, @Nullable String str) {
        this.f81592a = num;
        this.f81593b = str;
    }

    public /* synthetic */ OneTambonResponse(Integer num, String str, int i, DefaultConstructorMarker defaultConstructorMarker) {
        this((i & 1) != 0 ? null : num, (i & 2) != 0 ? null : str);
    }

    /* JADX WARN: Illegal instructions before constructor call */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public OneTambonResponse(@org.jetbrains.annotations.NotNull android.os.Parcel r3) {
        /*
            r2 = this;
            java.lang.String r0 = "parcel"
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(r3, r0)
            java.lang.Class r0 = java.lang.Integer.TYPE
            java.lang.ClassLoader r0 = r0.getClassLoader()
            java.lang.Object r0 = r3.readValue(r0)
            boolean r1 = r0 instanceof java.lang.Integer
            if (r1 == 0) goto L16
            java.lang.Integer r0 = (java.lang.Integer) r0
            goto L17
        L16:
            r0 = 0
        L17:
            java.lang.String r3 = r3.readString()
            r2.<init>(r0, r3)
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: th.p047co.dtac.android.dtacone.app_one.model.address.OneTambonResponse.<init>(android.os.Parcel):void");
    }
}

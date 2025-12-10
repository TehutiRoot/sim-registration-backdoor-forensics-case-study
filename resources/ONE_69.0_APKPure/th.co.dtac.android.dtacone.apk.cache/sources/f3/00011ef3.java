package th.p047co.dtac.android.dtacone.model.mrtr_online_registration.address_from_postcode.response;

import android.os.Parcel;
import android.os.Parcelable;
import androidx.compose.runtime.internal.StabilityInferred;
import com.google.gson.annotations.SerializedName;
import java.util.List;
import kotlin.Metadata;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

@StabilityInferred(parameters = 0)
@Metadata(m29143d1 = {"\u0000@\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u000f\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0010\u0002\n\u0002\b\u0003\b\u0087\b\u0018\u0000 #2\u00020\u0001:\u0001#B\u000f\b\u0016\u0012\u0006\u0010\u0002\u001a\u00020\u0003¢\u0006\u0002\u0010\u0004B/\u0012\u0010\b\u0002\u0010\u0005\u001a\n\u0012\u0004\u0012\u00020\u0007\u0018\u00010\u0006\u0012\n\b\u0002\u0010\b\u001a\u0004\u0018\u00010\t\u0012\n\b\u0002\u0010\n\u001a\u0004\u0018\u00010\u000b¢\u0006\u0002\u0010\fJ\u0011\u0010\u0014\u001a\n\u0012\u0004\u0012\u00020\u0007\u0018\u00010\u0006HÆ\u0003J\u0010\u0010\u0015\u001a\u0004\u0018\u00010\tHÆ\u0003¢\u0006\u0002\u0010\u000eJ\u000b\u0010\u0016\u001a\u0004\u0018\u00010\u000bHÆ\u0003J8\u0010\u0017\u001a\u00020\u00002\u0010\b\u0002\u0010\u0005\u001a\n\u0012\u0004\u0012\u00020\u0007\u0018\u00010\u00062\n\b\u0002\u0010\b\u001a\u0004\u0018\u00010\t2\n\b\u0002\u0010\n\u001a\u0004\u0018\u00010\u000bHÆ\u0001¢\u0006\u0002\u0010\u0018J\b\u0010\u0019\u001a\u00020\tH\u0016J\u0013\u0010\u001a\u001a\u00020\u001b2\b\u0010\u001c\u001a\u0004\u0018\u00010\u001dHÖ\u0003J\t\u0010\u001e\u001a\u00020\tHÖ\u0001J\t\u0010\u001f\u001a\u00020\u000bHÖ\u0001J\u0018\u0010 \u001a\u00020!2\u0006\u0010\u0002\u001a\u00020\u00032\u0006\u0010\"\u001a\u00020\tH\u0016R\u001a\u0010\b\u001a\u0004\u0018\u00010\t8\u0006X\u0087\u0004¢\u0006\n\n\u0002\u0010\u000f\u001a\u0004\b\r\u0010\u000eR\u0018\u0010\n\u001a\u0004\u0018\u00010\u000b8\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u0010\u0010\u0011R\u001e\u0010\u0005\u001a\n\u0012\u0004\u0012\u00020\u0007\u0018\u00010\u00068\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u0012\u0010\u0013¨\u0006$"}, m29142d2 = {"Lth/co/dtac/android/dtacone/model/mrtr_online_registration/address_from_postcode/response/AmphurItem;", "Landroid/os/Parcelable;", "parcel", "Landroid/os/Parcel;", "(Landroid/os/Parcel;)V", "tumbon", "", "Lth/co/dtac/android/dtacone/model/mrtr_online_registration/address_from_postcode/response/TumbonItem;", "amphurId", "", "amphurName", "", "(Ljava/util/List;Ljava/lang/Integer;Ljava/lang/String;)V", "getAmphurId", "()Ljava/lang/Integer;", "Ljava/lang/Integer;", "getAmphurName", "()Ljava/lang/String;", "getTumbon", "()Ljava/util/List;", "component1", "component2", "component3", "copy", "(Ljava/util/List;Ljava/lang/Integer;Ljava/lang/String;)Lth/co/dtac/android/dtacone/model/mrtr_online_registration/address_from_postcode/response/AmphurItem;", "describeContents", "equals", "", "other", "", "hashCode", "toString", "writeToParcel", "", "flags", "CREATOR", "app_prodRelease"}, m29141k = 1, m29140mv = {1, 8, 0}, m29138xi = 48)
/* renamed from: th.co.dtac.android.dtacone.model.mrtr_online_registration.address_from_postcode.response.AmphurItem */
/* loaded from: classes8.dex */
public final class AmphurItem implements Parcelable {
    @SerializedName("amphurId")
    @Nullable
    private final Integer amphurId;
    @SerializedName("amphurName")
    @Nullable
    private final String amphurName;
    @SerializedName("tumbon")
    @Nullable
    private final List<TumbonItem> tumbon;
    @NotNull
    public static final CREATOR CREATOR = new CREATOR(null);
    public static final int $stable = 8;

    @Metadata(m29143d1 = {"\u0000$\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0011\n\u0000\n\u0002\u0010\b\n\u0002\b\u0002\b\u0086\u0003\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001B\u0007\b\u0002¢\u0006\u0002\u0010\u0003J\u0010\u0010\u0004\u001a\u00020\u00022\u0006\u0010\u0005\u001a\u00020\u0006H\u0016J\u001d\u0010\u0007\u001a\n\u0012\u0006\u0012\u0004\u0018\u00010\u00020\b2\u0006\u0010\t\u001a\u00020\nH\u0016¢\u0006\u0002\u0010\u000b¨\u0006\f"}, m29142d2 = {"Lth/co/dtac/android/dtacone/model/mrtr_online_registration/address_from_postcode/response/AmphurItem$CREATOR;", "Landroid/os/Parcelable$Creator;", "Lth/co/dtac/android/dtacone/model/mrtr_online_registration/address_from_postcode/response/AmphurItem;", "()V", "createFromParcel", "parcel", "Landroid/os/Parcel;", "newArray", "", "size", "", "(I)[Lth/co/dtac/android/dtacone/model/mrtr_online_registration/address_from_postcode/response/AmphurItem;", "app_prodRelease"}, m29141k = 1, m29140mv = {1, 8, 0}, m29138xi = 48)
    /* renamed from: th.co.dtac.android.dtacone.model.mrtr_online_registration.address_from_postcode.response.AmphurItem$CREATOR */
    /* loaded from: classes8.dex */
    public static final class CREATOR implements Parcelable.Creator<AmphurItem> {
        public /* synthetic */ CREATOR(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        private CREATOR() {
        }

        @Override // android.os.Parcelable.Creator
        @NotNull
        public AmphurItem createFromParcel(@NotNull Parcel parcel) {
            Intrinsics.checkNotNullParameter(parcel, "parcel");
            return new AmphurItem(parcel);
        }

        @Override // android.os.Parcelable.Creator
        @NotNull
        public AmphurItem[] newArray(int i) {
            return new AmphurItem[i];
        }
    }

    public AmphurItem() {
        this(null, null, null, 7, null);
    }

    /* JADX WARN: Multi-variable type inference failed */
    public static /* synthetic */ AmphurItem copy$default(AmphurItem amphurItem, List list, Integer num, String str, int i, Object obj) {
        if ((i & 1) != 0) {
            list = amphurItem.tumbon;
        }
        if ((i & 2) != 0) {
            num = amphurItem.amphurId;
        }
        if ((i & 4) != 0) {
            str = amphurItem.amphurName;
        }
        return amphurItem.copy(list, num, str);
    }

    @Nullable
    public final List<TumbonItem> component1() {
        return this.tumbon;
    }

    @Nullable
    public final Integer component2() {
        return this.amphurId;
    }

    @Nullable
    public final String component3() {
        return this.amphurName;
    }

    @NotNull
    public final AmphurItem copy(@Nullable List<TumbonItem> list, @Nullable Integer num, @Nullable String str) {
        return new AmphurItem(list, num, str);
    }

    @Override // android.os.Parcelable
    public int describeContents() {
        return 0;
    }

    public boolean equals(@Nullable Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj instanceof AmphurItem) {
            AmphurItem amphurItem = (AmphurItem) obj;
            return Intrinsics.areEqual(this.tumbon, amphurItem.tumbon) && Intrinsics.areEqual(this.amphurId, amphurItem.amphurId) && Intrinsics.areEqual(this.amphurName, amphurItem.amphurName);
        }
        return false;
    }

    @Nullable
    public final Integer getAmphurId() {
        return this.amphurId;
    }

    @Nullable
    public final String getAmphurName() {
        return this.amphurName;
    }

    @Nullable
    public final List<TumbonItem> getTumbon() {
        return this.tumbon;
    }

    public int hashCode() {
        List<TumbonItem> list = this.tumbon;
        int hashCode = (list == null ? 0 : list.hashCode()) * 31;
        Integer num = this.amphurId;
        int hashCode2 = (hashCode + (num == null ? 0 : num.hashCode())) * 31;
        String str = this.amphurName;
        return hashCode2 + (str != null ? str.hashCode() : 0);
    }

    @NotNull
    public String toString() {
        List<TumbonItem> list = this.tumbon;
        Integer num = this.amphurId;
        String str = this.amphurName;
        return "AmphurItem(tumbon=" + list + ", amphurId=" + num + ", amphurName=" + str + ")";
    }

    @Override // android.os.Parcelable
    public void writeToParcel(@NotNull Parcel parcel, int i) {
        Intrinsics.checkNotNullParameter(parcel, "parcel");
        parcel.writeTypedList(this.tumbon);
        parcel.writeValue(this.amphurId);
        parcel.writeString(this.amphurName);
    }

    public AmphurItem(@Nullable List<TumbonItem> list, @Nullable Integer num, @Nullable String str) {
        this.tumbon = list;
        this.amphurId = num;
        this.amphurName = str;
    }

    public /* synthetic */ AmphurItem(List list, Integer num, String str, int i, DefaultConstructorMarker defaultConstructorMarker) {
        this((i & 1) != 0 ? null : list, (i & 2) != 0 ? null : num, (i & 4) != 0 ? null : str);
    }

    /* JADX WARN: Illegal instructions before constructor call */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public AmphurItem(@org.jetbrains.annotations.NotNull android.os.Parcel r4) {
        /*
            r3 = this;
            java.lang.String r0 = "parcel"
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(r4, r0)
            th.co.dtac.android.dtacone.model.mrtr_online_registration.address_from_postcode.response.TumbonItem$CREATOR r0 = th.p047co.dtac.android.dtacone.model.mrtr_online_registration.address_from_postcode.response.TumbonItem.CREATOR
            java.util.ArrayList r0 = r4.createTypedArrayList(r0)
            java.lang.Class r1 = java.lang.Integer.TYPE
            java.lang.ClassLoader r1 = r1.getClassLoader()
            java.lang.Object r1 = r4.readValue(r1)
            boolean r2 = r1 instanceof java.lang.Integer
            if (r2 == 0) goto L1c
            java.lang.Integer r1 = (java.lang.Integer) r1
            goto L1d
        L1c:
            r1 = 0
        L1d:
            java.lang.String r4 = r4.readString()
            r3.<init>(r0, r1, r4)
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: th.p047co.dtac.android.dtacone.model.mrtr_online_registration.address_from_postcode.response.AmphurItem.<init>(android.os.Parcel):void");
    }
}
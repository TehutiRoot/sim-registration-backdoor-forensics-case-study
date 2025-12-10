package th.p047co.dtac.android.dtacone.model.appOne.other;

import android.os.Parcel;
import android.os.Parcelable;
import androidx.compose.runtime.internal.StabilityInferred;
import kotlin.Metadata;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

@StabilityInferred(parameters = 0)
@Metadata(m28851d1 = {"\u00008\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0011\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0010\u0002\n\u0002\b\u0003\b\u0087\b\u0018\u0000 #2\u00020\u0001:\u0001#B\u000f\b\u0016\u0012\u0006\u0010\u0002\u001a\u00020\u0003¢\u0006\u0002\u0010\u0004B3\u0012\n\b\u0002\u0010\u0005\u001a\u0004\u0018\u00010\u0006\u0012\n\b\u0002\u0010\u0007\u001a\u0004\u0018\u00010\u0006\u0012\n\b\u0002\u0010\b\u001a\u0004\u0018\u00010\t\u0012\b\b\u0002\u0010\n\u001a\u00020\u000b¢\u0006\u0002\u0010\fJ\u0010\u0010\u0014\u001a\u0004\u0018\u00010\u0006HÆ\u0003¢\u0006\u0002\u0010\u000eJ\u0010\u0010\u0015\u001a\u0004\u0018\u00010\u0006HÆ\u0003¢\u0006\u0002\u0010\u000eJ\u000b\u0010\u0016\u001a\u0004\u0018\u00010\tHÆ\u0003J\t\u0010\u0017\u001a\u00020\u000bHÆ\u0003J<\u0010\u0018\u001a\u00020\u00002\n\b\u0002\u0010\u0005\u001a\u0004\u0018\u00010\u00062\n\b\u0002\u0010\u0007\u001a\u0004\u0018\u00010\u00062\n\b\u0002\u0010\b\u001a\u0004\u0018\u00010\t2\b\b\u0002\u0010\n\u001a\u00020\u000bHÆ\u0001¢\u0006\u0002\u0010\u0019J\b\u0010\u001a\u001a\u00020\u0006H\u0016J\u0013\u0010\u001b\u001a\u00020\u000b2\b\u0010\u001c\u001a\u0004\u0018\u00010\u001dHÖ\u0003J\t\u0010\u001e\u001a\u00020\u0006HÖ\u0001J\t\u0010\u001f\u001a\u00020\tHÖ\u0001J\u0018\u0010 \u001a\u00020!2\u0006\u0010\u0002\u001a\u00020\u00032\u0006\u0010\"\u001a\u00020\u0006H\u0016R\u0015\u0010\u0005\u001a\u0004\u0018\u00010\u0006¢\u0006\n\n\u0002\u0010\u000f\u001a\u0004\b\r\u0010\u000eR\u0015\u0010\u0007\u001a\u0004\u0018\u00010\u0006¢\u0006\n\n\u0002\u0010\u000f\u001a\u0004\b\u0010\u0010\u000eR\u0011\u0010\n\u001a\u00020\u000b¢\u0006\b\n\u0000\u001a\u0004\b\n\u0010\u0011R\u0013\u0010\b\u001a\u0004\u0018\u00010\t¢\u0006\b\n\u0000\u001a\u0004\b\u0012\u0010\u0013¨\u0006$"}, m28850d2 = {"Lth/co/dtac/android/dtacone/model/appOne/other/OneOtherMenuCollection;", "Landroid/os/Parcelable;", "parcel", "Landroid/os/Parcel;", "(Landroid/os/Parcel;)V", "iconLeft", "", "iconRight", "titleSetting", "", "isSetTint", "", "(Ljava/lang/Integer;Ljava/lang/Integer;Ljava/lang/String;Z)V", "getIconLeft", "()Ljava/lang/Integer;", "Ljava/lang/Integer;", "getIconRight", "()Z", "getTitleSetting", "()Ljava/lang/String;", "component1", "component2", "component3", "component4", "copy", "(Ljava/lang/Integer;Ljava/lang/Integer;Ljava/lang/String;Z)Lth/co/dtac/android/dtacone/model/appOne/other/OneOtherMenuCollection;", "describeContents", "equals", "other", "", "hashCode", "toString", "writeToParcel", "", "flags", "CREATOR", "app_prodRelease"}, m28849k = 1, m28848mv = {1, 8, 0}, m28846xi = 48)
/* renamed from: th.co.dtac.android.dtacone.model.appOne.other.OneOtherMenuCollection */
/* loaded from: classes8.dex */
public final class OneOtherMenuCollection implements Parcelable {
    public static final int $stable = 0;
    @NotNull
    public static final CREATOR CREATOR = new CREATOR(null);
    @Nullable
    private final Integer iconLeft;
    @Nullable
    private final Integer iconRight;
    private final boolean isSetTint;
    @Nullable
    private final String titleSetting;

    @Metadata(m28851d1 = {"\u0000$\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0011\n\u0000\n\u0002\u0010\b\n\u0002\b\u0002\b\u0086\u0003\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001B\u0007\b\u0002¢\u0006\u0002\u0010\u0003J\u0010\u0010\u0004\u001a\u00020\u00022\u0006\u0010\u0005\u001a\u00020\u0006H\u0016J\u001d\u0010\u0007\u001a\n\u0012\u0006\u0012\u0004\u0018\u00010\u00020\b2\u0006\u0010\t\u001a\u00020\nH\u0016¢\u0006\u0002\u0010\u000b¨\u0006\f"}, m28850d2 = {"Lth/co/dtac/android/dtacone/model/appOne/other/OneOtherMenuCollection$CREATOR;", "Landroid/os/Parcelable$Creator;", "Lth/co/dtac/android/dtacone/model/appOne/other/OneOtherMenuCollection;", "()V", "createFromParcel", "parcel", "Landroid/os/Parcel;", "newArray", "", "size", "", "(I)[Lth/co/dtac/android/dtacone/model/appOne/other/OneOtherMenuCollection;", "app_prodRelease"}, m28849k = 1, m28848mv = {1, 8, 0}, m28846xi = 48)
    /* renamed from: th.co.dtac.android.dtacone.model.appOne.other.OneOtherMenuCollection$CREATOR */
    /* loaded from: classes8.dex */
    public static final class CREATOR implements Parcelable.Creator<OneOtherMenuCollection> {
        public /* synthetic */ CREATOR(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        private CREATOR() {
        }

        @Override // android.os.Parcelable.Creator
        @NotNull
        public OneOtherMenuCollection createFromParcel(@NotNull Parcel parcel) {
            Intrinsics.checkNotNullParameter(parcel, "parcel");
            return new OneOtherMenuCollection(parcel);
        }

        @Override // android.os.Parcelable.Creator
        @NotNull
        public OneOtherMenuCollection[] newArray(int i) {
            return new OneOtherMenuCollection[i];
        }
    }

    public OneOtherMenuCollection() {
        this(null, null, null, false, 15, null);
    }

    public static /* synthetic */ OneOtherMenuCollection copy$default(OneOtherMenuCollection oneOtherMenuCollection, Integer num, Integer num2, String str, boolean z, int i, Object obj) {
        if ((i & 1) != 0) {
            num = oneOtherMenuCollection.iconLeft;
        }
        if ((i & 2) != 0) {
            num2 = oneOtherMenuCollection.iconRight;
        }
        if ((i & 4) != 0) {
            str = oneOtherMenuCollection.titleSetting;
        }
        if ((i & 8) != 0) {
            z = oneOtherMenuCollection.isSetTint;
        }
        return oneOtherMenuCollection.copy(num, num2, str, z);
    }

    @Nullable
    public final Integer component1() {
        return this.iconLeft;
    }

    @Nullable
    public final Integer component2() {
        return this.iconRight;
    }

    @Nullable
    public final String component3() {
        return this.titleSetting;
    }

    public final boolean component4() {
        return this.isSetTint;
    }

    @NotNull
    public final OneOtherMenuCollection copy(@Nullable Integer num, @Nullable Integer num2, @Nullable String str, boolean z) {
        return new OneOtherMenuCollection(num, num2, str, z);
    }

    @Override // android.os.Parcelable
    public int describeContents() {
        return 0;
    }

    public boolean equals(@Nullable Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj instanceof OneOtherMenuCollection) {
            OneOtherMenuCollection oneOtherMenuCollection = (OneOtherMenuCollection) obj;
            return Intrinsics.areEqual(this.iconLeft, oneOtherMenuCollection.iconLeft) && Intrinsics.areEqual(this.iconRight, oneOtherMenuCollection.iconRight) && Intrinsics.areEqual(this.titleSetting, oneOtherMenuCollection.titleSetting) && this.isSetTint == oneOtherMenuCollection.isSetTint;
        }
        return false;
    }

    @Nullable
    public final Integer getIconLeft() {
        return this.iconLeft;
    }

    @Nullable
    public final Integer getIconRight() {
        return this.iconRight;
    }

    @Nullable
    public final String getTitleSetting() {
        return this.titleSetting;
    }

    /* JADX WARN: Multi-variable type inference failed */
    public int hashCode() {
        Integer num = this.iconLeft;
        int hashCode = (num == null ? 0 : num.hashCode()) * 31;
        Integer num2 = this.iconRight;
        int hashCode2 = (hashCode + (num2 == null ? 0 : num2.hashCode())) * 31;
        String str = this.titleSetting;
        int hashCode3 = (hashCode2 + (str != null ? str.hashCode() : 0)) * 31;
        boolean z = this.isSetTint;
        int i = z;
        if (z != 0) {
            i = 1;
        }
        return hashCode3 + i;
    }

    public final boolean isSetTint() {
        return this.isSetTint;
    }

    @NotNull
    public String toString() {
        Integer num = this.iconLeft;
        Integer num2 = this.iconRight;
        String str = this.titleSetting;
        boolean z = this.isSetTint;
        return "OneOtherMenuCollection(iconLeft=" + num + ", iconRight=" + num2 + ", titleSetting=" + str + ", isSetTint=" + z + ")";
    }

    @Override // android.os.Parcelable
    public void writeToParcel(@NotNull Parcel parcel, int i) {
        Intrinsics.checkNotNullParameter(parcel, "parcel");
        parcel.writeValue(this.iconLeft);
        parcel.writeValue(this.iconRight);
        parcel.writeString(this.titleSetting);
        parcel.writeByte(this.isSetTint ? (byte) 1 : (byte) 0);
    }

    public OneOtherMenuCollection(@Nullable Integer num, @Nullable Integer num2, @Nullable String str, boolean z) {
        this.iconLeft = num;
        this.iconRight = num2;
        this.titleSetting = str;
        this.isSetTint = z;
    }

    public /* synthetic */ OneOtherMenuCollection(Integer num, Integer num2, String str, boolean z, int i, DefaultConstructorMarker defaultConstructorMarker) {
        this((i & 1) != 0 ? null : num, (i & 2) != 0 ? null : num2, (i & 4) != 0 ? null : str, (i & 8) != 0 ? true : z);
    }

    /* JADX WARN: Illegal instructions before constructor call */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public OneOtherMenuCollection(@org.jetbrains.annotations.NotNull android.os.Parcel r5) {
        /*
            r4 = this;
            java.lang.String r0 = "parcel"
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(r5, r0)
            java.lang.Class r0 = java.lang.Integer.TYPE
            java.lang.ClassLoader r1 = r0.getClassLoader()
            java.lang.Object r1 = r5.readValue(r1)
            boolean r2 = r1 instanceof java.lang.Integer
            r3 = 0
            if (r2 == 0) goto L17
            java.lang.Integer r1 = (java.lang.Integer) r1
            goto L18
        L17:
            r1 = r3
        L18:
            java.lang.ClassLoader r0 = r0.getClassLoader()
            java.lang.Object r0 = r5.readValue(r0)
            boolean r2 = r0 instanceof java.lang.Integer
            if (r2 == 0) goto L27
            r3 = r0
            java.lang.Integer r3 = (java.lang.Integer) r3
        L27:
            java.lang.String r0 = r5.readString()
            byte r5 = r5.readByte()
            if (r5 == 0) goto L33
            r5 = 1
            goto L34
        L33:
            r5 = 0
        L34:
            r4.<init>(r1, r3, r0, r5)
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: th.p047co.dtac.android.dtacone.model.appOne.other.OneOtherMenuCollection.<init>(android.os.Parcel):void");
    }
}

package th.p047co.dtac.android.dtacone.model.p2post;

import android.os.Parcel;
import android.os.Parcelable;
import androidx.autofill.HintConstants;
import androidx.compose.runtime.internal.StabilityInferred;
import kotlin.Metadata;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import th.p047co.dtac.android.dtacone.model.p2post.validate.BirthDayCollection;

@StabilityInferred(parameters = 0)
@Metadata(m29143d1 = {"\u0000>\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u001b\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0010\u0002\n\u0002\b\u0004\b\u0087\b\u0018\u0000 12\u00020\u0001:\u00011B'\b\u0016\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0003\u0012\u0006\u0010\u0005\u001a\u00020\u0003\u0012\u0006\u0010\u0006\u001a\u00020\u0007¢\u0006\u0002\u0010\bB\u000f\b\u0016\u0012\u0006\u0010\t\u001a\u00020\n¢\u0006\u0002\u0010\u000bB;\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0003\u0012\u0006\u0010\u0005\u001a\u00020\u0003\u0012\b\u0010\u0006\u001a\u0004\u0018\u00010\u0007\u0012\b\b\u0002\u0010\f\u001a\u00020\u0003\u0012\b\b\u0002\u0010\r\u001a\u00020\u0003¢\u0006\u0002\u0010\u000eJ\t\u0010\u001e\u001a\u00020\u0003HÆ\u0003J\t\u0010\u001f\u001a\u00020\u0003HÆ\u0003J\t\u0010 \u001a\u00020\u0003HÆ\u0003J\u000b\u0010!\u001a\u0004\u0018\u00010\u0007HÆ\u0003J\t\u0010\"\u001a\u00020\u0003HÆ\u0003J\t\u0010#\u001a\u00020\u0003HÆ\u0003JG\u0010$\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u00032\b\b\u0002\u0010\u0004\u001a\u00020\u00032\b\b\u0002\u0010\u0005\u001a\u00020\u00032\n\b\u0002\u0010\u0006\u001a\u0004\u0018\u00010\u00072\b\b\u0002\u0010\f\u001a\u00020\u00032\b\b\u0002\u0010\r\u001a\u00020\u0003HÆ\u0001J\b\u0010%\u001a\u00020&H\u0016J\u0013\u0010'\u001a\u00020(2\b\u0010)\u001a\u0004\u0018\u00010*HÖ\u0003J\t\u0010+\u001a\u00020&HÖ\u0001J\t\u0010,\u001a\u00020\u0003HÖ\u0001J\u0018\u0010-\u001a\u00020.2\u0006\u0010/\u001a\u00020\n2\u0006\u00100\u001a\u00020&H\u0016R\u001c\u0010\u0006\u001a\u0004\u0018\u00010\u0007X\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u000f\u0010\u0010\"\u0004\b\u0011\u0010\u0012R\u001a\u0010\f\u001a\u00020\u0003X\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u0013\u0010\u0014\"\u0004\b\u0015\u0010\u0016R\u0011\u0010\r\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0017\u0010\u0014R\u001a\u0010\u0002\u001a\u00020\u0003X\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u0018\u0010\u0014\"\u0004\b\u0019\u0010\u0016R\u001a\u0010\u0004\u001a\u00020\u0003X\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u001a\u0010\u0014\"\u0004\b\u001b\u0010\u0016R\u001a\u0010\u0005\u001a\u00020\u0003X\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u001c\u0010\u0014\"\u0004\b\u001d\u0010\u0016¨\u00062"}, m29142d2 = {"Lth/co/dtac/android/dtacone/model/p2post/FormCollection;", "Landroid/os/Parcelable;", "id", "", "name", "sureName", "birthDay", "Lth/co/dtac/android/dtacone/model/p2post/validate/BirthDayCollection;", "(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Lth/co/dtac/android/dtacone/model/p2post/validate/BirthDayCollection;)V", "fromParcel", "Landroid/os/Parcel;", "(Landroid/os/Parcel;)V", "fullDate", HintConstants.AUTOFILL_HINT_GENDER, "(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Lth/co/dtac/android/dtacone/model/p2post/validate/BirthDayCollection;Ljava/lang/String;Ljava/lang/String;)V", "getBirthDay", "()Lth/co/dtac/android/dtacone/model/p2post/validate/BirthDayCollection;", "setBirthDay", "(Lth/co/dtac/android/dtacone/model/p2post/validate/BirthDayCollection;)V", "getFullDate", "()Ljava/lang/String;", "setFullDate", "(Ljava/lang/String;)V", "getGender", "getId", "setId", "getName", "setName", "getSureName", "setSureName", "component1", "component2", "component3", "component4", "component5", "component6", "copy", "describeContents", "", "equals", "", "other", "", "hashCode", "toString", "writeToParcel", "", "dest", "flags", "Companion", "app_prodRelease"}, m29141k = 1, m29140mv = {1, 8, 0}, m29138xi = 48)
/* renamed from: th.co.dtac.android.dtacone.model.p2post.FormCollection */
/* loaded from: classes8.dex */
public final class FormCollection implements Parcelable {
    @Nullable
    private BirthDayCollection birthDay;
    @NotNull
    private String fullDate;
    @NotNull
    private final String gender;
    @NotNull

    /* renamed from: id */
    private String f85178id;
    @NotNull
    private String name;
    @NotNull
    private String sureName;
    @NotNull
    public static final Companion Companion = new Companion(null);
    public static final int $stable = 8;
    @NotNull
    private static final Parcelable.Creator<FormCollection> CREATOR = new Parcelable.Creator<FormCollection>() { // from class: th.co.dtac.android.dtacone.model.p2post.FormCollection$Companion$CREATOR$1
        @Override // android.os.Parcelable.Creator
        @NotNull
        public FormCollection createFromParcel(@NotNull Parcel source) {
            Intrinsics.checkNotNullParameter(source, "source");
            return new FormCollection(source);
        }

        @Override // android.os.Parcelable.Creator
        @NotNull
        public FormCollection[] newArray(int i) {
            return new FormCollection[i];
        }
    };

    @Metadata(m29143d1 = {"\u0000\u0018\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0086\u0003\u0018\u00002\u00020\u0001B\u0007\b\u0002¢\u0006\u0002\u0010\u0002R\u0017\u0010\u0003\u001a\b\u0012\u0004\u0012\u00020\u00050\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u0006\u0010\u0007¨\u0006\b"}, m29142d2 = {"Lth/co/dtac/android/dtacone/model/p2post/FormCollection$Companion;", "", "()V", "CREATOR", "Landroid/os/Parcelable$Creator;", "Lth/co/dtac/android/dtacone/model/p2post/FormCollection;", "getCREATOR", "()Landroid/os/Parcelable$Creator;", "app_prodRelease"}, m29141k = 1, m29140mv = {1, 8, 0}, m29138xi = 48)
    /* renamed from: th.co.dtac.android.dtacone.model.p2post.FormCollection$Companion */
    /* loaded from: classes8.dex */
    public static final class Companion {
        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        @NotNull
        public final Parcelable.Creator<FormCollection> getCREATOR() {
            return FormCollection.CREATOR;
        }

        private Companion() {
        }
    }

    public FormCollection(@NotNull String id2, @NotNull String name, @NotNull String sureName, @Nullable BirthDayCollection birthDayCollection, @NotNull String fullDate, @NotNull String gender) {
        Intrinsics.checkNotNullParameter(id2, "id");
        Intrinsics.checkNotNullParameter(name, "name");
        Intrinsics.checkNotNullParameter(sureName, "sureName");
        Intrinsics.checkNotNullParameter(fullDate, "fullDate");
        Intrinsics.checkNotNullParameter(gender, "gender");
        this.f85178id = id2;
        this.name = name;
        this.sureName = sureName;
        this.birthDay = birthDayCollection;
        this.fullDate = fullDate;
        this.gender = gender;
    }

    public static /* synthetic */ FormCollection copy$default(FormCollection formCollection, String str, String str2, String str3, BirthDayCollection birthDayCollection, String str4, String str5, int i, Object obj) {
        if ((i & 1) != 0) {
            str = formCollection.f85178id;
        }
        if ((i & 2) != 0) {
            str2 = formCollection.name;
        }
        String str6 = str2;
        if ((i & 4) != 0) {
            str3 = formCollection.sureName;
        }
        String str7 = str3;
        if ((i & 8) != 0) {
            birthDayCollection = formCollection.birthDay;
        }
        BirthDayCollection birthDayCollection2 = birthDayCollection;
        if ((i & 16) != 0) {
            str4 = formCollection.fullDate;
        }
        String str8 = str4;
        if ((i & 32) != 0) {
            str5 = formCollection.gender;
        }
        return formCollection.copy(str, str6, str7, birthDayCollection2, str8, str5);
    }

    @NotNull
    public final String component1() {
        return this.f85178id;
    }

    @NotNull
    public final String component2() {
        return this.name;
    }

    @NotNull
    public final String component3() {
        return this.sureName;
    }

    @Nullable
    public final BirthDayCollection component4() {
        return this.birthDay;
    }

    @NotNull
    public final String component5() {
        return this.fullDate;
    }

    @NotNull
    public final String component6() {
        return this.gender;
    }

    @NotNull
    public final FormCollection copy(@NotNull String id2, @NotNull String name, @NotNull String sureName, @Nullable BirthDayCollection birthDayCollection, @NotNull String fullDate, @NotNull String gender) {
        Intrinsics.checkNotNullParameter(id2, "id");
        Intrinsics.checkNotNullParameter(name, "name");
        Intrinsics.checkNotNullParameter(sureName, "sureName");
        Intrinsics.checkNotNullParameter(fullDate, "fullDate");
        Intrinsics.checkNotNullParameter(gender, "gender");
        return new FormCollection(id2, name, sureName, birthDayCollection, fullDate, gender);
    }

    @Override // android.os.Parcelable
    public int describeContents() {
        return 0;
    }

    public boolean equals(@Nullable Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj instanceof FormCollection) {
            FormCollection formCollection = (FormCollection) obj;
            return Intrinsics.areEqual(this.f85178id, formCollection.f85178id) && Intrinsics.areEqual(this.name, formCollection.name) && Intrinsics.areEqual(this.sureName, formCollection.sureName) && Intrinsics.areEqual(this.birthDay, formCollection.birthDay) && Intrinsics.areEqual(this.fullDate, formCollection.fullDate) && Intrinsics.areEqual(this.gender, formCollection.gender);
        }
        return false;
    }

    @Nullable
    public final BirthDayCollection getBirthDay() {
        return this.birthDay;
    }

    @NotNull
    public final String getFullDate() {
        return this.fullDate;
    }

    @NotNull
    public final String getGender() {
        return this.gender;
    }

    @NotNull
    public final String getId() {
        return this.f85178id;
    }

    @NotNull
    public final String getName() {
        return this.name;
    }

    @NotNull
    public final String getSureName() {
        return this.sureName;
    }

    public int hashCode() {
        int hashCode = ((((this.f85178id.hashCode() * 31) + this.name.hashCode()) * 31) + this.sureName.hashCode()) * 31;
        BirthDayCollection birthDayCollection = this.birthDay;
        return ((((hashCode + (birthDayCollection == null ? 0 : birthDayCollection.hashCode())) * 31) + this.fullDate.hashCode()) * 31) + this.gender.hashCode();
    }

    public final void setBirthDay(@Nullable BirthDayCollection birthDayCollection) {
        this.birthDay = birthDayCollection;
    }

    public final void setFullDate(@NotNull String str) {
        Intrinsics.checkNotNullParameter(str, "<set-?>");
        this.fullDate = str;
    }

    public final void setId(@NotNull String str) {
        Intrinsics.checkNotNullParameter(str, "<set-?>");
        this.f85178id = str;
    }

    public final void setName(@NotNull String str) {
        Intrinsics.checkNotNullParameter(str, "<set-?>");
        this.name = str;
    }

    public final void setSureName(@NotNull String str) {
        Intrinsics.checkNotNullParameter(str, "<set-?>");
        this.sureName = str;
    }

    @NotNull
    public String toString() {
        String str = this.f85178id;
        String str2 = this.name;
        String str3 = this.sureName;
        BirthDayCollection birthDayCollection = this.birthDay;
        String str4 = this.fullDate;
        String str5 = this.gender;
        return "FormCollection(id=" + str + ", name=" + str2 + ", sureName=" + str3 + ", birthDay=" + birthDayCollection + ", fullDate=" + str4 + ", gender=" + str5 + ")";
    }

    @Override // android.os.Parcelable
    public void writeToParcel(@NotNull Parcel dest, int i) {
        Intrinsics.checkNotNullParameter(dest, "dest");
        dest.writeString(this.f85178id);
        dest.writeString(this.name);
        dest.writeString(this.sureName);
        dest.writeParcelable(this.birthDay, i);
        dest.writeString(this.fullDate);
        dest.writeString(this.gender);
    }

    public /* synthetic */ FormCollection(String str, String str2, String str3, BirthDayCollection birthDayCollection, String str4, String str5, int i, DefaultConstructorMarker defaultConstructorMarker) {
        this(str, str2, str3, birthDayCollection, (i & 16) != 0 ? "" : str4, (i & 32) != 0 ? "" : str5);
    }

    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    public FormCollection(@NotNull String id2, @NotNull String name, @NotNull String sureName, @NotNull BirthDayCollection birthDay) {
        this(id2, name, sureName, birthDay, "", "");
        Intrinsics.checkNotNullParameter(id2, "id");
        Intrinsics.checkNotNullParameter(name, "name");
        Intrinsics.checkNotNullParameter(sureName, "sureName");
        Intrinsics.checkNotNullParameter(birthDay, "birthDay");
    }

    /* JADX WARN: Illegal instructions before constructor call */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public FormCollection(@org.jetbrains.annotations.NotNull android.os.Parcel r10) {
        /*
            r9 = this;
            java.lang.String r0 = "fromParcel"
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(r10, r0)
            java.lang.String r0 = r10.readString()
            java.lang.String r1 = ""
            if (r0 != 0) goto Lf
            r3 = r1
            goto L10
        Lf:
            r3 = r0
        L10:
            java.lang.String r0 = r10.readString()
            if (r0 != 0) goto L18
            r4 = r1
            goto L19
        L18:
            r4 = r0
        L19:
            java.lang.String r0 = r10.readString()
            if (r0 != 0) goto L21
            r5 = r1
            goto L22
        L21:
            r5 = r0
        L22:
            java.lang.Class<th.co.dtac.android.dtacone.model.p2post.validate.BirthDayCollection> r0 = th.p047co.dtac.android.dtacone.model.p2post.validate.BirthDayCollection.class
            java.lang.ClassLoader r0 = r0.getClassLoader()
            android.os.Parcelable r0 = r10.readParcelable(r0)
            r6 = r0
            th.co.dtac.android.dtacone.model.p2post.validate.BirthDayCollection r6 = (th.p047co.dtac.android.dtacone.model.p2post.validate.BirthDayCollection) r6
            java.lang.String r0 = r10.readString()
            if (r0 != 0) goto L37
            r7 = r1
            goto L38
        L37:
            r7 = r0
        L38:
            java.lang.String r10 = r10.readString()
            if (r10 != 0) goto L40
            r8 = r1
            goto L41
        L40:
            r8 = r10
        L41:
            r2 = r9
            r2.<init>(r3, r4, r5, r6, r7, r8)
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: th.p047co.dtac.android.dtacone.model.p2post.FormCollection.<init>(android.os.Parcel):void");
    }
}
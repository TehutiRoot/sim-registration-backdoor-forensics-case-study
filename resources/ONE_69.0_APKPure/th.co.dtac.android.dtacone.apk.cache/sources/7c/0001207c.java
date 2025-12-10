package th.p047co.dtac.android.dtacone.model.self_update;

import androidx.compose.runtime.internal.StabilityInferred;
import com.google.gson.annotations.SerializedName;
import java.util.List;
import kotlin.Metadata;
import kotlin.collections.CollectionsKt__CollectionsKt;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

@StabilityInferred(parameters = 0)
@Metadata(m29143d1 = {"\u0000\u001c\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0007\b\u0007\u0018\u00002\u00020\u0001:\u0002\u000b\fB%\u0012\u000e\b\u0002\u0010\u0002\u001a\b\u0012\u0004\u0012\u00020\u00040\u0003\u0012\u000e\b\u0002\u0010\u0005\u001a\b\u0012\u0004\u0012\u00020\u00060\u0003¢\u0006\u0002\u0010\u0007R\u001c\u0010\u0002\u001a\b\u0012\u0004\u0012\u00020\u00040\u00038\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b\b\u0010\tR\u001c\u0010\u0005\u001a\b\u0012\u0004\u0012\u00020\u00060\u00038\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b\n\u0010\t¨\u0006\r"}, m29142d2 = {"Lth/co/dtac/android/dtacone/model/self_update/RtrProfileSubdistrictResponse;", "", "postcode", "", "Lth/co/dtac/android/dtacone/model/self_update/RtrProfileSubdistrictResponse$Postcode;", "subdistrict", "Lth/co/dtac/android/dtacone/model/self_update/RtrProfileSubdistrictResponse$Subdistrict;", "(Ljava/util/List;Ljava/util/List;)V", "getPostcode", "()Ljava/util/List;", "getSubdistrict", "Postcode", "Subdistrict", "app_prodRelease"}, m29141k = 1, m29140mv = {1, 8, 0}, m29138xi = 48)
/* renamed from: th.co.dtac.android.dtacone.model.self_update.RtrProfileSubdistrictResponse */
/* loaded from: classes8.dex */
public final class RtrProfileSubdistrictResponse {
    public static final int $stable = 8;
    @SerializedName("postcode")
    @NotNull
    private final List<Postcode> postcode;
    @SerializedName("subdistrict")
    @NotNull
    private final List<Subdistrict> subdistrict;

    @StabilityInferred(parameters = 0)
    @Metadata(m29143d1 = {"\u0000 \n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\b\n\u0002\b\t\n\u0002\u0010\u000b\n\u0002\b\u0004\b\u0087\b\u0018\u00002\u00020\u0001B\u0019\u0012\b\b\u0002\u0010\u0002\u001a\u00020\u0003\u0012\b\b\u0002\u0010\u0004\u001a\u00020\u0005¢\u0006\u0002\u0010\u0006J\t\u0010\u000b\u001a\u00020\u0003HÆ\u0003J\t\u0010\f\u001a\u00020\u0005HÆ\u0003J\u001d\u0010\r\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u00032\b\b\u0002\u0010\u0004\u001a\u00020\u0005HÆ\u0001J\u0013\u0010\u000e\u001a\u00020\u000f2\b\u0010\u0010\u001a\u0004\u0018\u00010\u0001HÖ\u0003J\t\u0010\u0011\u001a\u00020\u0005HÖ\u0001J\t\u0010\u0012\u001a\u00020\u0003HÖ\u0001R\u0016\u0010\u0002\u001a\u00020\u00038\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u0007\u0010\bR\u0016\u0010\u0004\u001a\u00020\u00058\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b\t\u0010\n¨\u0006\u0013"}, m29142d2 = {"Lth/co/dtac/android/dtacone/model/self_update/RtrProfileSubdistrictResponse$Postcode;", "", "code", "", "id", "", "(Ljava/lang/String;I)V", "getCode", "()Ljava/lang/String;", "getId", "()I", "component1", "component2", "copy", "equals", "", "other", "hashCode", "toString", "app_prodRelease"}, m29141k = 1, m29140mv = {1, 8, 0}, m29138xi = 48)
    /* renamed from: th.co.dtac.android.dtacone.model.self_update.RtrProfileSubdistrictResponse$Postcode */
    /* loaded from: classes8.dex */
    public static final class Postcode {
        public static final int $stable = 0;
        @SerializedName("code")
        @NotNull
        private final String code;
        @SerializedName("id")

        /* renamed from: id */
        private final int f85183id;

        public Postcode() {
            this(null, 0, 3, null);
        }

        public static /* synthetic */ Postcode copy$default(Postcode postcode, String str, int i, int i2, Object obj) {
            if ((i2 & 1) != 0) {
                str = postcode.code;
            }
            if ((i2 & 2) != 0) {
                i = postcode.f85183id;
            }
            return postcode.copy(str, i);
        }

        @NotNull
        public final String component1() {
            return this.code;
        }

        public final int component2() {
            return this.f85183id;
        }

        @NotNull
        public final Postcode copy(@NotNull String code, int i) {
            Intrinsics.checkNotNullParameter(code, "code");
            return new Postcode(code, i);
        }

        public boolean equals(@Nullable Object obj) {
            if (this == obj) {
                return true;
            }
            if (obj instanceof Postcode) {
                Postcode postcode = (Postcode) obj;
                return Intrinsics.areEqual(this.code, postcode.code) && this.f85183id == postcode.f85183id;
            }
            return false;
        }

        @NotNull
        public final String getCode() {
            return this.code;
        }

        public final int getId() {
            return this.f85183id;
        }

        public int hashCode() {
            return (this.code.hashCode() * 31) + this.f85183id;
        }

        @NotNull
        public String toString() {
            String str = this.code;
            int i = this.f85183id;
            return "Postcode(code=" + str + ", id=" + i + ")";
        }

        public Postcode(@NotNull String code, int i) {
            Intrinsics.checkNotNullParameter(code, "code");
            this.code = code;
            this.f85183id = i;
        }

        public /* synthetic */ Postcode(String str, int i, int i2, DefaultConstructorMarker defaultConstructorMarker) {
            this((i2 & 1) != 0 ? "" : str, (i2 & 2) != 0 ? 0 : i);
        }
    }

    @StabilityInferred(parameters = 0)
    @Metadata(m29143d1 = {"\u0000 \n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000e\n\u0002\b\f\n\u0002\u0010\u000b\n\u0002\b\u0004\b\u0087\b\u0018\u00002\u00020\u0001B#\u0012\b\b\u0002\u0010\u0002\u001a\u00020\u0003\u0012\b\b\u0002\u0010\u0004\u001a\u00020\u0005\u0012\b\b\u0002\u0010\u0006\u001a\u00020\u0005¢\u0006\u0002\u0010\u0007J\t\u0010\r\u001a\u00020\u0003HÆ\u0003J\t\u0010\u000e\u001a\u00020\u0005HÆ\u0003J\t\u0010\u000f\u001a\u00020\u0005HÆ\u0003J'\u0010\u0010\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u00032\b\b\u0002\u0010\u0004\u001a\u00020\u00052\b\b\u0002\u0010\u0006\u001a\u00020\u0005HÆ\u0001J\u0013\u0010\u0011\u001a\u00020\u00122\b\u0010\u0013\u001a\u0004\u0018\u00010\u0001HÖ\u0003J\t\u0010\u0014\u001a\u00020\u0003HÖ\u0001J\t\u0010\u0015\u001a\u00020\u0005HÖ\u0001R\u0016\u0010\u0002\u001a\u00020\u00038\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b\b\u0010\tR\u0016\u0010\u0004\u001a\u00020\u00058\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b\n\u0010\u000bR\u0016\u0010\u0006\u001a\u00020\u00058\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b\f\u0010\u000b¨\u0006\u0016"}, m29142d2 = {"Lth/co/dtac/android/dtacone/model/self_update/RtrProfileSubdistrictResponse$Subdistrict;", "", "id", "", "nameEN", "", "nameTH", "(ILjava/lang/String;Ljava/lang/String;)V", "getId", "()I", "getNameEN", "()Ljava/lang/String;", "getNameTH", "component1", "component2", "component3", "copy", "equals", "", "other", "hashCode", "toString", "app_prodRelease"}, m29141k = 1, m29140mv = {1, 8, 0}, m29138xi = 48)
    /* renamed from: th.co.dtac.android.dtacone.model.self_update.RtrProfileSubdistrictResponse$Subdistrict */
    /* loaded from: classes8.dex */
    public static final class Subdistrict {
        public static final int $stable = 0;
        @SerializedName("id")

        /* renamed from: id */
        private final int f85184id;
        @SerializedName("nameEN")
        @NotNull
        private final String nameEN;
        @SerializedName("nameTH")
        @NotNull
        private final String nameTH;

        public Subdistrict() {
            this(0, null, null, 7, null);
        }

        public static /* synthetic */ Subdistrict copy$default(Subdistrict subdistrict, int i, String str, String str2, int i2, Object obj) {
            if ((i2 & 1) != 0) {
                i = subdistrict.f85184id;
            }
            if ((i2 & 2) != 0) {
                str = subdistrict.nameEN;
            }
            if ((i2 & 4) != 0) {
                str2 = subdistrict.nameTH;
            }
            return subdistrict.copy(i, str, str2);
        }

        public final int component1() {
            return this.f85184id;
        }

        @NotNull
        public final String component2() {
            return this.nameEN;
        }

        @NotNull
        public final String component3() {
            return this.nameTH;
        }

        @NotNull
        public final Subdistrict copy(int i, @NotNull String nameEN, @NotNull String nameTH) {
            Intrinsics.checkNotNullParameter(nameEN, "nameEN");
            Intrinsics.checkNotNullParameter(nameTH, "nameTH");
            return new Subdistrict(i, nameEN, nameTH);
        }

        public boolean equals(@Nullable Object obj) {
            if (this == obj) {
                return true;
            }
            if (obj instanceof Subdistrict) {
                Subdistrict subdistrict = (Subdistrict) obj;
                return this.f85184id == subdistrict.f85184id && Intrinsics.areEqual(this.nameEN, subdistrict.nameEN) && Intrinsics.areEqual(this.nameTH, subdistrict.nameTH);
            }
            return false;
        }

        public final int getId() {
            return this.f85184id;
        }

        @NotNull
        public final String getNameEN() {
            return this.nameEN;
        }

        @NotNull
        public final String getNameTH() {
            return this.nameTH;
        }

        public int hashCode() {
            return (((this.f85184id * 31) + this.nameEN.hashCode()) * 31) + this.nameTH.hashCode();
        }

        @NotNull
        public String toString() {
            int i = this.f85184id;
            String str = this.nameEN;
            String str2 = this.nameTH;
            return "Subdistrict(id=" + i + ", nameEN=" + str + ", nameTH=" + str2 + ")";
        }

        public Subdistrict(int i, @NotNull String nameEN, @NotNull String nameTH) {
            Intrinsics.checkNotNullParameter(nameEN, "nameEN");
            Intrinsics.checkNotNullParameter(nameTH, "nameTH");
            this.f85184id = i;
            this.nameEN = nameEN;
            this.nameTH = nameTH;
        }

        public /* synthetic */ Subdistrict(int i, String str, String str2, int i2, DefaultConstructorMarker defaultConstructorMarker) {
            this((i2 & 1) != 0 ? 0 : i, (i2 & 2) != 0 ? "" : str, (i2 & 4) != 0 ? "" : str2);
        }
    }

    public RtrProfileSubdistrictResponse() {
        this(null, null, 3, null);
    }

    @NotNull
    public final List<Postcode> getPostcode() {
        return this.postcode;
    }

    @NotNull
    public final List<Subdistrict> getSubdistrict() {
        return this.subdistrict;
    }

    public RtrProfileSubdistrictResponse(@NotNull List<Postcode> postcode, @NotNull List<Subdistrict> subdistrict) {
        Intrinsics.checkNotNullParameter(postcode, "postcode");
        Intrinsics.checkNotNullParameter(subdistrict, "subdistrict");
        this.postcode = postcode;
        this.subdistrict = subdistrict;
    }

    public /* synthetic */ RtrProfileSubdistrictResponse(List list, List list2, int i, DefaultConstructorMarker defaultConstructorMarker) {
        this((i & 1) != 0 ? CollectionsKt__CollectionsKt.emptyList() : list, (i & 2) != 0 ? CollectionsKt__CollectionsKt.emptyList() : list2);
    }
}
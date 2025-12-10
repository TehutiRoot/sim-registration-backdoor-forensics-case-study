package th.p047co.dtac.android.dtacone.model.profile;

import androidx.compose.runtime.internal.StabilityInferred;
import com.google.gson.annotations.SerializedName;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

@StabilityInferred(parameters = 0)
@Metadata(m29143d1 = {"\u0000\"\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0012\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\b\u0087\b\u0018\u00002\u00020\u0001B-\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0003\u0012\u0006\u0010\u0005\u001a\u00020\u0003\u0012\u0006\u0010\u0006\u001a\u00020\u0003\u0012\u0006\u0010\u0007\u001a\u00020\u0003¢\u0006\u0002\u0010\bJ\t\u0010\u000f\u001a\u00020\u0003HÆ\u0003J\t\u0010\u0010\u001a\u00020\u0003HÆ\u0003J\t\u0010\u0011\u001a\u00020\u0003HÆ\u0003J\t\u0010\u0012\u001a\u00020\u0003HÆ\u0003J\t\u0010\u0013\u001a\u00020\u0003HÆ\u0003J;\u0010\u0014\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u00032\b\b\u0002\u0010\u0004\u001a\u00020\u00032\b\b\u0002\u0010\u0005\u001a\u00020\u00032\b\b\u0002\u0010\u0006\u001a\u00020\u00032\b\b\u0002\u0010\u0007\u001a\u00020\u0003HÆ\u0001J\u0013\u0010\u0015\u001a\u00020\u00162\b\u0010\u0017\u001a\u0004\u0018\u00010\u0001HÖ\u0003J\t\u0010\u0018\u001a\u00020\u0019HÖ\u0001J\t\u0010\u001a\u001a\u00020\u0003HÖ\u0001R\u0016\u0010\u0002\u001a\u00020\u00038\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b\t\u0010\nR\u0016\u0010\u0004\u001a\u00020\u00038\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u000b\u0010\nR\u0016\u0010\u0005\u001a\u00020\u00038\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b\f\u0010\nR\u0016\u0010\u0006\u001a\u00020\u00038\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b\r\u0010\nR\u0016\u0010\u0007\u001a\u00020\u00038\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u000e\u0010\n¨\u0006\u001b"}, m29142d2 = {"Lth/co/dtac/android/dtacone/model/profile/Permission;", "", "allow", "", "code", "descriptionEN", "descriptionTH", "name", "(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)V", "getAllow", "()Ljava/lang/String;", "getCode", "getDescriptionEN", "getDescriptionTH", "getName", "component1", "component2", "component3", "component4", "component5", "copy", "equals", "", "other", "hashCode", "", "toString", "app_prodRelease"}, m29141k = 1, m29140mv = {1, 8, 0}, m29138xi = 48)
/* renamed from: th.co.dtac.android.dtacone.model.profile.Permission */
/* loaded from: classes8.dex */
public final class Permission {
    public static final int $stable = 0;
    @SerializedName("allow")
    @NotNull
    private final String allow;
    @SerializedName("code")
    @NotNull
    private final String code;
    @SerializedName("descriptionEN")
    @NotNull
    private final String descriptionEN;
    @SerializedName("descriptionTH")
    @NotNull
    private final String descriptionTH;
    @SerializedName("name")
    @NotNull
    private final String name;

    public Permission(@NotNull String allow, @NotNull String code, @NotNull String descriptionEN, @NotNull String descriptionTH, @NotNull String name) {
        Intrinsics.checkNotNullParameter(allow, "allow");
        Intrinsics.checkNotNullParameter(code, "code");
        Intrinsics.checkNotNullParameter(descriptionEN, "descriptionEN");
        Intrinsics.checkNotNullParameter(descriptionTH, "descriptionTH");
        Intrinsics.checkNotNullParameter(name, "name");
        this.allow = allow;
        this.code = code;
        this.descriptionEN = descriptionEN;
        this.descriptionTH = descriptionTH;
        this.name = name;
    }

    public static /* synthetic */ Permission copy$default(Permission permission, String str, String str2, String str3, String str4, String str5, int i, Object obj) {
        if ((i & 1) != 0) {
            str = permission.allow;
        }
        if ((i & 2) != 0) {
            str2 = permission.code;
        }
        String str6 = str2;
        if ((i & 4) != 0) {
            str3 = permission.descriptionEN;
        }
        String str7 = str3;
        if ((i & 8) != 0) {
            str4 = permission.descriptionTH;
        }
        String str8 = str4;
        if ((i & 16) != 0) {
            str5 = permission.name;
        }
        return permission.copy(str, str6, str7, str8, str5);
    }

    @NotNull
    public final String component1() {
        return this.allow;
    }

    @NotNull
    public final String component2() {
        return this.code;
    }

    @NotNull
    public final String component3() {
        return this.descriptionEN;
    }

    @NotNull
    public final String component4() {
        return this.descriptionTH;
    }

    @NotNull
    public final String component5() {
        return this.name;
    }

    @NotNull
    public final Permission copy(@NotNull String allow, @NotNull String code, @NotNull String descriptionEN, @NotNull String descriptionTH, @NotNull String name) {
        Intrinsics.checkNotNullParameter(allow, "allow");
        Intrinsics.checkNotNullParameter(code, "code");
        Intrinsics.checkNotNullParameter(descriptionEN, "descriptionEN");
        Intrinsics.checkNotNullParameter(descriptionTH, "descriptionTH");
        Intrinsics.checkNotNullParameter(name, "name");
        return new Permission(allow, code, descriptionEN, descriptionTH, name);
    }

    public boolean equals(@Nullable Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj instanceof Permission) {
            Permission permission = (Permission) obj;
            return Intrinsics.areEqual(this.allow, permission.allow) && Intrinsics.areEqual(this.code, permission.code) && Intrinsics.areEqual(this.descriptionEN, permission.descriptionEN) && Intrinsics.areEqual(this.descriptionTH, permission.descriptionTH) && Intrinsics.areEqual(this.name, permission.name);
        }
        return false;
    }

    @NotNull
    public final String getAllow() {
        return this.allow;
    }

    @NotNull
    public final String getCode() {
        return this.code;
    }

    @NotNull
    public final String getDescriptionEN() {
        return this.descriptionEN;
    }

    @NotNull
    public final String getDescriptionTH() {
        return this.descriptionTH;
    }

    @NotNull
    public final String getName() {
        return this.name;
    }

    public int hashCode() {
        return (((((((this.allow.hashCode() * 31) + this.code.hashCode()) * 31) + this.descriptionEN.hashCode()) * 31) + this.descriptionTH.hashCode()) * 31) + this.name.hashCode();
    }

    @NotNull
    public String toString() {
        String str = this.allow;
        String str2 = this.code;
        String str3 = this.descriptionEN;
        String str4 = this.descriptionTH;
        String str5 = this.name;
        return "Permission(allow=" + str + ", code=" + str2 + ", descriptionEN=" + str3 + ", descriptionTH=" + str4 + ", name=" + str5 + ")";
    }
}
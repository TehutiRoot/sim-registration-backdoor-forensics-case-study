package th.p047co.dtac.android.dtacone.model.newsfeed.list.response;

import androidx.autofill.HintConstants;
import androidx.compose.runtime.internal.StabilityInferred;
import com.google.gson.annotations.SerializedName;
import kotlin.Metadata;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

@StabilityInferred(parameters = 0)
@Metadata(m29143d1 = {"\u0000*\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0016\n\u0002\u0010\u000b\n\u0002\b\u0004\b\u0087\b\u0018\u00002\u00020\u0001BY\u0012\n\b\u0002\u0010\u0002\u001a\u0004\u0018\u00010\u0003\u0012\n\b\u0002\u0010\u0004\u001a\u0004\u0018\u00010\u0003\u0012\n\b\u0002\u0010\u0005\u001a\u0004\u0018\u00010\u0006\u0012\n\b\u0002\u0010\u0007\u001a\u0004\u0018\u00010\u0003\u0012\n\b\u0002\u0010\b\u001a\u0004\u0018\u00010\u0003\u0012\n\b\u0002\u0010\t\u001a\u0004\u0018\u00010\u0003\u0012\n\b\u0002\u0010\n\u001a\u0004\u0018\u00010\u000b¢\u0006\u0002\u0010\fJ\u000b\u0010\u0018\u001a\u0004\u0018\u00010\u0003HÆ\u0003J\u000b\u0010\u0019\u001a\u0004\u0018\u00010\u0003HÆ\u0003J\u0010\u0010\u001a\u001a\u0004\u0018\u00010\u0006HÆ\u0003¢\u0006\u0002\u0010\u000eJ\u000b\u0010\u001b\u001a\u0004\u0018\u00010\u0003HÆ\u0003J\u000b\u0010\u001c\u001a\u0004\u0018\u00010\u0003HÆ\u0003J\u000b\u0010\u001d\u001a\u0004\u0018\u00010\u0003HÆ\u0003J\u000b\u0010\u001e\u001a\u0004\u0018\u00010\u000bHÆ\u0003Jb\u0010\u001f\u001a\u00020\u00002\n\b\u0002\u0010\u0002\u001a\u0004\u0018\u00010\u00032\n\b\u0002\u0010\u0004\u001a\u0004\u0018\u00010\u00032\n\b\u0002\u0010\u0005\u001a\u0004\u0018\u00010\u00062\n\b\u0002\u0010\u0007\u001a\u0004\u0018\u00010\u00032\n\b\u0002\u0010\b\u001a\u0004\u0018\u00010\u00032\n\b\u0002\u0010\t\u001a\u0004\u0018\u00010\u00032\n\b\u0002\u0010\n\u001a\u0004\u0018\u00010\u000bHÆ\u0001¢\u0006\u0002\u0010 J\u0013\u0010!\u001a\u00020\"2\b\u0010#\u001a\u0004\u0018\u00010\u0001HÖ\u0003J\t\u0010$\u001a\u00020\u0006HÖ\u0001J\t\u0010%\u001a\u00020\u0003HÖ\u0001R\u001a\u0010\u0005\u001a\u0004\u0018\u00010\u00068\u0006X\u0087\u0004¢\u0006\n\n\u0002\u0010\u000f\u001a\u0004\b\r\u0010\u000eR\u0018\u0010\u0007\u001a\u0004\u0018\u00010\u00038\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u0010\u0010\u0011R\u0018\u0010\u0002\u001a\u0004\u0018\u00010\u00038\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u0012\u0010\u0011R\u0018\u0010\n\u001a\u0004\u0018\u00010\u000b8\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u0013\u0010\u0014R\u0018\u0010\t\u001a\u0004\u0018\u00010\u00038\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u0015\u0010\u0011R\u0018\u0010\u0004\u001a\u0004\u0018\u00010\u00038\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u0016\u0010\u0011R\u0018\u0010\b\u001a\u0004\u0018\u00010\u00038\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u0017\u0010\u0011¨\u0006&"}, m29142d2 = {"Lth/co/dtac/android/dtacone/model/newsfeed/list/response/CreatedBy;", "", "firstname", "", HintConstants.AUTOFILL_HINT_PHONE, "adminId", "", "email", HintConstants.AUTOFILL_HINT_USERNAME, "lastname", "group", "Lth/co/dtac/android/dtacone/model/newsfeed/list/response/Group;", "(Ljava/lang/String;Ljava/lang/String;Ljava/lang/Integer;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Lth/co/dtac/android/dtacone/model/newsfeed/list/response/Group;)V", "getAdminId", "()Ljava/lang/Integer;", "Ljava/lang/Integer;", "getEmail", "()Ljava/lang/String;", "getFirstname", "getGroup", "()Lth/co/dtac/android/dtacone/model/newsfeed/list/response/Group;", "getLastname", "getPhone", "getUsername", "component1", "component2", "component3", "component4", "component5", "component6", "component7", "copy", "(Ljava/lang/String;Ljava/lang/String;Ljava/lang/Integer;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Lth/co/dtac/android/dtacone/model/newsfeed/list/response/Group;)Lth/co/dtac/android/dtacone/model/newsfeed/list/response/CreatedBy;", "equals", "", "other", "hashCode", "toString", "app_prodRelease"}, m29141k = 1, m29140mv = {1, 8, 0}, m29138xi = 48)
/* renamed from: th.co.dtac.android.dtacone.model.newsfeed.list.response.CreatedBy */
/* loaded from: classes8.dex */
public final class CreatedBy {
    public static final int $stable = 0;
    @SerializedName("adminId")
    @Nullable
    private final Integer adminId;
    @SerializedName("email")
    @Nullable
    private final String email;
    @SerializedName("firstname")
    @Nullable
    private final String firstname;
    @SerializedName("group")
    @Nullable
    private final Group group;
    @SerializedName("lastname")
    @Nullable
    private final String lastname;
    @SerializedName(HintConstants.AUTOFILL_HINT_PHONE)
    @Nullable
    private final String phone;
    @SerializedName(HintConstants.AUTOFILL_HINT_USERNAME)
    @Nullable
    private final String username;

    public CreatedBy() {
        this(null, null, null, null, null, null, null, 127, null);
    }

    public static /* synthetic */ CreatedBy copy$default(CreatedBy createdBy, String str, String str2, Integer num, String str3, String str4, String str5, Group group, int i, Object obj) {
        if ((i & 1) != 0) {
            str = createdBy.firstname;
        }
        if ((i & 2) != 0) {
            str2 = createdBy.phone;
        }
        String str6 = str2;
        if ((i & 4) != 0) {
            num = createdBy.adminId;
        }
        Integer num2 = num;
        if ((i & 8) != 0) {
            str3 = createdBy.email;
        }
        String str7 = str3;
        if ((i & 16) != 0) {
            str4 = createdBy.username;
        }
        String str8 = str4;
        if ((i & 32) != 0) {
            str5 = createdBy.lastname;
        }
        String str9 = str5;
        if ((i & 64) != 0) {
            group = createdBy.group;
        }
        return createdBy.copy(str, str6, num2, str7, str8, str9, group);
    }

    @Nullable
    public final String component1() {
        return this.firstname;
    }

    @Nullable
    public final String component2() {
        return this.phone;
    }

    @Nullable
    public final Integer component3() {
        return this.adminId;
    }

    @Nullable
    public final String component4() {
        return this.email;
    }

    @Nullable
    public final String component5() {
        return this.username;
    }

    @Nullable
    public final String component6() {
        return this.lastname;
    }

    @Nullable
    public final Group component7() {
        return this.group;
    }

    @NotNull
    public final CreatedBy copy(@Nullable String str, @Nullable String str2, @Nullable Integer num, @Nullable String str3, @Nullable String str4, @Nullable String str5, @Nullable Group group) {
        return new CreatedBy(str, str2, num, str3, str4, str5, group);
    }

    public boolean equals(@Nullable Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj instanceof CreatedBy) {
            CreatedBy createdBy = (CreatedBy) obj;
            return Intrinsics.areEqual(this.firstname, createdBy.firstname) && Intrinsics.areEqual(this.phone, createdBy.phone) && Intrinsics.areEqual(this.adminId, createdBy.adminId) && Intrinsics.areEqual(this.email, createdBy.email) && Intrinsics.areEqual(this.username, createdBy.username) && Intrinsics.areEqual(this.lastname, createdBy.lastname) && Intrinsics.areEqual(this.group, createdBy.group);
        }
        return false;
    }

    @Nullable
    public final Integer getAdminId() {
        return this.adminId;
    }

    @Nullable
    public final String getEmail() {
        return this.email;
    }

    @Nullable
    public final String getFirstname() {
        return this.firstname;
    }

    @Nullable
    public final Group getGroup() {
        return this.group;
    }

    @Nullable
    public final String getLastname() {
        return this.lastname;
    }

    @Nullable
    public final String getPhone() {
        return this.phone;
    }

    @Nullable
    public final String getUsername() {
        return this.username;
    }

    public int hashCode() {
        String str = this.firstname;
        int hashCode = (str == null ? 0 : str.hashCode()) * 31;
        String str2 = this.phone;
        int hashCode2 = (hashCode + (str2 == null ? 0 : str2.hashCode())) * 31;
        Integer num = this.adminId;
        int hashCode3 = (hashCode2 + (num == null ? 0 : num.hashCode())) * 31;
        String str3 = this.email;
        int hashCode4 = (hashCode3 + (str3 == null ? 0 : str3.hashCode())) * 31;
        String str4 = this.username;
        int hashCode5 = (hashCode4 + (str4 == null ? 0 : str4.hashCode())) * 31;
        String str5 = this.lastname;
        int hashCode6 = (hashCode5 + (str5 == null ? 0 : str5.hashCode())) * 31;
        Group group = this.group;
        return hashCode6 + (group != null ? group.hashCode() : 0);
    }

    @NotNull
    public String toString() {
        String str = this.firstname;
        String str2 = this.phone;
        Integer num = this.adminId;
        String str3 = this.email;
        String str4 = this.username;
        String str5 = this.lastname;
        Group group = this.group;
        return "CreatedBy(firstname=" + str + ", phone=" + str2 + ", adminId=" + num + ", email=" + str3 + ", username=" + str4 + ", lastname=" + str5 + ", group=" + group + ")";
    }

    public CreatedBy(@Nullable String str, @Nullable String str2, @Nullable Integer num, @Nullable String str3, @Nullable String str4, @Nullable String str5, @Nullable Group group) {
        this.firstname = str;
        this.phone = str2;
        this.adminId = num;
        this.email = str3;
        this.username = str4;
        this.lastname = str5;
        this.group = group;
    }

    public /* synthetic */ CreatedBy(String str, String str2, Integer num, String str3, String str4, String str5, Group group, int i, DefaultConstructorMarker defaultConstructorMarker) {
        this((i & 1) != 0 ? null : str, (i & 2) != 0 ? null : str2, (i & 4) != 0 ? null : num, (i & 8) != 0 ? null : str3, (i & 16) != 0 ? null : str4, (i & 32) != 0 ? null : str5, (i & 64) != 0 ? null : group);
    }
}
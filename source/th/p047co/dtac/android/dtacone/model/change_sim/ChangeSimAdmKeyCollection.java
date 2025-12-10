package th.p047co.dtac.android.dtacone.model.change_sim;

import androidx.compose.runtime.internal.StabilityInferred;
import com.google.gson.annotations.SerializedName;
import kotlin.Metadata;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

@StabilityInferred(parameters = 0)
@Metadata(m28851d1 = {"\u0000\"\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0010\u000b\n\u0002\b\u000f\n\u0002\u0010\b\n\u0002\b\u0002\b\u0087\b\u0018\u00002\u00020\u0001B)\u0012\n\b\u0002\u0010\u0002\u001a\u0004\u0018\u00010\u0003\u0012\n\b\u0002\u0010\u0004\u001a\u0004\u0018\u00010\u0003\u0012\n\b\u0002\u0010\u0005\u001a\u0004\u0018\u00010\u0006¢\u0006\u0002\u0010\u0007J\u000b\u0010\u000e\u001a\u0004\u0018\u00010\u0003HÆ\u0003J\u000b\u0010\u000f\u001a\u0004\u0018\u00010\u0003HÆ\u0003J\u0010\u0010\u0010\u001a\u0004\u0018\u00010\u0006HÆ\u0003¢\u0006\u0002\u0010\tJ2\u0010\u0011\u001a\u00020\u00002\n\b\u0002\u0010\u0002\u001a\u0004\u0018\u00010\u00032\n\b\u0002\u0010\u0004\u001a\u0004\u0018\u00010\u00032\n\b\u0002\u0010\u0005\u001a\u0004\u0018\u00010\u0006HÆ\u0001¢\u0006\u0002\u0010\u0012J\u0013\u0010\u0013\u001a\u00020\u00062\b\u0010\u0014\u001a\u0004\u0018\u00010\u0001HÖ\u0003J\t\u0010\u0015\u001a\u00020\u0016HÖ\u0001J\t\u0010\u0017\u001a\u00020\u0003HÖ\u0001R\u001a\u0010\u0005\u001a\u0004\u0018\u00010\u00068\u0006X\u0087\u0004¢\u0006\n\n\u0002\u0010\n\u001a\u0004\b\b\u0010\tR\u0018\u0010\u0002\u001a\u0004\u0018\u00010\u00038\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u000b\u0010\fR\u0018\u0010\u0004\u001a\u0004\u0018\u00010\u00038\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b\r\u0010\f¨\u0006\u0018"}, m28850d2 = {"Lth/co/dtac/android/dtacone/model/change_sim/ChangeSimAdmKeyCollection;", "", "encryptAdm", "", "imsiNumber", "duplicate", "", "(Ljava/lang/String;Ljava/lang/String;Ljava/lang/Boolean;)V", "getDuplicate", "()Ljava/lang/Boolean;", "Ljava/lang/Boolean;", "getEncryptAdm", "()Ljava/lang/String;", "getImsiNumber", "component1", "component2", "component3", "copy", "(Ljava/lang/String;Ljava/lang/String;Ljava/lang/Boolean;)Lth/co/dtac/android/dtacone/model/change_sim/ChangeSimAdmKeyCollection;", "equals", "other", "hashCode", "", "toString", "app_prodRelease"}, m28849k = 1, m28848mv = {1, 8, 0}, m28846xi = 48)
/* renamed from: th.co.dtac.android.dtacone.model.change_sim.ChangeSimAdmKeyCollection */
/* loaded from: classes8.dex */
public final class ChangeSimAdmKeyCollection {
    public static final int $stable = 0;
    @SerializedName("duplicate")
    @Nullable
    private final Boolean duplicate;
    @SerializedName("encryptAdm")
    @Nullable
    private final String encryptAdm;
    @SerializedName("imsiNumber")
    @Nullable
    private final String imsiNumber;

    public ChangeSimAdmKeyCollection() {
        this(null, null, null, 7, null);
    }

    public static /* synthetic */ ChangeSimAdmKeyCollection copy$default(ChangeSimAdmKeyCollection changeSimAdmKeyCollection, String str, String str2, Boolean bool, int i, Object obj) {
        if ((i & 1) != 0) {
            str = changeSimAdmKeyCollection.encryptAdm;
        }
        if ((i & 2) != 0) {
            str2 = changeSimAdmKeyCollection.imsiNumber;
        }
        if ((i & 4) != 0) {
            bool = changeSimAdmKeyCollection.duplicate;
        }
        return changeSimAdmKeyCollection.copy(str, str2, bool);
    }

    @Nullable
    public final String component1() {
        return this.encryptAdm;
    }

    @Nullable
    public final String component2() {
        return this.imsiNumber;
    }

    @Nullable
    public final Boolean component3() {
        return this.duplicate;
    }

    @NotNull
    public final ChangeSimAdmKeyCollection copy(@Nullable String str, @Nullable String str2, @Nullable Boolean bool) {
        return new ChangeSimAdmKeyCollection(str, str2, bool);
    }

    public boolean equals(@Nullable Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj instanceof ChangeSimAdmKeyCollection) {
            ChangeSimAdmKeyCollection changeSimAdmKeyCollection = (ChangeSimAdmKeyCollection) obj;
            return Intrinsics.areEqual(this.encryptAdm, changeSimAdmKeyCollection.encryptAdm) && Intrinsics.areEqual(this.imsiNumber, changeSimAdmKeyCollection.imsiNumber) && Intrinsics.areEqual(this.duplicate, changeSimAdmKeyCollection.duplicate);
        }
        return false;
    }

    @Nullable
    public final Boolean getDuplicate() {
        return this.duplicate;
    }

    @Nullable
    public final String getEncryptAdm() {
        return this.encryptAdm;
    }

    @Nullable
    public final String getImsiNumber() {
        return this.imsiNumber;
    }

    public int hashCode() {
        String str = this.encryptAdm;
        int hashCode = (str == null ? 0 : str.hashCode()) * 31;
        String str2 = this.imsiNumber;
        int hashCode2 = (hashCode + (str2 == null ? 0 : str2.hashCode())) * 31;
        Boolean bool = this.duplicate;
        return hashCode2 + (bool != null ? bool.hashCode() : 0);
    }

    @NotNull
    public String toString() {
        String str = this.encryptAdm;
        String str2 = this.imsiNumber;
        Boolean bool = this.duplicate;
        return "ChangeSimAdmKeyCollection(encryptAdm=" + str + ", imsiNumber=" + str2 + ", duplicate=" + bool + ")";
    }

    public ChangeSimAdmKeyCollection(@Nullable String str, @Nullable String str2, @Nullable Boolean bool) {
        this.encryptAdm = str;
        this.imsiNumber = str2;
        this.duplicate = bool;
    }

    public /* synthetic */ ChangeSimAdmKeyCollection(String str, String str2, Boolean bool, int i, DefaultConstructorMarker defaultConstructorMarker) {
        this((i & 1) != 0 ? null : str, (i & 2) != 0 ? null : str2, (i & 4) != 0 ? null : bool);
    }
}

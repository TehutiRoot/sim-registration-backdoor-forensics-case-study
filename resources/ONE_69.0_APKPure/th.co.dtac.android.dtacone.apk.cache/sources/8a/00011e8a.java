package th.p047co.dtac.android.dtacone.model.inactive_user;

import androidx.compose.runtime.internal.StabilityInferred;
import com.google.gson.annotations.SerializedName;
import java.util.List;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import th.p047co.dtac.android.dtacone.util.Constant;

@StabilityInferred(parameters = 0)
@Metadata(m29143d1 = {"\u0000\u0012\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0005\b\u0007\u0018\u00002\u00020\u0001:\u0001\u0007B\r\u0012\u0006\u0010\u0002\u001a\u00020\u0003¢\u0006\u0002\u0010\u0004R\u0016\u0010\u0002\u001a\u00020\u00038\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u0005\u0010\u0006¨\u0006\b"}, m29142d2 = {"Lth/co/dtac/android/dtacone/model/inactive_user/OwnerDetailCollection;", "", Constant.REGISTER_LEVEL_OWNER, "Lth/co/dtac/android/dtacone/model/inactive_user/OwnerDetailCollection$Owner;", "(Lth/co/dtac/android/dtacone/model/inactive_user/OwnerDetailCollection$Owner;)V", "getOwner", "()Lth/co/dtac/android/dtacone/model/inactive_user/OwnerDetailCollection$Owner;", "Owner", "app_prodRelease"}, m29141k = 1, m29140mv = {1, 8, 0}, m29138xi = 48)
/* renamed from: th.co.dtac.android.dtacone.model.inactive_user.OwnerDetailCollection */
/* loaded from: classes8.dex */
public final class OwnerDetailCollection {
    public static final int $stable = 8;
    @SerializedName(Constant.REGISTER_LEVEL_OWNER)
    @NotNull
    private final Owner owner;

    @StabilityInferred(parameters = 0)
    @Metadata(m29143d1 = {"\u0000(\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0010\b\n\u0002\b\u0005\n\u0002\u0010\u000e\n\u0002\b\u0005\b\u0007\u0018\u00002\u00020\u0001B\u0005¢\u0006\u0002\u0010\u0002R$\u0010\u0003\u001a\b\u0012\u0004\u0012\u00020\u00050\u00048\u0006@\u0006X\u0087.¢\u0006\u000e\n\u0000\u001a\u0004\b\u0006\u0010\u0007\"\u0004\b\b\u0010\tR\u001e\u0010\n\u001a\u00020\u000b8\u0006@\u0006X\u0087\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\f\u0010\r\"\u0004\b\u000e\u0010\u000fR\u001e\u0010\u0010\u001a\u00020\u00118\u0006@\u0006X\u0087.¢\u0006\u000e\n\u0000\u001a\u0004\b\u0012\u0010\u0013\"\u0004\b\u0014\u0010\u0015¨\u0006\u0016"}, m29142d2 = {"Lth/co/dtac/android/dtacone/model/inactive_user/OwnerDetailCollection$Owner;", "", "()V", "lastTransactions", "", "Lth/co/dtac/android/dtacone/model/inactive_user/InactiveOwnerTransectionCollection;", "getLastTransactions", "()Ljava/util/List;", "setLastTransactions", "(Ljava/util/List;)V", "mrtrUserId", "", "getMrtrUserId", "()I", "setMrtrUserId", "(I)V", "userId", "", "getUserId", "()Ljava/lang/String;", "setUserId", "(Ljava/lang/String;)V", "app_prodRelease"}, m29141k = 1, m29140mv = {1, 8, 0}, m29138xi = 48)
    /* renamed from: th.co.dtac.android.dtacone.model.inactive_user.OwnerDetailCollection$Owner */
    /* loaded from: classes8.dex */
    public static final class Owner {
        public static final int $stable = 8;
        @SerializedName("lastTransactions")
        public List<InactiveOwnerTransectionCollection> lastTransactions;
        @SerializedName("mrtrUserId")
        private int mrtrUserId;
        @SerializedName("userId")
        public String userId;

        @NotNull
        public final List<InactiveOwnerTransectionCollection> getLastTransactions() {
            List<InactiveOwnerTransectionCollection> list = this.lastTransactions;
            if (list != null) {
                return list;
            }
            Intrinsics.throwUninitializedPropertyAccessException("lastTransactions");
            return null;
        }

        public final int getMrtrUserId() {
            return this.mrtrUserId;
        }

        @NotNull
        public final String getUserId() {
            String str = this.userId;
            if (str != null) {
                return str;
            }
            Intrinsics.throwUninitializedPropertyAccessException("userId");
            return null;
        }

        public final void setLastTransactions(@NotNull List<InactiveOwnerTransectionCollection> list) {
            Intrinsics.checkNotNullParameter(list, "<set-?>");
            this.lastTransactions = list;
        }

        public final void setMrtrUserId(int i) {
            this.mrtrUserId = i;
        }

        public final void setUserId(@NotNull String str) {
            Intrinsics.checkNotNullParameter(str, "<set-?>");
            this.userId = str;
        }
    }

    public OwnerDetailCollection(@NotNull Owner owner) {
        Intrinsics.checkNotNullParameter(owner, "owner");
        this.owner = owner;
    }

    @NotNull
    public final Owner getOwner() {
        return this.owner;
    }
}
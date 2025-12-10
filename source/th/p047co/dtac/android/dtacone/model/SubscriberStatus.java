package th.p047co.dtac.android.dtacone.model;

import androidx.core.app.NotificationCompat;
import kotlin.Metadata;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import kotlinx.coroutines.debug.internal.DebugCoroutineInfoImplKt;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

@Metadata(m28851d1 = {"\u0000\u0012\n\u0002\u0018\u0002\n\u0002\u0010\u0010\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0007\b\u0086\u0001\u0018\u0000 \t2\b\u0012\u0004\u0012\u00020\u00000\u0001:\u0001\tB\u000f\b\u0002\u0012\u0006\u0010\u0002\u001a\u00020\u0003¢\u0006\u0002\u0010\u0004R\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0005\u0010\u0006j\u0002\b\u0007j\u0002\b\b¨\u0006\n"}, m28850d2 = {"Lth/co/dtac/android/dtacone/model/SubscriberStatus;", "", NotificationCompat.CATEGORY_STATUS, "", "(Ljava/lang/String;ILjava/lang/String;)V", "getStatus", "()Ljava/lang/String;", "ACTIVE", DebugCoroutineInfoImplKt.SUSPENDED, "Companion", "app_prodRelease"}, m28849k = 1, m28848mv = {1, 8, 0}, m28846xi = 48)
/* renamed from: th.co.dtac.android.dtacone.model.SubscriberStatus */
/* loaded from: classes8.dex */
public enum SubscriberStatus {
    ACTIVE("A"),
    SUSPENDED("S");
    
    @NotNull
    public static final Companion Companion = new Companion(null);
    @NotNull
    private final String status;

    @Metadata(m28851d1 = {"\u0000\u0018\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0000\b\u0086\u0003\u0018\u00002\u00020\u0001B\u0007\b\u0002¢\u0006\u0002\u0010\u0002J\u0010\u0010\u0003\u001a\u0004\u0018\u00010\u00042\u0006\u0010\u0005\u001a\u00020\u0006¨\u0006\u0007"}, m28850d2 = {"Lth/co/dtac/android/dtacone/model/SubscriberStatus$Companion;", "", "()V", "fromValue", "Lth/co/dtac/android/dtacone/model/SubscriberStatus;", NotificationCompat.CATEGORY_STATUS, "", "app_prodRelease"}, m28849k = 1, m28848mv = {1, 8, 0}, m28846xi = 48)
    /* renamed from: th.co.dtac.android.dtacone.model.SubscriberStatus$Companion */
    /* loaded from: classes8.dex */
    public static final class Companion {
        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        @Nullable
        public final SubscriberStatus fromValue(@NotNull String status) {
            Intrinsics.checkNotNullParameter(status, "status");
            if (Intrinsics.areEqual(status, "A")) {
                return SubscriberStatus.ACTIVE;
            }
            if (Intrinsics.areEqual(status, "S")) {
                return SubscriberStatus.SUSPENDED;
            }
            return null;
        }

        private Companion() {
        }
    }

    SubscriberStatus(String str) {
        this.status = str;
    }

    @NotNull
    public final String getStatus() {
        return this.status;
    }
}

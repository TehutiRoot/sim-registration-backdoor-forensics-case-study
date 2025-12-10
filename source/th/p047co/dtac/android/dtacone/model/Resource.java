package th.p047co.dtac.android.dtacone.model;

import androidx.compose.runtime.internal.StabilityInferred;
import androidx.core.app.NotificationCompat;
import com.google.firebase.analytics.FirebaseAnalytics;
import com.google.firebase.messaging.Constants;
import kotlin.Metadata;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

@StabilityInferred(parameters = 0)
@Metadata(m28851d1 = {"\u0000*\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\b\n\u0002\b\u0005\n\u0002\u0010\u000b\n\u0002\b\u0016\b\u0087\b\u0018\u0000 $*\u0006\b\u0000\u0010\u0001 \u00012\u00020\u0002:\u0001$B+\u0012\u0006\u0010\u0003\u001a\u00020\u0004\u0012\b\u0010\u0005\u001a\u0004\u0018\u00018\u0000\u0012\b\u0010\u0006\u001a\u0004\u0018\u00010\u0007\u0012\b\u0010\b\u001a\u0004\u0018\u00010\t¢\u0006\u0002\u0010\nJ\t\u0010\u0018\u001a\u00020\u0004HÆ\u0003J\u0010\u0010\u0019\u001a\u0004\u0018\u00018\u0000HÆ\u0003¢\u0006\u0002\u0010\fJ\u000b\u0010\u001a\u001a\u0004\u0018\u00010\u0007HÆ\u0003J\u0010\u0010\u001b\u001a\u0004\u0018\u00010\tHÆ\u0003¢\u0006\u0002\u0010\u0014JB\u0010\u001c\u001a\b\u0012\u0004\u0012\u00028\u00000\u00002\b\b\u0002\u0010\u0003\u001a\u00020\u00042\n\b\u0002\u0010\u0005\u001a\u0004\u0018\u00018\u00002\n\b\u0002\u0010\u0006\u001a\u0004\u0018\u00010\u00072\n\b\u0002\u0010\b\u001a\u0004\u0018\u00010\tHÆ\u0001¢\u0006\u0002\u0010\u001dJ\u0013\u0010\u001e\u001a\u00020\u000f2\b\u0010\u001f\u001a\u0004\u0018\u00010\u0002HÖ\u0003J\u000e\u0010 \u001a\n\u0012\u0004\u0012\u00028\u0000\u0018\u00010\u0000J\t\u0010!\u001a\u00020\tHÖ\u0001J\f\u0010\"\u001a\b\u0012\u0004\u0012\u00028\u00000\u0000J\t\u0010#\u001a\u00020\u0007HÖ\u0001R\u0015\u0010\u0005\u001a\u0004\u0018\u00018\u0000¢\u0006\n\n\u0002\u0010\r\u001a\u0004\b\u000b\u0010\fR\u0018\u0010\u0010\u001a\u00020\u000f2\u0006\u0010\u000e\u001a\u00020\u000f@BX\u0082\u000e¢\u0006\u0002\n\u0000R\u0013\u0010\u0006\u001a\u0004\u0018\u00010\u0007¢\u0006\b\n\u0000\u001a\u0004\b\u0011\u0010\u0012R\u0015\u0010\b\u001a\u0004\u0018\u00010\t¢\u0006\n\n\u0002\u0010\u0015\u001a\u0004\b\u0013\u0010\u0014R\u0011\u0010\u0003\u001a\u00020\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u0016\u0010\u0017¨\u0006%"}, m28850d2 = {"Lth/co/dtac/android/dtacone/model/Resource;", "T", "", NotificationCompat.CATEGORY_STATUS, "Lth/co/dtac/android/dtacone/model/StatusResource;", "data", "message", "", "messageId", "", "(Lth/co/dtac/android/dtacone/model/StatusResource;Ljava/lang/Object;Ljava/lang/String;Ljava/lang/Integer;)V", "getData", "()Ljava/lang/Object;", "Ljava/lang/Object;", "<set-?>", "", "hasBeenHandled", "getMessage", "()Ljava/lang/String;", "getMessageId", "()Ljava/lang/Integer;", "Ljava/lang/Integer;", "getStatus", "()Lth/co/dtac/android/dtacone/model/StatusResource;", "component1", "component2", "component3", "component4", "copy", "(Lth/co/dtac/android/dtacone/model/StatusResource;Ljava/lang/Object;Ljava/lang/String;Ljava/lang/Integer;)Lth/co/dtac/android/dtacone/model/Resource;", "equals", "other", "getResourceContentIfNotHandled", "hashCode", "peekContent", "toString", "Companion", "app_prodRelease"}, m28849k = 1, m28848mv = {1, 8, 0}, m28846xi = 48)
/* renamed from: th.co.dtac.android.dtacone.model.Resource */
/* loaded from: classes8.dex */
public final class Resource<T> {
    @Nullable
    private final T data;
    private boolean hasBeenHandled;
    @Nullable
    private final String message;
    @Nullable
    private final Integer messageId;
    @NotNull
    private final StatusResource status;
    @NotNull
    public static final Companion Companion = new Companion(null);
    public static final int $stable = 8;

    @Metadata(m28851d1 = {"\u0000$\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0005\b\u0086\u0003\u0018\u00002\u00020\u0001B\u0007\b\u0002¢\u0006\u0002\u0010\u0002J5\u0010\u0003\u001a\b\u0012\u0004\u0012\u0002H\u00050\u0004\"\u0004\b\u0001\u0010\u00052\u0006\u0010\u0006\u001a\u00020\u00072\b\u0010\b\u001a\u0004\u0018\u0001H\u00052\n\b\u0002\u0010\t\u001a\u0004\u0018\u00010\n¢\u0006\u0002\u0010\u000bJ!\u0010\f\u001a\b\u0012\u0004\u0012\u0002H\u00050\u0004\"\u0004\b\u0001\u0010\u00052\b\u0010\b\u001a\u0004\u0018\u0001H\u0005¢\u0006\u0002\u0010\rJ!\u0010\u000e\u001a\b\u0012\u0004\u0012\u0002H\u00050\u0004\"\u0004\b\u0001\u0010\u00052\b\u0010\b\u001a\u0004\u0018\u0001H\u0005¢\u0006\u0002\u0010\r¨\u0006\u000f"}, m28850d2 = {"Lth/co/dtac/android/dtacone/model/Resource$Companion;", "", "()V", Constants.IPC_BUNDLE_KEY_SEND_ERROR, "Lth/co/dtac/android/dtacone/model/Resource;", "T", NotificationCompat.CATEGORY_MESSAGE, "", "data", "msgId", "", "(Ljava/lang/String;Ljava/lang/Object;Ljava/lang/Integer;)Lth/co/dtac/android/dtacone/model/Resource;", "loading", "(Ljava/lang/Object;)Lth/co/dtac/android/dtacone/model/Resource;", FirebaseAnalytics.Param.SUCCESS, "app_prodRelease"}, m28849k = 1, m28848mv = {1, 8, 0}, m28846xi = 48)
    /* renamed from: th.co.dtac.android.dtacone.model.Resource$Companion */
    /* loaded from: classes8.dex */
    public static final class Companion {
        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        public static /* synthetic */ Resource error$default(Companion companion, String str, Object obj, Integer num, int i, Object obj2) {
            if ((i & 4) != 0) {
                num = 0;
            }
            return companion.error(str, obj, num);
        }

        @NotNull
        public final <T> Resource<T> error(@NotNull String msg, @Nullable T t, @Nullable Integer num) {
            Intrinsics.checkNotNullParameter(msg, "msg");
            return new Resource<>(StatusResource.ERROR, t, msg, num);
        }

        @NotNull
        public final <T> Resource<T> loading(@Nullable T t) {
            return new Resource<>(StatusResource.LOADING, t, null, null);
        }

        @NotNull
        public final <T> Resource<T> success(@Nullable T t) {
            return new Resource<>(StatusResource.SUCCESS, t, null, null);
        }

        private Companion() {
        }
    }

    public Resource(@NotNull StatusResource status, @Nullable T t, @Nullable String str, @Nullable Integer num) {
        Intrinsics.checkNotNullParameter(status, "status");
        this.status = status;
        this.data = t;
        this.message = str;
        this.messageId = num;
    }

    /* JADX WARN: Multi-variable type inference failed */
    public static /* synthetic */ Resource copy$default(Resource resource, StatusResource statusResource, Object obj, String str, Integer num, int i, Object obj2) {
        if ((i & 1) != 0) {
            statusResource = resource.status;
        }
        if ((i & 2) != 0) {
            obj = resource.data;
        }
        if ((i & 4) != 0) {
            str = resource.message;
        }
        if ((i & 8) != 0) {
            num = resource.messageId;
        }
        return resource.copy(statusResource, obj, str, num);
    }

    @NotNull
    public final StatusResource component1() {
        return this.status;
    }

    @Nullable
    public final T component2() {
        return this.data;
    }

    @Nullable
    public final String component3() {
        return this.message;
    }

    @Nullable
    public final Integer component4() {
        return this.messageId;
    }

    @NotNull
    public final Resource<T> copy(@NotNull StatusResource status, @Nullable T t, @Nullable String str, @Nullable Integer num) {
        Intrinsics.checkNotNullParameter(status, "status");
        return new Resource<>(status, t, str, num);
    }

    public boolean equals(@Nullable Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj instanceof Resource) {
            Resource resource = (Resource) obj;
            return this.status == resource.status && Intrinsics.areEqual(this.data, resource.data) && Intrinsics.areEqual(this.message, resource.message) && Intrinsics.areEqual(this.messageId, resource.messageId);
        }
        return false;
    }

    @Nullable
    public final T getData() {
        return this.data;
    }

    @Nullable
    public final String getMessage() {
        return this.message;
    }

    @Nullable
    public final Integer getMessageId() {
        return this.messageId;
    }

    @Nullable
    public final Resource<T> getResourceContentIfNotHandled() {
        if (this.hasBeenHandled) {
            return null;
        }
        this.hasBeenHandled = true;
        return this;
    }

    @NotNull
    public final StatusResource getStatus() {
        return this.status;
    }

    public int hashCode() {
        int hashCode = this.status.hashCode() * 31;
        T t = this.data;
        int hashCode2 = (hashCode + (t == null ? 0 : t.hashCode())) * 31;
        String str = this.message;
        int hashCode3 = (hashCode2 + (str == null ? 0 : str.hashCode())) * 31;
        Integer num = this.messageId;
        return hashCode3 + (num != null ? num.hashCode() : 0);
    }

    @NotNull
    public final Resource<T> peekContent() {
        return this;
    }

    @NotNull
    public String toString() {
        StatusResource statusResource = this.status;
        T t = this.data;
        String str = this.message;
        Integer num = this.messageId;
        return "Resource(status=" + statusResource + ", data=" + t + ", message=" + str + ", messageId=" + num + ")";
    }
}

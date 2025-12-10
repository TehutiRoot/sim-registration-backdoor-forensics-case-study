package th.p047co.dtac.android.dtacone.model.messaging;

import androidx.compose.runtime.internal.StabilityInferred;
import com.google.gson.annotations.SerializedName;
import java.util.Map;
import kotlin.Metadata;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

@StabilityInferred(parameters = 0)
@Metadata(m29143d1 = {"\u0000&\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010$\n\u0002\u0010\u000e\n\u0002\b\u0007\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\b\u0087\b\u0018\u00002\u00020\u0001B\u001d\u0012\u0016\b\u0002\u0010\u0002\u001a\u0010\u0012\u0004\u0012\u00020\u0004\u0012\u0004\u0012\u00020\u0001\u0018\u00010\u0003¢\u0006\u0002\u0010\u0005J\u0017\u0010\t\u001a\u0010\u0012\u0004\u0012\u00020\u0004\u0012\u0004\u0012\u00020\u0001\u0018\u00010\u0003HÆ\u0003J!\u0010\n\u001a\u00020\u00002\u0016\b\u0002\u0010\u0002\u001a\u0010\u0012\u0004\u0012\u00020\u0004\u0012\u0004\u0012\u00020\u0001\u0018\u00010\u0003HÆ\u0001J\u0013\u0010\u000b\u001a\u00020\f2\b\u0010\r\u001a\u0004\u0018\u00010\u0001HÖ\u0003J\t\u0010\u000e\u001a\u00020\u000fHÖ\u0001J\t\u0010\u0010\u001a\u00020\u0004HÖ\u0001R,\u0010\u0002\u001a\u0010\u0012\u0004\u0012\u00020\u0004\u0012\u0004\u0012\u00020\u0001\u0018\u00010\u00038\u0006@\u0006X\u0087\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u0006\u0010\u0007\"\u0004\b\b\u0010\u0005¨\u0006\u0011"}, m29142d2 = {"Lth/co/dtac/android/dtacone/model/messaging/FirebaseRel;", "", "topics", "", "", "(Ljava/util/Map;)V", "getTopics", "()Ljava/util/Map;", "setTopics", "component1", "copy", "equals", "", "other", "hashCode", "", "toString", "app_prodRelease"}, m29141k = 1, m29140mv = {1, 8, 0}, m29138xi = 48)
/* renamed from: th.co.dtac.android.dtacone.model.messaging.FirebaseRel */
/* loaded from: classes8.dex */
public final class FirebaseRel {
    public static final int $stable = 8;
    @SerializedName("topics")
    @Nullable
    private Map<String, ? extends Object> topics;

    public FirebaseRel() {
        this(null, 1, null);
    }

    /* JADX WARN: Multi-variable type inference failed */
    public static /* synthetic */ FirebaseRel copy$default(FirebaseRel firebaseRel, Map map, int i, Object obj) {
        if ((i & 1) != 0) {
            map = firebaseRel.topics;
        }
        return firebaseRel.copy(map);
    }

    @Nullable
    public final Map<String, Object> component1() {
        return this.topics;
    }

    @NotNull
    public final FirebaseRel copy(@Nullable Map<String, ? extends Object> map) {
        return new FirebaseRel(map);
    }

    public boolean equals(@Nullable Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof FirebaseRel) && Intrinsics.areEqual(this.topics, ((FirebaseRel) obj).topics);
    }

    @Nullable
    public final Map<String, Object> getTopics() {
        return this.topics;
    }

    public int hashCode() {
        Map<String, ? extends Object> map = this.topics;
        if (map == null) {
            return 0;
        }
        return map.hashCode();
    }

    public final void setTopics(@Nullable Map<String, ? extends Object> map) {
        this.topics = map;
    }

    @NotNull
    public String toString() {
        Map<String, ? extends Object> map = this.topics;
        return "FirebaseRel(topics=" + map + ")";
    }

    public FirebaseRel(@Nullable Map<String, ? extends Object> map) {
        this.topics = map;
    }

    public /* synthetic */ FirebaseRel(Map map, int i, DefaultConstructorMarker defaultConstructorMarker) {
        this((i & 1) != 0 ? null : map);
    }
}
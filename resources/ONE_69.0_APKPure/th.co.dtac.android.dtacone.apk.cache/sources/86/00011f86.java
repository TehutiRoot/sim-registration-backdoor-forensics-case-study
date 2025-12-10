package th.p047co.dtac.android.dtacone.model.newsfeed;

import androidx.compose.runtime.internal.StabilityInferred;
import com.google.gson.annotations.SerializedName;
import kotlin.Metadata;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

@StabilityInferred(parameters = 0)
@Metadata(m29143d1 = {"\u0000 \n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\b\n\u0002\b\t\n\u0002\u0010\u000b\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0000\b\u0087\b\u0018\u00002\u00020\u0001B\u0011\u0012\n\b\u0002\u0010\u0002\u001a\u0004\u0018\u00010\u0003¢\u0006\u0002\u0010\u0004J\u0010\u0010\t\u001a\u0004\u0018\u00010\u0003HÆ\u0003¢\u0006\u0002\u0010\u0006J\u001a\u0010\n\u001a\u00020\u00002\n\b\u0002\u0010\u0002\u001a\u0004\u0018\u00010\u0003HÆ\u0001¢\u0006\u0002\u0010\u000bJ\u0013\u0010\f\u001a\u00020\r2\b\u0010\u000e\u001a\u0004\u0018\u00010\u0001HÖ\u0003J\t\u0010\u000f\u001a\u00020\u0003HÖ\u0001J\t\u0010\u0010\u001a\u00020\u0011HÖ\u0001R\"\u0010\u0002\u001a\u0004\u0018\u00010\u00038\u0006@\u0006X\u0087\u000e¢\u0006\u0010\n\u0002\u0010\b\u001a\u0004\b\u0005\u0010\u0006\"\u0004\b\u0007\u0010\u0004¨\u0006\u0012"}, m29142d2 = {"Lth/co/dtac/android/dtacone/model/newsfeed/LikeNewsRequest;", "", "newsId", "", "(Ljava/lang/Integer;)V", "getNewsId", "()Ljava/lang/Integer;", "setNewsId", "Ljava/lang/Integer;", "component1", "copy", "(Ljava/lang/Integer;)Lth/co/dtac/android/dtacone/model/newsfeed/LikeNewsRequest;", "equals", "", "other", "hashCode", "toString", "", "app_prodRelease"}, m29141k = 1, m29140mv = {1, 8, 0}, m29138xi = 48)
/* renamed from: th.co.dtac.android.dtacone.model.newsfeed.LikeNewsRequest */
/* loaded from: classes8.dex */
public final class LikeNewsRequest {
    public static final int $stable = 8;
    @SerializedName("news_id")
    @Nullable
    private Integer newsId;

    public LikeNewsRequest() {
        this(null, 1, null);
    }

    public static /* synthetic */ LikeNewsRequest copy$default(LikeNewsRequest likeNewsRequest, Integer num, int i, Object obj) {
        if ((i & 1) != 0) {
            num = likeNewsRequest.newsId;
        }
        return likeNewsRequest.copy(num);
    }

    @Nullable
    public final Integer component1() {
        return this.newsId;
    }

    @NotNull
    public final LikeNewsRequest copy(@Nullable Integer num) {
        return new LikeNewsRequest(num);
    }

    public boolean equals(@Nullable Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof LikeNewsRequest) && Intrinsics.areEqual(this.newsId, ((LikeNewsRequest) obj).newsId);
    }

    @Nullable
    public final Integer getNewsId() {
        return this.newsId;
    }

    public int hashCode() {
        Integer num = this.newsId;
        if (num == null) {
            return 0;
        }
        return num.hashCode();
    }

    public final void setNewsId(@Nullable Integer num) {
        this.newsId = num;
    }

    @NotNull
    public String toString() {
        Integer num = this.newsId;
        return "LikeNewsRequest(newsId=" + num + ")";
    }

    public LikeNewsRequest(@Nullable Integer num) {
        this.newsId = num;
    }

    public /* synthetic */ LikeNewsRequest(Integer num, int i, DefaultConstructorMarker defaultConstructorMarker) {
        this((i & 1) != 0 ? null : num);
    }
}
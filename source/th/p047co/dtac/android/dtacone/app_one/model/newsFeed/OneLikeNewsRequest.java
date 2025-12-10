package th.p047co.dtac.android.dtacone.app_one.model.newsFeed;

import androidx.compose.runtime.internal.StabilityInferred;
import com.google.gson.annotations.SerializedName;
import com.tom_roush.pdfbox.pdmodel.common.PDPageLabelRange;
import kotlin.Metadata;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

@StabilityInferred(parameters = 0)
@Metadata(m28851d1 = {"\u0000 \n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\b\n\u0002\b\u0007\n\u0002\u0010\u000e\n\u0002\b\u0005\n\u0002\u0010\u000b\n\u0002\b\u0007\b\u0087\b\u0018\u00002\u00020\u0001B\u0013\u0012\n\b\u0002\u0010\u0003\u001a\u0004\u0018\u00010\u0002¢\u0006\u0004\b\u0004\u0010\u0005J\u0012\u0010\u0006\u001a\u0004\u0018\u00010\u0002HÆ\u0003¢\u0006\u0004\b\u0006\u0010\u0007J\u001c\u0010\b\u001a\u00020\u00002\n\b\u0002\u0010\u0003\u001a\u0004\u0018\u00010\u0002HÆ\u0001¢\u0006\u0004\b\b\u0010\tJ\u0010\u0010\u000b\u001a\u00020\nHÖ\u0001¢\u0006\u0004\b\u000b\u0010\fJ\u0010\u0010\r\u001a\u00020\u0002HÖ\u0001¢\u0006\u0004\b\r\u0010\u000eJ\u001a\u0010\u0011\u001a\u00020\u00102\b\u0010\u000f\u001a\u0004\u0018\u00010\u0001HÖ\u0003¢\u0006\u0004\b\u0011\u0010\u0012R$\u0010\u0003\u001a\u0004\u0018\u00010\u00028\u0006@\u0006X\u0087\u000e¢\u0006\u0012\n\u0004\b\u0013\u0010\u0014\u001a\u0004\b\u0015\u0010\u0007\"\u0004\b\u0016\u0010\u0005¨\u0006\u0017"}, m28850d2 = {"Lth/co/dtac/android/dtacone/app_one/model/newsFeed/OneLikeNewsRequest;", "", "", "newsId", "<init>", "(Ljava/lang/Integer;)V", "component1", "()Ljava/lang/Integer;", "copy", "(Ljava/lang/Integer;)Lth/co/dtac/android/dtacone/app_one/model/newsFeed/OneLikeNewsRequest;", "", "toString", "()Ljava/lang/String;", "hashCode", "()I", "other", "", "equals", "(Ljava/lang/Object;)Z", PDPageLabelRange.STYLE_LETTERS_LOWER, "Ljava/lang/Integer;", "getNewsId", "setNewsId", "app_prodRelease"}, m28849k = 1, m28848mv = {1, 8, 0})
/* renamed from: th.co.dtac.android.dtacone.app_one.model.newsFeed.OneLikeNewsRequest */
/* loaded from: classes7.dex */
public final class OneLikeNewsRequest {
    public static final int $stable = 8;
    @SerializedName("newsId")
    @Nullable

    /* renamed from: a */
    private Integer f81702a;

    public OneLikeNewsRequest() {
        this(null, 1, null);
    }

    public static /* synthetic */ OneLikeNewsRequest copy$default(OneLikeNewsRequest oneLikeNewsRequest, Integer num, int i, Object obj) {
        if ((i & 1) != 0) {
            num = oneLikeNewsRequest.f81702a;
        }
        return oneLikeNewsRequest.copy(num);
    }

    @Nullable
    public final Integer component1() {
        return this.f81702a;
    }

    @NotNull
    public final OneLikeNewsRequest copy(@Nullable Integer num) {
        return new OneLikeNewsRequest(num);
    }

    public boolean equals(@Nullable Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof OneLikeNewsRequest) && Intrinsics.areEqual(this.f81702a, ((OneLikeNewsRequest) obj).f81702a);
    }

    @Nullable
    public final Integer getNewsId() {
        return this.f81702a;
    }

    public int hashCode() {
        Integer num = this.f81702a;
        if (num == null) {
            return 0;
        }
        return num.hashCode();
    }

    public final void setNewsId(@Nullable Integer num) {
        this.f81702a = num;
    }

    @NotNull
    public String toString() {
        Integer num = this.f81702a;
        return "OneLikeNewsRequest(newsId=" + num + ")";
    }

    public OneLikeNewsRequest(@Nullable Integer num) {
        this.f81702a = num;
    }

    public /* synthetic */ OneLikeNewsRequest(Integer num, int i, DefaultConstructorMarker defaultConstructorMarker) {
        this((i & 1) != 0 ? null : num);
    }
}

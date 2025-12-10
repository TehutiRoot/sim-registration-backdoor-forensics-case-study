package th.p047co.dtac.android.dtacone.util.constant.prepaid;

import androidx.compose.runtime.internal.StabilityInferred;
import com.tom_roush.pdfbox.pdmodel.common.PDPageLabelRange;
import java.util.List;
import kotlin.Metadata;
import kotlin.collections.CollectionsKt__CollectionsKt;
import org.jetbrains.annotations.NotNull;

@StabilityInferred(parameters = 0)
@Metadata(m29143d1 = {"\u0000\u0018\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010 \n\u0002\u0010\u000e\n\u0002\b\u0006\bÇ\u0002\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003R\u001d\u0010\n\u001a\b\u0012\u0004\u0012\u00020\u00050\u00048\u0006¢\u0006\f\n\u0004\b\u0006\u0010\u0007\u001a\u0004\b\b\u0010\t¨\u0006\u000b"}, m29142d2 = {"Lth/co/dtac/android/dtacone/util/constant/prepaid/PrepaidRetryErrorCode;", "", "<init>", "()V", "", "", PDPageLabelRange.STYLE_LETTERS_LOWER, "Ljava/util/List;", "getRETRY_CODE", "()Ljava/util/List;", "RETRY_CODE", "app_prodRelease"}, m29141k = 1, m29140mv = {1, 8, 0})
/* renamed from: th.co.dtac.android.dtacone.util.constant.prepaid.PrepaidRetryErrorCode */
/* loaded from: classes8.dex */
public final class PrepaidRetryErrorCode {
    @NotNull
    public static final PrepaidRetryErrorCode INSTANCE = new PrepaidRetryErrorCode();

    /* renamed from: a */
    public static final List f87145a = CollectionsKt__CollectionsKt.listOf((Object[]) new String[]{"230201648", "10055159"});
    public static final int $stable = 8;

    @NotNull
    public final List<String> getRETRY_CODE() {
        return f87145a;
    }
}
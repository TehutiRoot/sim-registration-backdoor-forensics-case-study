package th.p047co.dtac.android.dtacone.util;

import android.content.Context;
import androidx.compose.runtime.internal.StabilityInferred;
import ch.qos.logback.core.CoreConstants;
import com.tom_roush.pdfbox.pdmodel.common.PDPageLabelRange;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

@StabilityInferred(parameters = 0)
@Metadata(m29143d1 = {"\u0000\u0018\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0010\u000b\n\u0002\b\u0003\b\u0007\u0018\u00002\u00020\u0001B\u000f\u0012\u0006\u0010\u0003\u001a\u00020\u0002¢\u0006\u0004\b\u0004\u0010\u0005R\u0014\u0010\u0003\u001a\u00020\u00028\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0006\u0010\u0007R\u0011\u0010\t\u001a\u00020\b8F¢\u0006\u0006\u001a\u0004\b\t\u0010\n¨\u0006\u000b"}, m29142d2 = {"Lth/co/dtac/android/dtacone/util/FeatureUtil;", "", "Landroid/content/Context;", CoreConstants.CONTEXT_SCOPE_VALUE, "<init>", "(Landroid/content/Context;)V", PDPageLabelRange.STYLE_LETTERS_LOWER, "Landroid/content/Context;", "", "isTelephoneCallSupport", "()Z", "app_prodRelease"}, m29141k = 1, m29140mv = {1, 8, 0})
/* renamed from: th.co.dtac.android.dtacone.util.FeatureUtil */
/* loaded from: classes8.dex */
public final class FeatureUtil {
    public static final int $stable = 8;

    /* renamed from: a */
    public final Context f87048a;

    public FeatureUtil(@NotNull Context context) {
        Intrinsics.checkNotNullParameter(context, "context");
        this.f87048a = context;
    }

    public final boolean isTelephoneCallSupport() {
        return this.f87048a.getPackageManager().hasSystemFeature("android.hardware.telephony");
    }
}
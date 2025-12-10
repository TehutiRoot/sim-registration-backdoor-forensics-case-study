package th.p047co.dtac.android.dtacone.util;

import android.os.SystemClock;
import androidx.compose.runtime.internal.StabilityInferred;
import com.tom_roush.pdfbox.contentstream.operator.OperatorName;
import com.tom_roush.pdfbox.pdmodel.common.PDPageLabelRange;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

@StabilityInferred(parameters = 0)
@Metadata(m29143d1 = {"\u0000 \n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0002\b\u0003\n\u0002\u0010\t\n\u0002\b\u0004\b\u0007\u0018\u00002\u00020\u0001B\u0007¢\u0006\u0004\b\u0002\u0010\u0003J\u001b\u0010\u0007\u001a\u00020\u00052\f\u0010\u0006\u001a\b\u0012\u0004\u0012\u00020\u00050\u0004¢\u0006\u0004\b\u0007\u0010\bR\u0016\u0010\f\u001a\u00020\t8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b\n\u0010\u000b¨\u0006\r"}, m29142d2 = {"Lth/co/dtac/android/dtacone/util/SingleTime;", "", "<init>", "()V", "Lkotlin/Function0;", "", "dup", "run", "(Lkotlin/jvm/functions/Function0;)V", "", PDPageLabelRange.STYLE_LETTERS_LOWER, OperatorName.SET_LINE_CAPSTYLE, "lastClickTime", "app_prodRelease"}, m29141k = 1, m29140mv = {1, 8, 0})
/* renamed from: th.co.dtac.android.dtacone.util.SingleTime */
/* loaded from: classes8.dex */
public final class SingleTime {
    public static final int $stable = 8;

    /* renamed from: a */
    public long f87084a;

    public final void run(@NotNull Function0<Unit> dup) {
        Intrinsics.checkNotNullParameter(dup, "dup");
        if (SystemClock.elapsedRealtime() - this.f87084a < 1000) {
            return;
        }
        this.f87084a = SystemClock.elapsedRealtime();
        dup.invoke();
    }
}
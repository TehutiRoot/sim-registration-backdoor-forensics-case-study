package kotlinx.coroutines;

import com.tom_roush.pdfbox.contentstream.operator.OperatorName;
import com.tom_roush.pdfbox.pdmodel.common.PDPageLabelRange;
import kotlin.Metadata;
import kotlinx.coroutines.internal.MainDispatchersKt;
import kotlinx.coroutines.internal.SystemPropsKt;
import org.jetbrains.annotations.NotNull;

@Metadata(m28851d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000b\n\u0002\b\u0007\u001a\u000f\u0010\u0001\u001a\u00020\u0000H\u0002¢\u0006\u0004\b\u0001\u0010\u0002\"\u0014\u0010\u0005\u001a\u00020\u00038\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0001\u0010\u0004\"\u001a\u0010\t\u001a\u00020\u00008\u0000X\u0080\u0004¢\u0006\f\n\u0004\b\u0006\u0010\u0007\u001a\u0004\b\b\u0010\u0002¨\u0006\n"}, m28850d2 = {"Lkotlinx/coroutines/Delay;", PDPageLabelRange.STYLE_LETTERS_LOWER, "()Lkotlinx/coroutines/Delay;", "", "Z", "defaultMainDelayOptIn", OperatorName.CLOSE_FILL_NON_ZERO_AND_STROKE, "Lkotlinx/coroutines/Delay;", "getDefaultDelay", "DefaultDelay", "kotlinx-coroutines-core"}, m28849k = 2, m28848mv = {1, 8, 0})
/* loaded from: classes6.dex */
public final class DefaultExecutorKt {

    /* renamed from: a */
    public static final boolean f70593a = SystemPropsKt.systemProp("kotlinx.coroutines.main.delay", false);

    /* renamed from: b */
    public static final Delay f70594b = m27382a();

    /* renamed from: a */
    public static final Delay m27382a() {
        if (!f70593a) {
            return DefaultExecutor.INSTANCE;
        }
        MainCoroutineDispatcher main = Dispatchers.getMain();
        if (!MainDispatchersKt.isMissing(main) && (main instanceof Delay)) {
            return (Delay) main;
        }
        return DefaultExecutor.INSTANCE;
    }

    @NotNull
    public static final Delay getDefaultDelay() {
        return f70594b;
    }
}

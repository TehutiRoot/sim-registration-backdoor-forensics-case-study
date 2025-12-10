package kotlinx.coroutines;

import com.tom_roush.pdfbox.contentstream.operator.OperatorName;
import com.tom_roush.pdfbox.pdmodel.common.PDPageLabelRange;
import kotlin.Metadata;
import kotlin.jvm.JvmStatic;
import kotlinx.coroutines.internal.MainDispatcherLoader;
import kotlinx.coroutines.scheduling.DefaultIoScheduler;
import kotlinx.coroutines.scheduling.DefaultScheduler;
import org.jetbrains.annotations.NotNull;
import th.p047co.dtac.android.dtacone.util.Constant;

@Metadata(m28851d1 = {"\u0000\"\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u000e\n\u0002\u0018\u0002\n\u0002\b\u0005\bÆ\u0002\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\u000f\u0010\u0005\u001a\u00020\u0004H\u0007¢\u0006\u0004\b\u0005\u0010\u0003R \u0010\f\u001a\u00020\u00068\u0006X\u0087\u0004¢\u0006\u0012\n\u0004\b\u0007\u0010\b\u0012\u0004\b\u000b\u0010\u0003\u001a\u0004\b\t\u0010\nR \u0010\u0010\u001a\u00020\u00068\u0006X\u0087\u0004¢\u0006\u0012\n\u0004\b\r\u0010\b\u0012\u0004\b\u000f\u0010\u0003\u001a\u0004\b\u000e\u0010\nR \u0010\u0014\u001a\u00020\u00068\u0006X\u0087\u0004¢\u0006\u0012\n\u0004\b\u0011\u0010\b\u0012\u0004\b\u0013\u0010\u0003\u001a\u0004\b\u0012\u0010\nR\u001a\u0010\u0019\u001a\u00020\u00158FX\u0087\u0004¢\u0006\f\u0012\u0004\b\u0018\u0010\u0003\u001a\u0004\b\u0016\u0010\u0017¨\u0006\u001a"}, m28850d2 = {"Lkotlinx/coroutines/Dispatchers;", "", "<init>", "()V", "", "shutdown", "Lkotlinx/coroutines/CoroutineDispatcher;", PDPageLabelRange.STYLE_LETTERS_LOWER, "Lkotlinx/coroutines/CoroutineDispatcher;", "getDefault", "()Lkotlinx/coroutines/CoroutineDispatcher;", "getDefault$annotations", Constant.OnePostpaidVerifyKey.Default, OperatorName.CLOSE_FILL_NON_ZERO_AND_STROKE, "getUnconfined", "getUnconfined$annotations", "Unconfined", OperatorName.CURVE_TO, "getIO", "getIO$annotations", "IO", "Lkotlinx/coroutines/MainCoroutineDispatcher;", "getMain", "()Lkotlinx/coroutines/MainCoroutineDispatcher;", "getMain$annotations", "Main", "kotlinx-coroutines-core"}, m28849k = 1, m28848mv = {1, 8, 0})
/* loaded from: classes6.dex */
public final class Dispatchers {
    @NotNull
    public static final Dispatchers INSTANCE = new Dispatchers();

    /* renamed from: a */
    public static final CoroutineDispatcher f70596a = DefaultScheduler.INSTANCE;

    /* renamed from: b */
    public static final CoroutineDispatcher f70597b = Unconfined.INSTANCE;

    /* renamed from: c */
    public static final CoroutineDispatcher f70598c = DefaultIoScheduler.INSTANCE;

    @NotNull
    public static final CoroutineDispatcher getDefault() {
        return f70596a;
    }

    @JvmStatic
    public static /* synthetic */ void getDefault$annotations() {
    }

    @NotNull
    public static final CoroutineDispatcher getIO() {
        return f70598c;
    }

    @JvmStatic
    public static /* synthetic */ void getIO$annotations() {
    }

    @NotNull
    public static final MainCoroutineDispatcher getMain() {
        return MainDispatcherLoader.dispatcher;
    }

    @JvmStatic
    public static /* synthetic */ void getMain$annotations() {
    }

    @NotNull
    public static final CoroutineDispatcher getUnconfined() {
        return f70597b;
    }

    @JvmStatic
    public static /* synthetic */ void getUnconfined$annotations() {
    }

    @DelicateCoroutinesApi
    public final void shutdown() {
        DefaultExecutor.INSTANCE.shutdown();
        DefaultScheduler.INSTANCE.shutdown$kotlinx_coroutines_core();
    }
}

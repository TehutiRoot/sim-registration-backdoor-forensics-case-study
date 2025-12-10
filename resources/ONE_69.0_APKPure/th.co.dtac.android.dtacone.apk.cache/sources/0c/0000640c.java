package androidx.compose.p003ui.semantics;

import kotlin.Metadata;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.Lambda;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

@Metadata(m29143d1 = {"\u0000\n\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0003\u0010\u0000\u001a\u0004\u0018\u00010\u00012\b\u0010\u0002\u001a\u0004\u0018\u00010\u00012\u0006\u0010\u0003\u001a\u00020\u0001H\n¢\u0006\u0002\b\u0004"}, m29142d2 = {"<anonymous>", "", "<anonymous parameter 0>", "<anonymous parameter 1>", "invoke"}, m29141k = 3, m29140mv = {1, 8, 0}, m29138xi = 48)
/* renamed from: androidx.compose.ui.semantics.SemanticsProperties$PaneTitle$1 */
/* loaded from: classes2.dex */
public final class SemanticsProperties$PaneTitle$1 extends Lambda implements Function2<String, String, String> {
    public static final SemanticsProperties$PaneTitle$1 INSTANCE = new SemanticsProperties$PaneTitle$1();

    public SemanticsProperties$PaneTitle$1() {
        super(2);
    }

    @Override // kotlin.jvm.functions.Function2
    @Nullable
    public final String invoke(@Nullable String str, @NotNull String str2) {
        Intrinsics.checkNotNullParameter(str2, "<anonymous parameter 1>");
        throw new IllegalStateException("merge function called on unmergeable property PaneTitle.");
    }
}
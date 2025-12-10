package androidx.compose.p003ui.semantics;

import kotlin.Metadata;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.Lambda;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

@Metadata(m28851d1 = {"\u0000\n\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0003\u0010\u0000\u001a\u0004\u0018\u00010\u00012\b\u0010\u0002\u001a\u0004\u0018\u00010\u00012\u0006\u0010\u0003\u001a\u00020\u0001H\n¢\u0006\u0002\b\u0004"}, m28850d2 = {"<anonymous>", "", "parentValue", "<anonymous parameter 1>", "invoke"}, m28849k = 3, m28848mv = {1, 8, 0}, m28846xi = 48)
/* renamed from: androidx.compose.ui.semantics.SemanticsProperties$TestTag$1 */
/* loaded from: classes2.dex */
public final class SemanticsProperties$TestTag$1 extends Lambda implements Function2<String, String, String> {
    public static final SemanticsProperties$TestTag$1 INSTANCE = new SemanticsProperties$TestTag$1();

    public SemanticsProperties$TestTag$1() {
        super(2);
    }

    @Override // kotlin.jvm.functions.Function2
    @Nullable
    public final String invoke(@Nullable String str, @NotNull String str2) {
        Intrinsics.checkNotNullParameter(str2, "<anonymous parameter 1>");
        return str;
    }
}

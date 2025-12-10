package androidx.compose.p003ui.tooling.animation;

import androidx.compose.p003ui.tooling.data.Group;
import androidx.core.app.NotificationCompat;
import kotlin.Metadata;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.Lambda;
import kotlin.jvm.internal.SourceDebugExtension;
import org.jetbrains.annotations.NotNull;

@Metadata(m28851d1 = {"\u0000\u0012\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0000\u001a\u00020\u0001\"\u0006\b\u0000\u0010\u0002\u0018\u00012\u0006\u0010\u0003\u001a\u00020\u0004H\n¢\u0006\u0004\b\u0005\u0010\u0006"}, m28850d2 = {"<anonymous>", "", "T", NotificationCompat.CATEGORY_CALL, "Landroidx/compose/ui/tooling/data/Group;", "invoke", "(Landroidx/compose/ui/tooling/data/Group;)Ljava/lang/Boolean;"}, m28849k = 3, m28848mv = {1, 8, 0}, m28846xi = 48)
@SourceDebugExtension({"SMAP\nAnimationSearch.kt\nKotlin\n*S Kotlin\n*F\n+ 1 AnimationSearch.kt\nandroidx/compose/ui/tooling/animation/AnimationSearchKt$findRememberedData$rememberCalls$1$1\n*L\n1#1,340:1\n*E\n"})
/* renamed from: androidx.compose.ui.tooling.animation.AnimationSearchKt$findRememberedData$rememberCalls$1$1 */
/* loaded from: classes2.dex */
public final class AnimationSearchKt$findRememberedData$rememberCalls$1$1 extends Lambda implements Function1<Group, Boolean> {
    public static final AnimationSearchKt$findRememberedData$rememberCalls$1$1 INSTANCE = new AnimationSearchKt$findRememberedData$rememberCalls$1$1();

    public AnimationSearchKt$findRememberedData$rememberCalls$1$1() {
        super(1);
    }

    @Override // kotlin.jvm.functions.Function1
    @NotNull
    public final Boolean invoke(@NotNull Group call) {
        Intrinsics.checkNotNullParameter(call, "call");
        return Boolean.valueOf(Intrinsics.areEqual(call.getName(), "remember"));
    }
}

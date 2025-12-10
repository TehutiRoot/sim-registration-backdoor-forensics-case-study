package androidx.compose.material3;

import kotlin.Metadata;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.Lambda;
import org.jetbrains.annotations.NotNull;

@Metadata(m29141k = 3, m29140mv = {1, 8, 0}, m29138xi = 48)
/* loaded from: classes2.dex */
public final class NavigationDrawerKt$rememberDrawerState$1 extends Lambda implements Function1<DrawerValue, Boolean> {
    public static final NavigationDrawerKt$rememberDrawerState$1 INSTANCE = new NavigationDrawerKt$rememberDrawerState$1();

    public NavigationDrawerKt$rememberDrawerState$1() {
        super(1);
    }

    @Override // kotlin.jvm.functions.Function1
    @NotNull
    public final Boolean invoke(@NotNull DrawerValue it) {
        Intrinsics.checkNotNullParameter(it, "it");
        return Boolean.TRUE;
    }
}
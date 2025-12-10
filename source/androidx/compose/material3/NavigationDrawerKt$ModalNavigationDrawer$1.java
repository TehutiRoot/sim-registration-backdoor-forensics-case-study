package androidx.compose.material3;

import kotlin.Metadata;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.Lambda;
import org.jetbrains.annotations.NotNull;

@Metadata(m28849k = 3, m28848mv = {1, 8, 0}, m28846xi = 48)
/* loaded from: classes2.dex */
public final class NavigationDrawerKt$ModalNavigationDrawer$1 extends Lambda implements Function2<DrawerValue, DrawerValue, ThresholdConfig> {
    public static final NavigationDrawerKt$ModalNavigationDrawer$1 INSTANCE = new NavigationDrawerKt$ModalNavigationDrawer$1();

    public NavigationDrawerKt$ModalNavigationDrawer$1() {
        super(2);
    }

    @Override // kotlin.jvm.functions.Function2
    @NotNull
    public final ThresholdConfig invoke(@NotNull DrawerValue drawerValue, @NotNull DrawerValue drawerValue2) {
        Intrinsics.checkNotNullParameter(drawerValue, "<anonymous parameter 0>");
        Intrinsics.checkNotNullParameter(drawerValue2, "<anonymous parameter 1>");
        return new FractionalThreshold(0.5f);
    }
}

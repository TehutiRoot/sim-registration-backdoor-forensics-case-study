package androidx.compose.material3;

import androidx.compose.p003ui.geometry.CornerRadiusKt;
import androidx.compose.p003ui.geometry.RoundRectKt;
import androidx.compose.p003ui.geometry.Size;
import androidx.compose.p003ui.geometry.SizeKt;
import androidx.compose.p003ui.graphics.Path;
import androidx.compose.p003ui.unit.C3641Dp;
import androidx.compose.p003ui.unit.Density;
import androidx.compose.p003ui.unit.LayoutDirection;
import androidx.compose.runtime.State;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.functions.Function3;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.Lambda;
import kotlin.jvm.internal.SourceDebugExtension;
import org.jetbrains.annotations.NotNull;

@Metadata(m28849k = 3, m28848mv = {1, 8, 0}, m28846xi = 48)
@SourceDebugExtension({"SMAP\nSearchBar.kt\nKotlin\n*S Kotlin\n*F\n+ 1 SearchBar.kt\nandroidx/compose/material3/SearchBarKt$SearchBar$animatedShape$1$1\n+ 2 Dp.kt\nandroidx/compose/ui/unit/Dp\n*L\n1#1,746:1\n88#2:747\n*S KotlinDebug\n*F\n+ 1 SearchBar.kt\nandroidx/compose/material3/SearchBarKt$SearchBar$animatedShape$1$1\n*L\n197#1:747\n*E\n"})
/* loaded from: classes2.dex */
public final class SearchBarKt$SearchBar$animatedShape$1$1 extends Lambda implements Function3<Path, Size, LayoutDirection, Unit> {
    final /* synthetic */ State<Float> $animationProgress;
    final /* synthetic */ Density $density;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public SearchBarKt$SearchBar$animatedShape$1$1(Density density, State<Float> state) {
        super(3);
        this.$density = density;
        this.$animationProgress = state;
    }

    @Override // kotlin.jvm.functions.Function3
    public /* bridge */ /* synthetic */ Unit invoke(Path path, Size size, LayoutDirection layoutDirection) {
        m70530invoke12SF9DM(path, size.m71576unboximpl(), layoutDirection);
        return Unit.INSTANCE;
    }

    /* renamed from: invoke-12SF9DM  reason: not valid java name */
    public final void m70530invoke12SF9DM(@NotNull Path $receiver, long j, @NotNull LayoutDirection layoutDirection) {
        float f;
        Intrinsics.checkNotNullParameter($receiver, "$this$$receiver");
        Intrinsics.checkNotNullParameter(layoutDirection, "<anonymous parameter 1>");
        Density density = this.$density;
        State<Float> state = this.$animationProgress;
        f = SearchBarKt.f25995a;
        $receiver.addRoundRect(RoundRectKt.m71557RoundRectsniSvfs(SizeKt.m71592toRectuvyYCjk(j), CornerRadiusKt.CornerRadius$default(density.mo69438toPx0680j_4(C3641Dp.m73658constructorimpl(f * (1 - state.getValue().floatValue()))), 0.0f, 2, null)));
    }
}

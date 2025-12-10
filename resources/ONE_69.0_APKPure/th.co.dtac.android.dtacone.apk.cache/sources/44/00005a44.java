package androidx.compose.material3;

import androidx.compose.foundation.layout.WindowInsetsKt;
import androidx.compose.p003ui.unit.C3623Dp;
import androidx.compose.p003ui.unit.Density;
import kotlin.Metadata;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.Lambda;
import kotlin.jvm.internal.SourceDebugExtension;

@Metadata(m29141k = 3, m29140mv = {1, 8, 0}, m29138xi = 48)
@SourceDebugExtension({"SMAP\nSearchBar.kt\nKotlin\n*S Kotlin\n*F\n+ 1 SearchBar.kt\nandroidx/compose/material3/SearchBarKt$SearchBar$topPadding$1$1\n+ 2 Dp.kt\nandroidx/compose/ui/unit/Dp\n*L\n1#1,746:1\n51#2:747\n*S KotlinDebug\n*F\n+ 1 SearchBar.kt\nandroidx/compose/material3/SearchBarKt$SearchBar$topPadding$1$1\n*L\n214#1:747\n*E\n"})
/* loaded from: classes2.dex */
public final class SearchBarKt$SearchBar$topPadding$1$1 extends Lambda implements Function0<C3623Dp> {
    final /* synthetic */ Density $density;
    final /* synthetic */ KG0 $unconsumedInsets;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public SearchBarKt$SearchBar$topPadding$1$1(KG0 kg0, Density density) {
        super(0);
        this.$unconsumedInsets = kg0;
        this.$density = density;
    }

    @Override // kotlin.jvm.functions.Function0
    public /* bridge */ /* synthetic */ C3623Dp invoke() {
        return C3623Dp.m73840boximpl(m70715invokeD9Ej5fM());
    }

    /* renamed from: invoke-D9Ej5fM  reason: not valid java name */
    public final float m70715invokeD9Ej5fM() {
        return C3623Dp.m73842constructorimpl(SearchBarKt.getSearchBarVerticalPadding() + WindowInsetsKt.asPaddingValues(this.$unconsumedInsets, this.$density).mo69345calculateTopPaddingD9Ej5fM());
    }
}
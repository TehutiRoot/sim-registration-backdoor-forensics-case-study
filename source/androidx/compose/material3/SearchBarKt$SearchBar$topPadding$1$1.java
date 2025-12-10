package androidx.compose.material3;

import androidx.compose.foundation.layout.WindowInsetsKt;
import androidx.compose.p003ui.unit.C3641Dp;
import androidx.compose.p003ui.unit.Density;
import kotlin.Metadata;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.Lambda;
import kotlin.jvm.internal.SourceDebugExtension;

@Metadata(m28849k = 3, m28848mv = {1, 8, 0}, m28846xi = 48)
@SourceDebugExtension({"SMAP\nSearchBar.kt\nKotlin\n*S Kotlin\n*F\n+ 1 SearchBar.kt\nandroidx/compose/material3/SearchBarKt$SearchBar$topPadding$1$1\n+ 2 Dp.kt\nandroidx/compose/ui/unit/Dp\n*L\n1#1,746:1\n51#2:747\n*S KotlinDebug\n*F\n+ 1 SearchBar.kt\nandroidx/compose/material3/SearchBarKt$SearchBar$topPadding$1$1\n*L\n214#1:747\n*E\n"})
/* loaded from: classes2.dex */
public final class SearchBarKt$SearchBar$topPadding$1$1 extends Lambda implements Function0<C3641Dp> {
    final /* synthetic */ Density $density;
    final /* synthetic */ EG0 $unconsumedInsets;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public SearchBarKt$SearchBar$topPadding$1$1(EG0 eg0, Density density) {
        super(0);
        this.$unconsumedInsets = eg0;
        this.$density = density;
    }

    @Override // kotlin.jvm.functions.Function0
    public /* bridge */ /* synthetic */ C3641Dp invoke() {
        return C3641Dp.m73656boximpl(m70531invokeD9Ej5fM());
    }

    /* renamed from: invoke-D9Ej5fM  reason: not valid java name */
    public final float m70531invokeD9Ej5fM() {
        return C3641Dp.m73658constructorimpl(SearchBarKt.getSearchBarVerticalPadding() + WindowInsetsKt.asPaddingValues(this.$unconsumedInsets, this.$density).mo69159calculateTopPaddingD9Ej5fM());
    }
}

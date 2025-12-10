package androidx.navigation.compose;

import androidx.compose.animation.AnimatedContentScope;
import androidx.compose.p003ui.platform.InspectionModeKt;
import androidx.compose.runtime.Composable;
import androidx.compose.runtime.ComposableTarget;
import androidx.compose.runtime.Composer;
import androidx.compose.runtime.ComposerKt;
import androidx.compose.runtime.State;
import androidx.compose.runtime.internal.ComposableLambdaKt;
import androidx.compose.runtime.saveable.SaveableStateHolder;
import androidx.navigation.NavBackStackEntry;
import androidx.navigation.NavDestination;
import androidx.navigation.compose.ComposeNavigator;
import java.util.List;
import java.util.ListIterator;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.functions.Function4;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.Lambda;
import kotlin.jvm.internal.SourceDebugExtension;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

@Metadata(m28851d1 = {"\u0000\u0014\n\u0000\n\u0002\u0010\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0000\u001a\u00020\u0001*\u00020\u00022\u0006\u0010\u0003\u001a\u00020\u0004H\u000b¢\u0006\u0004\b\u0005\u0010\u0006"}, m28850d2 = {"<anonymous>", "", "Landroidx/compose/animation/AnimatedContentScope;", "it", "Landroidx/navigation/NavBackStackEntry;", "invoke", "(Landroidx/compose/animation/AnimatedContentScope;Landroidx/navigation/NavBackStackEntry;Landroidx/compose/runtime/Composer;I)V"}, m28849k = 3, m28848mv = {1, 8, 0}, m28846xi = 48)
@SourceDebugExtension({"SMAP\nNavHost.kt\nKotlin\n*S Kotlin\n*F\n+ 1 NavHost.kt\nandroidx/navigation/compose/NavHostKt$NavHost$14\n+ 2 CompositionLocal.kt\nandroidx/compose/runtime/CompositionLocal\n+ 3 _Collections.kt\nkotlin/collections/CollectionsKt___CollectionsKt\n*L\n1#1,370:1\n76#2:371\n533#3,6:372\n*S KotlinDebug\n*F\n+ 1 NavHost.kt\nandroidx/navigation/compose/NavHostKt$NavHost$14\n*L\n308#1:371\n313#1:372,6\n*E\n"})
/* loaded from: classes2.dex */
public final class NavHostKt$NavHost$14 extends Lambda implements Function4<AnimatedContentScope, NavBackStackEntry, Composer, Integer, Unit> {
    final /* synthetic */ ComposeNavigator $composeNavigator;
    final /* synthetic */ SaveableStateHolder $saveableStateHolder;
    final /* synthetic */ State<List<NavBackStackEntry>> $visibleEntries$delegate;

    @Metadata(m28851d1 = {"\u0000\n\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0002\u0010\u0000\u001a\u00020\u0001H\u000b¢\u0006\u0004\b\u0002\u0010\u0003"}, m28850d2 = {"<anonymous>", "", "invoke", "(Landroidx/compose/runtime/Composer;I)V"}, m28849k = 3, m28848mv = {1, 8, 0}, m28846xi = 48)
    /* renamed from: androidx.navigation.compose.NavHostKt$NavHost$14$1 */
    /* loaded from: classes2.dex */
    public static final class C48241 extends Lambda implements Function2<Composer, Integer, Unit> {
        final /* synthetic */ NavBackStackEntry $currentEntry;
        final /* synthetic */ AnimatedContentScope $this_AnimatedContent;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public C48241(NavBackStackEntry navBackStackEntry, AnimatedContentScope animatedContentScope) {
            super(2);
            this.$currentEntry = navBackStackEntry;
            this.$this_AnimatedContent = animatedContentScope;
        }

        @Override // kotlin.jvm.functions.Function2
        public /* bridge */ /* synthetic */ Unit invoke(Composer composer, Integer num) {
            invoke(composer, num.intValue());
            return Unit.INSTANCE;
        }

        @ComposableTarget(applier = "androidx.compose.ui.UiComposable")
        @Composable
        public final void invoke(@Nullable Composer composer, int i) {
            if ((i & 11) == 2 && composer.getSkipping()) {
                composer.skipToGroupEnd();
                return;
            }
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventStart(-1425390790, i, -1, "androidx.navigation.compose.NavHost.<anonymous>.<anonymous> (NavHost.kt:317)");
            }
            NavDestination destination = this.$currentEntry.getDestination();
            Intrinsics.checkNotNull(destination, "null cannot be cast to non-null type androidx.navigation.compose.ComposeNavigator.Destination");
            ((ComposeNavigator.Destination) destination).getContent$navigation_compose_release().invoke(this.$this_AnimatedContent, this.$currentEntry, composer, 72);
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventEnd();
            }
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    /* JADX WARN: Multi-variable type inference failed */
    public NavHostKt$NavHost$14(ComposeNavigator composeNavigator, SaveableStateHolder saveableStateHolder, State<? extends List<NavBackStackEntry>> state) {
        super(4);
        this.$composeNavigator = composeNavigator;
        this.$saveableStateHolder = saveableStateHolder;
        this.$visibleEntries$delegate = state;
    }

    @Override // kotlin.jvm.functions.Function4
    public /* bridge */ /* synthetic */ Unit invoke(AnimatedContentScope animatedContentScope, NavBackStackEntry navBackStackEntry, Composer composer, Integer num) {
        invoke(animatedContentScope, navBackStackEntry, composer, num.intValue());
        return Unit.INSTANCE;
    }

    @ComposableTarget(applier = "androidx.compose.ui.UiComposable")
    @Composable
    public final void invoke(@NotNull AnimatedContentScope animatedContentScope, @NotNull NavBackStackEntry navBackStackEntry, @Nullable Composer composer, int i) {
        List<NavBackStackEntry> m53822a;
        NavBackStackEntry navBackStackEntry2;
        if (ComposerKt.isTraceInProgress()) {
            ComposerKt.traceEventStart(-1440061047, i, -1, "androidx.navigation.compose.NavHost.<anonymous> (NavHost.kt:307)");
        }
        if (!((Boolean) composer.consume(InspectionModeKt.getLocalInspectionMode())).booleanValue()) {
            m53822a = NavHostKt.m53822a(this.$visibleEntries$delegate);
        } else {
            m53822a = this.$composeNavigator.getBackStack().getValue();
        }
        ListIterator<NavBackStackEntry> listIterator = m53822a.listIterator(m53822a.size());
        while (true) {
            if (!listIterator.hasPrevious()) {
                navBackStackEntry2 = null;
                break;
            }
            navBackStackEntry2 = listIterator.previous();
            if (Intrinsics.areEqual(navBackStackEntry, navBackStackEntry2)) {
                break;
            }
        }
        NavBackStackEntry navBackStackEntry3 = navBackStackEntry2;
        if (navBackStackEntry3 != null) {
            NavBackStackEntryProviderKt.LocalOwnersProvider(navBackStackEntry3, this.$saveableStateHolder, ComposableLambdaKt.composableLambda(composer, -1425390790, true, new C48241(navBackStackEntry3, animatedContentScope)), composer, 456);
        }
        if (ComposerKt.isTraceInProgress()) {
            ComposerKt.traceEventEnd();
        }
    }
}

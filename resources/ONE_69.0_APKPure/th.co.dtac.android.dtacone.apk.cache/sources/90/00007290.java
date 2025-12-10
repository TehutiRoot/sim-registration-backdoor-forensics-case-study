package androidx.navigation.compose;

import android.annotation.SuppressLint;
import androidx.activity.compose.BackHandlerKt;
import androidx.compose.animation.AnimatedContentKt;
import androidx.compose.animation.AnimatedContentTransitionScope;
import androidx.compose.animation.EnterTransition;
import androidx.compose.animation.ExitTransition;
import androidx.compose.animation.core.Transition;
import androidx.compose.animation.core.TransitionKt;
import androidx.compose.p003ui.Alignment;
import androidx.compose.p003ui.Modifier;
import androidx.compose.p003ui.platform.AndroidCompositionLocals_androidKt;
import androidx.compose.p003ui.platform.InspectionModeKt;
import androidx.compose.runtime.Composable;
import androidx.compose.runtime.ComposableTarget;
import androidx.compose.runtime.Composer;
import androidx.compose.runtime.ComposerKt;
import androidx.compose.runtime.EffectsKt;
import androidx.compose.runtime.ScopeUpdateScope;
import androidx.compose.runtime.SnapshotStateKt;
import androidx.compose.runtime.State;
import androidx.compose.runtime.internal.ComposableLambdaKt;
import androidx.compose.runtime.saveable.SaveableStateHolder;
import androidx.compose.runtime.saveable.SaveableStateHolderKt;
import androidx.lifecycle.LifecycleOwner;
import androidx.lifecycle.ViewModelStoreOwner;
import androidx.lifecycle.viewmodel.compose.LocalViewModelStoreOwner;
import androidx.navigation.NavBackStackEntry;
import androidx.navigation.NavDestination;
import androidx.navigation.NavGraph;
import androidx.navigation.NavGraphBuilder;
import androidx.navigation.NavHostController;
import androidx.navigation.Navigator;
import androidx.navigation.compose.ComposeNavGraphNavigator;
import androidx.navigation.compose.ComposeNavigator;
import ch.qos.logback.core.joran.action.Action;
import com.tom_roush.pdfbox.contentstream.operator.OperatorName;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;
import kotlin.Deprecated;
import kotlin.DeprecationLevel;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.collections.CollectionsKt__CollectionsKt;
import kotlin.collections.CollectionsKt___CollectionsKt;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.jvm.internal.ContinuationImpl;
import kotlin.coroutines.jvm.internal.DebugMetadata;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.SourceDebugExtension;
import kotlinx.coroutines.flow.Flow;
import kotlinx.coroutines.flow.FlowCollector;
import kotlinx.coroutines.flow.StateFlow;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

@Metadata(m29143d1 = {"\u0000\\\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0010 \n\u0002\b\u0003\u001aN\u0010\f\u001a\u00020\t2\u0006\u0010\u0001\u001a\u00020\u00002\u0006\u0010\u0003\u001a\u00020\u00022\b\b\u0002\u0010\u0005\u001a\u00020\u00042\n\b\u0002\u0010\u0006\u001a\u0004\u0018\u00010\u00022\u0017\u0010\u000b\u001a\u0013\u0012\u0004\u0012\u00020\b\u0012\u0004\u0012\u00020\t0\u0007¢\u0006\u0002\b\nH\u0007¢\u0006\u0004\b\f\u0010\r\u001aÜ\u0001\u0010\f\u001a\u00020\t2\u0006\u0010\u0001\u001a\u00020\u00002\u0006\u0010\u0003\u001a\u00020\u00022\b\b\u0002\u0010\u0005\u001a\u00020\u00042\b\b\u0002\u0010\u000f\u001a\u00020\u000e2\n\b\u0002\u0010\u0006\u001a\u0004\u0018\u00010\u00022\u001f\b\u0002\u0010\u0013\u001a\u0019\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00110\u0010\u0012\u0004\u0012\u00020\u00120\u0007¢\u0006\u0002\b\n2\u001f\b\u0002\u0010\u0015\u001a\u0019\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00110\u0010\u0012\u0004\u0012\u00020\u00140\u0007¢\u0006\u0002\b\n2\u001f\b\u0002\u0010\u0016\u001a\u0019\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00110\u0010\u0012\u0004\u0012\u00020\u00120\u0007¢\u0006\u0002\b\n2\u001f\b\u0002\u0010\u0017\u001a\u0019\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00110\u0010\u0012\u0004\u0012\u00020\u00140\u0007¢\u0006\u0002\b\n2\u0017\u0010\u000b\u001a\u0013\u0012\u0004\u0012\u00020\b\u0012\u0004\u0012\u00020\t0\u0007¢\u0006\u0002\b\nH\u0007¢\u0006\u0004\b\f\u0010\u0018\u001a)\u0010\f\u001a\u00020\t2\u0006\u0010\u0001\u001a\u00020\u00002\u0006\u0010\u001a\u001a\u00020\u00192\b\b\u0002\u0010\u0005\u001a\u00020\u0004H\u0007¢\u0006\u0004\b\f\u0010\u001b\u001a·\u0001\u0010\f\u001a\u00020\t2\u0006\u0010\u0001\u001a\u00020\u00002\u0006\u0010\u001a\u001a\u00020\u00192\b\b\u0002\u0010\u0005\u001a\u00020\u00042\b\b\u0002\u0010\u000f\u001a\u00020\u000e2\u001f\b\u0002\u0010\u0013\u001a\u0019\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00110\u0010\u0012\u0004\u0012\u00020\u00120\u0007¢\u0006\u0002\b\n2\u001f\b\u0002\u0010\u0015\u001a\u0019\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00110\u0010\u0012\u0004\u0012\u00020\u00140\u0007¢\u0006\u0002\b\n2\u001f\b\u0002\u0010\u0016\u001a\u0019\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00110\u0010\u0012\u0004\u0012\u00020\u00120\u0007¢\u0006\u0002\b\n2\u001f\b\u0002\u0010\u0017\u001a\u0019\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00110\u0010\u0012\u0004\u0012\u00020\u00140\u0007¢\u0006\u0002\b\nH\u0007¢\u0006\u0004\b\f\u0010\u001c\u001a#\u0010\u001f\u001a\u0004\u0018\u00010\u0012*\u00020\u001d2\f\u0010\u001e\u001a\b\u0012\u0004\u0012\u00020\u00110\u0010H\u0002¢\u0006\u0004\b\u001f\u0010 \u001a#\u0010!\u001a\u0004\u0018\u00010\u0014*\u00020\u001d2\f\u0010\u001e\u001a\b\u0012\u0004\u0012\u00020\u00110\u0010H\u0002¢\u0006\u0004\b!\u0010\"\u001a#\u0010#\u001a\u0004\u0018\u00010\u0012*\u00020\u001d2\f\u0010\u001e\u001a\b\u0012\u0004\u0012\u00020\u00110\u0010H\u0002¢\u0006\u0004\b#\u0010 \u001a#\u0010$\u001a\u0004\u0018\u00010\u0014*\u00020\u001d2\f\u0010\u001e\u001a\b\u0012\u0004\u0012\u00020\u00110\u0010H\u0002¢\u0006\u0004\b$\u0010\"¨\u0006(²\u0006\u0012\u0010&\u001a\b\u0012\u0004\u0012\u00020\u00110%8\nX\u008a\u0084\u0002²\u0006\u0012\u0010'\u001a\b\u0012\u0004\u0012\u00020\u00110%8\nX\u008a\u0084\u0002"}, m29142d2 = {"Landroidx/navigation/NavHostController;", "navController", "", "startDestination", "Landroidx/compose/ui/Modifier;", "modifier", "route", "Lkotlin/Function1;", "Landroidx/navigation/NavGraphBuilder;", "", "Lkotlin/ExtensionFunctionType;", "builder", "NavHost", "(Landroidx/navigation/NavHostController;Ljava/lang/String;Landroidx/compose/ui/Modifier;Ljava/lang/String;Lkotlin/jvm/functions/Function1;Landroidx/compose/runtime/Composer;II)V", "Landroidx/compose/ui/Alignment;", "contentAlignment", "Landroidx/compose/animation/AnimatedContentTransitionScope;", "Landroidx/navigation/NavBackStackEntry;", "Landroidx/compose/animation/EnterTransition;", "enterTransition", "Landroidx/compose/animation/ExitTransition;", "exitTransition", "popEnterTransition", "popExitTransition", "(Landroidx/navigation/NavHostController;Ljava/lang/String;Landroidx/compose/ui/Modifier;Landroidx/compose/ui/Alignment;Ljava/lang/String;Lkotlin/jvm/functions/Function1;Lkotlin/jvm/functions/Function1;Lkotlin/jvm/functions/Function1;Lkotlin/jvm/functions/Function1;Lkotlin/jvm/functions/Function1;Landroidx/compose/runtime/Composer;II)V", "Landroidx/navigation/NavGraph;", "graph", "(Landroidx/navigation/NavHostController;Landroidx/navigation/NavGraph;Landroidx/compose/ui/Modifier;Landroidx/compose/runtime/Composer;II)V", "(Landroidx/navigation/NavHostController;Landroidx/navigation/NavGraph;Landroidx/compose/ui/Modifier;Landroidx/compose/ui/Alignment;Lkotlin/jvm/functions/Function1;Lkotlin/jvm/functions/Function1;Lkotlin/jvm/functions/Function1;Lkotlin/jvm/functions/Function1;Landroidx/compose/runtime/Composer;II)V", "Landroidx/navigation/NavDestination;", Action.SCOPE_ATTRIBUTE, OperatorName.CURVE_TO, "(Landroidx/navigation/NavDestination;Landroidx/compose/animation/AnimatedContentTransitionScope;)Landroidx/compose/animation/EnterTransition;", "d", "(Landroidx/navigation/NavDestination;Landroidx/compose/animation/AnimatedContentTransitionScope;)Landroidx/compose/animation/ExitTransition;", "e", OperatorName.FILL_NON_ZERO, "", "currentBackStack", "visibleEntries", "navigation-compose_release"}, m29141k = 2, m29140mv = {1, 8, 0})
@SourceDebugExtension({"SMAP\nNavHost.kt\nKotlin\n*S Kotlin\n*F\n+ 1 NavHost.kt\nandroidx/navigation/compose/NavHostKt\n+ 2 Composables.kt\nandroidx/compose/runtime/ComposablesKt\n+ 3 Composer.kt\nandroidx/compose/runtime/ComposerKt\n+ 4 NavController.kt\nandroidx/navigation/NavControllerKt\n+ 5 NavGraphBuilder.kt\nandroidx/navigation/NavGraphBuilderKt\n+ 6 CompositionLocal.kt\nandroidx/compose/runtime/CompositionLocal\n+ 7 Transform.kt\nkotlinx/coroutines/flow/FlowKt__TransformKt\n+ 8 Emitters.kt\nkotlinx/coroutines/flow/FlowKt__EmittersKt\n+ 9 SafeCollector.common.kt\nkotlinx/coroutines/flow/internal/SafeCollector_commonKt\n+ 10 NavigatorProvider.kt\nandroidx/navigation/NavigatorProviderKt\n+ 11 _Collections.kt\nkotlin/collections/CollectionsKt___CollectionsKt\n+ 12 Maps.kt\nkotlin/collections/MapsKt__MapsKt\n+ 13 _Maps.kt\nkotlin/collections/MapsKt___MapsKt\n+ 14 SnapshotState.kt\nandroidx/compose/runtime/SnapshotStateKt__SnapshotStateKt\n*L\n1#1,370:1\n67#2,3:371\n66#2:374\n67#2,3:384\n66#2:387\n36#2:398\n36#2:411\n25#2:424\n67#2,3:431\n66#2:434\n67#2,3:441\n66#2:444\n1097#3,3:375\n1100#3,3:381\n1097#3,3:388\n1100#3,3:394\n1097#3,3:399\n1100#3,3:407\n1097#3,3:412\n1100#3,3:420\n1097#3,6:425\n1097#3,6:435\n1097#3,6:445\n2571#4:378\n2571#4:391\n57#5,2:379\n57#5,2:392\n76#6:397\n76#6:423\n47#7:402\n49#7:406\n47#7:415\n49#7:419\n50#8:403\n55#8:405\n50#8:416\n55#8:418\n106#9:404\n106#9:417\n150#10:410\n150#10:462\n1855#11,2:451\n515#12:453\n500#12,6:454\n215#13,2:460\n81#14:463\n81#14:464\n*S KotlinDebug\n*F\n+ 1 NavHost.kt\nandroidx/navigation/compose/NavHostKt\n*L\n84#1:371,3\n84#1:374\n130#1:384,3\n130#1:387\n204#1:398\n233#1:411\n247#1:424\n250#1:431,3\n250#1:434\n264#1:441,3\n264#1:444\n84#1:375,3\n84#1:381,3\n130#1:388,3\n130#1:394,3\n204#1:399,3\n204#1:407,3\n233#1:412,3\n233#1:420,3\n247#1:425,6\n250#1:435,6\n264#1:445,6\n85#1:378\n131#1:391\n85#1:379,2\n131#1:392,2\n198#1:397\n241#1:423\n205#1:402\n205#1:406\n234#1:415\n234#1:419\n205#1:403\n205#1:405\n234#1:416\n234#1:418\n205#1:404\n234#1:417\n230#1:410\n332#1:462\n323#1:451,2\n327#1:453\n327#1:454,6\n328#1:460,2\n204#1:463\n233#1:464\n*E\n"})
/* loaded from: classes2.dex */
public final class NavHostKt {
    @ComposableTarget(applier = "androidx.compose.ui.UiComposable")
    @Deprecated(level = DeprecationLevel.HIDDEN, message = "Deprecated in favor of NavHost that supports AnimatedContent")
    @Composable
    public static final /* synthetic */ void NavHost(NavHostController navHostController, String str, Modifier modifier, String str2, Function1 function1, Composer composer, int i, int i2) {
        Composer startRestartGroup = composer.startRestartGroup(141827520);
        Modifier modifier2 = (i2 & 4) != 0 ? Modifier.Companion : modifier;
        String str3 = (i2 & 8) != 0 ? null : str2;
        if (ComposerKt.isTraceInProgress()) {
            ComposerKt.traceEventStart(141827520, i, -1, "androidx.navigation.compose.NavHost (NavHost.kt:80)");
        }
        startRestartGroup.startReplaceableGroup(1618982084);
        boolean changed = startRestartGroup.changed(str3) | startRestartGroup.changed(str) | startRestartGroup.changed(function1);
        Object rememberedValue = startRestartGroup.rememberedValue();
        if (changed || rememberedValue == Composer.Companion.getEmpty()) {
            NavGraphBuilder navGraphBuilder = new NavGraphBuilder(navHostController.getNavigatorProvider(), str, str3);
            function1.invoke(navGraphBuilder);
            rememberedValue = navGraphBuilder.build();
            startRestartGroup.updateRememberedValue(rememberedValue);
        }
        startRestartGroup.endReplaceableGroup();
        NavHost(navHostController, (NavGraph) rememberedValue, modifier2, null, null, null, null, null, startRestartGroup, (i & 896) | 72, 248);
        if (ComposerKt.isTraceInProgress()) {
            ComposerKt.traceEventEnd();
        }
        ScopeUpdateScope endRestartGroup = startRestartGroup.endRestartGroup();
        if (endRestartGroup == null) {
            return;
        }
        endRestartGroup.updateScope(new NavHostKt$NavHost$2(navHostController, str, modifier2, str3, function1, i, i2));
    }

    /* renamed from: a */
    public static final List m53773a(State state) {
        return (List) state.getValue();
    }

    /* renamed from: b */
    public static final List m53772b(State state) {
        return (List) state.getValue();
    }

    /* renamed from: c */
    public static final EnterTransition m53771c(NavDestination navDestination, AnimatedContentTransitionScope animatedContentTransitionScope) {
        Function1<AnimatedContentTransitionScope<NavBackStackEntry>, EnterTransition> enterTransition$navigation_compose_release;
        if (navDestination instanceof ComposeNavigator.Destination) {
            Function1<AnimatedContentTransitionScope<NavBackStackEntry>, EnterTransition> enterTransition$navigation_compose_release2 = ((ComposeNavigator.Destination) navDestination).getEnterTransition$navigation_compose_release();
            if (enterTransition$navigation_compose_release2 == null) {
                return null;
            }
            return enterTransition$navigation_compose_release2.invoke(animatedContentTransitionScope);
        } else if (!(navDestination instanceof ComposeNavGraphNavigator.ComposeNavGraph) || (enterTransition$navigation_compose_release = ((ComposeNavGraphNavigator.ComposeNavGraph) navDestination).getEnterTransition$navigation_compose_release()) == null) {
            return null;
        } else {
            return enterTransition$navigation_compose_release.invoke(animatedContentTransitionScope);
        }
    }

    /* renamed from: d */
    public static final ExitTransition m53770d(NavDestination navDestination, AnimatedContentTransitionScope animatedContentTransitionScope) {
        Function1<AnimatedContentTransitionScope<NavBackStackEntry>, ExitTransition> exitTransition$navigation_compose_release;
        if (navDestination instanceof ComposeNavigator.Destination) {
            Function1<AnimatedContentTransitionScope<NavBackStackEntry>, ExitTransition> exitTransition$navigation_compose_release2 = ((ComposeNavigator.Destination) navDestination).getExitTransition$navigation_compose_release();
            if (exitTransition$navigation_compose_release2 == null) {
                return null;
            }
            return exitTransition$navigation_compose_release2.invoke(animatedContentTransitionScope);
        } else if (!(navDestination instanceof ComposeNavGraphNavigator.ComposeNavGraph) || (exitTransition$navigation_compose_release = ((ComposeNavGraphNavigator.ComposeNavGraph) navDestination).getExitTransition$navigation_compose_release()) == null) {
            return null;
        } else {
            return exitTransition$navigation_compose_release.invoke(animatedContentTransitionScope);
        }
    }

    /* renamed from: e */
    public static final EnterTransition m53769e(NavDestination navDestination, AnimatedContentTransitionScope animatedContentTransitionScope) {
        Function1<AnimatedContentTransitionScope<NavBackStackEntry>, EnterTransition> popEnterTransition$navigation_compose_release;
        if (navDestination instanceof ComposeNavigator.Destination) {
            Function1<AnimatedContentTransitionScope<NavBackStackEntry>, EnterTransition> popEnterTransition$navigation_compose_release2 = ((ComposeNavigator.Destination) navDestination).getPopEnterTransition$navigation_compose_release();
            if (popEnterTransition$navigation_compose_release2 == null) {
                return null;
            }
            return popEnterTransition$navigation_compose_release2.invoke(animatedContentTransitionScope);
        } else if (!(navDestination instanceof ComposeNavGraphNavigator.ComposeNavGraph) || (popEnterTransition$navigation_compose_release = ((ComposeNavGraphNavigator.ComposeNavGraph) navDestination).getPopEnterTransition$navigation_compose_release()) == null) {
            return null;
        } else {
            return popEnterTransition$navigation_compose_release.invoke(animatedContentTransitionScope);
        }
    }

    /* renamed from: f */
    public static final ExitTransition m53768f(NavDestination navDestination, AnimatedContentTransitionScope animatedContentTransitionScope) {
        Function1<AnimatedContentTransitionScope<NavBackStackEntry>, ExitTransition> popExitTransition$navigation_compose_release;
        if (navDestination instanceof ComposeNavigator.Destination) {
            Function1<AnimatedContentTransitionScope<NavBackStackEntry>, ExitTransition> popExitTransition$navigation_compose_release2 = ((ComposeNavigator.Destination) navDestination).getPopExitTransition$navigation_compose_release();
            if (popExitTransition$navigation_compose_release2 == null) {
                return null;
            }
            return popExitTransition$navigation_compose_release2.invoke(animatedContentTransitionScope);
        } else if (!(navDestination instanceof ComposeNavGraphNavigator.ComposeNavGraph) || (popExitTransition$navigation_compose_release = ((ComposeNavGraphNavigator.ComposeNavGraph) navDestination).getPopExitTransition$navigation_compose_release()) == null) {
            return null;
        } else {
            return popExitTransition$navigation_compose_release.invoke(animatedContentTransitionScope);
        }
    }

    @ComposableTarget(applier = "androidx.compose.ui.UiComposable")
    @Composable
    public static final void NavHost(@NotNull NavHostController navHostController, @NotNull String str, @Nullable Modifier modifier, @Nullable Alignment alignment, @Nullable String str2, @Nullable Function1<? super AnimatedContentTransitionScope<NavBackStackEntry>, ? extends EnterTransition> function1, @Nullable Function1<? super AnimatedContentTransitionScope<NavBackStackEntry>, ? extends ExitTransition> function12, @Nullable Function1<? super AnimatedContentTransitionScope<NavBackStackEntry>, ? extends EnterTransition> function13, @Nullable Function1<? super AnimatedContentTransitionScope<NavBackStackEntry>, ? extends ExitTransition> function14, @NotNull Function1<? super NavGraphBuilder, Unit> function15, @Nullable Composer composer, int i, int i2) {
        Function1<? super AnimatedContentTransitionScope<NavBackStackEntry>, ? extends EnterTransition> function16;
        int i3;
        Function1<? super AnimatedContentTransitionScope<NavBackStackEntry>, ? extends ExitTransition> function17;
        Composer startRestartGroup = composer.startRestartGroup(410432995);
        Modifier modifier2 = (i2 & 4) != 0 ? Modifier.Companion : modifier;
        Alignment center = (i2 & 8) != 0 ? Alignment.Companion.getCenter() : alignment;
        String str3 = (i2 & 16) != 0 ? null : str2;
        Function1<? super AnimatedContentTransitionScope<NavBackStackEntry>, ? extends EnterTransition> function18 = (i2 & 32) != 0 ? NavHostKt$NavHost$3.INSTANCE : function1;
        Function1<? super AnimatedContentTransitionScope<NavBackStackEntry>, ? extends ExitTransition> function19 = (i2 & 64) != 0 ? NavHostKt$NavHost$4.INSTANCE : function12;
        if ((i2 & 128) != 0) {
            i3 = i & (-29360129);
            function16 = function18;
        } else {
            function16 = function13;
            i3 = i;
        }
        if ((i2 & 256) != 0) {
            i3 &= -234881025;
            function17 = function19;
        } else {
            function17 = function14;
        }
        if (ComposerKt.isTraceInProgress()) {
            ComposerKt.traceEventStart(410432995, i3, -1, "androidx.navigation.compose.NavHost (NavHost.kt:126)");
        }
        startRestartGroup.startReplaceableGroup(1618982084);
        boolean changed = startRestartGroup.changed(str3) | startRestartGroup.changed(str) | startRestartGroup.changed(function15);
        Object rememberedValue = startRestartGroup.rememberedValue();
        if (changed || rememberedValue == Composer.Companion.getEmpty()) {
            NavGraphBuilder navGraphBuilder = new NavGraphBuilder(navHostController.getNavigatorProvider(), str, str3);
            function15.invoke(navGraphBuilder);
            rememberedValue = navGraphBuilder.build();
            startRestartGroup.updateRememberedValue(rememberedValue);
        }
        startRestartGroup.endReplaceableGroup();
        int i4 = i3 >> 3;
        NavHost(navHostController, (NavGraph) rememberedValue, modifier2, center, function18, function19, function16, function17, startRestartGroup, (i3 & 896) | 72 | (i3 & 7168) | (57344 & i4) | (458752 & i4) | (3670016 & i4) | (i4 & 29360128), 0);
        if (ComposerKt.isTraceInProgress()) {
            ComposerKt.traceEventEnd();
        }
        ScopeUpdateScope endRestartGroup = startRestartGroup.endRestartGroup();
        if (endRestartGroup == null) {
            return;
        }
        endRestartGroup.updateScope(new NavHostKt$NavHost$6(navHostController, str, modifier2, center, str3, function18, function19, function16, function17, function15, i, i2));
    }

    @ComposableTarget(applier = "androidx.compose.ui.UiComposable")
    @Deprecated(level = DeprecationLevel.HIDDEN, message = "Deprecated in favor of NavHost that supports AnimatedContent")
    @Composable
    public static final /* synthetic */ void NavHost(NavHostController navHostController, NavGraph navGraph, Modifier modifier, Composer composer, int i, int i2) {
        Composer startRestartGroup = composer.startRestartGroup(-957014592);
        Modifier.Companion companion = (i2 & 4) != 0 ? Modifier.Companion : modifier;
        if (ComposerKt.isTraceInProgress()) {
            ComposerKt.traceEventStart(-957014592, i, -1, "androidx.navigation.compose.NavHost (NavHost.kt:163)");
        }
        NavHost(navHostController, navGraph, companion, null, null, null, null, null, startRestartGroup, (i & 896) | 72, 248);
        if (ComposerKt.isTraceInProgress()) {
            ComposerKt.traceEventEnd();
        }
        ScopeUpdateScope endRestartGroup = startRestartGroup.endRestartGroup();
        if (endRestartGroup == null) {
            return;
        }
        endRestartGroup.updateScope(new NavHostKt$NavHost$7(navHostController, navGraph, companion, i, i2));
    }

    @ComposableTarget(applier = "androidx.compose.ui.UiComposable")
    @Composable
    @SuppressLint({"StateFlowValueCalledInComposition"})
    public static final void NavHost(@NotNull NavHostController navHostController, @NotNull NavGraph navGraph, @Nullable Modifier modifier, @Nullable Alignment alignment, @Nullable Function1<? super AnimatedContentTransitionScope<NavBackStackEntry>, ? extends EnterTransition> function1, @Nullable Function1<? super AnimatedContentTransitionScope<NavBackStackEntry>, ? extends ExitTransition> function12, @Nullable Function1<? super AnimatedContentTransitionScope<NavBackStackEntry>, ? extends EnterTransition> function13, @Nullable Function1<? super AnimatedContentTransitionScope<NavBackStackEntry>, ? extends ExitTransition> function14, @Nullable Composer composer, int i, int i2) {
        Function1<? super AnimatedContentTransitionScope<NavBackStackEntry>, ? extends EnterTransition> function15;
        int i3;
        Function1<? super AnimatedContentTransitionScope<NavBackStackEntry>, ? extends ExitTransition> function16;
        NavBackStackEntry navBackStackEntry;
        Function1<? super AnimatedContentTransitionScope<NavBackStackEntry>, ? extends EnterTransition> function17;
        Function1<? super AnimatedContentTransitionScope<NavBackStackEntry>, ? extends ExitTransition> function18;
        Composer startRestartGroup = composer.startRestartGroup(-1818191915);
        Modifier modifier2 = (i2 & 4) != 0 ? Modifier.Companion : modifier;
        Alignment center = (i2 & 8) != 0 ? Alignment.Companion.getCenter() : alignment;
        Function1<? super AnimatedContentTransitionScope<NavBackStackEntry>, ? extends EnterTransition> function19 = (i2 & 16) != 0 ? NavHostKt$NavHost$8.INSTANCE : function1;
        Function1<? super AnimatedContentTransitionScope<NavBackStackEntry>, ? extends ExitTransition> function110 = (i2 & 32) != 0 ? NavHostKt$NavHost$9.INSTANCE : function12;
        if ((i2 & 64) != 0) {
            i3 = i & (-3670017);
            function15 = function19;
        } else {
            function15 = function13;
            i3 = i;
        }
        if ((i2 & 128) != 0) {
            i3 &= -29360129;
            function16 = function110;
        } else {
            function16 = function14;
        }
        if (ComposerKt.isTraceInProgress()) {
            ComposerKt.traceEventStart(-1818191915, i3, -1, "androidx.navigation.compose.NavHost (NavHost.kt:195)");
        }
        LifecycleOwner lifecycleOwner = (LifecycleOwner) startRestartGroup.consume(AndroidCompositionLocals_androidKt.getLocalLifecycleOwner());
        ViewModelStoreOwner current = LocalViewModelStoreOwner.INSTANCE.getCurrent(startRestartGroup, LocalViewModelStoreOwner.$stable);
        if (current != null) {
            StateFlow<List<NavBackStackEntry>> currentBackStack = navHostController.getCurrentBackStack();
            startRestartGroup.startReplaceableGroup(1157296644);
            boolean changed = startRestartGroup.changed(currentBackStack);
            Object rememberedValue = startRestartGroup.rememberedValue();
            if (changed || rememberedValue == Composer.Companion.getEmpty()) {
                final StateFlow<List<NavBackStackEntry>> currentBackStack2 = navHostController.getCurrentBackStack();
                rememberedValue = new Flow<List<? extends NavBackStackEntry>>() { // from class: androidx.navigation.compose.NavHostKt$NavHost$lambda$5$$inlined$map$1

                    @Metadata(m29143d1 = {"\u0000\n\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0007\u0010\u0000\u001a\u00020\u0001\"\u0004\b\u0000\u0010\u0002\"\u0004\b\u0001\u0010\u00032\u0006\u0010\u0004\u001a\u0002H\u0002H\u008a@¢\u0006\u0004\b\u0005\u0010\u0006¨\u0006\b"}, m29142d2 = {"<anonymous>", "", "T", "R", "value", "emit", "(Ljava/lang/Object;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "kotlinx/coroutines/flow/FlowKt__EmittersKt$unsafeTransform$1$1", "kotlinx/coroutines/flow/FlowKt__TransformKt$map$$inlined$unsafeTransform$1$2"}, m29141k = 3, m29140mv = {1, 8, 0}, m29138xi = 48)
                    @SourceDebugExtension({"SMAP\nEmitters.kt\nKotlin\n*S Kotlin\n*F\n+ 1 Emitters.kt\nkotlinx/coroutines/flow/FlowKt__EmittersKt$unsafeTransform$1$1\n+ 2 Transform.kt\nkotlinx/coroutines/flow/FlowKt__TransformKt\n+ 3 NavHost.kt\nandroidx/navigation/compose/NavHostKt\n+ 4 _Collections.kt\nkotlin/collections/CollectionsKt___CollectionsKt\n*L\n1#1,222:1\n48#2:223\n206#3:224\n207#3:227\n766#4:225\n857#4:226\n858#4:228\n*S KotlinDebug\n*F\n+ 1 NavHost.kt\nandroidx/navigation/compose/NavHostKt\n*L\n206#1:225\n206#1:226\n206#1:228\n*E\n"})
                    /* renamed from: androidx.navigation.compose.NavHostKt$NavHost$lambda$5$$inlined$map$1$2 */
                    /* loaded from: classes2.dex */
                    public static final class C48022<T> implements FlowCollector {

                        /* renamed from: a */
                        public final /* synthetic */ FlowCollector f36508a;

                        @Metadata(m29141k = 3, m29140mv = {1, 8, 0}, m29138xi = 48)
                        @DebugMetadata(m29093c = "androidx.navigation.compose.NavHostKt$NavHost$lambda$5$$inlined$map$1$2", m29092f = "NavHost.kt", m29091i = {}, m29090l = {223}, m29089m = "emit", m29088n = {}, m29087s = {})
                        @SourceDebugExtension({"SMAP\nEmitters.kt\nKotlin\n*S Kotlin\n*F\n+ 1 Emitters.kt\nkotlinx/coroutines/flow/FlowKt__EmittersKt$unsafeTransform$1$1$emit$1\n*L\n1#1,222:1\n*E\n"})
                        /* renamed from: androidx.navigation.compose.NavHostKt$NavHost$lambda$5$$inlined$map$1$2$1 */
                        /* loaded from: classes2.dex */
                        public static final class C48031 extends ContinuationImpl {
                            Object L$0;
                            int label;
                            /* synthetic */ Object result;

                            public C48031(Continuation continuation) {
                                super(continuation);
                            }

                            @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
                            @Nullable
                            public final Object invokeSuspend(@NotNull Object obj) {
                                this.result = obj;
                                this.label |= Integer.MIN_VALUE;
                                return C48022.this.emit(null, this);
                            }
                        }

                        public C48022(FlowCollector flowCollector) {
                            this.f36508a = flowCollector;
                        }

                        /* JADX WARN: Removed duplicated region for block: B:10:0x0023  */
                        /* JADX WARN: Removed duplicated region for block: B:14:0x0031  */
                        @Override // kotlinx.coroutines.flow.FlowCollector
                        @org.jetbrains.annotations.Nullable
                        /*
                            Code decompiled incorrectly, please refer to instructions dump.
                            To view partially-correct code enable 'Show inconsistent code' option in preferences
                        */
                        public final java.lang.Object emit(java.lang.Object r8, @org.jetbrains.annotations.NotNull kotlin.coroutines.Continuation r9) {
                            /*
                                r7 = this;
                                boolean r0 = r9 instanceof androidx.navigation.compose.NavHostKt$NavHost$lambda$5$$inlined$map$1.C48022.C48031
                                if (r0 == 0) goto L13
                                r0 = r9
                                androidx.navigation.compose.NavHostKt$NavHost$lambda$5$$inlined$map$1$2$1 r0 = (androidx.navigation.compose.NavHostKt$NavHost$lambda$5$$inlined$map$1.C48022.C48031) r0
                                int r1 = r0.label
                                r2 = -2147483648(0xffffffff80000000, float:-0.0)
                                r3 = r1 & r2
                                if (r3 == 0) goto L13
                                int r1 = r1 - r2
                                r0.label = r1
                                goto L18
                            L13:
                                androidx.navigation.compose.NavHostKt$NavHost$lambda$5$$inlined$map$1$2$1 r0 = new androidx.navigation.compose.NavHostKt$NavHost$lambda$5$$inlined$map$1$2$1
                                r0.<init>(r9)
                            L18:
                                java.lang.Object r9 = r0.result
                                java.lang.Object r1 = p000.AbstractC19782eg0.getCOROUTINE_SUSPENDED()
                                int r2 = r0.label
                                r3 = 1
                                if (r2 == 0) goto L31
                                if (r2 != r3) goto L29
                                kotlin.ResultKt.throwOnFailure(r9)
                                goto L6d
                            L29:
                                java.lang.IllegalStateException r8 = new java.lang.IllegalStateException
                                java.lang.String r9 = "call to 'resume' before 'invoke' with coroutine"
                                r8.<init>(r9)
                                throw r8
                            L31:
                                kotlin.ResultKt.throwOnFailure(r9)
                                kotlinx.coroutines.flow.FlowCollector r9 = r7.f36508a
                                java.util.List r8 = (java.util.List) r8
                                java.lang.Iterable r8 = (java.lang.Iterable) r8
                                java.util.ArrayList r2 = new java.util.ArrayList
                                r2.<init>()
                                java.util.Iterator r8 = r8.iterator()
                            L43:
                                boolean r4 = r8.hasNext()
                                if (r4 == 0) goto L64
                                java.lang.Object r4 = r8.next()
                                r5 = r4
                                androidx.navigation.NavBackStackEntry r5 = (androidx.navigation.NavBackStackEntry) r5
                                androidx.navigation.NavDestination r5 = r5.getDestination()
                                java.lang.String r5 = r5.getNavigatorName()
                                java.lang.String r6 = "composable"
                                boolean r5 = kotlin.jvm.internal.Intrinsics.areEqual(r5, r6)
                                if (r5 == 0) goto L43
                                r2.add(r4)
                                goto L43
                            L64:
                                r0.label = r3
                                java.lang.Object r8 = r9.emit(r2, r0)
                                if (r8 != r1) goto L6d
                                return r1
                            L6d:
                                kotlin.Unit r8 = kotlin.Unit.INSTANCE
                                return r8
                            */
                            throw new UnsupportedOperationException("Method not decompiled: androidx.navigation.compose.NavHostKt$NavHost$lambda$5$$inlined$map$1.C48022.emit(java.lang.Object, kotlin.coroutines.Continuation):java.lang.Object");
                        }
                    }

                    @Override // kotlinx.coroutines.flow.Flow
                    @Nullable
                    public Object collect(@NotNull FlowCollector<? super List<? extends NavBackStackEntry>> flowCollector, @NotNull Continuation continuation) {
                        Object collect = Flow.this.collect(new C48022(flowCollector), continuation);
                        if (collect == AbstractC19782eg0.getCOROUTINE_SUSPENDED()) {
                            return collect;
                        }
                        return Unit.INSTANCE;
                    }
                };
                startRestartGroup.updateRememberedValue(rememberedValue);
            }
            startRestartGroup.endReplaceableGroup();
            BackHandlerKt.BackHandler(m53772b(SnapshotStateKt.collectAsState((Flow) rememberedValue, CollectionsKt__CollectionsKt.emptyList(), null, startRestartGroup, 56, 2)).size() > 1, new NavHostKt$NavHost$10(navHostController), startRestartGroup, 0, 0);
            EffectsKt.DisposableEffect(lifecycleOwner, new NavHostKt$NavHost$11(navHostController, lifecycleOwner), startRestartGroup, 8);
            navHostController.setViewModelStore(current.getViewModelStore());
            navHostController.setGraph(navGraph);
            SaveableStateHolder rememberSaveableStateHolder = SaveableStateHolderKt.rememberSaveableStateHolder(startRestartGroup, 0);
            Navigator navigator = navHostController.getNavigatorProvider().getNavigator(ComposeNavigator.NAME);
            ComposeNavigator composeNavigator = navigator instanceof ComposeNavigator ? (ComposeNavigator) navigator : null;
            if (composeNavigator == null) {
                if (ComposerKt.isTraceInProgress()) {
                    ComposerKt.traceEventEnd();
                }
                ScopeUpdateScope endRestartGroup = startRestartGroup.endRestartGroup();
                if (endRestartGroup == null) {
                    return;
                }
                endRestartGroup.updateScope(new NavHostKt$NavHost$composeNavigator$1(navHostController, navGraph, modifier2, center, function19, function110, function15, function16, i, i2));
                return;
            }
            StateFlow<List<NavBackStackEntry>> visibleEntries = navHostController.getVisibleEntries();
            startRestartGroup.startReplaceableGroup(1157296644);
            boolean changed2 = startRestartGroup.changed(visibleEntries);
            Object rememberedValue2 = startRestartGroup.rememberedValue();
            if (changed2 || rememberedValue2 == Composer.Companion.getEmpty()) {
                final StateFlow<List<NavBackStackEntry>> visibleEntries2 = navHostController.getVisibleEntries();
                rememberedValue2 = new Flow<List<? extends NavBackStackEntry>>() { // from class: androidx.navigation.compose.NavHostKt$NavHost$lambda$9$$inlined$map$1

                    @Metadata(m29143d1 = {"\u0000\n\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0007\u0010\u0000\u001a\u00020\u0001\"\u0004\b\u0000\u0010\u0002\"\u0004\b\u0001\u0010\u00032\u0006\u0010\u0004\u001a\u0002H\u0002H\u008a@¢\u0006\u0004\b\u0005\u0010\u0006¨\u0006\b"}, m29142d2 = {"<anonymous>", "", "T", "R", "value", "emit", "(Ljava/lang/Object;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "kotlinx/coroutines/flow/FlowKt__EmittersKt$unsafeTransform$1$1", "kotlinx/coroutines/flow/FlowKt__TransformKt$map$$inlined$unsafeTransform$1$2"}, m29141k = 3, m29140mv = {1, 8, 0}, m29138xi = 48)
                    @SourceDebugExtension({"SMAP\nEmitters.kt\nKotlin\n*S Kotlin\n*F\n+ 1 Emitters.kt\nkotlinx/coroutines/flow/FlowKt__EmittersKt$unsafeTransform$1$1\n+ 2 Transform.kt\nkotlinx/coroutines/flow/FlowKt__TransformKt\n+ 3 NavHost.kt\nandroidx/navigation/compose/NavHostKt\n+ 4 _Collections.kt\nkotlin/collections/CollectionsKt___CollectionsKt\n*L\n1#1,222:1\n48#2:223\n235#3:224\n236#3:227\n766#4:225\n857#4:226\n858#4:228\n*S KotlinDebug\n*F\n+ 1 NavHost.kt\nandroidx/navigation/compose/NavHostKt\n*L\n235#1:225\n235#1:226\n235#1:228\n*E\n"})
                    /* renamed from: androidx.navigation.compose.NavHostKt$NavHost$lambda$9$$inlined$map$1$2 */
                    /* loaded from: classes2.dex */
                    public static final class C48042<T> implements FlowCollector {

                        /* renamed from: a */
                        public final /* synthetic */ FlowCollector f36510a;

                        @Metadata(m29141k = 3, m29140mv = {1, 8, 0}, m29138xi = 48)
                        @DebugMetadata(m29093c = "androidx.navigation.compose.NavHostKt$NavHost$lambda$9$$inlined$map$1$2", m29092f = "NavHost.kt", m29091i = {}, m29090l = {223}, m29089m = "emit", m29088n = {}, m29087s = {})
                        @SourceDebugExtension({"SMAP\nEmitters.kt\nKotlin\n*S Kotlin\n*F\n+ 1 Emitters.kt\nkotlinx/coroutines/flow/FlowKt__EmittersKt$unsafeTransform$1$1$emit$1\n*L\n1#1,222:1\n*E\n"})
                        /* renamed from: androidx.navigation.compose.NavHostKt$NavHost$lambda$9$$inlined$map$1$2$1 */
                        /* loaded from: classes2.dex */
                        public static final class C48051 extends ContinuationImpl {
                            Object L$0;
                            int label;
                            /* synthetic */ Object result;

                            public C48051(Continuation continuation) {
                                super(continuation);
                            }

                            @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
                            @Nullable
                            public final Object invokeSuspend(@NotNull Object obj) {
                                this.result = obj;
                                this.label |= Integer.MIN_VALUE;
                                return C48042.this.emit(null, this);
                            }
                        }

                        public C48042(FlowCollector flowCollector) {
                            this.f36510a = flowCollector;
                        }

                        /* JADX WARN: Removed duplicated region for block: B:10:0x0023  */
                        /* JADX WARN: Removed duplicated region for block: B:14:0x0031  */
                        @Override // kotlinx.coroutines.flow.FlowCollector
                        @org.jetbrains.annotations.Nullable
                        /*
                            Code decompiled incorrectly, please refer to instructions dump.
                            To view partially-correct code enable 'Show inconsistent code' option in preferences
                        */
                        public final java.lang.Object emit(java.lang.Object r8, @org.jetbrains.annotations.NotNull kotlin.coroutines.Continuation r9) {
                            /*
                                r7 = this;
                                boolean r0 = r9 instanceof androidx.navigation.compose.NavHostKt$NavHost$lambda$9$$inlined$map$1.C48042.C48051
                                if (r0 == 0) goto L13
                                r0 = r9
                                androidx.navigation.compose.NavHostKt$NavHost$lambda$9$$inlined$map$1$2$1 r0 = (androidx.navigation.compose.NavHostKt$NavHost$lambda$9$$inlined$map$1.C48042.C48051) r0
                                int r1 = r0.label
                                r2 = -2147483648(0xffffffff80000000, float:-0.0)
                                r3 = r1 & r2
                                if (r3 == 0) goto L13
                                int r1 = r1 - r2
                                r0.label = r1
                                goto L18
                            L13:
                                androidx.navigation.compose.NavHostKt$NavHost$lambda$9$$inlined$map$1$2$1 r0 = new androidx.navigation.compose.NavHostKt$NavHost$lambda$9$$inlined$map$1$2$1
                                r0.<init>(r9)
                            L18:
                                java.lang.Object r9 = r0.result
                                java.lang.Object r1 = p000.AbstractC19782eg0.getCOROUTINE_SUSPENDED()
                                int r2 = r0.label
                                r3 = 1
                                if (r2 == 0) goto L31
                                if (r2 != r3) goto L29
                                kotlin.ResultKt.throwOnFailure(r9)
                                goto L6d
                            L29:
                                java.lang.IllegalStateException r8 = new java.lang.IllegalStateException
                                java.lang.String r9 = "call to 'resume' before 'invoke' with coroutine"
                                r8.<init>(r9)
                                throw r8
                            L31:
                                kotlin.ResultKt.throwOnFailure(r9)
                                kotlinx.coroutines.flow.FlowCollector r9 = r7.f36510a
                                java.util.List r8 = (java.util.List) r8
                                java.lang.Iterable r8 = (java.lang.Iterable) r8
                                java.util.ArrayList r2 = new java.util.ArrayList
                                r2.<init>()
                                java.util.Iterator r8 = r8.iterator()
                            L43:
                                boolean r4 = r8.hasNext()
                                if (r4 == 0) goto L64
                                java.lang.Object r4 = r8.next()
                                r5 = r4
                                androidx.navigation.NavBackStackEntry r5 = (androidx.navigation.NavBackStackEntry) r5
                                androidx.navigation.NavDestination r5 = r5.getDestination()
                                java.lang.String r5 = r5.getNavigatorName()
                                java.lang.String r6 = "composable"
                                boolean r5 = kotlin.jvm.internal.Intrinsics.areEqual(r5, r6)
                                if (r5 == 0) goto L43
                                r2.add(r4)
                                goto L43
                            L64:
                                r0.label = r3
                                java.lang.Object r8 = r9.emit(r2, r0)
                                if (r8 != r1) goto L6d
                                return r1
                            L6d:
                                kotlin.Unit r8 = kotlin.Unit.INSTANCE
                                return r8
                            */
                            throw new UnsupportedOperationException("Method not decompiled: androidx.navigation.compose.NavHostKt$NavHost$lambda$9$$inlined$map$1.C48042.emit(java.lang.Object, kotlin.coroutines.Continuation):java.lang.Object");
                        }
                    }

                    @Override // kotlinx.coroutines.flow.Flow
                    @Nullable
                    public Object collect(@NotNull FlowCollector<? super List<? extends NavBackStackEntry>> flowCollector, @NotNull Continuation continuation) {
                        Object collect = Flow.this.collect(new C48042(flowCollector), continuation);
                        if (collect == AbstractC19782eg0.getCOROUTINE_SUSPENDED()) {
                            return collect;
                        }
                        return Unit.INSTANCE;
                    }
                };
                startRestartGroup.updateRememberedValue(rememberedValue2);
            }
            startRestartGroup.endReplaceableGroup();
            State collectAsState = SnapshotStateKt.collectAsState((Flow) rememberedValue2, CollectionsKt__CollectionsKt.emptyList(), null, startRestartGroup, 56, 2);
            if (((Boolean) startRestartGroup.consume(InspectionModeKt.getLocalInspectionMode())).booleanValue()) {
                navBackStackEntry = (NavBackStackEntry) CollectionsKt___CollectionsKt.lastOrNull((List<? extends Object>) composeNavigator.getBackStack().getValue());
            } else {
                navBackStackEntry = (NavBackStackEntry) CollectionsKt___CollectionsKt.lastOrNull((List<? extends Object>) m53773a(collectAsState));
            }
            startRestartGroup.startReplaceableGroup(-492369756);
            Object rememberedValue3 = startRestartGroup.rememberedValue();
            Composer.Companion companion = Composer.Companion;
            if (rememberedValue3 == companion.getEmpty()) {
                rememberedValue3 = new LinkedHashMap();
                startRestartGroup.updateRememberedValue(rememberedValue3);
            }
            startRestartGroup.endReplaceableGroup();
            Map map = (Map) rememberedValue3;
            startRestartGroup.startReplaceableGroup(1822178307);
            if (navBackStackEntry != null) {
                startRestartGroup.startReplaceableGroup(1618982084);
                boolean changed3 = startRestartGroup.changed(composeNavigator) | startRestartGroup.changed(function15) | startRestartGroup.changed(function19);
                Object rememberedValue4 = startRestartGroup.rememberedValue();
                if (changed3 || rememberedValue4 == companion.getEmpty()) {
                    rememberedValue4 = new NavHostKt$NavHost$finalEnter$1$1(composeNavigator, function15, function19);
                    startRestartGroup.updateRememberedValue(rememberedValue4);
                }
                startRestartGroup.endReplaceableGroup();
                Function1 function111 = (Function1) rememberedValue4;
                startRestartGroup.startReplaceableGroup(1618982084);
                boolean changed4 = startRestartGroup.changed(composeNavigator) | startRestartGroup.changed(function16) | startRestartGroup.changed(function110);
                Object rememberedValue5 = startRestartGroup.rememberedValue();
                if (changed4 || rememberedValue5 == companion.getEmpty()) {
                    rememberedValue5 = new NavHostKt$NavHost$finalExit$1$1(composeNavigator, function16, function110);
                    startRestartGroup.updateRememberedValue(rememberedValue5);
                }
                startRestartGroup.endReplaceableGroup();
                function18 = function16;
                function17 = function15;
                Transition updateTransition = TransitionKt.updateTransition(navBackStackEntry, "entry", startRestartGroup, 56, 0);
                ComposeNavigator composeNavigator2 = composeNavigator;
                AnimatedContentKt.AnimatedContent(updateTransition, modifier2, new NavHostKt$NavHost$12(map, composeNavigator, function111, (Function1) rememberedValue5, collectAsState), center, NavHostKt$NavHost$13.INSTANCE, ComposableLambdaKt.composableLambda(startRestartGroup, -1440061047, true, new NavHostKt$NavHost$14(composeNavigator, rememberSaveableStateHolder, collectAsState)), startRestartGroup, ((i3 >> 3) & 112) | 221184 | (i3 & 7168), 0);
                if (Intrinsics.areEqual(updateTransition.getCurrentState(), updateTransition.getTargetState())) {
                    for (NavBackStackEntry navBackStackEntry2 : m53773a(collectAsState)) {
                        composeNavigator2.onTransitionComplete(navBackStackEntry2);
                    }
                    LinkedHashMap linkedHashMap = new LinkedHashMap();
                    for (Map.Entry entry : map.entrySet()) {
                        if (!Intrinsics.areEqual(entry.getKey(), ((NavBackStackEntry) updateTransition.getTargetState()).getId())) {
                            linkedHashMap.put(entry.getKey(), entry.getValue());
                        }
                    }
                    for (Map.Entry entry2 : linkedHashMap.entrySet()) {
                        map.remove(entry2.getKey());
                    }
                }
            } else {
                function17 = function15;
                function18 = function16;
            }
            startRestartGroup.endReplaceableGroup();
            Navigator navigator2 = navHostController.getNavigatorProvider().getNavigator(DialogNavigator.NAME);
            DialogNavigator dialogNavigator = navigator2 instanceof DialogNavigator ? (DialogNavigator) navigator2 : null;
            if (dialogNavigator == null) {
                if (ComposerKt.isTraceInProgress()) {
                    ComposerKt.traceEventEnd();
                }
                ScopeUpdateScope endRestartGroup2 = startRestartGroup.endRestartGroup();
                if (endRestartGroup2 == null) {
                    return;
                }
                endRestartGroup2.updateScope(new NavHostKt$NavHost$dialogNavigator$1(navHostController, navGraph, modifier2, center, function19, function110, function17, function18, i, i2));
                return;
            }
            DialogHostKt.DialogHost(dialogNavigator, startRestartGroup, 0);
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventEnd();
            }
            ScopeUpdateScope endRestartGroup3 = startRestartGroup.endRestartGroup();
            if (endRestartGroup3 == null) {
                return;
            }
            endRestartGroup3.updateScope(new NavHostKt$NavHost$18(navHostController, navGraph, modifier2, center, function19, function110, function17, function18, i, i2));
            return;
        }
        throw new IllegalStateException("NavHost requires a ViewModelStoreOwner to be provided via LocalViewModelStoreOwner".toString());
    }
}
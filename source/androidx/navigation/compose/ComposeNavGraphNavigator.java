package androidx.navigation.compose;

import androidx.compose.animation.AnimatedContentTransitionScope;
import androidx.compose.animation.EnterTransition;
import androidx.compose.animation.ExitTransition;
import androidx.core.app.NotificationCompat;
import androidx.navigation.NavBackStackEntry;
import androidx.navigation.NavGraph;
import androidx.navigation.NavGraphNavigator;
import androidx.navigation.Navigator;
import androidx.navigation.NavigatorProvider;
import com.tom_roush.pdfbox.contentstream.operator.OperatorName;
import com.tom_roush.pdfbox.pdmodel.common.PDPageLabelRange;
import kotlin.Metadata;
import kotlin.jvm.functions.Function1;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

@Navigator.Name(NotificationCompat.CATEGORY_NAVIGATION)
@Metadata(m28851d1 = {"\u0000\u001a\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\b\u0001\u0018\u00002\u00020\u0001:\u0001\u0007B\r\u0012\u0006\u0010\u0002\u001a\u00020\u0003¢\u0006\u0002\u0010\u0004J\b\u0010\u0005\u001a\u00020\u0006H\u0016¨\u0006\b"}, m28850d2 = {"Landroidx/navigation/compose/ComposeNavGraphNavigator;", "Landroidx/navigation/NavGraphNavigator;", "navigatorProvider", "Landroidx/navigation/NavigatorProvider;", "(Landroidx/navigation/NavigatorProvider;)V", "createDestination", "Landroidx/navigation/NavGraph;", "ComposeNavGraph", "navigation-compose_release"}, m28849k = 1, m28848mv = {1, 8, 0}, m28846xi = 48)
/* loaded from: classes2.dex */
public final class ComposeNavGraphNavigator extends NavGraphNavigator {

    @Metadata(m28851d1 = {"\u00004\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0018\u0002\n\u0002\b\r\b\u0000\u0018\u00002\u00020\u0001B\u0017\u0012\u000e\u0010\u0003\u001a\n\u0012\u0006\b\u0001\u0012\u00020\u00010\u0002¢\u0006\u0004\b\u0004\u0010\u0005RB\u0010\u0012\u001a\"\u0012\n\u0012\b\u0012\u0004\u0012\u00020\b0\u0007\u0012\u0006\u0012\u0004\u0018\u00010\t\u0018\u00010\u0006¢\u0006\u0002\b\n¢\u0006\u0002\b\u000b8\u0000@\u0000X\u0080\u000e¢\u0006\u0012\n\u0004\b\f\u0010\r\u001a\u0004\b\u000e\u0010\u000f\"\u0004\b\u0010\u0010\u0011RB\u0010\u0017\u001a\"\u0012\n\u0012\b\u0012\u0004\u0012\u00020\b0\u0007\u0012\u0006\u0012\u0004\u0018\u00010\u0013\u0018\u00010\u0006¢\u0006\u0002\b\n¢\u0006\u0002\b\u000b8\u0000@\u0000X\u0080\u000e¢\u0006\u0012\n\u0004\b\u0014\u0010\r\u001a\u0004\b\u0015\u0010\u000f\"\u0004\b\u0016\u0010\u0011RB\u0010\u001b\u001a\"\u0012\n\u0012\b\u0012\u0004\u0012\u00020\b0\u0007\u0012\u0006\u0012\u0004\u0018\u00010\t\u0018\u00010\u0006¢\u0006\u0002\b\n¢\u0006\u0002\b\u000b8\u0000@\u0000X\u0080\u000e¢\u0006\u0012\n\u0004\b\u0018\u0010\r\u001a\u0004\b\u0019\u0010\u000f\"\u0004\b\u001a\u0010\u0011RB\u0010\u001f\u001a\"\u0012\n\u0012\b\u0012\u0004\u0012\u00020\b0\u0007\u0012\u0006\u0012\u0004\u0018\u00010\u0013\u0018\u00010\u0006¢\u0006\u0002\b\n¢\u0006\u0002\b\u000b8\u0000@\u0000X\u0080\u000e¢\u0006\u0012\n\u0004\b\u001c\u0010\r\u001a\u0004\b\u001d\u0010\u000f\"\u0004\b\u001e\u0010\u0011¨\u0006 "}, m28850d2 = {"Landroidx/navigation/compose/ComposeNavGraphNavigator$ComposeNavGraph;", "Landroidx/navigation/NavGraph;", "Landroidx/navigation/Navigator;", "navGraphNavigator", "<init>", "(Landroidx/navigation/Navigator;)V", "Lkotlin/Function1;", "Landroidx/compose/animation/AnimatedContentTransitionScope;", "Landroidx/navigation/NavBackStackEntry;", "Landroidx/compose/animation/EnterTransition;", "Lkotlin/jvm/JvmSuppressWildcards;", "Lkotlin/ExtensionFunctionType;", "o", "Lkotlin/jvm/functions/Function1;", "getEnterTransition$navigation_compose_release", "()Lkotlin/jvm/functions/Function1;", "setEnterTransition$navigation_compose_release", "(Lkotlin/jvm/functions/Function1;)V", "enterTransition", "Landroidx/compose/animation/ExitTransition;", "p", "getExitTransition$navigation_compose_release", "setExitTransition$navigation_compose_release", "exitTransition", OperatorName.SAVE, "getPopEnterTransition$navigation_compose_release", "setPopEnterTransition$navigation_compose_release", "popEnterTransition", PDPageLabelRange.STYLE_ROMAN_LOWER, "getPopExitTransition$navigation_compose_release", "setPopExitTransition$navigation_compose_release", "popExitTransition", "navigation-compose_release"}, m28849k = 1, m28848mv = {1, 8, 0})
    /* loaded from: classes2.dex */
    public static final class ComposeNavGraph extends NavGraph {

        /* renamed from: o */
        public Function1 f36400o;

        /* renamed from: p */
        public Function1 f36401p;

        /* renamed from: q */
        public Function1 f36402q;

        /* renamed from: r */
        public Function1 f36403r;

        public ComposeNavGraph(@NotNull Navigator<? extends NavGraph> navigator) {
            super(navigator);
        }

        @Nullable
        public final Function1<AnimatedContentTransitionScope<NavBackStackEntry>, EnterTransition> getEnterTransition$navigation_compose_release() {
            return this.f36400o;
        }

        @Nullable
        public final Function1<AnimatedContentTransitionScope<NavBackStackEntry>, ExitTransition> getExitTransition$navigation_compose_release() {
            return this.f36401p;
        }

        @Nullable
        public final Function1<AnimatedContentTransitionScope<NavBackStackEntry>, EnterTransition> getPopEnterTransition$navigation_compose_release() {
            return this.f36402q;
        }

        @Nullable
        public final Function1<AnimatedContentTransitionScope<NavBackStackEntry>, ExitTransition> getPopExitTransition$navigation_compose_release() {
            return this.f36403r;
        }

        public final void setEnterTransition$navigation_compose_release(@Nullable Function1<AnimatedContentTransitionScope<NavBackStackEntry>, EnterTransition> function1) {
            this.f36400o = function1;
        }

        public final void setExitTransition$navigation_compose_release(@Nullable Function1<AnimatedContentTransitionScope<NavBackStackEntry>, ExitTransition> function1) {
            this.f36401p = function1;
        }

        public final void setPopEnterTransition$navigation_compose_release(@Nullable Function1<AnimatedContentTransitionScope<NavBackStackEntry>, EnterTransition> function1) {
            this.f36402q = function1;
        }

        public final void setPopExitTransition$navigation_compose_release(@Nullable Function1<AnimatedContentTransitionScope<NavBackStackEntry>, ExitTransition> function1) {
            this.f36403r = function1;
        }
    }

    public ComposeNavGraphNavigator(@NotNull NavigatorProvider navigatorProvider) {
        super(navigatorProvider);
    }

    @Override // androidx.navigation.NavGraphNavigator, androidx.navigation.Navigator
    @NotNull
    public NavGraph createDestination() {
        return new ComposeNavGraph(this);
    }
}

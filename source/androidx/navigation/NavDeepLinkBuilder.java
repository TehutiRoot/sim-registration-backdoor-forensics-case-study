package androidx.navigation;

import android.app.Activity;
import android.app.PendingIntent;
import android.content.ComponentName;
import android.content.Context;
import android.content.Intent;
import android.os.Bundle;
import android.os.Parcelable;
import androidx.annotation.IdRes;
import androidx.annotation.NavigationRes;
import androidx.core.app.TaskStackBuilder;
import androidx.navigation.Navigator;
import ch.qos.logback.core.CoreConstants;
import com.tom_roush.pdfbox.contentstream.operator.OperatorName;
import com.tom_roush.pdfbox.pdmodel.common.PDPageLabelRange;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import kotlin.Metadata;
import kotlin.collections.ArrayDeque;
import kotlin.collections.CollectionsKt___CollectionsKt;
import kotlin.jvm.JvmOverloads;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

@Metadata(m28851d1 = {"\u0000\u0080\u0001\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0010!\n\u0002\u0018\u0002\n\u0002\b\b\u0018\u00002\u00020\u0001:\u00020?B\u000f\u0012\u0006\u0010\u0003\u001a\u00020\u0002¢\u0006\u0004\b\u0004\u0010\u0005B\u0011\b\u0010\u0012\u0006\u0010\u0007\u001a\u00020\u0006¢\u0006\u0004\b\u0004\u0010\bJ\u001f\u0010\f\u001a\u00020\u00002\u0010\u0010\u000b\u001a\f\u0012\b\b\u0001\u0012\u0004\u0018\u00010\n0\t¢\u0006\u0004\b\f\u0010\rJ\u0015\u0010\f\u001a\u00020\u00002\u0006\u0010\u000f\u001a\u00020\u000e¢\u0006\u0004\b\f\u0010\u0010J\u0017\u0010\u0013\u001a\u00020\u00002\b\b\u0001\u0010\u0012\u001a\u00020\u0011¢\u0006\u0004\b\u0013\u0010\u0014J\u0015\u0010\u0013\u001a\u00020\u00002\u0006\u0010\u0016\u001a\u00020\u0015¢\u0006\u0004\b\u0013\u0010\u0017J%\u0010\u001b\u001a\u00020\u00002\b\b\u0001\u0010\u0018\u001a\u00020\u00112\n\b\u0002\u0010\u001a\u001a\u0004\u0018\u00010\u0019H\u0007¢\u0006\u0004\b\u001b\u0010\u001cJ#\u0010\u001b\u001a\u00020\u00002\u0006\u0010\u001e\u001a\u00020\u001d2\n\b\u0002\u0010\u001a\u001a\u0004\u0018\u00010\u0019H\u0007¢\u0006\u0004\b\u001b\u0010\u001fJ%\u0010 \u001a\u00020\u00002\b\b\u0001\u0010\u0018\u001a\u00020\u00112\n\b\u0002\u0010\u001a\u001a\u0004\u0018\u00010\u0019H\u0007¢\u0006\u0004\b \u0010\u001cJ#\u0010 \u001a\u00020\u00002\u0006\u0010!\u001a\u00020\u001d2\n\b\u0002\u0010\u001a\u001a\u0004\u0018\u00010\u0019H\u0007¢\u0006\u0004\b \u0010\u001fJ\u0017\u0010\"\u001a\u00020\u00002\b\u0010\u001a\u001a\u0004\u0018\u00010\u0019¢\u0006\u0004\b\"\u0010#J\r\u0010%\u001a\u00020$¢\u0006\u0004\b%\u0010&J\r\u0010(\u001a\u00020'¢\u0006\u0004\b(\u0010)J\u001b\u0010+\u001a\u0004\u0018\u00010*2\b\b\u0001\u0010\u0018\u001a\u00020\u0011H\u0002¢\u0006\u0004\b+\u0010,J\u000f\u0010.\u001a\u00020-H\u0002¢\u0006\u0004\b.\u0010/J\u000f\u00100\u001a\u00020-H\u0002¢\u0006\u0004\b0\u0010/R\u0014\u0010\u0003\u001a\u00020\u00028\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b0\u00101R\u0014\u00104\u001a\u0002028\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b+\u00103R\u0018\u00106\u001a\u0004\u0018\u00010\u00158\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b.\u00105R\u001a\u0010;\u001a\b\u0012\u0004\u0012\u000208078\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b9\u0010:R\u0018\u0010>\u001a\u0004\u0018\u00010\u00198\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b<\u0010=¨\u0006@"}, m28850d2 = {"Landroidx/navigation/NavDeepLinkBuilder;", "", "Landroid/content/Context;", CoreConstants.CONTEXT_SCOPE_VALUE, "<init>", "(Landroid/content/Context;)V", "Landroidx/navigation/NavController;", "navController", "(Landroidx/navigation/NavController;)V", "Ljava/lang/Class;", "Landroid/app/Activity;", "activityClass", "setComponentName", "(Ljava/lang/Class;)Landroidx/navigation/NavDeepLinkBuilder;", "Landroid/content/ComponentName;", "componentName", "(Landroid/content/ComponentName;)Landroidx/navigation/NavDeepLinkBuilder;", "", "navGraphId", "setGraph", "(I)Landroidx/navigation/NavDeepLinkBuilder;", "Landroidx/navigation/NavGraph;", "navGraph", "(Landroidx/navigation/NavGraph;)Landroidx/navigation/NavDeepLinkBuilder;", "destId", "Landroid/os/Bundle;", "args", "setDestination", "(ILandroid/os/Bundle;)Landroidx/navigation/NavDeepLinkBuilder;", "", "destRoute", "(Ljava/lang/String;Landroid/os/Bundle;)Landroidx/navigation/NavDeepLinkBuilder;", "addDestination", "route", "setArguments", "(Landroid/os/Bundle;)Landroidx/navigation/NavDeepLinkBuilder;", "Landroidx/core/app/TaskStackBuilder;", "createTaskStackBuilder", "()Landroidx/core/app/TaskStackBuilder;", "Landroid/app/PendingIntent;", "createPendingIntent", "()Landroid/app/PendingIntent;", "Landroidx/navigation/NavDestination;", OperatorName.CLOSE_FILL_NON_ZERO_AND_STROKE, "(I)Landroidx/navigation/NavDestination;", "", OperatorName.CURVE_TO, "()V", PDPageLabelRange.STYLE_LETTERS_LOWER, "Landroid/content/Context;", "Landroid/content/Intent;", "Landroid/content/Intent;", "intent", "Landroidx/navigation/NavGraph;", "graph", "", "Landroidx/navigation/NavDeepLinkBuilder$a;", "d", "Ljava/util/List;", "destinations", "e", "Landroid/os/Bundle;", "globalArgs", "PermissiveNavigatorProvider", "navigation-runtime_release"}, m28849k = 1, m28848mv = {1, 8, 0})
/* loaded from: classes2.dex */
public final class NavDeepLinkBuilder {

    /* renamed from: a */
    public final Context f36296a;

    /* renamed from: b */
    public final Intent f36297b;

    /* renamed from: c */
    public NavGraph f36298c;

    /* renamed from: d */
    public final List f36299d;

    /* renamed from: e */
    public Bundle f36300e;

    /* loaded from: classes2.dex */
    public static final class PermissiveNavigatorProvider extends NavigatorProvider {

        /* renamed from: c */
        public final Navigator f36301c = new Navigator<NavDestination>() { // from class: androidx.navigation.NavDeepLinkBuilder$PermissiveNavigatorProvider$mDestNavigator$1
            @Override // androidx.navigation.Navigator
            @NotNull
            public NavDestination createDestination() {
                return new NavDestination("permissive");
            }

            @Override // androidx.navigation.Navigator
            @Nullable
            public NavDestination navigate(@NotNull NavDestination destination, @Nullable Bundle bundle, @Nullable NavOptions navOptions, @Nullable Navigator.Extras extras) {
                Intrinsics.checkNotNullParameter(destination, "destination");
                throw new IllegalStateException("navigate is not supported");
            }

            @Override // androidx.navigation.Navigator
            public boolean popBackStack() {
                throw new IllegalStateException("popBackStack is not supported");
            }
        };

        public PermissiveNavigatorProvider() {
            addNavigator(new NavGraphNavigator(this));
        }

        @Override // androidx.navigation.NavigatorProvider
        public Navigator getNavigator(String name) {
            Intrinsics.checkNotNullParameter(name, "name");
            try {
                return super.getNavigator(name);
            } catch (IllegalStateException unused) {
                Navigator navigator = this.f36301c;
                Intrinsics.checkNotNull(navigator, "null cannot be cast to non-null type T of androidx.navigation.NavDeepLinkBuilder.PermissiveNavigatorProvider.getNavigator");
                return navigator;
            }
        }
    }

    /* renamed from: androidx.navigation.NavDeepLinkBuilder$a */
    /* loaded from: classes2.dex */
    public static final class C4811a {

        /* renamed from: a */
        public final int f36302a;

        /* renamed from: b */
        public final Bundle f36303b;

        public C4811a(int i, Bundle bundle) {
            this.f36302a = i;
            this.f36303b = bundle;
        }

        /* renamed from: a */
        public final Bundle m53845a() {
            return this.f36303b;
        }

        /* renamed from: b */
        public final int m53844b() {
            return this.f36302a;
        }
    }

    public NavDeepLinkBuilder(@NotNull Context context) {
        Intent launchIntentForPackage;
        Intrinsics.checkNotNullParameter(context, "context");
        this.f36296a = context;
        if (context instanceof Activity) {
            launchIntentForPackage = new Intent(context, context.getClass());
        } else {
            launchIntentForPackage = context.getPackageManager().getLaunchIntentForPackage(context.getPackageName());
            if (launchIntentForPackage == null) {
                launchIntentForPackage = new Intent();
            }
        }
        launchIntentForPackage.addFlags(268468224);
        this.f36297b = launchIntentForPackage;
        this.f36299d = new ArrayList();
    }

    public static /* synthetic */ NavDeepLinkBuilder addDestination$default(NavDeepLinkBuilder navDeepLinkBuilder, int i, Bundle bundle, int i2, Object obj) {
        if ((i2 & 2) != 0) {
            bundle = null;
        }
        return navDeepLinkBuilder.addDestination(i, bundle);
    }

    public static /* synthetic */ NavDeepLinkBuilder setDestination$default(NavDeepLinkBuilder navDeepLinkBuilder, int i, Bundle bundle, int i2, Object obj) {
        if ((i2 & 2) != 0) {
            bundle = null;
        }
        return navDeepLinkBuilder.setDestination(i, bundle);
    }

    /* renamed from: a */
    public final void m53848a() {
        ArrayList arrayList = new ArrayList();
        ArrayList<? extends Parcelable> arrayList2 = new ArrayList<>();
        NavDestination navDestination = null;
        for (C4811a c4811a : this.f36299d) {
            int m53844b = c4811a.m53844b();
            Bundle m53845a = c4811a.m53845a();
            NavDestination m53847b = m53847b(m53844b);
            if (m53847b != null) {
                for (int i : m53847b.buildDeepLinkIds(navDestination)) {
                    arrayList.add(Integer.valueOf(i));
                    arrayList2.add(m53845a);
                }
                navDestination = m53847b;
            } else {
                throw new IllegalArgumentException("Navigation destination " + NavDestination.Companion.getDisplayName(this.f36296a, m53844b) + " cannot be found in the navigation graph " + this.f36298c);
            }
        }
        this.f36297b.putExtra(NavController.KEY_DEEP_LINK_IDS, CollectionsKt___CollectionsKt.toIntArray(arrayList));
        this.f36297b.putParcelableArrayListExtra(NavController.KEY_DEEP_LINK_ARGS, arrayList2);
    }

    @JvmOverloads
    @NotNull
    public final NavDeepLinkBuilder addDestination(@IdRes int i) {
        return addDestination$default(this, i, (Bundle) null, 2, (Object) null);
    }

    /* renamed from: b */
    public final NavDestination m53847b(int i) {
        ArrayDeque arrayDeque = new ArrayDeque();
        NavGraph navGraph = this.f36298c;
        Intrinsics.checkNotNull(navGraph);
        arrayDeque.add(navGraph);
        while (!arrayDeque.isEmpty()) {
            NavDestination navDestination = (NavDestination) arrayDeque.removeFirst();
            if (navDestination.getId() == i) {
                return navDestination;
            }
            if (navDestination instanceof NavGraph) {
                Iterator<NavDestination> it = ((NavGraph) navDestination).iterator();
                while (it.hasNext()) {
                    arrayDeque.add(it.next());
                }
            }
        }
        return null;
    }

    /* renamed from: c */
    public final void m53846c() {
        for (C4811a c4811a : this.f36299d) {
            int m53844b = c4811a.m53844b();
            if (m53847b(m53844b) == null) {
                String displayName = NavDestination.Companion.getDisplayName(this.f36296a, m53844b);
                throw new IllegalArgumentException("Navigation destination " + displayName + " cannot be found in the navigation graph " + this.f36298c);
            }
        }
    }

    @NotNull
    public final PendingIntent createPendingIntent() {
        int i;
        int i2;
        int i3;
        Bundle bundle = this.f36300e;
        if (bundle != null) {
            i = 0;
            for (String str : bundle.keySet()) {
                Object obj = bundle.get(str);
                int i4 = i * 31;
                if (obj != null) {
                    i3 = obj.hashCode();
                } else {
                    i3 = 0;
                }
                i = i4 + i3;
            }
        } else {
            i = 0;
        }
        for (C4811a c4811a : this.f36299d) {
            i = (i * 31) + c4811a.m53844b();
            Bundle m53845a = c4811a.m53845a();
            if (m53845a != null) {
                for (String str2 : m53845a.keySet()) {
                    Object obj2 = m53845a.get(str2);
                    int i5 = i * 31;
                    if (obj2 != null) {
                        i2 = obj2.hashCode();
                    } else {
                        i2 = 0;
                    }
                    i = i5 + i2;
                }
            }
        }
        PendingIntent pendingIntent = createTaskStackBuilder().getPendingIntent(i, 201326592);
        Intrinsics.checkNotNull(pendingIntent);
        return pendingIntent;
    }

    @NotNull
    public final TaskStackBuilder createTaskStackBuilder() {
        if (this.f36298c != null) {
            if (!this.f36299d.isEmpty()) {
                m53848a();
                TaskStackBuilder addNextIntentWithParentStack = TaskStackBuilder.create(this.f36296a).addNextIntentWithParentStack(new Intent(this.f36297b));
                Intrinsics.checkNotNullExpressionValue(addNextIntentWithParentStack, "create(context)\n        …rentStack(Intent(intent))");
                int intentCount = addNextIntentWithParentStack.getIntentCount();
                for (int i = 0; i < intentCount; i++) {
                    Intent editIntentAt = addNextIntentWithParentStack.editIntentAt(i);
                    if (editIntentAt != null) {
                        editIntentAt.putExtra(NavController.KEY_DEEP_LINK_INTENT, this.f36297b);
                    }
                }
                return addNextIntentWithParentStack;
            }
            throw new IllegalStateException("You must call setDestination() or addDestination() before constructing the deep link".toString());
        }
        throw new IllegalStateException("You must call setGraph() before constructing the deep link".toString());
    }

    @NotNull
    public final NavDeepLinkBuilder setArguments(@Nullable Bundle bundle) {
        this.f36300e = bundle;
        this.f36297b.putExtra(NavController.KEY_DEEP_LINK_EXTRAS, bundle);
        return this;
    }

    @NotNull
    public final NavDeepLinkBuilder setComponentName(@NotNull Class<? extends Activity> activityClass) {
        Intrinsics.checkNotNullParameter(activityClass, "activityClass");
        return setComponentName(new ComponentName(this.f36296a, activityClass));
    }

    @JvmOverloads
    @NotNull
    public final NavDeepLinkBuilder setDestination(@IdRes int i) {
        return setDestination$default(this, i, (Bundle) null, 2, (Object) null);
    }

    @NotNull
    public final NavDeepLinkBuilder setGraph(@NavigationRes int i) {
        return setGraph(new NavInflater(this.f36296a, new PermissiveNavigatorProvider()).inflate(i));
    }

    public static /* synthetic */ NavDeepLinkBuilder addDestination$default(NavDeepLinkBuilder navDeepLinkBuilder, String str, Bundle bundle, int i, Object obj) {
        if ((i & 2) != 0) {
            bundle = null;
        }
        return navDeepLinkBuilder.addDestination(str, bundle);
    }

    public static /* synthetic */ NavDeepLinkBuilder setDestination$default(NavDeepLinkBuilder navDeepLinkBuilder, String str, Bundle bundle, int i, Object obj) {
        if ((i & 2) != 0) {
            bundle = null;
        }
        return navDeepLinkBuilder.setDestination(str, bundle);
    }

    @JvmOverloads
    @NotNull
    public final NavDeepLinkBuilder addDestination(@NotNull String route) {
        Intrinsics.checkNotNullParameter(route, "route");
        return addDestination$default(this, route, (Bundle) null, 2, (Object) null);
    }

    @NotNull
    public final NavDeepLinkBuilder setComponentName(@NotNull ComponentName componentName) {
        Intrinsics.checkNotNullParameter(componentName, "componentName");
        this.f36297b.setComponent(componentName);
        return this;
    }

    @JvmOverloads
    @NotNull
    public final NavDeepLinkBuilder setDestination(@NotNull String destRoute) {
        Intrinsics.checkNotNullParameter(destRoute, "destRoute");
        return setDestination$default(this, destRoute, (Bundle) null, 2, (Object) null);
    }

    @NotNull
    public final NavDeepLinkBuilder setGraph(@NotNull NavGraph navGraph) {
        Intrinsics.checkNotNullParameter(navGraph, "navGraph");
        this.f36298c = navGraph;
        m53846c();
        return this;
    }

    @JvmOverloads
    @NotNull
    public final NavDeepLinkBuilder addDestination(@IdRes int i, @Nullable Bundle bundle) {
        this.f36299d.add(new C4811a(i, bundle));
        if (this.f36298c != null) {
            m53846c();
        }
        return this;
    }

    @JvmOverloads
    @NotNull
    public final NavDeepLinkBuilder setDestination(@IdRes int i, @Nullable Bundle bundle) {
        this.f36299d.clear();
        this.f36299d.add(new C4811a(i, bundle));
        if (this.f36298c != null) {
            m53846c();
        }
        return this;
    }

    @JvmOverloads
    @NotNull
    public final NavDeepLinkBuilder addDestination(@NotNull String route, @Nullable Bundle bundle) {
        Intrinsics.checkNotNullParameter(route, "route");
        this.f36299d.add(new C4811a(NavDestination.Companion.createRoute(route).hashCode(), bundle));
        if (this.f36298c != null) {
            m53846c();
        }
        return this;
    }

    @JvmOverloads
    @NotNull
    public final NavDeepLinkBuilder setDestination(@NotNull String destRoute, @Nullable Bundle bundle) {
        Intrinsics.checkNotNullParameter(destRoute, "destRoute");
        this.f36299d.clear();
        this.f36299d.add(new C4811a(NavDestination.Companion.createRoute(destRoute).hashCode(), bundle));
        if (this.f36298c != null) {
            m53846c();
        }
        return this;
    }

    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    public NavDeepLinkBuilder(@NotNull NavController navController) {
        this(navController.getContext());
        Intrinsics.checkNotNullParameter(navController, "navController");
        this.f36298c = navController.getGraph();
    }
}

package androidx.navigation;

import android.annotation.SuppressLint;
import androidx.annotation.CallSuper;
import androidx.annotation.RestrictTo;
import androidx.navigation.Navigator;
import com.tom_roush.pdfbox.pdmodel.common.PDPageLabelRange;
import java.util.LinkedHashMap;
import java.util.Map;
import kotlin.Metadata;
import kotlin.collections.AbstractC11687a;
import kotlin.jvm.JvmStatic;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.SourceDebugExtension;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

@Metadata(m28851d1 = {"\u0000:\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0010%\n\u0002\b\u0003\n\u0002\u0010$\n\u0002\b\u0005\b\u0017\u0018\u0000 \u001a2\u00020\u0001:\u0001\u001aB\u0007¢\u0006\u0004\b\u0002\u0010\u0003J)\u0010\b\u001a\u00028\u0000\"\f\b\u0000\u0010\u0005*\u0006\u0012\u0002\b\u00030\u00042\f\u0010\u0007\u001a\b\u0012\u0004\u0012\u00028\u00000\u0006¢\u0006\u0004\b\b\u0010\tJ%\u0010\b\u001a\u00028\u0000\"\f\b\u0000\u0010\u0005*\u0006\u0012\u0002\b\u00030\u00042\u0006\u0010\u000b\u001a\u00020\nH\u0017¢\u0006\u0004\b\b\u0010\fJ'\u0010\u000f\u001a\f\u0012\u0006\b\u0001\u0012\u00020\r\u0018\u00010\u00042\u000e\u0010\u000e\u001a\n\u0012\u0006\b\u0001\u0012\u00020\r0\u0004¢\u0006\u0004\b\u000f\u0010\u0010J1\u0010\u000f\u001a\f\u0012\u0006\b\u0001\u0012\u00020\r\u0018\u00010\u00042\u0006\u0010\u000b\u001a\u00020\n2\u000e\u0010\u000e\u001a\n\u0012\u0006\b\u0001\u0012\u00020\r0\u0004H\u0017¢\u0006\u0004\b\u000f\u0010\u0011R(\u0010\u0015\u001a\u0016\u0012\u0004\u0012\u00020\n\u0012\f\u0012\n\u0012\u0006\b\u0001\u0012\u00020\r0\u00040\u00128\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0013\u0010\u0014R%\u0010\u0019\u001a\u0016\u0012\u0004\u0012\u00020\n\u0012\f\u0012\n\u0012\u0006\b\u0001\u0012\u00020\r0\u00040\u00168G¢\u0006\u0006\u001a\u0004\b\u0017\u0010\u0018¨\u0006\u001b"}, m28850d2 = {"Landroidx/navigation/NavigatorProvider;", "", "<init>", "()V", "Landroidx/navigation/Navigator;", "T", "Ljava/lang/Class;", "navigatorClass", "getNavigator", "(Ljava/lang/Class;)Landroidx/navigation/Navigator;", "", "name", "(Ljava/lang/String;)Landroidx/navigation/Navigator;", "Landroidx/navigation/NavDestination;", "navigator", "addNavigator", "(Landroidx/navigation/Navigator;)Landroidx/navigation/Navigator;", "(Ljava/lang/String;Landroidx/navigation/Navigator;)Landroidx/navigation/Navigator;", "", PDPageLabelRange.STYLE_LETTERS_LOWER, "Ljava/util/Map;", "_navigators", "", "getNavigators", "()Ljava/util/Map;", "navigators", "Companion", "navigation-common_release"}, m28849k = 1, m28848mv = {1, 8, 0})
@SuppressLint({"TypeParameterUnusedInFormals"})
@SourceDebugExtension({"SMAP\nNavigatorProvider.kt\nKotlin\n*S Kotlin\n*F\n+ 1 NavigatorProvider.kt\nandroidx/navigation/NavigatorProvider\n+ 2 fake.kt\nkotlin/jvm/internal/FakeKt\n*L\n1#1,183:1\n1#2:184\n*E\n"})
/* loaded from: classes2.dex */
public class NavigatorProvider {
    @NotNull
    public static final Companion Companion = new Companion(null);

    /* renamed from: b */
    public static final Map f36388b = new LinkedHashMap();

    /* renamed from: a */
    public final Map f36389a = new LinkedHashMap();

    @Metadata(m28851d1 = {"\u0000,\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010%\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000b\n\u0002\b\u0003\b\u0080\u0003\u0018\u00002\u00020\u0001B\u0007\b\u0002¢\u0006\u0002\u0010\u0002J!\u0010\u0007\u001a\u00020\u00062\u0012\u0010\b\u001a\u000e\u0012\n\b\u0001\u0012\u0006\u0012\u0002\b\u00030\t0\u0005H\u0001¢\u0006\u0002\b\nJ\u0017\u0010\u000b\u001a\u00020\f2\b\u0010\r\u001a\u0004\u0018\u00010\u0006H\u0000¢\u0006\u0002\b\u000eR \u0010\u0003\u001a\u0014\u0012\b\u0012\u0006\u0012\u0002\b\u00030\u0005\u0012\u0006\u0012\u0004\u0018\u00010\u00060\u0004X\u0082\u0004¢\u0006\u0002\n\u0000¨\u0006\u000f"}, m28850d2 = {"Landroidx/navigation/NavigatorProvider$Companion;", "", "()V", "annotationNames", "", "Ljava/lang/Class;", "", "getNameForNavigator", "navigatorClass", "Landroidx/navigation/Navigator;", "getNameForNavigator$navigation_common_release", "validateName", "", "name", "validateName$navigation_common_release", "navigation-common_release"}, m28849k = 1, m28848mv = {1, 8, 0}, m28846xi = 48)
    /* loaded from: classes2.dex */
    public static final class Companion {
        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        @JvmStatic
        @NotNull
        public final String getNameForNavigator$navigation_common_release(@NotNull Class<? extends Navigator<?>> navigatorClass) {
            Intrinsics.checkNotNullParameter(navigatorClass, "navigatorClass");
            String str = (String) NavigatorProvider.f36388b.get(navigatorClass);
            if (str == null) {
                Navigator.Name name = (Navigator.Name) navigatorClass.getAnnotation(Navigator.Name.class);
                if (name != null) {
                    str = name.value();
                } else {
                    str = null;
                }
                if (validateName$navigation_common_release(str)) {
                    NavigatorProvider.f36388b.put(navigatorClass, str);
                } else {
                    throw new IllegalArgumentException(("No @Navigator.Name annotation found for " + navigatorClass.getSimpleName()).toString());
                }
            }
            Intrinsics.checkNotNull(str);
            return str;
        }

        public final boolean validateName$navigation_common_release(@Nullable String str) {
            if (str != null && str.length() > 0) {
                return true;
            }
            return false;
        }

        public Companion() {
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Nullable
    public final Navigator<? extends NavDestination> addNavigator(@NotNull Navigator<? extends NavDestination> navigator) {
        Intrinsics.checkNotNullParameter(navigator, "navigator");
        return addNavigator(Companion.getNameForNavigator$navigation_common_release(navigator.getClass()), navigator);
    }

    @NotNull
    public final <T extends Navigator<?>> T getNavigator(@NotNull Class<T> navigatorClass) {
        Intrinsics.checkNotNullParameter(navigatorClass, "navigatorClass");
        return (T) getNavigator(Companion.getNameForNavigator$navigation_common_release(navigatorClass));
    }

    @RestrictTo({RestrictTo.Scope.LIBRARY_GROUP})
    @NotNull
    public final Map<String, Navigator<? extends NavDestination>> getNavigators() {
        return AbstractC11687a.toMap(this.f36389a);
    }

    @CallSuper
    @Nullable
    public Navigator<? extends NavDestination> addNavigator(@NotNull String name, @NotNull Navigator<? extends NavDestination> navigator) {
        Intrinsics.checkNotNullParameter(name, "name");
        Intrinsics.checkNotNullParameter(navigator, "navigator");
        if (Companion.validateName$navigation_common_release(name)) {
            Navigator navigator2 = (Navigator) this.f36389a.get(name);
            if (Intrinsics.areEqual(navigator2, navigator)) {
                return navigator;
            }
            boolean z = false;
            if (navigator2 != null && navigator2.isAttached()) {
                z = true;
            }
            if (!z) {
                if (!navigator.isAttached()) {
                    return (Navigator) this.f36389a.put(name, navigator);
                }
                throw new IllegalStateException(("Navigator " + navigator + " is already attached to another NavController").toString());
            }
            throw new IllegalStateException(("Navigator " + navigator + " is replacing an already attached " + navigator2).toString());
        }
        throw new IllegalArgumentException("navigator name cannot be an empty string".toString());
    }

    @CallSuper
    @NotNull
    public <T extends Navigator<?>> T getNavigator(@NotNull String name) {
        Intrinsics.checkNotNullParameter(name, "name");
        if (Companion.validateName$navigation_common_release(name)) {
            T t = (T) this.f36389a.get(name);
            if (t != null) {
                return t;
            }
            throw new IllegalStateException("Could not find Navigator with name \"" + name + "\". You must call NavController.addNavigator() for each navigation type.");
        }
        throw new IllegalArgumentException("navigator name cannot be an empty string".toString());
    }
}

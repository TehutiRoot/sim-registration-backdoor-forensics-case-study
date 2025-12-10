package th.p047co.dtac.android.dtacone.view.appOne.common.composable;

import androidx.navigation.NavBackStackEntry;
import androidx.navigation.NavDestination;
import ch.qos.logback.classic.spi.CallerData;
import com.google.firebase.sessions.settings.RemoteSettings;
import java.util.Iterator;
import java.util.List;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.Ref;
import kotlin.jvm.internal.Reflection;
import kotlin.jvm.internal.SourceDebugExtension;
import kotlin.reflect.KClass;
import kotlin.text.StringsKt__StringsKt;
import org.jetbrains.annotations.Nullable;
import th.p047co.dtac.android.dtacone.view.appOne.tol.model.OneTolScreen;

@Metadata(m29143d1 = {"\u0000\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\"\u0019\u0010\u0000\u001a\u0004\u0018\u00010\u0001*\u0004\u0018\u00010\u00028F¢\u0006\u0006\u001a\u0004\b\u0003\u0010\u0004¨\u0006\u0005"}, m29142d2 = {"route", "Lth/co/dtac/android/dtacone/view/appOne/tol/model/OneTolScreen;", "Landroidx/navigation/NavBackStackEntry;", "getRoute", "(Landroidx/navigation/NavBackStackEntry;)Lth/co/dtac/android/dtacone/view/appOne/tol/model/OneTolScreen;", "app_prodRelease"}, m29141k = 2, m29140mv = {1, 8, 0}, m29138xi = 48)
@SourceDebugExtension({"SMAP\nNavigationHelper.kt\nKotlin\n*S Kotlin\n*F\n+ 1 NavigationHelper.kt\nth/co/dtac/android/dtacone/view/appOne/common/composable/NavigationHelperKt\n+ 2 _Collections.kt\nkotlin/collections/CollectionsKt___CollectionsKt\n*L\n1#1,37:1\n1855#2:38\n288#2,2:39\n1856#2:41\n*S KotlinDebug\n*F\n+ 1 NavigationHelper.kt\nth/co/dtac/android/dtacone/view/appOne/common/composable/NavigationHelperKt\n*L\n22#1:38\n24#1:39,2\n22#1:41\n*E\n"})
/* renamed from: th.co.dtac.android.dtacone.view.appOne.common.composable.NavigationHelperKt */
/* loaded from: classes10.dex */
public final class NavigationHelperKt {
    /* JADX WARN: Type inference failed for: r3v8, types: [th.co.dtac.android.dtacone.view.appOne.tol.model.OneTolScreen, T] */
    @Nullable
    public static final OneTolScreen getRoute(@Nullable NavBackStackEntry navBackStackEntry) {
        String str;
        String substringBefore$default;
        String substringBefore$default2;
        KClass orCreateKotlinClass;
        Object obj;
        Object obj2;
        NavDestination destination;
        if (navBackStackEntry != null && (destination = navBackStackEntry.getDestination()) != null) {
            str = destination.getRoute();
        } else {
            str = null;
        }
        StringBuilder sb = new StringBuilder();
        sb.append("route(String) = ");
        sb.append(str);
        if (str == null || (substringBefore$default = StringsKt__StringsKt.substringBefore$default(str, CallerData.f39637NA, (String) null, 2, (Object) null)) == null || (substringBefore$default2 = StringsKt__StringsKt.substringBefore$default(substringBefore$default, RemoteSettings.FORWARD_SLASH_STRING, (String) null, 2, (Object) null)) == null) {
            return null;
        }
        String qualifiedName = Reflection.getOrCreateKotlinClass(OneTolScreen.class).getQualifiedName();
        Intrinsics.checkNotNull(qualifiedName);
        List<String> split$default = StringsKt__StringsKt.split$default((CharSequence) StringsKt__StringsKt.substringAfter$default(substringBefore$default2, qualifiedName + ".", (String) null, 2, (Object) null), new String[]{"."}, false, 0, 6, (Object) null);
        Ref.ObjectRef objectRef = new Ref.ObjectRef();
        for (String str2 : split$default) {
            Object obj3 = objectRef.element;
            if (obj3 == null) {
                orCreateKotlinClass = Reflection.getOrCreateKotlinClass(OneTolScreen.class);
            } else {
                Intrinsics.checkNotNull(obj3);
                orCreateKotlinClass = Reflection.getOrCreateKotlinClass(obj3.getClass());
            }
            Iterator<T> it = orCreateKotlinClass.getNestedClasses().iterator();
            while (true) {
                if (it.hasNext()) {
                    obj = it.next();
                    if (Intrinsics.areEqual(((KClass) obj).getSimpleName(), str2)) {
                        break;
                    }
                } else {
                    obj = null;
                    break;
                }
            }
            KClass kClass = (KClass) obj;
            if (kClass != null) {
                obj2 = kClass.getObjectInstance();
            } else {
                obj2 = null;
            }
            objectRef.element = (OneTolScreen) obj2;
        }
        return (OneTolScreen) objectRef.element;
    }
}
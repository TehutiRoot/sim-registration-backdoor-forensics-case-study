package androidx.navigation;

import android.app.Activity;
import android.content.ComponentName;
import android.content.Context;
import android.net.Uri;
import androidx.annotation.IdRes;
import androidx.navigation.ActivityNavigator;
import ch.qos.logback.core.CoreConstants;
import com.fasterxml.jackson.databind.annotation.JsonPOJOBuilder;
import com.tom_roush.pdfbox.contentstream.operator.OperatorName;
import kotlin.Deprecated;
import kotlin.Metadata;
import kotlin.ReplaceWith;
import kotlin.jvm.JvmClassMappingKt;
import kotlin.jvm.internal.Intrinsics;
import kotlin.reflect.KClass;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

@NavDestinationDsl
@Metadata(m29143d1 = {"\u0000>\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u000b\n\u0002\u0018\u0002\n\u0002\b\f\b\u0007\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001B\u001b\b\u0017\u0012\u0006\u0010\u0004\u001a\u00020\u0003\u0012\b\b\u0001\u0010\u0006\u001a\u00020\u0005¢\u0006\u0004\b\u0007\u0010\bB\u0019\b\u0016\u0012\u0006\u0010\u0004\u001a\u00020\u0003\u0012\u0006\u0010\n\u001a\u00020\t¢\u0006\u0004\b\u0007\u0010\u000bJ\u000f\u0010\f\u001a\u00020\u0002H\u0016¢\u0006\u0004\b\f\u0010\rR\u0016\u0010\u0011\u001a\u00020\u000e8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b\u000f\u0010\u0010R$\u0010\u0018\u001a\u0004\u0018\u00010\t8\u0006@\u0006X\u0086\u000e¢\u0006\u0012\n\u0004\b\u0012\u0010\u0013\u001a\u0004\b\u0014\u0010\u0015\"\u0004\b\u0016\u0010\u0017R,\u0010!\u001a\f\u0012\u0006\b\u0001\u0012\u00020\u001a\u0018\u00010\u00198\u0006@\u0006X\u0086\u000e¢\u0006\u0012\n\u0004\b\u001b\u0010\u001c\u001a\u0004\b\u001d\u0010\u001e\"\u0004\b\u001f\u0010 R$\u0010%\u001a\u0004\u0018\u00010\t8\u0006@\u0006X\u0086\u000e¢\u0006\u0012\n\u0004\b\"\u0010\u0013\u001a\u0004\b#\u0010\u0015\"\u0004\b$\u0010\u0017R$\u0010-\u001a\u0004\u0018\u00010&8\u0006@\u0006X\u0086\u000e¢\u0006\u0012\n\u0004\b'\u0010(\u001a\u0004\b)\u0010*\"\u0004\b+\u0010,R$\u00101\u001a\u0004\u0018\u00010\t8\u0006@\u0006X\u0086\u000e¢\u0006\u0012\n\u0004\b.\u0010\u0013\u001a\u0004\b/\u0010\u0015\"\u0004\b0\u0010\u0017¨\u00062"}, m29142d2 = {"Landroidx/navigation/ActivityNavigatorDestinationBuilder;", "Landroidx/navigation/NavDestinationBuilder;", "Landroidx/navigation/ActivityNavigator$Destination;", "Landroidx/navigation/ActivityNavigator;", "navigator", "", "id", "<init>", "(Landroidx/navigation/ActivityNavigator;I)V", "", "route", "(Landroidx/navigation/ActivityNavigator;Ljava/lang/String;)V", JsonPOJOBuilder.DEFAULT_BUILD_METHOD, "()Landroidx/navigation/ActivityNavigator$Destination;", "Landroid/content/Context;", OperatorName.CLOSE_PATH, "Landroid/content/Context;", CoreConstants.CONTEXT_SCOPE_VALUE, "i", "Ljava/lang/String;", "getTargetPackage", "()Ljava/lang/String;", "setTargetPackage", "(Ljava/lang/String;)V", "targetPackage", "Lkotlin/reflect/KClass;", "Landroid/app/Activity;", OperatorName.SET_LINE_JOINSTYLE, "Lkotlin/reflect/KClass;", "getActivityClass", "()Lkotlin/reflect/KClass;", "setActivityClass", "(Lkotlin/reflect/KClass;)V", "activityClass", OperatorName.NON_STROKING_CMYK, "getAction", "setAction", "action", "Landroid/net/Uri;", OperatorName.LINE_TO, "Landroid/net/Uri;", "getData", "()Landroid/net/Uri;", "setData", "(Landroid/net/Uri;)V", "data", OperatorName.MOVE_TO, "getDataPattern", "setDataPattern", "dataPattern", "navigation-runtime_release"}, m29141k = 1, m29140mv = {1, 8, 0})
/* loaded from: classes2.dex */
public final class ActivityNavigatorDestinationBuilder extends NavDestinationBuilder<ActivityNavigator.Destination> {

    /* renamed from: h */
    public Context f36264h;

    /* renamed from: i */
    public String f36265i;

    /* renamed from: j */
    public KClass f36266j;

    /* renamed from: k */
    public String f36267k;

    /* renamed from: l */
    public Uri f36268l;

    /* renamed from: m */
    public String f36269m;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    @Deprecated(message = "Use routes to create your ActivityNavigatorDestinationBuilder instead", replaceWith = @ReplaceWith(expression = "ActivityNavigatorDestinationBuilder(navigator, route = id.toString())", imports = {}))
    public ActivityNavigatorDestinationBuilder(@NotNull ActivityNavigator navigator, @IdRes int i) {
        super(navigator, i);
        Intrinsics.checkNotNullParameter(navigator, "navigator");
        this.f36264h = navigator.getContext();
    }

    @Nullable
    public final String getAction() {
        return this.f36267k;
    }

    @Nullable
    public final KClass<? extends Activity> getActivityClass() {
        return this.f36266j;
    }

    @Nullable
    public final Uri getData() {
        return this.f36268l;
    }

    @Nullable
    public final String getDataPattern() {
        return this.f36269m;
    }

    @Nullable
    public final String getTargetPackage() {
        return this.f36265i;
    }

    public final void setAction(@Nullable String str) {
        this.f36267k = str;
    }

    public final void setActivityClass(@Nullable KClass<? extends Activity> kClass) {
        this.f36266j = kClass;
    }

    public final void setData(@Nullable Uri uri) {
        this.f36268l = uri;
    }

    public final void setDataPattern(@Nullable String str) {
        this.f36269m = str;
    }

    public final void setTargetPackage(@Nullable String str) {
        this.f36265i = str;
    }

    /* JADX WARN: Can't rename method to resolve collision */
    @Override // androidx.navigation.NavDestinationBuilder
    @NotNull
    public ActivityNavigator.Destination build() {
        ActivityNavigator.Destination destination = (ActivityNavigator.Destination) super.build();
        destination.setTargetPackage(this.f36265i);
        KClass kClass = this.f36266j;
        if (kClass != null) {
            destination.setComponentName(new ComponentName(this.f36264h, JvmClassMappingKt.getJavaClass(kClass)));
        }
        destination.setAction(this.f36267k);
        destination.setData(this.f36268l);
        destination.setDataPattern(this.f36269m);
        return destination;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public ActivityNavigatorDestinationBuilder(@NotNull ActivityNavigator navigator, @NotNull String route) {
        super(navigator, route);
        Intrinsics.checkNotNullParameter(navigator, "navigator");
        Intrinsics.checkNotNullParameter(route, "route");
        this.f36264h = navigator.getContext();
    }
}
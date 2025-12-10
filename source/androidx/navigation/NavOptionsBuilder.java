package androidx.navigation;

import androidx.annotation.IdRes;
import androidx.navigation.NavOptions;
import com.fasterxml.jackson.databind.annotation.JsonPOJOBuilder;
import com.tom_roush.pdfbox.contentstream.operator.OperatorName;
import com.tom_roush.pdfbox.pdmodel.common.PDPageLabelRange;
import kotlin.Deprecated;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.SourceDebugExtension;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

@Metadata(m28851d1 = {"\u0000N\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\b\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000b\n\u0002\b\"\b\u0007\u0018\u00002\u00020\u0001B\u0007¢\u0006\u0004\b\u0002\u0010\u0003J2\u0010\u000b\u001a\u00020\b2\b\b\u0001\u0010\u0005\u001a\u00020\u00042\u0019\b\u0002\u0010\n\u001a\u0013\u0012\u0004\u0012\u00020\u0007\u0012\u0004\u0012\u00020\b0\u0006¢\u0006\u0002\b\t¢\u0006\u0004\b\u000b\u0010\fJ0\u0010\u000b\u001a\u00020\b2\u0006\u0010\u000e\u001a\u00020\r2\u0019\b\u0002\u0010\n\u001a\u0013\u0012\u0004\u0012\u00020\u0007\u0012\u0004\u0012\u00020\b0\u0006¢\u0006\u0002\b\t¢\u0006\u0004\b\u000b\u0010\u000fJ&\u0010\u0012\u001a\u00020\b2\u0017\u0010\u0011\u001a\u0013\u0012\u0004\u0012\u00020\u0010\u0012\u0004\u0012\u00020\b0\u0006¢\u0006\u0002\b\t¢\u0006\u0004\b\u0012\u0010\u0013J\u000f\u0010\u0017\u001a\u00020\u0014H\u0000¢\u0006\u0004\b\u0015\u0010\u0016R\u0014\u0010\u001b\u001a\u00020\u00188\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0019\u0010\u001aR\"\u0010#\u001a\u00020\u001c8\u0006@\u0006X\u0086\u000e¢\u0006\u0012\n\u0004\b\u001d\u0010\u001e\u001a\u0004\b\u001f\u0010 \"\u0004\b!\u0010\"R*\u0010(\u001a\u00020\u001c2\u0006\u0010$\u001a\u00020\u001c8F@FX\u0086\u000e¢\u0006\u0012\n\u0004\b%\u0010\u001e\u001a\u0004\b&\u0010 \"\u0004\b'\u0010\"R*\u00100\u001a\u00020\u00042\u0006\u0010)\u001a\u00020\u00048\u0006@@X\u0087\u000e¢\u0006\u0012\n\u0004\b*\u0010+\u001a\u0004\b,\u0010-\"\u0004\b.\u0010/R.\u00106\u001a\u0004\u0018\u00010\r2\b\u0010)\u001a\u0004\u0018\u00010\r8\u0006@BX\u0086\u000e¢\u0006\u0012\n\u0004\b1\u00102\u001a\u0004\b3\u00104\"\u0004\b\u0019\u00105R\u0016\u00108\u001a\u00020\u001c8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b7\u0010\u001eR\u0016\u0010:\u001a\u00020\u001c8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b9\u0010\u001eR*\u0010\u000b\u001a\u00020\u00042\u0006\u0010)\u001a\u00020\u00048F@GX\u0087\u000e¢\u0006\u0012\u0012\u0004\b=\u0010\u0003\u001a\u0004\b;\u0010-\"\u0004\b<\u0010/¨\u0006>"}, m28850d2 = {"Landroidx/navigation/NavOptionsBuilder;", "", "<init>", "()V", "", "id", "Lkotlin/Function1;", "Landroidx/navigation/PopUpToBuilder;", "", "Lkotlin/ExtensionFunctionType;", "popUpToBuilder", "popUpTo", "(ILkotlin/jvm/functions/Function1;)V", "", "route", "(Ljava/lang/String;Lkotlin/jvm/functions/Function1;)V", "Landroidx/navigation/AnimBuilder;", "animBuilder", "anim", "(Lkotlin/jvm/functions/Function1;)V", "Landroidx/navigation/NavOptions;", "build$navigation_common_release", "()Landroidx/navigation/NavOptions;", JsonPOJOBuilder.DEFAULT_BUILD_METHOD, "Landroidx/navigation/NavOptions$Builder;", PDPageLabelRange.STYLE_LETTERS_LOWER, "Landroidx/navigation/NavOptions$Builder;", "builder", "", OperatorName.CLOSE_FILL_NON_ZERO_AND_STROKE, "Z", "getLaunchSingleTop", "()Z", "setLaunchSingleTop", "(Z)V", "launchSingleTop", "<set-?>", OperatorName.CURVE_TO, "getRestoreState", "setRestoreState", "restoreState", "value", "d", "I", "getPopUpToId", "()I", "setPopUpToId$navigation_common_release", "(I)V", "popUpToId", "e", "Ljava/lang/String;", "getPopUpToRoute", "()Ljava/lang/String;", "(Ljava/lang/String;)V", "popUpToRoute", OperatorName.FILL_NON_ZERO, "inclusive", OperatorName.NON_STROKING_GRAY, "saveState", "getPopUpTo", "setPopUpTo", "getPopUpTo$annotations", "navigation-common_release"}, m28849k = 1, m28848mv = {1, 8, 0})
@NavOptionsDsl
@SourceDebugExtension({"SMAP\nNavOptionsBuilder.kt\nKotlin\n*S Kotlin\n*F\n+ 1 NavOptionsBuilder.kt\nandroidx/navigation/NavOptionsBuilder\n+ 2 fake.kt\nkotlin/jvm/internal/FakeKt\n*L\n1#1,211:1\n1#2:212\n*E\n"})
/* loaded from: classes2.dex */
public final class NavOptionsBuilder {

    /* renamed from: b */
    public boolean f36373b;

    /* renamed from: c */
    public boolean f36374c;

    /* renamed from: e */
    public String f36376e;

    /* renamed from: f */
    public boolean f36377f;

    /* renamed from: g */
    public boolean f36378g;

    /* renamed from: a */
    public final NavOptions.Builder f36372a = new NavOptions.Builder();

    /* renamed from: d */
    public int f36375d = -1;

    @Deprecated(message = "Use the popUpToId property.")
    public static /* synthetic */ void getPopUpTo$annotations() {
    }

    /* JADX WARN: Multi-variable type inference failed */
    public static /* synthetic */ void popUpTo$default(NavOptionsBuilder navOptionsBuilder, int i, Function1 function1, int i2, Object obj) {
        if ((i2 & 2) != 0) {
            function1 = NavOptionsBuilder$popUpTo$1.INSTANCE;
        }
        navOptionsBuilder.popUpTo(i, function1);
    }

    /* renamed from: a */
    public final void m53833a(String str) {
        if (str != null) {
            if (!AbstractC20204hN1.isBlank(str)) {
                this.f36376e = str;
                this.f36377f = false;
                return;
            }
            throw new IllegalArgumentException("Cannot pop up to an empty route".toString());
        }
    }

    public final void anim(@NotNull Function1<? super AnimBuilder, Unit> animBuilder) {
        Intrinsics.checkNotNullParameter(animBuilder, "animBuilder");
        AnimBuilder animBuilder2 = new AnimBuilder();
        animBuilder.invoke(animBuilder2);
        this.f36372a.setEnterAnim(animBuilder2.getEnter()).setExitAnim(animBuilder2.getExit()).setPopEnterAnim(animBuilder2.getPopEnter()).setPopExitAnim(animBuilder2.getPopExit());
    }

    @NotNull
    public final NavOptions build$navigation_common_release() {
        NavOptions.Builder builder = this.f36372a;
        builder.setLaunchSingleTop(this.f36373b);
        builder.setRestoreState(this.f36374c);
        String str = this.f36376e;
        if (str != null) {
            builder.setPopUpTo(str, this.f36377f, this.f36378g);
        } else {
            builder.setPopUpTo(this.f36375d, this.f36377f, this.f36378g);
        }
        return builder.build();
    }

    public final boolean getLaunchSingleTop() {
        return this.f36373b;
    }

    public final int getPopUpTo() {
        return this.f36375d;
    }

    public final int getPopUpToId() {
        return this.f36375d;
    }

    @Nullable
    public final String getPopUpToRoute() {
        return this.f36376e;
    }

    public final boolean getRestoreState() {
        return this.f36374c;
    }

    public final void popUpTo(@IdRes int i, @NotNull Function1<? super PopUpToBuilder, Unit> popUpToBuilder) {
        Intrinsics.checkNotNullParameter(popUpToBuilder, "popUpToBuilder");
        setPopUpToId$navigation_common_release(i);
        m53833a(null);
        PopUpToBuilder popUpToBuilder2 = new PopUpToBuilder();
        popUpToBuilder.invoke(popUpToBuilder2);
        this.f36377f = popUpToBuilder2.getInclusive();
        this.f36378g = popUpToBuilder2.getSaveState();
    }

    public final void setLaunchSingleTop(boolean z) {
        this.f36373b = z;
    }

    @Deprecated(message = "Use the popUpTo function and passing in the id.")
    public final void setPopUpTo(int i) {
        popUpTo$default(this, i, (Function1) null, 2, (Object) null);
    }

    public final void setPopUpToId$navigation_common_release(int i) {
        this.f36375d = i;
        this.f36377f = false;
    }

    public final void setRestoreState(boolean z) {
        this.f36374c = z;
    }

    /* JADX WARN: Multi-variable type inference failed */
    public static /* synthetic */ void popUpTo$default(NavOptionsBuilder navOptionsBuilder, String str, Function1 function1, int i, Object obj) {
        if ((i & 2) != 0) {
            function1 = NavOptionsBuilder$popUpTo$2.INSTANCE;
        }
        navOptionsBuilder.popUpTo(str, function1);
    }

    public final void popUpTo(@NotNull String route, @NotNull Function1<? super PopUpToBuilder, Unit> popUpToBuilder) {
        Intrinsics.checkNotNullParameter(route, "route");
        Intrinsics.checkNotNullParameter(popUpToBuilder, "popUpToBuilder");
        m53833a(route);
        setPopUpToId$navigation_common_release(-1);
        PopUpToBuilder popUpToBuilder2 = new PopUpToBuilder();
        popUpToBuilder.invoke(popUpToBuilder2);
        this.f36377f = popUpToBuilder2.getInclusive();
        this.f36378g = popUpToBuilder2.getSaveState();
    }
}

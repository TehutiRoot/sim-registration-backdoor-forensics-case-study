package androidx.navigation;

import androidx.annotation.AnimRes;
import androidx.annotation.AnimatorRes;
import androidx.annotation.IdRes;
import com.fasterxml.jackson.databind.annotation.JsonPOJOBuilder;
import com.tom_roush.pdfbox.contentstream.operator.OperatorName;
import com.tom_roush.pdfbox.pdmodel.common.PDPageLabelRange;
import kotlin.Deprecated;
import kotlin.Metadata;
import kotlin.ReplaceWith;
import kotlin.jvm.JvmOverloads;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

@Metadata(m29143d1 = {"\u0000 \n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\t\n\u0002\u0010\u000e\n\u0002\b$\u0018\u00002\u00020\u0001:\u00012B[\b\u0000\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0004\u001a\u00020\u0002\u0012\b\b\u0001\u0010\u0006\u001a\u00020\u0005\u0012\u0006\u0010\u0007\u001a\u00020\u0002\u0012\u0006\u0010\b\u001a\u00020\u0002\u0012\b\b\u0001\u0010\t\u001a\u00020\u0005\u0012\b\b\u0001\u0010\n\u001a\u00020\u0005\u0012\b\b\u0001\u0010\u000b\u001a\u00020\u0005\u0012\b\b\u0001\u0010\f\u001a\u00020\u0005¢\u0006\u0004\b\r\u0010\u000eBS\b\u0010\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0004\u001a\u00020\u0002\u0012\b\u0010\u0010\u001a\u0004\u0018\u00010\u000f\u0012\u0006\u0010\u0007\u001a\u00020\u0002\u0012\u0006\u0010\b\u001a\u00020\u0002\u0012\u0006\u0010\t\u001a\u00020\u0005\u0012\u0006\u0010\n\u001a\u00020\u0005\u0012\u0006\u0010\u000b\u001a\u00020\u0005\u0012\u0006\u0010\f\u001a\u00020\u0005¢\u0006\u0004\b\r\u0010\u0011J\u000f\u0010\u0012\u001a\u00020\u0005H\u0007¢\u0006\u0004\b\u0012\u0010\u0013J\r\u0010\u0014\u001a\u00020\u0002¢\u0006\u0004\b\u0014\u0010\u0015J\r\u0010\u0016\u001a\u00020\u0002¢\u0006\u0004\b\u0016\u0010\u0015J\r\u0010\u0017\u001a\u00020\u0002¢\u0006\u0004\b\u0017\u0010\u0015J\r\u0010\u0018\u001a\u00020\u0002¢\u0006\u0004\b\u0018\u0010\u0015J\u001a\u0010\u001a\u001a\u00020\u00022\b\u0010\u0019\u001a\u0004\u0018\u00010\u0001H\u0096\u0002¢\u0006\u0004\b\u001a\u0010\u001bJ\u000f\u0010\u001c\u001a\u00020\u0005H\u0016¢\u0006\u0004\b\u001c\u0010\u0013R\u0014\u0010\u0003\u001a\u00020\u00028\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u001d\u0010\u001eR\u0014\u0010\u0004\u001a\u00020\u00028\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u001f\u0010\u001eR\u001a\u0010\u0006\u001a\u00020\u00058\u0007X\u0087\u0004¢\u0006\f\n\u0004\b \u0010!\u001a\u0004\b\"\u0010\u0013R\u0014\u0010\u0007\u001a\u00020\u00028\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b#\u0010\u001eR\u0014\u0010\b\u001a\u00020\u00028\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b$\u0010\u001eR\u0017\u0010\t\u001a\u00020\u00058\u0007¢\u0006\f\n\u0004\b%\u0010!\u001a\u0004\b&\u0010\u0013R\u0017\u0010\n\u001a\u00020\u00058\u0007¢\u0006\f\n\u0004\b'\u0010!\u001a\u0004\b(\u0010\u0013R\u0017\u0010\u000b\u001a\u00020\u00058\u0007¢\u0006\f\n\u0004\b)\u0010!\u001a\u0004\b*\u0010\u0013R\u0017\u0010\f\u001a\u00020\u00058\u0007¢\u0006\f\n\u0004\b+\u0010!\u001a\u0004\b,\u0010\u0013R(\u0010\u0010\u001a\u0004\u0018\u00010\u000f2\b\u0010-\u001a\u0004\u0018\u00010\u000f8\u0006@BX\u0086\u000e¢\u0006\f\n\u0004\b.\u0010/\u001a\u0004\b0\u00101¨\u00063"}, m29142d2 = {"Landroidx/navigation/NavOptions;", "", "", "singleTop", "restoreState", "", "popUpToId", "popUpToInclusive", "popUpToSaveState", "enterAnim", "exitAnim", "popEnterAnim", "popExitAnim", "<init>", "(ZZIZZIIII)V", "", "popUpToRoute", "(ZZLjava/lang/String;ZZIIII)V", "getPopUpTo", "()I", "shouldLaunchSingleTop", "()Z", "shouldRestoreState", "isPopUpToInclusive", "shouldPopUpToSaveState", "other", "equals", "(Ljava/lang/Object;)Z", "hashCode", PDPageLabelRange.STYLE_LETTERS_LOWER, "Z", OperatorName.CLOSE_FILL_NON_ZERO_AND_STROKE, OperatorName.CURVE_TO, "I", "getPopUpToId", "d", "e", OperatorName.FILL_NON_ZERO, "getEnterAnim", OperatorName.NON_STROKING_GRAY, "getExitAnim", OperatorName.CLOSE_PATH, "getPopEnterAnim", "i", "getPopExitAnim", "<set-?>", OperatorName.SET_LINE_JOINSTYLE, "Ljava/lang/String;", "getPopUpToRoute", "()Ljava/lang/String;", "Builder", "navigation-common_release"}, m29141k = 1, m29140mv = {1, 8, 0})
/* loaded from: classes2.dex */
public final class NavOptions {

    /* renamed from: a */
    public final boolean f36440a;

    /* renamed from: b */
    public final boolean f36441b;

    /* renamed from: c */
    public final int f36442c;

    /* renamed from: d */
    public final boolean f36443d;

    /* renamed from: e */
    public final boolean f36444e;

    /* renamed from: f */
    public final int f36445f;

    /* renamed from: g */
    public final int f36446g;

    /* renamed from: h */
    public final int f36447h;

    /* renamed from: i */
    public final int f36448i;

    /* renamed from: j */
    public String f36449j;

    @Metadata(m29143d1 = {"\u0000,\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\u000b\n\u0002\b\u0005\n\u0002\u0010\b\n\u0002\b\u0005\n\u0002\u0010\u000e\n\u0002\b\u000b\n\u0002\u0018\u0002\n\u0002\b\u0014\u0018\u00002\u00020\u0001B\u0007¢\u0006\u0004\b\u0002\u0010\u0003J\u0015\u0010\u0006\u001a\u00020\u00002\u0006\u0010\u0005\u001a\u00020\u0004¢\u0006\u0004\b\u0006\u0010\u0007J\u0015\u0010\t\u001a\u00020\u00002\u0006\u0010\b\u001a\u00020\u0004¢\u0006\u0004\b\t\u0010\u0007J+\u0010\u000e\u001a\u00020\u00002\b\b\u0001\u0010\u000b\u001a\u00020\n2\u0006\u0010\f\u001a\u00020\u00042\b\b\u0002\u0010\r\u001a\u00020\u0004H\u0007¢\u0006\u0004\b\u000e\u0010\u000fJ+\u0010\u000e\u001a\u00020\u00002\b\u0010\u0011\u001a\u0004\u0018\u00010\u00102\u0006\u0010\f\u001a\u00020\u00042\b\b\u0002\u0010\r\u001a\u00020\u0004H\u0007¢\u0006\u0004\b\u000e\u0010\u0012J\u0017\u0010\u0014\u001a\u00020\u00002\b\b\u0001\u0010\u0013\u001a\u00020\n¢\u0006\u0004\b\u0014\u0010\u0015J\u0017\u0010\u0017\u001a\u00020\u00002\b\b\u0001\u0010\u0016\u001a\u00020\n¢\u0006\u0004\b\u0017\u0010\u0015J\u0017\u0010\u0019\u001a\u00020\u00002\b\b\u0001\u0010\u0018\u001a\u00020\n¢\u0006\u0004\b\u0019\u0010\u0015J\u0017\u0010\u001b\u001a\u00020\u00002\b\b\u0001\u0010\u001a\u001a\u00020\n¢\u0006\u0004\b\u001b\u0010\u0015J\r\u0010\u001d\u001a\u00020\u001c¢\u0006\u0004\b\u001d\u0010\u001eR\u0016\u0010\u0005\u001a\u00020\u00048\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b\u001f\u0010 R\u0016\u0010\b\u001a\u00020\u00048\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b!\u0010 R\u0016\u0010$\u001a\u00020\n8\u0002@\u0002X\u0083\u000e¢\u0006\u0006\n\u0004\b\"\u0010#R\u0018\u0010'\u001a\u0004\u0018\u00010\u00108\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b%\u0010&R\u0016\u0010)\u001a\u00020\u00048\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b(\u0010 R\u0016\u0010+\u001a\u00020\u00048\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b*\u0010 R\u0016\u0010\u0013\u001a\u00020\n8\u0002@\u0002X\u0083\u000e¢\u0006\u0006\n\u0004\b,\u0010#R\u0016\u0010\u0016\u001a\u00020\n8\u0002@\u0002X\u0083\u000e¢\u0006\u0006\n\u0004\b-\u0010#R\u0016\u0010\u0018\u001a\u00020\n8\u0002@\u0002X\u0083\u000e¢\u0006\u0006\n\u0004\b.\u0010#R\u0016\u0010\u001a\u001a\u00020\n8\u0002@\u0002X\u0083\u000e¢\u0006\u0006\n\u0004\b/\u0010#¨\u00060"}, m29142d2 = {"Landroidx/navigation/NavOptions$Builder;", "", "<init>", "()V", "", "singleTop", "setLaunchSingleTop", "(Z)Landroidx/navigation/NavOptions$Builder;", "restoreState", "setRestoreState", "", "destinationId", "inclusive", "saveState", "setPopUpTo", "(IZZ)Landroidx/navigation/NavOptions$Builder;", "", "route", "(Ljava/lang/String;ZZ)Landroidx/navigation/NavOptions$Builder;", "enterAnim", "setEnterAnim", "(I)Landroidx/navigation/NavOptions$Builder;", "exitAnim", "setExitAnim", "popEnterAnim", "setPopEnterAnim", "popExitAnim", "setPopExitAnim", "Landroidx/navigation/NavOptions;", JsonPOJOBuilder.DEFAULT_BUILD_METHOD, "()Landroidx/navigation/NavOptions;", PDPageLabelRange.STYLE_LETTERS_LOWER, "Z", OperatorName.CLOSE_FILL_NON_ZERO_AND_STROKE, OperatorName.CURVE_TO, "I", "popUpToId", "d", "Ljava/lang/String;", "popUpToRoute", "e", "popUpToInclusive", OperatorName.FILL_NON_ZERO, "popUpToSaveState", OperatorName.NON_STROKING_GRAY, OperatorName.CLOSE_PATH, "i", OperatorName.SET_LINE_JOINSTYLE, "navigation-common_release"}, m29141k = 1, m29140mv = {1, 8, 0})
    /* loaded from: classes2.dex */
    public static final class Builder {

        /* renamed from: a */
        public boolean f36450a;

        /* renamed from: b */
        public boolean f36451b;

        /* renamed from: d */
        public String f36453d;

        /* renamed from: e */
        public boolean f36454e;

        /* renamed from: f */
        public boolean f36455f;

        /* renamed from: c */
        public int f36452c = -1;

        /* renamed from: g */
        public int f36456g = -1;

        /* renamed from: h */
        public int f36457h = -1;

        /* renamed from: i */
        public int f36458i = -1;

        /* renamed from: j */
        public int f36459j = -1;

        public static /* synthetic */ Builder setPopUpTo$default(Builder builder, int i, boolean z, boolean z2, int i2, Object obj) {
            if ((i2 & 4) != 0) {
                z2 = false;
            }
            return builder.setPopUpTo(i, z, z2);
        }

        @NotNull
        public final NavOptions build() {
            String str = this.f36453d;
            if (str != null) {
                return new NavOptions(this.f36450a, this.f36451b, str, this.f36454e, this.f36455f, this.f36456g, this.f36457h, this.f36458i, this.f36459j);
            }
            return new NavOptions(this.f36450a, this.f36451b, this.f36452c, this.f36454e, this.f36455f, this.f36456g, this.f36457h, this.f36458i, this.f36459j);
        }

        @NotNull
        public final Builder setEnterAnim(@AnimRes @AnimatorRes int i) {
            this.f36456g = i;
            return this;
        }

        @NotNull
        public final Builder setExitAnim(@AnimRes @AnimatorRes int i) {
            this.f36457h = i;
            return this;
        }

        @NotNull
        public final Builder setLaunchSingleTop(boolean z) {
            this.f36450a = z;
            return this;
        }

        @NotNull
        public final Builder setPopEnterAnim(@AnimRes @AnimatorRes int i) {
            this.f36458i = i;
            return this;
        }

        @NotNull
        public final Builder setPopExitAnim(@AnimRes @AnimatorRes int i) {
            this.f36459j = i;
            return this;
        }

        @JvmOverloads
        @NotNull
        public final Builder setPopUpTo(@IdRes int i, boolean z) {
            return setPopUpTo$default(this, i, z, false, 4, (Object) null);
        }

        @NotNull
        public final Builder setRestoreState(boolean z) {
            this.f36451b = z;
            return this;
        }

        public static /* synthetic */ Builder setPopUpTo$default(Builder builder, String str, boolean z, boolean z2, int i, Object obj) {
            if ((i & 4) != 0) {
                z2 = false;
            }
            return builder.setPopUpTo(str, z, z2);
        }

        @JvmOverloads
        @NotNull
        public final Builder setPopUpTo(@Nullable String str, boolean z) {
            return setPopUpTo$default(this, str, z, false, 4, (Object) null);
        }

        @JvmOverloads
        @NotNull
        public final Builder setPopUpTo(@IdRes int i, boolean z, boolean z2) {
            this.f36452c = i;
            this.f36453d = null;
            this.f36454e = z;
            this.f36455f = z2;
            return this;
        }

        @JvmOverloads
        @NotNull
        public final Builder setPopUpTo(@Nullable String str, boolean z, boolean z2) {
            this.f36453d = str;
            this.f36452c = -1;
            this.f36454e = z;
            this.f36455f = z2;
            return this;
        }
    }

    public NavOptions(boolean z, boolean z2, @IdRes int i, boolean z3, boolean z4, @AnimRes @AnimatorRes int i2, @AnimRes @AnimatorRes int i3, @AnimRes @AnimatorRes int i4, @AnimRes @AnimatorRes int i5) {
        this.f36440a = z;
        this.f36441b = z2;
        this.f36442c = i;
        this.f36443d = z3;
        this.f36444e = z4;
        this.f36445f = i2;
        this.f36446g = i3;
        this.f36447h = i4;
        this.f36448i = i5;
    }

    public boolean equals(@Nullable Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || !Intrinsics.areEqual(NavOptions.class, obj.getClass())) {
            return false;
        }
        NavOptions navOptions = (NavOptions) obj;
        if (this.f36440a == navOptions.f36440a && this.f36441b == navOptions.f36441b && this.f36442c == navOptions.f36442c && Intrinsics.areEqual(this.f36449j, navOptions.f36449j) && this.f36443d == navOptions.f36443d && this.f36444e == navOptions.f36444e && this.f36445f == navOptions.f36445f && this.f36446g == navOptions.f36446g && this.f36447h == navOptions.f36447h && this.f36448i == navOptions.f36448i) {
            return true;
        }
        return false;
    }

    @AnimRes
    @AnimatorRes
    public final int getEnterAnim() {
        return this.f36445f;
    }

    @AnimRes
    @AnimatorRes
    public final int getExitAnim() {
        return this.f36446g;
    }

    @AnimRes
    @AnimatorRes
    public final int getPopEnterAnim() {
        return this.f36447h;
    }

    @AnimRes
    @AnimatorRes
    public final int getPopExitAnim() {
        return this.f36448i;
    }

    @Deprecated(message = "Use popUpToId instead.", replaceWith = @ReplaceWith(expression = "popUpToId", imports = {}))
    @IdRes
    public final int getPopUpTo() {
        return this.f36442c;
    }

    @IdRes
    public final int getPopUpToId() {
        return this.f36442c;
    }

    @Nullable
    public final String getPopUpToRoute() {
        return this.f36449j;
    }

    public int hashCode() {
        int i;
        int i2 = (((((shouldLaunchSingleTop() ? 1 : 0) * 31) + (shouldRestoreState() ? 1 : 0)) * 31) + this.f36442c) * 31;
        String str = this.f36449j;
        if (str != null) {
            i = str.hashCode();
        } else {
            i = 0;
        }
        return ((((((((((((i2 + i) * 31) + (isPopUpToInclusive() ? 1 : 0)) * 31) + (shouldPopUpToSaveState() ? 1 : 0)) * 31) + this.f36445f) * 31) + this.f36446g) * 31) + this.f36447h) * 31) + this.f36448i;
    }

    public final boolean isPopUpToInclusive() {
        return this.f36443d;
    }

    public final boolean shouldLaunchSingleTop() {
        return this.f36440a;
    }

    public final boolean shouldPopUpToSaveState() {
        return this.f36444e;
    }

    public final boolean shouldRestoreState() {
        return this.f36441b;
    }

    public NavOptions(boolean z, boolean z2, @Nullable String str, boolean z3, boolean z4, int i, int i2, int i3, int i4) {
        this(z, z2, NavDestination.Companion.createRoute(str).hashCode(), z3, z4, i, i2, i3, i4);
        this.f36449j = str;
    }
}
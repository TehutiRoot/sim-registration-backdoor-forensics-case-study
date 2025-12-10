package androidx.activity;

import android.content.res.Resources;
import androidx.annotation.ColorInt;
import com.tom_roush.pdfbox.contentstream.operator.OperatorName;
import com.tom_roush.pdfbox.pdmodel.common.PDPageLabelRange;
import kotlin.Metadata;
import kotlin.jvm.JvmOverloads;
import kotlin.jvm.JvmStatic;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import kotlinx.coroutines.DebugKt;
import org.jetbrains.annotations.NotNull;

@Metadata(m28851d1 = {"\u0000 \n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\b\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000b\n\u0002\b\u0016\u0018\u0000 \u001d2\u00020\u0001:\u0001\u001dB5\b\u0002\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0004\u001a\u00020\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0002\u0012\u0012\u0010\t\u001a\u000e\u0012\u0004\u0012\u00020\u0007\u0012\u0004\u0012\u00020\b0\u0006¢\u0006\u0004\b\n\u0010\u000bJ\u0017\u0010\u000f\u001a\u00020\u00022\u0006\u0010\f\u001a\u00020\bH\u0000¢\u0006\u0004\b\r\u0010\u000eJ\u0017\u0010\u0011\u001a\u00020\u00022\u0006\u0010\f\u001a\u00020\bH\u0000¢\u0006\u0004\b\u0010\u0010\u000eR\u0014\u0010\u0003\u001a\u00020\u00028\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0012\u0010\u0013R\u001a\u0010\u0004\u001a\u00020\u00028\u0000X\u0080\u0004¢\u0006\f\n\u0004\b\u0014\u0010\u0013\u001a\u0004\b\u0015\u0010\u0016R\u001a\u0010\u0005\u001a\u00020\u00028\u0000X\u0080\u0004¢\u0006\f\n\u0004\b\u0017\u0010\u0013\u001a\u0004\b\u0018\u0010\u0016R&\u0010\t\u001a\u000e\u0012\u0004\u0012\u00020\u0007\u0012\u0004\u0012\u00020\b0\u00068\u0000X\u0080\u0004¢\u0006\f\n\u0004\b\u0019\u0010\u001a\u001a\u0004\b\u001b\u0010\u001c¨\u0006\u001e"}, m28850d2 = {"Landroidx/activity/SystemBarStyle;", "", "", "lightScrim", "darkScrim", "nightMode", "Lkotlin/Function1;", "Landroid/content/res/Resources;", "", "detectDarkMode", "<init>", "(IIILkotlin/jvm/functions/Function1;)V", "isDark", "getScrim$activity_release", "(Z)I", "getScrim", "getScrimWithEnforcedContrast$activity_release", "getScrimWithEnforcedContrast", PDPageLabelRange.STYLE_LETTERS_LOWER, "I", OperatorName.CLOSE_FILL_NON_ZERO_AND_STROKE, "getDarkScrim$activity_release", "()I", OperatorName.CURVE_TO, "getNightMode$activity_release", "d", "Lkotlin/jvm/functions/Function1;", "getDetectDarkMode$activity_release", "()Lkotlin/jvm/functions/Function1;", "Companion", "activity_release"}, m28849k = 1, m28848mv = {1, 8, 0})
/* loaded from: classes.dex */
public final class SystemBarStyle {
    @NotNull
    public static final Companion Companion = new Companion(null);

    /* renamed from: a */
    public final int f8699a;

    /* renamed from: b */
    public final int f8700b;

    /* renamed from: c */
    public final int f8701c;

    /* renamed from: d */
    public final Function1 f8702d;

    @Metadata(m28851d1 = {"\u0000*\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000b\n\u0002\b\u0004\b\u0086\u0003\u0018\u00002\u00020\u0001B\u0007\b\u0002¢\u0006\u0002\u0010\u0002J2\u0010\u0003\u001a\u00020\u00042\b\b\u0001\u0010\u0005\u001a\u00020\u00062\b\b\u0001\u0010\u0007\u001a\u00020\u00062\u0014\b\u0002\u0010\b\u001a\u000e\u0012\u0004\u0012\u00020\n\u0012\u0004\u0012\u00020\u000b0\tH\u0007J\u0012\u0010\f\u001a\u00020\u00042\b\b\u0001\u0010\r\u001a\u00020\u0006H\u0007J\u001c\u0010\u000e\u001a\u00020\u00042\b\b\u0001\u0010\r\u001a\u00020\u00062\b\b\u0001\u0010\u0007\u001a\u00020\u0006H\u0007¨\u0006\u000f"}, m28850d2 = {"Landroidx/activity/SystemBarStyle$Companion;", "", "()V", DebugKt.DEBUG_PROPERTY_VALUE_AUTO, "Landroidx/activity/SystemBarStyle;", "lightScrim", "", "darkScrim", "detectDarkMode", "Lkotlin/Function1;", "Landroid/content/res/Resources;", "", "dark", "scrim", "light", "activity_release"}, m28849k = 1, m28848mv = {1, 8, 0}, m28846xi = 48)
    /* loaded from: classes.dex */
    public static final class Companion {
        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        /* JADX WARN: Multi-variable type inference failed */
        public static /* synthetic */ SystemBarStyle auto$default(Companion companion, int i, int i2, Function1 function1, int i3, Object obj) {
            if ((i3 & 4) != 0) {
                function1 = SystemBarStyle$Companion$auto$1.INSTANCE;
            }
            return companion.auto(i, i2, function1);
        }

        @JvmStatic
        @JvmOverloads
        @NotNull
        public final SystemBarStyle auto(@ColorInt int i, @ColorInt int i2) {
            return auto$default(this, i, i2, null, 4, null);
        }

        @JvmStatic
        @NotNull
        public final SystemBarStyle dark(@ColorInt int i) {
            return new SystemBarStyle(i, i, 2, SystemBarStyle$Companion$dark$1.INSTANCE, null);
        }

        @JvmStatic
        @NotNull
        public final SystemBarStyle light(@ColorInt int i, @ColorInt int i2) {
            return new SystemBarStyle(i, i2, 1, SystemBarStyle$Companion$light$1.INSTANCE, null);
        }

        public Companion() {
        }

        @JvmStatic
        @JvmOverloads
        @NotNull
        public final SystemBarStyle auto(@ColorInt int i, @ColorInt int i2, @NotNull Function1<? super Resources, Boolean> detectDarkMode) {
            Intrinsics.checkNotNullParameter(detectDarkMode, "detectDarkMode");
            return new SystemBarStyle(i, i2, 0, detectDarkMode, null);
        }
    }

    public /* synthetic */ SystemBarStyle(int i, int i2, int i3, Function1 function1, DefaultConstructorMarker defaultConstructorMarker) {
        this(i, i2, i3, function1);
    }

    @JvmStatic
    @JvmOverloads
    @NotNull
    public static final SystemBarStyle auto(@ColorInt int i, @ColorInt int i2) {
        return Companion.auto(i, i2);
    }

    @JvmStatic
    @NotNull
    public static final SystemBarStyle dark(@ColorInt int i) {
        return Companion.dark(i);
    }

    @JvmStatic
    @NotNull
    public static final SystemBarStyle light(@ColorInt int i, @ColorInt int i2) {
        return Companion.light(i, i2);
    }

    public final int getDarkScrim$activity_release() {
        return this.f8700b;
    }

    @NotNull
    public final Function1<Resources, Boolean> getDetectDarkMode$activity_release() {
        return this.f8702d;
    }

    public final int getNightMode$activity_release() {
        return this.f8701c;
    }

    public final int getScrim$activity_release(boolean z) {
        if (z) {
            return this.f8700b;
        }
        return this.f8699a;
    }

    public final int getScrimWithEnforcedContrast$activity_release(boolean z) {
        if (this.f8701c == 0) {
            return 0;
        }
        if (z) {
            return this.f8700b;
        }
        return this.f8699a;
    }

    public SystemBarStyle(int i, int i2, int i3, Function1 function1) {
        this.f8699a = i;
        this.f8700b = i2;
        this.f8701c = i3;
        this.f8702d = function1;
    }

    @JvmStatic
    @JvmOverloads
    @NotNull
    public static final SystemBarStyle auto(@ColorInt int i, @ColorInt int i2, @NotNull Function1<? super Resources, Boolean> function1) {
        return Companion.auto(i, i2, function1);
    }
}

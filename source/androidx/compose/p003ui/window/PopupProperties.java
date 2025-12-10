package androidx.compose.p003ui.window;

import androidx.compose.p003ui.ExperimentalComposeUiApi;
import androidx.compose.runtime.Immutable;
import com.tom_roush.pdfbox.contentstream.operator.OperatorName;
import com.tom_roush.pdfbox.pdmodel.common.PDPageLabelRange;
import kotlin.Metadata;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

@Immutable
@Metadata(m28851d1 = {"\u0000 \n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\u000b\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\n\n\u0002\u0010\b\n\u0002\b\u0015\b\u0007\u0018\u00002\u00020\u0001BO\b\u0007\u0012\b\b\u0002\u0010\u0003\u001a\u00020\u0002\u0012\b\b\u0002\u0010\u0004\u001a\u00020\u0002\u0012\b\b\u0002\u0010\u0005\u001a\u00020\u0002\u0012\b\b\u0002\u0010\u0007\u001a\u00020\u0006\u0012\b\b\u0002\u0010\b\u001a\u00020\u0002\u0012\b\b\u0002\u0010\t\u001a\u00020\u0002\u0012\b\b\u0002\u0010\n\u001a\u00020\u0002¢\u0006\u0004\b\u000b\u0010\fBE\b\u0016\u0012\b\b\u0002\u0010\u0003\u001a\u00020\u0002\u0012\b\b\u0002\u0010\u0004\u001a\u00020\u0002\u0012\b\b\u0002\u0010\u0005\u001a\u00020\u0002\u0012\b\b\u0002\u0010\u0007\u001a\u00020\u0006\u0012\b\b\u0002\u0010\b\u001a\u00020\u0002\u0012\b\b\u0002\u0010\t\u001a\u00020\u0002¢\u0006\u0004\b\u000b\u0010\rJ\u001a\u0010\u000f\u001a\u00020\u00022\b\u0010\u000e\u001a\u0004\u0018\u00010\u0001H\u0096\u0002¢\u0006\u0004\b\u000f\u0010\u0010J\u000f\u0010\u0012\u001a\u00020\u0011H\u0016¢\u0006\u0004\b\u0012\u0010\u0013R\u0017\u0010\u0003\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u0014\u0010\u0015\u001a\u0004\b\u0016\u0010\u0017R\u0017\u0010\u0004\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u0018\u0010\u0015\u001a\u0004\b\u0019\u0010\u0017R\u0017\u0010\u0005\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u001a\u0010\u0015\u001a\u0004\b\u001b\u0010\u0017R\u0017\u0010\u0007\u001a\u00020\u00068\u0006¢\u0006\f\n\u0004\b\u001c\u0010\u001d\u001a\u0004\b\u001e\u0010\u001fR\u0017\u0010\b\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b \u0010\u0015\u001a\u0004\b!\u0010\u0017R\u0017\u0010\t\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\"\u0010\u0015\u001a\u0004\b#\u0010\u0017R\u0017\u0010\n\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b$\u0010\u0015\u001a\u0004\b%\u0010\u0017¨\u0006&"}, m28850d2 = {"Landroidx/compose/ui/window/PopupProperties;", "", "", "focusable", "dismissOnBackPress", "dismissOnClickOutside", "Landroidx/compose/ui/window/SecureFlagPolicy;", "securePolicy", "excludeFromSystemGesture", "clippingEnabled", "usePlatformDefaultWidth", "<init>", "(ZZZLandroidx/compose/ui/window/SecureFlagPolicy;ZZZ)V", "(ZZZLandroidx/compose/ui/window/SecureFlagPolicy;ZZ)V", "other", "equals", "(Ljava/lang/Object;)Z", "", "hashCode", "()I", PDPageLabelRange.STYLE_LETTERS_LOWER, "Z", "getFocusable", "()Z", OperatorName.CLOSE_FILL_NON_ZERO_AND_STROKE, "getDismissOnBackPress", OperatorName.CURVE_TO, "getDismissOnClickOutside", "d", "Landroidx/compose/ui/window/SecureFlagPolicy;", "getSecurePolicy", "()Landroidx/compose/ui/window/SecureFlagPolicy;", "e", "getExcludeFromSystemGesture", OperatorName.FILL_NON_ZERO, "getClippingEnabled", OperatorName.NON_STROKING_GRAY, "getUsePlatformDefaultWidth", "ui_release"}, m28849k = 1, m28848mv = {1, 8, 0})
/* renamed from: androidx.compose.ui.window.PopupProperties */
/* loaded from: classes2.dex */
public final class PopupProperties {
    public static final int $stable = 0;

    /* renamed from: a */
    public final boolean f31855a;

    /* renamed from: b */
    public final boolean f31856b;

    /* renamed from: c */
    public final boolean f31857c;

    /* renamed from: d */
    public final SecureFlagPolicy f31858d;

    /* renamed from: e */
    public final boolean f31859e;

    /* renamed from: f */
    public final boolean f31860f;

    /* renamed from: g */
    public final boolean f31861g;

    @ExperimentalComposeUiApi
    public PopupProperties() {
        this(false, false, false, null, false, false, false, 127, null);
    }

    public boolean equals(@Nullable Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof PopupProperties)) {
            return false;
        }
        PopupProperties popupProperties = (PopupProperties) obj;
        if (this.f31855a == popupProperties.f31855a && this.f31856b == popupProperties.f31856b && this.f31857c == popupProperties.f31857c && this.f31858d == popupProperties.f31858d && this.f31859e == popupProperties.f31859e && this.f31860f == popupProperties.f31860f && this.f31861g == popupProperties.f31861g) {
            return true;
        }
        return false;
    }

    public final boolean getClippingEnabled() {
        return this.f31860f;
    }

    public final boolean getDismissOnBackPress() {
        return this.f31856b;
    }

    public final boolean getDismissOnClickOutside() {
        return this.f31857c;
    }

    public final boolean getExcludeFromSystemGesture() {
        return this.f31859e;
    }

    public final boolean getFocusable() {
        return this.f31855a;
    }

    @NotNull
    public final SecureFlagPolicy getSecurePolicy() {
        return this.f31858d;
    }

    public final boolean getUsePlatformDefaultWidth() {
        return this.f31861g;
    }

    public int hashCode() {
        return (((((((((((((AbstractC1705Xp.m65430a(this.f31856b) * 31) + AbstractC1705Xp.m65430a(this.f31855a)) * 31) + AbstractC1705Xp.m65430a(this.f31856b)) * 31) + AbstractC1705Xp.m65430a(this.f31857c)) * 31) + this.f31858d.hashCode()) * 31) + AbstractC1705Xp.m65430a(this.f31859e)) * 31) + AbstractC1705Xp.m65430a(this.f31860f)) * 31) + AbstractC1705Xp.m65430a(this.f31861g);
    }

    @ExperimentalComposeUiApi
    public PopupProperties(boolean z, boolean z2, boolean z3, @NotNull SecureFlagPolicy securePolicy, boolean z4, boolean z5, boolean z6) {
        Intrinsics.checkNotNullParameter(securePolicy, "securePolicy");
        this.f31855a = z;
        this.f31856b = z2;
        this.f31857c = z3;
        this.f31858d = securePolicy;
        this.f31859e = z4;
        this.f31860f = z5;
        this.f31861g = z6;
    }

    public /* synthetic */ PopupProperties(boolean z, boolean z2, boolean z3, SecureFlagPolicy secureFlagPolicy, boolean z4, boolean z5, boolean z6, int i, DefaultConstructorMarker defaultConstructorMarker) {
        this((i & 1) != 0 ? false : z, (i & 2) != 0 ? true : z2, (i & 4) != 0 ? true : z3, (i & 8) != 0 ? SecureFlagPolicy.Inherit : secureFlagPolicy, (i & 16) != 0 ? true : z4, (i & 32) == 0 ? z5 : true, (i & 64) != 0 ? false : z6);
    }

    public /* synthetic */ PopupProperties(boolean z, boolean z2, boolean z3, SecureFlagPolicy secureFlagPolicy, boolean z4, boolean z5, int i, DefaultConstructorMarker defaultConstructorMarker) {
        this((i & 1) != 0 ? false : z, (i & 2) != 0 ? true : z2, (i & 4) != 0 ? true : z3, (i & 8) != 0 ? SecureFlagPolicy.Inherit : secureFlagPolicy, (i & 16) != 0 ? true : z4, (i & 32) == 0 ? z5 : true);
    }

    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    public PopupProperties(boolean z, boolean z2, boolean z3, @NotNull SecureFlagPolicy securePolicy, boolean z4, boolean z5) {
        this(z, z2, z3, securePolicy, z4, z5, false);
        Intrinsics.checkNotNullParameter(securePolicy, "securePolicy");
    }
}

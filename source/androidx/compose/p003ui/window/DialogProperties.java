package androidx.compose.p003ui.window;

import androidx.compose.runtime.Immutable;
import com.tom_roush.pdfbox.contentstream.operator.OperatorName;
import com.tom_roush.pdfbox.pdmodel.common.PDPageLabelRange;
import kotlin.Metadata;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

@Immutable
@Metadata(m28851d1 = {"\u0000 \n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\t\n\u0002\u0010\b\n\u0002\b\u0011\b\u0007\u0018\u00002\u00020\u0001B9\u0012\b\b\u0002\u0010\u0003\u001a\u00020\u0002\u0012\b\b\u0002\u0010\u0004\u001a\u00020\u0002\u0012\b\b\u0002\u0010\u0006\u001a\u00020\u0005\u0012\b\b\u0002\u0010\u0007\u001a\u00020\u0002\u0012\b\b\u0002\u0010\b\u001a\u00020\u0002¢\u0006\u0004\b\t\u0010\nB'\b\u0016\u0012\b\b\u0002\u0010\u0003\u001a\u00020\u0002\u0012\b\b\u0002\u0010\u0004\u001a\u00020\u0002\u0012\b\b\u0002\u0010\u0006\u001a\u00020\u0005¢\u0006\u0004\b\t\u0010\u000bJ\u001a\u0010\r\u001a\u00020\u00022\b\u0010\f\u001a\u0004\u0018\u00010\u0001H\u0096\u0002¢\u0006\u0004\b\r\u0010\u000eJ\u000f\u0010\u0010\u001a\u00020\u000fH\u0016¢\u0006\u0004\b\u0010\u0010\u0011R\u0017\u0010\u0003\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u0012\u0010\u0013\u001a\u0004\b\u0014\u0010\u0015R\u0017\u0010\u0004\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u0016\u0010\u0013\u001a\u0004\b\u0017\u0010\u0015R\u0017\u0010\u0006\u001a\u00020\u00058\u0006¢\u0006\f\n\u0004\b\u0018\u0010\u0019\u001a\u0004\b\u001a\u0010\u001bR\u0017\u0010\u0007\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u001c\u0010\u0013\u001a\u0004\b\u001d\u0010\u0015R\u0017\u0010\b\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u001e\u0010\u0013\u001a\u0004\b\u001f\u0010\u0015¨\u0006 "}, m28850d2 = {"Landroidx/compose/ui/window/DialogProperties;", "", "", "dismissOnBackPress", "dismissOnClickOutside", "Landroidx/compose/ui/window/SecureFlagPolicy;", "securePolicy", "usePlatformDefaultWidth", "decorFitsSystemWindows", "<init>", "(ZZLandroidx/compose/ui/window/SecureFlagPolicy;ZZ)V", "(ZZLandroidx/compose/ui/window/SecureFlagPolicy;)V", "other", "equals", "(Ljava/lang/Object;)Z", "", "hashCode", "()I", PDPageLabelRange.STYLE_LETTERS_LOWER, "Z", "getDismissOnBackPress", "()Z", OperatorName.CLOSE_FILL_NON_ZERO_AND_STROKE, "getDismissOnClickOutside", OperatorName.CURVE_TO, "Landroidx/compose/ui/window/SecureFlagPolicy;", "getSecurePolicy", "()Landroidx/compose/ui/window/SecureFlagPolicy;", "d", "getUsePlatformDefaultWidth", "e", "getDecorFitsSystemWindows", "ui_release"}, m28849k = 1, m28848mv = {1, 8, 0})
/* renamed from: androidx.compose.ui.window.DialogProperties */
/* loaded from: classes2.dex */
public final class DialogProperties {
    public static final int $stable = 0;

    /* renamed from: a */
    public final boolean f31826a;

    /* renamed from: b */
    public final boolean f31827b;

    /* renamed from: c */
    public final SecureFlagPolicy f31828c;

    /* renamed from: d */
    public final boolean f31829d;

    /* renamed from: e */
    public final boolean f31830e;

    public DialogProperties() {
        this(false, false, null, false, false, 31, null);
    }

    public boolean equals(@Nullable Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof DialogProperties)) {
            return false;
        }
        DialogProperties dialogProperties = (DialogProperties) obj;
        if (this.f31826a == dialogProperties.f31826a && this.f31827b == dialogProperties.f31827b && this.f31828c == dialogProperties.f31828c && this.f31829d == dialogProperties.f31829d && this.f31830e == dialogProperties.f31830e) {
            return true;
        }
        return false;
    }

    public final boolean getDecorFitsSystemWindows() {
        return this.f31830e;
    }

    public final boolean getDismissOnBackPress() {
        return this.f31826a;
    }

    public final boolean getDismissOnClickOutside() {
        return this.f31827b;
    }

    @NotNull
    public final SecureFlagPolicy getSecurePolicy() {
        return this.f31828c;
    }

    public final boolean getUsePlatformDefaultWidth() {
        return this.f31829d;
    }

    public int hashCode() {
        return (((((((AbstractC1705Xp.m65430a(this.f31826a) * 31) + AbstractC1705Xp.m65430a(this.f31827b)) * 31) + this.f31828c.hashCode()) * 31) + AbstractC1705Xp.m65430a(this.f31829d)) * 31) + AbstractC1705Xp.m65430a(this.f31830e);
    }

    public DialogProperties(boolean z, boolean z2, @NotNull SecureFlagPolicy securePolicy, boolean z3, boolean z4) {
        Intrinsics.checkNotNullParameter(securePolicy, "securePolicy");
        this.f31826a = z;
        this.f31827b = z2;
        this.f31828c = securePolicy;
        this.f31829d = z3;
        this.f31830e = z4;
    }

    public /* synthetic */ DialogProperties(boolean z, boolean z2, SecureFlagPolicy secureFlagPolicy, boolean z3, boolean z4, int i, DefaultConstructorMarker defaultConstructorMarker) {
        this((i & 1) != 0 ? true : z, (i & 2) != 0 ? true : z2, (i & 4) != 0 ? SecureFlagPolicy.Inherit : secureFlagPolicy, (i & 8) != 0 ? true : z3, (i & 16) != 0 ? true : z4);
    }

    public /* synthetic */ DialogProperties(boolean z, boolean z2, SecureFlagPolicy secureFlagPolicy, int i, DefaultConstructorMarker defaultConstructorMarker) {
        this((i & 1) != 0 ? true : z, (i & 2) != 0 ? true : z2, (i & 4) != 0 ? SecureFlagPolicy.Inherit : secureFlagPolicy);
    }

    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    public DialogProperties(boolean z, boolean z2, @NotNull SecureFlagPolicy securePolicy) {
        this(z, z2, securePolicy, true, true);
        Intrinsics.checkNotNullParameter(securePolicy, "securePolicy");
    }
}

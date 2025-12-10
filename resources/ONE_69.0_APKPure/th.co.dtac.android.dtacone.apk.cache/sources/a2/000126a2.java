package th.p047co.dtac.android.dtacone.util;

import android.view.View;
import androidx.compose.runtime.internal.StabilityInferred;
import com.google.android.gms.analytics.ecommerce.Promotion;
import com.tom_roush.pdfbox.contentstream.operator.OperatorName;
import com.tom_roush.pdfbox.pdmodel.common.PDPageLabelRange;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import th.p047co.dtac.android.dtacone.view.appOne.nadOutbound.fragment.OneNadOutboundSearchFragment;

@StabilityInferred(parameters = 0)
@Metadata(m29143d1 = {"\u0000(\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\b\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\b\t\n\u0002\u0010\u000e\n\u0002\b\u0004\n\u0002\u0010\u000b\n\u0002\b\f\b\u0087\b\u0018\u00002\u00020\u0001B'\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0004\u001a\u00020\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0002\u0012\u0006\u0010\u0006\u001a\u00020\u0002¢\u0006\u0004\b\u0007\u0010\bB\u0011\b\u0016\u0012\u0006\u0010\n\u001a\u00020\t¢\u0006\u0004\b\u0007\u0010\u000bJ\u0010\u0010\f\u001a\u00020\u0002HÆ\u0003¢\u0006\u0004\b\f\u0010\rJ\u0010\u0010\u000e\u001a\u00020\u0002HÆ\u0003¢\u0006\u0004\b\u000e\u0010\rJ\u0010\u0010\u000f\u001a\u00020\u0002HÆ\u0003¢\u0006\u0004\b\u000f\u0010\rJ\u0010\u0010\u0010\u001a\u00020\u0002HÆ\u0003¢\u0006\u0004\b\u0010\u0010\rJ8\u0010\u0011\u001a\u00020\u00002\b\b\u0002\u0010\u0003\u001a\u00020\u00022\b\b\u0002\u0010\u0004\u001a\u00020\u00022\b\b\u0002\u0010\u0005\u001a\u00020\u00022\b\b\u0002\u0010\u0006\u001a\u00020\u0002HÆ\u0001¢\u0006\u0004\b\u0011\u0010\u0012J\u0010\u0010\u0014\u001a\u00020\u0013HÖ\u0001¢\u0006\u0004\b\u0014\u0010\u0015J\u0010\u0010\u0016\u001a\u00020\u0002HÖ\u0001¢\u0006\u0004\b\u0016\u0010\rJ\u001a\u0010\u0019\u001a\u00020\u00182\b\u0010\u0017\u001a\u0004\u0018\u00010\u0001HÖ\u0003¢\u0006\u0004\b\u0019\u0010\u001aR\u0017\u0010\u0003\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u001b\u0010\u001c\u001a\u0004\b\u001d\u0010\rR\u0017\u0010\u0004\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u001e\u0010\u001c\u001a\u0004\b\u001f\u0010\rR\u0017\u0010\u0005\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b \u0010\u001c\u001a\u0004\b!\u0010\rR\u0017\u0010\u0006\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\"\u0010\u001c\u001a\u0004\b#\u0010\r¨\u0006$"}, m29142d2 = {"Lth/co/dtac/android/dtacone/util/InitialPadding;", "", "", OneNadOutboundSearchFragment.POSITION_LEFT, "top", OneNadOutboundSearchFragment.POSITION_RIGHT, "bottom", "<init>", "(IIII)V", "Landroid/view/View;", Promotion.ACTION_VIEW, "(Landroid/view/View;)V", "component1", "()I", "component2", "component3", "component4", "copy", "(IIII)Lth/co/dtac/android/dtacone/util/InitialPadding;", "", "toString", "()Ljava/lang/String;", "hashCode", "other", "", "equals", "(Ljava/lang/Object;)Z", PDPageLabelRange.STYLE_LETTERS_LOWER, "I", "getLeft", OperatorName.CLOSE_FILL_NON_ZERO_AND_STROKE, "getTop", OperatorName.CURVE_TO, "getRight", "d", "getBottom", "app_prodRelease"}, m29141k = 1, m29140mv = {1, 8, 0})
/* renamed from: th.co.dtac.android.dtacone.util.InitialPadding */
/* loaded from: classes8.dex */
public final class InitialPadding {
    public static final int $stable = 0;

    /* renamed from: a */
    public final int f87057a;

    /* renamed from: b */
    public final int f87058b;

    /* renamed from: c */
    public final int f87059c;

    /* renamed from: d */
    public final int f87060d;

    public InitialPadding(int i, int i2, int i3, int i4) {
        this.f87057a = i;
        this.f87058b = i2;
        this.f87059c = i3;
        this.f87060d = i4;
    }

    public static /* synthetic */ InitialPadding copy$default(InitialPadding initialPadding, int i, int i2, int i3, int i4, int i5, Object obj) {
        if ((i5 & 1) != 0) {
            i = initialPadding.f87057a;
        }
        if ((i5 & 2) != 0) {
            i2 = initialPadding.f87058b;
        }
        if ((i5 & 4) != 0) {
            i3 = initialPadding.f87059c;
        }
        if ((i5 & 8) != 0) {
            i4 = initialPadding.f87060d;
        }
        return initialPadding.copy(i, i2, i3, i4);
    }

    public final int component1() {
        return this.f87057a;
    }

    public final int component2() {
        return this.f87058b;
    }

    public final int component3() {
        return this.f87059c;
    }

    public final int component4() {
        return this.f87060d;
    }

    @NotNull
    public final InitialPadding copy(int i, int i2, int i3, int i4) {
        return new InitialPadding(i, i2, i3, i4);
    }

    public boolean equals(@Nullable Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj instanceof InitialPadding) {
            InitialPadding initialPadding = (InitialPadding) obj;
            return this.f87057a == initialPadding.f87057a && this.f87058b == initialPadding.f87058b && this.f87059c == initialPadding.f87059c && this.f87060d == initialPadding.f87060d;
        }
        return false;
    }

    public final int getBottom() {
        return this.f87060d;
    }

    public final int getLeft() {
        return this.f87057a;
    }

    public final int getRight() {
        return this.f87059c;
    }

    public final int getTop() {
        return this.f87058b;
    }

    public int hashCode() {
        return (((((this.f87057a * 31) + this.f87058b) * 31) + this.f87059c) * 31) + this.f87060d;
    }

    @NotNull
    public String toString() {
        int i = this.f87057a;
        int i2 = this.f87058b;
        int i3 = this.f87059c;
        int i4 = this.f87060d;
        return "InitialPadding(left=" + i + ", top=" + i2 + ", right=" + i3 + ", bottom=" + i4 + ")";
    }

    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    public InitialPadding(@NotNull View view) {
        this(view.getPaddingLeft(), view.getPaddingTop(), view.getPaddingRight(), view.getPaddingBottom());
        Intrinsics.checkNotNullParameter(view, "view");
    }
}
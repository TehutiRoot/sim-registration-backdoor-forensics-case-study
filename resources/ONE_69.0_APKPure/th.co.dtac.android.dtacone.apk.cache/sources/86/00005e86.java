package androidx.compose.runtime.reflect;

import ch.qos.logback.core.CoreConstants;
import com.tom_roush.pdfbox.contentstream.operator.OperatorName;
import com.tom_roush.pdfbox.pdmodel.common.PDPageLabelRange;
import kotlin.Metadata;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

@Metadata(m29143d1 = {"\u0000\u001e\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\b\n\u0002\b\r\n\u0002\u0010\u000e\n\u0002\b\u0010\b\u0080\b\u0018\u00002\u00020\u0001B'\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0004\u0012\u0006\u0010\u0006\u001a\u00020\u0004\u0012\u0006\u0010\u0007\u001a\u00020\u0004¢\u0006\u0004\b\b\u0010\tJ\u0010\u0010\n\u001a\u00020\u0002HÆ\u0003¢\u0006\u0004\b\n\u0010\u000bJ\u0010\u0010\f\u001a\u00020\u0004HÆ\u0003¢\u0006\u0004\b\f\u0010\rJ\u0010\u0010\u000e\u001a\u00020\u0004HÆ\u0003¢\u0006\u0004\b\u000e\u0010\rJ\u0010\u0010\u000f\u001a\u00020\u0004HÆ\u0003¢\u0006\u0004\b\u000f\u0010\rJ8\u0010\u0010\u001a\u00020\u00002\b\b\u0002\u0010\u0003\u001a\u00020\u00022\b\b\u0002\u0010\u0005\u001a\u00020\u00042\b\b\u0002\u0010\u0006\u001a\u00020\u00042\b\b\u0002\u0010\u0007\u001a\u00020\u0004HÆ\u0001¢\u0006\u0004\b\u0010\u0010\u0011J\u0010\u0010\u0013\u001a\u00020\u0012HÖ\u0001¢\u0006\u0004\b\u0013\u0010\u0014J\u0010\u0010\u0015\u001a\u00020\u0004HÖ\u0001¢\u0006\u0004\b\u0015\u0010\rJ\u001a\u0010\u0017\u001a\u00020\u00022\b\u0010\u0016\u001a\u0004\u0018\u00010\u0001HÖ\u0003¢\u0006\u0004\b\u0017\u0010\u0018R\u0017\u0010\u0003\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u0019\u0010\u001a\u001a\u0004\b\u0003\u0010\u000bR\u0017\u0010\u0005\u001a\u00020\u00048\u0006¢\u0006\f\n\u0004\b\u001b\u0010\u001c\u001a\u0004\b\u001d\u0010\rR\u0017\u0010\u0006\u001a\u00020\u00048\u0006¢\u0006\f\n\u0004\b\u001e\u0010\u001c\u001a\u0004\b\u001f\u0010\rR\u0017\u0010\u0007\u001a\u00020\u00048\u0006¢\u0006\f\n\u0004\b \u0010\u001c\u001a\u0004\b!\u0010\r¨\u0006\""}, m29142d2 = {"Landroidx/compose/runtime/reflect/ComposableInfo;", "", "", "isComposable", "", "realParamsCount", "changedParams", "defaultParams", "<init>", "(ZIII)V", "component1", "()Z", "component2", "()I", "component3", "component4", "copy", "(ZIII)Landroidx/compose/runtime/reflect/ComposableInfo;", "", "toString", "()Ljava/lang/String;", "hashCode", "other", "equals", "(Ljava/lang/Object;)Z", PDPageLabelRange.STYLE_LETTERS_LOWER, "Z", OperatorName.CLOSE_FILL_NON_ZERO_AND_STROKE, "I", "getRealParamsCount", OperatorName.CURVE_TO, "getChangedParams", "d", "getDefaultParams", "runtime_release"}, m29141k = 1, m29140mv = {1, 8, 0})
/* loaded from: classes2.dex */
public final class ComposableInfo {

    /* renamed from: a */
    public final boolean f28762a;

    /* renamed from: b */
    public final int f28763b;

    /* renamed from: c */
    public final int f28764c;

    /* renamed from: d */
    public final int f28765d;

    public ComposableInfo(boolean z, int i, int i2, int i3) {
        this.f28762a = z;
        this.f28763b = i;
        this.f28764c = i2;
        this.f28765d = i3;
    }

    public static /* synthetic */ ComposableInfo copy$default(ComposableInfo composableInfo, boolean z, int i, int i2, int i3, int i4, Object obj) {
        if ((i4 & 1) != 0) {
            z = composableInfo.f28762a;
        }
        if ((i4 & 2) != 0) {
            i = composableInfo.f28763b;
        }
        if ((i4 & 4) != 0) {
            i2 = composableInfo.f28764c;
        }
        if ((i4 & 8) != 0) {
            i3 = composableInfo.f28765d;
        }
        return composableInfo.copy(z, i, i2, i3);
    }

    public final boolean component1() {
        return this.f28762a;
    }

    public final int component2() {
        return this.f28763b;
    }

    public final int component3() {
        return this.f28764c;
    }

    public final int component4() {
        return this.f28765d;
    }

    @NotNull
    public final ComposableInfo copy(boolean z, int i, int i2, int i3) {
        return new ComposableInfo(z, i, i2, i3);
    }

    public boolean equals(@Nullable Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj instanceof ComposableInfo) {
            ComposableInfo composableInfo = (ComposableInfo) obj;
            return this.f28762a == composableInfo.f28762a && this.f28763b == composableInfo.f28763b && this.f28764c == composableInfo.f28764c && this.f28765d == composableInfo.f28765d;
        }
        return false;
    }

    public final int getChangedParams() {
        return this.f28764c;
    }

    public final int getDefaultParams() {
        return this.f28765d;
    }

    public final int getRealParamsCount() {
        return this.f28763b;
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r0v1, types: [int] */
    /* JADX WARN: Type inference failed for: r0v8 */
    /* JADX WARN: Type inference failed for: r0v9 */
    public int hashCode() {
        boolean z = this.f28762a;
        ?? r0 = z;
        if (z) {
            r0 = 1;
        }
        return (((((r0 * 31) + this.f28763b) * 31) + this.f28764c) * 31) + this.f28765d;
    }

    public final boolean isComposable() {
        return this.f28762a;
    }

    @NotNull
    public String toString() {
        return "ComposableInfo(isComposable=" + this.f28762a + ", realParamsCount=" + this.f28763b + ", changedParams=" + this.f28764c + ", defaultParams=" + this.f28765d + CoreConstants.RIGHT_PARENTHESIS_CHAR;
    }
}
package androidx.compose.foundation.lazy.staggeredgrid;

import androidx.compose.runtime.internal.StabilityInferred;
import com.tom_roush.pdfbox.pdmodel.common.PDPageLabelRange;
import kotlin.Metadata;
import kotlin.jvm.internal.DefaultConstructorMarker;
import org.jetbrains.annotations.NotNull;

@StabilityInferred(parameters = 0)
@Metadata(m28851d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\b\n\u0002\b\t\b\u0007\u0018\u0000 \n2\u00020\u0001:\u0001\nB\u0011\b\u0002\u0012\u0006\u0010\u0003\u001a\u00020\u0002¢\u0006\u0004\b\u0004\u0010\u0005R\u001a\u0010\u0003\u001a\u00020\u00028\u0000X\u0080\u0004¢\u0006\f\n\u0004\b\u0006\u0010\u0007\u001a\u0004\b\b\u0010\t¨\u0006\u000b"}, m28850d2 = {"Landroidx/compose/foundation/lazy/staggeredgrid/StaggeredGridItemSpan;", "", "", "value", "<init>", "(I)V", PDPageLabelRange.STYLE_LETTERS_LOWER, "I", "getValue$foundation_release", "()I", "Companion", "foundation_release"}, m28849k = 1, m28848mv = {1, 8, 0})
/* loaded from: classes.dex */
public final class StaggeredGridItemSpan {
    public static final int $stable = 0;
    @NotNull
    public static final Companion Companion = new Companion(null);

    /* renamed from: b */
    public static final StaggeredGridItemSpan f13823b = new StaggeredGridItemSpan(0);

    /* renamed from: c */
    public static final StaggeredGridItemSpan f13824c = new StaggeredGridItemSpan(1);

    /* renamed from: a */
    public final int f13825a;

    @Metadata(m28851d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\b\u0086\u0003\u0018\u00002\u00020\u0001B\u0007\b\u0002¢\u0006\u0002\u0010\u0002R\u0011\u0010\u0003\u001a\u00020\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u0005\u0010\u0006R\u0011\u0010\u0007\u001a\u00020\u0004¢\u0006\b\n\u0000\u001a\u0004\b\b\u0010\u0006¨\u0006\t"}, m28850d2 = {"Landroidx/compose/foundation/lazy/staggeredgrid/StaggeredGridItemSpan$Companion;", "", "()V", "FullLine", "Landroidx/compose/foundation/lazy/staggeredgrid/StaggeredGridItemSpan;", "getFullLine", "()Landroidx/compose/foundation/lazy/staggeredgrid/StaggeredGridItemSpan;", "SingleLane", "getSingleLane", "foundation_release"}, m28849k = 1, m28848mv = {1, 8, 0}, m28846xi = 48)
    /* loaded from: classes.dex */
    public static final class Companion {
        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        @NotNull
        public final StaggeredGridItemSpan getFullLine() {
            return StaggeredGridItemSpan.f13823b;
        }

        @NotNull
        public final StaggeredGridItemSpan getSingleLane() {
            return StaggeredGridItemSpan.f13824c;
        }

        public Companion() {
        }
    }

    public StaggeredGridItemSpan(int i) {
        this.f13825a = i;
    }

    public final int getValue$foundation_release() {
        return this.f13825a;
    }
}

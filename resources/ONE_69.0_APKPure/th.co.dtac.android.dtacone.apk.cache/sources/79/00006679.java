package androidx.compose.p003ui.tooling.preview.datasource;

import androidx.compose.p003ui.tooling.preview.PreviewParameterProvider;
import androidx.compose.runtime.internal.StabilityInferred;
import com.tom_roush.pdfbox.pdmodel.common.PDPageLabelRange;
import java.util.List;
import kotlin.Metadata;
import kotlin.jvm.internal.Ref;
import kotlin.sequences.Sequence;
import kotlin.sequences.SequencesKt__SequencesKt;
import kotlin.sequences.SequencesKt___SequencesKt;
import org.apache.commons.cli.HelpFormatter;
import org.jetbrains.annotations.NotNull;

@StabilityInferred(parameters = 0)
@Metadata(m29143d1 = {"\u0000\u001c\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\u0010\b\n\u0002\b\u0007\n\u0002\u0018\u0002\n\u0002\b\u0004\b\u0007\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001B\u000f\u0012\u0006\u0010\u0004\u001a\u00020\u0003¢\u0006\u0004\b\u0005\u0010\u0006B\t\b\u0016¢\u0006\u0004\b\u0005\u0010\u0007J\u0017\u0010\b\u001a\u00020\u00022\u0006\u0010\u0004\u001a\u00020\u0003H\u0002¢\u0006\u0004\b\b\u0010\tR\u0014\u0010\u0004\u001a\u00020\u00038\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\b\u0010\nR\u001a\u0010\u000e\u001a\b\u0012\u0004\u0012\u00020\u00020\u000b8VX\u0096\u0004¢\u0006\u0006\u001a\u0004\b\f\u0010\r¨\u0006\u000f"}, m29142d2 = {"Landroidx/compose/ui/tooling/preview/datasource/LoremIpsum;", "Landroidx/compose/ui/tooling/preview/PreviewParameterProvider;", "", "", "words", "<init>", "(I)V", "()V", PDPageLabelRange.STYLE_LETTERS_LOWER, "(I)Ljava/lang/String;", "I", "Lkotlin/sequences/Sequence;", "getValues", "()Lkotlin/sequences/Sequence;", "values", "ui-tooling-preview_release"}, m29141k = 1, m29140mv = {1, 8, 0})
/* renamed from: androidx.compose.ui.tooling.preview.datasource.LoremIpsum */
/* loaded from: classes2.dex */
public final class LoremIpsum implements PreviewParameterProvider<String> {
    public static final int $stable = 0;

    /* renamed from: a */
    public final int f31826a;

    public LoremIpsum(int i) {
        this.f31826a = i;
    }

    /* renamed from: a */
    public final String m58824a(int i) {
        List list;
        Ref.IntRef intRef = new Ref.IntRef();
        list = LoremIpsumKt.f31827a;
        return SequencesKt___SequencesKt.joinToString$default(SequencesKt___SequencesKt.take(SequencesKt__SequencesKt.generateSequence(new LoremIpsum$generateLoremIpsum$1(intRef, list.size())), i), HelpFormatter.DEFAULT_LONG_OPT_SEPARATOR, null, null, 0, null, null, 62, null);
    }

    @Override // androidx.compose.p003ui.tooling.preview.PreviewParameterProvider
    public /* synthetic */ int getCount() {
        return AbstractC21883qo1.m23580a(this);
    }

    @Override // androidx.compose.p003ui.tooling.preview.PreviewParameterProvider
    @NotNull
    public Sequence<String> getValues() {
        return SequencesKt__SequencesKt.sequenceOf(m58824a(this.f31826a));
    }

    public LoremIpsum() {
        this(500);
    }
}
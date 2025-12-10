package kotlin.comparisons;

import ch.qos.logback.core.net.SyslogConstants;
import com.tom_roush.pdfbox.contentstream.operator.OperatorName;
import com.tom_roush.pdfbox.pdmodel.common.PDPageLabelRange;
import java.util.Comparator;
import kotlin.Metadata;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.SourceDebugExtension;

@Metadata(m29143d1 = {"\u0000\n\n\u0000\n\u0002\u0010\b\n\u0002\b\u0007\u0010\u0000\u001a\u00020\u0001\"\u0004\b\u0000\u0010\u0002\"\u0004\b\u0001\u0010\u00032\u000e\u0010\u0004\u001a\n \u0005*\u0004\u0018\u0001H\u0002H\u00022\u000e\u0010\u0006\u001a\n \u0005*\u0004\u0018\u0001H\u0002H\u0002H\n¢\u0006\u0004\b\u0007\u0010\b"}, m29142d2 = {"<anonymous>", "", "T", "K", PDPageLabelRange.STYLE_LETTERS_LOWER, "kotlin.jvm.PlatformType", OperatorName.CLOSE_FILL_NON_ZERO_AND_STROKE, "compare", "(Ljava/lang/Object;Ljava/lang/Object;)I"}, m29141k = 3, m29140mv = {1, 9, 0}, m29138xi = SyslogConstants.LOG_LOCAL6)
@SourceDebugExtension({"SMAP\nComparisons.kt\nKotlin\n*S Kotlin\n*F\n+ 1 Comparisons.kt\nkotlin/comparisons/ComparisonsKt__ComparisonsKt$thenBy$2\n*L\n1#1,328:1\n*E\n"})
/* loaded from: classes5.dex */
public final class ComparisonsKt__ComparisonsKt$thenBy$2<T> implements Comparator {

    /* renamed from: a */
    public final /* synthetic */ Comparator f68203a;

    /* renamed from: b */
    public final /* synthetic */ Comparator f68204b;

    /* renamed from: c */
    public final /* synthetic */ Function1 f68205c;

    public ComparisonsKt__ComparisonsKt$thenBy$2(Comparator<T> comparator, Comparator<Object> comparator2, Function1<? super T, Object> function1) {
        this.f68203a = comparator;
        this.f68204b = comparator2;
        this.f68205c = function1;
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // java.util.Comparator
    public final int compare(T t, T t2) {
        int compare = this.f68203a.compare(t, t2);
        if (compare == 0) {
            Comparator comparator = this.f68204b;
            Function1 function1 = this.f68205c;
            return comparator.compare(function1.invoke(t), function1.invoke(t2));
        }
        return compare;
    }
}
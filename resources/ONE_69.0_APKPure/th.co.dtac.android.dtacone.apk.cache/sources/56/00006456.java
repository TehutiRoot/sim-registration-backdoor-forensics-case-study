package androidx.compose.p003ui.text;

import androidx.compose.p003ui.text.AnnotatedString;
import androidx.compose.runtime.saveable.Saver;
import java.util.List;
import kotlin.Metadata;
import kotlin.NoWhenBranchMatchedException;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.Lambda;
import kotlin.jvm.internal.SourceDebugExtension;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

@Metadata(m29143d1 = {"\u0000\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\u0010\u0000\u001a\f\u0012\u0006\b\u0001\u0012\u00020\u0002\u0018\u00010\u00012\u0006\u0010\u0003\u001a\u00020\u0002H\n¢\u0006\u0002\b\u0004"}, m29142d2 = {"<anonymous>", "Landroidx/compose/ui/text/AnnotatedString$Range;", "", "it", "invoke"}, m29141k = 3, m29140mv = {1, 8, 0}, m29138xi = 48)
@SourceDebugExtension({"SMAP\nSavers.kt\nKotlin\n*S Kotlin\n*F\n+ 1 Savers.kt\nandroidx/compose/ui/text/SaversKt$AnnotationRangeSaver$2\n+ 2 Savers.kt\nandroidx/compose/ui/text/SaversKt\n+ 3 fake.kt\nkotlin/jvm/internal/FakeKt\n*L\n1#1,421:1\n70#2:422\n70#2:424\n70#2:426\n70#2:428\n55#2,2:430\n55#2,2:433\n55#2,2:436\n55#2,2:439\n70#2:442\n1#3:423\n1#3:425\n1#3:427\n1#3:429\n1#3:432\n1#3:435\n1#3:438\n1#3:441\n1#3:443\n*S KotlinDebug\n*F\n+ 1 Savers.kt\nandroidx/compose/ui/text/SaversKt$AnnotationRangeSaver$2\n*L\n160#1:422\n161#1:424\n162#1:426\n163#1:428\n167#1:430,2\n171#1:433,2\n175#1:436,2\n179#1:439,2\n183#1:442\n160#1:423\n161#1:425\n162#1:427\n163#1:429\n167#1:432\n171#1:435\n175#1:438\n179#1:441\n183#1:443\n*E\n"})
/* renamed from: androidx.compose.ui.text.SaversKt$AnnotationRangeSaver$2 */
/* loaded from: classes2.dex */
public final class SaversKt$AnnotationRangeSaver$2 extends Lambda implements Function1<Object, AnnotatedString.Range<? extends Object>> {
    public static final SaversKt$AnnotationRangeSaver$2 INSTANCE = new SaversKt$AnnotationRangeSaver$2();

    @Metadata(m29141k = 3, m29140mv = {1, 8, 0}, m29138xi = 48)
    /* renamed from: androidx.compose.ui.text.SaversKt$AnnotationRangeSaver$2$WhenMappings */
    /* loaded from: classes2.dex */
    public /* synthetic */ class WhenMappings {
        public static final /* synthetic */ int[] $EnumSwitchMapping$0;

        static {
            int[] iArr = new int[AnnotationType.values().length];
            try {
                iArr[AnnotationType.Paragraph.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                iArr[AnnotationType.Span.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            try {
                iArr[AnnotationType.VerbatimTts.ordinal()] = 3;
            } catch (NoSuchFieldError unused3) {
            }
            try {
                iArr[AnnotationType.Url.ordinal()] = 4;
            } catch (NoSuchFieldError unused4) {
            }
            try {
                iArr[AnnotationType.String.ordinal()] = 5;
            } catch (NoSuchFieldError unused5) {
            }
            $EnumSwitchMapping$0 = iArr;
        }
    }

    public SaversKt$AnnotationRangeSaver$2() {
        super(1);
    }

    /* JADX WARN: Can't rename method to resolve collision */
    @Override // kotlin.jvm.functions.Function1
    @Nullable
    public final AnnotatedString.Range<? extends Object> invoke(@NotNull Object it) {
        Saver saver;
        Saver saver2;
        Intrinsics.checkNotNullParameter(it, "it");
        List list = (List) it;
        Object obj = list.get(0);
        AnnotationType annotationType = obj != null ? (AnnotationType) obj : null;
        Intrinsics.checkNotNull(annotationType);
        Object obj2 = list.get(2);
        Integer num = obj2 != null ? (Integer) obj2 : null;
        Intrinsics.checkNotNull(num);
        int intValue = num.intValue();
        Object obj3 = list.get(3);
        Integer num2 = obj3 != null ? (Integer) obj3 : null;
        Intrinsics.checkNotNull(num2);
        int intValue2 = num2.intValue();
        Object obj4 = list.get(4);
        String str = obj4 != null ? (String) obj4 : null;
        Intrinsics.checkNotNull(str);
        int i = WhenMappings.$EnumSwitchMapping$0[annotationType.ordinal()];
        if (i == 1) {
            Object obj5 = list.get(1);
            Saver<ParagraphStyle, Object> paragraphStyleSaver = SaversKt.getParagraphStyleSaver();
            if (!Intrinsics.areEqual(obj5, Boolean.FALSE) && obj5 != null) {
                r1 = paragraphStyleSaver.restore(obj5);
            }
            Intrinsics.checkNotNull(r1);
            return new AnnotatedString.Range<>(r1, intValue, intValue2, str);
        } else if (i == 2) {
            Object obj6 = list.get(1);
            Saver<SpanStyle, Object> spanStyleSaver = SaversKt.getSpanStyleSaver();
            if (!Intrinsics.areEqual(obj6, Boolean.FALSE) && obj6 != null) {
                r1 = spanStyleSaver.restore(obj6);
            }
            Intrinsics.checkNotNull(r1);
            return new AnnotatedString.Range<>(r1, intValue, intValue2, str);
        } else if (i == 3) {
            Object obj7 = list.get(1);
            saver = SaversKt.f31135d;
            if (!Intrinsics.areEqual(obj7, Boolean.FALSE) && obj7 != null) {
                r1 = (VerbatimTtsAnnotation) saver.restore(obj7);
            }
            Intrinsics.checkNotNull(r1);
            return new AnnotatedString.Range<>(r1, intValue, intValue2, str);
        } else if (i != 4) {
            if (i == 5) {
                Object obj8 = list.get(1);
                r1 = obj8 != null ? (String) obj8 : null;
                Intrinsics.checkNotNull(r1);
                return new AnnotatedString.Range<>(r1, intValue, intValue2, str);
            }
            throw new NoWhenBranchMatchedException();
        } else {
            Object obj9 = list.get(1);
            saver2 = SaversKt.f31136e;
            if (!Intrinsics.areEqual(obj9, Boolean.FALSE) && obj9 != null) {
                r1 = (UrlAnnotation) saver2.restore(obj9);
            }
            Intrinsics.checkNotNull(r1);
            return new AnnotatedString.Range<>(r1, intValue, intValue2, str);
        }
    }
}
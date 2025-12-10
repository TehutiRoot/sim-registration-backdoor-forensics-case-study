package androidx.compose.p003ui.text.android.animation;

import android.text.Layout;
import androidx.compose.p003ui.text.android.CharSequenceCharacterIterator;
import androidx.compose.p003ui.text.android.InternalPlatformTextApi;
import androidx.compose.p003ui.text.android.LayoutCompatKt;
import androidx.compose.p003ui.text.android.LayoutHelper;
import com.tom_roush.pdfbox.contentstream.operator.OperatorName;
import com.tom_roush.pdfbox.pdmodel.common.PDPageLabelRange;
import java.text.Bidi;
import java.text.BreakIterator;
import java.util.ArrayList;
import java.util.List;
import java.util.Locale;
import java.util.TreeSet;
import kotlin.Metadata;
import kotlin.NoWhenBranchMatchedException;
import kotlin.Unit;
import kotlin.collections.CollectionsKt__CollectionsKt;
import kotlin.collections.CollectionsKt___CollectionsKt;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.SourceDebugExtension;
import org.apache.commons.cli.HelpFormatter;
import org.bouncycastle.i18n.TextBundle;
import org.jetbrains.annotations.NotNull;

@InternalPlatformTextApi
@Metadata(m29143d1 = {"\u0000@\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010 \n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u000b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0010\r\n\u0000\n\u0002\u0018\u0002\n\u0002\b\n\bÁ\u0002\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J#\u0010\n\u001a\b\u0012\u0004\u0012\u00020\t0\b2\u0006\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u0007\u001a\u00020\u0006¢\u0006\u0004\b\n\u0010\u000bJ+\u0010\u000f\u001a\b\u0012\u0004\u0012\u00020\u000e0\b2\u0006\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u0007\u001a\u00020\u00062\u0006\u0010\r\u001a\u00020\f¢\u0006\u0004\b\u000f\u0010\u0010J\u001d\u0010\u0011\u001a\b\u0012\u0004\u0012\u00020\t0\b2\u0006\u0010\u0005\u001a\u00020\u0004H\u0002¢\u0006\u0004\b\u0011\u0010\u0012J%\u0010\u0017\u001a\b\u0012\u0004\u0012\u00020\t0\b2\u0006\u0010\u0014\u001a\u00020\u00132\u0006\u0010\u0016\u001a\u00020\u0015H\u0002¢\u0006\u0004\b\u0017\u0010\u0018J\u001d\u0010\u0019\u001a\b\u0012\u0004\u0012\u00020\u000e0\b2\u0006\u0010\u0005\u001a\u00020\u0004H\u0002¢\u0006\u0004\b\u0019\u0010\u0012J\u001d\u0010\u001a\u001a\b\u0012\u0004\u0012\u00020\u000e0\b2\u0006\u0010\u0005\u001a\u00020\u0004H\u0002¢\u0006\u0004\b\u001a\u0010\u0012J%\u0010\u001b\u001a\b\u0012\u0004\u0012\u00020\u000e0\b2\u0006\u0010\u0005\u001a\u00020\u00042\u0006\u0010\r\u001a\u00020\fH\u0002¢\u0006\u0004\b\u001b\u0010\u001cJ%\u0010\u001d\u001a\b\u0012\u0004\u0012\u00020\u000e0\b2\u0006\u0010\u0005\u001a\u00020\u00042\u0006\u0010\r\u001a\u00020\fH\u0002¢\u0006\u0004\b\u001d\u0010\u001cJ%\u0010\u001e\u001a\b\u0012\u0004\u0012\u00020\u000e0\b2\u0006\u0010\u0005\u001a\u00020\u00042\u0006\u0010\r\u001a\u00020\fH\u0002¢\u0006\u0004\b\u001e\u0010\u001c¨\u0006\u001f"}, m29142d2 = {"Landroidx/compose/ui/text/android/animation/SegmentBreaker;", "", "<init>", "()V", "Landroidx/compose/ui/text/android/LayoutHelper;", "layoutHelper", "Landroidx/compose/ui/text/android/animation/SegmentType;", "segmentType", "", "", "breakOffsets", "(Landroidx/compose/ui/text/android/LayoutHelper;Landroidx/compose/ui/text/android/animation/SegmentType;)Ljava/util/List;", "", "dropSpaces", "Landroidx/compose/ui/text/android/animation/Segment;", "breakSegments", "(Landroidx/compose/ui/text/android/LayoutHelper;Landroidx/compose/ui/text/android/animation/SegmentType;Z)Ljava/util/List;", PDPageLabelRange.STYLE_LETTERS_LOWER, "(Landroidx/compose/ui/text/android/LayoutHelper;)Ljava/util/List;", "", TextBundle.TEXT_ENTRY, "Ljava/text/BreakIterator;", "breaker", OperatorName.NON_STROKING_GRAY, "(Ljava/lang/CharSequence;Ljava/text/BreakIterator;)Ljava/util/List;", OperatorName.CURVE_TO, "e", "d", "(Landroidx/compose/ui/text/android/LayoutHelper;Z)Ljava/util/List;", OperatorName.FILL_NON_ZERO, OperatorName.CLOSE_FILL_NON_ZERO_AND_STROKE, "ui-text_release"}, m29141k = 1, m29140mv = {1, 8, 0})
@SourceDebugExtension({"SMAP\nSegmentBreaker.kt\nKotlin\n*S Kotlin\n*F\n+ 1 SegmentBreaker.kt\nandroidx/compose/ui/text/android/animation/SegmentBreaker\n+ 2 TempListUtils.kt\nandroidx/compose/ui/text/android/TempListUtilsKt\n*L\n1#1,312:1\n34#2,6:313\n73#2,11:319\n73#2,11:330\n*S KotlinDebug\n*F\n+ 1 SegmentBreaker.kt\nandroidx/compose/ui/text/android/animation/SegmentBreaker\n*L\n66#1:313,6\n226#1:319,11\n275#1:330,11\n*E\n"})
/* renamed from: androidx.compose.ui.text.android.animation.SegmentBreaker */
/* loaded from: classes2.dex */
public final class SegmentBreaker {
    @NotNull
    public static final SegmentBreaker INSTANCE = new SegmentBreaker();

    @Metadata(m29141k = 3, m29140mv = {1, 8, 0}, m29138xi = 48)
    /* renamed from: androidx.compose.ui.text.android.animation.SegmentBreaker$WhenMappings */
    /* loaded from: classes2.dex */
    public /* synthetic */ class WhenMappings {
        public static final /* synthetic */ int[] $EnumSwitchMapping$0;

        static {
            int[] iArr = new int[SegmentType.values().length];
            try {
                iArr[SegmentType.Document.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                iArr[SegmentType.Paragraph.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            try {
                iArr[SegmentType.Line.ordinal()] = 3;
            } catch (NoSuchFieldError unused3) {
            }
            try {
                iArr[SegmentType.Word.ordinal()] = 4;
            } catch (NoSuchFieldError unused4) {
            }
            try {
                iArr[SegmentType.Character.ordinal()] = 5;
            } catch (NoSuchFieldError unused5) {
            }
            $EnumSwitchMapping$0 = iArr;
        }
    }

    /* renamed from: a */
    public final List m59019a(LayoutHelper layoutHelper) {
        CharSequence text = layoutHelper.getLayout().getText();
        Intrinsics.checkNotNullExpressionValue(text, "text");
        BreakIterator lineInstance = BreakIterator.getLineInstance(Locale.getDefault());
        Intrinsics.checkNotNullExpressionValue(lineInstance, "getLineInstance(Locale.getDefault())");
        List m59013g = m59013g(text, lineInstance);
        TreeSet treeSet = new TreeSet();
        int size = m59013g.size();
        for (int i = 0; i < size; i++) {
            treeSet.add(Integer.valueOf(((Number) m59013g.get(i)).intValue()));
        }
        int paragraphCount = layoutHelper.getParagraphCount();
        for (int i2 = 0; i2 < paragraphCount; i2++) {
            Bidi analyzeBidi = layoutHelper.analyzeBidi(i2);
            if (analyzeBidi != null) {
                int paragraphStart = layoutHelper.getParagraphStart(i2);
                int runCount = analyzeBidi.getRunCount();
                for (int i3 = 0; i3 < runCount; i3++) {
                    treeSet.add(Integer.valueOf(analyzeBidi.getRunStart(i3) + paragraphStart));
                }
            }
        }
        return CollectionsKt___CollectionsKt.toList(treeSet);
    }

    /* renamed from: b */
    public final List m59018b(LayoutHelper layoutHelper, boolean z) {
        boolean z2;
        boolean z3;
        ArrayList arrayList = new ArrayList();
        List<Integer> breakOffsets = breakOffsets(layoutHelper, SegmentType.Character);
        if (breakOffsets.size() != 0) {
            boolean z4 = true;
            if (breakOffsets.size() != 1) {
                ArrayList arrayList2 = new ArrayList();
                boolean z5 = false;
                Integer num = breakOffsets.get(0);
                int lastIndex = CollectionsKt__CollectionsKt.getLastIndex(breakOffsets);
                int i = 0;
                while (i < lastIndex) {
                    i++;
                    Integer num2 = breakOffsets.get(i);
                    int intValue = num2.intValue();
                    int intValue2 = num.intValue();
                    Layout layout = layoutHelper.getLayout();
                    if (!z || intValue != intValue2 + 1 || !layoutHelper.isLineEndSpace(layout.getText().charAt(intValue2))) {
                        int lineForOffset = LayoutCompatKt.getLineForOffset(layout, intValue2, z5);
                        if (layout.getParagraphDirection(lineForOffset) == -1) {
                            z2 = true;
                        } else {
                            z2 = false;
                        }
                        boolean isRtlCharAt = layout.isRtlCharAt(intValue2);
                        if (isRtlCharAt != z2) {
                            z4 = false;
                        }
                        int ceil = (int) Math.ceil(layoutHelper.getHorizontalPosition(intValue2, z4, z5));
                        if (isRtlCharAt == z2) {
                            z3 = true;
                        } else {
                            z3 = false;
                        }
                        int ceil2 = (int) Math.ceil(layoutHelper.getHorizontalPosition(intValue, z3, true));
                        arrayList.add(new Segment(intValue2, intValue, Math.min(ceil, ceil2), layout.getLineTop(lineForOffset), Math.max(ceil, ceil2), layout.getLineBottom(lineForOffset)));
                    }
                    arrayList2.add(Unit.INSTANCE);
                    num = num2;
                    z4 = true;
                    z5 = false;
                }
                return arrayList;
            }
        }
        CollectionsKt__CollectionsKt.emptyList();
        return arrayList;
    }

    @NotNull
    public final List<Integer> breakOffsets(@NotNull LayoutHelper layoutHelper, @NotNull SegmentType segmentType) {
        int i = 0;
        Intrinsics.checkNotNullParameter(layoutHelper, "layoutHelper");
        Intrinsics.checkNotNullParameter(segmentType, "segmentType");
        Layout layout = layoutHelper.getLayout();
        CharSequence text = layout.getText();
        int i2 = WhenMappings.$EnumSwitchMapping$0[segmentType.ordinal()];
        if (i2 != 1) {
            if (i2 != 2) {
                if (i2 != 3) {
                    if (i2 != 4) {
                        if (i2 == 5) {
                            Intrinsics.checkNotNullExpressionValue(text, "text");
                            BreakIterator characterInstance = BreakIterator.getCharacterInstance(Locale.getDefault());
                            Intrinsics.checkNotNullExpressionValue(characterInstance, "getCharacterInstance(Locale.getDefault())");
                            return m59013g(text, characterInstance);
                        }
                        throw new NoWhenBranchMatchedException();
                    }
                    return m59019a(layoutHelper);
                }
                List<Integer> mutableListOf = CollectionsKt__CollectionsKt.mutableListOf(0);
                int lineCount = layout.getLineCount();
                while (i < lineCount) {
                    mutableListOf.add(Integer.valueOf(layout.getLineEnd(i)));
                    i++;
                }
                return mutableListOf;
            }
            List<Integer> mutableListOf2 = CollectionsKt__CollectionsKt.mutableListOf(0);
            int paragraphCount = layoutHelper.getParagraphCount();
            while (i < paragraphCount) {
                mutableListOf2.add(Integer.valueOf(layoutHelper.getParagraphEnd(i)));
                i++;
            }
            return mutableListOf2;
        }
        return CollectionsKt__CollectionsKt.listOf((Object[]) new Integer[]{0, Integer.valueOf(text.length())});
    }

    @NotNull
    public final List<Segment> breakSegments(@NotNull LayoutHelper layoutHelper, @NotNull SegmentType segmentType, boolean z) {
        Intrinsics.checkNotNullParameter(layoutHelper, "layoutHelper");
        Intrinsics.checkNotNullParameter(segmentType, "segmentType");
        int i = WhenMappings.$EnumSwitchMapping$0[segmentType.ordinal()];
        if (i != 1) {
            if (i != 2) {
                if (i != 3) {
                    if (i != 4) {
                        if (i == 5) {
                            return m59018b(layoutHelper, z);
                        }
                        throw new NoWhenBranchMatchedException();
                    }
                    return m59014f(layoutHelper, z);
                }
                return m59016d(layoutHelper, z);
            }
            return m59015e(layoutHelper);
        }
        return m59017c(layoutHelper);
    }

    /* renamed from: c */
    public final List m59017c(LayoutHelper layoutHelper) {
        return AbstractC10100ds.listOf(new Segment(0, layoutHelper.getLayout().getText().length(), 0, 0, layoutHelper.getLayout().getWidth(), layoutHelper.getLayout().getHeight()));
    }

    /* renamed from: d */
    public final List m59016d(LayoutHelper layoutHelper, boolean z) {
        int i;
        int width;
        ArrayList arrayList = new ArrayList();
        Layout layout = layoutHelper.getLayout();
        int lineCount = layoutHelper.getLayout().getLineCount();
        for (int i2 = 0; i2 < lineCount; i2++) {
            int lineStart = layout.getLineStart(i2);
            int lineEnd = layout.getLineEnd(i2);
            if (z) {
                i = (int) Math.ceil(layout.getLineLeft(i2));
            } else {
                i = 0;
            }
            int lineTop = layout.getLineTop(i2);
            if (z) {
                width = (int) Math.ceil(layout.getLineRight(i2));
            } else {
                width = layout.getWidth();
            }
            arrayList.add(new Segment(lineStart, lineEnd, i, lineTop, width, layout.getLineBottom(i2)));
        }
        return arrayList;
    }

    /* renamed from: e */
    public final List m59015e(LayoutHelper layoutHelper) {
        ArrayList arrayList = new ArrayList();
        Layout layout = layoutHelper.getLayout();
        int paragraphCount = layoutHelper.getParagraphCount();
        for (int i = 0; i < paragraphCount; i++) {
            int paragraphStart = layoutHelper.getParagraphStart(i);
            int paragraphEnd = layoutHelper.getParagraphEnd(i);
            arrayList.add(new Segment(paragraphStart, paragraphEnd, 0, layout.getLineTop(LayoutCompatKt.getLineForOffset(layout, paragraphStart, false)), layout.getWidth(), layout.getLineBottom(LayoutCompatKt.getLineForOffset(layout, paragraphEnd, true))));
        }
        return arrayList;
    }

    /* renamed from: f */
    public final List m59014f(LayoutHelper layoutHelper, boolean z) {
        boolean z2;
        boolean z3;
        int i;
        Layout layout = layoutHelper.getLayout();
        int ceil = (int) Math.ceil(layout.getPaint().measureText(HelpFormatter.DEFAULT_LONG_OPT_SEPARATOR));
        List<Integer> breakOffsets = breakOffsets(layoutHelper, SegmentType.Word);
        if (breakOffsets.size() != 0) {
            boolean z4 = true;
            if (breakOffsets.size() != 1) {
                ArrayList arrayList = new ArrayList();
                boolean z5 = false;
                Integer num = breakOffsets.get(0);
                int lastIndex = CollectionsKt__CollectionsKt.getLastIndex(breakOffsets);
                int i2 = 0;
                while (i2 < lastIndex) {
                    i2++;
                    Integer num2 = breakOffsets.get(i2);
                    int intValue = num2.intValue();
                    int intValue2 = num.intValue();
                    int lineForOffset = LayoutCompatKt.getLineForOffset(layout, intValue2, z5);
                    if (layout.getParagraphDirection(lineForOffset) == -1) {
                        z2 = true;
                    } else {
                        z2 = false;
                    }
                    boolean isRtlCharAt = layout.isRtlCharAt(intValue2);
                    if (isRtlCharAt != z2) {
                        z4 = false;
                    }
                    int ceil2 = (int) Math.ceil(layoutHelper.getHorizontalPosition(intValue2, z4, z5));
                    if (isRtlCharAt == z2) {
                        z3 = true;
                    } else {
                        z3 = false;
                    }
                    int ceil3 = (int) Math.ceil(layoutHelper.getHorizontalPosition(intValue, z3, true));
                    int min = Math.min(ceil2, ceil3);
                    int max = Math.max(ceil2, ceil3);
                    if (z && intValue != 0 && layout.getText().charAt(intValue - 1) == ' ') {
                        i = lineForOffset;
                        if (layout.getLineEnd(i) != intValue) {
                            if (isRtlCharAt) {
                                min += ceil;
                            } else {
                                max -= ceil;
                            }
                        }
                    } else {
                        i = lineForOffset;
                    }
                    arrayList.add(new Segment(intValue2, intValue, min, layout.getLineTop(i), max, layout.getLineBottom(i)));
                    num = num2;
                    z4 = true;
                    z5 = false;
                }
                return arrayList;
            }
        }
        return CollectionsKt__CollectionsKt.emptyList();
    }

    /* renamed from: g */
    public final List m59013g(CharSequence charSequence, BreakIterator breakIterator) {
        CharSequenceCharacterIterator charSequenceCharacterIterator = new CharSequenceCharacterIterator(charSequence, 0, charSequence.length());
        List mutableListOf = CollectionsKt__CollectionsKt.mutableListOf(0);
        breakIterator.setText(charSequenceCharacterIterator);
        while (breakIterator.next() != -1) {
            mutableListOf.add(Integer.valueOf(breakIterator.current()));
        }
        return mutableListOf;
    }
}
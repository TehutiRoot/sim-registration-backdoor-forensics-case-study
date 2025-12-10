package androidx.compose.p003ui.text;

import com.google.firebase.analytics.FirebaseAnalytics;
import com.tom_roush.pdfbox.contentstream.operator.OperatorName;
import java.util.List;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.SourceDebugExtension;
import org.jetbrains.annotations.NotNull;

@Metadata(m29143d1 = {"\u0000\u001a\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0002\b\u0003\n\u0002\u0010\u0007\n\u0002\b\u0006\u001a%\u0010\u0005\u001a\u00020\u00032\f\u0010\u0002\u001a\b\u0012\u0004\u0012\u00020\u00010\u00002\u0006\u0010\u0004\u001a\u00020\u0003H\u0000¢\u0006\u0004\b\u0005\u0010\u0006\u001a%\u0010\t\u001a\u00020\u00032\f\u0010\u0002\u001a\b\u0012\u0004\u0012\u00020\u00010\u00002\u0006\u0010\b\u001a\u00020\u0007H\u0000¢\u0006\u0004\b\t\u0010\n\u001a%\u0010\f\u001a\u00020\u00032\f\u0010\u0002\u001a\b\u0012\u0004\u0012\u00020\u00010\u00002\u0006\u0010\u000b\u001a\u00020\u0003H\u0000¢\u0006\u0004\b\f\u0010\u0006¨\u0006\r"}, m29142d2 = {"", "Landroidx/compose/ui/text/ParagraphInfo;", "paragraphInfoList", "", FirebaseAnalytics.Param.INDEX, "findParagraphByIndex", "(Ljava/util/List;I)I", "", OperatorName.CURVE_TO_REPLICATE_FINAL_POINT, "findParagraphByY", "(Ljava/util/List;F)I", "lineIndex", "findParagraphByLineIndex", "ui-text_release"}, m29141k = 2, m29140mv = {1, 8, 0})
@SourceDebugExtension({"SMAP\nMultiParagraph.kt\nKotlin\n*S Kotlin\n*F\n+ 1 MultiParagraph.kt\nandroidx/compose/ui/text/MultiParagraphKt\n*L\n1#1,982:1\n852#1,16:983\n852#1,16:999\n852#1,16:1015\n*S KotlinDebug\n*F\n+ 1 MultiParagraph.kt\nandroidx/compose/ui/text/MultiParagraphKt\n*L\n802#1:983,16\n822#1:999,16\n842#1:1015,16\n*E\n"})
/* renamed from: androidx.compose.ui.text.MultiParagraphKt */
/* loaded from: classes2.dex */
public final class MultiParagraphKt {
    public static final int findParagraphByIndex(@NotNull List<ParagraphInfo> paragraphInfoList, int i) {
        char c;
        Intrinsics.checkNotNullParameter(paragraphInfoList, "paragraphInfoList");
        int size = paragraphInfoList.size() - 1;
        int i2 = 0;
        while (i2 <= size) {
            int i3 = (i2 + size) >>> 1;
            ParagraphInfo paragraphInfo = paragraphInfoList.get(i3);
            if (paragraphInfo.getStartIndex() > i) {
                c = 1;
            } else if (paragraphInfo.getEndIndex() <= i) {
                c = 65535;
            } else {
                c = 0;
            }
            if (c < 0) {
                i2 = i3 + 1;
            } else if (c > 0) {
                size = i3 - 1;
            } else {
                return i3;
            }
        }
        return -(i2 + 1);
    }

    public static final int findParagraphByLineIndex(@NotNull List<ParagraphInfo> paragraphInfoList, int i) {
        char c;
        Intrinsics.checkNotNullParameter(paragraphInfoList, "paragraphInfoList");
        int size = paragraphInfoList.size() - 1;
        int i2 = 0;
        while (i2 <= size) {
            int i3 = (i2 + size) >>> 1;
            ParagraphInfo paragraphInfo = paragraphInfoList.get(i3);
            if (paragraphInfo.getStartLineIndex() > i) {
                c = 1;
            } else if (paragraphInfo.getEndLineIndex() <= i) {
                c = 65535;
            } else {
                c = 0;
            }
            if (c < 0) {
                i2 = i3 + 1;
            } else if (c > 0) {
                size = i3 - 1;
            } else {
                return i3;
            }
        }
        return -(i2 + 1);
    }

    public static final int findParagraphByY(@NotNull List<ParagraphInfo> paragraphInfoList, float f) {
        char c;
        Intrinsics.checkNotNullParameter(paragraphInfoList, "paragraphInfoList");
        int size = paragraphInfoList.size() - 1;
        int i = 0;
        while (i <= size) {
            int i2 = (i + size) >>> 1;
            ParagraphInfo paragraphInfo = paragraphInfoList.get(i2);
            if (paragraphInfo.getTop() > f) {
                c = 1;
            } else if (paragraphInfo.getBottom() <= f) {
                c = 65535;
            } else {
                c = 0;
            }
            if (c < 0) {
                i = i2 + 1;
            } else if (c > 0) {
                size = i2 - 1;
            } else {
                return i2;
            }
        }
        return -(i + 1);
    }
}
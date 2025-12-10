package androidx.compose.p003ui.text.android;

import android.text.Layout;
import android.text.TextPaint;
import androidx.compose.p003ui.text.android.LayoutIntrinsicsKt;
import com.tom_roush.pdfbox.contentstream.operator.OperatorName;
import java.text.BreakIterator;
import java.util.Comparator;
import java.util.PriorityQueue;
import kotlin.Metadata;
import kotlin.Pair;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.SourceDebugExtension;
import org.bouncycastle.i18n.TextBundle;
import org.jetbrains.annotations.NotNull;

@Metadata(m28851d1 = {"\u0000\u001c\n\u0002\u0010\r\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0007\n\u0002\b\u0005\n\u0002\u0010\u000b\n\u0002\b\u0003\u001a\u001f\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u0001\u001a\u00020\u00002\u0006\u0010\u0003\u001a\u00020\u0002H\u0000¢\u0006\u0004\b\u0005\u0010\u0006\u001a'\u0010\u000b\u001a\u00020\n2\u0006\u0010\u0007\u001a\u00020\u00042\u0006\u0010\b\u001a\u00020\u00002\u0006\u0010\t\u001a\u00020\u0002H\u0002¢\u0006\u0004\b\u000b\u0010\f¨\u0006\r"}, m28850d2 = {"", TextBundle.TEXT_ENTRY, "Landroid/text/TextPaint;", "paint", "", "minIntrinsicWidth", "(Ljava/lang/CharSequence;Landroid/text/TextPaint;)F", "desiredWidth", "charSequence", "textPaint", "", OperatorName.CURVE_TO, "(FLjava/lang/CharSequence;Landroid/text/TextPaint;)Z", "ui-text_release"}, m28849k = 2, m28848mv = {1, 8, 0})
@SourceDebugExtension({"SMAP\nLayoutIntrinsics.kt\nKotlin\n*S Kotlin\n*F\n+ 1 LayoutIntrinsics.kt\nandroidx/compose/ui/text/android/LayoutIntrinsicsKt\n+ 2 _Collections.kt\nkotlin/collections/CollectionsKt___CollectionsKt\n*L\n1#1,171:1\n1855#2,2:172\n*S KotlinDebug\n*F\n+ 1 LayoutIntrinsics.kt\nandroidx/compose/ui/text/android/LayoutIntrinsicsKt\n*L\n142#1:172,2\n*E\n"})
/* renamed from: androidx.compose.ui.text.android.LayoutIntrinsicsKt */
/* loaded from: classes2.dex */
public final class LayoutIntrinsicsKt {
    /* renamed from: a */
    public static /* synthetic */ int m59085a(Pair pair, Pair pair2) {
        return m59084b(pair, pair2);
    }

    /* renamed from: b */
    public static final int m59084b(Pair pair, Pair pair2) {
        return (((Number) pair.getSecond()).intValue() - ((Number) pair.getFirst()).intValue()) - (((Number) pair2.getSecond()).intValue() - ((Number) pair2.getFirst()).intValue());
    }

    /* JADX WARN: Code restructure failed: missing block: B:27:0x001a, code lost:
        if (androidx.compose.p003ui.text.android.SpannedExtensionsKt.hasSpan(r2, androidx.compose.p003ui.text.android.style.LetterSpacingSpanEm.class) == false) goto L11;
     */
    /* renamed from: c */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public static final boolean m59083c(float r1, java.lang.CharSequence r2, android.text.TextPaint r3) {
        /*
            r0 = 0
            int r1 = (r1 > r0 ? 1 : (r1 == r0 ? 0 : -1))
            if (r1 != 0) goto L6
            goto L24
        L6:
            boolean r1 = r2 instanceof android.text.Spanned
            if (r1 == 0) goto L1c
            android.text.Spanned r2 = (android.text.Spanned) r2
            java.lang.Class<androidx.compose.ui.text.android.style.LetterSpacingSpanPx> r1 = androidx.compose.p003ui.text.android.style.LetterSpacingSpanPx.class
            boolean r1 = androidx.compose.p003ui.text.android.SpannedExtensionsKt.hasSpan(r2, r1)
            if (r1 != 0) goto L26
            java.lang.Class<androidx.compose.ui.text.android.style.LetterSpacingSpanEm> r1 = androidx.compose.p003ui.text.android.style.LetterSpacingSpanEm.class
            boolean r1 = androidx.compose.p003ui.text.android.SpannedExtensionsKt.hasSpan(r2, r1)
            if (r1 != 0) goto L26
        L1c:
            float r1 = r3.getLetterSpacing()
            int r1 = (r1 > r0 ? 1 : (r1 == r0 ? 0 : -1))
            if (r1 != 0) goto L26
        L24:
            r1 = 0
            goto L27
        L26:
            r1 = 1
        L27:
            return r1
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.compose.p003ui.text.android.LayoutIntrinsicsKt.m59083c(float, java.lang.CharSequence, android.text.TextPaint):boolean");
    }

    public static final float minIntrinsicWidth(@NotNull CharSequence text, @NotNull TextPaint paint) {
        Intrinsics.checkNotNullParameter(text, "text");
        Intrinsics.checkNotNullParameter(paint, "paint");
        BreakIterator lineInstance = BreakIterator.getLineInstance(paint.getTextLocale());
        lineInstance.setText(new CharSequenceCharacterIterator(text, 0, text.length()));
        PriorityQueue<Pair> priorityQueue = new PriorityQueue(10, new Comparator() { // from class: hi0
            @Override // java.util.Comparator
            public final int compare(Object obj, Object obj2) {
                return LayoutIntrinsicsKt.m59085a((Pair) obj, (Pair) obj2);
            }
        });
        int next = lineInstance.next();
        int i = 0;
        while (next != -1) {
            if (priorityQueue.size() < 10) {
                priorityQueue.add(new Pair(Integer.valueOf(i), Integer.valueOf(next)));
            } else {
                Pair pair = (Pair) priorityQueue.peek();
                if (pair != null && ((Number) pair.getSecond()).intValue() - ((Number) pair.getFirst()).intValue() < next - i) {
                    priorityQueue.poll();
                    priorityQueue.add(new Pair(Integer.valueOf(i), Integer.valueOf(next)));
                }
            }
            int i2 = next;
            next = lineInstance.next();
            i = i2;
        }
        float f = 0.0f;
        for (Pair pair2 : priorityQueue) {
            f = Math.max(f, Layout.getDesiredWidth(text, ((Number) pair2.component1()).intValue(), ((Number) pair2.component2()).intValue(), paint));
        }
        return f;
    }
}

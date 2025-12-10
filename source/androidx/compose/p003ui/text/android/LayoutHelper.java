package androidx.compose.p003ui.text.android;

import android.text.Layout;
import androidx.annotation.IntRange;
import androidx.constraintlayout.core.motion.utils.TypedValues;
import ch.qos.logback.core.CoreConstants;
import com.tom_roush.pdfbox.contentstream.operator.OperatorName;
import com.tom_roush.pdfbox.pdmodel.common.PDPageLabelRange;
import java.text.Bidi;
import java.util.ArrayList;
import java.util.List;
import kotlin.Metadata;
import kotlin.collections.ArraysKt___ArraysKt;
import kotlin.collections.CollectionsKt__CollectionsKt;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.SourceDebugExtension;
import kotlin.text.StringsKt__StringsKt;
import org.jetbrains.annotations.NotNull;

@InternalPlatformTextApi
@Metadata(m28851d1 = {"\u0000T\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000b\n\u0002\b\t\n\u0002\u0010\u0007\n\u0002\b\u0002\n\u0002\u0010\f\n\u0002\b\u000b\n\u0002\u0010 \n\u0002\b\u0002\n\u0002\u0010!\n\u0000\n\u0002\u0010\u0018\n\u0002\b\u0003\n\u0002\u0010\u0019\n\u0002\b\t\b\u0001\u0018\u00002\u00020\u0001:\u0001\u001eB\u000f\u0012\u0006\u0010\u0003\u001a\u00020\u0002¢\u0006\u0004\b\u0004\u0010\u0005J\u0017\u0010\t\u001a\u0004\u0018\u00010\b2\u0006\u0010\u0007\u001a\u00020\u0006¢\u0006\u0004\b\t\u0010\nJ!\u0010\u000e\u001a\u00020\u00062\b\b\u0001\u0010\u000b\u001a\u00020\u00062\b\b\u0002\u0010\r\u001a\u00020\f¢\u0006\u0004\b\u000e\u0010\u000fJ\u0017\u0010\u0010\u001a\u00020\u00062\b\b\u0001\u0010\u0007\u001a\u00020\u0006¢\u0006\u0004\b\u0010\u0010\u0011J\u0017\u0010\u0012\u001a\u00020\u00062\b\b\u0001\u0010\u0007\u001a\u00020\u0006¢\u0006\u0004\b\u0012\u0010\u0011J\u0017\u0010\u0013\u001a\u00020\f2\b\b\u0001\u0010\u0007\u001a\u00020\u0006¢\u0006\u0004\b\u0013\u0010\u0014J%\u0010\u0017\u001a\u00020\u00162\u0006\u0010\u000b\u001a\u00020\u00062\u0006\u0010\u0015\u001a\u00020\f2\u0006\u0010\r\u001a\u00020\f¢\u0006\u0004\b\u0017\u0010\u0018J\u0015\u0010\u001b\u001a\u00020\f2\u0006\u0010\u001a\u001a\u00020\u0019¢\u0006\u0004\b\u001b\u0010\u001cJ\u001f\u0010\u001e\u001a\u00020\u00162\u0006\u0010\u000b\u001a\u00020\u00062\u0006\u0010\u001d\u001a\u00020\fH\u0002¢\u0006\u0004\b\u001e\u0010\u001fJ\u0017\u0010!\u001a\u00020\u00062\u0006\u0010 \u001a\u00020\u0006H\u0002¢\u0006\u0004\b!\u0010\u0011R\u0017\u0010\u0003\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u001e\u0010\"\u001a\u0004\b#\u0010$R\u001a\u0010'\u001a\b\u0012\u0004\u0012\u00020\u00060%8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b!\u0010&R\u001c\u0010)\u001a\n\u0012\u0006\u0012\u0004\u0018\u00010\b0(8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u001a\u0010&R\u0014\u0010-\u001a\u00020*8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b+\u0010,R\u0018\u00101\u001a\u0004\u0018\u00010.8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b/\u00100R\u0017\u00106\u001a\u00020\u00068\u0006¢\u0006\f\n\u0004\b2\u00103\u001a\u0004\b4\u00105¨\u00067"}, m28850d2 = {"Landroidx/compose/ui/text/android/LayoutHelper;", "", "Landroid/text/Layout;", "layout", "<init>", "(Landroid/text/Layout;)V", "", "paragraphIndex", "Ljava/text/Bidi;", "analyzeBidi", "(I)Ljava/text/Bidi;", TypedValues.CycleType.S_WAVE_OFFSET, "", "upstream", "getParagraphForOffset", "(IZ)I", "getParagraphStart", "(I)I", "getParagraphEnd", "isRtlParagraph", "(I)Z", "usePrimaryDirection", "", "getHorizontalPosition", "(IZZ)F", "", OperatorName.CURVE_TO, "isLineEndSpace", "(C)Z", "primary", PDPageLabelRange.STYLE_LETTERS_LOWER, "(IZ)F", "lineEnd", OperatorName.CLOSE_FILL_NON_ZERO_AND_STROKE, "Landroid/text/Layout;", "getLayout", "()Landroid/text/Layout;", "", "Ljava/util/List;", "paragraphEnds", "", "paragraphBidi", "", "d", "[Z", "bidiProcessedParagraphs", "", "e", "[C", "tmpBuffer", OperatorName.FILL_NON_ZERO, "I", "getParagraphCount", "()I", "paragraphCount", "ui-text_release"}, m28849k = 1, m28848mv = {1, 8, 0})
@SourceDebugExtension({"SMAP\nLayoutHelper.kt\nKotlin\n*S Kotlin\n*F\n+ 1 LayoutHelper.kt\nandroidx/compose/ui/text/android/LayoutHelper\n+ 2 fake.kt\nkotlin/jvm/internal/FakeKt\n+ 3 _Arrays.kt\nkotlin/collections/ArraysKt___ArraysKt\n*L\n1#1,377:1\n1#2:378\n1627#3,6:379\n1627#3,6:385\n*S KotlinDebug\n*F\n+ 1 LayoutHelper.kt\nandroidx/compose/ui/text/android/LayoutHelper\n*L\n283#1:379,6\n322#1:385,6\n*E\n"})
/* renamed from: androidx.compose.ui.text.android.LayoutHelper */
/* loaded from: classes2.dex */
public final class LayoutHelper {

    /* renamed from: a */
    public final Layout f31123a;

    /* renamed from: b */
    public final List f31124b;

    /* renamed from: c */
    public final List f31125c;

    /* renamed from: d */
    public final boolean[] f31126d;

    /* renamed from: e */
    public char[] f31127e;

    /* renamed from: f */
    public final int f31128f;

    /* renamed from: androidx.compose.ui.text.android.LayoutHelper$a */
    /* loaded from: classes2.dex */
    public static final class C3607a {

        /* renamed from: a */
        public final int f31129a;

        /* renamed from: b */
        public final int f31130b;

        /* renamed from: c */
        public final boolean f31131c;

        public C3607a(int i, int i2, boolean z) {
            this.f31129a = i;
            this.f31130b = i2;
            this.f31131c = z;
        }

        /* renamed from: a */
        public final int m59088a() {
            return this.f31130b;
        }

        /* renamed from: b */
        public final int m59087b() {
            return this.f31129a;
        }

        /* renamed from: c */
        public final boolean m59086c() {
            return this.f31131c;
        }

        public boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (obj instanceof C3607a) {
                C3607a c3607a = (C3607a) obj;
                return this.f31129a == c3607a.f31129a && this.f31130b == c3607a.f31130b && this.f31131c == c3607a.f31131c;
            }
            return false;
        }

        /* JADX WARN: Multi-variable type inference failed */
        public int hashCode() {
            int i = ((this.f31129a * 31) + this.f31130b) * 31;
            boolean z = this.f31131c;
            int i2 = z;
            if (z != 0) {
                i2 = 1;
            }
            return i + i2;
        }

        public String toString() {
            return "BidiRun(start=" + this.f31129a + ", end=" + this.f31130b + ", isRtl=" + this.f31131c + CoreConstants.RIGHT_PARENTHESIS_CHAR;
        }
    }

    public LayoutHelper(@NotNull Layout layout) {
        int i;
        Intrinsics.checkNotNullParameter(layout, "layout");
        this.f31123a = layout;
        ArrayList arrayList = new ArrayList();
        int i2 = 0;
        do {
            CharSequence text = this.f31123a.getText();
            Intrinsics.checkNotNullExpressionValue(text, "layout.text");
            int indexOf$default = StringsKt__StringsKt.indexOf$default(text, '\n', i2, false, 4, (Object) null);
            if (indexOf$default < 0) {
                i = this.f31123a.getText().length();
            } else {
                i = indexOf$default + 1;
            }
            i2 = i;
            arrayList.add(Integer.valueOf(i2));
        } while (i2 < this.f31123a.getText().length());
        this.f31124b = arrayList;
        int size = arrayList.size();
        ArrayList arrayList2 = new ArrayList(size);
        for (int i3 = 0; i3 < size; i3++) {
            arrayList2.add(null);
        }
        this.f31125c = arrayList2;
        this.f31126d = new boolean[this.f31124b.size()];
        this.f31128f = this.f31124b.size();
    }

    public static /* synthetic */ int getParagraphForOffset$default(LayoutHelper layoutHelper, int i, boolean z, int i2, Object obj) {
        if ((i2 & 2) != 0) {
            z = false;
        }
        return layoutHelper.getParagraphForOffset(i, z);
    }

    /* renamed from: a */
    public final float m59090a(int i, boolean z) {
        if (z) {
            return this.f31123a.getPrimaryHorizontal(i);
        }
        return this.f31123a.getSecondaryHorizontal(i);
    }

    /* JADX WARN: Code restructure failed: missing block: B:20:0x0060, code lost:
        if (r0.getRunCount() == 1) goto L26;
     */
    @org.jetbrains.annotations.Nullable
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final java.text.Bidi analyzeBidi(int r12) {
        /*
            r11 = this;
            boolean[] r0 = r11.f31126d
            boolean r0 = r0[r12]
            if (r0 == 0) goto Lf
            java.util.List r0 = r11.f31125c
            java.lang.Object r12 = r0.get(r12)
            java.text.Bidi r12 = (java.text.Bidi) r12
            return r12
        Lf:
            r0 = 0
            if (r12 != 0) goto L14
            r1 = 0
            goto L22
        L14:
            java.util.List r1 = r11.f31124b
            int r2 = r12 + (-1)
            java.lang.Object r1 = r1.get(r2)
            java.lang.Number r1 = (java.lang.Number) r1
            int r1 = r1.intValue()
        L22:
            java.util.List r2 = r11.f31124b
            java.lang.Object r2 = r2.get(r12)
            java.lang.Number r2 = (java.lang.Number) r2
            int r2 = r2.intValue()
            int r8 = r2 - r1
            char[] r3 = r11.f31127e
            if (r3 == 0) goto L3a
            int r4 = r3.length
            if (r4 >= r8) goto L38
            goto L3a
        L38:
            r10 = r3
            goto L3d
        L3a:
            char[] r3 = new char[r8]
            goto L38
        L3d:
            android.text.Layout r3 = r11.f31123a
            java.lang.CharSequence r3 = r3.getText()
            android.text.TextUtils.getChars(r3, r1, r2, r10, r0)
            boolean r0 = java.text.Bidi.requiresBidi(r10, r0, r8)
            r1 = 0
            r2 = 1
            if (r0 == 0) goto L62
            boolean r9 = r11.isRtlParagraph(r12)
            java.text.Bidi r0 = new java.text.Bidi
            r6 = 0
            r7 = 0
            r5 = 0
            r3 = r0
            r4 = r10
            r3.<init>(r4, r5, r6, r7, r8, r9)
            int r3 = r0.getRunCount()
            if (r3 != r2) goto L63
        L62:
            r0 = r1
        L63:
            java.util.List r3 = r11.f31125c
            r3.set(r12, r0)
            boolean[] r3 = r11.f31126d
            r3[r12] = r2
            if (r0 == 0) goto L75
            char[] r12 = r11.f31127e
            if (r10 != r12) goto L74
            r10 = r1
            goto L75
        L74:
            r10 = r12
        L75:
            r11.f31127e = r10
            return r0
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.compose.p003ui.text.android.LayoutHelper.analyzeBidi(int):java.text.Bidi");
    }

    /* renamed from: b */
    public final int m59089b(int i) {
        while (i > 0 && isLineEndSpace(this.f31123a.getText().charAt(i - 1))) {
            i--;
        }
        return i;
    }

    public final float getHorizontalPosition(int i, boolean z, boolean z2) {
        Bidi bidi;
        boolean z3;
        int i2 = i;
        if (!z2) {
            return m59090a(i, z);
        }
        int lineForOffset = LayoutCompatKt.getLineForOffset(this.f31123a, i2, z2);
        int lineStart = this.f31123a.getLineStart(lineForOffset);
        int lineEnd = this.f31123a.getLineEnd(lineForOffset);
        if (i2 != lineStart && i2 != lineEnd) {
            return m59090a(i, z);
        }
        if (i2 != 0 && i2 != this.f31123a.getText().length()) {
            int paragraphForOffset = getParagraphForOffset(i2, z2);
            boolean isRtlParagraph = isRtlParagraph(paragraphForOffset);
            int m59089b = m59089b(lineEnd);
            int paragraphStart = getParagraphStart(paragraphForOffset);
            int i3 = lineStart - paragraphStart;
            int i4 = m59089b - paragraphStart;
            Bidi analyzeBidi = analyzeBidi(paragraphForOffset);
            if (analyzeBidi != null) {
                bidi = analyzeBidi.createLineBidi(i3, i4);
            } else {
                bidi = null;
            }
            boolean z4 = false;
            if (bidi != null && bidi.getRunCount() != 1) {
                int runCount = bidi.getRunCount();
                C3607a[] c3607aArr = new C3607a[runCount];
                for (int i5 = 0; i5 < runCount; i5++) {
                    int runStart = bidi.getRunStart(i5) + lineStart;
                    int runLimit = bidi.getRunLimit(i5) + lineStart;
                    if (bidi.getRunLevel(i5) % 2 == 1) {
                        z3 = true;
                    } else {
                        z3 = false;
                    }
                    c3607aArr[i5] = new C3607a(runStart, runLimit, z3);
                }
                int runCount2 = bidi.getRunCount();
                byte[] bArr = new byte[runCount2];
                for (int i6 = 0; i6 < runCount2; i6++) {
                    bArr[i6] = (byte) bidi.getRunLevel(i6);
                }
                Bidi.reorderVisually(bArr, 0, c3607aArr, 0, runCount);
                int i7 = -1;
                if (i2 == lineStart) {
                    int i8 = 0;
                    while (true) {
                        if (i8 >= runCount) {
                            break;
                        } else if (c3607aArr[i8].m59087b() == i2) {
                            i7 = i8;
                            break;
                        } else {
                            i8++;
                        }
                    }
                    C3607a c3607a = c3607aArr[i7];
                    if (z || isRtlParagraph == c3607a.m59086c()) {
                        if (!isRtlParagraph) {
                            isRtlParagraph = true;
                        } else {
                            isRtlParagraph = false;
                        }
                    }
                    if (i7 == 0 && isRtlParagraph) {
                        return this.f31123a.getLineLeft(lineForOffset);
                    }
                    if (i7 == ArraysKt___ArraysKt.getLastIndex(c3607aArr) && !isRtlParagraph) {
                        return this.f31123a.getLineRight(lineForOffset);
                    }
                    if (isRtlParagraph) {
                        return this.f31123a.getPrimaryHorizontal(c3607aArr[i7 - 1].m59087b());
                    }
                    return this.f31123a.getPrimaryHorizontal(c3607aArr[i7 + 1].m59087b());
                }
                if (i2 > m59089b) {
                    i2 = m59089b(i);
                }
                int i9 = 0;
                while (true) {
                    if (i9 >= runCount) {
                        break;
                    } else if (c3607aArr[i9].m59088a() == i2) {
                        i7 = i9;
                        break;
                    } else {
                        i9++;
                    }
                }
                C3607a c3607a2 = c3607aArr[i7];
                if (!z && isRtlParagraph != c3607a2.m59086c()) {
                    isRtlParagraph = !isRtlParagraph;
                }
                if (i7 == 0 && isRtlParagraph) {
                    return this.f31123a.getLineLeft(lineForOffset);
                }
                if (i7 == ArraysKt___ArraysKt.getLastIndex(c3607aArr) && !isRtlParagraph) {
                    return this.f31123a.getLineRight(lineForOffset);
                }
                if (isRtlParagraph) {
                    return this.f31123a.getPrimaryHorizontal(c3607aArr[i7 - 1].m59088a());
                }
                return this.f31123a.getPrimaryHorizontal(c3607aArr[i7 + 1].m59088a());
            }
            boolean isRtlCharAt = this.f31123a.isRtlCharAt(lineStart);
            if (z || isRtlParagraph == isRtlCharAt) {
                if (!isRtlParagraph) {
                    isRtlParagraph = true;
                } else {
                    isRtlParagraph = false;
                }
            }
            if (i2 == lineStart) {
                z4 = isRtlParagraph;
            } else if (!isRtlParagraph) {
                z4 = true;
            }
            Layout layout = this.f31123a;
            if (z4) {
                return layout.getLineLeft(lineForOffset);
            }
            return layout.getLineRight(lineForOffset);
        }
        return m59090a(i, z);
    }

    @NotNull
    public final Layout getLayout() {
        return this.f31123a;
    }

    public final int getParagraphCount() {
        return this.f31128f;
    }

    public final int getParagraphEnd(@IntRange(from = 0) int i) {
        return ((Number) this.f31124b.get(i)).intValue();
    }

    public final int getParagraphForOffset(@IntRange(from = 0) int i, boolean z) {
        int i2;
        int binarySearch$default = CollectionsKt__CollectionsKt.binarySearch$default(this.f31124b, Integer.valueOf(i), 0, 0, 6, (Object) null);
        if (binarySearch$default < 0) {
            i2 = -(binarySearch$default + 1);
        } else {
            i2 = binarySearch$default + 1;
        }
        if (z && i2 > 0) {
            int i3 = i2 - 1;
            if (i == ((Number) this.f31124b.get(i3)).intValue()) {
                return i3;
            }
        }
        return i2;
    }

    public final int getParagraphStart(@IntRange(from = 0) int i) {
        if (i == 0) {
            return 0;
        }
        return ((Number) this.f31124b.get(i - 1)).intValue();
    }

    public final boolean isLineEndSpace(char c) {
        return c == ' ' || c == '\n' || c == 5760 || (8192 <= c && c < 8203 && c != 8199) || c == 8287 || c == 12288;
    }

    public final boolean isRtlParagraph(@IntRange(from = 0) int i) {
        if (this.f31123a.getParagraphDirection(this.f31123a.getLineForOffset(getParagraphStart(i))) == -1) {
            return true;
        }
        return false;
    }
}

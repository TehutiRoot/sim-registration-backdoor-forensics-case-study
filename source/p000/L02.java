package p000;

import androidx.compose.p003ui.text.input.OffsetMapping;
import kotlin.jvm.internal.Intrinsics;
import kotlinx.serialization.json.internal.AbstractJsonLexerKt;

/* renamed from: L02 */
/* loaded from: classes.dex */
public final class L02 implements OffsetMapping {

    /* renamed from: a */
    public final OffsetMapping f3354a;

    /* renamed from: b */
    public final int f3355b;

    /* renamed from: c */
    public final int f3356c;

    public L02(OffsetMapping delegate, int i, int i2) {
        Intrinsics.checkNotNullParameter(delegate, "delegate");
        this.f3354a = delegate;
        this.f3355b = i;
        this.f3356c = i2;
    }

    @Override // androidx.compose.p003ui.text.input.OffsetMapping
    public int originalToTransformed(int i) {
        int originalToTransformed = this.f3354a.originalToTransformed(i);
        if (originalToTransformed >= 0 && originalToTransformed <= this.f3356c) {
            return originalToTransformed;
        }
        throw new IllegalStateException(("OffsetMapping.originalToTransformed returned invalid mapping: " + i + " -> " + originalToTransformed + " is not in range of transformed text [0, " + this.f3356c + AbstractJsonLexerKt.END_LIST).toString());
    }

    @Override // androidx.compose.p003ui.text.input.OffsetMapping
    public int transformedToOriginal(int i) {
        int transformedToOriginal = this.f3354a.transformedToOriginal(i);
        if (transformedToOriginal >= 0 && transformedToOriginal <= this.f3355b) {
            return transformedToOriginal;
        }
        throw new IllegalStateException(("OffsetMapping.transformedToOriginal returned invalid mapping: " + i + " -> " + transformedToOriginal + " is not in range of original text [0, " + this.f3355b + AbstractJsonLexerKt.END_LIST).toString());
    }
}

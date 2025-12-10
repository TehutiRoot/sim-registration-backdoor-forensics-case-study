package p000;

import androidx.compose.p003ui.text.input.OffsetMapping;
import kotlin.jvm.internal.Intrinsics;
import kotlinx.serialization.json.internal.AbstractJsonLexerKt;

/* renamed from: I12 */
/* loaded from: classes.dex */
public final class I12 implements OffsetMapping {

    /* renamed from: a */
    public final OffsetMapping f2547a;

    /* renamed from: b */
    public final int f2548b;

    /* renamed from: c */
    public final int f2549c;

    public I12(OffsetMapping delegate, int i, int i2) {
        Intrinsics.checkNotNullParameter(delegate, "delegate");
        this.f2547a = delegate;
        this.f2548b = i;
        this.f2549c = i2;
    }

    @Override // androidx.compose.p003ui.text.input.OffsetMapping
    public int originalToTransformed(int i) {
        int originalToTransformed = this.f2547a.originalToTransformed(i);
        if (originalToTransformed >= 0 && originalToTransformed <= this.f2549c) {
            return originalToTransformed;
        }
        throw new IllegalStateException(("OffsetMapping.originalToTransformed returned invalid mapping: " + i + " -> " + originalToTransformed + " is not in range of transformed text [0, " + this.f2549c + AbstractJsonLexerKt.END_LIST).toString());
    }

    @Override // androidx.compose.p003ui.text.input.OffsetMapping
    public int transformedToOriginal(int i) {
        int transformedToOriginal = this.f2547a.transformedToOriginal(i);
        if (transformedToOriginal >= 0 && transformedToOriginal <= this.f2548b) {
            return transformedToOriginal;
        }
        throw new IllegalStateException(("OffsetMapping.transformedToOriginal returned invalid mapping: " + i + " -> " + transformedToOriginal + " is not in range of original text [0, " + this.f2548b + AbstractJsonLexerKt.END_LIST).toString());
    }
}
package androidx.compose.material3;

import androidx.compose.p003ui.text.AnnotatedString;
import androidx.compose.p003ui.text.input.OffsetMapping;
import androidx.compose.p003ui.text.input.TransformedText;
import androidx.compose.p003ui.text.input.VisualTransformation;
import kotlin.jvm.internal.Intrinsics;
import kotlin.ranges.AbstractC11719c;
import kotlin.text.StringsKt__StringsKt;

/* loaded from: classes2.dex */
public final class DateVisualTransformation implements VisualTransformation {

    /* renamed from: a */
    public final DateInputFormat f25738a;

    /* renamed from: b */
    public final int f25739b;

    /* renamed from: c */
    public final int f25740c;

    /* renamed from: d */
    public final int f25741d;

    /* renamed from: e */
    public final DateVisualTransformation$dateOffsetTranslator$1 f25742e;

    /* JADX WARN: Type inference failed for: r8v3, types: [androidx.compose.material3.DateVisualTransformation$dateOffsetTranslator$1] */
    public DateVisualTransformation(DateInputFormat dateInputFormat) {
        Intrinsics.checkNotNullParameter(dateInputFormat, "dateInputFormat");
        this.f25738a = dateInputFormat;
        this.f25739b = StringsKt__StringsKt.indexOf$default((CharSequence) dateInputFormat.getPatternWithDelimiters(), dateInputFormat.getDelimiter(), 0, false, 6, (Object) null);
        this.f25740c = StringsKt__StringsKt.lastIndexOf$default((CharSequence) dateInputFormat.getPatternWithDelimiters(), dateInputFormat.getDelimiter(), 0, false, 6, (Object) null);
        this.f25741d = dateInputFormat.getPatternWithoutDelimiters().length();
        this.f25742e = new OffsetMapping() { // from class: androidx.compose.material3.DateVisualTransformation$dateOffsetTranslator$1
            {
                DateVisualTransformation.this = this;
            }

            @Override // androidx.compose.p003ui.text.input.OffsetMapping
            public int originalToTransformed(int i) {
                if (i >= DateVisualTransformation.m60654b(DateVisualTransformation.this)) {
                    if (i < DateVisualTransformation.m60653c(DateVisualTransformation.this)) {
                        return i + 1;
                    }
                    if (i > DateVisualTransformation.m60655a(DateVisualTransformation.this)) {
                        i = DateVisualTransformation.m60655a(DateVisualTransformation.this);
                    }
                    return i + 2;
                }
                return i;
            }

            @Override // androidx.compose.p003ui.text.input.OffsetMapping
            public int transformedToOriginal(int i) {
                if (i > DateVisualTransformation.m60654b(DateVisualTransformation.this) - 1) {
                    if (i <= DateVisualTransformation.m60653c(DateVisualTransformation.this) - 1) {
                        return i - 1;
                    }
                    if (i <= DateVisualTransformation.m60655a(DateVisualTransformation.this) + 1) {
                        return i - 2;
                    }
                    return DateVisualTransformation.m60655a(DateVisualTransformation.this);
                }
                return i;
            }
        };
    }

    /* renamed from: a */
    public static final /* synthetic */ int m60655a(DateVisualTransformation dateVisualTransformation) {
        return dateVisualTransformation.f25741d;
    }

    /* renamed from: b */
    public static final /* synthetic */ int m60654b(DateVisualTransformation dateVisualTransformation) {
        return dateVisualTransformation.f25739b;
    }

    /* renamed from: c */
    public static final /* synthetic */ int m60653c(DateVisualTransformation dateVisualTransformation) {
        return dateVisualTransformation.f25740c;
    }

    @Override // androidx.compose.p003ui.text.input.VisualTransformation
    public TransformedText filter(AnnotatedString text) {
        String text2;
        Intrinsics.checkNotNullParameter(text, "text");
        int i = 0;
        if (text.getText().length() > this.f25741d) {
            text2 = StringsKt__StringsKt.substring(text.getText(), AbstractC11719c.until(0, this.f25741d));
        } else {
            text2 = text.getText();
        }
        String str = "";
        int i2 = 0;
        while (i < text2.length()) {
            int i3 = i2 + 1;
            String str2 = str + text2.charAt(i);
            if (i3 != this.f25739b && i2 + 2 != this.f25740c) {
                str = str2;
            } else {
                str = str2 + this.f25738a.getDelimiter();
            }
            i++;
            i2 = i3;
        }
        return new TransformedText(new AnnotatedString(str, null, null, 6, null), this.f25742e);
    }
}

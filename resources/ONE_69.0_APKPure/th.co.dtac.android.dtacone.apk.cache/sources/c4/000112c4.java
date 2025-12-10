package th.p047co.dtac.android.dtacone.app_one.widget.composable.helper;

import androidx.compose.p003ui.text.AnnotatedString;
import androidx.compose.p003ui.text.input.OffsetMapping;
import androidx.compose.p003ui.text.input.TransformedText;
import androidx.compose.p003ui.text.input.VisualTransformation;
import androidx.compose.runtime.internal.StabilityInferred;
import com.tom_roush.pdfbox.pdmodel.common.PDPageLabelRange;
import kotlin.Metadata;
import kotlin.collections.CollectionsKt__CollectionsKt;
import kotlin.jvm.internal.Intrinsics;
import kotlin.ranges.IntRange;
import kotlin.text.StringsKt__StringsKt;
import org.apache.commons.cli.HelpFormatter;
import org.bouncycastle.i18n.TextBundle;
import org.jetbrains.annotations.NotNull;

@StabilityInferred(parameters = 0)
@Metadata(m29143d1 = {"\u0000!\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\b\u0005*\u0001\t\b\u0007\u0018\u00002\u00020\u0001B\u0007¢\u0006\u0004\b\u0002\u0010\u0003J\u0017\u0010\u0007\u001a\u00020\u00062\u0006\u0010\u0005\u001a\u00020\u0004H\u0016¢\u0006\u0004\b\u0007\u0010\bR\u0014\u0010\f\u001a\u00020\t8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\n\u0010\u000b¨\u0006\r"}, m29142d2 = {"Lth/co/dtac/android/dtacone/app_one/widget/composable/helper/IdCardNumberVisualTransformation;", "Landroidx/compose/ui/text/input/VisualTransformation;", "<init>", "()V", "Landroidx/compose/ui/text/AnnotatedString;", TextBundle.TEXT_ENTRY, "Landroidx/compose/ui/text/input/TransformedText;", "filter", "(Landroidx/compose/ui/text/AnnotatedString;)Landroidx/compose/ui/text/input/TransformedText;", "th/co/dtac/android/dtacone/app_one/widget/composable/helper/IdCardNumberVisualTransformation$idCardNumberOffsetMapping$1", PDPageLabelRange.STYLE_LETTERS_LOWER, "Lth/co/dtac/android/dtacone/app_one/widget/composable/helper/IdCardNumberVisualTransformation$idCardNumberOffsetMapping$1;", "idCardNumberOffsetMapping", "app_prodRelease"}, m29141k = 1, m29140mv = {1, 8, 0})
/* renamed from: th.co.dtac.android.dtacone.app_one.widget.composable.helper.IdCardNumberVisualTransformation */
/* loaded from: classes7.dex */
public final class IdCardNumberVisualTransformation implements VisualTransformation {
    public static final int $stable = 0;

    /* renamed from: a */
    public final IdCardNumberVisualTransformation$idCardNumberOffsetMapping$1 f82999a = new OffsetMapping() { // from class: th.co.dtac.android.dtacone.app_one.widget.composable.helper.IdCardNumberVisualTransformation$idCardNumberOffsetMapping$1
        @Override // androidx.compose.p003ui.text.input.OffsetMapping
        public int originalToTransformed(int i) {
            if (i <= 0) {
                return i;
            }
            if (i <= 4) {
                return i + 1;
            }
            if (i <= 9) {
                return i + 2;
            }
            if (i <= 11) {
                return i + 3;
            }
            if (i <= 12) {
                return i + 4;
            }
            return 17;
        }

        @Override // androidx.compose.p003ui.text.input.OffsetMapping
        public int transformedToOriginal(int i) {
            if (i <= 1) {
                return i;
            }
            if (i <= 6) {
                return i - 1;
            }
            if (i <= 12) {
                return i - 2;
            }
            if (i <= 15) {
                return i - 3;
            }
            if (i <= 17) {
                return i - 4;
            }
            return 13;
        }
    };

    @Override // androidx.compose.p003ui.text.input.VisualTransformation
    @NotNull
    public TransformedText filter(@NotNull AnnotatedString text) {
        String text2;
        Intrinsics.checkNotNullParameter(text, "text");
        if (text.getText().length() > 13) {
            text2 = StringsKt__StringsKt.substring(text.getText(), new IntRange(0, 12));
        } else {
            text2 = text.getText();
        }
        int length = text2.length();
        String str = "";
        for (int i = 0; i < length; i++) {
            String str2 = str + text2.charAt(i);
            if (CollectionsKt__CollectionsKt.listOf((Object[]) new Integer[]{0, 4, 9, 11}).contains(Integer.valueOf(i))) {
                str2 = str2 + HelpFormatter.DEFAULT_LONG_OPT_SEPARATOR;
            }
            str = str2;
        }
        return new TransformedText(new AnnotatedString(str, null, null, 6, null), this.f82999a);
    }
}
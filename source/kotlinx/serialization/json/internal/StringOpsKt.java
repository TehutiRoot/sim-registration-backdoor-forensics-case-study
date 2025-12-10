package kotlinx.serialization.json.internal;

import com.tom_roush.pdfbox.contentstream.operator.OperatorName;
import com.tom_roush.pdfbox.pdmodel.common.PDPageLabelRange;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

@Metadata(m28851d1 = {"\u0000<\n\u0002\u0010\b\n\u0000\n\u0002\u0010\f\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\u0011\n\u0002\b\u0004\n\u0002\u0010\u0012\n\u0002\b\u0006\u001a\u0017\u0010\u0003\u001a\u00020\u00022\u0006\u0010\u0001\u001a\u00020\u0000H\u0002¢\u0006\u0004\b\u0003\u0010\u0004\u001a\u001f\u0010\n\u001a\u00020\t*\u00060\u0005j\u0002`\u00062\u0006\u0010\b\u001a\u00020\u0007H\u0000¢\u0006\u0004\b\n\u0010\u000b\u001a\u0015\u0010\r\u001a\u0004\u0018\u00010\f*\u00020\u0007H\u0000¢\u0006\u0004\b\r\u0010\u000e\"\"\u0010\u0013\u001a\n\u0012\u0006\u0012\u0004\u0018\u00010\u00070\u000f8\u0000X\u0080\u0004¢\u0006\f\n\u0004\b\u0003\u0010\u0010\u001a\u0004\b\u0011\u0010\u0012\"\u001a\u0010\u0019\u001a\u00020\u00148\u0000X\u0080\u0004¢\u0006\f\n\u0004\b\u0015\u0010\u0016\u001a\u0004\b\u0017\u0010\u0018¨\u0006\u001a"}, m28850d2 = {"", "i", "", PDPageLabelRange.STYLE_LETTERS_LOWER, "(I)C", "Ljava/lang/StringBuilder;", "Lkotlin/text/StringBuilder;", "", "value", "", "printQuoted", "(Ljava/lang/StringBuilder;Ljava/lang/String;)V", "", "toBooleanStrictOrNull", "(Ljava/lang/String;)Ljava/lang/Boolean;", "", "[Ljava/lang/String;", "getESCAPE_STRINGS", "()[Ljava/lang/String;", "ESCAPE_STRINGS", "", OperatorName.CLOSE_FILL_NON_ZERO_AND_STROKE, "[B", "getESCAPE_MARKERS", "()[B", "ESCAPE_MARKERS", "kotlinx-serialization-json"}, m28849k = 2, m28848mv = {1, 9, 0})
/* loaded from: classes6.dex */
public final class StringOpsKt {

    /* renamed from: a */
    public static final String[] f71426a;

    /* renamed from: b */
    public static final byte[] f71427b;

    static {
        String[] strArr = new String[93];
        for (int i = 0; i < 32; i++) {
            char m26606a = m26606a(i >> 12);
            char m26606a2 = m26606a(i >> 8);
            char m26606a3 = m26606a(i >> 4);
            char m26606a4 = m26606a(i);
            strArr[i] = "\\u" + m26606a + m26606a2 + m26606a3 + m26606a4;
        }
        strArr[34] = "\\\"";
        strArr[92] = "\\\\";
        strArr[9] = "\\t";
        strArr[8] = "\\b";
        strArr[10] = "\\n";
        strArr[13] = "\\r";
        strArr[12] = "\\f";
        f71426a = strArr;
        byte[] bArr = new byte[93];
        for (int i2 = 0; i2 < 32; i2++) {
            bArr[i2] = 1;
        }
        bArr[34] = 34;
        bArr[92] = 92;
        bArr[9] = 116;
        bArr[8] = 98;
        bArr[10] = 110;
        bArr[13] = 114;
        bArr[12] = 102;
        f71427b = bArr;
    }

    /* renamed from: a */
    public static final char m26606a(int i) {
        int i2 = i & 15;
        return (char) (i2 < 10 ? i2 + 48 : i2 + 87);
    }

    @NotNull
    public static final byte[] getESCAPE_MARKERS() {
        return f71427b;
    }

    @NotNull
    public static final String[] getESCAPE_STRINGS() {
        return f71426a;
    }

    public static final void printQuoted(@NotNull StringBuilder sb, @NotNull String value) {
        Intrinsics.checkNotNullParameter(sb, "<this>");
        Intrinsics.checkNotNullParameter(value, "value");
        sb.append('\"');
        int length = value.length();
        int i = 0;
        for (int i2 = 0; i2 < length; i2++) {
            char charAt = value.charAt(i2);
            String[] strArr = f71426a;
            if (charAt < strArr.length && strArr[charAt] != null) {
                sb.append((CharSequence) value, i, i2);
                sb.append(strArr[charAt]);
                i = i2 + 1;
            }
        }
        if (i != 0) {
            sb.append((CharSequence) value, i, value.length());
        } else {
            sb.append(value);
        }
        sb.append('\"');
    }

    @Nullable
    public static final Boolean toBooleanStrictOrNull(@NotNull String str) {
        Intrinsics.checkNotNullParameter(str, "<this>");
        if (AbstractC20204hN1.equals(str, "true", true)) {
            return Boolean.TRUE;
        }
        if (AbstractC20204hN1.equals(str, "false", true)) {
            return Boolean.FALSE;
        }
        return null;
    }
}

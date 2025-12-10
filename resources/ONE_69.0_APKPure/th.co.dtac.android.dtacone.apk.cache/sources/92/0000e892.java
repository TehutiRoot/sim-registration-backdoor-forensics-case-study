package kotlinx.serialization.json.internal;

import androidx.constraintlayout.core.motion.utils.TypedValues;
import com.tom_roush.pdfbox.contentstream.operator.OperatorName;
import com.tom_roush.pdfbox.pdmodel.common.PDPageLabelRange;
import java.util.Arrays;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import kotlin.ranges.AbstractC11695c;
import org.bouncycastle.i18n.TextBundle;
import org.jetbrains.annotations.NotNull;

@Metadata(m29143d1 = {"\u0000:\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0004\n\u0002\u0010\t\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0010\f\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0002\b\u000f\n\u0002\u0010\u0019\n\u0002\b\u0005\b\u0000\u0018\u00002\u00020\u0001B\u0007¢\u0006\u0004\b\u0002\u0010\u0003J\u001f\u0010\u0007\u001a\u00020\u00042\u0006\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u0006\u001a\u00020\u0004H\u0002¢\u0006\u0004\b\u0007\u0010\bJ\u0017\u0010\f\u001a\u00020\u000b2\u0006\u0010\n\u001a\u00020\tH\u0016¢\u0006\u0004\b\f\u0010\rJ\u0017\u0010\u0010\u001a\u00020\u000b2\u0006\u0010\u000f\u001a\u00020\u000eH\u0016¢\u0006\u0004\b\u0010\u0010\u0011J\u0017\u0010\u0014\u001a\u00020\u000b2\u0006\u0010\u0013\u001a\u00020\u0012H\u0016¢\u0006\u0004\b\u0014\u0010\u0015J\u0017\u0010\u0016\u001a\u00020\u000b2\u0006\u0010\u0013\u001a\u00020\u0012H\u0016¢\u0006\u0004\b\u0016\u0010\u0015J\u000f\u0010\u0017\u001a\u00020\u000bH\u0016¢\u0006\u0004\b\u0017\u0010\u0003J\u000f\u0010\u0018\u001a\u00020\u0012H\u0016¢\u0006\u0004\b\u0018\u0010\u0019J'\u0010\u001d\u001a\u00020\u000b2\u0006\u0010\u001a\u001a\u00020\u00042\u0006\u0010\u001b\u001a\u00020\u00042\u0006\u0010\u001c\u001a\u00020\u0012H\u0002¢\u0006\u0004\b\u001d\u0010\u001eJ\u0017\u0010 \u001a\u00020\u000b2\u0006\u0010\u001f\u001a\u00020\u0004H\u0002¢\u0006\u0004\b \u0010!R\u0016\u0010$\u001a\u00020\"8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b\u001d\u0010#R\u0016\u0010&\u001a\u00020\u00048\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b \u0010%¨\u0006'"}, m29142d2 = {"Lkotlinx/serialization/json/internal/JsonToStringWriter;", "Lkotlinx/serialization/json/internal/InternalJsonWriter;", "<init>", "()V", "", "oldSize", "additional", OperatorName.CURVE_TO, "(II)I", "", "value", "", "writeLong", "(J)V", "", "char", "writeChar", "(C)V", "", TextBundle.TEXT_ENTRY, "write", "(Ljava/lang/String;)V", "writeQuoted", "release", "toString", "()Ljava/lang/String;", "firstEscapedChar", "currentSize", TypedValues.Custom.S_STRING, PDPageLabelRange.STYLE_LETTERS_LOWER, "(IILjava/lang/String;)V", "expected", OperatorName.CLOSE_FILL_NON_ZERO_AND_STROKE, "(I)V", "", "[C", "array", "I", "size", "kotlinx-serialization-json"}, m29141k = 1, m29140mv = {1, 9, 0})
/* loaded from: classes6.dex */
public final class JsonToStringWriter implements InternalJsonWriter {

    /* renamed from: a */
    public char[] f71431a = CharArrayPool.INSTANCE.take();

    /* renamed from: b */
    public int f71432b;

    /* renamed from: c */
    private final int m26918c(int i, int i2) {
        int i3 = i2 + i;
        char[] cArr = this.f71431a;
        if (cArr.length <= i3) {
            char[] copyOf = Arrays.copyOf(cArr, AbstractC11695c.coerceAtLeast(i3, i * 2));
            Intrinsics.checkNotNullExpressionValue(copyOf, "copyOf(...)");
            this.f71431a = copyOf;
        }
        return i;
    }

    /* renamed from: a */
    public final void m26920a(int i, int i2, String str) {
        int i3;
        int length = str.length();
        while (i < length) {
            int m26918c = m26918c(i2, 2);
            char charAt = str.charAt(i);
            if (charAt < StringOpsKt.getESCAPE_MARKERS().length) {
                byte b = StringOpsKt.getESCAPE_MARKERS()[charAt];
                if (b == 0) {
                    i3 = m26918c + 1;
                    this.f71431a[m26918c] = charAt;
                } else {
                    if (b == 1) {
                        String str2 = StringOpsKt.getESCAPE_STRINGS()[charAt];
                        Intrinsics.checkNotNull(str2);
                        int m26918c2 = m26918c(m26918c, str2.length());
                        str2.getChars(0, str2.length(), this.f71431a, m26918c2);
                        i2 = m26918c2 + str2.length();
                        this.f71432b = i2;
                    } else {
                        char[] cArr = this.f71431a;
                        cArr[m26918c] = '\\';
                        cArr[m26918c + 1] = (char) b;
                        i2 = m26918c + 2;
                        this.f71432b = i2;
                    }
                    i++;
                }
            } else {
                i3 = m26918c + 1;
                this.f71431a[m26918c] = charAt;
            }
            i2 = i3;
            i++;
        }
        int m26918c3 = m26918c(i2, 1);
        this.f71431a[m26918c3] = '\"';
        this.f71432b = m26918c3 + 1;
    }

    /* renamed from: b */
    public final void m26919b(int i) {
        m26918c(this.f71432b, i);
    }

    @Override // kotlinx.serialization.json.internal.InternalJsonWriter
    public void release() {
        CharArrayPool.INSTANCE.release(this.f71431a);
    }

    @NotNull
    public String toString() {
        return new String(this.f71431a, 0, this.f71432b);
    }

    @Override // kotlinx.serialization.json.internal.InternalJsonWriter
    public void write(@NotNull String text) {
        Intrinsics.checkNotNullParameter(text, "text");
        int length = text.length();
        if (length == 0) {
            return;
        }
        m26919b(length);
        text.getChars(0, text.length(), this.f71431a, this.f71432b);
        this.f71432b += length;
    }

    @Override // kotlinx.serialization.json.internal.InternalJsonWriter
    public void writeChar(char c) {
        m26919b(1);
        char[] cArr = this.f71431a;
        int i = this.f71432b;
        this.f71432b = i + 1;
        cArr[i] = c;
    }

    @Override // kotlinx.serialization.json.internal.InternalJsonWriter
    public void writeLong(long j) {
        write(String.valueOf(j));
    }

    @Override // kotlinx.serialization.json.internal.InternalJsonWriter
    public void writeQuoted(@NotNull String text) {
        Intrinsics.checkNotNullParameter(text, "text");
        m26919b(text.length() + 2);
        char[] cArr = this.f71431a;
        int i = this.f71432b;
        int i2 = i + 1;
        cArr[i] = '\"';
        int length = text.length();
        text.getChars(0, length, cArr, i2);
        int i3 = length + i2;
        for (int i4 = i2; i4 < i3; i4++) {
            char c = cArr[i4];
            if (c < StringOpsKt.getESCAPE_MARKERS().length && StringOpsKt.getESCAPE_MARKERS()[c] != 0) {
                m26920a(i4 - i2, i4, text);
                return;
            }
        }
        cArr[i3] = '\"';
        this.f71432b = i3 + 1;
    }
}
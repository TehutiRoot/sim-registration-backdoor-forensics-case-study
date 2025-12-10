package kotlinx.serialization.json.internal;

import com.tom_roush.pdfbox.contentstream.operator.OperatorName;
import com.tom_roush.pdfbox.pdmodel.common.PDPageLabelRange;
import com.tom_roush.pdfbox.pdmodel.interactive.action.PDWindowsLaunchParams;
import kotlin.Metadata;
import kotlin.jvm.JvmField;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

@Metadata(m28851d1 = {"\u0000R\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u0002\n\u0002\b\u0006\n\u0002\u0010\f\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\u0007\n\u0000\n\u0002\u0010\u0006\n\u0000\n\u0002\u0010\u0005\n\u0000\n\u0002\u0010\n\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0010\t\n\u0000\n\u0002\u0010\u000b\n\u0002\b\f\b\u0010\u0018\u00002\u00020\u0001B\u000f\u0012\u0006\u0010\u0003\u001a\u00020\u0002¢\u0006\u0004\b\u0004\u0010\u0005J\u000f\u0010\u0007\u001a\u00020\u0006H\u0016¢\u0006\u0004\b\u0007\u0010\bJ\u000f\u0010\t\u001a\u00020\u0006H\u0016¢\u0006\u0004\b\t\u0010\bJ\u000f\u0010\n\u001a\u00020\u0006H\u0016¢\u0006\u0004\b\n\u0010\bJ\u000f\u0010\u000b\u001a\u00020\u0006H\u0016¢\u0006\u0004\b\u000b\u0010\bJ\u000f\u0010\f\u001a\u00020\u0006H\u0016¢\u0006\u0004\b\f\u0010\bJ\u0015\u0010\u000f\u001a\u00020\u00062\u0006\u0010\u000e\u001a\u00020\r¢\u0006\u0004\b\u000f\u0010\u0010J\u0015\u0010\u000f\u001a\u00020\u00062\u0006\u0010\u000e\u001a\u00020\u0011¢\u0006\u0004\b\u000f\u0010\u0012J\u0017\u0010\u000f\u001a\u00020\u00062\u0006\u0010\u000e\u001a\u00020\u0013H\u0016¢\u0006\u0004\b\u000f\u0010\u0014J\u0017\u0010\u000f\u001a\u00020\u00062\u0006\u0010\u000e\u001a\u00020\u0015H\u0016¢\u0006\u0004\b\u000f\u0010\u0016J\u0017\u0010\u000f\u001a\u00020\u00062\u0006\u0010\u000e\u001a\u00020\u0017H\u0016¢\u0006\u0004\b\u000f\u0010\u0018J\u0017\u0010\u000f\u001a\u00020\u00062\u0006\u0010\u000e\u001a\u00020\u0019H\u0016¢\u0006\u0004\b\u000f\u0010\u001aJ\u0017\u0010\u000f\u001a\u00020\u00062\u0006\u0010\u000e\u001a\u00020\u001bH\u0016¢\u0006\u0004\b\u000f\u0010\u001cJ\u0017\u0010\u000f\u001a\u00020\u00062\u0006\u0010\u000e\u001a\u00020\u001dH\u0016¢\u0006\u0004\b\u000f\u0010\u001eJ\u0017\u0010\u000f\u001a\u00020\u00062\u0006\u0010\u000e\u001a\u00020\u001fH\u0016¢\u0006\u0004\b\u000f\u0010 J\u0017\u0010\"\u001a\u00020\u00062\u0006\u0010!\u001a\u00020\u0011H\u0016¢\u0006\u0004\b\"\u0010\u0012R\u0014\u0010\u0003\u001a\u00020\u00028\u0000X\u0081\u0004¢\u0006\u0006\n\u0004\b\u0003\u0010#R*\u0010*\u001a\u00020\u001f2\u0006\u0010$\u001a\u00020\u001f8\u0006@DX\u0086\u000e¢\u0006\u0012\n\u0004\b%\u0010&\u001a\u0004\b'\u0010(\"\u0004\b)\u0010 ¨\u0006+"}, m28850d2 = {"Lkotlinx/serialization/json/internal/Composer;", "", "Lkotlinx/serialization/json/internal/InternalJsonWriter;", "writer", "<init>", "(Lkotlinx/serialization/json/internal/InternalJsonWriter;)V", "", "indent", "()V", "unIndent", "nextItem", "nextItemIfNotFirst", "space", "", OperatorName.CURVE_TO_REPLICATE_INITIAL_POINT, PDWindowsLaunchParams.OPERATION_PRINT, "(C)V", "", "(Ljava/lang/String;)V", "", "(F)V", "", "(D)V", "", "(B)V", "", "(S)V", "", "(I)V", "", "(J)V", "", "(Z)V", "value", "printQuoted", "Lkotlinx/serialization/json/internal/InternalJsonWriter;", "<set-?>", PDPageLabelRange.STYLE_LETTERS_LOWER, "Z", "getWritingFirst", "()Z", "setWritingFirst", "writingFirst", "kotlinx-serialization-json"}, m28849k = 1, m28848mv = {1, 9, 0})
/* loaded from: classes6.dex */
public class Composer {

    /* renamed from: a */
    public boolean f71375a;
    @JvmField
    @NotNull
    public final InternalJsonWriter writer;

    public Composer(@NotNull InternalJsonWriter writer) {
        Intrinsics.checkNotNullParameter(writer, "writer");
        this.writer = writer;
        this.f71375a = true;
    }

    public final boolean getWritingFirst() {
        return this.f71375a;
    }

    public void indent() {
        this.f71375a = true;
    }

    public void nextItem() {
        this.f71375a = false;
    }

    public void nextItemIfNotFirst() {
        this.f71375a = false;
    }

    public final void print(char c) {
        this.writer.writeChar(c);
    }

    public void printQuoted(@NotNull String value) {
        Intrinsics.checkNotNullParameter(value, "value");
        this.writer.writeQuoted(value);
    }

    public final void setWritingFirst(boolean z) {
        this.f71375a = z;
    }

    public void space() {
    }

    public void unIndent() {
    }

    public final void print(@NotNull String v) {
        Intrinsics.checkNotNullParameter(v, "v");
        this.writer.write(v);
    }

    public void print(float f) {
        this.writer.write(String.valueOf(f));
    }

    public void print(double d) {
        this.writer.write(String.valueOf(d));
    }

    public void print(byte b) {
        this.writer.writeLong(b);
    }

    public void print(short s) {
        this.writer.writeLong(s);
    }

    public void print(int i) {
        this.writer.writeLong(i);
    }

    public void print(long j) {
        this.writer.writeLong(j);
    }

    public void print(boolean z) {
        this.writer.write(String.valueOf(z));
    }
}

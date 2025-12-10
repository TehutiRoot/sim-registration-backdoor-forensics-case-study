package kotlinx.serialization.json.internal;

import com.tom_roush.pdfbox.pdmodel.common.PDPageLabelRange;
import java.io.InputStream;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import kotlin.text.Charsets;
import org.jetbrains.annotations.NotNull;

@Metadata(m28851d1 = {"\u0000.\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u0019\n\u0000\n\u0002\u0010\b\n\u0002\b\u0004\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\b\u0000\u0018\u00002\u00020\u0001B\u000f\u0012\u0006\u0010\u0003\u001a\u00020\u0002¢\u0006\u0004\b\u0004\u0010\u0005J'\u0010\u000b\u001a\u00020\b2\u0006\u0010\u0007\u001a\u00020\u00062\u0006\u0010\t\u001a\u00020\b2\u0006\u0010\n\u001a\u00020\bH\u0016¢\u0006\u0004\b\u000b\u0010\fJ\r\u0010\u000e\u001a\u00020\r¢\u0006\u0004\b\u000e\u0010\u000fR\u0014\u0010\u0013\u001a\u00020\u00108\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0011\u0010\u0012¨\u0006\u0014"}, m28850d2 = {"Lkotlinx/serialization/json/internal/JavaStreamSerialReader;", "Lkotlinx/serialization/json/internal/InternalJsonReader;", "Ljava/io/InputStream;", "stream", "<init>", "(Ljava/io/InputStream;)V", "", "buffer", "", "bufferOffset", "count", "read", "([CII)I", "", "release", "()V", "Lkotlinx/serialization/json/internal/CharsetReader;", PDPageLabelRange.STYLE_LETTERS_LOWER, "Lkotlinx/serialization/json/internal/CharsetReader;", "reader", "kotlinx-serialization-json"}, m28849k = 1, m28848mv = {1, 9, 0})
/* loaded from: classes6.dex */
public final class JavaStreamSerialReader implements InternalJsonReader {

    /* renamed from: a */
    public final CharsetReader f71381a;

    public JavaStreamSerialReader(@NotNull InputStream stream) {
        Intrinsics.checkNotNullParameter(stream, "stream");
        this.f71381a = new CharsetReader(stream, Charsets.UTF_8);
    }

    @Override // kotlinx.serialization.json.internal.InternalJsonReader
    public int read(@NotNull char[] buffer, int i, int i2) {
        Intrinsics.checkNotNullParameter(buffer, "buffer");
        return this.f71381a.read(buffer, i, i2);
    }

    public final void release() {
        this.f71381a.release();
    }
}

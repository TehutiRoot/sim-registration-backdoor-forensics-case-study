package coil.fetch;

import coil.decode.DataSource;
import coil.decode.ImageSource;
import com.tom_roush.pdfbox.contentstream.operator.OperatorName;
import com.tom_roush.pdfbox.pdmodel.common.PDPageLabelRange;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

@Metadata(m28851d1 = {"\u00002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u000f\u0018\u00002\u00020\u0001B!\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\b\u0010\u0005\u001a\u0004\u0018\u00010\u0004\u0012\u0006\u0010\u0007\u001a\u00020\u0006¢\u0006\u0004\b\b\u0010\tJ-\u0010\n\u001a\u00020\u00002\b\b\u0002\u0010\u0003\u001a\u00020\u00022\n\b\u0002\u0010\u0005\u001a\u0004\u0018\u00010\u00042\b\b\u0002\u0010\u0007\u001a\u00020\u0006¢\u0006\u0004\b\n\u0010\u000bJ\u001a\u0010\u000f\u001a\u00020\u000e2\b\u0010\r\u001a\u0004\u0018\u00010\fH\u0096\u0002¢\u0006\u0004\b\u000f\u0010\u0010J\u000f\u0010\u0012\u001a\u00020\u0011H\u0016¢\u0006\u0004\b\u0012\u0010\u0013R\u0017\u0010\u0003\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u0014\u0010\u0015\u001a\u0004\b\u0016\u0010\u0017R\u0019\u0010\u0005\u001a\u0004\u0018\u00010\u00048\u0006¢\u0006\f\n\u0004\b\u0018\u0010\u0019\u001a\u0004\b\u001a\u0010\u001bR\u0017\u0010\u0007\u001a\u00020\u00068\u0006¢\u0006\f\n\u0004\b\u001c\u0010\u001d\u001a\u0004\b\u001e\u0010\u001f¨\u0006 "}, m28850d2 = {"Lcoil/fetch/SourceResult;", "Lcoil/fetch/FetchResult;", "Lcoil/decode/ImageSource;", "source", "", "mimeType", "Lcoil/decode/DataSource;", "dataSource", "<init>", "(Lcoil/decode/ImageSource;Ljava/lang/String;Lcoil/decode/DataSource;)V", "copy", "(Lcoil/decode/ImageSource;Ljava/lang/String;Lcoil/decode/DataSource;)Lcoil/fetch/SourceResult;", "", "other", "", "equals", "(Ljava/lang/Object;)Z", "", "hashCode", "()I", PDPageLabelRange.STYLE_LETTERS_LOWER, "Lcoil/decode/ImageSource;", "getSource", "()Lcoil/decode/ImageSource;", OperatorName.CLOSE_FILL_NON_ZERO_AND_STROKE, "Ljava/lang/String;", "getMimeType", "()Ljava/lang/String;", OperatorName.CURVE_TO, "Lcoil/decode/DataSource;", "getDataSource", "()Lcoil/decode/DataSource;", "coil-base_release"}, m28849k = 1, m28848mv = {1, 8, 0})
/* loaded from: classes3.dex */
public final class SourceResult extends FetchResult {

    /* renamed from: a */
    public final ImageSource f40591a;

    /* renamed from: b */
    public final String f40592b;

    /* renamed from: c */
    public final DataSource f40593c;

    public SourceResult(@NotNull ImageSource imageSource, @Nullable String str, @NotNull DataSource dataSource) {
        super(null);
        this.f40591a = imageSource;
        this.f40592b = str;
        this.f40593c = dataSource;
    }

    public static /* synthetic */ SourceResult copy$default(SourceResult sourceResult, ImageSource imageSource, String str, DataSource dataSource, int i, Object obj) {
        if ((i & 1) != 0) {
            imageSource = sourceResult.f40591a;
        }
        if ((i & 2) != 0) {
            str = sourceResult.f40592b;
        }
        if ((i & 4) != 0) {
            dataSource = sourceResult.f40593c;
        }
        return sourceResult.copy(imageSource, str, dataSource);
    }

    @NotNull
    public final SourceResult copy(@NotNull ImageSource imageSource, @Nullable String str, @NotNull DataSource dataSource) {
        return new SourceResult(imageSource, str, dataSource);
    }

    public boolean equals(@Nullable Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj instanceof SourceResult) {
            SourceResult sourceResult = (SourceResult) obj;
            if (Intrinsics.areEqual(this.f40591a, sourceResult.f40591a) && Intrinsics.areEqual(this.f40592b, sourceResult.f40592b) && this.f40593c == sourceResult.f40593c) {
                return true;
            }
        }
        return false;
    }

    @NotNull
    public final DataSource getDataSource() {
        return this.f40593c;
    }

    @Nullable
    public final String getMimeType() {
        return this.f40592b;
    }

    @NotNull
    public final ImageSource getSource() {
        return this.f40591a;
    }

    public int hashCode() {
        int i;
        int hashCode = this.f40591a.hashCode() * 31;
        String str = this.f40592b;
        if (str != null) {
            i = str.hashCode();
        } else {
            i = 0;
        }
        return ((hashCode + i) * 31) + this.f40593c.hashCode();
    }
}

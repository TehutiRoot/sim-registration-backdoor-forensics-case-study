package androidx.compose.p003ui.text;

import androidx.compose.runtime.internal.StabilityInferred;
import ch.qos.logback.core.CoreConstants;
import com.google.android.gms.common.internal.ImagesContract;
import com.tom_roush.pdfbox.pdmodel.common.PDPageLabelRange;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

@StabilityInferred(parameters = 0)
@ExperimentalTextApi
@Metadata(m28851d1 = {"\u0000 \n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\u000e\n\u0002\b\u0004\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\b\b\u0007\u0018\u00002\u00020\u0001B\u000f\u0012\u0006\u0010\u0003\u001a\u00020\u0002¢\u0006\u0004\b\u0004\u0010\u0005J\u001a\u0010\b\u001a\u00020\u00072\b\u0010\u0006\u001a\u0004\u0018\u00010\u0001H\u0096\u0002¢\u0006\u0004\b\b\u0010\tJ\u000f\u0010\u000b\u001a\u00020\nH\u0016¢\u0006\u0004\b\u000b\u0010\fJ\u000f\u0010\r\u001a\u00020\u0002H\u0016¢\u0006\u0004\b\r\u0010\u000eR\u0017\u0010\u0003\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u000f\u0010\u0010\u001a\u0004\b\u0011\u0010\u000e¨\u0006\u0012"}, m28850d2 = {"Landroidx/compose/ui/text/UrlAnnotation;", "", "", ImagesContract.URL, "<init>", "(Ljava/lang/String;)V", "other", "", "equals", "(Ljava/lang/Object;)Z", "", "hashCode", "()I", "toString", "()Ljava/lang/String;", PDPageLabelRange.STYLE_LETTERS_LOWER, "Ljava/lang/String;", "getUrl", "ui-text_release"}, m28849k = 1, m28848mv = {1, 8, 0})
/* renamed from: androidx.compose.ui.text.UrlAnnotation */
/* loaded from: classes2.dex */
public final class UrlAnnotation {
    public static final int $stable = 0;

    /* renamed from: a */
    public final String f31115a;

    public UrlAnnotation(@NotNull String url) {
        Intrinsics.checkNotNullParameter(url, "url");
        this.f31115a = url;
    }

    public boolean equals(@Nullable Object obj) {
        if (this == obj) {
            return true;
        }
        if ((obj instanceof UrlAnnotation) && Intrinsics.areEqual(this.f31115a, ((UrlAnnotation) obj).f31115a)) {
            return true;
        }
        return false;
    }

    @NotNull
    public final String getUrl() {
        return this.f31115a;
    }

    public int hashCode() {
        return this.f31115a.hashCode();
    }

    @NotNull
    public String toString() {
        return "UrlAnnotation(url=" + this.f31115a + CoreConstants.RIGHT_PARENTHESIS_CHAR;
    }
}

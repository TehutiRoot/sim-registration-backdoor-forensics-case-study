package androidx.navigation;

import androidx.navigation.NavDeepLink;
import com.fasterxml.jackson.databind.annotation.JsonPOJOBuilder;
import com.tom_roush.pdfbox.contentstream.operator.OperatorName;
import com.tom_roush.pdfbox.pdmodel.common.PDPageLabelRange;
import kotlin.Metadata;
import kotlin.jvm.internal.SourceDebugExtension;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

@NavDeepLinkDsl
@Metadata(m28851d1 = {"\u0000$\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0002\b\u0011\b\u0007\u0018\u00002\u00020\u0001B\u0007¢\u0006\u0004\b\u0002\u0010\u0003J\u000f\u0010\u0007\u001a\u00020\u0004H\u0000¢\u0006\u0004\b\u0005\u0010\u0006R\u0014\u0010\u000b\u001a\u00020\b8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\t\u0010\nR$\u0010\u0013\u001a\u0004\u0018\u00010\f8\u0006@\u0006X\u0086\u000e¢\u0006\u0012\n\u0004\b\r\u0010\u000e\u001a\u0004\b\u000f\u0010\u0010\"\u0004\b\u0011\u0010\u0012R.\u0010\u0018\u001a\u0004\u0018\u00010\f2\b\u0010\u0014\u001a\u0004\u0018\u00010\f8\u0006@FX\u0086\u000e¢\u0006\u0012\n\u0004\b\u0015\u0010\u000e\u001a\u0004\b\u0016\u0010\u0010\"\u0004\b\u0017\u0010\u0012R$\u0010\u001c\u001a\u0004\u0018\u00010\f8\u0006@\u0006X\u0086\u000e¢\u0006\u0012\n\u0004\b\u0019\u0010\u000e\u001a\u0004\b\u001a\u0010\u0010\"\u0004\b\u001b\u0010\u0012¨\u0006\u001d"}, m28850d2 = {"Landroidx/navigation/NavDeepLinkDslBuilder;", "", "<init>", "()V", "Landroidx/navigation/NavDeepLink;", "build$navigation_common_release", "()Landroidx/navigation/NavDeepLink;", JsonPOJOBuilder.DEFAULT_BUILD_METHOD, "Landroidx/navigation/NavDeepLink$Builder;", PDPageLabelRange.STYLE_LETTERS_LOWER, "Landroidx/navigation/NavDeepLink$Builder;", "builder", "", OperatorName.CLOSE_FILL_NON_ZERO_AND_STROKE, "Ljava/lang/String;", "getUriPattern", "()Ljava/lang/String;", "setUriPattern", "(Ljava/lang/String;)V", "uriPattern", "p", OperatorName.CURVE_TO, "getAction", "setAction", "action", "d", "getMimeType", "setMimeType", "mimeType", "navigation-common_release"}, m28849k = 1, m28848mv = {1, 8, 0})
@SourceDebugExtension({"SMAP\nNavDeepLinkDslBuilder.kt\nKotlin\n*S Kotlin\n*F\n+ 1 NavDeepLinkDslBuilder.kt\nandroidx/navigation/NavDeepLinkDslBuilder\n+ 2 fake.kt\nkotlin/jvm/internal/FakeKt\n*L\n1#1,68:1\n1#2:69\n*E\n"})
/* loaded from: classes2.dex */
public final class NavDeepLinkDslBuilder {

    /* renamed from: a */
    public final NavDeepLink.Builder f36304a = new NavDeepLink.Builder();

    /* renamed from: b */
    public String f36305b;

    /* renamed from: c */
    public String f36306c;

    /* renamed from: d */
    public String f36307d;

    @NotNull
    public final NavDeepLink build$navigation_common_release() {
        NavDeepLink.Builder builder = this.f36304a;
        String str = this.f36305b;
        if (str == null && this.f36306c == null && this.f36307d == null) {
            throw new IllegalStateException("The NavDeepLink must have an uri, action, and/or mimeType.".toString());
        }
        if (str != null) {
            builder.setUriPattern(str);
        }
        String str2 = this.f36306c;
        if (str2 != null) {
            builder.setAction(str2);
        }
        String str3 = this.f36307d;
        if (str3 != null) {
            builder.setMimeType(str3);
        }
        return builder.build();
    }

    @Nullable
    public final String getAction() {
        return this.f36306c;
    }

    @Nullable
    public final String getMimeType() {
        return this.f36307d;
    }

    @Nullable
    public final String getUriPattern() {
        return this.f36305b;
    }

    public final void setAction(@Nullable String str) {
        if (str != null && str.length() == 0) {
            throw new IllegalArgumentException("The NavDeepLink cannot have an empty action.");
        }
        this.f36306c = str;
    }

    public final void setMimeType(@Nullable String str) {
        this.f36307d = str;
    }

    public final void setUriPattern(@Nullable String str) {
        this.f36305b = str;
    }
}

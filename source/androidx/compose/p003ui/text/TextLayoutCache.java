package androidx.compose.p003ui.text;

import androidx.compose.p003ui.text.caches.LruCache;
import ch.qos.logback.core.joran.action.Action;
import com.google.android.gms.analytics.ecommerce.ProductAction;
import com.tom_roush.pdfbox.pdmodel.common.PDPageLabelRange;
import kotlin.Metadata;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

@Metadata(m28851d1 = {"\u0000*\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\b\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\b\u0000\u0018\u00002\u00020\u0001B\u0011\u0012\b\b\u0002\u0010\u0003\u001a\u00020\u0002¢\u0006\u0004\b\u0004\u0010\u0005J\u0017\u0010\t\u001a\u0004\u0018\u00010\b2\u0006\u0010\u0007\u001a\u00020\u0006¢\u0006\u0004\b\t\u0010\nJ\u001f\u0010\f\u001a\u0004\u0018\u00010\b2\u0006\u0010\u0007\u001a\u00020\u00062\u0006\u0010\u000b\u001a\u00020\b¢\u0006\u0004\b\f\u0010\rJ\u0017\u0010\u000e\u001a\u0004\u0018\u00010\b2\u0006\u0010\u0007\u001a\u00020\u0006¢\u0006\u0004\b\u000e\u0010\nR \u0010\u0013\u001a\u000e\u0012\u0004\u0012\u00020\u0010\u0012\u0004\u0012\u00020\b0\u000f8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0011\u0010\u0012¨\u0006\u0014"}, m28850d2 = {"Landroidx/compose/ui/text/TextLayoutCache;", "", "", "capacity", "<init>", "(I)V", "Landroidx/compose/ui/text/TextLayoutInput;", Action.KEY_ATTRIBUTE, "Landroidx/compose/ui/text/TextLayoutResult;", "get", "(Landroidx/compose/ui/text/TextLayoutInput;)Landroidx/compose/ui/text/TextLayoutResult;", "value", "put", "(Landroidx/compose/ui/text/TextLayoutInput;Landroidx/compose/ui/text/TextLayoutResult;)Landroidx/compose/ui/text/TextLayoutResult;", ProductAction.ACTION_REMOVE, "Landroidx/compose/ui/text/caches/LruCache;", "Landroidx/compose/ui/text/CacheTextLayoutInput;", PDPageLabelRange.STYLE_LETTERS_LOWER, "Landroidx/compose/ui/text/caches/LruCache;", "lruCache", "ui-text_release"}, m28849k = 1, m28848mv = {1, 8, 0})
/* renamed from: androidx.compose.ui.text.TextLayoutCache */
/* loaded from: classes2.dex */
public final class TextLayoutCache {

    /* renamed from: a */
    public final LruCache f31084a;

    public TextLayoutCache() {
        this(0, 1, null);
    }

    @Nullable
    public final TextLayoutResult get(@NotNull TextLayoutInput key) {
        Intrinsics.checkNotNullParameter(key, "key");
        TextLayoutResult textLayoutResult = (TextLayoutResult) this.f31084a.get(new CacheTextLayoutInput(key));
        if (textLayoutResult == null || textLayoutResult.getMultiParagraph().getIntrinsics().getHasStaleResolvedFonts()) {
            return null;
        }
        return textLayoutResult;
    }

    @Nullable
    public final TextLayoutResult put(@NotNull TextLayoutInput key, @NotNull TextLayoutResult value) {
        Intrinsics.checkNotNullParameter(key, "key");
        Intrinsics.checkNotNullParameter(value, "value");
        return (TextLayoutResult) this.f31084a.put(new CacheTextLayoutInput(key), value);
    }

    @Nullable
    public final TextLayoutResult remove(@NotNull TextLayoutInput key) {
        Intrinsics.checkNotNullParameter(key, "key");
        return (TextLayoutResult) this.f31084a.remove(new CacheTextLayoutInput(key));
    }

    public TextLayoutCache(int i) {
        this.f31084a = new LruCache(i);
    }

    public /* synthetic */ TextLayoutCache(int i, int i2, DefaultConstructorMarker defaultConstructorMarker) {
        this((i2 & 1) != 0 ? TextMeasurerKt.f31108a : i);
    }
}

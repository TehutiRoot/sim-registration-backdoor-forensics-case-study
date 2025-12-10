package androidx.compose.p003ui.text.platform;

import android.text.style.URLSpan;
import androidx.compose.p003ui.text.InternalTextApi;
import androidx.compose.p003ui.text.UrlAnnotation;
import androidx.compose.runtime.internal.StabilityInferred;
import com.tom_roush.pdfbox.pdmodel.common.PDPageLabelRange;
import java.util.WeakHashMap;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.SourceDebugExtension;
import org.jetbrains.annotations.NotNull;

@StabilityInferred(parameters = 0)
@Metadata(m28851d1 = {"\u0000\"\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\b\u0007\u0018\u00002\u00020\u0001B\u0007¢\u0006\u0004\b\u0002\u0010\u0003J\u0015\u0010\u0007\u001a\u00020\u00062\u0006\u0010\u0005\u001a\u00020\u0004¢\u0006\u0004\b\u0007\u0010\bR \u0010\f\u001a\u000e\u0012\u0004\u0012\u00020\u0004\u0012\u0004\u0012\u00020\u00060\t8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\n\u0010\u000b¨\u0006\r"}, m28850d2 = {"Landroidx/compose/ui/text/platform/URLSpanCache;", "", "<init>", "()V", "Landroidx/compose/ui/text/UrlAnnotation;", "urlAnnotation", "Landroid/text/style/URLSpan;", "toURLSpan", "(Landroidx/compose/ui/text/UrlAnnotation;)Landroid/text/style/URLSpan;", "Ljava/util/WeakHashMap;", PDPageLabelRange.STYLE_LETTERS_LOWER, "Ljava/util/WeakHashMap;", "spansByAnnotation", "ui-text_release"}, m28849k = 1, m28848mv = {1, 8, 0})
@InternalTextApi
@SourceDebugExtension({"SMAP\nURLSpanCache.kt\nKotlin\n*S Kotlin\n*F\n+ 1 URLSpanCache.kt\nandroidx/compose/ui/text/platform/URLSpanCache\n+ 2 Maps.kt\nkotlin/collections/MapsKt__MapsKt\n*L\n1#1,46:1\n361#2,7:47\n*S KotlinDebug\n*F\n+ 1 URLSpanCache.kt\nandroidx/compose/ui/text/platform/URLSpanCache\n*L\n45#1:47,7\n*E\n"})
/* renamed from: androidx.compose.ui.text.platform.URLSpanCache */
/* loaded from: classes2.dex */
public final class URLSpanCache {
    public static final int $stable = 8;

    /* renamed from: a */
    public final WeakHashMap f31507a = new WeakHashMap();

    @NotNull
    public final URLSpan toURLSpan(@NotNull UrlAnnotation urlAnnotation) {
        Intrinsics.checkNotNullParameter(urlAnnotation, "urlAnnotation");
        WeakHashMap weakHashMap = this.f31507a;
        Object obj = weakHashMap.get(urlAnnotation);
        if (obj == null) {
            obj = new URLSpan(urlAnnotation.getUrl());
            weakHashMap.put(urlAnnotation, obj);
        }
        return (URLSpan) obj;
    }
}

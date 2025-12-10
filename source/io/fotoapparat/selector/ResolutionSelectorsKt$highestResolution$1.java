package io.fotoapparat.selector;

import io.fotoapparat.parameter.Resolution;
import java.util.Iterator;
import kotlin.Metadata;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.Lambda;
import kotlin.jvm.internal.SourceDebugExtension;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

@Metadata(m28851d1 = {"\u0000\f\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010\u001c\n\u0000\u0010\u0000\u001a\u0004\u0018\u00010\u0001*\b\u0012\u0004\u0012\u00020\u00010\u0002H\n¢\u0006\u0002\b\u0003"}, m28850d2 = {"<anonymous>", "Lio/fotoapparat/parameter/Resolution;", "", "invoke"}, m28849k = 3, m28848mv = {1, 8, 0}, m28846xi = 48)
@SourceDebugExtension({"SMAP\nResolutionSelectors.kt\nKotlin\n*S Kotlin\n*F\n+ 1 ResolutionSelectors.kt\nio/fotoapparat/selector/ResolutionSelectorsKt$highestResolution$1\n+ 2 _Collections.kt\nkotlin/collections/CollectionsKt___CollectionsKt\n*L\n1#1,15:1\n1963#2,14:16\n*S KotlinDebug\n*F\n+ 1 ResolutionSelectors.kt\nio/fotoapparat/selector/ResolutionSelectorsKt$highestResolution$1\n*L\n10#1:16,14\n*E\n"})
/* loaded from: classes5.dex */
public final class ResolutionSelectorsKt$highestResolution$1 extends Lambda implements Function1<Iterable<? extends Resolution>, Resolution> {
    public static final ResolutionSelectorsKt$highestResolution$1 INSTANCE = new ResolutionSelectorsKt$highestResolution$1();

    public ResolutionSelectorsKt$highestResolution$1() {
        super(1);
    }

    @Override // kotlin.jvm.functions.Function1
    public /* bridge */ /* synthetic */ Resolution invoke(Iterable<? extends Resolution> iterable) {
        return invoke2((Iterable<Resolution>) iterable);
    }

    @Nullable
    /* renamed from: invoke  reason: avoid collision after fix types in other method */
    public final Resolution invoke2(@NotNull Iterable<Resolution> iterable) {
        Resolution resolution;
        Intrinsics.checkNotNullParameter(iterable, "$this$null");
        Iterator<Resolution> it = iterable.iterator();
        if (it.hasNext()) {
            Resolution next = it.next();
            if (it.hasNext()) {
                int area = next.getArea();
                do {
                    Resolution next2 = it.next();
                    int area2 = next2.getArea();
                    if (area < area2) {
                        next = next2;
                        area = area2;
                    }
                } while (it.hasNext());
                resolution = next;
            } else {
                resolution = next;
            }
        } else {
            resolution = null;
        }
        return resolution;
    }
}

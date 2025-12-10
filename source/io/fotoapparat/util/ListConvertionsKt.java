package io.fotoapparat.util;

import java.util.ArrayList;
import java.util.List;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.SourceDebugExtension;
import kotlin.text.StringsKt__StringsKt;
import org.jetbrains.annotations.NotNull;

@Metadata(m28851d1 = {"\u0000\u0010\n\u0000\n\u0002\u0010 \n\u0002\u0010\b\n\u0002\u0010\u000e\n\u0000\u001a\u0018\u0010\u0000\u001a\b\u0012\u0004\u0012\u00020\u00020\u0001*\b\u0012\u0004\u0012\u00020\u00030\u0001H\u0000¨\u0006\u0004"}, m28850d2 = {"toInts", "", "", "", "fotoapparat_release"}, m28849k = 2, m28848mv = {1, 8, 0}, m28846xi = 48)
@SourceDebugExtension({"SMAP\nListConvertions.kt\nKotlin\n*S Kotlin\n*F\n+ 1 ListConvertions.kt\nio/fotoapparat/util/ListConvertionsKt\n+ 2 _Collections.kt\nkotlin/collections/CollectionsKt___CollectionsKt\n+ 3 fake.kt\nkotlin/jvm/internal/FakeKt\n*L\n1#1,15:1\n1603#2,9:16\n1855#2:25\n1856#2:27\n1612#2:28\n1#3:26\n*S KotlinDebug\n*F\n+ 1 ListConvertions.kt\nio/fotoapparat/util/ListConvertionsKt\n*L\n7#1:16,9\n7#1:25\n7#1:27\n7#1:28\n7#1:26\n*E\n"})
/* loaded from: classes5.dex */
public final class ListConvertionsKt {
    @NotNull
    public static final List<Integer> toInts(@NotNull List<String> list) {
        Integer num;
        Intrinsics.checkNotNullParameter(list, "<this>");
        ArrayList arrayList = new ArrayList();
        for (String str : list) {
            try {
                num = Integer.valueOf(Integer.parseInt(StringsKt__StringsKt.trim(str).toString()));
            } catch (NumberFormatException unused) {
                num = null;
            }
            if (num != null) {
                arrayList.add(num);
            }
        }
        return arrayList;
    }
}

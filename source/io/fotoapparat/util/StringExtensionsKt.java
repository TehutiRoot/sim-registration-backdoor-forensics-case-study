package io.fotoapparat.util;

import com.tom_roush.pdfbox.pdmodel.common.PDPageLabelRange;
import java.util.ArrayList;
import java.util.Set;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.SourceDebugExtension;
import kotlinx.serialization.json.internal.AbstractJsonLexerKt;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

@Metadata(m28851d1 = {"\u0000\u0010\n\u0002\u0010\"\n\u0002\u0010\u0000\n\u0002\u0010\u000e\n\u0002\b\n\u001a\u0019\u0010\u0003\u001a\u00020\u0002*\b\u0012\u0004\u0012\u00020\u00010\u0000H\u0000¢\u0006\u0004\b\u0003\u0010\u0004\u001a\u0015\u0010\u0003\u001a\u00020\u0002*\u0004\u0018\u00010\u0001H\u0000¢\u0006\u0004\b\u0003\u0010\u0005\"\"\u0010\u000b\u001a\n \u0006*\u0004\u0018\u00010\u00020\u00028\u0000X\u0080\u0004¢\u0006\f\n\u0004\b\u0007\u0010\b\u001a\u0004\b\t\u0010\n¨\u0006\f"}, m28850d2 = {"", "", "", "wrap", "(Ljava/util/Set;)Ljava/lang/String;", "(Ljava/lang/Object;)Ljava/lang/String;", "kotlin.jvm.PlatformType", PDPageLabelRange.STYLE_LETTERS_LOWER, "Ljava/lang/String;", "getLineSeparator", "()Ljava/lang/String;", "lineSeparator", "fotoapparat_release"}, m28849k = 2, m28848mv = {1, 8, 0})
@SourceDebugExtension({"SMAP\nStringExtensions.kt\nKotlin\n*S Kotlin\n*F\n+ 1 StringExtensions.kt\nio/fotoapparat/util/StringExtensionsKt\n+ 2 _Collections.kt\nkotlin/collections/CollectionsKt___CollectionsKt\n+ 3 fake.kt\nkotlin/jvm/internal/FakeKt\n*L\n1#1,17:1\n1549#2:18\n1620#2,3:19\n1#3:22\n*S KotlinDebug\n*F\n+ 1 StringExtensions.kt\nio/fotoapparat/util/StringExtensionsKt\n*L\n11#1:18\n11#1:19,3\n*E\n"})
/* loaded from: classes5.dex */
public final class StringExtensionsKt {

    /* renamed from: a */
    public static final String f63044a = System.lineSeparator();

    public static final String getLineSeparator() {
        return f63044a;
    }

    @NotNull
    public static final String wrap(@NotNull Set<? extends Object> set) {
        Intrinsics.checkNotNullParameter(set, "<this>");
        Set<? extends Object> set2 = set;
        ArrayList arrayList = new ArrayList(AbstractC10176es.collectionSizeOrDefault(set2, 10));
        for (Object obj : set2) {
            String str = f63044a;
            arrayList.add(str + "\t\t" + obj);
        }
        String str2 = f63044a;
        return arrayList + str2;
    }

    @NotNull
    public static final String wrap(@Nullable Object obj) {
        if (obj == null) {
            obj = AbstractJsonLexerKt.NULL;
        }
        String str = f63044a;
        return "\t\t" + obj + str;
    }
}

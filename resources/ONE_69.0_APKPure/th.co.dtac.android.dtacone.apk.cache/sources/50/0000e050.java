package kotlin.reflect.jvm.internal.impl.metadata.jvm.deserialization;

import androidx.exifinterface.media.ExifInterface;
import com.tom_roush.pdfbox.contentstream.operator.OperatorName;
import com.tom_roush.pdfbox.pdmodel.documentinterchange.taggedpdf.PDLayoutAttributeObject;
import com.tom_roush.pdfbox.pdmodel.documentinterchange.taggedpdf.PDListAttributeObject;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;
import kotlin.collections.CollectionsKt__CollectionsKt;
import kotlin.collections.CollectionsKt___CollectionsKt;
import kotlin.internal.ProgressionUtilKt;
import kotlin.jvm.JvmStatic;
import kotlin.jvm.internal.Intrinsics;
import kotlinx.serialization.json.internal.AbstractJsonLexerKt;
import org.bouncycastle.pqc.math.linearalgebra.Matrix;
import org.jetbrains.annotations.NotNull;

/* loaded from: classes6.dex */
public final class ClassMapperLite {
    @NotNull
    public static final ClassMapperLite INSTANCE = new ClassMapperLite();

    /* renamed from: a */
    public static final String f69601a = CollectionsKt___CollectionsKt.joinToString$default(CollectionsKt__CollectionsKt.listOf((Object[]) new Character[]{'k', 'o', 't', 'l', 'i', 'n'}), "", null, null, 0, null, null, 62, null);

    /* renamed from: b */
    public static final Map f69602b;

    static {
        int i;
        LinkedHashMap linkedHashMap = new LinkedHashMap();
        List listOf = CollectionsKt__CollectionsKt.listOf((Object[]) new String[]{"Boolean", "Z", "Char", "C", "Byte", "B", "Short", "S", "Int", "I", "Float", "F", "Long", OperatorName.SET_LINE_CAPSTYLE, PDLayoutAttributeObject.BORDER_STYLE_DOUBLE, "D"});
        int progressionLastElement = ProgressionUtilKt.getProgressionLastElement(0, listOf.size() - 1, 2);
        if (progressionLastElement >= 0) {
            int i2 = 0;
            while (true) {
                StringBuilder sb = new StringBuilder();
                String str = f69601a;
                sb.append(str);
                sb.append('/');
                sb.append((String) listOf.get(i2));
                linkedHashMap.put(sb.toString(), listOf.get(i2 + 1));
                linkedHashMap.put(str + '/' + ((String) listOf.get(i2)) + "Array", AbstractJsonLexerKt.BEGIN_LIST + ((String) listOf.get(i)));
                if (i2 == progressionLastElement) {
                    break;
                }
                i2 += 2;
            }
        }
        linkedHashMap.put(f69601a + "/Unit", ExifInterface.GPS_MEASUREMENT_INTERRUPTED);
        m28318a(linkedHashMap, "Any", "java/lang/Object");
        m28318a(linkedHashMap, "Nothing", "java/lang/Void");
        m28318a(linkedHashMap, "Annotation", "java/lang/annotation/Annotation");
        for (String str2 : CollectionsKt__CollectionsKt.listOf((Object[]) new String[]{"String", "CharSequence", "Throwable", "Cloneable", "Number", "Comparable", "Enum"})) {
            m28318a(linkedHashMap, str2, "java/lang/" + str2);
        }
        for (String str3 : CollectionsKt__CollectionsKt.listOf((Object[]) new String[]{"Iterator", "Collection", PDListAttributeObject.OWNER_LIST, "Set", "Map", "ListIterator"})) {
            m28318a(linkedHashMap, "collections/" + str3, "java/util/" + str3);
            m28318a(linkedHashMap, "collections/Mutable" + str3, "java/util/" + str3);
        }
        m28318a(linkedHashMap, "collections/Iterable", "java/lang/Iterable");
        m28318a(linkedHashMap, "collections/MutableIterable", "java/lang/Iterable");
        m28318a(linkedHashMap, "collections/Map.Entry", "java/util/Map$Entry");
        m28318a(linkedHashMap, "collections/MutableMap.MutableEntry", "java/util/Map$Entry");
        for (int i3 = 0; i3 < 23; i3++) {
            StringBuilder sb2 = new StringBuilder();
            String str4 = f69601a;
            sb2.append(str4);
            sb2.append("/jvm/functions/Function");
            sb2.append(i3);
            m28318a(linkedHashMap, "Function" + i3, sb2.toString());
            m28318a(linkedHashMap, "reflect/KFunction" + i3, str4 + "/reflect/KFunction");
        }
        for (String str5 : CollectionsKt__CollectionsKt.listOf((Object[]) new String[]{"Char", "Byte", "Short", "Int", "Float", "Long", PDLayoutAttributeObject.BORDER_STYLE_DOUBLE, "String", "Enum"})) {
            m28318a(linkedHashMap, str5 + ".Companion", f69601a + "/jvm/internal/" + str5 + "CompanionObject");
        }
        f69602b = linkedHashMap;
    }

    /* renamed from: a */
    public static final void m28318a(Map map, String str, String str2) {
        map.put(f69601a + '/' + str, Matrix.MATRIX_TYPE_RANDOM_LT + str2 + ';');
    }

    @JvmStatic
    @NotNull
    public static final String mapClass(@NotNull String classId) {
        Intrinsics.checkNotNullParameter(classId, "classId");
        String str = (String) f69602b.get(classId);
        if (str == null) {
            return Matrix.MATRIX_TYPE_RANDOM_LT + AbstractC19741eO1.replace$default(classId, '.', '$', false, 4, (Object) null) + ';';
        }
        return str;
    }
}
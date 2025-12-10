package kotlin.reflect.jvm.internal.impl.builtins;

import ch.qos.logback.core.CoreConstants;
import com.google.firebase.remoteconfig.RemoteConfigConstants;
import com.tom_roush.pdfbox.pdmodel.documentinterchange.taggedpdf.PDLayoutAttributeObject;
import com.tom_roush.pdfbox.pdmodel.documentinterchange.taggedpdf.PDListAttributeObject;
import java.util.HashMap;
import java.util.HashSet;
import java.util.List;
import java.util.Map;
import java.util.Set;
import kotlin.collections.CollectionsKt__CollectionsKt;
import kotlin.jvm.JvmField;
import kotlin.jvm.JvmStatic;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.SourceDebugExtension;
import kotlin.reflect.jvm.internal.impl.builtins.functions.FunctionClassKind;
import kotlin.reflect.jvm.internal.impl.name.ClassId;
import kotlin.reflect.jvm.internal.impl.name.FqName;
import kotlin.reflect.jvm.internal.impl.name.FqNameUnsafe;
import kotlin.reflect.jvm.internal.impl.name.Name;
import kotlin.reflect.jvm.internal.impl.utils.CollectionsKt;
import org.bouncycastle.i18n.TextBundle;
import org.jetbrains.annotations.NotNull;

/* loaded from: classes6.dex */
public final class StandardNames {
    @JvmField
    @NotNull
    public static final FqName ANNOTATION_PACKAGE_FQ_NAME;
    @JvmField
    @NotNull
    public static final Name BACKING_FIELD;
    @JvmField
    @NotNull
    public static final FqName BUILT_INS_PACKAGE_FQ_NAME;
    @JvmField
    @NotNull
    public static final Set<FqName> BUILT_INS_PACKAGE_FQ_NAMES;
    @JvmField
    @NotNull
    public static final Name BUILT_INS_PACKAGE_NAME;
    @JvmField
    @NotNull
    public static final Name CHAR_CODE;
    @JvmField
    @NotNull
    public static final FqName COLLECTIONS_PACKAGE_FQ_NAME;
    @JvmField
    @NotNull
    public static final Name CONTEXT_FUNCTION_TYPE_PARAMETER_COUNT_NAME;
    @JvmField
    @NotNull
    public static final FqName CONTINUATION_INTERFACE_FQ_NAME;
    @JvmField
    @NotNull
    public static final FqName COROUTINES_INTRINSICS_PACKAGE_FQ_NAME;
    @JvmField
    @NotNull
    public static final FqName COROUTINES_JVM_INTERNAL_PACKAGE_FQ_NAME;
    @JvmField
    @NotNull
    public static final FqName COROUTINES_PACKAGE_FQ_NAME;
    @JvmField
    @NotNull
    public static final String DATA_CLASS_COMPONENT_PREFIX;
    @JvmField
    @NotNull
    public static final Name DATA_CLASS_COPY;
    @JvmField
    @NotNull
    public static final Name DEFAULT_VALUE_PARAMETER;
    @JvmField
    @NotNull
    public static final FqName DYNAMIC_FQ_NAME;
    @JvmField
    @NotNull
    public static final Name ENUM_ENTRIES;
    @JvmField
    @NotNull
    public static final Name ENUM_VALUES;
    @JvmField
    @NotNull
    public static final Name ENUM_VALUE_OF;
    @JvmField
    @NotNull
    public static final Name HASHCODE_NAME;
    @NotNull
    public static final StandardNames INSTANCE = new StandardNames();
    @JvmField
    @NotNull
    public static final FqName KOTLIN_INTERNAL_FQ_NAME;
    @JvmField
    @NotNull
    public static final FqName KOTLIN_REFLECT_FQ_NAME;
    @JvmField
    @NotNull
    public static final Name NEXT_CHAR;
    @JvmField
    @NotNull
    public static final List<String> PREFIXES;
    @JvmField
    @NotNull
    public static final FqName RANGES_PACKAGE_FQ_NAME;
    @JvmField
    @NotNull
    public static final FqName RESULT_FQ_NAME;
    @JvmField
    @NotNull
    public static final FqName TEXT_PACKAGE_FQ_NAME;

    /* renamed from: a */
    public static final FqName f68543a;

    @SourceDebugExtension({"SMAP\nStandardNames.kt\nKotlin\n*S Kotlin\n*F\n+ 1 StandardNames.kt\norg/jetbrains/kotlin/builtins/StandardNames$FqNames\n+ 2 _Arrays.kt\nkotlin/collections/ArraysKt___ArraysKt\n*L\n1#1,295:1\n11670#2,3:296\n11670#2,3:299\n*S KotlinDebug\n*F\n+ 1 StandardNames.kt\norg/jetbrains/kotlin/builtins/StandardNames$FqNames\n*L\n191#1:296,3\n195#1:299,3\n*E\n"})
    /* loaded from: classes6.dex */
    public static final class FqNames {
        @NotNull
        public static final FqNames INSTANCE;
        @JvmField
        @NotNull
        public static final FqNameUnsafe _boolean;
        @JvmField
        @NotNull
        public static final FqNameUnsafe _byte;
        @JvmField
        @NotNull
        public static final FqNameUnsafe _char;
        @JvmField
        @NotNull
        public static final FqNameUnsafe _double;
        @JvmField
        @NotNull
        public static final FqNameUnsafe _enum;
        @JvmField
        @NotNull
        public static final FqNameUnsafe _float;
        @JvmField
        @NotNull
        public static final FqNameUnsafe _int;
        @JvmField
        @NotNull
        public static final FqNameUnsafe _long;
        @JvmField
        @NotNull
        public static final FqNameUnsafe _short;
        @JvmField
        @NotNull
        public static final FqName accessibleLateinitPropertyLiteral;
        @JvmField
        @NotNull
        public static final FqName annotation;
        @JvmField
        @NotNull
        public static final FqName annotationRetention;
        @JvmField
        @NotNull
        public static final FqName annotationTarget;
        @JvmField
        @NotNull
        public static final FqNameUnsafe any;
        @JvmField
        @NotNull
        public static final FqNameUnsafe array;
        @JvmField
        @NotNull
        public static final Map<FqNameUnsafe, PrimitiveType> arrayClassFqNameToPrimitiveType;
        @JvmField
        @NotNull
        public static final FqNameUnsafe charSequence;
        @JvmField
        @NotNull
        public static final FqNameUnsafe cloneable;
        @JvmField
        @NotNull
        public static final FqName collection;
        @JvmField
        @NotNull
        public static final FqName comparable;
        @JvmField
        @NotNull
        public static final FqName contextFunctionTypeParams;
        @JvmField
        @NotNull
        public static final FqName deprecated;
        @JvmField
        @NotNull
        public static final FqName deprecatedSinceKotlin;
        @JvmField
        @NotNull
        public static final FqName deprecationLevel;
        @JvmField
        @NotNull
        public static final FqName extensionFunctionType;
        @JvmField
        @NotNull
        public static final Map<FqNameUnsafe, PrimitiveType> fqNameToPrimitiveType;
        @JvmField
        @NotNull
        public static final FqNameUnsafe functionSupertype;
        @JvmField
        @NotNull
        public static final FqNameUnsafe intRange;
        @JvmField
        @NotNull
        public static final FqName iterable;
        @JvmField
        @NotNull
        public static final FqName iterator;
        @JvmField
        @NotNull
        public static final FqNameUnsafe kCallable;
        @JvmField
        @NotNull
        public static final FqNameUnsafe kClass;
        @JvmField
        @NotNull
        public static final FqNameUnsafe kDeclarationContainer;
        @JvmField
        @NotNull
        public static final FqNameUnsafe kMutableProperty0;
        @JvmField
        @NotNull
        public static final FqNameUnsafe kMutableProperty1;
        @JvmField
        @NotNull
        public static final FqNameUnsafe kMutableProperty2;
        @JvmField
        @NotNull
        public static final FqNameUnsafe kMutablePropertyFqName;
        @JvmField
        @NotNull
        public static final ClassId kProperty;
        @JvmField
        @NotNull
        public static final FqNameUnsafe kProperty0;
        @JvmField
        @NotNull
        public static final FqNameUnsafe kProperty1;
        @JvmField
        @NotNull
        public static final FqNameUnsafe kProperty2;
        @JvmField
        @NotNull
        public static final FqNameUnsafe kPropertyFqName;
        @JvmField
        @NotNull
        public static final FqName list;
        @JvmField
        @NotNull
        public static final FqName listIterator;
        @JvmField
        @NotNull
        public static final FqNameUnsafe longRange;
        @JvmField
        @NotNull
        public static final FqName map;
        @JvmField
        @NotNull
        public static final FqName mapEntry;
        @JvmField
        @NotNull
        public static final FqName mustBeDocumented;
        @JvmField
        @NotNull
        public static final FqName mutableCollection;
        @JvmField
        @NotNull
        public static final FqName mutableIterable;
        @JvmField
        @NotNull
        public static final FqName mutableIterator;
        @JvmField
        @NotNull
        public static final FqName mutableList;
        @JvmField
        @NotNull
        public static final FqName mutableListIterator;
        @JvmField
        @NotNull
        public static final FqName mutableMap;
        @JvmField
        @NotNull
        public static final FqName mutableMapEntry;
        @JvmField
        @NotNull
        public static final FqName mutableSet;
        @JvmField
        @NotNull
        public static final FqNameUnsafe nothing;
        @JvmField
        @NotNull
        public static final FqNameUnsafe number;
        @JvmField
        @NotNull
        public static final FqName parameterName;
        @JvmField
        @NotNull
        public static final ClassId parameterNameClassId;
        @JvmField
        @NotNull
        public static final Set<Name> primitiveArrayTypeShortNames;
        @JvmField
        @NotNull
        public static final Set<Name> primitiveTypeShortNames;
        @JvmField
        @NotNull
        public static final FqName publishedApi;
        @JvmField
        @NotNull
        public static final FqName repeatable;
        @JvmField
        @NotNull
        public static final ClassId repeatableClassId;
        @JvmField
        @NotNull
        public static final FqName replaceWith;
        @JvmField
        @NotNull
        public static final FqName retention;
        @JvmField
        @NotNull
        public static final ClassId retentionClassId;
        @JvmField
        @NotNull
        public static final FqName set;
        @JvmField
        @NotNull
        public static final FqNameUnsafe string;
        @JvmField
        @NotNull
        public static final FqName suppress;
        @JvmField
        @NotNull
        public static final FqName target;
        @JvmField
        @NotNull
        public static final ClassId targetClassId;
        @JvmField
        @NotNull
        public static final FqName throwable;
        @JvmField
        @NotNull
        public static final ClassId uByte;
        @JvmField
        @NotNull
        public static final FqName uByteArrayFqName;
        @JvmField
        @NotNull
        public static final FqName uByteFqName;
        @JvmField
        @NotNull
        public static final ClassId uInt;
        @JvmField
        @NotNull
        public static final FqName uIntArrayFqName;
        @JvmField
        @NotNull
        public static final FqName uIntFqName;
        @JvmField
        @NotNull
        public static final ClassId uLong;
        @JvmField
        @NotNull
        public static final FqName uLongArrayFqName;
        @JvmField
        @NotNull
        public static final FqName uLongFqName;
        @JvmField
        @NotNull
        public static final ClassId uShort;
        @JvmField
        @NotNull
        public static final FqName uShortArrayFqName;
        @JvmField
        @NotNull
        public static final FqName uShortFqName;
        @JvmField
        @NotNull
        public static final FqNameUnsafe unit;
        @JvmField
        @NotNull
        public static final FqName unsafeVariance;

        static {
            PrimitiveType[] values;
            PrimitiveType[] values2;
            FqNames fqNames = new FqNames();
            INSTANCE = fqNames;
            any = fqNames.m28608d("Any");
            nothing = fqNames.m28608d("Nothing");
            cloneable = fqNames.m28608d("Cloneable");
            suppress = fqNames.m28609c("Suppress");
            unit = fqNames.m28608d("Unit");
            charSequence = fqNames.m28608d("CharSequence");
            string = fqNames.m28608d("String");
            array = fqNames.m28608d("Array");
            _boolean = fqNames.m28608d("Boolean");
            _char = fqNames.m28608d("Char");
            _byte = fqNames.m28608d("Byte");
            _short = fqNames.m28608d("Short");
            _int = fqNames.m28608d("Int");
            _long = fqNames.m28608d("Long");
            _float = fqNames.m28608d("Float");
            _double = fqNames.m28608d(PDLayoutAttributeObject.BORDER_STYLE_DOUBLE);
            number = fqNames.m28608d("Number");
            _enum = fqNames.m28608d("Enum");
            functionSupertype = fqNames.m28608d("Function");
            throwable = fqNames.m28609c("Throwable");
            comparable = fqNames.m28609c("Comparable");
            intRange = fqNames.m28606f("IntRange");
            longRange = fqNames.m28606f("LongRange");
            deprecated = fqNames.m28609c("Deprecated");
            deprecatedSinceKotlin = fqNames.m28609c("DeprecatedSinceKotlin");
            deprecationLevel = fqNames.m28609c("DeprecationLevel");
            replaceWith = fqNames.m28609c("ReplaceWith");
            extensionFunctionType = fqNames.m28609c("ExtensionFunctionType");
            contextFunctionTypeParams = fqNames.m28609c("ContextFunctionTypeParams");
            FqName m28609c = fqNames.m28609c("ParameterName");
            parameterName = m28609c;
            ClassId classId = ClassId.topLevel(m28609c);
            Intrinsics.checkNotNullExpressionValue(classId, "topLevel(parameterName)");
            parameterNameClassId = classId;
            annotation = fqNames.m28609c("Annotation");
            FqName m28611a = fqNames.m28611a("Target");
            target = m28611a;
            ClassId classId2 = ClassId.topLevel(m28611a);
            Intrinsics.checkNotNullExpressionValue(classId2, "topLevel(target)");
            targetClassId = classId2;
            annotationTarget = fqNames.m28611a("AnnotationTarget");
            annotationRetention = fqNames.m28611a("AnnotationRetention");
            FqName m28611a2 = fqNames.m28611a("Retention");
            retention = m28611a2;
            ClassId classId3 = ClassId.topLevel(m28611a2);
            Intrinsics.checkNotNullExpressionValue(classId3, "topLevel(retention)");
            retentionClassId = classId3;
            FqName m28611a3 = fqNames.m28611a("Repeatable");
            repeatable = m28611a3;
            ClassId classId4 = ClassId.topLevel(m28611a3);
            Intrinsics.checkNotNullExpressionValue(classId4, "topLevel(repeatable)");
            repeatableClassId = classId4;
            mustBeDocumented = fqNames.m28611a("MustBeDocumented");
            unsafeVariance = fqNames.m28609c("UnsafeVariance");
            publishedApi = fqNames.m28609c("PublishedApi");
            accessibleLateinitPropertyLiteral = fqNames.m28607e("AccessibleLateinitPropertyLiteral");
            iterator = fqNames.m28610b("Iterator");
            iterable = fqNames.m28610b("Iterable");
            collection = fqNames.m28610b("Collection");
            list = fqNames.m28610b(PDListAttributeObject.OWNER_LIST);
            listIterator = fqNames.m28610b("ListIterator");
            set = fqNames.m28610b("Set");
            FqName m28610b = fqNames.m28610b("Map");
            map = m28610b;
            FqName child = m28610b.child(Name.identifier("Entry"));
            Intrinsics.checkNotNullExpressionValue(child, "map.child(Name.identifier(\"Entry\"))");
            mapEntry = child;
            mutableIterator = fqNames.m28610b("MutableIterator");
            mutableIterable = fqNames.m28610b("MutableIterable");
            mutableCollection = fqNames.m28610b("MutableCollection");
            mutableList = fqNames.m28610b("MutableList");
            mutableListIterator = fqNames.m28610b("MutableListIterator");
            mutableSet = fqNames.m28610b("MutableSet");
            FqName m28610b2 = fqNames.m28610b("MutableMap");
            mutableMap = m28610b2;
            FqName child2 = m28610b2.child(Name.identifier("MutableEntry"));
            Intrinsics.checkNotNullExpressionValue(child2, "mutableMap.child(Name.identifier(\"MutableEntry\"))");
            mutableMapEntry = child2;
            kClass = reflect("KClass");
            kCallable = reflect("KCallable");
            kProperty0 = reflect("KProperty0");
            kProperty1 = reflect("KProperty1");
            kProperty2 = reflect("KProperty2");
            kMutableProperty0 = reflect("KMutableProperty0");
            kMutableProperty1 = reflect("KMutableProperty1");
            kMutableProperty2 = reflect("KMutableProperty2");
            FqNameUnsafe reflect = reflect("KProperty");
            kPropertyFqName = reflect;
            kMutablePropertyFqName = reflect("KMutableProperty");
            ClassId classId5 = ClassId.topLevel(reflect.toSafe());
            Intrinsics.checkNotNullExpressionValue(classId5, "topLevel(kPropertyFqName.toSafe())");
            kProperty = classId5;
            kDeclarationContainer = reflect("KDeclarationContainer");
            FqName m28609c2 = fqNames.m28609c("UByte");
            uByteFqName = m28609c2;
            FqName m28609c3 = fqNames.m28609c("UShort");
            uShortFqName = m28609c3;
            FqName m28609c4 = fqNames.m28609c("UInt");
            uIntFqName = m28609c4;
            FqName m28609c5 = fqNames.m28609c("ULong");
            uLongFqName = m28609c5;
            ClassId classId6 = ClassId.topLevel(m28609c2);
            Intrinsics.checkNotNullExpressionValue(classId6, "topLevel(uByteFqName)");
            uByte = classId6;
            ClassId classId7 = ClassId.topLevel(m28609c3);
            Intrinsics.checkNotNullExpressionValue(classId7, "topLevel(uShortFqName)");
            uShort = classId7;
            ClassId classId8 = ClassId.topLevel(m28609c4);
            Intrinsics.checkNotNullExpressionValue(classId8, "topLevel(uIntFqName)");
            uInt = classId8;
            ClassId classId9 = ClassId.topLevel(m28609c5);
            Intrinsics.checkNotNullExpressionValue(classId9, "topLevel(uLongFqName)");
            uLong = classId9;
            uByteArrayFqName = fqNames.m28609c("UByteArray");
            uShortArrayFqName = fqNames.m28609c("UShortArray");
            uIntArrayFqName = fqNames.m28609c("UIntArray");
            uLongArrayFqName = fqNames.m28609c("ULongArray");
            HashSet newHashSetWithExpectedSize = CollectionsKt.newHashSetWithExpectedSize(PrimitiveType.values().length);
            for (PrimitiveType primitiveType : PrimitiveType.values()) {
                newHashSetWithExpectedSize.add(primitiveType.getTypeName());
            }
            primitiveTypeShortNames = newHashSetWithExpectedSize;
            HashSet newHashSetWithExpectedSize2 = CollectionsKt.newHashSetWithExpectedSize(PrimitiveType.values().length);
            for (PrimitiveType primitiveType2 : PrimitiveType.values()) {
                newHashSetWithExpectedSize2.add(primitiveType2.getArrayTypeName());
            }
            primitiveArrayTypeShortNames = newHashSetWithExpectedSize2;
            HashMap newHashMapWithExpectedSize = CollectionsKt.newHashMapWithExpectedSize(PrimitiveType.values().length);
            for (PrimitiveType primitiveType3 : PrimitiveType.values()) {
                FqNames fqNames2 = INSTANCE;
                String asString = primitiveType3.getTypeName().asString();
                Intrinsics.checkNotNullExpressionValue(asString, "primitiveType.typeName.asString()");
                newHashMapWithExpectedSize.put(fqNames2.m28608d(asString), primitiveType3);
            }
            fqNameToPrimitiveType = newHashMapWithExpectedSize;
            HashMap newHashMapWithExpectedSize2 = CollectionsKt.newHashMapWithExpectedSize(PrimitiveType.values().length);
            for (PrimitiveType primitiveType4 : PrimitiveType.values()) {
                FqNames fqNames3 = INSTANCE;
                String asString2 = primitiveType4.getArrayTypeName().asString();
                Intrinsics.checkNotNullExpressionValue(asString2, "primitiveType.arrayTypeName.asString()");
                newHashMapWithExpectedSize2.put(fqNames3.m28608d(asString2), primitiveType4);
            }
            arrayClassFqNameToPrimitiveType = newHashMapWithExpectedSize2;
        }

        @JvmStatic
        @NotNull
        public static final FqNameUnsafe reflect(@NotNull String simpleName) {
            Intrinsics.checkNotNullParameter(simpleName, "simpleName");
            FqNameUnsafe unsafe = StandardNames.KOTLIN_REFLECT_FQ_NAME.child(Name.identifier(simpleName)).toUnsafe();
            Intrinsics.checkNotNullExpressionValue(unsafe, "KOTLIN_REFLECT_FQ_NAME.c…r(simpleName)).toUnsafe()");
            return unsafe;
        }

        /* renamed from: a */
        public final FqName m28611a(String str) {
            FqName child = StandardNames.ANNOTATION_PACKAGE_FQ_NAME.child(Name.identifier(str));
            Intrinsics.checkNotNullExpressionValue(child, "ANNOTATION_PACKAGE_FQ_NA…e.identifier(simpleName))");
            return child;
        }

        /* renamed from: b */
        public final FqName m28610b(String str) {
            FqName child = StandardNames.COLLECTIONS_PACKAGE_FQ_NAME.child(Name.identifier(str));
            Intrinsics.checkNotNullExpressionValue(child, "COLLECTIONS_PACKAGE_FQ_N…e.identifier(simpleName))");
            return child;
        }

        /* renamed from: c */
        public final FqName m28609c(String str) {
            FqName child = StandardNames.BUILT_INS_PACKAGE_FQ_NAME.child(Name.identifier(str));
            Intrinsics.checkNotNullExpressionValue(child, "BUILT_INS_PACKAGE_FQ_NAM…e.identifier(simpleName))");
            return child;
        }

        /* renamed from: d */
        public final FqNameUnsafe m28608d(String str) {
            FqNameUnsafe unsafe = m28609c(str).toUnsafe();
            Intrinsics.checkNotNullExpressionValue(unsafe, "fqName(simpleName).toUnsafe()");
            return unsafe;
        }

        /* renamed from: e */
        public final FqName m28607e(String str) {
            FqName child = StandardNames.KOTLIN_INTERNAL_FQ_NAME.child(Name.identifier(str));
            Intrinsics.checkNotNullExpressionValue(child, "KOTLIN_INTERNAL_FQ_NAME.…e.identifier(simpleName))");
            return child;
        }

        /* renamed from: f */
        public final FqNameUnsafe m28606f(String str) {
            FqNameUnsafe unsafe = StandardNames.RANGES_PACKAGE_FQ_NAME.child(Name.identifier(str)).toUnsafe();
            Intrinsics.checkNotNullExpressionValue(unsafe, "RANGES_PACKAGE_FQ_NAME.c…r(simpleName)).toUnsafe()");
            return unsafe;
        }
    }

    static {
        Name identifier = Name.identifier("field");
        Intrinsics.checkNotNullExpressionValue(identifier, "identifier(\"field\")");
        BACKING_FIELD = identifier;
        Name identifier2 = Name.identifier("value");
        Intrinsics.checkNotNullExpressionValue(identifier2, "identifier(\"value\")");
        DEFAULT_VALUE_PARAMETER = identifier2;
        Name identifier3 = Name.identifier("values");
        Intrinsics.checkNotNullExpressionValue(identifier3, "identifier(\"values\")");
        ENUM_VALUES = identifier3;
        Name identifier4 = Name.identifier(RemoteConfigConstants.ResponseFieldKey.ENTRIES);
        Intrinsics.checkNotNullExpressionValue(identifier4, "identifier(\"entries\")");
        ENUM_ENTRIES = identifier4;
        Name identifier5 = Name.identifier(CoreConstants.VALUE_OF);
        Intrinsics.checkNotNullExpressionValue(identifier5, "identifier(\"valueOf\")");
        ENUM_VALUE_OF = identifier5;
        Name identifier6 = Name.identifier("copy");
        Intrinsics.checkNotNullExpressionValue(identifier6, "identifier(\"copy\")");
        DATA_CLASS_COPY = identifier6;
        DATA_CLASS_COMPONENT_PREFIX = "component";
        Name identifier7 = Name.identifier("hashCode");
        Intrinsics.checkNotNullExpressionValue(identifier7, "identifier(\"hashCode\")");
        HASHCODE_NAME = identifier7;
        Name identifier8 = Name.identifier("code");
        Intrinsics.checkNotNullExpressionValue(identifier8, "identifier(\"code\")");
        CHAR_CODE = identifier8;
        Name identifier9 = Name.identifier("nextChar");
        Intrinsics.checkNotNullExpressionValue(identifier9, "identifier(\"nextChar\")");
        NEXT_CHAR = identifier9;
        Name identifier10 = Name.identifier("count");
        Intrinsics.checkNotNullExpressionValue(identifier10, "identifier(\"count\")");
        CONTEXT_FUNCTION_TYPE_PARAMETER_COUNT_NAME = identifier10;
        DYNAMIC_FQ_NAME = new FqName("<dynamic>");
        FqName fqName = new FqName("kotlin.coroutines");
        COROUTINES_PACKAGE_FQ_NAME = fqName;
        COROUTINES_JVM_INTERNAL_PACKAGE_FQ_NAME = new FqName("kotlin.coroutines.jvm.internal");
        COROUTINES_INTRINSICS_PACKAGE_FQ_NAME = new FqName("kotlin.coroutines.intrinsics");
        FqName child = fqName.child(Name.identifier("Continuation"));
        Intrinsics.checkNotNullExpressionValue(child, "COROUTINES_PACKAGE_FQ_NA…entifier(\"Continuation\"))");
        CONTINUATION_INTERFACE_FQ_NAME = child;
        RESULT_FQ_NAME = new FqName("kotlin.Result");
        FqName fqName2 = new FqName("kotlin.reflect");
        KOTLIN_REFLECT_FQ_NAME = fqName2;
        PREFIXES = CollectionsKt__CollectionsKt.listOf((Object[]) new String[]{"KProperty", "KMutableProperty", "KFunction", "KSuspendFunction"});
        Name identifier11 = Name.identifier("kotlin");
        Intrinsics.checkNotNullExpressionValue(identifier11, "identifier(\"kotlin\")");
        BUILT_INS_PACKAGE_NAME = identifier11;
        FqName fqName3 = FqName.topLevel(identifier11);
        Intrinsics.checkNotNullExpressionValue(fqName3, "topLevel(BUILT_INS_PACKAGE_NAME)");
        BUILT_INS_PACKAGE_FQ_NAME = fqName3;
        FqName child2 = fqName3.child(Name.identifier("annotation"));
        Intrinsics.checkNotNullExpressionValue(child2, "BUILT_INS_PACKAGE_FQ_NAM…identifier(\"annotation\"))");
        ANNOTATION_PACKAGE_FQ_NAME = child2;
        FqName child3 = fqName3.child(Name.identifier("collections"));
        Intrinsics.checkNotNullExpressionValue(child3, "BUILT_INS_PACKAGE_FQ_NAM…dentifier(\"collections\"))");
        COLLECTIONS_PACKAGE_FQ_NAME = child3;
        FqName child4 = fqName3.child(Name.identifier("ranges"));
        Intrinsics.checkNotNullExpressionValue(child4, "BUILT_INS_PACKAGE_FQ_NAM…ame.identifier(\"ranges\"))");
        RANGES_PACKAGE_FQ_NAME = child4;
        FqName child5 = fqName3.child(Name.identifier(TextBundle.TEXT_ENTRY));
        Intrinsics.checkNotNullExpressionValue(child5, "BUILT_INS_PACKAGE_FQ_NAM…(Name.identifier(\"text\"))");
        TEXT_PACKAGE_FQ_NAME = child5;
        FqName child6 = fqName3.child(Name.identifier("internal"));
        Intrinsics.checkNotNullExpressionValue(child6, "BUILT_INS_PACKAGE_FQ_NAM…e.identifier(\"internal\"))");
        KOTLIN_INTERNAL_FQ_NAME = child6;
        f68543a = new FqName("error.NonExistentClass");
        BUILT_INS_PACKAGE_FQ_NAMES = DG1.setOf((Object[]) new FqName[]{fqName3, child3, child4, child2, fqName2, child6, fqName});
    }

    @JvmStatic
    @NotNull
    public static final ClassId getFunctionClassId(int i) {
        return new ClassId(BUILT_INS_PACKAGE_FQ_NAME, Name.identifier(getFunctionName(i)));
    }

    @JvmStatic
    @NotNull
    public static final String getFunctionName(int i) {
        return "Function" + i;
    }

    @JvmStatic
    @NotNull
    public static final FqName getPrimitiveFqName(@NotNull PrimitiveType primitiveType) {
        Intrinsics.checkNotNullParameter(primitiveType, "primitiveType");
        FqName child = BUILT_INS_PACKAGE_FQ_NAME.child(primitiveType.getTypeName());
        Intrinsics.checkNotNullExpressionValue(child, "BUILT_INS_PACKAGE_FQ_NAM…d(primitiveType.typeName)");
        return child;
    }

    @JvmStatic
    @NotNull
    public static final String getSuspendFunctionName(int i) {
        return FunctionClassKind.SuspendFunction.getClassNamePrefix() + i;
    }

    @JvmStatic
    public static final boolean isPrimitiveArray(@NotNull FqNameUnsafe arrayFqName) {
        Intrinsics.checkNotNullParameter(arrayFqName, "arrayFqName");
        if (FqNames.arrayClassFqNameToPrimitiveType.get(arrayFqName) != null) {
            return true;
        }
        return false;
    }
}

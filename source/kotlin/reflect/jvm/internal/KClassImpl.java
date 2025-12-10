package kotlin.reflect.jvm.internal;

import ch.qos.logback.core.CoreConstants;
import com.google.firebase.analytics.FirebaseAnalytics;
import com.tom_roush.pdfbox.contentstream.operator.OperatorName;
import com.tom_roush.pdfbox.pdmodel.common.PDPageLabelRange;
import java.lang.annotation.Annotation;
import java.lang.reflect.Constructor;
import java.lang.reflect.Method;
import java.util.Collection;
import java.util.List;
import kotlin.Metadata;
import kotlin.NoWhenBranchMatchedException;
import kotlin.collections.CollectionsKt__CollectionsKt;
import kotlin.collections.CollectionsKt___CollectionsKt;
import kotlin.jvm.JvmClassMappingKt;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.PropertyReference1Impl;
import kotlin.jvm.internal.Reflection;
import kotlin.jvm.internal.TypeIntrinsics;
import kotlin.reflect.KCallable;
import kotlin.reflect.KClass;
import kotlin.reflect.KFunction;
import kotlin.reflect.KProperty;
import kotlin.reflect.KType;
import kotlin.reflect.KTypeParameter;
import kotlin.reflect.KVisibility;
import kotlin.reflect.jvm.internal.KDeclarationContainerImpl;
import kotlin.reflect.jvm.internal.ReflectProperties;
import kotlin.reflect.jvm.internal.impl.descriptors.ClassConstructorDescriptor;
import kotlin.reflect.jvm.internal.impl.descriptors.ClassDescriptor;
import kotlin.reflect.jvm.internal.impl.descriptors.ClassKind;
import kotlin.reflect.jvm.internal.impl.descriptors.ConstructorDescriptor;
import kotlin.reflect.jvm.internal.impl.descriptors.DescriptorVisibility;
import kotlin.reflect.jvm.internal.impl.descriptors.FunctionDescriptor;
import kotlin.reflect.jvm.internal.impl.descriptors.Modality;
import kotlin.reflect.jvm.internal.impl.descriptors.PropertyDescriptor;
import kotlin.reflect.jvm.internal.impl.descriptors.runtime.components.ReflectKotlinClass;
import kotlin.reflect.jvm.internal.impl.descriptors.runtime.structure.ReflectClassUtilKt;
import kotlin.reflect.jvm.internal.impl.incremental.components.NoLookupLocation;
import kotlin.reflect.jvm.internal.impl.load.kotlin.header.KotlinClassHeader;
import kotlin.reflect.jvm.internal.impl.metadata.ProtoBuf;
import kotlin.reflect.jvm.internal.impl.metadata.deserialization.ProtoBufUtilKt;
import kotlin.reflect.jvm.internal.impl.metadata.jvm.JvmProtoBuf;
import kotlin.reflect.jvm.internal.impl.name.ClassId;
import kotlin.reflect.jvm.internal.impl.name.FqName;
import kotlin.reflect.jvm.internal.impl.name.Name;
import kotlin.reflect.jvm.internal.impl.protobuf.GeneratedMessageLite;
import kotlin.reflect.jvm.internal.impl.resolve.scopes.MemberScope;
import kotlin.reflect.jvm.internal.impl.serialization.deserialization.descriptors.DeserializedClassDescriptor;
import kotlin.text.StringsKt__StringsKt;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import th.p047co.dtac.android.dtacone.util.Constant;

@Metadata(m28851d1 = {"\u0000º\u0001\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u0001\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u001e\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0002\b\u0004\n\u0002\u0010\u000b\n\u0002\b\u0006\n\u0002\u0010\u000e\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0010 \n\u0002\u0010\u001b\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u000f\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0007\b\u0000\u0018\u0000*\b\b\u0000\u0010\u0002*\u00020\u00012\u00020\u00032\b\u0012\u0004\u0012\u00028\u00000\u00042\u00020\u00052\u00020\u0006:\u0001oB\u0015\u0012\f\u0010\b\u001a\b\u0012\u0004\u0012\u00028\u00000\u0007¢\u0006\u0004\b\t\u0010\nJ\u000f\u0010\f\u001a\u00020\u000bH\u0002¢\u0006\u0004\b\f\u0010\rJ\u001d\u0010\u0012\u001a\b\u0012\u0004\u0012\u00020\u00110\u00102\u0006\u0010\u000f\u001a\u00020\u000eH\u0016¢\u0006\u0004\b\u0012\u0010\u0013J\u001d\u0010\u0015\u001a\b\u0012\u0004\u0012\u00020\u00140\u00102\u0006\u0010\u000f\u001a\u00020\u000eH\u0016¢\u0006\u0004\b\u0015\u0010\u0013J\u0019\u0010\u0018\u001a\u0004\u0018\u00010\u00112\u0006\u0010\u0017\u001a\u00020\u0016H\u0016¢\u0006\u0004\b\u0018\u0010\u0019J\u0019\u0010\u001c\u001a\u00020\u001b2\b\u0010\u001a\u001a\u0004\u0018\u00010\u0001H\u0016¢\u0006\u0004\b\u001c\u0010\u001dJ\u001a\u0010\u001f\u001a\u00020\u001b2\b\u0010\u001e\u001a\u0004\u0018\u00010\u0001H\u0096\u0002¢\u0006\u0004\b\u001f\u0010\u001dJ\u000f\u0010 \u001a\u00020\u0016H\u0016¢\u0006\u0004\b \u0010!J\u000f\u0010#\u001a\u00020\"H\u0016¢\u0006\u0004\b#\u0010$R \u0010\b\u001a\b\u0012\u0004\u0012\u00028\u00000\u00078\u0016X\u0096\u0004¢\u0006\f\n\u0004\b%\u0010&\u001a\u0004\b'\u0010(R9\u00100\u001a$\u0012 \u0012\u001e +*\u000e\u0018\u00010*R\b\u0012\u0004\u0012\u00028\u00000\u00000*R\b\u0012\u0004\u0012\u00028\u00000\u00000)8\u0006¢\u0006\f\n\u0004\b,\u0010-\u001a\u0004\b.\u0010/R\u001a\u00105\u001a\b\u0012\u0004\u0012\u000202018VX\u0096\u0004¢\u0006\u0006\u001a\u0004\b3\u00104R\u001e\u00109\u001a\f\u0012\b\u0012\u0006\u0012\u0002\b\u0003060\u00108VX\u0096\u0004¢\u0006\u0006\u001a\u0004\b7\u00108R\u001a\u0010<\u001a\b\u0012\u0004\u0012\u00020:0\u00108VX\u0096\u0004¢\u0006\u0006\u001a\u0004\b;\u00108R\u0016\u0010>\u001a\u0004\u0018\u00010\"8VX\u0096\u0004¢\u0006\u0006\u001a\u0004\b=\u0010$R\u0016\u0010@\u001a\u0004\u0018\u00010\"8VX\u0096\u0004¢\u0006\u0006\u001a\u0004\b?\u0010$R \u0010C\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00028\u00000A0\u00108VX\u0096\u0004¢\u0006\u0006\u001a\u0004\bB\u00108R\u001e\u0010E\u001a\f\u0012\b\u0012\u0006\u0012\u0002\b\u00030\u00040\u00108VX\u0096\u0004¢\u0006\u0006\u001a\u0004\bD\u00108R\u0016\u0010H\u001a\u0004\u0018\u00018\u00008VX\u0096\u0004¢\u0006\u0006\u001a\u0004\bF\u0010GR\u001a\u0010K\u001a\b\u0012\u0004\u0012\u00020I018VX\u0096\u0004¢\u0006\u0006\u001a\u0004\bJ\u00104R\u001a\u0010N\u001a\b\u0012\u0004\u0012\u00020L018VX\u0096\u0004¢\u0006\u0006\u001a\u0004\bM\u00104R\"\u0010P\u001a\u0010\u0012\f\u0012\n\u0012\u0006\b\u0001\u0012\u00028\u00000\u0004018VX\u0096\u0004¢\u0006\u0006\u001a\u0004\bO\u00104R\u0016\u0010T\u001a\u0004\u0018\u00010Q8VX\u0096\u0004¢\u0006\u0006\u001a\u0004\bR\u0010SR\u0014\u0010U\u001a\u00020\u001b8VX\u0096\u0004¢\u0006\u0006\u001a\u0004\bU\u0010VR\u0014\u0010W\u001a\u00020\u001b8VX\u0096\u0004¢\u0006\u0006\u001a\u0004\bW\u0010VR\u0014\u0010X\u001a\u00020\u001b8VX\u0096\u0004¢\u0006\u0006\u001a\u0004\bX\u0010VR\u0014\u0010Y\u001a\u00020\u001b8VX\u0096\u0004¢\u0006\u0006\u001a\u0004\bY\u0010VR\u0014\u0010Z\u001a\u00020\u001b8VX\u0096\u0004¢\u0006\u0006\u001a\u0004\bZ\u0010VR\u0014\u0010[\u001a\u00020\u001b8VX\u0096\u0004¢\u0006\u0006\u001a\u0004\b[\u0010VR\u0014\u0010\\\u001a\u00020\u001b8VX\u0096\u0004¢\u0006\u0006\u001a\u0004\b\\\u0010VR\u0014\u0010]\u001a\u00020\u001b8VX\u0096\u0004¢\u0006\u0006\u001a\u0004\b]\u0010VR\u001a\u0010^\u001a\u00020\u001b8VX\u0096\u0004¢\u0006\f\u0012\u0004\b_\u0010`\u001a\u0004\b^\u0010VR\u0014\u0010d\u001a\u00020a8BX\u0082\u0004¢\u0006\u0006\u001a\u0004\bb\u0010cR\u0014\u0010h\u001a\u00020e8VX\u0096\u0004¢\u0006\u0006\u001a\u0004\bf\u0010gR\u0014\u0010l\u001a\u00020i8@X\u0080\u0004¢\u0006\u0006\u001a\u0004\bj\u0010kR\u0014\u0010n\u001a\u00020i8@X\u0080\u0004¢\u0006\u0006\u001a\u0004\bm\u0010k¨\u0006p"}, m28850d2 = {"Lkotlin/reflect/jvm/internal/KClassImpl;", "", "T", "Lkotlin/reflect/jvm/internal/KDeclarationContainerImpl;", "Lkotlin/reflect/KClass;", "Lkotlin/reflect/jvm/internal/KClassifierImpl;", "Lkotlin/reflect/jvm/internal/KTypeParameterOwnerImpl;", "Ljava/lang/Class;", "jClass", "<init>", "(Ljava/lang/Class;)V", "", OperatorName.NON_STROKING_CMYK, "()Ljava/lang/Void;", "Lkotlin/reflect/jvm/internal/impl/name/Name;", "name", "", "Lkotlin/reflect/jvm/internal/impl/descriptors/PropertyDescriptor;", "getProperties", "(Lkotlin/reflect/jvm/internal/impl/name/Name;)Ljava/util/Collection;", "Lkotlin/reflect/jvm/internal/impl/descriptors/FunctionDescriptor;", "getFunctions", "", FirebaseAnalytics.Param.INDEX, "getLocalProperty", "(I)Lkotlin/reflect/jvm/internal/impl/descriptors/PropertyDescriptor;", "value", "", "isInstance", "(Ljava/lang/Object;)Z", "other", "equals", "hashCode", "()I", "", "toString", "()Ljava/lang/String;", OperatorName.CURVE_TO, "Ljava/lang/Class;", "getJClass", "()Ljava/lang/Class;", "Lkotlin/reflect/jvm/internal/ReflectProperties$LazyVal;", "Lkotlin/reflect/jvm/internal/KClassImpl$Data;", "kotlin.jvm.PlatformType", "d", "Lkotlin/reflect/jvm/internal/ReflectProperties$LazyVal;", "getData", "()Lkotlin/reflect/jvm/internal/ReflectProperties$LazyVal;", "data", "", "", "getAnnotations", "()Ljava/util/List;", "annotations", "Lkotlin/reflect/KCallable;", "getMembers", "()Ljava/util/Collection;", "members", "Lkotlin/reflect/jvm/internal/impl/descriptors/ConstructorDescriptor;", "getConstructorDescriptors", "constructorDescriptors", "getSimpleName", "simpleName", "getQualifiedName", "qualifiedName", "Lkotlin/reflect/KFunction;", "getConstructors", "constructors", "getNestedClasses", "nestedClasses", "getObjectInstance", "()Ljava/lang/Object;", "objectInstance", "Lkotlin/reflect/KTypeParameter;", "getTypeParameters", "typeParameters", "Lkotlin/reflect/KType;", "getSupertypes", "supertypes", "getSealedSubclasses", "sealedSubclasses", "Lkotlin/reflect/KVisibility;", "getVisibility", "()Lkotlin/reflect/KVisibility;", "visibility", "isFinal", "()Z", "isOpen", "isAbstract", "isSealed", "isData", "isInner", "isCompanion", "isFun", "isValue", "isValue$annotations", "()V", "Lkotlin/reflect/jvm/internal/impl/name/ClassId;", "getClassId", "()Lorg/jetbrains/kotlin/name/ClassId;", "classId", "Lkotlin/reflect/jvm/internal/impl/descriptors/ClassDescriptor;", "getDescriptor", "()Lorg/jetbrains/kotlin/descriptors/ClassDescriptor;", "descriptor", "Lkotlin/reflect/jvm/internal/impl/resolve/scopes/MemberScope;", "getMemberScope$kotlin_reflection", "()Lorg/jetbrains/kotlin/resolve/scopes/MemberScope;", "memberScope", "getStaticScope$kotlin_reflection", "staticScope", Constant.BenefitName.Data, "kotlin-reflection"}, m28849k = 1, m28848mv = {1, 8, 0})
/* loaded from: classes6.dex */
public final class KClassImpl<T> extends KDeclarationContainerImpl implements KClass<T>, KClassifierImpl, KTypeParameterOwnerImpl {

    /* renamed from: c */
    public final Class f68385c;

    /* renamed from: d */
    public final ReflectProperties.LazyVal f68386d;

    @Metadata(m28851d1 = {"\u0000^\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0010 \n\u0002\u0010\u001b\n\u0002\b\u000b\n\u0002\u0010\u001e\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\b\t\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\b\u0018\b\u0086\u0004\u0018\u00002\u00060\u0001R\u00020\u0002B\u0007¢\u0006\u0004\b\u0003\u0010\u0004J\u001b\u0010\b\u001a\u00020\u00072\n\u0010\u0006\u001a\u0006\u0012\u0002\b\u00030\u0005H\u0002¢\u0006\u0004\b\b\u0010\tR\u001b\u0010\u000f\u001a\u00020\n8FX\u0086\u0084\u0002¢\u0006\f\n\u0004\b\u000b\u0010\f\u001a\u0004\b\r\u0010\u000eR!\u0010\u0015\u001a\b\u0012\u0004\u0012\u00020\u00110\u00108FX\u0086\u0084\u0002¢\u0006\f\n\u0004\b\u0012\u0010\f\u001a\u0004\b\u0013\u0010\u0014R\u001d\u0010\u0019\u001a\u0004\u0018\u00010\u00078FX\u0086\u0084\u0002¢\u0006\f\n\u0004\b\u0016\u0010\f\u001a\u0004\b\u0017\u0010\u0018R\u001d\u0010\u001c\u001a\u0004\u0018\u00010\u00078FX\u0086\u0084\u0002¢\u0006\f\n\u0004\b\u001a\u0010\f\u001a\u0004\b\u001b\u0010\u0018R-\u0010$\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00028\u00000\u001e0\u001d8FX\u0086\u0084\u0002¢\u0006\u0012\n\u0004\b\u001f\u0010\f\u0012\u0004\b\"\u0010#\u001a\u0004\b \u0010!R%\u0010(\u001a\f\u0012\b\u0012\u0006\u0012\u0002\b\u00030%0\u001d8FX\u0086\u0084\u0002¢\u0006\f\n\u0004\b&\u0010\f\u001a\u0004\b'\u0010!R#\u0010.\u001a\u0004\u0018\u00018\u00008FX\u0086\u0084\u0002¢\u0006\u0012\n\u0004\b)\u0010*\u0012\u0004\b-\u0010#\u001a\u0004\b+\u0010,R!\u00102\u001a\b\u0012\u0004\u0012\u00020/0\u00108FX\u0086\u0084\u0002¢\u0006\f\n\u0004\b0\u0010\f\u001a\u0004\b1\u0010\u0014R!\u00106\u001a\b\u0012\u0004\u0012\u0002030\u00108FX\u0086\u0084\u0002¢\u0006\f\n\u0004\b4\u0010\f\u001a\u0004\b5\u0010\u0014R)\u00109\u001a\u0010\u0012\f\u0012\n\u0012\u0006\b\u0001\u0012\u00028\u00000%0\u00108FX\u0086\u0084\u0002¢\u0006\f\n\u0004\b7\u0010\f\u001a\u0004\b8\u0010\u0014R%\u0010=\u001a\f\u0012\b\u0012\u0006\u0012\u0002\b\u00030:0\u001d8FX\u0086\u0084\u0002¢\u0006\f\n\u0004\b;\u0010\f\u001a\u0004\b<\u0010!R%\u0010@\u001a\f\u0012\b\u0012\u0006\u0012\u0002\b\u00030:0\u001d8BX\u0082\u0084\u0002¢\u0006\f\n\u0004\b>\u0010\f\u001a\u0004\b?\u0010!R%\u0010C\u001a\f\u0012\b\u0012\u0006\u0012\u0002\b\u00030:0\u001d8BX\u0082\u0084\u0002¢\u0006\f\n\u0004\bA\u0010\f\u001a\u0004\bB\u0010!R%\u0010E\u001a\f\u0012\b\u0012\u0006\u0012\u0002\b\u00030:0\u001d8BX\u0082\u0084\u0002¢\u0006\f\n\u0004\bD\u0010\f\u001a\u0004\b\u000b\u0010!R%\u0010H\u001a\f\u0012\b\u0012\u0006\u0012\u0002\b\u00030:0\u001d8FX\u0086\u0084\u0002¢\u0006\f\n\u0004\bF\u0010\f\u001a\u0004\bG\u0010!R%\u0010K\u001a\f\u0012\b\u0012\u0006\u0012\u0002\b\u00030:0\u001d8FX\u0086\u0084\u0002¢\u0006\f\n\u0004\bI\u0010\f\u001a\u0004\bJ\u0010!R%\u0010N\u001a\f\u0012\b\u0012\u0006\u0012\u0002\b\u00030:0\u001d8FX\u0086\u0084\u0002¢\u0006\f\n\u0004\bL\u0010\f\u001a\u0004\bM\u0010!R%\u0010Q\u001a\f\u0012\b\u0012\u0006\u0012\u0002\b\u00030:0\u001d8FX\u0086\u0084\u0002¢\u0006\f\n\u0004\bO\u0010\f\u001a\u0004\bP\u0010!¨\u0006R"}, m28850d2 = {"Lkotlin/reflect/jvm/internal/KClassImpl$Data;", "Lkotlin/reflect/jvm/internal/KDeclarationContainerImpl$Data;", "Lkotlin/reflect/jvm/internal/KDeclarationContainerImpl;", "<init>", "(Lkotlin/reflect/jvm/internal/KClassImpl;)V", "Ljava/lang/Class;", "jClass", "", PDPageLabelRange.STYLE_LETTERS_LOWER, "(Ljava/lang/Class;)Ljava/lang/String;", "Lkotlin/reflect/jvm/internal/impl/descriptors/ClassDescriptor;", "d", "Lkotlin/reflect/jvm/internal/ReflectProperties$LazySoftVal;", "getDescriptor", "()Lorg/jetbrains/kotlin/descriptors/ClassDescriptor;", "descriptor", "", "", "e", "getAnnotations", "()Ljava/util/List;", "annotations", OperatorName.FILL_NON_ZERO, "getSimpleName", "()Ljava/lang/String;", "simpleName", OperatorName.NON_STROKING_GRAY, "getQualifiedName", "qualifiedName", "", "Lkotlin/reflect/KFunction;", OperatorName.CLOSE_PATH, "getConstructors", "()Ljava/util/Collection;", "getConstructors$annotations", "()V", "constructors", "Lkotlin/reflect/KClass;", "i", "getNestedClasses", "nestedClasses", OperatorName.SET_LINE_JOINSTYLE, "Lkotlin/reflect/jvm/internal/ReflectProperties$LazyVal;", "getObjectInstance", "()Ljava/lang/Object;", "getObjectInstance$annotations", "objectInstance", "Lkotlin/reflect/KTypeParameter;", OperatorName.NON_STROKING_CMYK, "getTypeParameters", "typeParameters", "Lkotlin/reflect/KType;", OperatorName.LINE_TO, "getSupertypes", "supertypes", OperatorName.MOVE_TO, "getSealedSubclasses", "sealedSubclasses", "Lkotlin/reflect/jvm/internal/KCallableImpl;", OperatorName.ENDPATH, "getDeclaredNonStaticMembers", "declaredNonStaticMembers", "o", OperatorName.CLOSE_FILL_NON_ZERO_AND_STROKE, "declaredStaticMembers", "p", OperatorName.CURVE_TO, "inheritedNonStaticMembers", OperatorName.SAVE, "inheritedStaticMembers", PDPageLabelRange.STYLE_ROMAN_LOWER, "getAllNonStaticMembers", "allNonStaticMembers", OperatorName.CLOSE_AND_STROKE, "getAllStaticMembers", "allStaticMembers", "t", "getDeclaredMembers", "declaredMembers", "u", "getAllMembers", "allMembers", "kotlin-reflection"}, m28849k = 1, m28848mv = {1, 8, 0})
    /* loaded from: classes6.dex */
    public final class Data extends KDeclarationContainerImpl.Data {

        /* renamed from: w */
        public static final /* synthetic */ KProperty[] f68387w = {Reflection.property1(new PropertyReference1Impl(Reflection.getOrCreateKotlinClass(Data.class), "descriptor", "getDescriptor()Lorg/jetbrains/kotlin/descriptors/ClassDescriptor;")), Reflection.property1(new PropertyReference1Impl(Reflection.getOrCreateKotlinClass(Data.class), "annotations", "getAnnotations()Ljava/util/List;")), Reflection.property1(new PropertyReference1Impl(Reflection.getOrCreateKotlinClass(Data.class), "simpleName", "getSimpleName()Ljava/lang/String;")), Reflection.property1(new PropertyReference1Impl(Reflection.getOrCreateKotlinClass(Data.class), "qualifiedName", "getQualifiedName()Ljava/lang/String;")), Reflection.property1(new PropertyReference1Impl(Reflection.getOrCreateKotlinClass(Data.class), "constructors", "getConstructors()Ljava/util/Collection;")), Reflection.property1(new PropertyReference1Impl(Reflection.getOrCreateKotlinClass(Data.class), "nestedClasses", "getNestedClasses()Ljava/util/Collection;")), Reflection.property1(new PropertyReference1Impl(Reflection.getOrCreateKotlinClass(Data.class), "objectInstance", "getObjectInstance()Ljava/lang/Object;")), Reflection.property1(new PropertyReference1Impl(Reflection.getOrCreateKotlinClass(Data.class), "typeParameters", "getTypeParameters()Ljava/util/List;")), Reflection.property1(new PropertyReference1Impl(Reflection.getOrCreateKotlinClass(Data.class), "supertypes", "getSupertypes()Ljava/util/List;")), Reflection.property1(new PropertyReference1Impl(Reflection.getOrCreateKotlinClass(Data.class), "sealedSubclasses", "getSealedSubclasses()Ljava/util/List;")), Reflection.property1(new PropertyReference1Impl(Reflection.getOrCreateKotlinClass(Data.class), "declaredNonStaticMembers", "getDeclaredNonStaticMembers()Ljava/util/Collection;")), Reflection.property1(new PropertyReference1Impl(Reflection.getOrCreateKotlinClass(Data.class), "declaredStaticMembers", "getDeclaredStaticMembers()Ljava/util/Collection;")), Reflection.property1(new PropertyReference1Impl(Reflection.getOrCreateKotlinClass(Data.class), "inheritedNonStaticMembers", "getInheritedNonStaticMembers()Ljava/util/Collection;")), Reflection.property1(new PropertyReference1Impl(Reflection.getOrCreateKotlinClass(Data.class), "inheritedStaticMembers", "getInheritedStaticMembers()Ljava/util/Collection;")), Reflection.property1(new PropertyReference1Impl(Reflection.getOrCreateKotlinClass(Data.class), "allNonStaticMembers", "getAllNonStaticMembers()Ljava/util/Collection;")), Reflection.property1(new PropertyReference1Impl(Reflection.getOrCreateKotlinClass(Data.class), "allStaticMembers", "getAllStaticMembers()Ljava/util/Collection;")), Reflection.property1(new PropertyReference1Impl(Reflection.getOrCreateKotlinClass(Data.class), "declaredMembers", "getDeclaredMembers()Ljava/util/Collection;")), Reflection.property1(new PropertyReference1Impl(Reflection.getOrCreateKotlinClass(Data.class), "allMembers", "getAllMembers()Ljava/util/Collection;"))};

        /* renamed from: d */
        public final ReflectProperties.LazySoftVal f68388d;

        /* renamed from: e */
        public final ReflectProperties.LazySoftVal f68389e;

        /* renamed from: f */
        public final ReflectProperties.LazySoftVal f68390f;

        /* renamed from: g */
        public final ReflectProperties.LazySoftVal f68391g;

        /* renamed from: h */
        public final ReflectProperties.LazySoftVal f68392h;

        /* renamed from: i */
        public final ReflectProperties.LazySoftVal f68393i;

        /* renamed from: j */
        public final ReflectProperties.LazyVal f68394j;

        /* renamed from: k */
        public final ReflectProperties.LazySoftVal f68395k;

        /* renamed from: l */
        public final ReflectProperties.LazySoftVal f68396l;

        /* renamed from: m */
        public final ReflectProperties.LazySoftVal f68397m;

        /* renamed from: n */
        public final ReflectProperties.LazySoftVal f68398n;

        /* renamed from: o */
        public final ReflectProperties.LazySoftVal f68399o;

        /* renamed from: p */
        public final ReflectProperties.LazySoftVal f68400p;

        /* renamed from: q */
        public final ReflectProperties.LazySoftVal f68401q;

        /* renamed from: r */
        public final ReflectProperties.LazySoftVal f68402r;

        /* renamed from: s */
        public final ReflectProperties.LazySoftVal f68403s;

        /* renamed from: t */
        public final ReflectProperties.LazySoftVal f68404t;

        /* renamed from: u */
        public final ReflectProperties.LazySoftVal f68405u;

        public Data() {
            super();
            this.f68388d = ReflectProperties.lazySoft(new KClassImpl$Data$descriptor$2(KClassImpl.this));
            this.f68389e = ReflectProperties.lazySoft(new KClassImpl$Data$annotations$2(this));
            this.f68390f = ReflectProperties.lazySoft(new KClassImpl$Data$simpleName$2(KClassImpl.this, this));
            this.f68391g = ReflectProperties.lazySoft(new KClassImpl$Data$qualifiedName$2(KClassImpl.this));
            this.f68392h = ReflectProperties.lazySoft(new KClassImpl$Data$constructors$2(KClassImpl.this));
            this.f68393i = ReflectProperties.lazySoft(new KClassImpl$Data$nestedClasses$2(this));
            this.f68394j = ReflectProperties.lazy(new KClassImpl$Data$objectInstance$2(this, KClassImpl.this));
            this.f68395k = ReflectProperties.lazySoft(new KClassImpl$Data$typeParameters$2(this, KClassImpl.this));
            this.f68396l = ReflectProperties.lazySoft(new KClassImpl$Data$supertypes$2(this, KClassImpl.this));
            this.f68397m = ReflectProperties.lazySoft(new KClassImpl$Data$sealedSubclasses$2(this));
            this.f68398n = ReflectProperties.lazySoft(new KClassImpl$Data$declaredNonStaticMembers$2(KClassImpl.this));
            this.f68399o = ReflectProperties.lazySoft(new KClassImpl$Data$declaredStaticMembers$2(KClassImpl.this));
            this.f68400p = ReflectProperties.lazySoft(new KClassImpl$Data$inheritedNonStaticMembers$2(KClassImpl.this));
            this.f68401q = ReflectProperties.lazySoft(new KClassImpl$Data$inheritedStaticMembers$2(KClassImpl.this));
            this.f68402r = ReflectProperties.lazySoft(new KClassImpl$Data$allNonStaticMembers$2(this));
            this.f68403s = ReflectProperties.lazySoft(new KClassImpl$Data$allStaticMembers$2(this));
            this.f68404t = ReflectProperties.lazySoft(new KClassImpl$Data$declaredMembers$2(this));
            this.f68405u = ReflectProperties.lazySoft(new KClassImpl$Data$allMembers$2(this));
        }

        /* renamed from: a */
        public final String m28698a(Class cls) {
            String name = cls.getSimpleName();
            Method enclosingMethod = cls.getEnclosingMethod();
            if (enclosingMethod != null) {
                Intrinsics.checkNotNullExpressionValue(name, "name");
                return StringsKt__StringsKt.substringAfter$default(name, enclosingMethod.getName() + '$', (String) null, 2, (Object) null);
            }
            Constructor<?> enclosingConstructor = cls.getEnclosingConstructor();
            if (enclosingConstructor != null) {
                Intrinsics.checkNotNullExpressionValue(name, "name");
                return StringsKt__StringsKt.substringAfter$default(name, enclosingConstructor.getName() + '$', (String) null, 2, (Object) null);
            }
            Intrinsics.checkNotNullExpressionValue(name, "name");
            return StringsKt__StringsKt.substringAfter$default(name, '$', (String) null, 2, (Object) null);
        }

        /* renamed from: b */
        public final Collection m28697b() {
            T value = this.f68399o.getValue(this, f68387w[11]);
            Intrinsics.checkNotNullExpressionValue(value, "<get-declaredStaticMembers>(...)");
            return (Collection) value;
        }

        /* renamed from: c */
        public final Collection m28696c() {
            T value = this.f68400p.getValue(this, f68387w[12]);
            Intrinsics.checkNotNullExpressionValue(value, "<get-inheritedNonStaticMembers>(...)");
            return (Collection) value;
        }

        /* renamed from: d */
        public final Collection m28695d() {
            T value = this.f68401q.getValue(this, f68387w[13]);
            Intrinsics.checkNotNullExpressionValue(value, "<get-inheritedStaticMembers>(...)");
            return (Collection) value;
        }

        @NotNull
        public final Collection<KCallableImpl<?>> getAllMembers() {
            T value = this.f68405u.getValue(this, f68387w[17]);
            Intrinsics.checkNotNullExpressionValue(value, "<get-allMembers>(...)");
            return (Collection) value;
        }

        @NotNull
        public final Collection<KCallableImpl<?>> getAllNonStaticMembers() {
            T value = this.f68402r.getValue(this, f68387w[14]);
            Intrinsics.checkNotNullExpressionValue(value, "<get-allNonStaticMembers>(...)");
            return (Collection) value;
        }

        @NotNull
        public final Collection<KCallableImpl<?>> getAllStaticMembers() {
            T value = this.f68403s.getValue(this, f68387w[15]);
            Intrinsics.checkNotNullExpressionValue(value, "<get-allStaticMembers>(...)");
            return (Collection) value;
        }

        @NotNull
        public final List<Annotation> getAnnotations() {
            T value = this.f68389e.getValue(this, f68387w[1]);
            Intrinsics.checkNotNullExpressionValue(value, "<get-annotations>(...)");
            return (List) value;
        }

        @NotNull
        public final Collection<KFunction<T>> getConstructors() {
            T value = this.f68392h.getValue(this, f68387w[4]);
            Intrinsics.checkNotNullExpressionValue(value, "<get-constructors>(...)");
            return (Collection) value;
        }

        @NotNull
        public final Collection<KCallableImpl<?>> getDeclaredMembers() {
            T value = this.f68404t.getValue(this, f68387w[16]);
            Intrinsics.checkNotNullExpressionValue(value, "<get-declaredMembers>(...)");
            return (Collection) value;
        }

        @NotNull
        public final Collection<KCallableImpl<?>> getDeclaredNonStaticMembers() {
            T value = this.f68398n.getValue(this, f68387w[10]);
            Intrinsics.checkNotNullExpressionValue(value, "<get-declaredNonStaticMembers>(...)");
            return (Collection) value;
        }

        @NotNull
        public final ClassDescriptor getDescriptor() {
            T value = this.f68388d.getValue(this, f68387w[0]);
            Intrinsics.checkNotNullExpressionValue(value, "<get-descriptor>(...)");
            return (ClassDescriptor) value;
        }

        @NotNull
        public final Collection<KClass<?>> getNestedClasses() {
            T value = this.f68393i.getValue(this, f68387w[5]);
            Intrinsics.checkNotNullExpressionValue(value, "<get-nestedClasses>(...)");
            return (Collection) value;
        }

        @Nullable
        public final T getObjectInstance() {
            return this.f68394j.getValue(this, f68387w[6]);
        }

        @Nullable
        public final String getQualifiedName() {
            return (String) this.f68391g.getValue(this, f68387w[3]);
        }

        @NotNull
        public final List<KClass<? extends T>> getSealedSubclasses() {
            T value = this.f68397m.getValue(this, f68387w[9]);
            Intrinsics.checkNotNullExpressionValue(value, "<get-sealedSubclasses>(...)");
            return (List) value;
        }

        @Nullable
        public final String getSimpleName() {
            return (String) this.f68390f.getValue(this, f68387w[2]);
        }

        @NotNull
        public final List<KType> getSupertypes() {
            T value = this.f68396l.getValue(this, f68387w[8]);
            Intrinsics.checkNotNullExpressionValue(value, "<get-supertypes>(...)");
            return (List) value;
        }

        @NotNull
        public final List<KTypeParameter> getTypeParameters() {
            T value = this.f68395k.getValue(this, f68387w[7]);
            Intrinsics.checkNotNullExpressionValue(value, "<get-typeParameters>(...)");
            return (List) value;
        }
    }

    @Metadata(m28849k = 3, m28848mv = {1, 8, 0}, m28846xi = 48)
    /* loaded from: classes6.dex */
    public /* synthetic */ class WhenMappings {
        public static final /* synthetic */ int[] $EnumSwitchMapping$0;

        static {
            int[] iArr = new int[KotlinClassHeader.Kind.values().length];
            try {
                iArr[KotlinClassHeader.Kind.FILE_FACADE.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                iArr[KotlinClassHeader.Kind.MULTIFILE_CLASS.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            try {
                iArr[KotlinClassHeader.Kind.MULTIFILE_CLASS_PART.ordinal()] = 3;
            } catch (NoSuchFieldError unused3) {
            }
            try {
                iArr[KotlinClassHeader.Kind.SYNTHETIC_CLASS.ordinal()] = 4;
            } catch (NoSuchFieldError unused4) {
            }
            try {
                iArr[KotlinClassHeader.Kind.UNKNOWN.ordinal()] = 5;
            } catch (NoSuchFieldError unused5) {
            }
            try {
                iArr[KotlinClassHeader.Kind.CLASS.ordinal()] = 6;
            } catch (NoSuchFieldError unused6) {
            }
            $EnumSwitchMapping$0 = iArr;
        }
    }

    public KClassImpl(@NotNull Class<T> jClass) {
        Intrinsics.checkNotNullParameter(jClass, "jClass");
        this.f68385c = jClass;
        ReflectProperties.LazyVal lazy = ReflectProperties.lazy(new KClassImpl$data$1(this));
        Intrinsics.checkNotNullExpressionValue(lazy, "lazy { Data() }");
        this.f68386d = lazy;
    }

    @Override // kotlin.reflect.KClass
    public boolean equals(@Nullable Object obj) {
        if ((obj instanceof KClassImpl) && Intrinsics.areEqual(JvmClassMappingKt.getJavaObjectType(this), JvmClassMappingKt.getJavaObjectType((KClass) obj))) {
            return true;
        }
        return false;
    }

    @Override // kotlin.reflect.KAnnotatedElement
    @NotNull
    public List<Annotation> getAnnotations() {
        return ((Data) this.f68386d.invoke()).getAnnotations();
    }

    @Override // kotlin.reflect.jvm.internal.KDeclarationContainerImpl
    @NotNull
    public Collection<ConstructorDescriptor> getConstructorDescriptors() {
        ClassDescriptor descriptor = getDescriptor();
        if (descriptor.getKind() != ClassKind.INTERFACE && descriptor.getKind() != ClassKind.OBJECT) {
            Collection<ClassConstructorDescriptor> constructors = descriptor.getConstructors();
            Intrinsics.checkNotNullExpressionValue(constructors, "descriptor.constructors");
            return constructors;
        }
        return CollectionsKt__CollectionsKt.emptyList();
    }

    @Override // kotlin.reflect.KClass
    @NotNull
    public Collection<KFunction<T>> getConstructors() {
        return ((Data) this.f68386d.invoke()).getConstructors();
    }

    @NotNull
    public final ReflectProperties.LazyVal<KClassImpl<T>.Data> getData() {
        return this.f68386d;
    }

    @Override // kotlin.reflect.jvm.internal.KDeclarationContainerImpl
    @NotNull
    public Collection<FunctionDescriptor> getFunctions(@NotNull Name name) {
        Intrinsics.checkNotNullParameter(name, "name");
        MemberScope memberScope$kotlin_reflection = getMemberScope$kotlin_reflection();
        NoLookupLocation noLookupLocation = NoLookupLocation.FROM_REFLECTION;
        return CollectionsKt___CollectionsKt.plus((Collection) memberScope$kotlin_reflection.getContributedFunctions(name, noLookupLocation), (Iterable) getStaticScope$kotlin_reflection().getContributedFunctions(name, noLookupLocation));
    }

    @Override // kotlin.jvm.internal.ClassBasedDeclarationContainer
    @NotNull
    public Class<T> getJClass() {
        return this.f68385c;
    }

    @Override // kotlin.reflect.jvm.internal.KDeclarationContainerImpl
    @Nullable
    public PropertyDescriptor getLocalProperty(int i) {
        DeserializedClassDescriptor deserializedClassDescriptor;
        Class<?> declaringClass;
        if (Intrinsics.areEqual(getJClass().getSimpleName(), "DefaultImpls") && (declaringClass = getJClass().getDeclaringClass()) != null && declaringClass.isInterface()) {
            KClass kotlinClass = JvmClassMappingKt.getKotlinClass(declaringClass);
            Intrinsics.checkNotNull(kotlinClass, "null cannot be cast to non-null type kotlin.reflect.jvm.internal.KClassImpl<*>");
            return ((KClassImpl) kotlinClass).getLocalProperty(i);
        }
        ClassDescriptor descriptor = getDescriptor();
        if (descriptor instanceof DeserializedClassDescriptor) {
            deserializedClassDescriptor = (DeserializedClassDescriptor) descriptor;
        } else {
            deserializedClassDescriptor = null;
        }
        if (deserializedClassDescriptor == null) {
            return null;
        }
        ProtoBuf.Class classProto = deserializedClassDescriptor.getClassProto();
        GeneratedMessageLite.GeneratedExtension<ProtoBuf.Class, List<ProtoBuf.Property>> classLocalVariable = JvmProtoBuf.classLocalVariable;
        Intrinsics.checkNotNullExpressionValue(classLocalVariable, "classLocalVariable");
        ProtoBuf.Property property = (ProtoBuf.Property) ProtoBufUtilKt.getExtensionOrNull(classProto, classLocalVariable, i);
        if (property == null) {
            return null;
        }
        return (PropertyDescriptor) UtilKt.deserializeToDescriptor(getJClass(), property, deserializedClassDescriptor.getC().getNameResolver(), deserializedClassDescriptor.getC().getTypeTable(), deserializedClassDescriptor.getMetadataVersion(), KClassImpl$getLocalProperty$2$1$1.INSTANCE);
    }

    @NotNull
    public final MemberScope getMemberScope$kotlin_reflection() {
        return getDescriptor().getDefaultType().getMemberScope();
    }

    @Override // kotlin.reflect.KDeclarationContainer
    @NotNull
    public Collection<KCallable<?>> getMembers() {
        return ((Data) this.f68386d.invoke()).getAllMembers();
    }

    @Override // kotlin.reflect.KClass
    @NotNull
    public Collection<KClass<?>> getNestedClasses() {
        return ((Data) this.f68386d.invoke()).getNestedClasses();
    }

    @Override // kotlin.reflect.KClass
    @Nullable
    public T getObjectInstance() {
        return (T) ((Data) this.f68386d.invoke()).getObjectInstance();
    }

    @Override // kotlin.reflect.jvm.internal.KDeclarationContainerImpl
    @NotNull
    public Collection<PropertyDescriptor> getProperties(@NotNull Name name) {
        Intrinsics.checkNotNullParameter(name, "name");
        MemberScope memberScope$kotlin_reflection = getMemberScope$kotlin_reflection();
        NoLookupLocation noLookupLocation = NoLookupLocation.FROM_REFLECTION;
        return CollectionsKt___CollectionsKt.plus((Collection) memberScope$kotlin_reflection.getContributedVariables(name, noLookupLocation), (Iterable) getStaticScope$kotlin_reflection().getContributedVariables(name, noLookupLocation));
    }

    @Override // kotlin.reflect.KClass
    @Nullable
    public String getQualifiedName() {
        return ((Data) this.f68386d.invoke()).getQualifiedName();
    }

    @Override // kotlin.reflect.KClass
    @NotNull
    public List<KClass<? extends T>> getSealedSubclasses() {
        return ((Data) this.f68386d.invoke()).getSealedSubclasses();
    }

    @Override // kotlin.reflect.KClass
    @Nullable
    public String getSimpleName() {
        return ((Data) this.f68386d.invoke()).getSimpleName();
    }

    @NotNull
    public final MemberScope getStaticScope$kotlin_reflection() {
        MemberScope staticScope = getDescriptor().getStaticScope();
        Intrinsics.checkNotNullExpressionValue(staticScope, "descriptor.staticScope");
        return staticScope;
    }

    @Override // kotlin.reflect.KClass
    @NotNull
    public List<KType> getSupertypes() {
        return ((Data) this.f68386d.invoke()).getSupertypes();
    }

    @Override // kotlin.reflect.KClass
    @NotNull
    public List<KTypeParameter> getTypeParameters() {
        return ((Data) this.f68386d.invoke()).getTypeParameters();
    }

    @Override // kotlin.reflect.KClass
    @Nullable
    public KVisibility getVisibility() {
        DescriptorVisibility visibility = getDescriptor().getVisibility();
        Intrinsics.checkNotNullExpressionValue(visibility, "descriptor.visibility");
        return UtilKt.toKVisibility(visibility);
    }

    @Override // kotlin.reflect.KClass
    public int hashCode() {
        return JvmClassMappingKt.getJavaObjectType(this).hashCode();
    }

    @Override // kotlin.reflect.KClass
    public boolean isAbstract() {
        if (getDescriptor().getModality() == Modality.ABSTRACT) {
            return true;
        }
        return false;
    }

    @Override // kotlin.reflect.KClass
    public boolean isCompanion() {
        return getDescriptor().isCompanionObject();
    }

    @Override // kotlin.reflect.KClass
    public boolean isData() {
        return getDescriptor().isData();
    }

    @Override // kotlin.reflect.KClass
    public boolean isFinal() {
        if (getDescriptor().getModality() == Modality.FINAL) {
            return true;
        }
        return false;
    }

    @Override // kotlin.reflect.KClass
    public boolean isFun() {
        return getDescriptor().isFun();
    }

    @Override // kotlin.reflect.KClass
    public boolean isInner() {
        return getDescriptor().isInner();
    }

    @Override // kotlin.reflect.KClass
    public boolean isInstance(@Nullable Object obj) {
        Integer functionClassArity = ReflectClassUtilKt.getFunctionClassArity(getJClass());
        if (functionClassArity != null) {
            return TypeIntrinsics.isFunctionOfArity(obj, functionClassArity.intValue());
        }
        Class wrapperByPrimitive = ReflectClassUtilKt.getWrapperByPrimitive(getJClass());
        if (wrapperByPrimitive == null) {
            wrapperByPrimitive = getJClass();
        }
        return wrapperByPrimitive.isInstance(obj);
    }

    @Override // kotlin.reflect.KClass
    public boolean isOpen() {
        if (getDescriptor().getModality() == Modality.OPEN) {
            return true;
        }
        return false;
    }

    @Override // kotlin.reflect.KClass
    public boolean isSealed() {
        if (getDescriptor().getModality() == Modality.SEALED) {
            return true;
        }
        return false;
    }

    @Override // kotlin.reflect.KClass
    public boolean isValue() {
        return getDescriptor().isValue();
    }

    /* renamed from: j */
    public final ClassId m28700j() {
        return RuntimeTypeMapper.INSTANCE.mapJvmClassToKotlinClassId(getJClass());
    }

    /* renamed from: k */
    public final Void m28699k() {
        KotlinClassHeader.Kind kind;
        int i;
        KotlinClassHeader classHeader;
        ReflectKotlinClass create = ReflectKotlinClass.Factory.create(getJClass());
        if (create != null && (classHeader = create.getClassHeader()) != null) {
            kind = classHeader.getKind();
        } else {
            kind = null;
        }
        if (kind == null) {
            i = -1;
        } else {
            i = WhenMappings.$EnumSwitchMapping$0[kind.ordinal()];
        }
        switch (i) {
            case -1:
            case 6:
                throw new KotlinReflectionInternalError("Unresolved class: " + getJClass());
            case 0:
            default:
                throw new NoWhenBranchMatchedException();
            case 1:
            case 2:
            case 3:
                throw new UnsupportedOperationException("Packages and file facades are not yet supported in Kotlin reflection. Meanwhile please use Java reflection to inspect this class: " + getJClass());
            case 4:
                throw new UnsupportedOperationException("This class is an internal synthetic class generated by the Kotlin compiler, such as an anonymous class for a lambda, a SAM wrapper, a callable reference, etc. It's not a Kotlin class or interface, so the reflection library has no idea what declarations it has. Please use Java reflection to inspect this class: " + getJClass());
            case 5:
                throw new KotlinReflectionInternalError("Unknown class: " + getJClass() + " (kind = " + kind + CoreConstants.RIGHT_PARENTHESIS_CHAR);
        }
    }

    @NotNull
    public String toString() {
        String str;
        StringBuilder sb = new StringBuilder();
        sb.append("class ");
        ClassId m28700j = m28700j();
        FqName packageFqName = m28700j.getPackageFqName();
        Intrinsics.checkNotNullExpressionValue(packageFqName, "classId.packageFqName");
        if (packageFqName.isRoot()) {
            str = "";
        } else {
            str = packageFqName.asString() + '.';
        }
        String asString = m28700j.getRelativeClassName().asString();
        Intrinsics.checkNotNullExpressionValue(asString, "classId.relativeClassName.asString()");
        sb.append(str + AbstractC20204hN1.replace$default(asString, '.', '$', false, 4, (Object) null));
        return sb.toString();
    }

    @Override // kotlin.reflect.jvm.internal.KClassifierImpl
    @NotNull
    public ClassDescriptor getDescriptor() {
        return ((Data) this.f68386d.invoke()).getDescriptor();
    }
}

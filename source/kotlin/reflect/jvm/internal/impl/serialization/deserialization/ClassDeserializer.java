package kotlin.reflect.jvm.internal.impl.serialization.deserialization;

import java.util.Iterator;
import java.util.Set;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.SourceDebugExtension;
import kotlin.reflect.jvm.internal.impl.builtins.StandardNames;
import kotlin.reflect.jvm.internal.impl.descriptors.ClassDescriptor;
import kotlin.reflect.jvm.internal.impl.descriptors.PackageFragmentDescriptor;
import kotlin.reflect.jvm.internal.impl.descriptors.PackageFragmentProvider;
import kotlin.reflect.jvm.internal.impl.descriptors.PackageFragmentProviderKt;
import kotlin.reflect.jvm.internal.impl.descriptors.SourceElement;
import kotlin.reflect.jvm.internal.impl.descriptors.deserialization.ClassDescriptorFactory;
import kotlin.reflect.jvm.internal.impl.metadata.ProtoBuf;
import kotlin.reflect.jvm.internal.impl.metadata.deserialization.BinaryVersion;
import kotlin.reflect.jvm.internal.impl.metadata.deserialization.NameResolver;
import kotlin.reflect.jvm.internal.impl.metadata.deserialization.TypeTable;
import kotlin.reflect.jvm.internal.impl.metadata.deserialization.VersionRequirementTable;
import kotlin.reflect.jvm.internal.impl.name.ClassId;
import kotlin.reflect.jvm.internal.impl.name.FqName;
import kotlin.reflect.jvm.internal.impl.name.Name;
import kotlin.reflect.jvm.internal.impl.serialization.deserialization.descriptors.DeserializedClassDescriptor;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

@SourceDebugExtension({"SMAP\nClassDeserializer.kt\nKotlin\n*S Kotlin\n*F\n+ 1 ClassDeserializer.kt\norg/jetbrains/kotlin/serialization/deserialization/ClassDeserializer\n+ 2 fake.kt\nkotlin/jvm/internal/FakeKt\n+ 3 _Collections.kt\nkotlin/collections/CollectionsKt___CollectionsKt\n*L\n1#1,91:1\n1#2:92\n288#3,2:93\n*S KotlinDebug\n*F\n+ 1 ClassDeserializer.kt\norg/jetbrains/kotlin/serialization/deserialization/ClassDeserializer\n*L\n57#1:93,2\n*E\n"})
/* loaded from: classes6.dex */
public final class ClassDeserializer {
    @NotNull
    public static final Companion Companion = new Companion(null);

    /* renamed from: c */
    public static final Set f70009c = CG1.setOf(ClassId.topLevel(StandardNames.FqNames.cloneable.toSafe()));

    /* renamed from: a */
    public final DeserializationComponents f70010a;

    /* renamed from: b */
    public final Function1 f70011b;

    /* loaded from: classes6.dex */
    public static final class Companion {
        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        @NotNull
        public final Set<ClassId> getBLACK_LIST() {
            return ClassDeserializer.f70009c;
        }

        public Companion() {
        }
    }

    /* renamed from: kotlin.reflect.jvm.internal.impl.serialization.deserialization.ClassDeserializer$a */
    /* loaded from: classes6.dex */
    public static final class C11954a {

        /* renamed from: a */
        public final ClassId f70012a;

        /* renamed from: b */
        public final ClassData f70013b;

        public C11954a(ClassId classId, ClassData classData) {
            Intrinsics.checkNotNullParameter(classId, "classId");
            this.f70012a = classId;
            this.f70013b = classData;
        }

        /* renamed from: a */
        public final ClassData m27721a() {
            return this.f70013b;
        }

        /* renamed from: b */
        public final ClassId m27720b() {
            return this.f70012a;
        }

        public boolean equals(Object obj) {
            if ((obj instanceof C11954a) && Intrinsics.areEqual(this.f70012a, ((C11954a) obj).f70012a)) {
                return true;
            }
            return false;
        }

        public int hashCode() {
            return this.f70012a.hashCode();
        }
    }

    public ClassDeserializer(@NotNull DeserializationComponents components) {
        Intrinsics.checkNotNullParameter(components, "components");
        this.f70010a = components;
        this.f70011b = components.getStorageManager().createMemoizedFunctionWithNullableValues(new ClassDeserializer$classes$1(this));
    }

    public static /* synthetic */ ClassDescriptor deserializeClass$default(ClassDeserializer classDeserializer, ClassId classId, ClassData classData, int i, Object obj) {
        if ((i & 2) != 0) {
            classData = null;
        }
        return classDeserializer.deserializeClass(classId, classData);
    }

    /* renamed from: a */
    public final ClassDescriptor m27722a(C11954a c11954a) {
        Object obj;
        DeserializationContext createContext;
        DeserializedClassDescriptor deserializedClassDescriptor;
        ClassId m27720b = c11954a.m27720b();
        for (ClassDescriptorFactory classDescriptorFactory : this.f70010a.getFictitiousClassDescriptorFactories()) {
            ClassDescriptor createClass = classDescriptorFactory.createClass(m27720b);
            if (createClass != null) {
                return createClass;
            }
        }
        if (f70009c.contains(m27720b)) {
            return null;
        }
        ClassData m27721a = c11954a.m27721a();
        if (m27721a == null && (m27721a = this.f70010a.getClassDataFinder().findClassData(m27720b)) == null) {
            return null;
        }
        NameResolver component1 = m27721a.component1();
        ProtoBuf.Class component2 = m27721a.component2();
        BinaryVersion component3 = m27721a.component3();
        SourceElement component4 = m27721a.component4();
        ClassId outerClassId = m27720b.getOuterClassId();
        if (outerClassId != null) {
            ClassDescriptor deserializeClass$default = deserializeClass$default(this, outerClassId, null, 2, null);
            if (deserializeClass$default instanceof DeserializedClassDescriptor) {
                deserializedClassDescriptor = (DeserializedClassDescriptor) deserializeClass$default;
            } else {
                deserializedClassDescriptor = null;
            }
            if (deserializedClassDescriptor == null) {
                return null;
            }
            Name shortClassName = m27720b.getShortClassName();
            Intrinsics.checkNotNullExpressionValue(shortClassName, "classId.shortClassName");
            if (!deserializedClassDescriptor.hasNestedClass$deserialization(shortClassName)) {
                return null;
            }
            createContext = deserializedClassDescriptor.getC();
        } else {
            PackageFragmentProvider packageFragmentProvider = this.f70010a.getPackageFragmentProvider();
            FqName packageFqName = m27720b.getPackageFqName();
            Intrinsics.checkNotNullExpressionValue(packageFqName, "classId.packageFqName");
            Iterator<T> it = PackageFragmentProviderKt.packageFragments(packageFragmentProvider, packageFqName).iterator();
            while (true) {
                if (it.hasNext()) {
                    obj = it.next();
                    PackageFragmentDescriptor packageFragmentDescriptor = (PackageFragmentDescriptor) obj;
                    if (!(packageFragmentDescriptor instanceof DeserializedPackageFragment)) {
                        break;
                    }
                    Name shortClassName2 = m27720b.getShortClassName();
                    Intrinsics.checkNotNullExpressionValue(shortClassName2, "classId.shortClassName");
                    if (((DeserializedPackageFragment) packageFragmentDescriptor).hasTopLevelClass(shortClassName2)) {
                        break;
                    }
                } else {
                    obj = null;
                    break;
                }
            }
            PackageFragmentDescriptor packageFragmentDescriptor2 = (PackageFragmentDescriptor) obj;
            if (packageFragmentDescriptor2 == null) {
                return null;
            }
            DeserializationComponents deserializationComponents = this.f70010a;
            ProtoBuf.TypeTable typeTable = component2.getTypeTable();
            Intrinsics.checkNotNullExpressionValue(typeTable, "classProto.typeTable");
            TypeTable typeTable2 = new TypeTable(typeTable);
            VersionRequirementTable.Companion companion = VersionRequirementTable.Companion;
            ProtoBuf.VersionRequirementTable versionRequirementTable = component2.getVersionRequirementTable();
            Intrinsics.checkNotNullExpressionValue(versionRequirementTable, "classProto.versionRequirementTable");
            createContext = deserializationComponents.createContext(packageFragmentDescriptor2, component1, typeTable2, companion.create(versionRequirementTable), component3, null);
        }
        return new DeserializedClassDescriptor(createContext, component2, component1, component3, component4);
    }

    @Nullable
    public final ClassDescriptor deserializeClass(@NotNull ClassId classId, @Nullable ClassData classData) {
        Intrinsics.checkNotNullParameter(classId, "classId");
        return (ClassDescriptor) this.f70011b.invoke(new C11954a(classId, classData));
    }
}

package kotlin.reflect.jvm.internal.impl.descriptors.impl;

import java.util.Collection;
import java.util.Collections;
import java.util.List;
import kotlin.jvm.functions.Function0;
import kotlin.reflect.jvm.internal.impl.builtins.KotlinBuiltIns;
import kotlin.reflect.jvm.internal.impl.descriptors.ClassifierDescriptor;
import kotlin.reflect.jvm.internal.impl.descriptors.DeclarationDescriptor;
import kotlin.reflect.jvm.internal.impl.descriptors.DeclarationDescriptorVisitor;
import kotlin.reflect.jvm.internal.impl.descriptors.SourceElement;
import kotlin.reflect.jvm.internal.impl.descriptors.SupertypeLoopChecker;
import kotlin.reflect.jvm.internal.impl.descriptors.TypeParameterDescriptor;
import kotlin.reflect.jvm.internal.impl.descriptors.annotations.Annotations;
import kotlin.reflect.jvm.internal.impl.name.Name;
import kotlin.reflect.jvm.internal.impl.resolve.DescriptorEquivalenceForOverrides;
import kotlin.reflect.jvm.internal.impl.resolve.descriptorUtil.DescriptorUtilsKt;
import kotlin.reflect.jvm.internal.impl.resolve.scopes.LazyScopeAdapter;
import kotlin.reflect.jvm.internal.impl.resolve.scopes.MemberScope;
import kotlin.reflect.jvm.internal.impl.resolve.scopes.TypeIntersectionScope;
import kotlin.reflect.jvm.internal.impl.storage.NotNullLazyValue;
import kotlin.reflect.jvm.internal.impl.storage.StorageManager;
import kotlin.reflect.jvm.internal.impl.types.AbstractTypeConstructor;
import kotlin.reflect.jvm.internal.impl.types.KotlinType;
import kotlin.reflect.jvm.internal.impl.types.KotlinTypeFactory;
import kotlin.reflect.jvm.internal.impl.types.SimpleType;
import kotlin.reflect.jvm.internal.impl.types.TypeAttributes;
import kotlin.reflect.jvm.internal.impl.types.TypeConstructor;
import kotlin.reflect.jvm.internal.impl.types.Variance;
import kotlin.reflect.jvm.internal.impl.types.error.ErrorTypeKind;
import kotlin.reflect.jvm.internal.impl.types.error.ErrorUtils;
import org.jetbrains.annotations.NotNull;

/* loaded from: classes6.dex */
public abstract class AbstractTypeParameterDescriptor extends DeclarationDescriptorNonRootImpl implements TypeParameterDescriptor {

    /* renamed from: e */
    public final Variance f68681e;

    /* renamed from: f */
    public final boolean f68682f;

    /* renamed from: g */
    public final int f68683g;

    /* renamed from: h */
    public final NotNullLazyValue f68684h;

    /* renamed from: i */
    public final NotNullLazyValue f68685i;

    /* renamed from: j */
    public final StorageManager f68686j;

    /* renamed from: kotlin.reflect.jvm.internal.impl.descriptors.impl.AbstractTypeParameterDescriptor$a */
    /* loaded from: classes6.dex */
    public class C11769a implements Function0 {

        /* renamed from: a */
        public final /* synthetic */ StorageManager f68687a;

        /* renamed from: b */
        public final /* synthetic */ SupertypeLoopChecker f68688b;

        public C11769a(StorageManager storageManager, SupertypeLoopChecker supertypeLoopChecker) {
            this.f68687a = storageManager;
            this.f68688b = supertypeLoopChecker;
        }

        @Override // kotlin.jvm.functions.Function0
        /* renamed from: a */
        public TypeConstructor invoke() {
            return new C11772c(AbstractTypeParameterDescriptor.this, this.f68687a, this.f68688b);
        }
    }

    /* renamed from: kotlin.reflect.jvm.internal.impl.descriptors.impl.AbstractTypeParameterDescriptor$b */
    /* loaded from: classes6.dex */
    public class C11770b implements Function0 {

        /* renamed from: a */
        public final /* synthetic */ Name f68690a;

        /* renamed from: kotlin.reflect.jvm.internal.impl.descriptors.impl.AbstractTypeParameterDescriptor$b$a */
        /* loaded from: classes6.dex */
        public class C11771a implements Function0 {
            public C11771a() {
            }

            @Override // kotlin.jvm.functions.Function0
            /* renamed from: a */
            public MemberScope invoke() {
                return TypeIntersectionScope.create("Scope for type parameter " + C11770b.this.f68690a.asString(), AbstractTypeParameterDescriptor.this.getUpperBounds());
            }
        }

        public C11770b(Name name) {
            this.f68690a = name;
        }

        @Override // kotlin.jvm.functions.Function0
        /* renamed from: a */
        public SimpleType invoke() {
            return KotlinTypeFactory.simpleTypeWithNonTrivialMemberScope(TypeAttributes.Companion.getEmpty(), AbstractTypeParameterDescriptor.this.getTypeConstructor(), Collections.emptyList(), false, new LazyScopeAdapter(new C11771a()));
        }
    }

    /* renamed from: kotlin.reflect.jvm.internal.impl.descriptors.impl.AbstractTypeParameterDescriptor$c */
    /* loaded from: classes6.dex */
    public class C11772c extends AbstractTypeConstructor {

        /* renamed from: d */
        public final SupertypeLoopChecker f68693d;

        /* renamed from: e */
        public final /* synthetic */ AbstractTypeParameterDescriptor f68694e;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public C11772c(AbstractTypeParameterDescriptor abstractTypeParameterDescriptor, StorageManager storageManager, SupertypeLoopChecker supertypeLoopChecker) {
            super(storageManager);
            if (storageManager == null) {
                m28537c(0);
            }
            this.f68694e = abstractTypeParameterDescriptor;
            this.f68693d = supertypeLoopChecker;
        }

        /* renamed from: c */
        private static /* synthetic */ void m28537c(int i) {
            String str = (i == 1 || i == 2 || i == 3 || i == 4 || i == 5 || i == 8) ? "@NotNull method %s.%s must not return null" : "Argument for @NotNull parameter '%s' of %s.%s must not be null";
            Object[] objArr = new Object[(i == 1 || i == 2 || i == 3 || i == 4 || i == 5 || i == 8) ? 2 : 3];
            switch (i) {
                case 1:
                case 2:
                case 3:
                case 4:
                case 5:
                case 8:
                    objArr[0] = "kotlin/reflect/jvm/internal/impl/descriptors/impl/AbstractTypeParameterDescriptor$TypeParameterTypeConstructor";
                    break;
                case 6:
                    objArr[0] = "type";
                    break;
                case 7:
                    objArr[0] = "supertypes";
                    break;
                case 9:
                    objArr[0] = "classifier";
                    break;
                default:
                    objArr[0] = "storageManager";
                    break;
            }
            if (i == 1) {
                objArr[1] = "computeSupertypes";
            } else if (i == 2) {
                objArr[1] = "getParameters";
            } else if (i == 3) {
                objArr[1] = "getDeclarationDescriptor";
            } else if (i == 4) {
                objArr[1] = "getBuiltIns";
            } else if (i == 5) {
                objArr[1] = "getSupertypeLoopChecker";
            } else if (i != 8) {
                objArr[1] = "kotlin/reflect/jvm/internal/impl/descriptors/impl/AbstractTypeParameterDescriptor$TypeParameterTypeConstructor";
            } else {
                objArr[1] = "processSupertypesWithoutCycles";
            }
            switch (i) {
                case 1:
                case 2:
                case 3:
                case 4:
                case 5:
                case 8:
                    break;
                case 6:
                    objArr[2] = "reportSupertypeLoopError";
                    break;
                case 7:
                    objArr[2] = "processSupertypesWithoutCycles";
                    break;
                case 9:
                    objArr[2] = "isSameClassifier";
                    break;
                default:
                    objArr[2] = "<init>";
                    break;
            }
            String format = String.format(str, objArr);
            if (i != 1 && i != 2 && i != 3 && i != 4 && i != 5 && i != 8) {
                throw new IllegalArgumentException(format);
            }
            throw new IllegalStateException(format);
        }

        @Override // kotlin.reflect.jvm.internal.impl.types.AbstractTypeConstructor
        public Collection computeSupertypes() {
            List<KotlinType> resolveUpperBounds = this.f68694e.resolveUpperBounds();
            if (resolveUpperBounds == null) {
                m28537c(1);
            }
            return resolveUpperBounds;
        }

        @Override // kotlin.reflect.jvm.internal.impl.types.AbstractTypeConstructor
        public KotlinType defaultSupertypeIfEmpty() {
            return ErrorUtils.createErrorType(ErrorTypeKind.CYCLIC_UPPER_BOUNDS, new String[0]);
        }

        @Override // kotlin.reflect.jvm.internal.impl.types.TypeConstructor
        public KotlinBuiltIns getBuiltIns() {
            KotlinBuiltIns builtIns = DescriptorUtilsKt.getBuiltIns(this.f68694e);
            if (builtIns == null) {
                m28537c(4);
            }
            return builtIns;
        }

        @Override // kotlin.reflect.jvm.internal.impl.types.ClassifierBasedTypeConstructor, kotlin.reflect.jvm.internal.impl.types.TypeConstructor
        public ClassifierDescriptor getDeclarationDescriptor() {
            AbstractTypeParameterDescriptor abstractTypeParameterDescriptor = this.f68694e;
            if (abstractTypeParameterDescriptor == null) {
                m28537c(3);
            }
            return abstractTypeParameterDescriptor;
        }

        @Override // kotlin.reflect.jvm.internal.impl.types.TypeConstructor
        public List getParameters() {
            List emptyList = Collections.emptyList();
            if (emptyList == null) {
                m28537c(2);
            }
            return emptyList;
        }

        @Override // kotlin.reflect.jvm.internal.impl.types.AbstractTypeConstructor
        public SupertypeLoopChecker getSupertypeLoopChecker() {
            SupertypeLoopChecker supertypeLoopChecker = this.f68693d;
            if (supertypeLoopChecker == null) {
                m28537c(5);
            }
            return supertypeLoopChecker;
        }

        @Override // kotlin.reflect.jvm.internal.impl.types.TypeConstructor
        public boolean isDenotable() {
            return true;
        }

        @Override // kotlin.reflect.jvm.internal.impl.types.ClassifierBasedTypeConstructor
        public boolean isSameClassifier(ClassifierDescriptor classifierDescriptor) {
            if (classifierDescriptor == null) {
                m28537c(9);
            }
            if ((classifierDescriptor instanceof TypeParameterDescriptor) && DescriptorEquivalenceForOverrides.INSTANCE.areTypeParametersEquivalent(this.f68694e, (TypeParameterDescriptor) classifierDescriptor, true)) {
                return true;
            }
            return false;
        }

        @Override // kotlin.reflect.jvm.internal.impl.types.AbstractTypeConstructor
        public List processSupertypesWithoutCycles(List list) {
            if (list == null) {
                m28537c(7);
            }
            List<KotlinType> processBoundsWithoutCycles = this.f68694e.processBoundsWithoutCycles(list);
            if (processBoundsWithoutCycles == null) {
                m28537c(8);
            }
            return processBoundsWithoutCycles;
        }

        @Override // kotlin.reflect.jvm.internal.impl.types.AbstractTypeConstructor
        public void reportSupertypeLoopError(KotlinType kotlinType) {
            if (kotlinType == null) {
                m28537c(6);
            }
            this.f68694e.reportSupertypeLoopError(kotlinType);
        }

        public String toString() {
            return this.f68694e.getName().toString();
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public AbstractTypeParameterDescriptor(@NotNull StorageManager storageManager, @NotNull DeclarationDescriptor declarationDescriptor, @NotNull Annotations annotations, @NotNull Name name, @NotNull Variance variance, boolean z, int i, @NotNull SourceElement sourceElement, @NotNull SupertypeLoopChecker supertypeLoopChecker) {
        super(declarationDescriptor, annotations, name, sourceElement);
        if (storageManager == null) {
            m28541a(0);
        }
        if (declarationDescriptor == null) {
            m28541a(1);
        }
        if (annotations == null) {
            m28541a(2);
        }
        if (name == null) {
            m28541a(3);
        }
        if (variance == null) {
            m28541a(4);
        }
        if (sourceElement == null) {
            m28541a(5);
        }
        if (supertypeLoopChecker == null) {
            m28541a(6);
        }
        this.f68681e = variance;
        this.f68682f = z;
        this.f68683g = i;
        this.f68684h = storageManager.createLazyValue(new C11769a(storageManager, supertypeLoopChecker));
        this.f68685i = storageManager.createLazyValue(new C11770b(name));
        this.f68686j = storageManager;
    }

    /* renamed from: a */
    private static /* synthetic */ void m28541a(int i) {
        String str;
        int i2;
        switch (i) {
            case 7:
            case 8:
            case 9:
            case 10:
            case 11:
            case 13:
            case 14:
                str = "@NotNull method %s.%s must not return null";
                break;
            case 12:
            default:
                str = "Argument for @NotNull parameter '%s' of %s.%s must not be null";
                break;
        }
        switch (i) {
            case 7:
            case 8:
            case 9:
            case 10:
            case 11:
            case 13:
            case 14:
                i2 = 2;
                break;
            case 12:
            default:
                i2 = 3;
                break;
        }
        Object[] objArr = new Object[i2];
        switch (i) {
            case 1:
                objArr[0] = "containingDeclaration";
                break;
            case 2:
                objArr[0] = "annotations";
                break;
            case 3:
                objArr[0] = "name";
                break;
            case 4:
                objArr[0] = "variance";
                break;
            case 5:
                objArr[0] = "source";
                break;
            case 6:
                objArr[0] = "supertypeLoopChecker";
                break;
            case 7:
            case 8:
            case 9:
            case 10:
            case 11:
            case 13:
            case 14:
                objArr[0] = "kotlin/reflect/jvm/internal/impl/descriptors/impl/AbstractTypeParameterDescriptor";
                break;
            case 12:
                objArr[0] = "bounds";
                break;
            default:
                objArr[0] = "storageManager";
                break;
        }
        switch (i) {
            case 7:
                objArr[1] = "getVariance";
                break;
            case 8:
                objArr[1] = "getUpperBounds";
                break;
            case 9:
                objArr[1] = "getTypeConstructor";
                break;
            case 10:
                objArr[1] = "getDefaultType";
                break;
            case 11:
                objArr[1] = "getOriginal";
                break;
            case 12:
            default:
                objArr[1] = "kotlin/reflect/jvm/internal/impl/descriptors/impl/AbstractTypeParameterDescriptor";
                break;
            case 13:
                objArr[1] = "processBoundsWithoutCycles";
                break;
            case 14:
                objArr[1] = "getStorageManager";
                break;
        }
        switch (i) {
            case 7:
            case 8:
            case 9:
            case 10:
            case 11:
            case 13:
            case 14:
                break;
            case 12:
                objArr[2] = "processBoundsWithoutCycles";
                break;
            default:
                objArr[2] = "<init>";
                break;
        }
        String format = String.format(str, objArr);
        switch (i) {
            case 7:
            case 8:
            case 9:
            case 10:
            case 11:
            case 13:
            case 14:
                throw new IllegalStateException(format);
            case 12:
            default:
                throw new IllegalArgumentException(format);
        }
    }

    @Override // kotlin.reflect.jvm.internal.impl.descriptors.DeclarationDescriptor
    public <R, D> R accept(DeclarationDescriptorVisitor<R, D> declarationDescriptorVisitor, D d) {
        return declarationDescriptorVisitor.visitTypeParameterDescriptor(this, d);
    }

    @Override // kotlin.reflect.jvm.internal.impl.descriptors.ClassifierDescriptor
    @NotNull
    public SimpleType getDefaultType() {
        SimpleType simpleType = (SimpleType) this.f68685i.invoke();
        if (simpleType == null) {
            m28541a(10);
        }
        return simpleType;
    }

    @Override // kotlin.reflect.jvm.internal.impl.descriptors.TypeParameterDescriptor
    public int getIndex() {
        return this.f68683g;
    }

    @Override // kotlin.reflect.jvm.internal.impl.descriptors.TypeParameterDescriptor
    @NotNull
    public StorageManager getStorageManager() {
        StorageManager storageManager = this.f68686j;
        if (storageManager == null) {
            m28541a(14);
        }
        return storageManager;
    }

    @Override // kotlin.reflect.jvm.internal.impl.descriptors.TypeParameterDescriptor, kotlin.reflect.jvm.internal.impl.descriptors.ClassifierDescriptor
    @NotNull
    public final TypeConstructor getTypeConstructor() {
        TypeConstructor typeConstructor = (TypeConstructor) this.f68684h.invoke();
        if (typeConstructor == null) {
            m28541a(9);
        }
        return typeConstructor;
    }

    @Override // kotlin.reflect.jvm.internal.impl.descriptors.TypeParameterDescriptor
    @NotNull
    public List<KotlinType> getUpperBounds() {
        List<KotlinType> supertypes = ((C11772c) getTypeConstructor()).getSupertypes();
        if (supertypes == null) {
            m28541a(8);
        }
        return supertypes;
    }

    @Override // kotlin.reflect.jvm.internal.impl.descriptors.TypeParameterDescriptor
    @NotNull
    public Variance getVariance() {
        Variance variance = this.f68681e;
        if (variance == null) {
            m28541a(7);
        }
        return variance;
    }

    @Override // kotlin.reflect.jvm.internal.impl.descriptors.TypeParameterDescriptor
    public boolean isCapturedFromOuterDeclaration() {
        return false;
    }

    @Override // kotlin.reflect.jvm.internal.impl.descriptors.TypeParameterDescriptor
    public boolean isReified() {
        return this.f68682f;
    }

    @NotNull
    public List<KotlinType> processBoundsWithoutCycles(@NotNull List<KotlinType> list) {
        if (list == null) {
            m28541a(12);
        }
        if (list == null) {
            m28541a(13);
        }
        return list;
    }

    public abstract void reportSupertypeLoopError(@NotNull KotlinType kotlinType);

    @NotNull
    public abstract List<KotlinType> resolveUpperBounds();

    @Override // kotlin.reflect.jvm.internal.impl.descriptors.impl.DeclarationDescriptorNonRootImpl, kotlin.reflect.jvm.internal.impl.descriptors.impl.DeclarationDescriptorImpl, kotlin.reflect.jvm.internal.impl.descriptors.DeclarationDescriptor
    @NotNull
    public TypeParameterDescriptor getOriginal() {
        TypeParameterDescriptor typeParameterDescriptor = (TypeParameterDescriptor) super.getOriginal();
        if (typeParameterDescriptor == null) {
            m28541a(11);
        }
        return typeParameterDescriptor;
    }
}

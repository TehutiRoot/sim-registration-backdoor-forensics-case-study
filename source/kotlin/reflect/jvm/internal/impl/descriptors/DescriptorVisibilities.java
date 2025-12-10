package kotlin.reflect.jvm.internal.impl.descriptors;

import java.util.Collections;
import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;
import java.util.ServiceLoader;
import java.util.Set;
import kotlin.reflect.jvm.internal.impl.descriptors.Visibilities;
import kotlin.reflect.jvm.internal.impl.descriptors.impl.TypeAliasConstructorDescriptor;
import kotlin.reflect.jvm.internal.impl.resolve.DescriptorUtils;
import kotlin.reflect.jvm.internal.impl.resolve.scopes.receivers.ReceiverValue;
import kotlin.reflect.jvm.internal.impl.resolve.scopes.receivers.SuperCallReceiverValue;
import kotlin.reflect.jvm.internal.impl.resolve.scopes.receivers.ThisClassReceiver;
import kotlin.reflect.jvm.internal.impl.types.DynamicTypesKt;
import kotlin.reflect.jvm.internal.impl.types.KotlinType;
import kotlin.reflect.jvm.internal.impl.util.ModuleVisibilityHelper;
import kotlin.reflect.jvm.internal.impl.utils.CollectionsKt;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* loaded from: classes6.dex */
public class DescriptorVisibilities {
    public static final ReceiverValue ALWAYS_SUITABLE_RECEIVER;
    public static final DescriptorVisibility DEFAULT_VISIBILITY;
    @Deprecated
    public static final ReceiverValue FALSE_IF_PROTECTED;
    @NotNull
    public static final DescriptorVisibility INHERITED;
    @NotNull
    public static final DescriptorVisibility INTERNAL;
    @NotNull
    public static final DescriptorVisibility INVISIBLE_FAKE;
    public static final Set<DescriptorVisibility> INVISIBLE_FROM_OTHER_MODULES;
    @NotNull
    public static final DescriptorVisibility LOCAL;
    @NotNull
    public static final DescriptorVisibility PRIVATE;
    @NotNull
    public static final DescriptorVisibility PRIVATE_TO_THIS;
    @NotNull
    public static final DescriptorVisibility PROTECTED;
    @NotNull
    public static final DescriptorVisibility PUBLIC;
    @NotNull
    public static final DescriptorVisibility UNKNOWN;

    /* renamed from: a */
    public static final Map f68617a;

    /* renamed from: b */
    public static final ReceiverValue f68618b;

    /* renamed from: c */
    public static final ModuleVisibilityHelper f68619c;

    /* renamed from: d */
    public static final Map f68620d;

    /* renamed from: kotlin.reflect.jvm.internal.impl.descriptors.DescriptorVisibilities$a */
    /* loaded from: classes6.dex */
    public static class C11744a implements ReceiverValue {
        @Override // kotlin.reflect.jvm.internal.impl.resolve.scopes.receivers.ReceiverValue
        public KotlinType getType() {
            throw new IllegalStateException("This method should not be called");
        }
    }

    /* renamed from: kotlin.reflect.jvm.internal.impl.descriptors.DescriptorVisibilities$b */
    /* loaded from: classes6.dex */
    public static class C11745b implements ReceiverValue {
        @Override // kotlin.reflect.jvm.internal.impl.resolve.scopes.receivers.ReceiverValue
        public KotlinType getType() {
            throw new IllegalStateException("This method should not be called");
        }
    }

    /* renamed from: kotlin.reflect.jvm.internal.impl.descriptors.DescriptorVisibilities$c */
    /* loaded from: classes6.dex */
    public static class C11746c implements ReceiverValue {
        @Override // kotlin.reflect.jvm.internal.impl.resolve.scopes.receivers.ReceiverValue
        public KotlinType getType() {
            throw new IllegalStateException("This method should not be called");
        }
    }

    /* renamed from: kotlin.reflect.jvm.internal.impl.descriptors.DescriptorVisibilities$d */
    /* loaded from: classes6.dex */
    public static class C11747d extends DelegatedDescriptorVisibility {
        public C11747d(Visibility visibility) {
            super(visibility);
        }

        /* renamed from: a */
        public static /* synthetic */ void m28568a(int i) {
            Object[] objArr = new Object[3];
            if (i == 1) {
                objArr[0] = "what";
            } else if (i != 2) {
                objArr[0] = "descriptor";
            } else {
                objArr[0] = "from";
            }
            objArr[1] = "kotlin/reflect/jvm/internal/impl/descriptors/DescriptorVisibilities$1";
            if (i == 1 || i == 2) {
                objArr[2] = "isVisible";
            } else {
                objArr[2] = "hasContainingSourceFile";
            }
            throw new IllegalArgumentException(String.format("Argument for @NotNull parameter '%s' of %s.%s must not be null", objArr));
        }

        /* renamed from: b */
        public final boolean m28567b(DeclarationDescriptor declarationDescriptor) {
            if (declarationDescriptor == null) {
                m28568a(0);
            }
            if (DescriptorUtils.getContainingSourceFile(declarationDescriptor) == SourceFile.NO_SOURCE_FILE) {
                return false;
            }
            return true;
        }

        /* JADX WARN: Multi-variable type inference failed */
        /* JADX WARN: Type inference failed for: r4v0, types: [kotlin.reflect.jvm.internal.impl.descriptors.DeclarationDescriptor, kotlin.reflect.jvm.internal.impl.descriptors.DeclarationDescriptorWithVisibility] */
        /* JADX WARN: Type inference failed for: r4v1, types: [kotlin.reflect.jvm.internal.impl.descriptors.DeclarationDescriptor] */
        /* JADX WARN: Type inference failed for: r4v2, types: [kotlin.reflect.jvm.internal.impl.descriptors.DeclarationDescriptor] */
        /* JADX WARN: Type inference failed for: r4v4, types: [kotlin.reflect.jvm.internal.impl.descriptors.DeclarationDescriptor] */
        @Override // kotlin.reflect.jvm.internal.impl.descriptors.DescriptorVisibility
        public boolean isVisible(ReceiverValue receiverValue, DeclarationDescriptorWithVisibility declarationDescriptorWithVisibility, DeclarationDescriptor declarationDescriptor, boolean z) {
            if (declarationDescriptorWithVisibility == 0) {
                m28568a(1);
            }
            if (declarationDescriptor == null) {
                m28568a(2);
            }
            if (DescriptorUtils.isTopLevelDeclaration(declarationDescriptorWithVisibility) && m28567b(declarationDescriptor)) {
                return DescriptorVisibilities.inSameFile(declarationDescriptorWithVisibility, declarationDescriptor);
            }
            if (declarationDescriptorWithVisibility instanceof ConstructorDescriptor) {
                ClassifierDescriptorWithTypeParameters containingDeclaration = ((ConstructorDescriptor) declarationDescriptorWithVisibility).getContainingDeclaration();
                if (z && DescriptorUtils.isSealedClass(containingDeclaration) && DescriptorUtils.isTopLevelDeclaration(containingDeclaration) && (declarationDescriptor instanceof ConstructorDescriptor) && DescriptorUtils.isTopLevelDeclaration(declarationDescriptor.getContainingDeclaration()) && DescriptorVisibilities.inSameFile(declarationDescriptorWithVisibility, declarationDescriptor)) {
                    return true;
                }
            }
            while (declarationDescriptorWithVisibility != 0) {
                declarationDescriptorWithVisibility = declarationDescriptorWithVisibility.getContainingDeclaration();
                if (declarationDescriptorWithVisibility instanceof ClassDescriptor) {
                    if (!DescriptorUtils.isCompanionObject(declarationDescriptorWithVisibility)) {
                        break;
                    }
                }
                if (declarationDescriptorWithVisibility instanceof PackageFragmentDescriptor) {
                    break;
                }
            }
            if (declarationDescriptorWithVisibility == 0) {
                return false;
            }
            while (declarationDescriptor != null) {
                if (declarationDescriptorWithVisibility == declarationDescriptor) {
                    return true;
                }
                if (declarationDescriptor instanceof PackageFragmentDescriptor) {
                    if ((declarationDescriptorWithVisibility instanceof PackageFragmentDescriptor) && declarationDescriptorWithVisibility.getFqName().equals(((PackageFragmentDescriptor) declarationDescriptor).getFqName()) && DescriptorUtils.areInSameModule(declarationDescriptor, declarationDescriptorWithVisibility)) {
                        return true;
                    }
                    return false;
                }
                declarationDescriptor = declarationDescriptor.getContainingDeclaration();
            }
            return false;
        }
    }

    /* renamed from: kotlin.reflect.jvm.internal.impl.descriptors.DescriptorVisibilities$e */
    /* loaded from: classes6.dex */
    public static class C11748e extends DelegatedDescriptorVisibility {
        public C11748e(Visibility visibility) {
            super(visibility);
        }

        /* renamed from: a */
        private static /* synthetic */ void m28566a(int i) {
            Object[] objArr = new Object[3];
            if (i != 1) {
                objArr[0] = "what";
            } else {
                objArr[0] = "from";
            }
            objArr[1] = "kotlin/reflect/jvm/internal/impl/descriptors/DescriptorVisibilities$2";
            objArr[2] = "isVisible";
            throw new IllegalArgumentException(String.format("Argument for @NotNull parameter '%s' of %s.%s must not be null", objArr));
        }

        @Override // kotlin.reflect.jvm.internal.impl.descriptors.DescriptorVisibility
        public boolean isVisible(ReceiverValue receiverValue, DeclarationDescriptorWithVisibility declarationDescriptorWithVisibility, DeclarationDescriptor declarationDescriptor, boolean z) {
            DeclarationDescriptor parentOfType;
            if (declarationDescriptorWithVisibility == null) {
                m28566a(0);
            }
            if (declarationDescriptor == null) {
                m28566a(1);
            }
            if (DescriptorVisibilities.PRIVATE.isVisible(receiverValue, declarationDescriptorWithVisibility, declarationDescriptor, z)) {
                if (receiverValue == DescriptorVisibilities.ALWAYS_SUITABLE_RECEIVER) {
                    return true;
                }
                if (receiverValue != DescriptorVisibilities.f68618b && (parentOfType = DescriptorUtils.getParentOfType(declarationDescriptorWithVisibility, ClassDescriptor.class)) != null && (receiverValue instanceof ThisClassReceiver)) {
                    return ((ThisClassReceiver) receiverValue).getClassDescriptor().getOriginal().equals(parentOfType.getOriginal());
                }
            }
            return false;
        }
    }

    /* renamed from: kotlin.reflect.jvm.internal.impl.descriptors.DescriptorVisibilities$f */
    /* loaded from: classes6.dex */
    public static class C11749f extends DelegatedDescriptorVisibility {
        public C11749f(Visibility visibility) {
            super(visibility);
        }

        /* renamed from: a */
        private static /* synthetic */ void m28565a(int i) {
            Object[] objArr = new Object[3];
            if (i == 1) {
                objArr[0] = "from";
            } else if (i == 2) {
                objArr[0] = "whatDeclaration";
            } else if (i != 3) {
                objArr[0] = "what";
            } else {
                objArr[0] = "fromClass";
            }
            objArr[1] = "kotlin/reflect/jvm/internal/impl/descriptors/DescriptorVisibilities$3";
            if (i == 2 || i == 3) {
                objArr[2] = "doesReceiverFitForProtectedVisibility";
            } else {
                objArr[2] = "isVisible";
            }
            throw new IllegalArgumentException(String.format("Argument for @NotNull parameter '%s' of %s.%s must not be null", objArr));
        }

        /* renamed from: b */
        public final boolean m28564b(ReceiverValue receiverValue, DeclarationDescriptorWithVisibility declarationDescriptorWithVisibility, ClassDescriptor classDescriptor) {
            KotlinType type;
            if (declarationDescriptorWithVisibility == null) {
                m28565a(2);
            }
            if (classDescriptor == null) {
                m28565a(3);
            }
            if (receiverValue == DescriptorVisibilities.FALSE_IF_PROTECTED) {
                return false;
            }
            if (!(declarationDescriptorWithVisibility instanceof CallableMemberDescriptor) || (declarationDescriptorWithVisibility instanceof ConstructorDescriptor) || receiverValue == DescriptorVisibilities.ALWAYS_SUITABLE_RECEIVER) {
                return true;
            }
            if (receiverValue == DescriptorVisibilities.f68618b || receiverValue == null) {
                return false;
            }
            if (receiverValue instanceof SuperCallReceiverValue) {
                type = ((SuperCallReceiverValue) receiverValue).getThisType();
            } else {
                type = receiverValue.getType();
            }
            if (!DescriptorUtils.isSubtypeOfClass(type, classDescriptor) && !DynamicTypesKt.isDynamic(type)) {
                return false;
            }
            return true;
        }

        @Override // kotlin.reflect.jvm.internal.impl.descriptors.DescriptorVisibility
        public boolean isVisible(ReceiverValue receiverValue, DeclarationDescriptorWithVisibility declarationDescriptorWithVisibility, DeclarationDescriptor declarationDescriptor, boolean z) {
            ClassDescriptor classDescriptor;
            if (declarationDescriptorWithVisibility == null) {
                m28565a(0);
            }
            if (declarationDescriptor == null) {
                m28565a(1);
            }
            ClassDescriptor classDescriptor2 = (ClassDescriptor) DescriptorUtils.getParentOfType(declarationDescriptorWithVisibility, ClassDescriptor.class);
            ClassDescriptor classDescriptor3 = (ClassDescriptor) DescriptorUtils.getParentOfType(declarationDescriptor, ClassDescriptor.class, false);
            if (classDescriptor3 == null) {
                return false;
            }
            if (classDescriptor2 != null && DescriptorUtils.isCompanionObject(classDescriptor2) && (classDescriptor = (ClassDescriptor) DescriptorUtils.getParentOfType(classDescriptor2, ClassDescriptor.class)) != null && DescriptorUtils.isSubclass(classDescriptor3, classDescriptor)) {
                return true;
            }
            DeclarationDescriptorWithVisibility unwrapFakeOverrideToAnyDeclaration = DescriptorUtils.unwrapFakeOverrideToAnyDeclaration(declarationDescriptorWithVisibility);
            ClassDescriptor classDescriptor4 = (ClassDescriptor) DescriptorUtils.getParentOfType(unwrapFakeOverrideToAnyDeclaration, ClassDescriptor.class);
            if (classDescriptor4 == null) {
                return false;
            }
            if (DescriptorUtils.isSubclass(classDescriptor3, classDescriptor4) && m28564b(receiverValue, unwrapFakeOverrideToAnyDeclaration, classDescriptor3)) {
                return true;
            }
            return isVisible(receiverValue, declarationDescriptorWithVisibility, classDescriptor3.getContainingDeclaration(), z);
        }
    }

    /* renamed from: kotlin.reflect.jvm.internal.impl.descriptors.DescriptorVisibilities$g */
    /* loaded from: classes6.dex */
    public static class C11750g extends DelegatedDescriptorVisibility {
        public C11750g(Visibility visibility) {
            super(visibility);
        }

        /* renamed from: a */
        private static /* synthetic */ void m28563a(int i) {
            Object[] objArr = new Object[3];
            if (i != 1) {
                objArr[0] = "what";
            } else {
                objArr[0] = "from";
            }
            objArr[1] = "kotlin/reflect/jvm/internal/impl/descriptors/DescriptorVisibilities$4";
            objArr[2] = "isVisible";
            throw new IllegalArgumentException(String.format("Argument for @NotNull parameter '%s' of %s.%s must not be null", objArr));
        }

        @Override // kotlin.reflect.jvm.internal.impl.descriptors.DescriptorVisibility
        public boolean isVisible(ReceiverValue receiverValue, DeclarationDescriptorWithVisibility declarationDescriptorWithVisibility, DeclarationDescriptor declarationDescriptor, boolean z) {
            if (declarationDescriptorWithVisibility == null) {
                m28563a(0);
            }
            if (declarationDescriptor == null) {
                m28563a(1);
            }
            if (!DescriptorUtils.getContainingModule(declarationDescriptor).shouldSeeInternalsOf(DescriptorUtils.getContainingModule(declarationDescriptorWithVisibility))) {
                return false;
            }
            return DescriptorVisibilities.f68619c.isInFriendModule(declarationDescriptorWithVisibility, declarationDescriptor);
        }
    }

    /* renamed from: kotlin.reflect.jvm.internal.impl.descriptors.DescriptorVisibilities$h */
    /* loaded from: classes6.dex */
    public static class C11751h extends DelegatedDescriptorVisibility {
        public C11751h(Visibility visibility) {
            super(visibility);
        }

        /* renamed from: a */
        private static /* synthetic */ void m28562a(int i) {
            Object[] objArr = new Object[3];
            if (i != 1) {
                objArr[0] = "what";
            } else {
                objArr[0] = "from";
            }
            objArr[1] = "kotlin/reflect/jvm/internal/impl/descriptors/DescriptorVisibilities$5";
            objArr[2] = "isVisible";
            throw new IllegalArgumentException(String.format("Argument for @NotNull parameter '%s' of %s.%s must not be null", objArr));
        }

        @Override // kotlin.reflect.jvm.internal.impl.descriptors.DescriptorVisibility
        public boolean isVisible(ReceiverValue receiverValue, DeclarationDescriptorWithVisibility declarationDescriptorWithVisibility, DeclarationDescriptor declarationDescriptor, boolean z) {
            if (declarationDescriptorWithVisibility == null) {
                m28562a(0);
            }
            if (declarationDescriptor == null) {
                m28562a(1);
            }
            return true;
        }
    }

    /* renamed from: kotlin.reflect.jvm.internal.impl.descriptors.DescriptorVisibilities$i */
    /* loaded from: classes6.dex */
    public static class C11752i extends DelegatedDescriptorVisibility {
        public C11752i(Visibility visibility) {
            super(visibility);
        }

        /* renamed from: a */
        private static /* synthetic */ void m28561a(int i) {
            Object[] objArr = new Object[3];
            if (i != 1) {
                objArr[0] = "what";
            } else {
                objArr[0] = "from";
            }
            objArr[1] = "kotlin/reflect/jvm/internal/impl/descriptors/DescriptorVisibilities$6";
            objArr[2] = "isVisible";
            throw new IllegalArgumentException(String.format("Argument for @NotNull parameter '%s' of %s.%s must not be null", objArr));
        }

        @Override // kotlin.reflect.jvm.internal.impl.descriptors.DescriptorVisibility
        public boolean isVisible(ReceiverValue receiverValue, DeclarationDescriptorWithVisibility declarationDescriptorWithVisibility, DeclarationDescriptor declarationDescriptor, boolean z) {
            if (declarationDescriptorWithVisibility == null) {
                m28561a(0);
            }
            if (declarationDescriptor == null) {
                m28561a(1);
            }
            throw new IllegalStateException("This method shouldn't be invoked for LOCAL visibility");
        }
    }

    /* renamed from: kotlin.reflect.jvm.internal.impl.descriptors.DescriptorVisibilities$j */
    /* loaded from: classes6.dex */
    public static class C11753j extends DelegatedDescriptorVisibility {
        public C11753j(Visibility visibility) {
            super(visibility);
        }

        /* renamed from: a */
        private static /* synthetic */ void m28560a(int i) {
            Object[] objArr = new Object[3];
            if (i != 1) {
                objArr[0] = "what";
            } else {
                objArr[0] = "from";
            }
            objArr[1] = "kotlin/reflect/jvm/internal/impl/descriptors/DescriptorVisibilities$7";
            objArr[2] = "isVisible";
            throw new IllegalArgumentException(String.format("Argument for @NotNull parameter '%s' of %s.%s must not be null", objArr));
        }

        @Override // kotlin.reflect.jvm.internal.impl.descriptors.DescriptorVisibility
        public boolean isVisible(ReceiverValue receiverValue, DeclarationDescriptorWithVisibility declarationDescriptorWithVisibility, DeclarationDescriptor declarationDescriptor, boolean z) {
            if (declarationDescriptorWithVisibility == null) {
                m28560a(0);
            }
            if (declarationDescriptor == null) {
                m28560a(1);
            }
            throw new IllegalStateException("Visibility is unknown yet");
        }
    }

    /* renamed from: kotlin.reflect.jvm.internal.impl.descriptors.DescriptorVisibilities$k */
    /* loaded from: classes6.dex */
    public static class C11754k extends DelegatedDescriptorVisibility {
        public C11754k(Visibility visibility) {
            super(visibility);
        }

        /* renamed from: a */
        private static /* synthetic */ void m28559a(int i) {
            Object[] objArr = new Object[3];
            if (i != 1) {
                objArr[0] = "what";
            } else {
                objArr[0] = "from";
            }
            objArr[1] = "kotlin/reflect/jvm/internal/impl/descriptors/DescriptorVisibilities$8";
            objArr[2] = "isVisible";
            throw new IllegalArgumentException(String.format("Argument for @NotNull parameter '%s' of %s.%s must not be null", objArr));
        }

        @Override // kotlin.reflect.jvm.internal.impl.descriptors.DescriptorVisibility
        public boolean isVisible(ReceiverValue receiverValue, DeclarationDescriptorWithVisibility declarationDescriptorWithVisibility, DeclarationDescriptor declarationDescriptor, boolean z) {
            if (declarationDescriptorWithVisibility == null) {
                m28559a(0);
            }
            if (declarationDescriptor == null) {
                m28559a(1);
            }
            return false;
        }
    }

    /* renamed from: kotlin.reflect.jvm.internal.impl.descriptors.DescriptorVisibilities$l */
    /* loaded from: classes6.dex */
    public static class C11755l extends DelegatedDescriptorVisibility {
        public C11755l(Visibility visibility) {
            super(visibility);
        }

        /* renamed from: a */
        private static /* synthetic */ void m28558a(int i) {
            Object[] objArr = new Object[3];
            if (i != 1) {
                objArr[0] = "what";
            } else {
                objArr[0] = "from";
            }
            objArr[1] = "kotlin/reflect/jvm/internal/impl/descriptors/DescriptorVisibilities$9";
            objArr[2] = "isVisible";
            throw new IllegalArgumentException(String.format("Argument for @NotNull parameter '%s' of %s.%s must not be null", objArr));
        }

        @Override // kotlin.reflect.jvm.internal.impl.descriptors.DescriptorVisibility
        public boolean isVisible(ReceiverValue receiverValue, DeclarationDescriptorWithVisibility declarationDescriptorWithVisibility, DeclarationDescriptor declarationDescriptor, boolean z) {
            if (declarationDescriptorWithVisibility == null) {
                m28558a(0);
            }
            if (declarationDescriptor == null) {
                m28558a(1);
            }
            return false;
        }
    }

    static {
        ModuleVisibilityHelper moduleVisibilityHelper;
        C11747d c11747d = new C11747d(Visibilities.Private.INSTANCE);
        PRIVATE = c11747d;
        C11748e c11748e = new C11748e(Visibilities.PrivateToThis.INSTANCE);
        PRIVATE_TO_THIS = c11748e;
        C11749f c11749f = new C11749f(Visibilities.Protected.INSTANCE);
        PROTECTED = c11749f;
        C11750g c11750g = new C11750g(Visibilities.Internal.INSTANCE);
        INTERNAL = c11750g;
        C11751h c11751h = new C11751h(Visibilities.Public.INSTANCE);
        PUBLIC = c11751h;
        C11752i c11752i = new C11752i(Visibilities.Local.INSTANCE);
        LOCAL = c11752i;
        C11753j c11753j = new C11753j(Visibilities.Inherited.INSTANCE);
        INHERITED = c11753j;
        C11754k c11754k = new C11754k(Visibilities.InvisibleFake.INSTANCE);
        INVISIBLE_FAKE = c11754k;
        C11755l c11755l = new C11755l(Visibilities.Unknown.INSTANCE);
        UNKNOWN = c11755l;
        INVISIBLE_FROM_OTHER_MODULES = Collections.unmodifiableSet(DG1.setOf((Object[]) new DescriptorVisibility[]{c11747d, c11748e, c11750g, c11752i}));
        HashMap newHashMapWithExpectedSize = CollectionsKt.newHashMapWithExpectedSize(4);
        newHashMapWithExpectedSize.put(c11748e, 0);
        newHashMapWithExpectedSize.put(c11747d, 0);
        newHashMapWithExpectedSize.put(c11750g, 1);
        newHashMapWithExpectedSize.put(c11749f, 1);
        newHashMapWithExpectedSize.put(c11751h, 2);
        f68617a = Collections.unmodifiableMap(newHashMapWithExpectedSize);
        DEFAULT_VISIBILITY = c11751h;
        f68618b = new C11744a();
        ALWAYS_SUITABLE_RECEIVER = new C11745b();
        FALSE_IF_PROTECTED = new C11746c();
        Iterator it = ServiceLoader.load(ModuleVisibilityHelper.class, ModuleVisibilityHelper.class.getClassLoader()).iterator();
        if (it.hasNext()) {
            moduleVisibilityHelper = (ModuleVisibilityHelper) it.next();
        } else {
            moduleVisibilityHelper = ModuleVisibilityHelper.EMPTY.INSTANCE;
        }
        f68619c = moduleVisibilityHelper;
        f68620d = new HashMap();
        m28569d(c11747d);
        m28569d(c11748e);
        m28569d(c11749f);
        m28569d(c11750g);
        m28569d(c11751h);
        m28569d(c11752i);
        m28569d(c11753j);
        m28569d(c11754k);
        m28569d(c11755l);
    }

    /* JADX WARN: Removed duplicated region for block: B:26:0x0042  */
    /* JADX WARN: Removed duplicated region for block: B:27:0x0045  */
    /* JADX WARN: Removed duplicated region for block: B:29:0x004a  */
    /* JADX WARN: Removed duplicated region for block: B:30:0x004f  */
    /* JADX WARN: Removed duplicated region for block: B:31:0x0052  */
    /* JADX WARN: Removed duplicated region for block: B:32:0x0057  */
    /* JADX WARN: Removed duplicated region for block: B:33:0x005c  */
    /* JADX WARN: Removed duplicated region for block: B:34:0x0061  */
    /* JADX WARN: Removed duplicated region for block: B:35:0x0066  */
    /* JADX WARN: Removed duplicated region for block: B:36:0x006b  */
    /* JADX WARN: Removed duplicated region for block: B:37:0x0070  */
    /* JADX WARN: Removed duplicated region for block: B:40:0x007a  */
    /* JADX WARN: Removed duplicated region for block: B:41:0x0080  */
    /* renamed from: a */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public static /* synthetic */ void m28572a(int r8) {
        /*
            r0 = 16
            if (r8 == r0) goto L7
            java.lang.String r1 = "Argument for @NotNull parameter '%s' of %s.%s must not be null"
            goto L9
        L7:
            java.lang.String r1 = "@NotNull method %s.%s must not return null"
        L9:
            r2 = 3
            r3 = 2
            if (r8 == r0) goto Lf
            r4 = 3
            goto L10
        Lf:
            r4 = 2
        L10:
            java.lang.Object[] r4 = new java.lang.Object[r4]
            java.lang.String r5 = "kotlin/reflect/jvm/internal/impl/descriptors/DescriptorVisibilities"
            r6 = 1
            r7 = 0
            if (r8 == r6) goto L3a
            if (r8 == r2) goto L3a
            r2 = 5
            if (r8 == r2) goto L3a
            r2 = 7
            if (r8 == r2) goto L3a
            switch(r8) {
                case 9: goto L3a;
                case 10: goto L35;
                case 11: goto L30;
                case 12: goto L35;
                case 13: goto L30;
                case 14: goto L2b;
                case 15: goto L2b;
                case 16: goto L28;
                default: goto L23;
            }
        L23:
            java.lang.String r2 = "what"
            r4[r7] = r2
            goto L3e
        L28:
            r4[r7] = r5
            goto L3e
        L2b:
            java.lang.String r2 = "visibility"
            r4[r7] = r2
            goto L3e
        L30:
            java.lang.String r2 = "second"
            r4[r7] = r2
            goto L3e
        L35:
            java.lang.String r2 = "first"
            r4[r7] = r2
            goto L3e
        L3a:
            java.lang.String r2 = "from"
            r4[r7] = r2
        L3e:
            java.lang.String r2 = "toDescriptorVisibility"
            if (r8 == r0) goto L45
            r4[r6] = r5
            goto L47
        L45:
            r4[r6] = r2
        L47:
            switch(r8) {
                case 2: goto L70;
                case 3: goto L70;
                case 4: goto L6b;
                case 5: goto L6b;
                case 6: goto L66;
                case 7: goto L66;
                case 8: goto L61;
                case 9: goto L61;
                case 10: goto L5c;
                case 11: goto L5c;
                case 12: goto L57;
                case 13: goto L57;
                case 14: goto L52;
                case 15: goto L4f;
                case 16: goto L74;
                default: goto L4a;
            }
        L4a:
            java.lang.String r2 = "isVisible"
            r4[r3] = r2
            goto L74
        L4f:
            r4[r3] = r2
            goto L74
        L52:
            java.lang.String r2 = "isPrivate"
            r4[r3] = r2
            goto L74
        L57:
            java.lang.String r2 = "compare"
            r4[r3] = r2
            goto L74
        L5c:
            java.lang.String r2 = "compareLocal"
            r4[r3] = r2
            goto L74
        L61:
            java.lang.String r2 = "findInvisibleMember"
            r4[r3] = r2
            goto L74
        L66:
            java.lang.String r2 = "inSameFile"
            r4[r3] = r2
            goto L74
        L6b:
            java.lang.String r2 = "isVisibleWithAnyReceiver"
            r4[r3] = r2
            goto L74
        L70:
            java.lang.String r2 = "isVisibleIgnoringReceiver"
            r4[r3] = r2
        L74:
            java.lang.String r1 = java.lang.String.format(r1, r4)
            if (r8 == r0) goto L80
            java.lang.IllegalArgumentException r8 = new java.lang.IllegalArgumentException
            r8.<init>(r1)
            goto L85
        L80:
            java.lang.IllegalStateException r8 = new java.lang.IllegalStateException
            r8.<init>(r1)
        L85:
            throw r8
        */
        throw new UnsupportedOperationException("Method not decompiled: kotlin.reflect.jvm.internal.impl.descriptors.DescriptorVisibilities.m28572a(int):void");
    }

    @Nullable
    public static Integer compare(@NotNull DescriptorVisibility descriptorVisibility, @NotNull DescriptorVisibility descriptorVisibility2) {
        if (descriptorVisibility == null) {
            m28572a(12);
        }
        if (descriptorVisibility2 == null) {
            m28572a(13);
        }
        Integer compareTo = descriptorVisibility.compareTo(descriptorVisibility2);
        if (compareTo != null) {
            return compareTo;
        }
        Integer compareTo2 = descriptorVisibility2.compareTo(descriptorVisibility);
        if (compareTo2 != null) {
            return Integer.valueOf(-compareTo2.intValue());
        }
        return null;
    }

    /* renamed from: d */
    public static void m28569d(DescriptorVisibility descriptorVisibility) {
        f68620d.put(descriptorVisibility.getDelegate(), descriptorVisibility);
    }

    @Nullable
    public static DeclarationDescriptorWithVisibility findInvisibleMember(@Nullable ReceiverValue receiverValue, @NotNull DeclarationDescriptorWithVisibility declarationDescriptorWithVisibility, @NotNull DeclarationDescriptor declarationDescriptor, boolean z) {
        DeclarationDescriptorWithVisibility findInvisibleMember;
        if (declarationDescriptorWithVisibility == null) {
            m28572a(8);
        }
        if (declarationDescriptor == null) {
            m28572a(9);
        }
        for (DeclarationDescriptorWithVisibility declarationDescriptorWithVisibility2 = (DeclarationDescriptorWithVisibility) declarationDescriptorWithVisibility.getOriginal(); declarationDescriptorWithVisibility2 != null && declarationDescriptorWithVisibility2.getVisibility() != LOCAL; declarationDescriptorWithVisibility2 = (DeclarationDescriptorWithVisibility) DescriptorUtils.getParentOfType(declarationDescriptorWithVisibility2, DeclarationDescriptorWithVisibility.class)) {
            if (!declarationDescriptorWithVisibility2.getVisibility().isVisible(receiverValue, declarationDescriptorWithVisibility2, declarationDescriptor, z)) {
                return declarationDescriptorWithVisibility2;
            }
        }
        if ((declarationDescriptorWithVisibility instanceof TypeAliasConstructorDescriptor) && (findInvisibleMember = findInvisibleMember(receiverValue, ((TypeAliasConstructorDescriptor) declarationDescriptorWithVisibility).getUnderlyingConstructorDescriptor(), declarationDescriptor, z)) != null) {
            return findInvisibleMember;
        }
        return null;
    }

    public static boolean inSameFile(@NotNull DeclarationDescriptor declarationDescriptor, @NotNull DeclarationDescriptor declarationDescriptor2) {
        if (declarationDescriptor == null) {
            m28572a(6);
        }
        if (declarationDescriptor2 == null) {
            m28572a(7);
        }
        SourceFile containingSourceFile = DescriptorUtils.getContainingSourceFile(declarationDescriptor2);
        if (containingSourceFile != SourceFile.NO_SOURCE_FILE) {
            return containingSourceFile.equals(DescriptorUtils.getContainingSourceFile(declarationDescriptor));
        }
        return false;
    }

    public static boolean isPrivate(@NotNull DescriptorVisibility descriptorVisibility) {
        if (descriptorVisibility == null) {
            m28572a(14);
        }
        if (descriptorVisibility != PRIVATE && descriptorVisibility != PRIVATE_TO_THIS) {
            return false;
        }
        return true;
    }

    public static boolean isVisibleIgnoringReceiver(@NotNull DeclarationDescriptorWithVisibility declarationDescriptorWithVisibility, @NotNull DeclarationDescriptor declarationDescriptor, boolean z) {
        if (declarationDescriptorWithVisibility == null) {
            m28572a(2);
        }
        if (declarationDescriptor == null) {
            m28572a(3);
        }
        if (findInvisibleMember(ALWAYS_SUITABLE_RECEIVER, declarationDescriptorWithVisibility, declarationDescriptor, z) == null) {
            return true;
        }
        return false;
    }

    @NotNull
    public static DescriptorVisibility toDescriptorVisibility(@NotNull Visibility visibility) {
        if (visibility == null) {
            m28572a(15);
        }
        DescriptorVisibility descriptorVisibility = (DescriptorVisibility) f68620d.get(visibility);
        if (descriptorVisibility != null) {
            return descriptorVisibility;
        }
        throw new IllegalArgumentException("Inapplicable visibility: " + visibility);
    }
}

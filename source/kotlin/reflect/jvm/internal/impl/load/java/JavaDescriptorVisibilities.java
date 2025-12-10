package kotlin.reflect.jvm.internal.impl.load.java;

import java.util.HashMap;
import java.util.Map;
import kotlin.reflect.jvm.internal.impl.descriptors.DeclarationDescriptor;
import kotlin.reflect.jvm.internal.impl.descriptors.DeclarationDescriptorWithVisibility;
import kotlin.reflect.jvm.internal.impl.descriptors.DelegatedDescriptorVisibility;
import kotlin.reflect.jvm.internal.impl.descriptors.DescriptorVisibilities;
import kotlin.reflect.jvm.internal.impl.descriptors.DescriptorVisibility;
import kotlin.reflect.jvm.internal.impl.descriptors.PackageFragmentDescriptor;
import kotlin.reflect.jvm.internal.impl.descriptors.Visibility;
import kotlin.reflect.jvm.internal.impl.descriptors.java.JavaVisibilities;
import kotlin.reflect.jvm.internal.impl.resolve.DescriptorUtils;
import kotlin.reflect.jvm.internal.impl.resolve.scopes.receivers.ReceiverValue;
import org.jetbrains.annotations.NotNull;

/* loaded from: classes6.dex */
public class JavaDescriptorVisibilities {
    @NotNull
    public static final DescriptorVisibility PACKAGE_VISIBILITY;
    @NotNull
    public static final DescriptorVisibility PROTECTED_AND_PACKAGE;
    @NotNull
    public static final DescriptorVisibility PROTECTED_STATIC_VISIBILITY;

    /* renamed from: a */
    public static final Map f68955a;

    /* renamed from: kotlin.reflect.jvm.internal.impl.load.java.JavaDescriptorVisibilities$a */
    /* loaded from: classes6.dex */
    public static class C11789a extends DelegatedDescriptorVisibility {
        public C11789a(Visibility visibility) {
            super(visibility);
        }

        /* renamed from: a */
        private static /* synthetic */ void m28415a(int i) {
            Object[] objArr = new Object[3];
            if (i != 1) {
                objArr[0] = "what";
            } else {
                objArr[0] = "from";
            }
            objArr[1] = "kotlin/reflect/jvm/internal/impl/load/java/JavaDescriptorVisibilities$1";
            objArr[2] = "isVisible";
            throw new IllegalArgumentException(String.format("Argument for @NotNull parameter '%s' of %s.%s must not be null", objArr));
        }

        @Override // kotlin.reflect.jvm.internal.impl.descriptors.DescriptorVisibility
        public boolean isVisible(ReceiverValue receiverValue, DeclarationDescriptorWithVisibility declarationDescriptorWithVisibility, DeclarationDescriptor declarationDescriptor, boolean z) {
            if (declarationDescriptorWithVisibility == null) {
                m28415a(0);
            }
            if (declarationDescriptor == null) {
                m28415a(1);
            }
            return JavaDescriptorVisibilities.m28418d(declarationDescriptorWithVisibility, declarationDescriptor);
        }
    }

    /* renamed from: kotlin.reflect.jvm.internal.impl.load.java.JavaDescriptorVisibilities$b */
    /* loaded from: classes6.dex */
    public static class C11790b extends DelegatedDescriptorVisibility {
        public C11790b(Visibility visibility) {
            super(visibility);
        }

        /* renamed from: a */
        private static /* synthetic */ void m28414a(int i) {
            Object[] objArr = new Object[3];
            if (i != 1) {
                objArr[0] = "what";
            } else {
                objArr[0] = "from";
            }
            objArr[1] = "kotlin/reflect/jvm/internal/impl/load/java/JavaDescriptorVisibilities$2";
            objArr[2] = "isVisible";
            throw new IllegalArgumentException(String.format("Argument for @NotNull parameter '%s' of %s.%s must not be null", objArr));
        }

        @Override // kotlin.reflect.jvm.internal.impl.descriptors.DescriptorVisibility
        public boolean isVisible(ReceiverValue receiverValue, DeclarationDescriptorWithVisibility declarationDescriptorWithVisibility, DeclarationDescriptor declarationDescriptor, boolean z) {
            if (declarationDescriptorWithVisibility == null) {
                m28414a(0);
            }
            if (declarationDescriptor == null) {
                m28414a(1);
            }
            return JavaDescriptorVisibilities.m28417e(receiverValue, declarationDescriptorWithVisibility, declarationDescriptor);
        }
    }

    /* renamed from: kotlin.reflect.jvm.internal.impl.load.java.JavaDescriptorVisibilities$c */
    /* loaded from: classes6.dex */
    public static class C11791c extends DelegatedDescriptorVisibility {
        public C11791c(Visibility visibility) {
            super(visibility);
        }

        /* renamed from: a */
        private static /* synthetic */ void m28413a(int i) {
            Object[] objArr = new Object[3];
            if (i != 1) {
                objArr[0] = "what";
            } else {
                objArr[0] = "from";
            }
            objArr[1] = "kotlin/reflect/jvm/internal/impl/load/java/JavaDescriptorVisibilities$3";
            objArr[2] = "isVisible";
            throw new IllegalArgumentException(String.format("Argument for @NotNull parameter '%s' of %s.%s must not be null", objArr));
        }

        @Override // kotlin.reflect.jvm.internal.impl.descriptors.DescriptorVisibility
        public boolean isVisible(ReceiverValue receiverValue, DeclarationDescriptorWithVisibility declarationDescriptorWithVisibility, DeclarationDescriptor declarationDescriptor, boolean z) {
            if (declarationDescriptorWithVisibility == null) {
                m28413a(0);
            }
            if (declarationDescriptor == null) {
                m28413a(1);
            }
            return JavaDescriptorVisibilities.m28417e(receiverValue, declarationDescriptorWithVisibility, declarationDescriptor);
        }
    }

    static {
        C11789a c11789a = new C11789a(JavaVisibilities.PackageVisibility.INSTANCE);
        PACKAGE_VISIBILITY = c11789a;
        C11790b c11790b = new C11790b(JavaVisibilities.ProtectedStaticVisibility.INSTANCE);
        PROTECTED_STATIC_VISIBILITY = c11790b;
        C11791c c11791c = new C11791c(JavaVisibilities.ProtectedAndPackage.INSTANCE);
        PROTECTED_AND_PACKAGE = c11791c;
        f68955a = new HashMap();
        m28416f(c11789a);
        m28416f(c11790b);
        m28416f(c11791c);
    }

    /* renamed from: a */
    public static /* synthetic */ void m28421a(int i) {
        String str = (i == 5 || i == 6) ? "@NotNull method %s.%s must not return null" : "Argument for @NotNull parameter '%s' of %s.%s must not be null";
        Object[] objArr = new Object[(i == 5 || i == 6) ? 2 : 3];
        switch (i) {
            case 1:
                objArr[0] = "from";
                break;
            case 2:
                objArr[0] = "first";
                break;
            case 3:
                objArr[0] = "second";
                break;
            case 4:
                objArr[0] = "visibility";
                break;
            case 5:
            case 6:
                objArr[0] = "kotlin/reflect/jvm/internal/impl/load/java/JavaDescriptorVisibilities";
                break;
            default:
                objArr[0] = "what";
                break;
        }
        if (i == 5 || i == 6) {
            objArr[1] = "toDescriptorVisibility";
        } else {
            objArr[1] = "kotlin/reflect/jvm/internal/impl/load/java/JavaDescriptorVisibilities";
        }
        if (i == 2 || i == 3) {
            objArr[2] = "areInSamePackage";
        } else if (i == 4) {
            objArr[2] = "toDescriptorVisibility";
        } else if (i != 5 && i != 6) {
            objArr[2] = "isVisibleForProtectedAndPackage";
        }
        String format = String.format(str, objArr);
        if (i != 5 && i != 6) {
            throw new IllegalArgumentException(format);
        }
        throw new IllegalStateException(format);
    }

    /* renamed from: d */
    public static boolean m28418d(DeclarationDescriptor declarationDescriptor, DeclarationDescriptor declarationDescriptor2) {
        if (declarationDescriptor == null) {
            m28421a(2);
        }
        if (declarationDescriptor2 == null) {
            m28421a(3);
        }
        PackageFragmentDescriptor packageFragmentDescriptor = (PackageFragmentDescriptor) DescriptorUtils.getParentOfType(declarationDescriptor, PackageFragmentDescriptor.class, false);
        PackageFragmentDescriptor packageFragmentDescriptor2 = (PackageFragmentDescriptor) DescriptorUtils.getParentOfType(declarationDescriptor2, PackageFragmentDescriptor.class, false);
        if (packageFragmentDescriptor2 == null || packageFragmentDescriptor == null || !packageFragmentDescriptor.getFqName().equals(packageFragmentDescriptor2.getFqName())) {
            return false;
        }
        return true;
    }

    /* renamed from: e */
    public static boolean m28417e(ReceiverValue receiverValue, DeclarationDescriptorWithVisibility declarationDescriptorWithVisibility, DeclarationDescriptor declarationDescriptor) {
        if (declarationDescriptorWithVisibility == null) {
            m28421a(0);
        }
        if (declarationDescriptor == null) {
            m28421a(1);
        }
        if (m28418d(DescriptorUtils.unwrapFakeOverrideToAnyDeclaration(declarationDescriptorWithVisibility), declarationDescriptor)) {
            return true;
        }
        return DescriptorVisibilities.PROTECTED.isVisible(receiverValue, declarationDescriptorWithVisibility, declarationDescriptor, false);
    }

    /* renamed from: f */
    public static void m28416f(DescriptorVisibility descriptorVisibility) {
        f68955a.put(descriptorVisibility.getDelegate(), descriptorVisibility);
    }

    @NotNull
    public static DescriptorVisibility toDescriptorVisibility(@NotNull Visibility visibility) {
        if (visibility == null) {
            m28421a(4);
        }
        DescriptorVisibility descriptorVisibility = (DescriptorVisibility) f68955a.get(visibility);
        if (descriptorVisibility == null) {
            DescriptorVisibility descriptorVisibility2 = DescriptorVisibilities.toDescriptorVisibility(visibility);
            if (descriptorVisibility2 == null) {
                m28421a(5);
            }
            return descriptorVisibility2;
        }
        return descriptorVisibility;
    }
}

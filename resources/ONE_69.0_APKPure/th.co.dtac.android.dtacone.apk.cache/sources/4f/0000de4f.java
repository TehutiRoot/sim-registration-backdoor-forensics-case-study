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
    public static final Map f68989a;

    /* renamed from: kotlin.reflect.jvm.internal.impl.load.java.JavaDescriptorVisibilities$a */
    /* loaded from: classes6.dex */
    public static class C11765a extends DelegatedDescriptorVisibility {
        public C11765a(Visibility visibility) {
            super(visibility);
        }

        /* renamed from: a */
        private static /* synthetic */ void m28707a(int i) {
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
                m28707a(0);
            }
            if (declarationDescriptor == null) {
                m28707a(1);
            }
            return JavaDescriptorVisibilities.m28710d(declarationDescriptorWithVisibility, declarationDescriptor);
        }
    }

    /* renamed from: kotlin.reflect.jvm.internal.impl.load.java.JavaDescriptorVisibilities$b */
    /* loaded from: classes6.dex */
    public static class C11766b extends DelegatedDescriptorVisibility {
        public C11766b(Visibility visibility) {
            super(visibility);
        }

        /* renamed from: a */
        private static /* synthetic */ void m28706a(int i) {
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
                m28706a(0);
            }
            if (declarationDescriptor == null) {
                m28706a(1);
            }
            return JavaDescriptorVisibilities.m28709e(receiverValue, declarationDescriptorWithVisibility, declarationDescriptor);
        }
    }

    /* renamed from: kotlin.reflect.jvm.internal.impl.load.java.JavaDescriptorVisibilities$c */
    /* loaded from: classes6.dex */
    public static class C11767c extends DelegatedDescriptorVisibility {
        public C11767c(Visibility visibility) {
            super(visibility);
        }

        /* renamed from: a */
        private static /* synthetic */ void m28705a(int i) {
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
                m28705a(0);
            }
            if (declarationDescriptor == null) {
                m28705a(1);
            }
            return JavaDescriptorVisibilities.m28709e(receiverValue, declarationDescriptorWithVisibility, declarationDescriptor);
        }
    }

    static {
        C11765a c11765a = new C11765a(JavaVisibilities.PackageVisibility.INSTANCE);
        PACKAGE_VISIBILITY = c11765a;
        C11766b c11766b = new C11766b(JavaVisibilities.ProtectedStaticVisibility.INSTANCE);
        PROTECTED_STATIC_VISIBILITY = c11766b;
        C11767c c11767c = new C11767c(JavaVisibilities.ProtectedAndPackage.INSTANCE);
        PROTECTED_AND_PACKAGE = c11767c;
        f68989a = new HashMap();
        m28708f(c11765a);
        m28708f(c11766b);
        m28708f(c11767c);
    }

    /* renamed from: a */
    public static /* synthetic */ void m28713a(int i) {
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
    public static boolean m28710d(DeclarationDescriptor declarationDescriptor, DeclarationDescriptor declarationDescriptor2) {
        if (declarationDescriptor == null) {
            m28713a(2);
        }
        if (declarationDescriptor2 == null) {
            m28713a(3);
        }
        PackageFragmentDescriptor packageFragmentDescriptor = (PackageFragmentDescriptor) DescriptorUtils.getParentOfType(declarationDescriptor, PackageFragmentDescriptor.class, false);
        PackageFragmentDescriptor packageFragmentDescriptor2 = (PackageFragmentDescriptor) DescriptorUtils.getParentOfType(declarationDescriptor2, PackageFragmentDescriptor.class, false);
        if (packageFragmentDescriptor2 == null || packageFragmentDescriptor == null || !packageFragmentDescriptor.getFqName().equals(packageFragmentDescriptor2.getFqName())) {
            return false;
        }
        return true;
    }

    /* renamed from: e */
    public static boolean m28709e(ReceiverValue receiverValue, DeclarationDescriptorWithVisibility declarationDescriptorWithVisibility, DeclarationDescriptor declarationDescriptor) {
        if (declarationDescriptorWithVisibility == null) {
            m28713a(0);
        }
        if (declarationDescriptor == null) {
            m28713a(1);
        }
        if (m28710d(DescriptorUtils.unwrapFakeOverrideToAnyDeclaration(declarationDescriptorWithVisibility), declarationDescriptor)) {
            return true;
        }
        return DescriptorVisibilities.PROTECTED.isVisible(receiverValue, declarationDescriptorWithVisibility, declarationDescriptor, false);
    }

    /* renamed from: f */
    public static void m28708f(DescriptorVisibility descriptorVisibility) {
        f68989a.put(descriptorVisibility.getDelegate(), descriptorVisibility);
    }

    @NotNull
    public static DescriptorVisibility toDescriptorVisibility(@NotNull Visibility visibility) {
        if (visibility == null) {
            m28713a(4);
        }
        DescriptorVisibility descriptorVisibility = (DescriptorVisibility) f68989a.get(visibility);
        if (descriptorVisibility == null) {
            DescriptorVisibility descriptorVisibility2 = DescriptorVisibilities.toDescriptorVisibility(visibility);
            if (descriptorVisibility2 == null) {
                m28713a(5);
            }
            return descriptorVisibility2;
        }
        return descriptorVisibility;
    }
}
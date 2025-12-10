package kotlin.reflect.jvm.internal.impl.load.java.components;

import java.util.Collection;
import java.util.LinkedHashSet;
import java.util.Set;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.reflect.jvm.internal.impl.descriptors.CallableMemberDescriptor;
import kotlin.reflect.jvm.internal.impl.descriptors.ClassConstructorDescriptor;
import kotlin.reflect.jvm.internal.impl.descriptors.ClassDescriptor;
import kotlin.reflect.jvm.internal.impl.descriptors.ValueParameterDescriptor;
import kotlin.reflect.jvm.internal.impl.name.Name;
import kotlin.reflect.jvm.internal.impl.resolve.NonReportingOverrideStrategy;
import kotlin.reflect.jvm.internal.impl.resolve.OverridingUtil;
import kotlin.reflect.jvm.internal.impl.serialization.deserialization.ErrorReporter;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* loaded from: classes6.dex */
public final class DescriptorResolverUtils {

    /* renamed from: kotlin.reflect.jvm.internal.impl.load.java.components.DescriptorResolverUtils$a */
    /* loaded from: classes6.dex */
    public static class C11792a extends NonReportingOverrideStrategy {

        /* renamed from: a */
        public final /* synthetic */ ErrorReporter f69017a;

        /* renamed from: b */
        public final /* synthetic */ Set f69018b;

        /* renamed from: c */
        public final /* synthetic */ boolean f69019c;

        /* renamed from: kotlin.reflect.jvm.internal.impl.load.java.components.DescriptorResolverUtils$a$a */
        /* loaded from: classes6.dex */
        public class C11793a implements Function1 {
            public C11793a() {
            }

            /* renamed from: a */
            private static /* synthetic */ void m28402a(int i) {
                throw new IllegalArgumentException(String.format("Argument for @NotNull parameter '%s' of %s.%s must not be null", "descriptor", "kotlin/reflect/jvm/internal/impl/load/java/components/DescriptorResolverUtils$1$1", "invoke"));
            }

            @Override // kotlin.jvm.functions.Function1
            /* renamed from: b */
            public Unit invoke(CallableMemberDescriptor callableMemberDescriptor) {
                if (callableMemberDescriptor == null) {
                    m28402a(0);
                }
                C11792a.this.f69017a.reportCannotInferVisibility(callableMemberDescriptor);
                return Unit.INSTANCE;
            }
        }

        public C11792a(ErrorReporter errorReporter, Set set, boolean z) {
            this.f69017a = errorReporter;
            this.f69018b = set;
            this.f69019c = z;
        }

        /* renamed from: a */
        private static /* synthetic */ void m28403a(int i) {
            Object[] objArr = new Object[3];
            if (i == 1) {
                objArr[0] = "fromSuper";
            } else if (i == 2) {
                objArr[0] = "fromCurrent";
            } else if (i == 3) {
                objArr[0] = "member";
            } else if (i != 4) {
                objArr[0] = "fakeOverride";
            } else {
                objArr[0] = "overridden";
            }
            objArr[1] = "kotlin/reflect/jvm/internal/impl/load/java/components/DescriptorResolverUtils$1";
            if (i == 1 || i == 2) {
                objArr[2] = "conflict";
            } else if (i == 3 || i == 4) {
                objArr[2] = "setOverriddenDescriptors";
            } else {
                objArr[2] = "addFakeOverride";
            }
            throw new IllegalArgumentException(String.format("Argument for @NotNull parameter '%s' of %s.%s must not be null", objArr));
        }

        @Override // kotlin.reflect.jvm.internal.impl.resolve.OverridingStrategy
        public void addFakeOverride(CallableMemberDescriptor callableMemberDescriptor) {
            if (callableMemberDescriptor == null) {
                m28403a(0);
            }
            OverridingUtil.resolveUnknownVisibilityForMember(callableMemberDescriptor, new C11793a());
            this.f69018b.add(callableMemberDescriptor);
        }

        @Override // kotlin.reflect.jvm.internal.impl.resolve.NonReportingOverrideStrategy
        public void conflict(CallableMemberDescriptor callableMemberDescriptor, CallableMemberDescriptor callableMemberDescriptor2) {
            if (callableMemberDescriptor == null) {
                m28403a(1);
            }
            if (callableMemberDescriptor2 == null) {
                m28403a(2);
            }
        }

        @Override // kotlin.reflect.jvm.internal.impl.resolve.OverridingStrategy
        public void setOverriddenDescriptors(CallableMemberDescriptor callableMemberDescriptor, Collection collection) {
            if (callableMemberDescriptor == null) {
                m28403a(3);
            }
            if (collection == null) {
                m28403a(4);
            }
            if (this.f69019c && callableMemberDescriptor.getKind() != CallableMemberDescriptor.Kind.FAKE_OVERRIDE) {
                return;
            }
            super.setOverriddenDescriptors(callableMemberDescriptor, collection);
        }
    }

    /* renamed from: a */
    public static /* synthetic */ void m28405a(int i) {
        String str = i != 18 ? "Argument for @NotNull parameter '%s' of %s.%s must not be null" : "@NotNull method %s.%s must not return null";
        Object[] objArr = new Object[i != 18 ? 3 : 2];
        switch (i) {
            case 1:
            case 7:
            case 13:
                objArr[0] = "membersFromSupertypes";
                break;
            case 2:
            case 8:
            case 14:
                objArr[0] = "membersFromCurrent";
                break;
            case 3:
            case 9:
            case 15:
                objArr[0] = "classDescriptor";
                break;
            case 4:
            case 10:
            case 16:
                objArr[0] = "errorReporter";
                break;
            case 5:
            case 11:
            case 17:
                objArr[0] = "overridingUtil";
                break;
            case 6:
            case 12:
            case 19:
            default:
                objArr[0] = "name";
                break;
            case 18:
                objArr[0] = "kotlin/reflect/jvm/internal/impl/load/java/components/DescriptorResolverUtils";
                break;
            case 20:
                objArr[0] = "annotationClass";
                break;
        }
        if (i != 18) {
            objArr[1] = "kotlin/reflect/jvm/internal/impl/load/java/components/DescriptorResolverUtils";
        } else {
            objArr[1] = "resolveOverrides";
        }
        switch (i) {
            case 6:
            case 7:
            case 8:
            case 9:
            case 10:
            case 11:
                objArr[2] = "resolveOverridesForStaticMembers";
                break;
            case 12:
            case 13:
            case 14:
            case 15:
            case 16:
            case 17:
                objArr[2] = "resolveOverrides";
                break;
            case 18:
                break;
            case 19:
            case 20:
                objArr[2] = "getAnnotationParameterByName";
                break;
            default:
                objArr[2] = "resolveOverridesForNonStaticMembers";
                break;
        }
        String format = String.format(str, objArr);
        if (i == 18) {
            throw new IllegalStateException(format);
        }
    }

    /* renamed from: b */
    public static Collection m28404b(Name name, Collection collection, Collection collection2, ClassDescriptor classDescriptor, ErrorReporter errorReporter, OverridingUtil overridingUtil, boolean z) {
        if (name == null) {
            m28405a(12);
        }
        if (collection == null) {
            m28405a(13);
        }
        if (collection2 == null) {
            m28405a(14);
        }
        if (classDescriptor == null) {
            m28405a(15);
        }
        if (errorReporter == null) {
            m28405a(16);
        }
        if (overridingUtil == null) {
            m28405a(17);
        }
        LinkedHashSet linkedHashSet = new LinkedHashSet();
        overridingUtil.generateOverridesInFunctionGroup(name, collection, collection2, classDescriptor, new C11792a(errorReporter, linkedHashSet, z));
        return linkedHashSet;
    }

    @Nullable
    public static ValueParameterDescriptor getAnnotationParameterByName(@NotNull Name name, @NotNull ClassDescriptor classDescriptor) {
        if (name == null) {
            m28405a(19);
        }
        if (classDescriptor == null) {
            m28405a(20);
        }
        Collection<ClassConstructorDescriptor> constructors = classDescriptor.getConstructors();
        if (constructors.size() != 1) {
            return null;
        }
        for (ValueParameterDescriptor valueParameterDescriptor : constructors.iterator().next().getValueParameters()) {
            if (valueParameterDescriptor.getName().equals(name)) {
                return valueParameterDescriptor;
            }
        }
        return null;
    }

    @NotNull
    public static <D extends CallableMemberDescriptor> Collection<D> resolveOverridesForNonStaticMembers(@NotNull Name name, @NotNull Collection<D> collection, @NotNull Collection<D> collection2, @NotNull ClassDescriptor classDescriptor, @NotNull ErrorReporter errorReporter, @NotNull OverridingUtil overridingUtil) {
        if (name == null) {
            m28405a(0);
        }
        if (collection == null) {
            m28405a(1);
        }
        if (collection2 == null) {
            m28405a(2);
        }
        if (classDescriptor == null) {
            m28405a(3);
        }
        if (errorReporter == null) {
            m28405a(4);
        }
        if (overridingUtil == null) {
            m28405a(5);
        }
        return m28404b(name, collection, collection2, classDescriptor, errorReporter, overridingUtil, false);
    }

    @NotNull
    public static <D extends CallableMemberDescriptor> Collection<D> resolveOverridesForStaticMembers(@NotNull Name name, @NotNull Collection<D> collection, @NotNull Collection<D> collection2, @NotNull ClassDescriptor classDescriptor, @NotNull ErrorReporter errorReporter, @NotNull OverridingUtil overridingUtil) {
        if (name == null) {
            m28405a(6);
        }
        if (collection == null) {
            m28405a(7);
        }
        if (collection2 == null) {
            m28405a(8);
        }
        if (classDescriptor == null) {
            m28405a(9);
        }
        if (errorReporter == null) {
            m28405a(10);
        }
        if (overridingUtil == null) {
            m28405a(11);
        }
        return m28404b(name, collection, collection2, classDescriptor, errorReporter, overridingUtil, true);
    }
}

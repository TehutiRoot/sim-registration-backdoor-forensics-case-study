package kotlin.reflect.jvm.internal.impl.resolve;

import java.util.Comparator;
import java.util.List;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.reflect.jvm.internal.impl.descriptors.CallableDescriptor;
import kotlin.reflect.jvm.internal.impl.descriptors.CallableMemberDescriptor;
import kotlin.reflect.jvm.internal.impl.descriptors.ClassDescriptor;
import kotlin.reflect.jvm.internal.impl.descriptors.ConstructorDescriptor;
import kotlin.reflect.jvm.internal.impl.descriptors.DeclarationDescriptor;
import kotlin.reflect.jvm.internal.impl.descriptors.FunctionDescriptor;
import kotlin.reflect.jvm.internal.impl.descriptors.PropertyDescriptor;
import kotlin.reflect.jvm.internal.impl.descriptors.ReceiverParameterDescriptor;
import kotlin.reflect.jvm.internal.impl.descriptors.TypeAliasDescriptor;
import kotlin.reflect.jvm.internal.impl.descriptors.TypeParameterDescriptor;
import kotlin.reflect.jvm.internal.impl.descriptors.ValueParameterDescriptor;
import kotlin.reflect.jvm.internal.impl.renderer.AnnotationArgumentsRenderingPolicy;
import kotlin.reflect.jvm.internal.impl.renderer.DescriptorRenderer;
import kotlin.reflect.jvm.internal.impl.renderer.DescriptorRendererModifier;
import kotlin.reflect.jvm.internal.impl.renderer.DescriptorRendererOptions;
import kotlin.reflect.jvm.internal.impl.types.KotlinType;

/* loaded from: classes6.dex */
public class MemberComparator implements Comparator<DeclarationDescriptor> {
    public static final MemberComparator INSTANCE = new MemberComparator();

    /* renamed from: a */
    public static final DescriptorRenderer f69903a = DescriptorRenderer.Companion.withOptions(new C11918a());

    /* loaded from: classes6.dex */
    public static class NameAndTypeMemberComparator implements Comparator<DeclarationDescriptor> {
        public static final NameAndTypeMemberComparator INSTANCE = new NameAndTypeMemberComparator();

        /* renamed from: b */
        public static Integer m28083b(DeclarationDescriptor declarationDescriptor, DeclarationDescriptor declarationDescriptor2) {
            int m28082c = m28082c(declarationDescriptor2) - m28082c(declarationDescriptor);
            if (m28082c != 0) {
                return Integer.valueOf(m28082c);
            }
            if (DescriptorUtils.isEnumEntry(declarationDescriptor) && DescriptorUtils.isEnumEntry(declarationDescriptor2)) {
                return 0;
            }
            int compareTo = declarationDescriptor.getName().compareTo(declarationDescriptor2.getName());
            if (compareTo != 0) {
                return Integer.valueOf(compareTo);
            }
            return null;
        }

        /* renamed from: c */
        public static int m28082c(DeclarationDescriptor declarationDescriptor) {
            if (DescriptorUtils.isEnumEntry(declarationDescriptor)) {
                return 8;
            }
            if (declarationDescriptor instanceof ConstructorDescriptor) {
                return 7;
            }
            if (declarationDescriptor instanceof PropertyDescriptor) {
                if (((PropertyDescriptor) declarationDescriptor).getExtensionReceiverParameter() == null) {
                    return 6;
                }
                return 5;
            } else if (declarationDescriptor instanceof FunctionDescriptor) {
                if (((FunctionDescriptor) declarationDescriptor).getExtensionReceiverParameter() == null) {
                    return 4;
                }
                return 3;
            } else if (declarationDescriptor instanceof ClassDescriptor) {
                return 2;
            } else {
                if (declarationDescriptor instanceof TypeAliasDescriptor) {
                    return 1;
                }
                return 0;
            }
        }

        @Override // java.util.Comparator
        public int compare(DeclarationDescriptor declarationDescriptor, DeclarationDescriptor declarationDescriptor2) {
            Integer m28083b = m28083b(declarationDescriptor, declarationDescriptor2);
            if (m28083b != null) {
                return m28083b.intValue();
            }
            return 0;
        }
    }

    /* renamed from: kotlin.reflect.jvm.internal.impl.resolve.MemberComparator$a */
    /* loaded from: classes6.dex */
    public static class C11918a implements Function1 {
        @Override // kotlin.jvm.functions.Function1
        /* renamed from: a */
        public Unit invoke(DescriptorRendererOptions descriptorRendererOptions) {
            descriptorRendererOptions.setWithDefinedIn(false);
            descriptorRendererOptions.setVerbose(true);
            descriptorRendererOptions.setAnnotationArgumentsRenderingPolicy(AnnotationArgumentsRenderingPolicy.UNLESS_EMPTY);
            descriptorRendererOptions.setModifiers(DescriptorRendererModifier.ALL);
            return Unit.INSTANCE;
        }
    }

    @Override // java.util.Comparator
    public int compare(DeclarationDescriptor declarationDescriptor, DeclarationDescriptor declarationDescriptor2) {
        int ordinal;
        Integer m28083b = NameAndTypeMemberComparator.m28083b(declarationDescriptor, declarationDescriptor2);
        if (m28083b != null) {
            return m28083b.intValue();
        }
        if ((declarationDescriptor instanceof TypeAliasDescriptor) && (declarationDescriptor2 instanceof TypeAliasDescriptor)) {
            DescriptorRenderer descriptorRenderer = f69903a;
            int compareTo = descriptorRenderer.renderType(((TypeAliasDescriptor) declarationDescriptor).getUnderlyingType()).compareTo(descriptorRenderer.renderType(((TypeAliasDescriptor) declarationDescriptor2).getUnderlyingType()));
            if (compareTo != 0) {
                return compareTo;
            }
        } else if ((declarationDescriptor instanceof CallableDescriptor) && (declarationDescriptor2 instanceof CallableDescriptor)) {
            CallableDescriptor callableDescriptor = (CallableDescriptor) declarationDescriptor;
            CallableDescriptor callableDescriptor2 = (CallableDescriptor) declarationDescriptor2;
            ReceiverParameterDescriptor extensionReceiverParameter = callableDescriptor.getExtensionReceiverParameter();
            ReceiverParameterDescriptor extensionReceiverParameter2 = callableDescriptor2.getExtensionReceiverParameter();
            if (extensionReceiverParameter != null) {
                DescriptorRenderer descriptorRenderer2 = f69903a;
                int compareTo2 = descriptorRenderer2.renderType(extensionReceiverParameter.getType()).compareTo(descriptorRenderer2.renderType(extensionReceiverParameter2.getType()));
                if (compareTo2 != 0) {
                    return compareTo2;
                }
            }
            List<ValueParameterDescriptor> valueParameters = callableDescriptor.getValueParameters();
            List<ValueParameterDescriptor> valueParameters2 = callableDescriptor2.getValueParameters();
            for (int i = 0; i < Math.min(valueParameters.size(), valueParameters2.size()); i++) {
                DescriptorRenderer descriptorRenderer3 = f69903a;
                int compareTo3 = descriptorRenderer3.renderType(valueParameters.get(i).getType()).compareTo(descriptorRenderer3.renderType(valueParameters2.get(i).getType()));
                if (compareTo3 != 0) {
                    return compareTo3;
                }
            }
            int size = valueParameters.size() - valueParameters2.size();
            if (size != 0) {
                return size;
            }
            List<TypeParameterDescriptor> typeParameters = callableDescriptor.getTypeParameters();
            List<TypeParameterDescriptor> typeParameters2 = callableDescriptor2.getTypeParameters();
            for (int i2 = 0; i2 < Math.min(typeParameters.size(), typeParameters2.size()); i2++) {
                List<KotlinType> upperBounds = typeParameters.get(i2).getUpperBounds();
                List<KotlinType> upperBounds2 = typeParameters2.get(i2).getUpperBounds();
                int size2 = upperBounds.size() - upperBounds2.size();
                if (size2 != 0) {
                    return size2;
                }
                for (int i3 = 0; i3 < upperBounds.size(); i3++) {
                    DescriptorRenderer descriptorRenderer4 = f69903a;
                    int compareTo4 = descriptorRenderer4.renderType(upperBounds.get(i3)).compareTo(descriptorRenderer4.renderType(upperBounds2.get(i3)));
                    if (compareTo4 != 0) {
                        return compareTo4;
                    }
                }
            }
            int size3 = typeParameters.size() - typeParameters2.size();
            if (size3 != 0) {
                return size3;
            }
            if ((callableDescriptor instanceof CallableMemberDescriptor) && (callableDescriptor2 instanceof CallableMemberDescriptor) && (ordinal = ((CallableMemberDescriptor) callableDescriptor).getKind().ordinal() - ((CallableMemberDescriptor) callableDescriptor2).getKind().ordinal()) != 0) {
                return ordinal;
            }
        } else if ((declarationDescriptor instanceof ClassDescriptor) && (declarationDescriptor2 instanceof ClassDescriptor)) {
            ClassDescriptor classDescriptor = (ClassDescriptor) declarationDescriptor;
            ClassDescriptor classDescriptor2 = (ClassDescriptor) declarationDescriptor2;
            if (classDescriptor.getKind().ordinal() != classDescriptor2.getKind().ordinal()) {
                return classDescriptor.getKind().ordinal() - classDescriptor2.getKind().ordinal();
            }
            if (classDescriptor.isCompanionObject() != classDescriptor2.isCompanionObject()) {
                return classDescriptor.isCompanionObject() ? 1 : -1;
            }
        } else {
            throw new AssertionError(String.format("Unsupported pair of descriptors:\n'%s' Class: %s\n%s' Class: %s", declarationDescriptor, declarationDescriptor.getClass(), declarationDescriptor2, declarationDescriptor2.getClass()));
        }
        DescriptorRenderer descriptorRenderer5 = f69903a;
        int compareTo5 = descriptorRenderer5.render(declarationDescriptor).compareTo(descriptorRenderer5.render(declarationDescriptor2));
        return compareTo5 != 0 ? compareTo5 : DescriptorUtils.getContainingModule(declarationDescriptor).getName().compareTo(DescriptorUtils.getContainingModule(declarationDescriptor2).getName());
    }
}
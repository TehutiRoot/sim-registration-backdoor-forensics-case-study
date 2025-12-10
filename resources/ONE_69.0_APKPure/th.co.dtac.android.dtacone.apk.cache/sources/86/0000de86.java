package kotlin.reflect.jvm.internal.impl.load.java.components;

import com.google.firebase.analytics.FirebaseAnalytics;
import java.util.Collections;
import java.util.List;
import kotlin.reflect.jvm.internal.impl.descriptors.CallableMemberDescriptor;
import kotlin.reflect.jvm.internal.impl.descriptors.ClassDescriptor;
import kotlin.reflect.jvm.internal.impl.descriptors.TypeParameterDescriptor;
import kotlin.reflect.jvm.internal.impl.descriptors.ValueParameterDescriptor;
import kotlin.reflect.jvm.internal.impl.load.java.structure.JavaMethod;
import kotlin.reflect.jvm.internal.impl.types.KotlinType;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import th.p047co.dtac.android.dtacone.util.Constant;

/* loaded from: classes6.dex */
public interface SignaturePropagator {
    public static final SignaturePropagator DO_NOTHING = new C11771a();

    /* loaded from: classes6.dex */
    public static class PropagatedSignature {

        /* renamed from: a */
        public final KotlinType f69074a;

        /* renamed from: b */
        public final KotlinType f69075b;

        /* renamed from: c */
        public final List f69076c;

        /* renamed from: d */
        public final List f69077d;

        /* renamed from: e */
        public final List f69078e;

        /* renamed from: f */
        public final boolean f69079f;

        public PropagatedSignature(@NotNull KotlinType kotlinType, @Nullable KotlinType kotlinType2, @NotNull List<ValueParameterDescriptor> list, @NotNull List<TypeParameterDescriptor> list2, @NotNull List<String> list3, boolean z) {
            if (kotlinType == null) {
                m28691a(0);
            }
            if (list == null) {
                m28691a(1);
            }
            if (list2 == null) {
                m28691a(2);
            }
            if (list3 == null) {
                m28691a(3);
            }
            this.f69074a = kotlinType;
            this.f69075b = kotlinType2;
            this.f69076c = list;
            this.f69077d = list2;
            this.f69078e = list3;
            this.f69079f = z;
        }

        /* renamed from: a */
        public static /* synthetic */ void m28691a(int i) {
            String str = (i == 4 || i == 5 || i == 6 || i == 7) ? "@NotNull method %s.%s must not return null" : "Argument for @NotNull parameter '%s' of %s.%s must not be null";
            Object[] objArr = new Object[(i == 4 || i == 5 || i == 6 || i == 7) ? 2 : 3];
            switch (i) {
                case 1:
                    objArr[0] = "valueParameters";
                    break;
                case 2:
                    objArr[0] = "typeParameters";
                    break;
                case 3:
                    objArr[0] = "signatureErrors";
                    break;
                case 4:
                case 5:
                case 6:
                case 7:
                    objArr[0] = "kotlin/reflect/jvm/internal/impl/load/java/components/SignaturePropagator$PropagatedSignature";
                    break;
                default:
                    objArr[0] = "returnType";
                    break;
            }
            if (i == 4) {
                objArr[1] = "getReturnType";
            } else if (i == 5) {
                objArr[1] = "getValueParameters";
            } else if (i == 6) {
                objArr[1] = "getTypeParameters";
            } else if (i != 7) {
                objArr[1] = "kotlin/reflect/jvm/internal/impl/load/java/components/SignaturePropagator$PropagatedSignature";
            } else {
                objArr[1] = "getErrors";
            }
            if (i != 4 && i != 5 && i != 6 && i != 7) {
                objArr[2] = "<init>";
            }
            String format = String.format(str, objArr);
            if (i != 4 && i != 5 && i != 6 && i != 7) {
                throw new IllegalArgumentException(format);
            }
            throw new IllegalStateException(format);
        }

        @NotNull
        public List<String> getErrors() {
            List<String> list = this.f69078e;
            if (list == null) {
                m28691a(7);
            }
            return list;
        }

        @Nullable
        public KotlinType getReceiverType() {
            return this.f69075b;
        }

        @NotNull
        public KotlinType getReturnType() {
            KotlinType kotlinType = this.f69074a;
            if (kotlinType == null) {
                m28691a(4);
            }
            return kotlinType;
        }

        @NotNull
        public List<TypeParameterDescriptor> getTypeParameters() {
            List<TypeParameterDescriptor> list = this.f69077d;
            if (list == null) {
                m28691a(6);
            }
            return list;
        }

        @NotNull
        public List<ValueParameterDescriptor> getValueParameters() {
            List<ValueParameterDescriptor> list = this.f69076c;
            if (list == null) {
                m28691a(5);
            }
            return list;
        }

        public boolean hasStableParameterNames() {
            return this.f69079f;
        }
    }

    /* renamed from: kotlin.reflect.jvm.internal.impl.load.java.components.SignaturePropagator$a */
    /* loaded from: classes6.dex */
    public static class C11771a implements SignaturePropagator {
        /* renamed from: a */
        public static /* synthetic */ void m28690a(int i) {
            Object[] objArr = new Object[3];
            switch (i) {
                case 1:
                    objArr[0] = Constant.REGISTER_LEVEL_OWNER;
                    break;
                case 2:
                    objArr[0] = "returnType";
                    break;
                case 3:
                    objArr[0] = "valueParameters";
                    break;
                case 4:
                    objArr[0] = "typeParameters";
                    break;
                case 5:
                    objArr[0] = "descriptor";
                    break;
                case 6:
                    objArr[0] = "signatureErrors";
                    break;
                default:
                    objArr[0] = FirebaseAnalytics.Param.METHOD;
                    break;
            }
            objArr[1] = "kotlin/reflect/jvm/internal/impl/load/java/components/SignaturePropagator$1";
            if (i == 5 || i == 6) {
                objArr[2] = "reportSignatureErrors";
            } else {
                objArr[2] = "resolvePropagatedSignature";
            }
            throw new IllegalArgumentException(String.format("Argument for @NotNull parameter '%s' of %s.%s must not be null", objArr));
        }

        @Override // kotlin.reflect.jvm.internal.impl.load.java.components.SignaturePropagator
        public void reportSignatureErrors(CallableMemberDescriptor callableMemberDescriptor, List list) {
            if (callableMemberDescriptor == null) {
                m28690a(5);
            }
            if (list == null) {
                m28690a(6);
            }
            throw new UnsupportedOperationException("Should not be called");
        }

        @Override // kotlin.reflect.jvm.internal.impl.load.java.components.SignaturePropagator
        public PropagatedSignature resolvePropagatedSignature(JavaMethod javaMethod, ClassDescriptor classDescriptor, KotlinType kotlinType, KotlinType kotlinType2, List list, List list2) {
            if (javaMethod == null) {
                m28690a(0);
            }
            if (classDescriptor == null) {
                m28690a(1);
            }
            if (kotlinType == null) {
                m28690a(2);
            }
            if (list == null) {
                m28690a(3);
            }
            if (list2 == null) {
                m28690a(4);
            }
            return new PropagatedSignature(kotlinType, kotlinType2, list, list2, Collections.emptyList(), false);
        }
    }

    void reportSignatureErrors(@NotNull CallableMemberDescriptor callableMemberDescriptor, @NotNull List<String> list);

    @NotNull
    PropagatedSignature resolvePropagatedSignature(@NotNull JavaMethod javaMethod, @NotNull ClassDescriptor classDescriptor, @NotNull KotlinType kotlinType, @Nullable KotlinType kotlinType2, @NotNull List<ValueParameterDescriptor> list, @NotNull List<TypeParameterDescriptor> list2);
}
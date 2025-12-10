package p000;

import ch.qos.logback.core.CoreConstants;
import java.util.List;
import kotlin.jvm.internal.Intrinsics;
import kotlin.reflect.KClass;
import kotlin.text.Typography;
import kotlinx.serialization.descriptors.SerialDescriptor;
import kotlinx.serialization.descriptors.SerialKind;

/* renamed from: ey */
/* loaded from: classes6.dex */
public final class C10191ey implements SerialDescriptor {

    /* renamed from: a */
    public final SerialDescriptor f61667a;

    /* renamed from: b */
    public final KClass f61668b;

    /* renamed from: c */
    public final String f61669c;

    public C10191ey(SerialDescriptor original, KClass kClass) {
        Intrinsics.checkNotNullParameter(original, "original");
        Intrinsics.checkNotNullParameter(kClass, "kClass");
        this.f61667a = original;
        this.f61668b = kClass;
        this.f61669c = original.getSerialName() + Typography.less + kClass.getSimpleName() + Typography.greater;
    }

    public boolean equals(Object obj) {
        C10191ey c10191ey;
        if (obj instanceof C10191ey) {
            c10191ey = (C10191ey) obj;
        } else {
            c10191ey = null;
        }
        if (c10191ey == null || !Intrinsics.areEqual(this.f61667a, c10191ey.f61667a) || !Intrinsics.areEqual(c10191ey.f61668b, this.f61668b)) {
            return false;
        }
        return true;
    }

    @Override // kotlinx.serialization.descriptors.SerialDescriptor
    public List getAnnotations() {
        return this.f61667a.getAnnotations();
    }

    @Override // kotlinx.serialization.descriptors.SerialDescriptor
    public List getElementAnnotations(int i) {
        return this.f61667a.getElementAnnotations(i);
    }

    @Override // kotlinx.serialization.descriptors.SerialDescriptor
    public SerialDescriptor getElementDescriptor(int i) {
        return this.f61667a.getElementDescriptor(i);
    }

    @Override // kotlinx.serialization.descriptors.SerialDescriptor
    public int getElementIndex(String name) {
        Intrinsics.checkNotNullParameter(name, "name");
        return this.f61667a.getElementIndex(name);
    }

    @Override // kotlinx.serialization.descriptors.SerialDescriptor
    public String getElementName(int i) {
        return this.f61667a.getElementName(i);
    }

    @Override // kotlinx.serialization.descriptors.SerialDescriptor
    public int getElementsCount() {
        return this.f61667a.getElementsCount();
    }

    @Override // kotlinx.serialization.descriptors.SerialDescriptor
    public SerialKind getKind() {
        return this.f61667a.getKind();
    }

    @Override // kotlinx.serialization.descriptors.SerialDescriptor
    public String getSerialName() {
        return this.f61669c;
    }

    public int hashCode() {
        return (this.f61668b.hashCode() * 31) + getSerialName().hashCode();
    }

    @Override // kotlinx.serialization.descriptors.SerialDescriptor
    public boolean isElementOptional(int i) {
        return this.f61667a.isElementOptional(i);
    }

    @Override // kotlinx.serialization.descriptors.SerialDescriptor
    public boolean isInline() {
        return this.f61667a.isInline();
    }

    @Override // kotlinx.serialization.descriptors.SerialDescriptor
    public boolean isNullable() {
        return this.f61667a.isNullable();
    }

    public String toString() {
        return "ContextDescriptor(kClass: " + this.f61668b + ", original: " + this.f61667a + CoreConstants.RIGHT_PARENTHESIS_CHAR;
    }
}

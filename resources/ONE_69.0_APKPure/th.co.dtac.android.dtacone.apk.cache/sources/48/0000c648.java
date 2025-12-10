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
public final class C10186ey implements SerialDescriptor {

    /* renamed from: a */
    public final SerialDescriptor f61732a;

    /* renamed from: b */
    public final KClass f61733b;

    /* renamed from: c */
    public final String f61734c;

    public C10186ey(SerialDescriptor original, KClass kClass) {
        Intrinsics.checkNotNullParameter(original, "original");
        Intrinsics.checkNotNullParameter(kClass, "kClass");
        this.f61732a = original;
        this.f61733b = kClass;
        this.f61734c = original.getSerialName() + Typography.less + kClass.getSimpleName() + Typography.greater;
    }

    public boolean equals(Object obj) {
        C10186ey c10186ey;
        if (obj instanceof C10186ey) {
            c10186ey = (C10186ey) obj;
        } else {
            c10186ey = null;
        }
        if (c10186ey == null || !Intrinsics.areEqual(this.f61732a, c10186ey.f61732a) || !Intrinsics.areEqual(c10186ey.f61733b, this.f61733b)) {
            return false;
        }
        return true;
    }

    @Override // kotlinx.serialization.descriptors.SerialDescriptor
    public List getAnnotations() {
        return this.f61732a.getAnnotations();
    }

    @Override // kotlinx.serialization.descriptors.SerialDescriptor
    public List getElementAnnotations(int i) {
        return this.f61732a.getElementAnnotations(i);
    }

    @Override // kotlinx.serialization.descriptors.SerialDescriptor
    public SerialDescriptor getElementDescriptor(int i) {
        return this.f61732a.getElementDescriptor(i);
    }

    @Override // kotlinx.serialization.descriptors.SerialDescriptor
    public int getElementIndex(String name) {
        Intrinsics.checkNotNullParameter(name, "name");
        return this.f61732a.getElementIndex(name);
    }

    @Override // kotlinx.serialization.descriptors.SerialDescriptor
    public String getElementName(int i) {
        return this.f61732a.getElementName(i);
    }

    @Override // kotlinx.serialization.descriptors.SerialDescriptor
    public int getElementsCount() {
        return this.f61732a.getElementsCount();
    }

    @Override // kotlinx.serialization.descriptors.SerialDescriptor
    public SerialKind getKind() {
        return this.f61732a.getKind();
    }

    @Override // kotlinx.serialization.descriptors.SerialDescriptor
    public String getSerialName() {
        return this.f61734c;
    }

    public int hashCode() {
        return (this.f61733b.hashCode() * 31) + getSerialName().hashCode();
    }

    @Override // kotlinx.serialization.descriptors.SerialDescriptor
    public boolean isElementOptional(int i) {
        return this.f61732a.isElementOptional(i);
    }

    @Override // kotlinx.serialization.descriptors.SerialDescriptor
    public boolean isInline() {
        return this.f61732a.isInline();
    }

    @Override // kotlinx.serialization.descriptors.SerialDescriptor
    public boolean isNullable() {
        return this.f61732a.isNullable();
    }

    public String toString() {
        return "ContextDescriptor(kClass: " + this.f61733b + ", original: " + this.f61732a + CoreConstants.RIGHT_PARENTHESIS_CHAR;
    }
}
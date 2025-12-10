package kotlinx.serialization.descriptors;

import com.tom_roush.pdfbox.contentstream.operator.OperatorName;
import com.tom_roush.pdfbox.pdmodel.common.PDPageLabelRange;
import java.lang.annotation.Annotation;
import java.util.ArrayList;
import java.util.HashSet;
import java.util.List;
import java.util.Set;
import kotlin.Deprecated;
import kotlin.DeprecationLevel;
import kotlin.Metadata;
import kotlin.collections.CollectionsKt__CollectionsKt;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.SourceDebugExtension;
import kotlinx.serialization.ExperimentalSerializationApi;
import org.jetbrains.annotations.NotNull;

@Metadata(m28851d1 = {"\u0000>\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\u000e\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010 \n\u0002\u0010\u001b\n\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0015\n\u0002\u0010!\n\u0002\b\u0003\n\u0002\u0010#\n\u0002\b\r\u0018\u00002\u00020\u0001B\u0011\b\u0000\u0012\u0006\u0010\u0003\u001a\u00020\u0002¢\u0006\u0004\b\u0004\u0010\u0005J7\u0010\u000f\u001a\u00020\u000e2\u0006\u0010\u0006\u001a\u00020\u00022\u0006\u0010\b\u001a\u00020\u00072\u000e\b\u0002\u0010\u000b\u001a\b\u0012\u0004\u0012\u00020\n0\t2\b\b\u0002\u0010\r\u001a\u00020\f¢\u0006\u0004\b\u000f\u0010\u0010R\u0017\u0010\u0003\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u0011\u0010\u0012\u001a\u0004\b\u0013\u0010\u0014R(\u0010\u0017\u001a\u00020\f8\u0006@\u0006X\u0087\u000e¢\u0006\u0018\n\u0004\b\u0015\u0010\u0016\u0012\u0004\b\u001b\u0010\u001c\u001a\u0004\b\u0017\u0010\u0018\"\u0004\b\u0019\u0010\u001aR.\u0010\u000b\u001a\b\u0012\u0004\u0012\u00020\n0\t8\u0006@\u0006X\u0087\u000e¢\u0006\u0018\n\u0004\b\u001d\u0010\u001e\u0012\u0004\b#\u0010\u001c\u001a\u0004\b\u001f\u0010 \"\u0004\b!\u0010\"R \u0010'\u001a\b\u0012\u0004\u0012\u00020\u00020$8\u0000X\u0080\u0004¢\u0006\f\n\u0004\b%\u0010\u001e\u001a\u0004\b&\u0010 R\u001a\u0010+\u001a\b\u0012\u0004\u0012\u00020\u00020(8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b)\u0010*R \u0010.\u001a\b\u0012\u0004\u0012\u00020\u00070$8\u0000X\u0080\u0004¢\u0006\f\n\u0004\b,\u0010\u001e\u001a\u0004\b-\u0010 R&\u00101\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020\n0\t0$8\u0000X\u0080\u0004¢\u0006\f\n\u0004\b/\u0010\u001e\u001a\u0004\b0\u0010 R \u00104\u001a\b\u0012\u0004\u0012\u00020\f0$8\u0000X\u0080\u0004¢\u0006\f\n\u0004\b2\u0010\u001e\u001a\u0004\b3\u0010 ¨\u00065"}, m28850d2 = {"Lkotlinx/serialization/descriptors/ClassSerialDescriptorBuilder;", "", "", "serialName", "<init>", "(Ljava/lang/String;)V", "elementName", "Lkotlinx/serialization/descriptors/SerialDescriptor;", "descriptor", "", "", "annotations", "", "isOptional", "", "element", "(Ljava/lang/String;Lkotlinx/serialization/descriptors/SerialDescriptor;Ljava/util/List;Z)V", PDPageLabelRange.STYLE_LETTERS_LOWER, "Ljava/lang/String;", "getSerialName", "()Ljava/lang/String;", OperatorName.CLOSE_FILL_NON_ZERO_AND_STROKE, "Z", "isNullable", "()Z", "setNullable", "(Z)V", "isNullable$annotations", "()V", OperatorName.CURVE_TO, "Ljava/util/List;", "getAnnotations", "()Ljava/util/List;", "setAnnotations", "(Ljava/util/List;)V", "getAnnotations$annotations", "", "d", "getElementNames$kotlinx_serialization_core", "elementNames", "", "e", "Ljava/util/Set;", "uniqueNames", OperatorName.FILL_NON_ZERO, "getElementDescriptors$kotlinx_serialization_core", "elementDescriptors", OperatorName.NON_STROKING_GRAY, "getElementAnnotations$kotlinx_serialization_core", "elementAnnotations", OperatorName.CLOSE_PATH, "getElementOptionality$kotlinx_serialization_core", "elementOptionality", "kotlinx-serialization-core"}, m28849k = 1, m28848mv = {1, 9, 0})
@SourceDebugExtension({"SMAP\nSerialDescriptors.kt\nKotlin\n*S Kotlin\n*F\n+ 1 SerialDescriptors.kt\nkotlinx/serialization/descriptors/ClassSerialDescriptorBuilder\n+ 2 fake.kt\nkotlin/jvm/internal/FakeKt\n*L\n1#1,348:1\n1#2:349\n*E\n"})
/* loaded from: classes6.dex */
public final class ClassSerialDescriptorBuilder {

    /* renamed from: a */
    public final String f71138a;

    /* renamed from: b */
    public boolean f71139b;

    /* renamed from: c */
    public List f71140c;

    /* renamed from: d */
    public final List f71141d;

    /* renamed from: e */
    public final Set f71142e;

    /* renamed from: f */
    public final List f71143f;

    /* renamed from: g */
    public final List f71144g;

    /* renamed from: h */
    public final List f71145h;

    public ClassSerialDescriptorBuilder(@NotNull String serialName) {
        Intrinsics.checkNotNullParameter(serialName, "serialName");
        this.f71138a = serialName;
        this.f71140c = CollectionsKt__CollectionsKt.emptyList();
        this.f71141d = new ArrayList();
        this.f71142e = new HashSet();
        this.f71143f = new ArrayList();
        this.f71144g = new ArrayList();
        this.f71145h = new ArrayList();
    }

    /* JADX WARN: Multi-variable type inference failed */
    public static /* synthetic */ void element$default(ClassSerialDescriptorBuilder classSerialDescriptorBuilder, String str, SerialDescriptor serialDescriptor, List list, boolean z, int i, Object obj) {
        if ((i & 4) != 0) {
            list = CollectionsKt__CollectionsKt.emptyList();
        }
        if ((i & 8) != 0) {
            z = false;
        }
        classSerialDescriptorBuilder.element(str, serialDescriptor, list, z);
    }

    @ExperimentalSerializationApi
    public static /* synthetic */ void getAnnotations$annotations() {
    }

    @Deprecated(level = DeprecationLevel.ERROR, message = "isNullable inside buildSerialDescriptor is deprecated. Please use SerialDescriptor.nullable extension on a builder result.")
    @ExperimentalSerializationApi
    public static /* synthetic */ void isNullable$annotations() {
    }

    public final void element(@NotNull String elementName, @NotNull SerialDescriptor descriptor, @NotNull List<? extends Annotation> annotations, boolean z) {
        Intrinsics.checkNotNullParameter(elementName, "elementName");
        Intrinsics.checkNotNullParameter(descriptor, "descriptor");
        Intrinsics.checkNotNullParameter(annotations, "annotations");
        if (this.f71142e.add(elementName)) {
            this.f71141d.add(elementName);
            this.f71143f.add(descriptor);
            this.f71144g.add(annotations);
            this.f71145h.add(Boolean.valueOf(z));
            return;
        }
        throw new IllegalArgumentException(("Element with name '" + elementName + "' is already registered in " + this.f71138a).toString());
    }

    @NotNull
    public final List<Annotation> getAnnotations() {
        return this.f71140c;
    }

    @NotNull
    public final List<List<Annotation>> getElementAnnotations$kotlinx_serialization_core() {
        return this.f71144g;
    }

    @NotNull
    public final List<SerialDescriptor> getElementDescriptors$kotlinx_serialization_core() {
        return this.f71143f;
    }

    @NotNull
    public final List<String> getElementNames$kotlinx_serialization_core() {
        return this.f71141d;
    }

    @NotNull
    public final List<Boolean> getElementOptionality$kotlinx_serialization_core() {
        return this.f71145h;
    }

    @NotNull
    public final String getSerialName() {
        return this.f71138a;
    }

    public final boolean isNullable() {
        return this.f71139b;
    }

    public final void setAnnotations(@NotNull List<? extends Annotation> list) {
        Intrinsics.checkNotNullParameter(list, "<set-?>");
        this.f71140c = list;
    }

    public final void setNullable(boolean z) {
        this.f71139b = z;
    }
}

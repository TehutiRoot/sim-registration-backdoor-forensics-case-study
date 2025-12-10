package kotlinx.serialization.json.internal;

import com.google.firebase.analytics.FirebaseAnalytics;
import com.tom_roush.pdfbox.contentstream.operator.OperatorName;
import com.tom_roush.pdfbox.pdmodel.common.PDPageLabelRange;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import kotlinx.serialization.descriptors.SerialDescriptor;
import kotlinx.serialization.internal.ElementMarker;
import org.jetbrains.annotations.NotNull;

@Metadata(m29143d1 = {"\u0000.\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0006\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\t\b\u0000\u0018\u00002\u00020\u0001B\u000f\u0012\u0006\u0010\u0003\u001a\u00020\u0002¢\u0006\u0004\b\u0004\u0010\u0005J\u0017\u0010\u000b\u001a\u00020\b2\u0006\u0010\u0007\u001a\u00020\u0006H\u0000¢\u0006\u0004\b\t\u0010\nJ\u000f\u0010\u000e\u001a\u00020\u0006H\u0000¢\u0006\u0004\b\f\u0010\rJ\u001f\u0010\u0010\u001a\u00020\u000f2\u0006\u0010\u0003\u001a\u00020\u00022\u0006\u0010\u0007\u001a\u00020\u0006H\u0002¢\u0006\u0004\b\u0010\u0010\u0011R\u0014\u0010\u0014\u001a\u00020\u00128\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0010\u0010\u0013R$\u0010\u001a\u001a\u00020\u000f2\u0006\u0010\u0015\u001a\u00020\u000f8\u0000@BX\u0080\u000e¢\u0006\f\n\u0004\b\u0016\u0010\u0017\u001a\u0004\b\u0018\u0010\u0019¨\u0006\u001b"}, m29142d2 = {"Lkotlinx/serialization/json/internal/JsonElementMarker;", "", "Lkotlinx/serialization/descriptors/SerialDescriptor;", "descriptor", "<init>", "(Lkotlinx/serialization/descriptors/SerialDescriptor;)V", "", FirebaseAnalytics.Param.INDEX, "", "mark$kotlinx_serialization_json", "(I)V", "mark", "nextUnmarkedIndex$kotlinx_serialization_json", "()I", "nextUnmarkedIndex", "", PDPageLabelRange.STYLE_LETTERS_LOWER, "(Lkotlinx/serialization/descriptors/SerialDescriptor;I)Z", "Lkotlinx/serialization/internal/ElementMarker;", "Lkotlinx/serialization/internal/ElementMarker;", "origin", "<set-?>", OperatorName.CLOSE_FILL_NON_ZERO_AND_STROKE, "Z", "isUnmarkedNull$kotlinx_serialization_json", "()Z", "isUnmarkedNull", "kotlinx-serialization-json"}, m29141k = 1, m29140mv = {1, 9, 0})
/* loaded from: classes6.dex */
public final class JsonElementMarker {

    /* renamed from: a */
    public final ElementMarker f71418a;

    /* renamed from: b */
    public boolean f71419b;

    public JsonElementMarker(@NotNull SerialDescriptor descriptor) {
        Intrinsics.checkNotNullParameter(descriptor, "descriptor");
        this.f71418a = new ElementMarker(descriptor, new JsonElementMarker$origin$1(this));
    }

    /* renamed from: a */
    public final boolean m26934a(SerialDescriptor serialDescriptor, int i) {
        boolean z;
        if (!serialDescriptor.isElementOptional(i) && serialDescriptor.getElementDescriptor(i).isNullable()) {
            z = true;
        } else {
            z = false;
        }
        this.f71419b = z;
        return z;
    }

    public final boolean isUnmarkedNull$kotlinx_serialization_json() {
        return this.f71419b;
    }

    public final void mark$kotlinx_serialization_json(int i) {
        this.f71418a.mark(i);
    }

    public final int nextUnmarkedIndex$kotlinx_serialization_json() {
        return this.f71418a.nextUnmarkedIndex();
    }
}
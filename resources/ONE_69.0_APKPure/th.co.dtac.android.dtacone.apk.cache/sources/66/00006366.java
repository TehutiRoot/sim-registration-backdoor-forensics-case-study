package androidx.compose.p003ui.platform;

import androidx.compose.runtime.internal.StabilityInferred;
import com.tom_roush.pdfbox.contentstream.operator.OperatorName;
import com.tom_roush.pdfbox.pdmodel.common.PDPageLabelRange;
import kotlin.Metadata;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

@StabilityInferred(parameters = 0)
@Metadata(m29143d1 = {"\u0000\u001c\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u000e\n\u0002\u0018\u0002\n\u0002\b\u0006\b\u0007\u0018\u00002\u00020\u0001B\u0007¢\u0006\u0004\b\u0002\u0010\u0003R$\u0010\u000b\u001a\u0004\u0018\u00010\u00048\u0006@\u0006X\u0086\u000e¢\u0006\u0012\n\u0004\b\u0005\u0010\u0006\u001a\u0004\b\u0007\u0010\b\"\u0004\b\t\u0010\nR$\u0010\u0012\u001a\u0004\u0018\u00010\u00018\u0006@\u0006X\u0086\u000e¢\u0006\u0012\n\u0004\b\f\u0010\r\u001a\u0004\b\u000e\u0010\u000f\"\u0004\b\u0010\u0010\u0011R\u0017\u0010\u0018\u001a\u00020\u00138\u0006¢\u0006\f\n\u0004\b\u0014\u0010\u0015\u001a\u0004\b\u0016\u0010\u0017¨\u0006\u0019"}, m29142d2 = {"Landroidx/compose/ui/platform/InspectorInfo;", "", "<init>", "()V", "", PDPageLabelRange.STYLE_LETTERS_LOWER, "Ljava/lang/String;", "getName", "()Ljava/lang/String;", "setName", "(Ljava/lang/String;)V", "name", OperatorName.CLOSE_FILL_NON_ZERO_AND_STROKE, "Ljava/lang/Object;", "getValue", "()Ljava/lang/Object;", "setValue", "(Ljava/lang/Object;)V", "value", "Landroidx/compose/ui/platform/ValueElementSequence;", OperatorName.CURVE_TO, "Landroidx/compose/ui/platform/ValueElementSequence;", "getProperties", "()Landroidx/compose/ui/platform/ValueElementSequence;", "properties", "ui_release"}, m29141k = 1, m29140mv = {1, 8, 0})
/* renamed from: androidx.compose.ui.platform.InspectorInfo */
/* loaded from: classes2.dex */
public final class InspectorInfo {
    public static final int $stable = 8;

    /* renamed from: a */
    public String f30782a;

    /* renamed from: b */
    public Object f30783b;

    /* renamed from: c */
    public final ValueElementSequence f30784c = new ValueElementSequence();

    @Nullable
    public final String getName() {
        return this.f30782a;
    }

    @NotNull
    public final ValueElementSequence getProperties() {
        return this.f30784c;
    }

    @Nullable
    public final Object getValue() {
        return this.f30783b;
    }

    public final void setName(@Nullable String str) {
        this.f30782a = str;
    }

    public final void setValue(@Nullable Object obj) {
        this.f30783b = obj;
    }
}
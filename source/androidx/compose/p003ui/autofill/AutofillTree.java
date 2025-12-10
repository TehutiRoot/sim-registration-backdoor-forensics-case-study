package androidx.compose.p003ui.autofill;

import androidx.compose.p003ui.ExperimentalComposeUiApi;
import androidx.compose.runtime.internal.StabilityInferred;
import com.tom_roush.pdfbox.pdmodel.common.PDPageLabelRange;
import java.util.LinkedHashMap;
import java.util.Map;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

@StabilityInferred(parameters = 0)
@ExperimentalComposeUiApi
@Metadata(m28851d1 = {"\u00000\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0003\n\u0002\u0010%\n\u0002\b\u0006\b\u0007\u0018\u00002\u00020\u0001B\u0007¢\u0006\u0004\b\u0002\u0010\u0003J\u0018\u0010\u0007\u001a\u00020\u00062\u0006\u0010\u0005\u001a\u00020\u0004H\u0086\u0002¢\u0006\u0004\b\u0007\u0010\bJ\u001f\u0010\r\u001a\u0004\u0018\u00010\u00062\u0006\u0010\n\u001a\u00020\t2\u0006\u0010\f\u001a\u00020\u000b¢\u0006\u0004\b\r\u0010\u000eR#\u0010\u0014\u001a\u000e\u0012\u0004\u0012\u00020\t\u0012\u0004\u0012\u00020\u00040\u000f8\u0006¢\u0006\f\n\u0004\b\u0010\u0010\u0011\u001a\u0004\b\u0012\u0010\u0013¨\u0006\u0015"}, m28850d2 = {"Landroidx/compose/ui/autofill/AutofillTree;", "", "<init>", "()V", "Landroidx/compose/ui/autofill/AutofillNode;", "autofillNode", "", "plusAssign", "(Landroidx/compose/ui/autofill/AutofillNode;)V", "", "id", "", "value", "performAutofill", "(ILjava/lang/String;)Lkotlin/Unit;", "", PDPageLabelRange.STYLE_LETTERS_LOWER, "Ljava/util/Map;", "getChildren", "()Ljava/util/Map;", "children", "ui_release"}, m28849k = 1, m28848mv = {1, 8, 0})
/* renamed from: androidx.compose.ui.autofill.AutofillTree */
/* loaded from: classes2.dex */
public final class AutofillTree {
    public static final int $stable = 8;

    /* renamed from: a */
    public final Map f28872a = new LinkedHashMap();

    @NotNull
    public final Map<Integer, AutofillNode> getChildren() {
        return this.f28872a;
    }

    @Nullable
    public final Unit performAutofill(int i, @NotNull String value) {
        Function1<String, Unit> onFill;
        Intrinsics.checkNotNullParameter(value, "value");
        AutofillNode autofillNode = (AutofillNode) this.f28872a.get(Integer.valueOf(i));
        if (autofillNode != null && (onFill = autofillNode.getOnFill()) != null) {
            onFill.invoke(value);
            return Unit.INSTANCE;
        }
        return null;
    }

    public final void plusAssign(@NotNull AutofillNode autofillNode) {
        Intrinsics.checkNotNullParameter(autofillNode, "autofillNode");
        this.f28872a.put(Integer.valueOf(autofillNode.getId()), autofillNode);
    }
}

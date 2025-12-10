package androidx.work.impl;

import androidx.work.impl.model.WorkGenerationalId;
import com.tom_roush.pdfbox.pdmodel.common.PDPageLabelRange;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

@Metadata(m28851d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0002\b\b\u0018\u00002\u00020\u0001B\u000f\u0012\u0006\u0010\u0003\u001a\u00020\u0002¢\u0006\u0004\b\u0004\u0010\u0005R\u0017\u0010\u0003\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u0006\u0010\u0007\u001a\u0004\b\b\u0010\t¨\u0006\n"}, m28850d2 = {"Landroidx/work/impl/StartStopToken;", "", "Landroidx/work/impl/model/WorkGenerationalId;", "id", "<init>", "(Landroidx/work/impl/model/WorkGenerationalId;)V", PDPageLabelRange.STYLE_LETTERS_LOWER, "Landroidx/work/impl/model/WorkGenerationalId;", "getId", "()Landroidx/work/impl/model/WorkGenerationalId;", "work-runtime_release"}, m28849k = 1, m28848mv = {1, 8, 0})
/* loaded from: classes.dex */
public final class StartStopToken {

    /* renamed from: a */
    public final WorkGenerationalId f38315a;

    public StartStopToken(@NotNull WorkGenerationalId id2) {
        Intrinsics.checkNotNullParameter(id2, "id");
        this.f38315a = id2;
    }

    @NotNull
    public final WorkGenerationalId getId() {
        return this.f38315a;
    }
}

package androidx.navigation;

import com.tom_roush.pdfbox.contentstream.operator.OperatorName;
import com.tom_roush.pdfbox.pdmodel.common.PDPageLabelRange;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

@Metadata(m28851d1 = {"\u0000\u0016\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u000e\u0018\u00002\u00020\u0001B\u0019\b\u0000\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0004¢\u0006\u0004\b\u0006\u0010\u0007J\u0010\u0010\b\u001a\u00020\u0002H\u0086\u0002¢\u0006\u0004\b\b\u0010\tJ\u0010\u0010\n\u001a\u00020\u0004H\u0086\u0002¢\u0006\u0004\b\n\u0010\u000bR\u0017\u0010\u0003\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\f\u0010\r\u001a\u0004\b\u000e\u0010\tR\u0017\u0010\u0005\u001a\u00020\u00048\u0006¢\u0006\f\n\u0004\b\u000f\u0010\u0010\u001a\u0004\b\u0011\u0010\u000b¨\u0006\u0012"}, m28850d2 = {"Landroidx/navigation/NamedNavArgument;", "", "", "name", "Landroidx/navigation/NavArgument;", "argument", "<init>", "(Ljava/lang/String;Landroidx/navigation/NavArgument;)V", "component1", "()Ljava/lang/String;", "component2", "()Landroidx/navigation/NavArgument;", PDPageLabelRange.STYLE_LETTERS_LOWER, "Ljava/lang/String;", "getName", OperatorName.CLOSE_FILL_NON_ZERO_AND_STROKE, "Landroidx/navigation/NavArgument;", "getArgument", "navigation-common_release"}, m28849k = 1, m28848mv = {1, 8, 0})
/* loaded from: classes2.dex */
public final class NamedNavArgument {

    /* renamed from: a */
    public final String f36186a;

    /* renamed from: b */
    public final NavArgument f36187b;

    public NamedNavArgument(@NotNull String name, @NotNull NavArgument argument) {
        Intrinsics.checkNotNullParameter(name, "name");
        Intrinsics.checkNotNullParameter(argument, "argument");
        this.f36186a = name;
        this.f36187b = argument;
    }

    @NotNull
    public final String component1() {
        return this.f36186a;
    }

    @NotNull
    public final NavArgument component2() {
        return this.f36187b;
    }

    @NotNull
    public final NavArgument getArgument() {
        return this.f36187b;
    }

    @NotNull
    public final String getName() {
        return this.f36186a;
    }
}

package androidx.navigation;

import androidx.navigation.NavArgument;
import com.fasterxml.jackson.databind.annotation.JsonPOJOBuilder;
import com.tom_roush.pdfbox.contentstream.operator.OperatorName;
import com.tom_roush.pdfbox.pdmodel.common.PDPageLabelRange;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

@NavDestinationDsl
@Metadata(m28851d1 = {"\u0000,\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000b\n\u0002\b\u0015\b\u0007\u0018\u00002\u00020\u0001B\u0007¢\u0006\u0004\b\u0002\u0010\u0003J\r\u0010\u0005\u001a\u00020\u0004¢\u0006\u0004\b\u0005\u0010\u0006R\u0014\u0010\n\u001a\u00020\u00078\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\b\u0010\tR\u001c\u0010\u000e\u001a\b\u0012\u0002\b\u0003\u0018\u00010\u000b8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b\f\u0010\rR*\u0010\u0017\u001a\u00020\u000f2\u0006\u0010\u0010\u001a\u00020\u000f8\u0006@FX\u0086\u000e¢\u0006\u0012\n\u0004\b\u0011\u0010\u0012\u001a\u0004\b\u0013\u0010\u0014\"\u0004\b\u0015\u0010\u0016R.\u0010\u001e\u001a\u0004\u0018\u00010\u00012\b\u0010\u0010\u001a\u0004\u0018\u00010\u00018\u0006@FX\u0086\u000e¢\u0006\u0012\n\u0004\b\u0018\u0010\u0019\u001a\u0004\b\u001a\u0010\u001b\"\u0004\b\u001c\u0010\u001dR,\u0010#\u001a\u0006\u0012\u0002\b\u00030\u000b2\n\u0010\u0010\u001a\u0006\u0012\u0002\b\u00030\u000b8F@FX\u0086\u000e¢\u0006\f\u001a\u0004\b\u001f\u0010 \"\u0004\b!\u0010\"¨\u0006$"}, m28850d2 = {"Landroidx/navigation/NavArgumentBuilder;", "", "<init>", "()V", "Landroidx/navigation/NavArgument;", JsonPOJOBuilder.DEFAULT_BUILD_METHOD, "()Landroidx/navigation/NavArgument;", "Landroidx/navigation/NavArgument$Builder;", PDPageLabelRange.STYLE_LETTERS_LOWER, "Landroidx/navigation/NavArgument$Builder;", "builder", "Landroidx/navigation/NavType;", OperatorName.CLOSE_FILL_NON_ZERO_AND_STROKE, "Landroidx/navigation/NavType;", "_type", "", "value", OperatorName.CURVE_TO, "Z", "getNullable", "()Z", "setNullable", "(Z)V", "nullable", "d", "Ljava/lang/Object;", "getDefaultValue", "()Ljava/lang/Object;", "setDefaultValue", "(Ljava/lang/Object;)V", "defaultValue", "getType", "()Landroidx/navigation/NavType;", "setType", "(Landroidx/navigation/NavType;)V", "type", "navigation-common_release"}, m28849k = 1, m28848mv = {1, 8, 0})
/* loaded from: classes2.dex */
public final class NavArgumentBuilder {

    /* renamed from: a */
    public final NavArgument.Builder f36207a = new NavArgument.Builder();

    /* renamed from: b */
    public NavType f36208b;

    /* renamed from: c */
    public boolean f36209c;

    /* renamed from: d */
    public Object f36210d;

    @NotNull
    public final NavArgument build() {
        return this.f36207a.build();
    }

    @Nullable
    public final Object getDefaultValue() {
        return this.f36210d;
    }

    public final boolean getNullable() {
        return this.f36209c;
    }

    @NotNull
    public final NavType<?> getType() {
        NavType<?> navType = this.f36208b;
        if (navType != null) {
            return navType;
        }
        throw new IllegalStateException("NavType has not been set on this builder.");
    }

    public final void setDefaultValue(@Nullable Object obj) {
        this.f36210d = obj;
        this.f36207a.setDefaultValue(obj);
    }

    public final void setNullable(boolean z) {
        this.f36209c = z;
        this.f36207a.setIsNullable(z);
    }

    public final void setType(@NotNull NavType<?> value) {
        Intrinsics.checkNotNullParameter(value, "value");
        this.f36208b = value;
        this.f36207a.setType(value);
    }
}

package androidx.compose.p003ui.tooling.data;

import androidx.compose.p003ui.unit.IntRect;
import androidx.compose.runtime.internal.StabilityInferred;
import ch.qos.logback.core.joran.action.Action;
import com.google.firebase.analytics.FirebaseAnalytics;
import java.util.Collection;
import java.util.List;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import org.apache.http.protocol.HTTP;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

@StabilityInferred(parameters = 0)
@UiToolingDataApi
@Metadata(m29143d1 = {"\u0000<\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u001e\n\u0002\b\u0002\n\u0002\u0010\u000b\n\u0002\b\b\b\u0007\u0018\u00002\u00020\u0001Bk\u0012\b\u0010\u0003\u001a\u0004\u0018\u00010\u0002\u0012\b\u0010\u0005\u001a\u0004\u0018\u00010\u0004\u0012\u0006\u0010\u0007\u001a\u00020\u0006\u0012\b\u0010\t\u001a\u0004\u0018\u00010\b\u0012\b\u0010\n\u001a\u0004\u0018\u00010\u0002\u0012\f\u0010\r\u001a\b\u0012\u0004\u0012\u00020\f0\u000b\u0012\u000e\u0010\u000f\u001a\n\u0012\u0006\u0012\u0004\u0018\u00010\u00020\u000e\u0012\f\u0010\u0010\u001a\b\u0012\u0004\u0012\u00020\u00010\u000e\u0012\u0006\u0010\u0012\u001a\u00020\u0011¢\u0006\u0004\b\u0013\u0010\u0014R \u0010\r\u001a\b\u0012\u0004\u0012\u00020\f0\u000b8\u0016X\u0096\u0004¢\u0006\f\n\u0004\b\u0015\u0010\u0016\u001a\u0004\b\u0017\u0010\u0018¨\u0006\u0019"}, m29142d2 = {"Landroidx/compose/ui/tooling/data/CallGroup;", "Landroidx/compose/ui/tooling/data/Group;", "", Action.KEY_ATTRIBUTE, "", "name", "Landroidx/compose/ui/unit/IntRect;", "box", "Landroidx/compose/ui/tooling/data/SourceLocation;", FirebaseAnalytics.Param.LOCATION, HTTP.IDENTITY_CODING, "", "Landroidx/compose/ui/tooling/data/ParameterInformation;", "parameters", "", "data", "children", "", "isInline", "<init>", "(Ljava/lang/Object;Ljava/lang/String;Landroidx/compose/ui/unit/IntRect;Landroidx/compose/ui/tooling/data/SourceLocation;Ljava/lang/Object;Ljava/util/List;Ljava/util/Collection;Ljava/util/Collection;Z)V", "i", "Ljava/util/List;", "getParameters", "()Ljava/util/List;", "ui-tooling-data_release"}, m29141k = 1, m29140mv = {1, 8, 0})
/* renamed from: androidx.compose.ui.tooling.data.CallGroup */
/* loaded from: classes2.dex */
public final class CallGroup extends Group {
    public static final int $stable = 8;

    /* renamed from: i */
    public final List f31795i;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public CallGroup(@Nullable Object obj, @Nullable String str, @NotNull IntRect box, @Nullable SourceLocation sourceLocation, @Nullable Object obj2, @NotNull List<ParameterInformation> parameters, @NotNull Collection<? extends Object> data, @NotNull Collection<? extends Group> children, boolean z) {
        super(obj, str, sourceLocation, obj2, box, data, children, z, null);
        Intrinsics.checkNotNullParameter(box, "box");
        Intrinsics.checkNotNullParameter(parameters, "parameters");
        Intrinsics.checkNotNullParameter(data, "data");
        Intrinsics.checkNotNullParameter(children, "children");
        this.f31795i = parameters;
    }

    @Override // androidx.compose.p003ui.tooling.data.Group
    @NotNull
    public List<ParameterInformation> getParameters() {
        return this.f31795i;
    }
}
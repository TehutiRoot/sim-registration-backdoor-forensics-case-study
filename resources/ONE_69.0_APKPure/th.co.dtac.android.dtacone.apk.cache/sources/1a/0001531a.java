package th.p047co.dtac.android.dtacone.view.fragment.stv;

import kotlin.Metadata;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.Lambda;
import org.jetbrains.annotations.NotNull;

@Metadata(m29143d1 = {"\u0000\u0010\n\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\r\n\u0002\b\u0002\u0010\u0000\u001a\u00020\u00012\u0006\u0010\u0002\u001a\u00020\u0003H\n¢\u0006\u0004\b\u0004\u0010\u0005"}, m29142d2 = {"<anonymous>", "", "it", "", "invoke", "(Ljava/lang/CharSequence;)Ljava/lang/Boolean;"}, m29141k = 3, m29140mv = {1, 8, 0}, m29138xi = 48)
/* renamed from: th.co.dtac.android.dtacone.view.fragment.stv.StvPhoenixFragment$setUpViews$6 */
/* loaded from: classes9.dex */
public final class StvPhoenixFragment$setUpViews$6 extends Lambda implements Function1<CharSequence, Boolean> {
    public static final StvPhoenixFragment$setUpViews$6 INSTANCE = new StvPhoenixFragment$setUpViews$6();

    public StvPhoenixFragment$setUpViews$6() {
        super(1);
    }

    @Override // kotlin.jvm.functions.Function1
    @NotNull
    public final Boolean invoke(@NotNull CharSequence it) {
        Intrinsics.checkNotNullParameter(it, "it");
        return Boolean.valueOf(it.length() == 12);
    }
}
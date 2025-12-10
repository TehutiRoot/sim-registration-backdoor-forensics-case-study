package th.p047co.dtac.android.dtacone.view.fragment.stv;

import kotlin.Metadata;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.Lambda;
import org.apache.commons.cli.HelpFormatter;
import org.jetbrains.annotations.NotNull;
import th.p047co.dtac.android.dtacone.R;

@Metadata(m29143d1 = {"\u0000\u000e\n\u0000\n\u0002\u0010\r\n\u0000\n\u0002\u0010\u000e\n\u0000\u0010\u0000\u001a\u00020\u00012\u0006\u0010\u0002\u001a\u00020\u0003H\n¢\u0006\u0002\b\u0004"}, m29142d2 = {"<anonymous>", "", "it", "", "invoke"}, m29141k = 3, m29140mv = {1, 8, 0}, m29138xi = 48)
/* renamed from: th.co.dtac.android.dtacone.view.fragment.stv.StvConfirmFragment$displayDescription$description$2 */
/* loaded from: classes9.dex */
public final class StvConfirmFragment$displayDescription$description$2 extends Lambda implements Function1<String, CharSequence> {
    final /* synthetic */ StvConfirmFragment this$0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public StvConfirmFragment$displayDescription$description$2(StvConfirmFragment stvConfirmFragment) {
        super(1);
        this.this$0 = stvConfirmFragment;
    }

    @Override // kotlin.jvm.functions.Function1
    @NotNull
    public final CharSequence invoke(@NotNull String it) {
        Intrinsics.checkNotNullParameter(it, "it");
        String string = this.this$0.getString(R.string.dot);
        return string + HelpFormatter.DEFAULT_LONG_OPT_SEPARATOR + it;
    }
}
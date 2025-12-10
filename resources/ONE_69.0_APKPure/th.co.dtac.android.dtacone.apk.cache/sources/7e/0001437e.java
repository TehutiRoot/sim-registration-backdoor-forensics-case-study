package th.p047co.dtac.android.dtacone.view.appOne.tol.screen.installation;

import androidx.compose.runtime.MutableState;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.Lambda;
import org.jetbrains.annotations.NotNull;
import th.p047co.dtac.android.dtacone.view.appOne.tol.model.installation.InstallContact;

@Metadata(m29141k = 3, m29140mv = {1, 8, 0}, m29138xi = 48)
/* renamed from: th.co.dtac.android.dtacone.view.appOne.tol.screen.installation.ComposableSingletons$InstallContactScreenKt$lambda-1$1$1$1  reason: invalid class name */
/* loaded from: classes10.dex */
public final class ComposableSingletons$InstallContactScreenKt$lambda1$1$1$1 extends Lambda implements Function1<InstallContact, Unit> {
    final /* synthetic */ MutableState<InstallContact> $installInfo$delegate;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public ComposableSingletons$InstallContactScreenKt$lambda1$1$1$1(MutableState<InstallContact> mutableState) {
        super(1);
        this.$installInfo$delegate = mutableState;
    }

    @Override // kotlin.jvm.functions.Function1
    public /* bridge */ /* synthetic */ Unit invoke(InstallContact installContact) {
        invoke2(installContact);
        return Unit.INSTANCE;
    }

    /* renamed from: invoke  reason: avoid collision after fix types in other method */
    public final void invoke2(@NotNull InstallContact it) {
        Intrinsics.checkNotNullParameter(it, "it");
        this.$installInfo$delegate.setValue(it);
    }
}
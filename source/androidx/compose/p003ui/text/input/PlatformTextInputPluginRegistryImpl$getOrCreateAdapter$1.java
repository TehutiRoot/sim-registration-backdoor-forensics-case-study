package androidx.compose.p003ui.text.input;

import androidx.compose.p003ui.text.input.PlatformTextInputPluginRegistryImpl;
import kotlin.Metadata;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.Lambda;
import org.jetbrains.annotations.NotNull;

@Metadata(m28851d1 = {"\u0000\u0010\n\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0000\u001a\u00020\u0001\"\b\b\u0000\u0010\u0002*\u00020\u0003H\n¢\u0006\u0004\b\u0004\u0010\u0005"}, m28850d2 = {"<anonymous>", "", "T", "Landroidx/compose/ui/text/input/PlatformTextInputAdapter;", "invoke", "()Ljava/lang/Boolean;"}, m28849k = 3, m28848mv = {1, 8, 0}, m28846xi = 48)
/* renamed from: androidx.compose.ui.text.input.PlatformTextInputPluginRegistryImpl$getOrCreateAdapter$1 */
/* loaded from: classes2.dex */
public final class PlatformTextInputPluginRegistryImpl$getOrCreateAdapter$1 extends Lambda implements Function0<Boolean> {
    final /* synthetic */ PlatformTextInputPluginRegistryImpl.C3623b $adapterWithRefCount;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public PlatformTextInputPluginRegistryImpl$getOrCreateAdapter$1(PlatformTextInputPluginRegistryImpl.C3623b c3623b) {
        super(0);
        this.$adapterWithRefCount = c3623b;
    }

    /* JADX WARN: Can't rename method to resolve collision */
    @Override // kotlin.jvm.functions.Function0
    @NotNull
    public final Boolean invoke() {
        return Boolean.valueOf(this.$adapterWithRefCount.m59025a());
    }
}

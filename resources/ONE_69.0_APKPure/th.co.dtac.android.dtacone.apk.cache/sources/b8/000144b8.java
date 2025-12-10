package th.p047co.dtac.android.dtacone.view.appOne.tol.screen.takePhoto;

import android.graphics.Bitmap;
import androidx.compose.foundation.layout.BoxScope;
import androidx.compose.runtime.Composer;
import androidx.compose.runtime.RecomposeScopeImplKt;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Lambda;
import org.jetbrains.annotations.Nullable;

@Metadata(m29141k = 3, m29140mv = {1, 8, 0}, m29138xi = 48)
/* renamed from: th.co.dtac.android.dtacone.view.appOne.tol.screen.takePhoto.TakePhotoOptionalScreenKt$PreviewImage$2 */
/* loaded from: classes10.dex */
public final class TakePhotoOptionalScreenKt$PreviewImage$2 extends Lambda implements Function2<Composer, Integer, Unit> {
    final /* synthetic */ int $$changed;
    final /* synthetic */ Bitmap $bitmap;
    final /* synthetic */ BoxScope $this_PreviewImage;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public TakePhotoOptionalScreenKt$PreviewImage$2(BoxScope boxScope, Bitmap bitmap, int i) {
        super(2);
        this.$this_PreviewImage = boxScope;
        this.$bitmap = bitmap;
        this.$$changed = i;
    }

    @Override // kotlin.jvm.functions.Function2
    public /* bridge */ /* synthetic */ Unit invoke(Composer composer, Integer num) {
        invoke(composer, num.intValue());
        return Unit.INSTANCE;
    }

    public final void invoke(@Nullable Composer composer, int i) {
        TakePhotoOptionalScreenKt.m9398a(this.$this_PreviewImage, this.$bitmap, composer, RecomposeScopeImplKt.updateChangedFlags(this.$$changed | 1));
    }
}
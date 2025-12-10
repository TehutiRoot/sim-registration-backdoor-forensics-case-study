package th.p047co.dtac.android.dtacone.view.fragment.take_photo;

import androidx.recyclerview.widget.LinearLayoutManager;
import kotlin.Metadata;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.Lambda;
import org.jetbrains.annotations.NotNull;

@Metadata(m29143d1 = {"\u0000\b\n\u0000\n\u0002\u0018\u0002\n\u0000\u0010\u0000\u001a\u00020\u0001H\n¢\u0006\u0002\b\u0002"}, m29142d2 = {"<anonymous>", "Landroidx/recyclerview/widget/LinearLayoutManager;", "invoke"}, m29141k = 3, m29140mv = {1, 8, 0}, m29138xi = 48)
/* renamed from: th.co.dtac.android.dtacone.view.fragment.take_photo.TakePhotoFragment$horizontalLayoutManager$2 */
/* loaded from: classes9.dex */
public final class TakePhotoFragment$horizontalLayoutManager$2 extends Lambda implements Function0<LinearLayoutManager> {
    final /* synthetic */ TakePhotoFragment this$0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public TakePhotoFragment$horizontalLayoutManager$2(TakePhotoFragment takePhotoFragment) {
        super(0);
        this.this$0 = takePhotoFragment;
    }

    /* JADX WARN: Can't rename method to resolve collision */
    @Override // kotlin.jvm.functions.Function0
    @NotNull
    public final LinearLayoutManager invoke() {
        return new LinearLayoutManager(this.this$0.getContext(), 0, false);
    }
}
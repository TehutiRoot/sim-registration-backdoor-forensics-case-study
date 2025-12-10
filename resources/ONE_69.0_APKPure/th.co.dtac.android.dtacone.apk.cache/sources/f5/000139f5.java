package th.p047co.dtac.android.dtacone.view.appOne.pre2post.fragment;

import kotlin.Metadata;
import kotlin.Pair;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Lambda;

@Metadata(m29143d1 = {"\u0000\u0014\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010\u0012\n\u0002\b\u0002\u0010\u0000\u001a\u00020\u00012*\u0010\u0002\u001a&\u0012\u0004\u0012\u00020\u0004\u0012\u0006\u0012\u0004\u0018\u00010\u0004 \u0005*\u0012\u0012\u0004\u0012\u00020\u0004\u0012\u0006\u0012\u0004\u0018\u00010\u0004\u0018\u00010\u00030\u0003H\n¢\u0006\u0002\b\u0006"}, m29142d2 = {"<anonymous>", "", "it", "Lkotlin/Pair;", "", "kotlin.jvm.PlatformType", "invoke"}, m29141k = 3, m29140mv = {1, 8, 0}, m29138xi = 48)
/* renamed from: th.co.dtac.android.dtacone.view.appOne.pre2post.fragment.OnePre2PostFaceRecognitionFragment$observeLoadPreviewImage$1 */
/* loaded from: classes10.dex */
public final class OnePre2PostFaceRecognitionFragment$observeLoadPreviewImage$1 extends Lambda implements Function1<Pair<? extends byte[], ? extends byte[]>, Unit> {
    final /* synthetic */ OnePre2PostFaceRecognitionFragment this$0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public OnePre2PostFaceRecognitionFragment$observeLoadPreviewImage$1(OnePre2PostFaceRecognitionFragment onePre2PostFaceRecognitionFragment) {
        super(1);
        this.this$0 = onePre2PostFaceRecognitionFragment;
    }

    @Override // kotlin.jvm.functions.Function1
    public /* bridge */ /* synthetic */ Unit invoke(Pair<? extends byte[], ? extends byte[]> pair) {
        invoke2((Pair<byte[], byte[]>) pair);
        return Unit.INSTANCE;
    }

    /* renamed from: invoke  reason: avoid collision after fix types in other method */
    public final void invoke2(Pair<byte[], byte[]> pair) {
        if (pair != null) {
            this.this$0.onPreview(pair);
        }
    }
}
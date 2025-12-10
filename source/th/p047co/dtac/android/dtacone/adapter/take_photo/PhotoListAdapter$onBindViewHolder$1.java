package th.p047co.dtac.android.dtacone.adapter.take_photo;

import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Lambda;

@Metadata(m28851d1 = {"\u0000\u000e\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0010\b\n\u0000\u0010\u0000\u001a\u00020\u00012\u0006\u0010\u0002\u001a\u00020\u0003H\n¢\u0006\u0002\b\u0004"}, m28850d2 = {"<anonymous>", "", "it", "", "invoke"}, m28849k = 3, m28848mv = {1, 8, 0}, m28846xi = 48)
/* renamed from: th.co.dtac.android.dtacone.adapter.take_photo.PhotoListAdapter$onBindViewHolder$1 */
/* loaded from: classes7.dex */
public final class PhotoListAdapter$onBindViewHolder$1 extends Lambda implements Function1<Integer, Unit> {
    final /* synthetic */ PhotoListAdapter this$0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public PhotoListAdapter$onBindViewHolder$1(PhotoListAdapter photoListAdapter) {
        super(1);
        this.this$0 = photoListAdapter;
    }

    @Override // kotlin.jvm.functions.Function1
    public /* bridge */ /* synthetic */ Unit invoke(Integer num) {
        invoke(num.intValue());
        return Unit.INSTANCE;
    }

    public final void invoke(int i) {
        this.this$0.getOnClick().invoke(Integer.valueOf(i));
    }
}

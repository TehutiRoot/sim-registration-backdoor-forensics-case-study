package th.p047co.dtac.android.dtacone.view.fragment.take_photo;

import android.app.Dialog;
import androidx.fragment.app.FragmentActivity;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.Lambda;
import th.p047co.dtac.android.dtacone.R;
import th.p047co.dtac.android.dtacone.extension.view.ActivityExtKt;

@Metadata(m29143d1 = {"\u0000\b\n\u0000\n\u0002\u0010\u0002\n\u0000\u0010\u0000\u001a\u00020\u0001H\n¢\u0006\u0002\b\u0002"}, m29142d2 = {"<anonymous>", "", "invoke"}, m29141k = 3, m29140mv = {1, 8, 0}, m29138xi = 48)
/* renamed from: th.co.dtac.android.dtacone.view.fragment.take_photo.PreviewPhotoFragment$onViewCreated$3 */
/* loaded from: classes9.dex */
public final class PreviewPhotoFragment$onViewCreated$3 extends Lambda implements Function0<Unit> {
    final /* synthetic */ PreviewPhotoFragment this$0;

    @Metadata(m29143d1 = {"\u0000\b\n\u0000\n\u0002\u0010\u0002\n\u0000\u0010\u0000\u001a\u00020\u0001H\n¢\u0006\u0002\b\u0002"}, m29142d2 = {"<anonymous>", "", "invoke"}, m29141k = 3, m29140mv = {1, 8, 0}, m29138xi = 48)
    /* renamed from: th.co.dtac.android.dtacone.view.fragment.take_photo.PreviewPhotoFragment$onViewCreated$3$1 */
    /* loaded from: classes9.dex */
    public static final class C164461 extends Lambda implements Function0<Unit> {
        final /* synthetic */ PreviewPhotoFragment this$0;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public C164461(PreviewPhotoFragment previewPhotoFragment) {
            super(0);
            this.this$0 = previewPhotoFragment;
        }

        @Override // kotlin.jvm.functions.Function0
        public /* bridge */ /* synthetic */ Unit invoke() {
            invoke2();
            return Unit.INSTANCE;
        }

        @Override // kotlin.jvm.functions.Function0
        /* renamed from: invoke  reason: avoid collision after fix types in other method */
        public final void invoke2() {
            this.this$0.m3546m();
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public PreviewPhotoFragment$onViewCreated$3(PreviewPhotoFragment previewPhotoFragment) {
        super(0);
        this.this$0 = previewPhotoFragment;
    }

    @Override // kotlin.jvm.functions.Function0
    public /* bridge */ /* synthetic */ Unit invoke() {
        invoke2();
        return Unit.INSTANCE;
    }

    @Override // kotlin.jvm.functions.Function0
    /* renamed from: invoke  reason: avoid collision after fix types in other method */
    public final void invoke2() {
        FragmentActivity activity = this.this$0.getActivity();
        if (activity != null) {
            String string = this.this$0.getString(R.string.camera_dialog_delete_photo_title);
            Intrinsics.checkNotNullExpressionValue(string, "getString(R.string.camer…ialog_delete_photo_title)");
            String string2 = this.this$0.getString(R.string.camera_dialog_delete_photo_message);
            Intrinsics.checkNotNullExpressionValue(string2, "getString(R.string.camer…log_delete_photo_message)");
            Dialog createConfirmDialog = ActivityExtKt.createConfirmDialog(activity, string, string2, new C164461(this.this$0));
            if (createConfirmDialog != null) {
                createConfirmDialog.show();
            }
        }
    }
}
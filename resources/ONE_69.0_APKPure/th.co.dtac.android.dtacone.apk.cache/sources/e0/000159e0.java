package th.p047co.dtac.android.dtacone.viewmodel.mrtr_prepaid_multi_sim;

import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.Lambda;
import org.jetbrains.annotations.NotNull;
import th.p047co.dtac.android.dtacone.model.upload_image.response.UploadImageResponse;

@Metadata(m29143d1 = {"\u0000\u0010\n\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0000\u001a\u00020\u00012\u0006\u0010\u0002\u001a\u00020\u0003H\n¢\u0006\u0004\b\u0004\u0010\u0005"}, m29142d2 = {"<anonymous>", "", "it", "Lth/co/dtac/android/dtacone/model/upload_image/response/UploadImageResponse;", "invoke", "(Lth/co/dtac/android/dtacone/model/upload_image/response/UploadImageResponse;)Ljava/lang/Boolean;"}, m29141k = 3, m29140mv = {1, 8, 0}, m29138xi = 48)
/* renamed from: th.co.dtac.android.dtacone.viewmodel.mrtr_prepaid_multi_sim.MrtrPrepaidMultiSimViewModel$uploadImages$2 */
/* loaded from: classes9.dex */
public final class MrtrPrepaidMultiSimViewModel$uploadImages$2 extends Lambda implements Function1<UploadImageResponse, Boolean> {
    final /* synthetic */ Function1<Boolean, Unit> $skip;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    /* JADX WARN: Multi-variable type inference failed */
    public MrtrPrepaidMultiSimViewModel$uploadImages$2(Function1<? super Boolean, Unit> function1) {
        super(1);
        this.$skip = function1;
    }

    @Override // kotlin.jvm.functions.Function1
    @NotNull
    public final Boolean invoke(@NotNull UploadImageResponse it) {
        Intrinsics.checkNotNullParameter(it, "it");
        String filename = it.getFilename();
        if (filename == null || filename.length() == 0) {
            this.$skip.invoke(Boolean.TRUE);
        }
        String filename2 = it.getFilename();
        return Boolean.valueOf(!(filename2 == null || filename2.length() == 0));
    }
}
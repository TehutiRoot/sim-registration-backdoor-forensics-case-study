package th.p047co.dtac.android.dtacone.view.appOne.pre2post.viewModel;

import kotlin.Metadata;
import kotlin.Pair;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.Lambda;
import okhttp3.ResponseBody;
import org.jetbrains.annotations.NotNull;
import th.p047co.dtac.android.dtacone.model.postcode.GetPostCodeInfoResponse;

@Metadata(m29143d1 = {"\u0000\u0012\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\u0010\u0000\u001a\u000e\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u00030\u00012\u0006\u0010\u0004\u001a\u00020\u00022\u0006\u0010\u0005\u001a\u00020\u0003H\n¢\u0006\u0002\b\u0006"}, m29142d2 = {"<anonymous>", "Lkotlin/Pair;", "Lokhttp3/ResponseBody;", "Lth/co/dtac/android/dtacone/model/postcode/GetPostCodeInfoResponse;", "response", "postcodes", "invoke"}, m29141k = 3, m29140mv = {1, 8, 0}, m29138xi = 48)
/* renamed from: th.co.dtac.android.dtacone.view.appOne.pre2post.viewModel.OnePre2PostViewModel$validateIdNumber$1 */
/* loaded from: classes10.dex */
public final class OnePre2PostViewModel$validateIdNumber$1 extends Lambda implements Function2<ResponseBody, GetPostCodeInfoResponse, Pair<? extends ResponseBody, ? extends GetPostCodeInfoResponse>> {
    public static final OnePre2PostViewModel$validateIdNumber$1 INSTANCE = new OnePre2PostViewModel$validateIdNumber$1();

    public OnePre2PostViewModel$validateIdNumber$1() {
        super(2);
    }

    @Override // kotlin.jvm.functions.Function2
    @NotNull
    public final Pair<ResponseBody, GetPostCodeInfoResponse> invoke(@NotNull ResponseBody response, @NotNull GetPostCodeInfoResponse postcodes) {
        Intrinsics.checkNotNullParameter(response, "response");
        Intrinsics.checkNotNullParameter(postcodes, "postcodes");
        return new Pair<>(response, postcodes);
    }
}
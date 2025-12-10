package th.p047co.dtac.android.dtacone.view.appOne.rectify.viewmodel;

import androidx.autofill.HintConstants;
import io.reactivex.ObservableSource;
import kotlin.Metadata;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Lambda;
import org.jetbrains.annotations.Nullable;
import th.p047co.dtac.android.dtacone.app_one.model.rectify.OneRectifyListResponse;
import th.p047co.dtac.android.dtacone.view.appOne.rectify.repository.OneRectifyRepository;

@Metadata(m29143d1 = {"\u0000\u0014\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0000\u0010\u0000\u001a*\u0012\u000e\b\u0001\u0012\n \u0003*\u0004\u0018\u00010\u00020\u0002 \u0003*\u0014\u0012\u000e\b\u0001\u0012\n \u0003*\u0004\u0018\u00010\u00020\u0002\u0018\u00010\u00010\u00012\b\u0010\u0004\u001a\u0004\u0018\u00010\u0005H\n¢\u0006\u0002\b\u0006"}, m29142d2 = {"<anonymous>", "Lio/reactivex/ObservableSource;", "Lth/co/dtac/android/dtacone/app_one/model/rectify/OneRectifyListResponse;", "kotlin.jvm.PlatformType", HintConstants.AUTOFILL_HINT_PHONE, "", "invoke"}, m29141k = 3, m29140mv = {1, 8, 0}, m29138xi = 48)
/* renamed from: th.co.dtac.android.dtacone.view.appOne.rectify.viewmodel.OneRectifyViewModel$getRectifyList$1 */
/* loaded from: classes10.dex */
public final class OneRectifyViewModel$getRectifyList$1 extends Lambda implements Function1<String, ObservableSource<? extends OneRectifyListResponse>> {
    final /* synthetic */ OneRectifyViewModel this$0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public OneRectifyViewModel$getRectifyList$1(OneRectifyViewModel oneRectifyViewModel) {
        super(1);
        this.this$0 = oneRectifyViewModel;
    }

    @Override // kotlin.jvm.functions.Function1
    public final ObservableSource<? extends OneRectifyListResponse> invoke(@Nullable String str) {
        OneRectifyRepository oneRectifyRepository;
        OneRectifyRepository oneRectifyRepository2;
        if (str == null || str.length() == 0) {
            oneRectifyRepository = this.this$0.f96159b;
            return OneRectifyRepository.DefaultImpls.getRectify$default(oneRectifyRepository, null, 1, null);
        }
        oneRectifyRepository2 = this.this$0.f96159b;
        return oneRectifyRepository2.getRectify(str);
    }
}
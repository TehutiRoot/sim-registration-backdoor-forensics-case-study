package th.p047co.dtac.android.dtacone.view.fragment.eSIM.form;

import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.Lambda;
import kotlin.jvm.internal.SourceDebugExtension;
import org.jetbrains.annotations.NotNull;
import th.p047co.dtac.android.dtacone.model.face_recognition.FaceCompareResponse;
import th.p047co.dtac.android.dtacone.model.livedata.FragmentNavEvent;
import th.p047co.dtac.android.dtacone.view.activity.eSIM.ESimActivity;

@Metadata(m29143d1 = {"\u0000\u000e\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\u0010\u0000\u001a\u00020\u00012\u0006\u0010\u0002\u001a\u00020\u0003H\n¢\u0006\u0002\b\u0004"}, m29142d2 = {"<anonymous>", "", "it", "Lth/co/dtac/android/dtacone/model/livedata/FragmentNavEvent;", "invoke"}, m29141k = 3, m29140mv = {1, 8, 0}, m29138xi = 48)
@SourceDebugExtension({"SMAP\nESimPrepaidFormFragment.kt\nKotlin\n*S Kotlin\n*F\n+ 1 ESimPrepaidFormFragment.kt\nth/co/dtac/android/dtacone/view/fragment/eSIM/form/ESimPrepaidFormFragment$setUpViewModel$1$2\n+ 2 fake.kt\nkotlin/jvm/internal/FakeKt\n*L\n1#1,307:1\n1#2:308\n*E\n"})
/* renamed from: th.co.dtac.android.dtacone.view.fragment.eSIM.form.ESimPrepaidFormFragment$setUpViewModel$1$2 */
/* loaded from: classes9.dex */
public final class ESimPrepaidFormFragment$setUpViewModel$1$2 extends Lambda implements Function1<FragmentNavEvent, Unit> {
    final /* synthetic */ ESimPrepaidFormFragment this$0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public ESimPrepaidFormFragment$setUpViewModel$1$2(ESimPrepaidFormFragment eSimPrepaidFormFragment) {
        super(1);
        this.this$0 = eSimPrepaidFormFragment;
    }

    @Override // kotlin.jvm.functions.Function1
    public /* bridge */ /* synthetic */ Unit invoke(FragmentNavEvent fragmentNavEvent) {
        invoke2(fragmentNavEvent);
        return Unit.INSTANCE;
    }

    /* renamed from: invoke  reason: avoid collision after fix types in other method */
    public final void invoke2(@NotNull FragmentNavEvent it) {
        FaceCompareResponse m7488n;
        ESimActivity m7484r;
        ESimActivity m7484r2;
        Intrinsics.checkNotNullParameter(it, "it");
        m7488n = this.this$0.m7488n();
        if (m7488n != null) {
            m7484r2 = this.this$0.m7484r();
            m7484r2.getESimViewModel().setCompareResponseForSubmit(m7488n);
        }
        this.this$0.m7477y();
        m7484r = this.this$0.m7484r();
        m7484r.replaceFragment(it.buildFragment(), it.getTag());
    }
}
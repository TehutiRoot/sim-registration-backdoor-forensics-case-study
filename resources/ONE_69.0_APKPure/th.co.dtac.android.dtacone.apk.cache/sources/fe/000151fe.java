package th.p047co.dtac.android.dtacone.view.fragment.multi_sim;

import android.os.Handler;
import androidx.constraintlayout.widget.ConstraintLayout;
import com.google.firebase.sessions.settings.RemoteSettings;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.Lambda;
import th.p047co.dtac.android.dtacone.databinding.FragmentMrtrMultiSimInprogressBinding;
import th.p047co.dtac.android.dtacone.extension.view.ViewVisibleExtKt;
import th.p047co.dtac.android.dtacone.model.Resource;
import th.p047co.dtac.android.dtacone.model.StatusResource;
import th.p047co.dtac.android.dtacone.view.activity.multi_sim.MrtrPrepaidMultiSimActivity;
import th.p047co.dtac.android.dtacone.view.fragment.multi_sim.MrtrMultiSimInprogressFragment$callSubmit$2$1;
import th.p047co.dtac.android.dtacone.viewmodel.mrtr_prepaid_multi_sim.MrtrPrepaidMultiSimViewModel;
import th.p047co.dtac.android.dtacone.widget.view.DtacFontTextView;

@Metadata(m29143d1 = {"\u0000\u0014\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\b\u0002\u0010\u0000\u001a\u00020\u00012\u001a\u0010\u0002\u001a\u0016\u0012\u0004\u0012\u00020\u0004 \u0005*\n\u0012\u0004\u0012\u00020\u0004\u0018\u00010\u00030\u0003H\n¢\u0006\u0002\b\u0006"}, m29142d2 = {"<anonymous>", "", "it", "Lth/co/dtac/android/dtacone/model/Resource;", "", "kotlin.jvm.PlatformType", "invoke"}, m29141k = 3, m29140mv = {1, 8, 0}, m29138xi = 48)
/* renamed from: th.co.dtac.android.dtacone.view.fragment.multi_sim.MrtrMultiSimInprogressFragment$callSubmit$2$1 */
/* loaded from: classes9.dex */
public final class MrtrMultiSimInprogressFragment$callSubmit$2$1 extends Lambda implements Function1<Resource<? extends String>, Unit> {
    final /* synthetic */ MrtrPrepaidMultiSimViewModel $this_apply;
    final /* synthetic */ MrtrMultiSimInprogressFragment this$0;

    @Metadata(m29143d1 = {"\u0000\b\n\u0000\n\u0002\u0010\u0002\n\u0000\u0010\u0000\u001a\u00020\u0001H\n¢\u0006\u0002\b\u0002"}, m29142d2 = {"<anonymous>", "", "invoke"}, m29141k = 3, m29140mv = {1, 8, 0}, m29138xi = 48)
    /* renamed from: th.co.dtac.android.dtacone.view.fragment.multi_sim.MrtrMultiSimInprogressFragment$callSubmit$2$1$1 */
    /* loaded from: classes9.dex */
    public static final class C164011 extends Lambda implements Function0<Unit> {
        final /* synthetic */ MrtrPrepaidMultiSimViewModel $this_apply;
        final /* synthetic */ MrtrMultiSimInprogressFragment this$0;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public C164011(MrtrMultiSimInprogressFragment mrtrMultiSimInprogressFragment, MrtrPrepaidMultiSimViewModel mrtrPrepaidMultiSimViewModel) {
            super(0);
            this.this$0 = mrtrMultiSimInprogressFragment;
            this.$this_apply = mrtrPrepaidMultiSimViewModel;
        }

        /* JADX INFO: Access modifiers changed from: private */
        public static final void invoke$lambda$0(MrtrMultiSimInprogressFragment this$0) {
            MrtrPrepaidMultiSimActivity m4401o;
            Intrinsics.checkNotNullParameter(this$0, "this$0");
            m4401o = this$0.m4401o();
            m4401o.replaceFragment(MrtrMultiSimSuccessFragment.Companion.newInstance(), null);
        }

        @Override // kotlin.jvm.functions.Function0
        public /* bridge */ /* synthetic */ Unit invoke() {
            invoke2();
            return Unit.INSTANCE;
        }

        @Override // kotlin.jvm.functions.Function0
        /* renamed from: invoke  reason: avoid collision after fix types in other method */
        public final void invoke2() {
            if (this.this$0.getCount() == this.$this_apply.getSubscriberListCount()) {
                Handler handler = new Handler();
                final MrtrMultiSimInprogressFragment mrtrMultiSimInprogressFragment = this.this$0;
                handler.postDelayed(new Runnable() { // from class: th.co.dtac.android.dtacone.view.fragment.multi_sim.a
                    @Override // java.lang.Runnable
                    public final void run() {
                        MrtrMultiSimInprogressFragment$callSubmit$2$1.C164011.invoke$lambda$0(MrtrMultiSimInprogressFragment.this);
                    }
                }, 300L);
            }
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public MrtrMultiSimInprogressFragment$callSubmit$2$1(MrtrMultiSimInprogressFragment mrtrMultiSimInprogressFragment, MrtrPrepaidMultiSimViewModel mrtrPrepaidMultiSimViewModel) {
        super(1);
        this.this$0 = mrtrMultiSimInprogressFragment;
        this.$this_apply = mrtrPrepaidMultiSimViewModel;
    }

    @Override // kotlin.jvm.functions.Function1
    public /* bridge */ /* synthetic */ Unit invoke(Resource<? extends String> resource) {
        invoke2((Resource<String>) resource);
        return Unit.INSTANCE;
    }

    /* renamed from: invoke  reason: avoid collision after fix types in other method */
    public final void invoke2(Resource<String> resource) {
        int successCount;
        FragmentMrtrMultiSimInprogressBinding m4402n;
        FragmentMrtrMultiSimInprogressBinding m4402n2;
        FragmentMrtrMultiSimInprogressBinding m4402n3;
        FragmentMrtrMultiSimInprogressBinding m4402n4;
        if (resource.getStatus() == StatusResource.SUCCESS) {
            MrtrMultiSimInprogressFragment mrtrMultiSimInprogressFragment = this.this$0;
            if (Intrinsics.areEqual(resource.getData(), "onComplete")) {
                successCount = this.$this_apply.getSubscriberListCount();
            } else {
                successCount = this.$this_apply.getSuccessCount() + this.$this_apply.getErrorCount();
            }
            mrtrMultiSimInprogressFragment.setCount(successCount);
            MrtrMultiSimInprogressFragment mrtrMultiSimInprogressFragment2 = this.this$0;
            mrtrMultiSimInprogressFragment2.m4400p(mrtrMultiSimInprogressFragment2.getCount() + 1, new C164011(this.this$0, this.$this_apply));
            m4402n = this.this$0.m4402n();
            DtacFontTextView dtacFontTextView = m4402n.tvPercent;
            int count = this.this$0.getCount();
            int subscriberListCount = this.$this_apply.getSubscriberListCount();
            dtacFontTextView.setText(count + RemoteSettings.FORWARD_SLASH_STRING + subscriberListCount);
            m4402n2 = this.this$0.m4402n();
            DtacFontTextView dtacFontTextView2 = m4402n2.tvSuccessCount;
            int successCount2 = this.$this_apply.getSuccessCount();
            dtacFontTextView2.setText(successCount2 + " เบอร์");
            if (this.$this_apply.getErrorCount() > 0) {
                m4402n3 = this.this$0.m4402n();
                DtacFontTextView dtacFontTextView3 = m4402n3.tvErrorCount;
                int errorCount = this.$this_apply.getErrorCount();
                dtacFontTextView3.setText(errorCount + " เบอร์");
                m4402n4 = this.this$0.m4402n();
                ConstraintLayout constraintLayout = m4402n4.layoutFailed;
                Intrinsics.checkNotNullExpressionValue(constraintLayout, "binding.layoutFailed");
                ViewVisibleExtKt.toVisible(constraintLayout);
            }
        }
    }
}
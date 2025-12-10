package th.p047co.dtac.android.dtacone.view.appOne.pre2post.fragment.trueCompany;

import android.widget.TextView;
import androidx.appcompat.widget.LinearLayoutCompat;
import androidx.cardview.widget.CardView;
import java.util.ArrayList;
import java.util.List;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.Lambda;
import th.p047co.dtac.android.dtacone.extension.view.ViewVisibleExtKt;
import th.p047co.dtac.android.dtacone.model.Resource;
import th.p047co.dtac.android.dtacone.model.StatusResource;
import th.p047co.dtac.android.dtacone.model.appOne.pre2post.response.PropositionListItem;
import th.p047co.dtac.android.dtacone.view.appOne.pre2post.adapter.OnePre2PostPropositionAdapter;

@Metadata(m29143d1 = {"\u0000\u0018\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0000\u001a\u00020\u00012&\u0010\u0002\u001a\"\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00050\u0004 \u0006*\u0010\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00050\u0004\u0018\u00010\u00030\u0003H\n¢\u0006\u0002\b\u0007"}, m29142d2 = {"<anonymous>", "", "it", "Lth/co/dtac/android/dtacone/model/Resource;", "", "Lth/co/dtac/android/dtacone/model/appOne/pre2post/response/PropositionListItem;", "kotlin.jvm.PlatformType", "invoke"}, m29141k = 3, m29140mv = {1, 8, 0}, m29138xi = 48)
/* renamed from: th.co.dtac.android.dtacone.view.appOne.pre2post.fragment.trueCompany.OnePre2PostSelectPropositionFragment$onStart$1$1 */
/* loaded from: classes10.dex */
public final class OnePre2PostSelectPropositionFragment$onStart$1$1 extends Lambda implements Function1<Resource<? extends List<? extends PropositionListItem>>, Unit> {
    final /* synthetic */ OnePre2PostSelectPropositionFragment this$0;

    @Metadata(m29141k = 3, m29140mv = {1, 8, 0}, m29138xi = 48)
    /* renamed from: th.co.dtac.android.dtacone.view.appOne.pre2post.fragment.trueCompany.OnePre2PostSelectPropositionFragment$onStart$1$1$WhenMappings */
    /* loaded from: classes10.dex */
    public /* synthetic */ class WhenMappings {
        public static final /* synthetic */ int[] $EnumSwitchMapping$0;

        static {
            int[] iArr = new int[StatusResource.values().length];
            try {
                iArr[StatusResource.SUCCESS.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                iArr[StatusResource.LOADING.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            try {
                iArr[StatusResource.ERROR.ordinal()] = 3;
            } catch (NoSuchFieldError unused3) {
            }
            $EnumSwitchMapping$0 = iArr;
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public OnePre2PostSelectPropositionFragment$onStart$1$1(OnePre2PostSelectPropositionFragment onePre2PostSelectPropositionFragment) {
        super(1);
        this.this$0 = onePre2PostSelectPropositionFragment;
    }

    @Override // kotlin.jvm.functions.Function1
    public /* bridge */ /* synthetic */ Unit invoke(Resource<? extends List<? extends PropositionListItem>> resource) {
        invoke2((Resource<? extends List<PropositionListItem>>) resource);
        return Unit.INSTANCE;
    }

    /* renamed from: invoke  reason: avoid collision after fix types in other method */
    public final void invoke2(Resource<? extends List<PropositionListItem>> resource) {
        Resource<? extends List<PropositionListItem>> resourceContentIfNotHandled;
        CardView cardView;
        LinearLayoutCompat linearLayoutCompat;
        TextView textView;
        CardView cardView2;
        LinearLayoutCompat linearLayoutCompat2;
        TextView textView2;
        OnePre2PostPropositionAdapter m11042q;
        CardView cardView3;
        LinearLayoutCompat linearLayoutCompat3;
        TextView textView3;
        if (resource == null || (resourceContentIfNotHandled = resource.getResourceContentIfNotHandled()) == null) {
            return;
        }
        OnePre2PostSelectPropositionFragment onePre2PostSelectPropositionFragment = this.this$0;
        int i = WhenMappings.$EnumSwitchMapping$0[resourceContentIfNotHandled.getStatus().ordinal()];
        TextView textView4 = null;
        if (i != 1) {
            if (i == 2) {
                onePre2PostSelectPropositionFragment.showLoading();
                return;
            } else if (i != 3) {
                onePre2PostSelectPropositionFragment.dismissLoading();
                return;
            } else {
                onePre2PostSelectPropositionFragment.dismissLoading();
                cardView3 = onePre2PostSelectPropositionFragment.f95323l;
                if (cardView3 == null) {
                    Intrinsics.throwUninitializedPropertyAccessException("propositionListCardView");
                    cardView3 = null;
                }
                ViewVisibleExtKt.toGone(cardView3);
                linearLayoutCompat3 = onePre2PostSelectPropositionFragment.f95326o;
                if (linearLayoutCompat3 == null) {
                    Intrinsics.throwUninitializedPropertyAccessException("retryLayout");
                    linearLayoutCompat3 = null;
                }
                ViewVisibleExtKt.toVisible(linearLayoutCompat3);
                textView3 = onePre2PostSelectPropositionFragment.f95325n;
                if (textView3 == null) {
                    Intrinsics.throwUninitializedPropertyAccessException("notFoundItemTextView");
                } else {
                    textView4 = textView3;
                }
                ViewVisibleExtKt.toGone(textView4);
                return;
            }
        }
        onePre2PostSelectPropositionFragment.dismissLoading();
        List<PropositionListItem> data = resourceContentIfNotHandled.getData();
        if ((data != null ? data.size() : 0) > 0) {
            cardView2 = onePre2PostSelectPropositionFragment.f95323l;
            if (cardView2 == null) {
                Intrinsics.throwUninitializedPropertyAccessException("propositionListCardView");
                cardView2 = null;
            }
            ViewVisibleExtKt.toVisible(cardView2);
            linearLayoutCompat2 = onePre2PostSelectPropositionFragment.f95326o;
            if (linearLayoutCompat2 == null) {
                Intrinsics.throwUninitializedPropertyAccessException("retryLayout");
                linearLayoutCompat2 = null;
            }
            ViewVisibleExtKt.toGone(linearLayoutCompat2);
            textView2 = onePre2PostSelectPropositionFragment.f95325n;
            if (textView2 == null) {
                Intrinsics.throwUninitializedPropertyAccessException("notFoundItemTextView");
            } else {
                textView4 = textView2;
            }
            ViewVisibleExtKt.toGone(textView4);
            m11042q = onePre2PostSelectPropositionFragment.m11042q();
            List<PropositionListItem> data2 = resourceContentIfNotHandled.getData();
            if (data2 == null) {
                data2 = new ArrayList<>();
            }
            m11042q.update(data2);
            return;
        }
        cardView = onePre2PostSelectPropositionFragment.f95323l;
        if (cardView == null) {
            Intrinsics.throwUninitializedPropertyAccessException("propositionListCardView");
            cardView = null;
        }
        ViewVisibleExtKt.toGone(cardView);
        linearLayoutCompat = onePre2PostSelectPropositionFragment.f95326o;
        if (linearLayoutCompat == null) {
            Intrinsics.throwUninitializedPropertyAccessException("retryLayout");
            linearLayoutCompat = null;
        }
        ViewVisibleExtKt.toGone(linearLayoutCompat);
        textView = onePre2PostSelectPropositionFragment.f95325n;
        if (textView == null) {
            Intrinsics.throwUninitializedPropertyAccessException("notFoundItemTextView");
        } else {
            textView4 = textView;
        }
        ViewVisibleExtKt.toVisible(textView4);
    }
}
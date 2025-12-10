package th.p047co.dtac.android.dtacone.view.appOne.pre2post.fragment;

import android.graphics.drawable.Drawable;
import android.widget.ImageView;
import android.widget.TextView;
import androidx.appcompat.content.res.AppCompatResources;
import kotlin.Metadata;
import kotlin.Pair;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.Lambda;
import th.p047co.dtac.android.dtacone.extension.format.StringExtKt;
import th.p047co.dtac.android.dtacone.model.Resource;
import th.p047co.dtac.android.dtacone.model.StatusResource;

@Metadata(m29143d1 = {"\u0000\u001c\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\b\n\u0002\u0010\u000e\n\u0002\b\u0002\u0010\u0000\u001a\u00020\u000122\u0010\u0002\u001a.\u0012\u0010\u0012\u000e\u0012\u0004\u0012\u00020\u0005\u0012\u0004\u0012\u00020\u00060\u0004 \u0007*\u0016\u0012\u0010\u0012\u000e\u0012\u0004\u0012\u00020\u0005\u0012\u0004\u0012\u00020\u00060\u0004\u0018\u00010\u00030\u0003H\n¢\u0006\u0002\b\b"}, m29142d2 = {"<anonymous>", "", "it", "Lth/co/dtac/android/dtacone/model/Resource;", "Lkotlin/Pair;", "", "", "kotlin.jvm.PlatformType", "invoke"}, m29141k = 3, m29140mv = {1, 8, 0}, m29138xi = 48)
/* renamed from: th.co.dtac.android.dtacone.view.appOne.pre2post.fragment.OnePre2PostRecommendedPackageFragment$onStart$1$5 */
/* loaded from: classes10.dex */
public final class OnePre2PostRecommendedPackageFragment$onStart$1$5 extends Lambda implements Function1<Resource<? extends Pair<? extends Integer, ? extends String>>, Unit> {
    final /* synthetic */ OnePre2PostRecommendedPackageFragment this$0;

    @Metadata(m29141k = 3, m29140mv = {1, 8, 0}, m29138xi = 48)
    /* renamed from: th.co.dtac.android.dtacone.view.appOne.pre2post.fragment.OnePre2PostRecommendedPackageFragment$onStart$1$5$WhenMappings */
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
    public OnePre2PostRecommendedPackageFragment$onStart$1$5(OnePre2PostRecommendedPackageFragment onePre2PostRecommendedPackageFragment) {
        super(1);
        this.this$0 = onePre2PostRecommendedPackageFragment;
    }

    @Override // kotlin.jvm.functions.Function1
    public /* bridge */ /* synthetic */ Unit invoke(Resource<? extends Pair<? extends Integer, ? extends String>> resource) {
        invoke2((Resource<Pair<Integer, String>>) resource);
        return Unit.INSTANCE;
    }

    /* renamed from: invoke  reason: avoid collision after fix types in other method */
    public final void invoke2(Resource<Pair<Integer, String>> resource) {
        Pair<Integer, String> data;
        TextView textView;
        String str;
        ImageView imageView;
        if (resource != null) {
            OnePre2PostRecommendedPackageFragment onePre2PostRecommendedPackageFragment = this.this$0;
            if (WhenMappings.$EnumSwitchMapping$0[resource.getStatus().ordinal()] == 1 && (data = resource.getData()) != null) {
                Drawable drawable = AppCompatResources.getDrawable(onePre2PostRecommendedPackageFragment.requireContext(), data.getFirst().intValue());
                TextView textView2 = null;
                if (drawable != null) {
                    imageView = onePre2PostRecommendedPackageFragment.f95015n;
                    if (imageView == null) {
                        Intrinsics.throwUninitializedPropertyAccessException("ivArpu");
                        imageView = null;
                    }
                    imageView.setImageDrawable(drawable);
                }
                textView = onePre2PostRecommendedPackageFragment.f95013l;
                if (textView == null) {
                    Intrinsics.throwUninitializedPropertyAccessException("tvArpu");
                } else {
                    textView2 = textView;
                }
                if (data.getSecond().length() > 0) {
                    str = StringExtKt.formatMoneyWithDecimal(data.getSecond());
                } else {
                    str = "0.00";
                }
                textView2.setText("ARPU " + str + " บาท");
            }
        }
    }
}
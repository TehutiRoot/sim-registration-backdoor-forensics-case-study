package th.p047co.dtac.android.dtacone.view.appOne.report.fragment;

import android.util.Base64;
import com.github.barteksc.pdfviewer.PDFView;
import com.github.barteksc.pdfviewer.scroll.DefaultScrollHandle;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.Lambda;
import th.p047co.dtac.android.dtacone.databinding.FragmentRtrOneWithholdingtaxPreviewBinding;
import th.p047co.dtac.android.dtacone.model.Resource;
import th.p047co.dtac.android.dtacone.model.StatusResource;

@Metadata(m29143d1 = {"\u0000\u0014\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\b\u0002\u0010\u0000\u001a\u00020\u00012\u001a\u0010\u0002\u001a\u0016\u0012\u0004\u0012\u00020\u0004 \u0005*\n\u0012\u0004\u0012\u00020\u0004\u0018\u00010\u00030\u0003H\n¢\u0006\u0002\b\u0006"}, m29142d2 = {"<anonymous>", "", "it", "Lth/co/dtac/android/dtacone/model/Resource;", "", "kotlin.jvm.PlatformType", "invoke"}, m29141k = 3, m29140mv = {1, 8, 0}, m29138xi = 48)
/* renamed from: th.co.dtac.android.dtacone.view.appOne.report.fragment.OneWithHoldingTaxPreviewFragment$setupObserve$1 */
/* loaded from: classes10.dex */
public final class OneWithHoldingTaxPreviewFragment$setupObserve$1 extends Lambda implements Function1<Resource<? extends String>, Unit> {
    final /* synthetic */ OneWithHoldingTaxPreviewFragment this$0;

    @Metadata(m29141k = 3, m29140mv = {1, 8, 0}, m29138xi = 48)
    /* renamed from: th.co.dtac.android.dtacone.view.appOne.report.fragment.OneWithHoldingTaxPreviewFragment$setupObserve$1$WhenMappings */
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
    public OneWithHoldingTaxPreviewFragment$setupObserve$1(OneWithHoldingTaxPreviewFragment oneWithHoldingTaxPreviewFragment) {
        super(1);
        this.this$0 = oneWithHoldingTaxPreviewFragment;
    }

    @Override // kotlin.jvm.functions.Function1
    public /* bridge */ /* synthetic */ Unit invoke(Resource<? extends String> resource) {
        invoke2((Resource<String>) resource);
        return Unit.INSTANCE;
    }

    /* renamed from: invoke  reason: avoid collision after fix types in other method */
    public final void invoke2(Resource<String> resource) {
        Resource<String> resourceContentIfNotHandled;
        FragmentRtrOneWithholdingtaxPreviewBinding m10250w;
        byte[] bArr;
        if (resource == null || (resourceContentIfNotHandled = resource.getResourceContentIfNotHandled()) == null) {
            return;
        }
        OneWithHoldingTaxPreviewFragment oneWithHoldingTaxPreviewFragment = this.this$0;
        int i = WhenMappings.$EnumSwitchMapping$0[resourceContentIfNotHandled.getStatus().ordinal()];
        if (i != 1) {
            if (i == 2) {
                oneWithHoldingTaxPreviewFragment.showSecondaryLoading();
                return;
            } else if (i != 3) {
                return;
            } else {
                oneWithHoldingTaxPreviewFragment.dismissSecondaryLoading();
                oneWithHoldingTaxPreviewFragment.m10269A(false);
                return;
            }
        }
        oneWithHoldingTaxPreviewFragment.dismissSecondaryLoading();
        String data = resourceContentIfNotHandled.getData();
        if (data == null) {
            oneWithHoldingTaxPreviewFragment.m10269A(false);
            return;
        }
        byte[] decode = Base64.decode(data, 0);
        Intrinsics.checkNotNullExpressionValue(decode, "decode(imageBase64, Base64.DEFAULT)");
        oneWithHoldingTaxPreviewFragment.f96507j = decode;
        m10250w = oneWithHoldingTaxPreviewFragment.m10250w();
        PDFView pDFView = m10250w.pdfView;
        bArr = oneWithHoldingTaxPreviewFragment.f96507j;
        if (bArr == null) {
            Intrinsics.throwUninitializedPropertyAccessException("pdfBuffer");
            bArr = null;
        }
        pDFView.fromBytes(bArr).enableAnnotationRendering(true).scrollHandle(new DefaultScrollHandle(oneWithHoldingTaxPreviewFragment.getContext())).spacing(10).load();
        oneWithHoldingTaxPreviewFragment.m10269A(true);
    }
}
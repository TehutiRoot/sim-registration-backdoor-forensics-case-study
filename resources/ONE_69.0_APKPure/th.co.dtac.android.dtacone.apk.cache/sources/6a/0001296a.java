package th.p047co.dtac.android.dtacone.view.appOne.activateSim.fragment;

import android.os.Handler;
import android.os.Looper;
import androidx.cardview.widget.CardView;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.Lambda;
import th.p047co.dtac.android.dtacone.app_one.widget.OneFontTextView;
import th.p047co.dtac.android.dtacone.extension.view.ViewVisibleExtKt;
import th.p047co.dtac.android.dtacone.model.Resource;
import th.p047co.dtac.android.dtacone.model.StatusResource;
import th.p047co.dtac.android.dtacone.view.appOne.activateSim.viewModel.OneActivateSimViewModel;

@Metadata(m29143d1 = {"\u0000\u0014\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\b\u0002\u0010\u0000\u001a\u00020\u00012\u001a\u0010\u0002\u001a\u0016\u0012\u0004\u0012\u00020\u0004 \u0005*\n\u0012\u0004\u0012\u00020\u0004\u0018\u00010\u00030\u0003H\n¢\u0006\u0002\b\u0006"}, m29142d2 = {"<anonymous>", "", "it", "Lth/co/dtac/android/dtacone/model/Resource;", "", "kotlin.jvm.PlatformType", "invoke"}, m29141k = 3, m29140mv = {1, 8, 0}, m29138xi = 48)
/* renamed from: th.co.dtac.android.dtacone.view.appOne.activateSim.fragment.OneActivateSimScanBarcodeFragment$setupObserve$3 */
/* loaded from: classes10.dex */
public final class OneActivateSimScanBarcodeFragment$setupObserve$3 extends Lambda implements Function1<Resource<? extends String>, Unit> {
    final /* synthetic */ OneActivateSimScanBarcodeFragment this$0;

    @Metadata(m29141k = 3, m29140mv = {1, 8, 0}, m29138xi = 48)
    /* renamed from: th.co.dtac.android.dtacone.view.appOne.activateSim.fragment.OneActivateSimScanBarcodeFragment$setupObserve$3$WhenMappings */
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
    public OneActivateSimScanBarcodeFragment$setupObserve$3(OneActivateSimScanBarcodeFragment oneActivateSimScanBarcodeFragment) {
        super(1);
        this.this$0 = oneActivateSimScanBarcodeFragment;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void invoke$lambda$1$lambda$0(OneActivateSimScanBarcodeFragment this$0) {
        CardView cardView;
        Intrinsics.checkNotNullParameter(this$0, "this$0");
        cardView = this$0.f88147l;
        if (cardView == null) {
            Intrinsics.throwUninitializedPropertyAccessException("errorScanView");
            cardView = null;
        }
        ViewVisibleExtKt.toInVisible(cardView);
    }

    @Override // kotlin.jvm.functions.Function1
    public /* bridge */ /* synthetic */ Unit invoke(Resource<? extends String> resource) {
        invoke2((Resource<String>) resource);
        return Unit.INSTANCE;
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r6v15, types: [androidx.cardview.widget.CardView] */
    /* JADX WARN: Type inference failed for: r6v17, types: [androidx.cardview.widget.CardView] */
    /* renamed from: invoke  reason: avoid collision after fix types in other method */
    public final void invoke2(Resource<String> resource) {
        Resource<String> resourceContentIfNotHandled;
        CardView cardView;
        OneFontTextView oneFontTextView;
        OneFontTextView oneFontTextView2;
        OneActivateSimViewModel m16130o;
        OneFontTextView oneFontTextView3;
        OneActivateSimViewModel m16130o2;
        ?? r6;
        ?? r62;
        if (resource == null || (resourceContentIfNotHandled = resource.getResourceContentIfNotHandled()) == null) {
            return;
        }
        final OneActivateSimScanBarcodeFragment oneActivateSimScanBarcodeFragment = this.this$0;
        int i = WhenMappings.$EnumSwitchMapping$0[resourceContentIfNotHandled.getStatus().ordinal()];
        OneFontTextView oneFontTextView4 = null;
        if (i != 1) {
            if (i == 2) {
                r6 = oneActivateSimScanBarcodeFragment.f88147l;
                if (r6 == 0) {
                    Intrinsics.throwUninitializedPropertyAccessException("errorScanView");
                } else {
                    oneFontTextView4 = r6;
                }
                ViewVisibleExtKt.toInVisible(oneFontTextView4);
                oneActivateSimScanBarcodeFragment.showSecondaryLoading();
                return;
            } else if (i != 3) {
                return;
            } else {
                r62 = oneActivateSimScanBarcodeFragment.f88147l;
                if (r62 == 0) {
                    Intrinsics.throwUninitializedPropertyAccessException("errorScanView");
                } else {
                    oneFontTextView4 = r62;
                }
                ViewVisibleExtKt.toInVisible(oneFontTextView4);
                oneActivateSimScanBarcodeFragment.dismissSecondaryLoading();
                return;
            }
        }
        oneActivateSimScanBarcodeFragment.dismissSecondaryLoading();
        cardView = oneActivateSimScanBarcodeFragment.f88147l;
        if (cardView == null) {
            Intrinsics.throwUninitializedPropertyAccessException("errorScanView");
            cardView = null;
        }
        ViewVisibleExtKt.toVisible(cardView);
        oneFontTextView = oneActivateSimScanBarcodeFragment.f88148m;
        if (oneFontTextView == null) {
            Intrinsics.throwUninitializedPropertyAccessException("errorDetailText");
            oneFontTextView = null;
        }
        oneFontTextView.setText(resourceContentIfNotHandled.getData());
        oneFontTextView2 = oneActivateSimScanBarcodeFragment.f88149n;
        if (oneFontTextView2 == null) {
            Intrinsics.throwUninitializedPropertyAccessException("errorCodeText");
            oneFontTextView2 = null;
        }
        m16130o = oneActivateSimScanBarcodeFragment.m16130o();
        oneFontTextView2.setText("code: " + m16130o.getErrorCode());
        oneFontTextView3 = oneActivateSimScanBarcodeFragment.f88150o;
        if (oneFontTextView3 == null) {
            Intrinsics.throwUninitializedPropertyAccessException("errorTimeText");
        } else {
            oneFontTextView4 = oneFontTextView3;
        }
        m16130o2 = oneActivateSimScanBarcodeFragment.m16130o();
        oneFontTextView4.setText("วันที่ " + m16130o2.getErrorTime());
        new Handler(Looper.getMainLooper()).postDelayed(new Runnable() { // from class: th.co.dtac.android.dtacone.view.appOne.activateSim.fragment.a
            @Override // java.lang.Runnable
            public final void run() {
                OneActivateSimScanBarcodeFragment$setupObserve$3.invoke$lambda$1$lambda$0(OneActivateSimScanBarcodeFragment.this);
            }
        }, 3000L);
    }
}
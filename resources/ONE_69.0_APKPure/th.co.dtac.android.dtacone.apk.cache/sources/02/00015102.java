package th.p047co.dtac.android.dtacone.view.fragment.mrtr_pre2post;

import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Lambda;
import th.p047co.dtac.android.dtacone.model.Resource;

@Metadata(m29143d1 = {"\u0000\u0012\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010\u000b\n\u0000\u0010\u0000\u001a\u00020\u00012\f\u0010\u0002\u001a\b\u0012\u0004\u0012\u00020\u00040\u0003H\n¢\u0006\u0002\b\u0005"}, m29142d2 = {"<anonymous>", "", "it", "Lth/co/dtac/android/dtacone/model/Resource;", "", "invoke"}, m29141k = 3, m29140mv = {1, 8, 0}, m29138xi = 48)
/* renamed from: th.co.dtac.android.dtacone.view.fragment.mrtr_pre2post.MrtrPre2PostSmartCardFragment$onStart$1$4 */
/* loaded from: classes9.dex */
public final class MrtrPre2PostSmartCardFragment$onStart$1$4 extends Lambda implements Function1<Resource<? extends Boolean>, Unit> {
    final /* synthetic */ MrtrPre2PostSmartCardFragment this$0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public MrtrPre2PostSmartCardFragment$onStart$1$4(MrtrPre2PostSmartCardFragment mrtrPre2PostSmartCardFragment) {
        super(1);
        this.this$0 = mrtrPre2PostSmartCardFragment;
    }

    @Override // kotlin.jvm.functions.Function1
    public /* bridge */ /* synthetic */ Unit invoke(Resource<? extends Boolean> resource) {
        invoke2((Resource<Boolean>) resource);
        return Unit.INSTANCE;
    }

    /* JADX WARN: Code restructure failed: missing block: B:8:0x0027, code lost:
        r3 = r2.this$0.m5060A();
     */
    /* renamed from: invoke  reason: avoid collision after fix types in other method */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final void invoke2(@org.jetbrains.annotations.NotNull th.p047co.dtac.android.dtacone.model.Resource<java.lang.Boolean> r3) {
        /*
            r2 = this;
            java.lang.String r0 = "it"
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(r3, r0)
            th.co.dtac.android.dtacone.model.StatusResource r0 = r3.getStatus()
            th.co.dtac.android.dtacone.model.StatusResource r1 = th.p047co.dtac.android.dtacone.model.StatusResource.SUCCESS
            if (r0 != r1) goto L5c
            java.lang.Object r3 = r3.getData()
            java.lang.Boolean r0 = java.lang.Boolean.TRUE
            boolean r3 = kotlin.jvm.internal.Intrinsics.areEqual(r3, r0)
            if (r3 == 0) goto L5c
            th.co.dtac.android.dtacone.view.fragment.mrtr_pre2post.MrtrPre2PostSmartCardFragment r3 = r2.this$0
            th.co.dtac.android.dtacone.util.FileUtil r3 = r3.getFileUtil()
            java.lang.String r0 = "compare.jpg"
            boolean r3 = r3.isFileExist(r0)
            if (r3 == 0) goto L3c
            th.co.dtac.android.dtacone.view.fragment.mrtr_pre2post.MrtrPre2PostSmartCardFragment r3 = r2.this$0
            java.lang.String r3 = th.p047co.dtac.android.dtacone.view.fragment.mrtr_pre2post.MrtrPre2PostSmartCardFragment.access$tagFace(r3)
            if (r3 == 0) goto L3c
            int r3 = r3.length()
            if (r3 != 0) goto L36
            goto L3c
        L36:
            th.co.dtac.android.dtacone.view.fragment.mrtr_pre2post.MrtrPre2PostSmartCardFragment r3 = r2.this$0
            th.p047co.dtac.android.dtacone.view.fragment.mrtr_pre2post.MrtrPre2PostSmartCardFragment.access$gotoFaceRecognition(r3)
            goto L5c
        L3c:
            th.co.dtac.android.dtacone.view.fragment.mrtr_pre2post.MrtrPre2PostSmartCardFragment r3 = r2.this$0
            androidx.fragment.app.FragmentActivity r3 = r3.requireActivity()
            java.lang.String r0 = "null cannot be cast to non-null type th.co.dtac.android.dtacone.view.activity.mrtr_pre2post.MrtrPre2PostActivity"
            kotlin.jvm.internal.Intrinsics.checkNotNull(r3, r0)
            th.co.dtac.android.dtacone.view.activity.mrtr_pre2post.MrtrPre2PostActivity r3 = (th.p047co.dtac.android.dtacone.view.activity.mrtr_pre2post.MrtrPre2PostActivity) r3
            th.co.dtac.android.dtacone.view.fragment.mrtr_pre2post.camera.MrtrPre2PostCameraCustomerFragment$Companion r0 = th.p047co.dtac.android.dtacone.view.fragment.mrtr_pre2post.camera.MrtrPre2PostCameraCustomerFragment.Companion
            th.co.dtac.android.dtacone.view.fragment.mrtr_pre2post.camera.MrtrPre2PostCameraCustomerFragment r0 = r0.newInstance()
            java.lang.Class<th.co.dtac.android.dtacone.view.fragment.mrtr_pre2post.camera.MrtrPre2PostCameraCustomerFragment> r1 = th.p047co.dtac.android.dtacone.view.fragment.mrtr_pre2post.camera.MrtrPre2PostCameraCustomerFragment.class
            kotlin.reflect.KClass r1 = kotlin.jvm.internal.Reflection.getOrCreateKotlinClass(r1)
            java.lang.String r1 = r1.getSimpleName()
            r3.replaceFragment(r0, r1)
        L5c:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: th.p047co.dtac.android.dtacone.view.fragment.mrtr_pre2post.MrtrPre2PostSmartCardFragment$onStart$1$4.invoke2(th.co.dtac.android.dtacone.model.Resource):void");
    }
}
package th.p047co.dtac.android.dtacone.adapter.slide_image;

import android.view.ViewGroup;
import androidx.compose.runtime.internal.StabilityInferred;
import androidx.fragment.app.Fragment;
import androidx.fragment.app.FragmentManager;
import androidx.fragment.app.FragmentStatePagerAdapter;
import com.chuckerteam.chucker.internal.support.ResponseProcessor;
import com.google.android.gms.common.internal.ServiceSpecificExtraArgs;
import com.tom_roush.pdfbox.contentstream.operator.OperatorName;
import java.util.ArrayList;
import kotlin.Metadata;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import th.p047co.dtac.android.dtacone.view.fragment.slide_image.SlideImageFragment;

@StabilityInferred(parameters = 0)
@Metadata(m28851d1 = {"\u0000\\\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0003\n\u0002\u0010\b\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0018\u0002\n\u0002\b\u0007\b\u0007\u0018\u00002\u00020\u00012\u00020\u0002:\u0001,B1\u0012\u0006\u0010\u0004\u001a\u00020\u0003\u0012\u0016\u0010\b\u001a\u0012\u0012\u0004\u0012\u00020\u00060\u0005j\b\u0012\u0004\u0012\u00020\u0006`\u0007\u0012\b\b\u0002\u0010\n\u001a\u00020\t¢\u0006\u0004\b\u000b\u0010\fJ\u000f\u0010\u000e\u001a\u00020\rH\u0016¢\u0006\u0004\b\u000e\u0010\u000fJ\u0017\u0010\u0012\u001a\u00020\u00112\u0006\u0010\u0010\u001a\u00020\rH\u0016¢\u0006\u0004\b\u0012\u0010\u0013J'\u0010\u0019\u001a\u00020\u00182\u0006\u0010\u0015\u001a\u00020\u00142\u0006\u0010\u0010\u001a\u00020\r2\u0006\u0010\u0017\u001a\u00020\u0016H\u0016¢\u0006\u0004\b\u0019\u0010\u001aJ\u0017\u0010\u001c\u001a\u00020\u00182\u0006\u0010\u001b\u001a\u00020\u0006H\u0016¢\u0006\u0004\b\u001c\u0010\u001dJ\u0015\u0010 \u001a\u00020\u00182\u0006\u0010\u001f\u001a\u00020\u001e¢\u0006\u0004\b \u0010!R$\u0010\b\u001a\u0012\u0012\u0004\u0012\u00020\u00060\u0005j\b\u0012\u0004\u0012\u00020\u0006`\u00078\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\"\u0010#R\u0014\u0010\n\u001a\u00020\t8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b$\u0010%R\u0016\u0010)\u001a\u00020&8\u0002@\u0002X\u0082.¢\u0006\u0006\n\u0004\b'\u0010(R\u0018\u0010\u001f\u001a\u0004\u0018\u00010\u001e8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b*\u0010+¨\u0006-"}, m28850d2 = {"Lth/co/dtac/android/dtacone/adapter/slide_image/ImageViewPager;", "Landroidx/fragment/app/FragmentStatePagerAdapter;", "Lth/co/dtac/android/dtacone/view/fragment/slide_image/SlideImageFragment$OnClickFullImage;", "Landroidx/fragment/app/FragmentManager;", "fragmentManger", "Ljava/util/ArrayList;", "", "Lkotlin/collections/ArrayList;", "imageNames", "", "cannotDelete", "<init>", "(Landroidx/fragment/app/FragmentManager;Ljava/util/ArrayList;Z)V", "", "getCount", "()I", "position", "Landroidx/fragment/app/Fragment;", "getItem", "(I)Landroidx/fragment/app/Fragment;", "Landroid/view/ViewGroup;", "container", "", "object", "", "destroyItem", "(Landroid/view/ViewGroup;ILjava/lang/Object;)V", ResponseProcessor.CONTENT_TYPE_IMAGE, "onClickImage", "(Ljava/lang/String;)V", "Lth/co/dtac/android/dtacone/adapter/slide_image/ImageViewPager$OnClickFullImage;", ServiceSpecificExtraArgs.CastExtraArgs.LISTENER, "setListener", "(Lth/co/dtac/android/dtacone/adapter/slide_image/ImageViewPager$OnClickFullImage;)V", OperatorName.SET_LINE_JOINSTYLE, "Ljava/util/ArrayList;", OperatorName.NON_STROKING_CMYK, "Z", "Lth/co/dtac/android/dtacone/view/fragment/slide_image/SlideImageFragment;", OperatorName.LINE_TO, "Lth/co/dtac/android/dtacone/view/fragment/slide_image/SlideImageFragment;", "slideImageFragment", OperatorName.MOVE_TO, "Lth/co/dtac/android/dtacone/adapter/slide_image/ImageViewPager$OnClickFullImage;", "OnClickFullImage", "app_prodRelease"}, m28849k = 1, m28848mv = {1, 8, 0})
/* renamed from: th.co.dtac.android.dtacone.adapter.slide_image.ImageViewPager */
/* loaded from: classes7.dex */
public final class ImageViewPager extends FragmentStatePagerAdapter implements SlideImageFragment.OnClickFullImage {
    public static final int $stable = 8;

    /* renamed from: j */
    public final ArrayList f81522j;

    /* renamed from: k */
    public final boolean f81523k;

    /* renamed from: l */
    public SlideImageFragment f81524l;

    /* renamed from: m */
    public OnClickFullImage f81525m;

    @Metadata(m28851d1 = {"\u0000\u0016\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0010\u000e\n\u0000\bf\u0018\u00002\u00020\u0001J\u0010\u0010\u0002\u001a\u00020\u00032\u0006\u0010\u0004\u001a\u00020\u0005H&¨\u0006\u0006"}, m28850d2 = {"Lth/co/dtac/android/dtacone/adapter/slide_image/ImageViewPager$OnClickFullImage;", "", "onClickImage", "", ResponseProcessor.CONTENT_TYPE_IMAGE, "", "app_prodRelease"}, m28849k = 1, m28848mv = {1, 8, 0}, m28846xi = 48)
    /* renamed from: th.co.dtac.android.dtacone.adapter.slide_image.ImageViewPager$OnClickFullImage */
    /* loaded from: classes7.dex */
    public interface OnClickFullImage {
        void onClickImage(@NotNull String str);
    }

    public /* synthetic */ ImageViewPager(FragmentManager fragmentManager, ArrayList arrayList, boolean z, int i, DefaultConstructorMarker defaultConstructorMarker) {
        this(fragmentManager, arrayList, (i & 4) != 0 ? false : z);
    }

    @Override // androidx.fragment.app.FragmentStatePagerAdapter, androidx.viewpager.widget.PagerAdapter
    public void destroyItem(@NotNull ViewGroup container, int i, @NotNull Object object) {
        Intrinsics.checkNotNullParameter(container, "container");
        Intrinsics.checkNotNullParameter(object, "object");
        super.destroyItem(container, i, object);
    }

    @Override // androidx.viewpager.widget.PagerAdapter
    public int getCount() {
        return this.f81522j.size();
    }

    @Override // androidx.fragment.app.FragmentStatePagerAdapter
    @NotNull
    public Fragment getItem(int i) {
        SlideImageFragment newInstance;
        if (this.f81523k) {
            SlideImageFragment.Companion companion = SlideImageFragment.Companion;
            Object obj = this.f81522j.get(i);
            Intrinsics.checkNotNullExpressionValue(obj, "imageNames[position]");
            newInstance = companion.newInstance((String) obj, true);
        } else {
            SlideImageFragment.Companion companion2 = SlideImageFragment.Companion;
            Object obj2 = this.f81522j.get(i);
            Intrinsics.checkNotNullExpressionValue(obj2, "imageNames[position]");
            newInstance = companion2.newInstance((String) obj2);
        }
        this.f81524l = newInstance;
        if (newInstance == null) {
            Intrinsics.throwUninitializedPropertyAccessException("slideImageFragment");
            newInstance = null;
        }
        newInstance.setListener(this);
        SlideImageFragment slideImageFragment = this.f81524l;
        if (slideImageFragment == null) {
            Intrinsics.throwUninitializedPropertyAccessException("slideImageFragment");
            return null;
        }
        return slideImageFragment;
    }

    @Override // th.p047co.dtac.android.dtacone.view.fragment.slide_image.SlideImageFragment.OnClickFullImage
    public void onClickImage(@NotNull String image) {
        Intrinsics.checkNotNullParameter(image, "image");
        OnClickFullImage onClickFullImage = this.f81525m;
        if (onClickFullImage != null) {
            onClickFullImage.onClickImage(image);
        }
    }

    public final void setListener(@NotNull OnClickFullImage listener) {
        Intrinsics.checkNotNullParameter(listener, "listener");
        this.f81525m = listener;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public ImageViewPager(@NotNull FragmentManager fragmentManger, @NotNull ArrayList<String> imageNames, boolean z) {
        super(fragmentManger);
        Intrinsics.checkNotNullParameter(fragmentManger, "fragmentManger");
        Intrinsics.checkNotNullParameter(imageNames, "imageNames");
        this.f81522j = imageNames;
        this.f81523k = z;
    }
}

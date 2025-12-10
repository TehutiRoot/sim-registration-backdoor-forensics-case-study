package th.p047co.dtac.android.dtacone.util.image;

import android.content.Context;
import android.graphics.Bitmap;
import android.widget.ImageView;
import androidx.compose.runtime.internal.StabilityInferred;
import androidx.core.graphics.drawable.RoundedBitmapDrawable;
import androidx.core.graphics.drawable.RoundedBitmapDrawableFactory;
import ch.qos.logback.core.CoreConstants;
import com.bumptech.glide.Glide;
import com.bumptech.glide.RequestBuilder;
import com.bumptech.glide.request.target.BitmapImageViewTarget;
import com.google.android.gms.common.internal.ImagesContract;
import kotlin.Metadata;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import th.p047co.dtac.android.dtacone.R;

@StabilityInferred(parameters = 0)
@Metadata(m29143d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\b\u0017\u0018\u0000 \u00032\u00020\u0001:\u0001\u0003B\u0005¢\u0006\u0002\u0010\u0002¨\u0006\u0004"}, m29142d2 = {"Lth/co/dtac/android/dtacone/util/image/ProfileImageUtil;", "", "()V", "Companion", "app_prodRelease"}, m29141k = 1, m29140mv = {1, 8, 0}, m29138xi = 48)
/* renamed from: th.co.dtac.android.dtacone.util.image.ProfileImageUtil */
/* loaded from: classes8.dex */
public class ProfileImageUtil {
    public static final int $stable = 0;
    @NotNull
    public static final Companion Companion = new Companion(null);

    @Metadata(m29143d1 = {"\u0000,\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\u0002\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0000\b\u0086\u0003\u0018\u00002\u00020\u0001B\u0007\b\u0002¢\u0006\u0002\u0010\u0002J\u001e\u0010\u0003\u001a\u00020\u00042\u0006\u0010\u0005\u001a\u00020\u00062\u0006\u0010\u0007\u001a\u00020\b2\u0006\u0010\t\u001a\u00020\nJ\u001e\u0010\u000b\u001a\u00020\u00042\u0006\u0010\f\u001a\u00020\r2\u0006\u0010\u0007\u001a\u00020\b2\u0006\u0010\t\u001a\u00020\n¨\u0006\u000e"}, m29142d2 = {"Lth/co/dtac/android/dtacone/util/image/ProfileImageUtil$Companion;", "", "()V", "loadProfileDefaultImage", "", "id", "", CoreConstants.CONTEXT_SCOPE_VALUE, "Landroid/content/Context;", "imageView", "Landroid/widget/ImageView;", "loadProfileImage", ImagesContract.URL, "", "app_prodRelease"}, m29141k = 1, m29140mv = {1, 8, 0}, m29138xi = 48)
    /* renamed from: th.co.dtac.android.dtacone.util.image.ProfileImageUtil$Companion */
    /* loaded from: classes8.dex */
    public static final class Companion {
        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        public final void loadProfileDefaultImage(int i, @NotNull final Context context, @NotNull final ImageView imageView) {
            Intrinsics.checkNotNullParameter(context, "context");
            Intrinsics.checkNotNullParameter(imageView, "imageView");
            Glide.with(context).asBitmap().m74218load(Integer.valueOf(i)).fitCenter().error(R.drawable.image_profile_default).into((RequestBuilder) new BitmapImageViewTarget(imageView, context) { // from class: th.co.dtac.android.dtacone.util.image.ProfileImageUtil$Companion$loadProfileDefaultImage$1

                /* renamed from: i */
                public final /* synthetic */ ImageView f87202i;

                /* renamed from: j */
                public final /* synthetic */ Context f87203j;

                /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                {
                    super(imageView);
                    this.f87202i = imageView;
                    this.f87203j = context;
                }

                /* JADX WARN: Can't rename method to resolve collision */
                @Override // com.bumptech.glide.request.target.BitmapImageViewTarget, com.bumptech.glide.request.target.ImageViewTarget
                public void setResource(@Nullable Bitmap bitmap) {
                    RoundedBitmapDrawable create = RoundedBitmapDrawableFactory.create(this.f87203j.getResources(), bitmap);
                    Intrinsics.checkNotNullExpressionValue(create, "create(context.resources, resource)");
                    create.setCircular(true);
                    this.f87202i.setImageDrawable(create);
                }
            });
        }

        public final void loadProfileImage(@NotNull String url, @NotNull final Context context, @NotNull final ImageView imageView) {
            Intrinsics.checkNotNullParameter(url, "url");
            Intrinsics.checkNotNullParameter(context, "context");
            Intrinsics.checkNotNullParameter(imageView, "imageView");
            Glide.with(context).asBitmap().m74220load(url).fitCenter().error(R.drawable.image_profile_default).into((RequestBuilder) new BitmapImageViewTarget(imageView, context) { // from class: th.co.dtac.android.dtacone.util.image.ProfileImageUtil$Companion$loadProfileImage$1

                /* renamed from: i */
                public final /* synthetic */ ImageView f87204i;

                /* renamed from: j */
                public final /* synthetic */ Context f87205j;

                /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                {
                    super(imageView);
                    this.f87204i = imageView;
                    this.f87205j = context;
                }

                /* JADX WARN: Can't rename method to resolve collision */
                @Override // com.bumptech.glide.request.target.BitmapImageViewTarget, com.bumptech.glide.request.target.ImageViewTarget
                public void setResource(@Nullable Bitmap bitmap) {
                    RoundedBitmapDrawable create = RoundedBitmapDrawableFactory.create(this.f87205j.getResources(), bitmap);
                    Intrinsics.checkNotNullExpressionValue(create, "create(context.resources, resource)");
                    create.setCircular(true);
                    this.f87204i.setImageDrawable(create);
                }
            });
        }

        public Companion() {
        }
    }
}
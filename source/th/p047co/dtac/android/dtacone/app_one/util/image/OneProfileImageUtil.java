package th.p047co.dtac.android.dtacone.app_one.util.image;

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
@Metadata(m28851d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\b\u0007\u0018\u0000 \u00032\u00020\u0001:\u0001\u0003B\u0005¢\u0006\u0002\u0010\u0002¨\u0006\u0004"}, m28850d2 = {"Lth/co/dtac/android/dtacone/app_one/util/image/OneProfileImageUtil;", "", "()V", "Companion", "app_prodRelease"}, m28849k = 1, m28848mv = {1, 8, 0}, m28846xi = 48)
/* renamed from: th.co.dtac.android.dtacone.app_one.util.image.OneProfileImageUtil */
/* loaded from: classes7.dex */
public final class OneProfileImageUtil {
    public static final int $stable = 0;
    @NotNull
    public static final Companion Companion = new Companion(null);

    @Metadata(m28851d1 = {"\u0000,\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\u0002\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0000\b\u0086\u0003\u0018\u00002\u00020\u0001B\u0007\b\u0002¢\u0006\u0002\u0010\u0002J(\u0010\u0003\u001a\u00020\u00042\u0006\u0010\u0005\u001a\u00020\u00062\u0006\u0010\u0007\u001a\u00020\b2\u0006\u0010\t\u001a\u00020\n2\b\b\u0002\u0010\u000b\u001a\u00020\u0006J(\u0010\f\u001a\u00020\u00042\u0006\u0010\r\u001a\u00020\u000e2\u0006\u0010\u0007\u001a\u00020\b2\u0006\u0010\t\u001a\u00020\n2\b\b\u0002\u0010\u000b\u001a\u00020\u0006¨\u0006\u000f"}, m28850d2 = {"Lth/co/dtac/android/dtacone/app_one/util/image/OneProfileImageUtil$Companion;", "", "()V", "loadProfileDefaultImage", "", "id", "", CoreConstants.CONTEXT_SCOPE_VALUE, "Landroid/content/Context;", "imageView", "Landroid/widget/ImageView;", "defaultImage", "loadProfileImage", ImagesContract.URL, "", "app_prodRelease"}, m28849k = 1, m28848mv = {1, 8, 0}, m28846xi = 48)
    /* renamed from: th.co.dtac.android.dtacone.app_one.util.image.OneProfileImageUtil$Companion */
    /* loaded from: classes7.dex */
    public static final class Companion {
        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        public static /* synthetic */ void loadProfileDefaultImage$default(Companion companion, int i, Context context, ImageView imageView, int i2, int i3, Object obj) {
            if ((i3 & 8) != 0) {
                i2 = R.drawable.image_profile_default;
            }
            companion.loadProfileDefaultImage(i, context, imageView, i2);
        }

        public static /* synthetic */ void loadProfileImage$default(Companion companion, String str, Context context, ImageView imageView, int i, int i2, Object obj) {
            if ((i2 & 8) != 0) {
                i = R.drawable.image_profile_default;
            }
            companion.loadProfileImage(str, context, imageView, i);
        }

        public final void loadProfileDefaultImage(int i, @NotNull Context context, @NotNull ImageView imageView, int i2) {
            Intrinsics.checkNotNullParameter(context, "context");
            Intrinsics.checkNotNullParameter(imageView, "imageView");
            Glide.with(context).asBitmap().m74034load(Integer.valueOf(i)).fitCenter().error(i2).into((RequestBuilder) new BitmapImageViewTarget(imageView, context) { // from class: th.co.dtac.android.dtacone.app_one.util.image.OneProfileImageUtil$Companion$loadProfileDefaultImage$1

                /* renamed from: i */
                public final /* synthetic */ ImageView f82395i;

                /* renamed from: j */
                public final /* synthetic */ Context f82396j;

                /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                {
                    super(imageView);
                    this.f82395i = imageView;
                    this.f82396j = context;
                }

                /* JADX WARN: Can't rename method to resolve collision */
                @Override // com.bumptech.glide.request.target.BitmapImageViewTarget, com.bumptech.glide.request.target.ImageViewTarget
                public void setResource(@Nullable Bitmap bitmap) {
                    RoundedBitmapDrawable create = RoundedBitmapDrawableFactory.create(this.f82396j.getResources(), bitmap);
                    Intrinsics.checkNotNullExpressionValue(create, "create(context.resources, resource)");
                    create.setCircular(true);
                    this.f82395i.setImageDrawable(create);
                }
            });
        }

        public final void loadProfileImage(@NotNull String url, @NotNull Context context, @NotNull ImageView imageView, int i) {
            Intrinsics.checkNotNullParameter(url, "url");
            Intrinsics.checkNotNullParameter(context, "context");
            Intrinsics.checkNotNullParameter(imageView, "imageView");
            Glide.with(context).asBitmap().m74036load(url).fitCenter().error(i).into((RequestBuilder) new BitmapImageViewTarget(imageView, context) { // from class: th.co.dtac.android.dtacone.app_one.util.image.OneProfileImageUtil$Companion$loadProfileImage$1

                /* renamed from: i */
                public final /* synthetic */ ImageView f82397i;

                /* renamed from: j */
                public final /* synthetic */ Context f82398j;

                /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                {
                    super(imageView);
                    this.f82397i = imageView;
                    this.f82398j = context;
                }

                /* JADX WARN: Can't rename method to resolve collision */
                @Override // com.bumptech.glide.request.target.BitmapImageViewTarget, com.bumptech.glide.request.target.ImageViewTarget
                public void setResource(@Nullable Bitmap bitmap) {
                    RoundedBitmapDrawable create = RoundedBitmapDrawableFactory.create(this.f82398j.getResources(), bitmap);
                    Intrinsics.checkNotNullExpressionValue(create, "create(context.resources, resource)");
                    create.setCircular(true);
                    this.f82397i.setImageDrawable(create);
                }
            });
        }

        public Companion() {
        }
    }
}
